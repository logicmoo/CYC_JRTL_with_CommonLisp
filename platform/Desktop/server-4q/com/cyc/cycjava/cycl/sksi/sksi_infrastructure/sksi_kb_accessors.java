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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class sksi_kb_accessors
    extends
      SubLTranslatedFile
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
  public static SubLObject content_mt_sk_source_gaf(final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_gaf( mt, $const0$contentMt, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1374L)
  public static SubLObject content_mt_sk_source_internal(final SubLObject mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLObject gaf = content_mt_sk_source_gaf( mt );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      return assertions_high.gaf_arg1( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1374L)
  public static SubLObject content_mt_sk_source(final SubLObject mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return content_mt_sk_source_internal( mt, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym2$CONTENT_MT_SK_SOURCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym2$CONTENT_MT_SK_SOURCE, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym2$CONTENT_MT_SK_SOURCE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( mt, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( mt.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( content_mt_sk_source_internal( mt, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( mt, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1622L)
  public static SubLObject content_mt_spindle_member_p(final SubLObject content_mt)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value( content_mt, $const3$mtSpindleMember, TWO_INTEGER, TWO_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1754L)
  public static SubLObject sk_source_p(final SubLObject v_object)
  {
    return isa.isaP( v_object, $const4$StructuredKnowledgeSource, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1958L)
  public static SubLObject sk_source_in_any_mt_p_internal(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const4$StructuredKnowledgeSource );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 1958L)
  public static SubLObject sk_source_in_any_mt_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_in_any_mt_p_internal( v_object );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym5$SK_SOURCE_IN_ANY_MT_P, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym5$SK_SOURCE_IN_ANY_MT_P, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym5$SK_SOURCE_IN_ANY_MT_P, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_in_any_mt_p_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2102L)
  public static SubLObject modifiable_sk_source_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value( v_object, $const6$sksModifiable, ONE_INTEGER, ONE_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2216L)
  public static SubLObject modifiable_sk_source_in_any_mt_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject modifiableP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      modifiableP = modifiable_sk_source_p( v_object );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return modifiableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2403L)
  public static SubLObject code_mapping_knowledge_sourceP(final SubLObject sk_source)
  {
    return meaning_sentence_predicate_for_sk_sourceP( $const9$codeMapping, sk_source );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2542L)
  public static SubLObject get_sk_source_property_from_kb_internal(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject note_csql_supportP,
      SubLObject check_arg, SubLObject check_argnum)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( gather_argnum == UNPROVIDED )
    {
      gather_argnum = TWO_INTEGER;
    }
    if( note_csql_supportP == UNPROVIDED )
    {
      note_csql_supportP = T;
    }
    if( check_arg == UNPROVIDED )
    {
      check_arg = NIL;
    }
    if( check_argnum == UNPROVIDED )
    {
      check_argnum = NIL;
    }
    SubLObject sk_source_to_look;
    SubLObject spec_preds;
    SubLObject gaf;
    for( sk_source_to_look = sk_source, spec_preds = ConsesLow.cons( pred, genl_predicates.spec_predicates( pred, UNPROVIDED, UNPROVIDED ) ), gaf = get_sk_source_property_from_kb_int( sk_source_to_look, spec_preds,
        index_argnum, check_arg, check_argnum ); NIL == gaf && NIL != sk_source_to_look; gaf = get_sk_source_property_from_kb_int( sk_source_to_look, spec_preds, index_argnum, check_arg, check_argnum ) )
    {
      sk_source_to_look = immediate_genl_ks( sk_source_to_look );
      if( NIL != forts.fort_p( sk_source_to_look ) )
      {
      }
    }
    if( NIL != gaf )
    {
      if( NIL != note_csql_supportP )
      {
        sksi_hl_support_utilities.note_csql_support( gaf );
      }
      return assertions_high.gaf_arg( gaf, gather_argnum );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 2542L)
  public static SubLObject get_sk_source_property_from_kb(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject note_csql_supportP, SubLObject check_arg,
      SubLObject check_argnum)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( gather_argnum == UNPROVIDED )
    {
      gather_argnum = TWO_INTEGER;
    }
    if( note_csql_supportP == UNPROVIDED )
    {
      note_csql_supportP = T;
    }
    if( check_arg == UNPROVIDED )
    {
      check_arg = NIL;
    }
    if( check_argnum == UNPROVIDED )
    {
      check_argnum = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_sk_source_property_from_kb_internal( sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB, SEVEN_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( sk_source.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( index_argnum.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( gather_argnum.eql( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( note_csql_supportP.eql( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( check_arg.eql( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && check_argnum.eql( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_sk_source_property_from_kb_internal( sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg,
        check_argnum ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sk_source, pred, index_argnum, gather_argnum, note_csql_supportP, check_arg, check_argnum ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 3676L)
  public static SubLObject get_sk_source_property_from_kb_int(final SubLObject sk_source, final SubLObject preds, final SubLObject index_argnum, final SubLObject check_arg, final SubLObject check_argnum)
  {
    SubLObject gaf = NIL;
    if( NIL == gaf )
    {
      SubLObject csome_list_var = preds;
      SubLObject pred = NIL;
      pred = csome_list_var.first();
      while ( NIL == gaf && NIL != csome_list_var)
      {
        if( NIL != check_argnum && NIL != check_arg )
        {
          gaf = kb_mapping_utilities.fpred_u_v_holds_gaf( pred, sk_source, check_arg, index_argnum, check_argnum, $kw1$TRUE );
        }
        else
        {
          gaf = kb_mapping_utilities.fpred_value_gaf( sk_source, pred, index_argnum, $kw1$TRUE );
        }
        csome_list_var = csome_list_var.rest();
        pred = csome_list_var.first();
      }
    }
    return gaf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4046L)
  public static SubLObject sk_source_content_mt_gaf(final SubLObject sk_source)
  {
    return kb_mapping_utilities.fpred_value_gaf( sk_source, $const0$contentMt, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4159L)
  public static SubLObject sk_source_content_mt_internal(final SubLObject sk_source)
  {
    final SubLObject gaf = sk_source_content_mt_gaf( sk_source );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      return assertions_high.gaf_arg2( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4159L)
  public static SubLObject sk_source_content_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_content_mt_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym11$SK_SOURCE_CONTENT_MT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym11$SK_SOURCE_CONTENT_MT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym11$SK_SOURCE_CONTENT_MT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_content_mt_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4374L)
  public static SubLObject sk_source_content_mt_in_any_mt(final SubLObject sk_source)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( sk_source, $const0$contentMt, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4501L)
  public static SubLObject sk_source_content_mt_head_gaf(final SubLObject sk_source)
  {
    return kb_mapping_utilities.fpred_value_gaf( sk_source, $const12$contentMtHead, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4623L)
  public static SubLObject sk_source_content_mt_head_internal(final SubLObject sk_source)
  {
    final SubLObject gaf = sk_source_content_mt_head_gaf( sk_source );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      return assertions_high.gaf_arg2( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4623L)
  public static SubLObject sk_source_content_mt_head(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_content_mt_head_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym13$SK_SOURCE_CONTENT_MT_HEAD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym13$SK_SOURCE_CONTENT_MT_HEAD, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym13$SK_SOURCE_CONTENT_MT_HEAD, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_content_mt_head_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4846L)
  public static SubLObject sk_source_content_mt_head_in_any_mt(final SubLObject sk_source)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( sk_source, $const12$contentMtHead, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4982L)
  public static SubLObject sk_source_mapping_mt_internal(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      mt = get_sk_source_property_from_kb( sk_source, $const15$mappingMt, ONE_INTEGER, TWO_INTEGER, NIL, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 4982L)
  public static SubLObject sk_source_mapping_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_mapping_mt_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym14$SK_SOURCE_MAPPING_MT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym14$SK_SOURCE_MAPPING_MT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym14$SK_SOURCE_MAPPING_MT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_mapping_mt_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 5332L)
  public static SubLObject sk_source_logical_schema_description_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      mt = get_sk_source_property_from_kb( sk_source, $const16$sksLogicalSchemaDescriptionMt, ONE_INTEGER, TWO_INTEGER, NIL, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 5748L)
  public static SubLObject logical_schema_description_mt_sk_source_in_any_mt(final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( mt, $const16$sksLogicalSchemaDescriptionMt, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 5900L)
  public static SubLObject sk_source_source_description_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      mt = get_sk_source_property_from_kb( sk_source, $const17$sksSourceDescriptionMt, ONE_INTEGER, TWO_INTEGER, NIL, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6280L)
  public static SubLObject sk_source_schema_translation_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      mt = get_sk_source_property_from_kb( sk_source, $const18$sksSchemaTranslationMt, ONE_INTEGER, TWO_INTEGER, NIL, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6660L)
  public static SubLObject schema_translation_mt_sk_source_in_any_mt(final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( mt, $const18$sksSchemaTranslationMt, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6797L)
  public static SubLObject sk_source_ks_type(final SubLObject sk_source)
  {
    return sksi_access_path.get_sks_type( sk_source );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 6881L)
  public static SubLObject sk_source_row_count(final SubLObject sk_source)
  {
    return get_sk_source_property_from_kb( sk_source, $const19$rowCount_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7000L)
  public static SubLObject sk_source_name(final SubLObject sk_source)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf( sk_source, $const20$structuredKnowledgeSourceName, ONE_INTEGER, $kw1$TRUE );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_csql_support( gaf );
      return assertions_high.gaf_arg2( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7205L)
  public static SubLObject sk_source_name_from_mapping_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sk_source_mapping_mt( sk_source );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      return sk_source_name( sk_source );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7409L)
  public static SubLObject sk_source_namespace_internal(final SubLObject sk_source)
  {
    final SubLObject local_gaf = sk_source_asserted_namespace_gaf( sk_source );
    if( NIL != local_gaf )
    {
      sksi_hl_support_utilities.note_csql_support( local_gaf );
      return assertions_high.gaf_arg2( local_gaf );
    }
    SubLObject super_gafs = NIL;
    SubLObject cdolist_list_var = sk_source_super_ks_closure( sk_source );
    SubLObject super_ks = NIL;
    super_ks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var;
      final SubLObject super_gaf = var = sk_source_asserted_namespace_gaf( super_ks );
      if( NIL != var )
      {
        super_gafs = ConsesLow.cons( var, super_gafs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      super_ks = cdolist_list_var.first();
    }
    if( NIL != super_gafs )
    {
      final SubLObject candidate_namespace = assertions_high.gaf_arg2( super_gafs.first() );
      SubLObject cdolist_list_var2 = super_gafs.rest();
      SubLObject additional_namespace_gaf = NIL;
      additional_namespace_gaf = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject additional_namespace = assertions_high.gaf_arg2( additional_namespace_gaf );
        if( !candidate_namespace.equalp( additional_namespace ) )
        {
          Errors.warn( $str23$Multiple_namespaces_for__A___S__S, candidate_namespace, additional_namespace );
          return NIL;
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        additional_namespace_gaf = cdolist_list_var2.first();
      }
      return candidate_namespace;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 7409L)
  public static SubLObject sk_source_namespace(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_namespace_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym22$SK_SOURCE_NAMESPACE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym22$SK_SOURCE_NAMESPACE, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym22$SK_SOURCE_NAMESPACE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_namespace_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 8324L)
  public static SubLObject sk_source_asserted_namespace_gaf(final SubLObject sk_source)
  {
    return kb_mapping_utilities.fpred_value_gaf( sk_source, $const24$structuredKnowledgeSourceNamespac, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 8468L)
  public static SubLObject sk_source_by_sks_name_internal(final SubLObject name, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sks = NIL;
    if( NIL != hlmt.hlmtP( mapping_mt ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mapping_mt, thread );
        final SubLObject pred_var = $const20$structuredKnowledgeSourceName;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = sks;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw1$TRUE, NIL );
                  SubLObject done_var_$3 = sks;
                  final SubLObject token_var_$4 = NIL;
                  while ( NIL == done_var_$3)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                    final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                    if( NIL != valid_$5 && NIL != string_utilities.weak_string_equal( name, assertions_high.gaf_arg2( gaf ) ) )
                    {
                      sks = assertions_high.gaf_arg1( gaf );
                    }
                    done_var_$3 = makeBoolean( NIL == valid_$5 || NIL != sks );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != sks );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$1, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject pred_var2 = $const20$structuredKnowledgeSourceName;
    if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
    {
      final SubLObject str2 = NIL;
      final SubLObject _prev_bind_9 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str2 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str2 );
        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
        SubLObject done_var2 = sks;
        final SubLObject token_var2 = NIL;
        while ( NIL == done_var2)
        {
          final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
          final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
          if( NIL != valid2 )
          {
            utilities_macros.note_progress();
            SubLObject final_index_iterator2 = NIL;
            try
            {
              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw27$GAF, $kw1$TRUE, NIL );
              SubLObject done_var_$4 = sks;
              final SubLObject token_var_$5 = NIL;
              while ( NIL == done_var_$4)
              {
                final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$5 );
                final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( gaf2 ) );
                if( NIL != valid_$6 && NIL != string_utilities.weak_string_equal( name, assertions_high.gaf_arg2( gaf2 ) ) )
                {
                  sks = assertions_high.gaf_arg1( gaf2 );
                }
                done_var_$4 = makeBoolean( NIL == valid_$6 || NIL != sks );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator2 )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
              }
            }
          }
          done_var2 = makeBoolean( NIL == valid2 || NIL != sks );
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_16, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_15, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_14, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_11, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_9, thread );
      }
    }
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 8468L)
  public static SubLObject sk_source_by_sks_name(final SubLObject name, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_by_sks_name_internal( name, mapping_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym25$SK_SOURCE_BY_SKS_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym25$SK_SOURCE_BY_SKS_NAME, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym25$SK_SOURCE_BY_SKS_NAME, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( name, mapping_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( name.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mapping_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_by_sks_name_internal( name, mapping_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( name, mapping_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9225L)
  public static SubLObject sk_source_physical_schema_gafs(final SubLObject sk_source)
  {
    return list_utilities.fast_remove_duplicates( kb_mapping_utilities.pred_value_gafs( sk_source, $const28$physicalSchemaSourceMap, TWO_INTEGER, $kw1$TRUE ), Symbols.symbol_function( EQUAL ), $sym29$ASSERTION_FORMULA,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9410L)
  public static SubLObject sk_source_physical_schemata(final SubLObject sk_source)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = sk_source_physical_schema_gafs( sk_source );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      final SubLObject item_var = assertions_high.gaf_arg1( gaf );
      if( NIL == conses_high.member( item_var, result, $sym30$KBEQ, Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9676L)
  public static SubLObject sk_source_complex_physical_schemata(final SubLObject sk_source)
  {
    return list_utilities.fast_delete_duplicates( sk_source_complex_physical_schemata_int( sk_source ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 9990L)
  public static SubLObject sk_source_complex_physical_schemata_int(final SubLObject sk_source)
  {
    SubLObject physical_schemata = sk_source_physical_schemata( sk_source );
    if( NIL == sksi_infrastructure_utilities.sk_source_atomicP( sk_source ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject sub_sk_sources = cdolist_list_var = sk_source_immediate_spec_sk_sources( sk_source, UNPROVIDED );
      SubLObject sub_sk_source = NIL;
      sub_sk_source = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        physical_schemata = ConsesLow.append( physical_schemata, sk_source_complex_physical_schemata_int( sub_sk_source ) );
        cdolist_list_var = cdolist_list_var.rest();
        sub_sk_source = cdolist_list_var.first();
      }
    }
    return physical_schemata;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 10445L)
  public static SubLObject sk_source_logical_schemata(final SubLObject sk_source)
  {
    final SubLObject physical_schemata = sk_source_physical_schemata( sk_source );
    SubLObject logical_schemata = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      logical_schemata = ConsesLow.append( logical_schemata, physical_schema_logical_schemata( physical_schema ) );
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( logical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 10809L)
  public static SubLObject sk_source_complex_logical_schemata(final SubLObject sk_source)
  {
    final SubLObject physical_schemata = sk_source_complex_physical_schemata( sk_source );
    SubLObject logical_schemata = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      logical_schemata = ConsesLow.append( logical_schemata, physical_schema_logical_schemata( physical_schema ) );
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( logical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 11190L)
  public static SubLObject sk_source_physical_logical_schema_pairs(final SubLObject sk_source)
  {
    final SubLObject physical_schemata = sk_source_physical_schemata( sk_source );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$11;
      final SubLObject logical_schemata = cdolist_list_var_$11 = physical_schema_logical_schemata( physical_schema );
      SubLObject logical_schema = NIL;
      logical_schema = cdolist_list_var_$11.first();
      while ( NIL != cdolist_list_var_$11)
      {
        result = ConsesLow.cons( ConsesLow.list( physical_schema, logical_schema ), result );
        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
        logical_schema = cdolist_list_var_$11.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 11594L)
  public static SubLObject sk_source_immediate_spec_sk_sources(final SubLObject sk_source, SubLObject meta_mt)
  {
    if( meta_mt == UNPROVIDED )
    {
      meta_mt = sk_source_mapping_mt( sk_source );
    }
    return kb_mapping_utilities.pred_values_in_relevant_mts( sk_source, $const31$subKS_Direct, meta_mt, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 11861L)
  public static SubLObject meaning_sentence_predicate_for_sk_sourceP(final SubLObject pred, final SubLObject sk_source)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_u_v_holds_gaf( $const32$meaningSentencePredicateForSource, sk_source, pred, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12042L)
  public static SubLObject logical_schema_for_meaning_sentence_predicate(final SubLObject pred, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      result = kb_mapping_utilities.fpred_value( pred, $const33$meaningSentencePredicateForSchema, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12283L)
  public static SubLObject sk_source_complex_required_fields(final SubLObject sk_source)
  {
    return physical_schemata_required_fields( sk_source_complex_physical_schemata( sk_source ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12442L)
  public static SubLObject sk_source_required_fields(final SubLObject sk_source)
  {
    return physical_schemata_required_fields( sk_source_physical_schemata( sk_source ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12584L)
  public static SubLObject sk_source_sql_flavor(final SubLObject sk_source)
  {
    return sksi_access_path.access_path_sql_flavor( sksi_access_path.sksi_determine_access_path( sk_source, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12709L)
  public static SubLObject get_sks_single_literal_lookup_direction_from_kb_internal(final SubLObject sk_source)
  {
    return get_sks_module_direction_from_kb( sk_source, $const35$SKSISingleLiteralRemovalModule, $kw36$BACKWARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 12709L)
  public static SubLObject get_sks_single_literal_lookup_direction_from_kb(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_sks_single_literal_lookup_direction_from_kb_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_sks_single_literal_lookup_direction_from_kb_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13117L)
  public static SubLObject get_sks_multi_literal_lookup_direction_from_kb_internal(final SubLObject sk_source)
  {
    return get_sks_module_direction_from_kb( sk_source, $const38$SKSIMultiLiteralRemovalModule, $kw36$BACKWARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13117L)
  public static SubLObject get_sks_multi_literal_lookup_direction_from_kb(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_sks_multi_literal_lookup_direction_from_kb_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_sks_multi_literal_lookup_direction_from_kb_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13324L)
  public static SubLObject get_sks_storage_direction_from_kb_internal(final SubLObject sk_source)
  {
    return get_sks_module_direction_from_kb( sk_source, $const40$SKSIStorageModule, $kw41$FORWARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13324L)
  public static SubLObject get_sks_storage_direction_from_kb(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_sks_storage_direction_from_kb_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_sks_storage_direction_from_kb_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13505L)
  public static SubLObject get_sks_module_direction_from_kb(final SubLObject sk_source, final SubLObject module_type, final SubLObject default_direction)
  {
    final SubLObject kb_direction = get_sk_source_property_from_kb( sk_source, $const42$sksModuleTypeDirection, ONE_INTEGER, THREE_INTEGER, NIL, module_type, TWO_INTEGER );
    final SubLObject pcase_var;
    final SubLObject direction = pcase_var = ( ( NIL != kb_direction ) ? kb_direction : default_direction );
    if( pcase_var.eql( $const43$Backward_AssertionDirection ) )
    {
      return $kw36$BACKWARD;
    }
    if( pcase_var.eql( $const44$Forward_AssertionDirection ) )
    {
      return $kw41$FORWARD;
    }
    return direction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 13953L)
  public static SubLObject sk_source_sub_ks_direct(final SubLObject sk_source)
  {
    return kb_mapping_utilities.pred_values( sk_source, $const31$subKS_Direct, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14260L)
  public static SubLObject do_sk_source_sub_ks_direct(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sub_ks = NIL;
    SubLObject sk_source = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    sub_ks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    sk_source = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list45 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list45 );
      if( NIL == conses_high.member( current_$12, $list46, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw47$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw48$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject gaf = $sym49$GAF;
    return ConsesLow.list( $sym50$SKSI_DO_GAF_ARG_INDEX_TRUE, ConsesLow.list( gaf, sk_source, $kw51$PREDICATE, $const31$subKS_Direct, $kw52$INDEX, ONE_INTEGER, $kw48$DONE, done ), ConsesLow.listS( $sym53$CLET, ConsesLow
        .list( ConsesLow.list( sub_ks, ConsesLow.list( $sym54$GAF_ARG2, gaf ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14535L)
  public static SubLObject sk_source_proper_sub_ks_closure(final SubLObject sk_source)
  {
    return Mapping.mapcan( Symbols.symbol_function( $sym55$SK_SOURCE_SUB_KS_CLOSURE ), sk_source_sub_ks_direct( sk_source ), EMPTY_SUBL_OBJECT_ARRAY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14679L)
  public static SubLObject sk_source_proper_sub_ks_closure_in_mapping_mt(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject closure = NIL;
    final SubLObject mt_var = sk_source_mapping_mt( sk_source );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      closure = sk_source_proper_sub_ks_closure( sk_source );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return closure;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 14936L)
  public static SubLObject sk_source_sub_ks_closure(final SubLObject sk_source)
  {
    return ConsesLow.cons( sk_source, Mapping.mapcan( Symbols.symbol_function( $sym55$SK_SOURCE_SUB_KS_CLOSURE ), sk_source_sub_ks_direct( sk_source ), EMPTY_SUBL_OBJECT_ARRAY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 15476L)
  public static SubLObject sk_source_sub_ks_min(final SubLObject sk_source)
  {
    final SubLObject direct_sub_ks_list = sk_source_sub_ks_direct( sk_source );
    return ( NIL != direct_sub_ks_list ) ? Mapping.mapcan( Symbols.symbol_function( $sym56$SK_SOURCE_SUB_KS_MIN ), direct_sub_ks_list, EMPTY_SUBL_OBJECT_ARRAY ) : ConsesLow.list( sk_source );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16073L)
  public static SubLObject sk_source_sub_ksP(final SubLObject super_ks, final SubLObject sub_ks)
  {
    return sk_source_super_ksP( sub_ks, super_ks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16175L)
  public static SubLObject sk_source_sub_ks_in_any_mtP(final SubLObject super_ks, final SubLObject sub_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      result = sk_source_super_ksP( sub_ks, super_ks );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16354L)
  public static SubLObject sk_source_proper_sub_ksP(final SubLObject super_ks, final SubLObject sub_ks)
  {
    return sk_source_proper_super_ksP( sub_ks, super_ks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16470L)
  public static SubLObject sk_source_super_ks_direct(final SubLObject sk_source)
  {
    return kb_mapping_utilities.pred_values( sk_source, $const31$subKS_Direct, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16586L)
  public static SubLObject sk_source_proper_super_ks_closure(final SubLObject sk_source)
  {
    return Mapping.mapcan( Symbols.symbol_function( $sym57$SK_SOURCE_SUPER_KS_CLOSURE ), sk_source_super_ks_direct( sk_source ), EMPTY_SUBL_OBJECT_ARRAY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 16736L)
  public static SubLObject sk_source_super_ks_closure(final SubLObject sk_source)
  {
    return ConsesLow.cons( sk_source, Mapping.mapcan( Symbols.symbol_function( $sym57$SK_SOURCE_SUPER_KS_CLOSURE ), sk_source_super_ks_direct( sk_source ), EMPTY_SUBL_OBJECT_ARRAY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 17264L)
  public static SubLObject sk_source_super_ks_max(final SubLObject sk_source)
  {
    final SubLObject direct_super_ks_list = sk_source_super_ks_direct( sk_source );
    return ( NIL != direct_super_ks_list ) ? Mapping.mapcan( Symbols.symbol_function( $sym58$SK_SOURCE_SUPER_KS_MAX ), direct_super_ks_list, EMPTY_SUBL_OBJECT_ARRAY ) : ConsesLow.list( sk_source );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 17874L)
  public static SubLObject sk_source_super_ksP(final SubLObject sub_ks, final SubLObject super_ks)
  {
    return makeBoolean( NIL != kb_utilities.kbeq( sub_ks, super_ks ) || NIL != sk_source_proper_super_ksP( sub_ks, super_ks ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18307L)
  public static SubLObject sk_source_proper_super_ksP_internal(final SubLObject sub_ks, final SubLObject super_ks)
  {
    SubLObject super_ksP = NIL;
    final SubLObject pred_var = $const31$subKS_Direct;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( sub_ks, TWO_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( sub_ks, TWO_INTEGER, pred_var );
      SubLObject done_var = super_ksP;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw1$TRUE, NIL );
            SubLObject done_var_$13 = super_ksP;
            final SubLObject token_var_$14 = NIL;
            while ( NIL == done_var_$13)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$14 );
              final SubLObject valid_$15 = makeBoolean( !token_var_$14.eql( gaf ) );
              if( NIL != valid_$15 )
              {
                final SubLObject sks = assertions_high.gaf_arg1( gaf );
                super_ksP = makeBoolean( NIL != kb_utilities.kbeq( sks, super_ks ) || NIL != sk_source_proper_super_ksP( sks, super_ks ) );
              }
              done_var_$13 = makeBoolean( NIL == valid_$15 || NIL != super_ksP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != super_ksP );
      }
    }
    return super_ksP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18307L)
  public static SubLObject sk_source_proper_super_ksP(final SubLObject sub_ks, final SubLObject super_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sk_source_proper_super_ksP_internal( sub_ks, super_ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym59$SK_SOURCE_PROPER_SUPER_KS_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym59$SK_SOURCE_PROPER_SUPER_KS_, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym59$SK_SOURCE_PROPER_SUPER_KS_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sub_ks, super_ks );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( sub_ks.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && super_ks.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sk_source_proper_super_ksP_internal( sub_ks, super_ks ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sub_ks, super_ks ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18675L)
  public static SubLObject common_super_ksP(final SubLObject sk_source1, final SubLObject sk_source2)
  {
    if( NIL != kb_utilities.kbeq( sk_source1, sk_source2 ) )
    {
      return T;
    }
    final SubLObject tops1 = sk_source_super_ks_max( sk_source1 );
    final SubLObject tops2 = sk_source_super_ks_max( sk_source2 );
    return keyhash_utilities.fast_intersectP( tops1, tops2, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 18968L)
  public static SubLObject super_ks_closure_intersection(final SubLObject sk_source1, final SubLObject sk_source2)
  {
    return keyhash_utilities.fast_intersection( sk_source_super_ks_closure( sk_source1 ), sk_source_super_ks_closure( sk_source2 ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19191L)
  public static SubLObject immediate_genl_ks_internal(final SubLObject sk_source)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf( sk_source, $const31$subKS_Direct, TWO_INTEGER, UNPROVIDED );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_csql_support( gaf );
      return assertions_high.gaf_arg1( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19191L)
  public static SubLObject immediate_genl_ks(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return immediate_genl_ks_internal( sk_source );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym60$IMMEDIATE_GENL_KS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym60$IMMEDIATE_GENL_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym60$IMMEDIATE_GENL_KS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( immediate_genl_ks_internal( sk_source ) ) );
      memoization_state.caching_state_put( caching_state, sk_source, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19410L)
  public static SubLObject max_genl_ks(final SubLObject sk_source)
  {
    final SubLObject genl_ks = immediate_genl_ks( sk_source );
    if( NIL != kb_utilities.kbeq( genl_ks, sk_source ) )
    {
      return sk_source;
    }
    if( NIL != forts.fort_p( genl_ks ) )
    {
      return max_genl_ks( genl_ks );
    }
    return sk_source;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 19720L)
  public static SubLObject nearest_common_super_ks(final SubLObject sks_list)
  {
    final SubLObject new_sks_list = list_utilities.fast_delete_duplicates( sks_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( new_sks_list ) )
    {
      return new_sks_list.first();
    }
    final SubLObject first = new_sks_list.first();
    final SubLObject rest = new_sks_list.rest();
    SubLObject foundP;
    SubLObject v_super;
    SubLObject failP;
    SubLObject csome_list_var;
    SubLObject ks;
    for( foundP = NIL, v_super = NIL, v_super = immediate_genl_ks( first ); NIL == foundP && NIL != v_super; v_super = immediate_genl_ks( first ) )
    {
      failP = NIL;
      if( NIL == failP )
      {
        for( csome_list_var = rest, ks = NIL, ks = csome_list_var.first(); NIL == failP && NIL != csome_list_var; failP = makeBoolean( NIL == sk_source_sub_ksP( v_super, ks ) ), csome_list_var = csome_list_var
            .rest(), ks = csome_list_var.first() )
        {
        }
      }
      if( NIL == failP )
      {
        foundP = v_super;
      }
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 20358L)
  public static SubLObject nearest_common_super_ks_for_ls_list(final SubLObject ls_list)
  {
    final SubLObject ant_ks_list = Mapping.mapcar( $sym61$LOGICAL_SCHEMA_SOURCES, ls_list );
    if( NIL == list_utilities.every_in_list( $sym62$SINGLETON_, ant_ks_list, UNPROVIDED ) )
    {
      return NIL;
    }
    return nearest_common_super_ks( list_utilities.flatten( ant_ks_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 20748L)
  public static SubLObject schema_representation_completeP(final SubLObject schema)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value( schema, $const63$schemaRepresentationComplete, ONE_INTEGER, ONE_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21003L)
  public static SubLObject isa_physical_schemaP_internal(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const65$PhysicalSchema );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21003L)
  public static SubLObject isa_physical_schemaP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return isa_physical_schemaP_internal( v_object );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym64$ISA_PHYSICAL_SCHEMA_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym64$ISA_PHYSICAL_SCHEMA_, ONE_INTEGER, $int66$50, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym64$ISA_PHYSICAL_SCHEMA_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( isa_physical_schemaP_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21257L)
  public static SubLObject physical_schema_sk_sources(final SubLObject physical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( physical_schema, $const28$physicalSchemaSourceMap, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( assertions_high.gaf_arg2( gaf ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21544L)
  public static SubLObject physical_schema_sk_sources_memoized_internal(final SubLObject physical_schema)
  {
    return physical_schema_sk_sources( physical_schema );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21544L)
  public static SubLObject physical_schema_sk_sources_memoized(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_sk_sources_memoized_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_sk_sources_memoized_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21704L)
  public static SubLObject physical_schema_fields_internal(final SubLObject physical_schema)
  {
    return kb_mapping_utilities.pred_values( physical_schema, $const69$physicalFields, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21704L)
  public static SubLObject physical_schema_fields(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_fields_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym68$PHYSICAL_SCHEMA_FIELDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym68$PHYSICAL_SCHEMA_FIELDS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym68$PHYSICAL_SCHEMA_FIELDS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_fields_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21863L)
  public static SubLObject physical_schema_primary_key_internal(final SubLObject physical_schema)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf( physical_schema, $const71$primaryKey, ONE_INTEGER, $kw1$TRUE );
    SubLObject el_key_list = NIL;
    if( NIL != assertions_high.gaf_assertionP( gaf ) )
    {
      el_key_list = assertions_high.gaf_arg2( gaf );
      if( NIL != el_utilities.el_list_p( el_key_list ) )
      {
        return evaluation_defns.el_list_to_subl_list( el_key_list );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 21863L)
  public static SubLObject physical_schema_primary_key(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_primary_key_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_primary_key_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22284L)
  public static SubLObject physical_schema_primary_key_compensate_for_table_column_representation_internal(final SubLObject physical_schema)
  {
    final SubLObject pk_list = physical_schema_primary_key( physical_schema );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = pk_list;
    SubLObject pk_elem = NIL;
    pk_elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject field_name = physical_field_name( pk_elem );
      final SubLObject better_pf = physical_field_for_schema_and_name( physical_schema, field_name );
      result = ConsesLow.cons( ( NIL != better_pf ) ? better_pf : pk_elem, result );
      cdolist_list_var = cdolist_list_var.rest();
      pk_elem = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22284L)
  public static SubLObject physical_schema_primary_key_compensate_for_table_column_representation(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_primary_key_compensate_for_table_column_representation_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT, ONE_INTEGER, NIL,
          EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_primary_key_compensate_for_table_column_representation_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22752L)
  public static SubLObject physical_schema_primary_key_p(final SubLObject physical_schema, final SubLObject physical_fields)
  {
    return makeBoolean( NIL != physical_fields && physical_fields.equal( physical_schema_primary_key( physical_schema ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 22943L)
  public static SubLObject physical_schema_forbidden_comparison_operators(final SubLObject physical_schema)
  {
    return kb_mapping_utilities.pred_values( physical_schema, $const73$suppressConvertingComparisonLiter, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23120L)
  public static SubLObject physical_schema_forbidden_comparison_operator_p(final SubLObject physical_schema, final SubLObject operator)
  {
    return list_utilities.member_eqP( operator, physical_schema_forbidden_comparison_operators( physical_schema ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23310L)
  public static SubLObject physical_schema_foreign_keys(final SubLObject physical_schema)
  {
    return physical_schema_foreign_keys_int( physical_schema, $const74$foreignKeyMap );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23580L)
  public static SubLObject physical_schema_foreign_keys_restrict(final SubLObject physical_schema)
  {
    return physical_schema_foreign_keys_int( physical_schema, $const75$foreignKeyMap_Restrict );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23768L)
  public static SubLObject physical_schema_foreign_keys_cascade(final SubLObject physical_schema)
  {
    return physical_schema_foreign_keys_int( physical_schema, $const76$foreignKeyMap_Cascade );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 23953L)
  public static SubLObject physical_schema_foreign_keys_set_null(final SubLObject physical_schema)
  {
    return physical_schema_foreign_keys_int( physical_schema, $const77$foreignKeyMap_SetNull );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 24139L)
  public static SubLObject physical_schema_foreign_keys_set_default(final SubLObject physical_schema)
  {
    return physical_schema_foreign_keys_int( physical_schema, $const78$foreignKeyMap_SetDefault );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 24334L)
  public static SubLObject physical_schema_foreign_keys_int(final SubLObject physical_schema, final SubLObject pred)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( physical_schema, pred, THREE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject foreign_key_list = evaluation_defns.el_list_to_subl_list( assertions_high.gaf_arg4( gaf ) );
      final SubLObject referenced_physical_schema = assertions_high.gaf_arg1( gaf );
      final SubLObject referenced_field_list = evaluation_defns.el_list_to_subl_list( assertions_high.gaf_arg2( gaf ) );
      result = ConsesLow.cons( ConsesLow.list( foreign_key_list, referenced_physical_schema, referenced_field_list ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 24916L)
  public static SubLObject physical_schema_unique_fields_tuples(final SubLObject physical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( physical_schema, $const79$uniqueFieldList, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject unique_fields_list = evaluation_defns.el_list_to_subl_list( assertions_high.gaf_arg2( gaf ) );
      result = ConsesLow.cons( unique_fields_list, result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 25375L)
  public static SubLObject physical_schema_required_fields(final SubLObject physical_schema)
  {
    return kb_mapping_utilities.pred_values( physical_schema, $const80$requiredFields, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 25511L)
  public static SubLObject physical_schemata_required_fields(final SubLObject physical_schemata)
  {
    SubLObject required_fields = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject ps_required_fields = physical_schema_required_fields( physical_schema );
      required_fields = ConsesLow.append( required_fields, ps_required_fields );
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return required_fields;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 25844L)
  public static SubLObject physical_schema_required_field_names(final SubLObject physical_schema)
  {
    final SubLObject required_fields = physical_schema_required_fields( physical_schema );
    return Mapping.mapcar( $sym81$PHYSICAL_FIELD_NAME, required_fields );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 26054L)
  public static SubLObject physical_schema_indexed_fields(final SubLObject physical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( physical_schema, $const82$indexedFields, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( el_utilities.el_list_items( assertions_high.gaf_arg2( gaf ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 26352L)
  public static SubLObject sksi_determine_singly_indexed_schema_indexed_field(final SubLObject physical_schema)
  {
    return physical_field_name( physical_schema_indexed_fields( physical_schema ).first().first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 26871L)
  public static SubLObject physical_field_indexedP(final SubLObject physical_field, final SubLObject physical_schema)
  {
    final SubLObject gaf = kb_indexing.find_gaf_in_relevant_mt( ConsesLow.list( $const82$indexedFields, physical_schema, physical_field ) );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27101L)
  public static SubLObject physical_schema_enumerableP_internal(final SubLObject physical_schema)
  {
    final SubLObject gaf = enumerable_schema_gaf( physical_schema );
    if( NIL != gaf )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27101L)
  public static SubLObject physical_schema_enumerableP(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_enumerableP_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym83$PHYSICAL_SCHEMA_ENUMERABLE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym83$PHYSICAL_SCHEMA_ENUMERABLE_, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym83$PHYSICAL_SCHEMA_ENUMERABLE_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_enumerableP_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27505L)
  public static SubLObject enumerable_schema_gaf(final SubLObject physical_schema)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf( physical_schema, $const84$enumerableSchema, ONE_INTEGER, $kw1$TRUE );
    return gaf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27657L)
  public static SubLObject physical_schema_result_set_cardinality_gafs_internal(final SubLObject physical_schema)
  {
    return kb_mapping_utilities.pred_value_gafs( physical_schema, $const86$resultSetCardinality, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27657L)
  public static SubLObject physical_schema_result_set_cardinality_gafs(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_result_set_cardinality_gafs_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_result_set_cardinality_gafs_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 27837L)
  public static SubLObject physical_schemata_result_set_cardinality_gafs(final SubLObject physical_schemata)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.append( result, physical_schema_result_set_cardinality_gafs( physical_schema ) );
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28137L)
  public static SubLObject physical_schema_result_set_cardinality_wXconstraints_gafs_internal(final SubLObject physical_schema)
  {
    return kb_mapping_utilities.pred_value_gafs( physical_schema, $const88$resultSetCardinalityWithConstrain, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28137L)
  public static SubLObject physical_schema_result_set_cardinality_wXconstraints_gafs(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_result_set_cardinality_wXconstraints_gafs_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS, ONE_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_result_set_cardinality_wXconstraints_gafs_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28346L)
  public static SubLObject physical_schemata_result_set_cardinality_wXconstraints_gafs(final SubLObject physical_schemata)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.append( result, physical_schema_result_set_cardinality_wXconstraints_gafs( physical_schema ) );
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28674L)
  public static SubLObject result_set_cardinality_gaf_unbound_fields_set(final SubLObject rs_cardinality_gaf)
  {
    return assertions_high.gaf_arg2( rs_cardinality_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28799L)
  public static SubLObject result_set_cardinality_gaf_bound_fields_set(final SubLObject rs_cardinality_gaf)
  {
    return assertions_high.gaf_arg3( rs_cardinality_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 28922L)
  public static SubLObject result_set_cardinality_gaf_constraints(final SubLObject rs_cardinality_gaf)
  {
    return ( NIL != kb_utilities.kbeq( assertions_high.gaf_predicate( rs_cardinality_gaf ), $const88$resultSetCardinalityWithConstrain ) ) ? assertions_high.gaf_arg4( rs_cardinality_gaf ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29131L)
  public static SubLObject result_set_cardinality_gaf_cost_expression(final SubLObject rs_cardinality_gaf)
  {
    return ( NIL != kb_utilities.kbeq( assertions_high.gaf_predicate( rs_cardinality_gaf ), $const86$resultSetCardinality ) ) ? assertions_high.gaf_arg4( rs_cardinality_gaf )
        : assertions_high.gaf_arg5( rs_cardinality_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29410L)
  public static SubLObject physical_schema_logical_schema_gafs(final SubLObject physical_schema)
  {
    return kb_mapping_utilities.pred_value_gafs( physical_schema, $const89$logicalPhysicalSchemaMap, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29562L)
  public static SubLObject physical_schema_logical_schemata(final SubLObject physical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = physical_schema_logical_schema_gafs( physical_schema );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( assertions_high.gaf_arg1( gaf ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 29841L)
  public static SubLObject physical_schema_example_tuple(final SubLObject physical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( physical_schema, $const90$exampleTuple, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( assertions_high.gaf_arg2( gaf ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 30118L)
  public static SubLObject physical_schema_field_encodings(final SubLObject physical_schema)
  {
    SubLObject triples = NIL;
    final SubLObject pred_var = $const91$fieldEncoding;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( physical_schema, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( physical_schema, ONE_INTEGER, pred_var );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw1$TRUE, NIL );
            SubLObject done_var_$16 = NIL;
            final SubLObject token_var_$17 = NIL;
            while ( NIL == done_var_$16)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$17 );
              final SubLObject valid_$18 = makeBoolean( !token_var_$17.eql( ass ) );
              if( NIL != valid_$18 )
              {
                sksi_hl_support_utilities.note_sksi_support( ass );
                final SubLObject physical_field_indexical = assertions_high.gaf_arg2( ass );
                final SubLObject logical_schema = assertions_high.gaf_arg3( ass );
                final SubLObject logical_recipe = assertions_high.gaf_arg4( ass );
                final SubLObject triple = ConsesLow.list( physical_field_indexical, logical_schema, logical_recipe );
                triples = ConsesLow.cons( triple, triples );
              }
              done_var_$16 = makeBoolean( NIL == valid_$18 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 30756L)
  public static SubLObject physical_schema_ordered_field_list_internal(final SubLObject physical_schema)
  {
    final SubLObject schema_field_name_list = physical_schema_field_name_list( physical_schema );
    SubLObject schema_field_list = NIL;
    SubLObject cdolist_list_var = schema_field_name_list;
    SubLObject field_name = NIL;
    field_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      schema_field_list = ConsesLow.cons( physical_field_for_schema_and_name( physical_schema, field_name ), schema_field_list );
      cdolist_list_var = cdolist_list_var.rest();
      field_name = cdolist_list_var.first();
    }
    return Sequences.nreverse( schema_field_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 30756L)
  public static SubLObject physical_schema_ordered_field_list(final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_ordered_field_list_internal( physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_ordered_field_list_internal( physical_schema ) ) );
      memoization_state.caching_state_put( caching_state, physical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 31366L)
  public static SubLObject physical_schema_field_name_list(final SubLObject physical_schema)
  {
    return conses_high.copy_list( cycl_utilities.formula_args( kb_mapping_utilities.fpred_value( physical_schema, $const93$schemaFieldNameList, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 31533L)
  public static SubLObject logical_schemata_physical_schemata(final SubLObject logical_schemata)
  {
    return list_utilities.fast_delete_duplicates( Mapping.mapcan( $sym94$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, logical_schemata, EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 31805L)
  public static SubLObject logical_schema_physical_schemata(final SubLObject logical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( logical_schema, $const89$logicalPhysicalSchemaMap, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( assertions_high.gaf_arg2( gaf ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32098L)
  public static SubLObject logical_schema_fields_internal(final SubLObject logical_schema)
  {
    return kb_mapping_utilities.pred_values( logical_schema, $const96$logicalFields, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32098L)
  public static SubLObject logical_schema_fields(final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_schema_fields_internal( logical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym95$LOGICAL_SCHEMA_FIELDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym95$LOGICAL_SCHEMA_FIELDS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym95$LOGICAL_SCHEMA_FIELDS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_schema_fields_internal( logical_schema ) ) );
      memoization_state.caching_state_put( caching_state, logical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32254L)
  public static SubLObject logical_schema_field_indexicals_internal(final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject node_var = $const98$logicalFieldIndexicals;
    final SubLObject deck_type = $kw101$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym102$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw103$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str104$_A_is_not_a__A, tv_var, $sym105$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw106$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str107$continue_anyway, $str104$_A_is_not_a__A, tv_var, $sym105$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw108$WARN ) )
            {
              Errors.warn( $str104$_A_is_not_a__A, tv_var, $sym105$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str109$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str107$continue_anyway, $str104$_A_is_not_a__A, tv_var, $sym105$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const110$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const110$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const110$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const110$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const98$logicalFieldIndexicals, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$22 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const110$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( $const98$logicalFieldIndexicals, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(
                    recur_deck ) )
                {
                  final SubLObject node_var_$25 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec_pred = node_var_$25;
                  final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$25 ) )
                    {
                      final SubLObject partial_result = kb_mapping_utilities.pred_values( logical_schema, spec_pred, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
                      result = ConsesLow.append( partial_result, result );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const110$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$25 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$30;
                                    for( iteration_state_$30 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$30 ); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next( iteration_state_$30 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$30 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str111$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$25, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$30 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$24, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str112$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$32;
                          final SubLObject new_list = cdolist_list_var_$32 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$32.first();
                          while ( NIL != cdolist_list_var_$32)
                          {
                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str111$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$26, thread );
                            }
                            cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                            generating_fn = cdolist_list_var_$32.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$23, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$23, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$22, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$24, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$22, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$21, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str113$Node__a_does_not_pass_sbhl_type_t, $const98$logicalFieldIndexicals, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                  UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$21, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$20, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$19, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32254L)
  public static SubLObject logical_schema_field_indexicals(final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_schema_field_indexicals_internal( logical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_schema_field_indexicals_internal( logical_schema ) ) );
      memoization_state.caching_state_put( caching_state, logical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32615L)
  public static SubLObject logical_schema_example_sentences(final SubLObject logical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( logical_schema, $const114$schemaExampleSentence, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( assertions_high.gaf_arg2( gaf ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 32902L)
  public static SubLObject logical_schema_keys(final SubLObject logical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( logical_schema, $const115$logicalSchemaKeys, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( el_utilities.el_extensional_set_elements( assertions_high.gaf_arg2( gaf ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33204L)
  public static SubLObject logical_schema_result_set_cardinality_gafs_internal(final SubLObject logical_schema)
  {
    return kb_mapping_utilities.pred_value_gafs( logical_schema, $const117$logicalResultSetCardinality, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33204L)
  public static SubLObject logical_schema_result_set_cardinality_gafs(final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_schema_result_set_cardinality_gafs_internal( logical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_schema_result_set_cardinality_gafs_internal( logical_schema ) ) );
      memoization_state.caching_state_put( caching_state, logical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33431L)
  public static SubLObject logical_schemata_result_set_cardinality_gafs(final SubLObject logical_schemata)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = logical_schemata;
    SubLObject logical_schema = NIL;
    logical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.append( result, logical_schema_result_set_cardinality_gafs( logical_schema ) );
      cdolist_list_var = cdolist_list_var.rest();
      logical_schema = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33725L)
  public static SubLObject logical_result_set_cardinality_gaf_unbound_fields_set(final SubLObject lrs_cardinality_gaf)
  {
    return assertions_high.gaf_arg2( lrs_cardinality_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33860L)
  public static SubLObject logical_result_set_cardinality_gaf_bound_fields_set(final SubLObject lrs_cardinality_gaf)
  {
    return assertions_high.gaf_arg3( lrs_cardinality_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 33993L)
  public static SubLObject logical_result_set_cardinality_gaf_cost_expression(final SubLObject lrs_cardinality_gaf)
  {
    return assertions_high.gaf_arg4( lrs_cardinality_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34125L)
  public static SubLObject logical_schema_result_set_cardinality_wrt_value_gafs_internal(final SubLObject logical_schema)
  {
    return kb_mapping_utilities.pred_value_gafs( logical_schema, $const119$logicalResultSetCardinalityWRTVal, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34125L)
  public static SubLObject logical_schema_result_set_cardinality_wrt_value_gafs(final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_schema_result_set_cardinality_wrt_value_gafs_internal( logical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS, ONE_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_schema_result_set_cardinality_wrt_value_gafs_internal( logical_schema ) ) );
      memoization_state.caching_state_put( caching_state, logical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34378L)
  public static SubLObject logical_schemata_result_set_cardinality_wrt_value_gafs(final SubLObject logical_schemata)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = logical_schemata;
    SubLObject logical_schema = NIL;
    logical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.append( result, logical_schema_result_set_cardinality_wrt_value_gafs( logical_schema ) );
      cdolist_list_var = cdolist_list_var.rest();
      logical_schema = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34692L)
  public static SubLObject logical_result_set_cardinality_wrt_value_gaf_unbound_fields_set(final SubLObject lrs_cardinality_wrt_value_gaf)
  {
    return assertions_high.gaf_arg2( lrs_cardinality_wrt_value_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 34857L)
  public static SubLObject logical_result_set_cardinality_wrt_value_gaf_bound_fields_set(final SubLObject lrs_cardinality_wrt_value_gaf)
  {
    return assertions_high.gaf_arg3( lrs_cardinality_wrt_value_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35020L)
  public static SubLObject logical_result_set_cardinality_wrt_value_gaf_cost_expression(final SubLObject lrs_cardinality_wrt_value_gaf)
  {
    return assertions_high.gaf_arg4( lrs_cardinality_wrt_value_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35182L)
  public static SubLObject logical_result_set_cardinality_wrt_value_gaf_value(final SubLObject lrs_cardinality_wrt_value_gaf)
  {
    return assertions_high.gaf_arg5( lrs_cardinality_wrt_value_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35334L)
  public static SubLObject logical_schema_field_decodings(final SubLObject logical_schema)
  {
    SubLObject triples = NIL;
    final SubLObject pred_var = $const120$fieldDecoding;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_schema, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_schema, ONE_INTEGER, pred_var );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw1$TRUE, NIL );
            SubLObject done_var_$35 = NIL;
            final SubLObject token_var_$36 = NIL;
            while ( NIL == done_var_$35)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$36 );
              final SubLObject valid_$37 = makeBoolean( !token_var_$36.eql( ass ) );
              if( NIL != valid_$37 )
              {
                sksi_hl_support_utilities.note_sksi_support( ass );
                final SubLObject logical_field = assertions_high.gaf_arg2( ass );
                final SubLObject physical_schema = assertions_high.gaf_arg3( ass );
                final SubLObject physical_recipe = assertions_high.gaf_arg4( ass );
                final SubLObject triple = ConsesLow.list( logical_field, physical_schema, physical_recipe );
                triples = ConsesLow.cons( triple, triples );
              }
              done_var_$35 = makeBoolean( NIL == valid_$37 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 35943L)
  public static SubLObject logical_schema_source_gafs(final SubLObject logical_schema, SubLObject sks)
  {
    if( sks == UNPROVIDED )
    {
      sks = NIL;
    }
    return ( NIL != sks ) ? kb_mapping_utilities.pred_u_v_holds_gafs( $const121$logicalSchemaSourceMap, logical_schema, sks, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE )
        : kb_mapping_utilities.pred_value_gafs( logical_schema, $const121$logicalSchemaSourceMap, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36192L)
  public static SubLObject logical_schema_sources(final SubLObject logical_schema)
  {
    return kb_mapping_utilities.pred_values( logical_schema, $const121$logicalSchemaSourceMap, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36324L)
  public static SubLObject logical_schema_sk_sources_memoized_internal(final SubLObject logical_schema)
  {
    return logical_schema_sources( logical_schema );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36324L)
  public static SubLObject logical_schema_sk_sources_memoized(final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_schema_sk_sources_memoized_internal( logical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, logical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_schema_sk_sources_memoized_internal( logical_schema ) ) );
      memoization_state.caching_state_put( caching_state, logical_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36477L)
  public static SubLObject logical_schemata_sources(final SubLObject logical_schemata)
  {
    return list_utilities.fast_delete_duplicates( Mapping.mapcan( $sym61$LOGICAL_SCHEMA_SOURCES, logical_schemata, EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36625L)
  public static SubLObject logical_schema_sourceP(final SubLObject logical_schema, final SubLObject sk_source)
  {
    SubLObject sourceP = NIL;
    final SubLObject pred_var = $const121$logicalSchemaSourceMap;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_schema, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_schema, ONE_INTEGER, pred_var );
      SubLObject done_var = sourceP;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw1$TRUE, NIL );
            SubLObject done_var_$38 = sourceP;
            final SubLObject token_var_$39 = NIL;
            while ( NIL == done_var_$38)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$39 );
              final SubLObject valid_$40 = makeBoolean( !token_var_$39.eql( gaf ) );
              if( NIL != valid_$40 )
              {
                sourceP = kb_utilities.kbeq( sk_source, assertions_high.gaf_arg2( gaf ) );
              }
              done_var_$38 = makeBoolean( NIL == valid_$40 || NIL != sourceP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != sourceP );
      }
    }
    return sourceP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 36900L)
  public static SubLObject logical_schema_complete_extent_knownP(final SubLObject logical_schema)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf( logical_schema, $const123$schemaCompleteExtentKnown, ONE_INTEGER, $kw1$TRUE );
    if( NIL != gaf )
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37121L)
  public static SubLObject logical_schema_complete_extent_known_for_predicateP(final SubLObject logical_schema, final SubLObject predicate, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQ );
    }
    SubLObject completeP = NIL;
    final SubLObject pred_var = $const123$schemaCompleteExtentKnown;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_schema, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_schema, ONE_INTEGER, pred_var );
      SubLObject done_var = completeP;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw1$TRUE, NIL );
            SubLObject done_var_$41 = completeP;
            final SubLObject token_var_$42 = NIL;
            while ( NIL == done_var_$41)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$42 );
              final SubLObject valid_$43 = makeBoolean( !token_var_$42.eql( gaf ) );
              if( NIL != valid_$43 )
              {
                completeP = Functions.funcall( test, predicate, assertions_high.gaf_arg2( gaf ) );
              }
              done_var_$41 = makeBoolean( NIL == valid_$43 || NIL != completeP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != completeP );
      }
    }
    return completeP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37465L)
  public static SubLObject logical_schema_content_sentences(final SubLObject logical_schema)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( logical_schema, $const124$contentSentenceOfSchema, ONE_INTEGER, $kw1$TRUE );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_hl_support_utilities.note_sksi_support( gaf );
      result = ConsesLow.cons( assertions_high.gaf_arg2( gaf ), result );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37754L)
  public static SubLObject logical_field_p(final SubLObject v_object)
  {
    return ( NIL != forts.fort_p( v_object ) ) ? logical_field_p_memoized( v_object ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37976L)
  public static SubLObject logical_field_p_memoized_internal(final SubLObject fort)
  {
    return makeBoolean( ( NIL != nart_handles.nart_p( fort ) && NIL != kb_utilities.kbeq( $const126$LogicalFieldFn, cycl_utilities.nat_functor( fort ) ) ) || NIL != isa.isaP( fort, $const127$LogicalField, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 37976L)
  public static SubLObject logical_field_p_memoized(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_field_p_memoized_internal( fort );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym125$LOGICAL_FIELD_P_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym125$LOGICAL_FIELD_P_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym125$LOGICAL_FIELD_P_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_field_p_memoized_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38173L)
  public static SubLObject lf_alias_fn_naut_p(final SubLObject v_object)
  {
    return ( NIL != term.nautP( v_object, UNPROVIDED ) ) ? kb_utilities.kbeq( cycl_utilities.formula_operator( v_object ), $const128$LFAliasFn ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38301L)
  public static SubLObject lf_alias_fn_naut_lf(final SubLObject lf_alias_naut)
  {
    return cycl_utilities.formula_arg2( lf_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38394L)
  public static SubLObject lf_alias_fn_naut_index(final SubLObject lf_alias_naut)
  {
    return cycl_utilities.formula_arg1( lf_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38490L)
  public static SubLObject lf_fort_for_lf(final SubLObject lf)
  {
    if( NIL != forts.fort_p( lf ) )
    {
      return lf;
    }
    if( NIL != lf_alias_fn_naut_p( lf ) )
    {
      return lf_alias_fn_naut_lf( lf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38628L)
  public static SubLObject lf_alias_naut_for_lf_and_alias_index(final SubLObject lf_fort, final SubLObject alias_index)
  {
    return el_utilities.make_binary_formula( $const128$LFAliasFn, alias_index, lf_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38769L)
  public static SubLObject logical_field_indexical_p(final SubLObject v_object)
  {
    return ( NIL != forts.fort_p( v_object ) ) ? logical_field_indexical_fort_p( v_object ) : lfi_alias_fn_naut_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38983L)
  public static SubLObject logical_field_indexical_p_memoized_internal(final SubLObject fort)
  {
    return makeBoolean( ( NIL != nart_handles.nart_p( fort ) && NIL != kb_utilities.kbeq( $const130$TheLogicalFieldValueFn, cycl_utilities.nat_functor( fort ) ) ) || NIL != sksi_infrastructure_utilities
        .non_thelogicalfieldvaluefn_lfi_fort_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 38983L)
  public static SubLObject logical_field_indexical_p_memoized(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_field_indexical_p_memoized_internal( fort );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_field_indexical_p_memoized_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39222L)
  public static SubLObject logical_field_indexical_fort_p(final SubLObject fort)
  {
    return makeBoolean( ( NIL != nart_handles.nart_p( fort ) && NIL != kb_utilities.kbeq( $const130$TheLogicalFieldValueFn, cycl_utilities.nat_functor( fort ) ) ) || NIL != sksi_infrastructure_utilities
        .non_thelogicalfieldvaluefn_lfi_fort_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39426L)
  public static SubLObject lfi_alias_fn_naut_p(final SubLObject v_object)
  {
    return ( NIL != el_utilities.possibly_naut_p( v_object ) ) ? kb_utilities.kbeq( cycl_utilities.formula_operator( v_object ), $const131$LFIAliasFn ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39564L)
  public static SubLObject lfi_alias_fn_naut_lfi(final SubLObject lfi_alias_naut)
  {
    return cycl_utilities.formula_arg2( lfi_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39661L)
  public static SubLObject lfi_alias_fn_naut_index(final SubLObject lfi_alias_naut)
  {
    return cycl_utilities.formula_arg1( lfi_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39760L)
  public static SubLObject lfi_alias_naut_for_lfi_and_alias_index(final SubLObject lfi_fort, final SubLObject alias_index)
  {
    return el_utilities.make_binary_formula( $const131$LFIAliasFn, alias_index, lfi_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 39907L)
  public static SubLObject lfi_fort_for_lfi(final SubLObject lfi)
  {
    if( NIL != forts.fort_p( lfi ) )
    {
      return lfi;
    }
    if( NIL != lfi_alias_fn_naut_p( lfi ) )
    {
      return lfi_alias_fn_naut_lfi( lfi );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40056L)
  public static SubLObject lfi_index_for_lfi(final SubLObject lfi, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return ( NIL != lfi_alias_fn_naut_p( lfi ) ) ? lfi_alias_fn_naut_index( lfi ) : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40206L)
  public static SubLObject pfi_for_lfi(final SubLObject pfi, final SubLObject lfi)
  {
    if( NIL != forts.fort_p( lfi ) )
    {
      return pfi;
    }
    if( NIL != lfi_alias_fn_naut_p( lfi ) )
    {
      return pfi_alias_naut_for_pfi_and_alias_index( pfi, lfi_alias_fn_naut_index( lfi ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40400L)
  public static SubLObject lfi_for_pfi(final SubLObject lfi, final SubLObject pfi)
  {
    if( NIL != forts.fort_p( pfi ) )
    {
      return lfi;
    }
    if( NIL != pfi_alias_fn_naut_p( pfi ) )
    {
      return lfi_alias_naut_for_lfi_and_alias_index( lfi, pfi_alias_fn_naut_index( pfi ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40594L)
  public static SubLObject pf_for_lfi(final SubLObject pf, final SubLObject lfi)
  {
    if( NIL != forts.fort_p( lfi ) )
    {
      return pf;
    }
    if( NIL != lfi_alias_fn_naut_p( lfi ) )
    {
      return pf_alias_naut_for_pf_and_alias_index( pf, lfi_alias_fn_naut_index( lfi ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 40783L)
  public static SubLObject logical_field_indexical_for_schemaP(final SubLObject lfi, final SubLObject ls)
  {
    if( NIL != forts.fort_p( lfi ) )
    {
      return logical_field_indexical_fort_for_schema( lfi, ls );
    }
    if( NIL != lfi_alias_fn_naut_p( lfi ) )
    {
      return logical_field_indexical_fort_for_schema( lfi_alias_fn_naut_lfi( lfi ), ls );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41043L)
  public static SubLObject logical_field_indexical_fort_for_schema_internal(final SubLObject lfi, final SubLObject ls)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_u_v_holds_gaf( $const98$logicalFieldIndexicals, ls, lfi, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41043L)
  public static SubLObject logical_field_indexical_fort_for_schema(final SubLObject lfi, final SubLObject ls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_field_indexical_fort_for_schema_internal( lfi, ls );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( lfi, ls );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( lfi.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ls.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_field_indexical_fort_for_schema_internal( lfi, ls ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( lfi, ls ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41225L)
  public static SubLObject logical_field_for_schemaP(final SubLObject lf, final SubLObject ls)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_u_v_holds_gaf( $const96$logicalFields, ls, lf, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41356L)
  public static SubLObject virtual_logical_field_indexical_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != logical_field_indexical_p( v_object ) && NIL != logical_field_indexical_virtualP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41518L)
  public static SubLObject logical_field_indexical_virtualP(final SubLObject logical_field_indexical)
  {
    final SubLObject lf = logical_field_for_indexical( logical_field_indexical );
    final SubLObject pf_list = sksi_get_mapped_physical_fields_for_logical_field( lf );
    SubLObject virtualP = NIL;
    if( NIL == virtualP )
    {
      SubLObject csome_list_var = pf_list;
      SubLObject pf = NIL;
      pf = csome_list_var.first();
      while ( NIL == virtualP && NIL != csome_list_var)
      {
        if( NIL != physical_field_virtualP( pf ) )
        {
          virtualP = T;
        }
        csome_list_var = csome_list_var.rest();
        pf = csome_list_var.first();
      }
    }
    return virtualP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41867L)
  public static SubLObject isa_logical_schemaP_internal(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const134$LogicalSchema );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 41867L)
  public static SubLObject isa_logical_schemaP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return isa_logical_schemaP_internal( v_object );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym133$ISA_LOGICAL_SCHEMA_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym133$ISA_LOGICAL_SCHEMA_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym133$ISA_LOGICAL_SCHEMA_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( isa_logical_schemaP_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42128L)
  public static SubLObject isa_reified_mappingP(final SubLObject schema)
  {
    return makeBoolean( NIL != forts.fort_p( schema ) && NIL != is_fort_a_reified_mappingP( schema ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42251L)
  public static SubLObject is_fort_a_reified_mappingP_internal(final SubLObject fort)
  {
    return isa.isa_in_any_mtP( fort, $const136$ReifiedMapping );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42251L)
  public static SubLObject is_fort_a_reified_mappingP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return is_fort_a_reified_mappingP_internal( fort );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym135$IS_FORT_A_REIFIED_MAPPING_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym135$IS_FORT_A_REIFIED_MAPPING_, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym135$IS_FORT_A_REIFIED_MAPPING_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( is_fort_a_reified_mappingP_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42383L)
  public static SubLObject cycl_terms_mapped_to_by_code_mapping_schema_internal(final SubLObject code_mapping_schema)
  {
    return list_utilities.fast_delete_duplicates( kb_mapping_utilities.pred_values( code_mapping_schema, $const9$codeMapping, ONE_INTEGER, THREE_INTEGER, $kw1$TRUE ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42383L)
  public static SubLObject cycl_terms_mapped_to_by_code_mapping_schema(final SubLObject code_mapping_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cycl_terms_mapped_to_by_code_mapping_schema_internal( code_mapping_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, code_mapping_schema, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cycl_terms_mapped_to_by_code_mapping_schema_internal( code_mapping_schema ) ) );
      memoization_state.caching_state_put( caching_state, code_mapping_schema, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42593L)
  public static SubLObject cyc_terms_corresponding_to_code_mapping_schema_code(final SubLObject code_mapping_schema, final SubLObject code)
  {
    final SubLObject code_mapping_gafs = kb_mapping_utilities.pred_u_v_holds_gafs_in_any_mt( $const9$codeMapping, code_mapping_schema, code, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = code_mapping_gafs;
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_answer = ConsesLow.cons( assertions_high.gaf_arg3( gaf ), v_answer );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 42934L)
  public static SubLObject cyc_terms_for_sksi_external_term_naut(final SubLObject naut)
  {
    SubLObject cyc_terms = NIL;
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    if( NIL != subl_promotions.memberP( functor, $list138, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject schema = NIL;
      SubLObject code = NIL;
      if( NIL != kb_utilities.kbeq( functor, $const139$SchemaObjectFn ) )
      {
        schema = cycl_utilities.nat_arg1( naut, UNPROVIDED );
        code = cycl_utilities.nat_arg2( naut, UNPROVIDED );
      }
      else
      {
        schema = cycl_utilities.nat_arg2( naut, UNPROVIDED );
        code = cycl_utilities.nat_arg3( naut, UNPROVIDED );
      }
      cyc_terms = cyc_terms_corresponding_to_code_mapping_schema_code( schema, code );
    }
    return cyc_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43511L)
  public static SubLObject schema_isa_internal(final SubLObject code_mapping_schema, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return kb_mapping_utilities.pred_values( code_mapping_schema, $const141$schemaIsa, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43511L)
  public static SubLObject schema_isa(final SubLObject code_mapping_schema, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return schema_isa_internal( code_mapping_schema, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym140$SCHEMA_ISA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym140$SCHEMA_ISA, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym140$SCHEMA_ISA, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( code_mapping_schema, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( code_mapping_schema.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( schema_isa_internal( code_mapping_schema, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( code_mapping_schema, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43702L)
  public static SubLObject schema_object_field(final SubLObject object_defining_schema)
  {
    return kb_mapping_utilities.fpred_value( object_defining_schema, $const142$objectField, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 43836L)
  public static SubLObject schema_object_field_gaf(final SubLObject object_defining_schema, SubLObject object_field)
  {
    if( object_field == UNPROVIDED )
    {
      object_field = NIL;
    }
    return ( NIL != object_field ) ? kb_mapping_utilities.fpred_u_v_holds_gaf( $const142$objectField, object_defining_schema, object_field, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE )
        : kb_mapping_utilities.fpred_value_gaf( object_defining_schema, $const142$objectField, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44110L)
  public static SubLObject schema_object_id_fn_expression_p(final SubLObject expression)
  {
    return el_utilities.el_formula_with_operator_p( expression, $const143$SchemaObjectIDFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44295L)
  public static SubLObject schema_object_fn_expression_p(final SubLObject expression)
  {
    return el_utilities.el_formula_with_operator_p( expression, $const139$SchemaObjectFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44423L)
  public static SubLObject source_schema_object_id_fn_expression_p(final SubLObject expression)
  {
    return el_utilities.el_formula_with_operator_p( expression, $const144$SourceSchemaObjectIDFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44569L)
  public static SubLObject source_schema_object_fn_expression_p(final SubLObject expression)
  {
    return el_utilities.el_formula_with_operator_p( expression, $const145$SourceSchemaObjectFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44710L)
  public static SubLObject destructure_schema_object_fn_expression(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
      expression = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym147$CDESTRUCTURING_BIND, ConsesLow.list( ods, sub_expression ), ConsesLow.list( $sym148$FORMULA_ARGS, expression ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list146 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 44937L)
  public static SubLObject destructure_source_schema_object_fn_expression(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sks = NIL;
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
      expression = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym147$CDESTRUCTURING_BIND, ConsesLow.list( sks, ods, sub_expression ), ConsesLow.list( $sym148$FORMULA_ARGS, expression ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list149 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45180L)
  public static SubLObject physical_field_for_indexical(final SubLObject indexical)
  {
    if( NIL != forts.fort_p( indexical ) )
    {
      return physical_field_for_indexical_fort( indexical );
    }
    if( NIL != pfi_alias_fn_naut_p( indexical ) )
    {
      return physical_field_for_pfi_alias_fn_naut( indexical );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45636L)
  public static SubLObject physical_field_for_indexical_fort_internal(final SubLObject indexical)
  {
    return kb_mapping_utilities.fpred_value( indexical, $const151$indexicalForPhysicalField, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45636L)
  public static SubLObject physical_field_for_indexical_fort(final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_for_indexical_fort_internal( indexical );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_for_indexical_fort_internal( indexical ) ) );
      memoization_state.caching_state_put( caching_state, indexical, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45805L)
  public static SubLObject physical_field_for_pfi_alias_fn_naut(final SubLObject indexical)
  {
    return physical_field_for_indexical( pfi_alias_fn_naut_pfi( indexical ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45945L)
  public static SubLObject indexical_for_physical_field_internal(final SubLObject pf)
  {
    return kb_mapping_utilities.fpred_value( pf, $const151$indexicalForPhysicalField, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 45945L)
  public static SubLObject indexical_for_physical_field(final SubLObject pf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return indexical_for_physical_field_internal( pf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym152$INDEXICAL_FOR_PHYSICAL_FIELD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym152$INDEXICAL_FOR_PHYSICAL_FIELD, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym152$INDEXICAL_FOR_PHYSICAL_FIELD, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( indexical_for_physical_field_internal( pf ) ) );
      memoization_state.caching_state_put( caching_state, pf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46097L)
  public static SubLObject physical_fields_to_indexicals(final SubLObject physical_fields)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_fields;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject indexical = indexical_for_physical_field( pf );
      result = ConsesLow.cons( indexical, result );
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46339L)
  public static SubLObject indexicals_to_physical_fields(final SubLObject indexicals)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = indexicals;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject physical_field = physical_field_for_indexical( pf );
      result = ConsesLow.cons( physical_field, result );
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46580L)
  public static SubLObject not_null_physical_field_p(final SubLObject pf, final SubLObject ps)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_u_v_holds_gaf( $const153$nonNullFields, ps, pf, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46875L)
  public static SubLObject not_null_physical_fields_for_ps_internal(final SubLObject ps, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return list_utilities.fast_delete_duplicates( kb_mapping_utilities.pred_values( ps, $const153$nonNullFields, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 46875L)
  public static SubLObject not_null_physical_fields_for_ps(final SubLObject ps, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return not_null_physical_fields_for_ps_internal( ps, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( ps, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( ps.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( not_null_physical_fields_for_ps_internal( ps, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( ps, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47362L)
  public static SubLObject physical_field_default_value_internal(final SubLObject pf, final SubLObject ps, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf( $const157$defaultFieldValue, ps, pf, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
    if( NIL == assertions_high.gaf_assertionP( gaf ) )
    {
      return $sksi_default_field_value$.getGlobalValue();
    }
    final SubLObject value = assertions_high.gaf_arg3( gaf );
    if( NIL != kb_utilities.kbeq( value, $const158$ISNull ) )
    {
      return $kw155$NULL;
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47362L)
  public static SubLObject physical_field_default_value(final SubLObject pf, final SubLObject ps, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_default_value_internal( pf, ps, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym156$PHYSICAL_FIELD_DEFAULT_VALUE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym156$PHYSICAL_FIELD_DEFAULT_VALUE, THREE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym156$PHYSICAL_FIELD_DEFAULT_VALUE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pf, ps, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pf.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( ps.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_default_value_internal( pf, ps, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pf, ps, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47749L)
  public static SubLObject null_default_physical_field_valueP(final SubLObject pf, final SubLObject ps)
  {
    return Equality.eq( physical_field_default_value( pf, ps, UNPROVIDED ), $kw155$NULL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 47868L)
  public static SubLObject physical_field_for_schema_and_name(final SubLObject ps, final SubLObject pf_name)
  {
    return narts_high.find_nart( el_utilities.list_to_elf( ConsesLow.list( $const159$PhysicalFieldFn, ps, pf_name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48105L)
  public static SubLObject physical_field_schema_internal(final SubLObject physical_field)
  {
    if( NIL != forts.fort_p( physical_field ) )
    {
      return cycl_utilities.nat_arg1( physical_field, UNPROVIDED );
    }
    if( NIL != pf_alias_fn_naut_p( physical_field ) )
    {
      return physical_field_schema( pf_alias_fn_naut_pf( physical_field ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48105L)
  public static SubLObject physical_field_schema(final SubLObject physical_field)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_schema_internal( physical_field );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym160$PHYSICAL_FIELD_SCHEMA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym160$PHYSICAL_FIELD_SCHEMA, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym160$PHYSICAL_FIELD_SCHEMA, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_field, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_schema_internal( physical_field ) ) );
      memoization_state.caching_state_put( caching_state, physical_field, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48460L)
  public static SubLObject physical_field_name_internal(final SubLObject physical_field)
  {
    if( NIL != forts.fort_p( physical_field ) )
    {
      return cycl_utilities.nat_arg2( physical_field, UNPROVIDED );
    }
    if( NIL != pf_alias_fn_naut_p( physical_field ) )
    {
      return physical_field_name( pf_alias_fn_naut_pf( physical_field ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48460L)
  public static SubLObject physical_field_name(final SubLObject physical_field)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_name_internal( physical_field );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym81$PHYSICAL_FIELD_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym81$PHYSICAL_FIELD_NAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym81$PHYSICAL_FIELD_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_field, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_name_internal( physical_field ) ) );
      memoization_state.caching_state_put( caching_state, physical_field, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48810L)
  public static SubLObject physical_field_indexical_name(final SubLObject indexical)
  {
    return physical_field_name( physical_field_for_indexical( indexical ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48943L)
  public static SubLObject physical_field_sk_source_internal(final SubLObject pf)
  {
    return physical_schema_sk_sources_memoized( physical_field_schema( pf ) ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 48943L)
  public static SubLObject physical_field_sk_source(final SubLObject pf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_sk_source_internal( pf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym161$PHYSICAL_FIELD_SK_SOURCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym161$PHYSICAL_FIELD_SK_SOURCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym161$PHYSICAL_FIELD_SK_SOURCE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_sk_source_internal( pf ) ) );
      memoization_state.caching_state_put( caching_state, pf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49120L)
  public static SubLObject physical_field_sk_source_name_internal(final SubLObject pf)
  {
    final SubLObject table_name = sk_source_name( physical_field_sk_source( pf ) );
    if( NIL != pf_alias_fn_naut_p( pf ) )
    {
      return sksi_csql_generation.make_table_alias_name( table_name, pf_alias_fn_naut_index( pf ) );
    }
    return table_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49120L)
  public static SubLObject physical_field_sk_source_name(final SubLObject pf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_sk_source_name_internal( pf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_sk_source_name_internal( pf ) ) );
      memoization_state.caching_state_put( caching_state, pf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49406L)
  public static SubLObject physical_field_sk_source_namespace_internal(final SubLObject pf)
  {
    return sk_source_namespace( physical_field_sk_source( pf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49406L)
  public static SubLObject physical_field_sk_source_namespace(final SubLObject pf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_sk_source_namespace_internal( pf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_sk_source_namespace_internal( pf ) ) );
      memoization_state.caching_state_put( caching_state, pf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49562L)
  public static SubLObject physical_field_indexical_schema(final SubLObject indexical)
  {
    if( NIL != forts.fort_p( indexical ) )
    {
      return cycl_utilities.nat_arg1( indexical, UNPROVIDED );
    }
    if( NIL != pfi_alias_fn_naut_p( indexical ) )
    {
      return physical_field_indexical_schema( pfi_alias_fn_naut_pfi( indexical ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49974L)
  public static SubLObject physical_field_indexical_sk_source_internal(final SubLObject indexical)
  {
    return physical_schema_sk_sources_memoized( physical_field_indexical_schema( indexical ) ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 49974L)
  public static SubLObject physical_field_indexical_sk_source(final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_indexical_sk_source_internal( indexical );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_indexical_sk_source_internal( indexical ) ) );
      memoization_state.caching_state_put( caching_state, indexical, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50186L)
  public static SubLObject physical_field_indexical_sk_source_name_internal(final SubLObject indexical)
  {
    return sk_source_name( physical_field_indexical_sk_source( indexical ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50186L)
  public static SubLObject physical_field_indexical_sk_source_name(final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_indexical_sk_source_name_internal( indexical );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_indexical_sk_source_name_internal( indexical ) ) );
      memoization_state.caching_state_put( caching_state, indexical, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50366L)
  public static SubLObject physical_field_indexical_sk_source_namespace_internal(final SubLObject indexical)
  {
    return sk_source_namespace( physical_field_indexical_sk_source( indexical ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50366L)
  public static SubLObject physical_field_indexical_sk_source_namespace(final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_indexical_sk_source_namespace_internal( indexical );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_indexical_sk_source_namespace_internal( indexical ) ) );
      memoization_state.caching_state_put( caching_state, indexical, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50556L)
  public static SubLObject physical_field_p(final SubLObject v_object)
  {
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      return kb_utilities.kbeq( $const159$PhysicalFieldFn, cycl_utilities.nat_function( v_object ) );
    }
    if( NIL != narts_high.naut_p( v_object ) )
    {
      return pf_alias_fn_naut_p( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50800L)
  public static SubLObject virtual_physical_field_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != physical_field_p( v_object ) && NIL != physical_field_virtualP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50931L)
  public static SubLObject physical_field_virtualP_internal(final SubLObject physical_field)
  {
    if( NIL != nart_handles.nart_p( physical_field ) && NIL != kb_utilities.kbeq( $const168$VirtualPhysicalFieldFn, cycl_utilities.nat_functor( physical_field ) ) )
    {
      return T;
    }
    if( NIL != forts.fort_p( physical_field ) )
    {
      return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value( physical_field, $const169$virtualPhysicalFields, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE ) );
    }
    if( NIL != pf_alias_fn_naut_p( physical_field ) )
    {
      return physical_field_virtualP( pf_alias_fn_naut_pf( physical_field ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 50931L)
  public static SubLObject physical_field_virtualP(final SubLObject physical_field)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_virtualP_internal( physical_field );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym167$PHYSICAL_FIELD_VIRTUAL_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym167$PHYSICAL_FIELD_VIRTUAL_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym167$PHYSICAL_FIELD_VIRTUAL_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, physical_field, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_virtualP_internal( physical_field ) ) );
      memoization_state.caching_state_put( caching_state, physical_field, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51386L)
  public static SubLObject pf_alias_fn_naut_p(final SubLObject v_object)
  {
    if( NIL != narts_high.naut_p( v_object ) )
    {
      return kb_utilities.kbeq( cycl_utilities.formula_operator( v_object ), $const170$PFAliasFn );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51515L)
  public static SubLObject pf_alias_fn_naut_pf(final SubLObject pf_alias_naut)
  {
    return cycl_utilities.formula_arg2( pf_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51610L)
  public static SubLObject pf_alias_fn_naut_index(final SubLObject pf_alias_naut)
  {
    return cycl_utilities.formula_arg1( pf_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51706L)
  public static SubLObject pf_fort_for_pf(final SubLObject pf)
  {
    if( NIL != forts.fort_p( pf ) )
    {
      return pf;
    }
    if( NIL != pf_alias_fn_naut_p( pf ) )
    {
      return pf_alias_fn_naut_pf( pf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51844L)
  public static SubLObject pf_alias_naut_for_pf_and_alias_index(final SubLObject pf_fort, final SubLObject alias_index)
  {
    return el_utilities.make_binary_formula( $const170$PFAliasFn, alias_index, pf_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 51985L)
  public static SubLObject physical_field_indexical_p(final SubLObject v_object)
  {
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      return kb_utilities.kbeq( $const171$ThePhysicalFieldValueFn, cycl_utilities.nat_function( v_object ) );
    }
    if( NIL != pfi_alias_fn_naut_p( v_object ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52385L)
  public static SubLObject virtual_physical_field_indexical_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != physical_field_indexical_p( v_object ) && NIL != physical_field_indexical_virtualP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52547L)
  public static SubLObject physical_field_indexical_virtualP(final SubLObject physical_field_indexical)
  {
    final SubLObject physical_field = physical_field_for_indexical( physical_field_indexical );
    return makeBoolean( NIL == physical_field || NIL != physical_field_virtualP( physical_field ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52798L)
  public static SubLObject pfi_alias_fn_naut_p(final SubLObject v_object)
  {
    if( NIL != el_utilities.possibly_naut_p( v_object ) )
    {
      return kb_utilities.kbeq( cycl_utilities.formula_operator( v_object ), $const172$PFIAliasFn );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 52938L)
  public static SubLObject pfi_alias_fn_naut_pfi(final SubLObject pfi_alias_naut)
  {
    return cycl_utilities.formula_arg2( pfi_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53037L)
  public static SubLObject pfi_alias_fn_naut_index(final SubLObject pfi_alias_naut)
  {
    return cycl_utilities.formula_arg1( pfi_alias_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53136L)
  public static SubLObject pfi_alias_naut_for_pfi_and_alias_index(final SubLObject pfi_fort, final SubLObject alias_index)
  {
    return el_utilities.make_binary_formula( $const172$PFIAliasFn, alias_index, pfi_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53282L)
  public static SubLObject pfi_fort_for_pfi(final SubLObject pfi)
  {
    if( NIL != forts.fort_p( pfi ) )
    {
      return pfi;
    }
    if( NIL != pfi_alias_fn_naut_p( pfi ) )
    {
      return pfi_alias_fn_naut_pfi( pfi );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53430L)
  public static SubLObject pfi_index_for_pfi(final SubLObject pfi, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return ( NIL != pfi_alias_fn_naut_p( pfi ) ) ? pfi_alias_fn_naut_index( pfi ) : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53580L)
  public static SubLObject physical_schema_for_sks_name_internal(final SubLObject name)
  {
    final SubLObject ks = sk_source_by_sks_name( name, UNPROVIDED );
    return sk_source_physical_schemata( ks ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53580L)
  public static SubLObject physical_schema_for_sks_name(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_schema_for_sks_name_internal( name );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_schema_for_sks_name_internal( name ) ) );
      memoization_state.caching_state_put( caching_state, name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53780L)
  public static SubLObject physical_field_indexical_for_sks_and_field_names_internal(final SubLObject table_name, final SubLObject field_name, final SubLObject from_expression)
  {
    SubLObject physical_schema = physical_schema_for_sks_name( table_name );
    SubLObject alias_index = NIL;
    SubLObject pfi_el = NIL;
    SubLObject pfi_fort = NIL;
    if( NIL == physical_schema && NIL != from_expression )
    {
      final SubLObject physical_schema_name = conses_high.second( Sequences.find( table_name, from_expression, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym175$THIRD ), UNPROVIDED, UNPROVIDED ) );
      physical_schema = physical_schema_for_sks_name( physical_schema_name );
      alias_index = string_utilities.string_to_integer( string_utilities.pre_remove( table_name, physical_schema_name, UNPROVIDED ) );
    }
    pfi_el = el_utilities.make_binary_formula( $const171$ThePhysicalFieldValueFn, physical_schema, field_name );
    pfi_fort = narts_high.find_nart( pfi_el );
    if( NIL != alias_index )
    {
      return pfi_alias_naut_for_pfi_and_alias_index( pfi_fort, alias_index );
    }
    return pfi_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 53780L)
  public static SubLObject physical_field_indexical_for_sks_and_field_names(final SubLObject table_name, final SubLObject field_name, final SubLObject from_expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_indexical_for_sks_and_field_names_internal( table_name, field_name, from_expression );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES, THREE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( table_name, field_name, from_expression );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( table_name.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( field_name.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && from_expression.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_indexical_for_sks_and_field_names_internal( table_name, field_name, from_expression ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( table_name, field_name, from_expression ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54600L)
  public static SubLObject indexicals_for_physical_fields(final SubLObject pfs)
  {
    return Mapping.mapcar( $sym152$INDEXICAL_FOR_PHYSICAL_FIELD, pfs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54709L)
  public static SubLObject integer_sequence_generator_for_physical_field_internal(final SubLObject pf)
  {
    return kb_mapping_utilities.fpred_value( pf, $const177$integerSequenceGeneratorIncrement, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54709L)
  public static SubLObject integer_sequence_generator_for_physical_field(final SubLObject pf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return integer_sequence_generator_for_physical_field_internal( pf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( integer_sequence_generator_for_physical_field_internal( pf ) ) );
      memoization_state.caching_state_put( caching_state, pf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54890L)
  public static SubLObject integer_sequence_generator_name_internal(final SubLObject seq)
  {
    return kb_mapping_utilities.fpred_value( seq, $const179$integerSequenceGeneratorName, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 54890L)
  public static SubLObject integer_sequence_generator_name(final SubLObject seq)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return integer_sequence_generator_name_internal( seq );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym178$INTEGER_SEQUENCE_GENERATOR_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym178$INTEGER_SEQUENCE_GENERATOR_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym178$INTEGER_SEQUENCE_GENERATOR_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, seq, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( integer_sequence_generator_name_internal( seq ) ) );
      memoization_state.caching_state_put( caching_state, seq, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55048L)
  public static SubLObject integer_sequence_generator_name_for_physical_field(final SubLObject pf)
  {
    return integer_sequence_generator_name( integer_sequence_generator_for_physical_field( pf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55218L)
  public static SubLObject physical_field_value_is_auto_incrementedP_internal(final SubLObject pf, final SubLObject ps)
  {
    final SubLObject default_value = physical_field_default_value( pf, ps, UNPROVIDED );
    return el_utilities.el_formula_with_operator_p( default_value, $const181$TheNextSequenceValueFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55218L)
  public static SubLObject physical_field_value_is_auto_incrementedP(final SubLObject pf, final SubLObject ps)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_value_is_auto_incrementedP_internal( pf, ps );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pf, ps );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pf.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ps.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_value_is_auto_incrementedP_internal( pf, ps ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pf, ps ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 55594L)
  public static SubLObject logical_field_for_indexical(final SubLObject indexical)
  {
    SubLObject result = NIL;
    if( NIL != forts.fort_p( indexical ) )
    {
      result = logical_field_for_indexical_fort( indexical );
    }
    else if( NIL != lfi_alias_fn_naut_p( indexical ) )
    {
      result = logical_field_for_lfi_alias_fn_naut( indexical );
    }
    return ( NIL != result ) ? result : Errors.error( $str182$logical_field_indexical_without_c, indexical );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56051L)
  public static SubLObject logical_field_for_indexical_fort_internal(final SubLObject indexical)
  {
    return kb_mapping_utilities.fpred_value( indexical, $const184$indexicalForLogicalField, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56051L)
  public static SubLObject logical_field_for_indexical_fort(final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_field_for_indexical_fort_internal( indexical );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_field_for_indexical_fort_internal( indexical ) ) );
      memoization_state.caching_state_put( caching_state, indexical, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56216L)
  public static SubLObject logical_field_for_lfi_alias_fn_naut(final SubLObject indexical)
  {
    return logical_field_for_indexical( lfi_alias_fn_naut_lfi( indexical ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56354L)
  public static SubLObject lfi_for_lf(final SubLObject lf)
  {
    if( NIL != forts.fort_p( lf ) )
    {
      return indexical_for_logical_field( lf );
    }
    if( NIL != lf_alias_fn_naut_p( lf ) )
    {
      return lfi_alias_naut_for_lfi_and_alias_index( indexical_for_logical_field( lf_alias_fn_naut_lf( lf ) ), lf_alias_fn_naut_index( lf ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56619L)
  public static SubLObject indexical_for_logical_field_internal(final SubLObject lf)
  {
    return kb_mapping_utilities.fpred_value( lf, $const184$indexicalForLogicalField, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56619L)
  public static SubLObject indexical_for_logical_field(final SubLObject lf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return indexical_for_logical_field_internal( lf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym185$INDEXICAL_FOR_LOGICAL_FIELD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym185$INDEXICAL_FOR_LOGICAL_FIELD, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym185$INDEXICAL_FOR_LOGICAL_FIELD, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, lf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( indexical_for_logical_field_internal( lf ) ) );
      memoization_state.caching_state_put( caching_state, lf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56768L)
  public static SubLObject logical_fields_for_indexicals(final SubLObject indexicals)
  {
    return Mapping.mapcar( $sym186$LOGICAL_FIELD_FOR_INDEXICAL, indexicals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56889L)
  public static SubLObject indexicals_for_logical_fields(final SubLObject lfs)
  {
    return Mapping.mapcar( $sym185$INDEXICAL_FOR_LOGICAL_FIELD, lfs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 56995L)
  public static SubLObject logical_field_schema(final SubLObject logical_field)
  {
    return cycl_utilities.nat_arg1( logical_field, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57117L)
  public static SubLObject logical_field_indexical_schema(final SubLObject logical_field_indexical)
  {
    return cycl_utilities.nat_arg1( lfi_fort_for_lfi( logical_field_indexical ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57288L)
  public static SubLObject logical_field_indexical_sk_source_internal(final SubLObject indexical)
  {
    return logical_schema_sk_sources_memoized( logical_field_indexical_schema( indexical ) ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57288L)
  public static SubLObject logical_field_indexical_sk_source(final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_field_indexical_sk_source_internal( indexical );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_field_indexical_sk_source_internal( indexical ) ) );
      memoization_state.caching_state_put( caching_state, indexical, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57496L)
  public static SubLObject logical_field_joinable_fields(final SubLObject logical_field, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fields = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_use_sksiP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    try
    {
      gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
      gt_vars.$gt_use_sksiP$.bind( NIL, thread );
      pred_relevance_macros.$relevant_pred_function$.bind( $sym188$RELEVANT_PRED_IS_EQ, thread );
      fields = gt_methods.gt_all_accessible( $const189$joinable, logical_field, mt );
    }
    finally
    {
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_3, thread );
      gt_vars.$gt_use_sksiP$.rebind( _prev_bind_2, thread );
      gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return fields;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57835L)
  public static SubLObject logical_fields_joinableP_internal(final SubLObject lf1, final SubLObject lf2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject joinableP = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_use_sksiP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    try
    {
      gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
      gt_vars.$gt_use_sksiP$.bind( NIL, thread );
      pred_relevance_macros.$relevant_pred_function$.bind( $sym188$RELEVANT_PRED_IS_EQ, thread );
      joinableP = gt_methods.gt_booleanP( $const189$joinable, lf1, lf2, mt );
    }
    finally
    {
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_3, thread );
      gt_vars.$gt_use_sksiP$.rebind( _prev_bind_2, thread );
      gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return joinableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 57835L)
  public static SubLObject logical_fields_joinableP(final SubLObject lf1, final SubLObject lf2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_fields_joinableP_internal( lf1, lf2, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym190$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym190$LOGICAL_FIELDS_JOINABLE_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym190$LOGICAL_FIELDS_JOINABLE_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( lf1, lf2, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( lf1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( lf2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_fields_joinableP_internal( lf1, lf2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( lf1, lf2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 58147L)
  public static SubLObject extract_logical_fields(final SubLObject expression, final SubLObject all_logical_fields)
  {
    final SubLObject all_logical_field_indexicals = indexicals_for_logical_fields( all_logical_fields );
    final SubLObject relevant_logical_field_indexicals = extract_logical_field_indexicals( expression, all_logical_field_indexicals );
    return logical_fields_for_indexicals( relevant_logical_field_indexicals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 58519L)
  public static SubLObject extract_logical_field_indexicals(final SubLObject expression, final SubLObject all_logical_field_indexicals)
  {
    return cycl_utilities.remove_if_not_in_expression( all_logical_field_indexicals, expression, T, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 58709L)
  public static SubLObject sksi_determine_relevant_logical_fields(final SubLObject physical_fields, final SubLObject physical_schema, final SubLObject logical_schema)
  {
    final SubLObject all_logical_fields = logical_schema_fields( logical_schema );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_fields;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject logical_fields = sksi_determine_relevant_logical_fields_for_physical_field_via_decoding( pf, physical_schema, all_logical_fields, logical_schema );
      result = ConsesLow.nconc( result, logical_fields );
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    result = list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 59209L)
  public static SubLObject sksi_determine_relevant_logical_fields_for_physical_field_via_decoding(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject all_logical_fields,
      final SubLObject logical_schema)
  {
    final SubLObject field_decoding_gafs = sksi_field_translation_utilities.get_field_decoding_gafs_from_physical_field_indexical( pfi_fort_for_pfi( indexical_for_physical_field( physical_field ) ), ConsesLow.list(
        logical_schema ), ConsesLow.list( physical_schema ) );
    SubLObject logical_fields = NIL;
    SubLObject cdolist_list_var = field_decoding_gafs;
    SubLObject field_decoding_gaf = NIL;
    field_decoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      logical_fields = ConsesLow.nconc( logical_fields, extract_logical_fields( assertions_high.gaf_arg2( field_decoding_gaf ), all_logical_fields ) );
      cdolist_list_var = cdolist_list_var.rest();
      field_decoding_gaf = cdolist_list_var.first();
    }
    return logical_fields;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 59793L)
  public static SubLObject sksi_determine_logical_field_indexicals_relevant_to_physical_field(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.append( sksi_determine_logical_field_indexicals_relevant_to_physical_field_int1( physical_field, physical_schema, logical_schema ),
        sksi_determine_logical_field_indexicals_relevant_to_physical_field_int2( physical_field, physical_schema, logical_schema ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 60407L)
  public static SubLObject sksi_determine_logical_field_indexicals_relevant_to_physical_field_int1(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema)
  {
    return Mapping.mapcar( $sym185$INDEXICAL_FOR_LOGICAL_FIELD, sksi_get_all_mapped_logical_fields_for_physical_field( physical_field ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 60712L)
  public static SubLObject sksi_determine_logical_field_indexicals_relevant_to_physical_field_int2(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema)
  {
    final SubLObject field_encodings = sksi_field_translation_utilities.relevant_field_encodings( physical_field, physical_schema, logical_schema );
    SubLObject logical_field_indexicals = NIL;
    SubLObject cdolist_list_var = field_encodings;
    SubLObject field_encoding = NIL;
    field_encoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals( field_encoding );
      logical_field_indexicals = ConsesLow.nconc( logical_field_indexicals, lfis );
      cdolist_list_var = cdolist_list_var.rest();
      field_encoding = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( logical_field_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 61618L)
  public static SubLObject logical_field_isa(final SubLObject logical_field)
  {
    return kb_mapping_utilities.pred_values( logical_field, $const191$fieldIsa, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 61729L)
  public static SubLObject logical_field_type_list(final SubLObject ls)
  {
    final SubLObject el_list = kb_mapping_utilities.fpred_value( ls, $const192$logicalSchemaFieldTypeList, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != el_list ) ? el_utilities.el_list_items( el_list ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 61895L)
  public static SubLObject logical_field_mappings(final SubLObject lf)
  {
    return kb_mapping_utilities.pred_values( lf, $const193$logicalFieldMapping, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62000L)
  public static SubLObject sksi_get_mapped_physical_fields_for_logical_field_int_internal(final SubLObject lf, final SubLObject pred, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    if( NIL != lf_alias_fn_naut_p( lf ) )
    {
      final SubLObject lf_fort = lf_alias_fn_naut_lf( lf );
      final SubLObject index = lf_alias_fn_naut_index( lf );
      final SubLObject pf_fort_list = sksi_get_mapped_physical_fields_for_logical_field_int_2( lf_fort, pred );
      SubLObject v_answer = NIL;
      SubLObject cdolist_list_var = pf_fort_list;
      SubLObject pf_fort = NIL;
      pf_fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_answer = ConsesLow.cons( pf_alias_naut_for_pf_and_alias_index( pf_fort, index ), v_answer );
        cdolist_list_var = cdolist_list_var.rest();
        pf_fort = cdolist_list_var.first();
      }
      return Sequences.nreverse( v_answer );
    }
    return sksi_get_mapped_physical_fields_for_logical_field_int_2( lf, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62000L)
  public static SubLObject sksi_get_mapped_physical_fields_for_logical_field_int(final SubLObject lf, final SubLObject pred, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_get_mapped_physical_fields_for_logical_field_int_internal( lf, pred, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT, THREE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( lf, pred, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( lf.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_get_mapped_physical_fields_for_logical_field_int_internal( lf, pred, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( lf, pred, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62660L)
  public static SubLObject sksi_get_mapped_physical_fields_for_logical_field_int_2(final SubLObject lf, final SubLObject pred)
  {
    return kb_mapping_utilities.pred_values( lf, pred, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62784L)
  public static SubLObject sksi_get_mapped_physical_fields_for_logical_field(final SubLObject logical_field)
  {
    return sksi_get_mapped_physical_fields_for_logical_field_int( logical_field, $const195$logicalPhysicalFieldMap, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 62974L)
  public static SubLObject sksi_get_decoding_mapped_physical_fields_for_logical_field(final SubLObject logical_field)
  {
    return sksi_get_mapped_physical_fields_for_logical_field_int( logical_field, $const196$logicalPhysicalFieldMap_DecodeClo, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 63183L)
  public static SubLObject sksi_get_encoding_mapped_physical_fields_for_logical_field(final SubLObject logical_field)
  {
    return sksi_get_mapped_physical_fields_for_logical_field_int( logical_field, $const197$logicalPhysicalFieldMap_EncodeClo, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 63392L)
  public static SubLObject sksi_get_mapped_logical_fields_for_physical_field_int(final SubLObject pf, final SubLObject pred)
  {
    if( NIL != pf_alias_fn_naut_p( pf ) )
    {
      final SubLObject pf_fort = pf_alias_fn_naut_pf( pf );
      final SubLObject index = pf_alias_fn_naut_index( pf );
      final SubLObject lf_fort_list = sksi_get_mapped_logical_fields_for_physical_field_int_2( pf_fort, pred );
      SubLObject v_answer = NIL;
      SubLObject cdolist_list_var = lf_fort_list;
      SubLObject lf_fort = NIL;
      lf_fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_answer = ConsesLow.cons( lf_alias_naut_for_lf_and_alias_index( lf_fort, index ), v_answer );
        cdolist_list_var = cdolist_list_var.rest();
        lf_fort = cdolist_list_var.first();
      }
      return Sequences.nreverse( v_answer );
    }
    return sksi_get_mapped_logical_fields_for_physical_field_int_2( pf, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 63925L)
  public static SubLObject sksi_get_mapped_logical_fields_for_physical_field_int_2(final SubLObject pf, final SubLObject pred)
  {
    return kb_mapping_utilities.pred_values( pf, pred, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64049L)
  public static SubLObject sksi_get_mapped_logical_fields_for_physical_field(final SubLObject physical_field)
  {
    return sksi_get_mapped_logical_fields_for_physical_field_int( physical_field, $const195$logicalPhysicalFieldMap );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64239L)
  public static SubLObject sksi_get_decoding_mapped_logical_fields_for_physical_field(final SubLObject physical_field)
  {
    return sksi_get_mapped_logical_fields_for_physical_field_int( physical_field, $const196$logicalPhysicalFieldMap_DecodeClo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64450L)
  public static SubLObject sksi_get_encoding_mapped_logical_fields_for_physical_field(final SubLObject physical_field)
  {
    return sksi_get_mapped_logical_fields_for_physical_field_int( physical_field, $const197$logicalPhysicalFieldMap_EncodeClo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 64661L)
  public static SubLObject sksi_get_all_mapped_logical_fields_for_physical_field(final SubLObject physical_field)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.append( sksi_get_mapped_logical_fields_for_physical_field( physical_field ), sksi_get_decoding_mapped_logical_fields_for_physical_field( physical_field ),
        sksi_get_encoding_mapped_logical_fields_for_physical_field( physical_field ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65016L)
  public static SubLObject physical_field_data_type_name(final SubLObject pf, final SubLObject dbms)
  {
    final SubLObject pf_type = physical_field_data_type( pf );
    final SubLObject type_name = data_type_name( pf_type, dbms );
    return type_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65294L)
  public static SubLObject physical_field_data_type(final SubLObject pf)
  {
    return kb_mapping_utilities.fpred_value( pf_fort_for_pf( pf ), $const198$fieldDataType, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65412L)
  public static SubLObject boolean_physical_field_p(final SubLObject pf)
  {
    return kb_utilities.kbeq( physical_field_data_type( pf ), $const199$SQLBoolean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65521L)
  public static SubLObject data_type_name(final SubLObject type, final SubLObject dbms)
  {
    final SubLObject gaf = kb_mapping_utilities.pred_u_v_holds_gafs( $const200$programDataTypeNameString, dbms, type, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ).first();
    if( NIL != assertions_high.gaf_assertionP( gaf ) )
    {
      return assertions_high.gaf_arg3( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 65722L)
  public static SubLObject data_type_by_name(final SubLObject name, final SubLObject dbms)
  {
    final SubLObject name_gafs = kb_mapping_utilities.pred_value_gafs( dbms, $const200$programDataTypeNameString, ONE_INTEGER, $kw1$TRUE );
    SubLObject v_answer = NIL;
    if( NIL == v_answer )
    {
      SubLObject csome_list_var = name_gafs;
      SubLObject gaf = NIL;
      gaf = csome_list_var.first();
      while ( NIL == v_answer && NIL != csome_list_var)
      {
        if( assertions_high.gaf_arg3( gaf ).equal( name ) )
        {
          v_answer = assertions_high.gaf_arg1( gaf );
        }
        csome_list_var = csome_list_var.rest();
        gaf = csome_list_var.first();
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66115L)
  public static SubLObject physical_schema_indexes(final SubLObject ps)
  {
    return kb_mapping_utilities.pred_values( ps, $const201$schemaFieldsIndex, ONE_INTEGER, FOUR_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66334L)
  public static SubLObject index_physical_fields(final SubLObject index)
  {
    return kb_mapping_utilities.fpred_value( index, $const201$schemaFieldsIndex, FOUR_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66443L)
  public static SubLObject index_type(final SubLObject index)
  {
    return kb_mapping_utilities.fpred_value( index, $const202$indexType, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66532L)
  public static SubLObject index_name(final SubLObject index)
  {
    return kb_mapping_utilities.fpred_value( index, $const203$indexName, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66621L)
  public static SubLObject index_type_namestring(final SubLObject type, final SubLObject dbms)
  {
    final SubLObject gaf = kb_mapping_utilities.pred_u_v_holds_gafs( $const204$programIndexTypeNameString, dbms, type, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE ).first();
    if( NIL != assertions_high.gaf_assertionP( gaf ) )
    {
      return assertions_high.gaf_arg3( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66835L)
  public static SubLObject cycl_operator_to_csql_operator_internal(final SubLObject operator)
  {
    return kb_mapping_utilities.fpred_value( operator, $const206$cyclOperatorToCSQLOperator, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 66835L)
  public static SubLObject cycl_operator_to_csql_operator(final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cycl_operator_to_csql_operator_internal( operator );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, operator, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cycl_operator_to_csql_operator_internal( operator ) ) );
      memoization_state.caching_state_put( caching_state, operator, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67113L)
  public static SubLObject csql_operator_to_cycl_operator_internal(final SubLObject operator)
  {
    return kb_mapping_utilities.fpred_value( operator, $const206$cyclOperatorToCSQLOperator, TWO_INTEGER, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67113L)
  public static SubLObject csql_operator_to_cycl_operator(final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return csql_operator_to_cycl_operator_internal( operator );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, operator, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( csql_operator_to_cycl_operator_internal( operator ) ) );
      memoization_state.caching_state_put( caching_state, operator, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67278L)
  public static SubLObject csql_operator_to_sql_operator_internal(final SubLObject operator, final SubLObject sql_flavor)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf( $const209$csqlOperatorToSQLOperator, operator, sql_flavor, ONE_INTEGER, THREE_INTEGER, $kw1$TRUE );
    if( NIL != gaf )
    {
      return assertions_high.gaf_arg2( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67278L)
  public static SubLObject csql_operator_to_sql_operator(final SubLObject operator, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return csql_operator_to_sql_operator_internal( operator, sql_flavor );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( operator, sql_flavor );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( operator.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sql_flavor.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( csql_operator_to_sql_operator_internal( operator, sql_flavor ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( operator, sql_flavor ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67523L)
  public static SubLObject csql_operator_to_sql_operator_syntax_internal(final SubLObject operator, final SubLObject sql_flavor)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf( $const209$csqlOperatorToSQLOperator, operator, sql_flavor, ONE_INTEGER, THREE_INTEGER, $kw1$TRUE );
    if( NIL != gaf )
    {
      return assertions_high.gaf_arg4( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67523L)
  public static SubLObject csql_operator_to_sql_operator_syntax(final SubLObject operator, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return csql_operator_to_sql_operator_syntax_internal( operator, sql_flavor );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( operator, sql_flavor );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( operator.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sql_flavor.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( csql_operator_to_sql_operator_syntax_internal( operator, sql_flavor ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( operator, sql_flavor ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67776L)
  public static SubLObject csql_operator_to_sql_prefix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor)
  {
    return kb_utilities.kbeq( $const211$SQLOperatorSyntax_Prefix, csql_operator_to_sql_operator_syntax( operator, sql_flavor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 67964L)
  public static SubLObject csql_operator_to_sql_infix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor)
  {
    return kb_utilities.kbeq( $const212$SQLOperatorSyntax_Infix, csql_operator_to_sql_operator_syntax( operator, sql_flavor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68150L)
  public static SubLObject csql_operator_to_sql_postfix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor)
  {
    return kb_utilities.kbeq( $const213$SQLOperatorSyntax_Postfix, csql_operator_to_sql_operator_syntax( operator, sql_flavor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68340L)
  public static SubLObject csql_operator_to_sql_inverse_infix_operator_syntaxP(final SubLObject operator, final SubLObject sql_flavor)
  {
    return kb_utilities.kbeq( $const214$SQLOperatorSyntax_InverseInfix, csql_operator_to_sql_operator_syntax( operator, sql_flavor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68541L)
  public static SubLObject csql_operator_to_sql_function_syntaxP(final SubLObject operator, final SubLObject sql_flavor)
  {
    return kb_utilities.kbeq( $const215$SQLFunctionSyntax, csql_operator_to_sql_operator_syntax( operator, sql_flavor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68715L)
  public static SubLObject csql_to_sql_translation_format_gaf_internal(final SubLObject operator, final SubLObject sql_flavor)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf( $const217$csqlToSQLTranslationFormat, operator, sql_flavor, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
    return gaf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68715L)
  public static SubLObject csql_to_sql_translation_format_gaf(final SubLObject operator, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return csql_to_sql_translation_format_gaf_internal( operator, sql_flavor );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( operator, sql_flavor );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( operator.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sql_flavor.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( csql_to_sql_translation_format_gaf_internal( operator, sql_flavor ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( operator, sql_flavor ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 68938L)
  public static SubLObject sksi_mapping_mt_p(final SubLObject mt)
  {
    return isa.isa_in_any_mtP( mt, $const218$SKSIMappingMicrotheory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69256L)
  public static SubLObject get_genl_content_mts_for_sks(final SubLObject sks)
  {
    return get_genl_content_mts_for_mt( sk_source_content_mt( sks ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69376L)
  public static SubLObject get_genl_content_mts_for_mt(final SubLObject mt)
  {
    return genl_mts.all_genl_mts_if( mt, $sym219$SKSI_CONTENT_MT_P, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69543L)
  public static SubLObject sksi_content_mt_p(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      v_answer = fort_types_interface.isa_sksi_content_microtheoryP( mt, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
  public static SubLObject clear_sksi_content_mts()
  {
    final SubLObject cs = $sksi_content_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
  public static SubLObject remove_sksi_content_mts()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sksi_content_mts_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
  public static SubLObject sksi_content_mts_internal()
  {
    return isa.all_fort_instances_in_all_mts( $const221$SKSIContentMicrotheory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69737L)
  public static SubLObject sksi_content_mts()
  {
    SubLObject caching_state = $sksi_content_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym220$SKSI_CONTENT_MTS, $sym222$_SKSI_CONTENT_MTS_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym223$CLEAR_SKSI_CONTENT_MTS );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sksi_content_mts_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 69938L)
  public static SubLObject content_mt_nart_sk_source(final SubLObject mt_nart)
  {
    return ( NIL != nart_handles.nart_p( mt_nart ) ) ? cycl_utilities.nat_arg1( mt_nart, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70044L)
  public static SubLObject content_mt_sk_source_in_any_mt(final SubLObject content_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sk_source = content_mt_nart_sk_source( content_mt );
    if( NIL == sk_source )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
        sk_source = content_mt_sk_source( content_mt, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return sk_source;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70371L)
  public static SubLObject content_mt_to_mapping_mt(final SubLObject content_mt)
  {
    final SubLObject sk_source = content_mt_sk_source_in_any_mt( content_mt );
    if( NIL != forts.fort_p( sk_source ) )
    {
      return sk_source_mapping_mt( sk_source );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70572L)
  public static SubLObject complete_knowledge_sources()
  {
    return kb_mapping_utilities.pred_refs_in_any_mt( $const224$sksRepresentationComplete, ONE_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70689L)
  public static SubLObject knowledge_source_representation_completeP(final SubLObject sks)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value( sks, $const224$sksRepresentationComplete, ONE_INTEGER, ONE_INTEGER, $kw1$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70984L)
  public static SubLObject sksi_supported_database_server_program_p_internal(final SubLObject prog)
  {
    return isa.isaP( prog, $const226$SKSISupportedDatabaseServerProgra, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 70984L)
  public static SubLObject sksi_supported_database_server_program_p(final SubLObject prog)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_supported_database_server_program_p_internal( prog );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, prog, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_supported_database_server_program_p_internal( prog ) ) );
      memoization_state.caching_state_put( caching_state, prog, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71207L)
  public static SubLObject default_sks_for_database_server_program(final SubLObject prog)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( prog, $const227$defaultSKSForDatabaseServerProgra, ONE_INTEGER, TWO_INTEGER, $kw1$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71359L)
  public static SubLObject table_primary_key_column_indices(final SubLObject table, final SubLObject meta_mt)
  {
    return table_primary_key_column_thingies( table, meta_mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71511L)
  public static SubLObject table_primary_key_column_names(final SubLObject table, final SubLObject meta_mt)
  {
    return table_primary_key_column_thingies( table, meta_mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 71841L)
  public static SubLObject table_primary_key_column_thingies(final SubLObject table, final SubLObject meta_mt, final SubLObject indicesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject pk_columns = table_primary_key_columns( table, meta_mt );
    final SubLObject field_names = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pk_columns )
    {
      Errors.error( $str228$Primary_keys_for__S_in__S_were_no, table, meta_mt );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == el_utilities.el_list_p( pk_columns ) )
    {
      Errors.error( $str229$Primary_keys_for__S_in__S_was_not, table, meta_mt, pk_columns );
    }
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( pk_columns, $kw230$IGNORE );
    SubLObject pk_col = NIL;
    pk_col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject field_name_pred = ( NIL != $use_legacy_simple_table_implementationP$.getDynamicValue( thread ) ) ? $const231$columnInDBTableNamed : $const232$fieldName_SKS;
      final SubLObject field_name_argnum = ( NIL != $use_legacy_simple_table_implementationP$.getDynamicValue( thread ) ) ? THREE_INTEGER : TWO_INTEGER;
      final SubLObject pk_col_name = kb_mapping_utilities.fpred_value_in_relevant_mts( pk_col, field_name_pred, meta_mt, ONE_INTEGER, field_name_argnum, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !pk_col_name.isString() )
      {
        Errors.error( $str233$Could_not_determine_the_column_na, field_name_pred, pk_col, meta_mt );
      }
      if( NIL != indicesP )
      {
        final SubLObject i = Sequences.position( pk_col_name, field_names, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == i )
        {
          Errors.error( $str234$Could_not_find_the_primary_key_co, new SubLObject[] { pk_col_name, ( NIL != $use_legacy_simple_table_implementationP$.getDynamicValue( thread ) ) ? $const235$tableFieldNameList
              : $const93$schemaFieldNameList, field_names, table, meta_mt
          } );
        }
        result = ConsesLow.cons( i, result );
      }
      else
      {
        result = ConsesLow.cons( pk_col_name, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pk_col = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 73249L)
  public static SubLObject table_primary_key_columns(final SubLObject table, final SubLObject meta_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $use_legacy_simple_table_implementationP$.getDynamicValue( thread ) )
    {
      final SubLObject field_names_el_list = kb_mapping_utilities.fpred_value_in_relevant_mts( table, $const235$tableFieldNameList, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject field_names = el_utilities.el_list_items( field_names_el_list );
      final SubLObject pk_columns = kb_mapping_utilities.fpred_value_in_relevant_mts( table, $const236$tablePrimaryKey, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == field_names_el_list )
      {
        Errors.error( $str237$Could_not_get_the___tableFieldNam, table, meta_mt );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pk_columns )
      {
        Errors.error( $str238$Could_not_determine_the___tablePr, table, meta_mt );
      }
      return Values.values( pk_columns, field_names );
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym239$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( meta_mt, thread );
      final SubLObject physical_schemata = sk_source_physical_schemata( table );
      final SubLObject physical_schema = ( NIL != list_utilities.singletonP( physical_schemata ) ) ? physical_schemata.first() : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == physical_schema )
      {
        Errors.error( $str240$Could_not_find_a_physical_schema_, table, meta_mt );
      }
      final SubLObject field_names_el_list2 = kb_mapping_utilities.fpred_value_in_relevant_mts( physical_schema, $const93$schemaFieldNameList, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject field_names2 = ( NIL != el_utilities.el_list_p( field_names_el_list2 ) ) ? el_utilities.el_list_items( field_names_el_list2 ) : NIL;
      final SubLObject pk_columns2 = kb_mapping_utilities.fpred_value_in_relevant_mts( physical_schema, $const71$primaryKey, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == field_names_el_list2 )
      {
        Errors.error( $str241$Could_not_get_the___schemaFieldNa, physical_schema, meta_mt );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pk_columns2 )
      {
        Errors.error( $str242$Could_not_determine_the___primary, table, meta_mt );
      }
      return Values.values( pk_columns2, field_names2 );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 74809L)
  public static SubLObject table_in_db_named(final SubLObject db, final SubLObject table_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sk_source_mapping_mt( db );
    if( NIL != $use_legacy_simple_table_implementationP$.getDynamicValue( thread ) )
    {
      return backward.removal_ask_variable( $kw243$TABLE, ConsesLow.list( $const244$assertedSentence, ConsesLow.list( $const245$tableInDBNamed, $kw243$TABLE, db, table_name ) ), mapping_mt, UNPROVIDED, UNPROVIDED )
          .first();
    }
    SubLObject cdolist_list_var;
    final SubLObject tables = cdolist_list_var = backward.removal_ask_variable( $kw243$TABLE, ConsesLow.list( $const244$assertedSentence, ConsesLow.list( $const20$structuredKnowledgeSourceName, $kw243$TABLE,
        table_name ) ), mapping_mt, UNPROVIDED, UNPROVIDED );
    SubLObject table = NIL;
    table = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.expression_find( db, table, T, UNPROVIDED, UNPROVIDED ) )
      {
        return table;
      }
      cdolist_list_var = cdolist_list_var.rest();
      table = cdolist_list_var.first();
    }
    return tables.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 75426L)
  public static SubLObject db_table_name(final SubLObject db, final SubLObject table)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sk_source_mapping_mt( db );
    if( NIL != $use_legacy_simple_table_implementationP$.getDynamicValue( thread ) )
    {
      return backward.removal_ask_variable( $kw246$TABLE_NAME, ConsesLow.list( $const244$assertedSentence, ConsesLow.listS( $const245$tableInDBNamed, table, db, $list247 ) ), mapping_mt, UNPROVIDED, UNPROVIDED ).first();
    }
    SubLObject cdolist_list_var;
    final SubLObject tables = cdolist_list_var = backward.removal_ask_variable( $kw246$TABLE_NAME, ConsesLow.list( $const244$assertedSentence, ConsesLow.listS( $const20$structuredKnowledgeSourceName, table, $list247 ) ),
        mapping_mt, UNPROVIDED, UNPROVIDED );
    SubLObject table_$44 = NIL;
    table_$44 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.expression_find( db, table_$44, T, UNPROVIDED, UNPROVIDED ) )
      {
        return table_$44;
      }
      cdolist_list_var = cdolist_list_var.rest();
      table_$44 = cdolist_list_var.first();
    }
    return tables.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76044L)
  public static SubLObject sksi_create(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != string_utilities.non_empty_stringP( name ) : name;
    thread.resetMultipleValues();
    final SubLObject constant = ke.ke_create_now( name, UNPROVIDED );
    final SubLObject error_result = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error_result )
    {
      Errors.error( $str249$_A___A, error_result.first(), conses_high.second( error_result ) );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76512L)
  public static SubLObject sksi_find(final SubLObject name)
  {
    return fi.fi_find_int( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76576L)
  public static SubLObject sksi_find_or_create(final SubLObject name)
  {
    assert NIL != string_utilities.non_empty_stringP( name ) : name;
    SubLObject result = NIL;
    result = sksi_find( name );
    if( NIL == result )
    {
      result = sksi_create( name );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76793L)
  public static SubLObject sksi_kill(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return ke.ke_kill_now( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 76884L)
  public static SubLObject sksi_assert(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw251$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    thread.resetMultipleValues();
    final SubLObject successP = ke.ke_assert_now( sentence, mt, strength, direction );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      SubLObject current;
      final SubLObject datum = current = error;
      SubLObject error_type = NIL;
      SubLObject error_string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list253 );
      error_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list253 );
      error_string = current.first();
      current = current.rest();
      if( NIL == current )
      {
        sksi_debugging.sksi_error( Sequences.cconcatenate( string_utilities.str( error_type ), new SubLObject[] { $str254$_, error_string
        } ) );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list253 );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77249L)
  public static SubLObject sksi_unassert(final SubLObject sentence, final SubLObject mt)
  {
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return ke.ke_unassert_now( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77360L)
  public static SubLObject sksi_unassert_assertion(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ke.ke_unassert_assertion_now( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77499L)
  public static SubLObject sksi_find_nart(final SubLObject nart_formula)
  {
    return narts_high.find_nart( nart_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77582L)
  public static SubLObject sksi_assert_if_new(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject assertions = fi.sentence_assertions( sentence, mt );
    if( NIL != assertions )
    {
      return T;
    }
    return sksi_assert( sentence, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 77758L)
  public static SubLObject sksi_edit_assertion(final SubLObject old_assertion, final SubLObject new_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = assertions_high.assertion_mt( old_assertion );
    thread.resetMultipleValues();
    final SubLObject result = sksi_assert( new_formula, mt, UNPROVIDED, UNPROVIDED );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return Values.values( NIL, error );
    }
    return sksi_unassert_assertion( old_assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78062L)
  public static SubLObject sksi_repropagate_assertion(final SubLObject assertion)
  {
    return ke.ke_repropagate_assertion( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78166L)
  public static SubLObject sksi_constant_get_kb_subset_cols(final SubLObject v_term)
  {
    SubLObject cyc_kb_subset_collections = NIL;
    SubLObject cdolist_list_var = isa.asserted_quoted_isa( v_term, $const257$BookkeepingMt );
    SubLObject c = NIL;
    c = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isa_in_any_mtP( c, $const256$CycKBSubsetCollection ) )
      {
        cyc_kb_subset_collections = ConsesLow.cons( c, cyc_kb_subset_collections );
      }
      cdolist_list_var = cdolist_list_var.rest();
      c = cdolist_list_var.first();
    }
    return cyc_kb_subset_collections;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78549L)
  public static SubLObject sksi_constant_assert_inherited_kb_subset_isas(final SubLObject v_term, final SubLObject inherit_from_term)
  {
    final SubLObject inherited_isa_cols = sksi_constant_get_kb_subset_cols( inherit_from_term );
    if( NIL == inherited_isa_cols )
    {
      Errors.warn( $str258$No___CycKBSubsetCollections_found, inherit_from_term, v_term );
    }
    SubLObject cdolist_list_var = inherited_isa_cols;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_assert_if_new( ConsesLow.list( $const259$quotedIsa, v_term, col ), $const257$BookkeepingMt );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-kb-accessors.lisp", position = 78984L)
  public static SubLObject sksi_temporal_field_null_maps_to(final SubLObject pf)
  {
    final SubLObject result = kb_mapping_utilities.fpred_value_in_any_mt( pf, $const260$temporalFieldNullMapsTo, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != result ) ? result : $kw261$UNREFORMULATABLE;
  }

  public static SubLObject declare_sksi_kb_accessors_file()
  {
    SubLFiles.declareFunction( me, "content_mt_sk_source_gaf", "CONTENT-MT-SK-SOURCE-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "content_mt_sk_source_internal", "CONTENT-MT-SK-SOURCE-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "content_mt_sk_source", "CONTENT-MT-SK-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "content_mt_spindle_member_p", "CONTENT-MT-SPINDLE-MEMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_p", "SK-SOURCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_in_any_mt_p_internal", "SK-SOURCE-IN-ANY-MT-P-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_in_any_mt_p", "SK-SOURCE-IN-ANY-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "modifiable_sk_source_p", "MODIFIABLE-SK-SOURCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "modifiable_sk_source_in_any_mt_p", "MODIFIABLE-SK-SOURCE-IN-ANY-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "code_mapping_knowledge_sourceP", "CODE-MAPPING-KNOWLEDGE-SOURCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sk_source_property_from_kb_internal", "GET-SK-SOURCE-PROPERTY-FROM-KB-INTERNAL", 2, 5, false );
    SubLFiles.declareFunction( me, "get_sk_source_property_from_kb", "GET-SK-SOURCE-PROPERTY-FROM-KB", 2, 5, false );
    SubLFiles.declareFunction( me, "get_sk_source_property_from_kb_int", "GET-SK-SOURCE-PROPERTY-FROM-KB-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_gaf", "SK-SOURCE-CONTENT-MT-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_internal", "SK-SOURCE-CONTENT-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt", "SK-SOURCE-CONTENT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_in_any_mt", "SK-SOURCE-CONTENT-MT-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_head_gaf", "SK-SOURCE-CONTENT-MT-HEAD-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_head_internal", "SK-SOURCE-CONTENT-MT-HEAD-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_head", "SK-SOURCE-CONTENT-MT-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_content_mt_head_in_any_mt", "SK-SOURCE-CONTENT-MT-HEAD-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_mapping_mt_internal", "SK-SOURCE-MAPPING-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_mapping_mt", "SK-SOURCE-MAPPING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_logical_schema_description_mt", "SK-SOURCE-LOGICAL-SCHEMA-DESCRIPTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_description_mt_sk_source_in_any_mt", "LOGICAL-SCHEMA-DESCRIPTION-MT-SK-SOURCE-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_source_description_mt", "SK-SOURCE-SOURCE-DESCRIPTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_schema_translation_mt", "SK-SOURCE-SCHEMA-TRANSLATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "schema_translation_mt_sk_source_in_any_mt", "SCHEMA-TRANSLATION-MT-SK-SOURCE-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_ks_type", "SK-SOURCE-KS-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_row_count", "SK-SOURCE-ROW-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_name", "SK-SOURCE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_name_from_mapping_mt", "SK-SOURCE-NAME-FROM-MAPPING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_namespace_internal", "SK-SOURCE-NAMESPACE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_namespace", "SK-SOURCE-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_asserted_namespace_gaf", "SK-SOURCE-ASSERTED-NAMESPACE-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_by_sks_name_internal", "SK-SOURCE-BY-SKS-NAME-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "sk_source_by_sks_name", "SK-SOURCE-BY-SKS-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "sk_source_physical_schema_gafs", "SK-SOURCE-PHYSICAL-SCHEMA-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_physical_schemata", "SK-SOURCE-PHYSICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_complex_physical_schemata", "SK-SOURCE-COMPLEX-PHYSICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_complex_physical_schemata_int", "SK-SOURCE-COMPLEX-PHYSICAL-SCHEMATA-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_logical_schemata", "SK-SOURCE-LOGICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_complex_logical_schemata", "SK-SOURCE-COMPLEX-LOGICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_physical_logical_schema_pairs", "SK-SOURCE-PHYSICAL-LOGICAL-SCHEMA-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_immediate_spec_sk_sources", "SK-SOURCE-IMMEDIATE-SPEC-SK-SOURCES", 1, 1, false );
    SubLFiles.declareFunction( me, "meaning_sentence_predicate_for_sk_sourceP", "MEANING-SENTENCE-PREDICATE-FOR-SK-SOURCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_for_meaning_sentence_predicate", "LOGICAL-SCHEMA-FOR-MEANING-SENTENCE-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "sk_source_complex_required_fields", "SK-SOURCE-COMPLEX-REQUIRED-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_required_fields", "SK-SOURCE-REQUIRED-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_sql_flavor", "SK-SOURCE-SQL-FLAVOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_single_literal_lookup_direction_from_kb_internal", "GET-SKS-SINGLE-LITERAL-LOOKUP-DIRECTION-FROM-KB-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_single_literal_lookup_direction_from_kb", "GET-SKS-SINGLE-LITERAL-LOOKUP-DIRECTION-FROM-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_multi_literal_lookup_direction_from_kb_internal", "GET-SKS-MULTI-LITERAL-LOOKUP-DIRECTION-FROM-KB-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_multi_literal_lookup_direction_from_kb", "GET-SKS-MULTI-LITERAL-LOOKUP-DIRECTION-FROM-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_storage_direction_from_kb_internal", "GET-SKS-STORAGE-DIRECTION-FROM-KB-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_storage_direction_from_kb", "GET-SKS-STORAGE-DIRECTION-FROM-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_module_direction_from_kb", "GET-SKS-MODULE-DIRECTION-FROM-KB", 3, 0, false );
    SubLFiles.declareFunction( me, "sk_source_sub_ks_direct", "SK-SOURCE-SUB-KS-DIRECT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_sk_source_sub_ks_direct", "DO-SK-SOURCE-SUB-KS-DIRECT" );
    SubLFiles.declareFunction( me, "sk_source_proper_sub_ks_closure", "SK-SOURCE-PROPER-SUB-KS-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_proper_sub_ks_closure_in_mapping_mt", "SK-SOURCE-PROPER-SUB-KS-CLOSURE-IN-MAPPING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_sub_ks_closure", "SK-SOURCE-SUB-KS-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_sub_ks_min", "SK-SOURCE-SUB-KS-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_sub_ksP", "SK-SOURCE-SUB-KS?", 2, 0, false );
    SubLFiles.declareFunction( me, "sk_source_sub_ks_in_any_mtP", "SK-SOURCE-SUB-KS-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "sk_source_proper_sub_ksP", "SK-SOURCE-PROPER-SUB-KS?", 2, 0, false );
    SubLFiles.declareFunction( me, "sk_source_super_ks_direct", "SK-SOURCE-SUPER-KS-DIRECT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_proper_super_ks_closure", "SK-SOURCE-PROPER-SUPER-KS-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_super_ks_closure", "SK-SOURCE-SUPER-KS-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_super_ks_max", "SK-SOURCE-SUPER-KS-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_super_ksP", "SK-SOURCE-SUPER-KS?", 2, 0, false );
    SubLFiles.declareFunction( me, "sk_source_proper_super_ksP_internal", "SK-SOURCE-PROPER-SUPER-KS?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sk_source_proper_super_ksP", "SK-SOURCE-PROPER-SUPER-KS?", 2, 0, false );
    SubLFiles.declareFunction( me, "common_super_ksP", "COMMON-SUPER-KS?", 2, 0, false );
    SubLFiles.declareFunction( me, "super_ks_closure_intersection", "SUPER-KS-CLOSURE-INTERSECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "immediate_genl_ks_internal", "IMMEDIATE-GENL-KS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "immediate_genl_ks", "IMMEDIATE-GENL-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "max_genl_ks", "MAX-GENL-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "nearest_common_super_ks", "NEAREST-COMMON-SUPER-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "nearest_common_super_ks_for_ls_list", "NEAREST-COMMON-SUPER-KS-FOR-LS-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "schema_representation_completeP", "SCHEMA-REPRESENTATION-COMPLETE?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_physical_schemaP_internal", "ISA-PHYSICAL-SCHEMA?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_physical_schemaP", "ISA-PHYSICAL-SCHEMA?", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_sk_sources", "PHYSICAL-SCHEMA-SK-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_sk_sources_memoized_internal", "PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_sk_sources_memoized", "PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_fields_internal", "PHYSICAL-SCHEMA-FIELDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_fields", "PHYSICAL-SCHEMA-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_primary_key_internal", "PHYSICAL-SCHEMA-PRIMARY-KEY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_primary_key", "PHYSICAL-SCHEMA-PRIMARY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_primary_key_compensate_for_table_column_representation_internal", "PHYSICAL-SCHEMA-PRIMARY-KEY-COMPENSATE-FOR-TABLE-COLUMN-REPRESENTATION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_primary_key_compensate_for_table_column_representation", "PHYSICAL-SCHEMA-PRIMARY-KEY-COMPENSATE-FOR-TABLE-COLUMN-REPRESENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_primary_key_p", "PHYSICAL-SCHEMA-PRIMARY-KEY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_forbidden_comparison_operators", "PHYSICAL-SCHEMA-FORBIDDEN-COMPARISON-OPERATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_forbidden_comparison_operator_p", "PHYSICAL-SCHEMA-FORBIDDEN-COMPARISON-OPERATOR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_foreign_keys", "PHYSICAL-SCHEMA-FOREIGN-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_foreign_keys_restrict", "PHYSICAL-SCHEMA-FOREIGN-KEYS-RESTRICT", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_foreign_keys_cascade", "PHYSICAL-SCHEMA-FOREIGN-KEYS-CASCADE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_foreign_keys_set_null", "PHYSICAL-SCHEMA-FOREIGN-KEYS-SET-NULL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_foreign_keys_set_default", "PHYSICAL-SCHEMA-FOREIGN-KEYS-SET-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_foreign_keys_int", "PHYSICAL-SCHEMA-FOREIGN-KEYS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_unique_fields_tuples", "PHYSICAL-SCHEMA-UNIQUE-FIELDS-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_required_fields", "PHYSICAL-SCHEMA-REQUIRED-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schemata_required_fields", "PHYSICAL-SCHEMATA-REQUIRED-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_required_field_names", "PHYSICAL-SCHEMA-REQUIRED-FIELD-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_indexed_fields", "PHYSICAL-SCHEMA-INDEXED-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_singly_indexed_schema_indexed_field", "SKSI-DETERMINE-SINGLY-INDEXED-SCHEMA-INDEXED-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexedP", "PHYSICAL-FIELD-INDEXED?", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_enumerableP_internal", "PHYSICAL-SCHEMA-ENUMERABLE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_enumerableP", "PHYSICAL-SCHEMA-ENUMERABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerable_schema_gaf", "ENUMERABLE-SCHEMA-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_result_set_cardinality_gafs_internal", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_result_set_cardinality_gafs", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schemata_result_set_cardinality_gafs", "PHYSICAL-SCHEMATA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_result_set_cardinality_wXconstraints_gafs_internal", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_result_set_cardinality_wXconstraints_gafs", "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schemata_result_set_cardinality_wXconstraints_gafs", "PHYSICAL-SCHEMATA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "result_set_cardinality_gaf_unbound_fields_set", "RESULT-SET-CARDINALITY-GAF-UNBOUND-FIELDS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "result_set_cardinality_gaf_bound_fields_set", "RESULT-SET-CARDINALITY-GAF-BOUND-FIELDS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "result_set_cardinality_gaf_constraints", "RESULT-SET-CARDINALITY-GAF-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "result_set_cardinality_gaf_cost_expression", "RESULT-SET-CARDINALITY-GAF-COST-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_logical_schema_gafs", "PHYSICAL-SCHEMA-LOGICAL-SCHEMA-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_logical_schemata", "PHYSICAL-SCHEMA-LOGICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_example_tuple", "PHYSICAL-SCHEMA-EXAMPLE-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_field_encodings", "PHYSICAL-SCHEMA-FIELD-ENCODINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_ordered_field_list_internal", "PHYSICAL-SCHEMA-ORDERED-FIELD-LIST-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_ordered_field_list", "PHYSICAL-SCHEMA-ORDERED-FIELD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_field_name_list", "PHYSICAL-SCHEMA-FIELD-NAME-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schemata_physical_schemata", "LOGICAL-SCHEMATA-PHYSICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_physical_schemata", "LOGICAL-SCHEMA-PHYSICAL-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_fields_internal", "LOGICAL-SCHEMA-FIELDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_fields", "LOGICAL-SCHEMA-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_field_indexicals_internal", "LOGICAL-SCHEMA-FIELD-INDEXICALS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_field_indexicals", "LOGICAL-SCHEMA-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_example_sentences", "LOGICAL-SCHEMA-EXAMPLE-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_keys", "LOGICAL-SCHEMA-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_result_set_cardinality_gafs_internal", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_result_set_cardinality_gafs", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schemata_result_set_cardinality_gafs", "LOGICAL-SCHEMATA-RESULT-SET-CARDINALITY-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_gaf_unbound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-GAF-UNBOUND-FIELDS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_gaf_bound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-GAF-BOUND-FIELDS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_gaf_cost_expression", "LOGICAL-RESULT-SET-CARDINALITY-GAF-COST-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_result_set_cardinality_wrt_value_gafs_internal", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_result_set_cardinality_wrt_value_gafs", "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schemata_result_set_cardinality_wrt_value_gafs", "LOGICAL-SCHEMATA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_wrt_value_gaf_unbound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-UNBOUND-FIELDS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_wrt_value_gaf_bound_fields_set", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-BOUND-FIELDS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_wrt_value_gaf_cost_expression", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-COST-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_result_set_cardinality_wrt_value_gaf_value", "LOGICAL-RESULT-SET-CARDINALITY-WRT-VALUE-GAF-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_field_decodings", "LOGICAL-SCHEMA-FIELD-DECODINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_source_gafs", "LOGICAL-SCHEMA-SOURCE-GAFS", 1, 1, false );
    SubLFiles.declareFunction( me, "logical_schema_sources", "LOGICAL-SCHEMA-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_sk_sources_memoized_internal", "LOGICAL-SCHEMA-SK-SOURCES-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_sk_sources_memoized", "LOGICAL-SCHEMA-SK-SOURCES-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schemata_sources", "LOGICAL-SCHEMATA-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_sourceP", "LOGICAL-SCHEMA-SOURCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_complete_extent_knownP", "LOGICAL-SCHEMA-COMPLETE-EXTENT-KNOWN?", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_schema_complete_extent_known_for_predicateP", "LOGICAL-SCHEMA-COMPLETE-EXTENT-KNOWN-FOR-PREDICATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "logical_schema_content_sentences", "LOGICAL-SCHEMA-CONTENT-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_p", "LOGICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_p_memoized_internal", "LOGICAL-FIELD-P-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_p_memoized", "LOGICAL-FIELD-P-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_alias_fn_naut_p", "LF-ALIAS-FN-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_alias_fn_naut_lf", "LF-ALIAS-FN-NAUT-LF", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_alias_fn_naut_index", "LF-ALIAS-FN-NAUT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_fort_for_lf", "LF-FORT-FOR-LF", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_alias_naut_for_lf_and_alias_index", "LF-ALIAS-NAUT-FOR-LF-AND-ALIAS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_p", "LOGICAL-FIELD-INDEXICAL-P", 1, 0, false );
    new $logical_field_indexical_p$UnaryFunction();
    SubLFiles.declareFunction( me, "logical_field_indexical_p_memoized_internal", "LOGICAL-FIELD-INDEXICAL-P-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_p_memoized", "LOGICAL-FIELD-INDEXICAL-P-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_fort_p", "LOGICAL-FIELD-INDEXICAL-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lfi_alias_fn_naut_p", "LFI-ALIAS-FN-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lfi_alias_fn_naut_lfi", "LFI-ALIAS-FN-NAUT-LFI", 1, 0, false );
    SubLFiles.declareFunction( me, "lfi_alias_fn_naut_index", "LFI-ALIAS-FN-NAUT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "lfi_alias_naut_for_lfi_and_alias_index", "LFI-ALIAS-NAUT-FOR-LFI-AND-ALIAS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "lfi_fort_for_lfi", "LFI-FORT-FOR-LFI", 1, 0, false );
    SubLFiles.declareFunction( me, "lfi_index_for_lfi", "LFI-INDEX-FOR-LFI", 1, 1, false );
    SubLFiles.declareFunction( me, "pfi_for_lfi", "PFI-FOR-LFI", 2, 0, false );
    SubLFiles.declareFunction( me, "lfi_for_pfi", "LFI-FOR-PFI", 2, 0, false );
    SubLFiles.declareFunction( me, "pf_for_lfi", "PF-FOR-LFI", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_for_schemaP", "LOGICAL-FIELD-INDEXICAL-FOR-SCHEMA?", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_fort_for_schema_internal", "LOGICAL-FIELD-INDEXICAL-FORT-FOR-SCHEMA-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_fort_for_schema", "LOGICAL-FIELD-INDEXICAL-FORT-FOR-SCHEMA", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_for_schemaP", "LOGICAL-FIELD-FOR-SCHEMA?", 2, 0, false );
    SubLFiles.declareFunction( me, "virtual_logical_field_indexical_p", "VIRTUAL-LOGICAL-FIELD-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_virtualP", "LOGICAL-FIELD-INDEXICAL-VIRTUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_logical_schemaP_internal", "ISA-LOGICAL-SCHEMA?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_logical_schemaP", "ISA-LOGICAL-SCHEMA?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_reified_mappingP", "ISA-REIFIED-MAPPING?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_fort_a_reified_mappingP_internal", "IS-FORT-A-REIFIED-MAPPING?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "is_fort_a_reified_mappingP", "IS-FORT-A-REIFIED-MAPPING?", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_terms_mapped_to_by_code_mapping_schema_internal", "CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMA-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_terms_mapped_to_by_code_mapping_schema", "CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_terms_corresponding_to_code_mapping_schema_code", "CYC-TERMS-CORRESPONDING-TO-CODE-MAPPING-SCHEMA-CODE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_terms_for_sksi_external_term_naut", "CYC-TERMS-FOR-SKSI-EXTERNAL-TERM-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "schema_isa_internal", "SCHEMA-ISA-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "schema_isa", "SCHEMA-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "schema_object_field", "SCHEMA-OBJECT-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "schema_object_field_gaf", "SCHEMA-OBJECT-FIELD-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "schema_object_id_fn_expression_p", "SCHEMA-OBJECT-ID-FN-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "schema_object_fn_expression_p", "SCHEMA-OBJECT-FN-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_id_fn_expression_p", "SOURCE-SCHEMA-OBJECT-ID-FN-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expression_p", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_schema_object_fn_expression", "DESTRUCTURE-SCHEMA-OBJECT-FN-EXPRESSION" );
    SubLFiles.declareMacro( me, "destructure_source_schema_object_fn_expression", "DESTRUCTURE-SOURCE-SCHEMA-OBJECT-FN-EXPRESSION" );
    SubLFiles.declareFunction( me, "physical_field_for_indexical", "PHYSICAL-FIELD-FOR-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_for_indexical_fort_internal", "PHYSICAL-FIELD-FOR-INDEXICAL-FORT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_for_indexical_fort", "PHYSICAL-FIELD-FOR-INDEXICAL-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_for_pfi_alias_fn_naut", "PHYSICAL-FIELD-FOR-PFI-ALIAS-FN-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "indexical_for_physical_field_internal", "INDEXICAL-FOR-PHYSICAL-FIELD-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "indexical_for_physical_field", "INDEXICAL-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_fields_to_indexicals", "PHYSICAL-FIELDS-TO-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "indexicals_to_physical_fields", "INDEXICALS-TO-PHYSICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "not_null_physical_field_p", "NOT-NULL-PHYSICAL-FIELD-P", 2, 0, false );
    SubLFiles.declareFunction( me, "not_null_physical_fields_for_ps_internal", "NOT-NULL-PHYSICAL-FIELDS-FOR-PS-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "not_null_physical_fields_for_ps", "NOT-NULL-PHYSICAL-FIELDS-FOR-PS", 1, 1, false );
    SubLFiles.declareFunction( me, "physical_field_default_value_internal", "PHYSICAL-FIELD-DEFAULT-VALUE-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "physical_field_default_value", "PHYSICAL-FIELD-DEFAULT-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "null_default_physical_field_valueP", "NULL-DEFAULT-PHYSICAL-FIELD-VALUE?", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_for_schema_and_name", "PHYSICAL-FIELD-FOR-SCHEMA-AND-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_schema_internal", "PHYSICAL-FIELD-SCHEMA-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_schema", "PHYSICAL-FIELD-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_name_internal", "PHYSICAL-FIELD-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_name", "PHYSICAL-FIELD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_name", "PHYSICAL-FIELD-INDEXICAL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_sk_source_internal", "PHYSICAL-FIELD-SK-SOURCE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_sk_source", "PHYSICAL-FIELD-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_sk_source_name_internal", "PHYSICAL-FIELD-SK-SOURCE-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_sk_source_name", "PHYSICAL-FIELD-SK-SOURCE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_sk_source_namespace_internal", "PHYSICAL-FIELD-SK-SOURCE-NAMESPACE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_sk_source_namespace", "PHYSICAL-FIELD-SK-SOURCE-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_schema", "PHYSICAL-FIELD-INDEXICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_sk_source_internal", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_sk_source", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_sk_source_name_internal", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_sk_source_name", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_sk_source_namespace_internal", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAMESPACE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_sk_source_namespace", "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_p", "PHYSICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "virtual_physical_field_p", "VIRTUAL-PHYSICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_virtualP_internal", "PHYSICAL-FIELD-VIRTUAL?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_virtualP", "PHYSICAL-FIELD-VIRTUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "pf_alias_fn_naut_p", "PF-ALIAS-FN-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pf_alias_fn_naut_pf", "PF-ALIAS-FN-NAUT-PF", 1, 0, false );
    SubLFiles.declareFunction( me, "pf_alias_fn_naut_index", "PF-ALIAS-FN-NAUT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "pf_fort_for_pf", "PF-FORT-FOR-PF", 1, 0, false );
    SubLFiles.declareFunction( me, "pf_alias_naut_for_pf_and_alias_index", "PF-ALIAS-NAUT-FOR-PF-AND-ALIAS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_p", "PHYSICAL-FIELD-INDEXICAL-P", 1, 0, false );
    new $physical_field_indexical_p$UnaryFunction();
    SubLFiles.declareFunction( me, "virtual_physical_field_indexical_p", "VIRTUAL-PHYSICAL-FIELD-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_virtualP", "PHYSICAL-FIELD-INDEXICAL-VIRTUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "pfi_alias_fn_naut_p", "PFI-ALIAS-FN-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pfi_alias_fn_naut_pfi", "PFI-ALIAS-FN-NAUT-PFI", 1, 0, false );
    SubLFiles.declareFunction( me, "pfi_alias_fn_naut_index", "PFI-ALIAS-FN-NAUT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "pfi_alias_naut_for_pfi_and_alias_index", "PFI-ALIAS-NAUT-FOR-PFI-AND-ALIAS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "pfi_fort_for_pfi", "PFI-FORT-FOR-PFI", 1, 0, false );
    SubLFiles.declareFunction( me, "pfi_index_for_pfi", "PFI-INDEX-FOR-PFI", 1, 1, false );
    SubLFiles.declareFunction( me, "physical_schema_for_sks_name_internal", "PHYSICAL-SCHEMA-FOR-SKS-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_for_sks_name", "PHYSICAL-SCHEMA-FOR-SKS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_for_sks_and_field_names_internal", "PHYSICAL-FIELD-INDEXICAL-FOR-SKS-AND-FIELD-NAMES-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_for_sks_and_field_names", "PHYSICAL-FIELD-INDEXICAL-FOR-SKS-AND-FIELD-NAMES", 3, 0, false );
    SubLFiles.declareFunction( me, "indexicals_for_physical_fields", "INDEXICALS-FOR-PHYSICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_for_physical_field_internal", "INTEGER-SEQUENCE-GENERATOR-FOR-PHYSICAL-FIELD-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_for_physical_field", "INTEGER-SEQUENCE-GENERATOR-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_name_internal", "INTEGER-SEQUENCE-GENERATOR-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_name", "INTEGER-SEQUENCE-GENERATOR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_name_for_physical_field", "INTEGER-SEQUENCE-GENERATOR-NAME-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_value_is_auto_incrementedP_internal", "PHYSICAL-FIELD-VALUE-IS-AUTO-INCREMENTED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_value_is_auto_incrementedP", "PHYSICAL-FIELD-VALUE-IS-AUTO-INCREMENTED?", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_for_indexical", "LOGICAL-FIELD-FOR-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_for_indexical_fort_internal", "LOGICAL-FIELD-FOR-INDEXICAL-FORT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_for_indexical_fort", "LOGICAL-FIELD-FOR-INDEXICAL-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_for_lfi_alias_fn_naut", "LOGICAL-FIELD-FOR-LFI-ALIAS-FN-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "lfi_for_lf", "LFI-FOR-LF", 1, 0, false );
    SubLFiles.declareFunction( me, "indexical_for_logical_field_internal", "INDEXICAL-FOR-LOGICAL-FIELD-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "indexical_for_logical_field", "INDEXICAL-FOR-LOGICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_fields_for_indexicals", "LOGICAL-FIELDS-FOR-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "indexicals_for_logical_fields", "INDEXICALS-FOR-LOGICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_schema", "LOGICAL-FIELD-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_schema", "LOGICAL-FIELD-INDEXICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_sk_source_internal", "LOGICAL-FIELD-INDEXICAL-SK-SOURCE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_sk_source", "LOGICAL-FIELD-INDEXICAL-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_joinable_fields", "LOGICAL-FIELD-JOINABLE-FIELDS", 1, 1, false );
    SubLFiles.declareFunction( me, "logical_fields_joinableP_internal", "LOGICAL-FIELDS-JOINABLE?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "logical_fields_joinableP", "LOGICAL-FIELDS-JOINABLE?", 2, 1, false );
    SubLFiles.declareFunction( me, "extract_logical_fields", "EXTRACT-LOGICAL-FIELDS", 2, 0, false );
    SubLFiles.declareFunction( me, "extract_logical_field_indexicals", "EXTRACT-LOGICAL-FIELD-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_logical_fields", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELDS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_logical_fields_for_physical_field_via_decoding", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD-VIA-DECODING", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_logical_field_indexicals_relevant_to_physical_field", "SKSI-DETERMINE-LOGICAL-FIELD-INDEXICALS-RELEVANT-TO-PHYSICAL-FIELD", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_logical_field_indexicals_relevant_to_physical_field_int1", "SKSI-DETERMINE-LOGICAL-FIELD-INDEXICALS-RELEVANT-TO-PHYSICAL-FIELD-INT1", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_logical_field_indexicals_relevant_to_physical_field_int2", "SKSI-DETERMINE-LOGICAL-FIELD-INDEXICALS-RELEVANT-TO-PHYSICAL-FIELD-INT2", 3, 0, false );
    SubLFiles.declareFunction( me, "logical_field_isa", "LOGICAL-FIELD-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_type_list", "LOGICAL-FIELD-TYPE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_mappings", "LOGICAL-FIELD-MAPPINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_physical_fields_for_logical_field_int_internal", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_physical_fields_for_logical_field_int", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_physical_fields_for_logical_field_int_2", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT-2", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_physical_fields_for_logical_field", "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_decoding_mapped_physical_fields_for_logical_field", "SKSI-GET-DECODING-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_encoding_mapped_physical_fields_for_logical_field", "SKSI-GET-ENCODING-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_logical_fields_for_physical_field_int", "SKSI-GET-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_logical_fields_for_physical_field_int_2", "SKSI-GET-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD-INT-2", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_mapped_logical_fields_for_physical_field", "SKSI-GET-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_decoding_mapped_logical_fields_for_physical_field", "SKSI-GET-DECODING-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_encoding_mapped_logical_fields_for_physical_field", "SKSI-GET-ENCODING-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_all_mapped_logical_fields_for_physical_field", "SKSI-GET-ALL-MAPPED-LOGICAL-FIELDS-FOR-PHYSICAL-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_data_type_name", "PHYSICAL-FIELD-DATA-TYPE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_data_type", "PHYSICAL-FIELD-DATA-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "boolean_physical_field_p", "BOOLEAN-PHYSICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "data_type_name", "DATA-TYPE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "data_type_by_name", "DATA-TYPE-BY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_schema_indexes", "PHYSICAL-SCHEMA-INDEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "index_physical_fields", "INDEX-PHYSICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "index_type", "INDEX-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "index_name", "INDEX-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "index_type_namestring", "INDEX-TYPE-NAMESTRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_operator_to_csql_operator_internal", "CYCL-OPERATOR-TO-CSQL-OPERATOR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_operator_to_csql_operator", "CYCL-OPERATOR-TO-CSQL-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_cycl_operator_internal", "CSQL-OPERATOR-TO-CYCL-OPERATOR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_cycl_operator", "CSQL-OPERATOR-TO-CYCL-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_operator_internal", "CSQL-OPERATOR-TO-SQL-OPERATOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_operator", "CSQL-OPERATOR-TO-SQL-OPERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_operator_syntax_internal", "CSQL-OPERATOR-TO-SQL-OPERATOR-SYNTAX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_operator_syntax", "CSQL-OPERATOR-TO-SQL-OPERATOR-SYNTAX", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_prefix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-PREFIX-OPERATOR-SYNTAX?", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_infix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-INFIX-OPERATOR-SYNTAX?", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_postfix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-POSTFIX-OPERATOR-SYNTAX?", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_inverse_infix_operator_syntaxP", "CSQL-OPERATOR-TO-SQL-INVERSE-INFIX-OPERATOR-SYNTAX?", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_operator_to_sql_function_syntaxP", "CSQL-OPERATOR-TO-SQL-FUNCTION-SYNTAX?", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sql_translation_format_gaf_internal", "CSQL-TO-SQL-TRANSLATION-FORMAT-GAF-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "csql_to_sql_translation_format_gaf", "CSQL-TO-SQL-TRANSLATION-FORMAT-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_mapping_mt_p", "SKSI-MAPPING-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_genl_content_mts_for_sks", "GET-GENL-CONTENT-MTS-FOR-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_genl_content_mts_for_mt", "GET-GENL-CONTENT-MTS-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_content_mt_p", "SKSI-CONTENT-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_content_mts", "CLEAR-SKSI-CONTENT-MTS", 0, 0, false );
    new $clear_sksi_content_mts$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_sksi_content_mts", "REMOVE-SKSI-CONTENT-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_content_mts_internal", "SKSI-CONTENT-MTS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_content_mts", "SKSI-CONTENT-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "content_mt_nart_sk_source", "CONTENT-MT-NART-SK-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "content_mt_sk_source_in_any_mt", "CONTENT-MT-SK-SOURCE-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "content_mt_to_mapping_mt", "CONTENT-MT-TO-MAPPING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "complete_knowledge_sources", "COMPLETE-KNOWLEDGE-SOURCES", 0, 0, false );
    SubLFiles.declareFunction( me, "knowledge_source_representation_completeP", "KNOWLEDGE-SOURCE-REPRESENTATION-COMPLETE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_database_server_program_p_internal", "SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_database_server_program_p", "SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "default_sks_for_database_server_program", "DEFAULT-SKS-FOR-DATABASE-SERVER-PROGRAM", 1, 0, false );
    SubLFiles.declareFunction( me, "table_primary_key_column_indices", "TABLE-PRIMARY-KEY-COLUMN-INDICES", 2, 0, false );
    SubLFiles.declareFunction( me, "table_primary_key_column_names", "TABLE-PRIMARY-KEY-COLUMN-NAMES", 2, 0, false );
    SubLFiles.declareFunction( me, "table_primary_key_column_thingies", "TABLE-PRIMARY-KEY-COLUMN-THINGIES", 3, 0, false );
    SubLFiles.declareFunction( me, "table_primary_key_columns", "TABLE-PRIMARY-KEY-COLUMNS", 2, 0, false );
    SubLFiles.declareFunction( me, "table_in_db_named", "TABLE-IN-DB-NAMED", 2, 0, false );
    SubLFiles.declareFunction( me, "db_table_name", "DB-TABLE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_create", "SKSI-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_find", "SKSI-FIND", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_find_or_create", "SKSI-FIND-OR-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_kill", "SKSI-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_assert", "SKSI-ASSERT", 2, 2, false );
    SubLFiles.declareFunction( me, "sksi_unassert", "SKSI-UNASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_unassert_assertion", "SKSI-UNASSERT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_find_nart", "SKSI-FIND-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_assert_if_new", "SKSI-ASSERT-IF-NEW", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_edit_assertion", "SKSI-EDIT-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_repropagate_assertion", "SKSI-REPROPAGATE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_constant_get_kb_subset_cols", "SKSI-CONSTANT-GET-KB-SUBSET-COLS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_constant_assert_inherited_kb_subset_isas", "SKSI-CONSTANT-ASSERT-INHERITED-KB-SUBSET-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_temporal_field_null_maps_to", "SKSI-TEMPORAL-FIELD-NULL-MAPS-TO", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_kb_accessors_file()
  {
    $sksi_default_field_value$ = SubLFiles.deflexical( "*SKSI-DEFAULT-FIELD-VALUE*", $kw155$NULL );
    $sksi_content_mts_caching_state$ = SubLFiles.deflexical( "*SKSI-CONTENT-MTS-CACHING-STATE*", NIL );
    $use_legacy_simple_table_implementationP$ = SubLFiles.defparameter( "*USE-LEGACY-SIMPLE-TABLE-IMPLEMENTATION?*", NIL );
    return NIL;
  }

  public static SubLObject setup_sksi_kb_accessors_file()
  {
    memoization_state.note_memoized_function( $sym2$CONTENT_MT_SK_SOURCE );
    memoization_state.note_memoized_function( $sym5$SK_SOURCE_IN_ANY_MT_P );
    memoization_state.note_memoized_function( $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB );
    memoization_state.note_memoized_function( $sym11$SK_SOURCE_CONTENT_MT );
    memoization_state.note_memoized_function( $sym13$SK_SOURCE_CONTENT_MT_HEAD );
    memoization_state.note_memoized_function( $sym14$SK_SOURCE_MAPPING_MT );
    memoization_state.note_memoized_function( $sym22$SK_SOURCE_NAMESPACE );
    memoization_state.note_memoized_function( $sym25$SK_SOURCE_BY_SKS_NAME );
    memoization_state.note_memoized_function( $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB );
    memoization_state.note_memoized_function( $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB );
    memoization_state.note_memoized_function( $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB );
    memoization_state.note_memoized_function( $sym59$SK_SOURCE_PROPER_SUPER_KS_ );
    memoization_state.note_memoized_function( $sym60$IMMEDIATE_GENL_KS );
    memoization_state.note_memoized_function( $sym64$ISA_PHYSICAL_SCHEMA_ );
    memoization_state.note_memoized_function( $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED );
    memoization_state.note_memoized_function( $sym68$PHYSICAL_SCHEMA_FIELDS );
    memoization_state.note_memoized_function( $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY );
    memoization_state.note_memoized_function( $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT );
    memoization_state.note_memoized_function( $sym83$PHYSICAL_SCHEMA_ENUMERABLE_ );
    memoization_state.note_memoized_function( $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS );
    memoization_state.note_memoized_function( $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS );
    memoization_state.note_memoized_function( $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST );
    memoization_state.note_memoized_function( $sym95$LOGICAL_SCHEMA_FIELDS );
    memoization_state.note_memoized_function( $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS );
    memoization_state.note_memoized_function( $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS );
    memoization_state.note_memoized_function( $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS );
    memoization_state.note_memoized_function( $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED );
    memoization_state.note_memoized_function( $sym125$LOGICAL_FIELD_P_MEMOIZED );
    memoization_state.note_memoized_function( $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED );
    memoization_state.note_memoized_function( $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA );
    memoization_state.note_memoized_function( $sym133$ISA_LOGICAL_SCHEMA_ );
    memoization_state.note_memoized_function( $sym135$IS_FORT_A_REIFIED_MAPPING_ );
    memoization_state.note_memoized_function( $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA );
    memoization_state.note_memoized_function( $sym140$SCHEMA_ISA );
    memoization_state.note_memoized_function( $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT );
    memoization_state.note_memoized_function( $sym152$INDEXICAL_FOR_PHYSICAL_FIELD );
    memoization_state.note_memoized_function( $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS );
    memoization_state.note_memoized_function( $sym156$PHYSICAL_FIELD_DEFAULT_VALUE );
    memoization_state.note_memoized_function( $sym160$PHYSICAL_FIELD_SCHEMA );
    memoization_state.note_memoized_function( $sym81$PHYSICAL_FIELD_NAME );
    memoization_state.note_memoized_function( $sym161$PHYSICAL_FIELD_SK_SOURCE );
    memoization_state.note_memoized_function( $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME );
    memoization_state.note_memoized_function( $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE );
    memoization_state.note_memoized_function( $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE );
    memoization_state.note_memoized_function( $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME );
    memoization_state.note_memoized_function( $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE );
    memoization_state.note_memoized_function( $sym167$PHYSICAL_FIELD_VIRTUAL_ );
    memoization_state.note_memoized_function( $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME );
    memoization_state.note_memoized_function( $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES );
    memoization_state.note_memoized_function( $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD );
    memoization_state.note_memoized_function( $sym178$INTEGER_SEQUENCE_GENERATOR_NAME );
    memoization_state.note_memoized_function( $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_ );
    memoization_state.note_memoized_function( $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT );
    memoization_state.note_memoized_function( $sym185$INDEXICAL_FOR_LOGICAL_FIELD );
    memoization_state.note_memoized_function( $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE );
    memoization_state.note_memoized_function( $sym190$LOGICAL_FIELDS_JOINABLE_ );
    memoization_state.note_memoized_function( $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT );
    memoization_state.note_memoized_function( $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR );
    memoization_state.note_memoized_function( $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR );
    memoization_state.note_memoized_function( $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR );
    memoization_state.note_memoized_function( $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX );
    memoization_state.note_memoized_function( $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF );
    memoization_state.note_globally_cached_function( $sym220$SKSI_CONTENT_MTS );
    memoization_state.note_memoized_function( $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_kb_accessors_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_kb_accessors_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_kb_accessors_file();
  }
  static
  {
    me = new sksi_kb_accessors();
    $sksi_default_field_value$ = null;
    $sksi_content_mts_caching_state$ = null;
    $use_legacy_simple_table_implementationP$ = null;
    $const0$contentMt = constant_handles.reader_make_constant_shell( makeString( "contentMt" ) );
    $kw1$TRUE = makeKeyword( "TRUE" );
    $sym2$CONTENT_MT_SK_SOURCE = makeSymbol( "CONTENT-MT-SK-SOURCE" );
    $const3$mtSpindleMember = constant_handles.reader_make_constant_shell( makeString( "mtSpindleMember" ) );
    $const4$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource" ) );
    $sym5$SK_SOURCE_IN_ANY_MT_P = makeSymbol( "SK-SOURCE-IN-ANY-MT-P" );
    $const6$sksModifiable = constant_handles.reader_make_constant_shell( makeString( "sksModifiable" ) );
    $sym7$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const8$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const9$codeMapping = constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) );
    $sym10$GET_SK_SOURCE_PROPERTY_FROM_KB = makeSymbol( "GET-SK-SOURCE-PROPERTY-FROM-KB" );
    $sym11$SK_SOURCE_CONTENT_MT = makeSymbol( "SK-SOURCE-CONTENT-MT" );
    $const12$contentMtHead = constant_handles.reader_make_constant_shell( makeString( "contentMtHead" ) );
    $sym13$SK_SOURCE_CONTENT_MT_HEAD = makeSymbol( "SK-SOURCE-CONTENT-MT-HEAD" );
    $sym14$SK_SOURCE_MAPPING_MT = makeSymbol( "SK-SOURCE-MAPPING-MT" );
    $const15$mappingMt = constant_handles.reader_make_constant_shell( makeString( "mappingMt" ) );
    $const16$sksLogicalSchemaDescriptionMt = constant_handles.reader_make_constant_shell( makeString( "sksLogicalSchemaDescriptionMt" ) );
    $const17$sksSourceDescriptionMt = constant_handles.reader_make_constant_shell( makeString( "sksSourceDescriptionMt" ) );
    $const18$sksSchemaTranslationMt = constant_handles.reader_make_constant_shell( makeString( "sksSchemaTranslationMt" ) );
    $const19$rowCount_SKS = constant_handles.reader_make_constant_shell( makeString( "rowCount-SKS" ) );
    $const20$structuredKnowledgeSourceName = constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) );
    $sym21$_EXIT = makeSymbol( "%EXIT" );
    $sym22$SK_SOURCE_NAMESPACE = makeSymbol( "SK-SOURCE-NAMESPACE" );
    $str23$Multiple_namespaces_for__A___S__S = makeString( "Multiple namespaces for ~A: ~S ~S" );
    $const24$structuredKnowledgeSourceNamespac = constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceNamespace" ) );
    $sym25$SK_SOURCE_BY_SKS_NAME = makeSymbol( "SK-SOURCE-BY-SKS-NAME" );
    $sym26$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw27$GAF = makeKeyword( "GAF" );
    $const28$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell( makeString( "physicalSchemaSourceMap" ) );
    $sym29$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $sym30$KBEQ = makeSymbol( "KBEQ" );
    $const31$subKS_Direct = constant_handles.reader_make_constant_shell( makeString( "subKS-Direct" ) );
    $const32$meaningSentencePredicateForSource = constant_handles.reader_make_constant_shell( makeString( "meaningSentencePredicateForSource" ) );
    $const33$meaningSentencePredicateForSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentencePredicateForSchema" ) );
    $sym34$GET_SKS_SINGLE_LITERAL_LOOKUP_DIRECTION_FROM_KB = makeSymbol( "GET-SKS-SINGLE-LITERAL-LOOKUP-DIRECTION-FROM-KB" );
    $const35$SKSISingleLiteralRemovalModule = constant_handles.reader_make_constant_shell( makeString( "SKSISingleLiteralRemovalModule" ) );
    $kw36$BACKWARD = makeKeyword( "BACKWARD" );
    $sym37$GET_SKS_MULTI_LITERAL_LOOKUP_DIRECTION_FROM_KB = makeSymbol( "GET-SKS-MULTI-LITERAL-LOOKUP-DIRECTION-FROM-KB" );
    $const38$SKSIMultiLiteralRemovalModule = constant_handles.reader_make_constant_shell( makeString( "SKSIMultiLiteralRemovalModule" ) );
    $sym39$GET_SKS_STORAGE_DIRECTION_FROM_KB = makeSymbol( "GET-SKS-STORAGE-DIRECTION-FROM-KB" );
    $const40$SKSIStorageModule = constant_handles.reader_make_constant_shell( makeString( "SKSIStorageModule" ) );
    $kw41$FORWARD = makeKeyword( "FORWARD" );
    $const42$sksModuleTypeDirection = constant_handles.reader_make_constant_shell( makeString( "sksModuleTypeDirection" ) );
    $const43$Backward_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Backward-AssertionDirection" ) );
    $const44$Forward_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Forward-AssertionDirection" ) );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUB-KS" ), makeSymbol( "SK-SOURCE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list46 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw47$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw48$DONE = makeKeyword( "DONE" );
    $sym49$GAF = makeUninternedSymbol( "GAF" );
    $sym50$SKSI_DO_GAF_ARG_INDEX_TRUE = makeSymbol( "SKSI-DO-GAF-ARG-INDEX-TRUE" );
    $kw51$PREDICATE = makeKeyword( "PREDICATE" );
    $kw52$INDEX = makeKeyword( "INDEX" );
    $sym53$CLET = makeSymbol( "CLET" );
    $sym54$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $sym55$SK_SOURCE_SUB_KS_CLOSURE = makeSymbol( "SK-SOURCE-SUB-KS-CLOSURE" );
    $sym56$SK_SOURCE_SUB_KS_MIN = makeSymbol( "SK-SOURCE-SUB-KS-MIN" );
    $sym57$SK_SOURCE_SUPER_KS_CLOSURE = makeSymbol( "SK-SOURCE-SUPER-KS-CLOSURE" );
    $sym58$SK_SOURCE_SUPER_KS_MAX = makeSymbol( "SK-SOURCE-SUPER-KS-MAX" );
    $sym59$SK_SOURCE_PROPER_SUPER_KS_ = makeSymbol( "SK-SOURCE-PROPER-SUPER-KS?" );
    $sym60$IMMEDIATE_GENL_KS = makeSymbol( "IMMEDIATE-GENL-KS" );
    $sym61$LOGICAL_SCHEMA_SOURCES = makeSymbol( "LOGICAL-SCHEMA-SOURCES" );
    $sym62$SINGLETON_ = makeSymbol( "SINGLETON?" );
    $const63$schemaRepresentationComplete = constant_handles.reader_make_constant_shell( makeString( "schemaRepresentationComplete" ) );
    $sym64$ISA_PHYSICAL_SCHEMA_ = makeSymbol( "ISA-PHYSICAL-SCHEMA?" );
    $const65$PhysicalSchema = constant_handles.reader_make_constant_shell( makeString( "PhysicalSchema" ) );
    $int66$50 = makeInteger( 50 );
    $sym67$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED = makeSymbol( "PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED" );
    $sym68$PHYSICAL_SCHEMA_FIELDS = makeSymbol( "PHYSICAL-SCHEMA-FIELDS" );
    $const69$physicalFields = constant_handles.reader_make_constant_shell( makeString( "physicalFields" ) );
    $sym70$PHYSICAL_SCHEMA_PRIMARY_KEY = makeSymbol( "PHYSICAL-SCHEMA-PRIMARY-KEY" );
    $const71$primaryKey = constant_handles.reader_make_constant_shell( makeString( "primaryKey" ) );
    $sym72$PHYSICAL_SCHEMA_PRIMARY_KEY_COMPENSATE_FOR_TABLE_COLUMN_REPRESENT = makeSymbol( "PHYSICAL-SCHEMA-PRIMARY-KEY-COMPENSATE-FOR-TABLE-COLUMN-REPRESENTATION" );
    $const73$suppressConvertingComparisonLiter = constant_handles.reader_make_constant_shell( makeString( "suppressConvertingComparisonLiteralsToSQL" ) );
    $const74$foreignKeyMap = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap" ) );
    $const75$foreignKeyMap_Restrict = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-Restrict" ) );
    $const76$foreignKeyMap_Cascade = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-Cascade" ) );
    $const77$foreignKeyMap_SetNull = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-SetNull" ) );
    $const78$foreignKeyMap_SetDefault = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-SetDefault" ) );
    $const79$uniqueFieldList = constant_handles.reader_make_constant_shell( makeString( "uniqueFieldList" ) );
    $const80$requiredFields = constant_handles.reader_make_constant_shell( makeString( "requiredFields" ) );
    $sym81$PHYSICAL_FIELD_NAME = makeSymbol( "PHYSICAL-FIELD-NAME" );
    $const82$indexedFields = constant_handles.reader_make_constant_shell( makeString( "indexedFields" ) );
    $sym83$PHYSICAL_SCHEMA_ENUMERABLE_ = makeSymbol( "PHYSICAL-SCHEMA-ENUMERABLE?" );
    $const84$enumerableSchema = constant_handles.reader_make_constant_shell( makeString( "enumerableSchema" ) );
    $sym85$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS = makeSymbol( "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS" );
    $const86$resultSetCardinality = constant_handles.reader_make_constant_shell( makeString( "resultSetCardinality" ) );
    $sym87$PHYSICAL_SCHEMA_RESULT_SET_CARDINALITY_W_CONSTRAINTS_GAFS = makeSymbol( "PHYSICAL-SCHEMA-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAFS" );
    $const88$resultSetCardinalityWithConstrain = constant_handles.reader_make_constant_shell( makeString( "resultSetCardinalityWithConstraints" ) );
    $const89$logicalPhysicalSchemaMap = constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalSchemaMap" ) );
    $const90$exampleTuple = constant_handles.reader_make_constant_shell( makeString( "exampleTuple" ) );
    $const91$fieldEncoding = constant_handles.reader_make_constant_shell( makeString( "fieldEncoding" ) );
    $sym92$PHYSICAL_SCHEMA_ORDERED_FIELD_LIST = makeSymbol( "PHYSICAL-SCHEMA-ORDERED-FIELD-LIST" );
    $const93$schemaFieldNameList = constant_handles.reader_make_constant_shell( makeString( "schemaFieldNameList" ) );
    $sym94$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA = makeSymbol( "LOGICAL-SCHEMA-PHYSICAL-SCHEMATA" );
    $sym95$LOGICAL_SCHEMA_FIELDS = makeSymbol( "LOGICAL-SCHEMA-FIELDS" );
    $const96$logicalFields = constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) );
    $sym97$LOGICAL_SCHEMA_FIELD_INDEXICALS = makeSymbol( "LOGICAL-SCHEMA-FIELD-INDEXICALS" );
    $const98$logicalFieldIndexicals = constant_handles.reader_make_constant_shell( makeString( "logicalFieldIndexicals" ) );
    $kw99$DEPTH = makeKeyword( "DEPTH" );
    $kw100$STACK = makeKeyword( "STACK" );
    $kw101$QUEUE = makeKeyword( "QUEUE" );
    $sym102$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw103$ERROR = makeKeyword( "ERROR" );
    $str104$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym105$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw106$CERROR = makeKeyword( "CERROR" );
    $str107$continue_anyway = makeString( "continue anyway" );
    $kw108$WARN = makeKeyword( "WARN" );
    $str109$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const110$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str111$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str112$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str113$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const114$schemaExampleSentence = constant_handles.reader_make_constant_shell( makeString( "schemaExampleSentence" ) );
    $const115$logicalSchemaKeys = constant_handles.reader_make_constant_shell( makeString( "logicalSchemaKeys" ) );
    $sym116$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_GAFS = makeSymbol( "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-GAFS" );
    $const117$logicalResultSetCardinality = constant_handles.reader_make_constant_shell( makeString( "logicalResultSetCardinality" ) );
    $sym118$LOGICAL_SCHEMA_RESULT_SET_CARDINALITY_WRT_VALUE_GAFS = makeSymbol( "LOGICAL-SCHEMA-RESULT-SET-CARDINALITY-WRT-VALUE-GAFS" );
    $const119$logicalResultSetCardinalityWRTVal = constant_handles.reader_make_constant_shell( makeString( "logicalResultSetCardinalityWRTValue" ) );
    $const120$fieldDecoding = constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) );
    $const121$logicalSchemaSourceMap = constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) );
    $sym122$LOGICAL_SCHEMA_SK_SOURCES_MEMOIZED = makeSymbol( "LOGICAL-SCHEMA-SK-SOURCES-MEMOIZED" );
    $const123$schemaCompleteExtentKnown = constant_handles.reader_make_constant_shell( makeString( "schemaCompleteExtentKnown" ) );
    $const124$contentSentenceOfSchema = constant_handles.reader_make_constant_shell( makeString( "contentSentenceOfSchema" ) );
    $sym125$LOGICAL_FIELD_P_MEMOIZED = makeSymbol( "LOGICAL-FIELD-P-MEMOIZED" );
    $const126$LogicalFieldFn = constant_handles.reader_make_constant_shell( makeString( "LogicalFieldFn" ) );
    $const127$LogicalField = constant_handles.reader_make_constant_shell( makeString( "LogicalField" ) );
    $const128$LFAliasFn = constant_handles.reader_make_constant_shell( makeString( "LFAliasFn" ) );
    $sym129$LOGICAL_FIELD_INDEXICAL_P_MEMOIZED = makeSymbol( "LOGICAL-FIELD-INDEXICAL-P-MEMOIZED" );
    $const130$TheLogicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "TheLogicalFieldValueFn" ) );
    $const131$LFIAliasFn = constant_handles.reader_make_constant_shell( makeString( "LFIAliasFn" ) );
    $sym132$LOGICAL_FIELD_INDEXICAL_FORT_FOR_SCHEMA = makeSymbol( "LOGICAL-FIELD-INDEXICAL-FORT-FOR-SCHEMA" );
    $sym133$ISA_LOGICAL_SCHEMA_ = makeSymbol( "ISA-LOGICAL-SCHEMA?" );
    $const134$LogicalSchema = constant_handles.reader_make_constant_shell( makeString( "LogicalSchema" ) );
    $sym135$IS_FORT_A_REIFIED_MAPPING_ = makeSymbol( "IS-FORT-A-REIFIED-MAPPING?" );
    $const136$ReifiedMapping = constant_handles.reader_make_constant_shell( makeString( "ReifiedMapping" ) );
    $sym137$CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMA = makeSymbol( "CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMA" );
    $list138 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ) );
    $const139$SchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) );
    $sym140$SCHEMA_ISA = makeSymbol( "SCHEMA-ISA" );
    $const141$schemaIsa = constant_handles.reader_make_constant_shell( makeString( "schemaIsa" ) );
    $const142$objectField = constant_handles.reader_make_constant_shell( makeString( "objectField" ) );
    $const143$SchemaObjectIDFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) );
    $const144$SourceSchemaObjectIDFn = constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectIDFn" ) );
    $const145$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "ODS" ), makeSymbol( "SUB-EXPRESSION" ) ), makeSymbol( "EXPRESSION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym147$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym148$FORMULA_ARGS = makeSymbol( "FORMULA-ARGS" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "SKS" ), makeSymbol( "ODS" ), makeSymbol( "SUB-EXPRESSION" ) ), makeSymbol( "EXPRESSION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym150$PHYSICAL_FIELD_FOR_INDEXICAL_FORT = makeSymbol( "PHYSICAL-FIELD-FOR-INDEXICAL-FORT" );
    $const151$indexicalForPhysicalField = constant_handles.reader_make_constant_shell( makeString( "indexicalForPhysicalField" ) );
    $sym152$INDEXICAL_FOR_PHYSICAL_FIELD = makeSymbol( "INDEXICAL-FOR-PHYSICAL-FIELD" );
    $const153$nonNullFields = constant_handles.reader_make_constant_shell( makeString( "nonNullFields" ) );
    $sym154$NOT_NULL_PHYSICAL_FIELDS_FOR_PS = makeSymbol( "NOT-NULL-PHYSICAL-FIELDS-FOR-PS" );
    $kw155$NULL = makeKeyword( "NULL" );
    $sym156$PHYSICAL_FIELD_DEFAULT_VALUE = makeSymbol( "PHYSICAL-FIELD-DEFAULT-VALUE" );
    $const157$defaultFieldValue = constant_handles.reader_make_constant_shell( makeString( "defaultFieldValue" ) );
    $const158$ISNull = constant_handles.reader_make_constant_shell( makeString( "ISNull" ) );
    $const159$PhysicalFieldFn = constant_handles.reader_make_constant_shell( makeString( "PhysicalFieldFn" ) );
    $sym160$PHYSICAL_FIELD_SCHEMA = makeSymbol( "PHYSICAL-FIELD-SCHEMA" );
    $sym161$PHYSICAL_FIELD_SK_SOURCE = makeSymbol( "PHYSICAL-FIELD-SK-SOURCE" );
    $sym162$PHYSICAL_FIELD_SK_SOURCE_NAME = makeSymbol( "PHYSICAL-FIELD-SK-SOURCE-NAME" );
    $sym163$PHYSICAL_FIELD_SK_SOURCE_NAMESPACE = makeSymbol( "PHYSICAL-FIELD-SK-SOURCE-NAMESPACE" );
    $sym164$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE" );
    $sym165$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAME = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAME" );
    $sym166$PHYSICAL_FIELD_INDEXICAL_SK_SOURCE_NAMESPACE = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-SK-SOURCE-NAMESPACE" );
    $sym167$PHYSICAL_FIELD_VIRTUAL_ = makeSymbol( "PHYSICAL-FIELD-VIRTUAL?" );
    $const168$VirtualPhysicalFieldFn = constant_handles.reader_make_constant_shell( makeString( "VirtualPhysicalFieldFn" ) );
    $const169$virtualPhysicalFields = constant_handles.reader_make_constant_shell( makeString( "virtualPhysicalFields" ) );
    $const170$PFAliasFn = constant_handles.reader_make_constant_shell( makeString( "PFAliasFn" ) );
    $const171$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "ThePhysicalFieldValueFn" ) );
    $const172$PFIAliasFn = constant_handles.reader_make_constant_shell( makeString( "PFIAliasFn" ) );
    $sym173$PHYSICAL_SCHEMA_FOR_SKS_NAME = makeSymbol( "PHYSICAL-SCHEMA-FOR-SKS-NAME" );
    $sym174$PHYSICAL_FIELD_INDEXICAL_FOR_SKS_AND_FIELD_NAMES = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-FOR-SKS-AND-FIELD-NAMES" );
    $sym175$THIRD = makeSymbol( "THIRD" );
    $sym176$INTEGER_SEQUENCE_GENERATOR_FOR_PHYSICAL_FIELD = makeSymbol( "INTEGER-SEQUENCE-GENERATOR-FOR-PHYSICAL-FIELD" );
    $const177$integerSequenceGeneratorIncrement = constant_handles.reader_make_constant_shell( makeString( "integerSequenceGeneratorIncrementsField" ) );
    $sym178$INTEGER_SEQUENCE_GENERATOR_NAME = makeSymbol( "INTEGER-SEQUENCE-GENERATOR-NAME" );
    $const179$integerSequenceGeneratorName = constant_handles.reader_make_constant_shell( makeString( "integerSequenceGeneratorName" ) );
    $sym180$PHYSICAL_FIELD_VALUE_IS_AUTO_INCREMENTED_ = makeSymbol( "PHYSICAL-FIELD-VALUE-IS-AUTO-INCREMENTED?" );
    $const181$TheNextSequenceValueFn = constant_handles.reader_make_constant_shell( makeString( "TheNextSequenceValueFn" ) );
    $str182$logical_field_indexical_without_c = makeString( "logical field indexical without corresponding logical field: ~s" );
    $sym183$LOGICAL_FIELD_FOR_INDEXICAL_FORT = makeSymbol( "LOGICAL-FIELD-FOR-INDEXICAL-FORT" );
    $const184$indexicalForLogicalField = constant_handles.reader_make_constant_shell( makeString( "indexicalForLogicalField" ) );
    $sym185$INDEXICAL_FOR_LOGICAL_FIELD = makeSymbol( "INDEXICAL-FOR-LOGICAL-FIELD" );
    $sym186$LOGICAL_FIELD_FOR_INDEXICAL = makeSymbol( "LOGICAL-FIELD-FOR-INDEXICAL" );
    $sym187$LOGICAL_FIELD_INDEXICAL_SK_SOURCE = makeSymbol( "LOGICAL-FIELD-INDEXICAL-SK-SOURCE" );
    $sym188$RELEVANT_PRED_IS_EQ = makeSymbol( "RELEVANT-PRED-IS-EQ" );
    $const189$joinable = constant_handles.reader_make_constant_shell( makeString( "joinable" ) );
    $sym190$LOGICAL_FIELDS_JOINABLE_ = makeSymbol( "LOGICAL-FIELDS-JOINABLE?" );
    $const191$fieldIsa = constant_handles.reader_make_constant_shell( makeString( "fieldIsa" ) );
    $const192$logicalSchemaFieldTypeList = constant_handles.reader_make_constant_shell( makeString( "logicalSchemaFieldTypeList" ) );
    $const193$logicalFieldMapping = constant_handles.reader_make_constant_shell( makeString( "logicalFieldMapping" ) );
    $sym194$SKSI_GET_MAPPED_PHYSICAL_FIELDS_FOR_LOGICAL_FIELD_INT = makeSymbol( "SKSI-GET-MAPPED-PHYSICAL-FIELDS-FOR-LOGICAL-FIELD-INT" );
    $const195$logicalPhysicalFieldMap = constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalFieldMap" ) );
    $const196$logicalPhysicalFieldMap_DecodeClo = constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalFieldMap-DecodeClosed" ) );
    $const197$logicalPhysicalFieldMap_EncodeClo = constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalFieldMap-EncodeClosed" ) );
    $const198$fieldDataType = constant_handles.reader_make_constant_shell( makeString( "fieldDataType" ) );
    $const199$SQLBoolean = constant_handles.reader_make_constant_shell( makeString( "SQLBoolean" ) );
    $const200$programDataTypeNameString = constant_handles.reader_make_constant_shell( makeString( "programDataTypeNameString" ) );
    $const201$schemaFieldsIndex = constant_handles.reader_make_constant_shell( makeString( "schemaFieldsIndex" ) );
    $const202$indexType = constant_handles.reader_make_constant_shell( makeString( "indexType" ) );
    $const203$indexName = constant_handles.reader_make_constant_shell( makeString( "indexName" ) );
    $const204$programIndexTypeNameString = constant_handles.reader_make_constant_shell( makeString( "programIndexTypeNameString" ) );
    $sym205$CYCL_OPERATOR_TO_CSQL_OPERATOR = makeSymbol( "CYCL-OPERATOR-TO-CSQL-OPERATOR" );
    $const206$cyclOperatorToCSQLOperator = constant_handles.reader_make_constant_shell( makeString( "cyclOperatorToCSQLOperator" ) );
    $sym207$CSQL_OPERATOR_TO_CYCL_OPERATOR = makeSymbol( "CSQL-OPERATOR-TO-CYCL-OPERATOR" );
    $sym208$CSQL_OPERATOR_TO_SQL_OPERATOR = makeSymbol( "CSQL-OPERATOR-TO-SQL-OPERATOR" );
    $const209$csqlOperatorToSQLOperator = constant_handles.reader_make_constant_shell( makeString( "csqlOperatorToSQLOperator" ) );
    $sym210$CSQL_OPERATOR_TO_SQL_OPERATOR_SYNTAX = makeSymbol( "CSQL-OPERATOR-TO-SQL-OPERATOR-SYNTAX" );
    $const211$SQLOperatorSyntax_Prefix = constant_handles.reader_make_constant_shell( makeString( "SQLOperatorSyntax-Prefix" ) );
    $const212$SQLOperatorSyntax_Infix = constant_handles.reader_make_constant_shell( makeString( "SQLOperatorSyntax-Infix" ) );
    $const213$SQLOperatorSyntax_Postfix = constant_handles.reader_make_constant_shell( makeString( "SQLOperatorSyntax-Postfix" ) );
    $const214$SQLOperatorSyntax_InverseInfix = constant_handles.reader_make_constant_shell( makeString( "SQLOperatorSyntax-InverseInfix" ) );
    $const215$SQLFunctionSyntax = constant_handles.reader_make_constant_shell( makeString( "SQLFunctionSyntax" ) );
    $sym216$CSQL_TO_SQL_TRANSLATION_FORMAT_GAF = makeSymbol( "CSQL-TO-SQL-TRANSLATION-FORMAT-GAF" );
    $const217$csqlToSQLTranslationFormat = constant_handles.reader_make_constant_shell( makeString( "csqlToSQLTranslationFormat" ) );
    $const218$SKSIMappingMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SKSIMappingMicrotheory" ) );
    $sym219$SKSI_CONTENT_MT_P = makeSymbol( "SKSI-CONTENT-MT-P" );
    $sym220$SKSI_CONTENT_MTS = makeSymbol( "SKSI-CONTENT-MTS" );
    $const221$SKSIContentMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SKSIContentMicrotheory" ) );
    $sym222$_SKSI_CONTENT_MTS_CACHING_STATE_ = makeSymbol( "*SKSI-CONTENT-MTS-CACHING-STATE*" );
    $sym223$CLEAR_SKSI_CONTENT_MTS = makeSymbol( "CLEAR-SKSI-CONTENT-MTS" );
    $const224$sksRepresentationComplete = constant_handles.reader_make_constant_shell( makeString( "sksRepresentationComplete" ) );
    $sym225$SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P = makeSymbol( "SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P" );
    $const226$SKSISupportedDatabaseServerProgra = constant_handles.reader_make_constant_shell( makeString( "SKSISupportedDatabaseServerProgram" ) );
    $const227$defaultSKSForDatabaseServerProgra = constant_handles.reader_make_constant_shell( makeString( "defaultSKSForDatabaseServerProgram" ) );
    $str228$Primary_keys_for__S_in__S_were_no = makeString( "Primary keys for ~S in ~S were not found" );
    $str229$Primary_keys_for__S_in__S_was_not = makeString( "Primary keys for ~S in ~S was not an EL list: ~S" );
    $kw230$IGNORE = makeKeyword( "IGNORE" );
    $const231$columnInDBTableNamed = constant_handles.reader_make_constant_shell( makeString( "columnInDBTableNamed" ) );
    $const232$fieldName_SKS = constant_handles.reader_make_constant_shell( makeString( "fieldName-SKS" ) );
    $str233$Could_not_determine_the_column_na = makeString( "Could not determine the column name (via ~A) for ~a in ~a" );
    $str234$Could_not_find_the_primary_key_co = makeString( "Could not find the primary key column ~a in the ~A ~a for ~a in ~a" );
    $const235$tableFieldNameList = constant_handles.reader_make_constant_shell( makeString( "tableFieldNameList" ) );
    $const236$tablePrimaryKey = constant_handles.reader_make_constant_shell( makeString( "tablePrimaryKey" ) );
    $str237$Could_not_get_the___tableFieldNam = makeString( "Could not get the #$tableFieldNameList for ~a in ~a" );
    $str238$Could_not_determine_the___tablePr = makeString( "Could not determine the #$tablePrimaryKey for ~a in ~a" );
    $sym239$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $str240$Could_not_find_a_physical_schema_ = makeString( "Could not find a physical schema for table ~A in ~A" );
    $str241$Could_not_get_the___schemaFieldNa = makeString( "Could not get the #$schemaFieldNameList for ~a in ~a" );
    $str242$Could_not_determine_the___primary = makeString( "Could not determine the #$primaryKey for ~a in ~a" );
    $kw243$TABLE = makeKeyword( "TABLE" );
    $const244$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $const245$tableInDBNamed = constant_handles.reader_make_constant_shell( makeString( "tableInDBNamed" ) );
    $kw246$TABLE_NAME = makeKeyword( "TABLE-NAME" );
    $list247 = ConsesLow.list( makeKeyword( "TABLE-NAME" ) );
    $sym248$NON_EMPTY_STRING_ = makeSymbol( "NON-EMPTY-STRING?" );
    $str249$_A___A = makeString( "~A: ~A" );
    $sym250$FORT_P = makeSymbol( "FORT-P" );
    $kw251$DEFAULT = makeKeyword( "DEFAULT" );
    $sym252$HLMT_P = makeSymbol( "HLMT-P" );
    $list253 = ConsesLow.list( makeSymbol( "ERROR-TYPE" ), makeSymbol( "ERROR-STRING" ) );
    $str254$_ = makeString( " " );
    $sym255$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $const256$CycKBSubsetCollection = constant_handles.reader_make_constant_shell( makeString( "CycKBSubsetCollection" ) );
    $const257$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $str258$No___CycKBSubsetCollections_found = makeString( "No #$CycKBSubsetCollections found to inherit from ~A to ~A~%" );
    $const259$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const260$temporalFieldNullMapsTo = constant_handles.reader_make_constant_shell( makeString( "temporalFieldNullMapsTo" ) );
    $kw261$UNREFORMULATABLE = makeKeyword( "UNREFORMULATABLE" );
  }

  public static final class $logical_field_indexical_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $logical_field_indexical_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LOGICAL-FIELD-INDEXICAL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return logical_field_indexical_p( arg1 );
    }
  }

  public static final class $physical_field_indexical_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $physical_field_indexical_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PHYSICAL-FIELD-INDEXICAL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return physical_field_indexical_p( arg1 );
    }
  }

  public static final class $clear_sksi_content_mts$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_sksi_content_mts$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-SKSI-CONTENT-MTS" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_sksi_content_mts();
    }
  }
}
/*
 * 
 * Total time: 1908 ms
 * 
 */