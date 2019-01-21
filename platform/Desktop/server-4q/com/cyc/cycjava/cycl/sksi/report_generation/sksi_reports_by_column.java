package com.cyc.cycjava.cycl.sksi.report_generation;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.http_kernel;
import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.scheduled_queries;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cae_query_search;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_reports_by_column extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column";
    public static final String myFingerPrint = "3007651572a4fbec845d094ffe5b12a3fa4dcb956a8f291f33071dc6bbb618be";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 15715L)
    private static SubLSymbol $rgbc_default_overriding_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 16007L)
    public static SubLSymbol $rgbc_locked_overriding_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 16430L)
    private static SubLSymbol $rgbc_overriding_properties_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLSymbol $dtp_report_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLSymbol $dtp_report_generator_problem$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLSymbol $dtp_report_generation_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 37889L)
    private static SubLSymbol $rgbc_initial_value_for_pfs$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 62222L)
    private static SubLSymbol $all_selected_entities_time_multiplier$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 67805L)
    private static SubLSymbol $report_specific_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 70404L)
    private static SubLSymbol $default_report_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 70691L)
    private static SubLSymbol $sts_selection_sentence$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PIF;
    private static final SubLSymbol $sym2$WITH_TEXT_FILE;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$SCHEDULE_REPORT;
    private static final SubLList $list6;
    private static final SubLString $str7$;
    private static final SubLSymbol $sym8$SCHEDULE_RECURRING_REPORT;
    private static final SubLString $str9$ReportGeneratorReportSpecificatio;
    private static final SubLObject $const10$isa;
    private static final SubLObject $const11$UniversalVocabularyMt;
    private static final SubLList $list12;
    private static final SubLObject $const13$definingMt;
    private static final SubLObject $const14$reportSpecificationTemplate;
    private static final SubLObject $const15$reportSpecificationClobberMultipl;
    private static final SubLObject $const16$False;
    private static final SubLObject $const17$True;
    private static final SubLObject $const18$reportSpecificationPlaceholder;
    private static final SubLObject $const19$reportSpecificationSelectionSente;
    private static final SubLObject $const20$Quote;
    private static final SubLObject $const21$reportSpecificationDelimiterChara;
    private static final SubLObject $const22$Comma_TheSymbol;
    private static final SubLObject $const23$reportSpecificationFields;
    private static final SubLObject $const24$scheduledReportSpecification;
    private static final SubLObject $const25$ModelMtByUserAndTaskFn;
    private static final SubLObject $const26$BaseKB;
    private static final SubLSymbol $kw27$TRUE;
    private static final SubLList $list28;
    private static final SubLString $str29$reports_;
    private static final SubLString $str30$_;
    private static final SubLString $str31$http___;
    private static final SubLString $str32$_;
    private static final SubLSymbol $sym33$REPORT_BY_COLUMN_TO_FILE;
    private static final SubLSymbol $kw34$OUTPUT;
    private static final SubLString $str35$Unable_to_open__S;
    private static final SubLSymbol $kw36$OUTPUT_DIRECTORY;
    private static final SubLString $str37$_partial;
    private static final SubLString $str38$_A_A__2__0D_A;
    private static final SubLSymbol $sym39$REPORT_BY_COLUMN_TO_STREAM;
    private static final SubLSymbol $kw40$REPORT_KNOWLEDGE_SOURCE;
    private static final SubLSymbol $kw41$COLUMN_RANGE;
    private static final SubLSymbol $kw42$DELIMITER;
    private static final SubLSymbol $kw43$OUTPUT_FILENAME;
    private static final SubLSymbol $kw44$LOG_FILE;
    private static final SubLString $str45$Cannot_understand_filename__bad__;
    private static final SubLList $list46;
    private static final SubLString $str47$RGBC_OVERRIDING_PROPERTIES;
    private static final SubLSymbol $kw48$MAX_TIME;
    private static final SubLSymbol $sym49$MAKE_KEYWORD;
    private static final SubLSymbol $sym50$STRING_UPCASE;
    private static final SubLString $str51$_s;
    private static final SubLSymbol $sym52$REPORT_GENERATION_ITERATOR_DONE_P;
    private static final SubLSymbol $sym53$REPORT_GENERATION_ITERATOR_NEXT;
    private static final SubLSymbol $sym54$REPORT_GENERATOR;
    private static final SubLSymbol $sym55$REPORT_GENERATOR_P;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$PRINT_REPORT_GENERATOR;
    private static final SubLSymbol $sym61$REPORT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$RG_FULL_REPORT_PROPS;
    private static final SubLSymbol $sym64$_CSETF_RG_FULL_REPORT_PROPS;
    private static final SubLSymbol $sym65$RG_ITERATOR;
    private static final SubLSymbol $sym66$_CSETF_RG_ITERATOR;
    private static final SubLSymbol $sym67$RG_PROBLEMS;
    private static final SubLSymbol $sym68$_CSETF_RG_PROBLEMS;
    private static final SubLSymbol $kw69$FULL_REPORT_PROPS;
    private static final SubLSymbol $kw70$ITERATOR;
    private static final SubLSymbol $kw71$PROBLEMS;
    private static final SubLString $str72$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw73$BEGIN;
    private static final SubLSymbol $sym74$MAKE_REPORT_GENERATOR;
    private static final SubLSymbol $kw75$SLOT;
    private static final SubLSymbol $kw76$END;
    private static final SubLSymbol $sym77$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_METHOD;
    private static final SubLString $str78$_REPORT_GENERATOR_;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$COLUMN_PROBLEMS;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$CDOVECTOR;
    private static final SubLSymbol $sym83$REPORT_GENERATOR_PROBLEMS;
    private static final SubLSymbol $sym84$CDOLIST;
    private static final SubLSymbol $sym85$CINC;
    private static final SubLSymbol $kw86$GENERAL;
    private static final SubLSymbol $sym87$SXHASH_REPORT_GENERATOR_METHOD;
    private static final SubLSymbol $sym88$REPORT_GENERATOR_PROBLEM;
    private static final SubLSymbol $sym89$REPORT_GENERATOR_PROBLEM_P;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$PRINT_REPORT_GENERATOR_PROBLEM;
    private static final SubLSymbol $sym95$REPORT_GENERATOR_PROBLEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$RG_PROBLEM_TYPE;
    private static final SubLSymbol $sym98$_CSETF_RG_PROBLEM_TYPE;
    private static final SubLSymbol $sym99$RG_PROBLEM_DESCRIPTION;
    private static final SubLSymbol $sym100$_CSETF_RG_PROBLEM_DESCRIPTION;
    private static final SubLSymbol $sym101$RG_PROBLEM_PHYSICAL_FIELD;
    private static final SubLSymbol $sym102$_CSETF_RG_PROBLEM_PHYSICAL_FIELD;
    private static final SubLSymbol $kw103$TYPE;
    private static final SubLSymbol $kw104$DESCRIPTION;
    private static final SubLSymbol $kw105$PHYSICAL_FIELD;
    private static final SubLSymbol $sym106$MAKE_REPORT_GENERATOR_PROBLEM;
    private static final SubLSymbol $sym107$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_PROBLEM_METHOD;
    private static final SubLString $str108$_REPORT_GENERATOR_PROBLEM_;
    private static final SubLSymbol $sym109$SXHASH_REPORT_GENERATOR_PROBLEM_METHOD;
    private static final SubLSymbol $sym110$REPORT_GENERATION_STATE;
    private static final SubLSymbol $sym111$REPORT_GENERATION_STATE_P;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$PRINT_REPORT_GENERATION_STATE;
    private static final SubLSymbol $sym117$REPORT_GENERATION_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$RG_STATE_KS;
    private static final SubLSymbol $sym120$_CSETF_RG_STATE_KS;
    private static final SubLSymbol $sym121$RG_STATE_RANGE;
    private static final SubLSymbol $sym122$_CSETF_RG_STATE_RANGE;
    private static final SubLSymbol $sym123$RG_STATE_MT;
    private static final SubLSymbol $sym124$_CSETF_RG_STATE_MT;
    private static final SubLSymbol $sym125$RG_STATE_PF_ITERATOR;
    private static final SubLSymbol $sym126$_CSETF_RG_STATE_PF_ITERATOR;
    private static final SubLSymbol $sym127$RG_STATE_ITERATIONS;
    private static final SubLSymbol $sym128$_CSETF_RG_STATE_ITERATIONS;
    private static final SubLSymbol $sym129$RG_STATE_MERGED_PROPS;
    private static final SubLSymbol $sym130$_CSETF_RG_STATE_MERGED_PROPS;
    private static final SubLSymbol $sym131$RG_STATE_RESULTS_TABLE;
    private static final SubLSymbol $sym132$_CSETF_RG_STATE_RESULTS_TABLE;
    private static final SubLSymbol $sym133$RG_STATE_EXECUTED_QUERIES;
    private static final SubLSymbol $sym134$_CSETF_RG_STATE_EXECUTED_QUERIES;
    private static final SubLSymbol $sym135$RG_STATE_REPORT_GENERATOR;
    private static final SubLSymbol $sym136$_CSETF_RG_STATE_REPORT_GENERATOR;
    private static final SubLSymbol $kw137$KS;
    private static final SubLSymbol $kw138$RANGE;
    private static final SubLSymbol $kw139$MT;
    private static final SubLSymbol $kw140$PF_ITERATOR;
    private static final SubLSymbol $kw141$ITERATIONS;
    private static final SubLSymbol $kw142$MERGED_PROPS;
    private static final SubLSymbol $kw143$RESULTS_TABLE;
    private static final SubLSymbol $kw144$EXECUTED_QUERIES;
    private static final SubLSymbol $kw145$REPORT_GENERATOR;
    private static final SubLSymbol $sym146$MAKE_REPORT_GENERATION_STATE;
    private static final SubLSymbol $sym147$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATION_STATE_METHOD;
    private static final SubLString $str148$_REPORT_GENERATION_STATE_;
    private static final SubLSymbol $sym149$SXHASH_REPORT_GENERATION_STATE_METHOD;
    private static final SubLString $str150$Executed_queries_state___s__;
    private static final SubLSymbol $sym151$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLObject $const152$databaseForReportGeneratorOutput;
    private static final SubLSymbol $kw153$NULL;
    private static final SubLObject $const154$logicalSchemaSourceMap;
    private static final SubLObject $const155$reportGeneratorLogicalSchemaToNat;
    private static final SubLObject $const156$schemaFieldNameList;
    private static final SubLObject $const157$reportGeneratorLogicalSchemaToDat;
    private static final SubLObject $const158$schemaName_SKS;
    private static final SubLSymbol $kw159$INTO;
    private static final SubLSymbol $kw160$TABLE;
    private static final SubLString $str161$Could_not_find_logicalSchemaSourc;
    private static final SubLString $str162$Could_not_find_reportGeneratorLog;
    private static final SubLString $str163$Could_not_find_schemaFieldNameLis;
    private static final SubLString $str164$Could_not_find_reportGeneratorLog;
    private static final SubLString $str165$Could_not_find_schemaName_SKS_for;
    private static final SubLString $str166$Could_not_find_databaseForReportG;
    private static final SubLObject $const167$logicalFieldValueWithFieldName;
    private static final SubLList $list168;
    private static final SubLObject $const169$fieldEncodingPFIAndLFI;
    private static final SubLList $list170;
    private static final SubLObject $const171$physicalSchemaFieldIndexicalWithN;
    private static final SubLString $str172$Could_not_find_logicalFieldValueW;
    private static final SubLString $str173$Could_not_find_fieldEncodingPFIAn;
    private static final SubLString $str174$Could_not_find_physicalSchemaFiel;
    private static final SubLSymbol $kw175$FIELD;
    private static final SubLString $str176$___S;
    private static final SubLString $str177$RG_field_list_____S__;
    private static final SubLString $str178$Value___S__;
    private static final SubLSymbol $kw179$INSERT;
    private static final SubLSymbol $kw180$VALUES;
    private static final SubLSymbol $sym181$REPLACE_WITH_NULL;
    private static final SubLString $str182$New_hash_table___S__;
    private static final SubLSymbol $sym183$RUN_BATCH_REPORTS_FROM_DEFINITION_FILE;
    private static final SubLSymbol $sym184$RUN_BATCH_REPORTS_FROM_DEFINITION;
    private static final SubLList $list185;
    private static final SubLSymbol $kw186$INPUT;
    private static final SubLSymbol $kw187$GLOBAL;
    private static final SubLSymbol $sym188$SYMBOL_NAME;
    private static final SubLSymbol $sym189$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym190$RANGE_SPECIFIER_ITEM_P;
    private static final SubLSymbol $sym191$EXPAND_RANGE_SPECIFIER_ITEM;
    private static final SubLSymbol $sym192$GAFS_FROM_KS;
    private static final SubLObject $const193$physicalSchemaFieldWithName;
    private static final SubLList $list194;
    private static final SubLObject $const195$schemaFieldList;
    private static final SubLString $str196$Default_values___s__;
    private static final SubLList $list197;
    private static final SubLString $str198$Hashtable_contents_before___;
    private static final SubLSymbol $kw199$EXHAUST_TOTAL;
    private static final SubLSymbol $kw200$ABNORMAL_HALT_REASON;
    private static final SubLString $str201$Property_list___s___;
    private static final SubLString $str202$Dictionary_Contents____;
    private static final SubLString $str203$Hashtable_contents_after__;
    private static final SubLString $str204$_________________________________;
    private static final SubLList $list205;
    private static final SubLString $str206$dict_key___s__;
    private static final SubLString $str207$Result_plist___s__;
    private static final SubLString $str208$Store_row___s__;
    private static final SubLString $str209$_s___;
    private static final SubLObject $const210$indexicalForPhysicalField;
    private static final SubLString $str211$Result____s__;
    private static final SubLString $str212$RG_LFI____s__;
    private static final SubLString $str213$RG_PFI____s__;
    private static final SubLString $str214$RG_PF____s__;
    private static final SubLString $str215$encoding_expression____s__;
    private static final SubLString $str216$encoded_value____s__;
    private static final SubLString $str217$Store_row__after____s__;
    private static final SubLSymbol $kw218$CLOBBER_MULTIPLE_VALUES_;
    private static final SubLString $str219$vectorp___S__curr_vector___S__col;
    private static final SubLObject $const220$TheSet;
    private static final SubLSymbol $kw221$MULTIPLE_ANSWERS;
    private static final SubLList $list222;
    private static final SubLString $str223$Some_rows_unexpectedly_returned_m;
    private static final SubLSymbol $sym224$APPLY_ENCODING_FOR_PF;
    private static final SubLList $list225;
    private static final SubLObject $const226$kSVariantHasFieldQueryWFocalArgPo;
    private static final SubLSymbol $kw227$SELECTION_SENTENCE;
    private static final SubLList $list228;
    private static final SubLObject $const229$queryHasFocalOutputVariablePositi;
    private static final SubLObject $const230$queryHasFocalOutputVariablePositi;
    private static final SubLObject $const231$kSHasQueryOutputIndexicalForLogic;
    private static final SubLList $list232;
    private static final SubLString $str233$Answer_var_list___s___;
    private static final SubLString $str234$Field_name_list___s___;
    private static final SubLString $str235$Modified_Column_Query___S___;
    private static final SubLString $str236$Query_halted_unusually_with__D_re;
    private static final SubLObject $const237$queryHasFocalInputVariablePositio;
    private static final SubLObject $const238$queryHasFocalInputVariablePositio;
    private static final SubLObject $const239$baseQueryForReportType;
    private static final SubLString $str240$Number_of_selection_inputs_not_eq;
    private static final SubLString $str241$key_selection___value_selection__;
    private static final SubLString $str242$_S__S__S__S___S__;
    private static final SubLSymbol $kw243$SELECTION_SENTENCE_INPUT_LIST;
    private static final SubLObject $const244$queryHasInputIndexicalMapping;
    private static final SubLSymbol $sym245$CANONICALIZE_TERM;
    private static final SubLString $str246$Tuple_to_map__;
    private static final SubLSymbol $kw247$PLACEHOLDER;
    private static final SubLSymbol $kw248$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym249$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str250$var_pos_var_selection_vars_select;
    private static final SubLString $str251$_S__S__S__S__;
    private static final SubLString $str252$Failed_to_find_entities_for_repor;
    private static final SubLObject $const253$and;
    private static final SubLSymbol $sym254$_LS;
    private static final SubLList $list255;
    private static final SubLObject $const256$kSHasQueryForLogicalFieldIndexica;
    private static final SubLSymbol $sym257$_LFI;
    private static final SubLList $list258;
    private static final SubLSymbol $sym259$_QUERY;
    private static final SubLList $list260;
    private static final SubLList $list261;
    private static final SubLString $str262$Can_t_find_any_useful_queries_ass;
    private static final SubLList $list263;
    private static final SubLSymbol $kw264$LOG_STREAM;
    private static final SubLSymbol $sym265$APPLY_RANGE_SPECIFIER_TO_SEQUENCE;
    private static final SubLSymbol $kw266$TEST;
    private static final SubLSymbol $kw267$OWNER;
    private static final SubLSymbol $kw268$CLASSES;
    private static final SubLSymbol $kw269$KB;
    private static final SubLSymbol $kw270$TINY;
    private static final SubLSymbol $kw271$WORKING_;
    private static final SubLList $list272;
    private static final SubLSymbol $sym273$ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE;
    private static final SubLList $list274;
    private static final SubLObject $const275$sksOfReportTest;
    private static final SubLSymbol $kw276$REG;
    private static final SubLSymbol $sym277$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const278$EverythingPSC;
    private static final SubLObject $const279$requiredAssertionForReportTest;
    private static final SubLSymbol $kw280$GAF;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$RELEVANT_MT_IS_EQ;
    private static final SubLObject $const283$pathnameForReportDefinition;
    private static final SubLObject $const284$baselineDirectoryForReport;
    private static final SubLObject $const285$reportTestComparesFilenamesWRTKey;
    private static final SubLList $list286;
    private static final SubLString $str287$Baseline_file___A__Test_output_fi;
    private static final SubLString $str288$_A___has__D_more_rows_than___A;
    private static final SubLList $list289;
    private static final SubLString $str290$Can_t_find__S_in__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 1233L)
    public static SubLObject with_text_file_or_null_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream_var = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject filename = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject direction = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list0);
        stream_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list0);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list0);
        direction = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$sym1$PIF, filename, (SubLObject)ConsesLow.listS((SubLObject)sksi_reports_by_column.$sym2$WITH_TEXT_FILE, (SubLObject)ConsesLow.list(stream_var, filename, direction), ConsesLow.append(body, (SubLObject)sksi_reports_by_column.NIL)), (SubLObject)ConsesLow.listS((SubLObject)sksi_reports_by_column.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stream_var, (SubLObject)sksi_reports_by_column.$list4)), ConsesLow.append(body, (SubLObject)sksi_reports_by_column.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list0);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 1695L)
    public static SubLObject schedule_report(final SubLObject ks, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
        if (email_recipients == sksi_reports_by_column.UNPROVIDED) {
            email_recipients = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (email_carbon_copies == sksi_reports_by_column.UNPROVIDED) {
            email_carbon_copies = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (cyclist == sksi_reports_by_column.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == sksi_reports_by_column.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if (delimiter == sksi_reports_by_column.UNPROVIDED) {
            delimiter = (SubLObject)Characters.CHAR_comma;
        }
        if (selection_sentence == sksi_reports_by_column.UNPROVIDED) {
            selection_sentence = sksi_reports_by_column.$sts_selection_sentence$.getGlobalValue();
        }
        if (range_spec == sksi_reports_by_column.UNPROVIDED) {
            range_spec = (SubLObject)sksi_reports_by_column.$list6;
        }
        if (clobber_multiple_valuesP == sksi_reports_by_column.UNPROVIDED) {
            clobber_multiple_valuesP = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (placeholder == sksi_reports_by_column.UNPROVIDED) {
            placeholder = (SubLObject)sksi_reports_by_column.$str7$;
        }
        final SubLObject query = a_possibly_open_query_from_ks(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject scheduled_event = scheduled_queries.make_single_query_schedule_assertions(query, date, email_recipients, email_carbon_copies, cyclist, task);
        final SubLObject report_spec = add_report_specification_to_scheduled_query(scheduled_event, ks, cyclist, task, delimiter, selection_sentence, range_spec, clobber_multiple_valuesP, placeholder);
        if (sksi_reports_by_column.NIL != report_spec) {
            scheduled_queries.note_query_scheduling_complete(scheduled_event);
        }
        return report_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 2688L)
    public static SubLObject schedule_recurring_report(final SubLObject ks, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task, SubLObject delimiter, SubLObject selection_sentence, SubLObject range_spec, SubLObject clobber_multiple_valuesP, SubLObject placeholder) {
        if (email_recipients == sksi_reports_by_column.UNPROVIDED) {
            email_recipients = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (email_carbon_copies == sksi_reports_by_column.UNPROVIDED) {
            email_carbon_copies = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (cyclist == sksi_reports_by_column.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == sksi_reports_by_column.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if (delimiter == sksi_reports_by_column.UNPROVIDED) {
            delimiter = (SubLObject)Characters.CHAR_comma;
        }
        if (selection_sentence == sksi_reports_by_column.UNPROVIDED) {
            selection_sentence = sksi_reports_by_column.$sts_selection_sentence$.getGlobalValue();
        }
        if (range_spec == sksi_reports_by_column.UNPROVIDED) {
            range_spec = (SubLObject)sksi_reports_by_column.$list6;
        }
        if (clobber_multiple_valuesP == sksi_reports_by_column.UNPROVIDED) {
            clobber_multiple_valuesP = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (placeholder == sksi_reports_by_column.UNPROVIDED) {
            placeholder = (SubLObject)sksi_reports_by_column.$str7$;
        }
        final SubLObject query = a_possibly_open_query_from_ks(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject scheduled_event = scheduled_queries.make_recurring_query_schedule_assertions(query, interval_type, email_recipients, email_carbon_copies, cyclist, task);
        final SubLObject report_spec = add_report_specification_to_scheduled_query(scheduled_event, ks, cyclist, task, delimiter, selection_sentence, range_spec, clobber_multiple_valuesP, placeholder);
        if (sksi_reports_by_column.NIL != report_spec) {
            scheduled_queries.note_query_scheduling_complete(scheduled_event);
        }
        return report_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 3694L)
    public static SubLObject add_report_specification_to_scheduled_query(final SubLObject scheduled_event, final SubLObject ks, final SubLObject cyclist, final SubLObject task, final SubLObject delimiter, SubLObject selection_sentence, final SubLObject range_spec, final SubLObject clobber_multiple_valuesP, final SubLObject placeholder) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = get_report_specification_mt(cyclist, task);
        final SubLObject report_spec = ke.ke_create_now((SubLObject)sksi_reports_by_column.$str9$ReportGeneratorReportSpecificatio, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject failP = Types.sublisp_null(report_spec);
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind((SubLObject)sksi_reports_by_column.NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            SubLObject cdolist_list_var = (SubLObject)sksi_reports_by_column.$list12;
            SubLObject v_isa = (SubLObject)sksi_reports_by_column.NIL;
            v_isa = cdolist_list_var.first();
            while (sksi_reports_by_column.NIL != cdolist_list_var) {
                if (sksi_reports_by_column.NIL == ke.ke_assert_now((SubLObject)ConsesLow.list(sksi_reports_by_column.$const10$isa, report_spec, v_isa), sksi_reports_by_column.$const11$UniversalVocabularyMt, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                    failP = (SubLObject)sksi_reports_by_column.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            }
            if (sksi_reports_by_column.NIL == selection_sentence) {
                selection_sentence = get_selection_sentence_from_ks(ks);
            }
            if (sksi_reports_by_column.NIL == failP) {
                SubLObject csome_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sksi_reports_by_column.$const13$definingMt, report_spec, mt), (SubLObject)ConsesLow.list(sksi_reports_by_column.$const14$reportSpecificationTemplate, report_spec, ks), (SubLObject)ConsesLow.list(sksi_reports_by_column.$const15$reportSpecificationClobberMultipl, report_spec, (sksi_reports_by_column.NIL == clobber_multiple_valuesP) ? sksi_reports_by_column.$const16$False : sksi_reports_by_column.$const17$True), (SubLObject)ConsesLow.list(sksi_reports_by_column.$const18$reportSpecificationPlaceholder, report_spec, placeholder), (SubLObject)ConsesLow.list(sksi_reports_by_column.$const19$reportSpecificationSelectionSente, report_spec, (SubLObject)ConsesLow.list(sksi_reports_by_column.$const20$Quote, selection_sentence)));
                SubLObject sentence = (SubLObject)sksi_reports_by_column.NIL;
                sentence = csome_list_var.first();
                while (sksi_reports_by_column.NIL == failP && sksi_reports_by_column.NIL != csome_list_var) {
                    if (sksi_reports_by_column.NIL == ke.ke_assert_now(sentence, mt, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                        failP = (SubLObject)sksi_reports_by_column.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    sentence = csome_list_var.first();
                }
            }
            final SubLObject cycl_delimiter_character = get_cycl_character(delimiter);
            SubLObject sentence = (SubLObject)ConsesLow.list(sksi_reports_by_column.$const21$reportSpecificationDelimiterChara, report_spec, (sksi_reports_by_column.NIL != cycl_delimiter_character) ? cycl_delimiter_character : sksi_reports_by_column.$const22$Comma_TheSymbol);
            if (sksi_reports_by_column.NIL == ke.ke_assert_now(sentence, mt, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                failP = (SubLObject)sksi_reports_by_column.T;
            }
            if (sksi_reports_by_column.NIL == failP) {
                SubLObject csome_list_var = parse_number_range_specifier(range_spec, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                SubLObject num = (SubLObject)sksi_reports_by_column.NIL;
                num = csome_list_var.first();
                while (sksi_reports_by_column.NIL == failP && sksi_reports_by_column.NIL != csome_list_var) {
                    if (sksi_reports_by_column.NIL == ke.ke_assert((SubLObject)ConsesLow.list(sksi_reports_by_column.$const23$reportSpecificationFields, report_spec, number_utilities.f_1X(num)), mt, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                        failP = (SubLObject)sksi_reports_by_column.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    num = csome_list_var.first();
                }
            }
            if (sksi_reports_by_column.NIL == failP && sksi_reports_by_column.NIL == ke.ke_assert_now((SubLObject)ConsesLow.list(sksi_reports_by_column.$const24$scheduledReportSpecification, scheduled_event, report_spec), mt, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                failP = (SubLObject)sksi_reports_by_column.T;
            }
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((sksi_reports_by_column.NIL != failP) ? sksi_reports_by_column.NIL : report_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 5395L)
    public static SubLObject get_report_specification_mt(SubLObject cyclist, SubLObject task) {
        if (cyclist == sksi_reports_by_column.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == sksi_reports_by_column.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if (sksi_reports_by_column.NIL != cyclist && sksi_reports_by_column.NIL != task) {
            return hlmt_czer.canonicalize_hlmt(el_utilities.make_binary_formula(sksi_reports_by_column.$const25$ModelMtByUserAndTaskFn, cyclist, task));
        }
        return sksi_reports_by_column.$const26$BaseKB;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 5659L)
    public static SubLObject get_cycl_character(final SubLObject subl_char) {
        final SubLObject char_string = Strings.make_string((SubLObject)sksi_reports_by_column.ONE_INTEGER, subl_char);
        SubLObject cycl_character = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL == cycl_character) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = (SubLObject)sksi_reports_by_column.$list28, pred = (SubLObject)sksi_reports_by_column.NIL, pred = csome_list_var.first(); sksi_reports_by_column.NIL == cycl_character && sksi_reports_by_column.NIL != csome_list_var; cycl_character = kb_mapping_utilities.fpred_value_in_any_mt(char_string, pred, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.$kw27$TRUE), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
        }
        return cycl_character;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 5965L)
    public static SubLObject reports_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[] { system_parameters.$cyc_documentation_url$.getDynamicValue(thread), sksi_reports_by_column.$str29$reports_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 5965L)
    public static SubLObject url_to_retrieve_report_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = misc_utilities.machine_name();
        if (sksi_reports_by_column.NIL == Sequences.find((SubLObject)Characters.CHAR_period, host, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
            host = Sequences.cconcatenate(host, new SubLObject[] { sksi_reports_by_column.$str30$_, mail_utilities.get_tcp_domain_name() });
        }
        return Sequences.cconcatenate((SubLObject)sksi_reports_by_column.$str31$http___, new SubLObject[] { host, sksi_reports_by_column.$str32$_, print_high.princ_to_string(http_kernel.http_port()), string_utilities.pre_remove(reports_directory(), system_parameters.$http_htdocs_directory$.getDynamicValue(thread), (SubLObject)sksi_reports_by_column.UNPROVIDED), filename });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 6682L)
    public static SubLObject report_by_column_to_file(final SubLObject report_props) {
        final SubLObject report_generator = new_report_generator(report_props);
        return report_generator_run_report(report_generator, (SubLObject)sksi_reports_by_column.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 7118L)
    public static SubLObject report_generator_run_report(final SubLObject report_generator, SubLObject scheduled_query) {
        if (scheduled_query == sksi_reports_by_column.UNPROVIDED) {
            scheduled_query = (SubLObject)sksi_reports_by_column.NIL;
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
        if (sksi_reports_by_column.NIL != maybe_log_file) {
            file_utilities.prepare_to_possibly_overwrite_file(maybe_log_file, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        if (sksi_reports_by_column.NIL != maybe_log_file) {
            SubLObject stream = (SubLObject)sksi_reports_by_column.NIL;
            try {
                stream = compatibility.open_text(maybe_log_file, (SubLObject)sksi_reports_by_column.$kw34$OUTPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)sksi_reports_by_column.$str35$Unable_to_open__S, maybe_log_file);
                }
                final SubLObject real_log_stream = stream;
                final SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
                final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
                try {
                    StreamsLow.$error_output$.bind(real_log_stream, thread);
                    StreamsLow.$standard_output$.bind(real_log_stream, thread);
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject iterator = report_generator_iterator(report_generator);
                            SubLObject v_iteration = (SubLObject)sksi_reports_by_column.ZERO_INTEGER;
                            SubLObject partial_directory = (SubLObject)sksi_reports_by_column.NIL;
                            if (list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY, (SubLObject)sksi_reports_by_column.UNPROVIDED) != sksi_reports_by_column.NIL) {
                                partial_directory = file_utilities.possibly_append_path_separator_char(Sequences.cconcatenate(directory, new SubLObject[] { file_name_base, sksi_reports_by_column.$str37$_partial }));
                                if (sksi_reports_by_column.NIL == Filesys.directory_p(partial_directory)) {
                                    Filesys.make_directory(partial_directory, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                                }
                            }
                            while (sksi_reports_by_column.NIL == iteration.iteration_done(iterator) && sksi_reports_by_column.NIL == scheduled_queries.should_skipXabort_scheduled_queryP(scheduled_query)) {
                                final SubLObject results = iteration.iteration_next(iterator);
                                SubLObject this_file_name = (SubLObject)sksi_reports_by_column.NIL;
                                if (list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY, (SubLObject)sksi_reports_by_column.UNPROVIDED) != sksi_reports_by_column.NIL) {
                                    this_file_name = ((sksi_reports_by_column.NIL != iteration.iteration_done(iterator)) ? file_name : PrintLow.format((SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.$str38$_A_A__2__0D_A, new SubLObject[] { partial_directory, file_name_base, v_iteration, file_name_suffix }));
                                    file_utilities.prepare_to_possibly_overwrite_file(this_file_name, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                                }
                                if (sksi_reports_by_column.NIL != this_file_name) {
                                    SubLObject stream_$2 = (SubLObject)sksi_reports_by_column.NIL;
                                    try {
                                        stream_$2 = compatibility.open_text(this_file_name, (SubLObject)sksi_reports_by_column.$kw34$OUTPUT);
                                        if (!stream_$2.isStream()) {
                                            Errors.error((SubLObject)sksi_reports_by_column.$str35$Unable_to_open__S, this_file_name);
                                        }
                                        final SubLObject out_stream = stream_$2;
                                        output_report_by_column(results, out_stream, full_report_props);
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (stream_$2.isStream()) {
                                                streams_high.close(stream_$2, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    }
                                }
                                else {
                                    final SubLObject out_stream2 = streams_high.make_broadcast_stream((SubLObject)sksi_reports_by_column.NIL);
                                    output_report_by_column(results, out_stream2, full_report_props);
                                }
                                v_iteration = Numbers.add(v_iteration, (SubLObject)sksi_reports_by_column.ONE_INTEGER);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
                    StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        else {
            final SubLObject real_log_stream2 = streams_high.make_broadcast_stream((SubLObject)sksi_reports_by_column.NIL);
            final SubLObject _prev_bind_4 = StreamsLow.$error_output$.currentBinding(thread);
            final SubLObject _prev_bind_5 = StreamsLow.$standard_output$.currentBinding(thread);
            try {
                StreamsLow.$error_output$.bind(real_log_stream2, thread);
                StreamsLow.$standard_output$.bind(real_log_stream2, thread);
                final SubLObject local_state2;
                final SubLObject state2 = local_state2 = memoization_state.new_memoization_state((SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state2, thread);
                    final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                    try {
                        final SubLObject iterator2 = report_generator_iterator(report_generator);
                        SubLObject v_iteration2 = (SubLObject)sksi_reports_by_column.ZERO_INTEGER;
                        SubLObject partial_directory2 = (SubLObject)sksi_reports_by_column.NIL;
                        if (list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY, (SubLObject)sksi_reports_by_column.UNPROVIDED) != sksi_reports_by_column.NIL) {
                            partial_directory2 = file_utilities.possibly_append_path_separator_char(Sequences.cconcatenate(directory, new SubLObject[] { file_name_base, sksi_reports_by_column.$str37$_partial }));
                            if (sksi_reports_by_column.NIL == Filesys.directory_p(partial_directory2)) {
                                Filesys.make_directory(partial_directory2, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            }
                        }
                        while (sksi_reports_by_column.NIL == iteration.iteration_done(iterator2) && sksi_reports_by_column.NIL == scheduled_queries.should_skipXabort_scheduled_queryP(scheduled_query)) {
                            final SubLObject results2 = iteration.iteration_next(iterator2);
                            SubLObject this_file_name2 = (SubLObject)sksi_reports_by_column.NIL;
                            if (list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY, (SubLObject)sksi_reports_by_column.UNPROVIDED) != sksi_reports_by_column.NIL) {
                                this_file_name2 = ((sksi_reports_by_column.NIL != iteration.iteration_done(iterator2)) ? file_name : PrintLow.format((SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.$str38$_A_A__2__0D_A, new SubLObject[] { partial_directory2, file_name_base, v_iteration2, file_name_suffix }));
                                file_utilities.prepare_to_possibly_overwrite_file(this_file_name2, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            }
                            if (sksi_reports_by_column.NIL != this_file_name2) {
                                SubLObject stream2 = (SubLObject)sksi_reports_by_column.NIL;
                                try {
                                    stream2 = compatibility.open_text(this_file_name2, (SubLObject)sksi_reports_by_column.$kw34$OUTPUT);
                                    if (!stream2.isStream()) {
                                        Errors.error((SubLObject)sksi_reports_by_column.$str35$Unable_to_open__S, this_file_name2);
                                    }
                                    final SubLObject out_stream2 = stream2;
                                    output_report_by_column(results2, out_stream2, full_report_props);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (stream2.isStream()) {
                                            streams_high.close(stream2, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            else {
                                final SubLObject out_stream3 = streams_high.make_broadcast_stream((SubLObject)sksi_reports_by_column.NIL);
                                output_report_by_column(results2, out_stream3, full_report_props);
                            }
                            v_iteration2 = Numbers.add(v_iteration2, (SubLObject)sksi_reports_by_column.ONE_INTEGER);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                StreamsLow.$standard_output$.rebind(_prev_bind_5, thread);
                StreamsLow.$error_output$.rebind(_prev_bind_4, thread);
            }
        }
        return file_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 8910L)
    public static SubLObject parse_filename(final SubLObject filename) {
        final SubLObject path_type = file_utilities.guess_path_type_robust(filename);
        final SubLObject separator_pos = list_utilities.position_from_end(file_utilities.path_separator_char(path_type), filename, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject local_name = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject directory = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject local_name_base = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject suffix = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL != separator_pos) {
            directory = string_utilities.substring(filename, (SubLObject)sksi_reports_by_column.ZERO_INTEGER, number_utilities.f_1X(separator_pos));
            local_name = string_utilities.substring(filename, number_utilities.f_1X(separator_pos), (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        else {
            directory = (SubLObject)sksi_reports_by_column.$str7$;
            local_name = filename;
        }
        final SubLObject dot_position = list_utilities.position_from_end((SubLObject)Characters.CHAR_period, local_name, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL != dot_position) {
            local_name_base = string_utilities.substring(local_name, (SubLObject)sksi_reports_by_column.ZERO_INTEGER, dot_position);
            suffix = string_utilities.substring(local_name, dot_position, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        else {
            local_name_base = local_name;
            suffix = (SubLObject)sksi_reports_by_column.$str7$;
        }
        return Values.values(directory, local_name_base, suffix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 9626L)
    public static SubLObject report_by_column_to_stream(final SubLObject report_props, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject report_generator = new_report_generator(report_props);
        final SubLObject full_report_props = report_generator_full_report_props(report_generator);
        final SubLObject ks = list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject iterator = report_generator_iterator(report_generator);
                SubLObject results = (SubLObject)sksi_reports_by_column.NIL;
                while (sksi_reports_by_column.NIL == iteration.iteration_done(iterator)) {
                    results = iteration.iteration_next(iterator);
                }
                output_report_by_column(results, stream, full_report_props);
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
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
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 10169L)
    public static SubLObject output_report_by_column(final SubLObject results, final SubLObject stream, final SubLObject full_report_props) {
        final SubLObject ks = list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject range_spec = list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw41$COLUMN_RANGE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject delimiter = list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw42$DELIMITER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        list_utilities.print_list_as_delimited_line(apply_range_specifier_to_sequence(sksi_report_generation.reportgen_schema_field_name_list(ks), range_spec), delimiter, stream);
        streams_high.terpri(stream);
        print_hashtable_of_plists_as_delimited_lines(results, sksi_report_generation.reportgen_schema_field_name_list(ks), delimiter, stream);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 10868L)
    public static SubLObject report_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL != inference_datastructures_enumerated_types.query_property_p(v_object) || sksi_reports_by_column.NIL != list_utilities.member_eqP(v_object, sksi_reports_by_column.$report_specific_properties$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 11100L)
    public static SubLObject get_full_filename_for_report(final SubLObject report_props) {
        if (sksi_reports_by_column.NIL == list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw43$OUTPUT_FILENAME, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
            return (SubLObject)sksi_reports_by_column.NIL;
        }
        return construct_full_path_from_prop_values(report_props, (SubLObject)sksi_reports_by_column.$kw43$OUTPUT_FILENAME, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 11631L)
    public static SubLObject get_full_logfilename_for_report(final SubLObject report_props) {
        if (sksi_reports_by_column.NIL == list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw44$LOG_FILE, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
            return (SubLObject)sksi_reports_by_column.NIL;
        }
        return construct_full_path_from_prop_values(report_props, (SubLObject)sksi_reports_by_column.$kw44$LOG_FILE, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 12038L)
    public static SubLObject construct_full_path_from_prop_values(final SubLObject props, final SubLObject file_key, final SubLObject dir_key) {
        final SubLObject filename = list_utilities.plist_lookup(props, file_key, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject dirname = list_utilities.plist_lookup(props, dir_key, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject result = absolute_path_from_absolute_or_relative(filename, dirname);
        if (sksi_reports_by_column.NIL != result) {
            return result;
        }
        Errors.error((SubLObject)sksi_reports_by_column.$str45$Cannot_understand_filename__bad__, dir_key, file_key, filename);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 12711L)
    public static SubLObject absolute_path_from_absolute_or_relative(final SubLObject path, final SubLObject absolute_dir) {
        if (sksi_reports_by_column.NIL != file_utilities.absolute_pathP(path)) {
            return path;
        }
        if (Sequences.length(absolute_dir).numE((SubLObject)sksi_reports_by_column.ZERO_INTEGER) || sksi_reports_by_column.NIL == file_utilities.absolute_pathP(absolute_dir)) {
            return (SubLObject)sksi_reports_by_column.NIL;
        }
        return file_utilities.make_path_absolute_relative_to(file_utilities.possibly_append_path_separator_char(absolute_dir), path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 13240L)
    public static SubLObject split_report_properties(final SubLObject report_props) {
        SubLObject query_props = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject non_query_props = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)sksi_reports_by_column.NIL, remainder = report_props; sksi_reports_by_column.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (sksi_reports_by_column.NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
                query_props = conses_high.putf(query_props, property, value);
            }
            else {
                non_query_props = conses_high.putf(non_query_props, property, value);
            }
        }
        return (SubLObject)ConsesLow.list(query_props, non_query_props);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 15348L)
    public static SubLObject query_properties_from_report_properties(final SubLObject report_props) {
        return split_report_properties(report_props).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 15476L)
    public static SubLObject merge_in_default_overriding_properties(final SubLObject report_props) {
        return list_utilities.merge_plist(get_rgbc_overriding_properties(), report_props);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 16529L)
    public static SubLObject get_rgbc_overriding_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject props = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject rw_lock_var = sksi_reports_by_column.$rgbc_overriding_properties_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sksi_reports_by_column.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            props = conses_high.copy_list(sksi_reports_by_column.$rgbc_locked_overriding_properties$.getDynamicValue(thread));
        }
        finally {
            if (sksi_reports_by_column.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return props;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 16846L)
    public static SubLObject add_to_rgbc_overriding_properties(final SubLObject plist) {
        final SubLObject old_props = get_rgbc_overriding_properties();
        final SubLObject new_props = inference_datastructures_enumerated_types.merge_query_properties(old_props, plist);
        if (!old_props.equal(new_props)) {
            final SubLObject rw_lock_var = sksi_reports_by_column.$rgbc_overriding_properties_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = (SubLObject)sksi_reports_by_column.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                sksi_reports_by_column.$rgbc_locked_overriding_properties$.setDynamicValue(new_props);
            }
            finally {
                if (sksi_reports_by_column.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return new_props;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 17455L)
    public static SubLObject update_rgbc_max_time(final SubLObject seconds) {
        return add_to_rgbc_overriding_properties((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw48$MAX_TIME, seconds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 17575L)
    public static SubLObject reset_rgbc_overriding_properties() {
        final SubLObject rw_lock_var = sksi_reports_by_column.$rgbc_overriding_properties_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sksi_reports_by_column.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            sksi_reports_by_column.$rgbc_locked_overriding_properties$.setDynamicValue(sksi_reports_by_column.$rgbc_default_overriding_properties$.getGlobalValue());
        }
        finally {
            if (sksi_reports_by_column.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return sksi_reports_by_column.$rgbc_default_overriding_properties$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 17815L)
    public static SubLObject print_hashtable_of_vectors_as_delimited_lines(final SubLObject hashtable, SubLObject delimiter, SubLObject stream) {
        if (delimiter == sksi_reports_by_column.UNPROVIDED) {
            delimiter = (SubLObject)Characters.CHAR_comma;
        }
        if (stream == sksi_reports_by_column.UNPROVIDED) {
            stream = (SubLObject)sksi_reports_by_column.T;
        }
        SubLObject key = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject vector = (SubLObject)sksi_reports_by_column.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                vector = Hashtables.getEntryValue(cdohash_entry);
                vector_utilities.print_vector_as_delimited_line(vector, delimiter, stream);
                streams_high.terpri(stream);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 18081L)
    public static SubLObject print_hashtable_of_plists_as_delimited_lines(final SubLObject hashtable, final SubLObject print_order, SubLObject delimiter, SubLObject stream) {
        if (delimiter == sksi_reports_by_column.UNPROVIDED) {
            delimiter = (SubLObject)Characters.CHAR_comma;
        }
        if (stream == sksi_reports_by_column.UNPROVIDED) {
            stream = (SubLObject)sksi_reports_by_column.T;
        }
        final SubLObject field_name_keywords = Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym49$MAKE_KEYWORD, Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym50$STRING_UPCASE, print_order));
        SubLObject key = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject plist_row = (SubLObject)sksi_reports_by_column.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                plist_row = Hashtables.getEntryValue(cdohash_entry);
                SubLObject cdolist_list_var = field_name_keywords;
                SubLObject keyword = (SubLObject)sksi_reports_by_column.NIL;
                keyword = cdolist_list_var.first();
                while (sksi_reports_by_column.NIL != cdolist_list_var) {
                    PrintLow.format(stream, (SubLObject)sksi_reports_by_column.$str51$_s, list_utilities.plist_lookup(plist_row, keyword, (SubLObject)sksi_reports_by_column.UNPROVIDED));
                    print_high.princ(delimiter, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    keyword = cdolist_list_var.first();
                }
                streams_high.terpri(stream);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 18562L)
    public static SubLObject new_report_generation_iterator(final SubLObject report_props, final SubLObject report_generator) {
        return iteration.new_iterator(make_report_generation_iterator_state(report_props, report_generator), (SubLObject)sksi_reports_by_column.$sym52$REPORT_GENERATION_ITERATOR_DONE_P, (SubLObject)sksi_reports_by_column.$sym53$REPORT_GENERATION_ITERATOR_NEXT, (SubLObject)sksi_reports_by_column.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject report_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_report_generator(v_object, stream, (SubLObject)sksi_reports_by_column.ZERO_INTEGER);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject report_generator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $report_generator_native.class) ? sksi_reports_by_column.T : sksi_reports_by_column.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject rg_full_report_props(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject rg_iterator(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject rg_problems(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject _csetf_rg_full_report_props(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject _csetf_rg_iterator(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject _csetf_rg_problems(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject make_report_generator(SubLObject arglist) {
        if (arglist == sksi_reports_by_column.UNPROVIDED) {
            arglist = (SubLObject)sksi_reports_by_column.NIL;
        }
        final SubLObject v_new = (SubLObject)new $report_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_reports_by_column.NIL, next = arglist; sksi_reports_by_column.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw69$FULL_REPORT_PROPS)) {
                _csetf_rg_full_report_props(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw70$ITERATOR)) {
                _csetf_rg_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw71$PROBLEMS)) {
                _csetf_rg_problems(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_reports_by_column.$str72$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject visit_defstruct_report_generator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw73$BEGIN, (SubLObject)sksi_reports_by_column.$sym74$MAKE_REPORT_GENERATOR, (SubLObject)sksi_reports_by_column.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw69$FULL_REPORT_PROPS, rg_full_report_props(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw70$ITERATOR, rg_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw71$PROBLEMS, rg_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw76$END, (SubLObject)sksi_reports_by_column.$sym74$MAKE_REPORT_GENERATOR, (SubLObject)sksi_reports_by_column.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19108L)
    public static SubLObject visit_defstruct_object_report_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_report_generator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19260L)
    public static SubLObject print_report_generator(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)sksi_reports_by_column.$str78$_REPORT_GENERATOR_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 19410L)
    public static SubLObject new_report_generator(final SubLObject report_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject report_generator = make_report_generator((SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject full_report_props = list_utilities.augment_plist_with_defaults(report_props, default_report_properties());
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject range_spec = list_utilities.plist_lookup(full_report_props, (SubLObject)sksi_reports_by_column.$kw41$COLUMN_RANGE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject column_proxies = apply_range_specifier_to_sequence(sksi_report_generation.reportgen_schema_field_list(ks), range_spec);
            final SubLObject column_count = Sequences.length(column_proxies);
            _csetf_rg_problems(report_generator, Vectors.make_vector(Numbers.add((SubLObject)sksi_reports_by_column.ONE_INTEGER, column_count), (SubLObject)sksi_reports_by_column.NIL));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _csetf_rg_full_report_props(report_generator, full_report_props);
        _csetf_rg_iterator(report_generator, new_report_generation_iterator(full_report_props, report_generator));
        return report_generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 20298L)
    public static SubLObject report_generator_full_report_props(final SubLObject report_generator) {
        assert sksi_reports_by_column.NIL != report_generator_p(report_generator) : report_generator;
        return rg_full_report_props(report_generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 20481L)
    public static SubLObject report_generator_iterator(final SubLObject report_generator) {
        assert sksi_reports_by_column.NIL != report_generator_p(report_generator) : report_generator;
        return rg_iterator(report_generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 20634L)
    public static SubLObject report_generator_problems(final SubLObject report_generator) {
        assert sksi_reports_by_column.NIL != report_generator_p(report_generator) : report_generator;
        return rg_problems(report_generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 20787L)
    public static SubLObject report_generator_problem_count(final SubLObject report_generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_count = (SubLObject)sksi_reports_by_column.ZERO_INTEGER;
        final SubLObject iterator_var = report_generator_problem_iterator(report_generator);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)sksi_reports_by_column.NIL; sksi_reports_by_column.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject problem_data = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_reports_by_column.NIL != valid) {
                problem_count = Numbers.add(problem_count, (SubLObject)sksi_reports_by_column.ONE_INTEGER);
            }
        }
        return problem_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 21048L)
    public static SubLObject report_generator_do_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject report_generator = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject column_number = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject problem = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list79);
        report_generator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list79);
        column_number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list79);
        problem = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject column_problems = (SubLObject)sksi_reports_by_column.$sym80$COLUMN_PROBLEMS;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(column_number, (SubLObject)sksi_reports_by_column.$list81)), (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$sym82$CDOVECTOR, (SubLObject)ConsesLow.list(column_problems, (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$sym83$REPORT_GENERATOR_PROBLEMS, report_generator)), (SubLObject)ConsesLow.listS((SubLObject)sksi_reports_by_column.$sym84$CDOLIST, (SubLObject)ConsesLow.list(problem, column_problems), ConsesLow.append(body, (SubLObject)sksi_reports_by_column.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$sym85$CINC, column_number)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list79);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 21394L)
    public static SubLObject report_generator_column_count(final SubLObject report_generator) {
        return Numbers.subtract(Sequences.length(report_generator_problems(report_generator)), (SubLObject)sksi_reports_by_column.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 21581L)
    public static SubLObject report_generator_problem_iterator(final SubLObject report_generator) {
        SubLObject problems = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject column_number = (SubLObject)sksi_reports_by_column.ZERO_INTEGER;
        final SubLObject vector_var = report_generator_problems(report_generator);
        final SubLObject backwardP_var = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject cdolist_list_var;
        SubLObject column_problems;
        SubLObject problem;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sksi_reports_by_column.NIL, v_iteration = (SubLObject)sksi_reports_by_column.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sksi_reports_by_column.ONE_INTEGER)) {
            element_num = ((sksi_reports_by_column.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sksi_reports_by_column.ONE_INTEGER) : v_iteration);
            column_problems = (cdolist_list_var = Vectors.aref(vector_var, element_num));
            problem = (SubLObject)sksi_reports_by_column.NIL;
            problem = cdolist_list_var.first();
            while (sksi_reports_by_column.NIL != cdolist_list_var) {
                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(column_number, problem), problems);
                cdolist_list_var = cdolist_list_var.rest();
                problem = cdolist_list_var.first();
            }
            column_number = Numbers.add(column_number, (SubLObject)sksi_reports_by_column.ONE_INTEGER);
        }
        return iteration.new_list_iterator(problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 21846L)
    public static SubLObject report_generator_note_problem(final SubLObject report_generator, SubLObject column, final SubLObject description, final SubLObject physical_field, SubLObject type) {
        if (type == sksi_reports_by_column.UNPROVIDED) {
            type = report_generator_guess_problem_type(description);
        }
        final SubLObject problem = new_report_generator_problem(type, description, physical_field);
        final SubLObject problems = rg_problems(report_generator);
        if (sksi_reports_by_column.NIL == column) {
            column = Numbers.subtract(Sequences.length(problems), (SubLObject)sksi_reports_by_column.ONE_INTEGER);
        }
        Vectors.set_aref(problems, column, (SubLObject)ConsesLow.cons(problem, Vectors.aref(problems, column)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 22356L)
    public static SubLObject report_generator_guess_problem_type(final SubLObject description) {
        return (SubLObject)sksi_reports_by_column.$kw86$GENERAL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 22483L)
    public static SubLObject sxhash_report_generator_method(final SubLObject v_object) {
        return sxhash_report_generator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 22595L)
    public static SubLObject sxhash_report_generator(final SubLObject report_generator) {
        return Sxhash.sxhash(rg_full_report_props(report_generator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject report_generator_problem_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_report_generator_problem(v_object, stream, (SubLObject)sksi_reports_by_column.ZERO_INTEGER);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject report_generator_problem_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $report_generator_problem_native.class) ? sksi_reports_by_column.T : sksi_reports_by_column.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject rg_problem_type(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject rg_problem_description(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject rg_problem_physical_field(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject _csetf_rg_problem_type(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject _csetf_rg_problem_description(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject _csetf_rg_problem_physical_field(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject make_report_generator_problem(SubLObject arglist) {
        if (arglist == sksi_reports_by_column.UNPROVIDED) {
            arglist = (SubLObject)sksi_reports_by_column.NIL;
        }
        final SubLObject v_new = (SubLObject)new $report_generator_problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_reports_by_column.NIL, next = arglist; sksi_reports_by_column.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw103$TYPE)) {
                _csetf_rg_problem_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw104$DESCRIPTION)) {
                _csetf_rg_problem_description(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw105$PHYSICAL_FIELD)) {
                _csetf_rg_problem_physical_field(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_reports_by_column.$str72$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject visit_defstruct_report_generator_problem(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw73$BEGIN, (SubLObject)sksi_reports_by_column.$sym106$MAKE_REPORT_GENERATOR_PROBLEM, (SubLObject)sksi_reports_by_column.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw103$TYPE, rg_problem_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw104$DESCRIPTION, rg_problem_description(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw105$PHYSICAL_FIELD, rg_problem_physical_field(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw76$END, (SubLObject)sksi_reports_by_column.$sym106$MAKE_REPORT_GENERATOR_PROBLEM, (SubLObject)sksi_reports_by_column.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23076L)
    public static SubLObject visit_defstruct_object_report_generator_problem_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_report_generator_problem(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23248L)
    public static SubLObject print_report_generator_problem(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)sksi_reports_by_column.$str108$_REPORT_GENERATOR_PROBLEM_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23414L)
    public static SubLObject new_report_generator_problem(final SubLObject type, final SubLObject description, final SubLObject physical_field) {
        final SubLObject problem = make_report_generator_problem((SubLObject)sksi_reports_by_column.UNPROVIDED);
        _csetf_rg_problem_type(problem, type);
        _csetf_rg_problem_description(problem, description);
        _csetf_rg_problem_physical_field(problem, physical_field);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23746L)
    public static SubLObject report_generator_problem_type(final SubLObject problem) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(problem) : problem;
        return rg_problem_type(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 23900L)
    public static SubLObject report_generator_problem_description(final SubLObject problem) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(problem) : problem;
        return rg_problem_description(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24055L)
    public static SubLObject report_generator_problem_physical_field(final SubLObject problem) {
        assert sksi_reports_by_column.NIL != report_generator_problem_p(problem) : problem;
        return rg_problem_physical_field(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24216L)
    public static SubLObject sxhash_report_generator_problem_method(final SubLObject v_object) {
        return sxhash_report_generator_problem(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24344L)
    public static SubLObject sxhash_report_generator_problem(final SubLObject problem) {
        return Sxhash.sxhash(rg_problem_type(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject report_generation_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_report_generation_state(v_object, stream, (SubLObject)sksi_reports_by_column.ZERO_INTEGER);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject report_generation_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $report_generation_state_native.class) ? sksi_reports_by_column.T : sksi_reports_by_column.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_ks(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_range(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_mt(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_pf_iterator(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_iterations(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_merged_props(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_results_table(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_executed_queries(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject rg_state_report_generator(final SubLObject v_object) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_ks(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_range(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_mt(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_pf_iterator(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_iterations(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_merged_props(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_results_table(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_executed_queries(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject _csetf_rg_state_report_generator(final SubLObject v_object, final SubLObject value) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject make_report_generation_state(SubLObject arglist) {
        if (arglist == sksi_reports_by_column.UNPROVIDED) {
            arglist = (SubLObject)sksi_reports_by_column.NIL;
        }
        final SubLObject v_new = (SubLObject)new $report_generation_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_reports_by_column.NIL, next = arglist; sksi_reports_by_column.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw137$KS)) {
                _csetf_rg_state_ks(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw138$RANGE)) {
                _csetf_rg_state_range(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw139$MT)) {
                _csetf_rg_state_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw140$PF_ITERATOR)) {
                _csetf_rg_state_pf_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw141$ITERATIONS)) {
                _csetf_rg_state_iterations(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw142$MERGED_PROPS)) {
                _csetf_rg_state_merged_props(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw143$RESULTS_TABLE)) {
                _csetf_rg_state_results_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw144$EXECUTED_QUERIES)) {
                _csetf_rg_state_executed_queries(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_reports_by_column.$kw145$REPORT_GENERATOR)) {
                _csetf_rg_state_report_generator(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_reports_by_column.$str72$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject visit_defstruct_report_generation_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw73$BEGIN, (SubLObject)sksi_reports_by_column.$sym146$MAKE_REPORT_GENERATION_STATE, (SubLObject)sksi_reports_by_column.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw137$KS, rg_state_ks(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw138$RANGE, rg_state_range(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw139$MT, rg_state_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw140$PF_ITERATOR, rg_state_pf_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw141$ITERATIONS, rg_state_iterations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw142$MERGED_PROPS, rg_state_merged_props(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw143$RESULTS_TABLE, rg_state_results_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw144$EXECUTED_QUERIES, rg_state_executed_queries(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw75$SLOT, (SubLObject)sksi_reports_by_column.$kw145$REPORT_GENERATOR, rg_state_report_generator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_reports_by_column.$kw76$END, (SubLObject)sksi_reports_by_column.$sym146$MAKE_REPORT_GENERATION_STATE, (SubLObject)sksi_reports_by_column.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 24976L)
    public static SubLObject visit_defstruct_object_report_generation_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_report_generation_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 25459L)
    public static SubLObject print_report_generation_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)sksi_reports_by_column.$str148$_REPORT_GENERATION_STATE_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 25623L)
    public static SubLObject new_report_generation_state(final SubLObject ks, final SubLObject range, final SubLObject mt, final SubLObject pf_iterator, final SubLObject iterations, final SubLObject merged_props, final SubLObject results_table, final SubLObject executed_queries, final SubLObject report_generator) {
        final SubLObject state = make_report_generation_state((SubLObject)sksi_reports_by_column.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 26303L)
    public static SubLObject report_generation_state_ks(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_ks(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 26443L)
    public static SubLObject report_generation_state_range(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_range(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 26577L)
    public static SubLObject report_generation_state_mt(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_mt(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 26705L)
    public static SubLObject report_generation_state_pf_iterator(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_pf_iterator(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 26851L)
    public static SubLObject report_generation_state_iterations(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_iterations(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 26995L)
    public static SubLObject report_generation_state_merged_props(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_merged_props(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 27143L)
    public static SubLObject report_generation_state_results_table(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_results_table(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 27293L)
    public static SubLObject report_generation_state_executed_queries(final SubLObject state) {
        assert sksi_reports_by_column.NIL != report_generation_state_p(state) : state;
        return rg_state_executed_queries(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 27449L)
    public static SubLObject sxhash_report_generation_state_method(final SubLObject v_object) {
        return sxhash_report_generation_state(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 27575L)
    public static SubLObject sxhash_report_generation_state(final SubLObject state) {
        return Sxhash.sxhash(rg_state_ks(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 27681L)
    public static SubLObject make_report_generation_iterator_state(final SubLObject report_props, final SubLObject report_generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject range_spec = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw41$COLUMN_RANGE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject mt = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject results_table = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject executed_queries = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject state = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pfs = apply_range_specifier_to_sequence(sksi_report_generation.reportgen_schema_field_list(ks), range_spec);
            final SubLObject merged_props = merge_in_default_overriding_properties(report_props);
            results_table = misc_utilities.uninitialized();
            executed_queries = (SubLObject)sksi_reports_by_column.NIL;
            state = new_report_generation_state(ks, range_spec, mt, pfs, (SubLObject)sksi_reports_by_column.ZERO_INTEGER, merged_props, results_table, executed_queries, report_generator);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 28401L)
    public static SubLObject report_generation_iterator_done_p(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL != misc_utilities.initialized_p(rg_state_results_table(state)) && sksi_reports_by_column.NIL != iteration.iteration_done(rg_state_pf_iterator(state)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 28575L)
    public static SubLObject report_generation_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pfs = rg_state_pf_iterator(state);
        final SubLObject n = rg_state_iterations(state);
        SubLObject results_table = rg_state_results_table(state);
        final SubLObject merged_props = rg_state_merged_props(state);
        final SubLObject ks = list_utilities.plist_lookup(merged_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject report_generator = rg_state_report_generator(state);
        final SubLObject executed_queries = rg_state_executed_queries(state);
        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str150$Executed_queries_state___s__, rg_state_executed_queries(state));
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (sksi_reports_by_column.NIL == misc_utilities.initialized_p(rg_state_results_table(state))) {
                SubLObject error_message = (SubLObject)sksi_reports_by_column.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sksi_reports_by_column.$sym151$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            results_table = initialized_report_hashtable_new(merged_props);
                            _csetf_rg_state_results_table(state, results_table);
                            pfs = iteration.new_list_iterator(pfs);
                            _csetf_rg_state_pf_iterator(state, pfs);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sksi_reports_by_column.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (sksi_reports_by_column.NIL != error_message) {
                    Errors.warn(error_message);
                    report_generator_note_problem(report_generator, (SubLObject)sksi_reports_by_column.NIL, error_message, (SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                }
            }
            final SubLObject pf = iteration.iteration_next(pfs);
            _csetf_rg_state_executed_queries(state, add_final_column_answers_to_hashtable(results_table, pf, n, merged_props, report_generator, executed_queries));
            if (sksi_reports_by_column.NIL != report_generation_iterator_done_p(state) && sksi_reports_by_column.NIL != kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const152$databaseForReportGeneratorOutput, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                persist_hashtable_in_database(results_table, ks);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _csetf_rg_state_iterations(state, Numbers.add(rg_state_iterations(state), (SubLObject)sksi_reports_by_column.ONE_INTEGER));
        return Values.values(results_table, state, (SubLObject)sksi_reports_by_column.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 30346L)
    public static SubLObject replace_with_null(final SubLObject input) {
        if (input.equal((SubLObject)sksi_reports_by_column.$str7$)) {
            return (SubLObject)sksi_reports_by_column.$kw153$NULL;
        }
        return input;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 30453L)
    public static SubLObject persist_hashtable_in_database(final SubLObject hashtable, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rg_ls = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const154$logicalSchemaSourceMap, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject rg_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, sksi_reports_by_column.$const155$reportGeneratorLogicalSchemaToNat, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject rg_field_list = kb_mapping_utilities.fpred_value_in_any_mt(rg_ps, sksi_reports_by_column.$const156$schemaFieldNameList, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).rest();
        final SubLObject db_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, sksi_reports_by_column.$const157$reportGeneratorLogicalSchemaToDat, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject db_table_name = kb_mapping_utilities.fpred_value_in_any_mt(db_ps, sksi_reports_by_column.$const158$schemaName_SKS, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject db_ks = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const152$databaseForReportGeneratorOutput, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject csql_statement = (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw159$INTO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw160$TABLE, db_table_name)));
        SubLObject field_list = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == rg_ls) {
            Errors.error((SubLObject)sksi_reports_by_column.$str161$Could_not_find_logicalSchemaSourc, ks);
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == rg_ps) {
            Errors.error((SubLObject)sksi_reports_by_column.$str162$Could_not_find_reportGeneratorLog, rg_ps);
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == rg_field_list) {
            Errors.error((SubLObject)sksi_reports_by_column.$str163$Could_not_find_schemaFieldNameLis, rg_ps);
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == db_ps) {
            Errors.error((SubLObject)sksi_reports_by_column.$str164$Could_not_find_reportGeneratorLog, rg_ls);
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == db_table_name) {
            Errors.error((SubLObject)sksi_reports_by_column.$str165$Could_not_find_schemaName_SKS_for, db_ps);
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == db_ks) {
            Errors.error((SubLObject)sksi_reports_by_column.$str166$Could_not_find_databaseForReportG, ks);
        }
        SubLObject cdolist_list_var = rg_field_list;
        SubLObject rg_field_elem = (SubLObject)sksi_reports_by_column.NIL;
        rg_field_elem = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            final SubLObject rg_lfi = kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const167$logicalFieldValueWithFieldName, rg_ls, rg_field_elem, (SubLObject)sksi_reports_by_column.$list168, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).first().first();
            final SubLObject db_pfi = kb_mapping_utilities.pred_u_v_w_holds_tuples(sksi_reports_by_column.$const169$fieldEncodingPFIAndLFI, db_ps, rg_ls, rg_lfi, (SubLObject)sksi_reports_by_column.$list170, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.FOUR_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED).first().first();
            final SubLObject db_col_name = kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const171$physicalSchemaFieldIndexicalWithN, db_ps, db_pfi, (SubLObject)sksi_reports_by_column.$list168, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).first().first();
            if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == rg_lfi) {
                Errors.error((SubLObject)sksi_reports_by_column.$str172$Could_not_find_logicalFieldValueW, rg_ls, rg_field_elem);
            }
            if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == db_pfi) {
                Errors.error((SubLObject)sksi_reports_by_column.$str173$Could_not_find_fieldEncodingPFIAn, db_ps, rg_ls, rg_lfi);
            }
            if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == db_col_name) {
                Errors.error((SubLObject)sksi_reports_by_column.$str174$Could_not_find_physicalSchemaFiel, db_ps, db_pfi);
            }
            field_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw175$FIELD, db_col_name), field_list);
            cdolist_list_var = cdolist_list_var.rest();
            rg_field_elem = cdolist_list_var.first();
        }
        field_list = Sequences.reverse(field_list);
        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str176$___S, field_list);
        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str177$RG_field_list_____S__, rg_field_list);
        SubLObject key = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject value = (SubLObject)sksi_reports_by_column.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                SubLObject csql_statement_mod = (SubLObject)sksi_reports_by_column.NIL;
                SubLObject insert_values = (SubLObject)sksi_reports_by_column.NIL;
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str178$Value___S__, value);
                SubLObject cdolist_list_var2 = rg_field_list;
                SubLObject a_field = (SubLObject)sksi_reports_by_column.NIL;
                a_field = cdolist_list_var2.first();
                while (sksi_reports_by_column.NIL != cdolist_list_var2) {
                    insert_values = (SubLObject)ConsesLow.cons(list_utilities.plist_lookup(value, Symbols.make_keyword(Strings.string_upcase(a_field, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)), (SubLObject)sksi_reports_by_column.UNPROVIDED), insert_values);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    a_field = cdolist_list_var2.first();
                }
                csql_statement_mod = (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw179$INSERT, csql_statement, field_list, (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw180$VALUES, Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym181$REPLACE_WITH_NULL, Sequences.reverse(insert_values))));
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str182$New_hash_table___S__, csql_statement_mod);
                sksi_sks_interaction.sksi_execute_csql_in_mapping_mt(db_ks, csql_statement_mod);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 33526L)
    public static SubLObject run_batch_reports_from_definition_file(final SubLObject filename) {
        final SubLObject definition = read_batch_definition_from_file(filename);
        run_batch_reports_from_definition(definition);
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 34080L)
    public static SubLObject run_batch_reports_from_definition(final SubLObject definition) {
        final SubLObject global_props = get_global_batch_report_props_from_definition(definition);
        SubLObject cdolist_list_var;
        final SubLObject report_props_alist = cdolist_list_var = get_batch_properties_for_all_reports_from_definition(definition);
        SubLObject cons = (SubLObject)sksi_reports_by_column.NIL;
        cons = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sksi_reports_by_column.NIL;
            SubLObject props = (SubLObject)sksi_reports_by_column.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list185);
            key = current.first();
            current = (props = current.rest());
            props = list_utilities.merge_plist(global_props, props);
            report_by_column_to_file(props);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 34473L)
    public static SubLObject read_batch_definition_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject definition = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject stream = (SubLObject)sksi_reports_by_column.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)sksi_reports_by_column.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)sksi_reports_by_column.$kw186$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)sksi_reports_by_column.$str35$Unable_to_open__S, filename);
            }
            final SubLObject in_stream = stream;
            definition = reader.read_ignoring_errors(in_stream, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return definition;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 34953L)
    public static SubLObject get_global_batch_report_props_from_definition(final SubLObject definition) {
        return list_utilities.plist_lookup(definition, (SubLObject)sksi_reports_by_column.$kw187$GLOBAL, (SubLObject)sksi_reports_by_column.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 35183L)
    public static SubLObject get_batch_properties_for_all_reports_from_definition(final SubLObject definition) {
        final SubLObject just_reports = conses_high.remf(conses_high.copy_list(definition), (SubLObject)sksi_reports_by_column.$kw187$GLOBAL);
        final SubLObject report_identifiers = Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym188$SYMBOL_NAME, list_utilities.plist_keys(just_reports));
        final SubLObject report_values = list_utilities.plist_values(just_reports);
        return conses_high.pairlis(report_identifiers, report_values, (SubLObject)sksi_reports_by_column.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 35649L)
    public static SubLObject apply_range_specifier_to_sequence(final SubLObject seq, final SubLObject range_spec) {
        return list_utilities.sequence_elements(seq, parse_number_range_specifier(range_spec, number_utilities.f_1_(Sequences.length(seq))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 36119L)
    public static SubLObject parse_number_range_specifier(SubLObject spec, SubLObject last) {
        if (last == sksi_reports_by_column.UNPROVIDED) {
            last = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (sksi_reports_by_column.NIL != last) {
            spec = list_utilities.tree_substitute(spec, (SubLObject)sksi_reports_by_column.NIL, last);
        }
        final SubLObject list_var = spec;
        assert sksi_reports_by_column.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)sksi_reports_by_column.NIL;
        elem = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            assert sksi_reports_by_column.NIL != range_specifier_item_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Mapping.mapcan(Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym191$EXPAND_RANGE_SPECIFIER_ITEM), spec, sksi_reports_by_column.EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 36933L)
    public static SubLObject range_specifier_item_p(final SubLObject item) {
        if (sksi_reports_by_column.NIL != subl_promotions.non_negative_integer_p(item)) {
            return (SubLObject)sksi_reports_by_column.T;
        }
        if (sksi_reports_by_column.NIL != list_utilities.doubletonP(item)) {
            final SubLObject start = item.first();
            final SubLObject end = conses_high.second(item);
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL != subl_promotions.non_negative_integer_p(start) && sksi_reports_by_column.NIL != subl_promotions.non_negative_integer_p(end) && end.numGE(start));
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 37236L)
    public static SubLObject expand_range_specifier_item(final SubLObject item) {
        assert sksi_reports_by_column.NIL != range_specifier_item_p(item) : item;
        if (item.isAtom()) {
            return (SubLObject)ConsesLow.list(item);
        }
        final SubLObject start = item.first();
        final SubLObject end = conses_high.second(item);
        return list_utilities.new_num_list(number_utilities.f_1X(Numbers.subtract(end, start)), start);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 37626L)
    public static SubLObject gafs_from_ks_internal(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = sksi_report_generation.reportgen_schema_field_list(ks);
            SubLObject pf = (SubLObject)sksi_reports_by_column.NIL;
            pf = cdolist_list_var.first();
            while (sksi_reports_by_column.NIL != cdolist_list_var) {
                gafs = (SubLObject)ConsesLow.cons(query_lfi_gaf_from_pf(pf, ks), gafs);
                cdolist_list_var = cdolist_list_var.rest();
                pf = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 37626L)
    public static SubLObject gafs_from_ks(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL == v_memoization_state) {
            return gafs_from_ks_internal(ks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reports_by_column.$sym192$GAFS_FROM_KS, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reports_by_column.$sym192$GAFS_FROM_KS, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.EQ, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reports_by_column.$sym192$GAFS_FROM_KS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gafs_from_ks_internal(ks)));
            memoization_state.caching_state_put(caching_state, ks, results, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 37945L)
    public static SubLObject initialized_report_hashtable(final SubLObject report_props, SubLObject physical_fields) {
        if (physical_fields == sksi_reports_by_column.UNPROVIDED) {
            physical_fields = (SubLObject)sksi_reports_by_column.NIL;
        }
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL == physical_fields) {
            physical_fields = sksi_report_generation.reportgen_schema_field_list(ks);
        }
        final SubLObject hashtable = hash_table_utilities.hash_list_elements(all_selected_entities(report_props), Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUAL), (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject key = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject value = (SubLObject)sksi_reports_by_column.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                Hashtables.sethash(key, hashtable, Vectors.make_vector(Sequences.length(physical_fields), sksi_reports_by_column.$rgbc_initial_value_for_pfs$.getGlobalValue()));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 38497L)
    public static SubLObject initialized_report_hashtable_new(final SubLObject report_props) {
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject rg_ls = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const154$logicalSchemaSourceMap, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject rg_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, sksi_reports_by_column.$const155$reportGeneratorLogicalSchemaToNat, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject pfi_field_name_tuple = kb_mapping_utilities.pred_value_tuples(rg_ps, sksi_reports_by_column.$const193$physicalSchemaFieldWithName, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.$list194, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject pfi_list = kb_mapping_utilities.fpred_value(rg_ps, sksi_reports_by_column.$const195$schemaFieldList, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).rest();
        final SubLObject field_name_list = kb_mapping_utilities.fpred_value(rg_ps, sksi_reports_by_column.$const156$schemaFieldNameList, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).rest();
        SubLObject default_values = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject cdolist_list_var = pfi_list;
        SubLObject a_pfi = (SubLObject)sksi_reports_by_column.NIL;
        a_pfi = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            default_values = (SubLObject)ConsesLow.cons(rgbc_default_value_for_pf(a_pfi, query_lfi_gaf_from_pf(a_pfi, ks), report_props), default_values);
            cdolist_list_var = cdolist_list_var.rest();
            a_pfi = cdolist_list_var.first();
        }
        default_values = Sequences.reverse(default_values);
        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str196$Default_values___s__, default_values);
        final SubLObject hashtable = hash_table_utilities.hash_list_elements(all_selected_entities(report_props), Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUAL), (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject key = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject value = (SubLObject)sksi_reports_by_column.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                Hashtables.sethash(key, hashtable, list_utilities.make_plist(Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym49$MAKE_KEYWORD, Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym50$STRING_UPCASE, field_name_list)), default_values));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 40105L)
    public static SubLObject add_final_column_answers_to_hashtable(final SubLObject hashtable, final SubLObject pf, final SubLObject column_num, final SubLObject report_props, final SubLObject report_generator, SubLObject executed_queries) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject query_lfi_gaf = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject error_message = (SubLObject)sksi_reports_by_column.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_reports_by_column.$sym151$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    query_lfi_gaf = query_lfi_gaf_from_pf(pf, ks);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_reports_by_column.NIL);
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
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject ks2 = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject lfi1 = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject column_query = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list197);
        ks2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list197);
        lfi1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list197);
        column_query = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            if (Sequences.position(column_query, executed_queries, Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUAL), (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).isNumber()) {
                return executed_queries;
            }
            executed_queries = (SubLObject)ConsesLow.cons(column_query, executed_queries);
            if (sksi_reports_by_column.NIL == query_lfi_gaf) {
                if (sksi_reports_by_column.NIL != error_message) {
                    report_generator_note_problem(report_generator, column_num, error_message, pf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                    Errors.warn(error_message);
                }
                return hashtable;
            }
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)sksi_reports_by_column.$sym151$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject closed_queryP = sksi_report_generation.query_lfi_gaf_for_closed_queryP(query_lfi_gaf);
                        final SubLObject logical_true = sksi_report_generation.convert_to_boolean_kb_constant((SubLObject)sksi_reports_by_column.T);
                        final SubLObject raw_answer_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUALP), (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str198$Hashtable_contents_before___);
                        hash_table_utilities.printhash(hashtable, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject answers = run_modified_query_for_answer_list_multiple_io(report_props, query_lfi_gaf);
                        final SubLObject halt_reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (halt_reason != sksi_reports_by_column.$kw199$EXHAUST_TOTAL) {
                            report_generator_note_problem(report_generator, column_num, print_high.princ_to_string(halt_reason), pf, (SubLObject)sksi_reports_by_column.$kw200$ABNORMAL_HALT_REASON);
                        }
                        SubLObject cdolist_list_var = answers;
                        SubLObject v_answer = (SubLObject)sksi_reports_by_column.NIL;
                        v_answer = cdolist_list_var.first();
                        while (sksi_reports_by_column.NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject key = unpack_column_answer(v_answer, closed_queryP, logical_true);
                            final SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str201$Property_list___s___, list_utilities.property_list_p(value.first()));
                            dictionary_utilities.dictionary_pushnew(raw_answer_dictionary, key, value, Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUALP), (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_answer = cdolist_list_var.first();
                        }
                        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str202$Dictionary_Contents____);
                        dictionary_utilities.print_dictionary_contents(raw_answer_dictionary, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        store_encoded_answers_new(hashtable, raw_answer_dictionary, ks);
                        fill_in_default_values_for_report_column(hashtable, pf, column_num, query_lfi_gaf, report_props);
                        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str203$Hashtable_contents_after__);
                        hash_table_utilities.printhash(hashtable, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str204$_________________________________);
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)sksi_reports_by_column.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_reports_by_column.NIL != error_message) {
                report_generator_note_problem(report_generator, column_num, error_message, pf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                Errors.warn(error_message);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list197);
        }
        return executed_queries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 42984L)
    public static SubLObject store_encoded_answers_new(final SubLObject hashtable, final SubLObject raw_answer_dictionary, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rg_ls = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const154$logicalSchemaSourceMap, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject rg_ps = kb_mapping_utilities.fpred_value_in_any_mt(rg_ls, sksi_reports_by_column.$const155$reportGeneratorLogicalSchemaToNat, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject rg_lfi_to_rg_pfi_map = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const169$fieldEncodingPFIAndLFI, rg_ps, rg_ls, (SubLObject)sksi_reports_by_column.$list205, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(raw_answer_dictionary)); sksi_reports_by_column.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject res_row = value.first().first();
            SubLObject store_row = Hashtables.gethash(key, hashtable, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str206$dict_key___s__, key);
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str207$Result_plist___s__, res_row);
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str208$Store_row___s__, store_row);
            SubLObject cdolist_list_var = list_utilities.plist_keys(res_row);
            SubLObject res_plist_key = (SubLObject)sksi_reports_by_column.NIL;
            res_plist_key = cdolist_list_var.first();
            while (sksi_reports_by_column.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str209$_s___, list_utilities.plist_lookup(res_row, res_plist_key, (SubLObject)sksi_reports_by_column.UNPROVIDED));
                final SubLObject res_elem = list_utilities.plist_lookup(res_row, res_plist_key, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                final SubLObject result = res_elem.first();
                final SubLObject rg_lfi = conses_high.second(res_elem);
                final SubLObject rg_pfi = Hashtables.gethash(rg_lfi, rg_lfi_to_rg_pfi_map, (SubLObject)sksi_reports_by_column.UNPROVIDED).first();
                final SubLObject rg_pf = kb_mapping_utilities.fpred_value_in_any_mt(rg_pfi, sksi_reports_by_column.$const210$indexicalForPhysicalField, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                SubLObject encoded_value = (SubLObject)sksi_reports_by_column.NIL;
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str211$Result____s__, result);
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str212$RG_LFI____s__, rg_lfi);
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str213$RG_PFI____s__, rg_pfi);
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str214$RG_PF____s__, rg_pf);
                thread.resetMultipleValues();
                final SubLObject encoding_expression = sksi_report_generation.reportgen_encoding_expression_from_physical_field(rg_pf, ks);
                final SubLObject collect_multiple_valuesP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str215$encoding_expression____s__, encoding_expression);
                encoded_value = encode_logical_answer((SubLObject)ConsesLow.list(result), (SubLObject)sksi_reports_by_column.NIL, collect_multiple_valuesP, rg_pf, ks, encoding_expression);
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str216$encoded_value____s__, encoded_value);
                if (sksi_reports_by_column.NIL != list_utilities.property_list_p(store_row)) {
                    store_row = conses_high.putf(store_row, res_plist_key, encoded_value);
                }
                cdolist_list_var = cdolist_list_var.rest();
                res_plist_key = cdolist_list_var.first();
            }
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str217$Store_row__after____s__, store_row);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 44858L)
    public static SubLObject store_encoded_answers(final SubLObject raw_answer_dictionary, final SubLObject hashtable, final SubLObject pf, final SubLObject column_num, final SubLObject report_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject clobber_multiple_valuesP = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw218$CLOBBER_MULTIPLE_VALUES_, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject any_multiplesP = (SubLObject)sksi_reports_by_column.NIL;
        thread.resetMultipleValues();
        final SubLObject encoding_expression = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        final SubLObject collect_multiple_valuesP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(raw_answer_dictionary)); sksi_reports_by_column.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject logical_values = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject curr_vector = Hashtables.gethash(key, hashtable, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject physical_value = encode_logical_answer(logical_values, clobber_multiple_valuesP, collect_multiple_valuesP, pf, ks, encoding_expression);
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str219$vectorp___S__curr_vector___S__col, new SubLObject[] { Types.vectorp(curr_vector), curr_vector, column_num, physical_value });
            if (curr_vector.isVector()) {
                Vectors.set_aref(curr_vector, column_num, physical_value);
            }
            if (sksi_reports_by_column.NIL == clobber_multiple_valuesP && sksi_reports_by_column.NIL != list_utilities.lengthG(logical_values, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
                any_multiplesP = (SubLObject)sksi_reports_by_column.T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return any_multiplesP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 46085L)
    public static SubLObject encode_logical_answer(final SubLObject logical_values, final SubLObject clobber_multiple_valuesP, final SubLObject collect_multiple_valuesP, final SubLObject pf, final SubLObject ks, final SubLObject encoding_expression) {
        if (sksi_reports_by_column.NIL != collect_multiple_valuesP) {
            final SubLObject logical_value = el_utilities.make_el_formula(sksi_reports_by_column.$const220$TheSet, logical_values, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject physical_value = apply_encoding_for_pf(pf, logical_value, ks, encoding_expression);
            return physical_value;
        }
        if (sksi_reports_by_column.NIL != clobber_multiple_valuesP && sksi_reports_by_column.NIL != list_utilities.lengthG(logical_values, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED)) {
            return (SubLObject)sksi_reports_by_column.$kw221$MULTIPLE_ANSWERS;
        }
        final SubLObject logical_value = logical_values.first();
        final SubLObject physical_value = apply_encoding_for_pf(pf, logical_value, ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        return physical_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 46830L)
    public static SubLObject unpack_column_answer(final SubLObject v_answer, final SubLObject closed_queryP, final SubLObject logical_true) {
        if (sksi_reports_by_column.NIL != closed_queryP) {
            return Values.values(v_answer.first(), v_answer.rest());
        }
        return Values.values(v_answer.first(), v_answer.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 47070L)
    public static SubLObject warn_about_multiple_values(final SubLObject query_lfi_gaf) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject ks = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject lfi = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject final_query = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list222);
        ks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list222);
        lfi = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list222);
        final_query = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            Errors.warn((SubLObject)sksi_reports_by_column.$str223$Some_rows_unexpectedly_returned_m, final_query, lfi, kb_query.kbq_sentence(final_query));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list222);
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 47389L)
    public static SubLObject apply_encoding_for_pf_internal(final SubLObject pf, final SubLObject logical_value, final SubLObject ks, SubLObject expr) {
        if (expr == sksi_reports_by_column.UNPROVIDED) {
            expr = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        }
        final SubLObject lfi = sksi_report_generation.encoding_logical_field_indexical(expr);
        return my_sksi_apply_encoding_and_reformulate((SubLObject)ConsesLow.list(reader.bq_cons(lfi, logical_value)), expr, ks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 47389L)
    public static SubLObject apply_encoding_for_pf(final SubLObject pf, final SubLObject logical_value, final SubLObject ks, SubLObject expr) {
        if (expr == sksi_reports_by_column.UNPROVIDED) {
            expr = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL == v_memoization_state) {
            return apply_encoding_for_pf_internal(pf, logical_value, ks, expr);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reports_by_column.$sym224$APPLY_ENCODING_FOR_PF, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reports_by_column.$sym224$APPLY_ENCODING_FOR_PF, (SubLObject)sksi_reports_by_column.FOUR_INTEGER, (SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.EQUALP, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reports_by_column.$sym224$APPLY_ENCODING_FOR_PF, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pf, logical_value, ks, expr);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_reports_by_column.NIL;
            collision = cdolist_list_var.first();
            while (sksi_reports_by_column.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pf.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_value.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ks.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_reports_by_column.NIL != cached_args && sksi_reports_by_column.NIL == cached_args.rest() && expr.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(apply_encoding_for_pf_internal(pf, logical_value, ks, expr)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pf, logical_value, ks, expr));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 47714L)
    public static SubLObject my_sksi_apply_encoding_and_reformulate(final SubLObject alist, final SubLObject encoding, final SubLObject sks) {
        final SubLObject result = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 48053L)
    public static SubLObject rgbc_compute_modified_query_properties(final SubLObject query_spec, final SubLObject report_props) {
        final SubLObject new_properties = list_utilities.merge_plist(kb_query.kbq_query_properties(query_spec), query_properties_from_report_properties(report_props));
        return new_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 48523L)
    public static SubLObject run_modified_query_for_answer_list(final SubLObject report_props, final SubLObject query_lfi_gaf) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject ks = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject lfi = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject column_query = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        ks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        lfi = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        column_query = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            final SubLObject ks_$10 = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks_$10);
            if (sksi_reports_by_column.NIL != source_template) {
                final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_reports_by_column.$const226$kSVariantHasFieldQueryWFocalArgPo, ks_$10, lfi, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                if (sksi_reports_by_column.NIL != gaf) {
                    column_query = assertions_high.gaf_arg4(gaf);
                }
            }
            final SubLObject selection_sentence = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw227$SELECTION_SENTENCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            SubLObject current_$12;
            final SubLObject datum_$11 = current_$12 = create_modified_query_sentence(selection_sentence, column_query, ks);
            SubLObject new_entity_var = (SubLObject)sksi_reports_by_column.NIL;
            SubLObject new_sentence = (SubLObject)sksi_reports_by_column.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)sksi_reports_by_column.$list228);
            new_entity_var = current_$12.first();
            current_$12 = current_$12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)sksi_reports_by_column.$list228);
            new_sentence = current_$12.first();
            current_$12 = current_$12.rest();
            if (sksi_reports_by_column.NIL == current_$12) {
                final SubLObject final_answer_argpos = kb_mapping_utilities.fpred_value_in_any_mt(column_query, sksi_reports_by_column.$const229$queryHasFocalOutputVariablePositi, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                final SubLObject template = (sksi_reports_by_column.NIL != sksi_report_generation.query_lfi_gaf_for_closed_queryP(query_lfi_gaf)) ? new_entity_var : reader.bq_cons(new_entity_var, cycl_utilities.formula_cycl_arg_position(kb_query.kbq_sentence(column_query), final_answer_argpos, (SubLObject)sksi_reports_by_column.UNPROVIDED));
                return my_rgbc_query_template(template, new_sentence, kb_query.kbq_mt(column_query), rgbc_compute_modified_query_properties(column_query, report_props), column_query, lfi);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$11, (SubLObject)sksi_reports_by_column.$list228);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list225);
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 49737L)
    public static SubLObject run_modified_query_for_answer_list_multiple_io(final SubLObject report_props, final SubLObject query_lfi_gaf) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject ks = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject lfi = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject column_query = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        ks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        lfi = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        column_query = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            final SubLObject ks_$13 = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks_$13);
            if (sksi_reports_by_column.NIL != source_template) {
                final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_reports_by_column.$const226$kSVariantHasFieldQueryWFocalArgPo, ks_$13, lfi, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                if (sksi_reports_by_column.NIL != gaf) {
                    column_query = assertions_high.gaf_arg4(gaf);
                }
            }
            final SubLObject selection_sentence = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw227$SELECTION_SENTENCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject query_output_hash = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const230$queryHasFocalOutputVariablePositi, column_query, ks, (SubLObject)sksi_reports_by_column.$list205, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED));
            final SubLObject lfi_input_hash = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const231$kSHasQueryOutputIndexicalForLogic, ks, column_query, (SubLObject)sksi_reports_by_column.$list232, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED));
            SubLObject final_answer_var_list = (SubLObject)sksi_reports_by_column.NIL;
            SubLObject field_name_list = (SubLObject)sksi_reports_by_column.NIL;
            SubLObject key_lfi = (SubLObject)sksi_reports_by_column.NIL;
            SubLObject value_lfi = (SubLObject)sksi_reports_by_column.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(lfi_input_hash);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key_lfi = Hashtables.getEntryKey(cdohash_entry);
                    value_lfi = Hashtables.getEntryValue(cdohash_entry);
                    SubLObject answer_argpos = (SubLObject)sksi_reports_by_column.NIL;
                    answer_argpos = Hashtables.gethash(value_lfi.first(), query_output_hash, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                    if (sksi_reports_by_column.NIL != sksi_report_generation.query_lfi_gaf_for_closed_queryP(query_lfi_gaf)) {
                        final_answer_var_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_reports_by_column.$const17$True, key_lfi), final_answer_var_list);
                    }
                    else {
                        final_answer_var_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_cycl_arg_position(kb_query.kbq_sentence(column_query), answer_argpos.first(), (SubLObject)sksi_reports_by_column.UNPROVIDED), key_lfi), final_answer_var_list);
                    }
                    field_name_list = (SubLObject)ConsesLow.cons(Strings.string_upcase(kb_mapping_utilities.fpred_value_in_any_mt(key_lfi, sksi_reports_by_column.$const167$logicalFieldValueWithFieldName, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED), (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED), field_name_list);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str233$Answer_var_list___s___, final_answer_var_list);
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str234$Field_name_list___s___, field_name_list);
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = create_modified_query_sentence_multiple_io(report_props, selection_sentence, column_query, ks);
            SubLObject new_entity_var = (SubLObject)sksi_reports_by_column.NIL;
            SubLObject new_sentence = (SubLObject)sksi_reports_by_column.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)sksi_reports_by_column.$list228);
            new_entity_var = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)sksi_reports_by_column.$list228);
            new_sentence = current_$15.first();
            current_$15 = current_$15.rest();
            if (sksi_reports_by_column.NIL == current_$15) {
                final SubLObject final_answer_argpos = Hashtables.gethash(Hashtables.gethash(lfi, lfi_input_hash, (SubLObject)sksi_reports_by_column.UNPROVIDED).first(), query_output_hash, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                final SubLObject template = (SubLObject)ConsesLow.list(new_entity_var, list_utilities.make_plist(Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym49$MAKE_KEYWORD, field_name_list), final_answer_var_list));
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str209$_s___, final_answer_argpos);
                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str235$Modified_Column_Query___S___, new_sentence);
                return my_rgbc_query_template(template, new_sentence, kb_query.kbq_mt(column_query), rgbc_compute_modified_query_properties(column_query, report_props), column_query, lfi);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$14, (SubLObject)sksi_reports_by_column.$list228);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list225);
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 52250L)
    public static SubLObject report_generator_query_for_physical_field(final SubLObject report_generator, final SubLObject pf) {
        final SubLObject report_props = report_generator_full_report_props(report_generator);
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject query_lfi_gaf = query_lfi_gaf_from_pf(pf, ks);
        final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(query_lfi_gaf, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject ks_$16 = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject lfi = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject column_query = (SubLObject)sksi_reports_by_column.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        ks_$16 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        lfi = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list225);
        column_query = current.first();
        current = current.rest();
        if (sksi_reports_by_column.NIL == current) {
            if (sksi_reports_by_column.NIL != source_template) {
                final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf(sksi_reports_by_column.$const226$kSVariantHasFieldQueryWFocalArgPo, ks_$16, lfi, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                if (sksi_reports_by_column.NIL != gaf) {
                    column_query = assertions_high.gaf_arg4(gaf);
                }
            }
            return column_query;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list225);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 52902L)
    public static SubLObject my_rgbc_query_template(final SubLObject template, final SubLObject sentence, final SubLObject mt, final SubLObject props, SubLObject query_spec, SubLObject lfi) {
        if (query_spec == sksi_reports_by_column.UNPROVIDED) {
            query_spec = (SubLObject)sksi_reports_by_column.NIL;
        }
        if (lfi == sksi_reports_by_column.UNPROVIDED) {
            lfi = (SubLObject)sksi_reports_by_column.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.query_template(template, sentence, mt, props);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_reports_by_column.NIL == results || halt_reason != sksi_reports_by_column.$kw199$EXHAUST_TOTAL) {
            Errors.warn((SubLObject)sksi_reports_by_column.$str236$Query_halted_unusually_with__D_re, new SubLObject[] { Sequences.length(results), halt_reason, query_spec, lfi, sentence, mt, props });
        }
        return Values.values(results, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 53646L)
    public static SubLObject create_modified_query_sentence(SubLObject selection_sentence, final SubLObject query_spec, final SubLObject ks) {
        selection_sentence = maybe_augment_selection_sentence_with_base_query(selection_sentence, ks);
        final SubLObject original_sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject entity_argpos = kb_mapping_utilities.fpred_value_in_any_mt(query_spec, sksi_reports_by_column.$const237$queryHasFocalInputVariablePositio, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject free_var_from_selection_sentence = el_utilities.sentence_free_variables(selection_sentence, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED).first();
        final SubLObject free_var_from_query_sentence = cycl_utilities.formula_cycl_arg_position(original_sentence, entity_argpos, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(selection_sentence, original_sentence), (SubLObject)sksi_reports_by_column.UNPROVIDED);
        return (SubLObject)ConsesLow.list(new_var, simplifier.conjoin((SubLObject)ConsesLow.list(cycl_utilities.expression_subst(new_var, free_var_from_selection_sentence, selection_sentence, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED), cycl_utilities.expression_subst(new_var, free_var_from_query_sentence, original_sentence, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED)), (SubLObject)sksi_reports_by_column.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 54796L)
    public static SubLObject create_modified_query_sentence_multiple_io(final SubLObject report_props, SubLObject selection_sentence, final SubLObject query_spec, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        selection_sentence = conses_high.copy_tree(maybe_augment_selection_sentence_with_base_query(selection_sentence, ks));
        SubLObject original_sentence = conses_high.copy_tree(kb_query.kbq_sentence(query_spec));
        final SubLObject query_input_hash = tuple_to_map(kb_mapping_utilities.pred_value_tuples_in_any_mt(query_spec, sksi_reports_by_column.$const238$queryHasFocalInputVariablePositio, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.$list205, (SubLObject)sksi_reports_by_column.UNPROVIDED));
        final SubLObject selection_specification = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const239$baseQueryForReportType, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject selection_output_list = kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const230$queryHasFocalOutputVariablePositi, selection_specification, ks, (SubLObject)sksi_reports_by_column.$list205, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject selection_output_hash = tuple_to_map(selection_output_list);
        SubLObject var_list = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !Hashtables.hash_table_count(selection_output_hash).equal(Hashtables.hash_table_count(query_input_hash))) {
            Errors.error((SubLObject)sksi_reports_by_column.$str240$Number_of_selection_inputs_not_eq);
        }
        selection_sentence = replace_inputs_in_selection_sentence(selection_sentence, selection_specification, ks, report_props);
        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str241$key_selection___value_selection__);
        SubLObject cdolist_list_var = selection_output_list;
        SubLObject key_selection = (SubLObject)sksi_reports_by_column.NIL;
        key_selection = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            final SubLObject value_query = Hashtables.gethash(key_selection.first(), query_input_hash, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            final SubLObject value_selection = Hashtables.gethash(key_selection.first(), selection_output_hash, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            SubLObject new_var = (SubLObject)sksi_reports_by_column.NIL;
            if (sksi_reports_by_column.NIL != value_query) {
                new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(selection_sentence, original_sentence), (SubLObject)sksi_reports_by_column.UNPROVIDED);
                selection_sentence = cycl_utilities.cycl_arg_position_nsubst(new_var, value_selection.first(), selection_sentence);
                original_sentence = cycl_utilities.cycl_arg_position_nsubst(new_var, value_query.first(), original_sentence);
                var_list = (SubLObject)ConsesLow.cons(new_var, var_list);
            }
            PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str242$_S__S__S__S___S__, new SubLObject[] { key_selection.first(), value_selection, value_query, var_list, selection_output_list });
            cdolist_list_var = cdolist_list_var.rest();
            key_selection = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(var_list, simplifier.conjoin((SubLObject)ConsesLow.list(selection_sentence, original_sentence), (SubLObject)sksi_reports_by_column.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 57366L)
    public static SubLObject replace_inputs_in_selection_sentence(SubLObject selection_sentence, final SubLObject selection_specification, final SubLObject ks, final SubLObject report_props) {
        final SubLObject selection_input_hash = tuple_to_map(kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const238$queryHasFocalInputVariablePositio, selection_specification, ks, (SubLObject)sksi_reports_by_column.$list205, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject selection_input_replacements = cdolist_list_var = maybe_selection_sentence_replacements(list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw243$SELECTION_SENTENCE_INPUT_LIST, (SubLObject)sksi_reports_by_column.UNPROVIDED), selection_specification);
        SubLObject element = (SubLObject)sksi_reports_by_column.NIL;
        element = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            selection_sentence = cycl_utilities.cycl_arg_position_nsubst(conses_high.second(element), Hashtables.gethash(element.first(), selection_input_hash, (SubLObject)sksi_reports_by_column.UNPROVIDED).first(), selection_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return selection_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 58302L)
    public static SubLObject maybe_selection_sentence_replacements(final SubLObject selection_input_replacements, final SubLObject selection_specification) {
        final SubLObject replacements_from_kb = kb_mapping_utilities.pred_value_tuples_in_any_mt(selection_specification, sksi_reports_by_column.$const244$queryHasInputIndexicalMapping, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.$list194, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL != replacements_from_kb && sksi_reports_by_column.NIL == selection_input_replacements) {
            return replacements_from_kb;
        }
        return Mapping.mapcar((SubLObject)sksi_reports_by_column.$sym245$CANONICALIZE_TERM, conses_high.second(selection_input_replacements));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 58807L)
    public static SubLObject tuple_to_map(final SubLObject tuple) {
        final SubLObject map_of_tuple = Hashtables.make_hash_table((SubLObject)sksi_reports_by_column.EIGHT_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject cdolist_list_var = tuple;
        SubLObject elem = (SubLObject)sksi_reports_by_column.NIL;
        elem = cdolist_list_var.first();
        while (sksi_reports_by_column.NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(elem.first(), conses_high.second(elem), map_of_tuple);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str246$Tuple_to_map__);
        hash_table_utilities.printhash(map_of_tuple, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        return map_of_tuple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 59062L)
    public static SubLObject maybe_augment_selection_sentence_with_base_query(final SubLObject selection_sentence, final SubLObject ks) {
        final SubLObject base_query = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const239$baseQueryForReportType, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL != base_query && sksi_reports_by_column.NIL == selection_sentence) {
            return kb_query.kbq_sentence(base_query);
        }
        return selection_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 59993L)
    public static SubLObject get_selection_sentence_from_ks(final SubLObject ks) {
        if (sksi_reports_by_column.NIL != ks) {
            final SubLObject base_query = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const239$baseQueryForReportType, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
            if (sksi_reports_by_column.NIL != base_query) {
                return kb_query.kbq_sentence(base_query);
            }
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 60224L)
    public static SubLObject fill_in_default_values_for_report_column(final SubLObject hashtable, final SubLObject pf, final SubLObject n, final SubLObject gaf, final SubLObject report_props) {
        final SubLObject default_answer = rgbc_default_value_for_pf(pf, gaf, report_props);
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 60857L)
    public static SubLObject rgbc_default_value_for_pf(final SubLObject pf, final SubLObject gaf, final SubLObject report_props) {
        final SubLObject ps = sksi_kb_accessors.physical_field_schema(pf);
        if (sksi_reports_by_column.NIL == sksi_kb_accessors.null_default_physical_field_valueP(pf, ps)) {
            return sksi_kb_accessors.physical_field_default_value(pf, ps, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        if (sksi_reports_by_column.NIL != gaf && sksi_reports_by_column.NIL != sksi_report_generation.query_lfi_gaf_for_closed_queryP(gaf)) {
            return apply_encoding_for_pf(pf, sksi_report_generation.convert_to_boolean_kb_constant((SubLObject)sksi_reports_by_column.NIL), list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED), (SubLObject)sksi_reports_by_column.UNPROVIDED);
        }
        return list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw247$PLACEHOLDER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 61727L)
    public static SubLObject test_default_value_for_pf(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = sksi_kb_accessors.physical_schema_sk_sources(sksi_kb_accessors.physical_field_schema(pf)).first();
        SubLObject value = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            value = rgbc_default_value_for_pf(pf, query_lfi_gaf_from_pf(pf, ks), (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, ks, (SubLObject)sksi_reports_by_column.$kw247$PLACEHOLDER, (SubLObject)sksi_reports_by_column.$str30$_));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 62096L)
    public static SubLObject sentence_with_one_free_var_p(final SubLObject obj) {
        return list_utilities.exactly_one_distinct_memberP(el_utilities.sentence_free_variables(obj, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED), (SubLObject)sksi_reports_by_column.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 62282L)
    public static SubLObject all_selected_entities(final SubLObject report_props) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw40$REPORT_KNOWLEDGE_SOURCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject selection_sentence = list_utilities.plist_lookup(report_props, (SubLObject)sksi_reports_by_column.$kw227$SELECTION_SENTENCE, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject entities = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject queries = all_queries_from_ks(ks);
        SubLObject successP = (SubLObject)sksi_reports_by_column.NIL;
        if (sksi_reports_by_column.NIL == selection_sentence) {
            selection_sentence = conses_high.copy_tree(get_selection_sentence_from_ks(ks));
        }
        if (sksi_reports_by_column.NIL == successP) {
            SubLObject csome_list_var = queries;
            SubLObject some_query = (SubLObject)sksi_reports_by_column.NIL;
            some_query = csome_list_var.first();
            while (sksi_reports_by_column.NIL == successP && sksi_reports_by_column.NIL != csome_list_var) {
                SubLObject ignore_errors_tag = (SubLObject)sksi_reports_by_column.NIL;
                try {
                    thread.throwStack.push(sksi_reports_by_column.$kw248$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym249$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            SubLObject query_properties = rgbc_compute_modified_query_properties(some_query, report_props);
                            final SubLObject current_max_time = inference_datastructures_enumerated_types.inference_properties_max_time(query_properties);
                            final SubLObject selection_spec = kb_mapping_utilities.fpred_value_in_any_mt(ks, sksi_reports_by_column.$const239$baseQueryForReportType, (SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            final SubLObject selection_output_list = kb_mapping_utilities.pred_u_v_holds_tuples(sksi_reports_by_column.$const230$queryHasFocalOutputVariablePositi, selection_spec, ks, (SubLObject)sksi_reports_by_column.$list170, (SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            SubLObject selection_vars = (SubLObject)sksi_reports_by_column.NIL;
                            selection_sentence = replace_inputs_in_selection_sentence(selection_sentence, selection_spec, ks, report_props);
                            SubLObject cdolist_list_var = selection_output_list;
                            SubLObject var_pos = (SubLObject)sksi_reports_by_column.NIL;
                            var_pos = cdolist_list_var.first();
                            while (sksi_reports_by_column.NIL != cdolist_list_var) {
                                selection_vars = (SubLObject)ConsesLow.cons(cycl_utilities.formula_cycl_arg_position(selection_sentence, var_pos.first(), (SubLObject)sksi_reports_by_column.UNPROVIDED), selection_vars);
                                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str250$var_pos_var_selection_vars_select);
                                PrintLow.format((SubLObject)sksi_reports_by_column.T, (SubLObject)sksi_reports_by_column.$str251$_S__S__S__S__, new SubLObject[] { var_pos, cycl_utilities.formula_cycl_arg_position(selection_sentence, var_pos.first(), (SubLObject)sksi_reports_by_column.UNPROVIDED), selection_vars, selection_output_list });
                                cdolist_list_var = cdolist_list_var.rest();
                                var_pos = cdolist_list_var.first();
                            }
                            if (sksi_reports_by_column.NIL != current_max_time) {
                                query_properties = conses_high.putf(query_properties, (SubLObject)sksi_reports_by_column.$kw48$MAX_TIME, Numbers.multiply(sksi_reports_by_column.$all_selected_entities_time_multiplier$.getDynamicValue(thread), current_max_time));
                            }
                            entities = my_rgbc_query_template(selection_vars, selection_sentence, kb_query.kbq_mts(some_query).first(), query_properties, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            successP = (SubLObject)sksi_reports_by_column.T;
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sksi_reports_by_column.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_reports_by_column.$kw248$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                csome_list_var = csome_list_var.rest();
                some_query = csome_list_var.first();
            }
        }
        if (sksi_reports_by_column.NIL == successP) {
            Errors.error((SubLObject)sksi_reports_by_column.$str252$Failed_to_find_entities_for_repor, ks, queries);
        }
        return entities;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 64523L)
    public static SubLObject get_report_queries_query_sentence(final SubLObject ks, final SubLObject query_var) {
        return (SubLObject)ConsesLow.list(sksi_reports_by_column.$const253$and, (SubLObject)ConsesLow.list(sksi_reports_by_column.$const154$logicalSchemaSourceMap, (SubLObject)sksi_reports_by_column.$sym254$_LS, ks), (SubLObject)sksi_reports_by_column.$list255, (SubLObject)ConsesLow.list(sksi_reports_by_column.$const256$kSHasQueryForLogicalFieldIndexica, ks, (SubLObject)sksi_reports_by_column.$sym257$_LFI, query_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 64743L)
    public static SubLObject a_possibly_open_query_from_ks(final SubLObject ks, SubLObject open_requiredP) {
        if (open_requiredP == sksi_reports_by_column.UNPROVIDED) {
            open_requiredP = (SubLObject)sksi_reports_by_column.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject params = (SubLObject)sksi_reports_by_column.$list258;
        final SubLObject query_var = (SubLObject)sksi_reports_by_column.$sym259$_QUERY;
        final SubLObject find_query_sentence = get_report_queries_query_sentence(ks, query_var);
        SubLObject results = ask_utilities.query_variable(query_var, (SubLObject)ConsesLow.listS(sksi_reports_by_column.$const253$and, find_query_sentence, (SubLObject)ConsesLow.listS(sksi_reports_by_column.$const229$queryHasFocalOutputVariablePositi, query_var, (SubLObject)sksi_reports_by_column.$list260), (SubLObject)sksi_reports_by_column.$list261), mt, params);
        if (sksi_reports_by_column.NIL != list_utilities.empty_list_p(results) && sksi_reports_by_column.NIL == open_requiredP) {
            results = ask_utilities.query_variable(query_var, find_query_sentence, mt, params);
        }
        if (sksi_reports_by_column.NIL == results) {
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks);
            if (sksi_reports_by_column.NIL != source_template) {
                final SubLObject var = a_possibly_open_query_from_ks(source_template, open_requiredP);
                if (sksi_reports_by_column.NIL != var) {
                    results = (SubLObject)ConsesLow.cons(var, results);
                }
            }
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == results) {
            Errors.error((SubLObject)sksi_reports_by_column.$str262$Can_t_find_any_useful_queries_ass, ks);
        }
        return results.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 66240L)
    public static SubLObject all_queries_from_ks(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_var = (SubLObject)sksi_reports_by_column.$sym259$_QUERY;
        final SubLObject find_query_sentence = get_report_queries_query_sentence(ks, query_var);
        SubLObject results = ask_utilities.query_variable(query_var, find_query_sentence, sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED), (SubLObject)sksi_reports_by_column.UNPROVIDED);
        if (sksi_reports_by_column.NIL != list_utilities.empty_list_p(results)) {
            final SubLObject source_template = sksi_report_generation.reportgen_report_from_variant(ks);
            if (sksi_reports_by_column.NIL != source_template) {
                results = all_queries_from_ks(source_template);
            }
        }
        if (sksi_reports_by_column.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_reports_by_column.NIL == results) {
            Errors.error((SubLObject)sksi_reports_by_column.$str262$Can_t_find_any_useful_queries_ass, ks);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 66963L)
    public static SubLObject reportgen_lfi_from_pf(final SubLObject pf, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enc_expr = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject lfi = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            enc_expr = sksi_report_generation.reportgen_encoding_expression_from_physical_field(pf, ks);
            lfi = sksi_report_generation.encoding_logical_field_indexical(enc_expr);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lfi;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 67399L)
    public static SubLObject query_lfi_gaf_from_pf(final SubLObject pf, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lfi = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject bgaf = (SubLObject)sksi_reports_by_column.NIL;
        final SubLObject mt_var = sksi_report_generation.reportgen_source_mapping_mt(ks, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            lfi = reportgen_lfi_from_pf(pf, ks);
            bgaf = sksi_report_generation.query_lfi_gaf_from_logical_indexical(lfi, ks);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return bgaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 70596L)
    public static SubLObject default_report_properties() {
        return conses_high.copy_list(sksi_reports_by_column.$default_report_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 70805L)
    public static SubLObject run_report_test_specification(final SubLObject test_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = kb_mapping_utilities.fpred_value_in_any_mt(test_spec, sksi_reports_by_column.$const275$sksOfReportTest, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
        final SubLObject was_sks_registeredP = Equality.eq((SubLObject)sksi_reports_by_column.$kw276$REG, sksi_sks_manager.sks_registration_state(sks));
        SubLObject successP = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject error_message = (SubLObject)sksi_reports_by_column.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_reports_by_column.$sym151$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        if (sksi_reports_by_column.NIL == was_sks_registeredP) {
                            sksi_removal_module_generation.register_sksi_removal_modules_for_sks(sks, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        }
                        final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_reports_by_column.$sym277$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(sksi_reports_by_column.$const278$EverythingPSC, thread);
                            final SubLObject pred_var = sksi_reports_by_column.$const279$requiredAssertionForReportTest;
                            if (sksi_reports_by_column.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, (SubLObject)sksi_reports_by_column.NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, (SubLObject)sksi_reports_by_column.NIL, pred_var);
                                SubLObject done_var = (SubLObject)sksi_reports_by_column.NIL;
                                final SubLObject token_var = (SubLObject)sksi_reports_by_column.NIL;
                                while (sksi_reports_by_column.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (sksi_reports_by_column.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)sksi_reports_by_column.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_reports_by_column.$kw280$GAF, (SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.NIL);
                                            SubLObject done_var_$18 = (SubLObject)sksi_reports_by_column.NIL;
                                            final SubLObject token_var_$19 = (SubLObject)sksi_reports_by_column.NIL;
                                            while (sksi_reports_by_column.NIL == done_var_$18) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                                final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(gaf));
                                                if (sksi_reports_by_column.NIL != valid_$20) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = assertions_high.gaf_args(gaf).rest();
                                                    SubLObject mt = (SubLObject)sksi_reports_by_column.NIL;
                                                    SubLObject bin_pred = (SubLObject)sksi_reports_by_column.NIL;
                                                    SubLObject arg_2_value = (SubLObject)sksi_reports_by_column.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list281);
                                                    mt = current.first();
                                                    current = current.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list281);
                                                    bin_pred = current.first();
                                                    current = current.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reports_by_column.$list281);
                                                    arg_2_value = current.first();
                                                    current = current.rest();
                                                    if (sksi_reports_by_column.NIL == current) {
                                                        SubLObject foundP = (SubLObject)sksi_reports_by_column.NIL;
                                                        final SubLObject _prev_bind_0_$18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$22 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_reports_by_column.$sym282$RELEVANT_MT_IS_EQ, thread);
                                                            mt_relevance_macros.$mt$.bind(mt, thread);
                                                            final SubLObject pred_var_$23 = bin_pred;
                                                            if (sksi_reports_by_column.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, (SubLObject)sksi_reports_by_column.NIL, pred_var_$23)) {
                                                                final SubLObject iterator_var_$24 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, (SubLObject)sksi_reports_by_column.NIL, pred_var_$23);
                                                                SubLObject done_var_$19 = (SubLObject)sksi_reports_by_column.NIL;
                                                                final SubLObject token_var_$20 = (SubLObject)sksi_reports_by_column.NIL;
                                                                while (sksi_reports_by_column.NIL == done_var_$19) {
                                                                    final SubLObject final_index_spec_$27 = iteration.iteration_next_without_values_macro_helper(iterator_var_$24, token_var_$20);
                                                                    final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(final_index_spec_$27));
                                                                    if (sksi_reports_by_column.NIL != valid_$21) {
                                                                        SubLObject final_index_iterator_$29 = (SubLObject)sksi_reports_by_column.NIL;
                                                                        try {
                                                                            final_index_iterator_$29 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$27, (SubLObject)sksi_reports_by_column.$kw280$GAF, (SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.NIL);
                                                                            SubLObject done_var_$20 = (SubLObject)sksi_reports_by_column.NIL;
                                                                            final SubLObject token_var_$21 = (SubLObject)sksi_reports_by_column.NIL;
                                                                            while (sksi_reports_by_column.NIL == done_var_$20) {
                                                                                final SubLObject bad_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$29, token_var_$21);
                                                                                final SubLObject valid_$22 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$21.eql(bad_gaf));
                                                                                if (sksi_reports_by_column.NIL != valid_$22) {
                                                                                    if (assertions_high.gaf_arg2(bad_gaf).equal(arg_2_value)) {
                                                                                        foundP = (SubLObject)sksi_reports_by_column.T;
                                                                                    }
                                                                                    else {
                                                                                        fi.fi_unassert_int(assertions_high.gaf_formula(bad_gaf), assertions_high.assertion_mt(bad_gaf));
                                                                                    }
                                                                                }
                                                                                done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid_$22);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                                if (sksi_reports_by_column.NIL != final_index_iterator_$29) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$29);
                                                                                }
                                                                                Values.restoreValuesFromVector(_values);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid_$21);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$22, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                        if (sksi_reports_by_column.NIL == foundP) {
                                                            fi.fi_assert_int(el_utilities.make_binary_formula(bin_pred, test_spec, arg_2_value), mt, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reports_by_column.$list281);
                                                    }
                                                }
                                                done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid_$20);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (sksi_reports_by_column.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid);
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$17, thread);
                        }
                        final SubLObject report_spec_path = kb_mapping_utilities.fpred_value_in_any_mt(test_spec, sksi_reports_by_column.$const283$pathnameForReportDefinition, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        run_batch_reports_from_definition_file(report_spec_path);
                        final SubLObject baseline_directory = kb_mapping_utilities.fpred_value_in_any_mt(test_spec, sksi_reports_by_column.$const284$baselineDirectoryForReport, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        final SubLObject definition = read_batch_definition_from_file(report_spec_path);
                        final SubLObject global_props = get_global_batch_report_props_from_definition(definition);
                        final SubLObject output_directory = list_utilities.plist_lookup(global_props, (SubLObject)sksi_reports_by_column.$kw36$OUTPUT_DIRECTORY, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_reports_by_column.$sym277$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(sksi_reports_by_column.$const278$EverythingPSC, thread);
                            final SubLObject pred_var2 = sksi_reports_by_column.$const285$reportTestComparesFilenamesWRTKey;
                            if (sksi_reports_by_column.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, (SubLObject)sksi_reports_by_column.NIL, pred_var2)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, (SubLObject)sksi_reports_by_column.NIL, pred_var2);
                                SubLObject done_var2 = (SubLObject)sksi_reports_by_column.NIL;
                                final SubLObject token_var2 = (SubLObject)sksi_reports_by_column.NIL;
                                while (sksi_reports_by_column.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (sksi_reports_by_column.NIL != valid2) {
                                        SubLObject final_index_iterator2 = (SubLObject)sksi_reports_by_column.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)sksi_reports_by_column.$kw280$GAF, (SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.NIL);
                                            SubLObject done_var_$21 = (SubLObject)sksi_reports_by_column.NIL;
                                            final SubLObject token_var_$22 = (SubLObject)sksi_reports_by_column.NIL;
                                            while (sksi_reports_by_column.NIL == done_var_$21) {
                                                final SubLObject comparison_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                                final SubLObject valid_$23 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(comparison_gaf));
                                                if (sksi_reports_by_column.NIL != valid_$23) {
                                                    SubLObject current2;
                                                    final SubLObject datum2 = current2 = assertions_high.gaf_args(comparison_gaf).rest();
                                                    SubLObject baseline_filename = (SubLObject)sksi_reports_by_column.NIL;
                                                    SubLObject output_filename = (SubLObject)sksi_reports_by_column.NIL;
                                                    SubLObject key_column = (SubLObject)sksi_reports_by_column.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_reports_by_column.$list286);
                                                    baseline_filename = current2.first();
                                                    current2 = current2.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_reports_by_column.$list286);
                                                    output_filename = current2.first();
                                                    current2 = current2.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_reports_by_column.$list286);
                                                    key_column = current2.first();
                                                    current2 = current2.rest();
                                                    if (sksi_reports_by_column.NIL == current2) {
                                                        verify_test_report_results(baseline_filename, baseline_directory, output_filename, output_directory, key_column);
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_reports_by_column.$list286);
                                                    }
                                                }
                                                done_var_$21 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid_$23);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                                                final SubLObject _values3 = Values.getValuesAsVector();
                                                if (sksi_reports_by_column.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values3);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reports_by_column.NIL == valid2);
                                }
                            }
                            successP = (SubLObject)sksi_reports_by_column.T;
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            if (sksi_reports_by_column.NIL == was_sks_registeredP) {
                                sksi_removal_module_generation.deregister_sksi_removal_modules_for_sks(sks, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_reports_by_column.NIL);
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
        return Values.values(successP, error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 70805L)
    public static SubLObject verify_test_report_results(final SubLObject baseline_filename, final SubLObject baseline_directory, final SubLObject output_filename, final SubLObject output_directory, final SubLObject key_column) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject output_file = absolute_path_from_absolute_or_relative(output_filename, output_directory);
        final SubLObject output_results = read_test_results_file(output_file, key_column);
        final SubLObject baseline_file = absolute_path_from_absolute_or_relative(baseline_filename, baseline_directory);
        final SubLObject baseline_results = read_test_results_file(baseline_file, key_column);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(baseline_results)); sksi_reports_by_column.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject baseline_row = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject output_row = dictionary.dictionary_lookup_without_values(output_results, key, (SubLObject)sksi_reports_by_column.NIL);
            if (!baseline_row.equalp(output_row)) {
                Errors.error((SubLObject)sksi_reports_by_column.$str287$Baseline_file___A__Test_output_fi, new SubLObject[] { baseline_file, output_file, key, baseline_row, output_row });
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (dictionary.dictionary_length(output_results).numG(dictionary.dictionary_length(baseline_results))) {
            Errors.error((SubLObject)sksi_reports_by_column.$str288$_A___has__D_more_rows_than___A, output_file, Numbers.subtract(dictionary.dictionary_length(output_results), dictionary.dictionary_length(baseline_results)), baseline_file);
        }
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-reports-by-column.lisp", position = 70805L)
    public static SubLObject read_test_results_file(final SubLObject filename, final SubLObject key_column) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject results = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUALP), (SubLObject)sksi_reports_by_column.UNPROVIDED);
        SubLObject key_column_number = (SubLObject)sksi_reports_by_column.NIL;
        SubLObject stream = (SubLObject)sksi_reports_by_column.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)sksi_reports_by_column.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)sksi_reports_by_column.$kw186$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)sksi_reports_by_column.$str35$Unable_to_open__S, filename);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$41 = stream_var;
                SubLObject line_number_var = (SubLObject)sksi_reports_by_column.NIL;
                SubLObject line = (SubLObject)sksi_reports_by_column.NIL;
                line_number_var = (SubLObject)sksi_reports_by_column.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$41); sksi_reports_by_column.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$41)) {
                    final SubLObject tokens = string_utilities.string_tokenize(line, (SubLObject)sksi_reports_by_column.$list289, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                    if (sksi_reports_by_column.NIL == key_column_number) {
                        key_column_number = Sequences.position(key_column, tokens, Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUALP), (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                        if (sksi_reports_by_column.NIL == key_column_number) {
                            key_column_number = Sequences.position(string_utilities.quote_string(key_column, (SubLObject)sksi_reports_by_column.UNPROVIDED), tokens, Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUALP), (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                            if (sksi_reports_by_column.NIL == key_column_number) {
                                Errors.error((SubLObject)sksi_reports_by_column.$str290$Can_t_find__S_in__S, key_column, line);
                            }
                        }
                    }
                    else {
                        final SubLObject key = ConsesLow.nth(key_column_number, tokens);
                        dictionary.dictionary_enter(results, key, tokens);
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_reports_by_column.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)sksi_reports_by_column.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return results;
    }
    
    public static SubLObject declare_sksi_reports_by_column_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "with_text_file_or_null_stream", "WITH-TEXT-FILE-OR-NULL-STREAM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "schedule_report", "SCHEDULE-REPORT", 2, 9, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "schedule_recurring_report", "SCHEDULE-RECURRING-REPORT", 2, 9, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "add_report_specification_to_scheduled_query", "ADD-REPORT-SPECIFICATION-TO-SCHEDULED-QUERY", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_report_specification_mt", "GET-REPORT-SPECIFICATION-MT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_cycl_character", "GET-CYCL-CHARACTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "reports_directory", "REPORTS-DIRECTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "url_to_retrieve_report_file", "URL-TO-RETRIEVE-REPORT-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_by_column_to_file", "REPORT-BY-COLUMN-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_run_report", "REPORT-GENERATOR-RUN-REPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "parse_filename", "PARSE-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_by_column_to_stream", "REPORT-BY-COLUMN-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "output_report_by_column", "OUTPUT-REPORT-BY-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_property_p", "REPORT-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_full_filename_for_report", "GET-FULL-FILENAME-FOR-REPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_full_logfilename_for_report", "GET-FULL-LOGFILENAME-FOR-REPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "construct_full_path_from_prop_values", "CONSTRUCT-FULL-PATH-FROM-PROP-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "absolute_path_from_absolute_or_relative", "ABSOLUTE-PATH-FROM-ABSOLUTE-OR-RELATIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "split_report_properties", "SPLIT-REPORT-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "query_properties_from_report_properties", "QUERY-PROPERTIES-FROM-REPORT-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "merge_in_default_overriding_properties", "MERGE-IN-DEFAULT-OVERRIDING-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_rgbc_overriding_properties", "GET-RGBC-OVERRIDING-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "add_to_rgbc_overriding_properties", "ADD-TO-RGBC-OVERRIDING-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "update_rgbc_max_time", "UPDATE-RGBC-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "reset_rgbc_overriding_properties", "RESET-RGBC-OVERRIDING-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "print_hashtable_of_vectors_as_delimited_lines", "PRINT-HASHTABLE-OF-VECTORS-AS-DELIMITED-LINES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "print_hashtable_of_plists_as_delimited_lines", "PRINT-HASHTABLE-OF-PLISTS-AS-DELIMITED-LINES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "new_report_generation_iterator", "NEW-REPORT-GENERATION-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_print_function_trampoline", "REPORT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_p", "REPORT-GENERATOR-P", 1, 0, false);
        new $report_generator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_full_report_props", "RG-FULL-REPORT-PROPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_iterator", "RG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_problems", "RG-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_full_report_props", "_CSETF-RG-FULL-REPORT-PROPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_iterator", "_CSETF-RG-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_problems", "_CSETF-RG-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "make_report_generator", "MAKE-REPORT-GENERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "visit_defstruct_report_generator", "VISIT-DEFSTRUCT-REPORT-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "visit_defstruct_object_report_generator_method", "VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "print_report_generator", "PRINT-REPORT-GENERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "new_report_generator", "NEW-REPORT-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_full_report_props", "REPORT-GENERATOR-FULL-REPORT-PROPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_iterator", "REPORT-GENERATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problems", "REPORT-GENERATOR-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_count", "REPORT-GENERATOR-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_do_problems", "REPORT-GENERATOR-DO-PROBLEMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_column_count", "REPORT-GENERATOR-COLUMN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_iterator", "REPORT-GENERATOR-PROBLEM-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_note_problem", "REPORT-GENERATOR-NOTE-PROBLEM", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_guess_problem_type", "REPORT-GENERATOR-GUESS-PROBLEM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sxhash_report_generator_method", "SXHASH-REPORT-GENERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sxhash_report_generator", "SXHASH-REPORT-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_print_function_trampoline", "REPORT-GENERATOR-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_p", "REPORT-GENERATOR-PROBLEM-P", 1, 0, false);
        new $report_generator_problem_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_problem_type", "RG-PROBLEM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_problem_description", "RG-PROBLEM-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_problem_physical_field", "RG-PROBLEM-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_problem_type", "_CSETF-RG-PROBLEM-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_problem_description", "_CSETF-RG-PROBLEM-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_problem_physical_field", "_CSETF-RG-PROBLEM-PHYSICAL-FIELD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "make_report_generator_problem", "MAKE-REPORT-GENERATOR-PROBLEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "visit_defstruct_report_generator_problem", "VISIT-DEFSTRUCT-REPORT-GENERATOR-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "visit_defstruct_object_report_generator_problem_method", "VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "print_report_generator_problem", "PRINT-REPORT-GENERATOR-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "new_report_generator_problem", "NEW-REPORT-GENERATOR-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_type", "REPORT-GENERATOR-PROBLEM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_description", "REPORT-GENERATOR-PROBLEM-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_problem_physical_field", "REPORT-GENERATOR-PROBLEM-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sxhash_report_generator_problem_method", "SXHASH-REPORT-GENERATOR-PROBLEM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sxhash_report_generator_problem", "SXHASH-REPORT-GENERATOR-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_print_function_trampoline", "REPORT-GENERATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_p", "REPORT-GENERATION-STATE-P", 1, 0, false);
        new $report_generation_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_ks", "RG-STATE-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_range", "RG-STATE-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_mt", "RG-STATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_pf_iterator", "RG-STATE-PF-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_iterations", "RG-STATE-ITERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_merged_props", "RG-STATE-MERGED-PROPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_results_table", "RG-STATE-RESULTS-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_executed_queries", "RG-STATE-EXECUTED-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rg_state_report_generator", "RG-STATE-REPORT-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_ks", "_CSETF-RG-STATE-KS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_range", "_CSETF-RG-STATE-RANGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_mt", "_CSETF-RG-STATE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_pf_iterator", "_CSETF-RG-STATE-PF-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_iterations", "_CSETF-RG-STATE-ITERATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_merged_props", "_CSETF-RG-STATE-MERGED-PROPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_results_table", "_CSETF-RG-STATE-RESULTS-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_executed_queries", "_CSETF-RG-STATE-EXECUTED-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "_csetf_rg_state_report_generator", "_CSETF-RG-STATE-REPORT-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "make_report_generation_state", "MAKE-REPORT-GENERATION-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "visit_defstruct_report_generation_state", "VISIT-DEFSTRUCT-REPORT-GENERATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "visit_defstruct_object_report_generation_state_method", "VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATION-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "print_report_generation_state", "PRINT-REPORT-GENERATION-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "new_report_generation_state", "NEW-REPORT-GENERATION-STATE", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_ks", "REPORT-GENERATION-STATE-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_range", "REPORT-GENERATION-STATE-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_mt", "REPORT-GENERATION-STATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_pf_iterator", "REPORT-GENERATION-STATE-PF-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_iterations", "REPORT-GENERATION-STATE-ITERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_merged_props", "REPORT-GENERATION-STATE-MERGED-PROPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_results_table", "REPORT-GENERATION-STATE-RESULTS-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_state_executed_queries", "REPORT-GENERATION-STATE-EXECUTED-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sxhash_report_generation_state_method", "SXHASH-REPORT-GENERATION-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sxhash_report_generation_state", "SXHASH-REPORT-GENERATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "make_report_generation_iterator_state", "MAKE-REPORT-GENERATION-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_iterator_done_p", "REPORT-GENERATION-ITERATOR-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generation_iterator_next", "REPORT-GENERATION-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "replace_with_null", "REPLACE-WITH-NULL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "persist_hashtable_in_database", "PERSIST-HASHTABLE-IN-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "run_batch_reports_from_definition_file", "RUN-BATCH-REPORTS-FROM-DEFINITION-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "run_batch_reports_from_definition", "RUN-BATCH-REPORTS-FROM-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "read_batch_definition_from_file", "READ-BATCH-DEFINITION-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_global_batch_report_props_from_definition", "GET-GLOBAL-BATCH-REPORT-PROPS-FROM-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_batch_properties_for_all_reports_from_definition", "GET-BATCH-PROPERTIES-FOR-ALL-REPORTS-FROM-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "apply_range_specifier_to_sequence", "APPLY-RANGE-SPECIFIER-TO-SEQUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "parse_number_range_specifier", "PARSE-NUMBER-RANGE-SPECIFIER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "range_specifier_item_p", "RANGE-SPECIFIER-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "expand_range_specifier_item", "EXPAND-RANGE-SPECIFIER-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "gafs_from_ks_internal", "GAFS-FROM-KS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "gafs_from_ks", "GAFS-FROM-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "initialized_report_hashtable", "INITIALIZED-REPORT-HASHTABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "initialized_report_hashtable_new", "INITIALIZED-REPORT-HASHTABLE-NEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "add_final_column_answers_to_hashtable", "ADD-FINAL-COLUMN-ANSWERS-TO-HASHTABLE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "store_encoded_answers_new", "STORE-ENCODED-ANSWERS-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "store_encoded_answers", "STORE-ENCODED-ANSWERS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "encode_logical_answer", "ENCODE-LOGICAL-ANSWER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "unpack_column_answer", "UNPACK-COLUMN-ANSWER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "warn_about_multiple_values", "WARN-ABOUT-MULTIPLE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "apply_encoding_for_pf_internal", "APPLY-ENCODING-FOR-PF-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "apply_encoding_for_pf", "APPLY-ENCODING-FOR-PF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "my_sksi_apply_encoding_and_reformulate", "MY-SKSI-APPLY-ENCODING-AND-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rgbc_compute_modified_query_properties", "RGBC-COMPUTE-MODIFIED-QUERY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "run_modified_query_for_answer_list", "RUN-MODIFIED-QUERY-FOR-ANSWER-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "run_modified_query_for_answer_list_multiple_io", "RUN-MODIFIED-QUERY-FOR-ANSWER-LIST-MULTIPLE-IO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "report_generator_query_for_physical_field", "REPORT-GENERATOR-QUERY-FOR-PHYSICAL-FIELD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "my_rgbc_query_template", "MY-RGBC-QUERY-TEMPLATE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "create_modified_query_sentence", "CREATE-MODIFIED-QUERY-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "create_modified_query_sentence_multiple_io", "CREATE-MODIFIED-QUERY-SENTENCE-MULTIPLE-IO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "replace_inputs_in_selection_sentence", "REPLACE-INPUTS-IN-SELECTION-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "maybe_selection_sentence_replacements", "MAYBE-SELECTION-SENTENCE-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "tuple_to_map", "TUPLE-TO-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "maybe_augment_selection_sentence_with_base_query", "MAYBE-AUGMENT-SELECTION-SENTENCE-WITH-BASE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_selection_sentence_from_ks", "GET-SELECTION-SENTENCE-FROM-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "fill_in_default_values_for_report_column", "FILL-IN-DEFAULT-VALUES-FOR-REPORT-COLUMN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "rgbc_default_value_for_pf", "RGBC-DEFAULT-VALUE-FOR-PF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "test_default_value_for_pf", "TEST-DEFAULT-VALUE-FOR-PF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "sentence_with_one_free_var_p", "SENTENCE-WITH-ONE-FREE-VAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "all_selected_entities", "ALL-SELECTED-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "get_report_queries_query_sentence", "GET-REPORT-QUERIES-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "a_possibly_open_query_from_ks", "A-POSSIBLY-OPEN-QUERY-FROM-KS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "all_queries_from_ks", "ALL-QUERIES-FROM-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "reportgen_lfi_from_pf", "REPORTGEN-LFI-FROM-PF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "query_lfi_gaf_from_pf", "QUERY-LFI-GAF-FROM-PF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "default_report_properties", "DEFAULT-REPORT-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "run_report_test_specification", "RUN-REPORT-TEST-SPECIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "verify_test_report_results", "VERIFY-TEST-REPORT-RESULTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column", "read_test_results_file", "READ-TEST-RESULTS-FILE", 2, 0, false);
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    public static SubLObject init_sksi_reports_by_column_file() {
        sksi_reports_by_column.$rgbc_default_overriding_properties$ = SubLFiles.defconstant("*RGBC-DEFAULT-OVERRIDING-PROPERTIES*", (SubLObject)sksi_reports_by_column.$list46);
        sksi_reports_by_column.$rgbc_locked_overriding_properties$ = SubLFiles.defparameter("*RGBC-LOCKED-OVERRIDING-PROPERTIES*", sksi_reports_by_column.$rgbc_default_overriding_properties$.getGlobalValue());
        sksi_reports_by_column.$rgbc_overriding_properties_lock$ = SubLFiles.deflexical("*RGBC-OVERRIDING-PROPERTIES-LOCK*", ReadWriteLocks.new_rw_lock((SubLObject)sksi_reports_by_column.$str47$RGBC_OVERRIDING_PROPERTIES));
        sksi_reports_by_column.$dtp_report_generator$ = SubLFiles.defconstant("*DTP-REPORT-GENERATOR*", (SubLObject)sksi_reports_by_column.$sym54$REPORT_GENERATOR);
        sksi_reports_by_column.$dtp_report_generator_problem$ = SubLFiles.defconstant("*DTP-REPORT-GENERATOR-PROBLEM*", (SubLObject)sksi_reports_by_column.$sym88$REPORT_GENERATOR_PROBLEM);
        sksi_reports_by_column.$dtp_report_generation_state$ = SubLFiles.defconstant("*DTP-REPORT-GENERATION-STATE*", (SubLObject)sksi_reports_by_column.$sym110$REPORT_GENERATION_STATE);
        sksi_reports_by_column.$rgbc_initial_value_for_pfs$ = SubLFiles.defconstant("*RGBC-INITIAL-VALUE-FOR-PFS*", (SubLObject)sksi_reports_by_column.NIL);
        sksi_reports_by_column.$all_selected_entities_time_multiplier$ = SubLFiles.defvar("*ALL-SELECTED-ENTITIES-TIME-MULTIPLIER*", (SubLObject)sksi_reports_by_column.THREE_INTEGER);
        sksi_reports_by_column.$report_specific_properties$ = SubLFiles.deflexical("*REPORT-SPECIFIC-PROPERTIES*", (SubLObject)sksi_reports_by_column.$list263);
        sksi_reports_by_column.$default_report_properties$ = SubLFiles.deflexical("*DEFAULT-REPORT-PROPERTIES*", (SubLObject)ConsesLow.list(new SubLObject[] { sksi_reports_by_column.$kw42$DELIMITER, Characters.CHAR_comma, sksi_reports_by_column.$kw41$COLUMN_RANGE, sksi_reports_by_column.$list6, sksi_reports_by_column.$kw247$PLACEHOLDER, sksi_reports_by_column.$str7$, sksi_reports_by_column.$kw218$CLOBBER_MULTIPLE_VALUES_, sksi_reports_by_column.NIL, sksi_reports_by_column.$kw264$LOG_STREAM, StreamsLow.$standard_output$.getDynamicValue() }));
        sksi_reports_by_column.$sts_selection_sentence$ = SubLFiles.deflexical("*STS-SELECTION-SENTENCE*", list_utilities.plist_lookup(sksi_reports_by_column.$default_report_properties$.getGlobalValue(), (SubLObject)sksi_reports_by_column.$kw227$SELECTION_SENTENCE, (SubLObject)sksi_reports_by_column.UNPROVIDED));
        return (SubLObject)sksi_reports_by_column.NIL;
    }
    
    public static SubLObject setup_sksi_reports_by_column_file() {
        access_macros.register_external_symbol((SubLObject)sksi_reports_by_column.$sym5$SCHEDULE_REPORT);
        access_macros.register_external_symbol((SubLObject)sksi_reports_by_column.$sym8$SCHEDULE_RECURRING_REPORT);
        access_macros.register_external_symbol((SubLObject)sksi_reports_by_column.$sym33$REPORT_BY_COLUMN_TO_FILE);
        access_macros.register_external_symbol((SubLObject)sksi_reports_by_column.$sym39$REPORT_BY_COLUMN_TO_STREAM);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym61$REPORT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_reports_by_column.$list62);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym63$RG_FULL_REPORT_PROPS, (SubLObject)sksi_reports_by_column.$sym64$_CSETF_RG_FULL_REPORT_PROPS);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym65$RG_ITERATOR, (SubLObject)sksi_reports_by_column.$sym66$_CSETF_RG_ITERATOR);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym67$RG_PROBLEMS, (SubLObject)sksi_reports_by_column.$sym68$_CSETF_RG_PROBLEMS);
        Equality.identity((SubLObject)sksi_reports_by_column.$sym54$REPORT_GENERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym77$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_reports_by_column.$sym60$PRINT_REPORT_GENERATOR);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym87$SXHASH_REPORT_GENERATOR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generator_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym95$REPORT_GENERATOR_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_reports_by_column.$list96);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym97$RG_PROBLEM_TYPE, (SubLObject)sksi_reports_by_column.$sym98$_CSETF_RG_PROBLEM_TYPE);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym99$RG_PROBLEM_DESCRIPTION, (SubLObject)sksi_reports_by_column.$sym100$_CSETF_RG_PROBLEM_DESCRIPTION);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym101$RG_PROBLEM_PHYSICAL_FIELD, (SubLObject)sksi_reports_by_column.$sym102$_CSETF_RG_PROBLEM_PHYSICAL_FIELD);
        Equality.identity((SubLObject)sksi_reports_by_column.$sym88$REPORT_GENERATOR_PROBLEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generator_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym107$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_PROBLEM_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_reports_by_column.$sym94$PRINT_REPORT_GENERATOR_PROBLEM);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generator_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym109$SXHASH_REPORT_GENERATOR_PROBLEM_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generation_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym117$REPORT_GENERATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_reports_by_column.$list118);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym119$RG_STATE_KS, (SubLObject)sksi_reports_by_column.$sym120$_CSETF_RG_STATE_KS);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym121$RG_STATE_RANGE, (SubLObject)sksi_reports_by_column.$sym122$_CSETF_RG_STATE_RANGE);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym123$RG_STATE_MT, (SubLObject)sksi_reports_by_column.$sym124$_CSETF_RG_STATE_MT);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym125$RG_STATE_PF_ITERATOR, (SubLObject)sksi_reports_by_column.$sym126$_CSETF_RG_STATE_PF_ITERATOR);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym127$RG_STATE_ITERATIONS, (SubLObject)sksi_reports_by_column.$sym128$_CSETF_RG_STATE_ITERATIONS);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym129$RG_STATE_MERGED_PROPS, (SubLObject)sksi_reports_by_column.$sym130$_CSETF_RG_STATE_MERGED_PROPS);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym131$RG_STATE_RESULTS_TABLE, (SubLObject)sksi_reports_by_column.$sym132$_CSETF_RG_STATE_RESULTS_TABLE);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym133$RG_STATE_EXECUTED_QUERIES, (SubLObject)sksi_reports_by_column.$sym134$_CSETF_RG_STATE_EXECUTED_QUERIES);
        Structures.def_csetf((SubLObject)sksi_reports_by_column.$sym135$RG_STATE_REPORT_GENERATOR, (SubLObject)sksi_reports_by_column.$sym136$_CSETF_RG_STATE_REPORT_GENERATOR);
        Equality.identity((SubLObject)sksi_reports_by_column.$sym110$REPORT_GENERATION_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generation_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym147$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATION_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_reports_by_column.$sym116$PRINT_REPORT_GENERATION_STATE);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sksi_reports_by_column.$dtp_report_generation_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_reports_by_column.$sym149$SXHASH_REPORT_GENERATION_STATE_METHOD));
        access_macros.register_external_symbol((SubLObject)sksi_reports_by_column.$sym183$RUN_BATCH_REPORTS_FROM_DEFINITION_FILE);
        access_macros.register_external_symbol((SubLObject)sksi_reports_by_column.$sym184$RUN_BATCH_REPORTS_FROM_DEFINITION);
        memoization_state.note_memoized_function((SubLObject)sksi_reports_by_column.$sym192$GAFS_FROM_KS);
        memoization_state.note_memoized_function((SubLObject)sksi_reports_by_column.$sym224$APPLY_ENCODING_FOR_PF);
        generic_testing.define_test_case_table_int((SubLObject)sksi_reports_by_column.$sym265$APPLY_RANGE_SPECIFIER_TO_SEQUENCE, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_reports_by_column.$kw266$TEST, Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUAL), sksi_reports_by_column.$kw267$OWNER, sksi_reports_by_column.NIL, sksi_reports_by_column.$kw268$CLASSES, sksi_reports_by_column.NIL, sksi_reports_by_column.$kw269$KB, sksi_reports_by_column.$kw270$TINY, sksi_reports_by_column.$kw271$WORKING_, sksi_reports_by_column.T }), (SubLObject)sksi_reports_by_column.$list272);
        generic_testing.define_test_case_table_int((SubLObject)sksi_reports_by_column.$sym273$ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_reports_by_column.$kw266$TEST, Symbols.symbol_function((SubLObject)sksi_reports_by_column.EQUALP), sksi_reports_by_column.$kw267$OWNER, sksi_reports_by_column.NIL, sksi_reports_by_column.$kw268$CLASSES, sksi_reports_by_column.NIL, sksi_reports_by_column.$kw269$KB, sksi_reports_by_column.$kw270$TINY, sksi_reports_by_column.$kw271$WORKING_, sksi_reports_by_column.T }), (SubLObject)sksi_reports_by_column.$list274);
        return (SubLObject)sksi_reports_by_column.NIL;
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
        me = (SubLFile)new sksi_reports_by_column();
        sksi_reports_by_column.$rgbc_default_overriding_properties$ = null;
        sksi_reports_by_column.$rgbc_locked_overriding_properties$ = null;
        sksi_reports_by_column.$rgbc_overriding_properties_lock$ = null;
        sksi_reports_by_column.$dtp_report_generator$ = null;
        sksi_reports_by_column.$dtp_report_generator_problem$ = null;
        sksi_reports_by_column.$dtp_report_generation_state$ = null;
        sksi_reports_by_column.$rgbc_initial_value_for_pfs$ = null;
        sksi_reports_by_column.$all_selected_entities_time_multiplier$ = null;
        sksi_reports_by_column.$report_specific_properties$ = null;
        sksi_reports_by_column.$default_report_properties$ = null;
        sksi_reports_by_column.$sts_selection_sentence$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym2$WITH_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-TEXT-FILE");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-BROADCAST-STREAM"), (SubLObject)sksi_reports_by_column.NIL));
        $sym5$SCHEDULE_REPORT = SubLObjectFactory.makeSymbol("SCHEDULE-REPORT");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.ZERO_INTEGER, (SubLObject)sksi_reports_by_column.NIL));
        $str7$ = SubLObjectFactory.makeString("");
        $sym8$SCHEDULE_RECURRING_REPORT = SubLObjectFactory.makeSymbol("SCHEDULE-RECURRING-REPORT");
        $str9$ReportGeneratorReportSpecificatio = SubLObjectFactory.makeString("ReportGeneratorReportSpecification");
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const11$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReportGeneratorReportSpecification")));
        $const13$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $const14$reportSpecificationTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportSpecificationTemplate"));
        $const15$reportSpecificationClobberMultipl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportSpecificationClobberMultipleValues"));
        $const16$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const17$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const18$reportSpecificationPlaceholder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportSpecificationPlaceholder"));
        $const19$reportSpecificationSelectionSente = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportSpecificationSelectionSentence"));
        $const20$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $const21$reportSpecificationDelimiterChara = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportSpecificationDelimiterCharacter"));
        $const22$Comma_TheSymbol = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Comma-TheSymbol"));
        $const23$reportSpecificationFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportSpecificationFields"));
        $const24$scheduledReportSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scheduledReportSpecification"));
        $const25$ModelMtByUserAndTaskFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModelMtByUserAndTaskFn"));
        $const26$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw27$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("stringVersionOfCharacter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")));
        $str29$reports_ = SubLObjectFactory.makeString("reports/");
        $str30$_ = SubLObjectFactory.makeString(".");
        $str31$http___ = SubLObjectFactory.makeString("http://");
        $str32$_ = SubLObjectFactory.makeString(":");
        $sym33$REPORT_BY_COLUMN_TO_FILE = SubLObjectFactory.makeSymbol("REPORT-BY-COLUMN-TO-FILE");
        $kw34$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str35$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw36$OUTPUT_DIRECTORY = SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY");
        $str37$_partial = SubLObjectFactory.makeString("-partial");
        $str38$_A_A__2__0D_A = SubLObjectFactory.makeString("~A~A-~2,'0D~A");
        $sym39$REPORT_BY_COLUMN_TO_STREAM = SubLObjectFactory.makeSymbol("REPORT-BY-COLUMN-TO-STREAM");
        $kw40$REPORT_KNOWLEDGE_SOURCE = SubLObjectFactory.makeKeyword("REPORT-KNOWLEDGE-SOURCE");
        $kw41$COLUMN_RANGE = SubLObjectFactory.makeKeyword("COLUMN-RANGE");
        $kw42$DELIMITER = SubLObjectFactory.makeKeyword("DELIMITER");
        $kw43$OUTPUT_FILENAME = SubLObjectFactory.makeKeyword("OUTPUT-FILENAME");
        $kw44$LOG_FILE = SubLObjectFactory.makeKeyword("LOG-FILE");
        $str45$Cannot_understand_filename__bad__ = SubLObjectFactory.makeString("Cannot understand filename: bad ~A and ~A ~A is not absolute~%");
        $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), sksi_reports_by_column.NIL, SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(3500), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), sksi_reports_by_column.NIL, SubLObjectFactory.makeKeyword("CONTINUABLE?"), sksi_reports_by_column.NIL, SubLObjectFactory.makeKeyword("BROWSABLE?"), sksi_reports_by_column.NIL });
        $str47$RGBC_OVERRIDING_PROPERTIES = SubLObjectFactory.makeString("RGBC OVERRIDING PROPERTIES");
        $kw48$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $sym49$MAKE_KEYWORD = SubLObjectFactory.makeSymbol("MAKE-KEYWORD");
        $sym50$STRING_UPCASE = SubLObjectFactory.makeSymbol("STRING-UPCASE");
        $str51$_s = SubLObjectFactory.makeString("~s");
        $sym52$REPORT_GENERATION_ITERATOR_DONE_P = SubLObjectFactory.makeSymbol("REPORT-GENERATION-ITERATOR-DONE-P");
        $sym53$REPORT_GENERATION_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("REPORT-GENERATION-ITERATOR-NEXT");
        $sym54$REPORT_GENERATOR = SubLObjectFactory.makeSymbol("REPORT-GENERATOR");
        $sym55$REPORT_GENERATOR_P = SubLObjectFactory.makeSymbol("REPORT-GENERATOR-P");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FULL-REPORT-PROPS"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEMS"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULL-REPORT-PROPS"), (SubLObject)SubLObjectFactory.makeKeyword("ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEMS"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RG-FULL-REPORT-PROPS"), (SubLObject)SubLObjectFactory.makeSymbol("RG-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("RG-PROBLEMS"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RG-FULL-REPORT-PROPS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RG-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEMS"));
        $sym60$PRINT_REPORT_GENERATOR = SubLObjectFactory.makeSymbol("PRINT-REPORT-GENERATOR");
        $sym61$REPORT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REPORT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REPORT-GENERATOR-P"));
        $sym63$RG_FULL_REPORT_PROPS = SubLObjectFactory.makeSymbol("RG-FULL-REPORT-PROPS");
        $sym64$_CSETF_RG_FULL_REPORT_PROPS = SubLObjectFactory.makeSymbol("_CSETF-RG-FULL-REPORT-PROPS");
        $sym65$RG_ITERATOR = SubLObjectFactory.makeSymbol("RG-ITERATOR");
        $sym66$_CSETF_RG_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-RG-ITERATOR");
        $sym67$RG_PROBLEMS = SubLObjectFactory.makeSymbol("RG-PROBLEMS");
        $sym68$_CSETF_RG_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEMS");
        $kw69$FULL_REPORT_PROPS = SubLObjectFactory.makeKeyword("FULL-REPORT-PROPS");
        $kw70$ITERATOR = SubLObjectFactory.makeKeyword("ITERATOR");
        $kw71$PROBLEMS = SubLObjectFactory.makeKeyword("PROBLEMS");
        $str72$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw73$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym74$MAKE_REPORT_GENERATOR = SubLObjectFactory.makeSymbol("MAKE-REPORT-GENERATOR");
        $kw75$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw76$END = SubLObjectFactory.makeKeyword("END");
        $sym77$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-METHOD");
        $str78$_REPORT_GENERATOR_ = SubLObjectFactory.makeString("<REPORT-GENERATOR>");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPORT-GENERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym80$COLUMN_PROBLEMS = SubLObjectFactory.makeUninternedSymbol("COLUMN-PROBLEMS");
        $list81 = ConsesLow.list((SubLObject)sksi_reports_by_column.ZERO_INTEGER);
        $sym82$CDOVECTOR = SubLObjectFactory.makeSymbol("CDOVECTOR");
        $sym83$REPORT_GENERATOR_PROBLEMS = SubLObjectFactory.makeSymbol("REPORT-GENERATOR-PROBLEMS");
        $sym84$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym85$CINC = SubLObjectFactory.makeSymbol("CINC");
        $kw86$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $sym87$SXHASH_REPORT_GENERATOR_METHOD = SubLObjectFactory.makeSymbol("SXHASH-REPORT-GENERATOR-METHOD");
        $sym88$REPORT_GENERATOR_PROBLEM = SubLObjectFactory.makeSymbol("REPORT-GENERATOR-PROBLEM");
        $sym89$REPORT_GENERATOR_PROBLEM_P = SubLObjectFactory.makeSymbol("REPORT-GENERATOR-PROBLEM-P");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeKeyword("PHYSICAL-FIELD"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RG-PROBLEM-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RG-PROBLEM-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("RG-PROBLEM-PHYSICAL-FIELD"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEM-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEM-DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEM-PHYSICAL-FIELD"));
        $sym94$PRINT_REPORT_GENERATOR_PROBLEM = SubLObjectFactory.makeSymbol("PRINT-REPORT-GENERATOR-PROBLEM");
        $sym95$REPORT_GENERATOR_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REPORT-GENERATOR-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REPORT-GENERATOR-PROBLEM-P"));
        $sym97$RG_PROBLEM_TYPE = SubLObjectFactory.makeSymbol("RG-PROBLEM-TYPE");
        $sym98$_CSETF_RG_PROBLEM_TYPE = SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEM-TYPE");
        $sym99$RG_PROBLEM_DESCRIPTION = SubLObjectFactory.makeSymbol("RG-PROBLEM-DESCRIPTION");
        $sym100$_CSETF_RG_PROBLEM_DESCRIPTION = SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEM-DESCRIPTION");
        $sym101$RG_PROBLEM_PHYSICAL_FIELD = SubLObjectFactory.makeSymbol("RG-PROBLEM-PHYSICAL-FIELD");
        $sym102$_CSETF_RG_PROBLEM_PHYSICAL_FIELD = SubLObjectFactory.makeSymbol("_CSETF-RG-PROBLEM-PHYSICAL-FIELD");
        $kw103$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw104$DESCRIPTION = SubLObjectFactory.makeKeyword("DESCRIPTION");
        $kw105$PHYSICAL_FIELD = SubLObjectFactory.makeKeyword("PHYSICAL-FIELD");
        $sym106$MAKE_REPORT_GENERATOR_PROBLEM = SubLObjectFactory.makeSymbol("MAKE-REPORT-GENERATOR-PROBLEM");
        $sym107$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATOR_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATOR-PROBLEM-METHOD");
        $str108$_REPORT_GENERATOR_PROBLEM_ = SubLObjectFactory.makeString("<REPORT-GENERATOR-PROBLEM>");
        $sym109$SXHASH_REPORT_GENERATOR_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SXHASH-REPORT-GENERATOR-PROBLEM-METHOD");
        $sym110$REPORT_GENERATION_STATE = SubLObjectFactory.makeSymbol("REPORT-GENERATION-STATE");
        $sym111$REPORT_GENERATION_STATE_P = SubLObjectFactory.makeSymbol("REPORT-GENERATION-STATE-P");
        $list112 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("KS"), SubLObjectFactory.makeSymbol("RANGE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("PF-ITERATOR"), SubLObjectFactory.makeSymbol("ITERATIONS"), SubLObjectFactory.makeSymbol("MERGED-PROPS"), SubLObjectFactory.makeSymbol("RESULTS-TABLE"), SubLObjectFactory.makeSymbol("EXECUTED-QUERIES"), SubLObjectFactory.makeSymbol("REPORT-GENERATOR") });
        $list113 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KS"), SubLObjectFactory.makeKeyword("RANGE"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("PF-ITERATOR"), SubLObjectFactory.makeKeyword("ITERATIONS"), SubLObjectFactory.makeKeyword("MERGED-PROPS"), SubLObjectFactory.makeKeyword("RESULTS-TABLE"), SubLObjectFactory.makeKeyword("EXECUTED-QUERIES"), SubLObjectFactory.makeKeyword("REPORT-GENERATOR") });
        $list114 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RG-STATE-KS"), SubLObjectFactory.makeSymbol("RG-STATE-RANGE"), SubLObjectFactory.makeSymbol("RG-STATE-MT"), SubLObjectFactory.makeSymbol("RG-STATE-PF-ITERATOR"), SubLObjectFactory.makeSymbol("RG-STATE-ITERATIONS"), SubLObjectFactory.makeSymbol("RG-STATE-MERGED-PROPS"), SubLObjectFactory.makeSymbol("RG-STATE-RESULTS-TABLE"), SubLObjectFactory.makeSymbol("RG-STATE-EXECUTED-QUERIES"), SubLObjectFactory.makeSymbol("RG-STATE-REPORT-GENERATOR") });
        $list115 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-KS"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-RANGE"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-MT"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-PF-ITERATOR"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-ITERATIONS"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-MERGED-PROPS"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-RESULTS-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-EXECUTED-QUERIES"), SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-REPORT-GENERATOR") });
        $sym116$PRINT_REPORT_GENERATION_STATE = SubLObjectFactory.makeSymbol("PRINT-REPORT-GENERATION-STATE");
        $sym117$REPORT_GENERATION_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REPORT-GENERATION-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REPORT-GENERATION-STATE-P"));
        $sym119$RG_STATE_KS = SubLObjectFactory.makeSymbol("RG-STATE-KS");
        $sym120$_CSETF_RG_STATE_KS = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-KS");
        $sym121$RG_STATE_RANGE = SubLObjectFactory.makeSymbol("RG-STATE-RANGE");
        $sym122$_CSETF_RG_STATE_RANGE = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-RANGE");
        $sym123$RG_STATE_MT = SubLObjectFactory.makeSymbol("RG-STATE-MT");
        $sym124$_CSETF_RG_STATE_MT = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-MT");
        $sym125$RG_STATE_PF_ITERATOR = SubLObjectFactory.makeSymbol("RG-STATE-PF-ITERATOR");
        $sym126$_CSETF_RG_STATE_PF_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-PF-ITERATOR");
        $sym127$RG_STATE_ITERATIONS = SubLObjectFactory.makeSymbol("RG-STATE-ITERATIONS");
        $sym128$_CSETF_RG_STATE_ITERATIONS = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-ITERATIONS");
        $sym129$RG_STATE_MERGED_PROPS = SubLObjectFactory.makeSymbol("RG-STATE-MERGED-PROPS");
        $sym130$_CSETF_RG_STATE_MERGED_PROPS = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-MERGED-PROPS");
        $sym131$RG_STATE_RESULTS_TABLE = SubLObjectFactory.makeSymbol("RG-STATE-RESULTS-TABLE");
        $sym132$_CSETF_RG_STATE_RESULTS_TABLE = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-RESULTS-TABLE");
        $sym133$RG_STATE_EXECUTED_QUERIES = SubLObjectFactory.makeSymbol("RG-STATE-EXECUTED-QUERIES");
        $sym134$_CSETF_RG_STATE_EXECUTED_QUERIES = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-EXECUTED-QUERIES");
        $sym135$RG_STATE_REPORT_GENERATOR = SubLObjectFactory.makeSymbol("RG-STATE-REPORT-GENERATOR");
        $sym136$_CSETF_RG_STATE_REPORT_GENERATOR = SubLObjectFactory.makeSymbol("_CSETF-RG-STATE-REPORT-GENERATOR");
        $kw137$KS = SubLObjectFactory.makeKeyword("KS");
        $kw138$RANGE = SubLObjectFactory.makeKeyword("RANGE");
        $kw139$MT = SubLObjectFactory.makeKeyword("MT");
        $kw140$PF_ITERATOR = SubLObjectFactory.makeKeyword("PF-ITERATOR");
        $kw141$ITERATIONS = SubLObjectFactory.makeKeyword("ITERATIONS");
        $kw142$MERGED_PROPS = SubLObjectFactory.makeKeyword("MERGED-PROPS");
        $kw143$RESULTS_TABLE = SubLObjectFactory.makeKeyword("RESULTS-TABLE");
        $kw144$EXECUTED_QUERIES = SubLObjectFactory.makeKeyword("EXECUTED-QUERIES");
        $kw145$REPORT_GENERATOR = SubLObjectFactory.makeKeyword("REPORT-GENERATOR");
        $sym146$MAKE_REPORT_GENERATION_STATE = SubLObjectFactory.makeSymbol("MAKE-REPORT-GENERATION-STATE");
        $sym147$VISIT_DEFSTRUCT_OBJECT_REPORT_GENERATION_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPORT-GENERATION-STATE-METHOD");
        $str148$_REPORT_GENERATION_STATE_ = SubLObjectFactory.makeString("<REPORT-GENERATION-STATE>");
        $sym149$SXHASH_REPORT_GENERATION_STATE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-REPORT-GENERATION-STATE-METHOD");
        $str150$Executed_queries_state___s__ = SubLObjectFactory.makeString("Executed queries state: ~s~%");
        $sym151$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $const152$databaseForReportGeneratorOutput = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("databaseForReportGeneratorOutput"));
        $kw153$NULL = SubLObjectFactory.makeKeyword("NULL");
        $const154$logicalSchemaSourceMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaSourceMap"));
        $const155$reportGeneratorLogicalSchemaToNat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportGeneratorLogicalSchemaToNativePhysicalSchemaMap"));
        $const156$schemaFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldNameList"));
        $const157$reportGeneratorLogicalSchemaToDat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportGeneratorLogicalSchemaToDatabasePhysicalSchemaMap"));
        $const158$schemaName_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaName-SKS"));
        $kw159$INTO = SubLObjectFactory.makeKeyword("INTO");
        $kw160$TABLE = SubLObjectFactory.makeKeyword("TABLE");
        $str161$Could_not_find_logicalSchemaSourc = SubLObjectFactory.makeString("Could not find logicalSchemaSourceMap for ~S~%");
        $str162$Could_not_find_reportGeneratorLog = SubLObjectFactory.makeString("Could not find reportGeneratorLogicalSchemaToNativePhysicalSchemaMap for ~S~%");
        $str163$Could_not_find_schemaFieldNameLis = SubLObjectFactory.makeString("Could not find schemaFieldNameList for ~S~%");
        $str164$Could_not_find_reportGeneratorLog = SubLObjectFactory.makeString("Could not find reportGeneratorLogicalSchemaToDatabasePhysicalSchemaMap for ~S~%");
        $str165$Could_not_find_schemaName_SKS_for = SubLObjectFactory.makeString("Could not find schemaName-SKS for ~S~%");
        $str166$Could_not_find_databaseForReportG = SubLObjectFactory.makeString("Could not find databaseForReportGeneratorOutput for ~S~%");
        $const167$logicalFieldValueWithFieldName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldValueWithFieldName"));
        $list168 = ConsesLow.list((SubLObject)sksi_reports_by_column.THREE_INTEGER);
        $const169$fieldEncodingPFIAndLFI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncodingPFIAndLFI"));
        $list170 = ConsesLow.list((SubLObject)sksi_reports_by_column.TWO_INTEGER);
        $const171$physicalSchemaFieldIndexicalWithN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaFieldIndexicalWithName"));
        $str172$Could_not_find_logicalFieldValueW = SubLObjectFactory.makeString("Could not find logicalFieldValueWithFieldName for ~S ~S~%");
        $str173$Could_not_find_fieldEncodingPFIAn = SubLObjectFactory.makeString("Could not find fieldEncodingPFIAndLFI for ~S ~S ~S~%");
        $str174$Could_not_find_physicalSchemaFiel = SubLObjectFactory.makeString("Could not find physicalSchemaFieldIndexicalWithName for ~S ~S~%");
        $kw175$FIELD = SubLObjectFactory.makeKeyword("FIELD");
        $str176$___S = SubLObjectFactory.makeString("~%~S");
        $str177$RG_field_list_____S__ = SubLObjectFactory.makeString("RG field list: ~%~S~%");
        $str178$Value___S__ = SubLObjectFactory.makeString("Value: ~S~%");
        $kw179$INSERT = SubLObjectFactory.makeKeyword("INSERT");
        $kw180$VALUES = SubLObjectFactory.makeKeyword("VALUES");
        $sym181$REPLACE_WITH_NULL = SubLObjectFactory.makeSymbol("REPLACE-WITH-NULL");
        $str182$New_hash_table___S__ = SubLObjectFactory.makeString("New hash table: ~S~%");
        $sym183$RUN_BATCH_REPORTS_FROM_DEFINITION_FILE = SubLObjectFactory.makeSymbol("RUN-BATCH-REPORTS-FROM-DEFINITION-FILE");
        $sym184$RUN_BATCH_REPORTS_FROM_DEFINITION = SubLObjectFactory.makeSymbol("RUN-BATCH-REPORTS-FROM-DEFINITION");
        $list185 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROPS"));
        $kw186$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw187$GLOBAL = SubLObjectFactory.makeKeyword("GLOBAL");
        $sym188$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym189$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym190$RANGE_SPECIFIER_ITEM_P = SubLObjectFactory.makeSymbol("RANGE-SPECIFIER-ITEM-P");
        $sym191$EXPAND_RANGE_SPECIFIER_ITEM = SubLObjectFactory.makeSymbol("EXPAND-RANGE-SPECIFIER-ITEM");
        $sym192$GAFS_FROM_KS = SubLObjectFactory.makeSymbol("GAFS-FROM-KS");
        $const193$physicalSchemaFieldWithName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaFieldWithName"));
        $list194 = ConsesLow.list((SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.THREE_INTEGER);
        $const195$schemaFieldList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldList"));
        $str196$Default_values___s__ = SubLObjectFactory.makeString("Default values: ~s~%");
        $list197 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KS1"), (SubLObject)SubLObjectFactory.makeSymbol("LFI1"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-QUERY"));
        $str198$Hashtable_contents_before___ = SubLObjectFactory.makeString("Hashtable contents before:~%");
        $kw199$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $kw200$ABNORMAL_HALT_REASON = SubLObjectFactory.makeKeyword("ABNORMAL-HALT-REASON");
        $str201$Property_list___s___ = SubLObjectFactory.makeString("Property list? ~s ~%");
        $str202$Dictionary_Contents____ = SubLObjectFactory.makeString("Dictionary Contents: ~%");
        $str203$Hashtable_contents_after__ = SubLObjectFactory.makeString("Hashtable contents after~%");
        $str204$_________________________________ = SubLObjectFactory.makeString("~%~%~%~%========================================~%");
        $list205 = ConsesLow.list((SubLObject)sksi_reports_by_column.FOUR_INTEGER, (SubLObject)sksi_reports_by_column.TWO_INTEGER);
        $str206$dict_key___s__ = SubLObjectFactory.makeString("dict key: ~s~%");
        $str207$Result_plist___s__ = SubLObjectFactory.makeString("Result plist: ~s~%");
        $str208$Store_row___s__ = SubLObjectFactory.makeString("Store row: ~s~%");
        $str209$_s___ = SubLObjectFactory.makeString("~s ~%");
        $const210$indexicalForPhysicalField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalForPhysicalField"));
        $str211$Result____s__ = SubLObjectFactory.makeString("Result : ~s~%");
        $str212$RG_LFI____s__ = SubLObjectFactory.makeString("RG-LFI : ~s~%");
        $str213$RG_PFI____s__ = SubLObjectFactory.makeString("RG-PFI : ~s~%");
        $str214$RG_PF____s__ = SubLObjectFactory.makeString("RG-PF : ~s~%");
        $str215$encoding_expression____s__ = SubLObjectFactory.makeString("encoding-expression : ~s~%");
        $str216$encoded_value____s__ = SubLObjectFactory.makeString("encoded-value : ~s~%");
        $str217$Store_row__after____s__ = SubLObjectFactory.makeString("Store row (after): ~s~%");
        $kw218$CLOBBER_MULTIPLE_VALUES_ = SubLObjectFactory.makeKeyword("CLOBBER-MULTIPLE-VALUES?");
        $str219$vectorp___S__curr_vector___S__col = SubLObjectFactory.makeString("vectorp: ~S, curr-vector: ~S, column-num: ~S, physical-value: ~S~%");
        $const220$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $kw221$MULTIPLE_ANSWERS = SubLObjectFactory.makeKeyword("MULTIPLE-ANSWERS");
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KS"), (SubLObject)SubLObjectFactory.makeSymbol("LFI"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-QUERY"));
        $str223$Some_rows_unexpectedly_returned_m = SubLObjectFactory.makeString("Some rows unexpectedly returned multiple answers for query ~A.~%LFI: ~A~%Original sentence: ~A~%");
        $sym224$APPLY_ENCODING_FOR_PF = SubLObjectFactory.makeSymbol("APPLY-ENCODING-FOR-PF");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KS"), (SubLObject)SubLObjectFactory.makeSymbol("LFI"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-QUERY"));
        $const226$kSVariantHasFieldQueryWFocalArgPo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kSVariantHasFieldQueryWFocalArgPosAndTransformation"));
        $kw227$SELECTION_SENTENCE = SubLObjectFactory.makeKeyword("SELECTION-SENTENCE");
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ENTITY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"));
        $const229$queryHasFocalOutputVariablePositi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryHasFocalOutputVariablePosition"));
        $const230$queryHasFocalOutputVariablePositi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryHasFocalOutputVariablePositionForReportIndexical"));
        $const231$kSHasQueryOutputIndexicalForLogic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kSHasQueryOutputIndexicalForLogicalFieldIndexical"));
        $list232 = ConsesLow.list((SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.FOUR_INTEGER);
        $str233$Answer_var_list___s___ = SubLObjectFactory.makeString("Answer var list: ~s ~%");
        $str234$Field_name_list___s___ = SubLObjectFactory.makeString("Field name list: ~s ~%");
        $str235$Modified_Column_Query___S___ = SubLObjectFactory.makeString("Modified Column Query: ~S ~%");
        $str236$Query_halted_unusually_with__D_re = SubLObjectFactory.makeString("Query halted unusually with ~D results for reason ~A:~%~A~%~A~%~A~%~A~%~A~%");
        $const237$queryHasFocalInputVariablePositio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryHasFocalInputVariablePosition"));
        $const238$queryHasFocalInputVariablePositio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryHasFocalInputVariablePositionForReportIndexical"));
        $const239$baseQueryForReportType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseQueryForReportType"));
        $str240$Number_of_selection_inputs_not_eq = SubLObjectFactory.makeString("Number of selection inputs not equal to number of column query positions");
        $str241$key_selection___value_selection__ = SubLObjectFactory.makeString("key-selection : value-selection : value-query : var-list : selection-output-list~%");
        $str242$_S__S__S__S___S__ = SubLObjectFactory.makeString("~S:~S:~S:~S: ~S~%");
        $kw243$SELECTION_SENTENCE_INPUT_LIST = SubLObjectFactory.makeKeyword("SELECTION-SENTENCE-INPUT-LIST");
        $const244$queryHasInputIndexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryHasInputIndexicalMapping"));
        $sym245$CANONICALIZE_TERM = SubLObjectFactory.makeSymbol("CANONICALIZE-TERM");
        $str246$Tuple_to_map__ = SubLObjectFactory.makeString("Tuple to map~%");
        $kw247$PLACEHOLDER = SubLObjectFactory.makeKeyword("PLACEHOLDER");
        $kw248$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym249$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str250$var_pos_var_selection_vars_select = SubLObjectFactory.makeString("var-pos:var:selection-vars:selection-output-list~%");
        $str251$_S__S__S__S__ = SubLObjectFactory.makeString("~S:~S:~S:~S~%");
        $str252$Failed_to_find_entities_for_repor = SubLObjectFactory.makeString("Failed to find entities for report ~A using associated queries ~S~%");
        $const253$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym254$_LS = SubLObjectFactory.makeSymbol("?LS");
        $list255 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldIndexicals")), (SubLObject)SubLObjectFactory.makeSymbol("?LS"), (SubLObject)SubLObjectFactory.makeSymbol("?LFI"));
        $const256$kSHasQueryForLogicalFieldIndexica = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kSHasQueryForLogicalFieldIndexical"));
        $sym257$_LFI = SubLObjectFactory.makeSymbol("?LFI");
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)sksi_reports_by_column.ONE_INTEGER);
        $sym259$_QUERY = SubLObjectFactory.makeSymbol("?QUERY");
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RESULTPOS"));
        $list261 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeSymbol("?RESULTPOS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"))))));
        $str262$Can_t_find_any_useful_queries_ass = SubLObjectFactory.makeString("Can't find any useful queries associated with report ~A!~%");
        $list263 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REPORT-KNOWLEDGE-SOURCE"), SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY"), SubLObjectFactory.makeKeyword("OUTPUT-FILENAME"), SubLObjectFactory.makeKeyword("LOG-FILE"), SubLObjectFactory.makeKeyword("LOG-STREAM"), SubLObjectFactory.makeKeyword("DELIMITER"), SubLObjectFactory.makeKeyword("SELECTION-SENTENCE"), SubLObjectFactory.makeKeyword("COLUMN-RANGE"), SubLObjectFactory.makeKeyword("PLACEHOLDER"), SubLObjectFactory.makeKeyword("CLOBBER-MULTIPLE-VALUES?") });
        $kw264$LOG_STREAM = SubLObjectFactory.makeKeyword("LOG-STREAM");
        $sym265$APPLY_RANGE_SPECIFIER_TO_SEQUENCE = SubLObjectFactory.makeSymbol("APPLY-RANGE-SPECIFIER-TO-SEQUENCE");
        $kw266$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw267$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw268$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw269$KB = SubLObjectFactory.makeKeyword("KB");
        $kw270$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw271$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list272 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("E"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.ONE_INTEGER, (SubLObject)sksi_reports_by_column.FOUR_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.ZERO_INTEGER, (SubLObject)sksi_reports_by_column.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E"), SubLObjectFactory.makeSymbol("F"), SubLObjectFactory.makeSymbol("G"), SubLObjectFactory.makeSymbol("H"), SubLObjectFactory.makeSymbol("I"), SubLObjectFactory.makeSymbol("J") }), (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.TWO_INTEGER, (SubLObject)sksi_reports_by_column.FOUR_INTEGER), (SubLObject)sksi_reports_by_column.SIX_INTEGER, (SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.EIGHT_INTEGER, (SubLObject)sksi_reports_by_column.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("J"))));
        $sym273$ABSOLUTE_PATH_FROM_ABSOLUTE_OR_RELATIVE = SubLObjectFactory.makeSymbol("ABSOLUTE-PATH-FROM-ABSOLUTE-OR-RELATIVE");
        $list274 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_reports_by_column.NIL, (SubLObject)sksi_reports_by_column.NIL), (SubLObject)sksi_reports_by_column.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)sksi_reports_by_column.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)sksi_reports_by_column.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/home/foo.txt"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("/home/foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/home/foo.txt"), (SubLObject)SubLObjectFactory.makeString(":\\/$# nblah")), (SubLObject)SubLObjectFactory.makeString("/home/foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("/home")), (SubLObject)SubLObjectFactory.makeString("/home/foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("/home/")), (SubLObject)SubLObjectFactory.makeString("/home/foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("home")), (SubLObject)sksi_reports_by_column.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("../foo.txt"), (SubLObject)SubLObjectFactory.makeString("/home/bar")), (SubLObject)SubLObjectFactory.makeString("/home/foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("C:\\")), (SubLObject)SubLObjectFactory.makeString("C:\\foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("C:\\Documents and Settings")), (SubLObject)SubLObjectFactory.makeString("C:\\Documents and Settings\\foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("C:\\Documents and Settings\\foo.txt"), (SubLObject)SubLObjectFactory.makeString(":\\/$# nblah")), (SubLObject)SubLObjectFactory.makeString("C:\\Documents and Settings\\foo.txt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo.txt"), (SubLObject)SubLObjectFactory.makeString("\\\\windows\\share")), (SubLObject)SubLObjectFactory.makeString("\\\\windows\\share\\foo.txt")) });
        $const275$sksOfReportTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksOfReportTest"));
        $kw276$REG = SubLObjectFactory.makeKeyword("REG");
        $sym277$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const278$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const279$requiredAssertionForReportTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredAssertionForReportTest"));
        $kw280$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-2-VALUE"));
        $sym282$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $const283$pathnameForReportDefinition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pathnameForReportDefinition"));
        $const284$baselineDirectoryForReport = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baselineDirectoryForReport"));
        $const285$reportTestComparesFilenamesWRTKey = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reportTestComparesFilenamesWRTKeycolumn"));
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASELINE-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-COLUMN"));
        $str287$Baseline_file___A__Test_output_fi = SubLObjectFactory.makeString("Baseline file: ~A~%Test output file: ~A~% For ~S,~% Wanted ~A~%    Got ~A");
        $str288$_A___has__D_more_rows_than___A = SubLObjectFactory.makeString("~A~% has ~D more rows than~%~A");
        $list289 = ConsesLow.list((SubLObject)Characters.CHAR_tab);
        $str290$Can_t_find__S_in__S = SubLObjectFactory.makeString("Can't find ~S in ~S");
    }
    
    public static final class $report_generator_native extends SubLStructNative
    {
        public SubLObject $full_report_props;
        public SubLObject $iterator;
        public SubLObject $problems;
        private static final SubLStructDeclNative structDecl;
        
        public $report_generator_native() {
            this.$full_report_props = (SubLObject)CommonSymbols.NIL;
            this.$iterator = (SubLObject)CommonSymbols.NIL;
            this.$problems = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$report_generator_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$report_generator_native.class, sksi_reports_by_column.$sym54$REPORT_GENERATOR, sksi_reports_by_column.$sym55$REPORT_GENERATOR_P, sksi_reports_by_column.$list56, sksi_reports_by_column.$list57, new String[] { "$full_report_props", "$iterator", "$problems" }, sksi_reports_by_column.$list58, sksi_reports_by_column.$list59, sksi_reports_by_column.$sym60$PRINT_REPORT_GENERATOR);
        }
    }
    
    public static final class $report_generator_p$UnaryFunction extends UnaryFunction
    {
        public $report_generator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REPORT-GENERATOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_reports_by_column.report_generator_p(arg1);
        }
    }
    
    public static final class $report_generator_problem_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $description;
        public SubLObject $physical_field;
        private static final SubLStructDeclNative structDecl;
        
        public $report_generator_problem_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$description = (SubLObject)CommonSymbols.NIL;
            this.$physical_field = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$report_generator_problem_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$report_generator_problem_native.class, sksi_reports_by_column.$sym88$REPORT_GENERATOR_PROBLEM, sksi_reports_by_column.$sym89$REPORT_GENERATOR_PROBLEM_P, sksi_reports_by_column.$list90, sksi_reports_by_column.$list91, new String[] { "$type", "$description", "$physical_field" }, sksi_reports_by_column.$list92, sksi_reports_by_column.$list93, sksi_reports_by_column.$sym94$PRINT_REPORT_GENERATOR_PROBLEM);
        }
    }
    
    public static final class $report_generator_problem_p$UnaryFunction extends UnaryFunction
    {
        public $report_generator_problem_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REPORT-GENERATOR-PROBLEM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_reports_by_column.report_generator_problem_p(arg1);
        }
    }
    
    public static final class $report_generation_state_native extends SubLStructNative
    {
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
        
        public $report_generation_state_native() {
            this.$ks = (SubLObject)CommonSymbols.NIL;
            this.$range = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$pf_iterator = (SubLObject)CommonSymbols.NIL;
            this.$iterations = (SubLObject)CommonSymbols.NIL;
            this.$merged_props = (SubLObject)CommonSymbols.NIL;
            this.$results_table = (SubLObject)CommonSymbols.NIL;
            this.$executed_queries = (SubLObject)CommonSymbols.NIL;
            this.$report_generator = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$report_generation_state_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$report_generation_state_native.class, sksi_reports_by_column.$sym110$REPORT_GENERATION_STATE, sksi_reports_by_column.$sym111$REPORT_GENERATION_STATE_P, sksi_reports_by_column.$list112, sksi_reports_by_column.$list113, new String[] { "$ks", "$range", "$mt", "$pf_iterator", "$iterations", "$merged_props", "$results_table", "$executed_queries", "$report_generator" }, sksi_reports_by_column.$list114, sksi_reports_by_column.$list115, sksi_reports_by_column.$sym116$PRINT_REPORT_GENERATION_STATE);
        }
    }
    
    public static final class $report_generation_state_p$UnaryFunction extends UnaryFunction
    {
        public $report_generation_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REPORT-GENERATION-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_reports_by_column.report_generation_state_p(arg1);
        }
    }
}

/*

	Total time: 1472 ms
	
*/