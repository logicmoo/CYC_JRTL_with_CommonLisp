package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_backed_cache_setup extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.file_backed_cache_setup";
    public static final String myFingerPrint = "0cb91203e8365a2273d1e484b8fb782c30fadce118f600a9c40a1ff743243b7c";
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 1260L)
    private static SubLSymbol $registered_file_backed_caches$;
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 1431L)
    public static SubLSymbol $file_backed_cache_default_temp_dir$;
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 1534L)
    private static SubLSymbol $fbc_registration_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLSymbol $dtp_file_backed_cache_registration$;
    private static final SubLSymbol $sym0$_REGISTERED_FILE_BACKED_CACHES_;
    private static final SubLString $str1$tmp_;
    private static final SubLString $str2$fbc_registration_lock;
    private static final SubLSymbol $sym3$FILE_BACKED_CACHE_REGISTRATION;
    private static final SubLSymbol $sym4$FILE_BACKED_CACHE_REGISTRATION_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym10$FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$FBCR_GENERATION_FUNCTION;
    private static final SubLSymbol $sym13$_CSETF_FBCR_GENERATION_FUNCTION;
    private static final SubLSymbol $sym14$FBCR_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym15$_CSETF_FBCR_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym16$FBCR_RESET_FUNCTION;
    private static final SubLSymbol $sym17$_CSETF_FBCR_RESET_FUNCTION;
    private static final SubLSymbol $sym18$FBCR_DEFAULT_FHT_NAME_FUNCTION;
    private static final SubLSymbol $sym19$_CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION;
    private static final SubLSymbol $sym20$FBCR_TEST_SUITE_NAME;
    private static final SubLSymbol $sym21$_CSETF_FBCR_TEST_SUITE_NAME;
    private static final SubLSymbol $sym22$FBCR_MODULE_NAME;
    private static final SubLSymbol $sym23$_CSETF_FBCR_MODULE_NAME;
    private static final SubLSymbol $sym24$FBCR_SYSTEM_NAME;
    private static final SubLSymbol $sym25$_CSETF_FBCR_SYSTEM_NAME;
    private static final SubLSymbol $kw26$GENERATION_FUNCTION;
    private static final SubLSymbol $kw27$INITIALIZATION_FUNCTION;
    private static final SubLSymbol $kw28$RESET_FUNCTION;
    private static final SubLSymbol $kw29$DEFAULT_FHT_NAME_FUNCTION;
    private static final SubLSymbol $kw30$TEST_SUITE_NAME;
    private static final SubLSymbol $kw31$MODULE_NAME;
    private static final SubLSymbol $kw32$SYSTEM_NAME;
    private static final SubLString $str33$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw34$BEGIN;
    private static final SubLSymbol $sym35$MAKE_FILE_BACKED_CACHE_REGISTRATION;
    private static final SubLSymbol $kw36$SLOT;
    private static final SubLSymbol $kw37$END;
    private static final SubLSymbol $sym38$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_REGISTRATION_METHOD;
    private static final SubLSymbol $sym39$GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES;
    private static final SubLString $str40$_tmp;
    private static final SubLString $str41$Starting_file_backed_cache_genera;
    private static final SubLString $str42$Done_installing__A_cache_s__out_o;
    private static final SubLString $str43$Starting_file_backed_cache_genera;
    private static final SubLString $str44$Starting_file_backed_cache_test_s;
    private static final SubLString $str45$Starting_file_backed_cache_instal;
    private static final SubLString $str46$Provided_cache__A_is_not_a_file_b;
    private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str48$Generating_cache_for_file___A__;
    private static final SubLString $str49$Moving__A_to__A__;
    private static final SubLString $str50$Encountered_a_problem_either_gene;
    private static final SubLString $str51$__;
    private static final SubLInteger $int52$509;
    private static final SubLString $str53$_A_is_not_a_valid_directory___;
    private static final SubLString $str54$_;
    private static final SubLSymbol $sym55$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$CSETQ;
    private static final SubLString $str58$_A;
    private static final SubLString $str59$__Resetting_all_file_backed_cache;
    private static final SubLSymbol $sym60$CREATE_RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLSymbol $sym61$INITIALIZE_RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLSymbol $sym62$RESET_RKF_IRRELEVANT_FORT_CACHE;
    private static final SubLSymbol $sym63$GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH;
    private static final SubLString $str64$rkf_irrelevant_fort_cache;
    private static final SubLString $str65$cycl;
    private static final SubLString $str66$RKF_Irrelevant_Fort_Cache_Test_Su;
    private static final SubLSymbol $sym67$CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS;
    private static final SubLSymbol $sym68$INITIALIZE_NL_GENERATION_CACHES;
    private static final SubLSymbol $sym69$RESET_NL_GENERATION_CACHES;
    private static final SubLSymbol $sym70$GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH;
    private static final SubLString $str71$nl_generation_fort_cache;
    private static final SubLString $str72$NL_Fort_Cache_Test_Suite;
    private static final SubLSymbol $sym73$INITIALIZE_NL_TRIE_SUBWORD_CACHES;
    private static final SubLSymbol $sym74$RESET_NL_TRIE_SUBWORD_CACHES;
    private static final SubLSymbol $sym75$GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH;
    private static final SubLString $str76$nl_trie_subword_index;
    private static final SubLString $str77$NL_Trie_subword_index;
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject file_backed_cache_registration_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_backed_cache_setup.ZERO_INTEGER);
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject file_backed_cache_registration_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_backed_cache_registration_native.class) ? file_backed_cache_setup.T : file_backed_cache_setup.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_generation_function(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_initialization_function(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_reset_function(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_default_fht_name_function(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_test_suite_name(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_module_name(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject fbcr_system_name(final SubLObject v_object) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_generation_function(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_initialization_function(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_reset_function(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_default_fht_name_function(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_test_suite_name(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_module_name(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject _csetf_fbcr_system_name(final SubLObject v_object, final SubLObject value) {
        assert file_backed_cache_setup.NIL != file_backed_cache_registration_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject make_file_backed_cache_registration(SubLObject arglist) {
        if (arglist == file_backed_cache_setup.UNPROVIDED) {
            arglist = (SubLObject)file_backed_cache_setup.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_backed_cache_registration_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_backed_cache_setup.NIL, next = arglist; file_backed_cache_setup.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw26$GENERATION_FUNCTION)) {
                _csetf_fbcr_generation_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw27$INITIALIZATION_FUNCTION)) {
                _csetf_fbcr_initialization_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw28$RESET_FUNCTION)) {
                _csetf_fbcr_reset_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw29$DEFAULT_FHT_NAME_FUNCTION)) {
                _csetf_fbcr_default_fht_name_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw30$TEST_SUITE_NAME)) {
                _csetf_fbcr_test_suite_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw31$MODULE_NAME)) {
                _csetf_fbcr_module_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_backed_cache_setup.$kw32$SYSTEM_NAME)) {
                _csetf_fbcr_system_name(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_backed_cache_setup.$str33$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject visit_defstruct_file_backed_cache_registration(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw34$BEGIN, (SubLObject)file_backed_cache_setup.$sym35$MAKE_FILE_BACKED_CACHE_REGISTRATION, (SubLObject)file_backed_cache_setup.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw26$GENERATION_FUNCTION, fbcr_generation_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw27$INITIALIZATION_FUNCTION, fbcr_initialization_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw28$RESET_FUNCTION, fbcr_reset_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw29$DEFAULT_FHT_NAME_FUNCTION, fbcr_default_fht_name_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw30$TEST_SUITE_NAME, fbcr_test_suite_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw31$MODULE_NAME, fbcr_module_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw36$SLOT, (SubLObject)file_backed_cache_setup.$kw32$SYSTEM_NAME, fbcr_system_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_backed_cache_setup.$kw37$END, (SubLObject)file_backed_cache_setup.$sym35$MAKE_FILE_BACKED_CACHE_REGISTRATION, (SubLObject)file_backed_cache_setup.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022L)
    public static SubLObject visit_defstruct_object_file_backed_cache_registration_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_backed_cache_registration(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2229L)
    public static SubLObject register_file_backed_cache(final SubLObject generation_function, final SubLObject initialization_function, final SubLObject reset_function, final SubLObject default_fht_name_function, final SubLObject module_name, final SubLObject system_name, final SubLObject test_suite_name) {
        SubLObject release = (SubLObject)file_backed_cache_setup.NIL;
        try {
            release = Locks.seize_lock(file_backed_cache_setup.$fbc_registration_lock$.getGlobalValue());
            SubLObject new_registered_file_backed_cached = (SubLObject)file_backed_cache_setup.NIL;
            SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
            v_cache = cdolist_list_var.first();
            while (file_backed_cache_setup.NIL != cdolist_list_var) {
                if (!default_fht_name_function.equal(fbcr_default_fht_name_function(v_cache))) {
                    new_registered_file_backed_cached = (SubLObject)ConsesLow.cons(v_cache, new_registered_file_backed_cached);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            }
            file_backed_cache_setup.$registered_file_backed_caches$.setGlobalValue(new_registered_file_backed_cached);
            final SubLObject result = make_file_backed_cache_registration((SubLObject)file_backed_cache_setup.UNPROVIDED);
            _csetf_fbcr_generation_function(result, generation_function);
            _csetf_fbcr_initialization_function(result, initialization_function);
            _csetf_fbcr_reset_function(result, reset_function);
            _csetf_fbcr_default_fht_name_function(result, default_fht_name_function);
            _csetf_fbcr_test_suite_name(result, test_suite_name);
            _csetf_fbcr_module_name(result, module_name);
            _csetf_fbcr_system_name(result, system_name);
            file_backed_cache_setup.$registered_file_backed_caches$.setGlobalValue((SubLObject)ConsesLow.cons(result, file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()));
        }
        finally {
            if (file_backed_cache_setup.NIL != release) {
                Locks.release_lock(file_backed_cache_setup.$fbc_registration_lock$.getGlobalValue());
            }
        }
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 3545L)
    public static SubLObject lookup_file_backed_cache_by_name(final SubLObject module_name) {
        SubLObject result = (SubLObject)file_backed_cache_setup.NIL;
        if (file_backed_cache_setup.NIL == result) {
            SubLObject csome_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
            v_cache = csome_list_var.first();
            while (file_backed_cache_setup.NIL == result && file_backed_cache_setup.NIL != csome_list_var) {
                if (file_backed_cache_setup.NIL != Strings.stringE(module_name, fbcr_module_name(v_cache), (SubLObject)file_backed_cache_setup.UNPROVIDED, (SubLObject)file_backed_cache_setup.UNPROVIDED, (SubLObject)file_backed_cache_setup.UNPROVIDED, (SubLObject)file_backed_cache_setup.UNPROVIDED)) {
                    result = v_cache;
                }
                csome_list_var = csome_list_var.rest();
                v_cache = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 3786L)
    public static SubLObject generate_test_install_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == file_backed_cache_setup.UNPROVIDED) {
            tmp_extension = (SubLObject)file_backed_cache_setup.$str40$_tmp;
        }
        if (tmp_dir == file_backed_cache_setup.UNPROVIDED) {
            tmp_dir = file_backed_cache_setup.$file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str41$Starting_file_backed_cache_genera);
        SubLObject error_count = (SubLObject)file_backed_cache_setup.ZERO_INTEGER;
        SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
        v_cache = cdolist_list_var.first();
        while (file_backed_cache_setup.NIL != cdolist_list_var) {
            if (file_backed_cache_setup.NIL != fbcr_generation_function(v_cache) && file_backed_cache_setup.NIL != generate_test_install_file_backed_cache(v_cache, (SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.T, tmp_extension, tmp_dir)) {
                error_count = Numbers.add((SubLObject)file_backed_cache_setup.ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str42$Done_installing__A_cache_s__out_o, new SubLObject[] { Numbers.subtract(Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count), Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count });
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 4476L)
    public static SubLObject generate_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == file_backed_cache_setup.UNPROVIDED) {
            tmp_extension = (SubLObject)file_backed_cache_setup.$str40$_tmp;
        }
        if (tmp_dir == file_backed_cache_setup.UNPROVIDED) {
            tmp_dir = file_backed_cache_setup.$file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str43$Starting_file_backed_cache_genera);
        SubLObject error_count = (SubLObject)file_backed_cache_setup.ZERO_INTEGER;
        SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
        v_cache = cdolist_list_var.first();
        while (file_backed_cache_setup.NIL != cdolist_list_var) {
            if (file_backed_cache_setup.NIL != fbcr_generation_function(v_cache) && file_backed_cache_setup.NIL != generate_test_install_file_backed_cache(v_cache, (SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.NIL, tmp_extension, tmp_dir)) {
                error_count = Numbers.add((SubLObject)file_backed_cache_setup.ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str42$Done_installing__A_cache_s__out_o, new SubLObject[] { Numbers.subtract(Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count), Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count });
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 5146L)
    public static SubLObject test_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == file_backed_cache_setup.UNPROVIDED) {
            tmp_extension = (SubLObject)file_backed_cache_setup.$str40$_tmp;
        }
        if (tmp_dir == file_backed_cache_setup.UNPROVIDED) {
            tmp_dir = file_backed_cache_setup.$file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str44$Starting_file_backed_cache_test_s);
        SubLObject error_count = (SubLObject)file_backed_cache_setup.ZERO_INTEGER;
        SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
        v_cache = cdolist_list_var.first();
        while (file_backed_cache_setup.NIL != cdolist_list_var) {
            if (file_backed_cache_setup.NIL != fbcr_generation_function(v_cache) && file_backed_cache_setup.NIL != generate_test_install_file_backed_cache(v_cache, (SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.NIL, tmp_extension, tmp_dir)) {
                error_count = Numbers.add((SubLObject)file_backed_cache_setup.ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str42$Done_installing__A_cache_s__out_o, new SubLObject[] { Numbers.subtract(Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count), Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count });
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 5799L)
    public static SubLObject install_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == file_backed_cache_setup.UNPROVIDED) {
            tmp_extension = (SubLObject)file_backed_cache_setup.$str40$_tmp;
        }
        if (tmp_dir == file_backed_cache_setup.UNPROVIDED) {
            tmp_dir = file_backed_cache_setup.$file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str45$Starting_file_backed_cache_instal);
        SubLObject error_count = (SubLObject)file_backed_cache_setup.ZERO_INTEGER;
        SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
        v_cache = cdolist_list_var.first();
        while (file_backed_cache_setup.NIL != cdolist_list_var) {
            if (file_backed_cache_setup.NIL != fbcr_generation_function(v_cache) && file_backed_cache_setup.NIL != generate_test_install_file_backed_cache(v_cache, (SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.T, tmp_extension, tmp_dir)) {
                error_count = Numbers.add((SubLObject)file_backed_cache_setup.ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str42$Done_installing__A_cache_s__out_o, new SubLObject[] { Numbers.subtract(Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count), Sequences.length(file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()), error_count });
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 6464L)
    public static SubLObject generate_test_install_file_backed_cache(final SubLObject fbcr, final SubLObject should_generate, final SubLObject should_test, final SubLObject should_install, SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == file_backed_cache_setup.UNPROVIDED) {
            tmp_extension = (SubLObject)file_backed_cache_setup.$str40$_tmp;
        }
        if (tmp_dir == file_backed_cache_setup.UNPROVIDED) {
            tmp_dir = file_backed_cache_setup.$file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_backed_cache_setup.NIL == file_backed_cache_registration_p(fbcr)) {
            Errors.error((SubLObject)file_backed_cache_setup.$str46$Provided_cache__A_is_not_a_file_b, fbcr);
        }
        ensure_file_backed_cache_directory();
        SubLObject msg = (SubLObject)file_backed_cache_setup.NIL;
        SubLObject had_error = (SubLObject)file_backed_cache_setup.NIL;
        final SubLObject tmp_file = Sequences.cconcatenate(Functions.funcall(fbcr_default_fht_name_function(fbcr)), tmp_extension);
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)file_backed_cache_setup.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (file_backed_cache_setup.NIL != Filesys.probe_file(tmp_file)) {
                        Filesys.delete_file(tmp_file);
                    }
                    if (file_backed_cache_setup.NIL == msg && file_backed_cache_setup.NIL != should_generate) {
                        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str48$Generating_cache_for_file___A__, tmp_file);
                        Functions.funcall(fbcr_generation_function(fbcr), tmp_file, tmp_dir);
                    }
                    if (file_backed_cache_setup.NIL == msg && file_backed_cache_setup.NIL != should_install) {
                        PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str49$Moving__A_to__A__, tmp_file, Functions.funcall(fbcr_default_fht_name_function(fbcr)));
                        if (file_backed_cache_setup.NIL != Filesys.probe_file(Functions.funcall(fbcr_default_fht_name_function(fbcr)))) {
                            Filesys.delete_file(Functions.funcall(fbcr_default_fht_name_function(fbcr)));
                        }
                        Filesys.rename_file(tmp_file, Functions.funcall(fbcr_default_fht_name_function(fbcr)));
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache_setup.NIL);
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
        if (file_backed_cache_setup.NIL != msg) {
            had_error = (SubLObject)file_backed_cache_setup.T;
            PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str50$Encountered_a_problem_either_gene, tmp_file);
            Errors.warn(msg);
            PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str51$__);
        }
        return had_error;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 8504L)
    public static SubLObject ensure_file_backed_cache_directory() {
        if (file_backed_cache_setup.NIL == Filesys.directory_p(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue())) {
            Filesys.make_directory(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), (SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.$int52$509);
            if (file_backed_cache_setup.NIL == Filesys.directory_p(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue())) {
                Errors.error((SubLObject)file_backed_cache_setup.$str53$_A_is_not_a_valid_directory___, file_backed_cache.$file_backed_cache_base_path$.getGlobalValue());
            }
        }
        final SubLObject dir_name = Sequences.cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[] { file_backed_cache_setup.$str54$_, operation_communication.kb_loaded_string(), file_backed_cache_setup.$str54$_ });
        if (file_backed_cache_setup.NIL == Filesys.directory_p(dir_name)) {
            Filesys.make_directory(dir_name, (SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.$int52$509);
            if (file_backed_cache_setup.NIL == Filesys.directory_p(dir_name)) {
                Errors.error((SubLObject)file_backed_cache_setup.$str53$_A_is_not_a_valid_directory___, dir_name);
            }
        }
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 9132L)
    public static SubLObject initialize_all_file_backed_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_backed_cache_setup.NIL == control_vars.kb_loaded()) {
            return (SubLObject)file_backed_cache_setup.NIL;
        }
        SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
        v_cache = cdolist_list_var.first();
        while (file_backed_cache_setup.NIL != cdolist_list_var) {
            SubLObject message_var = (SubLObject)file_backed_cache_setup.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)file_backed_cache_setup.$sym55$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)file_backed_cache_setup.$list56);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)file_backed_cache_setup.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            Functions.funcall(fbcr_initialization_function(v_cache));
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache_setup.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_backed_cache_setup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)file_backed_cache_setup.$sym57$CSETQ, (SubLObject)file_backed_cache_setup.$sym55$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)file_backed_cache_setup.$str58$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-backed-cache-setup.lisp", position = 9567L)
    public static SubLObject reset_all_file_backed_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_backed_cache_setup.NIL == control_vars.kb_loaded()) {
            return (SubLObject)file_backed_cache_setup.NIL;
        }
        if (file_backed_cache_setup.NIL != file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue()) {
            PrintLow.format((SubLObject)file_backed_cache_setup.T, (SubLObject)file_backed_cache_setup.$str59$__Resetting_all_file_backed_cache);
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        SubLObject cdolist_list_var = file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = (SubLObject)file_backed_cache_setup.NIL;
        v_cache = cdolist_list_var.first();
        while (file_backed_cache_setup.NIL != cdolist_list_var) {
            SubLObject message_var = (SubLObject)file_backed_cache_setup.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)file_backed_cache_setup.$sym55$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)file_backed_cache_setup.$list56);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)file_backed_cache_setup.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            Functions.funcall(fbcr_reset_function(v_cache));
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)file_backed_cache_setup.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_backed_cache_setup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)file_backed_cache_setup.$sym57$CSETQ, (SubLObject)file_backed_cache_setup.$sym55$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)file_backed_cache_setup.$str58$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    public static SubLObject declare_file_backed_cache_setup_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "file_backed_cache_registration_print_function_trampoline", "FILE-BACKED-CACHE-REGISTRATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "file_backed_cache_registration_p", "FILE-BACKED-CACHE-REGISTRATION-P", 1, 0, false);
        new $file_backed_cache_registration_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_generation_function", "FBCR-GENERATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_initialization_function", "FBCR-INITIALIZATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_reset_function", "FBCR-RESET-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_default_fht_name_function", "FBCR-DEFAULT-FHT-NAME-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_test_suite_name", "FBCR-TEST-SUITE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_module_name", "FBCR-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "fbcr_system_name", "FBCR-SYSTEM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_generation_function", "_CSETF-FBCR-GENERATION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_initialization_function", "_CSETF-FBCR-INITIALIZATION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_reset_function", "_CSETF-FBCR-RESET-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_default_fht_name_function", "_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_test_suite_name", "_CSETF-FBCR-TEST-SUITE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_module_name", "_CSETF-FBCR-MODULE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "_csetf_fbcr_system_name", "_CSETF-FBCR-SYSTEM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "make_file_backed_cache_registration", "MAKE-FILE-BACKED-CACHE-REGISTRATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "visit_defstruct_file_backed_cache_registration", "VISIT-DEFSTRUCT-FILE-BACKED-CACHE-REGISTRATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "visit_defstruct_object_file_backed_cache_registration_method", "VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-REGISTRATION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "register_file_backed_cache", "REGISTER-FILE-BACKED-CACHE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "lookup_file_backed_cache_by_name", "LOOKUP-FILE-BACKED-CACHE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "generate_test_install_all_file_backed_caches", "GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "generate_all_file_backed_caches", "GENERATE-ALL-FILE-BACKED-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "test_all_file_backed_caches", "TEST-ALL-FILE-BACKED-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "install_all_file_backed_caches", "INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "generate_test_install_file_backed_cache", "GENERATE-TEST-INSTALL-FILE-BACKED-CACHE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "ensure_file_backed_cache_directory", "ENSURE-FILE-BACKED-CACHE-DIRECTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "initialize_all_file_backed_caches", "INITIALIZE-ALL-FILE-BACKED-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_backed_cache_setup", "reset_all_file_backed_caches", "RESET-ALL-FILE-BACKED-CACHES", 0, 0, false);
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    public static SubLObject init_file_backed_cache_setup_file() {
        file_backed_cache_setup.$registered_file_backed_caches$ = SubLFiles.deflexical("*REGISTERED-FILE-BACKED-CACHES*", (SubLObject)((file_backed_cache_setup.NIL != Symbols.boundp((SubLObject)file_backed_cache_setup.$sym0$_REGISTERED_FILE_BACKED_CACHES_)) ? file_backed_cache_setup.$registered_file_backed_caches$.getGlobalValue() : file_backed_cache_setup.NIL));
        file_backed_cache_setup.$file_backed_cache_default_temp_dir$ = SubLFiles.defparameter("*FILE-BACKED-CACHE-DEFAULT-TEMP-DIR*", (SubLObject)file_backed_cache_setup.$str1$tmp_);
        file_backed_cache_setup.$fbc_registration_lock$ = SubLFiles.deflexical("*FBC-REGISTRATION-LOCK*", Locks.make_lock((SubLObject)file_backed_cache_setup.$str2$fbc_registration_lock));
        file_backed_cache_setup.$dtp_file_backed_cache_registration$ = SubLFiles.defconstant("*DTP-FILE-BACKED-CACHE-REGISTRATION*", (SubLObject)file_backed_cache_setup.$sym3$FILE_BACKED_CACHE_REGISTRATION);
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    public static SubLObject setup_file_backed_cache_setup_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)file_backed_cache_setup.$sym0$_REGISTERED_FILE_BACKED_CACHES_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_backed_cache_setup.$dtp_file_backed_cache_registration$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_backed_cache_setup.$sym10$FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_backed_cache_setup.$list11);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym12$FBCR_GENERATION_FUNCTION, (SubLObject)file_backed_cache_setup.$sym13$_CSETF_FBCR_GENERATION_FUNCTION);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym14$FBCR_INITIALIZATION_FUNCTION, (SubLObject)file_backed_cache_setup.$sym15$_CSETF_FBCR_INITIALIZATION_FUNCTION);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym16$FBCR_RESET_FUNCTION, (SubLObject)file_backed_cache_setup.$sym17$_CSETF_FBCR_RESET_FUNCTION);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym18$FBCR_DEFAULT_FHT_NAME_FUNCTION, (SubLObject)file_backed_cache_setup.$sym19$_CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym20$FBCR_TEST_SUITE_NAME, (SubLObject)file_backed_cache_setup.$sym21$_CSETF_FBCR_TEST_SUITE_NAME);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym22$FBCR_MODULE_NAME, (SubLObject)file_backed_cache_setup.$sym23$_CSETF_FBCR_MODULE_NAME);
        Structures.def_csetf((SubLObject)file_backed_cache_setup.$sym24$FBCR_SYSTEM_NAME, (SubLObject)file_backed_cache_setup.$sym25$_CSETF_FBCR_SYSTEM_NAME);
        Equality.identity((SubLObject)file_backed_cache_setup.$sym3$FILE_BACKED_CACHE_REGISTRATION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_backed_cache_setup.$dtp_file_backed_cache_registration$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_backed_cache_setup.$sym38$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_REGISTRATION_METHOD));
        access_macros.register_external_symbol((SubLObject)file_backed_cache_setup.$sym39$GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES);
        register_file_backed_cache((SubLObject)file_backed_cache_setup.$sym60$CREATE_RKF_IRRELEVANT_FORT_CACHE, (SubLObject)file_backed_cache_setup.$sym61$INITIALIZE_RKF_IRRELEVANT_FORT_CACHE, (SubLObject)file_backed_cache_setup.$sym62$RESET_RKF_IRRELEVANT_FORT_CACHE, (SubLObject)file_backed_cache_setup.$sym63$GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH, (SubLObject)file_backed_cache_setup.$str64$rkf_irrelevant_fort_cache, (SubLObject)file_backed_cache_setup.$str65$cycl, (SubLObject)file_backed_cache_setup.$str66$RKF_Irrelevant_Fort_Cache_Test_Su);
        register_file_backed_cache((SubLObject)file_backed_cache_setup.$sym67$CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS, (SubLObject)file_backed_cache_setup.$sym68$INITIALIZE_NL_GENERATION_CACHES, (SubLObject)file_backed_cache_setup.$sym69$RESET_NL_GENERATION_CACHES, (SubLObject)file_backed_cache_setup.$sym70$GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH, (SubLObject)file_backed_cache_setup.$str71$nl_generation_fort_cache, (SubLObject)file_backed_cache_setup.$str65$cycl, (SubLObject)file_backed_cache_setup.$str72$NL_Fort_Cache_Test_Suite);
        register_file_backed_cache((SubLObject)file_backed_cache_setup.NIL, (SubLObject)file_backed_cache_setup.$sym73$INITIALIZE_NL_TRIE_SUBWORD_CACHES, (SubLObject)file_backed_cache_setup.$sym74$RESET_NL_TRIE_SUBWORD_CACHES, (SubLObject)file_backed_cache_setup.$sym75$GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH, (SubLObject)file_backed_cache_setup.$str76$nl_trie_subword_index, (SubLObject)file_backed_cache_setup.$str65$cycl, (SubLObject)file_backed_cache_setup.$str77$NL_Trie_subword_index);
        return (SubLObject)file_backed_cache_setup.NIL;
    }
    
    public void declareFunctions() {
        declare_file_backed_cache_setup_file();
    }
    
    public void initializeVariables() {
        init_file_backed_cache_setup_file();
    }
    
    public void runTopLevelForms() {
        setup_file_backed_cache_setup_file();
    }
    
    static {
        me = (SubLFile)new file_backed_cache_setup();
        file_backed_cache_setup.$registered_file_backed_caches$ = null;
        file_backed_cache_setup.$file_backed_cache_default_temp_dir$ = null;
        file_backed_cache_setup.$fbc_registration_lock$ = null;
        file_backed_cache_setup.$dtp_file_backed_cache_registration$ = null;
        $sym0$_REGISTERED_FILE_BACKED_CACHES_ = SubLObjectFactory.makeSymbol("*REGISTERED-FILE-BACKED-CACHES*");
        $str1$tmp_ = SubLObjectFactory.makeString("tmp/");
        $str2$fbc_registration_lock = SubLObjectFactory.makeString("fbc-registration-lock");
        $sym3$FILE_BACKED_CACHE_REGISTRATION = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-REGISTRATION");
        $sym4$FILE_BACKED_CACHE_REGISTRATION_P = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-REGISTRATION-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RESET-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-FHT-NAME-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-SUITE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NAME"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENERATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("INITIALIZATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("RESET-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-FHT-NAME-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-SUITE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM-NAME"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBCR-GENERATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FBCR-INITIALIZATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FBCR-RESET-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FBCR-TEST-SUITE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FBCR-MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FBCR-SYSTEM-NAME"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-RESET-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FBCR-SYSTEM-NAME"));
        $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym10$FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-REGISTRATION-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-REGISTRATION-P"));
        $sym12$FBCR_GENERATION_FUNCTION = SubLObjectFactory.makeSymbol("FBCR-GENERATION-FUNCTION");
        $sym13$_CSETF_FBCR_GENERATION_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION");
        $sym14$FBCR_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("FBCR-INITIALIZATION-FUNCTION");
        $sym15$_CSETF_FBCR_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION");
        $sym16$FBCR_RESET_FUNCTION = SubLObjectFactory.makeSymbol("FBCR-RESET-FUNCTION");
        $sym17$_CSETF_FBCR_RESET_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-FBCR-RESET-FUNCTION");
        $sym18$FBCR_DEFAULT_FHT_NAME_FUNCTION = SubLObjectFactory.makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION");
        $sym19$_CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION");
        $sym20$FBCR_TEST_SUITE_NAME = SubLObjectFactory.makeSymbol("FBCR-TEST-SUITE-NAME");
        $sym21$_CSETF_FBCR_TEST_SUITE_NAME = SubLObjectFactory.makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME");
        $sym22$FBCR_MODULE_NAME = SubLObjectFactory.makeSymbol("FBCR-MODULE-NAME");
        $sym23$_CSETF_FBCR_MODULE_NAME = SubLObjectFactory.makeSymbol("_CSETF-FBCR-MODULE-NAME");
        $sym24$FBCR_SYSTEM_NAME = SubLObjectFactory.makeSymbol("FBCR-SYSTEM-NAME");
        $sym25$_CSETF_FBCR_SYSTEM_NAME = SubLObjectFactory.makeSymbol("_CSETF-FBCR-SYSTEM-NAME");
        $kw26$GENERATION_FUNCTION = SubLObjectFactory.makeKeyword("GENERATION-FUNCTION");
        $kw27$INITIALIZATION_FUNCTION = SubLObjectFactory.makeKeyword("INITIALIZATION-FUNCTION");
        $kw28$RESET_FUNCTION = SubLObjectFactory.makeKeyword("RESET-FUNCTION");
        $kw29$DEFAULT_FHT_NAME_FUNCTION = SubLObjectFactory.makeKeyword("DEFAULT-FHT-NAME-FUNCTION");
        $kw30$TEST_SUITE_NAME = SubLObjectFactory.makeKeyword("TEST-SUITE-NAME");
        $kw31$MODULE_NAME = SubLObjectFactory.makeKeyword("MODULE-NAME");
        $kw32$SYSTEM_NAME = SubLObjectFactory.makeKeyword("SYSTEM-NAME");
        $str33$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw34$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym35$MAKE_FILE_BACKED_CACHE_REGISTRATION = SubLObjectFactory.makeSymbol("MAKE-FILE-BACKED-CACHE-REGISTRATION");
        $kw36$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw37$END = SubLObjectFactory.makeKeyword("END");
        $sym38$VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_REGISTRATION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-REGISTRATION-METHOD");
        $sym39$GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES = SubLObjectFactory.makeSymbol("GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES");
        $str40$_tmp = SubLObjectFactory.makeString(".tmp");
        $str41$Starting_file_backed_cache_genera = SubLObjectFactory.makeString("Starting file backed cache generation(s)/test(s)/install(s).~%");
        $str42$Done_installing__A_cache_s__out_o = SubLObjectFactory.makeString("Done installing ~A cache(s) out of ~A attempt(s) with ~A error(s).~%");
        $str43$Starting_file_backed_cache_genera = SubLObjectFactory.makeString("Starting file backed cache generation(s).~%");
        $str44$Starting_file_backed_cache_test_s = SubLObjectFactory.makeString("Starting file backed cache test(s).~%");
        $str45$Starting_file_backed_cache_instal = SubLObjectFactory.makeString("Starting file backed cache install(s).~%");
        $str46$Provided_cache__A_is_not_a_file_b = SubLObjectFactory.makeString("Provided cache ~A is not a file-backed-cache-p");
        $sym47$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str48$Generating_cache_for_file___A__ = SubLObjectFactory.makeString("Generating cache for file: ~A~%");
        $str49$Moving__A_to__A__ = SubLObjectFactory.makeString("Moving ~A to ~A~%");
        $str50$Encountered_a_problem_either_gene = SubLObjectFactory.makeString("Encountered a problem either generating, testing or installing a file backed cache ~A.~%");
        $str51$__ = SubLObjectFactory.makeString("~%");
        $int52$509 = SubLObjectFactory.makeInteger(509);
        $str53$_A_is_not_a_valid_directory___ = SubLObjectFactory.makeString("~A is not a valid directory.~%");
        $str54$_ = SubLObjectFactory.makeString("/");
        $sym55$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)file_backed_cache_setup.NIL);
        $sym57$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str58$_A = SubLObjectFactory.makeString("~A");
        $str59$__Resetting_all_file_backed_cache = SubLObjectFactory.makeString("~&Resetting all file-backed caches.~%");
        $sym60$CREATE_RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeSymbol("CREATE-RKF-IRRELEVANT-FORT-CACHE");
        $sym61$INITIALIZE_RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeSymbol("INITIALIZE-RKF-IRRELEVANT-FORT-CACHE");
        $sym62$RESET_RKF_IRRELEVANT_FORT_CACHE = SubLObjectFactory.makeSymbol("RESET-RKF-IRRELEVANT-FORT-CACHE");
        $sym63$GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH = SubLObjectFactory.makeSymbol("GET-DEFAULT-RKF-IRRELEVANT-CACHE-FILE-PATH");
        $str64$rkf_irrelevant_fort_cache = SubLObjectFactory.makeString("rkf-irrelevant-fort-cache");
        $str65$cycl = SubLObjectFactory.makeString("cycl");
        $str66$RKF_Irrelevant_Fort_Cache_Test_Su = SubLObjectFactory.makeString("RKF Irrelevant Fort Cache Test Suite");
        $sym67$CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS = SubLObjectFactory.makeSymbol("CREATE-CACHED-NL-GENERATION-FOR-ALL-FORTS");
        $sym68$INITIALIZE_NL_GENERATION_CACHES = SubLObjectFactory.makeSymbol("INITIALIZE-NL-GENERATION-CACHES");
        $sym69$RESET_NL_GENERATION_CACHES = SubLObjectFactory.makeSymbol("RESET-NL-GENERATION-CACHES");
        $sym70$GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH = SubLObjectFactory.makeSymbol("GET-DEFAULT-NL-GENERATION-CACHE-FILE-PATH");
        $str71$nl_generation_fort_cache = SubLObjectFactory.makeString("nl-generation-fort-cache");
        $str72$NL_Fort_Cache_Test_Suite = SubLObjectFactory.makeString("NL Fort Cache Test Suite");
        $sym73$INITIALIZE_NL_TRIE_SUBWORD_CACHES = SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-SUBWORD-CACHES");
        $sym74$RESET_NL_TRIE_SUBWORD_CACHES = SubLObjectFactory.makeSymbol("RESET-NL-TRIE-SUBWORD-CACHES");
        $sym75$GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH = SubLObjectFactory.makeSymbol("GET-DEFAULT-NL-TRIE-SUBWORD-CACHE-FILE-PATH");
        $str76$nl_trie_subword_index = SubLObjectFactory.makeString("nl-trie-subword-index");
        $str77$NL_Trie_subword_index = SubLObjectFactory.makeString("NL Trie subword index");
    }
    
    public static final class $file_backed_cache_registration_native extends SubLStructNative
    {
        public SubLObject $generation_function;
        public SubLObject $initialization_function;
        public SubLObject $reset_function;
        public SubLObject $default_fht_name_function;
        public SubLObject $test_suite_name;
        public SubLObject $module_name;
        public SubLObject $system_name;
        private static final SubLStructDeclNative structDecl;
        
        public $file_backed_cache_registration_native() {
            this.$generation_function = (SubLObject)CommonSymbols.NIL;
            this.$initialization_function = (SubLObject)CommonSymbols.NIL;
            this.$reset_function = (SubLObject)CommonSymbols.NIL;
            this.$default_fht_name_function = (SubLObject)CommonSymbols.NIL;
            this.$test_suite_name = (SubLObject)CommonSymbols.NIL;
            this.$module_name = (SubLObject)CommonSymbols.NIL;
            this.$system_name = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_backed_cache_registration_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$generation_function;
        }
        
        public SubLObject getField3() {
            return this.$initialization_function;
        }
        
        public SubLObject getField4() {
            return this.$reset_function;
        }
        
        public SubLObject getField5() {
            return this.$default_fht_name_function;
        }
        
        public SubLObject getField6() {
            return this.$test_suite_name;
        }
        
        public SubLObject getField7() {
            return this.$module_name;
        }
        
        public SubLObject getField8() {
            return this.$system_name;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$generation_function = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$initialization_function = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$reset_function = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$default_fht_name_function = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$test_suite_name = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$module_name = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$system_name = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_backed_cache_registration_native.class, file_backed_cache_setup.$sym3$FILE_BACKED_CACHE_REGISTRATION, file_backed_cache_setup.$sym4$FILE_BACKED_CACHE_REGISTRATION_P, file_backed_cache_setup.$list5, file_backed_cache_setup.$list6, new String[] { "$generation_function", "$initialization_function", "$reset_function", "$default_fht_name_function", "$test_suite_name", "$module_name", "$system_name" }, file_backed_cache_setup.$list7, file_backed_cache_setup.$list8, file_backed_cache_setup.$sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $file_backed_cache_registration_p$UnaryFunction extends UnaryFunction
    {
        public $file_backed_cache_registration_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-BACKED-CACHE-REGISTRATION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return file_backed_cache_setup.file_backed_cache_registration_p(arg1);
        }
    }
}

/*

	Total time: 224 ms
	
*/