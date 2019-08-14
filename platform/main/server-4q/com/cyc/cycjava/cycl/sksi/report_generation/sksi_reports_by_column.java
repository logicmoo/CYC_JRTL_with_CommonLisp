package com.cyc.cycjava.cycl.sksi.report_generation;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.pairlis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_broadcast_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cae_query_search;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.http_kernel;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.scheduled_queries;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
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

public final class sksi_reports_by_column extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new sksi_reports_by_column();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.report_generation.sksi_reports_by_column";


    // defconstant
    private static final SubLSymbol $rgbc_default_overriding_properties$ = makeSymbol("*RGBC-DEFAULT-OVERRIDING-PROPERTIES*");

    // defparameter
    public static final SubLSymbol $rgbc_locked_overriding_properties$ = makeSymbol("*RGBC-LOCKED-OVERRIDING-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $rgbc_overriding_properties_lock$ = makeSymbol("*RGBC-OVERRIDING-PROPERTIES-LOCK*");

    // defconstant
    public static final SubLSymbol $dtp_report_generator$ = makeSymbol("*DTP-REPORT-GENERATOR*");

    // defconstant
    public static final SubLSymbol $dtp_report_generator_problem$ = makeSymbol("*DTP-REPORT-GENERATOR-PROBLEM*");

    // defconstant
    public static final SubLSymbol $dtp_report_generation_state$ = makeSymbol("*DTP-REPORT-GENERATION-STATE*");

    // defconstant
    private static final SubLSymbol $rgbc_initial_value_for_pfs$ = makeSymbol("*RGBC-INITIAL-VALUE-FOR-PFS*");

    // defvar
    private static final SubLSymbol $all_selected_entities_time_multiplier$ = makeSymbol("*ALL-SELECTED-ENTITIES-TIME-MULTIPLIER*");

    // deflexical
    private static final SubLSymbol $report_specific_properties$ = makeSymbol("*REPORT-SPECIFIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $default_report_properties$ = makeSymbol("*DEFAULT-REPORT-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $sts_selection_sentence$ = makeSymbol("*STS-SELECTION-SENTENCE*");

    private static final SubLList $list0 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLList $list4 = list(list(makeSymbol("MAKE-BROADCAST-STREAM"), NIL));

    private static final SubLSymbol SCHEDULE_REPORT = makeSymbol("SCHEDULE-REPORT");

    private static final SubLList $list6 = list(list(ZERO_INTEGER, NIL));

    private static final SubLString $str7$ = makeString("");

    private static final SubLSymbol SCHEDULE_RECURRING_REPORT = makeSymbol("SCHEDULE-RECURRING-REPORT");

    private static final SubLString $str9$ReportGeneratorReportSpecificatio = makeString("ReportGeneratorReportSpecification");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLList $list12 = list(reader_make_constant_shell(makeString("ReportGeneratorReportSpecification")));

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLObject $$reportSpecificationTemplate = reader_make_constant_shell(makeString("reportSpecificationTemplate"));

    private static final SubLObject $const15$reportSpecificationClobberMultipl = reader_make_constant_shell(makeString("reportSpecificationClobberMultipleValues"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$reportSpecificationPlaceholder = reader_make_constant_shell(makeString("reportSpecificationPlaceholder"));

    private static final SubLObject $const19$reportSpecificationSelectionSente = reader_make_constant_shell(makeString("reportSpecificationSelectionSentence"));

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $const21$reportSpecificationDelimiterChara = reader_make_constant_shell(makeString("reportSpecificationDelimiterCharacter"));

    private static final SubLObject $$Comma_TheSymbol = reader_make_constant_shell(makeString("Comma-TheSymbol"));

    private static final SubLObject $$reportSpecificationFields = reader_make_constant_shell(makeString("reportSpecificationFields"));

    private static final SubLObject $$scheduledReportSpecification = reader_make_constant_shell(makeString("scheduledReportSpecification"));

    private static final SubLObject $$ModelMtByUserAndTaskFn = reader_make_constant_shell(makeString("ModelMtByUserAndTaskFn"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));



    private static final SubLList $list28 = list(reader_make_constant_shell(makeString("stringVersionOfCharacter")), reader_make_constant_shell(makeString("termStrings")));

    private static final SubLString $str29$reports_ = makeString("reports/");

    private static final SubLString $str30$_ = makeString(".");

    private static final SubLString $str31$http___ = makeString("http://");

    private static final SubLString $str32$_ = makeString(":");

    private static final SubLSymbol REPORT_BY_COLUMN_TO_FILE = makeSymbol("REPORT-BY-COLUMN-TO-FILE");



    private static final SubLString $str35$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLString $str37$_partial = makeString("-partial");

    private static final SubLString $str38$_A_A__2__0D_A = makeString("~A~A-~2,'0D~A");

    private static final SubLSymbol REPORT_BY_COLUMN_TO_STREAM = makeSymbol("REPORT-BY-COLUMN-TO-STREAM");

    private static final SubLSymbol $REPORT_KNOWLEDGE_SOURCE = makeKeyword("REPORT-KNOWLEDGE-SOURCE");

    private static final SubLSymbol $COLUMN_RANGE = makeKeyword("COLUMN-RANGE");

    private static final SubLSymbol $DELIMITER = makeKeyword("DELIMITER");



    private static final SubLSymbol $LOG_FILE = makeKeyword("LOG-FILE");

    private static final SubLString $str45$Cannot_understand_filename__bad__ = makeString("Cannot understand filename: bad ~A and ~A ~A is not absolute~%");

    private static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), makeInteger(3500), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("BROWSABLE?"), NIL });

    private static final SubLString $$$RGBC_OVERRIDING_PROPERTIES = makeString("RGBC OVERRIDING PROPERTIES");



    private static final SubLSymbol MAKE_KEYWORD = makeSymbol("MAKE-KEYWORD");

    private static final SubLSymbol STRING_UPCASE = makeSymbol("STRING-UPCASE");

    private static final SubLString $str51$_s = makeString("~s");

    private static final SubLSymbol REPORT_GENERATION_ITERATOR_DONE_P = makeSymbol("REPORT-GENERATION-ITERATOR-DONE-P");

    private static final SubLSymbol REPORT_GENERATION_ITERATOR_NEXT = makeSymbol("REPORT-GENERATION-ITERATOR-NEXT");

    private static final SubLSymbol REPORT_GENERATOR = makeSymbol("REPORT-GENERATOR");

    private static final SubLSymbol REPORT_GENERATOR_P = makeSymbol("REPORT-GENERATOR-P");

    private static final SubLList $list56 = list(makeSymbol("FULL-REPORT-PROPS"), makeSymbol("ITERATOR"), makeSymbol("PROBLEMS"));

    private static final SubLList $list57 = list(makeKeyword("FULL-REPORT-PROPS"), makeKeyword("ITERATOR"), makeKeyword("PROBLEMS"));

    private static final SubLList $list58 = list(makeSymbol("RG-FULL-REPORT-PROPS"), makeSymbol("RG-ITERATOR"), makeSymbol("RG-PROBLEMS"));

    private static final SubLList $list59 = list(makeSymbol("_CSETF-RG-FULL-REPORT-PROPS"), makeSymbol("_CSETF-RG-ITERATOR"), makeSymbol("_CSETF-RG-PROBLEMS"));

    private static final SubLSymbol PRINT_REPORT_GENERATOR = makeSymbol("PRINT-REPORT-GENERATOR");

    private static final SubLSymbol REPORT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REPORT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list62 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REPORT-GENERATOR-P"));

    private static final SubLSymbol RG_FULL_REPORT_PROPS = makeSymbol("RG-FULL-REPORT-PROPS");

    private static final SubLSymbol _CSETF_RG_FULL_REPORT_PROPS = makeSymbol("_CSETF-RG-FULL-REPORT-PROPS");

    private static final SubLSymbol RG_ITERATOR = makeSymbol("RG-ITERATOR");

    private static final SubLSymbol _CSETF_RG_ITERATOR = makeSymbol("_CSETF-RG-ITERATOR");

    private static final SubLSymbol RG_PROBLEMS = makeSymbol("RG-PROBLEMS");

    private static final SubLSymbol _CSETF_RG_PROBLEMS = makeSymbol("_CSETF-RG-PROBLEMS");

    private static final SubLSymbol $FULL_REPORT_PROPS = makeKeyword("FULL-REPORT-PROPS");

    private static final SubLSymbol $ITERATOR = makeKeyword("ITERATOR");



    private static final SubLString $str72$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_REPORT_GENERATOR = makeSymbol("MAKE-REPORT-GENERATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-METHOD");

    private static final SubLString $str78$_REPORT_GENERATOR_ = makeString("<REPORT-GENERATOR>");

    private static final SubLList $list79 = list(list(makeSymbol("REPORT-GENERATOR"), makeSymbol("COLUMN-NUMBER"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym80$COLUMN_PROBLEMS = makeUninternedSymbol("COLUMN-PROBLEMS");

    private static final SubLList $list81 = list(ZERO_INTEGER);



    private static final SubLSymbol REPORT_GENERATOR_PROBLEMS = makeSymbol("REPORT-GENERATOR-PROBLEMS");







    private static final SubLSymbol SXHASH_REPORT_GENERATOR_METHOD = makeSymbol("SXHASH-REPORT-GENERATOR-METHOD");

    private static final SubLSymbol REPORT_GENERATOR_PROBLEM = makeSymbol("REPORT-GENERATOR-PROBLEM");

    private static final SubLSymbol REPORT_GENERATOR_PROBLEM_P = makeSymbol("REPORT-GENERATOR-PROBLEM-P");

    private static final SubLList $list90 = list(makeSymbol("TYPE"), makeSymbol("DESCRIPTION"), makeSymbol("PHYSICAL-FIELD"));

    private static final SubLList $list91 = list($TYPE, makeKeyword("DESCRIPTION"), makeKeyword("PHYSICAL-FIELD"));

    private static final SubLList $list92 = list(makeSymbol("RG-PROBLEM-TYPE"), makeSymbol("RG-PROBLEM-DESCRIPTION"), makeSymbol("RG-PROBLEM-PHYSICAL-FIELD"));

    private static final SubLList $list93 = list(makeSymbol("_CSETF-RG-PROBLEM-TYPE"), makeSymbol("_CSETF-RG-PROBLEM-DESCRIPTION"), makeSymbol("_CSETF-RG-PROBLEM-PHYSICAL-FIELD"));

    private static final SubLSymbol PRINT_REPORT_GENERATOR_PROBLEM = makeSymbol("PRINT-REPORT-GENERATOR-PROBLEM");

    private static final SubLSymbol REPORT_GENERATOR_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REPORT-GENERATOR-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list96 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REPORT-GENERATOR-PROBLEM-P"));

    private static final SubLSymbol RG_PROBLEM_TYPE = makeSymbol("RG-PROBLEM-TYPE");

    private static final SubLSymbol _CSETF_RG_PROBLEM_TYPE = makeSymbol("_CSETF-RG-PROBLEM-TYPE");

    private static final SubLSymbol RG_PROBLEM_DESCRIPTION = makeSymbol("RG-PROBLEM-DESCRIPTION");

    private static final SubLSymbol _CSETF_RG_PROBLEM_DESCRIPTION = makeSymbol("_CSETF-RG-PROBLEM-DESCRIPTION");

    private static final SubLSymbol RG_PROBLEM_PHYSICAL_FIELD = makeSymbol("RG-PROBLEM-PHYSICAL-FIELD");

    private static final SubLSymbol _CSETF_RG_PROBLEM_PHYSICAL_FIELD = makeSymbol("_CSETF-RG-PROBLEM-PHYSICAL-FIELD");





    private static final SubLSymbol $PHYSICAL_FIELD = makeKeyword("PHYSICAL-FIELD");

    private static final SubLSymbol MAKE_REPORT_GENERATOR_PROBLEM = makeSymbol("MAKE-REPORT-GENERATOR-PROBLEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_PROBLEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-PROBLEM-METHOD");

    private static final SubLString $str108$_REPORT_GENERATOR_PROBLEM_ = makeString("<REPORT-GENERATOR-PROBLEM>");

    private static final SubLSymbol SXHASH_REPORT_GENERATOR_PROBLEM_METHOD = makeSymbol("SXHASH-REPORT-GENERATOR-PROBLEM-METHOD");

    private static final SubLSymbol REPORT_GENERATION_STATE = makeSymbol("REPORT-GENERATION-STATE");

    private static final SubLSymbol REPORT_GENERATION_STATE_P = makeSymbol("REPORT-GENERATION-STATE-P");

    private static final SubLList $list112 = list(new SubLObject[]{ makeSymbol("KS"), makeSymbol("RANGE"), makeSymbol("MT"), makeSymbol("PF-ITERATOR"), makeSymbol("ITERATIONS"), makeSymbol("MERGED-PROPS"), makeSymbol("RESULTS-TABLE"), makeSymbol("EXECUTED-QUERIES"), makeSymbol("REPORT-GENERATOR") });

    private static final SubLList $list113 = list(new SubLObject[]{ makeKeyword("KS"), makeKeyword("RANGE"), makeKeyword("MT"), makeKeyword("PF-ITERATOR"), makeKeyword("ITERATIONS"), makeKeyword("MERGED-PROPS"), makeKeyword("RESULTS-TABLE"), makeKeyword("EXECUTED-QUERIES"), makeKeyword("REPORT-GENERATOR") });

    private static final SubLList $list114 = list(new SubLObject[]{ makeSymbol("RG-STATE-KS"), makeSymbol("RG-STATE-RANGE"), makeSymbol("RG-STATE-MT"), makeSymbol("RG-STATE-PF-ITERATOR"), makeSymbol("RG-STATE-ITERATIONS"), makeSymbol("RG-STATE-MERGED-PROPS"), makeSymbol("RG-STATE-RESULTS-TABLE"), makeSymbol("RG-STATE-EXECUTED-QUERIES"), makeSymbol("RG-STATE-REPORT-GENERATOR") });

    private static final SubLList $list115 = list(new SubLObject[]{ makeSymbol("_CSETF-RG-STATE-KS"), makeSymbol("_CSETF-RG-STATE-RANGE"), makeSymbol("_CSETF-RG-STATE-MT"), makeSymbol("_CSETF-RG-STATE-PF-ITERATOR"), makeSymbol("_CSETF-RG-STATE-ITERATIONS"), makeSymbol("_CSETF-RG-STATE-MERGED-PROPS"), makeSymbol("_CSETF-RG-STATE-RESULTS-TABLE"), makeSymbol("_CSETF-RG-STATE-EXECUTED-QUERIES"), makeSymbol("_CSETF-RG-STATE-REPORT-GENERATOR") });

    private static final SubLSymbol PRINT_REPORT_GENERATION_STATE = makeSymbol("PRINT-REPORT-GENERATION-STATE");

    private static final SubLSymbol REPORT_GENERATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REPORT-GENERATION-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list118 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REPORT-GENERATION-STATE-P"));

    private static final SubLSymbol RG_STATE_KS = makeSymbol("RG-STATE-KS");

    private static final SubLSymbol _CSETF_RG_STATE_KS = makeSymbol("_CSETF-RG-STATE-KS");

    private static final SubLSymbol RG_STATE_RANGE = makeSymbol("RG-STATE-RANGE");

    private static final SubLSymbol _CSETF_RG_STATE_RANGE = makeSymbol("_CSETF-RG-STATE-RANGE");

    private static final SubLSymbol RG_STATE_MT = makeSymbol("RG-STATE-MT");

    private static final SubLSymbol _CSETF_RG_STATE_MT = makeSymbol("_CSETF-RG-STATE-MT");

    private static final SubLSymbol RG_STATE_PF_ITERATOR = makeSymbol("RG-STATE-PF-ITERATOR");

    private static final SubLSymbol _CSETF_RG_STATE_PF_ITERATOR = makeSymbol("_CSETF-RG-STATE-PF-ITERATOR");

    private static final SubLSymbol RG_STATE_ITERATIONS = makeSymbol("RG-STATE-ITERATIONS");

    private static final SubLSymbol _CSETF_RG_STATE_ITERATIONS = makeSymbol("_CSETF-RG-STATE-ITERATIONS");

    private static final SubLSymbol RG_STATE_MERGED_PROPS = makeSymbol("RG-STATE-MERGED-PROPS");

    private static final SubLSymbol _CSETF_RG_STATE_MERGED_PROPS = makeSymbol("_CSETF-RG-STATE-MERGED-PROPS");

    private static final SubLSymbol RG_STATE_RESULTS_TABLE = makeSymbol("RG-STATE-RESULTS-TABLE");

    private static final SubLSymbol _CSETF_RG_STATE_RESULTS_TABLE = makeSymbol("_CSETF-RG-STATE-RESULTS-TABLE");

    private static final SubLSymbol RG_STATE_EXECUTED_QUERIES = makeSymbol("RG-STATE-EXECUTED-QUERIES");

    private static final SubLSymbol _CSETF_RG_STATE_EXECUTED_QUERIES = makeSymbol("_CSETF-RG-STATE-EXECUTED-QUERIES");

    private static final SubLSymbol RG_STATE_REPORT_GENERATOR = makeSymbol("RG-STATE-REPORT-GENERATOR");

    private static final SubLSymbol _CSETF_RG_STATE_REPORT_GENERATOR = makeSymbol("_CSETF-RG-STATE-REPORT-GENERATOR");







    private static final SubLSymbol $PF_ITERATOR = makeKeyword("PF-ITERATOR");



    private static final SubLSymbol $MERGED_PROPS = makeKeyword("MERGED-PROPS");

    private static final SubLSymbol $RESULTS_TABLE = makeKeyword("RESULTS-TABLE");

    private static final SubLSymbol $EXECUTED_QUERIES = makeKeyword("EXECUTED-QUERIES");

    private static final SubLSymbol $REPORT_GENERATOR = makeKeyword("REPORT-GENERATOR");

    private static final SubLSymbol MAKE_REPORT_GENERATION_STATE = makeSymbol("MAKE-REPORT-GENERATION-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATION_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATION-STATE-METHOD");

    private static final SubLString $str148$_REPORT_GENERATION_STATE_ = makeString("<REPORT-GENERATION-STATE>");

    private static final SubLSymbol SXHASH_REPORT_GENERATION_STATE_METHOD = makeSymbol("SXHASH-REPORT-GENERATION-STATE-METHOD");

    private static final SubLString $str150$Executed_queries_state___s__ = makeString("Executed queries state: ~s~%");



    private static final SubLObject $$databaseForReportGeneratorOutput = reader_make_constant_shell(makeString("databaseForReportGeneratorOutput"));



    private static final SubLObject $$logicalSchemaSourceMap = reader_make_constant_shell(makeString("logicalSchemaSourceMap"));

    private static final SubLObject $const155$reportGeneratorLogicalSchemaToNat = reader_make_constant_shell(makeString("reportGeneratorLogicalSchemaToNativePhysicalSchemaMap"));

    private static final SubLObject $$schemaFieldNameList = reader_make_constant_shell(makeString("schemaFieldNameList"));

    private static final SubLObject $const157$reportGeneratorLogicalSchemaToDat = reader_make_constant_shell(makeString("reportGeneratorLogicalSchemaToDatabasePhysicalSchemaMap"));

    private static final SubLObject $$schemaName_SKS = reader_make_constant_shell(makeString("schemaName-SKS"));





    private static final SubLString $str161$Could_not_find_logicalSchemaSourc = makeString("Could not find logicalSchemaSourceMap for ~S~%");

    private static final SubLString $str162$Could_not_find_reportGeneratorLog = makeString("Could not find reportGeneratorLogicalSchemaToNativePhysicalSchemaMap for ~S~%");

    private static final SubLString $str163$Could_not_find_schemaFieldNameLis = makeString("Could not find schemaFieldNameList for ~S~%");

    private static final SubLString $str164$Could_not_find_reportGeneratorLog = makeString("Could not find reportGeneratorLogicalSchemaToDatabasePhysicalSchemaMap for ~S~%");

    private static final SubLString $str165$Could_not_find_schemaName_SKS_for = makeString("Could not find schemaName-SKS for ~S~%");

    private static final SubLString $str166$Could_not_find_databaseForReportG = makeString("Could not find databaseForReportGeneratorOutput for ~S~%");

    private static final SubLObject $$logicalFieldValueWithFieldName = reader_make_constant_shell(makeString("logicalFieldValueWithFieldName"));

    private static final SubLList $list168 = list(THREE_INTEGER);

    private static final SubLObject $$fieldEncodingPFIAndLFI = reader_make_constant_shell(makeString("fieldEncodingPFIAndLFI"));

    private static final SubLList $list170 = list(TWO_INTEGER);

    private static final SubLObject $const171$physicalSchemaFieldIndexicalWithN = reader_make_constant_shell(makeString("physicalSchemaFieldIndexicalWithName"));

    private static final SubLString $str172$Could_not_find_logicalFieldValueW = makeString("Could not find logicalFieldValueWithFieldName for ~S ~S~%");

    private static final SubLString $str173$Could_not_find_fieldEncodingPFIAn = makeString("Could not find fieldEncodingPFIAndLFI for ~S ~S ~S~%");

    private static final SubLString $str174$Could_not_find_physicalSchemaFiel = makeString("Could not find physicalSchemaFieldIndexicalWithName for ~S ~S~%");



    private static final SubLString $str176$___S = makeString("~%~S");

    private static final SubLString $str177$RG_field_list_____S__ = makeString("RG field list: ~%~S~%");

    private static final SubLString $str178$Value___S__ = makeString("Value: ~S~%");





    private static final SubLSymbol REPLACE_WITH_NULL = makeSymbol("REPLACE-WITH-NULL");

    private static final SubLString $str182$New_hash_table___S__ = makeString("New hash table: ~S~%");

    private static final SubLSymbol RUN_BATCH_REPORTS_FROM_DEFINITION_FILE = makeSymbol("RUN-BATCH-REPORTS-FROM-DEFINITION-FILE");

    private static final SubLSymbol RUN_BATCH_REPORTS_FROM_DEFINITION = makeSymbol("RUN-BATCH-REPORTS-FROM-DEFINITION");

    private static final SubLList $list185 = cons(makeUninternedSymbol("KEY"), makeSymbol("PROPS"));









    private static final SubLSymbol RANGE_SPECIFIER_ITEM_P = makeSymbol("RANGE-SPECIFIER-ITEM-P");

    private static final SubLSymbol EXPAND_RANGE_SPECIFIER_ITEM = makeSymbol("EXPAND-RANGE-SPECIFIER-ITEM");

    private static final SubLSymbol GAFS_FROM_KS = makeSymbol("GAFS-FROM-KS");

    private static final SubLObject $$physicalSchemaFieldWithName = reader_make_constant_shell(makeString("physicalSchemaFieldWithName"));

    private static final SubLList $list194 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLObject $$schemaFieldList = reader_make_constant_shell(makeString("schemaFieldList"));

    private static final SubLString $str196$Default_values___s__ = makeString("Default values: ~s~%");

    private static final SubLList $list197 = list(makeSymbol("KS1"), makeSymbol("LFI1"), makeSymbol("COLUMN-QUERY"));

    private static final SubLString $str198$Hashtable_contents_before___ = makeString("Hashtable contents before:~%");



    private static final SubLSymbol $ABNORMAL_HALT_REASON = makeKeyword("ABNORMAL-HALT-REASON");

    private static final SubLString $str201$Property_list___s___ = makeString("Property list? ~s ~%");

    private static final SubLString $str202$Dictionary_Contents____ = makeString("Dictionary Contents: ~%");

    private static final SubLString $str203$Hashtable_contents_after__ = makeString("Hashtable contents after~%");

    private static final SubLString $str204$_________________________________ = makeString("~%~%~%~%========================================~%");

    private static final SubLList $list205 = list(FOUR_INTEGER, TWO_INTEGER);

    private static final SubLString $str206$dict_key___s__ = makeString("dict key: ~s~%");

    private static final SubLString $str207$Result_plist___s__ = makeString("Result plist: ~s~%");

    private static final SubLString $str208$Store_row___s__ = makeString("Store row: ~s~%");

    private static final SubLString $str209$_s___ = makeString("~s ~%");

    private static final SubLObject $$indexicalForPhysicalField = reader_make_constant_shell(makeString("indexicalForPhysicalField"));

    private static final SubLString $str211$Result____s__ = makeString("Result : ~s~%");

    private static final SubLString $str212$RG_LFI____s__ = makeString("RG-LFI : ~s~%");

    private static final SubLString $str213$RG_PFI____s__ = makeString("RG-PFI : ~s~%");

    private static final SubLString $str214$RG_PF____s__ = makeString("RG-PF : ~s~%");

    private static final SubLString $str215$encoding_expression____s__ = makeString("encoding-expression : ~s~%");

    private static final SubLString $str216$encoded_value____s__ = makeString("encoded-value : ~s~%");

    private static final SubLString $str217$Store_row__after____s__ = makeString("Store row (after): ~s~%");

    private static final SubLSymbol $kw218$CLOBBER_MULTIPLE_VALUES_ = makeKeyword("CLOBBER-MULTIPLE-VALUES?");

    private static final SubLString $str219$vectorp___S__curr_vector___S__col = makeString("vectorp: ~S, curr-vector: ~S, column-num: ~S, physical-value: ~S~%");

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLSymbol $MULTIPLE_ANSWERS = makeKeyword("MULTIPLE-ANSWERS");

    private static final SubLList $list222 = list(makeSymbol("KS"), makeSymbol("LFI"), makeSymbol("FINAL-QUERY"));

    private static final SubLString $str223$Some_rows_unexpectedly_returned_m = makeString("Some rows unexpectedly returned multiple answers for query ~A.~%LFI: ~A~%Original sentence: ~A~%");

    private static final SubLSymbol APPLY_ENCODING_FOR_PF = makeSymbol("APPLY-ENCODING-FOR-PF");

    private static final SubLList $list225 = list(makeSymbol("KS"), makeSymbol("LFI"), makeSymbol("COLUMN-QUERY"));

    private static final SubLObject $const226$kSVariantHasFieldQueryWFocalArgPo = reader_make_constant_shell(makeString("kSVariantHasFieldQueryWFocalArgPosAndTransformation"));

    private static final SubLSymbol $SELECTION_SENTENCE = makeKeyword("SELECTION-SENTENCE");

    private static final SubLList $list228 = list(makeSymbol("NEW-ENTITY-VAR"), makeSymbol("NEW-SENTENCE"));

    private static final SubLObject $const229$queryHasFocalOutputVariablePositi = reader_make_constant_shell(makeString("queryHasFocalOutputVariablePosition"));

    private static final SubLObject $const230$queryHasFocalOutputVariablePositi = reader_make_constant_shell(makeString("queryHasFocalOutputVariablePositionForReportIndexical"));

    private static final SubLObject $const231$kSHasQueryOutputIndexicalForLogic = reader_make_constant_shell(makeString("kSHasQueryOutputIndexicalForLogicalFieldIndexical"));

    private static final SubLList $list232 = list(TWO_INTEGER, FOUR_INTEGER);

    private static final SubLString $str233$Answer_var_list___s___ = makeString("Answer var list: ~s ~%");

    private static final SubLString $str234$Field_name_list___s___ = makeString("Field name list: ~s ~%");

    private static final SubLString $str235$Modified_Column_Query___S___ = makeString("Modified Column Query: ~S ~%");

    private static final SubLString $str236$Query_halted_unusually_with__D_re = makeString("Query halted unusually with ~D results for reason ~A:~%~A~%~A~%~A~%~A~%~A~%");

    private static final SubLObject $const237$queryHasFocalInputVariablePositio = reader_make_constant_shell(makeString("queryHasFocalInputVariablePosition"));

    private static final SubLObject $const238$queryHasFocalInputVariablePositio = reader_make_constant_shell(makeString("queryHasFocalInputVariablePositionForReportIndexical"));

    private static final SubLObject $$baseQueryForReportType = reader_make_constant_shell(makeString("baseQueryForReportType"));

    private static final SubLString $str240$Number_of_selection_inputs_not_eq = makeString("Number of selection inputs not equal to number of column query positions");

    private static final SubLString $str241$key_selection___value_selection__ = makeString("key-selection : value-selection : value-query : var-list : selection-output-list~%");

    private static final SubLString $str242$_S__S__S__S___S__ = makeString("~S:~S:~S:~S: ~S~%");

    private static final SubLSymbol $SELECTION_SENTENCE_INPUT_LIST = makeKeyword("SELECTION-SENTENCE-INPUT-LIST");

    private static final SubLObject $$queryHasInputIndexicalMapping = reader_make_constant_shell(makeString("queryHasInputIndexicalMapping"));



    private static final SubLString $str246$Tuple_to_map__ = makeString("Tuple to map~%");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str250$var_pos_var_selection_vars_select = makeString("var-pos:var:selection-vars:selection-output-list~%");

    private static final SubLString $str251$_S__S__S__S__ = makeString("~S:~S:~S:~S~%");

    private static final SubLString $str252$Failed_to_find_entities_for_repor = makeString("Failed to find entities for report ~A using associated queries ~S~%");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLSymbol $sym254$_LS = makeSymbol("?LS");

    private static final SubLList $list255 = list(reader_make_constant_shell(makeString("logicalFieldIndexicals")), makeSymbol("?LS"), makeSymbol("?LFI"));

    private static final SubLObject $const256$kSHasQueryForLogicalFieldIndexica = reader_make_constant_shell(makeString("kSHasQueryForLogicalFieldIndexical"));

    private static final SubLSymbol $sym257$_LFI = makeSymbol("?LFI");

    private static final SubLList $list258 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $sym259$_QUERY = makeSymbol("?QUERY");

    private static final SubLList $list260 = list(makeSymbol("?RESULTPOS"));

    private static final SubLList $list261 = list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("equalSymbols")), makeSymbol("?RESULTPOS"), list(reader_make_constant_shell(makeString("TheList"))))));

    private static final SubLString $str262$Can_t_find_any_useful_queries_ass = makeString("Can't find any useful queries associated with report ~A!~%");

    private static final SubLList $list263 = list(new SubLObject[]{ makeKeyword("REPORT-KNOWLEDGE-SOURCE"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("LOG-FILE"), makeKeyword("LOG-STREAM"), makeKeyword("DELIMITER"), makeKeyword("SELECTION-SENTENCE"), makeKeyword("COLUMN-RANGE"), makeKeyword("PLACEHOLDER"), makeKeyword("CLOBBER-MULTIPLE-VALUES?") });

    private static final SubLSymbol $LOG_STREAM = makeKeyword("LOG-STREAM");

    private static final SubLSymbol APPLY_RANGE_SPECIFIER_TO_SEQUENCE = makeSymbol("APPLY-RANGE-SPECIFIER-TO-SEQUENCE");













    private static final SubLList $list272 = list(list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(FOUR_INTEGER)), list(makeSymbol("E"))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(ONE_INTEGER, FOUR_INTEGER)), list(makeSymbol("B"), makeSymbol("E"))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(list(ONE_INTEGER, FOUR_INTEGER))), list(makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"))), list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E")), list(list(ZERO_INTEGER, NIL))), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"))), list(list(list(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"), makeSymbol("F"), makeSymbol("G"), makeSymbol("H"), makeSymbol("I"), makeSymbol("J") }), list(ZERO_INTEGER, list(TWO_INTEGER, FOUR_INTEGER), SIX_INTEGER, list(EIGHT_INTEGER, NIL))), list(makeSymbol("A"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"), makeSymbol("G"), makeSymbol("I"), makeSymbol("J"))));

    private static final SubLSymbol ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE = makeSymbol("ABSOLUTE-PATH-FROM-ABSOLUTE-OR-RELATIVE");

    private static final SubLList $list274 = list(new SubLObject[]{ list(list(NIL, NIL), NIL), list(list(makeString(""), makeString("")), NIL), list(list(makeString("foo.txt"), makeString("")), NIL), list(list(makeString("/home/foo.txt"), makeString("")), makeString("/home/foo.txt")), list(list(makeString("/home/foo.txt"), makeString(":\\/$# nblah")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("/home")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("/home/")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("home")), NIL), list(list(makeString("../foo.txt"), makeString("/home/bar")), makeString("/home/foo.txt")), list(list(makeString("foo.txt"), makeString("C:\\")), makeString("C:\\foo.txt")), list(list(makeString("foo.txt"), makeString("C:\\Documents and Settings")), makeString("C:\\Documents and Settings\\foo.txt")), list(list(makeString("C:\\Documents and Settings\\foo.txt"), makeString(":\\/$# nblah")), makeString("C:\\Documents and Settings\\foo.txt")), list(list(makeString("foo.txt"), makeString("\\\\windows\\share")), makeString("\\\\windows\\share\\foo.txt")) });

    private static final SubLObject $$sksOfReportTest = reader_make_constant_shell(makeString("sksOfReportTest"));





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$requiredAssertionForReportTest = reader_make_constant_shell(makeString("requiredAssertionForReportTest"));



    private static final SubLList $list281 = list(makeSymbol("MT"), makeSymbol("BIN-PRED"), makeSymbol("ARG-2-VALUE"));



    private static final SubLObject $$pathnameForReportDefinition = reader_make_constant_shell(makeString("pathnameForReportDefinition"));

    private static final SubLObject $$baselineDirectoryForReport = reader_make_constant_shell(makeString("baselineDirectoryForReport"));

    private static final SubLObject $const285$reportTestComparesFilenamesWRTKey = reader_make_constant_shell(makeString("reportTestComparesFilenamesWRTKeycolumn"));

    private static final SubLList $list286 = list(makeSymbol("BASELINE-FILENAME"), makeSymbol("OUTPUT-FILENAME"), makeSymbol("KEY-COLUMN"));

    private static final SubLString $str287$Baseline_file___A__Test_output_fi = makeString("Baseline file: ~A~%Test output file: ~A~% For ~S,~% Wanted ~A~%    Got ~A");

    private static final SubLString $str288$_A___has__D_more_rows_than___A = makeString("~A~% has ~D more rows than~%~A");

    private static final SubLList $list289 = list(CHAR_tab);

    private static final SubLString $str290$Can_t_find__S_in__S = makeString("Can't find ~S in ~S");

    public static SubLObject with_text_file_or_null_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream_var = NIL;
        SubLObject filename = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        stream_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, filename, listS(WITH_TEXT_FILE, list(stream_var, filename, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream_var, $list4)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject schedule_report(final SubLObject ks, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (selection_sentence == UNPROVIDED) {
            selection_sentence = $sts_selection_sentence$.getGlobalValue();
        }
        if (range_spec == UNPROVIDED) {
            range_spec = $list6;
        }
        if (clobber_multiple_valuesP == UNPROVIDED) {
            clobber_multiple_valuesP = NIL;
        }
        if (placeholder == UNPROVIDED) {
            placeholder = $str7$;
        }
        final SubLObject query = a_possibly_open_query_from_ks(ks, UNPROVIDED);
        final SubLObject scheduled_event = scheduled_queries.make_single_query_schedule_assertions(query, date, email_recipients, email_carbon_copies, cyclist, task);
        final SubLObject report_spec = add_report_specification_to_scheduled_query(scheduled_event, ks, cyclist, task, delimiter, selection_sentence, range_spec, clobber_multiple_valuesP, placeholder);
        if (NIL != report_spec) {
            scheduled_queries.note_query_scheduling_complete(scheduled_event);
        }
        return report_spec;
    }

    public static SubLObject schedule_recurring_report(final SubLObject ks, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (selection_sentence == UNPROVIDED) {
            selection_sentence = $sts_selection_sentence$.getGlobalValue();
        }
        if (range_spec == UNPROVIDED) {
            range_spec = $list6;
        }
        if (clobber_multiple_valuesP == UNPROVIDED) {
            clobber_multiple_valuesP = NIL;
        }
        if (placeholder == UNPROVIDED) {
            placeholder = $str7$;
        }
        final SubLObject query = a_possibly_open_query_from_ks(ks, UNPROVIDED);
        final SubLObject scheduled_event = scheduled_queries.make_recurring_query_schedule_assertions(query, interval_type, email_recipients, email_carbon_copies, cyclist, task);
        final SubLObject report_spec = add_report_specification_to_scheduled_query(scheduled_event, ks, cyclist, task, delimiter, selection_sentence, range_spec, clobber_multiple_valuesP, placeholder);
        if (NIL != report_spec) {
            scheduled_queries.note_query_scheduling_complete(scheduled_event);
        }
        return report_spec;
    }

    public static SubLObject add_report_specification_to_scheduled_query(final SubLObject scheduled_event, final SubLObject ks, final SubLObject cyclist, final SubLObject task, final SubLObject delimiter, SubLObject selection_sentence, final SubLObject range_spec, final SubLObject clobber_multiple_valuesP, final SubLObject placeholder) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = get_report_specification_mt(cyclist, task);
        final SubLObject report_spec = ke.ke_create_now($str9$ReportGeneratorReportSpecificatio, UNPROVIDED);
        SubLObject failP = sublisp_null(report_spec);
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            SubLObject cdolist_list_var = $list12;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == ke.ke_assert_now(list($$isa, report_spec, v_isa), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                    failP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
            if (NIL == selection_sentence) {
                selection_sentence = get_selection_sentence_from_ks(ks);
            }
            if (NIL == failP) {
                SubLObject csome_list_var = list(list($$definingMt, report_spec, mt), list($$reportSpecificationTemplate, report_spec, ks), list($const15$reportSpecificationClobberMultipl, report_spec, NIL == clobber_multiple_valuesP ? $$False : $$True), list($$reportSpecificationPlaceholder, report_spec, placeholder), list($const19$reportSpecificationSelectionSente, report_spec, list($$Quote, selection_sentence)));
                SubLObject sentence = NIL;
                sentence = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                        failP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    sentence = csome_list_var.first();
                } 
            }
            final SubLObject cycl_delimiter_character = get_cycl_character(delimiter);
            final SubLObject sentence = list($const21$reportSpecificationDelimiterChara, report_spec, NIL != cycl_delimiter_character ? cycl_delimiter_character : $$Comma_TheSymbol);
            if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                failP = T;
            }
            if (NIL == failP) {
                SubLObject csome_list_var = parse_number_range_specifier(range_spec, UNPROVIDED);
                SubLObject num = NIL;
                num = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if (NIL == ke.ke_assert(list($$reportSpecificationFields, report_spec, number_utilities.f_1X(num)), mt, UNPROVIDED, UNPROVIDED)) {
                        failP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    num = csome_list_var.first();
                } 
            }
            if ((NIL == failP) && (NIL == ke.ke_assert_now(list($$scheduledReportSpecification, scheduled_event, report_spec), mt, UNPROVIDED, UNPROVIDED))) {
                failP = T;
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL != failP ? NIL : report_spec;
    }

    public static SubLObject get_report_specification_mt(SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if ((NIL != cyclist) && (NIL != task)) {
            return hlmt_czer.canonicalize_hlmt(make_binary_formula($$ModelMtByUserAndTaskFn, cyclist, task));
        }
        return $$BaseKB;
    }

    public static SubLObject get_cycl_character(final SubLObject subl_char) {
        final SubLObject char_string = Strings.make_string(ONE_INTEGER, subl_char);
        SubLObject cycl_character = NIL;
        if (NIL == cycl_character) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = $list28, pred = NIL, pred = csome_list_var.first(); (NIL == cycl_character) && (NIL != csome_list_var); cycl_character = kb_mapping_utilities.fpred_value_in_any_mt(char_string, pred, TWO_INTEGER, ONE_INTEGER, $TRUE) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return cycl_character;
    }

    public static SubLObject reports_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[]{ system_parameters.$cyc_documentation_url$.getDynamicValue(thread), $str29$reports_ });
    }

    public static SubLObject url_to_retrieve_report_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = misc_utilities.machine_name();
        if (NIL == find(CHAR_period, host, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            host = cconcatenate(host, new SubLObject[]{ $str30$_, mail_utilities.get_tcp_domain_name() });
        }
        return cconcatenate($str31$http___, new SubLObject[]{ host, $str32$_, princ_to_string(http_kernel.http_port()), string_utilities.pre_remove(reports_directory(), system_parameters.$http_htdocs_directory$.getDynamicValue(thread), UNPROVIDED), filename });
    }

    public static SubLObject report_by_column_to_file(final SubLObject report_props) {
        final SubLObject report_generator = new_report_generator(report_props);
        return report_generator_run_report(report_generator, UNPROVIDED);
    }

    public static SubLObject report_generator_run_report(final SubLObject report_generator, SubLObject scheduled_query) {
        if (scheduled_query == UNPROVIDED) {
            scheduled_query = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject full_report_props = report_generator_full_report_props(report_generator);
        final SubLObject file_name = get_full_filename_for_report(full_report_props);
        final SubLObject maybe_log_file = get_full_logfilename_for_report(full_report_props);
        thread.resetMultipleValues();
        final SubLObject directory = parse_filename(file_name);
        final SubLObject file_name_base = thread.secondMultipleValue();
        final SubLObject file_name_suffix = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != maybe_log_file) {
            file_utilities.prepare_to_possibly_overwrite_file(maybe_log_file, UNPROVIDED);
        }
        if (NIL != maybe_log_file) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(maybe_log_file, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str35$Unable_to_open__S, maybe_log_file);
                }
                final SubLObject real_log_stream = stream;
                final SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
                final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
                try {
                    StreamsLow.$error_output$.bind(real_log_stream, thread);
                    StreamsLow.$standard_output$.bind(real_log_stream, thread);
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject iterator = report_generator_iterator(report_generator);
                            SubLObject v_iteration = ZERO_INTEGER;
                            SubLObject partial_directory = NIL;
                            if (list_utilities.plist_lookup(full_report_props, $OUTPUT_DIRECTORY, UNPROVIDED) != NIL) {
                                partial_directory = file_utilities.possibly_append_path_separator_char(cconcatenate(directory, new SubLObject[]{ file_name_base, $str37$_partial }));
                                if (NIL == Filesys.directory_p(partial_directory)) {
                                    Filesys.make_directory(partial_directory, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            while ((NIL == iteration.iteration_done(iterator)) && (NIL == scheduled_queries.should_skipXabort_scheduled_queryP(scheduled_query))) {
                                final SubLObject results = iteration.iteration_next(iterator);
                                SubLObject this_file_name = NIL;
                                if (list_utilities.plist_lookup(full_report_props, $OUTPUT_DIRECTORY, UNPROVIDED) != NIL) {
                                    this_file_name = (NIL != iteration.iteration_done(iterator)) ? file_name : format(NIL, $str38$_A_A__2__0D_A, new SubLObject[]{ partial_directory, file_name_base, v_iteration, file_name_suffix });
                                    file_utilities.prepare_to_possibly_overwrite_file(this_file_name, UNPROVIDED);
                                }
                                if (NIL != this_file_name) {
                                    SubLObject stream_$2 = NIL;
                                    try {
                                        stream_$2 = compatibility.open_text(this_file_name, $OUTPUT);
                                        if (!stream_$2.isStream()) {
                                            Errors.error($str35$Unable_to_open__S, this_file_name);
                                        }
                                        final SubLObject out_stream = stream_$2;
                                        output_report_by_column(results, out_stream, full_report_props);
                                    } finally {
                                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (stream_$2.isStream()) {
                                                close(stream_$2, UNPROVIDED);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    }
                                } else {
                                    final SubLObject out_stream2 = make_broadcast_stream(NIL);
                                    output_report_by_column(results, out_stream2, full_report_props);
                                }
                                v_iteration = add(v_iteration, ONE_INTEGER);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
                    StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } else {
            final SubLObject real_log_stream2 = make_broadcast_stream(NIL);
            final SubLObject _prev_bind_4 = StreamsLow.$error_output$.currentBinding(thread);
            final SubLObject _prev_bind_5 = StreamsLow.$standard_output$.currentBinding(thread);
            try {
                StreamsLow.$error_output$.bind(real_log_stream2, thread);
                StreamsLow.$standard_output$.bind(real_log_stream2, thread);
                final SubLObject local_state2;
                final SubLObject state2 = local_state2 = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state2, thread);
                    final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                    try {
                        final SubLObject iterator2 = report_generator_iterator(report_generator);
                        SubLObject v_iteration2 = ZERO_INTEGER;
                        SubLObject partial_directory2 = NIL;
                        if (list_utilities.plist_lookup(full_report_props, $OUTPUT_DIRECTORY, UNPROVIDED) != NIL) {
                            partial_directory2 = file_utilities.possibly_append_path_separator_char(cconcatenate(directory, new SubLObject[]{ file_name_base, $str37$_partial }));
                            if (NIL == Filesys.directory_p(partial_directory2)) {
                                Filesys.make_directory(partial_directory2, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        while ((NIL == iteration.iteration_done(iterator2)) && (NIL == scheduled_queries.should_skipXabort_scheduled_queryP(scheduled_query))) {
                            final SubLObject results2 = iteration.iteration_next(iterator2);
                            SubLObject this_file_name2 = NIL;
                            if (list_utilities.plist_lookup(full_report_props, $OUTPUT_DIRECTORY, UNPROVIDED) != NIL) {
                                this_file_name2 = (NIL != iteration.iteration_done(iterator2)) ? file_name : format(NIL, $str38$_A_A__2__0D_A, new SubLObject[]{ partial_directory2, file_name_base, v_iteration2, file_name_suffix });
                                file_utilities.prepare_to_possibly_overwrite_file(this_file_name2, UNPROVIDED);
                            }
                            if (NIL != this_file_name2) {
                                SubLObject stream2 = NIL;
                                try {
                                    stream2 = compatibility.open_text(this_file_name2, $OUTPUT);
                                    if (!stream2.isStream()) {
                                        Errors.error($str35$Unable_to_open__S, this_file_name2);
                                    }
                                    final SubLObject out_stream2 = stream2;
                                    output_report_by_column(results2, out_stream2, full_report_props);
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (stream2.isStream()) {
                                            close(stream2, UNPROVIDED);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            } else {
                                final SubLObject out_stream3 = make_broadcast_stream(NIL);
                                output_report_by_column(results2, out_stream3, full_report_props);
                            }
                            v_iteration2 = add(v_iteration2, ONE_INTEGER);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values5 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                            restoreValuesFromVector(_values5);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                StreamsLow.$standard_output$.rebind(_prev_bind_5, thread);
                StreamsLow.$error_output$.rebind(_prev_bind_4, thread);
            }
        }
        return file_name;
    }

    public static SubLObject parse_filename(final SubLObject filename) {
        final SubLObject path_type = file_utilities.guess_path_type_robust(filename);
        final SubLObject separator_pos = list_utilities.position_from_end(file_utilities.path_separator_char(path_type), filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject local_name = NIL;
        SubLObject directory = NIL;
        SubLObject local_name_base = NIL;
        SubLObject suffix = NIL;
        if (NIL != separator_pos) {
            directory = string_utilities.substring(filename, ZERO_INTEGER, number_utilities.f_1X(separator_pos));
            local_name = string_utilities.substring(filename, number_utilities.f_1X(separator_pos), UNPROVIDED);
        } else {
            directory = $str7$;
            local_name = filename;
        }
        final SubLObject dot_position = list_utilities.position_from_end(CHAR_period, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != dot_position) {
            local_name_base = string_utilities.substring(local_name, ZERO_INTEGER, dot_position);
            suffix = string_utilities.substring(local_name, dot_position, UNPROVIDED);
        } else {
            local_name_base = local_name;
            suffix = $str7$;
        }
        return values(directory, local_name_base, suffix);
    }

    public static SubLObject report_by_column_to_stream(final SubLObject report_props, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject report_generator = new_report_generator(report_props);
        final SubLObject full_report_props = report_generator_full_report_props(report_generator);
        final SubLObject ks = list_utilities.plist_lookup(full_report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject iterator = report_generator_iterator(report_generator);
                SubLObject results = NIL;
                while (NIL == iteration.iteration_done(iterator)) {
                    results = iteration.iteration_next(iterator);
                } 
                output_report_by_column(results, stream, full_report_props);
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ks;
    }

    public static SubLObject output_report_by_column(final SubLObject results, final SubLObject stream, final SubLObject full_report_props) {
        final SubLObject ks = list_utilities.plist_lookup(full_report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject range_spec = list_utilities.plist_lookup(full_report_props, $COLUMN_RANGE, UNPROVIDED);
        final SubLObject delimiter = list_utilities.plist_lookup(full_report_props, $DELIMITER, UNPROVIDED);
        list_utilities.print_list_as_delimited_line(apply_range_specifier_to_sequence(sksi_report_generation.reportgen_schema_field_name_list(ks), range_spec), delimiter, stream);
        terpri(stream);
        print_hashtable_of_plists_as_delimited_lines(results, sksi_report_generation.reportgen_schema_field_name_list(ks), delimiter, stream);
        return NIL;
    }

    public static SubLObject report_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.query_property_p(v_object)) || (NIL != list_utilities.member_eqP(v_object, $report_specific_properties$.getGlobalValue())));
    }

    public static SubLObject get_full_filename_for_report(final SubLObject report_props) {
        if (NIL == list_utilities.plist_lookup(report_props, $OUTPUT_FILENAME, UNPROVIDED)) {
            return NIL;
        }
        return construct_full_path_from_prop_values(report_props, $OUTPUT_FILENAME, $OUTPUT_DIRECTORY);
    }

    public static SubLObject get_full_logfilename_for_report(final SubLObject report_props) {
        if (NIL == list_utilities.plist_lookup(report_props, $LOG_FILE, UNPROVIDED)) {
            return NIL;
        }
        return construct_full_path_from_prop_values(report_props, $LOG_FILE, $OUTPUT_DIRECTORY);
    }

    public static SubLObject construct_full_path_from_prop_values(final SubLObject props, final SubLObject file_key, final SubLObject dir_key) {
        final SubLObject filename = list_utilities.plist_lookup(props, file_key, UNPROVIDED);
        final SubLObject dirname = list_utilities.plist_lookup(props, dir_key, UNPROVIDED);
        final SubLObject result = absolute_path_from_absolute_or_relative(filename, dirname);
        if (NIL != result) {
            return result;
        }
        Errors.error($str45$Cannot_understand_filename__bad__, dir_key, file_key, filename);
        return NIL;
    }

    public static SubLObject absolute_path_from_absolute_or_relative(final SubLObject path, final SubLObject absolute_dir) {
        if (NIL != file_utilities.absolute_pathP(path)) {
            return path;
        }
        if (length(absolute_dir).numE(ZERO_INTEGER) || (NIL == file_utilities.absolute_pathP(absolute_dir))) {
            return NIL;
        }
        return file_utilities.make_path_absolute_relative_to(file_utilities.possibly_append_path_separator_char(absolute_dir), path);
    }

    public static SubLObject split_report_properties(final SubLObject report_props) {
        SubLObject query_props = NIL;
        SubLObject non_query_props = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = report_props; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
                query_props = putf(query_props, property, value);
            } else {
                non_query_props = putf(non_query_props, property, value);
            }
        }
        return list(query_props, non_query_props);
    }

    public static SubLObject query_properties_from_report_properties(final SubLObject report_props) {
        return split_report_properties(report_props).first();
    }

    public static SubLObject merge_in_default_overriding_properties(final SubLObject report_props) {
        return list_utilities.merge_plist(get_rgbc_overriding_properties(), report_props);
    }

    public static SubLObject get_rgbc_overriding_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject props = NIL;
        final SubLObject rw_lock_var = $rgbc_overriding_properties_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            props = copy_list($rgbc_locked_overriding_properties$.getDynamicValue(thread));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return props;
    }

    public static SubLObject add_to_rgbc_overriding_properties(final SubLObject plist) {
        final SubLObject old_props = get_rgbc_overriding_properties();
        final SubLObject new_props = inference_datastructures_enumerated_types.merge_query_properties(old_props, plist);
        if (!old_props.equal(new_props)) {
            final SubLObject rw_lock_var = $rgbc_overriding_properties_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                $rgbc_locked_overriding_properties$.setDynamicValue(new_props);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return new_props;
    }

    public static SubLObject update_rgbc_max_time(final SubLObject seconds) {
        return add_to_rgbc_overriding_properties(list($MAX_TIME, seconds));
    }

    public static SubLObject reset_rgbc_overriding_properties() {
        final SubLObject rw_lock_var = $rgbc_overriding_properties_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            $rgbc_locked_overriding_properties$.setDynamicValue($rgbc_default_overriding_properties$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $rgbc_default_overriding_properties$.getGlobalValue();
    }

    public static SubLObject print_hashtable_of_vectors_as_delimited_lines(final SubLObject hashtable, SubLObject delimiter, SubLObject stream) {
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject key = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                vector_utilities.print_vector_as_delimited_line(vector, delimiter, stream);
                terpri(stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }

    public static SubLObject print_hashtable_of_plists_as_delimited_lines(final SubLObject hashtable, final SubLObject print_order, SubLObject delimiter, SubLObject stream) {
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject field_name_keywords = Mapping.mapcar(MAKE_KEYWORD, Mapping.mapcar(STRING_UPCASE, print_order));
        SubLObject key = NIL;
        SubLObject plist_row = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                plist_row = getEntryValue(cdohash_entry);
                SubLObject cdolist_list_var = field_name_keywords;
                SubLObject keyword = NIL;
                keyword = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str51$_s, list_utilities.plist_lookup(plist_row, keyword, UNPROVIDED));
                    princ(delimiter, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    keyword = cdolist_list_var.first();
                } 
                terpri(stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }

    public static SubLObject new_report_generation_iterator(final SubLObject report_props, final SubLObject report_generator) {
        return iteration.new_iterator(make_report_generation_iterator_state(report_props, report_generator), REPORT_GENERATION_ITERATOR_DONE_P, REPORT_GENERATION_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject report_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_report_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject report_generator_p(final SubLObject v_object) {
        return v_object.getClass() == $report_generator_native.class ? T : NIL;
    }

    public static SubLObject rg_full_report_props(final SubLObject v_object) {
        assert NIL != report_generator_p(v_object) : "sksi_reports_by_column.report_generator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rg_iterator(final SubLObject v_object) {
        assert NIL != report_generator_p(v_object) : "sksi_reports_by_column.report_generator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rg_problems(final SubLObject v_object) {
        assert NIL != report_generator_p(v_object) : "sksi_reports_by_column.report_generator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_rg_full_report_props(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generator_p(v_object) : "sksi_reports_by_column.report_generator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rg_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generator_p(v_object) : "sksi_reports_by_column.report_generator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rg_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generator_p(v_object) : "sksi_reports_by_column.report_generator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_report_generator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $report_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FULL_REPORT_PROPS)) {
                _csetf_rg_full_report_props(v_new, current_value);
            } else
                if (pcase_var.eql($ITERATOR)) {
                    _csetf_rg_iterator(v_new, current_value);
                } else
                    if (pcase_var.eql($PROBLEMS)) {
                        _csetf_rg_problems(v_new, current_value);
                    } else {
                        Errors.error($str72$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_report_generator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REPORT_GENERATOR, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FULL_REPORT_PROPS, rg_full_report_props(obj));
        funcall(visitor_fn, obj, $SLOT, $ITERATOR, rg_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEMS, rg_problems(obj));
        funcall(visitor_fn, obj, $END, MAKE_REPORT_GENERATOR, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_report_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_report_generator(obj, visitor_fn);
    }

    public static SubLObject print_report_generator(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str78$_REPORT_GENERATOR_);
        return v_object;
    }

    public static SubLObject new_report_generator(final SubLObject report_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject report_generator = make_report_generator(UNPROVIDED);
        final SubLObject full_report_props = list_utilities.augment_plist_with_defaults(report_props, default_report_properties());
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject range_spec = list_utilities.plist_lookup(full_report_props, $COLUMN_RANGE, UNPROVIDED);
            final SubLObject column_proxies = apply_range_specifier_to_sequence(sksi_report_generation.reportgen_schema_field_list(ks), range_spec);
            final SubLObject column_count = length(column_proxies);
            _csetf_rg_problems(report_generator, make_vector(add(ONE_INTEGER, column_count), NIL));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _csetf_rg_full_report_props(report_generator, full_report_props);
        _csetf_rg_iterator(report_generator, new_report_generation_iterator(full_report_props, report_generator));
        return report_generator;
    }

    public static SubLObject report_generator_full_report_props(final SubLObject report_generator) {
        assert NIL != report_generator_p(report_generator) : "sksi_reports_by_column.report_generator_p(report_generator) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generator_p(report_generator) " + report_generator;
        return rg_full_report_props(report_generator);
    }

    public static SubLObject report_generator_iterator(final SubLObject report_generator) {
        assert NIL != report_generator_p(report_generator) : "sksi_reports_by_column.report_generator_p(report_generator) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generator_p(report_generator) " + report_generator;
        return rg_iterator(report_generator);
    }

    public static SubLObject report_generator_problems(final SubLObject report_generator) {
        assert NIL != report_generator_p(report_generator) : "sksi_reports_by_column.report_generator_p(report_generator) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generator_p(report_generator) " + report_generator;
        return rg_problems(report_generator);
    }

    public static SubLObject report_generator_problem_count(final SubLObject report_generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_count = ZERO_INTEGER;
        final SubLObject iterator_var = report_generator_problem_iterator(report_generator);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject problem_data = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                problem_count = add(problem_count, ONE_INTEGER);
            }
        }
        return problem_count;
    }

    public static SubLObject report_generator_do_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject report_generator = NIL;
        SubLObject column_number = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        report_generator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        column_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject column_problems = $sym80$COLUMN_PROBLEMS;
            return list(CLET, list(bq_cons(column_number, $list81)), list(CDOVECTOR, list(column_problems, list(REPORT_GENERATOR_PROBLEMS, report_generator)), listS(CDOLIST, list(problem, column_problems), append(body, NIL)), list(CINC, column_number)));
        }
        cdestructuring_bind_error(datum, $list79);
        return NIL;
    }

    public static SubLObject report_generator_column_count(final SubLObject report_generator) {
        return subtract(length(report_generator_problems(report_generator)), ONE_INTEGER);
    }

    public static SubLObject report_generator_problem_iterator(final SubLObject report_generator) {
        SubLObject problems = NIL;
        SubLObject column_number = ZERO_INTEGER;
        final SubLObject vector_var = report_generator_problems(report_generator);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject cdolist_list_var;
        SubLObject column_problems;
        SubLObject problem;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            column_problems = cdolist_list_var = aref(vector_var, element_num);
            problem = NIL;
            problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                problems = cons(cons(column_number, problem), problems);
                cdolist_list_var = cdolist_list_var.rest();
                problem = cdolist_list_var.first();
            } 
            column_number = add(column_number, ONE_INTEGER);
        }
        return iteration.new_list_iterator(problems);
    }

    public static SubLObject report_generator_note_problem(final SubLObject report_generator, SubLObject column, final SubLObject description, final SubLObject physical_field, SubLObject type) {
        if (type == UNPROVIDED) {
            type = report_generator_guess_problem_type(description);
        }
        final SubLObject problem = new_report_generator_problem(type, description, physical_field);
        final SubLObject problems = rg_problems(report_generator);
        if (NIL == column) {
            column = subtract(length(problems), ONE_INTEGER);
        }
        set_aref(problems, column, cons(problem, aref(problems, column)));
        return problem;
    }

    public static SubLObject report_generator_guess_problem_type(final SubLObject description) {
        return $GENERAL;
    }

    public static SubLObject sxhash_report_generator_method(final SubLObject v_object) {
        return sxhash_report_generator(v_object);
    }

    public static SubLObject sxhash_report_generator(final SubLObject report_generator) {
        return Sxhash.sxhash(rg_full_report_props(report_generator));
    }

    public static SubLObject report_generator_problem_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_report_generator_problem(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject report_generator_problem_p(final SubLObject v_object) {
        return v_object.getClass() == $report_generator_problem_native.class ? T : NIL;
    }

    public static SubLObject rg_problem_type(final SubLObject v_object) {
        assert NIL != report_generator_problem_p(v_object) : "sksi_reports_by_column.report_generator_problem_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rg_problem_description(final SubLObject v_object) {
        assert NIL != report_generator_problem_p(v_object) : "sksi_reports_by_column.report_generator_problem_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rg_problem_physical_field(final SubLObject v_object) {
        assert NIL != report_generator_problem_p(v_object) : "sksi_reports_by_column.report_generator_problem_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_rg_problem_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generator_problem_p(v_object) : "sksi_reports_by_column.report_generator_problem_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rg_problem_description(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generator_problem_p(v_object) : "sksi_reports_by_column.report_generator_problem_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rg_problem_physical_field(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generator_problem_p(v_object) : "sksi_reports_by_column.report_generator_problem_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_report_generator_problem(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $report_generator_problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_rg_problem_type(v_new, current_value);
            } else
                if (pcase_var.eql($DESCRIPTION)) {
                    _csetf_rg_problem_description(v_new, current_value);
                } else
                    if (pcase_var.eql($PHYSICAL_FIELD)) {
                        _csetf_rg_problem_physical_field(v_new, current_value);
                    } else {
                        Errors.error($str72$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_report_generator_problem(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REPORT_GENERATOR_PROBLEM, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, rg_problem_type(obj));
        funcall(visitor_fn, obj, $SLOT, $DESCRIPTION, rg_problem_description(obj));
        funcall(visitor_fn, obj, $SLOT, $PHYSICAL_FIELD, rg_problem_physical_field(obj));
        funcall(visitor_fn, obj, $END, MAKE_REPORT_GENERATOR_PROBLEM, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_report_generator_problem_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_report_generator_problem(obj, visitor_fn);
    }

    public static SubLObject print_report_generator_problem(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str108$_REPORT_GENERATOR_PROBLEM_);
        return v_object;
    }

    public static SubLObject new_report_generator_problem(final SubLObject type, final SubLObject description, final SubLObject physical_field) {
        final SubLObject problem = make_report_generator_problem(UNPROVIDED);
        _csetf_rg_problem_type(problem, type);
        _csetf_rg_problem_description(problem, description);
        _csetf_rg_problem_physical_field(problem, physical_field);
        return problem;
    }

    public static SubLObject report_generator_problem_type(final SubLObject problem) {
        assert NIL != report_generator_problem_p(problem) : "sksi_reports_by_column.report_generator_problem_p(problem) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generator_problem_p(problem) " + problem;
        return rg_problem_type(problem);
    }

    public static SubLObject report_generator_problem_description(final SubLObject problem) {
        assert NIL != report_generator_problem_p(problem) : "sksi_reports_by_column.report_generator_problem_p(problem) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generator_problem_p(problem) " + problem;
        return rg_problem_description(problem);
    }

    public static SubLObject report_generator_problem_physical_field(final SubLObject problem) {
        assert NIL != report_generator_problem_p(problem) : "sksi_reports_by_column.report_generator_problem_p(problem) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generator_problem_p(problem) " + problem;
        return rg_problem_physical_field(problem);
    }

    public static SubLObject sxhash_report_generator_problem_method(final SubLObject v_object) {
        return sxhash_report_generator_problem(v_object);
    }

    public static SubLObject sxhash_report_generator_problem(final SubLObject problem) {
        return Sxhash.sxhash(rg_problem_type(problem));
    }

    public static SubLObject report_generation_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_report_generation_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject report_generation_state_p(final SubLObject v_object) {
        return v_object.getClass() == $report_generation_state_native.class ? T : NIL;
    }

    public static SubLObject rg_state_ks(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rg_state_range(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rg_state_mt(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rg_state_pf_iterator(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rg_state_iterations(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rg_state_merged_props(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rg_state_results_table(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rg_state_executed_queries(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject rg_state_report_generator(final SubLObject v_object) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_rg_state_ks(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rg_state_range(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rg_state_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rg_state_pf_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rg_state_iterations(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rg_state_merged_props(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rg_state_results_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rg_state_executed_queries(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rg_state_report_generator(final SubLObject v_object, final SubLObject value) {
        assert NIL != report_generation_state_p(v_object) : "sksi_reports_by_column.report_generation_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_report_generation_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $report_generation_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($KS)) {
                _csetf_rg_state_ks(v_new, current_value);
            } else
                if (pcase_var.eql($RANGE)) {
                    _csetf_rg_state_range(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_rg_state_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($PF_ITERATOR)) {
                            _csetf_rg_state_pf_iterator(v_new, current_value);
                        } else
                            if (pcase_var.eql($ITERATIONS)) {
                                _csetf_rg_state_iterations(v_new, current_value);
                            } else
                                if (pcase_var.eql($MERGED_PROPS)) {
                                    _csetf_rg_state_merged_props(v_new, current_value);
                                } else
                                    if (pcase_var.eql($RESULTS_TABLE)) {
                                        _csetf_rg_state_results_table(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($EXECUTED_QUERIES)) {
                                            _csetf_rg_state_executed_queries(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($REPORT_GENERATOR)) {
                                                _csetf_rg_state_report_generator(v_new, current_value);
                                            } else {
                                                Errors.error($str72$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_report_generation_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REPORT_GENERATION_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $KS, rg_state_ks(obj));
        funcall(visitor_fn, obj, $SLOT, $RANGE, rg_state_range(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, rg_state_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PF_ITERATOR, rg_state_pf_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $ITERATIONS, rg_state_iterations(obj));
        funcall(visitor_fn, obj, $SLOT, $MERGED_PROPS, rg_state_merged_props(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULTS_TABLE, rg_state_results_table(obj));
        funcall(visitor_fn, obj, $SLOT, $EXECUTED_QUERIES, rg_state_executed_queries(obj));
        funcall(visitor_fn, obj, $SLOT, $REPORT_GENERATOR, rg_state_report_generator(obj));
        funcall(visitor_fn, obj, $END, MAKE_REPORT_GENERATION_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_report_generation_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_report_generation_state(obj, visitor_fn);
    }

    public static SubLObject print_report_generation_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str148$_REPORT_GENERATION_STATE_);
        return v_object;
    }

    public static SubLObject new_report_generation_state(final SubLObject ks, final SubLObject range, final SubLObject mt, final SubLObject pf_iterator, final SubLObject iterations, final SubLObject merged_props, final SubLObject results_table, final SubLObject executed_queries, final SubLObject report_generator) {
        final SubLObject state = make_report_generation_state(UNPROVIDED);
        _csetf_rg_state_ks(state, ks);
        _csetf_rg_state_range(state, range);
        _csetf_rg_state_mt(state, mt);
        _csetf_rg_state_pf_iterator(state, pf_iterator);
        _csetf_rg_state_iterations(state, iterations);
        _csetf_rg_state_merged_props(state, merged_props);
        _csetf_rg_state_results_table(state, results_table);
        _csetf_rg_state_executed_queries(state, executed_queries);
        _csetf_rg_state_report_generator(state, report_generator);
        return state;
    }

    public static SubLObject report_generation_state_ks(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_ks(state);
    }

    public static SubLObject report_generation_state_range(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_range(state);
    }

    public static SubLObject report_generation_state_mt(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_mt(state);
    }

    public static SubLObject report_generation_state_pf_iterator(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_pf_iterator(state);
    }

    public static SubLObject report_generation_state_iterations(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_iterations(state);
    }

    public static SubLObject report_generation_state_merged_props(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_merged_props(state);
    }

    public static SubLObject report_generation_state_results_table(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_results_table(state);
    }

    public static SubLObject report_generation_state_executed_queries(final SubLObject state) {
        assert NIL != report_generation_state_p(state) : "sksi_reports_by_column.report_generation_state_p(state) " + "CommonSymbols.NIL != sksi_reports_by_column.report_generation_state_p(state) " + state;
        return rg_state_executed_queries(state);
    }

    public static SubLObject sxhash_report_generation_state_method(final SubLObject v_object) {
        return sxhash_report_generation_state(v_object);
    }

    public static SubLObject sxhash_report_generation_state(final SubLObject state) {
        return Sxhash.sxhash(rg_state_ks(state));
    }

    public static SubLObject make_report_generation_iterator_state(final SubLObject report_props, final SubLObject report_generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject range_spec = list_utilities.plist_lookup(report_props, $COLUMN_RANGE, UNPROVIDED);
        final SubLObject mt = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        SubLObject results_table = NIL;
        SubLObject executed_queries = NIL;
        SubLObject state = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pfs = apply_range_specifier_to_sequence(sksi_report_generation.reportgen_schema_field_list(ks), range_spec);
            final SubLObject merged_props = merge_in_default_overriding_properties(report_props);
            results_table = misc_utilities.uninitialized();
            executed_queries = NIL;
            state = new_report_generation_state(ks, range_spec, mt, pfs, ZERO_INTEGER, merged_props, results_table, executed_queries, report_generator);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return state;
    }

    public static SubLObject report_generation_iterator_done_p(final SubLObject state) {
        return makeBoolean((NIL != misc_utilities.initialized_p(rg_state_results_table(state))) && (NIL != iteration.iteration_done(rg_state_pf_iterator(state))));
    }

    public static SubLObject report_generation_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pfs = rg_state_pf_iterator(state);
        final SubLObject n = rg_state_iterations(state);
        SubLObject results_table = rg_state_results_table(state);
        final SubLObject merged_props = rg_state_merged_props(state);
        final SubLObject ks = list_utilities.plist_lookup(merged_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject report_generator = rg_state_report_generator(state);
        final SubLObject executed_queries = rg_state_executed_queries(state);
        format(T, $str150$Executed_queries_state___s__, rg_state_executed_queries(state));
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL == misc_utilities.initialized_p(rg_state_results_table(state))) {
                SubLObject error_message = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            results_table = initialized_report_hashtable_new(merged_props);
                            _csetf_rg_state_results_table(state, results_table);
                            pfs = iteration.new_list_iterator(pfs);
                            _csetf_rg_state_pf_iterator(state, pfs);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error_message) {
                    Errors.warn(error_message);
                    report_generator_note_problem(report_generator, NIL, error_message, NIL, UNPROVIDED);
                }
            }
            final SubLObject pf = iteration.iteration_next(pfs);
            _csetf_rg_state_executed_queries(state, add_final_column_answers_to_hashtable(results_table, pf, n, merged_props, report_generator, executed_queries));
            if ((NIL != report_generation_iterator_done_p(state)) && (NIL != kb_mapping_utilities.fpred_value_in_any_mt(ks, $$databaseForReportGeneratorOutput, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                persist_hashtable_in_database(results_table, ks);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _csetf_rg_state_iterations(state, add(rg_state_iterations(state), ONE_INTEGER));
        return values(results_table, state, NIL);
    }

    public static SubLObject replace_with_null(final SubLObject input) {
        if (input.equal($str7$)) {
            return $NULL;
        }
        return input;
    }

    public static SubLObject persist_hashtable_in_database(final SubLObject hashtable, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rg_ls = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$logicalSchemaSourceMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject rg_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, $const155$reportGeneratorLogicalSchemaToNat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rg_field_list = kb_mapping_utilities.fpred_value_in_any_mt(rg_ps, $$schemaFieldNameList, UNPROVIDED, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject db_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, $const157$reportGeneratorLogicalSchemaToDat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject db_table_name = kb_mapping_utilities.fpred_value_in_any_mt(db_ps, $$schemaName_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject db_ks = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$databaseForReportGeneratorOutput, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject csql_statement = list($INTO, list(list($TABLE, db_table_name)));
        SubLObject field_list = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rg_ls)) {
            Errors.error($str161$Could_not_find_logicalSchemaSourc, ks);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rg_ps)) {
            Errors.error($str162$Could_not_find_reportGeneratorLog, rg_ps);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rg_field_list)) {
            Errors.error($str163$Could_not_find_schemaFieldNameLis, rg_ps);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == db_ps)) {
            Errors.error($str164$Could_not_find_reportGeneratorLog, rg_ls);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == db_table_name)) {
            Errors.error($str165$Could_not_find_schemaName_SKS_for, db_ps);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == db_ks)) {
            Errors.error($str166$Could_not_find_databaseForReportG, ks);
        }
        SubLObject cdolist_list_var = rg_field_list;
        SubLObject rg_field_elem = NIL;
        rg_field_elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rg_lfi = kb_mapping_utilities.pred_u_v_holds_tuples($$logicalFieldValueWithFieldName, rg_ls, rg_field_elem, $list168, UNPROVIDED, UNPROVIDED, UNPROVIDED).first().first();
            final SubLObject db_pfi = kb_mapping_utilities.pred_u_v_w_holds_tuples($$fieldEncodingPFIAndLFI, db_ps, rg_ls, rg_lfi, $list170, ONE_INTEGER, THREE_INTEGER, FOUR_INTEGER, UNPROVIDED).first().first();
            final SubLObject db_col_name = kb_mapping_utilities.pred_u_v_holds_tuples($const171$physicalSchemaFieldIndexicalWithN, db_ps, db_pfi, $list168, UNPROVIDED, UNPROVIDED, UNPROVIDED).first().first();
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rg_lfi)) {
                Errors.error($str172$Could_not_find_logicalFieldValueW, rg_ls, rg_field_elem);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == db_pfi)) {
                Errors.error($str173$Could_not_find_fieldEncodingPFIAn, db_ps, rg_ls, rg_lfi);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == db_col_name)) {
                Errors.error($str174$Could_not_find_physicalSchemaFiel, db_ps, db_pfi);
            }
            field_list = cons(list($FIELD, db_col_name), field_list);
            cdolist_list_var = cdolist_list_var.rest();
            rg_field_elem = cdolist_list_var.first();
        } 
        field_list = reverse(field_list);
        format(T, $str176$___S, field_list);
        format(T, $str177$RG_field_list_____S__, rg_field_list);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                SubLObject csql_statement_mod = NIL;
                SubLObject insert_values = NIL;
                format(T, $str178$Value___S__, value);
                SubLObject cdolist_list_var2 = rg_field_list;
                SubLObject a_field = NIL;
                a_field = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    insert_values = cons(list_utilities.plist_lookup(value, make_keyword(Strings.string_upcase(a_field, UNPROVIDED, UNPROVIDED)), UNPROVIDED), insert_values);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    a_field = cdolist_list_var2.first();
                } 
                csql_statement_mod = list($INSERT, csql_statement, field_list, list($VALUES, Mapping.mapcar(REPLACE_WITH_NULL, reverse(insert_values))));
                format(T, $str182$New_hash_table___S__, csql_statement_mod);
                sksi_sks_interaction.sksi_execute_csql_in_mapping_mt(db_ks, csql_statement_mod);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject run_batch_reports_from_definition_file(final SubLObject filename) {
        final SubLObject definition = read_batch_definition_from_file(filename);
        run_batch_reports_from_definition(definition);
        return filename;
    }

    public static SubLObject run_batch_reports_from_definition(final SubLObject definition) {
        final SubLObject global_props = get_global_batch_report_props_from_definition(definition);
        SubLObject cdolist_list_var;
        final SubLObject report_props_alist = cdolist_list_var = get_batch_properties_for_all_reports_from_definition(definition);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject props = NIL;
            destructuring_bind_must_consp(current, datum, $list185);
            key = current.first();
            current = props = current.rest();
            props = list_utilities.merge_plist(global_props, props);
            report_by_column_to_file(props);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject read_batch_definition_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject definition = NIL;
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
                Errors.error($str35$Unable_to_open__S, filename);
            }
            final SubLObject in_stream = stream;
            definition = read_ignoring_errors(in_stream, UNPROVIDED, UNPROVIDED);
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
        return definition;
    }

    public static SubLObject get_global_batch_report_props_from_definition(final SubLObject definition) {
        return list_utilities.plist_lookup(definition, $GLOBAL, UNPROVIDED);
    }

    public static SubLObject get_batch_properties_for_all_reports_from_definition(final SubLObject definition) {
        final SubLObject just_reports = remf(copy_list(definition), $GLOBAL);
        final SubLObject report_identifiers = Mapping.mapcar(SYMBOL_NAME, list_utilities.plist_keys(just_reports));
        final SubLObject report_values = list_utilities.plist_values(just_reports);
        return pairlis(report_identifiers, report_values, UNPROVIDED);
    }

    public static SubLObject apply_range_specifier_to_sequence(final SubLObject seq, final SubLObject range_spec) {
        return list_utilities.sequence_elements(seq, parse_number_range_specifier(range_spec, number_utilities.f_1_(length(seq))));
    }

    public static SubLObject parse_number_range_specifier(SubLObject spec, SubLObject last) {
        if (last == UNPROVIDED) {
            last = NIL;
        }
        if (NIL != last) {
            spec = list_utilities.tree_substitute(spec, NIL, last);
        }
        final SubLObject list_var = spec;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != range_specifier_item_p(elem) : "sksi_reports_by_column.range_specifier_item_p(elem) " + "CommonSymbols.NIL != sksi_reports_by_column.range_specifier_item_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return Mapping.mapcan(symbol_function(EXPAND_RANGE_SPECIFIER_ITEM), spec, EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static SubLObject range_specifier_item_p(final SubLObject item) {
        if (NIL != subl_promotions.non_negative_integer_p(item)) {
            return T;
        }
        if (NIL != list_utilities.doubletonP(item)) {
            final SubLObject start = item.first();
            final SubLObject end = second(item);
            return makeBoolean(((NIL != subl_promotions.non_negative_integer_p(start)) && (NIL != subl_promotions.non_negative_integer_p(end))) && end.numGE(start));
        }
        return NIL;
    }

    public static SubLObject expand_range_specifier_item(final SubLObject item) {
        assert NIL != range_specifier_item_p(item) : "sksi_reports_by_column.range_specifier_item_p(item) " + "CommonSymbols.NIL != sksi_reports_by_column.range_specifier_item_p(item) " + item;
        if (item.isAtom()) {
            return list(item);
        }
        final SubLObject start = item.first();
        final SubLObject end = second(item);
        return list_utilities.new_num_list(number_utilities.f_1X(subtract(end, start)), start);
    }

    public static SubLObject gafs_from_ks_internal(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = sksi_report_generation.reportgen_schema_field_list(ks);
            SubLObject pf = NIL;
            pf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                gafs = cons(query_lfi_gaf_from_pf(pf, ks), gafs);
                cdolist_list_var = cdolist_list_var.rest();
                pf = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return gafs;
    }

    public static SubLObject gafs_from_ks(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return gafs_from_ks_internal(ks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GAFS_FROM_KS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GAFS_FROM_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GAFS_FROM_KS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(gafs_from_ks_internal(ks)));
            memoization_state.caching_state_put(caching_state, ks, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject initialized_report_hashtable(final SubLObject report_props, SubLObject physical_fields) {
        if (physical_fields == UNPROVIDED) {
            physical_fields = NIL;
        }
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        if (NIL == physical_fields) {
            physical_fields = sksi_report_generation.reportgen_schema_field_list(ks);
        }
        final SubLObject hashtable = hash_table_utilities.hash_list_elements(all_selected_entities(report_props), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                sethash(key, hashtable, make_vector(length(physical_fields), $rgbc_initial_value_for_pfs$.getGlobalValue()));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }

    public static SubLObject initialized_report_hashtable_new(final SubLObject report_props) {
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject rg_ls = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$logicalSchemaSourceMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject rg_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, $const155$reportGeneratorLogicalSchemaToNat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pfi_field_name_tuple = kb_mapping_utilities.pred_value_tuples(rg_ps, $$physicalSchemaFieldWithName, ONE_INTEGER, $list194, UNPROVIDED);
        final SubLObject pfi_list = kb_mapping_utilities.fpred_value(rg_ps, $$schemaFieldList, UNPROVIDED, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject field_name_list = kb_mapping_utilities.fpred_value(rg_ps, $$schemaFieldNameList, UNPROVIDED, UNPROVIDED, UNPROVIDED).rest();
        SubLObject default_values = NIL;
        SubLObject cdolist_list_var = pfi_list;
        SubLObject a_pfi = NIL;
        a_pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            default_values = cons(rgbc_default_value_for_pf(a_pfi, query_lfi_gaf_from_pf(a_pfi, ks), report_props), default_values);
            cdolist_list_var = cdolist_list_var.rest();
            a_pfi = cdolist_list_var.first();
        } 
        default_values = reverse(default_values);
        format(T, $str196$Default_values___s__, default_values);
        final SubLObject hashtable = hash_table_utilities.hash_list_elements(all_selected_entities(report_props), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                sethash(key, hashtable, list_utilities.make_plist(Mapping.mapcar(MAKE_KEYWORD, Mapping.mapcar(STRING_UPCASE, field_name_list)), default_values));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }

    public static SubLObject add_final_column_answers_to_hashtable(final SubLObject hashtable, final SubLObject pf, final SubLObject column_num, final SubLObject report_props, final SubLObject report_generator, SubLObject executed_queries) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        SubLObject query_lfi_gaf = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    query_lfi_gaf = query_lfi_gaf_from_pf(pf, ks);
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
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, UNPROVIDED);
        SubLObject ks2 = NIL;
        SubLObject lfi1 = NIL;
        SubLObject column_query = NIL;
        destructuring_bind_must_consp(current, datum, $list197);
        ks2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list197);
        lfi1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list197);
        column_query = current.first();
        current = current.rest();
        if (NIL == current) {
            if (position(column_query, executed_queries, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                return executed_queries;
            }
            executed_queries = cons(column_query, executed_queries);
            if (NIL == query_lfi_gaf) {
                if (NIL != error_message) {
                    report_generator_note_problem(report_generator, column_num, error_message, pf, UNPROVIDED);
                    Errors.warn(error_message);
                }
                return hashtable;
            }
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject closed_queryP = sksi_report_generation.query_lfi_gaf_for_closed_queryP(query_lfi_gaf);
                        final SubLObject logical_true = sksi_report_generation.convert_to_boolean_kb_constant(T);
                        final SubLObject raw_answer_dictionary = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                        format(T, $str198$Hashtable_contents_before___);
                        hash_table_utilities.printhash(hashtable, UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject answers = run_modified_query_for_answer_list_multiple_io(report_props, query_lfi_gaf);
                        final SubLObject halt_reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (halt_reason != $EXHAUST_TOTAL) {
                            report_generator_note_problem(report_generator, column_num, princ_to_string(halt_reason), pf, $ABNORMAL_HALT_REASON);
                        }
                        SubLObject cdolist_list_var = answers;
                        SubLObject v_answer = NIL;
                        v_answer = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject key = unpack_column_answer(v_answer, closed_queryP, logical_true);
                            final SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            format(T, $str201$Property_list___s___, list_utilities.property_list_p(value.first()));
                            dictionary_utilities.dictionary_pushnew(raw_answer_dictionary, key, value, symbol_function(EQUALP), UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_answer = cdolist_list_var.first();
                        } 
                        format(T, $str202$Dictionary_Contents____);
                        dictionary_utilities.print_dictionary_contents(raw_answer_dictionary, UNPROVIDED);
                        store_encoded_answers_new(hashtable, raw_answer_dictionary, ks);
                        fill_in_default_values_for_report_column(hashtable, pf, column_num, query_lfi_gaf, report_props);
                        format(T, $str203$Hashtable_contents_after__);
                        hash_table_utilities.printhash(hashtable, UNPROVIDED);
                        format(T, $str204$_________________________________);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_message) {
                report_generator_note_problem(report_generator, column_num, error_message, pf, UNPROVIDED);
                Errors.warn(error_message);
            }
        } else {
            cdestructuring_bind_error(datum, $list197);
        }
        return executed_queries;
    }

    public static SubLObject store_encoded_answers_new(final SubLObject hashtable, final SubLObject raw_answer_dictionary, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rg_ls = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$logicalSchemaSourceMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject rg_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, $const155$reportGeneratorLogicalSchemaToNat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rg_lfi_to_rg_pfi_map = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples($$fieldEncodingPFIAndLFI, rg_ps, rg_ls, $list205, ONE_INTEGER, THREE_INTEGER, UNPROVIDED));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(raw_answer_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject res_row = value.first().first();
            SubLObject store_row = gethash(key, hashtable, UNPROVIDED);
            format(T, $str206$dict_key___s__, key);
            format(T, $str207$Result_plist___s__, res_row);
            format(T, $str208$Store_row___s__, store_row);
            SubLObject cdolist_list_var = list_utilities.plist_keys(res_row);
            SubLObject res_plist_key = NIL;
            res_plist_key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str209$_s___, list_utilities.plist_lookup(res_row, res_plist_key, UNPROVIDED));
                final SubLObject res_elem = list_utilities.plist_lookup(res_row, res_plist_key, UNPROVIDED);
                final SubLObject result = res_elem.first();
                final SubLObject rg_lfi = second(res_elem);
                final SubLObject rg_pfi = gethash(rg_lfi, rg_lfi_to_rg_pfi_map, UNPROVIDED).first();
                final SubLObject rg_pf = kb_mapping_utilities.fpred_value_in_any_mt(rg_pfi, $$indexicalForPhysicalField, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                SubLObject encoded_value = NIL;
                format(T, $str211$Result____s__, result);
                format(T, $str212$RG_LFI____s__, rg_lfi);
                format(T, $str213$RG_PFI____s__, rg_pfi);
                format(T, $str214$RG_PF____s__, rg_pf);
                thread.resetMultipleValues();
                final SubLObject encoding_expression = sksi_report_generation.reportgen_encoding_expression_from_physical_field(rg_pf, ks);
                final SubLObject collect_multiple_valuesP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                format(T, $str215$encoding_expression____s__, encoding_expression);
                encoded_value = encode_logical_answer(list(result), NIL, collect_multiple_valuesP, rg_pf, ks, encoding_expression);
                format(T, $str216$encoded_value____s__, encoded_value);
                if (NIL != list_utilities.property_list_p(store_row)) {
                    store_row = putf(store_row, res_plist_key, encoded_value);
                }
                cdolist_list_var = cdolist_list_var.rest();
                res_plist_key = cdolist_list_var.first();
            } 
            format(T, $str217$Store_row__after____s__, store_row);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject store_encoded_answers(final SubLObject raw_answer_dictionary, final SubLObject hashtable, final SubLObject pf, final SubLObject column_num, final SubLObject report_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject clobber_multiple_valuesP = list_utilities.plist_lookup(report_props, $kw218$CLOBBER_MULTIPLE_VALUES_, UNPROVIDED);
        SubLObject any_multiplesP = NIL;
        thread.resetMultipleValues();
        final SubLObject encoding_expression = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        final SubLObject collect_multiple_valuesP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(raw_answer_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject logical_values = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject curr_vector = gethash(key, hashtable, UNPROVIDED);
            final SubLObject physical_value = encode_logical_answer(logical_values, clobber_multiple_valuesP, collect_multiple_valuesP, pf, ks, encoding_expression);
            format(T, $str219$vectorp___S__curr_vector___S__col, new SubLObject[]{ vectorp(curr_vector), curr_vector, column_num, physical_value });
            if (curr_vector.isVector()) {
                set_aref(curr_vector, column_num, physical_value);
            }
            if ((NIL == clobber_multiple_valuesP) && (NIL != list_utilities.lengthG(logical_values, ONE_INTEGER, UNPROVIDED))) {
                any_multiplesP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return any_multiplesP;
    }

    public static SubLObject encode_logical_answer(final SubLObject logical_values, final SubLObject clobber_multiple_valuesP, final SubLObject collect_multiple_valuesP, final SubLObject pf, final SubLObject ks, final SubLObject encoding_expression) {
        if (NIL != collect_multiple_valuesP) {
            final SubLObject logical_value = make_el_formula($$TheSet, logical_values, UNPROVIDED);
            final SubLObject physical_value = apply_encoding_for_pf(pf, logical_value, ks, encoding_expression);
            return physical_value;
        }
        if ((NIL != clobber_multiple_valuesP) && (NIL != list_utilities.lengthG(logical_values, ONE_INTEGER, UNPROVIDED))) {
            return $MULTIPLE_ANSWERS;
        }
        final SubLObject logical_value = logical_values.first();
        final SubLObject physical_value = apply_encoding_for_pf(pf, logical_value, ks, UNPROVIDED);
        return physical_value;
    }

    public static SubLObject unpack_column_answer(final SubLObject v_answer, final SubLObject closed_queryP, final SubLObject logical_true) {
        if (NIL != closed_queryP) {
            return values(v_answer.first(), v_answer.rest());
        }
        return values(v_answer.first(), v_answer.rest());
    }

    public static SubLObject warn_about_multiple_values(final SubLObject query_lfi_gaf) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, UNPROVIDED);
        SubLObject ks = NIL;
        SubLObject lfi = NIL;
        SubLObject final_query = NIL;
        destructuring_bind_must_consp(current, datum, $list222);
        ks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list222);
        lfi = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list222);
        final_query = current.first();
        current = current.rest();
        if (NIL == current) {
            Errors.warn($str223$Some_rows_unexpectedly_returned_m, final_query, lfi, kb_query.kbq_sentence(final_query));
        } else {
            cdestructuring_bind_error(datum, $list222);
        }
        return NIL;
    }

    public static SubLObject apply_encoding_for_pf_internal(final SubLObject pf, final SubLObject logical_value, final SubLObject ks, SubLObject expr) {
        if (expr == UNPROVIDED) {
            expr = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        }
        final SubLObject lfi = sksi_report_generation.encoding_logical_field_indexical(expr);
        return my_sksi_apply_encoding_and_reformulate(list(bq_cons(lfi, logical_value)), expr, ks);
    }

    public static SubLObject apply_encoding_for_pf(final SubLObject pf, final SubLObject logical_value, final SubLObject ks, SubLObject expr) {
        if (expr == UNPROVIDED) {
            expr = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return apply_encoding_for_pf_internal(pf, logical_value, ks, expr);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, APPLY_ENCODING_FOR_PF, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), APPLY_ENCODING_FOR_PF, FOUR_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, APPLY_ENCODING_FOR_PF, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pf, logical_value, ks, expr);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pf.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_value.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ks.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && expr.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(apply_encoding_for_pf_internal(pf, logical_value, ks, expr)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pf, logical_value, ks, expr));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject my_sksi_apply_encoding_and_reformulate(final SubLObject alist, final SubLObject encoding, final SubLObject sks) {
        final SubLObject result = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, UNPROVIDED);
        return result;
    }

    public static SubLObject rgbc_compute_modified_query_properties(final SubLObject query_spec, final SubLObject report_props) {
        final SubLObject new_properties = list_utilities.merge_plist(kb_query.kbq_query_properties(query_spec), query_properties_from_report_properties(report_props));
        return new_properties;
    }

    public static SubLObject run_modified_query_for_answer_list(final SubLObject report_props, final SubLObject query_lfi_gaf) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, UNPROVIDED);
        SubLObject ks = NIL;
        SubLObject lfi = NIL;
        SubLObject column_query = NIL;
        destructuring_bind_must_consp(current, datum, $list225);
        ks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list225);
        lfi = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list225);
        column_query = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject ks_$10 = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks_$10);
            if (NIL != source_template) {
                final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf($const226$kSVariantHasFieldQueryWFocalArgPo, ks_$10, lfi, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != gaf) {
                    column_query = assertions_high.gaf_arg4(gaf);
                }
            }
            final SubLObject selection_sentence = list_utilities.plist_lookup(report_props, $SELECTION_SENTENCE, UNPROVIDED);
            SubLObject current_$12;
            final SubLObject datum_$11 = current_$12 = create_modified_query_sentence(selection_sentence, column_query, ks);
            SubLObject new_entity_var = NIL;
            SubLObject new_sentence = NIL;
            destructuring_bind_must_consp(current_$12, datum_$11, $list228);
            new_entity_var = current_$12.first();
            current_$12 = current_$12.rest();
            destructuring_bind_must_consp(current_$12, datum_$11, $list228);
            new_sentence = current_$12.first();
            current_$12 = current_$12.rest();
            if (NIL == current_$12) {
                final SubLObject final_answer_argpos = kb_mapping_utilities.fpred_value_in_any_mt(column_query, $const229$queryHasFocalOutputVariablePositi, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject template = (NIL != sksi_report_generation.query_lfi_gaf_for_closed_queryP(query_lfi_gaf)) ? new_entity_var : bq_cons(new_entity_var, cycl_utilities.formula_cycl_arg_position(kb_query.kbq_sentence(column_query), final_answer_argpos, UNPROVIDED));
                return my_rgbc_query_template(template, new_sentence, kb_query.kbq_mt(column_query), rgbc_compute_modified_query_properties(column_query, report_props), column_query, lfi);
            }
            cdestructuring_bind_error(datum_$11, $list228);
        } else {
            cdestructuring_bind_error(datum, $list225);
        }
        return NIL;
    }

    public static SubLObject run_modified_query_for_answer_list_multiple_io(final SubLObject report_props, final SubLObject query_lfi_gaf) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, UNPROVIDED);
        SubLObject ks = NIL;
        SubLObject lfi = NIL;
        SubLObject column_query = NIL;
        destructuring_bind_must_consp(current, datum, $list225);
        ks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list225);
        lfi = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list225);
        column_query = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject ks_$13 = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks_$13);
            if (NIL != source_template) {
                final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf($const226$kSVariantHasFieldQueryWFocalArgPo, ks_$13, lfi, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != gaf) {
                    column_query = assertions_high.gaf_arg4(gaf);
                }
            }
            final SubLObject selection_sentence = list_utilities.plist_lookup(report_props, $SELECTION_SENTENCE, UNPROVIDED);
            final SubLObject query_output_hash = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples($const230$queryHasFocalOutputVariablePositi, column_query, ks, $list205, ONE_INTEGER, THREE_INTEGER, UNPROVIDED));
            final SubLObject lfi_input_hash = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples($const231$kSHasQueryOutputIndexicalForLogic, ks, column_query, $list232, ONE_INTEGER, THREE_INTEGER, UNPROVIDED));
            SubLObject final_answer_var_list = NIL;
            SubLObject field_name_list = NIL;
            SubLObject key_lfi = NIL;
            SubLObject value_lfi = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(lfi_input_hash);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key_lfi = getEntryKey(cdohash_entry);
                    value_lfi = getEntryValue(cdohash_entry);
                    SubLObject answer_argpos = NIL;
                    answer_argpos = gethash(value_lfi.first(), query_output_hash, UNPROVIDED);
                    if (NIL != sksi_report_generation.query_lfi_gaf_for_closed_queryP(query_lfi_gaf)) {
                        final_answer_var_list = cons(list($$True, key_lfi), final_answer_var_list);
                    } else {
                        final_answer_var_list = cons(list(cycl_utilities.formula_cycl_arg_position(kb_query.kbq_sentence(column_query), answer_argpos.first(), UNPROVIDED), key_lfi), final_answer_var_list);
                    }
                    field_name_list = cons(Strings.string_upcase(kb_mapping_utilities.fpred_value_in_any_mt(key_lfi, $$logicalFieldValueWithFieldName, THREE_INTEGER, TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED), field_name_list);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            format(T, $str233$Answer_var_list___s___, final_answer_var_list);
            format(T, $str234$Field_name_list___s___, field_name_list);
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = create_modified_query_sentence_multiple_io(report_props, selection_sentence, column_query, ks);
            SubLObject new_entity_var = NIL;
            SubLObject new_sentence = NIL;
            destructuring_bind_must_consp(current_$15, datum_$14, $list228);
            new_entity_var = current_$15.first();
            current_$15 = current_$15.rest();
            destructuring_bind_must_consp(current_$15, datum_$14, $list228);
            new_sentence = current_$15.first();
            current_$15 = current_$15.rest();
            if (NIL == current_$15) {
                final SubLObject final_answer_argpos = gethash(gethash(lfi, lfi_input_hash, UNPROVIDED).first(), query_output_hash, UNPROVIDED);
                final SubLObject template = list(new_entity_var, list_utilities.make_plist(Mapping.mapcar(MAKE_KEYWORD, field_name_list), final_answer_var_list));
                format(T, $str209$_s___, final_answer_argpos);
                format(T, $str235$Modified_Column_Query___S___, new_sentence);
                return my_rgbc_query_template(template, new_sentence, kb_query.kbq_mt(column_query), rgbc_compute_modified_query_properties(column_query, report_props), column_query, lfi);
            }
            cdestructuring_bind_error(datum_$14, $list228);
        } else {
            cdestructuring_bind_error(datum, $list225);
        }
        return NIL;
    }

    public static SubLObject report_generator_query_for_physical_field(final SubLObject report_generator, final SubLObject pf) {
        final SubLObject report_props = report_generator_full_report_props(report_generator);
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        final SubLObject query_lfi_gaf = query_lfi_gaf_from_pf(pf, ks);
        final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, UNPROVIDED);
        SubLObject ks_$16 = NIL;
        SubLObject lfi = NIL;
        SubLObject column_query = NIL;
        destructuring_bind_must_consp(current, datum, $list225);
        ks_$16 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list225);
        lfi = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list225);
        column_query = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != source_template) {
                final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf($const226$kSVariantHasFieldQueryWFocalArgPo, ks_$16, lfi, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != gaf) {
                    column_query = assertions_high.gaf_arg4(gaf);
                }
            }
            return column_query;
        }
        cdestructuring_bind_error(datum, $list225);
        return NIL;
    }

    public static SubLObject my_rgbc_query_template(final SubLObject template, final SubLObject sentence, final SubLObject mt, final SubLObject props, SubLObject query_spec, SubLObject lfi) {
        if (query_spec == UNPROVIDED) {
            query_spec = NIL;
        }
        if (lfi == UNPROVIDED) {
            lfi = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.query_template(template, sentence, mt, props);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == results) || (halt_reason != $EXHAUST_TOTAL)) {
            Errors.warn($str236$Query_halted_unusually_with__D_re, new SubLObject[]{ length(results), halt_reason, query_spec, lfi, sentence, mt, props });
        }
        return values(results, halt_reason);
    }

    public static SubLObject create_modified_query_sentence(SubLObject selection_sentence, final SubLObject query_spec, final SubLObject ks) {
        selection_sentence = maybe_augment_selection_sentence_with_base_query(selection_sentence, ks);
        final SubLObject original_sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject entity_argpos = kb_mapping_utilities.fpred_value_in_any_mt(query_spec, $const237$queryHasFocalInputVariablePositio, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject free_var_from_selection_sentence = sentence_free_variables(selection_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        final SubLObject free_var_from_query_sentence = cycl_utilities.formula_cycl_arg_position(original_sentence, entity_argpos, UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(selection_sentence, original_sentence), UNPROVIDED);
        return list(new_var, simplifier.conjoin(list(cycl_utilities.expression_subst(new_var, free_var_from_selection_sentence, selection_sentence, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_subst(new_var, free_var_from_query_sentence, original_sentence, UNPROVIDED, UNPROVIDED)), UNPROVIDED));
    }

    public static SubLObject create_modified_query_sentence_multiple_io(final SubLObject report_props, SubLObject selection_sentence, final SubLObject query_spec, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        selection_sentence = copy_tree(maybe_augment_selection_sentence_with_base_query(selection_sentence, ks));
        SubLObject original_sentence = copy_tree(kb_query.kbq_sentence(query_spec));
        final SubLObject query_input_hash = tuple_to_map(kb_mapping_utilities.pred_value_tuples_in_any_mt(query_spec, $const238$queryHasFocalInputVariablePositio, ONE_INTEGER, $list205, UNPROVIDED));
        final SubLObject selection_specification = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$baseQueryForReportType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject selection_output_list = kb_mapping_utilities.pred_u_v_holds_tuples($const230$queryHasFocalOutputVariablePositi, selection_specification, ks, $list205, ONE_INTEGER, THREE_INTEGER, UNPROVIDED);
        final SubLObject selection_output_hash = tuple_to_map(selection_output_list);
        SubLObject var_list = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!hash_table_count(selection_output_hash).equal(hash_table_count(query_input_hash)))) {
            Errors.error($str240$Number_of_selection_inputs_not_eq);
        }
        selection_sentence = replace_inputs_in_selection_sentence(selection_sentence, selection_specification, ks, report_props);
        format(T, $str241$key_selection___value_selection__);
        SubLObject cdolist_list_var = selection_output_list;
        SubLObject key_selection = NIL;
        key_selection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value_query = gethash(key_selection.first(), query_input_hash, UNPROVIDED);
            final SubLObject value_selection = gethash(key_selection.first(), selection_output_hash, UNPROVIDED);
            SubLObject new_var = NIL;
            if (NIL != value_query) {
                new_var = czer_utilities.unique_el_var_wrt_expression(list(selection_sentence, original_sentence), UNPROVIDED);
                selection_sentence = cycl_utilities.cycl_arg_position_nsubst(new_var, value_selection.first(), selection_sentence);
                original_sentence = cycl_utilities.cycl_arg_position_nsubst(new_var, value_query.first(), original_sentence);
                var_list = cons(new_var, var_list);
            }
            format(T, $str242$_S__S__S__S___S__, new SubLObject[]{ key_selection.first(), value_selection, value_query, var_list, selection_output_list });
            cdolist_list_var = cdolist_list_var.rest();
            key_selection = cdolist_list_var.first();
        } 
        return list(var_list, simplifier.conjoin(list(selection_sentence, original_sentence), UNPROVIDED));
    }

    public static SubLObject replace_inputs_in_selection_sentence(SubLObject selection_sentence, final SubLObject selection_specification, final SubLObject ks, final SubLObject report_props) {
        final SubLObject selection_input_hash = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples($const238$queryHasFocalInputVariablePositio, selection_specification, ks, $list205, ONE_INTEGER, THREE_INTEGER, UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject selection_input_replacements = cdolist_list_var = maybe_selection_sentence_replacements(list_utilities.plist_lookup(report_props, $SELECTION_SENTENCE_INPUT_LIST, UNPROVIDED), selection_specification);
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            selection_sentence = cycl_utilities.cycl_arg_position_nsubst(second(element), gethash(element.first(), selection_input_hash, UNPROVIDED).first(), selection_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return selection_sentence;
    }

    public static SubLObject maybe_selection_sentence_replacements(final SubLObject selection_input_replacements, final SubLObject selection_specification) {
        final SubLObject replacements_from_kb = kb_mapping_utilities.pred_value_tuples_in_any_mt(selection_specification, $$queryHasInputIndexicalMapping, ONE_INTEGER, $list194, UNPROVIDED);
        if ((NIL != replacements_from_kb) && (NIL == selection_input_replacements)) {
            return replacements_from_kb;
        }
        return Mapping.mapcar(CANONICALIZE_TERM, second(selection_input_replacements));
    }

    public static SubLObject tuple_to_map(final SubLObject tuple) {
        final SubLObject map_of_tuple = make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = tuple;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(elem.first(), second(elem), map_of_tuple);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        format(T, $str246$Tuple_to_map__);
        hash_table_utilities.printhash(map_of_tuple, UNPROVIDED);
        return map_of_tuple;
    }

    public static SubLObject maybe_augment_selection_sentence_with_base_query(final SubLObject selection_sentence, final SubLObject ks) {
        final SubLObject base_query = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$baseQueryForReportType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        if ((NIL != base_query) && (NIL == selection_sentence)) {
            return kb_query.kbq_sentence(base_query);
        }
        return selection_sentence;
    }

    public static SubLObject get_selection_sentence_from_ks(final SubLObject ks) {
        if (NIL != ks) {
            final SubLObject base_query = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$baseQueryForReportType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            if (NIL != base_query) {
                return kb_query.kbq_sentence(base_query);
            }
        }
        return NIL;
    }

    public static SubLObject fill_in_default_values_for_report_column(final SubLObject hashtable, final SubLObject pf, final SubLObject n, final SubLObject gaf, final SubLObject report_props) {
        final SubLObject default_answer = rgbc_default_value_for_pf(pf, gaf, report_props);
        return hashtable;
    }

    public static SubLObject rgbc_default_value_for_pf(final SubLObject pf, final SubLObject gaf, final SubLObject report_props) {
        final SubLObject ps = sksi_kb_accessors.physical_field_schema(pf);
        if (NIL == sksi_kb_accessors.null_default_physical_field_valueP(pf, ps)) {
            return sksi_kb_accessors.physical_field_default_value(pf, ps, UNPROVIDED);
        }
        if ((NIL != gaf) && (NIL != sksi_report_generation.query_lfi_gaf_for_closed_queryP(gaf))) {
            return apply_encoding_for_pf(pf, sksi_report_generation.convert_to_boolean_kb_constant(NIL), list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED), UNPROVIDED);
        }
        return list_utilities.plist_lookup(report_props, $PLACEHOLDER, UNPROVIDED);
    }

    public static SubLObject test_default_value_for_pf(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = sksi_kb_accessors.physical_schema_sk_sources(sksi_kb_accessors.physical_field_schema(pf)).first();
        SubLObject value = NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            value = rgbc_default_value_for_pf(pf, query_lfi_gaf_from_pf(pf, ks), list($REPORT_KNOWLEDGE_SOURCE, ks, $PLACEHOLDER, $str30$_));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return value;
    }

    public static SubLObject sentence_with_one_free_var_p(final SubLObject obj) {
        return list_utilities.exactly_one_distinct_memberP(sentence_free_variables(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject all_selected_entities(final SubLObject report_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, $REPORT_KNOWLEDGE_SOURCE, UNPROVIDED);
        SubLObject selection_sentence = list_utilities.plist_lookup(report_props, $SELECTION_SENTENCE, UNPROVIDED);
        SubLObject entities = NIL;
        final SubLObject queries = all_queries_from_ks(ks);
        SubLObject successP = NIL;
        if (NIL == selection_sentence) {
            selection_sentence = copy_tree(get_selection_sentence_from_ks(ks));
        }
        if (NIL == successP) {
            SubLObject csome_list_var = queries;
            SubLObject some_query = NIL;
            some_query = csome_list_var.first();
            while ((NIL == successP) && (NIL != csome_list_var)) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            SubLObject query_properties = rgbc_compute_modified_query_properties(some_query, report_props);
                            final SubLObject current_max_time = inference_datastructures_enumerated_types.inference_properties_max_time(query_properties);
                            final SubLObject selection_spec = kb_mapping_utilities.fpred_value_in_any_mt(ks, $$baseQueryForReportType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                            final SubLObject selection_output_list = kb_mapping_utilities.pred_u_v_holds_tuples($const230$queryHasFocalOutputVariablePositi, selection_spec, ks, $list170, ONE_INTEGER, THREE_INTEGER, UNPROVIDED);
                            SubLObject selection_vars = NIL;
                            selection_sentence = replace_inputs_in_selection_sentence(selection_sentence, selection_spec, ks, report_props);
                            SubLObject cdolist_list_var = selection_output_list;
                            SubLObject var_pos = NIL;
                            var_pos = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                selection_vars = cons(cycl_utilities.formula_cycl_arg_position(selection_sentence, var_pos.first(), UNPROVIDED), selection_vars);
                                format(T, $str250$var_pos_var_selection_vars_select);
                                format(T, $str251$_S__S__S__S__, new SubLObject[]{ var_pos, cycl_utilities.formula_cycl_arg_position(selection_sentence, var_pos.first(), UNPROVIDED), selection_vars, selection_output_list });
                                cdolist_list_var = cdolist_list_var.rest();
                                var_pos = cdolist_list_var.first();
                            } 
                            if (NIL != current_max_time) {
                                query_properties = putf(query_properties, $MAX_TIME, multiply($all_selected_entities_time_multiplier$.getDynamicValue(thread), current_max_time));
                            }
                            entities = my_rgbc_query_template(selection_vars, selection_sentence, kb_query.kbq_mts(some_query).first(), query_properties, UNPROVIDED, UNPROVIDED);
                            successP = T;
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
                csome_list_var = csome_list_var.rest();
                some_query = csome_list_var.first();
            } 
        }
        if (NIL == successP) {
            Errors.error($str252$Failed_to_find_entities_for_repor, ks, queries);
        }
        return entities;
    }

    public static SubLObject get_report_queries_query_sentence(final SubLObject ks, final SubLObject query_var) {
        return list($$and, list($$logicalSchemaSourceMap, $sym254$_LS, ks), $list255, list($const256$kSHasQueryForLogicalFieldIndexica, ks, $sym257$_LFI, query_var));
    }

    public static SubLObject a_possibly_open_query_from_ks(final SubLObject ks, SubLObject open_requiredP) {
        if (open_requiredP == UNPROVIDED) {
            open_requiredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject params = $list258;
        final SubLObject query_var = $sym259$_QUERY;
        final SubLObject find_query_sentence = get_report_queries_query_sentence(ks, query_var);
        SubLObject results = ask_utilities.query_variable(query_var, listS($$and, find_query_sentence, listS($const229$queryHasFocalOutputVariablePositi, query_var, $list260), $list261), mt, params);
        if ((NIL != list_utilities.empty_list_p(results)) && (NIL == open_requiredP)) {
            results = ask_utilities.query_variable(query_var, find_query_sentence, mt, params);
        }
        if (NIL == results) {
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks);
            if (NIL != source_template) {
                final SubLObject var = a_possibly_open_query_from_ks(source_template, open_requiredP);
                if (NIL != var) {
                    results = cons(var, results);
                }
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == results)) {
            Errors.error($str262$Can_t_find_any_useful_queries_ass, ks);
        }
        return results.first();
    }

    public static SubLObject all_queries_from_ks(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_var = $sym259$_QUERY;
        final SubLObject find_query_sentence = get_report_queries_query_sentence(ks, query_var);
        SubLObject results = ask_utilities.query_variable(query_var, find_query_sentence, sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED), UNPROVIDED);
        if (NIL != list_utilities.empty_list_p(results)) {
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks);
            if (NIL != source_template) {
                results = all_queries_from_ks(source_template);
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == results)) {
            Errors.error($str262$Can_t_find_any_useful_queries_ass, ks);
        }
        return results;
    }

    public static SubLObject reportgen_lfi_from_pf(final SubLObject pf, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enc_expr = NIL;
        SubLObject lfi = NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            enc_expr = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
            lfi = sksi_report_generation.encoding_logical_field_indexical(enc_expr);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lfi;
    }

    public static SubLObject query_lfi_gaf_from_pf(final SubLObject pf, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lfi = NIL;
        SubLObject bgaf = NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            lfi = reportgen_lfi_from_pf(pf, ks);
            bgaf = sksi_report_generation.query_lfi_gaf_from_logical_indexical(lfi, ks);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return bgaf;
    }

    public static SubLObject default_report_properties() {
        return copy_list($default_report_properties$.getGlobalValue());
    }

    public static SubLObject run_report_test_specification(final SubLObject test_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = kb_mapping_utilities.fpred_value_in_any_mt(test_spec, $$sksOfReportTest, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject was_sks_registeredP = eq($REG, sksi_sks_manager.sks_registration_state(sks));
        SubLObject successP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        if (NIL == was_sks_registeredP) {
                            sksi_removal_module_generation.register_sksi_removal_modules_for_sks(sks, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            final SubLObject pred_var = $$requiredAssertionForReportTest;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, NIL, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            SubLObject done_var_$18 = NIL;
                                            final SubLObject token_var_$19 = NIL;
                                            while (NIL == done_var_$18) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                                final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(gaf));
                                                if (NIL != valid_$20) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = assertions_high.gaf_args(gaf).rest();
                                                    SubLObject mt = NIL;
                                                    SubLObject bin_pred = NIL;
                                                    SubLObject arg_2_value = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list281);
                                                    mt = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list281);
                                                    bin_pred = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list281);
                                                    arg_2_value = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        SubLObject foundP = NIL;
                                                        final SubLObject _prev_bind_0_$18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$22 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                                            mt_relevance_macros.$mt$.bind(mt, thread);
                                                            final SubLObject pred_var_$23 = bin_pred;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, NIL, pred_var_$23)) {
                                                                final SubLObject iterator_var_$24 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, NIL, pred_var_$23);
                                                                SubLObject done_var_$19 = NIL;
                                                                final SubLObject token_var_$20 = NIL;
                                                                while (NIL == done_var_$19) {
                                                                    final SubLObject final_index_spec_$27 = iteration.iteration_next_without_values_macro_helper(iterator_var_$24, token_var_$20);
                                                                    final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(final_index_spec_$27));
                                                                    if (NIL != valid_$21) {
                                                                        SubLObject final_index_iterator_$29 = NIL;
                                                                        try {
                                                                            final_index_iterator_$29 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$27, $GAF, NIL, NIL);
                                                                            SubLObject done_var_$20 = NIL;
                                                                            final SubLObject token_var_$21 = NIL;
                                                                            while (NIL == done_var_$20) {
                                                                                final SubLObject bad_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$29, token_var_$21);
                                                                                final SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(bad_gaf));
                                                                                if (NIL != valid_$22) {
                                                                                    if (assertions_high.gaf_arg2(bad_gaf).equal(arg_2_value)) {
                                                                                        foundP = T;
                                                                                    } else {
                                                                                        fi.fi_unassert_int(assertions_high.gaf_formula(bad_gaf), assertions_high.assertion_mt(bad_gaf));
                                                                                    }
                                                                                }
                                                                                done_var_$20 = makeBoolean(NIL == valid_$22);
                                                                            } 
                                                                        } finally {
                                                                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                final SubLObject _values = getValuesAsVector();
                                                                                if (NIL != final_index_iterator_$29) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$29);
                                                                                }
                                                                                restoreValuesFromVector(_values);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$19 = makeBoolean(NIL == valid_$21);
                                                                } 
                                                            }
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$22, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                        if (NIL == foundP) {
                                                            fi.fi_assert_int(make_binary_formula(bin_pred, test_spec, arg_2_value), mt, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list281);
                                                    }
                                                }
                                                done_var_$18 = makeBoolean(NIL == valid_$20);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$17, thread);
                        }
                        final SubLObject report_spec_path = kb_mapping_utilities.fpred_value_in_any_mt(test_spec, $$pathnameForReportDefinition, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        run_batch_reports_from_definition_file(report_spec_path);
                        final SubLObject baseline_directory = kb_mapping_utilities.fpred_value_in_any_mt(test_spec, $$baselineDirectoryForReport, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject definition = read_batch_definition_from_file(report_spec_path);
                        final SubLObject global_props = get_global_batch_report_props_from_definition(definition);
                        final SubLObject output_directory = list_utilities.plist_lookup(global_props, $OUTPUT_DIRECTORY, UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            final SubLObject pred_var2 = $const285$reportTestComparesFilenamesWRTKey;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, NIL, pred_var2)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, NIL, pred_var2);
                                SubLObject done_var2 = NIL;
                                final SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                            SubLObject done_var_$21 = NIL;
                                            final SubLObject token_var_$22 = NIL;
                                            while (NIL == done_var_$21) {
                                                final SubLObject comparison_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                                final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(comparison_gaf));
                                                if (NIL != valid_$23) {
                                                    SubLObject current2;
                                                    final SubLObject datum2 = current2 = assertions_high.gaf_args(comparison_gaf).rest();
                                                    SubLObject baseline_filename = NIL;
                                                    SubLObject output_filename = NIL;
                                                    SubLObject key_column = NIL;
                                                    destructuring_bind_must_consp(current2, datum2, $list286);
                                                    baseline_filename = current2.first();
                                                    current2 = current2.rest();
                                                    destructuring_bind_must_consp(current2, datum2, $list286);
                                                    output_filename = current2.first();
                                                    current2 = current2.rest();
                                                    destructuring_bind_must_consp(current2, datum2, $list286);
                                                    key_column = current2.first();
                                                    current2 = current2.rest();
                                                    if (NIL == current2) {
                                                        verify_test_report_results(baseline_filename, baseline_directory, output_filename, output_directory, key_column);
                                                    } else {
                                                        cdestructuring_bind_error(datum2, $list286);
                                                    }
                                                }
                                                done_var_$21 = makeBoolean(NIL == valid_$23);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                } 
                            }
                            successP = T;
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            if (NIL == was_sks_registeredP) {
                                sksi_removal_module_generation.deregister_sksi_removal_modules_for_sks(sks, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                        }
                    }
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
        return values(successP, error_message);
    }

    public static SubLObject verify_test_report_results(final SubLObject baseline_filename, final SubLObject baseline_directory, final SubLObject output_filename, final SubLObject output_directory, final SubLObject key_column) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject output_file = absolute_path_from_absolute_or_relative(output_filename, output_directory);
        final SubLObject output_results = read_test_results_file(output_file, key_column);
        final SubLObject baseline_file = absolute_path_from_absolute_or_relative(baseline_filename, baseline_directory);
        final SubLObject baseline_results = read_test_results_file(baseline_file, key_column);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(baseline_results)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject baseline_row = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject output_row = dictionary.dictionary_lookup_without_values(output_results, key, NIL);
            if (!baseline_row.equalp(output_row)) {
                Errors.error($str287$Baseline_file___A__Test_output_fi, new SubLObject[]{ baseline_file, output_file, key, baseline_row, output_row });
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (dictionary.dictionary_length(output_results).numG(dictionary.dictionary_length(baseline_results))) {
            Errors.error($str288$_A___has__D_more_rows_than___A, output_file, subtract(dictionary.dictionary_length(output_results), dictionary.dictionary_length(baseline_results)), baseline_file);
        }
        return NIL;
    }

    public static SubLObject read_test_results_file(final SubLObject filename, final SubLObject key_column) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject results = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
        SubLObject key_column_number = NIL;
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
                Errors.error($str35$Unable_to_open__S, filename);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$41 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$41); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$41)) {
                    final SubLObject tokens = string_utilities.string_tokenize(line, $list289, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == key_column_number) {
                        key_column_number = position(key_column, tokens, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == key_column_number) {
                            key_column_number = position(string_utilities.quote_string(key_column, UNPROVIDED), tokens, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == key_column_number) {
                                Errors.error($str290$Can_t_find__S_in__S, key_column, line);
                            }
                        }
                    } else {
                        final SubLObject key = nth(key_column_number, tokens);
                        dictionary.dictionary_enter(results, key, tokens);
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
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
        return results;
    }

    public static SubLObject declare_sksi_reports_by_column_file() {
        declareMacro("with_text_file_or_null_stream", "WITH-TEXT-FILE-OR-NULL-STREAM");
        declareFunction("schedule_report", "SCHEDULE-REPORT", 2, 9, false);
        declareFunction("schedule_recurring_report", "SCHEDULE-RECURRING-REPORT", 2, 9, false);
        declareFunction("add_report_specification_to_scheduled_query", "ADD-REPORT-SPECIFICATION-TO-SCHEDULED-QUERY", 9, 0, false);
        declareFunction("get_report_specification_mt", "GET-REPORT-SPECIFICATION-MT", 0, 2, false);
        declareFunction("get_cycl_character", "GET-CYCL-CHARACTER", 1, 0, false);
        declareFunction("reports_directory", "REPORTS-DIRECTORY", 0, 0, false);
        declareFunction("url_to_retrieve_report_file", "URL-TO-RETRIEVE-REPORT-FILE", 1, 0, false);
        declareFunction("report_by_column_to_file", "REPORT-BY-COLUMN-TO-FILE", 1, 0, false);
        declareFunction("report_generator_run_report", "REPORT-GENERATOR-RUN-REPORT", 1, 1, false);
        declareFunction("parse_filename", "PARSE-FILENAME", 1, 0, false);
        declareFunction("report_by_column_to_stream", "REPORT-BY-COLUMN-TO-STREAM", 2, 0, false);
        declareFunction("output_report_by_column", "OUTPUT-REPORT-BY-COLUMN", 3, 0, false);
        declareFunction("report_property_p", "REPORT-PROPERTY-P", 1, 0, false);
        declareFunction("get_full_filename_for_report", "GET-FULL-FILENAME-FOR-REPORT", 1, 0, false);
        declareFunction("get_full_logfilename_for_report", "GET-FULL-LOGFILENAME-FOR-REPORT", 1, 0, false);
        declareFunction("construct_full_path_from_prop_values", "CONSTRUCT-FULL-PATH-FROM-PROP-VALUES", 3, 0, false);
        declareFunction("absolute_path_from_absolute_or_relative", "ABSOLUTE-PATH-FROM-ABSOLUTE-OR-RELATIVE", 2, 0, false);
        declareFunction("split_report_properties", "SPLIT-REPORT-PROPERTIES", 1, 0, false);
        declareFunction("query_properties_from_report_properties", "QUERY-PROPERTIES-FROM-REPORT-PROPERTIES", 1, 0, false);
        declareFunction("merge_in_default_overriding_properties", "MERGE-IN-DEFAULT-OVERRIDING-PROPERTIES", 1, 0, false);
        declareFunction("get_rgbc_overriding_properties", "GET-RGBC-OVERRIDING-PROPERTIES", 0, 0, false);
        declareFunction("add_to_rgbc_overriding_properties", "ADD-TO-RGBC-OVERRIDING-PROPERTIES", 1, 0, false);
        declareFunction("update_rgbc_max_time", "UPDATE-RGBC-MAX-TIME", 1, 0, false);
        declareFunction("reset_rgbc_overriding_properties", "RESET-RGBC-OVERRIDING-PROPERTIES", 0, 0, false);
        declareFunction("print_hashtable_of_vectors_as_delimited_lines", "PRINT-HASHTABLE-OF-VECTORS-AS-DELIMITED-LINES", 1, 2, false);
        declareFunction("print_hashtable_of_plists_as_delimited_lines", "PRINT-HASHTABLE-OF-PLISTS-AS-DELIMITED-LINES", 2, 2, false);
        declareFunction("new_report_generation_iterator", "NEW-REPORT-GENERATION-ITERATOR", 2, 0, false);
        declareFunction("report_generator_print_function_trampoline", "REPORT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("report_generator_p", "REPORT-GENERATOR-P", 1, 0, false);
        new sksi_reports_by_column.$report_generator_p$UnaryFunction();
        declareFunction("rg_full_report_props", "RG-FULL-REPORT-PROPS", 1, 0, false);
        declareFunction("rg_iterator", "RG-ITERATOR", 1, 0, false);
        declareFunction("rg_problems", "RG-PROBLEMS", 1, 0, false);
        declareFunction("_csetf_rg_full_report_props", "_CSETF-RG-FULL-REPORT-PROPS", 2, 0, false);
        declareFunction("_csetf_rg_iterator", "_CSETF-RG-ITERATOR", 2, 0, false);
        declareFunction("_csetf_rg_problems", "_CSETF-RG-PROBLEMS", 2, 0, false);
        declareFunction("make_report_generator", "MAKE-REPORT-GENERATOR", 0, 1, false);
        declareFunction("visit_defstruct_report_generator", "VISIT-DEFSTRUCT-REPORT-GENERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_report_generator_method", "VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-METHOD", 2, 0, false);
        declareFunction("print_report_generator", "PRINT-REPORT-GENERATOR", 3, 0, false);
        declareFunction("new_report_generator", "NEW-REPORT-GENERATOR", 1, 0, false);
        declareFunction("report_generator_full_report_props", "REPORT-GENERATOR-FULL-REPORT-PROPS", 1, 0, false);
        declareFunction("report_generator_iterator", "REPORT-GENERATOR-ITERATOR", 1, 0, false);
        declareFunction("report_generator_problems", "REPORT-GENERATOR-PROBLEMS", 1, 0, false);
        declareFunction("report_generator_problem_count", "REPORT-GENERATOR-PROBLEM-COUNT", 1, 0, false);
        declareMacro("report_generator_do_problems", "REPORT-GENERATOR-DO-PROBLEMS");
        declareFunction("report_generator_column_count", "REPORT-GENERATOR-COLUMN-COUNT", 1, 0, false);
        declareFunction("report_generator_problem_iterator", "REPORT-GENERATOR-PROBLEM-ITERATOR", 1, 0, false);
        declareFunction("report_generator_note_problem", "REPORT-GENERATOR-NOTE-PROBLEM", 4, 1, false);
        declareFunction("report_generator_guess_problem_type", "REPORT-GENERATOR-GUESS-PROBLEM-TYPE", 1, 0, false);
        declareFunction("sxhash_report_generator_method", "SXHASH-REPORT-GENERATOR-METHOD", 1, 0, false);
        declareFunction("sxhash_report_generator", "SXHASH-REPORT-GENERATOR", 1, 0, false);
        declareFunction("report_generator_problem_print_function_trampoline", "REPORT-GENERATOR-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("report_generator_problem_p", "REPORT-GENERATOR-PROBLEM-P", 1, 0, false);
        new sksi_reports_by_column.$report_generator_problem_p$UnaryFunction();
        declareFunction("rg_problem_type", "RG-PROBLEM-TYPE", 1, 0, false);
        declareFunction("rg_problem_description", "RG-PROBLEM-DESCRIPTION", 1, 0, false);
        declareFunction("rg_problem_physical_field", "RG-PROBLEM-PHYSICAL-FIELD", 1, 0, false);
        declareFunction("_csetf_rg_problem_type", "_CSETF-RG-PROBLEM-TYPE", 2, 0, false);
        declareFunction("_csetf_rg_problem_description", "_CSETF-RG-PROBLEM-DESCRIPTION", 2, 0, false);
        declareFunction("_csetf_rg_problem_physical_field", "_CSETF-RG-PROBLEM-PHYSICAL-FIELD", 2, 0, false);
        declareFunction("make_report_generator_problem", "MAKE-REPORT-GENERATOR-PROBLEM", 0, 1, false);
        declareFunction("visit_defstruct_report_generator_problem", "VISIT-DEFSTRUCT-REPORT-GENERATOR-PROBLEM", 2, 0, false);
        declareFunction("visit_defstruct_object_report_generator_problem_method", "VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-PROBLEM-METHOD", 2, 0, false);
        declareFunction("print_report_generator_problem", "PRINT-REPORT-GENERATOR-PROBLEM", 3, 0, false);
        declareFunction("new_report_generator_problem", "NEW-REPORT-GENERATOR-PROBLEM", 3, 0, false);
        declareFunction("report_generator_problem_type", "REPORT-GENERATOR-PROBLEM-TYPE", 1, 0, false);
        declareFunction("report_generator_problem_description", "REPORT-GENERATOR-PROBLEM-DESCRIPTION", 1, 0, false);
        declareFunction("report_generator_problem_physical_field", "REPORT-GENERATOR-PROBLEM-PHYSICAL-FIELD", 1, 0, false);
        declareFunction("sxhash_report_generator_problem_method", "SXHASH-REPORT-GENERATOR-PROBLEM-METHOD", 1, 0, false);
        declareFunction("sxhash_report_generator_problem", "SXHASH-REPORT-GENERATOR-PROBLEM", 1, 0, false);
        declareFunction("report_generation_state_print_function_trampoline", "REPORT-GENERATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("report_generation_state_p", "REPORT-GENERATION-STATE-P", 1, 0, false);
        new sksi_reports_by_column.$report_generation_state_p$UnaryFunction();
        declareFunction("rg_state_ks", "RG-STATE-KS", 1, 0, false);
        declareFunction("rg_state_range", "RG-STATE-RANGE", 1, 0, false);
        declareFunction("rg_state_mt", "RG-STATE-MT", 1, 0, false);
        declareFunction("rg_state_pf_iterator", "RG-STATE-PF-ITERATOR", 1, 0, false);
        declareFunction("rg_state_iterations", "RG-STATE-ITERATIONS", 1, 0, false);
        declareFunction("rg_state_merged_props", "RG-STATE-MERGED-PROPS", 1, 0, false);
        declareFunction("rg_state_results_table", "RG-STATE-RESULTS-TABLE", 1, 0, false);
        declareFunction("rg_state_executed_queries", "RG-STATE-EXECUTED-QUERIES", 1, 0, false);
        declareFunction("rg_state_report_generator", "RG-STATE-REPORT-GENERATOR", 1, 0, false);
        declareFunction("_csetf_rg_state_ks", "_CSETF-RG-STATE-KS", 2, 0, false);
        declareFunction("_csetf_rg_state_range", "_CSETF-RG-STATE-RANGE", 2, 0, false);
        declareFunction("_csetf_rg_state_mt", "_CSETF-RG-STATE-MT", 2, 0, false);
        declareFunction("_csetf_rg_state_pf_iterator", "_CSETF-RG-STATE-PF-ITERATOR", 2, 0, false);
        declareFunction("_csetf_rg_state_iterations", "_CSETF-RG-STATE-ITERATIONS", 2, 0, false);
        declareFunction("_csetf_rg_state_merged_props", "_CSETF-RG-STATE-MERGED-PROPS", 2, 0, false);
        declareFunction("_csetf_rg_state_results_table", "_CSETF-RG-STATE-RESULTS-TABLE", 2, 0, false);
        declareFunction("_csetf_rg_state_executed_queries", "_CSETF-RG-STATE-EXECUTED-QUERIES", 2, 0, false);
        declareFunction("_csetf_rg_state_report_generator", "_CSETF-RG-STATE-REPORT-GENERATOR", 2, 0, false);
        declareFunction("make_report_generation_state", "MAKE-REPORT-GENERATION-STATE", 0, 1, false);
        declareFunction("visit_defstruct_report_generation_state", "VISIT-DEFSTRUCT-REPORT-GENERATION-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_report_generation_state_method", "VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATION-STATE-METHOD", 2, 0, false);
        declareFunction("print_report_generation_state", "PRINT-REPORT-GENERATION-STATE", 3, 0, false);
        declareFunction("new_report_generation_state", "NEW-REPORT-GENERATION-STATE", 9, 0, false);
        declareFunction("report_generation_state_ks", "REPORT-GENERATION-STATE-KS", 1, 0, false);
        declareFunction("report_generation_state_range", "REPORT-GENERATION-STATE-RANGE", 1, 0, false);
        declareFunction("report_generation_state_mt", "REPORT-GENERATION-STATE-MT", 1, 0, false);
        declareFunction("report_generation_state_pf_iterator", "REPORT-GENERATION-STATE-PF-ITERATOR", 1, 0, false);
        declareFunction("report_generation_state_iterations", "REPORT-GENERATION-STATE-ITERATIONS", 1, 0, false);
        declareFunction("report_generation_state_merged_props", "REPORT-GENERATION-STATE-MERGED-PROPS", 1, 0, false);
        declareFunction("report_generation_state_results_table", "REPORT-GENERATION-STATE-RESULTS-TABLE", 1, 0, false);
        declareFunction("report_generation_state_executed_queries", "REPORT-GENERATION-STATE-EXECUTED-QUERIES", 1, 0, false);
        declareFunction("sxhash_report_generation_state_method", "SXHASH-REPORT-GENERATION-STATE-METHOD", 1, 0, false);
        declareFunction("sxhash_report_generation_state", "SXHASH-REPORT-GENERATION-STATE", 1, 0, false);
        declareFunction("make_report_generation_iterator_state", "MAKE-REPORT-GENERATION-ITERATOR-STATE", 2, 0, false);
        declareFunction("report_generation_iterator_done_p", "REPORT-GENERATION-ITERATOR-DONE-P", 1, 0, false);
        declareFunction("report_generation_iterator_next", "REPORT-GENERATION-ITERATOR-NEXT", 1, 0, false);
        declareFunction("replace_with_null", "REPLACE-WITH-NULL", 1, 0, false);
        declareFunction("persist_hashtable_in_database", "PERSIST-HASHTABLE-IN-DATABASE", 2, 0, false);
        declareFunction("run_batch_reports_from_definition_file", "RUN-BATCH-REPORTS-FROM-DEFINITION-FILE", 1, 0, false);
        declareFunction("run_batch_reports_from_definition", "RUN-BATCH-REPORTS-FROM-DEFINITION", 1, 0, false);
        declareFunction("read_batch_definition_from_file", "READ-BATCH-DEFINITION-FROM-FILE", 1, 0, false);
        declareFunction("get_global_batch_report_props_from_definition", "GET-GLOBAL-BATCH-REPORT-PROPS-FROM-DEFINITION", 1, 0, false);
        declareFunction("get_batch_properties_for_all_reports_from_definition", "GET-BATCH-PROPERTIES-FOR-ALL-REPORTS-FROM-DEFINITION", 1, 0, false);
        declareFunction("apply_range_specifier_to_sequence", "APPLY-RANGE-SPECIFIER-TO-SEQUENCE", 2, 0, false);
        declareFunction("parse_number_range_specifier", "PARSE-NUMBER-RANGE-SPECIFIER", 1, 1, false);
        declareFunction("range_specifier_item_p", "RANGE-SPECIFIER-ITEM-P", 1, 0, false);
        declareFunction("expand_range_specifier_item", "EXPAND-RANGE-SPECIFIER-ITEM", 1, 0, false);
        declareFunction("gafs_from_ks_internal", "GAFS-FROM-KS-INTERNAL", 1, 0, false);
        declareFunction("gafs_from_ks", "GAFS-FROM-KS", 1, 0, false);
        declareFunction("initialized_report_hashtable", "INITIALIZED-REPORT-HASHTABLE", 1, 1, false);
        declareFunction("initialized_report_hashtable_new", "INITIALIZED-REPORT-HASHTABLE-NEW", 1, 0, false);
        declareFunction("add_final_column_answers_to_hashtable", "ADD-FINAL-COLUMN-ANSWERS-TO-HASHTABLE", 6, 0, false);
        declareFunction("store_encoded_answers_new", "STORE-ENCODED-ANSWERS-NEW", 3, 0, false);
        declareFunction("store_encoded_answers", "STORE-ENCODED-ANSWERS", 5, 0, false);
        declareFunction("encode_logical_answer", "ENCODE-LOGICAL-ANSWER", 6, 0, false);
        declareFunction("unpack_column_answer", "UNPACK-COLUMN-ANSWER", 3, 0, false);
        declareFunction("warn_about_multiple_values", "WARN-ABOUT-MULTIPLE-VALUES", 1, 0, false);
        declareFunction("apply_encoding_for_pf_internal", "APPLY-ENCODING-FOR-PF-INTERNAL", 3, 1, false);
        declareFunction("apply_encoding_for_pf", "APPLY-ENCODING-FOR-PF", 3, 1, false);
        declareFunction("my_sksi_apply_encoding_and_reformulate", "MY-SKSI-APPLY-ENCODING-AND-REFORMULATE", 3, 0, false);
        declareFunction("rgbc_compute_modified_query_properties", "RGBC-COMPUTE-MODIFIED-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("run_modified_query_for_answer_list", "RUN-MODIFIED-QUERY-FOR-ANSWER-LIST", 2, 0, false);
        declareFunction("run_modified_query_for_answer_list_multiple_io", "RUN-MODIFIED-QUERY-FOR-ANSWER-LIST-MULTIPLE-IO", 2, 0, false);
        declareFunction("report_generator_query_for_physical_field", "REPORT-GENERATOR-QUERY-FOR-PHYSICAL-FIELD", 2, 0, false);
        declareFunction("my_rgbc_query_template", "MY-RGBC-QUERY-TEMPLATE", 4, 2, false);
        declareFunction("create_modified_query_sentence", "CREATE-MODIFIED-QUERY-SENTENCE", 3, 0, false);
        declareFunction("create_modified_query_sentence_multiple_io", "CREATE-MODIFIED-QUERY-SENTENCE-MULTIPLE-IO", 4, 0, false);
        declareFunction("replace_inputs_in_selection_sentence", "REPLACE-INPUTS-IN-SELECTION-SENTENCE", 4, 0, false);
        declareFunction("maybe_selection_sentence_replacements", "MAYBE-SELECTION-SENTENCE-REPLACEMENTS", 2, 0, false);
        declareFunction("tuple_to_map", "TUPLE-TO-MAP", 1, 0, false);
        declareFunction("maybe_augment_selection_sentence_with_base_query", "MAYBE-AUGMENT-SELECTION-SENTENCE-WITH-BASE-QUERY", 2, 0, false);
        declareFunction("get_selection_sentence_from_ks", "GET-SELECTION-SENTENCE-FROM-KS", 1, 0, false);
        declareFunction("fill_in_default_values_for_report_column", "FILL-IN-DEFAULT-VALUES-FOR-REPORT-COLUMN", 5, 0, false);
        declareFunction("rgbc_default_value_for_pf", "RGBC-DEFAULT-VALUE-FOR-PF", 3, 0, false);
        declareFunction("test_default_value_for_pf", "TEST-DEFAULT-VALUE-FOR-PF", 1, 0, false);
        declareFunction("sentence_with_one_free_var_p", "SENTENCE-WITH-ONE-FREE-VAR-P", 1, 0, false);
        declareFunction("all_selected_entities", "ALL-SELECTED-ENTITIES", 1, 0, false);
        declareFunction("get_report_queries_query_sentence", "GET-REPORT-QUERIES-QUERY-SENTENCE", 2, 0, false);
        declareFunction("a_possibly_open_query_from_ks", "A-POSSIBLY-OPEN-QUERY-FROM-KS", 1, 1, false);
        declareFunction("all_queries_from_ks", "ALL-QUERIES-FROM-KS", 1, 0, false);
        declareFunction("reportgen_lfi_from_pf", "REPORTGEN-LFI-FROM-PF", 2, 0, false);
        declareFunction("query_lfi_gaf_from_pf", "QUERY-LFI-GAF-FROM-PF", 2, 0, false);
        declareFunction("default_report_properties", "DEFAULT-REPORT-PROPERTIES", 0, 0, false);
        declareFunction("run_report_test_specification", "RUN-REPORT-TEST-SPECIFICATION", 1, 0, false);
        declareFunction("verify_test_report_results", "VERIFY-TEST-REPORT-RESULTS", 5, 0, false);
        declareFunction("read_test_results_file", "READ-TEST-RESULTS-FILE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_reports_by_column_file() {
        defconstant("*RGBC-DEFAULT-OVERRIDING-PROPERTIES*", $list46);
        defparameter("*RGBC-LOCKED-OVERRIDING-PROPERTIES*", $rgbc_default_overriding_properties$.getGlobalValue());
        deflexical("*RGBC-OVERRIDING-PROPERTIES-LOCK*", ReadWriteLocks.new_rw_lock($$$RGBC_OVERRIDING_PROPERTIES));
        defconstant("*DTP-REPORT-GENERATOR*", REPORT_GENERATOR);
        defconstant("*DTP-REPORT-GENERATOR-PROBLEM*", REPORT_GENERATOR_PROBLEM);
        defconstant("*DTP-REPORT-GENERATION-STATE*", REPORT_GENERATION_STATE);
        defconstant("*RGBC-INITIAL-VALUE-FOR-PFS*", NIL);
        defvar("*ALL-SELECTED-ENTITIES-TIME-MULTIPLIER*", THREE_INTEGER);
        deflexical("*REPORT-SPECIFIC-PROPERTIES*", $list263);
        deflexical("*DEFAULT-REPORT-PROPERTIES*", list(new SubLObject[]{ $DELIMITER, CHAR_comma, $COLUMN_RANGE, $list6, $PLACEHOLDER, $str7$, $kw218$CLOBBER_MULTIPLE_VALUES_, NIL, $LOG_STREAM, StreamsLow.$standard_output$.getDynamicValue() }));
        deflexical("*STS-SELECTION-SENTENCE*", list_utilities.plist_lookup($default_report_properties$.getGlobalValue(), $SELECTION_SENTENCE, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_sksi_reports_by_column_file() {
        register_external_symbol(SCHEDULE_REPORT);
        register_external_symbol(SCHEDULE_RECURRING_REPORT);
        register_external_symbol(REPORT_BY_COLUMN_TO_FILE);
        register_external_symbol(REPORT_BY_COLUMN_TO_STREAM);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_report_generator$.getGlobalValue(), symbol_function(REPORT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list62);
        def_csetf(RG_FULL_REPORT_PROPS, _CSETF_RG_FULL_REPORT_PROPS);
        def_csetf(RG_ITERATOR, _CSETF_RG_ITERATOR);
        def_csetf(RG_PROBLEMS, _CSETF_RG_PROBLEMS);
        identity(REPORT_GENERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_report_generator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_METHOD));
        note_funcall_helper_function(PRINT_REPORT_GENERATOR);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_report_generator$.getGlobalValue(), symbol_function(SXHASH_REPORT_GENERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_report_generator_problem$.getGlobalValue(), symbol_function(REPORT_GENERATOR_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list96);
        def_csetf(RG_PROBLEM_TYPE, _CSETF_RG_PROBLEM_TYPE);
        def_csetf(RG_PROBLEM_DESCRIPTION, _CSETF_RG_PROBLEM_DESCRIPTION);
        def_csetf(RG_PROBLEM_PHYSICAL_FIELD, _CSETF_RG_PROBLEM_PHYSICAL_FIELD);
        identity(REPORT_GENERATOR_PROBLEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_report_generator_problem$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_PROBLEM_METHOD));
        note_funcall_helper_function(PRINT_REPORT_GENERATOR_PROBLEM);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_report_generator_problem$.getGlobalValue(), symbol_function(SXHASH_REPORT_GENERATOR_PROBLEM_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_report_generation_state$.getGlobalValue(), symbol_function(REPORT_GENERATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list118);
        def_csetf(RG_STATE_KS, _CSETF_RG_STATE_KS);
        def_csetf(RG_STATE_RANGE, _CSETF_RG_STATE_RANGE);
        def_csetf(RG_STATE_MT, _CSETF_RG_STATE_MT);
        def_csetf(RG_STATE_PF_ITERATOR, _CSETF_RG_STATE_PF_ITERATOR);
        def_csetf(RG_STATE_ITERATIONS, _CSETF_RG_STATE_ITERATIONS);
        def_csetf(RG_STATE_MERGED_PROPS, _CSETF_RG_STATE_MERGED_PROPS);
        def_csetf(RG_STATE_RESULTS_TABLE, _CSETF_RG_STATE_RESULTS_TABLE);
        def_csetf(RG_STATE_EXECUTED_QUERIES, _CSETF_RG_STATE_EXECUTED_QUERIES);
        def_csetf(RG_STATE_REPORT_GENERATOR, _CSETF_RG_STATE_REPORT_GENERATOR);
        identity(REPORT_GENERATION_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_report_generation_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATION_STATE_METHOD));
        note_funcall_helper_function(PRINT_REPORT_GENERATION_STATE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_report_generation_state$.getGlobalValue(), symbol_function(SXHASH_REPORT_GENERATION_STATE_METHOD));
        register_external_symbol(RUN_BATCH_REPORTS_FROM_DEFINITION_FILE);
        register_external_symbol(RUN_BATCH_REPORTS_FROM_DEFINITION);
        memoization_state.note_memoized_function(GAFS_FROM_KS);
        memoization_state.note_memoized_function(APPLY_ENCODING_FOR_PF);
        define_test_case_table_int(APPLY_RANGE_SPECIFIER_TO_SEQUENCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list272);
        define_test_case_table_int(ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list274);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_reports_by_column_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_reports_by_column_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_reports_by_column_file();
    }

    static {















































































































































































































































































































    }

    public static final class $report_generator_native extends SubLStructNative {
        public SubLObject $full_report_props;

        public SubLObject $iterator;

        public SubLObject $problems;

        private static final SubLStructDeclNative structDecl;

        private $report_generator_native() {
            this.$full_report_props = Lisp.NIL;
            this.$iterator = Lisp.NIL;
            this.$problems = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$full_report_props;
        }

        @Override
        public SubLObject getField3() {
            return this.$iterator;
        }

        @Override
        public SubLObject getField4() {
            return this.$problems;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$full_report_props = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$iterator = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$problems = value;
        }

        static {
            structDecl = makeStructDeclNative($report_generator_native.class, REPORT_GENERATOR, REPORT_GENERATOR_P, $list56, $list57, new String[]{ "$full_report_props", "$iterator", "$problems" }, $list58, $list59, PRINT_REPORT_GENERATOR);
        }
    }

    public static final class $report_generator_p$UnaryFunction extends UnaryFunction {
        public $report_generator_p$UnaryFunction() {
            super(extractFunctionNamed("REPORT-GENERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return report_generator_p(arg1);
        }
    }

    public static final class $report_generator_problem_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $description;

        public SubLObject $physical_field;

        private static final SubLStructDeclNative structDecl;

        private $report_generator_problem_native() {
            this.$type = Lisp.NIL;
            this.$description = Lisp.NIL;
            this.$physical_field = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$description;
        }

        @Override
        public SubLObject getField4() {
            return this.$physical_field;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$description = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$physical_field = value;
        }

        static {
            structDecl = makeStructDeclNative($report_generator_problem_native.class, REPORT_GENERATOR_PROBLEM, REPORT_GENERATOR_PROBLEM_P, $list90, $list91, new String[]{ "$type", "$description", "$physical_field" }, $list92, $list93, PRINT_REPORT_GENERATOR_PROBLEM);
        }
    }

    public static final class $report_generator_problem_p$UnaryFunction extends UnaryFunction {
        public $report_generator_problem_p$UnaryFunction() {
            super(extractFunctionNamed("REPORT-GENERATOR-PROBLEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return report_generator_problem_p(arg1);
        }
    }

    public static final class $report_generation_state_native extends SubLStructNative {
        public SubLObject $ks;

        public SubLObject $range;

        public SubLObject $mt;

        public SubLObject $pf_iterator;

        public SubLObject $iterations;

        public SubLObject $merged_props;

        public SubLObject $results_table;

        public SubLObject $executed_queries;

        public SubLObject $report_generator;

        private static final SubLStructDeclNative structDecl;

        private $report_generation_state_native() {
            this.$ks = Lisp.NIL;
            this.$range = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$pf_iterator = Lisp.NIL;
            this.$iterations = Lisp.NIL;
            this.$merged_props = Lisp.NIL;
            this.$results_table = Lisp.NIL;
            this.$executed_queries = Lisp.NIL;
            this.$report_generator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$ks;
        }

        @Override
        public SubLObject getField3() {
            return this.$range;
        }

        @Override
        public SubLObject getField4() {
            return this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$pf_iterator;
        }

        @Override
        public SubLObject getField6() {
            return this.$iterations;
        }

        @Override
        public SubLObject getField7() {
            return this.$merged_props;
        }

        @Override
        public SubLObject getField8() {
            return this.$results_table;
        }

        @Override
        public SubLObject getField9() {
            return this.$executed_queries;
        }

        @Override
        public SubLObject getField10() {
            return this.$report_generator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$ks = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$range = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$pf_iterator = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$iterations = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$merged_props = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$results_table = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$executed_queries = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$report_generator = value;
        }

        static {
            structDecl = makeStructDeclNative($report_generation_state_native.class, REPORT_GENERATION_STATE, REPORT_GENERATION_STATE_P, $list112, $list113, new String[]{ "$ks", "$range", "$mt", "$pf_iterator", "$iterations", "$merged_props", "$results_table", "$executed_queries", "$report_generator" }, $list114, $list115, PRINT_REPORT_GENERATION_STATE);
        }
    }

    public static final class $report_generation_state_p$UnaryFunction extends UnaryFunction {
        public $report_generation_state_p$UnaryFunction() {
            super(extractFunctionNamed("REPORT-GENERATION-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return report_generation_state_p(arg1);
        }
    }
}

/**
 * Total time: 1472 ms
 */
