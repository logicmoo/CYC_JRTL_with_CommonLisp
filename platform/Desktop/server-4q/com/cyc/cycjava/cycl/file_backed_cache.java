package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_backed_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.file_backed_cache";
    public static final String myFingerPrint = "e8cfe5ce638801b710bc99f3757c03657727e42b6b3334885a21fc5606070efa";
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1130L)
    private static SubLSymbol $fbc_reset_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1272L)
    public static SubLSymbol $file_backed_cache_base_path$;
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLSymbol $dtp_file_backed_cache$;
    private static final SubLString $str0$fbc_reset_lock;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$_FILE_BACKED_CACHE_BASE_PATH_;
    private static final SubLString $str3$data_caches_;
    private static final SubLSymbol $kw4$LEXICAL;
    private static final SubLSymbol $sym5$FILE_BACKED_CACHE;
    private static final SubLSymbol $sym6$FILE_BACKED_CACHE_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PRINT_FBC;
    private static final SubLSymbol $sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$FBC_FILE_HASH_TABLE_CACHE;
    private static final SubLSymbol $sym15$_CSETF_FBC_FILE_HASH_TABLE_CACHE;
    private static final SubLSymbol $sym16$FBC_LOCAL_CACHE;
    private static final SubLSymbol $sym17$_CSETF_FBC_LOCAL_CACHE;
    private static final SubLSymbol $sym18$FBC_FILE_HASH_TABLE_PATH;
    private static final SubLSymbol $sym19$_CSETF_FBC_FILE_HASH_TABLE_PATH;
    private static final SubLSymbol $sym20$FBC_SHOULD_PRELOAD_CACHE;
    private static final SubLSymbol $sym21$_CSETF_FBC_SHOULD_PRELOAD_CACHE;
    private static final SubLSymbol $sym22$FBC_IS_FORT_CACHE;
    private static final SubLSymbol $sym23$_CSETF_FBC_IS_FORT_CACHE;
    private static final SubLSymbol $sym24$FBC_FHT_CACHE_PERCENTAGE;
    private static final SubLSymbol $sym25$_CSETF_FBC_FHT_CACHE_PERCENTAGE;
    private static final SubLSymbol $sym26$FBC_TEST;
    private static final SubLSymbol $sym27$_CSETF_FBC_TEST;
    private static final SubLSymbol $sym28$FBC_MODE;
    private static final SubLSymbol $sym29$_CSETF_FBC_MODE;
    private static final SubLSymbol $sym30$FBC_IS_BUSY;
    private static final SubLSymbol $sym31$_CSETF_FBC_IS_BUSY;
    private static final SubLSymbol $kw32$FILE_HASH_TABLE_CACHE;
    private static final SubLSymbol $kw33$LOCAL_CACHE;
    private static final SubLSymbol $kw34$FILE_HASH_TABLE_PATH;
    private static final SubLSymbol $kw35$SHOULD_PRELOAD_CACHE;
    private static final SubLSymbol $kw36$IS_FORT_CACHE;
    private static final SubLSymbol $kw37$FHT_CACHE_PERCENTAGE;
    private static final SubLSymbol $kw38$TEST;
    private static final SubLSymbol $kw39$MODE;
    private static final SubLSymbol $kw40$IS_BUSY;
    private static final SubLString $str41$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw42$BEGIN;
    private static final SubLSymbol $sym43$MAKE_FILE_BACKED_CACHE;
    private static final SubLSymbol $kw44$SLOT;
    private static final SubLSymbol $kw45$END;
    private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD;
    private static final SubLSymbol $kw47$IMAGE_INDEPENDENT_CFASL;
    private static final SubLString $str48$_FILE_BACKED_CACHE__A_;
    private static final SubLString $str49$_INVALID_FILE_BACKED_CACHE_;
    private static final SubLSymbol $sym50$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLInteger $int51$100;
    private static final SubLString $str52$Preloading_file_backed_cache_;
    private static final SubLSymbol $kw53$SKIP;
    private static final SubLSymbol $kw54$NOT_FOUND;
    private static final SubLSymbol $kw55$FBC_NOT_FOUND_VALUE;
    private static final SubLString $str56$_S_has_no_associated_file_hash_ta;
    private static final SubLSymbol $kw57$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym58$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym59$NULL;
    private static final SubLString $str60$tmp_;
    private static final SubLString $str61$The_Not_Present_Marker;
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject file_backed_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fbc(v_object, stream, (SubLObject)file_backed_cache.ZERO_INTEGER);
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject file_backed_cache_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_backed_cache_native.class) ? file_backed_cache.T : file_backed_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_file_hash_table_cache(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_local_cache(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_file_hash_table_path(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_should_preload_cache(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_is_fort_cache(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_fht_cache_percentage(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_test(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_mode(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject fbc_is_busy(final SubLObject v_object) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_file_hash_table_cache(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_local_cache(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_file_hash_table_path(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_should_preload_cache(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_is_fort_cache(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_fht_cache_percentage(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_test(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_mode(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject _csetf_fbc_is_busy(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache.NIL != file_backed_cache_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject make_file_backed_cache(SubLObject arglist) {
        if (arglist == file_backed_cache.UNPROVIDED) {
            arglist = (SubLObject)file_backed_cache.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_backed_cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_backed_cache.NIL, next = arglist; file_backed_cache.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_backed_cache.$kw32$FILE_HASH_TABLE_CACHE)) {
                _csetf_fbc_file_hash_table_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw33$LOCAL_CACHE)) {
                _csetf_fbc_local_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw34$FILE_HASH_TABLE_PATH)) {
                _csetf_fbc_file_hash_table_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw35$SHOULD_PRELOAD_CACHE)) {
                _csetf_fbc_should_preload_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw36$IS_FORT_CACHE)) {
                _csetf_fbc_is_fort_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw37$FHT_CACHE_PERCENTAGE)) {
                _csetf_fbc_fht_cache_percentage(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw38$TEST)) {
                _csetf_fbc_test(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw39$MODE)) {
                _csetf_fbc_mode(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache.$kw40$IS_BUSY)) {
                _csetf_fbc_is_busy(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_backed_cache.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject visit_defstruct_file_backed_cache(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw42$BEGIN, (SubLObject)file_backed_cache.$sym43$MAKE_FILE_BACKED_CACHE, (SubLObject)file_backed_cache.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw32$FILE_HASH_TABLE_CACHE, fbc_file_hash_table_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw33$LOCAL_CACHE, fbc_local_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw34$FILE_HASH_TABLE_PATH, fbc_file_hash_table_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw35$SHOULD_PRELOAD_CACHE, fbc_should_preload_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw36$IS_FORT_CACHE, fbc_is_fort_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw37$FHT_CACHE_PERCENTAGE, fbc_fht_cache_percentage(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw38$TEST, fbc_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw39$MODE, fbc_mode(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw44$SLOT, (SubLObject)file_backed_cache.$kw40$IS_BUSY, fbc_is_busy(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache.$kw45$END, (SubLObject)file_backed_cache.$sym43$MAKE_FILE_BACKED_CACHE, (SubLObject)file_backed_cache.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 1792L)
    public static SubLObject visit_defstruct_object_file_backed_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_backed_cache(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 2614L)
    public static SubLObject file_backed_cache_create(final SubLObject file_hash_table_path, SubLObject should_preload_cache, SubLObject is_fort_cache, SubLObject fht_cache_percentage, SubLObject test, SubLObject mode) {
        if (should_preload_cache == file_backed_cache.UNPROVIDED) {
            should_preload_cache = (SubLObject)file_backed_cache.NIL;
        }
        if (is_fort_cache == file_backed_cache.UNPROVIDED) {
            is_fort_cache = (SubLObject)file_backed_cache.NIL;
        }
        if (fht_cache_percentage == file_backed_cache.UNPROVIDED) {
            fht_cache_percentage = file_hash_table.$fht_cache_percentage$.getDynamicValue();
        }
        if (test == file_backed_cache.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)file_backed_cache.EQUAL);
        }
        if (mode == file_backed_cache.UNPROVIDED) {
            mode = (SubLObject)file_backed_cache.$kw47$IMAGE_INDEPENDENT_CFASL;
        }
        final SubLObject result = make_file_backed_cache((SubLObject)file_backed_cache.UNPROVIDED);
        _csetf_fbc_file_hash_table_path(result, file_hash_table_path);
        _csetf_fbc_should_preload_cache(result, should_preload_cache);
        _csetf_fbc_is_fort_cache(result, is_fort_cache);
        _csetf_fbc_fht_cache_percentage(result, fht_cache_percentage);
        _csetf_fbc_test(result, test);
        _csetf_fbc_mode(result, mode);
        _csetf_fbc_is_busy(result, (SubLObject)file_backed_cache.NIL);
        fbc_initialize(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 4105L)
    public static SubLObject print_fbc(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (file_backed_cache.NIL != file_backed_cache_p(v_object)) {
            PrintLow.format(stream, (SubLObject)file_backed_cache.$str48$_FILE_BACKED_CACHE__A_, fbc_file_hash_table_path(v_object));
        }
        else {
            PrintLow.format(stream, (SubLObject)file_backed_cache.$str49$_INVALID_FILE_BACKED_CACHE_);
        }
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 4355L)
    public static SubLObject fbc_initialize(final SubLObject fbc) {
        assert file_backed_cache.NIL != file_backed_cache_p(fbc) : fbc;
        return fbc_initialize_internal(fbc, (SubLObject)file_backed_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 4607L)
    public static SubLObject fbc_initialize_internal(final SubLObject fbc, final SubLObject preserve_local_cacheP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_backed_cache.NIL == preserve_local_cacheP) {
            _csetf_fbc_local_cache(fbc, Hashtables.make_hash_table((SubLObject)file_backed_cache.ZERO_INTEGER, fbc_test(fbc), (SubLObject)file_backed_cache.UNPROVIDED));
        }
        if (file_backed_cache.NIL == Filesys.probe_file(fbc_file_hash_table_path(fbc))) {
            return (SubLObject)file_backed_cache.NIL;
        }
        final SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding(thread);
        try {
            file_hash_table.$fht_cache_percentage$.bind(fbc_fht_cache_percentage(fbc), thread);
            _csetf_fbc_file_hash_table_cache(fbc, file_hash_table.open_file_hash_table_read_only(fbc_file_hash_table_path(fbc), fbc_test(fbc), fbc_mode(fbc)));
            if (file_backed_cache.NIL == preserve_local_cacheP && file_backed_cache.NIL != fbc_should_preload_cache(fbc)) {
                preload_entire_file_hash_table(fbc);
            }
        }
        finally {
            file_hash_table.$fht_cache_percentage$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 5492L)
    public static SubLObject file_backed_cache_reconnect(final SubLObject fbc, SubLObject file_cache_path) {
        if (file_cache_path == file_backed_cache.UNPROVIDED) {
            file_cache_path = (SubLObject)file_backed_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_backed_cache.NIL != file_backed_cache_p(fbc) : fbc;
        SubLObject release = (SubLObject)file_backed_cache.NIL;
        try {
            release = Locks.seize_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            SubLObject msg = (SubLObject)file_backed_cache.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)file_backed_cache.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        _csetf_fbc_is_busy(fbc, (SubLObject)file_backed_cache.T);
                        if (file_backed_cache.NIL != file_cache_path) {
                            _csetf_fbc_file_hash_table_path(fbc, file_cache_path);
                        }
                        final SubLObject preserve_local_cacheP = (SubLObject)file_backed_cache.T;
                        fbc_initialize_internal(fbc, preserve_local_cacheP);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (file_backed_cache.NIL != msg) {
                Errors.warn(msg);
            }
            _csetf_fbc_is_busy(fbc, (SubLObject)file_backed_cache.NIL);
        }
        finally {
            if (file_backed_cache.NIL != release) {
                Locks.release_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            }
        }
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 6164L)
    public static SubLObject file_backed_cache_reset(final SubLObject fbc, SubLObject file_cache_path) {
        if (file_cache_path == file_backed_cache.UNPROVIDED) {
            file_cache_path = (SubLObject)file_backed_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_backed_cache.NIL != file_backed_cache_p(fbc) : fbc;
        SubLObject release = (SubLObject)file_backed_cache.NIL;
        try {
            release = Locks.seize_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            SubLObject msg = (SubLObject)file_backed_cache.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)file_backed_cache.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        _csetf_fbc_is_busy(fbc, (SubLObject)file_backed_cache.T);
                        if (file_backed_cache.NIL != fbc_file_hash_table_cache(fbc)) {
                            file_hash_table.finalize_file_hash_table(fbc_file_hash_table_cache(fbc));
                        }
                        if (file_backed_cache.NIL != file_cache_path) {
                            _csetf_fbc_file_hash_table_path(fbc, file_cache_path);
                        }
                        _csetf_fbc_file_hash_table_cache(fbc, (SubLObject)file_backed_cache.NIL);
                        _csetf_fbc_local_cache(fbc, (SubLObject)file_backed_cache.NIL);
                        fbc_initialize(fbc);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (file_backed_cache.NIL != msg) {
                Errors.warn(msg);
            }
            _csetf_fbc_is_busy(fbc, (SubLObject)file_backed_cache.NIL);
        }
        finally {
            if (file_backed_cache.NIL != release) {
                Locks.release_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            }
        }
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 6999L)
    public static SubLObject file_backed_cache_finalize(final SubLObject fbc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)file_backed_cache.NIL;
        try {
            release = Locks.seize_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            SubLObject msg = (SubLObject)file_backed_cache.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)file_backed_cache.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (file_backed_cache.NIL != fbc_file_hash_table_cache(fbc)) {
                            file_hash_table.finalize_file_hash_table(fbc_file_hash_table_cache(fbc));
                        }
                        _csetf_fbc_file_hash_table_cache(fbc, (SubLObject)file_backed_cache.NIL);
                        _csetf_fbc_local_cache(fbc, (SubLObject)file_backed_cache.NIL);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (file_backed_cache.NIL != msg) {
                Errors.warn(msg);
            }
        }
        finally {
            if (file_backed_cache.NIL != release) {
                Locks.release_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            }
        }
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7368L)
    public static SubLObject file_backed_cache_change_stream_buffer_size(final SubLObject fbc, final SubLObject new_stream_buffer_size) {
        SubLObject release = (SubLObject)file_backed_cache.NIL;
        try {
            release = Locks.seize_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            _csetf_fbc_file_hash_table_cache(fbc, file_hash_table.file_hash_table_change_stream_buffer_size(fbc_file_hash_table_cache(fbc), new_stream_buffer_size));
        }
        finally {
            if (file_backed_cache.NIL != release) {
                Locks.release_lock(file_backed_cache.$fbc_reset_lock$.getGlobalValue());
            }
        }
        return fbc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7662L)
    public static SubLObject file_backed_cache_enable_memory_mapping(final SubLObject fbc) {
        file_hash_table.file_hash_table_enable_memory_mapping(fbc_file_hash_table_cache(fbc));
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7815L)
    public static SubLObject file_backed_cache_memory_mappedP(final SubLObject fbc) {
        return file_hash_table.file_hash_table_memory_mappedP(fbc_file_hash_table_cache(fbc));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 7947L)
    public static SubLObject preload_entire_file_hash_table(final SubLObject fbc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_backed_cache.NIL != file_backed_cache_p(fbc) : fbc;
        if (!fbc_fht_cache_percentage(fbc).numGE((SubLObject)file_backed_cache.$int51$100)) {
            return (SubLObject)file_backed_cache.NIL;
        }
        if (file_backed_cache.NIL != fbc_is_fort_cache(fbc)) {
            final SubLObject fht = fbc_file_hash_table_cache(fbc);
            final SubLObject message = (SubLObject)file_backed_cache.$str52$Preloading_file_backed_cache_;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = (SubLObject)file_backed_cache.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_backed_cache.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_backed_cache.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_backed_cache.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = (SubLObject)file_backed_cache.NIL;
                    table_var = cdolist_list_var.first();
                    while (file_backed_cache.NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (file_backed_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)file_backed_cache.$kw53$SKIP)) {
                            final SubLObject idx_$1 = idx;
                            if (file_backed_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)file_backed_cache.$kw53$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                                final SubLObject backwardP_var = (SubLObject)file_backed_cache.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)file_backed_cache.NIL, v_iteration = (SubLObject)file_backed_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)file_backed_cache.ONE_INTEGER)) {
                                    id = ((file_backed_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)file_backed_cache.ONE_INTEGER) : v_iteration);
                                    fort = Vectors.aref(vector_var, id);
                                    if (file_backed_cache.NIL == id_index.id_index_tombstone_p(fort) || file_backed_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)file_backed_cache.$kw53$SKIP)) {
                                        if (file_backed_cache.NIL != id_index.id_index_tombstone_p(fort)) {
                                            fort = (SubLObject)file_backed_cache.$kw53$SKIP;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)file_backed_cache.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        file_hash_table.get_file_hash_table(fort, fht, (SubLObject)file_backed_cache.UNPROVIDED);
                                    }
                                }
                            }
                            final SubLObject idx_$2 = idx;
                            if (file_backed_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2) || file_backed_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)file_backed_cache.$kw53$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$2);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$2);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$2);
                                final SubLObject v_default = (SubLObject)((file_backed_cache.NIL != id_index.id_index_skip_tombstones_p((SubLObject)file_backed_cache.$kw53$SKIP)) ? file_backed_cache.NIL : file_backed_cache.$kw53$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (file_backed_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)file_backed_cache.$kw53$SKIP) || file_backed_cache.NIL == id_index.id_index_tombstone_p(fort2)) {
                                        sofar = Numbers.add(sofar, (SubLObject)file_backed_cache.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        file_hash_table.get_file_hash_table(fort2, fht, (SubLObject)file_backed_cache.UNPROVIDED);
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)file_backed_cache.ONE_INTEGER);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_backed_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            SubLObject continuation = (SubLObject)file_backed_cache.NIL;
            SubLObject next;
            for (SubLObject completeP = (SubLObject)file_backed_cache.NIL; file_backed_cache.NIL == completeP; completeP = Types.sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_pristine_file_hash_table_any(fbc_file_hash_table_cache(fbc), continuation, (SubLObject)file_backed_cache.NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (file_backed_cache.NIL != next) {
                    final SubLObject key = the_key;
                    final SubLObject val = the_value;
                }
                continuation = next;
            }
        }
        return (SubLObject)file_backed_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 8658L)
    public static SubLObject file_backed_cache_lookup(final SubLObject key, final SubLObject fbc, SubLObject default_value, SubLObject recover_on_error) {
        if (default_value == file_backed_cache.UNPROVIDED) {
            default_value = (SubLObject)file_backed_cache.$kw54$NOT_FOUND;
        }
        if (recover_on_error == file_backed_cache.UNPROVIDED) {
            recover_on_error = (SubLObject)file_backed_cache.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (file_backed_cache.NIL != fbc_is_busy(fbc)) {
            Threads.sleep((SubLObject)file_backed_cache.ZERO_INTEGER);
        }
        final SubLObject val = Hashtables.gethash(key, fbc_local_cache(fbc), (SubLObject)file_backed_cache.$kw55$FBC_NOT_FOUND_VALUE);
        if (val != file_backed_cache.$kw55$FBC_NOT_FOUND_VALUE) {
            return val;
        }
        SubLObject msg = (SubLObject)file_backed_cache.NIL;
        SubLObject result = (SubLObject)file_backed_cache.NIL;
        final SubLObject v_file_hash_table = fbc_file_hash_table_cache(fbc);
        if (file_backed_cache.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_backed_cache.NIL == file_hash_table.file_hash_table_p(v_file_hash_table)) {
            Errors.error((SubLObject)file_backed_cache.$str56$_S_has_no_associated_file_hash_ta, fbc);
        }
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)file_backed_cache.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = file_hash_table.get_file_hash_table(key, v_file_hash_table, default_value);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (file_backed_cache.NIL != msg) {
            if (file_backed_cache.NIL == recover_on_error) {
                Errors.error(msg);
            }
            SubLObject ignore_errors_tag = (SubLObject)file_backed_cache.NIL;
            try {
                thread.throwStack.push(file_backed_cache.$kw57$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_backed_cache.$sym58$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        file_hash_table.finalize_file_hash_table(v_file_hash_table);
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)file_backed_cache.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)file_backed_cache.$kw57$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            fbc_initialize(fbc);
            result = file_hash_table.get_file_hash_table(key, v_file_hash_table, default_value);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 10035L)
    public static SubLObject file_backed_cache_enter(final SubLObject key, final SubLObject val, final SubLObject fbc) {
        while (file_backed_cache.NIL != fbc_is_busy(fbc)) {
            Threads.sleep((SubLObject)file_backed_cache.ZERO_INTEGER);
        }
        return Hashtables.sethash(key, fbc_local_cache(fbc), val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 10953L)
    public static SubLObject file_backed_cache_file_hash_table_path(final SubLObject fbc) {
        return fbc_file_hash_table_path(fbc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 11102L)
    public static SubLObject file_backed_cache_local_cache_count(final SubLObject fbc) {
        return Hashtables.hash_table_count(fbc_local_cache(fbc));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 11290L)
    public static SubLObject replicate_file_backed_cache(final SubLObject fbc, final SubLObject filename, SubLObject deleted_value_fn, SubLObject source_common_symbols, SubLObject target_common_symbols, SubLObject temp_stem, SubLObject progress) {
        if (deleted_value_fn == file_backed_cache.UNPROVIDED) {
            deleted_value_fn = (SubLObject)file_backed_cache.$sym59$NULL;
        }
        if (source_common_symbols == file_backed_cache.UNPROVIDED) {
            source_common_symbols = (SubLObject)file_backed_cache.NIL;
        }
        if (target_common_symbols == file_backed_cache.UNPROVIDED) {
            target_common_symbols = (SubLObject)file_backed_cache.NIL;
        }
        if (temp_stem == file_backed_cache.UNPROVIDED) {
            temp_stem = (SubLObject)file_backed_cache.$str60$tmp_;
        }
        if (progress == file_backed_cache.UNPROVIDED) {
            progress = (SubLObject)file_backed_cache.NIL;
        }
        assert file_backed_cache.NIL != file_backed_cache_p(fbc) : fbc;
        if (file_backed_cache.NIL != utilities_macros.unprovided_argumentP(source_common_symbols)) {
            source_common_symbols = cfasl.cfasl_current_common_symbols();
        }
        if (file_backed_cache.NIL != utilities_macros.unprovided_argumentP(target_common_symbols)) {
            target_common_symbols = cfasl.cfasl_current_common_symbols();
        }
        return replicate_file_backed_cache_int(fbc, filename, deleted_value_fn, source_common_symbols, target_common_symbols, temp_stem, progress);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache.lisp", position = 12921L)
    public static SubLObject replicate_file_backed_cache_int(final SubLObject fbc, final SubLObject filename, final SubLObject deleted_value_fn, final SubLObject source_common_symbols, final SubLObject target_common_symbols, final SubLObject temp_stem, final SubLObject progress) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_fn = fbc_test(fbc);
        final SubLObject mode_fn = fbc_mode(fbc);
        final SubLObject v_cache = fbc_local_cache(fbc);
        SubLObject additions = (SubLObject)file_backed_cache.ZERO_INTEGER;
        SubLObject deletions = (SubLObject)file_backed_cache.ZERO_INTEGER;
        final SubLObject not_present = Symbols.make_symbol((SubLObject)file_backed_cache.$str61$The_Not_Present_Marker);
        final SubLObject changes = set.new_set(Hashtables.hash_table_test(v_cache), (SubLObject)file_backed_cache.UNPROVIDED);
        SubLObject target_ffht = (SubLObject)file_backed_cache.NIL;
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)file_backed_cache.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(target_common_symbols);
            target_ffht = file_hash_table.fast_create_file_hash_table(filename, temp_stem, test_fn, mode_fn);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)file_backed_cache.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(source_common_symbols);
            final SubLObject table_var = fbc_file_hash_table_cache(fbc);
            utilities_macros.$progress_note$.setDynamicValue(progress, thread);
            utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)file_backed_cache.ZERO_INTEGER, thread);
            final SubLObject _prev_bind_0_$4 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_backed_cache.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_backed_cache.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_backed_cache.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject continuation = (SubLObject)file_backed_cache.NIL;
                    SubLObject next;
                    for (SubLObject completeP = (SubLObject)file_backed_cache.NIL; file_backed_cache.NIL == completeP; completeP = Types.sublisp_null(next)) {
                        thread.resetMultipleValues();
                        final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)file_backed_cache.NIL);
                        final SubLObject the_value = thread.secondMultipleValue();
                        next = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (file_backed_cache.NIL != next) {
                            final SubLObject key = the_key;
                            final SubLObject value = the_value;
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_backed_cache.ONE_INTEGER), thread);
                            final SubLObject changed_value = Hashtables.gethash_without_values(key, v_cache, not_present);
                            SubLObject final_value = (SubLObject)file_backed_cache.NIL;
                            if (not_present.eql(changed_value)) {
                                final_value = value;
                            }
                            else {
                                set.set_add(key, changes);
                                final_value = changed_value;
                            }
                            if (file_backed_cache.NIL != Functions.funcall(deleted_value_fn, final_value)) {
                                deletions = Numbers.add(deletions, (SubLObject)file_backed_cache.ONE_INTEGER);
                            }
                            else {
                                final SubLObject _prev_bind_0_$5 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    cfasl.$cfasl_common_symbols$.bind((SubLObject)file_backed_cache.NIL, thread);
                                    cfasl.cfasl_set_common_symbols_simple(target_common_symbols);
                                    file_hash_table.fast_put_file_hash_table(key, target_ffht, final_value);
                                }
                                finally {
                                    cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        continuation = next;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_backed_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$4, thread);
            }
            SubLObject key2 = (SubLObject)file_backed_cache.NIL;
            SubLObject local_value = (SubLObject)file_backed_cache.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(v_cache);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key2 = Hashtables.getEntryKey(cdohash_entry);
                    local_value = Hashtables.getEntryValue(cdohash_entry);
                    if (file_backed_cache.NIL == set.set_memberP(key2, changes)) {
                        additions = Numbers.add(additions, (SubLObject)file_backed_cache.ONE_INTEGER);
                        final SubLObject _prev_bind_0_$7 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                        try {
                            cfasl.$cfasl_common_symbols$.bind((SubLObject)file_backed_cache.NIL, thread);
                            cfasl.cfasl_set_common_symbols_simple(target_common_symbols);
                            file_hash_table.fast_put_file_hash_table(key2, target_ffht, local_value);
                        }
                        finally {
                            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.finalize_fast_create_file_hash_table(target_ffht, (SubLObject)file_backed_cache.UNPROVIDED, (SubLObject)file_backed_cache.UNPROVIDED);
        final SubLObject modifications = Numbers.subtract(set.set_size(changes), deletions);
        return Values.values(filename, modifications, additions, deletions);
    }
    
    public static SubLObject declare_file_backed_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_print_function_trampoline", "FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_p", "FILE-BACKED-CACHE-P", 1, 0, false);
        new $file_backed_cache_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_file_hash_table_cache", "FBC-FILE-HASH-TABLE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_local_cache", "FBC-LOCAL-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_file_hash_table_path", "FBC-FILE-HASH-TABLE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_should_preload_cache", "FBC-SHOULD-PRELOAD-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_is_fort_cache", "FBC-IS-FORT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_fht_cache_percentage", "FBC-FHT-CACHE-PERCENTAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_test", "FBC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_mode", "FBC-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_is_busy", "FBC-IS-BUSY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_file_hash_table_cache", "_CSETF-FBC-FILE-HASH-TABLE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_local_cache", "_CSETF-FBC-LOCAL-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_file_hash_table_path", "_CSETF-FBC-FILE-HASH-TABLE-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_should_preload_cache", "_CSETF-FBC-SHOULD-PRELOAD-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_is_fort_cache", "_CSETF-FBC-IS-FORT-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_fht_cache_percentage", "_CSETF-FBC-FHT-CACHE-PERCENTAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_test", "_CSETF-FBC-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_mode", "_CSETF-FBC-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "_csetf_fbc_is_busy", "_CSETF-FBC-IS-BUSY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "make_file_backed_cache", "MAKE-FILE-BACKED-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "visit_defstruct_file_backed_cache", "VISIT-DEFSTRUCT-FILE-BACKED-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "visit_defstruct_object_file_backed_cache_method", "VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_create", "FILE-BACKED-CACHE-CREATE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "print_fbc", "PRINT-FBC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_initialize", "FBC-INITIALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "fbc_initialize_internal", "FBC-INITIALIZE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_reconnect", "FILE-BACKED-CACHE-RECONNECT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_reset", "FILE-BACKED-CACHE-RESET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_finalize", "FILE-BACKED-CACHE-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_change_stream_buffer_size", "FILE-BACKED-CACHE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_enable_memory_mapping", "FILE-BACKED-CACHE-ENABLE-MEMORY-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_memory_mappedP", "FILE-BACKED-CACHE-MEMORY-MAPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "preload_entire_file_hash_table", "PRELOAD-ENTIRE-FILE-HASH-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_lookup", "FILE-BACKED-CACHE-LOOKUP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_enter", "FILE-BACKED-CACHE-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_file_hash_table_path", "FILE-BACKED-CACHE-FILE-HASH-TABLE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "file_backed_cache_local_cache_count", "FILE-BACKED-CACHE-LOCAL-CACHE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "replicate_file_backed_cache", "REPLICATE-FILE-BACKED-CACHE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache", "replicate_file_backed_cache_int", "REPLICATE-FILE-BACKED-CACHE-INT", 7, 0, false);
        return (SubLObject)file_backed_cache.NIL;
    }
    
    public static SubLObject init_file_backed_cache_file() {
        file_backed_cache.$fbc_reset_lock$ = SubLFiles.deflexical("*FBC-RESET-LOCK*", Locks.make_lock((SubLObject)file_backed_cache.$str0$fbc_reset_lock));
        file_backed_cache.$file_backed_cache_base_path$ = SubLFiles.deflexical("*FILE-BACKED-CACHE-BASE-PATH*", red_infrastructure_macros.red_def_helper((SubLObject)(file_backed_cache.$list1.isSymbol() ? Symbols.symbol_value((SubLObject)file_backed_cache.$list1) : file_backed_cache.$list1), (SubLObject)file_backed_cache.$sym2$_FILE_BACKED_CACHE_BASE_PATH_, (SubLObject)(file_backed_cache.$str3$data_caches_.isSymbol() ? Symbols.symbol_value((SubLObject)file_backed_cache.$str3$data_caches_) : file_backed_cache.$str3$data_caches_), (SubLObject)file_backed_cache.$kw4$LEXICAL, (SubLObject)file_backed_cache.UNPROVIDED));
        file_backed_cache.$dtp_file_backed_cache$ = SubLFiles.defconstant("*DTP-FILE-BACKED-CACHE*", (SubLObject)file_backed_cache.$sym5$FILE_BACKED_CACHE);
        return (SubLObject)file_backed_cache.NIL;
    }
    
    public static SubLObject setup_file_backed_cache_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_backed_cache.$dtp_file_backed_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_backed_cache.$sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_backed_cache.$list13);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym14$FBC_FILE_HASH_TABLE_CACHE, (SubLObject)file_backed_cache.$sym15$_CSETF_FBC_FILE_HASH_TABLE_CACHE);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym16$FBC_LOCAL_CACHE, (SubLObject)file_backed_cache.$sym17$_CSETF_FBC_LOCAL_CACHE);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym18$FBC_FILE_HASH_TABLE_PATH, (SubLObject)file_backed_cache.$sym19$_CSETF_FBC_FILE_HASH_TABLE_PATH);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym20$FBC_SHOULD_PRELOAD_CACHE, (SubLObject)file_backed_cache.$sym21$_CSETF_FBC_SHOULD_PRELOAD_CACHE);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym22$FBC_IS_FORT_CACHE, (SubLObject)file_backed_cache.$sym23$_CSETF_FBC_IS_FORT_CACHE);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym24$FBC_FHT_CACHE_PERCENTAGE, (SubLObject)file_backed_cache.$sym25$_CSETF_FBC_FHT_CACHE_PERCENTAGE);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym26$FBC_TEST, (SubLObject)file_backed_cache.$sym27$_CSETF_FBC_TEST);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym28$FBC_MODE, (SubLObject)file_backed_cache.$sym29$_CSETF_FBC_MODE);
        Structures.def_csetf((SubLObject)file_backed_cache.$sym30$FBC_IS_BUSY, (SubLObject)file_backed_cache.$sym31$_CSETF_FBC_IS_BUSY);
        Equality.identity((SubLObject)file_backed_cache.$sym5$FILE_BACKED_CACHE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_backed_cache.$dtp_file_backed_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_backed_cache.$sym46$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD));
        return (SubLObject)file_backed_cache.NIL;
    }
    
    public void declareFunctions() {
        declare_file_backed_cache_file();
    }
    
    public void initializeVariables() {
        init_file_backed_cache_file();
    }
    
    public void runTopLevelForms() {
        setup_file_backed_cache_file();
    }
    
    static {
        me = (SubLFile)new file_backed_cache();
        file_backed_cache.$fbc_reset_lock$ = null;
        file_backed_cache.$file_backed_cache_base_path$ = null;
        file_backed_cache.$dtp_file_backed_cache$ = null;
        $str0$fbc_reset_lock = SubLObjectFactory.makeString("fbc-reset-lock");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.file-backed-cache.base-path"));
        $sym2$_FILE_BACKED_CACHE_BASE_PATH_ = SubLObjectFactory.makeSymbol("*FILE-BACKED-CACHE-BASE-PATH*");
        $str3$data_caches_ = SubLObjectFactory.makeString("data/caches/");
        $kw4$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $sym5$FILE_BACKED_CACHE = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE");
        $sym6$FILE_BACKED_CACHE_P = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-P");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-CACHE"), SubLObjectFactory.makeSymbol("LOCAL-CACHE"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-PATH"), SubLObjectFactory.makeSymbol("SHOULD-PRELOAD-CACHE"), SubLObjectFactory.makeSymbol("IS-FORT-CACHE"), SubLObjectFactory.makeSymbol("FHT-CACHE-PERCENTAGE"), SubLObjectFactory.makeSymbol("TEST"), SubLObjectFactory.makeSymbol("MODE"), SubLObjectFactory.makeSymbol("IS-BUSY") });
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FILE-HASH-TABLE-CACHE"), SubLObjectFactory.makeKeyword("LOCAL-CACHE"), SubLObjectFactory.makeKeyword("FILE-HASH-TABLE-PATH"), SubLObjectFactory.makeKeyword("SHOULD-PRELOAD-CACHE"), SubLObjectFactory.makeKeyword("IS-FORT-CACHE"), SubLObjectFactory.makeKeyword("FHT-CACHE-PERCENTAGE"), SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("IS-BUSY") });
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FBC-FILE-HASH-TABLE-CACHE"), SubLObjectFactory.makeSymbol("FBC-LOCAL-CACHE"), SubLObjectFactory.makeSymbol("FBC-FILE-HASH-TABLE-PATH"), SubLObjectFactory.makeSymbol("FBC-SHOULD-PRELOAD-CACHE"), SubLObjectFactory.makeSymbol("FBC-IS-FORT-CACHE"), SubLObjectFactory.makeSymbol("FBC-FHT-CACHE-PERCENTAGE"), SubLObjectFactory.makeSymbol("FBC-TEST"), SubLObjectFactory.makeSymbol("FBC-MODE"), SubLObjectFactory.makeSymbol("FBC-IS-BUSY") });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-FBC-LOCAL-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-PATH"), SubLObjectFactory.makeSymbol("_CSETF-FBC-SHOULD-PRELOAD-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-FBC-IS-FORT-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-FBC-FHT-CACHE-PERCENTAGE"), SubLObjectFactory.makeSymbol("_CSETF-FBC-TEST"), SubLObjectFactory.makeSymbol("_CSETF-FBC-MODE"), SubLObjectFactory.makeSymbol("_CSETF-FBC-IS-BUSY") });
        $sym11$PRINT_FBC = SubLObjectFactory.makeSymbol("PRINT-FBC");
        $sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-P"));
        $sym14$FBC_FILE_HASH_TABLE_CACHE = SubLObjectFactory.makeSymbol("FBC-FILE-HASH-TABLE-CACHE");
        $sym15$_CSETF_FBC_FILE_HASH_TABLE_CACHE = SubLObjectFactory.makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-CACHE");
        $sym16$FBC_LOCAL_CACHE = SubLObjectFactory.makeSymbol("FBC-LOCAL-CACHE");
        $sym17$_CSETF_FBC_LOCAL_CACHE = SubLObjectFactory.makeSymbol("_CSETF-FBC-LOCAL-CACHE");
        $sym18$FBC_FILE_HASH_TABLE_PATH = SubLObjectFactory.makeSymbol("FBC-FILE-HASH-TABLE-PATH");
        $sym19$_CSETF_FBC_FILE_HASH_TABLE_PATH = SubLObjectFactory.makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-PATH");
        $sym20$FBC_SHOULD_PRELOAD_CACHE = SubLObjectFactory.makeSymbol("FBC-SHOULD-PRELOAD-CACHE");
        $sym21$_CSETF_FBC_SHOULD_PRELOAD_CACHE = SubLObjectFactory.makeSymbol("_CSETF-FBC-SHOULD-PRELOAD-CACHE");
        $sym22$FBC_IS_FORT_CACHE = SubLObjectFactory.makeSymbol("FBC-IS-FORT-CACHE");
        $sym23$_CSETF_FBC_IS_FORT_CACHE = SubLObjectFactory.makeSymbol("_CSETF-FBC-IS-FORT-CACHE");
        $sym24$FBC_FHT_CACHE_PERCENTAGE = SubLObjectFactory.makeSymbol("FBC-FHT-CACHE-PERCENTAGE");
        $sym25$_CSETF_FBC_FHT_CACHE_PERCENTAGE = SubLObjectFactory.makeSymbol("_CSETF-FBC-FHT-CACHE-PERCENTAGE");
        $sym26$FBC_TEST = SubLObjectFactory.makeSymbol("FBC-TEST");
        $sym27$_CSETF_FBC_TEST = SubLObjectFactory.makeSymbol("_CSETF-FBC-TEST");
        $sym28$FBC_MODE = SubLObjectFactory.makeSymbol("FBC-MODE");
        $sym29$_CSETF_FBC_MODE = SubLObjectFactory.makeSymbol("_CSETF-FBC-MODE");
        $sym30$FBC_IS_BUSY = SubLObjectFactory.makeSymbol("FBC-IS-BUSY");
        $sym31$_CSETF_FBC_IS_BUSY = SubLObjectFactory.makeSymbol("_CSETF-FBC-IS-BUSY");
        $kw32$FILE_HASH_TABLE_CACHE = SubLObjectFactory.makeKeyword("FILE-HASH-TABLE-CACHE");
        $kw33$LOCAL_CACHE = SubLObjectFactory.makeKeyword("LOCAL-CACHE");
        $kw34$FILE_HASH_TABLE_PATH = SubLObjectFactory.makeKeyword("FILE-HASH-TABLE-PATH");
        $kw35$SHOULD_PRELOAD_CACHE = SubLObjectFactory.makeKeyword("SHOULD-PRELOAD-CACHE");
        $kw36$IS_FORT_CACHE = SubLObjectFactory.makeKeyword("IS-FORT-CACHE");
        $kw37$FHT_CACHE_PERCENTAGE = SubLObjectFactory.makeKeyword("FHT-CACHE-PERCENTAGE");
        $kw38$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw39$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw40$IS_BUSY = SubLObjectFactory.makeKeyword("IS-BUSY");
        $str41$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw42$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym43$MAKE_FILE_BACKED_CACHE = SubLObjectFactory.makeSymbol("MAKE-FILE-BACKED-CACHE");
        $kw44$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw45$END = SubLObjectFactory.makeKeyword("END");
        $sym46$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-METHOD");
        $kw47$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $str48$_FILE_BACKED_CACHE__A_ = SubLObjectFactory.makeString("<FILE-BACKED-CACHE ~A>");
        $str49$_INVALID_FILE_BACKED_CACHE_ = SubLObjectFactory.makeString("<INVALID FILE-BACKED-CACHE>");
        $sym50$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $int51$100 = SubLObjectFactory.makeInteger(100);
        $str52$Preloading_file_backed_cache_ = SubLObjectFactory.makeString("Preloading file-backed cache.");
        $kw53$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw54$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $kw55$FBC_NOT_FOUND_VALUE = SubLObjectFactory.makeKeyword("FBC-NOT-FOUND-VALUE");
        $str56$_S_has_no_associated_file_hash_ta = SubLObjectFactory.makeString("~S has no associated file hash table.");
        $kw57$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym58$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym59$NULL = SubLObjectFactory.makeSymbol("NULL");
        $str60$tmp_ = SubLObjectFactory.makeString("tmp/");
        $str61$The_Not_Present_Marker = SubLObjectFactory.makeString("The Not Present Marker");
    }
    
    public static final class $file_backed_cache_native extends SubLStructNative
    {
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
        
        public $file_backed_cache_native() {
            this.$file_hash_table_cache = (SubLObject)CommonSymbols.NIL;
            this.$local_cache = (SubLObject)CommonSymbols.NIL;
            this.$file_hash_table_path = (SubLObject)CommonSymbols.NIL;
            this.$should_preload_cache = (SubLObject)CommonSymbols.NIL;
            this.$is_fort_cache = (SubLObject)CommonSymbols.NIL;
            this.$fht_cache_percentage = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$mode = (SubLObject)CommonSymbols.NIL;
            this.$is_busy = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_backed_cache_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$file_hash_table_cache;
        }
        
        public SubLObject getField3() {
            return this.$local_cache;
        }
        
        public SubLObject getField4() {
            return this.$file_hash_table_path;
        }
        
        public SubLObject getField5() {
            return this.$should_preload_cache;
        }
        
        public SubLObject getField6() {
            return this.$is_fort_cache;
        }
        
        public SubLObject getField7() {
            return this.$fht_cache_percentage;
        }
        
        public SubLObject getField8() {
            return this.$test;
        }
        
        public SubLObject getField9() {
            return this.$mode;
        }
        
        public SubLObject getField10() {
            return this.$is_busy;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$file_hash_table_cache = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$local_cache = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$file_hash_table_path = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$should_preload_cache = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$is_fort_cache = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$fht_cache_percentage = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$mode = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$is_busy = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_backed_cache_native.class, file_backed_cache.$sym5$FILE_BACKED_CACHE, file_backed_cache.$sym6$FILE_BACKED_CACHE_P, file_backed_cache.$list7, file_backed_cache.$list8, new String[] { "$file_hash_table_cache", "$local_cache", "$file_hash_table_path", "$should_preload_cache", "$is_fort_cache", "$fht_cache_percentage", "$test", "$mode", "$is_busy" }, file_backed_cache.$list9, file_backed_cache.$list10, file_backed_cache.$sym11$PRINT_FBC);
        }
    }
    
    public static final class $file_backed_cache_p$UnaryFunction extends UnaryFunction
    {
        public $file_backed_cache_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-BACKED-CACHE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return file_backed_cache.file_backed_cache_p(arg1);
        }
    }
}

/*

	Total time: 323 ms
	
*/