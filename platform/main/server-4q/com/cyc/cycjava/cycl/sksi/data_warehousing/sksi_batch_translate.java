package com.cyc.cycjava.cycl.sksi.data_warehousing;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
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
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_batch_translate extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_batch_translate();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate";

    public static final String myFingerPrint = "561a5c1d0811c0954b649502da00991fed369abdeb8eb71aadf70f6bfcf0eb96";

    // defvar
    public static final SubLSymbol $sksi_batch_translate_only_asserted_meaning_sentencesP$ = makeSymbol("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*");

    // defvar
    public static final SubLSymbol $sksi_batch_translate_coerce_typesP$ = makeSymbol("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*");

    // defparameter
    public static final SubLSymbol $sksi_batch_translate_type_coercion_successfulP$ = makeSymbol("*SKSI-BATCH-TRANSLATE-TYPE-COERCION-SUCCESSFUL?*");

    // defparameter
    private static final SubLSymbol $sksi_batch_assert_justification_table$ = makeSymbol("*SKSI-BATCH-ASSERT-JUSTIFICATION-TABLE*");

    // defparameter
    private static final SubLSymbol $sksi_batch_primary_key_columns$ = makeSymbol("*SKSI-BATCH-PRIMARY-KEY-COLUMNS*");



    // defparameter
    public static final SubLSymbol $sksi_batch_sql_order_by_primary_keyP$ = makeSymbol("*SKSI-BATCH-SQL-ORDER-BY-PRIMARY-KEY?*");

    // defparameter
    public static final SubLSymbol $sksi_batch_add_operations_to_transcriptP$ = makeSymbol("*SKSI-BATCH-ADD-OPERATIONS-TO-TRANSCRIPT?*");

    // defparameter
    private static final SubLSymbol $current_sksi_batch_template$ = makeSymbol("*CURRENT-SKSI-BATCH-TEMPLATE*");

    // defvar
    public static final SubLSymbol $sksi_batch_templates$ = makeSymbol("*SKSI-BATCH-TEMPLATES*");

    // defparameter
    public static final SubLSymbol $sksi_batch_translate_add_argument_callback$ = makeSymbol("*SKSI-BATCH-TRANSLATE-ADD-ARGUMENT-CALLBACK*");

    // defparameter
    public static final SubLSymbol $sksi_batch_translate_unassert_callback$ = makeSymbol("*SKSI-BATCH-TRANSLATE-UNASSERT-CALLBACK*");

    // defparameter
    private static final SubLSymbol $sksi_batch_asserting_translations_of_this_table$ = makeSymbol("*SKSI-BATCH-ASSERTING-TRANSLATIONS-OF-THIS-TABLE*");

    // defparameter
    public static final SubLSymbol $sksi_row_iterator_overrides$ = makeSymbol("*SKSI-ROW-ITERATOR-OVERRIDES*");

    // deflexical
    private static final SubLSymbol $sksi_schema_translation_lifting_rule_sentence$ = makeSymbol("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-SENTENCE*");

    // deflexical
    private static final SubLSymbol $sksi_schema_translation_lifting_rule_mt$ = makeSymbol("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-MT*");















    private static final SubLList $list3 = list(list(makeSymbol("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*"), T));

    private static final SubLList $list4 = list(list(makeSymbol("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*"), NIL));

    private static final SubLList $list5 = list(list(makeSymbol("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*"), T));

    private static final SubLList $list6 = list(list(makeSymbol("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*"), NIL));

    private static final SubLList $list7 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sksi_batch_sql_select_statement$ = makeSymbol("*SKSI-BATCH-SQL-SELECT-STATEMENT*");



    private static final SubLString $str10$in_mt___S___ = makeString("in mt: ~S.~%");

    private static final SubLString $str11$f___S___ = makeString("f: ~S.~%");



    private static final SubLString $str13$Unable_to_open__S = makeString("Unable to open ~S");











    private static final SubLString $str19$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str24$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLString $str26$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str27$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str28$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str29$____Translation_Time____A__ = makeString("~%;;Translation Time : ~A~%");

    private static final SubLString $str30$_____ = makeString(";; ~%");

    private static final SubLString $str31$___Meta_Mt_____________S__ = makeString(";; Meta Mt          : ~S~%");

    private static final SubLString $str32$___Source______________S__ = makeString(";; Source           : ~S~%");

    private static final SubLString $str33$___Physical_Schema_____S__ = makeString(";; Physical Schema  : ~S~%");

    private static final SubLString $str34$___Logical_Schema______S__ = makeString(";; Logical Schema   : ~S~%");

    private static final SubLString $str35$___Content_Mt__________S = makeString(";; Content Mt       : ~S");

    private static final SubLString $str36$________S_ = makeString("~%~%;; ~S ");

    private static final SubLSymbol SKSI_TRANSLATE_ITERATE_DONE = makeSymbol("SKSI-TRANSLATE-ITERATE-DONE");

    private static final SubLSymbol SKSI_TRANSLATE_ITERATE_NEXT = makeSymbol("SKSI-TRANSLATE-ITERATE-NEXT");



    public static final SubLList $list40 = list(makeSymbol("TUPLE-ITERATOR"), makeSymbol("&REST"), makeSymbol("REST"));



    private static final SubLList $list42 = list(makeSymbol("TUPLE-ITERATOR"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("PHYSICAL-SCHEMA"), makeSymbol("LOGICAL-SCHEMA"), makeSymbol("CONTENT-MT"), makeSymbol("META-MT"), makeSymbol("CHECK-WFF-NESS?"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLString $str44$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str45$__a__Translating__s_wrt__a__a__a_ = makeString("[~a] Translating ~s wrt ~a ~a ~a into ~a");

    private static final SubLString $str46$Raw_sentence___s = makeString("Raw sentence: ~s");

    private static final SubLString $str47$Decoded_sentence___s = makeString("Decoded sentence: ~s");

    private static final SubLString $str48$Logical_sentence___s = makeString("Logical sentence: ~s");

    private static final SubLString $str49$Logical_conjunct___s = makeString("Logical conjunct: ~s");

    private static final SubLString $str50$Skipped_due_to_wholly_untranslata = makeString("Skipped due to wholly untranslatable.");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLString $str52$Skipped_due_to_tautology_ = makeString("Skipped due to tautology.");

    private static final SubLString $str53$Skipped_due_to_unreformulatable_ = makeString("Skipped due to unreformulatable.");

    private static final SubLString $str54$Translation___s = makeString("Translation: ~s");

    private static final SubLString $str55$skipped_for_an_unknown_reason___a = makeString("skipped for an unknown reason: ~a");

    private static final SubLString $str56$The_raw_tuple__S_using_the_physic = makeString("The raw tuple ~S using the physical schema ~S and the logical schema ~S resulted in the logical sentence ~S in the content mt ~S which was ");

    private static final SubLSymbol EXPLANATION_OF_WHY_NOT_WFF_ASSERT = makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-ASSERT");

    private static final SubLSymbol $sym58$EXPLANATION_OF_WHY_NOT_ADMITTED_SENTENCE_WRT_ASENT_ARG_CONSTRAINT = makeSymbol("EXPLANATION-OF-WHY-NOT-ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS");

    private static final SubLString $str59$skipped_due_to_ill_formedness__ty = makeString("skipped due to ill-formedness, type coercion successful but ill-formed: ~a");

    private static final SubLString $str60$skipped_due_to_ill_formedness__ty = makeString("skipped due to ill-formedness, type coercion unsuccessful: ~a");

    private static final SubLString $str61$skipped_due_to_ill_formedness__ty = makeString("skipped due to ill-formedness (type coercion unnecessary): ~a");

    private static final SubLString $str62$skipped_due_to_ill_formedness___a = makeString("skipped due to ill-formedness: ~a");

    private static final SubLString $str63$skipped_due_to_an_invalid_predica = makeString("skipped due to an invalid predicate: ~a");









    private static final SubLList $list68 = list(list(reader_make_constant_shell(makeString("IMDB-MovieActors-KS")), list(makeString("Unforgiven (1992)"), makeString("Eastwood, Clint")), list(makeString("Unforgiven (1992)"), makeString("Hackman, Gene"))));



    private static final SubLSymbol SKSI_RAW_TUPLE_TRANSLATION_PATTERN = makeSymbol("SKSI-RAW-TUPLE-TRANSLATION-PATTERN");

    private static final SubLObject $$fieldValue = reader_make_constant_shell(makeString("fieldValue"));





    private static final SubLSymbol SKSI_RAW_SENTENCE_TRANSLATION_PATTERN = makeSymbol("SKSI-RAW-SENTENCE-TRANSLATION-PATTERN");

    private static final SubLObject $$IMDB_MovieActors_PS = reader_make_constant_shell(makeString("IMDB-MovieActors-PS"));

    private static final SubLObject $$IMDB_MovieActors_LS = reader_make_constant_shell(makeString("IMDB-MovieActors-LS"));

    private static final SubLList $list77 = list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("fieldValue")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RAW-1"))), list(reader_make_constant_shell(makeString("fieldValue")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RAW-2")))), list(makeKeyword("CALL"), makeSymbol("SKSI-SIMPLIFY-DECODED-SENTENCE"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("indexicalReferent")), list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("Movie-CW"))), list(makeKeyword("CALL"), makeSymbol("SKSI-BATCH-REFORMULATE"), list(reader_make_constant_shell(makeString("MovieNamedFn")), list(makeKeyword("VALUE"), makeSymbol("RAW-1")))), makeSymbol("CONTENT-MT")), list(reader_make_constant_shell(makeString("indexicalReferent")), list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("Person"))), list(makeKeyword("CALL"), makeSymbol("SKSI-BATCH-REFORMULATE"), list(reader_make_constant_shell(makeString("PersonNamedFn")), list(makeKeyword("VALUE"), makeSymbol("RAW-2")))), makeSymbol("CONTENT-MT")))));

    private static final SubLList $list78 = list(list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("Movie-CW"))), list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("Person"))));







    private static final SubLSymbol POSSIBLY_OVERRIDE_PHYSICAL_FIELD_VALUE = makeSymbol("POSSIBLY-OVERRIDE-PHYSICAL-FIELD-VALUE");

    private static final SubLSymbol PHYSICAL_FIELD_FOR_INDEXICAL = makeSymbol("PHYSICAL-FIELD-FOR-INDEXICAL");

    private static final SubLObject $$indexicalReferent = reader_make_constant_shell(makeString("indexicalReferent"));

    private static final SubLSymbol SKSI_BATCH_REFORMULATE = makeSymbol("SKSI-BATCH-REFORMULATE");



    private static final SubLSymbol SKSI_SIMPLIFY_DECODED_SENTENCE = makeSymbol("SKSI-SIMPLIFY-DECODED-SENTENCE");

    private static final SubLObject $const88$fieldWithPhysicalValueMapsToPhysi = reader_make_constant_shell(makeString("fieldWithPhysicalValueMapsToPhysicalValue"));





    private static final SubLString $str91$Failed_to_compute_a_justification = makeString("Failed to compute a justification for ~a in ~a: this assertion will not be retractable");

    private static final SubLObject $$tablePrimaryKeyValues = reader_make_constant_shell(makeString("tablePrimaryKeyValues"));



    private static final SubLObject $$schemaTranslation = reader_make_constant_shell(makeString("schemaTranslation"));

    private static final SubLList $list95 = list(list(makeSymbol("*SKSI-BATCH-TEMPLATES*"), list(makeSymbol("INITIALIZE-SKSI-BATCH-TEMPLATES"))));



    private static final SubLList $list97 = list(list(makeSymbol("CLEAR-SKSI-BATCH-TEMPLATES")));

    private static final SubLList $list98 = list(makeSymbol("USE-THEM?"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol WITH_SKSI_BATCH_TEMPLATES = makeSymbol("WITH-SKSI-BATCH-TEMPLATES");

    private static final SubLSymbol INITIALIZE_SKSI_BATCH_TEMPLATES = makeSymbol("INITIALIZE-SKSI-BATCH-TEMPLATES");

    private static final SubLString $str102$Cannot_handle_nested_SKSI_batch_i = makeString("Cannot handle nested SKSI batch instantiation templates");

    private static final SubLSymbol CLEAR_SKSI_BATCH_TEMPLATES = makeSymbol("CLEAR-SKSI-BATCH-TEMPLATES");

    private static final SubLSymbol ALLOWED_RULES_SPEC_P = makeSymbol("ALLOWED-RULES-SPEC-P");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");



    private static final SubLSymbol SKSI_BATCH_TEMPLATE_P = makeSymbol("SKSI-BATCH-TEMPLATE-P");

    private static final SubLSymbol CONVERT_SQL_DATUM_TO_STRING = makeSymbol("CONVERT-SQL-DATUM-TO-STRING");



    private static final SubLList $list110 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("schemaTranslation")), makeSymbol("?SOURCE"), makeSymbol("?CONTENT-MT")), list(reader_make_constant_shell(makeString("rowInSourceClaims")), makeSymbol("?SOURCE"), makeSymbol("?SENTENCE"))), list(reader_make_constant_shell(makeString("ist")), makeSymbol("?CONTENT-MT"), makeSymbol("?SENTENCE")));

    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));

    private static final SubLSymbol SKSI_SCHEMA_TRANSLATION_LIFTING_RULE = makeSymbol("SKSI-SCHEMA-TRANSLATION-LIFTING-RULE");

    private static final SubLString $str113$Could_not_find_the_SKSI_schemaTra = makeString("Could not find the SKSI schemaTranslation lifting rule ~s in ~s");

    private static final SubLSymbol $sksi_schema_translation_lifting_rule_caching_state$ = makeSymbol("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-CACHING-STATE*");

    private static final SubLSymbol SKSI_GET_DATUM_VAR = makeSymbol("SKSI-GET-DATUM-VAR");

    private static final SubLString $str116$DATUM_ = makeString("DATUM-");

    private static final SubLSymbol $sksi_get_datum_var_caching_state$ = makeSymbol("*SKSI-GET-DATUM-VAR-CACHING-STATE*");

    private static final SubLSymbol SKSI_GET_RAW_VAR = makeSymbol("SKSI-GET-RAW-VAR");

    private static final SubLString $str119$RAW_ = makeString("RAW-");

    private static final SubLSymbol $sksi_get_raw_var_caching_state$ = makeSymbol("*SKSI-GET-RAW-VAR-CACHING-STATE*");

    private static final SubLSymbol SKSI_GET_ARG_VAR = makeSymbol("SKSI-GET-ARG-VAR");

    private static final SubLString $str122$ARG_ = makeString("ARG-");

    private static final SubLSymbol $sksi_get_arg_var_caching_state$ = makeSymbol("*SKSI-GET-ARG-VAR-CACHING-STATE*");

    private static final SubLString $str124$Assertion_of__s_in__s_failed___a = makeString("Assertion of ~s in ~s failed: ~a");

    private static final SubLSymbol $kw125$CHECK_WFF_ = makeKeyword("CHECK-WFF?");

    private static final SubLString $str126$Deduction_of__s_in__s_with_suppor = makeString("Deduction of ~s in ~s with supports ~s failed: ~a");

    private static final SubLString $str127$Unassert_of__s_from__s_failed___a = makeString("Unassert of ~s from ~s failed: ~a");

    private static final SubLSymbol $sym128$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol TEST_SKSI_WFF_CHECK_BATCH_TRANSLATED_SENTENCE = makeSymbol("TEST-SKSI-WFF-CHECK-BATCH-TRANSLATED-SENTENCE");

    public static SubLObject set_sksi_batch_translate_only_asserted_meaning_sentences(final SubLObject v_boolean) {
        assert NIL != booleanp(v_boolean) : "Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) " + v_boolean;
        $sksi_batch_translate_only_asserted_meaning_sentencesP$.setDynamicValue(v_boolean);
        return v_boolean;
    }

    public static SubLObject set_sksi_batch_translate_coerce_types(final SubLObject v_boolean) {
        assert NIL != booleanp(v_boolean) : "Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) " + v_boolean;
        $sksi_batch_translate_coerce_typesP$.setDynamicValue(v_boolean);
        return v_boolean;
    }

    public static SubLObject with_sksi_batch_translate_only_asserted_meaning_sentences(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    public static SubLObject without_sksi_batch_translate_only_asserted_meaning_sentences(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static SubLObject with_sksi_batch_translate_coerce_types(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static SubLObject without_sksi_batch_translate_coerce_types(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    public static SubLObject with_sksi_batch_sql_select_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        string = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sksi_batch_sql_select_statement$, string)), append(body, NIL));
    }

    public static SubLObject sksi_batch_assert_translations_of_table(final SubLObject table, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row) {
        if (check_wffnessP == UNPROVIDED) {
            check_wffnessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(table);
        final SubLObject meta_mt = sksi_sks_accessors.sks_get_defining_mt(table, UNPROVIDED);
        final SubLObject _prev_bind_0 = $sksi_batch_assert_justification_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sksi_batch_primary_key_columns$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $sksi_batch_asserting_translations_of_this_table$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $sksi_batch_assert_justification_table$.bind(make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED), thread);
            $sksi_batch_primary_key_columns$.bind(sksi_kb_accessors.table_primary_key_column_indices(table, meta_mt), thread);
            $sksi_batch_asserting_translations_of_this_table$.bind(table, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            count = length(sksi_translate_all_sk_sources_in_mt(content_mt, meta_mt, check_wffnessP, start_row, end_row, T));
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_4, thread);
            $sksi_batch_asserting_translations_of_this_table$.rebind(_prev_bind_3, thread);
            $sksi_batch_primary_key_columns$.rebind(_prev_bind_2, thread);
            $sksi_batch_assert_justification_table$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt(final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row, SubLObject nowP) {
        if (check_wffnessP == UNPROVIDED) {
            check_wffnessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = sksi_translate_all_sk_sources_in_mt(content_mt, meta_mt, check_wffnessP, start_row, end_row, UNPROVIDED);
        SubLObject current_sentence = NIL;
        current_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject target_mt = cycl_utilities.sentence_arg1(current_sentence, UNPROVIDED);
            final SubLObject sentence_to_be_asserted = cycl_utilities.sentence_arg2(current_sentence, UNPROVIDED);
            if (NIL != check_wffnessP) {
                if (NIL != nowP) {
                    ke.ke_assert_now(sentence_to_be_asserted, target_mt, UNPROVIDED, UNPROVIDED);
                } else {
                    ke.ke_assert(sentence_to_be_asserted, target_mt, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != nowP) {
                    ke.ke_assert_wff_now(sentence_to_be_asserted, target_mt, UNPROVIDED, UNPROVIDED);
                } else {
                    ke.ke_assert(sentence_to_be_asserted, target_mt, UNPROVIDED, UNPROVIDED);
                }

            cdolist_list_var = cdolist_list_var.rest();
            current_sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream(final SubLObject content_mt, final SubLObject meta_mt, final SubLObject target_mt, SubLObject stream, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wffnessP == UNPROVIDED) {
            check_wffnessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = sksi_translate_all_sk_sources_in_mt(content_mt, meta_mt, check_wffnessP, start_row, end_row, UNPROVIDED);
        SubLObject current_sentence = NIL;
        current_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence_to_be_asserted = cycl_utilities.sentence_arg2(current_sentence, UNPROVIDED);
            format(stream, $str10$in_mt___S___, cycl_utilities.hl_to_el(target_mt));
            format(stream, $str11$f___S___, sentence_to_be_asserted);
            cdolist_list_var = cdolist_list_var.rest();
            current_sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt_to_ke_string(final SubLObject content_mt, final SubLObject meta_mt, final SubLObject target_mt, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row) {
        if (check_wffnessP == UNPROVIDED) {
            check_wffnessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        SubLObject result_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream(content_mt, meta_mt, target_mt, stream, check_wffnessP, start_row, end_row);
            result_string = get_output_stream_string(stream);
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
        return result_string;
    }

    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt_to_ke_file(final SubLObject filename, final SubLObject target_mt, final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream(content_mt, meta_mt, target_mt, stream_$1, check_wff_nessP, start_row, end_row);
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
        return NIL;
    }

    public static SubLObject sksi_translate_all_sk_sources_in_mt(final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (assert_as_you_goP == UNPROVIDED) {
            assert_as_you_goP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        SubLObject node_var = content_mt;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str24$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(content_mt, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                while (NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    final SubLObject new_sentences = sksi_translate_all_sk_source_in_just_mt(genl_mt, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
                                    sentences = nconc(nreverse(new_sentences), sentences);
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlMt));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$11;
                                                                    for (iteration_state_$11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$11); iteration_state_$11 = dictionary_contents.do_dictionary_contents_next(iteration_state_$11)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$11);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$11);
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str27$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$13;
                                                    final SubLObject new_list = cdolist_list_var_$13 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$13.first();
                                                    while (NIL != cdolist_list_var_$13) {
                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                        }
                                                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                        generating_fn = cdolist_list_var_$13.first();
                                                    } 
                                                }

                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    node_var = deck.deck_pop(recur_deck);
                                } 
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$7, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str28$Node__a_does_not_pass_sbhl_type_t, content_mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return nreverse(sentences);
    }

    public static SubLObject sksi_translate_all_sk_source_in_just_mt(final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (assert_as_you_goP == UNPROVIDED) {
            assert_as_you_goP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject sk_source = sksi_kb_accessors.content_mt_sk_source(content_mt, UNPROVIDED);
            if (NIL != sk_source) {
                sentences = sksi_translate_all_spec_sk_sources(sk_source, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }

    public static SubLObject sksi_translate_all_sk_sources_in_mt_to_stream(final SubLObject content_mt, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject node_var = content_mt;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str24$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str19$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(content_mt, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                while (NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                                    final SubLObject _prev_bind_0_$19 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$22 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        final SubLObject sk_source = sksi_kb_accessors.content_mt_sk_source(genl_mt, UNPROVIDED);
                                        if (NIL != sk_source) {
                                            sksi_translate_all_spec_sk_sources_to_stream(sk_source, meta_mt, stream, check_wff_nessP, start_row, end_row);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$22, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$20, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$19, thread);
                                    }
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlMt));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$28;
                                                                    for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$28);
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str27$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$30;
                                                    final SubLObject new_list = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$30.first();
                                                    while (NIL != cdolist_list_var_$30) {
                                                        final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                        }
                                                        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                        generating_fn = cdolist_list_var_$30.first();
                                                    } 
                                                }

                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    node_var = deck.deck_pop(recur_deck);
                                } 
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$21, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$18, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str28$Node__a_does_not_pass_sbhl_type_t, content_mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$18, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$17, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_translate_all_sk_sources_in_mt_to_file(final SubLObject filename, final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$33 = stream;
            sksi_translate_all_sk_sources_in_mt_to_stream(content_mt, meta_mt, stream_$33, check_wff_nessP, start_row, end_row);
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
        return NIL;
    }

    public static SubLObject sksi_translate_all_spec_sk_sources(final SubLObject sk_source, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (assert_as_you_goP == UNPROVIDED) {
            assert_as_you_goP = NIL;
        }
        SubLObject all_sentences = NIL;
        final SubLObject sentences = sksi_translate_all_simple_sk_source(sk_source, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
        all_sentences = nconc(nreverse(sentences), all_sentences);
        SubLObject cdolist_list_var;
        final SubLObject spec_sk_sources = cdolist_list_var = sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sk_source, meta_mt);
        SubLObject spec_sk_source = NIL;
        spec_sk_source = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentences2 = sksi_translate_all_simple_sk_source(spec_sk_source, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
            all_sentences = nconc(nreverse(sentences2), all_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            spec_sk_source = cdolist_list_var.first();
        } 
        return nreverse(all_sentences);
    }

    public static SubLObject sksi_translate_all_spec_sk_sources_to_stream(final SubLObject sk_source, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        sksi_translate_all_simple_sk_source_to_stream(sk_source, meta_mt, stream, check_wff_nessP, start_row, end_row);
        SubLObject cdolist_list_var;
        final SubLObject spec_sk_sources = cdolist_list_var = sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sk_source, meta_mt);
        SubLObject spec_sk_source = NIL;
        spec_sk_source = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_translate_all_simple_sk_source_to_stream(spec_sk_source, meta_mt, stream, check_wff_nessP, start_row, end_row);
            cdolist_list_var = cdolist_list_var.rest();
            spec_sk_source = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_translate_all_spec_sk_sources_to_file(final SubLObject filename, final SubLObject sk_source, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$34 = stream;
            sksi_translate_all_spec_sk_sources_to_stream(sk_source, meta_mt, stream_$34, check_wff_nessP, start_row, end_row);
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
        return NIL;
    }

    public static SubLObject sksi_translate_all_simple_sk_source(final SubLObject simple_sk_source, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (assert_as_you_goP == UNPROVIDED) {
            assert_as_you_goP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_sentences = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (NIL != content_mt) {
                SubLObject cdolist_list_var;
                final SubLObject physical_schemata = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(simple_sk_source);
                SubLObject physical_schema = NIL;
                physical_schema = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != sksi_kb_accessors.physical_schema_enumerableP(physical_schema)) {
                        SubLObject cdolist_list_var_$35;
                        final SubLObject logical_schemata = cdolist_list_var_$35 = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
                        SubLObject logical_schema = NIL;
                        logical_schema = cdolist_list_var_$35.first();
                        while (NIL != cdolist_list_var_$35) {
                            final SubLObject sentences = sksi_translate_simple_sk_source(simple_sk_source, physical_schema, logical_schema, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
                            all_sentences = nconc(nreverse(sentences), all_sentences);
                            cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                            logical_schema = cdolist_list_var_$35.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    physical_schema = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_sentences);
    }

    public static SubLObject sksi_translate_all_simple_sk_source_to_stream(final SubLObject simple_sk_source, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (NIL != content_mt) {
                SubLObject cdolist_list_var;
                final SubLObject physical_schemata = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(simple_sk_source);
                SubLObject physical_schema = NIL;
                physical_schema = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != sksi_kb_accessors.physical_schema_enumerableP(physical_schema)) {
                        SubLObject cdolist_list_var_$36;
                        final SubLObject logical_schemata = cdolist_list_var_$36 = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
                        SubLObject logical_schema = NIL;
                        logical_schema = cdolist_list_var_$36.first();
                        while (NIL != cdolist_list_var_$36) {
                            sksi_translate_simple_sk_source_to_stream(simple_sk_source, physical_schema, logical_schema, meta_mt, stream, check_wff_nessP, start_row, end_row);
                            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                            logical_schema = cdolist_list_var_$36.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    physical_schema = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_translate_simple_sk_source(final SubLObject simple_sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (assert_as_you_goP == UNPROVIDED) {
            assert_as_you_goP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (NIL != content_mt) {
                final SubLObject raw_iterator = new_sk_source_row_iterator(simple_sk_source, physical_schema, meta_mt, start_row, end_row, UNPROVIDED);
                if (NIL != iteration.iterator_p(raw_iterator)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                    final SubLObject _prev_bind_0_$37 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            SubLObject valid;
                            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject raw_tuple = iteration.iteration_next(raw_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    final SubLObject ist_sentence = sksi_translate_one_raw_tuple_to_ist_logical_sentence(raw_tuple, content_mt, physical_schema, logical_schema, meta_mt, check_wff_nessP, assert_as_you_goP);
                                    if (NIL != ist_sentence) {
                                        sentences = cons(ist_sentence, sentences);
                                    }
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(sentences);
    }

    public static SubLObject sksi_translate_simple_sk_source_to_stream(final SubLObject simple_sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (NIL != content_mt) {
                final SubLObject raw_iterator = new_sk_source_row_iterator(simple_sk_source, physical_schema, meta_mt, start_row, end_row, UNPROVIDED);
                if (NIL != iteration.iterator_p(raw_iterator)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                    final SubLObject _prev_bind_0_$39 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            format(stream, $str29$____Translation_Time____A__, numeric_date_utilities.timestring(UNPROVIDED));
                            format(stream, $str30$_____);
                            format(stream, $str31$___Meta_Mt_____________S__, meta_mt);
                            format(stream, $str32$___Source______________S__, simple_sk_source);
                            format(stream, $str33$___Physical_Schema_____S__, physical_schema);
                            format(stream, $str34$___Logical_Schema______S__, logical_schema);
                            format(stream, $str30$_____);
                            format(stream, $str35$___Content_Mt__________S, content_mt);
                            SubLObject valid;
                            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject raw_tuple = iteration.iteration_next(raw_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    final SubLObject _prev_bind_0_$40 = $print_pretty$.currentBinding(thread);
                                    try {
                                        $print_pretty$.bind(NIL, thread);
                                        format(stream, $str36$________S_, raw_tuple);
                                    } finally {
                                        $print_pretty$.rebind(_prev_bind_0_$40, thread);
                                    }
                                    final SubLObject ist_sentence = sksi_translate_one_raw_tuple_to_ist_logical_sentence(raw_tuple, content_mt, physical_schema, logical_schema, meta_mt, check_wff_nessP, UNPROVIDED);
                                    if (NIL != ist_sentence) {
                                        format_cycl_expression.format_cycl_expression(ist_sentence, stream, UNPROVIDED);
                                    }
                                }
                            }
                            terpri(stream);
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
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_translate_simple_sk_source_to_file(final SubLObject filename, final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$42 = stream;
            sksi_translate_simple_sk_source_to_stream(sk_source, physical_schema, logical_schema, meta_mt, stream_$42, check_wff_nessP, start_row, end_row);
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
        return NIL;
    }

    public static SubLObject new_sksi_translate_iterator(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enumerable_schemaP = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            enumerable_schemaP = sksi_kb_accessors.physical_schema_enumerableP(physical_schema);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == enumerable_schemaP) {
            return NIL;
        }
        SubLObject content_mt = NIL;
        mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return iteration.new_iterator(make_sksi_translate_iterator_state(sk_source, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP, start_row, end_row), SKSI_TRANSLATE_ITERATE_DONE, SKSI_TRANSLATE_ITERATE_NEXT, BOOLEAN);
    }

    public static SubLObject make_sksi_translate_iterator_state(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject meta_mt, final SubLObject check_wff_nessP, final SubLObject start_row, final SubLObject end_row) {
        final SubLObject tuple_iterator = new_sk_source_row_iterator(sk_source, physical_schema, meta_mt, start_row, end_row, UNPROVIDED);
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list(tuple_iterator, v_memoization_state, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP);
    }

    public static SubLObject sksi_translate_iterate_done(final SubLObject state) {
        SubLObject tuple_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list40);
        tuple_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return eq($DONE, tuple_iterator);
    }

    public static SubLObject sksi_translate_iterate_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuple_iterator = NIL;
        SubLObject v_memoization_state = NIL;
        SubLObject physical_schema = NIL;
        SubLObject logical_schema = NIL;
        SubLObject content_mt = NIL;
        SubLObject meta_mt = NIL;
        SubLObject check_wff_nessP = NIL;
        destructuring_bind_must_consp(state, state, $list42);
        tuple_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list42);
        v_memoization_state = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list42);
        physical_schema = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list42);
        logical_schema = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list42);
        content_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list42);
        meta_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list42);
        check_wff_nessP = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list42);
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject raw_tuple = iteration.iteration_next(tuple_iterator);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == valid) {
            final SubLObject update = $DONE;
            rplaca(state, update);
            rplacd(state, NIL);
            return values(NIL, state, T);
        }
        SubLObject logical_sentence = NIL;
        final SubLObject local_state = v_memoization_state;
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                logical_sentence = sksi_translate_one_raw_tuple_to_logical_sentence(raw_tuple, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP);
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
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(logical_sentence, state, NIL);
    }

    public static SubLObject sksi_translate_one_raw_tuple_to_ist_logical_sentence(final SubLObject raw_tuple, final SubLObject content_mt, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        if (assert_as_you_goP == UNPROVIDED) {
            assert_as_you_goP = NIL;
        }
        final SubLObject logical_sentence = sksi_translate_one_raw_tuple_to_logical_sentence(raw_tuple, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP);
        if (NIL != logical_sentence) {
            final SubLObject el_sentence = fi.perform_fi_substitutions(logical_sentence, UNPROVIDED);
            final SubLObject ist_sentence = make_binary_formula($$ist, content_mt, el_sentence);
            possibly_remember_primary_key_that_resulted_in_raw_tuple(raw_tuple, el_sentence);
            if (NIL != assert_as_you_goP) {
                final SubLObject target_mt = cycl_utilities.sentence_arg1(ist_sentence, UNPROVIDED);
                final SubLObject sentence_to_be_asserted = cycl_utilities.sentence_arg2(ist_sentence, UNPROVIDED);
                sksi_batch_assert_sentence_with_deduced_argument_assuming_table(sentence_to_be_asserted, target_mt, meta_mt);
            }
            return ist_sentence;
        }
        return NIL;
    }

    public static SubLObject sksi_translate_one_raw_tuple_to_logical_sentence(final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP) {
        if (check_wff_nessP == UNPROVIDED) {
            check_wff_nessP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject batch_template = sksi_batch_template_lookup(physical_schema, logical_schema, content_mt);
        final SubLObject _prev_bind_0 = $current_sksi_batch_template$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sksi_batch_translate_type_coercion_successfulP$.currentBinding(thread);
        try {
            $current_sksi_batch_template$.bind(batch_template, thread);
            $sksi_batch_translate_type_coercion_successfulP$.bind(NIL, thread);
            final SubLObject logical_sentence = sksi_translate_one_raw_tuple_to_logical_sentence_int(raw_tuple, physical_schema, logical_schema, content_mt, meta_mt);
            result = sksi_postprocess_translated_sentence(logical_sentence, raw_tuple, physical_schema, logical_schema, content_mt, check_wff_nessP);
            if (NIL != misc_utilities.uninitialized_p(batch_template)) {
                remember_batch_template_for_future_use(logical_sentence, content_mt, physical_schema, logical_schema);
            }
        } finally {
            $sksi_batch_translate_type_coercion_successfulP$.rebind(_prev_bind_2, thread);
            $current_sksi_batch_template$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_translate_one_raw_tuple_to_logical_sentence_int(final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(THREE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str45$__a__Translating__s_wrt__a__a__a_), new SubLObject[]{ THREE_INTEGER, numeric_date_utilities.timestring(UNPROVIDED), raw_tuple, physical_schema, logical_schema, meta_mt, content_mt });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject logical_sentence = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject raw_sentence = sksi_translate_raw_tuple(raw_tuple, physical_schema);
            final SubLObject relevant_pf_indexicals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != raw_sentence) {
                if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                    format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str46$Raw_sentence___s), FOUR_INTEGER, raw_sentence);
                    force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                }
                thread.resetMultipleValues();
                final SubLObject decoded_sentence = sksi_translate_raw_sentence(raw_sentence, physical_schema, relevant_pf_indexicals, logical_schema, content_mt);
                final SubLObject relevant_logical_field_indexicals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != decoded_sentence) {
                    if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                        format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str47$Decoded_sentence___s), FOUR_INTEGER, decoded_sentence);
                        force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                    }
                    logical_sentence = sksi_translate_decoded_sentence(decoded_sentence, logical_schema, relevant_logical_field_indexicals, content_mt, meta_mt);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return logical_sentence;
    }

    public static SubLObject sksi_postprocess_translated_sentence(final SubLObject logical_sentence, final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject check_wff_nessP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str48$Logical_sentence___s), FOUR_INTEGER, logical_sentence);
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject processed_sentences = NIL;
        SubLObject cdolist_list_var = cycl_utilities.possibly_conjuncts(logical_sentence);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!conjunct.equal(logical_sentence)) && (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FOUR_INTEGER))) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str49$Logical_conjunct___s), FOUR_INTEGER, conjunct);
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            final SubLObject var;
            final SubLObject processed_sentence = var = sksi_postprocess_translated_asent(raw_tuple, physical_schema, logical_schema, conjunct, content_mt, check_wff_nessP);
            if (NIL != var) {
                processed_sentences = cons(var, processed_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        final SubLObject result = simplifier.possibly_conjoin(nreverse(processed_sentences), UNPROVIDED);
        return result;
    }

    public static SubLObject sksi_postprocess_translated_asent(final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, SubLObject logical_sentence, final SubLObject content_mt, final SubLObject check_wff_nessP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        logical_sentence = sksi_remove_untranslatable(logical_sentence);
        if (NIL == logical_sentence) {
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str50$Skipped_due_to_wholly_untranslata), THREE_INTEGER);
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
        logical_sentence = sksi_remove_unreformulatable(logical_sentence);
        if (NIL != kb_utilities.kbeq($$True, logical_sentence)) {
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str52$Skipped_due_to_tautology_), THREE_INTEGER);
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
        if (NIL == logical_sentence) {
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str53$Skipped_due_to_unreformulatable_), THREE_INTEGER);
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = sksi_wff_check_batch_translated_sentence(logical_sentence, content_mt, check_wff_nessP);
        SubLObject why_not_wff_format_string = thread.secondMultipleValue();
        final SubLObject why_not_wff_explanation = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str54$Translation___s), THREE_INTEGER, result);
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        } else {
            if (NIL == why_not_wff_format_string) {
                why_not_wff_format_string = $str55$skipped_for_an_unknown_reason___a;
            }
            why_not_wff_format_string = cconcatenate($str56$The_raw_tuple__S_using_the_physic, why_not_wff_format_string);
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, why_not_wff_format_string), new SubLObject[]{ TWO_INTEGER, raw_tuple, physical_schema, logical_schema, logical_sentence, content_mt, why_not_wff_explanation });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        return result;
    }

    public static SubLObject sksi_wff_check_batch_translated_sentence(final SubLObject logical_sentence, final SubLObject content_mt, final SubLObject check_wff_nessP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject why_not_wff_format_string = NIL;
        SubLObject why_not_wff_explanation = NIL;
        if (NIL != forts.fort_p(cycl_utilities.formula_operator(logical_sentence))) {
            final SubLObject _prev_bind_0 = at_vars.$at_additional_defn_checking$.currentBinding(thread);
            try {
                at_vars.$at_additional_defn_checking$.bind(NIL, thread);
                if (NIL != sksi_batch_translate_coerce_typesP()) {
                    final SubLObject explanation = at_admitted.explanation_of_why_not_admitted_sentence_wrt_asent_arg_constraints(logical_sentence, content_mt);
                    if (NIL != explanation) {
                        final SubLObject explanation_of_why_not_wff_func = (NIL != check_wff_nessP) ? EXPLANATION_OF_WHY_NOT_WFF_ASSERT : $sym58$EXPLANATION_OF_WHY_NOT_ADMITTED_SENTENCE_WRT_ASENT_ARG_CONSTRAINT;
                        thread.resetMultipleValues();
                        final SubLObject simplified_sentence = simplifier.cycl_coerce_types(logical_sentence, content_mt, explanation_of_why_not_wff_func);
                        final SubLObject simplified_explanation = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != simplified_sentence) {
                            result = simplified_sentence;
                            if (NIL == $sksi_batch_translate_type_coercion_successfulP$.getDynamicValue(thread)) {
                                $sksi_batch_translate_type_coercion_successfulP$.setDynamicValue(T, thread);
                            }
                        } else
                            if (NIL != simplified_explanation) {
                                why_not_wff_format_string = $str59$skipped_due_to_ill_formedness__ty;
                                why_not_wff_explanation = simplified_explanation;
                            } else {
                                why_not_wff_format_string = $str60$skipped_due_to_ill_formedness__ty;
                                why_not_wff_explanation = explanation;
                            }

                    } else {
                        final SubLObject stricter_explanation = (NIL != check_wff_nessP) ? wff.explanation_of_why_not_wff_assert(logical_sentence, content_mt, UNPROVIDED) : NIL;
                        if (NIL != stricter_explanation) {
                            why_not_wff_format_string = $str61$skipped_due_to_ill_formedness__ty;
                            why_not_wff_explanation = stricter_explanation;
                        } else {
                            result = logical_sentence;
                        }
                    }
                } else {
                    final SubLObject explanation = (NIL != check_wff_nessP) ? wff.explanation_of_why_not_wff_assert(logical_sentence, content_mt, UNPROVIDED) : NIL;
                    if (NIL != explanation) {
                        why_not_wff_format_string = $str62$skipped_due_to_ill_formedness___a;
                        why_not_wff_explanation = explanation;
                    } else {
                        result = logical_sentence;
                    }
                }
            } finally {
                at_vars.$at_additional_defn_checking$.rebind(_prev_bind_0, thread);
            }
        } else {
            why_not_wff_format_string = $str63$skipped_due_to_an_invalid_predica;
            why_not_wff_explanation = string_utilities.str(cycl_utilities.formula_operator(logical_sentence));
        }
        return values(result, why_not_wff_format_string, why_not_wff_explanation);
    }

    public static SubLObject sksi_remove_untranslatable(final SubLObject sentence) {
        if (NIL == atomic_sentenceP(sentence)) {
            SubLObject results = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject sub_sentence = NIL;
            sub_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sentence_contains_untranslatableP(sub_sentence)) {
                    results = cons(sub_sentence, results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sentence = cdolist_list_var.first();
            } 
            return make_conjunction(results);
        }
        if (NIL == sentence_contains_untranslatableP(sentence)) {
            return sentence;
        }
        return NIL;
    }

    public static SubLObject sentence_contains_untranslatableP(final SubLObject sentence) {
        return cycl_utilities.expression_find($UNTRANSLATABLE, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_remove_unreformulatable(final SubLObject sentence) {
        if (NIL == atomic_sentenceP(sentence)) {
            SubLObject results = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject sub_sentence = NIL;
            sub_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sentence_contains_unreformulatableP(sub_sentence)) {
                    results = cons(sub_sentence, results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sentence = cdolist_list_var.first();
            } 
            return make_conjunction(results);
        }
        if (NIL == sentence_contains_unreformulatableP(sentence)) {
            return sentence;
        }
        return NIL;
    }

    public static SubLObject sentence_contains_unreformulatableP(final SubLObject sentence) {
        return makeBoolean((NIL != cycl_utilities.expression_find($UNREFORMULATABLE, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find($NULL, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject sksi_translate_raw_tuple(final SubLObject raw_tuple, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject translation_pattern = sksi_raw_tuple_translation_pattern(physical_schema);
        final SubLObject pf_indexicals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject raw_sentence = pattern_match.pattern_transform_tree(translation_pattern, raw_tuple, UNPROVIDED);
        return values(raw_sentence, pf_indexicals);
    }

    public static SubLObject sksi_translate_raw_sentence(final SubLObject raw_sentence, final SubLObject physical_schema, final SubLObject relevant_pf_indexicals, final SubLObject logical_schema, final SubLObject content_mt) {
        final SubLObject translation_pattern = sksi_raw_sentence_translation_pattern(physical_schema, relevant_pf_indexicals, logical_schema, content_mt);
        final SubLObject decoded_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, raw_sentence, UNPROVIDED);
        final SubLObject relevant_logical_field_indexicals = sksi_logical_field_indexicals_of_decoded_sentence(decoded_sentence);
        return values(decoded_sentence, relevant_logical_field_indexicals);
    }

    public static SubLObject sksi_translate_decoded_sentence(final SubLObject decoded_sentence, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLObject translation_pattern = sksi_decoded_sentence_translation_pattern(logical_schema, relevant_logical_field_indexicals, decoded_sentence, content_mt, meta_mt);
        final SubLObject logical_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, decoded_sentence, UNPROVIDED);
        return logical_sentence;
    }

    public static SubLObject new_sk_source_row_iterator(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject meta_mt, SubLObject start_row, SubLObject end_row, SubLObject specified_physical_fields) {
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (specified_physical_fields == UNPROVIDED) {
            specified_physical_fields = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_sk_source = cycl_utilities.hl_to_el(sk_source);
        if (NIL != list_utilities.alist_has_keyP($sksi_row_iterator_overrides$.getDynamicValue(thread), el_sk_source, symbol_function(EQUAL))) {
            final SubLObject overrides = list_utilities.alist_lookup($sksi_row_iterator_overrides$.getDynamicValue(thread), el_sk_source, symbol_function(EQUAL), UNPROVIDED);
            return iteration.new_list_iterator(overrides);
        }
        if (NIL != $sksi_batch_sql_select_statement$.getDynamicValue(thread)) {
            return sksi_sks_interaction.get_rs_iterator_for_sql_query_from_db_sks(sk_source, $sksi_batch_sql_select_statement$.getDynamicValue(thread), meta_mt);
        }
        SubLObject input_iterator = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject physical_fields = (NIL != specified_physical_fields) ? specified_physical_fields : sksi_kb_accessors.physical_schema_ordered_field_list(physical_schema);
            final SubLObject physical_field_indexicals = sksi_kb_accessors.indexicals_for_physical_fields(physical_fields);
            final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_batch_translate(sk_source, physical_schema, physical_field_indexicals);
            input_iterator = sksi_sks_interaction.generate_iterator_from_csql(csql, sk_source, NIL, start_row, end_row, $BATCH);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return input_iterator;
    }

    public static SubLObject sk_source_row_iterator_next(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject outer_answer = NIL;
        SubLObject outer_valid = NIL;
        thread.resetMultipleValues();
        final SubLObject inner_answer = iteration.iteration_next(iterator);
        final SubLObject inner_valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        outer_answer = inner_answer;
        outer_valid = inner_valid;
        return values(outer_answer, iterator, makeBoolean(NIL == outer_valid));
    }

    public static SubLObject sksi_raw_tuple_translation_pattern_internal(final SubLObject physical_schema) {
        final SubLObject physical_fields = sksi_kb_accessors.physical_schema_ordered_field_list(physical_schema);
        SubLObject pf_indexicals = sksi_kb_accessors.physical_fields_to_indexicals(physical_fields);
        SubLObject datum_vars = NIL;
        SubLObject field_value_literals = NIL;
        SubLObject list_var = NIL;
        SubLObject pf_indexical = NIL;
        SubLObject field_number = NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pf_indexical = list_var.first() , field_number = add(ONE_INTEGER, field_number)) {
            final SubLObject datum_var = sksi_get_datum_var(field_number);
            datum_vars = cons(datum_var, datum_vars);
            if (NIL != pf_indexical) {
                final SubLObject field_value_literal = list($$fieldValue, pf_indexical, list($VALUE, datum_var));
                field_value_literals = cons(field_value_literal, field_value_literals);
            }
        }
        datum_vars = nreverse(datum_vars);
        field_value_literals = nreverse(field_value_literals);
        pf_indexicals = delete(NIL, pf_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject translation_pattern = list($TUPLE, datum_vars, make_conjunction(field_value_literals));
        return values(translation_pattern, pf_indexicals);
    }

    public static SubLObject sksi_raw_tuple_translation_pattern(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_raw_tuple_translation_pattern_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_RAW_TUPLE_TRANSLATION_PATTERN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_RAW_TUPLE_TRANSLATION_PATTERN, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_RAW_TUPLE_TRANSLATION_PATTERN, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_raw_tuple_translation_pattern_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_raw_sentence_translation_pattern_internal(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject content_mt) {
        if (physical_schema.eql($$IMDB_MovieActors_PS) && logical_schema.eql($$IMDB_MovieActors_LS)) {
            return values($list77, $list78);
        }
        SubLObject raw_var_map = NIL;
        SubLObject field_value_literals = NIL;
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sksi_kb_accessors.content_mt_sk_source(content_mt, UNPROVIDED));
        SubLObject list_var = NIL;
        SubLObject pf_indexical = NIL;
        SubLObject field_number = NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pf_indexical = list_var.first() , field_number = add(ONE_INTEGER, field_number)) {
            final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical(pf_indexical);
            final SubLObject raw_var = sksi_get_raw_var(field_number);
            final SubLObject field_value_literal = list($$fieldValue, $ANYTHING, list($BIND, raw_var));
            if (NIL != physical_field_has_physical_override(pf, mapping_mt)) {
                raw_var_map = cons(cons(pf_indexical, list($CALL, POSSIBLY_OVERRIDE_PHYSICAL_FIELD_VALUE, list($VALUE, raw_var), pf, mapping_mt)), raw_var_map);
            } else {
                raw_var_map = cons(cons(pf_indexical, list($VALUE, raw_var)), raw_var_map);
            }
            field_value_literals = cons(field_value_literal, field_value_literals);
        }
        raw_var_map = nreverse(raw_var_map);
        field_value_literals = nreverse(field_value_literals);
        final SubLObject relevant_logical_fields = sksi_kb_accessors.sksi_determine_relevant_logical_fields(Mapping.mapcar(PHYSICAL_FIELD_FOR_INDEXICAL, pf_indexicals), physical_schema, logical_schema);
        SubLObject indexical_referent_literals = NIL;
        SubLObject cdolist_list_var = relevant_logical_fields;
        SubLObject logical_field = NIL;
        logical_field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject recipes = sksi_field_translation_utilities.relevant_field_decodings(logical_field, logical_schema, physical_schema);
            final SubLObject logical_field_indexical = sksi_kb_accessors.indexical_for_logical_field(logical_field);
            SubLObject cdolist_list_var_$44 = recipes;
            SubLObject recipe = NIL;
            recipe = cdolist_list_var_$44.first();
            while (NIL != cdolist_list_var_$44) {
                final SubLObject decoding = sublis(raw_var_map, recipe, UNPROVIDED, UNPROVIDED);
                final SubLObject indexical_referent_literal = list($$indexicalReferent, logical_field_indexical, list($CALL, SKSI_BATCH_REFORMULATE, decoding, content_mt));
                indexical_referent_literals = cons(indexical_referent_literal, indexical_referent_literals);
                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                recipe = cdolist_list_var_$44.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            logical_field = cdolist_list_var.first();
        } 
        indexical_referent_literals = nreverse(indexical_referent_literals);
        final SubLObject translation_pattern = list($TEMPLATE, make_conjunction(field_value_literals), list($CALL, SKSI_SIMPLIFY_DECODED_SENTENCE, make_conjunction(indexical_referent_literals)));
        return values(translation_pattern, relevant_logical_fields);
    }

    public static SubLObject sksi_raw_sentence_translation_pattern(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, content_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_RAW_SENTENCE_TRANSLATION_PATTERN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_RAW_SENTENCE_TRANSLATION_PATTERN, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_RAW_SENTENCE_TRANSLATION_PATTERN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(physical_schema, pf_indexicals, logical_schema, content_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (physical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pf_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (logical_schema.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && content_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, content_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(physical_schema, pf_indexicals, logical_schema, content_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject physical_field_has_physical_override(final SubLObject pf, final SubLObject mapping_mt) {
        return kb_mapping_utilities.fpred_value_in_relevant_mts(pf, $const88$fieldWithPhysicalValueMapsToPhysi, mapping_mt, ONE_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject possibly_override_physical_field_value(SubLObject raw_input, final SubLObject pf, final SubLObject mapping_mt) {
        final SubLObject p_to_p_gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($const88$fieldWithPhysicalValueMapsToPhysi, pf, raw_input, mapping_mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        if (NIL != assertions_high.gaf_assertionP(p_to_p_gaf)) {
            raw_input = assertions_high.gaf_arg3(p_to_p_gaf);
        }
        return raw_input;
    }

    public static SubLObject sksi_batch_reformulate(final SubLObject expression, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sk_source = sksi_kb_accessors.content_mt_sk_source(content_mt, UNPROVIDED);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(content_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(content_mt), thread);
            if (list_utilities.tree_count(NIL, expression, UNPROVIDED, UNPROVIDED).isPositive()) {
                v_answer = $UNDECODED;
            } else {
                v_answer = sksi_reformulate.sksi_reformulate(expression, $DECODE, sk_source);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject sksi_simplify_decoded_sentence(final SubLObject decoded_sentence) {
        SubLObject relevant_indexical_referents = NIL;
        SubLObject cdolist_list_var;
        final SubLObject indexical_referents = cdolist_list_var = cycl_utilities.formula_args(decoded_sentence, UNPROVIDED);
        SubLObject indexical_referent = NIL;
        indexical_referent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($UNDECODED != cycl_utilities.formula_arg2(indexical_referent, UNPROVIDED)) {
                relevant_indexical_referents = cons(indexical_referent, relevant_indexical_referents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_referent = cdolist_list_var.first();
        } 
        relevant_indexical_referents = nreverse(relevant_indexical_referents);
        return make_conjunction(relevant_indexical_referents);
    }

    public static SubLObject sksi_logical_field_indexicals_of_decoded_sentence(final SubLObject decoded_sentence) {
        SubLObject relevant_logical_field_indexicals = NIL;
        SubLObject cdolist_list_var;
        final SubLObject indexical_referents = cdolist_list_var = cycl_utilities.formula_args(decoded_sentence, UNPROVIDED);
        SubLObject indexical_referent = NIL;
        indexical_referent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject logical_field_indexical = cycl_utilities.formula_arg1(indexical_referent, UNPROVIDED);
            relevant_logical_field_indexicals = cons(logical_field_indexical, relevant_logical_field_indexicals);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_referent = cdolist_list_var.first();
        } 
        return nreverse(relevant_logical_field_indexicals);
    }

    public static SubLObject prune_consequent_conditional_meaning_sentences_wrt_antecedents(final SubLObject conditional_meaning_sentences, final SubLObject decoded_sentence, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLObject lfi_value_cache = sksi_data_warehousing_utilities.construct_lfi_value_cache(decoded_sentence);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = conditional_meaning_sentences;
        SubLObject conditional_meaning_sentence = NIL;
        conditional_meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (sksi_data_warehousing_utilities.decoded_sentence_satisfies_conditionP(conditional_meaning_sentence, lfi_value_cache, content_mt, meta_mt) == T) {
                result = cons(sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_conditional_meaning_sentence(conditional_meaning_sentence), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conditional_meaning_sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject sksi_decoded_sentence_translation_pattern(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject decoded_sentence, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_var_map = NIL;
        SubLObject indexical_referent_literals = NIL;
        SubLObject list_var = NIL;
        SubLObject logical_field_indexical = NIL;
        SubLObject field_number = NIL;
        list_var = relevant_logical_field_indexicals;
        logical_field_indexical = list_var.first();
        for (field_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , logical_field_indexical = list_var.first() , field_number = add(ONE_INTEGER, field_number)) {
            final SubLObject arg_var = sksi_get_arg_var(field_number);
            final SubLObject indexical_referent_literal = list($$indexicalReferent, $ANYTHING, list($BIND, arg_var));
            arg_var_map = cons(cons(logical_field_indexical, list($VALUE, arg_var)), arg_var_map);
            indexical_referent_literals = cons(indexical_referent_literal, indexical_referent_literals);
        }
        arg_var_map = nreverse(arg_var_map);
        indexical_referent_literals = nreverse(indexical_referent_literals);
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentences(logical_schema, relevant_logical_field_indexicals, $sksi_batch_translate_only_asserted_meaning_sentencesP$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject conditional_meaning_sentences = sksi_meaning_sentence_utilities.relevant_logical_schema_conditional_meaning_sentences(logical_schema, relevant_logical_field_indexicals, T, UNPROVIDED);
        final SubLObject applicable_conditional_meaning_sentences = prune_consequent_conditional_meaning_sentences_wrt_antecedents(conditional_meaning_sentences, decoded_sentence, content_mt, meta_mt);
        final SubLObject logical_sentence_recipe = simplifier.simplify_cycl_sentence_syntax(make_conjunction(append(meaning_sentences, applicable_conditional_meaning_sentences)), UNPROVIDED);
        final SubLObject logical_sentence_template = sublis(arg_var_map, logical_sentence_recipe, symbol_function(EQUAL), UNPROVIDED);
        return list($TEMPLATE, make_conjunction(indexical_referent_literals), logical_sentence_template);
    }

    public static SubLObject sksi_batch_assert_sentence_with_deduced_argument_assuming_table(final SubLObject sentence_to_be_asserted, final SubLObject target_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_batch_assert_sentence_with_deduced_argument(sentence_to_be_asserted, target_mt, meta_mt, $sksi_batch_asserting_translations_of_this_table$.getDynamicValue(thread));
    }

    public static SubLObject sksi_batch_assert_sentence_with_deduced_argument(final SubLObject sentence_to_be_asserted, final SubLObject target_mt, final SubLObject meta_mt, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject primary_key_values_list = gethash(sentence_to_be_asserted, $sksi_batch_assert_justification_table$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == primary_key_values_list) {
            Errors.warn($str91$Failed_to_compute_a_justification, sentence_to_be_asserted, target_mt);
        }
        SubLObject successP = T;
        SubLObject cdolist_list_var = primary_key_values_list;
        SubLObject primary_key_values = NIL;
        primary_key_values = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pk_value_strings = convert_sql_data_to_strings(primary_key_values);
            final SubLObject pk_values_sentence = listS($$tablePrimaryKeyValues, table, append(pk_value_strings, NIL));
            sksi_batch_assert(pk_values_sentence, meta_mt, NIL);
            final SubLObject rule = sksi_schema_translation_lifting_rule();
            final SubLObject pk_assertion = czer_meta.find_assertion_cycl(pk_values_sentence, meta_mt);
            final SubLObject sksi_support = fi.make_el_support($OPAQUE, list($$schemaTranslation, table, target_mt), meta_mt, UNPROVIDED);
            if (NIL == sksi_batch_add_argument(sentence_to_be_asserted, target_mt, list(rule, pk_assertion, sksi_support), NIL)) {
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            primary_key_values = cdolist_list_var.first();
        } 
        return successP;
    }

    public static SubLObject possibly_remember_primary_key_that_resulted_in_raw_tuple(final SubLObject raw_tuple, final SubLObject el_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($sksi_batch_assert_justification_table$.getDynamicValue(thread))) {
            SubLObject primary_key_values = NIL;
            SubLObject cdolist_list_var = $sksi_batch_primary_key_columns$.getDynamicValue(thread);
            SubLObject i = NIL;
            i = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject value = nth(i, raw_tuple);
                primary_key_values = cons(value, primary_key_values);
                cdolist_list_var = cdolist_list_var.rest();
                i = cdolist_list_var.first();
            } 
            primary_key_values = nreverse(primary_key_values);
            hash_table_utilities.push_hash(el_sentence, primary_key_values, $sksi_batch_assert_justification_table$.getDynamicValue(thread));
            return primary_key_values;
        }
        return NIL;
    }

    public static SubLObject with_sksi_batch_templates(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list95, bq_cons(PROGN, append(body, NIL)), $list97);
    }

    public static SubLObject possibly_with_sksi_batch_templates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject use_themP = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        use_themP = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, use_themP, bq_cons(WITH_SKSI_BATCH_TEMPLATES, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject initialize_sksi_batch_templates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == misc_utilities.uninitialized_p($sksi_batch_templates$.getDynamicValue(thread)))) {
            Errors.error($str102$Cannot_handle_nested_SKSI_batch_i);
        }
        return dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject clear_sksi_batch_templates() {
        $sksi_batch_templates$.setDynamicValue($UNINITIALIZED);
        return NIL;
    }

    public static SubLObject sksi_batch_template_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != inference_utilities.allowed_rules_spec_p(v_object.first()))) && (NIL != booleanp(second(v_object))));
    }

    public static SubLObject sksi_batch_template_allowed_rules(final SubLObject template) {
        return template.first();
    }

    public static SubLObject sksi_batch_template_use_type_coercionP(final SubLObject template) {
        return second(template);
    }

    public static SubLObject new_sksi_batch_template(final SubLObject rules, final SubLObject use_type_coercionP) {
        assert NIL != inference_utilities.allowed_rules_spec_p(rules) : "inference_utilities.allowed_rules_spec_p(rules) " + "CommonSymbols.NIL != inference_utilities.allowed_rules_spec_p(rules) " + rules;
        assert NIL != booleanp(use_type_coercionP) : "Types.booleanp(use_type_coercionP) " + "CommonSymbols.NIL != Types.booleanp(use_type_coercionP) " + use_type_coercionP;
        return list(rules, use_type_coercionP);
    }

    public static SubLObject remember_batch_template_for_future_use(final SubLObject el_sentence, final SubLObject content_mt, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == misc_utilities.initialized_p($sksi_batch_templates$.getDynamicValue(thread))) {
            return $UNINITIALIZED;
        }
        final SubLObject narts = remove_if(LOGICAL_FIELD_INDEXICAL_P, remove(content_mt, cycl_utilities.expression_gather(el_sentence, NART_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rules = assertion_utilities.safe_all_forward_rules_relevant_to_terms(narts);
        final SubLObject type_coercion_successfulP = $sksi_batch_translate_type_coercion_successfulP$.getDynamicValue(thread);
        final SubLObject batch_template = new_sksi_batch_template(rules, type_coercion_successfulP);
        sksi_batch_template_enter(physical_schema, logical_schema, content_mt, batch_template);
        return narts;
    }

    public static SubLObject sksi_batch_template_lookup(final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == misc_utilities.initialized_p($sksi_batch_templates$.getDynamicValue(thread))) {
            return $UNINITIALIZED;
        }
        final SubLObject key = list(physical_schema, logical_schema, content_mt);
        return dictionary.dictionary_lookup_without_values($sksi_batch_templates$.getDynamicValue(thread), key, $UNINITIALIZED);
    }

    public static SubLObject sksi_batch_template_enter(final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_batch_template_p(value) : "sksi_batch_translate.sksi_batch_template_p(value) " + "CommonSymbols.NIL != sksi_batch_translate.sksi_batch_template_p(value) " + value;
        final SubLObject key = list(physical_schema, logical_schema, content_mt);
        return dictionary.dictionary_enter($sksi_batch_templates$.getDynamicValue(thread), key, value);
    }

    public static SubLObject current_sksi_batch_template() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_sksi_batch_template$.getDynamicValue(thread);
    }

    public static SubLObject current_sksi_batch_template_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($current_sksi_batch_template$.getDynamicValue(thread))) {
            return sksi_batch_template_allowed_rules($current_sksi_batch_template$.getDynamicValue(thread));
        }
        return kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
    }

    public static SubLObject sksi_batch_translate_coerce_typesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($current_sksi_batch_template$.getDynamicValue(thread))) {
            return sksi_batch_template_use_type_coercionP($current_sksi_batch_template$.getDynamicValue(thread));
        }
        return $sksi_batch_translate_coerce_typesP$.getDynamicValue(thread);
    }

    public static SubLObject convert_sql_data_to_strings(final SubLObject data) {
        return Mapping.mapcar(CONVERT_SQL_DATUM_TO_STRING, data);
    }

    public static SubLObject convert_sql_datum_to_string(final SubLObject datum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (datum.isString()) {
            return datum;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            result = string_utilities.str(datum);
        } finally {
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject clear_sksi_schema_translation_lifting_rule() {
        final SubLObject cs = $sksi_schema_translation_lifting_rule_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sksi_schema_translation_lifting_rule() {
        return memoization_state.caching_state_remove_function_results_with_args($sksi_schema_translation_lifting_rule_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_schema_translation_lifting_rule_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = czer_meta.find_assertion_cycl($sksi_schema_translation_lifting_rule_sentence$.getGlobalValue(), $sksi_schema_translation_lifting_rule_mt$.getGlobalValue());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rule)) {
            Errors.error($str113$Could_not_find_the_SKSI_schemaTra, $sksi_schema_translation_lifting_rule_sentence$.getGlobalValue(), $sksi_schema_translation_lifting_rule_mt$.getGlobalValue());
        }
        return rule;
    }

    public static SubLObject sksi_schema_translation_lifting_rule() {
        SubLObject caching_state = $sksi_schema_translation_lifting_rule_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKSI_SCHEMA_TRANSLATION_LIFTING_RULE, $sksi_schema_translation_lifting_rule_caching_state$, ONE_INTEGER, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sksi_schema_translation_lifting_rule_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_sksi_get_datum_var() {
        final SubLObject cs = $sksi_get_datum_var_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sksi_get_datum_var(final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args($sksi_get_datum_var_caching_state$.getGlobalValue(), list(number), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_get_datum_var_internal(final SubLObject number) {
        return intern(cconcatenate($str116$DATUM_, format_nil.format_nil_s_no_copy(number)), UNPROVIDED);
    }

    public static SubLObject sksi_get_datum_var(final SubLObject number) {
        SubLObject caching_state = $sksi_get_datum_var_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKSI_GET_DATUM_VAR, $sksi_get_datum_var_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, number, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sksi_get_datum_var_internal(number)));
            memoization_state.caching_state_put(caching_state, number, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_sksi_get_raw_var() {
        final SubLObject cs = $sksi_get_raw_var_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sksi_get_raw_var(final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args($sksi_get_raw_var_caching_state$.getGlobalValue(), list(number), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_get_raw_var_internal(final SubLObject number) {
        return intern(cconcatenate($str119$RAW_, format_nil.format_nil_s_no_copy(number)), UNPROVIDED);
    }

    public static SubLObject sksi_get_raw_var(final SubLObject number) {
        SubLObject caching_state = $sksi_get_raw_var_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKSI_GET_RAW_VAR, $sksi_get_raw_var_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, number, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sksi_get_raw_var_internal(number)));
            memoization_state.caching_state_put(caching_state, number, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_sksi_get_arg_var() {
        final SubLObject cs = $sksi_get_arg_var_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sksi_get_arg_var(final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args($sksi_get_arg_var_caching_state$.getGlobalValue(), list(number), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_get_arg_var_internal(final SubLObject number) {
        return intern(cconcatenate($str122$ARG_, format_nil.format_nil_s_no_copy(number)), UNPROVIDED);
    }

    public static SubLObject sksi_get_arg_var(final SubLObject number) {
        SubLObject caching_state = $sksi_get_arg_var_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKSI_GET_ARG_VAR, $sksi_get_arg_var_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, number, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sksi_get_arg_var_internal(number)));
            memoization_state.caching_state_put(caching_state, number, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_batch_assert(final SubLObject sentence, final SubLObject mt, final SubLObject check_wffP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sksi_batch_add_operations_to_transcriptP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject successP = (NIL != check_wffP) ? ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED) : ke.ke_assert_wff_now(sentence, mt, UNPROVIDED, UNPROVIDED);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == successP) && (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str124$Assertion_of__s_in__s_failed___a), new SubLObject[]{ ONE_INTEGER, sentence, mt, error });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return successP;
        }
        final SubLObject successP = cyc_kernel.cyc_assert(sentence, mt, list($kw125$CHECK_WFF_, check_wffP));
        if ((NIL == successP) && (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str124$Assertion_of__s_in__s_failed___a), new SubLObject[]{ ONE_INTEGER, sentence, mt, fi.fi_get_error_int() });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return successP;
    }

    public static SubLObject sksi_batch_add_argument(final SubLObject sentence, final SubLObject mt, final SubLObject supports, final SubLObject check_wffP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sksi_batch_add_operations_to_transcriptP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_add_argument_now(sentence, mt, supports, NIL, NIL, check_wffP);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return sksi_batch_add_argument_return_value_handler(sentence, mt, supports, successP, error);
        }
        final SubLObject successP = cyc_kernel.cyc_add_argument(sentence, supports, mt, list($kw125$CHECK_WFF_, check_wffP), UNPROVIDED);
        return sksi_batch_add_argument_return_value_handler(sentence, mt, supports, successP, UNPROVIDED);
    }

    public static SubLObject sksi_batch_add_argument_return_value_handler(final SubLObject sentence, final SubLObject mt, final SubLObject supports, final SubLObject successP, SubLObject error) {
        if (error == UNPROVIDED) {
            error = $UNINITIALIZED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == successP) {
            if (NIL != misc_utilities.uninitialized_p(error)) {
                error = fi.fi_get_error_int();
            }
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str126$Deduction_of__s_in__s_with_suppor), new SubLObject[]{ ONE_INTEGER, sentence, mt, supports, error });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        if (NIL != $sksi_batch_translate_add_argument_callback$.getDynamicValue(thread)) {
            funcall($sksi_batch_translate_add_argument_callback$.getDynamicValue(thread), sentence, mt, supports, successP);
        }
        return successP;
    }

    public static SubLObject sksi_batch_unassert(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sksi_batch_add_operations_to_transcriptP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_unassert_now(sentence, mt);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return sksi_batch_unassert_return_value_handler(sentence, mt, successP, error);
        }
        final SubLObject successP = cyc_kernel.cyc_unassert(sentence, mt);
        return sksi_batch_unassert_return_value_handler(sentence, mt, successP, UNPROVIDED);
    }

    public static SubLObject sksi_batch_unassert_return_value_handler(final SubLObject sentence, final SubLObject mt, final SubLObject successP, SubLObject error) {
        if (error == UNPROVIDED) {
            error = $UNINITIALIZED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == successP) {
            if (NIL != misc_utilities.uninitialized_p(error)) {
                error = fi.fi_get_error_int();
            }
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str44$__SKSI__A_, $str127$Unassert_of__s_from__s_failed___a), new SubLObject[]{ TWO_INTEGER, sentence, mt, error });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        if (NIL != $sksi_batch_translate_unassert_callback$.getDynamicValue(thread)) {
            funcall($sksi_batch_translate_unassert_callback$.getDynamicValue(thread), sentence, mt, successP);
        }
        return successP;
    }

    public static SubLObject test_sksi_wff_check_batch_translated_sentence(final SubLObject logical_sentence, final SubLObject content_mt, final SubLObject check_wff_nessP, final SubLObject coerce_typesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $sksi_batch_translate_coerce_typesP$.currentBinding(thread);
        try {
            $sksi_batch_translate_coerce_typesP$.bind(coerce_typesP, thread);
            thread.resetMultipleValues();
            final SubLObject result = sksi_wff_check_batch_translated_sentence(logical_sentence, content_mt, check_wff_nessP);
            final SubLObject format_string = thread.secondMultipleValue();
            final SubLObject explanation = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return list(result, format_string, explanation);
        } finally {
            $sksi_batch_translate_coerce_typesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject declare_sksi_batch_translate_file() {
        declareFunction(me, "set_sksi_batch_translate_only_asserted_meaning_sentences", "SET-SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES", 1, 0, false);
        declareFunction(me, "set_sksi_batch_translate_coerce_types", "SET-SKSI-BATCH-TRANSLATE-COERCE-TYPES", 1, 0, false);
        declareMacro(me, "with_sksi_batch_translate_only_asserted_meaning_sentences", "WITH-SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES");
        declareMacro(me, "without_sksi_batch_translate_only_asserted_meaning_sentences", "WITHOUT-SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES");
        declareMacro(me, "with_sksi_batch_translate_coerce_types", "WITH-SKSI-BATCH-TRANSLATE-COERCE-TYPES");
        declareMacro(me, "without_sksi_batch_translate_coerce_types", "WITHOUT-SKSI-BATCH-TRANSLATE-COERCE-TYPES");
        declareMacro(me, "with_sksi_batch_sql_select_statement", "WITH-SKSI-BATCH-SQL-SELECT-STATEMENT");
        declareFunction(me, "sksi_batch_assert_translations_of_table", "SKSI-BATCH-ASSERT-TRANSLATIONS-OF-TABLE", 1, 3, false);
        declareFunction(me, "sksi_batch_assert_all_sk_sources_in_mt", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT", 2, 4, false);
        declareFunction(me, "sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT-TO-KE-STREAM", 3, 4, false);
        declareFunction(me, "sksi_batch_assert_all_sk_sources_in_mt_to_ke_string", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT-TO-KE-STRING", 3, 3, false);
        declareFunction(me, "sksi_batch_assert_all_sk_sources_in_mt_to_ke_file", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT-TO-KE-FILE", 4, 3, false);
        declareFunction(me, "sksi_translate_all_sk_sources_in_mt", "SKSI-TRANSLATE-ALL-SK-SOURCES-IN-MT", 2, 4, false);
        declareFunction(me, "sksi_translate_all_sk_source_in_just_mt", "SKSI-TRANSLATE-ALL-SK-SOURCE-IN-JUST-MT", 2, 4, false);
        declareFunction(me, "sksi_translate_all_sk_sources_in_mt_to_stream", "SKSI-TRANSLATE-ALL-SK-SOURCES-IN-MT-TO-STREAM", 2, 4, false);
        declareFunction(me, "sksi_translate_all_sk_sources_in_mt_to_file", "SKSI-TRANSLATE-ALL-SK-SOURCES-IN-MT-TO-FILE", 3, 3, false);
        declareFunction(me, "sksi_translate_all_spec_sk_sources", "SKSI-TRANSLATE-ALL-SPEC-SK-SOURCES", 2, 4, false);
        declareFunction(me, "sksi_translate_all_spec_sk_sources_to_stream", "SKSI-TRANSLATE-ALL-SPEC-SK-SOURCES-TO-STREAM", 2, 4, false);
        declareFunction(me, "sksi_translate_all_spec_sk_sources_to_file", "SKSI-TRANSLATE-ALL-SPEC-SK-SOURCES-TO-FILE", 3, 3, false);
        declareFunction(me, "sksi_translate_all_simple_sk_source", "SKSI-TRANSLATE-ALL-SIMPLE-SK-SOURCE", 2, 4, false);
        declareFunction(me, "sksi_translate_all_simple_sk_source_to_stream", "SKSI-TRANSLATE-ALL-SIMPLE-SK-SOURCE-TO-STREAM", 2, 4, false);
        declareFunction(me, "sksi_translate_simple_sk_source", "SKSI-TRANSLATE-SIMPLE-SK-SOURCE", 4, 4, false);
        declareFunction(me, "sksi_translate_simple_sk_source_to_stream", "SKSI-TRANSLATE-SIMPLE-SK-SOURCE-TO-STREAM", 4, 4, false);
        declareFunction(me, "sksi_translate_simple_sk_source_to_file", "SKSI-TRANSLATE-SIMPLE-SK-SOURCE-TO-FILE", 5, 3, false);
        declareFunction(me, "new_sksi_translate_iterator", "NEW-SKSI-TRANSLATE-ITERATOR", 4, 3, false);
        declareFunction(me, "make_sksi_translate_iterator_state", "MAKE-SKSI-TRANSLATE-ITERATOR-STATE", 8, 0, false);
        declareFunction(me, "sksi_translate_iterate_done", "SKSI-TRANSLATE-ITERATE-DONE", 1, 0, false);
        declareFunction(me, "sksi_translate_iterate_next", "SKSI-TRANSLATE-ITERATE-NEXT", 1, 0, false);
        declareFunction(me, "sksi_translate_one_raw_tuple_to_ist_logical_sentence", "SKSI-TRANSLATE-ONE-RAW-TUPLE-TO-IST-LOGICAL-SENTENCE", 5, 2, false);
        declareFunction(me, "sksi_translate_one_raw_tuple_to_logical_sentence", "SKSI-TRANSLATE-ONE-RAW-TUPLE-TO-LOGICAL-SENTENCE", 5, 1, false);
        declareFunction(me, "sksi_translate_one_raw_tuple_to_logical_sentence_int", "SKSI-TRANSLATE-ONE-RAW-TUPLE-TO-LOGICAL-SENTENCE-INT", 5, 0, false);
        declareFunction(me, "sksi_postprocess_translated_sentence", "SKSI-POSTPROCESS-TRANSLATED-SENTENCE", 6, 0, false);
        declareFunction(me, "sksi_postprocess_translated_asent", "SKSI-POSTPROCESS-TRANSLATED-ASENT", 6, 0, false);
        declareFunction(me, "sksi_wff_check_batch_translated_sentence", "SKSI-WFF-CHECK-BATCH-TRANSLATED-SENTENCE", 3, 0, false);
        declareFunction(me, "sksi_remove_untranslatable", "SKSI-REMOVE-UNTRANSLATABLE", 1, 0, false);
        declareFunction(me, "sentence_contains_untranslatableP", "SENTENCE-CONTAINS-UNTRANSLATABLE?", 1, 0, false);
        declareFunction(me, "sksi_remove_unreformulatable", "SKSI-REMOVE-UNREFORMULATABLE", 1, 0, false);
        declareFunction(me, "sentence_contains_unreformulatableP", "SENTENCE-CONTAINS-UNREFORMULATABLE?", 1, 0, false);
        declareFunction(me, "sksi_translate_raw_tuple", "SKSI-TRANSLATE-RAW-TUPLE", 2, 0, false);
        declareFunction(me, "sksi_translate_raw_sentence", "SKSI-TRANSLATE-RAW-SENTENCE", 5, 0, false);
        declareFunction(me, "sksi_translate_decoded_sentence", "SKSI-TRANSLATE-DECODED-SENTENCE", 5, 0, false);
        declareFunction(me, "new_sk_source_row_iterator", "NEW-SK-SOURCE-ROW-ITERATOR", 3, 3, false);
        declareFunction(me, "sk_source_row_iterator_next", "SK-SOURCE-ROW-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "sksi_raw_tuple_translation_pattern_internal", "SKSI-RAW-TUPLE-TRANSLATION-PATTERN-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_raw_tuple_translation_pattern", "SKSI-RAW-TUPLE-TRANSLATION-PATTERN", 1, 0, false);
        declareFunction(me, "sksi_raw_sentence_translation_pattern_internal", "SKSI-RAW-SENTENCE-TRANSLATION-PATTERN-INTERNAL", 4, 0, false);
        declareFunction(me, "sksi_raw_sentence_translation_pattern", "SKSI-RAW-SENTENCE-TRANSLATION-PATTERN", 4, 0, false);
        declareFunction(me, "physical_field_has_physical_override", "PHYSICAL-FIELD-HAS-PHYSICAL-OVERRIDE", 2, 0, false);
        declareFunction(me, "possibly_override_physical_field_value", "POSSIBLY-OVERRIDE-PHYSICAL-FIELD-VALUE", 3, 0, false);
        declareFunction(me, "sksi_batch_reformulate", "SKSI-BATCH-REFORMULATE", 2, 0, false);
        declareFunction(me, "sksi_simplify_decoded_sentence", "SKSI-SIMPLIFY-DECODED-SENTENCE", 1, 0, false);
        declareFunction(me, "sksi_logical_field_indexicals_of_decoded_sentence", "SKSI-LOGICAL-FIELD-INDEXICALS-OF-DECODED-SENTENCE", 1, 0, false);
        declareFunction(me, "prune_consequent_conditional_meaning_sentences_wrt_antecedents", "PRUNE-CONSEQUENT-CONDITIONAL-MEANING-SENTENCES-WRT-ANTECEDENTS", 4, 0, false);
        declareFunction(me, "sksi_decoded_sentence_translation_pattern", "SKSI-DECODED-SENTENCE-TRANSLATION-PATTERN", 5, 0, false);
        declareFunction(me, "sksi_batch_assert_sentence_with_deduced_argument_assuming_table", "SKSI-BATCH-ASSERT-SENTENCE-WITH-DEDUCED-ARGUMENT-ASSUMING-TABLE", 3, 0, false);
        declareFunction(me, "sksi_batch_assert_sentence_with_deduced_argument", "SKSI-BATCH-ASSERT-SENTENCE-WITH-DEDUCED-ARGUMENT", 4, 0, false);
        declareFunction(me, "possibly_remember_primary_key_that_resulted_in_raw_tuple", "POSSIBLY-REMEMBER-PRIMARY-KEY-THAT-RESULTED-IN-RAW-TUPLE", 2, 0, false);
        declareMacro(me, "with_sksi_batch_templates", "WITH-SKSI-BATCH-TEMPLATES");
        declareMacro(me, "possibly_with_sksi_batch_templates", "POSSIBLY-WITH-SKSI-BATCH-TEMPLATES");
        declareFunction(me, "initialize_sksi_batch_templates", "INITIALIZE-SKSI-BATCH-TEMPLATES", 0, 0, false);
        declareFunction(me, "clear_sksi_batch_templates", "CLEAR-SKSI-BATCH-TEMPLATES", 0, 0, false);
        declareFunction(me, "sksi_batch_template_p", "SKSI-BATCH-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "sksi_batch_template_allowed_rules", "SKSI-BATCH-TEMPLATE-ALLOWED-RULES", 1, 0, false);
        declareFunction(me, "sksi_batch_template_use_type_coercionP", "SKSI-BATCH-TEMPLATE-USE-TYPE-COERCION?", 1, 0, false);
        declareFunction(me, "new_sksi_batch_template", "NEW-SKSI-BATCH-TEMPLATE", 2, 0, false);
        declareFunction(me, "remember_batch_template_for_future_use", "REMEMBER-BATCH-TEMPLATE-FOR-FUTURE-USE", 4, 0, false);
        declareFunction(me, "sksi_batch_template_lookup", "SKSI-BATCH-TEMPLATE-LOOKUP", 3, 0, false);
        declareFunction(me, "sksi_batch_template_enter", "SKSI-BATCH-TEMPLATE-ENTER", 4, 0, false);
        declareFunction(me, "current_sksi_batch_template", "CURRENT-SKSI-BATCH-TEMPLATE", 0, 0, false);
        declareFunction(me, "current_sksi_batch_template_allowed_rules", "CURRENT-SKSI-BATCH-TEMPLATE-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "sksi_batch_translate_coerce_typesP", "SKSI-BATCH-TRANSLATE-COERCE-TYPES?", 0, 0, false);
        declareFunction(me, "convert_sql_data_to_strings", "CONVERT-SQL-DATA-TO-STRINGS", 1, 0, false);
        declareFunction(me, "convert_sql_datum_to_string", "CONVERT-SQL-DATUM-TO-STRING", 1, 0, false);
        declareFunction(me, "clear_sksi_schema_translation_lifting_rule", "CLEAR-SKSI-SCHEMA-TRANSLATION-LIFTING-RULE", 0, 0, false);
        declareFunction(me, "remove_sksi_schema_translation_lifting_rule", "REMOVE-SKSI-SCHEMA-TRANSLATION-LIFTING-RULE", 0, 0, false);
        declareFunction(me, "sksi_schema_translation_lifting_rule_internal", "SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-INTERNAL", 0, 0, false);
        declareFunction(me, "sksi_schema_translation_lifting_rule", "SKSI-SCHEMA-TRANSLATION-LIFTING-RULE", 0, 0, false);
        declareFunction(me, "clear_sksi_get_datum_var", "CLEAR-SKSI-GET-DATUM-VAR", 0, 0, false);
        declareFunction(me, "remove_sksi_get_datum_var", "REMOVE-SKSI-GET-DATUM-VAR", 1, 0, false);
        declareFunction(me, "sksi_get_datum_var_internal", "SKSI-GET-DATUM-VAR-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_get_datum_var", "SKSI-GET-DATUM-VAR", 1, 0, false);
        declareFunction(me, "clear_sksi_get_raw_var", "CLEAR-SKSI-GET-RAW-VAR", 0, 0, false);
        declareFunction(me, "remove_sksi_get_raw_var", "REMOVE-SKSI-GET-RAW-VAR", 1, 0, false);
        declareFunction(me, "sksi_get_raw_var_internal", "SKSI-GET-RAW-VAR-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_get_raw_var", "SKSI-GET-RAW-VAR", 1, 0, false);
        declareFunction(me, "clear_sksi_get_arg_var", "CLEAR-SKSI-GET-ARG-VAR", 0, 0, false);
        declareFunction(me, "remove_sksi_get_arg_var", "REMOVE-SKSI-GET-ARG-VAR", 1, 0, false);
        declareFunction(me, "sksi_get_arg_var_internal", "SKSI-GET-ARG-VAR-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_get_arg_var", "SKSI-GET-ARG-VAR", 1, 0, false);
        declareFunction(me, "sksi_batch_assert", "SKSI-BATCH-ASSERT", 3, 0, false);
        declareFunction(me, "sksi_batch_add_argument", "SKSI-BATCH-ADD-ARGUMENT", 4, 0, false);
        declareFunction(me, "sksi_batch_add_argument_return_value_handler", "SKSI-BATCH-ADD-ARGUMENT-RETURN-VALUE-HANDLER", 4, 1, false);
        declareFunction(me, "sksi_batch_unassert", "SKSI-BATCH-UNASSERT", 2, 0, false);
        declareFunction(me, "sksi_batch_unassert_return_value_handler", "SKSI-BATCH-UNASSERT-RETURN-VALUE-HANDLER", 3, 1, false);
        declareFunction(me, "test_sksi_wff_check_batch_translated_sentence", "TEST-SKSI-WFF-CHECK-BATCH-TRANSLATED-SENTENCE", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_batch_translate_file() {
        defvar("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*", T);
        defvar("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*", NIL);
        defparameter("*SKSI-BATCH-TRANSLATE-TYPE-COERCION-SUCCESSFUL?*", $UNINITIALIZED);
        defparameter("*SKSI-BATCH-ASSERT-JUSTIFICATION-TABLE*", $UNINITIALIZED);
        defparameter("*SKSI-BATCH-PRIMARY-KEY-COLUMNS*", $UNINITIALIZED);
        defparameter("*SKSI-BATCH-SQL-SELECT-STATEMENT*", NIL);
        defparameter("*SKSI-BATCH-SQL-ORDER-BY-PRIMARY-KEY?*", NIL);
        defparameter("*SKSI-BATCH-ADD-OPERATIONS-TO-TRANSCRIPT?*", NIL);
        defparameter("*CURRENT-SKSI-BATCH-TEMPLATE*", $UNINITIALIZED);
        defvar("*SKSI-BATCH-TEMPLATES*", $UNINITIALIZED);
        defparameter("*SKSI-BATCH-TRANSLATE-ADD-ARGUMENT-CALLBACK*", NIL);
        defparameter("*SKSI-BATCH-TRANSLATE-UNASSERT-CALLBACK*", NIL);
        defparameter("*SKSI-BATCH-ASSERTING-TRANSLATIONS-OF-THIS-TABLE*", $UNINITIALIZED);
        defparameter("*SKSI-ROW-ITERATOR-OVERRIDES*", $list68);
        deflexical("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-SENTENCE*", $list110);
        deflexical("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-MT*", $$SKSIMt);
        deflexical("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-CACHING-STATE*", NIL);
        deflexical("*SKSI-GET-DATUM-VAR-CACHING-STATE*", NIL);
        deflexical("*SKSI-GET-RAW-VAR-CACHING-STATE*", NIL);
        deflexical("*SKSI-GET-ARG-VAR-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_batch_translate_file() {
        memoization_state.note_memoized_function(SKSI_RAW_TUPLE_TRANSLATION_PATTERN);
        memoization_state.note_memoized_function(SKSI_RAW_SENTENCE_TRANSLATION_PATTERN);
        register_macro_helper(INITIALIZE_SKSI_BATCH_TEMPLATES, WITH_SKSI_BATCH_TEMPLATES);
        register_macro_helper(CLEAR_SKSI_BATCH_TEMPLATES, WITH_SKSI_BATCH_TEMPLATES);
        memoization_state.note_globally_cached_function(SKSI_SCHEMA_TRANSLATION_LIFTING_RULE);
        memoization_state.note_globally_cached_function(SKSI_GET_DATUM_VAR);
        memoization_state.note_globally_cached_function(SKSI_GET_RAW_VAR);
        memoization_state.note_globally_cached_function(SKSI_GET_ARG_VAR);
        note_funcall_helper_function(TEST_SKSI_WFF_CHECK_BATCH_TRANSLATED_SENTENCE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_batch_translate_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_batch_translate_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_batch_translate_file();
    }

    
}

/**
 * Total time: 1156 ms
 */
