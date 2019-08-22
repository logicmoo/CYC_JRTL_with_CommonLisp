package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_current_common_symbols;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols_simple;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.unprovided_argumentP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
 public final class file_backed_cache extends SubLTranslatedFile {
    public static final SubLFile me = new file_backed_cache();

    public static final String myName = "com.cyc.cycjava.cycl.file_backed_cache";

    public static final String myFingerPrint = "e8cfe5ce638801b710bc99f3757c03657727e42b6b3334885a21fc5606070efa";

    // deflexical
    private static final SubLSymbol $fbc_reset_lock$ = makeSymbol("*FBC-RESET-LOCK*");



    // defconstant
    public static final SubLSymbol $dtp_file_backed_cache$ = makeSymbol("*DTP-FILE-BACKED-CACHE*");

    // Internal Constants
    public static final SubLString $str0$fbc_reset_lock = makeString("fbc-reset-lock");

    public static final SubLList $list1 = list(makeString("application.file-backed-cache.base-path"));

    public static final SubLSymbol $file_backed_cache_base_path$ = makeSymbol("*FILE-BACKED-CACHE-BASE-PATH*");

    public static final SubLString $str3$data_caches_ = makeString("data/caches/");



    public static final SubLSymbol FILE_BACKED_CACHE = makeSymbol("FILE-BACKED-CACHE");

    public static final SubLSymbol FILE_BACKED_CACHE_P = makeSymbol("FILE-BACKED-CACHE-P");

    public static final SubLList $list7 = list(new SubLObject[]{ makeSymbol("FILE-HASH-TABLE-CACHE"), makeSymbol("LOCAL-CACHE"), makeSymbol("FILE-HASH-TABLE-PATH"), makeSymbol("SHOULD-PRELOAD-CACHE"), makeSymbol("IS-FORT-CACHE"), makeSymbol("FHT-CACHE-PERCENTAGE"), makeSymbol("TEST"), makeSymbol("MODE"), makeSymbol("IS-BUSY") });

    public static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("FILE-HASH-TABLE-CACHE"), makeKeyword("LOCAL-CACHE"), makeKeyword("FILE-HASH-TABLE-PATH"), makeKeyword("SHOULD-PRELOAD-CACHE"), makeKeyword("IS-FORT-CACHE"), makeKeyword("FHT-CACHE-PERCENTAGE"), makeKeyword("TEST"), makeKeyword("MODE"), makeKeyword("IS-BUSY") });

    public static final SubLList $list9 = list(new SubLObject[]{ makeSymbol("FBC-FILE-HASH-TABLE-CACHE"), makeSymbol("FBC-LOCAL-CACHE"), makeSymbol("FBC-FILE-HASH-TABLE-PATH"), makeSymbol("FBC-SHOULD-PRELOAD-CACHE"), makeSymbol("FBC-IS-FORT-CACHE"), makeSymbol("FBC-FHT-CACHE-PERCENTAGE"), makeSymbol("FBC-TEST"), makeSymbol("FBC-MODE"), makeSymbol("FBC-IS-BUSY") });

    public static final SubLList $list10 = list(new SubLObject[]{ makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-CACHE"), makeSymbol("_CSETF-FBC-LOCAL-CACHE"), makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-PATH"), makeSymbol("_CSETF-FBC-SHOULD-PRELOAD-CACHE"), makeSymbol("_CSETF-FBC-IS-FORT-CACHE"), makeSymbol("_CSETF-FBC-FHT-CACHE-PERCENTAGE"), makeSymbol("_CSETF-FBC-TEST"), makeSymbol("_CSETF-FBC-MODE"), makeSymbol("_CSETF-FBC-IS-BUSY") });

    public static final SubLSymbol PRINT_FBC = makeSymbol("PRINT-FBC");

    public static final SubLSymbol FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list13 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-BACKED-CACHE-P"));

    private static final SubLSymbol FBC_FILE_HASH_TABLE_CACHE = makeSymbol("FBC-FILE-HASH-TABLE-CACHE");

    private static final SubLSymbol _CSETF_FBC_FILE_HASH_TABLE_CACHE = makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-CACHE");

    private static final SubLSymbol FBC_LOCAL_CACHE = makeSymbol("FBC-LOCAL-CACHE");

    private static final SubLSymbol _CSETF_FBC_LOCAL_CACHE = makeSymbol("_CSETF-FBC-LOCAL-CACHE");

    private static final SubLSymbol FBC_FILE_HASH_TABLE_PATH = makeSymbol("FBC-FILE-HASH-TABLE-PATH");

    private static final SubLSymbol _CSETF_FBC_FILE_HASH_TABLE_PATH = makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-PATH");

    private static final SubLSymbol FBC_SHOULD_PRELOAD_CACHE = makeSymbol("FBC-SHOULD-PRELOAD-CACHE");

    private static final SubLSymbol _CSETF_FBC_SHOULD_PRELOAD_CACHE = makeSymbol("_CSETF-FBC-SHOULD-PRELOAD-CACHE");

    private static final SubLSymbol FBC_IS_FORT_CACHE = makeSymbol("FBC-IS-FORT-CACHE");

    private static final SubLSymbol _CSETF_FBC_IS_FORT_CACHE = makeSymbol("_CSETF-FBC-IS-FORT-CACHE");

    private static final SubLSymbol FBC_FHT_CACHE_PERCENTAGE = makeSymbol("FBC-FHT-CACHE-PERCENTAGE");

    private static final SubLSymbol _CSETF_FBC_FHT_CACHE_PERCENTAGE = makeSymbol("_CSETF-FBC-FHT-CACHE-PERCENTAGE");

    private static final SubLSymbol FBC_TEST = makeSymbol("FBC-TEST");

    private static final SubLSymbol _CSETF_FBC_TEST = makeSymbol("_CSETF-FBC-TEST");

    private static final SubLSymbol FBC_MODE = makeSymbol("FBC-MODE");

    private static final SubLSymbol _CSETF_FBC_MODE = makeSymbol("_CSETF-FBC-MODE");

    private static final SubLSymbol FBC_IS_BUSY = makeSymbol("FBC-IS-BUSY");

    private static final SubLSymbol _CSETF_FBC_IS_BUSY = makeSymbol("_CSETF-FBC-IS-BUSY");

    private static final SubLSymbol $FILE_HASH_TABLE_CACHE = makeKeyword("FILE-HASH-TABLE-CACHE");



    private static final SubLSymbol $FILE_HASH_TABLE_PATH = makeKeyword("FILE-HASH-TABLE-PATH");

    private static final SubLSymbol $SHOULD_PRELOAD_CACHE = makeKeyword("SHOULD-PRELOAD-CACHE");

    private static final SubLSymbol $IS_FORT_CACHE = makeKeyword("IS-FORT-CACHE");

    private static final SubLSymbol $FHT_CACHE_PERCENTAGE = makeKeyword("FHT-CACHE-PERCENTAGE");







    private static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FILE_BACKED_CACHE = makeSymbol("MAKE-FILE-BACKED-CACHE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-METHOD");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLString $str48$_FILE_BACKED_CACHE__A_ = makeString("<FILE-BACKED-CACHE ~A>");

    private static final SubLString $str49$_INVALID_FILE_BACKED_CACHE_ = makeString("<INVALID FILE-BACKED-CACHE>");





    private static final SubLString $str52$Preloading_file_backed_cache_ = makeString("Preloading file-backed cache.");





    private static final SubLSymbol $FBC_NOT_FOUND_VALUE = makeKeyword("FBC-NOT-FOUND-VALUE");

    private static final SubLString $str56$_S_has_no_associated_file_hash_ta = makeString("~S has no associated file hash table.");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLString $str60$tmp_ = makeString("tmp/");

    private static final SubLString $$$The_Not_Present_Marker = makeString("The Not Present Marker");

    public static SubLObject file_backed_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fbc(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_backed_cache_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$file_backed_cache_native.class ? T : NIL;
    }

    public static SubLObject fbc_file_hash_table_cache(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fbc_local_cache(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject fbc_file_hash_table_path(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject fbc_should_preload_cache(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject fbc_is_fort_cache(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject fbc_fht_cache_percentage(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject fbc_test(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject fbc_mode(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject fbc_is_busy(final SubLObject v_object) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_fbc_file_hash_table_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fbc_local_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fbc_file_hash_table_path(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fbc_should_preload_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fbc_is_fort_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_fbc_fht_cache_percentage(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_fbc_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_fbc_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_fbc_is_busy(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_p(v_object) : "file_backed_cache.file_backed_cache_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_file_backed_cache(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $file_backed_cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FILE_HASH_TABLE_CACHE)) {
                _csetf_fbc_file_hash_table_cache(v_new, current_value);
            } else
                if (pcase_var.eql($LOCAL_CACHE)) {
                    _csetf_fbc_local_cache(v_new, current_value);
                } else
                    if (pcase_var.eql($FILE_HASH_TABLE_PATH)) {
                        _csetf_fbc_file_hash_table_path(v_new, current_value);
                    } else
                        if (pcase_var.eql($SHOULD_PRELOAD_CACHE)) {
                            _csetf_fbc_should_preload_cache(v_new, current_value);
                        } else
                            if (pcase_var.eql($IS_FORT_CACHE)) {
                                _csetf_fbc_is_fort_cache(v_new, current_value);
                            } else
                                if (pcase_var.eql($FHT_CACHE_PERCENTAGE)) {
                                    _csetf_fbc_fht_cache_percentage(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TEST)) {
                                        _csetf_fbc_test(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MODE)) {
                                            _csetf_fbc_mode(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($IS_BUSY)) {
                                                _csetf_fbc_is_busy(v_new, current_value);
                                            } else {
                                                Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_backed_cache(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_BACKED_CACHE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FILE_HASH_TABLE_CACHE, fbc_file_hash_table_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCAL_CACHE, fbc_local_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $FILE_HASH_TABLE_PATH, fbc_file_hash_table_path(obj));
        funcall(visitor_fn, obj, $SLOT, $SHOULD_PRELOAD_CACHE, fbc_should_preload_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $IS_FORT_CACHE, fbc_is_fort_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $FHT_CACHE_PERCENTAGE, fbc_fht_cache_percentage(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, fbc_test(obj));
        funcall(visitor_fn, obj, $SLOT, $MODE, fbc_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $IS_BUSY, fbc_is_busy(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_BACKED_CACHE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_backed_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_backed_cache(obj, visitor_fn);
    }

    public static SubLObject file_backed_cache_create(final SubLObject file_hash_table_path, SubLObject should_preload_cache, SubLObject is_fort_cache, SubLObject fht_cache_percentage, SubLObject test, SubLObject mode) {
        if (should_preload_cache == UNPROVIDED) {
            should_preload_cache = NIL;
        }
        if (is_fort_cache == UNPROVIDED) {
            is_fort_cache = NIL;
        }
        if (fht_cache_percentage == UNPROVIDED) {
            fht_cache_percentage = file_hash_table.$fht_cache_percentage$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (mode == UNPROVIDED) {
            mode = $IMAGE_INDEPENDENT_CFASL;
        }
        final SubLObject result = make_file_backed_cache(UNPROVIDED);
        _csetf_fbc_file_hash_table_path(result, file_hash_table_path);
        _csetf_fbc_should_preload_cache(result, should_preload_cache);
        _csetf_fbc_is_fort_cache(result, is_fort_cache);
        _csetf_fbc_fht_cache_percentage(result, fht_cache_percentage);
        _csetf_fbc_test(result, test);
        _csetf_fbc_mode(result, mode);
        _csetf_fbc_is_busy(result, NIL);
        fbc_initialize(result);
        return result;
    }

    public static SubLObject print_fbc(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != file_backed_cache_p(v_object)) {
            format(stream, $str48$_FILE_BACKED_CACHE__A_, fbc_file_hash_table_path(v_object));
        } else {
            format(stream, $str49$_INVALID_FILE_BACKED_CACHE_);
        }
        return NIL;
    }

    public static SubLObject fbc_initialize(final SubLObject fbc) {
        assert NIL != file_backed_cache_p(fbc) : "file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) " + fbc;
        return fbc_initialize_internal(fbc, NIL);
    }

    public static SubLObject fbc_initialize_internal(final SubLObject fbc, final SubLObject preserve_local_cacheP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == preserve_local_cacheP) {
            _csetf_fbc_local_cache(fbc, make_hash_table(ZERO_INTEGER, fbc_test(fbc), UNPROVIDED));
        }
        if (NIL == Filesys.probe_file(fbc_file_hash_table_path(fbc))) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding(thread);
        try {
            file_hash_table.$fht_cache_percentage$.bind(fbc_fht_cache_percentage(fbc), thread);
            _csetf_fbc_file_hash_table_cache(fbc, file_hash_table.open_file_hash_table_read_only(fbc_file_hash_table_path(fbc), fbc_test(fbc), fbc_mode(fbc)));
            if ((NIL == preserve_local_cacheP) && (NIL != fbc_should_preload_cache(fbc))) {
                preload_entire_file_hash_table(fbc);
            }
        } finally {
            file_hash_table.$fht_cache_percentage$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject file_backed_cache_reconnect(final SubLObject fbc, SubLObject file_cache_path) {
        if (file_cache_path == UNPROVIDED) {
            file_cache_path = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_backed_cache_p(fbc) : "file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) " + fbc;
        SubLObject release = NIL;
        try {
            release = seize_lock($fbc_reset_lock$.getGlobalValue());
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        _csetf_fbc_is_busy(fbc, T);
                        if (NIL != file_cache_path) {
                            _csetf_fbc_file_hash_table_path(fbc, file_cache_path);
                        }
                        final SubLObject preserve_local_cacheP = T;
                        fbc_initialize_internal(fbc, preserve_local_cacheP);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != msg) {
                Errors.warn(msg);
            }
            _csetf_fbc_is_busy(fbc, NIL);
        } finally {
            if (NIL != release) {
                release_lock($fbc_reset_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject file_backed_cache_reset(final SubLObject fbc, SubLObject file_cache_path) {
        if (file_cache_path == UNPROVIDED) {
            file_cache_path = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_backed_cache_p(fbc) : "file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) " + fbc;
        SubLObject release = NIL;
        try {
            release = seize_lock($fbc_reset_lock$.getGlobalValue());
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        _csetf_fbc_is_busy(fbc, T);
                        if (NIL != fbc_file_hash_table_cache(fbc)) {
                            file_hash_table.finalize_file_hash_table(fbc_file_hash_table_cache(fbc));
                        }
                        if (NIL != file_cache_path) {
                            _csetf_fbc_file_hash_table_path(fbc, file_cache_path);
                        }
                        _csetf_fbc_file_hash_table_cache(fbc, NIL);
                        _csetf_fbc_local_cache(fbc, NIL);
                        fbc_initialize(fbc);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != msg) {
                Errors.warn(msg);
            }
            _csetf_fbc_is_busy(fbc, NIL);
        } finally {
            if (NIL != release) {
                release_lock($fbc_reset_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject file_backed_cache_finalize(final SubLObject fbc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($fbc_reset_lock$.getGlobalValue());
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != fbc_file_hash_table_cache(fbc)) {
                            file_hash_table.finalize_file_hash_table(fbc_file_hash_table_cache(fbc));
                        }
                        _csetf_fbc_file_hash_table_cache(fbc, NIL);
                        _csetf_fbc_local_cache(fbc, NIL);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != msg) {
                Errors.warn(msg);
            }
        } finally {
            if (NIL != release) {
                release_lock($fbc_reset_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject file_backed_cache_change_stream_buffer_size(final SubLObject fbc, final SubLObject new_stream_buffer_size) {
        SubLObject release = NIL;
        try {
            release = seize_lock($fbc_reset_lock$.getGlobalValue());
            _csetf_fbc_file_hash_table_cache(fbc, file_hash_table.file_hash_table_change_stream_buffer_size(fbc_file_hash_table_cache(fbc), new_stream_buffer_size));
        } finally {
            if (NIL != release) {
                release_lock($fbc_reset_lock$.getGlobalValue());
            }
        }
        return fbc;
    }

    public static SubLObject file_backed_cache_enable_memory_mapping(final SubLObject fbc) {
        file_hash_table.file_hash_table_enable_memory_mapping(fbc_file_hash_table_cache(fbc));
        return NIL;
    }

    public static SubLObject file_backed_cache_memory_mappedP(final SubLObject fbc) {
        return file_hash_table.file_hash_table_memory_mappedP(fbc_file_hash_table_cache(fbc));
    }

    public static SubLObject preload_entire_file_hash_table(final SubLObject fbc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_backed_cache_p(fbc) : "file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) " + fbc;
        if (!fbc_fht_cache_percentage(fbc).numGE($int$100)) {
            return NIL;
        }
        if (NIL != fbc_is_fort_cache(fbc)) {
            final SubLObject fht = fbc_file_hash_table_cache(fbc);
            final SubLObject message = $str52$Preloading_file_backed_cache_;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
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
                    noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$1 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$1);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        file_hash_table.get_file_hash_table(fort, fht, UNPROVIDED);
                                    }
                                }
                            }
                            final SubLObject idx_$2 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$2);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$2);
                                final SubLObject end_id = id_index_next_id(idx_$2);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        file_hash_table.get_file_hash_table(fort2, fht, UNPROVIDED);
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_pristine_file_hash_table_any(fbc_file_hash_table_cache(fbc), continuation, NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    final SubLObject key = the_key;
                    final SubLObject val = the_value;
                }
                continuation = next;
            }
        }
        return NIL;
    }

    public static SubLObject file_backed_cache_lookup(final SubLObject key, final SubLObject fbc, SubLObject default_value, SubLObject recover_on_error) {
        if (default_value == UNPROVIDED) {
            default_value = $NOT_FOUND;
        }
        if (recover_on_error == UNPROVIDED) {
            recover_on_error = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (NIL != fbc_is_busy(fbc)) {
            sleep(ZERO_INTEGER);
        } 
        final SubLObject val = gethash(key, fbc_local_cache(fbc), $FBC_NOT_FOUND_VALUE);
        if (val != $FBC_NOT_FOUND_VALUE) {
            return val;
        }
        SubLObject msg = NIL;
        SubLObject result = NIL;
        final SubLObject v_file_hash_table = fbc_file_hash_table_cache(fbc);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_hash_table.file_hash_table_p(v_file_hash_table))) {
            Errors.error($str56$_S_has_no_associated_file_hash_ta, fbc);
        }
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = file_hash_table.get_file_hash_table(key, v_file_hash_table, default_value);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != msg) {
            if (NIL == recover_on_error) {
                Errors.error(msg);
            }
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        file_hash_table.finalize_file_hash_table(v_file_hash_table);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            fbc_initialize(fbc);
            result = file_hash_table.get_file_hash_table(key, v_file_hash_table, default_value);
        }
        return result;
    }

    public static SubLObject file_backed_cache_enter(final SubLObject key, final SubLObject val, final SubLObject fbc) {
        while (NIL != fbc_is_busy(fbc)) {
            sleep(ZERO_INTEGER);
        } 
        return sethash(key, fbc_local_cache(fbc), val);
    }

    public static SubLObject file_backed_cache_file_hash_table_path(final SubLObject fbc) {
        return fbc_file_hash_table_path(fbc);
    }

    public static SubLObject file_backed_cache_local_cache_count(final SubLObject fbc) {
        return hash_table_count(fbc_local_cache(fbc));
    }

    public static SubLObject replicate_file_backed_cache(final SubLObject fbc, final SubLObject filename, SubLObject deleted_value_fn, SubLObject source_common_symbols, SubLObject target_common_symbols, SubLObject temp_stem, SubLObject progress) {
        if (deleted_value_fn == UNPROVIDED) {
            deleted_value_fn = NULL;
        }
        if (source_common_symbols == UNPROVIDED) {
            source_common_symbols = NIL;
        }
        if (target_common_symbols == UNPROVIDED) {
            target_common_symbols = NIL;
        }
        if (temp_stem == UNPROVIDED) {
            temp_stem = $str60$tmp_;
        }
        if (progress == UNPROVIDED) {
            progress = NIL;
        }
        assert NIL != file_backed_cache_p(fbc) : "file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) " + fbc;
        if (NIL != unprovided_argumentP(source_common_symbols)) {
            source_common_symbols = cfasl_current_common_symbols();
        }
        if (NIL != unprovided_argumentP(target_common_symbols)) {
            target_common_symbols = cfasl_current_common_symbols();
        }
        return replicate_file_backed_cache_int(fbc, filename, deleted_value_fn, source_common_symbols, target_common_symbols, temp_stem, progress);
    }

    public static SubLObject replicate_file_backed_cache_int(final SubLObject fbc, final SubLObject filename, final SubLObject deleted_value_fn, final SubLObject source_common_symbols, final SubLObject target_common_symbols, final SubLObject temp_stem, final SubLObject progress) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_fn = fbc_test(fbc);
        final SubLObject mode_fn = fbc_mode(fbc);
        final SubLObject v_cache = fbc_local_cache(fbc);
        SubLObject additions = ZERO_INTEGER;
        SubLObject deletions = ZERO_INTEGER;
        final SubLObject not_present = make_symbol($$$The_Not_Present_Marker);
        final SubLObject changes = set.new_set(hash_table_test(v_cache), UNPROVIDED);
        SubLObject target_ffht = NIL;
        SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(target_common_symbols);
            target_ffht = file_hash_table.fast_create_file_hash_table(filename, temp_stem, test_fn, mode_fn);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(source_common_symbols);
            final SubLObject table_var = fbc_file_hash_table_cache(fbc);
            $progress_note$.setDynamicValue(progress, thread);
            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
            $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            final SubLObject _prev_bind_0_$4 = $last_percent_progress_index$.currentBinding(thread);
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
                            final SubLObject value = the_value;
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            final SubLObject changed_value = gethash_without_values(key, v_cache, not_present);
                            SubLObject final_value = NIL;
                            if (not_present.eql(changed_value)) {
                                final_value = value;
                            } else {
                                set.set_add(key, changes);
                                final_value = changed_value;
                            }
                            if (NIL != funcall(deleted_value_fn, final_value)) {
                                deletions = add(deletions, ONE_INTEGER);
                            } else {
                                final SubLObject _prev_bind_0_$5 = $cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    $cfasl_common_symbols$.bind(NIL, thread);
                                    cfasl_set_common_symbols_simple(target_common_symbols);
                                    file_hash_table.fast_put_file_hash_table(key, target_ffht, final_value);
                                } finally {
                                    $cfasl_common_symbols$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        continuation = next;
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$4, thread);
            }
            SubLObject key2 = NIL;
            SubLObject local_value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(v_cache);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key2 = getEntryKey(cdohash_entry);
                    local_value = getEntryValue(cdohash_entry);
                    if (NIL == set.set_memberP(key2, changes)) {
                        additions = add(additions, ONE_INTEGER);
                        final SubLObject _prev_bind_0_$7 = $cfasl_common_symbols$.currentBinding(thread);
                        try {
                            $cfasl_common_symbols$.bind(NIL, thread);
                            cfasl_set_common_symbols_simple(target_common_symbols);
                            file_hash_table.fast_put_file_hash_table(key2, target_ffht, local_value);
                        } finally {
                            $cfasl_common_symbols$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.finalize_fast_create_file_hash_table(target_ffht, UNPROVIDED, UNPROVIDED);
        final SubLObject modifications = subtract(set.set_size(changes), deletions);
        return values(filename, modifications, additions, deletions);
    }

    public static SubLObject declare_file_backed_cache_file() {
        declareFunction(me, "file_backed_cache_print_function_trampoline", "FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "file_backed_cache_p", "FILE-BACKED-CACHE-P", 1, 0, false);
        new file_backed_cache.$file_backed_cache_p$UnaryFunction();
        declareFunction(me, "fbc_file_hash_table_cache", "FBC-FILE-HASH-TABLE-CACHE", 1, 0, false);
        declareFunction(me, "fbc_local_cache", "FBC-LOCAL-CACHE", 1, 0, false);
        declareFunction(me, "fbc_file_hash_table_path", "FBC-FILE-HASH-TABLE-PATH", 1, 0, false);
        declareFunction(me, "fbc_should_preload_cache", "FBC-SHOULD-PRELOAD-CACHE", 1, 0, false);
        declareFunction(me, "fbc_is_fort_cache", "FBC-IS-FORT-CACHE", 1, 0, false);
        declareFunction(me, "fbc_fht_cache_percentage", "FBC-FHT-CACHE-PERCENTAGE", 1, 0, false);
        declareFunction(me, "fbc_test", "FBC-TEST", 1, 0, false);
        declareFunction(me, "fbc_mode", "FBC-MODE", 1, 0, false);
        declareFunction(me, "fbc_is_busy", "FBC-IS-BUSY", 1, 0, false);
        declareFunction(me, "_csetf_fbc_file_hash_table_cache", "_CSETF-FBC-FILE-HASH-TABLE-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_fbc_local_cache", "_CSETF-FBC-LOCAL-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_fbc_file_hash_table_path", "_CSETF-FBC-FILE-HASH-TABLE-PATH", 2, 0, false);
        declareFunction(me, "_csetf_fbc_should_preload_cache", "_CSETF-FBC-SHOULD-PRELOAD-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_fbc_is_fort_cache", "_CSETF-FBC-IS-FORT-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_fbc_fht_cache_percentage", "_CSETF-FBC-FHT-CACHE-PERCENTAGE", 2, 0, false);
        declareFunction(me, "_csetf_fbc_test", "_CSETF-FBC-TEST", 2, 0, false);
        declareFunction(me, "_csetf_fbc_mode", "_CSETF-FBC-MODE", 2, 0, false);
        declareFunction(me, "_csetf_fbc_is_busy", "_CSETF-FBC-IS-BUSY", 2, 0, false);
        declareFunction(me, "make_file_backed_cache", "MAKE-FILE-BACKED-CACHE", 0, 1, false);
        declareFunction(me, "visit_defstruct_file_backed_cache", "VISIT-DEFSTRUCT-FILE-BACKED-CACHE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_file_backed_cache_method", "VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "file_backed_cache_create", "FILE-BACKED-CACHE-CREATE", 1, 5, false);
        declareFunction(me, "print_fbc", "PRINT-FBC", 3, 0, false);
        declareFunction(me, "fbc_initialize", "FBC-INITIALIZE", 1, 0, false);
        declareFunction(me, "fbc_initialize_internal", "FBC-INITIALIZE-INTERNAL", 2, 0, false);
        declareFunction(me, "file_backed_cache_reconnect", "FILE-BACKED-CACHE-RECONNECT", 1, 1, false);
        declareFunction(me, "file_backed_cache_reset", "FILE-BACKED-CACHE-RESET", 1, 1, false);
        declareFunction(me, "file_backed_cache_finalize", "FILE-BACKED-CACHE-FINALIZE", 1, 0, false);
        declareFunction(me, "file_backed_cache_change_stream_buffer_size", "FILE-BACKED-CACHE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false);
        declareFunction(me, "file_backed_cache_enable_memory_mapping", "FILE-BACKED-CACHE-ENABLE-MEMORY-MAPPING", 1, 0, false);
        declareFunction(me, "file_backed_cache_memory_mappedP", "FILE-BACKED-CACHE-MEMORY-MAPPED?", 1, 0, false);
        declareFunction(me, "preload_entire_file_hash_table", "PRELOAD-ENTIRE-FILE-HASH-TABLE", 1, 0, false);
        declareFunction(me, "file_backed_cache_lookup", "FILE-BACKED-CACHE-LOOKUP", 2, 2, false);
        declareFunction(me, "file_backed_cache_enter", "FILE-BACKED-CACHE-ENTER", 3, 0, false);
        declareFunction(me, "file_backed_cache_file_hash_table_path", "FILE-BACKED-CACHE-FILE-HASH-TABLE-PATH", 1, 0, false);
        declareFunction(me, "file_backed_cache_local_cache_count", "FILE-BACKED-CACHE-LOCAL-CACHE-COUNT", 1, 0, false);
        declareFunction(me, "replicate_file_backed_cache", "REPLICATE-FILE-BACKED-CACHE", 2, 5, false);
        declareFunction(me, "replicate_file_backed_cache_int", "REPLICATE-FILE-BACKED-CACHE-INT", 7, 0, false);
        return NIL;
    }

    public static SubLObject init_file_backed_cache_file() {
        deflexical("*FBC-RESET-LOCK*", make_lock($str0$fbc_reset_lock));
        deflexical("*FILE-BACKED-CACHE-BASE-PATH*", red_infrastructure_macros.red_def_helper($list1.isSymbol() ? symbol_value($list1) : $list1, $file_backed_cache_base_path$, $str3$data_caches_.isSymbol() ? symbol_value($str3$data_caches_) : $str3$data_caches_, $LEXICAL, UNPROVIDED));
        defconstant("*DTP-FILE-BACKED-CACHE*", FILE_BACKED_CACHE);
        return NIL;
    }

    public static SubLObject setup_file_backed_cache_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache$.getGlobalValue(), symbol_function(FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list13);
        def_csetf(FBC_FILE_HASH_TABLE_CACHE, _CSETF_FBC_FILE_HASH_TABLE_CACHE);
        def_csetf(FBC_LOCAL_CACHE, _CSETF_FBC_LOCAL_CACHE);
        def_csetf(FBC_FILE_HASH_TABLE_PATH, _CSETF_FBC_FILE_HASH_TABLE_PATH);
        def_csetf(FBC_SHOULD_PRELOAD_CACHE, _CSETF_FBC_SHOULD_PRELOAD_CACHE);
        def_csetf(FBC_IS_FORT_CACHE, _CSETF_FBC_IS_FORT_CACHE);
        def_csetf(FBC_FHT_CACHE_PERCENTAGE, _CSETF_FBC_FHT_CACHE_PERCENTAGE);
        def_csetf(FBC_TEST, _CSETF_FBC_TEST);
        def_csetf(FBC_MODE, _CSETF_FBC_MODE);
        def_csetf(FBC_IS_BUSY, _CSETF_FBC_IS_BUSY);
        identity(FILE_BACKED_CACHE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_backed_cache$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_file_backed_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_file_backed_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_file_backed_cache_file();
    }

    

    public static final class $file_backed_cache_native extends SubLStructNative {
        public SubLObject $file_hash_table_cache;

        public SubLObject $local_cache;

        public SubLObject $file_hash_table_path;

        public SubLObject $should_preload_cache;

        public SubLObject $is_fort_cache;

        public SubLObject $fht_cache_percentage;

        public SubLObject $test;

        public SubLObject $mode;

        public SubLObject $is_busy;

        private static final SubLStructDeclNative structDecl;

        private $file_backed_cache_native() {
            this.$file_hash_table_cache = Lisp.NIL;
            this.$local_cache = Lisp.NIL;
            this.$file_hash_table_path = Lisp.NIL;
            this.$should_preload_cache = Lisp.NIL;
            this.$is_fort_cache = Lisp.NIL;
            this.$fht_cache_percentage = Lisp.NIL;
            this.$test = Lisp.NIL;
            this.$mode = Lisp.NIL;
            this.$is_busy = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$file_hash_table_cache;
        }

        @Override
        public SubLObject getField3() {
            return this.$local_cache;
        }

        @Override
        public SubLObject getField4() {
            return this.$file_hash_table_path;
        }

        @Override
        public SubLObject getField5() {
            return this.$should_preload_cache;
        }

        @Override
        public SubLObject getField6() {
            return this.$is_fort_cache;
        }

        @Override
        public SubLObject getField7() {
            return this.$fht_cache_percentage;
        }

        @Override
        public SubLObject getField8() {
            return this.$test;
        }

        @Override
        public SubLObject getField9() {
            return this.$mode;
        }

        @Override
        public SubLObject getField10() {
            return this.$is_busy;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$file_hash_table_cache = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$local_cache = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$file_hash_table_path = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$should_preload_cache = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$is_fort_cache = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$fht_cache_percentage = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$test = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$mode = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$is_busy = value;
        }

        static {
            structDecl = makeStructDeclNative($file_backed_cache_native.class, FILE_BACKED_CACHE, FILE_BACKED_CACHE_P, $list7, $list8, new String[]{ "$file_hash_table_cache", "$local_cache", "$file_hash_table_path", "$should_preload_cache", "$is_fort_cache", "$fht_cache_percentage", "$test", "$mode", "$is_busy" }, $list9, $list10, PRINT_FBC);
        }
    }

    public static final class $file_backed_cache_p$UnaryFunction extends UnaryFunction {
        public $file_backed_cache_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-BACKED-CACHE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_backed_cache_p(arg1);
        }
    }
}

/**
 * Total time: 323 ms
 */
