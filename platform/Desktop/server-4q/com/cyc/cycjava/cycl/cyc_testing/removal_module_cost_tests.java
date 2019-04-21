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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
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

public final class removal_module_cost_tests extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests";
    public static final String myFingerPrint = "65abf14b71320501f30cb4dee1dc693b3efe99e25919d39425602506a25ae430";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLSymbol $dtp_removal_module_cost_test$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1423L)
    private static SubLSymbol $removal_module_cost_tests$;
    private static final SubLSymbol $sym0$REMOVAL_MODULE_COST_TEST;
    private static final SubLSymbol $sym1$REMOVAL_MODULE_COST_TEST_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RMCT_HL_MODULE;
    private static final SubLSymbol $sym10$_CSETF_RMCT_HL_MODULE;
    private static final SubLSymbol $sym11$RMCT_ID;
    private static final SubLSymbol $sym12$_CSETF_RMCT_ID;
    private static final SubLSymbol $sym13$RMCT_SENTENCE;
    private static final SubLSymbol $sym14$_CSETF_RMCT_SENTENCE;
    private static final SubLSymbol $sym15$RMCT_MT;
    private static final SubLSymbol $sym16$_CSETF_RMCT_MT;
    private static final SubLSymbol $sym17$RMCT_COMMENT;
    private static final SubLSymbol $sym18$_CSETF_RMCT_COMMENT;
    private static final SubLSymbol $sym19$RMCT_KB;
    private static final SubLSymbol $sym20$_CSETF_RMCT_KB;
    private static final SubLSymbol $sym21$RMCT_OWNER;
    private static final SubLSymbol $sym22$_CSETF_RMCT_OWNER;
    private static final SubLSymbol $sym23$RMCT_BUG_NUMBER;
    private static final SubLSymbol $sym24$_CSETF_RMCT_BUG_NUMBER;
    private static final SubLSymbol $sym25$RMCT_CREATION_DATE;
    private static final SubLSymbol $sym26$_CSETF_RMCT_CREATION_DATE;
    private static final SubLSymbol $sym27$RMCT_CREATOR;
    private static final SubLSymbol $sym28$_CSETF_RMCT_CREATOR;
    private static final SubLSymbol $sym29$RMCT_WORKING_;
    private static final SubLSymbol $sym30$_CSETF_RMCT_WORKING_;
    private static final SubLSymbol $kw31$HL_MODULE;
    private static final SubLSymbol $kw32$ID;
    private static final SubLSymbol $kw33$SENTENCE;
    private static final SubLSymbol $kw34$MT;
    private static final SubLSymbol $kw35$COMMENT;
    private static final SubLSymbol $kw36$KB;
    private static final SubLSymbol $kw37$OWNER;
    private static final SubLSymbol $kw38$BUG_NUMBER;
    private static final SubLSymbol $kw39$CREATION_DATE;
    private static final SubLSymbol $kw40$CREATOR;
    private static final SubLSymbol $kw41$WORKING_;
    private static final SubLString $str42$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw43$BEGIN;
    private static final SubLSymbol $sym44$MAKE_REMOVAL_MODULE_COST_TEST;
    private static final SubLSymbol $kw45$SLOT;
    private static final SubLSymbol $kw46$END;
    private static final SubLSymbol $sym47$VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_COST_TEST_METHOD;
    private static final SubLSymbol $sym48$_REMOVAL_MODULE_COST_TESTS_;
    private static final SubLInteger $int49$100;
    private static final SubLSymbol $sym50$TERM__;
    private static final SubLSymbol $sym51$HL_MODULE_NAME;
    private static final SubLSymbol $sym52$_;
    private static final SubLSymbol $kw53$COST;
    private static final SubLSymbol $sym54$INVALID_CONSTANT_;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $kw57$ALLOW_OTHER_KEYS;
    private static final SubLObject $const58$EverythingPSC;
    private static final SubLSymbol $kw59$TINY;
    private static final SubLSymbol $kw60$BUG;
    private static final SubLSymbol $kw61$CREATED;
    private static final SubLSymbol $sym62$DEFINE_REMOVAL_MODULE_COST_TEST_INT;
    private static final SubLSymbol $sym63$DEFINE_REMOVAL_MODULE_COST_TEST;
    private static final SubLSymbol $sym64$STRINGP;
    private static final SubLSymbol $sym65$CYC_TEST_KB_P;
    private static final SubLSymbol $sym66$INFERENCE_TEST_OWNER_P;
    private static final SubLSymbol $sym67$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym68$UNIVERSAL_DATE_P;
    private static final SubLSymbol $sym69$BOOLEANP;
    private static final SubLSymbol $kw70$STANDARD;
    private static final SubLSymbol $sym71$CYC_TEST_OUTPUT_FORMAT_P;
    private static final SubLSymbol $kw72$TERSE;
    private static final SubLSymbol $kw73$RMCT;
    private static final SubLSymbol $kw74$NOT_RUN;
    private static final SubLSymbol $kw75$INVALID;
    private static final SubLSymbol $kw76$ERROR;
    private static final SubLSymbol $kw77$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym78$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw79$POS;
    private static final SubLSymbol $kw80$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR;
    private static final SubLSymbol $kw81$HANDLE_ONE_OUTPUT_GENERATE_RESULT;
    private static final SubLSymbol $kw82$SUCCESS;
    private static final SubLSymbol $kw83$FAILURE;
    private static final SubLString $str84$___RMCT__S__S____;
    private static final SubLSymbol $kw85$POST_BUILD;
    private static final SubLString $str86$Unknown_output_format__A;
    private static final SubLString $str87$_S____3f___;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject removal_module_cost_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)removal_module_cost_tests.ZERO_INTEGER);
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject removal_module_cost_test_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $removal_module_cost_test_native.class) ? removal_module_cost_tests.T : removal_module_cost_tests.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_hl_module(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_id(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_sentence(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_mt(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_comment(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_kb(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_owner(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_bug_number(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_creation_date(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_creator(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject rmct_workingP(final SubLObject v_object) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_hl_module(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_id(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_sentence(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_mt(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_comment(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_kb(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_owner(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_bug_number(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_creation_date(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_creator(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject _csetf_rmct_workingP(final SubLObject v_object, final SubLObject value) {
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject make_removal_module_cost_test(SubLObject arglist) {
        if (arglist == removal_module_cost_tests.UNPROVIDED) {
            arglist = (SubLObject)removal_module_cost_tests.NIL;
        }
        final SubLObject v_new = (SubLObject)new $removal_module_cost_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)removal_module_cost_tests.NIL, next = arglist; removal_module_cost_tests.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw31$HL_MODULE)) {
                _csetf_rmct_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw32$ID)) {
                _csetf_rmct_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw33$SENTENCE)) {
                _csetf_rmct_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw34$MT)) {
                _csetf_rmct_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw35$COMMENT)) {
                _csetf_rmct_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw36$KB)) {
                _csetf_rmct_kb(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw37$OWNER)) {
                _csetf_rmct_owner(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw38$BUG_NUMBER)) {
                _csetf_rmct_bug_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw39$CREATION_DATE)) {
                _csetf_rmct_creation_date(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw40$CREATOR)) {
                _csetf_rmct_creator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_module_cost_tests.$kw41$WORKING_)) {
                _csetf_rmct_workingP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)removal_module_cost_tests.$str42$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject visit_defstruct_removal_module_cost_test(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw43$BEGIN, (SubLObject)removal_module_cost_tests.$sym44$MAKE_REMOVAL_MODULE_COST_TEST, (SubLObject)removal_module_cost_tests.ELEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw31$HL_MODULE, rmct_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw32$ID, rmct_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw33$SENTENCE, rmct_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw34$MT, rmct_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw35$COMMENT, rmct_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw36$KB, rmct_kb(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw37$OWNER, rmct_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw38$BUG_NUMBER, rmct_bug_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw39$CREATION_DATE, rmct_creation_date(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw40$CREATOR, rmct_creator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw45$SLOT, (SubLObject)removal_module_cost_tests.$kw41$WORKING_, rmct_workingP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_module_cost_tests.$kw46$END, (SubLObject)removal_module_cost_tests.$sym44$MAKE_REMOVAL_MODULE_COST_TEST, (SubLObject)removal_module_cost_tests.ELEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1255L)
    public static SubLObject visit_defstruct_object_removal_module_cost_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_module_cost_test(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1502L)
    public static SubLObject removal_modules_with_removal_module_cost_tests() {
        SubLObject hl_modules = hash_table_utilities.hash_table_keys(removal_module_cost_tests.$removal_module_cost_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym50$TERM__), Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym51$HL_MODULE_NAME));
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1813L)
    public static SubLObject removal_module_cost_tests(final SubLObject hl_module) {
        SubLObject tests = conses_high.copy_list(Hashtables.gethash(hl_module, removal_module_cost_tests.$removal_module_cost_tests$.getGlobalValue(), (SubLObject)removal_module_cost_tests.UNPROVIDED));
        tests = Sort.sort(tests, Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym52$_), Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym11$RMCT_ID));
        return tests;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2082L)
    public static SubLObject some_removal_module_cost_testsP(final SubLObject hl_module) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(hl_module, removal_module_cost_tests.$removal_module_cost_tests$.getGlobalValue(), (SubLObject)removal_module_cost_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2284L)
    public static SubLObject removal_module_cost_test_name(final SubLObject rmct) {
        return (SubLObject)ConsesLow.list(inference_modules.hl_module_name(rmct_hl_module(rmct)), rmct_id(rmct), (SubLObject)removal_module_cost_tests.$kw53$COST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2480L)
    public static SubLObject removal_module_cost_test_id(final SubLObject rmct) {
        return rmct_id(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2558L)
    public static SubLObject removal_module_cost_test_mt(final SubLObject rmct) {
        return rmct_mt(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2636L)
    public static SubLObject removal_module_cost_test_sentence(final SubLObject rmct) {
        return rmct_sentence(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2726L)
    public static SubLObject removal_module_cost_test_owner(final SubLObject rmct) {
        return rmct_owner(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2810L)
    public static SubLObject removal_module_cost_test_comment(final SubLObject rmct) {
        return rmct_comment(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2898L)
    public static SubLObject removal_module_cost_test_kb(final SubLObject rmct) {
        return rmct_kb(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 2976L)
    public static SubLObject removal_module_cost_test_workingP(final SubLObject rmct) {
        return rmct_workingP(rmct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 3066L)
    public static SubLObject removal_module_cost_test_predicate(final SubLObject rmct) {
        final SubLObject hl_module = rmct_hl_module(rmct);
        if (removal_module_cost_tests.NIL != hl_module) {
            final SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
            return predicate;
        }
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 3271L)
    public static SubLObject removal_module_cost_test_mentions_invalid_constantP(final SubLObject rmct) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_module_cost_tests.NIL != list_utilities.tree_find_if((SubLObject)removal_module_cost_tests.$sym54$INVALID_CONSTANT_, removal_module_cost_test_mt(rmct), (SubLObject)removal_module_cost_tests.UNPROVIDED) || removal_module_cost_tests.NIL != list_utilities.tree_find_if((SubLObject)removal_module_cost_tests.$sym54$INVALID_CONSTANT_, removal_module_cost_test_sentence(rmct), (SubLObject)removal_module_cost_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 3513L)
    public static SubLObject removal_module_cost_test_invalid_constants(final SubLObject rmct) {
        return Sequences.remove_duplicates(ConsesLow.append(cycl_utilities.expression_gather(removal_module_cost_test_mt(rmct), (SubLObject)removal_module_cost_tests.$sym54$INVALID_CONSTANT_, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED), cycl_utilities.expression_gather(removal_module_cost_test_sentence(rmct), (SubLObject)removal_module_cost_tests.$sym54$INVALID_CONSTANT_, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED)), (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 3780L)
    public static SubLObject define_removal_module_cost_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject id = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject sentence = (SubLObject)removal_module_cost_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_module_cost_tests.$list55);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_module_cost_tests.$list55);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_module_cost_tests.$list55);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject current_$1 = (SubLObject)removal_module_cost_tests.NIL;
        while (removal_module_cost_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_module_cost_tests.$list55);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_module_cost_tests.$list55);
            if (removal_module_cost_tests.NIL == conses_high.member(current_$1, (SubLObject)removal_module_cost_tests.$list56, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED)) {
                bad = (SubLObject)removal_module_cost_tests.T;
            }
            if (current_$1 == removal_module_cost_tests.$kw57$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (removal_module_cost_tests.NIL != bad && removal_module_cost_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_module_cost_tests.$list55);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw34$MT, current);
        final SubLObject mt = (removal_module_cost_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : removal_module_cost_tests.$const58$EverythingPSC;
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw36$KB, current);
        final SubLObject kb = (SubLObject)((removal_module_cost_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : removal_module_cost_tests.$kw59$TINY);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw37$OWNER, current);
        final SubLObject owner = (SubLObject)((removal_module_cost_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : removal_module_cost_tests.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw35$COMMENT, current);
        final SubLObject comment = (SubLObject)((removal_module_cost_tests.NIL != comment_tail) ? conses_high.cadr(comment_tail) : removal_module_cost_tests.NIL);
        final SubLObject bug_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw60$BUG, current);
        final SubLObject bug = (SubLObject)((removal_module_cost_tests.NIL != bug_tail) ? conses_high.cadr(bug_tail) : removal_module_cost_tests.NIL);
        final SubLObject created_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw61$CREATED, current);
        final SubLObject created = (SubLObject)((removal_module_cost_tests.NIL != created_tail) ? conses_high.cadr(created_tail) : removal_module_cost_tests.NIL);
        final SubLObject creator_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw40$CREATOR, current);
        final SubLObject creator = (SubLObject)((removal_module_cost_tests.NIL != creator_tail) ? conses_high.cadr(creator_tail) : removal_module_cost_tests.NIL);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)removal_module_cost_tests.$kw41$WORKING_, current);
        final SubLObject workingP = (SubLObject)((removal_module_cost_tests.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : removal_module_cost_tests.T);
        return (SubLObject)ConsesLow.list(new SubLObject[] { removal_module_cost_tests.$sym62$DEFINE_REMOVAL_MODULE_COST_TEST_INT, name, id, sentence, mt, kb, owner, comment, bug, created, creator, workingP });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 4171L)
    public static SubLObject define_removal_module_cost_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_module_cost_tests.NIL != comment && !removal_module_cost_tests.assertionsDisabledInClass && removal_module_cost_tests.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        assert removal_module_cost_tests.NIL != cyc_testing.cyc_test_kb_p(kb) : kb;
        assert removal_module_cost_tests.NIL != inference_testing.inference_test_owner_p(owner) : owner;
        if (removal_module_cost_tests.NIL != bug_number && !removal_module_cost_tests.assertionsDisabledInClass && removal_module_cost_tests.NIL == subl_promotions.positive_integer_p(bug_number)) {
            throw new AssertionError(bug_number);
        }
        if (removal_module_cost_tests.NIL != creation_date && !removal_module_cost_tests.assertionsDisabledInClass && removal_module_cost_tests.NIL == numeric_date_utilities.universal_date_p(creation_date)) {
            throw new AssertionError(creation_date);
        }
        if (removal_module_cost_tests.NIL != creator && !removal_module_cost_tests.assertionsDisabledInClass && removal_module_cost_tests.NIL == Types.stringp(creator)) {
            throw new AssertionError(creator);
        }
        assert removal_module_cost_tests.NIL != Types.booleanp(workingP) : workingP;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (removal_module_cost_tests.NIL != inference_modules.removal_module_p(hl_module)) {
            final SubLObject test = make_removal_module_cost_test((SubLObject)ConsesLow.list(new SubLObject[] { removal_module_cost_tests.$kw31$HL_MODULE, hl_module, removal_module_cost_tests.$kw32$ID, id, removal_module_cost_tests.$kw33$SENTENCE, sentence, removal_module_cost_tests.$kw34$MT, mt, removal_module_cost_tests.$kw35$COMMENT, comment, removal_module_cost_tests.$kw36$KB, kb, removal_module_cost_tests.$kw37$OWNER, owner, removal_module_cost_tests.$kw38$BUG_NUMBER, bug_number, removal_module_cost_tests.$kw39$CREATION_DATE, creation_date, removal_module_cost_tests.$kw40$CREATOR, creator, removal_module_cost_tests.$kw41$WORKING_, workingP }));
            SubLObject existing_tests = Hashtables.gethash(hl_module, removal_module_cost_tests.$removal_module_cost_tests$.getGlobalValue(), (SubLObject)removal_module_cost_tests.UNPROVIDED);
            existing_tests = Sequences.delete(id, existing_tests, Symbols.symbol_function((SubLObject)removal_module_cost_tests.EQL), Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym11$RMCT_ID), (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED);
            existing_tests = (SubLObject)ConsesLow.cons(test, existing_tests);
            Hashtables.sethash(hl_module, removal_module_cost_tests.$removal_module_cost_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 5535L)
    public static SubLObject clear_removal_module_cost_tests() {
        Hashtables.clrhash(removal_module_cost_tests.$removal_module_cost_tests$.getGlobalValue());
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 5639L)
    public static SubLObject run_all_removal_module_cost_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == removal_module_cost_tests.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == removal_module_cost_tests.UNPROVIDED) {
            return_test_runsP = (SubLObject)removal_module_cost_tests.NIL;
        }
        assert removal_module_cost_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, (SubLObject)removal_module_cost_tests.$kw72$TERSE, (SubLObject)removal_module_cost_tests.NIL, output_format, run_tiny_kb_tests_in_full_kbP, (SubLObject)removal_module_cost_tests.NIL, return_test_runsP, (SubLObject)removal_module_cost_tests.$kw73$RMCT, (SubLObject)removal_module_cost_tests.NIL, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 6610L)
    public static SubLObject run_removal_module_cost_tests_for_pred(final SubLObject pred, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert removal_module_cost_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        SubLObject test_runs = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject cdolist_list_var;
        final SubLObject hl_modules = cdolist_list_var = inference_modules.removal_modules_specific(pred);
        SubLObject hl_module = (SubLObject)removal_module_cost_tests.NIL;
        hl_module = cdolist_list_var.first();
        while (removal_module_cost_tests.NIL != cdolist_list_var) {
            final SubLObject partial_test_runs = run_removal_module_cost_tests_int(hl_module, output_format, stream);
            test_runs = ConsesLow.nconc(test_runs, partial_test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 7526L)
    public static SubLObject run_removal_module_cost_tests_blocking(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_cost_tests(name, output_format, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 7718L)
    public static SubLObject run_removal_module_cost_tests(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert removal_module_cost_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        SubLObject test_runs = (SubLObject)removal_module_cost_tests.NIL;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (removal_module_cost_tests.NIL != inference_modules.removal_module_p(hl_module)) {
            final SubLObject partial_test_runs = run_removal_module_cost_tests_int(hl_module, output_format, stream);
            test_runs = ConsesLow.nconc(test_runs, partial_test_runs);
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 8613L)
    public static SubLObject run_removal_module_cost_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream) {
        SubLObject test_runs = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject cdolist_list_var = removal_module_cost_tests(hl_module);
        SubLObject rmct = (SubLObject)removal_module_cost_tests.NIL;
        rmct = cdolist_list_var.first();
        while (removal_module_cost_tests.NIL != cdolist_list_var) {
            final SubLObject test_run = run_removal_module_cost_test(rmct, output_format, stream);
            test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            rmct = cdolist_list_var.first();
        }
        return Sequences.nreverse(test_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 8941L)
    public static SubLObject run_removal_module_cost_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_cost_test_number(name, number, output_format, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 9159L)
    public static SubLObject run_removal_module_cost_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert removal_module_cost_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject test = (SubLObject)removal_module_cost_tests.NIL;
        if (removal_module_cost_tests.NIL != inference_modules.removal_module_p(hl_module) && removal_module_cost_tests.NIL == test) {
            SubLObject csome_list_var = removal_module_cost_tests(hl_module);
            SubLObject rmct = (SubLObject)removal_module_cost_tests.NIL;
            rmct = csome_list_var.first();
            while (removal_module_cost_tests.NIL == test && removal_module_cost_tests.NIL != csome_list_var) {
                if (number.numE(rmct_id(rmct))) {
                    test = rmct;
                }
                csome_list_var = csome_list_var.rest();
                rmct = csome_list_var.first();
            }
        }
        return run_removal_module_cost_test(test, output_format, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 9688L)
    public static SubLObject run_removal_module_cost_test(final SubLObject rmct, SubLObject output_format, SubLObject stream) {
        if (output_format == removal_module_cost_tests.UNPROVIDED) {
            output_format = (SubLObject)removal_module_cost_tests.$kw70$STANDARD;
        }
        if (stream == removal_module_cost_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_module_cost_tests.NIL != removal_module_cost_test_p(rmct) : rmct;
        assert removal_module_cost_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject name = removal_module_cost_test_name(rmct);
        if (removal_module_cost_tests.NIL == run_removal_module_cost_testP(rmct)) {
            return cyc_testing.new_cyc_test_run((SubLObject)removal_module_cost_tests.$kw73$RMCT, name, (SubLObject)removal_module_cost_tests.$kw74$NOT_RUN, (SubLObject)removal_module_cost_tests.NIL);
        }
        if (removal_module_cost_tests.NIL != removal_module_cost_test_mentions_invalid_constantP(rmct)) {
            return cyc_testing.new_cyc_test_run((SubLObject)removal_module_cost_tests.$kw73$RMCT, name, (SubLObject)removal_module_cost_tests.$kw75$INVALID, (SubLObject)removal_module_cost_tests.NIL);
        }
        final SubLObject hl_module = rmct_hl_module(rmct);
        final SubLObject sentence = rmct_sentence(rmct);
        final SubLObject mt = rmct_mt(rmct);
        print_removal_module_cost_test_preamble(rmct, output_format, stream);
        thread.resetMultipleValues();
        final SubLObject result = run_removal_module_cost_test_comparison(hl_module, sentence, mt);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject test_run = cyc_testing.new_cyc_test_run((SubLObject)removal_module_cost_tests.$kw73$RMCT, name, result, time);
        print_removal_module_cost_test_result(rmct, result, time, output_format, stream);
        return test_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 11038L)
    public static SubLObject run_removal_module_cost_testP(final SubLObject rmct) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = rmct_kb(rmct);
        if (removal_module_cost_tests.NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return (SubLObject)removal_module_cost_tests.NIL;
        }
        return (SubLObject)removal_module_cost_tests.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 11439L)
    public static SubLObject run_removal_module_cost_test_comparison(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)removal_module_cost_tests.$kw76$ERROR;
        SubLObject time = (SubLObject)removal_module_cost_tests.NIL;
        SubLObject ignore_errors_tag = (SubLObject)removal_module_cost_tests.NIL;
        try {
            thread.throwStack.push(removal_module_cost_tests.$kw77$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym78$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject time_var = Time.get_internal_real_time();
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject productivity_cost_estimate = inference_modules.hl_module_cost(hl_module, sentence, (SubLObject)removal_module_cost_tests.$kw79$POS);
                        SubLObject actual_productivity = (SubLObject)removal_module_cost_tests.ZERO_INTEGER;
                        thread.resetMultipleValues();
                        final SubLObject maybe_output_iterator = inference_worker_removal.hl_module_guts((SubLObject)removal_module_cost_tests.$kw80$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, sentence, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED);
                        final SubLObject encoded_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_module_cost_tests.NIL != maybe_output_iterator) {
                            if (maybe_output_iterator.isList()) {
                                actual_productivity = Sequences.length(maybe_output_iterator);
                            }
                            else if (removal_module_cost_tests.NIL != iteration.iterator_p(maybe_output_iterator)) {
                                SubLObject n = (SubLObject)removal_module_cost_tests.ZERO_INTEGER;
                                final SubLObject _prev_bind_0_$3 = backward.$inference_expand_sense$.currentBinding(thread);
                                try {
                                    backward.$inference_expand_sense$.bind((SubLObject)removal_module_cost_tests.$kw79$POS, thread);
                                    SubLObject bindings_list = (SubLObject)removal_module_cost_tests.NIL;
                                    SubLObject valid;
                                    for (SubLObject done_var = (SubLObject)removal_module_cost_tests.NIL; removal_module_cost_tests.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_module_cost_tests.NIL == valid)) {
                                        thread.resetMultipleValues();
                                        final SubLObject output_thing = iteration.iteration_next(maybe_output_iterator);
                                        valid = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (removal_module_cost_tests.NIL != valid) {
                                            thread.resetMultipleValues();
                                            final SubLObject successP = inference_worker_removal.hl_module_guts((SubLObject)removal_module_cost_tests.$kw81$HANDLE_ONE_OUTPUT_GENERATE_RESULT, sentence, hl_module, output_thing, encoded_bindings, (SubLObject)removal_module_cost_tests.UNPROVIDED);
                                            final SubLObject support = thread.secondMultipleValue();
                                            final SubLObject unify_bindings = thread.thirdMultipleValue();
                                            final SubLObject more_supports = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (removal_module_cost_tests.NIL != successP && removal_module_cost_tests.NIL == subl_promotions.memberP(unify_bindings, bindings_list, Symbols.symbol_function((SubLObject)removal_module_cost_tests.EQUAL), (SubLObject)removal_module_cost_tests.UNPROVIDED)) {
                                                bindings_list = (SubLObject)ConsesLow.cons(unify_bindings, bindings_list);
                                                n = Numbers.add(n, (SubLObject)removal_module_cost_tests.ONE_INTEGER);
                                            }
                                            actual_productivity = n;
                                        }
                                    }
                                }
                                finally {
                                    backward.$inference_expand_sense$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        }
                        v_answer = generic_cost_test_comparison(productivity_cost_estimate, actual_productivity);
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
                    }
                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)removal_module_cost_tests.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_module_cost_tests.$kw77$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_answer, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 12901L)
    public static SubLObject generic_cost_test_comparison(final SubLObject productivity_cost_estimate, final SubLObject actual_productivity) {
        if (productivity_cost_estimate.numLE(Numbers.multiply(actual_productivity, (SubLObject)removal_module_cost_tests.THREE_INTEGER)) && productivity_cost_estimate.numGE(Numbers.subtract(actual_productivity, (SubLObject)removal_module_cost_tests.THREE_INTEGER))) {
            return (SubLObject)removal_module_cost_tests.$kw82$SUCCESS;
        }
        return (SubLObject)removal_module_cost_tests.$kw83$FAILURE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 13178L)
    public static SubLObject print_removal_module_cost_test_preamble(final SubLObject rmct, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)removal_module_cost_tests.$kw70$STANDARD)) {
            final SubLObject hl_module = rmct_hl_module(rmct);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = rmct_id(rmct);
            PrintLow.format(stream, (SubLObject)removal_module_cost_tests.$str84$___RMCT__S__S____, name, id);
            streams_high.force_output(stream);
        }
        else if (!output_format.eql((SubLObject)removal_module_cost_tests.$kw85$POST_BUILD)) {
            PrintLow.format(stream, (SubLObject)removal_module_cost_tests.$str86$Unknown_output_format__A, output_format);
        }
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 13614L)
    public static SubLObject print_removal_module_cost_test_result(final SubLObject rmct, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)removal_module_cost_tests.$kw70$STANDARD)) {
            PrintLow.format(stream, (SubLObject)removal_module_cost_tests.$str87$_S____3f___, result, time);
            streams_high.force_output(stream);
        }
        else if (output_format.eql((SubLObject)removal_module_cost_tests.$kw85$POST_BUILD)) {
            final SubLObject hl_module = rmct_hl_module(rmct);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = rmct_id(rmct);
            final SubLObject owner = rmct_owner(rmct);
            cyc_testing.print_post_build_test_summary(stream, result, (SubLObject)removal_module_cost_tests.$kw73$RMCT, (SubLObject)ConsesLow.list(name, id), time, owner);
        }
        else {
            PrintLow.format(stream, (SubLObject)removal_module_cost_tests.$str86$Unknown_output_format__A, output_format);
        }
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    public static SubLObject declare_removal_module_cost_tests_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_print_function_trampoline", "REMOVAL-MODULE-COST-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_p", "REMOVAL-MODULE-COST-TEST-P", 1, 0, false);
        new $removal_module_cost_test_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_hl_module", "RMCT-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_id", "RMCT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_sentence", "RMCT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_mt", "RMCT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_comment", "RMCT-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_kb", "RMCT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_owner", "RMCT-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_bug_number", "RMCT-BUG-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_creation_date", "RMCT-CREATION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_creator", "RMCT-CREATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "rmct_workingP", "RMCT-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_hl_module", "_CSETF-RMCT-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_id", "_CSETF-RMCT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_sentence", "_CSETF-RMCT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_mt", "_CSETF-RMCT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_comment", "_CSETF-RMCT-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_kb", "_CSETF-RMCT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_owner", "_CSETF-RMCT-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_bug_number", "_CSETF-RMCT-BUG-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_creation_date", "_CSETF-RMCT-CREATION-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_creator", "_CSETF-RMCT-CREATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "_csetf_rmct_workingP", "_CSETF-RMCT-WORKING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "make_removal_module_cost_test", "MAKE-REMOVAL-MODULE-COST-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "visit_defstruct_removal_module_cost_test", "VISIT-DEFSTRUCT-REMOVAL-MODULE-COST-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "visit_defstruct_object_removal_module_cost_test_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-COST-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_modules_with_removal_module_cost_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-COST-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_tests", "REMOVAL-MODULE-COST-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "some_removal_module_cost_testsP", "SOME-REMOVAL-MODULE-COST-TESTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_name", "REMOVAL-MODULE-COST-TEST-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_id", "REMOVAL-MODULE-COST-TEST-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_mt", "REMOVAL-MODULE-COST-TEST-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_sentence", "REMOVAL-MODULE-COST-TEST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_owner", "REMOVAL-MODULE-COST-TEST-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_comment", "REMOVAL-MODULE-COST-TEST-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_kb", "REMOVAL-MODULE-COST-TEST-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_workingP", "REMOVAL-MODULE-COST-TEST-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_predicate", "REMOVAL-MODULE-COST-TEST-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_mentions_invalid_constantP", "REMOVAL-MODULE-COST-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "removal_module_cost_test_invalid_constants", "REMOVAL-MODULE-COST-TEST-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "define_removal_module_cost_test", "DEFINE-REMOVAL-MODULE-COST-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "define_removal_module_cost_test_int", "DEFINE-REMOVAL-MODULE-COST-TEST-INT", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "clear_removal_module_cost_tests", "CLEAR-REMOVAL-MODULE-COST-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_all_removal_module_cost_tests", "RUN-ALL-REMOVAL-MODULE-COST-TESTS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_tests_for_pred", "RUN-REMOVAL-MODULE-COST-TESTS-FOR-PRED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_tests_blocking", "RUN-REMOVAL-MODULE-COST-TESTS-BLOCKING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_tests", "RUN-REMOVAL-MODULE-COST-TESTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_tests_int", "RUN-REMOVAL-MODULE-COST-TESTS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_test_number_blocking", "RUN-REMOVAL-MODULE-COST-TEST-NUMBER-BLOCKING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_test_number", "RUN-REMOVAL-MODULE-COST-TEST-NUMBER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_test", "RUN-REMOVAL-MODULE-COST-TEST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_testP", "RUN-REMOVAL-MODULE-COST-TEST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "run_removal_module_cost_test_comparison", "RUN-REMOVAL-MODULE-COST-TEST-COMPARISON", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "generic_cost_test_comparison", "GENERIC-COST-TEST-COMPARISON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "print_removal_module_cost_test_preamble", "PRINT-REMOVAL-MODULE-COST-TEST-PREAMBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests", "print_removal_module_cost_test_result", "PRINT-REMOVAL-MODULE-COST-TEST-RESULT", 5, 0, false);
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    public static SubLObject init_removal_module_cost_tests_file() {
        removal_module_cost_tests.$dtp_removal_module_cost_test$ = SubLFiles.defconstant("*DTP-REMOVAL-MODULE-COST-TEST*", (SubLObject)removal_module_cost_tests.$sym0$REMOVAL_MODULE_COST_TEST);
        removal_module_cost_tests.$removal_module_cost_tests$ = SubLFiles.deflexical("*REMOVAL-MODULE-COST-TESTS*", maybeDefault((SubLObject)removal_module_cost_tests.$sym48$_REMOVAL_MODULE_COST_TESTS_, removal_module_cost_tests.$removal_module_cost_tests$, ()->(Hashtables.make_hash_table((SubLObject)removal_module_cost_tests.$int49$100, (SubLObject)removal_module_cost_tests.UNPROVIDED, (SubLObject)removal_module_cost_tests.UNPROVIDED))));
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    public static SubLObject setup_removal_module_cost_tests_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), removal_module_cost_tests.$dtp_removal_module_cost_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym7$REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)removal_module_cost_tests.$list8);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym9$RMCT_HL_MODULE, (SubLObject)removal_module_cost_tests.$sym10$_CSETF_RMCT_HL_MODULE);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym11$RMCT_ID, (SubLObject)removal_module_cost_tests.$sym12$_CSETF_RMCT_ID);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym13$RMCT_SENTENCE, (SubLObject)removal_module_cost_tests.$sym14$_CSETF_RMCT_SENTENCE);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym15$RMCT_MT, (SubLObject)removal_module_cost_tests.$sym16$_CSETF_RMCT_MT);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym17$RMCT_COMMENT, (SubLObject)removal_module_cost_tests.$sym18$_CSETF_RMCT_COMMENT);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym19$RMCT_KB, (SubLObject)removal_module_cost_tests.$sym20$_CSETF_RMCT_KB);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym21$RMCT_OWNER, (SubLObject)removal_module_cost_tests.$sym22$_CSETF_RMCT_OWNER);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym23$RMCT_BUG_NUMBER, (SubLObject)removal_module_cost_tests.$sym24$_CSETF_RMCT_BUG_NUMBER);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym25$RMCT_CREATION_DATE, (SubLObject)removal_module_cost_tests.$sym26$_CSETF_RMCT_CREATION_DATE);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym27$RMCT_CREATOR, (SubLObject)removal_module_cost_tests.$sym28$_CSETF_RMCT_CREATOR);
        Structures.def_csetf((SubLObject)removal_module_cost_tests.$sym29$RMCT_WORKING_, (SubLObject)removal_module_cost_tests.$sym30$_CSETF_RMCT_WORKING_);
        Equality.identity((SubLObject)removal_module_cost_tests.$sym0$REMOVAL_MODULE_COST_TEST);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), removal_module_cost_tests.$dtp_removal_module_cost_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_module_cost_tests.$sym47$VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_COST_TEST_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)removal_module_cost_tests.$sym48$_REMOVAL_MODULE_COST_TESTS_);
        access_macros.register_macro_helper((SubLObject)removal_module_cost_tests.$sym62$DEFINE_REMOVAL_MODULE_COST_TEST_INT, (SubLObject)removal_module_cost_tests.$sym63$DEFINE_REMOVAL_MODULE_COST_TEST);
        return (SubLObject)removal_module_cost_tests.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_module_cost_tests_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_module_cost_tests_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_module_cost_tests_file();
    }
    
    static {
        me = (SubLFile)new removal_module_cost_tests();
        removal_module_cost_tests.$dtp_removal_module_cost_test$ = null;
        removal_module_cost_tests.$removal_module_cost_tests$ = null;
        $sym0$REMOVAL_MODULE_COST_TEST = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-COST-TEST");
        $sym1$REMOVAL_MODULE_COST_TEST_P = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-COST-TEST-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("KB"), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("BUG-NUMBER"), SubLObjectFactory.makeSymbol("CREATION-DATE"), SubLObjectFactory.makeSymbol("CREATOR"), SubLObjectFactory.makeSymbol("WORKING?") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HL-MODULE"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("BUG-NUMBER"), SubLObjectFactory.makeKeyword("CREATION-DATE"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RMCT-HL-MODULE"), SubLObjectFactory.makeSymbol("RMCT-ID"), SubLObjectFactory.makeSymbol("RMCT-SENTENCE"), SubLObjectFactory.makeSymbol("RMCT-MT"), SubLObjectFactory.makeSymbol("RMCT-COMMENT"), SubLObjectFactory.makeSymbol("RMCT-KB"), SubLObjectFactory.makeSymbol("RMCT-OWNER"), SubLObjectFactory.makeSymbol("RMCT-BUG-NUMBER"), SubLObjectFactory.makeSymbol("RMCT-CREATION-DATE"), SubLObjectFactory.makeSymbol("RMCT-CREATOR"), SubLObjectFactory.makeSymbol("RMCT-WORKING?") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-RMCT-HL-MODULE"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-ID"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-MT"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-COMMENT"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-KB"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-OWNER"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-BUG-NUMBER"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-CREATION-DATE"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-CREATOR"), SubLObjectFactory.makeSymbol("_CSETF-RMCT-WORKING?") });
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-COST-TEST-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MODULE-COST-TEST-P"));
        $sym9$RMCT_HL_MODULE = SubLObjectFactory.makeSymbol("RMCT-HL-MODULE");
        $sym10$_CSETF_RMCT_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-RMCT-HL-MODULE");
        $sym11$RMCT_ID = SubLObjectFactory.makeSymbol("RMCT-ID");
        $sym12$_CSETF_RMCT_ID = SubLObjectFactory.makeSymbol("_CSETF-RMCT-ID");
        $sym13$RMCT_SENTENCE = SubLObjectFactory.makeSymbol("RMCT-SENTENCE");
        $sym14$_CSETF_RMCT_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-RMCT-SENTENCE");
        $sym15$RMCT_MT = SubLObjectFactory.makeSymbol("RMCT-MT");
        $sym16$_CSETF_RMCT_MT = SubLObjectFactory.makeSymbol("_CSETF-RMCT-MT");
        $sym17$RMCT_COMMENT = SubLObjectFactory.makeSymbol("RMCT-COMMENT");
        $sym18$_CSETF_RMCT_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-RMCT-COMMENT");
        $sym19$RMCT_KB = SubLObjectFactory.makeSymbol("RMCT-KB");
        $sym20$_CSETF_RMCT_KB = SubLObjectFactory.makeSymbol("_CSETF-RMCT-KB");
        $sym21$RMCT_OWNER = SubLObjectFactory.makeSymbol("RMCT-OWNER");
        $sym22$_CSETF_RMCT_OWNER = SubLObjectFactory.makeSymbol("_CSETF-RMCT-OWNER");
        $sym23$RMCT_BUG_NUMBER = SubLObjectFactory.makeSymbol("RMCT-BUG-NUMBER");
        $sym24$_CSETF_RMCT_BUG_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-RMCT-BUG-NUMBER");
        $sym25$RMCT_CREATION_DATE = SubLObjectFactory.makeSymbol("RMCT-CREATION-DATE");
        $sym26$_CSETF_RMCT_CREATION_DATE = SubLObjectFactory.makeSymbol("_CSETF-RMCT-CREATION-DATE");
        $sym27$RMCT_CREATOR = SubLObjectFactory.makeSymbol("RMCT-CREATOR");
        $sym28$_CSETF_RMCT_CREATOR = SubLObjectFactory.makeSymbol("_CSETF-RMCT-CREATOR");
        $sym29$RMCT_WORKING_ = SubLObjectFactory.makeSymbol("RMCT-WORKING?");
        $sym30$_CSETF_RMCT_WORKING_ = SubLObjectFactory.makeSymbol("_CSETF-RMCT-WORKING?");
        $kw31$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw32$ID = SubLObjectFactory.makeKeyword("ID");
        $kw33$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw34$MT = SubLObjectFactory.makeKeyword("MT");
        $kw35$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw36$KB = SubLObjectFactory.makeKeyword("KB");
        $kw37$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw38$BUG_NUMBER = SubLObjectFactory.makeKeyword("BUG-NUMBER");
        $kw39$CREATION_DATE = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $kw40$CREATOR = SubLObjectFactory.makeKeyword("CREATOR");
        $kw41$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $str42$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw43$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym44$MAKE_REMOVAL_MODULE_COST_TEST = SubLObjectFactory.makeSymbol("MAKE-REMOVAL-MODULE-COST-TEST");
        $kw45$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw46$END = SubLObjectFactory.makeKeyword("END");
        $sym47$VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_COST_TEST_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-COST-TEST-METHOD");
        $sym48$_REMOVAL_MODULE_COST_TESTS_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULE-COST-TESTS*");
        $int49$100 = SubLObjectFactory.makeInteger(100);
        $sym50$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym51$HL_MODULE_NAME = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
        $sym52$_ = SubLObjectFactory.makeSymbol("<");
        $kw53$COST = SubLObjectFactory.makeKeyword("COST");
        $sym54$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("BUG"), SubLObjectFactory.makeSymbol("CREATED"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)removal_module_cost_tests.T) });
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("BUG"), (SubLObject)SubLObjectFactory.makeKeyword("CREATED"), (SubLObject)SubLObjectFactory.makeKeyword("CREATOR"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $kw57$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $const58$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw59$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw60$BUG = SubLObjectFactory.makeKeyword("BUG");
        $kw61$CREATED = SubLObjectFactory.makeKeyword("CREATED");
        $sym62$DEFINE_REMOVAL_MODULE_COST_TEST_INT = SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST-INT");
        $sym63$DEFINE_REMOVAL_MODULE_COST_TEST = SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST");
        $sym64$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym65$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $sym66$INFERENCE_TEST_OWNER_P = SubLObjectFactory.makeSymbol("INFERENCE-TEST-OWNER-P");
        $sym67$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym68$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $sym69$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw70$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $sym71$CYC_TEST_OUTPUT_FORMAT_P = SubLObjectFactory.makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
        $kw72$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw73$RMCT = SubLObjectFactory.makeKeyword("RMCT");
        $kw74$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $kw75$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $kw76$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw77$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym78$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw79$POS = SubLObjectFactory.makeKeyword("POS");
        $kw80$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = SubLObjectFactory.makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
        $kw81$HANDLE_ONE_OUTPUT_GENERATE_RESULT = SubLObjectFactory.makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
        $kw82$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw83$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $str84$___RMCT__S__S____ = SubLObjectFactory.makeString("~&:RMCT ~S ~S -> ");
        $kw85$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $str86$Unknown_output_format__A = SubLObjectFactory.makeString("Unknown output format ~A");
        $str87$_S____3f___ = SubLObjectFactory.makeString("~S (~,3f)~%");
    }
    
    public static final class $removal_module_cost_test_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $comment;
        public SubLObject $kb;
        public SubLObject $owner;
        public SubLObject $bug_number;
        public SubLObject $creation_date;
        public SubLObject $creator;
        public SubLObject $workingP;
        private static final SubLStructDeclNative structDecl;
        
        public $removal_module_cost_test_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
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
            return (SubLStructDecl)$removal_module_cost_test_native.structDecl;
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
            return this.$comment;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$kb;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$owner;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$bug_number;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$creation_date;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$creator;
        }
        
        @Override
		public SubLObject getField12() {
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
            return this.$comment = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$kb = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$owner = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$bug_number = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$creation_date = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$creator = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$workingP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$removal_module_cost_test_native.class, removal_module_cost_tests.$sym0$REMOVAL_MODULE_COST_TEST, removal_module_cost_tests.$sym1$REMOVAL_MODULE_COST_TEST_P, removal_module_cost_tests.$list2, removal_module_cost_tests.$list3, new String[] { "$hl_module", "$id", "$sentence", "$mt", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, removal_module_cost_tests.$list4, removal_module_cost_tests.$list5, removal_module_cost_tests.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $removal_module_cost_test_p$UnaryFunction extends UnaryFunction
    {
        public $removal_module_cost_test_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-MODULE-COST-TEST-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_module_cost_tests.removal_module_cost_test_p(arg1);
        }
    }
}

/*

	Total time: 522 ms
	 synthetic 
*/