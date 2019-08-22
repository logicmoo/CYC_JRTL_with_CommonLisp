/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.genls_litP;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_cycl_string;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.unicode_nauts.non_ascii_string_to_unicode;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backquote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_caret;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_reader;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.date_defns;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OWLIFICATION
 * source file: /cyc/top/cycl/owl/owlification.lisp
 * created:     2019/07/03 17:38:28
 */
public final class owlification extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt63$ = makeString("");

    public static final SubLFile me = new owlification();

 public static final String myName = "com.cyc.cycjava.cycl.owl.owlification";


    // defparameter
    // Definitions
    /**
     * If T, use external IDs for names, add a label tag, and lose the externalID
     * tag.
     */
    @LispMethod(comment = "If T, use external IDs for names, add a label tag, and lose the externalID\r\ntag.\ndefparameter\nIf T, use external IDs for names, add a label tag, and lose the externalID\ntag.")
    public static final SubLSymbol $owl_use_external_ids_for_namesP$ = makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_prefer_ontology_urisP$ = makeSymbol("*OWL-PREFER-ONTOLOGY-URIS?*");

    // defparameter
    // The best value for this is T in OpenCyc and NIL otherwise
    /**
     * The best value for this is T in OpenCyc and NIL otherwise
     */
    @LispMethod(comment = "The best value for this is T in OpenCyc and NIL otherwise\ndefparameter")
    public static final SubLSymbol $owl_use_pretty_stringsP$ = makeSymbol("*OWL-USE-PRETTY-STRINGS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_use_entity_referencesP$ = makeSymbol("*OWL-USE-ENTITY-REFERENCES?*");

    // defparameter
    /**
     * NIL will remove them just for predicates, T will remove them for everything
     */
    @LispMethod(comment = "NIL will remove them just for predicates, T will remove them for everything\ndefparameter")
    private static final SubLSymbol $owl_remove_isa_individual_asentsP$ = makeSymbol("*OWL-REMOVE-ISA-INDIVIDUAL-ASENTS?*");

    // defparameter
    // set to T if you want to do a fast test profiling run
    /**
     * set to T if you want to do a fast test profiling run
     */
    @LispMethod(comment = "set to T if you want to do a fast test profiling run\ndefparameter")
    private static final SubLSymbol $owl_profilingP$ = makeSymbol("*OWL-PROFILING?*");

    // defparameter
    // Are we exporting from an OpenCyc KB?
    /**
     * Are we exporting from an OpenCyc KB?
     */
    @LispMethod(comment = "Are we exporting from an OpenCyc KB?\ndefparameter")
    public static final SubLSymbol $owl_export_from_opencyc_kbP$ = makeSymbol("*OWL-EXPORT-FROM-OPENCYC-KB?*");

    // defparameter
    /**
     * Set to a positive integer if you want to limit the number of terms exported
     * per major category -- classes, properties, individuals. NIL otherwise.
     */
    @LispMethod(comment = "Set to a positive integer if you want to limit the number of terms exported\r\nper major category -- classes, properties, individuals. NIL otherwise.\ndefparameter\nSet to a positive integer if you want to limit the number of terms exported\nper major category -- classes, properties, individuals. NIL otherwise.")
    public static final SubLSymbol $owl_export_cap_per_category$ = makeSymbol("*OWL-EXPORT-CAP-PER-CATEGORY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_export_mt$ = makeSymbol("*OWL-EXPORT-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_export_ontology$ = makeSymbol("*OWL-EXPORT-ONTOLOGY*");

    // deflexical
    // LISTP of bindable parameters that affect OWL export.
    /**
     * LISTP of bindable parameters that affect OWL export.
     */
    @LispMethod(comment = "LISTP of bindable parameters that affect OWL export.\ndeflexical")
    private static final SubLSymbol $owl_export_parameters$ = makeSymbol("*OWL-EXPORT-PARAMETERS*");

    // deflexical
    // This default value is based on a 2007 OWL OpenCyc export
    /**
     * This default value is based on a 2007 OWL OpenCyc export
     */
    @LispMethod(comment = "This default value is based on a 2007 OWL OpenCyc export\ndeflexical")
    private static final SubLSymbol $owl_expected_nart_count$ = makeSymbol("*OWL-EXPECTED-NART-COUNT*");

    // deflexical
    // Predicates that can only appear once per term chunk
    /**
     * Predicates that can only appear once per term chunk
     */
    @LispMethod(comment = "Predicates that can only appear once per term chunk\ndeflexical")
    private static final SubLSymbol $owl_singleton_predicate_list$ = makeSymbol("*OWL-SINGLETON-PREDICATE-LIST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $assertion_arg0s_excluded_from_owl_export$ = makeSymbol("*ASSERTION-ARG0S-EXCLUDED-FROM-OWL-EXPORT*");

    // deflexical
    // Don't replace these with an owl-specific property.
    /**
     * Don't replace these with an owl-specific property.
     */
    @LispMethod(comment = "Don\'t replace these with an owl-specific property.\ndeflexical")
    private static final SubLSymbol $owl_cycl_predicates_to_use_as_is$ = makeSymbol("*OWL-CYCL-PREDICATES-TO-USE-AS-IS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_cycl_type_table$ = makeSymbol("*OWL-CYCL-TYPE-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_cycl_property_table$ = makeSymbol("*OWL-CYCL-PROPERTY-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_cycl_collection_table$ = makeSymbol("*OWL-CYCL-COLLECTION-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_cycl_xsd_schema_table$ = makeSymbol("*OWL-CYCL-XSD-SCHEMA-TABLE*");

    // deflexical
    // Predicates that can only take a fort as their arg2
    /**
     * Predicates that can only take a fort as their arg2
     */
    @LispMethod(comment = "Predicates that can only take a fort as their arg2\ndeflexical")
    private static final SubLSymbol $owl_fort_arg2_predicates$ = makeSymbol("*OWL-FORT-ARG2-PREDICATES*");

    // deflexical
    // Predicates that can take anything at all as their arg2
    /**
     * Predicates that can take anything at all as their arg2
     */
    @LispMethod(comment = "Predicates that can take anything at all as their arg2\ndeflexical")
    private static final SubLSymbol $owl_permissive_arg2_predicates$ = makeSymbol("*OWL-PERMISSIVE-ARG2-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $fort_owl_name_table$ = makeSymbol("*FORT-OWL-NAME-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_name_uniquifier_lock$ = makeSymbol("*OWL-NAME-UNIQUIFIER-LOCK*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $fort_owl_name_counter$ = makeSymbol("*FORT-OWL-NAME-COUNTER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_transitive_via_genls_arg2_preds_to_filter$ = makeSymbol("*OWL-TRANSITIVE-VIA-GENLS-ARG2-PREDS-TO-FILTER*");

    // deflexical
    // Don't export any assertions whose formulas match one of these patterns.
    /**
     * Don't export any assertions whose formulas match one of these patterns.
     */
    @LispMethod(comment = "Don\'t export any assertions whose formulas match one of these patterns.\ndeflexical")
    private static final SubLSymbol $owl_blacklist_sentence_patterns$ = makeSymbol("*OWL-BLACKLIST-SENTENCE-PATTERNS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $asent_to_owl_cyclify$ = makeSymbol("*ASENT-TO-OWL-CYCLIFY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $owl_include_cyc_constant_popupsP$ = makeSymbol("*OWL-INCLUDE-CYC-CONSTANT-POPUPS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_link_constant_references_for_these_preds$ = makeSymbol("*OWL-LINK-CONSTANT-REFERENCES-FOR-THESE-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_span_id_counter$ = makeSymbol("*OWL-SPAN-ID-COUNTER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $inverse_binary_predicate_var$ = makeSymbol("*INVERSE-BINARY-PREDICATE-VAR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rdf_name_invalid_start_char_prefix$ = makeSymbol("*RDF-NAME-INVALID-START-CHAR-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ontology_uris$ = makeSymbol("*ONTOLOGY-URIS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $invalid_owl_name_chars_remove$ = makeSymbol("*INVALID-OWL-NAME-CHARS-REMOVE*");

    // deflexical
    /**
     *
     *
     * @unknown -- Since we use these names as file names for individual terms,
    we also exclude characters that file systems don't like to have in filenames.
     */
    @LispMethod(comment = "@unknown -- Since we use these names as file names for individual terms,\r\nwe also exclude characters that file systems don\'t like to have in filenames.\ndeflexical")
    private static final SubLSymbol $invalid_owl_name_chars_underscore$ = makeSymbol("*INVALID-OWL-NAME-CHARS-UNDERSCORE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_human_readable_name_generation_mt$ = makeSymbol("*OWL-HUMAN-READABLE-NAME-GENERATION-MT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $umbel_id_map$ = makeSymbol("*UMBEL-ID-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $umbel_data_files$ = makeSymbol("*UMBEL-DATA-FILES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("ASENTS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $owl_asents_to_export$ = makeSymbol("*OWL-ASENTS-TO-EXPORT*");

    static private final SubLString $str4$_OWL_EXPORT_TERMS__is_not_set_ = makeString("*OWL-EXPORT-TERMS* is not set.");



    static private final SubLList $list7 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("VERSION-DATE"), list(QUOTE, makeSymbol("*OWL-EXPORT-VERSION-DATE*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $owl_export_version_date$ = makeSymbol("*OWL-EXPORT-VERSION-DATE*");

    static private final SubLList $list9 = list(makeSymbol("*OWL-USE-PRETTY-STRINGS?*"), T);

    static private final SubLList $list10 = list(makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*"), T);

    static private final SubLList $list11 = list(list(makeSymbol("*OWL-USE-ENTITY-REFERENCES?*"), NIL), list(makeSymbol("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*"), T), list(makeSymbol("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*"), T), list(makeSymbol("*OWL-EXPORT-FROM-OPENCYC-KB?*"), T));

    private static final SubLSymbol WITH_OPENCYC_OWL_EXPORT_PARAMETERS = makeSymbol("WITH-OPENCYC-OWL-EXPORT-PARAMETERS");

    private static final SubLSymbol WITH_HUMAN_READABLE_OWL_EXPORT_PARAMETERS = makeSymbol("WITH-HUMAN-READABLE-OWL-EXPORT-PARAMETERS");

    static private final SubLList $list14 = list(makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*"), NIL);

    static private final SubLString $str17$Human_readable_OWL_export_require = makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");

    static private final SubLList $list18 = list(makeSymbol("*XML-STREAM*"), makeSymbol("*OWL-USE-PRETTY-STRINGS?*"), makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*"), makeSymbol("*OWL-USE-ENTITY-REFERENCES?*"), makeSymbol("*OWL-EXPORT-VERSION-DATE*"), makeSymbol("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*"), makeSymbol("*OWL-EXPORT-FROM-OPENCYC-KB?*"));

    static private final SubLList $list19 = list(list(makeSymbol("TERM-VAR"), makeSymbol("TERM-ITERATOR"), makeSymbol("&OPTIONAL"), makeSymbol("TERM-COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym20$TERM = makeUninternedSymbol("TERM");

    static private final SubLSymbol $sym21$TERM_LIST = makeUninternedSymbol("TERM-LIST");

    public static final SubLSymbol $owl_export_terms$ = makeSymbol("*OWL-EXPORT-TERMS*");

    static private final SubLList $list24 = list(makeSymbol("FUNCTION"), EQUAL);

    static private final SubLList $list25 = list(NIL);

    static private final SubLList $list28 = list(makeSymbol("*OWL-EXPORT-TERMS*"));

    private static final SubLSymbol NEW_LIST_ITERATOR = makeSymbol("NEW-LIST-ITERATOR");

    private static final SubLInteger $int$14822 = makeInteger(14822);

    static private final SubLList $list33 = list(reader_make_constant_shell("preferredEnglish"), reader_make_constant_shell("cycName"), reader_make_constant_shell("comment"), reader_make_constant_shell("owlExternalID"), reader_make_constant_shell("termOfUnit"));

    private static final SubLSymbol OWL_CYCL_PREDICATE_TABLE = makeSymbol("OWL-CYCL-PREDICATE-TABLE");

    static private final SubLList $list35 = cons(reader_make_constant_shell("specialIsa"), makeString("rdf:type"));

    static private final SubLList $list36 = cons(reader_make_constant_shell("preferredEnglish"), makeString("rdfs:label"));

    static private final SubLList $list37 = cons(reader_make_constant_shell("skos:prefLabel"), makeString("skos:prefLabel"));







    static private final SubLString $str41$_ = makeString(":");

    static private final SubLString $$$label = makeString("label");

    static private final SubLList $list43 = cons(reader_make_constant_shell("comment"), makeString("rdfs:comment"));



    static private final SubLString $$$externalID = makeString("externalID");

    static private final SubLList $list46 = list(new SubLObject[]{ cons(reader_make_constant_shell("broaderTerm"), makeString("broaderTerm")), cons(reader_make_constant_shell("owl:sameAs"), makeString("owl:sameAs")), cons(reader_make_constant_shell("rdfURI"), makeString("owl:sameAs")), cons(reader_make_constant_shell("owl:inverseOf"), makeString("owl:inverseOf")), cons(reader_make_constant_shell("isa"), makeString("rdf:type")), cons(reader_make_constant_shell("genls"), makeString("rdfs:subClassOf")), cons(reader_make_constant_shell("genlPreds"), makeString("rdfs:subPropertyOf")), cons(reader_make_constant_shell("arg1Isa"), makeString("rdfs:domain")), cons(reader_make_constant_shell("arg1SometimesIsa"), makeString("rdfs:domain")), cons(reader_make_constant_shell("arg2Isa"), makeString("rdfs:range")), cons(reader_make_constant_shell("arg2SometimesIsa"), makeString("rdfs:range")), cons(reader_make_constant_shell("equals"), makeString("owl:sameAs")), cons(reader_make_constant_shell("owl:intersectionOf"), makeString("owl:intersectionOf")), cons(reader_make_constant_shell("disjointWith"), makeString("owl:disjointWith")), cons(reader_make_constant_shell("OWLRestrictionFn"), makeString("owl:Restriction")), cons(reader_make_constant_shell("owl:onProperty"), makeString("owl:onProperty")), cons(reader_make_constant_shell("owl:hasValue"), makeString("owl:hasValue")) });

    public static final SubLSymbol $owl_cycl_predicate_table_caching_state$ = makeSymbol("*OWL-CYCL-PREDICATE-TABLE-CACHING-STATE*");

    private static final SubLList $list48 = list(reader_make_constant_shell("prettyString"), reader_make_constant_shell("prettyString-Canonical"), reader_make_constant_shell("termOfUnit"));

    static private final SubLList $list49 = list(reader_make_constant_shell("broaderThan"), reader_make_constant_shell("broaderTerm"), reader_make_constant_shell("requiredActorSlots"));

    static private final SubLList $list50 = list(cons(reader_make_constant_shell("Collection"), makeString("owl:Class")), cons(reader_make_constant_shell("BinaryPredicate"), makeString("owl:ObjectProperty")));

    static private final SubLList $list51 = list(new SubLObject[]{ cons(reader_make_constant_shell("SubLAtomicTerm"), makeString("http://www.w3.org/2000/01/rdf-schema#Literal")), cons(reader_make_constant_shell("isa"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")), cons(reader_make_constant_shell("genls"), makeString("http://www.w3.org/2000/01/rdf-schema#subClassOf")), cons(reader_make_constant_shell("genlPreds"), makeString("http://www.w3.org/2000/01/rdf-schema#subPropertyOf")), cons(reader_make_constant_shell("comment"), makeString("http://www.w3.org/2000/01/rdf-schema#comment")), cons(reader_make_constant_shell("disjointWith"), makeString("http://www.w3.org/2002/07/owl#disjointWith")), cons(reader_make_constant_shell("different"), makeString("http://www.w3.org/2002/07/owl#differentFrom")), cons(reader_make_constant_shell("equals"), makeString("http://www.w3.org/2002/07/owl#sameAs")), cons(reader_make_constant_shell("arg1Isa"), makeString("http://www.w3.org/2000/01/rdf-schema#domain")), cons(reader_make_constant_shell("arg2Isa"), makeString("http://www.w3.org/2000/01/rdf-schema#range")), cons(reader_make_constant_shell("arg1SometimesIsa"), makeString("http://www.w3.org/2000/01/rdf-schema#domain")), cons(reader_make_constant_shell("arg2SometimesIsa"), makeString("http://www.w3.org/2000/01/rdf-schema#range")), cons(reader_make_constant_shell("ontologyVersionInfo"), makeString("http://www.w3.org/2002/07/owl#versionInfo")), cons(reader_make_constant_shell("ontologyPriorVersion"), makeString("http://www.w3.org/2002/07/owl#priorVersion")), cons(reader_make_constant_shell("incompatibleOntology"), makeString("http://www.w3.org/2002/07/owl#incompatibleWith")), cons(reader_make_constant_shell("owl:differentFrom"), makeString("http://www.w3.org/2002/07/owl#differentFrom")), cons(reader_make_constant_shell("backwardsCompatibleOntology"), makeString("http://www.w3.org/2002/07/owl#backwardCompatibleWith")), cons(reader_make_constant_shell("inverseBinaryPredicateOf"), makeString("http://www.w3.org/2002/07/owl#inverseOf")), cons(reader_make_constant_shell("coExtensional"), makeString("http://www.w3.org/2002/07/owl#equivalentClass")), cons(reader_make_constant_shell("owlRestrictionAllValuesFrom"), makeString("http://www.w3.org/2002/07/owl#allValuesFrom")) });

    static private final SubLList $list52 = list(new SubLObject[]{ list(reader_make_constant_shell("owl:Thing"), makeString("owl"), makeString("Thing")), list(reader_make_constant_shell("owl:Nothing"), makeString("owl"), makeString("Nothing")), list(reader_make_constant_shell("owl:Class"), makeString("owl"), makeString("Class")), list(reader_make_constant_shell("owl:DeprecatedClass"), makeString("owl"), makeString("DeprecatedClass")), list(reader_make_constant_shell("owl:TransitiveProperty"), makeString("owl"), makeString("TransitiveProperty")), list(reader_make_constant_shell("owl:SymmetricProperty"), makeString("owl"), makeString("SymmetricProperty")), list(reader_make_constant_shell("owl:ObjectProperty"), makeString("owl"), makeString("ObjectProperty")), list(reader_make_constant_shell("owl:DatatypeProperty"), makeString("owl"), makeString("DatatypeProperty")), list(reader_make_constant_shell("owl:DeprecatedProperty"), makeString("owl"), makeString("DeprecatedProperty")), list(reader_make_constant_shell("owl:FunctionalProperty"), makeString("owl"), makeString("FunctionalProperty")), list(reader_make_constant_shell("owl:InverseFunctionalProperty"), makeString("owl"), makeString("InverseFunctionalProperty")) });

    static private final SubLList $list53 = list(new SubLObject[]{ cons(reader_make_constant_shell("UniformResourceIdentifier"), makeString("http://www.w3.org/2001/XMLSchema#uriReference")), cons(reader_make_constant_shell("UniformResourceLocator"), makeString("http://www.w3.org/2001/XMLSchema#uriReference")), cons(reader_make_constant_shell("Date"), makeString("http://www.w3.org/2001/XMLSchema#date")), cons(reader_make_constant_shell("SubLRealNumber"), makeString("http://www.w3.org/2001/XMLSchema#double")), cons(reader_make_constant_shell("SubLString"), makeString("http://www.w3.org/2001/XMLSchema#string")), cons(reader_make_constant_shell("SubLInteger"), makeString("http://www.w3.org/2001/XMLSchema#integer")), cons(reader_make_constant_shell("PositiveInteger"), makeString("http://www.w3.org/2001/XMLSchema#positiveInteger")), cons(reader_make_constant_shell("Integer"), makeString("http://www.w3.org/2001/XMLSchema#integer")), cons(reader_make_constant_shell("NonNegativeInteger"), makeString("http://www.w3.org/2001/XMLSchema#nonNegativeInteger")), cons(reader_make_constant_shell("SubLBoolean"), makeString("http://www.w3.org/2001/XMLSchema#boolean")), cons(reader_make_constant_shell("CalendarSecond"), makeString("http://www.w3.org/2001/XMLSchema#dateTime")), cons(reader_make_constant_shell("CalendarDay"), makeString("http://www.w3.org/2001/XMLSchema#date")), cons(reader_make_constant_shell("CalendarMonth"), makeString("http://www.w3.org/2001/XMLSchema#gYearMonth")), cons(reader_make_constant_shell("CalendarYear"), makeString("http://www.w3.org/2001/XMLSchema#gYear")), cons(reader_make_constant_shell("DayOfMonthType"), makeString("http://www.w3.org/2001/XMLSchema#gDay")), cons(reader_make_constant_shell("GregorianMonthType"), makeString("http://www.w3.org/2001/XMLSchema#gMonth")) });

    static private final SubLList $list54 = list(new SubLObject[]{ reader_make_constant_shell("broaderThan"), reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg1SometimesIsa"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg2SometimesIsa"), reader_make_constant_shell("equals") });

    static private final SubLList $list55 = list(reader_make_constant_shell("termOfUnit"));

    static private final SubLList $list56 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("DUMP-DIRECTORY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list57 = list(list(makeSymbol("*FORT-OWL-NAME-TABLE*"), list(makeSymbol("UNINITIALIZED"))));

    private static final SubLSymbol WRITE_FORT_OWL_NAME_TABLE = makeSymbol("WRITE-FORT-OWL-NAME-TABLE");

    private static final SubLString $str62$ = makeString("");

    private static final SubLString $str63$_ = makeString("/");

    private static final SubLString $str64$fort_owl_names_csv = makeString("fort-owl-names.csv");

    private static final SubLString $str66$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLList $list67 = cons(makeSymbol("NAME"), makeSymbol("TYPE"));

    private static final SubLString $str68$_S___S__ = makeString("~S, ~S~%");

    private static final SubLString $$$OWL_Name_Uniquifier = makeString("OWL Name Uniquifier");



    private static final SubLList $list72 = list(list(makeKeyword("OR"), reader_make_constant_shell("BinaryPredicate"), reader_make_constant_shell("Thing")));



    static private final SubLList $list74 = cons(list(makeKeyword("OR"), reader_make_constant_shell("synonymousExternalConcept"), reader_make_constant_shell("synonymousExternalPred-Inverse")), makeKeyword("ANYTHING"));

    private static final SubLString $str75$unexpected_asent__s = makeString("unexpected asent ~s");

    private static final SubLObject $const76$owl_sameAs = reader_make_constant_shell("owl:sameAs");

    private static final SubLString $str77$Caught_error_OWL_cyclifying__S___ = makeString("Caught error OWL-cyclifying ~S:~% ~S");

    private static final SubLString $str78$_S_is_not_a_FORT_ = makeString("~S is not a FORT.");

    private static final SubLSymbol META_VARIABLE_P = makeSymbol("META-VARIABLE-P");

    private static final SubLObject $const80$owl_Ontology = reader_make_constant_shell("owl:Ontology");

    private static final SubLString $str81$Can_t_export_OWL_Ontology_as_part = makeString("Can't export OWL Ontology as part of export of larger ontology: ~S");

    private static final SubLString $$$Sorting_ = makeString("Sorting ");

    private static final SubLString $str83$_terms_for_OWL_export___ = makeString(" terms for OWL export...");

    private static final SubLString $str85$Couldn_t_resolve__S_to_a_canonica = makeString("Couldn't resolve ~S to a canonical FORT.");

    private static final SubLSymbol OWL_EXPORT_CANONICALIZE_NART = makeSymbol("OWL-EXPORT-CANONICALIZE-NART");

    private static final SubLInteger $int$225 = makeInteger(225);

    private static final SubLSymbol $sym89$SUBSUMED_OWL_ASENT_ = makeSymbol("SUBSUMED-OWL-ASENT?");

    private static final SubLList $list90 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    private static final SubLSymbol NONEXPORTABLE_TERM_WARNING = makeSymbol("NONEXPORTABLE-TERM-WARNING");

    private static final SubLString $str92$Can_t_export__S = makeString("Can't export ~S");

    private static final SubLString $str93$Not_a_collection___S = makeString("Not a collection: ~S");



    private static final SubLString $str96$Restriction_property_is_not_a_bin = makeString("Restriction property is not a binary predicate(!): ~S");

    private static final SubLList $list97 = list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"));

    private static final SubLString $str98$Couldn_t_find_or_create_inverse_o = makeString("Couldn't find or create inverse of ~S");

    static private final SubLList $list99 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"));

    private static final SubLString $str100$restriction_property_is_not_a_FOR = makeString("restriction property is not a FORT: ~S");

    private static final SubLSymbol $sym101$OWL_FORT__ = makeSymbol("OWL-FORT-<");

    private static final SubLSymbol $sym104$OWL_BLACKLIST_SENTENCE_ = makeSymbol("OWL-BLACKLIST-SENTENCE?");

    private static final SubLSymbol $sym105$OWLIFIABLE_SENTENCE_ = makeSymbol("OWLIFIABLE-SENTENCE?");

    private static final SubLList $list106 = list(cons(list($TEST, makeSymbol("OWL-BLACKLIST-PREDICATE?")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("quotedIsa"), makeKeyword("ANYTHING"), reader_make_constant_shell("TerrorismOntologyConstant")));

    private static final SubLSymbol $sym107$OWL_ISA_LIT_ = makeSymbol("OWL-ISA-LIT?");

    private static final SubLSymbol $sym108$OWL_GENLS_LIT_ = makeSymbol("OWL-GENLS-LIT?");

    private static final SubLSymbol $sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_ = makeSymbol("VALID-COLLECTION-FORT-FOR-OWL-EXPORT?");



    private static final SubLObject $const111$synonymousExternalConceptWRTPredi = reader_make_constant_shell("synonymousExternalConceptWRTPredicate");

    private static final SubLObject $$rdf_type = reader_make_constant_shell("rdf-type");



    private static final SubLSymbol $sym115$OWL_ASENT__ = makeSymbol("OWL-ASENT-<");

    private static final SubLSymbol $sym116$COMMENT_ASENT_ = makeSymbol("COMMENT-ASENT?");



    private static final SubLList $list118 = listS(list(makeKeyword("OR"), reader_make_constant_shell("synonymousExternalConcept"), reader_make_constant_shell("synonymousExternalPred-Inverse")), list($TEST, makeSymbol("FORT-P")), makeKeyword("ANYTHING"));

    private static final SubLList $list119 = list(reader_make_constant_shell("SecondFn"), reader_make_constant_shell("DayFn"), reader_make_constant_shell("MonthFn"), reader_make_constant_shell("YearFn"), reader_make_constant_shell("CenturyFn"));





    private static final SubLList $list122 = list(reader_make_constant_shell("owl:FunctionalProperty"));

    private static final SubLList $list123 = list(reader_make_constant_shell("owl:InverseFunctionalProperty"));





    private static final SubLList $list126 = list(TWO_INTEGER, ONE_INTEGER);



    static private final SubLList $list128 = list(TWO_INTEGER);

    private static final SubLList $list129 = list(ONE_INTEGER, ONE_INTEGER);

    static private final SubLList $list130 = list(ONE_INTEGER);

    private static final SubLSymbol $sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_ = makeSymbol("OWL-REDUNDANT-TYPE-ISA-ASENT?");

    private static final SubLObject $const132$rdfs_subClassOf = reader_make_constant_shell("rdfs:subClassOf");

    private static final SubLSymbol $sym133$ISA_LIT_ = makeSymbol("ISA-LIT?");

    private static final SubLSymbol $sym134$ISA_INDIVIDUAL_ASENT_ = makeSymbol("ISA-INDIVIDUAL-ASENT?");





    private static final SubLString $str138$unexpected_owl_cycl_pred_for_asen = makeString("unexpected owl-cycl-pred for asent ~s");

    private static final SubLString $str139$Caught_error__S___while_trying_to = makeString("Caught error ~S~% while trying to OWL-cyclify~% ~S");

    private static final SubLList $list140 = list(makeSymbol("PREDICATE"), makeSymbol("SUBJECT"), makeSymbol("OBJECT"));

    private static final SubLString $$$subject = makeString("subject");

    private static final SubLString $$$predicate = makeString("predicate");

    private static final SubLString $$$object = makeString("object");



    private static final SubLSymbol $sym146$FORT_IN_OWL_EXPORT_ = makeSymbol("FORT-IN-OWL-EXPORT?");

    private static final SubLSymbol $sym147$OWLIFIABLE_ARG1_ = makeSymbol("OWLIFIABLE-ARG1?");

    private static final SubLString $str148$Invalid_term_type___S_for__S__Exp = makeString("Invalid term type: ~S for ~S~%Export default namespace = ~S");









    private static final SubLString $str153$Unexpected_EL_formula_arg2___S = makeString("Unexpected EL formula arg2: ~S");

    private static final SubLList $list154 = list(makeSymbol("ENTITY"), makeSymbol("LOCAL-NAME"));

    private static final SubLString $str155$Raw_term_string_for__S___S = makeString("Raw term string for ~S: ~S");

    private static final SubLString $str156$Need_XSD_datatype_for__S = makeString("Need XSD datatype for ~S");











    private static final SubLString $$$xsd = makeString("xsd");

    private static final SubLString $$$integer = makeString("integer");

    private static final SubLString $$$decimal = makeString("decimal");

    private static final SubLString $$$date = makeString("date");

    private static final SubLString $$$timeInstant = makeString("timeInstant");

    private static final SubLString $str167$Don_t_know_XSD_datatype_for__S = makeString("Don't know XSD datatype for ~S");

    private static final SubLString $str168$YYYY_MM_DD = makeString("YYYY-MM-DD");

    private static final SubLString $str169$YYYY_MM = makeString("YYYY-MM");

    private static final SubLString $$$YYYY = makeString("YYYY");

    private static final SubLString $str171$YYYY_MM_DDTHH_MM_SS = makeString("YYYY-MM-DDTHH:MM:SS");

    private static final SubLString $str172$_ = makeString("&");

    private static final SubLString $str173$_ = makeString(";");

    private static final SubLList $list174 = list(reader_make_constant_shell("URIWithFragmentFn"), reader_make_constant_shell("URIInNamespaceFn"), reader_make_constant_shell("URIFn"));



    private static final SubLSymbol URI_FORT_P = makeSymbol("URI-FORT-P");







    private static final SubLString $str180$_ = makeString("#");

    private static final SubLSymbol $sym181$_URI_STRING = makeSymbol("?URI-STRING");



    private static final SubLList $list183 = list(makeSymbol("?URI-STRING"));

    private static final SubLList $list184 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLString $str185$Can_t_convert_URI_FORT_to_string_ = makeString("Can't convert URI FORT to string: ~S");

    static private final SubLList $list186 = list(reader_make_constant_shell("comment"));

    private static final SubLSymbol HTML_LINK_TO_OWL_URI_WITH_POPUPS = makeSymbol("HTML-LINK-TO-OWL-URI-WITH-POPUPS");

    private static final SubLSymbol HTML_LINK_TO_OWL_URI = makeSymbol("HTML-LINK-TO-OWL-URI");

    private static final SubLString $str189$TagToTip__ = makeString("TagToTip('");

    private static final SubLString $str190$__ = makeString("')");

    private static final SubLString $str191$UnTip__ = makeString("UnTip()");

    private static final SubLString $str192$owl_cyc_constant_tooltip = makeString("owl_cyc_constant_tooltip");

    private static final SubLString $str193$display__none_ = makeString("display: none;");

    private static final SubLString $str194$comment_header = makeString("comment_header");

    private static final SubLString $str195$ID___A = makeString("ID: ~A");

    private static final SubLString $str196$comment_body = makeString("comment_body");

    private static final SubLString $str197$cyc_term = makeString("cyc_term");

    private static final SubLSymbol HTML_LINK_TO_OWL_OPENCYC_URI = makeSymbol("HTML-LINK-TO-OWL-OPENCYC-URI");

    private static final SubLString $str199$No_comment_ = makeString("No comment.");



    private static final SubLObject $const201$SubcollectionOfWithRelationToType = reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn");



    private static final SubLObject $const203$SubcollectionOfWithRelationFromTy = reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn");

    private static final SubLString $str204$Couldn_t_find_inverse_of__S = makeString("Couldn't find inverse of ~S");

    private static final SubLString $str205$unexpected_subcollection_function = makeString("unexpected subcollection function ~s");

    private static final SubLObject $const206$owl_intersectionOf = reader_make_constant_shell("owl:intersectionOf");



    private static final SubLObject $const208$owl_onProperty = reader_make_constant_shell("owl:onProperty");

    private static final SubLObject $const209$owl_hasValue = reader_make_constant_shell("owl:hasValue");

    private static final SubLSymbol $sym210$_PRED = makeSymbol("?PRED");





    private static final SubLSymbol FIND_OR_CREATE_INVERSE_BINARY_PREDICATE = makeSymbol("FIND-OR-CREATE-INVERSE-BINARY-PREDICATE");



    private static final SubLList $list215 = list(reader_make_constant_shell("BinaryPredicate"));





    private static final SubLString $str218$__Created__S__ = makeString("~&Created ~S~%");

    private static final SubLSymbol $sym219$BINARY_PREDICATE_ = makeSymbol("BINARY-PREDICATE?");

    private static final SubLList $list220 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));

    private static final SubLList $list221 = list(makeSymbol("OWL-INTERSECTION-FN"), makeSymbol("CLASS"), list(makeSymbol("OWL-RESTRICTION-FN"), makeSymbol("OWL-ON-PROPERTY"), makeSymbol("PROPERTY"), makeSymbol("OWL-HAS-VALUE"), makeSymbol("VALUE")));

    private static final SubLString $str222$owl_Restriction = makeString("owl:Restriction");

    private static final SubLString $str223$owl_onProperty = makeString("owl:onProperty");

    private static final SubLString $str224$owl_hasValue = makeString("owl:hasValue");

    private static final SubLString $$$Statement = makeString("Statement");

    private static final SubLString $$$Description = makeString("Description");



    private static final SubLSymbol BEST_ISA_FOR_INDIVIDUAL = makeSymbol("BEST-ISA-FOR-INDIVIDUAL");

    private static final SubLSymbol ATOMIC_SENTENCE_ARG2 = makeSymbol("ATOMIC-SENTENCE-ARG2");

    private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");

    private static final SubLString $$$type = makeString("type");

    private static final SubLList $list236 = list(makeSymbol("ASSERTED-ONTOLOGY"), makeSymbol("POSSIBLE-URI"));

    private static final SubLList $list237 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLString $str240$_ = makeString("_");

    private static final SubLSymbol OWL_FORT_HUMAN_READABLE_NAME = makeSymbol("OWL-FORT-HUMAN-READABLE-NAME");

    private static final SubLList $list242 = list(CHAR_dollar, CHAR_underbar, CHAR_colon);

    private static final SubLSymbol NON_FORT_P = makeSymbol("NON-FORT-P");

    private static final SubLString $str244$unexpected_term__s = makeString("unexpected term ~s");

    private static final SubLInteger $int$60 = makeInteger(60);



    private static final SubLString $str248$Timed_out_generating_phrases_for_ = makeString("Timed out generating phrases for ~S.~% Phrases generated: ~S");

    static private final SubLList $list249 = list(makeSymbol("THIS-TERM"), makeSymbol("ONTOLOGY"), makeSymbol("LOCAL-NAME"));

    private static final SubLObject $$synonymousExternalPred_Inverse = reader_make_constant_shell("synonymousExternalPred-Inverse");

    private static final SubLList $list251 = list(CHAR_colon);

    private static final SubLList $list252 = list(makeSymbol("PREFIX"), makeSymbol("LOCAL-NAME"));

    private static final SubLSymbol URI_FOR_PREFIX_AND_ONTOLOGY = makeSymbol("URI-FOR-PREFIX-AND-ONTOLOGY");

    private static final SubLList $list255 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));





    private static final SubLString $str258$Couldn_t_find_expansion_for__S_wr = makeString("Couldn't find expansion for ~S wrt ~S");

    private static final SubLObject $const259$owl_inverseOf = reader_make_constant_shell("owl:inverseOf");

    private static final SubLString $str260$Can_t_get_URI_from_non_FORT_ontol = makeString("Can't get URI from non-FORT ontology ~S");

    private static final SubLString $str261$Can_t_get_URI_from_non_string_loc = makeString("Can't get URI from non-string local name ~S");

    private static final SubLList $list262 = list(makeString("#"), makeString("/"));

    private static final SubLString $str263$http___www_w3_org_2006_03_wn_wn20 = makeString("http://www.w3.org/2006/03/wn/wn20/instances");

    private static final SubLSymbol MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI = makeSymbol("MAYBE-WARN-ABOUT-ONTOLOGY-MISSING-URI");

    private static final SubLString $str265$Couldn_t_find_URI_for__S_ = makeString("Couldn't find URI for ~S.");

    private static final SubLList $list266 = list(cons(reader_make_constant_shell("FOAFOntology"), makeString("http://xmlns.com/foaf/0.1/")));

    private static final SubLSymbol ONTOLOGY_URI = makeSymbol("ONTOLOGY-URI");



    private static final SubLList $list270 = list(makeKeyword("URI"));

    private static final SubLList $list271 = list(list(makeKeyword("OR"), reader_make_constant_shell("URLFn"), reader_make_constant_shell("URIFn")), list(makeKeyword("AND"), list($TEST, makeSymbol("STRINGP")), list($BIND, makeSymbol("STRING"))));

    private static final SubLSymbol OWL_NART_NAME = makeSymbol("OWL-NART-NAME");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol OWL_NART_SORT_STRING = makeSymbol("OWL-NART-SORT-STRING");

    static private final SubLString $str277$_ = makeString("(");

    private static final SubLString $str278$___ = makeString("#<(");

    private static final SubLString $str279$_ = makeString(")");

    private static final SubLString $str280$__ = makeString(")>");

    static private final SubLString $str281$__ = makeString("#$");

    private static final SubLString $str282$_u = makeString("&u");

    private static final SubLString $str283$__ = makeString("</");

    private static final SubLSymbol INVALID_OWL_NAME_CHAR_TO_REMOVE_P = makeSymbol("INVALID-OWL-NAME-CHAR-TO-REMOVE-P");

    private static final SubLSymbol VALID_OWL_NAME_CHAR_P = makeSymbol("VALID-OWL-NAME-CHAR-P");

    private static final SubLList $list286 = list(CHAR_question, CHAR_comma, CHAR_lbrace, CHAR_rbrace, CHAR_hash);

    private static final SubLList $list287 = list(new SubLObject[]{ CHAR_hyphen, CHAR_space, CHAR_quotation, CHAR_quote, CHAR_backquote, CHAR_backslash, CHAR_colon, CHAR_slash, CHAR_semicolon, CHAR_percent, CHAR_less, CHAR_greater, CHAR_ampersand, CHAR_dollar, CHAR_lparen, CHAR_rparen, CHAR_lbrace, CHAR_rbrace, CHAR_exclamation, CHAR_at, CHAR_caret, CHAR_period });

    private static final SubLString $str288$HTML_tags_not_stripped_from__s = makeString("HTML tags not stripped from ~s");

    private static final SubLSymbol OWL_EXTERNAL_ID_STRING = makeSymbol("OWL-EXTERNAL-ID-STRING");



    private static final SubLString $str291$ID__S_for__S_is_suspiciously_shor = makeString("ID ~S for ~S is suspiciously short (~D characters)");

    private static final SubLList $list293 = list(reader_make_constant_shell("plural"));

    private static final SubLList $list294 = list(reader_make_constant_shell("singular"));



    private static final SubLSymbol OWL_GENERATE_PHRASE_INT = makeSymbol("OWL-GENERATE-PHRASE-INT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$fake_pretty_string = makeString("fake pretty string");

    private static final SubLObject $$prettyString_Canonical = reader_make_constant_shell("prettyString-Canonical");

    static private final SubLList $list304 = list(cons(makeString("/cyc/projects/opencyc/owl-export/mappings/umbel_subject_concepts_latest.csv"), makeString("http://umbel.org/umbel/sc/")), cons(makeString("/cyc/projects/opencyc/owl-export/mappings/umbel_abstract_concepts_latest.csv"), makeString("http://umbel.org/umbel/ac/")));

    private static final SubLList $list305 = cons(makeSymbol("FILE"), makeSymbol("BASE-URI"));

    private static final SubLString $str307$_ = makeString("\"");

    private static final SubLList $list308 = list(makeSymbol("UMBEL-ID"), makeSymbol("CYC-ID"));

    private static final SubLString $$$sc = makeString("sc");













    public static final SubLObject with_owl_export_asents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject asents = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            asents = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($owl_asents_to_export$, asents)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_owl_export_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject asents = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        asents = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($owl_asents_to_export$, asents)), append(body, NIL));
    }

    public static final SubLObject add_owl_asent_forts_to_export_terms_alt(SubLObject asents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(asents, LISTP);
            if (NIL == set.set_p($owl_export_terms$.getDynamicValue(thread))) {
                Errors.sublisp_break($str_alt4$_OWL_EXPORT_TERMS__is_not_set_, EMPTY_SUBL_OBJECT_ARRAY);
            }
            if (NIL != set.set_p($owl_export_terms$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = asents;
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                        {
                            SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                            SubLObject cdolist_list_var_1 = args;
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , arg = cdolist_list_var_1.first()) {
                                if ((NIL != forts.fort_p(arg)) && (NIL == set.set_memberP(arg, $owl_export_terms$.getDynamicValue(thread)))) {
                                    set.set_add(arg, $owl_export_terms$.getDynamicValue(thread));
                                }
                            }
                        }
                    }
                }
            }
            return $owl_export_terms$.getDynamicValue(thread);
        }
    }

    public static SubLObject add_owl_asent_forts_to_export_terms(final SubLObject asents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(asents) : "! listp(asents) " + ("Types.listp(asents) " + "CommonSymbols.NIL != Types.listp(asents) ") + asents;
        if (NIL == set.set_p($owl_export_terms$.getDynamicValue(thread))) {
            Errors.sublisp_break($str4$_OWL_EXPORT_TERMS__is_not_set_, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != set.set_p($owl_export_terms$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = asents;
            SubLObject asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                final SubLObject args = cdolist_list_var_$1 = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if ((NIL != forts.fort_p(arg)) && (NIL == set.set_memberP(arg, $owl_export_terms$.getDynamicValue(thread)))) {
                        set.set_add(arg, $owl_export_terms$.getDynamicValue(thread));
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    arg = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
        }
        return $owl_export_terms$.getDynamicValue(thread);
    }

    public static final SubLObject with_opencyc_owl_export_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject version_date = (current.isCons()) ? ((SubLObject) (current.first())) : $owl_export_version_date$;
                    destructuring_bind_must_listp(current, datum, $list_alt7);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, listS($list_alt9, $list_alt10, list($owl_export_version_date$, version_date), $list_alt11), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_opencyc_owl_export_parameters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject version_date = (current.isCons()) ? current.first() : $owl_export_version_date$;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, listS($list9, $list10, list($owl_export_version_date$, version_date), $list11), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject with_human_readable_opencyc_owl_export_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject version_date = (current.isCons()) ? ((SubLObject) (current.first())) : $owl_export_version_date$;
                    destructuring_bind_must_listp(current, datum, $list_alt7);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_OPENCYC_OWL_EXPORT_PARAMETERS, list(version_date), listS(WITH_HUMAN_READABLE_OWL_EXPORT_PARAMETERS, list(version_date), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_human_readable_opencyc_owl_export_parameters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject version_date = (current.isCons()) ? current.first() : $owl_export_version_date$;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_OPENCYC_OWL_EXPORT_PARAMETERS, list(version_date), listS(WITH_HUMAN_READABLE_OWL_EXPORT_PARAMETERS, list(version_date), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject with_human_readable_owl_export_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject version_date = (current.isCons()) ? ((SubLObject) (current.first())) : $owl_export_version_date$;
                    destructuring_bind_must_listp(current, datum, $list_alt7);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list($list_alt14, list($owl_export_version_date$, version_date)), list(MUST, list(UNIVERSAL_DATE_P, version_date), $str_alt17$Human_readable_OWL_export_require, version_date), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_human_readable_owl_export_parameters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject version_date = (current.isCons()) ? current.first() : $owl_export_version_date$;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list($list14, list($owl_export_version_date$, version_date)), list(MUST, list(UNIVERSAL_DATE_P, version_date), $str17$Human_readable_OWL_export_require, version_date), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject owl_export_parameter_snapshot_alt() {
        {
            SubLObject snapshot = NIL;
            SubLObject cdolist_list_var = $owl_export_parameters$.getGlobalValue();
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                snapshot = list_utilities.alist_enter(snapshot, param, eval(param), UNPROVIDED);
            }
            return snapshot;
        }
    }

    public static SubLObject owl_export_parameter_snapshot() {
        SubLObject snapshot = NIL;
        SubLObject cdolist_list_var = $owl_export_parameters$.getGlobalValue();
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            snapshot = list_utilities.alist_enter(snapshot, param, eval(param), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return snapshot;
    }

    public static final SubLObject do_owl_export_terms_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject term_var = NIL;
                    SubLObject term_iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    term_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    term_iterator = current.first();
                    current = current.rest();
                    {
                        SubLObject term_count = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt19);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject v_term = $sym20$TERM;
                                SubLObject term_list = $sym21$TERM_LIST;
                                return list(CLET, list(list($owl_export_terms$, list(NEW_SET, $list_alt24, term_count)), bq_cons(term_list, $list_alt25)), list(DO_ITERATOR, list(v_term, term_iterator), listS(SET_ADD, v_term, $list_alt28), list(CPUSH, v_term, term_list)), listS(DO_ITERATOR, list(term_var, list(NEW_LIST_ITERATOR, list(NREVERSE, term_list))), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt19);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_owl_export_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject term_iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        term_iterator = current.first();
        current = current.rest();
        final SubLObject term_count = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list19);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_term = $sym20$TERM;
            final SubLObject term_list = $sym21$TERM_LIST;
            return list(CLET, list(list($owl_export_terms$, list(NEW_SET, $list24, term_count)), bq_cons(term_list, $list25)), list(DO_ITERATOR, list(v_term, term_iterator), listS(SET_ADD, v_term, $list28), list(CPUSH, v_term, term_list)), listS(DO_ITERATOR, list(term_var, list(NEW_LIST_ITERATOR, list(NREVERSE, term_list))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list19);
        return NIL;
    }

    public static final SubLObject clear_owl_cycl_predicate_table_alt() {
        {
            SubLObject cs = $owl_cycl_predicate_table_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_owl_cycl_predicate_table() {
        final SubLObject cs = $owl_cycl_predicate_table_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_owl_cycl_predicate_table_alt(SubLObject external_namesP) {
        if (external_namesP == UNPROVIDED) {
            external_namesP = $owl_use_external_ids_for_namesP$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($owl_cycl_predicate_table_caching_state$.getGlobalValue(), list(external_namesP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_owl_cycl_predicate_table(SubLObject external_namesP) {
        if (external_namesP == UNPROVIDED) {
            external_namesP = $owl_use_external_ids_for_namesP$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($owl_cycl_predicate_table_caching_state$.getGlobalValue(), list(external_namesP), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject owl_cycl_predicate_table_internal_alt(SubLObject external_namesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = NIL;
                {
                    SubLObject _prev_bind_0 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = owl_uris_and_prefixes.$owl_export_base_uri$.currentBinding(thread);
                    try {
                        $owl_use_external_ids_for_namesP$.bind(external_namesP, thread);
                        owl_uris_and_prefixes.$owl_export_base_uri$.bind(misc_utilities.uninitialized(), thread);
                        table = listS($list_alt35, new SubLObject[]{ $list_alt36, $list_alt37, bq_cons($$otherEnglish, com.cyc.cycjava.cycl.owl.owlification.owl_fort_name($$prettyString, UNPROVIDED, UNPROVIDED)), bq_cons($$cycName, cconcatenate(owl_uris_and_prefixes.cyc_annotation_prefix(), new SubLObject[]{ $str_alt41$_, $$$label })), $list_alt43, bq_cons($$owlExternalID, cconcatenate(owl_uris_and_prefixes.cyc_annotation_prefix(), new SubLObject[]{ $str_alt41$_, $$$externalID })), $list_alt46 });
                    } finally {
                        owl_uris_and_prefixes.$owl_export_base_uri$.rebind(_prev_bind_1, thread);
                        $owl_use_external_ids_for_namesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return table;
            }
        }
    }

    public static SubLObject owl_cycl_predicate_table_internal(final SubLObject external_namesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table = NIL;
        final SubLObject _prev_bind_0 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_base_uri$.currentBinding(thread);
        try {
            $owl_use_external_ids_for_namesP$.bind(external_namesP, thread);
            owl_uris_and_prefixes.$owl_export_base_uri$.bind(misc_utilities.uninitialized(), thread);
            table = listS($list35, new SubLObject[]{ $list36, $list37, bq_cons($$otherEnglish, owl_fort_name($$prettyString, T, UNPROVIDED)), bq_cons($$cycName, cconcatenate(owl_uris_and_prefixes.cyc_annotation_prefix(), new SubLObject[]{ $str41$_, $$$label })), $list43, bq_cons($$owlExternalID, cconcatenate(owl_uris_and_prefixes.cyc_annotation_prefix(), new SubLObject[]{ $str41$_, $$$externalID })), $list46 });
        } finally {
            owl_uris_and_prefixes.$owl_export_base_uri$.rebind(_prev_bind_2, thread);
            $owl_use_external_ids_for_namesP$.rebind(_prev_bind_0, thread);
        }
        return table;
    }

    public static final SubLObject owl_cycl_predicate_table_alt(SubLObject external_namesP) {
        if (external_namesP == UNPROVIDED) {
            external_namesP = $owl_use_external_ids_for_namesP$.getDynamicValue();
        }
        {
            SubLObject caching_state = $owl_cycl_predicate_table_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(OWL_CYCL_PREDICATE_TABLE, $owl_cycl_predicate_table_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, external_namesP, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_cycl_predicate_table_internal(external_namesP)));
                    memoization_state.caching_state_put(caching_state, external_namesP, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject owl_cycl_predicate_table(SubLObject external_namesP) {
        if (external_namesP == UNPROVIDED) {
            external_namesP = $owl_use_external_ids_for_namesP$.getDynamicValue();
        }
        SubLObject caching_state = $owl_cycl_predicate_table_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OWL_CYCL_PREDICATE_TABLE, $owl_cycl_predicate_table_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, external_namesP, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(owl_cycl_predicate_table_internal(external_namesP)));
            memoization_state.caching_state_put(caching_state, external_namesP, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject with_new_fort_owl_name_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dump_directory = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt57);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt58, append(body, list(list(PWHEN, list(DIRECTORY_P, dump_directory), list(WRITE_FORT_OWL_NAME_TABLE, dump_directory)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_new_fort_owl_name_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject dump_directory = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list57, append(body, list(list(PWHEN, list(DIRECTORY_P, dump_directory), list(WRITE_FORT_OWL_NAME_TABLE, dump_directory)))));
        }
        cdestructuring_bind_error(datum, $list56);
        return NIL;
    }

    public static final SubLObject note_fort_owl_name_alt(SubLObject fort, SubLObject name, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $OWL_NAME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(cons(name, type), $fort_owl_name_table$.getDynamicValue(thread), fort);
            return name;
        }
    }

    public static SubLObject note_fort_owl_name(final SubLObject fort, final SubLObject name, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $OWL_NAME;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(cons(name, type), $fort_owl_name_table$.getDynamicValue(thread), fort);
        return name;
    }

    public static final SubLObject write_fort_owl_name_table_alt(SubLObject dump_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = cconcatenate(dump_directory, new SubLObject[]{ CHAR_slash.eql(string_utilities.last_char(dump_directory)) ? ((SubLObject) ($str_alt63$)) : $str_alt64$_, $str_alt65$fort_owl_names_csv });
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt67$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_2 = stream;
                        SubLObject cdohash_table = $fort_owl_name_table$.getDynamicValue(thread);
                        SubLObject key = NIL;
                        SubLObject fort = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    key = getEntryKey(cdohash_entry);
                                    fort = getEntryValue(cdohash_entry);
                                    {
                                        SubLObject datum = key;
                                        SubLObject current = datum;
                                        SubLObject name = NIL;
                                        SubLObject type = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt68);
                                        name = current.first();
                                        current = current.rest();
                                        type = current;
                                        if (type.eql($OWL_NAME)) {
                                            format(stream_2, $str_alt69$_S___S__, kb_utilities.compact_hl_external_id_string(fort), name);
                                        }
                                    }
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return filename;
            }
        }
    }

    public static SubLObject write_fort_owl_name_table(final SubLObject dump_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = cconcatenate(dump_directory, new SubLObject[]{ CHAR_slash.eql(string_utilities.last_char(dump_directory)) ? $str62$ : $str63$_, $str64$fort_owl_names_csv });
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
                Errors.error($str66$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            final SubLObject cdohash_table = $fort_owl_name_table$.getDynamicValue(thread);
            SubLObject key = NIL;
            SubLObject fort = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    fort = getEntryValue(cdohash_entry);
                    SubLObject current;
                    final SubLObject datum = current = key;
                    SubLObject name = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list67);
                    name = current.first();
                    current = type = current.rest();
                    if (type.eql($OWL_NAME)) {
                        format(stream_$2, $str68$_S___S__, kb_utilities.compact_hl_external_id_string(fort), name);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
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
        return filename;
    }

    public static final SubLObject find_fort_by_owl_name_alt(SubLObject name, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $OWL_NAME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = (type.eql($OWL_NAME)) ? ((SubLObject) (constants_high.find_constant(name))) : NIL;
                return NIL != constant ? ((SubLObject) (constant)) : gethash_without_values(cons(name, type), $fort_owl_name_table$.getDynamicValue(thread), NIL);
            }
        }
    }

    public static SubLObject find_fort_by_owl_name(final SubLObject name, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $OWL_NAME;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = (type.eql($OWL_NAME)) ? constants_high.find_constant(name) : NIL;
        return NIL != constant ? constant : gethash_without_values(cons(name, type), $fort_owl_name_table$.getDynamicValue(thread), NIL);
    }

    /**
     * Returns an OWL-CycL term chunk
     */
    @LispMethod(comment = "Returns an OWL-CycL term chunk")
    public static final SubLObject owl_cyclify_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject owl_cycl_sentences = NIL;
                SubLObject error_message = NIL;
                SubLObject arg1 = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($owl_export_mt$.getDynamicValue(thread));
                                    {
                                        SubLObject _prev_bind_0_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject state = memoization_state.possibly_new_memoization_state();
                                                SubLObject local_state = state;
                                                {
                                                    SubLObject _prev_bind_0_4 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        {
                                                            SubLObject original_memoization_process = NIL;
                                                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                {
                                                                    SubLObject current_proc = current_process();
                                                                    if (NIL == original_memoization_process) {
                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                    } else {
                                                                        if (original_memoization_process != current_proc) {
                                                                            Errors.error($str_alt72$Invalid_attempt_to_reuse_memoizat);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                com.cyc.cycjava.cycl.owl.owlification.possibly_initialize_owl_export_state();
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        {
                                                                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.owl.owlification.all_gaf_arg1_owlifiable_asents_sorted(v_term);
                                                                            SubLObject sentence = NIL;
                                                                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                                                if ((NIL != formula_pattern_match.formula_matches_pattern(sentence, listS($$isa, v_term, $list_alt74))) && (NIL != kb_accessors.binary_predicateP(v_term))) {
                                                                                } else {
                                                                                    if (NIL != formula_pattern_match.formula_matches_pattern(sentence, list($$genls, v_term, v_term))) {
                                                                                    } else {
                                                                                        if (NIL != atomic_sentenceP(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED))) {
                                                                                            {
                                                                                                SubLObject items_var = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_meta_asent(sentence);
                                                                                                if (items_var.isVector()) {
                                                                                                    {
                                                                                                        SubLObject vector_var = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_meta_asent(sentence);
                                                                                                        SubLObject backwardP_var = NIL;
                                                                                                        SubLObject length = length(vector_var);
                                                                                                        SubLObject v_iteration = NIL;
                                                                                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                                                            {
                                                                                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                                                                SubLObject item = aref(vector_var, element_num);
                                                                                                                owl_cycl_sentences = cons(item, owl_cycl_sentences);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_6 = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_meta_asent(sentence);
                                                                                                        SubLObject item = NIL;
                                                                                                        for (item = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , item = cdolist_list_var_6.first()) {
                                                                                                            owl_cycl_sentences = cons(item, owl_cycl_sentences);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject var = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_binary_asent(sentence);
                                                                                                    if (NIL != var) {
                                                                                                        owl_cycl_sentences = cons(var, owl_cycl_sentences);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list_alt76)) {
                                                                                                    {
                                                                                                        SubLObject var = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_synonymous_external_concept_asent(sentence);
                                                                                                        if (NIL != var) {
                                                                                                            owl_cycl_sentences = cons(var, owl_cycl_sentences);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str_alt77$unexpected_asent__s, sentence);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (NIL == misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
                                                                            if (NIL != owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.getDynamicValue(thread)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_7 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_8 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                                                                                    try {
                                                                                        owl_uris_and_prefixes.$owl_export_version_date$.bind(NIL, thread);
                                                                                        $owl_use_external_ids_for_namesP$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject full_cyc_link_asent = make_binary_formula(com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_predicate($$owlSameAs), com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(v_term), owl_cycl_to_xml.owl_cyc_uri_for_fort(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                            owl_cycl_sentences = cons(full_cyc_link_asent, owl_cycl_sentences);
                                                                                        }
                                                                                    } finally {
                                                                                        $owl_use_external_ids_for_namesP$.rebind(_prev_bind_1_8, thread);
                                                                                        owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_0_7, thread);
                                                                                    }
                                                                                }
                                                                                if (NIL == $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_9 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                                                                                        try {
                                                                                            $owl_use_external_ids_for_namesP$.bind(T, thread);
                                                                                            {
                                                                                                SubLObject opencyc_external_id_link_asent = make_binary_formula(com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_predicate($$owlSameAs), com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(v_term), owl_cycl_to_xml.owl_opencyc_uri_for_fort(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                owl_cycl_sentences = cons(opencyc_external_id_link_asent, owl_cycl_sentences);
                                                                                            }
                                                                                        } finally {
                                                                                            $owl_use_external_ids_for_namesP$.rebind(_prev_bind_0_9, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (!((NIL != $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) && (NIL == owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread)))) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_10 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_11 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                                                                                        try {
                                                                                            $owl_use_external_ids_for_namesP$.bind(T, thread);
                                                                                            owl_uris_and_prefixes.$owl_export_version_date$.bind(NIL, thread);
                                                                                            {
                                                                                                SubLObject opencyc_external_id_link_asent = make_binary_formula(com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_predicate($$owlSameAs), com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(v_term), owl_cycl_to_xml.owl_opencyc_uri_for_fort(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                owl_cycl_sentences = cons(opencyc_external_id_link_asent, owl_cycl_sentences);
                                                                                            }
                                                                                        } finally {
                                                                                            owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_1_11, thread);
                                                                                            $owl_use_external_ids_for_namesP$.rebind(_prev_bind_0_10, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        arg1 = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(v_term);
                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    Errors.warn($str_alt79$Caught_error_OWL_cyclifying__S___, v_term, error_message);
                }
                return cons(arg1, nreverse(owl_cycl_sentences));
            }
        }
    }

    /**
     * Returns an OWL-CycL term chunk
     */
    @LispMethod(comment = "Returns an OWL-CycL term chunk")
    public static SubLObject owl_cyclify_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject owl_cycl_sentences = NIL;
        SubLObject error_message = NIL;
        SubLObject arg1 = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($owl_export_mt$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject local_state;
                        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                        final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                            try {
                                possibly_initialize_owl_export_state();
                                SubLObject cdolist_list_var = all_gaf_arg1_owlifiable_asents_sorted(v_term);
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if ((NIL == formula_pattern_match.formula_matches_pattern(sentence, listS($$isa, v_term, $list72))) || (NIL == kb_accessors.binary_predicateP(v_term))) {
                                        if (NIL == formula_pattern_match.formula_matches_pattern(sentence, list($$genls, v_term, v_term))) {
                                            if (NIL != atomic_sentenceP(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED))) {
                                                final SubLObject items_var = owl_cyclify_meta_asent(sentence);
                                                if (items_var.isVector()) {
                                                    final SubLObject vector_var = items_var;
                                                    final SubLObject backwardP_var = NIL;
                                                    SubLObject length;
                                                    SubLObject v_iteration;
                                                    SubLObject element_num;
                                                    SubLObject item;
                                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                        item = aref(vector_var, element_num);
                                                        owl_cycl_sentences = cons(item, owl_cycl_sentences);
                                                    }
                                                } else {
                                                    SubLObject cdolist_list_var_$5 = items_var;
                                                    SubLObject item2 = NIL;
                                                    item2 = cdolist_list_var_$5.first();
                                                    while (NIL != cdolist_list_var_$5) {
                                                        owl_cycl_sentences = cons(item2, owl_cycl_sentences);
                                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                                        item2 = cdolist_list_var_$5.first();
                                                    } 
                                                }
                                            } else
                                                if (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) {
                                                    final SubLObject var = owl_cyclify_binary_asent(sentence);
                                                    if (NIL != var) {
                                                        owl_cycl_sentences = cons(var, owl_cycl_sentences);
                                                    }
                                                } else
                                                    if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list74)) {
                                                        final SubLObject var = owl_cyclify_synonymous_external_concept_asent(sentence);
                                                        if (NIL != var) {
                                                            owl_cycl_sentences = cons(var, owl_cycl_sentences);
                                                        }
                                                    } else {
                                                        Errors.error($str75$unexpected_asent__s, sentence);
                                                    }


                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                                if ((NIL == misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) && (NIL != owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.getDynamicValue(thread))) {
                                    final SubLObject _prev_bind_0_$5 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                                    try {
                                        owl_uris_and_prefixes.$owl_export_version_date$.bind(NIL, thread);
                                        $owl_use_external_ids_for_namesP$.bind(T, thread);
                                        final SubLObject full_cyc_link_asent = make_binary_formula(owl_cyclify_predicate($const76$owl_sameAs), owl_cyclify_arg1(v_term), owl_cycl_to_xml.owl_cyc_uri_for_fort(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        owl_cycl_sentences = cons(full_cyc_link_asent, owl_cycl_sentences);
                                    } finally {
                                        $owl_use_external_ids_for_namesP$.rebind(_prev_bind_1_$7, thread);
                                        owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_0_$5, thread);
                                    }
                                    if (NIL == $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                                        final SubLObject _prev_bind_0_$6 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                                        try {
                                            $owl_use_external_ids_for_namesP$.bind(T, thread);
                                            final SubLObject opencyc_external_id_link_asent = make_binary_formula(owl_cyclify_predicate($const76$owl_sameAs), owl_cyclify_arg1(v_term), owl_cycl_to_xml.owl_opencyc_uri_for_fort(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            owl_cycl_sentences = cons(opencyc_external_id_link_asent, owl_cycl_sentences);
                                        } finally {
                                            $owl_use_external_ids_for_namesP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                    if ((NIL == $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) || (NIL != owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                                        final SubLObject _prev_bind_0_$7 = $owl_use_external_ids_for_namesP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$8 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                                        try {
                                            $owl_use_external_ids_for_namesP$.bind(T, thread);
                                            owl_uris_and_prefixes.$owl_export_version_date$.bind(NIL, thread);
                                            final SubLObject opencyc_external_id_link_asent2 = make_binary_formula(owl_cyclify_predicate($const76$owl_sameAs), owl_cyclify_arg1(v_term), owl_cycl_to_xml.owl_opencyc_uri_for_fort(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            owl_cycl_sentences = cons(opencyc_external_id_link_asent2, owl_cycl_sentences);
                                        } finally {
                                            owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_1_$8, thread);
                                            $owl_use_external_ids_for_namesP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                arg1 = owl_cyclify_arg1(v_term);
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
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
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
        if (NIL != error_message) {
            Errors.warn($str77$Caught_error_OWL_cyclifying__S___, v_term, error_message);
        }
        return cons(arg1, nreverse(owl_cycl_sentences));
    }

    public static final SubLObject new_owl_export_term_iterator_alt(SubLObject iterator) {
        {
            SubLObject terms = com.cyc.cycjava.cycl.owl.owlification.filter_and_sort_owl_export_terms(iterator);
            return values(iteration.new_list_iterator(terms), length(terms));
        }
    }

    public static SubLObject new_owl_export_term_iterator(final SubLObject iterator) {
        final SubLObject terms = filter_and_sort_owl_export_terms(iterator);
        return values(iteration.new_list_iterator(terms), length(terms));
    }

    public static final SubLObject filter_and_sort_owl_export_terms_alt(SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test = symbol_function(EQUAL);
                SubLObject collections = set.new_set(test, UNPROVIDED);
                SubLObject binary_predicates = set.new_set(test, UNPROVIDED);
                SubLObject misc = set.new_set(test, UNPROVIDED);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            if (NIL != com.cyc.cycjava.cycl.owl.owlification.owlifiable_sentenceP(v_term)) {
                                set.set_add(v_term, misc);
                            } else {
                                if (NIL == forts.fort_p(v_term)) {
                                    Errors.warn($str_alt80$_S_is_not_a_FORT_, v_term);
                                } else {
                                    if (NIL != cycl_utilities.expression_find_if(META_VARIABLE_P, v_term, T, UNPROVIDED)) {
                                        com.cyc.cycjava.cycl.owl.owlification.nonexportable_term_warning(v_term);
                                    } else {
                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject okP = com.cyc.cycjava.cycl.owl.owlification.valid_collection_fort_for_owl_exportP(v_term);
                                                SubLObject binary_preds = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != okP) {
                                                    com.cyc.cycjava.cycl.owl.owlification.add_fort_to_owl_export_set(v_term, collections);
                                                    {
                                                        SubLObject cdolist_list_var = binary_preds;
                                                        SubLObject pred = NIL;
                                                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                            com.cyc.cycjava.cycl.owl.owlification.add_fort_to_owl_export_set(pred, binary_predicates);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != kb_accessors.binary_predicateP(v_term)) {
                                                com.cyc.cycjava.cycl.owl.owlification.add_fort_to_owl_export_set(v_term, binary_predicates);
                                            } else {
                                                if (NIL != fort_types_interface.relation_p(v_term)) {
                                                    com.cyc.cycjava.cycl.owl.owlification.add_fort_to_owl_export_set(v_term, misc);
                                                } else {
                                                    if (NIL != isa.isa_in_any_mtP(v_term, $$OWLOntology)) {
                                                        Errors.warn($str_alt83$Can_t_export_OWL_Ontology_as_part, v_term);
                                                    } else {
                                                        com.cyc.cycjava.cycl.owl.owlification.add_fort_to_owl_export_set(v_term, misc);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                {
                    SubLObject fort_count = add(set.set_size(collections), set.set_size(binary_predicates), set.set_size(misc));
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble(cconcatenate($str_alt84$Sorting_, new SubLObject[]{ format_nil.format_nil_d_no_copy(fort_count), $str_alt85$_terms_for_OWL_export___ }));
                            collections = com.cyc.cycjava.cycl.owl.owlification.owl_sort_forts(collections);
                            note_percent_progress(ONE_INTEGER, FOUR_INTEGER);
                            binary_predicates = com.cyc.cycjava.cycl.owl.owlification.owl_sort_forts(binary_predicates);
                            note_percent_progress(TWO_INTEGER, FOUR_INTEGER);
                            misc = com.cyc.cycjava.cycl.owl.owlification.owl_sort_forts(misc);
                            note_percent_progress(THREE_INTEGER, FOUR_INTEGER);
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != subl_promotions.positive_integer_p($owl_export_cap_per_category$.getDynamicValue(thread))) {
                    collections = list_utilities.first_n($owl_export_cap_per_category$.getDynamicValue(thread), collections);
                    binary_predicates = list_utilities.first_n($owl_export_cap_per_category$.getDynamicValue(thread), binary_predicates);
                    misc = list_utilities.first_n($owl_export_cap_per_category$.getDynamicValue(thread), misc);
                }
                if (NIL != $owl_profilingP$.getDynamicValue(thread)) {
                    collections = list_utilities.every_nth($int$1000, collections);
                    binary_predicates = list_utilities.every_nth($int$1000, binary_predicates);
                    misc = list_utilities.every_nth($int$1000, misc);
                }
                return nconc(collections, binary_predicates, misc);
            }
        }
    }

    public static SubLObject filter_and_sort_owl_export_terms(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = symbol_function(EQUAL);
        SubLObject collections = set.new_set(test, UNPROVIDED);
        SubLObject binary_predicates = set.new_set(test, UNPROVIDED);
        SubLObject misc = set.new_set(test, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject v_term = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                if (NIL != owlifiable_sentenceP(v_term)) {
                    set.set_add(v_term, misc);
                } else
                    if (NIL == forts.fort_p(v_term)) {
                        Errors.warn($str78$_S_is_not_a_FORT_, v_term);
                    } else
                        if (NIL != cycl_utilities.expression_find_if(META_VARIABLE_P, v_term, T, UNPROVIDED)) {
                            nonexportable_term_warning(v_term);
                        } else
                            if (NIL != fort_types_interface.collection_p(v_term)) {
                                thread.resetMultipleValues();
                                final SubLObject okP = valid_collection_fort_for_owl_exportP(v_term);
                                final SubLObject binary_preds = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != okP) {
                                    add_fort_to_owl_export_set(v_term, collections);
                                    SubLObject cdolist_list_var = binary_preds;
                                    SubLObject pred = NIL;
                                    pred = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        add_fort_to_owl_export_set(pred, binary_predicates);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        pred = cdolist_list_var.first();
                                    } 
                                }
                            } else
                                if (NIL != kb_accessors.binary_predicateP(v_term)) {
                                    add_fort_to_owl_export_set(v_term, binary_predicates);
                                } else
                                    if (NIL != fort_types_interface.relation_p(v_term)) {
                                        add_fort_to_owl_export_set(v_term, misc);
                                    } else
                                        if (NIL != isa.isa_in_any_mtP(v_term, $const80$owl_Ontology)) {
                                            Errors.warn($str81$Can_t_export_OWL_Ontology_as_part, v_term);
                                        } else {
                                            add_fort_to_owl_export_set(v_term, misc);
                                        }






            }
        }
        final SubLObject fort_count = add(set.set_size(collections), set.set_size(binary_predicates), set.set_size(misc));
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
                noting_percent_progress_preamble(cconcatenate($$$Sorting_, new SubLObject[]{ format_nil.format_nil_d_no_copy(fort_count), $str83$_terms_for_OWL_export___ }));
                collections = owl_sort_forts(collections);
                note_percent_progress(ONE_INTEGER, FOUR_INTEGER);
                binary_predicates = owl_sort_forts(binary_predicates);
                note_percent_progress(TWO_INTEGER, FOUR_INTEGER);
                misc = owl_sort_forts(misc);
                note_percent_progress(THREE_INTEGER, FOUR_INTEGER);
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (NIL != subl_promotions.positive_integer_p($owl_export_cap_per_category$.getDynamicValue(thread))) {
            collections = list_utilities.first_n($owl_export_cap_per_category$.getDynamicValue(thread), collections);
            binary_predicates = list_utilities.first_n($owl_export_cap_per_category$.getDynamicValue(thread), binary_predicates);
            misc = list_utilities.first_n($owl_export_cap_per_category$.getDynamicValue(thread), misc);
        }
        if (NIL != $owl_profilingP$.getDynamicValue(thread)) {
            collections = list_utilities.every_nth($int$1000, collections);
            binary_predicates = list_utilities.every_nth($int$1000, binary_predicates);
            misc = list_utilities.every_nth($int$1000, misc);
        }
        return nconc(collections, binary_predicates, misc);
    }

    public static final SubLObject add_fort_to_owl_export_set_alt(SubLObject fort, SubLObject v_set) {
        {
            SubLObject fort_to_add = (NIL != nart_handles.nart_p(fort)) ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.owl_export_nart_export_form(fort))) : fort;
            if (NIL != forts.fort_p(fort_to_add)) {
                set.set_add(fort_to_add, v_set);
            } else {
                Errors.warn($str_alt87$Couldn_t_resolve__S_to_a_canonica, fort);
            }
        }
        return v_set;
    }

    public static SubLObject add_fort_to_owl_export_set(final SubLObject fort, final SubLObject v_set) {
        final SubLObject fort_to_add = (NIL != nart_handles.nart_p(fort)) ? owl_export_nart_export_form(fort) : fort;
        if (NIL != forts.fort_p(fort_to_add)) {
            set.set_add(fort_to_add, v_set);
        } else {
            Errors.warn($str85$Couldn_t_resolve__S_to_a_canonica, fort);
        }
        return v_set;
    }

    public static final SubLObject owl_export_nart_export_form_alt(SubLObject nart) {
        return NIL != com.cyc.cycjava.cycl.owl.owlification.nart_invalid_for_owl_exportP(nart) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.owl.owlification.owl_export_canonicalize_nart(nart);
    }

    public static SubLObject owl_export_nart_export_form(final SubLObject nart) {
        return NIL != nart_invalid_for_owl_exportP(nart) ? NIL : owl_export_canonicalize_nart(nart);
    }

    public static final SubLObject owl_export_canonicalize_nart_internal_alt(SubLObject nart) {
        return narts_high.nart_substitute(narts_high.nart_el_formula(nart));
    }

    public static SubLObject owl_export_canonicalize_nart_internal(final SubLObject nart) {
        return narts_high.nart_substitute(narts_high.nart_el_formula(nart));
    }

    public static final SubLObject owl_export_canonicalize_nart_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_export_canonicalize_nart_internal(nart);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_EXPORT_CANONICALIZE_NART, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_EXPORT_CANONICALIZE_NART, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_EXPORT_CANONICALIZE_NART, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_export_canonicalize_nart_internal(nart)));
                        memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject owl_export_canonicalize_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_export_canonicalize_nart_internal(nart);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_EXPORT_CANONICALIZE_NART, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_EXPORT_CANONICALIZE_NART, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_EXPORT_CANONICALIZE_NART, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_export_canonicalize_nart_internal(nart)));
            memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject nart_invalid_for_owl_exportP_alt(SubLObject nart) {
        SubLTrampolineFile.checkType(nart, NART_P);
        return makeBoolean((NIL == nart_handles.nart_p(com.cyc.cycjava.cycl.owl.owlification.owl_export_canonicalize_nart(nart))) || (NIL != list_utilities.lengthG(com.cyc.cycjava.cycl.owl.owlification.owl_term_string(nart, T), $int$225, UNPROVIDED)));
    }

    public static SubLObject nart_invalid_for_owl_exportP(final SubLObject nart) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        return makeBoolean(((NIL == nart_handles.nart_p(owl_export_canonicalize_nart(nart))) || (NIL != list_utilities.lengthG(owl_external_id_string(nart), $int$225, UNPROVIDED))) || (NIL != list_utilities.lengthG(owl_fort_human_readable_name(nart, UNPROVIDED), $int$225, UNPROVIDED)));
    }

    public static final SubLObject delete_subsumed_owl_asents_alt(SubLObject asents) {
        return list_utilities.delete_subsumed_items(asents, $sym91$SUBSUMED_OWL_ASENT_, UNPROVIDED);
    }

    public static SubLObject delete_subsumed_owl_asents(final SubLObject asents) {
        return list_utilities.delete_subsumed_items(asents, $sym89$SUBSUMED_OWL_ASENT_, UNPROVIDED);
    }

    public static final SubLObject subsumed_owl_asentP_alt(SubLObject little, SubLObject big) {
        if (!cycl_utilities.atomic_sentence_predicate(little).equal(cycl_utilities.atomic_sentence_predicate(big))) {
            return NIL;
        } else {
            if (!cycl_utilities.atomic_sentence_arg1(little, UNPROVIDED).equal(cycl_utilities.atomic_sentence_arg1(big, UNPROVIDED))) {
                return NIL;
            } else {
                if ((NIL != subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(little), $owl_transitive_via_genls_arg2_preds_to_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != genls.genlP(cycl_utilities.atomic_sentence_arg2(little, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(big, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject subsumed_owl_asentP(final SubLObject little, final SubLObject big) {
        if (!cycl_utilities.atomic_sentence_predicate(little).equal(cycl_utilities.atomic_sentence_predicate(big))) {
            return NIL;
        }
        if (!cycl_utilities.atomic_sentence_arg1(little, UNPROVIDED).equal(cycl_utilities.atomic_sentence_arg1(big, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(little), $owl_transitive_via_genls_arg2_preds_to_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != genls.genlP(cycl_utilities.atomic_sentence_arg2(little, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(big, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject valid_collection_fort_for_owl_exportP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject okP = com.cyc.cycjava.cycl.owl.owlification.valid_collection_fort_for_owl_exportP_internal(fort);
                SubLObject binary_predicates = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == okP) {
                    com.cyc.cycjava.cycl.owl.owlification.nonexportable_term_warning(fort);
                }
                return values(okP, binary_predicates);
            }
        }
    }

    public static SubLObject valid_collection_fort_for_owl_exportP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject okP = valid_collection_fort_for_owl_exportP_internal(fort);
        final SubLObject binary_predicates = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == okP) {
            nonexportable_term_warning(fort);
        }
        return values(okP, binary_predicates);
    }

    public static final SubLObject nonexportable_term_warning_internal_alt(SubLObject fort) {
        Errors.warn($str_alt94$Can_t_export__S, fort);
        return NIL;
    }

    public static SubLObject nonexportable_term_warning_internal(final SubLObject fort) {
        Errors.warn($str92$Can_t_export__S, fort);
        return NIL;
    }

    public static final SubLObject nonexportable_term_warning_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.nonexportable_term_warning_internal(fort);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NONEXPORTABLE_TERM_WARNING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NONEXPORTABLE_TERM_WARNING, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, NONEXPORTABLE_TERM_WARNING, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.nonexportable_term_warning_internal(fort)));
                        memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject nonexportable_term_warning(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nonexportable_term_warning_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NONEXPORTABLE_TERM_WARNING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NONEXPORTABLE_TERM_WARNING, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NONEXPORTABLE_TERM_WARNING, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nonexportable_term_warning_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject valid_collection_fort_for_owl_exportP_internal_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = forts.fort_p(fort);
                SubLObject binary_preds = NIL;
                if (NIL == fort_types_interface.collection_p(fort)) {
                    Errors.warn($str_alt95$Not_a_collection___S, fort);
                    okP = NIL;
                } else {
                    if ((NIL != nart_handles.nart_p(fort)) && (NIL != com.cyc.cycjava.cycl.owl.owlification.nart_invalid_for_owl_exportP(fort))) {
                        okP = NIL;
                    } else {
                        if (((NIL != nart_handles.nart_p(fort)) && THREE_INTEGER.eql(cycl_utilities.nat_arity(fort, UNPROVIDED))) && (NIL != isa.isaP(cycl_utilities.nat_functor(fort), $$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject okP_12 = com.cyc.cycjava.cycl.owl.owlification.valid_collection_fort_for_owl_exportP_internal(cycl_utilities.nat_arg1(fort, UNPROVIDED));
                                SubLObject binary_preds_13 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                okP = okP_12;
                                binary_preds = binary_preds_13;
                            }
                            if (NIL == okP) {
                            } else {
                                if (NIL != list_utilities.find_if_not(FORT_P, cycl_utilities.formula_args(fort, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    okP = NIL;
                                } else {
                                    if (NIL == kb_accessors.binary_predicateP(cycl_utilities.nat_arg2(fort, UNPROVIDED))) {
                                        Errors.warn($str_alt98$Restriction_property_is_not_a_bin, cycl_utilities.nat_arg2(fort, UNPROVIDED));
                                        okP = NIL;
                                    } else {
                                        if (NIL != member(cycl_utilities.nat_functor(fort), $list_alt99, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject arg2 = cycl_utilities.nat_arg2(fort, UNPROVIDED);
                                                SubLObject inverse = com.cyc.cycjava.cycl.owl.owlification.find_or_create_inverse_binary_predicate(arg2);
                                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                    if (NIL == forts.fort_p(inverse)) {
                                                        Errors.error($str_alt100$Couldn_t_find_or_create_inverse_o, arg2);
                                                    }
                                                }
                                                {
                                                    SubLObject item_var = inverse;
                                                    if (NIL == member(item_var, binary_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        binary_preds = cons(item_var, binary_preds);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != member(cycl_utilities.nat_functor(fort), $list_alt101, UNPROVIDED, UNPROVIDED)) {
                                                {
                                                    SubLObject arg2 = cycl_utilities.nat_arg2(fort, UNPROVIDED);
                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                        if (NIL == forts.fort_p(arg2)) {
                                                            Errors.error($str_alt102$restriction_property_is_not_a_FOR, arg2);
                                                        }
                                                    }
                                                    {
                                                        SubLObject item_var = arg2;
                                                        if (NIL == member(item_var, binary_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            binary_preds = cons(item_var, binary_preds);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(okP, NIL != okP ? ((SubLObject) (binary_preds)) : NIL);
            }
        }
    }

    public static SubLObject valid_collection_fort_for_owl_exportP_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = forts.fort_p(fort);
        SubLObject binary_preds = NIL;
        if (NIL == fort_types_interface.collection_p(fort)) {
            Errors.warn($str93$Not_a_collection___S, fort);
            okP = NIL;
        } else
            if ((NIL != nart_handles.nart_p(fort)) && (NIL != nart_invalid_for_owl_exportP(fort))) {
                okP = NIL;
            } else
                if (((NIL != nart_handles.nart_p(fort)) && THREE_INTEGER.eql(cycl_utilities.nat_arity(fort, UNPROVIDED))) && (NIL != isa.isaP(cycl_utilities.nat_functor(fort), $$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED))) {
                    thread.resetMultipleValues();
                    final SubLObject okP_$13 = valid_collection_fort_for_owl_exportP_internal(cycl_utilities.nat_arg1(fort, UNPROVIDED));
                    final SubLObject binary_preds_$14 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    okP = okP_$13;
                    binary_preds = binary_preds_$14;
                    if (NIL != okP) {
                        if (NIL != list_utilities.find_if_not(FORT_P, cycl_utilities.formula_args(fort, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            okP = NIL;
                        } else
                            if (NIL == kb_accessors.binary_predicateP(cycl_utilities.nat_arg2(fort, UNPROVIDED))) {
                                Errors.warn($str96$Restriction_property_is_not_a_bin, cycl_utilities.nat_arg2(fort, UNPROVIDED));
                                okP = NIL;
                            } else
                                if (NIL != member(cycl_utilities.nat_functor(fort), $list97, UNPROVIDED, UNPROVIDED)) {
                                    final SubLObject arg2 = cycl_utilities.nat_arg2(fort, UNPROVIDED);
                                    final SubLObject inverse = find_or_create_inverse_binary_predicate(arg2);
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(inverse))) {
                                        Errors.error($str98$Couldn_t_find_or_create_inverse_o, arg2);
                                    }
                                    final SubLObject item_var = inverse;
                                    if (NIL == member(item_var, binary_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        binary_preds = cons(item_var, binary_preds);
                                    }
                                } else
                                    if (NIL != member(cycl_utilities.nat_functor(fort), $list99, UNPROVIDED, UNPROVIDED)) {
                                        final SubLObject arg2 = cycl_utilities.nat_arg2(fort, UNPROVIDED);
                                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(arg2))) {
                                            Errors.error($str100$restriction_property_is_not_a_FOR, arg2);
                                        }
                                        final SubLObject item_var2 = arg2;
                                        if (NIL == member(item_var2, binary_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            binary_preds = cons(item_var2, binary_preds);
                                        }
                                    }



                    }
                }


        return values(okP, NIL != okP ? binary_preds : NIL);
    }

    public static final SubLObject owl_sort_forts_alt(SubLObject v_forts) {
        return Sort.sort(set.set_element_list(v_forts), $sym103$OWL_FORT__, UNPROVIDED);
    }

    public static SubLObject owl_sort_forts(final SubLObject v_forts) {
        return Sort.sort(set.set_element_list(v_forts), $sym101$OWL_FORT__, UNPROVIDED);
    }

    public static final SubLObject owl_fort_L_alt(SubLObject fort1, SubLObject fort2) {
        if (NIL != constant_p(fort1)) {
            if (NIL != constant_p(fort2)) {
                return Strings.stringL(com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(fort1), com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(fort2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                return NIL;
            }
        } else {
            if (NIL != constant_p(fort2)) {
                return T;
            } else {
                {
                    SubLObject functor1 = cycl_utilities.nat_functor(fort1);
                    SubLObject functor2 = cycl_utilities.nat_functor(fort2);
                    if (NIL != com.cyc.cycjava.cycl.owl.owlification.owl_fort_L(functor1, functor2)) {
                        return T;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.owl.owlification.owl_fort_L(functor2, functor1)) {
                            return NIL;
                        } else {
                            return Strings.stringL(com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(fort1), com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(fort2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject owl_fort_L(final SubLObject fort1, final SubLObject fort2) {
        if (NIL != constant_p(fort1)) {
            if (NIL != constant_p(fort2)) {
                return Strings.stringL(owl_sort_name(fort1), owl_sort_name(fort2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        } else {
            if (NIL != constant_p(fort2)) {
                return T;
            }
            final SubLObject functor1 = cycl_utilities.nat_functor(fort1);
            final SubLObject functor2 = cycl_utilities.nat_functor(fort2);
            if (NIL != owl_fort_L(functor1, functor2)) {
                return T;
            }
            if (NIL != owl_fort_L(functor2, functor1)) {
                return NIL;
            }
            return Strings.stringL(owl_sort_name(fort1), owl_sort_name(fort2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject all_gaf_arg1_owlifiable_asents_sorted_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
                return com.cyc.cycjava.cycl.owl.owlification.sort_owl_asents(com.cyc.cycjava.cycl.owl.owlification.owl_remove_type_isa(dictionary.dictionary_lookup_without_values($owl_asents_to_export$.getDynamicValue(thread), fort, UNPROVIDED)));
            }
            {
                SubLObject gafs = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, NIL, NIL, $TRUE);
                SubLObject asents = Mapping.mapcar(GAF_FORMULA, gafs);
                asents = nconc(asents, com.cyc.cycjava.cycl.owl.owlification.synonymous_external_concept_asents(fort));
                asents = delete_if($sym106$OWL_BLACKLIST_SENTENCE_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                asents = com.cyc.cycjava.cycl.owl.owlification.owl_adjust_isa_and_genls_asents(fort, asents);
                asents = com.cyc.cycjava.cycl.owl.owlification.owl_remove_type_isa(asents);
                asents = com.cyc.cycjava.cycl.owl.owlification.owl_remove_uvmt_anect_isa(asents);
                asents = list_utilities.delete_if_not($sym107$OWLIFIABLE_SENTENCE_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject extras = com.cyc.cycjava.cycl.owl.owlification.owl_extra_arg1_asents_for_term(fort);
                    SubLObject items_var = extras;
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var = extras;
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject item = aref(vector_var, element_num);
                                    asents = cons(item, asents);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = extras;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                asents = cons(item, asents);
                            }
                        }
                    }
                }
                asents = list_utilities.fast_delete_duplicates(asents, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                asents = com.cyc.cycjava.cycl.owl.owlification.owl_remove_singleton_predicates(asents);
                return com.cyc.cycjava.cycl.owl.owlification.sort_owl_asents(asents);
            }
        }
    }

    public static SubLObject all_gaf_arg1_owlifiable_asents_sorted(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
            return sort_owl_asents(owl_remove_type_isa(dictionary.dictionary_lookup_without_values($owl_asents_to_export$.getDynamicValue(thread), fort, UNPROVIDED)));
        }
        final SubLObject gafs = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, NIL, NIL, $TRUE);
        SubLObject asents = Mapping.mapcar(GAF_FORMULA, gafs);
        asents = nconc(asents, synonymous_external_concept_asents(fort));
        asents = delete_if($sym104$OWL_BLACKLIST_SENTENCE_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        asents = owl_adjust_isa_and_genls_asents(fort, asents);
        asents = owl_remove_type_isa(asents);
        asents = owl_remove_uvmt_anect_isa(asents);
        asents = list_utilities.delete_if_not($sym105$OWLIFIABLE_SENTENCE_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject items_var;
        final SubLObject extras = items_var = owl_extra_arg1_asents_for_term(fort);
        if (items_var.isVector()) {
            final SubLObject vector_var = items_var;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                item = aref(vector_var, element_num);
                asents = cons(item, asents);
            }
        } else {
            SubLObject cdolist_list_var = items_var;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                asents = cons(item2, asents);
                cdolist_list_var = cdolist_list_var.rest();
                item2 = cdolist_list_var.first();
            } 
        }
        asents = list_utilities.fast_delete_duplicates(asents, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        asents = owl_remove_singleton_predicates(asents);
        return sort_owl_asents(asents);
    }

    public static final SubLObject owl_whitelist_predicateP_alt(SubLObject obj) {
        return makeBoolean((NIL != subl_promotions.memberP(obj, $owl_cycl_predicates_to_use_as_is$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.alist_lookup(com.cyc.cycjava.cycl.owl.owlification.owl_cycl_predicate_table(UNPROVIDED), obj, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject owl_whitelist_predicateP(final SubLObject obj) {
        return makeBoolean((NIL != subl_promotions.memberP(obj, $owl_cycl_predicates_to_use_as_is$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.alist_lookup(owl_cycl_predicate_table(UNPROVIDED), obj, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject owl_blacklist_sentenceP_alt(SubLObject asent) {
        {
            SubLObject badP = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = $owl_blacklist_sentence_patterns$.getGlobalValue();
                    SubLObject pattern = NIL;
                    for (pattern = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pattern = csome_list_var.first()) {
                        if (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern)) {
                            badP = T;
                        }
                    }
                }
            }
            return badP;
        }
    }

    public static SubLObject owl_blacklist_sentenceP(final SubLObject asent) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = $owl_blacklist_sentence_patterns$.getGlobalValue();
            SubLObject pattern = NIL;
            pattern = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern)) {
                    badP = T;
                }
                csome_list_var = csome_list_var.rest();
                pattern = csome_list_var.first();
            } 
        }
        return badP;
    }

    public static final SubLObject owl_blacklist_predicateP_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(obj, $assertion_arg0s_excluded_from_owl_export$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject owl_blacklist_predicateP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(obj, $assertion_arg0s_excluded_from_owl_export$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Include a minimal set of non-subsumed isas and genls (for collections).
     */
    @LispMethod(comment = "Include a minimal set of non-subsumed isas and genls (for collections).")
    public static final SubLObject owl_adjust_isa_and_genls_asents_alt(SubLObject fort, SubLObject asents) {
        asents = delete_if($sym109$OWL_ISA_LIT_, delete_if($sym110$OWL_GENLS_LIT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        {
            SubLObject items_var = com.cyc.cycjava.cycl.owl.owlification.isa_asents_for_fort(fort);
            if (items_var.isVector()) {
                {
                    SubLObject vector_var = com.cyc.cycjava.cycl.owl.owlification.isa_asents_for_fort(fort);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject item = aref(vector_var, element_num);
                            asents = cons(item, asents);
                        }
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.owl.owlification.isa_asents_for_fort(fort);
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        asents = cons(item, asents);
                    }
                }
            }
        }
        if (NIL != fort_types_interface.collection_p(fort)) {
            {
                SubLObject items_var = com.cyc.cycjava.cycl.owl.owlification.genls_asents_for_fort(fort);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = com.cyc.cycjava.cycl.owl.owlification.genls_asents_for_fort(fort);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                asents = cons(item, asents);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.owl.owlification.genls_asents_for_fort(fort);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            asents = cons(item, asents);
                        }
                    }
                }
            }
        }
        return asents;
    }

    /**
     * Include a minimal set of non-subsumed isas and genls (for collections).
     */
    @LispMethod(comment = "Include a minimal set of non-subsumed isas and genls (for collections).")
    public static SubLObject owl_adjust_isa_and_genls_asents(final SubLObject fort, SubLObject asents) {
        asents = delete_if($sym107$OWL_ISA_LIT_, delete_if($sym108$OWL_GENLS_LIT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject items_var = isa_asents_for_fort(fort);
        if (items_var.isVector()) {
            final SubLObject vector_var = items_var;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                item = aref(vector_var, element_num);
                asents = cons(item, asents);
            }
        } else {
            SubLObject cdolist_list_var = items_var;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                asents = cons(item2, asents);
                cdolist_list_var = cdolist_list_var.rest();
                item2 = cdolist_list_var.first();
            } 
        }
        if (NIL != fort_types_interface.collection_p(fort)) {
            items_var = genls_asents_for_fort(fort);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    asents = cons(item, asents);
                }
            } else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    asents = cons(item2, asents);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
        }
        return asents;
    }

    public static final SubLObject isa_asents_for_fort_alt(SubLObject fort) {
        {
            SubLObject all_isa = isa.all_isa(fort, UNPROVIDED, UNPROVIDED);
            SubLObject valid_isa = list_utilities.delete_if_not($sym111$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_, all_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject min_valid_isa = genls.min_cols(valid_isa, UNPROVIDED, UNPROVIDED);
            SubLObject asents = NIL;
            SubLObject cdolist_list_var = min_valid_isa;
            SubLObject v_isa = NIL;
            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                asents = cons(make_binary_formula($$isa, fort, v_isa), asents);
            }
            return asents;
        }
    }

    public static SubLObject isa_asents_for_fort(final SubLObject fort) {
        final SubLObject all_isa = isa.all_isa(fort, UNPROVIDED, UNPROVIDED);
        final SubLObject valid_isa = list_utilities.delete_if_not($sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_, all_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject min_valid_isa = genls.min_cols(valid_isa, UNPROVIDED, UNPROVIDED);
        SubLObject asents = NIL;
        SubLObject cdolist_list_var = min_valid_isa;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            asents = cons(make_binary_formula($$isa, fort, v_isa), asents);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return asents;
    }

    /**
     *
     *
     * @unknown -- We no longer do MIN-COLS here, since that results in cycles like Person-Human missing
    their upward closure.
     */
    @LispMethod(comment = "@unknown -- We no longer do MIN-COLS here, since that results in cycles like Person-Human missing\r\ntheir upward closure.")
    public static final SubLObject genls_asents_for_fort_alt(SubLObject fort) {
        {
            SubLObject all_genls = genls.genls(fort, UNPROVIDED, UNPROVIDED);
            SubLObject valid_genls = delete(fort, list_utilities.delete_if_not($sym111$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_, all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject asents = NIL;
            if (NIL != list_utilities.empty_list_p(valid_genls)) {
                valid_genls = cons($$Thing, valid_genls);
            }
            {
                SubLObject cdolist_list_var = valid_genls;
                SubLObject genl = NIL;
                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                    asents = cons(make_binary_formula($$genls, fort, genl), asents);
                }
            }
            return asents;
        }
    }

    /**
     *
     *
     * @unknown -- We no longer do MIN-COLS here, since that results in cycles like Person-Human missing
    their upward closure.
     */
    @LispMethod(comment = "@unknown -- We no longer do MIN-COLS here, since that results in cycles like Person-Human missing\r\ntheir upward closure.")
    public static SubLObject genls_asents_for_fort(final SubLObject fort) {
        final SubLObject all_genls = genls.genls(fort, UNPROVIDED, UNPROVIDED);
        SubLObject valid_genls = delete(fort, list_utilities.delete_if_not($sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_, all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject asents = NIL;
        if (NIL != list_utilities.empty_list_p(valid_genls)) {
            valid_genls = cons($$Thing, valid_genls);
        }
        SubLObject cdolist_list_var = valid_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            asents = cons(make_binary_formula($$genls, fort, genl), asents);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return asents;
    }

    public static final SubLObject index_owl_asents_by_arg1_alt(SubLObject asents) {
        {
            SubLObject index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = asents;
            SubLObject asent = NIL;
            for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_pushnew(index, cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), asent, symbol_function(EQUAL), UNPROVIDED);
            }
            return index;
        }
    }

    public static SubLObject index_owl_asents_by_arg1(final SubLObject asents) {
        final SubLObject index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = asents;
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_pushnew(index, cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), asent, symbol_function(EQUAL), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        return index;
    }

    public static final SubLObject synonymous_external_concept_asents_alt(SubLObject fort) {
        {
            SubLObject asents = NIL;
            {
                SubLObject pred_var = $const113$synonymousExternalConceptWRTPredi;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            {
                                                SubLObject done_var_14 = NIL;
                                                SubLObject token_var_15 = NIL;
                                                while (NIL == done_var_14) {
                                                    {
                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                        SubLObject valid_16 = makeBoolean(token_var_15 != gaf);
                                                        if (NIL != valid_16) {
                                                            if (assertions_high.gaf_arg3(gaf).eql($$rdf_type)) {
                                                                asents = cons(list($$synonymousExternalConcept, fort, assertions_high.gaf_arg2(gaf), assertions_high.gaf_arg4(gaf)), asents);
                                                            }
                                                        }
                                                        done_var_14 = makeBoolean(NIL == valid_16);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                }
            }
            {
                SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.owl.owlification.gather_synonyms_via_synonymous_external_concept(fort, UNPROVIDED));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                            {
                                SubLObject pred_var = $$synonymousExternalConcept;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_17 = NIL;
                                                                SubLObject token_var_18 = NIL;
                                                                while (NIL == done_var_17) {
                                                                    {
                                                                        SubLObject gaf3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                                        SubLObject valid_19 = makeBoolean(token_var_18 != gaf3);
                                                                        if (NIL != valid_19) {
                                                                            {
                                                                                SubLObject item_var = replace_formula_arg(ONE_INTEGER, fort, gaf3);
                                                                                if (NIL == member(item_var, asents, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                    asents = cons(item_var, asents);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_17 = makeBoolean(NIL == valid_19);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                try {
                                                                    bind($is_thread_performing_cleanupP$, T);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return asents;
        }
    }

    public static SubLObject synonymous_external_concept_asents(final SubLObject fort) {
        SubLObject asents = NIL;
        final SubLObject pred_var = $const111$synonymousExternalConceptWRTPredi;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$15 = NIL;
                        final SubLObject token_var_$16 = NIL;
                        while (NIL == done_var_$15) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                            final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(gaf));
                            if ((NIL != valid_$17) && assertions_high.gaf_arg3(gaf).eql($$rdf_type)) {
                                asents = cons(list($$synonymousExternalConcept, fort, assertions_high.gaf_arg2(gaf), assertions_high.gaf_arg4(gaf)), asents);
                            }
                            done_var_$15 = makeBoolean(NIL == valid_$17);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        final SubLObject set_var = gather_synonyms_via_synonymous_external_concept(fort, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        SubLObject pred_var2;
        SubLObject iterator_var2;
        SubLObject done_var2;
        SubLObject token_var2;
        SubLObject final_index_spec2;
        SubLObject valid2;
        SubLObject final_index_iterator2;
        SubLObject done_var_$16;
        SubLObject token_var_$17;
        SubLObject gaf2;
        SubLObject valid_$18;
        SubLObject item_var;
        SubLObject _prev_bind_2;
        SubLObject _values2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                pred_var2 = $$synonymousExternalConcept;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var2)) {
                    iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var2);
                    done_var2 = NIL;
                    token_var2 = NIL;
                    while (NIL == done_var2) {
                        final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                done_var_$16 = NIL;
                                token_var_$17 = NIL;
                                while (NIL == done_var_$16) {
                                    gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$17);
                                    valid_$18 = makeBoolean(!token_var_$17.eql(gaf2));
                                    if (NIL != valid_$18) {
                                        item_var = replace_formula_arg(ONE_INTEGER, fort, gaf2);
                                        if (NIL == member(item_var, asents, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            asents = cons(item_var, asents);
                                        }
                                    }
                                    done_var_$16 = makeBoolean(NIL == valid_$18);
                                } 
                            } finally {
                                _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                }
            }
        }
        return asents;
    }

    /**
     * Collect Cyc terms that have the same ID in the same external ontology.
     */
    @LispMethod(comment = "Collect Cyc terms that have the same ID in the same external ontology.")
    public static final SubLObject gather_synonyms_via_synonymous_external_concept_alt(SubLObject indexed_term, SubLObject known_synonyms) {
        if (known_synonyms == UNPROVIDED) {
            known_synonyms = set_utilities.new_singleton_set(indexed_term, symbol_function(EQL));
        }
        {
            SubLObject pred_var = $$synonymousExternalConcept;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(indexed_term, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(indexed_term, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        {
                                            SubLObject done_var_20 = NIL;
                                            SubLObject token_var_21 = NIL;
                                            while (NIL == done_var_20) {
                                                {
                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_21);
                                                    SubLObject valid_22 = makeBoolean(token_var_21 != gaf);
                                                    if (NIL != valid_22) {
                                                        {
                                                            SubLObject ontology = assertions_high.gaf_arg2(gaf);
                                                            SubLObject local_name = assertions_high.gaf_arg3(gaf);
                                                            SubLObject pred_var_23 = $$synonymousExternalConcept;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(local_name, THREE_INTEGER, pred_var_23)) {
                                                                {
                                                                    SubLObject iterator_var_24 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(local_name, THREE_INTEGER, pred_var_23);
                                                                    SubLObject done_var_25 = NIL;
                                                                    SubLObject token_var_26 = NIL;
                                                                    while (NIL == done_var_25) {
                                                                        {
                                                                            SubLObject final_index_spec_27 = iteration.iteration_next_without_values_macro_helper(iterator_var_24, token_var_26);
                                                                            SubLObject valid_28 = makeBoolean(token_var_26 != final_index_spec_27);
                                                                            if (NIL != valid_28) {
                                                                                {
                                                                                    SubLObject final_index_iterator_29 = NIL;
                                                                                    try {
                                                                                        final_index_iterator_29 = kb_mapping_macros.new_final_index_iterator(final_index_spec_27, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_30 = NIL;
                                                                                            SubLObject token_var_31 = NIL;
                                                                                            while (NIL == done_var_30) {
                                                                                                {
                                                                                                    SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator_29, token_var_31);
                                                                                                    SubLObject valid_32 = makeBoolean(token_var_31 != gaf2);
                                                                                                    if (NIL != valid_32) {
                                                                                                        if ((assertions_high.gaf_arg2(gaf2).eql(ontology) && (NIL != indexed_term_p(assertions_high.gaf_arg1(gaf2)))) && (NIL == set.set_memberP(assertions_high.gaf_arg1(gaf2), known_synonyms))) {
                                                                                                            {
                                                                                                                SubLObject synonym = assertions_high.gaf_arg1(gaf2);
                                                                                                                set.set_add(synonym, known_synonyms);
                                                                                                                com.cyc.cycjava.cycl.owl.owlification.gather_synonyms_via_synonymous_external_concept(synonym, known_synonyms);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_30 = makeBoolean(NIL == valid_32);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                                            try {
                                                                                                bind($is_thread_performing_cleanupP$, T);
                                                                                                if (NIL != final_index_iterator_29) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_29);
                                                                                                }
                                                                                            } finally {
                                                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_25 = makeBoolean(NIL == valid_28);
                                                                        }
                                                                    } 
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var_20 = makeBoolean(NIL == valid_22);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
        }
        return known_synonyms;
    }

    /**
     * Collect Cyc terms that have the same ID in the same external ontology.
     */
    @LispMethod(comment = "Collect Cyc terms that have the same ID in the same external ontology.")
    public static SubLObject gather_synonyms_via_synonymous_external_concept(final SubLObject indexed_term, SubLObject known_synonyms) {
        if (known_synonyms == UNPROVIDED) {
            known_synonyms = set_utilities.new_singleton_set(indexed_term, symbol_function(EQL));
        }
        final SubLObject pred_var = $$synonymousExternalConcept;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(indexed_term, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(indexed_term, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$21 = NIL;
                        final SubLObject token_var_$22 = NIL;
                        while (NIL == done_var_$21) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                            final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(gaf));
                            if (NIL != valid_$23) {
                                final SubLObject ontology = assertions_high.gaf_arg2(gaf);
                                final SubLObject local_name = assertions_high.gaf_arg3(gaf);
                                final SubLObject pred_var_$24 = $$synonymousExternalConcept;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(local_name, THREE_INTEGER, pred_var_$24)) {
                                    final SubLObject iterator_var_$25 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(local_name, THREE_INTEGER, pred_var_$24);
                                    SubLObject done_var_$22 = NIL;
                                    final SubLObject token_var_$23 = NIL;
                                    while (NIL == done_var_$22) {
                                        final SubLObject final_index_spec_$28 = iteration.iteration_next_without_values_macro_helper(iterator_var_$25, token_var_$23);
                                        final SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(final_index_spec_$28));
                                        if (NIL != valid_$24) {
                                            SubLObject final_index_iterator_$30 = NIL;
                                            try {
                                                final_index_iterator_$30 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$28, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$23 = NIL;
                                                final SubLObject token_var_$24 = NIL;
                                                while (NIL == done_var_$23) {
                                                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$30, token_var_$24);
                                                    final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(gaf2));
                                                    if ((((NIL != valid_$25) && assertions_high.gaf_arg2(gaf2).eql(ontology)) && (NIL != indexed_term_p(assertions_high.gaf_arg1(gaf2)))) && (NIL == set.set_memberP(assertions_high.gaf_arg1(gaf2), known_synonyms))) {
                                                        final SubLObject synonym = assertions_high.gaf_arg1(gaf2);
                                                        set.set_add(synonym, known_synonyms);
                                                        gather_synonyms_via_synonymous_external_concept(synonym, known_synonyms);
                                                    }
                                                    done_var_$23 = makeBoolean(NIL == valid_$25);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator_$30) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$30);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                        done_var_$22 = makeBoolean(NIL == valid_$24);
                                    } 
                                }
                            }
                            done_var_$21 = makeBoolean(NIL == valid_$23);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return known_synonyms;
    }

    public static final SubLObject sort_owl_asents_alt(SubLObject asents) {
        return Sort.sort(asents, $sym117$OWL_ASENT__, UNPROVIDED);
    }

    public static SubLObject sort_owl_asents(final SubLObject asents) {
        return Sort.sort(asents, $sym115$OWL_ASENT__, UNPROVIDED);
    }

    public static final SubLObject owl_remove_singleton_predicates_alt(SubLObject asents) {
        {
            SubLObject comment_count = count_if($sym118$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (comment_count.numG(ONE_INTEGER)) {
                {
                    SubLObject first_comment_asent = find_if($sym118$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject other_asents = remove_if($sym118$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return listS(first_comment_asent, other_asents);
                }
            } else {
                return asents;
            }
        }
    }

    public static SubLObject owl_remove_singleton_predicates(final SubLObject asents) {
        final SubLObject comment_count = count_if($sym116$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (comment_count.numG(ONE_INTEGER)) {
            final SubLObject first_comment_asent = find_if($sym116$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject other_asents = remove_if($sym116$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return listS(first_comment_asent, other_asents);
        }
        return asents;
    }

    public static final SubLObject comment_asentP_alt(SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $$comment);
    }

    public static SubLObject comment_asentP(final SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $$comment);
    }

    public static final SubLObject owlifiable_sentenceP_alt(SubLObject sentence) {
        if (NIL == atomic_sentenceP(sentence)) {
            return NIL;
        } else {
            if ((((NIL != el_binary_formula_p(sentence)) && (NIL != com.cyc.cycjava.cycl.owl.owlification.owlifiable_arg0P(cycl_utilities.atomic_sentence_predicate(sentence)))) && (NIL != com.cyc.cycjava.cycl.owl.owlification.owlifiable_arg1P(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.owl.owlification.owlifiable_arg2P(cycl_utilities.atomic_sentence_predicate(sentence), cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED)))) {
                return T;
            } else {
                if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list_alt120)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject owlifiable_sentenceP(final SubLObject sentence) {
        if (NIL == atomic_sentenceP(sentence)) {
            return NIL;
        }
        if ((((NIL != el_binary_formula_p(sentence)) && (NIL != owlifiable_arg0P(cycl_utilities.atomic_sentence_predicate(sentence)))) && (NIL != owlifiable_arg1P(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED)))) && (NIL != owlifiable_arg2P(cycl_utilities.atomic_sentence_predicate(sentence), cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED)))) {
            return T;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list118)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject owlifiable_arg0P_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.owl.owlification.owl_whitelist_predicateP(v_object)) || ((NIL != kb_accessors.binary_predicateP(v_object)) && (NIL != owl_cycl_to_xml.fort_in_owl_exportP(v_object))));
    }

    public static SubLObject owlifiable_arg0P(final SubLObject v_object) {
        return makeBoolean((NIL != owl_whitelist_predicateP(v_object)) || ((NIL != kb_accessors.binary_predicateP(v_object)) && (NIL != owl_cycl_to_xml.fort_in_owl_exportP(v_object))));
    }

    public static final SubLObject owlifiable_arg1P_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != com.cyc.cycjava.cycl.owl.owlification.owlifiable_sentenceP(v_object)));
    }

    public static SubLObject owlifiable_arg1P(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != owlifiable_sentenceP(v_object)));
    }

    public static final SubLObject owlifiable_arg2P_alt(SubLObject predicate, SubLObject arg2) {
        if ((NIL != nart_handles.nart_p(arg2)) && (NIL != com.cyc.cycjava.cycl.owl.owlification.nart_invalid_for_owl_exportP(arg2))) {
            return NIL;
        } else {
            if (NIL != list_utilities.member_eqP(predicate, $owl_permissive_arg2_predicates$.getGlobalValue())) {
                return T;
            } else {
                if (NIL != list_utilities.member_eqP(predicate, $owl_fort_arg2_predicates$.getGlobalValue())) {
                    return makeBoolean(((NIL == fort_types_interface.collection_p(arg2)) || (NIL != com.cyc.cycjava.cycl.owl.owlification.valid_collection_fort_for_owl_exportP(arg2))) && (NIL != forts.fort_p(arg2)));
                } else {
                    return makeBoolean((((NIL != owl_cycl_to_xml.fort_in_owl_exportP(arg2)) || (NIL != com.cyc.cycjava.cycl.owl.owlification.owlifiable_date_p(arg2))) || arg2.isString()) || arg2.isNumber());
                }
            }
        }
    }

    public static SubLObject owlifiable_arg2P(final SubLObject predicate, final SubLObject arg2) {
        if ((NIL != nart_handles.nart_p(arg2)) && (NIL != nart_invalid_for_owl_exportP(arg2))) {
            return NIL;
        }
        if (NIL != list_utilities.member_eqP(predicate, $owl_permissive_arg2_predicates$.getGlobalValue())) {
            return T;
        }
        if (NIL != list_utilities.member_eqP(predicate, $owl_fort_arg2_predicates$.getGlobalValue())) {
            return makeBoolean(((NIL == fort_types_interface.collection_p(arg2)) || (NIL != valid_collection_fort_for_owl_exportP(arg2))) && (NIL != forts.fort_p(arg2)));
        }
        return makeBoolean((((NIL != owl_cycl_to_xml.fort_in_owl_exportP(arg2)) || (NIL != owlifiable_date_p(arg2))) || arg2.isString()) || arg2.isNumber());
    }

    public static final SubLObject owlifiable_date_p_alt(SubLObject obj) {
        return makeBoolean((NIL != date_utilities.date_p(obj)) && (NIL != member(cycl_utilities.nat_functor(obj), $list_alt121, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject owlifiable_date_p(final SubLObject obj) {
        return makeBoolean((NIL != date_utilities.date_p(obj)) && (NIL != member(cycl_utilities.nat_functor(obj), $list119, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * These are asents that do not come from an asserted GAF.
     */
    @LispMethod(comment = "These are asents that do not come from an asserted GAF.")
    public static final SubLObject owl_extra_arg1_asents_for_term_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extra_asents = NIL;
                SubLObject preferred_english = com.cyc.cycjava.cycl.owl.owlification.owl_preferred_english_for_term(fort);
                extra_asents = cons(list($$preferredEnglish, fort, preferred_english), extra_asents);
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.owl.owlification.owl_other_english_for_term(fort);
                    SubLObject other_english = NIL;
                    for (other_english = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_english = cdolist_list_var.first()) {
                        if (!((NIL != string_utilities.empty_string_p(other_english)) || other_english.equalp(preferred_english))) {
                            extra_asents = cons(list($$otherEnglish, fort, other_english), extra_asents);
                        }
                    }
                }
                extra_asents = cons(list($$cycName, fort, com.cyc.cycjava.cycl.owl.owlification.owl_fort_cyc_name(fort)), extra_asents);
                if (NIL == $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                    extra_asents = cons(list($$owlExternalID, fort, com.cyc.cycjava.cycl.owl.owlification.owl_external_id_string(fort)), extra_asents);
                }
                if (NIL != com.cyc.cycjava.cycl.owl.owlification.owl_functional_propertyP(fort)) {
                    extra_asents = cons(listS($$specialIsa, fort, $list_alt124), extra_asents);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.owl.owlification.owl_inverse_functional_propertyP(fort)) {
                        extra_asents = cons(listS($$specialIsa, fort, $list_alt125), extra_asents);
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.owl.owlification.owl_subcollection_nart_p(fort)) {
                    {
                        SubLObject var = com.cyc.cycjava.cycl.owl.owlification.owl_subcollection_asent(fort);
                        if (NIL != var) {
                            extra_asents = cons(var, extra_asents);
                        }
                    }
                }
                {
                    SubLObject umbel_uri_sentence = com.cyc.cycjava.cycl.owl.owlification.umbel_uri_sentence_for_fort(fort);
                    SubLObject var = umbel_uri_sentence;
                    if (NIL != var) {
                        extra_asents = cons(var, extra_asents);
                    }
                }
                return nreverse(extra_asents);
            }
        }
    }

    /**
     * These are asents that do not come from an asserted GAF.
     */
    @LispMethod(comment = "These are asents that do not come from an asserted GAF.")
    public static SubLObject owl_extra_arg1_asents_for_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extra_asents = NIL;
        final SubLObject preferred_english = owl_preferred_english_for_term(fort);
        extra_asents = cons(list($$preferredEnglish, fort, preferred_english), extra_asents);
        SubLObject cdolist_list_var = owl_other_english_for_term(fort);
        SubLObject other_english = NIL;
        other_english = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == string_utilities.empty_string_p(other_english)) && (!other_english.equalp(preferred_english))) {
                extra_asents = cons(list($$otherEnglish, fort, other_english), extra_asents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_english = cdolist_list_var.first();
        } 
        extra_asents = cons(list($$cycName, fort, owl_fort_cyc_name(fort)), extra_asents);
        if (NIL == $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
            extra_asents = cons(list($$owlExternalID, fort, owl_external_id_string(fort)), extra_asents);
        }
        if (NIL != owl_functional_propertyP(fort)) {
            extra_asents = cons(listS($$specialIsa, fort, $list122), extra_asents);
        } else
            if (NIL != owl_inverse_functional_propertyP(fort)) {
                extra_asents = cons(listS($$specialIsa, fort, $list123), extra_asents);
            }

        if (NIL != owl_subcollection_nart_p(fort)) {
            final SubLObject var = owl_subcollection_asent(fort);
            if (NIL != var) {
                extra_asents = cons(var, extra_asents);
            }
        }
        final SubLObject var2;
        final SubLObject umbel_uri_sentence = var2 = umbel_uri_sentence_for_fort(fort);
        if (NIL != var2) {
            extra_asents = cons(var2, extra_asents);
        }
        return nreverse(extra_asents);
    }

    public static final SubLObject owl_functional_propertyP_alt(SubLObject fort) {
        if (NIL != kb_accessors.binary_predicateP(fort)) {
            return makeBoolean(((NIL != isa.isaP(fort, $$StrictlyFunctionalSlot, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.tuple_holds(listS($$argCardinality, fort, $list_alt128), UNPROVIDED, UNPROVIDED))) || (NIL != backward.removal_ask(listS($$strictlyFunctionalInArgs, fort, $list_alt130), $$InferencePSC, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject owl_functional_propertyP(final SubLObject fort) {
        if (NIL != kb_accessors.binary_predicateP(fort)) {
            return makeBoolean(((NIL != isa.isaP(fort, $$StrictlyFunctionalSlot, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.tuple_holds(listS($$argCardinality, fort, $list126), UNPROVIDED, UNPROVIDED))) || (NIL != backward.removal_ask(listS($$strictlyFunctionalInArgs, fort, $list128), $$InferencePSC, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject owl_inverse_functional_propertyP_alt(SubLObject fort) {
        if (NIL != kb_accessors.binary_predicateP(fort)) {
            return makeBoolean((NIL != kb_mapping_utilities.tuple_holds(listS($$argCardinality, fort, $list_alt131), UNPROVIDED, UNPROVIDED)) || (NIL != backward.removal_ask(listS($$strictlyFunctionalInArgs, fort, $list_alt132), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject owl_inverse_functional_propertyP(final SubLObject fort) {
        if (NIL != kb_accessors.binary_predicateP(fort)) {
            return makeBoolean((NIL != kb_mapping_utilities.tuple_holds(listS($$argCardinality, fort, $list129), UNPROVIDED, UNPROVIDED)) || (NIL != backward.removal_ask(listS($$strictlyFunctionalInArgs, fort, $list130), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     * Removes any #$isa asent that is redundant with the type of FORT (the arg1).
     */
    @LispMethod(comment = "Removes any #$isa asent that is redundant with the type of FORT (the arg1).")
    public static final SubLObject owl_remove_type_isa_alt(SubLObject asents) {
        return remove_if($sym133$OWL_REDUNDANT_TYPE_ISA_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Removes any #$isa asent that is redundant with the type of FORT (the arg1).
     */
    @LispMethod(comment = "Removes any #$isa asent that is redundant with the type of FORT (the arg1).")
    public static SubLObject owl_remove_type_isa(final SubLObject asents) {
        return remove_if($sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject owl_redundant_type_isa_asentP_alt(SubLObject asent) {
        if (NIL != com.cyc.cycjava.cycl.owl.owlification.owl_isa_litP(asent)) {
            {
                SubLObject ins = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject type = com.cyc.cycjava.cycl.owl.owlification.best_isa_for_term(ins);
                return genls.genlP(type, col, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject owl_redundant_type_isa_asentP(final SubLObject asent) {
        if (NIL != owl_isa_litP(asent)) {
            final SubLObject ins = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject type = best_isa_for_term(ins);
            return genls.genlP(type, col, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject owl_isa_litP_alt(SubLObject asent) {
        return makeBoolean((NIL != isa_litP(asent)) || (NIL != el_formula_with_operator_p(asent, $$rdf_type)));
    }

    public static SubLObject owl_isa_litP(final SubLObject asent) {
        return makeBoolean((NIL != isa_litP(asent)) || (NIL != el_formula_with_operator_p(asent, $$rdf_type)));
    }

    public static final SubLObject owl_genls_litP_alt(SubLObject asent) {
        return makeBoolean((NIL != genls_litP(asent)) || (NIL != el_formula_with_operator_p(asent, $const134$rdfs_subClassOf)));
    }

    public static SubLObject owl_genls_litP(final SubLObject asent) {
        return makeBoolean((NIL != genls_litP(asent)) || (NIL != el_formula_with_operator_p(asent, $const132$rdfs_subClassOf)));
    }

    public static final SubLObject owl_remove_uvmt_anect_isa_alt(SubLObject asents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removeP = NIL;
                if (ONE_INTEGER.numE(count_if($sym135$ISA_LIT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    removeP = NIL;
                } else {
                    if (NIL != $owl_remove_isa_individual_asentsP$.getDynamicValue(thread)) {
                        removeP = T;
                    } else {
                        if (NIL != kb_accessors.binary_predicateP(cycl_utilities.atomic_sentence_arg1(asents.first(), UNPROVIDED))) {
                            removeP = T;
                        } else {
                            removeP = NIL;
                        }
                    }
                }
                if (NIL != removeP) {
                    return remove_if($sym136$ISA_INDIVIDUAL_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return asents;
                }
            }
        }
    }

    public static SubLObject owl_remove_uvmt_anect_isa(final SubLObject asents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject removeP = NIL;
        if (ONE_INTEGER.numE(count_if($sym133$ISA_LIT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            removeP = NIL;
        } else
            if (NIL != $owl_remove_isa_individual_asentsP$.getDynamicValue(thread)) {
                removeP = T;
            } else
                if (NIL != kb_accessors.binary_predicateP(cycl_utilities.atomic_sentence_arg1(asents.first(), UNPROVIDED))) {
                    removeP = T;
                } else {
                    removeP = NIL;
                }


        if (NIL != removeP) {
            return remove_if($sym134$ISA_INDIVIDUAL_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return asents;
    }

    public static final SubLObject isa_individual_asentP_alt(SubLObject asent) {
        return makeBoolean((NIL != isa_litP(asent)) && ($$Individual == cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static SubLObject isa_individual_asentP(final SubLObject asent) {
        return makeBoolean((NIL != isa_litP(asent)) && $$Individual.eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    public static final SubLObject owl_asent_L_alt(SubLObject asent1, SubLObject asent2) {
        if (NIL != el_formula_with_operator_p(asent1, $$rdfURI)) {
            return NIL;
        } else {
            if (NIL != el_formula_with_operator_p(asent2, $$rdfURI)) {
                return T;
            } else {
                if ((NIL != formula_arityE(asent1, TWO_INTEGER, UNPROVIDED)) && (NIL != formula_arityE(asent2, TWO_INTEGER, UNPROVIDED))) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_binary_asent_L(asent1, asent2);
                } else {
                    return kb_utilities.term_L(asent1, asent2, T, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject owl_asent_L(final SubLObject asent1, final SubLObject asent2) {
        if (NIL != el_formula_with_operator_p(asent1, $$rdfURI)) {
            return NIL;
        }
        if (NIL != el_formula_with_operator_p(asent2, $$rdfURI)) {
            return T;
        }
        if ((NIL != formula_arityE(asent1, TWO_INTEGER, UNPROVIDED)) && (NIL != formula_arityE(asent2, TWO_INTEGER, UNPROVIDED))) {
            return owl_binary_asent_L(asent1, asent2);
        }
        return kb_utilities.term_L(asent1, asent2, T, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject owl_binary_asent_L_alt(SubLObject asent1, SubLObject asent2) {
        {
            SubLObject pred1 = cycl_utilities.atomic_sentence_predicate(asent1);
            SubLObject pred2 = cycl_utilities.atomic_sentence_predicate(asent2);
            SubLObject pos1 = position(pred1, com.cyc.cycjava.cycl.owl.owlification.owl_cycl_predicate_table(UNPROVIDED), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            SubLObject pos2 = position(pred2, com.cyc.cycjava.cycl.owl.owlification.owl_cycl_predicate_table(UNPROVIDED), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            if ((NIL == pos1) && (NIL == pos2)) {
                return kb_utilities.term_L_with_constant_by_name(pred1, pred2, UNPROVIDED);
            } else {
                if (NIL == pos1) {
                    return NIL;
                } else {
                    if (NIL == pos2) {
                        return T;
                    } else {
                        if (pos1.numL(pos2)) {
                            return T;
                        } else {
                            if (pos1.numG(pos2)) {
                                return NIL;
                            } else {
                                {
                                    SubLObject term1 = cycl_utilities.sentence_arg2(asent1, UNPROVIDED);
                                    SubLObject term2 = cycl_utilities.sentence_arg2(asent2, UNPROVIDED);
                                    if (NIL != constant_p(term1)) {
                                        if (NIL != constant_p(term2)) {
                                            return Strings.stringL(com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(term1), com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(term2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            return NIL;
                                        }
                                    } else {
                                        if (NIL != constant_p(term2)) {
                                            return T;
                                        } else {
                                            {
                                                SubLObject name1 = com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(term1);
                                                SubLObject name2 = com.cyc.cycjava.cycl.owl.owlification.owl_sort_name(term2);
                                                return Strings.stringL(name1, name2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject owl_binary_asent_L(final SubLObject asent1, final SubLObject asent2) {
        final SubLObject pred1 = cycl_utilities.atomic_sentence_predicate(asent1);
        final SubLObject pred2 = cycl_utilities.atomic_sentence_predicate(asent2);
        final SubLObject pos1 = position(pred1, owl_cycl_predicate_table(UNPROVIDED), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
        final SubLObject pos2 = position(pred2, owl_cycl_predicate_table(UNPROVIDED), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
        if ((NIL == pos1) && (NIL == pos2)) {
            return kb_utilities.term_L_with_constant_by_name(pred1, pred2, UNPROVIDED);
        }
        if (NIL == pos1) {
            return NIL;
        }
        if (NIL == pos2) {
            return T;
        }
        if (pos1.numL(pos2)) {
            return T;
        }
        if (pos1.numG(pos2)) {
            return NIL;
        }
        final SubLObject term1 = cycl_utilities.sentence_arg2(asent1, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.sentence_arg2(asent2, UNPROVIDED);
        if (NIL != constant_p(term1)) {
            if (NIL != constant_p(term2)) {
                return Strings.stringL(owl_sort_name(term1), owl_sort_name(term2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        } else {
            if (NIL != constant_p(term2)) {
                return T;
            }
            final SubLObject name1 = owl_sort_name(term1);
            final SubLObject name2 = owl_sort_name(term2);
            return Strings.stringL(name1, name2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject owl_cyclify_binary_asent_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject owl_asent = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject _prev_bind_0_33 = $asent_to_owl_cyclify$.currentBinding(thread);
                                    try {
                                        $asent_to_owl_cyclify$.bind(asent, thread);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject predicate = unmake_binary_formula(asent);
                                            SubLObject arg1 = thread.secondMultipleValue();
                                            SubLObject arg2 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject owl_cycl_pred = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_predicate(predicate);
                                                if (NIL == owl_cycl_pred) {
                                                    Errors.warn($str_alt140$unexpected_owl_cycl_pred_for_asen, asent);
                                                }
                                                if (NIL != owl_cycl_pred) {
                                                    {
                                                        SubLObject owl_cycl_arg1 = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(arg1);
                                                        SubLObject owl_cycl_arg2 = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg2(arg2, predicate);
                                                        owl_asent = make_binary_formula(owl_cycl_pred, owl_cycl_arg1, owl_cycl_arg2);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        $asent_to_owl_cyclify$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    Errors.warn($str_alt141$Caught_error__S___while_trying_to, error_message, asent);
                }
                return owl_asent;
            }
        }
    }

    public static SubLObject owl_cyclify_binary_asent(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject owl_asent = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$34 = $asent_to_owl_cyclify$.currentBinding(thread);
                    try {
                        $asent_to_owl_cyclify$.bind(asent, thread);
                        thread.resetMultipleValues();
                        final SubLObject predicate = unmake_binary_formula(asent);
                        final SubLObject arg1 = thread.secondMultipleValue();
                        final SubLObject arg2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject owl_cycl_pred = owl_cyclify_predicate(predicate);
                        if (NIL == owl_cycl_pred) {
                            Errors.warn($str138$unexpected_owl_cycl_pred_for_asen, asent);
                        }
                        if (NIL != owl_cycl_pred) {
                            final SubLObject owl_cycl_arg1 = owl_cyclify_arg1(arg1);
                            final SubLObject owl_cycl_arg2 = owl_cyclify_arg2(arg2, predicate);
                            owl_asent = make_binary_formula(owl_cycl_pred, owl_cycl_arg1, owl_cycl_arg2);
                        }
                    } finally {
                        $asent_to_owl_cyclify$.rebind(_prev_bind_0_$34, thread);
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
        if (NIL != error_message) {
            Errors.warn($str139$Caught_error__S___while_trying_to, error_message, asent);
        }
        return owl_asent;
    }

    public static final SubLObject owl_cyclify_meta_asent_alt(SubLObject asent) {
        {
            SubLObject owlified = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_binary_asent(asent);
            SubLObject topic_asent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject statement = com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(asent);
            return cons(owlified, com.cyc.cycjava.cycl.owl.owlification.owl_reification_asents(topic_asent, statement));
        }
    }

    public static SubLObject owl_cyclify_meta_asent(final SubLObject asent) {
        final SubLObject owlified = owl_cyclify_binary_asent(asent);
        final SubLObject topic_asent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject statement = owl_cyclify_arg1(asent);
        return cons(owlified, owl_reification_asents(topic_asent, statement));
    }

    public static final SubLObject owl_reification_asents_alt(SubLObject topic_asent, SubLObject statement) {
        {
            SubLObject datum = cycl_utilities.formula_terms(topic_asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject predicate = NIL;
            SubLObject subject = NIL;
            SubLObject v_object = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt142);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt142);
            subject = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt142);
            v_object = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(com.cyc.cycjava.cycl.owl.owlification.owl_reification_asent($$$subject, statement, subject), com.cyc.cycjava.cycl.owl.owlification.owl_reification_asent($$$predicate, statement, predicate), com.cyc.cycjava.cycl.owl.owlification.owl_reification_asent($$$object, statement, v_object));
            } else {
                cdestructuring_bind_error(datum, $list_alt142);
            }
        }
        return NIL;
    }

    public static SubLObject owl_reification_asents(final SubLObject topic_asent, final SubLObject statement) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(topic_asent, UNPROVIDED);
        SubLObject predicate = NIL;
        SubLObject subject = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list140);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        subject = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(owl_reification_asent($$$subject, statement, subject), owl_reification_asent($$$predicate, statement, predicate), owl_reification_asent($$$object, statement, v_object));
        }
        cdestructuring_bind_error(datum, $list140);
        return NIL;
    }

    public static final SubLObject owl_reification_asent_alt(SubLObject predicate, SubLObject statement, SubLObject v_object) {
        SubLTrampolineFile.checkType(predicate, STRINGP);
        return make_binary_formula(make_unary_formula($$OWLPredicateFn, rdf_utilities.rdf_name(predicate)), statement, com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg2(v_object, predicate));
    }

    public static SubLObject owl_reification_asent(final SubLObject predicate, final SubLObject statement, final SubLObject v_object) {
        assert NIL != stringp(predicate) : "! stringp(predicate) " + ("Types.stringp(predicate) " + "CommonSymbols.NIL != Types.stringp(predicate) ") + predicate;
        return make_binary_formula(make_unary_formula($$OWLPredicateFn, rdf_utilities.rdf_name(predicate)), statement, owl_cyclify_arg2(v_object, predicate));
    }

    public static final SubLObject owl_cyclify_predicate_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject owl_pred = list_utilities.alist_lookup(com.cyc.cycjava.cycl.owl.owlification.owl_cycl_predicate_table(UNPROVIDED), pred, UNPROVIDED, UNPROVIDED);
                if ((NIL == owl_pred) || (NIL != subl_promotions.memberP(pred, $owl_cycl_predicates_to_use_as_is$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                    if (NIL == misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
                        SubLTrampolineFile.enforceType(pred, $sym148$FORT_IN_OWL_EXPORT_);
                    }
                    {
                        SubLObject _prev_bind_0 = $owl_use_entity_referencesP$.currentBinding(thread);
                        try {
                            $owl_use_entity_referencesP$.bind(NIL, thread);
                            owl_pred = owl_uris_and_prefixes.possibly_abbreviate_uri(com.cyc.cycjava.cycl.owl.owlification.owl_fort_name(pred, UNPROVIDED, UNPROVIDED));
                        } finally {
                            $owl_use_entity_referencesP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL != owl_pred ? ((SubLObject) (list($$OWLPredicateFn, owl_pred))) : NIL;
            }
        }
    }

    public static SubLObject owl_cyclify_predicate(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject owl_pred = list_utilities.alist_lookup(owl_cycl_predicate_table(UNPROVIDED), pred, UNPROVIDED, UNPROVIDED);
        if ((NIL == owl_pred) || (NIL != subl_promotions.memberP(pred, $owl_cycl_predicates_to_use_as_is$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
            if (NIL == misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
                SubLTrampolineFile.enforceType(pred, $sym146$FORT_IN_OWL_EXPORT_);
            }
            final SubLObject _prev_bind_0 = $owl_use_entity_referencesP$.currentBinding(thread);
            try {
                $owl_use_entity_referencesP$.bind(NIL, thread);
                owl_pred = owl_uris_and_prefixes.possibly_abbreviate_uri(owl_fort_name(pred, T, UNPROVIDED));
            } finally {
                $owl_use_entity_referencesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != owl_pred ? list($$OWLPredicateFn, owl_pred) : NIL;
    }

    /**
     * (#$OWLTermOfTypeFn <type> <rdf:about>)
     */
    @LispMethod(comment = "(#$OWLTermOfTypeFn <type> <rdf:about>)")
    public static final SubLObject owl_cyclify_arg1_alt(SubLObject arg1) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.enforceType(arg1, $sym149$OWLIFIABLE_ARG1_);
            {
                SubLObject uri = NIL;
                SubLObject term_type = NIL;
                {
                    SubLObject _prev_bind_0 = $owl_use_entity_referencesP$.currentBinding(thread);
                    try {
                        $owl_use_entity_referencesP$.bind(NIL, thread);
                        uri = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.owl_fort_name(arg1, NIL, T))) : NIL;
                        term_type = owl_uris_and_prefixes.possibly_abbreviate_uri(com.cyc.cycjava.cycl.owl.owlification.owl_term_type(arg1));
                        if (!(((NIL != web_utilities.uri_p(term_type, UNPROVIDED)) && (NIL != string_utilities.starts_with(term_type, owl_uris_and_prefixes.owl_export_default_namespace()))) || (NIL != xml_utilities.valid_xml_name_p(term_type)))) {
                            Errors.sublisp_break($str_alt150$Invalid_term_type___S_for__S, new SubLObject[]{ term_type, arg1 });
                        }
                    } finally {
                        $owl_use_entity_referencesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return list($$OWLTermOfTypeFn, term_type, uri);
            }
        }
    }

    /**
     * (#$OWLTermOfTypeFn <type> <rdf:about>)
     */
    @LispMethod(comment = "(#$OWLTermOfTypeFn <type> <rdf:about>)")
    public static SubLObject owl_cyclify_arg1(final SubLObject arg1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(arg1, $sym147$OWLIFIABLE_ARG1_);
        SubLObject uri = NIL;
        SubLObject term_type = NIL;
        final SubLObject _prev_bind_0 = $owl_use_entity_referencesP$.currentBinding(thread);
        try {
            $owl_use_entity_referencesP$.bind(NIL, thread);
            if (NIL != forts.fort_p(arg1)) {
                if (((NIL != $owl_prefer_ontology_urisP$.getDynamicValue(thread)) && (NIL != $owl_export_ontology$.getDynamicValue(thread))) && (NIL != $owl_export_mt$.getDynamicValue(thread))) {
                    uri = asserted_name_in_ontology(arg1, $owl_export_ontology$.getDynamicValue(thread), $owl_export_mt$.getDynamicValue(thread));
                } else {
                    uri = owl_fort_name(arg1, NIL, T);
                }
            }
            term_type = owl_uris_and_prefixes.possibly_abbreviate_uri(owl_term_type(arg1));
            if (((NIL == web_utilities.uri_p(term_type, UNPROVIDED)) || (NIL == string_utilities.starts_with(term_type, owl_uris_and_prefixes.owl_export_default_namespace()))) && (NIL == xml_utilities.valid_xml_name_p(term_type))) {
                Errors.sublisp_break($str148$Invalid_term_type___S_for__S__Exp, new SubLObject[]{ term_type, arg1, owl_uris_and_prefixes.owl_export_default_namespace() });
            }
        } finally {
            $owl_use_entity_referencesP$.rebind(_prev_bind_0, thread);
        }
        return list($$OWLTermOfTypeFn, term_type, uri);
    }

    public static final SubLObject owl_cyclify_arg2_alt(SubLObject arg2, SubLObject property) {
        if (NIL != el_formula_with_operator_p(arg2, $$OWLIntersectionFn)) {
            return com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_intersection(arg2);
        } else {
            if (NIL != com.cyc.cycjava.cycl.owl.owlification.uri_fort_p(arg2)) {
                return make_unary_formula($$OWLURIFn, com.cyc.cycjava.cycl.owl.owlification.stringify_uri_fort(arg2));
            } else {
                if (NIL != date_utilities.date_p(arg2)) {
                    {
                        SubLObject datatype = com.cyc.cycjava.cycl.owl.owlification.owl_arg2_datatype(property, arg2);
                        SubLObject date_string = com.cyc.cycjava.cycl.owl.owlification.owl_date_string(arg2);
                        return (NIL != datatype) && (NIL != date_string) ? ((SubLObject) (make_binary_formula($$OWLDatatypeFn, datatype, date_string))) : com.cyc.cycjava.cycl.owl.owlification.strip_hl_artifacts(com.cyc.cycjava.cycl.owl.owlification.owl_str_with_quotes_allowed(arg2));
                    }
                } else {
                    if (NIL != el_formula_p(arg2)) {
                        Errors.sublisp_break($str_alt155$Unexpected_EL_formula_arg2___S, new SubLObject[]{ arg2 });
                        return com.cyc.cycjava.cycl.owl.owlification.strip_hl_artifacts(com.cyc.cycjava.cycl.owl.owlification.owl_str_with_quotes_allowed(arg2));
                    } else {
                        if (arg2.isString() && (NIL != search(constant_reader.constant_reader_prefix(), arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            return com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_string_with_constant_references(arg2, UNPROVIDED);
                        } else {
                            {
                                SubLObject result = NIL;
                                if (NIL == result) {
                                    {
                                        SubLObject uri = list_utilities.alist_lookup($owl_cycl_property_table$.getGlobalValue(), arg2, symbol_function(EQL), NIL);
                                        if (NIL != uri) {
                                            result = make_unary_formula($$OWLURIFn, uri);
                                        }
                                    }
                                }
                                if (NIL == result) {
                                    {
                                        SubLObject mapping = list_utilities.alist_lookup($owl_cycl_collection_table$.getGlobalValue(), arg2, UNPROVIDED, UNPROVIDED);
                                        if (NIL != mapping) {
                                            {
                                                SubLObject datum = mapping;
                                                SubLObject current = datum;
                                                SubLObject entity = NIL;
                                                SubLObject local_name = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt156);
                                                entity = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt156);
                                                local_name = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL != entity) {
                                                        result = make_unary_formula($$OWLURIFn, com.cyc.cycjava.cycl.owl.owlification.maybe_expand_owl_entity_reference(entity, local_name));
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt156);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == result) {
                                    {
                                        SubLObject raw_term_string = com.cyc.cycjava.cycl.owl.owlification.owl_term_string(arg2, UNPROVIDED);
                                        SubLObject datatype = com.cyc.cycjava.cycl.owl.owlification.owl_arg2_datatype(property, arg2);
                                        if (NIL != forts.fort_p(arg2)) {
                                            if ((NIL == web_utilities.uri_p(raw_term_string, UNPROVIDED)) && (!string_utilities.first_char(raw_term_string).eql(CHAR_ampersand))) {
                                                Errors.sublisp_break($str_alt157$Raw_term_string_for__S___S, new SubLObject[]{ arg2, raw_term_string });
                                            }
                                            {
                                                SubLObject term_string = raw_term_string;
                                                result = make_unary_formula($$OWLURIFn, term_string);
                                            }
                                        } else {
                                            if (arg2.isNumber() && (NIL != datatype)) {
                                                result = make_binary_formula($$OWLDatatypeFn, datatype, raw_term_string);
                                            } else {
                                                if (arg2.isString()) {
                                                    result = raw_term_string;
                                                } else {
                                                    Errors.sublisp_break($str_alt158$Need_XSD_datatype_for__S, new SubLObject[]{ arg2 });
                                                }
                                            }
                                        }
                                    }
                                }
                                return result;
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject owl_cyclify_arg2(final SubLObject arg2, final SubLObject property) {
        if (NIL != el_formula_with_operator_p(arg2, $$OWLIntersectionFn)) {
            return owl_cyclify_intersection(arg2);
        }
        if (NIL != uri_fort_p(arg2)) {
            return make_unary_formula($$OWLURIFn, stringify_uri_fort(arg2));
        }
        if (NIL != date_utilities.date_p(arg2)) {
            final SubLObject datatype = owl_arg2_datatype(property, arg2);
            final SubLObject date_string = owl_date_string(arg2);
            return (NIL != datatype) && (NIL != date_string) ? make_binary_formula($$OWLDatatypeFn, datatype, date_string) : strip_hl_artifacts(owl_str_with_quotes_allowed(arg2));
        }
        if (NIL != unicode_nauts.unicode_naut_p(arg2, UNPROVIDED)) {
            return cycl_string.cycl_string_to_utf8_string(arg2);
        }
        if (NIL != el_formula_p(arg2)) {
            Errors.sublisp_break($str153$Unexpected_EL_formula_arg2___S, new SubLObject[]{ arg2 });
            return strip_hl_artifacts(owl_str_with_quotes_allowed(arg2));
        }
        if (arg2.isString() && (NIL != search(constant_reader.constant_reader_prefix(), arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return owl_cyclify_string_with_constant_references(arg2, UNPROVIDED);
        }
        SubLObject result = NIL;
        if (NIL == result) {
            final SubLObject uri = list_utilities.alist_lookup($owl_cycl_property_table$.getGlobalValue(), arg2, symbol_function(EQL), NIL);
            if (NIL != uri) {
                result = make_unary_formula($$OWLURIFn, uri);
            }
        }
        if (NIL == result) {
            final SubLObject mapping = list_utilities.alist_lookup($owl_cycl_collection_table$.getGlobalValue(), arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != mapping) {
                SubLObject current;
                final SubLObject datum = current = mapping;
                SubLObject entity = NIL;
                SubLObject local_name = NIL;
                destructuring_bind_must_consp(current, datum, $list154);
                entity = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list154);
                local_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != entity) {
                        result = make_unary_formula($$OWLURIFn, maybe_expand_owl_entity_reference(entity, local_name));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list154);
                }
            }
        }
        if (NIL == result) {
            final SubLObject raw_term_string = owl_term_string(arg2, UNPROVIDED);
            final SubLObject datatype2 = owl_arg2_datatype(property, arg2);
            if (NIL != forts.fort_p(arg2)) {
                if ((NIL == web_utilities.uri_p(raw_term_string, UNPROVIDED)) && (!string_utilities.first_char(raw_term_string).eql(CHAR_ampersand))) {
                    Errors.sublisp_break($str155$Raw_term_string_for__S___S, new SubLObject[]{ arg2, raw_term_string });
                }
                final SubLObject term_string = raw_term_string;
                result = make_unary_formula($$OWLURIFn, term_string);
            } else
                if (arg2.isNumber() && (NIL != datatype2)) {
                    result = make_binary_formula($$OWLDatatypeFn, datatype2, raw_term_string);
                } else
                    if (arg2.isString()) {
                        result = raw_term_string;
                    } else {
                        Errors.sublisp_break($str156$Need_XSD_datatype_for__S, new SubLObject[]{ arg2 });
                    }


        }
        return result;
    }

    public static final SubLObject owl_date_string_alt(SubLObject date) {
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(date);
            if (pcase_var.eql($$SecondFn)) {
                return com.cyc.cycjava.cycl.owl.owlification.owl_date_instant_string(date);
            } else {
                if (pcase_var.eql($$DayFn)) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_day_string(date);
                } else {
                    if (pcase_var.eql($$MonthFn)) {
                        return com.cyc.cycjava.cycl.owl.owlification.owl_month_string(date);
                    } else {
                        if (pcase_var.eql($$YearFn)) {
                            return com.cyc.cycjava.cycl.owl.owlification.owl_year_string(date);
                        } else {
                            if (pcase_var.eql($$CenturyFn)) {
                                return com.cyc.cycjava.cycl.owl.owlification.owl_century_string(date);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject owl_date_string(final SubLObject date) {
        final SubLObject pcase_var = cycl_utilities.nat_functor(date);
        if (pcase_var.eql($$SecondFn)) {
            return owl_date_instant_string(date);
        }
        if (pcase_var.eql($$DayFn)) {
            return owl_day_string(date);
        }
        if (pcase_var.eql($$MonthFn)) {
            return owl_month_string(date);
        }
        if (pcase_var.eql($$YearFn)) {
            return owl_year_string(date);
        }
        if (pcase_var.eql($$CenturyFn)) {
            return owl_century_string(date);
        }
        return NIL;
    }

    public static final SubLObject owl_arg2_datatype_alt(SubLObject property, SubLObject arg2) {
        {
            SubLObject result = NIL;
            if (arg2.isInteger()) {
                result = com.cyc.cycjava.cycl.owl.owlification.maybe_expand_owl_entity_reference($$$xsd, $$$integer);
            } else {
                if (arg2.isNumber()) {
                    result = com.cyc.cycjava.cycl.owl.owlification.maybe_expand_owl_entity_reference($$$xsd, $$$decimal);
                } else {
                    if (NIL != date_utilities.date_p(arg2)) {
                        {
                            SubLObject pcase_var = cycl_utilities.nat_functor(arg2);
                            if (((pcase_var.eql($$DayFn) || pcase_var.eql($$MonthFn)) || pcase_var.eql($$YearFn)) || pcase_var.eql($$CenturyFn)) {
                                result = com.cyc.cycjava.cycl.owl.owlification.maybe_expand_owl_entity_reference($$$xsd, $$$date);
                            } else {
                                if (pcase_var.eql($$SecondFn)) {
                                    result = com.cyc.cycjava.cycl.owl.owlification.maybe_expand_owl_entity_reference($$$xsd, $$$timeInstant);
                                } else {
                                    Errors.sublisp_break($str_alt169$Don_t_know_XSD_datatype_for__S, new SubLObject[]{ arg2 });
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject owl_arg2_datatype(final SubLObject property, final SubLObject arg2) {
        SubLObject result = NIL;
        if (arg2.isInteger()) {
            result = maybe_expand_owl_entity_reference($$$xsd, $$$integer);
        } else
            if (arg2.isNumber()) {
                result = maybe_expand_owl_entity_reference($$$xsd, $$$decimal);
            } else
                if (NIL != date_utilities.date_p(arg2)) {
                    final SubLObject pcase_var = cycl_utilities.nat_functor(arg2);
                    if (((pcase_var.eql($$DayFn) || pcase_var.eql($$MonthFn)) || pcase_var.eql($$YearFn)) || pcase_var.eql($$CenturyFn)) {
                        result = maybe_expand_owl_entity_reference($$$xsd, $$$date);
                    } else
                        if (pcase_var.eql($$SecondFn)) {
                            result = maybe_expand_owl_entity_reference($$$xsd, $$$timeInstant);
                        } else {
                            Errors.sublisp_break($str167$Don_t_know_XSD_datatype_for__S, new SubLObject[]{ arg2 });
                        }

                }


        return result;
    }

    public static final SubLObject owl_day_string_alt(SubLObject date) {
        return date_defns.cyc_date_encode_string($str_alt170$YYYY_MM_DD, date);
    }

    public static SubLObject owl_day_string(final SubLObject date) {
        return date_defns.cyc_date_encode_string($str168$YYYY_MM_DD, date);
    }

    public static final SubLObject owl_month_string_alt(SubLObject date) {
        return date_defns.cyc_date_encode_string($str_alt171$YYYY_MM, date);
    }

    public static SubLObject owl_month_string(final SubLObject date) {
        return date_defns.cyc_date_encode_string($str169$YYYY_MM, date);
    }

    public static final SubLObject owl_year_string_alt(SubLObject date) {
        return date_defns.cyc_date_encode_string($$$YYYY, date);
    }

    public static SubLObject owl_year_string(final SubLObject date) {
        return date_defns.cyc_date_encode_string($$$YYYY, date);
    }

    public static final SubLObject owl_century_string_alt(SubLObject date) {
        return princ_to_string(number_utilities.f_1_(cycl_utilities.nat_arg1(date, UNPROVIDED)));
    }

    public static SubLObject owl_century_string(final SubLObject date) {
        return princ_to_string(number_utilities.f_1_(cycl_utilities.nat_arg1(date, UNPROVIDED)));
    }

    public static final SubLObject owl_date_instant_string_alt(SubLObject date) {
        return date_defns.cyc_date_encode_string($str_alt173$YYYY_MM_DDTHH_MM_SS, date);
    }

    public static SubLObject owl_date_instant_string(final SubLObject date) {
        return date_defns.cyc_date_encode_string($str171$YYYY_MM_DDTHH_MM_SS, date);
    }

    public static final SubLObject maybe_expand_owl_entity_reference_alt(SubLObject entity, SubLObject local_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $owl_use_entity_referencesP$.getDynamicValue(thread) ? ((SubLObject) (cconcatenate($str_alt174$_, new SubLObject[]{ entity, $str_alt175$_, local_name }))) : cconcatenate(list_utilities.alist_lookup(owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue(thread), entity, symbol_function(EQUAL), UNPROVIDED), local_name);
        }
    }

    public static SubLObject maybe_expand_owl_entity_reference(final SubLObject entity, final SubLObject local_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $owl_use_entity_referencesP$.getDynamicValue(thread) ? cconcatenate($str172$_, new SubLObject[]{ entity, $str173$_, local_name }) : cconcatenate(list_utilities.alist_lookup(owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue(thread), entity, symbol_function(EQUAL), UNPROVIDED), local_name);
    }

    public static final SubLObject uri_fort_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.memberP(cycl_utilities.nat_functor(v_object), $list_alt176, UNPROVIDED, UNPROVIDED)) || ((NIL != constant_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$UniformResourceIdentifier))));
    }

    public static SubLObject uri_fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.memberP(cycl_utilities.nat_functor(v_object), $list174, UNPROVIDED, UNPROVIDED)) || ((NIL != constant_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$UniformResourceIdentifier))));
    }

    public static final SubLObject stringify_uri_fort_alt(SubLObject uri_fort) {
        SubLTrampolineFile.enforceType(uri_fort, URI_FORT_P);
        return com.cyc.cycjava.cycl.owl.owlification.stringify_uri_fort_internal(uri_fort);
    }

    public static SubLObject stringify_uri_fort(final SubLObject uri_fort) {
        SubLTrampolineFile.enforceType(uri_fort, URI_FORT_P);
        return stringify_uri_fort_internal(uri_fort);
    }

    public static final SubLObject stringify_uri_fort_internal_alt(SubLObject uri_fort) {
        if (uri_fort.isString()) {
            return uri_fort;
        }
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(uri_fort);
            if (pcase_var.eql($$URIFn)) {
                return com.cyc.cycjava.cycl.owl.owlification.stringify_uri_fort_internal(cycl_utilities.nat_arg1(uri_fort, UNPROVIDED));
            } else {
                if (pcase_var.eql($$URIInNamespaceFn)) {
                    return cconcatenate(com.cyc.cycjava.cycl.owl.owlification.stringify_uri_fort_internal(cycl_utilities.nat_arg1(uri_fort, UNPROVIDED)), cycl_utilities.nat_arg2(uri_fort, UNPROVIDED));
                } else {
                    if (pcase_var.eql($$URIWithFragmentFn)) {
                        return cconcatenate(com.cyc.cycjava.cycl.owl.owlification.stringify_uri_fort_internal(cycl_utilities.nat_arg1(uri_fort, UNPROVIDED)), new SubLObject[]{ $str_alt182$_, cycl_utilities.nat_arg2(uri_fort, UNPROVIDED) });
                    } else {
                        {
                            SubLObject asserted = ask_utilities.query_variable($sym183$_URI_STRING, listS($$uriString, uri_fort, $list_alt185), $$InferencePSC, $list_alt186);
                            if (NIL != asserted) {
                                return asserted.first();
                            }
                        }
                        Errors.error($str_alt187$Can_t_convert_URI_FORT_to_string_, uri_fort);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject stringify_uri_fort_internal(final SubLObject uri_fort) {
        if (uri_fort.isString()) {
            return uri_fort;
        }
        final SubLObject pcase_var = cycl_utilities.nat_functor(uri_fort);
        if (pcase_var.eql($$URIFn)) {
            return stringify_uri_fort_internal(cycl_utilities.nat_arg1(uri_fort, UNPROVIDED));
        }
        if (pcase_var.eql($$URIInNamespaceFn)) {
            return cconcatenate(stringify_uri_fort_internal(cycl_utilities.nat_arg1(uri_fort, UNPROVIDED)), cycl_utilities.nat_arg2(uri_fort, UNPROVIDED));
        }
        if (pcase_var.eql($$URIWithFragmentFn)) {
            return cconcatenate(stringify_uri_fort_internal(cycl_utilities.nat_arg1(uri_fort, UNPROVIDED)), new SubLObject[]{ $str180$_, cycl_utilities.nat_arg2(uri_fort, UNPROVIDED) });
        }
        final SubLObject asserted = ask_utilities.query_variable($sym181$_URI_STRING, listS($$uriString, uri_fort, $list183), $$InferencePSC, $list184);
        if (NIL != asserted) {
            return asserted.first();
        }
        Errors.error($str185$Can_t_convert_URI_FORT_to_string_, uri_fort);
        return NIL;
    }

    public static final SubLObject owl_cyclify_string_with_constant_references_alt(SubLObject string, SubLObject include_popupsP) {
        if (include_popupsP == UNPROVIDED) {
            include_popupsP = $owl_include_cyc_constant_popupsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if ((NIL != misc_utilities.initialized_p($asent_to_owl_cyclify$.getDynamicValue(thread))) && (NIL != member(cycl_utilities.atomic_sentence_predicate($asent_to_owl_cyclify$.getDynamicValue(thread)), $owl_link_constant_references_for_these_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = make_private_string_output_stream();
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(stream, thread);
                                    html_princ_cycl_string(string, NIL != include_popupsP ? ((SubLObject) (HTML_LINK_TO_OWL_URI_WITH_POPUPS)) : HTML_LINK_TO_OWL_URI, UNPROVIDED);
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                                }
                            }
                            result = get_output_stream_string(stream);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(stream, UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                if (NIL == result) {
                    result = string_utilities.remove_substring(string, constant_reader.constant_reader_prefix());
                }
                return result;
            }
        }
    }

    public static SubLObject owl_cyclify_string_with_constant_references(final SubLObject string, SubLObject include_popupsP) {
        if (include_popupsP == UNPROVIDED) {
            include_popupsP = $owl_include_cyc_constant_popupsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((NIL != misc_utilities.initialized_p($asent_to_owl_cyclify$.getDynamicValue(thread))) && (NIL != member(cycl_utilities.atomic_sentence_predicate($asent_to_owl_cyclify$.getDynamicValue(thread)), $owl_link_constant_references_for_these_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_princ_cycl_string(string, NIL != include_popupsP ? HTML_LINK_TO_OWL_URI_WITH_POPUPS : HTML_LINK_TO_OWL_URI, UNPROVIDED);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                result = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        if (NIL == result) {
            result = string_utilities.remove_substring(string, constant_reader.constant_reader_prefix());
        }
        return result;
    }

    public static final SubLObject initialize_owl_span_id_counter_alt() {
        integer_sequence_generator.integer_sequence_generator_reset($owl_span_id_counter$.getGlobalValue());
        return $owl_span_id_counter$.getGlobalValue();
    }

    public static SubLObject initialize_owl_span_id_counter() {
        integer_sequence_generator.integer_sequence_generator_reset($owl_span_id_counter$.getGlobalValue());
        return $owl_span_id_counter$.getGlobalValue();
    }

    public static final SubLObject next_owl_span_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($owl_span_id_counter$.getGlobalValue());
    }

    public static SubLObject next_owl_span_id() {
        return integer_sequence_generator.integer_sequence_generator_next($owl_span_id_counter$.getGlobalValue());
    }

    public static final SubLObject html_link_to_owl_uri_with_popups_alt(SubLObject fort, SubLObject opencycP) {
        if (opencycP == UNPROVIDED) {
            opencycP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject uri = (NIL != opencycP) ? ((SubLObject) (owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : owl_cycl_to_xml.owl_cyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject span_id = com.cyc.cycjava.cycl.owl.owlification.next_owl_span_id();
                SubLObject mouseover = cconcatenate($str_alt191$TagToTip__, new SubLObject[]{ format_nil.format_nil_d_no_copy(span_id), $str_alt192$__ });
                SubLObject mouseout = $str_alt193$UnTip__;
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(uri);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(mouseover);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(mouseout);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name(fort, UNPROVIDED));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (NIL != span_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(span_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt194$owl_cyc_constant_tooltip);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt195$display__none_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt196$comment_header);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(com.cyc.cycjava.cycl.owl.owlification.owl_fort_cyc_name(fort));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                            }
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt196$comment_header);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt197$ID___A, com.cyc.cycjava.cycl.owl.owlification.owl_external_id_string(fort));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                            }
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt198$comment_body);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                com.cyc.cycjava.cycl.owl.owlification.html_output_owl_fort_comment(fort, NIL);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                            }
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_link_to_owl_uri_with_popups(final SubLObject fort, SubLObject opencycP) {
        if (opencycP == UNPROVIDED) {
            opencycP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject uri = (NIL != opencycP) ? owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED) : owl_cycl_to_xml.owl_cyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject span_id = next_owl_span_id();
        final SubLObject mouseover = cconcatenate($str189$TagToTip__, new SubLObject[]{ format_nil.format_nil_d_no_copy(span_id), $str190$__ });
        final SubLObject mouseout = $str191$UnTip__;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(uri);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(mouseover);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(mouseout);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(owl_fort_human_readable_name(fort, UNPROVIDED));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != span_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(span_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str192$owl_cyc_constant_tooltip);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str193$display__none_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str194$comment_header);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(owl_fort_cyc_name(fort));
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str194$comment_header);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str195$ID___A, owl_external_id_string(fort));
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str196$comment_body);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_output_owl_fort_comment(fort, NIL);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_link_to_owl_uri_alt(SubLObject fort, SubLObject opencycP) {
        if (opencycP == UNPROVIDED) {
            opencycP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject uri = (NIL != opencycP) ? ((SubLObject) (owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : owl_cycl_to_xml.owl_cyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(uri);
                html_char(CHAR_quotation, UNPROVIDED);
                if (true) {
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt199$cyc_term);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name(fort, UNPROVIDED));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_link_to_owl_uri(final SubLObject fort, SubLObject opencycP) {
        if (opencycP == UNPROVIDED) {
            opencycP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject uri = (NIL != opencycP) ? owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED) : owl_cycl_to_xml.owl_cyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(uri);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str197$cyc_term);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(owl_fort_human_readable_name(fort, UNPROVIDED));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_link_to_owl_opencyc_uri_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject uri = owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(uri);
                html_char(CHAR_quotation, UNPROVIDED);
                if (true) {
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt199$cyc_term);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name(fort, UNPROVIDED));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_link_to_owl_opencyc_uri(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject uri = owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(uri);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str197$cyc_term);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(owl_fort_human_readable_name(fort, UNPROVIDED));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_output_owl_fort_comment_alt(SubLObject fort, SubLObject include_popupsP) {
        if (include_popupsP == UNPROVIDED) {
            include_popupsP = T;
        }
        {
            SubLObject comment = kb_accessors.comment(fort, UNPROVIDED);
            html_princ(com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_string_with_constant_references(NIL != comment ? ((SubLObject) (comment)) : $str_alt201$No_comment_, include_popupsP));
        }
        return NIL;
    }

    public static SubLObject html_output_owl_fort_comment(final SubLObject fort, SubLObject include_popupsP) {
        if (include_popupsP == UNPROVIDED) {
            include_popupsP = T;
        }
        final SubLObject comment = kb_accessors.comment(fort, UNPROVIDED);
        html_princ(owl_cyclify_string_with_constant_references(NIL != comment ? comment : $str199$No_comment_, include_popupsP));
        return NIL;
    }

    public static final SubLObject owl_subcollection_nart_p_alt(SubLObject v_object) {
        return makeBoolean((((((NIL != nart_handles.nart_p(v_object)) && (NIL != kb_accessors.subcollection_relation_function_expression_p(v_object))) && (NIL != forts.fort_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED)))) && (NIL != fort_types_interface.collection_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.nat_arg3(v_object, UNPROVIDED))));
    }

    public static SubLObject owl_subcollection_nart_p(final SubLObject v_object) {
        return makeBoolean((((((NIL != nart_handles.nart_p(v_object)) && (NIL != kb_accessors.subcollection_relation_function_expression_p(v_object))) && (NIL != forts.fort_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED)))) && (NIL != fort_types_interface.collection_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.nat_arg3(v_object, UNPROVIDED))));
    }

    public static final SubLObject owl_subcollection_asent_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject functor = unmake_ternary_formula(nart);
                SubLObject arg1 = thread.secondMultipleValue();
                SubLObject arg2 = thread.thirdMultipleValue();
                SubLObject arg3 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject property = NIL;
                    SubLObject pcase_var = functor;
                    if (pcase_var.eql($$SubcollectionOfWithRelationToFn) || pcase_var.eql($const203$SubcollectionOfWithRelationToType)) {
                        property = arg2;
                    } else {
                        if (pcase_var.eql($$SubcollectionOfWithRelationFromFn) || pcase_var.eql($const205$SubcollectionOfWithRelationFromTy)) {
                            property = com.cyc.cycjava.cycl.owl.owlification.find_inverse_binary_predicate(arg2);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == forts.fort_p(property)) {
                                    Errors.error($str_alt206$Couldn_t_find_inverse_of__S, arg2);
                                }
                            }
                        } else {
                            Errors.error($str_alt207$unexpected_subcollection_function, functor);
                        }
                    }
                    return list($$owlIntersectionOf, nart, list($$OWLIntersectionFn, arg1, list($$OWLRestrictionFn, $$owlOnProperty, property, $$owlHasValue, arg3)));
                }
            }
        }
    }

    public static SubLObject owl_subcollection_asent(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject functor = unmake_ternary_formula(nart);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject arg2 = thread.thirdMultipleValue();
        final SubLObject arg3 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject property = NIL;
        final SubLObject pcase_var = functor;
        if (pcase_var.eql($$SubcollectionOfWithRelationToFn) || pcase_var.eql($const201$SubcollectionOfWithRelationToType)) {
            property = arg2;
        } else
            if (pcase_var.eql($$SubcollectionOfWithRelationFromFn) || pcase_var.eql($const203$SubcollectionOfWithRelationFromTy)) {
                property = find_inverse_binary_predicate(arg2);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(property))) {
                    Errors.error($str204$Couldn_t_find_inverse_of__S, arg2);
                }
            } else {
                Errors.error($str205$unexpected_subcollection_function, functor);
            }

        return list($const206$owl_intersectionOf, nart, list($$OWLIntersectionFn, arg1, list($$OWLRestrictionFn, $const208$owl_onProperty, property, $const209$owl_hasValue, arg3)));
    }

    public static final SubLObject inverse_binary_predicate_sentence_alt(SubLObject predicate) {
        return list($$and, list($$genlInverse, $inverse_binary_predicate_var$.getGlobalValue(), predicate), list($$genlInverse, predicate, $inverse_binary_predicate_var$.getGlobalValue()));
    }

    public static SubLObject inverse_binary_predicate_sentence(final SubLObject predicate) {
        return list($$and, list($$genlInverse, $inverse_binary_predicate_var$.getGlobalValue(), predicate), list($$genlInverse, predicate, $inverse_binary_predicate_var$.getGlobalValue()));
    }

    public static final SubLObject find_or_create_inverse_binary_predicate_internal_alt(SubLObject predicate) {
        {
            SubLObject inverse = com.cyc.cycjava.cycl.owl.owlification.find_inverse_binary_predicate(predicate);
            if (NIL == forts.fort_p(inverse)) {
                if (NIL == isa.isaP(predicate, $$BinaryPredicate, UNPROVIDED, UNPROVIDED)) {
                    cyc_kernel.cyc_assert(listS($$isa, predicate, $list_alt217), $$UniversalVocabularyMt, UNPROVIDED);
                }
                {
                    SubLObject nat_formula = list($$InverseBinaryPredicateFn, predicate);
                    inverse = narts_high.find_nart(nat_formula);
                    if (NIL == forts.fort_p(inverse)) {
                        inverse = czer_main.cyc_find_or_create_nart(nat_formula, UNPROVIDED);
                        format(T, $str_alt220$__Created__S__, inverse);
                    }
                }
                cyc_kernel.cyc_assert(cycl_utilities.expression_subst(inverse, $inverse_binary_predicate_var$.getGlobalValue(), com.cyc.cycjava.cycl.owl.owlification.inverse_binary_predicate_sentence(predicate), UNPROVIDED, UNPROVIDED), $$UniversalVocabularyMt, UNPROVIDED);
            }
            return inverse;
        }
    }

    public static SubLObject find_or_create_inverse_binary_predicate_internal(final SubLObject predicate) {
        SubLObject inverse = find_inverse_binary_predicate(predicate);
        if (NIL == forts.fort_p(inverse)) {
            if (NIL == isa.isaP(predicate, $$BinaryPredicate, UNPROVIDED, UNPROVIDED)) {
                cyc_kernel.cyc_assert(listS($$isa, predicate, $list215), $$UniversalVocabularyMt, UNPROVIDED);
            }
            final SubLObject nat_formula = list($$InverseBinaryPredicateFn, predicate);
            inverse = narts_high.find_nart(nat_formula);
            if (NIL == forts.fort_p(inverse)) {
                inverse = czer_main.cyc_find_or_create_nart(nat_formula, UNPROVIDED);
                format(T, $str218$__Created__S__, inverse);
            }
            cyc_kernel.cyc_assert(cycl_utilities.expression_subst(inverse, $inverse_binary_predicate_var$.getGlobalValue(), inverse_binary_predicate_sentence(predicate), UNPROVIDED, UNPROVIDED), $$UniversalVocabularyMt, UNPROVIDED);
        }
        return inverse;
    }

    public static final SubLObject find_or_create_inverse_binary_predicate_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.find_or_create_inverse_binary_predicate_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.find_or_create_inverse_binary_predicate_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject find_or_create_inverse_binary_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return find_or_create_inverse_binary_predicate_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(find_or_create_inverse_binary_predicate_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject find_inverse_binary_predicate_alt(SubLObject predicate) {
        SubLTrampolineFile.enforceType(predicate, $sym221$BINARY_PREDICATE_);
        return ask_utilities.query_variable($inverse_binary_predicate_var$.getGlobalValue(), com.cyc.cycjava.cycl.owl.owlification.inverse_binary_predicate_sentence(predicate), $$UniversalVocabularyMt, $list_alt222).first();
    }

    public static SubLObject find_inverse_binary_predicate(final SubLObject predicate) {
        SubLTrampolineFile.enforceType(predicate, $sym219$BINARY_PREDICATE_);
        return ask_utilities.query_variable($inverse_binary_predicate_var$.getGlobalValue(), inverse_binary_predicate_sentence(predicate), $$UniversalVocabularyMt, $list220).first();
    }

    public static final SubLObject owl_cyclify_intersection_alt(SubLObject naut) {
        {
            SubLObject datum = naut;
            SubLObject current = datum;
            SubLObject owl_intersection_fn = NIL;
            SubLObject v_class = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt223);
            owl_intersection_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt223);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt223);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject owl_restriction_fn = NIL;
                    SubLObject owl_on_property = NIL;
                    SubLObject property = NIL;
                    SubLObject owl_has_value = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt223);
                    owl_restriction_fn = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt223);
                    owl_on_property = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt223);
                    property = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt223);
                    owl_has_value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt223);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        if (NIL == current) {
                            return list($$OWLIntersectionFn, com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(v_class), list($$OWLRestrictionFn, $str_alt224$owl_Restriction, $str_alt225$owl_onProperty, com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_intersection_property(property), $str_alt226$owl_hasValue, com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg2(value, property)));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt223);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt223);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject owl_cyclify_intersection(final SubLObject naut) {
        SubLObject owl_intersection_fn = NIL;
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(naut, naut, $list221);
        owl_intersection_fn = naut.first();
        SubLObject current = naut.rest();
        destructuring_bind_must_consp(current, naut, $list221);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, naut, $list221);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject owl_restriction_fn = NIL;
        SubLObject owl_on_property = NIL;
        SubLObject property = NIL;
        SubLObject owl_has_value = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, naut, $list221);
        owl_restriction_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, naut, $list221);
        owl_on_property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, naut, $list221);
        property = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, naut, $list221);
        owl_has_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, naut, $list221);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            if (NIL == current) {
                return list($$OWLIntersectionFn, owl_cyclify_arg1(v_class), list($$OWLRestrictionFn, $str222$owl_Restriction, $str223$owl_onProperty, owl_cyclify_intersection_property(property), $str224$owl_hasValue, owl_cyclify_arg2(value, property)));
            }
            cdestructuring_bind_error(naut, $list221);
        } else {
            cdestructuring_bind_error(naut, $list221);
        }
        return NIL;
    }

    public static final SubLObject owl_cyclify_intersection_property_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        return com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg2(fort, NIL);
    }

    public static SubLObject owl_cyclify_intersection_property(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return owl_cyclify_arg2(fort, NIL);
    }

    public static final SubLObject owl_term_type_alt(SubLObject v_term) {
        SubLTrampolineFile.enforceType(v_term, $sym149$OWLIFIABLE_ARG1_);
        if (NIL != atomic_sentenceP(v_term)) {
            return rdf_utilities.rdf_name($$$Statement);
        } else {
            return com.cyc.cycjava.cycl.owl.owlification.owl_fort_type(v_term);
        }
    }

    public static SubLObject owl_term_type(final SubLObject v_term) {
        SubLTrampolineFile.enforceType(v_term, $sym147$OWLIFIABLE_ARG1_);
        if (NIL != atomic_sentenceP(v_term)) {
            return rdf_utilities.rdf_name($$$Statement);
        }
        return owl_fort_type(v_term);
    }

    public static final SubLObject owl_fort_type_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject best_isa = com.cyc.cycjava.cycl.owl.owlification.best_isa_for_term(fort);
            return NIL != best_isa ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.owl_type_name(best_isa))) : rdf_utilities.rdf_name($$$Description);
        }
    }

    public static SubLObject owl_fort_type(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        final SubLObject best_isa = best_isa_for_term(fort);
        return NIL != best_isa ? owl_type_name(best_isa) : rdf_utilities.rdf_name($$$Description);
    }

    public static final SubLObject best_isa_for_term_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
                return com.cyc.cycjava.cycl.owl.owlification.best_isa_for_term_from_asents_to_export(fort);
            } else {
                if (NIL != fort_types_interface.collection_p(fort)) {
                    return $$Collection;
                } else {
                    if (NIL != kb_accessors.binary_predicateP(fort)) {
                        return $$BinaryPredicate;
                    } else {
                        return com.cyc.cycjava.cycl.owl.owlification.best_isa_for_individual(fort);
                    }
                }
            }
        }
    }

    public static SubLObject best_isa_for_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($owl_asents_to_export$.getDynamicValue(thread))) {
            return best_isa_for_term_from_asents_to_export(fort);
        }
        if (NIL != fort_types_interface.collection_p(fort)) {
            return $$Collection;
        }
        if (NIL != kb_accessors.binary_predicateP(fort)) {
            return $$BinaryPredicate;
        }
        return best_isa_for_individual(fort);
    }

    public static final SubLObject best_isa_for_individual_internal_alt(SubLObject individual) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isas = isa.all_isa(individual, UNPROVIDED, UNPROVIDED);
                SubLObject best_isa = isas.first();
                if (NIL == best_isa) {
                    return $$Thing;
                }
                if ((NIL != list_utilities.singletonP(isas)) && (NIL != constant_p(best_isa))) {
                    return best_isa;
                }
                {
                    SubLObject candidate_isas = list_utilities.remove_if_not(CONSTANT_P, isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == candidate_isas) {
                        return best_isa;
                    } else {
                        if (NIL != list_utilities.singletonP(candidate_isas)) {
                            return list_utilities.only_one(candidate_isas);
                        } else {
                            {
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($owl_export_mt$.getDynamicValue(thread));
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        best_isa = genls.min_col(candidate_isas, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            return best_isa;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject best_isa_for_individual_internal(final SubLObject individual) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isas = isa.all_isa(individual, UNPROVIDED, UNPROVIDED);
        SubLObject best_isa = isas.first();
        if (NIL == best_isa) {
            return $$Thing;
        }
        if ((NIL != list_utilities.singletonP(isas)) && (NIL != constant_p(best_isa))) {
            return best_isa;
        }
        final SubLObject candidate_isas = list_utilities.remove_if_not(CONSTANT_P, isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == candidate_isas) {
            return best_isa;
        }
        if (NIL != list_utilities.singletonP(candidate_isas)) {
            return list_utilities.only_one(candidate_isas);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($owl_export_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            best_isa = genls.min_col(candidate_isas, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return best_isa;
    }

    public static final SubLObject best_isa_for_individual_alt(SubLObject individual) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.best_isa_for_individual_internal(individual);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, BEST_ISA_FOR_INDIVIDUAL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), BEST_ISA_FOR_INDIVIDUAL, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, BEST_ISA_FOR_INDIVIDUAL, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, individual, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.best_isa_for_individual_internal(individual)));
                        memoization_state.caching_state_put(caching_state, individual, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject best_isa_for_individual(final SubLObject individual) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return best_isa_for_individual_internal(individual);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, BEST_ISA_FOR_INDIVIDUAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), BEST_ISA_FOR_INDIVIDUAL, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, BEST_ISA_FOR_INDIVIDUAL, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, individual, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(best_isa_for_individual_internal(individual)));
            memoization_state.caching_state_put(caching_state, individual, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject best_isa_for_term_from_asents_to_export_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_asents = dictionary.dictionary_lookup_without_values($owl_asents_to_export$.getDynamicValue(thread), fort, NIL);
                SubLObject isa_lits = nconc(list_utilities.find_all($$isa, all_asents, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE)), list_utilities.find_all($$rdf_type, all_asents, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE)));
                SubLObject all_isas = Mapping.mapcar(ATOMIC_SENTENCE_ARG2, isa_lits);
                if (NIL != subl_promotions.memberP($$Collection, all_isas, UNPROVIDED, UNPROVIDED)) {
                    return $$Collection;
                } else {
                    if (NIL != subl_promotions.memberP($$BinaryPredicate, all_isas, UNPROVIDED, UNPROVIDED)) {
                        return $$BinaryPredicate;
                    } else {
                        return genls.min_cols(all_isas, UNPROVIDED, UNPROVIDED).first();
                    }
                }
            }
        }
    }

    public static SubLObject best_isa_for_term_from_asents_to_export(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_asents = dictionary.dictionary_lookup_without_values($owl_asents_to_export$.getDynamicValue(thread), fort, NIL);
        final SubLObject isa_lits = nconc(list_utilities.find_all($$isa, all_asents, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE)), list_utilities.find_all($$rdf_type, all_asents, symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE)));
        final SubLObject all_isas = Mapping.mapcar(ATOMIC_SENTENCE_ARG2, isa_lits);
        if (NIL != subl_promotions.memberP($$Collection, all_isas, UNPROVIDED, UNPROVIDED)) {
            return $$Collection;
        }
        if (NIL != subl_promotions.memberP($$BinaryPredicate, all_isas, UNPROVIDED, UNPROVIDED)) {
            return $$BinaryPredicate;
        }
        return genls.min_cols(all_isas, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject with_owl_pph_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != find($CYC_PPH, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bq_cons(WITH_PPH_MEMOIZATION, append(body, NIL));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    /**
     * The canonical OWL string for TERM.
     */
    @LispMethod(comment = "The canonical OWL string for TERM.")
    public static final SubLObject owl_term_string_alt(SubLObject v_term, SubLObject local_part_onlyP) {
        if (local_part_onlyP == UNPROVIDED) {
            local_part_onlyP = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return com.cyc.cycjava.cycl.owl.owlification.owl_fort_name(v_term, local_part_onlyP, UNPROVIDED);
        } else {
            return com.cyc.cycjava.cycl.owl.owlification.owl_non_fort_string(v_term);
        }
    }

    /**
     * The canonical OWL string for TERM.
     */
    @LispMethod(comment = "The canonical OWL string for TERM.")
    public static SubLObject owl_term_string(final SubLObject v_term, SubLObject local_part_onlyP) {
        if (local_part_onlyP == UNPROVIDED) {
            local_part_onlyP = NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return owl_fort_name(v_term, local_part_onlyP, UNPROVIDED);
        }
        return owl_non_fort_string(v_term);
    }

    /**
     * The canonical OWL name of FORT.
     */
    @LispMethod(comment = "The canonical OWL name of FORT.")
    public static final SubLObject owl_fort_name_alt(SubLObject fort, SubLObject local_part_onlyP, SubLObject default_namespace_or_cyc_onlyP) {
        if (local_part_onlyP == UNPROVIDED) {
            local_part_onlyP = NIL;
        }
        if (default_namespace_or_cyc_onlyP == UNPROVIDED) {
            default_namespace_or_cyc_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            if (fort.eql($$rdf_type) && (!((NIL != local_part_onlyP) || (NIL != default_namespace_or_cyc_onlyP)))) {
                return rdf_utilities.rdf_expanded_name($$$type);
            }
            {
                SubLObject asserted_default_namespace_name = com.cyc.cycjava.cycl.owl.owlification.asserted_name_in_namespace(fort, owl_uris_and_prefixes.owl_export_default_namespace(), $owl_export_mt$.getDynamicValue(thread));
                SubLObject asserted_uri = (((NIL != local_part_onlyP) || (NIL != asserted_default_namespace_name)) || (NIL != default_namespace_or_cyc_onlyP)) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.owl.owlification.asserted_uri_in_entity_map_namespace(fort);
                if (NIL != asserted_default_namespace_name) {
                    return NIL != local_part_onlyP ? ((SubLObject) (asserted_default_namespace_name)) : cconcatenate(owl_uris_and_prefixes.owl_export_default_namespace(), asserted_default_namespace_name);
                } else {
                    if (NIL != asserted_uri) {
                        return asserted_uri;
                    } else {
                        if ((NIL == owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue(thread)) && (NIL == local_part_onlyP)) {
                            return NIL != owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP(fort) ? ((SubLObject) (owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : owl_cycl_to_xml.owl_cyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (NIL == local_part_onlyP) {
                                Errors.error($str_alt235$Need_full_URI_for__S, fort);
                            } else {
                                if (NIL != $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                                    return com.cyc.cycjava.cycl.owl.owlification.owl_external_id_string(fort);
                                } else {
                                    return com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name(fort, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * The canonical OWL name of FORT.
     */
    @LispMethod(comment = "The canonical OWL name of FORT.")
    public static SubLObject owl_fort_name(final SubLObject fort, SubLObject local_part_onlyP, SubLObject default_namespace_or_cyc_onlyP) {
        if (local_part_onlyP == UNPROVIDED) {
            local_part_onlyP = NIL;
        }
        if (default_namespace_or_cyc_onlyP == UNPROVIDED) {
            default_namespace_or_cyc_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if ((fort.eql($$rdf_type) && (NIL == local_part_onlyP)) && (NIL == default_namespace_or_cyc_onlyP)) {
            return rdf_utilities.rdf_expanded_name($$$type);
        }
        final SubLObject asserted_name_in_ontology = (NIL != $owl_export_ontology$.getDynamicValue(thread)) ? asserted_name_in_ontology(fort, $owl_export_ontology$.getDynamicValue(thread), $owl_export_mt$.getDynamicValue(thread)) : NIL;
        final SubLObject asserted_default_namespace_name = asserted_name_in_namespace(fort, owl_uris_and_prefixes.owl_export_default_namespace(), $owl_export_mt$.getDynamicValue(thread));
        final SubLObject asserted_uri = (((NIL != local_part_onlyP) || (NIL != asserted_default_namespace_name)) || (NIL != default_namespace_or_cyc_onlyP)) ? NIL : asserted_uri_in_entity_map_namespace(fort);
        if (((NIL != asserted_name_in_ontology) && (NIL == local_part_onlyP)) && (NIL == default_namespace_or_cyc_onlyP)) {
            return asserted_name_in_ontology;
        }
        if (NIL != asserted_default_namespace_name) {
            return NIL != local_part_onlyP ? asserted_default_namespace_name : cconcatenate(owl_uris_and_prefixes.owl_export_default_namespace(), asserted_default_namespace_name);
        }
        if (NIL != asserted_uri) {
            return asserted_uri;
        }
        if (NIL == local_part_onlyP) {
            return (NIL != owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue(thread)) || (NIL != owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP(fort)) ? owl_cycl_to_xml.owl_opencyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED) : owl_cycl_to_xml.owl_cyc_uri_for_fort(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
            return owl_external_id_string(fort);
        }
        return owl_fort_human_readable_name(fort, UNPROVIDED);
    }

    public static SubLObject asserted_name_in_ontology(final SubLObject v_term, final SubLObject ontology, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uri = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == uri) {
                SubLObject csome_list_var = kb_mapping_utilities.pred_value_tuples(v_term, $$synonymousExternalConcept, ONE_INTEGER, $list237, UNPROVIDED);
                SubLObject tuple = NIL;
                tuple = csome_list_var.first();
                while ((NIL == uri) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject asserted_ontology = NIL;
                    SubLObject possible_uri = NIL;
                    destructuring_bind_must_consp(current, datum, $list236);
                    asserted_ontology = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list236);
                    possible_uri = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (asserted_ontology.equal(ontology)) {
                            if (NIL != web_utilities.uri_p(possible_uri, UNPROVIDED)) {
                                uri = possible_uri;
                            } else {
                                possible_uri = cconcatenate(ontology_uri(ontology), new SubLObject[]{ $str180$_, possible_uri });
                            }
                            if (NIL != web_utilities.uri_p(possible_uri, UNPROVIDED)) {
                                uri = possible_uri;
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list236);
                    }
                    csome_list_var = csome_list_var.rest();
                    tuple = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return uri;
    }

    public static final SubLObject asserted_name_in_namespace_alt(SubLObject v_term, SubLObject namespace, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, INDEXED_TERM_P);
            SubLTrampolineFile.checkType(namespace, STRINGP);
            {
                SubLObject uri = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == uri) {
                            {
                                SubLObject csome_list_var = kb_mapping_utilities.pred_values(v_term, $$rdfURI, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                SubLObject this_uri = NIL;
                                for (this_uri = csome_list_var.first(); !((NIL != uri) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , this_uri = csome_list_var.first()) {
                                    if (this_uri.isString() && (NIL != string_utilities.starts_with(this_uri, namespace))) {
                                        uri = this_uri;
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != uri ? ((SubLObject) (string_utilities.pre_remove(uri, namespace, UNPROVIDED))) : NIL;
            }
        }
    }

    public static SubLObject asserted_name_in_namespace(final SubLObject v_term, final SubLObject namespace, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "! kb_indexing_datastructures.indexed_term_p(v_term) " + ("kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) ") + v_term;
        assert NIL != stringp(namespace) : "! stringp(namespace) " + ("Types.stringp(namespace) " + "CommonSymbols.NIL != Types.stringp(namespace) ") + namespace;
        SubLObject uri = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == uri) {
                SubLObject csome_list_var = kb_mapping_utilities.pred_values(v_term, $$rdfURI, ONE_INTEGER, TWO_INTEGER, $TRUE);
                SubLObject this_uri = NIL;
                this_uri = csome_list_var.first();
                while ((NIL == uri) && (NIL != csome_list_var)) {
                    if (this_uri.isString() && (NIL != string_utilities.starts_with(this_uri, namespace))) {
                        uri = this_uri;
                    }
                    csome_list_var = csome_list_var.rest();
                    this_uri = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL != uri ? string_utilities.pre_remove(uri, namespace, UNPROVIDED) : NIL;
    }

    public static final SubLObject asserted_uri_in_entity_map_namespace_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, INDEXED_TERM_P);
            {
                SubLObject uri = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        if (NIL == uri) {
                            {
                                SubLObject csome_list_var = kb_mapping_utilities.pred_values(v_term, $$rdfURI, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                SubLObject this_uri = NIL;
                                for (this_uri = csome_list_var.first(); !((NIL != uri) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , this_uri = csome_list_var.first()) {
                                    if (this_uri.isString() && (NIL != owl_uris_and_prefixes.uri_in_entity_map_namespaceP(this_uri))) {
                                        uri = this_uri;
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return uri;
            }
        }
    }

    public static SubLObject asserted_uri_in_entity_map_namespace(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "! kb_indexing_datastructures.indexed_term_p(v_term) " + ("kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) ") + v_term;
        SubLObject uri = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if (NIL == uri) {
                SubLObject csome_list_var = kb_mapping_utilities.pred_values(v_term, $$rdfURI, ONE_INTEGER, TWO_INTEGER, $TRUE);
                SubLObject this_uri = NIL;
                this_uri = csome_list_var.first();
                while ((NIL == uri) && (NIL != csome_list_var)) {
                    if (this_uri.isString() && (NIL != owl_uris_and_prefixes.uri_in_entity_map_namespaceP(this_uri))) {
                        uri = this_uri;
                    }
                    csome_list_var = csome_list_var.rest();
                    this_uri = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return uri;
    }

    /**
     * Generate a human-readable, OWL-compliant name for FORT.
     *
     * @param GENERATE-PHRASE?
     * 		booleanp; whether we can use NL PPH code to generate the human-readable name.
     * 		Can be set to NIL to avoid infinite recursion when used as a PPH fallback.
     */
    @LispMethod(comment = "Generate a human-readable, OWL-compliant name for FORT.\r\n\r\n@param GENERATE-PHRASE?\r\n\t\tbooleanp; whether we can use NL PPH code to generate the human-readable name.\r\n\t\tCan be set to NIL to avoid infinite recursion when used as a PPH fallback.")
    public static final SubLObject owl_fort_human_readable_name_internal_alt(SubLObject fort, SubLObject generate_phraseP) {
        if (generate_phraseP == UNPROVIDED) {
            generate_phraseP = T;
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject name = (NIL != constant_p(fort)) ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.sanitize_owl_name(constants_high.constant_name(fort)))) : com.cyc.cycjava.cycl.owl.owlification.owl_nart_name(fort, generate_phraseP);
            if (NIL == com.cyc.cycjava.cycl.owl.owlification.valid_rdf_name_start_char_p(string_utilities.first_char(name))) {
                name = cconcatenate($rdf_name_invalid_start_char_prefix$.getGlobalValue(), name);
            }
            return com.cyc.cycjava.cycl.owl.owlification.uniquify_and_note_owl_fort_name(name, fort, UNPROVIDED);
        }
    }

    /**
     * Generate a human-readable, OWL-compliant name for FORT.
     *
     * @param GENERATE-PHRASE?
     * 		booleanp; whether we can use NL PPH code to generate the human-readable name.
     * 		Can be set to NIL to avoid infinite recursion when used as a PPH fallback.
     */
    @LispMethod(comment = "Generate a human-readable, OWL-compliant name for FORT.\r\n\r\n@param GENERATE-PHRASE?\r\n\t\tbooleanp; whether we can use NL PPH code to generate the human-readable name.\r\n\t\tCan be set to NIL to avoid infinite recursion when used as a PPH fallback.")
    public static SubLObject owl_fort_human_readable_name_internal(final SubLObject fort, SubLObject generate_phraseP) {
        if (generate_phraseP == UNPROVIDED) {
            generate_phraseP = T;
        }
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject name = (NIL != constant_p(fort)) ? sanitize_owl_name(constants_high.constant_name(fort)) : owl_nart_name(fort, generate_phraseP);
        if (((NIL != nart_handles.nart_p(fort)) && (NIL != generate_phraseP)) && (NIL != string_utilities.empty_string_p(name))) {
            name = owl_nart_name(fort, NIL);
        }
        if (NIL == valid_rdf_name_start_char_p(string_utilities.first_char(name))) {
            name = cconcatenate($rdf_name_invalid_start_char_prefix$.getGlobalValue(), name);
        }
        return uniquify_and_note_owl_fort_name(name, fort, UNPROVIDED);
    }

    public static final SubLObject owl_fort_human_readable_name_alt(SubLObject fort, SubLObject generate_phraseP) {
        if (generate_phraseP == UNPROVIDED) {
            generate_phraseP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name_internal(fort, generate_phraseP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_FORT_HUMAN_READABLE_NAME, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_FORT_HUMAN_READABLE_NAME, TWO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_FORT_HUMAN_READABLE_NAME, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(fort, generate_phraseP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (fort.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && generate_phraseP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name_internal(fort, generate_phraseP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, generate_phraseP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject owl_fort_human_readable_name(final SubLObject fort, SubLObject generate_phraseP) {
        if (generate_phraseP == UNPROVIDED) {
            generate_phraseP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_fort_human_readable_name_internal(fort, generate_phraseP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_FORT_HUMAN_READABLE_NAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_FORT_HUMAN_READABLE_NAME, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_FORT_HUMAN_READABLE_NAME, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, generate_phraseP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && generate_phraseP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_fort_human_readable_name_internal(fort, generate_phraseP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, generate_phraseP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject valid_rdf_name_start_char_p_alt(SubLObject v_char) {
        if (NIL != alpha_char_p(v_char)) {
            return T;
        } else {
            if (NIL != find(v_char, $list_alt240, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject valid_rdf_name_start_char_p(final SubLObject v_char) {
        if (NIL != alpha_char_p(v_char)) {
            return T;
        }
        if (NIL != find(v_char, $list242, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     * The name of a term when it is in the type (immediately after open bracket) position
     */
    @LispMethod(comment = "The name of a term when it is in the type (immediately after open bracket) position")
    public static final SubLObject owl_type_name_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject reserved_name = list_utilities.alist_lookup($owl_cycl_type_table$.getGlobalValue(), fort, UNPROVIDED, UNPROVIDED);
            return NIL != reserved_name ? ((SubLObject) (reserved_name)) : com.cyc.cycjava.cycl.owl.owlification.owl_fort_name(fort, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * The name of a term when it is in the type (immediately after open bracket) position
     */
    @LispMethod(comment = "The name of a term when it is in the type (immediately after open bracket) position")
    public static SubLObject owl_type_name(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        final SubLObject reserved_name = list_utilities.alist_lookup($owl_cycl_type_table$.getGlobalValue(), fort, UNPROVIDED, UNPROVIDED);
        return NIL != reserved_name ? reserved_name : owl_fort_name(fort, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Generate the name for the <humanReadableName> property.
     *
     * @param GENERATE-PHRASE?
     * 		booleanp; whether we can use NL PPH code to generate the human-readable name.
     * 		Can be set to NIL to avoid infinite recursion when used as a PPH fallback.
     */
    @LispMethod(comment = "Generate the name for the <humanReadableName> property.\r\n\r\n@param GENERATE-PHRASE?\r\n\t\tbooleanp; whether we can use NL PPH code to generate the human-readable name.\r\n\t\tCan be set to NIL to avoid infinite recursion when used as a PPH fallback.")
    public static final SubLObject owl_fort_cyc_name_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        } else {
            return com.cyc.cycjava.cycl.owl.owlification.strip_hl_artifacts(com.cyc.cycjava.cycl.owl.owlification.owl_str_with_quotes_allowed(fort));
        }
    }

    /**
     * Generate the name for the <humanReadableName> property.
     *
     * @param GENERATE-PHRASE?
     * 		booleanp; whether we can use NL PPH code to generate the human-readable name.
     * 		Can be set to NIL to avoid infinite recursion when used as a PPH fallback.
     */
    @LispMethod(comment = "Generate the name for the <humanReadableName> property.\r\n\r\n@param GENERATE-PHRASE?\r\n\t\tbooleanp; whether we can use NL PPH code to generate the human-readable name.\r\n\t\tCan be set to NIL to avoid infinite recursion when used as a PPH fallback.")
    public static SubLObject owl_fort_cyc_name(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return strip_hl_artifacts(owl_str_with_quotes_allowed(fort));
    }

    /**
     * The canonical OWL string for NON-FORT.
     */
    @LispMethod(comment = "The canonical OWL string for NON-FORT.")
    public static final SubLObject owl_non_fort_string_alt(SubLObject non_fort) {
        SubLTrampolineFile.checkType(non_fort, NON_FORT_P);
        if (non_fort.isString()) {
            return non_fort;
        } else {
            if (NIL != possibly_naut_p(non_fort)) {
                return com.cyc.cycjava.cycl.owl.owlification.strip_hl_artifacts(com.cyc.cycjava.cycl.owl.owlification.owl_str_with_quotes_allowed(non_fort));
            } else {
                if (non_fort.isNumber()) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_str(non_fort);
                } else {
                    if (non_fort.isKeyword()) {
                        return com.cyc.cycjava.cycl.owl.owlification.owl_str(non_fort);
                    } else {
                        Errors.warn($str_alt242$unexpected_term__s, non_fort);
                        return com.cyc.cycjava.cycl.owl.owlification.owl_str(non_fort);
                    }
                }
            }
        }
    }

    /**
     * The canonical OWL string for NON-FORT.
     */
    @LispMethod(comment = "The canonical OWL string for NON-FORT.")
    public static SubLObject owl_non_fort_string(final SubLObject non_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.non_fort_p(non_fort) : "! forts.non_fort_p(non_fort) " + ("forts.non_fort_p(non_fort) " + "CommonSymbols.NIL != forts.non_fort_p(non_fort) ") + non_fort;
        if (non_fort.isString()) {
            return non_fort;
        }
        if (NIL != possibly_naut_p(non_fort)) {
            if (NIL != $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                return owl_external_id_string(non_fort);
            }
            return strip_hl_artifacts(owl_str_with_quotes_allowed(non_fort));
        } else
            if (non_fort.isNumber()) {
                if (NIL != $owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                    return kb_utilities.compact_hl_external_id_string(non_fort);
                }
                return owl_str(non_fort);
            } else {
                if (non_fort.isKeyword()) {
                    return owl_str(non_fort);
                }
                Errors.warn($str244$unexpected_term__s, non_fort);
                return owl_str(non_fort);
            }

    }

    /**
     * The name used to determine the sort order, after the list of terms has been sorted by type.
     */
    @LispMethod(comment = "The name used to determine the sort order, after the list of terms has been sorted by type.")
    public static final SubLObject owl_sort_name_alt(SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            return constants_high.constant_name(v_term);
        } else {
            if (NIL != nart_handles.nart_p(v_term)) {
                return com.cyc.cycjava.cycl.owl.owlification.owl_nart_sort_string(v_term);
            } else {
                return com.cyc.cycjava.cycl.owl.owlification.owl_non_fort_string(v_term);
            }
        }
    }

    /**
     * The name used to determine the sort order, after the list of terms has been sorted by type.
     */
    @LispMethod(comment = "The name used to determine the sort order, after the list of terms has been sorted by type.")
    public static SubLObject owl_sort_name(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            return constants_high.constant_name(v_term);
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            return owl_nart_sort_string(v_term);
        }
        return owl_non_fort_string(v_term);
    }

    /**
     * The string for the skos:prefLabel tag
     */
    @LispMethod(comment = "The string for the skos:prefLabel tag")
    public static final SubLObject owl_preferred_english_for_term_alt(SubLObject fort) {
        {
            SubLObject phrase = com.cyc.cycjava.cycl.owl.owlification.owl_get_generated_phrase(fort);
            SubLObject uniquifyP = NIL;
            return NIL != uniquifyP ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.uniquify_and_note_owl_fort_name(phrase, fort, $PREFERRED_NAME))) : phrase;
        }
    }

    /**
     * The string for the skos:prefLabel tag
     */
    @LispMethod(comment = "The string for the skos:prefLabel tag")
    public static SubLObject owl_preferred_english_for_term(final SubLObject fort) {
        final SubLObject phrase = owl_get_generated_phrase(fort);
        final SubLObject uniquifyP = NIL;
        return NIL != uniquifyP ? uniquify_and_note_owl_fort_name(phrase, fort, $PREFERRED_NAME) : phrase;
    }

    public static SubLObject owl_get_pretty_string_canonical(final SubLObject v_term) {
        return pph_utilities.get_pretty_string_canonical(v_term);
    }

    public static SubLObject owl_get_all_pretty_strings(final SubLObject v_term) {
        return pph_utilities.get_all_pretty_strings(v_term);
    }

    /**
     * The strings for the skos:altLabel tag
     */
    @LispMethod(comment = "The strings for the skos:altLabel tag")
    public static final SubLObject owl_other_english_for_term_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $owl_export_from_opencyc_kbP$.getDynamicValue(thread)) {
                return kb_mapping_utilities.pred_values(fort, $$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                {
                    SubLObject phrases = NIL;
                    SubLObject timed_outP = NIL;
                    SubLObject tag = with_timeout_make_tag();
                    try {
                        {
                            SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                {
                                    SubLObject timer = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_37 = $with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = with_timeout_start_timer($int$60, tag);
                                                {
                                                    SubLObject _prev_bind_0_38 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                        pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time($int$30), thread);
                                                        pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                                                        pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                                                        if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                                            phrases = pph_methods_lexicon.all_phrases_for_term(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        timed_outP = pph_macros.pph_timeout_time_reachedP();
                                                    } finally {
                                                        pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                                        pph_macros.$pph_timeout_time$.rebind(_prev_bind_1, thread);
                                                        pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_38, thread);
                                                    }
                                                }
                                            } finally {
                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                with_timeout_stop_timer(timer);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                    }
                    if (NIL != timed_outP) {
                        Errors.warn($str_alt246$Timed_out_generating_phrases_for_, fort, phrases);
                    }
                    return phrases;
                }
            }
        }
    }

    /**
     * The strings for the skos:altLabel tag
     */
    @LispMethod(comment = "The strings for the skos:altLabel tag")
    public static SubLObject owl_other_english_for_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_export_from_opencyc_kbP$.getDynamicValue(thread)) {
            return kb_mapping_utilities.pred_values(fort, $$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject phrases = NIL;
        SubLObject timed_outP = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$38 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer($int$60, tag);
                        final SubLObject _prev_bind_0_$39 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                        try {
                            pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time($int$30), thread);
                            pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                            pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                            if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                phrases = pph_methods_lexicon.all_phrases_for_term(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            timed_outP = pph_macros.pph_timeout_time_reachedP();
                        } finally {
                            pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
                            pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$39, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$38, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != timed_outP) {
            Errors.warn($str248$Timed_out_generating_phrases_for_, fort, phrases);
        }
        return phrases;
    }

    public static final SubLObject possibly_initialize_owl_export_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != misc_utilities.uninitialized_p($fort_owl_name_table$.getDynamicValue(thread))) || (NIL != misc_utilities.uninitialized_p($fort_owl_name_counter$.getDynamicValue(thread)))) {
                return com.cyc.cycjava.cycl.owl.owlification.clear_owl_export_state();
            }
            return NIL;
        }
    }

    public static SubLObject possibly_initialize_owl_export_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != misc_utilities.uninitialized_p($fort_owl_name_table$.getDynamicValue(thread))) || (NIL != misc_utilities.uninitialized_p($fort_owl_name_counter$.getDynamicValue(thread)))) {
            return clear_owl_export_state();
        }
        return NIL;
    }

    public static final SubLObject clear_owl_export_state_alt() {
        $fort_owl_name_table$.setDynamicValue(make_hash_table($owl_expected_nart_count$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED));
        $fort_owl_name_counter$.setDynamicValue(ONE_INTEGER);
        com.cyc.cycjava.cycl.owl.owlification.initialize_owl_span_id_counter();
        return NIL;
    }

    public static SubLObject clear_owl_export_state() {
        $fort_owl_name_table$.setDynamicValue(make_hash_table($owl_expected_nart_count$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED));
        $fort_owl_name_counter$.setDynamicValue(ONE_INTEGER);
        initialize_owl_span_id_counter();
        return NIL;
    }

    public static final SubLObject owl_cyclify_synonymous_external_concept_asent_alt(SubLObject asent) {
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject this_term = NIL;
            SubLObject ontology = NIL;
            SubLObject local_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt247);
            this_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt247);
            ontology = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt247);
            local_name = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject uri = (NIL != find(CHAR_colon, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.expand_prefixed_owl_reference(ontology, local_name))) : com.cyc.cycjava.cycl.owl.owlification.owl_uri_from_ontology_and_local_name(ontology, local_name);
                    SubLObject inverseP = el_formula_with_operator_p(asent, $$synonymousExternalPred_Inverse);
                    return NIL != web_utilities.uri_p(uri, UNPROVIDED) ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_synonymous_external_term(this_term, uri, inverseP))) : NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt247);
            }
        }
        return NIL;
    }

    public static SubLObject owl_cyclify_synonymous_external_concept_asent(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject this_term = NIL;
        SubLObject ontology = NIL;
        SubLObject local_name = NIL;
        destructuring_bind_must_consp(current, datum, $list249);
        this_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list249);
        ontology = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list249);
        local_name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject uri = (NIL != find(CHAR_colon, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? expand_prefixed_owl_reference(ontology, local_name) : owl_uri_from_ontology_and_local_name(ontology, local_name);
            final SubLObject inverseP = el_formula_with_operator_p(asent, $$synonymousExternalPred_Inverse);
            return NIL != web_utilities.uri_p(uri, UNPROVIDED) ? owl_cyclify_synonymous_external_term(this_term, uri, inverseP) : NIL;
        }
        cdestructuring_bind_error(datum, $list249);
        return NIL;
    }

    public static final SubLObject expand_prefixed_owl_reference_alt(SubLObject ontology, SubLObject prefixed_name) {
        {
            SubLObject tokens = string_utilities.string_tokenize(prefixed_name, $list_alt249, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject uri = NIL;
            SubLObject expanded = NIL;
            if (NIL != list_utilities.doubletonP(tokens)) {
                {
                    SubLObject datum = tokens;
                    SubLObject current = datum;
                    SubLObject prefix = NIL;
                    SubLObject local_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt250);
                    prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt250);
                    local_name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        uri = com.cyc.cycjava.cycl.owl.owlification.uri_for_prefix_and_ontology(prefix, ontology);
                        if (NIL != uri) {
                            expanded = cconcatenate(uri, local_name);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt250);
                    }
                }
            }
            return expanded;
        }
    }

    public static SubLObject expand_prefixed_owl_reference(final SubLObject ontology, final SubLObject prefixed_name) {
        final SubLObject tokens = string_utilities.string_tokenize(prefixed_name, $list251, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject uri = NIL;
        SubLObject expanded = NIL;
        if (NIL != list_utilities.doubletonP(tokens)) {
            SubLObject current;
            final SubLObject datum = current = tokens;
            SubLObject prefix = NIL;
            SubLObject local_name = NIL;
            destructuring_bind_must_consp(current, datum, $list252);
            prefix = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list252);
            local_name = current.first();
            current = current.rest();
            if (NIL == current) {
                uri = uri_for_prefix_and_ontology(prefix, ontology);
                if (NIL != uri) {
                    expanded = cconcatenate(uri, local_name);
                }
            } else {
                cdestructuring_bind_error(datum, $list252);
            }
        }
        return expanded;
    }

    public static final SubLObject uri_for_prefix_and_ontology_internal_alt(SubLObject prefix, SubLObject ontology) {
        {
            SubLObject var = $X;
            SubLObject v_properties = $list_alt253;
            SubLObject uri = ask_utilities.query_variable(var, list($$nameSpacePrefixForSKS, ontology, prefix, var), $$InferencePSC, v_properties).first();
            if (NIL == uri) {
                uri = ask_utilities.query_variable(var, list($$standardPrefixForURI, prefix, var), $$InferencePSC, v_properties).first();
            }
            if (NIL != cycl_grammar.cycl_nat_p(uri)) {
                uri = cycl_utilities.nat_arg1(uri, UNPROVIDED);
            }
            if (NIL == web_utilities.uri_p(uri, UNPROVIDED)) {
                Errors.warn($str_alt256$Couldn_t_find_expansion_for__S_wr, prefix, ontology);
            }
            return NIL != web_utilities.uri_p(uri, UNPROVIDED) ? ((SubLObject) (uri)) : NIL;
        }
    }

    public static SubLObject uri_for_prefix_and_ontology_internal(final SubLObject prefix, final SubLObject ontology) {
        final SubLObject var = $X;
        final SubLObject v_properties = $list255;
        SubLObject uri = ask_utilities.query_variable(var, list($$nameSpacePrefixForSKS, ontology, prefix, var), $$InferencePSC, v_properties).first();
        if (NIL == uri) {
            uri = ask_utilities.query_variable(var, list($$standardPrefixForURI, prefix, var), $$InferencePSC, v_properties).first();
        }
        if (NIL != cycl_grammar.cycl_nat_p(uri)) {
            uri = cycl_utilities.nat_arg1(uri, UNPROVIDED);
        }
        if (NIL == web_utilities.uri_p(uri, UNPROVIDED)) {
            Errors.warn($str258$Couldn_t_find_expansion_for__S_wr, prefix, ontology);
        }
        return NIL != web_utilities.uri_p(uri, UNPROVIDED) ? uri : NIL;
    }

    public static final SubLObject uri_for_prefix_and_ontology_alt(SubLObject prefix, SubLObject ontology) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.uri_for_prefix_and_ontology_internal(prefix, ontology);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, URI_FOR_PREFIX_AND_ONTOLOGY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), URI_FOR_PREFIX_AND_ONTOLOGY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, URI_FOR_PREFIX_AND_ONTOLOGY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(prefix, ontology);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (prefix.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && ontology.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.uri_for_prefix_and_ontology_internal(prefix, ontology)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(prefix, ontology));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject uri_for_prefix_and_ontology(final SubLObject prefix, final SubLObject ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return uri_for_prefix_and_ontology_internal(prefix, ontology);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, URI_FOR_PREFIX_AND_ONTOLOGY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), URI_FOR_PREFIX_AND_ONTOLOGY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, URI_FOR_PREFIX_AND_ONTOLOGY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(prefix, ontology);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (prefix.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && ontology.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(uri_for_prefix_and_ontology_internal(prefix, ontology)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(prefix, ontology));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return EL-FORMULA-P or NIL; the OWL CycL expression equating THIS-TERM with the term whose name
    in ONTOLOGY is LOCAL-NAME.
     */
    @LispMethod(comment = "@return EL-FORMULA-P or NIL; the OWL CycL expression equating THIS-TERM with the term whose name\r\nin ONTOLOGY is LOCAL-NAME.")
    public static final SubLObject owl_cyclify_synonymous_external_term_alt(SubLObject this_term, SubLObject uri, SubLObject inverseP) {
        if (inverseP == UNPROVIDED) {
            inverseP = NIL;
        }
        if (!uri.isString()) {
            return NIL;
        }
        return make_binary_formula(NIL != inverseP ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_predicate($const257$owl_inverseOf))) : com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_predicate($$owlSameAs), com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg1(this_term), com.cyc.cycjava.cycl.owl.owlification.owl_cyclify_arg2(uri, NIL));
    }

    /**
     *
     *
     * @return EL-FORMULA-P or NIL; the OWL CycL expression equating THIS-TERM with the term whose name
    in ONTOLOGY is LOCAL-NAME.
     */
    @LispMethod(comment = "@return EL-FORMULA-P or NIL; the OWL CycL expression equating THIS-TERM with the term whose name\r\nin ONTOLOGY is LOCAL-NAME.")
    public static SubLObject owl_cyclify_synonymous_external_term(final SubLObject this_term, final SubLObject uri, SubLObject inverseP) {
        if (inverseP == UNPROVIDED) {
            inverseP = NIL;
        }
        if (!uri.isString()) {
            return NIL;
        }
        return make_binary_formula(NIL != inverseP ? owl_cyclify_predicate($const259$owl_inverseOf) : owl_cyclify_predicate($const76$owl_sameAs), owl_cyclify_arg1(this_term), owl_cyclify_arg2(uri, NIL));
    }

    /**
     *
     *
     * @return URI-P or NIL; a URI we can use to refer to the term whose name
    in ONTOLOGY is LOCAL-NAME.
     */
    @LispMethod(comment = "@return URI-P or NIL; a URI we can use to refer to the term whose name\r\nin ONTOLOGY is LOCAL-NAME.")
    public static final SubLObject owl_uri_from_ontology_and_local_name_alt(SubLObject ontology, SubLObject local_name) {
        if (NIL == forts.fort_p(ontology)) {
            Errors.warn($str_alt258$Can_t_get_URI_from_non_FORT_ontol, ontology);
            return NIL;
        }
        if (!local_name.isString()) {
            Errors.warn($str_alt259$Can_t_get_URI_from_non_string_loc, local_name);
            return NIL;
        }
        if (NIL != find(CHAR_colon, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return local_name;
        }
        {
            SubLObject ontology_uri = com.cyc.cycjava.cycl.owl.owlification.ontology_uri(ontology);
            if (NIL == ontology_uri) {
                com.cyc.cycjava.cycl.owl.owlification.maybe_warn_about_ontology_missing_uri(ontology);
                return NIL;
            } else {
                if (NIL != string_utilities.ends_with_one_of(ontology_uri, $list_alt260)) {
                    return cconcatenate(ontology_uri, local_name);
                } else {
                    if (ontology_uri.equal($str_alt261$http___www_w3_org_2006_03_wn_wn20)) {
                        return cconcatenate(ontology_uri, new SubLObject[]{ $str_alt64$_, local_name });
                    } else {
                        return cconcatenate(ontology_uri, new SubLObject[]{ $str_alt182$_, local_name });
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return URI-P or NIL; a URI we can use to refer to the term whose name
    in ONTOLOGY is LOCAL-NAME.
     */
    @LispMethod(comment = "@return URI-P or NIL; a URI we can use to refer to the term whose name\r\nin ONTOLOGY is LOCAL-NAME.")
    public static SubLObject owl_uri_from_ontology_and_local_name(final SubLObject ontology, final SubLObject local_name) {
        if (NIL == forts.fort_p(ontology)) {
            Errors.warn($str260$Can_t_get_URI_from_non_FORT_ontol, ontology);
            return NIL;
        }
        if (!local_name.isString()) {
            Errors.warn($str261$Can_t_get_URI_from_non_string_loc, local_name);
            return NIL;
        }
        if (NIL != find(CHAR_colon, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return local_name;
        }
        final SubLObject ontology_uri = ontology_uri(ontology);
        if (NIL == ontology_uri) {
            maybe_warn_about_ontology_missing_uri(ontology);
            return NIL;
        }
        if (NIL != string_utilities.ends_with_one_of(ontology_uri, $list262)) {
            return cconcatenate(ontology_uri, local_name);
        }
        if (ontology_uri.equal($str263$http___www_w3_org_2006_03_wn_wn20)) {
            return cconcatenate(ontology_uri, new SubLObject[]{ $str63$_, local_name });
        }
        return cconcatenate(ontology_uri, new SubLObject[]{ $str180$_, local_name });
    }

    public static final SubLObject maybe_warn_about_ontology_missing_uri_internal_alt(SubLObject ontology) {
        Errors.warn($str_alt263$Couldn_t_find_URI_for__S_, ontology);
        return NIL;
    }

    public static SubLObject maybe_warn_about_ontology_missing_uri_internal(final SubLObject ontology) {
        Errors.warn($str265$Couldn_t_find_URI_for__S_, ontology);
        return NIL;
    }

    public static final SubLObject maybe_warn_about_ontology_missing_uri_alt(SubLObject ontology) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.maybe_warn_about_ontology_missing_uri_internal(ontology);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ontology, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.maybe_warn_about_ontology_missing_uri_internal(ontology)));
                        memoization_state.caching_state_put(caching_state, ontology, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject maybe_warn_about_ontology_missing_uri(final SubLObject ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return maybe_warn_about_ontology_missing_uri_internal(ontology);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ontology, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(maybe_warn_about_ontology_missing_uri_internal(ontology)));
            memoization_state.caching_state_put(caching_state, ontology, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject ontology_uri_internal_alt(SubLObject ontology) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hard_coded = list_utilities.alist_lookup_without_values($ontology_uris$.getGlobalValue(), ontology, symbol_function(EQUAL), NIL);
                if (NIL != hard_coded) {
                    return hard_coded;
                }
                {
                    SubLObject uri = backward.removal_ask_variable($URI, listS($$salientURI, ontology, $list_alt268), $$InferencePSC, UNPROVIDED, UNPROVIDED).first();
                    if (NIL != cycl_grammar.cycl_nat_p(uri)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(uri, $list_alt269);
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject string = list_utilities.alist_lookup_without_values(v_bindings, STRING, UNPROVIDED, UNPROVIDED);
                                    uri = string;
                                }
                            }
                        }
                    }
                    return uri;
                }
            }
        }
    }

    public static SubLObject ontology_uri_internal(final SubLObject ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hard_coded = list_utilities.alist_lookup_without_values($ontology_uris$.getGlobalValue(), ontology, symbol_function(EQUAL), NIL);
        if (NIL != hard_coded) {
            return hard_coded;
        }
        SubLObject uri = backward.removal_ask_variable($URI, listS($$salientURI, ontology, $list270), $$InferencePSC, UNPROVIDED, UNPROVIDED).first();
        if (NIL != cycl_grammar.cycl_nat_p(uri)) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(uri, $list271);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject string = uri = list_utilities.alist_lookup_without_values(v_bindings, STRING, UNPROVIDED, UNPROVIDED);
            }
        }
        return uri;
    }

    public static final SubLObject ontology_uri_alt(SubLObject ontology) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.ontology_uri_internal(ontology);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ONTOLOGY_URI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ONTOLOGY_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ONTOLOGY_URI, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ontology, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.ontology_uri_internal(ontology)));
                        memoization_state.caching_state_put(caching_state, ontology, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject ontology_uri(final SubLObject ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ontology_uri_internal(ontology);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ONTOLOGY_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ONTOLOGY_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ONTOLOGY_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ontology, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(ontology_uri_internal(ontology)));
            memoization_state.caching_state_put(caching_state, ontology, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject owl_nart_name_internal_alt(SubLObject nart, SubLObject generate_phrase_for_nartsP) {
        {
            SubLObject xml_name = (NIL != generate_phrase_for_nartsP) ? ((SubLObject) (com.cyc.cycjava.cycl.owl.owlification.sanitize_owl_name(com.cyc.cycjava.cycl.owl.owlification.owl_get_generated_phrase(nart)))) : com.cyc.cycjava.cycl.owl.owlification.nsanitize_owl_name(string_utilities.str(nart));
            if (NIL == fort_types_interface.predicate_p(nart)) {
                xml_name = string_utilities.upcase_leading(xml_name);
            }
            return com.cyc.cycjava.cycl.owl.owlification.uniquify_and_note_owl_fort_name(xml_name, nart, UNPROVIDED);
        }
    }

    public static SubLObject owl_nart_name_internal(final SubLObject nart, final SubLObject generate_phrase_for_nartsP) {
        SubLObject xml_name = (NIL != generate_phrase_for_nartsP) ? sanitize_owl_name(owl_get_generated_phrase(nart)) : nsanitize_owl_name(string_utilities.str(nart));
        if (NIL == fort_types_interface.predicate_p(nart)) {
            xml_name = string_utilities.upcase_leading(xml_name);
        }
        return uniquify_and_note_owl_fort_name(xml_name, nart, UNPROVIDED);
    }

    public static final SubLObject owl_nart_name_alt(SubLObject nart, SubLObject generate_phrase_for_nartsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_nart_name_internal(nart, generate_phrase_for_nartsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_NART_NAME, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_NART_NAME, TWO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_NART_NAME, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(nart, generate_phrase_for_nartsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (nart.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && generate_phrase_for_nartsP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_nart_name_internal(nart, generate_phrase_for_nartsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(nart, generate_phrase_for_nartsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject owl_nart_name(final SubLObject nart, final SubLObject generate_phrase_for_nartsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_nart_name_internal(nart, generate_phrase_for_nartsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_NART_NAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_NART_NAME, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_NART_NAME, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(nart, generate_phrase_for_nartsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (nart.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && generate_phrase_for_nartsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_nart_name_internal(nart, generate_phrase_for_nartsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(nart, generate_phrase_for_nartsP));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return STRINGP; a name for FORT based on NAME-BASE, uniquely identified with FORT.
     */
    @LispMethod(comment = "@return STRINGP; a name for FORT based on NAME-BASE, uniquely identified with FORT.")
    public static final SubLObject uniquify_and_note_owl_fort_name_alt(SubLObject name_base, SubLObject fort, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $OWL_NAME;
        }
        com.cyc.cycjava.cycl.owl.owlification.possibly_initialize_owl_export_state();
        {
            SubLObject uniquifier_number = NIL;
            SubLObject new_name = name_base;
            SubLObject connector = (type.eql($PREFERRED_NAME)) ? ((SubLObject) ($str_alt272$_)) : $str_alt238$_;
            SubLObject clash = com.cyc.cycjava.cycl.owl.owlification.find_fort_by_owl_name(new_name, type);
            SubLObject lock = $owl_name_uniquifier_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                while ((NIL != clash) && (!clash.eql(fort))) {
                    uniquifier_number = com.cyc.cycjava.cycl.owl.owlification.uniquifier_number_for_type(uniquifier_number, type);
                    new_name = cconcatenate(name_base, new SubLObject[]{ connector, string_utilities.str(uniquifier_number) });
                    clash = com.cyc.cycjava.cycl.owl.owlification.find_fort_by_owl_name(new_name, type);
                } 
                com.cyc.cycjava.cycl.owl.owlification.note_fort_owl_name(fort, new_name, type);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return new_name;
        }
    }

    /**
     *
     *
     * @return STRINGP; a name for FORT based on NAME-BASE, uniquely identified with FORT.
     */
    @LispMethod(comment = "@return STRINGP; a name for FORT based on NAME-BASE, uniquely identified with FORT.")
    public static SubLObject uniquify_and_note_owl_fort_name(final SubLObject name_base, final SubLObject fort, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $OWL_NAME;
        }
        possibly_initialize_owl_export_state();
        SubLObject uniquifier_number = NIL;
        SubLObject new_name = name_base;
        final SubLObject connector = (type.eql($PREFERRED_NAME)) ? $$$_ : $str240$_;
        SubLObject clash = find_fort_by_owl_name(new_name, type);
        SubLObject release = NIL;
        try {
            release = seize_lock($owl_name_uniquifier_lock$.getGlobalValue());
            while ((NIL != clash) && (!clash.eql(fort))) {
                uniquifier_number = uniquifier_number_for_type(uniquifier_number, type);
                new_name = cconcatenate(name_base, new SubLObject[]{ connector, string_utilities.str(uniquifier_number) });
                clash = find_fort_by_owl_name(new_name, type);
            } 
            note_fort_owl_name(fort, new_name, type);
        } finally {
            if (NIL != release) {
                release_lock($owl_name_uniquifier_lock$.getGlobalValue());
            }
        }
        return new_name;
    }

    public static final SubLObject uniquifier_number_for_type_alt(SubLObject current_uniquifier_number, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($PREFERRED_NAME)) {
                    return current_uniquifier_number.isInteger() ? ((SubLObject) (number_utilities.f_1X(current_uniquifier_number))) : ONE_INTEGER;
                } else {
                    {
                        SubLObject uniquifier_number = $fort_owl_name_counter$.getDynamicValue(thread);
                        $fort_owl_name_counter$.setDynamicValue(add($fort_owl_name_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                        return uniquifier_number;
                    }
                }
            }
        }
    }

    public static SubLObject uniquifier_number_for_type(final SubLObject current_uniquifier_number, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (type.eql($PREFERRED_NAME)) {
            return current_uniquifier_number.isInteger() ? number_utilities.f_1X(current_uniquifier_number) : ONE_INTEGER;
        }
        final SubLObject uniquifier_number = $fort_owl_name_counter$.getDynamicValue(thread);
        $fort_owl_name_counter$.setDynamicValue(add($fort_owl_name_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
        return uniquifier_number;
    }

    /**
     * We want < to sort as less than $, so that nested narts are sorted earlier than nested constants
     */
    @LispMethod(comment = "We want < to sort as less than $, so that nested narts are sorted earlier than nested constants")
    public static final SubLObject owl_nart_sort_string_internal_alt(SubLObject nart) {
        return string_utilities.char_subst(CHAR_exclamation, CHAR_less, com.cyc.cycjava.cycl.owl.owlification.owl_str(nart));
    }

    /**
     * We want < to sort as less than $, so that nested narts are sorted earlier than nested constants
     */
    @LispMethod(comment = "We want < to sort as less than $, so that nested narts are sorted earlier than nested constants")
    public static SubLObject owl_nart_sort_string_internal(final SubLObject nart) {
        return string_utilities.char_subst(CHAR_exclamation, CHAR_less, owl_str(nart));
    }

    public static final SubLObject owl_nart_sort_string_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_nart_sort_string_internal(nart);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_NART_SORT_STRING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_NART_SORT_STRING, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_NART_SORT_STRING, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_nart_sort_string_internal(nart)));
                        memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject owl_nart_sort_string(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_nart_sort_string_internal(nart);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_NART_SORT_STRING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_NART_SORT_STRING, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_NART_SORT_STRING, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_nart_sort_string_internal(nart)));
            memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject owl_str_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.owl.owlification.owl_str_int(v_object, NIL);
    }

    public static SubLObject owl_str(final SubLObject v_object) {
        return owl_str_int(v_object, NIL);
    }

    public static final SubLObject owl_str_with_quotes_allowed_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.owl.owlification.owl_str_int(v_object, T);
    }

    public static SubLObject owl_str_with_quotes_allowed(final SubLObject v_object) {
        return owl_str_int(v_object, T);
    }

    public static final SubLObject owl_str_int_alt(SubLObject v_object, SubLObject quotes_allowedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $read_default_float_format$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        if (NIL != quotes_allowedP) {
                            result = format_nil.format_nil_s(v_object);
                        } else {
                            result = string_utilities.str(v_object);
                        }
                    } finally {
                        $read_default_float_format$.rebind(_prev_bind_3, thread);
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject owl_str_int(final SubLObject v_object, final SubLObject quotes_allowedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_default_float_format$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            if (NIL != quotes_allowedP) {
                result = format_nil.format_nil_s(v_object);
            } else {
                result = string_utilities.str(v_object);
            }
        } finally {
            $read_default_float_format$.rebind(_prev_bind_4, thread);
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject strip_hl_artifacts_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.owl.owlification.strip_nart_brackets(com.cyc.cycjava.cycl.owl.owlification.strip_hash_dollars(string));
    }

    public static SubLObject strip_hl_artifacts(final SubLObject string) {
        return strip_nart_brackets(strip_hash_dollars(string));
    }

    public static final SubLObject strip_nart_brackets_alt(SubLObject string) {
        string = string_utilities.string_subst($str_alt275$_, $str_alt276$___, string, UNPROVIDED);
        string = string_utilities.string_subst($str_alt277$_, $str_alt278$__, string, UNPROVIDED);
        return string;
    }

    public static SubLObject strip_nart_brackets(SubLObject string) {
        string = string_utilities.string_subst($str277$_, $str278$___, string, UNPROVIDED);
        string = string_utilities.string_subst($str279$_, $str280$__, string, UNPROVIDED);
        return string;
    }

    /**
     * Strips all occurrences of '#$' from STRING.
     */
    @LispMethod(comment = "Strips all occurrences of \'#$\' from STRING.")
    public static final SubLObject strip_hash_dollars_alt(SubLObject string) {
        return string_utilities.string_subst($str_alt63$, $str_alt279$__, string, UNPROVIDED);
    }

    /**
     * Strips all occurrences of '#$' from STRING.
     */
    @LispMethod(comment = "Strips all occurrences of \'#$\' from STRING.")
    public static SubLObject strip_hash_dollars(final SubLObject string) {
        return string_utilities.string_subst($str62$, $str281$__, string, UNPROVIDED);
    }/**
     * Strips all occurrences of '#$' from STRING.
     */


    public static final SubLObject sanitize_owl_name_alt(SubLObject xml_string) {
        return com.cyc.cycjava.cycl.owl.owlification.nsanitize_owl_name(string_utilities.copy_string(xml_string));
    }

    public static SubLObject sanitize_owl_name(final SubLObject xml_string) {
        return nsanitize_owl_name(string_utilities.copy_string(xml_string));
    }

    public static final SubLObject nsanitize_owl_name_alt(SubLObject xml_string) {
        if (NIL != search($str_alt280$_u, xml_string, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject unicode = unicode_strings.display_to_utf8_string(xml_string);
                xml_string = (NIL != unicode) ? ((SubLObject) (unicode)) : xml_string;
            }
        }
        if (NIL != string_utilities.substringP($str_alt281$__, xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            xml_string = com.cyc.cycjava.cycl.owl.owlification.strip_html_tags(xml_string);
        }
        xml_string = delete_if(INVALID_OWL_NAME_CHAR_TO_REMOVE_P, xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        xml_string = string_utilities.nchar_subst_if_not(CHAR_underbar, VALID_OWL_NAME_CHAR_P, xml_string);
        xml_string = com.cyc.cycjava.cycl.owl.owlification.strip_hash_dollars(xml_string);
        xml_string = string_utilities.string_subst($str_alt238$_, $str_alt276$___, xml_string, UNPROVIDED);
        xml_string = string_utilities.string_subst($str_alt238$_, $str_alt278$__, xml_string, UNPROVIDED);
        if (NIL == xml_utilities.valid_xml_name_p(xml_string)) {
            xml_string = xml_utilities.remove_invalid_xml_name_chars(xml_string);
        }
        return xml_string;
    }

    public static SubLObject nsanitize_owl_name(SubLObject xml_string) {
        if (NIL != search($str282$_u, xml_string, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject unicode = unicode_strings.display_to_utf8_string(xml_string);
            xml_string = (NIL != unicode) ? unicode : xml_string;
        }
        if (NIL != string_utilities.substringP($str283$__, xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            xml_string = strip_html_tags(xml_string);
        }
        xml_string = delete_if(INVALID_OWL_NAME_CHAR_TO_REMOVE_P, xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        xml_string = string_utilities.nchar_subst_if_not(CHAR_underbar, VALID_OWL_NAME_CHAR_P, xml_string);
        xml_string = strip_hash_dollars(xml_string);
        xml_string = string_utilities.string_subst($str240$_, $str278$___, xml_string, UNPROVIDED);
        xml_string = string_utilities.string_subst($str240$_, $str280$__, xml_string, UNPROVIDED);
        if (NIL == xml_utilities.valid_xml_name_p(xml_string)) {
            xml_string = xml_utilities.remove_invalid_xml_name_chars(xml_string);
        }
        return xml_string;
    }

    public static final SubLObject invalid_owl_name_char_to_remove_p_alt(SubLObject obj) {
        return find(obj, $invalid_owl_name_chars_remove$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject invalid_owl_name_char_to_remove_p(final SubLObject obj) {
        return find(obj, $invalid_owl_name_chars_remove$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject valid_owl_name_char_p_alt(SubLObject obj) {
        return makeBoolean(((NIL != xml_utilities.valid_xml_char_p(obj)) && (NIL == find(obj, $invalid_owl_name_chars_underscore$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == find(obj, $invalid_owl_name_chars_remove$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_owl_name_char_p(final SubLObject obj) {
        return makeBoolean(((NIL != xml_utilities.valid_xml_char_p(obj)) && (NIL == find(obj, $invalid_owl_name_chars_underscore$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == find(obj, $invalid_owl_name_chars_remove$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject strip_html_tags_alt(SubLObject string) {
        Errors.warn($str_alt286$HTML_tags_not_stripped_from__s, string);
        return string;
    }

    public static SubLObject strip_html_tags(final SubLObject string) {
        Errors.warn($str288$HTML_tags_not_stripped_from__s, string);
        return string;
    }

    public static final SubLObject owl_external_id_string_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = kb_utilities.compact_hl_external_id_string(v_term);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(id.isString() && (NIL != list_utilities.lengthGE(id, $int$26, UNPROVIDED)))) {
                        Errors.error($str_alt289$ID__S_for__S_is_suspiciously_shor, id, v_term, length(id));
                    }
                }
                return id;
            }
        }
    }

    public static SubLObject owl_external_id_string_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = kb_utilities.compact_hl_external_id_string(v_term);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!id.isString()) || (NIL == list_utilities.lengthGE(id, $int$26, UNPROVIDED)))) {
            Errors.error($str291$ID__S_for__S_is_suspiciously_shor, id, v_term, length(id));
        }
        return id;
    }

    public static final SubLObject owl_external_id_string_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_external_id_string_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_EXTERNAL_ID_STRING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_EXTERNAL_ID_STRING, ONE_INTEGER, $int$256, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_EXTERNAL_ID_STRING, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_external_id_string_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject owl_external_id_string(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_external_id_string_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_EXTERNAL_ID_STRING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_EXTERNAL_ID_STRING, ONE_INTEGER, $int$256, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_EXTERNAL_ID_STRING, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_external_id_string_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject owl_get_plural_generated_phrase_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.owl.owlification.owl_generate_phrase_int(v_term, $list_alt291);
    }

    public static SubLObject owl_get_plural_generated_phrase(final SubLObject v_term) {
        return owl_generate_phrase_int(v_term, $list293);
    }

    public static final SubLObject owl_get_singular_generated_phrase_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.owl.owlification.owl_generate_phrase_int(v_term, $list_alt292);
    }

    public static SubLObject owl_get_singular_generated_phrase(final SubLObject v_term) {
        return owl_generate_phrase_int(v_term, $list294);
    }

    public static final SubLObject owl_get_generated_phrase_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.owl.owlification.owl_generate_phrase_int(v_term, $DEFAULT);
    }

    public static SubLObject owl_get_generated_phrase(final SubLObject v_term) {
        return owl_generate_phrase_int(v_term, $DEFAULT);
    }

    public static final SubLObject owl_generate_phrase_int_internal_alt(SubLObject v_term, SubLObject nl_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = com.cyc.cycjava.cycl.owl.owlification.owl_pretty_string(v_term);
                if (NIL == string_utilities.non_empty_string_p(result)) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        SubLTrampolineFile.checkType(T, PPH_PRECISION_P);
                                        {
                                            SubLObject _prev_bind_0_40 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                            try {
                                                pph_vars.$paraphrase_precision$.bind(T, thread);
                                                pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? ((SubLObject) (pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                result = pph_main.generate_phrase(v_term, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_1, thread);
                                                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_40, thread);
                                            }
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                }
                if (NIL == result) {
                    {
                        SubLObject crappy_paraphrase = com.cyc.cycjava.cycl.owl.owlification.owl_generate_phrase_fallback(v_term);
                        result = crappy_paraphrase;
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject owl_generate_phrase_int_internal(final SubLObject v_term, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = owl_pretty_string(v_term);
        if (NIL == string_utilities.non_empty_string_p(result)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        assert NIL != pph_utilities.pph_precision_p(T) : "! pph_utilities.pph_precision_p( .T) " + ("pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) ") + T;
                        final SubLObject _prev_bind_0_$41 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        try {
                            pph_vars.$paraphrase_precision$.bind(T, thread);
                            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                            pph_vars.$pph_language_mt$.bind($owl_human_readable_name_generation_mt$.getGlobalValue(), thread);
                            result = cycl_string.cycl_string_to_utf8_string(pph_main.generate_text_wXsentential_force(v_term, $NONE, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        } finally {
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_3, thread);
                            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$41, thread);
                        }
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
        }
        if (NIL == result) {
            final SubLObject crappy_paraphrase = result = owl_generate_phrase_fallback(v_term);
        }
        return result;
    }

    public static final SubLObject owl_generate_phrase_int_alt(SubLObject v_term, SubLObject nl_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_generate_phrase_int_internal(v_term, nl_preds);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_GENERATE_PHRASE_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_GENERATE_PHRASE_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_GENERATE_PHRASE_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, nl_preds);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw48$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && nl_preds.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owlification.owl_generate_phrase_int_internal(v_term, nl_preds)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, nl_preds));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject owl_generate_phrase_int(final SubLObject v_term, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_generate_phrase_int_internal(v_term, nl_preds);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_GENERATE_PHRASE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_GENERATE_PHRASE_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_GENERATE_PHRASE_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, nl_preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && nl_preds.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_generate_phrase_int_internal(v_term, nl_preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, nl_preds));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject owl_generate_phrase_fallback_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $owl_profilingP$.getDynamicValue(thread)) {
                return $$$fake_pretty_string;
            } else {
                if (NIL != forts.fort_p(v_term)) {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_fort_human_readable_name(v_term, NIL);
                } else {
                    return com.cyc.cycjava.cycl.owl.owlification.owl_non_fort_string(v_term);
                }
            }
        }
    }

    public static SubLObject owl_generate_phrase_fallback(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_profilingP$.getDynamicValue(thread)) {
            return $$$fake_pretty_string;
        }
        if (NIL != forts.fort_p(v_term)) {
            return owl_fort_human_readable_name(v_term, NIL);
        }
        return owl_non_fort_string(v_term);
    }

    public static final SubLObject owl_pretty_string_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $owl_use_pretty_stringsP$.getDynamicValue(thread)) {
                {
                    SubLObject string = kb_mapping_utilities.fpred_value_in_any_mt(fort, $$prettyString_Canonical, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == string) {
                        string = kb_mapping_utilities.fpred_value_in_any_mt(fort, $$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return string;
                }
            }
            return NIL;
        }
    }

    public static SubLObject owl_pretty_string(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $owl_use_pretty_stringsP$.getDynamicValue(thread)) {
            SubLObject string = kb_mapping_utilities.fpred_value_in_any_mt(fort, $$prettyString_Canonical, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == string) {
                string = kb_mapping_utilities.fpred_value_in_any_mt(fort, $$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return string;
        }
        return NIL;
    }

    public static final SubLObject initialize_umbel_id_map_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != dictionary.dictionary_p($umbel_id_map$.getGlobalValue())) {
                dictionary.clear_dictionary($umbel_id_map$.getGlobalValue());
            } else {
                $umbel_id_map$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            }
            {
                SubLObject cdolist_list_var = $umbel_data_files$.getGlobalValue();
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject file = NIL;
                        SubLObject base_uri = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt301);
                        file = current.first();
                        current = current.rest();
                        base_uri = current;
                        if (NIL != file_utilities.file_existsP(file)) {
                            {
                                SubLObject file_var = file;
                                SubLObject stream = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt67$Unable_to_open__S, file_var);
                                    }
                                    {
                                        SubLObject stream_var = stream;
                                        if (stream_var.isStream()) {
                                            {
                                                SubLObject stream_var_41 = stream_var;
                                                SubLObject line_number_var = NIL;
                                                SubLObject line = NIL;
                                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_41, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_41, NIL, NIL, UNPROVIDED)) {
                                                    {
                                                        SubLObject line_42 = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str_alt303$_, $str_alt303$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                                                        SubLObject datum_43 = line_42;
                                                        SubLObject current_44 = datum_43;
                                                        SubLObject umbel_id = NIL;
                                                        SubLObject cyc_id = NIL;
                                                        destructuring_bind_must_consp(current_44, datum_43, $list_alt304);
                                                        umbel_id = current_44.first();
                                                        current_44 = current_44.rest();
                                                        destructuring_bind_must_consp(current_44, datum_43, $list_alt304);
                                                        cyc_id = current_44.first();
                                                        current_44 = current_44.rest();
                                                        if (NIL == current_44) {
                                                            {
                                                                SubLObject cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string(cyc_id);
                                                                if (NIL != forts.valid_fortP(cyc_term)) {
                                                                    dictionary.dictionary_enter($umbel_id_map$.getGlobalValue(), cyc_term, cconcatenate(base_uri, umbel_id));
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_43, $list_alt304);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return $umbel_id_map$.getGlobalValue();
        }
    }

    public static SubLObject initialize_umbel_id_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.dictionary_p($umbel_id_map$.getGlobalValue())) {
            dictionary.clear_dictionary($umbel_id_map$.getGlobalValue());
        } else {
            $umbel_id_map$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        }
        SubLObject cdolist_list_var = $umbel_data_files$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject file = NIL;
            SubLObject base_uri = NIL;
            destructuring_bind_must_consp(current, datum, $list305);
            file = current.first();
            current = base_uri = current.rest();
            if (NIL != file_utilities.file_existsP(file)) {
                final SubLObject file_var = file;
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(file_var, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str66$Unable_to_open__S, file_var);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject stream_var_$42 = stream_var;
                        SubLObject line_number_var = NIL;
                        SubLObject line = NIL;
                        line_number_var = ZERO_INTEGER;
                        for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$42); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$42)) {
                            final SubLObject line_$43 = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str307$_, $str307$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                            SubLObject current_$45;
                            final SubLObject datum_$44 = current_$45 = line_$43;
                            SubLObject umbel_id = NIL;
                            SubLObject cyc_id = NIL;
                            destructuring_bind_must_consp(current_$45, datum_$44, $list308);
                            umbel_id = current_$45.first();
                            current_$45 = current_$45.rest();
                            destructuring_bind_must_consp(current_$45, datum_$44, $list308);
                            cyc_id = current_$45.first();
                            current_$45 = current_$45.rest();
                            if (NIL == current_$45) {
                                final SubLObject cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string(cyc_id);
                                if (NIL != forts.valid_fortP(cyc_term)) {
                                    dictionary.dictionary_enter($umbel_id_map$.getGlobalValue(), cyc_term, cconcatenate(base_uri, umbel_id));
                                }
                            } else {
                                cdestructuring_bind_error(datum_$44, $list308);
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
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return $umbel_id_map$.getGlobalValue();
    }

    public static final SubLObject slurp_umbel_names_alt(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $umbel_data_files$.getGlobalValue();
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject file = NIL;
                        SubLObject base_uri = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt301);
                        file = current.first();
                        current = current.rest();
                        base_uri = current;
                        if (NIL != file_utilities.file_existsP(file)) {
                            {
                                SubLObject subject_conceptsP = search($$$sc, base_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject pred = (NIL != subject_conceptsP) ? ((SubLObject) ($$umbelSubjectConceptName)) : $$umbelAbstractConceptName;
                                SubLObject mt = narts_high.find_nart(list($$MappingMtFn, list($$OWLOntologyFn, NIL != subject_conceptsP ? ((SubLObject) ($$UMBELSubjectConceptNamespace)) : $$UMBELAbstractConceptNamespace)));
                                {
                                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                    try {
                                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                                        operation_communication.set_the_cyclist(cyclist);
                                        {
                                            SubLObject file_var = file;
                                            SubLObject stream = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_45 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                    try {
                                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                        stream = compatibility.open_text(file_var, $INPUT, NIL);
                                                    } finally {
                                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                if (!stream.isStream()) {
                                                    Errors.error($str_alt67$Unable_to_open__S, file_var);
                                                }
                                                {
                                                    SubLObject stream_var = stream;
                                                    if (stream_var.isStream()) {
                                                        {
                                                            SubLObject stream_var_46 = stream_var;
                                                            SubLObject line_number_var = NIL;
                                                            SubLObject line = NIL;
                                                            for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_46, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_46, NIL, NIL, UNPROVIDED)) {
                                                                {
                                                                    SubLObject line_47 = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str_alt303$_, $str_alt303$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                                                                    SubLObject datum_48 = line_47;
                                                                    SubLObject current_49 = datum_48;
                                                                    SubLObject umbel_id = NIL;
                                                                    SubLObject cyc_id = NIL;
                                                                    destructuring_bind_must_consp(current_49, datum_48, $list_alt304);
                                                                    umbel_id = current_49.first();
                                                                    current_49 = current_49.rest();
                                                                    destructuring_bind_must_consp(current_49, datum_48, $list_alt304);
                                                                    cyc_id = current_49.first();
                                                                    current_49 = current_49.rest();
                                                                    if (NIL == current_49) {
                                                                        {
                                                                            SubLObject cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string(cyc_id);
                                                                            SubLObject name = umbel_id;
                                                                            if (NIL != unicode_strings.non_ascii_string_p(name)) {
                                                                                name = non_ascii_string_to_unicode(name);
                                                                            }
                                                                            if (NIL != forts.valid_fortP(cyc_term)) {
                                                                                ke.ke_assert(make_binary_formula(pred, cyc_term, name), mt, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_48, $list_alt304);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (stream.isStream()) {
                                                            close(stream, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject slurp_umbel_names(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $umbel_data_files$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject file = NIL;
            SubLObject base_uri = NIL;
            destructuring_bind_must_consp(current, datum, $list305);
            file = current.first();
            current = base_uri = current.rest();
            if (NIL != file_utilities.file_existsP(file)) {
                final SubLObject subject_conceptsP = search($$$sc, base_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject pred = (NIL != subject_conceptsP) ? $$umbelSubjectConceptName : $$umbelAbstractConceptName;
                final SubLObject mt = narts_high.find_nart(list($$MappingMtFn, list($$OWLOntologyFn, NIL != subject_conceptsP ? $$UMBELSubjectConceptNamespace : $$UMBELAbstractConceptNamespace)));
                final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(NIL, thread);
                    operation_communication.set_the_cyclist(cyclist);
                    final SubLObject file_var = file;
                    SubLObject stream = NIL;
                    try {
                        final SubLObject _prev_bind_0_$46 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$46, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error($str66$Unable_to_open__S, file_var);
                        }
                        final SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            final SubLObject stream_var_$47 = stream_var;
                            SubLObject line_number_var = NIL;
                            SubLObject line = NIL;
                            line_number_var = ZERO_INTEGER;
                            for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$47); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$47)) {
                                final SubLObject line_$48 = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str307$_, $str307$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                                SubLObject current_$50;
                                final SubLObject datum_$49 = current_$50 = line_$48;
                                SubLObject umbel_id = NIL;
                                SubLObject cyc_id = NIL;
                                destructuring_bind_must_consp(current_$50, datum_$49, $list308);
                                umbel_id = current_$50.first();
                                current_$50 = current_$50.rest();
                                destructuring_bind_must_consp(current_$50, datum_$49, $list308);
                                cyc_id = current_$50.first();
                                current_$50 = current_$50.rest();
                                if (NIL == current_$50) {
                                    final SubLObject cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string(cyc_id);
                                    SubLObject name = umbel_id;
                                    if (NIL != unicode_strings.non_ascii_string_p(name)) {
                                        name = unicode_nauts.non_ascii_string_to_unicode(name);
                                    }
                                    if (NIL != forts.valid_fortP(cyc_term)) {
                                        ke.ke_assert(make_binary_formula(pred, cyc_term, name), mt, UNPROVIDED, UNPROVIDED);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_$49, $list308);
                                }
                                line_number_var = number_utilities.f_1X(line_number_var);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                        }
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject umbel_uri_for_fort_alt(SubLObject fort) {
        return dictionary.dictionary_lookup_without_values($umbel_id_map$.getGlobalValue(), fort, UNPROVIDED);
    }

    public static SubLObject umbel_uri_for_fort(final SubLObject fort) {
        if (NIL == misc_utilities.initialized_p($umbel_id_map$.getGlobalValue())) {
            initialize_umbel_id_map();
        }
        return dictionary.dictionary_lookup_without_values($umbel_id_map$.getGlobalValue(), fort, UNPROVIDED);
    }

    public static final SubLObject umbel_uri_sentence_for_fort_alt(SubLObject fort) {
        if (NIL == misc_utilities.initialized_p($umbel_id_map$.getGlobalValue())) {
            com.cyc.cycjava.cycl.owl.owlification.initialize_umbel_id_map();
        }
        {
            SubLObject uri = com.cyc.cycjava.cycl.owl.owlification.umbel_uri_for_fort(fort);
            return NIL != uri ? ((SubLObject) (list($$rdfURI, fort, uri))) : NIL;
        }
    }

    public static SubLObject umbel_uri_sentence_for_fort(final SubLObject fort) {
        final SubLObject uri = umbel_uri_for_fort(fort);
        return NIL != uri ? list($$rdfURI, fort, uri) : NIL;
    }

    public static SubLObject declare_owlification_file() {
        declareMacro("with_owl_export_asents", "WITH-OWL-EXPORT-ASENTS");
        declareFunction("add_owl_asent_forts_to_export_terms", "ADD-OWL-ASENT-FORTS-TO-EXPORT-TERMS", 1, 0, false);
        declareMacro("with_opencyc_owl_export_parameters", "WITH-OPENCYC-OWL-EXPORT-PARAMETERS");
        declareMacro("with_human_readable_opencyc_owl_export_parameters", "WITH-HUMAN-READABLE-OPENCYC-OWL-EXPORT-PARAMETERS");
        declareMacro("with_human_readable_owl_export_parameters", "WITH-HUMAN-READABLE-OWL-EXPORT-PARAMETERS");
        declareFunction("owl_export_parameter_snapshot", "OWL-EXPORT-PARAMETER-SNAPSHOT", 0, 0, false);
        declareMacro("do_owl_export_terms", "DO-OWL-EXPORT-TERMS");
        declareFunction("clear_owl_cycl_predicate_table", "CLEAR-OWL-CYCL-PREDICATE-TABLE", 0, 0, false);
        declareFunction("remove_owl_cycl_predicate_table", "REMOVE-OWL-CYCL-PREDICATE-TABLE", 0, 1, false);
        declareFunction("owl_cycl_predicate_table_internal", "OWL-CYCL-PREDICATE-TABLE-INTERNAL", 1, 0, false);
        declareFunction("owl_cycl_predicate_table", "OWL-CYCL-PREDICATE-TABLE", 0, 1, false);
        declareMacro("with_new_fort_owl_name_table", "WITH-NEW-FORT-OWL-NAME-TABLE");
        declareFunction("note_fort_owl_name", "NOTE-FORT-OWL-NAME", 2, 1, false);
        declareFunction("write_fort_owl_name_table", "WRITE-FORT-OWL-NAME-TABLE", 1, 0, false);
        declareFunction("find_fort_by_owl_name", "FIND-FORT-BY-OWL-NAME", 1, 1, false);
        declareFunction("owl_cyclify_term", "OWL-CYCLIFY-TERM", 1, 0, false);
        declareFunction("new_owl_export_term_iterator", "NEW-OWL-EXPORT-TERM-ITERATOR", 1, 0, false);
        declareFunction("filter_and_sort_owl_export_terms", "FILTER-AND-SORT-OWL-EXPORT-TERMS", 1, 0, false);
        declareFunction("add_fort_to_owl_export_set", "ADD-FORT-TO-OWL-EXPORT-SET", 2, 0, false);
        declareFunction("owl_export_nart_export_form", "OWL-EXPORT-NART-EXPORT-FORM", 1, 0, false);
        declareFunction("owl_export_canonicalize_nart_internal", "OWL-EXPORT-CANONICALIZE-NART-INTERNAL", 1, 0, false);
        declareFunction("owl_export_canonicalize_nart", "OWL-EXPORT-CANONICALIZE-NART", 1, 0, false);
        declareFunction("nart_invalid_for_owl_exportP", "NART-INVALID-FOR-OWL-EXPORT?", 1, 0, false);
        declareFunction("delete_subsumed_owl_asents", "DELETE-SUBSUMED-OWL-ASENTS", 1, 0, false);
        declareFunction("subsumed_owl_asentP", "SUBSUMED-OWL-ASENT?", 2, 0, false);
        declareFunction("valid_collection_fort_for_owl_exportP", "VALID-COLLECTION-FORT-FOR-OWL-EXPORT?", 1, 0, false);
        declareFunction("nonexportable_term_warning_internal", "NONEXPORTABLE-TERM-WARNING-INTERNAL", 1, 0, false);
        declareFunction("nonexportable_term_warning", "NONEXPORTABLE-TERM-WARNING", 1, 0, false);
        declareFunction("valid_collection_fort_for_owl_exportP_internal", "VALID-COLLECTION-FORT-FOR-OWL-EXPORT?-INTERNAL", 1, 0, false);
        declareFunction("owl_sort_forts", "OWL-SORT-FORTS", 1, 0, false);
        declareFunction("owl_fort_L", "OWL-FORT-<", 2, 0, false);
        declareFunction("all_gaf_arg1_owlifiable_asents_sorted", "ALL-GAF-ARG1-OWLIFIABLE-ASENTS-SORTED", 1, 0, false);
        declareFunction("owl_whitelist_predicateP", "OWL-WHITELIST-PREDICATE?", 1, 0, false);
        declareFunction("owl_blacklist_sentenceP", "OWL-BLACKLIST-SENTENCE?", 1, 0, false);
        declareFunction("owl_blacklist_predicateP", "OWL-BLACKLIST-PREDICATE?", 1, 0, false);
        declareFunction("owl_adjust_isa_and_genls_asents", "OWL-ADJUST-ISA-AND-GENLS-ASENTS", 2, 0, false);
        declareFunction("isa_asents_for_fort", "ISA-ASENTS-FOR-FORT", 1, 0, false);
        declareFunction("genls_asents_for_fort", "GENLS-ASENTS-FOR-FORT", 1, 0, false);
        declareFunction("index_owl_asents_by_arg1", "INDEX-OWL-ASENTS-BY-ARG1", 1, 0, false);
        declareFunction("synonymous_external_concept_asents", "SYNONYMOUS-EXTERNAL-CONCEPT-ASENTS", 1, 0, false);
        declareFunction("gather_synonyms_via_synonymous_external_concept", "GATHER-SYNONYMS-VIA-SYNONYMOUS-EXTERNAL-CONCEPT", 1, 1, false);
        declareFunction("sort_owl_asents", "SORT-OWL-ASENTS", 1, 0, false);
        declareFunction("owl_remove_singleton_predicates", "OWL-REMOVE-SINGLETON-PREDICATES", 1, 0, false);
        declareFunction("comment_asentP", "COMMENT-ASENT?", 1, 0, false);
        declareFunction("owlifiable_sentenceP", "OWLIFIABLE-SENTENCE?", 1, 0, false);
        declareFunction("owlifiable_arg0P", "OWLIFIABLE-ARG0?", 1, 0, false);
        declareFunction("owlifiable_arg1P", "OWLIFIABLE-ARG1?", 1, 0, false);
        declareFunction("owlifiable_arg2P", "OWLIFIABLE-ARG2?", 2, 0, false);
        declareFunction("owlifiable_date_p", "OWLIFIABLE-DATE-P", 1, 0, false);
        declareFunction("owl_extra_arg1_asents_for_term", "OWL-EXTRA-ARG1-ASENTS-FOR-TERM", 1, 0, false);
        declareFunction("owl_functional_propertyP", "OWL-FUNCTIONAL-PROPERTY?", 1, 0, false);
        declareFunction("owl_inverse_functional_propertyP", "OWL-INVERSE-FUNCTIONAL-PROPERTY?", 1, 0, false);
        declareFunction("owl_remove_type_isa", "OWL-REMOVE-TYPE-ISA", 1, 0, false);
        declareFunction("owl_redundant_type_isa_asentP", "OWL-REDUNDANT-TYPE-ISA-ASENT?", 1, 0, false);
        declareFunction("owl_isa_litP", "OWL-ISA-LIT?", 1, 0, false);
        declareFunction("owl_genls_litP", "OWL-GENLS-LIT?", 1, 0, false);
        declareFunction("owl_remove_uvmt_anect_isa", "OWL-REMOVE-UVMT-ANECT-ISA", 1, 0, false);
        declareFunction("isa_individual_asentP", "ISA-INDIVIDUAL-ASENT?", 1, 0, false);
        declareFunction("owl_asent_L", "OWL-ASENT-<", 2, 0, false);
        declareFunction("owl_binary_asent_L", "OWL-BINARY-ASENT-<", 2, 0, false);
        declareFunction("owl_cyclify_binary_asent", "OWL-CYCLIFY-BINARY-ASENT", 1, 0, false);
        declareFunction("owl_cyclify_meta_asent", "OWL-CYCLIFY-META-ASENT", 1, 0, false);
        declareFunction("owl_reification_asents", "OWL-REIFICATION-ASENTS", 2, 0, false);
        declareFunction("owl_reification_asent", "OWL-REIFICATION-ASENT", 3, 0, false);
        declareFunction("owl_cyclify_predicate", "OWL-CYCLIFY-PREDICATE", 1, 0, false);
        declareFunction("owl_cyclify_arg1", "OWL-CYCLIFY-ARG1", 1, 0, false);
        declareFunction("owl_cyclify_arg2", "OWL-CYCLIFY-ARG2", 2, 0, false);
        declareFunction("owl_date_string", "OWL-DATE-STRING", 1, 0, false);
        declareFunction("owl_arg2_datatype", "OWL-ARG2-DATATYPE", 2, 0, false);
        declareFunction("owl_day_string", "OWL-DAY-STRING", 1, 0, false);
        declareFunction("owl_month_string", "OWL-MONTH-STRING", 1, 0, false);
        declareFunction("owl_year_string", "OWL-YEAR-STRING", 1, 0, false);
        declareFunction("owl_century_string", "OWL-CENTURY-STRING", 1, 0, false);
        declareFunction("owl_date_instant_string", "OWL-DATE-INSTANT-STRING", 1, 0, false);
        declareFunction("maybe_expand_owl_entity_reference", "MAYBE-EXPAND-OWL-ENTITY-REFERENCE", 2, 0, false);
        declareFunction("uri_fort_p", "URI-FORT-P", 1, 0, false);
        declareFunction("stringify_uri_fort", "STRINGIFY-URI-FORT", 1, 0, false);
        declareFunction("stringify_uri_fort_internal", "STRINGIFY-URI-FORT-INTERNAL", 1, 0, false);
        declareFunction("owl_cyclify_string_with_constant_references", "OWL-CYCLIFY-STRING-WITH-CONSTANT-REFERENCES", 1, 1, false);
        declareFunction("initialize_owl_span_id_counter", "INITIALIZE-OWL-SPAN-ID-COUNTER", 0, 0, false);
        declareFunction("next_owl_span_id", "NEXT-OWL-SPAN-ID", 0, 0, false);
        declareFunction("html_link_to_owl_uri_with_popups", "HTML-LINK-TO-OWL-URI-WITH-POPUPS", 1, 1, false);
        declareFunction("html_link_to_owl_uri", "HTML-LINK-TO-OWL-URI", 1, 1, false);
        declareFunction("html_link_to_owl_opencyc_uri", "HTML-LINK-TO-OWL-OPENCYC-URI", 1, 0, false);
        declareFunction("html_output_owl_fort_comment", "HTML-OUTPUT-OWL-FORT-COMMENT", 1, 1, false);
        declareFunction("owl_subcollection_nart_p", "OWL-SUBCOLLECTION-NART-P", 1, 0, false);
        declareFunction("owl_subcollection_asent", "OWL-SUBCOLLECTION-ASENT", 1, 0, false);
        declareFunction("inverse_binary_predicate_sentence", "INVERSE-BINARY-PREDICATE-SENTENCE", 1, 0, false);
        declareFunction("find_or_create_inverse_binary_predicate_internal", "FIND-OR-CREATE-INVERSE-BINARY-PREDICATE-INTERNAL", 1, 0, false);
        declareFunction("find_or_create_inverse_binary_predicate", "FIND-OR-CREATE-INVERSE-BINARY-PREDICATE", 1, 0, false);
        declareFunction("find_inverse_binary_predicate", "FIND-INVERSE-BINARY-PREDICATE", 1, 0, false);
        declareFunction("owl_cyclify_intersection", "OWL-CYCLIFY-INTERSECTION", 1, 0, false);
        declareFunction("owl_cyclify_intersection_property", "OWL-CYCLIFY-INTERSECTION-PROPERTY", 1, 0, false);
        declareFunction("owl_term_type", "OWL-TERM-TYPE", 1, 0, false);
        declareFunction("owl_fort_type", "OWL-FORT-TYPE", 1, 0, false);
        declareFunction("best_isa_for_term", "BEST-ISA-FOR-TERM", 1, 0, false);
        declareFunction("best_isa_for_individual_internal", "BEST-ISA-FOR-INDIVIDUAL-INTERNAL", 1, 0, false);
        declareFunction("best_isa_for_individual", "BEST-ISA-FOR-INDIVIDUAL", 1, 0, false);
        declareFunction("best_isa_for_term_from_asents_to_export", "BEST-ISA-FOR-TERM-FROM-ASENTS-TO-EXPORT", 1, 0, false);
        declareMacro("with_owl_pph_memoization", "WITH-OWL-PPH-MEMOIZATION");
        declareFunction("owl_term_string", "OWL-TERM-STRING", 1, 1, false);
        declareFunction("owl_fort_name", "OWL-FORT-NAME", 1, 2, false);
        declareFunction("asserted_name_in_ontology", "ASSERTED-NAME-IN-ONTOLOGY", 3, 0, false);
        declareFunction("asserted_name_in_namespace", "ASSERTED-NAME-IN-NAMESPACE", 3, 0, false);
        declareFunction("asserted_uri_in_entity_map_namespace", "ASSERTED-URI-IN-ENTITY-MAP-NAMESPACE", 1, 0, false);
        declareFunction("owl_fort_human_readable_name_internal", "OWL-FORT-HUMAN-READABLE-NAME-INTERNAL", 1, 1, false);
        declareFunction("owl_fort_human_readable_name", "OWL-FORT-HUMAN-READABLE-NAME", 1, 1, false);
        declareFunction("valid_rdf_name_start_char_p", "VALID-RDF-NAME-START-CHAR-P", 1, 0, false);
        declareFunction("owl_type_name", "OWL-TYPE-NAME", 1, 0, false);
        declareFunction("owl_fort_cyc_name", "OWL-FORT-CYC-NAME", 1, 0, false);
        declareFunction("owl_non_fort_string", "OWL-NON-FORT-STRING", 1, 0, false);
        declareFunction("owl_sort_name", "OWL-SORT-NAME", 1, 0, false);
        declareFunction("owl_preferred_english_for_term", "OWL-PREFERRED-ENGLISH-FOR-TERM", 1, 0, false);
        declareFunction("owl_get_pretty_string_canonical", "OWL-GET-PRETTY-STRING-CANONICAL", 1, 0, false);
        declareFunction("owl_get_all_pretty_strings", "OWL-GET-ALL-PRETTY-STRINGS", 1, 0, false);
        declareFunction("owl_other_english_for_term", "OWL-OTHER-ENGLISH-FOR-TERM", 1, 0, false);
        declareFunction("possibly_initialize_owl_export_state", "POSSIBLY-INITIALIZE-OWL-EXPORT-STATE", 0, 0, false);
        declareFunction("clear_owl_export_state", "CLEAR-OWL-EXPORT-STATE", 0, 0, false);
        declareFunction("owl_cyclify_synonymous_external_concept_asent", "OWL-CYCLIFY-SYNONYMOUS-EXTERNAL-CONCEPT-ASENT", 1, 0, false);
        declareFunction("expand_prefixed_owl_reference", "EXPAND-PREFIXED-OWL-REFERENCE", 2, 0, false);
        declareFunction("uri_for_prefix_and_ontology_internal", "URI-FOR-PREFIX-AND-ONTOLOGY-INTERNAL", 2, 0, false);
        declareFunction("uri_for_prefix_and_ontology", "URI-FOR-PREFIX-AND-ONTOLOGY", 2, 0, false);
        declareFunction("owl_cyclify_synonymous_external_term", "OWL-CYCLIFY-SYNONYMOUS-EXTERNAL-TERM", 2, 1, false);
        declareFunction("owl_uri_from_ontology_and_local_name", "OWL-URI-FROM-ONTOLOGY-AND-LOCAL-NAME", 2, 0, false);
        declareFunction("maybe_warn_about_ontology_missing_uri_internal", "MAYBE-WARN-ABOUT-ONTOLOGY-MISSING-URI-INTERNAL", 1, 0, false);
        declareFunction("maybe_warn_about_ontology_missing_uri", "MAYBE-WARN-ABOUT-ONTOLOGY-MISSING-URI", 1, 0, false);
        declareFunction("ontology_uri_internal", "ONTOLOGY-URI-INTERNAL", 1, 0, false);
        declareFunction("ontology_uri", "ONTOLOGY-URI", 1, 0, false);
        declareFunction("owl_nart_name_internal", "OWL-NART-NAME-INTERNAL", 2, 0, false);
        declareFunction("owl_nart_name", "OWL-NART-NAME", 2, 0, false);
        declareFunction("uniquify_and_note_owl_fort_name", "UNIQUIFY-AND-NOTE-OWL-FORT-NAME", 2, 1, false);
        declareFunction("uniquifier_number_for_type", "UNIQUIFIER-NUMBER-FOR-TYPE", 2, 0, false);
        declareFunction("owl_nart_sort_string_internal", "OWL-NART-SORT-STRING-INTERNAL", 1, 0, false);
        declareFunction("owl_nart_sort_string", "OWL-NART-SORT-STRING", 1, 0, false);
        declareFunction("owl_str", "OWL-STR", 1, 0, false);
        declareFunction("owl_str_with_quotes_allowed", "OWL-STR-WITH-QUOTES-ALLOWED", 1, 0, false);
        declareFunction("owl_str_int", "OWL-STR-INT", 2, 0, false);
        declareFunction("strip_hl_artifacts", "STRIP-HL-ARTIFACTS", 1, 0, false);
        declareFunction("strip_nart_brackets", "STRIP-NART-BRACKETS", 1, 0, false);
        declareFunction("strip_hash_dollars", "STRIP-HASH-DOLLARS", 1, 0, false);
        declareFunction("sanitize_owl_name", "SANITIZE-OWL-NAME", 1, 0, false);
        declareFunction("nsanitize_owl_name", "NSANITIZE-OWL-NAME", 1, 0, false);
        declareFunction("invalid_owl_name_char_to_remove_p", "INVALID-OWL-NAME-CHAR-TO-REMOVE-P", 1, 0, false);
        declareFunction("valid_owl_name_char_p", "VALID-OWL-NAME-CHAR-P", 1, 0, false);
        declareFunction("strip_html_tags", "STRIP-HTML-TAGS", 1, 0, false);
        declareFunction("owl_external_id_string_internal", "OWL-EXTERNAL-ID-STRING-INTERNAL", 1, 0, false);
        declareFunction("owl_external_id_string", "OWL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction("owl_get_plural_generated_phrase", "OWL-GET-PLURAL-GENERATED-PHRASE", 1, 0, false);
        declareFunction("owl_get_singular_generated_phrase", "OWL-GET-SINGULAR-GENERATED-PHRASE", 1, 0, false);
        declareFunction("owl_get_generated_phrase", "OWL-GET-GENERATED-PHRASE", 1, 0, false);
        declareFunction("owl_generate_phrase_int_internal", "OWL-GENERATE-PHRASE-INT-INTERNAL", 2, 0, false);
        declareFunction("owl_generate_phrase_int", "OWL-GENERATE-PHRASE-INT", 2, 0, false);
        declareFunction("owl_generate_phrase_fallback", "OWL-GENERATE-PHRASE-FALLBACK", 1, 0, false);
        declareFunction("owl_pretty_string", "OWL-PRETTY-STRING", 1, 0, false);
        declareFunction("initialize_umbel_id_map", "INITIALIZE-UMBEL-ID-MAP", 0, 0, false);
        declareFunction("slurp_umbel_names", "SLURP-UMBEL-NAMES", 0, 1, false);
        declareFunction("umbel_uri_for_fort", "UMBEL-URI-FOR-FORT", 1, 0, false);
        declareFunction("umbel_uri_sentence_for_fort", "UMBEL-URI-SENTENCE-FOR-FORT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_owlification_file_alt() {
        defparameter("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*", T);
        defparameter("*OWL-USE-PRETTY-STRINGS?*", T);
        defparameter("*OWL-USE-ENTITY-REFERENCES?*", T);
        defparameter("*OWL-ASENTS-TO-EXPORT*", misc_utilities.uninitialized());
        defparameter("*OWL-EXPORT-TERMS*", NIL);
        defparameter("*OWL-REMOVE-ISA-INDIVIDUAL-ASENTS?*", NIL);
        defparameter("*OWL-PROFILING?*", NIL);
        defparameter("*OWL-EXPORT-FROM-OPENCYC-KB?*", NIL);
        defparameter("*OWL-EXPORT-CAP-PER-CATEGORY*", NIL);
        defparameter("*OWL-EXPORT-MT*", $$InferencePSC);
        deflexical("*OWL-EXPORT-PARAMETERS*", $list_alt18);
        deflexical("*OWL-EXPECTED-NART-COUNT*", $int$14822);
        deflexical("*OWL-SINGLETON-PREDICATE-LIST*", $list_alt33);
        deflexical("*OWL-CYCL-PREDICATE-TABLE-CACHING-STATE*", NIL);
        defparameter("*ASSERTION-ARG0S-EXCLUDED-FROM-OWL-EXPORT*", $list_alt49);
        deflexical("*OWL-CYCL-PREDICATES-TO-USE-AS-IS*", $list_alt50);
        deflexical("*OWL-CYCL-TYPE-TABLE*", $list_alt51);
        deflexical("*OWL-CYCL-PROPERTY-TABLE*", $list_alt52);
        deflexical("*OWL-CYCL-COLLECTION-TABLE*", $list_alt53);
        deflexical("*OWL-CYCL-XSD-SCHEMA-TABLE*", $list_alt54);
        deflexical("*OWL-FORT-ARG2-PREDICATES*", $list_alt55);
        deflexical("*OWL-PERMISSIVE-ARG2-PREDICATES*", $list_alt56);
        defparameter("*FORT-OWL-NAME-TABLE*", misc_utilities.uninitialized());
        deflexical("*OWL-NAME-UNIQUIFIER-LOCK*", make_lock($$$OWL_Name_Uniquifier));
        defvar("*FORT-OWL-NAME-COUNTER*", misc_utilities.uninitialized());
        deflexical("*OWL-TRANSITIVE-VIA-GENLS-ARG2-PREDS-TO-FILTER*", $list_alt92);
        deflexical("*OWL-BLACKLIST-SENTENCE-PATTERNS*", $list_alt108);
        defparameter("*ASENT-TO-OWL-CYCLIFY*", misc_utilities.uninitialized());
        defparameter("*OWL-INCLUDE-CYC-CONSTANT-POPUPS?*", NIL);
        deflexical("*OWL-LINK-CONSTANT-REFERENCES-FOR-THESE-PREDS*", $list_alt188);
        deflexical("*OWL-SPAN-ID-COUNTER*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*INVERSE-BINARY-PREDICATE-VAR*", $sym212$_PRED);
        deflexical("*RDF-NAME-INVALID-START-CHAR-PREFIX*", $str_alt238$_);
        deflexical("*ONTOLOGY-URIS*", $list_alt264);
        deflexical("*INVALID-OWL-NAME-CHARS-REMOVE*", $list_alt284);
        deflexical("*INVALID-OWL-NAME-CHARS-UNDERSCORE*", $list_alt285);
        deflexical("*UMBEL-ID-MAP*", misc_utilities.uninitialized());
        deflexical("*UMBEL-DATA-FILES*", $list_alt300);
        return NIL;
    }

    public static SubLObject init_owlification_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*", T);
            defparameter("*OWL-PREFER-ONTOLOGY-URIS?*", NIL);
            defparameter("*OWL-USE-PRETTY-STRINGS?*", T);
            defparameter("*OWL-USE-ENTITY-REFERENCES?*", T);
            defparameter("*OWL-ASENTS-TO-EXPORT*", misc_utilities.uninitialized());
            defparameter("*OWL-EXPORT-TERMS*", NIL);
            defparameter("*OWL-REMOVE-ISA-INDIVIDUAL-ASENTS?*", NIL);
            defparameter("*OWL-PROFILING?*", NIL);
            defparameter("*OWL-EXPORT-FROM-OPENCYC-KB?*", NIL);
            defparameter("*OWL-EXPORT-CAP-PER-CATEGORY*", NIL);
            defparameter("*OWL-EXPORT-MT*", $$InferencePSC);
            defparameter("*OWL-EXPORT-ONTOLOGY*", NIL);
            deflexical("*OWL-EXPORT-PARAMETERS*", $list18);
            deflexical("*OWL-EXPECTED-NART-COUNT*", $int$14822);
            deflexical("*OWL-SINGLETON-PREDICATE-LIST*", $list33);
            deflexical("*OWL-CYCL-PREDICATE-TABLE-CACHING-STATE*", NIL);
            defparameter("*ASSERTION-ARG0S-EXCLUDED-FROM-OWL-EXPORT*", $list48);
            deflexical("*OWL-CYCL-PREDICATES-TO-USE-AS-IS*", $list49);
            deflexical("*OWL-CYCL-TYPE-TABLE*", $list50);
            deflexical("*OWL-CYCL-PROPERTY-TABLE*", $list51);
            deflexical("*OWL-CYCL-COLLECTION-TABLE*", $list52);
            deflexical("*OWL-CYCL-XSD-SCHEMA-TABLE*", $list53);
            deflexical("*OWL-FORT-ARG2-PREDICATES*", $list54);
            deflexical("*OWL-PERMISSIVE-ARG2-PREDICATES*", $list55);
            defparameter("*FORT-OWL-NAME-TABLE*", misc_utilities.uninitialized());
            deflexical("*OWL-NAME-UNIQUIFIER-LOCK*", make_lock($$$OWL_Name_Uniquifier));
            defvar("*FORT-OWL-NAME-COUNTER*", misc_utilities.uninitialized());
            deflexical("*OWL-TRANSITIVE-VIA-GENLS-ARG2-PREDS-TO-FILTER*", $list90);
            deflexical("*OWL-BLACKLIST-SENTENCE-PATTERNS*", $list106);
            defparameter("*ASENT-TO-OWL-CYCLIFY*", misc_utilities.uninitialized());
            defparameter("*OWL-INCLUDE-CYC-CONSTANT-POPUPS?*", NIL);
            deflexical("*OWL-LINK-CONSTANT-REFERENCES-FOR-THESE-PREDS*", $list186);
            deflexical("*OWL-SPAN-ID-COUNTER*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*INVERSE-BINARY-PREDICATE-VAR*", $sym210$_PRED);
            deflexical("*RDF-NAME-INVALID-START-CHAR-PREFIX*", $str240$_);
            deflexical("*ONTOLOGY-URIS*", $list266);
            deflexical("*INVALID-OWL-NAME-CHARS-REMOVE*", $list286);
            deflexical("*INVALID-OWL-NAME-CHARS-UNDERSCORE*", $list287);
            deflexical("*OWL-HUMAN-READABLE-NAME-GENERATION-MT*", $$OWLHumanReadableNameGenerationMt);
            deflexical("*UMBEL-ID-MAP*", misc_utilities.uninitialized());
            deflexical("*UMBEL-DATA-FILES*", $list304);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*ASSERTION-ARG0S-EXCLUDED-FROM-OWL-EXPORT*", $list_alt49);
            deflexical("*OWL-CYCL-PREDICATES-TO-USE-AS-IS*", $list_alt50);
            deflexical("*OWL-CYCL-TYPE-TABLE*", $list_alt51);
            deflexical("*OWL-CYCL-PROPERTY-TABLE*", $list_alt52);
            deflexical("*OWL-CYCL-COLLECTION-TABLE*", $list_alt53);
            deflexical("*OWL-CYCL-XSD-SCHEMA-TABLE*", $list_alt54);
            deflexical("*OWL-FORT-ARG2-PREDICATES*", $list_alt55);
            deflexical("*OWL-PERMISSIVE-ARG2-PREDICATES*", $list_alt56);
            deflexical("*OWL-TRANSITIVE-VIA-GENLS-ARG2-PREDS-TO-FILTER*", $list_alt92);
            deflexical("*OWL-BLACKLIST-SENTENCE-PATTERNS*", $list_alt108);
            deflexical("*OWL-LINK-CONSTANT-REFERENCES-FOR-THESE-PREDS*", $list_alt188);
            deflexical("*INVERSE-BINARY-PREDICATE-VAR*", $sym212$_PRED);
            deflexical("*RDF-NAME-INVALID-START-CHAR-PREFIX*", $str_alt238$_);
            deflexical("*ONTOLOGY-URIS*", $list_alt264);
            deflexical("*INVALID-OWL-NAME-CHARS-REMOVE*", $list_alt284);
            deflexical("*INVALID-OWL-NAME-CHARS-UNDERSCORE*", $list_alt285);
            deflexical("*UMBEL-DATA-FILES*", $list_alt300);
        }
        return NIL;
    }

    public static SubLObject init_owlification_file_Previous() {
        defparameter("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*", T);
        defparameter("*OWL-PREFER-ONTOLOGY-URIS?*", NIL);
        defparameter("*OWL-USE-PRETTY-STRINGS?*", T);
        defparameter("*OWL-USE-ENTITY-REFERENCES?*", T);
        defparameter("*OWL-ASENTS-TO-EXPORT*", misc_utilities.uninitialized());
        defparameter("*OWL-EXPORT-TERMS*", NIL);
        defparameter("*OWL-REMOVE-ISA-INDIVIDUAL-ASENTS?*", NIL);
        defparameter("*OWL-PROFILING?*", NIL);
        defparameter("*OWL-EXPORT-FROM-OPENCYC-KB?*", NIL);
        defparameter("*OWL-EXPORT-CAP-PER-CATEGORY*", NIL);
        defparameter("*OWL-EXPORT-MT*", $$InferencePSC);
        defparameter("*OWL-EXPORT-ONTOLOGY*", NIL);
        deflexical("*OWL-EXPORT-PARAMETERS*", $list18);
        deflexical("*OWL-EXPECTED-NART-COUNT*", $int$14822);
        deflexical("*OWL-SINGLETON-PREDICATE-LIST*", $list33);
        deflexical("*OWL-CYCL-PREDICATE-TABLE-CACHING-STATE*", NIL);
        defparameter("*ASSERTION-ARG0S-EXCLUDED-FROM-OWL-EXPORT*", $list48);
        deflexical("*OWL-CYCL-PREDICATES-TO-USE-AS-IS*", $list49);
        deflexical("*OWL-CYCL-TYPE-TABLE*", $list50);
        deflexical("*OWL-CYCL-PROPERTY-TABLE*", $list51);
        deflexical("*OWL-CYCL-COLLECTION-TABLE*", $list52);
        deflexical("*OWL-CYCL-XSD-SCHEMA-TABLE*", $list53);
        deflexical("*OWL-FORT-ARG2-PREDICATES*", $list54);
        deflexical("*OWL-PERMISSIVE-ARG2-PREDICATES*", $list55);
        defparameter("*FORT-OWL-NAME-TABLE*", misc_utilities.uninitialized());
        deflexical("*OWL-NAME-UNIQUIFIER-LOCK*", make_lock($$$OWL_Name_Uniquifier));
        defvar("*FORT-OWL-NAME-COUNTER*", misc_utilities.uninitialized());
        deflexical("*OWL-TRANSITIVE-VIA-GENLS-ARG2-PREDS-TO-FILTER*", $list90);
        deflexical("*OWL-BLACKLIST-SENTENCE-PATTERNS*", $list106);
        defparameter("*ASENT-TO-OWL-CYCLIFY*", misc_utilities.uninitialized());
        defparameter("*OWL-INCLUDE-CYC-CONSTANT-POPUPS?*", NIL);
        deflexical("*OWL-LINK-CONSTANT-REFERENCES-FOR-THESE-PREDS*", $list186);
        deflexical("*OWL-SPAN-ID-COUNTER*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*INVERSE-BINARY-PREDICATE-VAR*", $sym210$_PRED);
        deflexical("*RDF-NAME-INVALID-START-CHAR-PREFIX*", $str240$_);
        deflexical("*ONTOLOGY-URIS*", $list266);
        deflexical("*INVALID-OWL-NAME-CHARS-REMOVE*", $list286);
        deflexical("*INVALID-OWL-NAME-CHARS-UNDERSCORE*", $list287);
        deflexical("*OWL-HUMAN-READABLE-NAME-GENERATION-MT*", $$OWLHumanReadableNameGenerationMt);
        deflexical("*UMBEL-ID-MAP*", misc_utilities.uninitialized());
        deflexical("*UMBEL-DATA-FILES*", $list304);
        return NIL;
    }

    public static final SubLObject setup_owlification_file_alt() {
        memoization_state.note_globally_cached_function(OWL_CYCL_PREDICATE_TABLE);
        memoization_state.note_memoized_function(OWL_EXPORT_CANONICALIZE_NART);
        memoization_state.note_memoized_function(NONEXPORTABLE_TERM_WARNING);
        note_funcall_helper_function($sym133$OWL_REDUNDANT_TYPE_ISA_ASENT_);
        note_funcall_helper_function($sym136$ISA_INDIVIDUAL_ASENT_);
        note_funcall_helper_function($sym117$OWL_ASENT__);
        note_funcall_helper_function(HTML_LINK_TO_OWL_URI);
        note_funcall_helper_function(HTML_LINK_TO_OWL_OPENCYC_URI);
        memoization_state.note_memoized_function(FIND_OR_CREATE_INVERSE_BINARY_PREDICATE);
        memoization_state.note_memoized_function(BEST_ISA_FOR_INDIVIDUAL);
        memoization_state.note_memoized_function(OWL_FORT_HUMAN_READABLE_NAME);
        memoization_state.note_memoized_function(URI_FOR_PREFIX_AND_ONTOLOGY);
        memoization_state.note_memoized_function(MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI);
        memoization_state.note_memoized_function(ONTOLOGY_URI);
        memoization_state.note_memoized_function(OWL_NART_NAME);
        memoization_state.note_memoized_function(OWL_NART_SORT_STRING);
        memoization_state.note_memoized_function(OWL_EXTERNAL_ID_STRING);
        memoization_state.note_memoized_function(OWL_GENERATE_PHRASE_INT);
        return NIL;
    }

    public static SubLObject setup_owlification_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(OWL_CYCL_PREDICATE_TABLE);
            memoization_state.note_memoized_function(OWL_EXPORT_CANONICALIZE_NART);
            memoization_state.note_memoized_function(NONEXPORTABLE_TERM_WARNING);
            note_funcall_helper_function($sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_);
            note_funcall_helper_function($sym134$ISA_INDIVIDUAL_ASENT_);
            note_funcall_helper_function($sym115$OWL_ASENT__);
            note_funcall_helper_function(HTML_LINK_TO_OWL_URI);
            note_funcall_helper_function(HTML_LINK_TO_OWL_OPENCYC_URI);
            memoization_state.note_memoized_function(FIND_OR_CREATE_INVERSE_BINARY_PREDICATE);
            memoization_state.note_memoized_function(BEST_ISA_FOR_INDIVIDUAL);
            memoization_state.note_memoized_function(OWL_FORT_HUMAN_READABLE_NAME);
            memoization_state.note_memoized_function(URI_FOR_PREFIX_AND_ONTOLOGY);
            memoization_state.note_memoized_function(MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI);
            memoization_state.note_memoized_function(ONTOLOGY_URI);
            memoization_state.note_memoized_function(OWL_NART_NAME);
            memoization_state.note_memoized_function(OWL_NART_SORT_STRING);
            memoization_state.note_memoized_function(OWL_EXTERNAL_ID_STRING);
            memoization_state.note_memoized_function(OWL_GENERATE_PHRASE_INT);
        }
        if (SubLFiles.USE_V2) {
            note_funcall_helper_function($sym133$OWL_REDUNDANT_TYPE_ISA_ASENT_);
            note_funcall_helper_function($sym136$ISA_INDIVIDUAL_ASENT_);
            note_funcall_helper_function($sym117$OWL_ASENT__);
        }
        return NIL;
    }

    public static SubLObject setup_owlification_file_Previous() {
        memoization_state.note_globally_cached_function(OWL_CYCL_PREDICATE_TABLE);
        memoization_state.note_memoized_function(OWL_EXPORT_CANONICALIZE_NART);
        memoization_state.note_memoized_function(NONEXPORTABLE_TERM_WARNING);
        note_funcall_helper_function($sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_);
        note_funcall_helper_function($sym134$ISA_INDIVIDUAL_ASENT_);
        note_funcall_helper_function($sym115$OWL_ASENT__);
        note_funcall_helper_function(HTML_LINK_TO_OWL_URI);
        note_funcall_helper_function(HTML_LINK_TO_OWL_OPENCYC_URI);
        memoization_state.note_memoized_function(FIND_OR_CREATE_INVERSE_BINARY_PREDICATE);
        memoization_state.note_memoized_function(BEST_ISA_FOR_INDIVIDUAL);
        memoization_state.note_memoized_function(OWL_FORT_HUMAN_READABLE_NAME);
        memoization_state.note_memoized_function(URI_FOR_PREFIX_AND_ONTOLOGY);
        memoization_state.note_memoized_function(MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI);
        memoization_state.note_memoized_function(ONTOLOGY_URI);
        memoization_state.note_memoized_function(OWL_NART_NAME);
        memoization_state.note_memoized_function(OWL_NART_SORT_STRING);
        memoization_state.note_memoized_function(OWL_EXTERNAL_ID_STRING);
        memoization_state.note_memoized_function(OWL_GENERATE_PHRASE_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_owlification_file();
    }

    @Override
    public void initializeVariables() {
        init_owlification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_owlification_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("ASENTS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt4$_OWL_EXPORT_TERMS__is_not_set_ = makeString("*OWL-EXPORT-TERMS* is not set.");

    static private final SubLList $list_alt7 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("VERSION-DATE"), list(QUOTE, makeSymbol("*OWL-EXPORT-VERSION-DATE*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(makeSymbol("*OWL-USE-PRETTY-STRINGS?*"), T);

    static private final SubLList $list_alt10 = list(makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*"), T);

    static private final SubLList $list_alt11 = list(list(makeSymbol("*OWL-USE-ENTITY-REFERENCES?*"), NIL), list(makeSymbol("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*"), T), list(makeSymbol("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*"), T), list(makeSymbol("*OWL-EXPORT-FROM-OPENCYC-KB?*"), T));

    static private final SubLList $list_alt14 = list(makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*"), NIL);

    static private final SubLString $str_alt17$Human_readable_OWL_export_require = makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");

    static private final SubLList $list_alt18 = list(makeSymbol("*XML-STREAM*"), makeSymbol("*OWL-USE-PRETTY-STRINGS?*"), makeSymbol("*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*"), makeSymbol("*OWL-USE-ENTITY-REFERENCES?*"), makeSymbol("*OWL-EXPORT-VERSION-DATE*"), makeSymbol("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*"), makeSymbol("*OWL-EXPORT-FROM-OPENCYC-KB?*"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("TERM-VAR"), makeSymbol("TERM-ITERATOR"), makeSymbol("&OPTIONAL"), makeSymbol("TERM-COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt24 = list(makeSymbol("FUNCTION"), EQUAL);

    static private final SubLList $list_alt25 = list(NIL);

    static private final SubLList $list_alt28 = list(makeSymbol("*OWL-EXPORT-TERMS*"));

    static private final SubLList $list_alt33 = list(reader_make_constant_shell("preferredEnglish"), reader_make_constant_shell("cycName"), reader_make_constant_shell("comment"), reader_make_constant_shell("owlExternalID"), reader_make_constant_shell("termOfUnit"));

    static private final SubLList $list_alt35 = cons(reader_make_constant_shell("specialIsa"), makeString("rdf:type"));

    static private final SubLList $list_alt36 = cons(reader_make_constant_shell("preferredEnglish"), makeString("rdfs:label"));

    static private final SubLList $list_alt37 = cons(reader_make_constant_shell("skos:prefLabel"), makeString("skos:prefLabel"));

    static private final SubLString $str_alt41$_ = makeString(":");

    static private final SubLList $list_alt43 = cons(reader_make_constant_shell("comment"), makeString("rdfs:comment"));

    static private final SubLList $list_alt46 = list(new SubLObject[]{ cons(reader_make_constant_shell("broaderTerm"), makeString("broaderTerm")), cons(reader_make_constant_shell("owlSameAs"), makeString("owl:sameAs")), cons(reader_make_constant_shell("rdfURI"), makeString("owl:sameAs")), cons(reader_make_constant_shell("owl:inverseOf"), makeString("owl:inverseOf")), cons(reader_make_constant_shell("isa"), makeString("rdf:type")), cons(reader_make_constant_shell("genls"), makeString("rdfs:subClassOf")), cons(reader_make_constant_shell("genlPreds"), makeString("rdfs:subPropertyOf")), cons(reader_make_constant_shell("arg1Isa"), makeString("rdfs:domain")), cons(reader_make_constant_shell("arg1SometimesIsa"), makeString("rdfs:domain")), cons(reader_make_constant_shell("arg2Isa"), makeString("rdfs:range")), cons(reader_make_constant_shell("arg2SometimesIsa"), makeString("rdfs:range")), cons(reader_make_constant_shell("equals"), makeString("owl:sameAs")), cons(reader_make_constant_shell("owlIntersectionOf"), makeString("owl:intersectionOf")), cons(reader_make_constant_shell("disjointWith"), makeString("owl:disjointWith")), cons(reader_make_constant_shell("OWLRestrictionFn"), makeString("owl:Restriction")), cons(reader_make_constant_shell("owlOnProperty"), makeString("owl:onProperty")), cons(reader_make_constant_shell("owlHasValue"), makeString("owl:hasValue")) });

    public static final SubLSymbol $kw48$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt49 = list(reader_make_constant_shell("prettyString"), reader_make_constant_shell("prettyString-Canonical"), reader_make_constant_shell("termOfUnit"));

    static private final SubLList $list_alt50 = list(reader_make_constant_shell("broaderThan"), reader_make_constant_shell("broaderTerm"), reader_make_constant_shell("requiredActorSlots"));

    static private final SubLList $list_alt51 = list(cons(reader_make_constant_shell("Collection"), makeString("owl:Class")), cons(reader_make_constant_shell("BinaryPredicate"), makeString("owl:ObjectProperty")));

    static private final SubLList $list_alt52 = list(new SubLObject[]{ cons(reader_make_constant_shell("SubLAtomicTerm"), makeString("http://www.w3.org/2000/01/rdf-schema#Literal")), cons(reader_make_constant_shell("isa"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")), cons(reader_make_constant_shell("genls"), makeString("http://www.w3.org/2000/01/rdf-schema#subClassOf")), cons(reader_make_constant_shell("genlPreds"), makeString("http://www.w3.org/2000/01/rdf-schema#subPropertyOf")), cons(reader_make_constant_shell("comment"), makeString("http://www.w3.org/2000/01/rdf-schema#comment")), cons(reader_make_constant_shell("disjointWith"), makeString("http://www.w3.org/2002/07/owl#disjointWith")), cons(reader_make_constant_shell("different"), makeString("http://www.w3.org/2002/07/owl#differentFrom")), cons(reader_make_constant_shell("equals"), makeString("http://www.w3.org/2002/07/owl#sameAs")), cons(reader_make_constant_shell("arg1Isa"), makeString("http://www.w3.org/2000/01/rdf-schema#domain")), cons(reader_make_constant_shell("arg2Isa"), makeString("http://www.w3.org/2000/01/rdf-schema#range")), cons(reader_make_constant_shell("arg1SometimesIsa"), makeString("http://www.w3.org/2000/01/rdf-schema#domain")), cons(reader_make_constant_shell("arg2SometimesIsa"), makeString("http://www.w3.org/2000/01/rdf-schema#range")), cons(reader_make_constant_shell("ontologyVersionInfo"), makeString("http://www.w3.org/2002/07/owl#versionInfo")), cons(reader_make_constant_shell("ontologyPriorVersion"), makeString("http://www.w3.org/2002/07/owl#priorVersion")), cons(reader_make_constant_shell("incompatibleOntology"), makeString("http://www.w3.org/2002/07/owl#incompatibleWith")), cons(reader_make_constant_shell("owlDifferentFrom"), makeString("http://www.w3.org/2002/07/owl#differentFrom")), cons(reader_make_constant_shell("backwardsCompatibleOntology"), makeString("http://www.w3.org/2002/07/owl#backwardCompatibleWith")), cons(reader_make_constant_shell("inverseBinaryPredicateOf"), makeString("http://www.w3.org/2002/07/owl#inverseOf")), cons(reader_make_constant_shell("coExtensional"), makeString("http://www.w3.org/2002/07/owl#equivalentClass")), cons(reader_make_constant_shell("owlRestrictionAllValuesFrom"), makeString("http://www.w3.org/2002/07/owl#allValuesFrom")) });

    static private final SubLList $list_alt53 = list(new SubLObject[]{ list(reader_make_constant_shell("owl:Thing"), makeString("owl"), makeString("Thing")), list(reader_make_constant_shell("owl:Nothing"), makeString("owl"), makeString("Nothing")), list(reader_make_constant_shell("OWLClass"), makeString("owl"), makeString("Class")), list(reader_make_constant_shell("OWLDeprecatedClass"), makeString("owl"), makeString("DeprecatedClass")), list(reader_make_constant_shell("OWLTransitiveProperty"), makeString("owl"), makeString("TransitiveProperty")), list(reader_make_constant_shell("OWLSymmetricProperty"), makeString("owl"), makeString("SymmetricProperty")), list(reader_make_constant_shell("OWLObjectProperty"), makeString("owl"), makeString("ObjectProperty")), list(reader_make_constant_shell("OWLDatatypeProperty"), makeString("owl"), makeString("DatatypeProperty")), list(reader_make_constant_shell("OWLDeprecatedProperty"), makeString("owl"), makeString("DeprecatedProperty")), list(reader_make_constant_shell("OWLFunctionalProperty"), makeString("owl"), makeString("FunctionalProperty")), list(reader_make_constant_shell("OWLInverseFunctionalProperty"), makeString("owl"), makeString("InverseFunctionalProperty")) });

    static private final SubLList $list_alt54 = list(new SubLObject[]{ cons(reader_make_constant_shell("UniformResourceIdentifier"), makeString("http://www.w3.org/2001/XMLSchema#uriReference")), cons(reader_make_constant_shell("UniformResourceLocator"), makeString("http://www.w3.org/2001/XMLSchema#uriReference")), cons(reader_make_constant_shell("Date"), makeString("http://www.w3.org/2001/XMLSchema#date")), cons(reader_make_constant_shell("SubLRealNumber"), makeString("http://www.w3.org/2001/XMLSchema#double")), cons(reader_make_constant_shell("SubLString"), makeString("http://www.w3.org/2001/XMLSchema#string")), cons(reader_make_constant_shell("SubLInteger"), makeString("http://www.w3.org/2001/XMLSchema#integer")), cons(reader_make_constant_shell("PositiveInteger"), makeString("http://www.w3.org/2001/XMLSchema#positiveInteger")), cons(reader_make_constant_shell("Integer"), makeString("http://www.w3.org/2001/XMLSchema#integer")), cons(reader_make_constant_shell("NonNegativeInteger"), makeString("http://www.w3.org/2001/XMLSchema#nonNegativeInteger")), cons(reader_make_constant_shell("SubLBoolean"), makeString("http://www.w3.org/2001/XMLSchema#boolean")), cons(reader_make_constant_shell("CalendarSecond"), makeString("http://www.w3.org/2001/XMLSchema#dateTime")), cons(reader_make_constant_shell("CalendarDay"), makeString("http://www.w3.org/2001/XMLSchema#date")), cons(reader_make_constant_shell("CalendarMonth"), makeString("http://www.w3.org/2001/XMLSchema#gYearMonth")), cons(reader_make_constant_shell("CalendarYear"), makeString("http://www.w3.org/2001/XMLSchema#gYear")), cons(reader_make_constant_shell("DayOfMonthType"), makeString("http://www.w3.org/2001/XMLSchema#gDay")), cons(reader_make_constant_shell("GregorianMonthType"), makeString("http://www.w3.org/2001/XMLSchema#gMonth")) });

    static private final SubLList $list_alt55 = list(new SubLObject[]{ reader_make_constant_shell("broaderThan"), reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg1SometimesIsa"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg2SometimesIsa"), reader_make_constant_shell("equals") });

    static private final SubLList $list_alt56 = list(reader_make_constant_shell("termOfUnit"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("DUMP-DIRECTORY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt58 = list(list(makeSymbol("*FORT-OWL-NAME-TABLE*"), list(makeSymbol("UNINITIALIZED"))));

    static private final SubLString $str_alt64$_ = makeString("/");

    static private final SubLString $str_alt65$fort_owl_names_csv = makeString("fort-owl-names.csv");

    static private final SubLString $str_alt67$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt68 = cons(makeSymbol("NAME"), makeSymbol("TYPE"));

    static private final SubLString $str_alt69$_S___S__ = makeString("~S, ~S~%");

    static private final SubLString $str_alt72$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt74 = list(list(makeKeyword("OR"), reader_make_constant_shell("BinaryPredicate"), reader_make_constant_shell("Thing")));

    static private final SubLList $list_alt76 = cons(list(makeKeyword("OR"), reader_make_constant_shell("synonymousExternalConcept"), reader_make_constant_shell("synonymousExternalPred-Inverse")), makeKeyword("ANYTHING"));

    static private final SubLString $str_alt77$unexpected_asent__s = makeString("unexpected asent ~s");



    static private final SubLString $str_alt79$Caught_error_OWL_cyclifying__S___ = makeString("Caught error OWL-cyclifying ~S:~% ~S");

    static private final SubLString $str_alt80$_S_is_not_a_FORT_ = makeString("~S is not a FORT.");



    static private final SubLString $str_alt83$Can_t_export_OWL_Ontology_as_part = makeString("Can't export OWL Ontology as part of export of larger ontology: ~S");

    static private final SubLString $str_alt84$Sorting_ = makeString("Sorting ");

    static private final SubLString $str_alt85$_terms_for_OWL_export___ = makeString(" terms for OWL export...");

    static private final SubLString $str_alt87$Couldn_t_resolve__S_to_a_canonica = makeString("Couldn't resolve ~S to a canonical FORT.");

    static private final SubLSymbol $sym91$SUBSUMED_OWL_ASENT_ = makeSymbol("SUBSUMED-OWL-ASENT?");

    static private final SubLList $list_alt92 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLString $str_alt94$Can_t_export__S = makeString("Can't export ~S");

    static private final SubLString $str_alt95$Not_a_collection___S = makeString("Not a collection: ~S");

    static private final SubLString $str_alt98$Restriction_property_is_not_a_bin = makeString("Restriction property is not a binary predicate(!): ~S");

    static private final SubLList $list_alt99 = list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"));

    static private final SubLString $str_alt100$Couldn_t_find_or_create_inverse_o = makeString("Couldn't find or create inverse of ~S");

    static private final SubLList $list_alt101 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"));

    static private final SubLString $str_alt102$restriction_property_is_not_a_FOR = makeString("restriction property is not a FORT: ~S");

    static private final SubLSymbol $sym103$OWL_FORT__ = makeSymbol("OWL-FORT-<");

    static private final SubLSymbol $sym106$OWL_BLACKLIST_SENTENCE_ = makeSymbol("OWL-BLACKLIST-SENTENCE?");

    static private final SubLSymbol $sym107$OWLIFIABLE_SENTENCE_ = makeSymbol("OWLIFIABLE-SENTENCE?");

    static private final SubLList $list_alt108 = list(cons(list($TEST, makeSymbol("OWL-BLACKLIST-PREDICATE?")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("quotedIsa"), makeKeyword("ANYTHING"), reader_make_constant_shell("TerrorismOntologyConstant")));

    static private final SubLSymbol $sym109$OWL_ISA_LIT_ = makeSymbol("OWL-ISA-LIT?");

    static private final SubLSymbol $sym110$OWL_GENLS_LIT_ = makeSymbol("OWL-GENLS-LIT?");

    static private final SubLSymbol $sym111$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_ = makeSymbol("VALID-COLLECTION-FORT-FOR-OWL-EXPORT?");

    public static final SubLObject $const113$synonymousExternalConceptWRTPredi = reader_make_constant_shell("synonymousExternalConceptWRTPredicate");

    static private final SubLSymbol $sym117$OWL_ASENT__ = makeSymbol("OWL-ASENT-<");

    static private final SubLSymbol $sym118$COMMENT_ASENT_ = makeSymbol("COMMENT-ASENT?");

    static private final SubLList $list_alt120 = listS(list(makeKeyword("OR"), reader_make_constant_shell("synonymousExternalConcept"), reader_make_constant_shell("synonymousExternalPred-Inverse")), list($TEST, makeSymbol("FORT-P")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt121 = list(reader_make_constant_shell("SecondFn"), reader_make_constant_shell("DayFn"), reader_make_constant_shell("MonthFn"), reader_make_constant_shell("YearFn"), reader_make_constant_shell("CenturyFn"));

    static private final SubLList $list_alt124 = list(reader_make_constant_shell("OWLFunctionalProperty"));

    static private final SubLList $list_alt125 = list(reader_make_constant_shell("OWLInverseFunctionalProperty"));

    static private final SubLList $list_alt128 = list(TWO_INTEGER, ONE_INTEGER);

    static private final SubLList $list_alt130 = list(TWO_INTEGER);

    static private final SubLList $list_alt131 = list(ONE_INTEGER, ONE_INTEGER);

    static private final SubLList $list_alt132 = list(ONE_INTEGER);

    static private final SubLSymbol $sym133$OWL_REDUNDANT_TYPE_ISA_ASENT_ = makeSymbol("OWL-REDUNDANT-TYPE-ISA-ASENT?");

    public static final SubLObject $const134$rdfs_subClassOf = reader_make_constant_shell("rdfs:subClassOf");

    static private final SubLSymbol $sym135$ISA_LIT_ = makeSymbol("ISA-LIT?");

    static private final SubLSymbol $sym136$ISA_INDIVIDUAL_ASENT_ = makeSymbol("ISA-INDIVIDUAL-ASENT?");

    static private final SubLString $str_alt140$unexpected_owl_cycl_pred_for_asen = makeString("unexpected owl-cycl-pred for asent ~s");

    static private final SubLString $str_alt141$Caught_error__S___while_trying_to = makeString("Caught error ~S~% while trying to OWL-cyclify~% ~S");

    static private final SubLList $list_alt142 = list(makeSymbol("PREDICATE"), makeSymbol("SUBJECT"), makeSymbol("OBJECT"));

    static private final SubLSymbol $sym148$FORT_IN_OWL_EXPORT_ = makeSymbol("FORT-IN-OWL-EXPORT?");

    static private final SubLSymbol $sym149$OWLIFIABLE_ARG1_ = makeSymbol("OWLIFIABLE-ARG1?");

    static private final SubLString $str_alt150$Invalid_term_type___S_for__S = makeString("Invalid term type: ~S for ~S");

    static private final SubLString $str_alt155$Unexpected_EL_formula_arg2___S = makeString("Unexpected EL formula arg2: ~S");

    static private final SubLList $list_alt156 = list(makeSymbol("ENTITY"), makeSymbol("LOCAL-NAME"));

    static private final SubLString $str_alt157$Raw_term_string_for__S___S = makeString("Raw term string for ~S: ~S");

    static private final SubLString $str_alt158$Need_XSD_datatype_for__S = makeString("Need XSD datatype for ~S");

    static private final SubLString $str_alt169$Don_t_know_XSD_datatype_for__S = makeString("Don't know XSD datatype for ~S");

    static private final SubLString $str_alt170$YYYY_MM_DD = makeString("YYYY-MM-DD");

    static private final SubLString $str_alt171$YYYY_MM = makeString("YYYY-MM");

    static private final SubLString $str_alt173$YYYY_MM_DDTHH_MM_SS = makeString("YYYY-MM-DDTHH:MM:SS");

    static private final SubLString $str_alt174$_ = makeString("&");

    static private final SubLString $str_alt175$_ = makeString(";");

    static private final SubLList $list_alt176 = list(reader_make_constant_shell("URIWithFragmentFn"), reader_make_constant_shell("URIInNamespaceFn"), reader_make_constant_shell("URIFn"));

    static private final SubLString $str_alt182$_ = makeString("#");

    static private final SubLSymbol $sym183$_URI_STRING = makeSymbol("?URI-STRING");

    static private final SubLList $list_alt185 = list(makeSymbol("?URI-STRING"));

    static private final SubLList $list_alt186 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLString $str_alt187$Can_t_convert_URI_FORT_to_string_ = makeString("Can't convert URI FORT to string: ~S");

    static private final SubLList $list_alt188 = list(reader_make_constant_shell("comment"));

    static private final SubLString $str_alt191$TagToTip__ = makeString("TagToTip('");

    static private final SubLString $str_alt192$__ = makeString("')");

    static private final SubLString $str_alt193$UnTip__ = makeString("UnTip()");

    static private final SubLString $str_alt194$owl_cyc_constant_tooltip = makeString("owl_cyc_constant_tooltip");

    static private final SubLString $str_alt195$display__none_ = makeString("display: none;");

    static private final SubLString $str_alt196$comment_header = makeString("comment_header");

    static private final SubLString $str_alt197$ID___A = makeString("ID: ~A");

    static private final SubLString $str_alt198$comment_body = makeString("comment_body");

    static private final SubLString $str_alt199$cyc_term = makeString("cyc_term");

    static private final SubLString $str_alt201$No_comment_ = makeString("No comment.");

    public static final SubLObject $const203$SubcollectionOfWithRelationToType = reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn");

    public static final SubLObject $const205$SubcollectionOfWithRelationFromTy = reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn");

    static private final SubLString $str_alt206$Couldn_t_find_inverse_of__S = makeString("Couldn't find inverse of ~S");

    static private final SubLString $str_alt207$unexpected_subcollection_function = makeString("unexpected subcollection function ~s");







    static private final SubLSymbol $sym212$_PRED = makeSymbol("?PRED");

    static private final SubLList $list_alt217 = list(reader_make_constant_shell("BinaryPredicate"));

    static private final SubLString $str_alt220$__Created__S__ = makeString("~&Created ~S~%");

    static private final SubLSymbol $sym221$BINARY_PREDICATE_ = makeSymbol("BINARY-PREDICATE?");

    static private final SubLList $list_alt222 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));

    static private final SubLList $list_alt223 = list(makeSymbol("OWL-INTERSECTION-FN"), makeSymbol("CLASS"), list(makeSymbol("OWL-RESTRICTION-FN"), makeSymbol("OWL-ON-PROPERTY"), makeSymbol("PROPERTY"), makeSymbol("OWL-HAS-VALUE"), makeSymbol("VALUE")));

    static private final SubLString $str_alt224$owl_Restriction = makeString("owl:Restriction");

    static private final SubLString $str_alt225$owl_onProperty = makeString("owl:onProperty");

    static private final SubLString $str_alt226$owl_hasValue = makeString("owl:hasValue");

    static private final SubLString $str_alt235$Need_full_URI_for__S = makeString("Need full URI for ~S");

    static private final SubLString $str_alt238$_ = makeString("_");

    static private final SubLList $list_alt240 = list(CHAR_dollar, CHAR_underbar, CHAR_colon);

    static private final SubLString $str_alt242$unexpected_term__s = makeString("unexpected term ~s");

    static private final SubLString $str_alt246$Timed_out_generating_phrases_for_ = makeString("Timed out generating phrases for ~S.~% Phrases generated: ~S");

    static private final SubLList $list_alt247 = list(makeSymbol("THIS-TERM"), makeSymbol("ONTOLOGY"), makeSymbol("LOCAL-NAME"));

    static private final SubLList $list_alt249 = list(CHAR_colon);

    static private final SubLList $list_alt250 = list(makeSymbol("PREFIX"), makeSymbol("LOCAL-NAME"));

    static private final SubLList $list_alt253 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    static private final SubLString $str_alt256$Couldn_t_find_expansion_for__S_wr = makeString("Couldn't find expansion for ~S wrt ~S");

    public static final SubLObject $const257$owl_inverseOf = reader_make_constant_shell("owl:inverseOf");

    static private final SubLString $str_alt258$Can_t_get_URI_from_non_FORT_ontol = makeString("Can't get URI from non-FORT ontology ~S");

    static private final SubLString $str_alt259$Can_t_get_URI_from_non_string_loc = makeString("Can't get URI from non-string local name ~S");

    static private final SubLList $list_alt260 = list(makeString("#"), makeString("/"));

    static private final SubLString $str_alt261$http___www_w3_org_2006_03_wn_wn20 = makeString("http://www.w3.org/2006/03/wn/wn20/instances");

    static private final SubLString $str_alt263$Couldn_t_find_URI_for__S_ = makeString("Couldn't find URI for ~S.");

    static private final SubLList $list_alt264 = list(cons(reader_make_constant_shell("FOAFOntology"), makeString("http://xmlns.com/foaf/0.1/")));

    static private final SubLList $list_alt268 = list(makeKeyword("URI"));

    static private final SubLList $list_alt269 = list(list(makeKeyword("OR"), reader_make_constant_shell("URLFn"), reader_make_constant_shell("URIFn")), list(makeKeyword("AND"), list($TEST, makeSymbol("STRINGP")), list($BIND, makeSymbol("STRING"))));

    static private final SubLString $str_alt272$_ = makeString(" ");

    static private final SubLString $str_alt275$_ = makeString("(");

    static private final SubLString $str_alt276$___ = makeString("#<(");

    static private final SubLString $str_alt277$_ = makeString(")");

    static private final SubLString $str_alt278$__ = makeString(")>");

    static private final SubLString $str_alt279$__ = makeString("#$");

    static private final SubLString $str_alt280$_u = makeString("&u");

    static private final SubLString $str_alt281$__ = makeString("</");

    static private final SubLList $list_alt284 = list(CHAR_question, CHAR_comma, CHAR_lbrace, CHAR_rbrace, CHAR_hash);

    static private final SubLList $list_alt285 = list(new SubLObject[]{ CHAR_hyphen, CHAR_space, CHAR_quotation, CHAR_quote, CHAR_backquote, CHAR_backslash, CHAR_colon, CHAR_slash, CHAR_semicolon, CHAR_percent, CHAR_less, CHAR_greater, CHAR_ampersand, CHAR_dollar, CHAR_lparen, CHAR_rparen, CHAR_lbrace, CHAR_rbrace, CHAR_exclamation, CHAR_at, CHAR_caret, CHAR_period });

    static private final SubLString $str_alt286$HTML_tags_not_stripped_from__s = makeString("HTML tags not stripped from ~s");

    static private final SubLString $str_alt289$ID__S_for__S_is_suspiciously_shor = makeString("ID ~S for ~S is suspiciously short (~D characters)");

    static private final SubLList $list_alt291 = list(reader_make_constant_shell("plural"));

    static private final SubLList $list_alt292 = list(reader_make_constant_shell("singular"));

    static private final SubLList $list_alt300 = list(cons(makeString("/cyc/projects/opencyc/owl-export/mappings/umbel_subject_concepts_latest.csv"), makeString("http://umbel.org/umbel/sc/")), cons(makeString("/cyc/projects/opencyc/owl-export/mappings/umbel_abstract_concepts_latest.csv"), makeString("http://umbel.org/umbel/ac/")));

    static private final SubLList $list_alt301 = cons(makeSymbol("FILE"), makeSymbol("BASE-URI"));

    static private final SubLString $str_alt303$_ = makeString("\"");

    static private final SubLList $list_alt304 = list(makeSymbol("UMBEL-ID"), makeSymbol("CYC-ID"));
}

/**
 * Total time: 1521 ms
 */
