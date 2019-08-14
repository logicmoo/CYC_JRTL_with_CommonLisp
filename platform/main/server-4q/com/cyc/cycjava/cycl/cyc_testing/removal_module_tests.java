/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.bindings.lists_of_binding_lists_equalP;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.inference_testing.kb_matches_expectationsP;
import static com.cyc.cycjava.cycl.hash_table_utilities.hash_table_keys;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.destroy_inference_and_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_predicate;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_module_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules_specific;
import static com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_conditional_sentence_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_utilities.inference_some_proof_uses_removal_moduleP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.list_utilities.tree_find_if;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULE-TESTS
 * source file: /cyc/top/cycl/cyc-testing/removal-module-tests.lisp
 * created:     2019/07/03 17:37:42
 */
public final class removal_module_tests extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $removal_module_test_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$hl_module;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$id;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$sentence;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$mt;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$properties;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$comment;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$kb;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$owner;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$bug_number;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$creation_date;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$creator;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$workingP;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$hl_module = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$id = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$sentence = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$mt = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$properties = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$comment = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$kb = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$owner = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$bug_number = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$creation_date = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$creator = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.this.$workingP = value;
        }

        public SubLObject $hl_module = Lisp.NIL;

        public SubLObject $id = Lisp.NIL;

        public SubLObject $sentence = Lisp.NIL;

        public SubLObject $mt = Lisp.NIL;

        public SubLObject $properties = Lisp.NIL;

        public SubLObject $comment = Lisp.NIL;

        public SubLObject $kb = Lisp.NIL;

        public SubLObject $owner = Lisp.NIL;

        public SubLObject $bug_number = Lisp.NIL;

        public SubLObject $creation_date = Lisp.NIL;

        public SubLObject $creator = Lisp.NIL;

        public SubLObject $workingP = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.class, REMOVAL_MODULE_TEST, REMOVAL_MODULE_TEST_P, $list_alt2, $list_alt3, new String[]{ "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new removal_module_tests();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.removal_module_tests";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_removal_module_test$ = makeSymbol("*DTP-REMOVAL-MODULE-TEST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol REMOVAL_MODULE_TEST = makeSymbol("REMOVAL-MODULE-TEST");

    private static final SubLSymbol REMOVAL_MODULE_TEST_P = makeSymbol("REMOVAL-MODULE-TEST-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("RMT-HL-MODULE"), makeSymbol("RMT-ID"), makeSymbol("RMT-SENTENCE"), makeSymbol("RMT-MT"), makeSymbol("RMT-PROPERTIES"), makeSymbol("RMT-COMMENT"), makeSymbol("RMT-KB"), makeSymbol("RMT-OWNER"), makeSymbol("RMT-BUG-NUMBER"), makeSymbol("RMT-CREATION-DATE"), makeSymbol("RMT-CREATOR"), makeSymbol("RMT-WORKING?") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-RMT-HL-MODULE"), makeSymbol("_CSETF-RMT-ID"), makeSymbol("_CSETF-RMT-SENTENCE"), makeSymbol("_CSETF-RMT-MT"), makeSymbol("_CSETF-RMT-PROPERTIES"), makeSymbol("_CSETF-RMT-COMMENT"), makeSymbol("_CSETF-RMT-KB"), makeSymbol("_CSETF-RMT-OWNER"), makeSymbol("_CSETF-RMT-BUG-NUMBER"), makeSymbol("_CSETF-RMT-CREATION-DATE"), makeSymbol("_CSETF-RMT-CREATOR"), makeSymbol("_CSETF-RMT-WORKING?") });

    private static final SubLSymbol REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-MODULE-TEST-P"));

    private static final SubLSymbol RMT_HL_MODULE = makeSymbol("RMT-HL-MODULE");

    private static final SubLSymbol _CSETF_RMT_HL_MODULE = makeSymbol("_CSETF-RMT-HL-MODULE");

    private static final SubLSymbol RMT_ID = makeSymbol("RMT-ID");

    private static final SubLSymbol _CSETF_RMT_ID = makeSymbol("_CSETF-RMT-ID");

    private static final SubLSymbol RMT_SENTENCE = makeSymbol("RMT-SENTENCE");

    private static final SubLSymbol _CSETF_RMT_SENTENCE = makeSymbol("_CSETF-RMT-SENTENCE");

    private static final SubLSymbol RMT_MT = makeSymbol("RMT-MT");

    private static final SubLSymbol _CSETF_RMT_MT = makeSymbol("_CSETF-RMT-MT");

    private static final SubLSymbol RMT_PROPERTIES = makeSymbol("RMT-PROPERTIES");

    private static final SubLSymbol _CSETF_RMT_PROPERTIES = makeSymbol("_CSETF-RMT-PROPERTIES");

    private static final SubLSymbol RMT_COMMENT = makeSymbol("RMT-COMMENT");

    private static final SubLSymbol _CSETF_RMT_COMMENT = makeSymbol("_CSETF-RMT-COMMENT");

    private static final SubLSymbol RMT_KB = makeSymbol("RMT-KB");

    private static final SubLSymbol _CSETF_RMT_KB = makeSymbol("_CSETF-RMT-KB");

    private static final SubLSymbol RMT_OWNER = makeSymbol("RMT-OWNER");

    private static final SubLSymbol _CSETF_RMT_OWNER = makeSymbol("_CSETF-RMT-OWNER");

    private static final SubLSymbol RMT_BUG_NUMBER = makeSymbol("RMT-BUG-NUMBER");

    private static final SubLSymbol _CSETF_RMT_BUG_NUMBER = makeSymbol("_CSETF-RMT-BUG-NUMBER");

    private static final SubLSymbol RMT_CREATION_DATE = makeSymbol("RMT-CREATION-DATE");

    private static final SubLSymbol _CSETF_RMT_CREATION_DATE = makeSymbol("_CSETF-RMT-CREATION-DATE");

    private static final SubLSymbol RMT_CREATOR = makeSymbol("RMT-CREATOR");

    private static final SubLSymbol _CSETF_RMT_CREATOR = makeSymbol("_CSETF-RMT-CREATOR");

    private static final SubLSymbol $sym31$RMT_WORKING_ = makeSymbol("RMT-WORKING?");

    private static final SubLSymbol $sym32$_CSETF_RMT_WORKING_ = makeSymbol("_CSETF-RMT-WORKING?");

    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_REMOVAL_MODULE_TEST = makeSymbol("MAKE-REMOVAL-MODULE-TEST");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD");

    private static final SubLSymbol $removal_module_tests$ = makeSymbol("*REMOVAL-MODULE-TESTS*");

    private static final SubLSymbol $sym53$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol $sym55$_ = makeSymbol("<");

    private static final SubLSymbol $sym56$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLList $list57 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell("BaseKB")), makeSymbol("PROPERTIES"), list(makeSymbol("KB"), $TINY), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) });

    private static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol DEFINE_REMOVAL_MODULE_TEST_INT = makeSymbol("DEFINE-REMOVAL-MODULE-TEST-INT");

    private static final SubLSymbol DEFINE_REMOVAL_MODULE_TEST = makeSymbol("DEFINE-REMOVAL-MODULE-TEST");

    private static final SubLString $str66$Define_a_removal_module_test_numb = makeString("Define a removal module test number ID for the module named NAME.\n   The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\n  PROPERTIES, if not nil, specifies additional query properties to pass in.");

    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");

    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");

    private static final SubLSymbol RUN_REMOVAL_MODULE_TESTS_FOR_PRED = makeSymbol("RUN-REMOVAL-MODULE-TESTS-FOR-PRED");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $FAILURE_HALT_REASON = makeKeyword("FAILURE-HALT-REASON");

    private static final SubLSymbol $FAILURE_REMOVAL_MODULE = makeKeyword("FAILURE-REMOVAL-MODULE");

    private static final SubLSymbol $kw89$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $kw91$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLSymbol $kw92$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLString $str94$___RMT__S__S____ = makeString("~&:RMT ~S ~S -> ");

    private static final SubLString $str96$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $str97$_S____3f___ = makeString("~S (~,3f)~%");

    public static final SubLObject removal_module_test_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject removal_module_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject removal_module_test_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject removal_module_test_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native.class ? T : NIL;
    }

    public static final SubLObject rmt_hl_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField2();
    }

    public static SubLObject rmt_hl_module(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rmt_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField3();
    }

    public static SubLObject rmt_id(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rmt_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField4();
    }

    public static SubLObject rmt_sentence(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rmt_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField5();
    }

    public static SubLObject rmt_mt(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rmt_properties_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField6();
    }

    public static SubLObject rmt_properties(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rmt_comment_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField7();
    }

    public static SubLObject rmt_comment(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rmt_kb_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField8();
    }

    public static SubLObject rmt_kb(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject rmt_owner_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField9();
    }

    public static SubLObject rmt_owner(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject rmt_bug_number_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField10();
    }

    public static SubLObject rmt_bug_number(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject rmt_creation_date_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField11();
    }

    public static SubLObject rmt_creation_date(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject rmt_creator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField12();
    }

    public static SubLObject rmt_creator(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject rmt_workingP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.getField13();
    }

    public static SubLObject rmt_workingP(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_rmt_hl_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rmt_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rmt_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rmt_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rmt_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rmt_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rmt_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rmt_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rmt_properties_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rmt_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rmt_comment_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rmt_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rmt_kb_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rmt_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_rmt_owner_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rmt_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_rmt_bug_number_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_rmt_bug_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_rmt_creation_date_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_rmt_creation_date(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_rmt_creator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_rmt_creator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_rmt_workingP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_MODULE_TEST_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_rmt_workingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "! removal_module_tests.removal_module_test_p(v_object) " + "removal_module_tests.removal_module_test_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_removal_module_test_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HL_MODULE)) {
                        com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_hl_module(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ID)) {
                            com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_id(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SENTENCE)) {
                                com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_sentence(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MT)) {
                                    com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_mt(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PROPERTIES)) {
                                        com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_properties(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($COMMENT)) {
                                            com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_comment(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($KB)) {
                                                com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_kb(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($OWNER)) {
                                                    com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_owner(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($BUG_NUMBER)) {
                                                        com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_bug_number(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($CREATION_DATE)) {
                                                            com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_creation_date(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($CREATOR)) {
                                                                com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_creator(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($WORKING_)) {
                                                                    com.cyc.cycjava.cycl.cyc_testing.removal_module_tests._csetf_rmt_workingP(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt44$Invalid_slot__S_for_construction_, current_arg);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
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

    public static SubLObject make_removal_module_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_rmt_hl_module(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_rmt_id(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_rmt_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_rmt_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROPERTIES)) {
                                _csetf_rmt_properties(v_new, current_value);
                            } else
                                if (pcase_var.eql($COMMENT)) {
                                    _csetf_rmt_comment(v_new, current_value);
                                } else
                                    if (pcase_var.eql($KB)) {
                                        _csetf_rmt_kb(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($OWNER)) {
                                            _csetf_rmt_owner(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($BUG_NUMBER)) {
                                                _csetf_rmt_bug_number(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($CREATION_DATE)) {
                                                    _csetf_rmt_creation_date(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($CREATOR)) {
                                                        _csetf_rmt_creator(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($WORKING_)) {
                                                            _csetf_rmt_workingP(v_new, current_value);
                                                        } else {
                                                            Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_removal_module_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REMOVAL_MODULE_TEST, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, rmt_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, rmt_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, rmt_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, rmt_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, rmt_properties(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, rmt_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, rmt_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, rmt_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $BUG_NUMBER, rmt_bug_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATION_DATE, rmt_creation_date(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATOR, rmt_creator(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_, rmt_workingP(obj));
        funcall(visitor_fn, obj, $END, MAKE_REMOVAL_MODULE_TEST, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_removal_module_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_module_test(obj, visitor_fn);
    }

    /**
     * Return a list of all removal modules with some defined removal module tests
     */
    @LispMethod(comment = "Return a list of all removal modules with some defined removal module tests")
    public static final SubLObject removal_modules_with_removal_module_tests_alt() {
        {
            SubLObject hl_modules = hash_table_utilities.hash_table_keys($removal_module_tests$.getGlobalValue());
            hl_modules = Sort.sort(hl_modules, symbol_function($sym47$TERM__), symbol_function(HL_MODULE_NAME));
            return hl_modules;
        }
    }

    /**
     * Return a list of all removal modules with some defined removal module tests
     */
    @LispMethod(comment = "Return a list of all removal modules with some defined removal module tests")
    public static SubLObject removal_modules_with_removal_module_tests() {
        SubLObject hl_modules = hash_table_keys($removal_module_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, symbol_function($sym53$TERM__), symbol_function(HL_MODULE_NAME));
        return hl_modules;
    }

    /**
     * Return a list of all removal module tests defined for HL-MODULE
     */
    @LispMethod(comment = "Return a list of all removal module tests defined for HL-MODULE")
    public static final SubLObject removal_module_tests_alt(SubLObject hl_module) {
        {
            SubLObject tests = copy_list(gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED));
            tests = Sort.sort(tests, symbol_function($sym49$_), symbol_function(RMT_ID));
            return tests;
        }
    }

    /**
     * Return a list of all removal module tests defined for HL-MODULE
     */
    @LispMethod(comment = "Return a list of all removal module tests defined for HL-MODULE")
    public static SubLObject removal_module_tests(final SubLObject hl_module) {
        SubLObject tests = copy_list(gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED));
        tests = Sort.sort(tests, symbol_function($sym55$_), symbol_function(RMT_ID));
        return tests;
    }

    /**
     * Return T iff some removal module tests are defined for HL-MODULE
     */
    @LispMethod(comment = "Return T iff some removal module tests are defined for HL-MODULE")
    public static final SubLObject some_removal_module_testsP_alt(SubLObject hl_module) {
        return list_utilities.sublisp_boolean(gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED));
    }

    /**
     * Return T iff some removal module tests are defined for HL-MODULE
     */
    @LispMethod(comment = "Return T iff some removal module tests are defined for HL-MODULE")
    public static SubLObject some_removal_module_testsP(final SubLObject hl_module) {
        return sublisp_boolean(gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject removal_module_test_name_alt(SubLObject rmt) {
        return list(inference_modules.hl_module_name(com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_hl_module(rmt)), com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_id(rmt));
    }

    public static SubLObject removal_module_test_name(final SubLObject rmt) {
        return list(hl_module_name(rmt_hl_module(rmt)), rmt_id(rmt));
    }

    public static SubLObject removal_module_test_id(final SubLObject rmt) {
        return rmt_id(rmt);
    }

    public static final SubLObject removal_module_test_mt_alt(SubLObject rmt) {
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_mt(rmt);
    }

    public static SubLObject removal_module_test_mt(final SubLObject rmt) {
        return rmt_mt(rmt);
    }

    public static final SubLObject removal_module_test_sentence_alt(SubLObject rmt) {
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_sentence(rmt);
    }

    public static SubLObject removal_module_test_sentence(final SubLObject rmt) {
        return rmt_sentence(rmt);
    }

    public static final SubLObject removal_module_test_owner_alt(SubLObject rmt) {
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_owner(rmt);
    }

    public static SubLObject removal_module_test_owner(final SubLObject rmt) {
        return rmt_owner(rmt);
    }

    public static final SubLObject removal_module_test_comment_alt(SubLObject rmt) {
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_comment(rmt);
    }

    public static SubLObject removal_module_test_comment(final SubLObject rmt) {
        return rmt_comment(rmt);
    }

    public static final SubLObject removal_module_test_kb_alt(SubLObject rmt) {
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_kb(rmt);
    }

    public static SubLObject removal_module_test_kb(final SubLObject rmt) {
        return rmt_kb(rmt);
    }

    public static final SubLObject removal_module_test_workingP_alt(SubLObject rmt) {
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_workingP(rmt);
    }

    public static SubLObject removal_module_test_workingP(final SubLObject rmt) {
        return rmt_workingP(rmt);
    }

    public static final SubLObject removal_module_test_predicate_alt(SubLObject rmt) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_hl_module(rmt);
            if (NIL != hl_module) {
                {
                    SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
                    return predicate;
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_module_test_predicate(final SubLObject rmt) {
        final SubLObject hl_module = rmt_hl_module(rmt);
        if (NIL != hl_module) {
            final SubLObject predicate = hl_module_predicate(hl_module);
            return predicate;
        }
        return NIL;
    }

    public static final SubLObject removal_module_test_mentions_invalid_constantP_alt(SubLObject rmt) {
        return makeBoolean((NIL != list_utilities.tree_find_if(symbol_function($sym50$INVALID_CONSTANT_), com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_test_mt(rmt), UNPROVIDED)) || (NIL != list_utilities.tree_find_if(symbol_function($sym50$INVALID_CONSTANT_), com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_test_sentence(rmt), UNPROVIDED)));
    }

    public static SubLObject removal_module_test_mentions_invalid_constantP(final SubLObject rmt) {
        return makeBoolean((NIL != tree_find_if($sym56$INVALID_CONSTANT_, removal_module_test_mt(rmt), UNPROVIDED)) || (NIL != tree_find_if($sym56$INVALID_CONSTANT_, removal_module_test_sentence(rmt), UNPROVIDED)));
    }

    public static SubLObject removal_module_test_invalid_constants(final SubLObject rmt) {
        return remove_duplicates(append(cycl_utilities.expression_gather(removal_module_test_mt(rmt), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(removal_module_test_sentence(rmt), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Define a removal module test number ID for the module named NAME.
     * The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.
     * PROPERTIES, if not nil, specifies additional query properties to pass in.
     */
    @LispMethod(comment = "Define a removal module test number ID for the module named NAME.\r\nThe test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\r\nPROPERTIES, if not nil, specifies additional query properties to pass in.\nDefine a removal module test number ID for the module named NAME.\nThe test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\nPROPERTIES, if not nil, specifies additional query properties to pass in.")
    public static final SubLObject define_removal_module_test_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject id = NIL;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt51);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt51);
            id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt51);
            sentence = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt51);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt51);
                    if (NIL == member(current_1, $list_alt52, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt51);
                }
                {
                    SubLObject mt_tail = property_list_member($MT, current);
                    SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : $$EverythingPSC;
                    SubLObject properties_tail = property_list_member($PROPERTIES, current);
                    SubLObject v_properties = (NIL != properties_tail) ? ((SubLObject) (cadr(properties_tail))) : NIL;
                    SubLObject kb_tail = property_list_member($KB, current);
                    SubLObject kb = (NIL != kb_tail) ? ((SubLObject) (cadr(kb_tail))) : $TINY;
                    SubLObject owner_tail = property_list_member($OWNER, current);
                    SubLObject owner = (NIL != owner_tail) ? ((SubLObject) (cadr(owner_tail))) : NIL;
                    SubLObject comment_tail = property_list_member($COMMENT, current);
                    SubLObject comment = (NIL != comment_tail) ? ((SubLObject) (cadr(comment_tail))) : NIL;
                    SubLObject bug_tail = property_list_member($BUG, current);
                    SubLObject bug = (NIL != bug_tail) ? ((SubLObject) (cadr(bug_tail))) : NIL;
                    SubLObject created_tail = property_list_member($CREATED, current);
                    SubLObject created = (NIL != created_tail) ? ((SubLObject) (cadr(created_tail))) : NIL;
                    SubLObject creator_tail = property_list_member($CREATOR, current);
                    SubLObject creator = (NIL != creator_tail) ? ((SubLObject) (cadr(creator_tail))) : NIL;
                    SubLObject workingP_tail = property_list_member($WORKING_, current);
                    SubLObject workingP = (NIL != workingP_tail) ? ((SubLObject) (cadr(workingP_tail))) : T;
                    return list(new SubLObject[]{ DEFINE_REMOVAL_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP });
                }
            }
        }
    }

    /**
     * Define a removal module test number ID for the module named NAME.
     * The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.
     * PROPERTIES, if not nil, specifies additional query properties to pass in.
     */
    @LispMethod(comment = "Define a removal module test number ID for the module named NAME.\r\nThe test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\r\nPROPERTIES, if not nil, specifies additional query properties to pass in.\nDefine a removal module test number ID for the module named NAME.\nThe test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\nPROPERTIES, if not nil, specifies additional query properties to pass in.")
    public static SubLObject define_removal_module_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$1, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$BaseKB;
        final SubLObject properties_tail = property_list_member($PROPERTIES, current);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $TINY;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject bug_tail = property_list_member($BUG, current);
        final SubLObject bug = (NIL != bug_tail) ? cadr(bug_tail) : NIL;
        final SubLObject created_tail = property_list_member($CREATED, current);
        final SubLObject created = (NIL != created_tail) ? cadr(created_tail) : NIL;
        final SubLObject creator_tail = property_list_member($CREATOR, current);
        final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        return list(new SubLObject[]{ DEFINE_REMOVAL_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP });
    }

    public static final SubLObject define_removal_module_test_int_alt(SubLObject name, SubLObject id, SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject kb, SubLObject owner, SubLObject comment, SubLObject bug_number, SubLObject creation_date, SubLObject creator, SubLObject workingP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            SubLTrampolineFile.checkType(kb, CYC_TEST_KB_P);
            SubLTrampolineFile.checkType(owner, INFERENCE_TEST_OWNER_P);
            if (NIL != bug_number) {
                SubLTrampolineFile.checkType(bug_number, POSITIVE_INTEGER_P);
            }
            if (NIL != creation_date) {
                SubLTrampolineFile.checkType(creation_date, UNIVERSAL_DATE_P);
            }
            if (NIL != creator) {
                SubLTrampolineFile.checkType(creator, STRINGP);
            }
            SubLTrampolineFile.checkType(workingP, BOOLEANP);
            {
                SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
                if (NIL != inference_modules.removal_module_p(hl_module)) {
                    {
                        SubLObject test = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.make_removal_module_test(list(new SubLObject[]{ $HL_MODULE, hl_module, $ID, id, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties, $COMMENT, comment, $KB, kb, $OWNER, owner, $BUG_NUMBER, bug_number, $CREATION_DATE, creation_date, $CREATOR, creator, $WORKING_, workingP }));
                        SubLObject existing_tests = gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED);
                        existing_tests = delete(id, existing_tests, symbol_function(EQL), symbol_function(RMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        existing_tests = cons(test, existing_tests);
                        sethash(hl_module, $removal_module_tests$.getGlobalValue(), existing_tests);
                        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
                        return test;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject define_removal_module_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != cyc_testing.cyc_test_kb_p(kb) : "! cyc_testing.cyc_test_kb_p(kb) " + ("cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) ") + kb;
        assert NIL != inference_testing.inference_test_owner_p(owner) : "! inference_testing.inference_test_owner_p(owner) " + ("inference_testing.inference_test_owner_p(owner) " + "CommonSymbols.NIL != inference_testing.inference_test_owner_p(owner) ") + owner;
        if (((NIL != bug_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(bug_number))) {
            throw new AssertionError(bug_number);
        }
        if (((NIL != creation_date) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numeric_date_utilities.universal_date_p(creation_date))) {
            throw new AssertionError(creation_date);
        }
        if (((NIL != creator) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(creator))) {
            throw new AssertionError(creator);
        }
        assert NIL != booleanp(workingP) : "! booleanp(workingP) " + ("Types.booleanp(workingP) " + "CommonSymbols.NIL != Types.booleanp(workingP) ") + workingP;
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != removal_module_p(hl_module)) {
            final SubLObject test = make_removal_module_test(list(new SubLObject[]{ $HL_MODULE, hl_module, $ID, id, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties, $COMMENT, comment, $KB, kb, $OWNER, owner, $BUG_NUMBER, bug_number, $CREATION_DATE, creation_date, $CREATOR, creator, $WORKING_, workingP }));
            SubLObject existing_tests = gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED);
            existing_tests = delete(id, existing_tests, symbol_function(EQL), symbol_function(RMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            existing_tests = cons(test, existing_tests);
            sethash(hl_module, $removal_module_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return NIL;
    }

    public static final SubLObject undefine_removal_module_test_number_alt(SubLObject name, SubLObject number) {
        {
            SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
            SubLObject existing_tests = gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED);
            existing_tests = delete(number, existing_tests, symbol_function(EQL), symbol_function(RMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            sethash(hl_module, $removal_module_tests$.getGlobalValue(), existing_tests);
            return length(existing_tests);
        }
    }

    public static SubLObject undefine_removal_module_test_number(final SubLObject name, final SubLObject number) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        SubLObject existing_tests = gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED);
        existing_tests = delete(number, existing_tests, symbol_function(EQL), symbol_function(RMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sethash(hl_module, $removal_module_tests$.getGlobalValue(), existing_tests);
        return length(existing_tests);
    }

    public static final SubLObject clear_removal_module_tests_alt() {
        clrhash($removal_module_tests$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_removal_module_tests() {
        clrhash($removal_module_tests$.getGlobalValue());
        return NIL;
    }

    /**
     * Run all the defined removal module tests, printing results in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run all the defined removal module tests, printing results in OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)")
    public static final SubLObject run_all_removal_module_tests_alt(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
        return cyc_testing.run_all_loaded_cyc_tests(stream, $TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $RMT, NIL, UNPROVIDED);
    }

    /**
     * Run all the defined removal module tests, printing results in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run all the defined removal module tests, printing results in OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)")
    public static SubLObject run_all_removal_module_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "! cyc_testing.cyc_test_output_format_p(output_format) " + ("cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) ") + output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, $TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $RMT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Run the defined removal module tests that are specific to PRED, printing
     * results in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run the defined removal module tests that are specific to PRED, printing\r\nresults in OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)\nRun the defined removal module tests that are specific to PRED, printing\nresults in OUTPUT-FORMAT to STREAM.")
    public static final SubLObject run_removal_module_tests_for_pred_alt(SubLObject pred, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
            {
                SubLObject hl_modules = inference_modules.removal_modules_specific(pred);
                SubLObject result = $SUCCESS;
                SubLObject test_runs = NIL;
                SubLObject cdolist_list_var = hl_modules;
                SubLObject hl_module = NIL;
                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject partial_result = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
                        SubLObject partial_test_runs = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        test_runs = nconc(test_runs, partial_test_runs);
                        if (partial_result != $SUCCESS) {
                            result = partial_result;
                        }
                    }
                }
                return values(result, test_runs);
            }
        }
    }

    /**
     * Run the defined removal module tests that are specific to PRED, printing
     * results in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run the defined removal module tests that are specific to PRED, printing\r\nresults in OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)\nRun the defined removal module tests that are specific to PRED, printing\nresults in OUTPUT-FORMAT to STREAM.")
    public static SubLObject run_removal_module_tests_for_pred(final SubLObject pred, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "! cyc_testing.cyc_test_output_format_p(output_format) " + ("cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) ") + output_format;
        final SubLObject hl_modules = removal_modules_specific(pred);
        SubLObject result = $SUCCESS;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
            final SubLObject partial_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = nconc(test_runs, partial_test_runs);
            if (partial_result != $SUCCESS) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        return values(result, test_runs);
    }

    public static final SubLObject run_removal_module_tests_browsable_alt(SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_tests(name, output_format, stream, T, UNPROVIDED);
    }

    public static SubLObject run_removal_module_tests_browsable(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_tests(name, output_format, stream, T, UNPROVIDED);
    }

    public static final SubLObject run_removal_module_tests_blocking_alt(SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_tests(name, output_format, stream, T, T);
    }

    public static SubLObject run_removal_module_tests_blocking(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_tests(name, output_format, stream, T, T);
    }

    /**
     * Run all the defined removal module tests for the removal module named NAME, printing results
     * in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run all the defined removal module tests for the removal module named NAME, printing results\r\nin OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)\nRun all the defined removal module tests for the removal module named NAME, printing results\nin OUTPUT-FORMAT to STREAM.")
    public static final SubLObject run_removal_module_tests_alt(SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
        {
            SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
            if (NIL != inference_modules.removal_module_p(hl_module)) {
                return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
            }
        }
        return NIL;
    }

    /**
     * Run all the defined removal module tests for the removal module named NAME, printing results
     * in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run all the defined removal module tests for the removal module named NAME, printing results\r\nin OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)\nRun all the defined removal module tests for the removal module named NAME, printing results\nin OUTPUT-FORMAT to STREAM.")
    public static SubLObject run_removal_module_tests(final SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "! cyc_testing.cyc_test_output_format_p(output_format) " + ("cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) ") + output_format;
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != removal_module_p(hl_module)) {
            return run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
        }
        return NIL;
    }

    public static final SubLObject run_removal_module_tests_int_alt(SubLObject hl_module, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $SUCCESS;
                SubLObject test_runs = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_tests(hl_module);
                SubLObject rmt = NIL;
                for (rmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rmt = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject partial_result = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
                        SubLObject test_run = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        test_runs = cons(test_run, test_runs);
                        if (!((partial_result == $SUCCESS) || (partial_result == $NOT_RUN))) {
                            result = partial_result;
                        }
                    }
                }
                return values(result, nreverse(test_runs));
            }
        }
    }

    public static SubLObject run_removal_module_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $SUCCESS;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = removal_module_tests(hl_module);
        SubLObject rmt = NIL;
        rmt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = cons(test_run, test_runs);
            if ((partial_result != $SUCCESS) && (partial_result != $NOT_RUN)) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rmt = cdolist_list_var.first();
        } 
        return values(result, nreverse(test_runs));
    }

    public static final SubLObject run_removal_module_test_number_browsable_alt(SubLObject name, SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_test_number(name, number, output_format, stream, T, UNPROVIDED);
    }

    public static SubLObject run_removal_module_test_number_browsable(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_test_number(name, number, output_format, stream, T, UNPROVIDED);
    }

    public static final SubLObject run_removal_module_test_number_blocking_alt(SubLObject name, SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_test_number(name, number, output_format, stream, T, T);
    }

    public static SubLObject run_removal_module_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_test_number(name, number, output_format, stream, T, T);
    }

    /**
     * Runs the NUMBERth removal module test for HL-MODULE.
     */
    @LispMethod(comment = "Runs the NUMBERth removal module test for HL-MODULE.")
    public static final SubLObject run_removal_module_test_number_alt(SubLObject name, SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
        {
            SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
            SubLObject test = NIL;
            if (NIL != inference_modules.removal_module_p(hl_module)) {
                if (NIL == test) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_tests(hl_module);
                        SubLObject rmt = NIL;
                        for (rmt = csome_list_var.first(); !((NIL != test) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rmt = csome_list_var.first()) {
                            if (number.numE(com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_id(rmt))) {
                                test = rmt;
                            }
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_test(test, output_format, stream, browsableP, blockP);
        }
    }

    /**
     * Runs the NUMBERth removal module test for HL-MODULE.
     */
    @LispMethod(comment = "Runs the NUMBERth removal module test for HL-MODULE.")
    public static SubLObject run_removal_module_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "! cyc_testing.cyc_test_output_format_p(output_format) " + ("cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) ") + output_format;
        final SubLObject hl_module = find_hl_module_by_name(name);
        SubLObject test = NIL;
        if ((NIL != removal_module_p(hl_module)) && (NIL == test)) {
            SubLObject csome_list_var = removal_module_tests(hl_module);
            SubLObject rmt = NIL;
            rmt = csome_list_var.first();
            while ((NIL == test) && (NIL != csome_list_var)) {
                if (number.numE(rmt_id(rmt))) {
                    test = rmt;
                }
                csome_list_var = csome_list_var.rest();
                rmt = csome_list_var.first();
            } 
        }
        return run_removal_module_test(test, output_format, stream, browsableP, blockP);
    }

    /**
     * Run the removal module test RMT, printing results
     * in OUTPUT-FORMAT to STREAM.
     *
     * @return 0 cyc-test-result-p; the test result
     * @return 1 cyc-test-run-p; the details of the test that was run
    OUTPUT-FORMAT defaults to :STANDARD.
    STREAM defaults to *standard-output*.
    Possible output formats:
    :STANDARD -- module-name id -> result
    :POST-BUILD -- result :RMT (module-name id)
     */
    @LispMethod(comment = "Run the removal module test RMT, printing results\r\nin OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the test result\r\n@return 1 cyc-test-run-p; the details of the test that was run\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)\nRun the removal module test RMT, printing results\nin OUTPUT-FORMAT to STREAM.")
    public static final SubLObject run_removal_module_test_alt(SubLObject rmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rmt, REMOVAL_MODULE_TEST_P);
            SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
            {
                SubLObject name = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_test_name(rmt);
                SubLObject time = NIL;
                SubLObject result = NIL;
                if (NIL == com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_testP(rmt)) {
                    result = $NOT_RUN;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_test_mentions_invalid_constantP(rmt)) {
                        result = $INVALID;
                    } else {
                        {
                            SubLObject hl_module = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_hl_module(rmt);
                            SubLObject sentence = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_sentence(rmt);
                            SubLObject mt = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_mt(rmt);
                            SubLObject v_properties = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_properties(rmt);
                            {
                                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                                try {
                                    $print_pretty$.bind(NIL, thread);
                                    com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.print_removal_module_test_preamble(rmt, output_format, stream);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject result_2 = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_test_query(hl_module, sentence, mt, v_properties, browsableP, blockP, UNPROVIDED, UNPROVIDED);
                                        SubLObject time_3 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        result = result_2;
                                        time = time_3;
                                    }
                                    com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.print_removal_module_test_result(rmt, result, output_format, stream);
                                } finally {
                                    $print_pretty$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject test_run = cyc_testing.new_cyc_test_run($RMT, name, result, time);
                    return values(result, test_run);
                }
            }
        }
    }

    @LispMethod(comment = "Run the removal module test RMT, printing results\r\nin OUTPUT-FORMAT to STREAM.\r\n\r\n@return 0 cyc-test-result-p; the test result\r\n@return 1 cyc-test-run-p; the details of the test that was run\r\nOUTPUT-FORMAT defaults to :STANDARD.\r\nSTREAM defaults to *standard-output*.\r\nPossible output formats:\r\n:STANDARD -- module-name id -> result\r\n:POST-BUILD -- result :RMT (module-name id)\nRun the removal module test RMT, printing results\nin OUTPUT-FORMAT to STREAM.")
    public static SubLObject run_removal_module_test(final SubLObject rmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != removal_module_test_p(rmt) : "! removal_module_tests.removal_module_test_p(rmt) " + ("removal_module_tests.removal_module_test_p(rmt) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(rmt) ") + rmt;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "! cyc_testing.cyc_test_output_format_p(output_format) " + ("cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) ") + output_format;
        final SubLObject name = removal_module_test_name(rmt);
        SubLObject time = NIL;
        SubLObject result = NIL;
        if (NIL == run_removal_module_testP(rmt)) {
            result = $NOT_RUN;
        } else
            if (NIL != removal_module_test_mentions_invalid_constantP(rmt)) {
                result = $INVALID;
            } else {
                final SubLObject hl_module = rmt_hl_module(rmt);
                final SubLObject sentence = rmt_sentence(rmt);
                final SubLObject mt = rmt_mt(rmt);
                final SubLObject v_properties = rmt_properties(rmt);
                final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    print_removal_module_test_preamble(rmt, output_format, stream);
                    thread.resetMultipleValues();
                    final SubLObject result_$2 = run_removal_module_test_query(hl_module, sentence, mt, v_properties, browsableP, blockP, UNPROVIDED, UNPROVIDED);
                    final SubLObject time_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$2;
                    time = time_$3;
                    print_removal_module_test_result(rmt, result, time, output_format, stream);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }

        final SubLObject test_run = cyc_testing.new_cyc_test_run($RMT, name, result, time);
        return values(result, test_run);
    }

    /**
     *
     *
     * @see run-inference-unit-test?
     */
    @LispMethod(comment = "@see run-inference-unit-test?")
    public static final SubLObject run_removal_module_testP_alt(SubLObject rmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_kb = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_kb(rmt);
                if (NIL == kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
                    return NIL;
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @see run-inference-unit-test?
     */
    @LispMethod(comment = "@see run-inference-unit-test?")
    public static SubLObject run_removal_module_testP(final SubLObject rmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = rmt_kb(rmt);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject run_removal_module_test_query_alt(SubLObject hl_module, SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject browsableP, SubLObject blockP, SubLObject expected_result, SubLObject expected_halt_reason) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        if (expected_result == UNPROVIDED) {
            expected_result = $UNSPECIFIED;
        }
        if (expected_halt_reason == UNPROVIDED) {
            expected_halt_reason = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject subresult = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.run_removal_module_test_query_int(hl_module, sentence, mt, v_properties, browsableP, blockP, expected_result, expected_halt_reason);
                SubLObject time = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pcase_var = subresult;
                    if (pcase_var.eql($ERROR)) {
                        return values(subresult, time);
                    } else {
                        if (pcase_var.eql($SUCCESS)) {
                            return values(subresult, time);
                        } else {
                            return values($FAILURE, time);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject run_removal_module_test_query(final SubLObject hl_module, final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject browsableP, SubLObject blockP, SubLObject expected_result, SubLObject expected_halt_reason) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        if (expected_result == UNPROVIDED) {
            expected_result = $UNSPECIFIED;
        }
        if (expected_halt_reason == UNPROVIDED) {
            expected_halt_reason = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subresult = run_removal_module_test_query_int(hl_module, sentence, mt, v_properties, browsableP, blockP, expected_result, expected_halt_reason);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = subresult;
        if (pcase_var.eql($ERROR)) {
            return values(subresult, time);
        }
        if (pcase_var.eql($SUCCESS)) {
            return values(subresult, time);
        }
        return values($FAILURE, time);
    }

    public static final SubLObject run_removal_module_test_query_int_alt(SubLObject hl_module, SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject browsableP, SubLObject blockP, SubLObject expected_result, SubLObject expected_halt_reason) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = $ERROR;
                SubLObject time = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject inference = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.removal_module_test_query_inference(sentence, mt, v_properties, blockP);
                                    SubLObject inference_time = thread.secondMultipleValue();
                                    SubLObject result = thread.thirdMultipleValue();
                                    SubLObject halt_reason = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    time = inference_time;
                                    if (($UNSPECIFIED != expected_result) && (NIL == bindings.lists_of_binding_lists_equalP(result, expected_result))) {
                                        v_answer = $FAILURE_BINDINGS;
                                    } else {
                                        if ((NIL != expected_halt_reason) && (!halt_reason.equal(expected_halt_reason))) {
                                            v_answer = $FAILURE_HALT_REASON;
                                        } else {
                                            if (NIL == inference_utilities.inference_some_proof_uses_removal_moduleP(inference, hl_module)) {
                                                v_answer = $FAILURE_REMOVAL_MODULE;
                                            } else {
                                                v_answer = $SUCCESS;
                                            }
                                        }
                                    }
                                    if (NIL == browsableP) {
                                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                return values(v_answer, time);
            }
        }
    }

    public static SubLObject run_removal_module_test_query_int(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject browsableP, final SubLObject blockP, final SubLObject expected_result, final SubLObject expected_halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = $ERROR;
        SubLObject time = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject inference = removal_module_test_query_inference(sentence, mt, v_properties, blockP);
                    final SubLObject inference_time = thread.secondMultipleValue();
                    final SubLObject result = thread.thirdMultipleValue();
                    final SubLObject halt_reason = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (($UNSPECIFIED != expected_result) && (NIL == lists_of_binding_lists_equalP(result, expected_result))) {
                        v_answer = $FAILURE_BINDINGS;
                    } else
                        if ((NIL != expected_halt_reason) && (!halt_reason.equal(expected_halt_reason))) {
                            v_answer = $FAILURE_HALT_REASON;
                        } else
                            if (NIL == inference_some_proof_uses_removal_moduleP(inference, hl_module)) {
                                v_answer = $FAILURE_REMOVAL_MODULE;
                            } else {
                                v_answer = $SUCCESS;
                            }


                    if (NIL == browsableP) {
                        destroy_inference_and_problem_store(inference);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(v_answer, time);
    }

    /**
     *
     *
     * @return 0 inference-p
     * @return 1 non-negative-number-p; the time taken to run the test query
     */
    @LispMethod(comment = "@return 0 inference-p\r\n@return 1 non-negative-number-p; the time taken to run the test query")
    public static final SubLObject removal_module_test_query_inference_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
                v_properties = copy_list(v_properties);
                v_properties = putf(v_properties, $kw83$CONDITIONAL_SENTENCE_, conditionalP);
                v_properties = putf(v_properties, $BROWSABLE_, T);
                v_properties = putf(v_properties, $kw85$CACHE_INFERENCE_RESULTS_, NIL);
                if (NIL != blockP) {
                    v_properties = putf(v_properties, $BLOCK_, T);
                }
                {
                    SubLObject time = NIL;
                    SubLObject result = NIL;
                    SubLObject halt_reason = NIL;
                    SubLObject inference = NIL;
                    SubLObject time_var = get_internal_real_time();
                    thread.resetMultipleValues();
                    {
                        SubLObject result_4 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
                        SubLObject halt_reason_5 = thread.secondMultipleValue();
                        SubLObject inference_6 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        result = result_4;
                        halt_reason = halt_reason_5;
                        inference = inference_6;
                    }
                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    return values(inference, time, result, halt_reason);
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 inference-p
     * @return 1 non-negative-number-p; the time taken to run the test query
     */
    @LispMethod(comment = "@return 0 inference-p\r\n@return 1 non-negative-number-p; the time taken to run the test query")
    public static SubLObject removal_module_test_query_inference(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject conditionalP = inference_conditional_sentence_p(sentence);
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $kw89$CONDITIONAL_SENTENCE_, conditionalP);
        v_properties = putf(v_properties, $BROWSABLE_, T);
        v_properties = putf(v_properties, $kw91$CACHE_INFERENCE_RESULTS_, NIL);
        v_properties = putf(v_properties, $kw92$NEW_TERMS_ALLOWED_, T);
        if (NIL != blockP) {
            v_properties = putf(v_properties, $BLOCK_, T);
        }
        SubLObject time = NIL;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        final SubLObject time_var = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject result_$4 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_$5 = thread.secondMultipleValue();
        final SubLObject inference_$6 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = result_$4;
        halt_reason = halt_reason_$5;
        inference = inference_$6;
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(inference, time, result, halt_reason);
    }

    public static final SubLObject print_removal_module_test_preamble_alt(SubLObject rmt, SubLObject output_format, SubLObject stream) {
        {
            SubLObject pcase_var = output_format;
            if (pcase_var.eql($STANDARD)) {
                {
                    SubLObject hl_module = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_hl_module(rmt);
                    SubLObject name = inference_modules.hl_module_name(hl_module);
                    SubLObject id = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_id(rmt);
                    format(stream, $str_alt87$___S__S____, name, id);
                    force_output(stream);
                }
            } else {
                if (pcase_var.eql($POST_BUILD)) {
                } else {
                    format(stream, $str_alt89$Unknown_output_format__A, output_format);
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_removal_module_test_preamble(final SubLObject rmt, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            final SubLObject hl_module = rmt_hl_module(rmt);
            final SubLObject name = hl_module_name(hl_module);
            final SubLObject id = rmt_id(rmt);
            format(stream, $str94$___RMT__S__S____, name, id);
            force_output(stream);
        } else
            if (!output_format.eql($POST_BUILD)) {
                format(stream, $str96$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static final SubLObject print_removal_module_test_result(SubLObject rmt, SubLObject result, SubLObject output_format, SubLObject stream) {
        {
            SubLObject pcase_var = output_format;
            if (pcase_var.eql($STANDARD)) {
                format(stream, $str_alt90$_S__, result);
                force_output(stream);
            } else {
                if (pcase_var.eql($POST_BUILD)) {
                    {
                        SubLObject hl_module = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_hl_module(rmt);
                        SubLObject name = inference_modules.hl_module_name(hl_module);
                        SubLObject id = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_id(rmt);
                        SubLObject owner = com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.rmt_owner(rmt);
                        format(stream, $str_alt91$_S__RMT___S__S___OWNER__S__, new SubLObject[]{ result, name, id, owner });
                        force_output(stream);
                    }
                } else {
                    format(stream, $str_alt89$Unknown_output_format__A, output_format);
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_removal_module_test_result(final SubLObject rmt, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            format(stream, $str97$_S____3f___, result, time);
            force_output(stream);
        } else
            if (output_format.eql($POST_BUILD)) {
                final SubLObject hl_module = rmt_hl_module(rmt);
                final SubLObject name = hl_module_name(hl_module);
                final SubLObject id = rmt_id(rmt);
                final SubLObject owner = rmt_owner(rmt);
                cyc_testing.print_post_build_test_summary(stream, result, $RMT, list(name, id), time, owner);
            } else {
                format(stream, $str96$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static final SubLObject declare_removal_module_tests_file_alt() {
        declareFunction("removal_module_test_print_function_trampoline", "REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_module_test_p", "REMOVAL-MODULE-TEST-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.$removal_module_test_p$UnaryFunction();
        declareFunction("rmt_hl_module", "RMT-HL-MODULE", 1, 0, false);
        declareFunction("rmt_id", "RMT-ID", 1, 0, false);
        declareFunction("rmt_sentence", "RMT-SENTENCE", 1, 0, false);
        declareFunction("rmt_mt", "RMT-MT", 1, 0, false);
        declareFunction("rmt_properties", "RMT-PROPERTIES", 1, 0, false);
        declareFunction("rmt_comment", "RMT-COMMENT", 1, 0, false);
        declareFunction("rmt_kb", "RMT-KB", 1, 0, false);
        declareFunction("rmt_owner", "RMT-OWNER", 1, 0, false);
        declareFunction("rmt_bug_number", "RMT-BUG-NUMBER", 1, 0, false);
        declareFunction("rmt_creation_date", "RMT-CREATION-DATE", 1, 0, false);
        declareFunction("rmt_creator", "RMT-CREATOR", 1, 0, false);
        declareFunction("rmt_workingP", "RMT-WORKING?", 1, 0, false);
        declareFunction("_csetf_rmt_hl_module", "_CSETF-RMT-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_rmt_id", "_CSETF-RMT-ID", 2, 0, false);
        declareFunction("_csetf_rmt_sentence", "_CSETF-RMT-SENTENCE", 2, 0, false);
        declareFunction("_csetf_rmt_mt", "_CSETF-RMT-MT", 2, 0, false);
        declareFunction("_csetf_rmt_properties", "_CSETF-RMT-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_rmt_comment", "_CSETF-RMT-COMMENT", 2, 0, false);
        declareFunction("_csetf_rmt_kb", "_CSETF-RMT-KB", 2, 0, false);
        declareFunction("_csetf_rmt_owner", "_CSETF-RMT-OWNER", 2, 0, false);
        declareFunction("_csetf_rmt_bug_number", "_CSETF-RMT-BUG-NUMBER", 2, 0, false);
        declareFunction("_csetf_rmt_creation_date", "_CSETF-RMT-CREATION-DATE", 2, 0, false);
        declareFunction("_csetf_rmt_creator", "_CSETF-RMT-CREATOR", 2, 0, false);
        declareFunction("_csetf_rmt_workingP", "_CSETF-RMT-WORKING?", 2, 0, false);
        declareFunction("make_removal_module_test", "MAKE-REMOVAL-MODULE-TEST", 0, 1, false);
        declareFunction("removal_modules_with_removal_module_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-TESTS", 0, 0, false);
        declareFunction("removal_module_tests", "REMOVAL-MODULE-TESTS", 1, 0, false);
        declareFunction("some_removal_module_testsP", "SOME-REMOVAL-MODULE-TESTS?", 1, 0, false);
        declareFunction("removal_module_test_name", "REMOVAL-MODULE-TEST-NAME", 1, 0, false);
        declareFunction("removal_module_test_mt", "REMOVAL-MODULE-TEST-MT", 1, 0, false);
        declareFunction("removal_module_test_sentence", "REMOVAL-MODULE-TEST-SENTENCE", 1, 0, false);
        declareFunction("removal_module_test_owner", "REMOVAL-MODULE-TEST-OWNER", 1, 0, false);
        declareFunction("removal_module_test_comment", "REMOVAL-MODULE-TEST-COMMENT", 1, 0, false);
        declareFunction("removal_module_test_kb", "REMOVAL-MODULE-TEST-KB", 1, 0, false);
        declareFunction("removal_module_test_workingP", "REMOVAL-MODULE-TEST-WORKING?", 1, 0, false);
        declareFunction("removal_module_test_predicate", "REMOVAL-MODULE-TEST-PREDICATE", 1, 0, false);
        declareFunction("removal_module_test_mentions_invalid_constantP", "REMOVAL-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareMacro("define_removal_module_test", "DEFINE-REMOVAL-MODULE-TEST");
        declareFunction("define_removal_module_test_int", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
        declareFunction("undefine_removal_module_test_number", "UNDEFINE-REMOVAL-MODULE-TEST-NUMBER", 2, 0, false);
        declareFunction("clear_removal_module_tests", "CLEAR-REMOVAL-MODULE-TESTS", 0, 0, false);
        declareFunction("run_all_removal_module_tests", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
        declareFunction("run_removal_module_tests_for_pred", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
        declareFunction("run_removal_module_tests_browsable", "RUN-REMOVAL-MODULE-TESTS-BROWSABLE", 1, 2, false);
        declareFunction("run_removal_module_tests_blocking", "RUN-REMOVAL-MODULE-TESTS-BLOCKING", 1, 2, false);
        declareFunction("run_removal_module_tests", "RUN-REMOVAL-MODULE-TESTS", 1, 4, false);
        declareFunction("run_removal_module_tests_int", "RUN-REMOVAL-MODULE-TESTS-INT", 5, 0, false);
        declareFunction("run_removal_module_test_number_browsable", "RUN-REMOVAL-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
        declareFunction("run_removal_module_test_number_blocking", "RUN-REMOVAL-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
        declareFunction("run_removal_module_test_number", "RUN-REMOVAL-MODULE-TEST-NUMBER", 2, 4, false);
        declareFunction("run_removal_module_test", "RUN-REMOVAL-MODULE-TEST", 1, 4, false);
        declareFunction("run_removal_module_testP", "RUN-REMOVAL-MODULE-TEST?", 1, 0, false);
        declareFunction("run_removal_module_test_query", "RUN-REMOVAL-MODULE-TEST-QUERY", 2, 6, false);
        declareFunction("run_removal_module_test_query_int", "RUN-REMOVAL-MODULE-TEST-QUERY-INT", 8, 0, false);
        declareFunction("removal_module_test_query_inference", "REMOVAL-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
        declareFunction("print_removal_module_test_preamble", "PRINT-REMOVAL-MODULE-TEST-PREAMBLE", 3, 0, false);
        declareFunction("print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 4, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_module_tests_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("removal_module_test_print_function_trampoline", "REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("removal_module_test_p", "REMOVAL-MODULE-TEST-P", 1, 0, false);
            new removal_module_tests.$removal_module_test_p$UnaryFunction();
            declareFunction("rmt_hl_module", "RMT-HL-MODULE", 1, 0, false);
            declareFunction("rmt_id", "RMT-ID", 1, 0, false);
            declareFunction("rmt_sentence", "RMT-SENTENCE", 1, 0, false);
            declareFunction("rmt_mt", "RMT-MT", 1, 0, false);
            declareFunction("rmt_properties", "RMT-PROPERTIES", 1, 0, false);
            declareFunction("rmt_comment", "RMT-COMMENT", 1, 0, false);
            declareFunction("rmt_kb", "RMT-KB", 1, 0, false);
            declareFunction("rmt_owner", "RMT-OWNER", 1, 0, false);
            declareFunction("rmt_bug_number", "RMT-BUG-NUMBER", 1, 0, false);
            declareFunction("rmt_creation_date", "RMT-CREATION-DATE", 1, 0, false);
            declareFunction("rmt_creator", "RMT-CREATOR", 1, 0, false);
            declareFunction("rmt_workingP", "RMT-WORKING?", 1, 0, false);
            declareFunction("_csetf_rmt_hl_module", "_CSETF-RMT-HL-MODULE", 2, 0, false);
            declareFunction("_csetf_rmt_id", "_CSETF-RMT-ID", 2, 0, false);
            declareFunction("_csetf_rmt_sentence", "_CSETF-RMT-SENTENCE", 2, 0, false);
            declareFunction("_csetf_rmt_mt", "_CSETF-RMT-MT", 2, 0, false);
            declareFunction("_csetf_rmt_properties", "_CSETF-RMT-PROPERTIES", 2, 0, false);
            declareFunction("_csetf_rmt_comment", "_CSETF-RMT-COMMENT", 2, 0, false);
            declareFunction("_csetf_rmt_kb", "_CSETF-RMT-KB", 2, 0, false);
            declareFunction("_csetf_rmt_owner", "_CSETF-RMT-OWNER", 2, 0, false);
            declareFunction("_csetf_rmt_bug_number", "_CSETF-RMT-BUG-NUMBER", 2, 0, false);
            declareFunction("_csetf_rmt_creation_date", "_CSETF-RMT-CREATION-DATE", 2, 0, false);
            declareFunction("_csetf_rmt_creator", "_CSETF-RMT-CREATOR", 2, 0, false);
            declareFunction("_csetf_rmt_workingP", "_CSETF-RMT-WORKING?", 2, 0, false);
            declareFunction("make_removal_module_test", "MAKE-REMOVAL-MODULE-TEST", 0, 1, false);
            declareFunction("visit_defstruct_removal_module_test", "VISIT-DEFSTRUCT-REMOVAL-MODULE-TEST", 2, 0, false);
            declareFunction("visit_defstruct_object_removal_module_test_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD", 2, 0, false);
            declareFunction("removal_modules_with_removal_module_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-TESTS", 0, 0, false);
            declareFunction("removal_module_tests", "REMOVAL-MODULE-TESTS", 1, 0, false);
            declareFunction("some_removal_module_testsP", "SOME-REMOVAL-MODULE-TESTS?", 1, 0, false);
            declareFunction("removal_module_test_name", "REMOVAL-MODULE-TEST-NAME", 1, 0, false);
            declareFunction("removal_module_test_id", "REMOVAL-MODULE-TEST-ID", 1, 0, false);
            declareFunction("removal_module_test_mt", "REMOVAL-MODULE-TEST-MT", 1, 0, false);
            declareFunction("removal_module_test_sentence", "REMOVAL-MODULE-TEST-SENTENCE", 1, 0, false);
            declareFunction("removal_module_test_owner", "REMOVAL-MODULE-TEST-OWNER", 1, 0, false);
            declareFunction("removal_module_test_comment", "REMOVAL-MODULE-TEST-COMMENT", 1, 0, false);
            declareFunction("removal_module_test_kb", "REMOVAL-MODULE-TEST-KB", 1, 0, false);
            declareFunction("removal_module_test_workingP", "REMOVAL-MODULE-TEST-WORKING?", 1, 0, false);
            declareFunction("removal_module_test_predicate", "REMOVAL-MODULE-TEST-PREDICATE", 1, 0, false);
            declareFunction("removal_module_test_mentions_invalid_constantP", "REMOVAL-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
            declareFunction("removal_module_test_invalid_constants", "REMOVAL-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false);
            declareMacro("define_removal_module_test", "DEFINE-REMOVAL-MODULE-TEST");
            declareFunction("define_removal_module_test_int", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
            declareFunction("undefine_removal_module_test_number", "UNDEFINE-REMOVAL-MODULE-TEST-NUMBER", 2, 0, false);
            declareFunction("clear_removal_module_tests", "CLEAR-REMOVAL-MODULE-TESTS", 0, 0, false);
            declareFunction("run_all_removal_module_tests", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
            declareFunction("run_removal_module_tests_for_pred", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
            declareFunction("run_removal_module_tests_browsable", "RUN-REMOVAL-MODULE-TESTS-BROWSABLE", 1, 2, false);
            declareFunction("run_removal_module_tests_blocking", "RUN-REMOVAL-MODULE-TESTS-BLOCKING", 1, 2, false);
            declareFunction("run_removal_module_tests", "RUN-REMOVAL-MODULE-TESTS", 1, 4, false);
            declareFunction("run_removal_module_tests_int", "RUN-REMOVAL-MODULE-TESTS-INT", 5, 0, false);
            declareFunction("run_removal_module_test_number_browsable", "RUN-REMOVAL-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
            declareFunction("run_removal_module_test_number_blocking", "RUN-REMOVAL-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
            declareFunction("run_removal_module_test_number", "RUN-REMOVAL-MODULE-TEST-NUMBER", 2, 4, false);
            declareFunction("run_removal_module_test", "RUN-REMOVAL-MODULE-TEST", 1, 4, false);
            declareFunction("run_removal_module_testP", "RUN-REMOVAL-MODULE-TEST?", 1, 0, false);
            declareFunction("run_removal_module_test_query", "RUN-REMOVAL-MODULE-TEST-QUERY", 2, 6, false);
            declareFunction("run_removal_module_test_query_int", "RUN-REMOVAL-MODULE-TEST-QUERY-INT", 8, 0, false);
            declareFunction("removal_module_test_query_inference", "REMOVAL-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
            declareFunction("print_removal_module_test_preamble", "PRINT-REMOVAL-MODULE-TEST-PREAMBLE", 3, 0, false);
            declareFunction("print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 5, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 4, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_module_tests_file_Previous() {
        declareFunction("removal_module_test_print_function_trampoline", "REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_module_test_p", "REMOVAL-MODULE-TEST-P", 1, 0, false);
        new removal_module_tests.$removal_module_test_p$UnaryFunction();
        declareFunction("rmt_hl_module", "RMT-HL-MODULE", 1, 0, false);
        declareFunction("rmt_id", "RMT-ID", 1, 0, false);
        declareFunction("rmt_sentence", "RMT-SENTENCE", 1, 0, false);
        declareFunction("rmt_mt", "RMT-MT", 1, 0, false);
        declareFunction("rmt_properties", "RMT-PROPERTIES", 1, 0, false);
        declareFunction("rmt_comment", "RMT-COMMENT", 1, 0, false);
        declareFunction("rmt_kb", "RMT-KB", 1, 0, false);
        declareFunction("rmt_owner", "RMT-OWNER", 1, 0, false);
        declareFunction("rmt_bug_number", "RMT-BUG-NUMBER", 1, 0, false);
        declareFunction("rmt_creation_date", "RMT-CREATION-DATE", 1, 0, false);
        declareFunction("rmt_creator", "RMT-CREATOR", 1, 0, false);
        declareFunction("rmt_workingP", "RMT-WORKING?", 1, 0, false);
        declareFunction("_csetf_rmt_hl_module", "_CSETF-RMT-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_rmt_id", "_CSETF-RMT-ID", 2, 0, false);
        declareFunction("_csetf_rmt_sentence", "_CSETF-RMT-SENTENCE", 2, 0, false);
        declareFunction("_csetf_rmt_mt", "_CSETF-RMT-MT", 2, 0, false);
        declareFunction("_csetf_rmt_properties", "_CSETF-RMT-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_rmt_comment", "_CSETF-RMT-COMMENT", 2, 0, false);
        declareFunction("_csetf_rmt_kb", "_CSETF-RMT-KB", 2, 0, false);
        declareFunction("_csetf_rmt_owner", "_CSETF-RMT-OWNER", 2, 0, false);
        declareFunction("_csetf_rmt_bug_number", "_CSETF-RMT-BUG-NUMBER", 2, 0, false);
        declareFunction("_csetf_rmt_creation_date", "_CSETF-RMT-CREATION-DATE", 2, 0, false);
        declareFunction("_csetf_rmt_creator", "_CSETF-RMT-CREATOR", 2, 0, false);
        declareFunction("_csetf_rmt_workingP", "_CSETF-RMT-WORKING?", 2, 0, false);
        declareFunction("make_removal_module_test", "MAKE-REMOVAL-MODULE-TEST", 0, 1, false);
        declareFunction("visit_defstruct_removal_module_test", "VISIT-DEFSTRUCT-REMOVAL-MODULE-TEST", 2, 0, false);
        declareFunction("visit_defstruct_object_removal_module_test_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD", 2, 0, false);
        declareFunction("removal_modules_with_removal_module_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-TESTS", 0, 0, false);
        declareFunction("removal_module_tests", "REMOVAL-MODULE-TESTS", 1, 0, false);
        declareFunction("some_removal_module_testsP", "SOME-REMOVAL-MODULE-TESTS?", 1, 0, false);
        declareFunction("removal_module_test_name", "REMOVAL-MODULE-TEST-NAME", 1, 0, false);
        declareFunction("removal_module_test_id", "REMOVAL-MODULE-TEST-ID", 1, 0, false);
        declareFunction("removal_module_test_mt", "REMOVAL-MODULE-TEST-MT", 1, 0, false);
        declareFunction("removal_module_test_sentence", "REMOVAL-MODULE-TEST-SENTENCE", 1, 0, false);
        declareFunction("removal_module_test_owner", "REMOVAL-MODULE-TEST-OWNER", 1, 0, false);
        declareFunction("removal_module_test_comment", "REMOVAL-MODULE-TEST-COMMENT", 1, 0, false);
        declareFunction("removal_module_test_kb", "REMOVAL-MODULE-TEST-KB", 1, 0, false);
        declareFunction("removal_module_test_workingP", "REMOVAL-MODULE-TEST-WORKING?", 1, 0, false);
        declareFunction("removal_module_test_predicate", "REMOVAL-MODULE-TEST-PREDICATE", 1, 0, false);
        declareFunction("removal_module_test_mentions_invalid_constantP", "REMOVAL-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction("removal_module_test_invalid_constants", "REMOVAL-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareMacro("define_removal_module_test", "DEFINE-REMOVAL-MODULE-TEST");
        declareFunction("define_removal_module_test_int", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
        declareFunction("undefine_removal_module_test_number", "UNDEFINE-REMOVAL-MODULE-TEST-NUMBER", 2, 0, false);
        declareFunction("clear_removal_module_tests", "CLEAR-REMOVAL-MODULE-TESTS", 0, 0, false);
        declareFunction("run_all_removal_module_tests", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
        declareFunction("run_removal_module_tests_for_pred", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
        declareFunction("run_removal_module_tests_browsable", "RUN-REMOVAL-MODULE-TESTS-BROWSABLE", 1, 2, false);
        declareFunction("run_removal_module_tests_blocking", "RUN-REMOVAL-MODULE-TESTS-BLOCKING", 1, 2, false);
        declareFunction("run_removal_module_tests", "RUN-REMOVAL-MODULE-TESTS", 1, 4, false);
        declareFunction("run_removal_module_tests_int", "RUN-REMOVAL-MODULE-TESTS-INT", 5, 0, false);
        declareFunction("run_removal_module_test_number_browsable", "RUN-REMOVAL-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
        declareFunction("run_removal_module_test_number_blocking", "RUN-REMOVAL-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
        declareFunction("run_removal_module_test_number", "RUN-REMOVAL-MODULE-TEST-NUMBER", 2, 4, false);
        declareFunction("run_removal_module_test", "RUN-REMOVAL-MODULE-TEST", 1, 4, false);
        declareFunction("run_removal_module_testP", "RUN-REMOVAL-MODULE-TEST?", 1, 0, false);
        declareFunction("run_removal_module_test_query", "RUN-REMOVAL-MODULE-TEST-QUERY", 2, 6, false);
        declareFunction("run_removal_module_test_query_int", "RUN-REMOVAL-MODULE-TEST-QUERY-INT", 8, 0, false);
        declareFunction("removal_module_test_query_inference", "REMOVAL-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
        declareFunction("print_removal_module_test_preamble", "PRINT-REMOVAL-MODULE-TEST-PREAMBLE", 3, 0, false);
        declareFunction("print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 5, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    public static final SubLObject init_removal_module_tests_file_alt() {
        defconstant("*DTP-REMOVAL-MODULE-TEST*", REMOVAL_MODULE_TEST);
        deflexical("*REMOVAL-MODULE-TESTS*", NIL != boundp($removal_module_tests$) ? ((SubLObject) ($removal_module_tests$.getGlobalValue())) : make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_removal_module_tests_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-REMOVAL-MODULE-TEST*", REMOVAL_MODULE_TEST);
            deflexical("*REMOVAL-MODULE-TESTS*", SubLTrampolineFile.maybeDefault($removal_module_tests$, $removal_module_tests$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*REMOVAL-MODULE-TESTS*", NIL != boundp($removal_module_tests$) ? ((SubLObject) ($removal_module_tests$.getGlobalValue())) : make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_removal_module_tests_file_Previous() {
        defconstant("*DTP-REMOVAL-MODULE-TEST*", REMOVAL_MODULE_TEST);
        deflexical("*REMOVAL-MODULE-TESTS*", SubLTrampolineFile.maybeDefault($removal_module_tests$, $removal_module_tests$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("RMT-HL-MODULE"), makeSymbol("RMT-ID"), makeSymbol("RMT-SENTENCE"), makeSymbol("RMT-MT"), makeSymbol("RMT-PROPERTIES"), makeSymbol("RMT-COMMENT"), makeSymbol("RMT-KB"), makeSymbol("RMT-OWNER"), makeSymbol("RMT-BUG-NUMBER"), makeSymbol("RMT-CREATION-DATE"), makeSymbol("RMT-CREATOR"), makeSymbol("RMT-WORKING?") });

    public static final SubLObject setup_removal_module_tests_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RMT_HL_MODULE, _CSETF_RMT_HL_MODULE);
        def_csetf(RMT_ID, _CSETF_RMT_ID);
        def_csetf(RMT_SENTENCE, _CSETF_RMT_SENTENCE);
        def_csetf(RMT_MT, _CSETF_RMT_MT);
        def_csetf(RMT_PROPERTIES, _CSETF_RMT_PROPERTIES);
        def_csetf(RMT_COMMENT, _CSETF_RMT_COMMENT);
        def_csetf(RMT_KB, _CSETF_RMT_KB);
        def_csetf(RMT_OWNER, _CSETF_RMT_OWNER);
        def_csetf(RMT_BUG_NUMBER, _CSETF_RMT_BUG_NUMBER);
        def_csetf(RMT_CREATION_DATE, _CSETF_RMT_CREATION_DATE);
        def_csetf(RMT_CREATOR, _CSETF_RMT_CREATOR);
        def_csetf($sym30$RMT_WORKING_, $sym31$_CSETF_RMT_WORKING_);
        identity(REMOVAL_MODULE_TEST);
        declare_defglobal($removal_module_tests$);
        register_cyc_api_macro(DEFINE_REMOVAL_MODULE_TEST, $list_alt51, $str_alt60$Define_a_removal_module_test_numb);
        register_external_symbol(DEFINE_REMOVAL_MODULE_TEST_INT);
        register_macro_helper(DEFINE_REMOVAL_MODULE_TEST_INT, DEFINE_REMOVAL_MODULE_TEST);
        register_external_symbol(RUN_REMOVAL_MODULE_TESTS_FOR_PRED);
        return NIL;
    }

    public static SubLObject setup_removal_module_tests_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(RMT_HL_MODULE, _CSETF_RMT_HL_MODULE);
            def_csetf(RMT_ID, _CSETF_RMT_ID);
            def_csetf(RMT_SENTENCE, _CSETF_RMT_SENTENCE);
            def_csetf(RMT_MT, _CSETF_RMT_MT);
            def_csetf(RMT_PROPERTIES, _CSETF_RMT_PROPERTIES);
            def_csetf(RMT_COMMENT, _CSETF_RMT_COMMENT);
            def_csetf(RMT_KB, _CSETF_RMT_KB);
            def_csetf(RMT_OWNER, _CSETF_RMT_OWNER);
            def_csetf(RMT_BUG_NUMBER, _CSETF_RMT_BUG_NUMBER);
            def_csetf(RMT_CREATION_DATE, _CSETF_RMT_CREATION_DATE);
            def_csetf(RMT_CREATOR, _CSETF_RMT_CREATOR);
            def_csetf($sym31$RMT_WORKING_, $sym32$_CSETF_RMT_WORKING_);
            identity(REMOVAL_MODULE_TEST);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD));
            declare_defglobal($removal_module_tests$);
            register_cyc_api_macro(DEFINE_REMOVAL_MODULE_TEST, $list57, $str66$Define_a_removal_module_test_numb);
            register_external_symbol(DEFINE_REMOVAL_MODULE_TEST_INT);
            register_macro_helper(DEFINE_REMOVAL_MODULE_TEST_INT, DEFINE_REMOVAL_MODULE_TEST);
            register_external_symbol(RUN_REMOVAL_MODULE_TESTS_FOR_PRED);
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym30$RMT_WORKING_, $sym31$_CSETF_RMT_WORKING_);
            register_cyc_api_macro(DEFINE_REMOVAL_MODULE_TEST, $list_alt51, $str_alt60$Define_a_removal_module_test_numb);
        }
        return NIL;
    }

    public static SubLObject setup_removal_module_tests_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RMT_HL_MODULE, _CSETF_RMT_HL_MODULE);
        def_csetf(RMT_ID, _CSETF_RMT_ID);
        def_csetf(RMT_SENTENCE, _CSETF_RMT_SENTENCE);
        def_csetf(RMT_MT, _CSETF_RMT_MT);
        def_csetf(RMT_PROPERTIES, _CSETF_RMT_PROPERTIES);
        def_csetf(RMT_COMMENT, _CSETF_RMT_COMMENT);
        def_csetf(RMT_KB, _CSETF_RMT_KB);
        def_csetf(RMT_OWNER, _CSETF_RMT_OWNER);
        def_csetf(RMT_BUG_NUMBER, _CSETF_RMT_BUG_NUMBER);
        def_csetf(RMT_CREATION_DATE, _CSETF_RMT_CREATION_DATE);
        def_csetf(RMT_CREATOR, _CSETF_RMT_CREATOR);
        def_csetf($sym31$RMT_WORKING_, $sym32$_CSETF_RMT_WORKING_);
        identity(REMOVAL_MODULE_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD));
        declare_defglobal($removal_module_tests$);
        register_cyc_api_macro(DEFINE_REMOVAL_MODULE_TEST, $list57, $str66$Define_a_removal_module_test_numb);
        register_external_symbol(DEFINE_REMOVAL_MODULE_TEST_INT);
        register_macro_helper(DEFINE_REMOVAL_MODULE_TEST_INT, DEFINE_REMOVAL_MODULE_TEST);
        register_external_symbol(RUN_REMOVAL_MODULE_TESTS_FOR_PRED);
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-RMT-HL-MODULE"), makeSymbol("_CSETF-RMT-ID"), makeSymbol("_CSETF-RMT-SENTENCE"), makeSymbol("_CSETF-RMT-MT"), makeSymbol("_CSETF-RMT-PROPERTIES"), makeSymbol("_CSETF-RMT-COMMENT"), makeSymbol("_CSETF-RMT-KB"), makeSymbol("_CSETF-RMT-OWNER"), makeSymbol("_CSETF-RMT-BUG-NUMBER"), makeSymbol("_CSETF-RMT-CREATION-DATE"), makeSymbol("_CSETF-RMT-CREATOR"), makeSymbol("_CSETF-RMT-WORKING?") });

    @Override
    public void declareFunctions() {
        declare_removal_module_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_module_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_module_tests_file();
    }

    static {
    }

    static private final SubLSymbol $sym30$RMT_WORKING_ = makeSymbol("RMT-WORKING?");

    static private final SubLSymbol $sym31$_CSETF_RMT_WORKING_ = makeSymbol("_CSETF-RMT-WORKING?");

    static private final SubLString $str_alt44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLSymbol $sym47$TERM__ = makeSymbol("TERM-<");

    static private final SubLSymbol $sym49$_ = makeSymbol("<");

    static private final SubLSymbol $sym50$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    static private final SubLList $list_alt51 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell("EverythingPSC")), makeSymbol("PROPERTIES"), list(makeSymbol("KB"), $TINY), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) });

    static private final SubLList $list_alt52 = list(new SubLObject[]{ makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });



    static private final SubLString $str_alt60$Define_a_removal_module_test_numb = makeString("Define a removal module test number ID for the module named NAME.\n   The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\n  PROPERTIES, if not nil, specifies additional query properties to pass in.");

    public static final SubLSymbol $kw83$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    public static final SubLSymbol $kw85$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    static private final SubLString $str_alt87$___S__S____ = makeString("~&~S ~S -> ");

    static private final SubLString $str_alt89$Unknown_output_format__A = makeString("Unknown output format ~A");

    static private final SubLString $str_alt90$_S__ = makeString("~S~%");

    static private final SubLString $str_alt91$_S__RMT___S__S___OWNER__S__ = makeString("~S :RMT (~S ~S) :OWNER ~S~%");

    public static final class $removal_module_test_p$UnaryFunction extends UnaryFunction {
        public $removal_module_test_p$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-MODULE-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_module_test_p(arg1);
        }
    }
}

/**
 * Total time: 313 ms synthetic
 */
