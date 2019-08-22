/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_any_of_operators_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager.sksi_registered_knowledge_sources;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities;
import com.cyc.cycjava.cycl.sksi.corba.corba_utilities;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-INFRASTRUCTURE-UTILITIES
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp
 * created:     2019/07/03 17:37:53
 */
public final class sksi_infrastructure_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt47$ = makeString("");

    public static final SubLFile me = new sksi_infrastructure_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities";


    // deflexical
    // Definitions
    // A representative sample of the KB constants that SKSI depends on.
    /**
     * A representative sample of the KB constants that SKSI depends on.
     */
    @LispMethod(comment = "A representative sample of the KB constants that SKSI depends on.\ndeflexical")
    private static final SubLSymbol $sksi_core_constants$ = makeSymbol("*SKSI-CORE-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sort_knowledge_sources_by_dateP$ = makeSymbol("*SORT-KNOWLEDGE-SOURCES-BY-DATE?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("ContentMtFn"), reader_make_constant_shell("ContentMtHeadFn"), reader_make_constant_shell("ContentMtSpindleFn"), reader_make_constant_shell("MappingMtFn"), reader_make_constant_shell("PhysicalFieldFn"), reader_make_constant_shell("ThePhysicalFieldValueFn"), reader_make_constant_shell("PFIAliasFn"), reader_make_constant_shell("PFAliasFn"), reader_make_constant_shell("LogicalFieldFn"), reader_make_constant_shell("TheLogicalFieldValueFn"), reader_make_constant_shell("LFIAliasFn"), reader_make_constant_shell("SchemaObjectFn"), reader_make_constant_shell("SchemaObjectIDFn"), reader_make_constant_shell("SourceSchemaObjectFn"), reader_make_constant_shell("SourceSchemaObjectIDFn"), reader_make_constant_shell("SchemaIndexFn"), reader_make_constant_shell("TheNextSequenceValueFn"), reader_make_constant_shell("IntegerSequenceGeneratorFn"), reader_make_constant_shell("TheCurrentSequenceValueFn"), reader_make_constant_shell("mappingMt"), reader_make_constant_shell("sksSourceDescriptionMt"), reader_make_constant_shell("sksPhysicalSchemaDescriptionMt"), reader_make_constant_shell("sksLogicalSchemaDescriptionMt"), reader_make_constant_shell("sksSchemaTranslationMt"), reader_make_constant_shell("contentMt"), reader_make_constant_shell("contentMtSpindle"), reader_make_constant_shell("contentMtHead"), reader_make_constant_shell("subKS"), reader_make_constant_shell("subKS-Direct"), reader_make_constant_shell("schemaSourceMap"), reader_make_constant_shell("physicalSchemaSourceMap"), reader_make_constant_shell("logicalSchemaSourceMap"), reader_make_constant_shell("sksIsa"), reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("portNumberForSKS"), reader_make_constant_shell("sksProxyHost"), reader_make_constant_shell("sksProxyPort"), reader_make_constant_shell("userNameForSKS"), reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("filenameForSKS"), reader_make_constant_shell("serializationTypeForSKS"), reader_make_constant_shell("keyTestFunctionForSKS"), reader_make_constant_shell("valueTestFunctionForSKS"), reader_make_constant_shell("physicalFields"), reader_make_constant_shell("physicalFieldIndexicals"), reader_make_constant_shell("enumerableSchema"), reader_make_constant_shell("schemaFieldNameList"), reader_make_constant_shell("schemaFieldList"), reader_make_constant_shell("exampleTuple"), reader_make_constant_shell("indexicalForPhysicalField"), reader_make_constant_shell("requiredFields"), reader_make_constant_shell("indexedFields"), reader_make_constant_shell("primaryKey"), reader_make_constant_shell("schemaKeys"), reader_make_constant_shell("secondaryKeys"), reader_make_constant_shell("foreignKeyMap"), reader_make_constant_shell("foreignKeyMap-Restrict"), reader_make_constant_shell("foreignKeyMap-Cascade"), reader_make_constant_shell("foreignKeyMap-SetNull"), reader_make_constant_shell("foreignKeyMap-SetDefault"), reader_make_constant_shell("nonNullFields"), reader_make_constant_shell("uniqueFieldList"), reader_make_constant_shell("schemaConstraints"), reader_make_constant_shell("defaultFieldValue"), reader_make_constant_shell("nonNullFieldList"), reader_make_constant_shell("resultSetCardinality"), reader_make_constant_shell("resultSetCardinalityWithConstraints"), reader_make_constant_shell("logicalResultSetCardinality"), reader_make_constant_shell("logicalResultSetCardinalityWRTValue"), reader_make_constant_shell("physicalFieldConversionFunction"), reader_make_constant_shell("schemaFieldsIndex"), reader_make_constant_shell("indexType"), reader_make_constant_shell("indexName"), reader_make_constant_shell("physicalFieldXPath"), reader_make_constant_shell("physicalFieldXPathString"), reader_make_constant_shell("fieldValue"), reader_make_constant_shell("fieldValueComparison"), reader_make_constant_shell("fieldValueComparison-Inverse"), reader_make_constant_shell("fieldIndexicalsEqual"), reader_make_constant_shell("fieldIndexicalsComparison"), reader_make_constant_shell("integerSequenceGeneratorName"), reader_make_constant_shell("integerSequenceGeneratorIncrementsField"), reader_make_constant_shell("logicalFields"), reader_make_constant_shell("meaningSentenceOfSchema"), reader_make_constant_shell("conditionalMeaningSentenceOfSchema"), reader_make_constant_shell("objectField"), reader_make_constant_shell("fieldIsa"), reader_make_constant_shell("fieldGenls"), reader_make_constant_shell("schemaIsa"), reader_make_constant_shell("schemaGenls"), reader_make_constant_shell("logicalSchemaKeys"), reader_make_constant_shell("indexicalForLogicalField"), reader_make_constant_shell("logicalFieldIndexicals"), reader_make_constant_shell("logicalSchemaFieldTypeList"), reader_make_constant_shell("schemaExampleSentence"), reader_make_constant_shell("schemaCompleteExtentKnown"), reader_make_constant_shell("completeObjectSchema"), reader_make_constant_shell("contentSentenceOfSchema"), reader_make_constant_shell("codeMapping"), reader_make_constant_shell("schemaFields"), reader_make_constant_shell("indexicalForField"), reader_make_constant_shell("schemaFieldIndexicals"), reader_make_constant_shell("schemaObjectID"), reader_make_constant_shell("fieldName-SKS"), reader_make_constant_shell("fieldTranslation"), reader_make_constant_shell("logicalFieldTranslation"), reader_make_constant_shell("physicalFieldTranslation"), reader_make_constant_shell("logicalFieldDecoding"), reader_make_constant_shell("logicalFieldEncoding"), reader_make_constant_shell("physicalFieldDecoding"), reader_make_constant_shell("physicalFieldEncoding"), reader_make_constant_shell("fieldDecoding"), reader_make_constant_shell("fieldEncoding"), reader_make_constant_shell("logicalPhysicalSchemaMap"), reader_make_constant_shell("calendarMonthIndex"), reader_make_constant_shell("logicalPhysicalFieldMap-DecodeClosed"), reader_make_constant_shell("logicalPhysicalFieldMap-EncodeClosed"), reader_make_constant_shell("fieldEncodingOverrideForComparisonOperatorArg"), reader_make_constant_shell("logicalPhysicalFieldMap"), reader_make_constant_shell("httpdRequestSubLParsingProgramForSKS"), reader_make_constant_shell("httpdRequestURLForSKS"), reader_make_constant_shell("httpdRequestMethodForSKS"), reader_make_constant_shell("httpdRequestSubLBooleanParsingProgramForSKS"), reader_make_constant_shell("httpdRequestUnboundOnlySubLParsingProgramForSKS"), reader_make_constant_shell("httpdRequestQueryTemplateForSKS"), reader_make_constant_shell("rowInSourceClaims"), reader_make_constant_shell("sourceClaims"), reader_make_constant_shell("meaningSentencePredicateForSource"), reader_make_constant_shell("meaningSentencePredicateForSchema"), reader_make_constant_shell("sksRepresentationComplete"), reader_make_constant_shell("rowCount-SKS"), reader_make_constant_shell("sourceAssumptions"), reader_make_constant_shell("sksModifiable"), reader_make_constant_shell("objectFieldTypeForSource"), reader_make_constant_shell("logicalFieldTypeForSource"), reader_make_constant_shell("sourceSchemaObjectID"), reader_make_constant_shell("schemaRepresentationComplete"), reader_make_constant_shell("sksModuleTypeDirection"), reader_make_constant_shell("SKSIPhysicalSchemaConstraintPredicate"), reader_make_constant_shell("PhysicalFieldIndexical"), reader_make_constant_shell("SKSIPhysicalSchemaDescriptionMicrotheory"), reader_make_constant_shell("PhysicalField"), reader_make_constant_shell("IndexDataStructure"), reader_make_constant_shell("IndexDataStructureType"), reader_make_constant_shell("IntegerSequenceGenerator"), reader_make_constant_shell("LogicalSchema"), reader_make_constant_shell("LogicalFieldIndexical"), reader_make_constant_shell("SKSILogicalSchemaDescriptionMicrotheory"), reader_make_constant_shell("LogicalField"), reader_make_constant_shell("ObjectDefiningSchema"), reader_make_constant_shell("ReifiedMapping"), reader_make_constant_shell("Schema-LogicalOrPhysical"), reader_make_constant_shell("SchemaType-LogicalOrPhysical"), reader_make_constant_shell("FieldIndexical-LogicalOrPhysical"), reader_make_constant_shell("SKSISchemaDescriptionMicrotheory"), reader_make_constant_shell("Field-LogicalOrPhysical"), reader_make_constant_shell("FieldType-LogicalOrPhysical"), reader_make_constant_shell("SKSISchemaTranslationMicrotheory"), reader_make_constant_shell("HTTP-RequestMethod"), reader_make_constant_shell("StructuredKnowledgeSource"), reader_make_constant_shell("StructuredKnowledgeSource-Atomic"), reader_make_constant_shell("StructuredKnowledgeSource-Complex"), reader_make_constant_shell("SKSIContentMicrotheorySpindle"), reader_make_constant_shell("SKSISupportedStructuredKnowledgeSourceType"), reader_make_constant_shell("SKSISourceDescriptionMicrotheory"), reader_make_constant_shell("SKSIMappingMicrotheory"), reader_make_constant_shell("SKSISupportedDatabaseServerProgram"), reader_make_constant_shell("SKSMereologyType"), reader_make_constant_shell("StructuredKnowledgeSource-TopLevel"), reader_make_constant_shell("SKSIContentMicrotheory"), reader_make_constant_shell("SKSIExternalTermDenotingFunction"), reader_make_constant_shell("SKSIHLModule"), reader_make_constant_shell("SKSIHLModuleType"), reader_make_constant_shell("SKSIRemovalModule"), reader_make_constant_shell("SKSISingleLiteralRemovalModule"), reader_make_constant_shell("SKSIMultiLiteralRemovalModule"), reader_make_constant_shell("SKSIStorageModule"), reader_make_constant_shell("SKSISupportedComparisonPredicate"), reader_make_constant_shell("SKSISupportedOperator"), reader_make_constant_shell("SKSISupportedFunction") });

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$ = makeSymbol("*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*");







    private static final SubLSymbol SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED = makeSymbol("SKSI-RECONSTRUCT-EXPRESSION-MEMOIZED");

    private static final SubLSymbol ALL_RELEVANT_SKSI_CONTENT_MTS_INT = makeSymbol("ALL-RELEVANT-SKSI-CONTENT-MTS-INT");

    static private final SubLSymbol $sym11$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    private static final SubLSymbol $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT = makeSymbol("ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?-INT");

    private static final SubLSymbol $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT = makeSymbol("ANY-SKSI-CONTENT-MT-RELEVANT?-INT");

    private static final SubLSymbol CONTENT_MT_SPINDLE_MEMBER_P = makeSymbol("CONTENT-MT-SPINDLE-MEMBER-P");

    private static final SubLObject $$StructuredKnowledgeSource_Atomic = reader_make_constant_shell("StructuredKnowledgeSource-Atomic");

    private static final SubLObject $$StructuredKnowledgeSource_Complex = reader_make_constant_shell("StructuredKnowledgeSource-Complex");

    private static final SubLSymbol TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P = makeSymbol("TOP-LEVEL-KNOWLEDGE-SOURCE-IN-ANY-MT-P");

    private static final SubLSymbol SKS_REGISTERED_P = makeSymbol("SKS-REGISTERED-P");

    private static final SubLSymbol $sym19$_ = makeSymbol(">");

    private static final SubLSymbol CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE = makeSymbol("CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE");



    private static final SubLString $str22$An_external_knowledge_source_with = makeString("An external knowledge source without any description.");



    private static final SubLObject $$Database_Physical = reader_make_constant_shell("Database-Physical");

    private static final SubLSymbol $sym26$SK_SOURCE_SUB_KS_IN_ANY_MT_ = makeSymbol("SK-SOURCE-SUB-KS-IN-ANY-MT?");

    private static final SubLSymbol PHYSICAL_FIELD_INDEXICAL_P = makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");

    private static final SubLSymbol PHYSICAL_FIELD_P = makeSymbol("PHYSICAL-FIELD-P");

    private static final SubLSymbol PHYSICAL_FIELD_NAME = makeSymbol("PHYSICAL-FIELD-NAME");

    private static final SubLSymbol $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE = makeSymbol("SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL");





    private static final SubLSymbol $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY = makeSymbol("PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA");

    private static final SubLSymbol SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS = makeSymbol("SKSI-DETERMINE-FIXED-PHYSICAL-FIELD-INDEXICALS");

    private static final SubLSymbol $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_ = makeSymbol("SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS = makeSymbol("LOGICAL-FIELD-INDEXICAL-DENOTING-FUNCTIONS");

    private static final SubLSymbol $sym37$_FN = makeSymbol("?FN");

    private static final SubLList $list38 = list(reader_make_constant_shell("resultQuotedIsa"), makeSymbol("?FN"), reader_make_constant_shell("LogicalFieldIndexical"));



    private static final SubLSymbol LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA = makeSymbol("LOGICAL-PHYSICAL-FIELD-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA");

    private static final SubLSymbol LOGICAL_FIELD_P = makeSymbol("LOGICAL-FIELD-P");

    private static final SubLSymbol EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED = makeSymbol("EXPRESSION-LOGICAL-FIELD-INDEXICALS-MEMOIZED");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");

    private static final SubLSymbol LOGICAL_FIELD_FOR_INDEXICAL = makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL");

    private static final SubLSymbol SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE = makeSymbol("SKSI-GET-CODE-MAPPING-RELATIONS-FOR-LOGICAL-FIELD-PREDICATE");

    private static final SubLSymbol $sym46$PREDICATE_ = makeSymbol("PREDICATE?");

    private static final SubLObject $$WebPage_AIS = reader_make_constant_shell("WebPage-AIS");

    private static final SubLObject $$FileHashTable_File = reader_make_constant_shell("FileHashTable-File");

    private static final SubLObject $const49$CommonObjectRequestBrokerArchitec = reader_make_constant_shell("CommonObjectRequestBrokerArchitecture");

    private static final SubLString $$$continue = makeString("continue");

    private static final SubLString $str52$Unknown_access_path_type__A_for__ = makeString("Unknown access path type ~A for ~A.");

    private static final SubLString $str54$The_following_error_occurred_whil = makeString("The following error occurred while trying to open/close the knowledge source ~A: ~%~A");

    private static final SubLString $str55$ = makeString("");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol $kw65$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw66$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLString $str70$The_following_problem_was_encount = makeString("The following problem was encountered while trying to access the knowledge source ~A :~%~A");

    private static final SubLString $str71$_A = makeString("~A");

    private static final SubLSymbol $external_sources_activated_in_image$ = makeSymbol("*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*");

    private static final SubLSymbol DISJOINT_SCHEMAS_MEMOIZED_INT = makeSymbol("DISJOINT-SCHEMAS-MEMOIZED-INT");

    private static final SubLSymbol ALL_DISJOINT_SCHEMAS_INT = makeSymbol("ALL-DISJOINT-SCHEMAS-INT");





    private static final SubLString $str83$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str88$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str89$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str90$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list91 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str92$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT = makeSymbol("ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS-INT");

    private static final SubLSymbol SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED = makeSymbol("SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS-MEMOIZED");

    private static final SubLSymbol SCHEMA_OBJECT_ID_FN_EXPRESSION_P = makeSymbol("SCHEMA-OBJECT-ID-FN-EXPRESSION-P");

    private static final SubLSymbol SOURCE_SCHEMA_OBJECT_ID_FN_EXPRESSION_P = makeSymbol("SOURCE-SCHEMA-OBJECT-ID-FN-EXPRESSION-P");





    private static final SubLList $list99 = list(makeSymbol("SKS"), makeSymbol("ODS"), makeSymbol("SUB-EXPRESSION"));



    private static final SubLList $list102 = list(makeSymbol("SKS1"), makeSymbol("ODS1"), makeSymbol("SUB-EXPRESSION1"));

    static private final SubLList $list103 = list(makeSymbol("SKS2"), makeSymbol("ODS2"), makeSymbol("SUB-EXPRESSION2"));





    private static final SubLSymbol SK_SOURCE_SUB_KS_CLOSURE = makeSymbol("SK-SOURCE-SUB-KS-CLOSURE");



    private static final SubLObject $$subKS_Direct = reader_make_constant_shell("subKS-Direct");



    private static final SubLList $list114 = list(list(makeKeyword("AND"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL"))), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL-CONJUNCTIVE")))));

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol FIND_ASSERTION_CYCL_MEMOIZED = makeSymbol("FIND-ASSERTION-CYCL-MEMOIZED");

    private static final SubLSymbol $sym118$GENL_PREDICATE_MEMOIZED_ = makeSymbol("GENL-PREDICATE-MEMOIZED?");

    private static final SubLSymbol $sym119$GENL_INVERSE_MEMOIZED_ = makeSymbol("GENL-INVERSE-MEMOIZED?");

    private static final SubLSymbol ALL_FORT_INSTANCES_MEMOIZED = makeSymbol("ALL-FORT-INSTANCES-MEMOIZED");

    private static final SubLSymbol $sym121$MT_RELEVANT_TO_MT_MEMOIZED_ = makeSymbol("MT-RELEVANT-TO-MT-MEMOIZED?");

    private static final SubLSymbol FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED = makeSymbol("FORMULA-COMMUTATIVE-PERMUTATIONS-MEMOIZED");

    private static final SubLSymbol REMOVAL_ASK_TEMPLATE_MEMOIZED = makeSymbol("REMOVAL-ASK-TEMPLATE-MEMOIZED");

    private static final SubLSymbol REMOVAL_ASK_MEMOIZED = makeSymbol("REMOVAL-ASK-MEMOIZED");

    private static final SubLSymbol REMOVAL_ASK_HL_VARIABLE_MEMOIZED = makeSymbol("REMOVAL-ASK-HL-VARIABLE-MEMOIZED");

    private static final SubLSymbol $sym126$ISA_UNIT_OF_MEASURE_ = makeSymbol("ISA-UNIT-OF-MEASURE?");



    /**
     * Determines whether the portion of the KB necessary for SKSI is loaded.
     * This is the KB analogue of the #+Cyc-SKSI feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for SKSI is loaded.\r\nThis is the KB analogue of the #+Cyc-SKSI feature.\nDetermines whether the portion of the KB necessary for SKSI is loaded.\nThis is the KB analogue of the #+Cyc-SKSI feature.")
    public static final SubLObject initialize_sksi_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $sksi_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_sksi_kb_loaded();
        } else {
            kb_control_vars.unset_sksi_kb_loaded();
        }
        return kb_control_vars.sksi_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for SKSI is loaded.
     * This is the KB analogue of the #+Cyc-SKSI feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for SKSI is loaded.\r\nThis is the KB analogue of the #+Cyc-SKSI feature.\nDetermines whether the portion of the KB necessary for SKSI is loaded.\nThis is the KB analogue of the #+Cyc-SKSI feature.")
    public static SubLObject initialize_sksi_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $sksi_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_sksi_kb_loaded();
        } else {
            kb_control_vars.unset_sksi_kb_loaded();
        }
        return kb_control_vars.sksi_kb_loaded_p();
    }

    public static final SubLObject initialize_sksi_data_structures_alt() {
        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.initialize_non_thelogicalfieldvaluefn_lfi_fort_cache();
        return NIL;
    }

    public static SubLObject initialize_sksi_data_structures() {
        initialize_non_thelogicalfieldvaluefn_lfi_fort_cache();
        return NIL;
    }

    public static final SubLObject initialize_non_thelogicalfieldvaluefn_lfi_fort_cache_alt() {
        {
            SubLObject all_lfi_gafs = kb_mapping_utilities.pred_value_gafs($$LogicalFieldIndexical, $$quotedIsa, TWO_INTEGER, $TRUE);
            SubLObject cdolist_list_var = all_lfi_gafs;
            SubLObject lfi_gaf = NIL;
            for (lfi_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi_gaf = cdolist_list_var.first()) {
                {
                    SubLObject lfi = assertions_high.gaf_arg1(lfi_gaf);
                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(lfi, assertions_high.assertion_mt(lfi_gaf));
                }
            }
            return $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue();
        }
    }

    public static SubLObject initialize_non_thelogicalfieldvaluefn_lfi_fort_cache() {
        SubLObject cdolist_list_var;
        final SubLObject all_lfi_gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs($$LogicalFieldIndexical, $$quotedIsa, TWO_INTEGER, $TRUE);
        SubLObject lfi_gaf = NIL;
        lfi_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lfi = assertions_high.gaf_arg1(lfi_gaf);
            possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(lfi, assertions_high.assertion_mt(lfi_gaf));
            cdolist_list_var = cdolist_list_var.rest();
            lfi_gaf = cdolist_list_var.first();
        } 
        return $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue();
    }

    public static final SubLObject possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache_alt(SubLObject v_object, SubLObject mt) {
        if ((NIL != forts.fort_p(v_object)) && (NIL == narts_high.nart_with_functor_p($$TheLogicalFieldValueFn, v_object))) {
            return dictionary_utilities.dictionary_pushnew($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(final SubLObject v_object, final SubLObject mt) {
        if ((NIL != forts.fort_p(v_object)) && (NIL == narts_high.nart_with_functor_p($$TheLogicalFieldValueFn, v_object))) {
            return dictionary_utilities.dictionary_pushnew($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache_alt(SubLObject v_object, SubLObject mt) {
        if ((NIL != forts.fort_p(v_object)) && (NIL == narts_high.nart_with_functor_p($$TheLogicalFieldValueFn, v_object))) {
            return dictionary_utilities.dictionary_remove_from_value($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache(final SubLObject v_object, final SubLObject mt) {
        if ((NIL != forts.fort_p(v_object)) && (NIL == narts_high.nart_with_functor_p($$TheLogicalFieldValueFn, v_object))) {
            return dictionary_utilities.dictionary_remove_from_value($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Is object an LFI FORT that is not a #$TheLogicalFieldValueFn NART (in the current mt relevance context)?
     */
    @LispMethod(comment = "Is object an LFI FORT that is not a #$TheLogicalFieldValueFn NART (in the current mt relevance context)?")
    public static final SubLObject non_thelogicalfieldvaluefn_lfi_fort_p_alt(SubLObject v_object) {
        return mt_relevance_macros.any_relevant_mtP(dictionary.dictionary_lookup_without_values($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, UNPROVIDED));
    }

    /**
     * Is object an LFI FORT that is not a #$TheLogicalFieldValueFn NART (in the current mt relevance context)?
     */
    @LispMethod(comment = "Is object an LFI FORT that is not a #$TheLogicalFieldValueFn NART (in the current mt relevance context)?")
    public static SubLObject non_thelogicalfieldvaluefn_lfi_fort_p(final SubLObject v_object) {
        return mt_relevance_macros.any_relevant_mtP(dictionary.dictionary_lookup_without_values($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, UNPROVIDED));
    }

    /**
     * This converts EXPRESSION to EL, and then replaces every sub-expression that
     * satisfies TEST with its NART form (if available).
     */
    @LispMethod(comment = "This converts EXPRESSION to EL, and then replaces every sub-expression that\r\nsatisfies TEST with its NART form (if available).\nThis converts EXPRESSION to EL, and then replaces every sub-expression that\nsatisfies TEST with its NART form (if available).")
    public static final SubLObject sksi_reconstruct_expression_alt(SubLObject expression, SubLObject test, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_reconstruct_expression_memoized(expression, test))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_reconstruct_expression_int(expression, test);
    }

    /**
     * This converts EXPRESSION to EL, and then replaces every sub-expression that
     * satisfies TEST with its NART form (if available).
     */
    @LispMethod(comment = "This converts EXPRESSION to EL, and then replaces every sub-expression that\r\nsatisfies TEST with its NART form (if available).\nThis converts EXPRESSION to EL, and then replaces every sub-expression that\nsatisfies TEST with its NART form (if available).")
    public static SubLObject sksi_reconstruct_expression(final SubLObject expression, final SubLObject test, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return NIL != memoizeP ? sksi_reconstruct_expression_memoized(expression, test) : sksi_reconstruct_expression_int(expression, test);
    }

    public static final SubLObject sksi_reconstruct_expression_memoized_internal_alt(SubLObject expression, SubLObject test) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_reconstruct_expression_int(expression, test);
    }

    public static SubLObject sksi_reconstruct_expression_memoized_internal(final SubLObject expression, final SubLObject test) {
        return sksi_reconstruct_expression_int(expression, test);
    }

    public static final SubLObject sksi_reconstruct_expression_memoized_alt(SubLObject expression, SubLObject test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_reconstruct_expression_memoized_internal(expression, test);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(expression, test);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_reconstruct_expression_memoized_internal(expression, test)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, test));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_reconstruct_expression_memoized(final SubLObject expression, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_reconstruct_expression_memoized_internal(expression, test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(expression, test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_reconstruct_expression_memoized_internal(expression, test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, test));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_reconstruct_expression_int_alt(SubLObject expression, SubLObject test) {
        {
            SubLObject el_expression = cycl_utilities.hl_to_el(expression);
            return cycl_utilities.expression_transform(el_expression, test, FIND_NART, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sksi_reconstruct_expression_int(SubLObject expression, final SubLObject test) {
        if (NIL != nart_handles.nart_p(expression)) {
            return NIL != funcall(test, cycl_utilities.hl_to_el(expression)) ? expression : cycl_utilities.hl_to_el(expression);
        }
        final SubLObject narts = list_utilities.tree_find_all_if(NART_P, expression, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject narts_to_replace = cdolist_list_var = list_utilities.find_all_if_not(test, narts, HL_TO_EL);
        SubLObject nart_to_replace = NIL;
        nart_to_replace = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            expression = list_utilities.tree_substitute(expression, nart_to_replace, cycl_utilities.hl_to_el(nart_to_replace));
            cdolist_list_var = cdolist_list_var.rest();
            nart_to_replace = cdolist_list_var.first();
        } 
        return expression;
    }

    /**
     * Returns all SKSI content microtheories that are relevant
     * in the current mt relevance context that is set from
     * outside.
     */
    @LispMethod(comment = "Returns all SKSI content microtheories that are relevant\r\nin the current mt relevance context that is set from\r\noutside.\nReturns all SKSI content microtheories that are relevant\nin the current mt relevance context that is set from\noutside.")
    public static final SubLObject all_relevant_sksi_content_mts_alt() {
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return sksi_kb_accessors.sksi_content_mts();
        } else {
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_sksi_content_mts_int(mt_relevance_macros.mt_info(UNPROVIDED));
        }
    }

    /**
     * Returns all SKSI content microtheories that are relevant
     * in the current mt relevance context that is set from
     * outside.
     */
    @LispMethod(comment = "Returns all SKSI content microtheories that are relevant\r\nin the current mt relevance context that is set from\r\noutside.\nReturns all SKSI content microtheories that are relevant\nin the current mt relevance context that is set from\noutside.")
    public static SubLObject all_relevant_sksi_content_mts() {
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return sksi_kb_accessors.sksi_content_mts();
        }
        return all_relevant_sksi_content_mts_int(mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static final SubLObject all_relevant_sksi_content_mts_int_internal_alt(SubLObject mt_info) {
        return list_utilities.remove_if_not($sym11$RELEVANT_MT_, sksi_kb_accessors.sksi_content_mts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_relevant_sksi_content_mts_int_internal(final SubLObject mt_info) {
        return list_utilities.remove_if_not($sym11$RELEVANT_MT_, sksi_kb_accessors.sksi_content_mts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_relevant_sksi_content_mts_int_alt(SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_sksi_content_mts_int_internal(mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_RELEVANT_SKSI_CONTENT_MTS_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_RELEVANT_SKSI_CONTENT_MTS_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ALL_RELEVANT_SKSI_CONTENT_MTS_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, mt_info, $kw8$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_sksi_content_mts_int_internal(mt_info)));
                        memoization_state.caching_state_put(caching_state, mt_info, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject all_relevant_sksi_content_mts_int(final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_relevant_sksi_content_mts_int_internal(mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_RELEVANT_SKSI_CONTENT_MTS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_RELEVANT_SKSI_CONTENT_MTS_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_RELEVANT_SKSI_CONTENT_MTS_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt_info, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(all_relevant_sksi_content_mts_int_internal(mt_info)));
            memoization_state.caching_state_put(caching_state, mt_info, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject any_sksi_content_mt_with_registered_module_relevantP() {
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return T;
        }
        return any_sksi_content_mt_with_registered_module_relevantP_int(mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static SubLObject any_sksi_content_mt_with_registered_module_relevantP_int_internal(final SubLObject mt_info) {
        return mt_relevance_macros.any_relevant_mtP(sksi_sks_manager.sksi_content_mts_with_registered_module());
    }

    public static SubLObject any_sksi_content_mt_with_registered_module_relevantP_int(final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_sksi_content_mt_with_registered_module_relevantP_int_internal(mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt_info, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(any_sksi_content_mt_with_registered_module_relevantP_int_internal(mt_info)));
            memoization_state.caching_state_put(caching_state, mt_info, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Returns T iff any of the SKSI content microtheories is relevant.
     * Currently, only used in the general transitivity code
     * to gate the use of SKSI by mt.
     */
    @LispMethod(comment = "Returns T iff any of the SKSI content microtheories is relevant.\r\nCurrently, only used in the general transitivity code\r\nto gate the use of SKSI by mt.\nReturns T iff any of the SKSI content microtheories is relevant.\nCurrently, only used in the general transitivity code\nto gate the use of SKSI by mt.")
    public static final SubLObject any_sksi_content_mt_relevantP_alt() {
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return T;
        } else {
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.any_sksi_content_mt_relevantP_int(mt_relevance_macros.mt_info(UNPROVIDED));
        }
    }

    /**
     * Returns T iff any of the SKSI content microtheories is relevant.
     * Currently, only used in the general transitivity code
     * to gate the use of SKSI by mt.
     */
    @LispMethod(comment = "Returns T iff any of the SKSI content microtheories is relevant.\r\nCurrently, only used in the general transitivity code\r\nto gate the use of SKSI by mt.\nReturns T iff any of the SKSI content microtheories is relevant.\nCurrently, only used in the general transitivity code\nto gate the use of SKSI by mt.")
    public static SubLObject any_sksi_content_mt_relevantP() {
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return T;
        }
        return any_sksi_content_mt_relevantP_int(mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static final SubLObject any_sksi_content_mt_relevantP_int_internal_alt(SubLObject mt_info) {
        return mt_relevance_macros.any_relevant_mtP(sksi_kb_accessors.sksi_content_mts());
    }

    public static SubLObject any_sksi_content_mt_relevantP_int_internal(final SubLObject mt_info) {
        return mt_relevance_macros.any_relevant_mtP(sksi_kb_accessors.sksi_content_mts());
    }

    public static final SubLObject any_sksi_content_mt_relevantP_int_alt(SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.any_sksi_content_mt_relevantP_int_internal(mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$ANY_SKSI_CONTENT_MT_RELEVANT__INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$ANY_SKSI_CONTENT_MT_RELEVANT__INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym12$ANY_SKSI_CONTENT_MT_RELEVANT__INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, mt_info, $kw8$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.any_sksi_content_mt_relevantP_int_internal(mt_info)));
                        memoization_state.caching_state_put(caching_state, mt_info, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject any_sksi_content_mt_relevantP_int(final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_sksi_content_mt_relevantP_int_internal(mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt_info, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(any_sksi_content_mt_relevantP_int_internal(mt_info)));
            memoization_state.caching_state_put(caching_state, mt_info, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Returns all top-level SKSI content mts that are relevant in the given mt relevance context.
     */
    @LispMethod(comment = "Returns all top-level SKSI content mts that are relevant in the given mt relevance context.")
    public static final SubLObject relevant_top_level_sksi_content_mts_alt() {
        return remove_if(CONTENT_MT_SPINDLE_MEMBER_P, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_sksi_content_mts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all top-level SKSI content mts that are relevant in the given mt relevance context.
     */
    @LispMethod(comment = "Returns all top-level SKSI content mts that are relevant in the given mt relevance context.")
    public static SubLObject relevant_top_level_sksi_content_mts() {
        return remove_if(CONTENT_MT_SPINDLE_MEMBER_P, all_relevant_sksi_content_mts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sk_source_atomicP_alt(SubLObject sk_source) {
        return isa.isaP(sk_source, $$StructuredKnowledgeSource_Atomic, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sk_source_atomicP(final SubLObject sk_source) {
        return isa.isaP(sk_source, $$StructuredKnowledgeSource_Atomic, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sk_source_complexP_alt(SubLObject sk_source) {
        return isa.isaP(sk_source, $$StructuredKnowledgeSource_Complex, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sk_source_complexP(final SubLObject sk_source) {
        return isa.isaP(sk_source, $$StructuredKnowledgeSource_Complex, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gather_all_complete_knowledge_sources_alt() {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sort_knowledge_sources(sksi_kb_accessors.complete_knowledge_sources());
    }

    public static SubLObject gather_all_complete_knowledge_sources() {
        return sort_knowledge_sources(sksi_kb_accessors.complete_knowledge_sources());
    }

    public static final SubLObject gather_all_top_level_complete_knowledge_sources_alt() {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sort_knowledge_sources(list_utilities.remove_if_not(TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_kb_accessors.complete_knowledge_sources(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject gather_all_top_level_complete_knowledge_sources() {
        return sort_knowledge_sources(list_utilities.remove_if_not(TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_kb_accessors.complete_knowledge_sources(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject gather_all_top_level_complete_registered_knowledge_sources() {
        if (NIL == sksi_sks_manager.sksi_registered_knowledge_sources()) {
            return NIL;
        }
        return sort_knowledge_sources(list_utilities.remove_if_not(SKS_REGISTERED_P, list_utilities.remove_if_not(TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_kb_accessors.complete_knowledge_sources(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject gather_all_top_level_registered_knowledge_sources() {
        return sort_knowledge_sources(list_utilities.remove_if_not(TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_sks_manager.sksi_registered_knowledge_sources(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject sort_knowledge_sources_alt(SubLObject knowledge_sources) {
        return kb_utilities.sort_terms(knowledge_sources, T, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sort_knowledge_sources(final SubLObject knowledge_sources) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $sort_knowledge_sources_by_dateP$.getDynamicValue(thread) ? Sort.sort(knowledge_sources, $sym19$_, CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE) : kb_utilities.sort_terms(knowledge_sources, T, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all top-level SKSI knowledge sources currently available
     * for registration together with a brief description of the contents
     * of each knowledge source.
     */
    @LispMethod(comment = "Returns all top-level SKSI knowledge sources currently available\r\nfor registration together with a brief description of the contents\r\nof each knowledge source.\nReturns all top-level SKSI knowledge sources currently available\nfor registration together with a brief description of the contents\nof each knowledge source.")
    public static final SubLObject gather_sksi_knowledge_sources_and_descriptions_alt() {
        {
            SubLObject sks_list = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources();
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sks_list;
            SubLObject sks = NIL;
            for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                {
                    SubLObject sks_description = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.get_sks_description_string(sks);
                    result = cons(list(sks, sks_description), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * Returns all top-level SKSI knowledge sources currently available
     * for registration together with a brief description of the contents
     * of each knowledge source.
     */
    @LispMethod(comment = "Returns all top-level SKSI knowledge sources currently available\r\nfor registration together with a brief description of the contents\r\nof each knowledge source.\nReturns all top-level SKSI knowledge sources currently available\nfor registration together with a brief description of the contents\nof each knowledge source.")
    public static SubLObject gather_sksi_knowledge_sources_and_descriptions() {
        final SubLObject sks_list = gather_all_top_level_complete_knowledge_sources();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sks_description = get_sks_description_string(sks);
            result = cons(list(sks, sks_description), result);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject get_sks_description_string_alt(SubLObject sks) {
        {
            SubLObject desc = kb_mapping_utilities.fpred_value_in_any_mt(sks, $$comment, ONE_INTEGER, TWO_INTEGER, $TRUE);
            if (NIL == desc) {
                desc = $str_alt18$An_external_knowledge_source_with;
            }
            return desc;
        }
    }

    public static SubLObject get_sks_description_string(final SubLObject sks) {
        SubLObject desc = kb_mapping_utilities.fpred_value_in_any_mt(sks, $$comment, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL == desc) {
            desc = $str22$An_external_knowledge_source_with;
        }
        return desc;
    }

    public static final SubLObject top_level_knowledge_source_p_alt(SubLObject sks) {
        return sublisp_null(sksi_kb_accessors.immediate_genl_ks(sks));
    }

    public static SubLObject top_level_knowledge_source_p(final SubLObject sks) {
        return sublisp_null(sksi_kb_accessors.immediate_genl_ks(sks));
    }

    public static final SubLObject top_level_knowledge_source_in_any_mt_p_alt(SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.top_level_knowledge_source_p(sks);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject top_level_knowledge_source_in_any_mt_p(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = top_level_knowledge_source_p(sks);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns all relevant knowledge sources.
     */
    @LispMethod(comment = "Returns all relevant knowledge sources.")
    public static final SubLObject all_relevant_sk_sources_alt() {
        {
            SubLObject mts = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_sksi_content_mts();
            SubLObject sk_sources = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                {
                    SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
                    if (NIL != sks) {
                        sk_sources = cons(sks, sk_sources);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(sk_sources, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Returns all relevant knowledge sources.
     */
    @LispMethod(comment = "Returns all relevant knowledge sources.")
    public static SubLObject all_relevant_sk_sources() {
        final SubLObject mts = all_relevant_sksi_content_mts();
        SubLObject sk_sources = NIL;
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            if (NIL != sks) {
                sk_sources = cons(sks, sk_sources);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(sk_sources, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all relevant DBs.
     */
    @LispMethod(comment = "Returns all relevant DBs.")
    public static final SubLObject all_relevant_dbs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_sksi_content_mts();
                SubLObject dbs = NIL;
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    {
                        SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
                        if (NIL != sks) {
                            {
                                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        if (sksi_kb_accessors.sk_source_ks_type(sks) == $$Database_Physical) {
                                            dbs = cons(sks, dbs);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(dbs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Returns all relevant DBs.
     */
    @LispMethod(comment = "Returns all relevant DBs.")
    public static SubLObject all_relevant_dbs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mts = all_relevant_sksi_content_mts();
        SubLObject dbs = NIL;
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            if (NIL != sks) {
                final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (sksi_kb_accessors.sk_source_ks_type(sks).eql($$Database_Physical)) {
                        dbs = cons(sks, dbs);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(dbs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all SKSI DB-type knowledge sources that are registered and relevant in the given mt relevance context.
     */
    @LispMethod(comment = "Returns all SKSI DB-type knowledge sources that are registered and relevant in the given mt relevance context.")
    public static final SubLObject relevant_registered_top_level_sksi_dbs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mts = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.relevant_top_level_sksi_content_mts();
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    {
                        SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
                        SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (((sksi_kb_accessors.sk_source_ks_type(sks) == $$Database_Physical) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.top_level_knowledge_source_p(sks))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sk_source_registeredP(sks, UNPROVIDED))) {
                                    result = cons(sks, result);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Returns all SKSI DB-type knowledge sources that are registered and relevant in the given mt relevance context.
     */
    @LispMethod(comment = "Returns all SKSI DB-type knowledge sources that are registered and relevant in the given mt relevance context.")
    public static SubLObject relevant_registered_top_level_sksi_dbs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = relevant_top_level_sksi_content_mts();
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if ((sksi_kb_accessors.sk_source_ks_type(sks).eql($$Database_Physical) && (NIL != top_level_knowledge_source_p(sks))) && (NIL != sk_source_registeredP(sks, UNPROVIDED))) {
                    result = cons(sks, result);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject relevant_maximum_sksi_dbs_alt() {
        return list_utilities.delete_subsumed_items(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_relevant_dbs(), $sym22$SK_SOURCE_SUB_KS_IN_ANY_MT_, UNPROVIDED);
    }

    public static SubLObject relevant_maximum_sksi_dbs() {
        return list_utilities.delete_subsumed_items(all_relevant_dbs(), $sym26$SK_SOURCE_SUB_KS_IN_ANY_MT_, UNPROVIDED);
    }

    public static final SubLObject external_term_denoting_function_expression_p_alt(SubLObject expression) {
        if (NIL != obsolete.closed_nat_p(expression, UNPROVIDED)) {
            return fort_types_interface.sksi_external_term_denoting_function_p(cycl_utilities.nat_functor(expression));
        }
        return NIL;
    }

    public static SubLObject external_term_denoting_function_expression_p(final SubLObject expression) {
        if (NIL != obsolete.closed_nat_p(expression, UNPROVIDED)) {
            return fort_types_interface.sksi_external_term_denoting_function_p(cycl_utilities.nat_functor(expression));
        }
        return NIL;
    }

    public static final SubLObject sksi_external_term_p_alt(SubLObject v_term) {
        return makeBoolean((NIL != closedP(v_term, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.external_term_denoting_function_expression_p(v_term)));
    }

    public static SubLObject sksi_external_term_p(final SubLObject v_term) {
        return makeBoolean((NIL != closedP(v_term, UNPROVIDED)) && (NIL != external_term_denoting_function_expression_p(v_term)));
    }

    public static final SubLObject sksi_term_p_alt(SubLObject v_term) {
        return makeBoolean((NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(v_term)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_external_term_p(v_term)));
    }

    public static SubLObject sksi_term_p(final SubLObject v_term) {
        return makeBoolean((NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(v_term)) || (NIL != sksi_external_term_p(v_term)));
    }

    public static final SubLObject sksi_supported_predicate_type_p_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != (NIL != hlmt.hlmt_p(mt) ? ((SubLObject) (fort_types_interface.isa_predicateP(v_object, mt))) : fort_types_interface.predicate_in_any_mtP(v_object))));
    }

    public static SubLObject sksi_supported_predicate_type_p(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != (NIL != hlmt.hlmt_p(mt) ? fort_types_interface.isa_predicateP(v_object, mt) : fort_types_interface.predicate_in_any_mtP(v_object))));
    }

    public static final SubLObject physical_fields_for_indexicals_in_expression_alt(SubLObject expression) {
        {
            SubLObject indexicals = cycl_utilities.expression_gather(expression, PHYSICAL_FIELD_INDEXICAL_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return sksi_kb_accessors.indexicals_to_physical_fields(indexicals);
        }
    }

    public static SubLObject physical_fields_for_indexicals_in_expression(final SubLObject expression) {
        final SubLObject indexicals = cycl_utilities.expression_gather(expression, PHYSICAL_FIELD_INDEXICAL_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sksi_kb_accessors.indexicals_to_physical_fields(indexicals);
    }

    public static final SubLObject indexicals_for_physical_fields_in_expression_alt(SubLObject expression) {
        {
            SubLObject physical_fields = cycl_utilities.expression_gather(expression, PHYSICAL_FIELD_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return sksi_kb_accessors.physical_fields_to_indexicals(physical_fields);
        }
    }

    public static SubLObject indexicals_for_physical_fields_in_expression(final SubLObject expression) {
        final SubLObject physical_fields = cycl_utilities.expression_gather(expression, PHYSICAL_FIELD_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sksi_kb_accessors.physical_fields_to_indexicals(physical_fields);
    }

    public static final SubLObject extract_physical_fields_via_indexicals_alt(SubLObject expression, SubLObject all_physical_fields) {
        {
            SubLObject physical_fields_in_expression = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_fields_for_indexicals_in_expression(expression);
            return keyhash_utilities.fast_intersection(all_physical_fields, physical_fields_in_expression, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject extract_physical_fields_via_indexicals(final SubLObject expression, final SubLObject all_physical_fields) {
        final SubLObject physical_fields_in_expression = physical_fields_for_indexicals_in_expression(expression);
        return keyhash_utilities.fast_intersection(all_physical_fields, physical_fields_in_expression, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sort_physical_fields_by_field_name_list_alt(SubLObject physical_fields, SubLObject physical_schema) {
        {
            SubLObject field_name_list = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
            SubLObject sorted_physical_fields = list_utilities.sort_via_position(copy_list(physical_fields), field_name_list, symbol_function(EQUAL), PHYSICAL_FIELD_NAME);
            return sorted_physical_fields;
        }
    }

    public static SubLObject sort_physical_fields_by_field_name_list(final SubLObject physical_fields, final SubLObject physical_schema) {
        final SubLObject field_name_list = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
        final SubLObject sorted_physical_fields = list_utilities.sort_via_position(copy_list(physical_fields), field_name_list, symbol_function(EQUAL), PHYSICAL_FIELD_NAME);
        return sorted_physical_fields;
    }

    public static final SubLObject sksi_determine_relevant_physical_field_indexicals_alt(SubLObject logical_field_indexicals, SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = logical_field_indexicals;
            SubLObject lfi = NIL;
            for (lfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi = cdolist_list_var.first()) {
                result = append(result, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(lfi, logical_schemata, physical_schemata));
            }
            return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sksi_determine_relevant_physical_field_indexicals(final SubLObject logical_field_indexicals, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = logical_field_indexicals;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(result, sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(lfi, logical_schemata, physical_schemata));
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical_alt(SubLObject lfi, SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            SubLObject field_decodings = sksi_field_translation_utilities.get_field_decodings_for_logical_field_indexical(lfi, logical_schemata, physical_schemata);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = field_decodings;
            SubLObject field_decoding = NIL;
            for (field_decoding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field_decoding = cdolist_list_var.first()) {
                {
                    SubLObject physical_field_indexicals = sksi_field_translation_utilities.decoding_physical_field_indexicals(field_decoding);
                    SubLObject cdolist_list_var_1 = physical_field_indexicals;
                    SubLObject pfi = NIL;
                    for (pfi = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , pfi = cdolist_list_var_1.first()) {
                        result = cons(sksi_kb_accessors.pfi_for_lfi(pfi, lfi), result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(final SubLObject lfi, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLObject field_decodings = sksi_field_translation_utilities.get_field_decodings_for_logical_field_indexical(lfi, logical_schemata, physical_schemata);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = field_decodings;
        SubLObject field_decoding = NIL;
        field_decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject physical_field_indexicals = cdolist_list_var_$1 = sksi_field_translation_utilities.decoding_physical_field_indexicals(field_decoding);
            SubLObject pfi = NIL;
            pfi = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                result = cons(sksi_kb_accessors.pfi_for_lfi(pfi, lfi), result);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                pfi = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            field_decoding = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal_alt(SubLObject pfi, SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, logical_schemata, physical_schemata);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = field_encodings;
            SubLObject field_encoding = NIL;
            for (field_encoding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field_encoding = cdolist_list_var.first()) {
                {
                    SubLObject logical_field_indexicals = sksi_field_translation_utilities.encoding_logical_field_indexicals(field_encoding);
                    SubLObject cdolist_list_var_2 = logical_field_indexicals;
                    SubLObject lfi = NIL;
                    for (lfi = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , lfi = cdolist_list_var_2.first()) {
                        result = cons(sksi_kb_accessors.lfi_for_pfi(lfi, pfi), result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal(final SubLObject pfi, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, logical_schemata, physical_schemata);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = field_encodings;
        SubLObject field_encoding = NIL;
        field_encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject logical_field_indexicals = cdolist_list_var_$2 = sksi_field_translation_utilities.encoding_logical_field_indexicals(field_encoding);
            SubLObject lfi = NIL;
            lfi = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                result = cons(sksi_kb_accessors.lfi_for_pfi(lfi, pfi), result);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                lfi = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_alt(SubLObject pfi, SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal(pfi, logical_schemata, physical_schemata);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym26$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym26$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym26$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(pfi, logical_schemata, physical_schemata);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pfi.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (logical_schemata.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal(pfi, logical_schemata, physical_schemata)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pfi, logical_schemata, physical_schemata));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical(final SubLObject pfi, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal(pfi, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pfi, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pfi.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal(pfi, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pfi, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject physical_field_indexical_el_formula_p_alt(SubLObject formula) {
        return el_formula_with_operator_p(formula, $$ThePhysicalFieldValueFn);
    }

    public static SubLObject physical_field_indexical_el_formula_p(final SubLObject formula) {
        return el_formula_with_operator_p(formula, $$ThePhysicalFieldValueFn);
    }

    public static final SubLObject reified_mapping_el_formula_p_alt(SubLObject formula) {
        return el_formula_with_operator_p(formula, $$ReifiedMappingForPredFn);
    }

    public static SubLObject reified_mapping_el_formula_p(final SubLObject formula) {
        return el_formula_with_operator_p(formula, $$ReifiedMappingForPredFn);
    }

    public static final SubLObject physical_field_indexical_or_reified_mapping_el_formula_p_alt(SubLObject formula) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_field_indexical_el_formula_p(formula)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.reified_mapping_el_formula_p(formula)));
    }

    public static SubLObject physical_field_indexical_or_reified_mapping_el_formula_p(final SubLObject formula) {
        return makeBoolean((NIL != physical_field_indexical_el_formula_p(formula)) || (NIL != reified_mapping_el_formula_p(formula)));
    }

    public static final SubLObject physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal_alt(SubLObject logical_schema, SubLObject physical_schema) {
        {
            SubLObject pfs = sksi_kb_accessors.physical_schema_fields(physical_schema);
            SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), length(pfs));
            SubLObject cdolist_list_var = pfs;
            SubLObject pf = NIL;
            for (pf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pf = cdolist_list_var.first()) {
                {
                    SubLObject relevant_lfis = sksi_kb_accessors.sksi_determine_logical_field_indexicals_relevant_to_physical_field(pf, physical_schema, logical_schema);
                    dictionary.dictionary_enter(mappings_cache, pf, relevant_lfis);
                }
            }
            return mappings_cache;
        }
    }

    public static SubLObject physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal(final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject pfs = sksi_kb_accessors.physical_schema_fields(physical_schema);
        final SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), length(pfs));
        SubLObject cdolist_list_var = pfs;
        SubLObject pf = NIL;
        pf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject relevant_lfis = sksi_kb_accessors.sksi_determine_logical_field_indexicals_relevant_to_physical_field(pf, physical_schema, logical_schema);
            dictionary.dictionary_enter(mappings_cache, pf, relevant_lfis);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        } 
        return mappings_cache;
    }

    public static final SubLObject physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_alt(SubLObject logical_schema, SubLObject physical_schema) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym29$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym29$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym29$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, physical_schema);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schema.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, physical_schema));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject physical_field_logical_field_indexical_mappings_given_logical_physical_schemata(final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, physical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schema.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, physical_schema));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject determine_relevant_physical_fields_for_field_decoding_alt(SubLObject field_decoding, SubLObject physical_fields) {
        {
            SubLObject physical_fields_in_decoding = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_fields_for_indexicals_in_expression(field_decoding);
            SubLObject referenced_physical_fields = keyhash_utilities.fast_intersection(physical_fields, physical_fields_in_decoding, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return nreverse(referenced_physical_fields);
        }
    }

    public static SubLObject determine_relevant_physical_fields_for_field_decoding(final SubLObject field_decoding, final SubLObject physical_fields) {
        final SubLObject physical_fields_in_decoding = physical_fields_for_indexicals_in_expression(field_decoding);
        final SubLObject referenced_physical_fields = keyhash_utilities.fast_intersection(physical_fields, physical_fields_in_decoding, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return nreverse(referenced_physical_fields);
    }

    public static final SubLObject determine_relevant_physical_field_indexicals_for_field_decoding_alt(SubLObject field_decoding, SubLObject physical_field_indexicals) {
        {
            SubLObject physical_field_indexicals_in_decoding = sksi_field_translation_utilities.field_decoding_physical_field_indexicals(field_decoding);
            SubLObject referenced_physical_field_indexicals = NIL;
            SubLObject cdolist_list_var = physical_field_indexicals;
            SubLObject pfi = NIL;
            for (pfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pfi = cdolist_list_var.first()) {
                if (NIL != list_utilities.member_eqP(sksi_kb_accessors.pfi_fort_for_pfi(pfi), physical_field_indexicals_in_decoding)) {
                    referenced_physical_field_indexicals = cons(pfi, referenced_physical_field_indexicals);
                }
            }
            return nreverse(referenced_physical_field_indexicals);
        }
    }

    public static SubLObject determine_relevant_physical_field_indexicals_for_field_decoding(final SubLObject field_decoding, final SubLObject physical_field_indexicals) {
        final SubLObject physical_field_indexicals_in_decoding = sksi_field_translation_utilities.field_decoding_physical_field_indexicals(field_decoding);
        SubLObject referenced_physical_field_indexicals = NIL;
        SubLObject cdolist_list_var = physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.member_eqP(sksi_kb_accessors.pfi_fort_for_pfi(pfi), physical_field_indexicals_in_decoding)) {
                referenced_physical_field_indexicals = cons(pfi, referenced_physical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        return nreverse(referenced_physical_field_indexicals);
    }

    public static final SubLObject sksi_determine_fixed_physical_field_indexicals_internal_alt(SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = physical_schemata;
            SubLObject physical_schema = NIL;
            for (physical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , physical_schema = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_3 = sksi_kb_accessors.physical_schema_fields(physical_schema);
                    SubLObject physical_field = NIL;
                    for (physical_field = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , physical_field = cdolist_list_var_3.first()) {
                        {
                            SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_fixed_physical_field_indexicalP(physical_field_indexical, logical_schemata)) {
                                {
                                    SubLObject item_var = physical_field_indexical;
                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_determine_fixed_physical_field_indexicals_internal(final SubLObject logical_schemata, final SubLObject physical_schemata) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = NIL;
        physical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = sksi_kb_accessors.physical_schema_fields(physical_schema);
            SubLObject physical_field = NIL;
            physical_field = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
                if (NIL != sksi_fixed_physical_field_indexicalP(physical_field_indexical, logical_schemata)) {
                    final SubLObject item_var = physical_field_indexical;
                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                physical_field = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_determine_fixed_physical_field_indexicals_alt(SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals_internal(logical_schemata, physical_schemata);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schemata, physical_schemata);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schemata.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals_internal(logical_schemata, physical_schemata)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schemata, physical_schemata));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_determine_fixed_physical_field_indexicals(final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_determine_fixed_physical_field_indexicals_internal(logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schemata.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_determine_fixed_physical_field_indexicals_internal(logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_fixed_physical_field_indexicalP_internal_alt(SubLObject physical_field_indexical, SubLObject logical_schemata) {
        {
            SubLObject cdolist_list_var = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(physical_field_indexical, logical_schemata, UNPROVIDED);
            SubLObject field_encoding = NIL;
            for (field_encoding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field_encoding = cdolist_list_var.first()) {
                if (NIL != cycl_grammar.subl_atomic_term_p(field_encoding)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject sksi_fixed_physical_field_indexicalP_internal(final SubLObject physical_field_indexical, final SubLObject logical_schemata) {
        SubLObject cdolist_list_var = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(physical_field_indexical, logical_schemata, UNPROVIDED);
        SubLObject field_encoding = NIL;
        field_encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_grammar.subl_atomic_term_p(field_encoding)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_fixed_physical_field_indexicalP_alt(SubLObject physical_field_indexical, SubLObject logical_schemata) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_fixed_physical_field_indexicalP_internal(physical_field_indexical, logical_schemata);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym31$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym31$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym31$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(physical_field_indexical, logical_schemata);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (physical_field_indexical.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && logical_schemata.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_fixed_physical_field_indexicalP_internal(physical_field_indexical, logical_schemata)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(physical_field_indexical, logical_schemata));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_fixed_physical_field_indexicalP(final SubLObject physical_field_indexical, final SubLObject logical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_fixed_physical_field_indexicalP_internal(physical_field_indexical, logical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(physical_field_indexical, logical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (physical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && logical_schemata.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_fixed_physical_field_indexicalP_internal(physical_field_indexical, logical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(physical_field_indexical, logical_schemata));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject logical_field_indexical_denoting_functions_internal() {
        return ask_utilities.query_variable($sym37$_FN, $list38, $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject logical_field_indexical_denoting_functions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return logical_field_indexical_denoting_functions_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(logical_field_indexical_denoting_functions_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject logical_field_indexical_el_formula_p_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_formula_p(formula)) {
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            result = isa.quoted_isaP(formula, $$LogicalFieldIndexical, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject logical_field_indexical_el_formula_p(final SubLObject formula) {
        return el_formula_with_any_of_operators_p(formula, logical_field_indexical_denoting_functions());
    }

    public static final SubLObject logical_field_indexical_or_reified_mapping_el_formula_p_alt(SubLObject formula) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.logical_field_indexical_el_formula_p(formula)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.reified_mapping_el_formula_p(formula)));
    }

    public static SubLObject logical_field_indexical_or_reified_mapping_el_formula_p(final SubLObject formula) {
        return makeBoolean((NIL != logical_field_indexical_el_formula_p(formula)) || (NIL != reified_mapping_el_formula_p(formula)));
    }

    public static final SubLObject logical_physical_field_mappings_given_logical_physical_schemata_internal_alt(SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                {
                    SubLObject logical_fields = sksi_kb_accessors.logical_schema_fields(logical_schema);
                    SubLObject cdolist_list_var_4 = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(logical_schema), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject physical_schema = NIL;
                    for (physical_schema = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , physical_schema = cdolist_list_var_4.first()) {
                        mappings_cache = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields(logical_fields, logical_schema, physical_schema, mappings_cache);
                    }
                }
            }
            return mappings_cache;
        }
    }

    public static SubLObject logical_physical_field_mappings_given_logical_physical_schemata_internal(final SubLObject logical_schemata, final SubLObject physical_schemata) {
        SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject logical_fields = sksi_kb_accessors.logical_schema_fields(logical_schema);
            SubLObject cdolist_list_var_$4 = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(logical_schema), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject physical_schema = NIL;
            physical_schema = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                mappings_cache = physical_field_mappings_for_logical_fields(logical_fields, logical_schema, physical_schema, mappings_cache);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                physical_schema = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return mappings_cache;
    }

    public static final SubLObject logical_physical_field_mappings_given_logical_physical_schemata_alt(SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata_internal(logical_schemata, physical_schemata);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schemata, physical_schemata);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schemata.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata_internal(logical_schemata, physical_schemata)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schemata, physical_schemata));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject logical_physical_field_mappings_given_logical_physical_schemata(final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return logical_physical_field_mappings_given_logical_physical_schemata_internal(logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schemata.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(logical_physical_field_mappings_given_logical_physical_schemata_internal(logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject physical_field_mappings_for_logical_fields_alt(SubLObject logical_fields, SubLObject logical_schema, SubLObject physical_schema, SubLObject mappings_cache) {
        if (mappings_cache == UNPROVIDED) {
            mappings_cache = dictionary.new_dictionary(symbol_function(EQ), length(logical_fields));
        }
        {
            SubLObject physical_fields = sksi_kb_accessors.physical_schema_fields(physical_schema);
            SubLObject cdolist_list_var = logical_fields;
            SubLObject lf = NIL;
            for (lf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lf = cdolist_list_var.first()) {
                {
                    SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings(lf, logical_schema, physical_schema);
                    SubLObject relevant_physical_fields = NIL;
                    SubLObject cdolist_list_var_5 = field_decodings;
                    SubLObject field_decoding = NIL;
                    for (field_decoding = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , field_decoding = cdolist_list_var_5.first()) {
                        relevant_physical_fields = nconc(relevant_physical_fields, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.determine_relevant_physical_fields_for_field_decoding(field_decoding, physical_fields));
                    }
                    if (NIL != relevant_physical_fields) {
                        dictionary.dictionary_enter(mappings_cache, lf, relevant_physical_fields);
                    }
                }
            }
            return mappings_cache;
        }
    }

    public static SubLObject physical_field_mappings_for_logical_fields(final SubLObject logical_fields, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject mappings_cache) {
        if (mappings_cache == UNPROVIDED) {
            mappings_cache = dictionary.new_dictionary(symbol_function(EQ), length(logical_fields));
        }
        final SubLObject physical_fields = sksi_kb_accessors.physical_schema_fields(physical_schema);
        SubLObject cdolist_list_var = logical_fields;
        SubLObject lf = NIL;
        lf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings(lf, logical_schema, physical_schema);
            SubLObject relevant_physical_fields = NIL;
            SubLObject cdolist_list_var_$5 = field_decodings;
            SubLObject field_decoding = NIL;
            field_decoding = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                relevant_physical_fields = nconc(relevant_physical_fields, determine_relevant_physical_fields_for_field_decoding(field_decoding, physical_fields));
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                field_decoding = cdolist_list_var_$5.first();
            } 
            if (NIL != relevant_physical_fields) {
                dictionary.dictionary_enter(mappings_cache, lf, relevant_physical_fields);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lf = cdolist_list_var.first();
        } 
        return mappings_cache;
    }

    public static final SubLObject physical_field_mappings_for_logical_fields_given_logical_physical_schemata_alt(SubLObject logical_fields, SubLObject logical_schemata, SubLObject physical_schemata) {
        {
            SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = logical_fields;
            SubLObject lf = NIL;
            for (lf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lf = cdolist_list_var.first()) {
                {
                    SubLObject logical_schema = sksi_kb_accessors.logical_field_schema(lf);
                    if (NIL != list_utilities.member_eqP(logical_schema, logical_schemata)) {
                        {
                            SubLObject physical_schema = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(logical_schema), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                            mappings_cache = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields(list(lf), logical_schema, physical_schema, mappings_cache);
                        }
                    }
                }
            }
            return mappings_cache;
        }
    }

    public static SubLObject physical_field_mappings_for_logical_fields_given_logical_physical_schemata(final SubLObject logical_fields, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = logical_fields;
        SubLObject lf = NIL;
        lf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject logical_schema = sksi_kb_accessors.logical_field_schema(lf);
            if (NIL != list_utilities.member_eqP(logical_schema, logical_schemata)) {
                final SubLObject physical_schema = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(logical_schema), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                mappings_cache = physical_field_mappings_for_logical_fields(list(lf), logical_schema, physical_schema, mappings_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lf = cdolist_list_var.first();
        } 
        return mappings_cache;
    }

    public static final SubLObject expression_logical_fields_alt(SubLObject expression) {
        return cycl_utilities.expression_gather(expression, LOGICAL_FIELD_P, T, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject expression_logical_fields(final SubLObject expression) {
        return cycl_utilities.expression_gather(expression, LOGICAL_FIELD_P, T, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject expression_logical_field_indexicals_alt(SubLObject expression, SubLObject subs_tooP, SubLObject memoizeP) {
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (NIL != memoizeP) {
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.expression_logical_field_indexicals_memoized(expression, subs_tooP);
        } else {
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.expression_logical_field_indexicals_int(expression, subs_tooP);
        }
    }

    public static SubLObject expression_logical_field_indexicals(final SubLObject expression, SubLObject subs_tooP, SubLObject memoizeP) {
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (NIL != memoizeP) {
            return expression_logical_field_indexicals_memoized(expression, subs_tooP);
        }
        return expression_logical_field_indexicals_int(expression, subs_tooP);
    }

    public static final SubLObject expression_logical_field_indexicals_memoized_internal_alt(SubLObject expression, SubLObject subs_tooP) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.expression_logical_field_indexicals_int(expression, subs_tooP);
    }

    public static SubLObject expression_logical_field_indexicals_memoized_internal(final SubLObject expression, final SubLObject subs_tooP) {
        return expression_logical_field_indexicals_int(expression, subs_tooP);
    }

    public static final SubLObject expression_logical_field_indexicals_memoized_alt(SubLObject expression, SubLObject subs_tooP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.expression_logical_field_indexicals_memoized_internal(expression, subs_tooP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(expression, subs_tooP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && subs_tooP.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.expression_logical_field_indexicals_memoized_internal(expression, subs_tooP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, subs_tooP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject expression_logical_field_indexicals_memoized(final SubLObject expression, final SubLObject subs_tooP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return expression_logical_field_indexicals_memoized_internal(expression, subs_tooP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(expression, subs_tooP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && subs_tooP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(expression_logical_field_indexicals_memoized_internal(expression, subs_tooP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, subs_tooP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject expression_logical_field_indexicals_int_alt(SubLObject expression, SubLObject subs_tooP) {
        return cycl_utilities.expression_gather(expression, LOGICAL_FIELD_INDEXICAL_P, T, symbol_function(EQUAL), symbol_function(IDENTITY), subs_tooP);
    }

    public static SubLObject expression_logical_field_indexicals_int(final SubLObject expression, final SubLObject subs_tooP) {
        return cycl_utilities.expression_gather(expression, LOGICAL_FIELD_INDEXICAL_P, T, symbol_function(EQUAL), symbol_function(IDENTITY), subs_tooP);
    }

    public static final SubLObject expression_logical_field_indexicals_ordered_alt(SubLObject expression, SubLObject subs_tooP) {
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return list_utilities.tree_gather_ordered(expression, LOGICAL_FIELD_INDEXICAL_P, symbol_function(IDENTITY), subs_tooP);
    }

    public static SubLObject expression_logical_field_indexicals_ordered(final SubLObject expression, SubLObject subs_tooP) {
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return list_utilities.tree_gather_ordered(expression, LOGICAL_FIELD_INDEXICAL_P, symbol_function(IDENTITY), subs_tooP);
    }

    public static final SubLObject expression_logical_fields_for_indexicals_alt(SubLObject expression) {
        return Mapping.mapcar(LOGICAL_FIELD_FOR_INDEXICAL, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.expression_logical_field_indexicals(expression, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject expression_logical_fields_for_indexicals(final SubLObject expression) {
        return Mapping.mapcar(LOGICAL_FIELD_FOR_INDEXICAL, expression_logical_field_indexicals(expression, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject sksi_get_code_mapping_relations_for_logical_field_predicate_internal_alt(SubLObject pred, SubLObject logical_schema, SubLObject physical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(pred, list(logical_schema), list(physical_schema));
            SubLObject cycl_relations = NIL;
            SubLObject cdolist_list_var = field_decodings;
            SubLObject field_decoding = NIL;
            for (field_decoding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field_decoding = cdolist_list_var.first()) {
                if ((NIL != sksi_kb_accessors.schema_object_fn_expression_p(field_decoding)) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(field_decoding))) {
                    {
                        SubLObject code_mapping_schema = (NIL != sksi_kb_accessors.schema_object_fn_expression_p(field_decoding)) ? ((SubLObject) (cycl_utilities.formula_arg1(field_decoding, UNPROVIDED))) : cycl_utilities.formula_arg2(field_decoding, UNPROVIDED);
                        if (NIL != forts.fort_p(code_mapping_schema)) {
                            cycl_relations = nconc(cycl_relations, sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema));
                        }
                    }
                }
            }
            return list_utilities.delete_if_not($sym38$PREDICATE_, cycl_relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sksi_get_code_mapping_relations_for_logical_field_predicate_internal(final SubLObject pred, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(pred, list(logical_schema), list(physical_schema));
        SubLObject cycl_relations = NIL;
        SubLObject cdolist_list_var = field_decodings;
        SubLObject field_decoding = NIL;
        field_decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != sksi_kb_accessors.schema_object_fn_expression_p(field_decoding)) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(field_decoding))) {
                final SubLObject code_mapping_schema = (NIL != sksi_kb_accessors.schema_object_fn_expression_p(field_decoding)) ? cycl_utilities.formula_arg1(field_decoding, UNPROVIDED) : cycl_utilities.formula_arg2(field_decoding, UNPROVIDED);
                if (NIL != forts.fort_p(code_mapping_schema)) {
                    cycl_relations = nconc(cycl_relations, sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_decoding = cdolist_list_var.first();
        } 
        return list_utilities.delete_if_not($sym46$PREDICATE_, cycl_relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sksi_get_code_mapping_relations_for_logical_field_predicate_alt(SubLObject pred, SubLObject logical_schema, SubLObject physical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate_internal(pred, logical_schema, physical_schema, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(pred, logical_schema, physical_schema, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (logical_schema.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (physical_schema.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate_internal(pred, logical_schema, physical_schema, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, logical_schema, physical_schema, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_get_code_mapping_relations_for_logical_field_predicate(final SubLObject pred, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_get_code_mapping_relations_for_logical_field_predicate_internal(pred, logical_schema, physical_schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred, logical_schema, physical_schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schema.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (physical_schema.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_get_code_mapping_relations_for_logical_field_predicate_internal(pred, logical_schema, physical_schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, logical_schema, physical_schema, mt_info));
        return memoization_state.caching_results(results3);
    }

    /**
     * Returns T iff it is possible for Cyc to connect to SKS:
     * i) if SKS is a database then Cyc should be able to open up an SQL connection
     * to it;
     * ii) if SKS is a web page then an empty http request to it should succeed
     * (which basically amounts to being able to open a TCP connection to it);
     * iii) if SKS is a file hash table then Cyc should be able to open it.
     * META-MT is used to determine the access path info for SKS.
     */
    @LispMethod(comment = "Returns T iff it is possible for Cyc to connect to SKS:\r\ni) if SKS is a database then Cyc should be able to open up an SQL connection\r\nto it;\r\nii) if SKS is a web page then an empty http request to it should succeed\r\n(which basically amounts to being able to open a TCP connection to it);\r\niii) if SKS is a file hash table then Cyc should be able to open it.\r\nMETA-MT is used to determine the access path info for SKS.\nReturns T iff it is possible for Cyc to connect to SKS:\ni) if SKS is a database then Cyc should be able to open up an SQL connection\nto it;\nii) if SKS is a web page then an empty http request to it should succeed\n(which basically amounts to being able to open a TCP connection to it);\niii) if SKS is a file hash table then Cyc should be able to open it.\nMETA-MT is used to determine the access path info for SKS.")
    public static final SubLObject sk_source_accessibleP_alt(SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessibleP = NIL;
                SubLObject mt_var = meta_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject access_path = sksi_access_path.sksi_determine_access_path(sks, NIL, T);
                            if (NIL != sksi_access_path.access_path_p(access_path)) {
                                {
                                    SubLObject sks_type = sksi_access_path.access_path_type(access_path);
                                    SubLObject pcase_var = sks_type;
                                    if (pcase_var.eql($$Database_Physical)) {
                                        accessibleP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.db_sk_source_accessibleP(access_path);
                                    } else {
                                        if (pcase_var.eql($$WebPage_AIS)) {
                                            accessibleP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.web_page_sk_source_accessibleP(access_path);
                                        } else {
                                            if (pcase_var.eql($$FileHashTable_File)) {
                                                accessibleP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.fht_sk_source_accessibleP(access_path);
                                            } else {
                                                if (pcase_var.eql($const41$CommonObjectRequestBrokerArchitec)) {
                                                    accessibleP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.corba_sk_source_accessibleP(access_path);
                                                } else {
                                                    if (pcase_var.eql($CACHE)) {
                                                        accessibleP = T;
                                                    } else {
                                                        Errors.cerror($$$continue, $str_alt44$Unknown_access_path_type__A_for__, sks_type, sks);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return accessibleP;
            }
        }
    }

    /**
     * Returns T iff it is possible for Cyc to connect to SKS:
     * i) if SKS is a database then Cyc should be able to open up an SQL connection
     * to it;
     * ii) if SKS is a web page then an empty http request to it should succeed
     * (which basically amounts to being able to open a TCP connection to it);
     * iii) if SKS is a file hash table then Cyc should be able to open it.
     * META-MT is used to determine the access path info for SKS.
     */
    @LispMethod(comment = "Returns T iff it is possible for Cyc to connect to SKS:\r\ni) if SKS is a database then Cyc should be able to open up an SQL connection\r\nto it;\r\nii) if SKS is a web page then an empty http request to it should succeed\r\n(which basically amounts to being able to open a TCP connection to it);\r\niii) if SKS is a file hash table then Cyc should be able to open it.\r\nMETA-MT is used to determine the access path info for SKS.\nReturns T iff it is possible for Cyc to connect to SKS:\ni) if SKS is a database then Cyc should be able to open up an SQL connection\nto it;\nii) if SKS is a web page then an empty http request to it should succeed\n(which basically amounts to being able to open a TCP connection to it);\niii) if SKS is a file hash table then Cyc should be able to open it.\nMETA-MT is used to determine the access path info for SKS.")
    public static SubLObject sk_source_accessibleP(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accessibleP = NIL;
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject access_path = sksi_access_path.sksi_determine_access_path(sks, NIL, T);
            if (NIL != sksi_access_path.access_path_p(access_path)) {
                final SubLObject pcase_var;
                final SubLObject sks_type = pcase_var = sksi_access_path.access_path_type(access_path);
                if (pcase_var.eql($$Database_Physical)) {
                    accessibleP = db_sk_source_accessibleP(access_path);
                } else
                    if (pcase_var.eql($$WebPage_AIS)) {
                        accessibleP = web_page_sk_source_accessibleP(access_path);
                    } else
                        if (pcase_var.eql($$FileHashTable_File)) {
                            accessibleP = fht_sk_source_accessibleP(access_path);
                        } else
                            if (pcase_var.eql($const49$CommonObjectRequestBrokerArchitec)) {
                                accessibleP = corba_sk_source_accessibleP(access_path);
                            } else
                                if (pcase_var.eql($CACHE)) {
                                    accessibleP = T;
                                } else {
                                    Errors.cerror($$$continue, $str52$Unknown_access_path_type__A_for__, sks_type, sks);
                                }




            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return accessibleP;
    }

    public static final SubLObject db_sk_source_accessibleP_alt(SubLObject access_path) {
        {
            SubLObject successP = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject connection = sksi_sks_interaction.open_sql_source(access_path, UNPROVIDED, UNPROVIDED);
                                if (NIL != sdbc.sql_open_connection_p(connection)) {
                                    successP = T;
                                }
                                sdbc.sqlc_close(connection);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (error_message.isString()) {
                format(T, $str_alt46$The_following_error_occurred_whil, sksi_access_path.access_path_sks(access_path), error_message);
            }
            return successP;
        }
    }

    public static SubLObject db_sk_source_accessibleP(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject connection = sksi_sks_interaction.open_sql_source(access_path, UNPROVIDED, UNPROVIDED);
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        successP = T;
                        sdbc.sqlc_close(connection);
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
        if (error_message.isString()) {
            format(T, $str54$The_following_error_occurred_whil, sksi_access_path.access_path_sks(access_path), error_message);
        }
        return successP;
    }

    public static final SubLObject web_page_sk_source_accessibleP_alt(SubLObject access_path) {
        {
            SubLObject successP = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject server = sksi_access_path.access_path_server(access_path);
                                SubLObject port = sksi_access_path.access_path_port(access_path);
                                SubLObject url = sksi_access_path.access_path_url(access_path);
                                if (NIL == url) {
                                    url = $str_alt47$;
                                }
                                {
                                    SubLObject real_port = (port.eql($DEFAULT)) ? ((SubLObject) ($int$80)) : port;
                                    SubLObject channel = NIL;
                                    try {
                                        channel = subl_promotions.open_tcp_stream_with_timeout(server, real_port, NIL, $PRIVATE);
                                        if (NIL != channel) {
                                            web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, server, $PORT, port, $METHOD, $GET, $URL, url, $QUERY, NIL, $kw57$KEEP_ALIVE_, T, $kw58$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $DEFAULT }));
                                            successP = T;
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_6 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != channel) {
                                                    close(channel, UNPROVIDED);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0_6);
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (error_message.isString()) {
                format(T, $str_alt60$The_following_problem_was_encount, sksi_access_path.access_path_sks(access_path), error_message);
            }
            return successP;
        }
    }

    public static SubLObject web_page_sk_source_accessibleP(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject server = sksi_access_path.access_path_server(access_path);
                    final SubLObject port = sksi_access_path.access_path_port(access_path);
                    SubLObject url = sksi_access_path.access_path_url(access_path);
                    if (NIL == url) {
                        url = $str55$;
                    }
                    final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(server, real_port, sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.getDynamicValue(thread), $PRIVATE);
                        if (NIL != validate_tcp_connection(channel, server, real_port)) {
                            web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, server, $PORT, port, $METHOD, $GET, $URL, url, $QUERY, NIL, $kw65$KEEP_ALIVE_, T, $kw66$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                            successP = T;
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
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
        if (error_message.isString()) {
            format(T, $str70$The_following_problem_was_encount, sksi_access_path.access_path_sks(access_path), error_message);
        }
        return successP;
    }

    public static final SubLObject fht_sk_source_accessibleP_alt(SubLObject access_path) {
        {
            SubLObject successP = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject fht = sksi_sks_interaction.open_fht_source(access_path);
                                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                                    successP = T;
                                }
                                file_hash_table.finalize_file_hash_table(fht);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (error_message.isString()) {
                format(T, $str_alt61$_A, error_message);
            }
            return successP;
        }
    }

    public static SubLObject fht_sk_source_accessibleP(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject fht = sksi_sks_interaction.open_fht_source(access_path);
                    if (NIL != file_hash_table.file_hash_table_p(fht)) {
                        successP = T;
                    }
                    file_hash_table.finalize_file_hash_table(fht);
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
            format(T, $str71$_A, error_message);
        }
        return successP;
    }

    public static final SubLObject corba_sk_source_accessibleP_alt(SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sks = sksi_access_path.access_path_sks(access_path);
                SubLObject error_message = NIL;
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connection = corba_module_utilities.new_corba_connection_by_sks(sks);
                                    SubLObject transaction_timed_out = NIL;
                                    SubLObject tag = with_timeout_make_tag();
                                    try {
                                        {
                                            SubLObject _prev_bind_0_7 = $within_with_timeout$.currentBinding(thread);
                                            try {
                                                $within_with_timeout$.bind(T, thread);
                                                {
                                                    SubLObject timer = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                            try {
                                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                timer = with_timeout_start_timer(NIL, tag);
                                                                try {
                                                                    if (NIL != corba_utilities.corba_connection_open(connection, NIL, $PUBLIC)) {
                                                                        result = list_utilities.sublisp_boolean(corba_utilities.corba_connection_verify(connection));
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != corba_utilities.corba_connection_open_p(connection)) {
                                                                                corba_utilities.corba_connection_close(connection);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                with_timeout_stop_timer(timer);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $within_with_timeout$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
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
                if (error_message.isString()) {
                    format(T, $str_alt61$_A, error_message);
                    return NIL;
                }
                return result;
            }
        }
    }

    public static SubLObject corba_sk_source_accessibleP(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_access_path.access_path_sks(access_path);
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject connection = corba_module_utilities.new_corba_connection_by_sks(sks);
                    SubLObject transaction_timed_out = NIL;
                    final SubLObject tag = with_timeout_make_tag();
                    try {
                        thread.throwStack.push(tag);
                        final SubLObject _prev_bind_0_$7 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            SubLObject timer = NIL;
                            try {
                                final SubLObject _prev_bind_0_$8 = $with_timeout_nesting_depth$.currentBinding(thread);
                                try {
                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                    timer = with_timeout_start_timer(NIL, tag);
                                    try {
                                        if (NIL != corba_utilities.corba_connection_open(connection, NIL, $PUBLIC)) {
                                            result = list_utilities.sublisp_boolean(corba_utilities.corba_connection_verify(connection));
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != corba_utilities.corba_connection_open_p(connection)) {
                                                corba_utilities.corba_connection_close(connection);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                } finally {
                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$8, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    with_timeout_stop_timer(timer);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0_$7, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                    } finally {
                        thread.throwStack.pop();
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            format(T, $str71$_A, error_message);
            return NIL;
        }
        return result;
    }

    /**
     * Returns T iff SKS is registered.
     * Walks up the #$subKS-Direct hierarchy (visible from META-MT) until it finds a super KS that is registered.
     * SKS must have been registered through @xref register-sksi-removal-modules-for-skses
     * or through some function that calls it.
     */
    @LispMethod(comment = "Returns T iff SKS is registered.\r\nWalks up the #$subKS-Direct hierarchy (visible from META-MT) until it finds a super KS that is registered.\r\nSKS must have been registered through @xref register-sksi-removal-modules-for-skses\r\nor through some function that calls it.\nReturns T iff SKS is registered.\nWalks up the #$subKS-Direct hierarchy (visible from META-MT) until it finds a super KS that is registered.\nSKS must have been registered through @xref register-sksi-removal-modules-for-skses\nor through some function that calls it.")
    public static final SubLObject sk_source_registeredP_alt(SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sk_source_to_look = sks;
                SubLObject registeredP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sk_source_registeredP_int(sk_source_to_look);
                SubLObject mt_var = meta_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        while (!((NIL != registeredP) || (NIL == sk_source_to_look))) {
                            sk_source_to_look = sksi_kb_accessors.immediate_genl_ks(sk_source_to_look);
                            if (NIL != forts.fort_p(sk_source_to_look)) {
                                registeredP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sk_source_registeredP_int(sk_source_to_look);
                            }
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return registeredP;
            }
        }
    }

    /**
     * Returns T iff SKS is registered.
     * Walks up the #$subKS-Direct hierarchy (visible from META-MT) until it finds a super KS that is registered.
     * SKS must have been registered through @xref register-sksi-removal-modules-for-skses
     * or through some function that calls it.
     */
    @LispMethod(comment = "Returns T iff SKS is registered.\r\nWalks up the #$subKS-Direct hierarchy (visible from META-MT) until it finds a super KS that is registered.\r\nSKS must have been registered through @xref register-sksi-removal-modules-for-skses\r\nor through some function that calls it.\nReturns T iff SKS is registered.\nWalks up the #$subKS-Direct hierarchy (visible from META-MT) until it finds a super KS that is registered.\nSKS must have been registered through @xref register-sksi-removal-modules-for-skses\nor through some function that calls it.")
    public static SubLObject sk_source_registeredP(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sk_source_to_look = sks;
        SubLObject registeredP = sk_source_registeredP_int(sk_source_to_look);
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            while ((NIL == registeredP) && (NIL != sk_source_to_look)) {
                sk_source_to_look = sksi_kb_accessors.immediate_genl_ks(sk_source_to_look);
                if (NIL != forts.fort_p(sk_source_to_look)) {
                    registeredP = sk_source_registeredP_int(sk_source_to_look);
                }
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return registeredP;
    }

    public static final SubLObject sk_source_registeredP_int_alt(SubLObject sks) {
        return list_utilities.member_eqP(sks, sksi_registered_knowledge_sources());
    }

    public static SubLObject sk_source_registeredP_int(final SubLObject sks) {
        return list_utilities.member_eqP(sks, sksi_sks_manager.sksi_registered_knowledge_sources());
    }

    /**
     * Returns T iff SKS is queryable through SKSI:
     * i) SKS must be registered (see @xref sk-source-registered?)
     * ii) SKS must be accessible (see @xref sk-source-accessible?)
     */
    @LispMethod(comment = "Returns T iff SKS is queryable through SKSI:\r\ni) SKS must be registered (see @xref sk-source-registered?)\r\nii) SKS must be accessible (see @xref sk-source-accessible?)\nReturns T iff SKS is queryable through SKSI:\ni) SKS must be registered (see @xref sk-source-registered?)\nii) SKS must be accessible (see @xref sk-source-accessible?)")
    public static final SubLObject sk_source_queryableP_alt(SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sk_source_registeredP(sks, meta_mt)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.external_source_activated_in_imageP(sks))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sk_source_accessibleP(sks, meta_mt)));
    }

    /**
     * Returns T iff SKS is queryable through SKSI:
     * i) SKS must be registered (see @xref sk-source-registered?)
     * ii) SKS must be accessible (see @xref sk-source-accessible?)
     */
    @LispMethod(comment = "Returns T iff SKS is queryable through SKSI:\r\ni) SKS must be registered (see @xref sk-source-registered?)\r\nii) SKS must be accessible (see @xref sk-source-accessible?)\nReturns T iff SKS is queryable through SKSI:\ni) SKS must be registered (see @xref sk-source-registered?)\nii) SKS must be accessible (see @xref sk-source-accessible?)")
    public static SubLObject sk_source_queryableP(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        return makeBoolean(((NIL != sk_source_registeredP(sks, meta_mt)) && (NIL != external_source_activated_in_imageP(sks))) && (NIL != sk_source_accessibleP(sks, meta_mt)));
    }

    public static final SubLObject set_external_sources_activated_in_image_alt(SubLObject sks_list) {
        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.clear_external_sources_activated_in_image();
        {
            SubLObject cdolist_list_var = sks_list;
            SubLObject sks = NIL;
            for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, UNPROVIDED);
            }
        }
        return $external_sources_activated_in_image$.getGlobalValue();
    }

    public static SubLObject set_external_sources_activated_in_image(final SubLObject sks_list) {
        clear_external_sources_activated_in_image();
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_to_external_sources_activated_in_image(sks, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return $external_sources_activated_in_image$.getGlobalValue();
    }

    /**
     *
     *
     * @return set-p
     */
    @LispMethod(comment = "@return set-p")
    public static final SubLObject external_sources_activated_in_image_alt() {
        return $external_sources_activated_in_image$.getGlobalValue();
    }

    /**
     *
     *
     * @return set-p
     */
    @LispMethod(comment = "@return set-p")
    public static SubLObject external_sources_activated_in_image() {
        return $external_sources_activated_in_image$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp
     */
    @LispMethod(comment = "@return listp")
    public static final SubLObject list_of_external_sources_activated_in_image_alt() {
        return set.set_element_list($external_sources_activated_in_image$.getGlobalValue());
    }

    /**
     *
     *
     * @return listp
     */
    @LispMethod(comment = "@return listp")
    public static SubLObject list_of_external_sources_activated_in_image() {
        return set.set_element_list($external_sources_activated_in_image$.getGlobalValue());
    }

    public static final SubLObject some_external_source_activated_in_imageP_alt() {
        return makeBoolean(NIL == set.set_emptyP($external_sources_activated_in_image$.getGlobalValue()));
    }

    public static SubLObject some_external_source_activated_in_imageP() {
        return makeBoolean(NIL == set.set_emptyP($external_sources_activated_in_image$.getGlobalValue()));
    }

    public static SubLObject number_of_external_sources_activated_in_image() {
        return set.set_size($external_sources_activated_in_image$.getGlobalValue());
    }

    public static final SubLObject external_source_activated_in_imageP_alt(SubLObject sk_source) {
        return set.set_memberP(sk_source, $external_sources_activated_in_image$.getGlobalValue());
    }

    public static SubLObject external_source_activated_in_imageP(final SubLObject sk_source) {
        return set.set_memberP(sk_source, $external_sources_activated_in_image$.getGlobalValue());
    }

    public static final SubLObject clear_external_sources_activated_in_image_alt() {
        return set.clear_set($external_sources_activated_in_image$.getGlobalValue());
    }

    public static SubLObject clear_external_sources_activated_in_image() {
        return set.clear_set($external_sources_activated_in_image$.getGlobalValue());
    }

    public static final SubLObject add_to_external_sources_activated_in_image_alt(SubLObject sks, SubLObject add_sub_ksesP) {
        if (add_sub_ksesP == UNPROVIDED) {
            add_sub_ksesP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sks_list = list(sks);
                if (NIL != add_sub_ksesP) {
                    {
                        SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                sks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = sks_list;
                    SubLObject eash_sks = NIL;
                    for (eash_sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , eash_sks = cdolist_list_var.first()) {
                        set.set_add(eash_sks, $external_sources_activated_in_image$.getGlobalValue());
                    }
                }
            }
            return $external_sources_activated_in_image$.getGlobalValue();
        }
    }

    public static SubLObject add_to_external_sources_activated_in_image(final SubLObject sks, SubLObject add_sub_ksesP) {
        if (add_sub_ksesP == UNPROVIDED) {
            add_sub_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sks_list = list(sks);
        if (NIL != add_sub_ksesP) {
            final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                sks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = sks_list;
        SubLObject eash_sks = NIL;
        eash_sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(eash_sks, $external_sources_activated_in_image$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            eash_sks = cdolist_list_var.first();
        } 
        return $external_sources_activated_in_image$.getGlobalValue();
    }

    public static final SubLObject remove_from_external_sources_activated_in_image_alt(SubLObject sks, SubLObject remove_sub_ksesP) {
        if (remove_sub_ksesP == UNPROVIDED) {
            remove_sub_ksesP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sks_list = list(sks);
                if (NIL != remove_sub_ksesP) {
                    {
                        SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                sks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = sks_list;
                    SubLObject each_sks = NIL;
                    for (each_sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_sks = cdolist_list_var.first()) {
                        set.set_remove(each_sks, $external_sources_activated_in_image$.getGlobalValue());
                    }
                }
            }
            return $external_sources_activated_in_image$.getGlobalValue();
        }
    }

    public static SubLObject remove_from_external_sources_activated_in_image(final SubLObject sks, SubLObject remove_sub_ksesP) {
        if (remove_sub_ksesP == UNPROVIDED) {
            remove_sub_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sks_list = list(sks);
        if (NIL != remove_sub_ksesP) {
            final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                sks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = sks_list;
        SubLObject each_sks = NIL;
        each_sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_remove(each_sks, $external_sources_activated_in_image$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            each_sks = cdolist_list_var.first();
        } 
        return $external_sources_activated_in_image$.getGlobalValue();
    }

    public static final SubLObject disjoint_schemasP_alt(SubLObject schema0, SubLObject schema1, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return schema0 == schema1 ? ((SubLObject) (NIL)) : NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemas_memoize(schema0, schema1))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemas_regular(schema0, schema1);
    }

    public static SubLObject disjoint_schemasP(final SubLObject schema0, final SubLObject schema1, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return schema0.eql(schema1) ? NIL : NIL != memoizeP ? disjoint_schemas_memoize(schema0, schema1) : disjoint_schemas_regular(schema0, schema1);
    }

    public static final SubLObject disjoint_schemas_memoize_alt(SubLObject schema0, SubLObject schema1) {
        {
            SubLObject schema0_isa = sksi_kb_accessors.schema_isa(schema0, UNPROVIDED);
            SubLObject schema1_isa = sksi_kb_accessors.schema_isa(schema1, UNPROVIDED);
            SubLObject mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
            SubLObject disjointP = NIL;
            if (NIL == disjointP) {
                {
                    SubLObject csome_list_var = schema0_isa;
                    SubLObject col0 = NIL;
                    for (col0 = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col0 = csome_list_var.first()) {
                        if (NIL == disjointP) {
                            {
                                SubLObject csome_list_var_11 = schema1_isa;
                                SubLObject col1 = NIL;
                                for (col1 = csome_list_var_11.first(); !((NIL != disjointP) || (NIL == csome_list_var_11)); csome_list_var_11 = csome_list_var_11.rest() , col1 = csome_list_var_11.first()) {
                                    disjointP = (NIL != kb_utilities.term_L(col1, col0, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemas_memoized_int(col1, col0, mt_info))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemas_memoized_int(col0, col1, mt_info);
                                }
                            }
                        }
                    }
                }
            }
            return disjointP;
        }
    }

    public static SubLObject disjoint_schemas_memoize(final SubLObject schema0, final SubLObject schema1) {
        final SubLObject schema0_isa = sksi_kb_accessors.schema_isa(schema0, UNPROVIDED);
        final SubLObject schema1_isa = sksi_kb_accessors.schema_isa(schema1, UNPROVIDED);
        final SubLObject mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        SubLObject disjointP = NIL;
        if (NIL == disjointP) {
            SubLObject csome_list_var = schema0_isa;
            SubLObject col0 = NIL;
            col0 = csome_list_var.first();
            while ((NIL == disjointP) && (NIL != csome_list_var)) {
                if (NIL == disjointP) {
                    SubLObject csome_list_var_$11;
                    SubLObject col2;
                    for (csome_list_var_$11 = schema1_isa, col2 = NIL, col2 = csome_list_var_$11.first(); (NIL == disjointP) && (NIL != csome_list_var_$11); disjointP = (NIL != kb_utilities.term_L(col2, col0, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? disjoint_schemas_memoized_int(col2, col0, mt_info) : disjoint_schemas_memoized_int(col0, col2, mt_info) , csome_list_var_$11 = csome_list_var_$11.rest() , col2 = csome_list_var_$11.first()) {
                    }
                }
                csome_list_var = csome_list_var.rest();
                col0 = csome_list_var.first();
            } 
        }
        return disjointP;
    }

    public static final SubLObject disjoint_schemas_memoized_int_internal_alt(SubLObject col0, SubLObject col1, SubLObject mt_info) {
        return disjoint_with.disjoint_withP(col0, col1, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject disjoint_schemas_memoized_int_internal(final SubLObject col0, final SubLObject col1, final SubLObject mt_info) {
        return disjoint_with.disjoint_withP(col0, col1, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject disjoint_schemas_memoized_int_alt(SubLObject col0, SubLObject col1, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemas_memoized_int_internal(col0, col1, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DISJOINT_SCHEMAS_MEMOIZED_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DISJOINT_SCHEMAS_MEMOIZED_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, DISJOINT_SCHEMAS_MEMOIZED_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(col0, col1, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (col0.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (col1.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemas_memoized_int_internal(col0, col1, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col0, col1, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject disjoint_schemas_memoized_int(final SubLObject col0, final SubLObject col1, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return disjoint_schemas_memoized_int_internal(col0, col1, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DISJOINT_SCHEMAS_MEMOIZED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DISJOINT_SCHEMAS_MEMOIZED_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DISJOINT_SCHEMAS_MEMOIZED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(col0, col1, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col0.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (col1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(disjoint_schemas_memoized_int_internal(col0, col1, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col0, col1, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject disjoint_schemas_regular_alt(SubLObject schema0, SubLObject schema1) {
        {
            SubLObject schema0_isa = sksi_kb_accessors.schema_isa(schema0, UNPROVIDED);
            SubLObject schema1_isa = sksi_kb_accessors.schema_isa(schema1, UNPROVIDED);
            SubLObject disjointP = NIL;
            if (NIL == disjointP) {
                {
                    SubLObject csome_list_var = schema0_isa;
                    SubLObject col0 = NIL;
                    for (col0 = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col0 = csome_list_var.first()) {
                        if (NIL == disjointP) {
                            {
                                SubLObject csome_list_var_12 = schema1_isa;
                                SubLObject col1 = NIL;
                                for (col1 = csome_list_var_12.first(); !((NIL != disjointP) || (NIL == csome_list_var_12)); csome_list_var_12 = csome_list_var_12.rest() , col1 = csome_list_var_12.first()) {
                                    disjointP = disjoint_with.disjoint_withP(col0, col1, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return disjointP;
        }
    }

    public static SubLObject disjoint_schemas_regular(final SubLObject schema0, final SubLObject schema1) {
        final SubLObject schema0_isa = sksi_kb_accessors.schema_isa(schema0, UNPROVIDED);
        final SubLObject schema1_isa = sksi_kb_accessors.schema_isa(schema1, UNPROVIDED);
        SubLObject disjointP = NIL;
        if (NIL == disjointP) {
            SubLObject csome_list_var = schema0_isa;
            SubLObject col0 = NIL;
            col0 = csome_list_var.first();
            while ((NIL == disjointP) && (NIL != csome_list_var)) {
                if (NIL == disjointP) {
                    SubLObject csome_list_var_$12;
                    SubLObject col2;
                    for (csome_list_var_$12 = schema1_isa, col2 = NIL, col2 = csome_list_var_$12.first(); (NIL == disjointP) && (NIL != csome_list_var_$12); disjointP = disjoint_with.disjoint_withP(col0, col2, UNPROVIDED, UNPROVIDED) , csome_list_var_$12 = csome_list_var_$12.rest() , col2 = csome_list_var_$12.first()) {
                    }
                }
                csome_list_var = csome_list_var.rest();
                col0 = csome_list_var.first();
            } 
        }
        return disjointP;
    }

    public static final SubLObject all_disjoint_schemas_alt(SubLObject schema, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disjoint_schemas = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        disjoint_schemas = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_disjoint_schemas_int(schema, mt_relevance_macros.mt_info(UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return disjoint_schemas;
            }
        }
    }

    public static SubLObject all_disjoint_schemas(final SubLObject schema, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject disjoint_schemas = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            disjoint_schemas = all_disjoint_schemas_int(schema, mt_relevance_macros.mt_info(UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return disjoint_schemas;
    }

    public static final SubLObject all_disjoint_schemas_int_internal_alt(SubLObject schema, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disjoint_schemas = NIL;
                SubLObject node_var = $$ObjectDefiningSchema;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject node_var_13 = node_var;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_14 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_15 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_18 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_13, UNPROVIDED);
                                                                    while (NIL != node_var_13) {
                                                                        {
                                                                            SubLObject tt_node_var = node_var_13;
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_22 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_25)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_25);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_27 = new_list;
                                                                                                                                                                    SubLObject other_schema = NIL;
                                                                                                                                                                    for (other_schema = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , other_schema = cdolist_list_var_27.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                            if (NIL != forts.fort_p(other_schema)) {
                                                                                                                                                                                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemasP(schema, other_schema, T)) {
                                                                                                                                                                                    disjoint_schemas = cons(other_schema, disjoint_schemas);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_26, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_25 = dictionary_contents.do_dictionary_contents_next(iteration_state_25);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_25);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_24, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                        SubLObject instance_tuple = NIL;
                                                                                                        for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                            {
                                                                                                                SubLObject datum = instance_tuple;
                                                                                                                SubLObject current = datum;
                                                                                                                SubLObject link_node = NIL;
                                                                                                                SubLObject mt = NIL;
                                                                                                                SubLObject tv = NIL;
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt80);
                                                                                                                link_node = current.first();
                                                                                                                current = current.rest();
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt80);
                                                                                                                mt = current.first();
                                                                                                                current = current.rest();
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt80);
                                                                                                                tv = current.first();
                                                                                                                current = current.rest();
                                                                                                                if (NIL == current) {
                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = list(link_node);
                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject cdolist_list_var_30 = new_list;
                                                                                                                                                SubLObject other_schema = NIL;
                                                                                                                                                for (other_schema = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , other_schema = cdolist_list_var_30.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                        if (NIL != forts.fort_p(other_schema)) {
                                                                                                                                                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemasP(schema, other_schema, T)) {
                                                                                                                                                                disjoint_schemas = cons(other_schema, disjoint_schemas);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_29, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_28, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    cdestructuring_bind_error(datum, $list_alt80);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_31 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , generating_fn = cdolist_list_var_31.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_33 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_34 = new_list_33;
                                                                                                                        SubLObject other_schema = NIL;
                                                                                                                        for (other_schema = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , other_schema = cdolist_list_var_34.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                if (NIL != forts.fort_p(other_schema)) {
                                                                                                                                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemasP(schema, other_schema, T)) {
                                                                                                                                        disjoint_schemas = cons(other_schema, disjoint_schemas);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_32, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_23, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_22, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_35 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_13);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_38)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_38);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_40 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , node_vars_link_node = cdolist_list_var_40.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_39, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_38 = dictionary_contents.do_dictionary_contents_next(iteration_state_38);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_38);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_37, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_41 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , generating_fn = cdolist_list_var_41.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_42 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_43 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_44 = new_list_43;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , node_vars_link_node = cdolist_list_var_44.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_42, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_36, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_35, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var_13 = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_21, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_20, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_19, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt81$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_18, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_16, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return disjoint_schemas;
            }
        }
    }

    public static SubLObject all_disjoint_schemas_int_internal(final SubLObject schema, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject disjoint_schemas = NIL;
        final SubLObject node_var = $$ObjectDefiningSchema;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$13 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str88$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$18 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$13, UNPROVIDED);
                                        while (NIL != node_var_$13) {
                                            final SubLObject tt_node_var = node_var_$13;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$25;
                                                                            for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject other_schema;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                other_schema = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, other_schema)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL != forts.fort_p(other_schema)) && (NIL != disjoint_schemasP(schema, other_schema, T))) {
                                                                                                        disjoint_schemas = cons(other_schema, disjoint_schemas);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject other_schema2 = NIL;
                                                                                                other_schema2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != forts.fort_p(other_schema2)) && (NIL != disjoint_schemasP(schema, other_schema2, T))) {
                                                                                                            disjoint_schemas = cons(other_schema2, disjoint_schemas);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    other_schema2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list91);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list91);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list91);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject other_schema;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            other_schema = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, other_schema)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if ((NIL != forts.fort_p(other_schema)) && (NIL != disjoint_schemasP(schema, other_schema, T))) {
                                                                                                    disjoint_schemas = cons(other_schema, disjoint_schemas);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$29 = sol;
                                                                                            SubLObject other_schema2 = NIL;
                                                                                            other_schema2 = csome_list_var_$29.first();
                                                                                            while (NIL != csome_list_var_$29) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL != forts.fort_p(other_schema2)) && (NIL != disjoint_schemasP(schema, other_schema2, T))) {
                                                                                                        disjoint_schemas = cons(other_schema2, disjoint_schemas);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$29 = csome_list_var_$29.rest();
                                                                                                other_schema2 = csome_list_var_$29.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list91);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$30;
                                                            final SubLObject new_list = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$30.first();
                                                            while (NIL != cdolist_list_var_$30) {
                                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject other_schema3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            other_schema3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, other_schema3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(other_schema3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if ((NIL != forts.fort_p(other_schema3)) && (NIL != disjoint_schemasP(schema, other_schema3, T))) {
                                                                                    disjoint_schemas = cons(other_schema3, disjoint_schemas);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject other_schema4 = NIL;
                                                                            other_schema4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if ((NIL != forts.fort_p(other_schema4)) && (NIL != disjoint_schemasP(schema, other_schema4, T))) {
                                                                                        disjoint_schemas = cons(other_schema4, disjoint_schemas);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                other_schema4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                                }
                                                                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                                generating_fn = cdolist_list_var_$30.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$19, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$13);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$26;
                                                                            for (iteration_state_$26 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$26); iteration_state_$26 = dictionary_contents.do_dictionary_contents_next(iteration_state_$26)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$26);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$26);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$31;
                                                            final SubLObject new_list2 = cdolist_list_var_$31 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$31.first();
                                                            while (NIL != cdolist_list_var_$31) {
                                                                final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                }
                                                                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                                                                generating_fn2 = cdolist_list_var_$31.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$20, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$13 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$21, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$18, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$17, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str92$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$17, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$16, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$16, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$15, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$14, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return disjoint_schemas;
    }

    public static final SubLObject all_disjoint_schemas_int_alt(SubLObject schema, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_disjoint_schemas_int_internal(schema, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_DISJOINT_SCHEMAS_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_DISJOINT_SCHEMAS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ALL_DISJOINT_SCHEMAS_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(schema, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (schema.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_disjoint_schemas_int_internal(schema, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(schema, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject all_disjoint_schemas_int(final SubLObject schema, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_disjoint_schemas_int_internal(schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_DISJOINT_SCHEMAS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_DISJOINT_SCHEMAS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_DISJOINT_SCHEMAS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_disjoint_schemas_int_internal(schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(schema, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject all_joinable_object_defining_schemas_alt(SubLObject schema, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject schemas = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        schemas = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_joinable_object_defining_schemas_int(schema, mt_relevance_macros.mt_info(UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return schemas;
            }
        }
    }

    public static SubLObject all_joinable_object_defining_schemas(final SubLObject schema, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject schemas = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            schemas = all_joinable_object_defining_schemas_int(schema, mt_relevance_macros.mt_info(UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return schemas;
    }

    public static final SubLObject all_joinable_object_defining_schemas_int_internal_alt(SubLObject schema, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject schemas = NIL;
                SubLObject node_var = $$ObjectDefiningSchema;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject node_var_45 = node_var;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_46 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_48 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_45, UNPROVIDED);
                                                                    while (NIL != node_var_45) {
                                                                        {
                                                                            SubLObject tt_node_var = node_var_45;
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_54 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_55 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_57 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_57)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_57);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_59 = new_list;
                                                                                                                                                                    SubLObject other_schema = NIL;
                                                                                                                                                                    for (other_schema = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , other_schema = cdolist_list_var_59.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                            if (NIL != forts.fort_p(other_schema)) {
                                                                                                                                                                                if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemasP(schema, other_schema, T)) {
                                                                                                                                                                                    schemas = cons(other_schema, schemas);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_58, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_57 = dictionary_contents.do_dictionary_contents_next(iteration_state_57);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_57);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_56, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                        SubLObject instance_tuple = NIL;
                                                                                                        for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                            {
                                                                                                                SubLObject datum = instance_tuple;
                                                                                                                SubLObject current = datum;
                                                                                                                SubLObject link_node = NIL;
                                                                                                                SubLObject mt = NIL;
                                                                                                                SubLObject tv = NIL;
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt80);
                                                                                                                link_node = current.first();
                                                                                                                current = current.rest();
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt80);
                                                                                                                mt = current.first();
                                                                                                                current = current.rest();
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt80);
                                                                                                                tv = current.first();
                                                                                                                current = current.rest();
                                                                                                                if (NIL == current) {
                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = list(link_node);
                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject cdolist_list_var_62 = new_list;
                                                                                                                                                SubLObject other_schema = NIL;
                                                                                                                                                for (other_schema = cdolist_list_var_62.first(); NIL != cdolist_list_var_62; cdolist_list_var_62 = cdolist_list_var_62.rest() , other_schema = cdolist_list_var_62.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                        if (NIL != forts.fort_p(other_schema)) {
                                                                                                                                                            if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemasP(schema, other_schema, T)) {
                                                                                                                                                                schemas = cons(other_schema, schemas);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_61, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_60, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    cdestructuring_bind_error(datum, $list_alt80);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_63 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , generating_fn = cdolist_list_var_63.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_65 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_66 = new_list_65;
                                                                                                                        SubLObject other_schema = NIL;
                                                                                                                        for (other_schema = cdolist_list_var_66.first(); NIL != cdolist_list_var_66; cdolist_list_var_66 = cdolist_list_var_66.rest() , other_schema = cdolist_list_var_66.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                if (NIL != forts.fort_p(other_schema)) {
                                                                                                                                    if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.disjoint_schemasP(schema, other_schema, T)) {
                                                                                                                                        schemas = cons(other_schema, schemas);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_64, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_55, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_54, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_67 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_45);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_70 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_70)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_70);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_71 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_72 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_72.first(); NIL != cdolist_list_var_72; cdolist_list_var_72 = cdolist_list_var_72.rest() , node_vars_link_node = cdolist_list_var_72.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_71, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_70 = dictionary_contents.do_dictionary_contents_next(iteration_state_70);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_70);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_69, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_73 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_73.first(); NIL != cdolist_list_var_73; cdolist_list_var_73 = cdolist_list_var_73.rest() , generating_fn = cdolist_list_var_73.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_74 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_75 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_76 = new_list_75;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_76.first(); NIL != cdolist_list_var_76; cdolist_list_var_76 = cdolist_list_var_76.rest() , node_vars_link_node = cdolist_list_var_76.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_74, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_68, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_67, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var_45 = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_53, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_52, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt81$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_50, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_49, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_48, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_47, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_46, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return schemas;
            }
        }
    }

    public static SubLObject all_joinable_object_defining_schemas_int_internal(final SubLObject schema, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject schemas = NIL;
        final SubLObject node_var = $$ObjectDefiningSchema;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$41 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$42 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str88$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str83$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$46 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$41, UNPROVIDED);
                                        while (NIL != node_var_$41) {
                                            final SubLObject tt_node_var = node_var_$41;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$53;
                                                                            for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject other_schema;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                other_schema = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, other_schema)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL != forts.fort_p(other_schema)) && (NIL == disjoint_schemasP(schema, other_schema, T))) {
                                                                                                        schemas = cons(other_schema, schemas);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject other_schema2 = NIL;
                                                                                                other_schema2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != forts.fort_p(other_schema2)) && (NIL == disjoint_schemasP(schema, other_schema2, T))) {
                                                                                                            schemas = cons(other_schema2, schemas);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    other_schema2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$48, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$47, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list91);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list91);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list91);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject other_schema;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            other_schema = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, other_schema)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if ((NIL != forts.fort_p(other_schema)) && (NIL == disjoint_schemasP(schema, other_schema, T))) {
                                                                                                    schemas = cons(other_schema, schemas);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$57 = sol;
                                                                                            SubLObject other_schema2 = NIL;
                                                                                            other_schema2 = csome_list_var_$57.first();
                                                                                            while (NIL != csome_list_var_$57) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL != forts.fort_p(other_schema2)) && (NIL == disjoint_schemasP(schema, other_schema2, T))) {
                                                                                                        schemas = cons(other_schema2, schemas);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$57 = csome_list_var_$57.rest();
                                                                                                other_schema2 = csome_list_var_$57.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list91);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$58;
                                                            final SubLObject new_list = cdolist_list_var_$58 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$58.first();
                                                            while (NIL != cdolist_list_var_$58) {
                                                                final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject other_schema3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            other_schema3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, other_schema3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(other_schema3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if ((NIL != forts.fort_p(other_schema3)) && (NIL == disjoint_schemasP(schema, other_schema3, T))) {
                                                                                    schemas = cons(other_schema3, schemas);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject other_schema4 = NIL;
                                                                            other_schema4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if ((NIL != forts.fort_p(other_schema4)) && (NIL == disjoint_schemasP(schema, other_schema4, T))) {
                                                                                        schemas = cons(other_schema4, schemas);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                other_schema4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
                                                                }
                                                                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                                generating_fn = cdolist_list_var_$58.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$47, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$46, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$41);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$54;
                                                                            for (iteration_state_$54 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$54); iteration_state_$54 = dictionary_contents.do_dictionary_contents_next(iteration_state_$54)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$54);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$54, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$54);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$53, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$59;
                                                            final SubLObject new_list2 = cdolist_list_var_$59 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$59.first();
                                                            while (NIL != cdolist_list_var_$59) {
                                                                final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str89$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$55, thread);
                                                                }
                                                                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                                                                generating_fn2 = cdolist_list_var_$59.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$48, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$52, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$41 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$49, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$46, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$45, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str92$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$45, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$44, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$43, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$42, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return schemas;
    }

    public static final SubLObject all_joinable_object_defining_schemas_int_alt(SubLObject schema, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_joinable_object_defining_schemas_int_internal(schema, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(schema, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (schema.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_joinable_object_defining_schemas_int_internal(schema, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(schema, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject all_joinable_object_defining_schemas_int(final SubLObject schema, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_joinable_object_defining_schemas_int_internal(schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_joinable_object_defining_schemas_int_internal(schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(schema, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_determine_relevant_object_defining_schemas_alt(SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_relevant_object_defining_schemas_memoized(logical_field_indexical, logical_schemata, physical_schemata, mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static SubLObject sksi_determine_relevant_object_defining_schemas(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        return sksi_determine_relevant_object_defining_schemas_memoized(logical_field_indexical, logical_schemata, physical_schemata, mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static final SubLObject sksi_determine_relevant_object_defining_schemas_memoized_internal_alt(SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        {
            SubLObject encodings = sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata, UNPROVIDED);
            SubLObject schemas = NIL;
            SubLObject source_schemas = NIL;
            SubLObject cdolist_list_var = encodings;
            SubLObject encoding = NIL;
            for (encoding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , encoding = cdolist_list_var.first()) {
                {
                    SubLObject schema_object_id_fn_exps = list_utilities.tree_find_all_if(SCHEMA_OBJECT_ID_FN_EXPRESSION_P, encoding, UNPROVIDED);
                    SubLObject source_schema_object_id_fn_exps = list_utilities.tree_find_all_if(SOURCE_SCHEMA_OBJECT_ID_FN_EXPRESSION_P, encoding, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var_77 = schema_object_id_fn_exps;
                        SubLObject schema_object_id_fn_exp = NIL;
                        for (schema_object_id_fn_exp = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest() , schema_object_id_fn_exp = cdolist_list_var_77.first()) {
                            schemas = cons(cycl_utilities.formula_arg1(schema_object_id_fn_exp, UNPROVIDED), schemas);
                        }
                    }
                    {
                        SubLObject cdolist_list_var_78 = source_schema_object_id_fn_exps;
                        SubLObject source_schema_object_id_fn_exp = NIL;
                        for (source_schema_object_id_fn_exp = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , source_schema_object_id_fn_exp = cdolist_list_var_78.first()) {
                            source_schemas = cons(cycl_utilities.formula_arg2(source_schema_object_id_fn_exp, UNPROVIDED), source_schemas);
                        }
                    }
                }
            }
            return values(list_utilities.fast_delete_duplicates(schemas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(source_schemas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject sksi_determine_relevant_object_defining_schemas_memoized_internal(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject mt_info) {
        final SubLObject encodings = sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata, UNPROVIDED);
        SubLObject schemas = NIL;
        SubLObject source_schemas = NIL;
        SubLObject cdolist_list_var = encodings;
        SubLObject encoding = NIL;
        encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject schema_object_id_fn_exps = list_utilities.tree_find_all_if(SCHEMA_OBJECT_ID_FN_EXPRESSION_P, encoding, UNPROVIDED);
            final SubLObject source_schema_object_id_fn_exps = list_utilities.tree_find_all_if(SOURCE_SCHEMA_OBJECT_ID_FN_EXPRESSION_P, encoding, UNPROVIDED);
            SubLObject cdolist_list_var_$69 = schema_object_id_fn_exps;
            SubLObject schema_object_id_fn_exp = NIL;
            schema_object_id_fn_exp = cdolist_list_var_$69.first();
            while (NIL != cdolist_list_var_$69) {
                schemas = cons(cycl_utilities.formula_arg1(schema_object_id_fn_exp, UNPROVIDED), schemas);
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                schema_object_id_fn_exp = cdolist_list_var_$69.first();
            } 
            SubLObject cdolist_list_var_$70 = source_schema_object_id_fn_exps;
            SubLObject source_schema_object_id_fn_exp = NIL;
            source_schema_object_id_fn_exp = cdolist_list_var_$70.first();
            while (NIL != cdolist_list_var_$70) {
                source_schemas = cons(cycl_utilities.formula_arg2(source_schema_object_id_fn_exp, UNPROVIDED), source_schemas);
                cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                source_schema_object_id_fn_exp = cdolist_list_var_$70.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            encoding = cdolist_list_var.first();
        } 
        return values(list_utilities.fast_delete_duplicates(schemas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(source_schemas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject sksi_determine_relevant_object_defining_schemas_memoized_alt(SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_relevant_object_defining_schemas_memoized_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_field_indexical.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (logical_schemata.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (physical_schemata.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_determine_relevant_object_defining_schemas_memoized_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_field_indexical, logical_schemata, physical_schemata, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_determine_relevant_object_defining_schemas_memoized(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_determine_relevant_object_defining_schemas_memoized_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (physical_schemata.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_determine_relevant_object_defining_schemas_memoized_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_field_indexical, logical_schemata, physical_schemata, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject schema_object_naut_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != narts_high.naut_p(v_object))) && (cycl_utilities.nat_functor(v_object) == $$SchemaObjectFn));
    }

    public static SubLObject schema_object_naut_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != narts_high.naut_p(v_object))) && cycl_utilities.nat_functor(v_object).eql($$SchemaObjectFn));
    }

    public static final SubLObject schema_object_id_naut_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != narts_high.naut_p(v_object))) && (cycl_utilities.nat_functor(v_object) == $$SchemaObjectIDFn));
    }

    public static SubLObject schema_object_id_naut_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != narts_high.naut_p(v_object))) && cycl_utilities.nat_functor(v_object).eql($$SchemaObjectIDFn));
    }

    public static final SubLObject source_schema_object_fn_expression_possibly_definedP_alt(SubLObject expression) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_defined(expression));
    }

    public static SubLObject source_schema_object_fn_expression_possibly_definedP(final SubLObject expression) {
        return list_utilities.sublisp_boolean(source_schema_object_fn_expression_possibly_defined(expression));
    }

    public static final SubLObject source_schema_object_fn_expression_possibly_defined_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                SubLObject datum = cycl_utilities.formula_args(expression, UNPROVIDED);
                SubLObject current = datum;
                SubLObject sks = NIL;
                SubLObject ods = NIL;
                SubLObject sub_expression = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt88);
                sks = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt88);
                ods = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt88);
                sub_expression = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                        SubLObject mt_var = mapping_mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_ods(sks, ods);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt88);
                }
                return supports;
            }
        }
    }

    public static SubLObject source_schema_object_fn_expression_possibly_defined(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
        SubLObject sks = NIL;
        SubLObject ods = NIL;
        SubLObject sub_expression = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        ods = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        sub_expression = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                supports = sks_relevant_to_ods(sks, ods);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list99);
        }
        return supports;
    }

    public static final SubLObject source_schema_object_fn_expression_undefinedP_alt(SubLObject expression) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expression_undefined(expression));
    }

    public static SubLObject source_schema_object_fn_expression_undefinedP(final SubLObject expression) {
        return list_utilities.sublisp_boolean(source_schema_object_fn_expression_undefined(expression));
    }

    public static final SubLObject source_schema_object_fn_expression_undefined_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expression_undefined_int(expression);
                SubLObject object_field = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return supports;
            }
        }
    }

    public static SubLObject source_schema_object_fn_expression_undefined(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject supports = source_schema_object_fn_expression_undefined_int(expression);
        final SubLObject object_field = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return supports;
    }

    public static final SubLObject source_schema_object_fn_expression_undefined_int_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                SubLObject object_field = NIL;
                SubLObject datum = cycl_utilities.formula_args(expression, UNPROVIDED);
                SubLObject current = datum;
                SubLObject sks = NIL;
                SubLObject ods = NIL;
                SubLObject sub_expression = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt88);
                sks = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt88);
                ods = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt88);
                sub_expression = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                        SubLObject mt_var = mapping_mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                object_field = sksi_kb_accessors.schema_object_field(ods);
                                if (NIL != object_field) {
                                    {
                                        SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject anti_supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field(sks, joinable_fields);
                                            SubLObject anti_support_lf = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL == anti_supports) {
                                                {
                                                    SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                                                    supports = cons(object_field_gaf, supports);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt88);
                }
                return values(supports, object_field);
            }
        }
    }

    public static SubLObject source_schema_object_fn_expression_undefined_int(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject object_field = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
        SubLObject sks = NIL;
        SubLObject ods = NIL;
        SubLObject sub_expression = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        ods = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        sub_expression = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                object_field = sksi_kb_accessors.schema_object_field(ods);
                if (NIL != object_field) {
                    final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject anti_supports = sks_relevant_to_some_logical_field(sks, joinable_fields);
                    final SubLObject anti_support_lf = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == anti_supports) {
                        final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                        supports = cons(object_field_gaf, supports);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list99);
        }
        return values(supports, object_field);
    }

    public static final SubLObject source_schema_object_fn_expressions_equalP_alt(SubLObject expression1, SubLObject expression2) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal(expression1, expression2, NIL));
    }

    public static SubLObject source_schema_object_fn_expressions_equalP(final SubLObject expression1, final SubLObject expression2) {
        return list_utilities.sublisp_boolean(source_schema_object_fn_expressions_equal(expression1, expression2, NIL));
    }

    public static final SubLObject source_schema_object_fn_expressions_equal_alt(SubLObject expression1, SubLObject expression2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                if (expression1.equal(expression2)) {
                    {
                        SubLObject equals_literal = list_to_elf(list($$equals, expression1, expression2));
                        SubLObject equals_support = arguments.make_hl_support($REFLEXIVE, equals_literal, UNPROVIDED, UNPROVIDED);
                        supports = cons(equals_support, supports);
                    }
                }
                if (NIL == supports) {
                    {
                        SubLObject datum = cycl_utilities.formula_args(expression1, UNPROVIDED);
                        SubLObject current = datum;
                        SubLObject sks1 = NIL;
                        SubLObject ods1 = NIL;
                        SubLObject sub_expression1 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt91);
                        sks1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt91);
                        ods1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt91);
                        sub_expression1 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject datum_79 = cycl_utilities.formula_args(expression2, UNPROVIDED);
                                SubLObject current_80 = datum_79;
                                SubLObject sks2 = NIL;
                                SubLObject ods2 = NIL;
                                SubLObject sub_expression2 = NIL;
                                destructuring_bind_must_consp(current_80, datum_79, $list_alt92);
                                sks2 = current_80.first();
                                current_80 = current_80.rest();
                                destructuring_bind_must_consp(current_80, datum_79, $list_alt92);
                                ods2 = current_80.first();
                                current_80 = current_80.rest();
                                destructuring_bind_must_consp(current_80, datum_79, $list_alt92);
                                sub_expression2 = current_80.first();
                                current_80 = current_80.rest();
                                if (NIL == current_80) {
                                    {
                                        SubLObject mapping_mt1 = sksi_kb_accessors.sk_source_mapping_mt(sks1);
                                        SubLObject mapping_mt2 = sksi_kb_accessors.sk_source_mapping_mt(sks2);
                                        if (mapping_mt1 == mapping_mt2) {
                                            {
                                                SubLObject mt_var = mapping_mt1;
                                                {
                                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                                        if ((ods1 == ods2) && sub_expression1.equal(sub_expression2)) {
                                                            {
                                                                SubLObject object_field = sksi_kb_accessors.schema_object_field(ods1);
                                                                if (NIL != object_field) {
                                                                    {
                                                                        SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                                                                        if (NIL != joinable_fields) {
                                                                            if (NIL != sksi_kb_accessors.sk_source_super_ksP(sks1, sks2)) {
                                                                                supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal_sub_ks(sks1, sks2, object_field, joinable_fields, ods1, justifyP);
                                                                            } else {
                                                                                if (NIL != sksi_kb_accessors.sk_source_sub_ksP(sks1, sks2)) {
                                                                                    supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal_sub_ks(sks2, sks1, object_field, joinable_fields, ods1, justifyP);
                                                                                } else {
                                                                                    if (NIL != sksi_kb_accessors.common_super_ksP(sks1, sks2)) {
                                                                                        supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal_common_super_ks(sks1, sks2, object_field, joinable_fields, ods1, justifyP);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_79, $list_alt92);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt91);
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject source_schema_object_fn_expressions_equal(final SubLObject expression1, final SubLObject expression2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        if (expression1.equal(expression2)) {
            final SubLObject equals_literal = list_to_elf(list($$equals, expression1, expression2));
            final SubLObject equals_support = arguments.make_hl_support($REFLEXIVE, equals_literal, UNPROVIDED, UNPROVIDED);
            supports = cons(equals_support, supports);
        }
        if (NIL == supports) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(expression1, UNPROVIDED);
            SubLObject sks1 = NIL;
            SubLObject ods1 = NIL;
            SubLObject sub_expression1 = NIL;
            destructuring_bind_must_consp(current, datum, $list102);
            sks1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list102);
            ods1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list102);
            sub_expression1 = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$72;
                final SubLObject datum_$71 = current_$72 = cycl_utilities.formula_args(expression2, UNPROVIDED);
                SubLObject sks2 = NIL;
                SubLObject ods2 = NIL;
                SubLObject sub_expression2 = NIL;
                destructuring_bind_must_consp(current_$72, datum_$71, $list103);
                sks2 = current_$72.first();
                current_$72 = current_$72.rest();
                destructuring_bind_must_consp(current_$72, datum_$71, $list103);
                ods2 = current_$72.first();
                current_$72 = current_$72.rest();
                destructuring_bind_must_consp(current_$72, datum_$71, $list103);
                sub_expression2 = current_$72.first();
                current_$72 = current_$72.rest();
                if (NIL == current_$72) {
                    final SubLObject mapping_mt1 = sksi_kb_accessors.sk_source_mapping_mt(sks1);
                    final SubLObject mapping_mt2 = sksi_kb_accessors.sk_source_mapping_mt(sks2);
                    if (mapping_mt1.eql(mapping_mt2)) {
                        final SubLObject mt_var = mapping_mt1;
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (ods1.eql(ods2) && sub_expression1.equal(sub_expression2)) {
                                final SubLObject object_field = sksi_kb_accessors.schema_object_field(ods1);
                                if (NIL != object_field) {
                                    final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                                    if (NIL != joinable_fields) {
                                        if (NIL != sksi_kb_accessors.sk_source_super_ksP(sks1, sks2)) {
                                            supports = source_schema_object_fn_expressions_equal_sub_ks(sks1, sks2, object_field, joinable_fields, ods1, justifyP);
                                        } else
                                            if (NIL != sksi_kb_accessors.sk_source_sub_ksP(sks1, sks2)) {
                                                supports = source_schema_object_fn_expressions_equal_sub_ks(sks2, sks1, object_field, joinable_fields, ods1, justifyP);
                                            } else
                                                if (NIL != sksi_kb_accessors.common_super_ksP(sks1, sks2)) {
                                                    supports = source_schema_object_fn_expressions_equal_common_super_ks(sks1, sks2, object_field, joinable_fields, ods1, justifyP);
                                                }


                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum_$71, $list103);
                }
            } else {
                cdestructuring_bind_error(datum, $list102);
            }
        }
        return supports;
    }

    public static final SubLObject source_schema_object_fn_expressions_equal_sub_ks_alt(SubLObject sub_ks, SubLObject super_ks, SubLObject object_field, SubLObject joinable_fields, SubLObject ods, SubLObject justifyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject possible_supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field(sub_ks, joinable_fields);
                    SubLObject logical_field = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != possible_supports) {
                        if (NIL != justifyP) {
                            {
                                SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                                SubLObject joinable_literal = list_to_elf(list($$joinable, object_field, logical_field));
                                SubLObject support_module = (object_field == logical_field) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                                SubLObject joinable_support = arguments.make_hl_support(support_module, joinable_literal, UNPROVIDED, UNPROVIDED);
                                SubLObject sub_ks_literal = list_to_elf(list($$subKS, super_ks, sub_ks));
                                SubLObject sub_ks_support = arguments.make_hl_support($TRANSITIVITY, sub_ks_literal, UNPROVIDED, UNPROVIDED);
                                possible_supports = cons(object_field_gaf, possible_supports);
                                possible_supports = cons(joinable_support, possible_supports);
                                possible_supports = cons(sub_ks_support, possible_supports);
                                supports = possible_supports;
                            }
                        } else {
                            supports = T;
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject source_schema_object_fn_expressions_equal_sub_ks(final SubLObject sub_ks, final SubLObject super_ks, final SubLObject object_field, final SubLObject joinable_fields, final SubLObject ods, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        thread.resetMultipleValues();
        SubLObject possible_supports = sks_relevant_to_some_logical_field(sub_ks, joinable_fields);
        final SubLObject logical_field = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != possible_supports) {
            if (NIL != justifyP) {
                final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                final SubLObject joinable_literal = list_to_elf(list($$joinable, object_field, logical_field));
                final SubLObject support_module = (object_field.eql(logical_field)) ? $REFLEXIVE : $TRANSITIVITY;
                final SubLObject joinable_support = arguments.make_hl_support(support_module, joinable_literal, UNPROVIDED, UNPROVIDED);
                final SubLObject sub_ks_literal = list_to_elf(list($$subKS, super_ks, sub_ks));
                final SubLObject sub_ks_support = arguments.make_hl_support($TRANSITIVITY, sub_ks_literal, UNPROVIDED, UNPROVIDED);
                possible_supports = cons(object_field_gaf, possible_supports);
                possible_supports = cons(joinable_support, possible_supports);
                possible_supports = supports = cons(sub_ks_support, possible_supports);
            } else {
                supports = T;
            }
        }
        return supports;
    }

    public static final SubLObject source_schema_object_fn_expressions_equal_common_super_ks_alt(SubLObject sks1, SubLObject sks2, SubLObject object_field, SubLObject joinable_fields, SubLObject ods, SubLObject justifyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject possible_supports1 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field(sks1, joinable_fields);
                    SubLObject logical_field1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != possible_supports1) {
                        thread.resetMultipleValues();
                        {
                            SubLObject possible_supports2 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field(sks2, joinable_fields);
                            SubLObject logical_field2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != possible_supports2) {
                                if (NIL != justifyP) {
                                    {
                                        SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                                        SubLObject joinable_literal1 = list_to_elf(list($$joinable, object_field, logical_field1));
                                        SubLObject support_module1 = (object_field == logical_field1) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                                        SubLObject joinable_support1 = arguments.make_hl_support(support_module1, joinable_literal1, UNPROVIDED, UNPROVIDED);
                                        SubLObject joinable_literal2 = list_to_elf(list($$joinable, object_field, logical_field2));
                                        SubLObject support_module2 = (object_field == logical_field2) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                                        SubLObject joinable_support2 = arguments.make_hl_support(support_module2, joinable_literal2, UNPROVIDED, UNPROVIDED);
                                        SubLObject common_super_ks = sksi_kb_accessors.super_ks_closure_intersection(sks1, sks2).first();
                                        SubLObject super_ks_literal1 = list_to_elf(list($$subKS, common_super_ks, sks1));
                                        SubLObject support_module3 = (common_super_ks == sks1) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                                        SubLObject super_ks_support1 = arguments.make_hl_support(support_module3, super_ks_literal1, UNPROVIDED, UNPROVIDED);
                                        SubLObject super_ks_literal2 = list_to_elf(list($$subKS, common_super_ks, sks2));
                                        SubLObject support_module4 = (common_super_ks == sks2) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                                        SubLObject super_ks_support2 = arguments.make_hl_support(support_module4, super_ks_literal2, UNPROVIDED, UNPROVIDED);
                                        possible_supports1 = cons(object_field_gaf, possible_supports1);
                                        possible_supports1 = cons(joinable_support1, possible_supports1);
                                        possible_supports2 = cons(joinable_support2, possible_supports2);
                                        possible_supports1 = cons(super_ks_support1, possible_supports1);
                                        possible_supports2 = cons(super_ks_support2, possible_supports2);
                                        supports = append(possible_supports1, possible_supports2);
                                    }
                                } else {
                                    supports = T;
                                }
                            }
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject source_schema_object_fn_expressions_equal_common_super_ks(final SubLObject sks1, final SubLObject sks2, final SubLObject object_field, final SubLObject joinable_fields, final SubLObject ods, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        thread.resetMultipleValues();
        SubLObject possible_supports1 = sks_relevant_to_some_logical_field(sks1, joinable_fields);
        final SubLObject logical_field1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != possible_supports1) {
            thread.resetMultipleValues();
            SubLObject possible_supports2 = sks_relevant_to_some_logical_field(sks2, joinable_fields);
            final SubLObject logical_field2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != possible_supports2) {
                if (NIL != justifyP) {
                    final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                    final SubLObject joinable_literal1 = list_to_elf(list($$joinable, object_field, logical_field1));
                    final SubLObject support_module1 = (object_field.eql(logical_field1)) ? $REFLEXIVE : $TRANSITIVITY;
                    final SubLObject joinable_support1 = arguments.make_hl_support(support_module1, joinable_literal1, UNPROVIDED, UNPROVIDED);
                    final SubLObject joinable_literal2 = list_to_elf(list($$joinable, object_field, logical_field2));
                    final SubLObject support_module2 = (object_field.eql(logical_field2)) ? $REFLEXIVE : $TRANSITIVITY;
                    final SubLObject joinable_support2 = arguments.make_hl_support(support_module2, joinable_literal2, UNPROVIDED, UNPROVIDED);
                    final SubLObject common_super_ks = sksi_kb_accessors.super_ks_closure_intersection(sks1, sks2).first();
                    final SubLObject super_ks_literal1 = list_to_elf(list($$subKS, common_super_ks, sks1));
                    final SubLObject support_module3 = (common_super_ks.eql(sks1)) ? $REFLEXIVE : $TRANSITIVITY;
                    final SubLObject super_ks_support1 = arguments.make_hl_support(support_module3, super_ks_literal1, UNPROVIDED, UNPROVIDED);
                    final SubLObject super_ks_literal2 = list_to_elf(list($$subKS, common_super_ks, sks2));
                    final SubLObject support_module4 = (common_super_ks.eql(sks2)) ? $REFLEXIVE : $TRANSITIVITY;
                    final SubLObject super_ks_support2 = arguments.make_hl_support(support_module4, super_ks_literal2, UNPROVIDED, UNPROVIDED);
                    possible_supports1 = cons(object_field_gaf, possible_supports1);
                    possible_supports1 = cons(joinable_support1, possible_supports1);
                    possible_supports2 = cons(joinable_support2, possible_supports2);
                    possible_supports1 = cons(super_ks_support1, possible_supports1);
                    possible_supports2 = cons(super_ks_support2, possible_supports2);
                    supports = append(possible_supports1, possible_supports2);
                } else {
                    supports = T;
                }
            }
        }
        return supports;
    }

    public static final SubLObject source_schema_object_fn_equal_sk_sources_alt(SubLObject expression) {
        {
            SubLObject sk_sources = NIL;
            SubLObject datum = cycl_utilities.formula_args(expression, UNPROVIDED);
            SubLObject current = datum;
            SubLObject sks = NIL;
            SubLObject ods = NIL;
            SubLObject sub_expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt88);
            ods = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt88);
            sub_expression = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject object_field = sksi_kb_accessors.schema_object_field(ods);
                    if (NIL != object_field) {
                        {
                            SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_fieldP(sks, joinable_fields)) {
                                {
                                    SubLObject max_sk_sources = sksi_kb_accessors.sk_source_super_ks_max(sks);
                                    SubLObject closure = list_utilities.fast_delete_duplicates(Mapping.mapcan(SK_SOURCE_SUB_KS_CLOSURE, max_sk_sources, EMPTY_SUBL_OBJECT_ARRAY), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var = closure;
                                    SubLObject ks = NIL;
                                    for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_fieldP(ks, joinable_fields)) {
                                            sk_sources = cons(ks, sk_sources);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt88);
            }
            return sk_sources;
        }
    }

    public static SubLObject source_schema_object_fn_equal_sk_sources(final SubLObject expression) {
        SubLObject sk_sources = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
        SubLObject sks = NIL;
        SubLObject ods = NIL;
        SubLObject sub_expression = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        ods = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        sub_expression = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject object_field = sksi_kb_accessors.schema_object_field(ods);
            if (NIL != object_field) {
                final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                if (NIL != sks_relevant_to_some_logical_fieldP(sks, joinable_fields)) {
                    final SubLObject max_sk_sources = sksi_kb_accessors.sk_source_super_ks_max(sks);
                    SubLObject cdolist_list_var;
                    final SubLObject closure = cdolist_list_var = list_utilities.fast_delete_duplicates(Mapping.mapcan(SK_SOURCE_SUB_KS_CLOSURE, max_sk_sources, EMPTY_SUBL_OBJECT_ARRAY), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject ks = NIL;
                    ks = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != sks_relevant_to_some_logical_fieldP(ks, joinable_fields)) {
                            sk_sources = cons(ks, sk_sources);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    } 
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list99);
        }
        return sk_sources;
    }

    public static final SubLObject source_schema_object_fn_equal_expressions_alt(SubLObject expression) {
        {
            SubLObject expressions = NIL;
            SubLObject datum = cycl_utilities.formula_args(expression, UNPROVIDED);
            SubLObject current = datum;
            SubLObject sks = NIL;
            SubLObject ods = NIL;
            SubLObject sub_expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt88);
            ods = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt88);
            sub_expression = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject sk_sources = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_equal_sk_sources(expression);
                    SubLObject cdolist_list_var = sk_sources;
                    SubLObject ks = NIL;
                    for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                        expressions = cons(list_to_elf(list($$SourceSchemaObjectFn, ks, ods, sub_expression)), expressions);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt88);
            }
            return expressions;
        }
    }

    public static SubLObject source_schema_object_fn_equal_expressions(final SubLObject expression) {
        SubLObject expressions = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
        SubLObject sks = NIL;
        SubLObject ods = NIL;
        SubLObject sub_expression = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        ods = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        sub_expression = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var;
            final SubLObject sk_sources = cdolist_list_var = source_schema_object_fn_equal_sk_sources(expression);
            SubLObject ks = NIL;
            ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                expressions = cons(list_to_elf(list($$SourceSchemaObjectFn, ks, ods, sub_expression)), expressions);
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list99);
        }
        return expressions;
    }

    public static final SubLObject source_schema_object_fn_canonical_sks_alt(SubLObject sks) {
        return sksi_kb_accessors.sk_source_super_ks_max(sks).first();
    }

    public static SubLObject source_schema_object_fn_canonical_sks(final SubLObject sks) {
        return sksi_kb_accessors.sk_source_super_ks_max(sks).first();
    }

    public static final SubLObject source_schema_object_fn_canonical_expression_alt(SubLObject expression) {
        {
            SubLObject datum = cycl_utilities.formula_args(expression, UNPROVIDED);
            SubLObject current = datum;
            SubLObject sks = NIL;
            SubLObject ods = NIL;
            SubLObject sub_expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt88);
            ods = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt88);
            sub_expression = current.first();
            current = current.rest();
            if (NIL == current) {
                return list_to_elf(list($$SourceSchemaObjectFn, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.source_schema_object_fn_canonical_sks(sks), ods, sub_expression));
            } else {
                cdestructuring_bind_error(datum, $list_alt88);
            }
        }
        return NIL;
    }

    public static SubLObject source_schema_object_fn_canonical_expression(final SubLObject expression) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(expression, UNPROVIDED);
        SubLObject sks = NIL;
        SubLObject ods = NIL;
        SubLObject sub_expression = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        ods = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        sub_expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return list_to_elf(list($$SourceSchemaObjectFn, source_schema_object_fn_canonical_sks(sks), ods, sub_expression));
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    public static final SubLObject sks_relevant_to_ods_alt(SubLObject sks, SubLObject ods) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_field = sksi_kb_accessors.schema_object_field(ods);
                SubLObject supports = NIL;
                if (NIL != object_field) {
                    {
                        SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject possible_supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field(sks, joinable_fields);
                            SubLObject logical_field = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != possible_supports) {
                                {
                                    SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                                    SubLObject joinable_literal = list_to_elf(list($$joinable, object_field, logical_field));
                                    SubLObject support_module = (object_field == logical_field) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                                    SubLObject joinable_support = arguments.make_hl_support(support_module, joinable_literal, UNPROVIDED, UNPROVIDED);
                                    supports = possible_supports;
                                    supports = cons(object_field_gaf, supports);
                                    supports = cons(joinable_support, supports);
                                }
                            }
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject sks_relevant_to_ods(final SubLObject sks, final SubLObject ods) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_field = sksi_kb_accessors.schema_object_field(ods);
        SubLObject supports = NIL;
        if (NIL != object_field) {
            final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields(object_field, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject possible_supports = sks_relevant_to_some_logical_field(sks, joinable_fields);
            final SubLObject logical_field = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != possible_supports) {
                final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf(ods, object_field);
                final SubLObject joinable_literal = list_to_elf(list($$joinable, object_field, logical_field));
                final SubLObject support_module = (object_field.eql(logical_field)) ? $REFLEXIVE : $TRANSITIVITY;
                final SubLObject joinable_support = arguments.make_hl_support(support_module, joinable_literal, UNPROVIDED, UNPROVIDED);
                supports = possible_supports;
                supports = cons(object_field_gaf, supports);
                supports = cons(joinable_support, supports);
            }
        }
        return supports;
    }

    public static final SubLObject sks_relevant_to_some_logical_fieldP_alt(SubLObject sks, SubLObject logical_fields) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field(sks, logical_fields);
                SubLObject support_lf = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return list_utilities.sublisp_boolean(supports);
            }
        }
    }

    public static SubLObject sks_relevant_to_some_logical_fieldP(final SubLObject sks, final SubLObject logical_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject supports = sks_relevant_to_some_logical_field(sks, logical_fields);
        final SubLObject support_lf = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list_utilities.sublisp_boolean(supports);
    }

    public static final SubLObject sks_relevant_to_some_logical_field_alt(SubLObject sks, SubLObject logical_fields) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field_int(sks, logical_fields);
                SubLObject support_ks = thread.secondMultipleValue();
                SubLObject support_lf = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != supports) {
                    {
                        SubLObject sub_ks_literal = list_to_elf(list($$subKS, sks, support_ks));
                        SubLObject support_module = (sks == support_ks) ? ((SubLObject) ($REFLEXIVE)) : $TRANSITIVITY;
                        SubLObject sub_ks_support = arguments.make_hl_support(support_module, sub_ks_literal, UNPROVIDED, UNPROVIDED);
                        supports = cons(sub_ks_support, supports);
                    }
                }
                return values(supports, support_lf);
            }
        }
    }

    public static SubLObject sks_relevant_to_some_logical_field(final SubLObject sks, final SubLObject logical_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject supports = sks_relevant_to_some_logical_field_int(sks, logical_fields);
        final SubLObject support_ks = thread.secondMultipleValue();
        final SubLObject support_lf = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != supports) {
            final SubLObject sub_ks_literal = list_to_elf(list($$subKS, sks, support_ks));
            final SubLObject support_module = (sks.eql(support_ks)) ? $REFLEXIVE : $TRANSITIVITY;
            final SubLObject sub_ks_support = arguments.make_hl_support(support_module, sub_ks_literal, UNPROVIDED, UNPROVIDED);
            supports = cons(sub_ks_support, supports);
        }
        return values(supports, support_lf);
    }

    public static final SubLObject sks_relevant_to_some_logical_field_int_alt(SubLObject sks, SubLObject logical_fields) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supports = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_directly_relevant_to_some_logical_field(sks, logical_fields);
                SubLObject support_ks = thread.secondMultipleValue();
                SubLObject support_lf = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pred_var = $$subKS_Direct;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sks, ONE_INTEGER, pred_var)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sks, ONE_INTEGER, pred_var);
                            SubLObject done_var = supports;
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
                                                    SubLObject done_var_81 = supports;
                                                    SubLObject token_var_82 = NIL;
                                                    while (NIL == done_var_81) {
                                                        {
                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_82);
                                                            SubLObject valid_83 = makeBoolean(token_var_82 != gaf);
                                                            if (NIL != valid_83) {
                                                                {
                                                                    SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject supports_84 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sks_relevant_to_some_logical_field_int(sub_ks, logical_fields);
                                                                        SubLObject support_ks_85 = thread.secondMultipleValue();
                                                                        SubLObject support_lf_86 = thread.thirdMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        supports = supports_84;
                                                                        support_ks = support_ks_85;
                                                                        support_lf = support_lf_86;
                                                                    }
                                                                }
                                                            }
                                                            done_var_81 = makeBoolean((NIL == valid_83) || (NIL != supports));
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != supports));
                                }
                            } 
                        }
                    }
                }
                return values(supports, support_ks, support_lf);
            }
        }
    }

    public static SubLObject sks_relevant_to_some_logical_field_int(final SubLObject sks, final SubLObject logical_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject supports = sks_directly_relevant_to_some_logical_field(sks, logical_fields);
        SubLObject support_ks = thread.secondMultipleValue();
        SubLObject support_lf = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pred_var = $$subKS_Direct;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sks, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sks, ONE_INTEGER, pred_var);
            SubLObject done_var = supports;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$73 = supports;
                        final SubLObject token_var_$74 = NIL;
                        while (NIL == done_var_$73) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$74);
                            final SubLObject valid_$75 = makeBoolean(!token_var_$74.eql(gaf));
                            if (NIL != valid_$75) {
                                final SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                thread.resetMultipleValues();
                                final SubLObject supports_$76 = sks_relevant_to_some_logical_field_int(sub_ks, logical_fields);
                                final SubLObject support_ks_$77 = thread.secondMultipleValue();
                                final SubLObject support_lf_$78 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                supports = supports_$76;
                                support_ks = support_ks_$77;
                                support_lf = support_lf_$78;
                            }
                            done_var_$73 = makeBoolean((NIL == valid_$75) || (NIL != supports));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != supports));
            } 
        }
        return values(supports, support_ks, support_lf);
    }

    public static final SubLObject sks_directly_relevant_to_some_logical_field_alt(SubLObject sks, SubLObject logical_fields) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata(sks);
                SubLObject supports = NIL;
                SubLObject support_ks = NIL;
                SubLObject support_lf = NIL;
                if (NIL != logical_schemata) {
                    thread.resetMultipleValues();
                    {
                        SubLObject ls_relevance_gaf = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.some_logical_schema_relevant_to_some_logical_field(logical_schemata, logical_fields);
                        SubLObject logical_schema = thread.secondMultipleValue();
                        SubLObject logical_field = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != ls_relevance_gaf) {
                            {
                                SubLObject sks_relevance_gafs = sksi_kb_accessors.logical_schema_source_gafs(logical_schema, sks);
                                supports = cons(ls_relevance_gaf, sks_relevance_gafs);
                                support_ks = sks;
                                support_lf = logical_field;
                            }
                        }
                    }
                }
                return values(supports, support_ks, support_lf);
            }
        }
    }

    public static SubLObject sks_directly_relevant_to_some_logical_field(final SubLObject sks, final SubLObject logical_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata(sks);
        SubLObject supports = NIL;
        SubLObject support_ks = NIL;
        SubLObject support_lf = NIL;
        if (NIL != logical_schemata) {
            thread.resetMultipleValues();
            final SubLObject ls_relevance_gaf = some_logical_schema_relevant_to_some_logical_field(logical_schemata, logical_fields);
            final SubLObject logical_schema = thread.secondMultipleValue();
            final SubLObject logical_field = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != ls_relevance_gaf) {
                final SubLObject sks_relevance_gafs = sksi_kb_accessors.logical_schema_source_gafs(logical_schema, sks);
                supports = cons(ls_relevance_gaf, sks_relevance_gafs);
                support_ks = sks;
                support_lf = logical_field;
            }
        }
        return values(supports, support_ks, support_lf);
    }

    public static final SubLObject some_logical_schema_relevant_to_some_logical_field_alt(SubLObject logical_schemata, SubLObject logical_fields) {
        {
            SubLObject support = NIL;
            SubLObject support_ls = NIL;
            SubLObject support_lf = NIL;
            if (NIL == support) {
                {
                    SubLObject csome_list_var = logical_fields;
                    SubLObject lf = NIL;
                    for (lf = csome_list_var.first(); !((NIL != support) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lf = csome_list_var.first()) {
                        {
                            SubLObject pred_var = $$logicalFields;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(lf, TWO_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(lf, TWO_INTEGER, pred_var);
                                    SubLObject done_var = support;
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
                                                            SubLObject done_var_87 = support;
                                                            SubLObject token_var_88 = NIL;
                                                            while (NIL == done_var_87) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_88);
                                                                    SubLObject valid_89 = makeBoolean(token_var_88 != gaf);
                                                                    if (NIL != valid_89) {
                                                                        {
                                                                            SubLObject ls = assertions_high.gaf_arg1(gaf);
                                                                            if (NIL != list_utilities.member_eqP(ls, logical_schemata)) {
                                                                                support = gaf;
                                                                                support_ls = ls;
                                                                                support_lf = lf;
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_87 = makeBoolean((NIL == valid_89) || (NIL != support));
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
                                            done_var = makeBoolean((NIL == valid) || (NIL != support));
                                        }
                                    } 
                                }
                            }
                        }
                    }
                }
            }
            return values(support, support_ls, support_lf);
        }
    }

    public static SubLObject some_logical_schema_relevant_to_some_logical_field(final SubLObject logical_schemata, final SubLObject logical_fields) {
        SubLObject support = NIL;
        SubLObject support_ls = NIL;
        SubLObject support_lf = NIL;
        if (NIL == support) {
            SubLObject csome_list_var = logical_fields;
            SubLObject lf = NIL;
            lf = csome_list_var.first();
            while ((NIL == support) && (NIL != csome_list_var)) {
                final SubLObject pred_var = $$logicalFields;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(lf, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(lf, TWO_INTEGER, pred_var);
                    SubLObject done_var = support;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$79 = support;
                                final SubLObject token_var_$80 = NIL;
                                while (NIL == done_var_$79) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$80);
                                    final SubLObject valid_$81 = makeBoolean(!token_var_$80.eql(gaf));
                                    if (NIL != valid_$81) {
                                        final SubLObject ls = assertions_high.gaf_arg1(gaf);
                                        if (NIL != list_utilities.member_eqP(ls, logical_schemata)) {
                                            support = gaf;
                                            support_ls = ls;
                                            support_lf = lf;
                                        }
                                    }
                                    done_var_$79 = makeBoolean((NIL == valid_$81) || (NIL != support));
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
                        done_var = makeBoolean((NIL == valid) || (NIL != support));
                    } 
                }
                csome_list_var = csome_list_var.rest();
                lf = csome_list_var.first();
            } 
        }
        return values(support, support_ls, support_lf);
    }

    public static final SubLObject sksi_supported_function_expression_p_alt(SubLObject expression) {
        return fort_types_interface.sksi_supported_function_p(cycl_utilities.nat_functor(expression));
    }

    public static SubLObject sksi_supported_function_expression_p(final SubLObject expression) {
        return fort_types_interface.sksi_supported_function_p(cycl_utilities.nat_functor(expression));
    }

    public static final SubLObject sks_to_allowed_modules_list_alt(SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                SubLObject sub_ks_list = NIL;
                SubLObject allowed_modules_list = NIL;
                SubLObject mt_var = mapping_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = sub_ks_list;
                    SubLObject sub_ks = NIL;
                    for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                        allowed_modules_list = cons(list($MODULE_SOURCE, sub_ks), allowed_modules_list);
                    }
                }
                if (NIL != list_utilities.singletonP(allowed_modules_list)) {
                    allowed_modules_list = allowed_modules_list.first();
                } else {
                    allowed_modules_list = cons($OR, allowed_modules_list);
                }
                allowed_modules_list = listS($OR, allowed_modules_list, $list_alt103);
                return allowed_modules_list;
            }
        }
    }

    public static SubLObject sks_to_allowed_modules_list(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        SubLObject sub_ks_list = NIL;
        SubLObject allowed_modules_list = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = sub_ks_list;
        SubLObject sub_ks = NIL;
        sub_ks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            allowed_modules_list = cons(list($MODULE_SOURCE, sub_ks), allowed_modules_list);
            cdolist_list_var = cdolist_list_var.rest();
            sub_ks = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(allowed_modules_list)) {
            allowed_modules_list = allowed_modules_list.first();
        } else {
            allowed_modules_list = cons($OR, allowed_modules_list);
        }
        allowed_modules_list = listS($OR, allowed_modules_list, $list114);
        return allowed_modules_list;
    }

    public static final SubLObject make_sksi_support_alt(SubLObject asent, SubLObject mt) {
        return arguments.make_hl_support($SKSI, asent, mt, UNPROVIDED);
    }

    public static SubLObject make_sksi_support(final SubLObject asent, final SubLObject mt) {
        return arguments.make_hl_support($SKSI, asent, mt, UNPROVIDED);
    }

    public static final SubLObject sksi_support_p_alt(SubLObject v_object) {
        return NIL != arguments.hl_support_p(v_object) ? ((SubLObject) (eq(arguments.hl_support_module(v_object), $SKSI))) : NIL;
    }

    public static SubLObject sksi_support_p(final SubLObject v_object) {
        return NIL != arguments.hl_support_p(v_object) ? eq(arguments.hl_support_module(v_object), $SKSI) : NIL;
    }

    public static final SubLObject hl_modules_list_to_allowed_modules_spec_alt(SubLObject hl_modules) {
        return NIL != list_utilities.singletonP(hl_modules) ? ((SubLObject) (inference_modules.hl_module_name(hl_modules.first()))) : cons($OR, Mapping.mapcar(HL_MODULE_NAME, hl_modules));
    }

    public static SubLObject hl_modules_list_to_allowed_modules_spec(final SubLObject hl_modules) {
        return NIL != list_utilities.singletonP(hl_modules) ? inference_modules.hl_module_name(hl_modules.first()) : cons($OR, Mapping.mapcar(HL_MODULE_NAME, hl_modules));
    }

    public static final SubLObject sksi_possibly_nart_el_formula_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != fort_types_interface.reifiable_function_p(cycl_utilities.formula_operator(v_object))));
    }

    public static SubLObject sksi_possibly_nart_el_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != fort_types_interface.reifiable_function_p(cycl_utilities.formula_operator(v_object))));
    }

    public static final SubLObject sksi_true_cycl_expression_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_represented_term_p(v_object)) || (NIL != cycl_grammar.cycl_sentence_p(v_object)));
    }

    public static SubLObject sksi_true_cycl_expression_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_represented_term_p(v_object)) || (NIL != cycl_grammar.cycl_sentence_p(v_object)));
    }

    public static final SubLObject code_mapping_expressionP_alt(SubLObject expression) {
        if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
            return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg1(expression, UNPROVIDED));
        } else {
            if (NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
                return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg1(expression, UNPROVIDED));
            } else {
                if (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
                    return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg2(expression, UNPROVIDED));
                } else {
                    if (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
                        return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg2(expression, UNPROVIDED));
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject code_mapping_expressionP(final SubLObject expression) {
        if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
            return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg1(expression, UNPROVIDED));
        }
        if (NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
            return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg1(expression, UNPROVIDED));
        }
        if (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
            return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg2(expression, UNPROVIDED));
        }
        if (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
            return sksi_kb_accessors.isa_reified_mappingP(cycl_utilities.formula_arg2(expression, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject code_mapping_expression_schema_alt(SubLObject expression) {
        if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
            return cycl_utilities.formula_arg1(expression, UNPROVIDED);
        } else {
            if (NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
                return cycl_utilities.formula_arg1(expression, UNPROVIDED);
            } else {
                if (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
                    return cycl_utilities.formula_arg2(expression, UNPROVIDED);
                } else {
                    if (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
                        return cycl_utilities.formula_arg2(expression, UNPROVIDED);
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject code_mapping_expression_schema(final SubLObject expression) {
        if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
            return cycl_utilities.formula_arg1(expression, UNPROVIDED);
        }
        if (NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
            return cycl_utilities.formula_arg1(expression, UNPROVIDED);
        }
        if (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
            return cycl_utilities.formula_arg2(expression, UNPROVIDED);
        }
        if (NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
            return cycl_utilities.formula_arg2(expression, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject find_assertion_cycl_memoized_internal_alt(SubLObject sentence, SubLObject mt, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return czer_meta.find_assertion_cycl(sentence, mt);
    }

    public static SubLObject find_assertion_cycl_memoized_internal(final SubLObject sentence, SubLObject mt, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return czer_meta.find_assertion_cycl(sentence, mt);
    }

    public static final SubLObject find_assertion_cycl_memoized_alt(SubLObject sentence, SubLObject mt, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.find_assertion_cycl_memoized_internal(sentence, mt, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_ASSERTION_CYCL_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_ASSERTION_CYCL_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FIND_ASSERTION_CYCL_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (sentence.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.find_assertion_cycl_memoized_internal(sentence, mt, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject find_assertion_cycl_memoized(final SubLObject sentence, SubLObject mt, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return find_assertion_cycl_memoized_internal(sentence, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_ASSERTION_CYCL_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_ASSERTION_CYCL_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIND_ASSERTION_CYCL_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(find_assertion_cycl_memoized_internal(sentence, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject genl_predicate_memoizedP_internal_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return genl_predicates.genl_predicateP(spec, genl, mt, tv);
    }

    public static SubLObject genl_predicate_memoizedP_internal(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return genl_predicates.genl_predicateP(spec, genl, mt, tv);
    }

    public static final SubLObject genl_predicate_memoizedP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.genl_predicate_memoizedP_internal(spec, genl, mt, tv, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym107$GENL_PREDICATE_MEMOIZED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym107$GENL_PREDICATE_MEMOIZED_, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym107$GENL_PREDICATE_MEMOIZED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(spec, genl, mt, tv, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (spec.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (genl.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (tv.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.genl_predicate_memoizedP_internal(spec, genl, mt, tv, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(spec, genl, mt, tv, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject genl_predicate_memoizedP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return genl_predicate_memoizedP_internal(spec, genl, mt, tv, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym118$GENL_PREDICATE_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym118$GENL_PREDICATE_MEMOIZED_, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym118$GENL_PREDICATE_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(spec, genl, mt, tv, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (tv.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(genl_predicate_memoizedP_internal(spec, genl, mt, tv, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec, genl, mt, tv, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject genl_inverse_memoizedP_internal_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return genl_predicates.genl_inverseP(spec, genl, mt, tv);
    }

    public static SubLObject genl_inverse_memoizedP_internal(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return genl_predicates.genl_inverseP(spec, genl, mt, tv);
    }

    public static final SubLObject genl_inverse_memoizedP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.genl_inverse_memoizedP_internal(spec, genl, mt, tv, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym108$GENL_INVERSE_MEMOIZED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym108$GENL_INVERSE_MEMOIZED_, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym108$GENL_INVERSE_MEMOIZED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(spec, genl, mt, tv, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (spec.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (genl.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (tv.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.genl_inverse_memoizedP_internal(spec, genl, mt, tv, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(spec, genl, mt, tv, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject genl_inverse_memoizedP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return genl_inverse_memoizedP_internal(spec, genl, mt, tv, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym119$GENL_INVERSE_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym119$GENL_INVERSE_MEMOIZED_, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym119$GENL_INVERSE_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(spec, genl, mt, tv, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (tv.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(genl_inverse_memoizedP_internal(spec, genl, mt, tv, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec, genl, mt, tv, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject all_fort_instances_memoized_internal_alt(SubLObject coll, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return isa.all_fort_instances(coll, mt, tv);
    }

    public static SubLObject all_fort_instances_memoized_internal(final SubLObject coll, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return isa.all_fort_instances(coll, mt, tv);
    }

    public static final SubLObject all_fort_instances_memoized_alt(SubLObject coll, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_fort_instances_memoized_internal(coll, mt, tv, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_FORT_INSTANCES_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_FORT_INSTANCES_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ALL_FORT_INSTANCES_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(coll, mt, tv, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (coll.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (tv.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.all_fort_instances_memoized_internal(coll, mt, tv, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(coll, mt, tv, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject all_fort_instances_memoized(final SubLObject coll, SubLObject mt, SubLObject tv, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_fort_instances_memoized_internal(coll, mt, tv, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_FORT_INSTANCES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_FORT_INSTANCES_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_FORT_INSTANCES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(coll, mt, tv, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (coll.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (tv.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_fort_instances_memoized_internal(coll, mt, tv, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(coll, mt, tv, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject mt_relevant_to_mt_memoizedP_internal_alt(SubLObject mt, SubLObject possibly_relevant_mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return mt_relevance_macros.mt_relevant_to_mtP(mt, possibly_relevant_mt);
    }

    public static SubLObject mt_relevant_to_mt_memoizedP_internal(final SubLObject mt, final SubLObject possibly_relevant_mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return mt_relevance_macros.mt_relevant_to_mtP(mt, possibly_relevant_mt);
    }

    public static final SubLObject mt_relevant_to_mt_memoizedP_alt(SubLObject mt, SubLObject possibly_relevant_mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP_internal(mt, possibly_relevant_mt, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym110$MT_RELEVANT_TO_MT_MEMOIZED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym110$MT_RELEVANT_TO_MT_MEMOIZED_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym110$MT_RELEVANT_TO_MT_MEMOIZED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(mt, possibly_relevant_mt, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (possibly_relevant_mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP_internal(mt, possibly_relevant_mt, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(mt, possibly_relevant_mt, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject mt_relevant_to_mt_memoizedP(final SubLObject mt, final SubLObject possibly_relevant_mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return mt_relevant_to_mt_memoizedP_internal(mt, possibly_relevant_mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym121$MT_RELEVANT_TO_MT_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym121$MT_RELEVANT_TO_MT_MEMOIZED_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym121$MT_RELEVANT_TO_MT_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(mt, possibly_relevant_mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (possibly_relevant_mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(mt_relevant_to_mt_memoizedP_internal(mt, possibly_relevant_mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mt, possibly_relevant_mt, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject formula_commutative_permutations_memoized_internal_alt(SubLObject formula, SubLObject penetrate_argsP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        return cycl_utilities.formula_commutative_permutations(formula, penetrate_argsP);
    }

    public static SubLObject formula_commutative_permutations_memoized_internal(final SubLObject formula, final SubLObject penetrate_argsP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        return cycl_utilities.formula_commutative_permutations(formula, penetrate_argsP);
    }

    public static final SubLObject formula_commutative_permutations_memoized_alt(SubLObject formula, SubLObject penetrate_argsP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.formula_commutative_permutations_memoized_internal(formula, penetrate_argsP, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(formula, penetrate_argsP, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (penetrate_argsP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.formula_commutative_permutations_memoized_internal(formula, penetrate_argsP, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, penetrate_argsP, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject formula_commutative_permutations_memoized(final SubLObject formula, final SubLObject penetrate_argsP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return formula_commutative_permutations_memoized_internal(formula, penetrate_argsP, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(formula, penetrate_argsP, mt_info);
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
                    if (penetrate_argsP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(formula_commutative_permutations_memoized_internal(formula, penetrate_argsP, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, penetrate_argsP, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject removal_ask_template_memoized_internal_alt(SubLObject template, SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return backward.removal_ask_template(template, asent, mt, truth, query_properties);
    }

    public static SubLObject removal_ask_template_memoized_internal(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return backward.removal_ask_template(template, asent, mt, truth, query_properties);
    }

    public static final SubLObject removal_ask_template_memoized_alt(SubLObject template, SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.removal_ask_template_memoized_internal(template, asent, mt, truth, query_properties);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_ASK_TEMPLATE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_ASK_TEMPLATE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REMOVAL_ASK_TEMPLATE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(template, asent, mt, truth, query_properties);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (asent.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (truth.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.removal_ask_template_memoized_internal(template, asent, mt, truth, query_properties)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, asent, mt, truth, query_properties));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject removal_ask_template_memoized(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_ask_template_memoized_internal(template, asent, mt, truth, query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_ASK_TEMPLATE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_ASK_TEMPLATE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_ASK_TEMPLATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(template, asent, mt, truth, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (asent.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (truth.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(removal_ask_template_memoized_internal(template, asent, mt, truth, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, asent, mt, truth, query_properties));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject removal_ask_memoized_internal_alt(SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return backward.removal_ask(asent, mt, truth, query_properties);
    }

    public static SubLObject removal_ask_memoized_internal(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return backward.removal_ask(asent, mt, truth, query_properties);
    }

    public static final SubLObject removal_ask_memoized_alt(SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.removal_ask_memoized_internal(asent, mt, truth, query_properties);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_ASK_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_ASK_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REMOVAL_ASK_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(asent, mt, truth, query_properties);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (asent.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (truth.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.removal_ask_memoized_internal(asent, mt, truth, query_properties)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, mt, truth, query_properties));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject removal_ask_memoized(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_ask_memoized_internal(asent, mt, truth, query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_ASK_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_ASK_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_ASK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(asent, mt, truth, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (truth.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(removal_ask_memoized_internal(asent, mt, truth, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt, truth, query_properties));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject removal_ask_hl_variable_memoized_internal_alt(SubLObject hl_variable, SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return backward.removal_ask_hl_variable(hl_variable, asent, mt, truth, query_properties);
    }

    public static SubLObject removal_ask_hl_variable_memoized_internal(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return backward.removal_ask_hl_variable(hl_variable, asent, mt, truth, query_properties);
    }

    public static final SubLObject removal_ask_hl_variable_memoized_alt(SubLObject hl_variable, SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.removal_ask_hl_variable_memoized_internal(hl_variable, asent, mt, truth, query_properties);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_ASK_HL_VARIABLE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_ASK_HL_VARIABLE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REMOVAL_ASK_HL_VARIABLE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(hl_variable, asent, mt, truth, query_properties);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (hl_variable.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (asent.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (truth.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.removal_ask_hl_variable_memoized_internal(hl_variable, asent, mt, truth, query_properties)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(hl_variable, asent, mt, truth, query_properties));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject removal_ask_hl_variable_memoized(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_ask_hl_variable_memoized_internal(hl_variable, asent, mt, truth, query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_ASK_HL_VARIABLE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_ASK_HL_VARIABLE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_ASK_HL_VARIABLE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(hl_variable, asent, mt, truth, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (hl_variable.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (asent.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (truth.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(removal_ask_hl_variable_memoized_internal(hl_variable, asent, mt, truth, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(hl_variable, asent, mt, truth, query_properties));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject isa_unit_of_measureP_internal_alt(SubLObject v_object) {
        return isa.isaP(v_object, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject isa_unit_of_measureP_internal(final SubLObject v_object) {
        return isa.isaP(v_object, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject isa_unit_of_measureP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.isa_unit_of_measureP_internal(v_object);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym115$ISA_UNIT_OF_MEASURE_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym115$ISA_UNIT_OF_MEASURE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym115$ISA_UNIT_OF_MEASURE_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, $kw8$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.isa_unit_of_measureP_internal(v_object)));
                        memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject isa_unit_of_measureP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return isa_unit_of_measureP_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym126$ISA_UNIT_OF_MEASURE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym126$ISA_UNIT_OF_MEASURE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym126$ISA_UNIT_OF_MEASURE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(isa_unit_of_measureP_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_sksi_infrastructure_utilities_file() {
        declareFunction("initialize_sksi_kb_feature", "INITIALIZE-SKSI-KB-FEATURE", 0, 0, false);
        declareFunction("initialize_sksi_data_structures", "INITIALIZE-SKSI-DATA-STRUCTURES", 0, 0, false);
        declareFunction("initialize_non_thelogicalfieldvaluefn_lfi_fort_cache", "INITIALIZE-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE", 0, 0, false);
        declareFunction("possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache", "POSSIBLY-ADD-LFI-TO-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE", 2, 0, false);
        declareFunction("possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache", "POSSIBLY-REMOVE-LFI-FROM-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE", 2, 0, false);
        declareFunction("non_thelogicalfieldvaluefn_lfi_fort_p", "NON-THELOGICALFIELDVALUEFN-LFI-FORT-P", 1, 0, false);
        declareFunction("sksi_reconstruct_expression", "SKSI-RECONSTRUCT-EXPRESSION", 2, 1, false);
        declareFunction("sksi_reconstruct_expression_memoized_internal", "SKSI-RECONSTRUCT-EXPRESSION-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("sksi_reconstruct_expression_memoized", "SKSI-RECONSTRUCT-EXPRESSION-MEMOIZED", 2, 0, false);
        declareFunction("sksi_reconstruct_expression_int", "SKSI-RECONSTRUCT-EXPRESSION-INT", 2, 0, false);
        declareFunction("all_relevant_sksi_content_mts", "ALL-RELEVANT-SKSI-CONTENT-MTS", 0, 0, false);
        declareFunction("all_relevant_sksi_content_mts_int_internal", "ALL-RELEVANT-SKSI-CONTENT-MTS-INT-INTERNAL", 1, 0, false);
        declareFunction("all_relevant_sksi_content_mts_int", "ALL-RELEVANT-SKSI-CONTENT-MTS-INT", 1, 0, false);
        declareFunction("any_sksi_content_mt_with_registered_module_relevantP", "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?", 0, 0, false);
        declareFunction("any_sksi_content_mt_with_registered_module_relevantP_int_internal", "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?-INT-INTERNAL", 1, 0, false);
        declareFunction("any_sksi_content_mt_with_registered_module_relevantP_int", "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?-INT", 1, 0, false);
        declareFunction("any_sksi_content_mt_relevantP", "ANY-SKSI-CONTENT-MT-RELEVANT?", 0, 0, false);
        declareFunction("any_sksi_content_mt_relevantP_int_internal", "ANY-SKSI-CONTENT-MT-RELEVANT?-INT-INTERNAL", 1, 0, false);
        declareFunction("any_sksi_content_mt_relevantP_int", "ANY-SKSI-CONTENT-MT-RELEVANT?-INT", 1, 0, false);
        declareFunction("relevant_top_level_sksi_content_mts", "RELEVANT-TOP-LEVEL-SKSI-CONTENT-MTS", 0, 0, false);
        declareFunction("sk_source_atomicP", "SK-SOURCE-ATOMIC?", 1, 0, false);
        declareFunction("sk_source_complexP", "SK-SOURCE-COMPLEX?", 1, 0, false);
        declareFunction("gather_all_complete_knowledge_sources", "GATHER-ALL-COMPLETE-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction("gather_all_top_level_complete_knowledge_sources", "GATHER-ALL-TOP-LEVEL-COMPLETE-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction("gather_all_top_level_complete_registered_knowledge_sources", "GATHER-ALL-TOP-LEVEL-COMPLETE-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction("gather_all_top_level_registered_knowledge_sources", "GATHER-ALL-TOP-LEVEL-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction("sort_knowledge_sources", "SORT-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction("gather_sksi_knowledge_sources_and_descriptions", "GATHER-SKSI-KNOWLEDGE-SOURCES-AND-DESCRIPTIONS", 0, 0, false);
        declareFunction("get_sks_description_string", "GET-SKS-DESCRIPTION-STRING", 1, 0, false);
        declareFunction("top_level_knowledge_source_p", "TOP-LEVEL-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("top_level_knowledge_source_in_any_mt_p", "TOP-LEVEL-KNOWLEDGE-SOURCE-IN-ANY-MT-P", 1, 0, false);
        declareFunction("all_relevant_sk_sources", "ALL-RELEVANT-SK-SOURCES", 0, 0, false);
        declareFunction("all_relevant_dbs", "ALL-RELEVANT-DBS", 0, 0, false);
        declareFunction("relevant_registered_top_level_sksi_dbs", "RELEVANT-REGISTERED-TOP-LEVEL-SKSI-DBS", 0, 0, false);
        declareFunction("relevant_maximum_sksi_dbs", "RELEVANT-MAXIMUM-SKSI-DBS", 0, 0, false);
        declareFunction("external_term_denoting_function_expression_p", "EXTERNAL-TERM-DENOTING-FUNCTION-EXPRESSION-P", 1, 0, false);
        declareFunction("sksi_external_term_p", "SKSI-EXTERNAL-TERM-P", 1, 0, false);
        declareFunction("sksi_term_p", "SKSI-TERM-P", 1, 0, false);
        declareFunction("sksi_supported_predicate_type_p", "SKSI-SUPPORTED-PREDICATE-TYPE-P", 1, 1, false);
        declareFunction("physical_fields_for_indexicals_in_expression", "PHYSICAL-FIELDS-FOR-INDEXICALS-IN-EXPRESSION", 1, 0, false);
        declareFunction("indexicals_for_physical_fields_in_expression", "INDEXICALS-FOR-PHYSICAL-FIELDS-IN-EXPRESSION", 1, 0, false);
        declareFunction("extract_physical_fields_via_indexicals", "EXTRACT-PHYSICAL-FIELDS-VIA-INDEXICALS", 2, 0, false);
        declareFunction("sort_physical_fields_by_field_name_list", "SORT-PHYSICAL-FIELDS-BY-FIELD-NAME-LIST", 2, 0, false);
        declareFunction("sksi_determine_relevant_physical_field_indexicals", "SKSI-DETERMINE-RELEVANT-PHYSICAL-FIELD-INDEXICALS", 3, 0, false);
        declareFunction("sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical", "SKSI-DETERMINE-RELEVANT-PHYSICAL-FIELD-INDEXICALS-FOR-LOGICAL-FIELD-INDEXICAL", 3, 0, false);
        declareFunction("sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL-INTERNAL", 3, 0, false);
        declareFunction("sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL", 3, 0, false);
        declareFunction("physical_field_indexical_el_formula_p", "PHYSICAL-FIELD-INDEXICAL-EL-FORMULA-P", 1, 0, false);
        declareFunction("reified_mapping_el_formula_p", "REIFIED-MAPPING-EL-FORMULA-P", 1, 0, false);
        declareFunction("physical_field_indexical_or_reified_mapping_el_formula_p", "PHYSICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P", 1, 0, false);
        declareFunction("physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal", "PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA-INTERNAL", 2, 0, false);
        declareFunction("physical_field_logical_field_indexical_mappings_given_logical_physical_schemata", "PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 2, 0, false);
        declareFunction("determine_relevant_physical_fields_for_field_decoding", "DETERMINE-RELEVANT-PHYSICAL-FIELDS-FOR-FIELD-DECODING", 2, 0, false);
        declareFunction("determine_relevant_physical_field_indexicals_for_field_decoding", "DETERMINE-RELEVANT-PHYSICAL-FIELD-INDEXICALS-FOR-FIELD-DECODING", 2, 0, false);
        declareFunction("sksi_determine_fixed_physical_field_indexicals_internal", "SKSI-DETERMINE-FIXED-PHYSICAL-FIELD-INDEXICALS-INTERNAL", 2, 0, false);
        declareFunction("sksi_determine_fixed_physical_field_indexicals", "SKSI-DETERMINE-FIXED-PHYSICAL-FIELD-INDEXICALS", 2, 0, false);
        declareFunction("sksi_fixed_physical_field_indexicalP_internal", "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?-INTERNAL", 2, 0, false);
        declareFunction("sksi_fixed_physical_field_indexicalP", "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        declareFunction("logical_field_indexical_denoting_functions_internal", "LOGICAL-FIELD-INDEXICAL-DENOTING-FUNCTIONS-INTERNAL", 0, 0, false);
        declareFunction("logical_field_indexical_denoting_functions", "LOGICAL-FIELD-INDEXICAL-DENOTING-FUNCTIONS", 0, 0, false);
        declareFunction("logical_field_indexical_el_formula_p", "LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P", 1, 0, false);
        new sksi_infrastructure_utilities.$logical_field_indexical_el_formula_p$UnaryFunction();
        declareFunction("logical_field_indexical_or_reified_mapping_el_formula_p", "LOGICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P", 1, 0, false);
        declareFunction("logical_physical_field_mappings_given_logical_physical_schemata_internal", "LOGICAL-PHYSICAL-FIELD-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA-INTERNAL", 2, 0, false);
        declareFunction("logical_physical_field_mappings_given_logical_physical_schemata", "LOGICAL-PHYSICAL-FIELD-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 2, 0, false);
        declareFunction("physical_field_mappings_for_logical_fields", "PHYSICAL-FIELD-MAPPINGS-FOR-LOGICAL-FIELDS", 3, 1, false);
        declareFunction("physical_field_mappings_for_logical_fields_given_logical_physical_schemata", "PHYSICAL-FIELD-MAPPINGS-FOR-LOGICAL-FIELDS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 3, 0, false);
        declareFunction("expression_logical_fields", "EXPRESSION-LOGICAL-FIELDS", 1, 0, false);
        declareFunction("expression_logical_field_indexicals", "EXPRESSION-LOGICAL-FIELD-INDEXICALS", 1, 2, false);
        declareFunction("expression_logical_field_indexicals_memoized_internal", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("expression_logical_field_indexicals_memoized", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-MEMOIZED", 2, 0, false);
        declareFunction("expression_logical_field_indexicals_int", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-INT", 2, 0, false);
        declareFunction("expression_logical_field_indexicals_ordered", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-ORDERED", 1, 1, false);
        declareFunction("expression_logical_fields_for_indexicals", "EXPRESSION-LOGICAL-FIELDS-FOR-INDEXICALS", 1, 0, false);
        declareFunction("sksi_get_code_mapping_relations_for_logical_field_predicate_internal", "SKSI-GET-CODE-MAPPING-RELATIONS-FOR-LOGICAL-FIELD-PREDICATE-INTERNAL", 3, 1, false);
        declareFunction("sksi_get_code_mapping_relations_for_logical_field_predicate", "SKSI-GET-CODE-MAPPING-RELATIONS-FOR-LOGICAL-FIELD-PREDICATE", 3, 1, false);
        declareFunction("sk_source_accessibleP", "SK-SOURCE-ACCESSIBLE?", 1, 1, false);
        declareFunction("db_sk_source_accessibleP", "DB-SK-SOURCE-ACCESSIBLE?", 1, 0, false);
        declareFunction("web_page_sk_source_accessibleP", "WEB-PAGE-SK-SOURCE-ACCESSIBLE?", 1, 0, false);
        declareFunction("fht_sk_source_accessibleP", "FHT-SK-SOURCE-ACCESSIBLE?", 1, 0, false);
        declareFunction("corba_sk_source_accessibleP", "CORBA-SK-SOURCE-ACCESSIBLE?", 1, 0, false);
        declareFunction("sk_source_registeredP", "SK-SOURCE-REGISTERED?", 1, 1, false);
        declareFunction("sk_source_registeredP_int", "SK-SOURCE-REGISTERED?-INT", 1, 0, false);
        declareFunction("sk_source_queryableP", "SK-SOURCE-QUERYABLE?", 1, 1, false);
        declareFunction("set_external_sources_activated_in_image", "SET-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 1, 0, false);
        declareFunction("external_sources_activated_in_image", "EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false);
        declareFunction("list_of_external_sources_activated_in_image", "LIST-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false);
        declareFunction("some_external_source_activated_in_imageP", "SOME-EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?", 0, 0, false);
        declareFunction("number_of_external_sources_activated_in_image", "NUMBER-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false);
        declareFunction("external_source_activated_in_imageP", "EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?", 1, 0, false);
        declareFunction("clear_external_sources_activated_in_image", "CLEAR-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false);
        declareFunction("add_to_external_sources_activated_in_image", "ADD-TO-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 1, 1, false);
        declareFunction("remove_from_external_sources_activated_in_image", "REMOVE-FROM-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 1, 1, false);
        declareFunction("disjoint_schemasP", "DISJOINT-SCHEMAS?", 2, 1, false);
        declareFunction("disjoint_schemas_memoize", "DISJOINT-SCHEMAS-MEMOIZE", 2, 0, false);
        declareFunction("disjoint_schemas_memoized_int_internal", "DISJOINT-SCHEMAS-MEMOIZED-INT-INTERNAL", 3, 0, false);
        declareFunction("disjoint_schemas_memoized_int", "DISJOINT-SCHEMAS-MEMOIZED-INT", 3, 0, false);
        declareFunction("disjoint_schemas_regular", "DISJOINT-SCHEMAS-REGULAR", 2, 0, false);
        declareFunction("all_disjoint_schemas", "ALL-DISJOINT-SCHEMAS", 1, 1, false);
        declareFunction("all_disjoint_schemas_int_internal", "ALL-DISJOINT-SCHEMAS-INT-INTERNAL", 2, 0, false);
        declareFunction("all_disjoint_schemas_int", "ALL-DISJOINT-SCHEMAS-INT", 2, 0, false);
        declareFunction("all_joinable_object_defining_schemas", "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS", 1, 1, false);
        declareFunction("all_joinable_object_defining_schemas_int_internal", "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS-INT-INTERNAL", 2, 0, false);
        declareFunction("all_joinable_object_defining_schemas_int", "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS-INT", 2, 0, false);
        declareFunction("sksi_determine_relevant_object_defining_schemas", "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS", 3, 0, false);
        declareFunction("sksi_determine_relevant_object_defining_schemas_memoized_internal", "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS-MEMOIZED-INTERNAL", 4, 0, false);
        declareFunction("sksi_determine_relevant_object_defining_schemas_memoized", "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS-MEMOIZED", 4, 0, false);
        declareFunction("schema_object_naut_p", "SCHEMA-OBJECT-NAUT-P", 1, 0, false);
        declareFunction("schema_object_id_naut_p", "SCHEMA-OBJECT-ID-NAUT-P", 1, 0, false);
        declareFunction("source_schema_object_fn_expression_possibly_definedP", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED?", 1, 0, false);
        declareFunction("source_schema_object_fn_expression_possibly_defined", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED", 1, 0, false);
        declareFunction("source_schema_object_fn_expression_undefinedP", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED?", 1, 0, false);
        declareFunction("source_schema_object_fn_expression_undefined", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED", 1, 0, false);
        declareFunction("source_schema_object_fn_expression_undefined_int", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED-INT", 1, 0, false);
        declareFunction("source_schema_object_fn_expressions_equalP", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL?", 2, 0, false);
        declareFunction("source_schema_object_fn_expressions_equal", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL", 2, 1, false);
        declareFunction("source_schema_object_fn_expressions_equal_sub_ks", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL-SUB-KS", 6, 0, false);
        declareFunction("source_schema_object_fn_expressions_equal_common_super_ks", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL-COMMON-SUPER-KS", 6, 0, false);
        declareFunction("source_schema_object_fn_equal_sk_sources", "SOURCE-SCHEMA-OBJECT-FN-EQUAL-SK-SOURCES", 1, 0, false);
        declareFunction("source_schema_object_fn_equal_expressions", "SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS", 1, 0, false);
        declareFunction("source_schema_object_fn_canonical_sks", "SOURCE-SCHEMA-OBJECT-FN-CANONICAL-SKS", 1, 0, false);
        declareFunction("source_schema_object_fn_canonical_expression", "SOURCE-SCHEMA-OBJECT-FN-CANONICAL-EXPRESSION", 1, 0, false);
        declareFunction("sks_relevant_to_ods", "SKS-RELEVANT-TO-ODS", 2, 0, false);
        declareFunction("sks_relevant_to_some_logical_fieldP", "SKS-RELEVANT-TO-SOME-LOGICAL-FIELD?", 2, 0, false);
        declareFunction("sks_relevant_to_some_logical_field", "SKS-RELEVANT-TO-SOME-LOGICAL-FIELD", 2, 0, false);
        declareFunction("sks_relevant_to_some_logical_field_int", "SKS-RELEVANT-TO-SOME-LOGICAL-FIELD-INT", 2, 0, false);
        declareFunction("sks_directly_relevant_to_some_logical_field", "SKS-DIRECTLY-RELEVANT-TO-SOME-LOGICAL-FIELD", 2, 0, false);
        declareFunction("some_logical_schema_relevant_to_some_logical_field", "SOME-LOGICAL-SCHEMA-RELEVANT-TO-SOME-LOGICAL-FIELD", 2, 0, false);
        declareFunction("sksi_supported_function_expression_p", "SKSI-SUPPORTED-FUNCTION-EXPRESSION-P", 1, 0, false);
        declareFunction("sks_to_allowed_modules_list", "SKS-TO-ALLOWED-MODULES-LIST", 1, 0, false);
        declareFunction("make_sksi_support", "MAKE-SKSI-SUPPORT", 2, 0, false);
        declareFunction("sksi_support_p", "SKSI-SUPPORT-P", 1, 0, false);
        declareFunction("hl_modules_list_to_allowed_modules_spec", "HL-MODULES-LIST-TO-ALLOWED-MODULES-SPEC", 1, 0, false);
        declareFunction("sksi_possibly_nart_el_formula_p", "SKSI-POSSIBLY-NART-EL-FORMULA-P", 1, 0, false);
        declareFunction("sksi_true_cycl_expression_p", "SKSI-TRUE-CYCL-EXPRESSION-P", 1, 0, false);
        declareFunction("code_mapping_expressionP", "CODE-MAPPING-EXPRESSION?", 1, 0, false);
        declareFunction("code_mapping_expression_schema", "CODE-MAPPING-EXPRESSION-SCHEMA", 1, 0, false);
        declareFunction("find_assertion_cycl_memoized_internal", "FIND-ASSERTION-CYCL-MEMOIZED-INTERNAL", 1, 2, false);
        declareFunction("find_assertion_cycl_memoized", "FIND-ASSERTION-CYCL-MEMOIZED", 1, 2, false);
        declareFunction("genl_predicate_memoizedP_internal", "GENL-PREDICATE-MEMOIZED?-INTERNAL", 2, 3, false);
        declareFunction("genl_predicate_memoizedP", "GENL-PREDICATE-MEMOIZED?", 2, 3, false);
        declareFunction("genl_inverse_memoizedP_internal", "GENL-INVERSE-MEMOIZED?-INTERNAL", 2, 3, false);
        declareFunction("genl_inverse_memoizedP", "GENL-INVERSE-MEMOIZED?", 2, 3, false);
        declareFunction("all_fort_instances_memoized_internal", "ALL-FORT-INSTANCES-MEMOIZED-INTERNAL", 1, 3, false);
        declareFunction("all_fort_instances_memoized", "ALL-FORT-INSTANCES-MEMOIZED", 1, 3, false);
        declareFunction("mt_relevant_to_mt_memoizedP_internal", "MT-RELEVANT-TO-MT-MEMOIZED?-INTERNAL", 2, 1, false);
        declareFunction("mt_relevant_to_mt_memoizedP", "MT-RELEVANT-TO-MT-MEMOIZED?", 2, 1, false);
        declareFunction("formula_commutative_permutations_memoized_internal", "FORMULA-COMMUTATIVE-PERMUTATIONS-MEMOIZED-INTERNAL", 2, 1, false);
        declareFunction("formula_commutative_permutations_memoized", "FORMULA-COMMUTATIVE-PERMUTATIONS-MEMOIZED", 2, 1, false);
        declareFunction("removal_ask_template_memoized_internal", "REMOVAL-ASK-TEMPLATE-MEMOIZED-INTERNAL", 2, 3, false);
        declareFunction("removal_ask_template_memoized", "REMOVAL-ASK-TEMPLATE-MEMOIZED", 2, 3, false);
        declareFunction("removal_ask_memoized_internal", "REMOVAL-ASK-MEMOIZED-INTERNAL", 1, 3, false);
        declareFunction("removal_ask_memoized", "REMOVAL-ASK-MEMOIZED", 1, 3, false);
        declareFunction("removal_ask_hl_variable_memoized_internal", "REMOVAL-ASK-HL-VARIABLE-MEMOIZED-INTERNAL", 2, 3, false);
        declareFunction("removal_ask_hl_variable_memoized", "REMOVAL-ASK-HL-VARIABLE-MEMOIZED", 2, 3, false);
        declareFunction("isa_unit_of_measureP_internal", "ISA-UNIT-OF-MEASURE?-INTERNAL", 1, 0, false);
        declareFunction("isa_unit_of_measureP", "ISA-UNIT-OF-MEASURE?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sksi_infrastructure_utilities_file_alt() {
        deflexical("*SKSI-CORE-CONSTANTS*", $list_alt0);
        deflexical("*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*", NIL != boundp($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$) ? ((SubLObject) ($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*", NIL != boundp($external_sources_activated_in_image$) ? ((SubLObject) ($external_sources_activated_in_image$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_sksi_infrastructure_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SKSI-CORE-CONSTANTS*", $list0);
            deflexical("*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*", SubLTrampolineFile.maybeDefault($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$, $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
            defparameter("*SORT-KNOWLEDGE-SOURCES-BY-DATE?*", NIL);
            deflexical("*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*", SubLTrampolineFile.maybeDefault($external_sources_activated_in_image$, $external_sources_activated_in_image$, () -> set.new_set(symbol_function(EQ), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*", NIL != boundp($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$) ? ((SubLObject) ($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*", NIL != boundp($external_sources_activated_in_image$) ? ((SubLObject) ($external_sources_activated_in_image$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_sksi_infrastructure_utilities_file_Previous() {
        deflexical("*SKSI-CORE-CONSTANTS*", $list0);
        deflexical("*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*", SubLTrampolineFile.maybeDefault($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$, $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defparameter("*SORT-KNOWLEDGE-SOURCES-BY-DATE?*", NIL);
        deflexical("*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*", SubLTrampolineFile.maybeDefault($external_sources_activated_in_image$, $external_sources_activated_in_image$, () -> set.new_set(symbol_function(EQ), UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject setup_sksi_infrastructure_utilities_file_alt() {
        declare_defglobal($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$);
        memoization_state.note_memoized_function(SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED);
        memoization_state.note_memoized_function(ALL_RELEVANT_SKSI_CONTENT_MTS_INT);
        memoization_state.note_memoized_function($sym12$ANY_SKSI_CONTENT_MT_RELEVANT__INT);
        memoization_state.note_memoized_function($sym26$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE);
        memoization_state.note_memoized_function($sym29$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY);
        memoization_state.note_memoized_function(SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS);
        memoization_state.note_memoized_function($sym31$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_);
        memoization_state.note_memoized_function(LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA);
        memoization_state.note_memoized_function(EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE);
        declare_defglobal($external_sources_activated_in_image$);
        memoization_state.note_memoized_function(DISJOINT_SCHEMAS_MEMOIZED_INT);
        memoization_state.note_memoized_function(ALL_DISJOINT_SCHEMAS_INT);
        memoization_state.note_memoized_function(ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT);
        memoization_state.note_memoized_function(SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED);
        memoization_state.note_memoized_function(FIND_ASSERTION_CYCL_MEMOIZED);
        memoization_state.note_memoized_function($sym107$GENL_PREDICATE_MEMOIZED_);
        memoization_state.note_memoized_function($sym108$GENL_INVERSE_MEMOIZED_);
        memoization_state.note_memoized_function(ALL_FORT_INSTANCES_MEMOIZED);
        memoization_state.note_memoized_function($sym110$MT_RELEVANT_TO_MT_MEMOIZED_);
        memoization_state.note_memoized_function(FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED);
        memoization_state.note_memoized_function(REMOVAL_ASK_TEMPLATE_MEMOIZED);
        memoization_state.note_memoized_function(REMOVAL_ASK_MEMOIZED);
        memoization_state.note_memoized_function(REMOVAL_ASK_HL_VARIABLE_MEMOIZED);
        memoization_state.note_memoized_function($sym115$ISA_UNIT_OF_MEASURE_);
        return NIL;
    }

    public static SubLObject setup_sksi_infrastructure_utilities_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$);
            memoization_state.note_memoized_function(SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED);
            memoization_state.note_memoized_function(ALL_RELEVANT_SKSI_CONTENT_MTS_INT);
            memoization_state.note_memoized_function($sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT);
            memoization_state.note_memoized_function($sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT);
            memoization_state.note_memoized_function($sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE);
            memoization_state.note_memoized_function($sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY);
            memoization_state.note_memoized_function(SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS);
            memoization_state.note_memoized_function($sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_);
            memoization_state.note_memoized_function(LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS);
            memoization_state.note_memoized_function(LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA);
            memoization_state.note_memoized_function(EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED);
            memoization_state.note_memoized_function(SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE);
            declare_defglobal($external_sources_activated_in_image$);
            memoization_state.note_memoized_function(DISJOINT_SCHEMAS_MEMOIZED_INT);
            memoization_state.note_memoized_function(ALL_DISJOINT_SCHEMAS_INT);
            memoization_state.note_memoized_function(ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT);
            memoization_state.note_memoized_function(SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED);
            memoization_state.note_memoized_function(FIND_ASSERTION_CYCL_MEMOIZED);
            memoization_state.note_memoized_function($sym118$GENL_PREDICATE_MEMOIZED_);
            memoization_state.note_memoized_function($sym119$GENL_INVERSE_MEMOIZED_);
            memoization_state.note_memoized_function(ALL_FORT_INSTANCES_MEMOIZED);
            memoization_state.note_memoized_function($sym121$MT_RELEVANT_TO_MT_MEMOIZED_);
            memoization_state.note_memoized_function(FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED);
            memoization_state.note_memoized_function(REMOVAL_ASK_TEMPLATE_MEMOIZED);
            memoization_state.note_memoized_function(REMOVAL_ASK_MEMOIZED);
            memoization_state.note_memoized_function(REMOVAL_ASK_HL_VARIABLE_MEMOIZED);
            memoization_state.note_memoized_function($sym126$ISA_UNIT_OF_MEASURE_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym12$ANY_SKSI_CONTENT_MT_RELEVANT__INT);
            memoization_state.note_memoized_function($sym26$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE);
            memoization_state.note_memoized_function($sym29$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY);
            memoization_state.note_memoized_function($sym31$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_);
            memoization_state.note_memoized_function($sym107$GENL_PREDICATE_MEMOIZED_);
            memoization_state.note_memoized_function($sym108$GENL_INVERSE_MEMOIZED_);
            memoization_state.note_memoized_function($sym110$MT_RELEVANT_TO_MT_MEMOIZED_);
            memoization_state.note_memoized_function($sym115$ISA_UNIT_OF_MEASURE_);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_infrastructure_utilities_file_Previous() {
        declare_defglobal($sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$);
        memoization_state.note_memoized_function(SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED);
        memoization_state.note_memoized_function(ALL_RELEVANT_SKSI_CONTENT_MTS_INT);
        memoization_state.note_memoized_function($sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT);
        memoization_state.note_memoized_function($sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT);
        memoization_state.note_memoized_function($sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE);
        memoization_state.note_memoized_function($sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY);
        memoization_state.note_memoized_function(SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS);
        memoization_state.note_memoized_function($sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_);
        memoization_state.note_memoized_function(LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS);
        memoization_state.note_memoized_function(LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA);
        memoization_state.note_memoized_function(EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE);
        declare_defglobal($external_sources_activated_in_image$);
        memoization_state.note_memoized_function(DISJOINT_SCHEMAS_MEMOIZED_INT);
        memoization_state.note_memoized_function(ALL_DISJOINT_SCHEMAS_INT);
        memoization_state.note_memoized_function(ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT);
        memoization_state.note_memoized_function(SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED);
        memoization_state.note_memoized_function(FIND_ASSERTION_CYCL_MEMOIZED);
        memoization_state.note_memoized_function($sym118$GENL_PREDICATE_MEMOIZED_);
        memoization_state.note_memoized_function($sym119$GENL_INVERSE_MEMOIZED_);
        memoization_state.note_memoized_function(ALL_FORT_INSTANCES_MEMOIZED);
        memoization_state.note_memoized_function($sym121$MT_RELEVANT_TO_MT_MEMOIZED_);
        memoization_state.note_memoized_function(FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED);
        memoization_state.note_memoized_function(REMOVAL_ASK_TEMPLATE_MEMOIZED);
        memoization_state.note_memoized_function(REMOVAL_ASK_MEMOIZED);
        memoization_state.note_memoized_function(REMOVAL_ASK_HL_VARIABLE_MEMOIZED);
        memoization_state.note_memoized_function($sym126$ISA_UNIT_OF_MEASURE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_infrastructure_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_infrastructure_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_infrastructure_utilities_file();
    }

    

    public static final class $logical_field_indexical_el_formula_p$UnaryFunction extends UnaryFunction {
        public $logical_field_indexical_el_formula_p$UnaryFunction() {
            super(extractFunctionNamed("LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return logical_field_indexical_el_formula_p(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ reader_make_constant_shell("ContentMtFn"), reader_make_constant_shell("ContentMtHeadFn"), reader_make_constant_shell("ContentMtSpindleFn"), reader_make_constant_shell("MappingMtFn"), reader_make_constant_shell("PhysicalFieldFn"), reader_make_constant_shell("ThePhysicalFieldValueFn"), reader_make_constant_shell("PFIAliasFn"), reader_make_constant_shell("PFAliasFn"), reader_make_constant_shell("LogicalFieldFn"), reader_make_constant_shell("TheLogicalFieldValueFn"), reader_make_constant_shell("LFIAliasFn"), reader_make_constant_shell("SchemaObjectFn"), reader_make_constant_shell("SchemaObjectIDFn"), reader_make_constant_shell("SourceSchemaObjectFn"), reader_make_constant_shell("SourceSchemaObjectIDFn"), reader_make_constant_shell("SchemaIndexFn"), reader_make_constant_shell("TheNextSequenceValueFn"), reader_make_constant_shell("IntegerSequenceGeneratorFn"), reader_make_constant_shell("TheCurrentSequenceValueFn"), reader_make_constant_shell("mappingMt"), reader_make_constant_shell("sksSourceDescriptionMt"), reader_make_constant_shell("sksPhysicalSchemaDescriptionMt"), reader_make_constant_shell("sksLogicalSchemaDescriptionMt"), reader_make_constant_shell("sksSchemaTranslationMt"), reader_make_constant_shell("contentMt"), reader_make_constant_shell("contentMtSpindle"), reader_make_constant_shell("contentMtHead"), reader_make_constant_shell("subKS"), reader_make_constant_shell("subKS-Direct"), reader_make_constant_shell("schemaSourceMap"), reader_make_constant_shell("physicalSchemaSourceMap"), reader_make_constant_shell("logicalSchemaSourceMap"), reader_make_constant_shell("sksIsa"), reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("portNumberForSKS"), reader_make_constant_shell("sksProxyHost"), reader_make_constant_shell("sksProxyPort"), reader_make_constant_shell("userNameForSKS"), reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("filenameForSKS"), reader_make_constant_shell("serializationTypeForSKS"), reader_make_constant_shell("keyTestFunctionForSKS"), reader_make_constant_shell("valueTestFunctionForSKS"), reader_make_constant_shell("physicalFields"), reader_make_constant_shell("physicalFieldIndexicals"), reader_make_constant_shell("enumerableSchema"), reader_make_constant_shell("schemaFieldNameList"), reader_make_constant_shell("schemaFieldList"), reader_make_constant_shell("exampleTuple"), reader_make_constant_shell("indexicalForPhysicalField"), reader_make_constant_shell("requiredFields"), reader_make_constant_shell("indexedFields"), reader_make_constant_shell("primaryKey"), reader_make_constant_shell("schemaKeys"), reader_make_constant_shell("secondaryKeys"), reader_make_constant_shell("foreignKeyMap"), reader_make_constant_shell("foreignKeyMap-Restrict"), reader_make_constant_shell("foreignKeyMap-Cascade"), reader_make_constant_shell("foreignKeyMap-SetNull"), reader_make_constant_shell("foreignKeyMap-SetDefault"), reader_make_constant_shell("nonNullFields"), reader_make_constant_shell("uniqueFieldList"), reader_make_constant_shell("schemaConstraints"), reader_make_constant_shell("defaultFieldValue"), reader_make_constant_shell("nonNullFieldList"), reader_make_constant_shell("resultSetCardinality"), reader_make_constant_shell("resultSetCardinalityWithConstraints"), reader_make_constant_shell("logicalResultSetCardinality"), reader_make_constant_shell("logicalResultSetCardinalityWRTValue"), reader_make_constant_shell("physicalFieldConversionFunction"), reader_make_constant_shell("schemaFieldsIndex"), reader_make_constant_shell("indexType"), reader_make_constant_shell("indexName"), reader_make_constant_shell("physicalFieldXPath"), reader_make_constant_shell("physicalFieldXPathString"), reader_make_constant_shell("fieldValue"), reader_make_constant_shell("fieldValueComparison"), reader_make_constant_shell("fieldValueComparison-Inverse"), reader_make_constant_shell("fieldIndexicalsEqual"), reader_make_constant_shell("fieldIndexicalsComparison"), reader_make_constant_shell("integerSequenceGeneratorName"), reader_make_constant_shell("integerSequenceGeneratorIncrementsField"), reader_make_constant_shell("logicalFields"), reader_make_constant_shell("meaningSentenceOfSchema"), reader_make_constant_shell("conditionalMeaningSentenceOfSchema"), reader_make_constant_shell("objectField"), reader_make_constant_shell("fieldIsa"), reader_make_constant_shell("fieldGenls"), reader_make_constant_shell("schemaIsa"), reader_make_constant_shell("schemaGenls"), reader_make_constant_shell("logicalSchemaKeys"), reader_make_constant_shell("indexicalForLogicalField"), reader_make_constant_shell("logicalFieldIndexicals"), reader_make_constant_shell("logicalSchemaFieldTypeList"), reader_make_constant_shell("schemaExampleSentence"), reader_make_constant_shell("schemaCompleteExtentKnown"), reader_make_constant_shell("completeObjectSchema"), reader_make_constant_shell("contentSentenceOfSchema"), reader_make_constant_shell("codeMapping"), reader_make_constant_shell("schemaFields"), reader_make_constant_shell("indexicalForField"), reader_make_constant_shell("schemaFieldIndexicals"), reader_make_constant_shell("schemaObjectID"), reader_make_constant_shell("fieldName-SKS"), reader_make_constant_shell("fieldTranslation"), reader_make_constant_shell("logicalFieldTranslation"), reader_make_constant_shell("physicalFieldTranslation"), reader_make_constant_shell("logicalFieldDecoding"), reader_make_constant_shell("logicalFieldEncoding"), reader_make_constant_shell("physicalFieldDecoding"), reader_make_constant_shell("physicalFieldEncoding"), reader_make_constant_shell("fieldDecoding"), reader_make_constant_shell("fieldEncoding"), reader_make_constant_shell("logicalPhysicalSchemaMap"), reader_make_constant_shell("calendarMonthIndex"), reader_make_constant_shell("logicalPhysicalFieldMap-DecodeClosed"), reader_make_constant_shell("logicalPhysicalFieldMap-EncodeClosed"), reader_make_constant_shell("fieldEncodingOverrideForComparisonOperatorArg"), reader_make_constant_shell("logicalPhysicalFieldMap"), reader_make_constant_shell("httpdRequestSubLParsingProgramForSKS"), reader_make_constant_shell("httpdRequestURLForSKS"), reader_make_constant_shell("httpdRequestMethodForSKS"), reader_make_constant_shell("httpdRequestSubLBooleanParsingProgramForSKS"), reader_make_constant_shell("httpdRequestUnboundOnlySubLParsingProgramForSKS"), reader_make_constant_shell("httpdRequestQueryTemplateForSKS"), reader_make_constant_shell("rowInSourceClaims"), reader_make_constant_shell("sourceClaims"), reader_make_constant_shell("meaningSentencePredicateForSource"), reader_make_constant_shell("meaningSentencePredicateForSchema"), reader_make_constant_shell("sksRepresentationComplete"), reader_make_constant_shell("rowCount-SKS"), reader_make_constant_shell("sourceAssumptions"), reader_make_constant_shell("sksModifiable"), reader_make_constant_shell("objectFieldTypeForSource"), reader_make_constant_shell("logicalFieldTypeForSource"), reader_make_constant_shell("sourceSchemaObjectID"), reader_make_constant_shell("schemaRepresentationComplete"), reader_make_constant_shell("sksModuleTypeDirection"), reader_make_constant_shell("SKSIPhysicalSchemaConstraintPredicate"), reader_make_constant_shell("PhysicalFieldIndexical"), reader_make_constant_shell("SKSIPhysicalSchemaDescriptionMicrotheory"), reader_make_constant_shell("PhysicalField"), reader_make_constant_shell("IndexDataStructure"), reader_make_constant_shell("IndexDataStructureType"), reader_make_constant_shell("IntegerSequenceGenerator"), reader_make_constant_shell("LogicalSchema"), reader_make_constant_shell("LogicalFieldIndexical"), reader_make_constant_shell("SKSILogicalSchemaDescriptionMicrotheory"), reader_make_constant_shell("LogicalField"), reader_make_constant_shell("ObjectDefiningSchema"), reader_make_constant_shell("ReifiedMapping"), reader_make_constant_shell("Schema-LogicalOrPhysical"), reader_make_constant_shell("SchemaType-LogicalOrPhysical"), reader_make_constant_shell("FieldIndexical-LogicalOrPhysical"), reader_make_constant_shell("SKSISchemaDescriptionMicrotheory"), reader_make_constant_shell("Field-LogicalOrPhysical"), reader_make_constant_shell("FieldType-LogicalOrPhysical"), reader_make_constant_shell("SKSISchemaTranslationMicrotheory"), reader_make_constant_shell("HTTP-RequestMethod"), reader_make_constant_shell("StructuredKnowledgeSource"), reader_make_constant_shell("StructuredKnowledgeSource-Atomic"), reader_make_constant_shell("StructuredKnowledgeSource-Complex"), reader_make_constant_shell("SKSIContentMicrotheorySpindle"), reader_make_constant_shell("SKSISupportedStructuredKnowledgeSourceType"), reader_make_constant_shell("SKSISourceDescriptionMicrotheory"), reader_make_constant_shell("SKSIMappingMicrotheory"), reader_make_constant_shell("SKSISupportedDatabaseServerProgram"), reader_make_constant_shell("SKSMereologyType"), reader_make_constant_shell("StructuredKnowledgeSource-TopLevel"), reader_make_constant_shell("SKSIContentMicrotheory"), reader_make_constant_shell("SKSIExternalTermDenotingFunction"), reader_make_constant_shell("SKSIHLModule"), reader_make_constant_shell("SKSIHLModuleType"), reader_make_constant_shell("SKSIRemovalModule"), reader_make_constant_shell("SKSISingleLiteralRemovalModule"), reader_make_constant_shell("SKSIMultiLiteralRemovalModule"), reader_make_constant_shell("SKSIStorageModule"), reader_make_constant_shell("SKSISupportedComparisonPredicate"), reader_make_constant_shell("SKSISupportedOperator"), reader_make_constant_shell("SKSISupportedFunction") });

    public static final SubLSymbol $kw8$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym12$ANY_SKSI_CONTENT_MT_RELEVANT__INT = makeSymbol("ANY-SKSI-CONTENT-MT-RELEVANT?-INT");

    static private final SubLString $str_alt18$An_external_knowledge_source_with = makeString("An external knowledge source without any description.");

    static private final SubLSymbol $sym22$SK_SOURCE_SUB_KS_IN_ANY_MT_ = makeSymbol("SK-SOURCE-SUB-KS-IN-ANY-MT?");

    static private final SubLSymbol $sym26$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE = makeSymbol("SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL");

    static private final SubLSymbol $sym29$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY = makeSymbol("PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA");

    static private final SubLSymbol $sym31$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_ = makeSymbol("SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?");

    static private final SubLSymbol $sym38$PREDICATE_ = makeSymbol("PREDICATE?");

    public static final SubLObject $const41$CommonObjectRequestBrokerArchitec = reader_make_constant_shell("CommonObjectRequestBrokerArchitecture");

    static private final SubLString $str_alt44$Unknown_access_path_type__A_for__ = makeString("Unknown access path type ~A for ~A.");

    static private final SubLString $str_alt46$The_following_error_occurred_whil = makeString("The following error occurred while trying to open/close the kowledge source ~A: ~%~A");

    public static final SubLSymbol $kw57$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    public static final SubLSymbol $kw58$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    static private final SubLString $str_alt60$The_following_problem_was_encount = makeString("The following problem was encountered while trying to access the knowledge source ~A :~%~A");

    static private final SubLString $str_alt61$_A = makeString("~A");

    static private final SubLString $str_alt73$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt78$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt79$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt80 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt81$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt88 = list(makeSymbol("SKS"), makeSymbol("ODS"), makeSymbol("SUB-EXPRESSION"));

    static private final SubLList $list_alt91 = list(makeSymbol("SKS1"), makeSymbol("ODS1"), makeSymbol("SUB-EXPRESSION1"));

    static private final SubLList $list_alt92 = list(makeSymbol("SKS2"), makeSymbol("ODS2"), makeSymbol("SUB-EXPRESSION2"));

    static private final SubLList $list_alt103 = list(list(makeKeyword("AND"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL"))), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL-CONJUNCTIVE")))));

    static private final SubLSymbol $sym107$GENL_PREDICATE_MEMOIZED_ = makeSymbol("GENL-PREDICATE-MEMOIZED?");

    static private final SubLSymbol $sym108$GENL_INVERSE_MEMOIZED_ = makeSymbol("GENL-INVERSE-MEMOIZED?");

    static private final SubLSymbol $sym110$MT_RELEVANT_TO_MT_MEMOIZED_ = makeSymbol("MT-RELEVANT-TO-MT-MEMOIZED?");

    static private final SubLSymbol $sym115$ISA_UNIT_OF_MEASURE_ = makeSymbol("ISA-UNIT-OF-MEASURE?");
}

/**
 * Total time: 2685 ms
 */
