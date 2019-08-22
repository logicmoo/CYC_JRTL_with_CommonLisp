/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FILE-BACKED-CACHE-SETUP
 * source file: /cyc/top/cycl/file-backed-cache-setup.lisp
 * created:     2019/07/03 17:38:17
 */
public final class file_backed_cache_setup extends SubLTranslatedFile implements V12 {
    public static final class $file_backed_cache_registration_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$generation_function;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$initialization_function;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$reset_function;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$default_fht_name_function;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$test_suite_name;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$module_name;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$system_name;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$generation_function = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$initialization_function = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$reset_function = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$default_fht_name_function = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$test_suite_name = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$module_name = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.this.$system_name = value;
        }

        public SubLObject $generation_function = Lisp.NIL;

        public SubLObject $initialization_function = Lisp.NIL;

        public SubLObject $reset_function = Lisp.NIL;

        public SubLObject $default_fht_name_function = Lisp.NIL;

        public SubLObject $test_suite_name = Lisp.NIL;

        public SubLObject $module_name = Lisp.NIL;

        public SubLObject $system_name = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.class, FILE_BACKED_CACHE_REGISTRATION, FILE_BACKED_CACHE_REGISTRATION_P, $list_alt5, $list_alt6, new String[]{ "$generation_function", "$initialization_function", "$reset_function", "$default_fht_name_function", "$test_suite_name", "$module_name", "$system_name" }, $list_alt7, $list_alt8, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new file_backed_cache_setup();

 public static final String myName = "com.cyc.cycjava.cycl.file_backed_cache_setup";


    // defparameter
    @LispMethod(comment = "The directoy for tempory files.\ndefparameter")
    public static final SubLSymbol $file_backed_cache_default_temp_dir$ = makeSymbol("*FILE-BACKED-CACHE-DEFAULT-TEMP-DIR*");

    // deflexical
    @LispMethod(comment = "Lock used to ensure registrations are done atomically.\ndeflexical")
    private static final SubLSymbol $fbc_registration_lock$ = makeSymbol("*FBC-REGISTRATION-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_file_backed_cache_registration$ = makeSymbol("*DTP-FILE-BACKED-CACHE-REGISTRATION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $registered_file_backed_caches$ = makeSymbol("*REGISTERED-FILE-BACKED-CACHES*");

    static private final SubLString $str1$tmp_ = makeString("tmp/");

    static private final SubLString $str2$fbc_registration_lock = makeString("fbc-registration-lock");

    private static final SubLSymbol FILE_BACKED_CACHE_REGISTRATION = makeSymbol("FILE-BACKED-CACHE-REGISTRATION");

    private static final SubLSymbol FILE_BACKED_CACHE_REGISTRATION_P = makeSymbol("FILE-BACKED-CACHE-REGISTRATION-P");

    static private final SubLList $list5 = list(makeSymbol("GENERATION-FUNCTION"), makeSymbol("INITIALIZATION-FUNCTION"), makeSymbol("RESET-FUNCTION"), makeSymbol("DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("TEST-SUITE-NAME"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"));

    static private final SubLList $list6 = list(makeKeyword("GENERATION-FUNCTION"), makeKeyword("INITIALIZATION-FUNCTION"), makeKeyword("RESET-FUNCTION"), makeKeyword("DEFAULT-FHT-NAME-FUNCTION"), makeKeyword("TEST-SUITE-NAME"), makeKeyword("MODULE-NAME"), makeKeyword("SYSTEM-NAME"));

    static private final SubLList $list7 = list(makeSymbol("FBCR-GENERATION-FUNCTION"), makeSymbol("FBCR-INITIALIZATION-FUNCTION"), makeSymbol("FBCR-RESET-FUNCTION"), makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("FBCR-TEST-SUITE-NAME"), makeSymbol("FBCR-MODULE-NAME"), makeSymbol("FBCR-SYSTEM-NAME"));

    static private final SubLList $list8 = list(makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION"), makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION"), makeSymbol("_CSETF-FBCR-RESET-FUNCTION"), makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME"), makeSymbol("_CSETF-FBCR-MODULE-NAME"), makeSymbol("_CSETF-FBCR-SYSTEM-NAME"));

    private static final SubLSymbol FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-BACKED-CACHE-REGISTRATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-BACKED-CACHE-REGISTRATION-P"));

    private static final SubLSymbol FBCR_GENERATION_FUNCTION = makeSymbol("FBCR-GENERATION-FUNCTION");

    private static final SubLSymbol _CSETF_FBCR_GENERATION_FUNCTION = makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION");

    private static final SubLSymbol FBCR_INITIALIZATION_FUNCTION = makeSymbol("FBCR-INITIALIZATION-FUNCTION");

    private static final SubLSymbol _CSETF_FBCR_INITIALIZATION_FUNCTION = makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION");

    private static final SubLSymbol FBCR_RESET_FUNCTION = makeSymbol("FBCR-RESET-FUNCTION");

    private static final SubLSymbol _CSETF_FBCR_RESET_FUNCTION = makeSymbol("_CSETF-FBCR-RESET-FUNCTION");

    private static final SubLSymbol FBCR_DEFAULT_FHT_NAME_FUNCTION = makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION");

    private static final SubLSymbol _CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION = makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION");

    private static final SubLSymbol FBCR_TEST_SUITE_NAME = makeSymbol("FBCR-TEST-SUITE-NAME");

    private static final SubLSymbol _CSETF_FBCR_TEST_SUITE_NAME = makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME");

    private static final SubLSymbol FBCR_MODULE_NAME = makeSymbol("FBCR-MODULE-NAME");

    private static final SubLSymbol _CSETF_FBCR_MODULE_NAME = makeSymbol("_CSETF-FBCR-MODULE-NAME");

    private static final SubLSymbol FBCR_SYSTEM_NAME = makeSymbol("FBCR-SYSTEM-NAME");

    private static final SubLSymbol _CSETF_FBCR_SYSTEM_NAME = makeSymbol("_CSETF-FBCR-SYSTEM-NAME");

    private static final SubLSymbol $DEFAULT_FHT_NAME_FUNCTION = makeKeyword("DEFAULT-FHT-NAME-FUNCTION");

    private static final SubLSymbol $TEST_SUITE_NAME = makeKeyword("TEST-SUITE-NAME");

    private static final SubLString $str33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FILE_BACKED_CACHE_REGISTRATION = makeSymbol("MAKE-FILE-BACKED-CACHE-REGISTRATION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_REGISTRATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-REGISTRATION-METHOD");

    private static final SubLSymbol GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES = makeSymbol("GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES");

    private static final SubLString $str40$_tmp = makeString(".tmp");

    private static final SubLString $str41$Starting_file_backed_cache_genera = makeString("Starting file backed cache generation(s)/test(s)/install(s).~%");

    private static final SubLString $str42$Done_installing__A_cache_s__out_o = makeString("Done installing ~A cache(s) out of ~A attempt(s) with ~A error(s).~%");

    private static final SubLString $str43$Starting_file_backed_cache_genera = makeString("Starting file backed cache generation(s).~%");

    private static final SubLString $str44$Starting_file_backed_cache_test_s = makeString("Starting file backed cache test(s).~%");

    private static final SubLString $str45$Starting_file_backed_cache_instal = makeString("Starting file backed cache install(s).~%");

    private static final SubLString $str46$Provided_cache__A_is_not_a_file_b = makeString("Provided cache ~A is not a file-backed-cache-p");

    private static final SubLString $str48$Generating_cache_for_file___A__ = makeString("Generating cache for file: ~A~%");

    private static final SubLString $str49$Moving__A_to__A__ = makeString("Moving ~A to ~A~%");

    private static final SubLString $str50$Encountered_a_problem_either_gene = makeString("Encountered a problem either generating, testing or installing a file backed cache ~A.~%");

    private static final SubLString $str51$__ = makeString("~%");

    private static final SubLInteger $int$509 = makeInteger(509);

    private static final SubLString $str53$_A_is_not_a_valid_directory___ = makeString("~A is not a valid directory.~%");

    private static final SubLString $str54$_ = makeString("/");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list56 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str58$_A = makeString("~A");

    private static final SubLString $str59$__Resetting_all_file_backed_cache = makeString("~&Resetting all file-backed caches.~%");

    private static final SubLSymbol CREATE_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("CREATE-RKF-IRRELEVANT-FORT-CACHE");

    private static final SubLSymbol INITIALIZE_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("INITIALIZE-RKF-IRRELEVANT-FORT-CACHE");

    private static final SubLSymbol RESET_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("RESET-RKF-IRRELEVANT-FORT-CACHE");

    private static final SubLSymbol GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH = makeSymbol("GET-DEFAULT-RKF-IRRELEVANT-CACHE-FILE-PATH");

    private static final SubLString $str64$rkf_irrelevant_fort_cache = makeString("rkf-irrelevant-fort-cache");

    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLString $str66$RKF_Irrelevant_Fort_Cache_Test_Su = makeString("RKF Irrelevant Fort Cache Test Suite");

    private static final SubLSymbol CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS = makeSymbol("CREATE-CACHED-NL-GENERATION-FOR-ALL-FORTS");

    private static final SubLSymbol INITIALIZE_NL_GENERATION_CACHES = makeSymbol("INITIALIZE-NL-GENERATION-CACHES");

    private static final SubLSymbol RESET_NL_GENERATION_CACHES = makeSymbol("RESET-NL-GENERATION-CACHES");

    private static final SubLSymbol GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH = makeSymbol("GET-DEFAULT-NL-GENERATION-CACHE-FILE-PATH");

    private static final SubLString $str71$nl_generation_fort_cache = makeString("nl-generation-fort-cache");

    private static final SubLString $$$NL_Fort_Cache_Test_Suite = makeString("NL Fort Cache Test Suite");

    private static final SubLSymbol INITIALIZE_NL_TRIE_SUBWORD_CACHES = makeSymbol("INITIALIZE-NL-TRIE-SUBWORD-CACHES");

    private static final SubLSymbol RESET_NL_TRIE_SUBWORD_CACHES = makeSymbol("RESET-NL-TRIE-SUBWORD-CACHES");

    private static final SubLSymbol GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH = makeSymbol("GET-DEFAULT-NL-TRIE-SUBWORD-CACHE-FILE-PATH");

    private static final SubLString $str76$nl_trie_subword_index = makeString("nl-trie-subword-index");

    private static final SubLString $$$NL_Trie_subword_index = makeString("NL Trie subword index");

    public static final SubLObject file_backed_cache_registration_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_backed_cache_registration_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject file_backed_cache_registration_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject file_backed_cache_registration_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native.class ? T : NIL;
    }

    public static final SubLObject fbcr_generation_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField2();
    }

    public static SubLObject fbcr_generation_function(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fbcr_initialization_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField3();
    }

    public static SubLObject fbcr_initialization_function(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject fbcr_reset_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField4();
    }

    public static SubLObject fbcr_reset_function(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject fbcr_default_fht_name_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField5();
    }

    public static SubLObject fbcr_default_fht_name_function(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject fbcr_test_suite_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField6();
    }

    public static SubLObject fbcr_test_suite_name(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject fbcr_module_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField7();
    }

    public static SubLObject fbcr_module_name(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject fbcr_system_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.getField8();
    }

    public static SubLObject fbcr_system_name(final SubLObject v_object) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_fbcr_generation_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fbcr_generation_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fbcr_initialization_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fbcr_initialization_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_fbcr_reset_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fbcr_reset_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_fbcr_default_fht_name_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fbcr_default_fht_name_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_fbcr_test_suite_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_fbcr_test_suite_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_fbcr_module_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_fbcr_module_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_fbcr_system_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BACKED_CACHE_REGISTRATION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_fbcr_system_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_backed_cache_registration_p(v_object) : "! file_backed_cache_setup.file_backed_cache_registration_p(v_object) " + "file_backed_cache_setup.file_backed_cache_registration_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_file_backed_cache_registration_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($GENERATION_FUNCTION)) {
                        _csetf_fbcr_generation_function(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INITIALIZATION_FUNCTION)) {
                            _csetf_fbcr_initialization_function(v_new, current_value);
                        } else {
                            if (pcase_var.eql($RESET_FUNCTION)) {
                                _csetf_fbcr_reset_function(v_new, current_value);
                            } else {
                                if (pcase_var.eql($DEFAULT_FHT_NAME_FUNCTION)) {
                                    _csetf_fbcr_default_fht_name_function(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TEST_SUITE_NAME)) {
                                        _csetf_fbcr_test_suite_name(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($MODULE_NAME)) {
                                            _csetf_fbcr_module_name(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($SYSTEM_NAME)) {
                                                _csetf_fbcr_system_name(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt32$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_file_backed_cache_registration(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_backed_cache_setup.$file_backed_cache_registration_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($GENERATION_FUNCTION)) {
                _csetf_fbcr_generation_function(v_new, current_value);
            } else
                if (pcase_var.eql($INITIALIZATION_FUNCTION)) {
                    _csetf_fbcr_initialization_function(v_new, current_value);
                } else
                    if (pcase_var.eql($RESET_FUNCTION)) {
                        _csetf_fbcr_reset_function(v_new, current_value);
                    } else
                        if (pcase_var.eql($DEFAULT_FHT_NAME_FUNCTION)) {
                            _csetf_fbcr_default_fht_name_function(v_new, current_value);
                        } else
                            if (pcase_var.eql($TEST_SUITE_NAME)) {
                                _csetf_fbcr_test_suite_name(v_new, current_value);
                            } else
                                if (pcase_var.eql($MODULE_NAME)) {
                                    _csetf_fbcr_module_name(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SYSTEM_NAME)) {
                                        _csetf_fbcr_system_name(v_new, current_value);
                                    } else {
                                        Errors.error($str33$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_backed_cache_registration(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_BACKED_CACHE_REGISTRATION, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $GENERATION_FUNCTION, fbcr_generation_function(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIALIZATION_FUNCTION, fbcr_initialization_function(obj));
        funcall(visitor_fn, obj, $SLOT, $RESET_FUNCTION, fbcr_reset_function(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFAULT_FHT_NAME_FUNCTION, fbcr_default_fht_name_function(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST_SUITE_NAME, fbcr_test_suite_name(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_NAME, fbcr_module_name(obj));
        funcall(visitor_fn, obj, $SLOT, $SYSTEM_NAME, fbcr_system_name(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_BACKED_CACHE_REGISTRATION, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_backed_cache_registration_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_backed_cache_registration(obj, visitor_fn);
    }

    /**
     * if GENERATION-FUNCTION in NIL, the FBC will not be built along with the others that are built after
     * builds are complete.  This is useful for, e.g. fbc's that are part of the Cyc units.
     */
    @LispMethod(comment = "if GENERATION-FUNCTION in NIL, the FBC will not be built along with the others that are built after\r\nbuilds are complete.  This is useful for, e.g. fbc\'s that are part of the Cyc units.\nif GENERATION-FUNCTION in NIL, the FBC will not be built along with the others that are built after\nbuilds are complete.  This is useful for, e.g. fbc\'s that are part of the Cyc units.")
    public static final SubLObject register_file_backed_cache_alt(SubLObject generation_function, SubLObject initialization_function, SubLObject reset_function, SubLObject default_fht_name_function, SubLObject module_name, SubLObject system_name, SubLObject test_suite_name) {
        {
            SubLObject lock = $fbc_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject new_registered_file_backed_cached = NIL;
                    SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
                    SubLObject v_cache = NIL;
                    for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                        if (!default_fht_name_function.equal(fbcr_default_fht_name_function(v_cache))) {
                            new_registered_file_backed_cached = cons(v_cache, new_registered_file_backed_cached);
                        }
                    }
                    $registered_file_backed_caches$.setGlobalValue(new_registered_file_backed_cached);
                }
                {
                    SubLObject result = make_file_backed_cache_registration(UNPROVIDED);
                    _csetf_fbcr_generation_function(result, generation_function);
                    _csetf_fbcr_initialization_function(result, initialization_function);
                    _csetf_fbcr_reset_function(result, reset_function);
                    _csetf_fbcr_default_fht_name_function(result, default_fht_name_function);
                    _csetf_fbcr_test_suite_name(result, test_suite_name);
                    _csetf_fbcr_module_name(result, module_name);
                    _csetf_fbcr_system_name(result, system_name);
                    $registered_file_backed_caches$.setGlobalValue(cons(result, $registered_file_backed_caches$.getGlobalValue()));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * if GENERATION-FUNCTION in NIL, the FBC will not be built along with the others that are built after
     * builds are complete.  This is useful for, e.g. fbc's that are part of the Cyc units.
     */
    @LispMethod(comment = "if GENERATION-FUNCTION in NIL, the FBC will not be built along with the others that are built after\r\nbuilds are complete.  This is useful for, e.g. fbc\'s that are part of the Cyc units.\nif GENERATION-FUNCTION in NIL, the FBC will not be built along with the others that are built after\nbuilds are complete.  This is useful for, e.g. fbc\'s that are part of the Cyc units.")
    public static SubLObject register_file_backed_cache(final SubLObject generation_function, final SubLObject initialization_function, final SubLObject reset_function, final SubLObject default_fht_name_function, final SubLObject module_name, final SubLObject system_name, final SubLObject test_suite_name) {
        SubLObject release = NIL;
        try {
            release = seize_lock($fbc_registration_lock$.getGlobalValue());
            SubLObject new_registered_file_backed_cached = NIL;
            SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!default_fht_name_function.equal(fbcr_default_fht_name_function(v_cache))) {
                    new_registered_file_backed_cached = cons(v_cache, new_registered_file_backed_cached);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            $registered_file_backed_caches$.setGlobalValue(new_registered_file_backed_cached);
            final SubLObject result = make_file_backed_cache_registration(UNPROVIDED);
            _csetf_fbcr_generation_function(result, generation_function);
            _csetf_fbcr_initialization_function(result, initialization_function);
            _csetf_fbcr_reset_function(result, reset_function);
            _csetf_fbcr_default_fht_name_function(result, default_fht_name_function);
            _csetf_fbcr_test_suite_name(result, test_suite_name);
            _csetf_fbcr_module_name(result, module_name);
            _csetf_fbcr_system_name(result, system_name);
            $registered_file_backed_caches$.setGlobalValue(cons(result, $registered_file_backed_caches$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($fbc_registration_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject lookup_file_backed_cache_by_name_alt(SubLObject module_name) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = $registered_file_backed_caches$.getGlobalValue();
                    SubLObject v_cache = NIL;
                    for (v_cache = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_cache = csome_list_var.first()) {
                        if (NIL != Strings.stringE(module_name, fbcr_module_name(v_cache), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            result = v_cache;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject lookup_file_backed_cache_by_name(final SubLObject module_name) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = $registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = NIL;
            v_cache = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (NIL != Strings.stringE(module_name, fbcr_module_name(v_cache), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    result = v_cache;
                }
                csome_list_var = csome_list_var.rest();
                v_cache = csome_list_var.first();
            } 
        }
        return result;
    }

    /**
     *
     */
    public static final SubLObject generate_test_install_all_file_backed_caches_alt(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str_alt34$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str_alt35$Starting_file_backed_cache_genera);
        {
            SubLObject error_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, T, T, T, tmp_extension, tmp_dir))) {
                    error_count = add(ONE_INTEGER, error_count);
                }
            }
            format(T, $str_alt36$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        }
        return NIL;
    }

    public static SubLObject generate_test_install_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str40$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str41$Starting_file_backed_cache_genera);
        SubLObject error_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, T, T, T, tmp_extension, tmp_dir))) {
                error_count = add(ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        format(T, $str42$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject generate_all_file_backed_caches_alt(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str_alt34$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str_alt37$Starting_file_backed_cache_genera);
        {
            SubLObject error_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, T, NIL, NIL, tmp_extension, tmp_dir))) {
                    error_count = add(ONE_INTEGER, error_count);
                }
            }
            format(T, $str_alt36$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        }
        return NIL;
    }

    public static SubLObject generate_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str40$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str43$Starting_file_backed_cache_genera);
        SubLObject error_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, T, NIL, NIL, tmp_extension, tmp_dir))) {
                error_count = add(ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        format(T, $str42$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject test_all_file_backed_caches_alt(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str_alt34$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str_alt38$Starting_file_backed_cache_test_s);
        {
            SubLObject error_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, NIL, T, NIL, tmp_extension, tmp_dir))) {
                    error_count = add(ONE_INTEGER, error_count);
                }
            }
            format(T, $str_alt36$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        }
        return NIL;
    }

    public static SubLObject test_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str40$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str44$Starting_file_backed_cache_test_s);
        SubLObject error_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, NIL, T, NIL, tmp_extension, tmp_dir))) {
                error_count = add(ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        format(T, $str42$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject install_all_file_backed_caches_alt(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str_alt34$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str_alt39$Starting_file_backed_cache_instal);
        {
            SubLObject error_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, NIL, NIL, T, tmp_extension, tmp_dir))) {
                    error_count = add(ONE_INTEGER, error_count);
                }
            }
            format(T, $str_alt36$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        }
        return NIL;
    }

    public static SubLObject install_all_file_backed_caches(SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str40$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        format(T, $str45$Starting_file_backed_cache_instal);
        SubLObject error_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != fbcr_generation_function(v_cache)) && (NIL != generate_test_install_file_backed_cache(v_cache, NIL, NIL, T, tmp_extension, tmp_dir))) {
                error_count = add(ONE_INTEGER, error_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        format(T, $str42$Done_installing__A_cache_s__out_o, new SubLObject[]{ subtract(length($registered_file_backed_caches$.getGlobalValue()), error_count), length($registered_file_backed_caches$.getGlobalValue()), error_count });
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject generate_test_install_file_backed_cache_alt(SubLObject fbcr, SubLObject should_generate, SubLObject should_test, SubLObject should_install, SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str_alt34$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == file_backed_cache_registration_p(fbcr)) {
                Errors.error($str_alt40$Provided_cache__A_is_not_a_file_b, fbcr);
            }
            ensure_file_backed_cache_directory();
            {
                SubLObject msg = NIL;
                SubLObject had_error = NIL;
                SubLObject tmp_file = cconcatenate(funcall(fbcr_default_fht_name_function(fbcr)), tmp_extension);
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL != Filesys.probe_file(tmp_file)) {
                                    Filesys.delete_file(tmp_file);
                                }
                                if ((NIL == msg) && (NIL != should_generate)) {
                                    format(T, $str_alt42$Generating_cache_for_file___A__, tmp_file);
                                    funcall(fbcr_generation_function(fbcr), tmp_file, tmp_dir);
                                }
                                if ((NIL == msg) && (NIL != should_test)) {
                                    format(T, $str_alt43$Testing_cache_file___A__, tmp_file);
                                    {
                                        SubLObject _prev_bind_0_1 = nl_generation_fort_cache.$english_generation_fht_name$.currentBinding(thread);
                                        try {
                                            nl_generation_fort_cache.$english_generation_fht_name$.bind(tmp_file, thread);
                                            {
                                                SubLObject v_cache = nl_generation_fort_cache.get_english_generation_fort_cache();
                                                SubLObject base_file_name = nl_generation_fort_cache.$english_generation_base_file_name$.getGlobalValue();
                                                try {
                                                    nl_generation_fort_cache.set_temporary_english_generation_fort_cache(tmp_file);
                                                    {
                                                        SubLObject _prev_bind_0_2 = rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.currentBinding(thread);
                                                        try {
                                                            rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.bind(tmp_file, thread);
                                                            if ($FAIL == sunit_utilities.run_test_suite(fbcr_test_suite_name(fbcr), UNPROVIDED, UNPROVIDED)) {
                                                                msg = $str_alt45$SUnit_test_failed___;
                                                            }
                                                        } finally {
                                                            rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.rebind(_prev_bind_0_2, thread);
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            nl_generation_fort_cache.restore_english_generation_fort_cache(v_cache, base_file_name);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            nl_generation_fort_cache.$english_generation_fht_name$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                }
                                if ((NIL == msg) && (NIL != should_install)) {
                                    format(T, $str_alt46$Moving__A_to__A__, tmp_file, funcall(fbcr_default_fht_name_function(fbcr)));
                                    if (NIL != Filesys.probe_file(funcall(fbcr_default_fht_name_function(fbcr)))) {
                                        Filesys.delete_file(funcall(fbcr_default_fht_name_function(fbcr)));
                                    }
                                    Filesys.rename_file(tmp_file, funcall(fbcr_default_fht_name_function(fbcr)));
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != msg) {
                    had_error = T;
                    format(T, $str_alt47$Encountered_a_problem_either_gene, tmp_file);
                    Errors.warn(msg);
                    format(T, $str_alt48$__);
                }
                return had_error;
            }
        }
    }

    public static SubLObject generate_test_install_file_backed_cache(final SubLObject fbcr, final SubLObject should_generate, final SubLObject should_test, final SubLObject should_install, SubLObject tmp_extension, SubLObject tmp_dir) {
        if (tmp_extension == UNPROVIDED) {
            tmp_extension = $str40$_tmp;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $file_backed_cache_default_temp_dir$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == file_backed_cache_registration_p(fbcr)) {
            Errors.error($str46$Provided_cache__A_is_not_a_file_b, fbcr);
        }
        ensure_file_backed_cache_directory();
        SubLObject msg = NIL;
        SubLObject had_error = NIL;
        final SubLObject tmp_file = cconcatenate(funcall(fbcr_default_fht_name_function(fbcr)), tmp_extension);
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != Filesys.probe_file(tmp_file)) {
                        Filesys.delete_file(tmp_file);
                    }
                    if ((NIL == msg) && (NIL != should_generate)) {
                        format(T, $str48$Generating_cache_for_file___A__, tmp_file);
                        funcall(fbcr_generation_function(fbcr), tmp_file, tmp_dir);
                    }
                    if ((NIL == msg) && (NIL != should_install)) {
                        format(T, $str49$Moving__A_to__A__, tmp_file, funcall(fbcr_default_fht_name_function(fbcr)));
                        if (NIL != Filesys.probe_file(funcall(fbcr_default_fht_name_function(fbcr)))) {
                            Filesys.delete_file(funcall(fbcr_default_fht_name_function(fbcr)));
                        }
                        Filesys.rename_file(tmp_file, funcall(fbcr_default_fht_name_function(fbcr)));
                    }
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
            had_error = T;
            format(T, $str50$Encountered_a_problem_either_gene, tmp_file);
            Errors.warn(msg);
            format(T, $str51$__);
        }
        return had_error;
    }

    /**
     *
     */
    public static final SubLObject ensure_file_backed_cache_directory_alt() {
        if (NIL == Filesys.directory_p(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue())) {
            Filesys.make_directory(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), NIL, $int$509);
            if (NIL == Filesys.directory_p(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue())) {
                Errors.error($str_alt50$_A_is_not_a_valid_directory___, file_backed_cache.$file_backed_cache_base_path$.getGlobalValue());
            }
        }
        {
            SubLObject dir_name = cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[]{ $str_alt51$_, format(NIL, $str_alt52$_4__0d, kb_loaded()), $str_alt51$_ });
            if (NIL == Filesys.directory_p(dir_name)) {
                Filesys.make_directory(dir_name, NIL, $int$509);
                if (NIL == Filesys.directory_p(dir_name)) {
                    Errors.error($str_alt50$_A_is_not_a_valid_directory___, dir_name);
                }
            }
        }
        return NIL;
    }

    public static SubLObject ensure_file_backed_cache_directory() {
        if (NIL == Filesys.directory_p(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue())) {
            Filesys.make_directory(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), NIL, $int$509);
            if (NIL == Filesys.directory_p(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue())) {
                Errors.error($str53$_A_is_not_a_valid_directory___, file_backed_cache.$file_backed_cache_base_path$.getGlobalValue());
            }
        }
        final SubLObject dir_name = cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[]{ $str54$_, operation_communication.kb_loaded_string(), $str54$_ });
        if (NIL == Filesys.directory_p(dir_name)) {
            Filesys.make_directory(dir_name, NIL, $int$509);
            if (NIL == Filesys.directory_p(dir_name)) {
                Errors.error($str53$_A_is_not_a_valid_directory___, dir_name);
            }
        }
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject initialize_all_file_backed_caches_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == kb_loaded()) {
                return NIL;
            }
            if (NIL != $registered_file_backed_caches$.getGlobalValue()) {
                format(T, $str_alt53$__Initializing_file_backed_caches);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            {
                SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    {
                        SubLObject message_var = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        funcall(fbcr_initialization_function(v_cache));
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (message_var.isString()) {
                            Errors.warn($str_alt54$_A, message_var);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_all_file_backed_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_loaded()) {
            return NIL;
        }
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list56);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            funcall(fbcr_initialization_function(v_cache));
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str58$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject reset_all_file_backed_caches_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == kb_loaded()) {
                return NIL;
            }
            if (NIL != $registered_file_backed_caches$.getGlobalValue()) {
                format(T, $str_alt55$__Resetting_all_file_backed_cache);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            {
                SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    {
                        SubLObject message_var = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        funcall(fbcr_reset_function(v_cache));
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (message_var.isString()) {
                            Errors.warn($str_alt54$_A, message_var);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_all_file_backed_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_loaded()) {
            return NIL;
        }
        if (NIL != $registered_file_backed_caches$.getGlobalValue()) {
            format(T, $str59$__Resetting_all_file_backed_cache);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list56);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            funcall(fbcr_reset_function(v_cache));
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str58$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_file_backed_cache_setup_file() {
        declareFunction("file_backed_cache_registration_print_function_trampoline", "FILE-BACKED-CACHE-REGISTRATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("file_backed_cache_registration_p", "FILE-BACKED-CACHE-REGISTRATION-P", 1, 0, false);
        new file_backed_cache_setup.$file_backed_cache_registration_p$UnaryFunction();
        declareFunction("fbcr_generation_function", "FBCR-GENERATION-FUNCTION", 1, 0, false);
        declareFunction("fbcr_initialization_function", "FBCR-INITIALIZATION-FUNCTION", 1, 0, false);
        declareFunction("fbcr_reset_function", "FBCR-RESET-FUNCTION", 1, 0, false);
        declareFunction("fbcr_default_fht_name_function", "FBCR-DEFAULT-FHT-NAME-FUNCTION", 1, 0, false);
        declareFunction("fbcr_test_suite_name", "FBCR-TEST-SUITE-NAME", 1, 0, false);
        declareFunction("fbcr_module_name", "FBCR-MODULE-NAME", 1, 0, false);
        declareFunction("fbcr_system_name", "FBCR-SYSTEM-NAME", 1, 0, false);
        declareFunction("_csetf_fbcr_generation_function", "_CSETF-FBCR-GENERATION-FUNCTION", 2, 0, false);
        declareFunction("_csetf_fbcr_initialization_function", "_CSETF-FBCR-INITIALIZATION-FUNCTION", 2, 0, false);
        declareFunction("_csetf_fbcr_reset_function", "_CSETF-FBCR-RESET-FUNCTION", 2, 0, false);
        declareFunction("_csetf_fbcr_default_fht_name_function", "_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION", 2, 0, false);
        declareFunction("_csetf_fbcr_test_suite_name", "_CSETF-FBCR-TEST-SUITE-NAME", 2, 0, false);
        declareFunction("_csetf_fbcr_module_name", "_CSETF-FBCR-MODULE-NAME", 2, 0, false);
        declareFunction("_csetf_fbcr_system_name", "_CSETF-FBCR-SYSTEM-NAME", 2, 0, false);
        declareFunction("make_file_backed_cache_registration", "MAKE-FILE-BACKED-CACHE-REGISTRATION", 0, 1, false);
        declareFunction("visit_defstruct_file_backed_cache_registration", "VISIT-DEFSTRUCT-FILE-BACKED-CACHE-REGISTRATION", 2, 0, false);
        declareFunction("visit_defstruct_object_file_backed_cache_registration_method", "VISIT-DEFSTRUCT-OBJECT-FILE-BACKED-CACHE-REGISTRATION-METHOD", 2, 0, false);
        declareFunction("register_file_backed_cache", "REGISTER-FILE-BACKED-CACHE", 7, 0, false);
        declareFunction("lookup_file_backed_cache_by_name", "LOOKUP-FILE-BACKED-CACHE-BY-NAME", 1, 0, false);
        declareFunction("generate_test_install_all_file_backed_caches", "GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
        declareFunction("generate_all_file_backed_caches", "GENERATE-ALL-FILE-BACKED-CACHES", 0, 2, false);
        declareFunction("test_all_file_backed_caches", "TEST-ALL-FILE-BACKED-CACHES", 0, 2, false);
        declareFunction("install_all_file_backed_caches", "INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
        declareFunction("generate_test_install_file_backed_cache", "GENERATE-TEST-INSTALL-FILE-BACKED-CACHE", 4, 2, false);
        declareFunction("ensure_file_backed_cache_directory", "ENSURE-FILE-BACKED-CACHE-DIRECTORY", 0, 0, false);
        declareFunction("initialize_all_file_backed_caches", "INITIALIZE-ALL-FILE-BACKED-CACHES", 0, 0, false);
        declareFunction("reset_all_file_backed_caches", "RESET-ALL-FILE-BACKED-CACHES", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt1$tmp_ = makeString("tmp/");

    static private final SubLString $str_alt2$fbc_registration_lock = makeString("fbc-registration-lock");

    static private final SubLList $list_alt5 = list(makeSymbol("GENERATION-FUNCTION"), makeSymbol("INITIALIZATION-FUNCTION"), makeSymbol("RESET-FUNCTION"), makeSymbol("DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("TEST-SUITE-NAME"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"));

    static private final SubLList $list_alt6 = list(makeKeyword("GENERATION-FUNCTION"), makeKeyword("INITIALIZATION-FUNCTION"), makeKeyword("RESET-FUNCTION"), makeKeyword("DEFAULT-FHT-NAME-FUNCTION"), makeKeyword("TEST-SUITE-NAME"), makeKeyword("MODULE-NAME"), makeKeyword("SYSTEM-NAME"));

    static private final SubLList $list_alt7 = list(makeSymbol("FBCR-GENERATION-FUNCTION"), makeSymbol("FBCR-INITIALIZATION-FUNCTION"), makeSymbol("FBCR-RESET-FUNCTION"), makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("FBCR-TEST-SUITE-NAME"), makeSymbol("FBCR-MODULE-NAME"), makeSymbol("FBCR-SYSTEM-NAME"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION"), makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION"), makeSymbol("_CSETF-FBCR-RESET-FUNCTION"), makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME"), makeSymbol("_CSETF-FBCR-MODULE-NAME"), makeSymbol("_CSETF-FBCR-SYSTEM-NAME"));

    public static final SubLObject init_file_backed_cache_setup_file_alt() {
        deflexical("*REGISTERED-FILE-BACKED-CACHES*", NIL != boundp($registered_file_backed_caches$) ? ((SubLObject) ($registered_file_backed_caches$.getGlobalValue())) : NIL);
        defparameter("*FILE-BACKED-CACHE-DEFAULT-TEMP-DIR*", $str_alt1$tmp_);
        deflexical("*FBC-REGISTRATION-LOCK*", make_lock($str_alt2$fbc_registration_lock));
        defconstant("*DTP-FILE-BACKED-CACHE-REGISTRATION*", FILE_BACKED_CACHE_REGISTRATION);
        return NIL;
    }

    public static SubLObject init_file_backed_cache_setup_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*REGISTERED-FILE-BACKED-CACHES*", SubLTrampolineFile.maybeDefault($registered_file_backed_caches$, $registered_file_backed_caches$, NIL));
            defparameter("*FILE-BACKED-CACHE-DEFAULT-TEMP-DIR*", $str1$tmp_);
            deflexical("*FBC-REGISTRATION-LOCK*", make_lock($str2$fbc_registration_lock));
            defconstant("*DTP-FILE-BACKED-CACHE-REGISTRATION*", FILE_BACKED_CACHE_REGISTRATION);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*REGISTERED-FILE-BACKED-CACHES*", NIL != boundp($registered_file_backed_caches$) ? ((SubLObject) ($registered_file_backed_caches$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_file_backed_cache_setup_file_Previous() {
        deflexical("*REGISTERED-FILE-BACKED-CACHES*", SubLTrampolineFile.maybeDefault($registered_file_backed_caches$, $registered_file_backed_caches$, NIL));
        defparameter("*FILE-BACKED-CACHE-DEFAULT-TEMP-DIR*", $str1$tmp_);
        deflexical("*FBC-REGISTRATION-LOCK*", make_lock($str2$fbc_registration_lock));
        defconstant("*DTP-FILE-BACKED-CACHE-REGISTRATION*", FILE_BACKED_CACHE_REGISTRATION);
        return NIL;
    }

    public static final SubLObject setup_file_backed_cache_setup_file_alt() {
        declare_defglobal($registered_file_backed_caches$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache_registration$.getGlobalValue(), symbol_function(FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FBCR_GENERATION_FUNCTION, _CSETF_FBCR_GENERATION_FUNCTION);
        def_csetf(FBCR_INITIALIZATION_FUNCTION, _CSETF_FBCR_INITIALIZATION_FUNCTION);
        def_csetf(FBCR_RESET_FUNCTION, _CSETF_FBCR_RESET_FUNCTION);
        def_csetf(FBCR_DEFAULT_FHT_NAME_FUNCTION, _CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION);
        def_csetf(FBCR_TEST_SUITE_NAME, _CSETF_FBCR_TEST_SUITE_NAME);
        def_csetf(FBCR_MODULE_NAME, _CSETF_FBCR_MODULE_NAME);
        def_csetf(FBCR_SYSTEM_NAME, _CSETF_FBCR_SYSTEM_NAME);
        identity(FILE_BACKED_CACHE_REGISTRATION);
        register_external_symbol(GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES);
        register_file_backed_cache(CREATE_RKF_IRRELEVANT_FORT_CACHE, INITIALIZE_RKF_IRRELEVANT_FORT_CACHE, RESET_RKF_IRRELEVANT_FORT_CACHE, GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH, $str_alt60$rkf_irrelevant_fort_cache, $$$cycl, $str_alt62$RKF_Irrelevant_Fort_Cache_Test_Su);
        register_file_backed_cache(CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS, INITIALIZE_NL_GENERATION_CACHES, RESET_NL_GENERATION_CACHES, GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH, $str_alt67$nl_generation_fort_cache, $$$cycl, $$$NL_Fort_Cache_Test_Suite);
        register_file_backed_cache(NIL, INITIALIZE_NL_TRIE_SUBWORD_CACHES, RESET_NL_TRIE_SUBWORD_CACHES, GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH, $str_alt72$nl_trie_subword_index, $$$cycl, $$$NL_Trie_subword_index);
        return NIL;
    }

    public static SubLObject setup_file_backed_cache_setup_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($registered_file_backed_caches$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache_registration$.getGlobalValue(), symbol_function(FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list11);
            def_csetf(FBCR_GENERATION_FUNCTION, _CSETF_FBCR_GENERATION_FUNCTION);
            def_csetf(FBCR_INITIALIZATION_FUNCTION, _CSETF_FBCR_INITIALIZATION_FUNCTION);
            def_csetf(FBCR_RESET_FUNCTION, _CSETF_FBCR_RESET_FUNCTION);
            def_csetf(FBCR_DEFAULT_FHT_NAME_FUNCTION, _CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION);
            def_csetf(FBCR_TEST_SUITE_NAME, _CSETF_FBCR_TEST_SUITE_NAME);
            def_csetf(FBCR_MODULE_NAME, _CSETF_FBCR_MODULE_NAME);
            def_csetf(FBCR_SYSTEM_NAME, _CSETF_FBCR_SYSTEM_NAME);
            identity(FILE_BACKED_CACHE_REGISTRATION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_backed_cache_registration$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_REGISTRATION_METHOD));
            register_external_symbol(GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES);
            register_file_backed_cache(CREATE_RKF_IRRELEVANT_FORT_CACHE, INITIALIZE_RKF_IRRELEVANT_FORT_CACHE, RESET_RKF_IRRELEVANT_FORT_CACHE, GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH, $str64$rkf_irrelevant_fort_cache, $$$cycl, $str66$RKF_Irrelevant_Fort_Cache_Test_Su);
            register_file_backed_cache(CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS, INITIALIZE_NL_GENERATION_CACHES, RESET_NL_GENERATION_CACHES, GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH, $str71$nl_generation_fort_cache, $$$cycl, $$$NL_Fort_Cache_Test_Suite);
            register_file_backed_cache(NIL, INITIALIZE_NL_TRIE_SUBWORD_CACHES, RESET_NL_TRIE_SUBWORD_CACHES, GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH, $str76$nl_trie_subword_index, $$$cycl, $$$NL_Trie_subword_index);
        }
        if (SubLFiles.USE_V2) {
            register_file_backed_cache(CREATE_RKF_IRRELEVANT_FORT_CACHE, INITIALIZE_RKF_IRRELEVANT_FORT_CACHE, RESET_RKF_IRRELEVANT_FORT_CACHE, GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH, $str_alt60$rkf_irrelevant_fort_cache, $$$cycl, $str_alt62$RKF_Irrelevant_Fort_Cache_Test_Su);
            register_file_backed_cache(CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS, INITIALIZE_NL_GENERATION_CACHES, RESET_NL_GENERATION_CACHES, GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH, $str_alt67$nl_generation_fort_cache, $$$cycl, $$$NL_Fort_Cache_Test_Suite);
            register_file_backed_cache(NIL, INITIALIZE_NL_TRIE_SUBWORD_CACHES, RESET_NL_TRIE_SUBWORD_CACHES, GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH, $str_alt72$nl_trie_subword_index, $$$cycl, $$$NL_Trie_subword_index);
        }
        return NIL;
    }

    public static SubLObject setup_file_backed_cache_setup_file_Previous() {
        declare_defglobal($registered_file_backed_caches$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache_registration$.getGlobalValue(), symbol_function(FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(FBCR_GENERATION_FUNCTION, _CSETF_FBCR_GENERATION_FUNCTION);
        def_csetf(FBCR_INITIALIZATION_FUNCTION, _CSETF_FBCR_INITIALIZATION_FUNCTION);
        def_csetf(FBCR_RESET_FUNCTION, _CSETF_FBCR_RESET_FUNCTION);
        def_csetf(FBCR_DEFAULT_FHT_NAME_FUNCTION, _CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION);
        def_csetf(FBCR_TEST_SUITE_NAME, _CSETF_FBCR_TEST_SUITE_NAME);
        def_csetf(FBCR_MODULE_NAME, _CSETF_FBCR_MODULE_NAME);
        def_csetf(FBCR_SYSTEM_NAME, _CSETF_FBCR_SYSTEM_NAME);
        identity(FILE_BACKED_CACHE_REGISTRATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_backed_cache_registration$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_BACKED_CACHE_REGISTRATION_METHOD));
        register_external_symbol(GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES);
        register_file_backed_cache(CREATE_RKF_IRRELEVANT_FORT_CACHE, INITIALIZE_RKF_IRRELEVANT_FORT_CACHE, RESET_RKF_IRRELEVANT_FORT_CACHE, GET_DEFAULT_RKF_IRRELEVANT_CACHE_FILE_PATH, $str64$rkf_irrelevant_fort_cache, $$$cycl, $str66$RKF_Irrelevant_Fort_Cache_Test_Su);
        register_file_backed_cache(CREATE_CACHED_NL_GENERATION_FOR_ALL_FORTS, INITIALIZE_NL_GENERATION_CACHES, RESET_NL_GENERATION_CACHES, GET_DEFAULT_NL_GENERATION_CACHE_FILE_PATH, $str71$nl_generation_fort_cache, $$$cycl, $$$NL_Fort_Cache_Test_Suite);
        register_file_backed_cache(NIL, INITIALIZE_NL_TRIE_SUBWORD_CACHES, RESET_NL_TRIE_SUBWORD_CACHES, GET_DEFAULT_NL_TRIE_SUBWORD_CACHE_FILE_PATH, $str76$nl_trie_subword_index, $$$cycl, $$$NL_Trie_subword_index);
        return NIL;
    }

    static private final SubLString $str_alt32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt34$_tmp = makeString(".tmp");

    static private final SubLString $str_alt35$Starting_file_backed_cache_genera = makeString("Starting file backed cache generation(s)/test(s)/install(s).~%");

    static private final SubLString $str_alt36$Done_installing__A_cache_s__out_o = makeString("Done installing ~A cache(s) out of ~A attempt(s) with ~A error(s).~%");

    @Override
    public void declareFunctions() {
        declare_file_backed_cache_setup_file();
    }

    static private final SubLString $str_alt37$Starting_file_backed_cache_genera = makeString("Starting file backed cache generation(s).~%");

    @Override
    public void initializeVariables() {
        init_file_backed_cache_setup_file();
    }

    static private final SubLString $str_alt38$Starting_file_backed_cache_test_s = makeString("Starting file backed cache test(s).~%");

    @Override
    public void runTopLevelForms() {
        setup_file_backed_cache_setup_file();
    }

    static private final SubLString $str_alt39$Starting_file_backed_cache_instal = makeString("Starting file backed cache install(s).~%");

    

    static private final SubLString $str_alt40$Provided_cache__A_is_not_a_file_b = makeString("Provided cache ~A is not a file-backed-cache-p");

    static private final SubLString $str_alt42$Generating_cache_for_file___A__ = makeString("Generating cache for file: ~A~%");

    static private final SubLString $str_alt43$Testing_cache_file___A__ = makeString("Testing cache file: ~A~%");

    static private final SubLString $str_alt45$SUnit_test_failed___ = makeString("SUnit test failed.~%");

    static private final SubLString $str_alt46$Moving__A_to__A__ = makeString("Moving ~A to ~A~%");

    static private final SubLString $str_alt47$Encountered_a_problem_either_gene = makeString("Encountered a problem either generating, testing or installing a file backed cache ~A.~%");

    static private final SubLString $str_alt48$__ = makeString("~%");

    static private final SubLString $str_alt50$_A_is_not_a_valid_directory___ = makeString("~A is not a valid directory.~%");

    static private final SubLString $str_alt51$_ = makeString("/");

    static private final SubLString $str_alt52$_4__0d = makeString("~4,'0d");

    static private final SubLString $str_alt53$__Initializing_file_backed_caches = makeString("~&Initializing file-backed caches.~%");

    static private final SubLString $str_alt54$_A = makeString("~A");

    static private final SubLString $str_alt55$__Resetting_all_file_backed_cache = makeString("~&Resetting all file-backed caches.~%");

    static private final SubLString $str_alt60$rkf_irrelevant_fort_cache = makeString("rkf-irrelevant-fort-cache");

    static private final SubLString $str_alt62$RKF_Irrelevant_Fort_Cache_Test_Su = makeString("RKF Irrelevant Fort Cache Test Suite");

    static private final SubLString $str_alt67$nl_generation_fort_cache = makeString("nl-generation-fort-cache");

    public static final class $file_backed_cache_registration_p$UnaryFunction extends UnaryFunction {
        public $file_backed_cache_registration_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-BACKED-CACHE-REGISTRATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_backed_cache_registration_p(arg1);
        }
    }

    static private final SubLString $str_alt72$nl_trie_subword_index = makeString("nl-trie-subword-index");
}

/**
 * Total time: 224 ms
 */
