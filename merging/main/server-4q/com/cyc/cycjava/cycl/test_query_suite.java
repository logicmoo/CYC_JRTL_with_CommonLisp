/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TEST-QUERY-SUITE
 * source file: /cyc/top/cycl/test-query-suite.lisp
 * created:     2019/07/03 17:38:14
 */
public final class test_query_suite extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt35$ = makeString("");

    public static final SubLFile me = new test_query_suite();

 public static final String myName = "com.cyc.cycjava.cycl.test_query_suite";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_test_query_suite$ = makeSymbol("*DTP-TEST-QUERY-SUITE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol TEST_QUERY_SUITE = makeSymbol("TEST-QUERY-SUITE");

    private static final SubLSymbol TEST_QUERY_SUITE_P = makeSymbol("TEST-QUERY-SUITE-P");

    static private final SubLList $list2 = list(makeSymbol("CYCL-ID"), makeSymbol("COMMENT"), makeSymbol("MT"), makeSymbol("QUERIES"));

    static private final SubLList $list3 = list(makeKeyword("CYCL-ID"), makeKeyword("COMMENT"), makeKeyword("MT"), makeKeyword("QUERIES"));

    static private final SubLList $list4 = list(makeSymbol("TEST-STE-CYCL-ID"), makeSymbol("TEST-STE-COMMENT"), makeSymbol("TEST-STE-MT"), makeSymbol("TEST-STE-QUERIES"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-TEST-STE-CYCL-ID"), makeSymbol("_CSETF-TEST-STE-COMMENT"), makeSymbol("_CSETF-TEST-STE-MT"), makeSymbol("_CSETF-TEST-STE-QUERIES"));

    private static final SubLSymbol TEST_QUERY_SUITE_PRINT = makeSymbol("TEST-QUERY-SUITE-PRINT");

    private static final SubLSymbol TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TEST-QUERY-SUITE-P"));

    private static final SubLSymbol TEST_STE_CYCL_ID = makeSymbol("TEST-STE-CYCL-ID");

    private static final SubLSymbol _CSETF_TEST_STE_CYCL_ID = makeSymbol("_CSETF-TEST-STE-CYCL-ID");

    private static final SubLSymbol TEST_STE_COMMENT = makeSymbol("TEST-STE-COMMENT");

    private static final SubLSymbol _CSETF_TEST_STE_COMMENT = makeSymbol("_CSETF-TEST-STE-COMMENT");

    private static final SubLSymbol TEST_STE_MT = makeSymbol("TEST-STE-MT");

    private static final SubLSymbol _CSETF_TEST_STE_MT = makeSymbol("_CSETF-TEST-STE-MT");

    private static final SubLSymbol TEST_STE_QUERIES = makeSymbol("TEST-STE-QUERIES");

    private static final SubLSymbol _CSETF_TEST_STE_QUERIES = makeSymbol("_CSETF-TEST-STE-QUERIES");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TEST_QUERY_SUITE = makeSymbol("MAKE-TEST-QUERY-SUITE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEST-QUERY-SUITE-METHOD");

    private static final SubLString $str27$___A_test_query_suite___ = makeString("~%~A<test-query-suite:~%");

    private static final SubLString $str28$_Aid___A__ = makeString("~Aid: ~A~%");

    private static final SubLString $str29$_Acomment___A__ = makeString("~Acomment: ~A~%");

    private static final SubLString $str30$_Amt___A__ = makeString("~Amt: ~A~%");

    private static final SubLString $str31$_Aqueries_ = makeString("~Aqueries:");

    private static final SubLString $str32$__S = makeString(" ~S");

    private static final SubLString $str33$_ = makeString(">");



    private static final SubLString $str36$Got_bad_constant_id_in_test_query = makeString("Got bad constant-id in test-query-suite-get!");



    private static final SubLSymbol $sym39$_TEST = makeSymbol("?TEST");



    private static final SubLString $str41$ = makeString("");

    private static final SubLSymbol CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR = makeSymbol("CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR");

    public static final SubLObject test_query_suite_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        test_query_suite_print(v_object, stream, ZERO_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static SubLObject test_query_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        test_query_suite_print(v_object, stream, ZERO_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject test_query_suite_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.test_query_suite.$test_query_suite_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject test_query_suite_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.test_query_suite.$test_query_suite_native.class ? T : NIL;
    }

    public static final SubLObject test_ste_cycl_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.getField2();
    }

    public static SubLObject test_ste_cycl_id(final SubLObject v_object) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject test_ste_comment_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.getField3();
    }

    public static SubLObject test_ste_comment(final SubLObject v_object) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject test_ste_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.getField4();
    }

    public static SubLObject test_ste_mt(final SubLObject v_object) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject test_ste_queries_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.getField5();
    }

    public static SubLObject test_ste_queries(final SubLObject v_object) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_test_ste_cycl_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_test_ste_cycl_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_test_ste_comment_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_test_ste_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_test_ste_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_test_ste_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_test_ste_queries_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEST_QUERY_SUITE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_test_ste_queries(final SubLObject v_object, final SubLObject value) {
        assert NIL != test_query_suite_p(v_object) : "! test_query_suite.test_query_suite_p(v_object) " + "test_query_suite.test_query_suite_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_test_query_suite_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.test_query_suite.$test_query_suite_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL_ID)) {
                        _csetf_test_ste_cycl_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($COMMENT)) {
                            _csetf_test_ste_comment(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MT)) {
                                _csetf_test_ste_mt(v_new, current_value);
                            } else {
                                if (pcase_var.eql($QUERIES)) {
                                    _csetf_test_ste_queries(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_test_query_suite(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.test_query_suite.$test_query_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL_ID)) {
                _csetf_test_ste_cycl_id(v_new, current_value);
            } else
                if (pcase_var.eql($COMMENT)) {
                    _csetf_test_ste_comment(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_test_ste_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERIES)) {
                            _csetf_test_ste_queries(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_test_query_suite(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TEST_QUERY_SUITE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL_ID, test_ste_cycl_id(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, test_ste_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, test_ste_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERIES, test_ste_queries(obj));
        funcall(visitor_fn, obj, $END, MAKE_TEST_QUERY_SUITE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_test_query_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_test_query_suite(obj, visitor_fn);
    }

    public static final SubLObject test_query_suite_cycl_id_alt(SubLObject test_suite) {
        SubLTrampolineFile.checkType(test_suite, TEST_QUERY_SUITE_P);
        return test_ste_cycl_id(test_suite);
    }

    public static SubLObject test_query_suite_cycl_id(final SubLObject test_suite) {
        assert NIL != test_query_suite_p(test_suite) : "! test_query_suite.test_query_suite_p(test_suite) " + ("test_query_suite.test_query_suite_p(test_suite) " + "CommonSymbols.NIL != test_query_suite.test_query_suite_p(test_suite) ") + test_suite;
        return test_ste_cycl_id(test_suite);
    }

    public static final SubLObject test_query_suite_comment_alt(SubLObject test_suite) {
        SubLTrampolineFile.checkType(test_suite, TEST_QUERY_SUITE_P);
        return test_ste_comment(test_suite);
    }

    public static SubLObject test_query_suite_comment(final SubLObject test_suite) {
        assert NIL != test_query_suite_p(test_suite) : "! test_query_suite.test_query_suite_p(test_suite) " + ("test_query_suite.test_query_suite_p(test_suite) " + "CommonSymbols.NIL != test_query_suite.test_query_suite_p(test_suite) ") + test_suite;
        return test_ste_comment(test_suite);
    }

    public static final SubLObject test_query_suite_mt_alt(SubLObject test_suite) {
        SubLTrampolineFile.checkType(test_suite, TEST_QUERY_SUITE_P);
        return test_ste_mt(test_suite);
    }

    public static SubLObject test_query_suite_mt(final SubLObject test_suite) {
        assert NIL != test_query_suite_p(test_suite) : "! test_query_suite.test_query_suite_p(test_suite) " + ("test_query_suite.test_query_suite_p(test_suite) " + "CommonSymbols.NIL != test_query_suite.test_query_suite_p(test_suite) ") + test_suite;
        return test_ste_mt(test_suite);
    }

    public static final SubLObject test_query_suite_queries_alt(SubLObject test_suite) {
        SubLTrampolineFile.checkType(test_suite, TEST_QUERY_SUITE_P);
        return test_ste_queries(test_suite);
    }

    public static SubLObject test_query_suite_queries(final SubLObject test_suite) {
        assert NIL != test_query_suite_p(test_suite) : "! test_query_suite.test_query_suite_p(test_suite) " + ("test_query_suite.test_query_suite_p(test_suite) " + "CommonSymbols.NIL != test_query_suite.test_query_suite_p(test_suite) ") + test_suite;
        return test_ste_queries(test_suite);
    }

    public static final SubLObject test_query_suite_print_alt(SubLObject tsuite, SubLObject stream, SubLObject depth, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            SubLObject indent1 = Strings.make_string(depth, UNPROVIDED);
            SubLObject indent2 = Strings.make_string(add(depth, THREE_INTEGER), UNPROVIDED);
            format(stream, $str_alt21$___A_test_query_suite___, indent1);
            format(stream, $str_alt22$_Aid___A__, indent2, test_query_suite_cycl_id(tsuite));
            if ((NIL != verboseP) && test_query_suite_comment(tsuite).isString()) {
                format(stream, $str_alt23$_Acomment___A__, indent2, test_query_suite_comment(tsuite));
            }
            format(stream, $str_alt24$_Amt___A__, indent2, test_query_suite_mt(tsuite));
            format(stream, $str_alt25$_Aqueries_, indent2);
            if (NIL != verboseP) {
                terpri(stream);
                {
                    SubLObject cdolist_list_var = test_query_suite_queries(tsuite);
                    SubLObject query = NIL;
                    for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                        cycl_query_specification.cycl_query_specification_print(query, stream, add(THREE_INTEGER, depth));
                    }
                }
            } else {
                format(stream, $str_alt26$__S, length(test_query_suite_queries(tsuite)));
            }
            princ($str_alt27$_, stream);
        }
        return NIL;
    }

    public static SubLObject test_query_suite_print(final SubLObject tsuite, final SubLObject stream, final SubLObject depth, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLObject indent1 = Strings.make_string(depth, UNPROVIDED);
        final SubLObject indent2 = Strings.make_string(add(depth, THREE_INTEGER), UNPROVIDED);
        format(stream, $str27$___A_test_query_suite___, indent1);
        format(stream, $str28$_Aid___A__, indent2, test_query_suite_cycl_id(tsuite));
        if ((NIL != verboseP) && test_query_suite_comment(tsuite).isString()) {
            format(stream, $str29$_Acomment___A__, indent2, test_query_suite_comment(tsuite));
        }
        format(stream, $str30$_Amt___A__, indent2, test_query_suite_mt(tsuite));
        format(stream, $str31$_Aqueries_, indent2);
        if (NIL != verboseP) {
            terpri(stream);
            SubLObject cdolist_list_var = test_query_suite_queries(tsuite);
            SubLObject query = NIL;
            query = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cycl_query_specification.cycl_query_specification_print(query, stream, add(THREE_INTEGER, depth));
                cdolist_list_var = cdolist_list_var.rest();
                query = cdolist_list_var.first();
            } 
        } else {
            format(stream, $str32$__S, length(test_query_suite_queries(tsuite)));
        }
        princ($str33$_, stream);
        return NIL;
    }

    /**
     * Given the cyc-constant for a KBContentTestSpecificationType and an mt, reads the test suite from the KB and returns it as a test-query-suite structure.
     */
    @LispMethod(comment = "Given the cyc-constant for a KBContentTestSpecificationType and an mt, reads the test suite from the KB and returns it as a test-query-suite structure.")
    public static final SubLObject test_query_suite_get_alt(SubLObject constant_id, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant_id, CYCL_DENOTATIONAL_TERM_P);
            if (NIL == isa.isaP(constant_id, $$KBContentTestSpecificationType, mt, UNPROVIDED)) {
                Errors.error($str_alt30$Got_bad_constant_id_in_test_query);
            }
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, MICROTHEORY_P);
            }
            {
                SubLObject result = test_query_suite_new(constant_id, mt);
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        _csetf_test_ste_cycl_id(result, constant_id);
                        thread.resetMultipleValues();
                        {
                            SubLObject values = fi.fi_ask_int(list($$isa, $sym33$_TEST, constant_id), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject v_answer = thread.secondMultipleValue();
                            SubLObject reason = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = values;
                                SubLObject binding = NIL;
                                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                    binding = binding.first().rest();
                                    _csetf_test_ste_queries(result, nconc(test_ste_queries(result), list(cycl_query_specification.cycl_query_specification_get(list($$TestQueryFn, binding), mt))));
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given the cyc-constant for a KBContentTestSpecificationType and an mt, reads the test suite from the KB and returns it as a test-query-suite structure.
     */
    @LispMethod(comment = "Given the cyc-constant for a KBContentTestSpecificationType and an mt, reads the test suite from the KB and returns it as a test-query-suite structure.")
    public static SubLObject test_query_suite_get(final SubLObject constant_id, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(constant_id) : "! cycl_grammar.cycl_denotational_term_p(constant_id) " + ("cycl_grammar.cycl_denotational_term_p(constant_id) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(constant_id) ") + constant_id;
        if (NIL == isa.isaP(constant_id, $$KBContentTestSpecificationType, mt, UNPROVIDED)) {
            Errors.error($str36$Got_bad_constant_id_in_test_query);
        }
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == fort_types_interface.microtheory_p(mt))) {
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
            final SubLObject values = fi.fi_ask_int(list($$isa, $sym39$_TEST, constant_id), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject v_answer = thread.secondMultipleValue();
            final SubLObject reason = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = values;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                binding = binding.first().rest();
                _csetf_test_ste_queries(result, nconc(test_ste_queries(result), list(cycl_query_specification.cycl_query_specification_get(list($$TestQueryFn, binding), mt))));
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject test_query_suite_find_query_by_id_alt(SubLObject test_suite, SubLObject query_id) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = test_query_suite_queries(test_suite);
                    SubLObject query = NIL;
                    for (query = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , query = csome_list_var.first()) {
                        if (cycl_query_specification.cycl_query_specification_cycl_id(query).equal(query_id)) {
                            result = query;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject test_query_suite_find_query_by_id(final SubLObject test_suite, final SubLObject query_id) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = test_query_suite_queries(test_suite);
            SubLObject query = NIL;
            query = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (cycl_query_specification.cycl_query_specification_cycl_id(query).equal(query_id)) {
                    result = query;
                }
                csome_list_var = csome_list_var.rest();
                query = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject test_query_suite_set_queries_alt(SubLObject test_suite, SubLObject new_queries) {
        _csetf_test_ste_queries(test_suite, new_queries);
        return test_suite;
    }

    public static SubLObject test_query_suite_set_queries(final SubLObject test_suite, final SubLObject new_queries) {
        _csetf_test_ste_queries(test_suite, new_queries);
        return test_suite;
    }

    public static final SubLObject test_query_suite_find_query_siblings_alt(SubLObject test_suite, SubLObject query) {
        return remove(query, test_query_suite_queries(test_suite), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject test_query_suite_find_query_siblings(final SubLObject test_suite, final SubLObject query) {
        return remove(query, test_query_suite_queries(test_suite), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Makes a new test-query-suite with the appropriate defaults.
     */
    @LispMethod(comment = "Makes a new test-query-suite with the appropriate defaults.")
    public static final SubLObject test_query_suite_new_alt(SubLObject id, SubLObject mt) {
        {
            SubLObject result = make_test_query_suite(UNPROVIDED);
            _csetf_test_ste_cycl_id(result, id);
            _csetf_test_ste_comment(result, $str_alt35$);
            _csetf_test_ste_mt(result, NIL != function_terms.nat_formula_p(mt) ? ((SubLObject) (narts_high.find_nart(mt))) : mt);
            _csetf_test_ste_queries(result, NIL);
            return result;
        }
    }

    /**
     * Makes a new test-query-suite with the appropriate defaults.
     */
    @LispMethod(comment = "Makes a new test-query-suite with the appropriate defaults.")
    public static SubLObject test_query_suite_new(final SubLObject id, final SubLObject mt) {
        final SubLObject result = make_test_query_suite(UNPROVIDED);
        _csetf_test_ste_cycl_id(result, id);
        _csetf_test_ste_comment(result, $str41$);
        _csetf_test_ste_mt(result, NIL != function_terms.nat_formula_p(mt) ? narts_high.find_nart(mt) : mt);
        _csetf_test_ste_queries(result, NIL);
        return result;
    }

    public static final SubLObject cycl_query_specification_comment_comparator_alt(SubLObject item_a, SubLObject item_b) {
        if (NIL == cycl_query_specification.cycl_query_specification_comment(item_a)) {
            if (NIL == cycl_query_specification.cycl_query_specification_comment(item_b)) {
                return T;
            }
            return NIL;
        }
        if (NIL == cycl_query_specification.cycl_query_specification_comment(item_b)) {
            return T;
        }
        return funcall(symbol_function(STRING_LESSP), cycl_query_specification.cycl_query_specification_comment(item_a), cycl_query_specification.cycl_query_specification_comment(item_b));
    }

    public static SubLObject cycl_query_specification_comment_comparator(final SubLObject item_a, final SubLObject item_b) {
        if (NIL == cycl_query_specification.cycl_query_specification_comment(item_a)) {
            if (NIL == cycl_query_specification.cycl_query_specification_comment(item_b)) {
                return T;
            }
            return NIL;
        } else {
            if (NIL == cycl_query_specification.cycl_query_specification_comment(item_b)) {
                return T;
            }
            return funcall(symbol_function(STRING_LESSP), cycl_query_specification.cycl_query_specification_comment(item_a), cycl_query_specification.cycl_query_specification_comment(item_b));
        }
    }

    /**
     * Sorts the queries in the suite by ordering the comment fields of the individual queries.
     */
    @LispMethod(comment = "Sorts the queries in the suite by ordering the comment fields of the individual queries.")
    public static final SubLObject test_query_suite_sort_by_comment_alt(SubLObject test_suite) {
        _csetf_test_ste_queries(test_suite, Sort.sort(test_query_suite_queries(test_suite), symbol_function(CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR), UNPROVIDED));
        return test_suite;
    }

    /**
     * Sorts the queries in the suite by ordering the comment fields of the individual queries.
     */
    @LispMethod(comment = "Sorts the queries in the suite by ordering the comment fields of the individual queries.")
    public static SubLObject test_query_suite_sort_by_comment(final SubLObject test_suite) {
        _csetf_test_ste_queries(test_suite, Sort.sort(test_query_suite_queries(test_suite), symbol_function(CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR), UNPROVIDED));
        return test_suite;
    }

    public static SubLObject declare_test_query_suite_file() {
        declareFunction("test_query_suite_print_function_trampoline", "TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("test_query_suite_p", "TEST-QUERY-SUITE-P", 1, 0, false);
        new test_query_suite.$test_query_suite_p$UnaryFunction();
        declareFunction("test_ste_cycl_id", "TEST-STE-CYCL-ID", 1, 0, false);
        declareFunction("test_ste_comment", "TEST-STE-COMMENT", 1, 0, false);
        declareFunction("test_ste_mt", "TEST-STE-MT", 1, 0, false);
        declareFunction("test_ste_queries", "TEST-STE-QUERIES", 1, 0, false);
        declareFunction("_csetf_test_ste_cycl_id", "_CSETF-TEST-STE-CYCL-ID", 2, 0, false);
        declareFunction("_csetf_test_ste_comment", "_CSETF-TEST-STE-COMMENT", 2, 0, false);
        declareFunction("_csetf_test_ste_mt", "_CSETF-TEST-STE-MT", 2, 0, false);
        declareFunction("_csetf_test_ste_queries", "_CSETF-TEST-STE-QUERIES", 2, 0, false);
        declareFunction("make_test_query_suite", "MAKE-TEST-QUERY-SUITE", 0, 1, false);
        declareFunction("visit_defstruct_test_query_suite", "VISIT-DEFSTRUCT-TEST-QUERY-SUITE", 2, 0, false);
        declareFunction("visit_defstruct_object_test_query_suite_method", "VISIT-DEFSTRUCT-OBJECT-TEST-QUERY-SUITE-METHOD", 2, 0, false);
        declareFunction("test_query_suite_cycl_id", "TEST-QUERY-SUITE-CYCL-ID", 1, 0, false);
        declareFunction("test_query_suite_comment", "TEST-QUERY-SUITE-COMMENT", 1, 0, false);
        declareFunction("test_query_suite_mt", "TEST-QUERY-SUITE-MT", 1, 0, false);
        declareFunction("test_query_suite_queries", "TEST-QUERY-SUITE-QUERIES", 1, 0, false);
        declareFunction("test_query_suite_print", "TEST-QUERY-SUITE-PRINT", 3, 1, false);
        declareFunction("test_query_suite_get", "TEST-QUERY-SUITE-GET", 1, 1, false);
        declareFunction("test_query_suite_find_query_by_id", "TEST-QUERY-SUITE-FIND-QUERY-BY-ID", 2, 0, false);
        declareFunction("test_query_suite_set_queries", "TEST-QUERY-SUITE-SET-QUERIES", 2, 0, false);
        declareFunction("test_query_suite_find_query_siblings", "TEST-QUERY-SUITE-FIND-QUERY-SIBLINGS", 2, 0, false);
        declareFunction("test_query_suite_new", "TEST-QUERY-SUITE-NEW", 2, 0, false);
        declareFunction("cycl_query_specification_comment_comparator", "CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR", 2, 0, false);
        declareFunction("test_query_suite_sort_by_comment", "TEST-QUERY-SUITE-SORT-BY-COMMENT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("CYCL-ID"), makeSymbol("COMMENT"), makeSymbol("MT"), makeSymbol("QUERIES"));

    static private final SubLList $list_alt3 = list(makeKeyword("CYCL-ID"), makeKeyword("COMMENT"), makeKeyword("MT"), makeKeyword("QUERIES"));

    static private final SubLList $list_alt4 = list(makeSymbol("TEST-STE-CYCL-ID"), makeSymbol("TEST-STE-COMMENT"), makeSymbol("TEST-STE-MT"), makeSymbol("TEST-STE-QUERIES"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-TEST-STE-CYCL-ID"), makeSymbol("_CSETF-TEST-STE-COMMENT"), makeSymbol("_CSETF-TEST-STE-MT"), makeSymbol("_CSETF-TEST-STE-QUERIES"));

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt21$___A_test_query_suite___ = makeString("~%~A<test-query-suite:~%");

    static private final SubLString $str_alt22$_Aid___A__ = makeString("~Aid: ~A~%");

    public static SubLObject init_test_query_suite_file() {
        defconstant("*DTP-TEST-QUERY-SUITE*", TEST_QUERY_SUITE);
        return NIL;
    }

    static private final SubLString $str_alt23$_Acomment___A__ = makeString("~Acomment: ~A~%");

    static private final SubLString $str_alt24$_Amt___A__ = makeString("~Amt: ~A~%");

    public static SubLObject setup_test_query_suite_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_test_query_suite$.getGlobalValue(), symbol_function(TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(TEST_STE_CYCL_ID, _CSETF_TEST_STE_CYCL_ID);
        def_csetf(TEST_STE_COMMENT, _CSETF_TEST_STE_COMMENT);
        def_csetf(TEST_STE_MT, _CSETF_TEST_STE_MT);
        def_csetf(TEST_STE_QUERIES, _CSETF_TEST_STE_QUERIES);
        identity(TEST_QUERY_SUITE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_test_query_suite$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt25$_Aqueries_ = makeString("~Aqueries:");

    static private final SubLString $str_alt26$__S = makeString(" ~S");

    static private final SubLString $str_alt27$_ = makeString(">");

    static private final SubLString $str_alt30$Got_bad_constant_id_in_test_query = makeString("Got bad constant-id in test-query-suite-get!");

    static private final SubLSymbol $sym33$_TEST = makeSymbol("?TEST");

    @Override
    public void declareFunctions() {
        declare_test_query_suite_file();
    }

    @Override
    public void initializeVariables() {
        init_test_query_suite_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_test_query_suite_file();
    }

    

    public static final class $test_query_suite_native extends SubLStructNative {
        public SubLObject $cycl_id;

        public SubLObject $comment;

        public SubLObject $mt;

        public SubLObject $queries;

        private static final SubLStructDeclNative structDecl;

        public $test_query_suite_native() {
            test_query_suite.$test_query_suite_native.this.$cycl_id = Lisp.NIL;
            test_query_suite.$test_query_suite_native.this.$comment = Lisp.NIL;
            test_query_suite.$test_query_suite_native.this.$mt = Lisp.NIL;
            test_query_suite.$test_query_suite_native.this.$queries = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return test_query_suite.$test_query_suite_native.this.$cycl_id;
        }

        @Override
        public SubLObject getField3() {
            return test_query_suite.$test_query_suite_native.this.$comment;
        }

        @Override
        public SubLObject getField4() {
            return test_query_suite.$test_query_suite_native.this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return test_query_suite.$test_query_suite_native.this.$queries;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return test_query_suite.$test_query_suite_native.this.$cycl_id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return test_query_suite.$test_query_suite_native.this.$comment = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return test_query_suite.$test_query_suite_native.this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return test_query_suite.$test_query_suite_native.this.$queries = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.test_query_suite.$test_query_suite_native.class, TEST_QUERY_SUITE, TEST_QUERY_SUITE_P, $list2, $list3, new String[]{ "$cycl_id", "$comment", "$mt", "$queries" }, $list4, $list5, TEST_QUERY_SUITE_PRINT);
        }
    }

    public static final class $test_query_suite_p$UnaryFunction extends UnaryFunction {
        public $test_query_suite_p$UnaryFunction() {
            super(extractFunctionNamed("TEST-QUERY-SUITE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return test_query_suite_p(arg1);
        }
    }
}

/**
 * Total time: 84 ms synthetic
 */
