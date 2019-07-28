package com.cyc.cycjava.cycl.butler;


import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.butler.foil_export;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_suggestor;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.os_process_utilities;
import com.cyc.cycjava.cycl.reformulator_hub;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.rkf_contradiction_finder;
import com.cyc.cycjava.cycl.rkf_query_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.wff_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.butler.foil_export.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class foil_export extends SubLTranslatedFile {
    public static final SubLFile me = new foil_export();

    public static final String myName = "com.cyc.cycjava.cycl.butler.foil_export";

    public static final String myFingerPrint = "cd3858bb7b0138f02ba68c57bad038c6ab363753d6794f92a04ae984b993fcdc";

    // deflexical
    // Definitions
    private static final SubLSymbol $ilp_export_code_revision$ = makeSymbol("*ILP-EXPORT-CODE-REVISION*");

    // defparameter
    // If a predicate has an argIsa in this list, throw it out
    private static final SubLSymbol $bad_ilp_export_arg_types$ = makeSymbol("*BAD-ILP-EXPORT-ARG-TYPES*");

    // defparameter
    // stores the set of terms scheduled for ILP export
    private static final SubLSymbol $ilp_terms_to_export$ = makeSymbol("*ILP-TERMS-TO-EXPORT*");

    // defparameter
    // A list of collections that have been exported for induction.
    private static final SubLSymbol $ilp_export_collections$ = makeSymbol("*ILP-EXPORT-COLLECTIONS*");



    // defparameter
    public static final SubLSymbol $ilp_allow_focal_term_in_antecedent$ = makeSymbol("*ILP-ALLOW-FOCAL-TERM-IN-ANTECEDENT*");

    // defparameter
    private static final SubLSymbol $ilp_term_export_include_positive_examples$ = makeSymbol("*ILP-TERM-EXPORT-INCLUDE-POSITIVE-EXAMPLES*");

    // defparameter
    private static final SubLSymbol $ilp_term_export_include_negative_examples$ = makeSymbol("*ILP-TERM-EXPORT-INCLUDE-NEGATIVE-EXAMPLES*");

    // defparameter
    private static final SubLSymbol $ilp_term_export_generate_synthetic_negative_examples$ = makeSymbol("*ILP-TERM-EXPORT-GENERATE-SYNTHETIC-NEGATIVE-EXAMPLES*");



    // deflexical
    // The enumeration of styles we currently support.
    private static final SubLSymbol $known_ilp_export_styles$ = makeSymbol("*KNOWN-ILP-EXPORT-STYLES*");

    // deflexical
    private static final SubLSymbol $ilp_term_name_to_constant_map$ = makeSymbol("*ILP-TERM-NAME-TO-CONSTANT-MAP*");

    // deflexical
    private static final SubLSymbol $ilp_export_string_term_name_prefix$ = makeSymbol("*ILP-EXPORT-STRING-TERM-NAME-PREFIX*");







    // deflexical
    private static final SubLSymbol $aleph_export_background_knowledge_file_extension$ = makeSymbol("*ALEPH-EXPORT-BACKGROUND-KNOWLEDGE-FILE-EXTENSION*");

    // deflexical
    private static final SubLSymbol $aleph_export_positive_examples_file_extension$ = makeSymbol("*ALEPH-EXPORT-POSITIVE-EXAMPLES-FILE-EXTENSION*");

    // deflexical
    private static final SubLSymbol $aleph_export_negative_examples_file_extension$ = makeSymbol("*ALEPH-EXPORT-NEGATIVE-EXAMPLES-FILE-EXTENSION*");

    // defparameter
    /**
     * Will be T when ALEPH expects mode information (only in the background file).
     */
    private static final SubLSymbol $aleph_generate_mode_information$ = makeSymbol("*ALEPH-GENERATE-MODE-INFORMATION*");

    // defparameter
    // The max time parameter; if undefined, keep one from the KB.
    private static final SubLSymbol $ilp_export_mode_query_maxtime$ = makeSymbol("*ILP-EXPORT-MODE-QUERY-MAXTIME*");

    // deflexical
    /**
     * Query to use to compute which of the argument positions and collections
     * should be input in the mode declarations.
     */
    private static final SubLSymbol $ilp_export_input_modes_query$ = makeSymbol("*ILP-EXPORT-INPUT-MODES-QUERY*");

    // deflexical
    /**
     * Query to use to compute which of the argument positions and collections
     * should be output in the mode declarations.
     */
    private static final SubLSymbol $ilp_export_output_modes_query$ = makeSymbol("*ILP-EXPORT-OUTPUT-MODES-QUERY*");









    // defparameter
    private static final SubLSymbol $ilp_export_predicate_arg_constraints_dbase$ = makeSymbol("*ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE*");

    // deflexical
    private static final SubLSymbol $functional_predicate_in_argP_caching_state$ = makeSymbol("*FUNCTIONAL-PREDICATE-IN-ARG?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $ilp_export_negation_predicate_query_properties$ = makeSymbol("*ILP-EXPORT-NEGATION-PREDICATE-QUERY-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $ilp_export_negation_predicateP_caching_state$ = makeSymbol("*ILP-EXPORT-NEGATION-PREDICATE?-CACHING-STATE*");



    // defparameter
    /**
     * A dictionary of COLLECTION-P to list of FORT-P mappings that indicates the
     * collection extent being used in this export.
     */
    private static final SubLSymbol $ilp_export_type_to_instance_information$ = makeSymbol("*ILP-EXPORT-TYPE-TO-INSTANCE-INFORMATION*");

    // defparameter
    /**
     * A dictionary of FORT-P to list of COLLECTION-P mappings that indicate how the
     * term is being used in this export.
     */
    private static final SubLSymbol $ilp_export_instance_to_type_information$ = makeSymbol("*ILP-EXPORT-INSTANCE-TO-TYPE-INFORMATION*");









    // defvar
    private static final SubLSymbol $ilp_export_allow_variables_in_negative_examplesP$ = makeSymbol("*ILP-EXPORT-ALLOW-VARIABLES-IN-NEGATIVE-EXAMPLES?*");



    // deflexical
    private static final SubLSymbol $default_aleph_settings$ = makeSymbol("*DEFAULT-ALEPH-SETTINGS*");

    // defparameter
    /**
     * The predicate which wraps a rule that has been suggested but not reviewed.
     */
    private static final SubLSymbol $rule_suggestion_predicate$ = makeSymbol("*RULE-SUGGESTION-PREDICATE*");

    // defparameter
    // The Mt into which possible rules are suggested.
    private static final SubLSymbol $rule_suggestion_mt$ = makeSymbol("*RULE-SUGGESTION-MT*");

    // deflexical
    private static final SubLSymbol $foil_scratch_directory_name$ = makeSymbol("*FOIL-SCRATCH-DIRECTORY-NAME*");

    // deflexical
    /**
     * The name of the FOIL program that will be executed. @note this should be in
     * RED.
     */
    private static final SubLSymbol $foil_program_name$ = makeSymbol("*FOIL-PROGRAM-NAME*");

    // deflexical
    private static final SubLSymbol $foil_program_arguments$ = makeSymbol("*FOIL-PROGRAM-ARGUMENTS*");

    // defparameter
    private static final SubLSymbol $aleph_scratch_directory_name$ = makeSymbol("*ALEPH-SCRATCH-DIRECTORY-NAME*");

    // defparameter
    private static final SubLSymbol $aleph_induction_fileset_name$ = makeSymbol("*ALEPH-INDUCTION-FILESET-NAME*");

    // deflexical
    // When set to NIL, stops the FIND-GAFS-TO-OCCUPY-SELF-WITH-INDUCTION loop.
    private static final SubLSymbol $continue_searching_for_gafs_for_inductionP$ = makeSymbol("*CONTINUE-SEARCHING-FOR-GAFS-FOR-INDUCTION?*");

    // deflexical
    private static final SubLSymbol $aleph_home_directory_name$ = makeSymbol("*ALEPH-HOME-DIRECTORY-NAME*");

    // deflexical
    /**
     * The name of the ALEPH program that will be executed. @note this should be in
     * RED.
     */
    private static final SubLSymbol $aleph_program_name$ = makeSymbol("*ALEPH-PROGRAM-NAME*");

    // deflexical
    /**
     * Stack and heap size of the ALEPH program that will be executed. @note this
     * should be in RED.
     */
    private static final SubLSymbol $aleph_program_arguments$ = makeSymbol("*ALEPH-PROGRAM-ARGUMENTS*");

    // deflexical
    private static final SubLSymbol $aleph_command_list$ = makeSymbol("*ALEPH-COMMAND-LIST*");

    // deflexical
    private static final SubLSymbol $ilp_import_prolog_stop_characters$ = makeSymbol("*ILP-IMPORT-PROLOG-STOP-CHARACTERS*");

    private static final SubLString $str0$_Id__foil_export_lisp_138034_2012 = makeString("$Id: foil-export.lisp 138034 2012-01-07 12:59:52Z builder $");

    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("CycLSentence-Assertible")));

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    public static final SubLList $list5 = list(list(makeSymbol("*ILP-EXPORT-COLLECTIONS*"), NIL));



    public static final SubLList $list7 = list(list(makeSymbol("TERM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $ilp_terms_filter_from_extent$ = makeSymbol("*ILP-TERMS-FILTER-FROM-EXTENT*");



    public static final SubLList $list10 = list(makeSymbol("*ILP-TERMS-FILTER-FROM-EXTENT*"));

    public static final SubLList $list11 = list(list(makeSymbol("*ILP-TERM-EXPORT-INCLUDE-POSITIVE-EXAMPLES*"), NIL));

    public static final SubLList $list12 = list(list(makeSymbol("*ILP-TERM-EXPORT-INCLUDE-NEGATIVE-EXAMPLES*"), NIL));

    public static final SubLList $list13 = list(list(makeSymbol("*ILP-TERM-EXPORT-INCLUDE-NEGATIVE-EXAMPLES*"), T));

    public static final SubLList $list14 = list(list(makeSymbol("*ILP-TERM-EXPORT-GENERATE-SYNTHETIC-NEGATIVE-EXAMPLES*"), list(makeSymbol("NEW-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR"))));

    public static final SubLList $list15 = list(list(makeSymbol("*ILP-TERM-EXPORT-GENERATE-SYNTHETIC-NEGATIVE-EXAMPLES*"), NIL));

    private static final SubLObject $$ALEPH_ILPProgram = reader_make_constant_shell(makeString("ALEPH-ILPProgram"));

    public static final SubLList $list17 = list(reader_make_constant_shell(makeString("FOIL-ILPProgram")), reader_make_constant_shell(makeString("ALEPH-ILPProgram")));

    public static final SubLList $list18 = list(list(makeSymbol("STYLE")), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLList $list21 = list(makeSymbol("VALID-ILP-EXPORT-STYLE-P"));

    public static final SubLSymbol $ilp_export_style$ = makeSymbol("*ILP-EXPORT-STYLE*");



    public static final SubLList $list24 = list(makeSymbol("CURRENT-ILP-EXPORT-STYLE"));

    public static final SubLString $str25$____________________________ = makeString("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    public static final SubLString $str26$__ = makeString("% ");

    private static final SubLObject $$Percent = reader_make_constant_shell(makeString("Percent"));

    public static final SubLString $$$negative = makeString("negative");

    public static final SubLString $str29$_ = makeString("-");

    public static final SubLString $$$point = makeString("point");

    public static final SubLString $str31$_ = makeString(".");

    public static final SubLString $str32$__ = makeString("#$");

    public static final SubLString $str33$_ = makeString("'");

    public static final SubLString $str34$string_ = makeString("string_");

    public static final SubLString $str35$Some_ = makeString("Some_");



    public static final SubLString $$$continuous = makeString("continuous");

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    public static final SubLSymbol ILP_EXPORT_PRED_NAME_FOR_COLLECTION_CACHED = makeSymbol("ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED");

    private static final SubLObject $$FOIL_ILPProgram = reader_make_constant_shell(makeString("FOIL-ILPProgram"));

    public static final SubLString $str41$isa_ = makeString("isa_");

    public static final SubLSymbol $ilp_export_pred_name_for_collection_cached_caching_state$ = makeSymbol("*ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED-CACHING-STATE*");

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLSymbol $sym45$FORT__ = makeSymbol("FORT-<");



    private static final SubLString $str47$_ = makeString("_");

    private static final SubLList $list48 = list(list(makeSymbol("PREDICATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $ilp_export_inductive_target_predicate$ = makeSymbol("*ILP-EXPORT-INDUCTIVE-TARGET-PREDICATE*");

    private static final SubLList $list50 = list(list(makeSymbol("ARGPOS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $ilp_export_inductive_target_predicate_argpos$ = makeSymbol("*ILP-EXPORT-INDUCTIVE-TARGET-PREDICATE-ARGPOS*");

    private static final SubLString $str52$_b = makeString(".b");

    private static final SubLString $str53$_f = makeString(".f");

    private static final SubLString $str54$_n = makeString(".n");

    private static final SubLString $str55$_term_ = makeString("/term-");

    private static final SubLList $list56 = list(list(makeSymbol("*ALEPH-GENERATE-MODE-INFORMATION*"), T));

    public static final SubLList $list57 = list(list(makeSymbol("*ALEPH-GENERATE-MODE-INFORMATION*"), NIL));

    private static final SubLObject $$ILP_InputModeTemplate = reader_make_constant_shell(makeString("ILP-InputModeTemplate"));

    private static final SubLObject $$ILP_OutputModeTemplate = reader_make_constant_shell(makeString("ILP-OutputModeTemplate"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLSymbol GET_ILP_EXPORT_MODE_MARKER_FOR_STYLE = makeSymbol("GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE");



    private static final SubLObject $$programDenotesInputModeWith = reader_make_constant_shell(makeString("programDenotesInputModeWith"));



    private static final SubLObject $$programDenotesOutputModeWith = reader_make_constant_shell(makeString("programDenotesOutputModeWith"));

    private static final SubLString $str66$Unknown_Input_output_direction__A = makeString("Unknown Input/output direction ~A.");

    private static final SubLSymbol $get_ilp_export_mode_marker_for_style_caching_state$ = makeSymbol("*GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE-CACHING-STATE*");



    private static final SubLList $list69 = list(makeKeyword("CHARACTER"));

    private static final SubLObject $$ComputerSoftwareDataMt = reader_make_constant_shell(makeString("ComputerSoftwareDataMt"));

    private static final SubLList $list71 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), ONE_INTEGER);

    private static final SubLSymbol GET_ALL_ILP_EXPORT_MODE_MARKERS_FOR_STYLE_CACHED = makeSymbol("GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED");

    private static final SubLSymbol $get_all_ilp_export_mode_markers_for_style_cached_caching_state$ = makeSymbol("*GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED-CACHING-STATE*");

    private static final SubLList $list74 = list(makeSymbol("?TARGET-PRED"), makeSymbol("?FOCAL-ARG-NUM"), makeSymbol("?PREDS"));









    private static final SubLList $list79 = list(makeSymbol("?PRED"), makeSymbol("?ARG"), makeSymbol("?TYPE"));



    private static final SubLSymbol GET_ILP_EXPORT_INPUT_MODES_FOR_ARG_POSITION = makeSymbol("GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION");

    private static final SubLString $str82$Mt_for_finding_input_mode_query__ = makeString("Mt for finding input mode query: ~A~%");

    private static final SubLString $str83$Query_for_calulating_input_modes_ = makeString("Query for calulating input modes: ~A~%");

    private static final SubLString $str84$Query_properties_for_calculating_ = makeString("Query properties for calculating input modes: ~A~%");

    private static final SubLString $str85$Got_input_modes___A__ = makeString("Got input modes: ~A~%");

    private static final SubLSymbol $get_ilp_export_input_modes_for_arg_position_caching_state$ = makeSymbol("*GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION-CACHING-STATE*");

    private static final SubLSymbol GET_ILP_EXPORT_OUTPUT_MODES_FOR_ARG_POSITION = makeSymbol("GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION");

    private static final SubLString $str88$Mt_for_finding_output_mode_query_ = makeString("Mt for finding output mode query: ~A~%");

    private static final SubLString $str89$Query_for_calulating_output_modes = makeString("Query for calulating output modes: ~A~%");

    private static final SubLString $str90$Query_properties_for_calculating_ = makeString("Query properties for calculating output modes: ~A~%");

    private static final SubLString $str91$Got_output_modes___A__ = makeString("Got output modes: ~A~%");

    private static final SubLSymbol $get_ilp_export_output_modes_for_arg_position_caching_state$ = makeSymbol("*GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION-CACHING-STATE*");

    private static final SubLList $list93 = list(list(makeSymbol("*ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE*"), list(makeSymbol("NEW-ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE"))));

    public static final SubLList $list94 = cons(makeSymbol("ARGPOS"), makeSymbol("COLLECTION"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $sym96$FUNCTIONAL_PREDICATE_IN_ARG_ = makeSymbol("FUNCTIONAL-PREDICATE-IN-ARG?");

    private static final SubLObject $$functionalInArgs = reader_make_constant_shell(makeString("functionalInArgs"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $sym99$_FUNCTIONAL_PREDICATE_IN_ARG__CACHING_STATE_ = makeSymbol("*FUNCTIONAL-PREDICATE-IN-ARG?-CACHING-STATE*");

    private static final SubLObject $$IrreflexiveBinaryPredicate = reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));

    private static final SubLObject $$AsymmetricBinaryPredicate = reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    private static final SubLList $list103 = list(reader_make_constant_shell(makeString("minimizeExtent")), reader_make_constant_shell(makeString("completeExtentEnumerable")));

    public static final SubLList $list104 = list(new SubLObject[]{ makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(0x1e8480) });

    private static final SubLSymbol $sym105$ILP_EXPORT_NEGATION_PREDICATE_ = makeSymbol("ILP-EXPORT-NEGATION-PREDICATE?");

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    private static final SubLSymbol $sym107$_ILP_EXPORT_NEGATION_PREDICATE__CACHING_STATE_ = makeSymbol("*ILP-EXPORT-NEGATION-PREDICATE?-CACHING-STATE*");

    private static final SubLString $str108$_negative_examples_derived_from_p = makeString(" negative examples derived from positive examples ");

    private static final SubLList $list109 = list(list(makeSymbol("RULES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $ilp_export_known_rules$ = makeSymbol("*ILP-EXPORT-KNOWN-RULES*");

    private static final SubLSymbol NEW_ILP_EXPORT_KNOWN_RULE_SET = makeSymbol("NEW-ILP-EXPORT-KNOWN-RULE-SET");

    private static final SubLList $list112 = list(list(makeSymbol("*ILP-EXPORT-KNOWN-RULES*"), NIL));

    public static final SubLList $list113 = list(makeSymbol("IMPLIES"), makeSymbol("ANTECEDENT-CLAUSES"), makeSymbol("CONSEQUENT"));

    public static final SubLList $list114 = list(makeSymbol("AND"), makeSymbol("&REST"), makeSymbol("CLAUSES"));

    private static final SubLString $$$_pruning_rule_statements = makeString(" pruning rule statements");

    private static final SubLString $str116$prune__ = makeString("prune((");

    private static final SubLString $str117$_______ = makeString(")) :- !");

    private static final SubLString $str118$__var_ = makeString(", var(");

    private static final SubLString $str119$_ = makeString(")");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLString $str121$____ = makeString(" :- ");

    private static final SubLList $list122 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("CONJUNCTED-CLAUSES"));

    private static final SubLString $str123$__ = makeString(", ");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLString $str125$_ = makeString("(");

    private static final SubLList $list126 = list(list(makeSymbol("*ILP-EXPORT-TYPE-TO-INSTANCE-INFORMATION*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("*ILP-EXPORT-INSTANCE-TO-TYPE-INFORMATION*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP))));

    public static final SubLList $list127 = list(list(makeSymbol("TERM"), makeSymbol("TYPES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym128$DICTIONARY = makeUninternedSymbol("DICTIONARY");



    private static final SubLList $list130 = list(makeSymbol("GATHER-ILP-EXPORT-TYPE-AND-INSTANCE-INFORMATION?"));

    public static final SubLList $list131 = list(list(makeSymbol("CURRENT-ILP-EXPORT-TYPE-TO-INSTANCE-INFORMATION")));





    private static final SubLString $str134$_type_conversion_plug_definitions = makeString(" type conversion plug definitions ");

    private static final SubLString $$$_type_conversion_plug_extents_ = makeString(" type conversion plug extents ");

    private static final SubLList $list136 = cons(makeSymbol("FEMALE"), makeSymbol("MALE"));

    private static final SubLString $str137$___mode____ = makeString(":- mode(*, ");

    private static final SubLString $str138$_ = makeString(",");

    private static final SubLString $str139$___ = makeString(")).");

    private static final SubLString $str140$__ = makeString(").");

    private static final SubLSymbol ILP_EXPORT_CONVERSION_PLUG_NAME = makeSymbol("ILP-EXPORT-CONVERSION-PLUG-NAME");

    private static final SubLString $$$2 = makeString("2");

    private static final SubLString $$$Plug = makeString("Plug");

    private static final SubLSymbol $ilp_export_conversion_plug_name_caching_state$ = makeSymbol("*ILP-EXPORT-CONVERSION-PLUG-NAME-CACHING-STATE*");

    private static final SubLObject $$IsaPredFn = reader_make_constant_shell(makeString("IsaPredFn"));

    private static final SubLString $str146$Should_have_gotten__A_argument_po = makeString("Should have gotten ~A argument position ~A from DBase and failed to do so!");

    private static final SubLString $str147$_ = makeString("+");

    private static final SubLString $str148$Go_on_anyway_ = makeString("Go on anyway.");

    private static final SubLString $str149$We_did_not_get_a_mode_declaration = makeString("We did not get a mode declaration for term ~A.~%");



    private static final SubLString $$$modeh = makeString("modeh");

    private static final SubLString $$$modeb = makeString("modeb");

    private static final SubLString $str153$___ = makeString(":- ");

    public static final SubLString $str154$___ = makeString("(*,");

    private static final SubLString $str155$_a__a_ = makeString("~a(~a)");

    private static final SubLString $str156$_a_ = makeString("~a(");

    private static final SubLSymbol ILP_EXPORT_MODE_NAME_FOR_TERM = makeSymbol("ILP-EXPORT-MODE-NAME-FOR-TERM");

    private static final SubLSymbol $ilp_export_mode_name_for_term_caching_state$ = makeSymbol("*ILP-EXPORT-MODE-NAME-FOR-TERM-CACHING-STATE*");



    private static final SubLString $str160$false____ = makeString("false :- ");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol $sym162$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str163$Unable_to_export_assertion__ = makeString("Unable to export assertion: ");

    private static final SubLString $str164$__ = makeString(". ");

    private static final SubLSymbol $variables_for_arity$ = makeSymbol("*VARIABLES-FOR-ARITY*");

    private static final SubLList $list166 = list(makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"), makeSymbol("?F"), makeSymbol("?G"));

    private static final SubLSymbol ILP_EXPORT_GATHER_PREDICATE_EXTENT_INDEX = makeSymbol("ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX");



    private static final SubLList $list169 = list(makeSymbol("?X"));

    private static final SubLSymbol $kw170$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");





    private static final SubLSymbol $kw173$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");





    private static final SubLString $str177$33210D820C0D810D831E190FA46163653 = makeString("33210D820C0D810D831E190FA461636531633763652D613761332D313164392D383030302D30303032623338626366393628800D821E190FA461633436323864632D613761332D313164392D383030302D30303032623338626366393628801E190FA462643538383131312D396332392D313162312D396461642D633337393633366637323730");

    private static final SubLString $str178$33210D820D820D831E190FA4626435383 = makeString("33210D820D820D831E190FA462643538383130342D396332392D313162312D396461642D633337393633366637323730288028810D831E190FA461636531633763652D613761332D313164392D383030302D303030326233386263663936288128820D810D82288228801E190FA462643538383131312D396332392D313162312D396461642D633337393633366637323730");

    private static final SubLList $list179 = list(new SubLObject[]{ makeKeyword("MAX-TIME"), makeInteger(60), makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL });

    public static final SubLList $list180 = list(new SubLObject[]{ makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30) });

    private static final SubLString $str181$Found_no_base_facts_when_running_ = makeString("Found no base facts when running query (query-template '~S '~S ~S '~S)");





    private static final SubLObject $$exampleSentence_Negative = reader_make_constant_shell(makeString("exampleSentence-Negative"));

    private static final SubLSymbol $ilp_export_gather_predicate_extent_index_caching_state$ = makeSymbol("*ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX-CACHING-STATE*");

    private static final SubLString $str186$_explicitly_asserted_negative_exa = makeString(" explicitly asserted negative examples ");

    private static final SubLString $str187$___ = makeString(";~%");

    public static final SubLString $str188$___ = makeString(".~%");

    private static final SubLSymbol ILP_EXPORT_NEGATIVE_EXAMPLE_ARGNUM_VARIABLE = makeSymbol("ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE");

    private static final SubLString $str190$_ARG = makeString("?ARG");

    private static final SubLSymbol $ilp_export_negative_example_argnum_variable_caching_state$ = makeSymbol("*ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE-CACHING-STATE*");

    private static final SubLString $str192$_a__ = makeString("~a~%");

    private static final SubLString $str193$Not_outputting__a__unusable_argIs = makeString("Not outputting ~a (unusable argIsa constraints or bad collection)");

    private static final SubLString $str194$___determination_ = makeString(":- determination(");

    private static final SubLString $str195$_ = makeString("/");

    private static final SubLString $str196$_________WARNING___a_found_contin = makeString("******** WARNING: ~a found continuous~%");



    private static final SubLString $str198$_ = makeString("#");

    private static final SubLList $list199 = list(makeString("+"));

    private static final SubLSymbol $ALL_EXCEPT_HASH = makeKeyword("ALL-EXCEPT-HASH");

    private static final SubLList $list201 = list(makeString("+"), makeString("-"));



    private static final SubLSymbol $ALL_EXCEPT_DOUBLE_HASH_OR_DOUBLE_NEGATIVE = makeKeyword("ALL-EXCEPT-DOUBLE-HASH-OR-DOUBLE-NEGATIVE");

    private static final SubLList $list204 = list(makeString("+"), makeString("-"), makeString("#"));



    private static final SubLString $str206$Got_invalid_mode___A__ = makeString("Got invalid mode: ~A~%");

    private static final SubLSymbol ALEPH_EXPORT_TERM_ALL_HASH_MODE = makeSymbol("ALEPH-EXPORT-TERM-ALL-HASH-MODE");

    private static final SubLSymbol ALEPH_EXPORT_TERM_ALL_MINUS_MODE = makeSymbol("ALEPH-EXPORT-TERM-ALL-MINUS-MODE");

    private static final SubLSymbol $sym209$ISA_PREDICATE_ = makeSymbol("ISA-PREDICATE?");

    private static final SubLString $$$Mode_declarations = makeString("Mode declarations");

    private static final SubLString $$$Types = makeString("Types");

    private static final SubLString $str212$_a__ = makeString("~a: ");

    private static final SubLString $$$type_extent_for_ = makeString("type extent for ");

    private static final SubLString $str214$___mode___ = makeString(":- mode(*,");

    private static final SubLList $list215 = list(makeSymbol("PREDICATE"), makeSymbol("ARGPOS"), makeSymbol("COL"));





    private static final SubLString $str218$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol VALID_ILP_EXPORT_STYLE_P = makeSymbol("VALID-ILP-EXPORT-STYLE-P");

    private static final SubLList $list220 = list(list(makeKeyword("I"), FIVE_INTEGER), list(makeKeyword("CLAUSELENGTH"), FOUR_INTEGER), list(makeKeyword("CHECK-USELESS"), makeString("true")), list(makeKeyword("MODE-OVERLAP-THRESHOLD"), makeString("0.95")), list(makeKeyword("MINPOS"), TWO_INTEGER), list(makeKeyword("MINACC"), ONE_INTEGER), list(makeKeyword("VERBOSITY"), ZERO_INTEGER), list(makeKeyword("NODES"), makeInteger(0x186a0)));

    private static final SubLString $str221$_A = makeString("~A");



    private static final SubLString $str223$_A_should_be_the_name_of_a_new_di = makeString("~A should be the name of a new directory but it is the name of an existing directory.~%");

    public static final SubLString $str224$_A_should_be_the_name_of_a_new_di = makeString("~A should be the name of a new directory but it is the name of an existing file.~%");

    private static final SubLString $str225$Unable_to_create_directory___A___ = makeString("Unable to create directory: ~A~%.");

    private static final SubLString $str226$KB__A__A___ = makeString("KB ~A.~A.~%");

    private static final SubLString $str227$System__A__A__A___ = makeString("System ~A ~A ~A.~%");

    private static final SubLString $str228$Creating_output_directory___A___ = makeString("Creating output directory: ~A.~%");

    private static final SubLString $str229$Using_seed_terms___A___ = makeString("Using seed terms: ~A.~%");

    private static final SubLString $str230$Using_mt___A___ = makeString("Using mt: ~A.~%");

    private static final SubLString $str231$Dealing_with_predicate___A___ = makeString("Dealing with predicate: ~A.~%");











    private static final SubLString $str237$Creating_predicate_positive_file_ = makeString("Creating predicate positive file: ~A.~%");

    private static final SubLString $str238$Creating_predicate_background__ex = makeString("Creating predicate background  examples file: ~A.~%");

    private static final SubLString $str239$Creating_predicate_negative_examp = makeString("Creating predicate negative examples file: ~A.~%");

    private static final SubLString $$$Background_knowledge = makeString("Background knowledge");

    private static final SubLString $$$Aleph_parameter_settings = makeString("Aleph parameter settings");

    private static final SubLList $list242 = list(makeSymbol("PARAMETER"), makeSymbol("VALUE"));

    private static final SubLString $str243$___set__A__A____ = makeString(":- set(~A,~A).~%");

    private static final SubLString $$$created_on_ = makeString("created on ");

    private static final SubLString $$$_using_ = makeString(" using ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$generated_from_KB_ = makeString("generated from KB ");

    private static final SubLString $$$_running_on_CycL_version_ = makeString(" running on CycL version ");

    private static final SubLString $str249$focal_predicate__ = makeString("focal predicate: ");

    private static final SubLString $str250$Mt_visibility__ = makeString("Mt visibility: ");

    private static final SubLString $str251$other_seed_set_terms_ = makeString("other seed set terms:");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLObject $$suggestedRule = reader_make_constant_shell(makeString("suggestedRule"));

    private static final SubLObject $$SuggestedRulesMt = reader_make_constant_shell(makeString("SuggestedRulesMt"));

    private static final SubLString $str255$__ = makeString("??");

    private static final SubLString $str256$_cyc_projects_butler_ILPWork_rck_ = makeString("/cyc/projects/butler/ILPWork/rck-foil6/");

    private static final SubLString $$$foil6 = makeString("foil6");

    private static final SubLList $list258 = list(makeString("-v0"), makeString("-m"), makeString("200000"));

    private static final SubLString $str259$FOIL_6_Process = makeString("FOIL-6 Process");

    private static final SubLString $str260$_out = makeString(".out");

    private static final SubLString $str261$_d = makeString(".d");

    private static final SubLString $str262$_home_cyc60_scratch_butler_ = makeString("/home/cyc60/scratch/butler/");

    private static final SubLObject $const263$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));



    private static final SubLList $list265 = list(reader_make_constant_shell(makeString("biologicalMother")), reader_make_constant_shell(makeString("biologicalFather")), reader_make_constant_shell(makeString("biologicalOffspring")), reader_make_constant_shell(makeString("fullSiblings")), reader_make_constant_shell(makeString("mate")));

    private static final SubLString $str266$cannot_currently_handle_disjoint_ = makeString("cannot currently handle disjoint MT sets in the GAFs");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$omitFromILP = reader_make_constant_shell(makeString("omitFromILP"));

    private static final SubLSymbol $sym270$IS_PAREN = makeSymbol("IS_PAREN");

    private static final SubLSymbol $sym271$IS_SPACE = makeSymbol("IS_SPACE");

    private static final SubLSymbol DUMB_STRINGIFY_CYC_TERM_TEST = makeSymbol("DUMB-STRINGIFY-CYC-TERM-TEST");

    private static final SubLString $str273$aleph_ = makeString("aleph-");



    private static final SubLSymbol $sym275$ISIRRELEVANTPREDICATEFORILP_ = makeSymbol("ISIRRELEVANTPREDICATEFORILP?");

    private static final SubLString $str276$aleph_run__A__A__A = makeString("aleph_run_~A_~A_~A");

    private static final SubLString $str277$_A__A = makeString("~A/~A");

    private static final SubLString $str278$Runninng_ALEPH_experiment_on_mt__ = makeString("Runninng ALEPH experiment on mt, ~A, with preds ~A.~%");

    private static final SubLString $str279$Data_saved_to__A__A___ = makeString("Data saved to ~A/~A.~%");





    private static final SubLSymbol $sym282$LIST_OF_PREDICATES_ = makeSymbol("LIST-OF-PREDICATES?");





    private static final SubLString $str285$_experiment_log = makeString("/experiment.log");

    private static final SubLString $str286$_generated_rules_log = makeString("/generated-rules.log");

    private static final SubLString $str287$_non_wff_generated_rules_log = makeString("/non-wff-generated-rules.log");

    private static final SubLString $str288$__ = makeString("~%");

    private static final SubLString $$$Performing_induction_via_ALEPH = makeString("Performing induction via ALEPH");

    private static final SubLString $$$cdolist = makeString("cdolist");

    public static final SubLString $str291$Adding_known_rules_to_background_ = makeString("Adding known rules to background file: ~A.~%");

    public static final SubLString $str292$Aleph_returned_the_following_rule = makeString("Aleph returned the following rule string: ~A.~%");

    public static final SubLString $str293$Aleph_returned_the_following_rule = makeString("Aleph returned the following rule: ~A.~%");

    public static final SubLString $str294$________________DONE_____________ = makeString("~%~% ========== DONE ============ ~%~%");



    public static final SubLSymbol LIST_OF_FORT_P = makeSymbol("LIST-OF-FORT-P");



    public static final SubLString $str298$Removing_input_files_for_ALEPH___ = makeString("Removing input files for ALEPH ...");

    public static final SubLString $str299$Updating_KB_based_on_induced_sent = makeString("Updating KB based on induced sentences ....");



    public static final SubLList $list301 = list(makeSymbol("ASSERT-COMMAND"), makeSymbol("SENTENCE"), makeSymbol("MT"));



    public static final SubLList $list303 = list(makeSymbol("COMMAND"), makeSymbol("ASSERTION"), makeSymbol("SENTENCE"), makeSymbol("SENTENCE-MT"));

    public static final SubLString $str304$Sentence__A_in_Mt__A____is_equiva = makeString("Sentence ~A in Mt ~A~%  is equivalent to assertion ~A in ~A~%  so we dont need the sentence.");



    public static final SubLList $list306 = list(makeSymbol("COMMAND"), makeSymbol("SENTENCE"), makeSymbol("MT"));

    public static final SubLString $str307$Sentence__A_in_Mt__A_is_already_p = makeString("Sentence ~A in Mt ~A is already provable.");



    public static final SubLString $str309$The_induced_sentence__A_in_Mt__A_ = makeString("The induced sentence ~A in Mt ~A is objectionable.");

    public static final SubLString $str310$Unknown_command_verb__A_with_argu = makeString("Unknown command-verb ~A with arguments ~A -- dont know what to do.");

    public static final SubLString $str311$Optimizing_induced_sentences_____ = makeString("Optimizing induced sentences ....");









    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");



    public static final SubLString $str318$_cyc_projects_transfer_learning_I = makeString("/cyc/projects/transfer-learning/ILP/ALEPH/YAP/Yap-5.1.1/arch");

    public static final SubLString $str319$_cyc_top_scripts_aleph_yap_sh = makeString("/cyc/top/scripts/aleph/yap.sh");

    public static final SubLString $str320$_s = makeString("-s");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    public static final SubLString $str322$_h = makeString("-h");

    private static final SubLInteger $int$50000 = makeInteger(50000);

    public static final SubLString $$$valid = makeString("valid");

    public static final SubLString $$$invalid = makeString("invalid");

    public static final SubLString $str326$__ALEPH_s_Execution_Environment__ = makeString("~%ALEPH's Execution Environment:~%");

    public static final SubLString $str327$__executable____A___A___ = makeString("  executable : ~A (~A)~%");

    public static final SubLString $str328$__Arguments_____A__ = makeString("  Arguments  : ~A~%");

    public static final SubLString $str329$__home_dir______A___A___ = makeString("  home dir   : ~A (~A)~%");

    public static final SubLString $str330$__scratch_dir___A___A___ = makeString("  scratch dir: ~A (~A)~%");



    public static final SubLString $str332$_results = makeString(".results");

    public static final SubLString $$$mother2p = makeString("mother2p");

    public static final SubLString $str334$ALEPH_5__using_Yap_5_1_1__Process = makeString("ALEPH 5 (using Yap 5.1.1) Process");

    public static final SubLString $str335$About_to_run_aleph_with_command__ = makeString("About to run aleph with command: ~A args: ~A.~%");

    public static final SubLString $str336$Running_aleph_with_input___A_and_ = makeString("Running aleph with input: ~A and output: ~A.~%");

    public static final SubLList $list337 = list(list(makeKeyword("ACTION"), makeString("['/cyc/projects/transfer-learning/ILP/ALEPH/YAP/Yap-5.1.1/arch/aleph.pl'].")), list(makeKeyword("ACTION"), makeString("read_all('%%FILEBASE%%').")), list(makeKeyword("ACTION"), makeString("induce_max.")), list(makeKeyword("ACTION"), makeString("halt.")));

    public static final SubLString $str338$_acf = makeString(".acf");

    public static final SubLList $list339 = list(makeSymbol("TASK"), makeSymbol("PARAMETER"));



    public static final SubLString $str341$__FILEBASE__ = makeString("%%FILEBASE%%");

    public static final SubLString $str342$Invalid_ALEPH_command_list_item__ = makeString("Invalid ALEPH command list item: ~A.");

    public static final SubLString $str343$Generated_aleph_command_file_for_ = makeString("Generated aleph command file for: ~A to file: ~A.~%");





    public static final SubLString $str346$_theory_ = makeString("[theory]");



    public static final SubLString $str348$_Training_set_summary_ = makeString("[Training set summary]");



    public static final SubLString $str350$Illegal_state_transition__dont_kn = makeString("Illegal state transition: dont know what to do with state ~A.");

    public static final SubLString $str351$_ = makeString("[");



    public static final SubLString $str353$_Rule = makeString("[Rule");

    public static final SubLString $str354$Unable_to_parse_Prolog_rule__ = makeString("Unable to parse Prolog rule: ");

    public static final SubLSymbol $sym355$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));





    public static final SubLString $$$not = makeString("not");

    public static final SubLString $str361$_ = makeString("!");

    public static final SubLString $str362$_ = makeString(":");

    public static final SubLString $str363$_ = makeString("<");

    public static final SubLString $str364$_ = makeString(">");

    public static final SubLString $str365$Invalid_token___in_input_stream_a = makeString("Invalid token < in input stream at ~A.");

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    public static final SubLList $list367 = list(CHAR_quote);

    public static final SubLString $str368$Invalid_token_sequence____predica = makeString("Invalid token sequence -- predicate is ~A, arguments are ~A, remainder is ~A.");

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    public static final SubLList $list370 = list(makeSymbol("COLON"), makeSymbol("DASH"), makeSymbol("&REST"), makeSymbol("REMAINDER"));

    public static final SubLString $str371$Invalid_token_sequence__A____expe = makeString("Invalid token sequence ~A -- expected :-");

    private static final SubLSymbol $sym372$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list373 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);



    private static final SubLSymbol QUOTIFY_CYCL_TERM = makeSymbol("QUOTIFY-CYCL-TERM");

    private static final SubLSymbol CYC_SENTENCES_INDUCED_BY_PROGRAM = makeSymbol("CYC-SENTENCES-INDUCED-BY-PROGRAM");

    private static final SubLSymbol ILP_IMPORT_PARSE_INTERESTING_PROLOG_RULE = makeSymbol("ILP-IMPORT-PARSE-INTERESTING-PROLOG-RULE");













    private static final SubLList $list384 = list(list(list(makeString("biologicalMother(A,B) :-   biologicalOffspring(B,A), femaleAnimal(B).")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("biologicalOffspring")), makeSymbol("?B"), makeSymbol("?A")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?B"), reader_make_constant_shell(makeString("FemaleAnimal")))), list(reader_make_constant_shell(makeString("biologicalMother")), makeSymbol("?A"), makeSymbol("?B")))), list(list(makeString("biologicalMother(A,B) :-   mate(C,B), biologicalOffspring(C,A).")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("mate")), makeSymbol("?C"), makeSymbol("?B")), list(reader_make_constant_shell(makeString("biologicalOffspring")), makeSymbol("?C"), makeSymbol("?A"))), list(reader_make_constant_shell(makeString("biologicalMother")), makeSymbol("?A"), makeSymbol("?B")))), list(list(makeString("biologicalMother(A,B) :-   mate(C,B), B<>A, biologicalOffspring(C,A).")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("mate")), makeSymbol("?C"), makeSymbol("?B")), list(reader_make_constant_shell(makeString("different")), makeSymbol("?B"), makeSymbol("?A")), list(reader_make_constant_shell(makeString("biologicalOffspring")), makeSymbol("?C"), makeSymbol("?A"))), list(reader_make_constant_shell(makeString("biologicalMother")), makeSymbol("?A"), makeSymbol("?B")))), list(list(makeString("biologicalMother(A,B) :-   mate(C,B), B<>A, biologicalOffspring(C,A), not mate(C,A).")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("mate")), makeSymbol("?C"), makeSymbol("?B")), list(reader_make_constant_shell(makeString("different")), makeSymbol("?B"), makeSymbol("?A")), list(reader_make_constant_shell(makeString("biologicalOffspring")), makeSymbol("?C"), makeSymbol("?A")), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("mate")), makeSymbol("?C"), makeSymbol("?A")))), list(reader_make_constant_shell(makeString("biologicalMother")), makeSymbol("?A"), makeSymbol("?B")))), list(list(makeString("biologicalMother(A,B) :-   mate(_C,B), biologicalOffspring(_C,A).")), list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("mate")), makeSymbol("??C"), makeSymbol("?B")), list(reader_make_constant_shell(makeString("biologicalOffspring")), makeSymbol("??C"), makeSymbol("?A"))), list(reader_make_constant_shell(makeString("biologicalMother")), makeSymbol("?A"), makeSymbol("?B")))), list(list(makeString("biologicalOffspring(A,B) :-   mate(C,A), biologicalMother(B,D).")), NIL), list(list(makeString("biologicalOffspring(A,B) :-   mate(C,A), biologicalMother(B,C), !.")), NIL));

    private static final SubLSymbol ILP_EXPORT_PRED_NAME_FOR_COLLECTION = makeSymbol("ILP-EXPORT-PRED-NAME-FOR-COLLECTION");

    private static final SubLList $list386 = list(list(list(list(reader_make_constant_shell(makeString("IntegerFromToFn")), makeInteger(-7), SEVEN_INTEGER)), makeString("integerFromToFn_negative7_7")));

    private static final SubLSymbol ILP_EXPORT_TERM_NAME = makeSymbol("ILP-EXPORT-TERM-NAME");

    private static final SubLList $list388 = list(list(list(makeString("hyphenated-string")), makeString("string_hyphenatedstring")), list(list(makeDouble(-7.3)), makeString("-7.3")), list(list(reader_make_constant_shell(makeString("12-dimethylhydrazine"))), makeString("'12dimethylhydrazine'")));

    static {


















    }

    public static SubLObject bad_ilp_export_collection_p(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(coll, $bad_ilp_export_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bad_ilp_export_predicate_p(final SubLObject pred) {
        SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$argIsa, $$UniversalVocabularyMt, UNPROVIDED);
        SubLObject arg_constraint = NIL;
        arg_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != bad_ilp_export_collection_p(assertions_high.gaf_arg3(arg_constraint))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_constraint = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject with_ilp_export_collections(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static SubLObject note_ilp_export_collection(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.collection_p(col) : "fort_types_interface.collection_p(col) " + "CommonSymbols.NIL != fort_types_interface.collection_p(col) " + col;
        if (NIL == member(col, $ilp_export_collections$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $ilp_export_collections$.setDynamicValue(cons(col, $ilp_export_collections$.getDynamicValue(thread)), thread);
        }
        return $ilp_export_collections$.getDynamicValue(thread);
    }

    public static SubLObject filter_ilp_term_from_extentP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_term, $ilp_terms_filter_from_extent$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject with_ilp_term_filtering_of_term(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        v_term = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($ilp_terms_filter_from_extent$, listS(CONS, v_term, $list10))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject without_ilp_term_positive_examples(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list11, append(body, NIL));
    }

    public static SubLObject ilp_term_export_positive_examplesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($ilp_term_export_include_positive_examples$.getDynamicValue(thread));
    }

    public static SubLObject without_ilp_term_negative_examples(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list12, append(body, NIL));
    }

    public static SubLObject with_ilp_term_negative_examples(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list13, append(body, NIL));
    }

    public static SubLObject ilp_term_export_negative_examplesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($ilp_term_export_include_negative_examples$.getDynamicValue(thread));
    }

    public static SubLObject with_ilp_term_export_synthetic_negative_examples(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list14, append(body, NIL));
    }

    public static SubLObject without_ilp_term_export_synthetic_negative_examples(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list15, append(body, NIL));
    }

    public static SubLObject ilp_term_export_synthetic_negative_examplesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($ilp_term_export_generate_synthetic_negative_examples$.getDynamicValue(thread));
    }

    public static SubLObject current_ilp_export_style() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_export_style$.getDynamicValue(thread);
    }

    public static SubLObject valid_ilp_export_style_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $known_ilp_export_styles$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject with_ilp_export_style(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject style = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        style = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CHECK_TYPE, style, $list21), listS(CLET, list(list($ilp_export_style$, style)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list18);
        return NIL;
    }

    public static SubLObject pcase_export_style(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PCASE, $list24, append(body, NIL));
    }

    public static SubLObject ilp_export_section_comment(final SubLObject stream, final SubLObject comment) {
        terpri(stream);
        write_string($str25$____________________________, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        ilp_export_simple_comment(stream, comment);
        return terpri(stream);
    }

    public static SubLObject ilp_export_simple_comment(final SubLObject stream, final SubLObject comment) {
        write_string($str26$__, stream, UNPROVIDED, UNPROVIDED);
        princ(comment, stream);
        return terpri(stream);
    }

    public static SubLObject ilp_export_naut_name(final SubLObject naut) {
        if (cycl_utilities.nat_functor(naut).eql($$Percent)) {
            return string_utilities.object_to_string(cycl_utilities.nat_arg1(naut, UNPROVIDED));
        }
        return cb_term_identifier(naut);
    }

    public static SubLObject ilp_export_nat_name(final SubLObject nat) {
        final SubLObject str = (NIL != nart_handles.nart_p(nat)) ? cb_term_identifier(nat) : ilp_export_naut_name(nat);
        return ilp_export_clean_symbol_name_string_for_prolog(str, nat, UNPROVIDED);
    }

    public static SubLObject ilp_export_numeric_argument(final SubLObject number, SubLObject entireP) {
        if (entireP == UNPROVIDED) {
            entireP = T;
        }
        SubLObject string = string_utilities.to_string(number);
        final SubLObject length = length(string);
        if (length.numG(TWO_INTEGER) && (NIL != alpha_char_p(string_utilities.char_from_end(string, ONE_INTEGER)))) {
            string = string_utilities.substring(string, ZERO_INTEGER, subtract(length, TWO_INTEGER));
        }
        if (NIL == entireP) {
            string = string_utilities.string_substitute($$$negative, $str29$_, string, UNPROVIDED);
            string = string_utilities.string_substitute($$$point, $str31$_, string, UNPROVIDED);
        }
        return string;
    }

    public static SubLObject ilp_export_clean_symbol_name_string_for_prolog(SubLObject str, final SubLObject v_term, SubLObject entireP) {
        if (entireP == UNPROVIDED) {
            entireP = T;
        }
        str = string_utilities.remove_substring(str, $str32$__);
        str = remove(CHAR_lparen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        str = remove(CHAR_rparen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        str = remove(CHAR_period, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        str = remove(CHAR_comma, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        str = remove(CHAR_hyphen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        str = remove(CHAR_space, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        str = remove(CHAR_newline, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (((NIL != entireP) && $$ALEPH_ILPProgram.eql(current_ilp_export_style())) && (NIL == lower_case_p(Strings.sublisp_char(str, ZERO_INTEGER)))) {
            str = cconcatenate($str33$_, new SubLObject[]{ str, $str33$_ });
        }
        dictionary.dictionary_enter($ilp_term_name_to_constant_map$.getGlobalValue(), str, v_term);
        return str;
    }

    public static SubLObject ilp_export_term_name(final SubLObject v_term, SubLObject entireP) {
        if (entireP == UNPROVIDED) {
            entireP = T;
        }
        SubLObject base_name = NIL;
        if (NIL != constant_p(v_term)) {
            base_name = constants_high.constant_name(v_term);
        } else
            if (NIL != nart_handles.nart_p(v_term)) {
                base_name = ilp_export_nat_name(v_term);
            } else
                if (NIL != ilp_collection_skolem_p(v_term)) {
                    final SubLObject type = cycl_utilities.formula_arg1(v_term, UNPROVIDED);
                    final SubLObject type_name = ilp_export_term_name(type, NIL);
                    base_name = cconcatenate($str35$Some_, format_nil.format_nil_a_no_copy(type_name));
                } else
                    if (NIL != narts_high.naut_p(v_term)) {
                        base_name = ilp_export_nat_name(v_term);
                    } else {
                        if (v_term.isNumber()) {
                            return ilp_export_numeric_argument(v_term, entireP);
                        }
                        if (v_term.isString()) {
                            base_name = cconcatenate($ilp_export_string_term_name_prefix$.getGlobalValue(), v_term);
                        } else {
                            if (NIL != cycl_variables.el_varP(v_term)) {
                                return cycl_var_to_prolog_var(v_term);
                            }
                            if (v_term == $CONTINUOUS) {
                                return $$$continuous;
                            }
                            return NIL;
                        }
                    }



        if (base_name.isString()) {
            return ilp_export_clean_symbol_name_string_for_prolog(base_name, v_term, entireP);
        }
        return NIL;
    }

    public static SubLObject ilp_collection_skolem_p(final SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $$SomeFn);
    }

    public static SubLObject ilp_export_pred_name_for_collection(final SubLObject coll) {
        return ilp_export_pred_name_for_collection_cached(coll, current_ilp_export_style());
    }

    public static SubLObject clear_ilp_export_pred_name_for_collection_cached() {
        final SubLObject cs = $ilp_export_pred_name_for_collection_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ilp_export_pred_name_for_collection_cached(final SubLObject coll, final SubLObject style) {
        return memoization_state.caching_state_remove_function_results_with_args($ilp_export_pred_name_for_collection_cached_caching_state$.getGlobalValue(), list(coll, style), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_export_pred_name_for_collection_cached_internal(final SubLObject coll, final SubLObject style) {
        SubLObject pred_name = NIL;
        if (NIL != constant_p(coll)) {
            if (style.eql($$FOIL_ILPProgram)) {
                pred_name = cconcatenate($str41$isa_, constants_high.constant_name(coll));
            } else
                if (style.eql($$ALEPH_ILPProgram)) {
                    pred_name = string_utilities.copy_string(constants_high.constant_name(coll));
                    Strings.set_char(pred_name, ZERO_INTEGER, char_downcase(Strings.sublisp_char(pred_name, ZERO_INTEGER)));
                }

        } else
            if (NIL != cycl_grammar.cycl_nat_p(coll)) {
                pred_name = ilp_export_pred_name_for_nat(coll, style);
            }

        return ilp_export_clean_symbol_name_string_for_prolog(pred_name, coll, UNPROVIDED);
    }

    public static SubLObject ilp_export_pred_name_for_collection_cached(final SubLObject coll, final SubLObject style) {
        SubLObject caching_state = $ilp_export_pred_name_for_collection_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ILP_EXPORT_PRED_NAME_FOR_COLLECTION_CACHED, $ilp_export_pred_name_for_collection_cached_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(coll, style);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (coll.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && style.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ilp_export_pred_name_for_collection_cached_internal(coll, style)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(coll, style));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject ilp_export_pred_name_for_nat(final SubLObject nat, final SubLObject style) {
        SubLObject naut = (NIL != nart_handles.nart_p(nat)) ? narts_high.nart_el_formula(nat) : nat;
        if (cycl_utilities.formula_operator(naut).eql($$TheList) || cycl_utilities.formula_operator(naut).eql($$TheSet)) {
            naut = copy_formula(naut);
            final SubLObject operator = cycl_utilities.formula_operator(naut);
            SubLObject v_arguments = cycl_utilities.formula_args(naut, UNPROVIDED);
            v_arguments = Sort.sort(v_arguments, symbol_function($sym45$FORT__), UNPROVIDED);
            naut = make_formula(operator, v_arguments, UNPROVIDED);
        }
        SubLObject name = NIL;
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(naut, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == name) {
                name = ilp_export_pred_name_for_collection_cached(v_term, style);
            } else {
                name = cconcatenate(name, new SubLObject[]{ $str47$_, ilp_export_term_name(v_term, NIL) });
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return name;
    }

    public static SubLObject current_ilp_export_inductive_target_predicate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_export_inductive_target_predicate$.getDynamicValue(thread);
    }

    public static SubLObject current_ilp_export_inductive_target_predicate_argpos() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_export_inductive_target_predicate_argpos$.getDynamicValue(thread);
    }

    public static SubLObject with_inductive_target_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        predicate = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($ilp_export_inductive_target_predicate$, predicate)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list48);
        return NIL;
    }

    public static SubLObject with_inductive_target_predicate_argpos(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argpos = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        argpos = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($ilp_export_inductive_target_predicate_argpos$, argpos)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list50);
        return NIL;
    }

    public static SubLObject get_aleph_export_background_knowledge_filename(SubLObject filestem, SubLObject target_predicate, SubLObject argnum, SubLObject modeh_mode) {
        if (target_predicate == UNPROVIDED) {
            target_predicate = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (modeh_mode == UNPROVIDED) {
            modeh_mode = NIL;
        }
        if (NIL != constant_p(target_predicate)) {
            filestem = cconcatenate(filestem, new SubLObject[]{ $str55$_term_, Strings.string_downcase(constants_high.constant_name(target_predicate), UNPROVIDED, UNPROVIDED) });
        } else {
            filestem = cconcatenate(filestem, new SubLObject[]{ $str55$_term_, dumb_stringify_cyc_term(target_predicate) });
        }
        if (NIL != modeh_mode) {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = modeh_mode;
            SubLObject mode_indicator = NIL;
            mode_indicator = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != evenp(index)) {
                    filestem = cconcatenate(filestem, mode_indicator);
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                mode_indicator = cdolist_list_var.first();
            } 
        }
        return cconcatenate(filestem, $aleph_export_background_knowledge_file_extension$.getGlobalValue());
    }

    public static SubLObject get_aleph_export_positive_examples_filename(SubLObject filestem, SubLObject target_predicate, SubLObject argnum, SubLObject modeh_mode) {
        if (target_predicate == UNPROVIDED) {
            target_predicate = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (modeh_mode == UNPROVIDED) {
            modeh_mode = NIL;
        }
        if (NIL != constant_p(target_predicate)) {
            filestem = cconcatenate(filestem, new SubLObject[]{ $str55$_term_, Strings.string_downcase(constants_high.constant_name(target_predicate), UNPROVIDED, UNPROVIDED) });
        } else {
            filestem = cconcatenate(filestem, new SubLObject[]{ $str55$_term_, dumb_stringify_cyc_term(target_predicate) });
        }
        if (NIL != modeh_mode) {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = modeh_mode;
            SubLObject mode_indicator = NIL;
            mode_indicator = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != evenp(index)) {
                    filestem = cconcatenate(filestem, mode_indicator);
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                mode_indicator = cdolist_list_var.first();
            } 
        }
        return cconcatenate(filestem, $aleph_export_positive_examples_file_extension$.getGlobalValue());
    }

    public static SubLObject get_aleph_export_negative_examples_filename(SubLObject filestem, SubLObject target_predicate, SubLObject argnum, SubLObject modeh_mode) {
        if (target_predicate == UNPROVIDED) {
            target_predicate = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (modeh_mode == UNPROVIDED) {
            modeh_mode = NIL;
        }
        if (NIL != constant_p(target_predicate)) {
            filestem = cconcatenate(filestem, new SubLObject[]{ $str55$_term_, Strings.string_downcase(constants_high.constant_name(target_predicate), UNPROVIDED, UNPROVIDED) });
        } else {
            filestem = cconcatenate(filestem, new SubLObject[]{ $str55$_term_, dumb_stringify_cyc_term(target_predicate) });
        }
        if (NIL != modeh_mode) {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = modeh_mode;
            SubLObject mode_indicator = NIL;
            mode_indicator = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != evenp(index)) {
                    filestem = cconcatenate(filestem, mode_indicator);
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                mode_indicator = cdolist_list_var.first();
            } 
        }
        return cconcatenate(filestem, $aleph_export_negative_examples_file_extension$.getGlobalValue());
    }

    public static SubLObject get_filestem_from_aleph_export_filename(final SubLObject filename) {
        return string_utilities.substring(filename, ZERO_INTEGER, subtract(length(filename), length($aleph_export_background_knowledge_file_extension$.getGlobalValue())));
    }

    public static SubLObject with_aleph_mode_information_exported(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list56, append(body, NIL));
    }

    public static SubLObject without_aleph_mode_information_exported(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list57, append(body, NIL));
    }

    public static SubLObject aleph_export_mode_informationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($aleph_generate_mode_information$.getDynamicValue(thread));
    }

    public static SubLObject get_ilp_export_modes_query_mt(final SubLObject template, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLObject query_mt = kb_query.kbq_mt(template);
        if (NIL == hlmt.possibly_hlmt_p(domain_mt)) {
            return query_mt;
        }
        final SubLObject combined_mt = hlmt.combine_hlmts(query_mt, domain_mt);
        if ($$MtUnionFn.eql(cycl_utilities.nat_functor(combined_mt))) {
            return query_mt;
        }
        return combined_mt;
    }

    public static SubLObject get_ilp_export_input_modes_query_mt(SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        return get_ilp_export_modes_query_mt($ilp_export_input_modes_query$.getGlobalValue(), domain_mt);
    }

    public static SubLObject get_ilp_export_output_modes_query_mt(SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        return get_ilp_export_modes_query_mt($ilp_export_output_modes_query$.getGlobalValue(), domain_mt);
    }

    public static SubLObject clear_get_ilp_export_mode_marker_for_style() {
        final SubLObject cs = $get_ilp_export_mode_marker_for_style_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_ilp_export_mode_marker_for_style(final SubLObject program, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($get_ilp_export_mode_marker_for_style_caching_state$.getGlobalValue(), list(program, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_ilp_export_mode_marker_for_style_internal(final SubLObject program, final SubLObject direction) {
        if (direction.eql($INPUT) || direction.eql($$programDenotesInputModeWith)) {
            return get_ilp_export_mode_marker(program, $$programDenotesInputModeWith);
        }
        if (direction.eql($OUTPUT) || direction.eql($$programDenotesOutputModeWith)) {
            return get_ilp_export_mode_marker(program, $$programDenotesOutputModeWith);
        }
        Errors.error($str66$Unknown_Input_output_direction__A, direction);
        return NIL;
    }

    public static SubLObject get_ilp_export_mode_marker_for_style(final SubLObject program, final SubLObject direction) {
        SubLObject caching_state = $get_ilp_export_mode_marker_for_style_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ILP_EXPORT_MODE_MARKER_FOR_STYLE, $get_ilp_export_mode_marker_for_style_caching_state$, NIL, EQL, TWO_INTEGER, ONE_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(program, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (program.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_ilp_export_mode_marker_for_style_internal(program, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(program, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_ilp_export_mode_marker(final SubLObject program, final SubLObject predicate) {
        return ask_utilities.query_variable($CHARACTER, listS(predicate, program, $list69), $$ComputerSoftwareDataMt, $list71).first();
    }

    public static SubLObject get_all_ilp_export_mode_markers_for_style() {
        return get_all_ilp_export_mode_markers_for_style_cached(current_ilp_export_style());
    }

    public static SubLObject clear_get_all_ilp_export_mode_markers_for_style_cached() {
        final SubLObject cs = $get_all_ilp_export_mode_markers_for_style_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_all_ilp_export_mode_markers_for_style_cached(final SubLObject program) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_ilp_export_mode_markers_for_style_cached_caching_state$.getGlobalValue(), list(program), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_all_ilp_export_mode_markers_for_style_cached_internal(final SubLObject program) {
        return list(get_ilp_export_mode_marker_for_style(program, $$programDenotesInputModeWith), get_ilp_export_mode_marker_for_style(program, $$programDenotesOutputModeWith));
    }

    public static SubLObject get_all_ilp_export_mode_markers_for_style_cached(final SubLObject program) {
        SubLObject caching_state = $get_all_ilp_export_mode_markers_for_style_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ALL_ILP_EXPORT_MODE_MARKERS_FOR_STYLE_CACHED, $get_all_ilp_export_mode_markers_for_style_cached_caching_state$, NIL, EQL, ONE_INTEGER, ONE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, program, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_all_ilp_export_mode_markers_for_style_cached_internal(program)));
            memoization_state.caching_state_put(caching_state, program, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_ilp_export_modes_query_sentence(final SubLObject template, final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum) {
        final SubLObject raw_query_sentence = kb_query.kbq_sentences(template).first();
        final SubLObject v_bindings = list_utilities.make_alist_from_keys_and_values($list74, list(target_predicate, focal_argnum, body_predicates));
        final SubLObject query_sentence = bindings.apply_bindings(v_bindings, raw_query_sentence);
        return query_sentence;
    }

    public static SubLObject get_ilp_export_input_modes_query_sentence(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum) {
        return get_ilp_export_modes_query_sentence($ilp_export_input_modes_query$.getGlobalValue(), target_predicate, body_predicates, focal_argnum);
    }

    public static SubLObject get_ilp_export_output_modes_query_sentence(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum) {
        return get_ilp_export_modes_query_sentence($ilp_export_output_modes_query$.getGlobalValue(), target_predicate, body_predicates, focal_argnum);
    }

    public static SubLObject get_ilp_export_modes_query_properties(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_properties = kb_query.kbq_query_properties(template);
        v_properties = putf(v_properties, $RESULT_UNIQUENESS, $BINDINGS);
        v_properties = putf(v_properties, $RETURN, list($TEMPLATE, $list79));
        if ($ilp_export_mode_query_maxtime$.getDynamicValue(thread).isFixnum()) {
            v_properties = putf(v_properties, $MAX_TIME, $ilp_export_mode_query_maxtime$.getDynamicValue(thread));
        }
        return v_properties;
    }

    public static SubLObject get_ilp_export_output_modes_query_properties() {
        return get_ilp_export_modes_query_properties($ilp_export_output_modes_query$.getGlobalValue());
    }

    public static SubLObject get_ilp_export_input_modes_query_properties() {
        return get_ilp_export_modes_query_properties($ilp_export_input_modes_query$.getGlobalValue());
    }

    public static SubLObject clear_get_ilp_export_input_modes_for_arg_position() {
        final SubLObject cs = $get_ilp_export_input_modes_for_arg_position_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_ilp_export_input_modes_for_arg_position(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum, SubLObject domain_mt, SubLObject experimental_log) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_ilp_export_input_modes_for_arg_position_caching_state$.getGlobalValue(), list(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_ilp_export_input_modes_for_arg_position_internal(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum, final SubLObject domain_mt, final SubLObject experimental_log) {
        final SubLObject mt = get_ilp_export_input_modes_query_mt(domain_mt);
        final SubLObject sentence = get_ilp_export_input_modes_query_sentence(target_predicate, body_predicates, focal_argnum);
        final SubLObject v_properties = get_ilp_export_input_modes_query_properties();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        SubLObject current_info = format(NIL, $str82$Mt_for_finding_input_mode_query__, mt);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str83$Query_for_calulating_input_modes_, sentence);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str84$Query_properties_for_calculating_, v_properties);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str85$Got_input_modes___A__, results);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        return results;
    }

    public static SubLObject get_ilp_export_input_modes_for_arg_position(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum, SubLObject domain_mt, SubLObject experimental_log) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        SubLObject caching_state = $get_ilp_export_input_modes_for_arg_position_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ILP_EXPORT_INPUT_MODES_FOR_ARG_POSITION, $get_ilp_export_input_modes_for_arg_position_caching_state$, NIL, EQUAL, FIVE_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (target_predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (body_predicates.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (focal_argnum.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (domain_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && experimental_log.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_ilp_export_input_modes_for_arg_position_internal(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_get_ilp_export_output_modes_for_arg_position() {
        final SubLObject cs = $get_ilp_export_output_modes_for_arg_position_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_ilp_export_output_modes_for_arg_position(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum, SubLObject domain_mt, SubLObject experimental_log) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_ilp_export_output_modes_for_arg_position_caching_state$.getGlobalValue(), list(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_ilp_export_output_modes_for_arg_position_internal(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum, final SubLObject domain_mt, final SubLObject experimental_log) {
        final SubLObject mt = get_ilp_export_output_modes_query_mt(domain_mt);
        final SubLObject sentence = get_ilp_export_output_modes_query_sentence(target_predicate, body_predicates, focal_argnum);
        final SubLObject v_properties = get_ilp_export_output_modes_query_properties();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        SubLObject current_info = format(NIL, $str88$Mt_for_finding_output_mode_query_, mt);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str89$Query_for_calulating_output_modes, sentence);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str90$Query_properties_for_calculating_, v_properties);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str91$Got_output_modes___A__, results);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        return results;
    }

    public static SubLObject get_ilp_export_output_modes_for_arg_position(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject focal_argnum, SubLObject domain_mt, SubLObject experimental_log) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        SubLObject caching_state = $get_ilp_export_output_modes_for_arg_position_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ILP_EXPORT_OUTPUT_MODES_FOR_ARG_POSITION, $get_ilp_export_output_modes_for_arg_position_caching_state$, NIL, EQUAL, FIVE_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (target_predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (body_predicates.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (focal_argnum.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (domain_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && experimental_log.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_ilp_export_output_modes_for_arg_position_internal(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target_predicate, body_predicates, focal_argnum, domain_mt, experimental_log));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject new_ilp_export_predicate_arg_constraints_dbase() {
        return dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject current_ilp_export_predicate_arg_constraints_dbase() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_export_predicate_arg_constraints_dbase$.getDynamicValue(thread);
    }

    public static SubLObject with_new_ilp_export_predicate_arg_constraints_dbase(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list93, append(body, NIL));
    }

    public static SubLObject note_ilp_export_predicate_arg_constraint(final SubLObject predicate, final SubLObject argnum, final SubLObject collection, SubLObject property) {
        if (property == UNPROVIDED) {
            property = NIL;
        }
        final SubLObject dbase = current_ilp_export_predicate_arg_constraints_dbase();
        if (NIL != dictionary.dictionary_p(dbase)) {
            SubLObject pred_dbase = dictionary.dictionary_lookup(dbase, predicate, UNPROVIDED);
            if (NIL == dictionary.dictionary_p(pred_dbase)) {
                pred_dbase = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                dictionary.dictionary_enter(dbase, predicate, pred_dbase);
            }
            dictionary_utilities.dictionary_pushnew(pred_dbase, argnum, collection, UNPROVIDED, UNPROVIDED);
            dictionary_utilities.dictionary_pushnew(pred_dbase, property, cons(argnum, collection), symbol_function(EQUAL), UNPROVIDED);
        }
        return predicate;
    }

    public static SubLObject get_ilp_export_predicate_arg_constraint(final SubLObject predicate, final SubLObject argnum, SubLObject not_found_value) {
        if (not_found_value == UNPROVIDED) {
            not_found_value = NIL;
        }
        final SubLObject dbase = current_ilp_export_predicate_arg_constraints_dbase();
        if (NIL != dictionary.dictionary_p(dbase)) {
            final SubLObject pred_dbase = dictionary.dictionary_lookup(dbase, predicate, UNPROVIDED);
            if (NIL != dictionary.dictionary_p(pred_dbase)) {
                return dictionary.dictionary_lookup(pred_dbase, argnum, not_found_value);
            }
        }
        return not_found_value;
    }

    public static SubLObject get_ilp_export_predicate_arg_constraint_property(final SubLObject predicate, final SubLObject argnum, final SubLObject property, SubLObject not_found_value) {
        if (not_found_value == UNPROVIDED) {
            not_found_value = NIL;
        }
        final SubLObject dbase = current_ilp_export_predicate_arg_constraints_dbase();
        if (NIL != dictionary.dictionary_p(dbase)) {
            final SubLObject pred_dbase = dictionary.dictionary_lookup(dbase, predicate, UNPROVIDED);
            if (NIL != dictionary.dictionary_p(pred_dbase)) {
                final SubLObject tuples = dictionary.dictionary_lookup(pred_dbase, property, UNPROVIDED);
                if (NIL != list_utilities.sublisp_boolean(tuples)) {
                    SubLObject collections = NIL;
                    SubLObject cdolist_list_var = tuples;
                    SubLObject tuple = NIL;
                    tuple = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = tuple;
                        SubLObject argpos = NIL;
                        SubLObject collection = NIL;
                        destructuring_bind_must_consp(current, datum, $list94);
                        argpos = current.first();
                        current = collection = current.rest();
                        if (argpos.numE(argnum)) {
                            final SubLObject item_var = collection;
                            if (NIL == member(item_var, collections, symbol_function(EQL), symbol_function(IDENTITY))) {
                                collections = cons(item_var, collections);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        tuple = cdolist_list_var.first();
                    } 
                    return NIL == collections ? not_found_value : collections;
                }
            }
        }
        return not_found_value;
    }

    public static SubLObject new_ilp_export_negative_example_collector() {
        return dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject get_ilp_export_negative_example_collector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_term_export_generate_synthetic_negative_examples$.getDynamicValue(thread);
    }

    public static SubLObject note_ilp_export_negative_example(final SubLObject hl_formula, SubLObject category) {
        if (category == UNPROVIDED) {
            category = $$Thing;
        }
        return dictionary_utilities.dictionary_pushnew(get_ilp_export_negative_example_collector(), hl_formula, category, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_functional_predicate_in_argP() {
        final SubLObject cs = $functional_predicate_in_argP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_functional_predicate_in_argP(final SubLObject predicate, final SubLObject arg_num) {
        return memoization_state.caching_state_remove_function_results_with_args($functional_predicate_in_argP_caching_state$.getGlobalValue(), list(predicate, arg_num), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject functional_predicate_in_argP_internal(final SubLObject predicate, final SubLObject arg_num) {
        return rkf_query_utilities.rkf_known(list($$functionalInArgs, predicate, arg_num), $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject functional_predicate_in_argP(final SubLObject predicate, final SubLObject arg_num) {
        SubLObject caching_state = $functional_predicate_in_argP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym96$FUNCTIONAL_PREDICATE_IN_ARG_, $sym99$_FUNCTIONAL_PREDICATE_IN_ARG__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, arg_num);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg_num.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(functional_predicate_in_argP_internal(predicate, arg_num)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, arg_num));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject functional_predicate_in_arg1P(final SubLObject predicate) {
        return functional_predicate_in_argP(predicate, ONE_INTEGER);
    }

    public static SubLObject functional_predicate_in_arg2P(final SubLObject predicate) {
        return functional_predicate_in_argP(predicate, TWO_INTEGER);
    }

    public static SubLObject note_ilp_export_negative_examples_implied_by_positive_example(final SubLObject hl_formula) {
        final SubLObject predicate = cycl_utilities.formula_arg0(hl_formula);
        if (NIL != kb_accessors.irreflexive_predicateP(predicate)) {
            final SubLObject v_arity = arity.arity_robust(predicate);
            SubLObject cdolist_list_var = cycl_utilities.formula_args(hl_formula, UNPROVIDED);
            SubLObject argument = NIL;
            argument = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject negative_example = make_formula(predicate, make_list(v_arity, argument), UNPROVIDED);
                note_ilp_export_negative_example(negative_example, $$IrreflexiveBinaryPredicate);
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            } 
        }
        if (NIL != kb_accessors.asymmetric_predicateP(predicate)) {
            note_ilp_export_negative_example(make_formula(predicate, reverse(cycl_utilities.formula_args(hl_formula, UNPROVIDED)), UNPROVIDED), $$AsymmetricBinaryPredicate);
        }
        if (NIL != negation_predicate.negation_inverseP(predicate, predicate, UNPROVIDED, UNPROVIDED)) {
            note_ilp_export_negative_example(make_formula(predicate, reverse(cycl_utilities.formula_args(hl_formula, UNPROVIDED)), UNPROVIDED), $$negationInverse);
        }
        if (TWO_INTEGER.eql(arity.arity_robust(predicate)) && (NIL != functional_predicate_in_arg1P(predicate))) {
            final SubLObject exemplar = cycl_utilities.formula_arg1(hl_formula, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(hl_formula, UNPROVIDED);
            final SubLObject type = get_ilp_export_predicate_arg_constraint(predicate, ONE_INTEGER, UNPROVIDED).first();
            SubLObject cdolist_list_var2;
            final SubLObject all_instances = cdolist_list_var2 = lookup_ilp_export_type_instances(type);
            SubLObject possible_alternative = NIL;
            possible_alternative = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!exemplar.equal(possible_alternative)) {
                    final SubLObject negative_example2 = make_formula(predicate, list(possible_alternative, arg2), UNPROVIDED);
                    note_ilp_export_negative_example(negative_example2, $$functionalInArgs);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                possible_alternative = cdolist_list_var2.first();
            } 
        }
        if (TWO_INTEGER.eql(arity.arity_robust(predicate)) && (NIL != functional_predicate_in_arg2P(predicate))) {
            final SubLObject exemplar = cycl_utilities.formula_arg2(hl_formula, UNPROVIDED);
            final SubLObject arg3 = cycl_utilities.formula_arg1(hl_formula, UNPROVIDED);
            final SubLObject type = get_ilp_export_predicate_arg_constraint(predicate, TWO_INTEGER, UNPROVIDED).first();
            SubLObject cdolist_list_var2;
            final SubLObject all_instances = cdolist_list_var2 = lookup_ilp_export_type_instances(type);
            SubLObject possible_alternative = NIL;
            possible_alternative = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!exemplar.equal(possible_alternative)) {
                    final SubLObject negative_example2 = make_formula(predicate, list(arg3, possible_alternative), UNPROVIDED);
                    note_ilp_export_negative_example(negative_example2, $$functionalInArgs);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                possible_alternative = cdolist_list_var2.first();
            } 
        }
        final SubLObject predicate_$1 = cycl_utilities.formula_operator(hl_formula);
        final SubLObject args = cycl_utilities.formula_args(hl_formula, UNPROVIDED);
        final SubLObject v_arity2 = length(args);
        SubLObject generic_args_template = NIL;
        SubLObject i;
        SubLObject argnum;
        SubLObject type2;
        SubLObject arg4;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity2); i = add(i, ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            type2 = get_ilp_export_predicate_arg_constraint(predicate_$1, argnum, UNPROVIDED).first();
            arg4 = make_unary_formula($$SomeFn, type2);
            generic_args_template = cons(arg4, generic_args_template);
        }
        generic_args_template = nreverse(generic_args_template);
        SubLObject v_term;
        SubLObject negative_args;
        SubLObject negative_example3;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity2); i = add(i, ONE_INTEGER)) {
            v_term = nth(i, args);
            negative_args = copy_list(generic_args_template);
            if (v_arity2.numG(ONE_INTEGER)) {
                set_nth(i, negative_args, v_term);
            }
            negative_example3 = make_formula(predicate_$1, negative_args, UNPROVIDED);
            note_ilp_export_negative_example(negative_example3, $list103);
        }
        return predicate;
    }

    public static SubLObject clear_ilp_export_negation_predicateP() {
        final SubLObject cs = $ilp_export_negation_predicateP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ilp_export_negation_predicateP(final SubLObject predicate_a, final SubLObject predicate_b, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($ilp_export_negation_predicateP_caching_state$.getGlobalValue(), list(predicate_a, predicate_b, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_export_negation_predicateP_internal(final SubLObject predicate_a, final SubLObject predicate_b, final SubLObject mt) {
        if (NIL != negation_predicate.negation_predicateP(predicate_a, predicate_b, mt, UNPROVIDED)) {
            return T;
        }
        final SubLObject sentence = make_binary_formula($$negationPreds, predicate_a, predicate_b);
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, $ilp_export_negation_predicate_query_properties$.getGlobalValue());
        return list_utilities.sublisp_boolean(results);
    }

    public static SubLObject ilp_export_negation_predicateP(final SubLObject predicate_a, final SubLObject predicate_b, final SubLObject mt) {
        SubLObject caching_state = $ilp_export_negation_predicateP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym105$ILP_EXPORT_NEGATION_PREDICATE_, $sym107$_ILP_EXPORT_NEGATION_PREDICATE__CACHING_STATE_, NIL, EQL, THREE_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate_a, predicate_b, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate_a.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (predicate_b.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ilp_export_negation_predicateP_internal(predicate_a, predicate_b, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate_a, predicate_b, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject note_ilp_export_negative_examples_implied_by_positive_background_example(final SubLObject predicate, final SubLObject hl_formula, final SubLObject mt) {
        note_ilp_export_negative_examples_implied_by_positive_example(hl_formula);
        return predicate;
    }

    public static SubLObject note_ilp_export_negative_examples_implied_by_background_assertion_spec(final SubLObject assertion_spec, final SubLObject mt) {
        if (NIL != ilp_term_export_synthetic_negative_examplesP()) {
            final SubLObject target_predicate = current_ilp_export_inductive_target_predicate();
            final SubLObject hl_formula = assertion_spec_hl_formula(assertion_spec);
            note_ilp_export_negative_examples_implied_by_positive_background_example(target_predicate, hl_formula, mt);
        }
        return assertion_spec;
    }

    public static SubLObject ilp_export_negative_examples_gathered(final SubLObject stream, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (dictionary.dictionary_length(get_ilp_export_negative_example_collector()).isPositive()) {
            if (NIL == is_exporting_negative_to_backgroundP) {
                ilp_export_section_comment(stream, $str108$_negative_examples_derived_from_p);
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_ilp_export_negative_example_collector())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject hl_formula = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject reasons = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == is_exporting_negative_to_backgroundP) {
                    ilp_export_simple_comment(stream, string_utilities.to_string(reasons));
                }
                ilp_export_hl_formula_for_predicate_extent(stream, hl_formula, is_exporting_negative_to_backgroundP);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return stream;
    }

    public static SubLObject new_ilp_export_known_rule_set(SubLObject rules) {
        if (rules == UNPROVIDED) {
            rules = NIL;
        }
        final SubLObject rule_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_known_ilp_export_rule_in_set(rule, rule_set);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return rule_set;
    }

    public static SubLObject with_known_ilp_export_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rules = NIL;
        destructuring_bind_must_consp(current, datum, $list109);
        rules = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($ilp_export_known_rules$, list(NEW_ILP_EXPORT_KNOWN_RULE_SET, rules))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list109);
        return NIL;
    }

    public static SubLObject without_known_ilp_export_rules(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list112, append(body, NIL));
    }

    public static SubLObject known_ilp_export_rules_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_p($ilp_export_known_rules$.getDynamicValue(thread));
    }

    public static SubLObject all_known_ilp_export_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != known_ilp_export_rules_p()) {
            return set.set_element_list($ilp_export_known_rules$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject is_known_ilp_export_ruleP(final SubLObject cycl_rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != known_ilp_export_rules_p()) {
            return set.set_memberP(cycl_rule, $ilp_export_known_rules$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject note_known_ilp_export_rule(final SubLObject cycl_rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != known_ilp_export_rules_p()) {
            return note_known_ilp_export_rule_in_set(cycl_rule, $ilp_export_known_rules$.getDynamicValue(thread));
        }
        return cycl_rule;
    }

    public static SubLObject note_known_ilp_export_rule_in_set(final SubLObject cycl_rule, final SubLObject rule_set) {
        SubLObject cdolist_list_var = generate_prolog_variations_of_cycl_rule(cycl_rule);
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(rule, rule_set);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return cycl_rule;
    }

    public static SubLObject generate_prolog_variations_of_cycl_rule(final SubLObject cycl_rule) {
        SubLObject variations = NIL;
        SubLObject implies = NIL;
        SubLObject antecedent_clauses = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(cycl_rule, cycl_rule, $list113);
        implies = cycl_rule.first();
        SubLObject current = cycl_rule.rest();
        destructuring_bind_must_consp(current, cycl_rule, $list113);
        antecedent_clauses = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, cycl_rule, $list113);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == el_conjunction_p(antecedent_clauses)) {
                return list(cycl_rule);
            }
            if (NIL != list_utilities.singletonP(cycl_utilities.formula_args(antecedent_clauses, UNPROVIDED))) {
                return list(cycl_rule);
            }
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(antecedent_clauses, $IGNORE);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                index = add(index, ONE_INTEGER);
                final SubLObject permutations = cycl_utilities.formula_commutative_permutations(clause, UNPROVIDED);
                if (NIL != list_utilities.lengthG(permutations, ONE_INTEGER, UNPROVIDED)) {
                    SubLObject cdolist_list_var_$2 = permutations;
                    SubLObject permutation = NIL;
                    permutation = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject new_antecedent = copy_formula(antecedent_clauses);
                        set_nth(index, new_antecedent, permutation);
                        variations = nconc(generate_ordering_variations_of_cycl_rule(make_binary_formula(implies, new_antecedent, consequent)), variations);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        permutation = cdolist_list_var_$2.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(cycl_rule, $list113);
        }
        if (NIL == variations) {
            variations = generate_ordering_variations_of_cycl_rule(cycl_rule);
        }
        return variations;
    }

    public static SubLObject generate_ordering_variations_of_cycl_rule(final SubLObject cycl_rule) {
        SubLObject implies = NIL;
        SubLObject antecedent_clauses = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(cycl_rule, cycl_rule, $list113);
        implies = cycl_rule.first();
        SubLObject current = cycl_rule.rest();
        destructuring_bind_must_consp(current, cycl_rule, $list113);
        antecedent_clauses = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, cycl_rule, $list113);
        consequent = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(cycl_rule, $list113);
            return NIL;
        }
        if (NIL == el_conjunction_p(antecedent_clauses)) {
            return cycl_rule;
        }
        SubLObject ordering_variations = NIL;
        SubLObject current_$4;
        final SubLObject datum_$3 = current_$4 = antecedent_clauses;
        SubLObject and = NIL;
        destructuring_bind_must_consp(current_$4, datum_$3, $list114);
        and = current_$4.first();
        final SubLObject v_clauses;
        current_$4 = v_clauses = current_$4.rest();
        final SubLObject clause_count = length(v_clauses);
        SubLObject previous_clauses = v_clauses;
        SubLObject variations = NIL;
        SubLObject i;
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject new_clauses;
        SubLObject temp;
        for (i = NIL, i = ZERO_INTEGER; i.numL(clause_count); i = add(i, ONE_INTEGER)) {
            for (cdotimes_end_var = subtract(clause_count, ONE_INTEGER), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
                new_clauses = copy_formula(previous_clauses);
                temp = nth(j, new_clauses);
                set_nth(j, new_clauses, nth(add(j, ONE_INTEGER), new_clauses));
                set_nth(add(j, ONE_INTEGER), new_clauses, temp);
                variations = cons(new_clauses, variations);
                previous_clauses = new_clauses;
            }
        }
        SubLObject cdolist_list_var = variations;
        SubLObject variation = NIL;
        variation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ordering_variations = cons(make_binary_formula(implies, make_formula(and, variation, UNPROVIDED), consequent), ordering_variations);
            cdolist_list_var = cdolist_list_var.rest();
            variation = cdolist_list_var.first();
        } 
        return nreverse(ordering_variations);
    }

    public static SubLObject ilp_export_pruning_for_rules(final SubLObject rules, final SubLObject stream) {
        if (NIL != rules) {
            ilp_export_section_comment(stream, $$$_pruning_rule_statements);
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ilp_export_prune_cycl_rule_directive(stream, rule);
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
        }
        return stream;
    }

    public static SubLObject ilp_export_pruning_for_known_rules(final SubLObject stream) {
        if (NIL != known_ilp_export_rules_p()) {
            ilp_export_section_comment(stream, $$$_pruning_rule_statements);
            SubLObject cdolist_list_var = all_known_ilp_export_rules();
            SubLObject cycl_rule = NIL;
            cycl_rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ilp_export_prune_cycl_rule_directive(stream, cycl_rule);
                cdolist_list_var = cdolist_list_var.rest();
                cycl_rule = cdolist_list_var.first();
            } 
        }
        return stream;
    }

    public static SubLObject ilp_export_prune_cycl_rule_directive(final SubLObject stream, final SubLObject cycl_rule) {
        write_string($str116$prune__, stream, UNPROVIDED, UNPROVIDED);
        ilp_export_cycl_rule(stream, cycl_rule);
        write_string($str117$_______, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject free_vars = cdolist_list_var = sentence_free_variables(cycl_rule, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string($str118$__var_, stream, UNPROVIDED, UNPROVIDED);
            write_string(ilp_export_term_name(var, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            write_string($str119$_, stream, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        write_string($str31$_, stream, UNPROVIDED, UNPROVIDED);
        return terpri(stream);
    }

    public static SubLObject ilp_export_cycl_rule(final SubLObject stream, final SubLObject cycl_rule) {
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = cycl_utilities.formula_operator(cycl_rule);
        if (pcase_var.eql($$implies)) {
            final SubLObject antecedent_clauses = cycl_utilities.formula_arg1(cycl_rule, UNPROVIDED);
            final SubLObject consequent_clause = cycl_utilities.formula_arg2(cycl_rule, UNPROVIDED);
            ilp_export_cycl_clause(stream, consequent_clause);
            write_string($str121$____, stream, UNPROVIDED, UNPROVIDED);
            SubLObject v_clauses = NIL;
            if (NIL != el_conjunction_p(antecedent_clauses)) {
                SubLObject current;
                final SubLObject datum = current = antecedent_clauses;
                SubLObject operator_$5 = NIL;
                destructuring_bind_must_consp(current, datum, $list122);
                operator_$5 = current.first();
                current = current.rest();
                final SubLObject conjuncted_clauses = v_clauses = current;
            } else {
                v_clauses = list(antecedent_clauses);
            }
            SubLObject list_var = NIL;
            SubLObject clause = NIL;
            SubLObject counter = NIL;
            list_var = v_clauses;
            clause = list_var.first();
            for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                if (!counter.isZero()) {
                    write_string($str123$__, stream, UNPROVIDED, UNPROVIDED);
                }
                ilp_export_cycl_clause(stream, clause);
            }
        } else {
            ilp_export_cycl_clause(stream, cycl_rule);
        }
        return stream;
    }

    public static SubLObject ilp_export_cycl_clause(final SubLObject stream, SubLObject cycl_clause) {
        if (cycl_utilities.formula_arg0(cycl_clause).eql($$isa)) {
            cycl_clause = make_unary_formula(cycl_utilities.formula_arg2(cycl_clause, UNPROVIDED), cycl_utilities.formula_arg1(cycl_clause, UNPROVIDED));
        }
        final SubLObject terms = cycl_utilities.formula_terms(cycl_clause, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if (argnum.numG(ONE_INTEGER)) {
                write_string($str123$__, stream, UNPROVIDED, UNPROVIDED);
            }
            if (argnum.isZero() && (NIL != fort_types_interface.collection_p(v_term))) {
                write_string(ilp_export_pred_name_for_collection(v_term), stream, UNPROVIDED, UNPROVIDED);
            } else {
                write_string(ilp_export_term_name(v_term, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            }
            if (argnum.isZero()) {
                write_string($str125$_, stream, UNPROVIDED, UNPROVIDED);
            }
        }
        write_string($str119$_, stream, UNPROVIDED, UNPROVIDED);
        return stream;
    }

    public static SubLObject current_ilp_export_type_to_instance_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_export_type_to_instance_information$.getDynamicValue(thread);
    }

    public static SubLObject current_ilp_export_instance_to_type_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ilp_export_instance_to_type_information$.getDynamicValue(thread);
    }

    public static SubLObject gather_ilp_export_type_and_instance_informationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_p($ilp_export_type_to_instance_information$.getDynamicValue(thread));
    }

    public static SubLObject with_ilp_export_type_and_instance_information(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list126, append(body, NIL));
    }

    public static SubLObject note_ilp_export_term_as_member_of_type(final SubLObject v_term, final SubLObject type) {
        if (NIL != gather_ilp_export_type_and_instance_informationP()) {
            dictionary_utilities.dictionary_pushnew(current_ilp_export_type_to_instance_information(), v_term, type, UNPROVIDED, UNPROVIDED);
            dictionary_utilities.dictionary_pushnew(current_ilp_export_instance_to_type_information(), type, v_term, UNPROVIDED, UNPROVIDED);
        }
        return v_term;
    }

    public static SubLObject lookup_ilp_export_term_type_memberships(final SubLObject v_term) {
        if (NIL != gather_ilp_export_type_and_instance_informationP()) {
            return dictionary.dictionary_lookup(current_ilp_export_type_to_instance_information(), v_term, NIL);
        }
        return NIL;
    }

    public static SubLObject lookup_ilp_export_type_instances(final SubLObject type) {
        if (NIL != gather_ilp_export_type_and_instance_informationP()) {
            return dictionary.dictionary_lookup(current_ilp_export_instance_to_type_information(), type, NIL);
        }
        return NIL;
    }

    public static SubLObject do_ilp_export_type_and_instance_information(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list127);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_term = NIL;
        SubLObject types = NIL;
        destructuring_bind_must_consp(current, datum, $list127);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list127);
        types = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_dictionary = $sym128$DICTIONARY;
            return list(PWHEN, $list130, list(CLET, list(bq_cons(v_dictionary, $list131)), listS(DO_DICTIONARY, list(v_term, types, v_dictionary), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list127);
        return NIL;
    }

    public static SubLObject compute_ilp_export_type_conversion_plugs_needed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject needed_plugs = NIL;
        if (NIL != gather_ilp_export_type_and_instance_informationP()) {
            final SubLObject type_co_occurrence = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            if (NIL != gather_ilp_export_type_and_instance_informationP()) {
                final SubLObject v_dictionary = current_ilp_export_type_to_instance_information();
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject types = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    compute_ilp_export_type_co_occurrence_tuples(types, type_co_occurrence);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            needed_plugs = set.set_element_list(type_co_occurrence);
        }
        return needed_plugs;
    }

    public static SubLObject compute_ilp_export_type_co_occurrence_tuples(final SubLObject types, SubLObject type_co_occurrence) {
        if (type_co_occurrence == UNPROVIDED) {
            type_co_occurrence = NIL;
        }
        if (NIL == type_co_occurrence) {
            type_co_occurrence = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        } else {
            assert NIL != set.set_p(type_co_occurrence) : "set.set_p(type_co_occurrence) " + "CommonSymbols.NIL != set.set_p(type_co_occurrence) " + type_co_occurrence;
        }
        SubLObject head = types.first();
        SubLObject cdolist_list_var;
        final SubLObject type_list = cdolist_list_var = types.rest();
        SubLObject tail = NIL;
        tail = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(cons(head, tail), type_co_occurrence);
            set.set_add(cons(tail, head), type_co_occurrence);
            head = tail;
            cdolist_list_var = cdolist_list_var.rest();
            tail = cdolist_list_var.first();
        } 
        return type_co_occurrence;
    }

    public static SubLObject get_ilp_export_type_co_occurrence_for_term(final SubLObject v_term, final SubLObject types) {
        if (NIL != types) {
            final SubLObject type_co_occurrence = compute_ilp_export_type_co_occurrence_tuples(types, UNPROVIDED);
            return set.set_element_list(type_co_occurrence);
        }
        return NIL;
    }

    public static SubLObject ilp_export_type_conversion_plug_information(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plugs = compute_ilp_export_type_conversion_plugs_needed();
        if (NIL != plugs) {
            ilp_export_section_comment(stream, $str134$_type_conversion_plug_definitions);
            SubLObject cdolist_list_var = plugs;
            SubLObject plug = NIL;
            plug = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ilp_export_type_and_instance_definition(stream, plug);
                cdolist_list_var = cdolist_list_var.rest();
                plug = cdolist_list_var.first();
            } 
            ilp_export_section_comment(stream, $$$_type_conversion_plug_extents_);
            if (NIL != gather_ilp_export_type_and_instance_informationP()) {
                final SubLObject v_dictionary = current_ilp_export_type_to_instance_information();
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject types = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ilp_export_type_conversion_plug_extent(stream, v_term, types);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        }
        return stream;
    }

    public static SubLObject ilp_export_type_and_instance_definition(final SubLObject stream, final SubLObject plug) {
        final SubLObject female_io_marker = CHAR_plus;
        final SubLObject male_io_marker = CHAR_hyphen;
        SubLObject female = NIL;
        SubLObject male = NIL;
        destructuring_bind_must_consp(plug, plug, $list136);
        female = plug.first();
        final SubLObject current = male = plug.rest();
        write_string($str137$___mode____, stream, UNPROVIDED, UNPROVIDED);
        write_string(ilp_export_conversion_plug_name(plug), stream, UNPROVIDED, UNPROVIDED);
        write_string($str125$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(string_utilities.to_string(female_io_marker), stream, UNPROVIDED, UNPROVIDED);
        write_string(ilp_export_mode_name_for_term(ilp_export_pred_name_for_collection(female)), stream, UNPROVIDED, UNPROVIDED);
        write_string($str138$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(string_utilities.to_string(male_io_marker), stream, UNPROVIDED, UNPROVIDED);
        write_string(ilp_export_mode_name_for_term(ilp_export_pred_name_for_collection(male)), stream, UNPROVIDED, UNPROVIDED);
        write_string($str139$___, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        if (NIL != current_ilp_export_inductive_target_predicate()) {
            aleph_export_predicate_determination_from_name(stream, current_ilp_export_inductive_target_predicate(), ilp_export_conversion_plug_name(plug), TWO_INTEGER);
        }
        return stream;
    }

    public static SubLObject ilp_export_type_conversion_plug_extent(final SubLObject stream, final SubLObject v_term, final SubLObject types) {
        SubLObject cdolist_list_var;
        final SubLObject specific_plugs = cdolist_list_var = get_ilp_export_type_co_occurrence_for_term(v_term, types);
        SubLObject plug = NIL;
        plug = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string(ilp_export_conversion_plug_name(plug), stream, UNPROVIDED, UNPROVIDED);
            write_string($str125$_, stream, UNPROVIDED, UNPROVIDED);
            write_string(ilp_export_term_name(v_term, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            write_string($str138$_, stream, UNPROVIDED, UNPROVIDED);
            write_string(ilp_export_term_name(v_term, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            write_string($str140$__, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            cdolist_list_var = cdolist_list_var.rest();
            plug = cdolist_list_var.first();
        } 
        return stream;
    }

    public static SubLObject clear_ilp_export_conversion_plug_name() {
        final SubLObject cs = $ilp_export_conversion_plug_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ilp_export_conversion_plug_name(final SubLObject plug) {
        return memoization_state.caching_state_remove_function_results_with_args($ilp_export_conversion_plug_name_caching_state$.getGlobalValue(), list(plug), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_export_conversion_plug_name_internal(final SubLObject plug) {
        SubLObject female = NIL;
        SubLObject male = NIL;
        destructuring_bind_must_consp(plug, plug, $list136);
        female = plug.first();
        final SubLObject current = male = plug.rest();
        final SubLObject female_name = ilp_export_pred_name_for_collection(female);
        final SubLObject male_name = ilp_export_pred_name_for_collection(male);
        return cconcatenate(female_name, new SubLObject[]{ $$$2, male_name, $$$Plug });
    }

    public static SubLObject ilp_export_conversion_plug_name(final SubLObject plug) {
        SubLObject caching_state = $ilp_export_conversion_plug_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ILP_EXPORT_CONVERSION_PLUG_NAME, $ilp_export_conversion_plug_name_caching_state$, NIL, EQUAL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, plug, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(ilp_export_conversion_plug_name_internal(plug)));
            memoization_state.caching_state_put(caching_state, plug, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject ilp_export_get_argisa_constraint(final SubLObject predicate, final SubLObject argpos, final SubLObject mt) {
        SubLObject argisa = ilp_export_get_argisa_constraints(predicate, argpos, mt).first();
        if (((NIL == argisa) && predicate.isList()) && $$IsaPredFn.eql(predicate.first())) {
            argisa = second(predicate);
        }
        return argisa;
    }

    public static SubLObject ilp_export_get_argisa_constraints(final SubLObject predicate, final SubLObject argpos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!$$ALEPH_ILPProgram.eql(current_ilp_export_style())) || (((!predicate.isList()) || (!$$IsaPredFn.eql(predicate.first()))) && (NIL == current_ilp_export_predicate_arg_constraints_dbase()))) {
            SubLObject assertions = NIL;
            SubLObject cols = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                assertions = kb_mapping.gather_gaf_arg_index(predicate, ONE_INTEGER, $$argIsa, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (assertions_high.gaf_arg2(assertion).eql(argpos)) {
                    cols = cons(assertions_high.gaf_arg3(assertion), cols);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            return genls.min_cols(cols, mt, UNPROVIDED);
        }
        final SubLObject values = get_ilp_export_predicate_arg_constraint(predicate, argpos, UNPROVIDED);
        if (NIL != values) {
            return values;
        }
        Errors.warn($str146$Should_have_gotten__A_argument_po, predicate, argpos);
        return list($$Thing);
    }

    public static SubLObject ilp_export_term_extent_header(final SubLObject stream, final SubLObject v_term, SubLObject mt, SubLObject should_export_mode_declarationsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (should_export_mode_declarationsP == UNPROVIDED) {
            should_export_mode_declarationsP = T;
        }
        final SubLObject pcase_var = current_ilp_export_style();
        if (pcase_var.eql($$FOIL_ILPProgram)) {
            foil_export_term_extent_header(stream, v_term, mt);
        } else
            if ((pcase_var.eql($$ALEPH_ILPProgram) && (NIL != should_export_mode_declarationsP)) && (NIL != aleph_export_mode_informationP())) {
                aleph_export_term_mode_declarations(stream, v_term, mt);
            }

        return stream;
    }

    public static SubLObject aleph_export_term_mode_declarations(final SubLObject stream, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        terpri(stream);
        if (NIL != fort_types_interface.collection_p(v_term)) {
            aleph_export_term_mode_declaration(stream, v_term, NIL, mt, UNPROVIDED);
        } else
            if (NIL != fort_types_interface.isa_predicateP(v_term, UNPROVIDED)) {
                SubLObject io_pairs = NIL;
                if (NIL != current_ilp_export_predicate_arg_constraints_dbase()) {
                    SubLObject result_pairs = ilp_export_get_predicate_argument_constraint_properties(v_term, $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread));
                    if (((NIL == result_pairs) && v_term.isList()) && $$IsaPredFn.eql(v_term.first())) {
                        result_pairs = list(list($str147$_, second(v_term)), list($str29$_, second(v_term)));
                    }
                    if (NIL == result_pairs) {
                        Errors.cerror($str148$Go_on_anyway_, $str149$We_did_not_get_a_mode_declaration, v_term);
                    }
                    io_pairs = result_pairs;
                } else {
                    final SubLObject mode_markers = get_all_ilp_export_mode_markers_for_style();
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    for (cdotimes_end_var = arity.arity_robust(v_term), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        io_pairs = ilp_export_compute_example_argument_lists(mode_markers, io_pairs);
                        io_pairs = ilp_export_compute_example_argument_lists(ilp_export_get_argisa_constraints(v_term, add(i, ONE_INTEGER), mt), io_pairs);
                    }
                }
                aleph_export_term_mode_declaration(stream, v_term, io_pairs, mt, $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread));
            }

        if (NIL != current_ilp_export_inductive_target_predicate()) {
            if (v_term.eql(current_ilp_export_inductive_target_predicate())) {
                final SubLObject io_pairs = ilp_export_get_predicate_argument_constraint_properties(v_term, makeBoolean(NIL == $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread)));
                if ((NIL != io_pairs) && (NIL != $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread))) {
                    aleph_export_term_mode_declaration(stream, v_term, io_pairs, mt, makeBoolean(NIL == $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread)));
                }
            }
            aleph_export_predicate_determination(stream, current_ilp_export_inductive_target_predicate(), v_term);
        }
        terpri(stream);
        return NIL;
    }

    public static SubLObject ilp_export_get_predicate_argument_constraint_properties(final SubLObject predicate, SubLObject should_ignore_target_predicateP) {
        if (should_ignore_target_predicateP == UNPROVIDED) {
            should_ignore_target_predicateP = NIL;
        }
        SubLObject io_pairs = NIL;
        final SubLObject in_out_markers = get_all_ilp_export_mode_markers_for_style();
        SubLObject in_markers = get_ilp_export_mode_marker_for_style(current_ilp_export_style(), $$programDenotesInputModeWith);
        SubLObject out_markers = get_ilp_export_mode_marker_for_style(current_ilp_export_style(), $$programDenotesOutputModeWith);
        if (!in_markers.isList()) {
            in_markers = list(in_markers);
        }
        if (!out_markers.isList()) {
            out_markers = list(out_markers);
        }
        SubLObject cdotimes_end_var;
        SubLObject argnum;
        SubLObject argpos;
        SubLObject output_collections;
        SubLObject input_collections;
        SubLObject in_outs;
        SubLObject ins_only;
        SubLObject outs_only;
        SubLObject in_out_pairs;
        SubLObject in_pairs;
        SubLObject out_pairs;
        for (cdotimes_end_var = arity.arity_robust(predicate), argnum = NIL, argnum = ZERO_INTEGER; argnum.numL(cdotimes_end_var); argnum = add(argnum, ONE_INTEGER)) {
            argpos = add(ONE_INTEGER, argnum);
            output_collections = ((NIL != should_ignore_target_predicateP) || (!predicate.eql(current_ilp_export_inductive_target_predicate()))) ? get_ilp_export_predicate_arg_constraint_property(predicate, argpos, $$programDenotesOutputModeWith, UNPROVIDED) : NIL;
            input_collections = (((NIL == output_collections) || (NIL != should_ignore_target_predicateP)) || (!predicate.eql(current_ilp_export_inductive_target_predicate()))) ? get_ilp_export_predicate_arg_constraint_property(predicate, argpos, $$programDenotesInputModeWith, UNPROVIDED) : NIL;
            in_outs = intersection(input_collections, output_collections, UNPROVIDED, UNPROVIDED);
            ins_only = set_difference(input_collections, output_collections, UNPROVIDED, UNPROVIDED);
            outs_only = set_difference(output_collections, input_collections, UNPROVIDED, UNPROVIDED);
            in_out_pairs = NIL;
            in_pairs = NIL;
            out_pairs = NIL;
            if (NIL != in_outs) {
                in_out_pairs = ilp_export_compute_example_argument_lists(in_outs, ilp_export_compute_example_argument_lists(in_out_markers, io_pairs));
            }
            if (NIL != ins_only) {
                in_pairs = ilp_export_compute_example_argument_lists(ins_only, ilp_export_compute_example_argument_lists(in_markers, io_pairs));
            }
            if (NIL != outs_only) {
                out_pairs = ilp_export_compute_example_argument_lists(outs_only, ilp_export_compute_example_argument_lists(out_markers, io_pairs));
            }
            io_pairs = append(in_out_pairs, in_pairs, out_pairs);
        }
        return Mapping.mapcar(REVERSE, io_pairs);
    }

    public static SubLObject aleph_export_term_mode_declaration(final SubLObject stream, final SubLObject v_term, final SubLObject io_pairs, SubLObject mt, SubLObject should_ignore_target_predicateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (should_ignore_target_predicateP == UNPROVIDED) {
            should_ignore_target_predicateP = NIL;
        }
        SubLObject cdolist_list_var = io_pairs;
        SubLObject io_pair = NIL;
        io_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mode_label = ((NIL == should_ignore_target_predicateP) && v_term.eql(current_ilp_export_inductive_target_predicate())) ? $$$modeh : $$$modeb;
            write_string($str153$___, stream, UNPROVIDED, UNPROVIDED);
            write_string(mode_label, stream, UNPROVIDED, UNPROVIDED);
            write_string($str154$___, stream, UNPROVIDED, UNPROVIDED);
            if (NIL != fort_types_interface.collection_p(v_term)) {
                format(stream, $str155$_a__a_, ilp_export_pred_name_for_collection(v_term), ilp_export_mode_name_for_term(ilp_export_term_name(v_term, UNPROVIDED)));
            } else {
                SubLObject previous = NIL;
                format(stream, $str156$_a_, ilp_export_term_name(v_term, UNPROVIDED));
                SubLObject cdolist_list_var_$6 = io_pair;
                SubLObject io_info = NIL;
                io_info = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    if (NIL != forts.fort_p(previous)) {
                        write_string($str138$_, stream, UNPROVIDED, UNPROVIDED);
                    }
                    if (io_info.isString()) {
                        write_string(io_info, stream, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL != forts.fort_p(io_info)) {
                            write_string(ilp_export_mode_name_for_term(ilp_export_pred_name_for_collection(io_info)), stream, UNPROVIDED, UNPROVIDED);
                        }

                    previous = io_info;
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    io_info = cdolist_list_var_$6.first();
                } 
                write_string($str119$_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str140$__, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            cdolist_list_var = cdolist_list_var.rest();
            io_pair = cdolist_list_var.first();
        } 
        return stream;
    }

    public static SubLObject foil_export_term_extent_header(final SubLObject stream, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        terpri(stream);
        if (NIL != fort_types_interface.collection_p(v_term)) {
            format(stream, $str155$_a__a_, ilp_export_pred_name_for_collection(v_term), ilp_export_term_name(v_term, UNPROVIDED));
        } else {
            final SubLObject v_arity = arity.arity_robust(v_term);
            format(stream, $str156$_a_, ilp_export_term_name(v_term, UNPROVIDED));
            SubLObject position;
            SubLObject col;
            SubLObject syntax_token;
            for (position = NIL, position = ONE_INTEGER; !position.numG(v_arity); position = number_utilities.f_1X(position)) {
                col = ilp_export_get_argisa_constraint(v_term, position, mt);
                syntax_token = (position.numE(v_arity)) ? $str119$_ : $str138$_;
                write_string(ilp_export_term_name(col, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
                write_string(syntax_token, stream, UNPROVIDED, UNPROVIDED);
            }
        }
        terpri(stream);
        return NIL;
    }

    public static SubLObject clear_ilp_export_mode_name_for_term() {
        final SubLObject cs = $ilp_export_mode_name_for_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ilp_export_mode_name_for_term(final SubLObject term_name) {
        return memoization_state.caching_state_remove_function_results_with_args($ilp_export_mode_name_for_term_caching_state$.getGlobalValue(), list(term_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_export_mode_name_for_term_internal(final SubLObject term_name) {
        return term_name;
    }

    public static SubLObject ilp_export_mode_name_for_term(final SubLObject term_name) {
        SubLObject caching_state = $ilp_export_mode_name_for_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ILP_EXPORT_MODE_NAME_FOR_TERM, $ilp_export_mode_name_for_term_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, term_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(ilp_export_mode_name_for_term_internal(term_name)));
            memoization_state.caching_state_put(caching_state, term_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject foil_export_assertion(final SubLObject stream, final SubLObject ass) {
        final SubLObject hl_formula = fi.assertion_hl_formula(ass, UNPROVIDED);
        foil_export_hl_formula(stream, hl_formula);
        return ass;
    }

    public static SubLObject foil_export_hl_formula(final SubLObject stream, final SubLObject hl_formula) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(hl_formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            index = add(index, ONE_INTEGER);
            if (!index.numE(ONE_INTEGER)) {
                write_string($str123$__, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string(ilp_export_term_name(arg, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        terpri(stream);
        return hl_formula;
    }

    public static SubLObject aleph_export_hl_formula(final SubLObject stream, SubLObject hl_formula, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != is_exporting_negative_to_backgroundP) {
                        write_string($str160$false____, stream, UNPROVIDED, UNPROVIDED);
                    }
                    if ($$not.eql(cycl_utilities.formula_arg0(hl_formula))) {
                        hl_formula = cycl_utilities.formula_arg1(hl_formula, UNPROVIDED);
                    }
                    ilp_export_cycl_clause(stream, hl_formula);
                    write_string($str31$_, stream, UNPROVIDED, UNPROVIDED);
                    terpri(stream);
                    return hl_formula;
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
        if (NIL != error_message) {
            Errors.warn(cconcatenate($str163$Unable_to_export_assertion__, new SubLObject[]{ string_utilities.to_string(hl_formula), $str164$__, error_message }));
            return hl_formula;
        }
        return NIL;
    }

    public static SubLObject ilp_export_assertion_for_predicate_extent(final SubLObject stream, final SubLObject ass, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        final SubLObject pcase_var = current_ilp_export_style();
        if (pcase_var.eql($$FOIL_ILPProgram)) {
            foil_export_assertion(stream, ass);
        } else
            if (pcase_var.eql($$ALEPH_ILPProgram)) {
                final SubLObject hl_formula = fi.assertion_hl_formula(ass, UNPROVIDED);
                aleph_export_hl_formula(stream, hl_formula, is_exporting_negative_to_backgroundP);
            }

        return ass;
    }

    public static SubLObject ilp_export_hl_formula_for_predicate_extent(final SubLObject stream, final SubLObject hl_formula, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        final SubLObject pcase_var = current_ilp_export_style();
        if (pcase_var.eql($$FOIL_ILPProgram)) {
            foil_export_hl_formula(stream, hl_formula);
        } else
            if (pcase_var.eql($$ALEPH_ILPProgram)) {
                aleph_export_hl_formula(stream, hl_formula, is_exporting_negative_to_backgroundP);
            }

        return hl_formula;
    }

    public static SubLObject variable_args_for_arity(final SubLObject v_arity) {
        return list_utilities.first_n(v_arity, $variables_for_arity$.getGlobalValue());
    }

    public static SubLObject clear_ilp_export_gather_predicate_extent_index() {
        final SubLObject cs = $ilp_export_gather_predicate_extent_index_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ilp_export_gather_predicate_extent_index(final SubLObject predicate, final SubLObject mt, final SubLObject truth) {
        return memoization_state.caching_state_remove_function_results_with_args($ilp_export_gather_predicate_extent_index_caching_state$.getGlobalValue(), list(predicate, mt, truth), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_export_gather_predicate_extent_index_internal(final SubLObject predicate, final SubLObject mt, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((truth == $TRUE) && (NIL != el_formula_with_operator_p(predicate, $$IsaPredFn))) {
            SubLObject assertion_specs = NIL;
            SubLObject binding_lists = NIL;
            final SubLObject template = bq_cons(predicate, $list169);
            SubLObject cdolist_list_var;
            binding_lists = cdolist_list_var = inference_kernel.new_cyc_query(template, mt, listS($kw170$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, new SubLObject[]{ T, $PRODUCTIVITY_LIMIT, $POSITIVE_INFINITY, $kw173$ALLOW_INDETERMINATE_RESULTS_, NIL, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $ALLOWED_RULES, list(kb_utilities.find_object_by_hl_external_id_string($str177$33210D820C0D810D831E190FA46163653), kb_utilities.find_object_by_hl_external_id_string($str178$33210D820D820D831E190FA4626435383)), $list179 }));
            SubLObject binding_list = NIL;
            binding_list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assertion_spec = bindings.apply_bindings(binding_list, template);
                assertion_specs = cons(assertion_spec, assertion_specs);
                cdolist_list_var = cdolist_list_var.rest();
                binding_list = cdolist_list_var.first();
            } 
            return assertion_specs;
        }
        if (truth == $TRUE) {
            SubLObject assertions = NIL;
            final SubLObject pred_arity = arity.arity_robust(predicate);
            final SubLObject pred_args = variable_args_for_arity(pred_arity);
            final SubLObject query_formula = make_formula(predicate, pred_args, UNPROVIDED);
            final SubLObject query_parameters = $list180;
            SubLObject cdolist_list_var2;
            final SubLObject query_results = cdolist_list_var2 = ask_utilities.query_template(pred_args, query_formula, mt, query_parameters);
            SubLObject query_result = NIL;
            query_result = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                assertions = cons(make_formula(predicate, query_result, UNPROVIDED), assertions);
                cdolist_list_var2 = cdolist_list_var2.rest();
                query_result = cdolist_list_var2.first();
            } 
            if (NIL != assertions) {
                return assertions;
            }
            Errors.warn($str181$Found_no_base_facts_when_running_, new SubLObject[]{ pred_args, query_formula, mt, query_parameters });
        }
        SubLObject assertions = NIL;
        SubLObject non_wff_examples = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(predicate)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$7 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$9 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(predicate);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                SubLObject done_var_$10 = NIL;
                                final SubLObject token_var_$11 = NIL;
                                while (NIL == done_var_$10) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                    final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(ass));
                                    if ((NIL != valid_$12) && (NIL == wff_utilities.non_wff_cached_p(ass))) {
                                        assertions = cons(ass, assertions);
                                    }
                                    done_var_$10 = makeBoolean(NIL == valid_$12);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$9, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$8, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        assertions = nreverse(list_utilities.fast_delete_duplicates(assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (truth == $FALSE) {
            mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = $$exampleSentence_Negative;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            SubLObject final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                SubLObject done_var_$11 = NIL;
                                final SubLObject token_var_$12 = NIL;
                                while (NIL == done_var_$11) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$12);
                                    final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(assertion));
                                    if (NIL != valid_$13) {
                                        final SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
                                        non_wff_examples = cons(cycl_utilities.formula_arg2(hl_formula, UNPROVIDED), non_wff_examples);
                                    }
                                    done_var_$11 = makeBoolean(NIL == valid_$13);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            non_wff_examples = nreverse(non_wff_examples);
        }
        return nconc(assertions, non_wff_examples);
    }

    public static SubLObject ilp_export_gather_predicate_extent_index(final SubLObject predicate, final SubLObject mt, final SubLObject truth) {
        SubLObject caching_state = $ilp_export_gather_predicate_extent_index_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ILP_EXPORT_GATHER_PREDICATE_EXTENT_INDEX, $ilp_export_gather_predicate_extent_index_caching_state$, NIL, EQUAL, THREE_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, mt, truth);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && truth.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ilp_export_gather_predicate_extent_index_internal(predicate, mt, truth)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt, truth));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject ilp_export_assertion_spec(final SubLObject stream, final SubLObject assertion_spec, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        if (NIL != assertion_handles.assertion_p(assertion_spec)) {
            ilp_export_assertion_for_predicate_extent(stream, assertion_spec, is_exporting_negative_to_backgroundP);
        } else {
            ilp_export_hl_formula_for_predicate_extent(stream, assertion_spec, is_exporting_negative_to_backgroundP);
        }
        return NIL;
    }

    public static SubLObject assertion_spec_hl_formula(final SubLObject assertion_spec) {
        if (NIL != assertion_handles.assertion_p(assertion_spec)) {
            return fi.assertion_hl_formula(assertion_spec, UNPROVIDED);
        }
        return assertion_spec;
    }

    public static SubLObject assertion_spec_hl_formula_args(final SubLObject assertion_spec) {
        return cycl_utilities.formula_args(assertion_spec_hl_formula(assertion_spec), UNPROVIDED);
    }

    public static SubLObject ilp_export_symmetric_assertion_spec(final SubLObject stream, final SubLObject assertion_spec) {
        final SubLObject hl_formula = assertion_spec_hl_formula(assertion_spec);
        if (NIL != kb_accessors.binary_predicateP(cycl_utilities.formula_arg0(hl_formula))) {
            ilp_export_hl_formula_for_predicate_extent(stream, make_binary_formula(cycl_utilities.formula_arg0(hl_formula), cycl_utilities.formula_arg2(hl_formula, UNPROVIDED), cycl_utilities.formula_arg1(hl_formula, UNPROVIDED)), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ilp_export_predicate_extent(final SubLObject stream, final SubLObject pred, final SubLObject mt, SubLObject should_export_modesP, SubLObject is_exporting_negative_to_backgroundP) {
        if (should_export_modesP == UNPROVIDED) {
            should_export_modesP = T;
        }
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        terpri(stream);
        if (NIL == is_exporting_negative_to_backgroundP) {
            ilp_export_term_extent_header(stream, pred, mt, should_export_modesP);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != ilp_term_export_positive_examplesP()) {
                final SubLObject is_symmetricP = kb_accessors.symmetric_predicateP(pred);
                SubLObject cdolist_list_var = ilp_export_gather_predicate_extent_index(pred, mt, $TRUE);
                SubLObject assertion_spec = NIL;
                assertion_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ilp_export_assertion_spec(stream, assertion_spec, UNPROVIDED);
                    if (NIL != is_symmetricP) {
                        ilp_export_symmetric_assertion_spec(stream, assertion_spec);
                    }
                    note_ilp_export_negative_examples_implied_by_background_assertion_spec(assertion_spec, mt);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_spec = cdolist_list_var.first();
                } 
                note_ilp_export_negative_examples_via_type_constraints(pred, mt);
            }
            if (NIL != ilp_term_export_negative_examplesP()) {
                final SubLObject negative_cases = ilp_export_gather_predicate_extent_index(pred, mt, $FALSE);
                if (NIL != negative_cases) {
                    SubLObject cdolist_list_var = negative_cases;
                    SubLObject negative_case = NIL;
                    negative_case = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ilp_export_assertion_spec(stream, negative_case, is_exporting_negative_to_backgroundP);
                        cdolist_list_var = cdolist_list_var.rest();
                        negative_case = cdolist_list_var.first();
                    } 
                }
                if (NIL != is_exporting_negative_to_backgroundP) {
                    if ((NIL != ilp_term_export_synthetic_negative_examplesP()) && $$ALEPH_ILPProgram.eql(current_ilp_export_style())) {
                        ilp_export_negative_examples_gathered(stream, is_exporting_negative_to_backgroundP);
                    }
                    return stream;
                }
                if (pred.eql(current_ilp_export_inductive_target_predicate())) {
                    ilp_export_section_comment(stream, $str186$_explicitly_asserted_negative_exa);
                    if ($$FOIL_ILPProgram.eql(current_ilp_export_style())) {
                        format(stream, $str187$___);
                    }
                    SubLObject cdolist_list_var = negative_cases;
                    SubLObject negative_case = NIL;
                    negative_case = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ilp_export_assertion_spec(stream, negative_case, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        negative_case = cdolist_list_var.first();
                    } 
                }
                if (((NIL != ilp_term_export_synthetic_negative_examplesP()) && $$ALEPH_ILPProgram.eql(current_ilp_export_style())) && pred.eql(current_ilp_export_inductive_target_predicate())) {
                    ilp_export_negative_examples_gathered(stream, UNPROVIDED);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if ($$FOIL_ILPProgram.eql(current_ilp_export_style())) {
            format(stream, $str188$___);
        }
        return stream;
    }

    public static SubLObject note_ilp_export_negative_examples_via_type_constraints(final SubLObject pred, final SubLObject mt) {
        SubLObject v_arity;
        SubLObject i;
        SubLObject argnum;
        for (v_arity = arity.arity_robust(pred), i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            note_ilp_export_negative_examples_via_arg_isa_constraints(pred, argnum, mt);
        }
        return NIL;
    }

    public static SubLObject note_ilp_export_negative_examples_via_arg_isa_constraints(final SubLObject pred, final SubLObject argnum, final SubLObject mt) {
        final SubLObject export_type = get_ilp_export_predicate_arg_constraint(pred, argnum, UNPROVIDED).first();
        final SubLObject actual_arg_types = ilp_argn_isa(pred, argnum, mt);
        SubLObject cdolist_list_var;
        final SubLObject negative_term_candidates = cdolist_list_var = lookup_ilp_export_type_instances(export_type);
        SubLObject negative_term_candidate = NIL;
        negative_term_candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = actual_arg_types;
            SubLObject actual_arg_type = NIL;
            actual_arg_type = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                if ((NIL == isa.isaP(negative_term_candidate, actual_arg_type, mt, UNPROVIDED)) && (NIL != isa.not_isaP(negative_term_candidate, actual_arg_type, mt, UNPROVIDED))) {
                    note_ilp_export_negative_term_example_via_arg_isa_constraint(pred, argnum, negative_term_candidate);
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                actual_arg_type = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            negative_term_candidate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject ilp_argn_isa(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != el_formula_with_operator_p(pred, $$IsaPredFn)) && ONE_INTEGER.numE(argnum)) {
            return list(second(pred));
        }
        return kb_accessors.argn_isa(pred, argnum, mt);
    }

    public static SubLObject lookup_ilp_predicate_argnum_candidate_terms(final SubLObject pred, final SubLObject argnum) {
        final SubLObject export_type = get_ilp_export_predicate_arg_constraint(pred, argnum, UNPROVIDED).first();
        return lookup_ilp_export_type_instances(export_type);
    }

    public static SubLObject note_ilp_export_negative_term_example_via_arg_isa_constraint(final SubLObject pred, final SubLObject term_argnum, final SubLObject negative_term_candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity_robust(pred);
        SubLObject sentence_args = NIL;
        SubLObject i;
        SubLObject argnum;
        SubLObject variable;
        SubLObject export_type;
        SubLObject term_candidates;
        SubLObject term_candidate;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            if (argnum.numE(term_argnum)) {
                sentence_args = cons(negative_term_candidate, sentence_args);
            } else
                if (NIL != $ilp_export_allow_variables_in_negative_examplesP$.getDynamicValue(thread)) {
                    variable = ilp_export_negative_example_argnum_variable(argnum);
                    sentence_args = cons(variable, sentence_args);
                } else {
                    export_type = get_ilp_export_predicate_arg_constraint(pred, argnum, UNPROVIDED).first();
                    term_candidates = lookup_ilp_export_type_instances(export_type);
                    term_candidate = list_utilities.random_element(term_candidates);
                    sentence_args = cons(term_candidate, sentence_args);
                }

        }
        sentence_args = nreverse(sentence_args);
        final SubLObject negative_example_sentence = make_formula(pred, sentence_args, UNPROVIDED);
        note_ilp_export_negative_example(negative_example_sentence, $$argIsa);
        return NIL;
    }

    public static SubLObject clear_ilp_export_negative_example_argnum_variable() {
        final SubLObject cs = $ilp_export_negative_example_argnum_variable_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ilp_export_negative_example_argnum_variable(final SubLObject argnum) {
        return memoization_state.caching_state_remove_function_results_with_args($ilp_export_negative_example_argnum_variable_caching_state$.getGlobalValue(), list(argnum), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_export_negative_example_argnum_variable_internal(final SubLObject argnum) {
        return intern(cconcatenate($str190$_ARG, format_nil.format_nil_s_no_copy(argnum)), UNPROVIDED);
    }

    public static SubLObject ilp_export_negative_example_argnum_variable(final SubLObject argnum) {
        SubLObject caching_state = $ilp_export_negative_example_argnum_variable_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ILP_EXPORT_NEGATIVE_EXAMPLE_ARGNUM_VARIABLE, $ilp_export_negative_example_argnum_variable_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, argnum, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(ilp_export_negative_example_argnum_variable_internal(argnum)));
            memoization_state.caching_state_put(caching_state, argnum, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject ilp_export_compute_example_argument_lists(final SubLObject candidates, SubLObject arglists) {
        if (NIL == arglists) {
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = NIL;
            candidate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                arglists = cons(list(candidate), arglists);
                cdolist_list_var = cdolist_list_var.rest();
                candidate = cdolist_list_var.first();
            } 
            return arglists;
        }
        if (NIL == candidates) {
            return arglists;
        }
        SubLObject new_arglists = NIL;
        SubLObject cdolist_list_var2 = arglists;
        SubLObject arglist = NIL;
        arglist = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$19 = candidates;
            SubLObject candidate2 = NIL;
            candidate2 = cdolist_list_var_$19.first();
            while (NIL != cdolist_list_var_$19) {
                new_arglists = cons(cons(candidate2, arglist), new_arglists);
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                candidate2 = cdolist_list_var_$19.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            arglist = cdolist_list_var2.first();
        } 
        return new_arglists;
    }

    public static SubLObject ilp_export_collection_extent(final SubLObject stream, final SubLObject coll, final SubLObject mt, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        note_ilp_export_collection(coll);
        ilp_export_term_extent_header(stream, coll, mt, UNPROVIDED);
        SubLObject positive_instances = NIL;
        SubLObject negative_instances = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != ilp_term_export_positive_examplesP()) {
                positive_instances = isa.all_fort_instances(coll, mt, UNPROVIDED);
                if (NIL != positive_instances) {
                    SubLObject cdolist_list_var = positive_instances;
                    SubLObject inst = NIL;
                    inst = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(stream, $str192$_a__, ilp_export_term_name(inst, UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        inst = cdolist_list_var.first();
                    } 
                }
            }
            if (NIL != ilp_term_export_negative_examplesP()) {
                negative_instances = isa.all_not_instances(coll, mt, UNPROVIDED);
                if (NIL != negative_instances) {
                    if ($$FOIL_ILPProgram.eql(current_ilp_export_style())) {
                        format(stream, $str187$___);
                    }
                    SubLObject cdolist_list_var = negative_instances;
                    SubLObject ninst = NIL;
                    ninst = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(stream, $str192$_a__, ilp_export_term_name(ninst, UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        ninst = cdolist_list_var.first();
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if ($$FOIL_ILPProgram.eql(current_ilp_export_style())) {
            format(stream, $str188$___);
        }
        return stream;
    }

    public static SubLObject ilp_export_pred_or_coll_extent(final SubLObject stream, final SubLObject v_term, final SubLObject mt, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        if ((NIL != bad_ilp_export_predicate_p(v_term)) || (NIL != bad_ilp_export_collection_p(v_term))) {
            format(T, $str193$Not_outputting__a__unusable_argIs, v_term);
            return NIL;
        }
        if (NIL == filter_ilp_term_from_extentP(v_term)) {
            if (NIL != fort_types_interface.isa_predicateP(v_term, UNPROVIDED)) {
                ilp_export_predicate_extent(stream, v_term, mt, T, is_exporting_negative_to_backgroundP);
            } else {
                ilp_export_collection_extent(stream, v_term, mt, is_exporting_negative_to_backgroundP);
            }
        }
        return NIL;
    }

    public static SubLObject ilp_export_pred_or_coll_extent_new(final SubLObject stream, final SubLObject v_term, final SubLObject mt, SubLObject is_exporting_negative_to_backgroundP) {
        if (is_exporting_negative_to_backgroundP == UNPROVIDED) {
            is_exporting_negative_to_backgroundP = NIL;
        }
        if ((NIL != bad_ilp_export_predicate_p(v_term)) || (NIL != bad_ilp_export_collection_p(v_term))) {
            format(T, $str193$Not_outputting__a__unusable_argIs, v_term);
            return NIL;
        }
        if (NIL == filter_ilp_term_from_extentP(v_term)) {
            if (NIL != fort_types_interface.isa_predicateP(v_term, UNPROVIDED)) {
                ilp_export_predicate_extent(stream, v_term, mt, NIL, is_exporting_negative_to_backgroundP);
            } else {
                ilp_export_collection_extent(stream, v_term, mt, is_exporting_negative_to_backgroundP);
            }
        }
        return NIL;
    }

    public static SubLObject aleph_export_predicate_determination(final SubLObject stream, final SubLObject target_pred, final SubLObject source_pred) {
        final SubLObject source_pred_name = (NIL != fort_types_interface.collection_p(source_pred)) ? ilp_export_pred_name_for_collection(source_pred) : ilp_export_term_name(source_pred, UNPROVIDED);
        final SubLObject source_arity = (NIL != fort_types_interface.isa_predicateP(source_pred, UNPROVIDED)) ? arity.arity_robust(source_pred) : ONE_INTEGER;
        return aleph_export_predicate_determination_from_name(stream, target_pred, source_pred_name, source_arity);
    }

    public static SubLObject aleph_export_predicate_determination_from_name(final SubLObject stream, final SubLObject target_pred, final SubLObject source_pred_name, final SubLObject source_arity) {
        write_string($str194$___determination_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != fort_types_interface.collection_p(target_pred)) {
            write_string(ilp_export_pred_name_for_collection(target_pred), stream, UNPROVIDED, UNPROVIDED);
        } else {
            write_string(ilp_export_term_name(target_pred, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str195$_, stream, UNPROVIDED, UNPROVIDED);
        princ(NIL != fort_types_interface.isa_predicateP(target_pred, UNPROVIDED) ? arity.arity_robust(target_pred) : ONE_INTEGER, stream);
        write_string($str138$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(source_pred_name, stream, UNPROVIDED, UNPROVIDED);
        write_string($str195$_, stream, UNPROVIDED, UNPROVIDED);
        princ(source_arity, stream);
        write_string($str140$__, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        return target_pred;
    }

    public static SubLObject ilp_export_find_type_extent(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject set_contents_var = set.do_set_internal($ilp_terms_to_export$.getDynamicValue(thread));
            SubLObject basis_object;
            SubLObject state;
            SubLObject v_term;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                v_term = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, v_term)) && (NIL != isa.isaP(v_term, col, UNPROVIDED, UNPROVIDED))) {
                    item_var = v_term;
                    if (NIL == member(item_var, values, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        values = cons(item_var, values);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (((NIL == values) && col.isList()) && $$IsaPredFn.eql(col.first())) {
            values = cons(second(col), values);
        }
        if (NIL == values) {
            format(T, $str196$_________WARNING___a_found_contin, col);
            return list($CONTINUOUS);
        }
        return nreverse(values);
    }

    public static SubLObject aleph_export_pred_mode_determination_new(final SubLObject stream, final SubLObject pred, final SubLObject target_pred, final SubLObject is_not_header) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != is_not_header) && pred.eql(target_pred)) && (NIL == $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread))) {
            return NIL;
        }
        aleph_export_predicate_determination(stream, target_pred, pred);
        return NIL;
    }

    public static SubLObject aleph_create_modes_list(final SubLObject possible_modes, final SubLObject cols) {
        SubLObject result = NIL;
        final SubLObject len = length(cols);
        SubLObject cdolist_list_var;
        final SubLObject lists = cdolist_list_var = list_utilities.cartesian_product(make_list(len, possible_modes), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject list = NIL;
        list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject partial_result = NIL;
            SubLObject element = NIL;
            SubLObject element_$20 = NIL;
            SubLObject col = NIL;
            SubLObject col_$21 = NIL;
            element = list;
            element_$20 = element.first();
            col = reverse(cols);
            col_$21 = col.first();
            while ((NIL != col) || (NIL != element)) {
                partial_result = cons(col_$21, partial_result);
                partial_result = cons(element_$20, partial_result);
                element = element.rest();
                element_$20 = element.first();
                col = col.rest();
                col_$21 = col.first();
            } 
            result = cons(partial_result, result);
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject aleph_export_pred_mode_declaration_new(final SubLObject stream, final SubLObject pred, final SubLObject target_pred, final SubLObject mt, final SubLObject is_not_header, SubLObject export_type, SubLObject modeh_mode) {
        if (export_type == UNPROVIDED) {
            export_type = $ALL_POSITIVE;
        }
        if (modeh_mode == UNPROVIDED) {
            modeh_mode = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != is_not_header) && pred.eql(target_pred)) && (NIL == $ilp_allow_focal_term_in_antecedent$.getDynamicValue(thread))) {
            return NIL;
        }
        SubLObject modes = NIL;
        if (NIL != modeh_mode) {
            modes = list(modeh_mode);
        } else {
            modes = aleph_export_term_mode_declaration_new_int(pred, export_type);
        }
        aleph_export_term_mode_declaration(stream, pred, modes, mt, is_not_header);
        return NIL;
    }

    public static SubLObject aleph_export_term_all_hash_mode(final SubLObject mode) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = mode;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != evenp(index)) && (!$str198$_.equal(elem))) {
                return NIL;
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject aleph_export_term_all_minus_mode(final SubLObject mode) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = mode;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != evenp(index)) && (!$str29$_.equal(elem))) {
                return NIL;
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject aleph_export_term_mode_declaration_new_int(final SubLObject pred, SubLObject export_type) {
        if (export_type == UNPROVIDED) {
            export_type = $ALL_POSITIVE;
        }
        SubLObject cols = NIL;
        SubLObject mode_flags = NIL;
        final SubLObject v_arity = arity.arity_robust(pred);
        SubLObject modes = NIL;
        SubLObject i;
        SubLObject type;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            type = get_ilp_export_predicate_arg_constraint(pred, add(ONE_INTEGER, i), UNPROVIDED).first();
            cols = cons(type, cols);
        }
        cols = nreverse(cols);
        if (export_type == $ALL_POSITIVE) {
            mode_flags = $list199;
        } else
            if (export_type == $ALL_EXCEPT_HASH) {
                mode_flags = $list201;
            } else
                if ((export_type == $ALL) || (export_type == $ALL_EXCEPT_DOUBLE_HASH_OR_DOUBLE_NEGATIVE)) {
                    mode_flags = $list204;
                } else {
                    Errors.cerror($str206$Got_invalid_mode___A__, export_type);
                }


        modes = aleph_create_modes_list(mode_flags, cols);
        if (export_type == $ALL_EXCEPT_DOUBLE_HASH_OR_DOUBLE_NEGATIVE) {
            modes = remove_if(ALEPH_EXPORT_TERM_ALL_HASH_MODE, modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            modes = remove_if(ALEPH_EXPORT_TERM_ALL_MINUS_MODE, modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return modes;
    }

    public static SubLObject aleph_export_mode_declarations_new(final SubLObject stream, final SubLObject target_pred, final SubLObject terms, final SubLObject mt, SubLObject modeh_mode) {
        if (modeh_mode == UNPROVIDED) {
            modeh_mode = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type_collections = NIL;
        final SubLObject colls = remove_if($sym209$ISA_PREDICATE_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject preds = cdolist_list_var = remove_if(COLLECTION_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject pos;
            SubLObject item_var;
            for (pos = NIL, pos = ONE_INTEGER; !pos.numG(arity.arity_robust(pred)); pos = number_utilities.f_1X(pos)) {
                item_var = ilp_export_get_argisa_constraint(pred, pos, mt);
                if (NIL == member(item_var, type_collections, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    type_collections = cons(item_var, type_collections);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = colls;
        SubLObject coll = NIL;
        coll = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var2 = coll;
            if (NIL == member(item_var2, type_collections, symbol_function(EQL), symbol_function(IDENTITY))) {
                type_collections = cons(item_var2, type_collections);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coll = cdolist_list_var.first();
        } 
        ilp_export_section_comment(stream, $$$Mode_declarations);
        aleph_export_pred_mode_declaration_new(stream, target_pred, target_pred, mt, NIL, $ALL_POSITIVE, modeh_mode);
        final SubLObject _prev_bind_0 = $ilp_terms_filter_from_extent$.currentBinding(thread);
        try {
            $ilp_terms_filter_from_extent$.bind(cons(target_pred, $ilp_terms_filter_from_extent$.getDynamicValue(thread)), thread);
            terpri(stream);
            SubLObject cdolist_list_var2 = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                aleph_export_pred_mode_declaration_new(stream, v_term, target_pred, mt, T, $ALL, UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term = cdolist_list_var2.first();
            } 
            terpri(stream);
            cdolist_list_var2 = terms;
            v_term = NIL;
            v_term = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                aleph_export_pred_mode_determination_new(stream, v_term, target_pred, T);
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term = cdolist_list_var2.first();
            } 
        } finally {
            $ilp_terms_filter_from_extent$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ilp_export_type_extents_new(final SubLObject stream, final SubLObject terms, final SubLObject mt) {
        ilp_export_section_comment(stream, $$$Types);
        SubLObject type_collections = NIL;
        final SubLObject colls = remove_if($sym209$ISA_PREDICATE_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject preds = cdolist_list_var = remove_if(COLLECTION_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject pos;
            SubLObject item_var;
            for (pos = NIL, pos = ONE_INTEGER; !pos.numG(arity.arity_robust(pred)); pos = number_utilities.f_1X(pos)) {
                item_var = ilp_export_get_argisa_constraint(pred, pos, mt);
                if (NIL == member(item_var, type_collections, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    type_collections = cons(item_var, type_collections);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = colls;
        SubLObject coll = NIL;
        coll = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var2 = coll;
            if (NIL == member(item_var2, type_collections, symbol_function(EQL), symbol_function(IDENTITY))) {
                type_collections = cons(item_var2, type_collections);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coll = cdolist_list_var.first();
        } 
        cdolist_list_var = type_collections;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_ilp_export_collection(col);
            final SubLObject extent = ilp_export_find_type_extent(col, mt);
            ilp_export_type_extent_new(stream, col, extent);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        terpri(stream);
        return NIL;
    }

    public static SubLObject ilp_export_type_extent_new(final SubLObject stream, final SubLObject type, SubLObject extent) {
        if (NIL == bad_ilp_export_collection_p(type)) {
            final SubLObject col_predicate_name = ilp_export_pred_name_for_collection(type);
            final SubLObject item_var = list($$SomeFn, type);
            if (NIL == member(item_var, extent, symbol_function(EQL), symbol_function(IDENTITY))) {
                extent = cons(item_var, extent);
            }
            SubLObject cdolist_list_var = extent;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                note_ilp_export_term_as_member_of_type(v_term, type);
                write_string(col_predicate_name, stream, UNPROVIDED, UNPROVIDED);
                write_string($str125$_, stream, UNPROVIDED, UNPROVIDED);
                write_string(ilp_export_term_name(v_term, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
                write_string($str140$__, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject ilp_export_type_extents(final SubLObject stream, final SubLObject terms, final SubLObject mt) {
        SubLObject type_collections = NIL;
        final SubLObject colls = remove_if($sym209$ISA_PREDICATE_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject preds = cdolist_list_var = remove_if(COLLECTION_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject pos;
            SubLObject item_var;
            for (pos = NIL, pos = ONE_INTEGER; !pos.numG(arity.arity_robust(pred)); pos = number_utilities.f_1X(pos)) {
                item_var = ilp_export_get_argisa_constraint(pred, pos, mt);
                if (NIL == member(item_var, type_collections, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    type_collections = cons(item_var, type_collections);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = colls;
        SubLObject coll = NIL;
        coll = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var2 = coll;
            if (NIL == member(item_var2, type_collections, symbol_function(EQL), symbol_function(IDENTITY))) {
                type_collections = cons(item_var2, type_collections);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coll = cdolist_list_var.first();
        } 
        cdolist_list_var = type_collections;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_ilp_export_collection(col);
            final SubLObject extent = ilp_export_find_type_extent(col, mt);
            ilp_export_type_extent(stream, col, extent);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject ilp_export_type_extent(final SubLObject stream, final SubLObject type, final SubLObject extent) {
        if (NIL == bad_ilp_export_collection_p(type)) {
            final SubLObject pcase_var = current_ilp_export_style();
            if (pcase_var.eql($$FOIL_ILPProgram)) {
                format(stream, $str212$_a__, ilp_export_term_name(type, UNPROVIDED));
                SubLObject list_var = NIL;
                SubLObject v_term = NIL;
                SubLObject counter = NIL;
                list_var = extent;
                v_term = list_var.first();
                for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                    note_ilp_export_term_as_member_of_type(v_term, type);
                    if (!counter.isZero()) {
                        write_string($str123$__, stream, UNPROVIDED, UNPROVIDED);
                    }
                    write_string(ilp_export_term_name(v_term, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
                }
                write_string($str31$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
            } else
                if (pcase_var.eql($$ALEPH_ILPProgram)) {
                    ilp_export_section_comment(stream, cconcatenate($$$type_extent_for_, format_nil.format_nil_a_no_copy(type)));
                    final SubLObject col_predicate_name = ilp_export_pred_name_for_collection(type);
                    aleph_export_colpred_mode_statement(stream, col_predicate_name, CHAR_plus);
                    if (NIL != current_ilp_export_inductive_target_predicate()) {
                        aleph_export_predicate_determination(stream, current_ilp_export_inductive_target_predicate(), type);
                    }
                    SubLObject cdolist_list_var = extent;
                    SubLObject v_term2 = NIL;
                    v_term2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_ilp_export_term_as_member_of_type(v_term2, type);
                        write_string(col_predicate_name, stream, UNPROVIDED, UNPROVIDED);
                        write_string($str125$_, stream, UNPROVIDED, UNPROVIDED);
                        write_string(ilp_export_term_name(v_term2, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
                        write_string($str140$__, stream, UNPROVIDED, UNPROVIDED);
                        terpri(stream);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term2 = cdolist_list_var.first();
                    } 
                }

        }
        return NIL;
    }

    public static SubLObject aleph_export_colpred_mode_statement(final SubLObject stream, final SubLObject col_predicate_name, final SubLObject io_marker) {
        write_string($str214$___mode___, stream, UNPROVIDED, UNPROVIDED);
        write_string(col_predicate_name, stream, UNPROVIDED, UNPROVIDED);
        write_string($str125$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(string_utilities.to_string(io_marker), stream, UNPROVIDED, UNPROVIDED);
        write_string(ilp_export_mode_name_for_term(col_predicate_name), stream, UNPROVIDED, UNPROVIDED);
        write_string($str139$___, stream, UNPROVIDED, UNPROVIDED);
        return terpri(stream);
    }

    public static SubLObject ilp_export_initialize_predicate_argument_constraint_information(final SubLObject target_predicate, final SubLObject body_predicates, final SubLObject mt, SubLObject experimental_log) {
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        final SubLObject argnum = current_ilp_export_inductive_target_predicate_argpos();
        SubLObject cdolist_list_var = get_ilp_export_input_modes_for_arg_position(target_predicate, body_predicates, argnum, mt, experimental_log);
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject predicate = NIL;
            SubLObject argpos = NIL;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, datum, $list215);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list215);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list215);
            col = current.first();
            current = current.rest();
            if (NIL == current) {
                note_ilp_export_predicate_arg_constraint(predicate, argpos, col, $$programDenotesInputModeWith);
            } else {
                cdestructuring_bind_error(datum, $list215);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        cdolist_list_var = get_ilp_export_output_modes_for_arg_position(target_predicate, body_predicates, argnum, mt, experimental_log);
        tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject predicate = NIL;
            SubLObject argpos = NIL;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, datum, $list215);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list215);
            argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list215);
            col = current.first();
            current = current.rest();
            if (NIL == current) {
                note_ilp_export_predicate_arg_constraint(predicate, argpos, col, $$programDenotesOutputModeWith);
            } else {
                cdestructuring_bind_error(datum, $list215);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return target_predicate;
    }

    public static SubLObject ilp_export_init_terms(final SubLObject terms, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ilp_terms_to_export$.setDynamicValue(set.new_set(symbol_function(EQ), $int$100), thread);
        final SubLObject colls = remove_if($sym209$ISA_PREDICATE_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject preds = remove_if(COLLECTION_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$22 = ilp_export_gather_predicate_extent_index(pred, mt, $TRUE);
                SubLObject assertion_spec = NIL;
                assertion_spec = cdolist_list_var_$22.first();
                while (NIL != cdolist_list_var_$22) {
                    SubLObject cdolist_list_var_$23 = assertion_spec_hl_formula_args(assertion_spec);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var_$23.first();
                    while (NIL != cdolist_list_var_$23) {
                        set.set_add(arg, $ilp_terms_to_export$.getDynamicValue(thread));
                        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                        arg = cdolist_list_var_$23.first();
                    } 
                    cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                    assertion_spec = cdolist_list_var_$22.first();
                } 
                SubLObject cdolist_list_var_$24 = ilp_export_gather_predicate_extent_index(pred, mt, $FALSE);
                assertion_spec = NIL;
                assertion_spec = cdolist_list_var_$24.first();
                while (NIL != cdolist_list_var_$24) {
                    SubLObject cdolist_list_var_$25 = assertion_spec_hl_formula_args(assertion_spec);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var_$25.first();
                    while (NIL != cdolist_list_var_$25) {
                        set.set_add(arg, $ilp_terms_to_export$.getDynamicValue(thread));
                        cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                        arg = cdolist_list_var_$25.first();
                    } 
                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                    assertion_spec = cdolist_list_var_$24.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            cdolist_list_var = isa.union_all_instances(colls, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != forts.fort_p(inst)) {
                    set.set_add(inst, $ilp_terms_to_export$.getDynamicValue(thread));
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ilp_export_get_candidate_instances_for_collection(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidates = NIL;
        final SubLObject set_contents_var = set.do_set_internal($ilp_terms_to_export$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, v_term)) && (NIL != isa.isaP(v_term, col, mt, UNPROVIDED))) {
                candidates = cons(v_term, candidates);
            }
        }
        return candidates;
    }

    public static SubLObject clear_all_ilp_export_caches() {
        clear_ilp_export_gather_predicate_extent_index();
        clear_ilp_export_pred_name_for_collection_cached();
        clear_get_ilp_export_mode_marker_for_style();
        clear_get_all_ilp_export_mode_markers_for_style_cached();
        clear_get_ilp_export_output_modes_for_arg_position();
        clear_get_ilp_export_input_modes_for_arg_position();
        clear_ilp_export_conversion_plug_name();
        clear_ilp_export_mode_name_for_term();
        clear_ilp_export_negation_predicateP();
        return $CLEARED;
    }

    public static SubLObject foil_export_to_file(final SubLObject terms, final SubLObject mt, final SubLObject filename) {
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str218$Unable_to_open__S, filename);
            }
            final SubLObject export = stream;
            foil_export_to_stream(export, terms, mt);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return filename;
    }

    public static SubLObject foil_export_to_stream(final SubLObject stream, final SubLObject terms, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != valid_ilp_export_style_p($$FOIL_ILPProgram) : "foil_export.valid_ilp_export_style_p(foil_export.$const40$FOIL_ILPProgram) " + "CommonSymbols.NIL != foil_export.valid_ilp_export_style_p(foil_export.$const40$FOIL_ILPProgram) " + $$FOIL_ILPProgram;
        final SubLObject _prev_bind_0 = $ilp_export_style$.currentBinding(thread);
        try {
            $ilp_export_style$.bind($$FOIL_ILPProgram, thread);
            ilp_export_init_terms(terms, mt);
            ilp_export_type_extents(stream, terms, mt);
            terpri(stream);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ilp_export_pred_or_coll_extent(stream, v_term, mt, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            $ilp_export_style$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject log_experimental_info(final SubLObject experimental_log, final SubLObject text_to_log, SubLObject should_show_results_immediatelyP) {
        if (should_show_results_immediatelyP == UNPROVIDED) {
            should_show_results_immediatelyP = makeBoolean(NIL == $silent_progressP$.getDynamicValue());
        }
        if (NIL != should_show_results_immediatelyP) {
            format(T, $str221$_A, text_to_log);
        }
        if (NIL != experimental_log) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(experimental_log, $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str218$Unable_to_open__S, experimental_log);
                }
                final SubLObject export = stream;
                format(export, $str221$_A, text_to_log);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return NIL;
    }

    public static SubLObject log_aleph_algorithms(final SubLObject experimental_log) {
        return NIL;
    }

    public static SubLObject generate_default_known_rules(final SubLObject terms, final SubLObject additional_collections, final SubLObject background_file, SubLObject experimental_log) {
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        return NIL;
    }

    public static SubLObject aleph_export_to_files_for_experiment(final SubLObject terms, final SubLObject mt, final SubLObject results_path, SubLObject results_dir, SubLObject aleph_settings, SubLObject experimental_log) {
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ilp_terms_to_export$.setDynamicValue(NIL, thread);
        SubLObject file_sets = NIL;
        if (NIL != string_utilities.ends_with(results_path, $str195$_, UNPROVIDED)) {
            results_dir = cconcatenate(results_path, results_dir);
        } else {
            results_dir = cconcatenate(results_path, new SubLObject[]{ $str195$_, results_dir });
        }
        $aleph_scratch_directory_name$.setDynamicValue(cconcatenate(results_dir, $str195$_), thread);
        if (NIL != Filesys.directory_p(results_dir)) {
            Errors.error($str223$_A_should_be_the_name_of_a_new_di, results_dir);
        }
        if (NIL != Filesys.probe_file(results_dir)) {
            Errors.error($str224$_A_should_be_the_name_of_a_new_di, results_dir);
        }
        if (NIL == file_utilities.make_directory_recursive(results_dir, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str225$Unable_to_create_directory___A___, results_dir);
        }
        SubLObject current_info = format(NIL, $str226$KB__A__A___, operation_communication.kb_version_string(), operation_communication.kb_op_number());
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str227$System__A__A__A___, new SubLObject[]{ system_info.cyc_revision_string(), api_widgets.get_lisp_implementation_type(), api_widgets.get_lisp_implementation_version() });
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str228$Creating_output_directory___A___, results_dir);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str229$Using_seed_terms___A___, terms);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str230$Using_mt___A___, mt);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        log_aleph_algorithms(experimental_log);
        ilp_export_init_terms(terms, mt);
        final SubLObject _prev_bind_0 = $ilp_export_collections$.currentBinding(thread);
        try {
            $ilp_export_collections$.bind(NIL, thread);
            SubLObject cdolist_list_var = list_utilities.find_all_if($sym209$ISA_PREDICATE_, terms, UNPROVIDED);
            SubLObject target_predicate = NIL;
            target_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$26 = aleph_export_target_predicate_to_file_sets(target_predicate, terms, mt, results_dir, aleph_settings, experimental_log);
                SubLObject file_set = NIL;
                file_set = cdolist_list_var_$26.first();
                while (NIL != cdolist_list_var_$26) {
                    file_sets = cons(file_set, file_sets);
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    file_set = cdolist_list_var_$26.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                target_predicate = cdolist_list_var.first();
            } 
        } finally {
            $ilp_export_collections$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = file_sets;
        SubLObject file_set2 = NIL;
        file_set2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            generate_default_known_rules(terms, $ilp_export_collections$.getDynamicValue(thread), get_background_file_from_aleph_fileset(file_set2), experimental_log);
            cdolist_list_var2 = cdolist_list_var2.rest();
            file_set2 = cdolist_list_var2.first();
        } 
        return file_sets;
    }

    public static SubLObject aleph_export_to_files(final SubLObject terms, final SubLObject mt, final SubLObject file_stem, SubLObject aleph_settings) {
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        SubLObject file_sets = NIL;
        ilp_export_init_terms(terms, mt);
        SubLObject cdolist_list_var = list_utilities.find_all_if($sym209$ISA_PREDICATE_, terms, UNPROVIDED);
        SubLObject target_predicate = NIL;
        target_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$27 = aleph_export_target_predicate_to_file_sets(target_predicate, terms, mt, file_stem, aleph_settings, UNPROVIDED);
            SubLObject file_set = NIL;
            file_set = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                file_sets = cons(file_set, file_sets);
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                file_set = cdolist_list_var_$27.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            target_predicate = cdolist_list_var.first();
        } 
        return file_sets;
    }

    public static SubLObject aleph_export_target_predicate_to_files(final SubLObject target_predicate, SubLObject terms, final SubLObject mt, final SubLObject file_stem, SubLObject aleph_settings) {
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        if (NIL == subl_promotions.memberP(target_predicate, terms, UNPROVIDED, UNPROVIDED)) {
            terms = cons(target_predicate, terms);
        }
        ilp_export_init_terms(terms, mt);
        return aleph_export_target_predicate_to_file_sets(target_predicate, terms, mt, file_stem, aleph_settings, UNPROVIDED);
    }

    public static SubLObject aleph_export_target_predicate_to_file_sets(final SubLObject target_predicate, final SubLObject terms, final SubLObject mt, final SubLObject file_stem, final SubLObject aleph_settings, SubLObject experimental_log) {
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject argnum = ONE_INTEGER;
        SubLObject file_sets = NIL;
        assert NIL != valid_ilp_export_style_p($$ALEPH_ILPProgram) : "foil_export.valid_ilp_export_style_p(foil_export.$const16$ALEPH_ILPProgram) " + "CommonSymbols.NIL != foil_export.valid_ilp_export_style_p(foil_export.$const16$ALEPH_ILPProgram) " + $$ALEPH_ILPProgram;
        final SubLObject _prev_bind_0 = $ilp_export_style$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ilp_export_inductive_target_predicate$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ilp_export_inductive_target_predicate_argpos$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ilp_export_type_to_instance_information$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $ilp_export_instance_to_type_information$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $ilp_export_predicate_arg_constraints_dbase$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $aleph_generate_mode_information$.currentBinding(thread);
        try {
            $ilp_export_style$.bind($$ALEPH_ILPProgram, thread);
            $ilp_export_inductive_target_predicate$.bind(target_predicate, thread);
            $ilp_export_inductive_target_predicate_argpos$.bind(argnum, thread);
            $ilp_export_type_to_instance_information$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            $ilp_export_instance_to_type_information$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            $ilp_export_predicate_arg_constraints_dbase$.bind(new_ilp_export_predicate_arg_constraints_dbase(), thread);
            $aleph_generate_mode_information$.bind(T, thread);
            final SubLObject current_info = format(NIL, $str231$Dealing_with_predicate___A___, target_predicate);
            log_experimental_info(experimental_log, current_info, UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = $ilp_term_export_generate_synthetic_negative_examples$.currentBinding(thread);
            try {
                $ilp_term_export_generate_synthetic_negative_examples$.bind(new_ilp_export_negative_example_collector(), thread);
                ilp_export_initialize_predicate_argument_constraint_information(target_predicate, list_utilities.remove_if_not(symbol_function($sym209$ISA_PREDICATE_), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, experimental_log);
                SubLObject cdolist_list_var = aleph_export_term_mode_declaration_new_int(target_predicate, $ALL_EXCEPT_DOUBLE_HASH_OR_DOUBLE_NEGATIVE);
                SubLObject modeh_mode = NIL;
                modeh_mode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject background_filename = get_aleph_export_background_knowledge_filename(file_stem, target_predicate, argnum, modeh_mode);
                    final SubLObject positive_filename = get_aleph_export_positive_examples_filename(file_stem, target_predicate, argnum, modeh_mode);
                    final SubLObject negative_filename = get_aleph_export_negative_examples_filename(file_stem, target_predicate, argnum, modeh_mode);
                    final SubLObject file_set = list(new SubLObject[]{ $PREDICATE, target_predicate, $ARGNUM, argnum, $BACKGROUND_KNOWLEDGE, background_filename, $POSITIVE_EXAMPLES, positive_filename, $NEGATIVE_EXAMPLES, negative_filename });
                    file_sets = cons(file_set, file_sets);
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(positive_filename, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str218$Unable_to_open__S, positive_filename);
                        }
                        final SubLObject export = stream;
                        final SubLObject current_info2 = format(NIL, $str237$Creating_predicate_positive_file_, positive_filename);
                        log_experimental_info(experimental_log, current_info2, UNPROVIDED);
                        aleph_export_positive_examples_to_stream(export, target_predicate, mt);
                    } finally {
                        final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                    stream = NIL;
                    try {
                        stream = compatibility.open_text(background_filename, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str218$Unable_to_open__S, background_filename);
                        }
                        final SubLObject export = stream;
                        final SubLObject current_info2 = format(NIL, $str238$Creating_predicate_background__ex, background_filename);
                        log_experimental_info(experimental_log, current_info2, UNPROVIDED);
                        aleph_export_background_to_stream(export, terms, mt, target_predicate, aleph_settings, experimental_log, modeh_mode);
                    } finally {
                        final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                    stream = NIL;
                    try {
                        stream = compatibility.open_text(negative_filename, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str218$Unable_to_open__S, negative_filename);
                        }
                        final SubLObject export = stream;
                        final SubLObject current_info2 = format(NIL, $str239$Creating_predicate_negative_examp, negative_filename);
                        log_experimental_info(experimental_log, current_info2, UNPROVIDED);
                        aleph_export_negative_examples_to_stream(export, target_predicate, mt, UNPROVIDED);
                    } finally {
                        final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    modeh_mode = cdolist_list_var.first();
                } 
            } finally {
                $ilp_term_export_generate_synthetic_negative_examples$.rebind(_prev_bind_0_$28, thread);
            }
        } finally {
            $aleph_generate_mode_information$.rebind(_prev_bind_7, thread);
            $ilp_export_predicate_arg_constraints_dbase$.rebind(_prev_bind_6, thread);
            $ilp_export_instance_to_type_information$.rebind(_prev_bind_5, thread);
            $ilp_export_type_to_instance_information$.rebind(_prev_bind_4, thread);
            $ilp_export_inductive_target_predicate_argpos$.rebind(_prev_bind_3, thread);
            $ilp_export_inductive_target_predicate$.rebind(_prev_bind_2, thread);
            $ilp_export_style$.rebind(_prev_bind_0, thread);
        }
        return file_sets;
    }

    public static SubLObject get_predicate_from_aleph_fileset(final SubLObject file_set) {
        return getf(file_set, $PREDICATE, UNPROVIDED);
    }

    public static SubLObject get_argnum_from_aleph_fileset(final SubLObject file_set) {
        return getf(file_set, $ARGNUM, UNPROVIDED);
    }

    public static SubLObject get_background_file_from_aleph_fileset(final SubLObject file_set) {
        return getf(file_set, $BACKGROUND_KNOWLEDGE, UNPROVIDED);
    }

    public static SubLObject get_positive_examples_file_from_aleph_fileset(final SubLObject file_set) {
        return getf(file_set, $POSITIVE_EXAMPLES, UNPROVIDED);
    }

    public static SubLObject get_negative_examples_file_from_aleph_fileset(final SubLObject file_set) {
        return getf(file_set, $NEGATIVE_EXAMPLES, UNPROVIDED);
    }

    public static SubLObject get_files_from_aleph_file_set(final SubLObject file_set) {
        return list(get_background_file_from_aleph_fileset(file_set), get_positive_examples_file_from_aleph_fileset(file_set), get_negative_examples_file_from_aleph_fileset(file_set));
    }

    public static SubLObject aleph_export_background_to_stream(final SubLObject stream, final SubLObject other_terms, final SubLObject mt, final SubLObject target_predicate, final SubLObject aleph_settings, SubLObject experimental_log, SubLObject modeh_mode) {
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        if (modeh_mode == UNPROVIDED) {
            modeh_mode = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        aleph_export_information_on_export(stream, target_predicate, mt, other_terms);
        aleph_export_parameter_settings(stream, aleph_settings);
        aleph_export_mode_declarations_new(stream, target_predicate, other_terms, mt, modeh_mode);
        ilp_export_type_extents_new(stream, other_terms, mt);
        terpri(stream);
        ilp_export_section_comment(stream, $$$Background_knowledge);
        final SubLObject _prev_bind_0 = $ilp_terms_filter_from_extent$.currentBinding(thread);
        try {
            $ilp_terms_filter_from_extent$.bind(cons(target_predicate, $ilp_terms_filter_from_extent$.getDynamicValue(thread)), thread);
            SubLObject cdolist_list_var = other_terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$32 = $ilp_term_export_generate_synthetic_negative_examples$.currentBinding(thread);
                try {
                    $ilp_term_export_generate_synthetic_negative_examples$.bind(new_ilp_export_negative_example_collector(), thread);
                    ilp_export_pred_or_coll_extent_new(stream, v_term, mt, NIL);
                    final SubLObject _prev_bind_0_$33 = $ilp_term_export_include_negative_examples$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $ilp_term_export_include_positive_examples$.currentBinding(thread);
                    try {
                        $ilp_term_export_include_negative_examples$.bind(T, thread);
                        $ilp_term_export_include_positive_examples$.bind(NIL, thread);
                        aleph_export_negative_examples_to_stream(stream, v_term, mt, T);
                    } finally {
                        $ilp_term_export_include_positive_examples$.rebind(_prev_bind_2, thread);
                        $ilp_term_export_include_negative_examples$.rebind(_prev_bind_0_$33, thread);
                    }
                } finally {
                    $ilp_term_export_generate_synthetic_negative_examples$.rebind(_prev_bind_0_$32, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            $ilp_terms_filter_from_extent$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject aleph_export_positive_examples_to_stream(final SubLObject stream, final SubLObject target_predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $ilp_term_export_include_negative_examples$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $aleph_generate_mode_information$.currentBinding(thread);
        try {
            $ilp_term_export_include_negative_examples$.bind(NIL, thread);
            $aleph_generate_mode_information$.bind(NIL, thread);
            aleph_export_information_on_export(stream, target_predicate, mt, UNPROVIDED);
            ilp_export_pred_or_coll_extent(stream, target_predicate, mt, UNPROVIDED);
        } finally {
            $aleph_generate_mode_information$.rebind(_prev_bind_2, thread);
            $ilp_term_export_include_negative_examples$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject aleph_export_negative_examples_to_stream(final SubLObject stream, final SubLObject predicate, final SubLObject mt, SubLObject is_exporting_backgroundP) {
        if (is_exporting_backgroundP == UNPROVIDED) {
            is_exporting_backgroundP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $ilp_term_export_include_positive_examples$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $aleph_generate_mode_information$.currentBinding(thread);
        try {
            $ilp_term_export_include_positive_examples$.bind(NIL, thread);
            $aleph_generate_mode_information$.bind(NIL, thread);
            if (NIL == is_exporting_backgroundP) {
                aleph_export_information_on_export(stream, predicate, mt, UNPROVIDED);
            }
            ilp_export_pred_or_coll_extent(stream, predicate, mt, is_exporting_backgroundP);
        } finally {
            $aleph_generate_mode_information$.rebind(_prev_bind_2, thread);
            $ilp_term_export_include_positive_examples$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject aleph_export_parameter_settings(final SubLObject stream, final SubLObject aleph_settings) {
        ilp_export_section_comment(stream, $$$Aleph_parameter_settings);
        SubLObject cdolist_list_var = aleph_settings;
        SubLObject aleph_setting = NIL;
        aleph_setting = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = aleph_setting;
            SubLObject parameter = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list242);
            parameter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list242);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                format(stream, $str243$___set__A__A____, aleph_parameter_name_from_keyword(parameter), value);
            } else {
                cdestructuring_bind_error(datum, $list242);
            }
            cdolist_list_var = cdolist_list_var.rest();
            aleph_setting = cdolist_list_var.first();
        } 
        return terpri(stream);
    }

    public static SubLObject aleph_parameter_name_from_keyword(final SubLObject parameter) {
        return substitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(string_utilities.to_string(parameter), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject aleph_export_information_on_export(final SubLObject stream, final SubLObject target_predicate, final SubLObject mt, SubLObject other_terms) {
        if (other_terms == UNPROVIDED) {
            other_terms = NIL;
        }
        ilp_export_simple_comment(stream, cconcatenate($$$created_on_, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED)), $$$_using_, format_nil.format_nil_a_no_copy($ilp_export_code_revision$.getGlobalValue()), $$$_ }));
        ilp_export_simple_comment(stream, cconcatenate($$$generated_from_KB_, new SubLObject[]{ format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), $$$_running_on_CycL_version_, format_nil.format_nil_a_no_copy(system_info.cyc_revision_string()) }));
        ilp_export_simple_comment(stream, cconcatenate($str249$focal_predicate__, format_nil.format_nil_a_no_copy(target_predicate)));
        ilp_export_simple_comment(stream, cconcatenate($str250$Mt_visibility__, format_nil.format_nil_a_no_copy(mt)));
        if (NIL != other_terms) {
            ilp_export_simple_comment(stream, $str251$other_seed_set_terms_);
            SubLObject cdolist_list_var = other_terms;
            SubLObject other_term = NIL;
            other_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ilp_export_simple_comment(stream, cconcatenate($$$__, format_nil.format_nil_a_no_copy(other_term)));
                cdolist_list_var = cdolist_list_var.rest();
                other_term = cdolist_list_var.first();
            } 
        }
        return stream;
    }

    public static SubLObject rule_suggestion_predicate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rule_suggestion_predicate$.getDynamicValue(thread);
    }

    public static SubLObject rule_suggestion_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rule_suggestion_mt$.getDynamicValue(thread);
    }

    public static SubLObject cycl_var_to_prolog_var(final SubLObject cycl_var) {
        final SubLObject raw_var_name = cycl_variables.el_var_name_without_prefix(cycl_var);
        if (NIL != cycl_variables.dont_care_varP(cycl_var)) {
            return cconcatenate($str47$_, raw_var_name);
        }
        return raw_var_name;
    }

    public static SubLObject prolog_var_to_cycl_var(final SubLObject prolog_var) {
        if (NIL != charE(CHAR_underbar, Strings.sublisp_char(prolog_var, ZERO_INTEGER))) {
            return cycl_variables.make_el_var(cconcatenate($str255$__, subseq(prolog_var, ONE_INTEGER, UNPROVIDED)));
        }
        return cycl_variables.make_el_var(prolog_var);
    }

    public static SubLObject cycl_rule_from_prolog(final SubLObject rule_string) {
        return ilp_import_parse_prolog_rule(rule_string);
    }

    public static SubLObject filter_suggested_rule(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return NIL;
    }

    public static SubLObject foil_import_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject good_rules = NIL;
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
                Errors.error($str218$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject rule;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    if (NIL != string_utilities.substringP($str121$____, line, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        rule = cycl_rule_from_prolog(line);
                        if (NIL == filter_suggested_rule(rule, UNPROVIDED)) {
                            good_rules = cons(noptimize_el_formula_variable_names(rule, UNPROVIDED, UNPROVIDED, UNPROVIDED), good_rules);
                            fi.fi_assert(list(rule_suggestion_predicate(), noptimize_el_formula_variable_names(rule, UNPROVIDED, UNPROVIDED, UNPROVIDED)), rule_suggestion_mt(), UNPROVIDED, UNPROVIDED);
                        }
                    }
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
        return good_rules;
    }

    public static SubLObject foil_learn_from_induction(final SubLObject preds, final SubLObject set_name, SubLObject mt, SubLObject scratch_dir) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (scratch_dir == UNPROVIDED) {
            scratch_dir = $foil_scratch_directory_name$.getGlobalValue();
        }
        final SubLObject foil_file = generate_foil_input_filename_from_setname(set_name, scratch_dir);
        final SubLObject target_file = generate_foil_output_filename_from_input_filename(foil_file);
        foil_export_to_file(preds, mt, foil_file);
        if (NIL != run_foil_program_on_files(foil_file, target_file)) {
            foil_import_from_file(target_file);
        }
        return target_file;
    }

    public static SubLObject run_foil_program_on_files(final SubLObject source_file, final SubLObject target_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject program = $foil_program_name$.getGlobalValue();
        SubLObject successP = NIL;
        SubLObject os_process = NIL;
        try {
            os_process = os_process_utilities.make_os_process($str259$FOIL_6_Process, program, $foil_program_arguments$.getGlobalValue(), source_file, target_file, StreamsLow.$standard_output$.getDynamicValue(thread));
            os_process_utilities.wait_until_os_process_finished(os_process);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != os_process) {
                    os_process_utilities.destroy_os_process(os_process);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != os_process) {
            successP = os_process_utilities.os_process_exit_code(os_process);
        }
        return successP;
    }

    public static SubLObject generate_foil_output_filename_from_input_filename(final SubLObject filename) {
        return cconcatenate(filename, $str260$_out);
    }

    public static SubLObject generate_foil_input_filename_from_setname(final SubLObject setname, SubLObject scratch_dir) {
        if (scratch_dir == UNPROVIDED) {
            scratch_dir = $foil_scratch_directory_name$.getGlobalValue();
        }
        return cconcatenate(scratch_dir, new SubLObject[]{ setname, $str261$_d });
    }

    public static SubLObject aleph_induction_fileset_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $aleph_induction_fileset_name$.getDynamicValue(thread);
    }

    public static SubLObject aleph_self_occupy_with_induction(SubLObject verboseP, SubLObject cleanup_on_successP, SubLObject scratch_dir, SubLObject aleph_settings, SubLObject domain_mt) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (cleanup_on_successP == UNPROVIDED) {
            cleanup_on_successP = T;
        }
        if (scratch_dir == UNPROVIDED) {
            scratch_dir = $aleph_scratch_directory_name$.getDynamicValue();
        }
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $const263$CurrentWorldDataCollectorMt_NonHo;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject all_results = NIL;
        while (NIL == doneP) {
            final SubLObject gafs = find_gafs_to_occupy_self_with_induction(domain_mt);
            if (NIL == gafs) {
                doneP = T;
            } else {
                thread.resetMultipleValues();
                final SubLObject terms = extract_instructions_from_gafs_for_induction(gafs, domain_mt);
                final SubLObject set_name = thread.secondMultipleValue();
                final SubLObject source_mt = thread.thirdMultipleValue();
                final SubLObject target_mt = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                final SubLObject assertions = aleph_learn_assertions_from_induction(terms, set_name, source_mt, target_mt, verboseP, cleanup_on_successP, scratch_dir, aleph_settings);
                if (NIL == assertions) {
                    continue;
                }
                all_results = cconcatenate(all_results, assertions);
            }
        } 
        return all_results;
    }

    public static SubLObject find_gafs_to_occupy_self_with_induction(final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(domain_mt, thread);
            if (NIL != $continue_searching_for_gafs_for_inductionP$.getGlobalValue()) {
                SubLObject cdolist_list_var = $list265;
                SubLObject predicate = NIL;
                predicate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$34 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$35 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$36 = NIL;
                                        final SubLObject token_var_$37 = NIL;
                                        while (NIL == done_var_$36) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                            final SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(gaf));
                                            if (NIL != valid_$38) {
                                                gafs = cons(gaf, gafs);
                                            }
                                            done_var_$36 = makeBoolean(NIL == valid_$38);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$35, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                    pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$36 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $FALSE, NIL);
                                        SubLObject done_var_$37 = NIL;
                                        final SubLObject token_var_$38 = NIL;
                                        while (NIL == done_var_$37) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                                            final SubLObject valid_$39 = makeBoolean(!token_var_$38.eql(gaf));
                                            if (NIL != valid_$39) {
                                                gafs = cons(gaf, gafs);
                                            }
                                            done_var_$37 = makeBoolean(NIL == valid_$39);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$36, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    predicate = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return gafs;
    }

    public static SubLObject extract_instructions_from_gafs_for_induction(final SubLObject gafs, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $const263$CurrentWorldDataCollectorMt_NonHo;
        }
        final SubLObject setname = get_fileset_name_for_gafs_for_induction(gafs);
        SubLObject terms = NIL;
        SubLObject target_mt = NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($TRUE == assertions_high.assertion_truth(gaf)) {
                final SubLObject item_var;
                final SubLObject predicate = item_var = cycl_utilities.formula_arg0(assertions_high.assertion_formula(gaf));
                if (NIL == member(item_var, terms, symbol_function(EQ), symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
                final SubLObject mt = assertions_high.assertion_mt(gaf);
                if (NIL == target_mt) {
                    target_mt = mt;
                } else
                    if (NIL != genl_mts.genl_mtP(mt, target_mt, mt, UNPROVIDED)) {
                        target_mt = mt;
                    } else
                        if (NIL == genl_mts.genl_mtP(target_mt, mt, target_mt, UNPROVIDED)) {
                            Errors.error($str266$cannot_currently_handle_disjoint_);
                        }


            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return values(terms, setname, domain_mt, target_mt);
    }

    public static SubLObject get_fileset_name_for_gafs_for_induction(final SubLObject gafs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate($aleph_induction_fileset_name$.getDynamicValue(thread), numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject aleph_learn_assertions_from_induction(final SubLObject terms, final SubLObject set_name, final SubLObject source_mt, final SubLObject target_mt, SubLObject verboseP, SubLObject cleanup_on_successP, SubLObject scratch_dir, SubLObject aleph_settings) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (cleanup_on_successP == UNPROVIDED) {
            cleanup_on_successP = T;
        }
        if (scratch_dir == UNPROVIDED) {
            scratch_dir = $aleph_scratch_directory_name$.getDynamicValue();
        }
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        final SubLObject sentences = aleph_learn_from_induction(terms, set_name, source_mt, verboseP, cleanup_on_successP, scratch_dir, aleph_settings);
        if (NIL != sentences) {
            return aleph_assert_rules_learned_from_induction(sentences, target_mt, verboseP, cleanup_on_successP);
        }
        return NIL;
    }

    public static SubLObject dumb_stringify_cyc_term_test(final SubLObject character) {
        return makeBoolean(((NIL != alphanumericp(character)) || CHAR_period.eql(character)) || CHAR_underbar.eql(character));
    }

    public static SubLObject is_paren(final SubLObject character) {
        return makeBoolean(CHAR_lparen.eql(character) || CHAR_rparen.eql(character));
    }

    public static SubLObject is_space(final SubLObject character) {
        return eq(CHAR_space, character);
    }

    public static SubLObject isirrelevantpredicateforilpP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = czer_meta.find_assertions_cycl(list($$omitFromILP, pred), UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject dumb_stringify_cyc_term(final SubLObject v_term) {
        SubLObject result = string_utilities.str(v_term);
        result = nsubstitute_if(CHAR_period, $sym270$IS_PAREN, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = nsubstitute_if(CHAR_underbar, $sym271$IS_SPACE, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = list_utilities.delete_if_not(DUMB_STRINGIFY_CYC_TERM_TEST, Strings.string_downcase(result, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject make_unique_aleph_dir(final SubLObject terms) {
        return cconcatenate($str273$aleph_, new SubLObject[]{ dumb_stringify_cyc_term(terms), $str29$_, string_utilities.str(get_internal_real_time()) });
    }

    public static SubLObject aleph_learn_from_mt(final SubLObject mt, SubLObject use_genl_mts, SubLObject top_n_preds, SubLObject all_combinations_of_at_most_n_preds, SubLObject experiment_path, SubLObject verboseP, SubLObject aleph_settings) {
        if (use_genl_mts == UNPROVIDED) {
            use_genl_mts = T;
        }
        if (top_n_preds == UNPROVIDED) {
            top_n_preds = SIX_INTEGER;
        }
        if (all_combinations_of_at_most_n_preds == UNPROVIDED) {
            all_combinations_of_at_most_n_preds = THREE_INTEGER;
        }
        if (experiment_path == UNPROVIDED) {
            experiment_path = file_utilities.temp_directory();
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        return aleph_learn_from_mt2(mt, use_genl_mts, top_n_preds, TWO_INTEGER, all_combinations_of_at_most_n_preds, experiment_path, verboseP, aleph_settings);
    }

    public static SubLObject aleph_learn_from_mt2(final SubLObject mt, SubLObject use_genl_mts, SubLObject top_n_preds, SubLObject all_combinations_of_at_least_n_preds, SubLObject all_combinations_of_at_most_n_preds, SubLObject experiment_path, SubLObject verboseP, SubLObject aleph_settings) {
        if (use_genl_mts == UNPROVIDED) {
            use_genl_mts = T;
        }
        if (top_n_preds == UNPROVIDED) {
            top_n_preds = SIX_INTEGER;
        }
        if (all_combinations_of_at_least_n_preds == UNPROVIDED) {
            all_combinations_of_at_least_n_preds = TWO_INTEGER;
        }
        if (all_combinations_of_at_most_n_preds == UNPROVIDED) {
            all_combinations_of_at_most_n_preds = THREE_INTEGER;
        }
        if (experiment_path == UNPROVIDED) {
            experiment_path = file_utilities.temp_directory();
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        assert NIL != stringp(experiment_path) : "Types.stringp(experiment_path) " + "CommonSymbols.NIL != Types.stringp(experiment_path) " + experiment_path;
        experiment_path = string_utilities.strip_trailer(experiment_path, $str195$_);
        final SubLObject top_n_preds_list = kb_utilities.most_populous_predicates_in_mt(mt, top_n_preds, $sym275$ISIRRELEVANTPREDICATEFORILP_);
        final SubLObject mt_name = dumb_stringify_cyc_term(mt);
        final SubLObject experiment_path_sufix = format(NIL, $str276$aleph_run__A__A__A, new SubLObject[]{ mt_name, top_n_preds, get_internal_real_time() });
        final SubLObject new_path = format(NIL, $str277$_A__A, experiment_path, experiment_path_sufix);
        SubLObject experiment_name = NIL;
        SubLObject counter = ZERO_INTEGER;
        SubLObject pred_sets = NIL;
        SubLObject cur_combination_num;
        SubLObject cdolist_list_var;
        SubLObject pred_set;
        for (cur_combination_num = NIL, cur_combination_num = all_combinations_of_at_least_n_preds; !cur_combination_num.numG(all_combinations_of_at_most_n_preds); cur_combination_num = number_utilities.f_1X(cur_combination_num)) {
            if (length(top_n_preds_list).numGE(TWO_INTEGER)) {
                pred_sets = cdolist_list_var = list_utilities.subsets_of_size(top_n_preds_list, cur_combination_num);
                pred_set = NIL;
                pred_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    experiment_name = format(NIL, $str276$aleph_run__A__A__A, new SubLObject[]{ mt_name, cur_combination_num, dumb_stringify_cyc_term(pred_set) });
                    counter = add(ONE_INTEGER, counter);
                    if (NIL != verboseP) {
                        format(T, $str278$Runninng_ALEPH_experiment_on_mt__, mt, pred_set);
                        format(T, $str279$Data_saved_to__A__A___, new_path, experiment_name);
                    }
                    aleph_learn_from_induction_for_experiment(pred_set, new_path, experiment_name, mt, verboseP, aleph_settings);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred_set = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject aleph_learn_from_induction_for_experiment(SubLObject terms, final SubLObject experiment_path, final SubLObject experiment_name, final SubLObject mt, SubLObject verboseP, SubLObject aleph_settings) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(terms) : "Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) " + terms;
        terms = Mapping.mapcar(symbol_function(CANONICALIZE_TERM), terms);
        assert NIL != fort_types_interface.list_of_predicatesP(terms) : "fort_types_interface.list_of_predicatesP(terms) " + "CommonSymbols.NIL != fort_types_interface.list_of_predicatesP(terms) " + terms;
        assert NIL != stringp(experiment_path) : "Types.stringp(experiment_path) " + "CommonSymbols.NIL != Types.stringp(experiment_path) " + experiment_path;
        assert NIL != stringp(experiment_name) : "Types.stringp(experiment_name) " + "CommonSymbols.NIL != Types.stringp(experiment_name) " + experiment_name;
        assert NIL != hlmt.possibly_hlmt_p(mt) : "hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) " + mt;
        assert NIL != list_utilities.alist_p(aleph_settings) : "list_utilities.alist_p(aleph_settings) " + "CommonSymbols.NIL != list_utilities.alist_p(aleph_settings) " + aleph_settings;
        final SubLObject rules = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
        SubLObject experimental_log = NIL;
        SubLObject non_wff_rule_file_name = NIL;
        SubLObject rule_file_name = NIL;
        SubLObject scratch_dir;
        if (NIL != string_utilities.ends_with(experiment_path, $str195$_, UNPROVIDED)) {
            scratch_dir = cconcatenate(experiment_path, experiment_name);
        } else {
            scratch_dir = cconcatenate(experiment_path, new SubLObject[]{ $str195$_, experiment_name });
        }
        experimental_log = cconcatenate(scratch_dir, $str285$_experiment_log);
        rule_file_name = cconcatenate(scratch_dir, $str286$_generated_rules_log);
        non_wff_rule_file_name = cconcatenate(scratch_dir, $str287$_non_wff_generated_rules_log);
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $aleph_scratch_directory_name$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
            $aleph_scratch_directory_name$.bind(scratch_dir, thread);
            final SubLObject file_sets = nreverse(aleph_export_to_files_for_experiment(terms, mt, experiment_path, experiment_name, aleph_settings, experimental_log));
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(rule_file_name, $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str218$Unable_to_open__S, rule_file_name);
                }
                final SubLObject rule_file = stream;
                format(rule_file, $str288$__);
            } finally {
                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
            SubLObject stream_$47 = NIL;
            try {
                stream_$47 = compatibility.open_text(non_wff_rule_file_name, $APPEND);
                if (!stream_$47.isStream()) {
                    Errors.error($str218$Unable_to_open__S, non_wff_rule_file_name);
                }
                final SubLObject non_wff_rule_file = stream_$47;
                format(non_wff_rule_file, $str288$__);
            } finally {
                final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream_$47.isStream()) {
                        close(stream_$47, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                }
            }
            final SubLObject list_var = file_sets;
            final SubLObject _prev_bind_0_$48 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$50 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Performing_induction_via_ALEPH, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file_set = NIL;
                    file_set = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject attempt = ZERO_INTEGER;
                        SubLObject doneP = NIL;
                        while (NIL == doneP) {
                            final SubLObject predicate = get_predicate_from_aleph_fileset(file_set);
                            final SubLObject background_filename = get_background_file_from_aleph_fileset(file_set);
                            SubLObject known_rule_count = ZERO_INTEGER;
                            final SubLObject known_rules = dictionary.dictionary_lookup(rules, predicate, UNPROVIDED);
                            final SubLObject _prev_bind_0_$49 = $ilp_export_known_rules$.currentBinding(thread);
                            try {
                                $ilp_export_known_rules$.bind(new_ilp_export_known_rule_set(known_rules), thread);
                                if (NIL != list_utilities.sublisp_boolean(known_rules)) {
                                    known_rule_count = length(known_rules);
                                    final SubLObject current_info = format(NIL, $str291$Adding_known_rules_to_background_, known_rules);
                                    log_experimental_info(experimental_log, current_info, UNPROVIDED);
                                    add_known_rules_to_aleph_background_file(background_filename);
                                }
                                final SubLObject new_rule_strings = build_rule_lines_from_aleph_output(run_aleph_on_induction_problem(get_filestem_from_aleph_export_filename(background_filename), T, experimental_log, attempt));
                                attempt = add(attempt, ONE_INTEGER);
                                final SubLObject current_info2 = format(NIL, $str292$Aleph_returned_the_following_rule, new_rule_strings);
                                log_experimental_info(experimental_log, current_info2, UNPROVIDED);
                                SubLObject cdolist_list_var = new_rule_strings;
                                SubLObject new_rule_string = NIL;
                                new_rule_string = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject new_rule = ilp_import_parse_interesting_prolog_rule(new_rule_string);
                                    final SubLObject current_info3 = format(NIL, $str293$Aleph_returned_the_following_rule, new_rule);
                                    log_experimental_info(experimental_log, current_info3, UNPROVIDED);
                                    if (NIL != el_formula_p(new_rule)) {
                                        SubLObject stream_$48 = NIL;
                                        try {
                                            stream_$48 = compatibility.open_text(rule_file_name, $APPEND);
                                            if (!stream_$48.isStream()) {
                                                Errors.error($str218$Unable_to_open__S, rule_file_name);
                                            }
                                            final SubLObject rule_file2 = stream_$48;
                                            format_cycl_expression.format_cycl_expression(new_rule, rule_file2, UNPROVIDED);
                                        } finally {
                                            final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                if (stream_$48.isStream()) {
                                                    close(stream_$48, UNPROVIDED);
                                                }
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                            }
                                        }
                                        if (NIL == is_known_ilp_export_ruleP(new_rule)) {
                                            note_known_ilp_export_rule(new_rule);
                                            dictionary_utilities.dictionary_push(rules, predicate, new_rule);
                                        }
                                    } else
                                        if (NIL != new_rule) {
                                            SubLObject stream_$49 = NIL;
                                            try {
                                                stream_$49 = compatibility.open_text(non_wff_rule_file_name, $APPEND);
                                                if (!stream_$49.isStream()) {
                                                    Errors.error($str218$Unable_to_open__S, non_wff_rule_file_name);
                                                }
                                                final SubLObject non_wff_rule_file2 = stream_$49;
                                                format_cycl_expression.format_cycl_expression(new_rule, non_wff_rule_file2, UNPROVIDED);
                                            } finally {
                                                final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    if (stream_$49.isStream()) {
                                                        close(stream_$49, UNPROVIDED);
                                                    }
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                                }
                                            }
                                        }

                                    cdolist_list_var = cdolist_list_var.rest();
                                    new_rule_string = cdolist_list_var.first();
                                } 
                                final SubLObject total_known_rules = dictionary.dictionary_lookup(rules, predicate, UNPROVIDED);
                                doneP = makeBoolean(!known_rule_count.numL(length(total_known_rules)));
                            } finally {
                                $ilp_export_known_rules$.rebind(_prev_bind_0_$49, thread);
                            }
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file_set = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$50, thread);
                $progress_note$.rebind(_prev_bind_0_$48, thread);
            }
            SubLObject stream_$50 = NIL;
            try {
                stream_$50 = compatibility.open_text(rule_file_name, $APPEND);
                if (!stream_$50.isStream()) {
                    Errors.error($str218$Unable_to_open__S, rule_file_name);
                }
                final SubLObject rule_file3 = stream_$50;
                format(rule_file3, $str294$________________DONE_____________);
            } finally {
                final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values6 = getValuesAsVector();
                    if (stream_$50.isStream()) {
                        close(stream_$50, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values6);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
            SubLObject stream_$51 = NIL;
            try {
                stream_$51 = compatibility.open_text(non_wff_rule_file_name, $APPEND);
                if (!stream_$51.isStream()) {
                    Errors.error($str218$Unable_to_open__S, non_wff_rule_file_name);
                }
                final SubLObject non_wff_rule_file = stream_$51;
                format(non_wff_rule_file, $str294$________________DONE_____________);
            } finally {
                final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values7 = getValuesAsVector();
                    if (stream_$51.isStream()) {
                        close(stream_$51, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values7);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                }
            }
        } finally {
            $aleph_scratch_directory_name$.rebind(_prev_bind_2, thread);
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return apply(symbol_function(APPEND), dictionary.dictionary_values(rules));
    }

    public static SubLObject aleph_learn_from_induction(final SubLObject terms, final SubLObject set_name, final SubLObject mt, SubLObject verboseP, SubLObject cleanup_on_successP, SubLObject scratch_dir, SubLObject aleph_settings) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (cleanup_on_successP == UNPROVIDED) {
            cleanup_on_successP = T;
        }
        if (scratch_dir == UNPROVIDED) {
            scratch_dir = $aleph_scratch_directory_name$.getDynamicValue();
        }
        if (aleph_settings == UNPROVIDED) {
            aleph_settings = $default_aleph_settings$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.list_of_fort_p(terms) : "forts.list_of_fort_p(terms) " + "CommonSymbols.NIL != forts.list_of_fort_p(terms) " + terms;
        assert NIL != stringp(set_name) : "Types.stringp(set_name) " + "CommonSymbols.NIL != Types.stringp(set_name) " + set_name;
        assert NIL != hlmt.possibly_hlmt_p(mt) : "hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) " + mt;
        assert NIL != stringp(scratch_dir) : "Types.stringp(scratch_dir) " + "CommonSymbols.NIL != Types.stringp(scratch_dir) " + scratch_dir;
        assert NIL != list_utilities.property_list_p(aleph_settings) : "list_utilities.property_list_p(aleph_settings) " + "CommonSymbols.NIL != list_utilities.property_list_p(aleph_settings) " + aleph_settings;
        final SubLObject rules = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $aleph_scratch_directory_name$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
            $aleph_scratch_directory_name$.bind(scratch_dir, thread);
            final SubLObject list_var;
            final SubLObject file_sets = list_var = nreverse(aleph_export_to_files(terms, mt, set_name, aleph_settings));
            final SubLObject _prev_bind_0_$61 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Performing_induction_via_ALEPH, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file_set = NIL;
                    file_set = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject doneP = NIL;
                        while (NIL == doneP) {
                            final SubLObject predicate = get_predicate_from_aleph_fileset(file_set);
                            final SubLObject background_filename = get_background_file_from_aleph_fileset(file_set);
                            SubLObject known_rule_count = ZERO_INTEGER;
                            final SubLObject known_rules = dictionary.dictionary_lookup(rules, predicate, UNPROVIDED);
                            final SubLObject _prev_bind_0_$62 = $ilp_export_known_rules$.currentBinding(thread);
                            try {
                                $ilp_export_known_rules$.bind(new_ilp_export_known_rule_set(known_rules), thread);
                                if (NIL != list_utilities.sublisp_boolean(known_rules)) {
                                    known_rule_count = length(known_rules);
                                    add_known_rules_to_aleph_background_file(background_filename);
                                }
                                SubLObject cdolist_list_var;
                                final SubLObject new_rule_strings = cdolist_list_var = build_rule_lines_from_aleph_output(run_aleph_on_induction_problem(get_filestem_from_aleph_export_filename(background_filename), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                SubLObject new_rule_string = NIL;
                                new_rule_string = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject new_rule = ilp_import_parse_interesting_prolog_rule(new_rule_string);
                                    if ((NIL != el_formula_p(new_rule)) && (NIL == is_known_ilp_export_ruleP(new_rule))) {
                                        note_known_ilp_export_rule(new_rule);
                                        dictionary_utilities.dictionary_push(rules, predicate, new_rule);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    new_rule_string = cdolist_list_var.first();
                                } 
                                final SubLObject total_known_rules = dictionary.dictionary_lookup(rules, predicate, UNPROVIDED);
                                doneP = makeBoolean(!known_rule_count.numL(length(total_known_rules)));
                            } finally {
                                $ilp_export_known_rules$.rebind(_prev_bind_0_$62, thread);
                            }
                        } 
                        if (NIL != cleanup_on_successP) {
                            final SubLObject list_var_$64 = get_files_from_aleph_file_set(file_set);
                            final SubLObject _prev_bind_0_$63 = $progress_note$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$63 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$67 = $progress_total$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$68 = $progress_sofar$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$69 = $last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_5_$70 = $last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_6_$71 = $within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_7_$72 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $progress_note$.bind($str298$Removing_input_files_for_ALEPH___, thread);
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_total$.bind(length(list_var_$64), thread);
                                $progress_sofar$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                try {
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    SubLObject csome_list_var_$73 = list_var_$64;
                                    SubLObject file = NIL;
                                    file = csome_list_var_$73.first();
                                    while (NIL != csome_list_var_$73) {
                                        Filesys.delete_file(file);
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        csome_list_var_$73 = csome_list_var_$73.rest();
                                        file = csome_list_var_$73.first();
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_7_$72, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_6_$71, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_5_$70, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_4_$69, thread);
                                $progress_sofar$.rebind(_prev_bind_3_$68, thread);
                                $progress_total$.rebind(_prev_bind_2_$67, thread);
                                $progress_start_time$.rebind(_prev_bind_1_$63, thread);
                                $progress_note$.rebind(_prev_bind_0_$63, thread);
                            }
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file_set = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$62, thread);
                $progress_note$.rebind(_prev_bind_0_$61, thread);
            }
        } finally {
            $aleph_scratch_directory_name$.rebind(_prev_bind_2, thread);
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return apply(symbol_function(APPEND), dictionary.dictionary_values(rules));
    }

    public static SubLObject aleph_assert_rules_learned_from_induction(final SubLObject sentences, final SubLObject assertion_mt, SubLObject verboseP, SubLObject cleanup_on_successP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (cleanup_on_successP == UNPROVIDED) {
            cleanup_on_successP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject todos = aleph_optimize_rules_learned_from_induction(sentences, assertion_mt, verboseP, cleanup_on_successP);
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
            final SubLObject list_var = todos;
            final SubLObject _prev_bind_0_$76 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str299$Updating_KB_based_on_induced_sent, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject todo = NIL;
                    todo = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject pcase_var;
                        final SubLObject command_verb = pcase_var = todo.first();
                        if (pcase_var.eql($ASSERT)) {
                            SubLObject current;
                            final SubLObject datum = current = todo;
                            SubLObject assert_command = NIL;
                            SubLObject sentence = NIL;
                            SubLObject mt = NIL;
                            destructuring_bind_must_consp(current, datum, $list301);
                            assert_command = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list301);
                            sentence = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list301);
                            mt = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                rkf_assertion_utilities.rkf_assert_with_implicature(sentence, mt, T);
                                final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, mt);
                                if (NIL != assertion_handles.assertion_p(assertion)) {
                                    assertions = cons(assertion, assertions);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list301);
                            }
                        } else
                            if (pcase_var.eql($SUPPORT)) {
                                SubLObject current;
                                final SubLObject datum = current = todo;
                                SubLObject command = NIL;
                                SubLObject assertion2 = NIL;
                                SubLObject sentence2 = NIL;
                                SubLObject sentence_mt = NIL;
                                destructuring_bind_must_consp(current, datum, $list303);
                                command = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list303);
                                assertion2 = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list303);
                                sentence2 = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list303);
                                sentence_mt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != verboseP) {
                                        format(T, $str304$Sentence__A_in_Mt__A____is_equiva, new SubLObject[]{ sentence2, sentence_mt, uncanonicalizer.assertion_el_formula(assertion2), assertions_high.assertion_mt(assertion2) });
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list303);
                                }
                            } else
                                if (pcase_var.eql($PROVABLE)) {
                                    SubLObject current;
                                    final SubLObject datum = current = todo;
                                    SubLObject command = NIL;
                                    SubLObject sentence = NIL;
                                    SubLObject mt = NIL;
                                    destructuring_bind_must_consp(current, datum, $list306);
                                    command = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list306);
                                    sentence = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list306);
                                    mt = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != verboseP) {
                                            format(T, $str307$Sentence__A_in_Mt__A_is_already_p, sentence, mt);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list306);
                                    }
                                } else
                                    if (pcase_var.eql($REJECTED)) {
                                        SubLObject current;
                                        final SubLObject datum = current = todo;
                                        SubLObject command = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject mt = NIL;
                                        destructuring_bind_must_consp(current, datum, $list306);
                                        command = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list306);
                                        sentence = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list306);
                                        mt = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != verboseP) {
                                                format(T, $str309$The_induced_sentence__A_in_Mt__A_, sentence, mt);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list306);
                                        }
                                    } else {
                                        Errors.error($str310$Unknown_command_verb__A_with_argu, command_verb, todo.rest());
                                    }



                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        todo = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$76, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return nreverse(assertions);
    }

    public static SubLObject aleph_optimize_rules_learned_from_induction(final SubLObject sentences, final SubLObject assertion_mt, SubLObject verboseP, SubLObject cleanup_on_successP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (cleanup_on_successP == UNPROVIDED) {
            cleanup_on_successP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
            final SubLObject _prev_bind_0_$78 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str311$Optimizing_induced_sentences_____, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(sentences), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = sentences;
                    SubLObject induced_sentence = NIL;
                    induced_sentence = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject sentence = induced_sentence;
                        SubLObject sentence_mt = assertion_mt;
                        thread.resetMultipleValues();
                        final SubLObject alternative = reformulator_hub.reformulate_cycl(sentence, sentence_mt, UNPROVIDED);
                        final SubLObject justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != cycl_grammar.cycl_formula_p(alternative)) {
                            sentence = alternative;
                        }
                        final SubLObject suggested_mt = mt_suggestor.suggest_mt(sentence);
                        if (NIL != genl_mts.genl_mtP(sentence_mt, suggested_mt, sentence_mt, UNPROVIDED)) {
                            sentence_mt = suggested_mt;
                        }
                        if (NIL != rkf_contradiction_finder.rkf_rejected(sentence, sentence_mt, UNPROVIDED, UNPROVIDED)) {
                            tuples = cons(list($REJECTED, sentence, sentence_mt), tuples);
                        } else
                            if (NIL != czer_meta.find_assertion_cycl(sentence, sentence_mt)) {
                                final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, sentence_mt);
                                tuples = cons(list($SUPPORT, assertion, induced_sentence, assertion_mt), tuples);
                            } else
                                if (NIL != rkf_query_utilities.rkf_known(sentence, sentence_mt, UNPROVIDED)) {
                                    tuples = cons(list($PROVABLE, sentence, sentence_mt), tuples);
                                } else {
                                    tuples = cons(list($ASSERT, sentence, sentence_mt), tuples);
                                }


                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        induced_sentence = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$78, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return tuples;
    }

    public static SubLObject add_rules_to_aleph_background_file(final SubLObject rules, final SubLObject background_filename) {
        SubLObject output_stream = NIL;
        try {
            output_stream = StreamsLow.open(background_filename, new SubLObject[]{ $DIRECTION, $OUTPUT, $ELEMENT_TYPE, $TEXT, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $ERROR });
            ilp_export_pruning_for_rules(rules, output_stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (output_stream.isStream() && (NIL != open_stream_p(output_stream))) {
                    close(output_stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return background_filename;
    }

    public static SubLObject add_known_rules_to_aleph_background_file(final SubLObject background_filename) {
        SubLObject output_stream = NIL;
        try {
            output_stream = StreamsLow.open(background_filename, new SubLObject[]{ $DIRECTION, $OUTPUT, $ELEMENT_TYPE, $TEXT, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $ERROR });
            ilp_export_pruning_for_known_rules(output_stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (output_stream.isStream() && (NIL != open_stream_p(output_stream))) {
                    close(output_stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return background_filename;
    }

    public static SubLObject describe_aleph_run_environment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject valid = $$$valid;
        final SubLObject invalid = $$$invalid;
        format(T, $str326$__ALEPH_s_Execution_Environment__);
        format(T, $str327$__executable____A___A___, $aleph_program_name$.getGlobalValue(), NIL != Filesys.probe_file($aleph_program_name$.getGlobalValue()) ? valid : invalid);
        format(T, $str328$__Arguments_____A__, $aleph_program_arguments$.getGlobalValue());
        format(T, $str329$__home_dir______A___A___, $aleph_home_directory_name$.getGlobalValue(), NIL != Filesys.directory_p($aleph_home_directory_name$.getGlobalValue()) ? valid : invalid);
        format(T, $str330$__scratch_dir___A___A___, $aleph_scratch_directory_name$.getDynamicValue(thread), NIL != Filesys.directory_p($aleph_scratch_directory_name$.getDynamicValue(thread)) ? valid : invalid);
        force_output(T);
        return $ALEPH;
    }

    public static SubLObject run_aleph_on_induction_problem(final SubLObject file_base, SubLObject keep_temp_filesP, SubLObject experimental_log, SubLObject attempt) {
        if (keep_temp_filesP == UNPROVIDED) {
            keep_temp_filesP = NIL;
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        if (attempt == UNPROVIDED) {
            attempt = ZERO_INTEGER;
        }
        final SubLObject results = cconcatenate(file_base, new SubLObject[]{ $str332$_results, format_nil.format_nil_a(attempt) });
        final SubLObject assignment = assemble_command_list_for_aleph(file_base, experimental_log, attempt);
        SubLObject aleph = NIL;
        SubLObject rules_learned = NIL;
        try {
            if (NIL == experimental_log) {
                aleph = launch_aleph_os_process(assignment, results, UNPROVIDED, UNPROVIDED);
            } else {
                aleph = launch_aleph_os_process_for_experiment(experimental_log, assignment, results, UNPROVIDED);
            }
            os_process_utilities.wait_until_os_process_finished(aleph);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != os_process_utilities.os_process_p(aleph)) {
                    os_process_utilities.kill_os_process(aleph);
                    os_process_utilities.cleanup_os_process(aleph);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (NIL == keep_temp_filesP) {
            Filesys.delete_file(assignment);
        }
        rules_learned = extract_rules_from_aleph_output(results);
        if (NIL == keep_temp_filesP) {
            Filesys.delete_file(results);
        }
        return values(rules_learned, NIL != keep_temp_filesP ? assignment : NIL, NIL != keep_temp_filesP ? results : NIL);
    }

    public static SubLObject run_aleph_on_standard_problem(SubLObject keep_temp_filesP) {
        if (keep_temp_filesP == UNPROVIDED) {
            keep_temp_filesP = NIL;
        }
        return run_aleph_on_induction_problem($$$mother2p, keep_temp_filesP, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject launch_aleph_os_process_for_experiment(SubLObject experimental_log, SubLObject stdin, SubLObject stdout, SubLObject process_name) {
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (process_name == UNPROVIDED) {
            process_name = $str334$ALEPH_5__using_Yap_5_1_1__Process;
        }
        final SubLObject program = $aleph_program_name$.getGlobalValue();
        final SubLObject args = $aleph_program_arguments$.getGlobalValue();
        SubLObject current_info = format(NIL, $str335$About_to_run_aleph_with_command__, program, args);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        current_info = format(NIL, $str336$Running_aleph_with_input___A_and_, stdin, stdout);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        return os_process_utilities.make_os_process(process_name, program, args, stdin, stdout, UNPROVIDED);
    }

    public static SubLObject launch_aleph_os_process(SubLObject stdin, SubLObject stdout, SubLObject process_name, SubLObject experimental_log) {
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (process_name == UNPROVIDED) {
            process_name = $str334$ALEPH_5__using_Yap_5_1_1__Process;
        }
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        final SubLObject program = $aleph_program_name$.getGlobalValue();
        final SubLObject args = $aleph_program_arguments$.getGlobalValue();
        final SubLObject current_info = format(NIL, $str335$About_to_run_aleph_with_command__, program, args);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        return os_process_utilities.make_os_process(process_name, program, args, stdin, stdout, UNPROVIDED);
    }

    public static SubLObject assemble_command_list_for_aleph(final SubLObject file_base, SubLObject experimental_log, SubLObject attempt) {
        if (experimental_log == UNPROVIDED) {
            experimental_log = NIL;
        }
        if (attempt == UNPROVIDED) {
            attempt = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject command_file = cconcatenate(file_base, new SubLObject[]{ $str338$_acf, format_nil.format_nil_a(attempt) });
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(command_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str218$Unable_to_open__S, command_file);
            }
            final SubLObject s = stream;
            SubLObject cdolist_list_var = $aleph_command_list$.getGlobalValue();
            SubLObject command_pattern = NIL;
            command_pattern = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = command_pattern;
                SubLObject task = NIL;
                SubLObject parameter = NIL;
                destructuring_bind_must_consp(current, datum, $list339);
                task = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list339);
                parameter = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = task;
                    if (pcase_var.eql($ACTION)) {
                        assert NIL != stringp(parameter) : "Types.stringp(parameter) " + "CommonSymbols.NIL != Types.stringp(parameter) " + parameter;
                        parameter = string_utilities.string_substitute(file_base, $str341$__FILEBASE__, parameter, UNPROVIDED);
                        write_one_aleph_command(s, parameter);
                    } else {
                        Errors.error($str342$Invalid_ALEPH_command_list_item__, command_pattern);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list339);
                }
                cdolist_list_var = cdolist_list_var.rest();
                command_pattern = cdolist_list_var.first();
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
        final SubLObject current_info = format(NIL, $str343$Generated_aleph_command_file_for_, file_base, command_file);
        log_experimental_info(experimental_log, current_info, UNPROVIDED);
        return command_file;
    }

    public static SubLObject write_one_aleph_command(final SubLObject stream, final SubLObject command) {
        assert NIL != stringp(command) : "Types.stringp(command) " + "CommonSymbols.NIL != Types.stringp(command) " + command;
        write_string(command, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        force_output(stream);
        return command;
    }

    public static SubLObject extract_rules_from_aleph_output(final SubLObject output_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(output_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str218$Unable_to_open__S, output_file);
            }
            final SubLObject s = stream;
            result = extract_rules_from_aleph_output_stream(s);
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
        return result;
    }

    public static SubLObject extract_rules_from_aleph_output_stream(final SubLObject s) {
        SubLObject doneP = NIL;
        SubLObject pieces = NIL;
        SubLObject line;
        for (SubLObject state = $SEEKING; NIL == doneP; doneP = makeBoolean((state == $DONE) || (line == $EOF))) {
            line = read_line(s, NIL, $EOF, UNPROVIDED);
            if (line.isString()) {
                final SubLObject pcase_var = state;
                if (pcase_var.eql($SEEKING)) {
                    if (NIL != string_utilities.starts_with(line, $str346$_theory_)) {
                        state = $GATHERING;
                    }
                } else
                    if (pcase_var.eql($GATHERING)) {
                        if (NIL != string_utilities.starts_with(line, $str348$_Training_set_summary_)) {
                            state = $DONE;
                        } else
                            if (NIL == string_utilities.empty_string_p(line)) {
                                pieces = cons(line, pieces);
                            }

                    } else {
                        Errors.error($str350$Illegal_state_transition__dont_kn, state);
                    }

            }
        }
        return nreverse(pieces);
    }

    public static SubLObject build_rule_lines_from_aleph_output(final SubLObject lines) {
        SubLObject rule_pieces = NIL;
        SubLObject rules = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = lines;
            SubLObject line = NIL;
            line = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != string_utilities.starts_with(line, $str351$_)) {
                    if (NIL != rule_pieces) {
                        final SubLObject rule = apply(symbol_function(CCONCATENATE), nreverse(rule_pieces));
                        rules = cons(rule, rules);
                        rule_pieces = NIL;
                    }
                    if (NIL == string_utilities.starts_with(line, $str353$_Rule)) {
                        doneP = T;
                    }
                } else {
                    rule_pieces = cons(line, rule_pieces);
                }
                csome_list_var = csome_list_var.rest();
                line = csome_list_var.first();
            } 
        }
        return nreverse(rules);
    }

    public static SubLObject ilp_import_parse_interesting_prolog_rule(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject cycl_rule = ilp_import_parse_prolog_rule(line);
                    if (NIL == cycl_rule) {
                        return NIL;
                    }
                    final SubLObject free_variables = sentence_free_variables(cycl_rule, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject open_tailedP = NIL;
                    if (NIL == open_tailedP) {
                        SubLObject csome_list_var;
                        SubLObject variable;
                        for (csome_list_var = free_variables, variable = NIL, variable = csome_list_var.first(); (NIL == open_tailedP) && (NIL != csome_list_var); open_tailedP = numE(ONE_INTEGER, list_utilities.simple_tree_count(variable, cycl_rule)) , csome_list_var = csome_list_var.rest() , variable = csome_list_var.first()) {
                        }
                    }
                    return cycl_rule;
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
        if (NIL != error_message) {
            Errors.warn(cconcatenate($str354$Unable_to_parse_Prolog_rule__, new SubLObject[]{ line, $$$_, error_message }));
            return NIL;
        }
        return NIL;
    }

    public static SubLObject ilp_import_tokenize_prolog_rule(final SubLObject line) {
        return remove_if(symbol_function($sym355$WHITESPACE_STRING_), string_utilities.string_tokenize(line, $ilp_import_prolog_stop_characters$.getGlobalValue(), NIL, T, T, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ilp_import_parse_prolog_rule(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycl_rule = NIL;
        SubLObject dont_care = NIL;
        try {
            thread.throwStack.push($INVALID_RULE);
            SubLObject tokens = ilp_import_tokenize_prolog_rule(line);
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            thread.resetMultipleValues();
            final SubLObject head = ilp_import_consume_prolog_head(tokens);
            final SubLObject remainder = thread.secondMultipleValue();
            thread.resetMultipleValues();
            tokens = remainder;
            consequent = head;
            tokens = ilp_import_consume_prolog_implication(tokens);
            for (SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean((NIL != doneP) || (NIL == tokens))) {
                thread.resetMultipleValues();
                final SubLObject clause = ilp_import_consume_prolog_clause(tokens);
                final SubLObject remainder2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                tokens = remainder2;
                antecedent = cons(clause, antecedent);
            }
            antecedent = make_formula($$and, reverse(antecedent), UNPROVIDED);
            cycl_rule = make_binary_formula($$implies, antecedent, consequent);
        } catch (final Throwable ccatch_env_var) {
            dont_care = Errors.handleThrowable(ccatch_env_var, $INVALID_RULE);
        } finally {
            thread.throwStack.pop();
        }
        return cycl_rule;
    }

    public static SubLObject ilp_import_consume_prolog_head(final SubLObject tokens) {
        return ilp_import_consume_prolog_clause(tokens);
    }

    public static SubLObject ilp_import_consume_prolog_clause(SubLObject tokens) {
        final SubLObject list_var = tokens;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject args = make_list(FIVE_INTEGER, $EMPTY);
        SubLObject arg_index = ZERO_INTEGER;
        SubLObject clause = NIL;
        SubLObject predicate = NIL;
        SubLObject doneP = NIL;
        SubLObject negatedP = NIL;
        SubLObject in_arg_listP = NIL;
        while (NIL == doneP) {
            SubLObject current = tokens.first();
            if (NIL != Strings.string_equal($$$not, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                negatedP = T;
            } else
                if (NIL != Strings.string_equal($str361$_, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    sublisp_throw($INVALID_RULE, current);
                } else
                    if (NIL != Strings.string_equal(current, $str125$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        in_arg_listP = T;
                    } else
                        if (NIL != Strings.string_equal(current, $str31$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            doneP = T;
                        } else
                            if (NIL != Strings.string_equal(current, $str362$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                tokens = cons(current, tokens);
                                doneP = T;
                            } else
                                if (NIL != Strings.string_equal(current, $str138$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    if (NIL == in_arg_listP) {
                                        doneP = T;
                                    }
                                } else
                                    if (NIL != Strings.string_equal(current, $str119$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        in_arg_listP = NIL;
                                    } else
                                        if (NIL != Strings.string_equal(current, $str363$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            if (NIL == Strings.string_equal(second(tokens), $str364$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                Errors.error($str365$Invalid_token___in_input_stream_a, tokens);
                                            }
                                            predicate = $$different;
                                            tokens = tokens.rest();
                                        } else
                                            if (NIL != string_utilities.upper_case_string_p(current)) {
                                                set_nth(arg_index, args, prolog_var_to_cycl_var(current));
                                                arg_index = add(arg_index, ONE_INTEGER);
                                            } else {
                                                if ((NIL != string_utilities.starts_with(current, $str33$_)) && (NIL != string_utilities.ends_with(current, $str33$_, UNPROVIDED))) {
                                                    current = Strings.string_trim($list367, current);
                                                }
                                                SubLObject v_term = constants_high.find_constant(current);
                                                if (NIL == v_term) {
                                                    v_term = dictionary.dictionary_lookup($ilp_term_name_to_constant_map$.getGlobalValue(), current, UNPROVIDED);
                                                }
                                                if (NIL == v_term) {
                                                    v_term = dictionary.dictionary_lookup($ilp_term_name_to_constant_map$.getGlobalValue(), cconcatenate($str33$_, new SubLObject[]{ current, $str33$_ }), UNPROVIDED);
                                                }
                                                if (NIL == v_term) {
                                                    v_term = constants_high.find_constant(string_utilities.capitalize_first(current));
                                                }
                                                if (NIL != fort_types_interface.isa_predicateP(v_term, UNPROVIDED)) {
                                                    predicate = v_term;
                                                } else
                                                    if (NIL != fort_types_interface.collectionP(v_term)) {
                                                        predicate = $$isa;
                                                        set_nth(ONE_INTEGER, args, v_term);
                                                    } else {
                                                        set_nth(arg_index, args, v_term);
                                                        arg_index = add(arg_index, ONE_INTEGER);
                                                    }

                                            }








            tokens = tokens.rest();
            doneP = makeBoolean((NIL != doneP) || (NIL == tokens));
        } 
        if ((NIL == predicate) || (NIL == args)) {
            Errors.error($str368$Invalid_token_sequence____predica, predicate, args, tokens);
        }
        clause = make_formula(predicate, subseq(args, ZERO_INTEGER, position($EMPTY, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
        if (NIL != negatedP) {
            clause = make_unary_formula($$unknownSentence, clause);
        }
        return values(clause, tokens);
    }

    public static SubLObject ilp_import_consume_prolog_implication(final SubLObject tokens) {
        SubLObject colon = NIL;
        SubLObject dash = NIL;
        destructuring_bind_must_consp(tokens, tokens, $list370);
        colon = tokens.first();
        SubLObject current = tokens.rest();
        destructuring_bind_must_consp(current, tokens, $list370);
        dash = current.first();
        final SubLObject remainder;
        current = remainder = current.rest();
        if ((NIL == Strings.string_equal(colon, $str362$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == Strings.string_equal(dash, $str29$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str371$Invalid_token_sequence__A____expe, tokens);
        }
        return remainder;
    }

    public static SubLObject cyc_sentences_induced_by_program(final SubLObject program, final SubLObject pred_set, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == forts.fort_p(program)) || (NIL == el_extensional_set_p(pred_set))) || (NIL == hlmt.hlmt_p(mt))) {
            relation_evaluation.throw_unevaluatable();
        }
        if (program.eql($$ALEPH_ILPProgram)) {
            final SubLObject preds = el_extensional_set_elements(pred_set);
            SubLObject result = NIL;
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($sym372$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            eval($list373);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            result = aleph_learn_from_induction_for_experiment(preds, file_utilities.temp_directory(), make_unique_aleph_dir(preds), mt, NIL, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $sym372$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str221$_A, message_var);
            }
            return czer_main.canonicalize_term(make_el_extensional_set(Mapping.mapcar(symbol_function(QUOTIFY_CYCL_TERM), result)), UNPROVIDED);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject declare_foil_export_file() {
        declareFunction(me, "bad_ilp_export_collection_p", "BAD-ILP-EXPORT-COLLECTION-P", 1, 0, false);
        declareFunction(me, "bad_ilp_export_predicate_p", "BAD-ILP-EXPORT-PREDICATE-P", 1, 0, false);
        declareMacro(me, "with_ilp_export_collections", "WITH-ILP-EXPORT-COLLECTIONS");
        declareFunction(me, "note_ilp_export_collection", "NOTE-ILP-EXPORT-COLLECTION", 1, 0, false);
        declareFunction(me, "filter_ilp_term_from_extentP", "FILTER-ILP-TERM-FROM-EXTENT?", 1, 0, false);
        declareMacro(me, "with_ilp_term_filtering_of_term", "WITH-ILP-TERM-FILTERING-OF-TERM");
        declareMacro(me, "without_ilp_term_positive_examples", "WITHOUT-ILP-TERM-POSITIVE-EXAMPLES");
        declareFunction(me, "ilp_term_export_positive_examplesP", "ILP-TERM-EXPORT-POSITIVE-EXAMPLES?", 0, 0, false);
        declareMacro(me, "without_ilp_term_negative_examples", "WITHOUT-ILP-TERM-NEGATIVE-EXAMPLES");
        declareMacro(me, "with_ilp_term_negative_examples", "WITH-ILP-TERM-NEGATIVE-EXAMPLES");
        declareFunction(me, "ilp_term_export_negative_examplesP", "ILP-TERM-EXPORT-NEGATIVE-EXAMPLES?", 0, 0, false);
        declareMacro(me, "with_ilp_term_export_synthetic_negative_examples", "WITH-ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES");
        declareMacro(me, "without_ilp_term_export_synthetic_negative_examples", "WITHOUT-ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES");
        declareFunction(me, "ilp_term_export_synthetic_negative_examplesP", "ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?", 0, 0, false);
        declareFunction(me, "current_ilp_export_style", "CURRENT-ILP-EXPORT-STYLE", 0, 0, false);
        declareFunction(me, "valid_ilp_export_style_p", "VALID-ILP-EXPORT-STYLE-P", 1, 0, false);
        declareMacro(me, "with_ilp_export_style", "WITH-ILP-EXPORT-STYLE");
        declareMacro(me, "pcase_export_style", "PCASE-EXPORT-STYLE");
        declareFunction(me, "ilp_export_section_comment", "ILP-EXPORT-SECTION-COMMENT", 2, 0, false);
        declareFunction(me, "ilp_export_simple_comment", "ILP-EXPORT-SIMPLE-COMMENT", 2, 0, false);
        declareFunction(me, "ilp_export_naut_name", "ILP-EXPORT-NAUT-NAME", 1, 0, false);
        declareFunction(me, "ilp_export_nat_name", "ILP-EXPORT-NAT-NAME", 1, 0, false);
        declareFunction(me, "ilp_export_numeric_argument", "ILP-EXPORT-NUMERIC-ARGUMENT", 1, 1, false);
        declareFunction(me, "ilp_export_clean_symbol_name_string_for_prolog", "ILP-EXPORT-CLEAN-SYMBOL-NAME-STRING-FOR-PROLOG", 2, 1, false);
        declareFunction(me, "ilp_export_term_name", "ILP-EXPORT-TERM-NAME", 1, 1, false);
        declareFunction(me, "ilp_collection_skolem_p", "ILP-COLLECTION-SKOLEM-P", 1, 0, false);
        declareFunction(me, "ilp_export_pred_name_for_collection", "ILP-EXPORT-PRED-NAME-FOR-COLLECTION", 1, 0, false);
        declareFunction(me, "clear_ilp_export_pred_name_for_collection_cached", "CLEAR-ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED", 0, 0, false);
        declareFunction(me, "remove_ilp_export_pred_name_for_collection_cached", "REMOVE-ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED", 2, 0, false);
        declareFunction(me, "ilp_export_pred_name_for_collection_cached_internal", "ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "ilp_export_pred_name_for_collection_cached", "ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED", 2, 0, false);
        declareFunction(me, "ilp_export_pred_name_for_nat", "ILP-EXPORT-PRED-NAME-FOR-NAT", 2, 0, false);
        declareFunction(me, "current_ilp_export_inductive_target_predicate", "CURRENT-ILP-EXPORT-INDUCTIVE-TARGET-PREDICATE", 0, 0, false);
        declareFunction(me, "current_ilp_export_inductive_target_predicate_argpos", "CURRENT-ILP-EXPORT-INDUCTIVE-TARGET-PREDICATE-ARGPOS", 0, 0, false);
        declareMacro(me, "with_inductive_target_predicate", "WITH-INDUCTIVE-TARGET-PREDICATE");
        declareMacro(me, "with_inductive_target_predicate_argpos", "WITH-INDUCTIVE-TARGET-PREDICATE-ARGPOS");
        declareFunction(me, "get_aleph_export_background_knowledge_filename", "GET-ALEPH-EXPORT-BACKGROUND-KNOWLEDGE-FILENAME", 1, 3, false);
        declareFunction(me, "get_aleph_export_positive_examples_filename", "GET-ALEPH-EXPORT-POSITIVE-EXAMPLES-FILENAME", 1, 3, false);
        declareFunction(me, "get_aleph_export_negative_examples_filename", "GET-ALEPH-EXPORT-NEGATIVE-EXAMPLES-FILENAME", 1, 3, false);
        declareFunction(me, "get_filestem_from_aleph_export_filename", "GET-FILESTEM-FROM-ALEPH-EXPORT-FILENAME", 1, 0, false);
        declareMacro(me, "with_aleph_mode_information_exported", "WITH-ALEPH-MODE-INFORMATION-EXPORTED");
        declareMacro(me, "without_aleph_mode_information_exported", "WITHOUT-ALEPH-MODE-INFORMATION-EXPORTED");
        declareFunction(me, "aleph_export_mode_informationP", "ALEPH-EXPORT-MODE-INFORMATION?", 0, 0, false);
        declareFunction(me, "get_ilp_export_modes_query_mt", "GET-ILP-EXPORT-MODES-QUERY-MT", 1, 1, false);
        declareFunction(me, "get_ilp_export_input_modes_query_mt", "GET-ILP-EXPORT-INPUT-MODES-QUERY-MT", 0, 1, false);
        declareFunction(me, "get_ilp_export_output_modes_query_mt", "GET-ILP-EXPORT-OUTPUT-MODES-QUERY-MT", 0, 1, false);
        declareFunction(me, "clear_get_ilp_export_mode_marker_for_style", "CLEAR-GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE", 0, 0, false);
        declareFunction(me, "remove_get_ilp_export_mode_marker_for_style", "REMOVE-GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE", 2, 0, false);
        declareFunction(me, "get_ilp_export_mode_marker_for_style_internal", "GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE-INTERNAL", 2, 0, false);
        declareFunction(me, "get_ilp_export_mode_marker_for_style", "GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE", 2, 0, false);
        declareFunction(me, "get_ilp_export_mode_marker", "GET-ILP-EXPORT-MODE-MARKER", 2, 0, false);
        declareFunction(me, "get_all_ilp_export_mode_markers_for_style", "GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE", 0, 0, false);
        declareFunction(me, "clear_get_all_ilp_export_mode_markers_for_style_cached", "CLEAR-GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED", 0, 0, false);
        declareFunction(me, "remove_get_all_ilp_export_mode_markers_for_style_cached", "REMOVE-GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED", 1, 0, false);
        declareFunction(me, "get_all_ilp_export_mode_markers_for_style_cached_internal", "GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "get_all_ilp_export_mode_markers_for_style_cached", "GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED", 1, 0, false);
        declareFunction(me, "get_ilp_export_modes_query_sentence", "GET-ILP-EXPORT-MODES-QUERY-SENTENCE", 4, 0, false);
        declareFunction(me, "get_ilp_export_input_modes_query_sentence", "GET-ILP-EXPORT-INPUT-MODES-QUERY-SENTENCE", 3, 0, false);
        declareFunction(me, "get_ilp_export_output_modes_query_sentence", "GET-ILP-EXPORT-OUTPUT-MODES-QUERY-SENTENCE", 3, 0, false);
        declareFunction(me, "get_ilp_export_modes_query_properties", "GET-ILP-EXPORT-MODES-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "get_ilp_export_output_modes_query_properties", "GET-ILP-EXPORT-OUTPUT-MODES-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "get_ilp_export_input_modes_query_properties", "GET-ILP-EXPORT-INPUT-MODES-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "clear_get_ilp_export_input_modes_for_arg_position", "CLEAR-GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION", 0, 0, false);
        declareFunction(me, "remove_get_ilp_export_input_modes_for_arg_position", "REMOVE-GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION", 3, 2, false);
        declareFunction(me, "get_ilp_export_input_modes_for_arg_position_internal", "GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION-INTERNAL", 5, 0, false);
        declareFunction(me, "get_ilp_export_input_modes_for_arg_position", "GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION", 3, 2, false);
        declareFunction(me, "clear_get_ilp_export_output_modes_for_arg_position", "CLEAR-GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION", 0, 0, false);
        declareFunction(me, "remove_get_ilp_export_output_modes_for_arg_position", "REMOVE-GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION", 3, 2, false);
        declareFunction(me, "get_ilp_export_output_modes_for_arg_position_internal", "GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION-INTERNAL", 5, 0, false);
        declareFunction(me, "get_ilp_export_output_modes_for_arg_position", "GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION", 3, 2, false);
        declareFunction(me, "new_ilp_export_predicate_arg_constraints_dbase", "NEW-ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE", 0, 0, false);
        declareFunction(me, "current_ilp_export_predicate_arg_constraints_dbase", "CURRENT-ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE", 0, 0, false);
        declareMacro(me, "with_new_ilp_export_predicate_arg_constraints_dbase", "WITH-NEW-ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE");
        declareFunction(me, "note_ilp_export_predicate_arg_constraint", "NOTE-ILP-EXPORT-PREDICATE-ARG-CONSTRAINT", 3, 1, false);
        declareFunction(me, "get_ilp_export_predicate_arg_constraint", "GET-ILP-EXPORT-PREDICATE-ARG-CONSTRAINT", 2, 1, false);
        declareFunction(me, "get_ilp_export_predicate_arg_constraint_property", "GET-ILP-EXPORT-PREDICATE-ARG-CONSTRAINT-PROPERTY", 3, 1, false);
        declareFunction(me, "new_ilp_export_negative_example_collector", "NEW-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR", 0, 0, false);
        declareFunction(me, "get_ilp_export_negative_example_collector", "GET-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR", 0, 0, false);
        declareFunction(me, "note_ilp_export_negative_example", "NOTE-ILP-EXPORT-NEGATIVE-EXAMPLE", 1, 1, false);
        declareFunction(me, "clear_functional_predicate_in_argP", "CLEAR-FUNCTIONAL-PREDICATE-IN-ARG?", 0, 0, false);
        declareFunction(me, "remove_functional_predicate_in_argP", "REMOVE-FUNCTIONAL-PREDICATE-IN-ARG?", 2, 0, false);
        declareFunction(me, "functional_predicate_in_argP_internal", "FUNCTIONAL-PREDICATE-IN-ARG?-INTERNAL", 2, 0, false);
        declareFunction(me, "functional_predicate_in_argP", "FUNCTIONAL-PREDICATE-IN-ARG?", 2, 0, false);
        declareFunction(me, "functional_predicate_in_arg1P", "FUNCTIONAL-PREDICATE-IN-ARG1?", 1, 0, false);
        declareFunction(me, "functional_predicate_in_arg2P", "FUNCTIONAL-PREDICATE-IN-ARG2?", 1, 0, false);
        declareFunction(me, "note_ilp_export_negative_examples_implied_by_positive_example", "NOTE-ILP-EXPORT-NEGATIVE-EXAMPLES-IMPLIED-BY-POSITIVE-EXAMPLE", 1, 0, false);
        declareFunction(me, "clear_ilp_export_negation_predicateP", "CLEAR-ILP-EXPORT-NEGATION-PREDICATE?", 0, 0, false);
        declareFunction(me, "remove_ilp_export_negation_predicateP", "REMOVE-ILP-EXPORT-NEGATION-PREDICATE?", 3, 0, false);
        declareFunction(me, "ilp_export_negation_predicateP_internal", "ILP-EXPORT-NEGATION-PREDICATE?-INTERNAL", 3, 0, false);
        declareFunction(me, "ilp_export_negation_predicateP", "ILP-EXPORT-NEGATION-PREDICATE?", 3, 0, false);
        declareFunction(me, "note_ilp_export_negative_examples_implied_by_positive_background_example", "NOTE-ILP-EXPORT-NEGATIVE-EXAMPLES-IMPLIED-BY-POSITIVE-BACKGROUND-EXAMPLE", 3, 0, false);
        declareFunction(me, "note_ilp_export_negative_examples_implied_by_background_assertion_spec", "NOTE-ILP-EXPORT-NEGATIVE-EXAMPLES-IMPLIED-BY-BACKGROUND-ASSERTION-SPEC", 2, 0, false);
        declareFunction(me, "ilp_export_negative_examples_gathered", "ILP-EXPORT-NEGATIVE-EXAMPLES-GATHERED", 1, 1, false);
        declareFunction(me, "new_ilp_export_known_rule_set", "NEW-ILP-EXPORT-KNOWN-RULE-SET", 0, 1, false);
        declareMacro(me, "with_known_ilp_export_rules", "WITH-KNOWN-ILP-EXPORT-RULES");
        declareMacro(me, "without_known_ilp_export_rules", "WITHOUT-KNOWN-ILP-EXPORT-RULES");
        declareFunction(me, "known_ilp_export_rules_p", "KNOWN-ILP-EXPORT-RULES-P", 0, 0, false);
        declareFunction(me, "all_known_ilp_export_rules", "ALL-KNOWN-ILP-EXPORT-RULES", 0, 0, false);
        declareFunction(me, "is_known_ilp_export_ruleP", "IS-KNOWN-ILP-EXPORT-RULE?", 1, 0, false);
        declareFunction(me, "note_known_ilp_export_rule", "NOTE-KNOWN-ILP-EXPORT-RULE", 1, 0, false);
        declareFunction(me, "note_known_ilp_export_rule_in_set", "NOTE-KNOWN-ILP-EXPORT-RULE-IN-SET", 2, 0, false);
        declareFunction(me, "generate_prolog_variations_of_cycl_rule", "GENERATE-PROLOG-VARIATIONS-OF-CYCL-RULE", 1, 0, false);
        declareFunction(me, "generate_ordering_variations_of_cycl_rule", "GENERATE-ORDERING-VARIATIONS-OF-CYCL-RULE", 1, 0, false);
        declareFunction(me, "ilp_export_pruning_for_rules", "ILP-EXPORT-PRUNING-FOR-RULES", 2, 0, false);
        declareFunction(me, "ilp_export_pruning_for_known_rules", "ILP-EXPORT-PRUNING-FOR-KNOWN-RULES", 1, 0, false);
        declareFunction(me, "ilp_export_prune_cycl_rule_directive", "ILP-EXPORT-PRUNE-CYCL-RULE-DIRECTIVE", 2, 0, false);
        declareFunction(me, "ilp_export_cycl_rule", "ILP-EXPORT-CYCL-RULE", 2, 0, false);
        declareFunction(me, "ilp_export_cycl_clause", "ILP-EXPORT-CYCL-CLAUSE", 2, 0, false);
        declareFunction(me, "current_ilp_export_type_to_instance_information", "CURRENT-ILP-EXPORT-TYPE-TO-INSTANCE-INFORMATION", 0, 0, false);
        declareFunction(me, "current_ilp_export_instance_to_type_information", "CURRENT-ILP-EXPORT-INSTANCE-TO-TYPE-INFORMATION", 0, 0, false);
        declareFunction(me, "gather_ilp_export_type_and_instance_informationP", "GATHER-ILP-EXPORT-TYPE-AND-INSTANCE-INFORMATION?", 0, 0, false);
        declareMacro(me, "with_ilp_export_type_and_instance_information", "WITH-ILP-EXPORT-TYPE-AND-INSTANCE-INFORMATION");
        declareFunction(me, "note_ilp_export_term_as_member_of_type", "NOTE-ILP-EXPORT-TERM-AS-MEMBER-OF-TYPE", 2, 0, false);
        declareFunction(me, "lookup_ilp_export_term_type_memberships", "LOOKUP-ILP-EXPORT-TERM-TYPE-MEMBERSHIPS", 1, 0, false);
        declareFunction(me, "lookup_ilp_export_type_instances", "LOOKUP-ILP-EXPORT-TYPE-INSTANCES", 1, 0, false);
        declareMacro(me, "do_ilp_export_type_and_instance_information", "DO-ILP-EXPORT-TYPE-AND-INSTANCE-INFORMATION");
        declareFunction(me, "compute_ilp_export_type_conversion_plugs_needed", "COMPUTE-ILP-EXPORT-TYPE-CONVERSION-PLUGS-NEEDED", 0, 0, false);
        declareFunction(me, "compute_ilp_export_type_co_occurrence_tuples", "COMPUTE-ILP-EXPORT-TYPE-CO-OCCURRENCE-TUPLES", 1, 1, false);
        declareFunction(me, "get_ilp_export_type_co_occurrence_for_term", "GET-ILP-EXPORT-TYPE-CO-OCCURRENCE-FOR-TERM", 2, 0, false);
        declareFunction(me, "ilp_export_type_conversion_plug_information", "ILP-EXPORT-TYPE-CONVERSION-PLUG-INFORMATION", 1, 0, false);
        declareFunction(me, "ilp_export_type_and_instance_definition", "ILP-EXPORT-TYPE-AND-INSTANCE-DEFINITION", 2, 0, false);
        declareFunction(me, "ilp_export_type_conversion_plug_extent", "ILP-EXPORT-TYPE-CONVERSION-PLUG-EXTENT", 3, 0, false);
        declareFunction(me, "clear_ilp_export_conversion_plug_name", "CLEAR-ILP-EXPORT-CONVERSION-PLUG-NAME", 0, 0, false);
        declareFunction(me, "remove_ilp_export_conversion_plug_name", "REMOVE-ILP-EXPORT-CONVERSION-PLUG-NAME", 1, 0, false);
        declareFunction(me, "ilp_export_conversion_plug_name_internal", "ILP-EXPORT-CONVERSION-PLUG-NAME-INTERNAL", 1, 0, false);
        declareFunction(me, "ilp_export_conversion_plug_name", "ILP-EXPORT-CONVERSION-PLUG-NAME", 1, 0, false);
        declareFunction(me, "ilp_export_get_argisa_constraint", "ILP-EXPORT-GET-ARGISA-CONSTRAINT", 3, 0, false);
        declareFunction(me, "ilp_export_get_argisa_constraints", "ILP-EXPORT-GET-ARGISA-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "ilp_export_term_extent_header", "ILP-EXPORT-TERM-EXTENT-HEADER", 2, 2, false);
        declareFunction(me, "aleph_export_term_mode_declarations", "ALEPH-EXPORT-TERM-MODE-DECLARATIONS", 2, 1, false);
        declareFunction(me, "ilp_export_get_predicate_argument_constraint_properties", "ILP-EXPORT-GET-PREDICATE-ARGUMENT-CONSTRAINT-PROPERTIES", 1, 1, false);
        declareFunction(me, "aleph_export_term_mode_declaration", "ALEPH-EXPORT-TERM-MODE-DECLARATION", 3, 2, false);
        declareFunction(me, "foil_export_term_extent_header", "FOIL-EXPORT-TERM-EXTENT-HEADER", 2, 1, false);
        declareFunction(me, "clear_ilp_export_mode_name_for_term", "CLEAR-ILP-EXPORT-MODE-NAME-FOR-TERM", 0, 0, false);
        declareFunction(me, "remove_ilp_export_mode_name_for_term", "REMOVE-ILP-EXPORT-MODE-NAME-FOR-TERM", 1, 0, false);
        declareFunction(me, "ilp_export_mode_name_for_term_internal", "ILP-EXPORT-MODE-NAME-FOR-TERM-INTERNAL", 1, 0, false);
        declareFunction(me, "ilp_export_mode_name_for_term", "ILP-EXPORT-MODE-NAME-FOR-TERM", 1, 0, false);
        declareFunction(me, "foil_export_assertion", "FOIL-EXPORT-ASSERTION", 2, 0, false);
        declareFunction(me, "foil_export_hl_formula", "FOIL-EXPORT-HL-FORMULA", 2, 0, false);
        declareFunction(me, "aleph_export_hl_formula", "ALEPH-EXPORT-HL-FORMULA", 2, 1, false);
        declareFunction(me, "ilp_export_assertion_for_predicate_extent", "ILP-EXPORT-ASSERTION-FOR-PREDICATE-EXTENT", 2, 1, false);
        declareFunction(me, "ilp_export_hl_formula_for_predicate_extent", "ILP-EXPORT-HL-FORMULA-FOR-PREDICATE-EXTENT", 2, 1, false);
        declareFunction(me, "variable_args_for_arity", "VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
        declareFunction(me, "clear_ilp_export_gather_predicate_extent_index", "CLEAR-ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX", 0, 0, false);
        declareFunction(me, "remove_ilp_export_gather_predicate_extent_index", "REMOVE-ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX", 3, 0, false);
        declareFunction(me, "ilp_export_gather_predicate_extent_index_internal", "ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX-INTERNAL", 3, 0, false);
        declareFunction(me, "ilp_export_gather_predicate_extent_index", "ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX", 3, 0, false);
        declareFunction(me, "ilp_export_assertion_spec", "ILP-EXPORT-ASSERTION-SPEC", 2, 1, false);
        declareFunction(me, "assertion_spec_hl_formula", "ASSERTION-SPEC-HL-FORMULA", 1, 0, false);
        declareFunction(me, "assertion_spec_hl_formula_args", "ASSERTION-SPEC-HL-FORMULA-ARGS", 1, 0, false);
        declareFunction(me, "ilp_export_symmetric_assertion_spec", "ILP-EXPORT-SYMMETRIC-ASSERTION-SPEC", 2, 0, false);
        declareFunction(me, "ilp_export_predicate_extent", "ILP-EXPORT-PREDICATE-EXTENT", 3, 2, false);
        declareFunction(me, "note_ilp_export_negative_examples_via_type_constraints", "NOTE-ILP-EXPORT-NEGATIVE-EXAMPLES-VIA-TYPE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "note_ilp_export_negative_examples_via_arg_isa_constraints", "NOTE-ILP-EXPORT-NEGATIVE-EXAMPLES-VIA-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "ilp_argn_isa", "ILP-ARGN-ISA", 2, 1, false);
        declareFunction(me, "lookup_ilp_predicate_argnum_candidate_terms", "LOOKUP-ILP-PREDICATE-ARGNUM-CANDIDATE-TERMS", 2, 0, false);
        declareFunction(me, "note_ilp_export_negative_term_example_via_arg_isa_constraint", "NOTE-ILP-EXPORT-NEGATIVE-TERM-EXAMPLE-VIA-ARG-ISA-CONSTRAINT", 3, 0, false);
        declareFunction(me, "clear_ilp_export_negative_example_argnum_variable", "CLEAR-ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE", 0, 0, false);
        declareFunction(me, "remove_ilp_export_negative_example_argnum_variable", "REMOVE-ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE", 1, 0, false);
        declareFunction(me, "ilp_export_negative_example_argnum_variable_internal", "ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE-INTERNAL", 1, 0, false);
        declareFunction(me, "ilp_export_negative_example_argnum_variable", "ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE", 1, 0, false);
        declareFunction(me, "ilp_export_compute_example_argument_lists", "ILP-EXPORT-COMPUTE-EXAMPLE-ARGUMENT-LISTS", 2, 0, false);
        declareFunction(me, "ilp_export_collection_extent", "ILP-EXPORT-COLLECTION-EXTENT", 3, 1, false);
        declareFunction(me, "ilp_export_pred_or_coll_extent", "ILP-EXPORT-PRED-OR-COLL-EXTENT", 3, 1, false);
        declareFunction(me, "ilp_export_pred_or_coll_extent_new", "ILP-EXPORT-PRED-OR-COLL-EXTENT-NEW", 3, 1, false);
        declareFunction(me, "aleph_export_predicate_determination", "ALEPH-EXPORT-PREDICATE-DETERMINATION", 3, 0, false);
        declareFunction(me, "aleph_export_predicate_determination_from_name", "ALEPH-EXPORT-PREDICATE-DETERMINATION-FROM-NAME", 4, 0, false);
        declareFunction(me, "ilp_export_find_type_extent", "ILP-EXPORT-FIND-TYPE-EXTENT", 2, 0, false);
        declareFunction(me, "aleph_export_pred_mode_determination_new", "ALEPH-EXPORT-PRED-MODE-DETERMINATION-NEW", 4, 0, false);
        declareFunction(me, "aleph_create_modes_list", "ALEPH-CREATE-MODES-LIST", 2, 0, false);
        declareFunction(me, "aleph_export_pred_mode_declaration_new", "ALEPH-EXPORT-PRED-MODE-DECLARATION-NEW", 5, 2, false);
        declareFunction(me, "aleph_export_term_all_hash_mode", "ALEPH-EXPORT-TERM-ALL-HASH-MODE", 1, 0, false);
        declareFunction(me, "aleph_export_term_all_minus_mode", "ALEPH-EXPORT-TERM-ALL-MINUS-MODE", 1, 0, false);
        declareFunction(me, "aleph_export_term_mode_declaration_new_int", "ALEPH-EXPORT-TERM-MODE-DECLARATION-NEW-INT", 1, 1, false);
        declareFunction(me, "aleph_export_mode_declarations_new", "ALEPH-EXPORT-MODE-DECLARATIONS-NEW", 4, 1, false);
        declareFunction(me, "ilp_export_type_extents_new", "ILP-EXPORT-TYPE-EXTENTS-NEW", 3, 0, false);
        declareFunction(me, "ilp_export_type_extent_new", "ILP-EXPORT-TYPE-EXTENT-NEW", 3, 0, false);
        declareFunction(me, "ilp_export_type_extents", "ILP-EXPORT-TYPE-EXTENTS", 3, 0, false);
        declareFunction(me, "ilp_export_type_extent", "ILP-EXPORT-TYPE-EXTENT", 3, 0, false);
        declareFunction(me, "aleph_export_colpred_mode_statement", "ALEPH-EXPORT-COLPRED-MODE-STATEMENT", 3, 0, false);
        declareFunction(me, "ilp_export_initialize_predicate_argument_constraint_information", "ILP-EXPORT-INITIALIZE-PREDICATE-ARGUMENT-CONSTRAINT-INFORMATION", 3, 1, false);
        declareFunction(me, "ilp_export_init_terms", "ILP-EXPORT-INIT-TERMS", 2, 0, false);
        declareFunction(me, "ilp_export_get_candidate_instances_for_collection", "ILP-EXPORT-GET-CANDIDATE-INSTANCES-FOR-COLLECTION", 2, 0, false);
        declareFunction(me, "clear_all_ilp_export_caches", "CLEAR-ALL-ILP-EXPORT-CACHES", 0, 0, false);
        declareFunction(me, "foil_export_to_file", "FOIL-EXPORT-TO-FILE", 3, 0, false);
        declareFunction(me, "foil_export_to_stream", "FOIL-EXPORT-TO-STREAM", 3, 0, false);
        declareFunction(me, "log_experimental_info", "LOG-EXPERIMENTAL-INFO", 2, 1, false);
        declareFunction(me, "log_aleph_algorithms", "LOG-ALEPH-ALGORITHMS", 1, 0, false);
        declareFunction(me, "generate_default_known_rules", "GENERATE-DEFAULT-KNOWN-RULES", 3, 1, false);
        declareFunction(me, "aleph_export_to_files_for_experiment", "ALEPH-EXPORT-TO-FILES-FOR-EXPERIMENT", 4, 2, false);
        declareFunction(me, "aleph_export_to_files", "ALEPH-EXPORT-TO-FILES", 3, 1, false);
        declareFunction(me, "aleph_export_target_predicate_to_files", "ALEPH-EXPORT-TARGET-PREDICATE-TO-FILES", 4, 1, false);
        declareFunction(me, "aleph_export_target_predicate_to_file_sets", "ALEPH-EXPORT-TARGET-PREDICATE-TO-FILE-SETS", 5, 1, false);
        declareFunction(me, "get_predicate_from_aleph_fileset", "GET-PREDICATE-FROM-ALEPH-FILESET", 1, 0, false);
        declareFunction(me, "get_argnum_from_aleph_fileset", "GET-ARGNUM-FROM-ALEPH-FILESET", 1, 0, false);
        declareFunction(me, "get_background_file_from_aleph_fileset", "GET-BACKGROUND-FILE-FROM-ALEPH-FILESET", 1, 0, false);
        declareFunction(me, "get_positive_examples_file_from_aleph_fileset", "GET-POSITIVE-EXAMPLES-FILE-FROM-ALEPH-FILESET", 1, 0, false);
        declareFunction(me, "get_negative_examples_file_from_aleph_fileset", "GET-NEGATIVE-EXAMPLES-FILE-FROM-ALEPH-FILESET", 1, 0, false);
        declareFunction(me, "get_files_from_aleph_file_set", "GET-FILES-FROM-ALEPH-FILE-SET", 1, 0, false);
        declareFunction(me, "aleph_export_background_to_stream", "ALEPH-EXPORT-BACKGROUND-TO-STREAM", 5, 2, false);
        declareFunction(me, "aleph_export_positive_examples_to_stream", "ALEPH-EXPORT-POSITIVE-EXAMPLES-TO-STREAM", 3, 0, false);
        declareFunction(me, "aleph_export_negative_examples_to_stream", "ALEPH-EXPORT-NEGATIVE-EXAMPLES-TO-STREAM", 3, 1, false);
        declareFunction(me, "aleph_export_parameter_settings", "ALEPH-EXPORT-PARAMETER-SETTINGS", 2, 0, false);
        declareFunction(me, "aleph_parameter_name_from_keyword", "ALEPH-PARAMETER-NAME-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "aleph_export_information_on_export", "ALEPH-EXPORT-INFORMATION-ON-EXPORT", 3, 1, false);
        declareFunction(me, "rule_suggestion_predicate", "RULE-SUGGESTION-PREDICATE", 0, 0, false);
        declareFunction(me, "rule_suggestion_mt", "RULE-SUGGESTION-MT", 0, 0, false);
        declareFunction(me, "cycl_var_to_prolog_var", "CYCL-VAR-TO-PROLOG-VAR", 1, 0, false);
        declareFunction(me, "prolog_var_to_cycl_var", "PROLOG-VAR-TO-CYCL-VAR", 1, 0, false);
        declareFunction(me, "cycl_rule_from_prolog", "CYCL-RULE-FROM-PROLOG", 1, 0, false);
        declareFunction(me, "filter_suggested_rule", "FILTER-SUGGESTED-RULE", 1, 1, false);
        declareFunction(me, "foil_import_from_file", "FOIL-IMPORT-FROM-FILE", 1, 0, false);
        declareFunction(me, "foil_learn_from_induction", "FOIL-LEARN-FROM-INDUCTION", 2, 2, false);
        declareFunction(me, "run_foil_program_on_files", "RUN-FOIL-PROGRAM-ON-FILES", 2, 0, false);
        declareFunction(me, "generate_foil_output_filename_from_input_filename", "GENERATE-FOIL-OUTPUT-FILENAME-FROM-INPUT-FILENAME", 1, 0, false);
        declareFunction(me, "generate_foil_input_filename_from_setname", "GENERATE-FOIL-INPUT-FILENAME-FROM-SETNAME", 1, 1, false);
        declareFunction(me, "aleph_induction_fileset_name", "ALEPH-INDUCTION-FILESET-NAME", 0, 0, false);
        declareFunction(me, "aleph_self_occupy_with_induction", "ALEPH-SELF-OCCUPY-WITH-INDUCTION", 0, 5, false);
        declareFunction(me, "find_gafs_to_occupy_self_with_induction", "FIND-GAFS-TO-OCCUPY-SELF-WITH-INDUCTION", 1, 0, false);
        declareFunction(me, "extract_instructions_from_gafs_for_induction", "EXTRACT-INSTRUCTIONS-FROM-GAFS-FOR-INDUCTION", 1, 1, false);
        declareFunction(me, "get_fileset_name_for_gafs_for_induction", "GET-FILESET-NAME-FOR-GAFS-FOR-INDUCTION", 1, 0, false);
        declareFunction(me, "aleph_learn_assertions_from_induction", "ALEPH-LEARN-ASSERTIONS-FROM-INDUCTION", 4, 4, false);
        declareFunction(me, "dumb_stringify_cyc_term_test", "DUMB-STRINGIFY-CYC-TERM-TEST", 1, 0, false);
        declareFunction(me, "is_paren", "IS_PAREN", 1, 0, false);
        declareFunction(me, "is_space", "IS_SPACE", 1, 0, false);
        declareFunction(me, "isirrelevantpredicateforilpP", "ISIRRELEVANTPREDICATEFORILP?", 1, 0, false);
        declareFunction(me, "dumb_stringify_cyc_term", "DUMB-STRINGIFY-CYC-TERM", 1, 0, false);
        declareFunction(me, "make_unique_aleph_dir", "MAKE-UNIQUE-ALEPH-DIR", 1, 0, false);
        declareFunction(me, "aleph_learn_from_mt", "ALEPH-LEARN-FROM-MT", 1, 6, false);
        declareFunction(me, "aleph_learn_from_mt2", "ALEPH-LEARN-FROM-MT2", 1, 7, false);
        declareFunction(me, "aleph_learn_from_induction_for_experiment", "ALEPH-LEARN-FROM-INDUCTION-FOR-EXPERIMENT", 4, 2, false);
        declareFunction(me, "aleph_learn_from_induction", "ALEPH-LEARN-FROM-INDUCTION", 3, 4, false);
        declareFunction(me, "aleph_assert_rules_learned_from_induction", "ALEPH-ASSERT-RULES-LEARNED-FROM-INDUCTION", 2, 2, false);
        declareFunction(me, "aleph_optimize_rules_learned_from_induction", "ALEPH-OPTIMIZE-RULES-LEARNED-FROM-INDUCTION", 2, 2, false);
        declareFunction(me, "add_rules_to_aleph_background_file", "ADD-RULES-TO-ALEPH-BACKGROUND-FILE", 2, 0, false);
        declareFunction(me, "add_known_rules_to_aleph_background_file", "ADD-KNOWN-RULES-TO-ALEPH-BACKGROUND-FILE", 1, 0, false);
        declareFunction(me, "describe_aleph_run_environment", "DESCRIBE-ALEPH-RUN-ENVIRONMENT", 0, 0, false);
        declareFunction(me, "run_aleph_on_induction_problem", "RUN-ALEPH-ON-INDUCTION-PROBLEM", 1, 3, false);
        declareFunction(me, "run_aleph_on_standard_problem", "RUN-ALEPH-ON-STANDARD-PROBLEM", 0, 1, false);
        declareFunction(me, "launch_aleph_os_process_for_experiment", "LAUNCH-ALEPH-OS-PROCESS-FOR-EXPERIMENT", 0, 4, false);
        declareFunction(me, "launch_aleph_os_process", "LAUNCH-ALEPH-OS-PROCESS", 0, 4, false);
        declareFunction(me, "assemble_command_list_for_aleph", "ASSEMBLE-COMMAND-LIST-FOR-ALEPH", 1, 2, false);
        declareFunction(me, "write_one_aleph_command", "WRITE-ONE-ALEPH-COMMAND", 2, 0, false);
        declareFunction(me, "extract_rules_from_aleph_output", "EXTRACT-RULES-FROM-ALEPH-OUTPUT", 1, 0, false);
        declareFunction(me, "extract_rules_from_aleph_output_stream", "EXTRACT-RULES-FROM-ALEPH-OUTPUT-STREAM", 1, 0, false);
        declareFunction(me, "build_rule_lines_from_aleph_output", "BUILD-RULE-LINES-FROM-ALEPH-OUTPUT", 1, 0, false);
        declareFunction(me, "ilp_import_parse_interesting_prolog_rule", "ILP-IMPORT-PARSE-INTERESTING-PROLOG-RULE", 1, 0, false);
        declareFunction(me, "ilp_import_tokenize_prolog_rule", "ILP-IMPORT-TOKENIZE-PROLOG-RULE", 1, 0, false);
        declareFunction(me, "ilp_import_parse_prolog_rule", "ILP-IMPORT-PARSE-PROLOG-RULE", 1, 0, false);
        declareFunction(me, "ilp_import_consume_prolog_head", "ILP-IMPORT-CONSUME-PROLOG-HEAD", 1, 0, false);
        declareFunction(me, "ilp_import_consume_prolog_clause", "ILP-IMPORT-CONSUME-PROLOG-CLAUSE", 1, 0, false);
        declareFunction(me, "ilp_import_consume_prolog_implication", "ILP-IMPORT-CONSUME-PROLOG-IMPLICATION", 1, 0, false);
        declareFunction(me, "cyc_sentences_induced_by_program", "CYC-SENTENCES-INDUCED-BY-PROGRAM", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_foil_export_file() {
        deflexical("*ILP-EXPORT-CODE-REVISION*", $str0$_Id__foil_export_lisp_138034_2012);
        defparameter("*BAD-ILP-EXPORT-ARG-TYPES*", $list1);
        defparameter("*ILP-TERMS-TO-EXPORT*", NIL);
        defparameter("*ILP-EXPORT-COLLECTIONS*", NIL);
        defparameter("*ILP-TERMS-FILTER-FROM-EXTENT*", NIL);
        defparameter("*ILP-ALLOW-FOCAL-TERM-IN-ANTECEDENT*", NIL);
        defparameter("*ILP-TERM-EXPORT-INCLUDE-POSITIVE-EXAMPLES*", T);
        defparameter("*ILP-TERM-EXPORT-INCLUDE-NEGATIVE-EXAMPLES*", T);
        defparameter("*ILP-TERM-EXPORT-GENERATE-SYNTHETIC-NEGATIVE-EXAMPLES*", NIL);
        defparameter("*ILP-EXPORT-STYLE*", $$ALEPH_ILPProgram);
        deflexical("*KNOWN-ILP-EXPORT-STYLES*", $list17);
        deflexical("*ILP-TERM-NAME-TO-CONSTANT-MAP*", dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        deflexical("*ILP-EXPORT-STRING-TERM-NAME-PREFIX*", $str34$string_);
        deflexical("*ILP-EXPORT-PRED-NAME-FOR-COLLECTION-CACHED-CACHING-STATE*", NIL);
        defparameter("*ILP-EXPORT-INDUCTIVE-TARGET-PREDICATE*", NIL);
        defparameter("*ILP-EXPORT-INDUCTIVE-TARGET-PREDICATE-ARGPOS*", NIL);
        deflexical("*ALEPH-EXPORT-BACKGROUND-KNOWLEDGE-FILE-EXTENSION*", $str52$_b);
        deflexical("*ALEPH-EXPORT-POSITIVE-EXAMPLES-FILE-EXTENSION*", $str53$_f);
        deflexical("*ALEPH-EXPORT-NEGATIVE-EXAMPLES-FILE-EXTENSION*", $str54$_n);
        defparameter("*ALEPH-GENERATE-MODE-INFORMATION*", NIL);
        defparameter("*ILP-EXPORT-MODE-QUERY-MAXTIME*", NIL);
        deflexical("*ILP-EXPORT-INPUT-MODES-QUERY*", $$ILP_InputModeTemplate);
        deflexical("*ILP-EXPORT-OUTPUT-MODES-QUERY*", $$ILP_OutputModeTemplate);
        deflexical("*GET-ILP-EXPORT-MODE-MARKER-FOR-STYLE-CACHING-STATE*", NIL);
        deflexical("*GET-ALL-ILP-EXPORT-MODE-MARKERS-FOR-STYLE-CACHED-CACHING-STATE*", NIL);
        deflexical("*GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION-CACHING-STATE*", NIL);
        deflexical("*GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION-CACHING-STATE*", NIL);
        defparameter("*ILP-EXPORT-PREDICATE-ARG-CONSTRAINTS-DBASE*", NIL);
        deflexical("*FUNCTIONAL-PREDICATE-IN-ARG?-CACHING-STATE*", NIL);
        deflexical("*ILP-EXPORT-NEGATION-PREDICATE-QUERY-PROPERTIES*", $list104);
        deflexical("*ILP-EXPORT-NEGATION-PREDICATE?-CACHING-STATE*", NIL);
        defparameter("*ILP-EXPORT-KNOWN-RULES*", NIL);
        defparameter("*ILP-EXPORT-TYPE-TO-INSTANCE-INFORMATION*", NIL);
        defparameter("*ILP-EXPORT-INSTANCE-TO-TYPE-INFORMATION*", NIL);
        deflexical("*ILP-EXPORT-CONVERSION-PLUG-NAME-CACHING-STATE*", NIL);
        deflexical("*ILP-EXPORT-MODE-NAME-FOR-TERM-CACHING-STATE*", NIL);
        deflexical("*VARIABLES-FOR-ARITY*", SubLTrampolineFile.maybeDefault($variables_for_arity$, $variables_for_arity$, $list166));
        deflexical("*ILP-EXPORT-GATHER-PREDICATE-EXTENT-INDEX-CACHING-STATE*", NIL);
        defvar("*ILP-EXPORT-ALLOW-VARIABLES-IN-NEGATIVE-EXAMPLES?*", T);
        deflexical("*ILP-EXPORT-NEGATIVE-EXAMPLE-ARGNUM-VARIABLE-CACHING-STATE*", NIL);
        deflexical("*DEFAULT-ALEPH-SETTINGS*", $list220);
        defparameter("*RULE-SUGGESTION-PREDICATE*", $$suggestedRule);
        defparameter("*RULE-SUGGESTION-MT*", $$SuggestedRulesMt);
        deflexical("*FOIL-SCRATCH-DIRECTORY-NAME*", $str256$_cyc_projects_butler_ILPWork_rck_);
        deflexical("*FOIL-PROGRAM-NAME*", cconcatenate($foil_scratch_directory_name$.getGlobalValue(), $$$foil6));
        deflexical("*FOIL-PROGRAM-ARGUMENTS*", $list258);
        defparameter("*ALEPH-SCRATCH-DIRECTORY-NAME*", $str262$_home_cyc60_scratch_butler_);
        defparameter("*ALEPH-INDUCTION-FILESET-NAME*", $str262$_home_cyc60_scratch_butler_);
        deflexical("*CONTINUE-SEARCHING-FOR-GAFS-FOR-INDUCTION?*", T);
        deflexical("*ALEPH-HOME-DIRECTORY-NAME*", $str318$_cyc_projects_transfer_learning_I);
        deflexical("*ALEPH-PROGRAM-NAME*", $str319$_cyc_top_scripts_aleph_yap_sh);
        deflexical("*ALEPH-PROGRAM-ARGUMENTS*", list($aleph_home_directory_name$.getGlobalValue(), $str320$_s, $int$10000, $str322$_h, $int$50000));
        deflexical("*ALEPH-COMMAND-LIST*", $list337);
        deflexical("*ILP-IMPORT-PROLOG-STOP-CHARACTERS*", list(new SubLObject[]{ CHAR_lparen, CHAR_rparen, CHAR_comma, CHAR_colon, CHAR_hyphen, CHAR_space, CHAR_period, CHAR_less, CHAR_greater }));
        return NIL;
    }

    public static SubLObject setup_foil_export_file() {
        memoization_state.note_globally_cached_function(ILP_EXPORT_PRED_NAME_FOR_COLLECTION_CACHED);
        memoization_state.note_globally_cached_function(GET_ILP_EXPORT_MODE_MARKER_FOR_STYLE);
        memoization_state.note_globally_cached_function(GET_ALL_ILP_EXPORT_MODE_MARKERS_FOR_STYLE_CACHED);
        memoization_state.note_globally_cached_function(GET_ILP_EXPORT_INPUT_MODES_FOR_ARG_POSITION);
        memoization_state.note_globally_cached_function(GET_ILP_EXPORT_OUTPUT_MODES_FOR_ARG_POSITION);
        memoization_state.note_globally_cached_function($sym96$FUNCTIONAL_PREDICATE_IN_ARG_);
        memoization_state.note_globally_cached_function($sym105$ILP_EXPORT_NEGATION_PREDICATE_);
        memoization_state.note_globally_cached_function(ILP_EXPORT_CONVERSION_PLUG_NAME);
        memoization_state.note_globally_cached_function(ILP_EXPORT_MODE_NAME_FOR_TERM);
        declare_defglobal($variables_for_arity$);
        memoization_state.note_globally_cached_function(ILP_EXPORT_GATHER_PREDICATE_EXTENT_INDEX);
        memoization_state.note_globally_cached_function(ILP_EXPORT_NEGATIVE_EXAMPLE_ARGNUM_VARIABLE);
        register_kb_function(CYC_SENTENCES_INDUCED_BY_PROGRAM);
        define_test_case_table_int(ILP_IMPORT_PARSE_INTERESTING_PROLOG_RULE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list384);
        define_test_case_table_int(ILP_EXPORT_PRED_NAME_FOR_COLLECTION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list386);
        define_test_case_table_int(ILP_EXPORT_TERM_NAME, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list388);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_foil_export_file();
    }

    @Override
    public void initializeVariables() {
        init_foil_export_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_foil_export_file();
    }
}

/**
 * Total time: 2787 ms
 */
