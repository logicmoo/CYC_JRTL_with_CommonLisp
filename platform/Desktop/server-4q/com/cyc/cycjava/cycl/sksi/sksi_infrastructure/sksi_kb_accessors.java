package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_kb_accessors extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors";
    public static final String myFingerPrint = "f475944d95de66268df05b3a8cccaca85c1511aa02d7cfb9f9c6512adb0d7ee9";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47095L)
    private static SubLSymbol $sksi_default_field_value$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
    private static SubLSymbol $sksi_content_mts_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71640L)
    public static SubLSymbol $use_legacy_simple_table_implementationP$;
    private static final SubLObject $const0$contentMt;
    private static final SubLSymbol $kw1$TRUE;
    private static final SubLSymbol $sym2$CONTENT_MT_SK_SOURCE;
    private static final SubLObject $const3$mtSpindleMember;
    private static final SubLObject $const4$StructuredKnowledgeSource;
    private static final SubLSymbol $sym5$SK_SOURCE_IN_ANY_MT_P;
    private static final SubLObject $const6$sksModifiable;
    private static final SubLSymbol $sym7$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const8$EverythingPSC;
    private static final SubLObject $const9$codeMapping;
    private static final SubLSymbol $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB;
    private static final SubLSymbol $sym11$SK_SOURCE_CONTENT_MT;
    private static final SubLObject $const12$contentMtHead;
    private static final SubLSymbol $sym13$SK_SOURCE_CONTENT_MT_HEAD;
    private static final SubLSymbol $sym14$SK_SOURCE_MAPPING_MT;
    private static final SubLObject $const15$mappingMt;
    private static final SubLObject $const16$sksLogicalSchemaDescriptionMt;
    private static final SubLObject $const17$sksSourceDescriptionMt;
    private static final SubLObject $const18$sksSchemaTranslationMt;
    private static final SubLObject $const19$rowCount_SKS;
    private static final SubLObject $const20$structuredKnowledgeSourceName;
    private static final SubLSymbol $sym21$_EXIT;
    private static final SubLSymbol $sym22$SK_SOURCE_NAMESPACE;
    private static final SubLString $str23$Multiple_namespaces_for__A___S__S;
    private static final SubLObject $const24$structuredKnowledgeSourceNamespac;
    private static final SubLSymbol $sym25$SK_SOURCE_BY_SKS_NAME;
    private static final SubLSymbol $sym26$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw27$GAF;
    private static final SubLObject $const28$physicalSchemaSourceMap;
    private static final SubLSymbol $sym29$ASSERTION_FORMULA;
    private static final SubLSymbol $sym30$KBEQ;
    private static final SubLObject $const31$subKS_Direct;
    private static final SubLObject $const32$meaningSentencePredicateForSource;
    private static final SubLObject $const33$meaningSentencePredicateForSchema;
    private static final SubLSymbol $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB;
    private static final SubLObject $const35$SKSISingleLiteralRemovalModule;
    private static final SubLSymbol $kw36$BACKWARD;
    private static final SubLSymbol $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB;
    private static final SubLObject $const38$SKSIMultiLiteralRemovalModule;
    private static final SubLSymbol $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB;
    private static final SubLObject $const40$SKSIStorageModule;
    private static final SubLSymbol $kw41$FORWARD;
    private static final SubLObject $const42$sksModuleTypeDirection;
    private static final SubLObject $const43$Backward_AssertionDirection;
    private static final SubLObject $const44$Forward_AssertionDirection;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw48$DONE;
    private static final SubLSymbol $sym49$GAF;
    private static final SubLSymbol $sym50$SKSI_DO_GAF_ARG_INDEX_TRUE;
    private static final SubLSymbol $kw51$PREDICATE;
    private static final SubLSymbol $kw52$INDEX;
    private static final SubLSymbol $sym53$CLET;
    private static final SubLSymbol $sym54$GAF_ARG2;
    private static final SubLSymbol $sym55$SK_SOURCE_SUB_KS_CLOSURE;
    private static final SubLSymbol $sym56$SK_SOURCE_SUB_KS_MIN;
    private static final SubLSymbol $sym57$SK_SOURCE_SUPER_KS_CLOSURE;
    private static final SubLSymbol $sym58$SK_SOURCE_SUPER_KS_MAX;
    private static final SubLSymbol $sym59$SK_SOURCE_PROPER_SUPER_KS_;
    private static final SubLSymbol $sym60$IMMEDIATE_GENL_KS;
    private static final SubLSymbol $sym61$LOGICAL_SCHEMA_SOURCES;
    private static final SubLSymbol $sym62$SINGLETON_;
    private static final SubLObject $const63$schemaRepresentationComplete;
    private static final SubLSymbol $sym64$ISA_PHYSICAL_SCHEMA_;
    private static final SubLObject $const65$PhysicalSchema;
    private static final SubLInteger $int66$50;
    private static final SubLSymbol $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED;
    private static final SubLSymbol $sym68$PHYSICAL_SCHEMA_FIELDS;
    private static final SubLObject $const69$physicalFields;
    private static final SubLSymbol $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY;
    private static final SubLObject $const71$primaryKey;
    private static final SubLSymbol $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT;
    private static final SubLObject $const73$suppressConvertingComparisonLiter;
    private static final SubLObject $const74$foreignKeyMap;
    private static final SubLObject $const75$foreignKeyMap_Restrict;
    private static final SubLObject $const76$foreignKeyMap_Cascade;
    private static final SubLObject $const77$foreignKeyMap_SetNull;
    private static final SubLObject $const78$foreignKeyMap_SetDefault;
    private static final SubLObject $const79$uniqueFieldList;
    private static final SubLObject $const80$requiredFields;
    private static final SubLSymbol $sym81$PHYSICAL_FIELD_NAME;
    private static final SubLObject $const82$indexedFields;
    private static final SubLSymbol $sym83$PHYSICAL_SCHEMA_ENUMERABLE_;
    private static final SubLObject $const84$enumerableSchema;
    private static final SubLSymbol $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS;
    private static final SubLObject $const86$resultSetCardinality;
    private static final SubLSymbol $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS;
    private static final SubLObject $const88$resultSetCardinalityWithConstrain;
    private static final SubLObject $const89$logicalPhysicalSchemaMap;
    private static final SubLObject $const90$exampleTuple;
    private static final SubLObject $const91$fieldEncoding;
    private static final SubLSymbol $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST;
    private static final SubLObject $const93$schemaFieldNameList;
    private static final SubLSymbol $sym94$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA;
    private static final SubLSymbol $sym95$LOGICAL_SCHEMA_FIELDS;
    private static final SubLObject $const96$logicalFields;
    private static final SubLSymbol $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS;
    private static final SubLObject $const98$logicalFieldIndexicals;
    private static final SubLSymbol $kw99$DEPTH;
    private static final SubLSymbol $kw100$STACK;
    private static final SubLSymbol $kw101$QUEUE;
    private static final SubLSymbol $sym102$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw103$ERROR;
    private static final SubLString $str104$_A_is_not_a__A;
    private static final SubLSymbol $sym105$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw106$CERROR;
    private static final SubLString $str107$continue_anyway;
    private static final SubLSymbol $kw108$WARN;
    private static final SubLString $str109$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const110$genlPreds;
    private static final SubLString $str111$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str112$attempting_to_bind_direction_link;
    private static final SubLString $str113$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const114$schemaExampleSentence;
    private static final SubLObject $const115$logicalSchemaKeys;
    private static final SubLSymbol $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS;
    private static final SubLObject $const117$logicalResultSetCardinality;
    private static final SubLSymbol $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS;
    private static final SubLObject $const119$logicalResultSetCardinalityWRTVal;
    private static final SubLObject $const120$fieldDecoding;
    private static final SubLObject $const121$logicalSchemaSourceMap;
    private static final SubLSymbol $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED;
    private static final SubLObject $const123$schemaCompleteExtentKnown;
    private static final SubLObject $const124$contentSentenceOfSchema;
    private static final SubLSymbol $sym125$LOGICAL_FIELD_P_MEMOIZED;
    private static final SubLObject $const126$LogicalFieldFn;
    private static final SubLObject $const127$LogicalField;
    private static final SubLObject $const128$LFAliasFn;
    private static final SubLSymbol $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED;
    private static final SubLObject $const130$TheLogicalFieldValueFn;
    private static final SubLObject $const131$LFIAliasFn;
    private static final SubLSymbol $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA;
    private static final SubLSymbol $sym133$ISA_LOGICAL_SCHEMA_;
    private static final SubLObject $const134$LogicalSchema;
    private static final SubLSymbol $sym135$IS_FORT_A_REIFIED_MAPPING_;
    private static final SubLObject $const136$ReifiedMapping;
    private static final SubLSymbol $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA;
    private static final SubLList $list138;
    private static final SubLObject $const139$SchemaObjectFn;
    private static final SubLSymbol $sym140$SCHEMA_ISA;
    private static final SubLObject $const141$schemaIsa;
    private static final SubLObject $const142$objectField;
    private static final SubLObject $const143$SchemaObjectIDFn;
    private static final SubLObject $const144$SourceSchemaObjectIDFn;
    private static final SubLObject $const145$SourceSchemaObjectFn;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym148$FORMULA_ARGS;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT;
    private static final SubLObject $const151$indexicalForPhysicalField;
    private static final SubLSymbol $sym152$INDEXICAL_FOR_PHYSICAL_FIELD;
    private static final SubLObject $const153$nonNullFields;
    private static final SubLSymbol $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS;
    private static final SubLSymbol $kw155$NULL;
    private static final SubLSymbol $sym156$PHYSICAL_FIELD_DEFAULT_VALUE;
    private static final SubLObject $const157$defaultFieldValue;
    private static final SubLObject $const158$ISNull;
    private static final SubLObject $const159$PhysicalFieldFn;
    private static final SubLSymbol $sym160$PHYSICAL_FIELD_SCHEMA;
    private static final SubLSymbol $sym161$PHYSICAL_FIELD_SK_SOURCE;
    private static final SubLSymbol $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME;
    private static final SubLSymbol $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE;
    private static final SubLSymbol $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE;
    private static final SubLSymbol $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME;
    private static final SubLSymbol $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE;
    private static final SubLSymbol $sym167$PHYSICAL_FIELD_VIRTUAL_;
    private static final SubLObject $const168$VirtualPhysicalFieldFn;
    private static final SubLObject $const169$virtualPhysicalFields;
    private static final SubLObject $const170$PFAliasFn;
    private static final SubLObject $const171$ThePhysicalFieldValueFn;
    private static final SubLObject $const172$PFIAliasFn;
    private static final SubLSymbol $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME;
    private static final SubLSymbol $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES;
    private static final SubLSymbol $sym175$THIRD;
    private static final SubLSymbol $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD;
    private static final SubLObject $const177$integerSequenceGeneratorIncrement;
    private static final SubLSymbol $sym178$INTEGER_SEQUENCE_GENERATOR_NAME;
    private static final SubLObject $const179$integerSequenceGeneratorName;
    private static final SubLSymbol $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_;
    private static final SubLObject $const181$TheNextSequenceValueFn;
    private static final SubLString $str182$logical_field_indexical_without_c;
    private static final SubLSymbol $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT;
    private static final SubLObject $const184$indexicalForLogicalField;
    private static final SubLSymbol $sym185$INDEXICAL_FOR_LOGICAL_FIELD;
    private static final SubLSymbol $sym186$LOGICAL_FIELD_FOR_INDEXICAL;
    private static final SubLSymbol $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE;
    private static final SubLSymbol $sym188$RELEVANT_PRED_IS_EQ;
    private static final SubLObject $const189$joinable;
    private static final SubLSymbol $sym190$LOGICAL_FIELDS_JOINABLE_;
    private static final SubLObject $const191$fieldIsa;
    private static final SubLObject $const192$logicalSchemaFieldTypeList;
    private static final SubLObject $const193$logicalFieldMapping;
    private static final SubLSymbol $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT;
    private static final SubLObject $const195$logicalPhysicalFieldMap;
    private static final SubLObject $const196$logicalPhysicalFieldMap_DecodeClo;
    private static final SubLObject $const197$logicalPhysicalFieldMap_EncodeClo;
    private static final SubLObject $const198$fieldDataType;
    private static final SubLObject $const199$SQLBoolean;
    private static final SubLObject $const200$programDataTypeNameString;
    private static final SubLObject $const201$schemaFieldsIndex;
    private static final SubLObject $const202$indexType;
    private static final SubLObject $const203$indexName;
    private static final SubLObject $const204$programIndexTypeNameString;
    private static final SubLSymbol $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR;
    private static final SubLObject $const206$cyclOperatorToCSQLOperator;
    private static final SubLSymbol $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR;
    private static final SubLSymbol $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR;
    private static final SubLObject $const209$csqlOperatorToSQLOperator;
    private static final SubLSymbol $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX;
    private static final SubLObject $const211$SQLOperatorSyntax_Prefix;
    private static final SubLObject $const212$SQLOperatorSyntax_Infix;
    private static final SubLObject $const213$SQLOperatorSyntax_Postfix;
    private static final SubLObject $const214$SQLOperatorSyntax_InverseInfix;
    private static final SubLObject $const215$SQLFunctionSyntax;
    private static final SubLSymbol $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF;
    private static final SubLObject $const217$csqlToSQLTranslationFormat;
    private static final SubLObject $const218$SKSIMappingMicrotheory;
    private static final SubLSymbol $sym219$SKSI_CONTENT_MT_P;
    private static final SubLSymbol $sym220$SKSI_CONTENT_MTS;
    private static final SubLObject $const221$SKSIContentMicrotheory;
    private static final SubLSymbol $sym222$_SKSI_CONTENT_MTS_CACHING_STATE_;
    private static final SubLSymbol $sym223$CLEAR_SKSI_CONTENT_MTS;
    private static final SubLObject $const224$sksRepresentationComplete;
    private static final SubLSymbol $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P;
    private static final SubLObject $const226$SKSISupportedDatabaseServerProgra;
    private static final SubLObject $const227$defaultSKSForDatabaseServerProgra;
    private static final SubLString $str228$Primary_keys_for__S_in__S_were_no;
    private static final SubLString $str229$Primary_keys_for__S_in__S_was_not;
    private static final SubLSymbol $kw230$IGNORE;
    private static final SubLObject $const231$columnInDBTableNamed;
    private static final SubLObject $const232$fieldName_SKS;
    private static final SubLString $str233$Could_not_determine_the_column_na;
    private static final SubLString $str234$Could_not_find_the_primary_key_co;
    private static final SubLObject $const235$tableFieldNameList;
    private static final SubLObject $const236$tablePrimaryKey;
    private static final SubLString $str237$Could_not_get_the___tableFieldNam;
    private static final SubLString $str238$Could_not_determine_the___tablePr;
    private static final SubLSymbol $sym239$RELEVANT_MT_IS_GENL_MT;
    private static final SubLString $str240$Could_not_find_a_physical_schema_;
    private static final SubLString $str241$Could_not_get_the___schemaFieldNa;
    private static final SubLString $str242$Could_not_determine_the___primary;
    private static final SubLSymbol $kw243$TABLE;
    private static final SubLObject $const244$assertedSentence;
    private static final SubLObject $const245$tableInDBNamed;
    private static final SubLSymbol $kw246$TABLE_NAME;
    private static final SubLList $list247;
    private static final SubLSymbol $sym248$NON_EMPTY_STRING_;
    private static final SubLString $str249$_A___A;
    private static final SubLSymbol $sym250$FORT_P;
    private static final SubLSymbol $kw251$DEFAULT;
    private static final SubLSymbol $sym252$HLMT_P;
    private static final SubLList $list253;
    private static final SubLString $str254$_;
    private static final SubLSymbol $sym255$ASSERTION_P;
    private static final SubLObject $const256$CycKBSubsetCollection;
    private static final SubLObject $const257$BookkeepingMt;
    private static final SubLString $str258$No___CycKBSubsetCollections_found;
    private static final SubLObject $const259$quotedIsa;
    private static final SubLObject $const260$temporalFieldNullMapsTo;
    private static final SubLSymbol $kw261$UNREFORMULATABLE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1173L)
    public static SubLObject content_mt_sk_source_gaf(final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_gaf(mt, sksi_kb_accessors.$const0$contentMt, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1374L)
    public static SubLObject content_mt_sk_source_internal(final SubLObject mt, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLObject gaf = content_mt_sk_source_gaf(mt);
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            return assertions_high.gaf_arg1(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1374L)
    public static SubLObject content_mt_sk_source(final SubLObject mt, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return content_mt_sk_source_internal(mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym2$CONTENT_MT_SK_SOURCE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym2$CONTENT_MT_SK_SOURCE, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym2$CONTENT_MT_SK_SOURCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (mt.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(content_mt_sk_source_internal(mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(mt, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1622L)
    public static SubLObject content_mt_spindle_member_p(final SubLObject content_mt) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(content_mt, sksi_kb_accessors.$const3$mtSpindleMember, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1754L)
    public static SubLObject sk_source_p(final SubLObject v_object) {
        return isa.isaP(v_object, sksi_kb_accessors.$const4$StructuredKnowledgeSource, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1958L)
    public static SubLObject sk_source_in_any_mt_p_internal(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_kb_accessors.$const4$StructuredKnowledgeSource);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1958L)
    public static SubLObject sk_source_in_any_mt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_in_any_mt_p_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym5$SK_SOURCE_IN_ANY_MT_P, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym5$SK_SOURCE_IN_ANY_MT_P, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym5$SK_SOURCE_IN_ANY_MT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_in_any_mt_p_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2102L)
    public static SubLObject modifiable_sk_source_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(v_object, sksi_kb_accessors.$const6$sksModifiable, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2216L)
    public static SubLObject modifiable_sk_source_in_any_mt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject modifiableP = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            modifiableP = modifiable_sk_source_p(v_object);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return modifiableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2403L)
    public static SubLObject code_mapping_knowledge_sourceP(final SubLObject sk_source) {
        return meaning_sentence_predicate_for_sk_sourceP(sksi_kb_accessors.$const9$codeMapping, sk_source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2542L)
    public static SubLObject get_sk_source_property_from_kb_internal(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject note_csql_supportP, SubLObject check_arg, SubLObject check_argnum) {
        if (index_argnum == sksi_kb_accessors.UNPROVIDED) {
            index_argnum = (SubLObject)sksi_kb_accessors.ONE_INTEGER;
        }
        if (gather_argnum == sksi_kb_accessors.UNPROVIDED) {
            gather_argnum = (SubLObject)sksi_kb_accessors.TWO_INTEGER;
        }
        if (note_csql_supportP == sksi_kb_accessors.UNPROVIDED) {
            note_csql_supportP = (SubLObject)sksi_kb_accessors.T;
        }
        if (check_arg == sksi_kb_accessors.UNPROVIDED) {
            check_arg = (SubLObject)sksi_kb_accessors.NIL;
        }
        if (check_argnum == sksi_kb_accessors.UNPROVIDED) {
            check_argnum = (SubLObject)sksi_kb_accessors.NIL;
        }
        SubLObject sk_source_to_look;
        SubLObject spec_preds;
        SubLObject gaf;
        for (sk_source_to_look = sk_source, spec_preds = (SubLObject)ConsesLow.cons(pred, genl_predicates.spec_predicates(pred, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED)), gaf = get_sk_source_property_from_kb_int(sk_source_to_look, spec_preds, index_argnum, check_arg, check_argnum); sksi_kb_accessors.NIL == gaf && sksi_kb_accessors.NIL != sk_source_to_look; gaf = get_sk_source_property_from_kb_int(sk_source_to_look, spec_preds, index_argnum, check_arg, check_argnum)) {
            sk_source_to_look = immediate_genl_ks(sk_source_to_look);
            if (sksi_kb_accessors.NIL != forts.fort_p(sk_source_to_look)) {}
        }
        if (sksi_kb_accessors.NIL != gaf) {
            if (sksi_kb_accessors.NIL != note_csql_supportP) {
                sksi_hl_support_utilities.note_csql_support(gaf);
            }
            return assertions_high.gaf_arg(gaf, gather_argnum);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2542L)
    public static SubLObject get_sk_source_property_from_kb(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject note_csql_supportP, SubLObject check_arg, SubLObject check_argnum) {
        if (index_argnum == sksi_kb_accessors.UNPROVIDED) {
            index_argnum = (SubLObject)sksi_kb_accessors.ONE_INTEGER;
        }
        if (gather_argnum == sksi_kb_accessors.UNPROVIDED) {
            gather_argnum = (SubLObject)sksi_kb_accessors.TWO_INTEGER;
        }
        if (note_csql_supportP == sksi_kb_accessors.UNPROVIDED) {
            note_csql_supportP = (SubLObject)sksi_kb_accessors.T;
        }
        if (check_arg == sksi_kb_accessors.UNPROVIDED) {
            check_arg = (SubLObject)sksi_kb_accessors.NIL;
        }
        if (check_argnum == sksi_kb_accessors.UNPROVIDED) {
            check_argnum = (SubLObject)sksi_kb_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return get_sk_source_property_from_kb_internal(sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym10$GET_SK_SOURCE_PROPERTY_FROM_KB, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym10$GET_SK_SOURCE_PROPERTY_FROM_KB, (SubLObject)sksi_kb_accessors.SEVEN_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym10$GET_SK_SOURCE_PROPERTY_FROM_KB, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sk_source.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (index_argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (gather_argnum.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (note_csql_supportP.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (check_arg.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && check_argnum.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_sk_source_property_from_kb_internal(sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 3676L)
    public static SubLObject get_sk_source_property_from_kb_int(final SubLObject sk_source, final SubLObject preds, final SubLObject index_argnum, final SubLObject check_arg, final SubLObject check_argnum) {
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == gaf) {
            SubLObject csome_list_var = preds;
            SubLObject pred = (SubLObject)sksi_kb_accessors.NIL;
            pred = csome_list_var.first();
            while (sksi_kb_accessors.NIL == gaf && sksi_kb_accessors.NIL != csome_list_var) {
                if (sksi_kb_accessors.NIL != check_argnum && sksi_kb_accessors.NIL != check_arg) {
                    gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(pred, sk_source, check_arg, index_argnum, check_argnum, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
                }
                else {
                    gaf = kb_mapping_utilities.fpred_value_gaf(sk_source, pred, index_argnum, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
            }
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4046L)
    public static SubLObject sk_source_content_mt_gaf(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value_gaf(sk_source, sksi_kb_accessors.$const0$contentMt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4159L)
    public static SubLObject sk_source_content_mt_internal(final SubLObject sk_source) {
        final SubLObject gaf = sk_source_content_mt_gaf(sk_source);
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            return assertions_high.gaf_arg2(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4159L)
    public static SubLObject sk_source_content_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_content_mt_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym11$SK_SOURCE_CONTENT_MT, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym11$SK_SOURCE_CONTENT_MT, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym11$SK_SOURCE_CONTENT_MT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_content_mt_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4374L)
    public static SubLObject sk_source_content_mt_in_any_mt(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value_in_any_mt(sk_source, sksi_kb_accessors.$const0$contentMt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4501L)
    public static SubLObject sk_source_content_mt_head_gaf(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value_gaf(sk_source, sksi_kb_accessors.$const12$contentMtHead, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4623L)
    public static SubLObject sk_source_content_mt_head_internal(final SubLObject sk_source) {
        final SubLObject gaf = sk_source_content_mt_head_gaf(sk_source);
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            return assertions_high.gaf_arg2(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4623L)
    public static SubLObject sk_source_content_mt_head(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_content_mt_head_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym13$SK_SOURCE_CONTENT_MT_HEAD, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym13$SK_SOURCE_CONTENT_MT_HEAD, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym13$SK_SOURCE_CONTENT_MT_HEAD, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_content_mt_head_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4846L)
    public static SubLObject sk_source_content_mt_head_in_any_mt(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value_in_any_mt(sk_source, sksi_kb_accessors.$const12$contentMtHead, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4982L)
    public static SubLObject sk_source_mapping_mt_internal(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            mt = get_sk_source_property_from_kb(sk_source, sksi_kb_accessors.$const15$mappingMt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4982L)
    public static SubLObject sk_source_mapping_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_mapping_mt_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym14$SK_SOURCE_MAPPING_MT, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym14$SK_SOURCE_MAPPING_MT, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym14$SK_SOURCE_MAPPING_MT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_mapping_mt_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 5332L)
    public static SubLObject sk_source_logical_schema_description_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            mt = get_sk_source_property_from_kb(sk_source, sksi_kb_accessors.$const16$sksLogicalSchemaDescriptionMt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 5748L)
    public static SubLObject logical_schema_description_mt_sk_source_in_any_mt(final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_any_mt(mt, sksi_kb_accessors.$const16$sksLogicalSchemaDescriptionMt, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 5900L)
    public static SubLObject sk_source_source_description_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            mt = get_sk_source_property_from_kb(sk_source, sksi_kb_accessors.$const17$sksSourceDescriptionMt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6280L)
    public static SubLObject sk_source_schema_translation_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            mt = get_sk_source_property_from_kb(sk_source, sksi_kb_accessors.$const18$sksSchemaTranslationMt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6660L)
    public static SubLObject schema_translation_mt_sk_source_in_any_mt(final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_any_mt(mt, sksi_kb_accessors.$const18$sksSchemaTranslationMt, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6797L)
    public static SubLObject sk_source_ks_type(final SubLObject sk_source) {
        return sksi_access_path.get_sks_type(sk_source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6881L)
    public static SubLObject sk_source_row_count(final SubLObject sk_source) {
        return get_sk_source_property_from_kb(sk_source, sksi_kb_accessors.$const19$rowCount_SKS, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7000L)
    public static SubLObject sk_source_name(final SubLObject sk_source) {
        final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(sk_source, sksi_kb_accessors.$const20$structuredKnowledgeSourceName, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_csql_support(gaf);
            return assertions_high.gaf_arg2(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7205L)
    public static SubLObject sk_source_name_from_mapping_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sk_source_mapping_mt(sk_source);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return sk_source_name(sk_source);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7409L)
    public static SubLObject sk_source_namespace_internal(final SubLObject sk_source) {
        final SubLObject local_gaf = sk_source_asserted_namespace_gaf(sk_source);
        if (sksi_kb_accessors.NIL != local_gaf) {
            sksi_hl_support_utilities.note_csql_support(local_gaf);
            return assertions_high.gaf_arg2(local_gaf);
        }
        SubLObject super_gafs = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = sk_source_super_ks_closure(sk_source);
        SubLObject super_ks = (SubLObject)sksi_kb_accessors.NIL;
        super_ks = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject var;
            final SubLObject super_gaf = var = sk_source_asserted_namespace_gaf(super_ks);
            if (sksi_kb_accessors.NIL != var) {
                super_gafs = (SubLObject)ConsesLow.cons(var, super_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            super_ks = cdolist_list_var.first();
        }
        if (sksi_kb_accessors.NIL != super_gafs) {
            final SubLObject candidate_namespace = assertions_high.gaf_arg2(super_gafs.first());
            SubLObject cdolist_list_var2 = super_gafs.rest();
            SubLObject additional_namespace_gaf = (SubLObject)sksi_kb_accessors.NIL;
            additional_namespace_gaf = cdolist_list_var2.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var2) {
                final SubLObject additional_namespace = assertions_high.gaf_arg2(additional_namespace_gaf);
                if (!candidate_namespace.equalp(additional_namespace)) {
                    Errors.warn((SubLObject)sksi_kb_accessors.$str23$Multiple_namespaces_for__A___S__S, candidate_namespace, additional_namespace);
                    return (SubLObject)sksi_kb_accessors.NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                additional_namespace_gaf = cdolist_list_var2.first();
            }
            return candidate_namespace;
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7409L)
    public static SubLObject sk_source_namespace(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_namespace_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym22$SK_SOURCE_NAMESPACE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym22$SK_SOURCE_NAMESPACE, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym22$SK_SOURCE_NAMESPACE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_namespace_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 8324L)
    public static SubLObject sk_source_asserted_namespace_gaf(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value_gaf(sk_source, sksi_kb_accessors.$const24$structuredKnowledgeSourceNamespac, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 8468L)
    public static SubLObject sk_source_by_sks_name_internal(final SubLObject name, SubLObject mapping_mt) {
        if (mapping_mt == sksi_kb_accessors.UNPROVIDED) {
            mapping_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sks = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL != hlmt.hlmtP(mapping_mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym26$RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mapping_mt, thread);
                final SubLObject pred_var = sksi_kb_accessors.$const20$structuredKnowledgeSourceName;
                if (sksi_kb_accessors.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)sksi_kb_accessors.NIL;
                    final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_kb_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_kb_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)sksi_kb_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_kb_accessors.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_kb_accessors.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_kb_accessors.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = sks;
                        final SubLObject token_var = (SubLObject)sksi_kb_accessors.NIL;
                        while (sksi_kb_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_kb_accessors.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)sksi_kb_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                                    SubLObject done_var_$3 = sks;
                                    final SubLObject token_var_$4 = (SubLObject)sksi_kb_accessors.NIL;
                                    while (sksi_kb_accessors.NIL == done_var_$3) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                        if (sksi_kb_accessors.NIL != valid_$5 && sksi_kb_accessors.NIL != string_utilities.weak_string_equal(name, assertions_high.gaf_arg2(gaf))) {
                                            sks = assertions_high.gaf_arg1(gaf);
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$5 || sksi_kb_accessors.NIL != sks);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_kb_accessors.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (sksi_kb_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid || sksi_kb_accessors.NIL != sks);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$2, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject pred_var2 = sksi_kb_accessors.$const20$structuredKnowledgeSourceName;
        if (sksi_kb_accessors.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
            final SubLObject str2 = (SubLObject)sksi_kb_accessors.NIL;
            final SubLObject _prev_bind_9 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_kb_accessors.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_kb_accessors.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)sksi_kb_accessors.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_kb_accessors.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_kb_accessors.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_kb_accessors.T), thread);
                utilities_macros.noting_progress_preamble(str2);
                final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                SubLObject done_var2 = sks;
                final SubLObject token_var2 = (SubLObject)sksi_kb_accessors.NIL;
                while (sksi_kb_accessors.NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                    if (sksi_kb_accessors.NIL != valid2) {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator2 = (SubLObject)sksi_kb_accessors.NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                            SubLObject done_var_$4 = sks;
                            final SubLObject token_var_$5 = (SubLObject)sksi_kb_accessors.NIL;
                            while (sksi_kb_accessors.NIL == done_var_$4) {
                                final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$5);
                                final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf2));
                                if (sksi_kb_accessors.NIL != valid_$6 && sksi_kb_accessors.NIL != string_utilities.weak_string_equal(name, assertions_high.gaf_arg2(gaf2))) {
                                    sks = assertions_high.gaf_arg1(gaf2);
                                }
                                done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$6 || sksi_kb_accessors.NIL != sks);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_kb_accessors.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (sksi_kb_accessors.NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    }
                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid2 || sksi_kb_accessors.NIL != sks);
                }
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_15, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_14, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_9, thread);
            }
        }
        return sks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 8468L)
    public static SubLObject sk_source_by_sks_name(final SubLObject name, SubLObject mapping_mt) {
        if (mapping_mt == sksi_kb_accessors.UNPROVIDED) {
            mapping_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_by_sks_name_internal(name, mapping_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym25$SK_SOURCE_BY_SKS_NAME, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym25$SK_SOURCE_BY_SKS_NAME, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym25$SK_SOURCE_BY_SKS_NAME, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(name, mapping_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mapping_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_by_sks_name_internal(name, mapping_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(name, mapping_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9225L)
    public static SubLObject sk_source_physical_schema_gafs(final SubLObject sk_source) {
        return list_utilities.fast_remove_duplicates(kb_mapping_utilities.pred_value_gafs(sk_source, sksi_kb_accessors.$const28$physicalSchemaSourceMap, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE), Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQUAL), (SubLObject)sksi_kb_accessors.$sym29$ASSERTION_FORMULA, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9410L)
    public static SubLObject sk_source_physical_schemata(final SubLObject sk_source) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = sk_source_physical_schema_gafs(sk_source);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            final SubLObject item_var = assertions_high.gaf_arg1(gaf);
            if (sksi_kb_accessors.NIL == conses_high.member(item_var, result, (SubLObject)sksi_kb_accessors.$sym30$KBEQ, Symbols.symbol_function((SubLObject)sksi_kb_accessors.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9676L)
    public static SubLObject sk_source_complex_physical_schemata(final SubLObject sk_source) {
        return list_utilities.fast_delete_duplicates(sk_source_complex_physical_schemata_int(sk_source), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9990L)
    public static SubLObject sk_source_complex_physical_schemata_int(final SubLObject sk_source) {
        SubLObject physical_schemata = sk_source_physical_schemata(sk_source);
        if (sksi_kb_accessors.NIL == sksi_infrastructure_utilities.sk_source_atomicP(sk_source)) {
            SubLObject cdolist_list_var;
            final SubLObject sub_sk_sources = cdolist_list_var = sk_source_immediate_spec_sk_sources(sk_source, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            SubLObject sub_sk_source = (SubLObject)sksi_kb_accessors.NIL;
            sub_sk_source = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                physical_schemata = ConsesLow.append(physical_schemata, sk_source_complex_physical_schemata_int(sub_sk_source));
                cdolist_list_var = cdolist_list_var.rest();
                sub_sk_source = cdolist_list_var.first();
            }
        }
        return physical_schemata;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 10445L)
    public static SubLObject sk_source_logical_schemata(final SubLObject sk_source) {
        final SubLObject physical_schemata = sk_source_physical_schemata(sk_source);
        SubLObject logical_schemata = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = (SubLObject)sksi_kb_accessors.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            logical_schemata = ConsesLow.append(logical_schemata, physical_schema_logical_schemata(physical_schema));
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(logical_schemata, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 10809L)
    public static SubLObject sk_source_complex_logical_schemata(final SubLObject sk_source) {
        final SubLObject physical_schemata = sk_source_complex_physical_schemata(sk_source);
        SubLObject logical_schemata = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = (SubLObject)sksi_kb_accessors.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            logical_schemata = ConsesLow.append(logical_schemata, physical_schema_logical_schemata(physical_schema));
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(logical_schemata, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 11190L)
    public static SubLObject sk_source_physical_logical_schema_pairs(final SubLObject sk_source) {
        final SubLObject physical_schemata = sk_source_physical_schemata(sk_source);
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = (SubLObject)sksi_kb_accessors.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$11;
            final SubLObject logical_schemata = cdolist_list_var_$11 = physical_schema_logical_schemata(physical_schema);
            SubLObject logical_schema = (SubLObject)sksi_kb_accessors.NIL;
            logical_schema = cdolist_list_var_$11.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var_$11) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(physical_schema, logical_schema), result);
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                logical_schema = cdolist_list_var_$11.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 11594L)
    public static SubLObject sk_source_immediate_spec_sk_sources(final SubLObject sk_source, SubLObject meta_mt) {
        if (meta_mt == sksi_kb_accessors.UNPROVIDED) {
            meta_mt = sk_source_mapping_mt(sk_source);
        }
        return kb_mapping_utilities.pred_values_in_relevant_mts(sk_source, sksi_kb_accessors.$const31$subKS_Direct, meta_mt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 11861L)
    public static SubLObject meaning_sentence_predicate_for_sk_sourceP(final SubLObject pred, final SubLObject sk_source) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const32$meaningSentencePredicateForSource, sk_source, pred, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12042L)
    public static SubLObject logical_schema_for_meaning_sentence_predicate(final SubLObject pred, SubLObject mapping_mt) {
        if (mapping_mt == sksi_kb_accessors.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_kb_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            result = kb_mapping_utilities.fpred_value(pred, sksi_kb_accessors.$const33$meaningSentencePredicateForSchema, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12283L)
    public static SubLObject sk_source_complex_required_fields(final SubLObject sk_source) {
        return physical_schemata_required_fields(sk_source_complex_physical_schemata(sk_source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12442L)
    public static SubLObject sk_source_required_fields(final SubLObject sk_source) {
        return physical_schemata_required_fields(sk_source_physical_schemata(sk_source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12584L)
    public static SubLObject sk_source_sql_flavor(final SubLObject sk_source) {
        return sksi_access_path.access_path_sql_flavor(sksi_access_path.sksi_determine_access_path(sk_source, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12709L)
    public static SubLObject get_sks_single_literal_lookup_direction_from_kb_internal(final SubLObject sk_source) {
        return get_sks_module_direction_from_kb(sk_source, sksi_kb_accessors.$const35$SKSISingleLiteralRemovalModule, (SubLObject)sksi_kb_accessors.$kw36$BACKWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12709L)
    public static SubLObject get_sks_single_literal_lookup_direction_from_kb(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return get_sks_single_literal_lookup_direction_from_kb_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_sks_single_literal_lookup_direction_from_kb_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13117L)
    public static SubLObject get_sks_multi_literal_lookup_direction_from_kb_internal(final SubLObject sk_source) {
        return get_sks_module_direction_from_kb(sk_source, sksi_kb_accessors.$const38$SKSIMultiLiteralRemovalModule, (SubLObject)sksi_kb_accessors.$kw36$BACKWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13117L)
    public static SubLObject get_sks_multi_literal_lookup_direction_from_kb(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return get_sks_multi_literal_lookup_direction_from_kb_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_sks_multi_literal_lookup_direction_from_kb_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13324L)
    public static SubLObject get_sks_storage_direction_from_kb_internal(final SubLObject sk_source) {
        return get_sks_module_direction_from_kb(sk_source, sksi_kb_accessors.$const40$SKSIStorageModule, (SubLObject)sksi_kb_accessors.$kw41$FORWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13324L)
    public static SubLObject get_sks_storage_direction_from_kb(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return get_sks_storage_direction_from_kb_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_sks_storage_direction_from_kb_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13505L)
    public static SubLObject get_sks_module_direction_from_kb(final SubLObject sk_source, final SubLObject module_type, final SubLObject default_direction) {
        final SubLObject kb_direction = get_sk_source_property_from_kb(sk_source, sksi_kb_accessors.$const42$sksModuleTypeDirection, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, module_type, (SubLObject)sksi_kb_accessors.TWO_INTEGER);
        final SubLObject pcase_var;
        final SubLObject direction = pcase_var = ((sksi_kb_accessors.NIL != kb_direction) ? kb_direction : default_direction);
        if (pcase_var.eql(sksi_kb_accessors.$const43$Backward_AssertionDirection)) {
            return (SubLObject)sksi_kb_accessors.$kw36$BACKWARD;
        }
        if (pcase_var.eql(sksi_kb_accessors.$const44$Forward_AssertionDirection)) {
            return (SubLObject)sksi_kb_accessors.$kw41$FORWARD;
        }
        return direction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13953L)
    public static SubLObject sk_source_sub_ks_direct(final SubLObject sk_source) {
        return kb_mapping_utilities.pred_values(sk_source, sksi_kb_accessors.$const31$subKS_Direct, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14260L)
    public static SubLObject do_sk_source_sub_ks_direct(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_ks = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject sk_source = (SubLObject)sksi_kb_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list45);
        sub_ks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list45);
        sk_source = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject current_$12 = (SubLObject)sksi_kb_accessors.NIL;
        while (sksi_kb_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_kb_accessors.$list45);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_kb_accessors.$list45);
            if (sksi_kb_accessors.NIL == conses_high.member(current_$12, (SubLObject)sksi_kb_accessors.$list46, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                bad = (SubLObject)sksi_kb_accessors.T;
            }
            if (current_$12 == sksi_kb_accessors.$kw47$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_kb_accessors.NIL != bad && sksi_kb_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_kb_accessors.$list45);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_kb_accessors.$kw48$DONE, current);
        final SubLObject done = (SubLObject)((sksi_kb_accessors.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_kb_accessors.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gaf = (SubLObject)sksi_kb_accessors.$sym49$GAF;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_kb_accessors.$sym50$SKSI_DO_GAF_ARG_INDEX_TRUE, (SubLObject)ConsesLow.list(gaf, sk_source, (SubLObject)sksi_kb_accessors.$kw51$PREDICATE, sksi_kb_accessors.$const31$subKS_Direct, (SubLObject)sksi_kb_accessors.$kw52$INDEX, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw48$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_kb_accessors.$sym53$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sub_ks, (SubLObject)ConsesLow.list((SubLObject)sksi_kb_accessors.$sym54$GAF_ARG2, gaf))), ConsesLow.append(body, (SubLObject)sksi_kb_accessors.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14535L)
    public static SubLObject sk_source_proper_sub_ks_closure(final SubLObject sk_source) {
        return Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym55$SK_SOURCE_SUB_KS_CLOSURE), sk_source_sub_ks_direct(sk_source), sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14679L)
    public static SubLObject sk_source_proper_sub_ks_closure_in_mapping_mt(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject mt_var = sk_source_mapping_mt(sk_source);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            closure = sk_source_proper_sub_ks_closure(sk_source);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return closure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14936L)
    public static SubLObject sk_source_sub_ks_closure(final SubLObject sk_source) {
        return (SubLObject)ConsesLow.cons(sk_source, Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym55$SK_SOURCE_SUB_KS_CLOSURE), sk_source_sub_ks_direct(sk_source), sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 15476L)
    public static SubLObject sk_source_sub_ks_min(final SubLObject sk_source) {
        final SubLObject direct_sub_ks_list = sk_source_sub_ks_direct(sk_source);
        return (SubLObject)((sksi_kb_accessors.NIL != direct_sub_ks_list) ? Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym56$SK_SOURCE_SUB_KS_MIN), direct_sub_ks_list, sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY) : ConsesLow.list(sk_source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16073L)
    public static SubLObject sk_source_sub_ksP(final SubLObject super_ks, final SubLObject sub_ks) {
        return sk_source_super_ksP(sub_ks, super_ks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16175L)
    public static SubLObject sk_source_sub_ks_in_any_mtP(final SubLObject super_ks, final SubLObject sub_ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            result = sk_source_super_ksP(sub_ks, super_ks);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16354L)
    public static SubLObject sk_source_proper_sub_ksP(final SubLObject super_ks, final SubLObject sub_ks) {
        return sk_source_proper_super_ksP(sub_ks, super_ks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16470L)
    public static SubLObject sk_source_super_ks_direct(final SubLObject sk_source) {
        return kb_mapping_utilities.pred_values(sk_source, sksi_kb_accessors.$const31$subKS_Direct, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16586L)
    public static SubLObject sk_source_proper_super_ks_closure(final SubLObject sk_source) {
        return Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym57$SK_SOURCE_SUPER_KS_CLOSURE), sk_source_super_ks_direct(sk_source), sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16736L)
    public static SubLObject sk_source_super_ks_closure(final SubLObject sk_source) {
        return (SubLObject)ConsesLow.cons(sk_source, Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym57$SK_SOURCE_SUPER_KS_CLOSURE), sk_source_super_ks_direct(sk_source), sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 17264L)
    public static SubLObject sk_source_super_ks_max(final SubLObject sk_source) {
        final SubLObject direct_super_ks_list = sk_source_super_ks_direct(sk_source);
        return (SubLObject)((sksi_kb_accessors.NIL != direct_super_ks_list) ? Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym58$SK_SOURCE_SUPER_KS_MAX), direct_super_ks_list, sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY) : ConsesLow.list(sk_source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 17874L)
    public static SubLObject sk_source_super_ksP(final SubLObject sub_ks, final SubLObject super_ks) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != kb_utilities.kbeq(sub_ks, super_ks) || sksi_kb_accessors.NIL != sk_source_proper_super_ksP(sub_ks, super_ks));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18307L)
    public static SubLObject sk_source_proper_super_ksP_internal(final SubLObject sub_ks, final SubLObject super_ks) {
        SubLObject super_ksP = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject pred_var = sksi_kb_accessors.$const31$subKS_Direct;
        if (sksi_kb_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sub_ks, (SubLObject)sksi_kb_accessors.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sub_ks, (SubLObject)sksi_kb_accessors.TWO_INTEGER, pred_var);
            SubLObject done_var = super_ksP;
            final SubLObject token_var = (SubLObject)sksi_kb_accessors.NIL;
            while (sksi_kb_accessors.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_kb_accessors.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_kb_accessors.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                        SubLObject done_var_$13 = super_ksP;
                        final SubLObject token_var_$14 = (SubLObject)sksi_kb_accessors.NIL;
                        while (sksi_kb_accessors.NIL == done_var_$13) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$14);
                            final SubLObject valid_$15 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$14.eql(gaf));
                            if (sksi_kb_accessors.NIL != valid_$15) {
                                final SubLObject sks = assertions_high.gaf_arg1(gaf);
                                super_ksP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != kb_utilities.kbeq(sks, super_ks) || sksi_kb_accessors.NIL != sk_source_proper_super_ksP(sks, super_ks));
                            }
                            done_var_$13 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$15 || sksi_kb_accessors.NIL != super_ksP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_kb_accessors.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_kb_accessors.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid || sksi_kb_accessors.NIL != super_ksP);
            }
        }
        return super_ksP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18307L)
    public static SubLObject sk_source_proper_super_ksP(final SubLObject sub_ks, final SubLObject super_ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sk_source_proper_super_ksP_internal(sub_ks, super_ks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym59$SK_SOURCE_PROPER_SUPER_KS_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym59$SK_SOURCE_PROPER_SUPER_KS_, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym59$SK_SOURCE_PROPER_SUPER_KS_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sub_ks, super_ks);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sub_ks.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && super_ks.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_proper_super_ksP_internal(sub_ks, super_ks)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sub_ks, super_ks));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18675L)
    public static SubLObject common_super_ksP(final SubLObject sk_source1, final SubLObject sk_source2) {
        if (sksi_kb_accessors.NIL != kb_utilities.kbeq(sk_source1, sk_source2)) {
            return (SubLObject)sksi_kb_accessors.T;
        }
        final SubLObject tops1 = sk_source_super_ks_max(sk_source1);
        final SubLObject tops2 = sk_source_super_ks_max(sk_source2);
        return keyhash_utilities.fast_intersectP(tops1, tops2, Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQ), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18968L)
    public static SubLObject super_ks_closure_intersection(final SubLObject sk_source1, final SubLObject sk_source2) {
        return keyhash_utilities.fast_intersection(sk_source_super_ks_closure(sk_source1), sk_source_super_ks_closure(sk_source2), Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQ), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19191L)
    public static SubLObject immediate_genl_ks_internal(final SubLObject sk_source) {
        final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(sk_source, sksi_kb_accessors.$const31$subKS_Direct, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_csql_support(gaf);
            return assertions_high.gaf_arg1(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19191L)
    public static SubLObject immediate_genl_ks(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return immediate_genl_ks_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym60$IMMEDIATE_GENL_KS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym60$IMMEDIATE_GENL_KS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym60$IMMEDIATE_GENL_KS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(immediate_genl_ks_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19410L)
    public static SubLObject max_genl_ks(final SubLObject sk_source) {
        final SubLObject genl_ks = immediate_genl_ks(sk_source);
        if (sksi_kb_accessors.NIL != kb_utilities.kbeq(genl_ks, sk_source)) {
            return sk_source;
        }
        if (sksi_kb_accessors.NIL != forts.fort_p(genl_ks)) {
            return max_genl_ks(genl_ks);
        }
        return sk_source;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19720L)
    public static SubLObject nearest_common_super_ks(final SubLObject sks_list) {
        final SubLObject new_sks_list = list_utilities.fast_delete_duplicates(sks_list, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL != list_utilities.singletonP(new_sks_list)) {
            return new_sks_list.first();
        }
        final SubLObject first = new_sks_list.first();
        final SubLObject rest = new_sks_list.rest();
        SubLObject foundP;
        SubLObject v_super;
        SubLObject failP;
        SubLObject csome_list_var;
        SubLObject ks;
        for (foundP = (SubLObject)sksi_kb_accessors.NIL, v_super = (SubLObject)sksi_kb_accessors.NIL, v_super = immediate_genl_ks(first); sksi_kb_accessors.NIL == foundP && sksi_kb_accessors.NIL != v_super; v_super = immediate_genl_ks(first)) {
            failP = (SubLObject)sksi_kb_accessors.NIL;
            if (sksi_kb_accessors.NIL == failP) {
                for (csome_list_var = rest, ks = (SubLObject)sksi_kb_accessors.NIL, ks = csome_list_var.first(); sksi_kb_accessors.NIL == failP && sksi_kb_accessors.NIL != csome_list_var; failP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == sk_source_sub_ksP(v_super, ks)), csome_list_var = csome_list_var.rest(), ks = csome_list_var.first()) {}
            }
            if (sksi_kb_accessors.NIL == failP) {
                foundP = v_super;
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 20358L)
    public static SubLObject nearest_common_super_ks_for_ls_list(final SubLObject ls_list) {
        final SubLObject ant_ks_list = Mapping.mapcar((SubLObject)sksi_kb_accessors.$sym61$LOGICAL_SCHEMA_SOURCES, ls_list);
        if (sksi_kb_accessors.NIL == list_utilities.every_in_list((SubLObject)sksi_kb_accessors.$sym62$SINGLETON_, ant_ks_list, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
            return (SubLObject)sksi_kb_accessors.NIL;
        }
        return nearest_common_super_ks(list_utilities.flatten(ant_ks_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 20748L)
    public static SubLObject schema_representation_completeP(final SubLObject schema) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(schema, sksi_kb_accessors.$const63$schemaRepresentationComplete, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21003L)
    public static SubLObject isa_physical_schemaP_internal(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_kb_accessors.$const65$PhysicalSchema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21003L)
    public static SubLObject isa_physical_schemaP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return isa_physical_schemaP_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym64$ISA_PHYSICAL_SCHEMA_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym64$ISA_PHYSICAL_SCHEMA_, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$int66$50, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym64$ISA_PHYSICAL_SCHEMA_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(isa_physical_schemaP_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21257L)
    public static SubLObject physical_schema_sk_sources(final SubLObject physical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const28$physicalSchemaSourceMap, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21544L)
    public static SubLObject physical_schema_sk_sources_memoized_internal(final SubLObject physical_schema) {
        return physical_schema_sk_sources(physical_schema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21544L)
    public static SubLObject physical_schema_sk_sources_memoized(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_sk_sources_memoized_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_sk_sources_memoized_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21704L)
    public static SubLObject physical_schema_fields_internal(final SubLObject physical_schema) {
        return kb_mapping_utilities.pred_values(physical_schema, sksi_kb_accessors.$const69$physicalFields, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21704L)
    public static SubLObject physical_schema_fields(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_fields_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym68$PHYSICAL_SCHEMA_FIELDS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym68$PHYSICAL_SCHEMA_FIELDS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym68$PHYSICAL_SCHEMA_FIELDS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_fields_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21863L)
    public static SubLObject physical_schema_primary_key_internal(final SubLObject physical_schema) {
        final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(physical_schema, sksi_kb_accessors.$const71$primaryKey, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject el_key_list = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL != assertions_high.gaf_assertionP(gaf)) {
            el_key_list = assertions_high.gaf_arg2(gaf);
            if (sksi_kb_accessors.NIL != el_utilities.el_list_p(el_key_list)) {
                return evaluation_defns.el_list_to_subl_list(el_key_list);
            }
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21863L)
    public static SubLObject physical_schema_primary_key(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_primary_key_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym70$PHYSICAL_SCHEMA_PRIMARY_KEY, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym70$PHYSICAL_SCHEMA_PRIMARY_KEY, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym70$PHYSICAL_SCHEMA_PRIMARY_KEY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_primary_key_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22284L)
    public static SubLObject physical_schema_primary_key_compensate_for_table_column_representation_internal(final SubLObject physical_schema) {
        final SubLObject pk_list = physical_schema_primary_key(physical_schema);
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = pk_list;
        SubLObject pk_elem = (SubLObject)sksi_kb_accessors.NIL;
        pk_elem = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject field_name = physical_field_name(pk_elem);
            final SubLObject better_pf = physical_field_for_schema_and_name(physical_schema, field_name);
            result = (SubLObject)ConsesLow.cons((sksi_kb_accessors.NIL != better_pf) ? better_pf : pk_elem, result);
            cdolist_list_var = cdolist_list_var.rest();
            pk_elem = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22284L)
    public static SubLObject physical_schema_primary_key_compensate_for_table_column_representation(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_primary_key_compensate_for_table_column_representation_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_primary_key_compensate_for_table_column_representation_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22752L)
    public static SubLObject physical_schema_primary_key_p(final SubLObject physical_schema, final SubLObject physical_fields) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != physical_fields && physical_fields.equal(physical_schema_primary_key(physical_schema)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22943L)
    public static SubLObject physical_schema_forbidden_comparison_operators(final SubLObject physical_schema) {
        return kb_mapping_utilities.pred_values(physical_schema, sksi_kb_accessors.$const73$suppressConvertingComparisonLiter, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23120L)
    public static SubLObject physical_schema_forbidden_comparison_operator_p(final SubLObject physical_schema, final SubLObject operator) {
        return list_utilities.member_eqP(operator, physical_schema_forbidden_comparison_operators(physical_schema));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23310L)
    public static SubLObject physical_schema_foreign_keys(final SubLObject physical_schema) {
        return physical_schema_foreign_keys_int(physical_schema, sksi_kb_accessors.$const74$foreignKeyMap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23580L)
    public static SubLObject physical_schema_foreign_keys_restrict(final SubLObject physical_schema) {
        return physical_schema_foreign_keys_int(physical_schema, sksi_kb_accessors.$const75$foreignKeyMap_Restrict);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23768L)
    public static SubLObject physical_schema_foreign_keys_cascade(final SubLObject physical_schema) {
        return physical_schema_foreign_keys_int(physical_schema, sksi_kb_accessors.$const76$foreignKeyMap_Cascade);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23953L)
    public static SubLObject physical_schema_foreign_keys_set_null(final SubLObject physical_schema) {
        return physical_schema_foreign_keys_int(physical_schema, sksi_kb_accessors.$const77$foreignKeyMap_SetNull);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 24139L)
    public static SubLObject physical_schema_foreign_keys_set_default(final SubLObject physical_schema) {
        return physical_schema_foreign_keys_int(physical_schema, sksi_kb_accessors.$const78$foreignKeyMap_SetDefault);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 24334L)
    public static SubLObject physical_schema_foreign_keys_int(final SubLObject physical_schema, final SubLObject pred) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(physical_schema, pred, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject foreign_key_list = evaluation_defns.el_list_to_subl_list(assertions_high.gaf_arg4(gaf));
            final SubLObject referenced_physical_schema = assertions_high.gaf_arg1(gaf);
            final SubLObject referenced_field_list = evaluation_defns.el_list_to_subl_list(assertions_high.gaf_arg2(gaf));
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(foreign_key_list, referenced_physical_schema, referenced_field_list), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 24916L)
    public static SubLObject physical_schema_unique_fields_tuples(final SubLObject physical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const79$uniqueFieldList, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject unique_fields_list = evaluation_defns.el_list_to_subl_list(assertions_high.gaf_arg2(gaf));
            result = (SubLObject)ConsesLow.cons(unique_fields_list, result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 25375L)
    public static SubLObject physical_schema_required_fields(final SubLObject physical_schema) {
        return kb_mapping_utilities.pred_values(physical_schema, sksi_kb_accessors.$const80$requiredFields, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 25511L)
    public static SubLObject physical_schemata_required_fields(final SubLObject physical_schemata) {
        SubLObject required_fields = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = (SubLObject)sksi_kb_accessors.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject ps_required_fields = physical_schema_required_fields(physical_schema);
            required_fields = ConsesLow.append(required_fields, ps_required_fields);
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return required_fields;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 25844L)
    public static SubLObject physical_schema_required_field_names(final SubLObject physical_schema) {
        final SubLObject required_fields = physical_schema_required_fields(physical_schema);
        return Mapping.mapcar((SubLObject)sksi_kb_accessors.$sym81$PHYSICAL_FIELD_NAME, required_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 26054L)
    public static SubLObject physical_schema_indexed_fields(final SubLObject physical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const82$indexedFields, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(el_utilities.el_list_items(assertions_high.gaf_arg2(gaf)), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 26352L)
    public static SubLObject sksi_determine_singly_indexed_schema_indexed_field(final SubLObject physical_schema) {
        return physical_field_name(physical_schema_indexed_fields(physical_schema).first().first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 26871L)
    public static SubLObject physical_field_indexedP(final SubLObject physical_field, final SubLObject physical_schema) {
        final SubLObject gaf = kb_indexing.find_gaf_in_relevant_mt((SubLObject)ConsesLow.list(sksi_kb_accessors.$const82$indexedFields, physical_schema, physical_field));
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            return (SubLObject)sksi_kb_accessors.T;
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27101L)
    public static SubLObject physical_schema_enumerableP_internal(final SubLObject physical_schema) {
        final SubLObject gaf = enumerable_schema_gaf(physical_schema);
        if (sksi_kb_accessors.NIL != gaf) {
            return (SubLObject)sksi_kb_accessors.T;
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27101L)
    public static SubLObject physical_schema_enumerableP(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_enumerableP_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym83$PHYSICAL_SCHEMA_ENUMERABLE_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym83$PHYSICAL_SCHEMA_ENUMERABLE_, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym83$PHYSICAL_SCHEMA_ENUMERABLE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_enumerableP_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27505L)
    public static SubLObject enumerable_schema_gaf(final SubLObject physical_schema) {
        final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(physical_schema, sksi_kb_accessors.$const84$enumerableSchema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27657L)
    public static SubLObject physical_schema_result_set_cardinality_gafs_internal(final SubLObject physical_schema) {
        return kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const86$resultSetCardinality, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27657L)
    public static SubLObject physical_schema_result_set_cardinality_gafs(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_result_set_cardinality_gafs_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_result_set_cardinality_gafs_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27837L)
    public static SubLObject physical_schemata_result_set_cardinality_gafs(final SubLObject physical_schemata) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = (SubLObject)sksi_kb_accessors.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, physical_schema_result_set_cardinality_gafs(physical_schema));
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28137L)
    public static SubLObject physical_schema_result_set_cardinality_wXconstraints_gafs_internal(final SubLObject physical_schema) {
        return kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const88$resultSetCardinalityWithConstrain, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28137L)
    public static SubLObject physical_schema_result_set_cardinality_wXconstraints_gafs(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_result_set_cardinality_wXconstraints_gafs_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_result_set_cardinality_wXconstraints_gafs_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28346L)
    public static SubLObject physical_schemata_result_set_cardinality_wXconstraints_gafs(final SubLObject physical_schemata) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject physical_schema = (SubLObject)sksi_kb_accessors.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, physical_schema_result_set_cardinality_wXconstraints_gafs(physical_schema));
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28674L)
    public static SubLObject result_set_cardinality_gaf_unbound_fields_set(final SubLObject rs_cardinality_gaf) {
        return assertions_high.gaf_arg2(rs_cardinality_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28799L)
    public static SubLObject result_set_cardinality_gaf_bound_fields_set(final SubLObject rs_cardinality_gaf) {
        return assertions_high.gaf_arg3(rs_cardinality_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28922L)
    public static SubLObject result_set_cardinality_gaf_constraints(final SubLObject rs_cardinality_gaf) {
        return (SubLObject)((sksi_kb_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_predicate(rs_cardinality_gaf), sksi_kb_accessors.$const88$resultSetCardinalityWithConstrain)) ? assertions_high.gaf_arg4(rs_cardinality_gaf) : sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29131L)
    public static SubLObject result_set_cardinality_gaf_cost_expression(final SubLObject rs_cardinality_gaf) {
        return (sksi_kb_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_predicate(rs_cardinality_gaf), sksi_kb_accessors.$const86$resultSetCardinality)) ? assertions_high.gaf_arg4(rs_cardinality_gaf) : assertions_high.gaf_arg5(rs_cardinality_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29410L)
    public static SubLObject physical_schema_logical_schema_gafs(final SubLObject physical_schema) {
        return kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const89$logicalPhysicalSchemaMap, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29562L)
    public static SubLObject physical_schema_logical_schemata(final SubLObject physical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = physical_schema_logical_schema_gafs(physical_schema);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg1(gaf), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29841L)
    public static SubLObject physical_schema_example_tuple(final SubLObject physical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(physical_schema, sksi_kb_accessors.$const90$exampleTuple, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 30118L)
    public static SubLObject physical_schema_field_encodings(final SubLObject physical_schema) {
        SubLObject triples = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject pred_var = sksi_kb_accessors.$const91$fieldEncoding;
        if (sksi_kb_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)sksi_kb_accessors.NIL;
            final SubLObject token_var = (SubLObject)sksi_kb_accessors.NIL;
            while (sksi_kb_accessors.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_kb_accessors.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_kb_accessors.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                        SubLObject done_var_$16 = (SubLObject)sksi_kb_accessors.NIL;
                        final SubLObject token_var_$17 = (SubLObject)sksi_kb_accessors.NIL;
                        while (sksi_kb_accessors.NIL == done_var_$16) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                            final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(ass));
                            if (sksi_kb_accessors.NIL != valid_$18) {
                                sksi_hl_support_utilities.note_sksi_support(ass);
                                final SubLObject physical_field_indexical = assertions_high.gaf_arg2(ass);
                                final SubLObject logical_schema = assertions_high.gaf_arg3(ass);
                                final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                final SubLObject triple = (SubLObject)ConsesLow.list(physical_field_indexical, logical_schema, logical_recipe);
                                triples = (SubLObject)ConsesLow.cons(triple, triples);
                            }
                            done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$18);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_kb_accessors.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_kb_accessors.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid);
            }
        }
        return triples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 30756L)
    public static SubLObject physical_schema_ordered_field_list_internal(final SubLObject physical_schema) {
        final SubLObject schema_field_name_list = physical_schema_field_name_list(physical_schema);
        SubLObject schema_field_list = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = schema_field_name_list;
        SubLObject field_name = (SubLObject)sksi_kb_accessors.NIL;
        field_name = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            schema_field_list = (SubLObject)ConsesLow.cons(physical_field_for_schema_and_name(physical_schema, field_name), schema_field_list);
            cdolist_list_var = cdolist_list_var.rest();
            field_name = cdolist_list_var.first();
        }
        return Sequences.nreverse(schema_field_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 30756L)
    public static SubLObject physical_schema_ordered_field_list(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_ordered_field_list_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_ordered_field_list_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 31366L)
    public static SubLObject physical_schema_field_name_list(final SubLObject physical_schema) {
        return conses_high.copy_list(cycl_utilities.formula_args(kb_mapping_utilities.fpred_value(physical_schema, sksi_kb_accessors.$const93$schemaFieldNameList, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE), (SubLObject)sksi_kb_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 31533L)
    public static SubLObject logical_schemata_physical_schemata(final SubLObject logical_schemata) {
        return list_utilities.fast_delete_duplicates(Mapping.mapcan((SubLObject)sksi_kb_accessors.$sym94$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, logical_schemata, sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 31805L)
    public static SubLObject logical_schema_physical_schemata(final SubLObject logical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const89$logicalPhysicalSchemaMap, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32098L)
    public static SubLObject logical_schema_fields_internal(final SubLObject logical_schema) {
        return kb_mapping_utilities.pred_values(logical_schema, sksi_kb_accessors.$const96$logicalFields, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32098L)
    public static SubLObject logical_schema_fields(final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_schema_fields_internal(logical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym95$LOGICAL_SCHEMA_FIELDS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym95$LOGICAL_SCHEMA_FIELDS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym95$LOGICAL_SCHEMA_FIELDS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_fields_internal(logical_schema)));
            memoization_state.caching_state_put(caching_state, logical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32254L)
    public static SubLObject logical_schema_field_indexicals_internal(final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject node_var = sksi_kb_accessors.$const98$logicalFieldIndexicals;
        final SubLObject deck_type = (SubLObject)sksi_kb_accessors.$kw101$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)sksi_kb_accessors.NIL;
                final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((sksi_kb_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sksi_kb_accessors.NIL != tv_var) ? sksi_kb_accessors.$sym102$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (sksi_kb_accessors.NIL != tv_var && sksi_kb_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sksi_kb_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)sksi_kb_accessors.$kw103$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$str104$_A_is_not_a__A, tv_var, (SubLObject)sksi_kb_accessors.$sym105$SBHL_TRUE_TV_P, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sksi_kb_accessors.$kw106$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$str107$continue_anyway, (SubLObject)sksi_kb_accessors.$str104$_A_is_not_a__A, tv_var, (SubLObject)sksi_kb_accessors.$sym105$SBHL_TRUE_TV_P, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sksi_kb_accessors.$kw108$WARN)) {
                            Errors.warn((SubLObject)sksi_kb_accessors.$str104$_A_is_not_a__A, tv_var, (SubLObject)sksi_kb_accessors.$sym105$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)sksi_kb_accessors.$str109$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)sksi_kb_accessors.$str107$continue_anyway, (SubLObject)sksi_kb_accessors.$str104$_A_is_not_a__A, tv_var, (SubLObject)sksi_kb_accessors.$sym105$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sksi_kb_accessors.$const110$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sksi_kb_accessors.$const110$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sksi_kb_accessors.$const110$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sksi_kb_accessors.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sksi_kb_accessors.$const110$genlPreds), thread);
                        if (sksi_kb_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sksi_kb_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(sksi_kb_accessors.$const98$logicalFieldIndexicals, sbhl_module_vars.get_sbhl_module((SubLObject)sksi_kb_accessors.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$22 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(sksi_kb_accessors.$const110$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sksi_kb_accessors.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(sksi_kb_accessors.$const98$logicalFieldIndexicals, sbhl_search_vars.genl_inverse_mode_p()); sksi_kb_accessors.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$25 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$25;
                                    final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (sksi_kb_accessors.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$25)) {
                                            final SubLObject partial_result = kb_mapping_utilities.pred_values(logical_schema, spec_pred, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
                                            result = ConsesLow.append(partial_result, result);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sksi_kb_accessors.$const110$genlPreds));
                                        SubLObject module_var = (SubLObject)sksi_kb_accessors.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (sksi_kb_accessors.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sksi_kb_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$25);
                                                if (sksi_kb_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sksi_kb_accessors.UNPROVIDED));
                                                    if (sksi_kb_accessors.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_kb_accessors.UNPROVIDED));
                                                        if (sksi_kb_accessors.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sksi_kb_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (sksi_kb_accessors.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$30;
                                                                        for (iteration_state_$30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sksi_kb_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$30); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next(iteration_state_$30)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$30);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (sksi_kb_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (sksi_kb_accessors.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_kb_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_kb_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (sksi_kb_accessors.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && sksi_kb_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)sksi_kb_accessors.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (sksi_kb_accessors.NIL != csome_list_var) {
                                                                                            if (sksi_kb_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)sksi_kb_accessors.$str111$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$30);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)sksi_kb_accessors.FIVE_INTEGER, (SubLObject)sksi_kb_accessors.$str112$attempting_to_bind_direction_link, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                                                    }
                                                }
                                                else if (sksi_kb_accessors.NIL != obsolete.cnat_p(node, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$32;
                                                    final SubLObject new_list = cdolist_list_var_$32 = ((sksi_kb_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_kb_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_kb_accessors.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)sksi_kb_accessors.NIL;
                                                    generating_fn = cdolist_list_var_$32.first();
                                                    while (sksi_kb_accessors.NIL != cdolist_list_var_$32) {
                                                        final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (sksi_kb_accessors.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sksi_kb_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sksi_kb_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (sksi_kb_accessors.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && sksi_kb_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)sksi_kb_accessors.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (sksi_kb_accessors.NIL != csome_list_var2) {
                                                                    if (sksi_kb_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)sksi_kb_accessors.$str111$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                                                        }
                                                        cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                                                        generating_fn = cdolist_list_var_$32.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$23, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$23, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$24, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$str113$Node__a_does_not_pass_sbhl_type_t, sksi_kb_accessors.$const98$logicalFieldIndexicals, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sksi_kb_accessors.UNPROVIDED)), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$21, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$20, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$19, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_kb_accessors.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32254L)
    public static SubLObject logical_schema_field_indexicals(final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_schema_field_indexicals_internal(logical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_field_indexicals_internal(logical_schema)));
            memoization_state.caching_state_put(caching_state, logical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32615L)
    public static SubLObject logical_schema_example_sentences(final SubLObject logical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const114$schemaExampleSentence, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32902L)
    public static SubLObject logical_schema_keys(final SubLObject logical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const115$logicalSchemaKeys, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(el_utilities.el_extensional_set_elements(assertions_high.gaf_arg2(gaf)), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33204L)
    public static SubLObject logical_schema_result_set_cardinality_gafs_internal(final SubLObject logical_schema) {
        return kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const117$logicalResultSetCardinality, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33204L)
    public static SubLObject logical_schema_result_set_cardinality_gafs(final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_schema_result_set_cardinality_gafs_internal(logical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_result_set_cardinality_gafs_internal(logical_schema)));
            memoization_state.caching_state_put(caching_state, logical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33431L)
    public static SubLObject logical_schemata_result_set_cardinality_gafs(final SubLObject logical_schemata) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_kb_accessors.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, logical_schema_result_set_cardinality_gafs(logical_schema));
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33725L)
    public static SubLObject logical_result_set_cardinality_gaf_unbound_fields_set(final SubLObject lrs_cardinality_gaf) {
        return assertions_high.gaf_arg2(lrs_cardinality_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33860L)
    public static SubLObject logical_result_set_cardinality_gaf_bound_fields_set(final SubLObject lrs_cardinality_gaf) {
        return assertions_high.gaf_arg3(lrs_cardinality_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33993L)
    public static SubLObject logical_result_set_cardinality_gaf_cost_expression(final SubLObject lrs_cardinality_gaf) {
        return assertions_high.gaf_arg4(lrs_cardinality_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34125L)
    public static SubLObject logical_schema_result_set_cardinality_wrt_value_gafs_internal(final SubLObject logical_schema) {
        return kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const119$logicalResultSetCardinalityWRTVal, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34125L)
    public static SubLObject logical_schema_result_set_cardinality_wrt_value_gafs(final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_schema_result_set_cardinality_wrt_value_gafs_internal(logical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_result_set_cardinality_wrt_value_gafs_internal(logical_schema)));
            memoization_state.caching_state_put(caching_state, logical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34378L)
    public static SubLObject logical_schemata_result_set_cardinality_wrt_value_gafs(final SubLObject logical_schemata) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_kb_accessors.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, logical_schema_result_set_cardinality_wrt_value_gafs(logical_schema));
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34692L)
    public static SubLObject logical_result_set_cardinality_wrt_value_gaf_unbound_fields_set(final SubLObject lrs_cardinality_wrt_value_gaf) {
        return assertions_high.gaf_arg2(lrs_cardinality_wrt_value_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34857L)
    public static SubLObject logical_result_set_cardinality_wrt_value_gaf_bound_fields_set(final SubLObject lrs_cardinality_wrt_value_gaf) {
        return assertions_high.gaf_arg3(lrs_cardinality_wrt_value_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35020L)
    public static SubLObject logical_result_set_cardinality_wrt_value_gaf_cost_expression(final SubLObject lrs_cardinality_wrt_value_gaf) {
        return assertions_high.gaf_arg4(lrs_cardinality_wrt_value_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35182L)
    public static SubLObject logical_result_set_cardinality_wrt_value_gaf_value(final SubLObject lrs_cardinality_wrt_value_gaf) {
        return assertions_high.gaf_arg5(lrs_cardinality_wrt_value_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35334L)
    public static SubLObject logical_schema_field_decodings(final SubLObject logical_schema) {
        SubLObject triples = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject pred_var = sksi_kb_accessors.$const120$fieldDecoding;
        if (sksi_kb_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)sksi_kb_accessors.NIL;
            final SubLObject token_var = (SubLObject)sksi_kb_accessors.NIL;
            while (sksi_kb_accessors.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_kb_accessors.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_kb_accessors.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                        SubLObject done_var_$35 = (SubLObject)sksi_kb_accessors.NIL;
                        final SubLObject token_var_$36 = (SubLObject)sksi_kb_accessors.NIL;
                        while (sksi_kb_accessors.NIL == done_var_$35) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                            final SubLObject valid_$37 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$36.eql(ass));
                            if (sksi_kb_accessors.NIL != valid_$37) {
                                sksi_hl_support_utilities.note_sksi_support(ass);
                                final SubLObject logical_field = assertions_high.gaf_arg2(ass);
                                final SubLObject physical_schema = assertions_high.gaf_arg3(ass);
                                final SubLObject physical_recipe = assertions_high.gaf_arg4(ass);
                                final SubLObject triple = (SubLObject)ConsesLow.list(logical_field, physical_schema, physical_recipe);
                                triples = (SubLObject)ConsesLow.cons(triple, triples);
                            }
                            done_var_$35 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$37);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_kb_accessors.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_kb_accessors.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid);
            }
        }
        return triples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35943L)
    public static SubLObject logical_schema_source_gafs(final SubLObject logical_schema, SubLObject sks) {
        if (sks == sksi_kb_accessors.UNPROVIDED) {
            sks = (SubLObject)sksi_kb_accessors.NIL;
        }
        return (sksi_kb_accessors.NIL != sks) ? kb_mapping_utilities.pred_u_v_holds_gafs(sksi_kb_accessors.$const121$logicalSchemaSourceMap, logical_schema, sks, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE) : kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const121$logicalSchemaSourceMap, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36192L)
    public static SubLObject logical_schema_sources(final SubLObject logical_schema) {
        return kb_mapping_utilities.pred_values(logical_schema, sksi_kb_accessors.$const121$logicalSchemaSourceMap, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36324L)
    public static SubLObject logical_schema_sk_sources_memoized_internal(final SubLObject logical_schema) {
        return logical_schema_sources(logical_schema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36324L)
    public static SubLObject logical_schema_sk_sources_memoized(final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_schema_sk_sources_memoized_internal(logical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_sk_sources_memoized_internal(logical_schema)));
            memoization_state.caching_state_put(caching_state, logical_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36477L)
    public static SubLObject logical_schemata_sources(final SubLObject logical_schemata) {
        return list_utilities.fast_delete_duplicates(Mapping.mapcan((SubLObject)sksi_kb_accessors.$sym61$LOGICAL_SCHEMA_SOURCES, logical_schemata, sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36625L)
    public static SubLObject logical_schema_sourceP(final SubLObject logical_schema, final SubLObject sk_source) {
        SubLObject sourceP = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject pred_var = sksi_kb_accessors.$const121$logicalSchemaSourceMap;
        if (sksi_kb_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var);
            SubLObject done_var = sourceP;
            final SubLObject token_var = (SubLObject)sksi_kb_accessors.NIL;
            while (sksi_kb_accessors.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_kb_accessors.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_kb_accessors.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                        SubLObject done_var_$38 = sourceP;
                        final SubLObject token_var_$39 = (SubLObject)sksi_kb_accessors.NIL;
                        while (sksi_kb_accessors.NIL == done_var_$38) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                            final SubLObject valid_$40 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$39.eql(gaf));
                            if (sksi_kb_accessors.NIL != valid_$40) {
                                sourceP = kb_utilities.kbeq(sk_source, assertions_high.gaf_arg2(gaf));
                            }
                            done_var_$38 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$40 || sksi_kb_accessors.NIL != sourceP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_kb_accessors.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_kb_accessors.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid || sksi_kb_accessors.NIL != sourceP);
            }
        }
        return sourceP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36900L)
    public static SubLObject logical_schema_complete_extent_knownP(final SubLObject logical_schema) {
        final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(logical_schema, sksi_kb_accessors.$const123$schemaCompleteExtentKnown, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        if (sksi_kb_accessors.NIL != gaf) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            return (SubLObject)sksi_kb_accessors.T;
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37121L)
    public static SubLObject logical_schema_complete_extent_known_for_predicateP(final SubLObject logical_schema, final SubLObject predicate, SubLObject test) {
        if (test == sksi_kb_accessors.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQ);
        }
        SubLObject completeP = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject pred_var = sksi_kb_accessors.$const123$schemaCompleteExtentKnown;
        if (sksi_kb_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_schema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, pred_var);
            SubLObject done_var = completeP;
            final SubLObject token_var = (SubLObject)sksi_kb_accessors.NIL;
            while (sksi_kb_accessors.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_kb_accessors.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_kb_accessors.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_kb_accessors.$kw27$GAF, (SubLObject)sksi_kb_accessors.$kw1$TRUE, (SubLObject)sksi_kb_accessors.NIL);
                        SubLObject done_var_$41 = completeP;
                        final SubLObject token_var_$42 = (SubLObject)sksi_kb_accessors.NIL;
                        while (sksi_kb_accessors.NIL == done_var_$41) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                            final SubLObject valid_$43 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$42.eql(gaf));
                            if (sksi_kb_accessors.NIL != valid_$43) {
                                completeP = Functions.funcall(test, predicate, assertions_high.gaf_arg2(gaf));
                            }
                            done_var_$41 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid_$43 || sksi_kb_accessors.NIL != completeP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_kb_accessors.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_kb_accessors.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == valid || sksi_kb_accessors.NIL != completeP);
            }
        }
        return completeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37465L)
    public static SubLObject logical_schema_content_sentences(final SubLObject logical_schema) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var;
        final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_kb_accessors.$const124$contentSentenceOfSchema, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_hl_support_utilities.note_sksi_support(gaf);
            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), result);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37754L)
    public static SubLObject logical_field_p(final SubLObject v_object) {
        return (SubLObject)((sksi_kb_accessors.NIL != forts.fort_p(v_object)) ? logical_field_p_memoized(v_object) : sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37976L)
    public static SubLObject logical_field_p_memoized_internal(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sksi_kb_accessors.NIL != nart_handles.nart_p(fort) && sksi_kb_accessors.NIL != kb_utilities.kbeq(sksi_kb_accessors.$const126$LogicalFieldFn, cycl_utilities.nat_functor(fort))) || sksi_kb_accessors.NIL != isa.isaP(fort, sksi_kb_accessors.$const127$LogicalField, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37976L)
    public static SubLObject logical_field_p_memoized(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_field_p_memoized_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym125$LOGICAL_FIELD_P_MEMOIZED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym125$LOGICAL_FIELD_P_MEMOIZED, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym125$LOGICAL_FIELD_P_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_field_p_memoized_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38173L)
    public static SubLObject lf_alias_fn_naut_p(final SubLObject v_object) {
        return (SubLObject)((sksi_kb_accessors.NIL != term.nautP(v_object, (SubLObject)sksi_kb_accessors.UNPROVIDED)) ? kb_utilities.kbeq(cycl_utilities.formula_operator(v_object), sksi_kb_accessors.$const128$LFAliasFn) : sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38301L)
    public static SubLObject lf_alias_fn_naut_lf(final SubLObject lf_alias_naut) {
        return cycl_utilities.formula_arg2(lf_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38394L)
    public static SubLObject lf_alias_fn_naut_index(final SubLObject lf_alias_naut) {
        return cycl_utilities.formula_arg1(lf_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38490L)
    public static SubLObject lf_fort_for_lf(final SubLObject lf) {
        if (sksi_kb_accessors.NIL != forts.fort_p(lf)) {
            return lf;
        }
        if (sksi_kb_accessors.NIL != lf_alias_fn_naut_p(lf)) {
            return lf_alias_fn_naut_lf(lf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38628L)
    public static SubLObject lf_alias_naut_for_lf_and_alias_index(final SubLObject lf_fort, final SubLObject alias_index) {
        return el_utilities.make_binary_formula(sksi_kb_accessors.$const128$LFAliasFn, alias_index, lf_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38769L)
    public static SubLObject logical_field_indexical_p(final SubLObject v_object) {
        return (sksi_kb_accessors.NIL != forts.fort_p(v_object)) ? logical_field_indexical_fort_p(v_object) : lfi_alias_fn_naut_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38983L)
    public static SubLObject logical_field_indexical_p_memoized_internal(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sksi_kb_accessors.NIL != nart_handles.nart_p(fort) && sksi_kb_accessors.NIL != kb_utilities.kbeq(sksi_kb_accessors.$const130$TheLogicalFieldValueFn, cycl_utilities.nat_functor(fort))) || sksi_kb_accessors.NIL != sksi_infrastructure_utilities.non_thelogicalfieldvaluefn_lfi_fort_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38983L)
    public static SubLObject logical_field_indexical_p_memoized(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_field_indexical_p_memoized_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_field_indexical_p_memoized_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39222L)
    public static SubLObject logical_field_indexical_fort_p(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sksi_kb_accessors.NIL != nart_handles.nart_p(fort) && sksi_kb_accessors.NIL != kb_utilities.kbeq(sksi_kb_accessors.$const130$TheLogicalFieldValueFn, cycl_utilities.nat_functor(fort))) || sksi_kb_accessors.NIL != sksi_infrastructure_utilities.non_thelogicalfieldvaluefn_lfi_fort_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39426L)
    public static SubLObject lfi_alias_fn_naut_p(final SubLObject v_object) {
        return (SubLObject)((sksi_kb_accessors.NIL != el_utilities.possibly_naut_p(v_object)) ? kb_utilities.kbeq(cycl_utilities.formula_operator(v_object), sksi_kb_accessors.$const131$LFIAliasFn) : sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39564L)
    public static SubLObject lfi_alias_fn_naut_lfi(final SubLObject lfi_alias_naut) {
        return cycl_utilities.formula_arg2(lfi_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39661L)
    public static SubLObject lfi_alias_fn_naut_index(final SubLObject lfi_alias_naut) {
        return cycl_utilities.formula_arg1(lfi_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39760L)
    public static SubLObject lfi_alias_naut_for_lfi_and_alias_index(final SubLObject lfi_fort, final SubLObject alias_index) {
        return el_utilities.make_binary_formula(sksi_kb_accessors.$const131$LFIAliasFn, alias_index, lfi_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39907L)
    public static SubLObject lfi_fort_for_lfi(final SubLObject lfi) {
        if (sksi_kb_accessors.NIL != forts.fort_p(lfi)) {
            return lfi;
        }
        if (sksi_kb_accessors.NIL != lfi_alias_fn_naut_p(lfi)) {
            return lfi_alias_fn_naut_lfi(lfi);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40056L)
    public static SubLObject lfi_index_for_lfi(final SubLObject lfi, SubLObject v_default) {
        if (v_default == sksi_kb_accessors.UNPROVIDED) {
            v_default = (SubLObject)sksi_kb_accessors.NIL;
        }
        return (sksi_kb_accessors.NIL != lfi_alias_fn_naut_p(lfi)) ? lfi_alias_fn_naut_index(lfi) : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40206L)
    public static SubLObject pfi_for_lfi(final SubLObject pfi, final SubLObject lfi) {
        if (sksi_kb_accessors.NIL != forts.fort_p(lfi)) {
            return pfi;
        }
        if (sksi_kb_accessors.NIL != lfi_alias_fn_naut_p(lfi)) {
            return pfi_alias_naut_for_pfi_and_alias_index(pfi, lfi_alias_fn_naut_index(lfi));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40400L)
    public static SubLObject lfi_for_pfi(final SubLObject lfi, final SubLObject pfi) {
        if (sksi_kb_accessors.NIL != forts.fort_p(pfi)) {
            return lfi;
        }
        if (sksi_kb_accessors.NIL != pfi_alias_fn_naut_p(pfi)) {
            return lfi_alias_naut_for_lfi_and_alias_index(lfi, pfi_alias_fn_naut_index(pfi));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40594L)
    public static SubLObject pf_for_lfi(final SubLObject pf, final SubLObject lfi) {
        if (sksi_kb_accessors.NIL != forts.fort_p(lfi)) {
            return pf;
        }
        if (sksi_kb_accessors.NIL != lfi_alias_fn_naut_p(lfi)) {
            return pf_alias_naut_for_pf_and_alias_index(pf, lfi_alias_fn_naut_index(lfi));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40783L)
    public static SubLObject logical_field_indexical_for_schemaP(final SubLObject lfi, final SubLObject ls) {
        if (sksi_kb_accessors.NIL != forts.fort_p(lfi)) {
            return logical_field_indexical_fort_for_schema(lfi, ls);
        }
        if (sksi_kb_accessors.NIL != lfi_alias_fn_naut_p(lfi)) {
            return logical_field_indexical_fort_for_schema(lfi_alias_fn_naut_lfi(lfi), ls);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41043L)
    public static SubLObject logical_field_indexical_fort_for_schema_internal(final SubLObject lfi, final SubLObject ls) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const98$logicalFieldIndexicals, ls, lfi, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41043L)
    public static SubLObject logical_field_indexical_fort_for_schema(final SubLObject lfi, final SubLObject ls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_field_indexical_fort_for_schema_internal(lfi, ls);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(lfi, ls);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lfi.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && ls.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_field_indexical_fort_for_schema_internal(lfi, ls)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lfi, ls));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41225L)
    public static SubLObject logical_field_for_schemaP(final SubLObject lf, final SubLObject ls) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const96$logicalFields, ls, lf, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41356L)
    public static SubLObject virtual_logical_field_indexical_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != logical_field_indexical_p(v_object) && sksi_kb_accessors.NIL != logical_field_indexical_virtualP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41518L)
    public static SubLObject logical_field_indexical_virtualP(final SubLObject logical_field_indexical) {
        final SubLObject lf = logical_field_for_indexical(logical_field_indexical);
        final SubLObject pf_list = sksi_get_mapped_physical_fields_for_logical_field(lf);
        SubLObject virtualP = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == virtualP) {
            SubLObject csome_list_var = pf_list;
            SubLObject pf = (SubLObject)sksi_kb_accessors.NIL;
            pf = csome_list_var.first();
            while (sksi_kb_accessors.NIL == virtualP && sksi_kb_accessors.NIL != csome_list_var) {
                if (sksi_kb_accessors.NIL != physical_field_virtualP(pf)) {
                    virtualP = (SubLObject)sksi_kb_accessors.T;
                }
                csome_list_var = csome_list_var.rest();
                pf = csome_list_var.first();
            }
        }
        return virtualP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41867L)
    public static SubLObject isa_logical_schemaP_internal(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_kb_accessors.$const134$LogicalSchema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41867L)
    public static SubLObject isa_logical_schemaP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return isa_logical_schemaP_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym133$ISA_LOGICAL_SCHEMA_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym133$ISA_LOGICAL_SCHEMA_, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym133$ISA_LOGICAL_SCHEMA_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(isa_logical_schemaP_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42128L)
    public static SubLObject isa_reified_mappingP(final SubLObject schema) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != forts.fort_p(schema) && sksi_kb_accessors.NIL != is_fort_a_reified_mappingP(schema));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42251L)
    public static SubLObject is_fort_a_reified_mappingP_internal(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, sksi_kb_accessors.$const136$ReifiedMapping);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42251L)
    public static SubLObject is_fort_a_reified_mappingP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return is_fort_a_reified_mappingP_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym135$IS_FORT_A_REIFIED_MAPPING_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym135$IS_FORT_A_REIFIED_MAPPING_, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym135$IS_FORT_A_REIFIED_MAPPING_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(is_fort_a_reified_mappingP_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42383L)
    public static SubLObject cycl_terms_mapped_to_by_code_mapping_schema_internal(final SubLObject code_mapping_schema) {
        return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_values(code_mapping_schema, sksi_kb_accessors.$const9$codeMapping, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42383L)
    public static SubLObject cycl_terms_mapped_to_by_code_mapping_schema(final SubLObject code_mapping_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return cycl_terms_mapped_to_by_code_mapping_schema_internal(code_mapping_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, code_mapping_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cycl_terms_mapped_to_by_code_mapping_schema_internal(code_mapping_schema)));
            memoization_state.caching_state_put(caching_state, code_mapping_schema, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42593L)
    public static SubLObject cyc_terms_corresponding_to_code_mapping_schema_code(final SubLObject code_mapping_schema, final SubLObject code) {
        final SubLObject code_mapping_gafs = kb_mapping_utilities.pred_u_v_holds_gafs_in_any_mt(sksi_kb_accessors.$const9$codeMapping, code_mapping_schema, code, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject v_answer = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = code_mapping_gafs;
        SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            v_answer = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg3(gaf), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(v_answer, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42934L)
    public static SubLObject cyc_terms_for_sksi_external_term_naut(final SubLObject naut) {
        SubLObject cyc_terms = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject functor = cycl_utilities.nat_functor(naut);
        if (sksi_kb_accessors.NIL != subl_promotions.memberP(functor, (SubLObject)sksi_kb_accessors.$list138, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
            SubLObject schema = (SubLObject)sksi_kb_accessors.NIL;
            SubLObject code = (SubLObject)sksi_kb_accessors.NIL;
            if (sksi_kb_accessors.NIL != kb_utilities.kbeq(functor, sksi_kb_accessors.$const139$SchemaObjectFn)) {
                schema = cycl_utilities.nat_arg1(naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                code = cycl_utilities.nat_arg2(naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            }
            else {
                schema = cycl_utilities.nat_arg2(naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                code = cycl_utilities.nat_arg3(naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            }
            cyc_terms = cyc_terms_corresponding_to_code_mapping_schema_code(schema, code);
        }
        return cyc_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43511L)
    public static SubLObject schema_isa_internal(final SubLObject code_mapping_schema, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return kb_mapping_utilities.pred_values(code_mapping_schema, sksi_kb_accessors.$const141$schemaIsa, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43511L)
    public static SubLObject schema_isa(final SubLObject code_mapping_schema, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return schema_isa_internal(code_mapping_schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym140$SCHEMA_ISA, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym140$SCHEMA_ISA, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym140$SCHEMA_ISA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(code_mapping_schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (code_mapping_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(schema_isa_internal(code_mapping_schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(code_mapping_schema, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43702L)
    public static SubLObject schema_object_field(final SubLObject object_defining_schema) {
        return kb_mapping_utilities.fpred_value(object_defining_schema, sksi_kb_accessors.$const142$objectField, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43836L)
    public static SubLObject schema_object_field_gaf(final SubLObject object_defining_schema, SubLObject object_field) {
        if (object_field == sksi_kb_accessors.UNPROVIDED) {
            object_field = (SubLObject)sksi_kb_accessors.NIL;
        }
        return (sksi_kb_accessors.NIL != object_field) ? kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const142$objectField, object_defining_schema, object_field, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE) : kb_mapping_utilities.fpred_value_gaf(object_defining_schema, sksi_kb_accessors.$const142$objectField, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44110L)
    public static SubLObject schema_object_id_fn_expression_p(final SubLObject expression) {
        return el_utilities.el_formula_with_operator_p(expression, sksi_kb_accessors.$const143$SchemaObjectIDFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44295L)
    public static SubLObject schema_object_fn_expression_p(final SubLObject expression) {
        return el_utilities.el_formula_with_operator_p(expression, sksi_kb_accessors.$const139$SchemaObjectFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44423L)
    public static SubLObject source_schema_object_id_fn_expression_p(final SubLObject expression) {
        return el_utilities.el_formula_with_operator_p(expression, sksi_kb_accessors.$const144$SourceSchemaObjectIDFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44569L)
    public static SubLObject source_schema_object_fn_expression_p(final SubLObject expression) {
        return el_utilities.el_formula_with_operator_p(expression, sksi_kb_accessors.$const145$SourceSchemaObjectFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44710L)
    public static SubLObject destructure_schema_object_fn_expression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list146);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ods = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject sub_expression = (SubLObject)sksi_kb_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list146);
        ods = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list146);
        sub_expression = current.first();
        current = current.rest();
        if (sksi_kb_accessors.NIL == current) {
            current = temp;
            SubLObject expression = (SubLObject)sksi_kb_accessors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list146);
            expression = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_kb_accessors.$sym147$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(ods, sub_expression), (SubLObject)ConsesLow.list((SubLObject)sksi_kb_accessors.$sym148$FORMULA_ARGS, expression), ConsesLow.append(body, (SubLObject)sksi_kb_accessors.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_kb_accessors.$list146);
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44937L)
    public static SubLObject destructure_source_schema_object_fn_expression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject ods = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject sub_expression = (SubLObject)sksi_kb_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list149);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list149);
        ods = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list149);
        sub_expression = current.first();
        current = current.rest();
        if (sksi_kb_accessors.NIL == current) {
            current = temp;
            SubLObject expression = (SubLObject)sksi_kb_accessors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list149);
            expression = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_kb_accessors.$sym147$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(sks, ods, sub_expression), (SubLObject)ConsesLow.list((SubLObject)sksi_kb_accessors.$sym148$FORMULA_ARGS, expression), ConsesLow.append(body, (SubLObject)sksi_kb_accessors.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_kb_accessors.$list149);
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45180L)
    public static SubLObject physical_field_for_indexical(final SubLObject indexical) {
        if (sksi_kb_accessors.NIL != forts.fort_p(indexical)) {
            return physical_field_for_indexical_fort(indexical);
        }
        if (sksi_kb_accessors.NIL != pfi_alias_fn_naut_p(indexical)) {
            return physical_field_for_pfi_alias_fn_naut(indexical);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45636L)
    public static SubLObject physical_field_for_indexical_fort_internal(final SubLObject indexical) {
        return kb_mapping_utilities.fpred_value(indexical, sksi_kb_accessors.$const151$indexicalForPhysicalField, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45636L)
    public static SubLObject physical_field_for_indexical_fort(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_for_indexical_fort_internal(indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_for_indexical_fort_internal(indexical)));
            memoization_state.caching_state_put(caching_state, indexical, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45805L)
    public static SubLObject physical_field_for_pfi_alias_fn_naut(final SubLObject indexical) {
        return physical_field_for_indexical(pfi_alias_fn_naut_pfi(indexical));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45945L)
    public static SubLObject indexical_for_physical_field_internal(final SubLObject pf) {
        return kb_mapping_utilities.fpred_value(pf, sksi_kb_accessors.$const151$indexicalForPhysicalField, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45945L)
    public static SubLObject indexical_for_physical_field(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return indexical_for_physical_field_internal(pf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym152$INDEXICAL_FOR_PHYSICAL_FIELD, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym152$INDEXICAL_FOR_PHYSICAL_FIELD, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym152$INDEXICAL_FOR_PHYSICAL_FIELD, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(indexical_for_physical_field_internal(pf)));
            memoization_state.caching_state_put(caching_state, pf, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46097L)
    public static SubLObject physical_fields_to_indexicals(final SubLObject physical_fields) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_fields;
        SubLObject pf = (SubLObject)sksi_kb_accessors.NIL;
        pf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject indexical = indexical_for_physical_field(pf);
            result = (SubLObject)ConsesLow.cons(indexical, result);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46339L)
    public static SubLObject indexicals_to_physical_fields(final SubLObject indexicals) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = indexicals;
        SubLObject pf = (SubLObject)sksi_kb_accessors.NIL;
        pf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject physical_field = physical_field_for_indexical(pf);
            result = (SubLObject)ConsesLow.cons(physical_field, result);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46580L)
    public static SubLObject not_null_physical_field_p(final SubLObject pf, final SubLObject ps) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const153$nonNullFields, ps, pf, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46875L)
    public static SubLObject not_null_physical_fields_for_ps_internal(final SubLObject ps, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_values(ps, sksi_kb_accessors.$const153$nonNullFields, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE), Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQ), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46875L)
    public static SubLObject not_null_physical_fields_for_ps(final SubLObject ps, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return not_null_physical_fields_for_ps_internal(ps, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ps, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (ps.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(not_null_physical_fields_for_ps_internal(ps, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(ps, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47362L)
    public static SubLObject physical_field_default_value_internal(final SubLObject pf, final SubLObject ps, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const157$defaultFieldValue, ps, pf, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        if (sksi_kb_accessors.NIL == assertions_high.gaf_assertionP(gaf)) {
            return sksi_kb_accessors.$sksi_default_field_value$.getGlobalValue();
        }
        final SubLObject value = assertions_high.gaf_arg3(gaf);
        if (sksi_kb_accessors.NIL != kb_utilities.kbeq(value, sksi_kb_accessors.$const158$ISNull)) {
            return (SubLObject)sksi_kb_accessors.$kw155$NULL;
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47362L)
    public static SubLObject physical_field_default_value(final SubLObject pf, final SubLObject ps, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_default_value_internal(pf, ps, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym156$PHYSICAL_FIELD_DEFAULT_VALUE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym156$PHYSICAL_FIELD_DEFAULT_VALUE, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym156$PHYSICAL_FIELD_DEFAULT_VALUE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pf, ps, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ps.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_default_value_internal(pf, ps, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pf, ps, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47749L)
    public static SubLObject null_default_physical_field_valueP(final SubLObject pf, final SubLObject ps) {
        return Equality.eq(physical_field_default_value(pf, ps, (SubLObject)sksi_kb_accessors.UNPROVIDED), (SubLObject)sksi_kb_accessors.$kw155$NULL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47868L)
    public static SubLObject physical_field_for_schema_and_name(final SubLObject ps, final SubLObject pf_name) {
        return narts_high.find_nart(el_utilities.list_to_elf((SubLObject)ConsesLow.list(sksi_kb_accessors.$const159$PhysicalFieldFn, ps, pf_name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48105L)
    public static SubLObject physical_field_schema_internal(final SubLObject physical_field) {
        if (sksi_kb_accessors.NIL != forts.fort_p(physical_field)) {
            return cycl_utilities.nat_arg1(physical_field, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        if (sksi_kb_accessors.NIL != pf_alias_fn_naut_p(physical_field)) {
            return physical_field_schema(pf_alias_fn_naut_pf(physical_field));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48105L)
    public static SubLObject physical_field_schema(final SubLObject physical_field) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_schema_internal(physical_field);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym160$PHYSICAL_FIELD_SCHEMA, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym160$PHYSICAL_FIELD_SCHEMA, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym160$PHYSICAL_FIELD_SCHEMA, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_field, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_schema_internal(physical_field)));
            memoization_state.caching_state_put(caching_state, physical_field, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48460L)
    public static SubLObject physical_field_name_internal(final SubLObject physical_field) {
        if (sksi_kb_accessors.NIL != forts.fort_p(physical_field)) {
            return cycl_utilities.nat_arg2(physical_field, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        if (sksi_kb_accessors.NIL != pf_alias_fn_naut_p(physical_field)) {
            return physical_field_name(pf_alias_fn_naut_pf(physical_field));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48460L)
    public static SubLObject physical_field_name(final SubLObject physical_field) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_name_internal(physical_field);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym81$PHYSICAL_FIELD_NAME, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym81$PHYSICAL_FIELD_NAME, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym81$PHYSICAL_FIELD_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_field, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_name_internal(physical_field)));
            memoization_state.caching_state_put(caching_state, physical_field, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48810L)
    public static SubLObject physical_field_indexical_name(final SubLObject indexical) {
        return physical_field_name(physical_field_for_indexical(indexical));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48943L)
    public static SubLObject physical_field_sk_source_internal(final SubLObject pf) {
        return physical_schema_sk_sources_memoized(physical_field_schema(pf)).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48943L)
    public static SubLObject physical_field_sk_source(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_sk_source_internal(pf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym161$PHYSICAL_FIELD_SK_SOURCE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym161$PHYSICAL_FIELD_SK_SOURCE, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym161$PHYSICAL_FIELD_SK_SOURCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_sk_source_internal(pf)));
            memoization_state.caching_state_put(caching_state, pf, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49120L)
    public static SubLObject physical_field_sk_source_name_internal(final SubLObject pf) {
        final SubLObject table_name = sk_source_name(physical_field_sk_source(pf));
        if (sksi_kb_accessors.NIL != pf_alias_fn_naut_p(pf)) {
            return sksi_csql_generation.make_table_alias_name(table_name, pf_alias_fn_naut_index(pf));
        }
        return table_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49120L)
    public static SubLObject physical_field_sk_source_name(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_sk_source_name_internal(pf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym162$PHYSICAL_FIELD_SK_SOURCE_NAME, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym162$PHYSICAL_FIELD_SK_SOURCE_NAME, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym162$PHYSICAL_FIELD_SK_SOURCE_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_sk_source_name_internal(pf)));
            memoization_state.caching_state_put(caching_state, pf, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49406L)
    public static SubLObject physical_field_sk_source_namespace_internal(final SubLObject pf) {
        return sk_source_namespace(physical_field_sk_source(pf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49406L)
    public static SubLObject physical_field_sk_source_namespace(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_sk_source_namespace_internal(pf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_sk_source_namespace_internal(pf)));
            memoization_state.caching_state_put(caching_state, pf, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49562L)
    public static SubLObject physical_field_indexical_schema(final SubLObject indexical) {
        if (sksi_kb_accessors.NIL != forts.fort_p(indexical)) {
            return cycl_utilities.nat_arg1(indexical, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        if (sksi_kb_accessors.NIL != pfi_alias_fn_naut_p(indexical)) {
            return physical_field_indexical_schema(pfi_alias_fn_naut_pfi(indexical));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49974L)
    public static SubLObject physical_field_indexical_sk_source_internal(final SubLObject indexical) {
        return physical_schema_sk_sources_memoized(physical_field_indexical_schema(indexical)).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49974L)
    public static SubLObject physical_field_indexical_sk_source(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_indexical_sk_source_internal(indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_indexical_sk_source_internal(indexical)));
            memoization_state.caching_state_put(caching_state, indexical, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50186L)
    public static SubLObject physical_field_indexical_sk_source_name_internal(final SubLObject indexical) {
        return sk_source_name(physical_field_indexical_sk_source(indexical));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50186L)
    public static SubLObject physical_field_indexical_sk_source_name(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_indexical_sk_source_name_internal(indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_indexical_sk_source_name_internal(indexical)));
            memoization_state.caching_state_put(caching_state, indexical, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50366L)
    public static SubLObject physical_field_indexical_sk_source_namespace_internal(final SubLObject indexical) {
        return sk_source_namespace(physical_field_indexical_sk_source(indexical));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50366L)
    public static SubLObject physical_field_indexical_sk_source_namespace(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_indexical_sk_source_namespace_internal(indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_indexical_sk_source_namespace_internal(indexical)));
            memoization_state.caching_state_put(caching_state, indexical, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50556L)
    public static SubLObject physical_field_p(final SubLObject v_object) {
        if (sksi_kb_accessors.NIL != nart_handles.nart_p(v_object)) {
            return kb_utilities.kbeq(sksi_kb_accessors.$const159$PhysicalFieldFn, cycl_utilities.nat_function(v_object));
        }
        if (sksi_kb_accessors.NIL != narts_high.naut_p(v_object)) {
            return pf_alias_fn_naut_p(v_object);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50800L)
    public static SubLObject virtual_physical_field_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != physical_field_p(v_object) && sksi_kb_accessors.NIL != physical_field_virtualP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50931L)
    public static SubLObject physical_field_virtualP_internal(final SubLObject physical_field) {
        if (sksi_kb_accessors.NIL != nart_handles.nart_p(physical_field) && sksi_kb_accessors.NIL != kb_utilities.kbeq(sksi_kb_accessors.$const168$VirtualPhysicalFieldFn, cycl_utilities.nat_functor(physical_field))) {
            return (SubLObject)sksi_kb_accessors.T;
        }
        if (sksi_kb_accessors.NIL != forts.fort_p(physical_field)) {
            return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(physical_field, sksi_kb_accessors.$const169$virtualPhysicalFields, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
        }
        if (sksi_kb_accessors.NIL != pf_alias_fn_naut_p(physical_field)) {
            return physical_field_virtualP(pf_alias_fn_naut_pf(physical_field));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50931L)
    public static SubLObject physical_field_virtualP(final SubLObject physical_field) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_virtualP_internal(physical_field);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym167$PHYSICAL_FIELD_VIRTUAL_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym167$PHYSICAL_FIELD_VIRTUAL_, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym167$PHYSICAL_FIELD_VIRTUAL_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_field, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_virtualP_internal(physical_field)));
            memoization_state.caching_state_put(caching_state, physical_field, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51386L)
    public static SubLObject pf_alias_fn_naut_p(final SubLObject v_object) {
        if (sksi_kb_accessors.NIL != narts_high.naut_p(v_object)) {
            return kb_utilities.kbeq(cycl_utilities.formula_operator(v_object), sksi_kb_accessors.$const170$PFAliasFn);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51515L)
    public static SubLObject pf_alias_fn_naut_pf(final SubLObject pf_alias_naut) {
        return cycl_utilities.formula_arg2(pf_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51610L)
    public static SubLObject pf_alias_fn_naut_index(final SubLObject pf_alias_naut) {
        return cycl_utilities.formula_arg1(pf_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51706L)
    public static SubLObject pf_fort_for_pf(final SubLObject pf) {
        if (sksi_kb_accessors.NIL != forts.fort_p(pf)) {
            return pf;
        }
        if (sksi_kb_accessors.NIL != pf_alias_fn_naut_p(pf)) {
            return pf_alias_fn_naut_pf(pf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51844L)
    public static SubLObject pf_alias_naut_for_pf_and_alias_index(final SubLObject pf_fort, final SubLObject alias_index) {
        return el_utilities.make_binary_formula(sksi_kb_accessors.$const170$PFAliasFn, alias_index, pf_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51985L)
    public static SubLObject physical_field_indexical_p(final SubLObject v_object) {
        if (sksi_kb_accessors.NIL != nart_handles.nart_p(v_object)) {
            return kb_utilities.kbeq(sksi_kb_accessors.$const171$ThePhysicalFieldValueFn, cycl_utilities.nat_function(v_object));
        }
        if (sksi_kb_accessors.NIL != pfi_alias_fn_naut_p(v_object)) {
            return (SubLObject)sksi_kb_accessors.T;
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52385L)
    public static SubLObject virtual_physical_field_indexical_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL != physical_field_indexical_p(v_object) && sksi_kb_accessors.NIL != physical_field_indexical_virtualP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52547L)
    public static SubLObject physical_field_indexical_virtualP(final SubLObject physical_field_indexical) {
        final SubLObject physical_field = physical_field_for_indexical(physical_field_indexical);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_kb_accessors.NIL == physical_field || sksi_kb_accessors.NIL != physical_field_virtualP(physical_field));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52798L)
    public static SubLObject pfi_alias_fn_naut_p(final SubLObject v_object) {
        if (sksi_kb_accessors.NIL != el_utilities.possibly_naut_p(v_object)) {
            return kb_utilities.kbeq(cycl_utilities.formula_operator(v_object), sksi_kb_accessors.$const172$PFIAliasFn);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52938L)
    public static SubLObject pfi_alias_fn_naut_pfi(final SubLObject pfi_alias_naut) {
        return cycl_utilities.formula_arg2(pfi_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53037L)
    public static SubLObject pfi_alias_fn_naut_index(final SubLObject pfi_alias_naut) {
        return cycl_utilities.formula_arg1(pfi_alias_naut, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53136L)
    public static SubLObject pfi_alias_naut_for_pfi_and_alias_index(final SubLObject pfi_fort, final SubLObject alias_index) {
        return el_utilities.make_binary_formula(sksi_kb_accessors.$const172$PFIAliasFn, alias_index, pfi_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53282L)
    public static SubLObject pfi_fort_for_pfi(final SubLObject pfi) {
        if (sksi_kb_accessors.NIL != forts.fort_p(pfi)) {
            return pfi;
        }
        if (sksi_kb_accessors.NIL != pfi_alias_fn_naut_p(pfi)) {
            return pfi_alias_fn_naut_pfi(pfi);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53430L)
    public static SubLObject pfi_index_for_pfi(final SubLObject pfi, SubLObject v_default) {
        if (v_default == sksi_kb_accessors.UNPROVIDED) {
            v_default = (SubLObject)sksi_kb_accessors.NIL;
        }
        return (sksi_kb_accessors.NIL != pfi_alias_fn_naut_p(pfi)) ? pfi_alias_fn_naut_index(pfi) : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53580L)
    public static SubLObject physical_schema_for_sks_name_internal(final SubLObject name) {
        final SubLObject ks = sk_source_by_sks_name(name, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        return sk_source_physical_schemata(ks).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53580L)
    public static SubLObject physical_schema_for_sks_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_schema_for_sks_name_internal(name);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_schema_for_sks_name_internal(name)));
            memoization_state.caching_state_put(caching_state, name, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53780L)
    public static SubLObject physical_field_indexical_for_sks_and_field_names_internal(final SubLObject table_name, final SubLObject field_name, final SubLObject from_expression) {
        SubLObject physical_schema = physical_schema_for_sks_name(table_name);
        SubLObject alias_index = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject pfi_el = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject pfi_fort = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == physical_schema && sksi_kb_accessors.NIL != from_expression) {
            final SubLObject physical_schema_name = conses_high.second(Sequences.find(table_name, from_expression, Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQUAL), Symbols.symbol_function((SubLObject)sksi_kb_accessors.$sym175$THIRD), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED));
            physical_schema = physical_schema_for_sks_name(physical_schema_name);
            alias_index = string_utilities.string_to_integer(string_utilities.pre_remove(table_name, physical_schema_name, (SubLObject)sksi_kb_accessors.UNPROVIDED));
        }
        pfi_el = el_utilities.make_binary_formula(sksi_kb_accessors.$const171$ThePhysicalFieldValueFn, physical_schema, field_name);
        pfi_fort = narts_high.find_nart(pfi_el);
        if (sksi_kb_accessors.NIL != alias_index) {
            return pfi_alias_naut_for_pfi_and_alias_index(pfi_fort, alias_index);
        }
        return pfi_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53780L)
    public static SubLObject physical_field_indexical_for_sks_and_field_names(final SubLObject table_name, final SubLObject field_name, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_indexical_for_sks_and_field_names_internal(table_name, field_name, from_expression);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(table_name, field_name, from_expression);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (table_name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (field_name.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && from_expression.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_indexical_for_sks_and_field_names_internal(table_name, field_name, from_expression)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(table_name, field_name, from_expression));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54600L)
    public static SubLObject indexicals_for_physical_fields(final SubLObject pfs) {
        return Mapping.mapcar((SubLObject)sksi_kb_accessors.$sym152$INDEXICAL_FOR_PHYSICAL_FIELD, pfs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54709L)
    public static SubLObject integer_sequence_generator_for_physical_field_internal(final SubLObject pf) {
        return kb_mapping_utilities.fpred_value(pf, sksi_kb_accessors.$const177$integerSequenceGeneratorIncrement, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54709L)
    public static SubLObject integer_sequence_generator_for_physical_field(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return integer_sequence_generator_for_physical_field_internal(pf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(integer_sequence_generator_for_physical_field_internal(pf)));
            memoization_state.caching_state_put(caching_state, pf, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54890L)
    public static SubLObject integer_sequence_generator_name_internal(final SubLObject seq) {
        return kb_mapping_utilities.fpred_value(seq, sksi_kb_accessors.$const179$integerSequenceGeneratorName, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54890L)
    public static SubLObject integer_sequence_generator_name(final SubLObject seq) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return integer_sequence_generator_name_internal(seq);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym178$INTEGER_SEQUENCE_GENERATOR_NAME, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym178$INTEGER_SEQUENCE_GENERATOR_NAME, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym178$INTEGER_SEQUENCE_GENERATOR_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, seq, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(integer_sequence_generator_name_internal(seq)));
            memoization_state.caching_state_put(caching_state, seq, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55048L)
    public static SubLObject integer_sequence_generator_name_for_physical_field(final SubLObject pf) {
        return integer_sequence_generator_name(integer_sequence_generator_for_physical_field(pf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55218L)
    public static SubLObject physical_field_value_is_auto_incrementedP_internal(final SubLObject pf, final SubLObject ps) {
        final SubLObject default_value = physical_field_default_value(pf, ps, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        return el_utilities.el_formula_with_operator_p(default_value, sksi_kb_accessors.$const181$TheNextSequenceValueFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55218L)
    public static SubLObject physical_field_value_is_auto_incrementedP(final SubLObject pf, final SubLObject ps) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return physical_field_value_is_auto_incrementedP_internal(pf, ps);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pf, ps);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && ps.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_value_is_auto_incrementedP_internal(pf, ps)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pf, ps));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55594L)
    public static SubLObject logical_field_for_indexical(final SubLObject indexical) {
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL != forts.fort_p(indexical)) {
            result = logical_field_for_indexical_fort(indexical);
        }
        else if (sksi_kb_accessors.NIL != lfi_alias_fn_naut_p(indexical)) {
            result = logical_field_for_lfi_alias_fn_naut(indexical);
        }
        return (sksi_kb_accessors.NIL != result) ? result : Errors.error((SubLObject)sksi_kb_accessors.$str182$logical_field_indexical_without_c, indexical);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56051L)
    public static SubLObject logical_field_for_indexical_fort_internal(final SubLObject indexical) {
        return kb_mapping_utilities.fpred_value(indexical, sksi_kb_accessors.$const184$indexicalForLogicalField, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56051L)
    public static SubLObject logical_field_for_indexical_fort(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_field_for_indexical_fort_internal(indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_field_for_indexical_fort_internal(indexical)));
            memoization_state.caching_state_put(caching_state, indexical, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56216L)
    public static SubLObject logical_field_for_lfi_alias_fn_naut(final SubLObject indexical) {
        return logical_field_for_indexical(lfi_alias_fn_naut_lfi(indexical));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56354L)
    public static SubLObject lfi_for_lf(final SubLObject lf) {
        if (sksi_kb_accessors.NIL != forts.fort_p(lf)) {
            return indexical_for_logical_field(lf);
        }
        if (sksi_kb_accessors.NIL != lf_alias_fn_naut_p(lf)) {
            return lfi_alias_naut_for_lfi_and_alias_index(indexical_for_logical_field(lf_alias_fn_naut_lf(lf)), lf_alias_fn_naut_index(lf));
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56619L)
    public static SubLObject indexical_for_logical_field_internal(final SubLObject lf) {
        return kb_mapping_utilities.fpred_value(lf, sksi_kb_accessors.$const184$indexicalForLogicalField, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56619L)
    public static SubLObject indexical_for_logical_field(final SubLObject lf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return indexical_for_logical_field_internal(lf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym185$INDEXICAL_FOR_LOGICAL_FIELD, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym185$INDEXICAL_FOR_LOGICAL_FIELD, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym185$INDEXICAL_FOR_LOGICAL_FIELD, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, lf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(indexical_for_logical_field_internal(lf)));
            memoization_state.caching_state_put(caching_state, lf, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56768L)
    public static SubLObject logical_fields_for_indexicals(final SubLObject indexicals) {
        return Mapping.mapcar((SubLObject)sksi_kb_accessors.$sym186$LOGICAL_FIELD_FOR_INDEXICAL, indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56889L)
    public static SubLObject indexicals_for_logical_fields(final SubLObject lfs) {
        return Mapping.mapcar((SubLObject)sksi_kb_accessors.$sym185$INDEXICAL_FOR_LOGICAL_FIELD, lfs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56995L)
    public static SubLObject logical_field_schema(final SubLObject logical_field) {
        return cycl_utilities.nat_arg1(logical_field, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57117L)
    public static SubLObject logical_field_indexical_schema(final SubLObject logical_field_indexical) {
        return cycl_utilities.nat_arg1(lfi_fort_for_lfi(logical_field_indexical), (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57288L)
    public static SubLObject logical_field_indexical_sk_source_internal(final SubLObject indexical) {
        return logical_schema_sk_sources_memoized(logical_field_indexical_schema(indexical)).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57288L)
    public static SubLObject logical_field_indexical_sk_source(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_field_indexical_sk_source_internal(indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_field_indexical_sk_source_internal(indexical)));
            memoization_state.caching_state_put(caching_state, indexical, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57496L)
    public static SubLObject logical_field_joinable_fields(final SubLObject logical_field, SubLObject mt) {
        if (mt == sksi_kb_accessors.UNPROVIDED) {
            mt = (SubLObject)sksi_kb_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fields = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_use_sksiP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)sksi_kb_accessors.T, thread);
            gt_vars.$gt_use_sksiP$.bind((SubLObject)sksi_kb_accessors.NIL, thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)sksi_kb_accessors.$sym188$RELEVANT_PRED_IS_EQ, thread);
            fields = gt_methods.gt_all_accessible(sksi_kb_accessors.$const189$joinable, logical_field, mt);
        }
        finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_use_sksiP$.rebind(_prev_bind_2, thread);
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return fields;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57835L)
    public static SubLObject logical_fields_joinableP_internal(final SubLObject lf1, final SubLObject lf2, SubLObject mt) {
        if (mt == sksi_kb_accessors.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject joinableP = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_use_sksiP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)sksi_kb_accessors.T, thread);
            gt_vars.$gt_use_sksiP$.bind((SubLObject)sksi_kb_accessors.NIL, thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)sksi_kb_accessors.$sym188$RELEVANT_PRED_IS_EQ, thread);
            joinableP = gt_methods.gt_booleanP(sksi_kb_accessors.$const189$joinable, lf1, lf2, mt);
        }
        finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_use_sksiP$.rebind(_prev_bind_2, thread);
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return joinableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57835L)
    public static SubLObject logical_fields_joinableP(final SubLObject lf1, final SubLObject lf2, SubLObject mt) {
        if (mt == sksi_kb_accessors.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return logical_fields_joinableP_internal(lf1, lf2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym190$LOGICAL_FIELDS_JOINABLE_, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym190$LOGICAL_FIELDS_JOINABLE_, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym190$LOGICAL_FIELDS_JOINABLE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lf1, lf2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lf1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lf2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_fields_joinableP_internal(lf1, lf2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lf1, lf2, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 58147L)
    public static SubLObject extract_logical_fields(final SubLObject expression, final SubLObject all_logical_fields) {
        final SubLObject all_logical_field_indexicals = indexicals_for_logical_fields(all_logical_fields);
        final SubLObject relevant_logical_field_indexicals = extract_logical_field_indexicals(expression, all_logical_field_indexicals);
        return logical_fields_for_indexicals(relevant_logical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 58519L)
    public static SubLObject extract_logical_field_indexicals(final SubLObject expression, final SubLObject all_logical_field_indexicals) {
        return cycl_utilities.remove_if_not_in_expression(all_logical_field_indexicals, expression, (SubLObject)sksi_kb_accessors.T, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 58709L)
    public static SubLObject sksi_determine_relevant_logical_fields(final SubLObject physical_fields, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLObject all_logical_fields = logical_schema_fields(logical_schema);
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = physical_fields;
        SubLObject pf = (SubLObject)sksi_kb_accessors.NIL;
        pf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject logical_fields = sksi_determine_relevant_logical_fields_for_physical_field_via_decoding(pf, physical_schema, all_logical_fields, logical_schema);
            result = ConsesLow.nconc(result, logical_fields);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        result = list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 59209L)
    public static SubLObject sksi_determine_relevant_logical_fields_for_physical_field_via_decoding(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject all_logical_fields, final SubLObject logical_schema) {
        final SubLObject field_decoding_gafs = sksi_field_translation_utilities.get_field_decoding_gafs_from_physical_field_indexical(pfi_fort_for_pfi(indexical_for_physical_field(physical_field)), (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema));
        SubLObject logical_fields = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = field_decoding_gafs;
        SubLObject field_decoding_gaf = (SubLObject)sksi_kb_accessors.NIL;
        field_decoding_gaf = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            logical_fields = ConsesLow.nconc(logical_fields, extract_logical_fields(assertions_high.gaf_arg2(field_decoding_gaf), all_logical_fields));
            cdolist_list_var = cdolist_list_var.rest();
            field_decoding_gaf = cdolist_list_var.first();
        }
        return logical_fields;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 59793L)
    public static SubLObject sksi_determine_logical_field_indexicals_relevant_to_physical_field(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema) {
        return list_utilities.fast_delete_duplicates(ConsesLow.append(sksi_determine_logical_field_indexicals_relevant_to_physical_field_int1(physical_field, physical_schema, logical_schema), sksi_determine_logical_field_indexicals_relevant_to_physical_field_int2(physical_field, physical_schema, logical_schema)), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 60407L)
    public static SubLObject sksi_determine_logical_field_indexicals_relevant_to_physical_field_int1(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema) {
        return Mapping.mapcar((SubLObject)sksi_kb_accessors.$sym185$INDEXICAL_FOR_LOGICAL_FIELD, sksi_get_all_mapped_logical_fields_for_physical_field(physical_field));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 60712L)
    public static SubLObject sksi_determine_logical_field_indexicals_relevant_to_physical_field_int2(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLObject field_encodings = sksi_field_translation_utilities.relevant_field_encodings(physical_field, physical_schema, logical_schema);
        SubLObject logical_field_indexicals = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = field_encodings;
        SubLObject field_encoding = (SubLObject)sksi_kb_accessors.NIL;
        field_encoding = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals(field_encoding);
            logical_field_indexicals = ConsesLow.nconc(logical_field_indexicals, lfis);
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(logical_field_indexicals, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 61618L)
    public static SubLObject logical_field_isa(final SubLObject logical_field) {
        return kb_mapping_utilities.pred_values(logical_field, sksi_kb_accessors.$const191$fieldIsa, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 61729L)
    public static SubLObject logical_field_type_list(final SubLObject ls) {
        final SubLObject el_list = kb_mapping_utilities.fpred_value(ls, sksi_kb_accessors.$const192$logicalSchemaFieldTypeList, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        return (SubLObject)((sksi_kb_accessors.NIL != el_list) ? el_utilities.el_list_items(el_list) : sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 61895L)
    public static SubLObject logical_field_mappings(final SubLObject lf) {
        return kb_mapping_utilities.pred_values(lf, sksi_kb_accessors.$const193$logicalFieldMapping, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62000L)
    public static SubLObject sksi_get_mapped_physical_fields_for_logical_field_int_internal(final SubLObject lf, final SubLObject pred, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        if (sksi_kb_accessors.NIL != lf_alias_fn_naut_p(lf)) {
            final SubLObject lf_fort = lf_alias_fn_naut_lf(lf);
            final SubLObject index = lf_alias_fn_naut_index(lf);
            final SubLObject pf_fort_list = sksi_get_mapped_physical_fields_for_logical_field_int_2(lf_fort, pred);
            SubLObject v_answer = (SubLObject)sksi_kb_accessors.NIL;
            SubLObject cdolist_list_var = pf_fort_list;
            SubLObject pf_fort = (SubLObject)sksi_kb_accessors.NIL;
            pf_fort = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                v_answer = (SubLObject)ConsesLow.cons(pf_alias_naut_for_pf_and_alias_index(pf_fort, index), v_answer);
                cdolist_list_var = cdolist_list_var.rest();
                pf_fort = cdolist_list_var.first();
            }
            return Sequences.nreverse(v_answer);
        }
        return sksi_get_mapped_physical_fields_for_logical_field_int_2(lf, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62000L)
    public static SubLObject sksi_get_mapped_physical_fields_for_logical_field_int(final SubLObject lf, final SubLObject pred, SubLObject mt_info) {
        if (mt_info == sksi_kb_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sksi_get_mapped_physical_fields_for_logical_field_int_internal(lf, pred, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQUAL, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lf, pred, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lf.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_get_mapped_physical_fields_for_logical_field_int_internal(lf, pred, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lf, pred, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62660L)
    public static SubLObject sksi_get_mapped_physical_fields_for_logical_field_int_2(final SubLObject lf, final SubLObject pred) {
        return kb_mapping_utilities.pred_values(lf, pred, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62784L)
    public static SubLObject sksi_get_mapped_physical_fields_for_logical_field(final SubLObject logical_field) {
        return sksi_get_mapped_physical_fields_for_logical_field_int(logical_field, sksi_kb_accessors.$const195$logicalPhysicalFieldMap, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62974L)
    public static SubLObject sksi_get_decoding_mapped_physical_fields_for_logical_field(final SubLObject logical_field) {
        return sksi_get_mapped_physical_fields_for_logical_field_int(logical_field, sksi_kb_accessors.$const196$logicalPhysicalFieldMap_DecodeClo, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 63183L)
    public static SubLObject sksi_get_encoding_mapped_physical_fields_for_logical_field(final SubLObject logical_field) {
        return sksi_get_mapped_physical_fields_for_logical_field_int(logical_field, sksi_kb_accessors.$const197$logicalPhysicalFieldMap_EncodeClo, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 63392L)
    public static SubLObject sksi_get_mapped_logical_fields_for_physical_field_int(final SubLObject pf, final SubLObject pred) {
        if (sksi_kb_accessors.NIL != pf_alias_fn_naut_p(pf)) {
            final SubLObject pf_fort = pf_alias_fn_naut_pf(pf);
            final SubLObject index = pf_alias_fn_naut_index(pf);
            final SubLObject lf_fort_list = sksi_get_mapped_logical_fields_for_physical_field_int_2(pf_fort, pred);
            SubLObject v_answer = (SubLObject)sksi_kb_accessors.NIL;
            SubLObject cdolist_list_var = lf_fort_list;
            SubLObject lf_fort = (SubLObject)sksi_kb_accessors.NIL;
            lf_fort = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                v_answer = (SubLObject)ConsesLow.cons(lf_alias_naut_for_lf_and_alias_index(lf_fort, index), v_answer);
                cdolist_list_var = cdolist_list_var.rest();
                lf_fort = cdolist_list_var.first();
            }
            return Sequences.nreverse(v_answer);
        }
        return sksi_get_mapped_logical_fields_for_physical_field_int_2(pf, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 63925L)
    public static SubLObject sksi_get_mapped_logical_fields_for_physical_field_int_2(final SubLObject pf, final SubLObject pred) {
        return kb_mapping_utilities.pred_values(pf, pred, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64049L)
    public static SubLObject sksi_get_mapped_logical_fields_for_physical_field(final SubLObject physical_field) {
        return sksi_get_mapped_logical_fields_for_physical_field_int(physical_field, sksi_kb_accessors.$const195$logicalPhysicalFieldMap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64239L)
    public static SubLObject sksi_get_decoding_mapped_logical_fields_for_physical_field(final SubLObject physical_field) {
        return sksi_get_mapped_logical_fields_for_physical_field_int(physical_field, sksi_kb_accessors.$const196$logicalPhysicalFieldMap_DecodeClo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64450L)
    public static SubLObject sksi_get_encoding_mapped_logical_fields_for_physical_field(final SubLObject physical_field) {
        return sksi_get_mapped_logical_fields_for_physical_field_int(physical_field, sksi_kb_accessors.$const197$logicalPhysicalFieldMap_EncodeClo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64661L)
    public static SubLObject sksi_get_all_mapped_logical_fields_for_physical_field(final SubLObject physical_field) {
        return list_utilities.fast_delete_duplicates(ConsesLow.append(sksi_get_mapped_logical_fields_for_physical_field(physical_field), sksi_get_decoding_mapped_logical_fields_for_physical_field(physical_field), sksi_get_encoding_mapped_logical_fields_for_physical_field(physical_field)), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65016L)
    public static SubLObject physical_field_data_type_name(final SubLObject pf, final SubLObject dbms) {
        final SubLObject pf_type = physical_field_data_type(pf);
        final SubLObject type_name = data_type_name(pf_type, dbms);
        return type_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65294L)
    public static SubLObject physical_field_data_type(final SubLObject pf) {
        return kb_mapping_utilities.fpred_value(pf_fort_for_pf(pf), sksi_kb_accessors.$const198$fieldDataType, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65412L)
    public static SubLObject boolean_physical_field_p(final SubLObject pf) {
        return kb_utilities.kbeq(physical_field_data_type(pf), sksi_kb_accessors.$const199$SQLBoolean);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65521L)
    public static SubLObject data_type_name(final SubLObject type, final SubLObject dbms) {
        final SubLObject gaf = kb_mapping_utilities.pred_u_v_holds_gafs(sksi_kb_accessors.$const200$programDataTypeNameString, dbms, type, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE).first();
        if (sksi_kb_accessors.NIL != assertions_high.gaf_assertionP(gaf)) {
            return assertions_high.gaf_arg3(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65722L)
    public static SubLObject data_type_by_name(final SubLObject name, final SubLObject dbms) {
        final SubLObject name_gafs = kb_mapping_utilities.pred_value_gafs(dbms, sksi_kb_accessors.$const200$programDataTypeNameString, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        SubLObject v_answer = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_answer) {
            SubLObject csome_list_var = name_gafs;
            SubLObject gaf = (SubLObject)sksi_kb_accessors.NIL;
            gaf = csome_list_var.first();
            while (sksi_kb_accessors.NIL == v_answer && sksi_kb_accessors.NIL != csome_list_var) {
                if (assertions_high.gaf_arg3(gaf).equal(name)) {
                    v_answer = assertions_high.gaf_arg1(gaf);
                }
                csome_list_var = csome_list_var.rest();
                gaf = csome_list_var.first();
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66115L)
    public static SubLObject physical_schema_indexes(final SubLObject ps) {
        return kb_mapping_utilities.pred_values(ps, sksi_kb_accessors.$const201$schemaFieldsIndex, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.FOUR_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66334L)
    public static SubLObject index_physical_fields(final SubLObject index) {
        return kb_mapping_utilities.fpred_value(index, sksi_kb_accessors.$const201$schemaFieldsIndex, (SubLObject)sksi_kb_accessors.FOUR_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66443L)
    public static SubLObject index_type(final SubLObject index) {
        return kb_mapping_utilities.fpred_value(index, sksi_kb_accessors.$const202$indexType, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66532L)
    public static SubLObject index_name(final SubLObject index) {
        return kb_mapping_utilities.fpred_value(index, sksi_kb_accessors.$const203$indexName, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66621L)
    public static SubLObject index_type_namestring(final SubLObject type, final SubLObject dbms) {
        final SubLObject gaf = kb_mapping_utilities.pred_u_v_holds_gafs(sksi_kb_accessors.$const204$programIndexTypeNameString, dbms, type, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE).first();
        if (sksi_kb_accessors.NIL != assertions_high.gaf_assertionP(gaf)) {
            return assertions_high.gaf_arg3(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66835L)
    public static SubLObject cycl_operator_to_csql_operator_internal(final SubLObject operator) {
        return kb_mapping_utilities.fpred_value(operator, sksi_kb_accessors.$const206$cyclOperatorToCSQLOperator, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66835L)
    public static SubLObject cycl_operator_to_csql_operator(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return cycl_operator_to_csql_operator_internal(operator);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, operator, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cycl_operator_to_csql_operator_internal(operator)));
            memoization_state.caching_state_put(caching_state, operator, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67113L)
    public static SubLObject csql_operator_to_cycl_operator_internal(final SubLObject operator) {
        return kb_mapping_utilities.fpred_value(operator, sksi_kb_accessors.$const206$cyclOperatorToCSQLOperator, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67113L)
    public static SubLObject csql_operator_to_cycl_operator(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return csql_operator_to_cycl_operator_internal(operator);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, operator, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(csql_operator_to_cycl_operator_internal(operator)));
            memoization_state.caching_state_put(caching_state, operator, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67278L)
    public static SubLObject csql_operator_to_sql_operator_internal(final SubLObject operator, final SubLObject sql_flavor) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const209$csqlOperatorToSQLOperator, operator, sql_flavor, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        if (sksi_kb_accessors.NIL != gaf) {
            return assertions_high.gaf_arg2(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67278L)
    public static SubLObject csql_operator_to_sql_operator(final SubLObject operator, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return csql_operator_to_sql_operator_internal(operator, sql_flavor);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym208$CSQL_OPERATOR_TO_SQL_OPERATOR, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym208$CSQL_OPERATOR_TO_SQL_OPERATOR, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym208$CSQL_OPERATOR_TO_SQL_OPERATOR, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, sql_flavor);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && sql_flavor.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(csql_operator_to_sql_operator_internal(operator, sql_flavor)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(operator, sql_flavor));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67523L)
    public static SubLObject csql_operator_to_sql_operator_syntax_internal(final SubLObject operator, final SubLObject sql_flavor) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const209$csqlOperatorToSQLOperator, operator, sql_flavor, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.THREE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        if (sksi_kb_accessors.NIL != gaf) {
            return assertions_high.gaf_arg4(gaf);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67523L)
    public static SubLObject csql_operator_to_sql_operator_syntax(final SubLObject operator, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return csql_operator_to_sql_operator_syntax_internal(operator, sql_flavor);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, sql_flavor);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && sql_flavor.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(csql_operator_to_sql_operator_syntax_internal(operator, sql_flavor)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(operator, sql_flavor));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67776L)
    public static SubLObject csql_operator_to_sql_prefix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor) {
        return kb_utilities.kbeq(sksi_kb_accessors.$const211$SQLOperatorSyntax_Prefix, csql_operator_to_sql_operator_syntax(operator, sql_flavor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67964L)
    public static SubLObject csql_operator_to_sql_infix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor) {
        return kb_utilities.kbeq(sksi_kb_accessors.$const212$SQLOperatorSyntax_Infix, csql_operator_to_sql_operator_syntax(operator, sql_flavor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68150L)
    public static SubLObject csql_operator_to_sql_postfix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor) {
        return kb_utilities.kbeq(sksi_kb_accessors.$const213$SQLOperatorSyntax_Postfix, csql_operator_to_sql_operator_syntax(operator, sql_flavor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68340L)
    public static SubLObject csql_operator_to_sql_inverse_infix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor) {
        return kb_utilities.kbeq(sksi_kb_accessors.$const214$SQLOperatorSyntax_InverseInfix, csql_operator_to_sql_operator_syntax(operator, sql_flavor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68541L)
    public static SubLObject csql_operator_to_sql_function_syntaxP(final SubLObject operator, final SubLObject sql_flavor) {
        return kb_utilities.kbeq(sksi_kb_accessors.$const215$SQLFunctionSyntax, csql_operator_to_sql_operator_syntax(operator, sql_flavor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68715L)
    public static SubLObject csql_to_sql_translation_format_gaf_internal(final SubLObject operator, final SubLObject sql_flavor) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_kb_accessors.$const217$csqlToSQLTranslationFormat, operator, sql_flavor, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68715L)
    public static SubLObject csql_to_sql_translation_format_gaf(final SubLObject operator, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return csql_to_sql_translation_format_gaf_internal(operator, sql_flavor);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, sql_flavor);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_kb_accessors.NIL;
            collision = cdolist_list_var.first();
            while (sksi_kb_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_kb_accessors.NIL != cached_args && sksi_kb_accessors.NIL == cached_args.rest() && sql_flavor.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(csql_to_sql_translation_format_gaf_internal(operator, sql_flavor)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(operator, sql_flavor));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68938L)
    public static SubLObject sksi_mapping_mt_p(final SubLObject mt) {
        return isa.isa_in_any_mtP(mt, sksi_kb_accessors.$const218$SKSIMappingMicrotheory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69256L)
    public static SubLObject get_genl_content_mts_for_sks(final SubLObject sks) {
        return get_genl_content_mts_for_mt(sk_source_content_mt(sks));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69376L)
    public static SubLObject get_genl_content_mts_for_mt(final SubLObject mt) {
        return genl_mts.all_genl_mts_if(mt, (SubLObject)sksi_kb_accessors.$sym219$SKSI_CONTENT_MT_P, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69543L)
    public static SubLObject sksi_content_mt_p(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)sksi_kb_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
            v_answer = fort_types_interface.isa_sksi_content_microtheoryP(mt, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
    public static SubLObject clear_sksi_content_mts() {
        final SubLObject cs = sksi_kb_accessors.$sksi_content_mts_caching_state$.getGlobalValue();
        if (sksi_kb_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
    public static SubLObject remove_sksi_content_mts() {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_kb_accessors.$sksi_content_mts_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sksi_kb_accessors.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
    public static SubLObject sksi_content_mts_internal() {
        return isa.all_fort_instances_in_all_mts(sksi_kb_accessors.$const221$SKSIContentMicrotheory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
    public static SubLObject sksi_content_mts() {
        SubLObject caching_state = sksi_kb_accessors.$sksi_content_mts_caching_state$.getGlobalValue();
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_kb_accessors.$sym220$SKSI_CONTENT_MTS, (SubLObject)sksi_kb_accessors.$sym222$_SKSI_CONTENT_MTS_CACHING_STATE_, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.ZERO_INTEGER, (SubLObject)sksi_kb_accessors.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)sksi_kb_accessors.$sym223$CLEAR_SKSI_CONTENT_MTS);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_content_mts_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69938L)
    public static SubLObject content_mt_nart_sk_source(final SubLObject mt_nart) {
        return (SubLObject)((sksi_kb_accessors.NIL != nart_handles.nart_p(mt_nart)) ? cycl_utilities.nat_arg1(mt_nart, (SubLObject)sksi_kb_accessors.UNPROVIDED) : sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70044L)
    public static SubLObject content_mt_sk_source_in_any_mt(final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sk_source = content_mt_nart_sk_source(content_mt);
        if (sksi_kb_accessors.NIL == sk_source) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(sksi_kb_accessors.$const8$EverythingPSC, thread);
                sk_source = content_mt_sk_source(content_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return sk_source;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70371L)
    public static SubLObject content_mt_to_mapping_mt(final SubLObject content_mt) {
        final SubLObject sk_source = content_mt_sk_source_in_any_mt(content_mt);
        if (sksi_kb_accessors.NIL != forts.fort_p(sk_source)) {
            return sk_source_mapping_mt(sk_source);
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70572L)
    public static SubLObject complete_knowledge_sources() {
        return kb_mapping_utilities.pred_refs_in_any_mt(sksi_kb_accessors.$const224$sksRepresentationComplete, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70689L)
    public static SubLObject knowledge_source_representation_completeP(final SubLObject sks) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(sks, sksi_kb_accessors.$const224$sksRepresentationComplete, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70984L)
    public static SubLObject sksi_supported_database_server_program_p_internal(final SubLObject prog) {
        return isa.isaP(prog, sksi_kb_accessors.$const226$SKSISupportedDatabaseServerProgra, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70984L)
    public static SubLObject sksi_supported_database_server_program_p(final SubLObject prog) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_kb_accessors.NIL;
        if (sksi_kb_accessors.NIL == v_memoization_state) {
            return sksi_supported_database_server_program_p_internal(prog);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        if (sksi_kb_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_kb_accessors.$sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.NIL, (SubLObject)sksi_kb_accessors.EQ, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_kb_accessors.$sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, prog, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_supported_database_server_program_p_internal(prog)));
            memoization_state.caching_state_put(caching_state, prog, results, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71207L)
    public static SubLObject default_sks_for_database_server_program(final SubLObject prog) {
        return kb_mapping_utilities.fpred_value_in_any_mt(prog, sksi_kb_accessors.$const227$defaultSKSForDatabaseServerProgra, (SubLObject)sksi_kb_accessors.ONE_INTEGER, (SubLObject)sksi_kb_accessors.TWO_INTEGER, (SubLObject)sksi_kb_accessors.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71359L)
    public static SubLObject table_primary_key_column_indices(final SubLObject table, final SubLObject meta_mt) {
        return table_primary_key_column_thingies(table, meta_mt, (SubLObject)sksi_kb_accessors.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71511L)
    public static SubLObject table_primary_key_column_names(final SubLObject table, final SubLObject meta_mt) {
        return table_primary_key_column_thingies(table, meta_mt, (SubLObject)sksi_kb_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71841L)
    public static SubLObject table_primary_key_column_thingies(final SubLObject table, final SubLObject meta_mt, final SubLObject indicesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        thread.resetMultipleValues();
        final SubLObject pk_columns = table_primary_key_columns(table, meta_mt);
        final SubLObject field_names = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == pk_columns) {
            Errors.error((SubLObject)sksi_kb_accessors.$str228$Primary_keys_for__S_in__S_were_no, table, meta_mt);
        }
        if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == el_utilities.el_list_p(pk_columns)) {
            Errors.error((SubLObject)sksi_kb_accessors.$str229$Primary_keys_for__S_in__S_was_not, table, meta_mt, pk_columns);
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(pk_columns, (SubLObject)sksi_kb_accessors.$kw230$IGNORE);
        SubLObject pk_col = (SubLObject)sksi_kb_accessors.NIL;
        pk_col = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            final SubLObject field_name_pred = (sksi_kb_accessors.NIL != sksi_kb_accessors.$use_legacy_simple_table_implementationP$.getDynamicValue(thread)) ? sksi_kb_accessors.$const231$columnInDBTableNamed : sksi_kb_accessors.$const232$fieldName_SKS;
            final SubLObject field_name_argnum = (SubLObject)((sksi_kb_accessors.NIL != sksi_kb_accessors.$use_legacy_simple_table_implementationP$.getDynamicValue(thread)) ? sksi_kb_accessors.THREE_INTEGER : sksi_kb_accessors.TWO_INTEGER);
            final SubLObject pk_col_name = kb_mapping_utilities.fpred_value_in_relevant_mts(pk_col, field_name_pred, meta_mt, (SubLObject)sksi_kb_accessors.ONE_INTEGER, field_name_argnum, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !pk_col_name.isString()) {
                Errors.error((SubLObject)sksi_kb_accessors.$str233$Could_not_determine_the_column_na, field_name_pred, pk_col, meta_mt);
            }
            if (sksi_kb_accessors.NIL != indicesP) {
                final SubLObject i = Sequences.position(pk_col_name, field_names, Symbols.symbol_function((SubLObject)sksi_kb_accessors.EQUALP), (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
                if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == i) {
                    Errors.error((SubLObject)sksi_kb_accessors.$str234$Could_not_find_the_primary_key_co, new SubLObject[] { pk_col_name, (sksi_kb_accessors.NIL != sksi_kb_accessors.$use_legacy_simple_table_implementationP$.getDynamicValue(thread)) ? sksi_kb_accessors.$const235$tableFieldNameList : sksi_kb_accessors.$const93$schemaFieldNameList, field_names, table, meta_mt });
                }
                result = (SubLObject)ConsesLow.cons(i, result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(pk_col_name, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pk_col = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 73249L)
    public static SubLObject table_primary_key_columns(final SubLObject table, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_kb_accessors.NIL != sksi_kb_accessors.$use_legacy_simple_table_implementationP$.getDynamicValue(thread)) {
            final SubLObject field_names_el_list = kb_mapping_utilities.fpred_value_in_relevant_mts(table, sksi_kb_accessors.$const235$tableFieldNameList, meta_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            final SubLObject field_names = el_utilities.el_list_items(field_names_el_list);
            final SubLObject pk_columns = kb_mapping_utilities.fpred_value_in_relevant_mts(table, sksi_kb_accessors.$const236$tablePrimaryKey, meta_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == field_names_el_list) {
                Errors.error((SubLObject)sksi_kb_accessors.$str237$Could_not_get_the___tableFieldNam, table, meta_mt);
            }
            if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == pk_columns) {
                Errors.error((SubLObject)sksi_kb_accessors.$str238$Could_not_determine_the___tablePr, table, meta_mt);
            }
            return Values.values(pk_columns, field_names);
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_kb_accessors.$sym239$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(meta_mt, thread);
            final SubLObject physical_schemata = sk_source_physical_schemata(table);
            final SubLObject physical_schema = (SubLObject)((sksi_kb_accessors.NIL != list_utilities.singletonP(physical_schemata)) ? physical_schemata.first() : sksi_kb_accessors.NIL);
            if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == physical_schema) {
                Errors.error((SubLObject)sksi_kb_accessors.$str240$Could_not_find_a_physical_schema_, table, meta_mt);
            }
            final SubLObject field_names_el_list2 = kb_mapping_utilities.fpred_value_in_relevant_mts(physical_schema, sksi_kb_accessors.$const93$schemaFieldNameList, meta_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            final SubLObject field_names2 = (SubLObject)((sksi_kb_accessors.NIL != el_utilities.el_list_p(field_names_el_list2)) ? el_utilities.el_list_items(field_names_el_list2) : sksi_kb_accessors.NIL);
            final SubLObject pk_columns2 = kb_mapping_utilities.fpred_value_in_relevant_mts(physical_schema, sksi_kb_accessors.$const71$primaryKey, meta_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
            if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == field_names_el_list2) {
                Errors.error((SubLObject)sksi_kb_accessors.$str241$Could_not_get_the___schemaFieldNa, physical_schema, meta_mt);
            }
            if (sksi_kb_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_kb_accessors.NIL == pk_columns2) {
                Errors.error((SubLObject)sksi_kb_accessors.$str242$Could_not_determine_the___primary, table, meta_mt);
            }
            return Values.values(pk_columns2, field_names2);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 74809L)
    public static SubLObject table_in_db_named(final SubLObject db, final SubLObject table_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sk_source_mapping_mt(db);
        if (sksi_kb_accessors.NIL != sksi_kb_accessors.$use_legacy_simple_table_implementationP$.getDynamicValue(thread)) {
            return backward.removal_ask_variable((SubLObject)sksi_kb_accessors.$kw243$TABLE, (SubLObject)ConsesLow.list(sksi_kb_accessors.$const244$assertedSentence, (SubLObject)ConsesLow.list(sksi_kb_accessors.$const245$tableInDBNamed, (SubLObject)sksi_kb_accessors.$kw243$TABLE, db, table_name)), mapping_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED).first();
        }
        SubLObject cdolist_list_var;
        final SubLObject tables = cdolist_list_var = backward.removal_ask_variable((SubLObject)sksi_kb_accessors.$kw243$TABLE, (SubLObject)ConsesLow.list(sksi_kb_accessors.$const244$assertedSentence, (SubLObject)ConsesLow.list(sksi_kb_accessors.$const20$structuredKnowledgeSourceName, (SubLObject)sksi_kb_accessors.$kw243$TABLE, table_name)), mapping_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        SubLObject table = (SubLObject)sksi_kb_accessors.NIL;
        table = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            if (sksi_kb_accessors.NIL != cycl_utilities.expression_find(db, table, (SubLObject)sksi_kb_accessors.T, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return tables.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 75426L)
    public static SubLObject db_table_name(final SubLObject db, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sk_source_mapping_mt(db);
        if (sksi_kb_accessors.NIL != sksi_kb_accessors.$use_legacy_simple_table_implementationP$.getDynamicValue(thread)) {
            return backward.removal_ask_variable((SubLObject)sksi_kb_accessors.$kw246$TABLE_NAME, (SubLObject)ConsesLow.list(sksi_kb_accessors.$const244$assertedSentence, (SubLObject)ConsesLow.listS(sksi_kb_accessors.$const245$tableInDBNamed, table, db, (SubLObject)sksi_kb_accessors.$list247)), mapping_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED).first();
        }
        SubLObject cdolist_list_var;
        final SubLObject tables = cdolist_list_var = backward.removal_ask_variable((SubLObject)sksi_kb_accessors.$kw246$TABLE_NAME, (SubLObject)ConsesLow.list(sksi_kb_accessors.$const244$assertedSentence, (SubLObject)ConsesLow.listS(sksi_kb_accessors.$const20$structuredKnowledgeSourceName, table, (SubLObject)sksi_kb_accessors.$list247)), mapping_mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        SubLObject table_$44 = (SubLObject)sksi_kb_accessors.NIL;
        table_$44 = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            if (sksi_kb_accessors.NIL != cycl_utilities.expression_find(db, table_$44, (SubLObject)sksi_kb_accessors.T, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED)) {
                return table_$44;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_$44 = cdolist_list_var.first();
        }
        return tables.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76044L)
    public static SubLObject sksi_create(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_kb_accessors.NIL != string_utilities.non_empty_stringP(name) : name;
        thread.resetMultipleValues();
        final SubLObject constant = ke.ke_create_now(name, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        final SubLObject error_result = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_kb_accessors.NIL != error_result) {
            Errors.error((SubLObject)sksi_kb_accessors.$str249$_A___A, error_result.first(), conses_high.second(error_result));
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76512L)
    public static SubLObject sksi_find(final SubLObject name) {
        return fi.fi_find_int(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76576L)
    public static SubLObject sksi_find_or_create(final SubLObject name) {
        assert sksi_kb_accessors.NIL != string_utilities.non_empty_stringP(name) : name;
        SubLObject result = (SubLObject)sksi_kb_accessors.NIL;
        result = sksi_find(name);
        if (sksi_kb_accessors.NIL == result) {
            result = sksi_create(name);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76793L)
    public static SubLObject sksi_kill(final SubLObject fort) {
        assert sksi_kb_accessors.NIL != forts.fort_p(fort) : fort;
        return ke.ke_kill_now(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76884L)
    public static SubLObject sksi_assert(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == sksi_kb_accessors.UNPROVIDED) {
            strength = (SubLObject)sksi_kb_accessors.$kw251$DEFAULT;
        }
        if (direction == sksi_kb_accessors.UNPROVIDED) {
            direction = (SubLObject)sksi_kb_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_kb_accessors.NIL != hlmt.hlmt_p(mt) : mt;
        thread.resetMultipleValues();
        final SubLObject successP = ke.ke_assert_now(sentence, mt, strength, direction);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_kb_accessors.NIL == successP) {
            SubLObject current;
            final SubLObject datum = current = error;
            SubLObject error_type = (SubLObject)sksi_kb_accessors.NIL;
            SubLObject error_string = (SubLObject)sksi_kb_accessors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list253);
            error_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_kb_accessors.$list253);
            error_string = current.first();
            current = current.rest();
            if (sksi_kb_accessors.NIL == current) {
                sksi_debugging.sksi_error(Sequences.cconcatenate(string_utilities.str(error_type), new SubLObject[] { sksi_kb_accessors.$str254$_, error_string }));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_kb_accessors.$list253);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77249L)
    public static SubLObject sksi_unassert(final SubLObject sentence, final SubLObject mt) {
        assert sksi_kb_accessors.NIL != hlmt.hlmt_p(mt) : mt;
        return ke.ke_unassert_now(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77360L)
    public static SubLObject sksi_unassert_assertion(final SubLObject assertion) {
        assert sksi_kb_accessors.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return ke.ke_unassert_assertion_now(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77499L)
    public static SubLObject sksi_find_nart(final SubLObject nart_formula) {
        return narts_high.find_nart(nart_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77582L)
    public static SubLObject sksi_assert_if_new(final SubLObject sentence, final SubLObject mt) {
        final SubLObject assertions = fi.sentence_assertions(sentence, mt);
        if (sksi_kb_accessors.NIL != assertions) {
            return (SubLObject)sksi_kb_accessors.T;
        }
        return sksi_assert(sentence, mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77758L)
    public static SubLObject sksi_edit_assertion(final SubLObject old_assertion, final SubLObject new_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(old_assertion);
        thread.resetMultipleValues();
        final SubLObject result = sksi_assert(new_formula, mt, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_kb_accessors.NIL != error) {
            return Values.values((SubLObject)sksi_kb_accessors.NIL, error);
        }
        return sksi_unassert_assertion(old_assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78062L)
    public static SubLObject sksi_repropagate_assertion(final SubLObject assertion) {
        return ke.ke_repropagate_assertion(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78166L)
    public static SubLObject sksi_constant_get_kb_subset_cols(final SubLObject v_term) {
        SubLObject cyc_kb_subset_collections = (SubLObject)sksi_kb_accessors.NIL;
        SubLObject cdolist_list_var = isa.asserted_quoted_isa(v_term, sksi_kb_accessors.$const257$BookkeepingMt);
        SubLObject c = (SubLObject)sksi_kb_accessors.NIL;
        c = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            if (sksi_kb_accessors.NIL != isa.isa_in_any_mtP(c, sksi_kb_accessors.$const256$CycKBSubsetCollection)) {
                cyc_kb_subset_collections = (SubLObject)ConsesLow.cons(c, cyc_kb_subset_collections);
            }
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        }
        return cyc_kb_subset_collections;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78549L)
    public static SubLObject sksi_constant_assert_inherited_kb_subset_isas(final SubLObject v_term, final SubLObject inherit_from_term) {
        final SubLObject inherited_isa_cols = sksi_constant_get_kb_subset_cols(inherit_from_term);
        if (sksi_kb_accessors.NIL == inherited_isa_cols) {
            Errors.warn((SubLObject)sksi_kb_accessors.$str258$No___CycKBSubsetCollections_found, inherit_from_term, v_term);
        }
        SubLObject cdolist_list_var = inherited_isa_cols;
        SubLObject col = (SubLObject)sksi_kb_accessors.NIL;
        col = cdolist_list_var.first();
        while (sksi_kb_accessors.NIL != cdolist_list_var) {
            sksi_assert_if_new((SubLObject)ConsesLow.list(sksi_kb_accessors.$const259$quotedIsa, v_term, col), sksi_kb_accessors.$const257$BookkeepingMt);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78984L)
    public static SubLObject sksi_temporal_field_null_maps_to(final SubLObject pf) {
        final SubLObject result = kb_mapping_utilities.fpred_value_in_any_mt(pf, sksi_kb_accessors.$const260$temporalFieldNullMapsTo, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED, (SubLObject)sksi_kb_accessors.UNPROVIDED);
        return (SubLObject)((sksi_kb_accessors.NIL != result) ? result : sksi_kb_accessors.$kw261$UNREFORMULATABLE);
    }
    
    public static SubLObject declare_sksi_kb_accessors_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_sk_source_gaf", "CONTENT-MT-SK-SOURCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_sk_source_internal", "CONTENT-MT-SK-SOURCE-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_sk_source", "CONTENT-MT-SK-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_spindle_member_p", "CONTENT-MT-SPINDLE-MEMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_p", "SK-SOURCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_in_any_mt_p_internal", "SK-SOURCE-IN-ANY-MT-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_in_any_mt_p", "SK-SOURCE-IN-ANY-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "modifiable_sk_source_p", "MODIFIABLE-SK-SOURCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "modifiable_sk_source_in_any_mt_p", "MODIFIABLE-SK-SOURCE-IN-ANY-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "code_mapping_knowledge_sourceP", "CODE-MAPPING-KNOWLEDGE-SOURCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sk_source_property_from_kb_internal", "GET-SK-SOURCE-PROPERTY-FROM-KB-INTERNAL", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sk_source_property_from_kb", "GET-SK-SOURCE-PROPERTY-FROM-KB", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sk_source_property_from_kb_int", "GET-SK-SOURCE-PROPERTY-FROM-KB-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_gaf", "SK-SOURCE-CONTENT-MT-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_internal", "SK-SOURCE-CONTENT-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt", "SK-SOURCE-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_in_any_mt", "SK-SOURCE-CONTENT-MT-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_head_gaf", "SK-SOURCE-CONTENT-MT-HEAD-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_head_internal", "SK-SOURCE-CONTENT-MT-HEAD-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_head", "SK-SOURCE-CONTENT-MT-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_content_mt_head_in_any_mt", "SK-SOURCE-CONTENT-MT-HEAD-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_mapping_mt_internal", "SK-SOURCE-MAPPING-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_mapping_mt", "SK-SOURCE-MAPPING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_logical_schema_description_mt", "SK-SOURCE-LOGICAL-SCHEMA-DESCRIPTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_description_mt_sk_source_in_any_mt", "LOGICAL-SCHEMA-DESCRIPTION-MT-SK-SOURCE-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_source_description_mt", "SK-SOURCE-SOURCE-DESCRIPTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_schema_translation_mt", "SK-SOURCE-SCHEMA-TRANSLATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_translation_mt_sk_source_in_any_mt", "SCHEMA-TRANSLATION-MT-SK-SOURCE-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_ks_type", "SK-SOURCE-KS-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_row_count", "SK-SOURCE-ROW-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_name", "SK-SOURCE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_name_from_mapping_mt", "SK-SOURCE-NAME-FROM-MAPPING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_namespace_internal", "SK-SOURCE-NAMESPACE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_namespace", "SK-SOURCE-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_asserted_namespace_gaf", "SK-SOURCE-ASSERTED-NAMESPACE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_by_sks_name_internal", "SK-SOURCE-BY-SKS-NAME-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_by_sks_name", "SK-SOURCE-BY-SKS-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_physical_schema_gafs", "SK-SOURCE-PHYSICAL-SCHEMA-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_physical_schemata", "SK-SOURCE-PHYSICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_complex_physical_schemata", "SK-SOURCE-COMPLEX-PHYSICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_complex_physical_schemata_int", "SK-SOURCE-COMPLEX-PHYSICAL-SCHEMATA-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_logical_schemata", "SK-SOURCE-LOGICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_complex_logical_schemata", "SK-SOURCE-COMPLEX-LOGICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_physical_logical_schema_pairs", "SK-SOURCE-PHYSICAL-LOGICAL-SCHEMA-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_immediate_spec_sk_sources", "SK-SOURCE-IMMEDIATE-SPEC-SK-SOURCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "meaning_sentence_predicate_for_sk_sourceP", "MEANING-SENTENCE-PREDICATE-FOR-SK-SOURCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_for_meaning_sentence_predicate", "LOGICAL-SCHEMA-FOR-MEANING-SENTENCE-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_complex_required_fields", "SK-SOURCE-COMPLEX-REQUIRED-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_required_fields", "SK-SOURCE-REQUIRED-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_sql_flavor", "SK-SOURCE-SQL-FLAVOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_single_literal_lookup_direction_from_kb_internal", "GET-SKS-SINGLE-LITERAL-LOOKUP-DIRECTION-FROM-KB-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_single_literal_lookup_direction_from_kb", "GET-SKS-SINGLE-LITERAL-LOOKUP-DIRECTION-FROM-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_multi_literal_lookup_direction_from_kb_internal", "GET-SKS-MULTI-LITERAL-LOOKUP-DIRECTION-FROM-KB-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_multi_literal_lookup_direction_from_kb", "GET-SKS-MULTI-LITERAL-LOOKUP-DIRECTION-FROM-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_storage_direction_from_kb_internal", "GET-SKS-STORAGE-DIRECTION-FROM-KB-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_storage_direction_from_kb", "GET-SKS-STORAGE-DIRECTION-FROM-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_sks_module_direction_from_kb", "GET-SKS-MODULE-DIRECTION-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_sub_ks_direct", "SK-SOURCE-SUB-KS-DIRECT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "do_sk_source_sub_ks_direct", "DO-SK-SOURCE-SUB-KS-DIRECT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_proper_sub_ks_closure", "SK-SOURCE-PROPER-SUB-KS-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_proper_sub_ks_closure_in_mapping_mt", "SK-SOURCE-PROPER-SUB-KS-CLOSURE-IN-MAPPING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_sub_ks_closure", "SK-SOURCE-SUB-KS-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_sub_ks_min", "SK-SOURCE-SUB-KS-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_sub_ksP", "SK-SOURCE-SUB-KS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_sub_ks_in_any_mtP", "SK-SOURCE-SUB-KS-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_proper_sub_ksP", "SK-SOURCE-PROPER-SUB-KS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_super_ks_direct", "SK-SOURCE-SUPER-KS-DIRECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_proper_super_ks_closure", "SK-SOURCE-PROPER-SUPER-KS-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_super_ks_closure", "SK-SOURCE-SUPER-KS-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_super_ks_max", "SK-SOURCE-SUPER-KS-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_super_ksP", "SK-SOURCE-SUPER-KS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_proper_super_ksP_internal", "SK-SOURCE-PROPER-SUPER-KS?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sk_source_proper_super_ksP", "SK-SOURCE-PROPER-SUPER-KS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "common_super_ksP", "COMMON-SUPER-KS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "super_ks_closure_intersection", "SUPER-KS-CLOSURE-INTERSECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "immediate_genl_ks_internal", "IMMEDIATE-GENL-KS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "immediate_genl_ks", "IMMEDIATE-GENL-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "max_genl_ks", "MAX-GENL-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "nearest_common_super_ks", "NEAREST-COMMON-SUPER-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "nearest_common_super_ks_for_ls_list", "NEAREST-COMMON-SUPER-KS-FOR-LS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_representation_completeP", "SCHEMA-REPRESENTATION-COMPLETE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "isa_physical_schemaP_internal", "ISA-PHYSICAL-SCHEMA?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "isa_physical_schemaP", "ISA-PHYSICAL-SCHEMA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_sk_sources", "PHYSICAL-SCHEMA-SK-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_sk_sources_memoized_internal", "PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_sk_sources_memoized", "PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_fields_internal", "PHYSICAL-SCHEMA-FIELDS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_fields", "PHYSICAL-SCHEMA-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_primary_key_internal", "PHYSICAL-SCHEMA-PRIMARY-KEY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_primary_key", "PHYSICAL-SCHEMA-PRIMARY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_primary_key_compensate_for_table_column_representation_internal", "PHYSICAL-SCHEMA-PRIMARY-KEY-COMPENSATE-FOR-TABLE-COLUMN-REPRESENTATION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_primary_key_compensate_for_table_column_representation", "PHYSICAL-SCHEMA-PRIMARY-KEY-COMPENSATE-FOR-TABLE-COLUMN-REPRESENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_primary_key_p", "PHYSICAL-SCHEMA-PRIMARY-KEY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_forbidden_comparison_operators", "PHYSICAL-SCHEMA-FORBIDDEN-COMPARISON-OPERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_forbidden_comparison_operator_p", "PHYSICAL-SCHEMA-FORBIDDEN-COMPARISON-OPERATOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_foreign_keys", "PHYSICAL-SCHEMA-FOREIGN-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_foreign_keys_restrict", "PHYSICAL-SCHEMA-FOREIGN-KEYS-RESTRICT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_foreign_keys_cascade", "PHYSICAL-SCHEMA-FOREIGN-KEYS-CASCADE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_foreign_keys_set_null", "PHYSICAL-SCHEMA-FOREIGN-KEYS-SET-NULL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_foreign_keys_set_default", "PHYSICAL-SCHEMA-FOREIGN-KEYS-SET-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_foreign_keys_int", "PHYSICAL-SCHEMA-FOREIGN-KEYS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_unique_fields_tuples", "PHYSICAL-SCHEMA-UNIQUE-FIELDS-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_required_fields", "PHYSICAL-SCHEMA-REQUIRED-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schemata_required_fields", "PHYSICAL-SCHEMATA-REQUIRED-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_required_field_names", "PHYSICAL-SCHEMA-REQUIRED-FIELD-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_indexed_fields", "PHYSICAL-SCHEMA-INDEXED-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_determine_singly_indexed_schema_indexed_field", "SKSI-DETERMINE-SINGLY-INDEXED-SCHEMA-INDEXED-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexedP", "PHYSICAL-FIELD-INDEXED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_enumerableP_internal", "PHYSICAL-SCHEMA-ENUMERABLE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_enumerableP", "PHYSICAL-SCHEMA-ENUMERABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "enumerable_schema_gaf", "ENUMERABLE-SCHEMA-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_result_set_cardinality_gafs_internal", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_result_set_cardinality_gafs", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schemata_result_set_cardinality_gafs", "PHYSICAL-SCHEMATA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_result_set_cardinality_wXconstraints_gafs_internal", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_result_set_cardinality_wXconstraints_gafs", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schemata_result_set_cardinality_wXconstraints_gafs", "PHYSICAL-SCHEMATA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "result_set_cardinality_gaf_unbound_fields_set", "RESULT-SET-CARDINALITY-GAF-UNBOUND-FIELDS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "result_set_cardinality_gaf_bound_fields_set", "RESULT-SET-CARDINALITY-GAF-BOUND-FIELDS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "result_set_cardinality_gaf_constraints", "RESULT-SET-CARDINALITY-GAF-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "result_set_cardinality_gaf_cost_expression", "RESULT-SET-CARDINALITY-GAF-COST-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_logical_schema_gafs", "PHYSICAL-SCHEMA-LOGICAL-SCHEMA-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_logical_schemata", "PHYSICAL-SCHEMA-LOGICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_example_tuple", "PHYSICAL-SCHEMA-EXAMPLE-TUPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_field_encodings", "PHYSICAL-SCHEMA-FIELD-ENCODINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_ordered_field_list_internal", "PHYSICAL-SCHEMA-ORDERED-FIELD-LIST-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_ordered_field_list", "PHYSICAL-SCHEMA-ORDERED-FIELD-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_field_name_list", "PHYSICAL-SCHEMA-FIELD-NAME-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schemata_physical_schemata", "LOGICAL-SCHEMATA-PHYSICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_physical_schemata", "LOGICAL-SCHEMA-PHYSICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_fields_internal", "LOGICAL-SCHEMA-FIELDS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_fields", "LOGICAL-SCHEMA-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_field_indexicals_internal", "LOGICAL-SCHEMA-FIELD-INDEXICALS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_field_indexicals", "LOGICAL-SCHEMA-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_example_sentences", "LOGICAL-SCHEMA-EXAMPLE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_keys", "LOGICAL-SCHEMA-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_result_set_cardinality_gafs_internal", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_result_set_cardinality_gafs", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schemata_result_set_cardinality_gafs", "LOGICAL-SCHEMATA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_gaf_unbound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-GAF-UNBOUND-FIELDS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_gaf_bound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-GAF-BOUND-FIELDS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_gaf_cost_expression", "LOGICAL-RESULT-SET-CARDINALITY-GAF-COST-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_result_set_cardinality_wrt_value_gafs_internal", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_result_set_cardinality_wrt_value_gafs", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schemata_result_set_cardinality_wrt_value_gafs", "LOGICAL-SCHEMATA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_wrt_value_gaf_unbound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-UNBOUND-FIELDS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_wrt_value_gaf_bound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-BOUND-FIELDS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_wrt_value_gaf_cost_expression", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-COST-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_result_set_cardinality_wrt_value_gaf_value", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_field_decodings", "LOGICAL-SCHEMA-FIELD-DECODINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_source_gafs", "LOGICAL-SCHEMA-SOURCE-GAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_sources", "LOGICAL-SCHEMA-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_sk_sources_memoized_internal", "LOGICAL-SCHEMA-SK-SOURCES-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_sk_sources_memoized", "LOGICAL-SCHEMA-SK-SOURCES-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schemata_sources", "LOGICAL-SCHEMATA-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_sourceP", "LOGICAL-SCHEMA-SOURCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_complete_extent_knownP", "LOGICAL-SCHEMA-COMPLETE-EXTENT-KNOWN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_complete_extent_known_for_predicateP", "LOGICAL-SCHEMA-COMPLETE-EXTENT-KNOWN-FOR-PREDICATE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_schema_content_sentences", "LOGICAL-SCHEMA-CONTENT-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_p", "LOGICAL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_p_memoized_internal", "LOGICAL-FIELD-P-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_p_memoized", "LOGICAL-FIELD-P-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lf_alias_fn_naut_p", "LF-ALIAS-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lf_alias_fn_naut_lf", "LF-ALIAS-FN-NAUT-LF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lf_alias_fn_naut_index", "LF-ALIAS-FN-NAUT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lf_fort_for_lf", "LF-FORT-FOR-LF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lf_alias_naut_for_lf_and_alias_index", "LF-ALIAS-NAUT-FOR-LF-AND-ALIAS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_p", "LOGICAL-FIELD-INDEXICAL-P", 1, 0, false);
        new $logical_field_indexical_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_p_memoized_internal", "LOGICAL-FIELD-INDEXICAL-P-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_p_memoized", "LOGICAL-FIELD-INDEXICAL-P-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_fort_p", "LOGICAL-FIELD-INDEXICAL-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_alias_fn_naut_p", "LFI-ALIAS-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_alias_fn_naut_lfi", "LFI-ALIAS-FN-NAUT-LFI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_alias_fn_naut_index", "LFI-ALIAS-FN-NAUT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_alias_naut_for_lfi_and_alias_index", "LFI-ALIAS-NAUT-FOR-LFI-AND-ALIAS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_fort_for_lfi", "LFI-FORT-FOR-LFI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_index_for_lfi", "LFI-INDEX-FOR-LFI", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_for_lfi", "PFI-FOR-LFI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_for_pfi", "LFI-FOR-PFI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pf_for_lfi", "PF-FOR-LFI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_for_schemaP", "LOGICAL-FIELD-INDEXICAL-FOR-SCHEMA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_fort_for_schema_internal", "LOGICAL-FIELD-INDEXICAL-FORT-FOR-SCHEMA-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_fort_for_schema", "LOGICAL-FIELD-INDEXICAL-FORT-FOR-SCHEMA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_for_schemaP", "LOGICAL-FIELD-FOR-SCHEMA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "virtual_logical_field_indexical_p", "VIRTUAL-LOGICAL-FIELD-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_virtualP", "LOGICAL-FIELD-INDEXICAL-VIRTUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "isa_logical_schemaP_internal", "ISA-LOGICAL-SCHEMA?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "isa_logical_schemaP", "ISA-LOGICAL-SCHEMA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "isa_reified_mappingP", "ISA-REIFIED-MAPPING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "is_fort_a_reified_mappingP_internal", "IS-FORT-A-REIFIED-MAPPING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "is_fort_a_reified_mappingP", "IS-FORT-A-REIFIED-MAPPING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "cycl_terms_mapped_to_by_code_mapping_schema_internal", "CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMA-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "cycl_terms_mapped_to_by_code_mapping_schema", "CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "cyc_terms_corresponding_to_code_mapping_schema_code", "CYC-TERMS-CORRESPONDING-TO-CODE-MAPPING-SCHEMA-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "cyc_terms_for_sksi_external_term_naut", "CYC-TERMS-FOR-SKSI-EXTERNAL-TERM-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_isa_internal", "SCHEMA-ISA-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_isa", "SCHEMA-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_object_field", "SCHEMA-OBJECT-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_object_field_gaf", "SCHEMA-OBJECT-FIELD-GAF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_object_id_fn_expression_p", "SCHEMA-OBJECT-ID-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "schema_object_fn_expression_p", "SCHEMA-OBJECT-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "source_schema_object_id_fn_expression_p", "SOURCE-SCHEMA-OBJECT-ID-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "source_schema_object_fn_expression_p", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "destructure_schema_object_fn_expression", "DESTRUCTURE-SCHEMA-OBJECT-FN-EXPRESSION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "destructure_source_schema_object_fn_expression", "DESTRUCTURE-SOURCE-SCHEMA-OBJECT-FN-EXPRESSION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_for_indexical", "PHYSICAL-FIELD-FOR-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_for_indexical_fort_internal", "PHYSICAL-FIELD-FOR-INDEXICAL-FORT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_for_indexical_fort", "PHYSICAL-FIELD-FOR-INDEXICAL-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_for_pfi_alias_fn_naut", "PHYSICAL-FIELD-FOR-PFI-ALIAS-FN-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexical_for_physical_field_internal", "INDEXICAL-FOR-PHYSICAL-FIELD-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexical_for_physical_field", "INDEXICAL-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_fields_to_indexicals", "PHYSICAL-FIELDS-TO-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexicals_to_physical_fields", "INDEXICALS-TO-PHYSICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "not_null_physical_field_p", "NOT-NULL-PHYSICAL-FIELD-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "not_null_physical_fields_for_ps_internal", "NOT-NULL-PHYSICAL-FIELDS-FOR-PS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "not_null_physical_fields_for_ps", "NOT-NULL-PHYSICAL-FIELDS-FOR-PS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_default_value_internal", "PHYSICAL-FIELD-DEFAULT-VALUE-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_default_value", "PHYSICAL-FIELD-DEFAULT-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "null_default_physical_field_valueP", "NULL-DEFAULT-PHYSICAL-FIELD-VALUE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_for_schema_and_name", "PHYSICAL-FIELD-FOR-SCHEMA-AND-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_schema_internal", "PHYSICAL-FIELD-SCHEMA-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_schema", "PHYSICAL-FIELD-SCHEMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_name_internal", "PHYSICAL-FIELD-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_name", "PHYSICAL-FIELD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_name", "PHYSICAL-FIELD-INDEXICAL-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_sk_source_internal", "PHYSICAL-FIELD-SK-SOURCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_sk_source", "PHYSICAL-FIELD-SK-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_sk_source_name_internal", "PHYSICAL-FIELD-SK-SOURCE-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_sk_source_name", "PHYSICAL-FIELD-SK-SOURCE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_sk_source_namespace_internal", "PHYSICAL-FIELD-SK-SOURCE-NAMESPACE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_sk_source_namespace", "PHYSICAL-FIELD-SK-SOURCE-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_schema", "PHYSICAL-FIELD-INDEXICAL-SCHEMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_sk_source_internal", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_sk_source", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_sk_source_name_internal", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_sk_source_name", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_sk_source_namespace_internal", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAMESPACE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_sk_source_namespace", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_p", "PHYSICAL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "virtual_physical_field_p", "VIRTUAL-PHYSICAL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_virtualP_internal", "PHYSICAL-FIELD-VIRTUAL?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_virtualP", "PHYSICAL-FIELD-VIRTUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pf_alias_fn_naut_p", "PF-ALIAS-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pf_alias_fn_naut_pf", "PF-ALIAS-FN-NAUT-PF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pf_alias_fn_naut_index", "PF-ALIAS-FN-NAUT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pf_fort_for_pf", "PF-FORT-FOR-PF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pf_alias_naut_for_pf_and_alias_index", "PF-ALIAS-NAUT-FOR-PF-AND-ALIAS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_p", "PHYSICAL-FIELD-INDEXICAL-P", 1, 0, false);
        new $physical_field_indexical_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "virtual_physical_field_indexical_p", "VIRTUAL-PHYSICAL-FIELD-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_virtualP", "PHYSICAL-FIELD-INDEXICAL-VIRTUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_alias_fn_naut_p", "PFI-ALIAS-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_alias_fn_naut_pfi", "PFI-ALIAS-FN-NAUT-PFI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_alias_fn_naut_index", "PFI-ALIAS-FN-NAUT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_alias_naut_for_pfi_and_alias_index", "PFI-ALIAS-NAUT-FOR-PFI-AND-ALIAS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_fort_for_pfi", "PFI-FORT-FOR-PFI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "pfi_index_for_pfi", "PFI-INDEX-FOR-PFI", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_for_sks_name_internal", "PHYSICAL-SCHEMA-FOR-SKS-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_for_sks_name", "PHYSICAL-SCHEMA-FOR-SKS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_for_sks_and_field_names_internal", "PHYSICAL-FIELD-INDEXICAL-FOR-SKS-AND-FIELD-NAMES-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_indexical_for_sks_and_field_names", "PHYSICAL-FIELD-INDEXICAL-FOR-SKS-AND-FIELD-NAMES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexicals_for_physical_fields", "INDEXICALS-FOR-PHYSICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "integer_sequence_generator_for_physical_field_internal", "INTEGER-SEQUENCE-GENERATOR-FOR-PHYSICAL-FIELD-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "integer_sequence_generator_for_physical_field", "INTEGER-SEQUENCE-GENERATOR-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "integer_sequence_generator_name_internal", "INTEGER-SEQUENCE-GENERATOR-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "integer_sequence_generator_name", "INTEGER-SEQUENCE-GENERATOR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "integer_sequence_generator_name_for_physical_field", "INTEGER-SEQUENCE-GENERATOR-NAME-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_value_is_auto_incrementedP_internal", "PHYSICAL-FIELD-VALUE-IS-AUTO-INCREMENTED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_value_is_auto_incrementedP", "PHYSICAL-FIELD-VALUE-IS-AUTO-INCREMENTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_for_indexical", "LOGICAL-FIELD-FOR-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_for_indexical_fort_internal", "LOGICAL-FIELD-FOR-INDEXICAL-FORT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_for_indexical_fort", "LOGICAL-FIELD-FOR-INDEXICAL-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_for_lfi_alias_fn_naut", "LOGICAL-FIELD-FOR-LFI-ALIAS-FN-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "lfi_for_lf", "LFI-FOR-LF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexical_for_logical_field_internal", "INDEXICAL-FOR-LOGICAL-FIELD-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexical_for_logical_field", "INDEXICAL-FOR-LOGICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_fields_for_indexicals", "LOGICAL-FIELDS-FOR-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "indexicals_for_logical_fields", "INDEXICALS-FOR-LOGICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_schema", "LOGICAL-FIELD-SCHEMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_schema", "LOGICAL-FIELD-INDEXICAL-SCHEMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_sk_source_internal", "LOGICAL-FIELD-INDEXICAL-SK-SOURCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_indexical_sk_source", "LOGICAL-FIELD-INDEXICAL-SK-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_joinable_fields", "LOGICAL-FIELD-JOINABLE-FIELDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_fields_joinableP_internal", "LOGICAL-FIELDS-JOINABLE?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_fields_joinableP", "LOGICAL-FIELDS-JOINABLE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "extract_logical_fields", "EXTRACT-LOGICAL-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "extract_logical_field_indexicals", "EXTRACT-LOGICAL-FIELD-INDEXICALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_determine_relevant_logical_fields", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_determine_relevant_logical_fields_for_physical_field_via_decoding", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD-VIA-DECODING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_determine_logical_field_indexicals_relevant_to_physical_field", "SKSI-DETERMINE-LOGICAL-FIELD-INDEXICALS-RELEVANT-TO-PHYSICAL-FIELD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_determine_logical_field_indexicals_relevant_to_physical_field_int1", "SKSI-DETERMINE-LOGICAL-FIELD-INDEXICALS-RELEVANT-TO-PHYSICAL-FIELD-INT1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_determine_logical_field_indexicals_relevant_to_physical_field_int2", "SKSI-DETERMINE-LOGICAL-FIELD-INDEXICALS-RELEVANT-TO-PHYSICAL-FIELD-INT2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_isa", "LOGICAL-FIELD-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_type_list", "LOGICAL-FIELD-TYPE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "logical_field_mappings", "LOGICAL-FIELD-MAPPINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_physical_fields_for_logical_field_int_internal", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_physical_fields_for_logical_field_int", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_physical_fields_for_logical_field_int_2", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_physical_fields_for_logical_field", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_decoding_mapped_physical_fields_for_logical_field", "SKSI-GET-DECODING-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_encoding_mapped_physical_fields_for_logical_field", "SKSI-GET-ENCODING-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_logical_fields_for_physical_field_int", "SKSI-GET-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_logical_fields_for_physical_field_int_2", "SKSI-GET-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD-INT-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_mapped_logical_fields_for_physical_field", "SKSI-GET-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_decoding_mapped_logical_fields_for_physical_field", "SKSI-GET-DECODING-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_encoding_mapped_logical_fields_for_physical_field", "SKSI-GET-ENCODING-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_get_all_mapped_logical_fields_for_physical_field", "SKSI-GET-ALL-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_data_type_name", "PHYSICAL-FIELD-DATA-TYPE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_field_data_type", "PHYSICAL-FIELD-DATA-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "boolean_physical_field_p", "BOOLEAN-PHYSICAL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "data_type_name", "DATA-TYPE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "data_type_by_name", "DATA-TYPE-BY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "physical_schema_indexes", "PHYSICAL-SCHEMA-INDEXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "index_physical_fields", "INDEX-PHYSICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "index_type", "INDEX-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "index_name", "INDEX-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "index_type_namestring", "INDEX-TYPE-NAMESTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "cycl_operator_to_csql_operator_internal", "CYCL-OPERATOR-TO-CSQL-OPERATOR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "cycl_operator_to_csql_operator", "CYCL-OPERATOR-TO-CSQL-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_cycl_operator_internal", "CSQL-OPERATOR-TO-CYCL-OPERATOR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_cycl_operator", "CSQL-OPERATOR-TO-CYCL-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_operator_internal", "CSQL-OPERATOR-TO-SQL-OPERATOR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_operator", "CSQL-OPERATOR-TO-SQL-OPERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_operator_syntax_internal", "CSQL-OPERATOR-TO-SQL-OPERATOR-SYNTAX-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_operator_syntax", "CSQL-OPERATOR-TO-SQL-OPERATOR-SYNTAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_prefix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-PREFIX-OPERATOR-SYNTAX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_infix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-INFIX-OPERATOR-SYNTAX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_postfix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-POSTFIX-OPERATOR-SYNTAX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_inverse_infix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-INVERSE-INFIX-OPERATOR-SYNTAX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_operator_to_sql_function_syntaxP", "CSQL-OPERATOR-TO-SQL-FUNCTION-SYNTAX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_to_sql_translation_format_gaf_internal", "CSQL-TO-SQL-TRANSLATION-FORMAT-GAF-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "csql_to_sql_translation_format_gaf", "CSQL-TO-SQL-TRANSLATION-FORMAT-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_mapping_mt_p", "SKSI-MAPPING-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_genl_content_mts_for_sks", "GET-GENL-CONTENT-MTS-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "get_genl_content_mts_for_mt", "GET-GENL-CONTENT-MTS-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_content_mt_p", "SKSI-CONTENT-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "clear_sksi_content_mts", "CLEAR-SKSI-CONTENT-MTS", 0, 0, false);
        new $clear_sksi_content_mts$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "remove_sksi_content_mts", "REMOVE-SKSI-CONTENT-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_content_mts_internal", "SKSI-CONTENT-MTS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_content_mts", "SKSI-CONTENT-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_nart_sk_source", "CONTENT-MT-NART-SK-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_sk_source_in_any_mt", "CONTENT-MT-SK-SOURCE-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "content_mt_to_mapping_mt", "CONTENT-MT-TO-MAPPING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "complete_knowledge_sources", "COMPLETE-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "knowledge_source_representation_completeP", "KNOWLEDGE-SOURCE-REPRESENTATION-COMPLETE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_supported_database_server_program_p_internal", "SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_supported_database_server_program_p", "SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "default_sks_for_database_server_program", "DEFAULT-SKS-FOR-DATABASE-SERVER-PROGRAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "table_primary_key_column_indices", "TABLE-PRIMARY-KEY-COLUMN-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "table_primary_key_column_names", "TABLE-PRIMARY-KEY-COLUMN-NAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "table_primary_key_column_thingies", "TABLE-PRIMARY-KEY-COLUMN-THINGIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "table_primary_key_columns", "TABLE-PRIMARY-KEY-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "table_in_db_named", "TABLE-IN-DB-NAMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "db_table_name", "DB-TABLE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_create", "SKSI-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_find", "SKSI-FIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_find_or_create", "SKSI-FIND-OR-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_kill", "SKSI-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_assert", "SKSI-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_unassert", "SKSI-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_unassert_assertion", "SKSI-UNASSERT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_find_nart", "SKSI-FIND-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_assert_if_new", "SKSI-ASSERT-IF-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_edit_assertion", "SKSI-EDIT-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_repropagate_assertion", "SKSI-REPROPAGATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_constant_get_kb_subset_cols", "SKSI-CONSTANT-GET-KB-SUBSET-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_constant_assert_inherited_kb_subset_isas", "SKSI-CONSTANT-ASSERT-INHERITED-KB-SUBSET-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors", "sksi_temporal_field_null_maps_to", "SKSI-TEMPORAL-FIELD-NULL-MAPS-TO", 1, 0, false);
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    public static SubLObject init_sksi_kb_accessors_file() {
        sksi_kb_accessors.$sksi_default_field_value$ = SubLFiles.deflexical("*SKSI-DEFAULT-FIELD-VALUE*", (SubLObject)sksi_kb_accessors.$kw155$NULL);
        sksi_kb_accessors.$sksi_content_mts_caching_state$ = SubLFiles.deflexical("*SKSI-CONTENT-MTS-CACHING-STATE*", (SubLObject)sksi_kb_accessors.NIL);
        sksi_kb_accessors.$use_legacy_simple_table_implementationP$ = SubLFiles.defparameter("*USE-LEGACY-SIMPLE-TABLE-IMPLEMENTATION?*", (SubLObject)sksi_kb_accessors.NIL);
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    public static SubLObject setup_sksi_kb_accessors_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym2$CONTENT_MT_SK_SOURCE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym5$SK_SOURCE_IN_ANY_MT_P);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym10$GET_SK_SOURCE_PROPERTY_FROM_KB);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym11$SK_SOURCE_CONTENT_MT);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym13$SK_SOURCE_CONTENT_MT_HEAD);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym14$SK_SOURCE_MAPPING_MT);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym22$SK_SOURCE_NAMESPACE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym25$SK_SOURCE_BY_SKS_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym59$SK_SOURCE_PROPER_SUPER_KS_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym60$IMMEDIATE_GENL_KS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym64$ISA_PHYSICAL_SCHEMA_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym68$PHYSICAL_SCHEMA_FIELDS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym70$PHYSICAL_SCHEMA_PRIMARY_KEY);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym83$PHYSICAL_SCHEMA_ENUMERABLE_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym95$LOGICAL_SCHEMA_FIELDS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym125$LOGICAL_FIELD_P_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym133$ISA_LOGICAL_SCHEMA_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym135$IS_FORT_A_REIFIED_MAPPING_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym140$SCHEMA_ISA);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym152$INDEXICAL_FOR_PHYSICAL_FIELD);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym156$PHYSICAL_FIELD_DEFAULT_VALUE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym160$PHYSICAL_FIELD_SCHEMA);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym81$PHYSICAL_FIELD_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym161$PHYSICAL_FIELD_SK_SOURCE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym162$PHYSICAL_FIELD_SK_SOURCE_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym167$PHYSICAL_FIELD_VIRTUAL_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym178$INTEGER_SEQUENCE_GENERATOR_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym185$INDEXICAL_FOR_LOGICAL_FIELD);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym190$LOGICAL_FIELDS_JOINABLE_);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym208$CSQL_OPERATOR_TO_SQL_OPERATOR);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF);
        memoization_state.note_globally_cached_function((SubLObject)sksi_kb_accessors.$sym220$SKSI_CONTENT_MTS);
        memoization_state.note_memoized_function((SubLObject)sksi_kb_accessors.$sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P);
        return (SubLObject)sksi_kb_accessors.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_kb_accessors_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_kb_accessors_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_kb_accessors_file();
    }
    
    static {
        me = (SubLFile)new sksi_kb_accessors();
        sksi_kb_accessors.$sksi_default_field_value$ = null;
        sksi_kb_accessors.$sksi_content_mts_caching_state$ = null;
        sksi_kb_accessors.$use_legacy_simple_table_implementationP$ = null;
        $const0$contentMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMt"));
        $kw1$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym2$CONTENT_MT_SK_SOURCE = SubLObjectFactory.makeSymbol("CONTENT-MT-SK-SOURCE");
        $const3$mtSpindleMember = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtSpindleMember"));
        $const4$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StructuredKnowledgeSource"));
        $sym5$SK_SOURCE_IN_ANY_MT_P = SubLObjectFactory.makeSymbol("SK-SOURCE-IN-ANY-MT-P");
        $const6$sksModifiable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksModifiable"));
        $sym7$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const8$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const9$codeMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("codeMapping"));
        $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB = SubLObjectFactory.makeSymbol("GET-SK-SOURCE-PROPERTY-FROM-KB");
        $sym11$SK_SOURCE_CONTENT_MT = SubLObjectFactory.makeSymbol("SK-SOURCE-CONTENT-MT");
        $const12$contentMtHead = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMtHead"));
        $sym13$SK_SOURCE_CONTENT_MT_HEAD = SubLObjectFactory.makeSymbol("SK-SOURCE-CONTENT-MT-HEAD");
        $sym14$SK_SOURCE_MAPPING_MT = SubLObjectFactory.makeSymbol("SK-SOURCE-MAPPING-MT");
        $const15$mappingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mappingMt"));
        $const16$sksLogicalSchemaDescriptionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksLogicalSchemaDescriptionMt"));
        $const17$sksSourceDescriptionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksSourceDescriptionMt"));
        $const18$sksSchemaTranslationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksSchemaTranslationMt"));
        $const19$rowCount_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rowCount-SKS"));
        $const20$structuredKnowledgeSourceName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceName"));
        $sym21$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym22$SK_SOURCE_NAMESPACE = SubLObjectFactory.makeSymbol("SK-SOURCE-NAMESPACE");
        $str23$Multiple_namespaces_for__A___S__S = SubLObjectFactory.makeString("Multiple namespaces for ~A: ~S ~S");
        $const24$structuredKnowledgeSourceNamespac = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceNamespace"));
        $sym25$SK_SOURCE_BY_SKS_NAME = SubLObjectFactory.makeSymbol("SK-SOURCE-BY-SKS-NAME");
        $sym26$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw27$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const28$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaSourceMap"));
        $sym29$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $sym30$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $const31$subKS_Direct = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subKS-Direct"));
        $const32$meaningSentencePredicateForSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentencePredicateForSource"));
        $const33$meaningSentencePredicateForSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentencePredicateForSchema"));
        $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB = SubLObjectFactory.makeSymbol("GET-SKS-SINGLE-LITERAL-LOOKUP-DIRECTION-FROM-KB");
        $const35$SKSISingleLiteralRemovalModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISingleLiteralRemovalModule"));
        $kw36$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB = SubLObjectFactory.makeSymbol("GET-SKS-MULTI-LITERAL-LOOKUP-DIRECTION-FROM-KB");
        $const38$SKSIMultiLiteralRemovalModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMultiLiteralRemovalModule"));
        $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB = SubLObjectFactory.makeSymbol("GET-SKS-STORAGE-DIRECTION-FROM-KB");
        $const40$SKSIStorageModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIStorageModule"));
        $kw41$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const42$sksModuleTypeDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksModuleTypeDirection"));
        $const43$Backward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Backward-AssertionDirection"));
        $const44$Forward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forward-AssertionDirection"));
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-KS"), (SubLObject)SubLObjectFactory.makeSymbol("SK-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw47$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw48$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym49$GAF = SubLObjectFactory.makeUninternedSymbol("GAF");
        $sym50$SKSI_DO_GAF_ARG_INDEX_TRUE = SubLObjectFactory.makeSymbol("SKSI-DO-GAF-ARG-INDEX-TRUE");
        $kw51$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw52$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $sym53$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym54$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $sym55$SK_SOURCE_SUB_KS_CLOSURE = SubLObjectFactory.makeSymbol("SK-SOURCE-SUB-KS-CLOSURE");
        $sym56$SK_SOURCE_SUB_KS_MIN = SubLObjectFactory.makeSymbol("SK-SOURCE-SUB-KS-MIN");
        $sym57$SK_SOURCE_SUPER_KS_CLOSURE = SubLObjectFactory.makeSymbol("SK-SOURCE-SUPER-KS-CLOSURE");
        $sym58$SK_SOURCE_SUPER_KS_MAX = SubLObjectFactory.makeSymbol("SK-SOURCE-SUPER-KS-MAX");
        $sym59$SK_SOURCE_PROPER_SUPER_KS_ = SubLObjectFactory.makeSymbol("SK-SOURCE-PROPER-SUPER-KS?");
        $sym60$IMMEDIATE_GENL_KS = SubLObjectFactory.makeSymbol("IMMEDIATE-GENL-KS");
        $sym61$LOGICAL_SCHEMA_SOURCES = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-SOURCES");
        $sym62$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $const63$schemaRepresentationComplete = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaRepresentationComplete"));
        $sym64$ISA_PHYSICAL_SCHEMA_ = SubLObjectFactory.makeSymbol("ISA-PHYSICAL-SCHEMA?");
        $const65$PhysicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalSchema"));
        $int66$50 = SubLObjectFactory.makeInteger(50);
        $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED");
        $sym68$PHYSICAL_SCHEMA_FIELDS = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-FIELDS");
        $const69$physicalFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFields"));
        $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-PRIMARY-KEY");
        $const71$primaryKey = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("primaryKey"));
        $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-PRIMARY-KEY-COMPENSATE-FOR-TABLE-COLUMN-REPRESENTATION");
        $const73$suppressConvertingComparisonLiter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suppressConvertingComparisonLiteralsToSQL"));
        $const74$foreignKeyMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap"));
        $const75$foreignKeyMap_Restrict = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap-Restrict"));
        $const76$foreignKeyMap_Cascade = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap-Cascade"));
        $const77$foreignKeyMap_SetNull = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap-SetNull"));
        $const78$foreignKeyMap_SetDefault = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap-SetDefault"));
        $const79$uniqueFieldList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uniqueFieldList"));
        $const80$requiredFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredFields"));
        $sym81$PHYSICAL_FIELD_NAME = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-NAME");
        $const82$indexedFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexedFields"));
        $sym83$PHYSICAL_SCHEMA_ENUMERABLE_ = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-ENUMERABLE?");
        $const84$enumerableSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("enumerableSchema"));
        $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS");
        $const86$resultSetCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultSetCardinality"));
        $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS");
        $const88$resultSetCardinalityWithConstrain = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultSetCardinalityWithConstraints"));
        $const89$logicalPhysicalSchemaMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalSchemaMap"));
        $const90$exampleTuple = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exampleTuple"));
        $const91$fieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncoding"));
        $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-ORDERED-FIELD-LIST");
        $const93$schemaFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldNameList"));
        $sym94$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-PHYSICAL-SCHEMATA");
        $sym95$LOGICAL_SCHEMA_FIELDS = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-FIELDS");
        $const96$logicalFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFields"));
        $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-FIELD-INDEXICALS");
        $const98$logicalFieldIndexicals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldIndexicals"));
        $kw99$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw100$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw101$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym102$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw103$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str104$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym105$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw106$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str107$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw108$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str109$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const110$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str111$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str112$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str113$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const114$schemaExampleSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaExampleSentence"));
        $const115$logicalSchemaKeys = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaKeys"));
        $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS");
        $const117$logicalResultSetCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalResultSetCardinality"));
        $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS");
        $const119$logicalResultSetCardinalityWRTVal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalResultSetCardinalityWRTValue"));
        $const120$fieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding"));
        $const121$logicalSchemaSourceMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaSourceMap"));
        $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-SK-SOURCES-MEMOIZED");
        $const123$schemaCompleteExtentKnown = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaCompleteExtentKnown"));
        $const124$contentSentenceOfSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentSentenceOfSchema"));
        $sym125$LOGICAL_FIELD_P_MEMOIZED = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-P-MEMOIZED");
        $const126$LogicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalFieldFn"));
        $const127$LogicalField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalField"));
        $const128$LFAliasFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LFAliasFn"));
        $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P-MEMOIZED");
        $const130$TheLogicalFieldValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheLogicalFieldValueFn"));
        $const131$LFIAliasFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LFIAliasFn"));
        $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-FORT-FOR-SCHEMA");
        $sym133$ISA_LOGICAL_SCHEMA_ = SubLObjectFactory.makeSymbol("ISA-LOGICAL-SCHEMA?");
        $const134$LogicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalSchema"));
        $sym135$IS_FORT_A_REIFIED_MAPPING_ = SubLObjectFactory.makeSymbol("IS-FORT-A-REIFIED-MAPPING?");
        $const136$ReifiedMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiedMapping"));
        $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA = SubLObjectFactory.makeSymbol("CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMA");
        $list138 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")));
        $const139$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $sym140$SCHEMA_ISA = SubLObjectFactory.makeSymbol("SCHEMA-ISA");
        $const141$schemaIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaIsa"));
        $const142$objectField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectField"));
        $const143$SchemaObjectIDFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectIDFn"));
        $const144$SourceSchemaObjectIDFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectIDFn"));
        $const145$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn"));
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ODS"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-EXPRESSION")), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym147$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym148$FORMULA_ARGS = SubLObjectFactory.makeSymbol("FORMULA-ARGS");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("ODS"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-EXPRESSION")), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-FOR-INDEXICAL-FORT");
        $const151$indexicalForPhysicalField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalForPhysicalField"));
        $sym152$INDEXICAL_FOR_PHYSICAL_FIELD = SubLObjectFactory.makeSymbol("INDEXICAL-FOR-PHYSICAL-FIELD");
        $const153$nonNullFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonNullFields"));
        $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS = SubLObjectFactory.makeSymbol("NOT-NULL-PHYSICAL-FIELDS-FOR-PS");
        $kw155$NULL = SubLObjectFactory.makeKeyword("NULL");
        $sym156$PHYSICAL_FIELD_DEFAULT_VALUE = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-DEFAULT-VALUE");
        $const157$defaultFieldValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultFieldValue"));
        $const158$ISNull = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ISNull"));
        $const159$PhysicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalFieldFn"));
        $sym160$PHYSICAL_FIELD_SCHEMA = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-SCHEMA");
        $sym161$PHYSICAL_FIELD_SK_SOURCE = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-SK-SOURCE");
        $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-SK-SOURCE-NAME");
        $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-SK-SOURCE-NAMESPACE");
        $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-SK-SOURCE");
        $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAME");
        $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAMESPACE");
        $sym167$PHYSICAL_FIELD_VIRTUAL_ = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-VIRTUAL?");
        $const168$VirtualPhysicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VirtualPhysicalFieldFn"));
        $const169$virtualPhysicalFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("virtualPhysicalFields"));
        $const170$PFAliasFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PFAliasFn"));
        $const171$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThePhysicalFieldValueFn"));
        $const172$PFIAliasFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PFIAliasFn"));
        $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-FOR-SKS-NAME");
        $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-FOR-SKS-AND-FIELD-NAMES");
        $sym175$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-FOR-PHYSICAL-FIELD");
        $const177$integerSequenceGeneratorIncrement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerSequenceGeneratorIncrementsField"));
        $sym178$INTEGER_SEQUENCE_GENERATOR_NAME = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-NAME");
        $const179$integerSequenceGeneratorName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerSequenceGeneratorName"));
        $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_ = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-VALUE-IS-AUTO-INCREMENTED?");
        $const181$TheNextSequenceValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNextSequenceValueFn"));
        $str182$logical_field_indexical_without_c = SubLObjectFactory.makeString("logical field indexical without corresponding logical field: ~s");
        $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL-FORT");
        $const184$indexicalForLogicalField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalForLogicalField"));
        $sym185$INDEXICAL_FOR_LOGICAL_FIELD = SubLObjectFactory.makeSymbol("INDEXICAL-FOR-LOGICAL-FIELD");
        $sym186$LOGICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL");
        $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-SK-SOURCE");
        $sym188$RELEVANT_PRED_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ");
        $const189$joinable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("joinable"));
        $sym190$LOGICAL_FIELDS_JOINABLE_ = SubLObjectFactory.makeSymbol("LOGICAL-FIELDS-JOINABLE?");
        $const191$fieldIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldIsa"));
        $const192$logicalSchemaFieldTypeList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaFieldTypeList"));
        $const193$logicalFieldMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldMapping"));
        $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT = SubLObjectFactory.makeSymbol("SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT");
        $const195$logicalPhysicalFieldMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalFieldMap"));
        $const196$logicalPhysicalFieldMap_DecodeClo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalFieldMap-DecodeClosed"));
        $const197$logicalPhysicalFieldMap_EncodeClo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalFieldMap-EncodeClosed"));
        $const198$fieldDataType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDataType"));
        $const199$SQLBoolean = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SQLBoolean"));
        $const200$programDataTypeNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("programDataTypeNameString"));
        $const201$schemaFieldsIndex = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldsIndex"));
        $const202$indexType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexType"));
        $const203$indexName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexName"));
        $const204$programIndexTypeNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("programIndexTypeNameString"));
        $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR = SubLObjectFactory.makeSymbol("CYCL-OPERATOR-TO-CSQL-OPERATOR");
        $const206$cyclOperatorToCSQLOperator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclOperatorToCSQLOperator"));
        $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR = SubLObjectFactory.makeSymbol("CSQL-OPERATOR-TO-CYCL-OPERATOR");
        $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR = SubLObjectFactory.makeSymbol("CSQL-OPERATOR-TO-SQL-OPERATOR");
        $const209$csqlOperatorToSQLOperator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("csqlOperatorToSQLOperator"));
        $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX = SubLObjectFactory.makeSymbol("CSQL-OPERATOR-TO-SQL-OPERATOR-SYNTAX");
        $const211$SQLOperatorSyntax_Prefix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SQLOperatorSyntax-Prefix"));
        $const212$SQLOperatorSyntax_Infix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SQLOperatorSyntax-Infix"));
        $const213$SQLOperatorSyntax_Postfix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SQLOperatorSyntax-Postfix"));
        $const214$SQLOperatorSyntax_InverseInfix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SQLOperatorSyntax-InverseInfix"));
        $const215$SQLFunctionSyntax = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SQLFunctionSyntax"));
        $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF = SubLObjectFactory.makeSymbol("CSQL-TO-SQL-TRANSLATION-FORMAT-GAF");
        $const217$csqlToSQLTranslationFormat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("csqlToSQLTranslationFormat"));
        $const218$SKSIMappingMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMappingMicrotheory"));
        $sym219$SKSI_CONTENT_MT_P = SubLObjectFactory.makeSymbol("SKSI-CONTENT-MT-P");
        $sym220$SKSI_CONTENT_MTS = SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS");
        $const221$SKSIContentMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIContentMicrotheory"));
        $sym222$_SKSI_CONTENT_MTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-CONTENT-MTS-CACHING-STATE*");
        $sym223$CLEAR_SKSI_CONTENT_MTS = SubLObjectFactory.makeSymbol("CLEAR-SKSI-CONTENT-MTS");
        $const224$sksRepresentationComplete = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRepresentationComplete"));
        $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P");
        $const226$SKSISupportedDatabaseServerProgra = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedDatabaseServerProgram"));
        $const227$defaultSKSForDatabaseServerProgra = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultSKSForDatabaseServerProgram"));
        $str228$Primary_keys_for__S_in__S_were_no = SubLObjectFactory.makeString("Primary keys for ~S in ~S were not found");
        $str229$Primary_keys_for__S_in__S_was_not = SubLObjectFactory.makeString("Primary keys for ~S in ~S was not an EL list: ~S");
        $kw230$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const231$columnInDBTableNamed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("columnInDBTableNamed"));
        $const232$fieldName_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldName-SKS"));
        $str233$Could_not_determine_the_column_na = SubLObjectFactory.makeString("Could not determine the column name (via ~A) for ~a in ~a");
        $str234$Could_not_find_the_primary_key_co = SubLObjectFactory.makeString("Could not find the primary key column ~a in the ~A ~a for ~a in ~a");
        $const235$tableFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableFieldNameList"));
        $const236$tablePrimaryKey = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tablePrimaryKey"));
        $str237$Could_not_get_the___tableFieldNam = SubLObjectFactory.makeString("Could not get the #$tableFieldNameList for ~a in ~a");
        $str238$Could_not_determine_the___tablePr = SubLObjectFactory.makeString("Could not determine the #$tablePrimaryKey for ~a in ~a");
        $sym239$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str240$Could_not_find_a_physical_schema_ = SubLObjectFactory.makeString("Could not find a physical schema for table ~A in ~A");
        $str241$Could_not_get_the___schemaFieldNa = SubLObjectFactory.makeString("Could not get the #$schemaFieldNameList for ~a in ~a");
        $str242$Could_not_determine_the___primary = SubLObjectFactory.makeString("Could not determine the #$primaryKey for ~a in ~a");
        $kw243$TABLE = SubLObjectFactory.makeKeyword("TABLE");
        $const244$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $const245$tableInDBNamed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableInDBNamed"));
        $kw246$TABLE_NAME = SubLObjectFactory.makeKeyword("TABLE-NAME");
        $list247 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE-NAME"));
        $sym248$NON_EMPTY_STRING_ = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?");
        $str249$_A___A = SubLObjectFactory.makeString("~A: ~A");
        $sym250$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw251$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym252$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-STRING"));
        $str254$_ = SubLObjectFactory.makeString(" ");
        $sym255$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $const256$CycKBSubsetCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycKBSubsetCollection"));
        $const257$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $str258$No___CycKBSubsetCollections_found = SubLObjectFactory.makeString("No #$CycKBSubsetCollections found to inherit from ~A to ~A~%");
        $const259$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const260$temporalFieldNullMapsTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalFieldNullMapsTo"));
        $kw261$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
    }
    
    public static final class $logical_field_indexical_p$UnaryFunction extends UnaryFunction
    {
        public $logical_field_indexical_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LOGICAL-FIELD-INDEXICAL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_kb_accessors.logical_field_indexical_p(arg1);
        }
    }
    
    public static final class $physical_field_indexical_p$UnaryFunction extends UnaryFunction
    {
        public $physical_field_indexical_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PHYSICAL-FIELD-INDEXICAL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_kb_accessors.physical_field_indexical_p(arg1);
        }
    }
    
    public static final class $clear_sksi_content_mts$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_sksi_content_mts$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-SKSI-CONTENT-MTS"));
        }
        
        @Override
		public SubLObject processItem() {
            return sksi_kb_accessors.clear_sksi_content_mts();
        }
    }
}

/*

	Total time: 1908 ms
	
*/