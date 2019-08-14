package com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
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
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.virtual_indexing;
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
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class simple_db extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new simple_db();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.modeling_tools.schema_validator.simple_db";






    // defparameter
    public static final SubLSymbol $sksi_transcript_source_repropagationP$ = makeSymbol("*SKSI-TRANSCRIPT-SOURCE-REPROPAGATION?*");

    // deflexical
    private static final SubLSymbol $simplified_sksi_predicates$ = makeSymbol("*SIMPLIFIED-SKSI-PREDICATES*");

    // defparameter
    private static final SubLSymbol $simple_db_validation_problems$ = makeSymbol("*SIMPLE-DB-VALIDATION-PROBLEMS*");

    // defparameter
    private static final SubLSymbol $convert_simple_sksi_db_to_complex_override_properties$ = makeSymbol("*CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX-OVERRIDE-PROPERTIES*");

    private static final SubLObject $$SimpleDatabase = reader_make_constant_shell(makeString("SimpleDatabase"));

    private static final SubLSymbol SIMPLE_SKSI_TERMS = makeSymbol("SIMPLE-SKSI-TERMS");

    private static final SubLObject $$TestPace = reader_make_constant_shell(makeString("TestPace"));



    private static final SubLObject $$SimplifiedSKSIConstant = reader_make_constant_shell(makeString("SimplifiedSKSIConstant"));

    private static final SubLSymbol $simple_sksi_terms_caching_state$ = makeSymbol("*SIMPLE-SKSI-TERMS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_SIMPLE_SKSI_TERMS = makeSymbol("CLEAR-SIMPLE-SKSI-TERMS");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol SIMPLE_SKSI_ASSERTIONS_FOR_SKS = makeSymbol("SIMPLE-SKSI-ASSERTIONS-FOR-SKS");

    private static final SubLString $str10$Gathering_simple_SKSI_assertions_ = makeString("Gathering simple SKSI assertions in ");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $simple_sksi_assertions_for_sks_caching_state$ = makeSymbol("*SIMPLE-SKSI-ASSERTIONS-FOR-SKS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS = makeSymbol("CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS");

    private static final SubLSymbol $sym14$SIMPLE_SKSI_TERM_ = makeSymbol("SIMPLE-SKSI-TERM?");

    private static final SubLSymbol SK_SOURCE_IN_ANY_MT_P = makeSymbol("SK-SOURCE-IN-ANY-MT-P");



    private static final SubLString $$$Repropagating_ = makeString("Repropagating ");

    private static final SubLList $list18 = list(new SubLObject[]{ reader_make_constant_shell(makeString("tableInDBNamed")), reader_make_constant_shell(makeString("columnInDBTableNamed")), reader_make_constant_shell(makeString("objectSchemaTranslation")), reader_make_constant_shell(makeString("relationshipSchemaTranslation")), reader_make_constant_shell(makeString("assertionSchemaTranslation")), reader_make_constant_shell(makeString("tablePrimaryKey-SingleColumn")), reader_make_constant_shell(makeString("tablePrimaryKey")), reader_make_constant_shell(makeString("objectSchemaColumnPredicate")), reader_make_constant_shell(makeString("assertionTablePredicateColumn")), reader_make_constant_shell(makeString("dBTableArgNumMapping")), reader_make_constant_shell(makeString("dBTablePredicate")), reader_make_constant_shell(makeString("tableFieldNameList")), reader_make_constant_shell(makeString("identityTranslationColumn")), reader_make_constant_shell(makeString("temporalTranslationColumns")), reader_make_constant_shell(makeString("dBTableLogicalFieldIndexicalForArgNum")), reader_make_constant_shell(makeString("dBTableTemporalLogicalFieldIndexicals")), reader_make_constant_shell(makeString("logicalFieldIndexicalTranslationType")), reader_make_constant_shell(makeString("dBFieldTranslationInputs")), reader_make_constant_shell(makeString("predicateAndArgnumForLogicalFieldIndexical")), reader_make_constant_shell(makeString("nonContextualizedMeaningSentence")), reader_make_constant_shell(makeString("schemaFieldNameList")) });



    private static final SubLList $list20 = list(makeKeyword("LOOKS-GOOD"));

    private static final SubLString $str21$Simple_DB_invalid___s = makeString("Simple DB invalid: ~s");

    private static final SubLString $str22$Validating__a_____ = makeString("Validating ~a...~%");

    private static final SubLString $str23$DB_was_not_simple__returning__loo = makeString("DB was not simple, returning :looks-good anyway");

    private static final SubLList $list24 = list(reader_make_constant_shell(makeString("isa")));

    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));

    private static final SubLList $list26 = list(reader_make_constant_shell(makeString("sksIsa")), reader_make_constant_shell(makeString("mappingMt")));

    private static final SubLString $str27$Using_mapping_mt__a__ = makeString("Using mapping mt ~a~%");

    private static final SubLList $list28 = list(reader_make_constant_shell(makeString("structuredKnowledgeSourceName")), reader_make_constant_shell(makeString("userNameForSKS")), reader_make_constant_shell(makeString("passwordForSKS")), reader_make_constant_shell(makeString("serverOfSKS")), reader_make_constant_shell(makeString("portNumberForSKS")), reader_make_constant_shell(makeString("sksProxyHost")), reader_make_constant_shell(makeString("sksProxyPort")));

    private static final SubLList $list29 = list(reader_make_constant_shell(makeString("subProtocolForSKS")), reader_make_constant_shell(makeString("sqlProgramForSKS")));

    private static final SubLString $str30$_is_not___sksRepresentationComple = makeString(" is not #$sksRepresentationComplete");

    private static final SubLString $$$could_not_find_any_tables_in_ = makeString("could not find any tables in ");

    private static final SubLString $$$in_mappingMt_ = makeString("in mappingMt ");

    private static final SubLList $list33 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("tableInDBNamed")), reader_make_constant_shell(makeString("tableFieldNameList")), reader_make_constant_shell(makeString("contentMt")), reader_make_constant_shell(makeString("physicalSchemaWithNameForKS")), reader_make_constant_shell(makeString("logicalSchemaWithNameForKS")), reader_make_constant_shell(makeString("columnInDBTableNamed")));

    private static final SubLObject $$schemaTranslation = reader_make_constant_shell(makeString("schemaTranslation"));











    private static final SubLString $str40$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str45$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str48$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str50$no___schemaTranslation_for_ = makeString("no #$schemaTranslation for ");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLObject $$objectSchemaTranslation = reader_make_constant_shell(makeString("objectSchemaTranslation"));

    private static final SubLList $list53 = list(reader_make_constant_shell(makeString("tablePrimaryKey-SingleColumn")));

    private static final SubLObject $$objectSchemaColumnPredicate = reader_make_constant_shell(makeString("objectSchemaColumnPredicate"));

    private static final SubLObject $$columnInDBTableNamed = reader_make_constant_shell(makeString("columnInDBTableNamed"));

    private static final SubLString $str56$expected_at_least_2_columns__via_ = makeString("expected at least 2 columns (via #$columnInDBTableNamed) in ");

    private static final SubLString $str57$__got_ = makeString(", got ");

    private static final SubLString $str58$no_columns__via___columnInDBTable = makeString("no columns (via #$columnInDBTableNamed) in ");

    private static final SubLString $str59$_have_an___objectSchemaColumnPred = makeString(" have an #$objectSchemaColumnPredicate");

    private static final SubLObject $$relationshipSchemaTranslation = reader_make_constant_shell(makeString("relationshipSchemaTranslation"));

    private static final SubLList $list61 = list(reader_make_constant_shell(makeString("dBTablePredicate")), reader_make_constant_shell(makeString("dBTableArgNumMapping")));

    private static final SubLObject $$assertionSchemaTranslation = reader_make_constant_shell(makeString("assertionSchemaTranslation"));

    private static final SubLList $list63 = list(reader_make_constant_shell(makeString("assertionTablePredicateColumn")), reader_make_constant_shell(makeString("dBTableArgNumMapping")));

    private static final SubLObject $$DatabaseColumn = reader_make_constant_shell(makeString("DatabaseColumn"));

    private static final SubLString $str65$_is_not_a___DatabaseColumn__argum = makeString(" is not a #$DatabaseColumn (argument to #$dBTableArgNumMapping for ");

    private static final SubLString $str66$_ = makeString(")");

    private static final SubLList $list67 = list(reader_make_constant_shell(makeString("identityTranslationColumn")));

    private static final SubLObject $$dBTableArgNumMapping = reader_make_constant_shell(makeString("dBTableArgNumMapping"));

    private static final SubLString $str69$unexpected_schema_translation_pre = makeString("unexpected schema translation pred ");

    private static final SubLString $$$_for_ = makeString(" for ");

    private static final SubLString $str71$Expected_exactly_one_physical_sch = makeString("Expected exactly one physical schema for ");

    private static final SubLString $str72$__via___physicalSchemaSourceMap__ = makeString(" (via #$physicalSchemaSourceMap), got ");

    private static final SubLObject $$tableFieldNameList = reader_make_constant_shell(makeString("tableFieldNameList"));



    private static final SubLString $$$Found_column_ = makeString("Found column ");

    private static final SubLString $str76$_not_listed_in___tableFieldNameLi = makeString(" not listed in #$tableFieldNameList for ");

    private static final SubLString $str77$__If_it_is_a_column_in_the_table_ = makeString(". If it is a column in the table, add it to the #$tableFieldNameList. If not, remove it as a #$columnInDBTableNamed.");

    private static final SubLObject $const78$NonCanonicallyTemporallyIndexedDB = reader_make_constant_shell(makeString("NonCanonicallyTemporallyIndexedDBTable"));

    private static final SubLObject $const79$CanonicallyTemporallyIndexedDBTab = reader_make_constant_shell(makeString("CanonicallyTemporallyIndexedDBTable"));

    private static final SubLList $list80 = list(reader_make_constant_shell(makeString("temporalTranslationColumns")));

    private static final SubLObject $$temporalTranslationColumns = reader_make_constant_shell(makeString("temporalTranslationColumns"));

    private static final SubLString $str82$Found_no___temporalTranslationCol = makeString("Found no #$temporalTranslationColumns for ");

    private static final SubLList $list83 = list(reader_make_constant_shell(makeString("temporalColumnNullMapsTo")));

    private static final SubLString $str84$_is_not_known_to_be_a___Canonical = makeString(" is not known to be a #$CanonicallyTemporallyIndexedDBTable or a #$NonCanonicallyTemporallyIndexedDBTable in ");

    private static final SubLList $list85 = list(reader_make_constant_shell(makeString("physicalFields")), reader_make_constant_shell(makeString("physicalFieldIndexicals")), reader_make_constant_shell(makeString("schemaFieldList")), reader_make_constant_shell(makeString("primaryKey")));

    private static final SubLObject $$fieldEncoding = reader_make_constant_shell(makeString("fieldEncoding"));

    private static final SubLString $str87$Expected_exactly_one_logical_sche = makeString("Expected exactly one logical schema for ");

    private static final SubLString $str88$__via___logicalPhysicalSchemaMap_ = makeString(" (via #$logicalPhysicalSchemaMap), got ");

    private static final SubLList $list89 = list(new SubLObject[]{ reader_make_constant_shell(makeString("fieldDecoding")), reader_make_constant_shell(makeString("logicalFields")), reader_make_constant_shell(makeString("logicalFieldIndexicals")), reader_make_constant_shell(makeString("logicalPhysicalSchemaMap")), reader_make_constant_shell(makeString("logicalSchemaFieldOfTypeWithMultiplicity")), reader_make_constant_shell(makeString("logicalSchemaFieldIndexicalOfTypeWithMultiplicity")), reader_make_constant_shell(makeString("logicalSchemaSourceMap")), reader_make_constant_shell(makeString("nonContextualizedMeaningSentence")), reader_make_constant_shell(makeString("meaningSentenceOfSchema")) });

    private static final SubLList $list90 = list(reader_make_constant_shell(makeString("fieldDecoding")));

    private static final SubLSymbol CMLS_FN_NART_P = makeSymbol("CMLS-FN-NART-P");

    private static final SubLObject $$codeMapping = reader_make_constant_shell(makeString("codeMapping"));



    private static final SubLObject $$logicalFieldValueWithFieldName = reader_make_constant_shell(makeString("logicalFieldValueWithFieldName"));

    private static final SubLString $str95$Found_no___codeMapping_for_ = makeString("Found no #$codeMapping for ");

    private static final SubLString $str96$__the_indexical_for_the_field_nam = makeString(", the indexical for the field named ");

    private static final SubLString $str97$__Ensure_one_exists_via_either_as = makeString(". Ensure one exists via either asserting it directly or concluding it via #$synonymousExternalConceptToken.");

    private static final SubLObject $$fieldDecoding = reader_make_constant_shell(makeString("fieldDecoding"));

    private static final SubLObject $$CMLSFn = reader_make_constant_shell(makeString("CMLSFn"));



    private static final SubLString $str101$_is_missing_an_asserted_value_for = makeString(" is missing an asserted value for ");

    private static final SubLString $$$_is_missing_a_value_for_ = makeString(" is missing a value for ");

    private static final SubLSymbol $kw103$REPROPAGATE_ = makeKeyword("REPROPAGATE?");

    private static final SubLString $$$Processing_ = makeString("Processing ");

    private static final SubLString $str105$__seed__simple_sksi_assertions_fo = makeString(" (seed) simple sksi assertions for ");

    private static final SubLString $str106$___A_simple_sksi_assertions_check = makeString("~&~A simple sksi assertions checked~%");



    private static final SubLString $str108$___S_in__S__ = makeString("+ ~S in ~S~%");

    private static final SubLString $str109$___S_in__S__ = makeString("- ~S in ~S~%");

    private static final SubLSymbol $kw110$READ_ONLY_ = makeKeyword("READ-ONLY?");

    private static final SubLString $$$Adding_asserted_arguments_to_ = makeString("Adding asserted arguments to ");

    private static final SubLString $$$_complex_sksi_assertions_for_ = makeString(" complex sksi assertions for ");

    private static final SubLString $str113$Assert_failed_for__A = makeString("Assert failed for ~A");

    private static final SubLString $$$Killing_ = makeString("Killing ");

    private static final SubLString $$$_simple_sksi_assertions_for_ = makeString(" simple sksi assertions for ");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLObject $const118$StructuredKnowledgeSource_TopLeve = reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel"));

    public static SubLObject simple_sksi_dbP(final SubLObject db) {
        return isa.isa_in_any_mtP(db, $$SimpleDatabase);
    }

    public static SubLObject clear_simple_sksi_terms() {
        final SubLObject cs = $simple_sksi_terms_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_simple_sksi_terms() {
        return memoization_state.caching_state_remove_function_results_with_args($simple_sksi_terms_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject simple_sksi_terms_internal() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = isa.all_quoted_instances_in_all_mts($$SimplifiedSKSIConstant);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject skip_candidateP = NIL;
            if (NIL != kb_utilities.kbeq(candidate, $$TestPace)) {
                skip_candidateP = T;
            } else
                if (NIL != fort_types_interface.predicateP(candidate)) {
                    if (kb_indexing.num_predicate_rule_index(candidate, $NEG, UNPROVIDED, UNPROVIDED).isZero()) {
                        skip_candidateP = T;
                    } else {
                        final SubLObject antecedent_rules = kb_mapping.gather_predicate_rule_index(candidate, $NEG, UNPROVIDED, UNPROVIDED);
                        SubLObject forward_rule_foundP = T;
                        if (NIL == forward_rule_foundP) {
                            SubLObject csome_list_var = antecedent_rules;
                            SubLObject antecedent_rule = NIL;
                            antecedent_rule = csome_list_var.first();
                            while ((NIL == forward_rule_foundP) && (NIL != csome_list_var)) {
                                if (NIL != assertions_high.forward_assertionP(antecedent_rule)) {
                                    forward_rule_foundP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                antecedent_rule = csome_list_var.first();
                            } 
                        }
                        if (NIL == forward_rule_foundP) {
                            skip_candidateP = T;
                        }
                    }
                }

            if (NIL == skip_candidateP) {
                final SubLObject item_var = candidate;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject simple_sksi_terms() {
        SubLObject caching_state = $simple_sksi_terms_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SIMPLE_SKSI_TERMS, $simple_sksi_terms_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SIMPLE_SKSI_TERMS);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(simple_sksi_terms_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject simple_sksi_termP(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, simple_sksi_terms());
    }

    public static SubLObject simple_sksi_assertions_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = simple_sksi_terms();
            SubLObject simple_sksi_term = NIL;
            simple_sksi_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == fort_types_interface.functorP(simple_sksi_term)) {
                    SubLObject cdolist_list_var_$1 = virtual_indexing.assertions_mentioning_terms(list(v_term, simple_sksi_term), UNPROVIDED);
                    SubLObject a = NIL;
                    a = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        final SubLObject item_var = a;
                        if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        a = cdolist_list_var_$1.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                simple_sksi_term = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject clear_simple_sksi_assertions_for_sks() {
        final SubLObject cs = $simple_sksi_assertions_for_sks_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_simple_sksi_assertions_for_sks(final SubLObject sks) {
        return memoization_state.caching_state_remove_function_results_with_args($simple_sksi_assertions_for_sks_caching_state$.getGlobalValue(), list(sks), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject simple_sksi_assertions_for_sks_internal(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = simple_sksi_assertions_for_term(sks);
        final SubLObject mapping_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject list_var = kb_mapping.gather_mt_index(mapping_mt);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($str10$Gathering_simple_SKSI_assertions_, format_nil.format_nil_s_no_copy(mapping_mt)) ? cconcatenate($str10$Gathering_simple_SKSI_assertions_, format_nil.format_nil_s_no_copy(mapping_mt)) : $$$cdolist, thread);
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
                SubLObject a = NIL;
                a = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != simple_sksi_assertionP(a)) {
                        final SubLObject item_var = a;
                        if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    a = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
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
        return result;
    }

    public static SubLObject simple_sksi_assertions_for_sks(final SubLObject sks) {
        SubLObject caching_state = $simple_sksi_assertions_for_sks_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SIMPLE_SKSI_ASSERTIONS_FOR_SKS, $simple_sksi_assertions_for_sks_caching_state$, FOUR_INTEGER, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sks, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(simple_sksi_assertions_for_sks_internal(sks)));
            memoization_state.caching_state_put(caching_state, sks, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject simple_sksi_assertionP(final SubLObject assertion) {
        return cycl_utilities.expression_find_if($sym14$SIMPLE_SKSI_TERM_, assertions_high.assertion_cnf(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject repropagate_knowledge_source(final SubLObject sk_source, SubLObject only_these_predicates) {
        if (only_these_predicates == UNPROVIDED) {
            only_these_predicates = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_kb_accessors.sk_source_in_any_mt_p(sk_source) : "sksi_kb_accessors.sk_source_in_any_mt_p(sk_source) " + "CommonSymbols.NIL != sksi_kb_accessors.sk_source_in_any_mt_p(sk_source) " + sk_source;
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
        try {
            $use_transcriptP$.bind($sksi_transcript_source_repropagationP$.getDynamicValue(thread), thread);
            final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
            assert NIL != fort_types_interface.microtheory_p(mapping_mt) : "fort_types_interface.microtheory_p(mapping_mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(mapping_mt) " + mapping_mt;
            final SubLObject list_var = kb_mapping.gather_mt_index(mapping_mt);
            final SubLObject _prev_bind_0_$3 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != cconcatenate($$$Repropagating_, format_nil.format_nil_a_no_copy(sk_source)) ? cconcatenate($$$Repropagating_, format_nil.format_nil_a_no_copy(sk_source)) : $$$cdolist, thread);
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
                    SubLObject gaf = NIL;
                    gaf = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if ((NIL != assertions_high.gaf_assertionP(gaf)) && ((NIL == only_these_predicates) || (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(gaf, only_these_predicates)))) {
                            ke.ke_repropagate_assertion_now(gaf);
                            count = add(count, ONE_INTEGER);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
                $progress_note$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $use_transcriptP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject repropagate_simple_db(final SubLObject db) {
        return repropagate_knowledge_source(db, $simplified_sksi_predicates$.getGlobalValue());
    }

    public static SubLObject ensure_simple_db_valid(final SubLObject db, SubLObject validate_queryableP, SubLObject verboseP) {
        if (validate_queryableP == UNPROVIDED) {
            validate_queryableP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        final SubLObject validation_result = validate_simple_db(db, validate_queryableP, verboseP);
        if ($list20.equal(validation_result)) {
            return validation_result;
        }
        return Errors.error($str21$Simple_DB_invalid___s, validation_result);
    }

    public static SubLObject validate_simple_db(final SubLObject db, SubLObject validate_queryableP, SubLObject verboseP) {
        if (validate_queryableP == UNPROVIDED) {
            validate_queryableP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != verboseP) {
            format_nil.force_format(T, $str22$Validating__a_____, db, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == simple_sksi_dbP(db)) {
            Errors.warn($str23$DB_was_not_simple__returning__loo);
            return $list20;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $simple_db_validation_problems$.currentBinding(thread);
        try {
            $simple_db_validation_problems$.bind(NIL, thread);
            ensure_preds_have_deduced_values(db, $list24, $$SKSIMt, UNPROVIDED);
            ensure_preds_have_deduced_values(db, $list26, $$SKSIMt, UNPROVIDED);
            final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(db);
            if (NIL != verboseP) {
                format_nil.force_format(T, $str27$Using_mapping_mt__a__, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ensure_preds_have_deduced_values(db, $list28, mapping_mt, UNPROVIDED);
                ensure_preds_have_deduced_values(db, $list29, mapping_mt, UNPROVIDED);
                if (NIL == sksi_kb_accessors.knowledge_source_representation_completeP(db)) {
                    note_simple_db_validation_problem(cconcatenate(format_nil.format_nil_a_no_copy(db), $str30$_is_not___sksRepresentationComple));
                }
                SubLObject tables = NIL;
                final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    tables = sksi_kb_accessors.sk_source_sub_ks_direct(db);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$7, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                }
                if (NIL == tables) {
                    note_simple_db_validation_problem(cconcatenate($$$could_not_find_any_tables_in_, format_nil.format_nil_a_no_copy(db)));
                }
                SubLObject cdolist_list_var = tables;
                SubLObject table = NIL;
                table = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    validate_simple_table(table, mapping_mt, validate_queryableP);
                    cdolist_list_var = cdolist_list_var.rest();
                    table = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
            }
            if (NIL == $simple_db_validation_problems$.getDynamicValue(thread)) {
                result = $list20;
            } else {
                note_simple_db_validation_problem(cconcatenate($$$in_mappingMt_, format_nil.format_nil_a_no_copy(mapping_mt)));
                result = nreverse($simple_db_validation_problems$.getDynamicValue(thread));
            }
        } finally {
            $simple_db_validation_problems$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject validate_simple_table(final SubLObject table, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ensure_preds_have_deduced_values(table, $list33, mapping_mt, UNPROVIDED);
            ensure_all_fields_are_listed(table, mapping_mt);
            SubLObject schema_translation_pred = NIL;
            if (NIL == schema_translation_pred) {
                final SubLObject node_var = $$schemaTranslation;
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
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
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str40$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str40$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str40$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$schemaTranslation, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list($$schemaTranslation, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == schema_translation_pred); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$17 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$17;
                                            final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (NIL != kb_mapping_utilities.fpred_value(table, spec_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                    schema_translation_pred = spec_pred;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$13;
                                                SubLObject _prev_bind_1_$13;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$14;
                                                SubLObject iteration_state_$22;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$15;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$24;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$16;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == schema_translation_pred) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$17);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == schema_translation_pred) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == schema_translation_pred) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22)); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == schema_translation_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == schema_translation_pred) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == schema_translation_pred) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$24 = NIL, rest_$24 = new_list; (NIL == schema_translation_pred) && (NIL != rest_$24); rest_$24 = rest_$24.rest()) {
                                                                    generating_fn = rest_$24.first();
                                                                    _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == schema_translation_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == schema_translation_pred) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == schema_translation_pred) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$14, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $$schemaTranslation, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$13, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                }
            }
            if (NIL == schema_translation_pred) {
                note_simple_db_validation_problem(cconcatenate($str50$no___schemaTranslation_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table), $$$_in_, format_nil.format_nil_a_no_copy(mapping_mt) }));
            }
            final SubLObject pcase_var2 = schema_translation_pred;
            if (pcase_var2.eql($$objectSchemaTranslation)) {
                ensure_preds_have_deduced_values(table, $list53, mapping_mt, UNPROVIDED);
                SubLObject column_count = ZERO_INTEGER;
                SubLObject found_a_column_predicateP = NIL;
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(table, $$columnInDBTableNamed, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                SubLObject column = NIL;
                column = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    column_count = add(column_count, ONE_INTEGER);
                    if (NIL != kb_mapping_utilities.fpred_value(column, $$objectSchemaColumnPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        found_a_column_predicateP = T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    column = cdolist_list_var.first();
                } 
                if (column_count.numL(TWO_INTEGER)) {
                    note_simple_db_validation_problem(cconcatenate($str56$expected_at_least_2_columns__via_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table), $str57$__got_, format_nil.format_nil_a_no_copy(column_count) }));
                }
                if (NIL == found_a_column_predicateP) {
                    note_simple_db_validation_problem(cconcatenate($str58$no_columns__via___columnInDBTable, new SubLObject[]{ format_nil.format_nil_a_no_copy(table), $str59$_have_an___objectSchemaColumnPred }));
                }
            } else
                if (pcase_var2.eql($$relationshipSchemaTranslation)) {
                    ensure_preds_have_deduced_values(table, $list61, mapping_mt, UNPROVIDED);
                    final SubLObject column_count = length(kb_mapping_utilities.pred_values(table, $$columnInDBTableNamed, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
                    if (column_count.numL(TWO_INTEGER)) {
                        note_simple_db_validation_problem(cconcatenate($str56$expected_at_least_2_columns__via_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table), $str57$__got_, format_nil.format_nil_a_no_copy(column_count) }));
                    }
                    ensure_temporal_or_atemporal_table(table, mapping_mt);
                } else
                    if (pcase_var2.eql($$assertionSchemaTranslation)) {
                        ensure_preds_have_deduced_values(table, $list63, mapping_mt, UNPROVIDED);
                        final SubLObject column_count = length(kb_mapping_utilities.pred_values(table, $$columnInDBTableNamed, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
                        if (column_count.numL(TWO_INTEGER)) {
                            note_simple_db_validation_problem(cconcatenate($str56$expected_at_least_2_columns__via_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table), $str57$__got_, format_nil.format_nil_a_no_copy(column_count) }));
                        }
                        SubLObject cdolist_list_var2 = el_list_items(kb_mapping_utilities.fpred_value(table, $$dBTableArgNumMapping, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        SubLObject column2 = NIL;
                        column2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL == isa.isaP(column2, $$DatabaseColumn, UNPROVIDED, UNPROVIDED)) {
                                note_simple_db_validation_problem(cconcatenate(format_nil.format_nil_a_no_copy(column2), new SubLObject[]{ $str65$_is_not_a___DatabaseColumn__argum, format_nil.format_nil_a_no_copy(table), $str66$_ }));
                            }
                            ensure_preds_have_deduced_values(column2, $list67, mapping_mt, UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            column2 = cdolist_list_var2.first();
                        } 
                        ensure_temporal_or_atemporal_table(table, mapping_mt);
                    } else {
                        note_simple_db_validation_problem(cconcatenate($str69$unexpected_schema_translation_pre, new SubLObject[]{ format_nil.format_nil_a_no_copy(schema_translation_pred), $$$_for_, format_nil.format_nil_a_no_copy(table) }));
                    }


            if (NIL == sksi_kb_accessors.knowledge_source_representation_completeP(table)) {
                note_simple_db_validation_problem(cconcatenate(format_nil.format_nil_a_no_copy(table), $str30$_is_not___sksRepresentationComple));
            }
            final SubLObject ps_list = sksi_kb_accessors.sk_source_physical_schemata(table);
            if (NIL == list_utilities.singletonP(ps_list)) {
                note_simple_db_validation_problem(cconcatenate($str71$Expected_exactly_one_physical_sch, new SubLObject[]{ format_nil.format_nil_a_no_copy(table), $str72$__via___physicalSchemaSourceMap__, format_nil.format_nil_a_no_copy(ps_list) }));
            } else {
                validate_simple_physical_schema(list_utilities.only_one(ps_list), mapping_mt, validate_queryableP);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ensure_all_fields_are_listed(final SubLObject table, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject field_name_el_list = kb_mapping_utilities.fpred_value(table, $$tableFieldNameList, ONE_INTEGER, TWO_INTEGER, $TRUE);
            final SubLObject field_name_items = (NIL != field_name_el_list) ? el_list_items(field_name_el_list) : NIL;
            final SubLObject field_set = set_utilities.construct_set_from_list(field_name_items, symbol_function(EQUALP), UNPROVIDED);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(table, $$columnInDBTableNamed, TWO_INTEGER, THREE_INTEGER, $TRUE);
            SubLObject column = NIL;
            column = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == set.set_memberP(column, field_set)) {
                    note_simple_db_validation_problem(cconcatenate($$$Found_column_, new SubLObject[]{ format_nil.format_nil_a_no_copy(column), $str76$_not_listed_in___tableFieldNameLi, format_nil.format_nil_a_no_copy(table), $str77$__If_it_is_a_column_in_the_table_ }));
                }
                cdolist_list_var = cdolist_list_var.rest();
                column = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ensure_temporal_or_atemporal_table(final SubLObject table, final SubLObject mapping_mt) {
        if (NIL == isa.isaP(table, $const78$NonCanonicallyTemporallyIndexedDB, mapping_mt, UNPROVIDED)) {
            if (NIL != isa.isaP(table, $const79$CanonicallyTemporallyIndexedDBTab, mapping_mt, UNPROVIDED)) {
                ensure_preds_have_deduced_values(table, $list80, mapping_mt, UNPROVIDED);
                final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(table, $$temporalTranslationColumns, UNPROVIDED, UNPROVIDED);
                if (NIL == gaf) {
                    note_simple_db_validation_problem(cconcatenate($str82$Found_no___temporalTranslationCol, format_nil.format_nil_a_no_copy(table)));
                } else {
                    final SubLObject column_1 = assertions_high.gaf_arg2(gaf);
                    final SubLObject column_2 = assertions_high.gaf_arg3(gaf);
                    ensure_preds_have_deduced_values(column_1, $list83, mapping_mt, UNPROVIDED);
                    ensure_preds_have_deduced_values(column_2, $list83, mapping_mt, UNPROVIDED);
                }
            } else {
                note_simple_db_validation_problem(cconcatenate(format_nil.format_nil_a_no_copy(table), new SubLObject[]{ $str84$_is_not_known_to_be_a___Canonical, format_nil.format_nil_a_no_copy(mapping_mt) }));
            }
        }
        return NIL;
    }

    public static SubLObject validate_simple_physical_schema(final SubLObject ps, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject preds = $list85;
            if (NIL != validate_queryableP) {
                preds = cons($$fieldEncoding, preds);
            }
            ensure_preds_have_deduced_values(ps, preds, mapping_mt, UNPROVIDED);
            final SubLObject ls_list = sksi_kb_accessors.physical_schema_logical_schemata(ps);
            if (NIL == list_utilities.singletonP(ls_list)) {
                note_simple_db_validation_problem(cconcatenate($str87$Expected_exactly_one_logical_sche, new SubLObject[]{ format_nil.format_nil_a_no_copy(ps), $str88$__via___logicalPhysicalSchemaMap_, format_nil.format_nil_a_no_copy(ls_list) }));
            } else {
                validate_simple_logical_schema(list_utilities.only_one(ls_list), mapping_mt, validate_queryableP);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject validate_simple_logical_schema(final SubLObject ls, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ensure_preds_have_deduced_values(ls, $list89, mapping_mt, UNPROVIDED);
            SubLObject cdolist_list_var = sksi_meaning_sentence_utilities.logical_schema_logical_field_indexicals_used_in_meaning_sentences(ls);
            SubLObject lfi = NIL;
            lfi = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                validate_simple_logical_field_indexical(lfi, mapping_mt, validate_queryableP);
                cdolist_list_var = cdolist_list_var.rest();
                lfi = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject validate_simple_logical_field_indexical(final SubLObject lfi, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = $list90;
        if (NIL != validate_queryableP) {
            preds = cons($$fieldEncoding, preds);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ensure_preds_have_deduced_values(lfi, preds, mapping_mt, T);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ensure_field_decoding_has_code_mappings(final SubLObject lfi) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(lfi, $$fieldDecoding, TWO_INTEGER, FOUR_INTEGER, $TRUE);
        SubLObject decoding = NIL;
        decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$27;
            final SubLObject cmls_fn_narts = cdolist_list_var_$27 = cycl_utilities.expression_gather(decoding, CMLS_FN_NART_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cmls_fn_nart = NIL;
            cmls_fn_nart = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                SubLObject code_mapping_foundP = NIL;
                final SubLObject pred_var = $$codeMapping;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cmls_fn_nart, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cmls_fn_nart, ONE_INTEGER, pred_var);
                    SubLObject done_var = code_mapping_foundP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$28 = code_mapping_foundP;
                                final SubLObject token_var_$29 = NIL;
                                while (NIL == done_var_$28) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                    final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(gaf));
                                    if (NIL != valid_$30) {
                                        code_mapping_foundP = T;
                                    }
                                    done_var_$28 = makeBoolean((NIL == valid_$30) || (NIL != code_mapping_foundP));
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
                        done_var = makeBoolean((NIL == valid) || (NIL != code_mapping_foundP));
                    } 
                }
                if (NIL == code_mapping_foundP) {
                    final SubLObject field_name = kb_mapping_utilities.fpred_value(lfi, $$logicalFieldValueWithFieldName, THREE_INTEGER, TWO_INTEGER, $TRUE);
                    note_simple_db_validation_problem(cconcatenate($str95$Found_no___codeMapping_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(lfi), $str96$__the_indexical_for_the_field_nam, format_nil.format_nil_a_no_copy(field_name), $str97$__Ensure_one_exists_via_either_as }));
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                cmls_fn_nart = cdolist_list_var_$27.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cmls_fn_nart_p(final SubLObject v_object) {
        return narts_high.nart_with_functor_p($$CMLSFn, v_object);
    }

    public static SubLObject note_simple_db_validation_problem(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp($simple_db_validation_problems$.getDynamicValue(thread)) : "Types.listp(simple_db.$simple_db_validation_problems$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.listp(simple_db.$simple_db_validation_problems$.getDynamicValue(thread)) " + $simple_db_validation_problems$.getDynamicValue(thread);
        $simple_db_validation_problems$.setDynamicValue(cons(string, $simple_db_validation_problems$.getDynamicValue(thread)), thread);
        return string;
    }

    public static SubLObject ensure_preds_have_deduced_values(final SubLObject fort, final SubLObject preds, final SubLObject mt, SubLObject find_as_subtermP) {
        if (find_as_subtermP == UNPROVIDED) {
            find_as_subtermP = NIL;
        }
        return ensure_preds_have_values(fort, preds, mt, NIL, find_as_subtermP);
    }

    public static SubLObject ensure_preds_have_values(final SubLObject fort, final SubLObject preds, final SubLObject mt, final SubLObject ensure_assertedP, final SubLObject find_as_subtermP) {
        SubLObject cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ensure_pred_has_value(fort, pred, mt, ensure_assertedP, find_as_subtermP);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject ensure_pred_has_value(final SubLObject fort, final SubLObject pred, final SubLObject mt, final SubLObject ensure_assertedP, final SubLObject find_as_subtermP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject foundP = NIL;
            SubLObject found_assertedP = NIL;
            if (NIL != find_as_subtermP) {
                if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $GAF)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $GAF);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$31 = NIL;
                                final SubLObject token_var_$32 = NIL;
                                while (NIL == done_var_$31) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                    final SubLObject valid_$33 = makeBoolean(!token_var_$32.eql(gaf));
                                    if (((NIL != valid_$33) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(gaf, final_index_spec))) && pred.eql(assertions_high.gaf_predicate(gaf))) {
                                        foundP = T;
                                        if (NIL != assertions_high.asserted_assertionP(gaf)) {
                                            found_assertedP = T;
                                        }
                                    }
                                    done_var_$31 = makeBoolean(NIL == valid_$33);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            SubLObject final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                SubLObject done_var_$32 = NIL;
                                final SubLObject token_var_$33 = NIL;
                                while (NIL == done_var_$32) {
                                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$33);
                                    final SubLObject valid_$34 = makeBoolean(!token_var_$33.eql(gaf2));
                                    if (NIL != valid_$34) {
                                        foundP = T;
                                        if (NIL != assertions_high.asserted_assertionP(gaf2)) {
                                            found_assertedP = T;
                                        }
                                    }
                                    done_var_$32 = makeBoolean(NIL == valid_$34);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                }

            if (NIL != ensure_assertedP) {
                if (NIL == found_assertedP) {
                    note_simple_db_validation_problem(cconcatenate(format_nil.format_nil_a_no_copy(fort), new SubLObject[]{ $str101$_is_missing_an_asserted_value_for, format_nil.format_nil_a_no_copy(pred), $$$_in_, format_nil.format_nil_a_no_copy(mt) }));
                }
            } else
                if (NIL == foundP) {
                    note_simple_db_validation_problem(cconcatenate(format_nil.format_nil_a_no_copy(fort), new SubLObject[]{ $$$_is_missing_a_value_for_, format_nil.format_nil_a_no_copy(pred), $$$_in_, format_nil.format_nil_a_no_copy(mt) }));
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject convert_simple_sksi_db_to_complex(final SubLObject sks, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.merge_plist(v_properties, $convert_simple_sksi_db_to_complex_override_properties$.getDynamicValue(thread));
        final SubLObject repropagateP = getf(v_properties, $kw103$REPROPAGATE_, UNPROVIDED);
        if (NIL != repropagateP) {
            SubLObject times;
            SubLObject n;
            for (times = (NIL != subl_promotions.positive_integer_p(repropagateP)) ? repropagateP : ONE_INTEGER, n = NIL, n = ZERO_INTEGER; n.numL(times); n = add(n, ONE_INTEGER)) {
                repropagate_simple_db(sks);
            }
        }
        final SubLObject simple_assertions_queue = queues.create_queue(UNPROVIDED);
        SubLObject simple_assertions_checked_count = ZERO_INTEGER;
        SubLObject complex_assertions_asserted_count = ZERO_INTEGER;
        SubLObject simple_assertions_removed_count = ZERO_INTEGER;
        SubLObject processed_simple_assertions = NIL;
        SubLObject complex_assertions_to_assert = NIL;
        queues.enqueue_all(simple_sksi_assertions_for_sks(sks), simple_assertions_queue);
        final SubLObject str = cconcatenate($$$Processing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(queues.queue_size(simple_assertions_queue)), $str105$__seed__simple_sksi_assertions_fo, format_nil.format_nil_a_no_copy(sks) });
        SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
            while (NIL != queues.queue_not_empty_p(simple_assertions_queue)) {
                final SubLObject simple_assertion = queues.dequeue(simple_assertions_queue);
                simple_assertions_checked_count = add(simple_assertions_checked_count, ONE_INTEGER);
                processed_simple_assertions = cons(simple_assertion, processed_simple_assertions);
                final SubLObject set_contents_var = assertions_high.assertion_dependents(simple_assertion);
                SubLObject basis_object;
                SubLObject state;
                SubLObject deduction;
                SubLObject dependent_assertion;
                SubLObject item_var;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    deduction = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                        dependent_assertion = deductions_high.deduction_supported_object(deduction);
                        if (NIL != assertion_handles.assertion_p(dependent_assertion)) {
                            if (NIL == subl_promotions.memberP(dependent_assertion, processed_simple_assertions, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != simple_sksi_assertionP(dependent_assertion)) {
                                    queues.enqueue(dependent_assertion, simple_assertions_queue);
                                } else
                                    if (NIL == assertions_high.asserted_assertionP(dependent_assertion)) {
                                        item_var = dependent_assertion;
                                        if (NIL == member(item_var, complex_assertions_to_assert, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            complex_assertions_to_assert = cons(item_var, complex_assertions_to_assert);
                                        }
                                    }

                            }
                        }
                    }
                }
            } 
            format(T, $str106$___A_simple_sksi_assertions_check, simple_assertions_checked_count);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        if (NIL != getf(v_properties, $VERBOSE_, UNPROVIDED)) {
            SubLObject cdolist_list_var = complex_assertions_to_assert;
            SubLObject a = NIL;
            a = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str108$___S_in__S__, uncanonicalizer.assertion_el_formula(a), assertions_high.assertion_mt(a));
                cdolist_list_var = cdolist_list_var.rest();
                a = cdolist_list_var.first();
            } 
            cdolist_list_var = processed_simple_assertions;
            a = NIL;
            a = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str109$___S_in__S__, uncanonicalizer.assertion_el_formula(a), assertions_high.assertion_mt(a));
                cdolist_list_var = cdolist_list_var.rest();
                a = cdolist_list_var.first();
            } 
        }
        if (NIL != getf(v_properties, $kw110$READ_ONLY_, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject list_var = complex_assertions_to_assert;
        _prev_bind_0 = $progress_note$.currentBinding(thread);
        _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        _prev_bind_3 = $progress_total$.currentBinding(thread);
        _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Adding_asserted_arguments_to_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(complex_assertions_to_assert)), $$$_complex_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) }) ? cconcatenate($$$Adding_asserted_arguments_to_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(complex_assertions_to_assert)), $$$_complex_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) }) : $$$cdolist, thread);
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
                SubLObject a2 = NIL;
                a2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    ke.ke_assert_now(uncanonicalizer.assertion_el_formula(a2), assertions_high.assertion_mt(a2), assertions_high.assertion_strength(a2), assertions_high.assertion_direction(a2));
                    if (NIL != assertions_high.asserted_assertionP(a2)) {
                        complex_assertions_asserted_count = add(complex_assertions_asserted_count, ONE_INTEGER);
                    } else {
                        Errors.warn($str113$Assert_failed_for__A, a2);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    a2 = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
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
        SubLObject simple_assertions_to_kill = NIL;
        SubLObject cdolist_list_var2 = processed_simple_assertions;
        SubLObject a3 = NIL;
        a3 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != assertions_high.assertion_dependents(a3)) {
                simple_assertions_to_kill = cons(a3, simple_assertions_to_kill);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            a3 = cdolist_list_var2.first();
        } 
        final SubLObject list_var2 = simple_assertions_to_kill;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Killing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(processed_simple_assertions)), $$$_simple_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) }) ? cconcatenate($$$Killing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(processed_simple_assertions)), $$$_simple_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) }) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var2), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject a4 = NIL;
                a4 = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    if (NIL != assertion_handles.valid_assertionP(a4, UNPROVIDED)) {
                        if ((NIL != assertion_utilities.gaf_assertion_with_pred_p(a4, $$isa)) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(a4), $$SimpleDatabase))) {
                            ke.ke_assert_now(make_binary_formula($$isa, assertions_high.gaf_arg1(a4), $$Database_Physical), assertions_high.assertion_mt(a4), UNPROVIDED, UNPROVIDED);
                            ke.ke_assert_now(make_binary_formula($$isa, assertions_high.gaf_arg1(a4), $const118$StructuredKnowledgeSource_TopLeve), assertions_high.assertion_mt(a4), UNPROVIDED, UNPROVIDED);
                            complex_assertions_asserted_count = add(complex_assertions_asserted_count, TWO_INTEGER);
                        }
                        simple_assertions_removed_count = add(simple_assertions_removed_count, ONE_INTEGER);
                        ke.ke_unassert_assertion_now(a4);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    a4 = csome_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        return values(complex_assertions_asserted_count, simple_assertions_removed_count);
    }

    public static SubLObject declare_simple_db_file() {
        declareFunction("simple_sksi_dbP", "SIMPLE-SKSI-DB?", 1, 0, false);
        declareFunction("clear_simple_sksi_terms", "CLEAR-SIMPLE-SKSI-TERMS", 0, 0, false);
        declareFunction("remove_simple_sksi_terms", "REMOVE-SIMPLE-SKSI-TERMS", 0, 0, false);
        declareFunction("simple_sksi_terms_internal", "SIMPLE-SKSI-TERMS-INTERNAL", 0, 0, false);
        declareFunction("simple_sksi_terms", "SIMPLE-SKSI-TERMS", 0, 0, false);
        declareFunction("simple_sksi_termP", "SIMPLE-SKSI-TERM?", 1, 0, false);
        declareFunction("simple_sksi_assertions_for_term", "SIMPLE-SKSI-ASSERTIONS-FOR-TERM", 1, 0, false);
        declareFunction("clear_simple_sksi_assertions_for_sks", "CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 0, 0, false);
        declareFunction("remove_simple_sksi_assertions_for_sks", "REMOVE-SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 1, 0, false);
        declareFunction("simple_sksi_assertions_for_sks_internal", "SIMPLE-SKSI-ASSERTIONS-FOR-SKS-INTERNAL", 1, 0, false);
        declareFunction("simple_sksi_assertions_for_sks", "SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 1, 0, false);
        declareFunction("simple_sksi_assertionP", "SIMPLE-SKSI-ASSERTION?", 1, 0, false);
        declareFunction("repropagate_knowledge_source", "REPROPAGATE-KNOWLEDGE-SOURCE", 1, 1, false);
        declareFunction("repropagate_simple_db", "REPROPAGATE-SIMPLE-DB", 1, 0, false);
        declareFunction("ensure_simple_db_valid", "ENSURE-SIMPLE-DB-VALID", 1, 2, false);
        declareFunction("validate_simple_db", "VALIDATE-SIMPLE-DB", 1, 2, false);
        declareFunction("validate_simple_table", "VALIDATE-SIMPLE-TABLE", 3, 0, false);
        declareFunction("ensure_all_fields_are_listed", "ENSURE-ALL-FIELDS-ARE-LISTED", 2, 0, false);
        declareFunction("ensure_temporal_or_atemporal_table", "ENSURE-TEMPORAL-OR-ATEMPORAL-TABLE", 2, 0, false);
        declareFunction("validate_simple_physical_schema", "VALIDATE-SIMPLE-PHYSICAL-SCHEMA", 3, 0, false);
        declareFunction("validate_simple_logical_schema", "VALIDATE-SIMPLE-LOGICAL-SCHEMA", 3, 0, false);
        declareFunction("validate_simple_logical_field_indexical", "VALIDATE-SIMPLE-LOGICAL-FIELD-INDEXICAL", 3, 0, false);
        declareFunction("ensure_field_decoding_has_code_mappings", "ENSURE-FIELD-DECODING-HAS-CODE-MAPPINGS", 1, 0, false);
        declareFunction("cmls_fn_nart_p", "CMLS-FN-NART-P", 1, 0, false);
        declareFunction("note_simple_db_validation_problem", "NOTE-SIMPLE-DB-VALIDATION-PROBLEM", 1, 0, false);
        declareFunction("ensure_preds_have_deduced_values", "ENSURE-PREDS-HAVE-DEDUCED-VALUES", 3, 1, false);
        declareFunction("ensure_preds_have_values", "ENSURE-PREDS-HAVE-VALUES", 5, 0, false);
        declareFunction("ensure_pred_has_value", "ENSURE-PRED-HAS-VALUE", 5, 0, false);
        declareFunction("convert_simple_sksi_db_to_complex", "CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_simple_db_file() {
        deflexical("*SIMPLE-SKSI-TERMS-CACHING-STATE*", NIL);
        deflexical("*SIMPLE-SKSI-ASSERTIONS-FOR-SKS-CACHING-STATE*", NIL);
        defparameter("*SKSI-TRANSCRIPT-SOURCE-REPROPAGATION?*", T);
        deflexical("*SIMPLIFIED-SKSI-PREDICATES*", $list18);
        defparameter("*SIMPLE-DB-VALIDATION-PROBLEMS*", $UNINITIALIZED);
        defparameter("*CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX-OVERRIDE-PROPERTIES*", NIL);
        return NIL;
    }

    public static SubLObject setup_simple_db_file() {
        memoization_state.note_globally_cached_function(SIMPLE_SKSI_TERMS);
        memoization_state.note_globally_cached_function(SIMPLE_SKSI_ASSERTIONS_FOR_SKS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_simple_db_file();
    }

    @Override
    public void initializeVariables() {
        init_simple_db_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_simple_db_file();
    }

    static {






























































































































    }
}

/**
 * Total time: 2712 ms
 */
