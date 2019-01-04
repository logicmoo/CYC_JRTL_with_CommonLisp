package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class map_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.map_utilities";
    public static final String myFingerPrint = "6d12d99b3731176f6de0cfb2605867dc3df78230735b55359a9fbbb0ee04fffb";
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 8791L)
    private static SubLSymbol $map_missing_key_token$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 19992L)
    public static SubLSymbol $is_map_object_p_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20342L)
    public static SubLSymbol $map_object_size_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20706L)
    public static SubLSymbol $map_object_test_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21065L)
    public static SubLSymbol $map_object_put_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21584L)
    public static SubLSymbol $map_object_put_unless_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 22407L)
    public static SubLSymbol $map_object_get_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23021L)
    public static SubLSymbol $map_object_get_without_values_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23690L)
    public static SubLSymbol $map_object_remove_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24092L)
    public static SubLSymbol $map_object_touch_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24366L)
    public static SubLSymbol $map_object_change_set_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24703L)
    public static SubLSymbol $new_map_object_with_same_properties_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25232L)
    public static SubLSymbol $map_object_arbitrary_key_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25661L)
    public static SubLSymbol $new_map_key_iterator_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25956L)
    public static SubLSymbol $new_map_object_iterator_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28103L)
    public static SubLSymbol $map_object_remove_all_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28485L)
    public static SubLSymbol $map_object_keys_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29160L)
    public static SubLSymbol $map_object_key_set_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29543L)
    public static SubLSymbol $map_object_values_method_table$;
    private static final SubLSymbol $sym0$BOOLEAN;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $kw5$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym6$VAR;
    private static final SubLSymbol $sym7$ITERATOR;
    private static final SubLSymbol $sym8$CLET;
    private static final SubLSymbol $sym9$NEW_MAP_ITERATOR;
    private static final SubLSymbol $sym10$DO_ITERATOR;
    private static final SubLSymbol $sym11$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym12$THE_MAP;
    private static final SubLSymbol $sym13$MESS;
    private static final SubLSymbol $sym14$SOFAR;
    private static final SubLSymbol $sym15$TOTAL;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$MAP_SIZE;
    private static final SubLSymbol $sym18$CHECK_TYPE;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym21$DO_MAP;
    private static final SubLSymbol $sym22$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym23$CINC;
    private static final SubLSymbol $sym24$CSOME;
    private static final SubLSymbol $sym25$MAP_KEYS;
    private static final SubLSymbol $sym26$MAP_GET_WITHOUT_VALUES;
    private static final SubLSymbol $sym27$PROGRESS_CSOME;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$ITERATOR;
    private static final SubLSymbol $sym30$NEW_MAP_KEY_ITERATOR;
    private static final SubLSymbol $sym31$THE_MAP;
    private static final SubLSymbol $sym32$MESS;
    private static final SubLSymbol $sym33$SOFAR;
    private static final SubLSymbol $sym34$TOTAL;
    private static final SubLSymbol $sym35$DO_MAP_KEYS;
    private static final SubLList $list36;
    private static final SubLString $str37$MISSING;
    private static final SubLSymbol $sym38$MAP_P;
    private static final SubLString $str39$Invalid_map_format__Attempting_to;
    private static final SubLString $str40$Corrupted_map__attempting_to_remo;
    private static final SubLSymbol $sym41$FALSE;
    private static final SubLInteger $int42$100;
    private static final SubLString $str43$Error__percentage__A_is_not_one_o;
    private static final SubLString $str44$Cannot_compute_key_differences_in;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLInteger $int47$256;
    private static final SubLSymbol $sym48$IS_MAP_OBJECT_P_DICTIONARY_METHOD;
    private static final SubLSymbol $sym49$IS_MAP_OBJECT_P_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym50$IS_MAP_OBJECT_P_SET_METHOD;
    private static final SubLString $str51$_A_is_not_a_MAP_P_;
    private static final SubLSymbol $sym52$MAP_OBJECT_SIZE_DICTIONARY_METHOD;
    private static final SubLSymbol $sym53$MAP_OBJECT_SIZE_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym54$MAP_OBJECT_SIZE_SET_METHOD;
    private static final SubLSymbol $sym55$MAP_OBJECT_TEST_DICTIONARY_METHOD;
    private static final SubLSymbol $sym56$MAP_OBJECT_TEST_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym57$MAP_OBJECT_TEST_SET_METHOD;
    private static final SubLSymbol $sym58$MAP_OBJECT_PUT_DICTIONARY_METHOD;
    private static final SubLSymbol $sym59$MAP_OBJECT_PUT_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym60$MAP_OBJECT_PUT_SET_METHOD;
    private static final SubLSymbol $kw61$NOT_SET;
    private static final SubLSymbol $sym62$MAP_OBJECT_PUT_UNLESS_DICTIONARY_METHOD;
    private static final SubLSymbol $sym63$MAP_OBJECT_PUT_UNLESS_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym64$MAP_OBJECT_PUT_UNLESS_SET_METHOD;
    private static final SubLSymbol $sym65$MAP_OBJECT_GET_DICTIONARY_METHOD;
    private static final SubLSymbol $sym66$MAP_OBJECT_GET_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym67$MAP_OBJECT_GET_SET_METHOD;
    private static final SubLSymbol $sym68$MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD;
    private static final SubLSymbol $sym69$MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym70$MAP_OBJECT_GET_WITHOUT_VALUES_SET_METHOD;
    private static final SubLSymbol $sym71$MAP_OBJECT_REMOVE_DICTIONARY_METHOD;
    private static final SubLSymbol $sym72$MAP_OBJECT_REMOVE_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym73$MAP_OBJECT_REMOVE_SET_METHOD;
    private static final SubLSymbol $sym74$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD;
    private static final SubLSymbol $sym75$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym76$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SET_METHOD;
    private static final SubLSymbol $sym77$MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD;
    private static final SubLSymbol $sym78$MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym79$MAP_OBJECT_ARBITRARY_KEY_SET_METHOD;
    private static final SubLSymbol $sym80$FIRST;
    private static final SubLSymbol $sym81$NEW_MAP_KEY_ITERATOR_SET_METHOD;
    private static final SubLSymbol $sym82$NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD;
    private static final SubLSymbol $sym83$NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym84$NEW_MAP_OBJECT_ITERATOR_SET_METHOD;
    private static final SubLSymbol $sym85$SET_P;
    private static final SubLSymbol $sym86$ITERATOR_SET_QUA_MAP_DONE;
    private static final SubLSymbol $sym87$ITERATOR_SET_QUA_MAP_NEXT;
    private static final SubLSymbol $sym88$ITERATOR_SET_QUA_MAP_FINALIZE;
    private static final SubLSymbol $kw89$KEY;
    private static final SubLSymbol $kw90$VALUE;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$UNINITIALIZED;
    private static final SubLSymbol $kw94$INVALID;
    private static final SubLSymbol $sym95$MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD;
    private static final SubLSymbol $sym96$MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym97$MAP_OBJECT_REMOVE_ALL_SET_METHOD;
    private static final SubLSymbol $sym98$MAP_OBJECT_KEYS_DICTIONARY_METHOD;
    private static final SubLSymbol $sym99$MAP_OBJECT_KEYS_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym100$MAP_OBJECT_KEYS_SET_METHOD;
    private static final SubLSymbol $sym101$MAP_OBJECT_KEY_SET_SET_METHOD;
    private static final SubLSymbol $sym102$MAP_OBJECT_VALUES_DICTIONARY_METHOD;
    private static final SubLSymbol $sym103$MAP_OBJECT_VALUES_HASH_TABLE_METHOD;
    private static final SubLSymbol $sym104$MAP_OBJECT_VALUES_SET_METHOD;
    private static final SubLSymbol $sym105$TEST_HASH_TABLE_KEY_CONFLATION;
    private static final SubLSymbol $kw106$TEST;
    private static final SubLSymbol $kw107$OWNER;
    private static final SubLSymbol $kw108$CLASSES;
    private static final SubLSymbol $kw109$KB;
    private static final SubLSymbol $kw110$TINY;
    private static final SubLSymbol $kw111$WORKING_;
    private static final SubLList $list112;
    private static final SubLSymbol $kw113$PRESENT;
    private static final SubLString $str114$Expected__A_entries__but_got__A_;
    private static final SubLSymbol $kw115$SUCCESS;
    private static final SubLSymbol $sym116$TEST_DO_MAP_OVER_SET_INTEGRITY;
    private static final SubLList $list117;
    private static final SubLString $str118$Expected__S_and__S_to_be_identica;
    private static final SubLString $str119$Expected__A_items__but_got__A_;
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 2501L)
    public static SubLObject map_p(final SubLObject v_object) {
        return is_map_object_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 2622L)
    public static SubLObject map_size(final SubLObject map) {
        return map_object_size(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 2685L)
    public static SubLObject map_test(final SubLObject map) {
        return map_object_test(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 2748L)
    public static SubLObject map_empty_p(final SubLObject map) {
        return Numbers.zerop(map_size(map));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 2815L)
    public static SubLObject map_test_symbol(final SubLObject map) {
        return hash_table_utilities.hash_test_to_symbol(map_test(map));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 2900L)
    public static SubLObject map_put(final SubLObject map, final SubLObject key, final SubLObject value) {
        return map_object_put(map, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3033L)
    public static SubLObject map_put_unless(final SubLObject map, final SubLObject key, final SubLObject value, SubLObject test_func) {
        if (test_func == map_utilities.UNPROVIDED) {
            test_func = (SubLObject)map_utilities.$sym0$BOOLEAN;
        }
        return map_object_put_unless(map, key, value, test_func);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3358L)
    public static SubLObject map_get(final SubLObject map, final SubLObject key, SubLObject not_found) {
        if (not_found == map_utilities.UNPROVIDED) {
            not_found = (SubLObject)map_utilities.NIL;
        }
        return map_object_get(map, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3456L)
    public static SubLObject map_get_without_values(final SubLObject map, final SubLObject key, SubLObject not_found) {
        if (not_found == map_utilities.UNPROVIDED) {
            not_found = (SubLObject)map_utilities.NIL;
        }
        return map_object_get_without_values(map, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3585L)
    public static SubLObject map_remove(final SubLObject map, final SubLObject key) {
        return map_object_remove(map, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3660L)
    public static SubLObject map_remove_all(final SubLObject map) {
        return map_object_remove_all(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3735L)
    public static SubLObject map_touch(final SubLObject map, final SubLObject key) {
        return map_object_touch(map, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 3808L)
    public static SubLObject map_change_set(final SubLObject map, SubLObject unchanged) {
        if (unchanged == map_utilities.UNPROVIDED) {
            unchanged = (SubLObject)map_utilities.NIL;
        }
        return map_object_change_set(map, unchanged);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 4267L)
    public static SubLObject new_map_iterator(final SubLObject map) {
        return new_map_object_iterator(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 4395L)
    public static SubLObject do_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)map_utilities.NIL;
        SubLObject value = (SubLObject)map_utilities.NIL;
        SubLObject map = (SubLObject)map_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)map_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)map_utilities.NIL;
        SubLObject current_$1 = (SubLObject)map_utilities.NIL;
        while (map_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)map_utilities.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)map_utilities.$list1);
            if (map_utilities.NIL == conses_high.member(current_$1, (SubLObject)map_utilities.$list2, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED)) {
                bad = (SubLObject)map_utilities.T;
            }
            if (current_$1 == map_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (map_utilities.NIL != bad && map_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list1);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)map_utilities.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((map_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : map_utilities.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)map_utilities.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((map_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : map_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (map_utilities.NIL == progress_message) {
            final SubLObject var = (SubLObject)map_utilities.$sym6$VAR;
            final SubLObject iterator = (SubLObject)map_utilities.$sym7$ITERATOR;
            return (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym9$NEW_MAP_ITERATOR, map))), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym10$DO_ITERATOR, (SubLObject)ConsesLow.list(var, iterator, (SubLObject)map_utilities.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym11$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(key, value), var, ConsesLow.append(body, (SubLObject)map_utilities.NIL))));
        }
        final SubLObject the_map = (SubLObject)map_utilities.$sym12$THE_MAP;
        final SubLObject mess = (SubLObject)map_utilities.$sym13$MESS;
        final SubLObject sofar = (SubLObject)map_utilities.$sym14$SOFAR;
        final SubLObject total = (SubLObject)map_utilities.$sym15$TOTAL;
        return (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(the_map, map), (SubLObject)ConsesLow.list(mess, progress_message), reader.bq_cons(sofar, (SubLObject)map_utilities.$list16), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym17$MAP_SIZE, the_map))), (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym18$CHECK_TYPE, mess, (SubLObject)map_utilities.$list19), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym20$NOTING_PERCENT_PROGRESS, mess, (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym21$DO_MAP, (SubLObject)ConsesLow.list(key, value, the_map, (SubLObject)map_utilities.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym22$NOTE_PERCENT_PROGRESS, sofar, total), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym23$CINC, sofar), ConsesLow.append(body, (SubLObject)map_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 5409L)
    public static SubLObject do_map_via_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)map_utilities.NIL;
        SubLObject value = (SubLObject)map_utilities.NIL;
        SubLObject map = (SubLObject)map_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list1);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)map_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)map_utilities.NIL;
        SubLObject current_$2 = (SubLObject)map_utilities.NIL;
        while (map_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)map_utilities.$list1);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)map_utilities.$list1);
            if (map_utilities.NIL == conses_high.member(current_$2, (SubLObject)map_utilities.$list2, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED)) {
                bad = (SubLObject)map_utilities.T;
            }
            if (current_$2 == map_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (map_utilities.NIL != bad && map_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list1);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)map_utilities.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((map_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : map_utilities.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)map_utilities.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((map_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : map_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (map_utilities.NIL == progress_message) {
            return (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym24$CSOME, (SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym25$MAP_KEYS, map), done), (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym26$MAP_GET_WITHOUT_VALUES, map, key))), ConsesLow.append(body, (SubLObject)map_utilities.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym27$PROGRESS_CSOME, (SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym25$MAP_KEYS, map), progress_message, done), (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym26$MAP_GET_WITHOUT_VALUES, map, key))), ConsesLow.append(body, (SubLObject)map_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 6014L)
    public static SubLObject do_map_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = (SubLObject)map_utilities.NIL;
        SubLObject map = (SubLObject)map_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list28);
        key_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list28);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)map_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)map_utilities.NIL;
        SubLObject current_$3 = (SubLObject)map_utilities.NIL;
        while (map_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)map_utilities.$list28);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)map_utilities.$list28);
            if (map_utilities.NIL == conses_high.member(current_$3, (SubLObject)map_utilities.$list2, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED)) {
                bad = (SubLObject)map_utilities.T;
            }
            if (current_$3 == map_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (map_utilities.NIL != bad && map_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list28);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)map_utilities.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((map_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : map_utilities.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)map_utilities.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((map_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : map_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (map_utilities.NIL == progress_message) {
            final SubLObject iterator = (SubLObject)map_utilities.$sym29$ITERATOR;
            return (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym30$NEW_MAP_KEY_ITERATOR, map))), (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym10$DO_ITERATOR, (SubLObject)ConsesLow.list(key_var, iterator, (SubLObject)map_utilities.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)map_utilities.NIL)));
        }
        final SubLObject the_map = (SubLObject)map_utilities.$sym31$THE_MAP;
        final SubLObject mess = (SubLObject)map_utilities.$sym32$MESS;
        final SubLObject sofar = (SubLObject)map_utilities.$sym33$SOFAR;
        final SubLObject total = (SubLObject)map_utilities.$sym34$TOTAL;
        return (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(the_map, map), (SubLObject)ConsesLow.list(mess, progress_message), reader.bq_cons(sofar, (SubLObject)map_utilities.$list16), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym17$MAP_SIZE, the_map))), (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym18$CHECK_TYPE, mess, (SubLObject)map_utilities.$list19), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym20$NOTING_PERCENT_PROGRESS, mess, (SubLObject)ConsesLow.listS((SubLObject)map_utilities.$sym35$DO_MAP_KEYS, (SubLObject)ConsesLow.list(key_var, the_map, (SubLObject)map_utilities.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym22$NOTE_PERCENT_PROGRESS, sofar, total), (SubLObject)ConsesLow.list((SubLObject)map_utilities.$sym23$CINC, sofar), ConsesLow.append(body, (SubLObject)map_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 6867L)
    public static SubLObject new_map_with_same_properties(final SubLObject old_map) {
        final SubLObject test = map_test(old_map);
        final SubLObject size = map_size(old_map);
        return new_map_object_with_same_properties(old_map, test, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 7266L)
    public static SubLObject clone_map(final SubLObject old_map, SubLObject copy_contentsP) {
        if (copy_contentsP == map_utilities.UNPROVIDED) {
            copy_contentsP = (SubLObject)map_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_map = new_map_with_same_properties(old_map);
        if (map_utilities.NIL != copy_contentsP) {
            final SubLObject iterator = new_map_iterator(old_map);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (map_utilities.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)map_utilities.NIL;
                    SubLObject value = (SubLObject)map_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                    value = current.first();
                    current = current.rest();
                    if (map_utilities.NIL == current) {
                        map_put(new_map, key, value);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                    }
                }
            }
        }
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 7764L)
    public static SubLObject map_arbitrary_key(final SubLObject map, SubLObject non_existent_key) {
        if (non_existent_key == map_utilities.UNPROVIDED) {
            non_existent_key = (SubLObject)map_utilities.NIL;
        }
        if (map_utilities.NIL != map_empty_p(map)) {
            return non_existent_key;
        }
        return map_object_arbitrary_key(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 8116L)
    public static SubLObject map_arbitrary_value(final SubLObject map, SubLObject non_existent_value) {
        if (non_existent_value == map_utilities.UNPROVIDED) {
            non_existent_value = (SubLObject)map_utilities.NIL;
        }
        if (map_utilities.NIL != map_empty_p(map)) {
            return non_existent_value;
        }
        return map_get(map, map_arbitrary_key(map, (SubLObject)map_utilities.UNPROVIDED), (SubLObject)map_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 8427L)
    public static SubLObject map_keys(final SubLObject map) {
        if (map_utilities.NIL != map_empty_p(map)) {
            return (SubLObject)map_utilities.NIL;
        }
        return map_object_keys(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 8538L)
    public static SubLObject map_key_set(final SubLObject map) {
        if (map_utilities.NIL != map_empty_p(map)) {
            return set.new_set(map_test(map), (SubLObject)map_utilities.ZERO_INTEGER);
        }
        return map_object_key_set(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 8677L)
    public static SubLObject map_values(final SubLObject map) {
        if (map_utilities.NIL != map_empty_p(map)) {
            return (SubLObject)map_utilities.NIL;
        }
        return map_object_values(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 8918L)
    public static SubLObject map_has_keyP(final SubLObject map, final SubLObject key) {
        assert map_utilities.NIL != map_p(map) : map;
        return (SubLObject)SubLObjectFactory.makeBoolean(!map_utilities.$map_missing_key_token$.getGlobalValue().eql(map_get_without_values(map, key, map_utilities.$map_missing_key_token$.getGlobalValue())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 9138L)
    public static SubLObject map_push(final SubLObject map, final SubLObject key, final SubLObject value) {
        assert map_utilities.NIL != map_p(map) : map;
        SubLObject current_val = map_get_without_values(map, key, (SubLObject)map_utilities.UNPROVIDED);
        if (!current_val.isList()) {
            Errors.error((SubLObject)map_utilities.$str39$Invalid_map_format__Attempting_to, current_val);
        }
        current_val = (SubLObject)ConsesLow.cons(value, current_val);
        return map_put(map, key, current_val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 9598L)
    public static SubLObject map_pushnew(final SubLObject map, final SubLObject key, final SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == map_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)map_utilities.EQL);
        }
        if (key_accessor == map_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)map_utilities.IDENTITY);
        }
        assert map_utilities.NIL != map_p(map) : map;
        SubLObject current_val = map_get_without_values(map, key, (SubLObject)map_utilities.UNPROVIDED);
        if (!current_val.isList()) {
            Errors.error((SubLObject)map_utilities.$str39$Invalid_map_format__Attempting_to, current_val);
        }
        if (map_utilities.NIL == conses_high.member(value, current_val, test, key_accessor)) {
            current_val = (SubLObject)ConsesLow.cons(value, current_val);
        }
        return map_put(map, key, current_val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 10380L)
    public static SubLObject map_remove_from_value(final SubLObject map, final SubLObject key, final SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == map_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)map_utilities.EQL);
        }
        if (key_accessor == map_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)map_utilities.IDENTITY);
        }
        assert map_utilities.NIL != map_p(map) : map;
        SubLObject result = (SubLObject)map_utilities.NIL;
        final SubLObject current_val = map_get_without_values(map, key, (SubLObject)map_utilities.UNPROVIDED);
        if (current_val.isCons()) {
            final SubLObject spot = Sequences.position(value, current_val, test, key_accessor, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED);
            if (map_utilities.NIL != spot) {
                result = ConsesLow.nth(spot, current_val);
                final SubLObject new_value = Sequences.delete(value, current_val, test, key_accessor, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED);
                if (map_utilities.NIL == new_value) {
                    map_remove(map, key);
                }
                else {
                    map_put(map, key, new_value);
                }
            }
        }
        else if (map_utilities.NIL == current_val) {
            result = (SubLObject)map_utilities.NIL;
        }
        else {
            Errors.error((SubLObject)map_utilities.$str40$Corrupted_map__attempting_to_remo, current_val);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 11379L)
    public static SubLObject map_increment(final SubLObject map, final SubLObject key, SubLObject delta) {
        if (delta == map_utilities.UNPROVIDED) {
            delta = (SubLObject)map_utilities.ONE_INTEGER;
        }
        SubLObject value = map_get(map, key, (SubLObject)map_utilities.ZERO_INTEGER);
        if (value.isNumber()) {
            value = Numbers.add(value, delta);
        }
        else {
            value = delta;
        }
        map_put(map, key, value);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 11675L)
    public static SubLObject map_decrement(final SubLObject map, final SubLObject key, SubLObject delta) {
        if (delta == map_utilities.UNPROVIDED) {
            delta = (SubLObject)map_utilities.ONE_INTEGER;
        }
        if (!delta.isNegative()) {
            delta = Numbers.minus(delta);
        }
        return map_increment(map, key, delta);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 11889L)
    public static SubLObject reverse_index_map(final SubLObject map, final SubLObject ri_map, SubLObject collate_duplicatesP, SubLObject unpack_listsP) {
        if (collate_duplicatesP == map_utilities.UNPROVIDED) {
            collate_duplicatesP = (SubLObject)map_utilities.NIL;
        }
        if (unpack_listsP == map_utilities.UNPROVIDED) {
            unpack_listsP = (SubLObject)map_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    if (map_utilities.NIL != unpack_listsP && value.isCons()) {
                        SubLObject cdolist_list_var = value;
                        SubLObject item = (SubLObject)map_utilities.NIL;
                        item = cdolist_list_var.first();
                        while (map_utilities.NIL != cdolist_list_var) {
                            store_in_reverse_index_map(ri_map, key, item, collate_duplicatesP);
                            cdolist_list_var = cdolist_list_var.rest();
                            item = cdolist_list_var.first();
                        }
                    }
                    else {
                        store_in_reverse_index_map(ri_map, key, value, collate_duplicatesP);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                }
            }
        }
        return ri_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 12539L)
    public static SubLObject store_in_reverse_index_map(final SubLObject ri_map, final SubLObject key, final SubLObject value, final SubLObject collate_duplicatesP) {
        return store_or_collate_in_map(ri_map, value, key, collate_duplicatesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 12751L)
    public static SubLObject store_or_collate_in_map(final SubLObject map, final SubLObject key, final SubLObject value, final SubLObject collate_duplicatesP) {
        if (map_utilities.NIL != collate_duplicatesP) {
            map_push(map, key, value);
        }
        else {
            map_put(map, key, value);
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 13011L)
    public static SubLObject filter_map_values(final SubLObject map, SubLObject test) {
        if (test == map_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)map_utilities.IDENTITY);
        }
        return map_remove_if_not_value(clone_map(map, (SubLObject)map_utilities.UNPROVIDED), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 13266L)
    public static SubLObject map_remove_if_not_value(final SubLObject map, SubLObject test) {
        if (test == map_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)map_utilities.$sym41$FALSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keys_to_remove = (SubLObject)map_utilities.NIL;
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    if (map_utilities.NIL == Functions.funcall(test, value)) {
                        keys_to_remove = (SubLObject)ConsesLow.cons(key, keys_to_remove);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                }
            }
        }
        return map_remove_keys(map, keys_to_remove);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 13620L)
    public static SubLObject map_remove_keys(final SubLObject map, final SubLObject keys_to_remove) {
        SubLObject cdolist_list_var = keys_to_remove;
        SubLObject key = (SubLObject)map_utilities.NIL;
        key = cdolist_list_var.first();
        while (map_utilities.NIL != cdolist_list_var) {
            map_remove(map, key);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 13841L)
    public static SubLObject map_sample_from_map(final SubLObject old_map, SubLObject percentage, SubLObject new_map) {
        if (new_map == map_utilities.UNPROVIDED) {
            new_map = (SubLObject)map_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (map_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !percentage.numLE((SubLObject)map_utilities.$int42$100)) {
            Errors.error((SubLObject)map_utilities.$str43$Error__percentage__A_is_not_one_o);
        }
        if (map_utilities.ONE_INTEGER.numL(percentage)) {
            percentage = Numbers.divide(percentage, (SubLObject)map_utilities.$int42$100);
        }
        final SubLObject new_size = Numbers.floor(Numbers.multiply(map_size(old_map), percentage), (SubLObject)map_utilities.UNPROVIDED);
        SubLObject doneP = (SubLObject)map_utilities.NIL;
        if (map_utilities.NIL == map_p(new_map)) {
            new_map = new_map_object_with_same_properties(old_map, map_test(old_map), new_size);
        }
        final SubLObject iterator = new_map_iterator(old_map);
        SubLObject valid;
        for (SubLObject done_var = doneP; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid || map_utilities.NIL != doneP)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    map_put(new_map, key, value);
                    doneP = Numbers.numG(map_size(new_map), new_size);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                }
            }
        }
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 14713L)
    public static SubLObject maps_differ_in_keysP(final SubLObject map_a, final SubLObject map_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_a = map_test(map_a);
        final SubLObject test_b = map_test(map_b);
        if (map_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !hash_table_utilities.hash_test_to_symbol(test_a).eql(hash_table_utilities.hash_test_to_symbol(test_b))) {
            Errors.error((SubLObject)map_utilities.$str44$Cannot_compute_key_differences_in, test_a, test_b);
        }
        if (!map_size(map_a).numE(map_size(map_b))) {
            return (SubLObject)map_utilities.T;
        }
        final SubLObject iterator = new_map_key_iterator(map_a);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid && map_utilities.NIL == map_has_keyP(map_b, key)) {
                return (SubLObject)map_utilities.T;
            }
        }
        return (SubLObject)map_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 15668L)
    public static SubLObject maps_differ_in_keys(final SubLObject map_a, final SubLObject map_b, SubLObject skip_common_keys_computationP) {
        if (skip_common_keys_computationP == map_utilities.UNPROVIDED) {
            skip_common_keys_computationP = (SubLObject)map_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (map_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !hash_table_utilities.hash_test_to_symbol(map_test(map_a)).eql(hash_table_utilities.hash_test_to_symbol(map_test(map_b)))) {
            Errors.error((SubLObject)map_utilities.$str44$Cannot_compute_key_differences_in, map_test(map_a), map_test(map_b));
        }
        if (map_utilities.NIL != skip_common_keys_computationP && map_utilities.NIL == maps_differ_in_keysP(map_a, map_b)) {
            final SubLObject test = map_test(map_a);
            return Values.values(set.new_set(test, (SubLObject)map_utilities.UNPROVIDED), set.new_set(test, (SubLObject)map_utilities.UNPROVIDED), (SubLObject)map_utilities.NIL);
        }
        final SubLObject test = map_test(map_a);
        final SubLObject only_in_a = set.new_set(test, (SubLObject)map_utilities.UNPROVIDED);
        final SubLObject only_in_b = set.new_set(test, (SubLObject)map_utilities.UNPROVIDED);
        SubLObject common_keys = set.new_set(test, (SubLObject)map_utilities.UNPROVIDED);
        SubLObject iterator = new_map_key_iterator(map_a);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid && map_utilities.NIL == map_has_keyP(map_b, key)) {
                set.set_add(key, only_in_a);
            }
        }
        if (map_utilities.NIL != set.empty_set_p(only_in_a) && map_size(map_a).numE(map_size(map_b))) {
            common_keys = map_key_set(map_a);
            return Values.values(only_in_a, only_in_b, common_keys);
        }
        iterator = new_map_key_iterator(map_b);
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid && map_utilities.NIL == map_has_keyP(map_a, key)) {
                set.set_add(key, only_in_b);
            }
        }
        if (map_utilities.NIL == skip_common_keys_computationP) {
            iterator = new_map_key_iterator(map_a);
            for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject key = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (map_utilities.NIL != valid && map_utilities.NIL == map_has_keyP(only_in_a, key)) {
                    set.set_add(key, common_keys);
                }
            }
        }
        return Values.values(only_in_a, only_in_b, common_keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 17330L)
    public static SubLObject maps_differ_in_values(final SubLObject map_a, final SubLObject map_b, SubLObject value_test) {
        if (value_test == map_utilities.UNPROVIDED) {
            value_test = (SubLObject)map_utilities.EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject different_keys = (SubLObject)map_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject only_a = maps_differ_in_keys(map_a, map_b, (SubLObject)map_utilities.UNPROVIDED);
        final SubLObject only_b = thread.secondMultipleValue();
        final SubLObject shared = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        different_keys = set.new_set(set.set_test(shared), (SubLObject)map_utilities.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(shared);
        SubLObject basis_object;
        SubLObject state;
        SubLObject shared_key;
        SubLObject value_a;
        SubLObject value_b;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)map_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); map_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            shared_key = set_contents.do_set_contents_next(basis_object, state);
            if (map_utilities.NIL != set_contents.do_set_contents_element_validP(state, shared_key)) {
                value_a = map_get(map_a, shared_key, (SubLObject)map_utilities.UNPROVIDED);
                value_b = map_get(map_b, shared_key, (SubLObject)map_utilities.UNPROVIDED);
                if (map_utilities.NIL == Functions.funcall(value_test, value_a, value_b)) {
                    set.set_add(shared_key, different_keys);
                }
            }
        }
        return Values.values(only_a, only_b, different_keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 18152L)
    public static SubLObject map_map_values(final SubLObject map, final SubLObject mapping_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_map = new_map_with_same_properties(map);
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject old_value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list45);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list45);
                old_value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    final SubLObject new_value = Functions.funcall(mapping_fn, old_value);
                    map_put(new_map, key, new_value);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list45);
                }
            }
        }
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 18561L)
    public static SubLObject map_change_values(final SubLObject map, final SubLObject apply_fn) {
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = map_keys(map);
        SubLObject key = (SubLObject)map_utilities.NIL;
        key = cdolist_list_var.first();
        while (map_utilities.NIL != cdolist_list_var) {
            final SubLObject old_value = map_get(map, key, (SubLObject)map_utilities.UNPROVIDED);
            final SubLObject new_value = Functions.funcall(apply_fn, old_value);
            map_put(map, key, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 18971L)
    public static SubLObject map_to_dictionary(final SubLObject map) {
        assert map_utilities.NIL != map_p(map) : map;
        final SubLObject test = map_test(map);
        final SubLObject size = map_size(map);
        final SubLObject new_dictionary = dictionary.new_dictionary(test, size);
        return copy_map(map, new_dictionary, (SubLObject)map_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 19331L)
    public static SubLObject map_to_hash_table(final SubLObject map) {
        assert map_utilities.NIL != map_p(map) : map;
        final SubLObject test = map_test(map);
        final SubLObject size = map_size(map);
        final SubLObject new_hash = Hashtables.make_hash_table(size, test, (SubLObject)map_utilities.UNPROVIDED);
        return copy_map(map, new_hash, (SubLObject)map_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 19617L)
    public static SubLObject copy_map(final SubLObject map_src, final SubLObject map_trg, SubLObject collate_duplicatesP) {
        if (collate_duplicatesP == map_utilities.UNPROVIDED) {
            collate_duplicatesP = (SubLObject)map_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert map_utilities.NIL != map_p(map_src) : map_src;
        assert map_utilities.NIL != map_p(map_trg) : map_trg;
        final SubLObject iterator = new_map_iterator(map_src);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject val = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list46);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list46);
                val = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    store_or_collate_in_map(map_trg, key, val, collate_duplicatesP);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list46);
                }
            }
        }
        return map_trg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 19992L)
    public static SubLObject is_map_object_p(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$is_map_object_p_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return (SubLObject)map_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20154L)
    public static SubLObject is_map_object_p_dictionary_method(final SubLObject v_object) {
        return (SubLObject)map_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20219L)
    public static SubLObject is_map_object_p_hash_table_method(final SubLObject v_object) {
        return (SubLObject)map_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20284L)
    public static SubLObject is_map_object_p_set_method(final SubLObject v_object) {
        return (SubLObject)map_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20342L)
    public static SubLObject map_object_size(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_size_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20453L)
    public static SubLObject map_object_size_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_length(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20543L)
    public static SubLObject map_object_size_hash_table_method(final SubLObject v_object) {
        return Hashtables.hash_table_count(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20632L)
    public static SubLObject map_object_size_set_method(final SubLObject v_object) {
        return set.set_size(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20706L)
    public static SubLObject map_object_test(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_test_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20815L)
    public static SubLObject map_object_test_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_test(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20903L)
    public static SubLObject map_object_test_hash_table_method(final SubLObject v_object) {
        return Hashtables.hash_table_test(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 20991L)
    public static SubLObject map_object_test_set_method(final SubLObject v_object) {
        return set.set_test(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21065L)
    public static SubLObject map_object_put(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_put_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object, key, value);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21205L)
    public static SubLObject map_object_put_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(v_object, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21313L)
    public static SubLObject map_object_put_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return Hashtables.sethash(key, v_object, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21412L)
    public static SubLObject map_object_put_set_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return set.set_add(key, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21584L)
    public static SubLObject map_object_put_unless(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_put_unless_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object, key, value, test_func);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21756L)
    public static SubLObject map_object_put_unless_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        if (map_utilities.NIL == Functions.funcall(test_func, dictionary.dictionary_lookup_without_values(v_object, key, (SubLObject)map_utilities.UNPROVIDED))) {
            return dictionary.dictionary_enter(v_object, key, value);
        }
        return (SubLObject)map_utilities.$kw61$NOT_SET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 21999L)
    public static SubLObject map_object_put_unless_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        if (map_utilities.NIL == Functions.funcall(test_func, Hashtables.gethash(key, v_object, (SubLObject)map_utilities.UNPROVIDED))) {
            return Hashtables.sethash(key, v_object, value);
        }
        return (SubLObject)map_utilities.$kw61$NOT_SET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 22208L)
    public static SubLObject map_object_put_unless_set_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        return set.set_add(key, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 22407L)
    public static SubLObject map_object_get(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_get_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object, key, not_found);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 22555L)
    public static SubLObject map_object_get_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return dictionary.dictionary_lookup(v_object, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 22672L)
    public static SubLObject map_object_get_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash(key, v_object, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 22779L)
    public static SubLObject map_object_get_set_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLObject foundP = set.set_memberP(key, v_object);
        return Values.values((map_utilities.NIL != foundP) ? key : not_found, foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23021L)
    public static SubLObject map_object_get_without_values(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_get_without_values_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object, key, not_found);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23194L)
    public static SubLObject map_object_get_without_values_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return dictionary.dictionary_lookup_without_values(v_object, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23341L)
    public static SubLObject map_object_get_without_values_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash_without_values(key, v_object, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23478L)
    public static SubLObject map_object_get_without_values_set_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return (map_utilities.NIL != set.set_memberP(key, v_object)) ? key : not_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23690L)
    public static SubLObject map_object_remove(final SubLObject map, final SubLObject key) {
        final SubLObject method_function = Structures.method_func(map, map_utilities.$map_object_remove_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, map, key);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23816L)
    public static SubLObject map_object_remove_dictionary_method(final SubLObject v_object, final SubLObject key) {
        return dictionary.dictionary_remove(v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 23916L)
    public static SubLObject map_object_remove_hash_table_method(final SubLObject v_object, final SubLObject key) {
        return Hashtables.remhash(key, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24006L)
    public static SubLObject map_object_remove_set_method(final SubLObject v_object, final SubLObject key) {
        return set.set_remove(key, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24092L)
    public static SubLObject map_object_touch(final SubLObject map, final SubLObject key) {
        final SubLObject method_function = Structures.method_func(map, map_utilities.$map_object_touch_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, map, key);
        }
        if (map_utilities.NIL != map_p(map)) {
            return (SubLObject)map_utilities.NIL;
        }
        Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, map);
        return (SubLObject)map_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24366L)
    public static SubLObject map_object_change_set(final SubLObject map, SubLObject unchanged) {
        if (unchanged == map_utilities.UNPROVIDED) {
            unchanged = (SubLObject)map_utilities.NIL;
        }
        final SubLObject method_function = Structures.method_func(map, map_utilities.$map_object_change_set_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, map, unchanged);
        }
        return Values.values(map_keys(map), (SubLObject)map_utilities.NIL, (SubLObject)map_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24703L)
    public static SubLObject new_map_object_with_same_properties(final SubLObject old_map, final SubLObject test, final SubLObject size) {
        final SubLObject method_function = Structures.method_func(old_map, map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, old_map, test, size);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, old_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 24885L)
    public static SubLObject new_map_object_with_same_properties_dictionary_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return dictionary.new_dictionary(test, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25005L)
    public static SubLObject new_map_object_with_same_properties_hash_table_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return Hashtables.make_hash_table(size, test, (SubLObject)map_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25126L)
    public static SubLObject new_map_object_with_same_properties_set_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return set.new_set(test, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25232L)
    public static SubLObject map_object_arbitrary_key(final SubLObject map) {
        final SubLObject method_function = Structures.method_func(map, map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, map);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25353L)
    public static SubLObject map_object_arbitrary_key_dictionary_method(final SubLObject v_object) {
        return dictionary_utilities.dictionary_arbitrary_key(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25459L)
    public static SubLObject map_object_arbitrary_key_hash_table_method(final SubLObject v_object) {
        return hash_table_utilities.hash_table_arbitrary_key(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25565L)
    public static SubLObject map_object_arbitrary_key_set_method(final SubLObject v_object) {
        return set_utilities.set_arbitrary_element(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25661L)
    public static SubLObject new_map_key_iterator(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$new_map_key_iterator_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return iteration.new_indirect_iterator(new_map_object_iterator(v_object), (SubLObject)map_utilities.$sym80$FIRST, (SubLObject)map_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25814L)
    public static SubLObject new_map_key_iterator_set_method(final SubLObject v_object) {
        return set.new_set_iterator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 25956L)
    public static SubLObject new_map_object_iterator(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$new_map_object_iterator_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 26080L)
    public static SubLObject new_map_object_iterator_dictionary_method(final SubLObject v_object) {
        return dictionary.new_dictionary_iterator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 26184L)
    public static SubLObject new_map_object_iterator_hash_table_method(final SubLObject v_object) {
        return iteration.new_hash_table_iterator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 26288L)
    public static SubLObject new_map_object_iterator_set_method(final SubLObject v_object) {
        return new_set_qua_map_iterator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 26386L)
    public static SubLObject new_set_qua_map_iterator(final SubLObject set_qua_map) {
        assert map_utilities.NIL != set.set_p(set_qua_map) : set_qua_map;
        return iteration.new_iterator(make_iterator_set_qua_map_state(set_qua_map), (SubLObject)map_utilities.$sym86$ITERATOR_SET_QUA_MAP_DONE, (SubLObject)map_utilities.$sym87$ITERATOR_SET_QUA_MAP_NEXT, (SubLObject)map_utilities.$sym88$ITERATOR_SET_QUA_MAP_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 26754L)
    public static SubLObject make_iterator_set_qua_map_state(final SubLObject set_qua_map) {
        final SubLObject current = set.new_set_iterator(set_qua_map);
        final SubLObject key_val_tuple = (SubLObject)ConsesLow.list((SubLObject)map_utilities.$kw89$KEY, (SubLObject)map_utilities.$kw90$VALUE);
        return (SubLObject)ConsesLow.list(current, set_qua_map, key_val_tuple);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 27000L)
    public static SubLObject iterator_set_qua_map_done(final SubLObject state) {
        SubLObject set_iterator = (SubLObject)map_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)map_utilities.$list91);
        set_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return iteration.iteration_done(set_iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 27174L)
    public static SubLObject iterator_set_qua_map_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject set_iterator = (SubLObject)map_utilities.NIL;
        SubLObject set_qua_map = (SubLObject)map_utilities.NIL;
        SubLObject key_val_tuple = (SubLObject)map_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)map_utilities.$list92);
        set_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)map_utilities.$list92);
        set_qua_map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)map_utilities.$list92);
        key_val_tuple = current.first();
        current = current.rest();
        if (map_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)map_utilities.$list92);
            return (SubLObject)map_utilities.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject next_key = iteration.iteration_next(set_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (map_utilities.NIL == validP) {
            iteration.iteration_finalize(set_iterator);
            ConsesLow.set_nth((SubLObject)map_utilities.ZERO_INTEGER, state, (SubLObject)map_utilities.$kw93$UNINITIALIZED);
            ConsesLow.set_nth((SubLObject)map_utilities.ONE_INTEGER, state, (SubLObject)map_utilities.$kw93$UNINITIALIZED);
            ConsesLow.set_nth((SubLObject)map_utilities.ZERO_INTEGER, key_val_tuple, (SubLObject)map_utilities.$kw94$INVALID);
            ConsesLow.set_nth((SubLObject)map_utilities.ONE_INTEGER, key_val_tuple, (SubLObject)map_utilities.$kw94$INVALID);
            return Values.values(key_val_tuple, state, (SubLObject)map_utilities.T);
        }
        final SubLObject next_value = next_key;
        ConsesLow.set_nth((SubLObject)map_utilities.ZERO_INTEGER, key_val_tuple, next_key);
        ConsesLow.set_nth((SubLObject)map_utilities.ONE_INTEGER, key_val_tuple, next_value);
        return Values.values(key_val_tuple, state, (SubLObject)map_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 27881L)
    public static SubLObject iterator_set_qua_map_finalize(final SubLObject state) {
        SubLObject set_iterator = (SubLObject)map_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)map_utilities.$list91);
        set_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (map_utilities.NIL != iteration.iterator_p(set_iterator)) {
            return iteration.iteration_finalize(set_iterator);
        }
        return (SubLObject)map_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28103L)
    public static SubLObject map_object_remove_all(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_remove_all_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28223L)
    public static SubLObject map_object_remove_all_dictionary_method(final SubLObject v_object) {
        return dictionary.clear_dictionary(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28318L)
    public static SubLObject map_object_remove_all_hash_table_method(final SubLObject v_object) {
        return Hashtables.clrhash(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28404L)
    public static SubLObject map_object_remove_all_set_method(final SubLObject v_object) {
        return set.clear_set(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28485L)
    public static SubLObject map_object_keys(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_keys_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        if (map_utilities.NIL != map_p(v_object)) {
            return map_keys_via_do_map(v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28664L)
    public static SubLObject map_keys_via_do_map(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cursor;
        final SubLObject keys = cursor = (SubLObject)ConsesLow.make_list(map_size(map), (SubLObject)map_utilities.UNPROVIDED);
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    ConsesLow.rplaca(cursor, key);
                    cursor = cursor.rest();
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                }
            }
        }
        return keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28901L)
    public static SubLObject map_object_keys_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_keys(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 28990L)
    public static SubLObject map_object_keys_hash_table_method(final SubLObject v_object) {
        return hash_table_utilities.hash_table_keys(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29078L)
    public static SubLObject map_object_keys_set_method(final SubLObject v_object) {
        return set.set_element_list(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29160L)
    public static SubLObject map_object_key_set(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_key_set_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        if (map_utilities.NIL != map_p(v_object)) {
            return map_key_set_via_map_keys(v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29349L)
    public static SubLObject map_key_set_via_map_keys(final SubLObject v_object) {
        return set_utilities.make_set_from_list(map_keys(v_object), map_test(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29466L)
    public static SubLObject map_object_key_set_set_method(final SubLObject v_object) {
        return set.copy_set(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29543L)
    public static SubLObject map_object_values(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, map_utilities.$map_object_values_method_table$.getGlobalValue());
        if (map_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        if (map_utilities.NIL != map_p(v_object)) {
            return map_values_via_do_map(v_object);
        }
        return Errors.error((SubLObject)map_utilities.$str51$_A_is_not_a_MAP_P_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29727L)
    public static SubLObject map_values_via_do_map(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cursor;
        final SubLObject values = cursor = (SubLObject)ConsesLow.make_list(map_size(map), (SubLObject)map_utilities.UNPROVIDED);
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    ConsesLow.rplaca(cursor, value);
                    cursor = cursor.rest();
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                }
            }
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 29972L)
    public static SubLObject map_object_values_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_values(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 30065L)
    public static SubLObject map_object_values_hash_table_method(final SubLObject v_object) {
        return hash_table_utilities.hash_table_values(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 30157L)
    public static SubLObject map_object_values_set_method(final SubLObject v_object) {
        return set.set_element_list(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 30313L)
    public static SubLObject test_hash_table_key_conflation(final SubLObject test, final SubLObject raw_items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hash_table = Hashtables.make_hash_table(Sequences.length(raw_items), test, (SubLObject)map_utilities.UNPROVIDED);
        final SubLObject unique_items = Sequences.remove_duplicates(raw_items, test, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED, (SubLObject)map_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = raw_items;
        SubLObject item = (SubLObject)map_utilities.NIL;
        item = cdolist_list_var.first();
        while (map_utilities.NIL != cdolist_list_var) {
            Hashtables.sethash(item, hash_table, (SubLObject)map_utilities.$kw113$PRESENT);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        final SubLObject expected = Sequences.length(unique_items);
        final SubLObject actual = Hashtables.hash_table_count(hash_table);
        if (map_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected.numE(actual)) {
            Errors.error((SubLObject)map_utilities.$str114$Expected__A_entries__but_got__A_, expected, actual);
        }
        return (SubLObject)map_utilities.$kw115$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/map-utilities.lisp", position = 30313L)
    public static SubLObject test_do_map_over_set_integrity(final SubLObject expected) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = (SubLObject)((map_utilities.NIL != subl_promotions.positive_integer_p(expected)) ? number_utilities.non_negative_integers_less_than(expected) : map_utilities.NIL);
        SubLObject actual = (SubLObject)map_utilities.ZERO_INTEGER;
        final SubLObject iterator = new_map_iterator(set_utilities.make_set_from_list(items, (SubLObject)map_utilities.UNPROVIDED));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)map_utilities.NIL; map_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (map_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)map_utilities.NIL;
                SubLObject value = (SubLObject)map_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)map_utilities.$list36);
                value = current.first();
                current = current.rest();
                if (map_utilities.NIL == current) {
                    if (map_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !key.eql(value)) {
                        Errors.error((SubLObject)map_utilities.$str118$Expected__S_and__S_to_be_identica, key, value);
                    }
                    actual = Numbers.add(actual, (SubLObject)map_utilities.ONE_INTEGER);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)map_utilities.$list36);
                }
            }
        }
        if (map_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !actual.numE(expected)) {
            Errors.error((SubLObject)map_utilities.$str119$Expected__A_items__but_got__A_, expected, actual);
        }
        return (SubLObject)map_utilities.$kw115$SUCCESS;
    }
    
    public static SubLObject declare_map_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_p", "MAP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_size", "MAP-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_test", "MAP-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_empty_p", "MAP-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_test_symbol", "MAP-TEST-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_put", "MAP-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_put_unless", "MAP-PUT-UNLESS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_get", "MAP-GET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_get_without_values", "MAP-GET-WITHOUT-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_remove", "MAP-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_remove_all", "MAP-REMOVE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_touch", "MAP-TOUCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_change_set", "MAP-CHANGE-SET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_iterator", "NEW-MAP-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.map_utilities", "do_map", "DO-MAP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.map_utilities", "do_map_via_keys", "DO-MAP-VIA-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.map_utilities", "do_map_keys", "DO-MAP-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_with_same_properties", "NEW-MAP-WITH-SAME-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "clone_map", "CLONE-MAP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_arbitrary_key", "MAP-ARBITRARY-KEY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_arbitrary_value", "MAP-ARBITRARY-VALUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_keys", "MAP-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_key_set", "MAP-KEY-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_values", "MAP-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_has_keyP", "MAP-HAS-KEY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_push", "MAP-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_pushnew", "MAP-PUSHNEW", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_remove_from_value", "MAP-REMOVE-FROM-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_increment", "MAP-INCREMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_decrement", "MAP-DECREMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "reverse_index_map", "REVERSE-INDEX-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "store_in_reverse_index_map", "STORE-IN-REVERSE-INDEX-MAP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "store_or_collate_in_map", "STORE-OR-COLLATE-IN-MAP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "filter_map_values", "FILTER-MAP-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_remove_if_not_value", "MAP-REMOVE-IF-NOT-VALUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_remove_keys", "MAP-REMOVE-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_sample_from_map", "MAP-SAMPLE-FROM-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "maps_differ_in_keysP", "MAPS-DIFFER-IN-KEYS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "maps_differ_in_keys", "MAPS-DIFFER-IN-KEYS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "maps_differ_in_values", "MAPS-DIFFER-IN-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_map_values", "MAP-MAP-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_change_values", "MAP-CHANGE-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_to_dictionary", "MAP-TO-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_to_hash_table", "MAP-TO-HASH-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "copy_map", "COPY-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "is_map_object_p", "IS-MAP-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "is_map_object_p_dictionary_method", "IS-MAP-OBJECT-P-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "is_map_object_p_hash_table_method", "IS-MAP-OBJECT-P-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "is_map_object_p_set_method", "IS-MAP-OBJECT-P-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_size", "MAP-OBJECT-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_size_dictionary_method", "MAP-OBJECT-SIZE-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_size_hash_table_method", "MAP-OBJECT-SIZE-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_size_set_method", "MAP-OBJECT-SIZE-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_test", "MAP-OBJECT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_test_dictionary_method", "MAP-OBJECT-TEST-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_test_hash_table_method", "MAP-OBJECT-TEST-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_test_set_method", "MAP-OBJECT-TEST-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put", "MAP-OBJECT-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_dictionary_method", "MAP-OBJECT-PUT-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_hash_table_method", "MAP-OBJECT-PUT-HASH-TABLE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_set_method", "MAP-OBJECT-PUT-SET-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_unless", "MAP-OBJECT-PUT-UNLESS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_unless_dictionary_method", "MAP-OBJECT-PUT-UNLESS-DICTIONARY-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_unless_hash_table_method", "MAP-OBJECT-PUT-UNLESS-HASH-TABLE-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_put_unless_set_method", "MAP-OBJECT-PUT-UNLESS-SET-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get", "MAP-OBJECT-GET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_dictionary_method", "MAP-OBJECT-GET-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_hash_table_method", "MAP-OBJECT-GET-HASH-TABLE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_set_method", "MAP-OBJECT-GET-SET-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_without_values", "MAP-OBJECT-GET-WITHOUT-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_without_values_dictionary_method", "MAP-OBJECT-GET-WITHOUT-VALUES-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_without_values_hash_table_method", "MAP-OBJECT-GET-WITHOUT-VALUES-HASH-TABLE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_get_without_values_set_method", "MAP-OBJECT-GET-WITHOUT-VALUES-SET-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove", "MAP-OBJECT-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_dictionary_method", "MAP-OBJECT-REMOVE-DICTIONARY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_hash_table_method", "MAP-OBJECT-REMOVE-HASH-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_set_method", "MAP-OBJECT-REMOVE-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_touch", "MAP-OBJECT-TOUCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_change_set", "MAP-OBJECT-CHANGE-SET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_with_same_properties", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_with_same_properties_dictionary_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_with_same_properties_hash_table_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-HASH-TABLE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_with_same_properties_set_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SET-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_arbitrary_key", "MAP-OBJECT-ARBITRARY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_arbitrary_key_dictionary_method", "MAP-OBJECT-ARBITRARY-KEY-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_arbitrary_key_hash_table_method", "MAP-OBJECT-ARBITRARY-KEY-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_arbitrary_key_set_method", "MAP-OBJECT-ARBITRARY-KEY-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_key_iterator", "NEW-MAP-KEY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_key_iterator_set_method", "NEW-MAP-KEY-ITERATOR-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_iterator", "NEW-MAP-OBJECT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_iterator_dictionary_method", "NEW-MAP-OBJECT-ITERATOR-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_iterator_hash_table_method", "NEW-MAP-OBJECT-ITERATOR-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_map_object_iterator_set_method", "NEW-MAP-OBJECT-ITERATOR-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "new_set_qua_map_iterator", "NEW-SET-QUA-MAP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "make_iterator_set_qua_map_state", "MAKE-ITERATOR-SET-QUA-MAP-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "iterator_set_qua_map_done", "ITERATOR-SET-QUA-MAP-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "iterator_set_qua_map_next", "ITERATOR-SET-QUA-MAP-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "iterator_set_qua_map_finalize", "ITERATOR-SET-QUA-MAP-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_all", "MAP-OBJECT-REMOVE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_all_dictionary_method", "MAP-OBJECT-REMOVE-ALL-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_all_hash_table_method", "MAP-OBJECT-REMOVE-ALL-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_remove_all_set_method", "MAP-OBJECT-REMOVE-ALL-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_keys", "MAP-OBJECT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_keys_via_do_map", "MAP-KEYS-VIA-DO-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_keys_dictionary_method", "MAP-OBJECT-KEYS-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_keys_hash_table_method", "MAP-OBJECT-KEYS-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_keys_set_method", "MAP-OBJECT-KEYS-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_key_set", "MAP-OBJECT-KEY-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_key_set_via_map_keys", "MAP-KEY-SET-VIA-MAP-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_key_set_set_method", "MAP-OBJECT-KEY-SET-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_values", "MAP-OBJECT-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_values_via_do_map", "MAP-VALUES-VIA-DO-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_values_dictionary_method", "MAP-OBJECT-VALUES-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_values_hash_table_method", "MAP-OBJECT-VALUES-HASH-TABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "map_object_values_set_method", "MAP-OBJECT-VALUES-SET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "test_hash_table_key_conflation", "TEST-HASH-TABLE-KEY-CONFLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.map_utilities", "test_do_map_over_set_integrity", "TEST-DO-MAP-OVER-SET-INTEGRITY", 1, 0, false);
        return (SubLObject)map_utilities.NIL;
    }
    
    public static SubLObject init_map_utilities_file() {
        map_utilities.$map_missing_key_token$ = SubLFiles.deflexical("*MAP-MISSING-KEY-TOKEN*", Symbols.make_symbol((SubLObject)map_utilities.$str37$MISSING));
        map_utilities.$is_map_object_p_method_table$ = SubLFiles.deflexical("*IS-MAP-OBJECT-P-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_size_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-SIZE-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_test_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-TEST-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_put_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-PUT-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_put_unless_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-PUT-UNLESS-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_get_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-GET-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_get_without_values_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-GET-WITHOUT-VALUES-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_remove_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-REMOVE-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_touch_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-TOUCH-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_change_set_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-CHANGE-SET-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$new_map_object_with_same_properties_method_table$ = SubLFiles.deflexical("*NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_arbitrary_key_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-ARBITRARY-KEY-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$new_map_key_iterator_method_table$ = SubLFiles.deflexical("*NEW-MAP-KEY-ITERATOR-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$new_map_object_iterator_method_table$ = SubLFiles.deflexical("*NEW-MAP-OBJECT-ITERATOR-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_remove_all_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-REMOVE-ALL-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_keys_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-KEYS-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_key_set_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-KEY-SET-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        map_utilities.$map_object_values_method_table$ = SubLFiles.deflexical("*MAP-OBJECT-VALUES-METHOD-TABLE*", Vectors.make_vector((SubLObject)map_utilities.$int47$256, (SubLObject)map_utilities.NIL));
        return (SubLObject)map_utilities.NIL;
    }
    
    public static SubLObject setup_map_utilities_file() {
        Structures.register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym48$IS_MAP_OBJECT_P_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym49$IS_MAP_OBJECT_P_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym50$IS_MAP_OBJECT_P_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym52$MAP_OBJECT_SIZE_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym53$MAP_OBJECT_SIZE_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym54$MAP_OBJECT_SIZE_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym55$MAP_OBJECT_TEST_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym56$MAP_OBJECT_TEST_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym57$MAP_OBJECT_TEST_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym58$MAP_OBJECT_PUT_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym59$MAP_OBJECT_PUT_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym60$MAP_OBJECT_PUT_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_put_unless_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym62$MAP_OBJECT_PUT_UNLESS_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_put_unless_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym63$MAP_OBJECT_PUT_UNLESS_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_put_unless_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym64$MAP_OBJECT_PUT_UNLESS_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym65$MAP_OBJECT_GET_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym66$MAP_OBJECT_GET_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym67$MAP_OBJECT_GET_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym68$MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym69$MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym70$MAP_OBJECT_GET_WITHOUT_VALUES_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym71$MAP_OBJECT_REMOVE_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym72$MAP_OBJECT_REMOVE_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym73$MAP_OBJECT_REMOVE_SET_METHOD));
        Structures.register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym74$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym75$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym76$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym77$MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym78$MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym79$MAP_OBJECT_ARBITRARY_KEY_SET_METHOD));
        Structures.register_method(map_utilities.$new_map_key_iterator_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym81$NEW_MAP_KEY_ITERATOR_SET_METHOD));
        Structures.register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym82$NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym83$NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym84$NEW_MAP_OBJECT_ITERATOR_SET_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)map_utilities.$sym86$ITERATOR_SET_QUA_MAP_DONE);
        utilities_macros.note_funcall_helper_function((SubLObject)map_utilities.$sym87$ITERATOR_SET_QUA_MAP_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)map_utilities.$sym88$ITERATOR_SET_QUA_MAP_FINALIZE);
        Structures.register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym95$MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym96$MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym97$MAP_OBJECT_REMOVE_ALL_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym98$MAP_OBJECT_KEYS_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym99$MAP_OBJECT_KEYS_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym100$MAP_OBJECT_KEYS_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_key_set_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym101$MAP_OBJECT_KEY_SET_SET_METHOD));
        Structures.register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym102$MAP_OBJECT_VALUES_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym103$MAP_OBJECT_VALUES_HASH_TABLE_METHOD));
        Structures.register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)map_utilities.$sym104$MAP_OBJECT_VALUES_SET_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)map_utilities.$sym105$TEST_HASH_TABLE_KEY_CONFLATION, (SubLObject)ConsesLow.list(new SubLObject[] { map_utilities.$kw106$TEST, map_utilities.NIL, map_utilities.$kw107$OWNER, map_utilities.NIL, map_utilities.$kw108$CLASSES, map_utilities.NIL, map_utilities.$kw109$KB, map_utilities.$kw110$TINY, map_utilities.$kw111$WORKING_, map_utilities.T }), (SubLObject)map_utilities.$list112);
        generic_testing.define_test_case_table_int((SubLObject)map_utilities.$sym116$TEST_DO_MAP_OVER_SET_INTEGRITY, (SubLObject)ConsesLow.list(new SubLObject[] { map_utilities.$kw106$TEST, map_utilities.NIL, map_utilities.$kw107$OWNER, map_utilities.NIL, map_utilities.$kw108$CLASSES, map_utilities.NIL, map_utilities.$kw109$KB, map_utilities.$kw110$TINY, map_utilities.$kw111$WORKING_, map_utilities.T }), (SubLObject)map_utilities.$list117);
        return (SubLObject)map_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_map_utilities_file();
    }
    
    public void initializeVariables() {
        init_map_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_map_utilities_file();
    }
    
    static {
        me = (SubLFile)new map_utilities();
        map_utilities.$map_missing_key_token$ = null;
        map_utilities.$is_map_object_p_method_table$ = null;
        map_utilities.$map_object_size_method_table$ = null;
        map_utilities.$map_object_test_method_table$ = null;
        map_utilities.$map_object_put_method_table$ = null;
        map_utilities.$map_object_put_unless_method_table$ = null;
        map_utilities.$map_object_get_method_table$ = null;
        map_utilities.$map_object_get_without_values_method_table$ = null;
        map_utilities.$map_object_remove_method_table$ = null;
        map_utilities.$map_object_touch_method_table$ = null;
        map_utilities.$map_object_change_set_method_table$ = null;
        map_utilities.$new_map_object_with_same_properties_method_table$ = null;
        map_utilities.$map_object_arbitrary_key_method_table$ = null;
        map_utilities.$new_map_key_iterator_method_table$ = null;
        map_utilities.$new_map_object_iterator_method_table$ = null;
        map_utilities.$map_object_remove_all_method_table$ = null;
        map_utilities.$map_object_keys_method_table$ = null;
        map_utilities.$map_object_key_set_method_table$ = null;
        map_utilities.$map_object_values_method_table$ = null;
        $sym0$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw5$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym6$VAR = SubLObjectFactory.makeUninternedSymbol("VAR");
        $sym7$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym8$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym9$NEW_MAP_ITERATOR = SubLObjectFactory.makeSymbol("NEW-MAP-ITERATOR");
        $sym10$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym11$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym12$THE_MAP = SubLObjectFactory.makeUninternedSymbol("THE-MAP");
        $sym13$MESS = SubLObjectFactory.makeUninternedSymbol("MESS");
        $sym14$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym15$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $list16 = ConsesLow.list((SubLObject)map_utilities.ZERO_INTEGER);
        $sym17$MAP_SIZE = SubLObjectFactory.makeSymbol("MAP-SIZE");
        $sym18$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $sym20$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym21$DO_MAP = SubLObjectFactory.makeSymbol("DO-MAP");
        $sym22$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym23$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym24$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym25$MAP_KEYS = SubLObjectFactory.makeSymbol("MAP-KEYS");
        $sym26$MAP_GET_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("MAP-GET-WITHOUT-VALUES");
        $sym27$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym29$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym30$NEW_MAP_KEY_ITERATOR = SubLObjectFactory.makeSymbol("NEW-MAP-KEY-ITERATOR");
        $sym31$THE_MAP = SubLObjectFactory.makeUninternedSymbol("THE-MAP");
        $sym32$MESS = SubLObjectFactory.makeUninternedSymbol("MESS");
        $sym33$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym34$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym35$DO_MAP_KEYS = SubLObjectFactory.makeSymbol("DO-MAP-KEYS");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str37$MISSING = SubLObjectFactory.makeString("MISSING");
        $sym38$MAP_P = SubLObjectFactory.makeSymbol("MAP-P");
        $str39$Invalid_map_format__Attempting_to = SubLObjectFactory.makeString("Invalid map format: Attempting to push values on a non listp ~a.~%");
        $str40$Corrupted_map__attempting_to_remo = SubLObjectFactory.makeString("Corrupted map; attempting to remove a value from a non-LISTP ~a.~%");
        $sym41$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $int42$100 = SubLObjectFactory.makeInteger(100);
        $str43$Error__percentage__A_is_not_one_o = SubLObjectFactory.makeString("Error, percentage ~A is not one of 0-100 or 0-1.");
        $str44$Cannot_compute_key_differences_in = SubLObjectFactory.makeString("Cannot compute key differences in the face of unclear key equality; ~A != ~A.");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-VALUE"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"));
        $int47$256 = SubLObjectFactory.makeInteger(256);
        $sym48$IS_MAP_OBJECT_P_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("IS-MAP-OBJECT-P-DICTIONARY-METHOD");
        $sym49$IS_MAP_OBJECT_P_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("IS-MAP-OBJECT-P-HASH-TABLE-METHOD");
        $sym50$IS_MAP_OBJECT_P_SET_METHOD = SubLObjectFactory.makeSymbol("IS-MAP-OBJECT-P-SET-METHOD");
        $str51$_A_is_not_a_MAP_P_ = SubLObjectFactory.makeString("~A is not a MAP-P.");
        $sym52$MAP_OBJECT_SIZE_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-SIZE-DICTIONARY-METHOD");
        $sym53$MAP_OBJECT_SIZE_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-SIZE-HASH-TABLE-METHOD");
        $sym54$MAP_OBJECT_SIZE_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-SIZE-SET-METHOD");
        $sym55$MAP_OBJECT_TEST_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-TEST-DICTIONARY-METHOD");
        $sym56$MAP_OBJECT_TEST_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-TEST-HASH-TABLE-METHOD");
        $sym57$MAP_OBJECT_TEST_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-TEST-SET-METHOD");
        $sym58$MAP_OBJECT_PUT_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-DICTIONARY-METHOD");
        $sym59$MAP_OBJECT_PUT_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-HASH-TABLE-METHOD");
        $sym60$MAP_OBJECT_PUT_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-SET-METHOD");
        $kw61$NOT_SET = SubLObjectFactory.makeKeyword("NOT-SET");
        $sym62$MAP_OBJECT_PUT_UNLESS_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-UNLESS-DICTIONARY-METHOD");
        $sym63$MAP_OBJECT_PUT_UNLESS_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-UNLESS-HASH-TABLE-METHOD");
        $sym64$MAP_OBJECT_PUT_UNLESS_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-UNLESS-SET-METHOD");
        $sym65$MAP_OBJECT_GET_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-DICTIONARY-METHOD");
        $sym66$MAP_OBJECT_GET_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-HASH-TABLE-METHOD");
        $sym67$MAP_OBJECT_GET_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-SET-METHOD");
        $sym68$MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-DICTIONARY-METHOD");
        $sym69$MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-HASH-TABLE-METHOD");
        $sym70$MAP_OBJECT_GET_WITHOUT_VALUES_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-SET-METHOD");
        $sym71$MAP_OBJECT_REMOVE_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-DICTIONARY-METHOD");
        $sym72$MAP_OBJECT_REMOVE_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-HASH-TABLE-METHOD");
        $sym73$MAP_OBJECT_REMOVE_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-SET-METHOD");
        $sym74$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-DICTIONARY-METHOD");
        $sym75$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-HASH-TABLE-METHOD");
        $sym76$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SET_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SET-METHOD");
        $sym77$MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-ARBITRARY-KEY-DICTIONARY-METHOD");
        $sym78$MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-ARBITRARY-KEY-HASH-TABLE-METHOD");
        $sym79$MAP_OBJECT_ARBITRARY_KEY_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-ARBITRARY-KEY-SET-METHOD");
        $sym80$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym81$NEW_MAP_KEY_ITERATOR_SET_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-KEY-ITERATOR-SET-METHOD");
        $sym82$NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-ITERATOR-DICTIONARY-METHOD");
        $sym83$NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-ITERATOR-HASH-TABLE-METHOD");
        $sym84$NEW_MAP_OBJECT_ITERATOR_SET_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-ITERATOR-SET-METHOD");
        $sym85$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $sym86$ITERATOR_SET_QUA_MAP_DONE = SubLObjectFactory.makeSymbol("ITERATOR-SET-QUA-MAP-DONE");
        $sym87$ITERATOR_SET_QUA_MAP_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-SET-QUA-MAP-NEXT");
        $sym88$ITERATOR_SET_QUA_MAP_FINALIZE = SubLObjectFactory.makeSymbol("ITERATOR-SET-QUA-MAP-FINALIZE");
        $kw89$KEY = SubLObjectFactory.makeKeyword("KEY");
        $kw90$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SET-QUA-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VAL-TUPLE"));
        $kw93$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw94$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $sym95$MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-ALL-DICTIONARY-METHOD");
        $sym96$MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-ALL-HASH-TABLE-METHOD");
        $sym97$MAP_OBJECT_REMOVE_ALL_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-ALL-SET-METHOD");
        $sym98$MAP_OBJECT_KEYS_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-KEYS-DICTIONARY-METHOD");
        $sym99$MAP_OBJECT_KEYS_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-KEYS-HASH-TABLE-METHOD");
        $sym100$MAP_OBJECT_KEYS_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-KEYS-SET-METHOD");
        $sym101$MAP_OBJECT_KEY_SET_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-KEY-SET-SET-METHOD");
        $sym102$MAP_OBJECT_VALUES_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-VALUES-DICTIONARY-METHOD");
        $sym103$MAP_OBJECT_VALUES_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-VALUES-HASH-TABLE-METHOD");
        $sym104$MAP_OBJECT_VALUES_SET_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-VALUES-SET-METHOD");
        $sym105$TEST_HASH_TABLE_KEY_CONFLATION = SubLObjectFactory.makeSymbol("TEST-HASH-TABLE-KEY-CONFLATION");
        $kw106$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw107$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw108$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw109$KB = SubLObjectFactory.makeKeyword("KB");
        $kw110$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw111$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)map_utilities.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Sea"), (SubLObject)SubLObjectFactory.makeString("sea"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)map_utilities.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)map_utilities.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("sea"), SubLObjectFactory.makeString("central") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)map_utilities.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $kw113$PRESENT = SubLObjectFactory.makeKeyword("PRESENT");
        $str114$Expected__A_entries__but_got__A_ = SubLObjectFactory.makeString("Expected ~A entries, but got ~A.");
        $kw115$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym116$TEST_DO_MAP_OVER_SET_INTEGRITY = SubLObjectFactory.makeSymbol("TEST-DO-MAP-OVER-SET-INTEGRITY");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)map_utilities.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)map_utilities.FOUR_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str118$Expected__S_and__S_to_be_identica = SubLObjectFactory.makeString("Expected ~S and ~S to be identical");
        $str119$Expected__A_items__but_got__A_ = SubLObjectFactory.makeString("Expected ~A items, but got ~A.");
    }
}

/*

	Total time: 408 ms
	
*/