package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class keyhash_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.keyhash_utilities";
    public static final String myFingerPrint = "81ae9191020e13becc33a7fca423dc8f007c3c733f4c69ef0b2332dc4f6678aa";
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 2425L)
    private static SubLSymbol $intersection_table$;
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 2560L)
    private static SubLSymbol $intersection_table_lock$;
    private static final SubLSymbol $sym0$KEYHASH_P;
    private static final SubLSymbol $kw1$AREA;
    private static final SubLSymbol $sym2$HASH_TABLE_P;
    private static final SubLInteger $int3$500;
    private static final SubLString $str4$Intersection_table_Lock;
    private static final SubLSymbol $sym5$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym6$LISTP;
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 758L)
    public static SubLObject keyhash_element_list(final SubLObject v_keyhash) {
        assert keyhash_utilities.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        SubLObject result = (SubLObject)keyhash_utilities.NIL;
        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(v_keyhash);
        SubLObject key = (SubLObject)keyhash_utilities.NIL;
        SubLObject the_value = (SubLObject)keyhash_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                the_value = Hashtables.getEntryValue(cdohash_entry);
                result = (SubLObject)ConsesLow.cons(key, result);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 989L)
    public static SubLObject keyhash_list_elements(final SubLObject list, SubLObject testfn, SubLObject size) {
        if (testfn == keyhash_utilities.UNPROVIDED) {
            testfn = (SubLObject)keyhash_utilities.NIL;
        }
        if (size == keyhash_utilities.UNPROVIDED) {
            size = Sequences.length(list);
        }
        final SubLObject v_keyhash = keyhash.new_keyhash(size, testfn);
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)keyhash_utilities.NIL;
        elem = cdolist_list_var.first();
        while (keyhash_utilities.NIL != cdolist_list_var) {
            keyhash.setkeyhash(elem, v_keyhash);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return v_keyhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 1326L)
    public static SubLObject keyhash_rebuild(final SubLObject v_keyhash) {
        assert keyhash_utilities.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        final SubLObject element_list = keyhash_element_list(v_keyhash);
        keyhash.clrkeyhash(v_keyhash);
        SubLObject cdolist_list_var = element_list;
        SubLObject elem = (SubLObject)keyhash_utilities.NIL;
        elem = cdolist_list_var.first();
        while (keyhash_utilities.NIL != cdolist_list_var) {
            keyhash.setkeyhash(elem, v_keyhash);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return v_keyhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 1596L)
    public static SubLObject keyhash_to_hashtable(final SubLObject v_keyhash, SubLObject value, SubLObject area) {
        if (value == keyhash_utilities.UNPROVIDED) {
            value = (SubLObject)keyhash_utilities.T;
        }
        if (area == keyhash_utilities.UNPROVIDED) {
            area = (SubLObject)keyhash_utilities.NIL;
        }
        assert keyhash_utilities.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        final SubLObject size = keyhash.keyhash_count(v_keyhash);
        final SubLObject test = keyhash.keyhash_test(v_keyhash);
        final SubLObject table = Hashtables.make_hash_table(size, test, (SubLObject)ConsesLow.list((SubLObject)keyhash_utilities.$kw1$AREA, area));
        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(v_keyhash);
        SubLObject key = (SubLObject)keyhash_utilities.NIL;
        SubLObject the_value = (SubLObject)keyhash_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                the_value = Hashtables.getEntryValue(cdohash_entry);
                Hashtables.sethash(key, table, value);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 2029L)
    public static SubLObject hashtable_to_keyhash(final SubLObject hash_table) {
        assert keyhash_utilities.NIL != Types.hash_table_p(hash_table) : hash_table;
        final SubLObject size = Hashtables.hash_table_count(hash_table);
        final SubLObject test = Hashtables.hash_table_test(hash_table);
        final SubLObject v_keyhash = keyhash.new_keyhash(size, test);
        SubLObject key = (SubLObject)keyhash_utilities.NIL;
        SubLObject value = (SubLObject)keyhash_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                keyhash.setkeyhash(key, v_keyhash);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return v_keyhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 2709L)
    public static SubLObject fast_intersection(final SubLObject list_1, final SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == keyhash_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)keyhash_utilities.EQUAL);
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = (SubLObject)keyhash_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert keyhash_utilities.NIL != Types.function_spec_p(test) : test;
        if (keyhash_utilities.NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)keyhash_utilities.UNPROVIDED) || keyhash_utilities.NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)keyhash_utilities.UNPROVIDED)) {
            return conses_high.intersection(list_1, list_2, test, key);
        }
        if (keyhash_utilities.NIL != v_keyhash) {
            return hash_intersection(list_1, list_2, v_keyhash, key);
        }
        if (keyhash_utilities.NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_intersection(list_1, list_2, keyhash_utilities.$intersection_table$.getDynamicValue(thread), key);
        }
        return conses_high.intersection(list_1, list_2, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 3309L)
    public static SubLObject fast_union(final SubLObject list_1, final SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == keyhash_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)keyhash_utilities.EQUAL);
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = (SubLObject)keyhash_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert keyhash_utilities.NIL != Types.function_spec_p(test) : test;
        if (keyhash_utilities.NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)keyhash_utilities.UNPROVIDED) && keyhash_utilities.NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)keyhash_utilities.UNPROVIDED)) {
            return conses_high.union(list_1, list_2, test, key);
        }
        if (keyhash_utilities.NIL != v_keyhash) {
            return hash_union(list_1, list_2, v_keyhash, key);
        }
        if (keyhash_utilities.NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_union(list_1, list_2, keyhash_utilities.$intersection_table$.getDynamicValue(thread), key);
        }
        return conses_high.union(list_1, list_2, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 3876L)
    public static SubLObject intersect_forts(final SubLObject forts_1, final SubLObject forts_2) {
        return fast_intersection(forts_1, forts_2, (SubLObject)keyhash_utilities.UNPROVIDED, (SubLObject)keyhash_utilities.UNPROVIDED, (SubLObject)keyhash_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 4051L)
    public static SubLObject hash_intersection(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = keyhash_utilities.$intersection_table$.getDynamicValue();
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_keyhash.eql(keyhash_utilities.$intersection_table$.getDynamicValue(thread))) {
            SubLObject result = (SubLObject)keyhash_utilities.NIL;
            SubLObject release = (SubLObject)keyhash_utilities.NIL;
            try {
                release = Locks.seize_lock(keyhash_utilities.$intersection_table_lock$.getDynamicValue(thread));
                result = hash_intersection_int(list_1, list_2, v_keyhash, key);
            }
            finally {
                if (keyhash_utilities.NIL != release) {
                    Locks.release_lock(keyhash_utilities.$intersection_table_lock$.getDynamicValue(thread));
                }
            }
            return result;
        }
        return hash_intersection_int(list_1, list_2, v_keyhash, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 4480L)
    public static SubLObject hash_intersection_int(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = keyhash_utilities.$intersection_table$.getDynamicValue();
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        assert keyhash_utilities.NIL != Types.listp(list_1) : list_1;
        assert keyhash_utilities.NIL != Types.listp(list_2) : list_2;
        assert keyhash_utilities.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        if (list_1.eql(list_2)) {
            return list_1;
        }
        SubLObject result = (SubLObject)keyhash_utilities.NIL;
        keyhash.clrkeyhash(v_keyhash);
        if (key.eql(Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY)) || key == keyhash_utilities.IDENTITY) {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                keyhash.setkeyhash(item, v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            cdolist_list_var = list_2;
            item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                if (keyhash_utilities.NIL != keyhash.getkeyhash(item, v_keyhash)) {
                    result = (SubLObject)ConsesLow.cons(item, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                keyhash.setkeyhash(Functions.funcall(key, item), v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            cdolist_list_var = list_2;
            item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                if (keyhash_utilities.NIL != keyhash.getkeyhash(Functions.funcall(key, item), v_keyhash)) {
                    result = (SubLObject)ConsesLow.cons(item, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 5205L)
    public static SubLObject hash_union(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = keyhash_utilities.$intersection_table$.getDynamicValue();
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_keyhash.eql(keyhash_utilities.$intersection_table$.getDynamicValue(thread))) {
            SubLObject result = (SubLObject)keyhash_utilities.NIL;
            SubLObject release = (SubLObject)keyhash_utilities.NIL;
            try {
                release = Locks.seize_lock(keyhash_utilities.$intersection_table_lock$.getDynamicValue(thread));
                result = hash_union_int(list_1, list_2, v_keyhash, key);
            }
            finally {
                if (keyhash_utilities.NIL != release) {
                    Locks.release_lock(keyhash_utilities.$intersection_table_lock$.getDynamicValue(thread));
                }
            }
            return result;
        }
        return hash_union_int(list_1, list_2, v_keyhash, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 5555L)
    public static SubLObject hash_union_int(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = keyhash_utilities.$intersection_table$.getDynamicValue();
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        assert keyhash_utilities.NIL != Types.listp(list_1) : list_1;
        assert keyhash_utilities.NIL != Types.listp(list_2) : list_2;
        assert keyhash_utilities.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        if (list_1.eql(list_2)) {
            return list_1;
        }
        SubLObject result = (SubLObject)keyhash_utilities.NIL;
        keyhash.clrkeyhash(v_keyhash);
        if (key.eql(Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY)) || key == keyhash_utilities.IDENTITY) {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                if (keyhash_utilities.NIL == keyhash.getkeyhash(item, v_keyhash)) {
                    result = (SubLObject)ConsesLow.cons(item, result);
                    keyhash.setkeyhash(item, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            cdolist_list_var = list_2;
            item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                if (keyhash_utilities.NIL == keyhash.getkeyhash(item, v_keyhash)) {
                    result = (SubLObject)ConsesLow.cons(item, result);
                    keyhash.setkeyhash(item, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                final SubLObject value = Functions.funcall(key, item);
                if (keyhash_utilities.NIL == keyhash.getkeyhash(value, v_keyhash)) {
                    result = (SubLObject)ConsesLow.cons(item, result);
                    keyhash.setkeyhash(value, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            cdolist_list_var = list_2;
            item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                final SubLObject value = Functions.funcall(key, item);
                if (keyhash_utilities.NIL == keyhash.getkeyhash(value, v_keyhash)) {
                    result = (SubLObject)ConsesLow.cons(item, result);
                    keyhash.setkeyhash(value, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 6545L)
    public static SubLObject fast_intersectP(final SubLObject list_1, final SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == keyhash_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)keyhash_utilities.EQUAL);
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = (SubLObject)keyhash_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert keyhash_utilities.NIL != Types.function_spec_p(test) : test;
        if (keyhash_utilities.NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)keyhash_utilities.UNPROVIDED)) {
            return list_utilities.intersectP(list_1, list_2, test, key);
        }
        if (keyhash_utilities.NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)keyhash_utilities.UNPROVIDED)) {
            return list_utilities.intersectP(list_1, list_2, test, key);
        }
        if (keyhash_utilities.NIL != v_keyhash) {
            return hash_intersectP(list_1, list_2, v_keyhash, key);
        }
        if (keyhash_utilities.NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_intersectP(list_1, list_2, keyhash_utilities.$intersection_table$.getDynamicValue(thread), key);
        }
        return list_utilities.intersectP(list_1, list_2, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 7316L)
    public static SubLObject hash_intersectP(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = keyhash_utilities.$intersection_table$.getDynamicValue();
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_keyhash.eql(keyhash_utilities.$intersection_table$.getDynamicValue(thread))) {
            SubLObject result = (SubLObject)keyhash_utilities.NIL;
            SubLObject release = (SubLObject)keyhash_utilities.NIL;
            try {
                release = Locks.seize_lock(keyhash_utilities.$intersection_table_lock$.getDynamicValue(thread));
                result = hash_intersect_intP(list_1, list_2, v_keyhash, key);
            }
            finally {
                if (keyhash_utilities.NIL != release) {
                    Locks.release_lock(keyhash_utilities.$intersection_table_lock$.getDynamicValue(thread));
                }
            }
            return result;
        }
        return hash_intersect_intP(list_1, list_2, v_keyhash, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/keyhash-utilities.lisp", position = 7779L)
    public static SubLObject hash_intersect_intP(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == keyhash_utilities.UNPROVIDED) {
            v_keyhash = keyhash_utilities.$intersection_table$.getDynamicValue();
        }
        if (key == keyhash_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY);
        }
        assert keyhash_utilities.NIL != Types.listp(list_1) : list_1;
        assert keyhash_utilities.NIL != Types.listp(list_2) : list_2;
        assert keyhash_utilities.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        if (list_1.eql(list_2)) {
            return (SubLObject)keyhash_utilities.T;
        }
        final SubLObject list_1_longerP = list_utilities.greater_length_p(list_1, list_2);
        final SubLObject short_list = (keyhash_utilities.NIL != list_1_longerP) ? list_2 : list_1;
        final SubLObject long_list = (keyhash_utilities.NIL != list_1_longerP) ? list_1 : list_2;
        keyhash.clrkeyhash(v_keyhash);
        if (key.eql(Symbols.symbol_function((SubLObject)keyhash_utilities.IDENTITY)) || key == keyhash_utilities.IDENTITY) {
            SubLObject cdolist_list_var = short_list;
            SubLObject item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                keyhash.setkeyhash(item, v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            cdolist_list_var = long_list;
            item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                if (keyhash_utilities.NIL != keyhash.getkeyhash(item, v_keyhash)) {
                    return (SubLObject)keyhash_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = short_list;
            SubLObject item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                keyhash.setkeyhash(Functions.funcall(key, item), v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            cdolist_list_var = long_list;
            item = (SubLObject)keyhash_utilities.NIL;
            item = cdolist_list_var.first();
            while (keyhash_utilities.NIL != cdolist_list_var) {
                if (keyhash_utilities.NIL != keyhash.getkeyhash(Functions.funcall(key, item), v_keyhash)) {
                    return (SubLObject)keyhash_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return (SubLObject)keyhash_utilities.NIL;
    }
    
    public static SubLObject declare_keyhash_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "keyhash_element_list", "KEYHASH-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "keyhash_list_elements", "KEYHASH-LIST-ELEMENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "keyhash_rebuild", "KEYHASH-REBUILD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "keyhash_to_hashtable", "KEYHASH-TO-HASHTABLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hashtable_to_keyhash", "HASHTABLE-TO-KEYHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "fast_intersection", "FAST-INTERSECTION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "fast_union", "FAST-UNION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "intersect_forts", "INTERSECT-FORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hash_intersection", "HASH-INTERSECTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hash_intersection_int", "HASH-INTERSECTION-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hash_union", "HASH-UNION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hash_union_int", "HASH-UNION-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "fast_intersectP", "FAST-INTERSECT?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hash_intersectP", "HASH-INTERSECT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.keyhash_utilities", "hash_intersect_intP", "HASH-INTERSECT-INT?", 2, 2, false);
        return (SubLObject)keyhash_utilities.NIL;
    }
    
    public static SubLObject init_keyhash_utilities_file() {
        keyhash_utilities.$intersection_table$ = SubLFiles.defparameter("*INTERSECTION-TABLE*", keyhash.new_keyhash((SubLObject)keyhash_utilities.$int3$500, Symbols.symbol_function((SubLObject)keyhash_utilities.EQUAL)));
        keyhash_utilities.$intersection_table_lock$ = SubLFiles.defparameter("*INTERSECTION-TABLE-LOCK*", Locks.make_lock((SubLObject)keyhash_utilities.$str4$Intersection_table_Lock));
        return (SubLObject)keyhash_utilities.NIL;
    }
    
    public static SubLObject setup_keyhash_utilities_file() {
        return (SubLObject)keyhash_utilities.NIL;
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
        me = (SubLFile)new keyhash_utilities();
        keyhash_utilities.$intersection_table$ = null;
        keyhash_utilities.$intersection_table_lock$ = null;
        $sym0$KEYHASH_P = SubLObjectFactory.makeSymbol("KEYHASH-P");
        $kw1$AREA = SubLObjectFactory.makeKeyword("AREA");
        $sym2$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $int3$500 = SubLObjectFactory.makeInteger(500);
        $str4$Intersection_table_Lock = SubLObjectFactory.makeString("Intersection table Lock");
        $sym5$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym6$LISTP = SubLObjectFactory.makeSymbol("LISTP");
    }
}

/*

	Total time: 173 ms
	
*/