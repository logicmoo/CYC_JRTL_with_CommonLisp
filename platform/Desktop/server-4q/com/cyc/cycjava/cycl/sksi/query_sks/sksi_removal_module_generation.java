package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_removal_module_generation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation";
    public static final String myFingerPrint = "d7df1b2b65f88671a48232343ff9ee0d42518ebdbc2367b0e76d645e16f50a04";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 3180L)
    private static SubLSymbol $sksi_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 3595L)
    public static SubLSymbol $sksi_browsing_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5346L)
    private static SubLSymbol $sksi_module_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5953L)
    private static SubLSymbol $sksi_module_simple_required_pattern$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 6716L)
    private static SubLSymbol $sks_multiply_indexed_conditional_meaning_sentence_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 8423L)
    private static SubLSymbol $sksi_module_multiply_indexed_conditional_meaning_sentence_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 9600L)
    private static SubLSymbol $sksi_modules_by_sks$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 10817L)
    private static SubLSymbol $sksi_code_mapping_sks_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 14645L)
    private static SubLSymbol $isa_sks_term_to_cycl_term_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 15582L)
    private static SubLSymbol $isa_sks_term_to_cycl_term_store$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 22117L)
    private static SubLSymbol $filtered_sksi_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 22621L)
    private static SubLSymbol $meaning_sentence_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 23493L)
    private static SubLSymbol $meaning_sentence_pred_store$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 33495L)
    private static SubLSymbol $sks_preference_modules_count$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 33733L)
    private static SubLSymbol $sks_prune_modules_count$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 41057L)
    private static SubLSymbol $sksi_specific_module_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 78621L)
    private static SubLSymbol $generate_sksi_slrm_required_function_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 79133L)
    private static SubLSymbol $sksi_default_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119005L)
    private static SubLSymbol $virtual_assertion_count$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119795L)
    private static SubLSymbol $mt_virtual_assertion_count_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 120849L)
    private static SubLSymbol $sksi_module_code_mapping_terms_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 121752L)
    private static SubLSymbol $sksi_module_logical_schemas_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124789L)
    private static SubLSymbol $sksi_supported_gaf_argument_browsing_max_term_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124877L)
    private static SubLSymbol $show_sksi_supported_gaf_argument_browsing_skipsP$;
    private static final SubLSymbol $sym0$_SKSI_MODULES_;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$DO_SET;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CDOLIST;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$_SKSI_MODULE_SUPPORTS_;
    private static final SubLSymbol $sym7$_SKSI_MODULE_SIMPLE_REQUIRED_PATTERN_;
    private static final SubLSymbol $sym8$_SKS_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_;
    private static final SubLSymbol $sym9$_SKSI_MODULE_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_;
    private static final SubLSymbol $sym10$_SKSI_MODULES_BY_SKS_;
    private static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const12$EverythingPSC;
    private static final SubLSymbol $sym13$_SKSI_CODE_MAPPING_SKS_CACHE_;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$TUPLE;
    private static final SubLSymbol $sym16$TUPLES;
    private static final SubLSymbol $sym17$DO_DICTIONARY;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym20$CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE;
    private static final SubLObject $const21$codeMapping;
    private static final SubLSymbol $kw22$NEG;
    private static final SubLObject $const23$SKSIMt;
    private static final SubLSymbol $kw24$FORWARD;
    private static final SubLSymbol $kw25$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym26$IGNORE_ERRORS_HANDLER;
    private static final SubLObject $const27$isa;
    private static final SubLSymbol $sym28$_ISA_SKS_TERM_TO_CYCL_TERM_MTS_;
    private static final SubLSymbol $sym29$HLMT_EQUAL;
    private static final SubLSymbol $sym30$_ISA_SKS_TERM_TO_CYCL_TERM_STORE_;
    private static final SubLSymbol $sym31$ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT;
    private static final SubLSymbol $sym32$ALL_SKSI_RELEVANT_REWRITE_ISAS_INT;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$_MEANING_SENTENCE_MTS_;
    private static final SubLSymbol $sym36$_MEANING_SENTENCE_PRED_STORE_;
    private static final SubLSymbol $sym37$ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT;
    private static final SubLSymbol $sym38$ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT;
    private static final SubLSymbol $sym39$CODE_MAPPING_KNOWLEDGE_SOURCE_;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$MODULE_SUPPORTS;
    private static final SubLSymbol $kw42$SIMPLE_REQUIRED_PATTERN;
    private static final SubLSymbol $kw43$MEANING_SENTENCE;
    private static final SubLSymbol $kw44$MULTIPLY_INDEXED_CMS;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLString $str47$_S_was_not_a_valid_module_paramet;
    private static final SubLSymbol $kw48$MODULE_NAME;
    private static final SubLSymbol $kw49$DOCUMENTATION;
    private static final SubLSymbol $kw50$SENSE;
    private static final SubLString $str51$sksi_;
    private static final SubLSymbol $sym52$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str53$Invalid_predicate_for_meaning_sen;
    private static final SubLString $str54$complex_non_atomic_meaning_senten;
    private static final SubLSymbol $sym55$LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLString $str56$No_logical_field_indexicals_for_m;
    private static final SubLString $str57$The_following_conditional_meaning;
    private static final SubLString $str58$Invalid_consequent_predicate_for_;
    private static final SubLSymbol $sym59$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED;
    private static final SubLSymbol $sym60$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA;
    private static final SubLSymbol $kw61$OUTPUT_GENERATE_PATTERN;
    private static final SubLSymbol $kw62$OUTPUT_CHECK_PATTERN;
    private static final SubLSymbol $kw63$REQUIRED_MT;
    private static final SubLSymbol $kw64$SUPPORT_MT;
    private static final SubLString $str65$No__output_generate_pattern_or__o;
    private static final SubLSymbol $sym66$CSQL_FROM_CLAUSE_P;
    private static final SubLSymbol $sym67$CSQL_WHERE_CLAUSE_P;
    private static final SubLSymbol $kw68$WHERE;
    private static final SubLSymbol $sym69$CSQL_SELECT_QUERY_P;
    private static final SubLSymbol $sym70$SKSI_GET_ANY_PREDICATES_PATTERN;
    private static final SubLObject $const71$SchemaObjectFn;
    private static final SubLList $list72;
    private static final SubLObject $const73$SourceSchemaObjectFn;
    private static final SubLSymbol $sym74$LFI_ALIAS_FN_NAUT_P;
    private static final SubLSymbol $sym75$LOGICAL_FIELD_INDEXICAL_FORT_P;
    private static final SubLSymbol $kw76$FULLY_BOUND;
    private static final SubLObject $const77$evaluate;
    private static final SubLSymbol $sym78$NON_LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $kw79$IGNORE;
    private static final SubLObject $const80$sksiModulesDoomedUnlessArgBound;
    private static final SubLSymbol $kw81$NOT_FULLY_BOUND;
    private static final SubLSymbol $sym82$PHYSICAL_SCHEMA_ENUMERABLE_;
    private static final SubLList $list83;
    private static final SubLSymbol $kw84$POS;
    private static final SubLList $list85;
    private static final SubLString $str86$Could_not_constrain_the__not_full;
    private static final SubLSymbol $kw87$DISALLOWED;
    private static final SubLSymbol $kw88$INPUT_TERMNUMS;
    private static final SubLSymbol $kw89$OUTPUT_TERMNUMS;
    private static final SubLSymbol $kw90$PREDICATE;
    private static final SubLSymbol $kw91$ANY_PREDICATES;
    private static final SubLSymbol $kw92$REQUIRED_PATTERN;
    private static final SubLSymbol $sym93$FIRST;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$CAR;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$NART_P;
    private static final SubLSymbol $sym99$MAKE_NAT_SUBPATTERN;
    private static final SubLSymbol $kw100$NAT;
    private static final SubLSymbol $kw101$OR;
    private static final SubLList $list102;
    private static final SubLSymbol $kw103$UNIFY;
    private static final SubLSymbol $sym104$NAUT_;
    private static final SubLSymbol $sym105$MAKE_UNIFY_SUBPATTERN;
    private static final SubLSymbol $sym106$NON_SENTENTIAL_RELATION_FORT_P;
    private static final SubLSymbol $sym107$NAT_SUBPATTERN_P;
    private static final SubLSymbol $sym108$MAKE_DISJUNCTIVE_SUBPATTERN;
    private static final SubLObject $const109$SententialRelation;
    private static final SubLSymbol $sym110$UNIFY_SUBPATTERN_P;
    private static final SubLSymbol $sym111$SECOND;
    private static final SubLSymbol $sym112$DISJUNCTIVE_SUBPATTERN_P;
    private static final SubLSymbol $sym113$NARTIFY_NAT_PATTERN;
    private static final SubLSymbol $kw114$ANYTHING;
    private static final SubLSymbol $sym115$GENERATE_SKSI_SLRM_REQUIRED_FUNCTION;
    private static final SubLSymbol $sym116$DEFINE_PRIVATE;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$RET;
    private static final SubLSymbol $sym120$EXTERNAL_SOURCE_ACTIVATED_IN_IMAGE_;
    private static final SubLSymbol $sym121$_GENERATE_SKSI_SLRM_REQUIRED_FUNCTION_CACHING_STATE_;
    private static final SubLString $str122$_REQUIRED_FUNC;
    private static final SubLSymbol $sym123$SKSI_ONLY_PREDICATE_;
    private static final SubLObject $const124$SKSIOnlyPredicate;
    private static final SubLInteger $int125$1024;
    private static final SubLSymbol $kw126$SKSI;
    private static final SubLSymbol $kw127$DEFAULT;
    private static final SubLSymbol $kw128$DISPREFERRED;
    private static final SubLString $str129$_prune_unreformulatable;
    private static final SubLSymbol $kw130$AND;
    private static final SubLSymbol $kw131$MODULE_TYPE;
    private static final SubLSymbol $kw132$REMOVAL;
    private static final SubLSymbol $kw133$MODULE_SUBTYPE;
    private static final SubLList $list134;
    private static final SubLSymbol $kw135$MODULE_SOURCE;
    private static final SubLSymbol $kw136$CHECK;
    private static final SubLSymbol $kw137$DIRECTION;
    private static final SubLSymbol $kw138$EXCLUSIVE;
    private static final SubLSymbol $sym139$TRUE;
    private static final SubLSymbol $kw140$SUPPLANTS;
    private static final SubLList $list141;
    private static final SubLSymbol $kw142$COMPLETENESS;
    private static final SubLList $list143;
    private static final SubLSymbol $kw144$REQUIRED;
    private static final SubLList $list145;
    private static final SubLSymbol $kw146$INPUT_EXTRACT_PATTERN;
    private static final SubLSymbol $kw147$INPUT_ENCODE_PATTERN;
    private static final SubLSymbol $kw148$INPUT_VERIFY_PATTERN;
    private static final SubLSymbol $kw149$OUTPUT_DECODE_PATTERN;
    private static final SubLSymbol $kw150$OUTPUT_VERIFY_PATTERN;
    private static final SubLSymbol $kw151$OUTPUT_CONSTRUCT_PATTERN;
    private static final SubLSymbol $kw152$COST_EXPRESSION;
    private static final SubLSymbol $kw153$COST_PATTERN;
    private static final SubLSymbol $kw154$SUPPORT_MODULE;
    private static final SubLSymbol $kw155$SUPPORT_STRENGTH;
    private static final SubLSymbol $kw156$COMPLETE;
    private static final SubLSymbol $kw157$INCOMPLETE;
    private static final SubLString $str158$___not_;
    private static final SubLString $str159$_;
    private static final SubLString $str160$_FULLY_BOUND;
    private static final SubLString $str161$__FULLY_BOUND_;
    private static final SubLString $str162$_FULLY_BOUND;
    private static final SubLString $str163$__FULLY_BOUND_;
    private static final SubLString $str164$NOT_FULLY_BOUND;
    private static final SubLString $str165$_NOT_FULLY_BOUND_;
    private static final SubLSymbol $kw166$BIND;
    private static final SubLSymbol $kw167$VALUE;
    private static final SubLSymbol $kw168$TEMPLATE;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLSymbol $sym171$TOKEN_CYCL_SYMBOL_FOR_TERMNUM;
    private static final SubLSymbol $kw172$TUPLE;
    private static final SubLSymbol $sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_;
    private static final SubLString $str174$No_field_encodings_for_physical_f;
    private static final SubLSymbol $kw175$NOT;
    private static final SubLSymbol $kw176$TEST;
    private static final SubLSymbol $kw177$ENCODE;
    private static final SubLSymbol $kw178$CALL;
    private static final SubLSymbol $sym179$SKSI_REFORMULATE;
    private static final SubLString $str180$No_field_decodings_for_logical_fi;
    private static final SubLSymbol $kw181$DECODE;
    private static final SubLSymbol $sym182$DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P;
    private static final SubLSymbol $sym183$CITY_NAMED_FN_EXPRESSION_P;
    private static final SubLSymbol $sym184$SCHEMA_OBJECT_FN_EXPRESSION_P;
    private static final SubLSymbol $sym185$SOURCE_SCHEMA_OBJECT_FN_EXPRESSION_P;
    private static final SubLSymbol $sym186$INSTANCE_NAMED_FN_EXPRESSION_P;
    private static final SubLObject $const187$City;
    private static final SubLSymbol $sym188$GET_SKSI_REMOVAL_MODULE_COST;
    private static final SubLSymbol $kw189$INPUT;
    private static final SubLSymbol $sym190$LOGICAL_FIELD_FOR_INDEXICAL;
    private static final SubLSymbol $sym191$FAST_SUBSET_;
    private static final SubLSymbol $sym192$SETS_EQUAL_;
    private static final SubLSymbol $sym193$FAST_SUPERSET_;
    private static final SubLSymbol $sym194$GENERATE_SKSI_SINGLE_LITERAL_COST_RECORDING_ITERATOR;
    private static final SubLSymbol $sym195$GENERATE_BOOLEAN_FROM_CSQL;
    private static final SubLSymbol $sym196$NOT_BOOLEAN;
    private static final SubLSymbol $sym197$PHYSICAL_SCHEMA_REQUIRED_FIELDS;
    private static final SubLList $list198;
    private static final SubLList $list199;
    private static final SubLString $str200$CYCL_TERM;
    private static final SubLString $str201$RAW_TERM;
    private static final SubLString $str202$RAW;
    private static final SubLString $str203$CYCL;
    private static final SubLSymbol $sym204$_VIRTUAL_ASSERTION_COUNT_;
    private static final SubLSymbol $sym205$_MT_VIRTUAL_ASSERTION_COUNT_TABLE_;
    private static final SubLSymbol $sym206$_SKSI_MODULE_CODE_MAPPING_TERMS_CACHE_;
    private static final SubLSymbol $sym207$_SKSI_MODULE_LOGICAL_SCHEMAS_CACHE_;
    private static final SubLSymbol $sym208$SKSI_MODULE_ANY_PREDICATES_LIST;
    private static final SubLSymbol $sym209$SKSI_SUPPORTED_PREDICATE_TYPE_P;
    private static final SubLInteger $int210$5000;
    private static final SubLSymbol $sym211$FORT_P;
    private static final SubLString $str212$Too_many_term_arguments___S__for_;
    private static final SubLString $str213$Too_many_code_mapping_terms___S__;
    private static final SubLSymbol $sym214$GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS;
    private static final SubLList $list215;
    private static final SubLList $list216;
    private static final SubLString $str217$Continue_without_generating_remov;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 3901L)
    public static SubLObject sksi_module_p(final SubLObject hl_module) {
        return set.set_memberP(hl_module, sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 4088L)
    public static SubLObject do_sksi_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)sksi_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list1);
        hl_module = current.first();
        current = current.rest();
        if (sksi_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_removal_module_generation.$sym2$DO_SET, reader.bq_cons(hl_module, (SubLObject)sksi_removal_module_generation.$list3), ConsesLow.append(body, (SubLObject)sksi_removal_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list1);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 4468L)
    public static SubLObject do_sksi_modules_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)sksi_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list1);
        hl_module = current.first();
        current = current.rest();
        if (sksi_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_removal_module_generation.$sym4$CDOLIST, reader.bq_cons(hl_module, (SubLObject)sksi_removal_module_generation.$list5), ConsesLow.append(body, (SubLObject)sksi_removal_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list1);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 4885L)
    public static SubLObject sksi_modules_count() {
        return set.set_size(sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 4961L)
    public static SubLObject some_sksi_single_literal_removal_module_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == set.set_emptyP(sksi_removal_module_generation.$sksi_modules$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5079L)
    public static SubLObject note_sksi_module(final SubLObject hl_module) {
        return set.set_add(hl_module, sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5169L)
    public static SubLObject un_note_sksi_module(final SubLObject hl_module) {
        return set.set_remove(hl_module, sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5265L)
    public static SubLObject un_note_all_sksi_modules() {
        return set.clear_set(sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5466L)
    public static SubLObject note_sksi_module_supports(final SubLObject hl_module, final SubLObject supports) {
        return dictionary.dictionary_enter(sksi_removal_module_generation.$sksi_module_supports$.getGlobalValue(), hl_module, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5600L)
    public static SubLObject un_note_sksi_module_supports(final SubLObject hl_module) {
        return dictionary.dictionary_remove(sksi_removal_module_generation.$sksi_module_supports$.getGlobalValue(), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5720L)
    public static SubLObject un_note_all_sksi_module_supports() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_module_supports$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 5824L)
    public static SubLObject sksi_module_supports(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_module_supports$.getGlobalValue(), hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 6112L)
    public static SubLObject note_sksi_module_simple_required_pattern(final SubLObject hl_module, final SubLObject pattern) {
        return dictionary.dictionary_enter(sksi_removal_module_generation.$sksi_module_simple_required_pattern$.getGlobalValue(), hl_module, pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 6274L)
    public static SubLObject un_note_sksi_module_simple_required_pattern(final SubLObject hl_module) {
        return dictionary.dictionary_remove(sksi_removal_module_generation.$sksi_module_simple_required_pattern$.getGlobalValue(), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 6424L)
    public static SubLObject un_note_all_sksi_module_simple_required_patterns() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_module_simple_required_pattern$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 6559L)
    public static SubLObject sksi_module_simple_required_pattern(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_module_simple_required_pattern$.getGlobalValue(), hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 7023L)
    public static SubLObject note_multiply_indexed_conditional_meaning_sentence_for_sks(final SubLObject sks, final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject cur_val = dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != set.set_p(cur_val)) {
            return set.set_add(conditional_meaning_sentence_gaf, cur_val);
        }
        final SubLObject new_val = set.new_set(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        set.set_add(conditional_meaning_sentence_gaf, new_val);
        return dictionary.dictionary_enter(sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, new_val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 7532L)
    public static SubLObject un_note_multiply_indexed_conditional_meaning_sentence_for_sks(final SubLObject sks, final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject cur_val = dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != set.set_p(cur_val)) {
            return set.set_remove(conditional_meaning_sentence_gaf, cur_val);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 7927L)
    public static SubLObject multiply_indexed_conditional_meaning_sentence_noted_for_sksP(final SubLObject sks, final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject cur_val = dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != set.set_p(cur_val)) {
            return set.set_memberP(conditional_meaning_sentence_gaf, cur_val);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 8258L)
    public static SubLObject un_note_all_multiply_indexed_conditional_meaning_sentences() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 8533L)
    public static SubLObject note_sksi_module_multiply_indexed_conditional_meaning_sentence(final SubLObject hl_module, final SubLObject cms_gaf) {
        final SubLObject sks = inference_modules.hl_module_source(hl_module);
        note_multiply_indexed_conditional_meaning_sentence_for_sks(sks, cms_gaf);
        return dictionary.dictionary_enter(sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), hl_module, cms_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 8870L)
    public static SubLObject un_note_sksi_module_multiply_indexed_conditional_meaning_sentence(final SubLObject hl_module) {
        final SubLObject cms_gaf = dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != cms_gaf) {
            final SubLObject sks = inference_modules.hl_module_source(hl_module);
            un_note_multiply_indexed_conditional_meaning_sentence_for_sks(sks, cms_gaf);
            return dictionary.dictionary_remove(sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), hl_module);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 9348L)
    public static SubLObject un_note_all_sksi_module_multiply_indexed_conditional_meaning_sentences() {
        un_note_all_multiply_indexed_conditional_meaning_sentences();
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 9696L)
    public static SubLObject note_sksi_module_by_sks(final SubLObject sks, final SubLObject hl_module) {
        return dictionary_utilities.dictionary_pushnew(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue(), sks, hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 9819L)
    public static SubLObject un_note_sksi_modules_by_sks(final SubLObject sks) {
        return dictionary.dictionary_remove(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue(), sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 9925L)
    public static SubLObject clear_sksi_modules_by_sks_cache() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 10027L)
    public static SubLObject un_note_sksi_modules_by_sks_for_module(final SubLObject hl_module) {
        SubLObject cdolist_list_var = dictionary.dictionary_keys(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue());
        SubLObject sks = (SubLObject)sksi_removal_module_generation.NIL;
        sks = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_delete_from_value(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue(), sks, hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 10258L)
    public static SubLObject sksi_modules_by_sks_get_skses() {
        return dictionary.dictionary_keys(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 10357L)
    public static SubLObject sksi_modules_by_sks_find_modules(final SubLObject sks) {
        return dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue(), sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 10485L)
    public static SubLObject sksi_modules_by_sks_find_modules_with_children(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_modules = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_removal_module_generation.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_removal_module_generation.$const12$EverythingPSC, thread);
            SubLObject cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = (SubLObject)sksi_removal_module_generation.NIL;
            ks = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                final SubLObject items_var = sksi_modules_by_sks_find_modules(ks);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)sksi_removal_module_generation.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sksi_removal_module_generation.NIL, v_iteration = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sksi_removal_module_generation.ONE_INTEGER)) {
                        element_num = ((sksi_removal_module_generation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sksi_removal_module_generation.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        v_modules = (SubLObject)ConsesLow.cons(item, v_modules);
                    }
                }
                else {
                    SubLObject cdolist_list_var_$1 = items_var;
                    SubLObject item2 = (SubLObject)sksi_removal_module_generation.NIL;
                    item2 = cdolist_list_var_$1.first();
                    while (sksi_removal_module_generation.NIL != cdolist_list_var_$1) {
                        v_modules = (SubLObject)ConsesLow.cons(item2, v_modules);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        item2 = cdolist_list_var_$1.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 10918L)
    public static SubLObject do_code_mapping_sks_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject ps = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject ls = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject mapping_mt = (SubLObject)sksi_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list14);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list14);
        ps = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list14);
        ls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list14);
        mapping_mt = current.first();
        current = current.rest();
        if (sksi_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tuple = (SubLObject)sksi_removal_module_generation.$sym15$TUPLE;
            final SubLObject tuples = (SubLObject)sksi_removal_module_generation.$sym16$TUPLES;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$sym17$DO_DICTIONARY, (SubLObject)ConsesLow.listS(sks, tuples, (SubLObject)sksi_removal_module_generation.$list18), (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$sym4$CDOLIST, (SubLObject)ConsesLow.list(tuple, tuples), (SubLObject)ConsesLow.listS((SubLObject)sksi_removal_module_generation.$sym19$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(ps, ls, mapping_mt), tuple, ConsesLow.append(body, (SubLObject)sksi_removal_module_generation.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list14);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11209L)
    public static SubLObject note_code_mapping_sks(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        return dictionary_utilities.dictionary_push(sksi_removal_module_generation.$sksi_code_mapping_sks_cache$.getGlobalValue(), sks, (SubLObject)ConsesLow.list(ps, ls, mapping_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11357L)
    public static SubLObject unnote_code_mapping_sks(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        return dictionary_utilities.dictionary_remove_from_value(sksi_removal_module_generation.$sksi_code_mapping_sks_cache$.getGlobalValue(), sks, (SubLObject)ConsesLow.list(ps, ls, mapping_mt), Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11527L)
    public static SubLObject clear_code_mapping_sks_cache() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_code_mapping_sks_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11634L)
    public static SubLObject code_mapping_sks_cache_lookup(final SubLObject sks) {
        return dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_code_mapping_sks_cache$.getGlobalValue(), sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11765L)
    public static SubLObject code_mapping_forward_rules_to_repropagate_internal() {
        return kb_mapping.gather_predicate_rule_index(sksi_removal_module_generation.$const21$codeMapping, (SubLObject)sksi_removal_module_generation.$kw22$NEG, sksi_removal_module_generation.$const23$SKSIMt, (SubLObject)sksi_removal_module_generation.$kw24$FORWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11765L)
    public static SubLObject code_mapping_forward_rules_to_repropagate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return code_mapping_forward_rules_to_repropagate_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym20$CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym20$CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE, (SubLObject)sksi_removal_module_generation.ZERO_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQ, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym20$CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(code_mapping_forward_rules_to_repropagate_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 11933L)
    public static SubLObject sksi_assert_code_mapping_sks_content(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_iterator = sksi_batch_translate.new_sksi_translate_iterator(sks, ps, ls, mapping_mt, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != iteration.iterator_p(sks_iterator)) {
            SubLObject count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
            SubLObject ignore_errors_tag = (SubLObject)sksi_removal_module_generation.NIL;
            try {
                thread.throwStack.push(sksi_removal_module_generation.$kw25$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.$sym26$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)sksi_removal_module_generation.NIL, thread);
                            SubLObject mt = sksi_kb_accessors.sk_source_source_description_mt(sks);
                            if (sksi_removal_module_generation.NIL == mt) {
                                mt = mapping_mt;
                            }
                            SubLObject valid;
                            for (SubLObject done_var = (SubLObject)sksi_removal_module_generation.NIL; sksi_removal_module_generation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject sentence = iteration.iteration_next(sks_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (sksi_removal_module_generation.NIL != valid && sksi_removal_module_generation.NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, sksi_removal_module_generation.$const21$codeMapping)) {
                                    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                                    if (sksi_removal_module_generation.NIL == sksi_kb_accessors.schema_object_fn_expression_p(arg3) && sksi_removal_module_generation.NIL == sksi_kb_accessors.source_schema_object_fn_expression_p(arg3) && sksi_removal_module_generation.NIL != cyc_kernel.cyc_assert_wff(sentence, mt, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                                        count = Numbers.add(count, (SubLObject)sksi_removal_module_generation.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)sksi_removal_module_generation.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_removal_module_generation.$kw25$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            return count;
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 13118L)
    public static SubLObject sksi_unassert_code_mapping_sks_content(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_iterator = sksi_batch_translate.new_sksi_translate_iterator(sks, ps, ls, mapping_mt, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != iteration.iterator_p(sks_iterator)) {
            SubLObject count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
            SubLObject ignore_errors_tag = (SubLObject)sksi_removal_module_generation.NIL;
            try {
                thread.throwStack.push(sksi_removal_module_generation.$kw25$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.$sym26$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)sksi_removal_module_generation.NIL, thread);
                            SubLObject mt = sksi_kb_accessors.sk_source_source_description_mt(sks);
                            if (sksi_removal_module_generation.NIL == mt) {
                                mt = mapping_mt;
                            }
                            SubLObject valid;
                            for (SubLObject done_var = (SubLObject)sksi_removal_module_generation.NIL; sksi_removal_module_generation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject sentence = iteration.iteration_next(sks_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (sksi_removal_module_generation.NIL != valid && sksi_removal_module_generation.NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, sksi_removal_module_generation.$const21$codeMapping)) {
                                    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                                    if (sksi_removal_module_generation.NIL == sksi_kb_accessors.schema_object_fn_expression_p(arg3) && sksi_removal_module_generation.NIL == sksi_kb_accessors.source_schema_object_fn_expression_p(arg3) && sksi_removal_module_generation.NIL != cyc_kernel.cyc_unassert(sentence, mt)) {
                                        count = Numbers.add(count, (SubLObject)sksi_removal_module_generation.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)sksi_removal_module_generation.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_removal_module_generation.$kw25$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            return count;
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 14161L)
    public static SubLObject isa_removal_module_p(final SubLObject hl_module) {
        final SubLObject pred = inference_modules.hl_module_predicate(hl_module);
        final SubLObject mt = inference_modules.hl_module_required_mt(hl_module);
        if (sksi_removal_module_generation.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, mt)) {
            return genl_predicates.genl_predP(inference_modules.hl_module_predicate(hl_module), sksi_removal_module_generation.$const27$isa, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 14779L)
    public static SubLObject add_isa_sks_term_to_cycl_term_mts(final SubLObject mt) {
        if (sksi_removal_module_generation.NIL == conses_high.member(mt, sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$.getGlobalValue(), (SubLObject)sksi_removal_module_generation.$sym29$HLMT_EQUAL, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.IDENTITY))) {
            sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$.setGlobalValue((SubLObject)ConsesLow.cons(mt, sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$.getGlobalValue()));
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 14968L)
    public static SubLObject clear_isa_sks_term_to_cycl_term_mts() {
        sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$.setGlobalValue((SubLObject)sksi_removal_module_generation.NIL);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 15134L)
    public static SubLObject isa_sks_term_to_cycl_term_mt_relevantP() {
        return mt_relevance_macros.any_relevant_mtP(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 15709L)
    public static SubLObject add_isa_sks_term_to_cycl_term_store(final SubLObject v_term, final SubLObject mt) {
        if (sksi_removal_module_generation.NIL == dictionary.dictionary_p(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue())) {
            sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.setGlobalValue(dictionary.new_dictionary((SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        }
        dictionary_utilities.dictionary_pushnew(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue(), v_term, mt, (SubLObject)sksi_removal_module_generation.$sym29$HLMT_EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 16123L)
    public static SubLObject clear_isa_sks_term_to_cycl_term_store() {
        if (sksi_removal_module_generation.NIL != dictionary.dictionary_p(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue())) {
            dictionary.clear_dictionary(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue());
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 16743L)
    public static SubLObject any_sks_term_spec_to_cycl_term_in_relevant_mtP(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP;
        SubLObject iteration_state;
        for (foundP = (SubLObject)sksi_removal_module_generation.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue())); sksi_removal_module_generation.NIL == foundP && sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != list_utilities.not_eq(sks_term, cycl_term) && sksi_removal_module_generation.NIL != genls.genlP(sks_term, cycl_term, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                foundP = mt_relevance_macros.any_relevant_mtP(mts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 17178L)
    public static SubLObject all_sksi_relevant_rewrite_specs_for_term(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_specs_for_term_int(col, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 18050L)
    public static SubLObject all_sksi_relevant_rewrite_specs_for_term_int_internal(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue())); sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != list_utilities.not_eq(col, sks_term) && sksi_removal_module_generation.NIL != mt_relevance_macros.any_relevant_mtP(mts) && sksi_removal_module_generation.NIL != genls.genlP(sks_term, col, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(sks_term, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 18050L)
    public static SubLObject all_sksi_relevant_rewrite_specs_for_term_int(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_specs_for_term_int_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym31$ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym31$ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT, (SubLObject)sksi_removal_module_generation.TWO_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym31$ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_removal_module_generation.NIL;
            collision = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_removal_module_generation.NIL != cached_args && sksi_removal_module_generation.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_sksi_relevant_rewrite_specs_for_term_int_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(col, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 18478L)
    public static SubLObject all_sksi_relevant_rewrite_isas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_isas_int(mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 18845L)
    public static SubLObject all_sksi_relevant_rewrite_isas_int_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue())); sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != mt_relevance_macros.any_relevant_mtP(mts)) {
                result = (SubLObject)ConsesLow.cons(sks_term, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 18845L)
    public static SubLObject all_sksi_relevant_rewrite_isas_int(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_isas_int_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym32$ALL_SKSI_RELEVANT_REWRITE_ISAS_INT, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym32$ALL_SKSI_RELEVANT_REWRITE_ISAS_INT, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym32$ALL_SKSI_RELEVANT_REWRITE_ISAS_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_sksi_relevant_rewrite_isas_int_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 19215L)
    public static SubLObject add_isa_sks_term_to_cycl_term(final SubLObject v_term, final SubLObject mt) {
        add_isa_sks_term_to_cycl_term_mts(mt);
        add_isa_sks_term_to_cycl_term_store(v_term, mt);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 19450L)
    public static SubLObject clear_isa_sks_term_to_cycl_term() {
        clear_isa_sks_term_to_cycl_term_mts();
        clear_isa_sks_term_to_cycl_term_store();
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 19931L)
    public static SubLObject store_sksi_isa_module_rewrite_info(final SubLObject hl_module, final SubLObject required_pattern, SubLObject code_mapping_schemas) {
        if (code_mapping_schemas == sksi_removal_module_generation.UNPROVIDED) {
            code_mapping_schemas = (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject required_mt = inference_modules.hl_module_required_mt(hl_module);
        final SubLObject required_arg2 = cycl_utilities.formula_arg2(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject mt = inference_modules.hl_module_required_mt(hl_module);
        if (sksi_removal_module_generation.NIL != genls_rewrite_supported_term_p(required_arg2, mt)) {
            add_isa_sks_term_to_cycl_term(required_arg2, required_mt);
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject code_mapping_arg2s = cdolist_list_var = gather_code_mapping_arg2s(hl_module, code_mapping_schemas);
            SubLObject v_term = (SubLObject)sksi_removal_module_generation.NIL;
            v_term = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                if (sksi_removal_module_generation.NIL != genls_rewrite_supported_term_p(v_term, mt)) {
                    add_isa_sks_term_to_cycl_term(v_term, required_mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 20651L)
    public static SubLObject genls_rewrite_supported_term_p(final SubLObject v_term, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL != forts.fort_p(v_term) && sksi_removal_module_generation.NIL != fort_types_interface.isa_collectionP(v_term, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 20771L)
    public static SubLObject gather_code_mapping_arg2s(final SubLObject hl_module, final SubLObject code_mapping_schemas) {
        final SubLObject code_mapping_terms = (sksi_removal_module_generation.NIL != code_mapping_schemas) ? gather_cycl_terms_mapped_to_by_code_mapping_schemas(code_mapping_schemas) : sksi_module_code_mapping_terms(hl_module);
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = code_mapping_terms;
        SubLObject arg_pos_terms_pair = (SubLObject)sksi_removal_module_generation.NIL;
        arg_pos_terms_pair = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_terms_pair;
            SubLObject arg_pos = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject terms = (SubLObject)sksi_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list33);
            arg_pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list33);
            terms = current.first();
            current = current.rest();
            if (sksi_removal_module_generation.NIL == current) {
                if (arg_pos.numE((SubLObject)sksi_removal_module_generation.TWO_INTEGER)) {
                    result = ConsesLow.append(result, terms);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_terms_pair = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 21272L)
    public static SubLObject recalculate_sksi_isa_module_rewrite_info() {
        clear_isa_sks_term_to_cycl_term();
        final SubLObject set_contents_var = set.do_set_internal(sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_removal_module_generation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_removal_module_generation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if (sksi_removal_module_generation.NIL != set_contents.do_set_contents_element_validP(state, hl_module) && sksi_removal_module_generation.NIL != isa_removal_module_p(hl_module)) {
                store_sksi_isa_module_rewrite_info(hl_module, sksi_module_simple_required_pattern(hl_module), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 22437L)
    public static SubLObject filtered_sksi_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, sksi_removal_module_generation.$filtered_sksi_preds$.getGlobalValue(), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 22762L)
    public static SubLObject add_to_meaning_sentence_mts(final SubLObject mt) {
        if (sksi_removal_module_generation.NIL == conses_high.member(mt, sksi_removal_module_generation.$meaning_sentence_mts$.getGlobalValue(), (SubLObject)sksi_removal_module_generation.$sym29$HLMT_EQUAL, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.IDENTITY))) {
            sksi_removal_module_generation.$meaning_sentence_mts$.setGlobalValue((SubLObject)ConsesLow.cons(mt, sksi_removal_module_generation.$meaning_sentence_mts$.getGlobalValue()));
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 22956L)
    public static SubLObject clear_meaning_sentence_mts() {
        sksi_removal_module_generation.$meaning_sentence_mts$.setGlobalValue((SubLObject)sksi_removal_module_generation.NIL);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 23096L)
    public static SubLObject any_sksi_meaning_sentence_mt_relevantP() {
        return mt_relevance_macros.any_relevant_mtP(sksi_removal_module_generation.$meaning_sentence_mts$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 23648L)
    public static SubLObject meaning_sentence_pred_store_count() {
        if (sksi_removal_module_generation.NIL != dictionary.dictionary_p(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())) {
            return dictionary.dictionary_length(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue());
        }
        return (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 23893L)
    public static SubLObject meaning_sentence_predP(final SubLObject pred) {
        final SubLObject mts = dictionary.dictionary_lookup(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue(), pred, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return mt_relevance_macros.any_relevant_mtP(mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 24101L)
    public static SubLObject add_meaning_sentence_pred_to_store(final SubLObject pred, final SubLObject mt) {
        if (sksi_removal_module_generation.NIL == dictionary.dictionary_p(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())) {
            sksi_removal_module_generation.$meaning_sentence_pred_store$.setGlobalValue(dictionary.new_dictionary((SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        }
        dictionary_utilities.dictionary_pushnew(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue(), pred, mt, (SubLObject)sksi_removal_module_generation.$sym29$HLMT_EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 24484L)
    public static SubLObject clear_meaning_sentence_pred_store() {
        if (sksi_removal_module_generation.NIL != dictionary.dictionary_p(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())) {
            dictionary.clear_dictionary(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue());
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 25059L)
    public static SubLObject any_sksi_meaning_sentence_spec_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP;
        SubLObject iteration_state;
        for (foundP = (SubLObject)sksi_removal_module_generation.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())); sksi_removal_module_generation.NIL == foundP && sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != list_utilities.not_eq(spec_pred, pred) && sksi_removal_module_generation.NIL != genl_predicates.genl_predP(spec_pred, pred, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                foundP = mt_relevance_macros.any_relevant_mtP(mts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 25514L)
    public static SubLObject any_sksi_meaning_sentence_spec_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP;
        SubLObject iteration_state;
        for (foundP = (SubLObject)sksi_removal_module_generation.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())); sksi_removal_module_generation.NIL == foundP && sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_inv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != genl_predicates.genl_inverseP(spec_inv, pred, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                foundP = mt_relevance_macros.any_relevant_mtP(mts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 25939L)
    public static SubLObject all_sksi_relevant_rewrite_spec_preds_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_spec_preds_for_pred_int(pred, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 26865L)
    public static SubLObject all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())); sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != list_utilities.not_eq(spec_pred, pred) && sksi_removal_module_generation.NIL != mt_relevance_macros.any_relevant_mtP(mts) && (sksi_removal_module_generation.NIL != cycl_grammar.hl_variable_p(pred) || sksi_removal_module_generation.NIL != genl_predicates.genl_predP(spec_pred, pred, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED))) {
                result = (SubLObject)ConsesLow.cons(spec_pred, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 26865L)
    public static SubLObject all_sksi_relevant_rewrite_spec_preds_for_pred_int(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal(pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym37$ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym37$ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT, (SubLObject)sksi_removal_module_generation.TWO_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym37$ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_removal_module_generation.NIL;
            collision = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_removal_module_generation.NIL != cached_args && sksi_removal_module_generation.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 27380L)
    public static SubLObject all_sksi_relevant_rewrite_spec_inverses_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_spec_inverses_for_pred_int(pred, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 27800L)
    public static SubLObject all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue())); sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_inv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != mt_relevance_macros.any_relevant_mtP(mts) && sksi_removal_module_generation.NIL != genl_predicates.genl_inverseP(spec_inv, pred, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(spec_inv, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 27800L)
    public static SubLObject all_sksi_relevant_rewrite_spec_inverses_for_pred_int(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal(pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym38$ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym38$ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT, (SubLObject)sksi_removal_module_generation.TWO_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym38$ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_removal_module_generation.NIL;
            collision = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_removal_module_generation.NIL != cached_args && sksi_removal_module_generation.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 28218L)
    public static SubLObject add_meaning_sentence_pred(final SubLObject pred, final SubLObject mt) {
        if (sksi_removal_module_generation.NIL == filtered_sksi_predP(pred)) {
            add_to_meaning_sentence_mts(mt);
            add_meaning_sentence_pred_to_store(pred, mt);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 28493L)
    public static SubLObject clear_meaning_sentence_preds() {
        clear_meaning_sentence_mts();
        clear_meaning_sentence_pred_store();
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 29010L)
    public static SubLObject store_sksi_module_rewrite_pred_info(final SubLObject hl_module) {
        final SubLObject required_mt = inference_modules.hl_module_required_mt(hl_module);
        final SubLObject required_pred = inference_modules.hl_module_predicate(hl_module);
        if (sksi_removal_module_generation.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(required_pred, required_mt)) {
            add_meaning_sentence_pred(required_pred, required_mt);
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject pred_list = cdolist_list_var = sksi_module_any_predicates_list(hl_module);
            SubLObject pred = (SubLObject)sksi_removal_module_generation.NIL;
            pred = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                if (sksi_removal_module_generation.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, required_mt)) {
                    add_meaning_sentence_pred(pred, required_mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 29626L)
    public static SubLObject recalculate_sksi_rewrite_pred_info() {
        clear_meaning_sentence_preds();
        final SubLObject set_contents_var = set.do_set_internal(sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_removal_module_generation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_removal_module_generation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if (sksi_removal_module_generation.NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
                store_sksi_module_rewrite_pred_info(hl_module);
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 30314L)
    public static SubLObject store_sksi_module_rewrite_info(final SubLObject hl_module, final SubLObject required_pattern, final SubLObject code_mapping_schemas) {
        store_sksi_module_rewrite_pred_info(hl_module);
        if (sksi_removal_module_generation.NIL != isa_removal_module_p(hl_module)) {
            store_sksi_isa_module_rewrite_info(hl_module, required_pattern, code_mapping_schemas);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 30823L)
    public static SubLObject recalculate_sksi_rewrite_info() {
        recalculate_sksi_isa_module_rewrite_info();
        recalculate_sksi_rewrite_pred_info();
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 31460L)
    public static SubLObject clear_sksi_rewrite_info() {
        clear_isa_sks_term_to_cycl_term();
        clear_meaning_sentence_preds();
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 31648L)
    public static SubLObject register_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP, SubLObject add_to_allowed_ksesP) {
        if (mapping_mt == sksi_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_removal_module_generation.T;
        }
        if (add_to_allowed_ksesP == sksi_removal_module_generation.UNPROVIDED) {
            add_to_allowed_ksesP = (SubLObject)sksi_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject pref_mod_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_removal_module_generation.NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    final SubLObject code_mapping_ks_list = list_utilities.remove_if_not((SubLObject)sksi_removal_module_generation.$sym39$CODE_MAPPING_KNOWLEDGE_SOURCE_, sub_ks_closure, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                    final SubLObject remaining_sub_ks_list = list_utilities.fast_set_difference(sub_ks_closure, code_mapping_ks_list, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                    SubLObject code_mapping_assertedP = (SubLObject)sksi_removal_module_generation.NIL;
                    SubLObject cdolist_list_var = code_mapping_ks_list;
                    SubLObject ks = (SubLObject)sksi_removal_module_generation.NIL;
                    ks = cdolist_list_var.first();
                    while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject sub_count = register_sksi_removal_modules_for_just_sks(ks, mapping_mt, (SubLObject)sksi_removal_module_generation.NIL, sks, (SubLObject)sksi_removal_module_generation.NIL);
                        final SubLObject any_code_mappingsP = thread.secondMultipleValue();
                        final SubLObject sub_pref_mod_count = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        count = Numbers.add(count, sub_count);
                        pref_mod_count = Numbers.add(pref_mod_count, sub_pref_mod_count);
                        if (sksi_removal_module_generation.NIL == code_mapping_assertedP) {
                            code_mapping_assertedP = any_code_mappingsP;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    }
                    cdolist_list_var = remaining_sub_ks_list;
                    ks = (SubLObject)sksi_removal_module_generation.NIL;
                    ks = cdolist_list_var.first();
                    while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject sub_count = register_sksi_removal_modules_for_just_sks(ks, mapping_mt, (SubLObject)sksi_removal_module_generation.NIL, sks, (SubLObject)sksi_removal_module_generation.NIL);
                        final SubLObject any_code_mappingsP = thread.secondMultipleValue();
                        final SubLObject sub_pref_mod_count = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        count = Numbers.add(count, sub_count);
                        pref_mod_count = Numbers.add(pref_mod_count, sub_pref_mod_count);
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    }
                    if (sksi_removal_module_generation.NIL != code_mapping_assertedP) {
                        repropagate_code_mapping_forward_rules();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_removal_module_generation.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (sksi_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        if (sksi_removal_module_generation.NIL != add_to_allowed_ksesP) {
            sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return Values.values(count, pref_mod_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 33786L)
    public static SubLObject register_sksi_removal_modules_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP, SubLObject top_ks, SubLObject add_to_allowed_ksesP) {
        if (mapping_mt == sksi_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_removal_module_generation.T;
        }
        if (top_ks == sksi_removal_module_generation.UNPROVIDED) {
            top_ks = sks;
        }
        if (add_to_allowed_ksesP == sksi_removal_module_generation.UNPROVIDED) {
            add_to_allowed_ksesP = (SubLObject)sksi_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject pref_mod_count = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject code_mapping_assertedP = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = sksi_removal_module_generation.$sks_preference_modules_count$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_removal_module_generation.$sks_prune_modules_count$.currentBinding(thread);
        try {
            sksi_removal_module_generation.$sks_preference_modules_count$.bind((SubLObject)sksi_removal_module_generation.ZERO_INTEGER, thread);
            sksi_removal_module_generation.$sks_prune_modules_count$.bind((SubLObject)sksi_removal_module_generation.ZERO_INTEGER, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    deregister_sksi_removal_modules_for_just_sks(sks, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                    if (sksi_removal_module_generation.NIL == mapping_mt) {
                        mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                    }
                    sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_removal_module_generation.NIL, mapping_mt);
                    final SubLObject mt_var = mapping_mt;
                    final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        final SubLObject gaf = sksi_kb_accessors.sk_source_content_mt_gaf(sks);
                        if (sksi_removal_module_generation.NIL != gaf) {
                            final SubLObject content_mt = assertions_high.gaf_arg2(gaf);
                            SubLObject hl_module_infos = (SubLObject)sksi_removal_module_generation.NIL;
                            thread.resetMultipleValues();
                            final SubLObject hl_module_infos_$9 = sk_source_module_infos(sks, content_mt, (SubLObject)ConsesLow.list(gaf), top_ks, mapping_mt);
                            final SubLObject code_mapping_assertedP_$10 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            hl_module_infos = hl_module_infos_$9;
                            code_mapping_assertedP = code_mapping_assertedP_$10;
                            SubLObject cdolist_list_var = hl_module_infos;
                            SubLObject hl_module_info = (SubLObject)sksi_removal_module_generation.NIL;
                            hl_module_info = cdolist_list_var.first();
                            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = hl_module_info;
                                SubLObject hl_module_info_plist = (SubLObject)sksi_removal_module_generation.NIL;
                                SubLObject hl_module_relevant_code_mapping_schemas = (SubLObject)sksi_removal_module_generation.NIL;
                                SubLObject hl_module_relevant_instance_named_fn_colls = (SubLObject)sksi_removal_module_generation.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list40);
                                hl_module_info_plist = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list40);
                                hl_module_relevant_code_mapping_schemas = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list40);
                                hl_module_relevant_instance_named_fn_colls = current.first();
                                current = current.rest();
                                if (sksi_removal_module_generation.NIL == current) {
                                    final SubLObject hl_module = inference_removal_module_info(hl_module_info_plist);
                                    final SubLObject supports = module_info_get(hl_module_info_plist, (SubLObject)sksi_removal_module_generation.$kw41$MODULE_SUPPORTS, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                                    final SubLObject simple_required_pattern = replace_pattern_special_subpatterns_with_forts(module_info_get(hl_module_info_plist, (SubLObject)sksi_removal_module_generation.$kw42$SIMPLE_REQUIRED_PATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
                                    final SubLObject meaning_sentence = module_info_get(hl_module_info_plist, (SubLObject)sksi_removal_module_generation.$kw43$MEANING_SENTENCE, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                                    final SubLObject multiply_indexed_cms = module_info_get(hl_module_info_plist, (SubLObject)sksi_removal_module_generation.$kw44$MULTIPLY_INDEXED_CMS, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                                    note_sksi_module(hl_module);
                                    note_sksi_module_supports(hl_module, supports);
                                    note_sksi_module_simple_required_pattern(hl_module, simple_required_pattern);
                                    if (sksi_removal_module_generation.NIL != multiply_indexed_cms) {
                                        note_sksi_module_multiply_indexed_conditional_meaning_sentence(hl_module, multiply_indexed_cms);
                                    }
                                    note_sksi_module_by_sks(sks, hl_module);
                                    store_sksi_module_rewrite_info(hl_module, simple_required_pattern, hl_module_relevant_code_mapping_schemas);
                                    if (sksi_removal_module_generation.NIL != sksi_removal_module_generation.$sksi_browsing_enabled$.getDynamicValue(thread)) {
                                        register_sksi_supported_browsing_for_module(hl_module, meaning_sentence, simple_required_pattern, hl_module_relevant_code_mapping_schemas, hl_module_relevant_instance_named_fn_colls, content_mt);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list40);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                hl_module_info = cdolist_list_var.first();
                            }
                            count = Sequences.length(hl_module_infos);
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$8, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_removal_module_generation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$6, thread);
            }
            pref_mod_count = sksi_removal_module_generation.$sks_preference_modules_count$.getDynamicValue(thread);
            count = Numbers.add(count, sksi_removal_module_generation.$sks_prune_modules_count$.getDynamicValue(thread));
        }
        finally {
            sksi_removal_module_generation.$sks_prune_modules_count$.rebind(_prev_bind_2, thread);
            sksi_removal_module_generation.$sks_preference_modules_count$.rebind(_prev_bind_0, thread);
        }
        if (sksi_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
            if (sksi_removal_module_generation.NIL != code_mapping_assertedP) {
                repropagate_code_mapping_forward_rules();
            }
        }
        if (sksi_removal_module_generation.NIL != add_to_allowed_ksesP) {
            sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, (SubLObject)sksi_removal_module_generation.NIL);
        }
        return Values.values(count, code_mapping_assertedP, pref_mod_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 36780L)
    public static SubLObject repropagate_code_mapping_forward_rules() {
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 36951L)
    public static SubLObject deregister_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP, SubLObject remove_from_allowed_ksesP) {
        if (mapping_mt == sksi_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_removal_module_generation.T;
        }
        if (remove_from_allowed_ksesP == sksi_removal_module_generation.UNPROVIDED) {
            remove_from_allowed_ksesP = (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject pm_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        if (sksi_removal_module_generation.NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = (SubLObject)sksi_removal_module_generation.NIL;
            ks = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject ks_rm_count = deregister_sksi_removal_modules_for_just_sks(ks, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                final SubLObject ks_pm_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rm_count = Numbers.add(rm_count, ks_rm_count);
                pm_count = Numbers.add(pm_count, ks_pm_count);
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
            recalculate_sksi_rewrite_info();
        }
        if (sksi_removal_module_generation.NIL != remove_from_allowed_ksesP) {
            sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 38015L)
    public static SubLObject deregister_sksi_removal_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP, SubLObject remove_from_allowed_ksesP) {
        if (reclassifyP == sksi_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_removal_module_generation.T;
        }
        if (remove_from_allowed_ksesP == sksi_removal_module_generation.UNPROVIDED) {
            remove_from_allowed_ksesP = (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject hl_modules = sksi_modules_by_sks_find_modules(sks);
        SubLObject rm_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject pm_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = (SubLObject)sksi_removal_module_generation.NIL;
        hl_module = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            rm_count = Numbers.add(rm_count, deregister_sksi_removal_module(hl_module, (SubLObject)sksi_removal_module_generation.NIL));
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        un_note_sksi_modules_by_sks(sks);
        if (sksi_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
            recalculate_sksi_rewrite_info();
        }
        pm_count = sksi_preference_module_generation.deregister_sksi_preference_modules_for_sks(sks);
        SubLObject cdolist_list_var2;
        final SubLObject code_mapping_tuples = cdolist_list_var2 = code_mapping_sks_cache_lookup(sks);
        SubLObject code_mapping_tuple = (SubLObject)sksi_removal_module_generation.NIL;
        code_mapping_tuple = cdolist_list_var2.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = code_mapping_tuple;
            SubLObject ps = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject ls = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject mapping_mt = (SubLObject)sksi_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list45);
            ps = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list45);
            ls = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list45);
            mapping_mt = current.first();
            current = current.rest();
            if (sksi_removal_module_generation.NIL == current) {
                sksi_unassert_code_mapping_sks_content(sks, ps, ls, mapping_mt);
                unnote_code_mapping_sks(sks, ps, ls, mapping_mt);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list45);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            code_mapping_tuple = cdolist_list_var2.first();
        }
        if (sksi_removal_module_generation.NIL != remove_from_allowed_ksesP) {
            sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(sks, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 39262L)
    public static SubLObject deregister_sksi_removal_module(final SubLObject hl_module, SubLObject reclassifyP) {
        if (reclassifyP == sksi_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        if (sksi_removal_module_generation.NIL != sksi_module_p(hl_module)) {
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            inference_modules.undeclare_inference_removal_module(name, (SubLObject)sksi_removal_module_generation.NIL);
            un_note_sksi_module(hl_module);
            un_note_sksi_module_supports(hl_module);
            if (sksi_removal_module_generation.NIL != sksi_removal_module_generation.$sksi_browsing_enabled$.getDynamicValue(thread)) {
                deregister_sksi_supported_browsing_for_module(hl_module);
            }
            if (sksi_removal_module_generation.NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
                recalculate_sksi_rewrite_info();
                un_note_sksi_modules_by_sks_for_module(hl_module);
            }
            un_note_sksi_module_simple_required_pattern(hl_module);
            un_note_sksi_module_multiply_indexed_conditional_meaning_sentence(hl_module);
            count = (SubLObject)sksi_removal_module_generation.ONE_INTEGER;
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 40078L)
    public static SubLObject deregister_all_sksi_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject pm_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        clear_virtual_assertion_count();
        clear_sksi_rewrite_info();
        deregister_sksi_supported_browsing();
        SubLObject cdolist_list_var = set.set_element_list(sksi_removal_module_generation.$sksi_modules$.getGlobalValue());
        SubLObject hl_module = (SubLObject)sksi_removal_module_generation.NIL;
        hl_module = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            inference_modules.undeclare_inference_removal_module(name, (SubLObject)sksi_removal_module_generation.NIL);
            rm_count = Numbers.add(rm_count, (SubLObject)sksi_removal_module_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        inference_modules.reclassify_removal_modules();
        pm_count = sksi_preference_module_generation.deregister_all_sksi_preference_modules();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_removal_module_generation.$sksi_code_mapping_sks_cache$.getGlobalValue())); sksi_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tuples = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = tuples;
            SubLObject tuple = (SubLObject)sksi_removal_module_generation.NIL;
            tuple = cdolist_list_var2.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject ps = (SubLObject)sksi_removal_module_generation.NIL;
                SubLObject ls = (SubLObject)sksi_removal_module_generation.NIL;
                SubLObject mapping_mt = (SubLObject)sksi_removal_module_generation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list45);
                ps = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list45);
                ls = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list45);
                mapping_mt = current.first();
                current = current.rest();
                if (sksi_removal_module_generation.NIL == current) {
                    sksi_unassert_code_mapping_sks_content(sks, ps, ls, mapping_mt);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list45);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                tuple = cdolist_list_var2.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        clear_code_mapping_sks_cache();
        un_note_all_sksi_modules();
        un_note_all_sksi_module_supports();
        un_note_all_sksi_module_simple_required_patterns();
        un_note_all_sksi_module_multiply_indexed_conditional_meaning_sentences();
        clear_sksi_modules_by_sks_cache();
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 42110L)
    public static SubLObject module_info_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 42315L)
    public static SubLObject new_module_info() {
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 42364L)
    public static SubLObject module_info_add(final SubLObject module_info, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_removal_module_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_removal_module_generation.NIL == subl_promotions.memberP(property, inference_modules.removal_module_plist_indicators(), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED) && sksi_removal_module_generation.NIL == conses_high.member(property, sksi_removal_module_generation.$sksi_specific_module_properties$.getGlobalValue(), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
            Errors.error((SubLObject)sksi_removal_module_generation.$str47$_S_was_not_a_valid_module_paramet, property);
        }
        return conses_high.putf(module_info, property, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 42646L)
    public static SubLObject module_info_push(final SubLObject module_info, final SubLObject property, final SubLObject elem) {
        SubLObject list = module_info_get(module_info, property, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        list = (SubLObject)ConsesLow.cons(elem, list);
        return module_info_add(module_info, property, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 42842L)
    public static SubLObject module_info_get(final SubLObject module_info, final SubLObject property, SubLObject v_default) {
        if (v_default == sksi_removal_module_generation.UNPROVIDED) {
            v_default = (SubLObject)sksi_removal_module_generation.NIL;
        }
        return conses_high.getf(module_info, property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 42961L)
    public static SubLObject module_info_remove(final SubLObject module_info, final SubLObject property) {
        return conses_high.remf(module_info, property);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 43057L)
    public static SubLObject module_info_to_inference_module_info(final SubLObject module_info) {
        SubLObject inference_module_info = conses_high.copy_list(module_info);
        SubLObject cdolist_list_var = sksi_removal_module_generation.$sksi_specific_module_properties$.getGlobalValue();
        SubLObject property = (SubLObject)sksi_removal_module_generation.NIL;
        property = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            inference_module_info = module_info_remove(inference_module_info, property);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return inference_module_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 43636L)
    public static SubLObject inference_removal_module_info(final SubLObject module_info) {
        final SubLObject module_name = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw48$MODULE_NAME, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject inf_module_info = module_info_to_inference_module_info(module_info);
        final SubLObject hl_module = inference_modules.inference_removal_module(module_name, inf_module_info);
        SubLObject cdolist_list_var;
        final SubLObject pred_list = cdolist_list_var = inference_modules.hl_module_any_predicates(hl_module);
        SubLObject pred = (SubLObject)sksi_removal_module_generation.NIL;
        pred = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            if (sksi_removal_module_generation.NIL != forts.fort_p(pred) && sksi_removal_module_generation.NIL != inference_modules.solely_specific_removal_module_predicateP(pred)) {
                inference_modules.inference_removal_module_use_generic(pred, module_name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 44483L)
    public static SubLObject determine_module_info_name(final SubLObject module_info) {
        SubLObject documentation = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw49$DOCUMENTATION, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject sense = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw50$SENSE, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        documentation = Strings.string_downcase(documentation, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        documentation = Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str51$sksi_, documentation);
        return removal_module_utilities.determine_hl_module_name(documentation, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 44926L)
    public static SubLObject sk_source_module_infos(final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject physical_schema_gafs = sksi_kb_accessors.sk_source_physical_schema_gafs(sk_source);
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject code_mapping_assertedP = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = physical_schema_gafs;
        SubLObject gaf = (SubLObject)sksi_removal_module_generation.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject ps = assertions_high.gaf_arg1(gaf);
            thread.resetMultipleValues();
            final SubLObject module_infos = physical_schema_module_infos(ps, sk_source, content_mt, (SubLObject)ConsesLow.cons(gaf, module_supports), top_ks, mapping_mt);
            final SubLObject any_code_mappingP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = ConsesLow.nconc(result, module_infos);
            if (sksi_removal_module_generation.NIL == code_mapping_assertedP) {
                code_mapping_assertedP = any_code_mappingP;
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Values.values(result, code_mapping_assertedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 46416L)
    public static SubLObject physical_schema_module_infos(final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks, final SubLObject mapping_mt) {
        final SubLObject logical_schema_gafs = sksi_kb_accessors.physical_schema_logical_schema_gafs(physical_schema);
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject code_mapping_assertedP = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = logical_schema_gafs;
        SubLObject gaf = (SubLObject)sksi_removal_module_generation.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject ls = assertions_high.gaf_arg1(gaf);
            final SubLObject module_infos = logical_schema_module_infos(ls, physical_schema, sk_source, content_mt, (SubLObject)ConsesLow.cons(gaf, module_supports), top_ks);
            result = ConsesLow.nconc(result, module_infos);
            if (sksi_removal_module_generation.NIL != sksi_kb_accessors.isa_reified_mappingP(ls) && sksi_removal_module_generation.NIL != sksi_kb_accessors.code_mapping_knowledge_sourceP(sk_source)) {
                final SubLObject count = sksi_assert_code_mapping_sks_content(sk_source, physical_schema, ls, mapping_mt);
                if (sksi_removal_module_generation.NIL != subl_promotions.positive_integer_p(count)) {
                    note_code_mapping_sks(sk_source, physical_schema, ls, mapping_mt);
                    code_mapping_assertedP = (SubLObject)sksi_removal_module_generation.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Values.values(result, code_mapping_assertedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 47750L)
    public static SubLObject logical_schema_module_infos(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks) {
        final SubLObject meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject conditional_meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.NIL);
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject gaf = (SubLObject)sksi_removal_module_generation.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject module_infos = meaning_sentence_gaf_module_infos(gaf, logical_schema, physical_schema, sk_source, content_mt, (SubLObject)ConsesLow.cons(gaf, module_supports));
            result = ConsesLow.nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        cdolist_list_var = conditional_meaning_sentence_gafs;
        gaf = (SubLObject)sksi_removal_module_generation.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject module_infos = conditional_meaning_sentence_gaf_module_infos(gaf, logical_schema, physical_schema, sk_source, content_mt, (SubLObject)ConsesLow.cons(gaf, module_supports), top_ks);
            result = ConsesLow.nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 49071L)
    public static SubLObject meaning_sentence_gaf_module_infos(final SubLObject meaning_sentence_gaf, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module_infos = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject error_message = (SubLObject)sksi_removal_module_generation.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_removal_module_generation.$sym52$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                    if (sksi_removal_module_generation.NIL == sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p(cycl_utilities.formula_operator(sentence), content_mt)) {
                        Errors.error((SubLObject)sksi_removal_module_generation.$str53$Invalid_predicate_for_meaning_sen, meaning_sentence_gaf);
                    }
                    final SubLObject rev_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(sentence);
                    if (sksi_removal_module_generation.NIL != el_utilities.atomic_sentenceP(rev_sentence)) {
                        module_infos = pos_atomic_meaning_sentence_module_infos(rev_sentence, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema), sk_source, content_mt, module_supports, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                    }
                    else if (sksi_removal_module_generation.NIL != el_utilities.el_negation_p(rev_sentence) && sksi_removal_module_generation.NIL != el_utilities.atomic_sentenceP(cycl_utilities.sentence_arg1(rev_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED))) {
                        final SubLObject subsentence = cycl_utilities.sentence_arg1(rev_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                        module_infos = negated_atomic_meaning_sentence_module_infos(subsentence, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema), sk_source, content_mt, module_supports);
                    }
                    else {
                        Errors.error((SubLObject)sksi_removal_module_generation.$str54$complex_non_atomic_meaning_senten);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_removal_module_generation.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_removal_module_generation.NIL != error_message) {
            sksi_meaning_sentence_gaf_infos_error(meaning_sentence_gaf, error_message);
            module_infos = (SubLObject)sksi_removal_module_generation.NIL;
        }
        return module_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 50775L)
    public static SubLObject negated_atomic_meaning_sentence_module_infos(final SubLObject pos_sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports) {
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 51047L)
    public static SubLObject pos_atomic_meaning_sentence_module_infos(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, SubLObject antecedent_sentence, SubLObject where_expression, SubLObject from_expression, SubLObject eval_conditions) {
        if (antecedent_sentence == sksi_removal_module_generation.UNPROVIDED) {
            antecedent_sentence = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (where_expression == sksi_removal_module_generation.UNPROVIDED) {
            where_expression = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (from_expression == sksi_removal_module_generation.UNPROVIDED) {
            from_expression = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (eval_conditions == sksi_removal_module_generation.UNPROVIDED) {
            eval_conditions = (SubLObject)sksi_removal_module_generation.NIL;
        }
        SubLObject module_infos = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject any_logical_field_indexicals_appearingP = cycl_utilities.expression_find_if((SubLObject)sksi_removal_module_generation.$sym55$LOGICAL_FIELD_INDEXICAL_P, sentence, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == any_logical_field_indexicals_appearingP) {
            Errors.error((SubLObject)sksi_removal_module_generation.$str56$No_logical_field_indexicals_for_m, sentence, logical_schemata);
        }
        SubLObject cdolist_list_var;
        final SubLObject required_module_infos = cdolist_list_var = pos_atomic_meaning_sentence_required_pattern_infos(sentence, logical_schemata, physical_schemata, sk_source, content_mt, module_supports, antecedent_sentence);
        SubLObject required_info = (SubLObject)sksi_removal_module_generation.NIL;
        required_info = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject module_info = required_info_module_info(required_info, sentence, logical_schemata, physical_schemata, sk_source, content_mt, where_expression, from_expression, eval_conditions);
            if (sksi_removal_module_generation.NIL != module_info) {
                module_infos = (SubLObject)ConsesLow.cons(module_info, module_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            required_info = cdolist_list_var.first();
        }
        return Sequences.nreverse(module_infos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 52280L)
    public static SubLObject conditional_meaning_sentence_gaf_module_infos(final SubLObject conditional_meaning_sentence_gaf, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module_infos = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject error_message = (SubLObject)sksi_removal_module_generation.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_removal_module_generation.$sym52$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (sksi_removal_module_generation.NIL == sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(conditional_meaning_sentence_gaf, top_ks)) {
                        Errors.error((SubLObject)sksi_removal_module_generation.$str57$The_following_conditional_meaning, conditional_meaning_sentence_gaf);
                    }
                    final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
                    final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf);
                    final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
                    final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                    final SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(conses_high.union(consequent_logical_schema_set, antecedent_logical_schema_set, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
                    if (sksi_removal_module_generation.NIL != sksi_kb_accessors.sk_source_super_ksP(new_sk_source, top_ks) && (sksi_removal_module_generation.NIL != list_utilities.singletonP(consequent_logical_schema_set) || sksi_removal_module_generation.NIL == multiply_indexed_conditional_meaning_sentence_noted_for_sksP(new_sk_source, conditional_meaning_sentence_gaf))) {
                        if (sksi_removal_module_generation.NIL == sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p(cycl_utilities.formula_operator(consequent_meaning_sentence), content_mt)) {
                            Errors.error((SubLObject)sksi_removal_module_generation.$str58$Invalid_consequent_predicate_for_, conditional_meaning_sentence_gaf);
                        }
                        final SubLObject reconstructed_cms = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(consequent_meaning_sentence);
                        final SubLObject reconstructed_ams = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(antecedent_meaning_sentence);
                        final SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(antecedent_logical_schema_set);
                        final SubLObject consequent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                        final SubLObject all_physical_schemata = conses_high.union(consequent_physical_schemata, antecedent_physical_schemata, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                        final SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt(new_sk_source);
                        if (sksi_removal_module_generation.NIL != el_utilities.atomic_sentenceP(reconstructed_cms)) {
                            thread.resetMultipleValues();
                            final SubLObject where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence(conditional_meaning_sentence_gaf, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                            final SubLObject eval_conditions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence(conditional_meaning_sentence_gaf, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                            final SubLObject cms_module_infos = pos_atomic_meaning_sentence_module_infos(reconstructed_cms, consequent_logical_schema_set, list_utilities.delete_if_not((SubLObject)sksi_removal_module_generation.$sym59$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, Mapping.mapcan((SubLObject)sksi_removal_module_generation.$sym60$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, consequent_logical_schema_set, sksi_removal_module_generation.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), new_sk_source, content_mt, module_supports, reconstructed_ams, where_expression, from_expression, eval_conditions);
                            SubLObject new_module_infos = (SubLObject)sksi_removal_module_generation.NIL;
                            SubLObject cdolist_list_var = cms_module_infos;
                            SubLObject module_info = (SubLObject)sksi_removal_module_generation.NIL;
                            module_info = cdolist_list_var.first();
                            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                                SubLObject module_plist = module_info.first();
                                final SubLObject module_rest = module_info.rest();
                                final SubLObject output_generate_pattern = module_info_get(module_plist, (SubLObject)sksi_removal_module_generation.$kw61$OUTPUT_GENERATE_PATTERN, (SubLObject)sksi_removal_module_generation.NIL);
                                final SubLObject output_check_pattern = (SubLObject)((sksi_removal_module_generation.NIL != output_generate_pattern) ? sksi_removal_module_generation.NIL : module_info_get(module_plist, (SubLObject)sksi_removal_module_generation.$kw62$OUTPUT_CHECK_PATTERN, (SubLObject)sksi_removal_module_generation.NIL));
                                module_plist = module_info_add(module_plist, (SubLObject)sksi_removal_module_generation.$kw63$REQUIRED_MT, new_content_mt);
                                module_plist = module_info_add(module_plist, (SubLObject)sksi_removal_module_generation.$kw64$SUPPORT_MT, new_content_mt);
                                if (sksi_removal_module_generation.NIL == list_utilities.singletonP(consequent_logical_schema_set)) {
                                    module_plist = module_info_add(module_plist, (SubLObject)sksi_removal_module_generation.$kw44$MULTIPLY_INDEXED_CMS, conditional_meaning_sentence_gaf);
                                }
                                if (sksi_removal_module_generation.NIL != output_generate_pattern) {
                                    final SubLObject new_output_generate_pattern = condition_output_pattern(output_generate_pattern, from_expression, where_expression, eval_conditions, sk_source, content_mt, new_sk_source, new_content_mt);
                                    module_plist = module_info_add(module_plist, (SubLObject)sksi_removal_module_generation.$kw61$OUTPUT_GENERATE_PATTERN, new_output_generate_pattern);
                                }
                                else if (sksi_removal_module_generation.NIL != output_check_pattern) {
                                    final SubLObject new_output_check_pattern = condition_output_pattern(output_check_pattern, from_expression, where_expression, eval_conditions, sk_source, content_mt, new_sk_source, new_content_mt);
                                    module_plist = module_info_add(module_plist, (SubLObject)sksi_removal_module_generation.$kw62$OUTPUT_CHECK_PATTERN, new_output_check_pattern);
                                }
                                else {
                                    Errors.error((SubLObject)sksi_removal_module_generation.$str65$No__output_generate_pattern_or__o);
                                }
                                new_module_infos = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module_plist, module_rest), new_module_infos);
                                cdolist_list_var = cdolist_list_var.rest();
                                module_info = cdolist_list_var.first();
                            }
                            module_infos = new_module_infos;
                        }
                        else if (sksi_removal_module_generation.NIL != el_utilities.el_negation_p(reconstructed_cms) && sksi_removal_module_generation.NIL != el_utilities.atomic_sentenceP(cycl_utilities.sentence_arg1(reconstructed_cms, (SubLObject)sksi_removal_module_generation.UNPROVIDED))) {
                            module_infos = (SubLObject)sksi_removal_module_generation.NIL;
                        }
                        else {
                            Errors.error((SubLObject)sksi_removal_module_generation.$str54$complex_non_atomic_meaning_senten);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_removal_module_generation.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_removal_module_generation.NIL != error_message) {
            sksi_meaning_sentence_gaf_infos_error(conditional_meaning_sentence_gaf, error_message);
            module_infos = (SubLObject)sksi_removal_module_generation.NIL;
        }
        return module_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 57392L)
    public static SubLObject condition_output_pattern(final SubLObject output_pattern, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject old_sk_source, final SubLObject old_content_mt, final SubLObject new_sk_source, final SubLObject new_content_mt) {
        if (sksi_removal_module_generation.NIL != sksi_csql_utilities.csql_true_p(where_expression)) {
            return output_pattern;
        }
        final SubLObject old_from = list_utilities.tree_find_if((SubLObject)sksi_removal_module_generation.$sym66$CSQL_FROM_CLAUSE_P, output_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject old_tables = conses_high.second(old_from);
        final SubLObject new_tables = conses_high.union(old_tables, from_expression, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject old_where = list_utilities.tree_find_if((SubLObject)sksi_removal_module_generation.$sym67$CSQL_WHERE_CLAUSE_P, output_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        SubLObject new_output_pattern = list_utilities.tree_substitute(output_pattern, old_tables, new_tables);
        if (sksi_removal_module_generation.NIL == kb_utilities.kbeq(old_sk_source, new_sk_source)) {
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_sk_source, new_sk_source);
        }
        if (sksi_removal_module_generation.NIL == hlmt.hlmt_equal(old_content_mt, new_content_mt)) {
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_content_mt, new_content_mt);
        }
        if (sksi_removal_module_generation.NIL != old_where) {
            final SubLObject old_where_clauses = conses_high.second(old_where);
            final SubLObject new_where_clauses = (SubLObject)ConsesLow.cons(where_expression, old_where_clauses);
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_where_clauses, new_where_clauses);
        }
        else {
            final SubLObject new_where = (SubLObject)ConsesLow.cons((SubLObject)sksi_removal_module_generation.$kw68$WHERE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(where_expression)));
            final SubLObject old_select = list_utilities.tree_find_if((SubLObject)sksi_removal_module_generation.$sym69$CSQL_SELECT_QUERY_P, new_output_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject new_select = list_utilities.snoc(new_where, old_select);
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_select, new_select);
        }
        return new_output_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 58944L)
    public static SubLObject sksi_get_any_predicates_pattern_internal(final SubLObject pred, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(pred, logical_schemata, physical_schemata);
        SubLObject pred_list = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject schema_object_fn_expression_list = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = field_decodings;
        SubLObject field_decoding = (SubLObject)sksi_removal_module_generation.NIL;
        field_decoding = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            if (sksi_removal_module_generation.NIL != sksi_kb_accessors.schema_object_fn_expression_p(field_decoding)) {
                final SubLObject code_mapping_schema = cycl_utilities.formula_arg1(field_decoding, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                if (sksi_removal_module_generation.NIL != forts.fort_p(code_mapping_schema)) {
                    SubLObject cdolist_list_var_$12;
                    final SubLObject mapped_terms = cdolist_list_var_$12 = sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema);
                    SubLObject v_term = (SubLObject)sksi_removal_module_generation.NIL;
                    v_term = cdolist_list_var_$12.first();
                    while (sksi_removal_module_generation.NIL != cdolist_list_var_$12) {
                        if (sksi_removal_module_generation.NIL != fort_types_interface.predicateP(v_term)) {
                            pred_list = (SubLObject)ConsesLow.cons(v_term, pred_list);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        v_term = cdolist_list_var_$12.first();
                    }
                    schema_object_fn_expression_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(sksi_removal_module_generation.$const71$SchemaObjectFn, code_mapping_schema, (SubLObject)sksi_removal_module_generation.$list72), schema_object_fn_expression_list);
                    schema_object_fn_expression_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(sksi_removal_module_generation.$const73$SourceSchemaObjectFn, code_mapping_schema, (SubLObject)sksi_removal_module_generation.$list72), schema_object_fn_expression_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_decoding = cdolist_list_var.first();
        }
        return ConsesLow.nconc(kb_utilities.sort_terms(list_utilities.fast_delete_duplicates(pred_list, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), list_utilities.fast_delete_duplicates(schema_object_fn_expression_list, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 58944L)
    public static SubLObject sksi_get_any_predicates_pattern(final SubLObject pred, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return sksi_get_any_predicates_pattern_internal(pred, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym70$SKSI_GET_ANY_PREDICATES_PATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym70$SKSI_GET_ANY_PREDICATES_PATTERN, (SubLObject)sksi_removal_module_generation.THREE_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQ, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym70$SKSI_GET_ANY_PREDICATES_PATTERN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_removal_module_generation.NIL;
            collision = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_removal_module_generation.NIL != cached_args && sksi_removal_module_generation.NIL == cached_args.rest() && physical_schemata.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_get_any_predicates_pattern_internal(pred, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 59945L)
    public static SubLObject sksi_too_many_unbound_required_pattern_termsP(final SubLObject pattern, final SubLObject meaning_sentence, final SubLObject antecedent_meaning_sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL != sksi_fully_unbound_required_pattern_termsP(pattern) || sksi_removal_module_generation.NIL != sksi_too_many_unbound_required_pattern_terms_intP(pattern, meaning_sentence, antecedent_meaning_sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 60248L)
    public static SubLObject sksi_too_many_unbound_required_pattern_terms_intP(final SubLObject pattern, final SubLObject meaning_sentence, final SubLObject antecedent_meaning_sentence) {
        final SubLObject lfi_alias_fn_pos_list = cycl_utilities.arg_positions_if_bfs((SubLObject)sksi_removal_module_generation.$sym74$LFI_ALIAS_FN_NAUT_P, meaning_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        SubLObject unbound_pos_count = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER;
        SubLObject too_manyP = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = lfi_alias_fn_pos_list;
        SubLObject lfi_alias_fn_pos = (SubLObject)sksi_removal_module_generation.NIL;
        lfi_alias_fn_pos = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            if (sksi_removal_module_generation.NIL == sksi_fully_bound_required_pattern_termP(cycl_utilities.formula_arg_position(pattern, lfi_alias_fn_pos, (SubLObject)sksi_removal_module_generation.UNPROVIDED))) {
                unbound_pos_count = Numbers.add(unbound_pos_count, (SubLObject)sksi_removal_module_generation.ONE_INTEGER);
            }
            if (unbound_pos_count.numGE((SubLObject)sksi_removal_module_generation.ONE_INTEGER)) {
                too_manyP = (SubLObject)sksi_removal_module_generation.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi_alias_fn_pos = cdolist_list_var.first();
        }
        if (unbound_pos_count.isPositive() && sksi_removal_module_generation.NIL != list_utilities.lengthE(lfi_alias_fn_pos_list, unbound_pos_count, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
            return (SubLObject)sksi_removal_module_generation.T;
        }
        if (sksi_removal_module_generation.NIL == too_manyP) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject expression_lfi_forts = cycl_utilities.expression_gather(meaning_sentence, (SubLObject)sksi_removal_module_generation.$sym75$LOGICAL_FIELD_INDEXICAL_FORT_P, (SubLObject)sksi_removal_module_generation.T, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), Symbols.symbol_function((SubLObject)sksi_removal_module_generation.IDENTITY), (SubLObject)sksi_removal_module_generation.NIL);
        SubLObject bound_non_lfi_aliasP = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == bound_non_lfi_aliasP) {
            SubLObject csome_list_var = expression_lfi_forts;
            SubLObject lfi = (SubLObject)sksi_removal_module_generation.NIL;
            lfi = csome_list_var.first();
            while (sksi_removal_module_generation.NIL == bound_non_lfi_aliasP && sksi_removal_module_generation.NIL != csome_list_var) {
                final SubLObject lfi_pos = cycl_utilities.arg_positions_bfs(lfi, meaning_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED).first();
                final SubLObject lfi_boundedness = cycl_utilities.formula_arg_position(pattern, lfi_pos, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                if (lfi_boundedness == sksi_removal_module_generation.$kw76$FULLY_BOUND) {
                    bound_non_lfi_aliasP = (SubLObject)sksi_removal_module_generation.T;
                }
                csome_list_var = csome_list_var.rest();
                lfi = csome_list_var.first();
            }
        }
        if (sksi_removal_module_generation.NIL != bound_non_lfi_aliasP) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject restrictive_constraintP = antecedent_sentence_contains_restrictive_constraintP(antecedent_meaning_sentence);
        if (sksi_removal_module_generation.NIL != restrictive_constraintP) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        return (SubLObject)sksi_removal_module_generation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 61918L)
    public static SubLObject antecedent_sentence_contains_restrictive_constraintP(final SubLObject antecedent_meaning_sentence) {
        if (sksi_removal_module_generation.NIL == el_utilities.atomic_sentenceP(antecedent_meaning_sentence)) {
            SubLObject doneP = (SubLObject)sksi_removal_module_generation.NIL;
            final SubLObject args = cycl_utilities.formula_args(antecedent_meaning_sentence, (SubLObject)sksi_removal_module_generation.$kw79$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)sksi_removal_module_generation.NIL, rest = args; sksi_removal_module_generation.NIL == doneP && sksi_removal_module_generation.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                if (sksi_removal_module_generation.NIL != antecedent_sentence_contains_restrictive_constraintP(arg)) {
                    doneP = (SubLObject)sksi_removal_module_generation.T;
                }
            }
            return doneP;
        }
        if (sksi_removal_module_generation.NIL != kb_utilities.kbeq(cycl_utilities.formula_operator(antecedent_meaning_sentence), sksi_removal_module_generation.$const77$evaluate)) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject args2 = cycl_utilities.formula_args(antecedent_meaning_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != list_utilities.any_in_list((SubLObject)sksi_removal_module_generation.$sym78$NON_LOGICAL_FIELD_INDEXICAL_P, args2, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
            return (SubLObject)sksi_removal_module_generation.T;
        }
        SubLObject alias_index_list = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = args2;
        SubLObject arg = (SubLObject)sksi_removal_module_generation.NIL;
        arg = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            if (sksi_removal_module_generation.NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(arg)) {
                alias_index_list = (SubLObject)ConsesLow.cons(sksi_kb_accessors.lfi_alias_fn_naut_index(arg), alias_index_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        alias_index_list = list_utilities.fast_delete_duplicates(alias_index_list, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return list_utilities.lengthG(alias_index_list, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 62792L)
    public static SubLObject non_logical_field_indexical_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == sksi_kb_accessors.logical_field_indexical_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 62899L)
    public static SubLObject sksi_doomed_unless_arg_boundP(final SubLObject pattern, final SubLObject meaning_sentence) {
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_bfs((SubLObject)sksi_removal_module_generation.$kw81$NOT_FULLY_BOUND, pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        SubLObject arg_position = (SubLObject)sksi_removal_module_generation.NIL;
        arg_position = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject lfi = cycl_utilities.formula_arg_position(meaning_sentence, arg_position, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            SubLObject cdolist_list_var_$13;
            final SubLObject doomy_assertions = cdolist_list_var_$13 = (SubLObject)((sksi_removal_module_generation.NIL != sksi_kb_accessors.logical_field_indexical_p(lfi)) ? kb_mapping_utilities.pred_values(lfi, sksi_removal_module_generation.$const80$sksiModulesDoomedUnlessArgBound, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.TWO_INTEGER, (SubLObject)sksi_removal_module_generation.UNPROVIDED) : sksi_removal_module_generation.NIL);
            SubLObject doomy_assertion = (SubLObject)sksi_removal_module_generation.NIL;
            doomy_assertion = cdolist_list_var_$13.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var_$13) {
                final SubLObject doomed_meaning_sentence = assertions_high.gaf_arg2(doomy_assertion);
                if (sksi_removal_module_generation.NIL != czer_utilities.equals_elP(meaning_sentence, doomed_meaning_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                    return (SubLObject)sksi_removal_module_generation.T;
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                doomy_assertion = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_position = cdolist_list_var.first();
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 63451L)
    public static SubLObject sksi_valid_removal_module_required_patternP(final SubLObject pattern, final SubLObject meaning_sentence, final SubLObject physical_schemata, final SubLObject antecedent_meaning_sentence) {
        final SubLObject enumerable_schemaP = list_utilities.every_in_list((SubLObject)sksi_removal_module_generation.$sym82$PHYSICAL_SCHEMA_ENUMERABLE_, physical_schemata, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL != enumerable_schemaP) {
            return (SubLObject)sksi_removal_module_generation.T;
        }
        final SubLObject doomed_unless_arg_boundP = sksi_doomed_unless_arg_boundP(pattern, meaning_sentence);
        if (sksi_removal_module_generation.NIL != doomed_unless_arg_boundP) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject too_many_unboundsP = sksi_too_many_unbound_required_pattern_termsP(pattern, meaning_sentence, antecedent_meaning_sentence);
        if (sksi_removal_module_generation.NIL == too_many_unboundsP) {
            return (SubLObject)sksi_removal_module_generation.T;
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 65060L)
    public static SubLObject pos_atomic_meaning_sentence_required_pattern_infos(SubLObject meaning_sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, SubLObject antecedent_sentence) {
        if (antecedent_sentence == sksi_removal_module_generation.UNPROVIDED) {
            antecedent_sentence = (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_field_indexical_termnums = sentence_termnums_containing_logical_field_indexicals(meaning_sentence);
        SubLObject module_infos = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject lfi_predP = sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(meaning_sentence);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
        SubLObject constrained_pred = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject pred_list = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL != lfi_predP) {
            thread.resetMultipleValues();
            final SubLObject meaning_sentence_$14 = sksi_meaning_sentence_utilities.possibly_constrain_consequent_meaning_sentence(antecedent_sentence, meaning_sentence);
            final SubLObject constrained_pred_$15 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            meaning_sentence = meaning_sentence_$14;
            constrained_pred = constrained_pred_$15;
            if (sksi_removal_module_generation.NIL != constrained_pred) {
                logical_field_indexical_termnums = Sequences.delete((SubLObject)sksi_removal_module_generation.$list83, logical_field_indexical_termnums, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            }
            else {
                pred_list = sksi_get_any_predicates_pattern(pred, logical_schemata, physical_schemata);
            }
        }
        SubLObject cdolist_list_var;
        final SubLObject permutations = cdolist_list_var = compute_meaning_sentence_required_patterns(meaning_sentence, logical_field_indexical_termnums, (SubLObject)sksi_removal_module_generation.$kw84$POS);
        SubLObject permutation = (SubLObject)sksi_removal_module_generation.NIL;
        permutation = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = permutation;
            SubLObject tuple = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject input_termnums = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_termnums = (SubLObject)sksi_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list85);
            tuple = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list85);
            input_termnums = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list85);
            output_termnums = current.first();
            current = current.rest();
            if (sksi_removal_module_generation.NIL == current) {
                final SubLObject enumerable_schemaP = list_utilities.every_in_list((SubLObject)sksi_removal_module_generation.$sym82$PHYSICAL_SCHEMA_ENUMERABLE_, physical_schemata, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                final SubLObject valid_required_patternP = sksi_valid_removal_module_required_patternP(tuple, meaning_sentence, physical_schemata, antecedent_sentence);
                if (sksi_removal_module_generation.NIL == valid_required_patternP) {
                    if (sksi_removal_module_generation.NIL != lfi_predP && sksi_removal_module_generation.NIL == constrained_pred) {
                        Errors.warn((SubLObject)sksi_removal_module_generation.$str86$Could_not_constrain_the__not_full, meaning_sentence);
                    }
                    else {
                        final SubLObject assertion_count = sksi_removal_module_cost(tuple, meaning_sentence, logical_schemata, physical_schemata, input_termnums, output_termnums, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                        if (sksi_removal_module_generation.NIL != assertion_count) {
                            increment_assertion_count_for_mt(content_mt, assertion_count);
                        }
                        sksi_preference_module_generation.register_sksi_preference_module_for_sks(sk_source, tuple, (SubLObject)sksi_removal_module_generation.$kw84$POS, (sksi_removal_module_generation.NIL != lfi_predP) ? constrained_pred : pred, pred_list, content_mt, (SubLObject)sksi_removal_module_generation.$kw87$DISALLOWED);
                        sksi_removal_module_generation.$sks_preference_modules_count$.setDynamicValue(Numbers.add(sksi_removal_module_generation.$sks_preference_modules_count$.getDynamicValue(thread), (SubLObject)sksi_removal_module_generation.ONE_INTEGER), thread);
                    }
                }
                if (sksi_removal_module_generation.NIL != valid_required_patternP) {
                    SubLObject module_info = new_module_info();
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw88$INPUT_TERMNUMS, input_termnums);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw89$OUTPUT_TERMNUMS, output_termnums);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw41$MODULE_SUPPORTS, module_supports);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw50$SENSE, (SubLObject)sksi_removal_module_generation.$kw84$POS);
                    if (sksi_removal_module_generation.NIL != lfi_predP) {
                        if (sksi_removal_module_generation.NIL != constrained_pred) {
                            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw90$PREDICATE, constrained_pred);
                        }
                        else if (sksi_removal_module_generation.NIL != pred_list && sksi_removal_module_generation.NIL == sksi_not_fully_bound_required_pattern_predicateP(tuple)) {
                            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw91$ANY_PREDICATES, pred_list);
                        }
                    }
                    else {
                        module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw90$PREDICATE, pred);
                    }
                    final SubLObject documentation = sksi_make_documentation_string_from_required_pattern_and_sense(tuple, (SubLObject)sksi_removal_module_generation.$kw84$POS);
                    final SubLObject required_pattern = add_cmls_pruning_to_required_pattern(tuple, meaning_sentence, logical_field_indexical_termnums, logical_schemata, physical_schemata);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw42$SIMPLE_REQUIRED_PATTERN, tuple);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw43$MEANING_SENTENCE, meaning_sentence);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw92$REQUIRED_PATTERN, required_pattern);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw49$DOCUMENTATION, documentation);
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw63$REQUIRED_MT, content_mt);
                    if (sksi_removal_module_generation.NIL != enumerable_schemaP) {
                        SubLObject cdolist_list_var_$16 = physical_schemata;
                        SubLObject physical_schema = (SubLObject)sksi_removal_module_generation.NIL;
                        physical_schema = cdolist_list_var_$16.first();
                        while (sksi_removal_module_generation.NIL != cdolist_list_var_$16) {
                            module_info = module_info_push(module_info, (SubLObject)sksi_removal_module_generation.$kw41$MODULE_SUPPORTS, sksi_kb_accessors.enumerable_schema_gaf(physical_schema));
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            physical_schema = cdolist_list_var_$16.first();
                        }
                    }
                    module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw48$MODULE_NAME, determine_module_info_name(module_info));
                    module_infos = (SubLObject)ConsesLow.cons(module_info, module_infos);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list85);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permutation = cdolist_list_var.first();
        }
        return Sequences.nreverse(module_infos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 70433L)
    public static SubLObject sksi_fully_unbound_required_pattern_termsP(final SubLObject required_pattern_terms) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == list_utilities.tree_find((SubLObject)sksi_removal_module_generation.$kw76$FULLY_BOUND, required_pattern_terms, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 70774L)
    public static SubLObject sksi_not_fully_bound_required_pattern_predicateP(final SubLObject required_pattern_terms) {
        return Equality.eq(required_pattern_terms.first(), (SubLObject)sksi_removal_module_generation.$kw81$NOT_FULLY_BOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 70940L)
    public static SubLObject has_duplicate_keysP(final SubLObject list) {
        return list_utilities.equal_duplicatesP(list, (SubLObject)sksi_removal_module_generation.$sym93$FIRST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 71026L)
    public static SubLObject compute_boundedness_permutations_for_logical_field_indexical_termnums(final SubLObject logical_field_indexical_termnums, final SubLObject sense) {
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = logical_field_indexical_termnums;
        SubLObject termnums_list = (SubLObject)sksi_removal_module_generation.NIL;
        termnums_list = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(list_utilities.cartesian_product((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(termnums_list), (SubLObject)((sense == sksi_removal_module_generation.$kw84$POS) ? sksi_removal_module_generation.$list94 : sksi_removal_module_generation.$list95)), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            termnums_list = cdolist_list_var.first();
        }
        return list_utilities.cartesian_product(Sequences.nreverse(result), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 71453L)
    public static SubLObject distinct_logical_field_termnum_bindingsP(final SubLObject binding_1, final SubLObject binding_2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == subl_promotions.memberP(binding_1.first(), binding_2, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL), (SubLObject)sksi_removal_module_generation.$sym96$CAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 71599L)
    public static SubLObject compute_meaning_sentence_required_patterns(final SubLObject meaning_sentence, final SubLObject logical_field_indexical_termnums, final SubLObject sense) {
        final SubLObject permutations = compute_boundedness_permutations_for_logical_field_indexical_termnums(logical_field_indexical_termnums, sense);
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = permutations;
        SubLObject permutation = (SubLObject)sksi_removal_module_generation.NIL;
        permutation = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject pattern = el_utilities.copy_expression(meaning_sentence);
            SubLObject input_termnums = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_termnums = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject cdolist_list_var_$17 = permutation;
            SubLObject arg_pos_list_value_pair = (SubLObject)sksi_removal_module_generation.NIL;
            arg_pos_list_value_pair = cdolist_list_var_$17.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var_$17) {
                SubLObject current;
                final SubLObject datum = current = arg_pos_list_value_pair;
                SubLObject arg_pos_list = (SubLObject)sksi_removal_module_generation.NIL;
                SubLObject value = (SubLObject)sksi_removal_module_generation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list97);
                arg_pos_list = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list97);
                value = current.first();
                current = current.rest();
                if (sksi_removal_module_generation.NIL == current) {
                    SubLObject cdolist_list_var_$18 = arg_pos_list;
                    SubLObject arg_pos = (SubLObject)sksi_removal_module_generation.NIL;
                    arg_pos = cdolist_list_var_$18.first();
                    while (sksi_removal_module_generation.NIL != cdolist_list_var_$18) {
                        pattern = cycl_utilities.formula_arg_position_nsubst(value, arg_pos, pattern);
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        arg_pos = cdolist_list_var_$18.first();
                    }
                    final SubLObject pcase_var = value;
                    if (pcase_var.eql((SubLObject)sksi_removal_module_generation.$kw76$FULLY_BOUND)) {
                        input_termnums = ConsesLow.append(input_termnums, arg_pos_list);
                    }
                    else if (pcase_var.eql((SubLObject)sksi_removal_module_generation.$kw81$NOT_FULLY_BOUND)) {
                        output_termnums = ConsesLow.append(output_termnums, arg_pos_list);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list97);
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                arg_pos_list_value_pair = cdolist_list_var_$17.first();
            }
            pattern = replace_pattern_parts(pattern, sense);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pattern, input_termnums, output_termnums), result);
            cdolist_list_var = cdolist_list_var.rest();
            permutation = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 72734L)
    public static SubLObject replace_pattern_parts(SubLObject pattern, final SubLObject sense) {
        pattern = replace_pattern_nauts_with_unify_subpatterns(pattern);
        pattern = replace_pattern_narts_with_nat_subpatterns(pattern);
        if (sense == sksi_removal_module_generation.$kw84$POS) {
            pattern = replace_pattern_forts_with_unify_subpatterns(pattern);
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73054L)
    public static SubLObject replace_pattern_narts_with_nat_subpatterns(final SubLObject pattern) {
        final SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.$sym98$NART_P, (SubLObject)sksi_removal_module_generation.$sym99$MAKE_NAT_SUBPATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return el_utilities.make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73359L)
    public static SubLObject make_nat_subpattern(final SubLObject nart) {
        return (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw100$NAT, narts_high.nart_el_formula(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73444L)
    public static SubLObject nat_subpattern_p(final SubLObject pattern) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pattern.isCons() && pattern.first() == sksi_removal_module_generation.$kw100$NAT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73544L)
    public static SubLObject nartify_nat_pattern(final SubLObject pattern) {
        return narts_high.find_nart(conses_high.second(pattern));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73629L)
    public static SubLObject disjunctive_subpattern_p(final SubLObject pattern) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pattern.isCons() && pattern.first() == sksi_removal_module_generation.$kw101$OR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73808L)
    public static SubLObject make_disjunctive_subpattern(final SubLObject nat_pattern) {
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_removal_module_generation.$kw101$OR, nat_pattern, (SubLObject)sksi_removal_module_generation.$list102);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 73913L)
    public static SubLObject make_unify_subpattern(final SubLObject fort) {
        return (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw103$UNIFY, fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 74048L)
    public static SubLObject unify_subpattern_p(final SubLObject pattern) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pattern.isCons() && pattern.first() == sksi_removal_module_generation.$kw103$UNIFY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 74152L)
    public static SubLObject replace_pattern_nauts_with_unify_subpatterns(final SubLObject pattern) {
        final SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.$sym104$NAUT_, (SubLObject)sksi_removal_module_generation.$sym105$MAKE_UNIFY_SUBPATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return el_utilities.make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 74397L)
    public static SubLObject replace_pattern_forts_with_unify_subpatterns(final SubLObject pattern) {
        SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.$sym106$NON_SENTENTIAL_RELATION_FORT_P, (SubLObject)sksi_removal_module_generation.$sym105$MAKE_UNIFY_SUBPATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        new_subpattern = list_utilities.tree_transform_if(new_subpattern, (SubLObject)sksi_removal_module_generation.$sym107$NAT_SUBPATTERN_P, (SubLObject)sksi_removal_module_generation.$sym108$MAKE_DISJUNCTIVE_SUBPATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return el_utilities.make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 74908L)
    public static SubLObject non_sentential_relation_fort_p_internal(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL != forts.fort_p(v_object) && sksi_removal_module_generation.NIL == isa.isaP(v_object, sksi_removal_module_generation.$const109$SententialRelation, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 74908L)
    public static SubLObject non_sentential_relation_fort_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return non_sentential_relation_fort_p_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym106$NON_SENTENTIAL_RELATION_FORT_P, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym106$NON_SENTENTIAL_RELATION_FORT_P, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym106$NON_SENTENTIAL_RELATION_FORT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(non_sentential_relation_fort_p_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 75061L)
    public static SubLObject replace_pattern_special_subpatterns_with_forts(final SubLObject pattern) {
        SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.$sym110$UNIFY_SUBPATTERN_P, (SubLObject)sksi_removal_module_generation.$sym111$SECOND, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        new_subpattern = list_utilities.tree_transform_if(new_subpattern, (SubLObject)sksi_removal_module_generation.$sym112$DISJUNCTIVE_SUBPATTERN_P, (SubLObject)sksi_removal_module_generation.$sym111$SECOND, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        new_subpattern = list_utilities.tree_transform_if(new_subpattern, (SubLObject)sksi_removal_module_generation.$sym107$NAT_SUBPATTERN_P, (SubLObject)sksi_removal_module_generation.$sym113$NARTIFY_NAT_PATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return el_utilities.make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 75737L)
    public static SubLObject replace_pattern_special_subpatterns_with_anything(final SubLObject pattern) {
        final SubLObject new_subpattern = conses_high.subst_if((SubLObject)sksi_removal_module_generation.$kw114$ANYTHING, (SubLObject)sksi_removal_module_generation.$sym110$UNIFY_SUBPATTERN_P, conses_high.subst_if((SubLObject)sksi_removal_module_generation.$kw114$ANYTHING, (SubLObject)sksi_removal_module_generation.$sym107$NAT_SUBPATTERN_P, conses_high.subst_if((SubLObject)sksi_removal_module_generation.$kw114$ANYTHING, (SubLObject)sksi_removal_module_generation.$sym112$DISJUNCTIVE_SUBPATTERN_P, cycl_utilities.formula_args(pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        return el_utilities.make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 76254L)
    public static SubLObject add_cmls_pruning_to_required_pattern(final SubLObject required_pattern, final SubLObject sentence, final SubLObject logical_field_indexical_termnums, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLObject new_required_pattern = conses_high.copy_tree(required_pattern);
        return new_required_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 78621L)
    public static SubLObject clear_generate_sksi_slrm_required_function() {
        final SubLObject cs = sksi_removal_module_generation.$generate_sksi_slrm_required_function_caching_state$.getGlobalValue();
        if (sksi_removal_module_generation.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 78621L)
    public static SubLObject remove_generate_sksi_slrm_required_function(final SubLObject sk_source) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_removal_module_generation.$generate_sksi_slrm_required_function_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sk_source), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 78621L)
    public static SubLObject generate_sksi_slrm_required_function_internal(final SubLObject sk_source) {
        final SubLObject required_func_name = determine_sk_source_required_func_name(sk_source);
        return Eval.eval((SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$sym116$DEFINE_PRIVATE, required_func_name, (SubLObject)sksi_removal_module_generation.$list117, (SubLObject)sksi_removal_module_generation.$list118, (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$sym119$RET, (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$sym120$EXTERNAL_SOURCE_ACTIVATED_IN_IMAGE_, sk_source))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 78621L)
    public static SubLObject generate_sksi_slrm_required_function(final SubLObject sk_source) {
        SubLObject caching_state = sksi_removal_module_generation.$generate_sksi_slrm_required_function_caching_state$.getGlobalValue();
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_removal_module_generation.$sym115$GENERATE_SKSI_SLRM_REQUIRED_FUNCTION, (SubLObject)sksi_removal_module_generation.$sym121$_GENERATE_SKSI_SLRM_REQUIRED_FUNCTION_CACHING_STATE_, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQ, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_sksi_slrm_required_function_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 78941L)
    public static SubLObject determine_sk_source_required_func_name(final SubLObject sk_source) {
        return Symbols.make_symbol(Sequences.cconcatenate(Strings.string_upcase(kb_utilities.fort_alphanumeric_name(sk_source), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.$str122$_REQUIRED_FUNC));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 79214L)
    public static SubLObject sksi_only_predicateP_internal(final SubLObject pred) {
        return isa.isa_in_any_mtP(pred, sksi_removal_module_generation.$const124$SKSIOnlyPredicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 79214L)
    public static SubLObject sksi_only_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return sksi_only_predicateP_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym123$SKSI_ONLY_PREDICATE_, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym123$SKSI_ONLY_PREDICATE_, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.$int125$1024, (SubLObject)sksi_removal_module_generation.EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym123$SKSI_ONLY_PREDICATE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_only_predicateP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 79363L)
    public static SubLObject required_info_module_info(SubLObject module_info, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject where_expression, final SubLObject from_expression, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject required_pattern = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw42$SIMPLE_REQUIRED_PATTERN, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject pred = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw90$PREDICATE, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject pred_list = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw91$ANY_PREDICATES, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject sense = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw50$SENSE, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject direction = sksi_kb_accessors.get_sks_single_literal_lookup_direction_from_kb(sk_source);
        final SubLObject completeness = sksi_removal_module_completeness(sentence, logical_schemata);
        final SubLObject supplants_allP = sksi_only_predicateP(pred);
        final SubLObject required_func_name = generate_sksi_slrm_required_function(sk_source);
        final SubLObject module_supports = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw41$MODULE_SUPPORTS, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject checkP = required_pattern_is_checkP(required_pattern);
        final SubLObject input_termnums = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw88$INPUT_TERMNUMS, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject output_termnums = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw89$OUTPUT_TERMNUMS, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject cost = (sksi_removal_module_generation.NIL != checkP) ? sksi_removal_module_generation.$sksi_default_check_cost$.getGlobalValue() : sksi_removal_module_cost(required_pattern, sentence, logical_schemata, physical_schemata, input_termnums, output_termnums, sk_source, (SubLObject)((where_expression == sksi_removal_module_generation.T) ? sksi_removal_module_generation.NIL : where_expression), from_expression);
        SubLObject referenced_code_mapping_schemas = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject referenced_instance_named_fn_colls = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject errorP = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = sksi_hl_support_utilities.$sksi_supports$.currentBinding(thread);
        try {
            sksi_hl_support_utilities.$sksi_supports$.bind((SubLObject)sksi_removal_module_generation.NIL, thread);
            final SubLObject input_extract_pattern = sksi_determine_input_extract_pattern(required_pattern, sentence, input_termnums, eval_conditions);
            SubLObject boolean_csqlP = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject missing_required_fieldsP = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject input_verify_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_generate_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_check_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_decode_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_verify_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject output_construct_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject cost_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            final SubLObject support_module = (SubLObject)sksi_removal_module_generation.$kw126$SKSI;
            final SubLObject support_strength = (SubLObject)sksi_removal_module_generation.$kw127$DEFAULT;
            thread.resetMultipleValues();
            final SubLObject input_encode_pattern = sksi_determine_input_encode_pattern(sentence, logical_schemata, physical_schemata, sk_source, input_termnums, eval_conditions);
            final SubLObject relevant_physical_field_indexicals = thread.secondMultipleValue();
            final SubLObject prune_patterns = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != checkP) {
                output_check_pattern = sksi_determine_output_check_pattern(relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, sense, content_mt, eval_conditions);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject output_generate_pattern_$19 = sksi_determine_output_generate_pattern(required_pattern, relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, content_mt, eval_conditions);
                final SubLObject boolean_csqlP_$20 = thread.secondMultipleValue();
                final SubLObject missing_required_fieldsP_$21 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                output_generate_pattern = output_generate_pattern_$19;
                boolean_csqlP = boolean_csqlP_$20;
                missing_required_fieldsP = missing_required_fieldsP_$21;
                if (sksi_removal_module_generation.NIL != output_generate_pattern) {
                    if (sksi_removal_module_generation.NIL == boolean_csqlP) {
                        output_verify_pattern = sksi_determine_output_verify_pattern(output_termnums);
                    }
                    input_verify_pattern = sksi_determine_input_verify_pattern(input_termnums);
                    cost_pattern = sksi_determine_cost_pattern(sense, sk_source, cost);
                    thread.resetMultipleValues();
                    final SubLObject output_decode_pattern_$22 = sksi_determine_output_decode_pattern(sentence, logical_schemata, physical_schemata, output_termnums, sk_source, input_termnums);
                    final SubLObject referenced_code_mapping_schemas_$23 = thread.secondMultipleValue();
                    final SubLObject referenced_instance_named_fn_colls_$24 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    output_decode_pattern = output_decode_pattern_$22;
                    referenced_code_mapping_schemas = referenced_code_mapping_schemas_$23;
                    referenced_instance_named_fn_colls = referenced_instance_named_fn_colls_$24;
                    output_construct_pattern = sksi_determine_output_construct_pattern(sentence, required_pattern, input_termnums, output_termnums);
                }
                if (sksi_removal_module_generation.NIL != missing_required_fieldsP) {
                    sksi_preference_module_generation.register_sksi_preference_module_for_sks(sk_source, required_pattern, (SubLObject)sksi_removal_module_generation.$kw84$POS, pred, pred_list, content_mt, (SubLObject)sksi_removal_module_generation.$kw128$DISPREFERRED);
                    sksi_removal_module_generation.$sks_preference_modules_count$.setDynamicValue(Numbers.add(sksi_removal_module_generation.$sks_preference_modules_count$.getDynamicValue(thread), (SubLObject)sksi_removal_module_generation.ONE_INTEGER), thread);
                }
            }
            if (sksi_removal_module_generation.NIL != prune_patterns && sksi_removal_module_generation.NIL != sksi_only_predicateP(pred)) {
                final SubLObject supplanted_module_name = module_info_get(module_info, (SubLObject)sksi_removal_module_generation.$kw48$MODULE_NAME, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                final SubLObject prune_module_name = string_utilities.keyword_from_string(Strings.string_upcase(Sequences.cconcatenate(string_utilities.string_from_keyword(supplanted_module_name), (SubLObject)sksi_removal_module_generation.$str129$_prune_unreformulatable), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
                SubLObject prune_required_pattern = (SubLObject)sksi_removal_module_generation.NIL;
                SubLObject cdolist_list_var = prune_patterns;
                SubLObject prune_pattern = (SubLObject)sksi_removal_module_generation.NIL;
                prune_pattern = cdolist_list_var.first();
                while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                    prune_required_pattern = (SubLObject)ConsesLow.cons(prune_pattern, prune_required_pattern);
                    cdolist_list_var = cdolist_list_var.rest();
                    prune_pattern = cdolist_list_var.first();
                }
                prune_required_pattern = (SubLObject)ConsesLow.cons((SubLObject)sksi_removal_module_generation.$kw101$OR, prune_required_pattern);
                prune_required_pattern = (SubLObject)ConsesLow.list(prune_required_pattern);
                prune_required_pattern = (SubLObject)ConsesLow.cons(required_pattern, prune_required_pattern);
                prune_required_pattern = (SubLObject)ConsesLow.cons((SubLObject)sksi_removal_module_generation.$kw130$AND, prune_required_pattern);
                SubLObject hl_module_plist = (SubLObject)ConsesLow.listS((SubLObject)sksi_removal_module_generation.$kw131$MODULE_TYPE, new SubLObject[] { sksi_removal_module_generation.$kw132$REMOVAL, sksi_removal_module_generation.$kw133$MODULE_SUBTYPE, sksi_removal_module_generation.$list134, sksi_removal_module_generation.$kw135$MODULE_SOURCE, sk_source, sksi_removal_module_generation.$kw136$CHECK, sksi_removal_module_generation.NIL, sksi_removal_module_generation.$kw50$SENSE, sense, sksi_removal_module_generation.$kw137$DIRECTION, direction, sksi_removal_module_generation.$kw92$REQUIRED_PATTERN, prune_required_pattern, sksi_removal_module_generation.$kw63$REQUIRED_MT, content_mt, sksi_removal_module_generation.$kw138$EXCLUSIVE, sksi_removal_module_generation.$sym139$TRUE, sksi_removal_module_generation.$kw140$SUPPLANTS, ConsesLow.list((SubLObject)sksi_removal_module_generation.$list141, supplanted_module_name), sksi_removal_module_generation.$kw142$COMPLETENESS, completeness, sksi_removal_module_generation.$list143 });
                SubLObject hl_module = (SubLObject)sksi_removal_module_generation.NIL;
                if (sksi_removal_module_generation.NIL != pred) {
                    hl_module_plist = conses_high.putf(hl_module_plist, (SubLObject)sksi_removal_module_generation.$kw90$PREDICATE, pred);
                }
                if (sksi_removal_module_generation.NIL != pred_list) {
                    hl_module_plist = conses_high.putf(hl_module_plist, (SubLObject)sksi_removal_module_generation.$kw91$ANY_PREDICATES, pred_list);
                }
                hl_module = inference_modules.inference_removal_module(prune_module_name, hl_module_plist);
                sksi_removal_module_generation.$sks_prune_modules_count$.setDynamicValue(Numbers.add(sksi_removal_module_generation.$sks_prune_modules_count$.getDynamicValue(thread), (SubLObject)sksi_removal_module_generation.ONE_INTEGER), thread);
                note_sksi_module(hl_module);
                note_sksi_module_by_sks(sk_source, hl_module);
            }
            if (sksi_removal_module_generation.NIL == output_generate_pattern && sksi_removal_module_generation.NIL == output_check_pattern) {
                errorP = (SubLObject)sksi_removal_module_generation.T;
            }
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw133$MODULE_SUBTYPE, (SubLObject)sksi_removal_module_generation.$kw126$SKSI);
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw135$MODULE_SOURCE, sk_source);
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw136$CHECK, checkP);
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw144$REQUIRED, required_func_name);
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw137$DIRECTION, direction);
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw142$COMPLETENESS, completeness);
            if (sksi_removal_module_generation.NIL != supplants_allP) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw138$EXCLUSIVE, (SubLObject)sksi_removal_module_generation.$sym139$TRUE);
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw140$SUPPLANTS, (SubLObject)sksi_removal_module_generation.$list145);
            }
            if (sksi_removal_module_generation.NIL != input_extract_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw146$INPUT_EXTRACT_PATTERN, input_extract_pattern);
            }
            if (sksi_removal_module_generation.NIL != input_encode_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw147$INPUT_ENCODE_PATTERN, input_encode_pattern);
            }
            if (sksi_removal_module_generation.NIL != input_verify_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw148$INPUT_VERIFY_PATTERN, input_verify_pattern);
            }
            if (sksi_removal_module_generation.NIL != output_generate_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw61$OUTPUT_GENERATE_PATTERN, output_generate_pattern);
            }
            if (sksi_removal_module_generation.NIL != output_check_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw62$OUTPUT_CHECK_PATTERN, output_check_pattern);
            }
            if (sksi_removal_module_generation.NIL != output_decode_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw149$OUTPUT_DECODE_PATTERN, output_decode_pattern);
            }
            if (sksi_removal_module_generation.NIL != output_verify_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw150$OUTPUT_VERIFY_PATTERN, output_verify_pattern);
            }
            if (sksi_removal_module_generation.NIL != output_construct_pattern) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw151$OUTPUT_CONSTRUCT_PATTERN, output_construct_pattern);
            }
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw152$COST_EXPRESSION, cost);
            module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw153$COST_PATTERN, cost_pattern);
            if (sksi_removal_module_generation.NIL != support_module) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw154$SUPPORT_MODULE, support_module);
            }
            if (sksi_removal_module_generation.NIL != content_mt) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw64$SUPPORT_MT, content_mt);
            }
            if (sksi_removal_module_generation.NIL != support_strength) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw155$SUPPORT_STRENGTH, support_strength);
            }
            final SubLObject more_supports = list_utilities.fast_delete_duplicates(sksi_hl_support_utilities.sksi_supports(), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject supports = ConsesLow.append(more_supports, module_supports);
            if (sksi_removal_module_generation.NIL != supports) {
                module_info = module_info_add(module_info, (SubLObject)sksi_removal_module_generation.$kw41$MODULE_SUPPORTS, supports);
            }
        }
        finally {
            sksi_hl_support_utilities.$sksi_supports$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((sksi_removal_module_generation.NIL != errorP) ? sksi_removal_module_generation.NIL : ConsesLow.list(module_info, referenced_code_mapping_schemas, referenced_instance_named_fn_colls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 88358L)
    public static SubLObject sksi_removal_module_completeness(final SubLObject sentence, final SubLObject logical_schemata) {
        SubLObject completeP = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == completeP) {
            SubLObject csome_list_var = logical_schemata;
            SubLObject logical_schema = (SubLObject)sksi_removal_module_generation.NIL;
            logical_schema = csome_list_var.first();
            while (sksi_removal_module_generation.NIL == completeP && sksi_removal_module_generation.NIL != csome_list_var) {
                if (sksi_removal_module_generation.NIL != sksi_kb_accessors.logical_schema_complete_extent_known_for_predicateP(logical_schema, cycl_utilities.formula_operator(sentence), (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                    completeP = (SubLObject)sksi_removal_module_generation.T;
                }
                csome_list_var = csome_list_var.rest();
                logical_schema = csome_list_var.first();
            }
        }
        return (SubLObject)((sksi_removal_module_generation.NIL != completeP) ? sksi_removal_module_generation.$kw156$COMPLETE : sksi_removal_module_generation.$kw157$INCOMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 88839L)
    public static SubLObject sksi_make_documentation_string_from_required_pattern_and_sense(final SubLObject required_pattern, final SubLObject sense) {
        SubLObject string = format_nil.format_nil_a(required_pattern);
        if (sense == sksi_removal_module_generation.$kw22$NEG) {
            string = Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str158$___not_, new SubLObject[] { string, sksi_removal_module_generation.$str159$_ });
        }
        string = string_utilities.replace_substring(string, (SubLObject)sksi_removal_module_generation.$str160$_FULLY_BOUND, (SubLObject)sksi_removal_module_generation.$str161$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, (SubLObject)sksi_removal_module_generation.$str162$_FULLY_BOUND, (SubLObject)sksi_removal_module_generation.$str163$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, (SubLObject)sksi_removal_module_generation.$str164$NOT_FULLY_BOUND, (SubLObject)sksi_removal_module_generation.$str165$_NOT_FULLY_BOUND_);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 89397L)
    public static SubLObject sksi_determine_input_extract_pattern(final SubLObject required_pattern, final SubLObject sentence, final SubLObject input_termnums, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_sentence = replace_pattern_special_subpatterns_with_anything(required_pattern);
        SubLObject transform_tuple = (SubLObject)sksi_removal_module_generation.NIL;
        template_sentence = cycl_utilities.expression_subst((SubLObject)sksi_removal_module_generation.$kw114$ANYTHING, (SubLObject)sksi_removal_module_generation.$kw81$NOT_FULLY_BOUND, template_sentence, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        SubLObject cdolist_list_var = input_termnums;
        SubLObject input_termnum = (SubLObject)sksi_removal_module_generation.NIL;
        input_termnum = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject symbol = token_cycl_symbol_for_termnum(input_termnum);
            final SubLObject new_term = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw166$BIND, symbol);
            final SubLObject new_pair = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw167$VALUE, symbol);
            thread.resetMultipleValues();
            final SubLObject elem = list_utilities.get_nested_nth(template_sentence, input_termnum, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != foundP) {
                template_sentence = list_utilities.replace_nested_nth(template_sentence, input_termnum, new_term);
                transform_tuple = (SubLObject)ConsesLow.cons(new_pair, transform_tuple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            input_termnum = cdolist_list_var.first();
        }
        transform_tuple = Sequences.nreverse(transform_tuple);
        final SubLObject input_extract_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw168$TEMPLATE, template_sentence, transform_tuple);
        return input_extract_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 90673L)
    public static SubLObject sksi_determine_output_verify_pattern(final SubLObject output_termnums) {
        if (sksi_removal_module_generation.NIL != output_termnums) {
            return (SubLObject)sksi_removal_module_generation.$list169;
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 90834L)
    public static SubLObject sksi_determine_input_verify_pattern(final SubLObject input_termnums) {
        if (sksi_removal_module_generation.NIL != input_termnums) {
            return (SubLObject)sksi_removal_module_generation.$list170;
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 90999L)
    public static SubLObject sksi_determine_input_encode_pattern(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_field_indexicals = sksi_referenced_logical_field_indexicals(sentence, input_termnums);
        final SubLObject relevant_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(logical_field_indexicals, logical_schemata, physical_schemata);
        final SubLObject tuple_variables = Mapping.mapcar((SubLObject)sksi_removal_module_generation.$sym171$TOKEN_CYCL_SYMBOL_FOR_TERMNUM, input_termnums);
        SubLObject subpatterns = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject resulting_physical_field_indexicals = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject prune_pattern_template = (SubLObject)ConsesLow.make_list(Sequences.length(sentence), (SubLObject)sksi_removal_module_generation.$kw114$ANYTHING);
        SubLObject prune_patterns = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = relevant_physical_field_indexicals;
        SubLObject pfi = (SubLObject)sksi_removal_module_generation.NIL;
        pfi = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject subpattern = sksi_determine_field_input_encode_pattern(sentence, pfi, physical_schemata, logical_field_indexicals, logical_schemata, sk_source);
            final SubLObject sub_prune_patterns = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != subpattern) {
                subpatterns = ConsesLow.nconc(subpatterns, subpattern);
                resulting_physical_field_indexicals = ConsesLow.nconc(resulting_physical_field_indexicals, (SubLObject)ConsesLow.make_list(Sequences.length(subpattern), pfi));
            }
            SubLObject cdolist_list_var_$25 = sub_prune_patterns;
            SubLObject sub_prune_pattern = (SubLObject)sksi_removal_module_generation.NIL;
            sub_prune_pattern = cdolist_list_var_$25.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var_$25) {
                SubLObject prune_pattern = conses_high.copy_list(prune_pattern_template);
                SubLObject cdolist_list_var_$26 = sub_prune_pattern.first();
                SubLObject lfi_position = (SubLObject)sksi_removal_module_generation.NIL;
                lfi_position = cdolist_list_var_$26.first();
                while (sksi_removal_module_generation.NIL != cdolist_list_var_$26) {
                    prune_pattern = list_utilities.replace_nth(lfi_position, conses_high.second(sub_prune_pattern), prune_pattern);
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    lfi_position = cdolist_list_var_$26.first();
                }
                prune_patterns = (SubLObject)ConsesLow.cons(prune_pattern, prune_patterns);
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                sub_prune_pattern = cdolist_list_var_$25.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        }
        if (sksi_removal_module_generation.NIL == subpatterns) {
            return Values.values((SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.NIL);
        }
        final SubLObject input_encode_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw172$TUPLE, tuple_variables, subpatterns);
        return Values.values(input_encode_pattern, resulting_physical_field_indexicals, prune_patterns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 93373L)
    public static SubLObject sksi_reformulatable_via_templateP(final SubLObject expression, final SubLObject template, final SubLObject direction, final SubLObject sks) {
        return (SubLObject)(template.isCons() ? SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == sksi_query_utilities.sksi_unreformulatable_p(sksi_reformulate.sksi_reformulate(list_utilities.tree_substitute(template, (SubLObject)sksi_removal_module_generation.$kw167$VALUE, expression), direction, sks))) : SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == sksi_query_utilities.sksi_unreformulatable_p(sksi_reformulate.sksi_reformulate(expression, direction, sks))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 93698L)
    public static SubLObject sksi_determine_field_input_encode_pattern(final SubLObject sentence, final SubLObject physical_field_indexical, final SubLObject physical_schemata, final SubLObject logical_field_indexicals, final SubLObject logical_schemata, final SubLObject sk_source) {
        final SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject pfi_source = sksi_kb_accessors.physical_field_indexical_sk_source(physical_field_indexical);
        SubLObject prune_patterns = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject patterns = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == pfi_source) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (sksi_removal_module_generation.NIL != physical_field_indexical && sksi_removal_module_generation.NIL == field_encodings) {
            Errors.error((SubLObject)sksi_removal_module_generation.$str174$No_field_encodings_for_physical_f, physical_field_indexical, physical_schemata, logical_schemata);
        }
        SubLObject cdolist_list_var = field_encodings;
        SubLObject field_encoding = (SubLObject)sksi_removal_module_generation.NIL;
        field_encoding = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject result = el_utilities.copy_expression(field_encoding);
            SubLObject prune_result = el_utilities.copy_expression(field_encoding);
            SubLObject foundP = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject cdolist_list_var_$27 = logical_field_indexicals;
            SubLObject lfi = (SubLObject)sksi_removal_module_generation.NIL;
            lfi = cdolist_list_var_$27.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var_$27) {
                if ((sksi_removal_module_generation.NIL != forts.fort_p(physical_field_indexical) && sksi_removal_module_generation.NIL != forts.fort_p(lfi)) || (sksi_removal_module_generation.NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(physical_field_indexical) && sksi_removal_module_generation.NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(lfi) && sksi_removal_module_generation.NIL != kb_utilities.kbeq(sksi_kb_accessors.pfi_alias_fn_naut_index(physical_field_indexical), sksi_kb_accessors.lfi_alias_fn_naut_index(lfi)))) {
                    final SubLObject lfi_fort = sksi_kb_accessors.lfi_fort_for_lfi(lfi);
                    if (sksi_removal_module_generation.NIL != cycl_utilities.expression_find(lfi_fort, field_encoding, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED)) {
                        final SubLObject replacement = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw167$VALUE, cycl_token_for_logical_field_indexical(lfi, sentence));
                        final SubLObject lfi_positions = logical_field_indexical_positions_in_sentence(lfi, sentence);
                        result = cycl_utilities.expression_nsubst(replacement, lfi_fort, result, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                        prune_result = (SubLObject)ConsesLow.list(lfi_positions, (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw175$NOT, (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw176$TEST, (SubLObject)sksi_removal_module_generation.$sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_, cycl_utilities.expression_nsubst((SubLObject)sksi_removal_module_generation.$kw167$VALUE, lfi_fort, prune_result, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.$kw177$ENCODE, sk_source)));
                        foundP = (SubLObject)sksi_removal_module_generation.T;
                    }
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                lfi = cdolist_list_var_$27.first();
            }
            if (sksi_removal_module_generation.NIL != foundP) {
                patterns = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym179$SKSI_REFORMULATE, result, (SubLObject)sksi_removal_module_generation.$kw177$ENCODE, pfi_source), patterns);
                prune_patterns = (SubLObject)ConsesLow.cons(prune_result, prune_patterns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding = cdolist_list_var.first();
        }
        return Values.values(patterns, prune_patterns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 96031L)
    public static SubLObject sksi_determine_output_decode_pattern(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_termnums, final SubLObject sk_source, final SubLObject input_termnums) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unbound_logical_field_indexicals = sksi_referenced_logical_field_indexicals(sentence, output_termnums);
        final SubLObject relevant_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(unbound_logical_field_indexicals, logical_schemata, physical_schemata);
        final SubLObject tuple_variables = sksi_generate_raw_symbols_for_relevant_physical_field_indexicals(relevant_physical_field_indexicals);
        SubLObject subpatterns = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject bound_logical_field_indexicals = sksi_referenced_logical_field_indexicals(sentence, input_termnums);
        SubLObject referenced_code_mapping_schemas = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject referenced_instance_named_fn_colls = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = unbound_logical_field_indexicals;
        SubLObject lfi = (SubLObject)sksi_removal_module_generation.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject subpattern = sksi_determine_field_output_decode_pattern(lfi, physical_schemata, relevant_physical_field_indexicals, logical_schemata, sk_source, (SubLObject)sksi_removal_module_generation.NIL);
            final SubLObject code_mapping_schemas = thread.secondMultipleValue();
            final SubLObject instance_named_fn_colls = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (sksi_removal_module_generation.NIL != subpattern) {
                subpatterns = (SubLObject)ConsesLow.cons(subpattern, subpatterns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        cdolist_list_var = bound_logical_field_indexicals;
        lfi = (SubLObject)sksi_removal_module_generation.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject logical_field_indexical_arg_pos = el_utilities.formula_position(lfi, sentence, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL));
            if (logical_field_indexical_arg_pos.isInteger()) {
                thread.resetMultipleValues();
                final SubLObject subpattern2 = sksi_determine_field_output_decode_pattern(lfi, physical_schemata, relevant_physical_field_indexicals, logical_schemata, sk_source, (SubLObject)sksi_removal_module_generation.T);
                final SubLObject code_mapping_schemas2 = thread.secondMultipleValue();
                final SubLObject instance_named_fn_colls2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (sksi_removal_module_generation.NIL != code_mapping_schemas2) {
                    referenced_code_mapping_schemas = ConsesLow.nconc(referenced_code_mapping_schemas, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(logical_field_indexical_arg_pos, code_mapping_schemas2)));
                }
                if (sksi_removal_module_generation.NIL != instance_named_fn_colls2) {
                    referenced_instance_named_fn_colls = ConsesLow.nconc(referenced_instance_named_fn_colls, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(logical_field_indexical_arg_pos, instance_named_fn_colls2)));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        subpatterns = Sequences.nreverse(subpatterns);
        referenced_code_mapping_schemas = Sequences.nreverse(referenced_code_mapping_schemas);
        final SubLObject output_decode_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw172$TUPLE, tuple_variables, subpatterns);
        return Values.values(output_decode_pattern, referenced_code_mapping_schemas, referenced_instance_named_fn_colls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 99224L)
    public static SubLObject sksi_determine_field_output_decode_pattern(final SubLObject logical_field_indexical, final SubLObject physical_schemata, final SubLObject physical_field_indexicals, final SubLObject logical_schemata, final SubLObject sk_source, final SubLObject gather_code_mapping_schemas_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject field_decodings = sksi_field_translation_utilities.get_field_decodings_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject lfi_source = sksi_kb_accessors.logical_field_indexical_sk_source(logical_field_indexical);
        SubLObject pattern = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject referenced_code_mapping_schemas = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject referenced_instance_named_fn_colls = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL != logical_field_indexical && sksi_removal_module_generation.NIL == field_decodings) {
            Errors.error((SubLObject)sksi_removal_module_generation.$str180$No_field_decodings_for_logical_fi, logical_field_indexical, logical_schemata, physical_schemata);
        }
        if (sksi_removal_module_generation.NIL != gather_code_mapping_schemas_onlyP) {
            SubLObject cdolist_list_var = field_decodings;
            SubLObject field_decoding = (SubLObject)sksi_removal_module_generation.NIL;
            field_decoding = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject code_mapping_schemas = gather_code_mapping_schemas_mentioned_in_field_decoding(sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical), field_decoding);
                final SubLObject instance_named_fn_colls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                referenced_code_mapping_schemas = ConsesLow.nconc(referenced_code_mapping_schemas, code_mapping_schemas);
                referenced_instance_named_fn_colls = ConsesLow.nconc(referenced_instance_named_fn_colls, instance_named_fn_colls);
                cdolist_list_var = cdolist_list_var.rest();
                field_decoding = cdolist_list_var.first();
            }
        }
        else if (sksi_removal_module_generation.NIL == pattern) {
            SubLObject csome_list_var = field_decodings;
            SubLObject field_decoding = (SubLObject)sksi_removal_module_generation.NIL;
            field_decoding = csome_list_var.first();
            while (sksi_removal_module_generation.NIL == pattern && sksi_removal_module_generation.NIL != csome_list_var) {
                final SubLObject referenced_physical_field_indexicals = sksi_infrastructure_utilities.determine_relevant_physical_field_indexicals_for_field_decoding(field_decoding, physical_field_indexicals);
                if (sksi_removal_module_generation.NIL != referenced_physical_field_indexicals) {
                    pattern = sksi_determine_field_output_decode_pattern_int(field_decoding, physical_field_indexicals, referenced_physical_field_indexicals, lfi_source);
                }
                csome_list_var = csome_list_var.rest();
                field_decoding = csome_list_var.first();
            }
        }
        return Values.values(pattern, referenced_code_mapping_schemas, referenced_instance_named_fn_colls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 101729L)
    public static SubLObject sksi_determine_field_output_decode_pattern_int(final SubLObject field_decoding, final SubLObject physical_field_indexicals, final SubLObject referenced_physical_field_indexicals, final SubLObject lfi_source) {
        SubLObject result = el_utilities.copy_expression(field_decoding);
        SubLObject cdolist_list_var = referenced_physical_field_indexicals;
        SubLObject pfi = (SubLObject)sksi_removal_module_generation.NIL;
        pfi = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject pfi_index = number_utilities.f_1X(Sequences.position(pfi, physical_field_indexicals, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
            final SubLObject raw_symbol = token_raw_symbol_for_termnum(pfi_index);
            final SubLObject replacement = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw167$VALUE, raw_symbol);
            result = cycl_utilities.expression_nsubst(replacement, sksi_kb_accessors.pfi_fort_for_pfi(pfi), result, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym179$SKSI_REFORMULATE, result, (SubLObject)sksi_removal_module_generation.$kw181$DECODE, lfi_source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 102320L)
    public static SubLObject dummy_external_term_denoting_function_expression_p(final SubLObject expression, final SubLObject argnum) {
        return fort_types_interface.sksi_external_term_denoting_function_p(cycl_utilities.formula_operator(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 102603L)
    public static SubLObject gather_external_term_denoting_expressions_of_type_in_field_decoding(final SubLObject field_decoding, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)sksi_removal_module_generation.$sym182$DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P, thread);
            v_answer = cycl_utilities.expression_gather(field_decoding, pred, (SubLObject)sksi_removal_module_generation.T, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 102905L)
    public static SubLObject field_decoding_contains_city_named_fn_expressionP(final SubLObject field_decoding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)sksi_removal_module_generation.$sym182$DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P, thread);
            v_answer = cycl_utilities.expression_find_if((SubLObject)sksi_removal_module_generation.$sym183$CITY_NAMED_FN_EXPRESSION_P, field_decoding, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 103196L)
    public static SubLObject gather_code_mapping_schemas_mentioned_in_field_decoding(final SubLObject logical_field, final SubLObject field_decoding) {
        final SubLObject schema_object_fn_terms = gather_external_term_denoting_expressions_of_type_in_field_decoding(field_decoding, (SubLObject)sksi_removal_module_generation.$sym184$SCHEMA_OBJECT_FN_EXPRESSION_P);
        final SubLObject source_schema_object_fn_terms = gather_external_term_denoting_expressions_of_type_in_field_decoding(field_decoding, (SubLObject)sksi_removal_module_generation.$sym185$SOURCE_SCHEMA_OBJECT_FN_EXPRESSION_P);
        final SubLObject instance_named_fn_terms = gather_external_term_denoting_expressions_of_type_in_field_decoding(field_decoding, (SubLObject)sksi_removal_module_generation.$sym186$INSTANCE_NAMED_FN_EXPRESSION_P);
        SubLObject code_mapping_schemas = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject instance_named_fn_colls = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = schema_object_fn_terms;
        SubLObject v_term = (SubLObject)sksi_removal_module_generation.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            code_mapping_schemas = (SubLObject)ConsesLow.cons(cycl_utilities.nat_arg1(v_term, (SubLObject)sksi_removal_module_generation.UNPROVIDED), code_mapping_schemas);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = source_schema_object_fn_terms;
        v_term = (SubLObject)sksi_removal_module_generation.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            code_mapping_schemas = (SubLObject)ConsesLow.cons(cycl_utilities.nat_arg2(v_term, (SubLObject)sksi_removal_module_generation.UNPROVIDED), code_mapping_schemas);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = instance_named_fn_terms;
        v_term = (SubLObject)sksi_removal_module_generation.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            instance_named_fn_colls = (SubLObject)ConsesLow.cons(cycl_utilities.nat_arg2(v_term, (SubLObject)sksi_removal_module_generation.UNPROVIDED), instance_named_fn_colls);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        if (sksi_removal_module_generation.NIL != field_decoding_contains_city_named_fn_expressionP(field_decoding)) {
            SubLObject field_isas = sksi_kb_accessors.logical_field_isa(logical_field);
            field_isas = (SubLObject)ConsesLow.cons(sksi_removal_module_generation.$const187$City, field_isas);
            instance_named_fn_colls = ConsesLow.nconc(instance_named_fn_colls, genls.min_cols(field_isas, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        }
        return Values.values(code_mapping_schemas, instance_named_fn_colls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 104795L)
    public static SubLObject sksi_determine_output_construct_pattern(final SubLObject sentence, final SubLObject required_pattern, final SubLObject input_termnums, final SubLObject output_termnums) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = replace_pattern_special_subpatterns_with_forts(required_pattern);
        SubLObject tuple_output = (SubLObject)sksi_removal_module_generation.NIL;
        thread.resetMultipleValues();
        final SubLObject template_$28 = determine_output_construct_pattern_template_and_tuple_output(template, input_termnums, output_termnums);
        final SubLObject tuple_output_$29 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        template = template_$28;
        tuple_output = tuple_output_$29;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw172$TUPLE, tuple_output, template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 105418L)
    public static SubLObject determine_output_construct_pattern_template_and_tuple_output(final SubLObject pattern, final SubLObject input_termnums, final SubLObject output_termnums) {
        SubLObject template = pattern;
        SubLObject tuple_output = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = input_termnums;
        SubLObject input_termnum = (SubLObject)sksi_removal_module_generation.NIL;
        input_termnum = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject token_term = token_cycl_symbol_for_termnum(input_termnum);
            template = list_utilities.replace_nested_nth(template, input_termnum, (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw167$VALUE, token_term));
            cdolist_list_var = cdolist_list_var.rest();
            input_termnum = cdolist_list_var.first();
        }
        cdolist_list_var = output_termnums;
        SubLObject output_termnum = (SubLObject)sksi_removal_module_generation.NIL;
        output_termnum = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject token_term = token_cycl_symbol_for_termnum(output_termnum);
            template = list_utilities.replace_nested_nth(template, output_termnum, (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw167$VALUE, token_term));
            tuple_output = (SubLObject)ConsesLow.cons(token_term, tuple_output);
            cdolist_list_var = cdolist_list_var.rest();
            output_termnum = cdolist_list_var.first();
        }
        return Values.values(template, Sequences.nreverse(tuple_output));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 106085L)
    public static SubLObject sksi_determine_cost_pattern(final SubLObject sense, final SubLObject sk_source, SubLObject cost) {
        if (cost == sksi_removal_module_generation.UNPROVIDED) {
            cost = (SubLObject)sksi_removal_module_generation.NIL;
        }
        return (SubLObject)((sksi_removal_module_generation.NIL != cost) ? ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym188$GET_SKSI_REMOVAL_MODULE_COST, (SubLObject)sksi_removal_module_generation.$kw189$INPUT, sense, sk_source, cost) : ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym188$GET_SKSI_REMOVAL_MODULE_COST, (SubLObject)sksi_removal_module_generation.$kw189$INPUT, sense, sk_source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 106396L)
    public static SubLObject sksi_removal_module_cost(final SubLObject required_pattern, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_termnums, final SubLObject output_termnums, SubLObject sk_source, SubLObject where_expression, SubLObject from_expression) {
        if (sk_source == sksi_removal_module_generation.UNPROVIDED) {
            sk_source = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (where_expression == sksi_removal_module_generation.UNPROVIDED) {
            where_expression = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (from_expression == sksi_removal_module_generation.UNPROVIDED) {
            from_expression = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (sksi_removal_module_generation.NIL == output_termnums) {
            return sksi_removal_module_generation.$sksi_default_check_cost$.getGlobalValue();
        }
        SubLObject cost = sksi_removal_module_logical_cost(sentence, logical_schemata, input_termnums, output_termnums, sk_source);
        if (sksi_removal_module_generation.NIL != cost) {
            return Numbers.max(sksi_removal_module_generation.$sksi_default_check_cost$.getGlobalValue(), cost);
        }
        cost = sksi_removal_module_physical_cost(sentence, logical_schemata, physical_schemata, input_termnums, output_termnums, sk_source, where_expression, from_expression);
        if (sksi_removal_module_generation.NIL != cost) {
            return Numbers.max(sksi_removal_module_generation.$sksi_default_check_cost$.getGlobalValue(), cost);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 107322L)
    public static SubLObject sksi_removal_module_logical_cost(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject input_termnums, final SubLObject output_termnums, SubLObject sk_source) {
        if (sk_source == sksi_removal_module_generation.UNPROVIDED) {
            sk_source = (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject lrs_cardinality_wrt_value_gafs = sksi_kb_accessors.logical_schemata_result_set_cardinality_wrt_value_gafs(logical_schemata);
        final SubLObject lrs_cardinality_gafs = sksi_kb_accessors.logical_schemata_result_set_cardinality_gafs(logical_schemata);
        if (sksi_removal_module_generation.NIL != lrs_cardinality_wrt_value_gafs || sksi_removal_module_generation.NIL != lrs_cardinality_gafs) {
            final SubLObject not_fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, output_termnums), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, input_termnums), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject not_fully_bound_logical_fields_list = Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.$sym190$LOGICAL_FIELD_FOR_INDEXICAL), not_fully_bound_logical_field_indexicals);
            final SubLObject fully_bound_logical_fields_list = Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.$sym190$LOGICAL_FIELD_FOR_INDEXICAL), fully_bound_logical_field_indexicals);
            if (sksi_removal_module_generation.NIL != lrs_cardinality_wrt_value_gafs) {
                sksi_query_utilities.cache_cost_from_lrs_cardinality_wrt_value_gafs(sentence, not_fully_bound_logical_fields_list, fully_bound_logical_fields_list, lrs_cardinality_wrt_value_gafs, sk_source);
            }
            if (sksi_removal_module_generation.NIL != lrs_cardinality_gafs) {
                final SubLObject cost = sksi_query_utilities.guess_cost_from_lrs_cardinality_gafs(not_fully_bound_logical_fields_list, fully_bound_logical_fields_list, lrs_cardinality_gafs);
                return cost;
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 108981L)
    public static SubLObject sksi_removal_module_physical_cost(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_termnums, final SubLObject output_termnums, SubLObject sk_source, SubLObject where_expression, SubLObject from_expression) {
        if (sk_source == sksi_removal_module_generation.UNPROVIDED) {
            sk_source = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (where_expression == sksi_removal_module_generation.UNPROVIDED) {
            where_expression = (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (from_expression == sksi_removal_module_generation.UNPROVIDED) {
            from_expression = (SubLObject)sksi_removal_module_generation.NIL;
        }
        final SubLObject rs_cardinality_gafs = (sksi_removal_module_generation.NIL != where_expression) ? sksi_kb_accessors.physical_schemata_result_set_cardinality_wXconstraints_gafs(physical_schemata) : sksi_kb_accessors.physical_schemata_result_set_cardinality_gafs(physical_schemata);
        SubLObject cost = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL != rs_cardinality_gafs) {
            final SubLObject not_fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, output_termnums), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, input_termnums), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata(logical_schemata, physical_schemata);
            final SubLObject not_fully_bound_physical_fields_list = substitute_logical_field_indexicals_with_physical_fields_list(not_fully_bound_logical_field_indexicals, logical_physical_field_mappings);
            final SubLObject fully_bound_physical_fields_list = substitute_logical_field_indexicals_with_physical_fields_list(fully_bound_logical_field_indexicals, logical_physical_field_mappings);
            final SubLObject subset_testP = Numbers.numG(Numbers.add(Sequences.length(fully_bound_physical_fields_list), Sequences.length(not_fully_bound_physical_fields_list)), (SubLObject)sksi_removal_module_generation.ONE_INTEGER);
            final SubLObject select_func = (SubLObject)((sksi_removal_module_generation.NIL != subset_testP) ? sksi_removal_module_generation.$sym191$FAST_SUBSET_ : sksi_removal_module_generation.$sym192$SETS_EQUAL_);
            final SubLObject where_func = (SubLObject)((sksi_removal_module_generation.NIL != subset_testP) ? sksi_removal_module_generation.$sym193$FAST_SUPERSET_ : sksi_removal_module_generation.$sym192$SETS_EQUAL_);
            final SubLObject cycl_for_where_expression = (SubLObject)((sksi_removal_module_generation.NIL != where_expression) ? sksi_csql_utilities.csql_to_cycl(where_expression, sk_source, from_expression) : sksi_removal_module_generation.NIL);
            cost = sksi_query_utilities.guess_cost_from_rs_cardinality_gafs(not_fully_bound_physical_fields_list, fully_bound_physical_fields_list, rs_cardinality_gafs, select_func, where_func, cycl_for_where_expression);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 110968L)
    public static SubLObject substitute_logical_field_indexicals_with_physical_fields_list(final SubLObject logical_field_indexicals, final SubLObject logical_physical_field_mappings) {
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = logical_field_indexicals;
        SubLObject lfi = (SubLObject)sksi_removal_module_generation.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
            final SubLObject pf_list = dictionary.dictionary_lookup_without_values(logical_physical_field_mappings, lf, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            SubLObject new_pf_list = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject cdolist_list_var_$30 = pf_list;
            SubLObject pf = (SubLObject)sksi_removal_module_generation.NIL;
            pf = cdolist_list_var_$30.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var_$30) {
                new_pf_list = (SubLObject)ConsesLow.cons(sksi_kb_accessors.pf_for_lfi(pf, lfi), new_pf_list);
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                pf = cdolist_list_var_$30.first();
            }
            result = ConsesLow.append(Sequences.nreverse(new_pf_list), result);
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 111478L)
    public static SubLObject sksi_determine_output_generate_pattern(final SubLObject required_pattern, final SubLObject relevant_physical_field_indexicals, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject content_mt, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject tuple_expression = sksi_determine_output_csql_tuple_expression(relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, eval_conditions);
        final SubLObject boolean_csqlP = thread.secondMultipleValue();
        final SubLObject missing_required_fieldsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_removal_module_generation.NIL != tuple_expression) {
            return Values.values((SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym194$GENERATE_SKSI_SINGLE_LITERAL_COST_RECORDING_ITERATOR, tuple_expression, sk_source, content_mt), boolean_csqlP, missing_required_fieldsP);
        }
        return Values.values((SubLObject)sksi_removal_module_generation.NIL, boolean_csqlP, missing_required_fieldsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 112897L)
    public static SubLObject sksi_determine_output_check_pattern(final SubLObject relevant_physical_field_indexicals, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject sense, final SubLObject content_mt, final SubLObject eval_conditions) {
        final SubLObject tuple_expression = sksi_determine_output_csql_tuple_expression(relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, eval_conditions);
        final SubLObject subpattern = (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym195$GENERATE_BOOLEAN_FROM_CSQL, tuple_expression, sk_source, content_mt);
        if (sksi_removal_module_generation.$kw84$POS == sense) {
            return subpattern;
        }
        return (SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw178$CALL, (SubLObject)sksi_removal_module_generation.$sym196$NOT_BOOLEAN, subpattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 113520L)
    public static SubLObject sksi_determine_output_csql_tuple_expression(final SubLObject relevant_physical_field_indexicals, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject eval_conditions) {
        final SubLObject required_fields = Mapping.mapcan((SubLObject)sksi_removal_module_generation.$sym197$PHYSICAL_SCHEMA_REQUIRED_FIELDS, physical_schemata, sksi_removal_module_generation.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject raw_terms = sksi_determine_csql_tuple_terms(relevant_physical_field_indexicals);
        final SubLObject csql_output = sksi_csql_generation.sksi_determine_output_csql(sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, relevant_physical_field_indexicals, eval_conditions, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject required_fields_in_placeP = required_fields_have_values_in_csqlP(csql_output, required_fields, sk_source);
        if (sksi_removal_module_generation.NIL != csql_output && sksi_removal_module_generation.NIL != required_fields_in_placeP) {
            return Values.values((SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.$kw172$TUPLE, raw_terms, csql_output), sksi_csql_utilities.boolean_csqlP(csql_output), (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == required_fields_in_placeP));
        }
        return Values.values((SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == required_fields_in_placeP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 114473L)
    public static SubLObject sksi_determine_csql_tuple_terms(final SubLObject relevant_physical_field_indexicals) {
        return sksi_generate_raw_symbols_for_relevant_physical_field_indexicals(relevant_physical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 114670L)
    public static SubLObject required_fields_have_values_in_csqlP(final SubLObject csql, final SubLObject required_fields, final SubLObject sk_source) {
        SubLObject failureP = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL != required_fields) {
            SubLObject select_keyword = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject fields = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject from = (SubLObject)sksi_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_removal_module_generation.$list198);
            select_keyword = csql.first();
            SubLObject current = csql.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_removal_module_generation.$list198);
            fields = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_removal_module_generation.$list198);
            from = current.first();
            current = current.rest();
            final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_removal_module_generation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_removal_module_generation.$list198);
            current = current.rest();
            if (sksi_removal_module_generation.NIL == current) {
                if (sksi_removal_module_generation.NIL != where) {
                    SubLObject current_$32;
                    final SubLObject datum_$31 = current_$32 = where;
                    SubLObject where_keyword = (SubLObject)sksi_removal_module_generation.NIL;
                    SubLObject where_clause = (SubLObject)sksi_removal_module_generation.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$32, datum_$31, (SubLObject)sksi_removal_module_generation.$list199);
                    where_keyword = current_$32.first();
                    current_$32 = current_$32.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$32, datum_$31, (SubLObject)sksi_removal_module_generation.$list199);
                    where_clause = current_$32.first();
                    current_$32 = current_$32.rest();
                    if (sksi_removal_module_generation.NIL == current_$32) {
                        if (sksi_removal_module_generation.NIL == failureP) {
                            SubLObject csome_list_var = required_fields;
                            SubLObject required_field = (SubLObject)sksi_removal_module_generation.NIL;
                            required_field = csome_list_var.first();
                            while (sksi_removal_module_generation.NIL == failureP && sksi_removal_module_generation.NIL != csome_list_var) {
                                final SubLObject naked_field_name = (SubLObject)ConsesLow.list(sksi_kb_accessors.physical_field_name(required_field));
                                final SubLObject field_expressions = sksi_conjunctive_removal_module_utilities.get_field_expressions_for_physical_field(required_field, sk_source, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                                SubLObject successP = (SubLObject)sksi_removal_module_generation.NIL;
                                if (sksi_removal_module_generation.NIL == successP) {
                                    SubLObject csome_list_var_$33 = where_clause;
                                    SubLObject where_expression = (SubLObject)sksi_removal_module_generation.NIL;
                                    where_expression = csome_list_var_$33.first();
                                    while (sksi_removal_module_generation.NIL == successP && sksi_removal_module_generation.NIL != csome_list_var_$33) {
                                        if (sksi_removal_module_generation.NIL != sksi_conjunctive_removal_module_utilities.where_expression_contains_value_for_field_expressionP(where_expression, naked_field_name)) {
                                            successP = (SubLObject)sksi_removal_module_generation.T;
                                        }
                                        else if (sksi_removal_module_generation.NIL == successP) {
                                            SubLObject csome_list_var_$34 = field_expressions;
                                            SubLObject field_expression = (SubLObject)sksi_removal_module_generation.NIL;
                                            field_expression = csome_list_var_$34.first();
                                            while (sksi_removal_module_generation.NIL == successP && sksi_removal_module_generation.NIL != csome_list_var_$34) {
                                                if (sksi_removal_module_generation.NIL != sksi_conjunctive_removal_module_utilities.where_expression_contains_value_for_field_expressionP(where_expression, field_expression)) {
                                                    successP = (SubLObject)sksi_removal_module_generation.T;
                                                }
                                                csome_list_var_$34 = csome_list_var_$34.rest();
                                                field_expression = csome_list_var_$34.first();
                                            }
                                        }
                                        csome_list_var_$33 = csome_list_var_$33.rest();
                                        where_expression = csome_list_var_$33.first();
                                    }
                                }
                                failureP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == successP);
                                csome_list_var = csome_list_var.rest();
                                required_field = csome_list_var.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$31, (SubLObject)sksi_removal_module_generation.$list199);
                    }
                }
                else {
                    failureP = (SubLObject)sksi_removal_module_generation.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_removal_module_generation.$list198);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 115787L)
    public static SubLObject sksi_generate_raw_symbols_for_relevant_physical_field_indexicals(final SubLObject relevant_physical_field_indexicals) {
        SubLObject tuple_output = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(relevant_physical_field_indexicals), i = (SubLObject)sksi_removal_module_generation.NIL, i = (SubLObject)sksi_removal_module_generation.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)sksi_removal_module_generation.ONE_INTEGER)) {
            tuple_output = (SubLObject)ConsesLow.cons(token_raw_symbol_for_termnum(number_utilities.f_1X(i)), tuple_output);
        }
        return Sequences.nreverse(tuple_output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 116206L)
    public static SubLObject cycl_token_for_logical_field_indexical(final SubLObject lfi, final SubLObject sentence) {
        final SubLObject termnum = cycl_utilities.arg_positions_bfs(lfi, sentence, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL)).first();
        return token_cycl_symbol_for_termnum(termnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 116398L)
    public static SubLObject logical_field_indexical_positions_in_sentence(final SubLObject lfi, final SubLObject sentence) {
        final SubLObject termnum = cycl_utilities.arg_positions_bfs(lfi, sentence, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL)).first();
        return termnum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 116565L)
    public static SubLObject sksi_referenced_logical_field_indexicals(final SubLObject sentence, final SubLObject termnums) {
        SubLObject logical_field_indexicals = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = termnums;
        SubLObject termnum = (SubLObject)sksi_removal_module_generation.NIL;
        termnum = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject lfi = cycl_utilities.formula_arg_position(sentence, termnum, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            if (sksi_removal_module_generation.NIL != sksi_kb_accessors.logical_field_indexical_p(lfi)) {
                logical_field_indexicals = (SubLObject)ConsesLow.cons(lfi, logical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            termnum = cdolist_list_var.first();
        }
        return Sequences.nreverse(logical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 116973L)
    public static SubLObject token_cycl_symbol_for_termnum(final SubLObject termnum) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str200$CYCL_TERM, format_nil.format_nil_a_no_copy(termnum)), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 117085L)
    public static SubLObject token_raw_symbol_for_termnum(final SubLObject termnum) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str201$RAW_TERM, format_nil.format_nil_a_no_copy(termnum)), (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 117260L)
    public static SubLObject token_raw_symbol_for_cycl_symbol(final SubLObject cycl_symbol) {
        final SubLObject cycl_name = Symbols.symbol_name(cycl_symbol);
        final SubLObject postfix = string_utilities.substring(cycl_name, (SubLObject)sksi_removal_module_generation.FOUR_INTEGER, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject raw_name = Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str202$RAW, postfix);
        return Packages.intern(raw_name, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 117480L)
    public static SubLObject token_cycl_symbol_for_raw_symbol(final SubLObject raw_symbol) {
        final SubLObject raw_name = Symbols.symbol_name(raw_symbol);
        final SubLObject postfix = string_utilities.substring(raw_name, (SubLObject)sksi_removal_module_generation.THREE_INTEGER, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        final SubLObject cycl_name = Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str203$CYCL, postfix);
        return Packages.intern(cycl_name, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 117699L)
    public static SubLObject sentence_termnums_containing_logical_field_indexicals(final SubLObject sentence) {
        final SubLObject logical_field_indexicals_appearing = list_utilities.fast_delete_duplicates(list_utilities.tree_gather_ordered(sentence, (SubLObject)sksi_removal_module_generation.$sym55$LOGICAL_FIELD_INDEXICAL_P, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.IDENTITY), (SubLObject)sksi_removal_module_generation.NIL), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        SubLObject termnums = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = logical_field_indexicals_appearing;
        SubLObject lfi = (SubLObject)sksi_removal_module_generation.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            final SubLObject positions = cycl_utilities.arg_positions_bfs(lfi, sentence, Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQUAL));
            termnums = (SubLObject)ConsesLow.cons(positions, termnums);
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        return Sequences.nreverse(termnums);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 118716L)
    public static SubLObject required_pattern_is_checkP(final SubLObject required_pattern) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_removal_module_generation.NIL == cycl_utilities.expression_find((SubLObject)sksi_removal_module_generation.$kw81$NOT_FULLY_BOUND, required_pattern, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED) && sksi_removal_module_generation.NIL == cycl_utilities.expression_find((SubLObject)sksi_removal_module_generation.$kw103$UNIFY, required_pattern, (SubLObject)sksi_removal_module_generation.T, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119245L)
    public static SubLObject virtual_assertion_count() {
        return sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119323L)
    public static SubLObject increment_virtual_assertion_count(final SubLObject delta_count) {
        sksi_removal_module_generation.$virtual_assertion_count$.setGlobalValue(Numbers.add(sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue(), Numbers.round(delta_count, (SubLObject)sksi_removal_module_generation.UNPROVIDED)));
        return sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119478L)
    public static SubLObject decrement_virtual_assertion_count(final SubLObject delta_count) {
        sksi_removal_module_generation.$virtual_assertion_count$.setGlobalValue(Numbers.subtract(sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue(), Numbers.round(delta_count, (SubLObject)sksi_removal_module_generation.UNPROVIDED)));
        return sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119633L)
    public static SubLObject clear_virtual_assertion_count() {
        sksi_removal_module_generation.$virtual_assertion_count$.setGlobalValue((SubLObject)sksi_removal_module_generation.ZERO_INTEGER);
        clear_assertion_count_for_mt_table();
        return sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119873L)
    public static SubLObject mt_virtual_assertion_count_table() {
        return sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 119970L)
    public static SubLObject increment_assertion_count_for_mt(final SubLObject mt, final SubLObject assertion_count) {
        SubLObject current_count = Hashtables.gethash(mt, sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue(), (SubLObject)sksi_removal_module_generation.ZERO_INTEGER);
        current_count = Numbers.add(current_count, Numbers.round(assertion_count, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        Hashtables.sethash(mt, sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue(), current_count);
        increment_virtual_assertion_count(assertion_count);
        return current_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 120314L)
    public static SubLObject decrement_assertion_count_for_mt(final SubLObject mt, final SubLObject assertion_count) {
        SubLObject current_count = Hashtables.gethash(mt, sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue(), (SubLObject)sksi_removal_module_generation.ZERO_INTEGER);
        current_count = Numbers.subtract(current_count, Numbers.round(assertion_count, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        if (current_count.isPositive()) {
            Hashtables.sethash(mt, sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue(), current_count);
        }
        else {
            Hashtables.remhash(mt, sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue());
        }
        decrement_virtual_assertion_count(assertion_count);
        return current_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 120740L)
    public static SubLObject clear_assertion_count_for_mt_table() {
        return Hashtables.clrhash(sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 121112L)
    public static SubLObject sksi_module_code_mapping_terms(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$.getGlobalValue(), hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 121265L)
    public static SubLObject note_sksi_module_code_mapping_terms(final SubLObject hl_module, final SubLObject module_relevant_code_mapping_terms) {
        return dictionary.dictionary_enter(sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$.getGlobalValue(), hl_module, module_relevant_code_mapping_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 121477L)
    public static SubLObject unnote_sksi_module_code_mapping_terms(final SubLObject hl_module) {
        return dictionary.dictionary_remove(sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$.getGlobalValue(), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 121622L)
    public static SubLObject clear_sksi_module_code_mapping_terms_cache() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 121909L)
    public static SubLObject sksi_module_logical_schemas(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values(sksi_removal_module_generation.$sksi_module_logical_schemas_cache$.getGlobalValue(), hl_module, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 122056L)
    public static SubLObject note_sksi_module_logical_schemas(final SubLObject hl_module, final SubLObject module_relevant_logical_schemas) {
        return dictionary.dictionary_enter(sksi_removal_module_generation.$sksi_module_logical_schemas_cache$.getGlobalValue(), hl_module, module_relevant_logical_schemas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 122256L)
    public static SubLObject unnote_sksi_module_logical_schemas(final SubLObject hl_module) {
        return dictionary.dictionary_remove(sksi_removal_module_generation.$sksi_module_logical_schemas_cache$.getGlobalValue(), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 122395L)
    public static SubLObject clear_sksi_module_logical_schemas_cache() {
        return dictionary.clear_dictionary(sksi_removal_module_generation.$sksi_module_logical_schemas_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 122519L)
    public static SubLObject deregister_sksi_supported_browsing() {
        sksi_external_browser_utilities.clear_sksi_supported_browsing_caches();
        clear_sksi_module_code_mapping_terms_cache();
        clear_sksi_module_logical_schemas_cache();
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 122845L)
    public static SubLObject sksi_module_adequate_for_browsing_supportP(final SubLObject required_pattern, final SubLObject predicate_list, final SubLObject relevant_code_mapping_schemas_or_terms) {
        final SubLObject all_variablesP = sksi_fully_unbound_required_pattern_termsP(cycl_utilities.formula_args(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        final SubLObject relevant_code_mapping_arg_positions = (SubLObject)((sksi_removal_module_generation.NIL != all_variablesP) ? sksi_removal_module_generation.NIL : Mapping.mapcar((SubLObject)sksi_removal_module_generation.$sym93$FIRST, relevant_code_mapping_schemas_or_terms));
        if (sksi_removal_module_generation.NIL == all_variablesP && sksi_removal_module_generation.NIL == sksi_fully_unbound_required_pattern_termsP(cycl_utilities.formula_args(list_utilities.remove_nths(relevant_code_mapping_arg_positions, required_pattern), (SubLObject)sksi_removal_module_generation.UNPROVIDED))) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (sksi_removal_module_generation.NIL != predicate_list && sksi_removal_module_generation.NIL == sksi_fully_bound_required_pattern_termP(cycl_utilities.formula_operator(required_pattern))) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        return Values.values((SubLObject)sksi_removal_module_generation.T, all_variablesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124109L)
    public static SubLObject sksi_fully_bound_required_pattern_termP(final SubLObject required_pattern_term) {
        return list_utilities.not_eq(required_pattern_term, (SubLObject)sksi_removal_module_generation.$kw81$NOT_FULLY_BOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124260L)
    public static SubLObject sksi_removal_module_assertion_count(final SubLObject hl_module) {
        SubLObject count = inference_modules.hl_module_cost_expression(hl_module);
        if (sksi_removal_module_generation.NIL == count) {
            count = list_utilities.last_one(inference_modules.hl_module_cost_pattern(hl_module));
        }
        if (count.isNumber()) {
            count = Numbers.round(count, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        else {
            count = (SubLObject)sksi_removal_module_generation.NIL;
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124624L)
    public static SubLObject sksi_module_any_predicates_list_internal(final SubLObject module) {
        return list_utilities.remove_if_not((SubLObject)sksi_removal_module_generation.$sym209$SKSI_SUPPORTED_PREDICATE_TYPE_P, inference_modules.hl_module_any_predicates(module), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124624L)
    public static SubLObject sksi_module_any_predicates_list(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return sksi_module_any_predicates_list_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym208$SKSI_MODULE_ANY_PREDICATES_LIST, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym208$SKSI_MODULE_ANY_PREDICATES_LIST, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQ, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym208$SKSI_MODULE_ANY_PREDICATES_LIST, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_module_any_predicates_list_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 124955L)
    public static SubLObject register_sksi_supported_browsing_for_module(final SubLObject hl_module, final SubLObject meaning_sentence, final SubLObject required_pattern, final SubLObject relevant_code_mapping_schemas, final SubLObject relevant_instance_named_fn_colls, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate_list = sksi_module_any_predicates_list(hl_module);
        final SubLObject generic_moduleP = list_utilities.sublisp_boolean(predicate_list);
        thread.resetMultipleValues();
        final SubLObject browsing_supportP = sksi_module_adequate_for_browsing_supportP(required_pattern, predicate_list, ConsesLow.append(relevant_code_mapping_schemas, relevant_instance_named_fn_colls));
        final SubLObject normal_term_browsingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_removal_module_generation.NIL != browsing_supportP) {
            final SubLObject required_mt = inference_modules.hl_module_required_mt(hl_module);
            final SubLObject fort_arguments = keyhash_utilities.fast_intersection(cycl_utilities.formula_forts(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), cycl_utilities.formula_args(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            final SubLObject count = sksi_removal_module_assertion_count(hl_module);
            if (sksi_removal_module_generation.NIL == predicate_list) {
                final SubLObject pred = inference_modules.hl_module_predicate(hl_module);
                if (sksi_removal_module_generation.NIL != pred) {
                    predicate_list = (SubLObject)ConsesLow.list(pred);
                }
            }
            if (sksi_removal_module_generation.NIL != normal_term_browsingP) {
                final SubLObject term_arguments = keyhash_utilities.fast_intersection(cycl_utilities.formula_forts(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED), cycl_utilities.formula_args(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                if (sksi_removal_module_generation.NIL != count) {
                    increment_virtual_assertion_count(count);
                }
                sksi_sks_predicate_indexing.register_sksi_supported_predicates(predicate_list, meaning_sentence, required_pattern, required_mt, (SubLObject)((sksi_removal_module_generation.NIL != generic_moduleP) ? sksi_removal_module_generation.NIL : count), hl_module);
                sksi_sks_mt_indexing.register_sksi_supported_mt(required_mt, predicate_list, required_pattern, (SubLObject)((sksi_removal_module_generation.NIL != generic_moduleP) ? sksi_removal_module_generation.NIL : count), hl_module);
                final SubLObject fort_count = list_utilities.tree_count_if((SubLObject)sksi_removal_module_generation.$sym211$FORT_P, fort_arguments, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                if (fort_count.numG(sksi_removal_module_generation.$sksi_supported_gaf_argument_browsing_max_term_cutoff$.getDynamicValue(thread))) {
                    if (sksi_removal_module_generation.NIL != sksi_removal_module_generation.$show_sksi_supported_gaf_argument_browsing_skipsP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)sksi_removal_module_generation.$str212$Too_many_term_arguments___S__for_, fort_count, meaning_sentence);
                    }
                }
                else if (sksi_removal_module_generation.NIL != term_arguments) {
                    sksi_sks_gaf_arg_indexing.register_sksi_supported_gaf_arguments(fort_arguments, (SubLObject)sksi_removal_module_generation.NIL, required_pattern, predicate_list, required_mt, (SubLObject)((sksi_removal_module_generation.NIL != generic_moduleP) ? sksi_removal_module_generation.NIL : count), hl_module);
                }
            }
            else if (sksi_removal_module_generation.NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern)) {
                final SubLObject code_mapping_terms = gather_cycl_terms_mapped_to_by_code_mapping_schemas(relevant_code_mapping_schemas);
                final SubLObject instance_named_fn_coll_instances = gather_cycl_terms_mapped_to_by_instance_named_fn_collections(relevant_instance_named_fn_colls, content_mt);
                final SubLObject all_terms = ConsesLow.nconc(code_mapping_terms, instance_named_fn_coll_instances);
                final SubLObject term_count = list_utilities.tree_count_if((SubLObject)sksi_removal_module_generation.$sym211$FORT_P, all_terms, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                if (term_count.numG(sksi_removal_module_generation.$sksi_supported_gaf_argument_browsing_max_term_cutoff$.getDynamicValue(thread))) {
                    if (sksi_removal_module_generation.NIL != sksi_removal_module_generation.$show_sksi_supported_gaf_argument_browsing_skipsP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)sksi_removal_module_generation.$str213$Too_many_code_mapping_terms___S__, term_count, meaning_sentence);
                    }
                }
                else if (sksi_removal_module_generation.NIL != all_terms) {
                    sksi_sks_gaf_arg_indexing.register_sksi_supported_gaf_arguments((SubLObject)sksi_removal_module_generation.NIL, all_terms, required_pattern, predicate_list, required_mt, (SubLObject)sksi_removal_module_generation.NIL, hl_module);
                    note_sksi_module_code_mapping_terms(hl_module, all_terms);
                }
            }
            if (sksi_removal_module_generation.NIL != relevant_code_mapping_schemas && sksi_removal_module_generation.NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern)) {
                sksi_external_term_browser.register_sksi_supported_external_terms(relevant_code_mapping_schemas, meaning_sentence, required_pattern, predicate_list, required_mt, (SubLObject)sksi_removal_module_generation.NIL, hl_module);
                note_sksi_module_logical_schemas(hl_module, relevant_code_mapping_schemas);
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 129292L)
    public static SubLObject module_required_pattern_adequate_for_gaf_argument_browsing_supportP(final SubLObject required_pattern) {
        return list_utilities.occurs_at_most_n_timesP((SubLObject)sksi_removal_module_generation.$kw76$FULLY_BOUND, required_pattern.rest(), (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 129552L)
    public static SubLObject gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal(final SubLObject code_mapping_schemas) {
        SubLObject code_mapping_terms = (SubLObject)sksi_removal_module_generation.NIL;
        SubLObject cdolist_list_var = code_mapping_schemas;
        SubLObject arg_pos_code_mapping_schemas_pair = (SubLObject)sksi_removal_module_generation.NIL;
        arg_pos_code_mapping_schemas_pair = cdolist_list_var.first();
        while (sksi_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_code_mapping_schemas_pair;
            SubLObject arg_pos = (SubLObject)sksi_removal_module_generation.NIL;
            SubLObject code_mapping_schemas_$35 = (SubLObject)sksi_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list215);
            arg_pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list215);
            code_mapping_schemas_$35 = current.first();
            current = current.rest();
            if (sksi_removal_module_generation.NIL == current) {
                SubLObject cdolist_list_var_$36 = code_mapping_schemas_$35;
                SubLObject code_mapping_schema = (SubLObject)sksi_removal_module_generation.NIL;
                code_mapping_schema = cdolist_list_var_$36.first();
                while (sksi_removal_module_generation.NIL != cdolist_list_var_$36) {
                    if (arg_pos.numG((SubLObject)sksi_removal_module_generation.ZERO_INTEGER)) {
                        final SubLObject cycl_terms = sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema);
                        if (sksi_removal_module_generation.NIL != cycl_terms) {
                            code_mapping_terms = ConsesLow.nconc(code_mapping_terms, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(arg_pos, cycl_terms)));
                        }
                    }
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    code_mapping_schema = cdolist_list_var_$36.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list215);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_code_mapping_schemas_pair = cdolist_list_var.first();
        }
        return code_mapping_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 129552L)
    public static SubLObject gather_cycl_terms_mapped_to_by_code_mapping_schemas(final SubLObject code_mapping_schemas) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_removal_module_generation.NIL;
        if (sksi_removal_module_generation.NIL == v_memoization_state) {
            return gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal(code_mapping_schemas);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym214$GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        if (sksi_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_removal_module_generation.$sym214$GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS, (SubLObject)sksi_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_removal_module_generation.NIL, (SubLObject)sksi_removal_module_generation.EQUAL, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_removal_module_generation.$sym214$GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, code_mapping_schemas, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal(code_mapping_schemas)));
            memoization_state.caching_state_put(caching_state, code_mapping_schemas, results, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 130675L)
    public static SubLObject gather_cycl_terms_mapped_to_by_instance_named_fn_collections(final SubLObject instance_named_fn_colls, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(content_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(content_mt), thread);
            SubLObject cdolist_list_var = instance_named_fn_colls;
            SubLObject arg_pos_colls_pair = (SubLObject)sksi_removal_module_generation.NIL;
            arg_pos_colls_pair = cdolist_list_var.first();
            while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = arg_pos_colls_pair;
                SubLObject arg_pos = (SubLObject)sksi_removal_module_generation.NIL;
                SubLObject colls = (SubLObject)sksi_removal_module_generation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list216);
                arg_pos = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_removal_module_generation.$list216);
                colls = current.first();
                current = current.rest();
                if (sksi_removal_module_generation.NIL == current) {
                    SubLObject cdolist_list_var_$37 = colls;
                    SubLObject coll = (SubLObject)sksi_removal_module_generation.NIL;
                    coll = cdolist_list_var_$37.first();
                    while (sksi_removal_module_generation.NIL != cdolist_list_var_$37) {
                        final SubLObject cycl_terms = sksi_infrastructure_utilities.all_fort_instances_memoized(coll, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                        if (sksi_removal_module_generation.NIL != cycl_terms) {
                            result = ConsesLow.nconc(result, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(arg_pos, cycl_terms)));
                        }
                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                        coll = cdolist_list_var_$37.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_removal_module_generation.$list216);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_pos_colls_pair = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 131161L)
    public static SubLObject deregister_sksi_supported_browsing_for_module(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject required_pattern = sksi_module_simple_required_pattern(hl_module);
        SubLObject predicate_list = sksi_module_any_predicates_list(hl_module);
        final SubLObject code_mapping_terms = sksi_module_code_mapping_terms(hl_module);
        final SubLObject logical_schemas = sksi_module_logical_schemas(hl_module);
        final SubLObject generic_moduleP = list_utilities.sublisp_boolean(predicate_list);
        thread.resetMultipleValues();
        final SubLObject browsing_supportP = sksi_module_adequate_for_browsing_supportP(required_pattern, predicate_list, ConsesLow.append(code_mapping_terms, logical_schemas));
        final SubLObject normal_term_browsingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_removal_module_generation.NIL != browsing_supportP) {
            final SubLObject mt = inference_modules.hl_module_required_mt_result(hl_module);
            final SubLObject count = sksi_removal_module_assertion_count(hl_module);
            if (sksi_removal_module_generation.NIL == predicate_list) {
                predicate_list = (SubLObject)ConsesLow.list(inference_modules.hl_module_predicate(hl_module));
            }
            if (sksi_removal_module_generation.NIL != normal_term_browsingP) {
                if (sksi_removal_module_generation.NIL != count) {
                    decrement_virtual_assertion_count(count);
                }
                final SubLObject term_arguments = keyhash_utilities.fast_intersection((SubLObject)((sksi_removal_module_generation.NIL != required_pattern) ? cycl_utilities.formula_forts(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED) : sksi_removal_module_generation.NIL), cycl_utilities.formula_args(required_pattern, (SubLObject)sksi_removal_module_generation.UNPROVIDED), (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED);
                SubLObject cdolist_list_var = predicate_list;
                SubLObject predicate = (SubLObject)sksi_removal_module_generation.NIL;
                predicate = cdolist_list_var.first();
                while (sksi_removal_module_generation.NIL != cdolist_list_var) {
                    if (sksi_removal_module_generation.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(predicate, mt)) {
                        sksi_sks_predicate_indexing.deregister_sksi_supported_predicate(predicate, mt, hl_module, (SubLObject)((sksi_removal_module_generation.NIL != generic_moduleP) ? sksi_removal_module_generation.NIL : count));
                        sksi_sks_mt_indexing.deregister_sksi_supported_mt(mt, predicate, hl_module, (SubLObject)((sksi_removal_module_generation.NIL != generic_moduleP) ? sksi_removal_module_generation.NIL : count));
                        if (sksi_removal_module_generation.NIL != term_arguments) {
                            sksi_sks_gaf_arg_indexing.deregister_sksi_supported_gaf_arguments(term_arguments, (SubLObject)sksi_removal_module_generation.NIL, required_pattern, predicate, mt, hl_module, (SubLObject)((sksi_removal_module_generation.NIL != generic_moduleP) ? sksi_removal_module_generation.NIL : count));
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    predicate = cdolist_list_var.first();
                }
            }
            else if (sksi_removal_module_generation.NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern)) {
                SubLObject cdolist_list_var2 = predicate_list;
                SubLObject predicate2 = (SubLObject)sksi_removal_module_generation.NIL;
                predicate2 = cdolist_list_var2.first();
                while (sksi_removal_module_generation.NIL != cdolist_list_var2) {
                    if (sksi_removal_module_generation.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(predicate2, mt)) {
                        sksi_sks_gaf_arg_indexing.deregister_sksi_supported_gaf_arguments((SubLObject)sksi_removal_module_generation.NIL, code_mapping_terms, required_pattern, predicate2, mt, hl_module, (SubLObject)sksi_removal_module_generation.NIL);
                    }
                    unnote_sksi_module_code_mapping_terms(hl_module);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    predicate2 = cdolist_list_var2.first();
                }
            }
            if (sksi_removal_module_generation.NIL != logical_schemas && sksi_removal_module_generation.NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern)) {
                SubLObject cdolist_list_var2 = predicate_list;
                SubLObject predicate2 = (SubLObject)sksi_removal_module_generation.NIL;
                predicate2 = cdolist_list_var2.first();
                while (sksi_removal_module_generation.NIL != cdolist_list_var2) {
                    if (sksi_removal_module_generation.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(predicate2, mt)) {
                        sksi_external_term_browser.deregister_sksi_supported_external_terms(logical_schemas, predicate2, mt, hl_module, (SubLObject)sksi_removal_module_generation.NIL);
                    }
                    unnote_sksi_module_logical_schemas(hl_module);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    predicate2 = cdolist_list_var2.first();
                }
            }
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 134355L)
    public static SubLObject sksi_removal_module_generation_error(final SubLObject cycl, final SubLObject error_message) {
        if (sksi_removal_module_generation.NIL != sksi_debugging.sksi_ignore_registration_errorsP()) {
            return (SubLObject)sksi_removal_module_generation.NIL;
        }
        if (sksi_removal_module_generation.NIL != sksi_debugging.sksi_warn_on_registration_errorsP()) {
            return Errors.warn(error_message);
        }
        if (sksi_removal_module_generation.NIL != sksi_debugging.sksi_break_on_registration_errorsP()) {
            final SubLObject cont_string = Sequences.cconcatenate((SubLObject)sksi_removal_module_generation.$str217$Continue_without_generating_remov, format_nil.format_nil_a_no_copy(cycl));
            return Errors.cerror(cont_string, error_message);
        }
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-removal-module-generation.lisp", position = 134811L)
    public static SubLObject sksi_meaning_sentence_gaf_infos_error(final SubLObject meaning_sentence_gaf, final SubLObject error_message) {
        return sksi_removal_module_generation_error(meaning_sentence_gaf, error_message);
    }
    
    public static SubLObject declare_sksi_removal_module_generation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_p", "SKSI-MODULE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "do_sksi_modules", "DO-SKSI-MODULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "do_sksi_modules_list", "DO-SKSI-MODULES-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_modules_count", "SKSI-MODULES-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "some_sksi_single_literal_removal_module_registeredP", "SOME-SKSI-SINGLE-LITERAL-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module", "NOTE-SKSI-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_sksi_module", "UN-NOTE-SKSI-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_all_sksi_modules", "UN-NOTE-ALL-SKSI-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module_supports", "NOTE-SKSI-MODULE-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_sksi_module_supports", "UN-NOTE-SKSI-MODULE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_all_sksi_module_supports", "UN-NOTE-ALL-SKSI-MODULE-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_supports", "SKSI-MODULE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module_simple_required_pattern", "NOTE-SKSI-MODULE-SIMPLE-REQUIRED-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_sksi_module_simple_required_pattern", "UN-NOTE-SKSI-MODULE-SIMPLE-REQUIRED-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_all_sksi_module_simple_required_patterns", "UN-NOTE-ALL-SKSI-MODULE-SIMPLE-REQUIRED-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_simple_required_pattern", "SKSI-MODULE-SIMPLE-REQUIRED-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_multiply_indexed_conditional_meaning_sentence_for_sks", "NOTE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_multiply_indexed_conditional_meaning_sentence_for_sks", "UN-NOTE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "multiply_indexed_conditional_meaning_sentence_noted_for_sksP", "MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-NOTED-FOR-SKS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_all_multiply_indexed_conditional_meaning_sentences", "UN-NOTE-ALL-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module_multiply_indexed_conditional_meaning_sentence", "NOTE-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_sksi_module_multiply_indexed_conditional_meaning_sentence", "UN-NOTE-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_all_sksi_module_multiply_indexed_conditional_meaning_sentences", "UN-NOTE-ALL-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module_by_sks", "NOTE-SKSI-MODULE-BY-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_sksi_modules_by_sks", "UN-NOTE-SKSI-MODULES-BY-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_sksi_modules_by_sks_cache", "CLEAR-SKSI-MODULES-BY-SKS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "un_note_sksi_modules_by_sks_for_module", "UN-NOTE-SKSI-MODULES-BY-SKS-FOR-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_modules_by_sks_get_skses", "SKSI-MODULES-BY-SKS-GET-SKSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_modules_by_sks_find_modules", "SKSI-MODULES-BY-SKS-FIND-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_modules_by_sks_find_modules_with_children", "SKSI-MODULES-BY-SKS-FIND-MODULES-WITH-CHILDREN", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "do_code_mapping_sks_cache", "DO-CODE-MAPPING-SKS-CACHE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_code_mapping_sks", "NOTE-CODE-MAPPING-SKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "unnote_code_mapping_sks", "UNNOTE-CODE-MAPPING-SKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_code_mapping_sks_cache", "CLEAR-CODE-MAPPING-SKS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "code_mapping_sks_cache_lookup", "CODE-MAPPING-SKS-CACHE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "code_mapping_forward_rules_to_repropagate_internal", "CODE-MAPPING-FORWARD-RULES-TO-REPROPAGATE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "code_mapping_forward_rules_to_repropagate", "CODE-MAPPING-FORWARD-RULES-TO-REPROPAGATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_assert_code_mapping_sks_content", "SKSI-ASSERT-CODE-MAPPING-SKS-CONTENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_unassert_code_mapping_sks_content", "SKSI-UNASSERT-CODE-MAPPING-SKS-CONTENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "isa_removal_module_p", "ISA-REMOVAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_isa_sks_term_to_cycl_term_mts", "ADD-ISA-SKS-TERM-TO-CYCL-TERM-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_isa_sks_term_to_cycl_term_mts", "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "isa_sks_term_to_cycl_term_mt_relevantP", "ISA-SKS-TERM-TO-CYCL-TERM-MT-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_isa_sks_term_to_cycl_term_store", "ADD-ISA-SKS-TERM-TO-CYCL-TERM-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_isa_sks_term_to_cycl_term_store", "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "any_sks_term_spec_to_cycl_term_in_relevant_mtP", "ANY-SKS-TERM-SPEC-TO-CYCL-TERM-IN-RELEVANT-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_specs_for_term", "ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_specs_for_term_int_internal", "ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_specs_for_term_int", "ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_isas", "ALL-SKSI-RELEVANT-REWRITE-ISAS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_isas_int_internal", "ALL-SKSI-RELEVANT-REWRITE-ISAS-INT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_isas_int", "ALL-SKSI-RELEVANT-REWRITE-ISAS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_isa_sks_term_to_cycl_term", "ADD-ISA-SKS-TERM-TO-CYCL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_isa_sks_term_to_cycl_term", "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "store_sksi_isa_module_rewrite_info", "STORE-SKSI-ISA-MODULE-REWRITE-INFO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "genls_rewrite_supported_term_p", "GENLS-REWRITE-SUPPORTED-TERM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "gather_code_mapping_arg2s", "GATHER-CODE-MAPPING-ARG2S", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "recalculate_sksi_isa_module_rewrite_info", "RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "filtered_sksi_predP", "FILTERED-SKSI-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_to_meaning_sentence_mts", "ADD-TO-MEANING-SENTENCE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_meaning_sentence_mts", "CLEAR-MEANING-SENTENCE-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "any_sksi_meaning_sentence_mt_relevantP", "ANY-SKSI-MEANING-SENTENCE-MT-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "meaning_sentence_pred_store_count", "MEANING-SENTENCE-PRED-STORE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "meaning_sentence_predP", "MEANING-SENTENCE-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_meaning_sentence_pred_to_store", "ADD-MEANING-SENTENCE-PRED-TO-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_meaning_sentence_pred_store", "CLEAR-MEANING-SENTENCE-PRED-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "any_sksi_meaning_sentence_spec_predP", "ANY-SKSI-MEANING-SENTENCE-SPEC-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "any_sksi_meaning_sentence_spec_inverseP", "ANY-SKSI-MEANING-SENTENCE-SPEC-INVERSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_spec_preds_for_pred", "ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal", "ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_spec_preds_for_pred_int", "ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_spec_inverses_for_pred", "ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal", "ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "all_sksi_relevant_rewrite_spec_inverses_for_pred_int", "ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_meaning_sentence_pred", "ADD-MEANING-SENTENCE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_meaning_sentence_preds", "CLEAR-MEANING-SENTENCE-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "store_sksi_module_rewrite_pred_info", "STORE-SKSI-MODULE-REWRITE-PRED-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "recalculate_sksi_rewrite_pred_info", "RECALCULATE-SKSI-REWRITE-PRED-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "store_sksi_module_rewrite_info", "STORE-SKSI-MODULE-REWRITE-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "recalculate_sksi_rewrite_info", "RECALCULATE-SKSI-REWRITE-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_sksi_rewrite_info", "CLEAR-SKSI-REWRITE-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "register_sksi_removal_modules_for_sks", "REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "register_sksi_removal_modules_for_just_sks", "REGISTER-SKSI-REMOVAL-MODULES-FOR-JUST-SKS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "repropagate_code_mapping_forward_rules", "REPROPAGATE-CODE-MAPPING-FORWARD-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "deregister_sksi_removal_modules_for_sks", "DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "deregister_sksi_removal_modules_for_just_sks", "DEREGISTER-SKSI-REMOVAL-MODULES-FOR-JUST-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "deregister_sksi_removal_module", "DEREGISTER-SKSI-REMOVAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "deregister_all_sksi_removal_modules", "DEREGISTER-ALL-SKSI-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_info_p", "MODULE-INFO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "new_module_info", "NEW-MODULE-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_info_add", "MODULE-INFO-ADD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_info_push", "MODULE-INFO-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_info_get", "MODULE-INFO-GET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_info_remove", "MODULE-INFO-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_info_to_inference_module_info", "MODULE-INFO-TO-INFERENCE-MODULE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "inference_removal_module_info", "INFERENCE-REMOVAL-MODULE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "determine_module_info_name", "DETERMINE-MODULE-INFO-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sk_source_module_infos", "SK-SOURCE-MODULE-INFOS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "physical_schema_module_infos", "PHYSICAL-SCHEMA-MODULE-INFOS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "logical_schema_module_infos", "LOGICAL-SCHEMA-MODULE-INFOS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "meaning_sentence_gaf_module_infos", "MEANING-SENTENCE-GAF-MODULE-INFOS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "negated_atomic_meaning_sentence_module_infos", "NEGATED-ATOMIC-MEANING-SENTENCE-MODULE-INFOS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "pos_atomic_meaning_sentence_module_infos", "POS-ATOMIC-MEANING-SENTENCE-MODULE-INFOS", 6, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "conditional_meaning_sentence_gaf_module_infos", "CONDITIONAL-MEANING-SENTENCE-GAF-MODULE-INFOS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "condition_output_pattern", "CONDITION-OUTPUT-PATTERN", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_get_any_predicates_pattern_internal", "SKSI-GET-ANY-PREDICATES-PATTERN-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_get_any_predicates_pattern", "SKSI-GET-ANY-PREDICATES-PATTERN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_too_many_unbound_required_pattern_termsP", "SKSI-TOO-MANY-UNBOUND-REQUIRED-PATTERN-TERMS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_too_many_unbound_required_pattern_terms_intP", "SKSI-TOO-MANY-UNBOUND-REQUIRED-PATTERN-TERMS-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "antecedent_sentence_contains_restrictive_constraintP", "ANTECEDENT-SENTENCE-CONTAINS-RESTRICTIVE-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "non_logical_field_indexical_p", "NON-LOGICAL-FIELD-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_doomed_unless_arg_boundP", "SKSI-DOOMED-UNLESS-ARG-BOUND?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_valid_removal_module_required_patternP", "SKSI-VALID-REMOVAL-MODULE-REQUIRED-PATTERN?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "pos_atomic_meaning_sentence_required_pattern_infos", "POS-ATOMIC-MEANING-SENTENCE-REQUIRED-PATTERN-INFOS", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_fully_unbound_required_pattern_termsP", "SKSI-FULLY-UNBOUND-REQUIRED-PATTERN-TERMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_not_fully_bound_required_pattern_predicateP", "SKSI-NOT-FULLY-BOUND-REQUIRED-PATTERN-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "has_duplicate_keysP", "HAS-DUPLICATE-KEYS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "compute_boundedness_permutations_for_logical_field_indexical_termnums", "COMPUTE-BOUNDEDNESS-PERMUTATIONS-FOR-LOGICAL-FIELD-INDEXICAL-TERMNUMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "distinct_logical_field_termnum_bindingsP", "DISTINCT-LOGICAL-FIELD-TERMNUM-BINDINGS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "compute_meaning_sentence_required_patterns", "COMPUTE-MEANING-SENTENCE-REQUIRED-PATTERNS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "replace_pattern_parts", "REPLACE-PATTERN-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "replace_pattern_narts_with_nat_subpatterns", "REPLACE-PATTERN-NARTS-WITH-NAT-SUBPATTERNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "make_nat_subpattern", "MAKE-NAT-SUBPATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "nat_subpattern_p", "NAT-SUBPATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "nartify_nat_pattern", "NARTIFY-NAT-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "disjunctive_subpattern_p", "DISJUNCTIVE-SUBPATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "make_disjunctive_subpattern", "MAKE-DISJUNCTIVE-SUBPATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "make_unify_subpattern", "MAKE-UNIFY-SUBPATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "unify_subpattern_p", "UNIFY-SUBPATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "replace_pattern_nauts_with_unify_subpatterns", "REPLACE-PATTERN-NAUTS-WITH-UNIFY-SUBPATTERNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "replace_pattern_forts_with_unify_subpatterns", "REPLACE-PATTERN-FORTS-WITH-UNIFY-SUBPATTERNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "non_sentential_relation_fort_p_internal", "NON-SENTENTIAL-RELATION-FORT-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "non_sentential_relation_fort_p", "NON-SENTENTIAL-RELATION-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "replace_pattern_special_subpatterns_with_forts", "REPLACE-PATTERN-SPECIAL-SUBPATTERNS-WITH-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "replace_pattern_special_subpatterns_with_anything", "REPLACE-PATTERN-SPECIAL-SUBPATTERNS-WITH-ANYTHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "add_cmls_pruning_to_required_pattern", "ADD-CMLS-PRUNING-TO-REQUIRED-PATTERN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_generate_sksi_slrm_required_function", "CLEAR-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "remove_generate_sksi_slrm_required_function", "REMOVE-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "generate_sksi_slrm_required_function_internal", "GENERATE-SKSI-SLRM-REQUIRED-FUNCTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "generate_sksi_slrm_required_function", "GENERATE-SKSI-SLRM-REQUIRED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "determine_sk_source_required_func_name", "DETERMINE-SK-SOURCE-REQUIRED-FUNC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_only_predicateP_internal", "SKSI-ONLY-PREDICATE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_only_predicateP", "SKSI-ONLY-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "required_info_module_info", "REQUIRED-INFO-MODULE-INFO", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_removal_module_completeness", "SKSI-REMOVAL-MODULE-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_make_documentation_string_from_required_pattern_and_sense", "SKSI-MAKE-DOCUMENTATION-STRING-FROM-REQUIRED-PATTERN-AND-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_input_extract_pattern", "SKSI-DETERMINE-INPUT-EXTRACT-PATTERN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_output_verify_pattern", "SKSI-DETERMINE-OUTPUT-VERIFY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_input_verify_pattern", "SKSI-DETERMINE-INPUT-VERIFY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_input_encode_pattern", "SKSI-DETERMINE-INPUT-ENCODE-PATTERN", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_reformulatable_via_templateP", "SKSI-REFORMULATABLE-VIA-TEMPLATE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_field_input_encode_pattern", "SKSI-DETERMINE-FIELD-INPUT-ENCODE-PATTERN", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_output_decode_pattern", "SKSI-DETERMINE-OUTPUT-DECODE-PATTERN", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_field_output_decode_pattern", "SKSI-DETERMINE-FIELD-OUTPUT-DECODE-PATTERN", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_field_output_decode_pattern_int", "SKSI-DETERMINE-FIELD-OUTPUT-DECODE-PATTERN-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "dummy_external_term_denoting_function_expression_p", "DUMMY-EXTERNAL-TERM-DENOTING-FUNCTION-EXPRESSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "gather_external_term_denoting_expressions_of_type_in_field_decoding", "GATHER-EXTERNAL-TERM-DENOTING-EXPRESSIONS-OF-TYPE-IN-FIELD-DECODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "field_decoding_contains_city_named_fn_expressionP", "FIELD-DECODING-CONTAINS-CITY-NAMED-FN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "gather_code_mapping_schemas_mentioned_in_field_decoding", "GATHER-CODE-MAPPING-SCHEMAS-MENTIONED-IN-FIELD-DECODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_output_construct_pattern", "SKSI-DETERMINE-OUTPUT-CONSTRUCT-PATTERN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "determine_output_construct_pattern_template_and_tuple_output", "DETERMINE-OUTPUT-CONSTRUCT-PATTERN-TEMPLATE-AND-TUPLE-OUTPUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_cost_pattern", "SKSI-DETERMINE-COST-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_removal_module_cost", "SKSI-REMOVAL-MODULE-COST", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_removal_module_logical_cost", "SKSI-REMOVAL-MODULE-LOGICAL-COST", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_removal_module_physical_cost", "SKSI-REMOVAL-MODULE-PHYSICAL-COST", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "substitute_logical_field_indexicals_with_physical_fields_list", "SUBSTITUTE-LOGICAL-FIELD-INDEXICALS-WITH-PHYSICAL-FIELDS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_output_generate_pattern", "SKSI-DETERMINE-OUTPUT-GENERATE-PATTERN", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_output_check_pattern", "SKSI-DETERMINE-OUTPUT-CHECK-PATTERN", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_output_csql_tuple_expression", "SKSI-DETERMINE-OUTPUT-CSQL-TUPLE-EXPRESSION", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_determine_csql_tuple_terms", "SKSI-DETERMINE-CSQL-TUPLE-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "required_fields_have_values_in_csqlP", "REQUIRED-FIELDS-HAVE-VALUES-IN-CSQL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_generate_raw_symbols_for_relevant_physical_field_indexicals", "SKSI-GENERATE-RAW-SYMBOLS-FOR-RELEVANT-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "cycl_token_for_logical_field_indexical", "CYCL-TOKEN-FOR-LOGICAL-FIELD-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "logical_field_indexical_positions_in_sentence", "LOGICAL-FIELD-INDEXICAL-POSITIONS-IN-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_referenced_logical_field_indexicals", "SKSI-REFERENCED-LOGICAL-FIELD-INDEXICALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "token_cycl_symbol_for_termnum", "TOKEN-CYCL-SYMBOL-FOR-TERMNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "token_raw_symbol_for_termnum", "TOKEN-RAW-SYMBOL-FOR-TERMNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "token_raw_symbol_for_cycl_symbol", "TOKEN-RAW-SYMBOL-FOR-CYCL-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "token_cycl_symbol_for_raw_symbol", "TOKEN-CYCL-SYMBOL-FOR-RAW-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sentence_termnums_containing_logical_field_indexicals", "SENTENCE-TERMNUMS-CONTAINING-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "required_pattern_is_checkP", "REQUIRED-PATTERN-IS-CHECK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "virtual_assertion_count", "VIRTUAL-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "increment_virtual_assertion_count", "INCREMENT-VIRTUAL-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "decrement_virtual_assertion_count", "DECREMENT-VIRTUAL-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_virtual_assertion_count", "CLEAR-VIRTUAL-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "mt_virtual_assertion_count_table", "MT-VIRTUAL-ASSERTION-COUNT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "increment_assertion_count_for_mt", "INCREMENT-ASSERTION-COUNT-FOR-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "decrement_assertion_count_for_mt", "DECREMENT-ASSERTION-COUNT-FOR-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_assertion_count_for_mt_table", "CLEAR-ASSERTION-COUNT-FOR-MT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_code_mapping_terms", "SKSI-MODULE-CODE-MAPPING-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module_code_mapping_terms", "NOTE-SKSI-MODULE-CODE-MAPPING-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "unnote_sksi_module_code_mapping_terms", "UNNOTE-SKSI-MODULE-CODE-MAPPING-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_sksi_module_code_mapping_terms_cache", "CLEAR-SKSI-MODULE-CODE-MAPPING-TERMS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_logical_schemas", "SKSI-MODULE-LOGICAL-SCHEMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "note_sksi_module_logical_schemas", "NOTE-SKSI-MODULE-LOGICAL-SCHEMAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "unnote_sksi_module_logical_schemas", "UNNOTE-SKSI-MODULE-LOGICAL-SCHEMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "clear_sksi_module_logical_schemas_cache", "CLEAR-SKSI-MODULE-LOGICAL-SCHEMAS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "deregister_sksi_supported_browsing", "DEREGISTER-SKSI-SUPPORTED-BROWSING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_adequate_for_browsing_supportP", "SKSI-MODULE-ADEQUATE-FOR-BROWSING-SUPPORT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_fully_bound_required_pattern_termP", "SKSI-FULLY-BOUND-REQUIRED-PATTERN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_removal_module_assertion_count", "SKSI-REMOVAL-MODULE-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_any_predicates_list_internal", "SKSI-MODULE-ANY-PREDICATES-LIST-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_module_any_predicates_list", "SKSI-MODULE-ANY-PREDICATES-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "register_sksi_supported_browsing_for_module", "REGISTER-SKSI-SUPPORTED-BROWSING-FOR-MODULE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "module_required_pattern_adequate_for_gaf_argument_browsing_supportP", "MODULE-REQUIRED-PATTERN-ADEQUATE-FOR-GAF-ARGUMENT-BROWSING-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal", "GATHER-CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMAS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "gather_cycl_terms_mapped_to_by_code_mapping_schemas", "GATHER-CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "gather_cycl_terms_mapped_to_by_instance_named_fn_collections", "GATHER-CYCL-TERMS-MAPPED-TO-BY-INSTANCE-NAMED-FN-COLLECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "deregister_sksi_supported_browsing_for_module", "DEREGISTER-SKSI-SUPPORTED-BROWSING-FOR-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_removal_module_generation_error", "SKSI-REMOVAL-MODULE-GENERATION-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation", "sksi_meaning_sentence_gaf_infos_error", "SKSI-MEANING-SENTENCE-GAF-INFOS-ERROR", 2, 0, false);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    public static SubLObject init_sksi_removal_module_generation_file() {
        sksi_removal_module_generation.$sksi_modules$ = SubLFiles.deflexical("*SKSI-MODULES*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym0$_SKSI_MODULES_)) ? sksi_removal_module_generation.$sksi_modules$.getGlobalValue() : set.new_set((SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_browsing_enabled$ = SubLFiles.defparameter("*SKSI-BROWSING-ENABLED*", (SubLObject)sksi_removal_module_generation.T);
        sksi_removal_module_generation.$sksi_module_supports$ = SubLFiles.deflexical("*SKSI-MODULE-SUPPORTS*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym6$_SKSI_MODULE_SUPPORTS_)) ? sksi_removal_module_generation.$sksi_module_supports$.getGlobalValue() : dictionary.new_dictionary((SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_module_simple_required_pattern$ = SubLFiles.deflexical("*SKSI-MODULE-SIMPLE-REQUIRED-PATTERN*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym7$_SKSI_MODULE_SIMPLE_REQUIRED_PATTERN_)) ? sksi_removal_module_generation.$sksi_module_simple_required_pattern$.getGlobalValue() : dictionary.new_dictionary((SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$ = SubLFiles.deflexical("*SKS-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym8$_SKS_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_)) ? sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$ = SubLFiles.deflexical("*SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym9$_SKSI_MODULE_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_)) ? sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_modules_by_sks$ = SubLFiles.deflexical("*SKSI-MODULES-BY-SKS*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym10$_SKSI_MODULES_BY_SKS_)) ? sksi_removal_module_generation.$sksi_modules_by_sks$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_code_mapping_sks_cache$ = SubLFiles.deflexical("*SKSI-CODE-MAPPING-SKS-CACHE*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym13$_SKSI_CODE_MAPPING_SKS_CACHE_)) ? sksi_removal_module_generation.$sksi_code_mapping_sks_cache$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$ = SubLFiles.deflexical("*ISA-SKS-TERM-TO-CYCL-TERM-MTS*", (SubLObject)((sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym28$_ISA_SKS_TERM_TO_CYCL_TERM_MTS_)) ? sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$.getGlobalValue() : sksi_removal_module_generation.NIL));
        sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$ = SubLFiles.deflexical("*ISA-SKS-TERM-TO-CYCL-TERM-STORE*", (SubLObject)((sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym30$_ISA_SKS_TERM_TO_CYCL_TERM_STORE_)) ? sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$.getGlobalValue() : sksi_removal_module_generation.NIL));
        sksi_removal_module_generation.$filtered_sksi_preds$ = SubLFiles.deflexical("*FILTERED-SKSI-PREDS*", (SubLObject)sksi_removal_module_generation.$list34);
        sksi_removal_module_generation.$meaning_sentence_mts$ = SubLFiles.deflexical("*MEANING-SENTENCE-MTS*", (SubLObject)((sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym35$_MEANING_SENTENCE_MTS_)) ? sksi_removal_module_generation.$meaning_sentence_mts$.getGlobalValue() : sksi_removal_module_generation.NIL));
        sksi_removal_module_generation.$meaning_sentence_pred_store$ = SubLFiles.deflexical("*MEANING-SENTENCE-PRED-STORE*", (SubLObject)((sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym36$_MEANING_SENTENCE_PRED_STORE_)) ? sksi_removal_module_generation.$meaning_sentence_pred_store$.getGlobalValue() : sksi_removal_module_generation.NIL));
        sksi_removal_module_generation.$sks_preference_modules_count$ = SubLFiles.defparameter("*SKS-PREFERENCE-MODULES-COUNT*", (SubLObject)sksi_removal_module_generation.NIL);
        sksi_removal_module_generation.$sks_prune_modules_count$ = SubLFiles.defparameter("*SKS-PRUNE-MODULES-COUNT*", (SubLObject)sksi_removal_module_generation.NIL);
        sksi_removal_module_generation.$sksi_specific_module_properties$ = SubLFiles.deflexical("*SKSI-SPECIFIC-MODULE-PROPERTIES*", (SubLObject)sksi_removal_module_generation.$list46);
        sksi_removal_module_generation.$generate_sksi_slrm_required_function_caching_state$ = SubLFiles.deflexical("*GENERATE-SKSI-SLRM-REQUIRED-FUNCTION-CACHING-STATE*", (SubLObject)sksi_removal_module_generation.NIL);
        sksi_removal_module_generation.$sksi_default_check_cost$ = SubLFiles.deflexical("*SKSI-DEFAULT-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        sksi_removal_module_generation.$virtual_assertion_count$ = SubLFiles.deflexical("*VIRTUAL-ASSERTION-COUNT*", (SubLObject)((sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym204$_VIRTUAL_ASSERTION_COUNT_)) ? sksi_removal_module_generation.$virtual_assertion_count$.getGlobalValue() : sksi_removal_module_generation.ZERO_INTEGER));
        sksi_removal_module_generation.$mt_virtual_assertion_count_table$ = SubLFiles.deflexical("*MT-VIRTUAL-ASSERTION-COUNT-TABLE*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym205$_MT_VIRTUAL_ASSERTION_COUNT_TABLE_)) ? sksi_removal_module_generation.$mt_virtual_assertion_count_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)sksi_removal_module_generation.SIXTEEN_INTEGER, (SubLObject)sksi_removal_module_generation.UNPROVIDED, (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$ = SubLFiles.deflexical("*SKSI-MODULE-CODE-MAPPING-TERMS-CACHE*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym206$_SKSI_MODULE_CODE_MAPPING_TERMS_CACHE_)) ? sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_module_logical_schemas_cache$ = SubLFiles.deflexical("*SKSI-MODULE-LOGICAL-SCHEMAS-CACHE*", (sksi_removal_module_generation.NIL != Symbols.boundp((SubLObject)sksi_removal_module_generation.$sym207$_SKSI_MODULE_LOGICAL_SCHEMAS_CACHE_)) ? sksi_removal_module_generation.$sksi_module_logical_schemas_cache$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_removal_module_generation.EQ), (SubLObject)sksi_removal_module_generation.UNPROVIDED));
        sksi_removal_module_generation.$sksi_supported_gaf_argument_browsing_max_term_cutoff$ = SubLFiles.defparameter("*SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-MAX-TERM-CUTOFF*", (SubLObject)sksi_removal_module_generation.$int210$5000);
        sksi_removal_module_generation.$show_sksi_supported_gaf_argument_browsing_skipsP$ = SubLFiles.defparameter("*SHOW-SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-SKIPS?*", (SubLObject)sksi_removal_module_generation.NIL);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    public static SubLObject setup_sksi_removal_module_generation_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym0$_SKSI_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym6$_SKSI_MODULE_SUPPORTS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym7$_SKSI_MODULE_SIMPLE_REQUIRED_PATTERN_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym8$_SKS_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym9$_SKSI_MODULE_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym10$_SKSI_MODULES_BY_SKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym13$_SKSI_CODE_MAPPING_SKS_CACHE_);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym20$CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym28$_ISA_SKS_TERM_TO_CYCL_TERM_MTS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym30$_ISA_SKS_TERM_TO_CYCL_TERM_STORE_);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym31$ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym32$ALL_SKSI_RELEVANT_REWRITE_ISAS_INT);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym35$_MEANING_SENTENCE_MTS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym36$_MEANING_SENTENCE_PRED_STORE_);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym37$ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym38$ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym70$SKSI_GET_ANY_PREDICATES_PATTERN);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym106$NON_SENTENTIAL_RELATION_FORT_P);
        memoization_state.note_globally_cached_function((SubLObject)sksi_removal_module_generation.$sym115$GENERATE_SKSI_SLRM_REQUIRED_FUNCTION);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym123$SKSI_ONLY_PREDICATE_);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_removal_module_generation.$sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym204$_VIRTUAL_ASSERTION_COUNT_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym205$_MT_VIRTUAL_ASSERTION_COUNT_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym206$_SKSI_MODULE_CODE_MAPPING_TERMS_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_removal_module_generation.$sym207$_SKSI_MODULE_LOGICAL_SCHEMAS_CACHE_);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym208$SKSI_MODULE_ANY_PREDICATES_LIST);
        memoization_state.note_memoized_function((SubLObject)sksi_removal_module_generation.$sym214$GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS);
        return (SubLObject)sksi_removal_module_generation.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_removal_module_generation_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_removal_module_generation_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_removal_module_generation_file();
    }
    
    static {
        me = (SubLFile)new sksi_removal_module_generation();
        sksi_removal_module_generation.$sksi_modules$ = null;
        sksi_removal_module_generation.$sksi_browsing_enabled$ = null;
        sksi_removal_module_generation.$sksi_module_supports$ = null;
        sksi_removal_module_generation.$sksi_module_simple_required_pattern$ = null;
        sksi_removal_module_generation.$sks_multiply_indexed_conditional_meaning_sentence_cache$ = null;
        sksi_removal_module_generation.$sksi_module_multiply_indexed_conditional_meaning_sentence_cache$ = null;
        sksi_removal_module_generation.$sksi_modules_by_sks$ = null;
        sksi_removal_module_generation.$sksi_code_mapping_sks_cache$ = null;
        sksi_removal_module_generation.$isa_sks_term_to_cycl_term_mts$ = null;
        sksi_removal_module_generation.$isa_sks_term_to_cycl_term_store$ = null;
        sksi_removal_module_generation.$filtered_sksi_preds$ = null;
        sksi_removal_module_generation.$meaning_sentence_mts$ = null;
        sksi_removal_module_generation.$meaning_sentence_pred_store$ = null;
        sksi_removal_module_generation.$sks_preference_modules_count$ = null;
        sksi_removal_module_generation.$sks_prune_modules_count$ = null;
        sksi_removal_module_generation.$sksi_specific_module_properties$ = null;
        sksi_removal_module_generation.$generate_sksi_slrm_required_function_caching_state$ = null;
        sksi_removal_module_generation.$sksi_default_check_cost$ = null;
        sksi_removal_module_generation.$virtual_assertion_count$ = null;
        sksi_removal_module_generation.$mt_virtual_assertion_count_table$ = null;
        sksi_removal_module_generation.$sksi_module_code_mapping_terms_cache$ = null;
        sksi_removal_module_generation.$sksi_module_logical_schemas_cache$ = null;
        sksi_removal_module_generation.$sksi_supported_gaf_argument_browsing_max_term_cutoff$ = null;
        sksi_removal_module_generation.$show_sksi_supported_gaf_argument_browsing_skipsP$ = null;
        $sym0$_SKSI_MODULES_ = SubLObjectFactory.makeSymbol("*SKSI-MODULES*");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-MODULES*"));
        $sym4$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-MODULES*")));
        $sym6$_SKSI_MODULE_SUPPORTS_ = SubLObjectFactory.makeSymbol("*SKSI-MODULE-SUPPORTS*");
        $sym7$_SKSI_MODULE_SIMPLE_REQUIRED_PATTERN_ = SubLObjectFactory.makeSymbol("*SKSI-MODULE-SIMPLE-REQUIRED-PATTERN*");
        $sym8$_SKS_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_ = SubLObjectFactory.makeSymbol("*SKS-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*");
        $sym9$_SKSI_MODULE_MULTIPLY_INDEXED_CONDITIONAL_MEANING_SENTENCE_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*");
        $sym10$_SKSI_MODULES_BY_SKS_ = SubLObjectFactory.makeSymbol("*SKSI-MODULES-BY-SKS*");
        $sym11$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const12$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym13$_SKSI_CODE_MAPPING_SKS_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-CODE-MAPPING-SKS-CACHE*");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("PS"), (SubLObject)SubLObjectFactory.makeSymbol("LS"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPING-MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym15$TUPLE = SubLObjectFactory.makeUninternedSymbol("TUPLE");
        $sym16$TUPLES = SubLObjectFactory.makeUninternedSymbol("TUPLES");
        $sym17$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CODE-MAPPING-SKS-CACHE*"));
        $sym19$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym20$CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE = SubLObjectFactory.makeSymbol("CODE-MAPPING-FORWARD-RULES-TO-REPROPAGATE");
        $const21$codeMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("codeMapping"));
        $kw22$NEG = SubLObjectFactory.makeKeyword("NEG");
        $const23$SKSIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt"));
        $kw24$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw25$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym26$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $const27$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym28$_ISA_SKS_TERM_TO_CYCL_TERM_MTS_ = SubLObjectFactory.makeSymbol("*ISA-SKS-TERM-TO-CYCL-TERM-MTS*");
        $sym29$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $sym30$_ISA_SKS_TERM_TO_CYCL_TERM_STORE_ = SubLObjectFactory.makeSymbol("*ISA-SKS-TERM-TO-CYCL-TERM-STORE*");
        $sym31$ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT = SubLObjectFactory.makeSymbol("ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM-INT");
        $sym32$ALL_SKSI_RELEVANT_REWRITE_ISAS_INT = SubLObjectFactory.makeSymbol("ALL-SKSI-RELEVANT-REWRITE-ISAS-INT");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POS"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"));
        $list34 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("holdsIn")));
        $sym35$_MEANING_SENTENCE_MTS_ = SubLObjectFactory.makeSymbol("*MEANING-SENTENCE-MTS*");
        $sym36$_MEANING_SENTENCE_PRED_STORE_ = SubLObjectFactory.makeSymbol("*MEANING-SENTENCE-PRED-STORE*");
        $sym37$ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT = SubLObjectFactory.makeSymbol("ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED-INT");
        $sym38$ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT = SubLObjectFactory.makeSymbol("ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED-INT");
        $sym39$CODE_MAPPING_KNOWLEDGE_SOURCE_ = SubLObjectFactory.makeSymbol("CODE-MAPPING-KNOWLEDGE-SOURCE?");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-INFO-PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-RELEVANT-CODE-MAPPING-SCHEMAS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-RELEVANT-INSTANCE-NAMED-FN-COLLS"));
        $kw41$MODULE_SUPPORTS = SubLObjectFactory.makeKeyword("MODULE-SUPPORTS");
        $kw42$SIMPLE_REQUIRED_PATTERN = SubLObjectFactory.makeKeyword("SIMPLE-REQUIRED-PATTERN");
        $kw43$MEANING_SENTENCE = SubLObjectFactory.makeKeyword("MEANING-SENTENCE");
        $kw44$MULTIPLY_INDEXED_CMS = SubLObjectFactory.makeKeyword("MULTIPLY-INDEXED-CMS");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PS"), (SubLObject)SubLObjectFactory.makeSymbol("LS"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPING-MT"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-REQUIRED-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-TERMNUMS"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-TERMNUMS"), (SubLObject)SubLObjectFactory.makeKeyword("MULTIPLY-INDEXED-CMS"), (SubLObject)SubLObjectFactory.makeKeyword("MEANING-SENTENCE"));
        $str47$_S_was_not_a_valid_module_paramet = SubLObjectFactory.makeString("~S was not a valid module parameter");
        $kw48$MODULE_NAME = SubLObjectFactory.makeKeyword("MODULE-NAME");
        $kw49$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $kw50$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $str51$sksi_ = SubLObjectFactory.makeString("sksi-");
        $sym52$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str53$Invalid_predicate_for_meaning_sen = SubLObjectFactory.makeString("Invalid predicate for meaning sentence GAF: ~a.");
        $str54$complex_non_atomic_meaning_senten = SubLObjectFactory.makeString("complex non-atomic meaning sentences not handled yet");
        $sym55$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
        $str56$No_logical_field_indexicals_for_m = SubLObjectFactory.makeString("No logical field indexicals for meaning sentence ~a in logical schemata ~a.");
        $str57$The_following_conditional_meaning = SubLObjectFactory.makeString("The following conditional meaning sentence GAF is not supported: ~%~a");
        $str58$Invalid_consequent_predicate_for_ = SubLObjectFactory.makeString("Invalid consequent predicate for conditional meaning sentence GAF: ~a.");
        $sym59$PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED");
        $sym60$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-PHYSICAL-SCHEMATA");
        $kw61$OUTPUT_GENERATE_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN");
        $kw62$OUTPUT_CHECK_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN");
        $kw63$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $kw64$SUPPORT_MT = SubLObjectFactory.makeKeyword("SUPPORT-MT");
        $str65$No__output_generate_pattern_or__o = SubLObjectFactory.makeString("No :output-generate-pattern or :output-check-pattern.");
        $sym66$CSQL_FROM_CLAUSE_P = SubLObjectFactory.makeSymbol("CSQL-FROM-CLAUSE-P");
        $sym67$CSQL_WHERE_CLAUSE_P = SubLObjectFactory.makeSymbol("CSQL-WHERE-CLAUSE-P");
        $kw68$WHERE = SubLObjectFactory.makeKeyword("WHERE");
        $sym69$CSQL_SELECT_QUERY_P = SubLObjectFactory.makeSymbol("CSQL-SELECT-QUERY-P");
        $sym70$SKSI_GET_ANY_PREDICATES_PATTERN = SubLObjectFactory.makeSymbol("SKSI-GET-ANY-PREDICATES-PATTERN");
        $const71$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const73$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn"));
        $sym74$LFI_ALIAS_FN_NAUT_P = SubLObjectFactory.makeSymbol("LFI-ALIAS-FN-NAUT-P");
        $sym75$LOGICAL_FIELD_INDEXICAL_FORT_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-FORT-P");
        $kw76$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $const77$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym78$NON_LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("NON-LOGICAL-FIELD-INDEXICAL-P");
        $kw79$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const80$sksiModulesDoomedUnlessArgBound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiModulesDoomedUnlessArgBound"));
        $kw81$NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $sym82$PHYSICAL_SCHEMA_ENUMERABLE_ = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-ENUMERABLE?");
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_removal_module_generation.ZERO_INTEGER));
        $kw84$POS = SubLObjectFactory.makeKeyword("POS");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TUPLE"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-TERMNUMS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-TERMNUMS"));
        $str86$Could_not_constrain_the__not_full = SubLObjectFactory.makeString("Could not constrain the :not-fully-bound predicate for ~a");
        $kw87$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $kw88$INPUT_TERMNUMS = SubLObjectFactory.makeKeyword("INPUT-TERMNUMS");
        $kw89$OUTPUT_TERMNUMS = SubLObjectFactory.makeKeyword("OUTPUT-TERMNUMS");
        $kw90$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw91$ANY_PREDICATES = SubLObjectFactory.makeKeyword("ANY-PREDICATES");
        $kw92$REQUIRED_PATTERN = SubLObjectFactory.makeKeyword("REQUIRED-PATTERN");
        $sym93$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $sym96$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym98$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym99$MAKE_NAT_SUBPATTERN = SubLObjectFactory.makeSymbol("MAKE-NAT-SUBPATTERN");
        $kw100$NAT = SubLObjectFactory.makeKeyword("NAT");
        $kw101$OR = SubLObjectFactory.makeKeyword("OR");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $kw103$UNIFY = SubLObjectFactory.makeKeyword("UNIFY");
        $sym104$NAUT_ = SubLObjectFactory.makeSymbol("NAUT?");
        $sym105$MAKE_UNIFY_SUBPATTERN = SubLObjectFactory.makeSymbol("MAKE-UNIFY-SUBPATTERN");
        $sym106$NON_SENTENTIAL_RELATION_FORT_P = SubLObjectFactory.makeSymbol("NON-SENTENTIAL-RELATION-FORT-P");
        $sym107$NAT_SUBPATTERN_P = SubLObjectFactory.makeSymbol("NAT-SUBPATTERN-P");
        $sym108$MAKE_DISJUNCTIVE_SUBPATTERN = SubLObjectFactory.makeSymbol("MAKE-DISJUNCTIVE-SUBPATTERN");
        $const109$SententialRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialRelation"));
        $sym110$UNIFY_SUBPATTERN_P = SubLObjectFactory.makeSymbol("UNIFY-SUBPATTERN-P");
        $sym111$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym112$DISJUNCTIVE_SUBPATTERN_P = SubLObjectFactory.makeSymbol("DISJUNCTIVE-SUBPATTERN-P");
        $sym113$NARTIFY_NAT_PATTERN = SubLObjectFactory.makeSymbol("NARTIFY-NAT-PATTERN");
        $kw114$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $sym115$GENERATE_SKSI_SLRM_REQUIRED_FUNCTION = SubLObjectFactory.makeSymbol("GENERATE-SKSI-SLRM-REQUIRED-FUNCTION");
        $sym116$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"));
        $sym119$RET = SubLObjectFactory.makeSymbol("RET");
        $sym120$EXTERNAL_SOURCE_ACTIVATED_IN_IMAGE_ = SubLObjectFactory.makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?");
        $sym121$_GENERATE_SKSI_SLRM_REQUIRED_FUNCTION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENERATE-SKSI-SLRM-REQUIRED-FUNCTION-CACHING-STATE*");
        $str122$_REQUIRED_FUNC = SubLObjectFactory.makeString("-REQUIRED-FUNC");
        $sym123$SKSI_ONLY_PREDICATE_ = SubLObjectFactory.makeSymbol("SKSI-ONLY-PREDICATE?");
        $const124$SKSIOnlyPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIOnlyPredicate"));
        $int125$1024 = SubLObjectFactory.makeInteger(1024);
        $kw126$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $kw127$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw128$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $str129$_prune_unreformulatable = SubLObjectFactory.makeString("-prune-unreformulatable");
        $kw130$AND = SubLObjectFactory.makeKeyword("AND");
        $kw131$MODULE_TYPE = SubLObjectFactory.makeKeyword("MODULE-TYPE");
        $kw132$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw133$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKSI"));
        $kw135$MODULE_SOURCE = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $kw136$CHECK = SubLObjectFactory.makeKeyword("CHECK");
        $kw137$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw138$EXCLUSIVE = SubLObjectFactory.makeKeyword("EXCLUSIVE");
        $sym139$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $kw140$SUPPLANTS = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI")));
        $kw142$COMPLETENESS = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST-EXPRESSION"), (SubLObject)sksi_removal_module_generation.ZERO_INTEGER);
        $kw144$REQUIRED = SubLObjectFactory.makeKeyword("REQUIRED");
        $list145 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI"))));
        $kw146$INPUT_EXTRACT_PATTERN = SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN");
        $kw147$INPUT_ENCODE_PATTERN = SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN");
        $kw148$INPUT_VERIFY_PATTERN = SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN");
        $kw149$OUTPUT_DECODE_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN");
        $kw150$OUTPUT_VERIFY_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN");
        $kw151$OUTPUT_CONSTRUCT_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN");
        $kw152$COST_EXPRESSION = SubLObjectFactory.makeKeyword("COST-EXPRESSION");
        $kw153$COST_PATTERN = SubLObjectFactory.makeKeyword("COST-PATTERN");
        $kw154$SUPPORT_MODULE = SubLObjectFactory.makeKeyword("SUPPORT-MODULE");
        $kw155$SUPPORT_STRENGTH = SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH");
        $kw156$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw157$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $str158$___not_ = SubLObjectFactory.makeString("(#$not ");
        $str159$_ = SubLObjectFactory.makeString(")");
        $str160$_FULLY_BOUND = SubLObjectFactory.makeString(" FULLY-BOUND");
        $str161$__FULLY_BOUND_ = SubLObjectFactory.makeString(" <FULLY-BOUND>");
        $str162$_FULLY_BOUND = SubLObjectFactory.makeString("(FULLY-BOUND");
        $str163$__FULLY_BOUND_ = SubLObjectFactory.makeString("(<FULLY-BOUND>");
        $str164$NOT_FULLY_BOUND = SubLObjectFactory.makeString("NOT-FULLY-BOUND");
        $str165$_NOT_FULLY_BOUND_ = SubLObjectFactory.makeString("<NOT-FULLY-BOUND>");
        $kw166$BIND = SubLObjectFactory.makeKeyword("BIND");
        $kw167$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw168$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-REFORMULATION-CHECK"));
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-NOT-CONTAINING-NIL-P"));
        $sym171$TOKEN_CYCL_SYMBOL_FOR_TERMNUM = SubLObjectFactory.makeSymbol("TOKEN-CYCL-SYMBOL-FOR-TERMNUM");
        $kw172$TUPLE = SubLObjectFactory.makeKeyword("TUPLE");
        $sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_ = SubLObjectFactory.makeSymbol("SKSI-REFORMULATABLE-VIA-TEMPLATE?");
        $str174$No_field_encodings_for_physical_f = SubLObjectFactory.makeString("No field encodings for physical field indexical ~a, physical schemata ~a, and logical schemata ~a.");
        $kw175$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw176$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw177$ENCODE = SubLObjectFactory.makeKeyword("ENCODE");
        $kw178$CALL = SubLObjectFactory.makeKeyword("CALL");
        $sym179$SKSI_REFORMULATE = SubLObjectFactory.makeSymbol("SKSI-REFORMULATE");
        $str180$No_field_decodings_for_logical_fi = SubLObjectFactory.makeString("No field decodings for logical field indexical ~a, logical schemata ~a, and physical schemata ~a.");
        $kw181$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $sym182$DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P = SubLObjectFactory.makeSymbol("DUMMY-EXTERNAL-TERM-DENOTING-FUNCTION-EXPRESSION-P");
        $sym183$CITY_NAMED_FN_EXPRESSION_P = SubLObjectFactory.makeSymbol("CITY-NAMED-FN-EXPRESSION-P");
        $sym184$SCHEMA_OBJECT_FN_EXPRESSION_P = SubLObjectFactory.makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P");
        $sym185$SOURCE_SCHEMA_OBJECT_FN_EXPRESSION_P = SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-P");
        $sym186$INSTANCE_NAMED_FN_EXPRESSION_P = SubLObjectFactory.makeSymbol("INSTANCE-NAMED-FN-EXPRESSION-P");
        $const187$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $sym188$GET_SKSI_REMOVAL_MODULE_COST = SubLObjectFactory.makeSymbol("GET-SKSI-REMOVAL-MODULE-COST");
        $kw189$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $sym190$LOGICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL");
        $sym191$FAST_SUBSET_ = SubLObjectFactory.makeSymbol("FAST-SUBSET?");
        $sym192$SETS_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
        $sym193$FAST_SUPERSET_ = SubLObjectFactory.makeSymbol("FAST-SUPERSET?");
        $sym194$GENERATE_SKSI_SINGLE_LITERAL_COST_RECORDING_ITERATOR = SubLObjectFactory.makeSymbol("GENERATE-SKSI-SINGLE-LITERAL-COST-RECORDING-ITERATOR");
        $sym195$GENERATE_BOOLEAN_FROM_CSQL = SubLObjectFactory.makeSymbol("GENERATE-BOOLEAN-FROM-CSQL");
        $sym196$NOT_BOOLEAN = SubLObjectFactory.makeSymbol("NOT-BOOLEAN");
        $sym197$PHYSICAL_SCHEMA_REQUIRED_FIELDS = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-REQUIRED-FIELDS");
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"));
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-CLAUSE"));
        $str200$CYCL_TERM = SubLObjectFactory.makeString("CYCL-TERM");
        $str201$RAW_TERM = SubLObjectFactory.makeString("RAW-TERM");
        $str202$RAW = SubLObjectFactory.makeString("RAW");
        $str203$CYCL = SubLObjectFactory.makeString("CYCL");
        $sym204$_VIRTUAL_ASSERTION_COUNT_ = SubLObjectFactory.makeSymbol("*VIRTUAL-ASSERTION-COUNT*");
        $sym205$_MT_VIRTUAL_ASSERTION_COUNT_TABLE_ = SubLObjectFactory.makeSymbol("*MT-VIRTUAL-ASSERTION-COUNT-TABLE*");
        $sym206$_SKSI_MODULE_CODE_MAPPING_TERMS_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-MODULE-CODE-MAPPING-TERMS-CACHE*");
        $sym207$_SKSI_MODULE_LOGICAL_SCHEMAS_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-MODULE-LOGICAL-SCHEMAS-CACHE*");
        $sym208$SKSI_MODULE_ANY_PREDICATES_LIST = SubLObjectFactory.makeSymbol("SKSI-MODULE-ANY-PREDICATES-LIST");
        $sym209$SKSI_SUPPORTED_PREDICATE_TYPE_P = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-PREDICATE-TYPE-P");
        $int210$5000 = SubLObjectFactory.makeInteger(5000);
        $sym211$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str212$Too_many_term_arguments___S__for_ = SubLObjectFactory.makeString("Too many term arguments (~S) for meaning-sentence ~S to register browsing on all of them.  Skipping.");
        $str213$Too_many_code_mapping_terms___S__ = SubLObjectFactory.makeString("Too many code mapping terms (~S) for meaning-sentence ~S to register browsing on all of them.  Skipping.");
        $sym214$GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS = SubLObjectFactory.makeSymbol("GATHER-CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMAS");
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POS"), (SubLObject)SubLObjectFactory.makeSymbol("CODE-MAPPING-SCHEMAS"));
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POS"), (SubLObject)SubLObjectFactory.makeSymbol("COLLS"));
        $str217$Continue_without_generating_remov = SubLObjectFactory.makeString("Continue without generating removal modules for ");
    }
}

/*

	Total time: 1288 ms
	
*/