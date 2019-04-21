package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class generic_testing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.generic_testing";
    public static final String myFingerPrint = "693dc97679238aaf65400a8b07f5012b06edc815b67d1968554f8563c224b704";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1322L)
    private static SubLSymbol $test_case_table_index$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1634L)
    private static SubLSymbol $ordered_test_cases$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1743L)
    private static SubLSymbol $test_case_tables_by_class$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1879L)
    private static SubLSymbol $generic_test_results$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2014L)
    private static SubLSymbol $generic_test_verbosity_levels$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2162L)
    private static SubLSymbol $test_case_table_post_build_token$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2376L)
    public static SubLSymbol $debug_test_case_tablesP$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLSymbol $dtp_generic_test_case_table$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 18131L)
    private static SubLSymbol $cfasl_wide_opcode_generic_test_case_table$;
    private static final SubLSymbol $sym0$_TEST_CASE_TABLE_INDEX_;
    private static final SubLInteger $int1$212;
    private static final SubLSymbol $sym2$_ORDERED_TEST_CASES_;
    private static final SubLInteger $int3$64;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$TCT;
    private static final SubLSymbol $sym7$GENERIC_TEST_CASE_TABLE;
    private static final SubLSymbol $sym8$GENERIC_TEST_CASE_TABLE_P;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym14$GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$GTCT_NAME;
    private static final SubLSymbol $sym17$_CSETF_GTCT_NAME;
    private static final SubLSymbol $sym18$GTCT_TUPLES;
    private static final SubLSymbol $sym19$_CSETF_GTCT_TUPLES;
    private static final SubLSymbol $sym20$GTCT_TEST;
    private static final SubLSymbol $sym21$_CSETF_GTCT_TEST;
    private static final SubLSymbol $sym22$GTCT_OWNER;
    private static final SubLSymbol $sym23$_CSETF_GTCT_OWNER;
    private static final SubLSymbol $sym24$GTCT_CLASSES;
    private static final SubLSymbol $sym25$_CSETF_GTCT_CLASSES;
    private static final SubLSymbol $sym26$GTCT_KB;
    private static final SubLSymbol $sym27$_CSETF_GTCT_KB;
    private static final SubLSymbol $sym28$GTCT_WORKING_;
    private static final SubLSymbol $sym29$_CSETF_GTCT_WORKING_;
    private static final SubLSymbol $kw30$NAME;
    private static final SubLSymbol $kw31$TUPLES;
    private static final SubLSymbol $kw32$TEST;
    private static final SubLSymbol $kw33$OWNER;
    private static final SubLSymbol $kw34$CLASSES;
    private static final SubLSymbol $kw35$KB;
    private static final SubLSymbol $kw36$WORKING_;
    private static final SubLString $str37$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw38$BEGIN;
    private static final SubLSymbol $sym39$MAKE_GENERIC_TEST_CASE_TABLE;
    private static final SubLSymbol $kw40$SLOT;
    private static final SubLSymbol $kw41$END;
    private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD;
    private static final SubLSymbol $kw43$TINY;
    private static final SubLSymbol $sym44$TEST_CASE_NAME_P;
    private static final SubLSymbol $sym45$LISTP;
    private static final SubLSymbol $sym46$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym47$STRINGP;
    private static final SubLSymbol $sym48$CYC_TEST_KB_P;
    private static final SubLString $str49$_S_was_not_a_valid___input_____ex;
    private static final SubLString $str50$;
    private static final SubLSymbol $sym51$INVALID_CONSTANT_;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $kw54$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $sym55$DEFINE_TEST_CASE_TABLE_INT;
    private static final SubLSymbol $sym56$QUOTE;
    private static final SubLSymbol $sym57$LIST;
    private static final SubLSymbol $kw58$VERBOSE;
    private static final SubLSymbol $sym59$STREAMP;
    private static final SubLSymbol $sym60$GENERIC_TEST_VERBOSITY_LEVEL_P;
    private static final SubLSymbol $kw61$UNDEFINED;
    private static final SubLString $str62$__There_is_no_test_case_table_nam;
    private static final SubLSymbol $kw63$NOT_RUN;
    private static final SubLSymbol $kw64$TERSE;
    private static final SubLSymbol $kw65$STANDARD;
    private static final SubLSymbol $kw66$SUCCESS;
    private static final SubLSymbol $kw67$FAILURE;
    private static final SubLSymbol $kw68$ERROR;
    private static final SubLSymbol $kw69$INVALID;
    private static final SubLSymbol $sym70$DEFINE_TEST_CASE_TABLE;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$POST_BUILD;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$QUOTIFY;
    private static final SubLSymbol $sym76$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str77$_TCT__S____;
    private static final SubLString $str78$Starting__TCT__S______;
    private static final SubLString $str79$_S____3f___;
    private static final SubLString $str80$__Overall_result_for___S___S__;
    private static final SubLString $str81$Please_notify__a_cyc_com_;
    private static final SubLString $str82$__Input___s____Expected_result___;
    private static final SubLString $str83$__Input___s____Expected_results__;
    private static final SubLString $str84$__________SUCCESS___S___;
    private static final SubLString $str85$__________ERROR__S___S___;
    private static final SubLString $str86$____Actual_result___s____Compared;
    private static final SubLString $str87$____Actual_results___s____Compare;
    private static final SubLInteger $int88$512;
    private static final SubLSymbol $sym89$CFASL_INPUT_GENERIC_TEST_CASE_TABLE;
    private static final SubLSymbol $sym90$CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2301L)
    public static SubLObject all_generic_test_cases() {
        return generic_testing.$ordered_test_cases$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject generic_test_case_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)generic_testing.ZERO_INTEGER);
        return (SubLObject)generic_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject generic_test_case_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $generic_test_case_table_native.class) ? generic_testing.T : generic_testing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_name(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_tuples(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_test(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_owner(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_classes(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_kb(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject gtct_workingP(final SubLObject v_object) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_name(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_tuples(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_test(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_owner(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_classes(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_kb(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject _csetf_gtct_workingP(final SubLObject v_object, final SubLObject value) {
        assert generic_testing.NIL != generic_test_case_table_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject make_generic_test_case_table(SubLObject arglist) {
        if (arglist == generic_testing.UNPROVIDED) {
            arglist = (SubLObject)generic_testing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $generic_test_case_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)generic_testing.NIL, next = arglist; generic_testing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)generic_testing.$kw30$NAME)) {
                _csetf_gtct_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)generic_testing.$kw31$TUPLES)) {
                _csetf_gtct_tuples(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)generic_testing.$kw32$TEST)) {
                _csetf_gtct_test(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)generic_testing.$kw33$OWNER)) {
                _csetf_gtct_owner(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)generic_testing.$kw34$CLASSES)) {
                _csetf_gtct_classes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)generic_testing.$kw35$KB)) {
                _csetf_gtct_kb(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)generic_testing.$kw36$WORKING_)) {
                _csetf_gtct_workingP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)generic_testing.$str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject visit_defstruct_generic_test_case_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw38$BEGIN, (SubLObject)generic_testing.$sym39$MAKE_GENERIC_TEST_CASE_TABLE, (SubLObject)generic_testing.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw30$NAME, gtct_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw31$TUPLES, gtct_tuples(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw32$TEST, gtct_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw33$OWNER, gtct_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw34$CLASSES, gtct_classes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw35$KB, gtct_kb(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw40$SLOT, (SubLObject)generic_testing.$kw36$WORKING_, gtct_workingP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)generic_testing.$kw41$END, (SubLObject)generic_testing.$sym39$MAKE_GENERIC_TEST_CASE_TABLE, (SubLObject)generic_testing.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2818L)
    public static SubLObject visit_defstruct_object_generic_test_case_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_generic_test_case_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 3645L)
    public static SubLObject new_generic_test_case_table(final SubLObject name, final SubLObject tuples, SubLObject test, final SubLObject owner, SubLObject v_classes, SubLObject kb, SubLObject workingP) {
        if (v_classes == generic_testing.UNPROVIDED) {
            v_classes = (SubLObject)generic_testing.NIL;
        }
        if (kb == generic_testing.UNPROVIDED) {
            kb = (SubLObject)generic_testing.$kw43$TINY;
        }
        if (workingP == generic_testing.UNPROVIDED) {
            workingP = (SubLObject)generic_testing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (generic_testing.NIL == test) {
            test = Symbols.symbol_function((SubLObject)generic_testing.EQUAL);
        }
        assert generic_testing.NIL != test_case_name_p(name) : name;
        assert generic_testing.NIL != Types.listp(tuples) : tuples;
        assert generic_testing.NIL != Types.function_spec_p(test) : test;
        if (generic_testing.NIL != owner && !generic_testing.assertionsDisabledInClass && generic_testing.NIL == Types.stringp(owner)) {
            throw new AssertionError(owner);
        }
        if (generic_testing.NIL != v_classes && !generic_testing.assertionsDisabledInClass && generic_testing.NIL == Types.listp(v_classes)) {
            throw new AssertionError(v_classes);
        }
        assert generic_testing.NIL != cyc_testing.cyc_test_kb_p(kb) : kb;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)generic_testing.NIL;
        tuple = cdolist_list_var.first();
        while (generic_testing.NIL != cdolist_list_var) {
            if (generic_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!tuple.isCons() || !Sequences.length(tuple).numGE((SubLObject)generic_testing.TWO_INTEGER))) {
                Errors.error((SubLObject)generic_testing.$str49$_S_was_not_a_valid___input_____ex, tuple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        final SubLObject gtct = make_generic_test_case_table((SubLObject)generic_testing.UNPROVIDED);
        _csetf_gtct_name(gtct, name);
        _csetf_gtct_tuples(gtct, tuples);
        _csetf_gtct_test(gtct, test);
        _csetf_gtct_owner(gtct, owner);
        _csetf_gtct_classes(gtct, v_classes);
        _csetf_gtct_kb(gtct, kb);
        _csetf_gtct_workingP(gtct, workingP);
        return gtct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4507L)
    public static SubLObject generic_test_case_table_name(final SubLObject gtct) {
        return gtct_name(gtct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4588L)
    public static SubLObject generic_test_case_table_tuples(final SubLObject gtct) {
        return gtct_tuples(gtct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4673L)
    public static SubLObject generic_test_case_table_kb(final SubLObject gtct) {
        return gtct_kb(gtct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4750L)
    public static SubLObject generic_test_case_table_owner(final SubLObject gtct) {
        return gtct_owner(gtct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4833L)
    public static SubLObject generic_test_case_table_workingP(final SubLObject gtct) {
        return gtct_workingP(gtct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4922L)
    public static SubLObject generic_test_case_table_comment(final SubLObject gtct) {
        return (SubLObject)generic_testing.$str50$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 5036L)
    public static SubLObject generic_test_case_table_tuples_mentioning_some_invalid_constant(final SubLObject gtct) {
        final SubLObject name = generic_test_case_table_name(gtct);
        final SubLObject tuples = generic_test_case_table_tuples(gtct);
        SubLObject invalid_tuple_names = (SubLObject)generic_testing.NIL;
        SubLObject index = (SubLObject)generic_testing.ZERO_INTEGER;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)generic_testing.NIL;
        tuple = cdolist_list_var.first();
        while (generic_testing.NIL != cdolist_list_var) {
            if (generic_testing.NIL != generic_test_case_table_tuple_mentions_invalid_constantP(tuple)) {
                invalid_tuple_names = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(name, index), invalid_tuple_names);
            }
            index = Numbers.add(index, (SubLObject)generic_testing.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(invalid_tuple_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 5493L)
    public static SubLObject generic_test_case_table_tuples_invalid_constants(final SubLObject gtct) {
        final SubLObject tuples = generic_test_case_table_tuples(gtct);
        SubLObject result = (SubLObject)generic_testing.NIL;
        SubLObject index = (SubLObject)generic_testing.ZERO_INTEGER;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)generic_testing.NIL;
        tuple = cdolist_list_var.first();
        while (generic_testing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = generic_test_case_table_tuple_invalid_constants(tuple);
            SubLObject constant = (SubLObject)generic_testing.NIL;
            constant = cdolist_list_var_$1.first();
            while (generic_testing.NIL != cdolist_list_var_$1) {
                final SubLObject item_var = constant;
                if (generic_testing.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)generic_testing.EQL), Symbols.symbol_function((SubLObject)generic_testing.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(item_var, result);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                constant = cdolist_list_var_$1.first();
            }
            index = Numbers.add(index, (SubLObject)generic_testing.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 5840L)
    public static SubLObject generic_test_case_table_tuple_mentions_invalid_constantP(final SubLObject tuple) {
        return list_utilities.tree_find_if((SubLObject)generic_testing.$sym51$INVALID_CONSTANT_, tuple, (SubLObject)generic_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 5973L)
    public static SubLObject generic_test_case_table_tuple_invalid_constants(final SubLObject tuple) {
        return cycl_utilities.expression_gather(tuple, (SubLObject)generic_testing.$sym51$INVALID_CONSTANT_, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 6102L)
    public static SubLObject define_test_case_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_case_name = (SubLObject)generic_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)generic_testing.$list52);
        test_case_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)generic_testing.$list52);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)generic_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)generic_testing.NIL;
        SubLObject current_$2 = (SubLObject)generic_testing.NIL;
        while (generic_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)generic_testing.$list52);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)generic_testing.$list52);
            if (generic_testing.NIL == conses_high.member(current_$2, (SubLObject)generic_testing.$list53, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED)) {
                bad = (SubLObject)generic_testing.T;
            }
            if (current_$2 == generic_testing.$kw54$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (generic_testing.NIL != bad && generic_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)generic_testing.$list52);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw32$TEST, current);
        final SubLObject test = (SubLObject)((generic_testing.NIL != test_tail) ? conses_high.cadr(test_tail) : generic_testing.NIL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw33$OWNER, current);
        final SubLObject owner = (SubLObject)((generic_testing.NIL != owner_tail) ? conses_high.cadr(owner_tail) : generic_testing.NIL);
        final SubLObject classes_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw34$CLASSES, current);
        final SubLObject v_classes = (SubLObject)((generic_testing.NIL != classes_tail) ? conses_high.cadr(classes_tail) : generic_testing.NIL);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw35$KB, current);
        final SubLObject kb = (SubLObject)((generic_testing.NIL != kb_tail) ? conses_high.cadr(kb_tail) : generic_testing.$kw43$TINY);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw36$WORKING_, current);
        final SubLObject workingP = (SubLObject)((generic_testing.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : generic_testing.T);
        final SubLObject tuples;
        current = (tuples = temp);
        assert generic_testing.NIL != test_case_name_p(test_case_name) : test_case_name;
        return (SubLObject)ConsesLow.list((SubLObject)generic_testing.$sym55$DEFINE_TEST_CASE_TABLE_INT, (SubLObject)ConsesLow.list((SubLObject)generic_testing.$sym56$QUOTE, test_case_name), (SubLObject)ConsesLow.list(new SubLObject[] { generic_testing.$sym57$LIST, generic_testing.$kw32$TEST, test, generic_testing.$kw33$OWNER, generic_testing.NIL, generic_testing.$kw34$CLASSES, v_classes, generic_testing.$kw35$KB, kb, generic_testing.$kw36$WORKING_, workingP }), (SubLObject)ConsesLow.list((SubLObject)generic_testing.$sym56$QUOTE, tuples));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 6538L)
    public static SubLObject undefine_test_case_table(final SubLObject test_case_name) {
        assert generic_testing.NIL != test_case_name_p(test_case_name) : test_case_name;
        generic_testing.$ordered_test_cases$.setGlobalValue(Sequences.delete(test_case_name, generic_testing.$ordered_test_cases$.getGlobalValue(), (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED));
        SubLObject cdolist_list_var = test_case_classes(test_case_name);
        SubLObject v_class = (SubLObject)generic_testing.NIL;
        v_class = cdolist_list_var.first();
        while (generic_testing.NIL != cdolist_list_var) {
            hash_table_utilities.remove_value_from_hash(v_class, test_case_name, generic_testing.$test_case_tables_by_class$.getGlobalValue(), (SubLObject)generic_testing.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        }
        return Hashtables.remhash(test_case_name, generic_testing.$test_case_table_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 7066L)
    public static SubLObject undefine_all_test_case_tables() {
        Hashtables.clrhash(generic_testing.$test_case_table_index$.getGlobalValue());
        generic_testing.$ordered_test_cases$.setGlobalValue((SubLObject)generic_testing.NIL);
        Hashtables.clrhash(generic_testing.$test_case_tables_by_class$.getGlobalValue());
        return (SubLObject)generic_testing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 7237L)
    public static SubLObject run_test_case_table(final SubLObject test_case_name, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == generic_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == generic_testing.UNPROVIDED) {
            verbosity_level = (SubLObject)generic_testing.$kw58$VERBOSE;
        }
        if (stop_at_first_failureP == generic_testing.UNPROVIDED) {
            stop_at_first_failureP = (SubLObject)generic_testing.NIL;
        }
        assert generic_testing.NIL != Types.streamp(stream) : stream;
        assert generic_testing.NIL != test_case_name_p(test_case_name) : test_case_name;
        assert generic_testing.NIL != generic_test_verbosity_level_p(verbosity_level) : verbosity_level;
        final SubLObject test_case = Hashtables.gethash(test_case_name, generic_testing.$test_case_table_index$.getGlobalValue(), (SubLObject)generic_testing.$kw61$UNDEFINED);
        if (generic_testing.$kw61$UNDEFINED == test_case) {
            PrintLow.format(stream, (SubLObject)generic_testing.$str62$__There_is_no_test_case_table_nam, test_case_name);
            return Values.values((SubLObject)generic_testing.$kw63$NOT_RUN, (SubLObject)ConsesLow.list(cyc_testing.new_cyc_test_run((SubLObject)generic_testing.$kw6$TCT, test_case_name, (SubLObject)generic_testing.$kw63$NOT_RUN, (SubLObject)generic_testing.NIL)));
        }
        return run_generic_test_case_int(stream, test_case, verbosity_level, stop_at_first_failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 7980L)
    public static SubLObject run_all_test_case_tables(SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (stream == generic_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == generic_testing.UNPROVIDED) {
            verbosity_level = (SubLObject)generic_testing.$kw64$TERSE;
        }
        if (stop_at_first_failureP == generic_testing.UNPROVIDED) {
            stop_at_first_failureP = (SubLObject)generic_testing.NIL;
        }
        if (run_tiny_kb_tests_in_full_kbP == generic_testing.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == generic_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)generic_testing.NIL;
        }
        return cyc_testing.run_all_loaded_cyc_tests(stream, verbosity_level, stop_at_first_failureP, (SubLObject)generic_testing.$kw65$STANDARD, run_tiny_kb_tests_in_full_kbP, (SubLObject)generic_testing.T, return_test_runsP, (SubLObject)generic_testing.$kw6$TCT, (SubLObject)generic_testing.NIL, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 8544L)
    public static SubLObject run_test_case_tables_of_class(final SubLObject v_class, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == generic_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == generic_testing.UNPROVIDED) {
            verbosity_level = (SubLObject)generic_testing.$kw64$TERSE;
        }
        if (stop_at_first_failureP == generic_testing.UNPROVIDED) {
            stop_at_first_failureP = (SubLObject)generic_testing.NIL;
        }
        return run_test_case_tables(test_cases_of_class(v_class), stream, verbosity_level, stop_at_first_failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 8796L)
    public static SubLObject run_test_case_tables(final SubLObject tables, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == generic_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == generic_testing.UNPROVIDED) {
            verbosity_level = (SubLObject)generic_testing.$kw64$TERSE;
        }
        if (stop_at_first_failureP == generic_testing.UNPROVIDED) {
            stop_at_first_failureP = (SubLObject)generic_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert generic_testing.NIL != Types.streamp(stream) : stream;
        assert generic_testing.NIL != generic_test_verbosity_level_p(verbosity_level) : verbosity_level;
        SubLObject overall_result = (SubLObject)generic_testing.$kw63$NOT_RUN;
        SubLObject test_runs = (SubLObject)generic_testing.NIL;
        SubLObject stopP = (SubLObject)generic_testing.NIL;
        if (generic_testing.NIL == stopP) {
            SubLObject csome_list_var = tables;
            SubLObject test_case_name = (SubLObject)generic_testing.NIL;
            test_case_name = csome_list_var.first();
            while (generic_testing.NIL == stopP && generic_testing.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject table_result = run_test_case_table(test_case_name, stream, verbosity_level, stop_at_first_failureP);
                final SubLObject partial_test_runs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                test_runs = ConsesLow.nconc(test_runs, partial_test_runs);
                overall_result = generic_test_result_update(overall_result, table_result);
                if (generic_testing.NIL != generic_test_failure_result_p(overall_result) && generic_testing.NIL != stop_at_first_failureP) {
                    stopP = (SubLObject)generic_testing.T;
                }
                csome_list_var = csome_list_var.rest();
                test_case_name = csome_list_var.first();
            }
        }
        return Values.values(overall_result, test_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 9651L)
    public static SubLObject generic_test_result_p(final SubLObject v_object) {
        return conses_high.member(v_object, generic_testing.$generic_test_results$.getGlobalValue(), Symbols.symbol_function((SubLObject)generic_testing.EQ), (SubLObject)generic_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 9751L)
    public static SubLObject generic_test_success_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)generic_testing.$kw66$SUCCESS, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 9836L)
    public static SubLObject generic_test_failure_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)generic_testing.$kw67$FAILURE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 9921L)
    public static SubLObject generic_test_error_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)generic_testing.$kw68$ERROR, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10002L)
    public static SubLObject generic_test_not_run_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)generic_testing.$kw63$NOT_RUN, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10087L)
    public static SubLObject generic_test_invalid_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)generic_testing.$kw69$INVALID, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10172L)
    public static SubLObject generic_test_verbosity_level_p(final SubLObject v_object) {
        return conses_high.member(v_object, generic_testing.$generic_test_verbosity_levels$.getGlobalValue(), Symbols.symbol_function((SubLObject)generic_testing.EQ), (SubLObject)generic_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10293L)
    public static SubLObject test_cases_of_class(final SubLObject v_class) {
        return Sequences.reverse(Hashtables.gethash(v_class, generic_testing.$test_case_tables_by_class$.getGlobalValue(), (SubLObject)generic_testing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10400L)
    public static SubLObject test_case_name_p(final SubLObject v_object) {
        return possibly_function_symbol_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10534L)
    public static SubLObject possibly_function_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10689L)
    public static SubLObject define_test_case_table_int(final SubLObject test_case_name, final SubLObject v_properties, final SubLObject tuples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allow_other_keys_p = (SubLObject)generic_testing.NIL;
        SubLObject rest = v_properties;
        SubLObject bad = (SubLObject)generic_testing.NIL;
        SubLObject current_$3 = (SubLObject)generic_testing.NIL;
        while (generic_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, v_properties, (SubLObject)generic_testing.$list71);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, v_properties, (SubLObject)generic_testing.$list71);
            if (generic_testing.NIL == conses_high.member(current_$3, (SubLObject)generic_testing.$list72, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED)) {
                bad = (SubLObject)generic_testing.T;
            }
            if (current_$3 == generic_testing.$kw54$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (generic_testing.NIL != bad && generic_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(v_properties, (SubLObject)generic_testing.$list71);
        }
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw33$OWNER, v_properties);
        final SubLObject owner = (SubLObject)((generic_testing.NIL != owner_tail) ? conses_high.cadr(owner_tail) : generic_testing.NIL);
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw32$TEST, v_properties);
        final SubLObject test = (SubLObject)((generic_testing.NIL != test_tail) ? conses_high.cadr(test_tail) : generic_testing.NIL);
        final SubLObject classes_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw34$CLASSES, v_properties);
        final SubLObject v_classes = (SubLObject)((generic_testing.NIL != classes_tail) ? conses_high.cadr(classes_tail) : generic_testing.NIL);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw35$KB, v_properties);
        final SubLObject kb = (SubLObject)((generic_testing.NIL != kb_tail) ? conses_high.cadr(kb_tail) : generic_testing.NIL);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)generic_testing.$kw36$WORKING_, v_properties);
        final SubLObject workingP = (SubLObject)((generic_testing.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : generic_testing.T);
        final SubLObject gtct = new_generic_test_case_table(test_case_name, tuples, test, owner, v_classes, kb, workingP);
        SubLObject cdolist_list_var = v_classes;
        SubLObject v_class = (SubLObject)generic_testing.NIL;
        v_class = cdolist_list_var.first();
        while (generic_testing.NIL != cdolist_list_var) {
            Hashtables.sethash(v_class, generic_testing.$test_case_tables_by_class$.getGlobalValue(), conses_high.adjoin(test_case_name, Hashtables.gethash(v_class, generic_testing.$test_case_tables_by_class$.getGlobalValue(), (SubLObject)generic_testing.UNPROVIDED), (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        }
        if (generic_testing.NIL == conses_high.member(test_case_name, generic_testing.$ordered_test_cases$.getGlobalValue(), Symbols.symbol_function((SubLObject)generic_testing.EQL), Symbols.symbol_function((SubLObject)generic_testing.IDENTITY))) {
            final SubLObject new_cons = (SubLObject)ConsesLow.cons(test_case_name, (SubLObject)generic_testing.NIL);
            final SubLObject list = generic_testing.$ordered_test_cases$.getGlobalValue();
            if (generic_testing.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                generic_testing.$ordered_test_cases$.setGlobalValue(new_cons);
            }
        }
        Hashtables.sethash(test_case_name, generic_testing.$test_case_table_index$.getGlobalValue(), gtct);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), gtct);
        return test_case_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 11474L)
    public static SubLObject run_generic_test_case_int(final SubLObject stream, final SubLObject test_case, final SubLObject verbosity_level, final SubLObject stop_at_first_failureP) {
        final SubLObject name = gtct_name(test_case);
        if (generic_testing.NIL == run_test_case_tableP(test_case)) {
            return Values.values((SubLObject)generic_testing.$kw63$NOT_RUN, (SubLObject)ConsesLow.list(cyc_testing.new_cyc_test_run((SubLObject)generic_testing.$kw6$TCT, name, (SubLObject)generic_testing.$kw63$NOT_RUN, (SubLObject)generic_testing.NIL)));
        }
        final SubLObject test = gtct_test(test_case);
        final SubLObject tuples = gtct_tuples(test_case);
        final SubLObject owner = gtct_owner(test_case);
        return run_test_case_table_int(stream, name, test, tuples, owner, verbosity_level, stop_at_first_failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 12058L)
    public static SubLObject run_test_case_table_int(final SubLObject stream, final SubLObject name, final SubLObject test, final SubLObject tuples, final SubLObject owner, final SubLObject verbosity_level, final SubLObject stop_at_first_failureP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_result = (SubLObject)generic_testing.$kw63$NOT_RUN;
        SubLObject test_runs = (SubLObject)generic_testing.NIL;
        SubLObject time = (SubLObject)generic_testing.NIL;
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)((verbosity_level == generic_testing.$kw73$POST_BUILD) ? generic_testing.NIL : print_high.$print_pretty$.getDynamicValue(thread)), thread);
            SubLObject stopP = (SubLObject)generic_testing.NIL;
            run_test_case_table_print_header(stream, name, verbosity_level);
            final SubLObject time_var = Time.get_internal_real_time();
            SubLObject list_var = (SubLObject)generic_testing.NIL;
            SubLObject tuple = (SubLObject)generic_testing.NIL;
            SubLObject i = (SubLObject)generic_testing.NIL;
            list_var = tuples;
            tuple = list_var.first();
            for (i = (SubLObject)generic_testing.ZERO_INTEGER; generic_testing.NIL == stopP && generic_testing.NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), i = number_utilities.f_1X(i)) {
                thread.resetMultipleValues();
                final SubLObject case_result = run_test_case_tuple_int(stream, name, i, tuple, test, verbosity_level);
                final SubLObject test_run = thread.secondMultipleValue();
                thread.resetMultipleValues();
                test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
                table_result = generic_test_result_update(table_result, case_result);
                if ((generic_testing.$kw67$FAILURE == table_result || generic_testing.$kw68$ERROR == table_result) && generic_testing.NIL != stop_at_first_failureP) {
                    stopP = (SubLObject)generic_testing.T;
                }
            }
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            run_test_case_table_print_footer(stream, name, table_result, time, owner, verbosity_level);
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return Values.values(table_result, Sequences.nreverse(test_runs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 12994L)
    public static SubLObject run_test_case_tableP(final SubLObject test_case) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = gtct_kb(test_case);
        if (generic_testing.NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return (SubLObject)generic_testing.NIL;
        }
        return (SubLObject)generic_testing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 13382L)
    public static SubLObject run_test_case_tuple_int(final SubLObject stream, final SubLObject table_name, final SubLObject i, final SubLObject tuple, final SubLObject test, final SubLObject verbosity_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_result = (SubLObject)generic_testing.$kw63$NOT_RUN;
        SubLObject time = (SubLObject)generic_testing.NIL;
        SubLObject input_args = (SubLObject)generic_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)generic_testing.$list74);
        input_args = tuple.first();
        final SubLObject expected_results;
        final SubLObject current = expected_results = tuple.rest();
        if (generic_testing.NIL != generic_test_case_table_tuple_mentions_invalid_constantP(tuple)) {
            test_result = (SubLObject)generic_testing.$kw69$INVALID;
        }
        else {
            final SubLObject form_to_eval = (SubLObject)ConsesLow.cons(table_name, Mapping.mapcar(Symbols.symbol_function((SubLObject)generic_testing.$sym75$QUOTIFY), input_args));
            run_test_case_tuple_print_header(stream, form_to_eval, expected_results, verbosity_level);
            final SubLObject expected_result_count = Sequences.length(expected_results);
            SubLObject error_message = (SubLObject)generic_testing.NIL;
            SubLObject all_actual_results = (SubLObject)generic_testing.NIL;
            SubLObject actual_results = (SubLObject)generic_testing.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)generic_testing.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        all_actual_results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(Functions.apply(table_name, input_args)));
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)generic_testing.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (generic_testing.NIL != error_message) {
                actual_results = error_message;
                test_result = (SubLObject)generic_testing.$kw68$ERROR;
            }
            else {
                actual_results = list_utilities.first_n(expected_result_count, all_actual_results);
                test_result = determine_run_test_case_tuple_result(expected_results, actual_results, test);
            }
            run_test_case_tuple_print_footer(stream, test_result, actual_results, test, time, verbosity_level);
        }
        final SubLObject tuple_name = (SubLObject)((generic_testing.NIL != generic_testing.$debug_test_case_tablesP$.getDynamicValue(thread)) ? reader.bq_cons(table_name, Mapping.mapcar((SubLObject)generic_testing.$sym75$QUOTIFY, input_args)) : ConsesLow.list(table_name, i));
        final SubLObject test_run = cyc_testing.new_cyc_test_run((SubLObject)generic_testing.$kw6$TCT, tuple_name, test_result, time);
        return Values.values(test_result, test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 14794L)
    public static SubLObject determine_run_test_case_tuple_result(final SubLObject expected_results, final SubLObject actual_results, final SubLObject test) {
        SubLObject rest_expected_results;
        SubLObject rest_actual_results;
        SubLObject expected_result;
        SubLObject actual_result;
        for (rest_expected_results = (SubLObject)generic_testing.NIL, rest_actual_results = (SubLObject)generic_testing.NIL, rest_expected_results = expected_results, rest_actual_results = actual_results; generic_testing.NIL != rest_expected_results && generic_testing.NIL != rest_actual_results; rest_expected_results = rest_expected_results.rest(), rest_actual_results = rest_actual_results.rest()) {
            expected_result = rest_expected_results.first();
            actual_result = rest_actual_results.first();
            if (generic_testing.NIL == Functions.funcall(test, actual_result, expected_result)) {
                return (SubLObject)generic_testing.$kw67$FAILURE;
            }
        }
        return (SubLObject)generic_testing.$kw66$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 15322L)
    public static SubLObject generic_test_result_update(final SubLObject overall_result, final SubLObject test_result) {
        if (overall_result.eql((SubLObject)generic_testing.$kw63$NOT_RUN)) {
            return test_result;
        }
        if (overall_result.eql((SubLObject)generic_testing.$kw69$INVALID)) {
            return test_result;
        }
        if (overall_result.eql((SubLObject)generic_testing.$kw68$ERROR)) {
            return (SubLObject)generic_testing.$kw68$ERROR;
        }
        if (overall_result.eql((SubLObject)generic_testing.$kw67$FAILURE)) {
            return (SubLObject)generic_testing.$kw67$FAILURE;
        }
        if (!overall_result.eql((SubLObject)generic_testing.$kw66$SUCCESS)) {
            return (SubLObject)generic_testing.NIL;
        }
        if (test_result.eql((SubLObject)generic_testing.$kw68$ERROR)) {
            return (SubLObject)generic_testing.$kw68$ERROR;
        }
        if (test_result.eql((SubLObject)generic_testing.$kw67$FAILURE)) {
            return (SubLObject)generic_testing.$kw67$FAILURE;
        }
        return (SubLObject)generic_testing.$kw66$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 15702L)
    public static SubLObject get_gtct_by_name(final SubLObject name) {
        return Hashtables.gethash(name, generic_testing.$test_case_table_index$.getGlobalValue(), (SubLObject)generic_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 15793L)
    public static SubLObject test_case_classes(final SubLObject name) {
        final SubLObject gtct = get_gtct_by_name(name);
        if (generic_testing.NIL != gtct) {
            return gtct_classes(get_gtct_by_name(name));
        }
        return (SubLObject)generic_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 15946L)
    public static SubLObject run_test_case_table_print_header(final SubLObject stream, final SubLObject name, final SubLObject verbosity_level) {
        if (verbosity_level.eql((SubLObject)generic_testing.$kw64$TERSE)) {
            PrintLow.format(stream, (SubLObject)generic_testing.$str77$_TCT__S____, name);
            streams_high.force_output(stream);
        }
        else if (verbosity_level.eql((SubLObject)generic_testing.$kw58$VERBOSE)) {
            PrintLow.format(stream, (SubLObject)generic_testing.$str78$Starting__TCT__S______, name);
            streams_high.force_output(stream);
        }
        return (SubLObject)generic_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 16302L)
    public static SubLObject run_test_case_table_print_footer(final SubLObject stream, final SubLObject name, final SubLObject table_result, final SubLObject time, final SubLObject owner, final SubLObject verbosity_level) {
        if (verbosity_level.eql((SubLObject)generic_testing.$kw64$TERSE)) {
            PrintLow.format(stream, (SubLObject)generic_testing.$str79$_S____3f___, table_result, time);
            streams_high.force_output(stream);
        }
        else if (verbosity_level.eql((SubLObject)generic_testing.$kw73$POST_BUILD)) {
            cyc_testing.print_post_build_test_summary(stream, table_result, generic_testing.$test_case_table_post_build_token$.getGlobalValue(), name, time, owner);
        }
        else if (verbosity_level.eql((SubLObject)generic_testing.$kw58$VERBOSE)) {
            PrintLow.format(stream, (SubLObject)generic_testing.$str80$__Overall_result_for___S___S__, name, table_result);
            if (generic_testing.NIL != owner && (generic_testing.$kw67$FAILURE == table_result || generic_testing.$kw68$ERROR == table_result)) {
                PrintLow.format(stream, (SubLObject)generic_testing.$str81$Please_notify__a_cyc_com_, owner);
            }
            streams_high.force_output(stream);
        }
        return (SubLObject)generic_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 16929L)
    public static SubLObject run_test_case_tuple_print_header(final SubLObject stream, final SubLObject form_to_eval, final SubLObject expected_results, final SubLObject verbosity_level) {
        if (generic_testing.$kw58$VERBOSE == verbosity_level) {
            if (generic_testing.NIL != list_utilities.singletonP(expected_results)) {
                PrintLow.format(stream, (SubLObject)generic_testing.$str82$__Input___s____Expected_result___, form_to_eval, expected_results.first());
            }
            else {
                PrintLow.format(stream, (SubLObject)generic_testing.$str83$__Input___s____Expected_results__, form_to_eval, expected_results);
            }
            streams_high.force_output(stream);
        }
        return (SubLObject)generic_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 17341L)
    public static SubLObject run_test_case_tuple_print_footer(final SubLObject stream, final SubLObject test_result, final SubLObject actual_results, final SubLObject test, final SubLObject time, final SubLObject verbosity_level) {
        if (test_result.eql((SubLObject)generic_testing.$kw66$SUCCESS)) {
            if (generic_testing.$kw58$VERBOSE == verbosity_level) {
                PrintLow.format(stream, (SubLObject)generic_testing.$str84$__________SUCCESS___S___, time);
                streams_high.force_output(stream);
            }
        }
        else if (test_result.eql((SubLObject)generic_testing.$kw68$ERROR)) {
            if (generic_testing.$kw58$VERBOSE == verbosity_level) {
                PrintLow.format(stream, (SubLObject)generic_testing.$str85$__________ERROR__S___S___, actual_results, time);
                streams_high.force_output(stream);
            }
        }
        else if (generic_testing.$kw58$VERBOSE == verbosity_level) {
            if (generic_testing.NIL != list_utilities.singletonP(actual_results)) {
                PrintLow.format(stream, (SubLObject)generic_testing.$str86$____Actual_result___s____Compared, new SubLObject[] { actual_results.first(), test, time });
            }
            else {
                PrintLow.format(stream, (SubLObject)generic_testing.$str87$____Actual_results___s____Compare, new SubLObject[] { actual_results, test, time });
            }
        }
        return (SubLObject)generic_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 18322L)
    public static SubLObject cfasl_output_object_generic_test_case_table_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_generic_test_case_table(v_object, stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 18476L)
    public static SubLObject cfasl_wide_output_generic_test_case_table(final SubLObject tct, final SubLObject stream) {
        cfasl.cfasl_output_wide_opcode(generic_testing.$cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), stream);
        cfasl_output_generic_test_case_table(tct, stream);
        return tct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 18694L)
    public static SubLObject cfasl_output_generic_test_case_table(final SubLObject tct, final SubLObject stream) {
        cfasl.cfasl_output(gtct_name(tct), stream);
        cfasl.cfasl_output(gtct_tuples(tct), stream);
        cfasl.cfasl_output(hash_table_utilities.hash_test_to_symbol(gtct_test(tct)), stream);
        cfasl.cfasl_output(gtct_owner(tct), stream);
        cfasl.cfasl_output(gtct_classes(tct), stream);
        cfasl.cfasl_output(gtct_kb(tct), stream);
        cfasl.cfasl_output(gtct_workingP(tct), stream);
        return tct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 19084L)
    public static SubLObject cfasl_input_generic_test_case_table(final SubLObject stream) {
        final SubLObject name = cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
        final SubLObject tuples = cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
        final SubLObject test = Symbols.symbol_function(cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED));
        final SubLObject owner = cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
        final SubLObject v_classes = cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
        final SubLObject kb = cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
        final SubLObject working_p = cfasl.cfasl_input(stream, (SubLObject)generic_testing.UNPROVIDED, (SubLObject)generic_testing.UNPROVIDED);
        return new_generic_test_case_table(name, tuples, test, owner, v_classes, kb, working_p);
    }
    
    public static SubLObject declare_generic_testing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "all_generic_test_cases", "ALL-GENERIC-TEST-CASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_print_function_trampoline", "GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_p", "GENERIC-TEST-CASE-TABLE-P", 1, 0, false);
        new $generic_test_case_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_name", "GTCT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_tuples", "GTCT-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_test", "GTCT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_owner", "GTCT-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_classes", "GTCT-CLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_kb", "GTCT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "gtct_workingP", "GTCT-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_name", "_CSETF-GTCT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_tuples", "_CSETF-GTCT-TUPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_test", "_CSETF-GTCT-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_owner", "_CSETF-GTCT-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_classes", "_CSETF-GTCT-CLASSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_kb", "_CSETF-GTCT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "_csetf_gtct_workingP", "_CSETF-GTCT-WORKING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "make_generic_test_case_table", "MAKE-GENERIC-TEST-CASE-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "visit_defstruct_generic_test_case_table", "VISIT-DEFSTRUCT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "visit_defstruct_object_generic_test_case_table_method", "VISIT-DEFSTRUCT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "new_generic_test_case_table", "NEW-GENERIC-TEST-CASE-TABLE", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_name", "GENERIC-TEST-CASE-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_tuples", "GENERIC-TEST-CASE-TABLE-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_kb", "GENERIC-TEST-CASE-TABLE-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_owner", "GENERIC-TEST-CASE-TABLE-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_workingP", "GENERIC-TEST-CASE-TABLE-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_comment", "GENERIC-TEST-CASE-TABLE-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_tuples_mentioning_some_invalid_constant", "GENERIC-TEST-CASE-TABLE-TUPLES-MENTIONING-SOME-INVALID-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_tuples_invalid_constants", "GENERIC-TEST-CASE-TABLE-TUPLES-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_tuple_mentions_invalid_constantP", "GENERIC-TEST-CASE-TABLE-TUPLE-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_case_table_tuple_invalid_constants", "GENERIC-TEST-CASE-TABLE-TUPLE-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "define_test_case_table", "DEFINE-TEST-CASE-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "undefine_test_case_table", "UNDEFINE-TEST-CASE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "undefine_all_test_case_tables", "UNDEFINE-ALL-TEST-CASE-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_table", "RUN-TEST-CASE-TABLE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_all_test_case_tables", "RUN-ALL-TEST-CASE-TABLES", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_tables_of_class", "RUN-TEST-CASE-TABLES-OF-CLASS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_tables", "RUN-TEST-CASE-TABLES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_result_p", "GENERIC-TEST-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_success_result_p", "GENERIC-TEST-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_failure_result_p", "GENERIC-TEST-FAILURE-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_error_result_p", "GENERIC-TEST-ERROR-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_not_run_result_p", "GENERIC-TEST-NOT-RUN-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_invalid_result_p", "GENERIC-TEST-INVALID-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_verbosity_level_p", "GENERIC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "test_cases_of_class", "TEST-CASES-OF-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "test_case_name_p", "TEST-CASE-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "possibly_function_symbol_p", "POSSIBLY-FUNCTION-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "define_test_case_table_int", "DEFINE-TEST-CASE-TABLE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_generic_test_case_int", "RUN-GENERIC-TEST-CASE-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_table_int", "RUN-TEST-CASE-TABLE-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_tableP", "RUN-TEST-CASE-TABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_tuple_int", "RUN-TEST-CASE-TUPLE-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "determine_run_test_case_tuple_result", "DETERMINE-RUN-TEST-CASE-TUPLE-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "generic_test_result_update", "GENERIC-TEST-RESULT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "get_gtct_by_name", "GET-GTCT-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "test_case_classes", "TEST-CASE-CLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_table_print_header", "RUN-TEST-CASE-TABLE-PRINT-HEADER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_table_print_footer", "RUN-TEST-CASE-TABLE-PRINT-FOOTER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_tuple_print_header", "RUN-TEST-CASE-TUPLE-PRINT-HEADER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "run_test_case_tuple_print_footer", "RUN-TEST-CASE-TUPLE-PRINT-FOOTER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "cfasl_output_object_generic_test_case_table_method", "CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "cfasl_wide_output_generic_test_case_table", "CFASL-WIDE-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "cfasl_output_generic_test_case_table", "CFASL-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.generic_testing", "cfasl_input_generic_test_case_table", "CFASL-INPUT-GENERIC-TEST-CASE-TABLE", 1, 0, false);
        return (SubLObject)generic_testing.NIL;
    }
    
    public static SubLObject init_generic_testing_file() {
        generic_testing.$test_case_table_index$ = SubLFiles.deflexical("*TEST-CASE-TABLE-INDEX*", maybeDefault((SubLObject)generic_testing.$sym0$_TEST_CASE_TABLE_INDEX_, generic_testing.$test_case_table_index$, ()->(Hashtables.make_hash_table((SubLObject)generic_testing.$int1$212, Symbols.symbol_function((SubLObject)generic_testing.EQL), (SubLObject)generic_testing.UNPROVIDED))));
        generic_testing.$ordered_test_cases$ = SubLFiles.deflexical("*ORDERED-TEST-CASES*", (SubLObject)(maybeDefault((SubLObject)generic_testing.$sym2$_ORDERED_TEST_CASES_, generic_testing.$ordered_test_cases$, generic_testing.NIL)));
        generic_testing.$test_case_tables_by_class$ = SubLFiles.deflexical("*TEST-CASE-TABLES-BY-CLASS*", Hashtables.make_hash_table((SubLObject)generic_testing.$int3$64, (SubLObject)generic_testing.EQL, (SubLObject)generic_testing.UNPROVIDED));
        generic_testing.$generic_test_results$ = SubLFiles.deflexical("*GENERIC-TEST-RESULTS*", (SubLObject)generic_testing.$list4);
        generic_testing.$generic_test_verbosity_levels$ = SubLFiles.deflexical("*GENERIC-TEST-VERBOSITY-LEVELS*", (SubLObject)generic_testing.$list5);
        generic_testing.$test_case_table_post_build_token$ = SubLFiles.deflexical("*TEST-CASE-TABLE-POST-BUILD-TOKEN*", (SubLObject)generic_testing.$kw6$TCT);
        generic_testing.$debug_test_case_tablesP$ = SubLFiles.defparameter("*DEBUG-TEST-CASE-TABLES?*", (SubLObject)generic_testing.NIL);
        generic_testing.$dtp_generic_test_case_table$ = SubLFiles.defconstant("*DTP-GENERIC-TEST-CASE-TABLE*", (SubLObject)generic_testing.$sym7$GENERIC_TEST_CASE_TABLE);
        generic_testing.$cfasl_wide_opcode_generic_test_case_table$ = SubLFiles.defconstant("*CFASL-WIDE-OPCODE-GENERIC-TEST-CASE-TABLE*", (SubLObject)generic_testing.$int88$512);
        return (SubLObject)generic_testing.NIL;
    }
    
    public static SubLObject setup_generic_testing_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)generic_testing.$sym0$_TEST_CASE_TABLE_INDEX_);
        subl_macro_promotions.declare_defglobal((SubLObject)generic_testing.$sym2$_ORDERED_TEST_CASES_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), generic_testing.$dtp_generic_test_case_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)generic_testing.$sym14$GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)generic_testing.$list15);
        Structures.def_csetf((SubLObject)generic_testing.$sym16$GTCT_NAME, (SubLObject)generic_testing.$sym17$_CSETF_GTCT_NAME);
        Structures.def_csetf((SubLObject)generic_testing.$sym18$GTCT_TUPLES, (SubLObject)generic_testing.$sym19$_CSETF_GTCT_TUPLES);
        Structures.def_csetf((SubLObject)generic_testing.$sym20$GTCT_TEST, (SubLObject)generic_testing.$sym21$_CSETF_GTCT_TEST);
        Structures.def_csetf((SubLObject)generic_testing.$sym22$GTCT_OWNER, (SubLObject)generic_testing.$sym23$_CSETF_GTCT_OWNER);
        Structures.def_csetf((SubLObject)generic_testing.$sym24$GTCT_CLASSES, (SubLObject)generic_testing.$sym25$_CSETF_GTCT_CLASSES);
        Structures.def_csetf((SubLObject)generic_testing.$sym26$GTCT_KB, (SubLObject)generic_testing.$sym27$_CSETF_GTCT_KB);
        Structures.def_csetf((SubLObject)generic_testing.$sym28$GTCT_WORKING_, (SubLObject)generic_testing.$sym29$_CSETF_GTCT_WORKING_);
        Equality.identity((SubLObject)generic_testing.$sym7$GENERIC_TEST_CASE_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), generic_testing.$dtp_generic_test_case_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)generic_testing.$sym42$VISIT_DEFSTRUCT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
        access_macros.register_macro_helper((SubLObject)generic_testing.$sym55$DEFINE_TEST_CASE_TABLE_INT, (SubLObject)generic_testing.$sym70$DEFINE_TEST_CASE_TABLE);
        cfasl.register_wide_cfasl_opcode_input_function(generic_testing.$cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), (SubLObject)generic_testing.$sym89$CFASL_INPUT_GENERIC_TEST_CASE_TABLE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), generic_testing.$dtp_generic_test_case_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)generic_testing.$sym90$CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
        return (SubLObject)generic_testing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_generic_testing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_generic_testing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_generic_testing_file();
    }
    
    static {
        me = (SubLFile)new generic_testing();
        generic_testing.$test_case_table_index$ = null;
        generic_testing.$ordered_test_cases$ = null;
        generic_testing.$test_case_tables_by_class$ = null;
        generic_testing.$generic_test_results$ = null;
        generic_testing.$generic_test_verbosity_levels$ = null;
        generic_testing.$test_case_table_post_build_token$ = null;
        generic_testing.$debug_test_case_tablesP$ = null;
        generic_testing.$dtp_generic_test_case_table$ = null;
        generic_testing.$cfasl_wide_opcode_generic_test_case_table$ = null;
        $sym0$_TEST_CASE_TABLE_INDEX_ = SubLObjectFactory.makeSymbol("*TEST-CASE-TABLE-INDEX*");
        $int1$212 = SubLObjectFactory.makeInteger(212);
        $sym2$_ORDERED_TEST_CASES_ = SubLObjectFactory.makeSymbol("*ORDERED-TEST-CASES*");
        $int3$64 = SubLObjectFactory.makeInteger(64);
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("FAILURE"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-RUN"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SILENT"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-BUILD"));
        $kw6$TCT = SubLObjectFactory.makeKeyword("TCT");
        $sym7$GENERIC_TEST_CASE_TABLE = SubLObjectFactory.makeSymbol("GENERIC-TEST-CASE-TABLE");
        $sym8$GENERIC_TEST_CASE_TABLE_P = SubLObjectFactory.makeSymbol("GENERIC-TEST-CASE-TABLE-P");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TUPLES"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeSymbol("WORKING?"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TUPLES"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GTCT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("GTCT-TUPLES"), (SubLObject)SubLObjectFactory.makeSymbol("GTCT-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GTCT-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("GTCT-CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("GTCT-KB"), (SubLObject)SubLObjectFactory.makeSymbol("GTCT-WORKING?"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-TUPLES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-KB"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GTCT-WORKING?"));
        $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym14$GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GENERIC-TEST-CASE-TABLE-P"));
        $sym16$GTCT_NAME = SubLObjectFactory.makeSymbol("GTCT-NAME");
        $sym17$_CSETF_GTCT_NAME = SubLObjectFactory.makeSymbol("_CSETF-GTCT-NAME");
        $sym18$GTCT_TUPLES = SubLObjectFactory.makeSymbol("GTCT-TUPLES");
        $sym19$_CSETF_GTCT_TUPLES = SubLObjectFactory.makeSymbol("_CSETF-GTCT-TUPLES");
        $sym20$GTCT_TEST = SubLObjectFactory.makeSymbol("GTCT-TEST");
        $sym21$_CSETF_GTCT_TEST = SubLObjectFactory.makeSymbol("_CSETF-GTCT-TEST");
        $sym22$GTCT_OWNER = SubLObjectFactory.makeSymbol("GTCT-OWNER");
        $sym23$_CSETF_GTCT_OWNER = SubLObjectFactory.makeSymbol("_CSETF-GTCT-OWNER");
        $sym24$GTCT_CLASSES = SubLObjectFactory.makeSymbol("GTCT-CLASSES");
        $sym25$_CSETF_GTCT_CLASSES = SubLObjectFactory.makeSymbol("_CSETF-GTCT-CLASSES");
        $sym26$GTCT_KB = SubLObjectFactory.makeSymbol("GTCT-KB");
        $sym27$_CSETF_GTCT_KB = SubLObjectFactory.makeSymbol("_CSETF-GTCT-KB");
        $sym28$GTCT_WORKING_ = SubLObjectFactory.makeSymbol("GTCT-WORKING?");
        $sym29$_CSETF_GTCT_WORKING_ = SubLObjectFactory.makeSymbol("_CSETF-GTCT-WORKING?");
        $kw30$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw31$TUPLES = SubLObjectFactory.makeKeyword("TUPLES");
        $kw32$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw33$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw34$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw35$KB = SubLObjectFactory.makeKeyword("KB");
        $kw36$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $str37$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw38$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym39$MAKE_GENERIC_TEST_CASE_TABLE = SubLObjectFactory.makeSymbol("MAKE-GENERIC-TEST-CASE-TABLE");
        $kw40$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw41$END = SubLObjectFactory.makeKeyword("END");
        $sym42$VISIT_DEFSTRUCT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD");
        $kw43$TINY = SubLObjectFactory.makeKeyword("TINY");
        $sym44$TEST_CASE_NAME_P = SubLObjectFactory.makeSymbol("TEST-CASE-NAME-P");
        $sym45$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym46$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym47$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym48$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $str49$_S_was_not_a_valid___input_____ex = SubLObjectFactory.makeString("~S was not a valid (<input> . <expected-results>) tuple");
        $str50$ = SubLObjectFactory.makeString("");
        $sym51$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-CASE-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("CLASSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)generic_testing.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("TUPLES"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $kw54$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $sym55$DEFINE_TEST_CASE_TABLE_INT = SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE-TABLE-INT");
        $sym56$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym57$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw58$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $sym59$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym60$GENERIC_TEST_VERBOSITY_LEVEL_P = SubLObjectFactory.makeSymbol("GENERIC-TEST-VERBOSITY-LEVEL-P");
        $kw61$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
        $str62$__There_is_no_test_case_table_nam = SubLObjectFactory.makeString("~%There is no test case table named ~s.");
        $kw63$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $kw64$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw65$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $kw66$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw67$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw68$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw69$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $sym70$DEFINE_TEST_CASE_TABLE = SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE-TABLE");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)generic_testing.T));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $kw73$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("EXPECTED-RESULTS"));
        $sym75$QUOTIFY = SubLObjectFactory.makeSymbol("QUOTIFY");
        $sym76$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str77$_TCT__S____ = SubLObjectFactory.makeString(":TCT ~S -> ");
        $str78$Starting__TCT__S______ = SubLObjectFactory.makeString("Starting :TCT ~S :~%~%");
        $str79$_S____3f___ = SubLObjectFactory.makeString("~S (~,3f)~%");
        $str80$__Overall_result_for___S___S__ = SubLObjectFactory.makeString("~%Overall result for '~S: ~S~%");
        $str81$Please_notify__a_cyc_com_ = SubLObjectFactory.makeString("Please notify ~a@cyc.com.");
        $str82$__Input___s____Expected_result___ = SubLObjectFactory.makeString("  Input: ~s~%  Expected result: ~s  ~%");
        $str83$__Input___s____Expected_results__ = SubLObjectFactory.makeString("  Input: ~s~%  Expected results: ~s  ~%");
        $str84$__________SUCCESS___S___ = SubLObjectFactory.makeString("~%    -> :SUCCESS (~S)~%");
        $str85$__________ERROR__S___S___ = SubLObjectFactory.makeString("~%    -> :ERROR ~S (~S)~%");
        $str86$____Actual_result___s____Compared = SubLObjectFactory.makeString("    Actual result: ~s~%  Compared via: ~s~%  -> :FAILURE (~S)~%");
        $str87$____Actual_results___s____Compare = SubLObjectFactory.makeString("    Actual results: ~s~%  Compared via: ~s~%  -> :FAILURE (~S)~%");
        $int88$512 = SubLObjectFactory.makeInteger(512);
        $sym89$CFASL_INPUT_GENERIC_TEST_CASE_TABLE = SubLObjectFactory.makeSymbol("CFASL-INPUT-GENERIC-TEST-CASE-TABLE");
        $sym90$CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD");
    }
    
    public static final class $generic_test_case_table_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $tuples;
        public SubLObject $test;
        public SubLObject $owner;
        public SubLObject $classes;
        public SubLObject $kb;
        public SubLObject $workingP;
        private static final SubLStructDeclNative structDecl;
        
        public $generic_test_case_table_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$tuples = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$classes = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$workingP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$generic_test_case_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tuples;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$test;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$owner;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$classes;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$kb;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$workingP;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tuples = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$test = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$owner = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$classes = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$kb = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$workingP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$generic_test_case_table_native.class, generic_testing.$sym7$GENERIC_TEST_CASE_TABLE, generic_testing.$sym8$GENERIC_TEST_CASE_TABLE_P, generic_testing.$list9, generic_testing.$list10, new String[] { "$name", "$tuples", "$test", "$owner", "$classes", "$kb", "$workingP" }, generic_testing.$list11, generic_testing.$list12, generic_testing.$sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $generic_test_case_table_p$UnaryFunction extends UnaryFunction
    {
        public $generic_test_case_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GENERIC-TEST-CASE-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return generic_testing.generic_test_case_table_p(arg1);
        }
    }
}

/*

	Total time: 283 ms
	 synthetic 
*/