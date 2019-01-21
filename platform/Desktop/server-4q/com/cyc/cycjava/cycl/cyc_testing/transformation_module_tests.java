package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
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

public final class transformation_module_tests extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests";
    public static final String myFingerPrint = "3a2e03dc6955a4ee6bd0c62e9411f2f8c8db91d34fc40ca3d5b2575c132d4bc3";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLSymbol $dtp_transformation_module_test$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1631L)
    private static SubLSymbol $transformation_module_tests$;
    private static final SubLSymbol $sym0$TRANSFORMATION_MODULE_TEST;
    private static final SubLSymbol $sym1$TRANSFORMATION_MODULE_TEST_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$TMT_HL_MODULE;
    private static final SubLSymbol $sym10$_CSETF_TMT_HL_MODULE;
    private static final SubLSymbol $sym11$TMT_ID;
    private static final SubLSymbol $sym12$_CSETF_TMT_ID;
    private static final SubLSymbol $sym13$TMT_SENTENCE;
    private static final SubLSymbol $sym14$_CSETF_TMT_SENTENCE;
    private static final SubLSymbol $sym15$TMT_MT;
    private static final SubLSymbol $sym16$_CSETF_TMT_MT;
    private static final SubLSymbol $sym17$TMT_PROPERTIES;
    private static final SubLSymbol $sym18$_CSETF_TMT_PROPERTIES;
    private static final SubLSymbol $sym19$TMT_COMMENT;
    private static final SubLSymbol $sym20$_CSETF_TMT_COMMENT;
    private static final SubLSymbol $sym21$TMT_KB;
    private static final SubLSymbol $sym22$_CSETF_TMT_KB;
    private static final SubLSymbol $sym23$TMT_OWNER;
    private static final SubLSymbol $sym24$_CSETF_TMT_OWNER;
    private static final SubLSymbol $sym25$TMT_BUG_NUMBER;
    private static final SubLSymbol $sym26$_CSETF_TMT_BUG_NUMBER;
    private static final SubLSymbol $sym27$TMT_CREATION_DATE;
    private static final SubLSymbol $sym28$_CSETF_TMT_CREATION_DATE;
    private static final SubLSymbol $sym29$TMT_CREATOR;
    private static final SubLSymbol $sym30$_CSETF_TMT_CREATOR;
    private static final SubLSymbol $sym31$TMT_WORKING_;
    private static final SubLSymbol $sym32$_CSETF_TMT_WORKING_;
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
    private static final SubLSymbol $sym47$MAKE_TRANSFORMATION_MODULE_TEST;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD;
    private static final SubLSymbol $sym51$_TRANSFORMATION_MODULE_TESTS_;
    private static final SubLInteger $int52$100;
    private static final SubLSymbol $sym53$TERM__;
    private static final SubLSymbol $sym54$HL_MODULE_NAME;
    private static final SubLSymbol $sym55$_;
    private static final SubLSymbol $sym56$INVALID_CONSTANT_;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$ALLOW_OTHER_KEYS;
    private static final SubLObject $const60$EverythingPSC;
    private static final SubLSymbol $kw61$TINY;
    private static final SubLSymbol $kw62$BUG;
    private static final SubLSymbol $kw63$CREATED;
    private static final SubLSymbol $sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT;
    private static final SubLSymbol $sym65$DEFINE_TRANSFORMATION_MODULE_TEST;
    private static final SubLSymbol $sym66$STRINGP;
    private static final SubLSymbol $sym67$CYC_TEST_KB_P;
    private static final SubLSymbol $sym68$INFERENCE_TEST_OWNER_P;
    private static final SubLSymbol $sym69$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym70$UNIVERSAL_DATE_P;
    private static final SubLSymbol $sym71$BOOLEANP;
    private static final SubLSymbol $kw72$STANDARD;
    private static final SubLSymbol $sym73$CYC_TEST_OUTPUT_FORMAT_P;
    private static final SubLSymbol $kw74$TERSE;
    private static final SubLSymbol $kw75$TMT;
    private static final SubLSymbol $kw76$SUCCESS;
    private static final SubLSymbol $kw77$NOT_RUN;
    private static final SubLSymbol $kw78$INVALID;
    private static final SubLSymbol $kw79$ERROR;
    private static final SubLSymbol $kw80$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym81$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw82$FAILURE;
    private static final SubLSymbol $kw83$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw84$BROWSABLE_;
    private static final SubLSymbol $kw85$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw86$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw87$BLOCK_;
    private static final SubLList $list88;
    private static final SubLString $str89$___TMT__S__S____;
    private static final SubLSymbol $kw90$POST_BUILD;
    private static final SubLString $str91$Unknown_output_format__A;
    private static final SubLString $str92$_S____3f___;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject transformation_module_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)transformation_module_tests.ZERO_INTEGER);
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject transformation_module_test_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $transformation_module_test_native.class) ? transformation_module_tests.T : transformation_module_tests.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_hl_module(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_id(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_sentence(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_mt(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_properties(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_comment(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_kb(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_owner(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_bug_number(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_creation_date(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_creator(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject tmt_workingP(final SubLObject v_object) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_hl_module(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_id(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_sentence(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_mt(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_properties(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_comment(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_kb(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_owner(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_bug_number(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_creation_date(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_creator(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject _csetf_tmt_workingP(final SubLObject v_object, final SubLObject value) {
        assert transformation_module_tests.NIL != transformation_module_test_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject make_transformation_module_test(SubLObject arglist) {
        if (arglist == transformation_module_tests.UNPROVIDED) {
            arglist = (SubLObject)transformation_module_tests.NIL;
        }
        final SubLObject v_new = (SubLObject)new $transformation_module_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)transformation_module_tests.NIL, next = arglist; transformation_module_tests.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)transformation_module_tests.$kw33$HL_MODULE)) {
                _csetf_tmt_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw34$ID)) {
                _csetf_tmt_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw35$SENTENCE)) {
                _csetf_tmt_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw36$MT)) {
                _csetf_tmt_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw37$PROPERTIES)) {
                _csetf_tmt_properties(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw38$COMMENT)) {
                _csetf_tmt_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw39$KB)) {
                _csetf_tmt_kb(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw40$OWNER)) {
                _csetf_tmt_owner(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw41$BUG_NUMBER)) {
                _csetf_tmt_bug_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw42$CREATION_DATE)) {
                _csetf_tmt_creation_date(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw43$CREATOR)) {
                _csetf_tmt_creator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_module_tests.$kw44$WORKING_)) {
                _csetf_tmt_workingP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)transformation_module_tests.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject visit_defstruct_transformation_module_test(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw46$BEGIN, (SubLObject)transformation_module_tests.$sym47$MAKE_TRANSFORMATION_MODULE_TEST, (SubLObject)transformation_module_tests.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw33$HL_MODULE, tmt_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw34$ID, tmt_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw35$SENTENCE, tmt_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw36$MT, tmt_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw37$PROPERTIES, tmt_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw38$COMMENT, tmt_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw39$KB, tmt_kb(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw40$OWNER, tmt_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw41$BUG_NUMBER, tmt_bug_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw42$CREATION_DATE, tmt_creation_date(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw43$CREATOR, tmt_creator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw48$SLOT, (SubLObject)transformation_module_tests.$kw44$WORKING_, tmt_workingP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_module_tests.$kw49$END, (SubLObject)transformation_module_tests.$sym47$MAKE_TRANSFORMATION_MODULE_TEST, (SubLObject)transformation_module_tests.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
    public static SubLObject visit_defstruct_object_transformation_module_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transformation_module_test(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1712L)
    public static SubLObject transformation_modules_with_transformation_module_tests() {
        SubLObject hl_modules = hash_table_utilities.hash_table_keys(transformation_module_tests.$transformation_module_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, Symbols.symbol_function((SubLObject)transformation_module_tests.$sym53$TERM__), Symbols.symbol_function((SubLObject)transformation_module_tests.$sym54$HL_MODULE_NAME));
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2043L)
    public static SubLObject transformation_module_tests(final SubLObject hl_module) {
        SubLObject tests = conses_high.copy_list(Hashtables.gethash(hl_module, transformation_module_tests.$transformation_module_tests$.getGlobalValue(), (SubLObject)transformation_module_tests.UNPROVIDED));
        tests = Sort.sort(tests, Symbols.symbol_function((SubLObject)transformation_module_tests.$sym55$_), Symbols.symbol_function((SubLObject)transformation_module_tests.$sym11$TMT_ID));
        return tests;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2317L)
    public static SubLObject some_transformation_module_testsP(final SubLObject hl_module) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(hl_module, transformation_module_tests.$transformation_module_tests$.getGlobalValue(), (SubLObject)transformation_module_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2525L)
    public static SubLObject transformation_module_test_name(final SubLObject tmt) {
        return (SubLObject)ConsesLow.list(inference_modules.hl_module_name(tmt_hl_module(tmt)), tmt_id(tmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2648L)
    public static SubLObject transformation_module_test_id(final SubLObject tmt) {
        return tmt_id(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2725L)
    public static SubLObject transformation_module_test_mt(final SubLObject tmt) {
        return tmt_mt(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2802L)
    public static SubLObject transformation_module_test_sentence(final SubLObject tmt) {
        return tmt_sentence(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2891L)
    public static SubLObject transformation_module_test_owner(final SubLObject tmt) {
        return tmt_owner(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2974L)
    public static SubLObject transformation_module_test_comment(final SubLObject tmt) {
        return tmt_comment(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3061L)
    public static SubLObject transformation_module_test_kb(final SubLObject tmt) {
        return tmt_kb(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3138L)
    public static SubLObject transformation_module_test_workingP(final SubLObject tmt) {
        return tmt_workingP(tmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3227L)
    public static SubLObject transformation_module_test_mentions_invalid_constantP(final SubLObject tmt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_module_tests.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)transformation_module_tests.$sym56$INVALID_CONSTANT_), transformation_module_test_mt(tmt), (SubLObject)transformation_module_tests.UNPROVIDED) || transformation_module_tests.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)transformation_module_tests.$sym56$INVALID_CONSTANT_), transformation_module_test_sentence(tmt), (SubLObject)transformation_module_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3474L)
    public static SubLObject transformation_module_test_invalid_constants(final SubLObject tmt) {
        return Sequences.remove_duplicates(ConsesLow.append(cycl_utilities.expression_gather(transformation_module_test_mt(tmt), (SubLObject)transformation_module_tests.$sym56$INVALID_CONSTANT_, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED), cycl_utilities.expression_gather(transformation_module_test_sentence(tmt), (SubLObject)transformation_module_tests.$sym56$INVALID_CONSTANT_, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED)), (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3744L)
    public static SubLObject define_transformation_module_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)transformation_module_tests.NIL;
        SubLObject id = (SubLObject)transformation_module_tests.NIL;
        SubLObject sentence = (SubLObject)transformation_module_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_module_tests.$list57);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_module_tests.$list57);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_module_tests.$list57);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)transformation_module_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)transformation_module_tests.NIL;
        SubLObject current_$1 = (SubLObject)transformation_module_tests.NIL;
        while (transformation_module_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)transformation_module_tests.$list57);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)transformation_module_tests.$list57);
            if (transformation_module_tests.NIL == conses_high.member(current_$1, (SubLObject)transformation_module_tests.$list58, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED)) {
                bad = (SubLObject)transformation_module_tests.T;
            }
            if (current_$1 == transformation_module_tests.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (transformation_module_tests.NIL != bad && transformation_module_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transformation_module_tests.$list57);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw36$MT, current);
        final SubLObject mt = (transformation_module_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : transformation_module_tests.$const60$EverythingPSC;
        final SubLObject properties_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw37$PROPERTIES, current);
        final SubLObject v_properties = (SubLObject)((transformation_module_tests.NIL != properties_tail) ? conses_high.cadr(properties_tail) : transformation_module_tests.NIL);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw39$KB, current);
        final SubLObject kb = (SubLObject)((transformation_module_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : transformation_module_tests.$kw61$TINY);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw40$OWNER, current);
        final SubLObject owner = (SubLObject)((transformation_module_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : transformation_module_tests.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw38$COMMENT, current);
        final SubLObject comment = (SubLObject)((transformation_module_tests.NIL != comment_tail) ? conses_high.cadr(comment_tail) : transformation_module_tests.NIL);
        final SubLObject bug_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw62$BUG, current);
        final SubLObject bug = (SubLObject)((transformation_module_tests.NIL != bug_tail) ? conses_high.cadr(bug_tail) : transformation_module_tests.NIL);
        final SubLObject created_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw63$CREATED, current);
        final SubLObject created = (SubLObject)((transformation_module_tests.NIL != created_tail) ? conses_high.cadr(created_tail) : transformation_module_tests.NIL);
        final SubLObject creator_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw43$CREATOR, current);
        final SubLObject creator = (SubLObject)((transformation_module_tests.NIL != creator_tail) ? conses_high.cadr(creator_tail) : transformation_module_tests.NIL);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)transformation_module_tests.$kw44$WORKING_, current);
        final SubLObject workingP = (SubLObject)((transformation_module_tests.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : transformation_module_tests.T);
        return (SubLObject)ConsesLow.list(new SubLObject[] { transformation_module_tests.$sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 4178L)
    public static SubLObject define_transformation_module_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_module_tests.NIL != comment && !transformation_module_tests.assertionsDisabledInClass && transformation_module_tests.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        assert transformation_module_tests.NIL != cyc_testing.cyc_test_kb_p(kb) : kb;
        assert transformation_module_tests.NIL != inference_testing.inference_test_owner_p(owner) : owner;
        if (transformation_module_tests.NIL != bug_number && !transformation_module_tests.assertionsDisabledInClass && transformation_module_tests.NIL == subl_promotions.positive_integer_p(bug_number)) {
            throw new AssertionError(bug_number);
        }
        if (transformation_module_tests.NIL != creation_date && !transformation_module_tests.assertionsDisabledInClass && transformation_module_tests.NIL == numeric_date_utilities.universal_date_p(creation_date)) {
            throw new AssertionError(creation_date);
        }
        if (transformation_module_tests.NIL != creator && !transformation_module_tests.assertionsDisabledInClass && transformation_module_tests.NIL == Types.stringp(creator)) {
            throw new AssertionError(creator);
        }
        assert transformation_module_tests.NIL != Types.booleanp(workingP) : workingP;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (transformation_module_tests.NIL != inference_modules.transformation_module_p(hl_module)) {
            final SubLObject test = make_transformation_module_test((SubLObject)ConsesLow.list(new SubLObject[] { transformation_module_tests.$kw33$HL_MODULE, hl_module, transformation_module_tests.$kw34$ID, id, transformation_module_tests.$kw35$SENTENCE, sentence, transformation_module_tests.$kw36$MT, mt, transformation_module_tests.$kw37$PROPERTIES, v_properties, transformation_module_tests.$kw39$KB, kb, transformation_module_tests.$kw40$OWNER, owner, transformation_module_tests.$kw38$COMMENT, comment, transformation_module_tests.$kw41$BUG_NUMBER, bug_number, transformation_module_tests.$kw42$CREATION_DATE, creation_date, transformation_module_tests.$kw43$CREATOR, creator, transformation_module_tests.$kw44$WORKING_, workingP }));
            SubLObject existing_tests = Hashtables.gethash(hl_module, transformation_module_tests.$transformation_module_tests$.getGlobalValue(), (SubLObject)transformation_module_tests.UNPROVIDED);
            existing_tests = Sequences.delete(id, existing_tests, Symbols.symbol_function((SubLObject)transformation_module_tests.EQL), Symbols.symbol_function((SubLObject)transformation_module_tests.$sym11$TMT_ID), (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED);
            existing_tests = (SubLObject)ConsesLow.cons(test, existing_tests);
            Hashtables.sethash(hl_module, transformation_module_tests.$transformation_module_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 5654L)
    public static SubLObject clear_transformation_module_tests() {
        Hashtables.clrhash(transformation_module_tests.$transformation_module_tests$.getGlobalValue());
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 5762L)
    public static SubLObject run_all_transformation_module_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == transformation_module_tests.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == transformation_module_tests.UNPROVIDED) {
            return_test_runsP = (SubLObject)transformation_module_tests.NIL;
        }
        assert transformation_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, (SubLObject)transformation_module_tests.$kw74$TERSE, (SubLObject)transformation_module_tests.NIL, output_format, run_tiny_kb_tests_in_full_kbP, (SubLObject)transformation_module_tests.NIL, return_test_runsP, (SubLObject)transformation_module_tests.$kw75$TMT, (SubLObject)transformation_module_tests.NIL, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 6763L)
    public static SubLObject run_transformation_module_tests_browsable(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_tests(name, output_format, stream, (SubLObject)transformation_module_tests.T, (SubLObject)transformation_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 6978L)
    public static SubLObject run_transformation_module_tests_blockingP(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_tests(name, output_format, stream, (SubLObject)transformation_module_tests.T, (SubLObject)transformation_module_tests.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 7195L)
    public static SubLObject run_transformation_module_tests(final SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == transformation_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)transformation_module_tests.NIL;
        }
        if (blockP == transformation_module_tests.UNPROVIDED) {
            blockP = (SubLObject)transformation_module_tests.NIL;
        }
        assert transformation_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (transformation_module_tests.NIL != inference_modules.transformation_module_p(hl_module)) {
            return run_transformation_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
        }
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 8061L)
    public static SubLObject run_transformation_module_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transformation_module_tests.$kw76$SUCCESS;
        SubLObject test_runs = (SubLObject)transformation_module_tests.NIL;
        SubLObject cdolist_list_var = transformation_module_tests(hl_module);
        SubLObject tmt = (SubLObject)transformation_module_tests.NIL;
        tmt = cdolist_list_var.first();
        while (transformation_module_tests.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_transformation_module_test(tmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
            if (partial_result != transformation_module_tests.$kw76$SUCCESS) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tmt = cdolist_list_var.first();
        }
        return Values.values(result, Sequences.nreverse(test_runs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 8570L)
    public static SubLObject run_transformation_module_test_number_browsable(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_test_number(name, number, output_format, stream, (SubLObject)transformation_module_tests.T, (SubLObject)transformation_module_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 8795L)
    public static SubLObject run_transformation_module_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_transformation_module_test_number(name, number, output_format, stream, (SubLObject)transformation_module_tests.T, (SubLObject)transformation_module_tests.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 9021L)
    public static SubLObject run_transformation_module_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == transformation_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)transformation_module_tests.NIL;
        }
        if (blockP == transformation_module_tests.UNPROVIDED) {
            blockP = (SubLObject)transformation_module_tests.NIL;
        }
        assert transformation_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject test = (SubLObject)transformation_module_tests.NIL;
        if (transformation_module_tests.NIL != inference_modules.transformation_module_p(hl_module) && transformation_module_tests.NIL == test) {
            SubLObject csome_list_var = transformation_module_tests(hl_module);
            SubLObject tmt = (SubLObject)transformation_module_tests.NIL;
            tmt = csome_list_var.first();
            while (transformation_module_tests.NIL == test && transformation_module_tests.NIL != csome_list_var) {
                if (number.numE(tmt_id(tmt))) {
                    test = tmt;
                }
                csome_list_var = csome_list_var.rest();
                tmt = csome_list_var.first();
            }
        }
        return run_transformation_module_test(test, output_format, stream, browsableP, blockP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 9602L)
    public static SubLObject run_transformation_module_test(final SubLObject tmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == transformation_module_tests.UNPROVIDED) {
            output_format = (SubLObject)transformation_module_tests.$kw72$STANDARD;
        }
        if (stream == transformation_module_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == transformation_module_tests.UNPROVIDED) {
            browsableP = (SubLObject)transformation_module_tests.NIL;
        }
        if (blockP == transformation_module_tests.UNPROVIDED) {
            blockP = (SubLObject)transformation_module_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert transformation_module_tests.NIL != transformation_module_test_p(tmt) : tmt;
        assert transformation_module_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject name = transformation_module_test_name(tmt);
        SubLObject time = (SubLObject)transformation_module_tests.NIL;
        SubLObject result = (SubLObject)transformation_module_tests.NIL;
        if (transformation_module_tests.NIL == run_transformation_module_testP(tmt)) {
            result = (SubLObject)transformation_module_tests.$kw77$NOT_RUN;
        }
        else if (transformation_module_tests.NIL != transformation_module_test_mentions_invalid_constantP(tmt)) {
            result = (SubLObject)transformation_module_tests.$kw78$INVALID;
        }
        else {
            final SubLObject hl_module = tmt_hl_module(tmt);
            final SubLObject sentence = tmt_sentence(tmt);
            final SubLObject mt = tmt_mt(tmt);
            final SubLObject v_properties = tmt_properties(tmt);
            final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)transformation_module_tests.NIL, thread);
                print_transformation_test_preamble(tmt, output_format, stream);
                thread.resetMultipleValues();
                final SubLObject result_$2 = run_transformation_module_test_query(hl_module, sentence, mt, v_properties, browsableP, blockP);
                final SubLObject time_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$2;
                time = time_$3;
                print_transformation_module_test_result(tmt, result, time, output_format, stream);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject test_run = cyc_testing.new_cyc_test_run((SubLObject)transformation_module_tests.$kw75$TMT, name, result, time);
        return Values.values(result, test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 11105L)
    public static SubLObject run_transformation_module_testP(final SubLObject tmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = tmt_kb(tmt);
        if (transformation_module_tests.NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return (SubLObject)transformation_module_tests.NIL;
        }
        return (SubLObject)transformation_module_tests.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 11505L)
    public static SubLObject run_transformation_module_test_query(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)transformation_module_tests.$kw79$ERROR;
        SubLObject time = (SubLObject)transformation_module_tests.NIL;
        SubLObject ignore_errors_tag = (SubLObject)transformation_module_tests.NIL;
        try {
            thread.throwStack.push(transformation_module_tests.$kw80$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)transformation_module_tests.$sym81$IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject inference = transformation_module_test_query_inference(sentence, mt, v_properties, blockP);
                    final SubLObject inference_time = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (transformation_module_tests.NIL != inference_utilities.inference_some_proof_uses_transformation_moduleP(inference, hl_module)) {
                        v_answer = (SubLObject)transformation_module_tests.$kw76$SUCCESS;
                    }
                    else {
                        v_answer = (SubLObject)transformation_module_tests.$kw82$FAILURE;
                    }
                    if (transformation_module_tests.NIL == browsableP) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)transformation_module_tests.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)transformation_module_tests.$kw80$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_answer, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 12106L)
    public static SubLObject transformation_module_test_query_inference(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP) {
        if (mt == transformation_module_tests.UNPROVIDED) {
            mt = (SubLObject)transformation_module_tests.NIL;
        }
        if (v_properties == transformation_module_tests.UNPROVIDED) {
            v_properties = (SubLObject)transformation_module_tests.NIL;
        }
        if (blockP == transformation_module_tests.UNPROVIDED) {
            blockP = (SubLObject)transformation_module_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
        v_properties = conses_high.copy_list(v_properties);
        v_properties = conses_high.putf(v_properties, (SubLObject)transformation_module_tests.$kw83$CONDITIONAL_SENTENCE_, conditionalP);
        v_properties = conses_high.putf(v_properties, (SubLObject)transformation_module_tests.$kw84$BROWSABLE_, (SubLObject)transformation_module_tests.T);
        v_properties = conses_high.putf(v_properties, (SubLObject)transformation_module_tests.$kw85$MAX_TRANSFORMATION_DEPTH, (SubLObject)transformation_module_tests.ONE_INTEGER);
        v_properties = conses_high.putf(v_properties, (SubLObject)transformation_module_tests.$kw86$CACHE_INFERENCE_RESULTS_, (SubLObject)transformation_module_tests.NIL);
        if (transformation_module_tests.NIL != blockP) {
            v_properties = conses_high.putf(v_properties, (SubLObject)transformation_module_tests.$kw87$BLOCK_, (SubLObject)transformation_module_tests.T);
            v_properties = list_utilities.nmerge_plist(v_properties, (SubLObject)transformation_module_tests.$list88);
        }
        SubLObject time = (SubLObject)transformation_module_tests.NIL;
        SubLObject result = (SubLObject)transformation_module_tests.NIL;
        SubLObject halt_reason = (SubLObject)transformation_module_tests.NIL;
        SubLObject inference = (SubLObject)transformation_module_tests.NIL;
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
        return Values.values(inference, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 13087L)
    public static SubLObject print_transformation_test_preamble(final SubLObject tmt, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)transformation_module_tests.$kw72$STANDARD)) {
            final SubLObject hl_module = tmt_hl_module(tmt);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = tmt_id(tmt);
            PrintLow.format(stream, (SubLObject)transformation_module_tests.$str89$___TMT__S__S____, name, id);
            streams_high.force_output(stream);
        }
        else if (!output_format.eql((SubLObject)transformation_module_tests.$kw90$POST_BUILD)) {
            PrintLow.format(stream, (SubLObject)transformation_module_tests.$str91$Unknown_output_format__A, output_format);
        }
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 13512L)
    public static SubLObject print_transformation_module_test_result(final SubLObject tmt, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)transformation_module_tests.$kw72$STANDARD)) {
            PrintLow.format(stream, (SubLObject)transformation_module_tests.$str92$_S____3f___, result, time);
            streams_high.force_output(stream);
        }
        else if (output_format.eql((SubLObject)transformation_module_tests.$kw90$POST_BUILD)) {
            final SubLObject hl_module = tmt_hl_module(tmt);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = tmt_id(tmt);
            final SubLObject owner = tmt_owner(tmt);
            cyc_testing.print_post_build_test_summary(stream, result, (SubLObject)transformation_module_tests.$kw75$TMT, (SubLObject)ConsesLow.list(name, id), time, owner);
        }
        else {
            PrintLow.format(stream, (SubLObject)transformation_module_tests.$str91$Unknown_output_format__A, output_format);
        }
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    public static SubLObject declare_transformation_module_tests_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_print_function_trampoline", "TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_p", "TRANSFORMATION-MODULE-TEST-P", 1, 0, false);
        new $transformation_module_test_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_hl_module", "TMT-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_id", "TMT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_sentence", "TMT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_mt", "TMT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_properties", "TMT-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_comment", "TMT-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_kb", "TMT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_owner", "TMT-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_bug_number", "TMT-BUG-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_creation_date", "TMT-CREATION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_creator", "TMT-CREATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "tmt_workingP", "TMT-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_hl_module", "_CSETF-TMT-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_id", "_CSETF-TMT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_sentence", "_CSETF-TMT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_mt", "_CSETF-TMT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_properties", "_CSETF-TMT-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_comment", "_CSETF-TMT-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_kb", "_CSETF-TMT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_owner", "_CSETF-TMT-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_bug_number", "_CSETF-TMT-BUG-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_creation_date", "_CSETF-TMT-CREATION-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_creator", "_CSETF-TMT-CREATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "_csetf_tmt_workingP", "_CSETF-TMT-WORKING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "make_transformation_module_test", "MAKE-TRANSFORMATION-MODULE-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "visit_defstruct_transformation_module_test", "VISIT-DEFSTRUCT-TRANSFORMATION-MODULE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "visit_defstruct_object_transformation_module_test_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-MODULE-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_modules_with_transformation_module_tests", "TRANSFORMATION-MODULES-WITH-TRANSFORMATION-MODULE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_tests", "TRANSFORMATION-MODULE-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "some_transformation_module_testsP", "SOME-TRANSFORMATION-MODULE-TESTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_name", "TRANSFORMATION-MODULE-TEST-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_id", "TRANSFORMATION-MODULE-TEST-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_mt", "TRANSFORMATION-MODULE-TEST-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_sentence", "TRANSFORMATION-MODULE-TEST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_owner", "TRANSFORMATION-MODULE-TEST-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_comment", "TRANSFORMATION-MODULE-TEST-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_kb", "TRANSFORMATION-MODULE-TEST-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_workingP", "TRANSFORMATION-MODULE-TEST-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_mentions_invalid_constantP", "TRANSFORMATION-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_invalid_constants", "TRANSFORMATION-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "define_transformation_module_test", "DEFINE-TRANSFORMATION-MODULE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "define_transformation_module_test_int", "DEFINE-TRANSFORMATION-MODULE-TEST-INT", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "clear_transformation_module_tests", "CLEAR-TRANSFORMATION-MODULE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_all_transformation_module_tests", "RUN-ALL-TRANSFORMATION-MODULE-TESTS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_tests_browsable", "RUN-TRANSFORMATION-MODULE-TESTS-BROWSABLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_tests_blockingP", "RUN-TRANSFORMATION-MODULE-TESTS-BLOCKING?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_tests", "RUN-TRANSFORMATION-MODULE-TESTS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_tests_int", "RUN-TRANSFORMATION-MODULE-TESTS-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_test_number_browsable", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_test_number_blocking", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_test_number", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_test", "RUN-TRANSFORMATION-MODULE-TEST", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_testP", "RUN-TRANSFORMATION-MODULE-TEST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "run_transformation_module_test_query", "RUN-TRANSFORMATION-MODULE-TEST-QUERY", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "transformation_module_test_query_inference", "TRANSFORMATION-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "print_transformation_test_preamble", "PRINT-TRANSFORMATION-TEST-PREAMBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests", "print_transformation_module_test_result", "PRINT-TRANSFORMATION-MODULE-TEST-RESULT", 5, 0, false);
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    public static SubLObject init_transformation_module_tests_file() {
        transformation_module_tests.$dtp_transformation_module_test$ = SubLFiles.defconstant("*DTP-TRANSFORMATION-MODULE-TEST*", (SubLObject)transformation_module_tests.$sym0$TRANSFORMATION_MODULE_TEST);
        transformation_module_tests.$transformation_module_tests$ = SubLFiles.deflexical("*TRANSFORMATION-MODULE-TESTS*", (transformation_module_tests.NIL != Symbols.boundp((SubLObject)transformation_module_tests.$sym51$_TRANSFORMATION_MODULE_TESTS_)) ? transformation_module_tests.$transformation_module_tests$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)transformation_module_tests.$int52$100, (SubLObject)transformation_module_tests.UNPROVIDED, (SubLObject)transformation_module_tests.UNPROVIDED));
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    public static SubLObject setup_transformation_module_tests_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), transformation_module_tests.$dtp_transformation_module_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_module_tests.$sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)transformation_module_tests.$list8);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym9$TMT_HL_MODULE, (SubLObject)transformation_module_tests.$sym10$_CSETF_TMT_HL_MODULE);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym11$TMT_ID, (SubLObject)transformation_module_tests.$sym12$_CSETF_TMT_ID);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym13$TMT_SENTENCE, (SubLObject)transformation_module_tests.$sym14$_CSETF_TMT_SENTENCE);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym15$TMT_MT, (SubLObject)transformation_module_tests.$sym16$_CSETF_TMT_MT);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym17$TMT_PROPERTIES, (SubLObject)transformation_module_tests.$sym18$_CSETF_TMT_PROPERTIES);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym19$TMT_COMMENT, (SubLObject)transformation_module_tests.$sym20$_CSETF_TMT_COMMENT);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym21$TMT_KB, (SubLObject)transformation_module_tests.$sym22$_CSETF_TMT_KB);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym23$TMT_OWNER, (SubLObject)transformation_module_tests.$sym24$_CSETF_TMT_OWNER);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym25$TMT_BUG_NUMBER, (SubLObject)transformation_module_tests.$sym26$_CSETF_TMT_BUG_NUMBER);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym27$TMT_CREATION_DATE, (SubLObject)transformation_module_tests.$sym28$_CSETF_TMT_CREATION_DATE);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym29$TMT_CREATOR, (SubLObject)transformation_module_tests.$sym30$_CSETF_TMT_CREATOR);
        Structures.def_csetf((SubLObject)transformation_module_tests.$sym31$TMT_WORKING_, (SubLObject)transformation_module_tests.$sym32$_CSETF_TMT_WORKING_);
        Equality.identity((SubLObject)transformation_module_tests.$sym0$TRANSFORMATION_MODULE_TEST);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), transformation_module_tests.$dtp_transformation_module_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_module_tests.$sym50$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)transformation_module_tests.$sym51$_TRANSFORMATION_MODULE_TESTS_);
        access_macros.register_macro_helper((SubLObject)transformation_module_tests.$sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT, (SubLObject)transformation_module_tests.$sym65$DEFINE_TRANSFORMATION_MODULE_TEST);
        return (SubLObject)transformation_module_tests.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_transformation_module_tests_file();
    }
    
    @Override
	public void initializeVariables() {
        init_transformation_module_tests_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_transformation_module_tests_file();
    }
    
    static {
        me = (SubLFile)new transformation_module_tests();
        transformation_module_tests.$dtp_transformation_module_test$ = null;
        transformation_module_tests.$transformation_module_tests$ = null;
        $sym0$TRANSFORMATION_MODULE_TEST = SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-TEST");
        $sym1$TRANSFORMATION_MODULE_TEST_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-TEST-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("PROPERTIES"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("KB"), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("BUG-NUMBER"), SubLObjectFactory.makeSymbol("CREATION-DATE"), SubLObjectFactory.makeSymbol("CREATOR"), SubLObjectFactory.makeSymbol("WORKING?") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HL-MODULE"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("BUG-NUMBER"), SubLObjectFactory.makeKeyword("CREATION-DATE"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TMT-HL-MODULE"), SubLObjectFactory.makeSymbol("TMT-ID"), SubLObjectFactory.makeSymbol("TMT-SENTENCE"), SubLObjectFactory.makeSymbol("TMT-MT"), SubLObjectFactory.makeSymbol("TMT-PROPERTIES"), SubLObjectFactory.makeSymbol("TMT-COMMENT"), SubLObjectFactory.makeSymbol("TMT-KB"), SubLObjectFactory.makeSymbol("TMT-OWNER"), SubLObjectFactory.makeSymbol("TMT-BUG-NUMBER"), SubLObjectFactory.makeSymbol("TMT-CREATION-DATE"), SubLObjectFactory.makeSymbol("TMT-CREATOR"), SubLObjectFactory.makeSymbol("TMT-WORKING?") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TMT-HL-MODULE"), SubLObjectFactory.makeSymbol("_CSETF-TMT-ID"), SubLObjectFactory.makeSymbol("_CSETF-TMT-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-TMT-MT"), SubLObjectFactory.makeSymbol("_CSETF-TMT-PROPERTIES"), SubLObjectFactory.makeSymbol("_CSETF-TMT-COMMENT"), SubLObjectFactory.makeSymbol("_CSETF-TMT-KB"), SubLObjectFactory.makeSymbol("_CSETF-TMT-OWNER"), SubLObjectFactory.makeSymbol("_CSETF-TMT-BUG-NUMBER"), SubLObjectFactory.makeSymbol("_CSETF-TMT-CREATION-DATE"), SubLObjectFactory.makeSymbol("_CSETF-TMT-CREATOR"), SubLObjectFactory.makeSymbol("_CSETF-TMT-WORKING?") });
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-TEST-P"));
        $sym9$TMT_HL_MODULE = SubLObjectFactory.makeSymbol("TMT-HL-MODULE");
        $sym10$_CSETF_TMT_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-TMT-HL-MODULE");
        $sym11$TMT_ID = SubLObjectFactory.makeSymbol("TMT-ID");
        $sym12$_CSETF_TMT_ID = SubLObjectFactory.makeSymbol("_CSETF-TMT-ID");
        $sym13$TMT_SENTENCE = SubLObjectFactory.makeSymbol("TMT-SENTENCE");
        $sym14$_CSETF_TMT_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-TMT-SENTENCE");
        $sym15$TMT_MT = SubLObjectFactory.makeSymbol("TMT-MT");
        $sym16$_CSETF_TMT_MT = SubLObjectFactory.makeSymbol("_CSETF-TMT-MT");
        $sym17$TMT_PROPERTIES = SubLObjectFactory.makeSymbol("TMT-PROPERTIES");
        $sym18$_CSETF_TMT_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-TMT-PROPERTIES");
        $sym19$TMT_COMMENT = SubLObjectFactory.makeSymbol("TMT-COMMENT");
        $sym20$_CSETF_TMT_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-TMT-COMMENT");
        $sym21$TMT_KB = SubLObjectFactory.makeSymbol("TMT-KB");
        $sym22$_CSETF_TMT_KB = SubLObjectFactory.makeSymbol("_CSETF-TMT-KB");
        $sym23$TMT_OWNER = SubLObjectFactory.makeSymbol("TMT-OWNER");
        $sym24$_CSETF_TMT_OWNER = SubLObjectFactory.makeSymbol("_CSETF-TMT-OWNER");
        $sym25$TMT_BUG_NUMBER = SubLObjectFactory.makeSymbol("TMT-BUG-NUMBER");
        $sym26$_CSETF_TMT_BUG_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-TMT-BUG-NUMBER");
        $sym27$TMT_CREATION_DATE = SubLObjectFactory.makeSymbol("TMT-CREATION-DATE");
        $sym28$_CSETF_TMT_CREATION_DATE = SubLObjectFactory.makeSymbol("_CSETF-TMT-CREATION-DATE");
        $sym29$TMT_CREATOR = SubLObjectFactory.makeSymbol("TMT-CREATOR");
        $sym30$_CSETF_TMT_CREATOR = SubLObjectFactory.makeSymbol("_CSETF-TMT-CREATOR");
        $sym31$TMT_WORKING_ = SubLObjectFactory.makeSymbol("TMT-WORKING?");
        $sym32$_CSETF_TMT_WORKING_ = SubLObjectFactory.makeSymbol("_CSETF-TMT-WORKING?");
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
        $sym47$MAKE_TRANSFORMATION_MODULE_TEST = SubLObjectFactory.makeSymbol("MAKE-TRANSFORMATION-MODULE-TEST");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-MODULE-TEST-METHOD");
        $sym51$_TRANSFORMATION_MODULE_TESTS_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-MODULE-TESTS*");
        $int52$100 = SubLObjectFactory.makeInteger(100);
        $sym53$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym54$HL_MODULE_NAME = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
        $sym55$_ = SubLObjectFactory.makeSymbol("<");
        $sym56$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), SubLObjectFactory.makeSymbol("PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("BUG"), SubLObjectFactory.makeSymbol("CREATED"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)transformation_module_tests.T) });
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("BUG"), SubLObjectFactory.makeKeyword("CREATED"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $kw59$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $const60$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw61$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw62$BUG = SubLObjectFactory.makeKeyword("BUG");
        $kw63$CREATED = SubLObjectFactory.makeKeyword("CREATED");
        $sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT = SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST-INT");
        $sym65$DEFINE_TRANSFORMATION_MODULE_TEST = SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST");
        $sym66$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym67$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $sym68$INFERENCE_TEST_OWNER_P = SubLObjectFactory.makeSymbol("INFERENCE-TEST-OWNER-P");
        $sym69$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym70$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $sym71$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw72$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $sym73$CYC_TEST_OUTPUT_FORMAT_P = SubLObjectFactory.makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
        $kw74$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw75$TMT = SubLObjectFactory.makeKeyword("TMT");
        $kw76$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw77$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $kw78$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $kw79$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw80$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym81$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw82$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw83$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw84$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw85$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw86$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw87$BLOCK_ = SubLObjectFactory.makeKeyword("BLOCK?");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)transformation_module_tests.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)transformation_module_tests.NIL);
        $str89$___TMT__S__S____ = SubLObjectFactory.makeString("~&:TMT ~S ~S -> ");
        $kw90$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $str91$Unknown_output_format__A = SubLObjectFactory.makeString("Unknown output format ~A");
        $str92$_S____3f___ = SubLObjectFactory.makeString("~S (~,3f)~%");
    }
    
    public static final class $transformation_module_test_native extends SubLStructNative
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
        
        public $transformation_module_test_native() {
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
            return (SubLStructDecl)$transformation_module_test_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$transformation_module_test_native.class, transformation_module_tests.$sym0$TRANSFORMATION_MODULE_TEST, transformation_module_tests.$sym1$TRANSFORMATION_MODULE_TEST_P, transformation_module_tests.$list2, transformation_module_tests.$list3, new String[] { "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, transformation_module_tests.$list4, transformation_module_tests.$list5, transformation_module_tests.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $transformation_module_test_p$UnaryFunction extends UnaryFunction
    {
        public $transformation_module_test_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-MODULE-TEST-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_module_tests.transformation_module_test_p(arg1);
        }
    }
}

/*

	Total time: 262 ms
	 synthetic 
*/