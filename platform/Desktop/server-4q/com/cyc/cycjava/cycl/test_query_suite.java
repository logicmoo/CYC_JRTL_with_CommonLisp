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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class test_query_suite extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.test_query_suite";
    public static final String myFingerPrint = "5beca04baf5701f8aae2bf9f64a1e2f99633c4719b8e01845430f4e8016c8c9d";
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLSymbol $dtp_test_query_suite$;
    private static final SubLSymbol $sym0$TEST_QUERY_SUITE;
    private static final SubLSymbol $sym1$TEST_QUERY_SUITE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$TEST_QUERY_SUITE_PRINT;
    private static final SubLSymbol $sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$TEST_STE_CYCL_ID;
    private static final SubLSymbol $sym10$_CSETF_TEST_STE_CYCL_ID;
    private static final SubLSymbol $sym11$TEST_STE_COMMENT;
    private static final SubLSymbol $sym12$_CSETF_TEST_STE_COMMENT;
    private static final SubLSymbol $sym13$TEST_STE_MT;
    private static final SubLSymbol $sym14$_CSETF_TEST_STE_MT;
    private static final SubLSymbol $sym15$TEST_STE_QUERIES;
    private static final SubLSymbol $sym16$_CSETF_TEST_STE_QUERIES;
    private static final SubLSymbol $kw17$CYCL_ID;
    private static final SubLSymbol $kw18$COMMENT;
    private static final SubLSymbol $kw19$MT;
    private static final SubLSymbol $kw20$QUERIES;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_TEST_QUERY_SUITE;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD;
    private static final SubLString $str27$___A_test_query_suite___;
    private static final SubLString $str28$_Aid___A__;
    private static final SubLString $str29$_Acomment___A__;
    private static final SubLString $str30$_Amt___A__;
    private static final SubLString $str31$_Aqueries_;
    private static final SubLString $str32$__S;
    private static final SubLString $str33$_;
    private static final SubLSymbol $sym34$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLObject $const35$KBContentTestSpecificationType;
    private static final SubLString $str36$Got_bad_constant_id_in_test_query;
    private static final SubLSymbol $sym37$MICROTHEORY_P;
    private static final SubLObject $const38$isa;
    private static final SubLSymbol $sym39$_TEST;
    private static final SubLObject $const40$TestQueryFn;
    private static final SubLString $str41$;
    private static final SubLSymbol $sym42$STRING_LESSP;
    private static final SubLSymbol $sym43$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject test_query_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        test_query_suite_print(v_object, stream, (SubLObject)test_query_suite.ZERO_INTEGER, (SubLObject)test_query_suite.UNPROVIDED);
        return (SubLObject)test_query_suite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject test_query_suite_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $test_query_suite_native.class) ? test_query_suite.T : test_query_suite.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject test_ste_cycl_id(final SubLObject v_object) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject test_ste_comment(final SubLObject v_object) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject test_ste_mt(final SubLObject v_object) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject test_ste_queries(final SubLObject v_object) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject _csetf_test_ste_cycl_id(final SubLObject v_object, final SubLObject value) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject _csetf_test_ste_comment(final SubLObject v_object, final SubLObject value) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject _csetf_test_ste_mt(final SubLObject v_object, final SubLObject value) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject _csetf_test_ste_queries(final SubLObject v_object, final SubLObject value) {
        assert test_query_suite.NIL != test_query_suite_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject make_test_query_suite(SubLObject arglist) {
        if (arglist == test_query_suite.UNPROVIDED) {
            arglist = (SubLObject)test_query_suite.NIL;
        }
        final SubLObject v_new = (SubLObject)new $test_query_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)test_query_suite.NIL, next = arglist; test_query_suite.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)test_query_suite.$kw17$CYCL_ID)) {
                _csetf_test_ste_cycl_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)test_query_suite.$kw18$COMMENT)) {
                _csetf_test_ste_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)test_query_suite.$kw19$MT)) {
                _csetf_test_ste_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)test_query_suite.$kw20$QUERIES)) {
                _csetf_test_ste_queries(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)test_query_suite.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject visit_defstruct_test_query_suite(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)test_query_suite.$kw22$BEGIN, (SubLObject)test_query_suite.$sym23$MAKE_TEST_QUERY_SUITE, (SubLObject)test_query_suite.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)test_query_suite.$kw24$SLOT, (SubLObject)test_query_suite.$kw17$CYCL_ID, test_ste_cycl_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)test_query_suite.$kw24$SLOT, (SubLObject)test_query_suite.$kw18$COMMENT, test_ste_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)test_query_suite.$kw24$SLOT, (SubLObject)test_query_suite.$kw19$MT, test_ste_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)test_query_suite.$kw24$SLOT, (SubLObject)test_query_suite.$kw20$QUERIES, test_ste_queries(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)test_query_suite.$kw25$END, (SubLObject)test_query_suite.$sym23$MAKE_TEST_QUERY_SUITE, (SubLObject)test_query_suite.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
    public static SubLObject visit_defstruct_object_test_query_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_test_query_suite(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1405L)
    public static SubLObject test_query_suite_cycl_id(final SubLObject test_suite) {
        assert test_query_suite.NIL != test_query_suite_p(test_suite) : test_suite;
        return test_ste_cycl_id(test_suite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1543L)
    public static SubLObject test_query_suite_comment(final SubLObject test_suite) {
        assert test_query_suite.NIL != test_query_suite_p(test_suite) : test_suite;
        return test_ste_comment(test_suite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1681L)
    public static SubLObject test_query_suite_mt(final SubLObject test_suite) {
        assert test_query_suite.NIL != test_query_suite_p(test_suite) : test_suite;
        return test_ste_mt(test_suite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1809L)
    public static SubLObject test_query_suite_queries(final SubLObject test_suite) {
        assert test_query_suite.NIL != test_query_suite_p(test_suite) : test_suite;
        return test_ste_queries(test_suite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1947L)
    public static SubLObject test_query_suite_print(final SubLObject tsuite, final SubLObject stream, final SubLObject depth, SubLObject verboseP) {
        if (verboseP == test_query_suite.UNPROVIDED) {
            verboseP = (SubLObject)test_query_suite.NIL;
        }
        final SubLObject indent1 = Strings.make_string(depth, (SubLObject)test_query_suite.UNPROVIDED);
        final SubLObject indent2 = Strings.make_string(Numbers.add(depth, (SubLObject)test_query_suite.THREE_INTEGER), (SubLObject)test_query_suite.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)test_query_suite.$str27$___A_test_query_suite___, indent1);
        PrintLow.format(stream, (SubLObject)test_query_suite.$str28$_Aid___A__, indent2, test_query_suite_cycl_id(tsuite));
        if (test_query_suite.NIL != verboseP && test_query_suite_comment(tsuite).isString()) {
            PrintLow.format(stream, (SubLObject)test_query_suite.$str29$_Acomment___A__, indent2, test_query_suite_comment(tsuite));
        }
        PrintLow.format(stream, (SubLObject)test_query_suite.$str30$_Amt___A__, indent2, test_query_suite_mt(tsuite));
        PrintLow.format(stream, (SubLObject)test_query_suite.$str31$_Aqueries_, indent2);
        if (test_query_suite.NIL != verboseP) {
            streams_high.terpri(stream);
            SubLObject cdolist_list_var = test_query_suite_queries(tsuite);
            SubLObject query = (SubLObject)test_query_suite.NIL;
            query = cdolist_list_var.first();
            while (test_query_suite.NIL != cdolist_list_var) {
                cycl_query_specification.cycl_query_specification_print(query, stream, Numbers.add((SubLObject)test_query_suite.THREE_INTEGER, depth));
                cdolist_list_var = cdolist_list_var.rest();
                query = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)test_query_suite.$str32$__S, Sequences.length(test_query_suite_queries(tsuite)));
        }
        print_high.princ((SubLObject)test_query_suite.$str33$_, stream);
        return (SubLObject)test_query_suite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 2816L)
    public static SubLObject test_query_suite_get(final SubLObject constant_id, SubLObject mt) {
        if (mt == test_query_suite.UNPROVIDED) {
            mt = (SubLObject)test_query_suite.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert test_query_suite.NIL != cycl_grammar.cycl_denotational_term_p(constant_id) : constant_id;
        if (test_query_suite.NIL == isa.isaP(constant_id, test_query_suite.$const35$KBContentTestSpecificationType, mt, (SubLObject)test_query_suite.UNPROVIDED)) {
            Errors.error((SubLObject)test_query_suite.$str36$Got_bad_constant_id_in_test_query);
        }
        if (test_query_suite.NIL != mt && !test_query_suite.assertionsDisabledInClass && test_query_suite.NIL == fort_types_interface.microtheory_p(mt)) {
            throw new AssertionError(mt);
        }
        final SubLObject result = test_query_suite_new(constant_id, mt);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            _csetf_test_ste_cycl_id(result, constant_id);
            thread.resetMultipleValues();
            final SubLObject values = fi.fi_ask_int((SubLObject)ConsesLow.list(test_query_suite.$const38$isa, (SubLObject)test_query_suite.$sym39$_TEST, constant_id), mt, (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED);
            final SubLObject v_answer = thread.secondMultipleValue();
            final SubLObject reason = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = values;
            SubLObject binding = (SubLObject)test_query_suite.NIL;
            binding = cdolist_list_var.first();
            while (test_query_suite.NIL != cdolist_list_var) {
                binding = binding.first().rest();
                _csetf_test_ste_queries(result, ConsesLow.nconc(test_ste_queries(result), (SubLObject)ConsesLow.list(cycl_query_specification.cycl_query_specification_get((SubLObject)ConsesLow.list(test_query_suite.$const40$TestQueryFn, binding), mt))));
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 3856L)
    public static SubLObject test_query_suite_find_query_by_id(final SubLObject test_suite, final SubLObject query_id) {
        SubLObject result = (SubLObject)test_query_suite.NIL;
        if (test_query_suite.NIL == result) {
            SubLObject csome_list_var = test_query_suite_queries(test_suite);
            SubLObject query = (SubLObject)test_query_suite.NIL;
            query = csome_list_var.first();
            while (test_query_suite.NIL == result && test_query_suite.NIL != csome_list_var) {
                if (cycl_query_specification.cycl_query_specification_cycl_id(query).equal(query_id)) {
                    result = query;
                }
                csome_list_var = csome_list_var.rest();
                query = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4131L)
    public static SubLObject test_query_suite_set_queries(final SubLObject test_suite, final SubLObject new_queries) {
        _csetf_test_ste_queries(test_suite, new_queries);
        return test_suite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4273L)
    public static SubLObject test_query_suite_find_query_siblings(final SubLObject test_suite, final SubLObject query) {
        return Sequences.remove(query, test_query_suite_queries(test_suite), (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED, (SubLObject)test_query_suite.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4407L)
    public static SubLObject test_query_suite_new(final SubLObject id, final SubLObject mt) {
        final SubLObject result = make_test_query_suite((SubLObject)test_query_suite.UNPROVIDED);
        _csetf_test_ste_cycl_id(result, id);
        _csetf_test_ste_comment(result, (SubLObject)test_query_suite.$str41$);
        _csetf_test_ste_mt(result, (test_query_suite.NIL != function_terms.nat_formula_p(mt)) ? narts_high.find_nart(mt) : mt);
        _csetf_test_ste_queries(result, (SubLObject)test_query_suite.NIL);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4824L)
    public static SubLObject cycl_query_specification_comment_comparator(final SubLObject item_a, final SubLObject item_b) {
        if (test_query_suite.NIL == cycl_query_specification.cycl_query_specification_comment(item_a)) {
            if (test_query_suite.NIL == cycl_query_specification.cycl_query_specification_comment(item_b)) {
                return (SubLObject)test_query_suite.T;
            }
            return (SubLObject)test_query_suite.NIL;
        }
        else {
            if (test_query_suite.NIL == cycl_query_specification.cycl_query_specification_comment(item_b)) {
                return (SubLObject)test_query_suite.T;
            }
            return Functions.funcall(Symbols.symbol_function((SubLObject)test_query_suite.$sym42$STRING_LESSP), cycl_query_specification.cycl_query_specification_comment(item_a), cycl_query_specification.cycl_query_specification_comment(item_b));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 5263L)
    public static SubLObject test_query_suite_sort_by_comment(final SubLObject test_suite) {
        _csetf_test_ste_queries(test_suite, Sort.sort(test_query_suite_queries(test_suite), Symbols.symbol_function((SubLObject)test_query_suite.$sym43$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR), (SubLObject)test_query_suite.UNPROVIDED));
        return test_suite;
    }
    
    public static SubLObject declare_test_query_suite_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_print_function_trampoline", "TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_p", "TEST-QUERY-SUITE-P", 1, 0, false);
        new $test_query_suite_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_ste_cycl_id", "TEST-STE-CYCL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_ste_comment", "TEST-STE-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_ste_mt", "TEST-STE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_ste_queries", "TEST-STE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "_csetf_test_ste_cycl_id", "_CSETF-TEST-STE-CYCL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "_csetf_test_ste_comment", "_CSETF-TEST-STE-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "_csetf_test_ste_mt", "_CSETF-TEST-STE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "_csetf_test_ste_queries", "_CSETF-TEST-STE-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "make_test_query_suite", "MAKE-TEST-QUERY-SUITE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "visit_defstruct_test_query_suite", "VISIT-DEFSTRUCT-TEST-QUERY-SUITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "visit_defstruct_object_test_query_suite_method", "VISIT-DEFSTRUCT-OBJECT-TEST-QUERY-SUITE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_cycl_id", "TEST-QUERY-SUITE-CYCL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_comment", "TEST-QUERY-SUITE-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_mt", "TEST-QUERY-SUITE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_queries", "TEST-QUERY-SUITE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_print", "TEST-QUERY-SUITE-PRINT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_get", "TEST-QUERY-SUITE-GET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_find_query_by_id", "TEST-QUERY-SUITE-FIND-QUERY-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_set_queries", "TEST-QUERY-SUITE-SET-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_find_query_siblings", "TEST-QUERY-SUITE-FIND-QUERY-SIBLINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_new", "TEST-QUERY-SUITE-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "cycl_query_specification_comment_comparator", "CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_query_suite", "test_query_suite_sort_by_comment", "TEST-QUERY-SUITE-SORT-BY-COMMENT", 1, 0, false);
        return (SubLObject)test_query_suite.NIL;
    }
    
    public static SubLObject init_test_query_suite_file() {
        test_query_suite.$dtp_test_query_suite$ = SubLFiles.defconstant("*DTP-TEST-QUERY-SUITE*", (SubLObject)test_query_suite.$sym0$TEST_QUERY_SUITE);
        return (SubLObject)test_query_suite.NIL;
    }
    
    public static SubLObject setup_test_query_suite_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), test_query_suite.$dtp_test_query_suite$.getGlobalValue(), Symbols.symbol_function((SubLObject)test_query_suite.$sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)test_query_suite.$list8);
        Structures.def_csetf((SubLObject)test_query_suite.$sym9$TEST_STE_CYCL_ID, (SubLObject)test_query_suite.$sym10$_CSETF_TEST_STE_CYCL_ID);
        Structures.def_csetf((SubLObject)test_query_suite.$sym11$TEST_STE_COMMENT, (SubLObject)test_query_suite.$sym12$_CSETF_TEST_STE_COMMENT);
        Structures.def_csetf((SubLObject)test_query_suite.$sym13$TEST_STE_MT, (SubLObject)test_query_suite.$sym14$_CSETF_TEST_STE_MT);
        Structures.def_csetf((SubLObject)test_query_suite.$sym15$TEST_STE_QUERIES, (SubLObject)test_query_suite.$sym16$_CSETF_TEST_STE_QUERIES);
        Equality.identity((SubLObject)test_query_suite.$sym0$TEST_QUERY_SUITE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), test_query_suite.$dtp_test_query_suite$.getGlobalValue(), Symbols.symbol_function((SubLObject)test_query_suite.$sym26$VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD));
        return (SubLObject)test_query_suite.NIL;
    }
    
    public void declareFunctions() {
        declare_test_query_suite_file();
    }
    
    public void initializeVariables() {
        init_test_query_suite_file();
    }
    
    public void runTopLevelForms() {
        setup_test_query_suite_file();
    }
    
    static {
        me = (SubLFile)new test_query_suite();
        test_query_suite.$dtp_test_query_suite$ = null;
        $sym0$TEST_QUERY_SUITE = SubLObjectFactory.makeSymbol("TEST-QUERY-SUITE");
        $sym1$TEST_QUERY_SUITE_P = SubLObjectFactory.makeSymbol("TEST-QUERY-SUITE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("QUERIES"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-STE-CYCL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-STE-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-STE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-STE-QUERIES"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-CYCL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-QUERIES"));
        $sym6$TEST_QUERY_SUITE_PRINT = SubLObjectFactory.makeSymbol("TEST-QUERY-SUITE-PRINT");
        $sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-QUERY-SUITE-P"));
        $sym9$TEST_STE_CYCL_ID = SubLObjectFactory.makeSymbol("TEST-STE-CYCL-ID");
        $sym10$_CSETF_TEST_STE_CYCL_ID = SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-CYCL-ID");
        $sym11$TEST_STE_COMMENT = SubLObjectFactory.makeSymbol("TEST-STE-COMMENT");
        $sym12$_CSETF_TEST_STE_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-COMMENT");
        $sym13$TEST_STE_MT = SubLObjectFactory.makeSymbol("TEST-STE-MT");
        $sym14$_CSETF_TEST_STE_MT = SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-MT");
        $sym15$TEST_STE_QUERIES = SubLObjectFactory.makeSymbol("TEST-STE-QUERIES");
        $sym16$_CSETF_TEST_STE_QUERIES = SubLObjectFactory.makeSymbol("_CSETF-TEST-STE-QUERIES");
        $kw17$CYCL_ID = SubLObjectFactory.makeKeyword("CYCL-ID");
        $kw18$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw19$MT = SubLObjectFactory.makeKeyword("MT");
        $kw20$QUERIES = SubLObjectFactory.makeKeyword("QUERIES");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_TEST_QUERY_SUITE = SubLObjectFactory.makeSymbol("MAKE-TEST-QUERY-SUITE");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEST-QUERY-SUITE-METHOD");
        $str27$___A_test_query_suite___ = SubLObjectFactory.makeString("~%~A<test-query-suite:~%");
        $str28$_Aid___A__ = SubLObjectFactory.makeString("~Aid: ~A~%");
        $str29$_Acomment___A__ = SubLObjectFactory.makeString("~Acomment: ~A~%");
        $str30$_Amt___A__ = SubLObjectFactory.makeString("~Amt: ~A~%");
        $str31$_Aqueries_ = SubLObjectFactory.makeString("~Aqueries:");
        $str32$__S = SubLObjectFactory.makeString(" ~S");
        $str33$_ = SubLObjectFactory.makeString(">");
        $sym34$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $const35$KBContentTestSpecificationType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentTestSpecificationType"));
        $str36$Got_bad_constant_id_in_test_query = SubLObjectFactory.makeString("Got bad constant-id in test-query-suite-get!");
        $sym37$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $const38$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym39$_TEST = SubLObjectFactory.makeSymbol("?TEST");
        $const40$TestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestQueryFn"));
        $str41$ = SubLObjectFactory.makeString("");
        $sym42$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym43$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR");
    }
    
    public static final class $test_query_suite_native extends SubLStructNative
    {
        public SubLObject $cycl_id;
        public SubLObject $comment;
        public SubLObject $mt;
        public SubLObject $queries;
        private static final SubLStructDeclNative structDecl;
        
        public $test_query_suite_native() {
            this.$cycl_id = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$queries = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$test_query_suite_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl_id;
        }
        
        public SubLObject getField3() {
            return this.$comment;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$queries;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl_id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$queries = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$test_query_suite_native.class, test_query_suite.$sym0$TEST_QUERY_SUITE, test_query_suite.$sym1$TEST_QUERY_SUITE_P, test_query_suite.$list2, test_query_suite.$list3, new String[] { "$cycl_id", "$comment", "$mt", "$queries" }, test_query_suite.$list4, test_query_suite.$list5, test_query_suite.$sym6$TEST_QUERY_SUITE_PRINT);
        }
    }
    
    public static final class $test_query_suite_p$UnaryFunction extends UnaryFunction
    {
        public $test_query_suite_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TEST-QUERY-SUITE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return test_query_suite.test_query_suite_p(arg1);
        }
    }
}

/*

	Total time: 84 ms
	 synthetic 
*/