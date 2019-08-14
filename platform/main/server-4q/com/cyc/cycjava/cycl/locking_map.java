package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

 public final class locking_map extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new locking_map();

    public static final String myName = "com.cyc.cycjava_2.cycl.locking_map";


    // defconstant
    public static final SubLSymbol $dtp_locking_map$ = makeSymbol("*DTP-LOCKING-MAP*");

    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLSymbol LOCKING_MAP = makeSymbol("LOCKING-MAP");

    private static final SubLSymbol LOCKING_MAP_P = makeSymbol("LOCKING-MAP-P");

    private static final SubLList $list3 = list(makeSymbol("MAP"), makeSymbol("LOCK"));

    private static final SubLList $list4 = list(makeKeyword("MAP"), $LOCK);

    private static final SubLList $list5 = list(makeSymbol("LMAP-MAP"), makeSymbol("LMAP-LOCK"));

    private static final SubLList $list6 = list(makeSymbol("_CSETF-LMAP-MAP"), makeSymbol("_CSETF-LMAP-LOCK"));

    private static final SubLSymbol PRINT_LOCKING_MAP = makeSymbol("PRINT-LOCKING-MAP");

    private static final SubLSymbol LOCKING_MAP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKING-MAP-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LOCKING-MAP-P"));

    private static final SubLSymbol LMAP_MAP = makeSymbol("LMAP-MAP");

    private static final SubLSymbol _CSETF_LMAP_MAP = makeSymbol("_CSETF-LMAP-MAP");

    private static final SubLSymbol LMAP_LOCK = makeSymbol("LMAP-LOCK");

    private static final SubLSymbol _CSETF_LMAP_LOCK = makeSymbol("_CSETF-LMAP-LOCK");





    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_LOCKING_MAP = makeSymbol("MAKE-LOCKING-MAP");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCKING_MAP_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKING-MAP-METHOD");

    private static final SubLString $str22$_LOCKING_MAP__A_ = makeString("<LOCKING-MAP ~A>");

    private static final SubLSymbol IS_MAP_OBJECT_P_LOCKING_MAP_METHOD = makeSymbol("IS-MAP-OBJECT-P-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_SIZE_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-SIZE-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-TEST-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-PUT-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-LOCKING-MAP-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_LOCKING_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-LOCKING-MAP-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_LOCKING_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEYS_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-KEYS-LOCKING-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_VALUES_LOCKING_MAP_METHOD = makeSymbol("MAP-OBJECT-VALUES-LOCKING-MAP-METHOD");

    private static final SubLString $$$Locking_Map = makeString("Locking Map");

    private static final SubLList $list37 = list(makeSymbol("MAP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");

    private static final SubLSymbol LOCKING_MAP_LOCK = makeSymbol("LOCKING-MAP-LOCK");

    private static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

    private static final SubLSymbol SXHASH_LOCKING_MAP_METHOD = makeSymbol("SXHASH-LOCKING-MAP-METHOD");

    public static SubLObject create_locking_map(final SubLObject map) {
        assert NIL != map_utilities.map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        return new_locking_map(map);
    }

    public static SubLObject locking_map_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_locking_map(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject locking_map_p(final SubLObject v_object) {
        return v_object.getClass() == $locking_map_native.class ? T : NIL;
    }

    public static SubLObject lmap_map(final SubLObject v_object) {
        assert NIL != locking_map_p(v_object) : "locking_map.locking_map_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject lmap_lock(final SubLObject v_object) {
        assert NIL != locking_map_p(v_object) : "locking_map.locking_map_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_lmap_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != locking_map_p(v_object) : "locking_map.locking_map_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_lmap_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != locking_map_p(v_object) : "locking_map.locking_map_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_locking_map(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $locking_map_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MAP)) {
                _csetf_lmap_map(v_new, current_value);
            } else
                if (pcase_var.eql($LOCK)) {
                    _csetf_lmap_lock(v_new, current_value);
                } else {
                    Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_locking_map(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LOCKING_MAP, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MAP, lmap_map(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, lmap_lock(obj));
        funcall(visitor_fn, obj, $END, MAKE_LOCKING_MAP, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_locking_map_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locking_map(obj, visitor_fn);
    }

    public static SubLObject print_locking_map(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str22$_LOCKING_MAP__A_, locking_map_map(v_object));
        return v_object;
    }

    public static SubLObject is_map_object_p_locking_map_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject map_object_size_locking_map_method(final SubLObject v_object) {
        SubLObject size = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            size = map_utilities.map_size(locking_map_map(v_object));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return size;
    }

    public static SubLObject map_object_test_locking_map_method(final SubLObject v_object) {
        SubLObject test = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            test = map_utilities.map_test(locking_map_map(v_object));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return test;
    }

    public static SubLObject map_object_put_locking_map_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return locking_map_put(v_object, key, value);
    }

    public static SubLObject locking_map_put(final SubLObject lmap, final SubLObject key, final SubLObject value) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(lmap);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            result = map_utilities.map_put(locking_map_map(lmap), key, value);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject map_object_get_locking_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return locking_map_get(v_object, key, not_found);
    }

    public static SubLObject locking_map_get(final SubLObject lmap, final SubLObject key, final SubLObject not_found) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject foundP = NIL;
        final SubLObject rw_lock_var = locking_map_lock(lmap);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            thread.resetMultipleValues();
            final SubLObject result_$1 = map_utilities.map_get(locking_map_map(lmap), key, not_found);
            final SubLObject foundP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$1;
            foundP = foundP_$2;
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return values(result, foundP);
    }

    public static SubLObject map_object_get_without_values_locking_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return locking_map_get_without_values(v_object, key, not_found);
    }

    public static SubLObject locking_map_get_without_values(final SubLObject lmap, final SubLObject key, final SubLObject not_found) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(lmap);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = map_utilities.map_get_without_values(locking_map_map(lmap), key, not_found);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject map_object_remove_locking_map_method(final SubLObject v_object, final SubLObject key) {
        return locking_map_remove(v_object, key);
    }

    public static SubLObject locking_map_remove(final SubLObject lmap, final SubLObject key) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(lmap);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            result = map_utilities.map_remove(locking_map_map(lmap), key);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject new_map_object_with_same_properties_locking_map_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = new_locking_map(map_utilities.new_map_with_same_properties(locking_map_map(v_object)));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject map_object_arbitrary_key_locking_map_method(final SubLObject v_object) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = map_utilities.map_arbitrary_key(locking_map_map(v_object), UNPROVIDED);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject new_map_object_iterator_locking_map_method(final SubLObject v_object) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = map_utilities.new_map_iterator(locking_map_map(v_object));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject map_object_remove_all_locking_map_method(final SubLObject v_object) {
        return locking_map_remove_all(v_object);
    }

    public static SubLObject locking_map_remove_all(final SubLObject lmap) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(lmap);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            result = map_utilities.map_remove_all(locking_map_map(lmap));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject map_object_keys_locking_map_method(final SubLObject v_object) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = map_utilities.map_keys(locking_map_map(v_object));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject map_object_values_locking_map_method(final SubLObject v_object) {
        SubLObject result = NIL;
        final SubLObject rw_lock_var = locking_map_lock(v_object);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            result = map_utilities.map_values(locking_map_map(v_object));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject new_locking_map(final SubLObject map) {
        final SubLObject lmap = make_locking_map(UNPROVIDED);
        _csetf_lmap_map(lmap, map);
        _csetf_lmap_lock(lmap, ReadWriteLocks.new_rw_lock($$$Locking_Map));
        return lmap;
    }

    public static SubLObject locking_map_map(final SubLObject map) {
        assert NIL != locking_map_p(map) : "locking_map.locking_map_p(map) " + "CommonSymbols.NIL != locking_map.locking_map_p(map) " + map;
        return lmap_map(map);
    }

    public static SubLObject locking_map_lock(final SubLObject map) {
        assert NIL != locking_map_p(map) : "locking_map.locking_map_p(map) " + "CommonSymbols.NIL != locking_map.locking_map_p(map) " + map;
        return lmap_lock(map);
    }

    public static SubLObject with_locking_map_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        map = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_WRITER_LOCK, list(list(LOCKING_MAP_LOCK, map)), append(body, NIL));
    }

    public static SubLObject with_locking_map_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        map = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_READER_LOCK, list(list(LOCKING_MAP_LOCK, map)), append(body, NIL));
    }

    public static SubLObject sxhash_locking_map_method(final SubLObject v_object) {
        return sxhash_locking_map(v_object);
    }

    public static SubLObject sxhash_locking_map(final SubLObject map) {
        return Sxhash.sxhash(lmap_map(map));
    }

    public static SubLObject declare_locking_map_file() {
        declareFunction("create_locking_map", "CREATE-LOCKING-MAP", 1, 0, false);
        declareFunction("locking_map_print_function_trampoline", "LOCKING-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("locking_map_p", "LOCKING-MAP-P", 1, 0, false);
        new locking_map.$locking_map_p$UnaryFunction();
        declareFunction("lmap_map", "LMAP-MAP", 1, 0, false);
        declareFunction("lmap_lock", "LMAP-LOCK", 1, 0, false);
        declareFunction("_csetf_lmap_map", "_CSETF-LMAP-MAP", 2, 0, false);
        declareFunction("_csetf_lmap_lock", "_CSETF-LMAP-LOCK", 2, 0, false);
        declareFunction("make_locking_map", "MAKE-LOCKING-MAP", 0, 1, false);
        declareFunction("visit_defstruct_locking_map", "VISIT-DEFSTRUCT-LOCKING-MAP", 2, 0, false);
        declareFunction("visit_defstruct_object_locking_map_method", "VISIT-DEFSTRUCT-OBJECT-LOCKING-MAP-METHOD", 2, 0, false);
        declareFunction("print_locking_map", "PRINT-LOCKING-MAP", 3, 0, false);
        declareFunction("is_map_object_p_locking_map_method", "IS-MAP-OBJECT-P-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_size_locking_map_method", "MAP-OBJECT-SIZE-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_test_locking_map_method", "MAP-OBJECT-TEST-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_put_locking_map_method", "MAP-OBJECT-PUT-LOCKING-MAP-METHOD", 3, 0, false);
        declareFunction("locking_map_put", "LOCKING-MAP-PUT", 3, 0, false);
        declareFunction("map_object_get_locking_map_method", "MAP-OBJECT-GET-LOCKING-MAP-METHOD", 3, 0, false);
        declareFunction("locking_map_get", "LOCKING-MAP-GET", 3, 0, false);
        declareFunction("map_object_get_without_values_locking_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-LOCKING-MAP-METHOD", 3, 0, false);
        declareFunction("locking_map_get_without_values", "LOCKING-MAP-GET-WITHOUT-VALUES", 3, 0, false);
        declareFunction("map_object_remove_locking_map_method", "MAP-OBJECT-REMOVE-LOCKING-MAP-METHOD", 2, 0, false);
        declareFunction("locking_map_remove", "LOCKING-MAP-REMOVE", 2, 0, false);
        declareFunction("new_map_object_with_same_properties_locking_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-LOCKING-MAP-METHOD", 3, 0, false);
        declareFunction("map_object_arbitrary_key_locking_map_method", "MAP-OBJECT-ARBITRARY-KEY-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("new_map_object_iterator_locking_map_method", "NEW-MAP-OBJECT-ITERATOR-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_remove_all_locking_map_method", "MAP-OBJECT-REMOVE-ALL-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("locking_map_remove_all", "LOCKING-MAP-REMOVE-ALL", 1, 0, false);
        declareFunction("map_object_keys_locking_map_method", "MAP-OBJECT-KEYS-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_values_locking_map_method", "MAP-OBJECT-VALUES-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("new_locking_map", "NEW-LOCKING-MAP", 1, 0, false);
        declareFunction("locking_map_map", "LOCKING-MAP-MAP", 1, 0, false);
        declareFunction("locking_map_lock", "LOCKING-MAP-LOCK", 1, 0, false);
        declareMacro("with_locking_map_writer_lock", "WITH-LOCKING-MAP-WRITER-LOCK");
        declareMacro("with_locking_map_reader_lock", "WITH-LOCKING-MAP-READER-LOCK");
        declareFunction("sxhash_locking_map_method", "SXHASH-LOCKING-MAP-METHOD", 1, 0, false);
        declareFunction("sxhash_locking_map", "SXHASH-LOCKING-MAP", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_locking_map_file() {
        defconstant("*DTP-LOCKING-MAP*", LOCKING_MAP);
        return NIL;
    }

    public static SubLObject setup_locking_map_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(LOCKING_MAP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(LMAP_MAP, _CSETF_LMAP_MAP);
        def_csetf(LMAP_LOCK, _CSETF_LMAP_LOCK);
        identity(LOCKING_MAP);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKING_MAP_METHOD));
        note_funcall_helper_function(PRINT_LOCKING_MAP);
        register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_LOCKING_MAP_METHOD));
        register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_LOCKING_MAP_METHOD));
        register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_LOCKING_MAP_METHOD));
        register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_LOCKING_MAP_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), symbol_function(SXHASH_LOCKING_MAP_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_locking_map_file();
    }

    @Override
    public void initializeVariables() {
        init_locking_map_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_locking_map_file();
    }

    static {












































    }

    public static final class $locking_map_native extends SubLStructNative {
        public SubLObject $map;

        public SubLObject $lock;

        private static final SubLStructDeclNative structDecl;

        private $locking_map_native() {
            this.$map = Lisp.NIL;
            this.$lock = Lisp.NIL;
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
            return this.$lock;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$map = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }

        static {
            structDecl = makeStructDeclNative($locking_map_native.class, LOCKING_MAP, LOCKING_MAP_P, $list3, $list4, new String[]{ "$map", "$lock" }, $list5, $list6, PRINT_LOCKING_MAP);
        }
    }

    public static final class $locking_map_p$UnaryFunction extends UnaryFunction {
        public $locking_map_p$UnaryFunction() {
            super(extractFunctionNamed("LOCKING-MAP-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return locking_map_p(arg1);
        }
    }
}

/**
 * Total time: 153 ms
 */
