package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.html_utilities.decode_html_language_abbreviation;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_p;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeral_parser;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.query_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.rkf_term_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class owl_to_cycl extends SubLTranslatedFile {
    public static final SubLFile me = new owl_to_cycl();

    public static final String myName = "com.cyc.cycjava.cycl.owl.owl_to_cycl";

    public static final String myFingerPrint = "034c38d42e75098dad56f7572f6dad42fdd70d40ede0a1b71e36033932a91607";

    // deflexical
    // Definitions
    private static final SubLSymbol $owl_importer_v1_version_number$ = makeSymbol("*OWL-IMPORTER-V1-VERSION-NUMBER*");

    // defparameter
    private static final SubLSymbol $owl_importer$ = makeSymbol("*OWL-IMPORTER*");

    // deflexical
    private static final SubLSymbol $owl_merge_mt$ = makeSymbol("*OWL-MERGE-MT*");

    // deflexical
    private static final SubLSymbol $owl_term_names_preceded_by_id$ = makeSymbol("*OWL-TERM-NAMES-PRECEDED-BY-ID*");

    // deflexical
    private static final SubLSymbol $owl_term_names_preceded_by_about$ = makeSymbol("*OWL-TERM-NAMES-PRECEDED-BY-ABOUT*");

    // deflexical
    private static final SubLSymbol $owl_term_names_preceded_by_resource$ = makeSymbol("*OWL-TERM-NAMES-PRECEDED-BY-RESOURCE*");

    // deflexical
    private static final SubLSymbol $owl_term_names_preceded_by_parse_type$ = makeSymbol("*OWL-TERM-NAMES-PRECEDED-BY-PARSE-TYPE*");

    // defparameter
    private static final SubLSymbol $owl_definition_types$ = makeSymbol("*OWL-DEFINITION-TYPES*");

    // defparameter
    // :PROPERTY, :CLASS, :INSTANCE, :BNODE
    private static final SubLSymbol $owl_definition_type$ = makeSymbol("*OWL-DEFINITION-TYPE*");

    // defparameter
    private static final SubLSymbol $owl_definition_accumulator$ = makeSymbol("*OWL-DEFINITION-ACCUMULATOR*");

    // defparameter
    // The OE queue for the current thread, bound by IMPORT-OWL-ONTOLOGY.
    private static final SubLSymbol $owl_oe_queue$ = makeSymbol("*OWL-OE-QUEUE*");

    // defparameter
    // Locally bound by IMPORT-OWL-ONTOLOGY.
    private static final SubLSymbol $owl_import_parameters$ = makeSymbol("*OWL-IMPORT-PARAMETERS*");



    // deflexical
    private static final SubLSymbol $default_owl_file_encoding$ = makeSymbol("*DEFAULT-OWL-FILE-ENCODING*");



    // defconstant
    public static final SubLSymbol $dtp_owl_pred_info$ = makeSymbol("*DTP-OWL-PRED-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_owl_import_parameters$ = makeSymbol("*DTP-OWL-IMPORT-PARAMETERS*");

    // deflexical
    private static final SubLSymbol $owl_reserved_namespaces$ = makeSymbol("*OWL-RESERVED-NAMESPACES*");





    // defparameter
    private static final SubLSymbol $owl_spec_properties$ = makeSymbol("*OWL-SPEC-PROPERTIES*");



    // defparameter
    private static final SubLSymbol $owl_force_new_term_creationP$ = makeSymbol("*OWL-FORCE-NEW-TERM-CREATION?*");

    // defparameter
    private static final SubLSymbol $owl_allow_find_via_creationP$ = makeSymbol("*OWL-ALLOW-FIND-VIA-CREATION?*");

    // deflexical
    private static final SubLSymbol $cyc_properties_to_not_import$ = makeSymbol("*CYC-PROPERTIES-TO-NOT-IMPORT*");

    // deflexical
    private static final SubLSymbol $owl_found_terms$ = makeSymbol("*OWL-FOUND-TERMS*");





    // deflexical
    /**
     * A marker enqueued when an OE queue is created. Each time we process it, we
     * know we've gone through the queue once.
     */
    private static final SubLSymbol $owl_oe_queue_marker$ = makeSymbol("*OWL-OE-QUEUE-MARKER*");

    // deflexical
    /**
     * A marker enqueued when the slurper decides it's not going to add anything
     * more the the queue.
     */
    private static final SubLSymbol $owl_oe_queue_end_marker$ = makeSymbol("*OWL-OE-QUEUE-END-MARKER*");





    // defparameter
    private static final SubLSymbol $create_anonymous_owl_termsP$ = makeSymbol("*CREATE-ANONYMOUS-OWL-TERMS?*");

    // deflexical
    private static final SubLSymbol $owl_restriction_collection_templates$ = makeSymbol("*OWL-RESTRICTION-COLLECTION-TEMPLATES*");

    // defparameter
    private static final SubLSymbol $owl_term_from_specification_depth$ = makeSymbol("*OWL-TERM-FROM-SPECIFICATION-DEPTH*");

    // defconstant
    public static final SubLSymbol $dtp_owl_term_info$ = makeSymbol("*DTP-OWL-TERM-INFO*");

    // deflexical
    private static final SubLSymbol $owl_interval_datatypes$ = makeSymbol("*OWL-INTERVAL-DATATYPES*");



    // defconstant
    public static final SubLSymbol $dtp_owl_importer$ = makeSymbol("*DTP-OWL-IMPORTER*");



    // deflexical
    private static final SubLSymbol $sweet_root$ = makeSymbol("*SWEET-ROOT*");

    // deflexical
    private static final SubLSymbol $sweet_ontologies$ = makeSymbol("*SWEET-ONTOLOGIES*");

    // Internal Constants
    public static final SubLSymbol $sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_ = makeSymbol("*OWL-IMPORTER-V1-VERSION-NUMBER*");



    private static final SubLString $str2$_Revision__138034__ = makeString("$Revision: 138034 $");



    public static final SubLSymbol LIST_OF_STRING_P = makeSymbol("LIST-OF-STRING-P");





    public static final SubLSymbol $sym7$_ = makeSymbol(">");

    private static final SubLObject $$OWLOntologyQuery_GetRootClasses = reader_make_constant_shell(makeString("OWLOntologyQuery-GetRootClasses"));

    private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

    public static final SubLSymbol $sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX = makeSymbol("TERM-OF-SOME-OWL-ONTOLOGY?-VIA-INDEX");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $const14$owl_Ontology = reader_make_constant_shell(makeString("owl:Ontology"));

    private static final SubLObject $const15$owl_imports = reader_make_constant_shell(makeString("owl:imports"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLString $str17$Can_t_find_path_from__S_to___Thin = makeString("Can't find path from ~S to #$Thing.");













    private static final SubLString $str24$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str29$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str31$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str32$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str33$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$OWLMappingMt = reader_make_constant_shell(makeString("OWLMappingMt"));

    private static final SubLObject $$coExtensional = reader_make_constant_shell(makeString("coExtensional"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLSymbol MEMOIZED_COUNT_ALL_SPECS = makeSymbol("MEMOIZED-COUNT-ALL-SPECS");

    private static final SubLSymbol $sym38$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));





    private static final SubLSymbol LONGEST_ACYCLIC_GENLS_PATH_INTERNAL = makeSymbol("LONGEST-ACYCLIC-GENLS-PATH-INTERNAL");

    private static final SubLSymbol OWL_MIN_GENLS_MEMOIZED = makeSymbol("OWL-MIN-GENLS-MEMOIZED");



    private static final SubLString $$$Of = makeString("Of");





    private static final SubLList $list49 = list(new SubLObject[]{ makeString("UnknownOrganization"), makeString("FinancialOrganization"), makeString("GovernmentalOrganization"), makeString("EducationResearchOrganization"), makeString("MilitaryOrganization"), makeString("Organization"), makeString("NGO"), makeString("PoliticalOrganization"), makeString("ReligiousOrganization"), makeString("ResidentialBuilding"), makeString("EmbassyBuilding"), makeString("MinistryBuilding"), makeString("ShoppingMall"), makeString("Road"), makeString("Bridge"), makeString("Hospital"), makeString("TrainingCamp"), makeString("Park"), makeString("ReligousFacility"), makeString("Stadium"), makeString("OfficeBuilding"), makeString("IndustrialFacility"), makeString("EducationalInstitution"), makeString("CivicStructure"), makeString("Airport"), makeString("Hideout"), makeString("Kidnapping"), makeString("Arrest"), makeString("HostageTaking"), makeString("Uncovering"), makeString("Sneaking"), makeString("FailedTerrorPlot"), makeString("Assasination"), makeString("Execution"), makeString("ConflictEvent"), makeString("TerroristAttack"), makeString("Killing"), makeString("CoupAttempt"), makeString("Bombing"), makeString("CitizenPeopleGroup"), makeString("CivilianPeopleGroup"), makeString("Agent"), makeString("Event"), makeString("MinistryOfCulture"), makeString("Ministry"), makeString("Location"), makeString("Insurgent"), makeString("Citizen"), makeString("CivilianPerson"), makeString("HighSchool"), makeString("University"), makeString("Funeral"), makeString("Wedding"), makeString("CivilianEvent"), makeString("UnknownPeopleGroup"), makeString("PeopleGroup"), makeString("MilitaryEvent"), makeString("GovernmentalEvent"), makeString("SocioReligousEvent"), makeString("BookOrManifesto"), makeString("Bank"), makeString("Company"), makeString("CapitalCity"), makeString("City"), makeString("GeneralElection"), makeString("repeatingEvent"), makeString("Election"), makeString("Synagogue"), makeString("Mosque"), makeString("Church"), makeString("Temple"), makeString("departureLocation"), makeString("GeopoliticalLocation"), makeString("destination"), makeString("UnknownPerson"), makeString("GovernmentalPerson"), makeString("Person"), makeString("affiliatedWith"), makeString("PowerPlant"), makeString("NavalFacility"), makeString("NuclearFacility"), makeString("SuicideBombing"), makeString("Anniversary"), makeString("Group"), makeString("numberOfGrupMembers"), makeString("PoliticalParty"), makeString("TerroristOrganization"), makeString("State"), makeString("Country"), makeString("Province"), makeString("InsurgentPeopleGroup"), makeString("GovernmentalPeopleGroup"), makeString("Embassy"), makeString("MilitaryPerson"), makeString("War"), makeString("MilitaryPeopleGroup"), makeString("hasSpokesman"), makeString("isSpokesmanFor"), makeString("hasMember"), makeString("ideologistFor"), makeString("hasIdeologist"), makeString("husbandOf"), makeString("spouseOf"), makeString("wifeOf"), makeString("hasSubevent"), makeString("cityInCountry"), makeString("hasCity"), makeString("presentAt"), makeString("hasAttendant"), makeString("hasFollower"), makeString("followerOf"), makeString("chiefOf"), makeString("hasChief"), makeString("leaderOf"), makeString("memberOf"), makeString("hasDirector"), makeString("directorOf"), makeString("provinceInCountry"), makeString("hasProvince"), makeString("acquiredNationality"), makeString("victimOf"), makeString("hasVictim"), makeString("isPressSecretaryFor"), makeString("hasPressSecretary"), makeString("cousinOf"), makeString("familyRelativeOf"), makeString("subEventOf"), makeString("hasActor"), makeString("isActorOf"), makeString("hasChairman"), makeString("hasLeader"), makeString("isChairmanOf"), makeString("organizerOf"), makeString("organizedBy"), makeString("capitalCityInCountry"), makeString("hasCapitalCity"), makeString("childOf"), makeString("parentOf"), makeString("hasMilitant"), makeString("militantOf"), makeString("countryInState"), makeString("stateInCountry"), makeString("isPrimeMiniterOf"), makeString("hasPrimeMinister"), makeString("contactedBy"), makeString("contacts"), makeString("placeOfBirth"), makeString("residesIn"), makeString("killedAt"), makeString("hasPeopleKilled"), makeString("financedBy"), makeString("financierOf"), makeString("hasWounded"), makeString("woundedAt"), makeString("hasState"), makeString("isTargetOf"), makeString("hasTarget"), makeString("founderOf"), makeString("foundedBy"), makeString("arrestedAt"), makeString("hasPeopleArrested"), makeString("hasAuthor"), makeString("authorOf"), makeString("hasLocation"), makeString("locatedIn"), makeString("funderOf"), makeString("fundedBy"), makeString("isEventLocation"), makeString("locationOfEvent"), makeString("bornNationality"), makeString("employeeOf"), makeString("hasEmployee"), makeString("hasSuborganization"), makeString("subOrganizationOf"), makeString("happensAtPlace"), makeString("hasPart"), makeString("isPartOf"), makeString("contents"), makeString("startDateOfDuty"), makeString("occurenceTimeOfDate"), makeString("wikipediaEnrty"), makeString("currentOrganizationStatus"), makeString("langitude"), makeString("internationalOrganization"), makeString("eventTitles"), makeString("name"), makeString("damage"), makeString("endDateDuty"), makeString("numberHostages"), makeString("numberKilled"), makeString("publicName"), makeString("dateBirth"), makeString("currentPersonStatus"), makeString("dateArrested"), makeString("biography"), makeString("dateOfQuote"), makeString("lastName"), makeString("newsArticleId"), makeString("associatedKeywords"), makeString("filename"), makeString("startDate"), makeString("eventDate"), makeString("acronym"), makeString("firstName"), makeString("numberArrested"), makeString("recurrence"), makeString("currentlyInCharge"), makeString("homepage"), makeString("numberInjured"), makeString("picture"), makeString("endDate"), makeString("otherGivenNames"), makeString("associatedAlerts"), makeString("associatedNewsArticles"), makeString("size"), makeString("purpose"), makeString("dateDeath"), makeString("newsResource"), makeString("zipCode"), makeString("occurrenceDate"), makeString("associatedTitles"), makeString("foundationDate"), makeString("religion"), makeString("duration"), makeString("description"), makeString("email"), makeString("clusterId"), makeString("idEMM"), makeString("address"), makeString("maritalStatus"), makeString("occupation"), makeString("latitude"), makeString("title"), makeString("language"), makeString("colleagueOf"), makeString("siblingOf"), makeString("housemateOf"), makeString("friendOf"), makeString("gender"), makeString("areasOfOperation") });

    private static final SubLList $list50 = list(new SubLObject[]{ makeString("Bridge"), makeString("Citizen"), makeString("Airport"), makeString("Arrest"), makeString("ReligousFacility"), makeString("Bombing"), makeString("Election"), makeString("Sneaking"), makeString("BookOrManifesto"), makeString("Hideout"), makeString("Hospital"), makeString("HostageTaking"), makeString("Wedding"), makeString("GovernmentalPerson"), makeString("Park"), makeString("OfficeBuilding"), makeString("TrainingCamp"), makeString("NGO"), makeString("Church"), makeString("NavalFacility"), makeString("GovernmentalEvent"), makeString("Killing"), makeString("CivilianPeopleGroup"), makeString("NuclearFacility"), makeString("Company"), makeString("MinistryBuilding"), makeString("CivilianEvent"), makeString("University"), makeString("CoupAttempt"), makeString("Uncovering"), makeString("PeopleGroup"), makeString("TerroristOrganization"), makeString("PoliticalOrganization"), makeString("EmbassyBuilding"), makeString("MilitaryOrganization"), makeString("ReligiousOrganization"), makeString("Stadium"), makeString("EducationalInstitution"), makeString("EducationResearchOrganization"), makeString("Temple"), makeString("IndustrialFacility"), makeString("Country"), makeString("Province"), makeString("Mosque"), makeString("Execution"), makeString("Road"), makeString("FailedTerrorPlot"), makeString("SocioReligousEvent"), makeString("Assasination"), makeString("TerroristAttack"), makeString("GovernmentalOrganization"), makeString("ShoppingMall"), makeString("Ministry"), makeString("CivilianPerson"), makeString("CivicStructure"), makeString("FinancialOrganization"), makeString("hasCity"), makeString("wifeOf"), makeString("hasIdeologist"), makeString("departureLocation"), makeString("memberOf"), makeString("hasAttendant"), makeString("stateInCountry"), makeString("hasPeopleKilled"), makeString("hasLeader"), makeString("hasTarget"), makeString("destination"), makeString("City"), makeString("GeopoliticalLocation"), makeString("militantOf"), makeString("hasVictim"), makeString("hasProvince"), makeString("foundedBy"), makeString("locationOfEvent"), makeString("hasPressSecretary"), makeString("followerOf"), makeString("directorOf"), makeString("woundedAt"), makeString("isSpokesmanFor"), makeString("organizedBy"), makeString("hasCapitalCity"), makeString("hasPeopleArrested"), makeString("spouseOf"), makeString("isChairmanOf"), makeString("leaderOf"), makeString("contacts"), makeString("hasMember"), makeString("financierOf"), makeString("hasState"), makeString("hasEmployee"), makeString("authorOf"), makeString("hasPrimeMinister"), makeString("affiliatedWith"), makeString("hasChief"), makeString("isActorOf"), makeString("parentOf"), makeString("fundedBy"), makeString("CapitalCity"), makeString("ConflictEvent"), makeString("MilitaryEvent"), makeString("Agent"), makeString("Event"), makeString("repeatingEvent"), makeString("numberOfGrupMembers"), makeString("eventDate"), makeString("Location"), makeString("Organization"), makeString("Person"), makeString("subOrganizationOf"), makeString("isPartOf"), makeString("locatedIn"), makeString("familyRelativeOf") });

    public static final SubLList $list51 = list(new SubLObject[]{ makeString("Insurgent"), makeString("Funeral"), makeString("CivilianPeopleGroup"), makeString("PowerPlant"), makeString("NavalFacility"), makeString("Bank"), makeString("HighSchool"), makeString("PoliticalParty"), makeString("Church"), makeString("Synagogue"), makeString("Temple"), makeString("CivilianEvent"), makeString("GovernmentalEvent"), makeString("MilitaryEvent"), makeString("Bombing"), makeString("CoupAttempt"), makeString("Execution"), makeString("Uncovering"), makeString("Arrest"), makeString("FailedTerrorPlot"), makeString("Killing"), makeString("Assasination"), makeString("HostageTaking"), makeString("Kidnapping"), makeString("TrainingCamp"), makeString("IndustrialFacility"), makeString("Park"), makeString("MinistryBuilding"), makeString("ResidentialBuilding"), makeString("Stadium"), makeString("Hideout"), makeString("OfficeBuilding"), makeString("Airport"), makeString("EducationalInstitution"), makeString("EmbassyBuilding"), makeString("ReligousFacility"), makeString("Bridge"), makeString("Road"), makeString("Hospital"), makeString("Embassy"), makeString("GovernmentalPeopleGroup"), makeString("GovernmentalPerson"), makeString("UnknownPerson"), makeString("GeopoliticalLocation"), makeString("ReligiousOrganization"), makeString("UnknownOrganization"), makeString("MilitaryOrganization"), makeString("NGO"), makeString("GovernmentalOrganization"), makeString("PoliticalOrganization"), makeString("EducationResearchOrganization"), makeString("cousinOf"), makeString("husbandOf"), makeString("ideologistFor"), makeString("cityInCountry"), makeString("presentAt"), makeString("killedAt"), makeString("isTargetOf"), makeString("Sneaking"), makeString("hasMilitant"), makeString("TerroristOrganization"), makeString("victimOf"), makeString("Province"), makeString("provinceInCountry"), makeString("founderOf"), makeString("isEventLocation"), makeString("isPressSecretaryFor"), makeString("hasFollower"), makeString("hasDirector"), makeString("hasWounded"), makeString("hasSpokesman"), makeString("organizerOf"), makeString("CapitalCity"), makeString("hasCity"), makeString("capitalCityInCountry"), makeString("arrestedAt"), makeString("spouseOf"), makeString("hasChairman"), makeString("contactedBy"), makeString("memberOf"), makeString("financedBy"), makeString("State"), makeString("Country"), makeString("stateInCountry"), makeString("hasMember"), makeString("employeeOf"), makeString("BookOrManifesto"), makeString("hasAuthor"), makeString("isPrimeMiniterOf"), makeString("hasLeader"), makeString("chiefOf"), makeString("hasActor"), makeString("childOf"), makeString("funderOf"), makeString("damage"), makeString("ConflictEvent"), makeString("name"), makeString("Group"), makeString("Event"), makeString("Agent"), makeString("colleagueOf"), makeString("hasSuborganization"), makeString("siblingOf"), makeString("City"), makeString("hasPart"), makeString("CivicStructure"), makeString("hasLocation"), makeString("housemateOf"), makeString("familyRelativeOf"), makeString("friendOf"), makeString("Person"), makeString("Location"), makeString("affiliatedWith"), makeString("Organization") });

    public static final SubLList $list52 = list(makeString("Collection"));

    public static final SubLList $list53 = list(makeKeyword("PROPERTY"), makeKeyword("CLASS"), makeKeyword("INSTANCE"), makeKeyword("BNODE"));

    private static final SubLSymbol INITIALIZED_P = makeSymbol("INITIALIZED-P");

    private static final SubLSymbol $sym55$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol OWL_DEFINITION_NAME = makeSymbol("OWL-DEFINITION-NAME");



    private static final SubLString $str58$_S_is_not_a_valid_definition_type = makeString("~S is not a valid definition type. Must be one of ~S");

    private static final SubLSymbol IMPORT_OWL_ONTOLOGY = makeSymbol("IMPORT-OWL-ONTOLOGY");

    private static final SubLList $list60 = list(makeKeyword("URI"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("SOURCE"), makeKeyword("ONTOLOGY"), makeKeyword("QUOTED-ISA"), makeKeyword("CYCLIST"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?"));

















    private static final SubLSymbol $kw69$PREFIX_EXTERNAL_NAMES_ = makeKeyword("PREFIX-EXTERNAL-NAMES?");

    private static final SubLSymbol $kw70$ABBREVIATE_PREFIXES_ = makeKeyword("ABBREVIATE-PREFIXES?");

    private static final SubLString $str71$Can_only_import_OWL_ontologies_fr = makeString("Can only import OWL ontologies from valid files or URLs.");

    private static final SubLSymbol URI_P = makeSymbol("URI-P");





    private static final SubLSymbol XML_TOKENS_FROM_FILE = makeSymbol("XML-TOKENS-FROM-FILE");



    private static final SubLString $str77$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $sym78$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");

    private static final SubLSymbol $xml_tokens_from_file_caching_state$ = makeSymbol("*XML-TOKENS-FROM-FILE-CACHING-STATE*");

    private static final SubLInteger $int$48 = makeInteger(48);

    private static final SubLString $str81$__Importing__S_from__S_____ = makeString("~&Importing ~S from ~S...~%");



    private static final SubLString $str83$Processing__D_class_definition__P = makeString("Processing ~D class definition~:P...");



    private static final SubLString $str85$Processing__D_instance_definition = makeString("Processing ~D instance definition~:P...");

    private static final SubLString $str86$utf_8 = makeString("utf-8");

    private static final SubLString $str87$_xml = makeString("?xml");

    private static final SubLString $$$encoding = makeString("encoding");

    private static final SubLString $str89$OWLImport_ = makeString("OWLImport-");

    private static final SubLList $list90 = list(reader_make_constant_shell(makeString("ImportingAnOWLFileIntoAKnowledgeBase")));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLString $str92$ = makeString("");



    private static final SubLObject $$startingDate = reader_make_constant_shell(makeString("startingDate"));

    private static final SubLObject $$infoTransferred = reader_make_constant_shell(makeString("infoTransferred"));

    private static final SubLObject $$doneBy = reader_make_constant_shell(makeString("doneBy"));

    private static final SubLObject $$endingDate = reader_make_constant_shell(makeString("endingDate"));

    private static final SubLString $$$Ontology = makeString("Ontology");

    private static final SubLString $$$RDF = makeString("RDF");

    private static final SubLList $list100 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));

    private static final SubLList $list101 = cons(makeSymbol("ATTRIBUTE-NAME"), makeSymbol("VALUE"));

    private static final SubLString $$$base = makeString("base");

    private static final SubLString $str103$Can_t_recognize_alleged_base_URI_ = makeString("Can't recognize alleged base URI ~S as a URI.");

    private static final SubLSymbol OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT = makeSymbol("OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT");

    private static final SubLSymbol $owl_import_parameters_ontology_context_caching_state$ = makeSymbol("*OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT-CACHING-STATE*");

    private static final SubLObject $$ContextOfPCWFn = reader_make_constant_shell(makeString("ContextOfPCWFn"));

    private static final SubLString $str107$Expected_ontology_token__got__S = makeString("Expected ontology token, got ~S");

    private static final SubLString $str108$Couldn_t_find_closing_Ontology_ta = makeString("Couldn't find closing Ontology tag.~% ~S");



    private static final SubLString $$$comment = makeString("comment");

    private static final SubLString $str111$Expecting_comment__got__S = makeString("Expecting comment, got ~S");

    private static final SubLObject $const112$rdfs_comment = reader_make_constant_shell(makeString("rdfs:comment"));

    private static final SubLString $$$label = makeString("label");

    private static final SubLString $$$lang = makeString("lang");

    private static final SubLObject $$EnglishLanguage = reader_make_constant_shell(makeString("EnglishLanguage"));

    private static final SubLString $str116$Expecting_label__got__S = makeString("Expecting label, got ~S");

    private static final SubLString $$$priorVersion = makeString("priorVersion");

    private static final SubLString $$$about = makeString("about");

    private static final SubLObject $const119$owl_priorVersion = reader_make_constant_shell(makeString("owl:priorVersion"));

    private static final SubLString $$$imports = makeString("imports");

    private static final SubLString $$$versionInfo = makeString("versionInfo");

    private static final SubLString $str122$Don_t_know_how_to_handle_ontology = makeString("Don't know how to handle ontology info from ~S");

    private static final SubLSymbol OWL_PRED_INFO = makeSymbol("OWL-PRED-INFO");

    private static final SubLSymbol OWL_PRED_INFO_P = makeSymbol("OWL-PRED-INFO-P");

    private static final SubLList $list125 = list(makeSymbol("CYC-NAME"), makeSymbol("COMMENT"), makeSymbol("DOMAINS"), makeSymbol("RANGE"), makeSymbol("PLIST"));

    private static final SubLList $list126 = list(makeKeyword("CYC-NAME"), makeKeyword("COMMENT"), makeKeyword("DOMAINS"), makeKeyword("RANGE"), makeKeyword("PLIST"));

    private static final SubLList $list127 = list(makeSymbol("OPI-CYC-NAME"), makeSymbol("OPI-COMMENT"), makeSymbol("OPI-DOMAINS"), makeSymbol("OPI-RANGE"), makeSymbol("OPI-PLIST"));

    private static final SubLList $list128 = list(makeSymbol("_CSETF-OPI-CYC-NAME"), makeSymbol("_CSETF-OPI-COMMENT"), makeSymbol("_CSETF-OPI-DOMAINS"), makeSymbol("_CSETF-OPI-RANGE"), makeSymbol("_CSETF-OPI-PLIST"));

    private static final SubLSymbol PRINT_OWL_PRED_INFO = makeSymbol("PRINT-OWL-PRED-INFO");

    private static final SubLSymbol OWL_PRED_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OWL-PRED-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list131 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OWL-PRED-INFO-P"));

    private static final SubLSymbol OPI_CYC_NAME = makeSymbol("OPI-CYC-NAME");

    private static final SubLSymbol _CSETF_OPI_CYC_NAME = makeSymbol("_CSETF-OPI-CYC-NAME");

    private static final SubLSymbol OPI_COMMENT = makeSymbol("OPI-COMMENT");

    private static final SubLSymbol _CSETF_OPI_COMMENT = makeSymbol("_CSETF-OPI-COMMENT");

    private static final SubLSymbol OPI_DOMAINS = makeSymbol("OPI-DOMAINS");

    private static final SubLSymbol _CSETF_OPI_DOMAINS = makeSymbol("_CSETF-OPI-DOMAINS");

    private static final SubLSymbol OPI_RANGE = makeSymbol("OPI-RANGE");

    private static final SubLSymbol _CSETF_OPI_RANGE = makeSymbol("_CSETF-OPI-RANGE");

    private static final SubLSymbol OPI_PLIST = makeSymbol("OPI-PLIST");

    private static final SubLSymbol _CSETF_OPI_PLIST = makeSymbol("_CSETF-OPI-PLIST");











    private static final SubLString $str147$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_OWL_PRED_INFO = makeSymbol("MAKE-OWL-PRED-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OWL_PRED_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-PRED-INFO-METHOD");

    private static final SubLString $str153$_OWL_PRED_INFO__A_ = makeString("<OWL-PRED-INFO ~A>");







    private static final SubLSymbol OWL_EXTERNAL_VALUE_SPECIFICATION_P = makeSymbol("OWL-EXTERNAL-VALUE-SPECIFICATION-P");

    private static final SubLList $list158 = list(makeKeyword("COMPLEMENT-OF"), list(makeSymbol("TEST"), makeSymbol("OWL-EXTERNAL-VALUE-SPECIFICATION-P")));

    private static final SubLSymbol OWL_QUASI_TERM_P = makeSymbol("OWL-QUASI-TERM-P");

    private static final SubLList $list160 = list(makeKeyword("NODE-ID"), list(makeKeyword("TEST"), makeSymbol("STRINGP")));

    private static final SubLList $list161 = list(makeKeyword("RESTRICTION"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLList $list162 = cons(makeKeyword("UNION"), makeKeyword("ANYTHING"));

    private static final SubLList $list163 = cons(makeKeyword("INTERSECTION-OF"), makeKeyword("ANYTHING"));

    private static final SubLList $list164 = cons(makeKeyword("ONE-OF"), makeKeyword("ANYTHING"));

    private static final SubLSymbol OWL_EXTERNAL_TERM_ENUMERATION_P = makeSymbol("OWL-EXTERNAL-TERM-ENUMERATION-P");

    private static final SubLSymbol SXHASH_OWL_PRED_INFO_METHOD = makeSymbol("SXHASH-OWL-PRED-INFO-METHOD");

    private static final SubLSymbol OWL_IMPORT_PARAMETERS = makeSymbol("OWL-IMPORT-PARAMETERS");

    private static final SubLSymbol OWL_IMPORT_PARAMETERS_P = makeSymbol("OWL-IMPORT-PARAMETERS-P");

    private static final SubLList $list169 = list(new SubLObject[]{ makeSymbol("ONTOLOGY"), makeSymbol("NAMESPACE-MAP"), makeSymbol("CONSTANT-PREFIX"), makeSymbol("CONSTANT-SUFFIX"), makeSymbol("BASE-URI"), makeSymbol("URI-PREFIX"), makeSymbol("CYCLIST"), makeSymbol("QUOTED-ISA"), makeSymbol("PREFIX-EXTERNAL-NAMES?"), makeSymbol("ABBREVIATE-PREFIXES?"), makeSymbol("IMPORT-TERM"), makeSymbol("ENCODING") });

    private static final SubLList $list170 = list(new SubLObject[]{ makeKeyword("ONTOLOGY"), makeKeyword("NAMESPACE-MAP"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("BASE-URI"), makeKeyword("URI-PREFIX"), makeKeyword("CYCLIST"), makeKeyword("QUOTED-ISA"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?"), makeKeyword("IMPORT-TERM"), makeKeyword("ENCODING") });

    private static final SubLList $list171 = list(new SubLObject[]{ makeSymbol("OIP-ONTOLOGY"), makeSymbol("OIP-NAMESPACE-MAP"), makeSymbol("OIP-CONSTANT-PREFIX"), makeSymbol("OIP-CONSTANT-SUFFIX"), makeSymbol("OIP-BASE-URI"), makeSymbol("OIP-URI-PREFIX"), makeSymbol("OIP-CYCLIST"), makeSymbol("OIP-QUOTED-ISA"), makeSymbol("OIP-PREFIX-EXTERNAL-NAMES?"), makeSymbol("OIP-ABBREVIATE-PREFIXES?"), makeSymbol("OIP-IMPORT-TERM"), makeSymbol("OIP-ENCODING") });

    private static final SubLList $list172 = list(new SubLObject[]{ makeSymbol("_CSETF-OIP-ONTOLOGY"), makeSymbol("_CSETF-OIP-NAMESPACE-MAP"), makeSymbol("_CSETF-OIP-CONSTANT-PREFIX"), makeSymbol("_CSETF-OIP-CONSTANT-SUFFIX"), makeSymbol("_CSETF-OIP-BASE-URI"), makeSymbol("_CSETF-OIP-URI-PREFIX"), makeSymbol("_CSETF-OIP-CYCLIST"), makeSymbol("_CSETF-OIP-QUOTED-ISA"), makeSymbol("_CSETF-OIP-PREFIX-EXTERNAL-NAMES?"), makeSymbol("_CSETF-OIP-ABBREVIATE-PREFIXES?"), makeSymbol("_CSETF-OIP-IMPORT-TERM"), makeSymbol("_CSETF-OIP-ENCODING") });

    private static final SubLSymbol PRINT_OWL_IMPORT_PARAMETERS = makeSymbol("PRINT-OWL-IMPORT-PARAMETERS");

    private static final SubLSymbol OWL_IMPORT_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OWL-IMPORT-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list175 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OWL-IMPORT-PARAMETERS-P"));

    private static final SubLSymbol OIP_ONTOLOGY = makeSymbol("OIP-ONTOLOGY");

    private static final SubLSymbol _CSETF_OIP_ONTOLOGY = makeSymbol("_CSETF-OIP-ONTOLOGY");

    private static final SubLSymbol OIP_NAMESPACE_MAP = makeSymbol("OIP-NAMESPACE-MAP");

    private static final SubLSymbol _CSETF_OIP_NAMESPACE_MAP = makeSymbol("_CSETF-OIP-NAMESPACE-MAP");

    private static final SubLSymbol OIP_CONSTANT_PREFIX = makeSymbol("OIP-CONSTANT-PREFIX");

    private static final SubLSymbol _CSETF_OIP_CONSTANT_PREFIX = makeSymbol("_CSETF-OIP-CONSTANT-PREFIX");

    private static final SubLSymbol OIP_CONSTANT_SUFFIX = makeSymbol("OIP-CONSTANT-SUFFIX");

    private static final SubLSymbol _CSETF_OIP_CONSTANT_SUFFIX = makeSymbol("_CSETF-OIP-CONSTANT-SUFFIX");

    private static final SubLSymbol OIP_BASE_URI = makeSymbol("OIP-BASE-URI");

    private static final SubLSymbol _CSETF_OIP_BASE_URI = makeSymbol("_CSETF-OIP-BASE-URI");

    private static final SubLSymbol OIP_URI_PREFIX = makeSymbol("OIP-URI-PREFIX");

    private static final SubLSymbol _CSETF_OIP_URI_PREFIX = makeSymbol("_CSETF-OIP-URI-PREFIX");

    private static final SubLSymbol OIP_CYCLIST = makeSymbol("OIP-CYCLIST");

    private static final SubLSymbol _CSETF_OIP_CYCLIST = makeSymbol("_CSETF-OIP-CYCLIST");

    private static final SubLSymbol OIP_QUOTED_ISA = makeSymbol("OIP-QUOTED-ISA");

    private static final SubLSymbol _CSETF_OIP_QUOTED_ISA = makeSymbol("_CSETF-OIP-QUOTED-ISA");

    private static final SubLSymbol $sym192$OIP_PREFIX_EXTERNAL_NAMES_ = makeSymbol("OIP-PREFIX-EXTERNAL-NAMES?");

    private static final SubLSymbol $sym193$_CSETF_OIP_PREFIX_EXTERNAL_NAMES_ = makeSymbol("_CSETF-OIP-PREFIX-EXTERNAL-NAMES?");

    private static final SubLSymbol $sym194$OIP_ABBREVIATE_PREFIXES_ = makeSymbol("OIP-ABBREVIATE-PREFIXES?");

    private static final SubLSymbol $sym195$_CSETF_OIP_ABBREVIATE_PREFIXES_ = makeSymbol("_CSETF-OIP-ABBREVIATE-PREFIXES?");

    private static final SubLSymbol OIP_IMPORT_TERM = makeSymbol("OIP-IMPORT-TERM");

    private static final SubLSymbol _CSETF_OIP_IMPORT_TERM = makeSymbol("_CSETF-OIP-IMPORT-TERM");

    private static final SubLSymbol OIP_ENCODING = makeSymbol("OIP-ENCODING");

    private static final SubLSymbol _CSETF_OIP_ENCODING = makeSymbol("_CSETF-OIP-ENCODING");









    private static final SubLSymbol MAKE_OWL_IMPORT_PARAMETERS = makeSymbol("MAKE-OWL-IMPORT-PARAMETERS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OWL_IMPORT_PARAMETERS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-IMPORT-PARAMETERS-METHOD");

    private static final SubLString $str206$_OWL_IMPORT_PARAMETERS__S_ = makeString("<OWL-IMPORT-PARAMETERS ~S>");



    private static final SubLSymbol $sym208$CYCLIST_ = makeSymbol("CYCLIST?");

    private static final SubLObject $$SoftwareVersionFn = reader_make_constant_shell(makeString("SoftwareVersionFn"));

    private static final SubLObject $$OWLImporter_Cyc = reader_make_constant_shell(makeString("OWLImporter-Cyc"));

    private static final SubLObject $$UserOfProgramFn = reader_make_constant_shell(makeString("UserOfProgramFn"));

    private static final SubLString $str212$Multiple_uris_for__S_____S____S = makeString("Multiple uris for ~S:~% ~S~% ~S");



    private static final SubLSymbol SXHASH_OWL_IMPORT_PARAMETERS_METHOD = makeSymbol("SXHASH-OWL-IMPORT-PARAMETERS-METHOD");

    private static final SubLString $$$resource = makeString("resource");

    private static final SubLString $str216$_ = makeString("#");

    private static final SubLString $$$interpretation_of_ = makeString("interpretation of ");

    private static final SubLString $str218$_as_a_URI_for_an_imported_ontolog = makeString(" as a URI for an imported ontology.");

    private static final SubLList $list219 = cons(makeSymbol("NAMESPACE"), makeSymbol("PROBLEM-STRING"));

    public static final SubLList $list220 = cons(makeSymbol("ATTRIBUTE-NAME"), makeUninternedSymbol("VALUE"));

    private static final SubLString $str221$Namespace_problem___A = makeString("Namespace problem: ~A");

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLList $list223 = list(list(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), list(makeString("owl"), makeString("http://www.w3.org/2002/07/owl#")), list(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#")), list(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")), list(makeString("dc"), makeString("http://purl.org/dc/elements/1.1/")));

    private static final SubLString $$$_is_bound_to_ = makeString(" is bound to ");

    private static final SubLString $str225$_ = makeString(".");

    private static final SubLString $$$_Must_be_one_of_ = makeString(" Must be one of ");

    private static final SubLString $$$No_import_statement_for_ = makeString("No import statement for ");

    private static final SubLSymbol FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI = makeSymbol("FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI");

    private static final SubLSymbol $sym229$_ONTOLOGY = makeSymbol("?ONTOLOGY");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list231 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ONTOLOGY"), reader_make_constant_shell(makeString("owl:Ontology")));

    private static final SubLObject $$salientURI = reader_make_constant_shell(makeString("salientURI"));







    private static final SubLList $list236 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLString $str237$__ = makeString("~&");

    private static final SubLString $str238$Couldn_t_find_ontology_for__S__Cr = makeString("Couldn't find ontology for ~S. Creating a new one.");

    private static final SubLString $str239$__ = makeString("~%");

    private static final SubLObject $$OWLOntologyFn = reader_make_constant_shell(makeString("OWLOntologyFn"));

    private static final SubLSymbol $find_or_create_owl_ontology_for_uri_caching_state$ = makeSymbol("*FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI-CACHING-STATE*");

    private static final SubLSymbol $sym242$_TERM_TYPE = makeSymbol("?TERM-TYPE");

    private static final SubLObject $$termTypeForOntology = reader_make_constant_shell(makeString("termTypeForOntology"));

    private static final SubLList $list244 = list(makeSymbol("?TERM-TYPE"));

    private static final SubLObject $$TermFromOntologyFn = reader_make_constant_shell(makeString("TermFromOntologyFn"));



    private static final SubLString $str247$There_is_no_range_for__S__Name_to = makeString("There is no range for ~S~%Name token: ~S");

    private static final SubLSymbol OWL_PROPERTY_ELEMENT_NAMES = makeSymbol("OWL-PROPERTY-ELEMENT-NAMES");

    private static final SubLString $$$DatatypeProperty = makeString("DatatypeProperty");

    private static final SubLString $$$AnnotationProperty = makeString("AnnotationProperty");

    private static final SubLString $$$ObjectProperty = makeString("ObjectProperty");

    private static final SubLString $$$FunctionalProperty = makeString("FunctionalProperty");

    private static final SubLString $$$SymmetricProperty = makeString("SymmetricProperty");

    private static final SubLString $$$TransitiveProperty = makeString("TransitiveProperty");

    private static final SubLSymbol $owl_property_element_names_caching_state$ = makeSymbol("*OWL-PROPERTY-ELEMENT-NAMES-CACHING-STATE*");

    private static final SubLString $str256$____ = makeString("<!--");

    private static final SubLString $str257$___ = makeString("-->");

    private static final SubLString $str258$Couldn_t_find_end_of_HTML_comment = makeString("Couldn't find end of HTML comment: ~S");

    private static final SubLString $str259$Skipping_comment___S = makeString("Skipping comment: ~S");



    private static final SubLSymbol $NEXT_NON_WHITESPACE_TOKEN = makeKeyword("NEXT-NON-WHITESPACE-TOKEN");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $str263$Can_t_interpret_empty_label_token = makeString("Can't interpret empty label token ~S");

    private static final SubLString $str264$Can_t_decode_language_abbreviatio = makeString("Can't decode language abbreviation ~S");



    private static final SubLString $$$domain = makeString("domain");

    private static final SubLString $str267$Couldn_t_identify_domain_from__S = makeString("Couldn't identify domain from ~S");

    private static final SubLString $$$inverseOf = makeString("inverseOf");

    private static final SubLString $str269$__ = makeString("/>");

    private static final SubLString $str270$_S_is_its_own_inverse__so_it_s_sy = makeString("~S is its own inverse, so it's symmetric.");





    private static final SubLString $$$subPropertyOf = makeString("subPropertyOf");

    private static final SubLString $str274$Noting_genl_property__S_of__S = makeString("Noting genl property ~S of ~S");



    private static final SubLString $$$equivalentProperty = makeString("equivalentProperty");

    private static final SubLString $str277$Noting_equivalent_property__S_of_ = makeString("Noting equivalent property ~S of ~S");



    private static final SubLString $$$range = makeString("range");

    private static final SubLString $str280$Couldn_t_identify_range_from__S = makeString("Couldn't identify range from ~S");

    private static final SubLString $$$guid = makeString("guid");

    private static final SubLString $$$string = makeString("string");

    private static final SubLString $str283$__Noting_Cyc_guid_for__S_S__ = makeString("~&Noting Cyc guid for ~S~S~%");



    private static final SubLString $$$externalID = makeString("externalID");

    private static final SubLString $str286$__Noting_Cyc_externalID_for__S_S_ = makeString("~&Noting Cyc externalID for ~S~S~%");



    private static final SubLString $$$datatype = makeString("datatype");

    private static final SubLString $$$isa = makeString("isa");

    private static final SubLString $str290$__Noting__isa__S__S___ = makeString("~&Noting (isa ~S ~S)~%");

    private static final SubLString $str291$__Noting__S__S__ = makeString("~&Noting ~S ~S~%");

    private static final SubLSymbol $MY_PRED_VALUES = makeKeyword("MY-PRED-VALUES");

    private static final SubLString $str293$Ignoring_unrecognized_token___S = makeString("Ignoring unrecognized token: ~S");

    private static final SubLString $str294$cyc_com = makeString("cyc.com");

    private static final SubLString $str295$Don_t_know_how_to_interpret_attri = makeString("Don't know how to interpret attribute value ~S");



    private static final SubLString $str297$Processing__D_property_definition = makeString("Processing ~D property definition~:P...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $$$DataRange = makeString("DataRange");

    private static final SubLString $$$oneOf = makeString("oneOf");

    private static final SubLString $str301$Can_t_read_range_starting_with__S = makeString("Can't read range starting with ~S");

    private static final SubLString $str302$__rdfs_range_ = makeString("</rdfs:range>");

    private static final SubLString $str303$Finished_range__S_ = makeString("Finished range ~S.");

    private static final SubLSymbol OWL_CLASS_ELEMENT_NAMES = makeSymbol("OWL-CLASS-ELEMENT-NAMES");

    private static final SubLString $$$Class = makeString("Class");

    private static final SubLString $$$DeprecatedClass = makeString("DeprecatedClass");

    private static final SubLSymbol $owl_class_element_names_caching_state$ = makeSymbol("*OWL-CLASS-ELEMENT-NAMES-CACHING-STATE*");

    private static final SubLSymbol OWL_CLASS_TOKEN_P = makeSymbol("OWL-CLASS-TOKEN-P");

    private static final SubLString $str309$Reading_OWL_class_starting_with__ = makeString("Reading OWL class starting with~% ~S");

    private static final SubLString $$$nodeID = makeString("nodeID");

    private static final SubLList $list311 = list(makeKeyword("CLASS"), makeKeyword("BNODE"));

    private static final SubLSymbol OWL_TERM_INFO_P = makeSymbol("OWL-TERM-INFO-P");

    private static final SubLString $str313$Starting_token___S = makeString("Starting token: ~S");

    private static final SubLString $str314$No_progress_reading_OWL_class__St = makeString("No progress reading OWL class: Stuck on ~A.");

    private static final SubLString $$$Description = makeString("Description");

    private static final SubLString $$$Restriction = makeString("Restriction");

    private static final SubLString $str317$Reading_restriction_starting_with = makeString("Reading restriction starting with ~S");

    private static final SubLString $$$unionOf = makeString("unionOf");

    private static final SubLString $str319$Don_t_know_what_to_do_with_this_t = makeString("Don't know what to do with this token while reading OWL class:~% ~S~%");



    private static final SubLString $str321$Found_class___S___Components___S = makeString("Found class: ~S~% Components: ~S");







    private static final SubLString $str325$Don_t_know_what_this_class_is_nam = makeString("Don't know what this class is named:~% ~S");

    private static final SubLString $str326$Can_t_read_an_enumeration_that_is = makeString("Can't read an enumeration that isn't a oneOf range:~% ~S");

    private static final SubLString $$$rest = makeString("rest");

    private static final SubLString $$$first = makeString("first");

    private static final SubLString $str329$Couldn_t_get_name_from__S = makeString("Couldn't get name from ~S");

    private static final SubLString $str330$Read_enumeration___S = makeString("Read enumeration: ~S");



    private static final SubLString $str332$http___www_w3_org_1999_02_22_rdf_ = makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil");

    private static final SubLString $$$parseType = makeString("parseType");

    private static final SubLString $$$Collection = makeString("Collection");

    private static final SubLString $str335$Found_non_first__non_rest_token_i = makeString("Found non-first, non-rest token in OWL list:~% ~S");

    private static final SubLString $str336$__Next_item___S__ = makeString("~&Next item: ~S~%");



    private static final SubLString $$$ID = makeString("ID");

    private static final SubLString $str339$Got_null_arg_isa_name_in__S = makeString("Got null arg-isa name in ~S");

    private static final SubLSymbol XML_SCHEMA_CLASS_URIS = makeSymbol("XML-SCHEMA-CLASS-URIS");

    private static final SubLList $list341 = cons(makeSymbol("?LOCAL-NAME"), makeSymbol("?COLL"));

    public static final SubLList $list342 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("owlURI")), makeSymbol("?TERM"), list(reader_make_constant_shell(makeString("URLFn")), makeSymbol("?URI"))), list(reader_make_constant_shell(makeString("concatenateStrings")), makeSymbol("?URI"), makeString("http://www.w3.org/2000/10/XMLSchema#"), makeSymbol("?LOCAL-NAME")), list(reader_make_constant_shell(makeString("owlDataTypeSemanticCorrelation")), makeSymbol("?TERM"), makeSymbol("?COLL")));

    private static final SubLList $list343 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));





    private static final SubLList $list346 = list(makeKeyword("NONLOCAL"), makeString("http://www.w3.org/2001/XMLSchema"), makeKeyword("ANYTHING"));

    private static final SubLString $str347$__Found_term_by_guid___S = makeString("~&Found term by guid: ~S");

    private static final SubLString $str348$__Found_term_by_externalID___S = makeString("~&Found term by externalID: ~S");

    private static final SubLObject $const349$owl_Class = reader_make_constant_shell(makeString("owl:Class"));

    private static final SubLSymbol $sym350$_URI = makeSymbol("?URI");

    private static final SubLObject $$standardPrefixForURI = reader_make_constant_shell(makeString("standardPrefixForURI"));

    private static final SubLList $list352 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("EL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    public static final SubLList $list353 = list(reader_make_constant_shell(makeString("URIFn")), list(makeKeyword("BIND"), makeSymbol("STRING-ARG")));

    private static final SubLSymbol STRING_ARG = makeSymbol("STRING-ARG");

    private static final SubLSymbol OWL_FIND_OR_CREATE_TERM_OF_TYPE = makeSymbol("OWL-FIND-OR-CREATE-TERM-OF-TYPE");

    private static final SubLString $str356$Couldn_t_find_URI_for_namespace__ = makeString("Couldn't find URI for namespace ~S");

    private static final SubLString $str357$Can_t_find_or_create_term_of_type = makeString("Can't find or create term of type ~S from ~S");

    private static final SubLSymbol CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");

    private static final SubLString $str359$external_name_appears_to_contain_ = makeString("external-name appears to contain a control character: ~S");

    private static final SubLString $str360$external_name_appears_to_contain_ = makeString("external-name appears to contain prefix: ~S");

    private static final SubLObject $$OWLClass = reader_make_constant_shell(makeString("OWLClass"));

    private static final SubLSymbol OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY = makeSymbol("OWL-FIND-OR-CREATE-TERM-OF-TYPE-IN-ONTOLOGY");

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLString $str366$_ = makeString(":");

    private static final SubLList $list367 = list(reader_make_constant_shell(makeString("OWLOntologyFn")), list(makeKeyword("BIND"), makeSymbol("ARG1")));



    private static final SubLObject $$owlDefiningOntologyURI = reader_make_constant_shell(makeString("owlDefiningOntologyURI"));

    public static final SubLList $list370 = list(makeSymbol("?URI"));

    private static final SubLList $list371 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    private static final SubLSymbol TRY_TO_ABBREVIATE_OWL_URI = makeSymbol("TRY-TO-ABBREVIATE-OWL-URI");

    private static final SubLString $str373$_cyc_top_transcripts_0953_jonny2_ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-62-sent.ts");

    private static final SubLString $str374$_cyc_top_transcripts_0953_vela_20 = makeString("/cyc/top/transcripts/0953/vela-20080414111900-21395-local-2-sent.ts");

    private static final SubLString $str375$_cyc_top_transcripts_0953_vela_20 = makeString("/cyc/top/transcripts/0953/vela-20080416102200-16797-local-0-sent.ts");

    private static final SubLString $str376$_cyc_top_transcripts_0953_jonny2_ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-64-sent.ts");

    private static final SubLString $str377$_cyc_top_transcripts_0953_jonny2_ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-68-sent.ts");

    private static final SubLString $str378$_cyc_top_transcripts_0953_jonny2_ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-69-sent.ts");

    private static final SubLString $str379$_cyc_top_transcripts_0953_jonny2_ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-94-sent.ts");



    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$nameSpacePrefixForSKS = reader_make_constant_shell(makeString("nameSpacePrefixForSKS"));

    private static final SubLObject $$URIFn = reader_make_constant_shell(makeString("URIFn"));

    private static final SubLList $list384 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol CYCL_TERM_OR_OWL_QUASI_TERM_P = makeSymbol("CYCL-TERM-OR-OWL-QUASI-TERM-P");

    private static final SubLObject $$CollectionUnionFn = reader_make_constant_shell(makeString("CollectionUnionFn"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLObject $$CollectionIntersectionFn = reader_make_constant_shell(makeString("CollectionIntersectionFn"));

    private static final SubLObject $$SingletonCollectionFn = reader_make_constant_shell(makeString("SingletonCollectionFn"));

    private static final SubLObject $$TheCollection = reader_make_constant_shell(makeString("TheCollection"));

    private static final SubLList $list392 = list(makeString("externalID"), makeString("guid"), makeString("nonAtomicFormula"), makeString("literalValue"), makeString("isa"));

    private static final SubLObject $$OWLProperty = reader_make_constant_shell(makeString("OWLProperty"));

    private static final SubLSymbol $sym394$SPEC_ = makeSymbol("SPEC?");

    private static final SubLString $str395$Potentially_adding_assertions_to_ = makeString("Potentially adding assertions to existing predicate ~S");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLString $str397$__Creating_predicate_from__S__ = makeString("~&Creating predicate from ~S~%");

    private static final SubLString $str398$Failed_to_find_or_create_a_predic = makeString("Failed to find or create a predicate with name: ~S~%");

    private static final SubLObject $const399$owl_SymmetricProperty = reader_make_constant_shell(makeString("owl:SymmetricProperty"));

    private static final SubLList $list400 = list(makeSymbol("URI"), makeSymbol("NAME"));

    private static final SubLObject $const401$rdfs_domain = reader_make_constant_shell(makeString("rdfs:domain"));

    private static final SubLList $list402 = list(reader_make_constant_shell(makeString("Thing")));

    private static final SubLObject $const403$rdfs_range = reader_make_constant_shell(makeString("rdfs:range"));

    private static final SubLString $str404$Asserting_genl_property__S_of__S = makeString("Asserting genl property ~S of ~S");

    private static final SubLObject $const405$rdfs_subPropertyOf = reader_make_constant_shell(makeString("rdfs:subPropertyOf"));

    private static final SubLString $str406$Asserting_spec_property__S_of__S = makeString("Asserting spec property ~S of ~S");

    private static final SubLObject $$InverseBinaryPredicateFn = reader_make_constant_shell(makeString("InverseBinaryPredicateFn"));

    private static final SubLString $str408$Asserting_inverse__S_of__S = makeString("Asserting inverse ~S of ~S");

    private static final SubLString $str409$Asserting_equivalent_property__S_ = makeString("Asserting equivalent-property ~S of ~S");

    private static final SubLString $str410$Couldn_t_find_equivalent_property = makeString("Couldn't find equivalent property ~S");

    private static final SubLObject $const411$owl_equivalentProperty = reader_make_constant_shell(makeString("owl:equivalentProperty"));

    private static final SubLList $list412 = list(makeSymbol("PROPERTY-NAME"), makeSymbol("VALUE"));

    private static final SubLString $str413$__Asserting__S__ = makeString("~&Asserting ~S~%");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol $sym415$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    private static final SubLSymbol $sym416$_TERM = makeSymbol("?TERM");

    private static final SubLString $str417$Couldn_t_find__S = makeString("Couldn't find ~S");

    private static final SubLSymbol $owl_oe_queues$ = makeSymbol("*OWL-OE-QUEUES*");

    private static final SubLSymbol $owl_oe_daemon$ = makeSymbol("*OWL-OE-DAEMON*");

    private static final SubLSymbol $owl_node_id_index$ = makeSymbol("*OWL-NODE-ID-INDEX*");

    private static final SubLString $str421$Circular_node_id_reference___S___ = makeString("Circular node id reference: ~S -> ~S");



    private static final SubLString $str423$Postponing__isa__S__S__because__S = makeString("Postponing (isa ~S ~S) because ~S is not (yet) known to be a collection.");

    private static final SubLList $list424 = list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("BinaryPredicate")), reader_make_constant_shell(makeString("Predicate")));



    private static final SubLString $str426$_ = makeString("-");



    private static final SubLString $$$OWL_OE_Daemon = makeString("OWL OE Daemon");

    private static final SubLSymbol OWL_OE_DAEMON_RUN = makeSymbol("OWL-OE-DAEMON-RUN");



    private static final SubLString $str431$Waiting_for__D_enqueued_operation = makeString("Waiting for ~D enqueued operation~:P to be processed...");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str433$__Finished_pass_through_queue__Si = makeString("~&Finished pass through queue. Size (including markers) is now ~D. Going around again...~%");

    private static final SubLString $str434$__OE_queue_is_empty__Zzz___ = makeString("~&OE queue is empty. Zzz.~%");

    private static final SubLString $str435$Unable_to_perform__D_operation__P = makeString("Unable to perform ~D operation~:P:~% ~S~%");

    private static final SubLString $str436$__Can_t_do_anything_with_queue_no = makeString("~&Can't do anything with queue now. Awaiting further operations. Zzz.~%");

    private static final SubLList $list437 = cons(makeKeyword("ASSERT"), makeKeyword("ANYTHING"));

    private static final SubLString $str438$__Noting_OE_performed___S__ = makeString("~&Noting OE performed: ~S~%");

    private static final SubLList $list439 = list(makeSymbol("QUASI-FORMULA"), makeSymbol("MT"), makeSymbol("IMPORT-PARAMETERS"));

    private static final SubLString $str440$__Failed_to_resolve__S__ = makeString("~&Failed to resolve ~S~%");

    private static final SubLSymbol RESOLVE_OWL_QUASI_TERM = makeSymbol("RESOLVE-OWL-QUASI-TERM");

    private static final SubLString $str442$Problem_performing__S = makeString("Problem performing ~S");

    private static final SubLSymbol $OWL_QUASI_TERM = makeKeyword("OWL-QUASI-TERM");



    private static final SubLString $str445$_S_is_not_an_OWL_node_ID_ = makeString("~S is not an OWL node ID.");

    private static final SubLList $list446 = cons(makeKeyword("OWL-QUASI-TERM"), makeKeyword("ANYTHING"));

    private static final SubLList $list447 = list(makeSymbol("EXTERNAL-NAME"), makeSymbol("TYPE"), makeSymbol("ONTOLOGY"), makeSymbol("IMPORT-PARAMETERS"));

    private static final SubLSymbol NOTE_FOUND_TERM_RESOLUTION = makeSymbol("NOTE-FOUND-TERM-RESOLUTION");

    private static final SubLString $str449$__Resolved__S___to__S__ = makeString("~&Resolved ~S~% to ~S~%");

    private static final SubLSymbol $note_found_term_resolution_caching_state$ = makeSymbol("*NOTE-FOUND-TERM-RESOLUTION-CACHING-STATE*");

    private static final SubLSymbol OWL_ASSERT = makeSymbol("OWL-ASSERT");

    private static final SubLSymbol NON_ASCII_STRING_P = makeSymbol("NON-ASCII-STRING-P");

    private static final SubLSymbol NON_ASCII_STRING_TO_UNICODE = makeSymbol("NON-ASCII-STRING-TO-UNICODE");

    private static final SubLString $str454$Already_know__S___in__S = makeString("Already know ~S~% in ~S");

    private static final SubLString $str455$Failed_to_assert__S__ = makeString("Failed to assert ~S~%");

    private static final SubLString $str456$Processing_term_definitions___ = makeString("Processing term definitions...");

    private static final SubLString $str457$Anonymous_ = makeString("Anonymous-");

    private static final SubLString $str458$__Creating__S_____ = makeString("~&Creating ~S...~%");

    private static final SubLString $str459$Potentially_adding_assertions_to_ = makeString("Potentially adding assertions to existing term ~S");

    private static final SubLString $str460$__Defining_term_from__S__ = makeString("~&Defining term from ~S~%");

    private static final SubLString $str461$Failed_to_find_or_create_a_term_w = makeString("Failed to find or create a term with name: ~S~%");





    private static final SubLString $$$Thing = makeString("Thing");

    private static final SubLObject $const465$owl_Thing = reader_make_constant_shell(makeString("owl:Thing"));

    private static final SubLString $str466$Asserting_genl_class__S_of__S = makeString("Asserting genl class ~S of ~S");

    private static final SubLObject $const467$rdfs_subClassOf = reader_make_constant_shell(makeString("rdfs:subClassOf"));

    public static final SubLList $list468 = list(makeKeyword("COMPLEMENT-OF"), makeKeyword("ANYTHING"));

    private static final SubLString $str469$Asserting_disjoint_class__S_of__S = makeString("Asserting disjoint class ~S of ~S");

    private static final SubLObject $const470$owl_disjointWith = reader_make_constant_shell(makeString("owl:disjointWith"));

    private static final SubLString $str471$Don_t_know_how_to_handle_supercla = makeString("Don't know how to handle superclass ~S");

    private static final SubLString $str472$Asserting_disjoint___S_and__S = makeString("Asserting disjoint: ~S and ~S");

    private static final SubLString $str473$Don_t_know_how_to_handle_disjoint = makeString("Don't know how to handle disjoint class ~S");

    private static final SubLString $str474$Asserting_union__S_of__S = makeString("Asserting union ~S of ~S");

    private static final SubLObject $$collectionUnion = reader_make_constant_shell(makeString("collectionUnion"));

    private static final SubLString $str476$Asserting_intersection__S_of__S = makeString("Asserting intersection ~S of ~S");

    private static final SubLObject $$collectionIntersection = reader_make_constant_shell(makeString("collectionIntersection"));



    private static final SubLString $str479$Asserting_enumeration__S_of__S = makeString("Asserting enumeration ~S of ~S");

    private static final SubLObject $$completelyAssertedCollection = reader_make_constant_shell(makeString("completelyAssertedCollection"));

    private static final SubLString $str481$Can_t_handle__S__value___S_ = makeString("Can't handle ~S (value: ~S)");

    private static final SubLList $list482 = cons(makeSymbol("LABEL"), makeSymbol("LANGUAGE"));

    private static final SubLSymbol $sym483$_LEXICON = makeSymbol("?LEXICON");

    private static final SubLObject $$languageHasRootLexicon = reader_make_constant_shell(makeString("languageHasRootLexicon"));

    private static final SubLList $list485 = list(makeSymbol("?LEXICON"));

    private static final SubLList $list486 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));

    private static final SubLObject $const488$rdfs_label = reader_make_constant_shell(makeString("rdfs:label"));

    private static final SubLString $str489$Asserting_equivalent_class__S_of_ = makeString("Asserting equivalent class ~S of ~S");

    private static final SubLObject $const490$owl_equivalentClass = reader_make_constant_shell(makeString("owl:equivalentClass"));

    private static final SubLString $str491$Failed_to_assert_equivalent_class = makeString("Failed to assert equivalent class ~S of ~S");

    private static final SubLList $list492 = list(makeSymbol("PROPERTY"), makeSymbol("TYPE"), makeSymbol("VALUE"), makeSymbol("CLASS"));

    private static final SubLString $str493$Resolved_nonlocal_reference__S___ = makeString("Resolved nonlocal reference ~S~% to ~S");

    private static final SubLString $str494$Node_ID_as_restriction_target___S = makeString("Node ID as restriction target: ~S");

    private static final SubLString $str495$Can_t_handle__S_restrictions_with = makeString("Can't handle ~S restrictions with value ~S.");

    private static final SubLString $$$allValuesFrom = makeString("allValuesFrom");

    private static final SubLObject $$relationAllOnly = reader_make_constant_shell(makeString("relationAllOnly"));

    private static final SubLString $$$someValuesFrom = makeString("someValuesFrom");

    private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLString $$$hasValue = makeString("hasValue");

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLString $$$minCardinality = makeString("minCardinality");

    private static final SubLObject $$requiredArg1Pred = reader_make_constant_shell(makeString("requiredArg1Pred"));

    private static final SubLString $$$cardinality = makeString("cardinality");

    private static final SubLObject $$relationAllExistsCount = reader_make_constant_shell(makeString("relationAllExistsCount"));

    private static final SubLObject $$relationAllExistsMin = reader_make_constant_shell(makeString("relationAllExistsMin"));

    private static final SubLString $$$maxCardinality = makeString("maxCardinality");

    private static final SubLObject $$relationAllExistsMax = reader_make_constant_shell(makeString("relationAllExistsMax"));

    private static final SubLList $list509 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("GENL"), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("relationInstanceOnly")), makeKeyword("PRED"), makeSymbol("?X"), makeKeyword("TARGET"))));

    private static final SubLList $list510 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("GENL"), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("relationInstanceExists")), makeKeyword("PRED"), makeSymbol("?X"), makeKeyword("TARGET"))));

    public static final SubLList $list511 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("GENL"), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(makeKeyword("PRED"), makeSymbol("?X"), makeKeyword("TARGET"))));

    public static final SubLList $list512 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("GENL"), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), makeKeyword("PRED"), makeSymbol("?X"), makeKeyword("CLASS"), makeKeyword("TARGET"))));

    public static final SubLList $list513 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("GENL"), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("relationInstanceExistsMax")), makeKeyword("PRED"), makeSymbol("?X"), makeKeyword("CLASS"), makeKeyword("TARGET"))));

    public static final SubLList $list514 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("GENL"), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("relationInstanceExistsMin")), makeKeyword("PRED"), makeSymbol("?X"), makeKeyword("CLASS"), makeKeyword("TARGET"))));







    private static final SubLString $str518$Can_t_create_collection_from__S_r = makeString("Can't create collection from ~S restrictions with value ~S.");

    private static final SubLSymbol FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION = makeSymbol("FIND-OR-CREATE-OWL-CLASS-FROM-RESTRICTION");

    private static final SubLString $str520$Created__S_from__S = makeString("Created ~S from ~S");

    private static final SubLString $str521$__Asserting__S = makeString("~&Asserting ~S");

    private static final SubLSymbol NODE_ID_SPECIFICATION_P = makeSymbol("NODE-ID-SPECIFICATION-P");

    private static final SubLString $str523$Nested_calls_resolving__S = makeString("Nested calls resolving ~S");

    private static final SubLList $list524 = list(makeKeyword("COMPLEMENT-OF"), list(makeKeyword("TEST"), makeSymbol("OWL-EXTERNAL-VALUE-SPECIFICATION-P")));

    private static final SubLObject $$CollectionDifferenceFn = reader_make_constant_shell(makeString("CollectionDifferenceFn"));

    private static final SubLSymbol $sym526$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLString $str527$Can_t_find_or_create__S_term_from = makeString("Can't find or create ~S term from ~S");

    private static final SubLSymbol OWL_RESTRICTION_P = makeSymbol("OWL-RESTRICTION-P");

    private static final SubLString $str529$__Trying_to_resolve__S__ = makeString("~&Trying to resolve ~S~%");

    private static final SubLString $str530$__Result___S__ = makeString("~&Result: ~S~%");

    private static final SubLString $str531$Trying_to_create_term_from__S = makeString("Trying to create term from ~S");

    private static final SubLSymbol OWL_TERM_INFO = makeSymbol("OWL-TERM-INFO");

    private static final SubLList $list533 = list(makeSymbol("CYC-NAME"), makeSymbol("COMMENT"), makeSymbol("SUPERCLASSES"), makeSymbol("DISJOINT-CLASSES"), makeSymbol("PLIST"));

    private static final SubLList $list534 = list(makeKeyword("CYC-NAME"), makeKeyword("COMMENT"), makeKeyword("SUPERCLASSES"), makeKeyword("DISJOINT-CLASSES"), makeKeyword("PLIST"));

    private static final SubLList $list535 = list(makeSymbol("OTI-CYC-NAME"), makeSymbol("OTI-COMMENT"), makeSymbol("OTI-SUPERCLASSES"), makeSymbol("OTI-DISJOINT-CLASSES"), makeSymbol("OTI-PLIST"));

    private static final SubLList $list536 = list(makeSymbol("_CSETF-OTI-CYC-NAME"), makeSymbol("_CSETF-OTI-COMMENT"), makeSymbol("_CSETF-OTI-SUPERCLASSES"), makeSymbol("_CSETF-OTI-DISJOINT-CLASSES"), makeSymbol("_CSETF-OTI-PLIST"));

    private static final SubLSymbol PRINT_OWL_TERM_INFO = makeSymbol("PRINT-OWL-TERM-INFO");

    private static final SubLSymbol OWL_TERM_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OWL-TERM-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list539 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OWL-TERM-INFO-P"));

    private static final SubLSymbol OTI_CYC_NAME = makeSymbol("OTI-CYC-NAME");

    private static final SubLSymbol _CSETF_OTI_CYC_NAME = makeSymbol("_CSETF-OTI-CYC-NAME");

    private static final SubLSymbol OTI_COMMENT = makeSymbol("OTI-COMMENT");

    private static final SubLSymbol _CSETF_OTI_COMMENT = makeSymbol("_CSETF-OTI-COMMENT");

    private static final SubLSymbol OTI_SUPERCLASSES = makeSymbol("OTI-SUPERCLASSES");

    private static final SubLSymbol _CSETF_OTI_SUPERCLASSES = makeSymbol("_CSETF-OTI-SUPERCLASSES");

    private static final SubLSymbol OTI_DISJOINT_CLASSES = makeSymbol("OTI-DISJOINT-CLASSES");

    private static final SubLSymbol _CSETF_OTI_DISJOINT_CLASSES = makeSymbol("_CSETF-OTI-DISJOINT-CLASSES");

    private static final SubLSymbol OTI_PLIST = makeSymbol("OTI-PLIST");

    private static final SubLSymbol _CSETF_OTI_PLIST = makeSymbol("_CSETF-OTI-PLIST");





    private static final SubLSymbol MAKE_OWL_TERM_INFO = makeSymbol("MAKE-OWL-TERM-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OWL_TERM_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-TERM-INFO-METHOD");

    private static final SubLString $str554$_OWL_TERM_INFO__A_ = makeString("<OWL-TERM-INFO ~A>");

    private static final SubLList $list555 = list(makeKeyword("CLASS"), makeKeyword("INSTANCE"));

    private static final SubLString $str556$Don_t_know_about__S = makeString("Don't know about ~S");

    private static final SubLSymbol SXHASH_OWL_TERM_INFO_METHOD = makeSymbol("SXHASH-OWL-TERM-INFO-METHOD");



    private static final SubLString $str559$__Reading_Description___S__ = makeString("~&Reading Description: ~S~%");

    private static final SubLString $str560$Skipping_rdf_Description_element_ = makeString("Skipping rdf:Description element.");

    private static final SubLString $str561$__Reading_Restriction___S__ = makeString("~&Reading Restriction: ~S~%");

    private static final SubLString $str562$Skipping_owl_Restriction_element_ = makeString("Skipping owl:Restriction element.");

    private static final SubLString $str563$Reading_top_level_named_class__S = makeString("Reading top-level named class ~S");

    private static final SubLString $str564$Failed_or_declined_to_read_a_clas = makeString("Failed or declined to read a class.");

    private static final SubLString $str565$There_are_no_superclasses_for__S = makeString("There are no superclasses for ~S");

    private static final SubLString $str566$Finished__S____Superclasses___S__ = makeString("Finished ~S.~% Superclasses: ~S.~% Disjoint classes: ~S.~% Isas: ~S.");

    private static final SubLString $str567$Skipping_HTML_comment___S = makeString("Skipping HTML comment: ~S");

    private static final SubLString $str568$Reading_definition_of__S = makeString("Reading definition of ~S");

    private static final SubLString $str569$Skipping__S_to_close_tag = makeString("Skipping ~S to close tag");

    private static final SubLString $str570$Failed_or_declined_to_read_an_ins = makeString("Failed or declined to read an instance.");

    private static final SubLString $str571$Finished__S_ = makeString("Finished ~S.");

    private static final SubLString $str572$__Defining__S_as_an_instance_of__ = makeString("~&Defining ~S as an instance of ~S~%");

    private static final SubLString $$$AllDifferent = makeString("AllDifferent");

    private static final SubLString $str574$Skipping__S = makeString("Skipping ~S");

    private static final SubLString $str575$Skipping_locally_defined__S_to_cl = makeString("Skipping locally-defined ~S to close tag");

    private static final SubLString $$$subClassOf = makeString("subClassOf");

    private static final SubLString $str577$Read_superclass___S = makeString("Read superclass: ~S");

    private static final SubLString $$$disjointWith = makeString("disjointWith");

    private static final SubLString $$$equivalentClass = makeString("equivalentClass");

    private static final SubLString $$$owlEquivalentClass = makeString("owlEquivalentClass");

    private static final SubLString $$$complementOf = makeString("complementOf");

    private static final SubLString $$$intersectionOf = makeString("intersectionOf");

    private static final SubLString $str583$Read_one_intersection_element___S = makeString("Read one intersection element: ~S");

    private static final SubLString $str584$Intersection___S = makeString("Intersection: ~S");

    private static final SubLString $str585$Read_one_union_element___S = makeString("Read one union element: ~S");

    private static final SubLString $str586$Union___S = makeString("Union: ~S");

    private static final SubLString $str587$Read_enumerated_instances___S = makeString("Read enumerated instances: ~S");

    private static final SubLString $str588$Couldn_t_determine_value_from__S_ = makeString("Couldn't determine value from ~S~% ~S");

    private static final SubLString $str589$Apparently_anonymous_instance___S = makeString("Apparently anonymous instance: ~S");

    private static final SubLList $list590 = list(makeKeyword("NONLOCAL"), list(makeKeyword("TEST"), makeSymbol("URI-P")), list(makeKeyword("TEST"), makeSymbol("STRINGP")));

    private static final SubLString $str591$Finding_or_creating_nonlocal_term = makeString("Finding or creating nonlocal term...");

    private static final SubLString $str592$Result___S = makeString("Result: ~S");

    private static final SubLString $str593$Reading_OWL_class_or_restriction_ = makeString("Reading OWL class or restriction starting with~% ~S");



    private static final SubLString $str595$Can_t_read_class_starting_with__S = makeString("Can't read class starting with ~S");

    private static final SubLString $str596$_S___is_not_the_start_of_an_OWL_r = makeString("~S~% is not the start of an OWL restriction declaration.");





    private static final SubLString $str599$Read_restriction___S__S__S__S = makeString("Read restriction: ~S ~S ~S ~S");

    private static final SubLString $$$onProperty = makeString("onProperty");

    private static final SubLString $str601$Reading_restriction_property___ = makeString("Reading restriction property...");



    private static final SubLString $$$onClass = makeString("onClass");

    private static final SubLString $str604$Reading_restriction_class___ = makeString("Reading restriction class...");



    private static final SubLString $str606$Read_restriction_property__S = makeString("Read restriction property ~S");



    private static final SubLString $str608$Read_restriction_class__S = makeString("Read restriction class ~S");



    private static final SubLString $str610$Got_onProperty_close_tag_when_we_ = makeString("Got onProperty close tag when we weren't reading a property.");

    private static final SubLString $str611$Failed_to_read_property_ = makeString("Failed to read property.");

    private static final SubLString $str612$Got_onClass_close_tag_when_we_wer = makeString("Got onClass close tag when we weren't reading a class.");

    private static final SubLString $str613$Failed_to_read_class_ = makeString("Failed to read class.");

    private static final SubLString $str614$Read_datatype__S_from__S = makeString("Read datatype ~S from ~S");



    private static final SubLString $str616$Read_value__S_from__S = makeString("Read value ~S from ~S");



    private static final SubLString $str618$Failed_to_read_restriction_value_ = makeString("Failed to read restriction value.");

    private static final SubLString $str619$Read_restriction_value__S = makeString("Read restriction value ~S");

    private static final SubLString $str620$__Reading_OWL_property_starting_w = makeString("~&Reading OWL property starting with ~S~%");

    private static final SubLString $str621$__Done_with__S__ = makeString("~&Done with ~S~%");

    private static final SubLString $str622$__Reading_OWL_class_starting_with = makeString("~&Reading OWL class starting with ~S~%");

    private static final SubLList $list623 = list(new SubLObject[]{ makeString("double"), makeString("integer"), makeString("int"), makeString("unsignedInt"), makeString("nonNegativeInteger"), makeString("nonPositiveInteger"), makeString("positiveInteger"), makeString("negativeInteger"), makeString("decimal"), makeString("long"), makeString("unsignedLong"), makeString("short"), makeString("unsignedShort"), makeString("float") });

    private static final SubLString $str624$Can_t_parse__S_as_a__A = makeString("Can't parse ~S as a ~A");

    private static final SubLString $$$boolean = makeString("boolean");

    private static final SubLList $list626 = list(makeString("true"), makeString("1"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLList $list628 = list(makeString("false"), makeString("0"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLString $str630$Couldn_t_read_boolean_value_from_ = makeString("Couldn't read boolean value from ~S");

    private static final SubLString $$$date = makeString("date");

    private static final SubLString $str632$Couldn_t_parse_date_from__S = makeString("Couldn't parse date from ~S");

    private static final SubLObject $$DayFn = reader_make_constant_shell(makeString("DayFn"));

    private static final SubLSymbol NAT_FUNCTOR = makeSymbol("NAT-FUNCTOR");

    private static final SubLString $str635$Got_multiple_dates_from__S_____S = makeString("Got multiple dates from ~S:~% ~S");

    private static final SubLString $str636$Don_t_know_how_to_parse_value_fro = makeString("Don't know how to parse value from ~S with datatype ~S");

    private static final SubLSymbol XML_NAME = makeSymbol("XML-NAME");

    private static final SubLString $str638$xml_ = makeString("xml:");

    private static final SubLSymbol $xml_name_caching_state$ = makeSymbol("*XML-NAME-CACHING-STATE*");

    private static final SubLSymbol OWL_IMPORTER = makeSymbol("OWL-IMPORTER");

    private static final SubLSymbol OWL_IMPORTER_P = makeSymbol("OWL-IMPORTER-P");

    private static final SubLList $list642 = list(makeSymbol("ID"), makeSymbol("PROGRESS"), makeSymbol("ERROR-INFO"), makeSymbol("IMPORT-PARAMETERS"), makeSymbol("THREAD"));

    private static final SubLList $list643 = list(makeKeyword("ID"), makeKeyword("PROGRESS"), makeKeyword("ERROR-INFO"), makeKeyword("IMPORT-PARAMETERS"), makeKeyword("THREAD"));

    private static final SubLList $list644 = list(makeSymbol("OWL-IMP-ID"), makeSymbol("OWL-IMP-PROGRESS"), makeSymbol("OWL-IMP-ERROR-INFO"), makeSymbol("OWL-IMP-IMPORT-PARAMETERS"), makeSymbol("OWL-IMP-THREAD"));

    private static final SubLList $list645 = list(makeSymbol("_CSETF-OWL-IMP-ID"), makeSymbol("_CSETF-OWL-IMP-PROGRESS"), makeSymbol("_CSETF-OWL-IMP-ERROR-INFO"), makeSymbol("_CSETF-OWL-IMP-IMPORT-PARAMETERS"), makeSymbol("_CSETF-OWL-IMP-THREAD"));

    private static final SubLSymbol PRINT_OWL_IMPORTER = makeSymbol("PRINT-OWL-IMPORTER");

    private static final SubLSymbol OWL_IMPORTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OWL-IMPORTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list648 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OWL-IMPORTER-P"));

    private static final SubLSymbol OWL_IMP_ID = makeSymbol("OWL-IMP-ID");

    private static final SubLSymbol _CSETF_OWL_IMP_ID = makeSymbol("_CSETF-OWL-IMP-ID");

    private static final SubLSymbol OWL_IMP_PROGRESS = makeSymbol("OWL-IMP-PROGRESS");

    private static final SubLSymbol _CSETF_OWL_IMP_PROGRESS = makeSymbol("_CSETF-OWL-IMP-PROGRESS");

    private static final SubLSymbol OWL_IMP_ERROR_INFO = makeSymbol("OWL-IMP-ERROR-INFO");

    private static final SubLSymbol _CSETF_OWL_IMP_ERROR_INFO = makeSymbol("_CSETF-OWL-IMP-ERROR-INFO");

    private static final SubLSymbol OWL_IMP_IMPORT_PARAMETERS = makeSymbol("OWL-IMP-IMPORT-PARAMETERS");

    private static final SubLSymbol _CSETF_OWL_IMP_IMPORT_PARAMETERS = makeSymbol("_CSETF-OWL-IMP-IMPORT-PARAMETERS");

    private static final SubLSymbol OWL_IMP_THREAD = makeSymbol("OWL-IMP-THREAD");

    private static final SubLSymbol _CSETF_OWL_IMP_THREAD = makeSymbol("_CSETF-OWL-IMP-THREAD");











    private static final SubLSymbol MAKE_OWL_IMPORTER = makeSymbol("MAKE-OWL-IMPORTER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER-METHOD");

    private static final SubLString $str666$_OWL_IMPORTER__D_ = makeString("<OWL-IMPORTER ~D>");

    private static final SubLSymbol SXHASH_OWL_IMPORTER_METHOD = makeSymbol("SXHASH-OWL-IMPORTER-METHOD");

    private static final SubLSymbol IMPORT_OWL_ONTOLOGY_WITH_IMPORTER = makeSymbol("IMPORT-OWL-ONTOLOGY-WITH-IMPORTER");

    private static final SubLList $list669 = list(makeKeyword("URI"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("SOURCE"), makeKeyword("ONTOLOGY"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?"), makeKeyword("QUOTED-ISA"), makeKeyword("CYCLIST"));

    private static final SubLString $$$OWL_Importer = makeString("OWL Importer");

    private static final SubLSymbol OWL_IMPORTER_RUN = makeSymbol("OWL-IMPORTER-RUN");

    private static final SubLList $list672 = list(new SubLObject[]{ makeKeyword("IMPORTER"), makeKeyword("URI"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("URI-PREFIX"), makeKeyword("SOURCE"), makeKeyword("ONTOLOGY"), makeKeyword("QUOTED-ISA"), makeKeyword("CYCLIST"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?") });

    private static final SubLSymbol $owl_importer_id_index$ = makeSymbol("*OWL-IMPORTER-ID-INDEX*");



    private static final SubLString $str675$http___sweet_jpl_nasa_gov_ontolog = makeString("http://sweet.jpl.nasa.gov/ontology/");

    private static final SubLList $list676 = list(new SubLObject[]{ makeString("units"), makeString("time"), makeString("space"), makeString("sensor"), makeString("numerics"), makeString("phenomena"), makeString("process"), makeString("property"), makeString("substance"), makeString("material_thing"), makeString("human_activities"), makeString("data_center"), makeString("data"), makeString("biosphere"), makeString("earthrealm"), makeString("sunrealm") });

    private static final SubLString $str677$http___www_w3_org_TR_owl_guide_wi = makeString("http://www.w3.org/TR/owl-guide/wine.rdf");

    private static final SubLString $str678$WINE_ = makeString("WINE-");

    private static final SubLString $str679$_owl = makeString(".owl");

    private static final SubLString $str680$SWEET_ = makeString("SWEET-");

    private static final SubLString $str681$http___reliant_teknowledge_com_DA = makeString("http://reliant.teknowledge.com/DAML/SUMO.owl");

    private static final SubLString $str682$SUMO_ = makeString("SUMO-");

    private static final SubLString $str683$http___open_meta_com_SUMO_owl = makeString("http://open-meta.com/SUMO.owl");

    private static final SubLString $str684$http___kmf_patrick_afspc_ds_af_mi = makeString("http://kmf.patrick.afspc.ds.af.mil/KMF.owl");

    private static final SubLString $str685$KMF_ = makeString("KMF-");

    private static final SubLString $str686$_home_baxter_tmp_decision_support = makeString("/home/baxter/tmp/decision-support-kmf.owl");

    public static SubLObject owl_importer_v1_version_number() {
        final SubLObject start = position_if(DIGIT_CHAR_P, $owl_importer_v1_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return string_utilities.remove_last_char(string_utilities.substring($owl_importer_v1_version_number$.getGlobalValue(), start, UNPROVIDED), TWO_INTEGER);
    }

    public static SubLObject current_owl_importer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $owl_importer$.getDynamicValue(thread);
    }

    public static SubLObject guess_terms_for_owl_term(final SubLObject owl_term, final SubLObject names, final SubLObject mt) {
        assert NIL != term.hl_term_p(owl_term) : "term.hl_term_p(owl_term) " + "CommonSymbols.NIL != term.hl_term_p(owl_term) " + owl_term;
        assert NIL != string_utilities.list_of_string_p(names) : "string_utilities.list_of_string_p(names) " + "CommonSymbols.NIL != string_utilities.list_of_string_p(names) " + names;
        final SubLObject owl_term_isas = isa.min_isa(owl_term, mt, UNPROVIDED);
        final SubLObject owl_term_genls = genls.min_genls(owl_term, mt, UNPROVIDED);
        final SubLObject scored_terms = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject scored_non_wff_terms = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = guess_forts_from_owl_term_name_non_partitioned(name);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (NIL != indexed_term_p(v_term)) {
                    final SubLObject term_isas = isa.min_isa(v_term, mt, UNPROVIDED);
                    final SubLObject term_genls = genls.min_genls(v_term, mt, UNPROVIDED);
                    final SubLObject dict = ((NIL != disjoint_with.any_disjoint_with_anyP(owl_term_isas, term_isas, mt, UNPROVIDED, UNPROVIDED)) || (NIL != disjoint_with.any_disjoint_with_anyP(owl_term_genls, term_genls, mt, UNPROVIDED, UNPROVIDED))) ? scored_non_wff_terms : scored_terms;
                    final SubLObject score = at_utilities.isas_and_genls_similarity(owl_term_isas, term_isas, owl_term_genls, term_genls, mt);
                    final SubLObject max = $int$255;
                    final SubLObject scaled_int_score = truncate(divide(multiply(score, max), $int$100), UNPROVIDED);
                    dictionary.dictionary_enter(dict, v_term, scaled_int_score);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                v_term = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return values(dictionary_utilities.sort_dictionary_by_values(scored_terms, symbol_function($sym7$_)), dictionary_utilities.sort_dictionary_by_values(scored_non_wff_terms, symbol_function($sym7$_)));
    }

    public static SubLObject root_classes_of_owl_ontology(final SubLObject owl_ontology) {
        return root_classes_of_owl_ontology_via_index(owl_ontology);
    }

    public static SubLObject clear_owl_importer_caches() {
        clear_owl_found_terms();
        clear_owl_property_element_names();
        clear_owl_class_element_names();
        clear_xml_tokens_from_file();
        clear_note_found_term_resolution();
        return NIL;
    }

    public static SubLObject root_classes_of_owl_ontology_via_inference(final SubLObject owl_ontology) {
        final SubLObject query_result = query_utilities.new_cyc_query_from_indexicalized_kbq($$OWLOntologyQuery_GetRootClasses, owl_ontology, UNPROVIDED);
        SubLObject root_classes = NIL;
        SubLObject cdolist_list_var = query_result;
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = bindings.bindings_values(v_bindings);
            SubLObject value = NIL;
            value = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject item_var = value;
                if (NIL == member(item_var, root_classes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    root_classes = cons(item_var, root_classes);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                value = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        } 
        return root_classes;
    }

    public static SubLObject term_of_owl_ontologyP_via_index(final SubLObject v_term, final SubLObject owl_ontology) {
        return kb_mapping_utilities.pred_u_v_holds_in_any_mt($$synonymousExternalConcept, v_term, owl_ontology, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_of_some_owl_ontologyP_via_index_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject owl_ontology = NIL;
            final SubLObject pred_var = $$synonymousExternalConcept;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$3 = NIL;
                            final SubLObject token_var_$4 = NIL;
                            while (NIL == done_var_$3) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                if (NIL != valid_$5) {
                                    owl_ontology = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                    if (NIL != isa.isaP(owl_ontology, $const14$owl_Ontology, UNPROVIDED, UNPROVIDED)) {
                                        ans = T;
                                    }
                                }
                                done_var_$3 = makeBoolean(NIL == valid_$5);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject term_of_some_owl_ontologyP_via_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return term_of_some_owl_ontologyP_via_index_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(term_of_some_owl_ontologyP_via_index_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject all_terms_of_owl_ontology_via_index(final SubLObject owl_ontology) {
        final SubLObject direct_members = kb_mapping_utilities.pred_values_in_any_mt(owl_ontology, $$synonymousExternalConcept, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject imported_members = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(owl_ontology, $const15$owl_imports, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject imported_ontology = NIL;
        imported_ontology = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            imported_members = append(imported_members, kb_mapping_utilities.pred_values_in_any_mt(imported_ontology, $$synonymousExternalConcept, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            imported_ontology = cdolist_list_var.first();
        } 
        return append(imported_members, direct_members);
    }

    public static SubLObject owl_ontology_percent_of_classes_merged(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_classes = all_classes_of_owl_ontology_via_index(owl_ontology);
        SubLObject number_merged = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = all_classes;
                SubLObject v_class = NIL;
                v_class = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != owl_class_mergedP_via_index(v_class)) {
                        number_merged = add(number_merged, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_class = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return number_utilities.integer_percent(number_merged, length(all_classes), UNPROVIDED);
    }

    public static SubLObject owl_ontology_average_class_depth(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject depths = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = all_classes_of_owl_ontology_via_index(owl_ontology);
            SubLObject v_class = NIL;
            v_class = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject depth = longest_acyclic_genls_path_length(v_class, $$Thing, UNPROVIDED);
                if (NIL == subl_promotions.positive_integer_p(depth)) {
                    Errors.sublisp_break($str17$Can_t_find_path_from__S_to___Thin, new SubLObject[]{ v_class });
                }
                depths = cons(depth, depths);
                cdolist_list_var = cdolist_list_var.rest();
                v_class = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL != depths ? number_utilities.mean(depths) : NIL;
    }

    public static SubLObject owl_ontology_average_root_class_depth(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject depths = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = root_classes_of_owl_ontology(owl_ontology);
            SubLObject v_class = NIL;
            v_class = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject depth = longest_acyclic_genls_path_length(v_class, $$Thing, UNPROVIDED);
                if (NIL == subl_promotions.positive_integer_p(depth)) {
                    Errors.sublisp_break($str17$Can_t_find_path_from__S_to___Thin, new SubLObject[]{ v_class });
                }
                depths = cons(depth, depths);
                cdolist_list_var = cdolist_list_var.rest();
                v_class = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL != depths ? number_utilities.mean(depths) : NIL;
    }

    public static SubLObject all_classes_of_owl_ontology_via_index(final SubLObject owl_ontology) {
        return list_utilities.remove_if_not(COLLECTION_P, all_terms_of_owl_ontology_via_index(owl_ontology), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_class_mergedP_via_index(final SubLObject v_class) {
        return makeBoolean((NIL != owl_class_merged_upwardP_via_index(v_class)) || (NIL != owl_class_merged_downwardP_via_index(v_class)));
    }

    public static SubLObject owl_class_merged_upwardP_via_index(final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mergedP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == mergedP) {
                SubLObject node_var = v_class;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str29$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_class, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == mergedP)) {
                                            final SubLObject genl = node_var;
                                            if ((!genl.eql($$Thing)) && (NIL == cycl_utilities.expression_find_if($sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, genl, T, UNPROVIDED))) {
                                                mergedP = T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$12;
                                            SubLObject _prev_bind_1_$13;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$13;
                                            SubLObject iteration_state_$19;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$14;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$21;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$15;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == mergedP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == mergedP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == mergedP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19)); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == mergedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == mergedP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == mergedP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$21 = NIL, rest_$21 = new_list; (NIL == mergedP) && (NIL != rest_$21); rest_$21 = rest_$21.rest()) {
                                                                generating_fn = rest_$21.first();
                                                                _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == mergedP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == mergedP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == mergedP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$15, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str33$Node__a_does_not_pass_sbhl_type_t, v_class, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mergedP;
    }

    public static SubLObject owl_class_merged_downwardP_via_index(final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mergedP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == mergedP) {
                SubLObject node_var = v_class;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str29$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str24$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_class, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$28 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == mergedP)) {
                                            final SubLObject genl = node_var;
                                            if ((!genl.eql($$Thing)) && (NIL == cycl_utilities.expression_find_if($sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, genl, T, UNPROVIDED))) {
                                                mergedP = T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$28;
                                            SubLObject _prev_bind_1_$29;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$29;
                                            SubLObject iteration_state_$35;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$30;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$37;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$31;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == mergedP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$28 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == mergedP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == mergedP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35)); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == mergedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == mergedP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == mergedP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$30, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$29, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$37 = NIL, rest_$37 = new_list; (NIL == mergedP) && (NIL != rest_$37); rest_$37 = rest_$37.rest()) {
                                                                generating_fn = rest_$37.first();
                                                                _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == mergedP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == mergedP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == mergedP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$31, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$29, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$28, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$27, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str33$Node__a_does_not_pass_sbhl_type_t, v_class, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$26, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$26, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$25, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mergedP;
    }

    public static SubLObject owl_merge_mt() {
        return $owl_merge_mt$.getGlobalValue();
    }

    public static SubLObject owl_merge_assert(final SubLObject sentence) {
        return ke.ke_assert_now(sentence, owl_merge_mt(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject merge_owl_class_with_collection(final SubLObject owl_class, final SubLObject collection) {
        return owl_merge_assert(list($$coExtensional, owl_class, collection));
    }

    public static SubLObject merge_owl_term_with_cyc_term(final SubLObject owl_term, final SubLObject cyc_term) {
        if ((NIL != fort_types_interface.isa_collectionP(owl_term, UNPROVIDED)) && (NIL != fort_types_interface.isa_collectionP(cyc_term, UNPROVIDED))) {
            return merge_owl_class_with_collection(owl_term, cyc_term);
        }
        return owl_merge_assert(list($$equals, owl_term, cyc_term));
    }

    public static SubLObject link_owl_class_down_to_collection(final SubLObject owl_class, final SubLObject collection) {
        return owl_merge_assert(list($$genls, collection, owl_class));
    }

    public static SubLObject link_owl_class_up_to_collection(final SubLObject owl_class, final SubLObject collection) {
        return owl_merge_assert(list($$genls, owl_class, collection));
    }

    public static SubLObject next_owl_term_to_merge_for_ontology(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == v_term) {
                        SubLObject csome_list_var = Sort.sort(root_classes_of_owl_ontology(owl_ontology), $sym7$_, MEMOIZED_COUNT_ALL_SPECS);
                        SubLObject v_class = NIL;
                        v_class = csome_list_var.first();
                        while ((NIL == v_term) && (NIL != csome_list_var)) {
                            if (NIL == owl_class_merged_upwardP_via_index(v_class)) {
                                v_term = v_class;
                            }
                            csome_list_var = csome_list_var.rest();
                            v_class = csome_list_var.first();
                        } 
                    }
                } finally {
                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$40, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_term;
    }

    public static SubLObject memoized_count_all_specs_internal(final SubLObject col) {
        return genls.count_all_specs(col, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject memoized_count_all_specs(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_count_all_specs_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_COUNT_ALL_SPECS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_COUNT_ALL_SPECS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_COUNT_ALL_SPECS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_count_all_specs_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject longest_acyclic_genls_path_length(final SubLObject lower, final SubLObject upper, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLObject longest_path = longest_acyclic_genls_path(lower, upper, mt_info);
        return NIL != longest_path ? length(longest_path) : NIL;
    }

    public static SubLObject longest_acyclic_genls_path(final SubLObject lower, final SubLObject upper, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.isa_collectionP(lower, UNPROVIDED) : "fort_types_interface.isa_collectionP(lower, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(lower, CommonSymbols.UNPROVIDED) " + lower;
        assert NIL != fort_types_interface.isa_collectionP(upper, UNPROVIDED) : "fort_types_interface.isa_collectionP(upper, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(upper, CommonSymbols.UNPROVIDED) " + upper;
        SubLObject path = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (upper.eql($$Thing) || (NIL != genls.genlP(lower, upper, UNPROVIDED, UNPROVIDED))) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            path = longest_acyclic_genls_path_internal(lower, upper, NIL);
                        } finally {
                            final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$42, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    if (upper.eql($$Thing) || (NIL != genls.genlP(lower, upper, UNPROVIDED, UNPROVIDED))) {
                        final SubLObject local_state;
                        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                            try {
                                path = longest_acyclic_genls_path_internal(lower, upper, NIL);
                            } finally {
                                final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        if (upper.eql($$Thing) || (NIL != genls.genlP(lower, upper, UNPROVIDED, UNPROVIDED))) {
                            final SubLObject local_state;
                            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject _prev_bind_0_$46 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    path = longest_acyclic_genls_path_internal(lower, upper, NIL);
                                } finally {
                                    final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        if (upper.eql($$Thing) || (NIL != genls.genlP(lower, upper, UNPROVIDED, UNPROVIDED))) {
                            final SubLObject local_state;
                            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject _prev_bind_0_$48 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    path = longest_acyclic_genls_path_internal(lower, upper, NIL);
                                } finally {
                                    final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return path;
    }

    public static SubLObject longest_acyclic_genls_path_internal_internal(final SubLObject lower, final SubLObject upper, final SubLObject path_down_from_lower) {
        SubLObject longest_path = NIL;
        if (upper.eql($$Thing) || (NIL != genls.genlP(lower, upper, UNPROVIDED, UNPROVIDED))) {
            SubLObject min_genls = owl_min_genls_memoized(lower);
            if (NIL != list_utilities.empty_list_p(set_difference(min_genls, path_down_from_lower, symbol_function(EQUAL), UNPROVIDED))) {
                min_genls = genls.min_cols(set_difference(genls.all_genls(lower, UNPROVIDED, UNPROVIDED), cons(lower, min_genls), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            SubLObject cdolist_list_var = min_genls;
            SubLObject genl = NIL;
            genl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == find(genl, path_down_from_lower, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (genl.equal(upper)) {
                        if (NIL == longest_path) {
                            longest_path = list(lower, upper);
                        }
                    } else {
                        final SubLObject subpath = longest_acyclic_genls_path_internal(genl, upper, cons(lower, path_down_from_lower));
                        if ((NIL != subpath) && (NIL == list_utilities.greater_length_p(longest_path, subpath))) {
                            longest_path = cons(lower, subpath);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
            } 
        }
        return longest_path;
    }

    public static SubLObject longest_acyclic_genls_path_internal(final SubLObject lower, final SubLObject upper, final SubLObject path_down_from_lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return longest_acyclic_genls_path_internal_internal(lower, upper, path_down_from_lower);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LONGEST_ACYCLIC_GENLS_PATH_INTERNAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LONGEST_ACYCLIC_GENLS_PATH_INTERNAL, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LONGEST_ACYCLIC_GENLS_PATH_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lower, upper, path_down_from_lower);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lower.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (upper.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && path_down_from_lower.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(longest_acyclic_genls_path_internal_internal(lower, upper, path_down_from_lower)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lower, upper, path_down_from_lower));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject owl_min_genls_memoized_internal(final SubLObject col) {
        return genls.min_genls(col, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_min_genls_memoized(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_min_genls_memoized_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_MIN_GENLS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_MIN_GENLS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_MIN_GENLS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_min_genls_memoized_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject genls_tree_with_root_via_index(final SubLObject root, SubLObject direction, SubLObject max_depth) {
        if (direction == UNPROVIDED) {
            direction = $UP;
        }
        if (max_depth == UNPROVIDED) {
            max_depth = TWO_INTEGER;
        }
        return genls_tree_with_root_via_index_internal(root, direction, max_depth, NIL);
    }

    public static SubLObject genls_tree_with_root_via_index_internal(final SubLObject root, final SubLObject direction, final SubLObject max_depth, final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subtrees = NIL;
        if ((NIL == max_depth) || max_depth.isPositive()) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = (direction == $UP) ? genls.min_genls(root, UNPROVIDED, UNPROVIDED) : genls.max_specs(root, UNPROVIDED, UNPROVIDED);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == find(child, path, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        subtrees = cons(genls_tree_with_root_via_index_internal(child, direction, NIL != max_depth ? number_utilities.f_1_(max_depth) : NIL, cons(root, path)), subtrees);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return cons(root, subtrees);
    }

    public static SubLObject root_classes_of_owl_ontology_via_index(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_classes = all_classes_of_owl_ontology_via_index(owl_ontology);
        SubLObject roots = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            roots = genls.max_cols(all_classes, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return roots;
    }

    public static SubLObject guess_forts_from_owl_term_name(final SubLObject owl_term_name) {
        final SubLObject terms = guess_forts_from_owl_term_name_non_partitioned(owl_term_name);
        return partition_cycl_terms_for_owl_term_name(terms, owl_term_name);
    }

    public static SubLObject guess_forts_from_owl_term_name_non_partitioned(final SubLObject owl_term_name) {
        SubLObject terms = NIL;
        final SubLObject constant = constants_high.find_constant(owl_term_name);
        if (NIL != constant) {
            terms = cons(constant, terms);
        }
        SubLObject cdolist_list_var = lexicon_accessors.denots_of_string(owl_term_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = denot;
            if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                terms = cons(item_var, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        final SubLObject spaced = string_utilities.space_dont_uncapitalize(owl_term_name);
        if (!spaced.equal(owl_term_name)) {
            SubLObject cdolist_list_var2 = string_utilities.sub_phrases(spaced);
            SubLObject string = NIL;
            string = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$50 = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject denot2 = NIL;
                denot2 = cdolist_list_var_$50.first();
                while (NIL != cdolist_list_var_$50) {
                    final SubLObject item_var2 = denot2;
                    if (NIL == member(item_var2, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        terms = cons(item_var2, terms);
                    }
                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                    denot2 = cdolist_list_var_$50.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                string = cdolist_list_var2.first();
            } 
        }
        if ((NIL != lower_case_p(string_utilities.first_char(owl_term_name))) && (NIL == morphology.plural_nounP(owl_term_name))) {
            final SubLObject plural = lexification_utilities.pluralize_word(owl_term_name, UNPROVIDED);
            if (!plural.equal(owl_term_name)) {
                SubLObject cdolist_list_var2 = guess_forts_from_owl_term_name_non_partitioned(plural);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    final SubLObject item_var3 = v_term;
                    if (NIL == member(item_var3, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        terms = cons(item_var3, terms);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    v_term = cdolist_list_var2.first();
                } 
            }
        }
        if (NIL != string_utilities.ends_with(owl_term_name, $$$Of, UNPROVIDED)) {
            final SubLObject non_of = string_utilities.substring(owl_term_name, ZERO_INTEGER, subtract(length(owl_term_name), TWO_INTEGER));
            SubLObject cdolist_list_var2 = guess_forts_from_owl_term_name_non_partitioned(non_of);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject item_var3 = v_term;
                if (NIL == member(item_var3, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    terms = cons(item_var3, terms);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term = cdolist_list_var2.first();
            } 
        }
        return terms;
    }

    public static SubLObject partition_cycl_terms_for_owl_term_name(final SubLObject terms, final SubLObject owl_term_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = (NIL != upper_case_p(string_utilities.first_char(owl_term_name))) ? $COLLECTION : $PREDICATE;
        SubLObject right_type = NIL;
        SubLObject wrong_type = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pcase_var = type;
                if (pcase_var.eql($COLLECTION)) {
                    if (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED)) {
                        right_type = cons(v_term, right_type);
                    } else {
                        wrong_type = cons(v_term, wrong_type);
                    }
                } else
                    if (pcase_var.eql($PREDICATE)) {
                        if (NIL != fort_types_interface.isa_predicateP(v_term, UNPROVIDED)) {
                            right_type = cons(v_term, right_type);
                        } else {
                            wrong_type = cons(v_term, wrong_type);
                        }
                    }

            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return list(right_type, wrong_type);
    }

    public static SubLObject owl_term_names() {
        return remove_duplicates(cconcatenate($owl_term_names_preceded_by_parse_type$.getGlobalValue(), new SubLObject[]{ $owl_term_names_preceded_by_resource$.getGlobalValue(), $owl_term_names_preceded_by_about$.getGlobalValue(), $owl_term_names_preceded_by_id$.getGlobalValue() }), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_owl_definition_accumulator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_list(length($owl_definition_types$.getDynamicValue(thread)), NIL);
    }

    public static SubLObject accumulate_owl_definition(final SubLObject item, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($owl_definition_accumulator$.getDynamicValue(thread))) {
            final SubLObject existing = accumulated_owl_definitions_of_type(type);
            final SubLObject name = owl_definition_name(item, type);
            final SubLObject existing_with_name = find_owl_definition_of_type(name, type, existing);
            SubLObject v_new = existing;
            if (NIL != existing_with_name) {
                merge_owl_definitions(item, existing_with_name);
            } else {
                v_new = list_utilities.nadd_to_end(item, existing);
            }
            set_accumulated_owl_definitions_of_type(type, v_new);
        }
        return item;
    }

    public static SubLObject merge_owl_definitions(final SubLObject from, final SubLObject onto) {
        if (NIL != owl_term_info_p(onto)) {
            merge_owl_term_definitions(from, onto);
        } else {
            merge_owl_pred_definitions(from, onto);
        }
        return onto;
    }

    public static SubLObject find_accumulated_owl_definition(final SubLObject cyc_name, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != misc_utilities.initialized_p($owl_definition_accumulator$.getDynamicValue(thread)) : "misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) " + "CommonSymbols.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) " + $owl_definition_accumulator$.getDynamicValue(thread);
        final SubLObject index = owl_accumulator_index_for_type(type);
        final SubLObject definitions = nth(index, $owl_definition_accumulator$.getDynamicValue(thread));
        return find_owl_definition_of_type(cyc_name, type, definitions);
    }

    public static SubLObject find_owl_definition_of_type(final SubLObject cyc_name, final SubLObject type, final SubLObject definitions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind(type, thread);
            return find(cyc_name, definitions, symbol_function(EQUAL), OWL_DEFINITION_NAME, UNPROVIDED, UNPROVIDED);
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject owl_definition_name(final SubLObject definition, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $owl_definition_type$.getDynamicValue();
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($PROPERTY)) {
            final SubLObject name = owl_pred_info_cyc_name(definition);
            return NIL != name ? name : owl_pred_info_external_name(definition, UNPROVIDED);
        }
        final SubLObject name = owl_term_info_cyc_name(definition);
        return NIL != name ? name : owl_term_info_external_name(definition, UNPROVIDED);
    }

    public static SubLObject accumulated_owl_definitions_of_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != misc_utilities.initialized_p($owl_definition_accumulator$.getDynamicValue(thread)) : "misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) " + "CommonSymbols.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) " + $owl_definition_accumulator$.getDynamicValue(thread);
        final SubLObject index = owl_accumulator_index_for_type(type);
        return nth(index, $owl_definition_accumulator$.getDynamicValue(thread));
    }

    public static SubLObject set_accumulated_owl_definitions_of_type(final SubLObject type, final SubLObject definitions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != misc_utilities.initialized_p($owl_definition_accumulator$.getDynamicValue(thread)) : "misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) " + "CommonSymbols.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) " + $owl_definition_accumulator$.getDynamicValue(thread);
        final SubLObject index = owl_accumulator_index_for_type(type);
        return set_nth(index, $owl_definition_accumulator$.getDynamicValue(thread), definitions);
    }

    public static SubLObject owl_accumulator_index_for_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = position(type, $owl_definition_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(index))) {
            Errors.error($str58$_S_is_not_a_valid_definition_type, type, $owl_definition_types$.getDynamicValue(thread));
        }
        return index;
    }

    public static SubLObject import_owl_ontology(final SubLObject uri, final SubLObject constant_prefix, SubLObject source, SubLObject ontology, SubLObject quoted_isa, SubLObject cyclist, SubLObject prefix_external_namesP, SubLObject abbreviate_prefixesP) {
        if (source == UNPROVIDED) {
            source = uri;
        }
        if (ontology == UNPROVIDED) {
            ontology = NIL;
        }
        if (quoted_isa == UNPROVIDED) {
            quoted_isa = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (prefix_external_namesP == UNPROVIDED) {
            prefix_external_namesP = NIL;
        }
        if (abbreviate_prefixesP == UNPROVIDED) {
            abbreviate_prefixesP = NIL;
        }
        return import_owl_ontology_from_info(list_utilities.make_plist($list60, list(uri, constant_prefix, source, ontology, quoted_isa, cyclist, prefix_external_namesP, abbreviate_prefixesP)));
    }

    public static SubLObject import_owl_ontology_from_info(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uri = getf(import_info, $URI, UNPROVIDED);
        final SubLObject uri_prefix = getf(import_info, $URI_PREFIX, UNPROVIDED);
        final SubLObject constant_prefix = getf(import_info, $CONSTANT_PREFIX, UNPROVIDED);
        final SubLObject constant_suffix = getf(import_info, $CONSTANT_SUFFIX, UNPROVIDED);
        SubLObject source = getf(import_info, $SOURCE, UNPROVIDED);
        SubLObject ontology = getf(import_info, $ONTOLOGY, UNPROVIDED);
        SubLObject quoted_isa = getf(import_info, $QUOTED_ISA, UNPROVIDED);
        final SubLObject cyclist = getf(import_info, $CYCLIST, UNPROVIDED);
        final SubLObject prefix_external_namesP = getf(import_info, $kw69$PREFIX_EXTERNAL_NAMES_, UNPROVIDED);
        final SubLObject abbreviate_prefixesP = getf(import_info, $kw70$ABBREVIATE_PREFIXES_, UNPROVIDED);
        uri = string_utilities.strip_final_if_char(uri, CHAR_hash);
        uri = string_utilities.strip_final_if_char(uri, CHAR_slash);
        if (NIL == ontology) {
            ontology = find_or_create_owl_ontology_for_uri(uri, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == quoted_isa) {
            quoted_isa = find_or_create_term_type_for_ontology(ontology, UNPROVIDED);
        }
        if (NIL == string_utilities.non_empty_string_p(source)) {
            source = uri;
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == web_utilities.uri_p(source, UNPROVIDED))) && (NIL == file_utilities.file_existsP(source))) {
            Errors.error($str71$Can_only_import_OWL_ontologies_fr);
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            ke.ensure_cyclist_ok();
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        if (((NIL != uri) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == web_utilities.uri_p(uri, UNPROVIDED))) {
            throw new AssertionError(uri);
        }
        final SubLObject source_type = (NIL != file_utilities.file_existsP(source)) ? $FILE : $URL;
        final SubLObject source_file = (source_type.eql($FILE)) ? source : rdf_utilities.download_rdf_url(source, UNPROVIDED);
        SubLObject import_term = NIL;
        final SubLObject import_parameters = new_owl_import_parameters(ontology, constant_prefix, constant_suffix, quoted_isa, cyclist, uri, uri_prefix, prefix_external_namesP, abbreviate_prefixesP);
        final SubLObject _prev_bind_2 = $owl_import_parameters$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $owl_oe_queue$.currentBinding(thread);
        try {
            $owl_import_parameters$.bind(import_parameters, thread);
            $owl_oe_queue$.bind(new_owl_oe_queue(), thread);
            import_term = reify_term_for_new_import(import_parameters);
            note_owl_import_parameters(import_parameters);
            try {
                import_owl_ontology_internal(source, source_file, uri, import_parameters);
            } finally {
                final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    ensure_owl_oe_daemon_running();
                    note_owl_oe_queue_done(UNPROVIDED);
                    wait_for_owl_oe_queue_to_empty(UNPROVIDED);
                    note_import_end_time(import_term, import_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                }
            }
        } finally {
            $owl_oe_queue$.rebind(_prev_bind_3, thread);
            $owl_import_parameters$.rebind(_prev_bind_2, thread);
        }
        if (source_type.eql($URL)) {
            Filesys.delete_file(source_file);
        }
        note_owl_import_done();
        return import_term;
    }

    public static SubLObject clear_xml_tokens_from_file() {
        final SubLObject cs = $xml_tokens_from_file_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_xml_tokens_from_file(final SubLObject source_file) {
        return memoization_state.caching_state_remove_function_results_with_args($xml_tokens_from_file_caching_state$.getGlobalValue(), list(source_file), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xml_tokens_from_file_internal(final SubLObject source_file) {
        SubLObject tokens = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(source_file, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str77$Unable_to_open__S, source_file);
            }
            final SubLObject in_stream = stream;
            tokens = delete_if($sym78$WHITESPACE_STRING_, xml_parsing_utilities.xml_tokenize(in_stream, T, T, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        return tokens;
    }

    public static SubLObject xml_tokens_from_file(final SubLObject source_file) {
        SubLObject caching_state = $xml_tokens_from_file_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(XML_TOKENS_FROM_FILE, $xml_tokens_from_file_caching_state$, $int$48, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, source_file, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(xml_tokens_from_file_internal(source_file)));
            memoization_state.caching_state_put(caching_state, source_file, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject import_owl_ontology_internal(SubLObject source, final SubLObject source_file, final SubLObject uri, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str81$__Importing__S_from__S_____, uri, source);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$52 = $owl_definition_accumulator$.currentBinding(thread);
                try {
                    $owl_definition_accumulator$.bind(new_owl_definition_accumulator(), thread);
                    final SubLObject tokens = xml_tokens_from_file(source_file);
                    note_owl_file_encoding(tokens.first(), import_parameters);
                    final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
                    import_owl_ontology_info(ontology, tokens, import_parameters);
                    final SubLObject imported_ontology_uris = verify_imports_for_ontology_tokens(ontology, tokens, import_parameters);
                    validate_and_note_owl_namespaces(tokens, cons(uri, imported_ontology_uris), import_parameters);
                    import_named_bnodes(tokens, import_parameters);
                    read_class_info_from_owl_tokens(tokens, import_parameters);
                    SubLObject info = accumulated_owl_definitions_of_type($CLASS);
                    SubLObject message = format(NIL, $str83$Processing__D_class_definition__P, length(info));
                    create_terms_from_owl_data(info, import_parameters, message);
                    read_pred_info_from_owl_tokens(tokens, import_parameters);
                    create_preds_from_owl_data(accumulated_owl_definitions_of_type($PROPERTY), import_parameters);
                    read_instance_info_from_owl_tokens(tokens, import_parameters);
                    info = accumulated_owl_definitions_of_type($INSTANCE);
                    message = format(NIL, $str85$Processing__D_instance_definition, length(info));
                    create_terms_from_owl_data(info, import_parameters, message);
                } finally {
                    $owl_definition_accumulator$.rebind(_prev_bind_0_$52, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject note_owl_file_encoding(final SubLObject token, final SubLObject import_parameters) {
        SubLObject encoding = $default_owl_file_encoding$.getGlobalValue();
        if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, $str87$_xml)) {
            encoding = xml_parsing_utilities.xml_tag_attribute_value(token, $$$encoding, encoding);
        }
        owl_import_parameters_note_encoding(encoding, import_parameters);
        return encoding;
    }

    public static SubLObject reify_term_for_new_import(final SubLObject import_parameters) {
        final SubLObject v_term = owl_create(cconcatenate($str89$OWLImport_, owl_ontology_name(import_parameters)), $list90, $$UniversalVocabularyMt, $str92$, $str92$, $UPCASE, import_parameters);
        note_import_start_time(v_term, import_parameters);
        note_import_ontology(v_term, import_parameters);
        note_import_cyclist(v_term, import_parameters);
        owl_import_parameters_note_import_term(v_term, import_parameters);
        return v_term;
    }

    public static SubLObject owl_ontology_name(final SubLObject import_parameters) {
        final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        return NIL != constant_p(ontology) ? constants_high.constant_name(ontology) : owl_import_parameters_base_uri(import_parameters);
    }

    public static SubLObject note_import_start_time(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject now = date_utilities.indexical_now();
        return owl_assert(list($$startingDate, import_term, now), $$UniversalVocabularyMt, import_parameters);
    }

    public static SubLObject note_import_ontology(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        return NIL != ontology ? owl_assert(list($$infoTransferred, import_term, ontology), $$UniversalVocabularyMt, import_parameters) : NIL;
    }

    public static SubLObject note_import_cyclist(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject cyclist = owl_import_parameters_cyclist(import_parameters);
        return NIL != cyclist ? owl_assert(list($$doneBy, import_term, cyclist), $$UniversalVocabularyMt, import_parameters) : NIL;
    }

    public static SubLObject note_import_end_time(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject now = date_utilities.indexical_now();
        return owl_assert(list($$endingDate, import_term, now), $$UniversalVocabularyMt, import_parameters);
    }

    public static SubLObject import_owl_ontology_info(final SubLObject ontology, SubLObject tokens, final SubLObject import_parameters) {
        SubLObject doneP = NIL;
        while ((NIL == doneP) && (NIL == list_utilities.empty_list_p(tokens))) {
            final SubLObject token = tokens.first();
            if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$Ontology))) {
                if (NIL == xml_parsing_utilities.xml_empty_tagP(token)) {
                    import_owl_ontology_info_internal(ontology, tokens, import_parameters);
                }
                doneP = T;
            } else
                if (NIL == xml_parsing_utilities.regular_xml_tagP(token)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                } else
                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name($$$RDF))) {
                        note_owl_ontology_base_uri(token, import_parameters);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    } else {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    }


        } 
        return ontology;
    }

    public static SubLObject note_owl_ontology_base_uri(final SubLObject token, final SubLObject import_parameters) {
        final SubLObject base_uri = find_owl_ontology_base_uri(token);
        if (NIL != base_uri) {
            owl_import_parameters_note_base_uri(base_uri, import_parameters);
        }
        return base_uri;
    }

    public static SubLObject find_owl_ontology_base_uri(final SubLObject token) {
        SubLObject base_uri = NIL;
        SubLObject current;
        final SubLObject datum = current = xml_parsing_utilities.parse_xml_token(token);
        SubLObject element_name = NIL;
        SubLObject attributes = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        element_name = current.first();
        current = attributes = current.rest();
        SubLObject rest;
        SubLObject cons;
        SubLObject current_$55;
        SubLObject datum_$54;
        SubLObject attribute_name;
        SubLObject value;
        for (rest = NIL, rest = attributes; (NIL == base_uri) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum_$54 = current_$55 = cons;
            attribute_name = NIL;
            value = NIL;
            destructuring_bind_must_consp(current_$55, datum_$54, $list101);
            attribute_name = current_$55.first();
            current_$55 = value = current_$55.rest();
            if (attribute_name.equal(xml_name($$$base))) {
                if (NIL != web_utilities.uri_p(value, UNPROVIDED)) {
                    base_uri = value;
                } else {
                    Errors.warn($str103$Can_t_recognize_alleged_base_URI_, value);
                }
            }
        }
        return base_uri;
    }

    public static SubLObject clear_owl_import_parameters_ontology_context() {
        final SubLObject cs = $owl_import_parameters_ontology_context_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_owl_import_parameters_ontology_context(final SubLObject import_parameters) {
        return memoization_state.caching_state_remove_function_results_with_args($owl_import_parameters_ontology_context_caching_state$.getGlobalValue(), list(import_parameters), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_import_parameters_ontology_context_internal(final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_context = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(owl_import_parameters_cyclist(import_parameters));
            v_context = get_owl_ontology_context(owl_import_parameters_ontology(import_parameters));
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_context;
    }

    public static SubLObject owl_import_parameters_ontology_context(final SubLObject import_parameters) {
        SubLObject caching_state = $owl_import_parameters_ontology_context_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT, $owl_import_parameters_ontology_context_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, import_parameters, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl_import_parameters_ontology_context_internal(import_parameters)));
            memoization_state.caching_state_put(caching_state, import_parameters, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_owl_ontology_context(final SubLObject ontology) {
        return czer_main.cyc_find_or_create_nart(list($$ContextOfPCWFn, ontology), UNPROVIDED);
    }

    public static SubLObject import_owl_ontology_info_internal(final SubLObject ontology, final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == xml_parsing_utilities.xml_token_element_nameP(tokens.first(), owl_utilities.owl_name($$$Ontology)))) {
            Errors.error($str107$Expected_ontology_token__got__S, tokens.first());
        }
        SubLObject remaining_tokens = tokens.rest();
        final SubLObject ontology_context = owl_import_parameters_ontology_context(import_parameters);
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            if (NIL != list_utilities.empty_list_p(remaining_tokens)) {
                Errors.error($str108$Couldn_t_find_closing_Ontology_ta, list_utilities.first_n($int$32, tokens));
            }
            SubLObject token;
            for (token = remaining_tokens.first(); NIL == xml_parsing_utilities.regular_xml_tagP(token); token = remaining_tokens.first()) {
                remaining_tokens = xml_parsing_utilities.advance_xml_tokens(remaining_tokens, UNPROVIDED);
            }
            if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdfs_name($$$comment))) {
                final SubLObject comment = second(remaining_tokens);
                if (NIL != xml_parsing_utilities.regular_xml_tagP(comment)) {
                    Errors.warn($str111$Expecting_comment__got__S, comment);
                } else {
                    owl_assert(list($const112$rdfs_comment, ontology, comment), ontology_context, import_parameters);
                }
            } else
                if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdfs_name($$$label))) {
                    final SubLObject lang_value = xml_parsing_utilities.xml_tag_attribute_value(token, xml_name($$$lang), NIL);
                    final SubLObject language = (NIL != lang_value) ? decode_html_language_abbreviation(lang_value) : $$EnglishLanguage;
                    final SubLObject label = second(remaining_tokens);
                    if (NIL != xml_parsing_utilities.regular_xml_tagP(label)) {
                        Errors.warn($str116$Expecting_label__got__S, label);
                    } else {
                        assert_owl_label(ontology, cons(label, language), import_parameters);
                    }
                } else
                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$priorVersion))) {
                        final SubLObject ontology_token = second(remaining_tokens);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == xml_parsing_utilities.xml_token_element_nameP(ontology_token, owl_utilities.owl_name($$$Ontology)))) {
                            Errors.error($str107$Expected_ontology_token__got__S, ontology_token);
                        }
                        final SubLObject about_value = xml_parsing_utilities.xml_tag_attribute_value(ontology_token, rdf_utilities.rdf_name($$$about), UNPROVIDED);
                        final SubLObject uri = (NIL != web_utilities.uri_p(about_value, UNPROVIDED)) ? about_value : process_owl_attribute_value(about_value);
                        final SubLObject prior_ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, UNPROVIDED);
                        owl_assert(list($const119$owl_priorVersion, ontology, prior_ontology), $$OWLMappingMt, import_parameters);
                    } else
                        if (NIL == xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$imports))) {
                            if (NIL == xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$versionInfo))) {
                                if (NIL != xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name($$$Ontology), token)) {
                                    doneP = T;
                                } else {
                                    Errors.warn($str122$Don_t_know_how_to_handle_ontology, token);
                                }
                            }
                        }



            remaining_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(remaining_tokens);
        } 
        return ontology;
    }

    public static SubLObject owl_pred_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_pred_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject owl_pred_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$owl_pred_info_native.class ? T : NIL;
    }

    public static SubLObject opi_cyc_name(final SubLObject v_object) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject opi_comment(final SubLObject v_object) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject opi_domains(final SubLObject v_object) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject opi_range(final SubLObject v_object) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject opi_plist(final SubLObject v_object) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_opi_cyc_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_opi_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_opi_domains(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_opi_range(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_opi_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_pred_info_p(v_object) : "owl_to_cycl.owl_pred_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_owl_pred_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $owl_pred_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYC_NAME)) {
                _csetf_opi_cyc_name(v_new, current_value);
            } else
                if (pcase_var.eql($COMMENT)) {
                    _csetf_opi_comment(v_new, current_value);
                } else
                    if (pcase_var.eql($DOMAINS)) {
                        _csetf_opi_domains(v_new, current_value);
                    } else
                        if (pcase_var.eql($RANGE)) {
                            _csetf_opi_range(v_new, current_value);
                        } else
                            if (pcase_var.eql($PLIST)) {
                                _csetf_opi_plist(v_new, current_value);
                            } else {
                                Errors.error($str147$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_owl_pred_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_OWL_PRED_INFO, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYC_NAME, opi_cyc_name(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, opi_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAINS, opi_domains(obj));
        funcall(visitor_fn, obj, $SLOT, $RANGE, opi_range(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, opi_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_OWL_PRED_INFO, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_owl_pred_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_pred_info(obj, visitor_fn);
    }

    public static SubLObject print_owl_pred_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str153$_OWL_PRED_INFO__A_, owl_pred_info_external_name(v_object, UNPROVIDED));
        return v_object;
    }

    public static SubLObject find_or_create_owl_pred_info(final SubLObject external_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_info = ((NIL != external_name) && (NIL != misc_utilities.initialized_p($owl_definition_accumulator$.getDynamicValue(thread)))) ? find_accumulated_owl_definition(external_name, $PROPERTY) : NIL;
        return NIL != pred_info ? pred_info : new_owl_pred_info(external_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_owl_pred_info(final SubLObject external_name, SubLObject cyc_name, SubLObject comment, SubLObject domains, SubLObject range) {
        if (cyc_name == UNPROVIDED) {
            cyc_name = NIL;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (domains == UNPROVIDED) {
            domains = NIL;
        }
        if (range == UNPROVIDED) {
            range = NIL;
        }
        final SubLObject pred_info = make_owl_pred_info(UNPROVIDED);
        if (NIL != cyc_name) {
            set_owl_pred_info_cyc_name(pred_info, cyc_name);
        }
        set_owl_pred_info_comment(pred_info, comment);
        set_owl_pred_info_domains(pred_info, domains);
        set_owl_pred_info_range(pred_info, range);
        _csetf_opi_plist(pred_info, NIL);
        if (NIL != external_name) {
            owl_pred_info_plist_enter(pred_info, $EXTERNAL_NAME, external_name);
        }
        return pred_info;
    }

    public static SubLObject owl_pred_info_cyc_name(final SubLObject pred_info) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        return opi_cyc_name(pred_info);
    }

    public static SubLObject owl_pred_info_comment(final SubLObject pred_info) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        return opi_comment(pred_info);
    }

    public static SubLObject owl_pred_info_domains(final SubLObject pred_info) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        return opi_domains(pred_info);
    }

    public static SubLObject owl_pred_info_range(final SubLObject pred_info) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        return opi_range(pred_info);
    }

    public static SubLObject owl_pred_info_plist(final SubLObject pred_info) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        return opi_plist(pred_info);
    }

    public static SubLObject owl_pred_info_plist_lookup(final SubLObject pred_info, final SubLObject key, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        return getf(opi_plist(pred_info), key, default_value);
    }

    public static SubLObject owl_pred_info_external_name(final SubLObject pred_info, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        return owl_pred_info_plist_lookup(pred_info, $EXTERNAL_NAME, default_value);
    }

    public static SubLObject set_owl_pred_info_cyc_name(final SubLObject pred_info, final SubLObject name) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        _csetf_opi_cyc_name(pred_info, name);
        return opi_cyc_name(pred_info);
    }

    public static SubLObject set_owl_pred_info_comment(final SubLObject pred_info, final SubLObject comment) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        _csetf_opi_comment(pred_info, comment);
        return opi_comment(pred_info);
    }

    public static SubLObject set_owl_pred_info_domains(final SubLObject pred_info, final SubLObject domains) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        assert NIL != list_utilities.non_dotted_list_p(domains) : "list_utilities.non_dotted_list_p(domains) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(domains) " + domains;
        _csetf_opi_domains(pred_info, domains);
        return opi_domains(pred_info);
    }

    public static SubLObject set_owl_pred_info_range(final SubLObject pred_info, final SubLObject range) {
        assert NIL != owl_pred_info_p(pred_info) : "owl_to_cycl.owl_pred_info_p(pred_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_pred_info_p(pred_info) " + pred_info;
        if (((NIL != range) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == owl_external_value_specification_p(range))) {
            throw new AssertionError(range);
        }
        _csetf_opi_range(pred_info, range);
        return opi_range(pred_info);
    }

    public static SubLObject merge_owl_pred_definitions(final SubLObject from, final SubLObject onto) {
        set_owl_pred_info_cyc_name(onto, owl_pred_info_cyc_name(from));
        set_owl_pred_info_comment(onto, owl_pred_info_comment(from));
        set_owl_pred_info_domains(onto, union(owl_pred_info_domains(from), owl_pred_info_domains(onto), symbol_function(EQUAL), UNPROVIDED));
        set_owl_pred_info_range(onto, owl_pred_info_range(from));
        SubLObject remainder;
        SubLObject property;
        SubLObject from_value;
        SubLObject onto_value;
        SubLObject new_value;
        for (remainder = NIL, remainder = owl_pred_info_plist(from); NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            from_value = cadr(remainder);
            onto_value = owl_pred_info_plist_lookup(onto, property, UNPROVIDED);
            new_value = (NIL != owl_term_info_plist_list_propertyP(property)) ? union(from_value, onto_value, symbol_function(EQUAL), UNPROVIDED) : from_value;
            owl_pred_info_plist_enter(onto, property, new_value);
        }
        return onto;
    }

    public static SubLObject owl_external_value_specification_p(final SubLObject v_object) {
        return makeBoolean((((((((((NIL != owl_external_value_specification_union_p(v_object)) || (NIL != owl_external_value_specification_intersection_p(v_object))) || (NIL != owl_external_term_enumeration_p(v_object))) || (NIL != xml_parsing_utilities.xml_prefixed_name_p(v_object))) || (NIL != nonlocal_owl_term_reference_p(v_object))) || (NIL != owl_restriction_p(v_object))) || (NIL != pattern_match.tree_matches_pattern(v_object, $list158))) || (NIL != node_id_specification_p(v_object))) || (NIL != cycl_utilities.expression_find_if(OWL_QUASI_TERM_P, v_object, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_grammar.cycl_denotational_term_p(v_object)));
    }

    public static SubLObject node_id_specification_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list160);
    }

    public static SubLObject owl_restriction_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list161);
    }

    public static SubLObject owl_external_value_specification_union_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list162);
    }

    public static SubLObject owl_external_value_specification_union_names(final SubLObject union) {
        return union.rest();
    }

    public static SubLObject owl_external_value_specification_intersection_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list163);
    }

    public static SubLObject owl_external_value_specification_intersection_names(final SubLObject intersection) {
        final SubLObject names = intersection.rest();
        return names;
    }

    public static SubLObject owl_external_term_enumeration_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list164);
    }

    public static SubLObject owl_external_term_enumeration_terms(final SubLObject enumeration) {
        assert NIL != owl_external_term_enumeration_p(enumeration) : "owl_to_cycl.owl_external_term_enumeration_p(enumeration) " + "CommonSymbols.NIL != owl_to_cycl.owl_external_term_enumeration_p(enumeration) " + enumeration;
        return enumeration.rest();
    }

    public static SubLObject owl_pred_info_plist_enter(final SubLObject pred_info, final SubLObject key, final SubLObject value) {
        _csetf_opi_plist(pred_info, putf(opi_plist(pred_info), key, value));
        return opi_plist(pred_info);
    }

    public static SubLObject owl_pred_info_plist_push(final SubLObject pred_info, final SubLObject key, final SubLObject value) {
        final SubLObject existing = getf(opi_plist(pred_info), key, NIL);
        final SubLObject v_new = (NIL != find(value, existing, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? existing : cons(value, existing);
        owl_pred_info_plist_enter(pred_info, key, v_new);
        return opi_plist(pred_info);
    }

    public static SubLObject sxhash_owl_pred_info_method(final SubLObject v_object) {
        return sxhash_owl_pred_info(v_object);
    }

    public static SubLObject sxhash_owl_pred_info(final SubLObject pred_info) {
        return Sxhash.sxhash(opi_cyc_name(pred_info));
    }

    public static SubLObject owl_import_parameters_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_import_parameters(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject owl_import_parameters_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$owl_import_parameters_native.class ? T : NIL;
    }

    public static SubLObject oip_ontology(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject oip_namespace_map(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject oip_constant_prefix(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject oip_constant_suffix(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject oip_base_uri(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject oip_uri_prefix(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject oip_cyclist(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject oip_quoted_isa(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject oip_prefix_external_namesP(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject oip_abbreviate_prefixesP(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject oip_import_term(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject oip_encoding(final SubLObject v_object) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_oip_ontology(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_oip_namespace_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_oip_constant_prefix(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_oip_constant_suffix(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_oip_base_uri(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_oip_uri_prefix(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_oip_cyclist(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_oip_quoted_isa(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_oip_prefix_external_namesP(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_oip_abbreviate_prefixesP(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_oip_import_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_oip_encoding(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_import_parameters_p(v_object) : "owl_to_cycl.owl_import_parameters_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_owl_import_parameters(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $owl_import_parameters_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ONTOLOGY)) {
                _csetf_oip_ontology(v_new, current_value);
            } else
                if (pcase_var.eql($NAMESPACE_MAP)) {
                    _csetf_oip_namespace_map(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSTANT_PREFIX)) {
                        _csetf_oip_constant_prefix(v_new, current_value);
                    } else
                        if (pcase_var.eql($CONSTANT_SUFFIX)) {
                            _csetf_oip_constant_suffix(v_new, current_value);
                        } else
                            if (pcase_var.eql($BASE_URI)) {
                                _csetf_oip_base_uri(v_new, current_value);
                            } else
                                if (pcase_var.eql($URI_PREFIX)) {
                                    _csetf_oip_uri_prefix(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CYCLIST)) {
                                        _csetf_oip_cyclist(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($QUOTED_ISA)) {
                                            _csetf_oip_quoted_isa(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($kw69$PREFIX_EXTERNAL_NAMES_)) {
                                                _csetf_oip_prefix_external_namesP(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($kw70$ABBREVIATE_PREFIXES_)) {
                                                    _csetf_oip_abbreviate_prefixesP(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($IMPORT_TERM)) {
                                                        _csetf_oip_import_term(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($ENCODING)) {
                                                            _csetf_oip_encoding(v_new, current_value);
                                                        } else {
                                                            Errors.error($str147$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_owl_import_parameters(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_OWL_IMPORT_PARAMETERS, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ONTOLOGY, oip_ontology(obj));
        funcall(visitor_fn, obj, $SLOT, $NAMESPACE_MAP, oip_namespace_map(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTANT_PREFIX, oip_constant_prefix(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTANT_SUFFIX, oip_constant_suffix(obj));
        funcall(visitor_fn, obj, $SLOT, $BASE_URI, oip_base_uri(obj));
        funcall(visitor_fn, obj, $SLOT, $URI_PREFIX, oip_uri_prefix(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLIST, oip_cyclist(obj));
        funcall(visitor_fn, obj, $SLOT, $QUOTED_ISA, oip_quoted_isa(obj));
        funcall(visitor_fn, obj, $SLOT, $kw69$PREFIX_EXTERNAL_NAMES_, oip_prefix_external_namesP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw70$ABBREVIATE_PREFIXES_, oip_abbreviate_prefixesP(obj));
        funcall(visitor_fn, obj, $SLOT, $IMPORT_TERM, oip_import_term(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING, oip_encoding(obj));
        funcall(visitor_fn, obj, $END, MAKE_OWL_IMPORT_PARAMETERS, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_owl_import_parameters_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_import_parameters(obj, visitor_fn);
    }

    public static SubLObject print_owl_import_parameters(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject ontology = oip_ontology(v_object);
        format(stream, $str206$_OWL_IMPORT_PARAMETERS__S_, NIL != ontology ? ontology : oip_constant_prefix(v_object));
        return v_object;
    }

    public static SubLObject new_owl_import_parameters(final SubLObject ontology, final SubLObject constant_prefix, final SubLObject constant_suffix, final SubLObject quoted_isa, final SubLObject cyclist, final SubLObject uri, final SubLObject uri_prefix, SubLObject prefix_external_namesP, SubLObject abbreviate_prefixesP) {
        if (prefix_external_namesP == UNPROVIDED) {
            prefix_external_namesP = NIL;
        }
        if (abbreviate_prefixesP == UNPROVIDED) {
            abbreviate_prefixesP = NIL;
        }
        assert NIL != cycl_grammar.cycl_denotational_term_p(ontology) : "cycl_grammar.cycl_denotational_term_p(ontology) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(ontology) " + ontology;
        assert NIL != stringp(constant_prefix) : "Types.stringp(constant_prefix) " + "CommonSymbols.NIL != Types.stringp(constant_prefix) " + constant_prefix;
        assert NIL != stringp(constant_suffix) : "Types.stringp(constant_suffix) " + "CommonSymbols.NIL != Types.stringp(constant_suffix) " + constant_suffix;
        assert NIL != stringp(uri_prefix) : "Types.stringp(uri_prefix) " + "CommonSymbols.NIL != Types.stringp(uri_prefix) " + uri_prefix;
        assert NIL != kb_accessors.cyclistP(cyclist) : "kb_accessors.cyclistP(cyclist) " + "CommonSymbols.NIL != kb_accessors.cyclistP(cyclist) " + cyclist;
        assert NIL != cycl_grammar.cycl_denotational_term_p(quoted_isa) : "cycl_grammar.cycl_denotational_term_p(quoted_isa) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(quoted_isa) " + quoted_isa;
        final SubLObject parameters = make_owl_import_parameters(UNPROVIDED);
        _csetf_oip_ontology(parameters, ontology);
        _csetf_oip_constant_prefix(parameters, constant_prefix);
        _csetf_oip_constant_suffix(parameters, constant_suffix);
        _csetf_oip_cyclist(parameters, cyclist_using_owl_importer_v1(cyclist));
        _csetf_oip_quoted_isa(parameters, quoted_isa);
        _csetf_oip_base_uri(parameters, uri);
        _csetf_oip_uri_prefix(parameters, uri_prefix);
        _csetf_oip_prefix_external_namesP(parameters, prefix_external_namesP);
        _csetf_oip_abbreviate_prefixesP(parameters, abbreviate_prefixesP);
        return parameters;
    }

    public static SubLObject cyclist_using_owl_importer_v1(final SubLObject cyclist) {
        final SubLObject version_string = owl_importer_v1_version_number();
        final SubLObject versioned_tool_nat = make_binary_formula($$SoftwareVersionFn, $$OWLImporter_Cyc, version_string);
        return czer_main.cyc_find_or_create_nart(make_binary_formula($$UserOfProgramFn, versioned_tool_nat, cyclist), UNPROVIDED);
    }

    public static SubLObject owl_import_parameters_ontology(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_ontology(parameters);
    }

    public static SubLObject owl_import_parameters_lookup_namespace(final SubLObject namespace, final SubLObject import_parameters) {
        return list_utilities.alist_lookup_without_values(oip_namespace_map(import_parameters), namespace, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject owl_import_parameters_constant_prefix(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_constant_prefix(parameters);
    }

    public static SubLObject owl_import_parameters_constant_suffix(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_constant_suffix(parameters);
    }

    public static SubLObject owl_import_parameters_base_uri(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_base_uri(parameters);
    }

    public static SubLObject owl_import_parameters_uri_prefix(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_uri_prefix(parameters);
    }

    public static SubLObject owl_import_parameters_cyclist(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_cyclist(parameters);
    }

    public static SubLObject owl_import_parameters_quoted_isa(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_quoted_isa(parameters);
    }

    public static SubLObject owl_import_parameters_prefix_external_namesP(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_prefix_external_namesP(parameters);
    }

    public static SubLObject owl_import_parameters_abbreviate_prefixesP(final SubLObject parameters) {
        assert NIL != owl_import_parameters_p(parameters) : "owl_to_cycl.owl_import_parameters_p(parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(parameters) " + parameters;
        return oip_abbreviate_prefixesP(parameters);
    }

    public static SubLObject owl_import_parameters_import_term(final SubLObject import_parameters) {
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        return oip_import_term(import_parameters);
    }

    public static SubLObject owl_import_parameters_encoding(final SubLObject import_parameters) {
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        return oip_encoding(import_parameters);
    }

    public static SubLObject owl_import_parameters_note_namespace(final SubLObject namespace, final SubLObject uri, final SubLObject import_parameters) {
        final SubLObject alist = oip_namespace_map(import_parameters);
        final SubLObject existing = owl_import_parameters_lookup_namespace(namespace, import_parameters);
        if (NIL == existing) {
            _csetf_oip_namespace_map(import_parameters, list_utilities.alist_enter(alist, namespace, uri, UNPROVIDED));
        } else
            if (!existing.equal(uri)) {
                Errors.error($str212$Multiple_uris_for__S_____S____S, namespace, uri, existing);
            }

        return oip_namespace_map(import_parameters);
    }

    public static SubLObject owl_import_parameters_note_base_uri(final SubLObject base_uri, final SubLObject import_parameters) {
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        _csetf_oip_base_uri(import_parameters, base_uri);
        return base_uri;
    }

    public static SubLObject owl_import_parameters_note_import_term(final SubLObject v_term, final SubLObject import_parameters) {
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        _csetf_oip_import_term(import_parameters, v_term);
        return v_term;
    }

    public static SubLObject owl_import_parameters_note_encoding(final SubLObject encoding, final SubLObject import_parameters) {
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        assert NIL != stringp(encoding) : "Types.stringp(encoding) " + "CommonSymbols.NIL != Types.stringp(encoding) " + encoding;
        _csetf_oip_encoding(import_parameters, encoding);
        return encoding;
    }

    public static SubLObject sxhash_owl_import_parameters_method(final SubLObject v_object) {
        return sxhash_owl_import_parameters(v_object);
    }

    public static SubLObject sxhash_owl_import_parameters(final SubLObject parameters) {
        return Sxhash.sxhash(oip_ontology(parameters));
    }

    public static SubLObject verify_imports_for_ontology_tokens(final SubLObject this_ontology, final SubLObject tokens, final SubLObject import_parameters) {
        SubLObject ontology_uris = NIL;
        SubLObject store = NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store(NIL);
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            token = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$imports))) {
                    final SubLObject ontology_uri = string_utilities.post_remove(xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$resource), UNPROVIDED), $str216$_, UNPROVIDED);
                    if (NIL != web_utilities.uri_p(ontology_uri, UNPROVIDED)) {
                        final SubLObject ontology = find_or_create_owl_ontology_for_uri(ontology_uri, import_parameters, store);
                        owl_assert(list($const15$owl_imports, this_ontology, ontology), $$OWLMappingMt, import_parameters);
                        ontology_uris = cons(ontology_uri, ontology_uris);
                    } else {
                        note_owl_failure(cconcatenate($$$interpretation_of_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ontology_uri), $str218$_as_a_URI_for_an_imported_ontolog }), UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ontology_uris;
    }

    public static SubLObject validate_and_note_owl_namespaces(final SubLObject tokens, final SubLObject imported_ontology_uris, final SubLObject import_parameters) {
        SubLObject unknown_namespaces = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != xml_parsing_utilities.regular_xml_tagP(token)) {
                final SubLObject v_new = validate_and_note_owl_namespaces_for_token(token, imported_ontology_uris, import_parameters);
                unknown_namespaces = append(unknown_namespaces, v_new);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        if (NIL != unknown_namespaces) {
            SubLObject problem = NIL;
            if (NIL == problem) {
                SubLObject csome_list_var = tokens;
                SubLObject token2 = NIL;
                token2 = csome_list_var.first();
                while ((NIL == problem) && (NIL != csome_list_var)) {
                    if (NIL != xml_parsing_utilities.regular_xml_tagP(token2)) {
                        SubLObject rest;
                        SubLObject cons;
                        SubLObject current;
                        SubLObject datum;
                        SubLObject namespace;
                        SubLObject problem_string;
                        SubLObject current_$57;
                        SubLObject datum_$56;
                        SubLObject element_name;
                        SubLObject attributes;
                        SubLObject rest_$58;
                        SubLObject cons_$59;
                        SubLObject current_$58;
                        SubLObject datum_$57;
                        SubLObject attribute_name;
                        SubLObject value;
                        for (rest = NIL, rest = unknown_namespaces; (NIL == problem) && (NIL != rest); rest = rest.rest()) {
                            cons = rest.first();
                            datum = current = cons;
                            namespace = NIL;
                            problem_string = NIL;
                            destructuring_bind_must_consp(current, datum, $list219);
                            namespace = current.first();
                            current = problem_string = current.rest();
                            if (NIL != string_utilities.substringP(namespace, token2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                datum_$56 = current_$57 = xml_parsing_utilities.parse_xml_token(token2);
                                element_name = NIL;
                                attributes = NIL;
                                destructuring_bind_must_consp(current_$57, datum_$56, $list100);
                                element_name = current_$57.first();
                                current_$57 = attributes = current_$57.rest();
                                if ((NIL != xml_parsing_utilities.xml_prefixed_name_p(element_name)) && namespace.equal(xml_parsing_utilities.xml_prefixed_name_namespace(element_name))) {
                                    problem = problem_string;
                                }
                                for (rest_$58 = NIL, rest_$58 = attributes; (NIL == problem) && (NIL != rest_$58); rest_$58 = rest_$58.rest()) {
                                    cons_$59 = rest_$58.first();
                                    datum_$57 = current_$58 = cons_$59;
                                    attribute_name = NIL;
                                    value = NIL;
                                    destructuring_bind_must_consp(current_$58, datum_$57, $list220);
                                    attribute_name = current_$58.first();
                                    current_$58 = value = current_$58.rest();
                                    if ((NIL != xml_parsing_utilities.xml_prefixed_name_p(attribute_name)) && namespace.equal(xml_parsing_utilities.xml_prefixed_name_namespace(attribute_name))) {
                                        problem = problem_string;
                                    }
                                }
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    token2 = csome_list_var.first();
                } 
            }
            if (NIL != problem) {
                Errors.error($str221$Namespace_problem___A, problem);
            }
        }
        return T;
    }

    public static SubLObject validate_and_note_owl_namespaces_for_token(final SubLObject token, final SubLObject imported_ontology_uris, final SubLObject import_parameters) {
        SubLObject problems = NIL;
        SubLObject current;
        final SubLObject datum = current = xml_parsing_utilities.parse_xml_token(token);
        SubLObject element_name = NIL;
        SubLObject attributes = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        element_name = current.first();
        current = current.rest();
        SubLObject cdolist_list_var;
        attributes = cdolist_list_var = current;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$63;
            final SubLObject datum_$62 = current_$63 = cons;
            SubLObject attribute_name = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current_$63, datum_$62, $list101);
            attribute_name = current_$63.first();
            current_$63 = value = current_$63.rest();
            if ((NIL != xml_parsing_utilities.xml_prefixed_name_p(attribute_name)) && $$$xmlns.equal(xml_parsing_utilities.xml_prefixed_name_namespace(attribute_name))) {
                final SubLObject new_problem = validate_and_note_owl_namespace(attribute_name, value, imported_ontology_uris, import_parameters);
                if (NIL != new_problem) {
                    problems = cons(new_problem, problems);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return problems;
    }

    public static SubLObject validate_and_note_owl_namespace(final SubLObject name, final SubLObject value, final SubLObject imported_ontology_uris, final SubLObject import_parameters) {
        final SubLObject namespace = xml_parsing_utilities.xml_prefixed_name_local_name(name);
        owl_import_parameters_note_namespace(namespace, value, import_parameters);
        return NIL != owl_reserved_namespace_p(namespace) ? owl_reserved_namespace_problem(namespace, value) : owl_imported_namespace_problem(value, imported_ontology_uris);
    }

    public static SubLObject owl_reserved_namespace_p(final SubLObject namespace) {
        return list_utilities.alist_has_keyP($owl_reserved_namespaces$.getGlobalValue(), namespace, symbol_function(EQUAL));
    }

    public static SubLObject owl_reserved_namespace_problem(final SubLObject namespace, final SubLObject value) {
        return NIL != subl_promotions.memberP(value, list_utilities.alist_lookup_without_values($owl_reserved_namespaces$.getGlobalValue(), namespace, symbol_function(EQUAL), NIL), symbol_function(EQUAL), UNPROVIDED) ? NIL : cons(value, cconcatenate(format_nil.format_nil_s_no_copy(namespace), new SubLObject[]{ $$$_is_bound_to_, format_nil.format_nil_s_no_copy(value), $str225$_, format_nil.$format_nil_percent$.getGlobalValue(), $$$_Must_be_one_of_, format_nil.format_nil_s_no_copy(list_utilities.alist_lookup_without_values($owl_reserved_namespaces$.getGlobalValue(), namespace, NIL, UNPROVIDED)) }));
    }

    public static SubLObject owl_imported_namespace_problem(final SubLObject value, final SubLObject imported_ontology_uris) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = imported_ontology_uris;
            SubLObject uri = NIL;
            uri = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (value.equal(uri) || (((NIL != string_utilities.starts_with(value, uri)) && (NIL != list_utilities.lengthE(value, number_utilities.f_1X(length(uri)), UNPROVIDED))) && CHAR_hash.eql(string_utilities.last_char(value)))) {
                    foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                uri = csome_list_var.first();
            } 
        }
        return NIL != foundP ? NIL : cons(value, cconcatenate($$$No_import_statement_for_, format_nil.format_nil_s_no_copy(value)));
    }

    public static SubLObject clear_find_or_create_owl_ontology_for_uri() {
        final SubLObject cs = $find_or_create_owl_ontology_for_uri_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_find_or_create_owl_ontology_for_uri(final SubLObject uri, SubLObject import_parameters, SubLObject problem_store) {
        if (import_parameters == UNPROVIDED) {
            import_parameters = NIL;
        }
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($find_or_create_owl_ontology_for_uri_caching_state$.getGlobalValue(), list(uri, import_parameters, problem_store), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_or_create_owl_ontology_for_uri_internal(final SubLObject uri, final SubLObject import_parameters, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != web_utilities.uri_p(uri, UNPROVIDED) : "web_utilities.uri_p(uri, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != web_utilities.uri_p(uri, CommonSymbols.UNPROVIDED) " + uri;
        if (((NIL != import_parameters) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == owl_import_parameters_p(import_parameters))) {
            throw new AssertionError(import_parameters);
        }
        SubLObject ontology = ((NIL != import_parameters) && uri.equal(owl_import_parameters_base_uri(import_parameters))) ? owl_import_parameters_ontology(import_parameters) : NIL;
        if (NIL == ontology) {
            ontology = ask_utilities.query_template($sym229$_ONTOLOGY, list($$and, $list231, list($$salientURI, $sym229$_ONTOLOGY, uri)), $$InferencePSC, listS($INFERENCE_MODE, $MINIMAL, $PROBLEM_STORE, problem_store, $list236)).first();
            if (NIL == ontology) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str238$Couldn_t_find_ontology_for__S__Cr, $str239$__ }), uri);
                    force_output(UNPROVIDED);
                }
                ontology = czer_main.cyc_find_or_create_nart(list($$OWLOntologyFn, uri), UNPROVIDED);
            }
        }
        return ontology;
    }

    public static SubLObject find_or_create_owl_ontology_for_uri(final SubLObject uri, SubLObject import_parameters, SubLObject problem_store) {
        if (import_parameters == UNPROVIDED) {
            import_parameters = NIL;
        }
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        SubLObject caching_state = $find_or_create_owl_ontology_for_uri_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI, $find_or_create_owl_ontology_for_uri_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(uri, import_parameters, problem_store);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (import_parameters.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && problem_store.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(find_or_create_owl_ontology_for_uri_internal(uri, import_parameters, problem_store)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(uri, import_parameters, problem_store));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_or_create_term_type_for_ontology(final SubLObject ontology, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        assert NIL != cycl_grammar.cycl_denotational_term_p(ontology) : "cycl_grammar.cycl_denotational_term_p(ontology) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(ontology) " + ontology;
        SubLObject term_type = ask_utilities.query_variable($sym242$_TERM_TYPE, listS($$termTypeForOntology, ontology, $list244), $$OWLMappingMt, listS($INFERENCE_MODE, $MINIMAL, $PROBLEM_STORE, problem_store, $list236)).first();
        if (NIL == term_type) {
            term_type = czer_main.canonicalize_term(list($$TermFromOntologyFn, ontology), UNPROVIDED);
        }
        return term_type;
    }

    public static SubLObject read_pred_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind($PROPERTY, thread);
            SubLObject pred_info = NIL;
            while (NIL != current_token) {
                thread.resetMultipleValues();
                final SubLObject new_pred_info = read_one_owl_chunk_for_pred_info(current_token, pred_info, import_parameters, tokens);
                final SubLObject token_advance_spec = thread.secondMultipleValue();
                final SubLObject pred_info_doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (!pred_info.eql(new_pred_info)) {
                    pred_info = new_pred_info;
                }
                if (NIL != pred_info_doneP) {
                    accumulate_owl_definition(new_pred_info, $PROPERTY);
                    pred_info = NIL;
                }
                if (NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
                } else
                    if (token_advance_spec.isString()) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, UNPROVIDED), UNPROVIDED);
                    } else
                        if (token_advance_spec.eql($CLOSE)) {
                            tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                        } else {
                            final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                            tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                        }


                current_token = (NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : NIL;
            } 
            if (NIL != pred_info) {
                if (NIL != owl_pred_info_range(pred_info)) {
                    accumulate_owl_definition(pred_info, $PROPERTY);
                } else
                    if (NIL != owl_utilities.owl_warnP()) {
                        Errors.warn($str247$There_is_no_range_for__S__Name_to, pred_info, current_token);
                    }

            }
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_owl_property_element_names() {
        final SubLObject cs = $owl_property_element_names_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_owl_property_element_names() {
        return memoization_state.caching_state_remove_function_results_with_args($owl_property_element_names_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_property_element_names_internal() {
        return list(owl_utilities.owl_name($$$DatatypeProperty), owl_utilities.owl_name($$$AnnotationProperty), owl_utilities.owl_name($$$ObjectProperty), owl_utilities.owl_name($$$FunctionalProperty), owl_utilities.owl_name($$$SymmetricProperty), owl_utilities.owl_name($$$TransitiveProperty));
    }

    public static SubLObject owl_property_element_names() {
        SubLObject caching_state = $owl_property_element_names_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL_PROPERTY_ELEMENT_NAMES, $owl_property_element_names_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl_property_element_names_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_property_token_p(final SubLObject token) {
        return subl_promotions.memberP(xml_parsing_utilities.xml_token_element_name(token), owl_property_element_names(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject read_one_owl_chunk_for_pred_info(final SubLObject current_token, final SubLObject pred_info, final SubLObject import_parameters, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_pred_info = pred_info;
        SubLObject token_advance_spec = NIL;
        SubLObject pred_info_doneP = NIL;
        if (NIL != xml_parsing_utilities.xml_token_starts_with(current_token, $str256$____)) {
            final SubLObject comment_close_position = xml_parsing_utilities.next_xml_token_position(tokens, $str257$___, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!comment_close_position.isInteger())) {
                Errors.error($str258$Couldn_t_find_end_of_HTML_comment, list_utilities.first_n(TEN_INTEGER, tokens));
            }
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str259$Skipping_comment___S, $str239$__ }), list_utilities.first_n(number_utilities.f_1X(comment_close_position), tokens));
                force_output(UNPROVIDED);
            }
            token_advance_spec = number_utilities.f_1X(comment_close_position);
        } else
            if ((NIL == xml_parsing_utilities.xml_closing_tag_p(current_token)) && (NIL != owl_property_token_p(current_token))) {
                SubLObject external_name = NIL;
                SubLObject cyc_name = NIL;
                if (NIL == list_utilities.empty_list_p(xml_parsing_utilities.parse_xml_token(current_token).rest())) {
                    thread.resetMultipleValues();
                    final SubLObject external_name_$64 = pred_names_from_token(current_token, import_parameters);
                    final SubLObject cyc_name_$65 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    external_name = external_name_$64;
                    cyc_name = cyc_name_$65;
                }
                new_pred_info = find_or_create_owl_pred_info(external_name);
                if (NIL != cyc_name) {
                    set_owl_pred_info_cyc_name(new_pred_info, cyc_name);
                }
                final SubLObject type = xml_parsing_utilities.xml_token_element_name(current_token);
                owl_pred_info_plist_push(new_pred_info, $ISAS, type);
                if (NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                    pred_info_doneP = T;
                }
                token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
            } else
                if (NIL != owl_class_token_p(current_token)) {
                    token_advance_spec = $CLOSE;
                } else
                    if (NIL == pred_info) {
                        token_advance_spec = handle_non_target_owl_token(current_token);
                    } else
                        if (NIL != string_utilities.whitespace_stringP(current_token)) {
                            token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                        } else
                            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$type))) {
                                owl_pred_info_plist_push(new_pred_info, $ISAS, term_names_from_token(current_token, import_parameters));
                                token_advance_spec = $CLOSE;
                            } else
                                if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$label))) {
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != xml_parsing_utilities.xml_empty_tagP(current_token))) {
                                        Errors.error($str263$Can_t_interpret_empty_label_token, current_token);
                                    }
                                    final SubLObject lang_value = xml_parsing_utilities.xml_tag_attribute_value(current_token, xml_name($$$lang), NIL);
                                    final SubLObject language = (NIL != lang_value) ? decode_html_language_abbreviation(lang_value) : $$EnglishLanguage;
                                    final SubLObject label = second(tokens);
                                    if (((NIL != lang_value) && (NIL == language)) && (NIL != owl_utilities.owl_warnP())) {
                                        Errors.warn($str264$Can_t_decode_language_abbreviatio, lang_value);
                                    }
                                    owl_pred_info_plist_push(new_pred_info, $LABEL, cons(label, language));
                                    token_advance_spec = $CLOSE;
                                } else
                                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$comment))) {
                                        set_owl_pred_info_comment(new_pred_info, second(tokens));
                                        token_advance_spec = $CLOSE;
                                    } else
                                        if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$domain))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token))) {
                                            final SubLObject domains = process_domain_list(tokens, import_parameters);
                                            set_owl_pred_info_domains(new_pred_info, domains);
                                            token_advance_spec = $CLOSE;
                                        } else
                                            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$domain))) {
                                                final SubLObject domain = read_owl_term_reference(current_token, import_parameters);
                                                if (NIL != domain) {
                                                    set_owl_pred_info_domains(new_pred_info, list(domain));
                                                } else
                                                    if (NIL != owl_utilities.owl_warnP()) {
                                                        Errors.warn($str267$Couldn_t_identify_domain_from__S, list_utilities.first_n(FOUR_INTEGER, tokens));
                                                    }

                                                token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                            } else
                                                if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$inverseOf))) {
                                                    final SubLObject atomicP = string_utilities.ends_with(current_token, $str269$__, UNPROVIDED);
                                                    final SubLObject inverse_token = (NIL != atomicP) ? current_token : next_noninitial_non_whitespace_xml_token(tokens);
                                                    final SubLObject inverse_name = pred_names_from_token(inverse_token, import_parameters);
                                                    if (inverse_name.equal(owl_pred_info_plist_lookup(new_pred_info, $EXTERNAL_NAME, UNPROVIDED))) {
                                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str270$_S_is_its_own_inverse__so_it_s_sy, $str239$__ }), inverse_name);
                                                            force_output(UNPROVIDED);
                                                        }
                                                        owl_pred_info_plist_enter(new_pred_info, $SYMMETRIC_, T);
                                                    } else
                                                        if (NIL != inverse_name) {
                                                            owl_pred_info_plist_enter(new_pred_info, $INVERSE, inverse_name);
                                                        }

                                                    token_advance_spec = $CLOSE;
                                                } else
                                                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$subPropertyOf))) {
                                                        final SubLObject atomicP = xml_parsing_utilities.xml_empty_tagP(current_token);
                                                        final SubLObject genl_property_token = (NIL != atomicP) ? current_token : next_noninitial_non_whitespace_xml_token(tokens);
                                                        final SubLObject genl_property_name = pred_names_from_token(genl_property_token, import_parameters);
                                                        if (NIL != genl_property_name) {
                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str274$Noting_genl_property__S_of__S, $str239$__ }), genl_property_name, pred_info);
                                                                force_output(UNPROVIDED);
                                                            }
                                                            owl_pred_info_plist_enter(new_pred_info, $GENL_PROPERTY, genl_property_name);
                                                        }
                                                        token_advance_spec = $CLOSE;
                                                    } else
                                                        if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$equivalentProperty))) {
                                                            final SubLObject atomicP = xml_parsing_utilities.xml_empty_tagP(current_token);
                                                            final SubLObject equiv_property_token = (NIL != atomicP) ? current_token : next_noninitial_non_whitespace_xml_token(tokens);
                                                            final SubLObject equiv_property_name = pred_names_from_token(equiv_property_token, import_parameters);
                                                            if (NIL != equiv_property_name) {
                                                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str277$Noting_equivalent_property__S_of_, $str239$__ }), equiv_property_name, pred_info);
                                                                    force_output(UNPROVIDED);
                                                                }
                                                                owl_pred_info_plist_push(new_pred_info, $EQUIVALENT_PROPERTIES, equiv_property_name);
                                                            }
                                                            token_advance_spec = $CLOSE;
                                                        } else
                                                            if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$range))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token))) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject range = process_range_list(tokens, import_parameters);
                                                                final SubLObject tokens_to_advance = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                set_owl_pred_info_range(new_pred_info, range);
                                                                token_advance_spec = tokens_to_advance;
                                                            } else
                                                                if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$range))) {
                                                                    final SubLObject range = read_owl_term_reference(current_token, import_parameters);
                                                                    if ((NIL == range) && (NIL != owl_utilities.owl_warnP())) {
                                                                        Errors.warn($str280$Couldn_t_identify_range_from__S, list_utilities.first_n(FOUR_INTEGER, tokens));
                                                                    }
                                                                    set_owl_pred_info_range(new_pred_info, range);
                                                                    token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                                                } else
                                                                    if ((NIL != owl_property_token_p(current_token)) && (NIL != xml_parsing_utilities.xml_closing_tag_p(current_token))) {
                                                                        pred_info_doneP = T;
                                                                        token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                                                    } else
                                                                        if (NIL != cyc_token_with_nameP(current_token, $$$guid, import_parameters)) {
                                                                            final SubLObject next_token = second(tokens);
                                                                            final SubLObject guid = owl_value_from_string(next_token, $$$string);
                                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str283$__Noting_Cyc_guid_for__S_S__, $str239$__ }), guid, new_pred_info);
                                                                                force_output(UNPROVIDED);
                                                                            }
                                                                            owl_pred_info_plist_enter(new_pred_info, $GUID, guid);
                                                                            token_advance_spec = $CLOSE;
                                                                        } else
                                                                            if (NIL != cyc_token_with_nameP(current_token, $$$externalID, import_parameters)) {
                                                                                final SubLObject next_token = second(tokens);
                                                                                final SubLObject externalid = owl_value_from_string(next_token, $$$string);
                                                                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str286$__Noting_Cyc_externalID_for__S_S_, $str239$__ }), externalid, new_pred_info);
                                                                                    force_output(UNPROVIDED);
                                                                                }
                                                                                owl_pred_info_plist_enter(new_pred_info, $EXTERNALID, externalid);
                                                                                token_advance_spec = $CLOSE;
                                                                            } else
                                                                                if ((NIL != xml_parsing_utilities.xml_tagP(current_token)) && (NIL == xml_parsing_utilities.xml_closing_tag_p(current_token))) {
                                                                                    final SubLObject property_name = xml_parsing_utilities.xml_token_element_name(current_token);
                                                                                    final SubLObject value_name = (NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) ? term_names_from_token(current_token, import_parameters) : NIL;
                                                                                    SubLObject value = NIL;
                                                                                    if (NIL != value_name) {
                                                                                        value = owl_find_or_create_term_from_specification(value_name, $$Thing, import_parameters);
                                                                                    } else {
                                                                                        final SubLObject datatype = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$datatype), UNPROVIDED));
                                                                                        final SubLObject next_token2 = second(tokens);
                                                                                        value = owl_value_from_string(next_token2, datatype);
                                                                                    }
                                                                                    if (NIL != value) {
                                                                                        if (NIL != cyc_token_with_nameP(current_token, $$$isa, import_parameters)) {
                                                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str290$__Noting__isa__S__S___, $str239$__ }), new_pred_info, value);
                                                                                                force_output(UNPROVIDED);
                                                                                            }
                                                                                            owl_pred_info_plist_push(new_pred_info, $ISAS, value);
                                                                                        } else {
                                                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str291$__Noting__S__S__, $str239$__ }), property_name, value);
                                                                                                force_output(UNPROVIDED);
                                                                                            }
                                                                                            owl_pred_info_plist_push(new_pred_info, $MY_PRED_VALUES, list(property_name, value));
                                                                                        }
                                                                                    }
                                                                                    token_advance_spec = $CLOSE;
                                                                                } else {
                                                                                    if (NIL != owl_utilities.owl_warnP()) {
                                                                                        Errors.warn($str293$Ignoring_unrecognized_token___S, current_token);
                                                                                    }
                                                                                    token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                                                                }


















        return values(new_pred_info, token_advance_spec, pred_info_doneP);
    }

    public static SubLObject cyc_token_with_nameP(final SubLObject current_token, final SubLObject name, final SubLObject import_parameters) {
        return makeBoolean(((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, name)) && owl_import_parameters_base_uri(import_parameters).isString()) && (NIL != string_utilities.substringP($str294$cyc_com, owl_import_parameters_base_uri(import_parameters), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject process_owl_attribute_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hash_pos = position(CHAR_hash, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject divider_pos = (NIL != hash_pos) ? hash_pos : list_utilities.position_from_end(CHAR_slash, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == divider_pos) {
            return value;
        }
        if (divider_pos.eql(ZERO_INTEGER)) {
            return string_utilities.substring(value, ONE_INTEGER, UNPROVIDED);
        }
        final SubLObject local_name = string_utilities.substring(value, number_utilities.f_1X(divider_pos), UNPROVIDED);
        final SubLObject uri = string_utilities.substring(value, ZERO_INTEGER, divider_pos);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == web_utilities.uri_p(uri, UNPROVIDED))) {
            Errors.error($str295$Don_t_know_how_to_interpret_attri, value);
        }
        return list($NONLOCAL, uri, local_name);
    }

    public static SubLObject owl_note_spec_property(final SubLObject pred, final SubLObject genl_property_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary_utilities.dictionary_pushnew($owl_spec_properties$.getDynamicValue(thread), genl_property_name, pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_lookup_spec_properties(final SubLObject genl_property_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup_without_values($owl_spec_properties$.getDynamicValue(thread), genl_property_name, NIL);
    }

    public static SubLObject create_preds_from_owl_data(final SubLObject pred_info_list, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unconstrained_preds = NIL;
        note_owl_import_section_started();
        if (NIL != list_utilities.non_empty_list_p(pred_info_list)) {
            final SubLObject _prev_bind_0 = $owl_spec_properties$.currentBinding(thread);
            try {
                $owl_spec_properties$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
                final SubLObject total = length(pred_info_list);
                final SubLObject percent_per = divide(ONE_INTEGER, total);
                SubLObject percent_done = ZERO_INTEGER;
                final SubLObject message = format(NIL, $str297$Processing__D_property_definition, total);
                final SubLObject _prev_bind_0_$66 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(pred_info_list), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = pred_info_list;
                        SubLObject pred_info = NIL;
                        pred_info = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject pred = owl_define_one_pred(pred_info, import_parameters);
                            final SubLObject unconstrainedP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            owl_utilities.note_term_acted_on_during_import(pred, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
                            if (NIL != unconstrainedP) {
                                unconstrained_preds = cons(pred, unconstrained_preds);
                            }
                            percent_done = add(percent_done, percent_per);
                            note_owl_import_section_progress(percent_done);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            pred_info = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
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
                    $progress_note$.rebind(_prev_bind_0_$66, thread);
                }
            } finally {
                $owl_spec_properties$.rebind(_prev_bind_0, thread);
            }
        }
        note_owl_import_section_done();
        return unconstrained_preds;
    }

    public static SubLObject process_domain_list(final SubLObject original_tokens, final SubLObject import_parameters) {
        SubLObject domains = NIL;
        SubLObject tokens = original_tokens;
        while (NIL != tokens) {
            final SubLObject token = tokens.first();
            if (NIL != string_utilities.whitespace_stringP(token)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            } else {
                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdfs_name($$$domain))) && (NIL != xml_parsing_utilities.xml_closing_tag_p(token))) {
                    return domains;
                }
                if (NIL != owl_class_token_p(token)) {
                    final SubLObject this_class = read_owl_class(tokens, import_parameters);
                    domains = cons(this_class, domains);
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                } else {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                }
            }
        } 
        return domains;
    }

    public static SubLObject process_range_list(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject range = NIL;
        SubLObject tokens_to_advance = next_noninitial_non_whitespace_xml_token_position(original_tokens);
        final SubLObject start_of_specification = xml_parsing_utilities.advance_xml_tokens(original_tokens, tokens_to_advance);
        if (NIL != owl_class_token_p(start_of_specification.first())) {
            range = read_owl_class(start_of_specification, import_parameters);
        } else
            if (((NIL != xml_parsing_utilities.xml_token_element_nameP(start_of_specification.first(), owl_utilities.owl_name($$$DataRange))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(start_of_specification.first()))) && (NIL != xml_parsing_utilities.xml_token_element_nameP(second(start_of_specification), owl_utilities.owl_name($$$oneOf)))) {
                range = read_owl_enumeration(start_of_specification.rest(), import_parameters);
            } else {
                Errors.warn($str301$Can_t_read_range_starting_with__S, list_utilities.first_n(TEN_INTEGER, start_of_specification));
            }

        final SubLObject end_of_specification = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(start_of_specification);
        final SubLObject end_of_range = xml_parsing_utilities.advance_xml_tokens_to(end_of_specification, $str302$__rdfs_range_, UNPROVIDED);
        final SubLObject next_start_position = next_noninitial_non_whitespace_xml_token_position(end_of_range);
        final SubLObject next_start_token = nth(next_start_position, end_of_range);
        tokens_to_advance = position(next_start_token, original_tokens, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str303$Finished_range__S_, $str239$__ }), range);
            force_output(UNPROVIDED);
        }
        return values(range, tokens_to_advance);
    }

    public static SubLObject clear_owl_class_element_names() {
        final SubLObject cs = $owl_class_element_names_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_owl_class_element_names() {
        return memoization_state.caching_state_remove_function_results_with_args($owl_class_element_names_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_class_element_names_internal() {
        return list(owl_utilities.owl_name($$$Class), owl_utilities.owl_name($$$DeprecatedClass), rdf_utilities.rdfs_name($$$Class));
    }

    public static SubLObject owl_class_element_names() {
        SubLObject caching_state = $owl_class_element_names_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL_CLASS_ELEMENT_NAMES, $owl_class_element_names_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl_class_element_names_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_class_token_p(final SubLObject token) {
        return subl_promotions.memberP(xml_parsing_utilities.xml_token_element_name(token), owl_class_element_names(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject read_owl_class(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_class_token_p(original_tokens.first()) : "owl_to_cycl.owl_class_token_p(original_tokens.first()) " + "CommonSymbols.NIL != owl_to_cycl.owl_class_token_p(original_tokens.first()) " + original_tokens.first();
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str309$Reading_OWL_class_starting_with__, $str239$__ }), list_utilities.first_n(FOUR_INTEGER, original_tokens));
            force_output(UNPROVIDED);
        }
        final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(original_tokens.first(), rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
        SubLObject v_class = NIL;
        if ((NIL != member($owl_definition_type$.getDynamicValue(thread), $list311, symbol_function(EQL), UNPROVIDED)) && read_owl_term_reference(original_tokens.first(), import_parameters).isString()) {
            final SubLObject term_info = nth_value_step_2(nth_value_step_1(ONE_INTEGER), read_one_class_info_from_owl_tokens(original_tokens, import_parameters));
            assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
            v_class = owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, UNPROVIDED);
        } else {
            SubLObject tokens = original_tokens;
            SubLObject previous_first_token = NIL;
            SubLObject components = NIL;
            SubLObject reading_unionP = NIL;
            SubLObject doneP = NIL;
            while ((NIL != tokens) && (NIL == doneP)) {
                final SubLObject token = tokens.first();
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str313$Starting_token___S, $str239$__ }), token);
                    force_output(UNPROVIDED);
                }
                if (token.eql(previous_first_token)) {
                    Errors.sublisp_break($str314$No_progress_reading_OWL_class__St, new SubLObject[]{ token });
                } else
                    if (((NIL != owl_class_token_p(token)) || (NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name($$$Description)))) && (NIL != xml_parsing_utilities.xml_empty_tagP(token))) {
                        components = cons(read_owl_term_reference(token, import_parameters), components);
                        if (NIL != reading_unionP) {
                            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                        } else {
                            doneP = T;
                        }
                    } else
                        if ((NIL != owl_class_token_p(token)) && (NIL != xml_parsing_utilities.xml_closing_tag_p(token))) {
                            if (NIL == reading_unionP) {
                                doneP = T;
                            }
                        } else
                            if ((NIL != xml_parsing_utilities.xml_opening_tag_p(token)) && (NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$Restriction)))) {
                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str317$Reading_restriction_starting_with, $str239$__ }), token);
                                    force_output(UNPROVIDED);
                                }
                                final SubLObject restriction = read_owl_class_or_restriction(tokens, import_parameters);
                                components = cons(restriction, components);
                                if (NIL != reading_unionP) {
                                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                                } else {
                                    doneP = T;
                                }
                            } else
                                if ((NIL != xml_parsing_utilities.xml_opening_tag_p(token)) && (NIL != owl_class_token_p(token))) {
                                    thread.resetMultipleValues();
                                    final SubLObject new_tokens = handle_open_class_tag(tokens, import_parameters, reading_unionP);
                                    final SubLObject new_components = thread.secondMultipleValue();
                                    final SubLObject done_nowP = thread.thirdMultipleValue();
                                    final SubLObject reading_union_nowP = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    tokens = new_tokens;
                                    components = append(components, new_components);
                                    doneP = done_nowP;
                                    reading_unionP = reading_union_nowP;
                                } else
                                    if (NIL != xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name($$$unionOf), token)) {
                                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                        reading_unionP = NIL;
                                    } else {
                                        Errors.sublisp_break($str319$Don_t_know_what_to_do_with_this_t, new SubLObject[]{ token });
                                    }





                previous_first_token = token;
            } 
            v_class = owl_external_value_specification_union(components);
        }
        if (NIL != node_id) {
            note_node_id_reference(node_id, v_class);
        }
        return v_class;
    }

    public static SubLObject handle_open_class_tag(final SubLObject tokens, final SubLObject import_parameters, SubLObject reading_unionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token_position = next_noninitial_non_whitespace_xml_token_position(tokens);
        final SubLObject next_token = nth(next_token_position, tokens);
        SubLObject components = NIL;
        SubLObject new_tokens = NIL;
        SubLObject doneP = NIL;
        if (((NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name($$$unionOf))) && (NIL != xml_parsing_utilities.xml_empty_tagP(next_token))) && (NIL != xml_parsing_utilities.xml_tag_attribute_value(next_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED))) {
            final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(next_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
            components = list($NODE_ID, node_id);
            new_tokens = xml_parsing_utilities.advance_xml_tokens(tokens, number_utilities.f_1X(next_token_position));
            reading_unionP = NIL;
            doneP = T;
        } else
            if ((NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name($$$unionOf))) && (NIL == xml_parsing_utilities.xml_empty_tagP(next_token))) {
                new_tokens = xml_parsing_utilities.advance_xml_tokens(tokens, number_utilities.f_1X(next_token_position));
                reading_unionP = T;
            } else
                if (NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name($$$oneOf))) {
                    final SubLObject enumeration = read_owl_enumeration(xml_parsing_utilities.advance_xml_tokens(tokens, next_token_position), import_parameters);
                    components = cons(enumeration, components);
                    if (NIL != reading_unionP) {
                        new_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    } else {
                        doneP = T;
                    }
                } else {
                    final SubLObject v_class = nth_value_step_2(nth_value_step_1(ONE_INTEGER), read_one_class_info_from_owl_tokens(tokens, import_parameters));
                    if ((NIL != v_class) && (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread))) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str321$Found_class___S___Components___S, $str239$__ }), v_class, components);
                        force_output(UNPROVIDED);
                    }
                    final SubLObject external_name = owl_term_info_plist_lookup(v_class, $EXTERNAL_NAME, UNPROVIDED);
                    if (external_name.isString() || (NIL != nonlocal_owl_term_reference_p(external_name))) {
                        components = cons(external_name, components);
                    } else
                        if (NIL != owl_term_info_plist_lookup(v_class, $COMPLEMENT_CLASS, UNPROVIDED)) {
                            components = cons(list($COMPLEMENT_OF, owl_term_info_plist_lookup(v_class, $COMPLEMENT_CLASS, UNPROVIDED)), components);
                        } else
                            if (NIL != owl_term_info_plist_lookup(v_class, $INTERSECTION_OF, UNPROVIDED)) {
                                components = cons(cons($INTERSECTION_OF, owl_term_info_plist_lookup(v_class, $INTERSECTION_OF, UNPROVIDED)), components);
                            } else {
                                Errors.sublisp_break($str325$Don_t_know_what_this_class_is_nam, new SubLObject[]{ v_class });
                            }


                    new_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    if (NIL == reading_unionP) {
                        doneP = T;
                    }
                }


        return values(new_tokens, components, doneP, reading_unionP);
    }

    public static SubLObject read_owl_enumeration(final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject one_of_token = tokens.first();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == xml_parsing_utilities.xml_token_element_nameP(one_of_token, owl_utilities.owl_name($$$oneOf)))) {
            Errors.error($str326$Can_t_read_an_enumeration_that_is, list_utilities.first_n(TEN_INTEGER, tokens));
        }
        final SubLObject one_of_list = xml_parsing_utilities.advance_xml_tokens(tokens, position(one_of_token, tokens, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject next_position = next_noninitial_non_whitespace_xml_token_position(one_of_list);
        final SubLObject start_of_list = xml_parsing_utilities.advance_xml_tokens(one_of_list, next_position);
        SubLObject items = NIL;
        if (NIL != member(xml_parsing_utilities.xml_token_element_name(start_of_list.first()), list(rdf_utilities.rdf_name($$$rest), rdf_utilities.rdf_name($$$first)), symbol_function(EQUAL), UNPROVIDED)) {
            items = read_owl_list(start_of_list, import_parameters);
        } else {
            for (SubLObject remaining_tokens = start_of_list, current_token = remaining_tokens.first(); NIL == xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name($$$oneOf), current_token); current_token = remaining_tokens.first()) {
                SubLObject name = NIL;
                if (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
                    final SubLObject term_info = nth_value_step_2(nth_value_step_1(ONE_INTEGER), read_one_instance_info_from_owl_tokens(remaining_tokens, import_parameters));
                    assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
                    name = owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, UNPROVIDED);
                } else {
                    name = owl_external_name_from_token(current_token, import_parameters);
                }
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!name.isString())) && (NIL == nonlocal_owl_term_reference_p(name))) {
                    Errors.error($str329$Couldn_t_get_name_from__S, current_token);
                }
                items = cons(name, items);
                remaining_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(remaining_tokens);
            }
            items = nreverse(items);
        }
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str330$Read_enumeration___S, $str239$__ }), items);
            force_output(UNPROVIDED);
        }
        return cons($ONE_OF, items);
    }

    public static SubLObject possible_read_owl_list_p(final SubLObject v_object) {
        SubLObject ans = NIL;
        if (NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject oops = NIL;
            if (NIL == oops) {
                SubLObject csome_list_var = v_object;
                SubLObject item = NIL;
                item = csome_list_var.first();
                while ((NIL == oops) && (NIL != csome_list_var)) {
                    if ((!item.isString()) && (NIL == list_utilities.list_of_type_p(STRINGP, item))) {
                        oops = item;
                    }
                    csome_list_var = csome_list_var.rest();
                    item = csome_list_var.first();
                } 
            }
            ans = sublisp_null(oops);
        }
        return ans;
    }

    public static SubLObject read_owl_list(final SubLObject tokens, final SubLObject import_parameters) {
        return read_owl_list_recursive(tokens, import_parameters);
    }

    public static SubLObject read_owl_list_recursive(final SubLObject original_tokens, final SubLObject import_parameters) {
        SubLObject tokens = original_tokens;
        SubLObject first = NIL;
        SubLObject first_doneP = NIL;
        SubLObject rest_doneP = NIL;
        SubLObject rest = NIL;
        while ((NIL != tokens) && ((NIL == first_doneP) || (NIL == rest_doneP))) {
            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, first_non_whitespace_xml_token_position(tokens));
            if (NIL != tokens) {
                final SubLObject first_token = tokens.first();
                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$rest))) && xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name($$$resource), UNPROVIDED).equal($str332$http___www_w3_org_1999_02_22_rdf_)) {
                    rest_doneP = T;
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                } else
                    if (((NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$rest))) && xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name($$$parseType), UNPROVIDED).equal($$$Collection)) && (NIL == xml_parsing_utilities.xml_empty_tagP(first_token))) {
                        SubLObject remaining = tokens.rest();
                        SubLObject next_token = remaining.first();
                        SubLObject accumulated = NIL;
                        while (NIL == xml_parsing_utilities.xml_closing_tokenP(rdf_utilities.rdf_name($$$rest), next_token)) {
                            final SubLObject item = read_one_owl_list_item(remaining, import_parameters);
                            accumulated = cons(item, accumulated);
                            remaining = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(remaining);
                            next_token = remaining.first();
                        } 
                        rest = nreverse(accumulated);
                        rest_doneP = T;
                        tokens = remaining;
                    } else
                        if (((NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$rest))) && (NIL != xml_parsing_utilities.xml_empty_tagP(first_token))) && (NIL != string_utilities.non_empty_string_p(xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED)))) {
                            final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
                            rest = try_to_resolve_node_id_specification(list($NODE_ID, node_id));
                            rest_doneP = T;
                            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                        } else
                            if (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$rest))) {
                                rest = read_owl_list_recursive(tokens.rest(), import_parameters);
                                rest_doneP = T;
                                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                            } else
                                if (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$first))) {
                                    first = read_one_owl_list_item(tokens, import_parameters);
                                    first_doneP = T;
                                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                                } else {
                                    Errors.sublisp_break($str335$Found_non_first__non_rest_token_i, new SubLObject[]{ first_token });
                                }




            }
        } 
        final SubLObject ans = cons(first, rest);
        return ans;
    }

    public static SubLObject read_one_owl_list_item(SubLObject tokens, final SubLObject import_parameters) {
        SubLObject item;
        final SubLObject first_token = item = tokens.first();
        if (NIL != xml_parsing_utilities.xml_empty_tagP(first_token)) {
            item = first_token;
        } else {
            if ((NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$first))) || (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$rest)))) {
                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                item = tokens.first();
            }
            item = xml_parsing_utilities.xml_tokens_for_next_element(tokens);
            format(T, $str336$__Next_item___S__, item);
        }
        return item;
    }

    public static SubLObject owl_external_value_specification_union(final SubLObject external_values) {
        assert NIL != list_utilities.non_dotted_list_p(external_values) : "list_utilities.non_dotted_list_p(external_values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(external_values) " + external_values;
        SubLObject cdolist_list_var = external_values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != owl_external_value_specification_p(elem) : "owl_to_cycl.owl_external_value_specification_p(elem) " + "CommonSymbols.NIL != owl_to_cycl.owl_external_value_specification_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return NIL != list_utilities.empty_list_p(external_values) ? NIL : NIL != list_utilities.singletonP(external_values) ? list_utilities.only_one(external_values) : cons($UNION, external_values);
    }

    public static SubLObject first_non_whitespace_xml_token_position(final SubLObject tokens) {
        return xml_parsing_utilities.next_xml_token_position_if_not(tokens, $sym78$WHITESPACE_STRING_);
    }

    public static SubLObject next_noninitial_non_whitespace_xml_token_position(final SubLObject tokens) {
        final SubLObject position_in_rest = first_non_whitespace_xml_token_position(tokens.rest());
        return NIL != position_in_rest ? number_utilities.f_1X(position_in_rest) : NIL;
    }

    public static SubLObject next_noninitial_non_whitespace_xml_token(final SubLObject tokens) {
        return list_utilities.find_if_not($sym78$WHITESPACE_STRING_, tokens.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pred_names_from_token(final SubLObject token, final SubLObject import_parameters) {
        final SubLObject pred_prefix = oip_pred_prefix(import_parameters);
        final SubLObject about_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$about), UNPROVIDED);
        final SubLObject resource_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$resource), UNPROVIDED);
        final SubLObject id_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$ID), UNPROVIDED);
        SubLObject external_name = NIL;
        SubLObject cyc_name = NIL;
        if (NIL != about_value) {
            external_name = process_owl_attribute_value(about_value);
        } else
            if (NIL != resource_value) {
                external_name = process_owl_attribute_value(resource_value);
            } else
                if (NIL != id_value) {
                    external_name = process_owl_attribute_value(id_value);
                }


        cyc_name = owl_pred_cyc_name_from_external_name(external_name, pred_prefix);
        return values(external_name, cyc_name);
    }

    public static SubLObject owl_pred_cyc_name_from_external_name(final SubLObject external_name, final SubLObject pred_prefix) {
        final SubLObject cyc_name_base = owl_pred_cyc_name_base(external_name);
        SubLObject clean_name = string_utilities.char_subst(CHAR_hyphen, CHAR_period, cconcatenate(pred_prefix, string_utilities.upcase_leading(cyc_name_base)));
        if (NIL != upper_case_p(string_utilities.first_char(clean_name))) {
            clean_name = string_utilities.downcase_leading(clean_name);
        }
        return clean_name;
    }

    public static SubLObject owl_pred_cyc_name_base(final SubLObject external_name) {
        final SubLObject cyc_name_base = (NIL != nonlocal_owl_term_reference_p(external_name)) ? third(external_name) : external_name;
        return cyc_name_base;
    }

    public static SubLObject owl_find_or_create_pred_arg_isa(final SubLObject cols, final SubLObject import_parameters) {
        SubLObject arg_isa_terms = NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject arg_isa_name = NIL;
        arg_isa_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != owl_external_value_specification_union_p(arg_isa_name)) {
                arg_isa_terms = cons(owl_find_or_create_pred_arg_isa(owl_external_value_specification_union_names(arg_isa_name), import_parameters), arg_isa_terms);
            } else
                if (NIL == arg_isa_name) {
                    if (NIL != owl_utilities.owl_warnP()) {
                        Errors.warn($str339$Got_null_arg_isa_name_in__S, cols);
                    }
                } else {
                    arg_isa_terms = cons(owl_find_or_create_term_for_class(arg_isa_name, import_parameters), arg_isa_terms);
                }

            cdolist_list_var = cdolist_list_var.rest();
            arg_isa_name = cdolist_list_var.first();
        } 
        return owl_term_union(arg_isa_terms, import_parameters);
    }

    public static SubLObject xml_schema_class_uris_internal() {
        return ask_utilities.query_template($list341, $list342, $$OWLMappingMt, $list343);
    }

    public static SubLObject xml_schema_class_uris() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return xml_schema_class_uris_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, XML_SCHEMA_CLASS_URIS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), XML_SCHEMA_CLASS_URIS, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, XML_SCHEMA_CLASS_URIS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(xml_schema_class_uris_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_find_or_create_term_for_class(final SubLObject specification, SubLObject import_parameters) {
        if (import_parameters == UNPROVIDED) {
            import_parameters = $owl_import_parameters$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != owl_restriction_p(specification)) {
            return find_or_create_owl_class_from_restriction(specification, import_parameters, UNPROVIDED);
        }
        if ((NIL != cycl_utilities.expression_find_if(CONSTANT_P, specification, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if(KEYWORDP, specification, UNPROVIDED, UNPROVIDED))) {
            return specification;
        }
        if ((NIL != pattern_match.tree_matches_pattern(specification, $list346)) && (NIL != list_utilities.alist_has_keyP(xml_schema_class_uris(), third(specification), symbol_function(EQUAL)))) {
            return list_utilities.alist_lookup_without_values(xml_schema_class_uris(), third(specification), symbol_function(EQUAL), UNPROVIDED);
        }
        SubLObject v_term = NIL;
        if (specification.isString() && (NIL == xml_parsing_utilities.xml_prefixed_name_p(specification))) {
            final SubLObject info = find_accumulated_owl_definition(specification, $CLASS);
            final SubLObject guid = (NIL != info) ? owl_term_info_plist_lookup(info, $GUID, NIL) : NIL;
            final SubLObject externalid = (NIL != info) ? owl_term_info_plist_lookup(info, $EXTERNALID, NIL) : NIL;
            if (NIL != Guids.guid_string_p(guid)) {
                v_term = constants_high.find_constant_by_guid_string(guid);
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str347$__Found_term_by_guid___S, $str239$__ }), v_term);
                    force_output(UNPROVIDED);
                }
            } else
                if (NIL != kb_utilities.compact_hl_external_id_string_p(externalid)) {
                    v_term = kb_utilities.find_object_by_compact_hl_external_id_string(externalid);
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str348$__Found_term_by_externalID___S, $str239$__ }), v_term);
                        force_output(UNPROVIDED);
                    }
                }

        }
        if (NIL == v_term) {
            final SubLObject class_type = $const349$owl_Class;
            v_term = owl_find_or_create_term_from_specification(specification, class_type, import_parameters);
        }
        return v_term;
    }

    public static SubLObject owl_uri_from_prefix(final SubLObject prefix, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        SubLObject uri = owl_import_parameters_lookup_namespace(prefix, import_parameters);
        if (NIL == uri) {
            final SubLObject var = $sym350$_URI;
            final SubLObject sentence = list($$standardPrefixForURI, prefix, var);
            final SubLObject result = ask_utilities.query_variable(var, sentence, $$OWLMappingMt, $list352);
            SubLObject result_string = (NIL != result) ? result.first() : NIL;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(result_string, $list353);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject string_arg = result_string = list_utilities.alist_lookup_without_values(v_bindings, STRING_ARG, UNPROVIDED, UNPROVIDED);
            }
            if (result_string.isString()) {
                result_string = uri = string_utilities.post_remove(result_string, $str216$_, UNPROVIDED);
            }
        }
        return uri;
    }

    public static SubLObject owl_find_or_create_term_of_type_internal(final SubLObject external_name, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != xml_parsing_utilities.xml_prefixed_name_p(external_name)) {
            final SubLObject prefix = xml_parsing_utilities.xml_prefixed_name_namespace(external_name);
            final SubLObject local_name = xml_parsing_utilities.xml_prefixed_name_local_name(external_name);
            SubLObject uri = owl_uri_from_prefix(prefix, import_parameters);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == web_utilities.uri_p(uri, UNPROVIDED))) {
                Errors.error($str356$Couldn_t_find_URI_for_namespace__, prefix);
            }
            if (string_utilities.last_char(uri).eql(CHAR_hash)) {
                uri = string_utilities.remove_last_char(uri, UNPROVIDED);
            }
            return owl_find_or_create_term_of_type(list($NONLOCAL, uri, local_name), type, import_parameters);
        }
        if (NIL != owl_external_value_specification_union_p(external_name)) {
            SubLObject components = NIL;
            SubLObject cdolist_list_var = owl_external_value_specification_union_names(external_name);
            SubLObject name = NIL;
            name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_class = owl_find_or_create_term_of_type(name, type, import_parameters);
                assert NIL != fort_types_interface.collection_p(v_class) : "fort_types_interface.collection_p(v_class) " + "CommonSymbols.NIL != fort_types_interface.collection_p(v_class) " + v_class;
                components = cons(v_class, components);
                cdolist_list_var = cdolist_list_var.rest();
                name = cdolist_list_var.first();
            } 
            return owl_term_union(components, import_parameters);
        }
        if (NIL != nonlocal_owl_term_reference_p(external_name)) {
            return resolve_nonlocal_owl_term_reference(external_name, type, import_parameters);
        }
        if (NIL != node_id_specification_p(external_name)) {
            return try_to_resolve_node_id_specification(external_name);
        }
        if ((!external_name.isString()) && (NIL == nonlocal_owl_term_reference_p(external_name))) {
            if (NIL != owl_utilities.owl_warnP()) {
                Errors.warn($str357$Can_t_find_or_create_term_of_type, type, external_name);
            }
            return NIL;
        }
        if (NIL != find_if(CONTROL_CHAR_P, external_name, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str359$external_name_appears_to_contain_, external_name);
        }
        if (NIL != xml_parsing_utilities.xml_prefixed_name_p(external_name)) {
            Errors.warn($str360$external_name_appears_to_contain_, external_name);
        }
        final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        final SubLObject v_term = owl_find_or_create_term_of_type_in_ontology(external_name, type, ontology, import_parameters, UNPROVIDED);
        return v_term;
    }

    public static SubLObject owl_find_or_create_term_of_type(final SubLObject external_name, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_find_or_create_term_of_type_internal(external_name, type, import_parameters);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_FIND_OR_CREATE_TERM_OF_TYPE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_FIND_OR_CREATE_TERM_OF_TYPE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_FIND_OR_CREATE_TERM_OF_TYPE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(external_name, type, import_parameters);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (external_name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && import_parameters.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_find_or_create_term_of_type_internal(external_name, type, import_parameters)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(external_name, type, import_parameters));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject owl_find_or_create_term_for_class_in_ontology(final SubLObject name, final SubLObject ontology, final SubLObject import_parameters) {
        return owl_find_or_create_term_of_type_in_ontology(name, $$OWLClass, ontology, import_parameters, UNPROVIDED);
    }

    public static SubLObject owl_find_or_create_term_of_type_in_ontology_internal(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters, SubLObject force_creationP) {
        if (force_creationP == UNPROVIDED) {
            force_creationP = $owl_force_new_term_creationP$.getDynamicValue();
        }
        SubLObject v_term = owl_find_term_of_type(external_name, type, import_parameters, ontology);
        if (NIL == v_term) {
            v_term = ((NIL != force_creationP) || (!ontology.equal(owl_import_parameters_ontology(import_parameters)))) ? create_owl_term(external_name, type, ontology, import_parameters) : owl_quasi_term_from_specification(external_name, type, ontology, import_parameters);
        }
        return v_term;
    }

    public static SubLObject owl_find_or_create_term_of_type_in_ontology(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters, SubLObject force_creationP) {
        if (force_creationP == UNPROVIDED) {
            force_creationP = $owl_force_new_term_creationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_find_or_create_term_of_type_in_ontology_internal(external_name, type, ontology, import_parameters, force_creationP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(external_name, type, ontology, import_parameters, force_creationP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (external_name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ontology.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (import_parameters.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && force_creationP.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_find_or_create_term_of_type_in_ontology_internal(external_name, type, ontology, import_parameters, force_creationP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(external_name, type, ontology, import_parameters, force_creationP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject create_owl_term(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_prefix = owl_import_parameters_constant_prefix(import_parameters);
        final SubLObject suffix = owl_import_parameters_constant_suffix(import_parameters);
        final SubLObject predicateP = genls.genlP(type, $$Predicate, UNPROVIDED, UNPROVIDED);
        SubLObject name_base = external_name;
        final SubLObject prefix = ((NIL != string_utilities.non_empty_string_p(raw_prefix)) && (NIL != predicateP)) ? string_utilities.downcase_leading(raw_prefix) : string_utilities.upcase_leading(raw_prefix);
        SubLObject v_term = NIL;
        if (NIL != predicateP) {
            name_base = owl_pred_cyc_name_base(external_name);
            if (NIL != string_utilities.empty_string_p(prefix)) {
                name_base = string_utilities.downcase_leading(name_base);
            }
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(owl_import_parameters_cyclist(import_parameters));
            v_term = owl_create_new_constant(name_base, list(type), $$UniversalVocabularyMt, prefix, suffix, makeBoolean(NIL == predicateP));
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        owl_assert(list($$quotedIsa, v_term, find_or_create_term_type_for_ontology(ontology, UNPROVIDED)), $$BookkeepingMt, import_parameters);
        assert_synonymous_external_concept(v_term, ontology, external_name, import_parameters);
        if (NIL != owl_import_parameters_import_term(import_parameters)) {
            owl_utilities.note_term_acted_on_during_import(v_term, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        }
        return v_term;
    }

    public static SubLObject assert_synonymous_external_concept(final SubLObject v_term, final SubLObject ontology, final SubLObject unprefixed_external_name, final SubLObject import_parameters) {
        return owl_assert(get_synonymous_external_concept_sentence(v_term, ontology, unprefixed_external_name, import_parameters), owl_import_parameters_ontology_context(import_parameters), import_parameters);
    }

    public static SubLObject get_synonymous_external_concept_sentence(final SubLObject v_term, final SubLObject ontology, final SubLObject unprefixed_external_name, final SubLObject import_parameters) {
        assert NIL != stringp(unprefixed_external_name) : "Types.stringp(unprefixed_external_name) " + "CommonSymbols.NIL != Types.stringp(unprefixed_external_name) " + unprefixed_external_name;
        final SubLObject prefixP = owl_import_parameters_prefix_external_namesP(import_parameters);
        final SubLObject external_name = (NIL != prefixP) ? prefix_external_owl_name(unprefixed_external_name, ontology, import_parameters) : unprefixed_external_name;
        final SubLObject ontology_to_assert = (NIL != prefixP) ? owl_import_parameters_ontology(import_parameters) : ontology;
        return make_ternary_formula($$synonymousExternalConcept, v_term, ontology_to_assert, external_name);
    }

    public static SubLObject prefix_external_owl_name(final SubLObject unprefixed_external_name, final SubLObject ontology, final SubLObject import_parameters) {
        final SubLObject uri = uri_for_owl_ontology(ontology, import_parameters);
        SubLObject prefix = (uri.isString() && (NIL != owl_import_parameters_abbreviate_prefixesP(import_parameters))) ? try_to_abbreviate_owl_uri(uri, import_parameters) : NIL;
        if (NIL == uri) {
            prefix = $str92$;
        } else
            if (NIL == prefix) {
                prefix = cconcatenate(uri, $str216$_);
            } else
                if (!CHAR_colon.eql(string_utilities.last_char(prefix))) {
                    prefix = cconcatenate(prefix, $str366$_);
                }


        return cconcatenate(prefix, unprefixed_external_name);
    }

    public static SubLObject uri_for_owl_ontology(final SubLObject ontology, final SubLObject import_parameters) {
        final SubLObject el_ontology = cycl_utilities.hl_to_el(ontology);
        return el_ontology.equal(cycl_utilities.hl_to_el(owl_import_parameters_ontology(import_parameters))) ? owl_import_parameters_base_uri(import_parameters) : get_uri_for_owl_ontology(el_ontology);
    }

    public static SubLObject get_uri_for_owl_ontology(final SubLObject ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(ontology, $list367);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject arg1 = list_utilities.alist_lookup_without_values(v_bindings, ARG1, UNPROVIDED, UNPROVIDED);
            return stringify_uri(arg1);
        }
        final SubLObject sentence = listS($$owlDefiningOntologyURI, ontology, $list370);
        final SubLObject mt = $$OWLMappingMt;
        final SubLObject result = ask_utilities.query_variable($sym350$_URI, sentence, mt, $list371);
        SubLObject uri = NIL;
        if (NIL != list_utilities.non_empty_list_p(result)) {
            uri = stringify_uri(result.first());
        }
        return uri;
    }

    public static SubLObject stringify_uri(final SubLObject uri) {
        if (uri.isString()) {
            return uri;
        }
        if (((NIL != cycl_grammar.cycl_nat_p(uri)) && cycl_utilities.nat_arg1(uri, UNPROVIDED).isString()) && ONE_INTEGER.eql(cycl_utilities.nat_arity(uri, UNPROVIDED))) {
            return cycl_utilities.nat_arg1(uri, UNPROVIDED);
        }
        return princ_to_string(uri);
    }

    public static SubLObject try_to_abbreviate_owl_uri_internal(final SubLObject uri, final SubLObject import_parameters) {
        assert NIL != stringp(uri) : "Types.stringp(uri) " + "CommonSymbols.NIL != Types.stringp(uri) " + uri;
        return try_to_abbreviate_owl_uri_recursive(uri, owl_import_parameters_ontology(import_parameters), NIL);
    }

    public static SubLObject try_to_abbreviate_owl_uri(final SubLObject uri, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return try_to_abbreviate_owl_uri_internal(uri, import_parameters);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRY_TO_ABBREVIATE_OWL_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRY_TO_ABBREVIATE_OWL_URI, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRY_TO_ABBREVIATE_OWL_URI, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(uri, import_parameters);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && import_parameters.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(try_to_abbreviate_owl_uri_internal(uri, import_parameters)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(uri, import_parameters));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject load_namespace_transcripts() {
        operation_communication.load_transcript_file($str373$_cyc_top_transcripts_0953_jonny2_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        operation_communication.load_transcript_file($str374$_cyc_top_transcripts_0953_vela_20, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        operation_communication.load_transcript_file($str375$_cyc_top_transcripts_0953_vela_20, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        operation_communication.load_transcript_file($str376$_cyc_top_transcripts_0953_jonny2_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        operation_communication.load_transcript_file($str377$_cyc_top_transcripts_0953_jonny2_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        operation_communication.load_transcript_file($str378$_cyc_top_transcripts_0953_jonny2_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        operation_communication.load_transcript_file($str379$_cyc_top_transcripts_0953_jonny2_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject try_to_abbreviate_owl_uri_recursive(final SubLObject uri, final SubLObject ontology, final SubLObject recursedP) {
        final SubLObject var = $X;
        SubLObject abbreviation = NIL;
        SubLObject sentence = list($$or, list($$nameSpacePrefixForSKS, ontology, var, uri), list($$nameSpacePrefixForSKS, ontology, var, list($$URIFn, uri)));
        SubLObject result = ask_utilities.query_variable(var, sentence, $$OWLMappingMt, $list384);
        if (NIL != result) {
            abbreviation = result.first();
        }
        if (NIL == abbreviation) {
            sentence = list($$or, list($$standardPrefixForURI, var, uri), list($$standardPrefixForURI, var, list($$URIFn, uri)));
            result = ask_utilities.query_variable(var, sentence, $$OWLMappingMt, $list384);
            if (NIL != result) {
                abbreviation = result.first();
            }
        }
        if ((NIL == abbreviation) && (NIL == recursedP)) {
            abbreviation = (string_utilities.last_char(uri).eql(CHAR_hash)) ? try_to_abbreviate_owl_uri_recursive(string_utilities.remove_last_char(uri, UNPROVIDED), ontology, T) : try_to_abbreviate_owl_uri_recursive(cconcatenate(uri, $str216$_), ontology, T);
        }
        return abbreviation;
    }

    public static SubLObject owl_term_union(final SubLObject terms, final SubLObject import_parameters) {
        assert NIL != list_utilities.non_dotted_list_p(terms) : "list_utilities.non_dotted_list_p(terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(terms) " + terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cycl_term_or_owl_quasi_term_p(elem) : "owl_to_cycl.cycl_term_or_owl_quasi_term_p(elem) " + "CommonSymbols.NIL != owl_to_cycl.cycl_term_or_owl_quasi_term_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return NIL != list_utilities.singletonP(terms) ? list_utilities.only_one(terms) : owl_find_or_create_nat(list($$CollectionUnionFn, make_el_formula($$TheSet, terms, UNPROVIDED)), import_parameters);
    }

    public static SubLObject cycl_term_or_owl_quasi_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_term_p(v_object)) || ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != cycl_utilities.expression_find_if(OWL_QUASI_TERM_P, v_object, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject owl_term_intersection(final SubLObject terms, final SubLObject import_parameters) {
        assert NIL != list_utilities.non_dotted_list_p(terms) : "list_utilities.non_dotted_list_p(terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(terms) " + terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cycl_term_or_owl_quasi_term_p(elem) : "owl_to_cycl.cycl_term_or_owl_quasi_term_p(elem) " + "CommonSymbols.NIL != owl_to_cycl.cycl_term_or_owl_quasi_term_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return NIL != list_utilities.singletonP(terms) ? list_utilities.only_one(terms) : NIL != list_utilities.doubletonP(terms) ? owl_find_or_create_nat(bq_cons($$CollectionIntersection2Fn, terms), import_parameters) : owl_find_or_create_nat(list($$CollectionIntersectionFn, make_el_formula($$TheSet, terms, UNPROVIDED)), import_parameters);
    }

    public static SubLObject owl_term_enumeration(final SubLObject terms, final SubLObject import_parameters) {
        assert NIL != list_utilities.non_dotted_list_p(terms) : "list_utilities.non_dotted_list_p(terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(terms) " + terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cycl_term_or_owl_quasi_term_p(elem) : "owl_to_cycl.cycl_term_or_owl_quasi_term_p(elem) " + "CommonSymbols.NIL != owl_to_cycl.cycl_term_or_owl_quasi_term_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return owl_find_or_create_nat(NIL != list_utilities.singletonP(terms) ? list($$SingletonCollectionFn, list_utilities.only_one(terms)) : bq_cons($$TheCollection, terms), import_parameters);
    }

    public static SubLObject oip_pred_prefix(final SubLObject import_parameters) {
        return string_utilities.downcase_leading(oip_constant_prefix(import_parameters));
    }

    public static SubLObject owl_define_one_pred(final SubLObject pred_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_name = opi_cyc_name(pred_info);
        final SubLObject external_name = owl_pred_info_plist_lookup(pred_info, $EXTERNAL_NAME, UNPROVIDED);
        final SubLObject suffix = owl_import_parameters_constant_suffix(import_parameters);
        SubLObject isas = owl_pred_types_from_info(pred_info, import_parameters);
        final SubLObject defining_mt = $$UniversalVocabularyMt;
        SubLObject unconstrainedP = NIL;
        SubLObject pred = NIL;
        final SubLObject item_var = $$OWLProperty;
        if (NIL == member(item_var, isas, $sym394$SPEC_, symbol_function(IDENTITY))) {
            isas = cons(item_var, isas);
        }
        if (((NIL == member(external_name, $cyc_properties_to_not_import$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) || (!owl_import_parameters_base_uri(import_parameters).isString())) || (NIL == string_utilities.substringP($str294$cyc_com, owl_import_parameters_base_uri(import_parameters), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            pred = owl_find_pred(external_name, import_parameters);
            if (NIL == pred) {
                final SubLObject guid_string = owl_pred_info_plist_lookup(pred_info, $GUID, NIL);
                if (NIL != Guids.guid_string_p(guid_string)) {
                    pred = constants_high.find_constant_by_guid_string(guid_string);
                }
            }
            if (NIL == pred) {
                final SubLObject externalid_string = owl_pred_info_plist_lookup(pred_info, $EXTERNALID, NIL);
                if (NIL != kb_utilities.compact_hl_external_id_string_p(externalid_string)) {
                    pred = kb_utilities.find_object_by_compact_hl_external_id_string(externalid_string);
                }
            }
            if (NIL != pred) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str395$Potentially_adding_assertions_to_, $str239$__ }), pred);
                    force_output(UNPROVIDED);
                }
                SubLObject cdolist_list_var = isas;
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    owl_enqueue_assert(list($$isa, pred, v_isa), defining_mt, import_parameters);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                } 
            }
            if (NIL == pred) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str397$__Creating_predicate_from__S__, $str239$__ }), pred_info);
                    force_output(UNPROVIDED);
                }
                pred = owl_create(pred_name, isas, defining_mt, $str92$, suffix, NIL, import_parameters);
            }
            if (NIL == pred) {
                if (NIL != owl_utilities.owl_warnP()) {
                    Errors.warn($str398$Failed_to_find_or_create_a_predic, pred_name);
                }
            } else {
                unconstrainedP = owl_define_one_pred_internal(pred, pred_info, import_parameters);
            }
        }
        return values(pred, unconstrainedP);
    }

    public static SubLObject owl_pred_types_from_info(final SubLObject pred_info, final SubLObject import_parameters) {
        SubLObject types = NIL;
        SubLObject cdolist_list_var = owl_pred_info_plist_lookup(pred_info, $ISAS, NIL);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_term = owl_find_or_create_term_for_class(v_isa, import_parameters);
            types = cons(isa_term, types);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        if (T.eql(owl_pred_info_plist_lookup(pred_info, $SYMMETRIC_, NIL))) {
            types = cons($const399$owl_SymmetricProperty, types);
        }
        return delete_duplicates(types, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_term_types_from_info(final SubLObject term_info, final SubLObject import_parameters) {
        SubLObject types = NIL;
        SubLObject cdolist_list_var = owl_term_info_plist_lookup(term_info, $ISAS, NIL);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_term = owl_find_or_create_term_for_class(v_isa, import_parameters);
            types = cons(isa_term, types);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return delete_duplicates(types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject owl_define_one_pred_internal(final SubLObject pred, final SubLObject pred_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject range = owl_pred_info_range(pred_info);
        SubLObject external_name = owl_pred_info_plist_lookup(pred_info, $EXTERNAL_NAME, UNPROVIDED);
        SubLObject ontology = oip_ontology(import_parameters);
        final SubLObject ontology_context = owl_import_parameters_ontology_context(import_parameters);
        SubLObject unconstrainedP = NIL;
        owl_enqueue_assert(list($$quotedIsa, pred, oip_quoted_isa(import_parameters)), $$BookkeepingMt, import_parameters);
        if (NIL != nonlocal_owl_term_reference_p(external_name)) {
            SubLObject current;
            final SubLObject datum = current = external_name.rest();
            SubLObject uri = NIL;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list400);
            uri = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list400);
            name = current.first();
            current = current.rest();
            if (NIL == current) {
                ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, UNPROVIDED);
                external_name = name;
            } else {
                cdestructuring_bind_error(datum, $list400);
            }
        }
        assert_synonymous_external_concept(pred, ontology, external_name, import_parameters);
        if (NIL != owl_pred_info_domains(pred_info)) {
            final SubLObject pred_arg1isa = owl_find_or_create_pred_arg_isa(owl_pred_info_domains(pred_info), import_parameters);
            owl_enqueue_assert(list($const401$rdfs_domain, pred, pred_arg1isa), ontology_context, import_parameters);
        } else {
            owl_enqueue_assert(listS($const401$rdfs_domain, pred, $list402), ontology_context, import_parameters);
            unconstrainedP = T;
        }
        final SubLObject pred_arg2isa = owl_arg2isa_from_range(range, import_parameters);
        if (NIL != pred_arg2isa) {
            owl_enqueue_assert(list($const403$rdfs_range, pred, pred_arg2isa), ontology_context, import_parameters);
        } else {
            owl_enqueue_assert(listS($const403$rdfs_range, pred, $list402), ontology_context, import_parameters);
            unconstrainedP = T;
        }
        if (NIL != owl_pred_info_comment(pred_info)) {
            owl_enqueue_assert(list($const112$rdfs_comment, pred, owl_pred_info_comment(pred_info)), ontology_context, import_parameters);
        }
        SubLObject cdolist_list_var = owl_pred_info_plist_lookup(pred_info, $LABEL, NIL);
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert_owl_label(pred, value, import_parameters);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        final SubLObject genl_property_name = owl_pred_info_plist_lookup(pred_info, $GENL_PROPERTY, NIL);
        final SubLObject genl_property = (NIL != genl_property_name) ? owl_find_pred(genl_property_name, import_parameters) : NIL;
        if (NIL != genl_property) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str404$Asserting_genl_property__S_of__S, $str239$__ }), genl_property, pred);
                force_output(UNPROVIDED);
            }
            owl_enqueue_assert(list($const405$rdfs_subPropertyOf, pred, genl_property), ontology_context, import_parameters);
        } else
            if (NIL != genl_property_name) {
                owl_note_spec_property(pred, genl_property_name);
            }

        cdolist_list_var = owl_lookup_spec_properties(external_name);
        SubLObject spec_property = NIL;
        spec_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str406$Asserting_spec_property__S_of__S, $str239$__ }), spec_property, pred);
                force_output(UNPROVIDED);
            }
            owl_enqueue_assert(list($const405$rdfs_subPropertyOf, spec_property, pred), ontology_context, import_parameters);
            cdolist_list_var = cdolist_list_var.rest();
            spec_property = cdolist_list_var.first();
        } 
        if (!$$InverseBinaryPredicateFn.eql(cycl_utilities.nat_functor(pred))) {
            SubLObject inverse = owl_pred_info_plist_lookup(pred_info, $INVERSE, NIL);
            if (NIL != inverse) {
                if (NIL != nonlocal_owl_term_reference_p(inverse)) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = inverse.rest();
                    SubLObject uri2 = NIL;
                    SubLObject name2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list400);
                    uri2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list400);
                    name2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        ontology = find_or_create_owl_ontology_for_uri(uri2, import_parameters, UNPROVIDED);
                        inverse = name2;
                    } else {
                        cdestructuring_bind_error(datum2, $list400);
                    }
                }
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str408$Asserting_inverse__S_of__S, $str239$__ }), inverse, pred);
                    force_output(UNPROVIDED);
                }
                final SubLObject inverse_term = list($$InverseBinaryPredicateFn, pred);
                final SubLObject existsP = narts_high.find_nart(inverse_term);
                assert_synonymous_external_concept(inverse_term, ontology, inverse, import_parameters);
                if (NIL == existsP) {
                    owl_enqueue_assert(list($$quotedIsa, inverse_term, oip_quoted_isa(import_parameters)), $$BookkeepingMt, import_parameters);
                }
            }
        }
        cdolist_list_var = owl_pred_info_plist_lookup(pred_info, $EQUIVALENT_PROPERTIES, NIL);
        SubLObject equivalent_property_name = NIL;
        equivalent_property_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str409$Asserting_equivalent_property__S_, $str239$__ }), equivalent_property_name, pred);
                force_output(UNPROVIDED);
            }
            final SubLObject equivalent_property_term = owl_find_or_create_term_of_type(equivalent_property_name, $$OWLProperty, import_parameters);
            final SubLObject existsP2 = list_utilities.sublisp_boolean(equivalent_property_term);
            if (NIL == existsP2) {
                Errors.warn($str410$Couldn_t_find_equivalent_property, equivalent_property_name);
            }
            owl_enqueue_assert(list($const411$owl_equivalentProperty, pred, equivalent_property_term), ontology_context, import_parameters);
            cdolist_list_var = cdolist_list_var.rest();
            equivalent_property_name = cdolist_list_var.first();
        } 
        cdolist_list_var = owl_pred_info_plist_lookup(pred_info, $MY_PRED_VALUES, UNPROVIDED);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current3;
            final SubLObject datum3 = current3 = pair;
            SubLObject property_name = NIL;
            SubLObject value2 = NIL;
            destructuring_bind_must_consp(current3, datum3, $list412);
            property_name = current3.first();
            current3 = current3.rest();
            destructuring_bind_must_consp(current3, datum3, $list412);
            value2 = current3.first();
            current3 = current3.rest();
            if (NIL == current3) {
                final SubLObject arg0_pred = owl_find_or_create_term_of_type(property_name, $$OWLProperty, import_parameters);
                final SubLObject sentence = make_binary_formula(arg0_pred, pred, value2);
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str413$__Asserting__S__, $str239$__ }), sentence);
                    force_output(UNPROVIDED);
                }
                owl_enqueue_assert(sentence, ontology_context, import_parameters);
            } else {
                cdestructuring_bind_error(datum3, $list412);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return unconstrainedP;
    }

    public static SubLObject owl_find_pred(final SubLObject pred_name, final SubLObject import_parameters) {
        final SubLObject ontology = oip_ontology(import_parameters);
        return owl_find_term_of_type(pred_name, $$Predicate, import_parameters, ontology);
    }

    public static SubLObject owl_find_collection(final SubLObject class_name, final SubLObject import_parameters) {
        final SubLObject ontology = oip_ontology(import_parameters);
        return owl_find_term_of_type(class_name, $$Collection, import_parameters, ontology);
    }

    public static SubLObject note_owl_found_term(final SubLObject term_name, final SubLObject ontology, final SubLObject v_term) {
        return dictionary.dictionary_enter($owl_found_terms$.getGlobalValue(), list(term_name, ontology), v_term);
    }

    public static SubLObject clear_owl_found_terms() {
        return dictionary.clear_dictionary($owl_found_terms$.getGlobalValue());
    }

    public static SubLObject lookup_owl_found_term(final SubLObject term_name, final SubLObject ontology) {
        final SubLObject key = list(term_name, ontology);
        SubLObject v_term = dictionary.dictionary_lookup_without_values($owl_found_terms$.getGlobalValue(), key, NIL);
        if (NIL != cycl_utilities.expression_find_if($sym415$INVALID_FORT_, v_term, UNPROVIDED, UNPROVIDED)) {
            dictionary.dictionary_remove($owl_found_terms$.getGlobalValue(), list(term_name, ontology));
            v_term = NIL;
        }
        return v_term;
    }

    public static SubLObject owl_find_term_of_type(final SubLObject term_name, final SubLObject type, final SubLObject import_parameters, SubLObject ontology) {
        if (ontology == UNPROVIDED) {
            ontology = oip_ontology(import_parameters);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_term = NIL;
        if (term_name.isString() || (NIL != nonlocal_owl_term_reference_p(term_name))) {
            found_term = lookup_owl_found_term(term_name, ontology);
            if (NIL == found_term) {
                SubLObject local_term_name = term_name;
                SubLObject local_ontology = ontology;
                if (NIL != nonlocal_owl_term_reference_p(term_name)) {
                    SubLObject current;
                    final SubLObject datum = current = term_name.rest();
                    SubLObject uri = NIL;
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list400);
                    uri = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list400);
                    name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        local_ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, UNPROVIDED);
                        local_term_name = name;
                    } else {
                        cdestructuring_bind_error(datum, $list400);
                    }
                }
                found_term = ask_utilities.query_template($sym416$_TERM, list($$synonymousExternalConcept, $sym416$_TERM, local_ontology, local_term_name), $$InferencePSC, $list236).first();
                if (NIL == found_term) {
                    final SubLObject sentence = get_synonymous_external_concept_sentence($sym416$_TERM, local_ontology, local_term_name, import_parameters);
                    found_term = ask_utilities.query_template($sym416$_TERM, sentence, $$InferencePSC, $list236).first();
                }
                if (NIL != found_term) {
                    note_owl_found_term(term_name, ontology, found_term);
                } else
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str417$Couldn_t_find__S, $str239$__ }), term_name);
                        force_output(UNPROVIDED);
                    }

            }
        }
        return found_term;
    }

    public static SubLObject owl_arg2isa_from_range(final SubLObject range, final SubLObject import_parameters) {
        SubLObject pred_arg2isa = NIL;
        if (NIL == range) {
            return NIL;
        }
        if (NIL != owl_external_value_specification_union_p(range)) {
            SubLObject components = NIL;
            SubLObject cdolist_list_var = owl_external_value_specification_union_names(range);
            SubLObject external_term = NIL;
            external_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                components = cons(owl_arg2isa_from_range(external_term, import_parameters), components);
                cdolist_list_var = cdolist_list_var.rest();
                external_term = cdolist_list_var.first();
            } 
            pred_arg2isa = owl_term_union(components, import_parameters);
        } else
            if (NIL != owl_external_value_specification_intersection_p(range)) {
                SubLObject components = NIL;
                SubLObject cdolist_list_var = owl_external_value_specification_intersection_names(range);
                SubLObject external_term = NIL;
                external_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject var;
                    final SubLObject component = var = owl_arg2isa_from_range(external_term, import_parameters);
                    if (NIL != var) {
                        components = cons(var, components);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    external_term = cdolist_list_var.first();
                } 
                if (NIL != list_utilities.non_empty_list_p(components)) {
                    pred_arg2isa = owl_term_intersection(components, import_parameters);
                }
            } else
                if (NIL != owl_external_term_enumeration_p(range)) {
                    SubLObject components = NIL;
                    SubLObject cdolist_list_var = owl_external_term_enumeration_terms(range);
                    SubLObject external_term = NIL;
                    external_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        components = cons(external_term, components);
                        cdolist_list_var = cdolist_list_var.rest();
                        external_term = cdolist_list_var.first();
                    } 
                    pred_arg2isa = owl_term_enumeration(components, import_parameters);
                } else
                    if (range.isString()) {
                        final SubLObject external_name = process_owl_attribute_value(range);
                        pred_arg2isa = owl_find_or_create_pred_arg_isa(list(external_name), import_parameters);
                    } else {
                        pred_arg2isa = owl_find_or_create_term_for_class(range, import_parameters);
                    }



        return pred_arg2isa;
    }

    public static SubLObject note_owl_oe_queue_done(SubLObject owl_oe_queue) {
        if (owl_oe_queue == UNPROVIDED) {
            owl_oe_queue = $owl_oe_queue$.getDynamicValue();
        }
        return owl_oe_queue_enqueue_low($owl_oe_queue_end_marker$.getGlobalValue(), owl_oe_queue, NIL);
    }

    public static SubLObject new_owl_oe_queue() {
        final SubLObject owl_oe_queue = list(NIL, queues.create_queue(UNPROVIDED), current_owl_importer());
        owl_oe_queue_enqueue_low($owl_oe_queue_marker$.getGlobalValue(), owl_oe_queue, NIL);
        $owl_oe_queues$.setGlobalValue(cons(owl_oe_queue, $owl_oe_queues$.getGlobalValue()));
        ensure_owl_oe_daemon_running();
        return owl_oe_queue;
    }

    public static SubLObject owl_oe_queue_modified_flag(final SubLObject owl_oe_queue) {
        return owl_oe_queue.first();
    }

    public static SubLObject set_owl_oe_queue_modified_flag(final SubLObject owl_oe_queue, final SubLObject value) {
        set_nth(ZERO_INTEGER, owl_oe_queue, list_utilities.sublisp_boolean(value));
        return owl_oe_queue;
    }

    public static SubLObject owl_oe_queue_modifiedP(final SubLObject owl_oe_queue) {
        return owl_oe_queue_modified_flag(owl_oe_queue);
    }

    public static SubLObject owl_oe_queue_queue(final SubLObject owl_oe_queue) {
        return second(owl_oe_queue);
    }

    public static SubLObject owl_oe_queue_importer(final SubLObject owl_oe_queue) {
        return third(owl_oe_queue);
    }

    public static SubLObject ensure_owl_oe_daemon_running() {
        if (NIL == valid_process_p($owl_oe_daemon$.getGlobalValue())) {
            launch_owl_oe_queue_daemon();
        }
        return $owl_oe_daemon$.getGlobalValue();
    }

    public static SubLObject launch_owl_oe_queue_daemon() {
        $owl_oe_daemon$.setGlobalValue(new_owl_oe_daemon());
        return $owl_oe_daemon$.getGlobalValue();
    }

    public static SubLObject owl_oe_queue_enqueue(final SubLObject item, SubLObject owl_oe_queue) {
        if (owl_oe_queue == UNPROVIDED) {
            owl_oe_queue = $owl_oe_queue$.getDynamicValue();
        }
        final SubLObject queue = owl_oe_queue_queue(owl_oe_queue);
        if (NIL == queues.queue_find(item, queue, symbol_function(EQUAL), UNPROVIDED)) {
            owl_oe_queue_enqueue_low(item, owl_oe_queue, T);
        }
        return item;
    }

    public static SubLObject owl_oe_queue_reenqueue(final SubLObject item, final SubLObject owl_oe_queue) {
        return owl_oe_queue_enqueue_low(item, owl_oe_queue, NIL);
    }

    public static SubLObject owl_oe_queue_enqueue_low(final SubLObject item, final SubLObject owl_oe_queue, final SubLObject set_modified_flagP) {
        final SubLObject queue = owl_oe_queue_queue(owl_oe_queue);
        queues.enqueue(item, queue);
        if (NIL != set_modified_flagP) {
            set_owl_oe_queue_modified_flag(owl_oe_queue, T);
        }
        return item;
    }

    public static SubLObject owl_node_id_index() {
        if (NIL == dictionary.dictionary_p($owl_node_id_index$.getGlobalValue())) {
            $owl_node_id_index$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return $owl_node_id_index$.getGlobalValue();
    }

    public static SubLObject note_node_id_reference(final SubLObject node_id, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && value.equal(list($NODE_ID, node_id))) {
            Errors.error($str421$Circular_node_id_reference___S___, node_id, value);
        }
        return dictionary.dictionary_enter(owl_node_id_index(), node_id, value);
    }

    public static SubLObject lookup_node_id_reference(final SubLObject node_id) {
        return dictionary.dictionary_lookup_without_values(owl_node_id_index(), node_id, UNPROVIDED);
    }

    public static SubLObject owl_create(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject suffix, final SubLObject initial_case, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(oip_cyclist(import_parameters));
            new_term = owl_create_internal(name, isas, defining_mt, prefix, suffix, initial_case);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return new_term;
    }

    public static SubLObject owl_create_internal(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject suffix, final SubLObject initial_case) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_collections = NIL;
        SubLObject isas_to_postpone = NIL;
        SubLObject new_term = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(defining_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject resolved_isa = (NIL != owl_quasi_term_p(v_isa)) ? resolve_owl_quasi_term(v_isa) : v_isa;
                if (resolved_isa.eql($UNRESOLVED)) {
                    isas_to_postpone = cons(v_isa, isas_to_postpone);
                } else
                    if (NIL == fort_types_interface.isa_collectionP(resolved_isa, UNPROVIDED)) {
                        isas_to_postpone = cons(resolved_isa, isas_to_postpone);
                    } else {
                        final SubLObject item_var = resolved_isa;
                        if (NIL == member(item_var, known_collections, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            known_collections = cons(item_var, known_collections);
                        }
                    }

                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        new_term = owl_create_new_constant(name, known_collections, defining_mt, prefix, suffix, initial_case);
        assert NIL != constant_p(new_term) : "constant_handles.constant_p(new_term) " + "CommonSymbols.NIL != constant_handles.constant_p(new_term) " + new_term;
        SubLObject cdolist_list_var2 = isas_to_postpone;
        SubLObject v_isa2 = NIL;
        v_isa2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str423$Postponing__isa__S__S__because__S, $str239$__ }), new SubLObject[]{ new_term, v_isa2, v_isa2 });
                force_output(UNPROVIDED);
            }
            owl_enqueue_assert(list($$isa, new_term, v_isa2), defining_mt, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_isa2 = cdolist_list_var2.first();
        } 
        return new_term;
    }

    public static SubLObject owl_create_new_constant(SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject suffix, final SubLObject capitalizeP) {
        SubLObject new_constant = NIL;
        SubLObject basic_type_doneP = NIL;
        if (NIL != string_utilities.non_empty_string_p(suffix)) {
            name = cconcatenate(name, suffix);
        }
        if (NIL != owl_utilities.owl_importer_use_rkfP()) {
            new_constant = rkf_term_utilities.create_new_constant(name, isas, NIL, defining_mt, prefix, NIL, capitalizeP, T, UNPROVIDED);
        }
        if (NIL == new_constant) {
            new_constant = owl_create_new_constant_non_rkf(name, isas, defining_mt, prefix, capitalizeP);
        }
        if (NIL == basic_type_doneP) {
            SubLObject csome_list_var = $list424;
            SubLObject basic_type = NIL;
            basic_type = csome_list_var.first();
            while ((NIL == basic_type_doneP) && (NIL != csome_list_var)) {
                if (NIL != find(basic_type, isas, $sym394$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    owl_assert_low(make_binary_formula($$isa, new_constant, basic_type), $$UniversalVocabularyMt);
                    basic_type_doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                basic_type = csome_list_var.first();
            } 
        }
        if (NIL == basic_type_doneP) {
            owl_assert_low(make_binary_formula($$isa, new_constant, $$Thing), $$UniversalVocabularyMt);
        }
        return new_constant;
    }

    public static SubLObject owl_create_new_constant_non_rkf(final SubLObject name, final SubLObject known_collections, final SubLObject defining_mt, final SubLObject prefix, final SubLObject capitalizeP) {
        final SubLObject full_name = list_utilities.remove_if_not(VALID_CONSTANT_NAME_CHAR_P, NIL != string_utilities.non_empty_string_p(prefix) ? cconcatenate(prefix, new SubLObject[]{ $str426$_, name }) : name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_constant = ke.ke_create_now(NIL != capitalizeP ? string_utilities.upcase_leading(full_name) : string_utilities.downcase_leading(full_name), UNPROVIDED);
        SubLObject cdolist_list_var = known_collections;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            owl_assert_low(make_binary_formula($$isa, new_constant, v_isa), defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return new_constant;
    }

    public static SubLObject owl_enqueue_assert(final SubLObject quasi_sentence, final SubLObject mt, SubLObject import_parameters) {
        if (import_parameters == UNPROVIDED) {
            import_parameters = $owl_import_parameters$.getDynamicValue();
        }
        assert NIL != owl_import_parameters_p(import_parameters) : "owl_to_cycl.owl_import_parameters_p(import_parameters) " + "CommonSymbols.NIL != owl_to_cycl.owl_import_parameters_p(import_parameters) " + import_parameters;
        if ((NIL != cycl_utilities.expression_find_if(OWL_QUASI_TERM_P, quasi_sentence, UNPROVIDED, UNPROVIDED)) || (NIL == wff.el_wff_assertibleP(quasi_sentence, mt, UNPROVIDED))) {
            final SubLObject assert_spec = list($ASSERT, quasi_sentence, mt, import_parameters);
            owl_oe_queue_enqueue(assert_spec, UNPROVIDED);
        } else {
            owl_assert(quasi_sentence, mt, import_parameters);
        }
        return T;
    }

    public static SubLObject new_owl_oe_daemon() {
        final SubLObject daemon = process_utilities.make_cyc_server_process($$$OWL_OE_Daemon, OWL_OE_DAEMON_RUN);
        return daemon;
    }

    public static SubLObject owl_oe_queue_empty_p(final SubLObject owl_oe_queue) {
        return sublisp_null(queues.queue_find_if(CONSP, owl_oe_queue_queue(owl_oe_queue), UNPROVIDED));
    }

    public static SubLObject wait_for_owl_oe_queue_to_empty(SubLObject owl_oe_queue) {
        if (owl_oe_queue == UNPROVIDED) {
            owl_oe_queue = $owl_oe_queue$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject starting_size = queues.queue_size(owl_oe_queue_queue(owl_oe_queue));
        final SubLObject message = format(NIL, $str431$Waiting_for__D_enqueued_operation, starting_size);
        note_owl_import_section_started();
        if (starting_size.isPositive()) {
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    while (NIL == owl_oe_queue_empty_p(owl_oe_queue)) {
                        final SubLObject number_done = subtract(starting_size, queues.queue_size(owl_oe_queue_queue(owl_oe_queue)));
                        final SubLObject percent_done = divide(number_done, starting_size);
                        note_percent_progress(number_done, starting_size);
                        note_owl_import_section_progress(percent_done);
                        sleep($float$0_5);
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        note_owl_import_section_done();
        return NIL;
    }

    public static SubLObject owl_oe_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (NIL == list_utilities.empty_list_p($owl_oe_queues$.getGlobalValue())) {
            SubLObject cdolist_list_var = copy_list($owl_oe_queues$.getGlobalValue());
            SubLObject owl_oe_queue = NIL;
            owl_oe_queue = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject queue = owl_oe_queue_queue(owl_oe_queue);
                final SubLObject _prev_bind_0 = $owl_importer$.currentBinding(thread);
                try {
                    $owl_importer$.bind(owl_oe_queue_importer(owl_oe_queue), thread);
                    final SubLObject item = queues.dequeue(queue);
                    final SubLObject queue_closedP = queues.queue_find($owl_oe_queue_end_marker$.getGlobalValue(), queue, UNPROVIDED, UNPROVIDED);
                    SubLObject oe_performedP = NIL;
                    if (item.eql($owl_oe_queue_end_marker$.getGlobalValue())) {
                        if (NIL != owl_oe_queue_empty_p(owl_oe_queue)) {
                            queues.clear_queue(queue);
                            $owl_oe_queues$.setGlobalValue(remove(owl_oe_queue, $owl_oe_queues$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }
                    } else
                        if (item.eql($owl_oe_queue_marker$.getGlobalValue())) {
                            if (NIL != owl_oe_queue_modifiedP(owl_oe_queue)) {
                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str433$__Finished_pass_through_queue__Si, $str239$__ }), queues.queue_size(queue));
                                    force_output(UNPROVIDED);
                                }
                                force_output(UNPROVIDED);
                                set_owl_oe_queue_modified_flag(owl_oe_queue, NIL);
                            } else
                                if (NIL != owl_oe_queue_empty_p(owl_oe_queue)) {
                                    if (NIL != list_utilities.singletonP($owl_oe_queues$.getGlobalValue())) {
                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str434$__OE_queue_is_empty__Zzz___, $str239$__ }));
                                            force_output(UNPROVIDED);
                                        }
                                        sleep(FIVE_INTEGER);
                                    }
                                } else
                                    if (NIL != queue_closedP) {
                                        final SubLObject items_left = list_utilities.remove_if_not(CONSP, queues.queue_elements(queue), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        Errors.warn($str435$Unable_to_perform__D_operation__P, length(items_left), items_left);
                                        SubLObject cdolist_list_var_$69 = items_left;
                                        SubLObject item_$70 = NIL;
                                        item_$70 = cdolist_list_var_$69.first();
                                        while (NIL != cdolist_list_var_$69) {
                                            note_owl_failure(item_$70, UNPROVIDED);
                                            cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                                            item_$70 = cdolist_list_var_$69.first();
                                        } 
                                        queues.clear_queue(queue);
                                        $owl_oe_queues$.setGlobalValue(remove(owl_oe_queue, $owl_oe_queues$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    } else {
                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str436$__Can_t_do_anything_with_queue_no, $str239$__ }));
                                            force_output(UNPROVIDED);
                                        }
                                        sleep(FIVE_INTEGER);
                                    }


                        } else
                            if (NIL != pattern_match.tree_matches_pattern(item, $list437)) {
                                final SubLObject _prev_bind_0_$71 = $owl_allow_find_via_creationP$.currentBinding(thread);
                                try {
                                    $owl_allow_find_via_creationP$.bind(queue_closedP, thread);
                                    oe_performedP = owl_oe_daemon_assert(item);
                                } finally {
                                    $owl_allow_find_via_creationP$.rebind(_prev_bind_0_$71, thread);
                                }
                            }


                    if (NIL != oe_performedP) {
                        if (NIL == owl_oe_queue_modifiedP(owl_oe_queue)) {
                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str438$__Noting_OE_performed___S__, $str239$__ }), item);
                                force_output(UNPROVIDED);
                            }
                            force_output(UNPROVIDED);
                            set_owl_oe_queue_modified_flag(owl_oe_queue, T);
                        }
                    } else {
                        owl_oe_queue_reenqueue(item, owl_oe_queue);
                    }
                } finally {
                    $owl_importer$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                owl_oe_queue = cdolist_list_var.first();
            } 
        } 
        return NIL;
    }

    public static SubLObject note_owl_failure(final SubLObject item, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = owl_failure_message(item);
        if (NIL != $owl_importer$.getDynamicValue(thread)) {
            note_owl_import_problem(item, message);
        } else {
            princ(message, stream);
        }
        return NIL;
    }

    public static SubLObject owl_failure_message(final SubLObject item) {
        SubLObject message = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            if (NIL != pattern_match.tree_matches_pattern(item, $list437)) {
                SubLObject current;
                final SubLObject datum = current = item.rest();
                SubLObject quasi_formula = NIL;
                SubLObject mt = NIL;
                SubLObject import_parameters = NIL;
                destructuring_bind_must_consp(current, datum, $list439);
                quasi_formula = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list439);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list439);
                import_parameters = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var = cycl_utilities.expression_gather(quasi_formula, OWL_QUASI_TERM_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject quasi_term = NIL;
                    quasi_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ($UNRESOLVED.eql(resolve_owl_quasi_term(quasi_term))) {
                            format(stream, $str440$__Failed_to_resolve__S__, quasi_term);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        quasi_term = cdolist_list_var.first();
                    } 
                    final SubLObject resolved_formula = cycl_utilities.expression_transform(quasi_formula, OWL_QUASI_TERM_P, RESOLVE_OWL_QUASI_TERM, UNPROVIDED, UNPROVIDED);
                    if (NIL == cycl_utilities.expression_find($UNRESOLVED, resolved_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        final SubLObject why_not_wff = wff.explain_why_not_wff_assert(resolved_formula, mt, UNPROVIDED);
                        if (NIL != why_not_wff) {
                            print(why_not_wff, stream);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list439);
                }
            } else {
                format(stream, $str442$Problem_performing__S, item);
            }
            message = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return message;
    }

    public static SubLObject owl_oe_daemon_assert(final SubLObject item) {
        SubLObject successP = NIL;
        SubLObject current;
        final SubLObject datum = current = item.rest();
        SubLObject quasi_formula = NIL;
        SubLObject mt = NIL;
        SubLObject import_parameters = NIL;
        destructuring_bind_must_consp(current, datum, $list439);
        quasi_formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list439);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list439);
        import_parameters = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject resolvedP = sublisp_null(cycl_utilities.expression_find_if(OWL_QUASI_TERM_P, quasi_formula, UNPROVIDED, UNPROVIDED));
            if (NIL == resolvedP) {
                quasi_formula = cycl_utilities.expression_transform(quasi_formula, OWL_QUASI_TERM_P, RESOLVE_OWL_QUASI_TERM, UNPROVIDED, UNPROVIDED);
                resolvedP = sublisp_null(cycl_utilities.expression_find($UNRESOLVED, quasi_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            if (NIL != resolvedP) {
                successP = owl_assert(quasi_formula, mt, import_parameters);
            }
        } else {
            cdestructuring_bind_error(datum, $list439);
        }
        return successP;
    }

    public static SubLObject owl_quasi_term_from_specification(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters) {
        return list($OWL_QUASI_TERM, $FIND, external_name, type, ontology, import_parameters);
    }

    public static SubLObject owl_quasi_term_from_node_id(final SubLObject node_id, SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == dictionary_utilities.dictionary_has_keyP(owl_node_id_index(), node_id))) {
            Errors.error($str445$_S_is_not_an_OWL_node_ID_, node_id);
        }
        return list($OWL_QUASI_TERM, $NODE_ID, node_id, type);
    }

    public static SubLObject owl_quasi_term_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list446);
    }

    public static SubLObject resolve_owl_quasi_term(final SubLObject quasi_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = $UNRESOLVED;
        final SubLObject pcase_var = second(quasi_term);
        if (pcase_var.eql($NODE_ID)) {
            final SubLObject result = dictionary.dictionary_lookup_without_values(owl_node_id_index(), third(quasi_term), UNPROVIDED);
            if (NIL != valid_constantP(result, UNPROVIDED)) {
                v_term = result;
            }
        } else
            if (pcase_var.eql($FIND)) {
                SubLObject current;
                final SubLObject datum = current = subseq(quasi_term, TWO_INTEGER, UNPROVIDED);
                SubLObject external_name = NIL;
                SubLObject type = NIL;
                SubLObject ontology = NIL;
                SubLObject import_parameters = NIL;
                destructuring_bind_must_consp(current, datum, $list447);
                external_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list447);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list447);
                ontology = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list447);
                import_parameters = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != owl_external_value_specification_intersection_p(external_name)) {
                        v_term = owl_find_or_create_intersection(external_name, type, import_parameters, T);
                    } else
                        if (NIL != owl_external_value_specification_union_p(external_name)) {
                            v_term = owl_find_or_create_union(external_name, type, import_parameters, T);
                        } else {
                            final SubLObject result2 = (NIL != $owl_allow_find_via_creationP$.getDynamicValue(thread)) ? owl_find_or_create_term_of_type_in_ontology(external_name, type, ontology, import_parameters, T) : owl_find_term_of_type(external_name, type, import_parameters, ontology);
                            if (NIL != result2) {
                                v_term = result2;
                                note_found_term_resolution(quasi_term, v_term);
                            }
                        }

                } else {
                    cdestructuring_bind_error(datum, $list447);
                }
            }

        return v_term;
    }

    public static SubLObject clear_note_found_term_resolution() {
        final SubLObject cs = $note_found_term_resolution_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_note_found_term_resolution(final SubLObject quasi_term, final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($note_found_term_resolution_caching_state$.getGlobalValue(), list(quasi_term, v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject note_found_term_resolution_internal(final SubLObject quasi_term, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str449$__Resolved__S___to__S__, $str239$__ }), quasi_term, v_term);
            force_output(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject note_found_term_resolution(final SubLObject quasi_term, final SubLObject v_term) {
        SubLObject caching_state = $note_found_term_resolution_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NOTE_FOUND_TERM_RESOLUTION, $note_found_term_resolution_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(quasi_term, v_term);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (quasi_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_term.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(note_found_term_resolution_internal(quasi_term, v_term)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(quasi_term, v_term));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject owl_assert_internal(SubLObject formula, final SubLObject mt, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_import_parameters_encoding(import_parameters).equalp($str86$utf_8) && (NIL != cycl_utilities.expression_find_if(NON_ASCII_STRING_P, formula, UNPROVIDED, UNPROVIDED))) {
            final SubLObject transformed = cycl_utilities.expression_transform(formula, NON_ASCII_STRING_P, NON_ASCII_STRING_TO_UNICODE, UNPROVIDED, UNPROVIDED);
            if (NIL == cycl_utilities.expression_find_if(NON_ASCII_STRING_P, transformed, UNPROVIDED, UNPROVIDED)) {
                formula = transformed;
            }
        }
        SubLObject successP = NIL;
        if (NIL != czer_meta.el_asserted_assertion_specP(formula, mt)) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str454$Already_know__S___in__S, $str239$__ }), formula, mt);
                force_output(UNPROVIDED);
            }
            successP = T;
        } else {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(NIL, thread);
                operation_communication.set_the_cyclist(oip_cyclist(import_parameters));
                thread.resetMultipleValues();
                final SubLObject assertedP = owl_assert_low(formula, mt);
                final SubLObject problematic_formula = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != assertedP) {
                    successP = T;
                } else
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str455$Failed_to_assert__S__, $str239$__ }), problematic_formula);
                        force_output(UNPROVIDED);
                    }

            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != successP) {
            owl_utilities.note_sentence_asserted(formula, mt, owl_import_parameters_import_term(import_parameters));
        }
        return successP;
    }

    public static SubLObject owl_assert(final SubLObject formula, final SubLObject mt, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_assert_internal(formula, mt, import_parameters);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_ASSERT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_ASSERT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_ASSERT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(formula, mt, import_parameters);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && import_parameters.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_assert_internal(formula, mt, import_parameters)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt, import_parameters));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject owl_assert_low(final SubLObject formula, final SubLObject mt) {
        if (NIL != owl_utilities.owl_importer_use_rkfP()) {
            return rkf_assertion_utilities.rkf_assert_with_implicature(formula, mt, T);
        }
        return values(cyc_kernel.cyc_assert_wff(formula, mt, UNPROVIDED), NIL);
    }

    public static SubLObject create_terms_from_owl_data(final SubLObject term_info_list, final SubLObject import_parameters, SubLObject progress_message) {
        if (progress_message == UNPROVIDED) {
            progress_message = $str456$Processing_term_definitions___;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        note_owl_import_section_started();
        if (NIL != list_utilities.non_empty_list_p(term_info_list)) {
            final SubLObject total = length(term_info_list);
            final SubLObject percent_per = divide(ONE_INTEGER, total);
            SubLObject percent_done = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message ? progress_message : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(term_info_list), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = term_info_list;
                    SubLObject term_info = NIL;
                    term_info = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL == dont_reify_owl_termP(term_info, import_parameters)) {
                            owl_define_one_term(term_info, import_parameters);
                        }
                        percent_done = add(percent_done, percent_per);
                        note_owl_import_section_progress(percent_done);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        term_info = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
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
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        note_owl_import_section_done();
        return NIL;
    }

    public static SubLObject dont_reify_owl_termP(final SubLObject term_info, final SubLObject import_parameters) {
        if ((NIL == owl_term_info_cyc_name(term_info)) && (NIL != owl_term_info_plist_lookup(term_info, $NODE_ID, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject owl_define_one_term(final SubLObject term_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_name = owl_term_info_cyc_name(term_info);
        final SubLObject external_name = owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, UNPROVIDED);
        SubLObject isas = owl_term_types_from_info(term_info, import_parameters);
        SubLObject v_term = (NIL != external_name) ? owl_find_term_of_type(external_name, isas.first(), import_parameters, UNPROVIDED) : NIL;
        final SubLObject defining_mt = owl_import_parameters_ontology_context(import_parameters);
        final SubLObject suffix = owl_import_parameters_constant_suffix(import_parameters);
        if (NIL == forts.fort_p(v_term)) {
            v_term = owl_find_term_from_info(term_info, import_parameters);
        }
        if ((NIL == forts.fort_p(v_term)) && (NIL == term_name)) {
            if (NIL == $create_anonymous_owl_termsP$.getDynamicValue(thread)) {
                return NIL;
            }
            final SubLObject v_isa = find_if(CONSTANT_P, isas, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject type = (NIL != v_isa) ? v_isa : $$Thing;
            term_name = cconcatenate($str457$Anonymous_, constants_high.constant_name(type));
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str458$__Creating__S_____, $str239$__ }), term_name);
                force_output(UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = owl_term_info_plist_lookup(term_info, $ISAS, NIL);
        SubLObject v_isa2 = NIL;
        v_isa2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_term = owl_find_or_create_term_for_class(v_isa2, import_parameters);
            isas = cons(isa_term, isas);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa2 = cdolist_list_var.first();
        } 
        if (NIL != forts.fort_p(v_term)) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str459$Potentially_adding_assertions_to_, $str239$__ }), v_term);
                force_output(UNPROVIDED);
            }
            cdolist_list_var = isas;
            v_isa2 = NIL;
            v_isa2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                owl_enqueue_assert(list($$isa, v_term, v_isa2), defining_mt, import_parameters);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa2 = cdolist_list_var.first();
            } 
        }
        if (NIL == forts.fort_p(v_term)) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str460$__Defining_term_from__S__, $str239$__ }), term_info);
                force_output(UNPROVIDED);
            }
            v_term = owl_create(term_name, isas, defining_mt, $str92$, suffix, $UPCASE, import_parameters);
        }
        if (NIL == v_term) {
            if (NIL != owl_utilities.owl_warnP()) {
                Errors.warn($str461$Failed_to_find_or_create_a_term_w, term_name);
            }
        } else {
            owl_define_one_term_internal(v_term, defining_mt, term_info, import_parameters);
            owl_utilities.note_term_acted_on_during_import(v_term, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        }
        return v_term;
    }

    public static SubLObject owl_find_term_from_info(final SubLObject term_info, final SubLObject import_parameters) {
        SubLObject v_term = NIL;
        final SubLObject guid_string = owl_term_info_plist_lookup(term_info, $GUID, NIL);
        final SubLObject externalid_string = owl_term_info_plist_lookup(term_info, $EXTERNALID, NIL);
        if (NIL != Guids.guid_string_p(guid_string)) {
            v_term = constants_high.find_constant_by_guid_string(guid_string);
        } else
            if (NIL != kb_utilities.compact_hl_external_id_string_p(externalid_string)) {
                v_term = kb_utilities.find_object_by_compact_hl_external_id_string(externalid_string);
            } else
                if (NIL != kb_utilities.hl_external_id_string_p(externalid_string)) {
                    v_term = kb_utilities.find_object_by_hl_external_id_string(externalid_string);
                }


        if (NIL == v_term) {
            SubLObject csome_list_var;
            SubLObject term_name;
            for (csome_list_var = owl_term_info_plist_lookup(term_info, $EQUIVALENT_CLASSES, NIL), term_name = NIL, term_name = csome_list_var.first(); (NIL == v_term) && (NIL != csome_list_var); v_term = owl_find_or_create_term_for_class(term_name, import_parameters) , csome_list_var = csome_list_var.rest() , term_name = csome_list_var.first()) {
            }
        }
        if (NIL == v_term) {
            final SubLObject component_names = owl_term_info_plist_lookup(term_info, $UNION_OF, NIL);
            if (NIL != component_names) {
                SubLObject components = NIL;
                SubLObject cdolist_list_var = component_names;
                SubLObject name = NIL;
                name = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject v_class = owl_find_or_create_term_for_class(name, import_parameters);
                    components = cons(v_class, components);
                    cdolist_list_var = cdolist_list_var.rest();
                    name = cdolist_list_var.first();
                } 
                v_term = owl_term_union(components, import_parameters);
            }
        }
        return v_term;
    }

    public static SubLObject owl_define_one_term_internal(final SubLObject v_term, final SubLObject defining_mt, final SubLObject term_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject external_name = owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, UNPROVIDED);
        SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        owl_enqueue_assert(list($$quotedIsa, v_term, owl_import_parameters_quoted_isa(import_parameters)), $$BookkeepingMt, import_parameters);
        if (NIL != nonlocal_owl_term_reference_p(external_name)) {
            SubLObject current;
            final SubLObject datum = current = external_name.rest();
            SubLObject uri = NIL;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list400);
            uri = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list400);
            name = current.first();
            current = current.rest();
            if (NIL == current) {
                ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, UNPROVIDED);
                external_name = name;
            } else {
                cdestructuring_bind_error(datum, $list400);
            }
        }
        if (external_name.isString()) {
            assert_synonymous_external_concept(v_term, ontology, external_name, import_parameters);
        }
        if (NIL != owl_term_info_comment(term_info)) {
            owl_enqueue_assert(list($const112$rdfs_comment, v_term, owl_term_info_comment(term_info)), defining_mt, import_parameters);
        }
        SubLObject superclasses = owl_term_info_superclasses(term_info);
        if (NIL != list_utilities.empty_list_p(superclasses)) {
            superclasses = cons(owl_utilities.owl_name($$$Thing), superclasses);
            owl_utilities.note_term_acted_on_during_import($const465$owl_Thing, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        }
        SubLObject cdolist_list_var = superclasses;
        SubLObject genl_class_specification = NIL;
        genl_class_specification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != node_id_specification_p(genl_class_specification)) {
                genl_class_specification = try_to_resolve_node_id_specification(genl_class_specification);
            }
            if ((genl_class_specification.isString() || (NIL != owl_external_value_specification_union_p(genl_class_specification))) || (NIL != nonlocal_owl_term_reference_p(genl_class_specification))) {
                final SubLObject genl_class = owl_find_or_create_term_for_class(genl_class_specification, import_parameters);
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str466$Asserting_genl_class__S_of__S, $str239$__ }), genl_class, v_term);
                    force_output(UNPROVIDED);
                }
                owl_enqueue_assert(list($const467$rdfs_subClassOf, v_term, genl_class), defining_mt, import_parameters);
            } else
                if (NIL != owl_restriction_p(genl_class_specification)) {
                    assert_owl_restriction(v_term, genl_class_specification, defining_mt, import_parameters);
                } else
                    if (NIL != pattern_match.tree_matches_pattern(genl_class_specification, $list468)) {
                        final SubLObject value = second(genl_class_specification);
                        final SubLObject v_class = owl_find_or_create_term_for_class(value, import_parameters);
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str469$Asserting_disjoint_class__S_of__S, $str239$__ }), v_class, v_term);
                            force_output(UNPROVIDED);
                        }
                        owl_enqueue_assert(list($const470$owl_disjointWith, v_class, v_term), defining_mt, import_parameters);
                    } else {
                        Errors.warn($str471$Don_t_know_how_to_handle_supercla, genl_class_specification);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            genl_class_specification = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = owl_term_info_disjoint_classes(term_info);
        SubLObject disjoint_class_specification = NIL;
        disjoint_class_specification = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if ((disjoint_class_specification.isString() || (NIL != owl_external_value_specification_union_p(disjoint_class_specification))) || (NIL != nonlocal_owl_term_reference_p(disjoint_class_specification))) {
                final SubLObject disjoint_class = (NIL != disjoint_class_specification) ? owl_find_or_create_term_for_class(disjoint_class_specification, import_parameters) : NIL;
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str472$Asserting_disjoint___S_and__S, $str239$__ }), disjoint_class, v_term);
                    force_output(UNPROVIDED);
                }
                owl_enqueue_assert(list($const470$owl_disjointWith, v_term, disjoint_class), defining_mt, import_parameters);
            } else {
                Errors.warn($str473$Don_t_know_how_to_handle_disjoint, disjoint_class_specification);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            disjoint_class_specification = cdolist_list_var2.first();
        } 
        SubLObject remainder;
        SubLObject property;
        SubLObject value2;
        SubLObject pcase_var;
        SubLObject cdolist_list_var3;
        SubLObject label_info;
        SubLObject equivalent_class_name;
        SubLObject external_name_$73;
        SubLObject v_class2;
        SubLObject components;
        SubLObject cdolist_list_var4;
        SubLObject name2;
        SubLObject v_class3;
        SubLObject names;
        SubLObject instance;
        SubLObject pair;
        SubLObject current2;
        SubLObject datum2;
        SubLObject property_name;
        SubLObject value_$74;
        SubLObject pred;
        SubLObject sentence;
        for (remainder = NIL, remainder = owl_term_info_plist(term_info); NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value2 = cadr(remainder);
            pcase_var = property;
            if (((!pcase_var.eql($EXTERNAL_NAME)) && (!pcase_var.eql($ISAS))) && (!pcase_var.eql($GUID))) {
                if (!pcase_var.eql($EXTERNALID)) {
                    if (pcase_var.eql($LABEL)) {
                        cdolist_list_var3 = value2;
                        label_info = NIL;
                        label_info = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            assert_owl_label(v_term, label_info, import_parameters);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            label_info = cdolist_list_var3.first();
                        } 
                    } else
                        if (pcase_var.eql($EQUIVALENT_CLASSES)) {
                            cdolist_list_var3 = value2;
                            equivalent_class_name = NIL;
                            equivalent_class_name = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                assert_owl_equivalent_class(v_term, equivalent_class_name, defining_mt, import_parameters);
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                equivalent_class_name = cdolist_list_var3.first();
                            } 
                        } else
                            if (pcase_var.eql($COMPLEMENT_OF)) {
                                external_name_$73 = value2;
                                v_class2 = owl_find_or_create_term_for_class(external_name_$73, import_parameters);
                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str469$Asserting_disjoint_class__S_of__S, $str239$__ }), v_class2, v_term);
                                    force_output(UNPROVIDED);
                                }
                                owl_enqueue_assert(list($const470$owl_disjointWith, v_class2, v_term), defining_mt, import_parameters);
                            } else
                                if (pcase_var.eql($UNION_OF)) {
                                    components = NIL;
                                    cdolist_list_var4 = value2;
                                    name2 = NIL;
                                    name2 = cdolist_list_var4.first();
                                    while (NIL != cdolist_list_var4) {
                                        v_class3 = owl_find_or_create_term_for_class(name2, import_parameters);
                                        components = cons(v_class3, components);
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        name2 = cdolist_list_var4.first();
                                    } 
                                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str474$Asserting_union__S_of__S, $str239$__ }), v_term, components);
                                        force_output(UNPROVIDED);
                                    }
                                    owl_enqueue_assert(list($$collectionUnion, v_term, bq_cons($$TheSet, components)), defining_mt, import_parameters);
                                } else
                                    if (pcase_var.eql($INTERSECTION_OF)) {
                                        components = NIL;
                                        cdolist_list_var4 = value2;
                                        name2 = NIL;
                                        name2 = cdolist_list_var4.first();
                                        while (NIL != cdolist_list_var4) {
                                            v_class3 = owl_find_or_create_term_for_class(name2, import_parameters);
                                            components = cons(v_class3, components);
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            name2 = cdolist_list_var4.first();
                                        } 
                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str476$Asserting_intersection__S_of__S, $str239$__ }), v_term, components);
                                            force_output(UNPROVIDED);
                                        }
                                        owl_enqueue_assert(list($$collectionIntersection, v_term, bq_cons($$TheSet, components)), defining_mt, import_parameters);
                                    } else
                                        if (pcase_var.eql($ENUMERATED_INSTANCES)) {
                                            names = owl_external_term_enumeration_terms(value2);
                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str479$Asserting_enumeration__S_of__S, $str239$__ }), v_term, names);
                                                force_output(UNPROVIDED);
                                            }
                                            cdolist_list_var4 = names;
                                            name2 = NIL;
                                            name2 = cdolist_list_var4.first();
                                            while (NIL != cdolist_list_var4) {
                                                instance = owl_find_or_create_term_of_type(name2, v_term, import_parameters);
                                                owl_enqueue_assert(list($$isa, instance, v_term), defining_mt, import_parameters);
                                                cdolist_list_var4 = cdolist_list_var4.rest();
                                                name2 = cdolist_list_var4.first();
                                            } 
                                            owl_enqueue_assert(list($$completelyAssertedCollection, v_term), defining_mt, import_parameters);
                                        } else
                                            if (pcase_var.eql($MY_PRED_VALUES)) {
                                                cdolist_list_var3 = value2;
                                                pair = NIL;
                                                pair = cdolist_list_var3.first();
                                                while (NIL != cdolist_list_var3) {
                                                    datum2 = current2 = pair;
                                                    property_name = NIL;
                                                    value_$74 = NIL;
                                                    destructuring_bind_must_consp(current2, datum2, $list412);
                                                    property_name = current2.first();
                                                    current2 = current2.rest();
                                                    destructuring_bind_must_consp(current2, datum2, $list412);
                                                    value_$74 = current2.first();
                                                    current2 = current2.rest();
                                                    if (NIL == current2) {
                                                        pred = owl_find_or_create_term_of_type(property_name, $$OWLProperty, import_parameters);
                                                        sentence = make_binary_formula(pred, v_term, value_$74);
                                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str413$__Asserting__S__, $str239$__ }), sentence);
                                                            force_output(UNPROVIDED);
                                                        }
                                                        owl_enqueue_assert(sentence, defining_mt, import_parameters);
                                                    } else {
                                                        cdestructuring_bind_error(datum2, $list412);
                                                    }
                                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                                    pair = cdolist_list_var3.first();
                                                } 
                                            } else
                                                if (NIL != owl_utilities.owl_warnP()) {
                                                    Errors.warn($str481$Can_t_handle__S__value___S_, property, value2);
                                                }







                }
            }
        }
        return v_term;
    }

    public static SubLObject assert_owl_label(final SubLObject v_term, final SubLObject value, final SubLObject import_parameters) {
        SubLObject label = NIL;
        SubLObject language = NIL;
        destructuring_bind_must_consp(value, value, $list482);
        label = value.first();
        final SubLObject current = language = value.rest();
        final SubLObject lexicon = (NIL != language) ? ask_utilities.query_variable($sym483$_LEXICON, listS($$languageHasRootLexicon, language, $list485), $$InferencePSC, $list486).first() : NIL;
        final SubLObject mt = (NIL != lexicon) ? lexicon : $$GeneralEnglishMt;
        final SubLObject clean_label = string_utilities.strip_chars_meeting_test(label, symbol_function(CONTROL_CHAR_P));
        owl_enqueue_assert(list($const488$rdfs_label, v_term, clean_label), mt, import_parameters);
        return label;
    }

    public static SubLObject assert_owl_equivalent_class(final SubLObject col, final SubLObject external_name, final SubLObject defining_mt, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = owl_find_or_create_term_for_class(external_name, import_parameters);
        if (!v_class.equal(col)) {
            if (NIL != v_class) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str489$Asserting_equivalent_class__S_of_, $str239$__ }), v_class, col);
                    force_output(UNPROVIDED);
                }
                owl_enqueue_assert(list($const490$owl_equivalentClass, v_class, col), defining_mt, import_parameters);
            } else
                if (NIL != owl_utilities.owl_warnP()) {
                    Errors.warn($str491$Failed_to_assert_equivalent_class, external_name, col);
                }

        }
        return NIL;
    }

    public static SubLObject assert_owl_restriction(final SubLObject col, final SubLObject restriction, final SubLObject defining_mt, final SubLObject import_parameters) {
        final SubLObject sentence = owl_restriction_sentence(col, restriction, import_parameters);
        if (NIL != sentence) {
            owl_enqueue_assert(sentence, defining_mt, import_parameters);
        }
        return NIL;
    }

    public static SubLObject owl_restriction_sentence(final SubLObject col, final SubLObject restriction, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = restriction.rest();
        SubLObject property = NIL;
        SubLObject type = NIL;
        SubLObject value = NIL;
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list492);
        property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list492);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list492);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list492);
        v_class = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = owl_find_or_create_term_of_type(property, $$OWLProperty, import_parameters);
            final SubLObject resolved_class = (NIL != forts.fort_p(v_class)) ? v_class : owl_find_or_create_term_of_type(v_class, $const349$owl_Class, import_parameters);
            final SubLObject target = owl_find_or_create_term_from_specification(value, $$Thing, import_parameters);
            SubLObject sentence = NIL;
            if ((NIL != nonlocal_owl_term_reference_p(value)) && (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread))) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str493$Resolved_nonlocal_reference__S___, $str239$__ }), value, target);
                force_output(UNPROVIDED);
            }
            if ((NIL != node_id_specification_p(target)) && (NIL != owl_utilities.owl_warnP())) {
                Errors.warn($str494$Node_ID_as_restriction_target___S, target);
            }
            if (NIL == target) {
                Errors.warn($str495$Can_t_handle__S_restrictions_with, type, value);
            } else
                if (type.equal(owl_utilities.owl_name($$$allValuesFrom))) {
                    sentence = list($$relationAllOnly, pred, col, target);
                } else
                    if (type.equal(owl_utilities.owl_name($$$someValuesFrom))) {
                        sentence = list($$relationAllExists, pred, col, target);
                    } else
                        if (type.equal(owl_utilities.owl_name($$$hasValue))) {
                            sentence = list($$relationAllInstance, pred, col, target);
                        } else
                            if ((type.equal(owl_utilities.owl_name($$$minCardinality)) && value.eql(ONE_INTEGER)) && resolved_class.eql($$Thing)) {
                                sentence = list($$requiredArg1Pred, col, pred);
                            } else
                                if (type.equal(owl_utilities.owl_name($$$cardinality))) {
                                    sentence = list($$relationAllExistsCount, pred, col, resolved_class, target);
                                } else
                                    if (type.equal(owl_utilities.owl_name($$$minCardinality))) {
                                        sentence = list($$relationAllExistsMin, pred, col, resolved_class, target);
                                    } else
                                        if (type.equal(owl_utilities.owl_name($$$maxCardinality))) {
                                            sentence = list($$relationAllExistsMax, pred, col, resolved_class, target);
                                        } else {
                                            Errors.warn($str495$Can_t_handle__S_restrictions_with, type, value);
                                        }







            return sentence;
        }
        cdestructuring_bind_error(datum, $list492);
        return NIL;
    }

    public static SubLObject owl_restriction_collection(final SubLObject restriction, final SubLObject import_parameters, SubLObject genl) {
        if (genl == UNPROVIDED) {
            genl = $$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = restriction.rest();
        SubLObject property = NIL;
        SubLObject type = NIL;
        SubLObject value = NIL;
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list492);
        property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list492);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list492);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list492);
        v_class = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = owl_find_or_create_term_of_type(property, $$OWLProperty, import_parameters);
            final SubLObject resolved_class = (NIL != forts.fort_p(v_class)) ? v_class : owl_find_or_create_term_of_type(v_class, $const349$owl_Class, import_parameters);
            final SubLObject target = owl_find_or_create_term_from_specification(value, $$Thing, import_parameters);
            SubLObject collection = NIL;
            if ((NIL != nonlocal_owl_term_reference_p(value)) && (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread))) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str493$Resolved_nonlocal_reference__S___, $str239$__ }), value, target);
                force_output(UNPROVIDED);
            }
            final SubLObject template = list_utilities.alist_lookup_without_values($owl_restriction_collection_templates$.getGlobalValue(), type, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != template) {
                collection = cycl_utilities.formula_subst(pred, $PRED, cycl_utilities.formula_subst(resolved_class, $CLASS, cycl_utilities.formula_subst(target, $TARGET, cycl_utilities.formula_subst(genl, $GENL, template, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else {
                Errors.sublisp_break($str518$Can_t_create_collection_from__S_r, new SubLObject[]{ type, value });
            }
            return collection;
        }
        cdestructuring_bind_error(datum, $list492);
        return NIL;
    }

    public static SubLObject find_or_create_owl_class_from_restriction_internal(final SubLObject restriction, final SubLObject import_parameters, SubLObject genl) {
        if (genl == UNPROVIDED) {
            genl = $$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_formula = owl_restriction_collection(restriction, import_parameters, genl);
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str520$Created__S_from__S, $str239$__ }), term_formula, restriction);
            force_output(UNPROVIDED);
        }
        return owl_find_or_create_nat(term_formula, import_parameters);
    }

    public static SubLObject find_or_create_owl_class_from_restriction(final SubLObject restriction, final SubLObject import_parameters, SubLObject genl) {
        if (genl == UNPROVIDED) {
            genl = $$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return find_or_create_owl_class_from_restriction_internal(restriction, import_parameters, genl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(restriction, import_parameters, genl);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (restriction.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (import_parameters.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && genl.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(find_or_create_owl_class_from_restriction_internal(restriction, import_parameters, genl)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(restriction, import_parameters, genl));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject owl_find_or_create_nat(final SubLObject term_formula, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_type = find_or_create_term_type_for_ontology(owl_import_parameters_ontology(import_parameters), UNPROVIDED);
        owl_enqueue_assert(list($$quotedIsa, term_formula, term_type), $$BookkeepingMt, import_parameters);
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str521$__Asserting__S, $str239$__ }), list($$quotedIsa, term_formula, term_type));
            force_output(UNPROVIDED);
        }
        owl_utilities.note_term_acted_on_during_import(term_formula, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        return NIL != term_formula ? czer_main.canonicalize_term(term_formula, UNPROVIDED) : NIL;
    }

    public static SubLObject try_to_resolve_node_id_specification(final SubLObject specification) {
        assert NIL != node_id_specification_p(specification) : "owl_to_cycl.node_id_specification_p(specification) " + "CommonSymbols.NIL != owl_to_cycl.node_id_specification_p(specification) " + specification;
        final SubLObject resolved = lookup_node_id_reference(second(specification));
        return NIL != resolved ? resolved : specification;
    }

    public static SubLObject owl_find_or_create_term_from_specification(final SubLObject specification, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        final SubLObject _prev_bind_0 = $owl_term_from_specification_depth$.currentBinding(thread);
        try {
            $owl_term_from_specification_depth$.bind(number_utilities.f_1X($owl_term_from_specification_depth$.getDynamicValue(thread)), thread);
            if ($owl_term_from_specification_depth$.getDynamicValue(thread).numG(TEN_INTEGER)) {
                Errors.warn($str523$Nested_calls_resolving__S, specification);
            }
            if (NIL != node_id_specification_p(specification)) {
                v_term = owl_find_or_create_term_from_node_id(specification, type, import_parameters);
            } else
                if (NIL != owl_external_value_specification_union_p(specification)) {
                    v_term = owl_find_or_create_union(specification, type, import_parameters, UNPROVIDED);
                } else
                    if (NIL != owl_external_value_specification_intersection_p(specification)) {
                        v_term = owl_find_or_create_intersection(specification, type, import_parameters, UNPROVIDED);
                    } else
                        if (NIL != owl_restriction_p(specification)) {
                            v_term = find_or_create_owl_class_from_restriction(specification, import_parameters, UNPROVIDED);
                        } else
                            if (NIL != owl_external_term_enumeration_p(specification)) {
                                SubLObject terms = NIL;
                                SubLObject cdolist_list_var = owl_external_term_enumeration_terms(specification);
                                SubLObject sub_spec = NIL;
                                sub_spec = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    terms = cons(owl_find_or_create_term_from_specification(sub_spec, $$Thing, import_parameters), terms);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sub_spec = cdolist_list_var.first();
                                } 
                                v_term = owl_term_enumeration(terms, import_parameters);
                            } else
                                if (NIL != pattern_match.tree_matches_pattern(specification, $list524)) {
                                    final SubLObject complement = owl_find_or_create_term_from_specification(second(specification), type, import_parameters);
                                    if (NIL != complement) {
                                        v_term = list($$CollectionDifferenceFn, $$Thing, complement);
                                    }
                                } else
                                    if (specification.isString()) {
                                        v_term = owl_find_or_create_term_of_type(specification, type, import_parameters);
                                    } else
                                        if (NIL != nonlocal_owl_term_reference_p(specification)) {
                                            v_term = owl_find_or_create_term_of_type(specification, type, import_parameters);
                                        } else
                                            if ((NIL != cycl_grammar.cycl_denotational_term_p(specification)) && ((NIL == el_formula_p(specification)) || (NIL != cycl_utilities.expression_find_if($sym526$VALID_CONSTANT_, specification, UNPROVIDED, UNPROVIDED)))) {
                                                v_term = specification;
                                            } else
                                                if (NIL != cycl_utilities.expression_find_if(OWL_QUASI_TERM_P, specification, UNPROVIDED, UNPROVIDED)) {
                                                    v_term = specification;
                                                }









        } finally {
            $owl_term_from_specification_depth$.rebind(_prev_bind_0, thread);
        }
        if (NIL == v_term) {
            Errors.sublisp_break($str527$Can_t_find_or_create__S_term_from, new SubLObject[]{ type, specification });
        }
        return v_term;
    }

    public static SubLObject owl_find_or_create_union(final SubLObject specification, final SubLObject type, final SubLObject import_parameters, SubLObject resolve_node_idsP) {
        if (resolve_node_idsP == UNPROVIDED) {
            resolve_node_idsP = NIL;
        }
        final SubLObject names = owl_external_value_specification_union_names(specification);
        SubLObject v_term = NIL;
        if ((NIL == resolve_node_idsP) && (NIL != node_id_specification_p(names))) {
            v_term = owl_quasi_term_from_specification(specification, type, NIL, import_parameters);
        } else
            if (NIL != node_id_specification_p(names)) {
                v_term = owl_term_union(owl_find_or_create_classes_from_node_id(names, type, import_parameters), import_parameters);
            } else {
                SubLObject terms = NIL;
                SubLObject cdolist_list_var = names;
                SubLObject sub_spec = NIL;
                sub_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    terms = cons(owl_find_or_create_term_from_specification(sub_spec, type, import_parameters), terms);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                } 
                v_term = owl_term_union(terms, import_parameters);
            }

        return v_term;
    }

    public static SubLObject owl_find_or_create_intersection(final SubLObject specification, final SubLObject type, final SubLObject import_parameters, SubLObject resolve_node_idsP) {
        if (resolve_node_idsP == UNPROVIDED) {
            resolve_node_idsP = NIL;
        }
        final SubLObject names = owl_external_value_specification_intersection_names(specification);
        SubLObject v_term = NIL;
        if ((NIL == resolve_node_idsP) && (NIL != node_id_specification_p(names))) {
            v_term = owl_quasi_term_from_specification(specification, type, NIL, import_parameters);
        } else
            if (NIL != node_id_specification_p(names)) {
                v_term = owl_term_intersection(owl_find_or_create_classes_from_node_id(names, type, import_parameters), import_parameters);
            } else {
                SubLObject terms = NIL;
                SubLObject cdolist_list_var = remove_if(OWL_RESTRICTION_P, names, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject sub_spec = NIL;
                sub_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    terms = cons(owl_find_or_create_term_from_specification(sub_spec, type, import_parameters), terms);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                } 
                final SubLObject genl = (NIL != list_utilities.non_empty_list_p(terms)) ? terms.first() : $$Thing;
                SubLObject cdolist_list_var2 = list_utilities.remove_if_not(OWL_RESTRICTION_P, names, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject sub_spec2 = NIL;
                sub_spec2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    terms = cons(find_or_create_owl_class_from_restriction(sub_spec2, import_parameters, genl), terms);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    sub_spec2 = cdolist_list_var2.first();
                } 
                v_term = owl_term_intersection(terms, import_parameters);
            }

        return v_term;
    }

    public static SubLObject owl_find_or_create_classes_from_node_id(final SubLObject node_id_specification, final SubLObject type, final SubLObject import_parameters) {
        assert NIL != node_id_specification_p(node_id_specification) : "owl_to_cycl.node_id_specification_p(node_id_specification) " + "CommonSymbols.NIL != owl_to_cycl.node_id_specification_p(node_id_specification) " + node_id_specification;
        final SubLObject reference = lookup_node_id_reference(second(node_id_specification));
        SubLObject v_classes = NIL;
        if (NIL != reference) {
            if (NIL != possible_read_owl_list_p(reference)) {
                SubLObject cdolist_list_var;
                final SubLObject items = cdolist_list_var = reference;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject external_name = (item.isString()) ? read_owl_term_reference(item, import_parameters) : read_owl_class_or_restriction(item, import_parameters);
                    v_classes = cons(owl_find_or_create_term_from_specification(external_name, type, import_parameters), v_classes);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                v_classes = nreverse(v_classes);
            } else
                if (NIL != list_utilities.list_of_type_p(OWL_EXTERNAL_VALUE_SPECIFICATION_P, reference)) {
                    SubLObject cdolist_list_var2 = reference;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        v_classes = cons(owl_find_or_create_term_from_specification(item2, type, import_parameters), v_classes);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        item2 = cdolist_list_var2.first();
                    } 
                    v_classes = nreverse(v_classes);
                }

        }
        if (NIL != v_classes) {
            note_node_id_reference(second(node_id_specification), v_classes);
        }
        return v_classes;
    }

    public static SubLObject owl_find_or_create_term_from_node_id(final SubLObject node_id_specification, final SubLObject type, final SubLObject import_parameters) {
        assert NIL != node_id_specification_p(node_id_specification) : "owl_to_cycl.node_id_specification_p(node_id_specification) " + "CommonSymbols.NIL != owl_to_cycl.node_id_specification_p(node_id_specification) " + node_id_specification;
        SubLObject reference = lookup_node_id_reference(second(node_id_specification));
        SubLObject v_term = node_id_specification;
        if (NIL != cycl_utilities.expression_find_if(OWL_QUASI_TERM_P, reference, UNPROVIDED, UNPROVIDED)) {
            format(T, $str529$__Trying_to_resolve__S__, reference);
            final SubLObject maybe_resolved = cycl_utilities.expression_transform(copy_expression(reference), OWL_QUASI_TERM_P, RESOLVE_OWL_QUASI_TERM, UNPROVIDED, UNPROVIDED);
            if (NIL == cycl_utilities.expression_find($UNRESOLVED, maybe_resolved, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                reference = maybe_resolved;
            }
            format(T, $str530$__Result___S__, reference);
        }
        if (NIL != reference) {
            if (((NIL != cycl_grammar.cycl_denotational_term_p(reference)) && (NIL != cycl_utilities.expression_find_if(CONSTANT_P, reference, UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find_if(KEYWORDP, reference, UNPROVIDED, UNPROVIDED))) {
                v_term = reference;
            } else
                if (NIL != owl_external_value_specification_p(reference)) {
                    final SubLObject resolved = owl_find_or_create_term_from_specification(reference, type, import_parameters);
                    if (NIL != resolved) {
                        format(T, $str449$__Resolved__S___to__S__, node_id_specification, resolved);
                        v_term = resolved;
                        note_node_id_reference(second(node_id_specification), v_term);
                    }
                } else {
                    Errors.warn($str531$Trying_to_create_term_from__S, reference);
                }

        }
        return v_term;
    }

    public static SubLObject owl_term_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_term_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject owl_term_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$owl_term_info_native.class ? T : NIL;
    }

    public static SubLObject oti_cyc_name(final SubLObject v_object) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject oti_comment(final SubLObject v_object) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject oti_superclasses(final SubLObject v_object) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject oti_disjoint_classes(final SubLObject v_object) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject oti_plist(final SubLObject v_object) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_oti_cyc_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_oti_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_oti_superclasses(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_oti_disjoint_classes(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_oti_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_term_info_p(v_object) : "owl_to_cycl.owl_term_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_owl_term_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $owl_term_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYC_NAME)) {
                _csetf_oti_cyc_name(v_new, current_value);
            } else
                if (pcase_var.eql($COMMENT)) {
                    _csetf_oti_comment(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPERCLASSES)) {
                        _csetf_oti_superclasses(v_new, current_value);
                    } else
                        if (pcase_var.eql($DISJOINT_CLASSES)) {
                            _csetf_oti_disjoint_classes(v_new, current_value);
                        } else
                            if (pcase_var.eql($PLIST)) {
                                _csetf_oti_plist(v_new, current_value);
                            } else {
                                Errors.error($str147$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_owl_term_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_OWL_TERM_INFO, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYC_NAME, oti_cyc_name(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, oti_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPERCLASSES, oti_superclasses(obj));
        funcall(visitor_fn, obj, $SLOT, $DISJOINT_CLASSES, oti_disjoint_classes(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, oti_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_OWL_TERM_INFO, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_owl_term_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_term_info(obj, visitor_fn);
    }

    public static SubLObject print_owl_term_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str554$_OWL_TERM_INFO__A_, oti_cyc_name(v_object));
        return v_object;
    }

    public static SubLObject find_or_create_owl_term_info(final SubLObject cyc_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_info = NIL;
        if (((NIL != cyc_name) && (NIL != misc_utilities.initialized_p($owl_definition_accumulator$.getDynamicValue(thread)))) && (NIL == term_info)) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = $list555, type = NIL, type = csome_list_var.first(); (NIL == term_info) && (NIL != csome_list_var); term_info = find_accumulated_owl_definition(cyc_name, type) , csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
            }
        }
        return NIL != term_info ? term_info : new_owl_term_info(cyc_name, UNPROVIDED);
    }

    public static SubLObject new_owl_term_info(SubLObject cyc_name, SubLObject comment) {
        if (cyc_name == UNPROVIDED) {
            cyc_name = NIL;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLObject term_info = make_owl_term_info(UNPROVIDED);
        if (NIL != cyc_name) {
            set_owl_term_info_cyc_name(term_info, cyc_name);
        }
        set_owl_term_info_comment(term_info, comment);
        _csetf_oti_plist(term_info, NIL);
        return term_info;
    }

    public static SubLObject owl_term_info_cyc_name(final SubLObject term_info) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        return oti_cyc_name(term_info);
    }

    public static SubLObject owl_term_info_comment(final SubLObject term_info) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        return oti_comment(term_info);
    }

    public static SubLObject owl_term_info_superclasses(final SubLObject term_info) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        return oti_superclasses(term_info);
    }

    public static SubLObject owl_term_info_disjoint_classes(final SubLObject term_info) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        return oti_disjoint_classes(term_info);
    }

    public static SubLObject owl_term_info_plist(final SubLObject term_info) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        return oti_plist(term_info);
    }

    public static SubLObject owl_term_info_plist_lookup(final SubLObject term_info, final SubLObject key, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        return getf(oti_plist(term_info), key, default_value);
    }

    public static SubLObject owl_term_info_external_name(final SubLObject term_info, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        return owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, default_value);
    }

    public static SubLObject set_owl_term_info_cyc_name(final SubLObject term_info, final SubLObject name) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        _csetf_oti_cyc_name(term_info, name);
        return oti_cyc_name(term_info);
    }

    public static SubLObject set_owl_term_info_comment(final SubLObject term_info, final SubLObject comment) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        _csetf_oti_comment(term_info, comment);
        return oti_comment(term_info);
    }

    public static SubLObject add_owl_term_info_superclass(final SubLObject term_info, final SubLObject superclass) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        assert NIL != owl_external_value_specification_p(superclass) : "owl_to_cycl.owl_external_value_specification_p(superclass) " + "CommonSymbols.NIL != owl_to_cycl.owl_external_value_specification_p(superclass) " + superclass;
        if (NIL == member(superclass, oti_superclasses(term_info), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            _csetf_oti_superclasses(term_info, cons(superclass, oti_superclasses(term_info)));
        }
        return oti_superclasses(term_info);
    }

    public static SubLObject add_owl_term_info_disjoint_class(final SubLObject term_info, final SubLObject disjoint_class) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        assert NIL != owl_external_value_specification_p(disjoint_class) : "owl_to_cycl.owl_external_value_specification_p(disjoint_class) " + "CommonSymbols.NIL != owl_to_cycl.owl_external_value_specification_p(disjoint_class) " + disjoint_class;
        if (NIL == member(disjoint_class, oti_disjoint_classes(term_info), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            _csetf_oti_disjoint_classes(term_info, cons(disjoint_class, oti_disjoint_classes(term_info)));
        }
        return oti_disjoint_classes(term_info);
    }

    public static SubLObject owl_term_info_plist_enter(final SubLObject term_info, final SubLObject key, final SubLObject value) {
        _csetf_oti_plist(term_info, putf(oti_plist(term_info), key, value));
        return oti_plist(term_info);
    }

    public static SubLObject owl_term_info_plist_push(final SubLObject term_info, final SubLObject key, final SubLObject value) {
        assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
        final SubLObject existing = getf(oti_plist(term_info), key, NIL);
        final SubLObject v_new = (NIL != find(value, existing, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? existing : cons(value, existing);
        owl_term_info_plist_enter(term_info, key, v_new);
        return oti_plist(term_info);
    }

    public static SubLObject owl_term_info_plist_list_propertyP(final SubLObject key) {
        if (((((key.eql($ISAS) || key.eql($LABEL)) || key.eql($EQUIVALENT_CLASSES)) || key.eql($MY_PRED_VALUES)) || key.eql($UNION_OF)) || key.eql($INTERSECTION_OF)) {
            return T;
        }
        if (((((key.eql($NODE_ID) || key.eql($EXTERNAL_NAME)) || key.eql($COMPLEMENT_CLASS)) || key.eql($ENUMERATED_INSTANCES)) || key.eql($GUID)) || key.eql($EXTERNALID)) {
            return NIL;
        }
        if (key.eql($GENL_PROPERTY) || key.eql($INVERSE)) {
            return NIL;
        }
        Errors.sublisp_break($str556$Don_t_know_about__S, new SubLObject[]{ key });
        return NIL;
    }

    public static SubLObject merge_owl_term_definitions(final SubLObject from, final SubLObject onto) {
        final SubLObject cyc_name = owl_term_info_cyc_name(from);
        if (cyc_name.isString()) {
            set_owl_term_info_cyc_name(onto, cyc_name);
        }
        set_owl_term_info_comment(onto, owl_term_info_comment(from));
        SubLObject cdolist_list_var = owl_term_info_superclasses(from);
        SubLObject superclass = NIL;
        superclass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_owl_term_info_superclass(onto, superclass);
            cdolist_list_var = cdolist_list_var.rest();
            superclass = cdolist_list_var.first();
        } 
        cdolist_list_var = owl_term_info_disjoint_classes(from);
        SubLObject disjoint_class = NIL;
        disjoint_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_owl_term_info_disjoint_class(onto, disjoint_class);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_class = cdolist_list_var.first();
        } 
        SubLObject remainder;
        SubLObject property;
        SubLObject from_value;
        SubLObject onto_value;
        SubLObject new_value;
        for (remainder = NIL, remainder = owl_term_info_plist(from); NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            from_value = cadr(remainder);
            onto_value = owl_term_info_plist_lookup(onto, property, UNPROVIDED);
            new_value = (NIL != owl_term_info_plist_list_propertyP(property)) ? union(from_value, onto_value, symbol_function(EQUAL), UNPROVIDED) : from_value;
            owl_term_info_plist_enter(onto, property, new_value);
        }
        return onto;
    }

    public static SubLObject sxhash_owl_term_info_method(final SubLObject v_object) {
        return sxhash_owl_term_info(v_object);
    }

    public static SubLObject sxhash_owl_term_info(final SubLObject term_info) {
        return Sxhash.sxhash(oti_cyc_name(term_info));
    }

    public static SubLObject import_named_bnodes(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind($BNODE, thread);
            SubLObject new_tokens;
            for (SubLObject tokens = original_tokens; NIL != tokens; new_tokens = tokens = read_one_named_bnode(tokens, import_parameters)) {
            }
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject read_one_named_bnode(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        SubLObject doneP = NIL;
        while ((NIL == doneP) && (NIL == list_utilities.empty_list_p(tokens))) {
            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$Description))) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str559$__Reading_Description___S__, $str239$__ }), current_token);
                    force_output(UNPROVIDED);
                }
                final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
                if ((NIL != node_id) && (NIL != xml_parsing_utilities.xml_token_element_nameP(second(tokens), rdf_utilities.rdf_name($$$first)))) {
                    final SubLObject list = read_owl_list(tokens.rest(), import_parameters);
                    note_node_id_reference(node_id, list);
                    doneP = T;
                } else
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str560$Skipping_rdf_Description_element_, $str239$__ }));
                        force_output(UNPROVIDED);
                    }

                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            } else
                if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$Restriction))) {
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str561$__Reading_Restriction___S__, $str239$__ }), current_token);
                        force_output(UNPROVIDED);
                    }
                    final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
                    if (NIL != node_id) {
                        read_owl_restriction(tokens, import_parameters);
                        doneP = T;
                    } else
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str562$Skipping_owl_Restriction_element_, $str239$__ }));
                            force_output(UNPROVIDED);
                        }

                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                } else
                    if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$RDF))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token))) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, next_noninitial_non_whitespace_xml_token_position(tokens));
                    } else
                        if ((NIL != owl_class_token_p(current_token)) && (NIL != xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED))) {
                            format(T, $str563$Reading_top_level_named_class__S, current_token);
                            read_owl_class(tokens, import_parameters);
                            tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                        } else
                            if (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
                                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                            } else {
                                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                                tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                            }




            current_token = (NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : NIL;
        } 
        return tokens;
    }

    public static SubLObject read_class_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind($CLASS, thread);
            SubLObject new_tokens;
            for (SubLObject tokens = original_tokens; NIL != tokens; new_tokens = tokens = read_one_class_info_from_owl_tokens(tokens, import_parameters)) {
            }
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject read_one_class_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        SubLObject term_info = NIL;
        SubLObject doneP = NIL;
        while ((NIL == doneP) && (NIL == list_utilities.empty_list_p(tokens))) {
            thread.resetMultipleValues();
            final SubLObject new_term_info = read_one_owl_chunk_for_class_info(current_token, term_info, import_parameters, tokens);
            final SubLObject token_advance_spec = thread.secondMultipleValue();
            final SubLObject term_info_doneP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (!term_info.eql(new_term_info)) {
                term_info = new_term_info;
            }
            if (NIL != term_info_doneP) {
                if (NIL == term_info) {
                    if (NIL != owl_utilities.owl_warnP()) {
                        Errors.warn($str564$Failed_or_declined_to_read_a_clas);
                    }
                } else
                    if (((NIL != list_utilities.empty_list_p(owl_term_info_superclasses(term_info))) && (NIL != list_utilities.empty_list_p(owl_term_info_plist_lookup(term_info, $INTERSECTION_OF, UNPROVIDED)))) && (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread))) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str565$There_are_no_superclasses_for__S, $str239$__ }), term_info);
                        force_output(UNPROVIDED);
                    }

                if ((NIL != term_info) && (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread))) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str566$Finished__S____Superclasses___S__, $str239$__ }), new SubLObject[]{ term_info, owl_term_info_superclasses(term_info), owl_term_info_disjoint_classes(term_info), owl_term_info_plist_lookup(term_info, $ISAS, UNPROVIDED) });
                    force_output(UNPROVIDED);
                }
                if (NIL != term_info) {
                    accumulate_owl_definition(term_info, $CLASS);
                }
                doneP = T;
            }
            if (NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
            } else
                if (token_advance_spec.isString()) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, UNPROVIDED), UNPROVIDED);
                } else
                    if (token_advance_spec.eql($CLOSE)) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    } else {
                        final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                        tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                    }


            current_token = (NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : NIL;
        } 
        return values(tokens, term_info);
    }

    public static SubLObject read_one_owl_chunk_for_class_info(final SubLObject current_token, final SubLObject term_info, final SubLObject import_parameters, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term_info = term_info;
        SubLObject token_advance_spec = NIL;
        SubLObject term_info_doneP = NIL;
        if (NIL != xml_parsing_utilities.xml_token_starts_with(current_token, $str256$____)) {
            final SubLObject comment_close_position = xml_parsing_utilities.next_xml_token_position(tokens, $str257$___, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!comment_close_position.isInteger())) {
                Errors.error($str258$Couldn_t_find_end_of_HTML_comment, list_utilities.first_n(TEN_INTEGER, tokens));
            }
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str567$Skipping_HTML_comment___S, $str239$__ }), list_utilities.first_n(number_utilities.f_1X(comment_close_position), tokens));
                force_output(UNPROVIDED);
            }
            token_advance_spec = number_utilities.f_1X(comment_close_position);
        } else
            if ((NIL != owl_class_token_p(current_token)) && (NIL != xml_parsing_utilities.xml_closing_tag_p(current_token))) {
                term_info_doneP = T;
                token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
            } else
                if (NIL != owl_class_token_p(current_token)) {
                    SubLObject external_name = NIL;
                    SubLObject cyc_name = NIL;
                    if (NIL == list_utilities.empty_list_p(xml_parsing_utilities.parse_xml_token(current_token).rest())) {
                        thread.resetMultipleValues();
                        final SubLObject external_name_$75 = term_names_from_token(current_token, import_parameters);
                        final SubLObject cyc_name_$76 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        external_name = external_name_$75;
                        cyc_name = cyc_name_$76;
                    }
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str568$Reading_definition_of__S, $str239$__ }), external_name);
                        force_output(UNPROVIDED);
                    }
                    new_term_info = find_or_create_owl_term_info(cyc_name);
                    final SubLObject type = xml_parsing_utilities.xml_token_element_name(current_token);
                    owl_term_info_plist_push(new_term_info, $ISAS, type);
                    final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
                    if (NIL != node_id) {
                        owl_term_info_plist_enter(new_term_info, $NODE_ID, node_id);
                    }
                    if (NIL != cyc_name) {
                        set_owl_term_info_cyc_name(new_term_info, cyc_name);
                    }
                    if (NIL != external_name) {
                        owl_term_info_plist_enter(new_term_info, $EXTERNAL_NAME, external_name);
                    }
                    if (NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                        term_info_doneP = T;
                    }
                    token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                } else
                    if (NIL != owl_property_token_p(current_token)) {
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str569$Skipping__S_to_close_tag, $str239$__ }), current_token);
                            force_output(UNPROVIDED);
                        }
                        token_advance_spec = $CLOSE;
                    } else
                        if (NIL == term_info) {
                            token_advance_spec = handle_non_target_owl_token(current_token);
                        } else {
                            token_advance_spec = handle_term_info_token(new_term_info, tokens, import_parameters);
                        }




        return values(new_term_info, token_advance_spec, term_info_doneP);
    }

    public static SubLObject read_instance_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind($INSTANCE, thread);
            for (SubLObject tokens = original_tokens; NIL != tokens; tokens = read_one_instance_info_from_owl_tokens(tokens, import_parameters)) {
            }
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject read_one_instance_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        SubLObject term_info = NIL;
        SubLObject doneP = NIL;
        while ((NIL == doneP) && (NIL == list_utilities.empty_list_p(tokens))) {
            thread.resetMultipleValues();
            final SubLObject new_term_info = read_one_owl_chunk_for_instance_info(current_token, term_info, import_parameters, tokens);
            final SubLObject token_advance_spec = thread.secondMultipleValue();
            final SubLObject term_info_doneP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (!term_info.eql(new_term_info)) {
                term_info = new_term_info;
            }
            if (NIL != term_info_doneP) {
                if ((NIL == term_info) && (NIL != owl_utilities.owl_warnP())) {
                    Errors.warn($str570$Failed_or_declined_to_read_an_ins);
                }
                if (NIL != term_info) {
                    accumulate_owl_definition(term_info, $INSTANCE);
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str571$Finished__S_, $str239$__ }), term_info);
                        force_output(UNPROVIDED);
                    }
                }
                doneP = T;
            }
            if (NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
            } else
                if (token_advance_spec.isString()) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, UNPROVIDED), UNPROVIDED);
                } else
                    if (token_advance_spec.eql($CLOSE)) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    } else {
                        final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                        tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                    }


            current_token = (NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : NIL;
        } 
        return values(tokens, term_info);
    }

    public static SubLObject read_one_owl_chunk_for_instance_info(final SubLObject current_token, final SubLObject term_info, final SubLObject import_parameters, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term_info = term_info;
        SubLObject token_advance_spec = NIL;
        final SubLObject maybe_instance_tokenP = owl_maybe_instance_tokenP(current_token, import_parameters);
        SubLObject term_info_doneP = NIL;
        if (NIL != xml_parsing_utilities.xml_comment_p(current_token)) {
            final SubLObject comment_close_position = xml_parsing_utilities.next_xml_token_position(tokens, $str257$___, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!comment_close_position.isInteger())) {
                Errors.error($str258$Couldn_t_find_end_of_HTML_comment, list_utilities.first_n(TEN_INTEGER, tokens));
            }
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str567$Skipping_HTML_comment___S, $str239$__ }), list_utilities.first_n(number_utilities.f_1X(comment_close_position), tokens));
                force_output(UNPROVIDED);
            }
            token_advance_spec = number_utilities.f_1X(comment_close_position);
        } else
            if ((NIL != maybe_instance_tokenP) && (NIL != xml_parsing_utilities.xml_closing_tag_p(current_token))) {
                term_info_doneP = T;
                token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
            } else
                if ((NIL == term_info) && (NIL != maybe_instance_tokenP)) {
                    SubLObject external_name = NIL;
                    SubLObject cyc_name = NIL;
                    if (NIL == list_utilities.empty_list_p(xml_parsing_utilities.parse_xml_token(current_token).rest())) {
                        thread.resetMultipleValues();
                        final SubLObject external_name_$77 = term_names_from_token(current_token, import_parameters);
                        final SubLObject cyc_name_$78 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        external_name = external_name_$77;
                        cyc_name = cyc_name_$78;
                    }
                    new_term_info = find_or_create_owl_term_info(cyc_name);
                    if (NIL == xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$Description))) {
                        final SubLObject type = xml_parsing_utilities.xml_token_element_name(current_token);
                        owl_term_info_plist_push(new_term_info, $ISAS, type);
                    }
                    if (NIL != cyc_name) {
                        set_owl_term_info_cyc_name(new_term_info, cyc_name);
                    }
                    if (NIL != external_name) {
                        owl_term_info_plist_enter(new_term_info, $EXTERNAL_NAME, external_name);
                    }
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str572$__Defining__S_as_an_instance_of__, $str239$__ }), new_term_info, xml_parsing_utilities.xml_token_element_name(current_token));
                        force_output(UNPROVIDED);
                    }
                    if (NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                        term_info_doneP = T;
                    }
                    token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                } else
                    if (NIL != owl_property_token_p(current_token)) {
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str569$Skipping__S_to_close_tag, $str239$__ }), current_token);
                            force_output(UNPROVIDED);
                        }
                        token_advance_spec = $CLOSE;
                    } else
                        if (NIL != owl_class_token_p(current_token)) {
                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str569$Skipping__S_to_close_tag, $str239$__ }), current_token);
                                force_output(UNPROVIDED);
                            }
                            token_advance_spec = $CLOSE;
                        } else
                            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$Description))) {
                                final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
                                if ((NIL != node_id) && (NIL != xml_parsing_utilities.xml_token_element_nameP(second(tokens), rdf_utilities.rdf_name($$$first)))) {
                                    final SubLObject list = read_owl_list(tokens.rest(), import_parameters);
                                    note_node_id_reference(node_id, list);
                                } else
                                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str560$Skipping_rdf_Description_element_, $str239$__ }));
                                        force_output(UNPROVIDED);
                                    }

                                token_advance_spec = $CLOSE;
                            } else
                                if (NIL == term_info) {
                                    token_advance_spec = handle_non_target_owl_token(current_token);
                                } else {
                                    token_advance_spec = handle_term_info_token(new_term_info, tokens, import_parameters);
                                }






        return values(new_term_info, token_advance_spec, term_info_doneP);
    }

    public static SubLObject owl_maybe_instance_tokenP(final SubLObject token, final SubLObject import_parameters) {
        final SubLObject ans = makeBoolean((NIL != xml_parsing_utilities.xml_tagP(token)) && (NIL == owl_non_instance_tokenP(token, import_parameters)));
        return ans;
    }

    public static SubLObject owl_non_instance_tokenP(final SubLObject token, final SubLObject import_parameters) {
        if (NIL != owl_class_token_p(token)) {
            return T;
        }
        if (NIL != xml_parsing_utilities.xml_token_element_nameP(token, $str87$_xml)) {
            return T;
        }
        if (NIL != xml_parsing_utilities.xml_doctype_tag_p(token)) {
            return T;
        }
        if (((NIL != member(xml_parsing_utilities.xml_token_element_name(token), $cyc_properties_to_not_import$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) && owl_import_parameters_base_uri(import_parameters).isString()) && (NIL != string_utilities.substringP($str294$cyc_com, owl_import_parameters_base_uri(import_parameters), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name($$$Description))) && (NIL != xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED))) {
            return T;
        }
        if ((NIL != xml_parsing_utilities.xml_prefixed_name_p(xml_parsing_utilities.xml_token_element_name(token))) && (NIL != owl_reserved_namespace_p(xml_parsing_utilities.xml_prefixed_name_namespace(xml_parsing_utilities.xml_token_element_name(token))))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject handle_non_target_owl_token(final SubLObject current_token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_advance_spec = NIL;
        if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$Ontology))) {
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str569$Skipping__S_to_close_tag, $str239$__ }), current_token);
                force_output(UNPROVIDED);
            }
            token_advance_spec = $CLOSE;
        } else
            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$AllDifferent))) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str569$Skipping__S_to_close_tag, $str239$__ }), current_token);
                    force_output(UNPROVIDED);
                }
                token_advance_spec = $CLOSE;
            } else
                if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$RDF))) {
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str574$Skipping__S, $str239$__ }), current_token);
                        force_output(UNPROVIDED);
                    }
                    token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                } else
                    if ((NIL != xml_parsing_utilities.xml_declaration_p(current_token)) || (NIL != xml_parsing_utilities.xml_doctype_tag_p(current_token))) {
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str574$Skipping__S, $str239$__ }), current_token);
                            force_output(UNPROVIDED);
                        }
                        token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                    } else
                        if (NIL == xml_parsing_utilities.xml_tagP(current_token)) {
                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str574$Skipping__S, $str239$__ }), current_token);
                                force_output(UNPROVIDED);
                            }
                            token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                        } else
                            if ((NIL != xml_parsing_utilities.xml_tagP(current_token)) && (NIL == xml_parsing_utilities.xml_prefixed_name_p(xml_parsing_utilities.xml_token_element_name(current_token)))) {
                                if ((NIL != lower_case_p(string_utilities.first_char(xml_parsing_utilities.xml_token_element_name(current_token)))) && (NIL != owl_utilities.owl_warnP())) {
                                    Errors.warn($str575$Skipping_locally_defined__S_to_cl, current_token);
                                }
                                token_advance_spec = $CLOSE;
                            } else {
                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str574$Skipping__S, $str239$__ }), current_token);
                                    force_output(UNPROVIDED);
                                }
                                token_advance_spec = $CLOSE;
                            }





        return token_advance_spec;
    }

    public static SubLObject handle_term_info_token(final SubLObject new_term_info, SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
        final SubLObject current_token = tokens.first();
        if (NIL != string_utilities.whitespace_stringP(current_token)) {
            token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
        } else
            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$label))) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != xml_parsing_utilities.xml_empty_tagP(current_token))) {
                    Errors.error($str263$Can_t_interpret_empty_label_token, current_token);
                }
                final SubLObject lang_value = xml_parsing_utilities.xml_tag_attribute_value(current_token, xml_name($$$lang), NIL);
                final SubLObject language = (NIL != lang_value) ? decode_html_language_abbreviation(lang_value) : $$EnglishLanguage;
                final SubLObject label = second(tokens);
                if (((NIL != lang_value) && (NIL == language)) && (NIL != owl_utilities.owl_warnP())) {
                    Errors.warn($str264$Can_t_decode_language_abbreviatio, lang_value);
                }
                owl_term_info_plist_push(new_term_info, $LABEL, cons(label, language));
                token_advance_spec = $CLOSE;
            } else
                if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name($$$type))) {
                    owl_term_info_plist_push(new_term_info, $ISAS, term_names_from_token(current_token, import_parameters));
                    token_advance_spec = $CLOSE;
                } else
                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$comment))) {
                        set_owl_term_info_comment(new_term_info, next_noninitial_non_whitespace_xml_token(tokens));
                        token_advance_spec = $CLOSE;
                    } else
                        if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$subClassOf))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token))) {
                            final SubLObject superclass = read_owl_class_or_restriction(tokens.rest(), import_parameters);
                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str577$Read_superclass___S, $str239$__ }), superclass);
                                force_output(UNPROVIDED);
                            }
                            add_owl_term_info_superclass(new_term_info, superclass);
                            token_advance_spec = $CLOSE;
                        } else
                            if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name($$$subClassOf))) {
                                add_owl_term_info_superclass(new_term_info, read_owl_term_reference(current_token, import_parameters));
                                token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                            } else
                                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$disjointWith))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token))) {
                                    add_owl_term_info_disjoint_class(new_term_info, read_owl_class_or_restriction(tokens.rest(), import_parameters));
                                    token_advance_spec = $CLOSE;
                                } else
                                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$disjointWith))) {
                                        add_owl_term_info_disjoint_class(new_term_info, process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$resource), UNPROVIDED)));
                                        token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                    } else
                                        if ((NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) && (NIL != member(xml_parsing_utilities.xml_token_element_name(current_token), list(owl_utilities.owl_name($$$equivalentClass), $$$owlEquivalentClass), symbol_function(EQUAL), UNPROVIDED))) {
                                            final SubLObject equivalent_class = read_owl_class_or_restriction(tokens.rest(), import_parameters);
                                            owl_term_info_plist_push(new_term_info, $EQUIVALENT_CLASSES, equivalent_class);
                                            token_advance_spec = $CLOSE;
                                        } else
                                            if (NIL != member(xml_parsing_utilities.xml_token_element_name(current_token), list(owl_utilities.owl_name($$$equivalentClass), $$$owlEquivalentClass), symbol_function(EQUAL), UNPROVIDED)) {
                                                final SubLObject equivalent_class = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$resource), UNPROVIDED));
                                                owl_term_info_plist_push(new_term_info, $EQUIVALENT_CLASSES, equivalent_class);
                                                token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                            } else
                                                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$complementOf))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(current_token))) {
                                                    owl_term_info_plist_enter(new_term_info, $COMPLEMENT_CLASS, read_owl_class_or_restriction(tokens.rest(), import_parameters));
                                                    token_advance_spec = $CLOSE;
                                                } else
                                                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$complementOf))) {
                                                        final SubLObject complement_class = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$resource), UNPROVIDED));
                                                        owl_term_info_plist_enter(new_term_info, $COMPLEMENT_CLASS, complement_class);
                                                        token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                                    } else
                                                        if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$intersectionOf))) && (NIL == xml_parsing_utilities.xml_empty_tagP(current_token))) {
                                                            SubLObject v_classes = NIL;
                                                            SubLObject v_class;
                                                            SubLObject first_token;
                                                            for (tokens = tokens.rest(); NIL == xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name($$$intersectionOf), tokens.first()); tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens)) {
                                                                v_class = NIL;
                                                                first_token = tokens.first();
                                                                if ((NIL != owl_class_token_p(first_token)) || (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, owl_utilities.owl_name($$$Restriction)))) {
                                                                    v_class = read_owl_class_or_restriction(tokens, import_parameters);
                                                                } else
                                                                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$Description))) {
                                                                        v_class = owl_external_name_from_token(first_token, import_parameters);
                                                                    }

                                                                if (NIL != v_class) {
                                                                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str583$Read_one_intersection_element___S, $str239$__ }), v_class);
                                                                        force_output(UNPROVIDED);
                                                                    }
                                                                    v_classes = cons(v_class, v_classes);
                                                                }
                                                            }
                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str584$Intersection___S, $str239$__ }), v_classes);
                                                                force_output(UNPROVIDED);
                                                            }
                                                            owl_term_info_plist_enter(new_term_info, $INTERSECTION_OF, v_classes);
                                                            token_advance_spec = $CLOSE;
                                                        } else
                                                            if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$intersectionOf))) && (NIL != xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED))) {
                                                                final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
                                                                final SubLObject v_classes2 = list($NODE_ID, node_id);
                                                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str584$Intersection___S, $str239$__ }), v_classes2);
                                                                    force_output(UNPROVIDED);
                                                                }
                                                                owl_term_info_plist_enter(new_term_info, $INTERSECTION_OF, v_classes2);
                                                                token_advance_spec = $CLOSE;
                                                            } else
                                                                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$unionOf))) && (NIL == xml_parsing_utilities.xml_empty_tagP(current_token))) {
                                                                    SubLObject v_classes = NIL;
                                                                    SubLObject v_class;
                                                                    SubLObject first_token;
                                                                    for (tokens = tokens.rest(); NIL == xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name($$$unionOf), tokens.first()); tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens)) {
                                                                        v_class = NIL;
                                                                        first_token = tokens.first();
                                                                        if ((NIL != owl_class_token_p(first_token)) || (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, owl_utilities.owl_name($$$Restriction)))) {
                                                                            v_class = read_owl_class_or_restriction(tokens, import_parameters);
                                                                        } else
                                                                            if (NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name($$$Description))) {
                                                                                v_class = owl_external_name_from_token(first_token, import_parameters);
                                                                            }

                                                                        if (NIL != v_class) {
                                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str585$Read_one_union_element___S, $str239$__ }), v_class);
                                                                                force_output(UNPROVIDED);
                                                                            }
                                                                            v_classes = cons(v_class, v_classes);
                                                                        }
                                                                    }
                                                                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str586$Union___S, $str239$__ }), v_classes);
                                                                        force_output(UNPROVIDED);
                                                                    }
                                                                    owl_term_info_plist_enter(new_term_info, $UNION_OF, v_classes);
                                                                    token_advance_spec = $CLOSE;
                                                                } else
                                                                    if (NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name($$$oneOf))) {
                                                                        final SubLObject enumeration = read_owl_enumeration(tokens, import_parameters);
                                                                        owl_term_info_plist_enter(new_term_info, $ENUMERATED_INSTANCES, enumeration);
                                                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str587$Read_enumerated_instances___S, $str239$__ }), enumeration);
                                                                            force_output(UNPROVIDED);
                                                                        }
                                                                        token_advance_spec = $CLOSE;
                                                                    } else
                                                                        if (NIL != cyc_token_with_nameP(current_token, $$$guid, import_parameters)) {
                                                                            handle_cyc_guid(new_term_info, tokens);
                                                                            token_advance_spec = $CLOSE;
                                                                        } else
                                                                            if (NIL != cyc_token_with_nameP(current_token, $$$externalID, import_parameters)) {
                                                                                handle_cyc_external_id(new_term_info, tokens);
                                                                                token_advance_spec = $CLOSE;
                                                                            } else
                                                                                if (NIL != xml_parsing_utilities.xml_tagP(current_token)) {
                                                                                    handle_property_value_pair(new_term_info, current_token, tokens, import_parameters);
                                                                                    token_advance_spec = $CLOSE;
                                                                                } else {
                                                                                    if (NIL != owl_utilities.owl_warnP()) {
                                                                                        Errors.warn($str293$Ignoring_unrecognized_token___S, current_token);
                                                                                    }
                                                                                    token_advance_spec = $NEXT_NON_WHITESPACE_TOKEN;
                                                                                }


















        return token_advance_spec;
    }

    public static SubLObject handle_cyc_guid(final SubLObject new_term_info, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token = second(tokens);
        final SubLObject guid = owl_value_from_string(next_token, $$$string);
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str283$__Noting_Cyc_guid_for__S_S__, $str239$__ }), guid, new_term_info);
            force_output(UNPROVIDED);
        }
        owl_term_info_plist_enter(new_term_info, $GUID, guid);
        return NIL;
    }

    public static SubLObject handle_cyc_external_id(final SubLObject new_term_info, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token = second(tokens);
        final SubLObject externalid = owl_value_from_string(next_token, $$$string);
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str286$__Noting_Cyc_externalID_for__S_S_, $str239$__ }), externalid, new_term_info);
            force_output(UNPROVIDED);
        }
        owl_term_info_plist_enter(new_term_info, $EXTERNALID, externalid);
        return NIL;
    }

    public static SubLObject handle_property_value_pair(final SubLObject new_term_info, final SubLObject current_token, final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property_name = xml_parsing_utilities.xml_token_element_name(current_token);
        final SubLObject value_name = (NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) ? term_names_from_token(current_token, import_parameters) : NIL;
        SubLObject value = NIL;
        if (NIL != value_name) {
            value = owl_find_or_create_term_of_type(value_name, $$Thing, import_parameters);
        } else
            if (NIL != xml_parsing_utilities.xml_closing_tag_p(second(tokens))) {
                value = $str92$;
            } else
                if (NIL != xml_parsing_utilities.xml_tagP(second(tokens))) {
                    final SubLObject term_info = nth_value_step_2(nth_value_step_1(ONE_INTEGER), read_one_instance_info_from_owl_tokens(tokens.rest(), import_parameters));
                    assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
                    value = owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, UNPROVIDED);
                } else {
                    final SubLObject datatype = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name($$$datatype), UNPROVIDED));
                    final SubLObject next_token = second(tokens);
                    value = owl_value_from_string(next_token, datatype);
                }


        if (NIL == value) {
            Errors.warn($str588$Couldn_t_determine_value_from__S_, current_token, second(tokens));
        } else
            if (NIL != cyc_token_with_nameP(current_token, $$$isa, import_parameters)) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str290$__Noting__isa__S__S___, $str239$__ }), new_term_info, value);
                    force_output(UNPROVIDED);
                }
                owl_term_info_plist_push(new_term_info, $ISAS, value);
            } else {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str291$__Noting__S__S__, $str239$__ }), property_name, value);
                    force_output(UNPROVIDED);
                }
                owl_term_info_plist_push(new_term_info, $MY_PRED_VALUES, list(property_name, value));
            }

        return NIL;
    }

    public static SubLObject read_owl_term_reference(final SubLObject token, final SubLObject import_parameters) {
        return term_names_from_token(token, import_parameters);
    }

    public static SubLObject owl_import_parameters_class_prefix(final SubLObject import_parameters) {
        return string_utilities.upcase_leading(owl_import_parameters_constant_prefix(import_parameters));
    }

    public static SubLObject term_names_from_token(final SubLObject token, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject class_prefix = owl_import_parameters_class_prefix(import_parameters);
        final SubLObject about_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$about), UNPROVIDED);
        final SubLObject id_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$ID), UNPROVIDED);
        final SubLObject node_id_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
        final SubLObject resource_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$resource), UNPROVIDED);
        SubLObject external_name = NIL;
        SubLObject cyc_name = NIL;
        if (NIL != about_value) {
            if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name($$$Description))) && ((NIL != string_utilities.alphanumeric_stringP(about_value)) || (NIL != lookup_node_id_reference(about_value)))) {
                external_name = list($NODE_ID, about_value);
            } else {
                external_name = process_owl_attribute_value(about_value);
            }
        } else
            if (NIL != id_value) {
                external_name = process_owl_attribute_value(id_value);
            } else
                if (NIL != node_id_value) {
                    external_name = list($NODE_ID, node_id_value);
                } else
                    if (NIL != resource_value) {
                        external_name = process_owl_attribute_value(resource_value);
                    } else
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str589$Apparently_anonymous_instance___S, $str239$__ }), token);
                            force_output(UNPROVIDED);
                        }




        if ((NIL != external_name) && (NIL == node_id_specification_p(external_name))) {
            cyc_name = owl_class_cyc_name_from_external_name(external_name, class_prefix);
        }
        return values(external_name, cyc_name);
    }

    public static SubLObject owl_external_name_from_token(final SubLObject token, final SubLObject import_parameters) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), term_names_from_token(token, import_parameters));
    }

    public static SubLObject owl_class_cyc_name_from_external_name(final SubLObject external_name, final SubLObject class_prefix) {
        final SubLObject cyc_name_base = (NIL != nonlocal_owl_term_reference_p(external_name)) ? third(external_name) : external_name;
        SubLObject clean_name = string_utilities.char_subst(CHAR_hyphen, CHAR_period, cconcatenate(class_prefix, string_utilities.upcase_leading(cyc_name_base)));
        if (NIL != lower_case_p(string_utilities.first_char(clean_name))) {
            clean_name = string_utilities.upcase_leading(clean_name);
        }
        return clean_name;
    }

    public static SubLObject nonlocal_owl_term_reference_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list590);
    }

    public static SubLObject resolve_nonlocal_owl_term_reference(final SubLObject external_name, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str591$Finding_or_creating_nonlocal_term, $str239$__ }));
            force_output(UNPROVIDED);
        }
        SubLObject current;
        final SubLObject datum = current = external_name.rest();
        SubLObject uri = NIL;
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list400);
        uri = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, UNPROVIDED);
            final SubLObject v_term = owl_find_or_create_term_of_type_in_ontology(name, type, ontology, import_parameters, UNPROVIDED);
            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                format(T, cconcatenate($str237$__, new SubLObject[]{ $str592$Result___S, $str239$__ }), v_term);
                force_output(UNPROVIDED);
            }
            return v_term;
        }
        cdestructuring_bind_error(datum, $list400);
        return NIL;
    }

    public static SubLObject read_owl_class_or_restriction(final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token = tokens.first();
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str593$Reading_OWL_class_or_restriction_, $str239$__ }), list_utilities.first_n(FOUR_INTEGER, tokens));
            force_output(UNPROVIDED);
        }
        if (NIL != owl_class_token_p(next_token)) {
            return read_owl_class(tokens, import_parameters);
        }
        if (NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name($$$Restriction))) {
            thread.resetMultipleValues();
            final SubLObject property = read_owl_restriction(tokens, import_parameters);
            final SubLObject type = thread.secondMultipleValue();
            final SubLObject value = thread.thirdMultipleValue();
            final SubLObject v_class = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return list($RESTRICTION, property, type, value, v_class);
        }
        if (NIL != xml_parsing_utilities.xml_empty_tagP(next_token)) {
            return owl_external_name_from_token(next_token, import_parameters);
        }
        Errors.warn($str595$Can_t_read_class_starting_with__S, next_token);
        return NIL;
    }

    public static SubLObject read_owl_restriction(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == xml_parsing_utilities.xml_token_element_nameP(original_tokens.first(), owl_utilities.owl_name($$$Restriction)))) {
            Errors.error($str596$_S___is_not_the_start_of_an_OWL_r, list_utilities.first_n(TEN_INTEGER, original_tokens));
        }
        final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(original_tokens.first(), rdf_utilities.rdf_name($$$nodeID), UNPROVIDED);
        SubLObject tokens = original_tokens;
        SubLObject state = $INITIAL;
        SubLObject property = NIL;
        SubLObject v_class = $$Thing;
        SubLObject type = NIL;
        SubLObject datatype = NIL;
        SubLObject value = NIL;
        while ((NIL != tokens) && (state != $DONE)) {
            SubLObject token_advance_spec = NIL;
            thread.resetMultipleValues();
            final SubLObject state_$79 = read_part_of_owl_restriction(state, property, v_class, type, datatype, value, tokens, import_parameters);
            final SubLObject property_$80 = thread.secondMultipleValue();
            final SubLObject v_class_$81 = thread.thirdMultipleValue();
            final SubLObject type_$82 = thread.fourthMultipleValue();
            final SubLObject datatype_$83 = thread.fifthMultipleValue();
            final SubLObject value_$84 = thread.sixthMultipleValue();
            final SubLObject token_advance_spec_$85 = thread.seventhMultipleValue();
            thread.resetMultipleValues();
            state = state_$79;
            property = property_$80;
            v_class = v_class_$81;
            type = type_$82;
            datatype = datatype_$83;
            value = value_$84;
            token_advance_spec = token_advance_spec_$85;
            if (NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
            } else
                if (token_advance_spec.isString()) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, UNPROVIDED), UNPROVIDED);
                } else
                    if (token_advance_spec.eql($CLOSE)) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    } else {
                        if (state == $DONE) {
                            continue;
                        }
                        final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                        tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                    }


        } 
        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            format(T, cconcatenate($str237$__, new SubLObject[]{ $str599$Read_restriction___S__S__S__S, $str239$__ }), new SubLObject[]{ property, type, value, v_class });
            force_output(UNPROVIDED);
        }
        if (NIL != string_utilities.non_empty_string_p(node_id)) {
            note_node_id_reference(node_id, list($RESTRICTION, property, type, value, v_class));
        }
        return values(property, type, value, v_class);
    }

    public static SubLObject read_part_of_owl_restriction(SubLObject state, SubLObject property, SubLObject v_class, SubLObject type, SubLObject datatype, SubLObject value, final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token = tokens.first();
        SubLObject token_advance_spec = NIL;
        if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$Restriction))) && (NIL != xml_parsing_utilities.xml_closing_tag_p(token))) {
            state = $DONE;
        } else
            if (((((NIL == xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$Restriction))) || (NIL == xml_parsing_utilities.xml_opening_tag_p(token))) || (NIL != property)) || (NIL != type)) || (NIL != value)) {
                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$onProperty))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(token))) {
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str601$Reading_restriction_property___, $str239$__ }));
                        force_output(UNPROVIDED);
                    }
                    state = $READING_PROPERTY;
                } else
                    if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl11_name($$$onClass))) && (NIL != xml_parsing_utilities.xml_opening_tag_p(token))) {
                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str604$Reading_restriction_class___, $str239$__ }));
                            force_output(UNPROVIDED);
                        }
                        state = $READING_CLASS;
                    } else
                        if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$onProperty))) && (NIL != xml_parsing_utilities.xml_empty_tagP(token))) {
                            property = term_names_from_token(token, import_parameters);
                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str606$Read_restriction_property__S, $str239$__ }), property);
                                force_output(UNPROVIDED);
                            }
                            state = (NIL != value) ? $DONE : $READ_PROPERTY;
                        } else
                            if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl11_name($$$onClass))) && (NIL != xml_parsing_utilities.xml_empty_tagP(token))) {
                                v_class = term_names_from_token(token, import_parameters);
                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str608$Read_restriction_class__S, $str239$__ }), v_class);
                                    force_output(UNPROVIDED);
                                }
                                state = (NIL != value) ? $DONE : $READ_CLASS;
                            } else
                                if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name($$$onProperty))) && (NIL != xml_parsing_utilities.xml_closing_tag_p(token))) {
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (state != $READING_PROPERTY)) {
                                        Errors.error($str610$Got_onProperty_close_tag_when_we_);
                                    }
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == property)) {
                                        Errors.error($str611$Failed_to_read_property_);
                                    }
                                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str606$Read_restriction_property__S, $str239$__ }), property);
                                        force_output(UNPROVIDED);
                                    }
                                    state = (NIL != value) ? $DONE : $READ_PROPERTY;
                                } else
                                    if ((NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl11_name($$$onClass))) && (NIL != xml_parsing_utilities.xml_closing_tag_p(token))) {
                                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (state != $READING_CLASS)) {
                                            Errors.error($str612$Got_onClass_close_tag_when_we_wer);
                                        }
                                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == v_class)) {
                                            Errors.error($str613$Failed_to_read_class_);
                                        }
                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str608$Read_restriction_class__S, $str239$__ }), v_class);
                                            force_output(UNPROVIDED);
                                        }
                                        state = (NIL != value) ? $DONE : $READ_CLASS;
                                    } else
                                        if (state == $READING_PROPERTY) {
                                            property = read_owl_restriction_property(tokens, import_parameters);
                                            token_advance_spec = $CLOSE;
                                        } else
                                            if (state == $READING_CLASS) {
                                                v_class = read_owl_restriction_class(tokens, import_parameters);
                                                token_advance_spec = $CLOSE;
                                            } else
                                                if (NIL != member(xml_parsing_utilities.xml_token_element_name(token), list(owl_utilities.owl_name($$$allValuesFrom), owl_utilities.owl_name($$$someValuesFrom), owl_utilities.owl_name($$$hasValue), owl_utilities.owl_name($$$cardinality), owl_utilities.owl_name($$$minCardinality), owl_utilities.owl_name($$$maxCardinality)), symbol_function(EQUAL), UNPROVIDED)) {
                                                    type = xml_parsing_utilities.xml_token_element_name(token);
                                                    datatype = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name($$$datatype), UNPROVIDED));
                                                    if (NIL != nonlocal_owl_term_reference_p(datatype)) {
                                                        datatype = third(datatype);
                                                    }
                                                    if ((NIL != datatype) && (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread))) {
                                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str614$Read_datatype__S_from__S, $str239$__ }), datatype, token);
                                                        force_output(UNPROVIDED);
                                                    }
                                                    state = $READ_TYPE;
                                                    if (NIL != xml_parsing_utilities.xml_empty_tagP(token)) {
                                                        final SubLObject class_name = term_names_from_token(token, import_parameters);
                                                        value = owl_find_or_create_term_from_specification(class_name, $const349$owl_Class, import_parameters);
                                                        if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                            format(T, cconcatenate($str237$__, new SubLObject[]{ $str616$Read_value__S_from__S, $str239$__ }), value, token);
                                                            force_output(UNPROVIDED);
                                                        }
                                                        state = (NIL != property) ? $DONE : $READ_VALUE;
                                                    }
                                                } else
                                                    if ((state == $READ_TYPE) && (NIL != owl_class_token_p(token))) {
                                                        final SubLObject class_name = read_owl_class(tokens, import_parameters);
                                                        final SubLObject type_name = process_owl_attribute_value(xml_parsing_utilities.xml_token_element_name(token));
                                                        final SubLObject _prev_bind_0 = $owl_force_new_term_creationP$.currentBinding(thread);
                                                        try {
                                                            $owl_force_new_term_creationP$.bind(T, thread);
                                                            final SubLObject type_$86 = owl_find_or_create_term_from_specification(type_name, $const349$owl_Class, import_parameters);
                                                            final SubLObject this_class = owl_find_or_create_term_from_specification(class_name, type_$86, import_parameters);
                                                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == this_class)) {
                                                                Errors.error($str618$Failed_to_read_restriction_value_);
                                                            }
                                                            value = this_class;
                                                            if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                format(T, cconcatenate($str237$__, new SubLObject[]{ $str619$Read_restriction_value__S, $str239$__ }), value);
                                                                force_output(UNPROVIDED);
                                                            }
                                                            state = $READ_VALUE;
                                                        } finally {
                                                            $owl_force_new_term_creationP$.rebind(_prev_bind_0, thread);
                                                        }
                                                    } else
                                                        if ((state == $READ_TYPE) && (NIL == xml_parsing_utilities.xml_tagP(token))) {
                                                            value = owl_value_from_string(token, datatype);
                                                            if (NIL != value) {
                                                                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str619$Read_restriction_value__S, $str239$__ }), value);
                                                                    force_output(UNPROVIDED);
                                                                }
                                                                state = $READ_VALUE;
                                                            }
                                                        } else
                                                            if ((state == $READ_TYPE) && ((NIL != xml_parsing_utilities.xml_opening_tag_p(token)) || (NIL != xml_parsing_utilities.xml_empty_tagP(token)))) {
                                                                final SubLObject term_info = nth_value_step_2(nth_value_step_1(ONE_INTEGER), read_one_instance_info_from_owl_tokens(tokens, import_parameters));
                                                                assert NIL != owl_term_info_p(term_info) : "owl_to_cycl.owl_term_info_p(term_info) " + "CommonSymbols.NIL != owl_to_cycl.owl_term_info_p(term_info) " + term_info;
                                                                value = owl_term_info_plist_lookup(term_info, $EXTERNAL_NAME, UNPROVIDED);
                                                                if (NIL != value) {
                                                                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                                                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str619$Read_restriction_value__S, $str239$__ }), value);
                                                                        force_output(UNPROVIDED);
                                                                    }
                                                                    state = (NIL != property) ? $DONE : $READ_VALUE;
                                                                }
                                                            }











            }

        return values(state, property, v_class, type, datatype, value, token_advance_spec);
    }

    public static SubLObject read_owl_restriction_property(SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_token = tokens.first();
        final SubLObject name = read_owl_term_reference(first_token, import_parameters);
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind($PROPERTY, thread);
            SubLObject pred_info = NIL;
            SubLObject current_token = first_token;
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str620$__Reading_OWL_property_starting_w, $str239$__ }), list_utilities.first_n(FOUR_INTEGER, tokens));
                    force_output(UNPROVIDED);
                }
                thread.resetMultipleValues();
                final SubLObject new_pred_info = read_one_owl_chunk_for_pred_info(current_token, pred_info, import_parameters, tokens);
                final SubLObject token_advance_spec = thread.secondMultipleValue();
                final SubLObject pred_info_doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                pred_info = new_pred_info;
                if (NIL != pred_info_doneP) {
                    accumulate_owl_definition(new_pred_info, $PROPERTY);
                    doneP = T;
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str621$__Done_with__S__, $str239$__ }), new_pred_info);
                        force_output(UNPROVIDED);
                    }
                }
                if (NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
                } else
                    if (token_advance_spec.isString()) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, UNPROVIDED), UNPROVIDED);
                    } else
                        if (token_advance_spec.eql($CLOSE)) {
                            tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                        } else {
                            final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                            tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                        }


                current_token = tokens.first();
            } 
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return name;
    }

    public static SubLObject read_owl_restriction_class(SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_token = tokens.first();
        final SubLObject name = read_owl_term_reference(first_token, import_parameters);
        final SubLObject _prev_bind_0 = $owl_definition_type$.currentBinding(thread);
        try {
            $owl_definition_type$.bind($CLASS, thread);
            SubLObject term_info = NIL;
            SubLObject current_token = first_token;
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    format(T, cconcatenate($str237$__, new SubLObject[]{ $str622$__Reading_OWL_class_starting_with, $str239$__ }), list_utilities.first_n(FOUR_INTEGER, tokens));
                    force_output(UNPROVIDED);
                }
                thread.resetMultipleValues();
                final SubLObject new_term_info = read_one_owl_chunk_for_class_info(current_token, term_info, import_parameters, tokens);
                final SubLObject token_advance_spec = thread.secondMultipleValue();
                final SubLObject term_info_doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                term_info = new_term_info;
                if (NIL != term_info_doneP) {
                    accumulate_owl_definition(new_term_info, $CLASS);
                    doneP = T;
                    if (NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        format(T, cconcatenate($str237$__, new SubLObject[]{ $str621$__Done_with__S__, $str239$__ }), new_term_info);
                        force_output(UNPROVIDED);
                    }
                }
                if (NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
                } else
                    if (token_advance_spec.isString()) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, UNPROVIDED), UNPROVIDED);
                    } else
                        if (token_advance_spec.eql($CLOSE)) {
                            tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                        } else {
                            final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                            tokens = (NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : NIL;
                        }


                current_token = tokens.first();
            } 
        } finally {
            $owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return name;
    }

    public static SubLObject owl_value_from_string(final SubLObject token, final SubLObject datatype) {
        final SubLObject local_datatype = (NIL != nonlocal_owl_term_reference_p(datatype)) ? third(datatype) : datatype;
        final SubLObject trimmed_token = string_utilities.trim_whitespace(token);
        SubLObject value = NIL;
        if (NIL != Guids.guid_string_p(trimmed_token)) {
            return trimmed_token;
        }
        if ((NIL != member(local_datatype, $owl_interval_datatypes$.getGlobalValue(), EQUALP, UNPROVIDED)) || (NIL == local_datatype)) {
            final SubLObject parsed_value = numeral_parser.string_to_interval(trimmed_token);
            final SubLObject read_value = (parsed_value.isNumber()) ? NIL : read_from_string_ignoring_errors(trimmed_token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject numeric_value = (parsed_value.isNumber()) ? parsed_value : read_value.isNumber() ? read_value : NIL;
            if ((NIL != local_datatype) && (NIL == numeric_value)) {
                Errors.warn($str624$Can_t_parse__S_as_a__A, token, local_datatype);
            }
            value = (NIL != numeric_value) ? numeric_value : token;
        } else {
            if (local_datatype.equalp($$$string)) {
                return token;
            }
            if (local_datatype.equalp($$$boolean)) {
                if (NIL != subl_promotions.memberP(trimmed_token, $list626, symbol_function(EQUALP), UNPROVIDED)) {
                    value = $$True;
                } else
                    if (NIL != subl_promotions.memberP(trimmed_token, $list628, symbol_function(EQUALP), UNPROVIDED)) {
                        value = $$False;
                    } else {
                        Errors.warn($str630$Couldn_t_read_boolean_value_from_, token);
                    }

            } else
                if (local_datatype.equalp($$$date)) {
                    final SubLObject dates = date_utilities.parse_date_from_string_fast(trimmed_token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject pcase_var = length(dates);
                    if (pcase_var.eql(ONE_INTEGER)) {
                        value = list_utilities.only_one(dates);
                    } else
                        if (pcase_var.eql(ZERO_INTEGER)) {
                            Errors.warn($str632$Couldn_t_parse_date_from__S, token);
                        } else {
                            final SubLObject days = list_utilities.find_all($$DayFn, dates, symbol_function(EQL), NAT_FUNCTOR);
                            if (NIL != list_utilities.singletonP(days)) {
                                value = list_utilities.only_one(days);
                            } else {
                                Errors.warn($str635$Got_multiple_dates_from__S_____S, token, dates);
                            }
                        }

                } else {
                    Errors.warn($str636$Don_t_know_how_to_parse_value_fro, token, local_datatype);
                }

        }
        return value;
    }

    public static SubLObject clear_xml_name() {
        final SubLObject cs = $xml_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_xml_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($xml_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xml_name_internal(final SubLObject local_name) {
        return cconcatenate($str638$xml_, local_name);
    }

    public static SubLObject xml_name(final SubLObject local_name) {
        SubLObject caching_state = $xml_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(XML_NAME, $xml_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(xml_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_importer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_importer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject owl_importer_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$owl_importer_native.class ? T : NIL;
    }

    public static SubLObject owl_imp_id(final SubLObject v_object) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject owl_imp_progress(final SubLObject v_object) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject owl_imp_error_info(final SubLObject v_object) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject owl_imp_import_parameters(final SubLObject v_object) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject owl_imp_thread(final SubLObject v_object) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_owl_imp_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_owl_imp_progress(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_owl_imp_error_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_owl_imp_import_parameters(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_owl_imp_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer_p(v_object) : "owl_to_cycl.owl_importer_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_owl_importer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $owl_importer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_owl_imp_id(v_new, current_value);
            } else
                if (pcase_var.eql($PROGRESS)) {
                    _csetf_owl_imp_progress(v_new, current_value);
                } else
                    if (pcase_var.eql($ERROR_INFO)) {
                        _csetf_owl_imp_error_info(v_new, current_value);
                    } else
                        if (pcase_var.eql($IMPORT_PARAMETERS)) {
                            _csetf_owl_imp_import_parameters(v_new, current_value);
                        } else
                            if (pcase_var.eql($THREAD)) {
                                _csetf_owl_imp_thread(v_new, current_value);
                            } else {
                                Errors.error($str147$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_owl_importer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_OWL_IMPORTER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, owl_imp_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS, owl_imp_progress(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_INFO, owl_imp_error_info(obj));
        funcall(visitor_fn, obj, $SLOT, $IMPORT_PARAMETERS, owl_imp_import_parameters(obj));
        funcall(visitor_fn, obj, $SLOT, $THREAD, owl_imp_thread(obj));
        funcall(visitor_fn, obj, $END, MAKE_OWL_IMPORTER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_owl_importer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_importer(obj, visitor_fn);
    }

    public static SubLObject print_owl_importer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str666$_OWL_IMPORTER__D_, owl_imp_id(v_object));
        return v_object;
    }

    public static SubLObject new_owl_importer() {
        final SubLObject importer = make_owl_importer(UNPROVIDED);
        final SubLObject id = id_index_reserve(owl_importer_id_index());
        _csetf_owl_imp_id(importer, id);
        id_index_enter(owl_importer_id_index(), id, importer);
        return importer;
    }

    public static SubLObject owl_importer_id(final SubLObject importer) {
        assert NIL != owl_importer_p(importer) : "owl_to_cycl.owl_importer_p(importer) " + "CommonSymbols.NIL != owl_to_cycl.owl_importer_p(importer) " + importer;
        return owl_imp_id(importer);
    }

    public static SubLObject owl_importer_progress(final SubLObject importer) {
        assert NIL != owl_importer_p(importer) : "owl_to_cycl.owl_importer_p(importer) " + "CommonSymbols.NIL != owl_to_cycl.owl_importer_p(importer) " + importer;
        return owl_imp_progress(importer);
    }

    public static SubLObject owl_importer_error_info(final SubLObject importer) {
        assert NIL != owl_importer_p(importer) : "owl_to_cycl.owl_importer_p(importer) " + "CommonSymbols.NIL != owl_to_cycl.owl_importer_p(importer) " + importer;
        return owl_imp_error_info(importer);
    }

    public static SubLObject owl_importer_import_parameters(final SubLObject importer) {
        assert NIL != owl_importer_p(importer) : "owl_to_cycl.owl_importer_p(importer) " + "CommonSymbols.NIL != owl_to_cycl.owl_importer_p(importer) " + importer;
        return owl_imp_import_parameters(importer);
    }

    public static SubLObject owl_importer_thread(final SubLObject importer) {
        assert NIL != owl_importer_p(importer) : "owl_to_cycl.owl_importer_p(importer) " + "CommonSymbols.NIL != owl_to_cycl.owl_importer_p(importer) " + importer;
        return owl_imp_thread(importer);
    }

    public static SubLObject sxhash_owl_importer_method(final SubLObject v_object) {
        return sxhash_owl_importer(v_object);
    }

    public static SubLObject sxhash_owl_importer(final SubLObject importer) {
        return Sxhash.sxhash(owl_imp_id(importer));
    }

    public static SubLObject import_owl_ontology_with_importer(final SubLObject uri, final SubLObject constant_prefix, SubLObject source, SubLObject ontology, SubLObject prefix_external_namesP, SubLObject abbreviate_prefixesP, SubLObject quoted_isa, SubLObject cyclist) {
        if (source == UNPROVIDED) {
            source = uri;
        }
        if (ontology == UNPROVIDED) {
            ontology = NIL;
        }
        if (prefix_external_namesP == UNPROVIDED) {
            prefix_external_namesP = NIL;
        }
        if (abbreviate_prefixesP == UNPROVIDED) {
            abbreviate_prefixesP = NIL;
        }
        if (quoted_isa == UNPROVIDED) {
            quoted_isa = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        return import_owl_ontology_with_importer_from_info(list_utilities.make_plist($list669, list(uri, constant_prefix, source, ontology, prefix_external_namesP, abbreviate_prefixesP, quoted_isa, cyclist)));
    }

    public static SubLObject import_owl_ontology_with_importer_from_info(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uri = getf(import_info, $URI, UNPROVIDED);
        final SubLObject uri_prefix = getf(import_info, $URI_PREFIX, UNPROVIDED);
        final SubLObject constant_prefix = getf(import_info, $CONSTANT_PREFIX, UNPROVIDED);
        final SubLObject constant_suffix = getf(import_info, $CONSTANT_SUFFIX, UNPROVIDED);
        SubLObject source = getf(import_info, $SOURCE, UNPROVIDED);
        SubLObject ontology = getf(import_info, $ONTOLOGY, UNPROVIDED);
        final SubLObject prefix_external_namesP = getf(import_info, $kw69$PREFIX_EXTERNAL_NAMES_, UNPROVIDED);
        final SubLObject abbreviate_prefixesP = getf(import_info, $kw70$ABBREVIATE_PREFIXES_, UNPROVIDED);
        SubLObject quoted_isa = getf(import_info, $QUOTED_ISA, UNPROVIDED);
        SubLObject cyclist = getf(import_info, $CYCLIST, UNPROVIDED);
        if (NIL == cyclist) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue(thread);
        }
        uri = string_utilities.strip_final_if_char(uri, CHAR_hash);
        if (NIL == ontology) {
            ontology = find_or_create_owl_ontology_for_uri(uri, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == quoted_isa) {
            quoted_isa = find_or_create_term_type_for_ontology(ontology, UNPROVIDED);
        }
        if (NIL == string_utilities.non_empty_string_p(source)) {
            source = uri;
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == web_utilities.uri_p(source, UNPROVIDED))) && (NIL == file_utilities.file_existsP(source))) {
            Errors.error($str71$Can_only_import_OWL_ontologies_fr);
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            ke.ensure_cyclist_ok();
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        assert NIL != web_utilities.uri_p(uri, UNPROVIDED) : "web_utilities.uri_p(uri, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != web_utilities.uri_p(uri, CommonSymbols.UNPROVIDED) " + uri;
        final SubLObject importer = new_owl_importer();
        process_utilities.make_cyc_server_process_with_args($$$OWL_Importer, OWL_IMPORTER_RUN, list(list_utilities.make_plist($list672, list(new SubLObject[]{ importer, uri, constant_prefix, constant_suffix, uri_prefix, source, ontology, quoted_isa, cyclist, prefix_external_namesP, abbreviate_prefixesP }))));
        return owl_importer_id(importer);
    }

    public static SubLObject get_owl_importer_ontology(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        final SubLObject import_parameters = (NIL != importer) ? owl_importer_import_parameters(importer) : NIL;
        return NIL != import_parameters ? owl_import_parameters_ontology(import_parameters) : NIL;
    }

    public static SubLObject get_owl_importer_progress(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        return NIL != importer ? copy_list(owl_importer_progress(importer)) : NIL;
    }

    public static SubLObject get_owl_importer_error_info(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        return NIL != importer ? copy_list(owl_importer_error_info(importer)) : NIL;
    }

    public static SubLObject owl_importer_done_p(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        return eql(owl_importer_progress(importer).first(), $DONE);
    }

    public static SubLObject owl_importer_exists_p(final SubLObject importer_id) {
        return list_utilities.sublisp_boolean(find_owl_importer_by_id(importer_id));
    }

    public static SubLObject owl_importer_id_index() {
        if (NIL == id_index_p($owl_importer_id_index$.getGlobalValue())) {
            $owl_importer_id_index$.setGlobalValue(new_id_index($int$32, ZERO_INTEGER));
        }
        return $owl_importer_id_index$.getGlobalValue();
    }

    public static SubLObject find_owl_importer_by_id(final SubLObject id) {
        return id_index_lookup(owl_importer_id_index(), id, NIL);
    }

    public static SubLObject note_owl_import_parameters(final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_import_parameters($owl_importer$.getDynamicValue(thread), import_parameters);
        }
        return import_parameters;
    }

    public static SubLObject note_owl_import_section_progress(final SubLObject percent_done) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_importer$.getDynamicValue(thread)) {
            final SubLObject item = owl_importer_progress($owl_importer$.getDynamicValue(thread)).first();
            final SubLObject start_time = item.first();
            set_nth(ONE_INTEGER, item, percent_done);
            set_nth(TWO_INTEGER, item, subl_promotions.elapsed_universal_time(start_time, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject note_owl_import_section_started() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_progress($owl_importer$.getDynamicValue(thread), cons(list(get_universal_time(), ZERO_INTEGER, ZERO_INTEGER), owl_imp_progress($owl_importer$.getDynamicValue(thread))));
        }
        return NIL;
    }

    public static SubLObject note_owl_import_section_done() {
        note_owl_import_section_progress(ONE_INTEGER);
        return NIL;
    }

    public static SubLObject note_owl_import_done() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_progress($owl_importer$.getDynamicValue(thread), cons($DONE, owl_imp_progress($owl_importer$.getDynamicValue(thread))));
        }
        return NIL;
    }

    public static SubLObject note_owl_import_problem(final SubLObject item, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_error_info($owl_importer$.getDynamicValue(thread), cons(list(item, message), owl_imp_error_info($owl_importer$.getDynamicValue(thread))));
        }
        return NIL;
    }

    public static SubLObject owl_importer_run(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject importer = getf(import_info, $IMPORTER, UNPROVIDED);
        _csetf_owl_imp_thread(importer, current_process());
        final SubLObject _prev_bind_0 = $owl_importer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $silent_progressP$.currentBinding(thread);
        try {
            $owl_importer$.bind(importer, thread);
            $silent_progressP$.bind(T, thread);
            import_owl_ontology_from_info(import_info);
        } finally {
            $silent_progressP$.rebind(_prev_bind_2, thread);
            $owl_importer$.rebind(_prev_bind_0, thread);
        }
        return importer;
    }

    public static SubLObject import_sample_ontologies() {
        import_owl_ontology($str677$http___www_w3_org_TR_owl_guide_wi, $str678$WINE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = $sweet_ontologies$.getGlobalValue();
        SubLObject ontology = NIL;
        ontology = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            import_owl_ontology(cconcatenate($sweet_root$.getGlobalValue(), new SubLObject[]{ ontology, $str679$_owl }), $str680$SWEET_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            ontology = cdolist_list_var.first();
        } 
        import_owl_ontology($str681$http___reliant_teknowledge_com_DA, $str682$SUMO_, $str683$http___open_meta_com_SUMO_owl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        import_owl_ontology($str684$http___kmf_patrick_afspc_ds_af_mi, $str685$KMF_, $str686$_home_baxter_tmp_decision_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_owl_to_cycl_file() {
        declareFunction(me, "owl_importer_v1_version_number", "OWL-IMPORTER-V1-VERSION-NUMBER", 0, 0, false);
        declareFunction(me, "current_owl_importer", "CURRENT-OWL-IMPORTER", 0, 0, false);
        declareFunction(me, "guess_terms_for_owl_term", "GUESS-TERMS-FOR-OWL-TERM", 3, 0, false);
        declareFunction(me, "root_classes_of_owl_ontology", "ROOT-CLASSES-OF-OWL-ONTOLOGY", 1, 0, false);
        declareFunction(me, "clear_owl_importer_caches", "CLEAR-OWL-IMPORTER-CACHES", 0, 0, false);
        declareFunction(me, "root_classes_of_owl_ontology_via_inference", "ROOT-CLASSES-OF-OWL-ONTOLOGY-VIA-INFERENCE", 1, 0, false);
        declareFunction(me, "term_of_owl_ontologyP_via_index", "TERM-OF-OWL-ONTOLOGY?-VIA-INDEX", 2, 0, false);
        declareFunction(me, "term_of_some_owl_ontologyP_via_index_internal", "TERM-OF-SOME-OWL-ONTOLOGY?-VIA-INDEX-INTERNAL", 1, 0, false);
        declareFunction(me, "term_of_some_owl_ontologyP_via_index", "TERM-OF-SOME-OWL-ONTOLOGY?-VIA-INDEX", 1, 0, false);
        declareFunction(me, "all_terms_of_owl_ontology_via_index", "ALL-TERMS-OF-OWL-ONTOLOGY-VIA-INDEX", 1, 0, false);
        declareFunction(me, "owl_ontology_percent_of_classes_merged", "OWL-ONTOLOGY-PERCENT-OF-CLASSES-MERGED", 1, 0, false);
        declareFunction(me, "owl_ontology_average_class_depth", "OWL-ONTOLOGY-AVERAGE-CLASS-DEPTH", 1, 0, false);
        declareFunction(me, "owl_ontology_average_root_class_depth", "OWL-ONTOLOGY-AVERAGE-ROOT-CLASS-DEPTH", 1, 0, false);
        declareFunction(me, "all_classes_of_owl_ontology_via_index", "ALL-CLASSES-OF-OWL-ONTOLOGY-VIA-INDEX", 1, 0, false);
        declareFunction(me, "owl_class_mergedP_via_index", "OWL-CLASS-MERGED?-VIA-INDEX", 1, 0, false);
        declareFunction(me, "owl_class_merged_upwardP_via_index", "OWL-CLASS-MERGED-UPWARD?-VIA-INDEX", 1, 0, false);
        declareFunction(me, "owl_class_merged_downwardP_via_index", "OWL-CLASS-MERGED-DOWNWARD?-VIA-INDEX", 1, 0, false);
        declareFunction(me, "owl_merge_mt", "OWL-MERGE-MT", 0, 0, false);
        declareFunction(me, "owl_merge_assert", "OWL-MERGE-ASSERT", 1, 0, false);
        declareFunction(me, "merge_owl_class_with_collection", "MERGE-OWL-CLASS-WITH-COLLECTION", 2, 0, false);
        declareFunction(me, "merge_owl_term_with_cyc_term", "MERGE-OWL-TERM-WITH-CYC-TERM", 2, 0, false);
        declareFunction(me, "link_owl_class_down_to_collection", "LINK-OWL-CLASS-DOWN-TO-COLLECTION", 2, 0, false);
        declareFunction(me, "link_owl_class_up_to_collection", "LINK-OWL-CLASS-UP-TO-COLLECTION", 2, 0, false);
        declareFunction(me, "next_owl_term_to_merge_for_ontology", "NEXT-OWL-TERM-TO-MERGE-FOR-ONTOLOGY", 1, 0, false);
        declareFunction(me, "memoized_count_all_specs_internal", "MEMOIZED-COUNT-ALL-SPECS-INTERNAL", 1, 0, false);
        declareFunction(me, "memoized_count_all_specs", "MEMOIZED-COUNT-ALL-SPECS", 1, 0, false);
        declareFunction(me, "longest_acyclic_genls_path_length", "LONGEST-ACYCLIC-GENLS-PATH-LENGTH", 2, 1, false);
        declareFunction(me, "longest_acyclic_genls_path", "LONGEST-ACYCLIC-GENLS-PATH", 2, 1, false);
        declareFunction(me, "longest_acyclic_genls_path_internal_internal", "LONGEST-ACYCLIC-GENLS-PATH-INTERNAL-INTERNAL", 3, 0, false);
        declareFunction(me, "longest_acyclic_genls_path_internal", "LONGEST-ACYCLIC-GENLS-PATH-INTERNAL", 3, 0, false);
        declareFunction(me, "owl_min_genls_memoized_internal", "OWL-MIN-GENLS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "owl_min_genls_memoized", "OWL-MIN-GENLS-MEMOIZED", 1, 0, false);
        declareFunction(me, "genls_tree_with_root_via_index", "GENLS-TREE-WITH-ROOT-VIA-INDEX", 1, 2, false);
        declareFunction(me, "genls_tree_with_root_via_index_internal", "GENLS-TREE-WITH-ROOT-VIA-INDEX-INTERNAL", 4, 0, false);
        declareFunction(me, "root_classes_of_owl_ontology_via_index", "ROOT-CLASSES-OF-OWL-ONTOLOGY-VIA-INDEX", 1, 0, false);
        declareFunction(me, "guess_forts_from_owl_term_name", "GUESS-FORTS-FROM-OWL-TERM-NAME", 1, 0, false);
        declareFunction(me, "guess_forts_from_owl_term_name_non_partitioned", "GUESS-FORTS-FROM-OWL-TERM-NAME-NON-PARTITIONED", 1, 0, false);
        declareFunction(me, "partition_cycl_terms_for_owl_term_name", "PARTITION-CYCL-TERMS-FOR-OWL-TERM-NAME", 2, 0, false);
        declareFunction(me, "owl_term_names", "OWL-TERM-NAMES", 0, 0, false);
        declareFunction(me, "new_owl_definition_accumulator", "NEW-OWL-DEFINITION-ACCUMULATOR", 0, 0, false);
        declareFunction(me, "accumulate_owl_definition", "ACCUMULATE-OWL-DEFINITION", 2, 0, false);
        declareFunction(me, "merge_owl_definitions", "MERGE-OWL-DEFINITIONS", 2, 0, false);
        declareFunction(me, "find_accumulated_owl_definition", "FIND-ACCUMULATED-OWL-DEFINITION", 2, 0, false);
        declareFunction(me, "find_owl_definition_of_type", "FIND-OWL-DEFINITION-OF-TYPE", 3, 0, false);
        declareFunction(me, "owl_definition_name", "OWL-DEFINITION-NAME", 1, 1, false);
        declareFunction(me, "accumulated_owl_definitions_of_type", "ACCUMULATED-OWL-DEFINITIONS-OF-TYPE", 1, 0, false);
        declareFunction(me, "set_accumulated_owl_definitions_of_type", "SET-ACCUMULATED-OWL-DEFINITIONS-OF-TYPE", 2, 0, false);
        declareFunction(me, "owl_accumulator_index_for_type", "OWL-ACCUMULATOR-INDEX-FOR-TYPE", 1, 0, false);
        declareFunction(me, "import_owl_ontology", "IMPORT-OWL-ONTOLOGY", 2, 6, false);
        declareFunction(me, "import_owl_ontology_from_info", "IMPORT-OWL-ONTOLOGY-FROM-INFO", 1, 0, false);
        declareFunction(me, "clear_xml_tokens_from_file", "CLEAR-XML-TOKENS-FROM-FILE", 0, 0, false);
        declareFunction(me, "remove_xml_tokens_from_file", "REMOVE-XML-TOKENS-FROM-FILE", 1, 0, false);
        declareFunction(me, "xml_tokens_from_file_internal", "XML-TOKENS-FROM-FILE-INTERNAL", 1, 0, false);
        declareFunction(me, "xml_tokens_from_file", "XML-TOKENS-FROM-FILE", 1, 0, false);
        declareFunction(me, "import_owl_ontology_internal", "IMPORT-OWL-ONTOLOGY-INTERNAL", 4, 0, false);
        declareFunction(me, "note_owl_file_encoding", "NOTE-OWL-FILE-ENCODING", 2, 0, false);
        declareFunction(me, "reify_term_for_new_import", "REIFY-TERM-FOR-NEW-IMPORT", 1, 0, false);
        declareFunction(me, "owl_ontology_name", "OWL-ONTOLOGY-NAME", 1, 0, false);
        declareFunction(me, "note_import_start_time", "NOTE-IMPORT-START-TIME", 2, 0, false);
        declareFunction(me, "note_import_ontology", "NOTE-IMPORT-ONTOLOGY", 2, 0, false);
        declareFunction(me, "note_import_cyclist", "NOTE-IMPORT-CYCLIST", 2, 0, false);
        declareFunction(me, "note_import_end_time", "NOTE-IMPORT-END-TIME", 2, 0, false);
        declareFunction(me, "import_owl_ontology_info", "IMPORT-OWL-ONTOLOGY-INFO", 3, 0, false);
        declareFunction(me, "note_owl_ontology_base_uri", "NOTE-OWL-ONTOLOGY-BASE-URI", 2, 0, false);
        declareFunction(me, "find_owl_ontology_base_uri", "FIND-OWL-ONTOLOGY-BASE-URI", 1, 0, false);
        declareFunction(me, "clear_owl_import_parameters_ontology_context", "CLEAR-OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT", 0, 0, false);
        declareFunction(me, "remove_owl_import_parameters_ontology_context", "REMOVE-OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT", 1, 0, false);
        declareFunction(me, "owl_import_parameters_ontology_context_internal", "OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT-INTERNAL", 1, 0, false);
        declareFunction(me, "owl_import_parameters_ontology_context", "OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT", 1, 0, false);
        declareFunction(me, "get_owl_ontology_context", "GET-OWL-ONTOLOGY-CONTEXT", 1, 0, false);
        declareFunction(me, "import_owl_ontology_info_internal", "IMPORT-OWL-ONTOLOGY-INFO-INTERNAL", 3, 0, false);
        declareFunction(me, "owl_pred_info_print_function_trampoline", "OWL-PRED-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "owl_pred_info_p", "OWL-PRED-INFO-P", 1, 0, false);
        new owl_to_cycl.$owl_pred_info_p$UnaryFunction();
        declareFunction(me, "opi_cyc_name", "OPI-CYC-NAME", 1, 0, false);
        declareFunction(me, "opi_comment", "OPI-COMMENT", 1, 0, false);
        declareFunction(me, "opi_domains", "OPI-DOMAINS", 1, 0, false);
        declareFunction(me, "opi_range", "OPI-RANGE", 1, 0, false);
        declareFunction(me, "opi_plist", "OPI-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_opi_cyc_name", "_CSETF-OPI-CYC-NAME", 2, 0, false);
        declareFunction(me, "_csetf_opi_comment", "_CSETF-OPI-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_opi_domains", "_CSETF-OPI-DOMAINS", 2, 0, false);
        declareFunction(me, "_csetf_opi_range", "_CSETF-OPI-RANGE", 2, 0, false);
        declareFunction(me, "_csetf_opi_plist", "_CSETF-OPI-PLIST", 2, 0, false);
        declareFunction(me, "make_owl_pred_info", "MAKE-OWL-PRED-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_owl_pred_info", "VISIT-DEFSTRUCT-OWL-PRED-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_owl_pred_info_method", "VISIT-DEFSTRUCT-OBJECT-OWL-PRED-INFO-METHOD", 2, 0, false);
        declareFunction(me, "print_owl_pred_info", "PRINT-OWL-PRED-INFO", 3, 0, false);
        declareFunction(me, "find_or_create_owl_pred_info", "FIND-OR-CREATE-OWL-PRED-INFO", 1, 0, false);
        declareFunction(me, "new_owl_pred_info", "NEW-OWL-PRED-INFO", 1, 4, false);
        declareFunction(me, "owl_pred_info_cyc_name", "OWL-PRED-INFO-CYC-NAME", 1, 0, false);
        declareFunction(me, "owl_pred_info_comment", "OWL-PRED-INFO-COMMENT", 1, 0, false);
        declareFunction(me, "owl_pred_info_domains", "OWL-PRED-INFO-DOMAINS", 1, 0, false);
        declareFunction(me, "owl_pred_info_range", "OWL-PRED-INFO-RANGE", 1, 0, false);
        declareFunction(me, "owl_pred_info_plist", "OWL-PRED-INFO-PLIST", 1, 0, false);
        declareFunction(me, "owl_pred_info_plist_lookup", "OWL-PRED-INFO-PLIST-LOOKUP", 2, 1, false);
        declareFunction(me, "owl_pred_info_external_name", "OWL-PRED-INFO-EXTERNAL-NAME", 1, 1, false);
        declareFunction(me, "set_owl_pred_info_cyc_name", "SET-OWL-PRED-INFO-CYC-NAME", 2, 0, false);
        declareFunction(me, "set_owl_pred_info_comment", "SET-OWL-PRED-INFO-COMMENT", 2, 0, false);
        declareFunction(me, "set_owl_pred_info_domains", "SET-OWL-PRED-INFO-DOMAINS", 2, 0, false);
        declareFunction(me, "set_owl_pred_info_range", "SET-OWL-PRED-INFO-RANGE", 2, 0, false);
        declareFunction(me, "merge_owl_pred_definitions", "MERGE-OWL-PRED-DEFINITIONS", 2, 0, false);
        declareFunction(me, "owl_external_value_specification_p", "OWL-EXTERNAL-VALUE-SPECIFICATION-P", 1, 0, false);
        declareFunction(me, "node_id_specification_p", "NODE-ID-SPECIFICATION-P", 1, 0, false);
        declareFunction(me, "owl_restriction_p", "OWL-RESTRICTION-P", 1, 0, false);
        declareFunction(me, "owl_external_value_specification_union_p", "OWL-EXTERNAL-VALUE-SPECIFICATION-UNION-P", 1, 0, false);
        declareFunction(me, "owl_external_value_specification_union_names", "OWL-EXTERNAL-VALUE-SPECIFICATION-UNION-NAMES", 1, 0, false);
        declareFunction(me, "owl_external_value_specification_intersection_p", "OWL-EXTERNAL-VALUE-SPECIFICATION-INTERSECTION-P", 1, 0, false);
        declareFunction(me, "owl_external_value_specification_intersection_names", "OWL-EXTERNAL-VALUE-SPECIFICATION-INTERSECTION-NAMES", 1, 0, false);
        declareFunction(me, "owl_external_term_enumeration_p", "OWL-EXTERNAL-TERM-ENUMERATION-P", 1, 0, false);
        declareFunction(me, "owl_external_term_enumeration_terms", "OWL-EXTERNAL-TERM-ENUMERATION-TERMS", 1, 0, false);
        declareFunction(me, "owl_pred_info_plist_enter", "OWL-PRED-INFO-PLIST-ENTER", 3, 0, false);
        declareFunction(me, "owl_pred_info_plist_push", "OWL-PRED-INFO-PLIST-PUSH", 3, 0, false);
        declareFunction(me, "sxhash_owl_pred_info_method", "SXHASH-OWL-PRED-INFO-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_owl_pred_info", "SXHASH-OWL-PRED-INFO", 1, 0, false);
        declareFunction(me, "owl_import_parameters_print_function_trampoline", "OWL-IMPORT-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "owl_import_parameters_p", "OWL-IMPORT-PARAMETERS-P", 1, 0, false);
        new owl_to_cycl.$owl_import_parameters_p$UnaryFunction();
        declareFunction(me, "oip_ontology", "OIP-ONTOLOGY", 1, 0, false);
        declareFunction(me, "oip_namespace_map", "OIP-NAMESPACE-MAP", 1, 0, false);
        declareFunction(me, "oip_constant_prefix", "OIP-CONSTANT-PREFIX", 1, 0, false);
        declareFunction(me, "oip_constant_suffix", "OIP-CONSTANT-SUFFIX", 1, 0, false);
        declareFunction(me, "oip_base_uri", "OIP-BASE-URI", 1, 0, false);
        declareFunction(me, "oip_uri_prefix", "OIP-URI-PREFIX", 1, 0, false);
        declareFunction(me, "oip_cyclist", "OIP-CYCLIST", 1, 0, false);
        declareFunction(me, "oip_quoted_isa", "OIP-QUOTED-ISA", 1, 0, false);
        declareFunction(me, "oip_prefix_external_namesP", "OIP-PREFIX-EXTERNAL-NAMES?", 1, 0, false);
        declareFunction(me, "oip_abbreviate_prefixesP", "OIP-ABBREVIATE-PREFIXES?", 1, 0, false);
        declareFunction(me, "oip_import_term", "OIP-IMPORT-TERM", 1, 0, false);
        declareFunction(me, "oip_encoding", "OIP-ENCODING", 1, 0, false);
        declareFunction(me, "_csetf_oip_ontology", "_CSETF-OIP-ONTOLOGY", 2, 0, false);
        declareFunction(me, "_csetf_oip_namespace_map", "_CSETF-OIP-NAMESPACE-MAP", 2, 0, false);
        declareFunction(me, "_csetf_oip_constant_prefix", "_CSETF-OIP-CONSTANT-PREFIX", 2, 0, false);
        declareFunction(me, "_csetf_oip_constant_suffix", "_CSETF-OIP-CONSTANT-SUFFIX", 2, 0, false);
        declareFunction(me, "_csetf_oip_base_uri", "_CSETF-OIP-BASE-URI", 2, 0, false);
        declareFunction(me, "_csetf_oip_uri_prefix", "_CSETF-OIP-URI-PREFIX", 2, 0, false);
        declareFunction(me, "_csetf_oip_cyclist", "_CSETF-OIP-CYCLIST", 2, 0, false);
        declareFunction(me, "_csetf_oip_quoted_isa", "_CSETF-OIP-QUOTED-ISA", 2, 0, false);
        declareFunction(me, "_csetf_oip_prefix_external_namesP", "_CSETF-OIP-PREFIX-EXTERNAL-NAMES?", 2, 0, false);
        declareFunction(me, "_csetf_oip_abbreviate_prefixesP", "_CSETF-OIP-ABBREVIATE-PREFIXES?", 2, 0, false);
        declareFunction(me, "_csetf_oip_import_term", "_CSETF-OIP-IMPORT-TERM", 2, 0, false);
        declareFunction(me, "_csetf_oip_encoding", "_CSETF-OIP-ENCODING", 2, 0, false);
        declareFunction(me, "make_owl_import_parameters", "MAKE-OWL-IMPORT-PARAMETERS", 0, 1, false);
        declareFunction(me, "visit_defstruct_owl_import_parameters", "VISIT-DEFSTRUCT-OWL-IMPORT-PARAMETERS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_owl_import_parameters_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORT-PARAMETERS-METHOD", 2, 0, false);
        declareFunction(me, "print_owl_import_parameters", "PRINT-OWL-IMPORT-PARAMETERS", 3, 0, false);
        declareFunction(me, "new_owl_import_parameters", "NEW-OWL-IMPORT-PARAMETERS", 7, 2, false);
        declareFunction(me, "cyclist_using_owl_importer_v1", "CYCLIST-USING-OWL-IMPORTER-V1", 1, 0, false);
        declareFunction(me, "owl_import_parameters_ontology", "OWL-IMPORT-PARAMETERS-ONTOLOGY", 1, 0, false);
        declareFunction(me, "owl_import_parameters_lookup_namespace", "OWL-IMPORT-PARAMETERS-LOOKUP-NAMESPACE", 2, 0, false);
        declareFunction(me, "owl_import_parameters_constant_prefix", "OWL-IMPORT-PARAMETERS-CONSTANT-PREFIX", 1, 0, false);
        declareFunction(me, "owl_import_parameters_constant_suffix", "OWL-IMPORT-PARAMETERS-CONSTANT-SUFFIX", 1, 0, false);
        declareFunction(me, "owl_import_parameters_base_uri", "OWL-IMPORT-PARAMETERS-BASE-URI", 1, 0, false);
        declareFunction(me, "owl_import_parameters_uri_prefix", "OWL-IMPORT-PARAMETERS-URI-PREFIX", 1, 0, false);
        declareFunction(me, "owl_import_parameters_cyclist", "OWL-IMPORT-PARAMETERS-CYCLIST", 1, 0, false);
        declareFunction(me, "owl_import_parameters_quoted_isa", "OWL-IMPORT-PARAMETERS-QUOTED-ISA", 1, 0, false);
        declareFunction(me, "owl_import_parameters_prefix_external_namesP", "OWL-IMPORT-PARAMETERS-PREFIX-EXTERNAL-NAMES?", 1, 0, false);
        declareFunction(me, "owl_import_parameters_abbreviate_prefixesP", "OWL-IMPORT-PARAMETERS-ABBREVIATE-PREFIXES?", 1, 0, false);
        declareFunction(me, "owl_import_parameters_import_term", "OWL-IMPORT-PARAMETERS-IMPORT-TERM", 1, 0, false);
        declareFunction(me, "owl_import_parameters_encoding", "OWL-IMPORT-PARAMETERS-ENCODING", 1, 0, false);
        declareFunction(me, "owl_import_parameters_note_namespace", "OWL-IMPORT-PARAMETERS-NOTE-NAMESPACE", 3, 0, false);
        declareFunction(me, "owl_import_parameters_note_base_uri", "OWL-IMPORT-PARAMETERS-NOTE-BASE-URI", 2, 0, false);
        declareFunction(me, "owl_import_parameters_note_import_term", "OWL-IMPORT-PARAMETERS-NOTE-IMPORT-TERM", 2, 0, false);
        declareFunction(me, "owl_import_parameters_note_encoding", "OWL-IMPORT-PARAMETERS-NOTE-ENCODING", 2, 0, false);
        declareFunction(me, "sxhash_owl_import_parameters_method", "SXHASH-OWL-IMPORT-PARAMETERS-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_owl_import_parameters", "SXHASH-OWL-IMPORT-PARAMETERS", 1, 0, false);
        declareFunction(me, "verify_imports_for_ontology_tokens", "VERIFY-IMPORTS-FOR-ONTOLOGY-TOKENS", 3, 0, false);
        declareFunction(me, "validate_and_note_owl_namespaces", "VALIDATE-AND-NOTE-OWL-NAMESPACES", 3, 0, false);
        declareFunction(me, "validate_and_note_owl_namespaces_for_token", "VALIDATE-AND-NOTE-OWL-NAMESPACES-FOR-TOKEN", 3, 0, false);
        declareFunction(me, "validate_and_note_owl_namespace", "VALIDATE-AND-NOTE-OWL-NAMESPACE", 4, 0, false);
        declareFunction(me, "owl_reserved_namespace_p", "OWL-RESERVED-NAMESPACE-P", 1, 0, false);
        declareFunction(me, "owl_reserved_namespace_problem", "OWL-RESERVED-NAMESPACE-PROBLEM", 2, 0, false);
        declareFunction(me, "owl_imported_namespace_problem", "OWL-IMPORTED-NAMESPACE-PROBLEM", 2, 0, false);
        declareFunction(me, "clear_find_or_create_owl_ontology_for_uri", "CLEAR-FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI", 0, 0, false);
        declareFunction(me, "remove_find_or_create_owl_ontology_for_uri", "REMOVE-FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI", 1, 2, false);
        declareFunction(me, "find_or_create_owl_ontology_for_uri_internal", "FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI-INTERNAL", 3, 0, false);
        declareFunction(me, "find_or_create_owl_ontology_for_uri", "FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI", 1, 2, false);
        declareFunction(me, "find_or_create_term_type_for_ontology", "FIND-OR-CREATE-TERM-TYPE-FOR-ONTOLOGY", 1, 1, false);
        declareFunction(me, "read_pred_info_from_owl_tokens", "READ-PRED-INFO-FROM-OWL-TOKENS", 2, 0, false);
        declareFunction(me, "clear_owl_property_element_names", "CLEAR-OWL-PROPERTY-ELEMENT-NAMES", 0, 0, false);
        declareFunction(me, "remove_owl_property_element_names", "REMOVE-OWL-PROPERTY-ELEMENT-NAMES", 0, 0, false);
        declareFunction(me, "owl_property_element_names_internal", "OWL-PROPERTY-ELEMENT-NAMES-INTERNAL", 0, 0, false);
        declareFunction(me, "owl_property_element_names", "OWL-PROPERTY-ELEMENT-NAMES", 0, 0, false);
        declareFunction(me, "owl_property_token_p", "OWL-PROPERTY-TOKEN-P", 1, 0, false);
        declareFunction(me, "read_one_owl_chunk_for_pred_info", "READ-ONE-OWL-CHUNK-FOR-PRED-INFO", 4, 0, false);
        declareFunction(me, "cyc_token_with_nameP", "CYC-TOKEN-WITH-NAME?", 3, 0, false);
        declareFunction(me, "process_owl_attribute_value", "PROCESS-OWL-ATTRIBUTE-VALUE", 1, 0, false);
        declareFunction(me, "owl_note_spec_property", "OWL-NOTE-SPEC-PROPERTY", 2, 0, false);
        declareFunction(me, "owl_lookup_spec_properties", "OWL-LOOKUP-SPEC-PROPERTIES", 1, 0, false);
        declareFunction(me, "create_preds_from_owl_data", "CREATE-PREDS-FROM-OWL-DATA", 2, 0, false);
        declareFunction(me, "process_domain_list", "PROCESS-DOMAIN-LIST", 2, 0, false);
        declareFunction(me, "process_range_list", "PROCESS-RANGE-LIST", 2, 0, false);
        declareFunction(me, "clear_owl_class_element_names", "CLEAR-OWL-CLASS-ELEMENT-NAMES", 0, 0, false);
        declareFunction(me, "remove_owl_class_element_names", "REMOVE-OWL-CLASS-ELEMENT-NAMES", 0, 0, false);
        declareFunction(me, "owl_class_element_names_internal", "OWL-CLASS-ELEMENT-NAMES-INTERNAL", 0, 0, false);
        declareFunction(me, "owl_class_element_names", "OWL-CLASS-ELEMENT-NAMES", 0, 0, false);
        declareFunction(me, "owl_class_token_p", "OWL-CLASS-TOKEN-P", 1, 0, false);
        declareFunction(me, "read_owl_class", "READ-OWL-CLASS", 2, 0, false);
        declareFunction(me, "handle_open_class_tag", "HANDLE-OPEN-CLASS-TAG", 3, 0, false);
        declareFunction(me, "read_owl_enumeration", "READ-OWL-ENUMERATION", 2, 0, false);
        declareFunction(me, "possible_read_owl_list_p", "POSSIBLE-READ-OWL-LIST-P", 1, 0, false);
        declareFunction(me, "read_owl_list", "READ-OWL-LIST", 2, 0, false);
        declareFunction(me, "read_owl_list_recursive", "READ-OWL-LIST-RECURSIVE", 2, 0, false);
        declareFunction(me, "read_one_owl_list_item", "READ-ONE-OWL-LIST-ITEM", 2, 0, false);
        declareFunction(me, "owl_external_value_specification_union", "OWL-EXTERNAL-VALUE-SPECIFICATION-UNION", 1, 0, false);
        declareFunction(me, "first_non_whitespace_xml_token_position", "FIRST-NON-WHITESPACE-XML-TOKEN-POSITION", 1, 0, false);
        declareFunction(me, "next_noninitial_non_whitespace_xml_token_position", "NEXT-NONINITIAL-NON-WHITESPACE-XML-TOKEN-POSITION", 1, 0, false);
        declareFunction(me, "next_noninitial_non_whitespace_xml_token", "NEXT-NONINITIAL-NON-WHITESPACE-XML-TOKEN", 1, 0, false);
        declareFunction(me, "pred_names_from_token", "PRED-NAMES-FROM-TOKEN", 2, 0, false);
        declareFunction(me, "owl_pred_cyc_name_from_external_name", "OWL-PRED-CYC-NAME-FROM-EXTERNAL-NAME", 2, 0, false);
        declareFunction(me, "owl_pred_cyc_name_base", "OWL-PRED-CYC-NAME-BASE", 1, 0, false);
        declareFunction(me, "owl_find_or_create_pred_arg_isa", "OWL-FIND-OR-CREATE-PRED-ARG-ISA", 2, 0, false);
        declareFunction(me, "xml_schema_class_uris_internal", "XML-SCHEMA-CLASS-URIS-INTERNAL", 0, 0, false);
        declareFunction(me, "xml_schema_class_uris", "XML-SCHEMA-CLASS-URIS", 0, 0, false);
        declareFunction(me, "owl_find_or_create_term_for_class", "OWL-FIND-OR-CREATE-TERM-FOR-CLASS", 1, 1, false);
        declareFunction(me, "owl_uri_from_prefix", "OWL-URI-FROM-PREFIX", 2, 0, false);
        declareFunction(me, "owl_find_or_create_term_of_type_internal", "OWL-FIND-OR-CREATE-TERM-OF-TYPE-INTERNAL", 3, 0, false);
        declareFunction(me, "owl_find_or_create_term_of_type", "OWL-FIND-OR-CREATE-TERM-OF-TYPE", 3, 0, false);
        declareFunction(me, "owl_find_or_create_term_for_class_in_ontology", "OWL-FIND-OR-CREATE-TERM-FOR-CLASS-IN-ONTOLOGY", 3, 0, false);
        declareFunction(me, "owl_find_or_create_term_of_type_in_ontology_internal", "OWL-FIND-OR-CREATE-TERM-OF-TYPE-IN-ONTOLOGY-INTERNAL", 4, 1, false);
        declareFunction(me, "owl_find_or_create_term_of_type_in_ontology", "OWL-FIND-OR-CREATE-TERM-OF-TYPE-IN-ONTOLOGY", 4, 1, false);
        declareFunction(me, "create_owl_term", "CREATE-OWL-TERM", 4, 0, false);
        declareFunction(me, "assert_synonymous_external_concept", "ASSERT-SYNONYMOUS-EXTERNAL-CONCEPT", 4, 0, false);
        declareFunction(me, "get_synonymous_external_concept_sentence", "GET-SYNONYMOUS-EXTERNAL-CONCEPT-SENTENCE", 4, 0, false);
        declareFunction(me, "prefix_external_owl_name", "PREFIX-EXTERNAL-OWL-NAME", 3, 0, false);
        declareFunction(me, "uri_for_owl_ontology", "URI-FOR-OWL-ONTOLOGY", 2, 0, false);
        declareFunction(me, "get_uri_for_owl_ontology", "GET-URI-FOR-OWL-ONTOLOGY", 1, 0, false);
        declareFunction(me, "stringify_uri", "STRINGIFY-URI", 1, 0, false);
        declareFunction(me, "try_to_abbreviate_owl_uri_internal", "TRY-TO-ABBREVIATE-OWL-URI-INTERNAL", 2, 0, false);
        declareFunction(me, "try_to_abbreviate_owl_uri", "TRY-TO-ABBREVIATE-OWL-URI", 2, 0, false);
        declareFunction(me, "load_namespace_transcripts", "LOAD-NAMESPACE-TRANSCRIPTS", 0, 0, false);
        declareFunction(me, "try_to_abbreviate_owl_uri_recursive", "TRY-TO-ABBREVIATE-OWL-URI-RECURSIVE", 3, 0, false);
        declareFunction(me, "owl_term_union", "OWL-TERM-UNION", 2, 0, false);
        declareFunction(me, "cycl_term_or_owl_quasi_term_p", "CYCL-TERM-OR-OWL-QUASI-TERM-P", 1, 0, false);
        declareFunction(me, "owl_term_intersection", "OWL-TERM-INTERSECTION", 2, 0, false);
        declareFunction(me, "owl_term_enumeration", "OWL-TERM-ENUMERATION", 2, 0, false);
        declareFunction(me, "oip_pred_prefix", "OIP-PRED-PREFIX", 1, 0, false);
        declareFunction(me, "owl_define_one_pred", "OWL-DEFINE-ONE-PRED", 2, 0, false);
        declareFunction(me, "owl_pred_types_from_info", "OWL-PRED-TYPES-FROM-INFO", 2, 0, false);
        declareFunction(me, "owl_term_types_from_info", "OWL-TERM-TYPES-FROM-INFO", 2, 0, false);
        declareFunction(me, "owl_define_one_pred_internal", "OWL-DEFINE-ONE-PRED-INTERNAL", 3, 0, false);
        declareFunction(me, "owl_find_pred", "OWL-FIND-PRED", 2, 0, false);
        declareFunction(me, "owl_find_collection", "OWL-FIND-COLLECTION", 2, 0, false);
        declareFunction(me, "note_owl_found_term", "NOTE-OWL-FOUND-TERM", 3, 0, false);
        declareFunction(me, "clear_owl_found_terms", "CLEAR-OWL-FOUND-TERMS", 0, 0, false);
        declareFunction(me, "lookup_owl_found_term", "LOOKUP-OWL-FOUND-TERM", 2, 0, false);
        declareFunction(me, "owl_find_term_of_type", "OWL-FIND-TERM-OF-TYPE", 3, 1, false);
        declareFunction(me, "owl_arg2isa_from_range", "OWL-ARG2ISA-FROM-RANGE", 2, 0, false);
        declareFunction(me, "note_owl_oe_queue_done", "NOTE-OWL-OE-QUEUE-DONE", 0, 1, false);
        declareFunction(me, "new_owl_oe_queue", "NEW-OWL-OE-QUEUE", 0, 0, false);
        declareFunction(me, "owl_oe_queue_modified_flag", "OWL-OE-QUEUE-MODIFIED-FLAG", 1, 0, false);
        declareFunction(me, "set_owl_oe_queue_modified_flag", "SET-OWL-OE-QUEUE-MODIFIED-FLAG", 2, 0, false);
        declareFunction(me, "owl_oe_queue_modifiedP", "OWL-OE-QUEUE-MODIFIED?", 1, 0, false);
        declareFunction(me, "owl_oe_queue_queue", "OWL-OE-QUEUE-QUEUE", 1, 0, false);
        declareFunction(me, "owl_oe_queue_importer", "OWL-OE-QUEUE-IMPORTER", 1, 0, false);
        declareFunction(me, "ensure_owl_oe_daemon_running", "ENSURE-OWL-OE-DAEMON-RUNNING", 0, 0, false);
        declareFunction(me, "launch_owl_oe_queue_daemon", "LAUNCH-OWL-OE-QUEUE-DAEMON", 0, 0, false);
        declareFunction(me, "owl_oe_queue_enqueue", "OWL-OE-QUEUE-ENQUEUE", 1, 1, false);
        declareFunction(me, "owl_oe_queue_reenqueue", "OWL-OE-QUEUE-REENQUEUE", 2, 0, false);
        declareFunction(me, "owl_oe_queue_enqueue_low", "OWL-OE-QUEUE-ENQUEUE-LOW", 3, 0, false);
        declareFunction(me, "owl_node_id_index", "OWL-NODE-ID-INDEX", 0, 0, false);
        declareFunction(me, "note_node_id_reference", "NOTE-NODE-ID-REFERENCE", 2, 0, false);
        declareFunction(me, "lookup_node_id_reference", "LOOKUP-NODE-ID-REFERENCE", 1, 0, false);
        declareFunction(me, "owl_create", "OWL-CREATE", 7, 0, false);
        declareFunction(me, "owl_create_internal", "OWL-CREATE-INTERNAL", 6, 0, false);
        declareFunction(me, "owl_create_new_constant", "OWL-CREATE-NEW-CONSTANT", 6, 0, false);
        declareFunction(me, "owl_create_new_constant_non_rkf", "OWL-CREATE-NEW-CONSTANT-NON-RKF", 5, 0, false);
        declareFunction(me, "owl_enqueue_assert", "OWL-ENQUEUE-ASSERT", 2, 1, false);
        declareFunction(me, "new_owl_oe_daemon", "NEW-OWL-OE-DAEMON", 0, 0, false);
        declareFunction(me, "owl_oe_queue_empty_p", "OWL-OE-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction(me, "wait_for_owl_oe_queue_to_empty", "WAIT-FOR-OWL-OE-QUEUE-TO-EMPTY", 0, 1, false);
        declareFunction(me, "owl_oe_daemon_run", "OWL-OE-DAEMON-RUN", 0, 0, false);
        declareFunction(me, "note_owl_failure", "NOTE-OWL-FAILURE", 1, 1, false);
        declareFunction(me, "owl_failure_message", "OWL-FAILURE-MESSAGE", 1, 0, false);
        declareFunction(me, "owl_oe_daemon_assert", "OWL-OE-DAEMON-ASSERT", 1, 0, false);
        declareFunction(me, "owl_quasi_term_from_specification", "OWL-QUASI-TERM-FROM-SPECIFICATION", 4, 0, false);
        declareFunction(me, "owl_quasi_term_from_node_id", "OWL-QUASI-TERM-FROM-NODE-ID", 1, 1, false);
        declareFunction(me, "owl_quasi_term_p", "OWL-QUASI-TERM-P", 1, 0, false);
        declareFunction(me, "resolve_owl_quasi_term", "RESOLVE-OWL-QUASI-TERM", 1, 0, false);
        declareFunction(me, "clear_note_found_term_resolution", "CLEAR-NOTE-FOUND-TERM-RESOLUTION", 0, 0, false);
        declareFunction(me, "remove_note_found_term_resolution", "REMOVE-NOTE-FOUND-TERM-RESOLUTION", 2, 0, false);
        declareFunction(me, "note_found_term_resolution_internal", "NOTE-FOUND-TERM-RESOLUTION-INTERNAL", 2, 0, false);
        declareFunction(me, "note_found_term_resolution", "NOTE-FOUND-TERM-RESOLUTION", 2, 0, false);
        declareFunction(me, "owl_assert_internal", "OWL-ASSERT-INTERNAL", 3, 0, false);
        declareFunction(me, "owl_assert", "OWL-ASSERT", 3, 0, false);
        declareFunction(me, "owl_assert_low", "OWL-ASSERT-LOW", 2, 0, false);
        declareFunction(me, "create_terms_from_owl_data", "CREATE-TERMS-FROM-OWL-DATA", 2, 1, false);
        declareFunction(me, "dont_reify_owl_termP", "DONT-REIFY-OWL-TERM?", 2, 0, false);
        declareFunction(me, "owl_define_one_term", "OWL-DEFINE-ONE-TERM", 2, 0, false);
        declareFunction(me, "owl_find_term_from_info", "OWL-FIND-TERM-FROM-INFO", 2, 0, false);
        declareFunction(me, "owl_define_one_term_internal", "OWL-DEFINE-ONE-TERM-INTERNAL", 4, 0, false);
        declareFunction(me, "assert_owl_label", "ASSERT-OWL-LABEL", 3, 0, false);
        declareFunction(me, "assert_owl_equivalent_class", "ASSERT-OWL-EQUIVALENT-CLASS", 4, 0, false);
        declareFunction(me, "assert_owl_restriction", "ASSERT-OWL-RESTRICTION", 4, 0, false);
        declareFunction(me, "owl_restriction_sentence", "OWL-RESTRICTION-SENTENCE", 3, 0, false);
        declareFunction(me, "owl_restriction_collection", "OWL-RESTRICTION-COLLECTION", 2, 1, false);
        declareFunction(me, "find_or_create_owl_class_from_restriction_internal", "FIND-OR-CREATE-OWL-CLASS-FROM-RESTRICTION-INTERNAL", 2, 1, false);
        declareFunction(me, "find_or_create_owl_class_from_restriction", "FIND-OR-CREATE-OWL-CLASS-FROM-RESTRICTION", 2, 1, false);
        declareFunction(me, "owl_find_or_create_nat", "OWL-FIND-OR-CREATE-NAT", 2, 0, false);
        declareFunction(me, "try_to_resolve_node_id_specification", "TRY-TO-RESOLVE-NODE-ID-SPECIFICATION", 1, 0, false);
        declareFunction(me, "owl_find_or_create_term_from_specification", "OWL-FIND-OR-CREATE-TERM-FROM-SPECIFICATION", 3, 0, false);
        declareFunction(me, "owl_find_or_create_union", "OWL-FIND-OR-CREATE-UNION", 3, 1, false);
        declareFunction(me, "owl_find_or_create_intersection", "OWL-FIND-OR-CREATE-INTERSECTION", 3, 1, false);
        declareFunction(me, "owl_find_or_create_classes_from_node_id", "OWL-FIND-OR-CREATE-CLASSES-FROM-NODE-ID", 3, 0, false);
        declareFunction(me, "owl_find_or_create_term_from_node_id", "OWL-FIND-OR-CREATE-TERM-FROM-NODE-ID", 3, 0, false);
        declareFunction(me, "owl_term_info_print_function_trampoline", "OWL-TERM-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "owl_term_info_p", "OWL-TERM-INFO-P", 1, 0, false);
        new owl_to_cycl.$owl_term_info_p$UnaryFunction();
        declareFunction(me, "oti_cyc_name", "OTI-CYC-NAME", 1, 0, false);
        declareFunction(me, "oti_comment", "OTI-COMMENT", 1, 0, false);
        declareFunction(me, "oti_superclasses", "OTI-SUPERCLASSES", 1, 0, false);
        declareFunction(me, "oti_disjoint_classes", "OTI-DISJOINT-CLASSES", 1, 0, false);
        declareFunction(me, "oti_plist", "OTI-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_oti_cyc_name", "_CSETF-OTI-CYC-NAME", 2, 0, false);
        declareFunction(me, "_csetf_oti_comment", "_CSETF-OTI-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_oti_superclasses", "_CSETF-OTI-SUPERCLASSES", 2, 0, false);
        declareFunction(me, "_csetf_oti_disjoint_classes", "_CSETF-OTI-DISJOINT-CLASSES", 2, 0, false);
        declareFunction(me, "_csetf_oti_plist", "_CSETF-OTI-PLIST", 2, 0, false);
        declareFunction(me, "make_owl_term_info", "MAKE-OWL-TERM-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_owl_term_info", "VISIT-DEFSTRUCT-OWL-TERM-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_owl_term_info_method", "VISIT-DEFSTRUCT-OBJECT-OWL-TERM-INFO-METHOD", 2, 0, false);
        declareFunction(me, "print_owl_term_info", "PRINT-OWL-TERM-INFO", 3, 0, false);
        declareFunction(me, "find_or_create_owl_term_info", "FIND-OR-CREATE-OWL-TERM-INFO", 1, 0, false);
        declareFunction(me, "new_owl_term_info", "NEW-OWL-TERM-INFO", 0, 2, false);
        declareFunction(me, "owl_term_info_cyc_name", "OWL-TERM-INFO-CYC-NAME", 1, 0, false);
        declareFunction(me, "owl_term_info_comment", "OWL-TERM-INFO-COMMENT", 1, 0, false);
        declareFunction(me, "owl_term_info_superclasses", "OWL-TERM-INFO-SUPERCLASSES", 1, 0, false);
        declareFunction(me, "owl_term_info_disjoint_classes", "OWL-TERM-INFO-DISJOINT-CLASSES", 1, 0, false);
        declareFunction(me, "owl_term_info_plist", "OWL-TERM-INFO-PLIST", 1, 0, false);
        declareFunction(me, "owl_term_info_plist_lookup", "OWL-TERM-INFO-PLIST-LOOKUP", 2, 1, false);
        declareFunction(me, "owl_term_info_external_name", "OWL-TERM-INFO-EXTERNAL-NAME", 1, 1, false);
        declareFunction(me, "set_owl_term_info_cyc_name", "SET-OWL-TERM-INFO-CYC-NAME", 2, 0, false);
        declareFunction(me, "set_owl_term_info_comment", "SET-OWL-TERM-INFO-COMMENT", 2, 0, false);
        declareFunction(me, "add_owl_term_info_superclass", "ADD-OWL-TERM-INFO-SUPERCLASS", 2, 0, false);
        declareFunction(me, "add_owl_term_info_disjoint_class", "ADD-OWL-TERM-INFO-DISJOINT-CLASS", 2, 0, false);
        declareFunction(me, "owl_term_info_plist_enter", "OWL-TERM-INFO-PLIST-ENTER", 3, 0, false);
        declareFunction(me, "owl_term_info_plist_push", "OWL-TERM-INFO-PLIST-PUSH", 3, 0, false);
        declareFunction(me, "owl_term_info_plist_list_propertyP", "OWL-TERM-INFO-PLIST-LIST-PROPERTY?", 1, 0, false);
        declareFunction(me, "merge_owl_term_definitions", "MERGE-OWL-TERM-DEFINITIONS", 2, 0, false);
        declareFunction(me, "sxhash_owl_term_info_method", "SXHASH-OWL-TERM-INFO-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_owl_term_info", "SXHASH-OWL-TERM-INFO", 1, 0, false);
        declareFunction(me, "import_named_bnodes", "IMPORT-NAMED-BNODES", 2, 0, false);
        declareFunction(me, "read_one_named_bnode", "READ-ONE-NAMED-BNODE", 2, 0, false);
        declareFunction(me, "read_class_info_from_owl_tokens", "READ-CLASS-INFO-FROM-OWL-TOKENS", 2, 0, false);
        declareFunction(me, "read_one_class_info_from_owl_tokens", "READ-ONE-CLASS-INFO-FROM-OWL-TOKENS", 2, 0, false);
        declareFunction(me, "read_one_owl_chunk_for_class_info", "READ-ONE-OWL-CHUNK-FOR-CLASS-INFO", 4, 0, false);
        declareFunction(me, "read_instance_info_from_owl_tokens", "READ-INSTANCE-INFO-FROM-OWL-TOKENS", 2, 0, false);
        declareFunction(me, "read_one_instance_info_from_owl_tokens", "READ-ONE-INSTANCE-INFO-FROM-OWL-TOKENS", 2, 0, false);
        declareFunction(me, "read_one_owl_chunk_for_instance_info", "READ-ONE-OWL-CHUNK-FOR-INSTANCE-INFO", 4, 0, false);
        declareFunction(me, "owl_maybe_instance_tokenP", "OWL-MAYBE-INSTANCE-TOKEN?", 2, 0, false);
        declareFunction(me, "owl_non_instance_tokenP", "OWL-NON-INSTANCE-TOKEN?", 2, 0, false);
        declareFunction(me, "handle_non_target_owl_token", "HANDLE-NON-TARGET-OWL-TOKEN", 1, 0, false);
        declareFunction(me, "handle_term_info_token", "HANDLE-TERM-INFO-TOKEN", 3, 0, false);
        declareFunction(me, "handle_cyc_guid", "HANDLE-CYC-GUID", 2, 0, false);
        declareFunction(me, "handle_cyc_external_id", "HANDLE-CYC-EXTERNAL-ID", 2, 0, false);
        declareFunction(me, "handle_property_value_pair", "HANDLE-PROPERTY-VALUE-PAIR", 4, 0, false);
        declareFunction(me, "read_owl_term_reference", "READ-OWL-TERM-REFERENCE", 2, 0, false);
        declareFunction(me, "owl_import_parameters_class_prefix", "OWL-IMPORT-PARAMETERS-CLASS-PREFIX", 1, 0, false);
        declareFunction(me, "term_names_from_token", "TERM-NAMES-FROM-TOKEN", 2, 0, false);
        declareFunction(me, "owl_external_name_from_token", "OWL-EXTERNAL-NAME-FROM-TOKEN", 2, 0, false);
        declareFunction(me, "owl_class_cyc_name_from_external_name", "OWL-CLASS-CYC-NAME-FROM-EXTERNAL-NAME", 2, 0, false);
        declareFunction(me, "nonlocal_owl_term_reference_p", "NONLOCAL-OWL-TERM-REFERENCE-P", 1, 0, false);
        declareFunction(me, "resolve_nonlocal_owl_term_reference", "RESOLVE-NONLOCAL-OWL-TERM-REFERENCE", 3, 0, false);
        declareFunction(me, "read_owl_class_or_restriction", "READ-OWL-CLASS-OR-RESTRICTION", 2, 0, false);
        declareFunction(me, "read_owl_restriction", "READ-OWL-RESTRICTION", 2, 0, false);
        declareFunction(me, "read_part_of_owl_restriction", "READ-PART-OF-OWL-RESTRICTION", 8, 0, false);
        declareFunction(me, "read_owl_restriction_property", "READ-OWL-RESTRICTION-PROPERTY", 2, 0, false);
        declareFunction(me, "read_owl_restriction_class", "READ-OWL-RESTRICTION-CLASS", 2, 0, false);
        declareFunction(me, "owl_value_from_string", "OWL-VALUE-FROM-STRING", 2, 0, false);
        declareFunction(me, "clear_xml_name", "CLEAR-XML-NAME", 0, 0, false);
        declareFunction(me, "remove_xml_name", "REMOVE-XML-NAME", 1, 0, false);
        declareFunction(me, "xml_name_internal", "XML-NAME-INTERNAL", 1, 0, false);
        declareFunction(me, "xml_name", "XML-NAME", 1, 0, false);
        declareFunction(me, "owl_importer_print_function_trampoline", "OWL-IMPORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "owl_importer_p", "OWL-IMPORTER-P", 1, 0, false);
        new owl_to_cycl.$owl_importer_p$UnaryFunction();
        declareFunction(me, "owl_imp_id", "OWL-IMP-ID", 1, 0, false);
        declareFunction(me, "owl_imp_progress", "OWL-IMP-PROGRESS", 1, 0, false);
        declareFunction(me, "owl_imp_error_info", "OWL-IMP-ERROR-INFO", 1, 0, false);
        declareFunction(me, "owl_imp_import_parameters", "OWL-IMP-IMPORT-PARAMETERS", 1, 0, false);
        declareFunction(me, "owl_imp_thread", "OWL-IMP-THREAD", 1, 0, false);
        declareFunction(me, "_csetf_owl_imp_id", "_CSETF-OWL-IMP-ID", 2, 0, false);
        declareFunction(me, "_csetf_owl_imp_progress", "_CSETF-OWL-IMP-PROGRESS", 2, 0, false);
        declareFunction(me, "_csetf_owl_imp_error_info", "_CSETF-OWL-IMP-ERROR-INFO", 2, 0, false);
        declareFunction(me, "_csetf_owl_imp_import_parameters", "_CSETF-OWL-IMP-IMPORT-PARAMETERS", 2, 0, false);
        declareFunction(me, "_csetf_owl_imp_thread", "_CSETF-OWL-IMP-THREAD", 2, 0, false);
        declareFunction(me, "make_owl_importer", "MAKE-OWL-IMPORTER", 0, 1, false);
        declareFunction(me, "visit_defstruct_owl_importer", "VISIT-DEFSTRUCT-OWL-IMPORTER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_owl_importer_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER-METHOD", 2, 0, false);
        declareFunction(me, "print_owl_importer", "PRINT-OWL-IMPORTER", 3, 0, false);
        declareFunction(me, "new_owl_importer", "NEW-OWL-IMPORTER", 0, 0, false);
        declareFunction(me, "owl_importer_id", "OWL-IMPORTER-ID", 1, 0, false);
        declareFunction(me, "owl_importer_progress", "OWL-IMPORTER-PROGRESS", 1, 0, false);
        declareFunction(me, "owl_importer_error_info", "OWL-IMPORTER-ERROR-INFO", 1, 0, false);
        declareFunction(me, "owl_importer_import_parameters", "OWL-IMPORTER-IMPORT-PARAMETERS", 1, 0, false);
        declareFunction(me, "owl_importer_thread", "OWL-IMPORTER-THREAD", 1, 0, false);
        declareFunction(me, "sxhash_owl_importer_method", "SXHASH-OWL-IMPORTER-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_owl_importer", "SXHASH-OWL-IMPORTER", 1, 0, false);
        declareFunction(me, "import_owl_ontology_with_importer", "IMPORT-OWL-ONTOLOGY-WITH-IMPORTER", 2, 6, false);
        declareFunction(me, "import_owl_ontology_with_importer_from_info", "IMPORT-OWL-ONTOLOGY-WITH-IMPORTER-FROM-INFO", 1, 0, false);
        declareFunction(me, "get_owl_importer_ontology", "GET-OWL-IMPORTER-ONTOLOGY", 1, 0, false);
        declareFunction(me, "get_owl_importer_progress", "GET-OWL-IMPORTER-PROGRESS", 1, 0, false);
        declareFunction(me, "get_owl_importer_error_info", "GET-OWL-IMPORTER-ERROR-INFO", 1, 0, false);
        declareFunction(me, "owl_importer_done_p", "OWL-IMPORTER-DONE-P", 1, 0, false);
        declareFunction(me, "owl_importer_exists_p", "OWL-IMPORTER-EXISTS-P", 1, 0, false);
        declareFunction(me, "owl_importer_id_index", "OWL-IMPORTER-ID-INDEX", 0, 0, false);
        declareFunction(me, "find_owl_importer_by_id", "FIND-OWL-IMPORTER-BY-ID", 1, 0, false);
        declareFunction(me, "note_owl_import_parameters", "NOTE-OWL-IMPORT-PARAMETERS", 1, 0, false);
        declareFunction(me, "note_owl_import_section_progress", "NOTE-OWL-IMPORT-SECTION-PROGRESS", 1, 0, false);
        declareFunction(me, "note_owl_import_section_started", "NOTE-OWL-IMPORT-SECTION-STARTED", 0, 0, false);
        declareFunction(me, "note_owl_import_section_done", "NOTE-OWL-IMPORT-SECTION-DONE", 0, 0, false);
        declareFunction(me, "note_owl_import_done", "NOTE-OWL-IMPORT-DONE", 0, 0, false);
        declareFunction(me, "note_owl_import_problem", "NOTE-OWL-IMPORT-PROBLEM", 2, 0, false);
        declareFunction(me, "owl_importer_run", "OWL-IMPORTER-RUN", 1, 0, false);
        declareFunction(me, "import_sample_ontologies", "IMPORT-SAMPLE-ONTOLOGIES", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_owl_to_cycl_file() {
        deflexical("*OWL-IMPORTER-V1-VERSION-NUMBER*", SubLTrampolineFile.maybeDefault($sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_, $owl_importer_v1_version_number$, NIL));
        defparameter("*OWL-IMPORTER*", NIL);
        deflexical("*OWL-MERGE-MT*", $$OWLMappingMt);
        deflexical("*OWL-TERM-NAMES-PRECEDED-BY-ID*", $list49);
        deflexical("*OWL-TERM-NAMES-PRECEDED-BY-ABOUT*", $list50);
        deflexical("*OWL-TERM-NAMES-PRECEDED-BY-RESOURCE*", $list51);
        deflexical("*OWL-TERM-NAMES-PRECEDED-BY-PARSE-TYPE*", $list52);
        defparameter("*OWL-DEFINITION-TYPES*", $list53);
        defparameter("*OWL-DEFINITION-TYPE*", NIL);
        defparameter("*OWL-DEFINITION-ACCUMULATOR*", misc_utilities.uninitialized());
        defparameter("*OWL-OE-QUEUE*", NIL);
        defparameter("*OWL-IMPORT-PARAMETERS*", NIL);
        deflexical("*XML-TOKENS-FROM-FILE-CACHING-STATE*", NIL);
        deflexical("*DEFAULT-OWL-FILE-ENCODING*", $str86$utf_8);
        deflexical("*OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT-CACHING-STATE*", NIL);
        defconstant("*DTP-OWL-PRED-INFO*", OWL_PRED_INFO);
        defconstant("*DTP-OWL-IMPORT-PARAMETERS*", OWL_IMPORT_PARAMETERS);
        deflexical("*OWL-RESERVED-NAMESPACES*", $list223);
        deflexical("*FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI-CACHING-STATE*", NIL);
        deflexical("*OWL-PROPERTY-ELEMENT-NAMES-CACHING-STATE*", NIL);
        defparameter("*OWL-SPEC-PROPERTIES*", misc_utilities.uninitialized());
        deflexical("*OWL-CLASS-ELEMENT-NAMES-CACHING-STATE*", NIL);
        defparameter("*OWL-FORCE-NEW-TERM-CREATION?*", NIL);
        defparameter("*OWL-ALLOW-FIND-VIA-CREATION?*", NIL);
        deflexical("*CYC-PROPERTIES-TO-NOT-IMPORT*", $list392);
        deflexical("*OWL-FOUND-TERMS*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*OWL-OE-QUEUES*", SubLTrampolineFile.maybeDefault($owl_oe_queues$, $owl_oe_queues$, NIL));
        deflexical("*OWL-OE-DAEMON*", SubLTrampolineFile.maybeDefault($owl_oe_daemon$, $owl_oe_daemon$, NIL));
        deflexical("*OWL-OE-QUEUE-MARKER*", CHAR_vertical);
        deflexical("*OWL-OE-QUEUE-END-MARKER*", CHAR_exclamation);
        deflexical("*OWL-NODE-ID-INDEX*", SubLTrampolineFile.maybeDefault($owl_node_id_index$, $owl_node_id_index$, NIL));
        deflexical("*NOTE-FOUND-TERM-RESOLUTION-CACHING-STATE*", NIL);
        defparameter("*CREATE-ANONYMOUS-OWL-TERMS?*", NIL);
        deflexical("*OWL-RESTRICTION-COLLECTION-TEMPLATES*", list(bq_cons(owl_utilities.owl_name($$$allValuesFrom), $list509), bq_cons(owl_utilities.owl_name($$$someValuesFrom), $list510), bq_cons(owl_utilities.owl_name($$$hasValue), $list511), bq_cons(owl_utilities.owl_name($$$cardinality), $list512), bq_cons(owl_utilities.owl_name($$$maxCardinality), $list513), bq_cons(owl_utilities.owl_name($$$minCardinality), $list514)));
        defparameter("*OWL-TERM-FROM-SPECIFICATION-DEPTH*", ZERO_INTEGER);
        defconstant("*DTP-OWL-TERM-INFO*", OWL_TERM_INFO);
        deflexical("*OWL-INTERVAL-DATATYPES*", $list623);
        deflexical("*XML-NAME-CACHING-STATE*", NIL);
        defconstant("*DTP-OWL-IMPORTER*", OWL_IMPORTER);
        deflexical("*OWL-IMPORTER-ID-INDEX*", SubLTrampolineFile.maybeDefault($owl_importer_id_index$, $owl_importer_id_index$, NIL));
        deflexical("*SWEET-ROOT*", $str675$http___sweet_jpl_nasa_gov_ontolog);
        deflexical("*SWEET-ONTOLOGIES*", $list676);
        return NIL;
    }

    public static SubLObject setup_owl_to_cycl_file() {
        declare_defglobal($sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_);
        $owl_importer_v1_version_number$.setGlobalValue($str2$_Revision__138034__);
        memoization_state.note_memoized_function($sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX);
        memoization_state.note_memoized_function(MEMOIZED_COUNT_ALL_SPECS);
        memoization_state.note_memoized_function(LONGEST_ACYCLIC_GENLS_PATH_INTERNAL);
        memoization_state.note_memoized_function(OWL_MIN_GENLS_MEMOIZED);
        register_external_symbol(IMPORT_OWL_ONTOLOGY);
        memoization_state.note_globally_cached_function(XML_TOKENS_FROM_FILE);
        memoization_state.note_globally_cached_function(OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_owl_pred_info$.getGlobalValue(), symbol_function(OWL_PRED_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list131);
        def_csetf(OPI_CYC_NAME, _CSETF_OPI_CYC_NAME);
        def_csetf(OPI_COMMENT, _CSETF_OPI_COMMENT);
        def_csetf(OPI_DOMAINS, _CSETF_OPI_DOMAINS);
        def_csetf(OPI_RANGE, _CSETF_OPI_RANGE);
        def_csetf(OPI_PLIST, _CSETF_OPI_PLIST);
        identity(OWL_PRED_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_owl_pred_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_OWL_PRED_INFO_METHOD));
        note_funcall_helper_function(PRINT_OWL_PRED_INFO);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_pred_info$.getGlobalValue(), symbol_function(SXHASH_OWL_PRED_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_owl_import_parameters$.getGlobalValue(), symbol_function(OWL_IMPORT_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list175);
        def_csetf(OIP_ONTOLOGY, _CSETF_OIP_ONTOLOGY);
        def_csetf(OIP_NAMESPACE_MAP, _CSETF_OIP_NAMESPACE_MAP);
        def_csetf(OIP_CONSTANT_PREFIX, _CSETF_OIP_CONSTANT_PREFIX);
        def_csetf(OIP_CONSTANT_SUFFIX, _CSETF_OIP_CONSTANT_SUFFIX);
        def_csetf(OIP_BASE_URI, _CSETF_OIP_BASE_URI);
        def_csetf(OIP_URI_PREFIX, _CSETF_OIP_URI_PREFIX);
        def_csetf(OIP_CYCLIST, _CSETF_OIP_CYCLIST);
        def_csetf(OIP_QUOTED_ISA, _CSETF_OIP_QUOTED_ISA);
        def_csetf($sym192$OIP_PREFIX_EXTERNAL_NAMES_, $sym193$_CSETF_OIP_PREFIX_EXTERNAL_NAMES_);
        def_csetf($sym194$OIP_ABBREVIATE_PREFIXES_, $sym195$_CSETF_OIP_ABBREVIATE_PREFIXES_);
        def_csetf(OIP_IMPORT_TERM, _CSETF_OIP_IMPORT_TERM);
        def_csetf(OIP_ENCODING, _CSETF_OIP_ENCODING);
        identity(OWL_IMPORT_PARAMETERS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_owl_import_parameters$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_OWL_IMPORT_PARAMETERS_METHOD));
        note_funcall_helper_function(PRINT_OWL_IMPORT_PARAMETERS);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_import_parameters$.getGlobalValue(), symbol_function(SXHASH_OWL_IMPORT_PARAMETERS_METHOD));
        memoization_state.note_globally_cached_function(FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI);
        memoization_state.note_globally_cached_function(OWL_PROPERTY_ELEMENT_NAMES);
        memoization_state.note_globally_cached_function(OWL_CLASS_ELEMENT_NAMES);
        memoization_state.note_memoized_function(XML_SCHEMA_CLASS_URIS);
        memoization_state.note_memoized_function(OWL_FIND_OR_CREATE_TERM_OF_TYPE);
        memoization_state.note_memoized_function(OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY);
        memoization_state.note_memoized_function(TRY_TO_ABBREVIATE_OWL_URI);
        declare_defglobal($owl_oe_queues$);
        declare_defglobal($owl_oe_daemon$);
        declare_defglobal($owl_node_id_index$);
        memoization_state.note_globally_cached_function(NOTE_FOUND_TERM_RESOLUTION);
        memoization_state.note_memoized_function(OWL_ASSERT);
        memoization_state.note_memoized_function(FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_owl_term_info$.getGlobalValue(), symbol_function(OWL_TERM_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list539);
        def_csetf(OTI_CYC_NAME, _CSETF_OTI_CYC_NAME);
        def_csetf(OTI_COMMENT, _CSETF_OTI_COMMENT);
        def_csetf(OTI_SUPERCLASSES, _CSETF_OTI_SUPERCLASSES);
        def_csetf(OTI_DISJOINT_CLASSES, _CSETF_OTI_DISJOINT_CLASSES);
        def_csetf(OTI_PLIST, _CSETF_OTI_PLIST);
        identity(OWL_TERM_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_owl_term_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_OWL_TERM_INFO_METHOD));
        note_funcall_helper_function(PRINT_OWL_TERM_INFO);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_term_info$.getGlobalValue(), symbol_function(SXHASH_OWL_TERM_INFO_METHOD));
        memoization_state.note_globally_cached_function(XML_NAME);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_owl_importer$.getGlobalValue(), symbol_function(OWL_IMPORTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list648);
        def_csetf(OWL_IMP_ID, _CSETF_OWL_IMP_ID);
        def_csetf(OWL_IMP_PROGRESS, _CSETF_OWL_IMP_PROGRESS);
        def_csetf(OWL_IMP_ERROR_INFO, _CSETF_OWL_IMP_ERROR_INFO);
        def_csetf(OWL_IMP_IMPORT_PARAMETERS, _CSETF_OWL_IMP_IMPORT_PARAMETERS);
        def_csetf(OWL_IMP_THREAD, _CSETF_OWL_IMP_THREAD);
        identity(OWL_IMPORTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_owl_importer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER_METHOD));
        note_funcall_helper_function(PRINT_OWL_IMPORTER);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_importer$.getGlobalValue(), symbol_function(SXHASH_OWL_IMPORTER_METHOD));
        register_external_symbol(IMPORT_OWL_ONTOLOGY_WITH_IMPORTER);
        declare_defglobal($owl_importer_id_index$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_owl_to_cycl_file();
    }

    @Override
    public void initializeVariables() {
        init_owl_to_cycl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_owl_to_cycl_file();
    }

    

    public static final class $owl_pred_info_native extends SubLStructNative {
        public SubLObject $cyc_name;

        public SubLObject $comment;

        public SubLObject $domains;

        public SubLObject $range;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        private $owl_pred_info_native() {
            this.$cyc_name = Lisp.NIL;
            this.$comment = Lisp.NIL;
            this.$domains = Lisp.NIL;
            this.$range = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cyc_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$comment;
        }

        @Override
        public SubLObject getField4() {
            return this.$domains;
        }

        @Override
        public SubLObject getField5() {
            return this.$range;
        }

        @Override
        public SubLObject getField6() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cyc_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$domains = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$range = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative($owl_pred_info_native.class, OWL_PRED_INFO, OWL_PRED_INFO_P, $list125, $list126, new String[]{ "$cyc_name", "$comment", "$domains", "$range", "$plist" }, $list127, $list128, PRINT_OWL_PRED_INFO);
        }
    }

    public static final class $owl_pred_info_p$UnaryFunction extends UnaryFunction {
        public $owl_pred_info_p$UnaryFunction() {
            super(extractFunctionNamed("OWL-PRED-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return owl_pred_info_p(arg1);
        }
    }

    public static final class $owl_import_parameters_native extends SubLStructNative {
        public SubLObject $ontology;

        public SubLObject $namespace_map;

        public SubLObject $constant_prefix;

        public SubLObject $constant_suffix;

        public SubLObject $base_uri;

        public SubLObject $uri_prefix;

        public SubLObject $cyclist;

        public SubLObject $quoted_isa;

        public SubLObject $prefix_external_namesP;

        public SubLObject $abbreviate_prefixesP;

        public SubLObject $import_term;

        public SubLObject $encoding;

        private static final SubLStructDeclNative structDecl;

        private $owl_import_parameters_native() {
            this.$ontology = Lisp.NIL;
            this.$namespace_map = Lisp.NIL;
            this.$constant_prefix = Lisp.NIL;
            this.$constant_suffix = Lisp.NIL;
            this.$base_uri = Lisp.NIL;
            this.$uri_prefix = Lisp.NIL;
            this.$cyclist = Lisp.NIL;
            this.$quoted_isa = Lisp.NIL;
            this.$prefix_external_namesP = Lisp.NIL;
            this.$abbreviate_prefixesP = Lisp.NIL;
            this.$import_term = Lisp.NIL;
            this.$encoding = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$ontology;
        }

        @Override
        public SubLObject getField3() {
            return this.$namespace_map;
        }

        @Override
        public SubLObject getField4() {
            return this.$constant_prefix;
        }

        @Override
        public SubLObject getField5() {
            return this.$constant_suffix;
        }

        @Override
        public SubLObject getField6() {
            return this.$base_uri;
        }

        @Override
        public SubLObject getField7() {
            return this.$uri_prefix;
        }

        @Override
        public SubLObject getField8() {
            return this.$cyclist;
        }

        @Override
        public SubLObject getField9() {
            return this.$quoted_isa;
        }

        @Override
        public SubLObject getField10() {
            return this.$prefix_external_namesP;
        }

        @Override
        public SubLObject getField11() {
            return this.$abbreviate_prefixesP;
        }

        @Override
        public SubLObject getField12() {
            return this.$import_term;
        }

        @Override
        public SubLObject getField13() {
            return this.$encoding;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$ontology = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$namespace_map = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$constant_prefix = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$constant_suffix = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$base_uri = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$uri_prefix = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$cyclist = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$quoted_isa = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$prefix_external_namesP = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$abbreviate_prefixesP = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$import_term = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$encoding = value;
        }

        static {
            structDecl = makeStructDeclNative($owl_import_parameters_native.class, OWL_IMPORT_PARAMETERS, OWL_IMPORT_PARAMETERS_P, $list169, $list170, new String[]{ "$ontology", "$namespace_map", "$constant_prefix", "$constant_suffix", "$base_uri", "$uri_prefix", "$cyclist", "$quoted_isa", "$prefix_external_namesP", "$abbreviate_prefixesP", "$import_term", "$encoding" }, $list171, $list172, PRINT_OWL_IMPORT_PARAMETERS);
        }
    }

    public static final class $owl_import_parameters_p$UnaryFunction extends UnaryFunction {
        public $owl_import_parameters_p$UnaryFunction() {
            super(extractFunctionNamed("OWL-IMPORT-PARAMETERS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return owl_import_parameters_p(arg1);
        }
    }

    public static final class $owl_term_info_native extends SubLStructNative {
        public SubLObject $cyc_name;

        public SubLObject $comment;

        public SubLObject $superclasses;

        public SubLObject $disjoint_classes;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        private $owl_term_info_native() {
            this.$cyc_name = Lisp.NIL;
            this.$comment = Lisp.NIL;
            this.$superclasses = Lisp.NIL;
            this.$disjoint_classes = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cyc_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$comment;
        }

        @Override
        public SubLObject getField4() {
            return this.$superclasses;
        }

        @Override
        public SubLObject getField5() {
            return this.$disjoint_classes;
        }

        @Override
        public SubLObject getField6() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cyc_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$superclasses = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$disjoint_classes = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative($owl_term_info_native.class, OWL_TERM_INFO, OWL_TERM_INFO_P, $list533, $list534, new String[]{ "$cyc_name", "$comment", "$superclasses", "$disjoint_classes", "$plist" }, $list535, $list536, PRINT_OWL_TERM_INFO);
        }
    }

    public static final class $owl_term_info_p$UnaryFunction extends UnaryFunction {
        public $owl_term_info_p$UnaryFunction() {
            super(extractFunctionNamed("OWL-TERM-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return owl_term_info_p(arg1);
        }
    }

    public static final class $owl_importer_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $progress;

        public SubLObject $error_info;

        public SubLObject $import_parameters;

        public SubLObject $thread;

        private static final SubLStructDeclNative structDecl;

        private $owl_importer_native() {
            this.$id = Lisp.NIL;
            this.$progress = Lisp.NIL;
            this.$error_info = Lisp.NIL;
            this.$import_parameters = Lisp.NIL;
            this.$thread = Lisp.NIL;
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
            return this.$progress;
        }

        @Override
        public SubLObject getField4() {
            return this.$error_info;
        }

        @Override
        public SubLObject getField5() {
            return this.$import_parameters;
        }

        @Override
        public SubLObject getField6() {
            return this.$thread;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$progress = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$error_info = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$import_parameters = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$thread = value;
        }

        static {
            structDecl = makeStructDeclNative($owl_importer_native.class, OWL_IMPORTER, OWL_IMPORTER_P, $list642, $list643, new String[]{ "$id", "$progress", "$error_info", "$import_parameters", "$thread" }, $list644, $list645, PRINT_OWL_IMPORTER);
        }
    }

    public static final class $owl_importer_p$UnaryFunction extends UnaryFunction {
        public $owl_importer_p$UnaryFunction() {
            super(extractFunctionNamed("OWL-IMPORTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return owl_importer_p(arg1);
        }
    }
}

/**
 * Total time: 5552 ms synthetic
 */
