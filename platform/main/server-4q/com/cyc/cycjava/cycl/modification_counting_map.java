package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class modification_counting_map extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new modification_counting_map();



    // defconstant
    public static final SubLSymbol $dtp_modification_counting_map$ = makeSymbol("*DTP-MODIFICATION-COUNTING-MAP*");

    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLSymbol MODIFICATION_COUNTING_MAP = makeSymbol("MODIFICATION-COUNTING-MAP");

    private static final SubLSymbol MODIFICATION_COUNTING_MAP_P = makeSymbol("MODIFICATION-COUNTING-MAP-P");

    private static final SubLList $list3 = list(makeSymbol("MAP"), makeSymbol("PUT-COUNT"), makeSymbol("REMOVE-COUNT"));

    private static final SubLList $list4 = list(makeKeyword("MAP"), makeKeyword("PUT-COUNT"), makeKeyword("REMOVE-COUNT"));

    private static final SubLList $list5 = list(makeSymbol("MCMAP-MAP"), makeSymbol("MCMAP-PUT-COUNT"), makeSymbol("MCMAP-REMOVE-COUNT"));

    private static final SubLList $list6 = list(makeSymbol("_CSETF-MCMAP-MAP"), makeSymbol("_CSETF-MCMAP-PUT-COUNT"), makeSymbol("_CSETF-MCMAP-REMOVE-COUNT"));

    private static final SubLSymbol PRINT_MODIFICATION_COUNTING_MAP = makeSymbol("PRINT-MODIFICATION-COUNTING-MAP");

    private static final SubLSymbol MODIFICATION_COUNTING_MAP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MODIFICATION-COUNTING-MAP-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MODIFICATION-COUNTING-MAP-P"));

    private static final SubLSymbol MCMAP_MAP = makeSymbol("MCMAP-MAP");

    private static final SubLSymbol _CSETF_MCMAP_MAP = makeSymbol("_CSETF-MCMAP-MAP");

    private static final SubLSymbol MCMAP_PUT_COUNT = makeSymbol("MCMAP-PUT-COUNT");

    private static final SubLSymbol _CSETF_MCMAP_PUT_COUNT = makeSymbol("_CSETF-MCMAP-PUT-COUNT");

    private static final SubLSymbol MCMAP_REMOVE_COUNT = makeSymbol("MCMAP-REMOVE-COUNT");

    private static final SubLSymbol _CSETF_MCMAP_REMOVE_COUNT = makeSymbol("_CSETF-MCMAP-REMOVE-COUNT");



    private static final SubLSymbol $PUT_COUNT = makeKeyword("PUT-COUNT");

    private static final SubLSymbol $REMOVE_COUNT = makeKeyword("REMOVE-COUNT");

    private static final SubLString $str19$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_MODIFICATION_COUNTING_MAP = makeSymbol("MAKE-MODIFICATION-COUNTING-MAP");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLString $str25$_MODIFICATION_COUNTING_MAP__A_ = makeString("<MODIFICATION-COUNTING-MAP ~A>");

    private static final SubLSymbol IS_MAP_OBJECT_P_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("IS-MAP-OBJECT-P-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_SIZE_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-SIZE-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-TEST-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-PUT-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol $sym33$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_MODIFICATION_COUNTING_MAP_MET = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEYS_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-KEYS-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_VALUES_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("MAP-OBJECT-VALUES-MODIFICATION-COUNTING-MAP-METHOD");

    private static final SubLSymbol SXHASH_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol("SXHASH-MODIFICATION-COUNTING-MAP-METHOD");

    public static SubLObject create_modification_counting_map(final SubLObject map) {
        assert NIL != map_utilities.map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        return new_modification_counting_map(map);
    }

    public static SubLObject modification_counting_map_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_modification_counting_map(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject modification_counting_map_p(final SubLObject v_object) {
        return v_object.getClass() == $modification_counting_map_native.class ? T : NIL;
    }

    public static SubLObject mcmap_map(final SubLObject v_object) {
        assert NIL != modification_counting_map_p(v_object) : "modification_counting_map.modification_counting_map_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject mcmap_put_count(final SubLObject v_object) {
        assert NIL != modification_counting_map_p(v_object) : "modification_counting_map.modification_counting_map_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject mcmap_remove_count(final SubLObject v_object) {
        assert NIL != modification_counting_map_p(v_object) : "modification_counting_map.modification_counting_map_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_mcmap_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != modification_counting_map_p(v_object) : "modification_counting_map.modification_counting_map_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mcmap_put_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != modification_counting_map_p(v_object) : "modification_counting_map.modification_counting_map_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_mcmap_remove_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != modification_counting_map_p(v_object) : "modification_counting_map.modification_counting_map_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_modification_counting_map(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $modification_counting_map_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MAP)) {
                _csetf_mcmap_map(v_new, current_value);
            } else
                if (pcase_var.eql($PUT_COUNT)) {
                    _csetf_mcmap_put_count(v_new, current_value);
                } else
                    if (pcase_var.eql($REMOVE_COUNT)) {
                        _csetf_mcmap_remove_count(v_new, current_value);
                    } else {
                        Errors.error($str19$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_modification_counting_map(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MODIFICATION_COUNTING_MAP, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MAP, mcmap_map(obj));
        funcall(visitor_fn, obj, $SLOT, $PUT_COUNT, mcmap_put_count(obj));
        funcall(visitor_fn, obj, $SLOT, $REMOVE_COUNT, mcmap_remove_count(obj));
        funcall(visitor_fn, obj, $END, MAKE_MODIFICATION_COUNTING_MAP, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_modification_counting_map_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_modification_counting_map(obj, visitor_fn);
    }

    public static SubLObject print_modification_counting_map(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str25$_MODIFICATION_COUNTING_MAP__A_, modification_counting_map_map(v_object));
        return v_object;
    }

    public static SubLObject is_map_object_p_modification_counting_map_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject map_object_size_modification_counting_map_method(final SubLObject v_object) {
        return map_utilities.map_size(modification_counting_map_map(v_object));
    }

    public static SubLObject map_object_test_modification_counting_map_method(final SubLObject v_object) {
        return map_utilities.map_test(modification_counting_map_map(v_object));
    }

    public static SubLObject map_object_put_modification_counting_map_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return modification_counting_map_put(v_object, key, value);
    }

    public static SubLObject modification_counting_map_put(final SubLObject mcmap, final SubLObject key, final SubLObject value) {
        mcmap_note_put(mcmap);
        return map_utilities.map_put(modification_counting_map_map(mcmap), key, value);
    }

    public static SubLObject map_object_get_modification_counting_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return modification_counting_map_get(v_object, key, not_found);
    }

    public static SubLObject modification_counting_map_get(final SubLObject mcmap, final SubLObject key, final SubLObject not_found) {
        return map_utilities.map_get(modification_counting_map_map(mcmap), key, not_found);
    }

    public static SubLObject map_object_get_without_values_modification_counting_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return modification_counting_map_get_without_values(v_object, key, not_found);
    }

    public static SubLObject modification_counting_map_get_without_values(final SubLObject mcmap, final SubLObject key, final SubLObject not_found) {
        return map_utilities.map_get_without_values(modification_counting_map_map(mcmap), key, not_found);
    }

    public static SubLObject map_object_remove_modification_counting_map_method(final SubLObject v_object, final SubLObject key) {
        return modification_counting_map_remove(v_object, key);
    }

    public static SubLObject modification_counting_map_remove(final SubLObject mcmap, final SubLObject key) {
        mcmap_note_remove(mcmap);
        return map_utilities.map_remove(modification_counting_map_map(mcmap), key);
    }

    public static SubLObject new_map_object_with_same_properties_modification_counting_map_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return new_modification_counting_map(map_utilities.new_map_with_same_properties(modification_counting_map_map(v_object)));
    }

    public static SubLObject map_object_arbitrary_key_modification_counting_map_method(final SubLObject v_object) {
        return map_utilities.map_arbitrary_key(modification_counting_map_map(v_object), UNPROVIDED);
    }

    public static SubLObject new_map_object_iterator_modification_counting_map_method(final SubLObject v_object) {
        return map_utilities.new_map_iterator(modification_counting_map_map(v_object));
    }

    public static SubLObject map_object_remove_all_modification_counting_map_method(final SubLObject v_object) {
        return modification_counting_map_remove_all(v_object);
    }

    public static SubLObject modification_counting_map_remove_all(final SubLObject mcmap) {
        return map_utilities.map_remove_all(modification_counting_map_map(mcmap));
    }

    public static SubLObject map_object_keys_modification_counting_map_method(final SubLObject v_object) {
        return map_utilities.map_keys(modification_counting_map_map(v_object));
    }

    public static SubLObject map_object_values_modification_counting_map_method(final SubLObject v_object) {
        return map_utilities.map_values(modification_counting_map_map(v_object));
    }

    public static SubLObject new_modification_counting_map(final SubLObject map) {
        final SubLObject mcmap = make_modification_counting_map(UNPROVIDED);
        _csetf_mcmap_map(mcmap, map);
        _csetf_mcmap_put_count(mcmap, ZERO_INTEGER);
        _csetf_mcmap_remove_count(mcmap, ZERO_INTEGER);
        return mcmap;
    }

    public static SubLObject modification_counting_map_map(final SubLObject map) {
        assert NIL != modification_counting_map_p(map) : "modification_counting_map.modification_counting_map_p(map) " + "CommonSymbols.NIL != modification_counting_map.modification_counting_map_p(map) " + map;
        return mcmap_map(map);
    }

    public static SubLObject modification_counting_map_put_count(final SubLObject map) {
        assert NIL != modification_counting_map_p(map) : "modification_counting_map.modification_counting_map_p(map) " + "CommonSymbols.NIL != modification_counting_map.modification_counting_map_p(map) " + map;
        return mcmap_put_count(map);
    }

    public static SubLObject mcmap_note_put(final SubLObject map) {
        _csetf_mcmap_put_count(map, add(mcmap_put_count(map), ONE_INTEGER));
        return mcmap_put_count(map);
    }

    public static SubLObject modification_counting_map_remove_count(final SubLObject map) {
        assert NIL != modification_counting_map_p(map) : "modification_counting_map.modification_counting_map_p(map) " + "CommonSymbols.NIL != modification_counting_map.modification_counting_map_p(map) " + map;
        return mcmap_remove_count(map);
    }

    public static SubLObject mcmap_note_remove(final SubLObject map) {
        _csetf_mcmap_remove_count(map, add(mcmap_remove_count(map), ONE_INTEGER));
        return mcmap_remove_count(map);
    }

    public static SubLObject sxhash_modification_counting_map_method(final SubLObject v_object) {
        return sxhash_modification_counting_map(v_object);
    }

    public static SubLObject sxhash_modification_counting_map(final SubLObject map) {
        return Sxhash.sxhash(mcmap_map(map));
    }

    public static SubLObject declare_modification_counting_map_file() {
        declareFunction("create_modification_counting_map", "CREATE-MODIFICATION-COUNTING-MAP", 1, 0, false);
        declareFunction("modification_counting_map_print_function_trampoline", "MODIFICATION-COUNTING-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("modification_counting_map_p", "MODIFICATION-COUNTING-MAP-P", 1, 0, false);
        new modification_counting_map.$modification_counting_map_p$UnaryFunction();
        declareFunction("mcmap_map", "MCMAP-MAP", 1, 0, false);
        declareFunction("mcmap_put_count", "MCMAP-PUT-COUNT", 1, 0, false);
        declareFunction("mcmap_remove_count", "MCMAP-REMOVE-COUNT", 1, 0, false);
        declareFunction("_csetf_mcmap_map", "_CSETF-MCMAP-MAP", 2, 0, false);
        declareFunction("_csetf_mcmap_put_count", "_CSETF-MCMAP-PUT-COUNT", 2, 0, false);
        declareFunction("_csetf_mcmap_remove_count", "_CSETF-MCMAP-REMOVE-COUNT", 2, 0, false);
        declareFunction("make_modification_counting_map", "MAKE-MODIFICATION-COUNTING-MAP", 0, 1, false);
        declareFunction("visit_defstruct_modification_counting_map", "VISIT-DEFSTRUCT-MODIFICATION-COUNTING-MAP", 2, 0, false);
        declareFunction("visit_defstruct_object_modification_counting_map_method", "VISIT-DEFSTRUCT-OBJECT-MODIFICATION-COUNTING-MAP-METHOD", 2, 0, false);
        declareFunction("print_modification_counting_map", "PRINT-MODIFICATION-COUNTING-MAP", 3, 0, false);
        declareFunction("is_map_object_p_modification_counting_map_method", "IS-MAP-OBJECT-P-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_size_modification_counting_map_method", "MAP-OBJECT-SIZE-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_test_modification_counting_map_method", "MAP-OBJECT-TEST-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_put_modification_counting_map_method", "MAP-OBJECT-PUT-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false);
        declareFunction("modification_counting_map_put", "MODIFICATION-COUNTING-MAP-PUT", 3, 0, false);
        declareFunction("map_object_get_modification_counting_map_method", "MAP-OBJECT-GET-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false);
        declareFunction("modification_counting_map_get", "MODIFICATION-COUNTING-MAP-GET", 3, 0, false);
        declareFunction("map_object_get_without_values_modification_counting_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false);
        declareFunction("modification_counting_map_get_without_values", "MODIFICATION-COUNTING-MAP-GET-WITHOUT-VALUES", 3, 0, false);
        declareFunction("map_object_remove_modification_counting_map_method", "MAP-OBJECT-REMOVE-MODIFICATION-COUNTING-MAP-METHOD", 2, 0, false);
        declareFunction("modification_counting_map_remove", "MODIFICATION-COUNTING-MAP-REMOVE", 2, 0, false);
        declareFunction("new_map_object_with_same_properties_modification_counting_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false);
        declareFunction("map_object_arbitrary_key_modification_counting_map_method", "MAP-OBJECT-ARBITRARY-KEY-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("new_map_object_iterator_modification_counting_map_method", "NEW-MAP-OBJECT-ITERATOR-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_remove_all_modification_counting_map_method", "MAP-OBJECT-REMOVE-ALL-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("modification_counting_map_remove_all", "MODIFICATION-COUNTING-MAP-REMOVE-ALL", 1, 0, false);
        declareFunction("map_object_keys_modification_counting_map_method", "MAP-OBJECT-KEYS-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_values_modification_counting_map_method", "MAP-OBJECT-VALUES-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("new_modification_counting_map", "NEW-MODIFICATION-COUNTING-MAP", 1, 0, false);
        declareFunction("modification_counting_map_map", "MODIFICATION-COUNTING-MAP-MAP", 1, 0, false);
        declareFunction("modification_counting_map_put_count", "MODIFICATION-COUNTING-MAP-PUT-COUNT", 1, 0, false);
        declareFunction("mcmap_note_put", "MCMAP-NOTE-PUT", 1, 0, false);
        declareFunction("modification_counting_map_remove_count", "MODIFICATION-COUNTING-MAP-REMOVE-COUNT", 1, 0, false);
        declareFunction("mcmap_note_remove", "MCMAP-NOTE-REMOVE", 1, 0, false);
        declareFunction("sxhash_modification_counting_map_method", "SXHASH-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false);
        declareFunction("sxhash_modification_counting_map", "SXHASH-MODIFICATION-COUNTING-MAP", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_modification_counting_map_file() {
        defconstant("*DTP-MODIFICATION-COUNTING-MAP*", MODIFICATION_COUNTING_MAP);
        return NIL;
    }

    public static SubLObject setup_modification_counting_map_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MODIFICATION_COUNTING_MAP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(MCMAP_MAP, _CSETF_MCMAP_MAP);
        def_csetf(MCMAP_PUT_COUNT, _CSETF_MCMAP_PUT_COUNT);
        def_csetf(MCMAP_REMOVE_COUNT, _CSETF_MCMAP_REMOVE_COUNT);
        identity(MODIFICATION_COUNTING_MAP);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MODIFICATION_COUNTING_MAP_METHOD));
        note_funcall_helper_function(PRINT_MODIFICATION_COUNTING_MAP);
        register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function($sym33$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_MODIFICATION_COUNTING_MAP_MET));
        register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_MODIFICATION_COUNTING_MAP_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), symbol_function(SXHASH_MODIFICATION_COUNTING_MAP_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_modification_counting_map_file();
    }

    @Override
    public void initializeVariables() {
        init_modification_counting_map_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_modification_counting_map_file();
    }

    static {










































    }

    public static final class $modification_counting_map_native extends SubLStructNative {
        public SubLObject $map;

        public SubLObject $put_count;

        public SubLObject $remove_count;

        private static final SubLStructDeclNative structDecl;

        private $modification_counting_map_native() {
            this.$map = Lisp.NIL;
            this.$put_count = Lisp.NIL;
            this.$remove_count = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$map;
        }

        @Override
        public SubLObject getField3() {
            return this.$put_count;
        }

        @Override
        public SubLObject getField4() {
            return this.$remove_count;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$map = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$put_count = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$remove_count = value;
        }

        static {
            structDecl = makeStructDeclNative($modification_counting_map_native.class, MODIFICATION_COUNTING_MAP, MODIFICATION_COUNTING_MAP_P, $list3, $list4, new String[]{ "$map", "$put_count", "$remove_count" }, $list5, $list6, PRINT_MODIFICATION_COUNTING_MAP);
        }
    }

    public static final class $modification_counting_map_p$UnaryFunction extends UnaryFunction {
        public $modification_counting_map_p$UnaryFunction() {
            super(extractFunctionNamed("MODIFICATION-COUNTING-MAP-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return modification_counting_map_p(arg1);
        }
    }
}

/**
 * Total time: 147 ms
 */
