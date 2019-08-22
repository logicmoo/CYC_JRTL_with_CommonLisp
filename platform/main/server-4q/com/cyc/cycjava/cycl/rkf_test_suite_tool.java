package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class rkf_test_suite_tool extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_test_suite_tool();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_test_suite_tool";

    public static final String myFingerPrint = "14859974241283cb5c29b792f0018685b754f8aa9d52c4fb3d3005e34fedd48c";

    // defconstant
    public static final SubLSymbol $dtp_ts_query$ = makeSymbol("*DTP-TS-QUERY*");

    // deflexical
    private static final SubLSymbol $rkf_ts_test_case$ = makeSymbol("*RKF-TS-TEST-CASE*");

    // deflexical
    private static final SubLSymbol $rkf_ts_label$ = makeSymbol("*RKF-TS-LABEL*");

    // deflexical
    private static final SubLSymbol $rkf_ts_formula$ = makeSymbol("*RKF-TS-FORMULA*");

    // deflexical
    private static final SubLSymbol $rkf_ts_microtheory$ = makeSymbol("*RKF-TS-MICROTHEORY*");

    // deflexical
    private static final SubLSymbol $rkf_ts_settings$ = makeSymbol("*RKF-TS-SETTINGS*");

    // deflexical
    private static final SubLSymbol $rkf_ts_number$ = makeSymbol("*RKF-TS-NUMBER*");

    // deflexical
    private static final SubLSymbol $rkf_ts_time$ = makeSymbol("*RKF-TS-TIME*");

    // deflexical
    private static final SubLSymbol $rkf_ts_backchaining$ = makeSymbol("*RKF-TS-BACKCHAINING*");

    // deflexical
    private static final SubLSymbol $rkf_ts_depth$ = makeSymbol("*RKF-TS-DEPTH*");

    // deflexical
    private static final SubLSymbol $rkf_ts_token_interaction_mt$ = makeSymbol("*RKF-TS-TOKEN-INTERACTION-MT*");

    // deflexical
    private static final SubLSymbol $rkf_ts_token_everything$ = makeSymbol("*RKF-TS-TOKEN-EVERYTHING*");

    // deflexical
    private static final SubLSymbol $rkf_ts_token_forever$ = makeSymbol("*RKF-TS-TOKEN-FOREVER*");

    // deflexical
    private static final SubLSymbol $rkf_ts_token_none$ = makeSymbol("*RKF-TS-TOKEN-NONE*");

    // defconstant
    public static final SubLSymbol $dtp_rkf_test_suite$ = makeSymbol("*DTP-RKF-TEST-SUITE*");

    // deflexical
    private static final SubLSymbol $rkf_ts_definition$ = makeSymbol("*RKF-TS-DEFINITION*");

    // deflexical
    private static final SubLSymbol $rkf_ts_test_suite$ = makeSymbol("*RKF-TS-TEST-SUITE*");

    // deflexical
    public static final SubLSymbol $test_suite_query_default_label$ = makeSymbol("*TEST-SUITE-QUERY-DEFAULT-LABEL*");

    // Internal Constants
    public static final SubLSymbol RKF_TEST_SUITE_P = makeSymbol("RKF-TEST-SUITE-P");

    public static final SubLSymbol TS_QUERY = makeSymbol("TS-QUERY");

    public static final SubLSymbol TS_QUERY_P = makeSymbol("TS-QUERY-P");

    public static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("LABEL"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("BACKCHAIN"), makeSymbol("DEPTH"), makeSymbol("EXPECTED") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("LABEL"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("NUMBER"), makeKeyword("TIME"), makeKeyword("BACKCHAIN"), makeKeyword("DEPTH"), makeKeyword("EXPECTED") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("TS-QUERY-ID"), makeSymbol("TS-QUERY-LABEL"), makeSymbol("TS-QUERY-FORMULA"), makeSymbol("TS-QUERY-MT"), makeSymbol("TS-QUERY-NUMBER"), makeSymbol("TS-QUERY-TIME"), makeSymbol("TS-QUERY-BACKCHAIN"), makeSymbol("TS-QUERY-DEPTH"), makeSymbol("TS-QUERY-EXPECTED") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-TS-QUERY-ID"), makeSymbol("_CSETF-TS-QUERY-LABEL"), makeSymbol("_CSETF-TS-QUERY-FORMULA"), makeSymbol("_CSETF-TS-QUERY-MT"), makeSymbol("_CSETF-TS-QUERY-NUMBER"), makeSymbol("_CSETF-TS-QUERY-TIME"), makeSymbol("_CSETF-TS-QUERY-BACKCHAIN"), makeSymbol("_CSETF-TS-QUERY-DEPTH"), makeSymbol("_CSETF-TS-QUERY-EXPECTED") });



    public static final SubLSymbol TS_QUERY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TS-QUERY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TS-QUERY-P"));

    private static final SubLSymbol TS_QUERY_ID = makeSymbol("TS-QUERY-ID");

    private static final SubLSymbol _CSETF_TS_QUERY_ID = makeSymbol("_CSETF-TS-QUERY-ID");

    private static final SubLSymbol TS_QUERY_LABEL = makeSymbol("TS-QUERY-LABEL");

    private static final SubLSymbol _CSETF_TS_QUERY_LABEL = makeSymbol("_CSETF-TS-QUERY-LABEL");

    private static final SubLSymbol TS_QUERY_FORMULA = makeSymbol("TS-QUERY-FORMULA");

    private static final SubLSymbol _CSETF_TS_QUERY_FORMULA = makeSymbol("_CSETF-TS-QUERY-FORMULA");

    private static final SubLSymbol TS_QUERY_MT = makeSymbol("TS-QUERY-MT");

    private static final SubLSymbol _CSETF_TS_QUERY_MT = makeSymbol("_CSETF-TS-QUERY-MT");

    private static final SubLSymbol TS_QUERY_NUMBER = makeSymbol("TS-QUERY-NUMBER");

    private static final SubLSymbol _CSETF_TS_QUERY_NUMBER = makeSymbol("_CSETF-TS-QUERY-NUMBER");

    private static final SubLSymbol TS_QUERY_TIME = makeSymbol("TS-QUERY-TIME");

    private static final SubLSymbol _CSETF_TS_QUERY_TIME = makeSymbol("_CSETF-TS-QUERY-TIME");

    private static final SubLSymbol TS_QUERY_BACKCHAIN = makeSymbol("TS-QUERY-BACKCHAIN");

    private static final SubLSymbol _CSETF_TS_QUERY_BACKCHAIN = makeSymbol("_CSETF-TS-QUERY-BACKCHAIN");

    private static final SubLSymbol TS_QUERY_DEPTH = makeSymbol("TS-QUERY-DEPTH");

    private static final SubLSymbol _CSETF_TS_QUERY_DEPTH = makeSymbol("_CSETF-TS-QUERY-DEPTH");

    private static final SubLSymbol TS_QUERY_EXPECTED = makeSymbol("TS-QUERY-EXPECTED");

    private static final SubLSymbol _CSETF_TS_QUERY_EXPECTED = makeSymbol("_CSETF-TS-QUERY-EXPECTED");



















    private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TS_QUERY = makeSymbol("MAKE-TS-QUERY");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TS_QUERY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TS-QUERY-METHOD");

    private static final SubLString $str43$_testcase_ = makeString("<testcase>");

    private static final SubLString $str44$_label_ = makeString("<label>");

    private static final SubLString $str45$_formula_ = makeString("<formula>");

    private static final SubLString $str46$_microtheory_ = makeString("<microtheory>");

    private static final SubLString $str47$_settings_ = makeString("<settings>");

    private static final SubLString $str48$_number_ = makeString("<number>");

    private static final SubLString $str49$_time_ = makeString("<time>");

    private static final SubLString $str50$_backchaining_ = makeString("<backchaining>");

    private static final SubLString $str51$_depth_ = makeString("<depth>");

    private static final SubLString $str52$_interaction_mt__ = makeString("<interaction-mt/>");

    private static final SubLString $str53$_everything__ = makeString("<everything/>");

    private static final SubLString $str54$_forever__ = makeString("<forever/>");

    private static final SubLString $str55$_none__ = makeString("<none/>");

    private static final SubLString $str56$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected starting ~S and received ~S.~%");

    private static final SubLString $str57$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected closing ~S and received ~S.~%");





    private static final SubLString $str60$Skipping_Query__A_due_to_error__A = makeString("Skipping Query ~A due to error ~A.~%");



    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLSymbol RKF_TEST_SUITE = makeSymbol("RKF-TEST-SUITE");

    private static final SubLList $list64 = list(makeSymbol("ISG"), makeSymbol("LABEL"), makeSymbol("FILENAME"), makeSymbol("QUERIES"), makeSymbol("SIBLINGS"));

    private static final SubLList $list65 = list(makeKeyword("ISG"), makeKeyword("LABEL"), makeKeyword("FILENAME"), makeKeyword("QUERIES"), makeKeyword("SIBLINGS"));

    private static final SubLList $list66 = list(makeSymbol("RKF-TSUITE-ISG"), makeSymbol("RKF-TSUITE-LABEL"), makeSymbol("RKF-TSUITE-FILENAME"), makeSymbol("RKF-TSUITE-QUERIES"), makeSymbol("RKF-TSUITE-SIBLINGS"));

    private static final SubLList $list67 = list(makeSymbol("_CSETF-RKF-TSUITE-ISG"), makeSymbol("_CSETF-RKF-TSUITE-LABEL"), makeSymbol("_CSETF-RKF-TSUITE-FILENAME"), makeSymbol("_CSETF-RKF-TSUITE-QUERIES"), makeSymbol("_CSETF-RKF-TSUITE-SIBLINGS"));

    private static final SubLSymbol RKF_TEST_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-TEST-SUITE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list69 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-TEST-SUITE-P"));

    private static final SubLSymbol RKF_TSUITE_ISG = makeSymbol("RKF-TSUITE-ISG");

    private static final SubLSymbol _CSETF_RKF_TSUITE_ISG = makeSymbol("_CSETF-RKF-TSUITE-ISG");

    private static final SubLSymbol RKF_TSUITE_LABEL = makeSymbol("RKF-TSUITE-LABEL");

    private static final SubLSymbol _CSETF_RKF_TSUITE_LABEL = makeSymbol("_CSETF-RKF-TSUITE-LABEL");

    private static final SubLSymbol RKF_TSUITE_FILENAME = makeSymbol("RKF-TSUITE-FILENAME");

    private static final SubLSymbol _CSETF_RKF_TSUITE_FILENAME = makeSymbol("_CSETF-RKF-TSUITE-FILENAME");

    private static final SubLSymbol RKF_TSUITE_QUERIES = makeSymbol("RKF-TSUITE-QUERIES");

    private static final SubLSymbol _CSETF_RKF_TSUITE_QUERIES = makeSymbol("_CSETF-RKF-TSUITE-QUERIES");

    private static final SubLSymbol RKF_TSUITE_SIBLINGS = makeSymbol("RKF-TSUITE-SIBLINGS");

    private static final SubLSymbol _CSETF_RKF_TSUITE_SIBLINGS = makeSymbol("_CSETF-RKF-TSUITE-SIBLINGS");









    private static final SubLSymbol MAKE_RKF_TEST_SUITE = makeSymbol("MAKE-RKF-TEST-SUITE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_TEST_SUITE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-TEST-SUITE-METHOD");

    private static final SubLSymbol $sym86$_ = makeSymbol("<");

    private static final SubLString $str87$_definition_ = makeString("<definition>");

    private static final SubLString $str88$_testsuite_ = makeString("<testsuite>");



    private static final SubLString $str90$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$unnamed_query = makeString("unnamed query");

    private static final SubLString $str92$__ = makeString(" #");



    private static final SubLString $str94$__ = makeString("</");



    private static final SubLList $list96 = list(makeSymbol("PRO"), makeSymbol("CON"));







    private static final SubLList $list100 = list(makeSymbol("TYPE"), makeSymbol("THE-RESULTS"));



    private static final SubLList $list102 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));





    private static final SubLSymbol $sym105$STRING_ = makeSymbol("STRING<");



    public static SubLObject new_test_suite_from_file(final SubLObject filename) {
        final SubLObject tsuite = rkf_ts_obtain_test_suite(filename);
        return tsuite;
    }

    public static SubLObject test_suite_save(final SubLObject tsuite) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        return rkf_ts_save_test_suite(tsuite);
    }

    public static SubLObject test_suite_write(final SubLObject tsuite, final SubLObject filename) {
        return rkf_ts_write_test_suite(tsuite, filename);
    }

    public static SubLObject fetch_test_suite_query_list(final SubLObject tsuite) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        return rkf_test_suite_queries_as_list(tsuite);
    }

    public static SubLObject test_suite_get_number_of_queries(final SubLObject tsuite) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        return dictionary.dictionary_length(rkf_tsuite_queries(tsuite));
    }

    public static SubLObject test_suite_find_query_by_id(final SubLObject tsuite, final SubLObject id) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        return dictionary.dictionary_lookup(rkf_tsuite_queries(tsuite), id, UNPROVIDED);
    }

    public static SubLObject test_suite_find_query_by_id_string(final SubLObject tsuite, final SubLObject id_string) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return test_suite_find_query_by_id(tsuite, id);
    }

    public static SubLObject test_suite_query_siblings(final SubLObject query, final SubLObject tsuite) {
        final SubLObject siblings_dict = rkf_tsuite_siblings(tsuite);
        final SubLObject label = ts_query_label(query);
        final SubLObject siblings = dictionary.dictionary_lookup(siblings_dict, label, NIL);
        return siblings;
    }

    public static SubLObject test_suite_add_query(final SubLObject tsuite, final SubLObject query) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        return rkf_ts_insert_query(tsuite, query);
    }

    public static SubLObject test_suite_drop_query(final SubLObject tsuite, final SubLObject id) {
        assert NIL != rkf_test_suite_p(tsuite) : "rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + "CommonSymbols.NIL != rkf_test_suite_tool.rkf_test_suite_p(tsuite) " + tsuite;
        final SubLObject query = test_suite_find_query_by_id(tsuite, id);
        rkf_ts_remove_query_from_siblings(query, tsuite);
        dictionary.dictionary_remove(rkf_tsuite_queries(tsuite), id);
        return tsuite;
    }

    public static SubLObject test_suite_run_query(final SubLObject tsuite, final SubLObject id, SubLObject current_mt) {
        if (current_mt == UNPROVIDED) {
            current_mt = NIL;
        }
        final SubLObject query = test_suite_find_query_by_id(tsuite, id);
        return rkf_ts_run_query(tsuite, query, current_mt);
    }

    public static SubLObject ts_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ts_query_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$ts_query_native.class ? T : NIL;
    }

    public static SubLObject ts_query_id(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject ts_query_label(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ts_query_formula(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject ts_query_mt(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject ts_query_number(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject ts_query_time(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject ts_query_backchain(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject ts_query_depth(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject ts_query_expected(final SubLObject v_object) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_ts_query_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ts_query_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ts_query_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ts_query_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ts_query_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ts_query_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ts_query_backchain(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ts_query_depth(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ts_query_expected(final SubLObject v_object, final SubLObject value) {
        assert NIL != ts_query_p(v_object) : "rkf_test_suite_tool.ts_query_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_ts_query(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $ts_query_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ts_query_id(v_new, current_value);
            } else
                if (pcase_var.eql($LABEL)) {
                    _csetf_ts_query_label(v_new, current_value);
                } else
                    if (pcase_var.eql($FORMULA)) {
                        _csetf_ts_query_formula(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_ts_query_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($NUMBER)) {
                                _csetf_ts_query_number(v_new, current_value);
                            } else
                                if (pcase_var.eql($TIME)) {
                                    _csetf_ts_query_time(v_new, current_value);
                                } else
                                    if (pcase_var.eql($BACKCHAIN)) {
                                        _csetf_ts_query_backchain(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($DEPTH)) {
                                            _csetf_ts_query_depth(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($EXPECTED)) {
                                                _csetf_ts_query_expected(v_new, current_value);
                                            } else {
                                                Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ts_query(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TS_QUERY, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ts_query_id(obj));
        funcall(visitor_fn, obj, $SLOT, $LABEL, ts_query_label(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, ts_query_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, ts_query_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $NUMBER, ts_query_number(obj));
        funcall(visitor_fn, obj, $SLOT, $TIME, ts_query_time(obj));
        funcall(visitor_fn, obj, $SLOT, $BACKCHAIN, ts_query_backchain(obj));
        funcall(visitor_fn, obj, $SLOT, $DEPTH, ts_query_depth(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPECTED, ts_query_expected(obj));
        funcall(visitor_fn, obj, $END, MAKE_TS_QUERY, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ts_query_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ts_query(obj, visitor_fn);
    }

    public static SubLObject new_ts_query(final SubLObject label, final SubLObject formula, final SubLObject microtheory, final SubLObject number, final SubLObject time, final SubLObject backchaining, final SubLObject depth, SubLObject expected) {
        if (expected == UNPROVIDED) {
            expected = NIL;
        }
        final SubLObject tsq = make_ts_query(UNPROVIDED);
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

    public static SubLObject ts_query_label_update(final SubLObject ts_query, final SubLObject label, final SubLObject tsuite) {
        rkf_ts_remove_query_from_siblings(ts_query, tsuite);
        _csetf_ts_query_label(ts_query, label);
        rkf_ts_update_query_siblings(ts_query, tsuite);
        return ts_query;
    }

    public static SubLObject ts_query_formula_update(final SubLObject ts_query, final SubLObject formula) {
        _csetf_ts_query_formula(ts_query, formula);
        return ts_query;
    }

    public static SubLObject rkf_ts_parse_testcase_tokens(final SubLObject tokens) {
        SubLObject curr = tokens;
        SubLObject queries = NIL;
        while (NIL != web_utilities.test_for_html_tagP(curr, $rkf_ts_test_case$.getGlobalValue())) {
            SubLObject label = NIL;
            SubLObject formula = NIL;
            SubLObject microtheory = NIL;
            SubLObject number = NIL;
            SubLObject time = NIL;
            SubLObject backchaining = NIL;
            SubLObject depth = NIL;
            SubLObject marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_test_case$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_test_case$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_label$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_label$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            label = curr.first();
            curr = curr.rest();
            final SubLObject marker_$1 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$1, $rkf_ts_label$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_label$.getGlobalValue(), marker_$1);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_formula$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_formula$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            formula = curr.first();
            curr = curr.rest();
            final SubLObject marker_$2 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$2, $rkf_ts_formula$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_formula$.getGlobalValue(), marker_$2);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_microtheory$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_microtheory$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            microtheory = curr.first();
            curr = curr.rest();
            final SubLObject marker_$3 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$3, $rkf_ts_microtheory$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_microtheory$.getGlobalValue(), marker_$3);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_settings$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_settings$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_number$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            number = curr.first();
            curr = curr.rest();
            final SubLObject marker_$4 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$4, $rkf_ts_number$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_number$.getGlobalValue(), marker_$4);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_time$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_time$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            time = curr.first();
            curr = curr.rest();
            final SubLObject marker_$5 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$5, $rkf_ts_time$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_time$.getGlobalValue(), marker_$5);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_backchaining$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_backchaining$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            backchaining = curr.first();
            curr = curr.rest();
            final SubLObject marker_$6 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$6, $rkf_ts_backchaining$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_backchaining$.getGlobalValue(), marker_$6);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == Strings.string_equal(marker, $rkf_ts_depth$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_depth$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            depth = curr.first();
            curr = curr.rest();
            final SubLObject marker_$7 = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker_$7, $rkf_ts_depth$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_depth$.getGlobalValue(), marker_$7);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker, $rkf_ts_settings$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_settings$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            marker = curr.first();
            if (NIL == web_utilities.is_html_terminating_tagP(marker, $rkf_ts_test_case$.getGlobalValue())) {
                Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_test_case$.getGlobalValue(), marker);
            }
            curr = curr.rest();
            curr = member($rkf_ts_test_case$.getGlobalValue(), curr, symbol_function(SEARCH), UNPROVIDED);
            final SubLObject query = rkf_ts_interpret_parse(label, formula, microtheory, number, time, backchaining, depth);
            if (NIL != query) {
                queries = cons(query, queries);
            }
        } 
        return nreverse(queries);
    }

    public static SubLObject rkf_ts_interpret_parse(final SubLObject label, SubLObject formula, SubLObject microtheory, SubLObject number, SubLObject time, SubLObject backchaining, SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    formula = read_from_string(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn($str60$Skipping_Query__A_due_to_error__A, label, error_message);
            return NIL;
        }
        microtheory = (NIL != Strings.string_equal(microtheory, $rkf_ts_token_interaction_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $INTERACTION_MT : read_from_string(microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        number = (NIL != Strings.string_equal(number, $rkf_ts_token_everything$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? NIL : parse_integer(number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        time = (NIL != Strings.string_equal(time, $rkf_ts_token_forever$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? NIL : parse_integer(time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != Strings.string_equal(backchaining, $rkf_ts_token_none$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            backchaining = NIL;
        } else
            if (NIL != Strings.string_equal(backchaining, $rkf_ts_token_forever$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                backchaining = T;
            } else {
                backchaining = parse_integer(backchaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        if (NIL != Strings.string_equal(depth, $$$NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            depth = NIL;
        } else {
            depth = parse_integer(depth, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return new_ts_query(label, formula, microtheory, number, time, backchaining, depth, UNPROVIDED);
    }

    public static SubLObject rkf_ts_write_one_query(final SubLObject s, final SubLObject query) {
        write_opening_tag($rkf_ts_test_case$.getGlobalValue(), s);
        terpri(s);
        write_tagged_value($rkf_ts_label$.getGlobalValue(), ts_query_label(query), s);
        write_tagged_value($rkf_ts_formula$.getGlobalValue(), ts_query_formula(query), s);
        write_tagged_value($rkf_ts_microtheory$.getGlobalValue(), ts_query_mt(query) == $INTERACTION_MT ? $rkf_ts_token_interaction_mt$.getGlobalValue() : ts_query_mt(query), s);
        write_opening_tag($rkf_ts_settings$.getGlobalValue(), s);
        terpri(s);
        write_tagged_value($rkf_ts_number$.getGlobalValue(), NIL == ts_query_number(query) ? $rkf_ts_token_everything$.getGlobalValue() : ts_query_number(query), s);
        write_tagged_value($rkf_ts_time$.getGlobalValue(), NIL == ts_query_time(query) ? $rkf_ts_token_forever$.getGlobalValue() : ts_query_time(query), s);
        write_tagged_value($rkf_ts_backchaining$.getGlobalValue(), NIL == ts_query_backchain(query) ? $rkf_ts_token_none$.getGlobalValue() : T == ts_query_backchain(query) ? $rkf_ts_token_forever$.getGlobalValue() : ts_query_backchain(query), s);
        write_tagged_value($rkf_ts_depth$.getGlobalValue(), ts_query_depth(query), s);
        write_closing_tag($rkf_ts_settings$.getGlobalValue(), s);
        terpri(s);
        write_closing_tag($rkf_ts_test_case$.getGlobalValue(), s);
        return terpri(s);
    }

    public static SubLObject rkf_test_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_test_suite_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rkf_test_suite_native.class ? T : NIL;
    }

    public static SubLObject rkf_tsuite_isg(final SubLObject v_object) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rkf_tsuite_label(final SubLObject v_object) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rkf_tsuite_filename(final SubLObject v_object) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rkf_tsuite_queries(final SubLObject v_object) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rkf_tsuite_siblings(final SubLObject v_object) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_rkf_tsuite_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_tsuite_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_tsuite_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_tsuite_queries(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rkf_tsuite_siblings(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_test_suite_p(v_object) : "rkf_test_suite_tool.rkf_test_suite_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_rkf_test_suite(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rkf_test_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ISG)) {
                _csetf_rkf_tsuite_isg(v_new, current_value);
            } else
                if (pcase_var.eql($LABEL)) {
                    _csetf_rkf_tsuite_label(v_new, current_value);
                } else
                    if (pcase_var.eql($FILENAME)) {
                        _csetf_rkf_tsuite_filename(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERIES)) {
                            _csetf_rkf_tsuite_queries(v_new, current_value);
                        } else
                            if (pcase_var.eql($SIBLINGS)) {
                                _csetf_rkf_tsuite_siblings(v_new, current_value);
                            } else {
                                Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_test_suite(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_TEST_SUITE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ISG, rkf_tsuite_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $LABEL, rkf_tsuite_label(obj));
        funcall(visitor_fn, obj, $SLOT, $FILENAME, rkf_tsuite_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERIES, rkf_tsuite_queries(obj));
        funcall(visitor_fn, obj, $SLOT, $SIBLINGS, rkf_tsuite_siblings(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_TEST_SUITE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_test_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_test_suite(obj, visitor_fn);
    }

    public static SubLObject new_rkf_tsuite(final SubLObject filename) {
        final SubLObject tsuite = make_rkf_test_suite(UNPROVIDED);
        _csetf_rkf_tsuite_isg(tsuite, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_rkf_tsuite_filename(tsuite, filename);
        _csetf_rkf_tsuite_queries(tsuite, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_rkf_tsuite_siblings(tsuite, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return tsuite;
    }

    public static SubLObject rkf_test_suite_queries_as_list(final SubLObject tsuite) {
        final SubLObject queries = dictionary.dictionary_values(rkf_tsuite_queries(tsuite));
        return Sort.sort(queries, $sym86$_, TS_QUERY_ID);
    }

    public static SubLObject rkf_ts_obtain_test_suite(final SubLObject filename) {
        final SubLObject tokens = rkf_ts_fetch_test_suite_in_xml(filename);
        final SubLObject tsuite = new_rkf_tsuite(filename);
        return rkf_ts_parse_test_suite_tokens(tsuite, tokens);
    }

    public static SubLObject rkf_ts_fetch_test_suite_in_xml(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            tokens = xml_parsing_utilities.xml_tokenize(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        SubLObject cleansed = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject clean_token = rkf_ts_cleaned_string(token);
            if (!length(clean_token).isZero()) {
                cleansed = cons(clean_token, cleansed);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        tokens = nreverse(cleansed);
        return tokens;
    }

    public static SubLObject rkf_ts_cleaned_string(SubLObject string) {
        string = string_utilities.nsubst_whitespace(string);
        return string_utilities.reduce_whitespace(string);
    }

    public static SubLObject rkf_ts_parse_test_suite_tokens(final SubLObject tsuite, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject label = NIL;
        SubLObject queries = NIL;
        SubLObject error_message = NIL;
        SubLObject curr = member($rkf_ts_definition$.getGlobalValue(), tokens, symbol_function(SEARCH), UNPROVIDED).rest();
        final SubLObject marker = curr.first();
        if (NIL == Strings.string_equal(marker, $rkf_ts_label$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str56$Invalid_input_file_format__Expect, $rkf_ts_label$.getGlobalValue(), marker);
        }
        curr = curr.rest();
        label = curr.first();
        curr = curr.rest();
        final SubLObject marker_$8 = curr.first();
        if (NIL == web_utilities.is_html_terminating_tagP(marker_$8, $rkf_ts_label$.getGlobalValue())) {
            Errors.error($str57$Invalid_input_file_format__Expect, $rkf_ts_label$.getGlobalValue(), marker_$8);
        }
        curr = curr.rest();
        _csetf_rkf_tsuite_label(tsuite, label);
        curr = member($rkf_ts_test_case$.getGlobalValue(), curr, symbol_function(SEARCH), UNPROVIDED);
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    queries = rkf_ts_parse_testcase_tokens(curr);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            return error_message;
        }
        SubLObject cdolist_list_var = queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ts_insert_query(tsuite, query);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        rkf_ts_finalize_test_suite(tsuite);
        return tsuite;
    }

    public static SubLObject rkf_ts_insert_query(final SubLObject tsuite, final SubLObject query) {
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(rkf_tsuite_isg(tsuite));
        _csetf_ts_query_id(query, id);
        final SubLObject label = ts_query_label(query);
        if (label.equalp($test_suite_query_default_label$.getGlobalValue())) {
            final SubLObject new_label = cconcatenate($test_suite_query_default_label$.getGlobalValue(), new SubLObject[]{ $str92$__, string_utilities.str(id) });
            ts_query_label_update(query, new_label, tsuite);
        }
        dictionary.dictionary_enter(rkf_tsuite_queries(tsuite), id, query);
        rkf_ts_update_query_siblings(query, tsuite);
        return tsuite;
    }

    public static SubLObject rkf_ts_finalize_test_suite(final SubLObject tsuite) {
        return rkf_ts_initialize_all_siblings(tsuite);
    }

    public static SubLObject rkf_ts_initialize_all_siblings(final SubLObject tsuite) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rkf_tsuite_queries(tsuite))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject query = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rkf_ts_update_query_siblings(query, tsuite);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return tsuite;
    }

    public static SubLObject rkf_ts_update_query_siblings(final SubLObject query, final SubLObject tsuite) {
        final SubLObject siblings_dict = rkf_tsuite_siblings(tsuite);
        final SubLObject label = ts_query_label(query);
        dictionary_utilities.dictionary_pushnew(siblings_dict, label, query, UNPROVIDED, UNPROVIDED);
        return tsuite;
    }

    public static SubLObject rkf_ts_remove_query_from_siblings(final SubLObject query, final SubLObject tsuite) {
        final SubLObject label = ts_query_label(query);
        dictionary_utilities.dictionary_remove_from_value(rkf_tsuite_siblings(tsuite), label, query, UNPROVIDED, UNPROVIDED);
        return tsuite;
    }

    public static SubLObject rkf_ts_save_test_suite(final SubLObject tsuite) {
        final SubLObject filename = rkf_tsuite_filename(tsuite);
        return rkf_ts_write_test_suite(tsuite, filename);
    }

    public static SubLObject rkf_ts_write_test_suite(final SubLObject tsuite, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            rkf_ts_write_prologue(s, tsuite);
            rkf_ts_write_queries(s, tsuite);
            rkf_ts_write_epilogue(s, tsuite);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return tsuite;
    }

    public static SubLObject rkf_ts_write_queries(final SubLObject s, final SubLObject tsuite) {
        SubLObject cdolist_list_var = rkf_test_suite_queries_as_list(tsuite);
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ts_write_one_query(s, query);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return s;
    }

    public static SubLObject rkf_ts_write_prologue(final SubLObject s, final SubLObject tsuite) {
        write_opening_tag($rkf_ts_test_suite$.getGlobalValue(), s);
        terpri(s);
        terpri(s);
        rkf_ts_write_definition(s, tsuite);
        return terpri(s);
    }

    public static SubLObject rkf_ts_write_definition(final SubLObject s, final SubLObject tsuite) {
        write_opening_tag($rkf_ts_definition$.getGlobalValue(), s);
        terpri(s);
        write_opening_tag($rkf_ts_label$.getGlobalValue(), s);
        write_string(rkf_tsuite_label(tsuite), s, UNPROVIDED, UNPROVIDED);
        write_closing_tag($rkf_ts_label$.getGlobalValue(), s);
        terpri(s);
        write_closing_tag($rkf_ts_definition$.getGlobalValue(), s);
        return terpri(s);
    }

    public static SubLObject rkf_ts_write_epilogue(final SubLObject s, final SubLObject tsuite) {
        terpri(s);
        write_closing_tag($rkf_ts_test_suite$.getGlobalValue(), s);
        return terpri(s);
    }

    public static SubLObject write_tagged_value(final SubLObject tag, final SubLObject value, final SubLObject s) {
        write_opening_tag(tag, s);
        princ(value, s);
        write_closing_tag(tag, s);
        return terpri(s);
    }

    public static SubLObject write_opening_tag(final SubLObject tag, final SubLObject s) {
        return write_string(tag, s, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject write_closing_tag(final SubLObject tag, final SubLObject s) {
        write_string($str94$__, s, UNPROVIDED, UNPROVIDED);
        return write_string(tag, s, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject rkf_ts_run_query(final SubLObject tsuite, final SubLObject query, final SubLObject current_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = (ts_query_mt(query) == $INTERACTION_MT) ? current_mt : ts_query_mt(query);
        SubLObject answers = NIL;
        thread.resetMultipleValues();
        final SubLObject type = rkf_query_utilities.rkf_generic_query(ts_query_formula(query), mt, ts_query_backchain(query), ts_query_number(query), ts_query_time(query), ts_query_depth(query));
        final SubLObject results = thread.secondMultipleValue();
        final SubLObject status = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (type == $TRUTH) {
            SubLObject current;
            final SubLObject datum = current = results;
            SubLObject pro = NIL;
            SubLObject con = NIL;
            destructuring_bind_must_consp(current, datum, $list96);
            pro = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list96);
            con = current.first();
            current = current.rest();
            if (NIL == current) {
                answers = list($TRUTH, list(list($PRO, pro), list($CON, con)));
            } else {
                cdestructuring_bind_error(datum, $list96);
            }
        } else {
            answers = list($QUERY, rkf_query_utilities.rkf_expand_justifications(results));
        }
        return answers;
    }

    public static SubLObject rkf_ts_classify_terms_for_iet_answer_page_new(final SubLObject test_suite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_question = rkf_ts_classify_terms_used_new(test_suite, query, list(rkf_query_utilities.rkf_determine_query_type(cycl_query_specification.cycl_query_specification_formula(query), cycl_query_specification.cycl_query_specification_mt(query)), results), mt);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject support = thread.thirdMultipleValue();
        final SubLObject assertions = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject qa = append(v_question, v_answer);
        return values(rkf_ts_minimal_book_keeping_info_for_terms(qa), rkf_ts_minimal_book_keeping_info_for_terms(support), assertions);
    }

    public static SubLObject rkf_ts_classify_terms_for_iet_answer_page(final SubLObject tsuite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_question = rkf_ts_classify_terms_used(tsuite, query, results, mt);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject support = thread.thirdMultipleValue();
        final SubLObject assertions = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject qa = append(v_question, v_answer);
        return values(rkf_ts_minimal_book_keeping_info_for_terms(qa), rkf_ts_minimal_book_keeping_info_for_terms(support), assertions);
    }

    public static SubLObject rkf_ts_classify_terms_used_new(final SubLObject test_suite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        SubLObject v_question = NIL;
        SubLObject v_answer = NIL;
        SubLObject support = NIL;
        SubLObject assertions = NIL;
        SubLObject type = NIL;
        SubLObject the_results = NIL;
        destructuring_bind_must_consp(results, results, $list100);
        type = results.first();
        SubLObject current = results.rest();
        destructuring_bind_must_consp(current, results, $list100);
        the_results = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((type == $QUERY) || (type == $ASK)) {
                SubLObject cdolist_list_var = the_results;
                SubLObject result = NIL;
                result = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current_$10;
                    final SubLObject datum_$9 = current_$10 = result;
                    SubLObject v_bindings = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current_$10, datum_$9, $list102);
                    v_bindings = current_$10.first();
                    current_$10 = current_$10.rest();
                    destructuring_bind_must_consp(current_$10, datum_$9, $list102);
                    supports = current_$10.first();
                    current_$10 = current_$10.rest();
                    if (NIL == current_$10) {
                        final SubLObject binding_terms = rkf_ts_gather_used_terms(v_bindings);
                        final SubLObject support_terms = rkf_ts_gather_used_support_terms(supports);
                        final SubLObject assertion_ids = rkf_ts_gather_used_support_assertions(supports);
                        SubLObject cdolist_list_var_$11 = binding_terms;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var_$11.first();
                        while (NIL != cdolist_list_var_$11) {
                            final SubLObject item_var = v_term;
                            if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_answer = cons(item_var, v_answer);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            v_term = cdolist_list_var_$11.first();
                        } 
                        SubLObject cdolist_list_var_$12 = support_terms;
                        v_term = NIL;
                        v_term = cdolist_list_var_$12.first();
                        while (NIL != cdolist_list_var_$12) {
                            final SubLObject item_var = v_term;
                            if (NIL == member(item_var, support, symbol_function(EQL), symbol_function(IDENTITY))) {
                                support = cons(item_var, support);
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            v_term = cdolist_list_var_$12.first();
                        } 
                        SubLObject cdolist_list_var_$13 = assertion_ids;
                        SubLObject assertion_id = NIL;
                        assertion_id = cdolist_list_var_$13.first();
                        while (NIL != cdolist_list_var_$13) {
                            final SubLObject item_var = assertion_id;
                            if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                assertions = cons(item_var, assertions);
                            }
                            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                            assertion_id = cdolist_list_var_$13.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum_$9, $list102);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                } 
            } else {
                final SubLObject pro_args = assoc($PRO, the_results, UNPROVIDED, UNPROVIDED);
                final SubLObject pro = second(pro_args);
                final SubLObject con_args = assoc($CON, the_results, UNPROVIDED, UNPROVIDED);
                final SubLObject con = second(con_args);
                if (NIL != pro) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(pro);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(pro);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (NIL == member(item_var2, support, symbol_function(EQL), symbol_function(IDENTITY))) {
                            support = cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                            assertions = cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    } 
                }
                if (NIL != con) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(con);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(con);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (NIL == member(item_var2, support, symbol_function(EQL), symbol_function(IDENTITY))) {
                            support = cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                            assertions = cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    } 
                }
            }
        } else {
            cdestructuring_bind_error(results, $list100);
        }
        final SubLObject query_terms = v_question = rkf_ts_gather_used_terms(cycl_query_specification.cycl_query_specification_formula(query));
        return values(v_question, v_answer, support, assertions);
    }

    public static SubLObject rkf_ts_classify_terms_used(final SubLObject tsuite, final SubLObject query, final SubLObject results, final SubLObject mt) {
        SubLObject v_question = NIL;
        SubLObject v_answer = NIL;
        SubLObject support = NIL;
        SubLObject assertions = NIL;
        SubLObject type = NIL;
        SubLObject the_results = NIL;
        destructuring_bind_must_consp(results, results, $list100);
        type = results.first();
        SubLObject current = results.rest();
        destructuring_bind_must_consp(current, results, $list100);
        the_results = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((type == $QUERY) || (type == $ASK)) {
                SubLObject cdolist_list_var = the_results;
                SubLObject result = NIL;
                result = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current_$15;
                    final SubLObject datum_$14 = current_$15 = result;
                    SubLObject v_bindings = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current_$15, datum_$14, $list102);
                    v_bindings = current_$15.first();
                    current_$15 = current_$15.rest();
                    destructuring_bind_must_consp(current_$15, datum_$14, $list102);
                    supports = current_$15.first();
                    current_$15 = current_$15.rest();
                    if (NIL == current_$15) {
                        final SubLObject binding_terms = rkf_ts_gather_used_terms(v_bindings);
                        final SubLObject support_terms = rkf_ts_gather_used_support_terms(supports);
                        final SubLObject assertion_ids = rkf_ts_gather_used_support_assertions(supports);
                        SubLObject cdolist_list_var_$16 = binding_terms;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var_$16.first();
                        while (NIL != cdolist_list_var_$16) {
                            final SubLObject item_var = v_term;
                            if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_answer = cons(item_var, v_answer);
                            }
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            v_term = cdolist_list_var_$16.first();
                        } 
                        SubLObject cdolist_list_var_$17 = support_terms;
                        v_term = NIL;
                        v_term = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            final SubLObject item_var = v_term;
                            if (NIL == member(item_var, support, symbol_function(EQL), symbol_function(IDENTITY))) {
                                support = cons(item_var, support);
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            v_term = cdolist_list_var_$17.first();
                        } 
                        SubLObject cdolist_list_var_$18 = assertion_ids;
                        SubLObject assertion_id = NIL;
                        assertion_id = cdolist_list_var_$18.first();
                        while (NIL != cdolist_list_var_$18) {
                            final SubLObject item_var = assertion_id;
                            if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                assertions = cons(item_var, assertions);
                            }
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            assertion_id = cdolist_list_var_$18.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum_$14, $list102);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                } 
            } else {
                final SubLObject pro_args = assoc($PRO, the_results, UNPROVIDED, UNPROVIDED);
                final SubLObject pro = second(pro_args);
                final SubLObject con_args = assoc($CON, the_results, UNPROVIDED, UNPROVIDED);
                final SubLObject con = second(con_args);
                if (NIL != pro) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(pro);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(pro);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (NIL == member(item_var2, support, symbol_function(EQL), symbol_function(IDENTITY))) {
                            support = cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                            assertions = cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    } 
                }
                if (NIL != con) {
                    final SubLObject support_terms2 = rkf_ts_gather_used_support_terms(con);
                    final SubLObject assertion_ids2 = rkf_ts_gather_used_support_assertions(con);
                    SubLObject cdolist_list_var2 = support_terms2;
                    SubLObject v_term2 = NIL;
                    v_term2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = v_term2;
                        if (NIL == member(item_var2, support, symbol_function(EQL), symbol_function(IDENTITY))) {
                            support = cons(item_var2, support);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        v_term2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = assertion_ids2;
                    SubLObject assertion_id2 = NIL;
                    assertion_id2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = assertion_id2;
                        if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                            assertions = cons(item_var2, assertions);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion_id2 = cdolist_list_var2.first();
                    } 
                }
            }
        } else {
            cdestructuring_bind_error(results, $list100);
        }
        final SubLObject query_terms = v_question = rkf_ts_gather_used_terms(ts_query_formula(query));
        return values(v_question, v_answer, support, assertions);
    }

    public static SubLObject rkf_ts_gather_used_support_assertions(final SubLObject supports) {
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(supports, ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = assertion_handles.assertion_id(assertion);
            if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                assertions = cons(item_var, assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static SubLObject rkf_ts_gather_used_support_terms(final SubLObject formulas) {
        final SubLObject expanded_formulas = rkf_ts_expand_support_to_el_formulas(formulas);
        return rkf_ts_gather_used_terms(expanded_formulas);
    }

    public static SubLObject rkf_ts_expand_support_to_el_formulas(final SubLObject item) {
        if (NIL != assertion_handles.assertion_p(item)) {
            return rkf_ts_expand_support_to_el_formulas(uncanonicalizer.assertion_el_formula(item));
        }
        if (NIL != nart_handles.nart_p(item)) {
            return rkf_ts_expand_support_to_el_formulas(narts_high.nart_el_formula(item));
        }
        if (item.isCons()) {
            return cons(rkf_ts_expand_support_to_el_formulas(item.first()), rkf_ts_expand_support_to_el_formulas(item.rest()));
        }
        return item;
    }

    public static SubLObject rkf_ts_gather_used_terms(final SubLObject formulas) {
        final SubLObject terms = list_utilities.tree_find_all_if(FORT_P, formulas, UNPROVIDED);
        SubLObject result_terms = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nart_handles.nart_p(v_term)) {
                SubLObject cdolist_list_var_$19 = rkf_ts_gather_used_terms(narts_high.nart_el_formula(v_term));
                SubLObject nart_item = NIL;
                nart_item = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    result_terms = cons(nart_item, result_terms);
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    nart_item = cdolist_list_var_$19.first();
                } 
            } else {
                result_terms = cons(v_term, result_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return delete_duplicates(result_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ts_minimal_book_keeping_info_for_terms(final SubLObject terms) {
        SubLObject book_keeping_info = NIL;
        SubLObject cdolist_list_var = Sort.sort(terms, $sym105$STRING_, FORT_NAME);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject info = rkf_ts_minimal_book_keeping_info_for_term(v_term);
            book_keeping_info = cons(info, book_keeping_info);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(book_keeping_info);
    }

    public static SubLObject rkf_ts_minimal_book_keeping_info_for_term(final SubLObject v_term) {
        final SubLObject creator = bookkeeping_store.creator(v_term, UNPROVIDED);
        final SubLObject time = bookkeeping_store.creation_time(v_term, UNPROVIDED);
        final SubLObject second = bookkeeping_store.creation_second(v_term, UNPROVIDED);
        return list(v_term, creator, time, second);
    }

    public static SubLObject declare_rkf_test_suite_tool_file() {
        declareFunction(me, "new_test_suite_from_file", "NEW-TEST-SUITE-FROM-FILE", 1, 0, false);
        declareFunction(me, "test_suite_save", "TEST-SUITE-SAVE", 1, 0, false);
        declareFunction(me, "test_suite_write", "TEST-SUITE-WRITE", 2, 0, false);
        declareFunction(me, "fetch_test_suite_query_list", "FETCH-TEST-SUITE-QUERY-LIST", 1, 0, false);
        declareFunction(me, "test_suite_get_number_of_queries", "TEST-SUITE-GET-NUMBER-OF-QUERIES", 1, 0, false);
        declareFunction(me, "test_suite_find_query_by_id", "TEST-SUITE-FIND-QUERY-BY-ID", 2, 0, false);
        declareFunction(me, "test_suite_find_query_by_id_string", "TEST-SUITE-FIND-QUERY-BY-ID-STRING", 2, 0, false);
        declareFunction(me, "test_suite_query_siblings", "TEST-SUITE-QUERY-SIBLINGS", 2, 0, false);
        declareFunction(me, "test_suite_add_query", "TEST-SUITE-ADD-QUERY", 2, 0, false);
        declareFunction(me, "test_suite_drop_query", "TEST-SUITE-DROP-QUERY", 2, 0, false);
        declareFunction(me, "test_suite_run_query", "TEST-SUITE-RUN-QUERY", 2, 1, false);
        declareFunction(me, "ts_query_print_function_trampoline", "TS-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "ts_query_p", "TS-QUERY-P", 1, 0, false);
        new rkf_test_suite_tool.$ts_query_p$UnaryFunction();
        declareFunction(me, "ts_query_id", "TS-QUERY-ID", 1, 0, false);
        declareFunction(me, "ts_query_label", "TS-QUERY-LABEL", 1, 0, false);
        declareFunction(me, "ts_query_formula", "TS-QUERY-FORMULA", 1, 0, false);
        declareFunction(me, "ts_query_mt", "TS-QUERY-MT", 1, 0, false);
        declareFunction(me, "ts_query_number", "TS-QUERY-NUMBER", 1, 0, false);
        declareFunction(me, "ts_query_time", "TS-QUERY-TIME", 1, 0, false);
        declareFunction(me, "ts_query_backchain", "TS-QUERY-BACKCHAIN", 1, 0, false);
        declareFunction(me, "ts_query_depth", "TS-QUERY-DEPTH", 1, 0, false);
        declareFunction(me, "ts_query_expected", "TS-QUERY-EXPECTED", 1, 0, false);
        declareFunction(me, "_csetf_ts_query_id", "_CSETF-TS-QUERY-ID", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_label", "_CSETF-TS-QUERY-LABEL", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_formula", "_CSETF-TS-QUERY-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_mt", "_CSETF-TS-QUERY-MT", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_number", "_CSETF-TS-QUERY-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_time", "_CSETF-TS-QUERY-TIME", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_backchain", "_CSETF-TS-QUERY-BACKCHAIN", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_depth", "_CSETF-TS-QUERY-DEPTH", 2, 0, false);
        declareFunction(me, "_csetf_ts_query_expected", "_CSETF-TS-QUERY-EXPECTED", 2, 0, false);
        declareFunction(me, "make_ts_query", "MAKE-TS-QUERY", 0, 1, false);
        declareFunction(me, "visit_defstruct_ts_query", "VISIT-DEFSTRUCT-TS-QUERY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_ts_query_method", "VISIT-DEFSTRUCT-OBJECT-TS-QUERY-METHOD", 2, 0, false);
        declareFunction(me, "new_ts_query", "NEW-TS-QUERY", 7, 1, false);
        declareFunction(me, "clone_ts_query", "CLONE-TS-QUERY", 1, 0, false);
        declareFunction(me, "ts_query_label_update", "TS-QUERY-LABEL-UPDATE", 3, 0, false);
        declareFunction(me, "ts_query_formula_update", "TS-QUERY-FORMULA-UPDATE", 2, 0, false);
        declareFunction(me, "rkf_ts_parse_testcase_tokens", "RKF-TS-PARSE-TESTCASE-TOKENS", 1, 0, false);
        declareFunction(me, "rkf_ts_interpret_parse", "RKF-TS-INTERPRET-PARSE", 7, 0, false);
        declareFunction(me, "rkf_ts_write_one_query", "RKF-TS-WRITE-ONE-QUERY", 2, 0, false);
        declareFunction(me, "rkf_test_suite_print_function_trampoline", "RKF-TEST-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rkf_test_suite_p", "RKF-TEST-SUITE-P", 1, 0, false);
        new rkf_test_suite_tool.$rkf_test_suite_p$UnaryFunction();
        declareFunction(me, "rkf_tsuite_isg", "RKF-TSUITE-ISG", 1, 0, false);
        declareFunction(me, "rkf_tsuite_label", "RKF-TSUITE-LABEL", 1, 0, false);
        declareFunction(me, "rkf_tsuite_filename", "RKF-TSUITE-FILENAME", 1, 0, false);
        declareFunction(me, "rkf_tsuite_queries", "RKF-TSUITE-QUERIES", 1, 0, false);
        declareFunction(me, "rkf_tsuite_siblings", "RKF-TSUITE-SIBLINGS", 1, 0, false);
        declareFunction(me, "_csetf_rkf_tsuite_isg", "_CSETF-RKF-TSUITE-ISG", 2, 0, false);
        declareFunction(me, "_csetf_rkf_tsuite_label", "_CSETF-RKF-TSUITE-LABEL", 2, 0, false);
        declareFunction(me, "_csetf_rkf_tsuite_filename", "_CSETF-RKF-TSUITE-FILENAME", 2, 0, false);
        declareFunction(me, "_csetf_rkf_tsuite_queries", "_CSETF-RKF-TSUITE-QUERIES", 2, 0, false);
        declareFunction(me, "_csetf_rkf_tsuite_siblings", "_CSETF-RKF-TSUITE-SIBLINGS", 2, 0, false);
        declareFunction(me, "make_rkf_test_suite", "MAKE-RKF-TEST-SUITE", 0, 1, false);
        declareFunction(me, "visit_defstruct_rkf_test_suite", "VISIT-DEFSTRUCT-RKF-TEST-SUITE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rkf_test_suite_method", "VISIT-DEFSTRUCT-OBJECT-RKF-TEST-SUITE-METHOD", 2, 0, false);
        declareFunction(me, "new_rkf_tsuite", "NEW-RKF-TSUITE", 1, 0, false);
        declareFunction(me, "rkf_test_suite_queries_as_list", "RKF-TEST-SUITE-QUERIES-AS-LIST", 1, 0, false);
        declareFunction(me, "rkf_ts_obtain_test_suite", "RKF-TS-OBTAIN-TEST-SUITE", 1, 0, false);
        declareFunction(me, "rkf_ts_fetch_test_suite_in_xml", "RKF-TS-FETCH-TEST-SUITE-IN-XML", 1, 0, false);
        declareFunction(me, "rkf_ts_cleaned_string", "RKF-TS-CLEANED-STRING", 1, 0, false);
        declareFunction(me, "rkf_ts_parse_test_suite_tokens", "RKF-TS-PARSE-TEST-SUITE-TOKENS", 2, 0, false);
        declareFunction(me, "rkf_ts_insert_query", "RKF-TS-INSERT-QUERY", 2, 0, false);
        declareFunction(me, "rkf_ts_finalize_test_suite", "RKF-TS-FINALIZE-TEST-SUITE", 1, 0, false);
        declareFunction(me, "rkf_ts_initialize_all_siblings", "RKF-TS-INITIALIZE-ALL-SIBLINGS", 1, 0, false);
        declareFunction(me, "rkf_ts_update_query_siblings", "RKF-TS-UPDATE-QUERY-SIBLINGS", 2, 0, false);
        declareFunction(me, "rkf_ts_remove_query_from_siblings", "RKF-TS-REMOVE-QUERY-FROM-SIBLINGS", 2, 0, false);
        declareFunction(me, "rkf_ts_save_test_suite", "RKF-TS-SAVE-TEST-SUITE", 1, 0, false);
        declareFunction(me, "rkf_ts_write_test_suite", "RKF-TS-WRITE-TEST-SUITE", 2, 0, false);
        declareFunction(me, "rkf_ts_write_queries", "RKF-TS-WRITE-QUERIES", 2, 0, false);
        declareFunction(me, "rkf_ts_write_prologue", "RKF-TS-WRITE-PROLOGUE", 2, 0, false);
        declareFunction(me, "rkf_ts_write_definition", "RKF-TS-WRITE-DEFINITION", 2, 0, false);
        declareFunction(me, "rkf_ts_write_epilogue", "RKF-TS-WRITE-EPILOGUE", 2, 0, false);
        declareFunction(me, "write_tagged_value", "WRITE-TAGGED-VALUE", 3, 0, false);
        declareFunction(me, "write_opening_tag", "WRITE-OPENING-TAG", 2, 0, false);
        declareFunction(me, "write_closing_tag", "WRITE-CLOSING-TAG", 2, 0, false);
        declareFunction(me, "rkf_ts_run_query", "RKF-TS-RUN-QUERY", 3, 0, false);
        declareFunction(me, "rkf_ts_classify_terms_for_iet_answer_page_new", "RKF-TS-CLASSIFY-TERMS-FOR-IET-ANSWER-PAGE-NEW", 4, 0, false);
        declareFunction(me, "rkf_ts_classify_terms_for_iet_answer_page", "RKF-TS-CLASSIFY-TERMS-FOR-IET-ANSWER-PAGE", 4, 0, false);
        declareFunction(me, "rkf_ts_classify_terms_used_new", "RKF-TS-CLASSIFY-TERMS-USED-NEW", 4, 0, false);
        declareFunction(me, "rkf_ts_classify_terms_used", "RKF-TS-CLASSIFY-TERMS-USED", 4, 0, false);
        declareFunction(me, "rkf_ts_gather_used_support_assertions", "RKF-TS-GATHER-USED-SUPPORT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "rkf_ts_gather_used_support_terms", "RKF-TS-GATHER-USED-SUPPORT-TERMS", 1, 0, false);
        declareFunction(me, "rkf_ts_expand_support_to_el_formulas", "RKF-TS-EXPAND-SUPPORT-TO-EL-FORMULAS", 1, 0, false);
        declareFunction(me, "rkf_ts_gather_used_terms", "RKF-TS-GATHER-USED-TERMS", 1, 0, false);
        declareFunction(me, "rkf_ts_minimal_book_keeping_info_for_terms", "RKF-TS-MINIMAL-BOOK-KEEPING-INFO-FOR-TERMS", 1, 0, false);
        declareFunction(me, "rkf_ts_minimal_book_keeping_info_for_term", "RKF-TS-MINIMAL-BOOK-KEEPING-INFO-FOR-TERM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_test_suite_tool_file() {
        defconstant("*DTP-TS-QUERY*", TS_QUERY);
        deflexical("*RKF-TS-TEST-CASE*", $str43$_testcase_);
        deflexical("*RKF-TS-LABEL*", $str44$_label_);
        deflexical("*RKF-TS-FORMULA*", $str45$_formula_);
        deflexical("*RKF-TS-MICROTHEORY*", $str46$_microtheory_);
        deflexical("*RKF-TS-SETTINGS*", $str47$_settings_);
        deflexical("*RKF-TS-NUMBER*", $str48$_number_);
        deflexical("*RKF-TS-TIME*", $str49$_time_);
        deflexical("*RKF-TS-BACKCHAINING*", $str50$_backchaining_);
        deflexical("*RKF-TS-DEPTH*", $str51$_depth_);
        deflexical("*RKF-TS-TOKEN-INTERACTION-MT*", $str52$_interaction_mt__);
        deflexical("*RKF-TS-TOKEN-EVERYTHING*", $str53$_everything__);
        deflexical("*RKF-TS-TOKEN-FOREVER*", $str54$_forever__);
        deflexical("*RKF-TS-TOKEN-NONE*", $str55$_none__);
        defconstant("*DTP-RKF-TEST-SUITE*", RKF_TEST_SUITE);
        deflexical("*RKF-TS-DEFINITION*", $str87$_definition_);
        deflexical("*RKF-TS-TEST-SUITE*", $str88$_testsuite_);
        deflexical("*TEST-SUITE-QUERY-DEFAULT-LABEL*", $$$unnamed_query);
        return NIL;
    }

    public static SubLObject setup_rkf_test_suite_tool_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ts_query$.getGlobalValue(), symbol_function(TS_QUERY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(TS_QUERY_ID, _CSETF_TS_QUERY_ID);
        def_csetf(TS_QUERY_LABEL, _CSETF_TS_QUERY_LABEL);
        def_csetf(TS_QUERY_FORMULA, _CSETF_TS_QUERY_FORMULA);
        def_csetf(TS_QUERY_MT, _CSETF_TS_QUERY_MT);
        def_csetf(TS_QUERY_NUMBER, _CSETF_TS_QUERY_NUMBER);
        def_csetf(TS_QUERY_TIME, _CSETF_TS_QUERY_TIME);
        def_csetf(TS_QUERY_BACKCHAIN, _CSETF_TS_QUERY_BACKCHAIN);
        def_csetf(TS_QUERY_DEPTH, _CSETF_TS_QUERY_DEPTH);
        def_csetf(TS_QUERY_EXPECTED, _CSETF_TS_QUERY_EXPECTED);
        identity(TS_QUERY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ts_query$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TS_QUERY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_test_suite$.getGlobalValue(), symbol_function(RKF_TEST_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list69);
        def_csetf(RKF_TSUITE_ISG, _CSETF_RKF_TSUITE_ISG);
        def_csetf(RKF_TSUITE_LABEL, _CSETF_RKF_TSUITE_LABEL);
        def_csetf(RKF_TSUITE_FILENAME, _CSETF_RKF_TSUITE_FILENAME);
        def_csetf(RKF_TSUITE_QUERIES, _CSETF_RKF_TSUITE_QUERIES);
        def_csetf(RKF_TSUITE_SIBLINGS, _CSETF_RKF_TSUITE_SIBLINGS);
        identity(RKF_TEST_SUITE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_test_suite$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_TEST_SUITE_METHOD));
        return NIL;
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

    

    public static final class $ts_query_native extends SubLStructNative {
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

        private $ts_query_native() {
            this.$id = Lisp.NIL;
            this.$label = Lisp.NIL;
            this.$formula = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$number = Lisp.NIL;
            this.$time = Lisp.NIL;
            this.$backchain = Lisp.NIL;
            this.$depth = Lisp.NIL;
            this.$expected = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($ts_query_native.class, TS_QUERY, TS_QUERY_P, $list3, $list4, new String[]{ "$id", "$label", "$formula", "$mt", "$number", "$time", "$backchain", "$depth", "$expected" }, $list5, $list6, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $ts_query_p$UnaryFunction extends UnaryFunction {
        public $ts_query_p$UnaryFunction() {
            super(extractFunctionNamed("TS-QUERY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ts_query_p(arg1);
        }
    }

    public static final class $rkf_test_suite_native extends SubLStructNative {
        public SubLObject $isg;

        public SubLObject $label;

        public SubLObject $filename;

        public SubLObject $queries;

        public SubLObject $siblings;

        private static final SubLStructDeclNative structDecl;

        private $rkf_test_suite_native() {
            this.$isg = Lisp.NIL;
            this.$label = Lisp.NIL;
            this.$filename = Lisp.NIL;
            this.$queries = Lisp.NIL;
            this.$siblings = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($rkf_test_suite_native.class, RKF_TEST_SUITE, RKF_TEST_SUITE_P, $list64, $list65, new String[]{ "$isg", "$label", "$filename", "$queries", "$siblings" }, $list66, $list67, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $rkf_test_suite_p$UnaryFunction extends UnaryFunction {
        public $rkf_test_suite_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-TEST-SUITE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_test_suite_p(arg1);
        }
    }
}

/**
 * Total time: 364 ms
 */
