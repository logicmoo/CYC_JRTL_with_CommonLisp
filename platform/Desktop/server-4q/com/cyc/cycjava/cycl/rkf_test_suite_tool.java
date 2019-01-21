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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_test_suite_tool extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_test_suite_tool";
    public static final String myFingerPrint = "14859974241283cb5c29b792f0018685b754f8aa9d52c4fb3d3005e34fedd48c";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLSymbol $dtp_ts_query$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4702L)
    private static SubLSymbol $rkf_ts_test_case$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4820L)
    private static SubLSymbol $rkf_ts_label$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4873L)
    private static SubLSymbol $rkf_ts_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4928L)
    private static SubLSymbol $rkf_ts_microtheory$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4987L)
    private static SubLSymbol $rkf_ts_settings$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5049L)
    private static SubLSymbol $rkf_ts_number$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5103L)
    private static SubLSymbol $rkf_ts_time$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5155L)
    private static SubLSymbol $rkf_ts_backchaining$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5215L)
    private static SubLSymbol $rkf_ts_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5268L)
    private static SubLSymbol $rkf_ts_token_interaction_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5342L)
    private static SubLSymbol $rkf_ts_token_everything$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5405L)
    private static SubLSymbol $rkf_ts_token_forever$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5465L)
    private static SubLSymbol $rkf_ts_token_none$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLSymbol $dtp_rkf_test_suite$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 10435L)
    private static SubLSymbol $rkf_ts_definition$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 10554L)
    private static SubLSymbol $rkf_ts_test_suite$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 12094L)
    public static SubLSymbol $test_suite_query_default_label$;
    private static final SubLSymbol $sym0$RKF_TEST_SUITE_P;
    private static final SubLSymbol $sym1$TS_QUERY;
    private static final SubLSymbol $sym2$TS_QUERY_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym8$TS_QUERY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$TS_QUERY_ID;
    private static final SubLSymbol $sym11$_CSETF_TS_QUERY_ID;
    private static final SubLSymbol $sym12$TS_QUERY_LABEL;
    private static final SubLSymbol $sym13$_CSETF_TS_QUERY_LABEL;
    private static final SubLSymbol $sym14$TS_QUERY_FORMULA;
    private static final SubLSymbol $sym15$_CSETF_TS_QUERY_FORMULA;
    private static final SubLSymbol $sym16$TS_QUERY_MT;
    private static final SubLSymbol $sym17$_CSETF_TS_QUERY_MT;
    private static final SubLSymbol $sym18$TS_QUERY_NUMBER;
    private static final SubLSymbol $sym19$_CSETF_TS_QUERY_NUMBER;
    private static final SubLSymbol $sym20$TS_QUERY_TIME;
    private static final SubLSymbol $sym21$_CSETF_TS_QUERY_TIME;
    private static final SubLSymbol $sym22$TS_QUERY_BACKCHAIN;
    private static final SubLSymbol $sym23$_CSETF_TS_QUERY_BACKCHAIN;
    private static final SubLSymbol $sym24$TS_QUERY_DEPTH;
    private static final SubLSymbol $sym25$_CSETF_TS_QUERY_DEPTH;
    private static final SubLSymbol $sym26$TS_QUERY_EXPECTED;
    private static final SubLSymbol $sym27$_CSETF_TS_QUERY_EXPECTED;
    private static final SubLSymbol $kw28$ID;
    private static final SubLSymbol $kw29$LABEL;
    private static final SubLSymbol $kw30$FORMULA;
    private static final SubLSymbol $kw31$MT;
    private static final SubLSymbol $kw32$NUMBER;
    private static final SubLSymbol $kw33$TIME;
    private static final SubLSymbol $kw34$BACKCHAIN;
    private static final SubLSymbol $kw35$DEPTH;
    private static final SubLSymbol $kw36$EXPECTED;
    private static final SubLString $str37$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw38$BEGIN;
    private static final SubLSymbol $sym39$MAKE_TS_QUERY;
    private static final SubLSymbol $kw40$SLOT;
    private static final SubLSymbol $kw41$END;
    private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_TS_QUERY_METHOD;
    private static final SubLString $str43$_testcase_;
    private static final SubLString $str44$_label_;
    private static final SubLString $str45$_formula_;
    private static final SubLString $str46$_microtheory_;
    private static final SubLString $str47$_settings_;
    private static final SubLString $str48$_number_;
    private static final SubLString $str49$_time_;
    private static final SubLString $str50$_backchaining_;
    private static final SubLString $str51$_depth_;
    private static final SubLString $str52$_interaction_mt__;
    private static final SubLString $str53$_everything__;
    private static final SubLString $str54$_forever__;
    private static final SubLString $str55$_none__;
    private static final SubLString $str56$Invalid_input_file_format__Expect;
    private static final SubLString $str57$Invalid_input_file_format__Expect;
    private static final SubLSymbol $sym58$SEARCH;
    private static final SubLSymbol $sym59$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str60$Skipping_Query__A_due_to_error__A;
    private static final SubLSymbol $kw61$INTERACTION_MT;
    private static final SubLString $str62$NIL;
    private static final SubLSymbol $sym63$RKF_TEST_SUITE;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$RKF_TEST_SUITE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$RKF_TSUITE_ISG;
    private static final SubLSymbol $sym71$_CSETF_RKF_TSUITE_ISG;
    private static final SubLSymbol $sym72$RKF_TSUITE_LABEL;
    private static final SubLSymbol $sym73$_CSETF_RKF_TSUITE_LABEL;
    private static final SubLSymbol $sym74$RKF_TSUITE_FILENAME;
    private static final SubLSymbol $sym75$_CSETF_RKF_TSUITE_FILENAME;
    private static final SubLSymbol $sym76$RKF_TSUITE_QUERIES;
    private static final SubLSymbol $sym77$_CSETF_RKF_TSUITE_QUERIES;
    private static final SubLSymbol $sym78$RKF_TSUITE_SIBLINGS;
    private static final SubLSymbol $sym79$_CSETF_RKF_TSUITE_SIBLINGS;
    private static final SubLSymbol $kw80$ISG;
    private static final SubLSymbol $kw81$FILENAME;
    private static final SubLSymbol $kw82$QUERIES;
    private static final SubLSymbol $kw83$SIBLINGS;
    private static final SubLSymbol $sym84$MAKE_RKF_TEST_SUITE;
    private static final SubLSymbol $sym85$VISIT_DEFSTRUCT_OBJECT_RKF_TEST_SUITE_METHOD;
    private static final SubLSymbol $sym86$_;
    private static final SubLString $str87$_definition_;
    private static final SubLString $str88$_testsuite_;
    private static final SubLSymbol $kw89$INPUT;
    private static final SubLString $str90$Unable_to_open__S;
    private static final SubLString $str91$unnamed_query;
    private static final SubLString $str92$__;
    private static final SubLSymbol $kw93$OUTPUT;
    private static final SubLString $str94$__;
    private static final SubLSymbol $kw95$TRUTH;
    private static final SubLList $list96;
    private static final SubLSymbol $kw97$PRO;
    private static final SubLSymbol $kw98$CON;
    private static final SubLSymbol $kw99$QUERY;
    private static final SubLList $list100;
    private static final SubLSymbol $kw101$ASK;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$ASSERTION_P;
    private static final SubLSymbol $sym104$FORT_P;
    private static final SubLSymbol $sym105$STRING_;
    private static final SubLSymbol $sym106$FORT_NAME;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 769L)
    public static SubLObject new_test_suite_from_file(final SubLObject filename) {
        final SubLObject tsuite = rkf_ts_obtain_test_suite(filename);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 927L)
    public static SubLObject test_suite_save(final SubLObject tsuite) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        return rkf_ts_save_test_suite(tsuite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 1049L)
    public static SubLObject test_suite_write(final SubLObject tsuite, final SubLObject filename) {
        return rkf_ts_write_test_suite(tsuite, filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 1151L)
    public static SubLObject fetch_test_suite_query_list(final SubLObject tsuite) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        return rkf_test_suite_queries_as_list(tsuite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 1292L)
    public static SubLObject test_suite_get_number_of_queries(final SubLObject tsuite) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        return dictionary.dictionary_length(rkf_tsuite_queries(tsuite));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 1446L)
    public static SubLObject test_suite_find_query_by_id(final SubLObject tsuite, final SubLObject id) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        return dictionary.dictionary_lookup(rkf_tsuite_queries(tsuite), id, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 1601L)
    public static SubLObject test_suite_find_query_by_id_string(final SubLObject tsuite, final SubLObject id_string) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        return test_suite_find_query_by_id(tsuite, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 1803L)
    public static SubLObject test_suite_query_siblings(final SubLObject query, final SubLObject tsuite) {
        final SubLObject siblings_dict = rkf_tsuite_siblings(tsuite);
        final SubLObject label = ts_query_label(query);
        final SubLObject siblings = dictionary.dictionary_lookup(siblings_dict, label, (SubLObject)rkf_test_suite_tool.NIL);
        return siblings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2026L)
    public static SubLObject test_suite_add_query(final SubLObject tsuite, final SubLObject query) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        return rkf_ts_insert_query(tsuite, query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2161L)
    public static SubLObject test_suite_drop_query(final SubLObject tsuite, final SubLObject id) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(tsuite) : tsuite;
        final SubLObject query = test_suite_find_query_by_id(tsuite, id);
        rkf_ts_remove_query_from_siblings(query, tsuite);
        dictionary.dictionary_remove(rkf_tsuite_queries(tsuite), id);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2431L)
    public static SubLObject test_suite_run_query(final SubLObject tsuite, final SubLObject id, SubLObject current_mt) {
        if (current_mt == rkf_test_suite_tool.UNPROVIDED) {
            current_mt = (SubLObject)rkf_test_suite_tool.NIL;
        }
        final SubLObject query = test_suite_find_query_by_id(tsuite, id);
        return rkf_ts_run_query(tsuite, query, current_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_test_suite_tool.ZERO_INTEGER);
        return (SubLObject)rkf_test_suite_tool.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ts_query_native.class) ? rkf_test_suite_tool.T : rkf_test_suite_tool.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_id(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_label(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_formula(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_mt(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_number(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_time(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_backchain(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_depth(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject ts_query_expected(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_label(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_formula(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_number(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_time(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_backchain(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_depth(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject _csetf_ts_query_expected(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != ts_query_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject make_ts_query(SubLObject arglist) {
        if (arglist == rkf_test_suite_tool.UNPROVIDED) {
            arglist = (SubLObject)rkf_test_suite_tool.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ts_query_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_test_suite_tool.NIL, next = arglist; rkf_test_suite_tool.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw28$ID)) {
                _csetf_ts_query_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw29$LABEL)) {
                _csetf_ts_query_label(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw30$FORMULA)) {
                _csetf_ts_query_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw31$MT)) {
                _csetf_ts_query_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw32$NUMBER)) {
                _csetf_ts_query_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw33$TIME)) {
                _csetf_ts_query_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw34$BACKCHAIN)) {
                _csetf_ts_query_backchain(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw35$DEPTH)) {
                _csetf_ts_query_depth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw36$EXPECTED)) {
                _csetf_ts_query_expected(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_test_suite_tool.$str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject visit_defstruct_ts_query(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw38$BEGIN, (SubLObject)rkf_test_suite_tool.$sym39$MAKE_TS_QUERY, (SubLObject)rkf_test_suite_tool.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw28$ID, ts_query_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw29$LABEL, ts_query_label(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw30$FORMULA, ts_query_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw31$MT, ts_query_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw32$NUMBER, ts_query_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw33$TIME, ts_query_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw34$BACKCHAIN, ts_query_backchain(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw35$DEPTH, ts_query_depth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw36$EXPECTED, ts_query_expected(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw41$END, (SubLObject)rkf_test_suite_tool.$sym39$MAKE_TS_QUERY, (SubLObject)rkf_test_suite_tool.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 2616L)
    public static SubLObject visit_defstruct_object_ts_query_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ts_query(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 3045L)
    public static SubLObject new_ts_query(final SubLObject label, final SubLObject formula, final SubLObject microtheory, final SubLObject number, final SubLObject time, final SubLObject backchaining, final SubLObject depth, SubLObject expected) {
        if (expected == rkf_test_suite_tool.UNPROVIDED) {
            expected = (SubLObject)rkf_test_suite_tool.NIL;
        }
        final SubLObject tsq = make_ts_query((SubLObject)rkf_test_suite_tool.UNPROVIDED);
        _csetf_ts_query_label(tsq, label);
        _csetf_ts_query_formula(tsq, formula);
        _csetf_ts_query_mt(tsq, microtheory);
        _csetf_ts_query_number(tsq, number);
        _csetf_ts_query_time(tsq, time);
        _csetf_ts_query_backchain(tsq, backchaining);
        _csetf_ts_query_depth(tsq, depth);
        _csetf_ts_query_expected(tsq, expected);
        return tsq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 3612L)
    public static SubLObject clone_ts_query(final SubLObject ts_query) {
        final SubLObject label = ts_query_label(ts_query);
        final SubLObject formula = ts_query_formula(ts_query);
        final SubLObject mt = ts_query_mt(ts_query);
        final SubLObject number = ts_query_number(ts_query);
        final SubLObject time = ts_query_time(ts_query);
        final SubLObject backchain = ts_query_backchain(ts_query);
        final SubLObject depth = ts_query_depth(ts_query);
        final SubLObject expected = ts_query_expected(ts_query);
        final SubLObject new_query = new_ts_query(label, formula, mt, number, time, backchain, depth, expected);
        _csetf_ts_query_id(new_query, ts_query_id(ts_query));
        return ts_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4227L)
    public static SubLObject ts_query_label_update(final SubLObject ts_query, final SubLObject label, final SubLObject tsuite) {
        rkf_ts_remove_query_from_siblings(ts_query, tsuite);
        _csetf_ts_query_label(ts_query, label);
        rkf_ts_update_query_siblings(ts_query, tsuite);
        return ts_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 4576L)
    public static SubLObject ts_query_formula_update(final SubLObject ts_query, final SubLObject formula) {
        _csetf_ts_query_formula(ts_query, formula);
        return ts_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 5522L)
    public static SubLObject rkf_ts_parse_testcase_tokens(final SubLObject tokens) {
        SubLObject curr = tokens;
        SubLObject queries = (SubLObject)rkf_test_suite_tool.NIL;
        while (rkf_test_suite_tool.NIL != web_utilities.test_for_html_tagP(curr, rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue())) {
            SubLObject label = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject formula = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject microtheory = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject number = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject time = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject backchaining = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject depth = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            label = curr.first();
            curr = curr.rest();
            final SubLObject marker_$1 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$1, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), marker_$1);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_formula$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_formula$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            formula = curr.first();
            curr = curr.rest();
            final SubLObject marker_$2 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$2, rkf_test_suite_tool.$rkf_ts_formula$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_formula$.getGlobalValue(), marker_$2);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_microtheory$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_microtheory$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            microtheory = curr.first();
            curr = curr.rest();
            final SubLObject marker_$3 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$3, rkf_test_suite_tool.$rkf_ts_microtheory$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_microtheory$.getGlobalValue(), marker_$3);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_settings$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_settings$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_number$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_number$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            number = curr.first();
            curr = curr.rest();
            final SubLObject marker_$4 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$4, rkf_test_suite_tool.$rkf_ts_number$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_number$.getGlobalValue(), marker_$4);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_time$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_time$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            time = curr.first();
            curr = curr.rest();
            final SubLObject marker_$5 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$5, rkf_test_suite_tool.$rkf_ts_time$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_time$.getGlobalValue(), marker_$5);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_backchaining$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_backchaining$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            backchaining = curr.first();
            curr = curr.rest();
            final SubLObject marker_$6 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$6, rkf_test_suite_tool.$rkf_ts_backchaining$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_backchaining$.getGlobalValue(), marker_$6);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_depth$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_depth$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            depth = curr.first();
            curr = curr.rest();
            final SubLObject marker_$7 = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$7, rkf_test_suite_tool.$rkf_ts_depth$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_depth$.getGlobalValue(), marker_$7);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker, rkf_test_suite_tool.$rkf_ts_settings$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_settings$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            marker = curr.first();
            if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker, rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue())) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            curr = conses_high.member(rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), curr, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym58$SEARCH), (SubLObject)rkf_test_suite_tool.UNPROVIDED);
            final SubLObject query = rkf_ts_interpret_parse(label, formula, microtheory, number, time, backchaining, depth);
            if (rkf_test_suite_tool.NIL != query) {
                queries = (SubLObject)ConsesLow.cons(query, queries);
            }
        }
        return Sequences.nreverse(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 6735L)
    public static SubLObject rkf_ts_interpret_parse(final SubLObject label, SubLObject formula, SubLObject microtheory, SubLObject number, SubLObject time, SubLObject backchaining, SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)rkf_test_suite_tool.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)rkf_test_suite_tool.$sym59$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    formula = reader.read_from_string(formula, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_test_suite_tool.NIL);
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
        if (error_message.isString()) {
            Errors.warn((SubLObject)rkf_test_suite_tool.$str60$Skipping_Query__A_due_to_error__A, label, error_message);
            return (SubLObject)rkf_test_suite_tool.NIL;
        }
        microtheory = (SubLObject)((rkf_test_suite_tool.NIL != Strings.string_equal(microtheory, rkf_test_suite_tool.$rkf_ts_token_interaction_mt$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) ? rkf_test_suite_tool.$kw61$INTERACTION_MT : reader.read_from_string(microtheory, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED));
        number = (SubLObject)((rkf_test_suite_tool.NIL != Strings.string_equal(number, rkf_test_suite_tool.$rkf_ts_token_everything$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) ? rkf_test_suite_tool.NIL : reader.parse_integer(number, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED));
        time = (SubLObject)((rkf_test_suite_tool.NIL != Strings.string_equal(time, rkf_test_suite_tool.$rkf_ts_token_forever$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) ? rkf_test_suite_tool.NIL : reader.parse_integer(time, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED));
        if (rkf_test_suite_tool.NIL != Strings.string_equal(backchaining, rkf_test_suite_tool.$rkf_ts_token_none$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
            backchaining = (SubLObject)rkf_test_suite_tool.NIL;
        }
        else if (rkf_test_suite_tool.NIL != Strings.string_equal(backchaining, rkf_test_suite_tool.$rkf_ts_token_forever$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
            backchaining = (SubLObject)rkf_test_suite_tool.T;
        }
        else {
            backchaining = reader.parse_integer(backchaining, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        }
        if (rkf_test_suite_tool.NIL != Strings.string_equal(depth, (SubLObject)rkf_test_suite_tool.$str62$NIL, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
            depth = (SubLObject)rkf_test_suite_tool.NIL;
        }
        else {
            depth = reader.parse_integer(depth, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        }
        return new_ts_query(label, formula, microtheory, number, time, backchaining, depth, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 7986L)
    public static SubLObject rkf_ts_write_one_query(final SubLObject s, final SubLObject query) {
        write_opening_tag(rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), s);
        streams_high.terpri(s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), ts_query_label(query), s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_formula$.getGlobalValue(), ts_query_formula(query), s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_microtheory$.getGlobalValue(), (ts_query_mt(query) == rkf_test_suite_tool.$kw61$INTERACTION_MT) ? rkf_test_suite_tool.$rkf_ts_token_interaction_mt$.getGlobalValue() : ts_query_mt(query), s);
        write_opening_tag(rkf_test_suite_tool.$rkf_ts_settings$.getGlobalValue(), s);
        streams_high.terpri(s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_number$.getGlobalValue(), (rkf_test_suite_tool.NIL == ts_query_number(query)) ? rkf_test_suite_tool.$rkf_ts_token_everything$.getGlobalValue() : ts_query_number(query), s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_time$.getGlobalValue(), (rkf_test_suite_tool.NIL == ts_query_time(query)) ? rkf_test_suite_tool.$rkf_ts_token_forever$.getGlobalValue() : ts_query_time(query), s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_backchaining$.getGlobalValue(), (rkf_test_suite_tool.NIL == ts_query_backchain(query)) ? rkf_test_suite_tool.$rkf_ts_token_none$.getGlobalValue() : ((rkf_test_suite_tool.T == ts_query_backchain(query)) ? rkf_test_suite_tool.$rkf_ts_token_forever$.getGlobalValue() : ts_query_backchain(query)), s);
        write_tagged_value(rkf_test_suite_tool.$rkf_ts_depth$.getGlobalValue(), ts_query_depth(query), s);
        write_closing_tag(rkf_test_suite_tool.$rkf_ts_settings$.getGlobalValue(), s);
        streams_high.terpri(s);
        write_closing_tag(rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), s);
        return streams_high.terpri(s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_test_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_test_suite_tool.ZERO_INTEGER);
        return (SubLObject)rkf_test_suite_tool.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_test_suite_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_test_suite_native.class) ? rkf_test_suite_tool.T : rkf_test_suite_tool.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_tsuite_isg(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_tsuite_label(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_tsuite_filename(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_tsuite_queries(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject rkf_tsuite_siblings(final SubLObject v_object) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject _csetf_rkf_tsuite_isg(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject _csetf_rkf_tsuite_label(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject _csetf_rkf_tsuite_filename(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject _csetf_rkf_tsuite_queries(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject _csetf_rkf_tsuite_siblings(final SubLObject v_object, final SubLObject value) {
        assert rkf_test_suite_tool.NIL != rkf_test_suite_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject make_rkf_test_suite(SubLObject arglist) {
        if (arglist == rkf_test_suite_tool.UNPROVIDED) {
            arglist = (SubLObject)rkf_test_suite_tool.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_test_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_test_suite_tool.NIL, next = arglist; rkf_test_suite_tool.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw80$ISG)) {
                _csetf_rkf_tsuite_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw29$LABEL)) {
                _csetf_rkf_tsuite_label(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw81$FILENAME)) {
                _csetf_rkf_tsuite_filename(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw82$QUERIES)) {
                _csetf_rkf_tsuite_queries(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_test_suite_tool.$kw83$SIBLINGS)) {
                _csetf_rkf_tsuite_siblings(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_test_suite_tool.$str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject visit_defstruct_rkf_test_suite(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw38$BEGIN, (SubLObject)rkf_test_suite_tool.$sym84$MAKE_RKF_TEST_SUITE, (SubLObject)rkf_test_suite_tool.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw80$ISG, rkf_tsuite_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw29$LABEL, rkf_tsuite_label(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw81$FILENAME, rkf_tsuite_filename(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw82$QUERIES, rkf_tsuite_queries(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw40$SLOT, (SubLObject)rkf_test_suite_tool.$kw83$SIBLINGS, rkf_tsuite_siblings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_test_suite_tool.$kw41$END, (SubLObject)rkf_test_suite_tool.$sym84$MAKE_RKF_TEST_SUITE, (SubLObject)rkf_test_suite_tool.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9527L)
    public static SubLObject visit_defstruct_object_rkf_test_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_test_suite(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 9916L)
    public static SubLObject new_rkf_tsuite(final SubLObject filename) {
        final SubLObject tsuite = make_rkf_test_suite((SubLObject)rkf_test_suite_tool.UNPROVIDED);
        _csetf_rkf_tsuite_isg(tsuite, integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED));
        _csetf_rkf_tsuite_filename(tsuite, filename);
        _csetf_rkf_tsuite_queries(tsuite, dictionary.new_dictionary((SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED));
        _csetf_rkf_tsuite_siblings(tsuite, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQUALP), (SubLObject)rkf_test_suite_tool.UNPROVIDED));
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 10264L)
    public static SubLObject rkf_test_suite_queries_as_list(final SubLObject tsuite) {
        final SubLObject queries = dictionary.dictionary_values(rkf_tsuite_queries(tsuite));
        return Sort.sort(queries, (SubLObject)rkf_test_suite_tool.$sym86$_, (SubLObject)rkf_test_suite_tool.$sym10$TS_QUERY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 10609L)
    public static SubLObject rkf_ts_obtain_test_suite(final SubLObject filename) {
        final SubLObject tokens = rkf_ts_fetch_test_suite_in_xml(filename);
        final SubLObject tsuite = new_rkf_tsuite(filename);
        return rkf_ts_parse_test_suite_tokens(tsuite, tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 10867L)
    public static SubLObject rkf_ts_fetch_test_suite_in_xml(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject stream = (SubLObject)rkf_test_suite_tool.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rkf_test_suite_tool.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)rkf_test_suite_tool.$kw89$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str90$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            tokens = xml_parsing_utilities.xml_tokenize(s, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_test_suite_tool.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        SubLObject cleansed = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)rkf_test_suite_tool.NIL;
        token = cdolist_list_var.first();
        while (rkf_test_suite_tool.NIL != cdolist_list_var) {
            final SubLObject clean_token = rkf_ts_cleaned_string(token);
            if (!Sequences.length(clean_token).isZero()) {
                cleansed = (SubLObject)ConsesLow.cons(clean_token, cleansed);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        tokens = Sequences.nreverse(cleansed);
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 11296L)
    public static SubLObject rkf_ts_cleaned_string(SubLObject string) {
        string = string_utilities.nsubst_whitespace(string);
        return string_utilities.reduce_whitespace(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 11427L)
    public static SubLObject rkf_ts_parse_test_suite_tokens(final SubLObject tsuite, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject label = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject queries = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject error_message = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject curr = conses_high.member(rkf_test_suite_tool.$rkf_ts_definition$.getGlobalValue(), tokens, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym58$SEARCH), (SubLObject)rkf_test_suite_tool.UNPROVIDED).rest();
        final SubLObject marker = curr.first();
        if (rkf_test_suite_tool.NIL == Strings.string_equal(marker, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED)) {
            Errors.error((SubLObject)rkf_test_suite_tool.$str56$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), marker);
        }
        curr = curr.rest();
        label = curr.first();
        curr = curr.rest();
        final SubLObject marker_$8 = curr.first();
        if (rkf_test_suite_tool.NIL == web_utilities.is_html_terminating_tagP(marker_$8, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue())) {
            Errors.error((SubLObject)rkf_test_suite_tool.$str57$Invalid_input_file_format__Expect, rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), marker_$8);
        }
        curr = curr.rest();
        _csetf_rkf_tsuite_label(tsuite, label);
        curr = conses_high.member(rkf_test_suite_tool.$rkf_ts_test_case$.getGlobalValue(), curr, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym58$SEARCH), (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)rkf_test_suite_tool.$sym59$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    queries = rkf_ts_parse_testcase_tokens(curr);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_test_suite_tool.NIL);
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
        if (error_message.isString()) {
            return error_message;
        }
        SubLObject cdolist_list_var = queries;
        SubLObject query = (SubLObject)rkf_test_suite_tool.NIL;
        query = cdolist_list_var.first();
        while (rkf_test_suite_tool.NIL != cdolist_list_var) {
            rkf_ts_insert_query(tsuite, query);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        rkf_ts_finalize_test_suite(tsuite);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 12167L)
    public static SubLObject rkf_ts_insert_query(final SubLObject tsuite, final SubLObject query) {
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(rkf_tsuite_isg(tsuite));
        _csetf_ts_query_id(query, id);
        final SubLObject label = ts_query_label(query);
        if (label.equalp(rkf_test_suite_tool.$test_suite_query_default_label$.getGlobalValue())) {
            final SubLObject new_label = Sequences.cconcatenate(rkf_test_suite_tool.$test_suite_query_default_label$.getGlobalValue(), new SubLObject[] { rkf_test_suite_tool.$str92$__, string_utilities.str(id) });
            ts_query_label_update(query, new_label, tsuite);
        }
        dictionary.dictionary_enter(rkf_tsuite_queries(tsuite), id, query);
        rkf_ts_update_query_siblings(query, tsuite);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 12727L)
    public static SubLObject rkf_ts_finalize_test_suite(final SubLObject tsuite) {
        return rkf_ts_initialize_all_siblings(tsuite);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 12829L)
    public static SubLObject rkf_ts_initialize_all_siblings(final SubLObject tsuite) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rkf_tsuite_queries(tsuite))); rkf_test_suite_tool.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject query = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rkf_ts_update_query_siblings(query, tsuite);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 13045L)
    public static SubLObject rkf_ts_update_query_siblings(final SubLObject query, final SubLObject tsuite) {
        final SubLObject siblings_dict = rkf_tsuite_siblings(tsuite);
        final SubLObject label = ts_query_label(query);
        dictionary_utilities.dictionary_pushnew(siblings_dict, label, query, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 13262L)
    public static SubLObject rkf_ts_remove_query_from_siblings(final SubLObject query, final SubLObject tsuite) {
        final SubLObject label = ts_query_label(query);
        dictionary_utilities.dictionary_remove_from_value(rkf_tsuite_siblings(tsuite), label, query, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 13462L)
    public static SubLObject rkf_ts_save_test_suite(final SubLObject tsuite) {
        final SubLObject filename = rkf_tsuite_filename(tsuite);
        return rkf_ts_write_test_suite(tsuite, filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 13661L)
    public static SubLObject rkf_ts_write_test_suite(final SubLObject tsuite, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)rkf_test_suite_tool.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rkf_test_suite_tool.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)rkf_test_suite_tool.$kw93$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rkf_test_suite_tool.$str90$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            rkf_ts_write_prologue(s, tsuite);
            rkf_ts_write_queries(s, tsuite);
            rkf_ts_write_epilogue(s, tsuite);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_test_suite_tool.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return tsuite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 13894L)
    public static SubLObject rkf_ts_write_queries(final SubLObject s, final SubLObject tsuite) {
        SubLObject cdolist_list_var = rkf_test_suite_queries_as_list(tsuite);
        SubLObject query = (SubLObject)rkf_test_suite_tool.NIL;
        query = cdolist_list_var.first();
        while (rkf_test_suite_tool.NIL != cdolist_list_var) {
            rkf_ts_write_one_query(s, query);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return s;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 14054L)
    public static SubLObject rkf_ts_write_prologue(final SubLObject s, final SubLObject tsuite) {
        write_opening_tag(rkf_test_suite_tool.$rkf_ts_test_suite$.getGlobalValue(), s);
        streams_high.terpri(s);
        streams_high.terpri(s);
        rkf_ts_write_definition(s, tsuite);
        return streams_high.terpri(s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 14229L)
    public static SubLObject rkf_ts_write_definition(final SubLObject s, final SubLObject tsuite) {
        write_opening_tag(rkf_test_suite_tool.$rkf_ts_definition$.getGlobalValue(), s);
        streams_high.terpri(s);
        write_opening_tag(rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), s);
        streams_high.write_string(rkf_tsuite_label(tsuite), s, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        write_closing_tag(rkf_test_suite_tool.$rkf_ts_label$.getGlobalValue(), s);
        streams_high.terpri(s);
        write_closing_tag(rkf_test_suite_tool.$rkf_ts_definition$.getGlobalValue(), s);
        return streams_high.terpri(s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 14543L)
    public static SubLObject rkf_ts_write_epilogue(final SubLObject s, final SubLObject tsuite) {
        streams_high.terpri(s);
        write_closing_tag(rkf_test_suite_tool.$rkf_ts_test_suite$.getGlobalValue(), s);
        return streams_high.terpri(s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 14691L)
    public static SubLObject write_tagged_value(final SubLObject tag, final SubLObject value, final SubLObject s) {
        write_opening_tag(tag, s);
        print_high.princ(value, s);
        write_closing_tag(tag, s);
        return streams_high.terpri(s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 14835L)
    public static SubLObject write_opening_tag(final SubLObject tag, final SubLObject s) {
        return streams_high.write_string(tag, s, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 14909L)
    public static SubLObject write_closing_tag(final SubLObject tag, final SubLObject s) {
        streams_high.write_string((SubLObject)rkf_test_suite_tool.$str94$__, s, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        return streams_high.write_string(tag, s, (SubLObject)rkf_test_suite_tool.ONE_INTEGER, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 15008L)
    public static SubLObject rkf_ts_run_query(final SubLObject tsuite, final SubLObject query, final SubLObject current_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = (ts_query_mt(query) == rkf_test_suite_tool.$kw61$INTERACTION_MT) ? current_mt : ts_query_mt(query);
        SubLObject answers = (SubLObject)rkf_test_suite_tool.NIL;
        thread.resetMultipleValues();
        final SubLObject type = rkf_query_utilities.rkf_generic_query(ts_query_formula(query), mt, ts_query_backchain(query), ts_query_number(query), ts_query_time(query), ts_query_depth(query));
        final SubLObject results = thread.secondMultipleValue();
        final SubLObject status = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (type == rkf_test_suite_tool.$kw95$TRUTH) {
            SubLObject current;
            final SubLObject datum = current = results;
            SubLObject pro = (SubLObject)rkf_test_suite_tool.NIL;
            SubLObject con = (SubLObject)rkf_test_suite_tool.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_test_suite_tool.$list96);
            pro = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_test_suite_tool.$list96);
            con = current.first();
            current = current.rest();
            if (rkf_test_suite_tool.NIL == current) {
                answers = (SubLObject)ConsesLow.list((SubLObject)rkf_test_suite_tool.$kw95$TRUTH, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_test_suite_tool.$kw97$PRO, pro), (SubLObject)ConsesLow.list((SubLObject)rkf_test_suite_tool.$kw98$CON, con)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_test_suite_tool.$list96);
            }
        }
        else {
            answers = (SubLObject)ConsesLow.list((SubLObject)rkf_test_suite_tool.$kw99$QUERY, rkf_query_utilities.rkf_expand_justifications(results));
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 15868L)
    public static SubLObject rkf_ts_classify_terms_for_iet_answer_page_new(final SubLObject test_suite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_question = rkf_ts_classify_terms_used_new(test_suite, query, (SubLObject)ConsesLow.list(rkf_query_utilities.rkf_determine_query_type(cycl_query_specification.cycl_query_specification_formula(query), cycl_query_specification.cycl_query_specification_mt(query)), results), mt);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject support = thread.thirdMultipleValue();
        final SubLObject assertions = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject qa = ConsesLow.append(v_question, v_answer);
        return Values.values(rkf_ts_minimal_book_keeping_info_for_terms(qa), rkf_ts_minimal_book_keeping_info_for_terms(support), assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 16469L)
    public static SubLObject rkf_ts_classify_terms_for_iet_answer_page(final SubLObject tsuite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_question = rkf_ts_classify_terms_used(tsuite, query, results, mt);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject support = thread.thirdMultipleValue();
        final SubLObject assertions = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject qa = ConsesLow.append(v_question, v_answer);
        return Values.values(rkf_ts_minimal_book_keeping_info_for_terms(qa), rkf_ts_minimal_book_keeping_info_for_terms(support), assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 16896L)
    public static SubLObject rkf_ts_classify_terms_used_new(final SubLObject test_suite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        SubLObject v_question = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject v_answer = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject support = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject assertions = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject type = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject the_results = (SubLObject)rkf_test_suite_tool.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(results, results, (SubLObject)rkf_test_suite_tool.$list100);
        type = results.first();
        SubLObject current = results.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, results, (SubLObject)rkf_test_suite_tool.$list100);
        the_results = current.first();
        current = current.rest();
        if (rkf_test_suite_tool.NIL == current) {
            if (type == rkf_test_suite_tool.$kw99$QUERY || type == rkf_test_suite_tool.$kw101$ASK) {
                SubLObject cdolist_list_var = the_results;
                SubLObject result = (SubLObject)rkf_test_suite_tool.NIL;
                result = cdolist_list_var.first();
                while (rkf_test_suite_tool.NIL != cdolist_list_var) {
                    SubLObject current_$10;
                    final SubLObject datum_$9 = current_$10 = result;
                    SubLObject v_bindings = (SubLObject)rkf_test_suite_tool.NIL;
                    SubLObject supports = (SubLObject)rkf_test_suite_tool.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)rkf_test_suite_tool.$list102);
                    v_bindings = current_$10.first();
                    current_$10 = current_$10.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)rkf_test_suite_tool.$list102);
                    supports = current_$10.first();
                    current_$10 = current_$10.rest();
                    if (rkf_test_suite_tool.NIL == current_$10) {
                        final SubLObject binding_terms = rkf_ts_gather_used_terms(v_bindings);
                        final SubLObject support_terms = rkf_ts_gather_used_support_terms(supports);
                        final SubLObject assertion_ids = rkf_ts_gather_used_support_assertions(supports);
                        SubLObject cdolist_list_var_$11 = binding_terms;
                        SubLObject v_term = (SubLObject)rkf_test_suite_tool.NIL;
                        v_term = cdolist_list_var_$11.first();
                        while (rkf_test_suite_tool.NIL != cdolist_list_var_$11) {
                            final SubLObject item_var = v_term;
                            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, v_answer, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                                v_answer = (SubLObject)ConsesLow.cons(item_var, v_answer);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            v_term = cdolist_list_var_$11.first();
                        }
                        SubLObject cdolist_list_var_$12 = support_terms;
                        v_term = (SubLObject)rkf_test_suite_tool.NIL;
                        v_term = cdolist_list_var_$12.first();
                        while (rkf_test_suite_tool.NIL != cdolist_list_var_$12) {
                            final SubLObject item_var = v_term;
                            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, support, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                                support = (SubLObject)ConsesLow.cons(item_var, support);
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            v_term = cdolist_list_var_$12.first();
                        }
                        SubLObject cdolist_list_var_$13 = assertion_ids;
                        SubLObject assertion_id = (SubLObject)rkf_test_suite_tool.NIL;
                        assertion_id = cdolist_list_var_$13.first();
                        while (rkf_test_suite_tool.NIL != cdolist_list_var_$13) {
                            final SubLObject item_var = assertion_id;
                            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                                assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                            }
                            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                            assertion_id = cdolist_list_var_$13.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)rkf_test_suite_tool.$list102);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                }
            }
            else {
                final SubLObject pro_args = conses_high.assoc((SubLObject)rkf_test_suite_tool.$kw97$PRO, the_results, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                final SubLObject pro = conses_high.second(pro_args);
                final SubLObject con_args = conses_high.assoc((SubLObject)rkf_test_suite_tool.$kw98$CON, the_results, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                final SubLObject con = conses_high.second(con_args);
                if (rkf_test_suite_tool.NIL != pro) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(pro);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(pro);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = (SubLObject)rkf_test_suite_tool.NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, support, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            support = (SubLObject)ConsesLow.cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = (SubLObject)rkf_test_suite_tool.NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    }
                }
                if (rkf_test_suite_tool.NIL != con) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(con);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(con);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = (SubLObject)rkf_test_suite_tool.NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, support, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            support = (SubLObject)ConsesLow.cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = (SubLObject)rkf_test_suite_tool.NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(results, (SubLObject)rkf_test_suite_tool.$list100);
        }
        final SubLObject query_terms = v_question = rkf_ts_gather_used_terms(cycl_query_specification.cycl_query_specification_formula(query));
        return Values.values(v_question, v_answer, support, assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 19125L)
    public static SubLObject rkf_ts_classify_terms_used(final SubLObject tsuite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        SubLObject v_question = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject v_answer = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject support = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject assertions = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject type = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject the_results = (SubLObject)rkf_test_suite_tool.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(results, results, (SubLObject)rkf_test_suite_tool.$list100);
        type = results.first();
        SubLObject current = results.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, results, (SubLObject)rkf_test_suite_tool.$list100);
        the_results = current.first();
        current = current.rest();
        if (rkf_test_suite_tool.NIL == current) {
            if (type == rkf_test_suite_tool.$kw99$QUERY || type == rkf_test_suite_tool.$kw101$ASK) {
                SubLObject cdolist_list_var = the_results;
                SubLObject result = (SubLObject)rkf_test_suite_tool.NIL;
                result = cdolist_list_var.first();
                while (rkf_test_suite_tool.NIL != cdolist_list_var) {
                    SubLObject current_$15;
                    final SubLObject datum_$14 = current_$15 = result;
                    SubLObject v_bindings = (SubLObject)rkf_test_suite_tool.NIL;
                    SubLObject supports = (SubLObject)rkf_test_suite_tool.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)rkf_test_suite_tool.$list102);
                    v_bindings = current_$15.first();
                    current_$15 = current_$15.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)rkf_test_suite_tool.$list102);
                    supports = current_$15.first();
                    current_$15 = current_$15.rest();
                    if (rkf_test_suite_tool.NIL == current_$15) {
                        final SubLObject binding_terms = rkf_ts_gather_used_terms(v_bindings);
                        final SubLObject support_terms = rkf_ts_gather_used_support_terms(supports);
                        final SubLObject assertion_ids = rkf_ts_gather_used_support_assertions(supports);
                        SubLObject cdolist_list_var_$16 = binding_terms;
                        SubLObject v_term = (SubLObject)rkf_test_suite_tool.NIL;
                        v_term = cdolist_list_var_$16.first();
                        while (rkf_test_suite_tool.NIL != cdolist_list_var_$16) {
                            final SubLObject item_var = v_term;
                            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, v_answer, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                                v_answer = (SubLObject)ConsesLow.cons(item_var, v_answer);
                            }
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            v_term = cdolist_list_var_$16.first();
                        }
                        SubLObject cdolist_list_var_$17 = support_terms;
                        v_term = (SubLObject)rkf_test_suite_tool.NIL;
                        v_term = cdolist_list_var_$17.first();
                        while (rkf_test_suite_tool.NIL != cdolist_list_var_$17) {
                            final SubLObject item_var = v_term;
                            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, support, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                                support = (SubLObject)ConsesLow.cons(item_var, support);
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            v_term = cdolist_list_var_$17.first();
                        }
                        SubLObject cdolist_list_var_$18 = assertion_ids;
                        SubLObject assertion_id = (SubLObject)rkf_test_suite_tool.NIL;
                        assertion_id = cdolist_list_var_$18.first();
                        while (rkf_test_suite_tool.NIL != cdolist_list_var_$18) {
                            final SubLObject item_var = assertion_id;
                            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                                assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                            }
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            assertion_id = cdolist_list_var_$18.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$14, (SubLObject)rkf_test_suite_tool.$list102);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                }
            }
            else {
                final SubLObject pro_args = conses_high.assoc((SubLObject)rkf_test_suite_tool.$kw97$PRO, the_results, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                final SubLObject pro = conses_high.second(pro_args);
                final SubLObject con_args = conses_high.assoc((SubLObject)rkf_test_suite_tool.$kw98$CON, the_results, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
                final SubLObject con = conses_high.second(con_args);
                if (rkf_test_suite_tool.NIL != pro) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(pro);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(pro);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = (SubLObject)rkf_test_suite_tool.NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, support, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            support = (SubLObject)ConsesLow.cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = (SubLObject)rkf_test_suite_tool.NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    }
                }
                if (rkf_test_suite_tool.NIL != con) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(con);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(con);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = (SubLObject)rkf_test_suite_tool.NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, support, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            support = (SubLObject)ConsesLow.cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = (SubLObject)rkf_test_suite_tool.NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (rkf_test_suite_tool.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (rkf_test_suite_tool.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                            assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(results, (SubLObject)rkf_test_suite_tool.$list100);
        }
        final SubLObject query_terms = v_question = rkf_ts_gather_used_terms(ts_query_formula(query));
        return Values.values(v_question, v_answer, support, assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 21144L)
    public static SubLObject rkf_ts_gather_used_support_assertions(final SubLObject supports) {
        SubLObject assertions = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(supports, (SubLObject)rkf_test_suite_tool.$sym103$ASSERTION_P, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        SubLObject assertion = (SubLObject)rkf_test_suite_tool.NIL;
        assertion = cdolist_list_var.first();
        while (rkf_test_suite_tool.NIL != cdolist_list_var) {
            final SubLObject item_var = assertion_handles.assertion_id(assertion);
            if (rkf_test_suite_tool.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)rkf_test_suite_tool.EQL), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.IDENTITY))) {
                assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 21370L)
    public static SubLObject rkf_ts_gather_used_support_terms(final SubLObject formulas) {
        final SubLObject expanded_formulas = rkf_ts_expand_support_to_el_formulas(formulas);
        return rkf_ts_gather_used_terms(expanded_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 21567L)
    public static SubLObject rkf_ts_expand_support_to_el_formulas(final SubLObject item) {
        if (rkf_test_suite_tool.NIL != assertion_handles.assertion_p(item)) {
            return rkf_ts_expand_support_to_el_formulas(uncanonicalizer.assertion_el_formula(item));
        }
        if (rkf_test_suite_tool.NIL != nart_handles.nart_p(item)) {
            return rkf_ts_expand_support_to_el_formulas(narts_high.nart_el_formula(item));
        }
        if (item.isCons()) {
            return (SubLObject)ConsesLow.cons(rkf_ts_expand_support_to_el_formulas(item.first()), rkf_ts_expand_support_to_el_formulas(item.rest()));
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 22004L)
    public static SubLObject rkf_ts_gather_used_terms(final SubLObject formulas) {
        final SubLObject terms = list_utilities.tree_find_all_if((SubLObject)rkf_test_suite_tool.$sym104$FORT_P, formulas, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        SubLObject result_terms = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)rkf_test_suite_tool.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_test_suite_tool.NIL != cdolist_list_var) {
            if (rkf_test_suite_tool.NIL != nart_handles.nart_p(v_term)) {
                SubLObject cdolist_list_var_$19 = rkf_ts_gather_used_terms(narts_high.nart_el_formula(v_term));
                SubLObject nart_item = (SubLObject)rkf_test_suite_tool.NIL;
                nart_item = cdolist_list_var_$19.first();
                while (rkf_test_suite_tool.NIL != cdolist_list_var_$19) {
                    result_terms = (SubLObject)ConsesLow.cons(nart_item, result_terms);
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    nart_item = cdolist_list_var_$19.first();
                }
            }
            else {
                result_terms = (SubLObject)ConsesLow.cons(v_term, result_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.delete_duplicates(result_terms, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 22396L)
    public static SubLObject rkf_ts_minimal_book_keeping_info_for_terms(final SubLObject terms) {
        SubLObject book_keeping_info = (SubLObject)rkf_test_suite_tool.NIL;
        SubLObject cdolist_list_var = Sort.sort(terms, (SubLObject)rkf_test_suite_tool.$sym105$STRING_, (SubLObject)rkf_test_suite_tool.$sym106$FORT_NAME);
        SubLObject v_term = (SubLObject)rkf_test_suite_tool.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_test_suite_tool.NIL != cdolist_list_var) {
            final SubLObject info = rkf_ts_minimal_book_keeping_info_for_term(v_term);
            book_keeping_info = (SubLObject)ConsesLow.cons(info, book_keeping_info);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(book_keeping_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-test-suite-tool.lisp", position = 22702L)
    public static SubLObject rkf_ts_minimal_book_keeping_info_for_term(final SubLObject v_term) {
        final SubLObject creator = bookkeeping_store.creator(v_term, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        final SubLObject time = bookkeeping_store.creation_time(v_term, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        final SubLObject second = bookkeeping_store.creation_second(v_term, (SubLObject)rkf_test_suite_tool.UNPROVIDED);
        return (SubLObject)ConsesLow.list(v_term, creator, time, second);
    }
    
    public static SubLObject declare_rkf_test_suite_tool_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "new_test_suite_from_file", "NEW-TEST-SUITE-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_save", "TEST-SUITE-SAVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_write", "TEST-SUITE-WRITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "fetch_test_suite_query_list", "FETCH-TEST-SUITE-QUERY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_get_number_of_queries", "TEST-SUITE-GET-NUMBER-OF-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_find_query_by_id", "TEST-SUITE-FIND-QUERY-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_find_query_by_id_string", "TEST-SUITE-FIND-QUERY-BY-ID-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_query_siblings", "TEST-SUITE-QUERY-SIBLINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_add_query", "TEST-SUITE-ADD-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_drop_query", "TEST-SUITE-DROP-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "test_suite_run_query", "TEST-SUITE-RUN-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_print_function_trampoline", "TS-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_p", "TS-QUERY-P", 1, 0, false);
        new $ts_query_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_id", "TS-QUERY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_label", "TS-QUERY-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_formula", "TS-QUERY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_mt", "TS-QUERY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_number", "TS-QUERY-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_time", "TS-QUERY-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_backchain", "TS-QUERY-BACKCHAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_depth", "TS-QUERY-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_expected", "TS-QUERY-EXPECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_id", "_CSETF-TS-QUERY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_label", "_CSETF-TS-QUERY-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_formula", "_CSETF-TS-QUERY-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_mt", "_CSETF-TS-QUERY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_number", "_CSETF-TS-QUERY-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_time", "_CSETF-TS-QUERY-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_backchain", "_CSETF-TS-QUERY-BACKCHAIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_depth", "_CSETF-TS-QUERY-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_ts_query_expected", "_CSETF-TS-QUERY-EXPECTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "make_ts_query", "MAKE-TS-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "visit_defstruct_ts_query", "VISIT-DEFSTRUCT-TS-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "visit_defstruct_object_ts_query_method", "VISIT-DEFSTRUCT-OBJECT-TS-QUERY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "new_ts_query", "NEW-TS-QUERY", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "clone_ts_query", "CLONE-TS-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_label_update", "TS-QUERY-LABEL-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "ts_query_formula_update", "TS-QUERY-FORMULA-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_parse_testcase_tokens", "RKF-TS-PARSE-TESTCASE-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_interpret_parse", "RKF-TS-INTERPRET-PARSE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_write_one_query", "RKF-TS-WRITE-ONE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_test_suite_print_function_trampoline", "RKF-TEST-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_test_suite_p", "RKF-TEST-SUITE-P", 1, 0, false);
        new $rkf_test_suite_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_tsuite_isg", "RKF-TSUITE-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_tsuite_label", "RKF-TSUITE-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_tsuite_filename", "RKF-TSUITE-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_tsuite_queries", "RKF-TSUITE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_tsuite_siblings", "RKF-TSUITE-SIBLINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_rkf_tsuite_isg", "_CSETF-RKF-TSUITE-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_rkf_tsuite_label", "_CSETF-RKF-TSUITE-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_rkf_tsuite_filename", "_CSETF-RKF-TSUITE-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_rkf_tsuite_queries", "_CSETF-RKF-TSUITE-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "_csetf_rkf_tsuite_siblings", "_CSETF-RKF-TSUITE-SIBLINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "make_rkf_test_suite", "MAKE-RKF-TEST-SUITE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "visit_defstruct_rkf_test_suite", "VISIT-DEFSTRUCT-RKF-TEST-SUITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "visit_defstruct_object_rkf_test_suite_method", "VISIT-DEFSTRUCT-OBJECT-RKF-TEST-SUITE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "new_rkf_tsuite", "NEW-RKF-TSUITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_test_suite_queries_as_list", "RKF-TEST-SUITE-QUERIES-AS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_obtain_test_suite", "RKF-TS-OBTAIN-TEST-SUITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_fetch_test_suite_in_xml", "RKF-TS-FETCH-TEST-SUITE-IN-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_cleaned_string", "RKF-TS-CLEANED-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_parse_test_suite_tokens", "RKF-TS-PARSE-TEST-SUITE-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_insert_query", "RKF-TS-INSERT-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_finalize_test_suite", "RKF-TS-FINALIZE-TEST-SUITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_initialize_all_siblings", "RKF-TS-INITIALIZE-ALL-SIBLINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_update_query_siblings", "RKF-TS-UPDATE-QUERY-SIBLINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_remove_query_from_siblings", "RKF-TS-REMOVE-QUERY-FROM-SIBLINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_save_test_suite", "RKF-TS-SAVE-TEST-SUITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_write_test_suite", "RKF-TS-WRITE-TEST-SUITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_write_queries", "RKF-TS-WRITE-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_write_prologue", "RKF-TS-WRITE-PROLOGUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_write_definition", "RKF-TS-WRITE-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_write_epilogue", "RKF-TS-WRITE-EPILOGUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "write_tagged_value", "WRITE-TAGGED-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "write_opening_tag", "WRITE-OPENING-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "write_closing_tag", "WRITE-CLOSING-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_run_query", "RKF-TS-RUN-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_classify_terms_for_iet_answer_page_new", "RKF-TS-CLASSIFY-TERMS-FOR-IET-ANSWER-PAGE-NEW", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_classify_terms_for_iet_answer_page", "RKF-TS-CLASSIFY-TERMS-FOR-IET-ANSWER-PAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_classify_terms_used_new", "RKF-TS-CLASSIFY-TERMS-USED-NEW", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_classify_terms_used", "RKF-TS-CLASSIFY-TERMS-USED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_gather_used_support_assertions", "RKF-TS-GATHER-USED-SUPPORT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_gather_used_support_terms", "RKF-TS-GATHER-USED-SUPPORT-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_expand_support_to_el_formulas", "RKF-TS-EXPAND-SUPPORT-TO-EL-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_gather_used_terms", "RKF-TS-GATHER-USED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_minimal_book_keeping_info_for_terms", "RKF-TS-MINIMAL-BOOK-KEEPING-INFO-FOR-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_test_suite_tool", "rkf_ts_minimal_book_keeping_info_for_term", "RKF-TS-MINIMAL-BOOK-KEEPING-INFO-FOR-TERM", 1, 0, false);
        return (SubLObject)rkf_test_suite_tool.NIL;
    }
    
    public static SubLObject init_rkf_test_suite_tool_file() {
        rkf_test_suite_tool.$dtp_ts_query$ = SubLFiles.defconstant("*DTP-TS-QUERY*", (SubLObject)rkf_test_suite_tool.$sym1$TS_QUERY);
        rkf_test_suite_tool.$rkf_ts_test_case$ = SubLFiles.deflexical("*RKF-TS-TEST-CASE*", (SubLObject)rkf_test_suite_tool.$str43$_testcase_);
        rkf_test_suite_tool.$rkf_ts_label$ = SubLFiles.deflexical("*RKF-TS-LABEL*", (SubLObject)rkf_test_suite_tool.$str44$_label_);
        rkf_test_suite_tool.$rkf_ts_formula$ = SubLFiles.deflexical("*RKF-TS-FORMULA*", (SubLObject)rkf_test_suite_tool.$str45$_formula_);
        rkf_test_suite_tool.$rkf_ts_microtheory$ = SubLFiles.deflexical("*RKF-TS-MICROTHEORY*", (SubLObject)rkf_test_suite_tool.$str46$_microtheory_);
        rkf_test_suite_tool.$rkf_ts_settings$ = SubLFiles.deflexical("*RKF-TS-SETTINGS*", (SubLObject)rkf_test_suite_tool.$str47$_settings_);
        rkf_test_suite_tool.$rkf_ts_number$ = SubLFiles.deflexical("*RKF-TS-NUMBER*", (SubLObject)rkf_test_suite_tool.$str48$_number_);
        rkf_test_suite_tool.$rkf_ts_time$ = SubLFiles.deflexical("*RKF-TS-TIME*", (SubLObject)rkf_test_suite_tool.$str49$_time_);
        rkf_test_suite_tool.$rkf_ts_backchaining$ = SubLFiles.deflexical("*RKF-TS-BACKCHAINING*", (SubLObject)rkf_test_suite_tool.$str50$_backchaining_);
        rkf_test_suite_tool.$rkf_ts_depth$ = SubLFiles.deflexical("*RKF-TS-DEPTH*", (SubLObject)rkf_test_suite_tool.$str51$_depth_);
        rkf_test_suite_tool.$rkf_ts_token_interaction_mt$ = SubLFiles.deflexical("*RKF-TS-TOKEN-INTERACTION-MT*", (SubLObject)rkf_test_suite_tool.$str52$_interaction_mt__);
        rkf_test_suite_tool.$rkf_ts_token_everything$ = SubLFiles.deflexical("*RKF-TS-TOKEN-EVERYTHING*", (SubLObject)rkf_test_suite_tool.$str53$_everything__);
        rkf_test_suite_tool.$rkf_ts_token_forever$ = SubLFiles.deflexical("*RKF-TS-TOKEN-FOREVER*", (SubLObject)rkf_test_suite_tool.$str54$_forever__);
        rkf_test_suite_tool.$rkf_ts_token_none$ = SubLFiles.deflexical("*RKF-TS-TOKEN-NONE*", (SubLObject)rkf_test_suite_tool.$str55$_none__);
        rkf_test_suite_tool.$dtp_rkf_test_suite$ = SubLFiles.defconstant("*DTP-RKF-TEST-SUITE*", (SubLObject)rkf_test_suite_tool.$sym63$RKF_TEST_SUITE);
        rkf_test_suite_tool.$rkf_ts_definition$ = SubLFiles.deflexical("*RKF-TS-DEFINITION*", (SubLObject)rkf_test_suite_tool.$str87$_definition_);
        rkf_test_suite_tool.$rkf_ts_test_suite$ = SubLFiles.deflexical("*RKF-TS-TEST-SUITE*", (SubLObject)rkf_test_suite_tool.$str88$_testsuite_);
        rkf_test_suite_tool.$test_suite_query_default_label$ = SubLFiles.deflexical("*TEST-SUITE-QUERY-DEFAULT-LABEL*", (SubLObject)rkf_test_suite_tool.$str91$unnamed_query);
        return (SubLObject)rkf_test_suite_tool.NIL;
    }
    
    public static SubLObject setup_rkf_test_suite_tool_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_test_suite_tool.$dtp_ts_query$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym8$TS_QUERY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_test_suite_tool.$list9);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym10$TS_QUERY_ID, (SubLObject)rkf_test_suite_tool.$sym11$_CSETF_TS_QUERY_ID);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym12$TS_QUERY_LABEL, (SubLObject)rkf_test_suite_tool.$sym13$_CSETF_TS_QUERY_LABEL);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym14$TS_QUERY_FORMULA, (SubLObject)rkf_test_suite_tool.$sym15$_CSETF_TS_QUERY_FORMULA);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym16$TS_QUERY_MT, (SubLObject)rkf_test_suite_tool.$sym17$_CSETF_TS_QUERY_MT);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym18$TS_QUERY_NUMBER, (SubLObject)rkf_test_suite_tool.$sym19$_CSETF_TS_QUERY_NUMBER);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym20$TS_QUERY_TIME, (SubLObject)rkf_test_suite_tool.$sym21$_CSETF_TS_QUERY_TIME);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym22$TS_QUERY_BACKCHAIN, (SubLObject)rkf_test_suite_tool.$sym23$_CSETF_TS_QUERY_BACKCHAIN);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym24$TS_QUERY_DEPTH, (SubLObject)rkf_test_suite_tool.$sym25$_CSETF_TS_QUERY_DEPTH);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym26$TS_QUERY_EXPECTED, (SubLObject)rkf_test_suite_tool.$sym27$_CSETF_TS_QUERY_EXPECTED);
        Equality.identity((SubLObject)rkf_test_suite_tool.$sym1$TS_QUERY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_test_suite_tool.$dtp_ts_query$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym42$VISIT_DEFSTRUCT_OBJECT_TS_QUERY_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_test_suite_tool.$dtp_rkf_test_suite$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym68$RKF_TEST_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_test_suite_tool.$list69);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym70$RKF_TSUITE_ISG, (SubLObject)rkf_test_suite_tool.$sym71$_CSETF_RKF_TSUITE_ISG);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym72$RKF_TSUITE_LABEL, (SubLObject)rkf_test_suite_tool.$sym73$_CSETF_RKF_TSUITE_LABEL);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym74$RKF_TSUITE_FILENAME, (SubLObject)rkf_test_suite_tool.$sym75$_CSETF_RKF_TSUITE_FILENAME);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym76$RKF_TSUITE_QUERIES, (SubLObject)rkf_test_suite_tool.$sym77$_CSETF_RKF_TSUITE_QUERIES);
        Structures.def_csetf((SubLObject)rkf_test_suite_tool.$sym78$RKF_TSUITE_SIBLINGS, (SubLObject)rkf_test_suite_tool.$sym79$_CSETF_RKF_TSUITE_SIBLINGS);
        Equality.identity((SubLObject)rkf_test_suite_tool.$sym63$RKF_TEST_SUITE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_test_suite_tool.$dtp_rkf_test_suite$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_test_suite_tool.$sym85$VISIT_DEFSTRUCT_OBJECT_RKF_TEST_SUITE_METHOD));
        return (SubLObject)rkf_test_suite_tool.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_test_suite_tool_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_test_suite_tool_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_test_suite_tool_file();
    }
    
    static {
        me = (SubLFile)new rkf_test_suite_tool();
        rkf_test_suite_tool.$dtp_ts_query$ = null;
        rkf_test_suite_tool.$rkf_ts_test_case$ = null;
        rkf_test_suite_tool.$rkf_ts_label$ = null;
        rkf_test_suite_tool.$rkf_ts_formula$ = null;
        rkf_test_suite_tool.$rkf_ts_microtheory$ = null;
        rkf_test_suite_tool.$rkf_ts_settings$ = null;
        rkf_test_suite_tool.$rkf_ts_number$ = null;
        rkf_test_suite_tool.$rkf_ts_time$ = null;
        rkf_test_suite_tool.$rkf_ts_backchaining$ = null;
        rkf_test_suite_tool.$rkf_ts_depth$ = null;
        rkf_test_suite_tool.$rkf_ts_token_interaction_mt$ = null;
        rkf_test_suite_tool.$rkf_ts_token_everything$ = null;
        rkf_test_suite_tool.$rkf_ts_token_forever$ = null;
        rkf_test_suite_tool.$rkf_ts_token_none$ = null;
        rkf_test_suite_tool.$dtp_rkf_test_suite$ = null;
        rkf_test_suite_tool.$rkf_ts_definition$ = null;
        rkf_test_suite_tool.$rkf_ts_test_suite$ = null;
        rkf_test_suite_tool.$test_suite_query_default_label$ = null;
        $sym0$RKF_TEST_SUITE_P = SubLObjectFactory.makeSymbol("RKF-TEST-SUITE-P");
        $sym1$TS_QUERY = SubLObjectFactory.makeSymbol("TS-QUERY");
        $sym2$TS_QUERY_P = SubLObjectFactory.makeSymbol("TS-QUERY-P");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("LABEL"), SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("NUMBER"), SubLObjectFactory.makeSymbol("TIME"), SubLObjectFactory.makeSymbol("BACKCHAIN"), SubLObjectFactory.makeSymbol("DEPTH"), SubLObjectFactory.makeSymbol("EXPECTED") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("LABEL"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("NUMBER"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("BACKCHAIN"), SubLObjectFactory.makeKeyword("DEPTH"), SubLObjectFactory.makeKeyword("EXPECTED") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TS-QUERY-ID"), SubLObjectFactory.makeSymbol("TS-QUERY-LABEL"), SubLObjectFactory.makeSymbol("TS-QUERY-FORMULA"), SubLObjectFactory.makeSymbol("TS-QUERY-MT"), SubLObjectFactory.makeSymbol("TS-QUERY-NUMBER"), SubLObjectFactory.makeSymbol("TS-QUERY-TIME"), SubLObjectFactory.makeSymbol("TS-QUERY-BACKCHAIN"), SubLObjectFactory.makeSymbol("TS-QUERY-DEPTH"), SubLObjectFactory.makeSymbol("TS-QUERY-EXPECTED") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-ID"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-LABEL"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-FORMULA"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-MT"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-NUMBER"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-TIME"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-BACKCHAIN"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-DEPTH"), SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-EXPECTED") });
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$TS_QUERY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TS-QUERY-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TS-QUERY-P"));
        $sym10$TS_QUERY_ID = SubLObjectFactory.makeSymbol("TS-QUERY-ID");
        $sym11$_CSETF_TS_QUERY_ID = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-ID");
        $sym12$TS_QUERY_LABEL = SubLObjectFactory.makeSymbol("TS-QUERY-LABEL");
        $sym13$_CSETF_TS_QUERY_LABEL = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-LABEL");
        $sym14$TS_QUERY_FORMULA = SubLObjectFactory.makeSymbol("TS-QUERY-FORMULA");
        $sym15$_CSETF_TS_QUERY_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-FORMULA");
        $sym16$TS_QUERY_MT = SubLObjectFactory.makeSymbol("TS-QUERY-MT");
        $sym17$_CSETF_TS_QUERY_MT = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-MT");
        $sym18$TS_QUERY_NUMBER = SubLObjectFactory.makeSymbol("TS-QUERY-NUMBER");
        $sym19$_CSETF_TS_QUERY_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-NUMBER");
        $sym20$TS_QUERY_TIME = SubLObjectFactory.makeSymbol("TS-QUERY-TIME");
        $sym21$_CSETF_TS_QUERY_TIME = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-TIME");
        $sym22$TS_QUERY_BACKCHAIN = SubLObjectFactory.makeSymbol("TS-QUERY-BACKCHAIN");
        $sym23$_CSETF_TS_QUERY_BACKCHAIN = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-BACKCHAIN");
        $sym24$TS_QUERY_DEPTH = SubLObjectFactory.makeSymbol("TS-QUERY-DEPTH");
        $sym25$_CSETF_TS_QUERY_DEPTH = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-DEPTH");
        $sym26$TS_QUERY_EXPECTED = SubLObjectFactory.makeSymbol("TS-QUERY-EXPECTED");
        $sym27$_CSETF_TS_QUERY_EXPECTED = SubLObjectFactory.makeSymbol("_CSETF-TS-QUERY-EXPECTED");
        $kw28$ID = SubLObjectFactory.makeKeyword("ID");
        $kw29$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $kw30$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw31$MT = SubLObjectFactory.makeKeyword("MT");
        $kw32$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw33$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw34$BACKCHAIN = SubLObjectFactory.makeKeyword("BACKCHAIN");
        $kw35$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw36$EXPECTED = SubLObjectFactory.makeKeyword("EXPECTED");
        $str37$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw38$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym39$MAKE_TS_QUERY = SubLObjectFactory.makeSymbol("MAKE-TS-QUERY");
        $kw40$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw41$END = SubLObjectFactory.makeKeyword("END");
        $sym42$VISIT_DEFSTRUCT_OBJECT_TS_QUERY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TS-QUERY-METHOD");
        $str43$_testcase_ = SubLObjectFactory.makeString("<testcase>");
        $str44$_label_ = SubLObjectFactory.makeString("<label>");
        $str45$_formula_ = SubLObjectFactory.makeString("<formula>");
        $str46$_microtheory_ = SubLObjectFactory.makeString("<microtheory>");
        $str47$_settings_ = SubLObjectFactory.makeString("<settings>");
        $str48$_number_ = SubLObjectFactory.makeString("<number>");
        $str49$_time_ = SubLObjectFactory.makeString("<time>");
        $str50$_backchaining_ = SubLObjectFactory.makeString("<backchaining>");
        $str51$_depth_ = SubLObjectFactory.makeString("<depth>");
        $str52$_interaction_mt__ = SubLObjectFactory.makeString("<interaction-mt/>");
        $str53$_everything__ = SubLObjectFactory.makeString("<everything/>");
        $str54$_forever__ = SubLObjectFactory.makeString("<forever/>");
        $str55$_none__ = SubLObjectFactory.makeString("<none/>");
        $str56$Invalid_input_file_format__Expect = SubLObjectFactory.makeString("Invalid input file format. Expected starting ~S and received ~S.~%");
        $str57$Invalid_input_file_format__Expect = SubLObjectFactory.makeString("Invalid input file format. Expected closing ~S and received ~S.~%");
        $sym58$SEARCH = SubLObjectFactory.makeSymbol("SEARCH");
        $sym59$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str60$Skipping_Query__A_due_to_error__A = SubLObjectFactory.makeString("Skipping Query ~A due to error ~A.~%");
        $kw61$INTERACTION_MT = SubLObjectFactory.makeKeyword("INTERACTION-MT");
        $str62$NIL = SubLObjectFactory.makeString("NIL");
        $sym63$RKF_TEST_SUITE = SubLObjectFactory.makeSymbol("RKF-TEST-SUITE");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)SubLObjectFactory.makeSymbol("SIBLINGS"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("QUERIES"), (SubLObject)SubLObjectFactory.makeKeyword("SIBLINGS"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-TSUITE-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-TSUITE-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-TSUITE-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-TSUITE-QUERIES"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-TSUITE-SIBLINGS"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-QUERIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-SIBLINGS"));
        $sym68$RKF_TEST_SUITE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-TEST-SUITE-PRINT-FUNCTION-TRAMPOLINE");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-TEST-SUITE-P"));
        $sym70$RKF_TSUITE_ISG = SubLObjectFactory.makeSymbol("RKF-TSUITE-ISG");
        $sym71$_CSETF_RKF_TSUITE_ISG = SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-ISG");
        $sym72$RKF_TSUITE_LABEL = SubLObjectFactory.makeSymbol("RKF-TSUITE-LABEL");
        $sym73$_CSETF_RKF_TSUITE_LABEL = SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-LABEL");
        $sym74$RKF_TSUITE_FILENAME = SubLObjectFactory.makeSymbol("RKF-TSUITE-FILENAME");
        $sym75$_CSETF_RKF_TSUITE_FILENAME = SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-FILENAME");
        $sym76$RKF_TSUITE_QUERIES = SubLObjectFactory.makeSymbol("RKF-TSUITE-QUERIES");
        $sym77$_CSETF_RKF_TSUITE_QUERIES = SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-QUERIES");
        $sym78$RKF_TSUITE_SIBLINGS = SubLObjectFactory.makeSymbol("RKF-TSUITE-SIBLINGS");
        $sym79$_CSETF_RKF_TSUITE_SIBLINGS = SubLObjectFactory.makeSymbol("_CSETF-RKF-TSUITE-SIBLINGS");
        $kw80$ISG = SubLObjectFactory.makeKeyword("ISG");
        $kw81$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw82$QUERIES = SubLObjectFactory.makeKeyword("QUERIES");
        $kw83$SIBLINGS = SubLObjectFactory.makeKeyword("SIBLINGS");
        $sym84$MAKE_RKF_TEST_SUITE = SubLObjectFactory.makeSymbol("MAKE-RKF-TEST-SUITE");
        $sym85$VISIT_DEFSTRUCT_OBJECT_RKF_TEST_SUITE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-TEST-SUITE-METHOD");
        $sym86$_ = SubLObjectFactory.makeSymbol("<");
        $str87$_definition_ = SubLObjectFactory.makeString("<definition>");
        $str88$_testsuite_ = SubLObjectFactory.makeString("<testsuite>");
        $kw89$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str90$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str91$unnamed_query = SubLObjectFactory.makeString("unnamed query");
        $str92$__ = SubLObjectFactory.makeString(" #");
        $kw93$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str94$__ = SubLObjectFactory.makeString("</");
        $kw95$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRO"), (SubLObject)SubLObjectFactory.makeSymbol("CON"));
        $kw97$PRO = SubLObjectFactory.makeKeyword("PRO");
        $kw98$CON = SubLObjectFactory.makeKeyword("CON");
        $kw99$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("THE-RESULTS"));
        $kw101$ASK = SubLObjectFactory.makeKeyword("ASK");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym103$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym104$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym105$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym106$FORT_NAME = SubLObjectFactory.makeSymbol("FORT-NAME");
    }
    
    public static final class $ts_query_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $label;
        public SubLObject $formula;
        public SubLObject $mt;
        public SubLObject $number;
        public SubLObject $time;
        public SubLObject $backchain;
        public SubLObject $depth;
        public SubLObject $expected;
        private static final SubLStructDeclNative structDecl;
        
        public $ts_query_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$number = (SubLObject)CommonSymbols.NIL;
            this.$time = (SubLObject)CommonSymbols.NIL;
            this.$backchain = (SubLObject)CommonSymbols.NIL;
            this.$depth = (SubLObject)CommonSymbols.NIL;
            this.$expected = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ts_query_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$label;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$formula;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$number;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$time;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$backchain;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$depth;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$expected;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$label = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$number = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$time = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$backchain = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$depth = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$expected = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ts_query_native.class, rkf_test_suite_tool.$sym1$TS_QUERY, rkf_test_suite_tool.$sym2$TS_QUERY_P, rkf_test_suite_tool.$list3, rkf_test_suite_tool.$list4, new String[] { "$id", "$label", "$formula", "$mt", "$number", "$time", "$backchain", "$depth", "$expected" }, rkf_test_suite_tool.$list5, rkf_test_suite_tool.$list6, rkf_test_suite_tool.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $ts_query_p$UnaryFunction extends UnaryFunction
    {
        public $ts_query_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TS-QUERY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_test_suite_tool.ts_query_p(arg1);
        }
    }
    
    public static final class $rkf_test_suite_native extends SubLStructNative
    {
        public SubLObject $isg;
        public SubLObject $label;
        public SubLObject $filename;
        public SubLObject $queries;
        public SubLObject $siblings;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_test_suite_native() {
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$filename = (SubLObject)CommonSymbols.NIL;
            this.$queries = (SubLObject)CommonSymbols.NIL;
            this.$siblings = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_test_suite_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$isg;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$label;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$filename;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$queries;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$siblings;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$isg = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$label = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$filename = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$queries = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$siblings = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_test_suite_native.class, rkf_test_suite_tool.$sym63$RKF_TEST_SUITE, rkf_test_suite_tool.$sym0$RKF_TEST_SUITE_P, rkf_test_suite_tool.$list64, rkf_test_suite_tool.$list65, new String[] { "$isg", "$label", "$filename", "$queries", "$siblings" }, rkf_test_suite_tool.$list66, rkf_test_suite_tool.$list67, rkf_test_suite_tool.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rkf_test_suite_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_test_suite_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-TEST-SUITE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_test_suite_tool.rkf_test_suite_p(arg1);
        }
    }
}

/*

	Total time: 364 ms
	
*/