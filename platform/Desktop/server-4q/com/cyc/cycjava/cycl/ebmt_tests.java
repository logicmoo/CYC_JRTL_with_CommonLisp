package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ebmt_tests extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ebmt_tests";
    public static final String myFingerPrint = "0b04504d3878a0f26d7ace58ffdb9d528003f67b879c048d375e834f2d8ded50";
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 1733L)
    private static SubLSymbol $ebmt_training_output_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 1849L)
    private static SubLSymbol $ebmt_testing_output_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 1922L)
    private static SubLSymbol $ebmt_not_yet_scored_lines_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2005L)
    private static SubLSymbol $ebmt_scored_lines_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2074L)
    private static SubLSymbol $ebmt_scored_data_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2141L)
    private static SubLSymbol $ebmt_keepalive_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2194L)
    private static SubLSymbol $ebmt_global_summary_file$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2358L)
    private static SubLSymbol $ebmt_training_recall_graph$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2478L)
    private static SubLSymbol $ebmt_parsing_results_graph$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2602L)
    private static SubLSymbol $ebmt_accuracy_graph$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 30302L)
    private static SubLSymbol $ebmt_plot_params$;
    private static final SubLString $str0$training_output_txt;
    private static final SubLString $str1$testing_output_txt;
    private static final SubLString $str2$to_be_scored_lines_txt;
    private static final SubLString $str3$scored_lines_txt;
    private static final SubLString $str4$scored_data_txt;
    private static final SubLString $str5$;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$TEST_DIR_VAR;
    private static final SubLSymbol $sym8$OS_PROCESS;
    private static final SubLSymbol $sym9$CLET;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$_EBMT_INDEX_CONTENT_;
    private static final SubLSymbol $sym12$FORMAT_NIL;
    private static final SubLString $str13$_A_ebmt_index_txt;
    private static final SubLSymbol $sym14$_EBMT_INDEX_LOG_;
    private static final SubLString $str15$_A_ebmt_index_log;
    private static final SubLSymbol $sym16$EBMT_INDEX_SERVER_PROCESS;
    private static final SubLSymbol $sym17$WITHOUT_PRETTY_PRINTING;
    private static final SubLSymbol $sym18$KILL_OS_PROCESS;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw22$EVERY_NTH;
    private static final SubLSymbol $sym23$PAIR;
    private static final SubLSymbol $sym24$SOURCE_VAR;
    private static final SubLSymbol $sym25$PROGRESS_CDOLIST;
    private static final SubLSymbol $sym26$EBMT_NL_CYCL_PAIRS_FROM_SOURCE;
    private static final SubLString $str27$Processing_EBMT_data_from__a____;
    private static final SubLSymbol $sym28$CDESTRUCTURING_BIND;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$LINE;
    private static final SubLSymbol $sym31$DATUM;
    private static final SubLSymbol $sym32$DO_FILE_LINES;
    private static final SubLSymbol $sym33$READ_FROM_STRING_IGNORING_ERRORS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$PIF;
    private static final SubLSymbol $sym36$CNOT;
    private static final SubLSymbol $sym37$EBMT_TESTING_OUTPUT_DATUM_P;
    private static final SubLSymbol $sym38$WARN;
    private static final SubLString $str39$Got_a_malformed_EBMT_testing_outp;
    private static final SubLSymbol $sym40$EBMT_CANONICALIZE_EL_SENTENCE;
    private static final SubLSymbol $kw41$TEST;
    private static final SubLSymbol $kw42$OWNER;
    private static final SubLSymbol $kw43$CLASSES;
    private static final SubLSymbol $kw44$KB;
    private static final SubLSymbol $kw45$FULL;
    private static final SubLSymbol $kw46$WORKING_;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$EQUALS_EL_;
    private static final SubLSymbol $sym49$EBMT_PARSE;
    private static final SubLSymbol $sym50$EBMT_TEST_FUNC;
    private static final SubLList $list51;
    private static final SubLString $str52$_error_output_txt;
    private static final SubLSymbol $kw53$OUTPUT;
    private static final SubLString $str54$Unable_to_open__S;
    private static final SubLString $str55$_cyc_top_data_ebmt_testing_query_;
    private static final SubLString $str56$_;
    private static final SubLString $str57$_cyc_top_data_ebmt_testing_query_;
    private static final SubLString $str58$_cyc_top_data_ebmt_testing_query_;
    private static final SubLString $str59$_cyc_top_data_ebmt_testing_query_;
    private static final SubLString $str60$_cyc_top_data_ebmt_testing_query_;
    private static final SubLObject $const61$EBMTTrainingExamplesFromQLMt;
    private static final SubLString $str62$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str63$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str64$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str65$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str66$_cyc_top_data_ebmt_testing_financ;
    private static final SubLObject $const67$EBMTTrainingExamplesForWesternBus;
    private static final SubLString $str68$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str69$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str70$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str71$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str72$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str73$_cyc_top_data_ebmt_testing_financ;
    private static final SubLString $str74$_opt_local_pkg_j2sdk1_4_2_bin_jav;
    private static final SubLString $str75$_home_shah_cvs_head_cycorp_cyc_ja;
    private static final SubLString $str76$_cp;
    private static final SubLString $str77$com_cyc_common_nlp_EBMTTemplateIn;
    private static final SubLString $str78$_i;
    private static final SubLString $str79$_ebmt_index_;
    private static final SubLString $str80$EBMT_Template_Index_Server;
    private static final SubLSymbol $sym81$EBMT_TESTING_SOURCE_P;
    private static final SubLSymbol $kw82$INPUT;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$STRINGP;
    private static final SubLString $str86$localhost;
    private static final SubLString $str87$_ebmt_index_txt;
    private static final SubLString $str88$_ebmt_index_log;
    private static final SubLString $str89$Processing_EBMT_data_from_;
    private static final SubLString $str90$____;
    private static final SubLString $str91$cdolist;
    private static final SubLList $list92;
    private static final SubLString $str93$Added;
    private static final SubLSymbol $kw94$GENERAL;
    private static final SubLSymbol $kw95$SPECIFIC;
    private static final SubLString $str96$Unexpected_type_of_EBMT_template_;
    private static final SubLString $str97$Already_indexed;
    private static final SubLString $str98$Unexpected_indexing_result_of_EBM;
    private static final SubLString $str99$_S__;
    private static final SubLObject $const100$InferencePSC;
    private static final SubLSymbol $sym101$HL_TO_EL;
    private static final SubLSymbol $kw102$FAILURE;
    private static final SubLSymbol $kw103$SUCCESS;
    private static final SubLInteger $int104$100;
    private static final SubLString $str105$Summarizing_EBMT_training_details;
    private static final SubLSymbol $kw106$TRAINING_INPUT_MT;
    private static final SubLSymbol $kw107$USER_TRAINING_EXAMPLES;
    private static final SubLSymbol $kw108$TRAINING_EXAMPLES;
    private static final SubLSymbol $kw109$GENERAL_TEMPLATES;
    private static final SubLSymbol $kw110$GENERAL_TEMPLATES_PC;
    private static final SubLSymbol $kw111$SPECIFIC_TEMPLATES;
    private static final SubLSymbol $kw112$SPECIFIC_TEMPLATES_PC;
    private static final SubLSymbol $kw113$NO_TEMPLATES;
    private static final SubLSymbol $kw114$NO_TEMPLATES_PC;
    private static final SubLSymbol $kw115$DUPLICATE_TEMPLATES;
    private static final SubLSymbol $kw116$DUPLICATE_TEMPLATES_PC;
    private static final SubLSymbol $kw117$TOTAL_TRAINING_TIME;
    private static final SubLSymbol $kw118$MIN_TRAINING_TIME;
    private static final SubLSymbol $kw119$MAX_TRAINING_TIME;
    private static final SubLList $list120;
    private static final SubLSymbol $kw121$ALMOST;
    private static final SubLSymbol $kw122$UNKNOWN;
    private static final SubLString $str123$Unexpected_EBMT_result__s;
    private static final SubLList $list124;
    private static final SubLSymbol $kw125$FUNCTION;
    private static final SubLSymbol $kw126$TESTING_INPUT_SOURCE;
    private static final SubLSymbol $kw127$TEST_EXAMPLES;
    private static final SubLSymbol $kw128$SUCCESSFUL_TESTS;
    private static final SubLSymbol $kw129$SUCCESSFUL_TESTS_PC;
    private static final SubLSymbol $kw130$ALMOST_SUCCESSFUL_TESTS;
    private static final SubLSymbol $kw131$ALMOST_SUCCESSFUL_TESTS_PC;
    private static final SubLSymbol $kw132$UNKNOWN_TESTS;
    private static final SubLSymbol $kw133$UNKNOWN_TESTS_PC;
    private static final SubLSymbol $kw134$FAILED_TESTS;
    private static final SubLSymbol $kw135$FAILED_TESTS_PC;
    private static final SubLSymbol $kw136$TOTAL_UNIQUE_INTERPS;
    private static final SubLSymbol $kw137$MAX_INTERPS_PER_EXAMPLE;
    private static final SubLSymbol $kw138$MEAN_INTERPS_PER_EXAMPLE;
    private static final SubLSymbol $kw139$MEDIAN_INTERPS_PER_EXAMPLE;
    private static final SubLSymbol $kw140$TOTAL_TESTING_TIME;
    private static final SubLSymbol $kw141$TOTAL_SUCCESSFUL_TIME;
    private static final SubLSymbol $kw142$TOTAL_ALMOST_SUCCESSFUL_TIME;
    private static final SubLSymbol $kw143$TOTAL_UNKNOWN_TIME;
    private static final SubLSymbol $kw144$TOTAL_FAILED_TIME;
    private static final SubLSymbol $kw145$MAX_TIME_PER_EXAMPLE;
    private static final SubLSymbol $kw146$MEAN_TIME_PER_EXAMPLE;
    private static final SubLSymbol $kw147$MEDIAN_TIME_PER_EXAMPLE;
    private static final SubLSymbol $kw148$TOP1;
    private static final SubLSymbol $kw149$TOP2;
    private static final SubLSymbol $kw150$TOP3;
    private static final SubLSymbol $kw151$TOP4;
    private static final SubLSymbol $kw152$TOP5;
    private static final SubLSymbol $kw153$TIMESTAMP;
    private static final SubLSymbol $kw154$SYSTEM;
    private static final SubLSymbol $kw155$HOST;
    private static final SubLSymbol $kw156$BOGOMIPS;
    private static final SubLString $str157$summary_txt;
    private static final SubLString $str158$summary_plist_lisp;
    private static final SubLString $str159$_s__;
    private static final SubLSymbol $kw160$APPEND;
    private static final SubLSymbol $sym161$KEYWORDP;
    private static final SubLSymbol $sym162$GET_EBMT_PLOT_VALUE;
    private static final SubLSymbol $kw163$RAW_DATA_TYPES;
    private static final SubLSymbol $kw164$COMPUTED_DATA_TYPES;
    private static final SubLList $list165;
    private static final SubLList $list166;
    private static final SubLSymbol $kw167$OUTPUT_FILE;
    private static final SubLList $list168;
    private static final SubLSymbol $kw169$LINE_LABELS;
    private static final SubLSymbol $kw170$EOF;
    private static final SubLString $str171$_n;
    private static final SubLSymbol $kw172$XTICS;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLList $list177;
    private static final SubLSymbol $kw178$EBMT_GRAPHS_UPDATED;
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 2739L)
    public static SubLObject with_standard_ebmt_testing_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_dir = (SubLObject)ebmt_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list6);
        test_dir = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject test_dir_var = (SubLObject)ebmt_tests.$sym7$TEST_DIR_VAR;
        final SubLObject os_process = (SubLObject)ebmt_tests.$sym8$OS_PROCESS;
        return (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(test_dir_var, test_dir)), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$list10, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym11$_EBMT_INDEX_CONTENT_, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym12$FORMAT_NIL, (SubLObject)ebmt_tests.$str13$_A_ebmt_index_txt, test_dir_var)), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym14$_EBMT_INDEX_LOG_, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym12$FORMAT_NIL, (SubLObject)ebmt_tests.$str15$_A_ebmt_index_log, test_dir_var))), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(os_process, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym16$EBMT_INDEX_SERVER_PROCESS, test_dir_var))), reader.bq_cons((SubLObject)ebmt_tests.$sym17$WITHOUT_PRETTY_PRINTING, ConsesLow.append(body, (SubLObject)ebmt_tests.NIL)), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym18$KILL_OS_PROCESS, os_process))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 3369L)
    public static SubLObject do_ebmt_nl_cycl_pairs_from_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl = (SubLObject)ebmt_tests.NIL;
        SubLObject cycl = (SubLObject)ebmt_tests.NIL;
        SubLObject source = (SubLObject)ebmt_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list19);
        nl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list19);
        cycl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list19);
        source = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)ebmt_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)ebmt_tests.NIL;
        SubLObject current_$1 = (SubLObject)ebmt_tests.NIL;
        while (ebmt_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ebmt_tests.$list19);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ebmt_tests.$list19);
            if (ebmt_tests.NIL == conses_high.member(current_$1, (SubLObject)ebmt_tests.$list20, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED)) {
                bad = (SubLObject)ebmt_tests.T;
            }
            if (current_$1 == ebmt_tests.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (ebmt_tests.NIL != bad && ebmt_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebmt_tests.$list19);
        }
        final SubLObject every_nth_tail = cdestructuring_bind.property_list_member((SubLObject)ebmt_tests.$kw22$EVERY_NTH, current);
        final SubLObject every_nth = (SubLObject)((ebmt_tests.NIL != every_nth_tail) ? conses_high.cadr(every_nth_tail) : ebmt_tests.ONE_INTEGER);
        final SubLObject body;
        current = (body = temp);
        final SubLObject pair = (SubLObject)ebmt_tests.$sym23$PAIR;
        final SubLObject source_var = (SubLObject)ebmt_tests.$sym24$SOURCE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(source_var, source)), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym25$PROGRESS_CDOLIST, (SubLObject)ConsesLow.list(pair, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym26$EBMT_NL_CYCL_PAIRS_FROM_SOURCE, source_var, every_nth), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym12$FORMAT_NIL, (SubLObject)ebmt_tests.$str27$Processing_EBMT_data_from__a____, source_var)), (SubLObject)ConsesLow.listS((SubLObject)ebmt_tests.$sym28$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(nl, cycl), pair, ConsesLow.append(body, (SubLObject)ebmt_tests.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 3764L)
    public static SubLObject ebmt_do_testing_output_data_from_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl = (SubLObject)ebmt_tests.NIL;
        SubLObject cycl = (SubLObject)ebmt_tests.NIL;
        SubLObject num_interps_per_example = (SubLObject)ebmt_tests.NIL;
        SubLObject test_result = (SubLObject)ebmt_tests.NIL;
        SubLObject time_taken = (SubLObject)ebmt_tests.NIL;
        SubLObject match_list = (SubLObject)ebmt_tests.NIL;
        SubLObject parsed_cycls = (SubLObject)ebmt_tests.NIL;
        SubLObject weights = (SubLObject)ebmt_tests.NIL;
        SubLObject testing_output_file = (SubLObject)ebmt_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        nl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        cycl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        num_interps_per_example = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        test_result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        time_taken = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        match_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        parsed_cycls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        weights = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list29);
        testing_output_file = current.first();
        current = current.rest();
        if (ebmt_tests.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject line = (SubLObject)ebmt_tests.$sym30$LINE;
            final SubLObject datum_$2 = (SubLObject)ebmt_tests.$sym31$DATUM;
            return (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym32$DO_FILE_LINES, (SubLObject)ConsesLow.list(line, testing_output_file), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(datum_$2, (SubLObject)ConsesLow.listS((SubLObject)ebmt_tests.$sym33$READ_FROM_STRING_IGNORING_ERRORS, line, (SubLObject)ebmt_tests.$list34))), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym35$PIF, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym36$CNOT, (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym37$EBMT_TESTING_OUTPUT_DATUM_P, datum_$2)), (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$sym38$WARN, (SubLObject)ebmt_tests.$str39$Got_a_malformed_EBMT_testing_outp, line), (SubLObject)ConsesLow.listS((SubLObject)ebmt_tests.$sym28$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(nl, cycl, num_interps_per_example, test_result, time_taken, match_list, parsed_cycls, weights), datum_$2, ConsesLow.append(body, (SubLObject)ebmt_tests.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebmt_tests.$list29);
        return (SubLObject)ebmt_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 5011L)
    public static SubLObject ebmt_test_func(final SubLObject actual_ans, final SubLObject expected_ans) {
        return subl_promotions.memberP(expected_ans, actual_ans, (SubLObject)ebmt_tests.$sym48$EQUALS_EL_, (SubLObject)ebmt_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 6720L)
    public static SubLObject ebmt_test_loop_single_corpus(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, SubLObject training_every_nth, SubLObject testing_every_nth, SubLObject global_summaryP, SubLObject update_graphsP, SubLObject f_summary, SubLObject verboseP) {
        if (training_every_nth == ebmt_tests.UNPROVIDED) {
            training_every_nth = (SubLObject)ebmt_tests.ONE_INTEGER;
        }
        if (testing_every_nth == ebmt_tests.UNPROVIDED) {
            testing_every_nth = (SubLObject)ebmt_tests.ONE_INTEGER;
        }
        if (global_summaryP == ebmt_tests.UNPROVIDED) {
            global_summaryP = (SubLObject)ebmt_tests.NIL;
        }
        if (update_graphsP == ebmt_tests.UNPROVIDED) {
            update_graphsP = (SubLObject)ebmt_tests.NIL;
        }
        if (f_summary == ebmt_tests.UNPROVIDED) {
            f_summary = (SubLObject)ebmt_tests.NIL;
        }
        if (verboseP == ebmt_tests.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ebmt_tests.NIL == Filesys.directory_p(test_dir)) {
            Filesys.make_directory(test_dir, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
        }
        SubLObject stream = (SubLObject)ebmt_tests.NIL;
        try {
            stream = compatibility.open_text(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(test_dir), (SubLObject)ebmt_tests.$str52$_error_output_txt), (SubLObject)ebmt_tests.$kw53$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(test_dir), (SubLObject)ebmt_tests.$str52$_error_output_txt));
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
            try {
                StreamsLow.$error_output$.bind(s_out, thread);
                ebmt_test_index_creation(test_dir, training_mt, training_every_nth, verboseP);
                ebmt_test_parsing_with_index(test_dir, testing_source, testing_every_nth);
            }
            finally {
                StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (testing_source.isString()) {
            f_summary = ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, ebmt_tests.$ebmt_scored_data_filename$.getGlobalValue());
        }
        else {
            f_summary = ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, (SubLObject)ebmt_tests.UNPROVIDED);
        }
        return f_summary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 12158L)
    public static SubLObject ebmt_evaluation_ql_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = Sequences.cconcatenate((SubLObject)ebmt_tests.$str55$_cyc_top_data_ebmt_testing_query_, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring((SubLObject)ebmt_tests.UNPROVIDED)), ebmt_tests.$str56$_ });
        final SubLObject _prev_bind_0 = ebmt_tests.$ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = ebmt_tests.$ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = ebmt_tests.$ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = ebmt_tests.$ebmt_accuracy_graph$.currentBinding(thread);
        try {
            ebmt_tests.$ebmt_global_summary_file$.bind((SubLObject)ebmt_tests.$str57$_cyc_top_data_ebmt_testing_query_, thread);
            ebmt_tests.$ebmt_training_recall_graph$.bind((SubLObject)ebmt_tests.$str58$_cyc_top_data_ebmt_testing_query_, thread);
            ebmt_tests.$ebmt_parsing_results_graph$.bind((SubLObject)ebmt_tests.$str59$_cyc_top_data_ebmt_testing_query_, thread);
            ebmt_tests.$ebmt_accuracy_graph$.bind((SubLObject)ebmt_tests.$str60$_cyc_top_data_ebmt_testing_query_, thread);
            ebmt_test_loop_single_corpus(test_dir, ebmt_tests.$const61$EBMTTrainingExamplesFromQLMt, ebmt_tests.$const61$EBMTTrainingExamplesFromQLMt, (SubLObject)ebmt_tests.ONE_INTEGER, (SubLObject)ebmt_tests.ONE_INTEGER, (SubLObject)ebmt_tests.T, (SubLObject)ebmt_tests.T, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
        }
        finally {
            ebmt_tests.$ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            ebmt_tests.$ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            ebmt_tests.$ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            ebmt_tests.$ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 13076L)
    public static SubLObject ebmt_evaluation_financial_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = Sequences.cconcatenate((SubLObject)ebmt_tests.$str62$_cyc_top_data_ebmt_testing_financ, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring((SubLObject)ebmt_tests.UNPROVIDED)), ebmt_tests.$str56$_ });
        final SubLObject _prev_bind_0 = ebmt_tests.$ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = ebmt_tests.$ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = ebmt_tests.$ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = ebmt_tests.$ebmt_accuracy_graph$.currentBinding(thread);
        try {
            ebmt_tests.$ebmt_global_summary_file$.bind((SubLObject)ebmt_tests.$str63$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_tests.$ebmt_training_recall_graph$.bind((SubLObject)ebmt_tests.$str64$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_tests.$ebmt_parsing_results_graph$.bind((SubLObject)ebmt_tests.$str65$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_tests.$ebmt_accuracy_graph$.bind((SubLObject)ebmt_tests.$str66$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_test_loop_single_corpus(test_dir, ebmt_tests.$const67$EBMTTrainingExamplesForWesternBus, ebmt_tests.$const67$EBMTTrainingExamplesForWesternBus, (SubLObject)ebmt_tests.ONE_INTEGER, (SubLObject)ebmt_tests.ONE_INTEGER, (SubLObject)ebmt_tests.T, (SubLObject)ebmt_tests.T, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
        }
        finally {
            ebmt_tests.$ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            ebmt_tests.$ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            ebmt_tests.$ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            ebmt_tests.$ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 14072L)
    public static SubLObject ebmt_evaluation_financial_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = Sequences.cconcatenate((SubLObject)ebmt_tests.$str68$_cyc_top_data_ebmt_testing_financ, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring((SubLObject)ebmt_tests.UNPROVIDED)), ebmt_tests.$str56$_ });
        final SubLObject _prev_bind_0 = ebmt_tests.$ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = ebmt_tests.$ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = ebmt_tests.$ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = ebmt_tests.$ebmt_accuracy_graph$.currentBinding(thread);
        try {
            ebmt_tests.$ebmt_global_summary_file$.bind((SubLObject)ebmt_tests.$str69$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_tests.$ebmt_training_recall_graph$.bind((SubLObject)ebmt_tests.$str70$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_tests.$ebmt_parsing_results_graph$.bind((SubLObject)ebmt_tests.$str71$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_tests.$ebmt_accuracy_graph$.bind((SubLObject)ebmt_tests.$str72$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_test_loop_single_corpus(test_dir, ebmt_tests.$const67$EBMTTrainingExamplesForWesternBus, (SubLObject)ebmt_tests.$str73$_cyc_top_data_ebmt_testing_financ, (SubLObject)ebmt_tests.ONE_INTEGER, (SubLObject)ebmt_tests.ONE_INTEGER, (SubLObject)ebmt_tests.T, (SubLObject)ebmt_tests.T, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
        }
        finally {
            ebmt_tests.$ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            ebmt_tests.$ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            ebmt_tests.$ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            ebmt_tests.$ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 15188L)
    public static SubLObject ebmt_possibly_update_keepalive_file() {
        return file_utilities.possibly_update_keepalive_file(ebmt_keepalive_filename());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 15333L)
    public static SubLObject ebmt_keepalive_filename() {
        return (SubLObject)ebmt_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 15505L)
    public static SubLObject ebmt_index_server_process(final SubLObject index_path) {
        final SubLObject program = (SubLObject)ebmt_tests.$str74$_opt_local_pkg_j2sdk1_4_2_bin_jav;
        final SubLObject classpath = (SubLObject)ebmt_tests.$str75$_home_shah_cvs_head_cycorp_cyc_ja;
        final SubLObject args = (SubLObject)ConsesLow.list((SubLObject)ebmt_tests.$str76$_cp, classpath, (SubLObject)ebmt_tests.$str77$com_cyc_common_nlp_EBMTTemplateIn, (SubLObject)ebmt_tests.$str78$_i, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(index_path), (SubLObject)ebmt_tests.$str79$_ebmt_index_));
        final SubLObject os_process = os_process_utilities.make_os_process((SubLObject)ebmt_tests.$str80$EBMT_Template_Index_Server, program, args, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
        Threads.sleep((SubLObject)ebmt_tests.FIVE_INTEGER);
        return os_process;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 16461L)
    public static SubLObject ebmt_nl_cycl_pairs_from_source(SubLObject source, final SubLObject every_nth) {
        assert ebmt_tests.NIL != ebmt_testing_source_p(source) : source;
        if (source.isString()) {
            return ebmt_nl_cycl_pairs_from_file(source, every_nth);
        }
        return ebmt_nl_cycl_pairs_from_kb(source, every_nth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 16763L)
    public static SubLObject ebmt_nl_cycl_pairs_from_file(final SubLObject file, final SubLObject every_nth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pairs = (SubLObject)ebmt_tests.NIL;
        SubLObject stream = (SubLObject)ebmt_tests.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)ebmt_tests.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)ebmt_tests.$kw82$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$3 = stream_var;
                SubLObject line_number_var = (SubLObject)ebmt_tests.NIL;
                SubLObject line = (SubLObject)ebmt_tests.NIL;
                line_number_var = (SubLObject)ebmt_tests.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$3); ebmt_tests.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$3)) {
                    pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(line, (SubLObject)ebmt_tests.NIL), pairs);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return list_utilities.every_nth(every_nth, Sequences.nreverse(pairs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 16966L)
    public static SubLObject ebmt_nl_cycl_pairs_from_kb(final SubLObject mt, final SubLObject every_nth) {
        return list_utilities.every_nth(every_nth, ask_utilities.query_template((SubLObject)ebmt_tests.$list83, (SubLObject)ebmt_tests.$list84, mt, (SubLObject)ebmt_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 17243L)
    public static SubLObject ebmt_test_index_creation(final SubLObject test_dir, final SubLObject training_mt, final SubLObject every_nth, SubLObject verboseP) {
        if (verboseP == ebmt_tests.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_tests.NIL != Types.stringp(test_dir) : test_dir;
        final SubLObject f_out = Sequences.cconcatenate(test_dir, ebmt_tests.$ebmt_training_output_filename$.getGlobalValue());
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind((SubLObject)ebmt_tests.$str86$localhost, thread);
            lucene_index.$ebmt_index_content$.bind(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(test_dir), (SubLObject)ebmt_tests.$str87$_ebmt_index_txt), thread);
            lucene_index.$ebmt_index_log$.bind(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(test_dir), (SubLObject)ebmt_tests.$str88$_ebmt_index_log), thread);
            final SubLObject os_process = ebmt_index_server_process(test_dir);
            final SubLObject _prev_bind_0_$4 = print_high.$print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_1_$5 = print_high.$print_length$.currentBinding(thread);
            final SubLObject _prev_bind_2_$6 = print_high.$print_level$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)ebmt_tests.NIL, thread);
                print_high.$print_length$.bind((SubLObject)ebmt_tests.NIL, thread);
                print_high.$print_level$.bind((SubLObject)ebmt_tests.NIL, thread);
                SubLObject stream = (SubLObject)ebmt_tests.NIL;
                try {
                    stream = compatibility.open_text(f_out, (SubLObject)ebmt_tests.$kw53$OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, f_out);
                    }
                    final SubLObject s_out = stream;
                    final SubLObject list_var = ebmt_nl_cycl_pairs_from_source(training_mt, every_nth);
                    final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$6 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$7 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)((ebmt_tests.NIL != Sequences.cconcatenate((SubLObject)ebmt_tests.$str89$Processing_EBMT_data_from_, new SubLObject[] { format_nil.format_nil_a_no_copy(training_mt), ebmt_tests.$str90$____ })) ? Sequences.cconcatenate((SubLObject)ebmt_tests.$str89$Processing_EBMT_data_from_, new SubLObject[] { format_nil.format_nil_a_no_copy(training_mt), ebmt_tests.$str90$____ }) : ebmt_tests.$str91$cdolist), thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)ebmt_tests.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)ebmt_tests.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)ebmt_tests.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)ebmt_tests.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject pair = (SubLObject)ebmt_tests.NIL;
                            pair = csome_list_var.first();
                            while (ebmt_tests.NIL != csome_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject nl = (SubLObject)ebmt_tests.NIL;
                                SubLObject cycl = (SubLObject)ebmt_tests.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list92);
                                nl = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list92);
                                cycl = current.first();
                                current = current.rest();
                                if (ebmt_tests.NIL == current) {
                                    ebmt_possibly_update_keepalive_file();
                                    SubLObject num_general_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
                                    SubLObject num_specific_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
                                    SubLObject num_already_indexed_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
                                    SubLObject num_failed_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
                                    SubLObject templates = (SubLObject)ebmt_tests.NIL;
                                    SubLObject nl_cycl_pairs = (SubLObject)ebmt_tests.NIL;
                                    SubLObject time_taken = (SubLObject)ebmt_tests.NIL;
                                    final SubLObject time_var = Time.get_internal_real_time();
                                    templates = ebmt_template_parser.ebmt_create_and_add_templates(nl, cycl, ebmt_template_parser.new_ebmt_lexicon((SubLObject)ebmt_tests.UNPROVIDED), (SubLObject)ebmt_tests.NIL, verboseP);
                                    time_taken = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if (ebmt_tests.NIL == templates) {
                                        num_failed_templates = Numbers.add(num_failed_templates, (SubLObject)ebmt_tests.ONE_INTEGER);
                                    }
                                    SubLObject cdolist_list_var = templates;
                                    SubLObject template = (SubLObject)ebmt_tests.NIL;
                                    template = cdolist_list_var.first();
                                    while (ebmt_tests.NIL != cdolist_list_var) {
                                        nl_cycl_pairs = (SubLObject)ConsesLow.cons(ebmt_template_parser.ebmt_template_nl_cycl_pair(template), nl_cycl_pairs);
                                        final SubLObject indexing_result = ebmt_template_parser.ebmt_template_indexing_result(template);
                                        if (indexing_result.equal((SubLObject)ebmt_tests.$str93$Added)) {
                                            final SubLObject pcase_var = ebmt_template_parser.ebmt_template_type(template);
                                            if (pcase_var.eql((SubLObject)ebmt_tests.$kw94$GENERAL)) {
                                                num_general_templates = Numbers.add(num_general_templates, (SubLObject)ebmt_tests.ONE_INTEGER);
                                            }
                                            else if (pcase_var.eql((SubLObject)ebmt_tests.$kw95$SPECIFIC)) {
                                                num_specific_templates = Numbers.add(num_specific_templates, (SubLObject)ebmt_tests.ONE_INTEGER);
                                            }
                                            else {
                                                Errors.error((SubLObject)ebmt_tests.$str96$Unexpected_type_of_EBMT_template_, ebmt_template_parser.ebmt_template_type(template));
                                            }
                                        }
                                        else if (indexing_result.equal((SubLObject)ebmt_tests.$str97$Already_indexed)) {
                                            num_already_indexed_templates = Numbers.add(num_already_indexed_templates, (SubLObject)ebmt_tests.ONE_INTEGER);
                                        }
                                        else {
                                            Errors.error((SubLObject)ebmt_tests.$str98$Unexpected_indexing_result_of_EBM, indexing_result);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        template = cdolist_list_var.first();
                                    }
                                    PrintLow.format(s_out, (SubLObject)ebmt_tests.$str99$_S__, (SubLObject)ConsesLow.list(nl, cycl, nl_cycl_pairs, (SubLObject)ConsesLow.list(num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates), time_taken));
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebmt_tests.$list92);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)ebmt_tests.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                pair = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_2_$7, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$6, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                print_high.$print_level$.rebind(_prev_bind_2_$6, thread);
                print_high.$print_length$.rebind(_prev_bind_1_$5, thread);
                print_high.$print_pretty$.rebind(_prev_bind_0_$4, thread);
            }
            os_process_utilities.kill_os_process(os_process);
        }
        finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return f_out;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 19416L)
    public static SubLObject ebmt_test_parsing_with_index(final SubLObject test_dir, SubLObject source, final SubLObject every_nth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_tests.NIL != Types.stringp(test_dir) : test_dir;
        assert ebmt_tests.NIL != ebmt_testing_source_p(source) : source;
        final SubLObject f_out = Sequences.cconcatenate(test_dir, ebmt_tests.$ebmt_testing_output_filename$.getGlobalValue());
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind((SubLObject)ebmt_tests.$str86$localhost, thread);
            lucene_index.$ebmt_index_content$.bind(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(test_dir), (SubLObject)ebmt_tests.$str87$_ebmt_index_txt), thread);
            lucene_index.$ebmt_index_log$.bind(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(test_dir), (SubLObject)ebmt_tests.$str88$_ebmt_index_log), thread);
            final SubLObject os_process = ebmt_index_server_process(test_dir);
            final SubLObject _prev_bind_0_$12 = print_high.$print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_1_$13 = print_high.$print_length$.currentBinding(thread);
            final SubLObject _prev_bind_2_$14 = print_high.$print_level$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)ebmt_tests.NIL, thread);
                print_high.$print_length$.bind((SubLObject)ebmt_tests.NIL, thread);
                print_high.$print_level$.bind((SubLObject)ebmt_tests.NIL, thread);
                SubLObject stream = (SubLObject)ebmt_tests.NIL;
                try {
                    stream = compatibility.open_text(f_out, (SubLObject)ebmt_tests.$kw53$OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, f_out);
                    }
                    final SubLObject s_out = stream;
                    final SubLObject list_var = ebmt_nl_cycl_pairs_from_source(source, every_nth);
                    final SubLObject _prev_bind_0_$13 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$15 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)((ebmt_tests.NIL != Sequences.cconcatenate((SubLObject)ebmt_tests.$str89$Processing_EBMT_data_from_, new SubLObject[] { format_nil.format_nil_a_no_copy(source), ebmt_tests.$str90$____ })) ? Sequences.cconcatenate((SubLObject)ebmt_tests.$str89$Processing_EBMT_data_from_, new SubLObject[] { format_nil.format_nil_a_no_copy(source), ebmt_tests.$str90$____ }) : ebmt_tests.$str91$cdolist), thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)ebmt_tests.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)ebmt_tests.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)ebmt_tests.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)ebmt_tests.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject pair = (SubLObject)ebmt_tests.NIL;
                            pair = csome_list_var.first();
                            while (ebmt_tests.NIL != csome_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject nl = (SubLObject)ebmt_tests.NIL;
                                SubLObject cycl = (SubLObject)ebmt_tests.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list92);
                                nl = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list92);
                                cycl = current.first();
                                current = current.rest();
                                if (ebmt_tests.NIL == current) {
                                    ebmt_possibly_update_keepalive_file();
                                    final SubLObject target_cycl = (SubLObject)((ebmt_tests.NIL != cycl) ? ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, ebmt_tests.$const100$InferencePSC) : ebmt_tests.NIL);
                                    SubLObject parsed_cycls = (SubLObject)ebmt_tests.NIL;
                                    SubLObject justifications = (SubLObject)ebmt_tests.NIL;
                                    SubLObject weights = (SubLObject)ebmt_tests.NIL;
                                    SubLObject time_taken = (SubLObject)ebmt_tests.NIL;
                                    final SubLObject time_var = Time.get_internal_real_time();
                                    thread.resetMultipleValues();
                                    final SubLObject parsed_cycls_$18 = ebmt_template_parser.ebmt_parse(ebmt_template_parser.ebmt_remove_ignore_markers(nl), (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
                                    final SubLObject justifications_$19 = thread.secondMultipleValue();
                                    final SubLObject weights_$20 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    parsed_cycls = parsed_cycls_$18;
                                    justifications = justifications_$19;
                                    weights = weights_$20;
                                    time_taken = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    parsed_cycls = Mapping.mapcar((SubLObject)ebmt_tests.$sym101$HL_TO_EL, parsed_cycls);
                                    final SubLObject unique_interpretation_count = Sequences.length(Sequences.remove_duplicates(parsed_cycls, Symbols.symbol_function((SubLObject)ebmt_tests.$sym48$EQUALS_EL_), (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED));
                                    thread.resetMultipleValues();
                                    final SubLObject match_list = ebmt_compute_match_list_and_result(parsed_cycls, target_cycl);
                                    final SubLObject result = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    write_one_line_to_ebmt_testing_output_file(s_out, nl, cycl, unique_interpretation_count, result, time_taken, match_list, parsed_cycls, weights);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebmt_tests.$list92);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)ebmt_tests.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                pair = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_2_$15, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$14, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$13, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                print_high.$print_level$.rebind(_prev_bind_2_$14, thread);
                print_high.$print_length$.rebind(_prev_bind_1_$13, thread);
                print_high.$print_pretty$.rebind(_prev_bind_0_$12, thread);
            }
            os_process_utilities.kill_os_process(os_process);
        }
        finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return f_out;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 21062L)
    public static SubLObject ebmt_testing_source_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ebmt_tests.NIL != hlmt.hlmtP(v_object) || ebmt_tests.NIL != file_utilities.file_existsP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 21167L)
    public static SubLObject ebmt_compute_match_list_and_result(final SubLObject parsed_cycls, final SubLObject target_cycl) {
        SubLObject match_list = (SubLObject)ebmt_tests.NIL;
        SubLObject result = (SubLObject)ebmt_tests.$kw102$FAILURE;
        SubLObject cdolist_list_var = parsed_cycls;
        SubLObject parsed_cycl = (SubLObject)ebmt_tests.NIL;
        parsed_cycl = cdolist_list_var.first();
        while (ebmt_tests.NIL != cdolist_list_var) {
            if (ebmt_tests.NIL != czer_utilities.equals_elP(target_cycl, parsed_cycl, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED)) {
                result = (SubLObject)ebmt_tests.$kw103$SUCCESS;
                match_list = (SubLObject)ConsesLow.cons((SubLObject)ebmt_tests.ONE_INTEGER, match_list);
            }
            else {
                match_list = (SubLObject)ConsesLow.cons((SubLObject)ebmt_tests.ZERO_INTEGER, match_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parsed_cycl = cdolist_list_var.first();
        }
        match_list = Sequences.nreverse(match_list);
        return Values.values(match_list, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 21560L)
    public static SubLObject write_one_line_to_ebmt_testing_output_file(final SubLObject s_out, final SubLObject nl, final SubLObject cycl, final SubLObject unique_interpretation_count, final SubLObject result, final SubLObject time, final SubLObject match_list, final SubLObject parsed_cycls, final SubLObject weights) {
        final SubLObject out_line = (SubLObject)ConsesLow.list(nl, cycl, unique_interpretation_count, result, time, match_list, parsed_cycls, weights);
        PrintLow.format(s_out, (SubLObject)ebmt_tests.$str99$_S__, out_line);
        return (SubLObject)ebmt_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 21880L)
    public static SubLObject ebmt_training_summary_plist(final SubLObject test_dir, final SubLObject training_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_user_training_examples = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_training_examples = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_failed_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_already_indexed_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_specific_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_general_templates = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject total_training_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject min_training_time = (SubLObject)ebmt_tests.$int104$100;
        SubLObject max_training_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        final SubLObject training_output = Sequences.cconcatenate(test_dir, ebmt_tests.$ebmt_training_output_filename$.getGlobalValue());
        SubLObject num_templates = (SubLObject)ebmt_tests.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)ebmt_tests.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)ebmt_tests.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)ebmt_tests.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)ebmt_tests.$str105$Summarizing_EBMT_training_details);
                final SubLObject file_var = training_output;
                SubLObject stream = (SubLObject)ebmt_tests.NIL;
                try {
                    final SubLObject _prev_bind_0_$23 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)ebmt_tests.NIL, thread);
                        stream = compatibility.open_text(file_var, (SubLObject)ebmt_tests.$kw82$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$23, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, file_var);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = streams_high.file_length(stream_var);
                        final SubLObject stream_var_$24 = stream_var;
                        SubLObject line_number_var = (SubLObject)ebmt_tests.NIL;
                        SubLObject file_line = (SubLObject)ebmt_tests.NIL;
                        line_number_var = (SubLObject)ebmt_tests.ZERO_INTEGER;
                        for (file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$24); ebmt_tests.NIL != file_line; file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$24)) {
                            final SubLObject line = reader.read_from_string(file_line, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
                            final SubLObject all_training_examples = conses_high.third(line);
                            final SubLObject num_template_types = conses_high.fourth(line);
                            final SubLObject time_taken = conses_high.fifth(line);
                            num_user_training_examples = Numbers.add(num_user_training_examples, (SubLObject)ebmt_tests.ONE_INTEGER);
                            num_training_examples = Numbers.add(num_training_examples, Sequences.length(all_training_examples));
                            num_general_templates = Numbers.add(num_general_templates, num_template_types.first());
                            num_specific_templates = Numbers.add(num_specific_templates, conses_high.second(num_template_types));
                            num_already_indexed_templates = Numbers.add(num_already_indexed_templates, conses_high.third(num_template_types));
                            num_failed_templates = Numbers.add(num_failed_templates, conses_high.fourth(num_template_types));
                            total_training_time = Numbers.add(total_training_time, time_taken);
                            if (time_taken.numL(min_training_time)) {
                                min_training_time = time_taken;
                            }
                            if (time_taken.numG(max_training_time)) {
                                max_training_time = time_taken;
                            }
                            utilities_macros.note_percent_progress(streams_high.file_position(stream_var, (SubLObject)ebmt_tests.UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        num_templates = Numbers.add(new SubLObject[] { num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates });
        return (SubLObject)ConsesLow.list(new SubLObject[] { ebmt_tests.$kw106$TRAINING_INPUT_MT, training_mt, ebmt_tests.$kw107$USER_TRAINING_EXAMPLES, num_user_training_examples, ebmt_tests.$kw108$TRAINING_EXAMPLES, num_training_examples, ebmt_tests.$kw109$GENERAL_TEMPLATES, num_general_templates, ebmt_tests.$kw110$GENERAL_TEMPLATES_PC, number_utilities.percent(num_general_templates, num_templates, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw111$SPECIFIC_TEMPLATES, num_specific_templates, ebmt_tests.$kw112$SPECIFIC_TEMPLATES_PC, number_utilities.percent(num_specific_templates, num_templates, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw113$NO_TEMPLATES, num_failed_templates, ebmt_tests.$kw114$NO_TEMPLATES_PC, number_utilities.percent(num_failed_templates, num_templates, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw115$DUPLICATE_TEMPLATES, num_already_indexed_templates, ebmt_tests.$kw116$DUPLICATE_TEMPLATES_PC, number_utilities.percent(num_already_indexed_templates, num_templates, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw117$TOTAL_TRAINING_TIME, total_training_time, ebmt_tests.$kw118$MIN_TRAINING_TIME, min_training_time, ebmt_tests.$kw119$MAX_TRAINING_TIME, max_training_time });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 24301L)
    public static SubLObject ebmt_testing_output_datum_p(final SubLObject v_object) {
        return list_utilities.list_of_length_p(v_object, (SubLObject)ebmt_tests.EIGHT_INTEGER, (SubLObject)ebmt_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 24392L)
    public static SubLObject ebmt_testing_summary_plist(final SubLObject test_dir, final SubLObject testing_source, final SubLObject testing_output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_examples = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_successful = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_almost_successful = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_unknown = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_failed = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject num_interps = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject max_interps_per_example = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject interps_per_example = (SubLObject)ebmt_tests.NIL;
        final SubLObject num_top = Vectors.make_vector((SubLObject)ebmt_tests.FIVE_INTEGER, (SubLObject)ebmt_tests.ZERO_INTEGER);
        SubLObject total_testing_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject total_successful_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject total_almost_successful_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject total_unknown_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject total_failed_time = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject max_time_per_example = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject time_per_example = (SubLObject)ebmt_tests.NIL;
        final SubLObject file_var;
        final SubLObject testing_output = file_var = Sequences.cconcatenate(test_dir, testing_output_filename);
        SubLObject stream = (SubLObject)ebmt_tests.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)ebmt_tests.NIL, thread);
                stream = compatibility.open_text(file_var, (SubLObject)ebmt_tests.$kw82$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$27 = stream_var;
                SubLObject line_number_var = (SubLObject)ebmt_tests.NIL;
                SubLObject line = (SubLObject)ebmt_tests.NIL;
                line_number_var = (SubLObject)ebmt_tests.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$27); ebmt_tests.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$27)) {
                    final SubLObject datum = reader.read_from_string_ignoring_errors(line, (SubLObject)ebmt_tests.NIL, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
                    if (ebmt_tests.NIL == ebmt_testing_output_datum_p(datum)) {
                        Errors.warn((SubLObject)ebmt_tests.$str39$Got_a_malformed_EBMT_testing_outp, line);
                    }
                    else {
                        SubLObject current;
                        final SubLObject datum_$28 = current = datum;
                        SubLObject nl = (SubLObject)ebmt_tests.NIL;
                        SubLObject cycl = (SubLObject)ebmt_tests.NIL;
                        SubLObject num_interps_per_example = (SubLObject)ebmt_tests.NIL;
                        SubLObject test_result = (SubLObject)ebmt_tests.NIL;
                        SubLObject time_taken = (SubLObject)ebmt_tests.NIL;
                        SubLObject match_list = (SubLObject)ebmt_tests.NIL;
                        SubLObject parsed_cycls = (SubLObject)ebmt_tests.NIL;
                        SubLObject weights = (SubLObject)ebmt_tests.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        nl = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        cycl = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        num_interps_per_example = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        test_result = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        time_taken = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        match_list = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        parsed_cycls = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum_$28, (SubLObject)ebmt_tests.$list120);
                        weights = current.first();
                        current = current.rest();
                        if (ebmt_tests.NIL == current) {
                            SubLObject doneP = (SubLObject)ebmt_tests.NIL;
                            SubLObject match_value = (SubLObject)ebmt_tests.NIL;
                            num_examples = Numbers.add(num_examples, (SubLObject)ebmt_tests.ONE_INTEGER);
                            final SubLObject pcase_var = test_result;
                            if (pcase_var.eql((SubLObject)ebmt_tests.$kw103$SUCCESS)) {
                                num_successful = Numbers.add(num_successful, (SubLObject)ebmt_tests.ONE_INTEGER);
                                total_successful_time = Numbers.add(total_successful_time, time_taken);
                            }
                            else if (pcase_var.eql((SubLObject)ebmt_tests.$kw121$ALMOST)) {
                                num_almost_successful = Numbers.add(num_almost_successful, (SubLObject)ebmt_tests.ONE_INTEGER);
                                total_almost_successful_time = Numbers.add(total_almost_successful_time, time_taken);
                            }
                            else if (pcase_var.eql((SubLObject)ebmt_tests.$kw122$UNKNOWN)) {
                                num_unknown = Numbers.add(num_unknown, (SubLObject)ebmt_tests.ONE_INTEGER);
                                total_unknown_time = Numbers.add(total_unknown_time, time_taken);
                            }
                            else if (pcase_var.eql((SubLObject)ebmt_tests.$kw102$FAILURE)) {
                                num_failed = Numbers.add(num_failed, (SubLObject)ebmt_tests.ONE_INTEGER);
                                total_failed_time = Numbers.add(total_failed_time, time_taken);
                            }
                            else {
                                Errors.error((SubLObject)ebmt_tests.$str123$Unexpected_EBMT_result__s, test_result);
                            }
                            num_interps = Numbers.add(num_interps, num_interps_per_example);
                            if (num_interps_per_example.numG(max_interps_per_example)) {
                                max_interps_per_example = num_interps_per_example;
                            }
                            interps_per_example = (SubLObject)ConsesLow.cons(num_interps_per_example, interps_per_example);
                            SubLObject list_var = (SubLObject)ebmt_tests.NIL;
                            SubLObject match_item = (SubLObject)ebmt_tests.NIL;
                            SubLObject i = (SubLObject)ebmt_tests.NIL;
                            list_var = match_list;
                            match_item = list_var.first();
                            for (i = (SubLObject)ebmt_tests.ZERO_INTEGER; ebmt_tests.NIL == doneP && ebmt_tests.NIL != list_var; list_var = list_var.rest(), match_item = list_var.first(), i = Numbers.add((SubLObject)ebmt_tests.ONE_INTEGER, i)) {
                                if (match_item.numE((SubLObject)ebmt_tests.ONE_INTEGER)) {
                                    doneP = (SubLObject)ebmt_tests.T;
                                    match_value = i;
                                }
                            }
                            doneP = (SubLObject)ebmt_tests.NIL;
                            if (ebmt_tests.NIL != match_value && match_value.numL((SubLObject)ebmt_tests.FIVE_INTEGER)) {
                                final SubLObject vector_var = num_top;
                                final SubLObject backwardP_var = (SubLObject)ebmt_tests.T;
                                final SubLObject length = Sequences.length(vector_var);
                                SubLObject current_$30;
                                final SubLObject datum_$29 = current_$30 = (SubLObject)((ebmt_tests.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)ebmt_tests.ONE_INTEGER), (SubLObject)ebmt_tests.MINUS_ONE_INTEGER, (SubLObject)ebmt_tests.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)ebmt_tests.ZERO_INTEGER, length, (SubLObject)ebmt_tests.ONE_INTEGER));
                                SubLObject start = (SubLObject)ebmt_tests.NIL;
                                SubLObject end = (SubLObject)ebmt_tests.NIL;
                                SubLObject delta = (SubLObject)ebmt_tests.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)ebmt_tests.$list124);
                                start = current_$30.first();
                                current_$30 = current_$30.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)ebmt_tests.$list124);
                                end = current_$30.first();
                                current_$30 = current_$30.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)ebmt_tests.$list124);
                                delta = current_$30.first();
                                current_$30 = current_$30.rest();
                                if (ebmt_tests.NIL == current_$30) {
                                    if (ebmt_tests.NIL == doneP) {
                                        SubLObject end_var;
                                        SubLObject key;
                                        SubLObject value;
                                        for (end_var = end, key = (SubLObject)ebmt_tests.NIL, key = start; ebmt_tests.NIL == doneP && ebmt_tests.NIL == subl_macros.do_numbers_endtest(key, delta, end_var); key = Numbers.add(key, delta)) {
                                            value = Vectors.aref(vector_var, key);
                                            value = Numbers.add(value, (SubLObject)ebmt_tests.ONE_INTEGER);
                                            Vectors.set_aref(num_top, key, value);
                                            if (key.numE(match_value)) {
                                                doneP = (SubLObject)ebmt_tests.T;
                                            }
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$29, (SubLObject)ebmt_tests.$list124);
                                }
                            }
                            total_testing_time = Numbers.add(total_testing_time, time_taken);
                            if (time_taken.numG(max_time_per_example)) {
                                max_time_per_example = time_taken;
                            }
                            time_per_example = (SubLObject)ConsesLow.cons(time_taken, time_per_example);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$28, (SubLObject)ebmt_tests.$list120);
                        }
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        final SubLObject plist = (SubLObject)ConsesLow.list(new SubLObject[] { ebmt_tests.$kw125$FUNCTION, ebmt_tests.$sym49$EBMT_PARSE, ebmt_tests.$kw126$TESTING_INPUT_SOURCE, testing_source, ebmt_tests.$kw127$TEST_EXAMPLES, num_examples, ebmt_tests.$kw128$SUCCESSFUL_TESTS, num_successful, ebmt_tests.$kw129$SUCCESSFUL_TESTS_PC, number_utilities.percent(num_successful, num_examples, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw130$ALMOST_SUCCESSFUL_TESTS, num_almost_successful, ebmt_tests.$kw131$ALMOST_SUCCESSFUL_TESTS_PC, number_utilities.percent(num_almost_successful, num_examples, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw132$UNKNOWN_TESTS, num_unknown, ebmt_tests.$kw133$UNKNOWN_TESTS_PC, number_utilities.percent(num_unknown, num_examples, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw134$FAILED_TESTS, num_failed, ebmt_tests.$kw135$FAILED_TESTS_PC, number_utilities.percent(num_failed, num_examples, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw136$TOTAL_UNIQUE_INTERPS, num_interps, ebmt_tests.$kw137$MAX_INTERPS_PER_EXAMPLE, max_interps_per_example, ebmt_tests.$kw138$MEAN_INTERPS_PER_EXAMPLE, number_utilities.mean(interps_per_example), ebmt_tests.$kw139$MEDIAN_INTERPS_PER_EXAMPLE, number_utilities.median(interps_per_example, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw140$TOTAL_TESTING_TIME, total_testing_time, ebmt_tests.$kw141$TOTAL_SUCCESSFUL_TIME, total_successful_time, ebmt_tests.$kw142$TOTAL_ALMOST_SUCCESSFUL_TIME, total_almost_successful_time, ebmt_tests.$kw143$TOTAL_UNKNOWN_TIME, total_unknown_time, ebmt_tests.$kw144$TOTAL_FAILED_TIME, total_failed_time, ebmt_tests.$kw145$MAX_TIME_PER_EXAMPLE, max_time_per_example, ebmt_tests.$kw146$MEAN_TIME_PER_EXAMPLE, number_utilities.mean(time_per_example), ebmt_tests.$kw147$MEDIAN_TIME_PER_EXAMPLE, number_utilities.median(time_per_example, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED), ebmt_tests.$kw148$TOP1, Vectors.aref(num_top, (SubLObject)ebmt_tests.ZERO_INTEGER), ebmt_tests.$kw149$TOP2, Vectors.aref(num_top, (SubLObject)ebmt_tests.ONE_INTEGER), ebmt_tests.$kw150$TOP3, Vectors.aref(num_top, (SubLObject)ebmt_tests.TWO_INTEGER), ebmt_tests.$kw151$TOP4, Vectors.aref(num_top, (SubLObject)ebmt_tests.THREE_INTEGER), ebmt_tests.$kw152$TOP5, Vectors.aref(num_top, (SubLObject)ebmt_tests.FOUR_INTEGER) });
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 28183L)
    public static SubLObject ebmt_create_summary(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, final SubLObject global_summaryP, final SubLObject f_summary, SubLObject testing_output_filename) {
        if (testing_output_filename == ebmt_tests.UNPROVIDED) {
            testing_output_filename = ebmt_tests.$ebmt_testing_output_filename$.getGlobalValue();
        }
        final SubLObject summary_plist = ebmt_summary_plist(test_dir, training_mt, testing_source, testing_output_filename);
        return ebmt_output_summary_plist(summary_plist, test_dir, global_summaryP, f_summary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 28896L)
    public static SubLObject ebmt_summary_plist(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, final SubLObject testing_output_filename) {
        SubLObject summary_plist = (SubLObject)ebmt_tests.NIL;
        summary_plist = conses_high.putf(summary_plist, (SubLObject)ebmt_tests.$kw153$TIMESTAMP, numeric_date_utilities.universal_timestring((SubLObject)ebmt_tests.UNPROVIDED));
        summary_plist = conses_high.putf(summary_plist, (SubLObject)ebmt_tests.$kw44$KB, control_vars.kb_loaded());
        summary_plist = conses_high.putf(summary_plist, (SubLObject)ebmt_tests.$kw154$SYSTEM, system_info.cyc_revision_string());
        summary_plist = conses_high.putf(summary_plist, (SubLObject)ebmt_tests.$kw155$HOST, Environment.get_machine_name((SubLObject)ebmt_tests.UNPROVIDED));
        summary_plist = conses_high.putf(summary_plist, (SubLObject)ebmt_tests.$kw156$BOGOMIPS, misc_utilities.machine_bogomips());
        summary_plist = list_utilities.merge_plist(summary_plist, ebmt_training_summary_plist(test_dir, training_mt));
        summary_plist = list_utilities.merge_plist(summary_plist, ebmt_testing_summary_plist(test_dir, testing_source, testing_output_filename));
        return summary_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 29620L)
    public static SubLObject ebmt_output_summary_plist(final SubLObject summary_plist, final SubLObject test_dir, final SubLObject global_summaryP, SubLObject f_summary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ebmt_tests.NIL == f_summary) {
            f_summary = Sequences.cconcatenate(test_dir, (SubLObject)ebmt_tests.$str157$summary_txt);
        }
        final SubLObject f_summary_plist = Sequences.cconcatenate(test_dir, (SubLObject)ebmt_tests.$str158$summary_plist_lisp);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_tests.NIL, thread);
            print_high.$print_length$.bind((SubLObject)ebmt_tests.NIL, thread);
            print_high.$print_level$.bind((SubLObject)ebmt_tests.NIL, thread);
            SubLObject stream = (SubLObject)ebmt_tests.NIL;
            try {
                stream = compatibility.open_text(f_summary_plist, (SubLObject)ebmt_tests.$kw53$OUTPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, f_summary_plist);
                }
                final SubLObject s_summary_plist = stream;
                PrintLow.format(s_summary_plist, (SubLObject)ebmt_tests.$str159$_s__, summary_plist);
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream2 = (SubLObject)ebmt_tests.NIL;
        try {
            stream2 = compatibility.open_text(f_summary, (SubLObject)ebmt_tests.$kw160$APPEND);
            if (!stream2.isStream()) {
                Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, f_summary);
            }
            final SubLObject s_summary = stream2;
            list_utilities.pretty_print_plist(summary_plist, s_summary);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream2.isStream()) {
                    streams_high.close(stream2, (SubLObject)ebmt_tests.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (ebmt_tests.NIL != global_summaryP) {
            final SubLObject _prev_bind_5 = print_high.$print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_6 = print_high.$print_length$.currentBinding(thread);
            final SubLObject _prev_bind_7 = print_high.$print_level$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)ebmt_tests.NIL, thread);
                print_high.$print_length$.bind((SubLObject)ebmt_tests.NIL, thread);
                print_high.$print_level$.bind((SubLObject)ebmt_tests.NIL, thread);
                SubLObject stream3 = (SubLObject)ebmt_tests.NIL;
                try {
                    stream3 = compatibility.open_text(ebmt_tests.$ebmt_global_summary_file$.getDynamicValue(thread), (SubLObject)ebmt_tests.$kw160$APPEND);
                    if (!stream3.isStream()) {
                        Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, ebmt_tests.$ebmt_global_summary_file$.getDynamicValue(thread));
                    }
                    final SubLObject s_summary2 = stream3;
                    PrintLow.format(s_summary2, (SubLObject)ebmt_tests.$str159$_s__, summary_plist);
                }
                finally {
                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (stream3.isStream()) {
                            streams_high.close(stream3, (SubLObject)ebmt_tests.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            }
            finally {
                print_high.$print_level$.rebind(_prev_bind_7, thread);
                print_high.$print_length$.rebind(_prev_bind_6, thread);
                print_high.$print_pretty$.rebind(_prev_bind_5, thread);
            }
        }
        return f_summary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 30466L)
    public static SubLObject get_ebmt_plot_value(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(ebmt_tests.$ebmt_plot_params$.getDynamicValue(thread), keyword, (SubLObject)ebmt_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 30556L)
    public static SubLObject ground_plot_data_formula(SubLObject formula, final SubLObject plot_params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ebmt_tests.NIL;
        final SubLObject _prev_bind_0 = ebmt_tests.$ebmt_plot_params$.currentBinding(thread);
        try {
            ebmt_tests.$ebmt_plot_params$.bind(plot_params, thread);
            formula = transform_list_utilities.transform(formula, (SubLObject)ebmt_tests.$sym161$KEYWORDP, (SubLObject)ebmt_tests.$sym162$GET_EBMT_PLOT_VALUE, (SubLObject)ebmt_tests.UNPROVIDED);
            result = Eval.eval(formula);
        }
        finally {
            ebmt_tests.$ebmt_plot_params$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 30811L)
    public static SubLObject ebmt_report(final SubLObject input_file, final SubLObject report_data, SubLObject output_file) {
        if (output_file == ebmt_tests.UNPROVIDED) {
            output_file = (SubLObject)ebmt_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_data_types = conses_high.getf(report_data, (SubLObject)ebmt_tests.$kw163$RAW_DATA_TYPES, (SubLObject)ebmt_tests.UNPROVIDED);
        final SubLObject computed_data_types = conses_high.getf(report_data, (SubLObject)ebmt_tests.$kw164$COMPUTED_DATA_TYPES, (SubLObject)ebmt_tests.UNPROVIDED);
        final SubLObject defaults = (SubLObject)ebmt_tests.$list165;
        final SubLObject augmented_report_data = list_utilities.augment_plist_with_defaults(report_data, defaults);
        SubLObject plot_properties = list_utilities.plist_restricted_to_indicators(augmented_report_data, (SubLObject)ebmt_tests.$list166);
        final SubLObject data = dictionary.new_dictionary((SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
        SubLObject data_keywords = (SubLObject)ebmt_tests.NIL;
        SubLObject computed_data_type_data = (SubLObject)ebmt_tests.NIL;
        SubLObject line_labels = (SubLObject)ebmt_tests.NIL;
        SubLObject plot_data = (SubLObject)ebmt_tests.NIL;
        if (ebmt_tests.NIL != output_file) {
            plot_properties = conses_high.putf(plot_properties, (SubLObject)ebmt_tests.$kw167$OUTPUT_FILE, output_file);
        }
        SubLObject remainder;
        SubLObject keyword;
        SubLObject line_label;
        for (remainder = (SubLObject)ebmt_tests.NIL, remainder = raw_data_types; ebmt_tests.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            keyword = remainder.first();
            line_label = conses_high.cadr(remainder);
            line_labels = (SubLObject)ConsesLow.cons(line_label, line_labels);
            data_keywords = (SubLObject)ConsesLow.cons(keyword, data_keywords);
        }
        SubLObject label_and_formula;
        SubLObject current;
        SubLObject datum;
        SubLObject line_label2;
        SubLObject formula;
        for (remainder = (SubLObject)ebmt_tests.NIL, remainder = computed_data_types; ebmt_tests.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            keyword = remainder.first();
            label_and_formula = conses_high.cadr(remainder);
            datum = (current = label_and_formula);
            line_label2 = (SubLObject)ebmt_tests.NIL;
            formula = (SubLObject)ebmt_tests.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list168);
            line_label2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_tests.$list168);
            formula = current.first();
            current = current.rest();
            if (ebmt_tests.NIL == current) {
                line_labels = (SubLObject)ConsesLow.cons(line_label2, line_labels);
                data_keywords = (SubLObject)ConsesLow.cons(keyword, data_keywords);
                computed_data_type_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(keyword, formula), computed_data_type_data);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebmt_tests.$list168);
            }
        }
        plot_properties = conses_high.putf(plot_properties, (SubLObject)ebmt_tests.$kw169$LINE_LABELS, line_labels);
        SubLObject line_number = (SubLObject)ebmt_tests.ZERO_INTEGER;
        SubLObject stream = (SubLObject)ebmt_tests.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)ebmt_tests.NIL, thread);
                stream = compatibility.open_text(input_file, (SubLObject)ebmt_tests.$kw82$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)ebmt_tests.$str54$Unable_to_open__S, input_file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject test_run_summary;
                SubLObject test_run_plist;
                SubLObject kb;
                SubLObject test_run_id;
                SubLObject plot_xtic_string;
                SubLObject remainder2;
                SubLObject keyword2;
                SubLObject value;
                SubLObject cdolist_list_var;
                SubLObject computed_data;
                SubLObject current2;
                SubLObject datum2;
                SubLObject keyword3;
                SubLObject formula2;
                SubLObject value2;
                for (test_run_summary = (SubLObject)ebmt_tests.NIL, test_run_summary = file_utilities.cdolines_get_next_line(infile); ebmt_tests.NIL != test_run_summary; test_run_summary = file_utilities.cdolines_get_next_line(infile)) {
                    line_number = Numbers.add(line_number, (SubLObject)ebmt_tests.ONE_INTEGER);
                    test_run_plist = reader.read_from_string_ignoring_errors(test_run_summary, (SubLObject)ebmt_tests.NIL, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED, (SubLObject)ebmt_tests.UNPROVIDED);
                    if (test_run_plist != ebmt_tests.$kw170$EOF) {
                        kb = conses_high.getf(test_run_plist, (SubLObject)ebmt_tests.$kw44$KB, (SubLObject)ebmt_tests.UNPROVIDED);
                        test_run_id = line_number;
                        plot_xtic_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(kb), new SubLObject[] { ebmt_tests.$str171$_n, format_nil.format_nil_a_no_copy(conses_high.getf(test_run_plist, (SubLObject)ebmt_tests.$kw153$TIMESTAMP, (SubLObject)ebmt_tests.UNPROVIDED)) });
                        plot_properties = conses_high.putf(plot_properties, (SubLObject)ebmt_tests.$kw172$XTICS, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(plot_xtic_string, line_number), conses_high.getf(plot_properties, (SubLObject)ebmt_tests.$kw172$XTICS, (SubLObject)ebmt_tests.UNPROVIDED)));
                        for (remainder2 = (SubLObject)ebmt_tests.NIL, remainder2 = raw_data_types; ebmt_tests.NIL != remainder2; remainder2 = conses_high.cddr(remainder2)) {
                            keyword2 = remainder2.first();
                            value = conses_high.cadr(remainder2);
                            dictionary_utilities.dictionary_push(data, keyword2, (SubLObject)ConsesLow.list(test_run_id, conses_high.getf(test_run_plist, keyword2, (SubLObject)ebmt_tests.UNPROVIDED)));
                        }
                        cdolist_list_var = computed_data_type_data;
                        computed_data = (SubLObject)ebmt_tests.NIL;
                        computed_data = cdolist_list_var.first();
                        while (ebmt_tests.NIL != cdolist_list_var) {
                            datum2 = (current2 = computed_data);
                            keyword3 = (SubLObject)ebmt_tests.NIL;
                            formula2 = (SubLObject)ebmt_tests.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)ebmt_tests.$list173);
                            keyword3 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)ebmt_tests.$list173);
                            formula2 = current2.first();
                            current2 = current2.rest();
                            if (ebmt_tests.NIL == current2) {
                                value2 = (SubLObject)ConsesLow.list(test_run_id, ground_plot_data_formula(formula2, test_run_plist));
                                dictionary_utilities.dictionary_push(data, keyword3, value2);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)ebmt_tests.$list173);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            computed_data = cdolist_list_var.first();
                        }
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_tests.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)ebmt_tests.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        SubLObject cdolist_list_var2 = data_keywords;
        SubLObject data_keyword = (SubLObject)ebmt_tests.NIL;
        data_keyword = cdolist_list_var2.first();
        while (ebmt_tests.NIL != cdolist_list_var2) {
            plot_data = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(data, data_keyword, (SubLObject)ebmt_tests.UNPROVIDED), plot_data);
            cdolist_list_var2 = cdolist_list_var2.rest();
            data_keyword = cdolist_list_var2.first();
        }
        plot_data = Sequences.nreverse(plot_data);
        return plot_generation.generate_lines_graph(plot_data, plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 34169L)
    public static SubLObject ebmt_training_recall_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == ebmt_tests.UNPROVIDED) {
            output_file = (SubLObject)ebmt_tests.NIL;
        }
        return ebmt_report(input_file, (SubLObject)ebmt_tests.$list174, output_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 34773L)
    public static SubLObject ebmt_timing_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == ebmt_tests.UNPROVIDED) {
            output_file = (SubLObject)ebmt_tests.NIL;
        }
        return ebmt_report(input_file, (SubLObject)ebmt_tests.$list175, output_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 35233L)
    public static SubLObject ebmt_accuracy_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == ebmt_tests.UNPROVIDED) {
            output_file = (SubLObject)ebmt_tests.NIL;
        }
        return ebmt_report(input_file, (SubLObject)ebmt_tests.$list176, output_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 35640L)
    public static SubLObject ebmt_parsing_results(final SubLObject input_file, SubLObject output_file) {
        if (output_file == ebmt_tests.UNPROVIDED) {
            output_file = (SubLObject)ebmt_tests.NIL;
        }
        return ebmt_report(input_file, (SubLObject)ebmt_tests.$list177, output_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-tests.lisp", position = 36126L)
    public static SubLObject ebmt_update_evaluation_graphs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ebmt_training_recall_report(ebmt_tests.$ebmt_global_summary_file$.getDynamicValue(thread), ebmt_tests.$ebmt_training_recall_graph$.getDynamicValue(thread));
        ebmt_accuracy_report(ebmt_tests.$ebmt_global_summary_file$.getDynamicValue(thread), ebmt_tests.$ebmt_accuracy_graph$.getDynamicValue(thread));
        ebmt_parsing_results(ebmt_tests.$ebmt_global_summary_file$.getDynamicValue(thread), ebmt_tests.$ebmt_parsing_results_graph$.getDynamicValue(thread));
        return (SubLObject)ebmt_tests.$kw178$EBMT_GRAPHS_UPDATED;
    }
    
    public static SubLObject declare_ebmt_tests_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ebmt_tests", "with_standard_ebmt_testing_state", "WITH-STANDARD-EBMT-TESTING-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ebmt_tests", "do_ebmt_nl_cycl_pairs_from_source", "DO-EBMT-NL-CYCL-PAIRS-FROM-SOURCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_do_testing_output_data_from_file", "EBMT-DO-TESTING-OUTPUT-DATA-FROM-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_test_func", "EBMT-TEST-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_test_loop_single_corpus", "EBMT-TEST-LOOP-SINGLE-CORPUS", 3, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_evaluation_ql_mt", "EBMT-EVALUATION-QL-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_evaluation_financial_mt", "EBMT-EVALUATION-FINANCIAL-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_evaluation_financial_file", "EBMT-EVALUATION-FINANCIAL-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_possibly_update_keepalive_file", "EBMT-POSSIBLY-UPDATE-KEEPALIVE-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_keepalive_filename", "EBMT-KEEPALIVE-FILENAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_index_server_process", "EBMT-INDEX-SERVER-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_nl_cycl_pairs_from_source", "EBMT-NL-CYCL-PAIRS-FROM-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_nl_cycl_pairs_from_file", "EBMT-NL-CYCL-PAIRS-FROM-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_nl_cycl_pairs_from_kb", "EBMT-NL-CYCL-PAIRS-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_test_index_creation", "EBMT-TEST-INDEX-CREATION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_test_parsing_with_index", "EBMT-TEST-PARSING-WITH-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_testing_source_p", "EBMT-TESTING-SOURCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_compute_match_list_and_result", "EBMT-COMPUTE-MATCH-LIST-AND-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "write_one_line_to_ebmt_testing_output_file", "WRITE-ONE-LINE-TO-EBMT-TESTING-OUTPUT-FILE", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_training_summary_plist", "EBMT-TRAINING-SUMMARY-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_testing_output_datum_p", "EBMT-TESTING-OUTPUT-DATUM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_testing_summary_plist", "EBMT-TESTING-SUMMARY-PLIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_create_summary", "EBMT-CREATE-SUMMARY", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_summary_plist", "EBMT-SUMMARY-PLIST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_output_summary_plist", "EBMT-OUTPUT-SUMMARY-PLIST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "get_ebmt_plot_value", "GET-EBMT-PLOT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ground_plot_data_formula", "GROUND-PLOT-DATA-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_report", "EBMT-REPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_training_recall_report", "EBMT-TRAINING-RECALL-REPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_timing_report", "EBMT-TIMING-REPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_accuracy_report", "EBMT-ACCURACY-REPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_parsing_results", "EBMT-PARSING-RESULTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_tests", "ebmt_update_evaluation_graphs", "EBMT-UPDATE-EVALUATION-GRAPHS", 0, 0, false);
        return (SubLObject)ebmt_tests.NIL;
    }
    
    public static SubLObject init_ebmt_tests_file() {
        ebmt_tests.$ebmt_training_output_filename$ = SubLFiles.deflexical("*EBMT-TRAINING-OUTPUT-FILENAME*", (SubLObject)ebmt_tests.$str0$training_output_txt);
        ebmt_tests.$ebmt_testing_output_filename$ = SubLFiles.deflexical("*EBMT-TESTING-OUTPUT-FILENAME*", (SubLObject)ebmt_tests.$str1$testing_output_txt);
        ebmt_tests.$ebmt_not_yet_scored_lines_filename$ = SubLFiles.deflexical("*EBMT-NOT-YET-SCORED-LINES-FILENAME*", (SubLObject)ebmt_tests.$str2$to_be_scored_lines_txt);
        ebmt_tests.$ebmt_scored_lines_filename$ = SubLFiles.deflexical("*EBMT-SCORED-LINES-FILENAME*", (SubLObject)ebmt_tests.$str3$scored_lines_txt);
        ebmt_tests.$ebmt_scored_data_filename$ = SubLFiles.deflexical("*EBMT-SCORED-DATA-FILENAME*", (SubLObject)ebmt_tests.$str4$scored_data_txt);
        ebmt_tests.$ebmt_keepalive_enabledP$ = SubLFiles.defparameter("*EBMT-KEEPALIVE-ENABLED?*", (SubLObject)ebmt_tests.NIL);
        ebmt_tests.$ebmt_global_summary_file$ = SubLFiles.defparameter("*EBMT-GLOBAL-SUMMARY-FILE*", (SubLObject)ebmt_tests.$str5$);
        ebmt_tests.$ebmt_training_recall_graph$ = SubLFiles.defparameter("*EBMT-TRAINING-RECALL-GRAPH*", (SubLObject)ebmt_tests.$str5$);
        ebmt_tests.$ebmt_parsing_results_graph$ = SubLFiles.defparameter("*EBMT-PARSING-RESULTS-GRAPH*", (SubLObject)ebmt_tests.$str5$);
        ebmt_tests.$ebmt_accuracy_graph$ = SubLFiles.defparameter("*EBMT-ACCURACY-GRAPH*", (SubLObject)ebmt_tests.$str5$);
        ebmt_tests.$ebmt_plot_params$ = SubLFiles.defparameter("*EBMT-PLOT-PARAMS*", (SubLObject)ebmt_tests.NIL);
        return (SubLObject)ebmt_tests.NIL;
    }
    
    public static SubLObject setup_ebmt_tests_file() {
        generic_testing.define_test_case_table_int((SubLObject)ebmt_tests.$sym40$EBMT_CANONICALIZE_EL_SENTENCE, (SubLObject)ConsesLow.list(new SubLObject[] { ebmt_tests.$kw41$TEST, ebmt_tests.EQUALP, ebmt_tests.$kw42$OWNER, ebmt_tests.NIL, ebmt_tests.$kw43$CLASSES, ebmt_tests.NIL, ebmt_tests.$kw44$KB, ebmt_tests.$kw45$FULL, ebmt_tests.$kw46$WORKING_, ebmt_tests.T }), (SubLObject)ebmt_tests.$list47);
        generic_testing.define_test_case_table_int((SubLObject)ebmt_tests.$sym49$EBMT_PARSE, (SubLObject)ConsesLow.list(new SubLObject[] { ebmt_tests.$kw41$TEST, Symbols.symbol_function((SubLObject)ebmt_tests.$sym50$EBMT_TEST_FUNC), ebmt_tests.$kw42$OWNER, ebmt_tests.NIL, ebmt_tests.$kw43$CLASSES, ebmt_tests.NIL, ebmt_tests.$kw44$KB, ebmt_tests.$kw45$FULL, ebmt_tests.$kw46$WORKING_, ebmt_tests.NIL }), (SubLObject)ebmt_tests.$list51);
        return (SubLObject)ebmt_tests.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ebmt_tests_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ebmt_tests_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ebmt_tests_file();
    }
    
    static {
        me = (SubLFile)new ebmt_tests();
        ebmt_tests.$ebmt_training_output_filename$ = null;
        ebmt_tests.$ebmt_testing_output_filename$ = null;
        ebmt_tests.$ebmt_not_yet_scored_lines_filename$ = null;
        ebmt_tests.$ebmt_scored_lines_filename$ = null;
        ebmt_tests.$ebmt_scored_data_filename$ = null;
        ebmt_tests.$ebmt_keepalive_enabledP$ = null;
        ebmt_tests.$ebmt_global_summary_file$ = null;
        ebmt_tests.$ebmt_training_recall_graph$ = null;
        ebmt_tests.$ebmt_parsing_results_graph$ = null;
        ebmt_tests.$ebmt_accuracy_graph$ = null;
        ebmt_tests.$ebmt_plot_params$ = null;
        $str0$training_output_txt = SubLObjectFactory.makeString("training-output.txt");
        $str1$testing_output_txt = SubLObjectFactory.makeString("testing-output.txt");
        $str2$to_be_scored_lines_txt = SubLObjectFactory.makeString("to-be-scored-lines.txt");
        $str3$scored_lines_txt = SubLObjectFactory.makeString("scored-lines.txt");
        $str4$scored_data_txt = SubLObjectFactory.makeString("scored-data.txt");
        $str5$ = SubLObjectFactory.makeString("");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-DIR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$TEST_DIR_VAR = SubLObjectFactory.makeUninternedSymbol("TEST-DIR-VAR");
        $sym8$OS_PROCESS = SubLObjectFactory.makeUninternedSymbol("OS-PROCESS");
        $sym9$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EBMT-INDEX-HOST*"), (SubLObject)SubLObjectFactory.makeString("localhost"));
        $sym11$_EBMT_INDEX_CONTENT_ = SubLObjectFactory.makeSymbol("*EBMT-INDEX-CONTENT*");
        $sym12$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str13$_A_ebmt_index_txt = SubLObjectFactory.makeString("~A/ebmt-index.txt");
        $sym14$_EBMT_INDEX_LOG_ = SubLObjectFactory.makeSymbol("*EBMT-INDEX-LOG*");
        $str15$_A_ebmt_index_log = SubLObjectFactory.makeString("~A/ebmt-index.log");
        $sym16$EBMT_INDEX_SERVER_PROCESS = SubLObjectFactory.makeSymbol("EBMT-INDEX-SERVER-PROCESS");
        $sym17$WITHOUT_PRETTY_PRINTING = SubLObjectFactory.makeSymbol("WITHOUT-PRETTY-PRINTING");
        $sym18$KILL_OS_PROCESS = SubLObjectFactory.makeSymbol("KILL-OS-PROCESS");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVERY-NTH"), (SubLObject)ebmt_tests.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVERY-NTH"));
        $kw21$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw22$EVERY_NTH = SubLObjectFactory.makeKeyword("EVERY-NTH");
        $sym23$PAIR = SubLObjectFactory.makeUninternedSymbol("PAIR");
        $sym24$SOURCE_VAR = SubLObjectFactory.makeUninternedSymbol("SOURCE-VAR");
        $sym25$PROGRESS_CDOLIST = SubLObjectFactory.makeSymbol("PROGRESS-CDOLIST");
        $sym26$EBMT_NL_CYCL_PAIRS_FROM_SOURCE = SubLObjectFactory.makeSymbol("EBMT-NL-CYCL-PAIRS-FROM-SOURCE");
        $str27$Processing_EBMT_data_from__a____ = SubLObjectFactory.makeString("Processing EBMT data from ~a ...");
        $sym28$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NL"), SubLObjectFactory.makeSymbol("CYCL"), SubLObjectFactory.makeSymbol("NUM-INTERPS-PER-EXAMPLE"), SubLObjectFactory.makeSymbol("TEST-RESULT"), SubLObjectFactory.makeSymbol("TIME-TAKEN"), SubLObjectFactory.makeSymbol("MATCH-LIST"), SubLObjectFactory.makeSymbol("PARSED-CYCLS"), SubLObjectFactory.makeSymbol("WEIGHTS"), SubLObjectFactory.makeSymbol("TESTING-OUTPUT-FILE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym30$LINE = SubLObjectFactory.makeUninternedSymbol("LINE");
        $sym31$DATUM = SubLObjectFactory.makeUninternedSymbol("DATUM");
        $sym32$DO_FILE_LINES = SubLObjectFactory.makeSymbol("DO-FILE-LINES");
        $sym33$READ_FROM_STRING_IGNORING_ERRORS = SubLObjectFactory.makeSymbol("READ-FROM-STRING-IGNORING-ERRORS");
        $list34 = ConsesLow.list((SubLObject)ebmt_tests.NIL);
        $sym35$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym36$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym37$EBMT_TESTING_OUTPUT_DATUM_P = SubLObjectFactory.makeSymbol("EBMT-TESTING-OUTPUT-DATUM-P");
        $sym38$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str39$Got_a_malformed_EBMT_testing_outp = SubLObjectFactory.makeString("Got a malformed EBMT testing output line ~s");
        $sym40$EBMT_CANONICALIZE_EL_SENTENCE = SubLObjectFactory.makeSymbol("EBMT-CANONICALIZE-EL-SENTENCE");
        $kw41$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw42$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw43$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw44$KB = SubLObjectFactory.makeKeyword("KB");
        $kw45$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw46$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lebanon"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GovernmentalBuilding"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lebanon"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GovernmentalBuilding"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))));
        $sym48$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $sym49$EBMT_PARSE = SubLObjectFactory.makeSymbol("EBMT-PARSE");
        $sym50$EBMT_TEST_FUNC = SubLObjectFactory.makeSymbol("EBMT-TEST-FUNC");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Which terrorist groups have carried out suicide bombings in Israel?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ASSASSINATION-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ASSASSINATION-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristSuicideBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?GROUP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristGroup"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?ASSASSINATION-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Israel"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), (SubLObject)SubLObjectFactory.makeSymbol("?ASSASSINATION-1"), (SubLObject)SubLObjectFactory.makeSymbol("?GROUP"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What types of attacks has Hezbollah performed?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE-OF-ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttackType"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE-OF-ATTACK")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Where were the members of Hizballah born?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER-1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER-1"), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Where do members of Hizballah live?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("residesInRegion")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT"), (SubLObject)SubLObjectFactory.makeSymbol("?GEOGRAPHICAL-REGION"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What terrorist groups is Hezbollah financially linked to?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristGroup"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("financiallyLinked"))), (SubLObject)ebmt_tests.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What types of financial links are there?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("financiallyLinked")))));
        $str52$_error_output_txt = SubLObjectFactory.makeString("/error-output.txt");
        $kw53$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str54$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str55$_cyc_top_data_ebmt_testing_query_ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/query-library/");
        $str56$_ = SubLObjectFactory.makeString("/");
        $str57$_cyc_top_data_ebmt_testing_query_ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/query-library/summary.txt");
        $str58$_cyc_top_data_ebmt_testing_query_ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-training-recall-report");
        $str59$_cyc_top_data_ebmt_testing_query_ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-parsing-results");
        $str60$_cyc_top_data_ebmt_testing_query_ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-accuracy-report");
        $const61$EBMTTrainingExamplesFromQLMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EBMTTrainingExamplesFromQLMt"));
        $str62$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/mt/");
        $str63$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/mt/summary.txt");
        $str64$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-training-recall-report");
        $str65$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-parsing-results");
        $str66$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-accuracy-report");
        $const67$EBMTTrainingExamplesForWesternBus = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EBMTTrainingExamplesForWesternBusinessPracticesMt"));
        $str68$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/file/");
        $str69$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/file/summary.txt");
        $str70$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-training-recall-report");
        $str71$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-parsing-results");
        $str72$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-accuracy-report");
        $str73$_cyc_top_data_ebmt_testing_financ = SubLObjectFactory.makeString("/cyc/top/data/ebmt/testing/financial/file/testing-input.txt");
        $str74$_opt_local_pkg_j2sdk1_4_2_bin_jav = SubLObjectFactory.makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");
        $str75$_home_shah_cvs_head_cycorp_cyc_ja = SubLObjectFactory.makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");
        $str76$_cp = SubLObjectFactory.makeString("-cp");
        $str77$com_cyc_common_nlp_EBMTTemplateIn = SubLObjectFactory.makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");
        $str78$_i = SubLObjectFactory.makeString("-i");
        $str79$_ebmt_index_ = SubLObjectFactory.makeString("/ebmt-index/");
        $str80$EBMT_Template_Index_Server = SubLObjectFactory.makeString("EBMT Template Index Server");
        $sym81$EBMT_TESTING_SOURCE_P = SubLObjectFactory.makeSymbol("EBMT-TESTING-SOURCE-P");
        $kw82$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NL"), (SubLObject)SubLObjectFactory.makeSymbol("?CYCL"));
        $list84 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?QUOTEDCYCL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ebmtNLToCycLTrainingExample")), (SubLObject)SubLObjectFactory.makeSymbol("?NL"), (SubLObject)SubLObjectFactory.makeSymbol("?QUOTEDCYCL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeSymbol("?QUOTEDCYCL"), (SubLObject)SubLObjectFactory.makeSymbol("?CYCL"))));
        $sym85$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str86$localhost = SubLObjectFactory.makeString("localhost");
        $str87$_ebmt_index_txt = SubLObjectFactory.makeString("/ebmt-index.txt");
        $str88$_ebmt_index_log = SubLObjectFactory.makeString("/ebmt-index.log");
        $str89$Processing_EBMT_data_from_ = SubLObjectFactory.makeString("Processing EBMT data from ");
        $str90$____ = SubLObjectFactory.makeString(" ...");
        $str91$cdolist = SubLObjectFactory.makeString("cdolist");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $str93$Added = SubLObjectFactory.makeString("Added");
        $kw94$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $kw95$SPECIFIC = SubLObjectFactory.makeKeyword("SPECIFIC");
        $str96$Unexpected_type_of_EBMT_template_ = SubLObjectFactory.makeString("Unexpected type of EBMT template: ~S~%");
        $str97$Already_indexed = SubLObjectFactory.makeString("Already indexed");
        $str98$Unexpected_indexing_result_of_EBM = SubLObjectFactory.makeString("Unexpected indexing-result of EBMT template: ~s");
        $str99$_S__ = SubLObjectFactory.makeString("~S~%");
        $const100$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym101$HL_TO_EL = SubLObjectFactory.makeSymbol("HL-TO-EL");
        $kw102$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw103$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $int104$100 = SubLObjectFactory.makeInteger(100);
        $str105$Summarizing_EBMT_training_details = SubLObjectFactory.makeString("Summarizing EBMT training details ...");
        $kw106$TRAINING_INPUT_MT = SubLObjectFactory.makeKeyword("TRAINING-INPUT-MT");
        $kw107$USER_TRAINING_EXAMPLES = SubLObjectFactory.makeKeyword("USER-TRAINING-EXAMPLES");
        $kw108$TRAINING_EXAMPLES = SubLObjectFactory.makeKeyword("TRAINING-EXAMPLES");
        $kw109$GENERAL_TEMPLATES = SubLObjectFactory.makeKeyword("GENERAL-TEMPLATES");
        $kw110$GENERAL_TEMPLATES_PC = SubLObjectFactory.makeKeyword("GENERAL-TEMPLATES-PC");
        $kw111$SPECIFIC_TEMPLATES = SubLObjectFactory.makeKeyword("SPECIFIC-TEMPLATES");
        $kw112$SPECIFIC_TEMPLATES_PC = SubLObjectFactory.makeKeyword("SPECIFIC-TEMPLATES-PC");
        $kw113$NO_TEMPLATES = SubLObjectFactory.makeKeyword("NO-TEMPLATES");
        $kw114$NO_TEMPLATES_PC = SubLObjectFactory.makeKeyword("NO-TEMPLATES-PC");
        $kw115$DUPLICATE_TEMPLATES = SubLObjectFactory.makeKeyword("DUPLICATE-TEMPLATES");
        $kw116$DUPLICATE_TEMPLATES_PC = SubLObjectFactory.makeKeyword("DUPLICATE-TEMPLATES-PC");
        $kw117$TOTAL_TRAINING_TIME = SubLObjectFactory.makeKeyword("TOTAL-TRAINING-TIME");
        $kw118$MIN_TRAINING_TIME = SubLObjectFactory.makeKeyword("MIN-TRAINING-TIME");
        $kw119$MAX_TRAINING_TIME = SubLObjectFactory.makeKeyword("MAX-TRAINING-TIME");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-INTERPS-PER-EXAMPLE"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-TAKEN"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PARSED-CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHTS"));
        $kw121$ALMOST = SubLObjectFactory.makeKeyword("ALMOST");
        $kw122$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str123$Unexpected_EBMT_result__s = SubLObjectFactory.makeString("Unexpected EBMT result ~s");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $kw125$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $kw126$TESTING_INPUT_SOURCE = SubLObjectFactory.makeKeyword("TESTING-INPUT-SOURCE");
        $kw127$TEST_EXAMPLES = SubLObjectFactory.makeKeyword("TEST-EXAMPLES");
        $kw128$SUCCESSFUL_TESTS = SubLObjectFactory.makeKeyword("SUCCESSFUL-TESTS");
        $kw129$SUCCESSFUL_TESTS_PC = SubLObjectFactory.makeKeyword("SUCCESSFUL-TESTS-PC");
        $kw130$ALMOST_SUCCESSFUL_TESTS = SubLObjectFactory.makeKeyword("ALMOST-SUCCESSFUL-TESTS");
        $kw131$ALMOST_SUCCESSFUL_TESTS_PC = SubLObjectFactory.makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC");
        $kw132$UNKNOWN_TESTS = SubLObjectFactory.makeKeyword("UNKNOWN-TESTS");
        $kw133$UNKNOWN_TESTS_PC = SubLObjectFactory.makeKeyword("UNKNOWN-TESTS-PC");
        $kw134$FAILED_TESTS = SubLObjectFactory.makeKeyword("FAILED-TESTS");
        $kw135$FAILED_TESTS_PC = SubLObjectFactory.makeKeyword("FAILED-TESTS-PC");
        $kw136$TOTAL_UNIQUE_INTERPS = SubLObjectFactory.makeKeyword("TOTAL-UNIQUE-INTERPS");
        $kw137$MAX_INTERPS_PER_EXAMPLE = SubLObjectFactory.makeKeyword("MAX-INTERPS-PER-EXAMPLE");
        $kw138$MEAN_INTERPS_PER_EXAMPLE = SubLObjectFactory.makeKeyword("MEAN-INTERPS-PER-EXAMPLE");
        $kw139$MEDIAN_INTERPS_PER_EXAMPLE = SubLObjectFactory.makeKeyword("MEDIAN-INTERPS-PER-EXAMPLE");
        $kw140$TOTAL_TESTING_TIME = SubLObjectFactory.makeKeyword("TOTAL-TESTING-TIME");
        $kw141$TOTAL_SUCCESSFUL_TIME = SubLObjectFactory.makeKeyword("TOTAL-SUCCESSFUL-TIME");
        $kw142$TOTAL_ALMOST_SUCCESSFUL_TIME = SubLObjectFactory.makeKeyword("TOTAL-ALMOST-SUCCESSFUL-TIME");
        $kw143$TOTAL_UNKNOWN_TIME = SubLObjectFactory.makeKeyword("TOTAL-UNKNOWN-TIME");
        $kw144$TOTAL_FAILED_TIME = SubLObjectFactory.makeKeyword("TOTAL-FAILED-TIME");
        $kw145$MAX_TIME_PER_EXAMPLE = SubLObjectFactory.makeKeyword("MAX-TIME-PER-EXAMPLE");
        $kw146$MEAN_TIME_PER_EXAMPLE = SubLObjectFactory.makeKeyword("MEAN-TIME-PER-EXAMPLE");
        $kw147$MEDIAN_TIME_PER_EXAMPLE = SubLObjectFactory.makeKeyword("MEDIAN-TIME-PER-EXAMPLE");
        $kw148$TOP1 = SubLObjectFactory.makeKeyword("TOP1");
        $kw149$TOP2 = SubLObjectFactory.makeKeyword("TOP2");
        $kw150$TOP3 = SubLObjectFactory.makeKeyword("TOP3");
        $kw151$TOP4 = SubLObjectFactory.makeKeyword("TOP4");
        $kw152$TOP5 = SubLObjectFactory.makeKeyword("TOP5");
        $kw153$TIMESTAMP = SubLObjectFactory.makeKeyword("TIMESTAMP");
        $kw154$SYSTEM = SubLObjectFactory.makeKeyword("SYSTEM");
        $kw155$HOST = SubLObjectFactory.makeKeyword("HOST");
        $kw156$BOGOMIPS = SubLObjectFactory.makeKeyword("BOGOMIPS");
        $str157$summary_txt = SubLObjectFactory.makeString("summary.txt");
        $str158$summary_plist_lisp = SubLObjectFactory.makeString("summary-plist.lisp");
        $str159$_s__ = SubLObjectFactory.makeString("~s~%");
        $kw160$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $sym161$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym162$GET_EBMT_PLOT_VALUE = SubLObjectFactory.makeSymbol("GET-EBMT-PLOT-VALUE");
        $kw163$RAW_DATA_TYPES = SubLObjectFactory.makeKeyword("RAW-DATA-TYPES");
        $kw164$COMPUTED_DATA_TYPES = SubLObjectFactory.makeKeyword("COMPUTED-DATA-TYPES");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("XLABEL"), (SubLObject)SubLObjectFactory.makeString("Cyc KB\\nDate"), (SubLObject)SubLObjectFactory.makeKeyword("YORIGIN"), (SubLObject)ebmt_tests.ZERO_INTEGER);
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("XLABEL"), (SubLObject)SubLObjectFactory.makeKeyword("YLABEL"), (SubLObject)SubLObjectFactory.makeKeyword("PLOT-TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("YORIGIN"), (SubLObject)SubLObjectFactory.makeKeyword("YMAX"), (SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)SubLObjectFactory.makeKeyword("KEY-JUSTIFY"));
        $kw167$OUTPUT_FILE = SubLObjectFactory.makeKeyword("OUTPUT-FILE");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINE-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"));
        $kw169$LINE_LABELS = SubLObjectFactory.makeKeyword("LINE-LABELS");
        $kw170$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str171$_n = SubLObjectFactory.makeString("\\n");
        $kw172$XTICS = SubLObjectFactory.makeKeyword("XTICS");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"));
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YLABEL"), (SubLObject)SubLObjectFactory.makeString("% of training examples"), (SubLObject)SubLObjectFactory.makeKeyword("PLOT-TITLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("EBMT Training Recall")), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTED-DATA-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FAILED-EXAMPLE-PERCENTAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("no templates"), (SubLObject)SubLObjectFactory.makeKeyword("NO-TEMPLATES-PC")), (SubLObject)SubLObjectFactory.makeKeyword("DUPLICATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("duplicate templates"), (SubLObject)SubLObjectFactory.makeKeyword("DUPLICATE-TEMPLATES-PC")), (SubLObject)SubLObjectFactory.makeKeyword("SPECIFIC-TEMPLATE-RECALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("non-generalized templates"), (SubLObject)SubLObjectFactory.makeKeyword("SPECIFIC-TEMPLATES-PC")), (SubLObject)SubLObjectFactory.makeKeyword("GENERAL-TEMPLATE-RECALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("generalized, unique templates"), (SubLObject)SubLObjectFactory.makeKeyword("GENERAL-TEMPLATES-PC"))));
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YLABEL"), (SubLObject)SubLObjectFactory.makeString("Time (seconds)"), (SubLObject)SubLObjectFactory.makeKeyword("PLOT-TITLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("EBMT Parsing Times")), (SubLObject)SubLObjectFactory.makeKeyword("RAW-DATA-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MEAN-TIME-PER-EXAMPLE"), (SubLObject)SubLObjectFactory.makeString("Mean Time per Sentence"), (SubLObject)SubLObjectFactory.makeKeyword("MEDIAN-TIME-PER-EXAMPLE"), (SubLObject)SubLObjectFactory.makeString("Median Time per Sentence")));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLOT-TITLE"), (SubLObject)SubLObjectFactory.makeString("EBMT Parsing Accuracy"), (SubLObject)SubLObjectFactory.makeKeyword("YLABEL"), (SubLObject)SubLObjectFactory.makeString("Value (in %)"), (SubLObject)SubLObjectFactory.makeKeyword("YMAX"), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTED-DATA-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRECISION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Precision"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERCENT"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSFUL-TESTS"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-UNIQUE-INTERPS"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSFUL-TESTS-PC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Recall"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSFUL-TESTS-PC"))));
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLOT-TITLE"), (SubLObject)SubLObjectFactory.makeString("EBMT Parsing Results"), (SubLObject)SubLObjectFactory.makeKeyword("YLABEL"), (SubLObject)SubLObjectFactory.makeString("% of tests"), (SubLObject)SubLObjectFactory.makeKeyword("YMAX"), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTED-DATA-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FAILED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Failed"), (SubLObject)SubLObjectFactory.makeKeyword("FAILED-TESTS-PC")), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unknown"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-TESTS-PC")), (SubLObject)SubLObjectFactory.makeKeyword("ALMOST-SUCCESSFUL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Almost Successful"), (SubLObject)SubLObjectFactory.makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSFUL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Successful"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSFUL-TESTS-PC"))));
        $kw178$EBMT_GRAPHS_UPDATED = SubLObjectFactory.makeKeyword("EBMT-GRAPHS-UPDATED");
    }
}

/*

	Total time: 882 ms
	
*/