package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_module_tests extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.removal_module_tests";
    public static final String myFingerPrint = "3919368d5d098e3a8da35fab39693632740972e3363f6e620c8629935b0864c6";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLSymbol $dtp_removal_module_test$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1723L)
    private static SubLSymbol $removal_module_tests$;
    private static final SubLSymbol $sym0$REMOVAL_MODULE_TEST;
    private static final SubLSymbol $sym1$REMOVAL_MODULE_TEST_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RMT_HL_MODULE;
    private static final SubLSymbol $sym10$_CSETF_RMT_HL_MODULE;
    private static final SubLSymbol $sym11$RMT_ID;
    private static final SubLSymbol $sym12$_CSETF_RMT_ID;
    private static final SubLSymbol $sym13$RMT_SENTENCE;
    private static final SubLSymbol $sym14$_CSETF_RMT_SENTENCE;
    private static final SubLSymbol $sym15$RMT_MT;
    private static final SubLSymbol $sym16$_CSETF_RMT_MT;
    private static final SubLSymbol $sym17$RMT_PROPERTIES;
    private static final SubLSymbol $sym18$_CSETF_RMT_PROPERTIES;
    private static final SubLSymbol $sym19$RMT_COMMENT;
    private static final SubLSymbol $sym20$_CSETF_RMT_COMMENT;
    private static final SubLSymbol $sym21$RMT_KB;
    private static final SubLSymbol $sym22$_CSETF_RMT_KB;
    private static final SubLSymbol $sym23$RMT_OWNER;
    private static final SubLSymbol $sym24$_CSETF_RMT_OWNER;
    private static final SubLSymbol $sym25$RMT_BUG_NUMBER;
    private static final SubLSymbol $sym26$_CSETF_RMT_BUG_NUMBER;
    private static final SubLSymbol $sym27$RMT_CREATION_DATE;
    private static final SubLSymbol $sym28$_CSETF_RMT_CREATION_DATE;
    private static final SubLSymbol $sym29$RMT_CREATOR;
    private static final SubLSymbol $sym30$_CSETF_RMT_CREATOR;
    private static final SubLSymbol $sym31$RMT_WORKING_;
    private static final SubLSymbol $sym32$_CSETF_RMT_WORKING_;
    private static final SubLSymbol $kw33$HL_MODULE;
    private static final SubLSymbol $kw34$ID;
    private static final SubLSymbol $kw35$SENTENCE;
    private static final SubLSymbol $kw36$MT;
    private static final SubLSymbol $kw37$PROPERTIES;
    private static final SubLSymbol $kw38$COMMENT;
    private static final SubLSymbol $kw39$KB;
    private static final SubLSymbol $kw40$OWNER;
    private static final SubLSymbol $kw41$BUG_NUMBER;
    private static final SubLSymbol $kw42$CREATION_DATE;
    private static final SubLSymbol $kw43$CREATOR;
    private static final SubLSymbol $kw44$WORKING_;
    private static final SubLString $str45$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw46$BEGIN;
    private static final SubLSymbol $sym47$MAKE_REMOVAL_MODULE_TEST;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD;
    private static final SubLSymbol $sym51$_REMOVAL_MODULE_TESTS_;
    private static final SubLInteger $int52$100;
    private static final SubLSymbol $sym53$TERM__;
    private static final SubLSymbol $sym54$HL_MODULE_NAME;
    private static final SubLSymbol $sym55$_;
    private static final SubLSymbol $sym56$INVALID_CONSTANT_;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$ALLOW_OTHER_KEYS;
    private static final SubLObject $const60$BaseKB;
    private static final SubLSymbol $kw61$TINY;
    private static final SubLSymbol $kw62$BUG;
    private static final SubLSymbol $kw63$CREATED;
    private static final SubLSymbol $sym64$DEFINE_REMOVAL_MODULE_TEST_INT;
    private static final SubLSymbol $sym65$DEFINE_REMOVAL_MODULE_TEST;
    private static final SubLString $str66$Define_a_removal_module_test_numb;
    private static final SubLSymbol $sym67$STRINGP;
    private static final SubLSymbol $sym68$CYC_TEST_KB_P;
    private static final SubLSymbol $sym69$INFERENCE_TEST_OWNER_P;
    private static final SubLSymbol $sym70$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym71$UNIVERSAL_DATE_P;
    private static final SubLSymbol $sym72$BOOLEANP;
    private static final SubLSymbol $kw73$STANDARD;
    private static final SubLSymbol $sym74$CYC_TEST_OUTPUT_FORMAT_P;
    private static final SubLSymbol $kw75$TERSE;
    private static final SubLSymbol $kw76$RMT;
    private static final SubLSymbol $sym77$RUN_REMOVAL_MODULE_TESTS_FOR_PRED;
    private static final SubLSymbol $kw78$SUCCESS;
    private static final SubLSymbol $kw79$NOT_RUN;
    private static final SubLSymbol $kw80$INVALID;
    private static final SubLSymbol $kw81$UNSPECIFIED;
    private static final SubLSymbol $kw82$ERROR;
    private static final SubLSymbol $kw83$FAILURE;
    private static final SubLSymbol $kw84$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym85$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw86$FAILURE_BINDINGS;
    private static final SubLSymbol $kw87$FAILURE_HALT_REASON;
    private static final SubLSymbol $kw88$FAILURE_REMOVAL_MODULE;
    private static final SubLSymbol $kw89$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw90$BROWSABLE_;
    private static final SubLSymbol $kw91$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw92$NEW_TERMS_ALLOWED_;
    private static final SubLSymbol $kw93$BLOCK_;
    private static final SubLString $str94$___RMT__S__S____;
    private static final SubLSymbol $kw95$POST_BUILD;
    private static final SubLString $str96$Unknown_output_format__A;
    private static final SubLString $str97$_S____3f___;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject removal_module_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)removal_module_tests.ZERO_INTEGER);
        return (SubLObject)removal_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject removal_module_test_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $removal_module_test_native.class) ? removal_module_tests.T : removal_module_tests.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_hl_module(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_id(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_sentence(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_mt(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_properties(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_comment(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_kb(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_owner(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_bug_number(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_creation_date(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_creator(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject rmt_workingP(final SubLObject v_object) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_hl_module(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_id(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_sentence(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_mt(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_properties(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_comment(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_kb(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_owner(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_bug_number(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_creation_date(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_creator(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject _csetf_rmt_workingP(final SubLObject v_object, final SubLObject value) {
        assert removal_module_tests.NIL != removal_module_test_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject make_removal_module_test(SubLObject arglist) {
        if (arglist == removal_module_tests.UNPROVIDED) {
            arglist = (SubLObject)removal_module_tests.NIL;
        }
        final SubLObject v_new = (SubLObject)new $removal_module_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)removal_module_tests.NIL, next = arglist; removal_module_tests.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)removal_module_tests.$kw33$HL_MODULE)) {
                _csetf_rmt_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw34$ID)) {
                _csetf_rmt_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw35$SENTENCE)) {
                _csetf_rmt_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw36$MT)) {
                _csetf_rmt_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw37$PROPERTIES)) {
                _csetf_rmt_properties(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw38$COMMENT)) {
                _csetf_rmt_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw39$KB)) {
                _csetf_rmt_kb(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw40$OWNER)) {
                _csetf_rmt_owner(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw41$BUG_NUMBER)) {
                _csetf_rmt_bug_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw42$CREATION_DATE)) {
                _csetf_rmt_creation_date(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw43$CREATOR)) {
                _csetf_rmt_creator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_tests.$kw44$WORKING_)) {
                _csetf_rmt_workingP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)removal_module_tests.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject visit_defstruct_removal_module_test(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw46$BEGIN, (SubLObject)removal_module_tests.$sym47$MAKE_REMOVAL_MODULE_TEST, (SubLObject)removal_module_tests.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw33$HL_MODULE, rmt_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw34$ID, rmt_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw35$SENTENCE, rmt_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw36$MT, rmt_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw37$PROPERTIES, rmt_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw38$COMMENT, rmt_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw39$KB, rmt_kb(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw40$OWNER, rmt_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw41$BUG_NUMBER, rmt_bug_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw42$CREATION_DATE, rmt_creation_date(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw43$CREATOR, rmt_creator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw48$SLOT, (SubLObject)removal_module_tests.$kw44$WORKING_, rmt_workingP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_tests.$kw49$END, (SubLObject)removal_module_tests.$sym47$MAKE_REMOVAL_MODULE_TEST, (SubLObject)removal_module_tests.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1548L)
    public static SubLObject visit_defstruct_object_removal_module_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_module_test(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1797L)
    public static SubLObject removal_modules_with_removal_module_tests() {
        SubLObject hl_modules = hash_table_utilities.hash_table_keys(removal_module_tests.$removal_module_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, Symbols.symbol_function((SubLObject)removal_module_tests.$sym53$TERM__), Symbols.symbol_function((SubLObject)removal_module_tests.$sym54$HL_MODULE_NAME));
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2093L)
    public static SubLObject removal_module_tests(final SubLObject hl_module) {
        SubLObject tests = conses_high.copy_list(Hashtables.gethash(hl_module, removal_module_tests.$removal_module_tests$.getGlobalValue(), (SubLObject)removal_module_tests.UNPROVIDED));
        tests = Sort.sort(tests, Symbols.symbol_function((SubLObject)removal_module_tests.$sym55$_), Symbols.symbol_function((SubLObject)removal_module_tests.$sym11$RMT_ID));
        return tests;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2346L)
    public static SubLObject some_removal_module_testsP(final SubLObject hl_module) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(hl_module, removal_module_tests.$removal_module_tests$.getGlobalValue(), (SubLObject)removal_module_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2533L)
    public static SubLObject removal_module_test_name(final SubLObject rmt) {
        return (SubLObject)ConsesLow.list(inference_modules.hl_module_name(rmt_hl_module(rmt)), rmt_id(rmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2649L)
    public static SubLObject removal_module_test_id(final SubLObject rmt) {
        return rmt_id(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2719L)
    public static SubLObject removal_module_test_mt(final SubLObject rmt) {
        return rmt_mt(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2789L)
    public static SubLObject removal_module_test_sentence(final SubLObject rmt) {
        return rmt_sentence(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2871L)
    public static SubLObject removal_module_test_owner(final SubLObject rmt) {
        return rmt_owner(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 2947L)
    public static SubLObject removal_module_test_comment(final SubLObject rmt) {
        return rmt_comment(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 3027L)
    public static SubLObject removal_module_test_kb(final SubLObject rmt) {
        return rmt_kb(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 3097L)
    public static SubLObject removal_module_test_workingP(final SubLObject rmt) {
        return rmt_workingP(rmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 3179L)
    public static SubLObject removal_module_test_predicate(final SubLObject rmt) {
        final SubLObject hl_module = rmt_hl_module(rmt);
        if (removal_module_tests.NIL != hl_module) {
            final SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
            return predicate;
        }
        return (SubLObject)removal_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 3376L)
    public static SubLObject removal_module_test_mentions_invalid_constantP(final SubLObject rmt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_module_tests.NIL != list_utilities.tree_find_if((SubLObject)removal_module_tests.$sym56$INVALID_CONSTANT_, removal_module_test_mt(rmt), (SubLObject)removal_module_tests.UNPROVIDED) || removal_module_tests.NIL != list_utilities.tree_find_if((SubLObject)removal_module_tests.$sym56$INVALID_CONSTANT_, removal_module_test_sentence(rmt), (SubLObject)removal_module_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 3600L)
    public static SubLObject removal_module_test_invalid_constants(final SubLObject rmt) {
        return Sequences.remove_duplicates(ConsesLow.append(cycl_utilities.expression_gather(removal_module_test_mt(rmt), (SubLObject)removal_module_tests.$sym56$INVALID_CONSTANT_, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED), cycl_utilities.expression_gather(removal_module_test_sentence(rmt), (SubLObject)removal_module_tests.$sym56$INVALID_CONSTANT_, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED)), (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 3849L)
    public static SubLObject define_removal_module_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)removal_module_tests.NIL;
        SubLObject id = (SubLObject)removal_module_tests.NIL;
        SubLObject sentence = (SubLObject)removal_module_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_module_tests.$list57);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_module_tests.$list57);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_module_tests.$list57);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)removal_module_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)removal_module_tests.NIL;
        SubLObject current_$1 = (SubLObject)removal_module_tests.NIL;
        while (removal_module_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_module_tests.$list57);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_module_tests.$list57);
            if (removal_module_tests.NIL == conses_high.member(current_$1, (SubLObject)removal_module_tests.$list58, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED)) {
                bad = (SubLObject)removal_module_tests.T;
            }
            if (current_$1 == removal_module_tests.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (removal_module_tests.NIL != bad && removal_module_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_module_tests.$list57);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw36$MT, current);
        final SubLObject mt = (removal_module_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : removal_module_tests.$const60$BaseKB;
        final SubLObject properties_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw37$PROPERTIES, current);
        final SubLObject v_properties = (SubLObject)((removal_module_tests.NIL != properties_tail) ? conses_high.cadr(properties_tail) : removal_module_tests.NIL);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw39$KB, current);
        final SubLObject kb = (SubLObject)((removal_module_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : removal_module_tests.$kw61$TINY);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw40$OWNER, current);
        final SubLObject owner = (SubLObject)((removal_module_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : removal_module_tests.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw38$COMMENT, current);
        final SubLObject comment = (SubLObject)((removal_module_tests.NIL != comment_tail) ? conses_high.cadr(comment_tail) : removal_module_tests.NIL);
        final SubLObject bug_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw62$BUG, current);
        final SubLObject bug = (SubLObject)((removal_module_tests.NIL != bug_tail) ? conses_high.cadr(bug_tail) : removal_module_tests.NIL);
        final SubLObject created_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw63$CREATED, current);
        final SubLObject created = (SubLObject)((removal_module_tests.NIL != created_tail) ? conses_high.cadr(created_tail) : removal_module_tests.NIL);
        final SubLObject creator_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw43$CREATOR, current);
        final SubLObject creator = (SubLObject)((removal_module_tests.NIL != creator_tail) ? conses_high.cadr(creator_tail) : removal_module_tests.NIL);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_tests.$kw44$WORKING_, current);
        final SubLObject workingP = (SubLObject)((removal_module_tests.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : removal_module_tests.T);
        return (SubLObject)ConsesLow.list(new SubLObject[] { removal_module_tests.$sym64$DEFINE_REMOVAL_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 4553L)
    public static SubLObject define_removal_module_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_module_tests.NIL != comment && !removal_module_tests.assertionsDisabledInClass && removal_module_tests.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        assert removal_module_tests.NIL != cyc_testing.cyc_test_kb_p(kb) : kb;
        assert removal_module_tests.NIL != inference_testing.inference_test_owner_p(owner) : owner;
        if (removal_module_tests.NIL != bug_number && !removal_module_tests.assertionsDisabledInClass && removal_module_tests.NIL == subl_promotions.positive_integer_p(bug_number)) {
            throw new AssertionError(bug_number);
        }
        if (removal_module_tests.NIL != creation_date && !removal_module_tests.assertionsDisabledInClass && removal_module_tests.NIL == numeric_date_utilities.universal_date_p(creation_date)) {
            throw new AssertionError(creation_date);
        }
        if (removal_module_tests.NIL != creator && !removal_module_tests.assertionsDisabledInClass && removal_module_tests.NIL == Types.stringp(creator)) {
            throw new AssertionError(creator);
        }
        assert removal_module_tests.NIL != Types.booleanp(workingP) : workingP;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (removal_module_tests.NIL != inference_modules.removal_module_p(hl_module)) {
            final SubLObject test = make_removal_module_test((SubLObject)ConsesLow.list(new SubLObject[] { removal_module_tests.$kw33$HL_MODULE, hl_module, removal_module_tests.$kw34$ID, id, removal_module_tests.$kw35$SENTENCE, sentence, removal_module_tests.$kw36$MT, mt, removal_module_tests.$kw37$PROPERTIES, v_properties, removal_module_tests.$kw38$COMMENT, comment, removal_module_tests.$kw39$KB, kb, removal_module_tests.$kw40$OWNER, owner, removal_module_tests.$kw41$BUG_NUMBER, bug_number, removal_module_tests.$kw42$CREATION_DATE, creation_date, removal_module_tests.$kw43$CREATOR, creator, removal_module_tests.$kw44$WORKING_, workingP }));
            SubLObject existing_tests = Hashtables.gethash(hl_module, removal_module_tests.$removal_module_tests$.getGlobalValue(), (SubLObject)removal_module_tests.UNPROVIDED);
            existing_tests = Sequences.delete(id, existing_tests, Symbols.symbol_function((SubLObject)removal_module_tests.EQL), Symbols.symbol_function((SubLObject)removal_module_tests.$sym11$RMT_ID), (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED);
            existing_tests = (SubLObject)ConsesLow.cons(test, existing_tests);
            Hashtables.sethash(hl_module, removal_module_tests.$removal_module_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return (SubLObject)removal_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 5750L)
    public static SubLObject undefine_removal_module_test_number(final SubLObject name, final SubLObject number) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject existing_tests = Hashtables.gethash(hl_module, removal_module_tests.$removal_module_tests$.getGlobalValue(), (SubLObject)removal_module_tests.UNPROVIDED);
        existing_tests = Sequences.delete(number, existing_tests, Symbols.symbol_function((SubLObject)removal_module_tests.EQL), Symbols.symbol_function((SubLObject)removal_module_tests.$sym11$RMT_ID), (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED);
        Hashtables.sethash(hl_module, removal_module_tests.$removal_module_tests$.getGlobalValue(), existing_tests);
        return Sequences.length(existing_tests);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 6101L)
    public static SubLObject clear_removal_module_tests() {
        Hashtables.clrhash(removal_module_tests.$removal_module_tests$.getGlobalValue());
        return (SubLObject)removal_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 6195L)
    public static SubLObject run_all_removal_module_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == removal_module_tests.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == removal_module_tests.UNPROVIDED) {
            return_test_runsP = (SubLObject)removal_module_tests.NIL;
        }
        assert removal_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, (SubLObject)removal_module_tests.$kw75$TERSE, (SubLObject)removal_module_tests.NIL, output_format, run_tiny_kb_tests_in_full_kbP, (SubLObject)removal_module_tests.NIL, return_test_runsP, (SubLObject)removal_module_tests.$kw76$RMT, (SubLObject)removal_module_tests.NIL, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 7159L)
    public static SubLObject run_removal_module_tests_for_pred(final SubLObject pred, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == removal_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)removal_module_tests.NIL;
        }
        if (blockP == removal_module_tests.UNPROVIDED) {
            blockP = (SubLObject)removal_module_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject hl_modules = inference_modules.removal_modules_specific(pred);
        SubLObject result = (SubLObject)removal_module_tests.$kw78$SUCCESS;
        SubLObject test_runs = (SubLObject)removal_module_tests.NIL;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = (SubLObject)removal_module_tests.NIL;
        hl_module = cdolist_list_var.first();
        while (removal_module_tests.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
            final SubLObject partial_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = ConsesLow.nconc(test_runs, partial_test_runs);
            if (partial_result != removal_module_tests.$kw78$SUCCESS) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return Values.values(result, test_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 8286L)
    public static SubLObject run_removal_module_tests_browsable(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_tests(name, output_format, stream, (SubLObject)removal_module_tests.T, (SubLObject)removal_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 8487L)
    public static SubLObject run_removal_module_tests_blocking(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_tests(name, output_format, stream, (SubLObject)removal_module_tests.T, (SubLObject)removal_module_tests.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 8689L)
    public static SubLObject run_removal_module_tests(final SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == removal_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)removal_module_tests.NIL;
        }
        if (blockP == removal_module_tests.UNPROVIDED) {
            blockP = (SubLObject)removal_module_tests.NIL;
        }
        assert removal_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (removal_module_tests.NIL != inference_modules.removal_module_p(hl_module)) {
            return run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
        }
        return (SubLObject)removal_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 9537L)
    public static SubLObject run_removal_module_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_module_tests.$kw78$SUCCESS;
        SubLObject test_runs = (SubLObject)removal_module_tests.NIL;
        SubLObject cdolist_list_var = removal_module_tests(hl_module);
        SubLObject rmt = (SubLObject)removal_module_tests.NIL;
        rmt = cdolist_list_var.first();
        while (removal_module_tests.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
            if (partial_result != removal_module_tests.$kw78$SUCCESS && partial_result != removal_module_tests.$kw79$NOT_RUN) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rmt = cdolist_list_var.first();
        }
        return Values.values(result, Sequences.nreverse(test_runs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 10068L)
    public static SubLObject run_removal_module_test_number_browsable(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_test_number(name, number, output_format, stream, (SubLObject)removal_module_tests.T, (SubLObject)removal_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 10280L)
    public static SubLObject run_removal_module_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_test_number(name, number, output_format, stream, (SubLObject)removal_module_tests.T, (SubLObject)removal_module_tests.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 10492L)
    public static SubLObject run_removal_module_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == removal_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)removal_module_tests.NIL;
        }
        if (blockP == removal_module_tests.UNPROVIDED) {
            blockP = (SubLObject)removal_module_tests.NIL;
        }
        assert removal_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject test = (SubLObject)removal_module_tests.NIL;
        if (removal_module_tests.NIL != inference_modules.removal_module_p(hl_module) && removal_module_tests.NIL == test) {
            SubLObject csome_list_var = removal_module_tests(hl_module);
            SubLObject rmt = (SubLObject)removal_module_tests.NIL;
            rmt = csome_list_var.first();
            while (removal_module_tests.NIL == test && removal_module_tests.NIL != csome_list_var) {
                if (number.numE(rmt_id(rmt))) {
                    test = rmt;
                }
                csome_list_var = csome_list_var.rest();
                rmt = csome_list_var.first();
            }
        }
        return run_removal_module_test(test, output_format, stream, browsableP, blockP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 11038L)
    public static SubLObject run_removal_module_test(final SubLObject rmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == removal_module_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_tests.$kw73$STANDARD;
        }
        if (stream == removal_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == removal_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)removal_module_tests.NIL;
        }
        if (blockP == removal_module_tests.UNPROVIDED) {
            blockP = (SubLObject)removal_module_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_module_tests.NIL != removal_module_test_p(rmt) : rmt;
        assert removal_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject name = removal_module_test_name(rmt);
        SubLObject time = (SubLObject)removal_module_tests.NIL;
        SubLObject result = (SubLObject)removal_module_tests.NIL;
        if (removal_module_tests.NIL == run_removal_module_testP(rmt)) {
            result = (SubLObject)removal_module_tests.$kw79$NOT_RUN;
        }
        else if (removal_module_tests.NIL != removal_module_test_mentions_invalid_constantP(rmt)) {
            result = (SubLObject)removal_module_tests.$kw80$INVALID;
        }
        else {
            final SubLObject hl_module = rmt_hl_module(rmt);
            final SubLObject sentence = rmt_sentence(rmt);
            final SubLObject mt = rmt_mt(rmt);
            final SubLObject v_properties = rmt_properties(rmt);
            final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)removal_module_tests.NIL, thread);
                print_removal_module_test_preamble(rmt, output_format, stream);
                thread.resetMultipleValues();
                final SubLObject result_$2 = run_removal_module_test_query(hl_module, sentence, mt, v_properties, browsableP, blockP, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED);
                final SubLObject time_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$2;
                time = time_$3;
                print_removal_module_test_result(rmt, result, time, output_format, stream);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject test_run = cyc_testing.new_cyc_test_run((SubLObject)removal_module_tests.$kw76$RMT, name, result, time);
        return Values.values(result, test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 12485L)
    public static SubLObject run_removal_module_testP(final SubLObject rmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = rmt_kb(rmt);
        if (removal_module_tests.NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return (SubLObject)removal_module_tests.NIL;
        }
        return (SubLObject)removal_module_tests.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 12878L)
    public static SubLObject run_removal_module_test_query(final SubLObject hl_module, final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject browsableP, SubLObject blockP, SubLObject expected_result, SubLObject expected_halt_reason) {
        if (mt == removal_module_tests.UNPROVIDED) {
            mt = (SubLObject)removal_module_tests.NIL;
        }
        if (v_properties == removal_module_tests.UNPROVIDED) {
            v_properties = (SubLObject)removal_module_tests.NIL;
        }
        if (browsableP == removal_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)removal_module_tests.NIL;
        }
        if (blockP == removal_module_tests.UNPROVIDED) {
            blockP = (SubLObject)removal_module_tests.NIL;
        }
        if (expected_result == removal_module_tests.UNPROVIDED) {
            expected_result = (SubLObject)removal_module_tests.$kw81$UNSPECIFIED;
        }
        if (expected_halt_reason == removal_module_tests.UNPROVIDED) {
            expected_halt_reason = (SubLObject)removal_module_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subresult = run_removal_module_test_query_int(hl_module, sentence, mt, v_properties, browsableP, blockP, expected_result, expected_halt_reason);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = subresult;
        if (pcase_var.eql((SubLObject)removal_module_tests.$kw82$ERROR)) {
            return Values.values(subresult, time);
        }
        if (pcase_var.eql((SubLObject)removal_module_tests.$kw78$SUCCESS)) {
            return Values.values(subresult, time);
        }
        return Values.values((SubLObject)removal_module_tests.$kw83$FAILURE, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 13437L)
    public static SubLObject run_removal_module_test_query_int(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject browsableP, final SubLObject blockP, final SubLObject expected_result, final SubLObject expected_halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)removal_module_tests.$kw82$ERROR;
        SubLObject time = (SubLObject)removal_module_tests.NIL;
        SubLObject ignore_errors_tag = (SubLObject)removal_module_tests.NIL;
        try {
            thread.throwStack.push(removal_module_tests.$kw84$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)removal_module_tests.$sym85$IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject inference = removal_module_test_query_inference(sentence, mt, v_properties, blockP);
                    final SubLObject inference_time = thread.secondMultipleValue();
                    final SubLObject result = thread.thirdMultipleValue();
                    final SubLObject halt_reason = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (removal_module_tests.$kw81$UNSPECIFIED != expected_result && removal_module_tests.NIL == bindings.lists_of_binding_lists_equalP(result, expected_result)) {
                        v_answer = (SubLObject)removal_module_tests.$kw86$FAILURE_BINDINGS;
                    }
                    else if (removal_module_tests.NIL != expected_halt_reason && !halt_reason.equal(expected_halt_reason)) {
                        v_answer = (SubLObject)removal_module_tests.$kw87$FAILURE_HALT_REASON;
                    }
                    else if (removal_module_tests.NIL == inference_utilities.inference_some_proof_uses_removal_moduleP(inference, hl_module)) {
                        v_answer = (SubLObject)removal_module_tests.$kw88$FAILURE_REMOVAL_MODULE;
                    }
                    else {
                        v_answer = (SubLObject)removal_module_tests.$kw78$SUCCESS;
                    }
                    if (removal_module_tests.NIL == browsableP) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)removal_module_tests.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_module_tests.$kw84$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_answer, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 14368L)
    public static SubLObject removal_module_test_query_inference(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP) {
        if (mt == removal_module_tests.UNPROVIDED) {
            mt = (SubLObject)removal_module_tests.NIL;
        }
        if (v_properties == removal_module_tests.UNPROVIDED) {
            v_properties = (SubLObject)removal_module_tests.NIL;
        }
        if (blockP == removal_module_tests.UNPROVIDED) {
            blockP = (SubLObject)removal_module_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
        v_properties = conses_high.copy_list(v_properties);
        v_properties = conses_high.putf(v_properties, (SubLObject)removal_module_tests.$kw89$CONDITIONAL_SENTENCE_, conditionalP);
        v_properties = conses_high.putf(v_properties, (SubLObject)removal_module_tests.$kw90$BROWSABLE_, (SubLObject)removal_module_tests.T);
        v_properties = conses_high.putf(v_properties, (SubLObject)removal_module_tests.$kw91$CACHE_INFERENCE_RESULTS_, (SubLObject)removal_module_tests.NIL);
        v_properties = conses_high.putf(v_properties, (SubLObject)removal_module_tests.$kw92$NEW_TERMS_ALLOWED_, (SubLObject)removal_module_tests.T);
        if (removal_module_tests.NIL != blockP) {
            v_properties = conses_high.putf(v_properties, (SubLObject)removal_module_tests.$kw93$BLOCK_, (SubLObject)removal_module_tests.T);
        }
        SubLObject time = (SubLObject)removal_module_tests.NIL;
        SubLObject result = (SubLObject)removal_module_tests.NIL;
        SubLObject halt_reason = (SubLObject)removal_module_tests.NIL;
        SubLObject inference = (SubLObject)removal_module_tests.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject result_$4 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_$5 = thread.secondMultipleValue();
        final SubLObject inference_$6 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = result_$4;
        halt_reason = halt_reason_$5;
        inference = inference_$6;
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(inference, time, result, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 15237L)
    public static SubLObject print_removal_module_test_preamble(final SubLObject rmt, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)removal_module_tests.$kw73$STANDARD)) {
            final SubLObject hl_module = rmt_hl_module(rmt);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = rmt_id(rmt);
            PrintLow.format(stream, (SubLObject)removal_module_tests.$str94$___RMT__S__S____, name, id);
            streams_high.force_output(stream);
        }
        else if (!output_format.eql((SubLObject)removal_module_tests.$kw95$POST_BUILD)) {
            PrintLow.format(stream, (SubLObject)removal_module_tests.$str96$Unknown_output_format__A, output_format);
        }
        return (SubLObject)removal_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 15662L)
    public static SubLObject print_removal_module_test_result(final SubLObject rmt, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)removal_module_tests.$kw73$STANDARD)) {
            PrintLow.format(stream, (SubLObject)removal_module_tests.$str97$_S____3f___, result, time);
            streams_high.force_output(stream);
        }
        else if (output_format.eql((SubLObject)removal_module_tests.$kw95$POST_BUILD)) {
            final SubLObject hl_module = rmt_hl_module(rmt);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = rmt_id(rmt);
            final SubLObject owner = rmt_owner(rmt);
            cyc_testing.print_post_build_test_summary(stream, result, (SubLObject)removal_module_tests.$kw76$RMT, (SubLObject)ConsesLow.list(name, id), time, owner);
        }
        else {
            PrintLow.format(stream, (SubLObject)removal_module_tests.$str96$Unknown_output_format__A, output_format);
        }
        return (SubLObject)removal_module_tests.NIL;
    }
    
    public static SubLObject declare_removal_module_tests_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_print_function_trampoline", "REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_p", "REMOVAL-MODULE-TEST-P", 1, 0, false);
        new $removal_module_test_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_hl_module", "RMT-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_id", "RMT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_sentence", "RMT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_mt", "RMT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_properties", "RMT-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_comment", "RMT-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_kb", "RMT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_owner", "RMT-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_bug_number", "RMT-BUG-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_creation_date", "RMT-CREATION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_creator", "RMT-CREATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "rmt_workingP", "RMT-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_hl_module", "_CSETF-RMT-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_id", "_CSETF-RMT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_sentence", "_CSETF-RMT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_mt", "_CSETF-RMT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_properties", "_CSETF-RMT-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_comment", "_CSETF-RMT-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_kb", "_CSETF-RMT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_owner", "_CSETF-RMT-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_bug_number", "_CSETF-RMT-BUG-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_creation_date", "_CSETF-RMT-CREATION-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_creator", "_CSETF-RMT-CREATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "_csetf_rmt_workingP", "_CSETF-RMT-WORKING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "make_removal_module_test", "MAKE-REMOVAL-MODULE-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "visit_defstruct_removal_module_test", "VISIT-DEFSTRUCT-REMOVAL-MODULE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "visit_defstruct_object_removal_module_test_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_modules_with_removal_module_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_tests", "REMOVAL-MODULE-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "some_removal_module_testsP", "SOME-REMOVAL-MODULE-TESTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_name", "REMOVAL-MODULE-TEST-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_id", "REMOVAL-MODULE-TEST-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_mt", "REMOVAL-MODULE-TEST-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_sentence", "REMOVAL-MODULE-TEST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_owner", "REMOVAL-MODULE-TEST-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_comment", "REMOVAL-MODULE-TEST-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_kb", "REMOVAL-MODULE-TEST-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_workingP", "REMOVAL-MODULE-TEST-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_predicate", "REMOVAL-MODULE-TEST-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_mentions_invalid_constantP", "REMOVAL-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_invalid_constants", "REMOVAL-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "define_removal_module_test", "DEFINE-REMOVAL-MODULE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "define_removal_module_test_int", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "undefine_removal_module_test_number", "UNDEFINE-REMOVAL-MODULE-TEST-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "clear_removal_module_tests", "CLEAR-REMOVAL-MODULE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_all_removal_module_tests", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_tests_for_pred", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_tests_browsable", "RUN-REMOVAL-MODULE-TESTS-BROWSABLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_tests_blocking", "RUN-REMOVAL-MODULE-TESTS-BLOCKING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_tests", "RUN-REMOVAL-MODULE-TESTS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_tests_int", "RUN-REMOVAL-MODULE-TESTS-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_test_number_browsable", "RUN-REMOVAL-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_test_number_blocking", "RUN-REMOVAL-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_test_number", "RUN-REMOVAL-MODULE-TEST-NUMBER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_test", "RUN-REMOVAL-MODULE-TEST", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_testP", "RUN-REMOVAL-MODULE-TEST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_test_query", "RUN-REMOVAL-MODULE-TEST-QUERY", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "run_removal_module_test_query_int", "RUN-REMOVAL-MODULE-TEST-QUERY-INT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "removal_module_test_query_inference", "REMOVAL-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "print_removal_module_test_preamble", "PRINT-REMOVAL-MODULE-TEST-PREAMBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_tests", "print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 5, 0, false);
        return (SubLObject)removal_module_tests.NIL;
    }
    
    public static SubLObject init_removal_module_tests_file() {
        removal_module_tests.$dtp_removal_module_test$ = SubLFiles.defconstant("*DTP-REMOVAL-MODULE-TEST*", (SubLObject)removal_module_tests.$sym0$REMOVAL_MODULE_TEST);
        removal_module_tests.$removal_module_tests$ = SubLFiles.deflexical("*REMOVAL-MODULE-TESTS*", maybeDefault((SubLObject)removal_module_tests.$sym51$_REMOVAL_MODULE_TESTS_, removal_module_tests.$removal_module_tests$, ()->(Hashtables.make_hash_table((SubLObject)removal_module_tests.$int52$100, (SubLObject)removal_module_tests.UNPROVIDED, (SubLObject)removal_module_tests.UNPROVIDED))));
        return (SubLObject)removal_module_tests.NIL;
    }
    
    public static SubLObject setup_removal_module_tests_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), removal_module_tests.$dtp_removal_module_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_module_tests.$sym7$REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)removal_module_tests.$list8);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym9$RMT_HL_MODULE, (SubLObject)removal_module_tests.$sym10$_CSETF_RMT_HL_MODULE);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym11$RMT_ID, (SubLObject)removal_module_tests.$sym12$_CSETF_RMT_ID);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym13$RMT_SENTENCE, (SubLObject)removal_module_tests.$sym14$_CSETF_RMT_SENTENCE);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym15$RMT_MT, (SubLObject)removal_module_tests.$sym16$_CSETF_RMT_MT);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym17$RMT_PROPERTIES, (SubLObject)removal_module_tests.$sym18$_CSETF_RMT_PROPERTIES);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym19$RMT_COMMENT, (SubLObject)removal_module_tests.$sym20$_CSETF_RMT_COMMENT);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym21$RMT_KB, (SubLObject)removal_module_tests.$sym22$_CSETF_RMT_KB);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym23$RMT_OWNER, (SubLObject)removal_module_tests.$sym24$_CSETF_RMT_OWNER);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym25$RMT_BUG_NUMBER, (SubLObject)removal_module_tests.$sym26$_CSETF_RMT_BUG_NUMBER);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym27$RMT_CREATION_DATE, (SubLObject)removal_module_tests.$sym28$_CSETF_RMT_CREATION_DATE);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym29$RMT_CREATOR, (SubLObject)removal_module_tests.$sym30$_CSETF_RMT_CREATOR);
        Structures.def_csetf((SubLObject)removal_module_tests.$sym31$RMT_WORKING_, (SubLObject)removal_module_tests.$sym32$_CSETF_RMT_WORKING_);
        Equality.identity((SubLObject)removal_module_tests.$sym0$REMOVAL_MODULE_TEST);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), removal_module_tests.$dtp_removal_module_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_module_tests.$sym50$VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)removal_module_tests.$sym51$_REMOVAL_MODULE_TESTS_);
        utilities_macros.register_cyc_api_macro((SubLObject)removal_module_tests.$sym65$DEFINE_REMOVAL_MODULE_TEST, (SubLObject)removal_module_tests.$list57, (SubLObject)removal_module_tests.$str66$Define_a_removal_module_test_numb);
        access_macros.register_external_symbol((SubLObject)removal_module_tests.$sym64$DEFINE_REMOVAL_MODULE_TEST_INT);
        access_macros.register_macro_helper((SubLObject)removal_module_tests.$sym64$DEFINE_REMOVAL_MODULE_TEST_INT, (SubLObject)removal_module_tests.$sym65$DEFINE_REMOVAL_MODULE_TEST);
        access_macros.register_external_symbol((SubLObject)removal_module_tests.$sym77$RUN_REMOVAL_MODULE_TESTS_FOR_PRED);
        return (SubLObject)removal_module_tests.NIL;
    }
    
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
        me = (SubLFile)new removal_module_tests();
        removal_module_tests.$dtp_removal_module_test$ = null;
        removal_module_tests.$removal_module_tests$ = null;
        $sym0$REMOVAL_MODULE_TEST = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-TEST");
        $sym1$REMOVAL_MODULE_TEST_P = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-TEST-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("PROPERTIES"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("KB"), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("BUG-NUMBER"), SubLObjectFactory.makeSymbol("CREATION-DATE"), SubLObjectFactory.makeSymbol("CREATOR"), SubLObjectFactory.makeSymbol("WORKING?") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HL-MODULE"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("BUG-NUMBER"), SubLObjectFactory.makeKeyword("CREATION-DATE"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RMT-HL-MODULE"), SubLObjectFactory.makeSymbol("RMT-ID"), SubLObjectFactory.makeSymbol("RMT-SENTENCE"), SubLObjectFactory.makeSymbol("RMT-MT"), SubLObjectFactory.makeSymbol("RMT-PROPERTIES"), SubLObjectFactory.makeSymbol("RMT-COMMENT"), SubLObjectFactory.makeSymbol("RMT-KB"), SubLObjectFactory.makeSymbol("RMT-OWNER"), SubLObjectFactory.makeSymbol("RMT-BUG-NUMBER"), SubLObjectFactory.makeSymbol("RMT-CREATION-DATE"), SubLObjectFactory.makeSymbol("RMT-CREATOR"), SubLObjectFactory.makeSymbol("RMT-WORKING?") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-RMT-HL-MODULE"), SubLObjectFactory.makeSymbol("_CSETF-RMT-ID"), SubLObjectFactory.makeSymbol("_CSETF-RMT-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-RMT-MT"), SubLObjectFactory.makeSymbol("_CSETF-RMT-PROPERTIES"), SubLObjectFactory.makeSymbol("_CSETF-RMT-COMMENT"), SubLObjectFactory.makeSymbol("_CSETF-RMT-KB"), SubLObjectFactory.makeSymbol("_CSETF-RMT-OWNER"), SubLObjectFactory.makeSymbol("_CSETF-RMT-BUG-NUMBER"), SubLObjectFactory.makeSymbol("_CSETF-RMT-CREATION-DATE"), SubLObjectFactory.makeSymbol("_CSETF-RMT-CREATOR"), SubLObjectFactory.makeSymbol("_CSETF-RMT-WORKING?") });
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MODULE-TEST-P"));
        $sym9$RMT_HL_MODULE = SubLObjectFactory.makeSymbol("RMT-HL-MODULE");
        $sym10$_CSETF_RMT_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-RMT-HL-MODULE");
        $sym11$RMT_ID = SubLObjectFactory.makeSymbol("RMT-ID");
        $sym12$_CSETF_RMT_ID = SubLObjectFactory.makeSymbol("_CSETF-RMT-ID");
        $sym13$RMT_SENTENCE = SubLObjectFactory.makeSymbol("RMT-SENTENCE");
        $sym14$_CSETF_RMT_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-RMT-SENTENCE");
        $sym15$RMT_MT = SubLObjectFactory.makeSymbol("RMT-MT");
        $sym16$_CSETF_RMT_MT = SubLObjectFactory.makeSymbol("_CSETF-RMT-MT");
        $sym17$RMT_PROPERTIES = SubLObjectFactory.makeSymbol("RMT-PROPERTIES");
        $sym18$_CSETF_RMT_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-RMT-PROPERTIES");
        $sym19$RMT_COMMENT = SubLObjectFactory.makeSymbol("RMT-COMMENT");
        $sym20$_CSETF_RMT_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-RMT-COMMENT");
        $sym21$RMT_KB = SubLObjectFactory.makeSymbol("RMT-KB");
        $sym22$_CSETF_RMT_KB = SubLObjectFactory.makeSymbol("_CSETF-RMT-KB");
        $sym23$RMT_OWNER = SubLObjectFactory.makeSymbol("RMT-OWNER");
        $sym24$_CSETF_RMT_OWNER = SubLObjectFactory.makeSymbol("_CSETF-RMT-OWNER");
        $sym25$RMT_BUG_NUMBER = SubLObjectFactory.makeSymbol("RMT-BUG-NUMBER");
        $sym26$_CSETF_RMT_BUG_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-RMT-BUG-NUMBER");
        $sym27$RMT_CREATION_DATE = SubLObjectFactory.makeSymbol("RMT-CREATION-DATE");
        $sym28$_CSETF_RMT_CREATION_DATE = SubLObjectFactory.makeSymbol("_CSETF-RMT-CREATION-DATE");
        $sym29$RMT_CREATOR = SubLObjectFactory.makeSymbol("RMT-CREATOR");
        $sym30$_CSETF_RMT_CREATOR = SubLObjectFactory.makeSymbol("_CSETF-RMT-CREATOR");
        $sym31$RMT_WORKING_ = SubLObjectFactory.makeSymbol("RMT-WORKING?");
        $sym32$_CSETF_RMT_WORKING_ = SubLObjectFactory.makeSymbol("_CSETF-RMT-WORKING?");
        $kw33$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw34$ID = SubLObjectFactory.makeKeyword("ID");
        $kw35$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw36$MT = SubLObjectFactory.makeKeyword("MT");
        $kw37$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $kw38$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw39$KB = SubLObjectFactory.makeKeyword("KB");
        $kw40$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw41$BUG_NUMBER = SubLObjectFactory.makeKeyword("BUG-NUMBER");
        $kw42$CREATION_DATE = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $kw43$CREATOR = SubLObjectFactory.makeKeyword("CREATOR");
        $kw44$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $str45$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw46$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym47$MAKE_REMOVAL_MODULE_TEST = SubLObjectFactory.makeSymbol("MAKE-REMOVAL-MODULE-TEST");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD");
        $sym51$_REMOVAL_MODULE_TESTS_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULE-TESTS*");
        $int52$100 = SubLObjectFactory.makeInteger(100);
        $sym53$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym54$HL_MODULE_NAME = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
        $sym55$_ = SubLObjectFactory.makeSymbol("<");
        $sym56$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), SubLObjectFactory.makeSymbol("PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("BUG"), SubLObjectFactory.makeSymbol("CREATED"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)removal_module_tests.T) });
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("BUG"), SubLObjectFactory.makeKeyword("CREATED"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $kw59$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $const60$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw61$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw62$BUG = SubLObjectFactory.makeKeyword("BUG");
        $kw63$CREATED = SubLObjectFactory.makeKeyword("CREATED");
        $sym64$DEFINE_REMOVAL_MODULE_TEST_INT = SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-TEST-INT");
        $sym65$DEFINE_REMOVAL_MODULE_TEST = SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-TEST");
        $str66$Define_a_removal_module_test_numb = SubLObjectFactory.makeString("Define a removal module test number ID for the module named NAME.\n   The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\n  PROPERTIES, if not nil, specifies additional query properties to pass in.");
        $sym67$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym68$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $sym69$INFERENCE_TEST_OWNER_P = SubLObjectFactory.makeSymbol("INFERENCE-TEST-OWNER-P");
        $sym70$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym71$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $sym72$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw73$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $sym74$CYC_TEST_OUTPUT_FORMAT_P = SubLObjectFactory.makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
        $kw75$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw76$RMT = SubLObjectFactory.makeKeyword("RMT");
        $sym77$RUN_REMOVAL_MODULE_TESTS_FOR_PRED = SubLObjectFactory.makeSymbol("RUN-REMOVAL-MODULE-TESTS-FOR-PRED");
        $kw78$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw79$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $kw80$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $kw81$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $kw82$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw83$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw84$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym85$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw86$FAILURE_BINDINGS = SubLObjectFactory.makeKeyword("FAILURE-BINDINGS");
        $kw87$FAILURE_HALT_REASON = SubLObjectFactory.makeKeyword("FAILURE-HALT-REASON");
        $kw88$FAILURE_REMOVAL_MODULE = SubLObjectFactory.makeKeyword("FAILURE-REMOVAL-MODULE");
        $kw89$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw90$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw91$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw92$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $kw93$BLOCK_ = SubLObjectFactory.makeKeyword("BLOCK?");
        $str94$___RMT__S__S____ = SubLObjectFactory.makeString("~&:RMT ~S ~S -> ");
        $kw95$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $str96$Unknown_output_format__A = SubLObjectFactory.makeString("Unknown output format ~A");
        $str97$_S____3f___ = SubLObjectFactory.makeString("~S (~,3f)~%");
    }
    
    public static final class $removal_module_test_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $properties;
        public SubLObject $comment;
        public SubLObject $kb;
        public SubLObject $owner;
        public SubLObject $bug_number;
        public SubLObject $creation_date;
        public SubLObject $creator;
        public SubLObject $workingP;
        private static final SubLStructDeclNative structDecl;
        
        public $removal_module_test_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$bug_number = (SubLObject)CommonSymbols.NIL;
            this.$creation_date = (SubLObject)CommonSymbols.NIL;
            this.$creator = (SubLObject)CommonSymbols.NIL;
            this.$workingP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$removal_module_test_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$hl_module;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$sentence;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$properties;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$comment;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$kb;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$owner;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$bug_number;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$creation_date;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$creator;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$workingP;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$comment = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$kb = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$owner = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$bug_number = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$creation_date = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$creator = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$workingP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$removal_module_test_native.class, removal_module_tests.$sym0$REMOVAL_MODULE_TEST, removal_module_tests.$sym1$REMOVAL_MODULE_TEST_P, removal_module_tests.$list2, removal_module_tests.$list3, new String[] { "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, removal_module_tests.$list4, removal_module_tests.$list5, removal_module_tests.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $removal_module_test_p$UnaryFunction extends UnaryFunction
    {
        public $removal_module_test_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-MODULE-TEST-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_module_tests.removal_module_test_p(arg1);
        }
    }
}

/*

	Total time: 313 ms
	 synthetic 
*/