package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;

import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.rkf_relevance_utilities;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_smt
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt";
  public static final String myFingerPrint = "601700c03d9e67f93a0cfc6081e613eb7682ca00a68b9d009c19307540bcc4e0";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 823L)
  public static SubLSymbol $allow_smt_editing_links$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 19004L)
  private static SubLSymbol $sksi_smt_sd_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
  private static SubLSymbol $sksi_smt_compile_param_definitions_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 33914L)
  private static SubLSymbol $sksi_smt_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
  private static SubLSymbol $sksi_smt_column_or_fort_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65179L)
  public static SubLSymbol $sksi_smt_warn_about_invariantsP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71904L)
  private static SubLSymbol $sksi_isg$;
  private static final SubLString $str0$_Edit_in_SMT_;
  private static final SubLString $str1$http___;
  private static final SubLString $str2$_;
  private static final SubLString $str3$_SchemaModelingTool__sksName_;
  private static final SubLString $str4$_cyc_server_;
  private static final SubLString $str5$_cyc_defaultCyclist_;
  private static final SubLString $str6$Will_open_in_new_browser_window;
  private static final SubLString $str7$_blank;
  private static final SubLSymbol $kw8$EDIT_IN_SMT;
  private static final SubLSymbol $sym9$CB_LINK_EDIT_IN_SMT;
  private static final SubLString $str10$Edit;
  private static final SubLString $str11$window_open__;
  private static final SubLString $str12$___;
  private static final SubLSymbol $kw13$BUTTON;
  private static final SubLString $str14$CMT;
  private static final SubLSymbol $kw15$MAIN;
  private static final SubLString $str16$sksi_smt;
  private static final SubLSymbol $kw17$SMT;
  private static final SubLSymbol $sym18$CB_LINK_SMT;
  private static final SubLString $str19$SMT;
  private static final SubLString $str20$Schema_Modeling_Tool;
  private static final SubLSymbol $sym21$SKSI_SMT;
  private static final SubLSymbol $kw22$HTML_HANDLER;
  private static final SubLSymbol $sym23$ARGHASH_P;
  private static final SubLString $str24$COMMAND;
  private static final SubLString $str25$TO;
  private static final SubLSymbol $kw26$ON_EDIT_SKS;
  private static final SubLSymbol $kw27$ON_EDIT_SD;
  private static final SubLSymbol $kw28$ON_EDIT_PS;
  private static final SubLSymbol $kw29$ON_EDIT_LS;
  private static final SubLSymbol $kw30$ON_EDIT_LF;
  private static final SubLSymbol $kw31$ON_EDIT_MS;
  private static final SubLSymbol $kw32$ON_DECODE_PSB;
  private static final SubLSymbol $kw33$ON_EDIT_TS;
  private static final SubLSymbol $kw34$ON_EDIT_T;
  private static final SubLSymbol $kw35$ON_MAIN;
  private static final SubLString $str36$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str37$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw38$UNINITIALIZED;
  private static final SubLSymbol $kw39$CB_CYC;
  private static final SubLString $str40$cg_sksi_smt;
  private static final SubLString $str41$post;
  private static final SubLSymbol $kw42$JUST_FORT;
  private static final SubLObject $const43$StructuredKnowledgeSource;
  private static final SubLSymbol $kw44$SKS;
  private static final SubLSymbol $kw45$TO_EDIT_SKS;
  private static final SubLObject $const46$PhysicalSchema;
  private static final SubLSymbol $kw47$PS;
  private static final SubLSymbol $kw48$TO_EDIT_PS;
  private static final SubLObject $const49$LogicalSchema;
  private static final SubLSymbol $kw50$LS;
  private static final SubLSymbol $kw51$TO_EDIT_LS;
  private static final SubLObject $const52$PhysicalField;
  private static final SubLSymbol $kw53$PF;
  private static final SubLSymbol $kw54$TO_EDIT_PF;
  private static final SubLObject $const55$LogicalField;
  private static final SubLSymbol $kw56$LF;
  private static final SubLSymbol $kw57$TO_EDIT_LF;
  private static final SubLString $str58$Error__Support_for_term_;
  private static final SubLString $str59$_not_implemented;
  private static final SubLSymbol $kw60$ERROR;
  private static final SubLString $str61$Error__;
  private static final SubLSymbol $sym62$FORMAT;
  private static final SubLSymbol $kw63$SUCCESS;
  private static final SubLString $str64$Success__;
  private static final SubLSymbol $kw65$TO_EDIT_SD;
  private static final SubLSymbol $kw66$TO_EDIT_MS;
  private static final SubLSymbol $kw67$TO_EDIT_TS;
  private static final SubLSymbol $kw68$TO_EDIT_T;
  private static final SubLSymbol $kw69$TO_MAIN;
  private static final SubLSymbol $kw70$TO_DECODE_PSB;
  private static final SubLString $str71$Error__button_;
  private static final SubLString $str72$Error__fort_type_for_;
  private static final SubLString $str73$_not_supported;
  private static final SubLString $str74$Create_new_SKS_named__;
  private static final SubLSymbol $kw75$NEW_SKS_NAME;
  private static final SubLInteger $int76$40;
  private static final SubLString $str77$Create;
  private static final SubLSymbol $kw78$COMMAND_EDIT_SKS;
  private static final SubLString $str79$Knowledge_Source_;
  private static final SubLSymbol $kw80$NBSP;
  private static final SubLSymbol $kw81$TOP;
  private static final SubLString $str82$Source_Description__;
  private static final SubLString $str83$Physical_Schemabase__;
  private static final SubLString $str84$Logical_Schemabase__;
  private static final SubLString $str85$Translation_Schemabase__;
  private static final SubLString $str86$Other_Physical_Schemabases_;
  private static final SubLString $str87$Other_Logical_Schemabases_;
  private static final SubLString $str88$Other_Translations_Schemabases_;
  private static final SubLString $str89$Please_enter_an_SKS_name_;
  private static final SubLString $str90$Edit_SKS__;
  private static final SubLString $str91$Name__;
  private static final SubLSymbol $kw92$SKS_NAMESTRING;
  private static final SubLObject $const93$nameString;
  private static final SubLInteger $int94$80;
  private static final SubLSymbol $kw95$RIGHT;
  private static final SubLString $str96$Add;
  private static final SubLSymbol $kw97$COMMAND_EDIT_SD;
  private static final SubLString $str98$Decode;
  private static final SubLSymbol $kw99$DECODE_PSB;
  private static final SubLString $str100$Remove;
  private static final SubLSymbol $kw101$REMOVE_PSB;
  private static final SubLSymbol $kw102$COMMAND_REMOVE_LSB;
  private static final SubLSymbol $kw103$LSB;
  private static final SubLSymbol $kw104$COMMAND_EDIT_LSB;
  private static final SubLSymbol $kw105$COMMAND_REMOVE_TSB;
  private static final SubLSymbol $kw106$TSB;
  private static final SubLString $str107$Refresh;
  private static final SubLSymbol $kw108$REFRESH;
  private static final SubLString $str109$OK;
  private static final SubLSymbol $kw110$OK;
  private static final SubLString $str111$Cancel;
  private static final SubLSymbol $kw112$LEFT;
  private static final SubLString $str113$Physical_Schemata_;
  private static final SubLString $str114$Logical_Schemata_;
  private static final SubLString $str115$Translations_;
  private static final SubLString $str116$View;
  private static final SubLSymbol $kw117$COMMAND_EDIT_PS;
  private static final SubLSymbol $kw118$COMMAND_EDIT_LS;
  private static final SubLSymbol $kw119$COMMAND_EDIT_TS;
  private static final SubLObject $const120$sksPhysicalSchemaDescriptionMt;
  private static final SubLObject $const121$UniversalVocabularyMt;
  private static final SubLList $list122;
  private static final SubLString $str123$This_SKS_is_currently_;
  private static final SubLString $str124$accessible;
  private static final SubLString $str125$not_accessible;
  private static final SubLString $str126$_;
  private static final SubLSymbol $kw127$SD;
  private static final SubLString $str128$Edit_Source_Description__;
  private static final SubLString $str129$Parameter;
  private static final SubLString $str130$Value;
  private static final SubLObject $const131$CharacterString;
  private static final SubLObject $const132$Integer;
  private static final SubLSymbol $kw133$INTEGER;
  private static final SubLSymbol $kw134$FORT;
  private static final SubLSymbol $sym135$FORT_NAME;
  private static final SubLString $str136$Changed__A__A_from__A_to__A;
  private static final SubLSymbol $sym137$SKSI_SMT_UPDATE_SOURCE_DESCRIPTION;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$SKSI_SMT_COMPILE_SOURCE_DESCRIPTION;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS;
  private static final SubLObject $const142$sksIsa;
  private static final SubLObject $const143$subProtocolForSKS;
  private static final SubLObject $const144$SKSISupportedDatabaseServerProgra;
  private static final SubLString $str145$Do_not_know_what_to_do_with_const;
  private static final SubLSymbol $sym146$_SKSI_SMT_COMPILE_PARAM_DEFINITIONS_CACHING_STATE_;
  private static final SubLSymbol $sym147$SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE;
  private static final SubLSymbol $sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_;
  private static final SubLSymbol $kw149$NOREG;
  private static final SubLSymbol $sym150$SKSI_PS_COMPILE_PFS_INFO;
  private static final SubLSymbol $kw151$NAME;
  private static final SubLSymbol $kw152$DATATYPE;
  private static final SubLSymbol $kw153$NULLABLE;
  private static final SubLSymbol $kw154$KEY_TYPE;
  private static final SubLSymbol $kw155$DEFAULT;
  private static final SubLString $str156$Edit_Physical_Schema__;
  private static final SubLString $str157$___;
  private static final SubLString $str158$Physical_fields_;
  private static final SubLString $str159$Name;
  private static final SubLString $str160$Datatype;
  private static final SubLString $str161$Nullable;
  private static final SubLString $str162$Default_Value;
  private static final SubLString $str163$No_fields_in_this_physical_schema;
  private static final SubLObject $const164$TheLogicalFieldValueFn;
  private static final SubLSymbol $sym165$SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA;
  private static final SubLSymbol $sym166$RELEVANT_MT_IS_GENL_MT;
  private static final SubLObject $const167$logicalPhysicalSchemaMap;
  private static final SubLSymbol $sym168$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA;
  private static final SubLSymbol $sym169$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA;
  private static final SubLString $str170$Could_not_retrieve_meaning_senten;
  private static final SubLSymbol $sym171$_BASE_PRED;
  private static final SubLObject $const172$correspondingSKSIPredicate;
  private static final SubLString $str173$Dont_support_more_than_binary_pre;
  private static final SubLList $list174;
  private static final SubLList $list175;
  private static final SubLObject $const176$fieldDecoding;
  private static final SubLString $str177$Expected___fieldDecoding_sentence;
  private static final SubLSymbol $kw178$PREDICATE;
  private static final SubLSymbol $kw179$PF1;
  private static final SubLSymbol $kw180$TERM;
  private static final SubLSymbol $kw181$ARG_ISA;
  private static final SubLSymbol $kw182$CONVERT;
  private static final SubLSymbol $kw183$PF2;
  private static final SubLObject $const184$SchemaObjectFn;
  private static final SubLObject $const185$SchemaObjectIDFn;
  private static final SubLObject $const186$TheTerm;
  private static final SubLList $list187;
  private static final SubLString $str188$Do_not_know_how_to_unpack_decodin;
  private static final SubLSymbol $kw189$ENABLED;
  private static final SubLSymbol $sym190$ENABLE_SKSI_SMT_MODE;
  private static final SubLSymbol $sym191$DISABLE_SKSI_SMT_MODE;
  private static final SubLSymbol $kw192$DISABLED;
  private static final SubLSymbol $sym193$IS_SKSI_SMT_MODE_ENABLED_;
  private static final SubLSymbol $sym194$GET_SKSI_SMT_MODE;
  private static final SubLSymbol $sym195$SKSI_SMT_GET_UNITS_OF_MEASUREMENT;
  private static final SubLSymbol $sym196$SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN;
  private static final SubLObject $const197$InferencePSC;
  private static final SubLList $list198;
  private static final SubLSymbol $sym199$SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA;
  private static final SubLString $str200$_PS;
  private static final SubLString $str201$_;
  private static final SubLString $str202$_LS;
  private static final SubLObject $const203$logicalSchemaFieldTypeList;
  private static final SubLObject $const204$TheList;
  private static final SubLObject $const205$meaningSentenceOfSchema;
  private static final SubLList $list206;
  private static final SubLObject $const207$fieldEncoding;
  private static final SubLObject $const208$sksRepresentationComplete;
  private static final SubLObject $const209$SKSIMt;
  private static final SubLString $str210$_Pred;
  private static final SubLObject $const211$isa;
  private static final SubLList $list212;
  private static final SubLObject $const213$termDependsOn;
  private static final SubLObject $const214$BaseKB;
  private static final SubLObject $const215$arg1Isa;
  private static final SubLObject $const216$arg2Isa;
  private static final SubLObject $const217$backchainForbidden;
  private static final SubLList $list218;
  private static final SubLObject $const219$backchainRequired;
  private static final SubLObject $const220$implies;
  private static final SubLList $list221;
  private static final SubLSymbol $kw222$BACKWARD;
  private static final SubLObject $const223$ThePhysicalFieldValueFn;
  private static final SubLObject $const224$PhysicalFieldFn;
  private static final SubLList $list225;
  private static final SubLSymbol $kw226$OPERATOR;
  private static final SubLString $str227$No_implementation_yet_for_LF_conv;
  private static final SubLList $list228;
  private static final SubLString $str229$No_implementation_yet_for_PF_conv;
  private static final SubLSymbol $sym230$SKSI_SMT_COLUMN_OR_FORT_NAME;
  private static final SubLSymbol $sym231$_SKSI_SMT_COLUMN_OR_FORT_NAME_CACHING_STATE_;
  private static final SubLInteger $int232$200;
  private static final SubLString $str233$Edit_Logical_Schema__;
  private static final SubLString $str234$Logical_fields_;
  private static final SubLString $str235$CycL;
  private static final SubLString $str236$Field_isa;
  private static final SubLString $str237$__user_MS_s;
  private static final SubLSymbol $kw238$ARG1;
  private static final SubLSymbol $kw239$ARG2;
  private static final SubLSymbol $kw240$COMMAND_EDIT_LF;
  private static final SubLString $str241$Delete;
  private static final SubLSymbol $kw242$DELETE_LF;
  private static final SubLString $str243$No_fields_in_this_logical_schema_;
  private static final SubLString $str244$Add_logical_field;
  private static final SubLString $str245$Meaning_sentences_;
  private static final SubLSymbol $kw246$COMMAND_EDIT_MS;
  private static final SubLSymbol $kw247$MS;
  private static final SubLSymbol $kw248$DELETE_MS;
  private static final SubLString $str249$No_meaning_sentences_in_this_logi;
  private static final SubLString $str250$;
  private static final SubLInteger $int251$60;
  private static final SubLString $str252$Add_meaning_sentence;
  private static final SubLString $str253$Edit_Logical_Field__;
  private static final SubLString $str254$Editing_this_field_will_automatic;
  private static final SubLString $str255$Logical_field_;
  private static final SubLSymbol $kw256$ISA;
  private static final SubLSymbol $kw257$NEW_ISA;
  private static final SubLInteger $int258$30;
  private static final SubLString $str259$Complete;
  private static final SubLObject $const260$Collection;
  private static final SubLString $str261$Change;
  private static final SubLSymbol $kw262$REMOVE_ISA;
  private static final SubLSymbol $kw263$REMOVED_ISA;
  private static final SubLSymbol $kw264$ADDED_ISA;
  private static final SubLString $str265$Add_isa;
  private static final SubLSymbol $kw266$ADD_ISA;
  private static final SubLObject $const267$fieldIsa;
  private static final SubLString $str268$Edit_Translation_Schema__;
  private static final SubLString $str269$_A__A;
  private static final SubLString $str270$___;
  private static final SubLString $str271$_note__editing_is_not_yet_enabled;
  private static final SubLSymbol $kw272$CENTER;
  private static final SubLString $str273$___;
  private static final SubLSymbol $kw274$DECODING_FORMULA;
  private static final SubLInteger $int275$50;
  private static final SubLSymbol $kw276$ENCODING_FORMULA;
  private static final SubLString $str277$Edit_Meaning_Sentence_in__;
  private static final SubLSymbol $kw278$MS_FORMULA;
  private static final SubLSymbol $kw279$EL_FORMULA;
  private static final SubLSymbol $kw280$NULL_FORMULA;
  private static final SubLString $str281$Formula_invalid_;
  private static final SubLString $str282$Formula_wasn_t_changed_;
  private static final SubLSymbol $kw283$CANCEL;
  private static final SubLSymbol $kw284$TABLE_INFO;
  private static final SubLString $str285$Select_Database_Tables_to_Decode_;
  private static final SubLString $str286$__;
  private static final SubLList $list287;
  private static final SubLSymbol $sym288$STRING_;
  private static final SubLSymbol $sym289$FIRST;
  private static final SubLString $str290$Schema_;
  private static final SubLString $str291$__;
  private static final SubLString $str292$Show;
  private static final SubLString $str293$Hide;
  private static final SubLSymbol $kw294$INVISIBLE;
  private static final SubLSymbol $kw295$PARAGRAPH;
  private static final SubLString $str296$Table_Name;
  private static final SubLString $str297$Physical_Schemata;
  private static final SubLSymbol $kw298$DECODE;
  private static final SubLSymbol $sym299$SKS_P;
  private static final SubLObject $const300$sksSourceDescriptionMt;
  private static final SubLObject $const301$MappingMtFn;
  private static final SubLObject $const302$SKSISourceDescriptionMicrotheory;
  private static final SubLObject $const303$genlMt;
  private static final SubLString $str304$_KS;
  private static final SubLString $str305$PhysicalSchemaMt;
  private static final SubLObject $const306$SKSIPhysicalSchemaDescriptionMicr;
  private static final SubLObject $const307$sksLogicalSchemaDescriptionMt;
  private static final SubLObject $const308$sksSchemaTranslationMt;
  private static final SubLObject $const309$contentMt;
  private static final SubLObject $const310$bridgingMtForKS;
  private static final SubLSymbol $sym311$HLMT_P;
  private static final SubLSymbol $sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__;
  private static final SubLString $str313$SMT_invariant_broken___A_is_not_a;
  private static final SubLSymbol $sym314$SKSI_SOURCE_DESCRIPTION_P;
  private static final SubLSymbol $sym315$SKSI_PHYSICAL_SCHEMABASE_P;
  private static final SubLSymbol $sym316$SKSI_PHYSICAL_SCHEMA_P;
  private static final SubLObject $const317$schemaFieldNameList;
  private static final SubLSymbol $sym318$SKSI_PHYSICAL_FIELD_P;
  private static final SubLObject $const319$fieldName_SKS;
  private static final SubLObject $const320$fieldDataType;
  private static final SubLObject $const321$nonNullFields;
  private static final SubLObject $const322$defaultFieldValue;
  private static final SubLObject $const323$primaryKey;
  private static final SubLList $list324;
  private static final SubLString $str325$Incapable_of_dealing_with_structu;
  private static final SubLSymbol $sym326$SKSI_PF_GET_NAME;
  private static final SubLSymbol $kw327$PRIMARY;
  private static final SubLSymbol $kw328$NONE;
  private static final SubLObject $const329$SKSILogicalSchemaDescriptionMicro;
  private static final SubLString $str330$LogicalSchemaMt;
  private static final SubLSymbol $sym331$SKSI_LOGICAL_SCHEMABASE_P;
  private static final SubLString $str332$_LS_;
  private static final SubLObject $const333$ObjectDefiningSchema;
  private static final SubLObject $const334$definingMt;
  private static final SubLObject $const335$schemaIsa;
  private static final SubLSymbol $sym336$SKSI_LOGICAL_SCHEMA_P;
  private static final SubLObject $const337$logicalFields;
  private static final SubLSymbol $sym338$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const339$EverythingPSC;
  private static final SubLSymbol $sym340$_SKSI_ISG_;
  private static final SubLString $str341$_LF_;
  private static final SubLObject $const342$quotedIsa;
  private static final SubLObject $const343$IndexicalConcept;
  private static final SubLSymbol $sym344$SKSI_LOGICAL_FIELD_P;
  private static final SubLObject $const345$fieldGenls;
  private static final SubLSymbol $sym346$SKSI_MEANING_SENTENCE_P;
  private static final SubLObject $const347$SKSISchemaTranslationMicrotheory;
  private static final SubLString $str348$TranslationSchemaMt;
  private static final SubLSymbol $sym349$SKSI_TRANSLATION_SCHEMABASE_P;
  private static final SubLSymbol $sym350$DECODE_PHYSICAL_STRUCTURE_OF_SKS;
  private static final SubLSymbol $sym351$NEW_STRUCTURED_KNOWLEDGE_SOURCE;
  private static final SubLObject $const352$ContentMtFn;
  private static final SubLObject $const353$Database_Physical;
  private static final SubLObject $const354$BridgingMtForKSFn;
  private static final SubLObject $const355$SKSIVocabularyMt;
  private static final SubLSymbol $sym356$NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA;
  private static final SubLString $str357$_CMLS;
  private static final SubLList $list358;
  private static final SubLSymbol $sym359$SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES;
  private static final SubLSymbol $sym360$HL_PROTOTYPICAL_INSTANCE_;
  private static final SubLObject $const361$SKSISchemaDescriptionMicrotheory;
  private static final SubLSymbol $sym362$GENERALITY_ESTIMATE_;
  private static final SubLObject $const363$subKS_Direct;
  private static final SubLObject $const364$physicalSchemaSourceMap;
  private static final SubLObject $const365$physicalFields;
  private static final SubLSymbol $sym366$APPEND;
  private static final SubLObject $const367$enumerableSchema;
  private static final SubLSymbol $sym368$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw369$GAF;
  private static final SubLSymbol $kw370$TRUE;
  private static final SubLSymbol $kw371$FALSE;
  private static final SubLSymbol $sym372$SKSI_PSB_GET_LABELED_SCHEMATA;
  private static final SubLObject $const373$schemaName_SKS;
  private static final SubLObject $const374$schemaNameSchema_SKS;
  private static final SubLList $list375;
  private static final SubLSymbol $sym376$FORT_NAME_;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 879L)
  public static SubLObject cb_link_edit_in_smt(final SubLObject index_hook, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $allow_smt_editing_links$.getDynamicValue( thread ) )
    {
      if( NIL == linktext )
      {
        linktext = $str0$_Edit_in_SMT_;
      }
      final SubLObject href = Sequences.cconcatenate( $str1$http___, new SubLObject[] { format_nil.format_nil_a_no_copy( web_utilities.effective_servlet_container_host() ), $str2$_, format_nil.format_nil_a_no_copy(
          web_utilities.effective_servlet_container_port() ), $str3$_SchemaModelingTool__sksName_, format_nil.format_nil_a_no_copy( cycl_utilities.denotational_term_name( index_hook ) ), $str4$_cyc_server_, format_nil
              .format_nil_a_no_copy( misc_utilities.hostname() ), $str2$_, format_nil.format_nil_a_no_copy( system_parameters.$base_tcp_port$.getDynamicValue( thread ) ), $str5$_cyc_defaultCyclist_, format_nil
                  .format_nil_a_no_copy( cycl_utilities.denotational_term_name( operation_communication.the_cyclist() ) )
      } );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str6$Will_open_in_new_browser_window );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str7$_blank );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( linktext );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    return index_hook;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 1524L)
  public static SubLObject smt_edit_button(final SubLObject sks, SubLObject button_text)
  {
    if( button_text == UNPROVIDED )
    {
      button_text = $str10$Edit;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject href = Sequences.cconcatenate( $str1$http___, new SubLObject[] { format_nil.format_nil_a_no_copy( web_utilities.effective_servlet_container_host() ), $str2$_, format_nil.format_nil_a_no_copy(
        web_utilities.effective_servlet_container_port() ), $str3$_SchemaModelingTool__sksName_, format_nil.format_nil_a_no_copy( cycl_utilities.denotational_term_name( sks ) ), $str4$_cyc_server_, format_nil
            .format_nil_a_no_copy( misc_utilities.hostname() ), $str2$_, format_nil.format_nil_a_no_copy( system_parameters.$base_tcp_port$.getDynamicValue( thread ) ), $str5$_cyc_defaultCyclist_, format_nil
                .format_nil_a_no_copy( cycl_utilities.denotational_term_name( operation_communication.the_cyclist() ) )
    } );
    final SubLObject onclick = Sequences.cconcatenate( $str11$window_open__, new SubLObject[] { format_nil.format_nil_a_no_copy( href ), $str12$___
    } );
    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $kw13$BUTTON );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != button_text )
    {
      html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_princ( button_text );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != onclick )
    {
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( onclick );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 2057L)
  public static SubLObject cb_link_smt(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str14$CMT;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw15$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str16$sksi_smt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 2294L)
  public static SubLObject sksi_smt(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    sksi_smt_int( arghash );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 2429L)
  public static SubLObject sksi_smt_int(SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != html_arghash.arghash_p( arghash ) : arghash;
    SubLObject button_clickedP = NIL;
    SubLObject cdolist_list_var = html_arghash.get_arghash_keys( arghash );
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( key.isCons() )
      {
        final SubLObject command_key = key.first();
        final SubLObject command_args = key.rest();
        final SubLObject command_to_key = Symbols.make_keyword( string_utilities.replace_substring_once( string_utilities.string_from_keyword( command_key ), $str24$COMMAND, $str25$TO, UNPROVIDED ) );
        button_clickedP = command_key;
        SubLObject remainder;
        SubLObject arghash_key;
        SubLObject arghash_value;
        for( remainder = NIL, remainder = command_args; NIL != remainder; remainder = conses_high.cddr( remainder ) )
        {
          arghash_key = remainder.first();
          arghash_value = conses_high.cadr( remainder );
          html_arghash.set_arghash_value( arghash_key, arghash, arghash_value );
        }
        html_arghash.set_arghash_value( command_to_key, arghash, T );
        html_arghash.rem_arghash_value( key, arghash );
      }
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    if( NIL != html_arghash.get_arghash_value( $kw26$ON_EDIT_SKS, arghash ) )
    {
      arghash = sksi_smt_edit_sks_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw27$ON_EDIT_SD, arghash ) )
    {
      arghash = sksi_smt_edit_sd_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw28$ON_EDIT_PS, arghash ) )
    {
      arghash = sksi_smt_edit_ps_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw29$ON_EDIT_LS, arghash ) )
    {
      arghash = sksi_smt_edit_ls_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw30$ON_EDIT_LF, arghash ) )
    {
      arghash = sksi_smt_edit_lf_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw31$ON_EDIT_MS, arghash ) )
    {
      arghash = sksi_smt_edit_ms_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw32$ON_DECODE_PSB, arghash ) )
    {
      arghash = sksi_smt_decode_psb_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw33$ON_EDIT_TS, arghash ) )
    {
      arghash = sksi_smt_edit_ts_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw34$ON_EDIT_T, arghash ) )
    {
      arghash = sksi_smt_edit_t_actions( arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw35$ON_MAIN, arghash ) )
    {
      arghash = sksi_smt_main_actions( arghash );
    }
    html_utilities.html_markup( $str36$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str37$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw38$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw39$CB_CYC );
      sksi_smt_macros.sksi_smt_html_title( $str20$Schema_Modeling_Tool );
      html_complete.html_complete_script();
      dhtml_macros.dhtml_with_dom_script();
      dhtml_macros.dhtml_with_toggle_visibility_support();
      dhtml_macros.html_basic_cb_scripts();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str40$cg_sksi_smt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str20$Schema_Modeling_Tool );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str41$post );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str16$sksi_smt, T, UNPROVIDED );
            SubLObject fort_selectedP = NIL;
            final SubLObject fort = html_arghash.get_arghash_value( $kw42$JUST_FORT, arghash );
            if( NIL != forts.fort_p( fort ) )
            {
              fort_selectedP = fort;
              if( NIL != isa.isa_in_any_mtP( fort, $const43$StructuredKnowledgeSource ) )
              {
                html_arghash.set_arghash_value( $kw44$SKS, arghash, fort );
                html_arghash.set_arghash_value( $kw45$TO_EDIT_SKS, arghash, T );
              }
              else if( NIL != isa.isa_in_any_mtP( fort, $const46$PhysicalSchema ) )
              {
                html_arghash.set_arghash_value( $kw47$PS, arghash, fort );
                html_arghash.set_arghash_value( $kw48$TO_EDIT_PS, arghash, T );
              }
              else if( NIL != isa.isa_in_any_mtP( fort, $const49$LogicalSchema ) )
              {
                html_arghash.set_arghash_value( $kw50$LS, arghash, fort );
                html_arghash.set_arghash_value( $kw51$TO_EDIT_LS, arghash, T );
              }
              else if( NIL != isa.isa_in_any_mtP( fort, $const52$PhysicalField ) )
              {
                html_arghash.set_arghash_value( $kw53$PF, arghash, fort );
                html_arghash.set_arghash_value( $kw54$TO_EDIT_PF, arghash, T );
              }
              else if( NIL != isa.isa_in_any_mtP( fort, $const55$LogicalField ) )
              {
                html_arghash.set_arghash_value( $kw56$LF, arghash, fort );
                html_arghash.set_arghash_value( $kw57$TO_EDIT_LF, arghash, T );
              }
              else
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str58$Error__Support_for_term_ );
                  sksi_form( fort );
                  html_utilities.html_princ( $str59$_not_implemented );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
            }
            html_arghash.rem_arghash_value( $kw42$JUST_FORT, arghash );
            SubLObject cdolist_list_var2 = html_arghash.get_arghash_value_list( $kw60$ERROR, arghash );
            SubLObject error = NIL;
            error = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              html_arghash.rem_arghash_value( $kw60$ERROR, arghash );
              html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str61$Error__ );
                Functions.apply( $sym62$FORMAT, ConsesLow.cons( html_macros.$html_stream$.getDynamicValue( thread ), error ) );
                html_utilities.html_newline( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              cdolist_list_var2 = cdolist_list_var2.rest();
              error = cdolist_list_var2.first();
            }
            cdolist_list_var2 = html_arghash.get_arghash_value_list( $kw63$SUCCESS, arghash );
            SubLObject success = NIL;
            success = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              html_arghash.rem_arghash_value( $kw63$SUCCESS, arghash );
              html_utilities.html_princ( $str64$Success__ );
              Functions.apply( $sym62$FORMAT, ConsesLow.cons( html_macros.$html_stream$.getDynamicValue( thread ), success ) );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var2 = cdolist_list_var2.rest();
              success = cdolist_list_var2.first();
            }
            if( NIL != html_arghash.get_arghash_value( $kw45$TO_EDIT_SKS, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw45$TO_EDIT_SKS, arghash );
              sksi_smt_edit_sks_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw65$TO_EDIT_SD, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw65$TO_EDIT_SD, arghash );
              sksi_smt_edit_sd_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw48$TO_EDIT_PS, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw48$TO_EDIT_PS, arghash );
              sksi_smt_edit_ps_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw51$TO_EDIT_LS, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw51$TO_EDIT_LS, arghash );
              sksi_smt_edit_ls_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw57$TO_EDIT_LF, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw57$TO_EDIT_LF, arghash );
              sksi_smt_edit_lf_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw66$TO_EDIT_MS, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw66$TO_EDIT_MS, arghash );
              sksi_smt_edit_ms_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw67$TO_EDIT_TS, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw67$TO_EDIT_TS, arghash );
              sksi_smt_edit_ts_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw68$TO_EDIT_T, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw68$TO_EDIT_T, arghash );
              sksi_smt_edit_t_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw69$TO_MAIN, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw69$TO_MAIN, arghash );
              sksi_smt_main_page( arghash );
            }
            else if( NIL != html_arghash.get_arghash_value( $kw70$TO_DECODE_PSB, arghash ) )
            {
              html_arghash.rem_arghash_value( $kw70$TO_DECODE_PSB, arghash );
              sksi_smt_decode_psb_page( arghash );
            }
            else
            {
              if( NIL != button_clickedP )
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str71$Error__button_ );
                  html_utilities.html_princ( button_clickedP );
                  html_utilities.html_princ( $str59$_not_implemented );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              if( NIL != html_arghash.get_arghash_value( $kw26$ON_EDIT_SKS, arghash ) )
              {
                sksi_smt_edit_sks_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw27$ON_EDIT_SD, arghash ) )
              {
                sksi_smt_edit_sd_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw28$ON_EDIT_PS, arghash ) )
              {
                sksi_smt_edit_ps_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw29$ON_EDIT_LS, arghash ) )
              {
                sksi_smt_edit_ls_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw30$ON_EDIT_LF, arghash ) )
              {
                sksi_smt_edit_lf_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw31$ON_EDIT_MS, arghash ) )
              {
                sksi_smt_edit_ms_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw33$ON_EDIT_TS, arghash ) )
              {
                sksi_smt_edit_ts_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw34$ON_EDIT_T, arghash ) )
              {
                sksi_smt_edit_t_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw35$ON_MAIN, arghash ) )
              {
                sksi_smt_main_page( arghash );
              }
              else if( NIL != html_arghash.get_arghash_value( $kw32$ON_DECODE_PSB, arghash ) )
              {
                sksi_smt_decode_psb_page( arghash );
              }
              else
              {
                if( NIL != fort_selectedP )
                {
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                  {
                    html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str72$Error__fort_type_for_ );
                    sksi_form( html_arghash.get_arghash_value( $kw42$JUST_FORT, arghash ) );
                    html_utilities.html_princ( $str73$_not_supported );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                }
                sksi_smt_main_page( arghash );
              }
            }
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 8627L)
  public static SubLObject sksi_smt_main_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw35$ON_MAIN, T, UNPROVIDED );
    final SubLObject skss = sksi_sks_accessors.get_all_skss();
    final SubLObject sdss = get_all_sds();
    final SubLObject psbs = get_all_psbs();
    final SubLObject lsbs = get_all_lsbs();
    final SubLObject tsbs = get_all_tsbs();
    SubLObject used_sds = NIL;
    SubLObject used_psbs = NIL;
    SubLObject used_lsbs = NIL;
    SubLObject used_tsbs = NIL;
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( SIX_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str74$Create_new_SKS_named__ );
          html_arghash.html_arghash_text_input( arghash, $kw75$NEW_SKS_NAME, NIL, $int76$40, UNPROVIDED );
          html_arghash.html_arghash_submit_input( arghash, $str77$Create, ConsesLow.list( $kw78$COMMAND_EDIT_SKS, T ), UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str79$Knowledge_Source_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      SubLObject cdolist_list_var = skss;
      SubLObject sks = NIL;
      sks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sd = sks_get_source_description_mt( sks );
        final SubLObject psb = sks_get_physical_schemabase_mt( sks );
        final SubLObject lsb = sks_get_logical_schemabase_mt( sks );
        final SubLObject tsb = sks_get_translation_schemabase_mt( sks );
        SubLObject item_var = sd;
        if( NIL == conses_high.member( item_var, used_sds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          used_sds = ConsesLow.cons( item_var, used_sds );
        }
        item_var = psb;
        if( NIL == conses_high.member( item_var, used_psbs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          used_psbs = ConsesLow.cons( item_var, used_psbs );
        }
        item_var = lsb;
        if( NIL == conses_high.member( item_var, used_lsbs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          used_lsbs = ConsesLow.cons( item_var, used_lsbs );
        }
        item_var = tsb;
        if( NIL == conses_high.member( item_var, used_tsbs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          used_tsbs = ConsesLow.cons( item_var, used_tsbs );
        }
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw81$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != sks )
            {
              sksi_form( sks );
            }
            else
            {
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != sks )
            {
              if( NIL != $allow_smt_editing_links$.getDynamicValue( thread ) )
              {
                smt_edit_button( sks, UNPROVIDED );
              }
              else
              {
                html_arghash.html_arghash_submit_input( arghash, $str10$Edit, ConsesLow.list( $kw78$COMMAND_EDIT_SKS, $kw44$SKS, sks ), UNPROVIDED );
              }
            }
            else
            {
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != sd )
            {
              html_utilities.html_princ( $str82$Source_Description__ );
              sksi_arghash_form( arghash, sd );
              html_utilities.html_newline( UNPROVIDED );
            }
            if( NIL != psb )
            {
              html_utilities.html_princ( $str83$Physical_Schemabase__ );
              sksi_arghash_form( arghash, psb );
              html_utilities.html_newline( UNPROVIDED );
            }
            if( NIL != lsb )
            {
              html_utilities.html_princ( $str84$Logical_Schemabase__ );
              sksi_arghash_form( arghash, lsb );
              html_utilities.html_newline( UNPROVIDED );
            }
            if( NIL != tsb )
            {
              html_utilities.html_princ( $str85$Translation_Schemabase__ );
              sksi_arghash_form( arghash, tsb );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        sks = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    final SubLObject other_psbs = conses_high.set_difference( psbs, used_psbs, UNPROVIDED, UNPROVIDED );
    if( NIL != other_psbs )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str86$Other_Physical_Schemabases_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var2 = other_psbs;
        SubLObject psb2 = NIL;
        psb2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != psb2 )
              {
                sksi_arghash_form( arghash, psb2 );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          psb2 = cdolist_list_var2.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    final SubLObject other_lsbs = conses_high.set_difference( lsbs, used_lsbs, UNPROVIDED, UNPROVIDED );
    if( NIL != other_lsbs )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str87$Other_Logical_Schemabases_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var2 = other_lsbs;
        SubLObject lsb2 = NIL;
        lsb2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != lsb2 )
              {
                sksi_arghash_form( arghash, lsb2 );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          lsb2 = cdolist_list_var2.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    final SubLObject other_tsbs = conses_high.set_difference( tsbs, used_tsbs, UNPROVIDED, UNPROVIDED );
    if( NIL != other_tsbs )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str88$Other_Translations_Schemabases_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var2 = other_tsbs;
        SubLObject tsb2 = NIL;
        tsb2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != tsb2 )
              {
                sksi_arghash_form( arghash, tsb2 );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          tsb2 = cdolist_list_var2.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 11758L)
  public static SubLObject sksi_smt_main_actions(final SubLObject arghash)
  {
    if( NIL != html_arghash.get_arghash_value( $kw45$TO_EDIT_SKS, arghash ) )
    {
      SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
      if( NIL == sks )
      {
        final SubLObject new_sks_name = html_arghash.get_arghash_value( $kw75$NEW_SKS_NAME, arghash );
        html_arghash.rem_arghash_value( $kw75$NEW_SKS_NAME, arghash );
        if( NIL != string_utilities.empty_stringP( new_sks_name ) )
        {
          html_arghash.push_arghash_value( $kw60$ERROR, ConsesLow.list( $kw60$ERROR, $str89$Please_enter_an_SKS_name_ ), arghash );
          html_arghash.rem_arghash_value( $kw45$TO_EDIT_SKS, arghash );
          html_arghash.set_arghash_value( $kw69$TO_MAIN, arghash, T );
        }
        else
        {
          sks = sksi_sks_accessors.new_sks_complex( new_sks_name, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          sks_new_sd( sks );
          html_arghash.set_arghash_value( $kw44$SKS, arghash, sks );
        }
      }
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 12402L)
  public static SubLObject sksi_smt_edit_sks_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw26$ON_EDIT_SKS, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, UNPROVIDED, UNPROVIDED );
    final SubLObject sd = sks_get_source_description_mt( sks );
    final SubLObject psb = sks_get_physical_schemabase_mt( sks );
    final SubLObject lsb = sks_get_logical_schemabase_mt( sks );
    final SubLObject tsb = sks_get_translation_schemabase_mt( sks );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    html_utilities.html_princ( $str90$Edit_SKS__ );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    sksi_form( sks );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    sksi_smt_html_sks_status_line( sks );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    html_utilities.html_princ( $str91$Name__ );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    html_arghash.html_arghash_text_input( arghash, $kw92$SKS_NAMESTRING, sksi_sks_accessors.sks_get_name( sks, $const93$nameString ), $int94$80, UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw95$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str82$Source_Description__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != sd )
          {
            sksi_arghash_form( arghash, sd );
          }
          else
          {
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != sd )
          {
            smt_edit_button( sks, UNPROVIDED );
          }
          else
          {
            html_arghash.html_arghash_submit_input( arghash, $str96$Add, ConsesLow.list( $kw97$COMMAND_EDIT_SD, $kw44$SKS, sks ), UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw95$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str83$Physical_Schemabase__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != psb )
          {
            sksi_arghash_form( arghash, psb );
          }
          else
          {
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != sksi_infrastructure_utilities.sk_source_accessibleP( sks, sksi_sd_get_mt( sd ) ) )
          {
            html_arghash.html_arghash_submit_input( arghash, $str98$Decode, ConsesLow.list( $kw78$COMMAND_EDIT_SKS, $kw44$SKS, sks, $kw99$DECODE_PSB, T ), UNPROVIDED );
          }
          if( NIL != psb )
          {
            html_arghash.html_arghash_submit_input( arghash, $str100$Remove, ConsesLow.list( $kw78$COMMAND_EDIT_SKS, $kw44$SKS, sks, $kw101$REMOVE_PSB, T ), UNPROVIDED );
          }
          html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw95$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str84$Logical_Schemabase__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != lsb )
          {
            sksi_arghash_form( arghash, lsb );
          }
          else
          {
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != lsb )
          {
            html_arghash.html_arghash_submit_input( arghash, $str100$Remove, ConsesLow.list( $kw102$COMMAND_REMOVE_LSB, $kw44$SKS, sks, $kw103$LSB, lsb ), UNPROVIDED );
          }
          else
          {
            html_arghash.html_arghash_submit_input( arghash, $str77$Create, ConsesLow.list( $kw104$COMMAND_EDIT_LSB, $kw44$SKS, sks ), UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw95$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str85$Translation_Schemabase__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != tsb )
          {
            sksi_arghash_form( arghash, tsb );
          }
          else
          {
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != tsb )
          {
            html_arghash.html_arghash_submit_input( arghash, $str100$Remove, ConsesLow.list( $kw105$COMMAND_REMOVE_TSB, $kw44$SKS, sks, $kw106$TSB, tsb ), UNPROVIDED );
          }
          else
          {
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( TWO_INTEGER );
    sksi_smt_edit_sks_page_main_table( arghash, sks, sd, psb, lsb, tsb );
    html_utilities.html_newline( TWO_INTEGER );
    html_arghash.html_arghash_submit_input( arghash, $str107$Refresh, $kw108$REFRESH, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str109$OK, $kw110$OK, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str111$Cancel, $kw69$TO_MAIN, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 15805L)
  public static SubLObject sksi_smt_edit_sks_page_main_table(final SubLObject arghash, final SubLObject sks, SubLObject sd, SubLObject psb, SubLObject lsb, SubLObject tsb)
  {
    if( sd == UNPROVIDED )
    {
      sd = NIL;
    }
    if( psb == UNPROVIDED )
    {
      psb = NIL;
    }
    if( lsb == UNPROVIDED )
    {
      lsb = NIL;
    }
    if( tsb == UNPROVIDED )
    {
      tsb = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject physical_schemata = ( NIL != psb ) ? sksi_psb_get_schemata( psb ) : NIL;
    SubLObject logical_schemata = ( NIL != lsb ) ? sksi_lsb_get_schemata( lsb ) : NIL;
    final SubLObject translations = ( NIL != tsb ) ? sksi_tsb_get_translation_pairs( tsb ) : NIL;
    if( NIL != physical_schemata || NIL != logical_schemata || NIL != translations )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ONE_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $kw112$LEFT );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str113$Physical_Schemata_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str114$Logical_Schemata_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str115$Translations_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject ps = NIL;
        ps = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject ls = list_utilities.alist_lookup( translations, ps, UNPROVIDED, UNPROVIDED ).first();
          if( NIL != ls )
          {
            logical_schemata = Sequences.remove( ls, logical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $kw112$LEFT );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_arghash_form( arghash, ps );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_arghash.html_arghash_submit_input( arghash, $str116$View, ConsesLow.list( $kw117$COMMAND_EDIT_PS, $kw44$SKS, sks, $kw47$PS, ps ), UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != ls )
              {
                sksi_arghash_form( arghash, ls );
              }
              else
              {
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != ls )
              {
                html_arghash.html_arghash_submit_input( arghash, $str10$Edit, ConsesLow.list( $kw118$COMMAND_EDIT_LS, $kw44$SKS, sks, $kw50$LS, ls ), UNPROVIDED );
              }
              else
              {
                html_arghash.html_arghash_submit_input( arghash, $str77$Create, ConsesLow.list( $kw118$COMMAND_EDIT_LS, $kw44$SKS, sks, $kw47$PS, ps ), UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw95$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != ls )
              {
                html_arghash.html_arghash_submit_input( arghash, $str10$Edit, ConsesLow.list( $kw119$COMMAND_EDIT_TS, $kw44$SKS, sks, $kw47$PS, ps, $kw50$LS, ls ), UNPROVIDED );
              }
              else
              {
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          ps = cdolist_list_var.first();
        }
        cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $kw112$LEFT );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_arghash_form( arghash, logical_schema );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          logical_schema = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 17927L)
  public static SubLObject sksi_smt_edit_sks_actions(final SubLObject arghash)
  {
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject new_sks_namestring = html_arghash.get_arghash_value( $kw92$SKS_NAMESTRING, arghash );
    if( !sksi_sks_accessors.sks_get_name( sks, $const93$nameString ).equal( new_sks_namestring ) )
    {
      sksi_sks_accessors.sks_fset( sks, $const93$nameString, new_sks_namestring, UNPROVIDED );
    }
    if( NIL != html_arghash.get_arghash_value( $kw101$REMOVE_PSB, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw101$REMOVE_PSB, arghash );
      sksi_sks_accessors.sks_fset( sks, $const120$sksPhysicalSchemaDescriptionMt, NIL, $const121$UniversalVocabularyMt );
    }
    if( NIL != html_arghash.get_arghash_value( $kw99$DECODE_PSB, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw99$DECODE_PSB, arghash );
      html_arghash.rem_arghash_value( $kw26$ON_EDIT_SKS, arghash );
      html_arghash.rem_arghash_value( $kw45$TO_EDIT_SKS, arghash );
      html_arghash.rem_arghash_value( $kw69$TO_MAIN, arghash );
      html_arghash.set_arghash_value( $kw70$TO_DECODE_PSB, arghash, T );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw108$REFRESH, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw108$REFRESH, arghash );
      html_arghash.set_arghash_value( $kw45$TO_EDIT_SKS, arghash, T );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw110$OK, arghash );
      html_arghash.rem_arghash_value( $kw26$ON_EDIT_SKS, arghash );
      html_arghash.set_arghash_value( $kw69$TO_MAIN, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 19782L)
  public static SubLObject sksi_smt_html_sks_status_line(final SubLObject sks)
  {
    final SubLObject sd = sks_get_sd( sks );
    final SubLObject sd_mt = sksi_sd_get_mt( sd );
    html_utilities.html_princ( $str123$This_SKS_is_currently_ );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    if( NIL != sksi_infrastructure_utilities.sk_source_accessibleP( sks, sd_mt ) )
    {
      html_utilities.html_princ( $str124$accessible );
    }
    else
    {
      html_utilities.html_princ( $str125$not_accessible );
    }
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    html_utilities.html_princ( $str126$_ );
    html_utilities.html_newline( TWO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 20257L)
  public static SubLObject sksi_smt_edit_sd_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw27$ON_EDIT_SD, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject sd = html_arghash.get_arghash_value( $kw127$SD, arghash );
    final SubLObject sd_mt = sksi_sd_get_mt( sd );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, UNPROVIDED, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw127$SD, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str128$Edit_Source_Description__ );
    sksi_form( sks );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    sksi_smt_html_sks_status_line( sks );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str129$Parameter );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str130$Value );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      SubLObject remainder;
      SubLObject predicate;
      SubLObject type;
      SubLObject _prev_bind_0_$68;
      SubLObject _prev_bind_0_$69;
      SubLObject _prev_bind_0_$70;
      SubLObject key_string;
      SubLObject _prev_bind_0_$71;
      SubLObject value;
      SubLObject value_$72;
      SubLObject value_string;
      SubLObject value_string_$73;
      SubLObject selected;
      SubLObject value_string_$74;
      SubLObject _prev_bind_0_$72;
      for( remainder = NIL, remainder = $sksi_smt_sd_parameters$.getGlobalValue(); NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        predicate = remainder.first();
        type = conses_high.cadr( remainder );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            sksi_form( predicate );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != genls.genl_in_any_mtP( type, $const131$CharacterString ) )
            {
              html_arghash.html_arghash_text_input( arghash, predicate, sksi_sks_accessors.sks_fget( sks, predicate, sd_mt ), $int76$40, UNPROVIDED );
            }
            else if( NIL != genls.genl_in_any_mtP( type, $const132$Integer ) )
            {
              html_arghash.html_arghash_text_input( arghash, predicate, sksi_sks_accessors.sks_fget( sks, predicate, sd_mt ), $int76$40, $kw133$INTEGER );
            }
            else if( NIL != forts.fort_p( type ) )
            {
              html_arghash.set_arghash_value( predicate, arghash, sksi_sks_accessors.sks_fget( sks, predicate, sd_mt ) );
              key_string = html_arghash.arghash_make_key_string( predicate, $kw134$FORT );
              html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( key_string );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                value = NIL;
                value_$72 = NIL;
                value_string = NIL;
                value_string_$73 = NIL;
                value = isa.all_fort_instances_in_all_mts( type );
                value_$72 = value.first();
                value_string = Mapping.mapcar( $sym135$FORT_NAME, isa.all_fort_instances_in_all_mts( type ) );
                value_string_$73 = value_string.first();
                while ( NIL != value_string || NIL != value)
                {
                  selected = list_utilities.member_equalP( value_$72, html_arghash.get_arghash_value_list( predicate, arghash ) );
                  value_string_$74 = html_arghash.arghash_get_string( value_$72, $kw134$FORT );
                  html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                  if( NIL != selected )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  if( NIL != value_string_$74 )
                  {
                    html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( value_string_$74 );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( value_string_$73 );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                  value = value.rest();
                  value_$72 = value.first();
                  value_string = value_string.rest();
                  value_string_$73 = value_string.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
              }
              html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
            }
            else
            {
              html_utilities.html_princ( type );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str107$Refresh, $kw108$REFRESH, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str109$OK, $kw110$OK, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str111$Cancel, $kw45$TO_EDIT_SKS, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 22008L)
  public static SubLObject sksi_smt_edit_sd_actions(final SubLObject arghash)
  {
    if( NIL != html_arghash.get_arghash_value( $kw108$REFRESH, arghash ) || NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
      final SubLObject sd_mt = sks_get_source_description_mt( sks );
      SubLObject remainder;
      SubLObject predicate;
      SubLObject type;
      SubLObject current_value;
      SubLObject new_value;
      for( remainder = NIL, remainder = $sksi_smt_sd_parameters$.getGlobalValue(); NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        predicate = remainder.first();
        type = conses_high.cadr( remainder );
        current_value = sksi_sks_accessors.sks_fget( sks, predicate, sd_mt );
        new_value = html_arghash.get_arghash_value( predicate, arghash );
        html_arghash.rem_arghash_value( predicate, arghash );
        if( !current_value.equal( new_value ) )
        {
          sksi_sks_accessors.sks_fset( sks, predicate, new_value, sd_mt );
          html_arghash.push_arghash_value( $kw63$SUCCESS, ConsesLow.list( $str136$Changed__A__A_from__A_to__A, sks, predicate, current_value, new_value ), arghash );
        }
      }
    }
    if( NIL != html_arghash.get_arghash_value( $kw108$REFRESH, arghash ) )
    {
      html_arghash.set_arghash_value( $kw65$TO_EDIT_SD, arghash, T );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw27$ON_EDIT_SD, arghash );
      html_arghash.set_arghash_value( $kw45$TO_EDIT_SKS, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 22941L)
  public static SubLObject sksi_smt_update_source_description(final SubLObject sks, final SubLObject param_vals)
  {
    final SubLObject sd = sks_get_source_description_mt( sks );
    SubLObject cdolist_list_var = param_vals;
    SubLObject param_val = NIL;
    param_val = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = param_val;
      SubLObject predicate = NIL;
      SubLObject new_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
      predicate = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
      new_value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        sksi_sks_accessors.sks_fset( sks, predicate, new_value, sd );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list138 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      param_val = cdolist_list_var.first();
    }
    return sksi_smt_compile_source_description( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 23496L)
  public static SubLObject sksi_smt_compile_source_description(final SubLObject sks)
  {
    final SubLObject sd = sks_get_source_description_mt( sks );
    final SubLObject param_defs = sksi_smt_compile_param_definitions( $sksi_smt_sd_parameters$.getGlobalValue() );
    SubLObject param_vals = NIL;
    SubLObject cdolist_list_var = param_defs;
    SubLObject param_def = NIL;
    param_def = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = param_def;
      SubLObject predicate = NIL;
      SubLObject constraint = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
      predicate = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
      constraint = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject value = sksi_sks_accessors.sks_fget( sks, predicate, sd );
        param_vals = ConsesLow.cons( ConsesLow.list( predicate, constraint, value ), param_vals );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list140 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      param_def = cdolist_list_var.first();
    }
    return Sequences.nreverse( param_vals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
  public static SubLObject clear_sksi_smt_compile_param_definitions()
  {
    final SubLObject cs = $sksi_smt_compile_param_definitions_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
  public static SubLObject remove_sksi_smt_compile_param_definitions(final SubLObject plist)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sksi_smt_compile_param_definitions_caching_state$.getGlobalValue(), ConsesLow.list( plist ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
  public static SubLObject sksi_smt_compile_param_definitions_internal(final SubLObject plist)
  {
    SubLObject result = NIL;
    SubLObject remainder;
    SubLObject predicate;
    SubLObject constraint;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      predicate = remainder.first();
      constraint = conses_high.cadr( remainder );
      if( !predicate.eql( $const142$sksIsa ) )
      {
        if( predicate.eql( $const143$subProtocolForSKS ) )
        {
          constraint = sdbc.get_all_sdbc_database_sub_protocols();
        }
        else if( constraint.eql( $const144$SKSISupportedDatabaseServerProgra ) )
        {
          constraint = sksi_smt_get_available_database_types();
        }
        else if( !$const132$Integer.eql( constraint ) )
        {
          if( !$const131$CharacterString.eql( constraint ) )
          {
            Errors.error( $str145$Do_not_know_what_to_do_with_const, constraint );
          }
        }
      }
      if( !$const142$sksIsa.eql( predicate ) )
      {
        result = ConsesLow.cons( ConsesLow.list( predicate, constraint ), result );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
  public static SubLObject sksi_smt_compile_param_definitions(final SubLObject plist)
  {
    SubLObject caching_state = $sksi_smt_compile_param_definitions_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS, $sym146$_SKSI_SMT_COMPILE_PARAM_DEFINITIONS_CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          TWENTY_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, plist, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sksi_smt_compile_param_definitions_internal( plist ) ) );
      memoization_state.caching_state_put( caching_state, plist, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 25124L)
  public static SubLObject sksi_smt_register_structured_knowledge_source(final SubLObject sks)
  {
    enable_sksi_smt_mode();
    return Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sksi_sks_manager.register_sksi_removal_modules_for_skses( ConsesLow.list( sks ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 25372L)
  public static SubLObject sksi_smt_structured_knowledge_source_registeredP(final SubLObject sks)
  {
    return makeBoolean( $kw149$NOREG != sksi_sks_manager.sks_registration_state( sks ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 25561L)
  public static SubLObject sksi_ps_compile_pfs_info(final SubLObject ps)
  {
    final SubLObject pfs = sksi_ps_get_pfs( ps );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = pfs;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pf_name = sksi_pf_get_name( pf );
      final SubLObject pf_datatype = sksi_pf_get_datatype( pf );
      final SubLObject pf_nullable = sksi_pf_get_nullable( pf );
      final SubLObject pf_default_value = sksi_pf_get_default_value( pf );
      final SubLObject pf_key_type = sksi_pf_get_key_type( pf );
      result = ConsesLow.cons( ConsesLow.list( new SubLObject[] { $kw53$PF, pf, $kw151$NAME, pf_name, $kw152$DATATYPE, pf_datatype, $kw153$NULLABLE, pf_nullable, $kw154$KEY_TYPE, pf_key_type, $kw155$DEFAULT,
        pf_default_value
      } ), result );
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 26454L)
  public static SubLObject sksi_smt_edit_ps_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw28$ON_EDIT_PS, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject ps = html_arghash.get_arghash_value( $kw47$PS, arghash );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, sks, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw47$PS, ps, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str156$Edit_Physical_Schema__ );
    sksi_form( sks );
    html_utilities.html_princ( $str157$___ );
    sksi_arghash_form( arghash, ps );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject pfs = sksi_ps_get_pfs( ps );
    if( NIL != pfs )
    {
      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_utilities.html_princ( $str158$Physical_fields_ );
      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ONE_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str159$Name );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str160$Datatype );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str161$Nullable );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str162$Default_Value );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$76, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var = pfs;
        SubLObject pf = NIL;
        pf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pf_name = sksi_pf_get_name( pf );
          final SubLObject pf_datatype = sksi_pf_get_datatype( pf );
          final SubLObject pf_nullable = sksi_pf_get_nullable( pf );
          final SubLObject pf_default_value = sksi_pf_get_default_value( pf );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_form( pf );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_form( pf_name );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_form( pf_datatype );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_form( pf_nullable );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_form( pf_default_value );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          pf = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_princ( $str163$No_fields_in_this_physical_schema );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str109$OK, $kw110$OK, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 28162L)
  public static SubLObject sksi_smt_edit_ps_actions(final SubLObject arghash)
  {
    if( NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      html_arghash.set_arghash_value( $kw45$TO_EDIT_SKS, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 28320L)
  public static SubLObject sksi_smt_logical_field_values_for_logical_schema(final SubLObject ls, final SubLObject arg1_isa, final SubLObject arg2_isa)
  {
    final SubLObject lf1 = el_utilities.make_ternary_formula( $const164$TheLogicalFieldValueFn, ls, arg1_isa, ONE_INTEGER );
    final SubLObject arg2_num = arg1_isa.eql( arg2_isa ) ? TWO_INTEGER : ONE_INTEGER;
    return Values.values( lf1, el_utilities.make_ternary_formula( $const164$TheLogicalFieldValueFn, ls, arg2_isa, arg2_num ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 28716L)
  public static SubLObject sksi_smt_fetch_simple_logical_schemata(final SubLObject sks, final SubLObject ps)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sks_get_source_description_mt( sks );
    SubLObject lss = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym166$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mapping_mt, thread );
      lss = kb_mapping_utilities.pred_values( ps, $const167$logicalPhysicalSchemaMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return lss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 29089L)
  public static SubLObject sksi_smt_retrieve_simple_logical_schemata(final SubLObject sks, final SubLObject ps)
  {
    final SubLObject lss = sksi_smt_fetch_simple_logical_schemata( sks, ps );
    SubLObject schemata = NIL;
    SubLObject cdolist_list_var = lss;
    SubLObject ls = NIL;
    ls = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      schemata = ConsesLow.cons( ConsesLow.list( ls, sksi_smt_retrieve_simple_logical_schema( sks, ps, ls ) ), schemata );
      cdolist_list_var = cdolist_list_var.rest();
      ls = cdolist_list_var.first();
    }
    return Sequences.nreverse( schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 29640L)
  public static SubLObject sksi_smt_retrieve_simple_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject ls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate = NIL;
    SubLObject pf1 = NIL;
    SubLObject pf2 = NIL;
    SubLObject arg1_isa = NIL;
    SubLObject arg2_isa = NIL;
    SubLObject convert1 = NIL;
    SubLObject convert2 = NIL;
    final SubLObject mapping_mt = sks_get_source_description_mt( sks );
    final SubLObject coding_pairs = sksi_sks_get_translations( sks, ps, ls, mapping_mt );
    final SubLObject bridging_mt = sks_get_bridging_or_content_mt( sks );
    final SubLObject lfi_map = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject mss = sksi_ls_get_mss( ls );
    final SubLObject meaning_sentence_assertion = mss.first();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == assertion_handles.assertion_p( meaning_sentence_assertion ) )
    {
      Errors.error( $str170$Could_not_retrieve_meaning_senten, ls );
    }
    final SubLObject sentence = assertions_high.gaf_arg2( meaning_sentence_assertion );
    predicate = cycl_utilities.formula_operator( sentence );
    if( NIL != fort_types_interface.mtP( bridging_mt ) )
    {
      final SubLObject base_pred = ask_utilities.query_variable( $sym171$_BASE_PRED, ConsesLow.list( $const172$correspondingSKSIPredicate, $sym171$_BASE_PRED, predicate, ls ), bridging_mt, UNPROVIDED ).first();
      if( NIL != forts.fort_p( base_pred ) && NIL != fort_types_interface.predicate_p( base_pred ) )
      {
        predicate = base_pred;
      }
    }
    SubLObject list_var = NIL;
    SubLObject lfi = NIL;
    SubLObject index = NIL;
    list_var = cycl_utilities.formula_args( sentence, UNPROVIDED );
    lfi = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), lfi = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      final SubLObject el_lfi = cycl_utilities.hl_to_el( lfi );
      final SubLObject arg_isa = cycl_utilities.formula_arg( el_lfi, TWO_INTEGER, UNPROVIDED );
      map_utilities.map_put( lfi_map, lfi, index );
      final SubLObject pcase_var = index;
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        arg1_isa = arg_isa;
      }
      else if( pcase_var.eql( ONE_INTEGER ) )
      {
        arg2_isa = arg_isa;
      }
      else
      {
        Errors.error( $str173$Dont_support_more_than_binary_pre );
      }
    }
    SubLObject cdolist_list_var = coding_pairs;
    SubLObject coding_pair = NIL;
    coding_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = coding_pair;
      SubLObject encoding_ass = NIL;
      SubLObject decoding_ass = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
      encoding_ass = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
      decoding_ass = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sentence2 = fi.assertion_hl_formula( decoding_ass, UNPROVIDED );
        SubLObject current_$89;
        final SubLObject datum_$88 = current_$89 = sentence2;
        SubLObject pred = NIL;
        SubLObject ls_$90 = NIL;
        SubLObject lfi2 = NIL;
        SubLObject ps_$91 = NIL;
        SubLObject pfi_expr = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$89, datum_$88, $list175 );
        pred = current_$89.first();
        current_$89 = current_$89.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$89, datum_$88, $list175 );
        ls_$90 = current_$89.first();
        current_$89 = current_$89.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$89, datum_$88, $list175 );
        lfi2 = current_$89.first();
        current_$89 = current_$89.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$89, datum_$88, $list175 );
        ps_$91 = current_$89.first();
        current_$89 = current_$89.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$89, datum_$88, $list175 );
        pfi_expr = current_$89.first();
        current_$89 = current_$89.rest();
        if( NIL == current_$89 )
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$const176$fieldDecoding.eql( pred ) )
          {
            Errors.error( $str177$Expected___fieldDecoding_sentence, sentence2 );
          }
          final SubLObject field_index = map_utilities.map_get( lfi_map, lfi2, UNPROVIDED );
          thread.resetMultipleValues();
          final SubLObject pf3 = sksi_smt_unpack_decoding_conversion_expression( ps_$91, pfi_expr );
          final SubLObject conversion = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject pcase_var2 = field_index;
          if( pcase_var2.eql( ZERO_INTEGER ) )
          {
            pf1 = pf3;
            convert1 = conversion;
          }
          else if( pcase_var2.eql( ONE_INTEGER ) )
          {
            pf2 = pf3;
            convert2 = conversion;
          }
          else
          {
            Errors.error( $str173$Dont_support_more_than_binary_pre );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$88, $list175 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list174 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      coding_pair = cdolist_list_var.first();
    }
    return ConsesLow.list( $kw178$PREDICATE, predicate, $kw179$PF1, ConsesLow.list( $kw180$TERM, pf1, $kw181$ARG_ISA, arg1_isa, $kw182$CONVERT, convert1 ), $kw183$PF2, ConsesLow.list( $kw180$TERM, pf2, $kw181$ARG_ISA,
        arg2_isa, $kw182$CONVERT, convert2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 32990L)
  public static SubLObject sksi_smt_unpack_decoding_conversion_expression(final SubLObject ps, final SubLObject pfi_expr)
  {
    final SubLObject operator = cycl_utilities.formula_operator( pfi_expr );
    if( $const184$SchemaObjectFn.eql( operator ) )
    {
      final SubLObject cmls = cycl_utilities.formula_arg1( pfi_expr, UNPROVIDED );
      final SubLObject pfi = cycl_utilities.formula_arg2( pfi_expr, UNPROVIDED );
      return Values.values( sksi_smt_physical_field_for_pfi( pfi ), ConsesLow.list( $const185$SchemaObjectIDFn, cmls, $const186$TheTerm ) );
    }
    if( NIL != el_utilities.lambda_function_p( operator ) )
    {
      final SubLObject pfi2 = cycl_utilities.formula_arg1( pfi_expr, UNPROVIDED );
      SubLObject current;
      final SubLObject datum = current = operator;
      SubLObject lambda_operator = NIL;
      SubLObject var_list = NIL;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list187 );
      lambda_operator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list187 );
      var_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list187 );
      expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject var = var_list.first();
        final SubLObject conversion = list_utilities.tree_substitute( expression, var, $const186$TheTerm );
        return Values.values( sksi_smt_physical_field_for_pfi( pfi2 ), conversion );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list187 );
    }
    else
    {
      Errors.error( $str188$Do_not_know_how_to_unpack_decodin, pfi_expr );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34007L)
  public static SubLObject enable_sksi_smt_mode()
  {
    $sksi_smt_mode$.setGlobalValue( $kw189$ENABLED );
    return $sksi_smt_mode$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34139L)
  public static SubLObject disable_sksi_smt_mode()
  {
    $sksi_smt_mode$.setGlobalValue( $kw192$DISABLED );
    return $sksi_smt_mode$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34274L)
  public static SubLObject is_sksi_smt_mode_enabledP()
  {
    return Equality.eq( $kw189$ENABLED, $sksi_smt_mode$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34384L)
  public static SubLObject get_sksi_smt_mode()
  {
    return ( NIL != is_sksi_smt_mode_enabledP() ) ? $kw189$ENABLED : $kw192$DISABLED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34526L)
  public static SubLObject sksi_smt_get_units_of_measurement()
  {
    final SubLObject unit_map = quantities.get_interconvertible_units_of_measure( $sym196$SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN );
    final SubLObject unit_type_tuples = sksi_smt_get_rendering_tuples( map_utilities.map_keys( unit_map ) );
    SubLObject units_of_measurement = NIL;
    SubLObject cdolist_list_var = unit_type_tuples;
    SubLObject unit_type_tuple = NIL;
    unit_type_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject fort = unit_type_tuple.first();
      final SubLObject units = map_utilities.map_get( unit_map, fort, UNPROVIDED );
      final SubLObject units_tuples = sksi_smt_get_rendering_tuples( units );
      final SubLObject result = sksi_smt_assemble_units_result( unit_type_tuple, units_tuples );
      units_of_measurement = ConsesLow.cons( result, units_of_measurement );
      cdolist_list_var = cdolist_list_var.rest();
      unit_type_tuple = cdolist_list_var.first();
    }
    return Sequences.nreverse( units_of_measurement );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 35464L)
  public static SubLObject sksi_smt_assemble_units_result(final SubLObject header, final SubLObject tail)
  {
    return ConsesLow.cons( header, tail );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 35555L)
  public static SubLObject sksi_smt_uninteresting_units_filter_fn(final SubLObject fort)
  {
    return rkf_relevance_utilities.rkf_irrelevant_term( fort, $const197$InferencePSC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 35717L)
  public static SubLObject sksi_smt_get_rendering_tuples(final SubLObject v_forts)
  {
    final SubLObject renderings = api_widgets.convert_term_list_to_renderings_for_java( v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = renderings;
    SubLObject rendering = NIL;
    rendering = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = rendering;
      SubLObject string_spec = NIL;
      SubLObject fort = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
      string_spec = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
      fort = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject string = string_spec.first();
        results = ConsesLow.cons( ConsesLow.list( fort, string ), results );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list198 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rendering = cdolist_list_var.first();
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 36087L)
  public static SubLObject sksi_smt_derive_simple_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject relation, final SubLObject pf1, final SubLObject arg1_isa, final SubLObject convert1,
      final SubLObject pf2, final SubLObject arg2_isa, final SubLObject convert2, SubLObject use_original_predicateP)
  {
    if( use_original_predicateP == UNPROVIDED )
    {
      use_original_predicateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sks_get_source_description_mt( sks );
    final SubLObject bridging_mt = sks_get_bridging_or_content_mt( sks );
    final SubLObject col_name = sksi_smt_determine_dependent_colname( relation, pf1, pf2 );
    final SubLObject ls_name = Sequences.cconcatenate( string_utilities.post_remove( sksi_ps_get_name( ps ), $str200$_PS, UNPROVIDED ), new SubLObject[] { $str201$_, col_name, $str202$_LS
    } );
    SubLObject predicate = relation;
    final SubLObject ls = new_or_recycled_logical_schema( sks, ps, ls_name, constants_high.find_constant( ls_name ), UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject lfi1 = sksi_smt_logical_field_values_for_logical_schema( ls, arg1_isa, arg2_isa );
    final SubLObject lfi2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const203$logicalSchemaFieldTypeList, ls, el_utilities.make_binary_formula( $const204$TheList, arg1_isa, arg2_isa ) ), mapping_mt );
    if( NIL == use_original_predicateP )
    {
      predicate = sksi_smt_derive_indirecting_relation( ls, relation, arg1_isa, arg2_isa, bridging_mt );
    }
    final SubLObject sentence = el_utilities.make_binary_formula( predicate, lfi1, lfi2 );
    final SubLObject meaning_sentence = el_utilities.make_binary_formula( $const205$meaningSentenceOfSchema, ls, sentence );
    sksi_kb_accessors.sksi_assert_if_new( meaning_sentence, mapping_mt );
    SubLObject cdolist_list_var;
    final SubLObject tasks = cdolist_list_var = ConsesLow.list( ConsesLow.list( pf1, lfi1, convert1 ), ConsesLow.list( pf2, lfi2, convert2 ) );
    SubLObject task = NIL;
    task = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = task;
      SubLObject pf3 = NIL;
      SubLObject lfi3 = NIL;
      SubLObject convert3 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
      pf3 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
      lfi3 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list206 );
      convert3 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pfi = sksi_smt_physical_field_value_indexical_for_pf( pf3 );
        final SubLObject lf_conversion = sksi_smt_determine_lf_conversion( lfi3, convert3 );
        final SubLObject pf_conversion = sksi_smt_determine_pf_conversion( pfi, convert3 );
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_quaternary_formula( $const207$fieldEncoding, ps, pfi, ls, lf_conversion ), mapping_mt );
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_quaternary_formula( $const176$fieldDecoding, ls, lfi3, ps, pf_conversion ), mapping_mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list206 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      task = cdolist_list_var.first();
    }
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_unary_formula( $const208$sksRepresentationComplete, sks ), $const209$SKSIMt );
    sksi_smt_register_structured_knowledge_source( sks );
    return ls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 38905L)
  public static SubLObject sksi_smt_derive_indirecting_relation(final SubLObject ls, final SubLObject relation, final SubLObject arg1_isa, final SubLObject arg2_isa, final SubLObject bridging_mt)
  {
    final SubLObject pred_name = Sequences.cconcatenate( string_utilities.post_remove( string_utilities.uncapitalize_first( kb_paths.fort_name( ls ) ), $str202$_LS, UNPROVIDED ), $str210$_Pred );
    final SubLObject predicate = ke.ke_create_now( pred_name, UNPROVIDED );
    sksi_kb_accessors.sksi_assert( ConsesLow.listS( $const211$isa, predicate, $list212 ), $const121$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
    sksi_kb_accessors.sksi_assert( ConsesLow.list( $const213$termDependsOn, predicate, ls ), $const214$BaseKB, UNPROVIDED, UNPROVIDED );
    sksi_kb_accessors.sksi_assert( ConsesLow.list( $const215$arg1Isa, predicate, arg1_isa ), $const214$BaseKB, UNPROVIDED, UNPROVIDED );
    sksi_kb_accessors.sksi_assert( ConsesLow.list( $const216$arg2Isa, predicate, arg2_isa ), $const214$BaseKB, UNPROVIDED, UNPROVIDED );
    sksi_kb_accessors.sksi_assert( ConsesLow.list( $const217$backchainForbidden, predicate ), bridging_mt, UNPROVIDED, UNPROVIDED );
    if( NIL != constant_handles.valid_constant( $const172$correspondingSKSIPredicate, T ) )
    {
      sksi_kb_accessors.sksi_assert( ConsesLow.list( $const172$correspondingSKSIPredicate, relation, predicate, ls ), bridging_mt, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      sksi_kb_accessors.sksi_assert( ConsesLow.listS( $const211$isa, predicate, $list218 ), $const121$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
      sksi_kb_accessors.sksi_assert( ConsesLow.list( $const219$backchainRequired, relation ), bridging_mt, UNPROVIDED, UNPROVIDED );
      sksi_kb_accessors.sksi_assert( ConsesLow.list( $const220$implies, reader.bq_cons( predicate, $list221 ), reader.bq_cons( relation, $list221 ) ), bridging_mt, $kw155$DEFAULT, $kw222$BACKWARD );
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40072L)
  public static SubLObject sksi_smt_physical_field_value_indexical_for_pf(final SubLObject pf)
  {
    final SubLObject el_formula = narts_high.nart_el_formula( czer_main.canonicalize_term( pf, UNPROVIDED ) );
    final SubLObject args = cycl_utilities.formula_args( el_formula, UNPROVIDED );
    return czer_main.canonicalize_term( el_utilities.make_formula( $const223$ThePhysicalFieldValueFn, args, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40326L)
  public static SubLObject sksi_smt_physical_field_for_pfi(final SubLObject pfi)
  {
    final SubLObject el_formula = cycl_utilities.hl_to_el( czer_main.canonicalize_term( pfi, UNPROVIDED ) );
    final SubLObject args = cycl_utilities.formula_args( el_formula, UNPROVIDED );
    return czer_main.canonicalize_term( el_utilities.make_formula( $const224$PhysicalFieldFn, args, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40551L)
  public static SubLObject sksi_smt_determine_dependent_colname(final SubLObject relation, final SubLObject pf1, final SubLObject pf2)
  {
    return sksi_smt_column_or_fort_name( pf2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40760L)
  public static SubLObject sksi_smt_determine_lf_conversion(final SubLObject lfi, final SubLObject conversion)
  {
    final SubLObject operator = cycl_utilities.formula_operator( conversion );
    if( $const185$SchemaObjectIDFn.eql( operator ) )
    {
      return list_utilities.tree_substitute( conversion, $const186$TheTerm, lfi );
    }
    if( NIL != list_utilities.lengthE( conversion, TWO_INTEGER, UNPROVIDED ) && NIL != forts.fort_p( operator ) && $const186$TheTerm.eql( cycl_utilities.formula_arg1( conversion, UNPROVIDED ) ) )
    {
      return el_utilities.make_unary_formula( list_utilities.tree_substitute( $list225, $kw226$OPERATOR, operator ), lfi );
    }
    Errors.error( $str227$No_implementation_yet_for_LF_conv, conversion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 41468L)
  public static SubLObject sksi_smt_determine_pf_conversion(final SubLObject pfi, final SubLObject conversion)
  {
    final SubLObject operator = cycl_utilities.formula_operator( conversion );
    if( $const185$SchemaObjectIDFn.eql( operator ) )
    {
      return list_utilities.tree_substitute( list_utilities.tree_substitute( conversion, $const186$TheTerm, pfi ), $const185$SchemaObjectIDFn, $const184$SchemaObjectFn );
    }
    if( NIL != list_utilities.lengthE( conversion, TWO_INTEGER, UNPROVIDED ) && NIL != forts.fort_p( operator ) && $const186$TheTerm.eql( cycl_utilities.formula_arg1( conversion, UNPROVIDED ) ) )
    {
      return el_utilities.make_unary_formula( list_utilities.tree_substitute( $list228, $kw226$OPERATOR, operator ), pfi );
    }
    Errors.error( $str229$No_implementation_yet_for_PF_conv, conversion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
  public static SubLObject clear_sksi_smt_column_or_fort_name()
  {
    final SubLObject cs = $sksi_smt_column_or_fort_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
  public static SubLObject remove_sksi_smt_column_or_fort_name(final SubLObject v_object)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sksi_smt_column_or_fort_name_caching_state$.getGlobalValue(), ConsesLow.list( v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
  public static SubLObject sksi_smt_column_or_fort_name_internal(final SubLObject v_object)
  {
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      final SubLObject formula = narts_high.nart_el_formula( v_object );
      if( $const224$PhysicalFieldFn.eql( cycl_utilities.formula_operator( formula ) ) )
      {
        return cycl_utilities.formula_arg2( v_object, UNPROVIDED );
      }
    }
    return kb_paths.fort_name( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
  public static SubLObject sksi_smt_column_or_fort_name(final SubLObject v_object)
  {
    SubLObject caching_state = $sksi_smt_column_or_fort_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym230$SKSI_SMT_COLUMN_OR_FORT_NAME, $sym231$_SKSI_SMT_COLUMN_OR_FORT_NAME_CACHING_STATE_, NIL, EQL, ONE_INTEGER, $int232$200 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sksi_smt_column_or_fort_name_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42627L)
  public static SubLObject sksi_smt_edit_ls_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw29$ON_EDIT_LS, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject ps = html_arghash.get_arghash_value( $kw47$PS, arghash );
    final SubLObject ls = ( NIL != html_arghash.get_arghash_value( $kw50$LS, arghash ) ) ? html_arghash.get_arghash_value( $kw50$LS, arghash ) : new_logical_schema( sks, ps, UNPROVIDED, UNPROVIDED );
    final SubLObject lfs = sksi_ls_get_lfs( ls );
    final SubLObject mss = sksi_ls_get_mss( ls );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, sks, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw50$LS, ls, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str233$Edit_Logical_Schema__ );
    sksi_form( sks );
    html_utilities.html_princ( $str157$___ );
    sksi_arghash_form( arghash, ls );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    if( NIL != lfs )
    {
      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_utilities.html_princ( $str234$Logical_fields_ );
      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ONE_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$93, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str235$CycL );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$94, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str236$Field_isa );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$95, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str237$__user_MS_s );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$92, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject list_var = NIL;
        SubLObject lf = NIL;
        SubLObject counter = NIL;
        list_var = lfs;
        lf = list_var.first();
        for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), lf = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
        {
          final SubLObject lf_cycl = sksi_lf_get_cycl( lf );
          final SubLObject lf_isas = sksi_lf_get_isas( lf );
          SubLObject lf_ms_count = ZERO_INTEGER;
          SubLObject cdolist_list_var = mss;
          SubLObject ms = NIL;
          ms = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != sksi_ms_get_asserted( ms ) )
            {
              final SubLObject ms_cycl = sksi_ms_get_cycl( ms );
              if( NIL != subl_promotions.memberP( lf_cycl, ms_cycl, UNPROVIDED, UNPROVIDED ) )
              {
                lf_ms_count = Numbers.add( lf_ms_count, ONE_INTEGER );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ms = cdolist_list_var.first();
          }
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw81$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( counter.isZero() )
              {
                html_arghash.html_arghash_hidden_input( arghash, $kw238$ARG1, lf, UNPROVIDED );
              }
              else
              {
                html_arghash.html_arghash_checkbox_input( arghash, $kw239$ARG2, lf, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$99, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              sksi_arghash_form( arghash, lf_cycl );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != lf_isas )
              {
                SubLObject cdolist_list_var2 = lf_isas;
                SubLObject lf_isa = NIL;
                lf_isa = cdolist_list_var2.first();
                while ( NIL != cdolist_list_var2)
                {
                  sksi_form( lf_isa );
                  html_utilities.html_newline( UNPROVIDED );
                  cdolist_list_var2 = cdolist_list_var2.rest();
                  lf_isa = cdolist_list_var2.first();
                }
              }
              else
              {
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( lf_ms_count );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_arghash.html_arghash_submit_input( arghash, $str10$Edit, ConsesLow.list( $kw240$COMMAND_EDIT_LF, $kw44$SKS, sks, $kw50$LS, ls, $kw56$LF, lf ), UNPROVIDED );
              html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
              html_arghash.html_arghash_submit_input( arghash, $str241$Delete, ConsesLow.list( new SubLObject[] { $kw118$COMMAND_EDIT_LS, $kw242$DELETE_LF, lf, $kw44$SKS, sks, $kw50$LS, ls, $kw56$LF, lf
              } ), UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$103, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_princ( $str243$No_fields_in_this_logical_schema_ );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str244$Add_logical_field, ConsesLow.list( $kw240$COMMAND_EDIT_LF, $kw44$SKS, sks, $kw50$LS, ls ), UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    if( NIL != mss )
    {
      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_utilities.html_princ( $str245$Meaning_sentences_ );
      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ONE_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str235$CycL );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$104, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var3 = mss;
        SubLObject ms2 = NIL;
        ms2 = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          final SubLObject ms_cycl2 = sksi_ms_get_cycl( ms2 );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_assertion_ball( ms2, UNPROVIDED );
              sksi_form( ms_cycl2 );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$108, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != sksi_ms_get_asserted( ms2 ) )
              {
                html_arghash.html_arghash_submit_input( arghash, $str10$Edit, ConsesLow.list( $kw246$COMMAND_EDIT_MS, $kw44$SKS, sks, $kw50$LS, ls, $kw247$MS, ms2 ), UNPROVIDED );
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
                html_arghash.html_arghash_submit_input( arghash, $str241$Delete, ConsesLow.list( new SubLObject[] { $kw118$COMMAND_EDIT_LS, $kw248$DELETE_MS, ms2, $kw44$SKS, sks, $kw50$LS, ls, $kw247$MS, ms2
                } ), UNPROVIDED );
              }
              else
              {
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$109, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var3 = cdolist_list_var3.rest();
          ms2 = cdolist_list_var3.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_princ( $str249$No_meaning_sentences_in_this_logi );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_arghash.html_arghash_text_input( arghash, $kw178$PREDICATE, $str250$, $int251$60, UNPROVIDED );
    html_utilities.html_indent( ONE_INTEGER );
    html_arghash.html_arghash_submit_input( arghash, $str252$Add_meaning_sentence, ConsesLow.list( $kw246$COMMAND_EDIT_MS, $kw44$SKS, sks, $kw50$LS, ls ), UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    html_arghash.html_arghash_submit_input( arghash, $str109$OK, $kw110$OK, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 46197L)
  public static SubLObject sksi_smt_edit_ls_actions(final SubLObject arghash)
  {
    final SubLObject lf = html_arghash.get_arghash_value( $kw56$LF, arghash );
    final SubLObject ms = html_arghash.get_arghash_value( $kw247$MS, arghash );
    if( NIL != html_arghash.get_arghash_value( $kw242$DELETE_LF, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw242$DELETE_LF, arghash );
      html_arghash.rem_arghash_value( $kw56$LF, arghash );
      sksi_kb_accessors.sksi_kill( lf );
    }
    if( NIL != html_arghash.get_arghash_value( $kw248$DELETE_MS, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw248$DELETE_MS, arghash );
      html_arghash.rem_arghash_value( $kw247$MS, arghash );
      sksi_kb_accessors.sksi_unassert( uncanonicalizer.assertion_el_formula( ms ), hlmt.assertion_hlmt( ms ) );
    }
    if( NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      html_arghash.set_arghash_value( $kw45$TO_EDIT_SKS, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 46885L)
  public static SubLObject sksi_smt_edit_lf_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw30$ON_EDIT_LF, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject ls = html_arghash.get_arghash_value( $kw50$LS, arghash );
    SubLObject lf = html_arghash.get_arghash_value( $kw56$LF, arghash );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, sks, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw50$LS, sks, UNPROVIDED );
    if( NIL == lf )
    {
      lf = new_logical_field( sks, ls );
    }
    html_arghash.html_arghash_hidden_input( arghash, $kw56$LF, lf, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str253$Edit_Logical_Field__ );
    sksi_form( sks );
    html_utilities.html_princ( $str157$___ );
    sksi_arghash_form( arghash, ls );
    html_utilities.html_princ( $str157$___ );
    sksi_arghash_form( arghash, lf );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    if( NIL != nart_handles.nart_p( lf ) )
    {
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str254$Editing_this_field_will_automatic );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_utilities.html_newline( TWO_INTEGER );
    }
    final SubLObject lf_cycl = sksi_lf_get_cycl( lf );
    final SubLObject lf_isas = sksi_lf_get_isas( lf );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    html_utilities.html_princ( $str255$Logical_field_ );
    sksi_arghash_form( arghash, lf_cycl );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    html_utilities.html_princ( $str236$Field_isa );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_blockquote_head$.getGlobalValue() );
    SubLObject cdolist_list_var = lf_isas;
    SubLObject lf_isa = NIL;
    lf_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      html_arghash.html_arghash_hidden_input( arghash, $kw256$ISA, lf_isa, UNPROVIDED );
      html_arghash.html_arghash_fort_input( arghash, $kw257$NEW_ISA, lf_isa, $int258$30, $str259$Complete, $const260$Collection );
      html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
      html_arghash.html_arghash_submit_input( arghash, $str261$Change, $kw110$OK, UNPROVIDED );
      html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
      html_arghash.html_arghash_submit_input( arghash, $str241$Delete, ConsesLow.list( new SubLObject[] { $kw240$COMMAND_EDIT_LF, $kw262$REMOVE_ISA, T, $kw263$REMOVED_ISA, lf_isa, $kw44$SKS, sks, $kw50$LS, ls
      } ), UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      lf_isa = cdolist_list_var.first();
    }
    html_arghash.html_arghash_fort_input( arghash, $kw264$ADDED_ISA, NIL, $int258$30, $str259$Complete, $const260$Collection );
    html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str265$Add_isa, ConsesLow.list( $kw240$COMMAND_EDIT_LF, $kw266$ADD_ISA, T, $kw44$SKS, sks, $kw50$LS, ls ), UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_blockquote_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str107$Refresh, $kw108$REFRESH, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str109$OK, $kw110$OK, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str111$Cancel, $kw51$TO_EDIT_LS, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 48925L)
  public static SubLObject sksi_smt_edit_lf_actions(final SubLObject arghash)
  {
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject ls = html_arghash.get_arghash_value( $kw50$LS, arghash );
    SubLObject lf = html_arghash.get_arghash_value( $kw56$LF, arghash );
    final SubLObject lsb_mt = sks_get_logical_schemabase_mt( sks );
    final SubLObject isas = html_arghash.get_arghash_value_list( $kw256$ISA, arghash );
    final SubLObject new_isas = html_arghash.get_arghash_value_list( $kw257$NEW_ISA, arghash );
    html_arghash.rem_arghash_value( $kw256$ISA, arghash );
    html_arghash.rem_arghash_value( $kw257$NEW_ISA, arghash );
    final SubLObject unassert_isas = conses_high.set_difference( isas, new_isas, UNPROVIDED, UNPROVIDED );
    final SubLObject assert_isas = conses_high.set_difference( new_isas, isas, UNPROVIDED, UNPROVIDED );
    if( ( NIL != unassert_isas || NIL != assert_isas ) && NIL != nart_handles.nart_p( lf ) )
    {
      lf = sksi_lf_convert_to_constant( sks, ls, lf );
      html_arghash.set_arghash_value( $kw56$LF, arghash, lf );
    }
    SubLObject cdolist_list_var = unassert_isas;
    SubLObject unassert_isa = NIL;
    unassert_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_kb_accessors.sksi_unassert( el_utilities.make_binary_formula( $const267$fieldIsa, lf, unassert_isa ), lsb_mt );
      cdolist_list_var = cdolist_list_var.rest();
      unassert_isa = cdolist_list_var.first();
    }
    cdolist_list_var = assert_isas;
    SubLObject assert_isa = NIL;
    assert_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const267$fieldIsa, lf, assert_isa ), lsb_mt );
      cdolist_list_var = cdolist_list_var.rest();
      assert_isa = cdolist_list_var.first();
    }
    if( NIL != html_arghash.get_arghash_value( $kw262$REMOVE_ISA, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw262$REMOVE_ISA, arghash );
      if( NIL != nart_handles.nart_p( lf ) )
      {
        lf = sksi_lf_convert_to_constant( sks, ls, lf );
        html_arghash.set_arghash_value( $kw56$LF, arghash, lf );
      }
      final SubLObject removed_isa = html_arghash.get_arghash_value( $kw263$REMOVED_ISA, arghash );
      html_arghash.rem_arghash_value( $kw263$REMOVED_ISA, arghash );
      sksi_kb_accessors.sksi_unassert( el_utilities.make_binary_formula( $const267$fieldIsa, lf, removed_isa ), lsb_mt );
    }
    if( NIL != html_arghash.get_arghash_value( $kw266$ADD_ISA, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw266$ADD_ISA, arghash );
      if( NIL != nart_handles.nart_p( lf ) )
      {
        lf = sksi_lf_convert_to_constant( sks, ls, lf );
        html_arghash.set_arghash_value( $kw56$LF, arghash, lf );
      }
      final SubLObject isa_col = html_arghash.get_arghash_value( $kw264$ADDED_ISA, arghash );
      html_arghash.rem_arghash_value( $kw264$ADDED_ISA, arghash );
      if( NIL != isa_col )
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const267$fieldIsa, lf, isa_col ), lsb_mt );
      }
    }
    if( NIL != html_arghash.get_arghash_value( $kw108$REFRESH, arghash ) )
    {
      html_arghash.set_arghash_value( $kw57$TO_EDIT_LF, arghash, T );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      html_arghash.set_arghash_value( $kw51$TO_EDIT_LS, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 50939L)
  public static SubLObject sksi_smt_edit_ts_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw33$ON_EDIT_TS, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject ps = html_arghash.get_arghash_value( $kw47$PS, arghash );
    final SubLObject ls = html_arghash.get_arghash_value( $kw50$LS, arghash );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, sks, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw47$PS, ps, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw50$LS, ls, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str268$Edit_Translation_Schema__ );
    sksi_form( sks );
    html_utilities.html_princ( $str157$___ );
    sksi_arghash_form( arghash, ps );
    final SubLObject this_arghash = hash_table_utilities.copy_hashtable( arghash, UNPROVIDED );
    html_arghash.set_arghash_value( ConsesLow.list( $kw119$COMMAND_EDIT_TS, T ), this_arghash, T );
    final SubLObject href = PrintLow.format( NIL, $str269$_A__A, system_parameters.$cyc_cgi_program$.getDynamicValue( thread ), html_arghash.html_arghash_href( this_arghash, $str16$sksi_smt ) );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( href );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str270$___ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    sksi_arghash_form( arghash, ls );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
    {
      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str271$_note__editing_is_not_yet_enabled );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    thread.resetMultipleValues();
    final SubLObject translation_pairs = sksi_sks_get_translations( sks, ps, ls, UNPROVIDED );
    final SubLObject encodings_only = thread.secondMultipleValue();
    final SubLObject decodings_only = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = translation_pairs;
      SubLObject translation_pair = NIL;
      translation_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_sksi_show_translation( arghash, translation_pair );
        cdolist_list_var = cdolist_list_var.rest();
        translation_pair = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_3, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 52429L)
  public static SubLObject html_sksi_show_translation(final SubLObject arghash, final SubLObject translation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject physical_field = NIL;
    SubLObject logical_field = NIL;
    SubLObject encoding = NIL;
    SubLObject decoding = NIL;
    SubLObject decoding_formula = NIL;
    SubLObject encoding_formula = NIL;
    if( translation.isList() )
    {
      encoding = translation.first();
      decoding = conses_high.second( translation );
      physical_field = cycl_utilities.sentence_arg2( uncanonicalizer.assertion_el_formula( encoding ), UNPROVIDED );
      logical_field = cycl_utilities.sentence_arg2( uncanonicalizer.assertion_el_formula( decoding ), UNPROVIDED );
      decoding_formula = cycl_utilities.sentence_arg4( uncanonicalizer.assertion_el_formula( decoding ), UNPROVIDED );
      encoding_formula = cycl_utilities.sentence_arg4( uncanonicalizer.assertion_el_formula( encoding ), UNPROVIDED );
    }
    else if( cycl_utilities.sentence_arg0( translation ).eql( $const207$fieldEncoding ) )
    {
      final SubLObject encoding_$110 = uncanonicalizer.assertion_el_formula( translation );
      physical_field = cycl_utilities.sentence_arg2( encoding_$110, UNPROVIDED );
      encoding_formula = cycl_utilities.sentence_arg4( encoding_$110, UNPROVIDED );
    }
    else if( cycl_utilities.sentence_arg0( translation ).eql( $const176$fieldDecoding ) )
    {
      final SubLObject decoding_$111 = uncanonicalizer.assertion_el_formula( translation );
      logical_field = cycl_utilities.sentence_arg2( decoding_$111, UNPROVIDED );
      decoding_formula = cycl_utilities.sentence_arg4( decoding_$111, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw95$RIGHT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        sksi_form( physical_field );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_rowspan$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw272$CENTER ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw81$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str273$___ );
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_assertion_ball( decoding, UNPROVIDED );
        cb_utilities.cb_assertion_ball( encoding, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$113, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw112$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        sksi_form( logical_field );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$114, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_arghash.html_arghash_sentence_input( arghash, $kw274$DECODING_FORMULA, decoding_formula, THREE_INTEGER, $int275$50, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_arghash.html_arghash_sentence_input( arghash, $kw276$ENCODING_FORMULA, encoding_formula, THREE_INTEGER, $int275$50, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( FIVE_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54188L)
  public static SubLObject sksi_smt_edit_ts_actions(final SubLObject arghash)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54272L)
  public static SubLObject sksi_smt_edit_t_page(final SubLObject arghash)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54434L)
  public static SubLObject sksi_smt_edit_t_actions(final SubLObject arghash)
  {
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54501L)
  public static SubLObject sksi_smt_edit_ms_page(final SubLObject arghash)
  {
    html_arghash.html_arghash_hidden_input( arghash, $kw31$ON_EDIT_MS, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    final SubLObject ls = html_arghash.get_arghash_value( $kw50$LS, arghash );
    final SubLObject ms = html_arghash.get_arghash_value( $kw247$MS, arghash );
    final SubLObject predicate = misc_kb_utilities.guess_fort( html_arghash.get_arghash_value( $kw178$PREDICATE, arghash ) );
    final SubLObject lf_arg1 = html_arghash.get_arghash_value( $kw238$ARG1, arghash );
    final SubLObject lf_arg2 = html_arghash.get_arghash_value( $kw239$ARG2, arghash );
    final SubLObject ms_formula = ( NIL != ms ) ? uncanonicalizer.assertion_el_formula( ms ) : NIL;
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, sks, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw50$LS, ls, UNPROVIDED );
    html_arghash.html_arghash_hidden_input( arghash, $kw247$MS, ms, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str277$Edit_Meaning_Sentence_in__ );
    sksi_form( sks );
    html_utilities.html_princ( $str157$___ );
    sksi_arghash_form( arghash, ls );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    if( NIL != ms_formula )
    {
      html_arghash.html_arghash_sentence_input( arghash, $kw278$MS_FORMULA, ms_formula, TEN_INTEGER, $int251$60, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject sentence = el_utilities.make_binary_formula( predicate, lf_arg1, lf_arg2 );
      final SubLObject meaning_sentence = el_utilities.make_binary_formula( $const205$meaningSentenceOfSchema, ls, sentence );
      html_arghash.html_arghash_textarea_input( arghash, $kw278$MS_FORMULA, meaning_sentence, $int251$60, TEN_INTEGER, T, $kw279$EL_FORMULA );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str109$OK, $kw110$OK, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str111$Cancel, ConsesLow.list( $kw246$COMMAND_EDIT_MS, $kw44$SKS, sks, $kw50$LS, ls ), UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 55886L)
  public static SubLObject sksi_smt_edit_ms_actions(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != html_arghash.get_arghash_value( $kw110$OK, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw110$OK, arghash );
      html_arghash.set_arghash_value( $kw51$TO_EDIT_LS, arghash, T );
      final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
      final SubLObject lsb = sks_get_logical_schemabase_mt( sks );
      final SubLObject ms = html_arghash.get_arghash_value( $kw247$MS, arghash );
      final SubLObject old_ms_formula = ( NIL != assertion_handles.assertion_p( ms ) ) ? uncanonicalizer.assertion_el_formula( ms ) : NIL;
      final SubLObject ms_formula = html_arghash.get_arghash_value( $kw278$MS_FORMULA, arghash );
      if( NIL == ms_formula )
      {
        html_arghash.push_arghash_value( $kw60$ERROR, ConsesLow.list( $kw280$NULL_FORMULA, $str281$Formula_invalid_ ), arghash );
      }
      else if( old_ms_formula.equal( ms_formula ) )
      {
        html_arghash.push_arghash_value( $kw60$ERROR, ConsesLow.list( $kw280$NULL_FORMULA, $str282$Formula_wasn_t_changed_ ), arghash );
      }
      else if( NIL == old_ms_formula )
      {
        sksi_kb_accessors.sksi_assert_if_new( ms_formula, lsb );
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject result = sksi_kb_accessors.sksi_edit_assertion( ms, ms_formula );
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != error )
        {
          html_arghash.push_arghash_value( $kw60$ERROR, error, arghash );
        }
      }
    }
    else if( NIL != html_arghash.get_arghash_value( $kw283$CANCEL, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw110$OK, arghash );
      html_arghash.set_arghash_value( $kw51$TO_EDIT_LS, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 56984L)
  public static SubLObject sksi_smt_decode_psb_page(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_arghash.html_arghash_hidden_input( arghash, $kw32$ON_DECODE_PSB, T, UNPROVIDED );
    final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
    SubLObject table_info = html_arghash.get_arghash_value( $kw284$TABLE_INFO, arghash );
    final SubLObject psb = sks_get_physical_schemabase_mt( sks );
    final SubLObject named_schemata = sksi_sks_structure_importer_utilities.cluster_physical_database_table_information_by_schemata( sksi_psb_get_labeled_schemata( psb ) );
    html_arghash.html_arghash_hidden_input( arghash, $kw44$SKS, sks, UNPROVIDED );
    if( NIL == table_info )
    {
      final SubLObject raw_table_info = sksi_sks_structure_importer_utilities.sks_gather_physical_database_table_names( sks, UNPROVIDED, UNPROVIDED );
      table_info = sksi_sks_structure_importer_utilities.cluster_physical_database_table_information_by_schemata( raw_table_info );
      html_arghash.set_arghash_value( $kw284$TABLE_INFO, arghash, table_info );
    }
    html_arghash.html_arghash_hidden_input( arghash, $kw284$TABLE_INFO, table_info, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str285$Select_Database_Tables_to_Decode_ );
    sksi_form( sks );
    html_utilities.html_princ( $str286$__ );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject cdolist_list_var = table_info;
    SubLObject schema_info = NIL;
    schema_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = schema_info;
      SubLObject schema_name = NIL;
      SubLObject table_details = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
      schema_name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
      table_details = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject curr_named_schema_tables = conses_high.second( Sequences.find( schema_name, named_schemata, $sym288$STRING_, $sym289$FIRST, UNPROVIDED, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( FIVE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( $str290$Schema_ );
        html_utilities.html_princ( schema_name );
        html_utilities.html_princ( $str291$__ );
        dhtml_macros.dhtml_switch_visibility_links( schema_name, $str292$Show, $str293$Hide );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( FIVE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        dhtml_macros.dhtml_set_switched_visibility( schema_name, $kw294$INVISIBLE, $kw295$PARAGRAPH );
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        if( NIL != schema_name )
        {
          html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( schema_name );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$120, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw112$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw81$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str296$Table_Name );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$121, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                if( NIL != list_utilities.sublisp_boolean( curr_named_schema_tables ) )
                {
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str297$Physical_Schemata );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$122, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$119, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            SubLObject cdolist_list_var_$123 = table_details;
            SubLObject table_detail = NIL;
            table_detail = cdolist_list_var_$123.first();
            while ( NIL != cdolist_list_var_$123)
            {
              final SubLObject table_name = table_detail.first();
              final SubLObject table_schema_details = Sequences.find( table_name, curr_named_schema_tables, $sym288$STRING_, $sym289$FIRST, UNPROVIDED, UNPROVIDED );
              final SubLObject arg_ref = Sequences.cconcatenate( schema_name, new SubLObject[] { $str126$_, table_name
              } );
              final SubLObject reifiedP = list_utilities.sublisp_boolean( table_schema_details );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw272$CENTER ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw272$CENTER ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  if( NIL == reifiedP )
                  {
                    html_arghash.html_arghash_checkbox_input( arghash, arg_ref, T, UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$124, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw112$LEFT ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw272$CENTER ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( table_name );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$125, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw112$LEFT ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw272$CENTER ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  if( NIL != reifiedP )
                  {
                    sksi_arghash_form( arghash, conses_high.second( table_schema_details ) );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$126, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$123, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              cdolist_list_var_$123 = cdolist_list_var_$123.rest();
              table_detail = cdolist_list_var_$123.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$118, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list287 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      schema_info = cdolist_list_var.first();
    }
    html_utilities.html_newline( TWO_INTEGER );
    html_arghash.html_arghash_submit_input( arghash, $str107$Refresh, $kw108$REFRESH, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str98$Decode, $kw298$DECODE, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str111$Cancel, ConsesLow.list( $kw78$COMMAND_EDIT_SKS, $kw44$SKS, sks ), UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 60140L)
  public static SubLObject sksi_smt_decode_psb_actions(final SubLObject arghash)
  {
    if( NIL != html_arghash.get_arghash_value( $kw108$REFRESH, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw108$REFRESH, arghash );
    }
    else if( NIL != html_arghash.get_arghash_value( $kw298$DECODE, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw298$DECODE, arghash );
      final SubLObject sks = html_arghash.get_arghash_value( $kw44$SKS, arghash );
      final SubLObject table_info = html_arghash.get_arghash_value( $kw284$TABLE_INFO, arghash );
      if( NIL == sks_get_psb( sks ) )
      {
        sks_new_psb( sks );
      }
      SubLObject cdolist_list_var = table_info;
      SubLObject schema_info = NIL;
      schema_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = schema_info;
        SubLObject schema_name = NIL;
        SubLObject table_details = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
        schema_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
        table_details = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject cdolist_list_var_$128 = table_details;
          SubLObject table_detail = NIL;
          table_detail = cdolist_list_var_$128.first();
          while ( NIL != cdolist_list_var_$128)
          {
            final SubLObject table_name = table_detail.first();
            final SubLObject arg_ref = Sequences.cconcatenate( schema_name, new SubLObject[] { $str126$_, table_name
            } );
            if( NIL != html_arghash.get_arghash_value( arg_ref, arghash ) )
            {
              sksi_sks_structure_importer_utilities.sks_physical_structure_decode_database_table( sks, table_name, schema_name, UNPROVIDED );
              html_arghash.rem_arghash_value( arg_ref, arghash );
            }
            cdolist_list_var_$128 = cdolist_list_var_$128.rest();
            table_detail = cdolist_list_var_$128.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list287 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        schema_info = cdolist_list_var.first();
      }
    }
    else if( NIL != html_arghash.get_arghash_value( $kw283$CANCEL, arghash ) )
    {
      html_arghash.rem_arghash_value( $kw283$CANCEL, arghash );
      html_arghash.set_arghash_value( $kw45$TO_EDIT_SKS, arghash, T );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 61219L)
  public static SubLObject sks_get_sd(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return sksi_sks_accessors.sks_fget( sks, $const300$sksSourceDescriptionMt, $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 61493L)
  public static SubLObject sks_get_source_description_mt(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject sd = sks_get_sd( sks );
    if( NIL != sd )
    {
      return sksi_sd_get_mt( sd );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 61666L)
  public static SubLObject sks_new_sd(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject new_sd = el_utilities.make_unary_formula( $const301$MappingMtFn, sks );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, new_sd, $const302$SKSISourceDescriptionMicrotheory ), $const121$UniversalVocabularyMt );
    sksi_sks_accessors.sks_fset( sks, $const300$sksSourceDescriptionMt, new_sd, $const121$UniversalVocabularyMt );
    final SubLObject psb = sks_get_physical_schemabase_mt( sks );
    if( NIL != forts.fort_p( psb ) )
    {
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const303$genlMt, new_sd, psb ), $const214$BaseKB );
    }
    return new_sd;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 62161L)
  public static SubLObject sks_get_psb(final SubLObject sks)
  {
    return sksi_sks_accessors.sks_fget( sks, $const120$sksPhysicalSchemaDescriptionMt, $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 62280L)
  public static SubLObject sks_get_physical_schemabase_mt(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject psb = sks_get_psb( sks );
    if( NIL != psb )
    {
      return sksi_psb_get_mt( psb );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 62459L)
  public static SubLObject sks_new_psb(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject sks_string = sksi_sks_accessors.sks_get_string( sks );
    final SubLObject new_psb = sksi_kb_accessors.sksi_find_or_create( Sequences.cconcatenate( string_utilities.post_remove( sks_string, $str304$_KS, UNPROVIDED ), $str305$PhysicalSchemaMt ) );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, new_psb, $const306$SKSIPhysicalSchemaDescriptionMicr ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const303$genlMt, new_psb, $const209$SKSIMt ), $const121$UniversalVocabularyMt );
    sksi_sks_accessors.sks_fset( sks, $const120$sksPhysicalSchemaDescriptionMt, new_psb, $const121$UniversalVocabularyMt );
    final SubLObject sdb = sks_get_source_description_mt( sks );
    if( NIL != forts.fort_p( sdb ) )
    {
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const303$genlMt, sdb, new_psb ), $const214$BaseKB );
    }
    return new_psb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63156L)
  public static SubLObject sks_get_lsb(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return sksi_sks_accessors.sks_fget( sks, $const307$sksLogicalSchemaDescriptionMt, $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63299L)
  public static SubLObject sks_get_logical_schemabase_mt(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject lsb = sks_get_lsb( sks );
    if( NIL != lsb )
    {
      return sksi_lsb_get_mt( lsb );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63477L)
  public static SubLObject sks_get_tsb(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return sksi_sks_accessors.sks_fget( sks, $const308$sksSchemaTranslationMt, $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63612L)
  public static SubLObject sks_get_translation_schemabase_mt(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject tsb = sks_get_tsb( sks );
    if( NIL != tsb )
    {
      return sksi_tsb_get_mt( tsb );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63794L)
  public static SubLObject sks_get_bridging_or_content_mt(final SubLObject sks)
  {
    SubLObject result = sks_get_bmt( sks );
    if( NIL == fort_types_interface.microtheory_p( result ) )
    {
      result = sks_get_cmt( sks );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63983L)
  public static SubLObject sks_get_cmt(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return sksi_sks_accessors.sks_fget( sks, $const309$contentMt, $const214$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64090L)
  public static SubLObject sks_get_bmt(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return sksi_sks_accessors.sks_fget( sks, $const310$bridgingMtForKS, $const214$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64203L)
  public static SubLObject sks_set_source_description_mt(final SubLObject sks, final SubLObject sd)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != hlmt.hlmt_p( sd ) : sd;
    return sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const300$sksSourceDescriptionMt, sks, sd ), $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64502L)
  public static SubLObject sks_set_physical_schemabase_mt(final SubLObject sks, final SubLObject psb)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != hlmt.hlmt_p( psb ) : psb;
    return sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const120$sksPhysicalSchemaDescriptionMt, sks, psb ), $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64730L)
  public static SubLObject sks_set_logical_schemabase_mt(final SubLObject sks, final SubLObject lsb)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != hlmt.hlmt_p( lsb ) : lsb;
    return sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const307$sksLogicalSchemaDescriptionMt, sks, lsb ), $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64956L)
  public static SubLObject sks_set_translation_schemabase_mt(final SubLObject sks, final SubLObject tsb)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != hlmt.hlmt_p( tsb ) : tsb;
    return sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const308$sksSchemaTranslationMt, sks, tsb ), $const121$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65395L)
  public static SubLObject sksi_smt_check_isa_invariant(final SubLObject v_object, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == isa.isa_in_any_mtP( v_object, col ) && NIL != list_utilities.sublisp_boolean( $sksi_smt_warn_about_invariantsP$.getDynamicValue( thread ) ) )
    {
      Errors.warn( $str313$SMT_invariant_broken___A_is_not_a, v_object, col );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65642L)
  public static SubLObject sksi_source_description_p(final SubLObject v_object)
  {
    sksi_smt_check_isa_invariant( v_object, $const302$SKSISourceDescriptionMicrotheory );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65823L)
  public static SubLObject sksi_sd_get_mt(final SubLObject sd)
  {
    assert NIL != sksi_source_description_p( sd ) : sd;
    return sd;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65918L)
  public static SubLObject sksi_physical_schemabase_p(final SubLObject v_object)
  {
    sksi_smt_check_isa_invariant( v_object, $const306$SKSIPhysicalSchemaDescriptionMicr );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66190L)
  public static SubLObject sksi_psb_get_name(final SubLObject psb)
  {
    assert NIL != sksi_physical_schemabase_p( psb ) : psb;
    return kb_paths.fort_name( psb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66304L)
  public static SubLObject sksi_psb_get_mt(final SubLObject psb)
  {
    assert NIL != sksi_physical_schemabase_p( psb ) : psb;
    return psb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66404L)
  public static SubLObject sksi_physical_schema_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const46$PhysicalSchema );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66505L)
  public static SubLObject sksi_ps_get_name(final SubLObject ps)
  {
    assert NIL != sksi_physical_schema_p( ps ) : ps;
    return kb_paths.fort_name( ps );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66611L)
  public static SubLObject sksi_ps_get_pfs(final SubLObject ps)
  {
    assert NIL != sksi_physical_schema_p( ps ) : ps;
    final SubLObject pf_strings = kb_mapping_utilities.fpred_value_in_any_mt( ps, $const317$schemaFieldNameList, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = pf_strings;
    SubLObject pf_string = NIL;
    pf_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pf = sksi_kb_accessors.sksi_find_nart( el_utilities.make_binary_formula( $const224$PhysicalFieldFn, ps, pf_string ) );
      if( NIL != pf )
      {
        result = ConsesLow.cons( pf, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pf_string = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66964L)
  public static SubLObject sksi_physical_field_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const52$PhysicalField );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67063L)
  public static SubLObject sksi_pf_get_ps(final SubLObject pf)
  {
    assert NIL != sksi_physical_field_p( pf ) : pf;
    return cycl_utilities.sentence_arg1( pf, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67170L)
  public static SubLObject sksi_pf_get_name(final SubLObject pf)
  {
    assert NIL != sksi_physical_field_p( pf ) : pf;
    return kb_mapping_utilities.fpred_value_in_any_mt( pf, $const319$fieldName_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67303L)
  public static SubLObject sksi_pf_get_datatype(final SubLObject pf)
  {
    assert NIL != sksi_physical_field_p( pf ) : pf;
    return kb_mapping_utilities.fpred_value_in_any_mt( pf, $const320$fieldDataType, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67440L)
  public static SubLObject sksi_pf_get_nullable(final SubLObject pf)
  {
    assert NIL != sksi_physical_field_p( pf ) : pf;
    final SubLObject ps = sksi_pf_get_ps( pf );
    final SubLObject not_nullable_pfs = kb_mapping_utilities.pred_values_in_any_mt( ps, $const321$nonNullFields, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == subl_promotions.memberP( pf, not_nullable_pfs, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67696L)
  public static SubLObject sksi_pf_get_default_value(final SubLObject pf)
  {
    assert NIL != sksi_physical_field_p( pf ) : pf;
    final SubLObject ps = sksi_pf_get_ps( pf );
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_any_mt( $const322$defaultFieldValue, ps, pf, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject default_value = NIL;
    if( NIL != gaf )
    {
      default_value = cycl_utilities.sentence_arg3( gaf, UNPROVIDED );
    }
    return default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67995L)
  public static SubLObject sksi_pf_get_key_type(final SubLObject pf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sksi_physical_field_p( pf ) : pf;
    final SubLObject ps = sksi_pf_get_ps( pf );
    final SubLObject pf_name = sksi_pf_get_name( pf );
    final SubLObject pks = kb_mapping_utilities.pred_values_in_any_mt( ps, $const323$primaryKey, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
    SubLObject current;
    final SubLObject datum = current = pks;
    SubLObject the_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list324 );
    the_list = current.first();
    final SubLObject keys;
    current = ( keys = current.rest() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$const204$TheList.eql( the_list ) )
    {
      Errors.error( $str325$Incapable_of_dealing_with_structu, pks );
    }
    final SubLObject key_names = Mapping.mapcar( $sym326$SKSI_PF_GET_NAME, keys );
    if( NIL != subl_promotions.memberP( pf_name, key_names, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw327$PRIMARY;
    }
    return $kw328$NONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 68577L)
  public static SubLObject sksi_logical_schemabase_p(final SubLObject v_object)
  {
    sksi_smt_check_isa_invariant( v_object, $const329$SKSILogicalSchemaDescriptionMicro );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 68854L)
  public static SubLObject new_logical_schemabase(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject psb = sks_get_physical_schemabase_mt( sks );
    final SubLObject lsb = sksi_kb_accessors.sksi_create( string_utilities.make_valid_constant_name( Sequences.cconcatenate( string_utilities.post_remove( sksi_psb_get_name( psb ), $str305$PhysicalSchemaMt, UNPROVIDED ),
        $str330$LogicalSchemaMt ), UNPROVIDED ) );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, lsb, $const329$SKSILogicalSchemaDescriptionMicro ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const303$genlMt, lsb, $const209$SKSIMt ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const307$sksLogicalSchemaDescriptionMt, sks, lsb ), $const121$UniversalVocabularyMt );
    return lsb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69470L)
  public static SubLObject sksi_lsb_get_mt(final SubLObject lsb)
  {
    assert NIL != sksi_logical_schemabase_p( lsb ) : lsb;
    return lsb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69569L)
  public static SubLObject sksi_logical_schema_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const49$LogicalSchema );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69668L)
  public static SubLObject new_logical_schema(final SubLObject sks, final SubLObject ps, SubLObject ls_name, SubLObject isas)
  {
    if( ls_name == UNPROVIDED )
    {
      ls_name = NIL;
    }
    if( isas == UNPROVIDED )
    {
      isas = NIL;
    }
    return new_or_recycled_logical_schema( sks, ps, ls_name, NIL, isas );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69804L)
  public static SubLObject new_or_recycled_logical_schema(final SubLObject sks, final SubLObject ps, SubLObject ls_name, SubLObject ls, SubLObject isas)
  {
    if( ls_name == UNPROVIDED )
    {
      ls_name = NIL;
    }
    if( ls == UNPROVIDED )
    {
      ls = NIL;
    }
    if( isas == UNPROVIDED )
    {
      isas = NIL;
    }
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    if( NIL != ps && !assertionsDisabledInClass && NIL == sksi_physical_schema_p( ps ) )
    {
      throw new AssertionError( ps );
    }
    if( NIL != constant_handles.constant_p( ls ) )
    {
      final SubLObject name = constants_high.constant_name( ls );
      ke.ke_recreate_now( ls );
      ls = constants_high.find_constant( name );
    }
    else
    {
      if( !ls_name.isString() )
      {
        ls_name = ( ( NIL != sksi_physical_schema_p( ps ) ) ? Sequences.cconcatenate( string_utilities.post_remove( sksi_ps_get_name( ps ), $str200$_PS, UNPROVIDED ), $str202$_LS )
            : Sequences.cconcatenate( kb_paths.fort_name( sksi_sks_accessors.sks_get_term( sks ) ), new SubLObject[]
            { $str332$_LS_, string_utilities.to_string( sksi_next_id() )
            } ) );
      }
      ls = sksi_kb_accessors.sksi_create( string_utilities.make_valid_constant_name( ls_name, UNPROVIDED ) );
    }
    SubLObject lsb = sks_get_lsb( sks );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, ls, $const333$ObjectDefiningSchema ), $const121$UniversalVocabularyMt );
    SubLObject lsb_mt = NIL;
    if( NIL == lsb )
    {
      lsb = new_logical_schemabase( sks );
    }
    lsb_mt = sksi_lsb_get_mt( lsb );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, ls, $const49$LogicalSchema ), lsb_mt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const334$definingMt, ls, lsb_mt ), $const214$BaseKB );
    if( NIL != isas )
    {
      SubLObject cdolist_list_var = isas;
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const335$schemaIsa, ls, v_isa ), lsb );
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
    }
    if( NIL != ps )
    {
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const167$logicalPhysicalSchemaMap, ls, ps ), sks_get_source_description_mt( sks ) );
    }
    return ls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71219L)
  public static SubLObject sksi_ls_get_name(final SubLObject ls)
  {
    assert NIL != sksi_logical_schema_p( ls ) : ls;
    return constants_high.constant_name( ls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71328L)
  public static SubLObject sksi_ls_get_lfs(final SubLObject ls)
  {
    assert NIL != sksi_logical_schema_p( ls ) : ls;
    return kb_mapping_utilities.pred_values_in_any_mt( ls, $const337$logicalFields, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71462L)
  public static SubLObject sksi_ls_get_mss(final SubLObject ls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sksi_logical_schema_p( ls ) : ls;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym338$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const339$EverythingPSC, thread );
      result = kb_mapping_utilities.pred_value_gafs( ls, $const205$meaningSentenceOfSchema, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71665L)
  public static SubLObject sksi_ls_get_ps(final SubLObject ls)
  {
    assert NIL != sksi_logical_schema_p( ls ) : ls;
    return kb_mapping_utilities.pred_values_in_any_mt( ls, $const167$logicalPhysicalSchemaMap, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71807L)
  public static SubLObject sksi_logical_field_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const55$LogicalField );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71969L)
  public static SubLObject sksi_next_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $sksi_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 72058L)
  public static SubLObject new_logical_field(final SubLObject sks, final SubLObject ls)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != sksi_logical_schema_p( ls ) : ls;
    final SubLObject sks_mt = sksi_sks_accessors.sks_get_defining_mt( sks, UNPROVIDED );
    final SubLObject lf = sksi_kb_accessors.sksi_create( string_utilities.make_valid_constant_name( Sequences.cconcatenate( kb_paths.fort_name( sksi_sks_accessors.sks_get_term( sks ) ), new SubLObject[] { $str201$_,
      sksi_ls_get_name( ls ), $str341$_LF_, string_utilities.to_string( sksi_next_id() )
    } ), UNPROVIDED ) );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const342$quotedIsa, lf, $const343$IndexicalConcept ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, lf, $const55$LogicalField ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const337$logicalFields, ls, lf ), sks_mt );
    return lf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 72769L)
  public static SubLObject sksi_lf_convert_to_constant(final SubLObject sks, final SubLObject ls, final SubLObject lf)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != sksi_logical_schema_p( ls ) : ls;
    assert NIL != sksi_logical_field_p( lf ) : lf;
    if( NIL == nart_handles.nart_p( lf ) )
    {
      return lf;
    }
    final SubLObject lf_el_formula = narts_high.nart_el_formula( lf );
    final SubLObject new_lf = new_logical_field( sks, ls );
    final SubLObject sks_mt = sksi_sks_accessors.sks_get_defining_mt( sks, UNPROVIDED );
    final SubLObject lsb_mt = sks_get_logical_schemabase_mt( sks );
    final SubLObject tsb_mt = sks_get_translation_schemabase_mt( sks );
    if( NIL != kb_mapping_macros.do_mt_index_key_validator( lsb_mt, NIL ) )
    {
      final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( lsb_mt );
      SubLObject final_index_iterator = NIL;
      try
      {
        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
          if( NIL != valid )
          {
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula( assertion );
            final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
            if( NIL != subl_promotions.memberP( lf_el_formula, assertion_el_formula, EQUAL, UNPROVIDED ) )
            {
              sksi_kb_accessors.sksi_unassert_assertion( assertion );
              sksi_kb_accessors.sksi_assert( list_utilities.tree_substitute( assertion_el_formula, lf_el_formula, new_lf ), assertion_mt, UNPROVIDED, UNPROVIDED );
            }
          }
          done_var = makeBoolean( NIL == valid );
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
    if( !lsb_mt.eql( tsb_mt ) && NIL != kb_mapping_macros.do_mt_index_key_validator( tsb_mt, NIL ) )
    {
      final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( tsb_mt );
      SubLObject final_index_iterator = NIL;
      try
      {
        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
          if( NIL != valid )
          {
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula( assertion );
            final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
            if( NIL != subl_promotions.memberP( lf_el_formula, assertion_el_formula, EQUAL, UNPROVIDED ) )
            {
              sksi_kb_accessors.sksi_unassert_assertion( assertion );
              sksi_kb_accessors.sksi_assert( list_utilities.tree_substitute( assertion_el_formula, lf_el_formula, new_lf ), assertion_mt, UNPROVIDED, UNPROVIDED );
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( NIL != final_index_iterator )
          {
            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
        }
      }
    }
    sksi_kb_accessors.sksi_unassert( el_utilities.make_binary_formula( $const337$logicalFields, ls, lf ), sks_mt );
    return new_lf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74056L)
  public static SubLObject sksi_lf_get_genls(final SubLObject lf)
  {
    assert NIL != sksi_logical_field_p( lf ) : lf;
    return kb_mapping_utilities.pred_values_in_any_mt( lf, $const345$fieldGenls, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74186L)
  public static SubLObject sksi_lf_get_isas(final SubLObject lf)
  {
    assert NIL != sksi_logical_field_p( lf ) : lf;
    return kb_mapping_utilities.pred_values_in_any_mt( lf, $const267$fieldIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74313L)
  public static SubLObject sksi_lf_get_cycl(final SubLObject lf)
  {
    assert NIL != sksi_logical_field_p( lf ) : lf;
    return lf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74405L)
  public static SubLObject sksi_meaning_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) && cycl_utilities.sentence_arg0( v_object ).eql( $const205$meaningSentenceOfSchema ) && NIL != sksi_logical_schema_p( cycl_utilities.sentence_arg1(
        v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74607L)
  public static SubLObject sksi_ms_get_cycl(final SubLObject ms)
  {
    assert NIL != sksi_meaning_sentence_p( ms ) : ms;
    return cycl_utilities.sentence_arg2( ms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74770L)
  public static SubLObject sksi_ms_get_asserted(final SubLObject ms)
  {
    return assertions_high.asserted_assertionP( ms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74849L)
  public static SubLObject sksi_translation_schemabase_p(final SubLObject v_object)
  {
    sksi_smt_check_isa_invariant( v_object, $const347$SKSISchemaTranslationMicrotheory );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 75116L)
  public static SubLObject new_translation_schemabase(final SubLObject sks, final SubLObject psb, final SubLObject lsb)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != sksi_physical_schemabase_p( psb ) : psb;
    assert NIL != sksi_logical_schemabase_p( lsb ) : lsb;
    final SubLObject tsb = sksi_kb_accessors.sksi_create( string_utilities.make_valid_constant_name( Sequences.cconcatenate( string_utilities.post_remove( sksi_psb_get_name( psb ), $str305$PhysicalSchemaMt, UNPROVIDED ),
        $str348$TranslationSchemaMt ), UNPROVIDED ) );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, tsb, $const347$SKSISchemaTranslationMicrotheory ), $const121$UniversalVocabularyMt );
    final SubLObject psb_mt = sksi_psb_get_mt( psb );
    final SubLObject lsb_mt = sksi_lsb_get_mt( lsb );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const303$genlMt, tsb, psb_mt ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const303$genlMt, tsb, lsb_mt ), $const121$UniversalVocabularyMt );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const308$sksSchemaTranslationMt, sks, tsb ), $const121$UniversalVocabularyMt );
    return tsb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 75954L)
  public static SubLObject sksi_tsb_get_mt(final SubLObject tsb)
  {
    assert NIL != sksi_translation_schemabase_p( tsb ) : tsb;
    return tsb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 76057L)
  public static SubLObject decode_physical_structure_of_sks(final SubLObject sks)
  {
    if( NIL == sks_get_psb( sks ) )
    {
      final SubLObject psb = sks_new_psb( sks );
      sksi_sks_structure_importer_utilities.sks_physical_structure_decode( sks );
    }
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 76417L)
  public static SubLObject new_structured_knowledge_source(final SubLObject sks_name)
  {
    final SubLObject sks = sksi_sks_accessors.new_sks_complex( sks_name, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject sd = hlmt_czer.canonicalize_hlmt( sks_new_sd( sks ) );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const309$contentMt, sks, el_utilities.make_unary_formula( $const352$ContentMtFn, sks ) ), $const214$BaseKB );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const142$sksIsa, sks, $const353$Database_Physical ), sd );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const310$bridgingMtForKS, sks, el_utilities.make_unary_formula( $const354$BridgingMtForKSFn, sks ) ), $const355$SKSIVocabularyMt );
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 77201L)
  public static SubLObject new_conceptual_mapping_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject pf, final SubLObject isas)
  {
    final SubLObject schema_name = string_utilities.post_remove( kb_paths.fort_name( ps ), $str200$_PS, UNPROVIDED );
    final SubLObject colname = sksi_smt_column_or_fort_name( pf );
    final SubLObject fullname = Sequences.cconcatenate( schema_name, new SubLObject[] { $str201$_, colname, $str357$_CMLS
    } );
    SubLObject cmls = constants_high.find_constant( fullname );
    if( NIL != forts.fort_p( cmls ) )
    {
      ke.ke_recreate_now( cmls );
      cmls = constants_high.find_constant( fullname );
    }
    else
    {
      cmls = ke.ke_create_now( fullname, UNPROVIDED );
    }
    sksi_kb_accessors.sksi_assert_if_new( ConsesLow.listS( $const211$isa, cmls, $list358 ), $const121$UniversalVocabularyMt );
    final SubLObject mapping_mt = sks_get_source_description_mt( sks );
    SubLObject cdolist_list_var = isas;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_kb_accessors.sksi_assert_if_new( ConsesLow.list( $const335$schemaIsa, cmls, v_isa ), mapping_mt );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return cmls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 78128L)
  public static SubLObject sksi_smt_get_available_database_types()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym338$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const339$EverythingPSC, thread );
      results = Sequences.remove_if( $sym360$HL_PROTOTYPICAL_INSTANCE_, isa.all_instances( $const144$SKSISupportedDatabaseServerProgra, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 78478L)
  public static SubLObject sks_initialize_all_sks_description_mts()
  {
    SubLObject cdolist_list_var = sksi_sks_accessors.get_all_skss();
    SubLObject sks = NIL;
    sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sks_initialize_description_mts( sks );
      cdolist_list_var = cdolist_list_var.rest();
      sks = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 78710L)
  public static SubLObject sks_initialize_description_mts(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    if( NIL == sks_get_source_description_mt( sks ) )
    {
      final SubLObject sd = sks_guess_sd( sks );
      if( NIL != sd )
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, sd, $const302$SKSISourceDescriptionMicrotheory ), $const121$UniversalVocabularyMt );
        sks_set_source_description_mt( sks, sd );
      }
    }
    if( NIL == sks_get_physical_schemabase_mt( sks ) )
    {
      final SubLObject psb = sks_guess_psb( sks );
      if( NIL != psb )
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, psb, $const306$SKSIPhysicalSchemaDescriptionMicr ), $const121$UniversalVocabularyMt );
        sks_set_physical_schemabase_mt( sks, psb );
      }
    }
    if( NIL == sks_get_logical_schemabase_mt( sks ) )
    {
      final SubLObject lsb = sks_guess_lsb( sks );
      if( NIL != lsb )
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, lsb, $const329$SKSILogicalSchemaDescriptionMicro ), $const121$UniversalVocabularyMt );
        sks_set_logical_schemabase_mt( sks, lsb );
      }
    }
    if( NIL == sks_get_translation_schemabase_mt( sks ) )
    {
      final SubLObject tsb = sks_guess_tsb( sks );
      if( NIL != tsb )
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const211$isa, tsb, $const347$SKSISchemaTranslationMicrotheory ), $const121$UniversalVocabularyMt );
        sks_set_translation_schemabase_mt( sks, tsb );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 79860L)
  public static SubLObject get_all_sds()
  {
    return isa.all_fort_instances( $const361$SKSISchemaDescriptionMicrotheory, $const121$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 79983L)
  public static SubLObject get_all_psbs()
  {
    return isa.all_fort_instances( $const306$SKSIPhysicalSchemaDescriptionMicr, $const121$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80113L)
  public static SubLObject get_all_lsbs()
  {
    return isa.all_fort_instances( $const329$SKSILogicalSchemaDescriptionMicro, $const121$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80242L)
  public static SubLObject get_all_tsbs()
  {
    return isa.all_fort_instances( $const347$SKSISchemaTranslationMicrotheory, $const121$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80364L)
  public static SubLObject sksi_form(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_utilities.$cb_default_fort_handler$.currentBinding( thread );
    try
    {
      cb_utilities.$cb_default_fort_handler$.bind( $str16$sksi_smt, thread );
      cb_utilities.cb_form( v_object, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      cb_utilities.$cb_default_fort_handler$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80559L)
  public static SubLObject sksi_arghash_form(final SubLObject arghash, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_utilities.$cb_default_fort_handler$.currentBinding( thread );
    try
    {
      cb_utilities.$cb_default_fort_handler$.bind( html_arghash.html_arghash_href( arghash, $str16$sksi_smt ), thread );
      cb_utilities.cb_form( v_object, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      cb_utilities.$cb_default_fort_handler$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80727L)
  public static SubLObject amt_mts(final SubLObject term_list, SubLObject include_meta_assertionsP)
  {
    if( include_meta_assertionsP == UNPROVIDED )
    {
      include_meta_assertionsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym338$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const339$EverythingPSC, thread );
      final SubLObject assertions = virtual_indexing.assertions_mentioning_terms( term_list, include_meta_assertionsP );
      SubLObject mts = NIL;
      SubLObject cdolist_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, mts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          mts = ConsesLow.cons( item_var, mts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
      result = Sort.sort( mts, $sym362$GENERALITY_ESTIMATE_, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 81089L)
  public static SubLObject sks_guess_sd(final SubLObject sks)
  {
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return amt_mts( ConsesLow.list( sks, $const142$sksIsa ), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 81197L)
  public static SubLObject sks_guess_psb(final SubLObject sks)
  {
    final SubLObject sub_skss = sksi_sks_accessors.sks_get( sks, $const363$subKS_Direct, UNPROVIDED );
    SubLObject mt_list = NIL;
    SubLObject cdolist_list_var = sub_skss;
    SubLObject sub_sks = NIL;
    sub_sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject poss_ps = sksi_sks_accessors.sks_fget( sub_sks, $const364$physicalSchemaSourceMap, UNPROVIDED );
      if( NIL != poss_ps )
      {
        mt_list = ConsesLow.cons( amt_mts( ConsesLow.list( $const365$physicalFields, poss_ps ), UNPROVIDED ), mt_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_sks = cdolist_list_var.first();
    }
    return list_utilities.hash_remove_duplicates( Functions.apply( $sym366$APPEND, mt_list ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 81544L)
  public static SubLObject sks_guess_lsb(final SubLObject sks)
  {
    final SubLObject sub_skss = sksi_sks_accessors.sks_get( sks, $const363$subKS_Direct, UNPROVIDED );
    SubLObject mt_list = NIL;
    SubLObject cdolist_list_var = sub_skss;
    SubLObject sub_sks = NIL;
    sub_sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject poss_ps = sksi_sks_accessors.sks_fget( sub_sks, $const364$physicalSchemaSourceMap, UNPROVIDED );
      if( NIL != poss_ps )
      {
        final SubLObject poss_ls = kb_mapping_utilities.fpred_value_in_any_mt( poss_ps, $const167$logicalPhysicalSchemaMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
        if( NIL != poss_ls )
        {
          mt_list = ConsesLow.cons( amt_mts( ConsesLow.list( $const337$logicalFields, poss_ls ), UNPROVIDED ), mt_list );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_sks = cdolist_list_var.first();
    }
    return list_utilities.hash_remove_duplicates( Functions.apply( $sym366$APPEND, mt_list ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 82000L)
  public static SubLObject sks_guess_tsb(final SubLObject sks)
  {
    final SubLObject sub_skss = sksi_sks_accessors.sks_get( sks, $const363$subKS_Direct, UNPROVIDED );
    SubLObject mt_list = NIL;
    SubLObject cdolist_list_var = sub_skss;
    SubLObject sub_sks = NIL;
    sub_sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject poss_ps = sksi_sks_accessors.sks_fget( sub_sks, $const364$physicalSchemaSourceMap, UNPROVIDED );
      if( NIL != poss_ps )
      {
        final SubLObject poss_ls = kb_mapping_utilities.fpred_value_in_any_mt( poss_ps, $const167$logicalPhysicalSchemaMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
        if( NIL != poss_ls )
        {
          mt_list = ConsesLow.cons( amt_mts( ConsesLow.list( poss_ps, poss_ls ), UNPROVIDED ), mt_list );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_sks = cdolist_list_var.first();
    }
    return list_utilities.hash_remove_duplicates( Functions.apply( $sym366$APPEND, mt_list ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 82448L)
  public static SubLObject sksi_psb_get_schemata(final SubLObject psb)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject physical_schemata = NIL;
    final SubLObject relation = $const367$enumerableSchema;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym368$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( psb, thread );
      final SubLObject pred_var = relation;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$129 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$130 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
          SubLObject done_var = NIL;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw369$GAF, NIL, NIL );
                SubLObject done_var_$131 = NIL;
                final SubLObject token_var_$132 = NIL;
                while ( NIL == done_var_$131)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$132 );
                  final SubLObject valid_$133 = makeBoolean( !token_var_$132.eql( assertion ) );
                  if( NIL != valid_$133 )
                  {
                    final SubLObject pcase_var = assertions_high.assertion_truth( assertion );
                    if( pcase_var.eql( $kw370$TRUE ) )
                    {
                      physical_schemata = ConsesLow.cons( cycl_utilities.sentence_arg1( assertion, UNPROVIDED ), physical_schemata );
                    }
                    else if( pcase_var.eql( $kw371$FALSE ) )
                    {
                      physical_schemata = ConsesLow.cons( cycl_utilities.sentence_arg1( cycl_utilities.sentence_arg1( assertion, UNPROVIDED ), UNPROVIDED ), physical_schemata );
                    }
                  }
                  done_var_$131 = makeBoolean( NIL == valid_$133 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$130, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$130, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$129, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.hash_remove_duplicates( physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 82935L)
  public static SubLObject sksi_psb_get_labeled_schemata(final SubLObject psb)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    if( NIL != forts.fort_p( psb ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject physical_schemata = cdolist_list_var = sksi_psb_get_schemata( psb );
      SubLObject physical_schema = NIL;
      physical_schema = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym368$RELEVANT_MT_IS_EQ, thread );
          mt_relevance_macros.$mt$.bind( psb, thread );
          final SubLObject table_name = kb_mapping_utilities.fpred_value( physical_schema, $const373$schemaName_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject schema_name = kb_mapping_utilities.fpred_value( physical_schema, $const374$schemaNameSchema_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          results = ConsesLow.cons( ConsesLow.list( schema_name, table_name, physical_schema ), results );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        physical_schema = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 83453L)
  public static SubLObject sksi_lsb_get_schemata(final SubLObject lsb)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject logical_schemata = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym368$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( lsb, thread );
      final SubLObject pred_var = $const337$logicalFields;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$135 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$136 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
          SubLObject done_var = NIL;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw369$GAF, NIL, NIL );
                SubLObject done_var_$137 = NIL;
                final SubLObject token_var_$138 = NIL;
                while ( NIL == done_var_$137)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$138 );
                  final SubLObject valid_$139 = makeBoolean( !token_var_$138.eql( assertion ) );
                  if( NIL != valid_$139 )
                  {
                    logical_schemata = ConsesLow.cons( cycl_utilities.sentence_arg1( assertion, UNPROVIDED ), logical_schemata );
                  }
                  done_var_$137 = makeBoolean( NIL == valid_$139 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$136 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$136, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$136, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$135, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.hash_remove_duplicates( logical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 83717L)
  public static SubLObject sksi_tsb_get_translation_pairs(final SubLObject tsb)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject translation_pairs = NIL;
    final SubLObject iterator = map_utilities.new_map_iterator( sksi_tsb_get_lss_for_pss( tsb ) );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = var;
        SubLObject ps = NIL;
        SubLObject lss = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
        ps = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
        lss = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject cdolist_list_var = lss;
          SubLObject ls = NIL;
          ls = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            translation_pairs = ConsesLow.cons( ConsesLow.list( ps, ls ), translation_pairs );
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list375 );
        }
      }
    }
    translation_pairs = Sort.sort( translation_pairs, $sym376$FORT_NAME_, $sym289$FIRST );
    return translation_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 84029L)
  public static SubLObject sksi_tsb_get_lss_for_pss(final SubLObject tsb)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mappings = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym368$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( tsb, thread );
      final SubLObject pred_var = $const167$logicalPhysicalSchemaMap;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$141 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$142 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
          SubLObject done_var = NIL;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw369$GAF, NIL, NIL );
                SubLObject done_var_$143 = NIL;
                final SubLObject token_var_$144 = NIL;
                while ( NIL == done_var_$143)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$144 );
                  final SubLObject valid_$145 = makeBoolean( !token_var_$144.eql( assertion ) );
                  if( NIL != valid_$145 )
                  {
                    final SubLObject ls = cycl_utilities.sentence_arg1( assertion, UNPROVIDED );
                    final SubLObject ps = cycl_utilities.sentence_arg2( assertion, UNPROVIDED );
                    map_utilities.map_pushnew( mappings, ps, ls, UNPROVIDED, UNPROVIDED );
                  }
                  done_var_$143 = makeBoolean( NIL == valid_$145 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$142 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$142, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$142, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$141, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject iterator = map_utilities.new_map_iterator( mappings );
    SubLObject valid2;
    for( SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean( NIL == valid2 ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration.iteration_next( iterator );
      valid2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid2 )
      {
        SubLObject current;
        final SubLObject datum = current = var;
        SubLObject ps2 = NIL;
        SubLObject lss = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
        ps2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list375 );
        lss = current.first();
        current = current.rest();
        if( NIL == current )
        {
          lss = Sort.sort( lss, $sym376$FORT_NAME_, UNPROVIDED );
          map_utilities.map_put( mappings, ps2, lss );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list375 );
        }
      }
    }
    return mappings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 84585L)
  public static SubLObject sksi_sks_get_translations(final SubLObject sks, final SubLObject ps, final SubLObject ls, SubLObject tsb)
  {
    if( tsb == UNPROVIDED )
    {
      tsb = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject translation_pairs = NIL;
    SubLObject encodings = NIL;
    SubLObject encodings_matched = NIL;
    SubLObject decodings = NIL;
    SubLObject decodings_matched = NIL;
    if( NIL == tsb )
    {
      tsb = sks_get_tsb( sks );
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym368$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( tsb, thread );
      SubLObject pred_var = $const207$fieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$147 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$148 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
          SubLObject done_var = NIL;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw369$GAF, NIL, NIL );
                SubLObject done_var_$149 = NIL;
                final SubLObject token_var_$150 = NIL;
                while ( NIL == done_var_$149)
                {
                  final SubLObject encoding = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$150 );
                  final SubLObject valid_$151 = makeBoolean( !token_var_$150.eql( encoding ) );
                  if( NIL != valid_$151 && cycl_utilities.sentence_arg3( encoding, UNPROVIDED ).eql( ls ) && cycl_utilities.sentence_arg1( encoding, UNPROVIDED ).eql( ps ) )
                  {
                    final SubLObject item_var = encoding;
                    if( NIL == conses_high.member( item_var, encodings, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      encodings = ConsesLow.cons( item_var, encodings );
                    }
                  }
                  done_var_$149 = makeBoolean( NIL == valid_$151 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$148, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$148, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$147, thread );
        }
      }
      pred_var = $const176$fieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$149 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$149 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
          SubLObject done_var = NIL;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw369$GAF, NIL, NIL );
                SubLObject done_var_$150 = NIL;
                final SubLObject token_var_$151 = NIL;
                while ( NIL == done_var_$150)
                {
                  final SubLObject decoding = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$151 );
                  final SubLObject valid_$152 = makeBoolean( !token_var_$151.eql( decoding ) );
                  if( NIL != valid_$152 && cycl_utilities.sentence_arg3( decoding, UNPROVIDED ).eql( ps ) && cycl_utilities.sentence_arg1( decoding, UNPROVIDED ).eql( ls ) )
                  {
                    final SubLObject item_var = decoding;
                    if( NIL == conses_high.member( item_var, decodings, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      decodings = ConsesLow.cons( item_var, decodings );
                    }
                  }
                  done_var_$150 = makeBoolean( NIL == valid_$152 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$150, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$149, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$149, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = encodings;
    SubLObject encoding2 = NIL;
    encoding2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$159 = decodings;
      SubLObject decoding2 = NIL;
      decoding2 = cdolist_list_var_$159.first();
      while ( NIL != cdolist_list_var_$159)
      {
        final SubLObject physical_field = cycl_utilities.sentence_arg2( encoding2, UNPROVIDED );
        final SubLObject logical_field = cycl_utilities.sentence_arg2( decoding2, UNPROVIDED );
        if( NIL != list_utilities.tree_find( physical_field, cycl_utilities.sentence_arg4( decoding2, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) || NIL != list_utilities.tree_find( logical_field, cycl_utilities
            .sentence_arg4( encoding2, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject item_var2 = encoding2;
          if( NIL == conses_high.member( item_var2, encodings_matched, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            encodings_matched = ConsesLow.cons( item_var2, encodings_matched );
          }
          item_var2 = decoding2;
          if( NIL == conses_high.member( item_var2, decodings_matched, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            decodings_matched = ConsesLow.cons( item_var2, decodings_matched );
          }
          item_var2 = ConsesLow.list( encoding2, decoding2 );
          if( NIL == conses_high.member( item_var2, translation_pairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            translation_pairs = ConsesLow.cons( item_var2, translation_pairs );
          }
        }
        cdolist_list_var_$159 = cdolist_list_var_$159.rest();
        decoding2 = cdolist_list_var_$159.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      encoding2 = cdolist_list_var.first();
    }
    return Values.values( translation_pairs, conses_high.set_difference( encodings, encodings_matched, UNPROVIDED, UNPROVIDED ), conses_high.set_difference( decodings, decodings_matched, UNPROVIDED, UNPROVIDED ) );
  }

  public static SubLObject declare_sksi_smt_file()
  {
    SubLFiles.declareFunction( me, "cb_link_edit_in_smt", "CB-LINK-EDIT-IN-SMT", 1, 1, false );
    SubLFiles.declareFunction( me, "smt_edit_button", "SMT-EDIT-BUTTON", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_smt", "CB-LINK-SMT", 0, 1, false );
    SubLFiles.declareFunction( me, "sksi_smt", "SKSI-SMT", 0, 1, false );
    SubLFiles.declareFunction( me, "sksi_smt_int", "SKSI-SMT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_main_page", "SKSI-SMT-MAIN-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_main_actions", "SKSI-SMT-MAIN-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_sks_page", "SKSI-SMT-EDIT-SKS-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_sks_page_main_table", "SKSI-SMT-EDIT-SKS-PAGE-MAIN-TABLE", 2, 4, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_sks_actions", "SKSI-SMT-EDIT-SKS-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_html_sks_status_line", "SKSI-SMT-HTML-SKS-STATUS-LINE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_sd_page", "SKSI-SMT-EDIT-SD-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_sd_actions", "SKSI-SMT-EDIT-SD-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_update_source_description", "SKSI-SMT-UPDATE-SOURCE-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_compile_source_description", "SKSI-SMT-COMPILE-SOURCE-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_smt_compile_param_definitions", "CLEAR-SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sksi_smt_compile_param_definitions", "REMOVE-SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_compile_param_definitions_internal", "SKSI-SMT-COMPILE-PARAM-DEFINITIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_compile_param_definitions", "SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_register_structured_knowledge_source", "SKSI-SMT-REGISTER-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_structured_knowledge_source_registeredP", "SKSI-SMT-STRUCTURED-KNOWLEDGE-SOURCE-REGISTERED?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ps_compile_pfs_info", "SKSI-PS-COMPILE-PFS-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ps_page", "SKSI-SMT-EDIT-PS-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ps_actions", "SKSI-SMT-EDIT-PS-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_logical_field_values_for_logical_schema", "SKSI-SMT-LOGICAL-FIELD-VALUES-FOR-LOGICAL-SCHEMA", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_fetch_simple_logical_schemata", "SKSI-SMT-FETCH-SIMPLE-LOGICAL-SCHEMATA", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_retrieve_simple_logical_schemata", "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMATA", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_retrieve_simple_logical_schema", "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMA", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_unpack_decoding_conversion_expression", "SKSI-SMT-UNPACK-DECODING-CONVERSION-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "enable_sksi_smt_mode", "ENABLE-SKSI-SMT-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "disable_sksi_smt_mode", "DISABLE-SKSI-SMT-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "is_sksi_smt_mode_enabledP", "IS-SKSI-SMT-MODE-ENABLED?", 0, 0, false );
    SubLFiles.declareFunction( me, "get_sksi_smt_mode", "GET-SKSI-SMT-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_get_units_of_measurement", "SKSI-SMT-GET-UNITS-OF-MEASUREMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_assemble_units_result", "SKSI-SMT-ASSEMBLE-UNITS-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_uninteresting_units_filter_fn", "SKSI-SMT-UNINTERESTING-UNITS-FILTER-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_get_rendering_tuples", "SKSI-SMT-GET-RENDERING-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_derive_simple_logical_schema", "SKSI-SMT-DERIVE-SIMPLE-LOGICAL-SCHEMA", 9, 1, false );
    SubLFiles.declareFunction( me, "sksi_smt_derive_indirecting_relation", "SKSI-SMT-DERIVE-INDIRECTING-RELATION", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_physical_field_value_indexical_for_pf", "SKSI-SMT-PHYSICAL-FIELD-VALUE-INDEXICAL-FOR-PF", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_physical_field_for_pfi", "SKSI-SMT-PHYSICAL-FIELD-FOR-PFI", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_determine_dependent_colname", "SKSI-SMT-DETERMINE-DEPENDENT-COLNAME", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_determine_lf_conversion", "SKSI-SMT-DETERMINE-LF-CONVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_determine_pf_conversion", "SKSI-SMT-DETERMINE-PF-CONVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_smt_column_or_fort_name", "CLEAR-SKSI-SMT-COLUMN-OR-FORT-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sksi_smt_column_or_fort_name", "REMOVE-SKSI-SMT-COLUMN-OR-FORT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_column_or_fort_name_internal", "SKSI-SMT-COLUMN-OR-FORT-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_column_or_fort_name", "SKSI-SMT-COLUMN-OR-FORT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ls_page", "SKSI-SMT-EDIT-LS-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ls_actions", "SKSI-SMT-EDIT-LS-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_lf_page", "SKSI-SMT-EDIT-LF-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_lf_actions", "SKSI-SMT-EDIT-LF-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ts_page", "SKSI-SMT-EDIT-TS-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_sksi_show_translation", "HTML-SKSI-SHOW-TRANSLATION", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ts_actions", "SKSI-SMT-EDIT-TS-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_t_page", "SKSI-SMT-EDIT-T-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_t_actions", "SKSI-SMT-EDIT-T-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ms_page", "SKSI-SMT-EDIT-MS-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_edit_ms_actions", "SKSI-SMT-EDIT-MS-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_decode_psb_page", "SKSI-SMT-DECODE-PSB-PAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_decode_psb_actions", "SKSI-SMT-DECODE-PSB-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_sd", "SKS-GET-SD", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_source_description_mt", "SKS-GET-SOURCE-DESCRIPTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_new_sd", "SKS-NEW-SD", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_psb", "SKS-GET-PSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_physical_schemabase_mt", "SKS-GET-PHYSICAL-SCHEMABASE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_new_psb", "SKS-NEW-PSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_lsb", "SKS-GET-LSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_logical_schemabase_mt", "SKS-GET-LOGICAL-SCHEMABASE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_tsb", "SKS-GET-TSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_translation_schemabase_mt", "SKS-GET-TRANSLATION-SCHEMABASE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_bridging_or_content_mt", "SKS-GET-BRIDGING-OR-CONTENT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_cmt", "SKS-GET-CMT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_bmt", "SKS-GET-BMT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_set_source_description_mt", "SKS-SET-SOURCE-DESCRIPTION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_set_physical_schemabase_mt", "SKS-SET-PHYSICAL-SCHEMABASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_set_logical_schemabase_mt", "SKS-SET-LOGICAL-SCHEMABASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_set_translation_schemabase_mt", "SKS-SET-TRANSLATION-SCHEMABASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_check_isa_invariant", "SKSI-SMT-CHECK-ISA-INVARIANT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_source_description_p", "SKSI-SOURCE-DESCRIPTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_sd_get_mt", "SKSI-SD-GET-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_physical_schemabase_p", "SKSI-PHYSICAL-SCHEMABASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_psb_get_name", "SKSI-PSB-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_psb_get_mt", "SKSI-PSB-GET-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_physical_schema_p", "SKSI-PHYSICAL-SCHEMA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ps_get_name", "SKSI-PS-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ps_get_pfs", "SKSI-PS-GET-PFS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_physical_field_p", "SKSI-PHYSICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pf_get_ps", "SKSI-PF-GET-PS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pf_get_name", "SKSI-PF-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pf_get_datatype", "SKSI-PF-GET-DATATYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pf_get_nullable", "SKSI-PF-GET-NULLABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pf_get_default_value", "SKSI-PF-GET-DEFAULT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pf_get_key_type", "SKSI-PF-GET-KEY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_logical_schemabase_p", "SKSI-LOGICAL-SCHEMABASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_logical_schemabase", "NEW-LOGICAL-SCHEMABASE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_lsb_get_mt", "SKSI-LSB-GET-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_logical_schema_p", "SKSI-LOGICAL-SCHEMA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_logical_schema", "NEW-LOGICAL-SCHEMA", 2, 2, false );
    SubLFiles.declareFunction( me, "new_or_recycled_logical_schema", "NEW-OR-RECYCLED-LOGICAL-SCHEMA", 2, 3, false );
    SubLFiles.declareFunction( me, "sksi_ls_get_name", "SKSI-LS-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ls_get_lfs", "SKSI-LS-GET-LFS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ls_get_mss", "SKSI-LS-GET-MSS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ls_get_ps", "SKSI-LS-GET-PS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_logical_field_p", "SKSI-LOGICAL-FIELD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_next_id", "SKSI-NEXT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "new_logical_field", "NEW-LOGICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_lf_convert_to_constant", "SKSI-LF-CONVERT-TO-CONSTANT", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_lf_get_genls", "SKSI-LF-GET-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_lf_get_isas", "SKSI-LF-GET-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_lf_get_cycl", "SKSI-LF-GET-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_meaning_sentence_p", "SKSI-MEANING-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ms_get_cycl", "SKSI-MS-GET-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ms_get_asserted", "SKSI-MS-GET-ASSERTED", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_translation_schemabase_p", "SKSI-TRANSLATION-SCHEMABASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_translation_schemabase", "NEW-TRANSLATION-SCHEMABASE", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_tsb_get_mt", "SKSI-TSB-GET-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_physical_structure_of_sks", "DECODE-PHYSICAL-STRUCTURE-OF-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_structured_knowledge_source", "NEW-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_conceptual_mapping_logical_schema", "NEW-CONCEPTUAL-MAPPING-LOGICAL-SCHEMA", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_smt_get_available_database_types", "SKSI-SMT-GET-AVAILABLE-DATABASE-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "sks_initialize_all_sks_description_mts", "SKS-INITIALIZE-ALL-SKS-DESCRIPTION-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sks_initialize_description_mts", "SKS-INITIALIZE-DESCRIPTION-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_sds", "GET-ALL-SDS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_psbs", "GET-ALL-PSBS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_lsbs", "GET-ALL-LSBS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_tsbs", "GET-ALL-TSBS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_form", "SKSI-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_arghash_form", "SKSI-ARGHASH-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "amt_mts", "AMT-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "sks_guess_sd", "SKS-GUESS-SD", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_guess_psb", "SKS-GUESS-PSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_guess_lsb", "SKS-GUESS-LSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_guess_tsb", "SKS-GUESS-TSB", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_psb_get_schemata", "SKSI-PSB-GET-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_psb_get_labeled_schemata", "SKSI-PSB-GET-LABELED-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_lsb_get_schemata", "SKSI-LSB-GET-SCHEMATA", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_tsb_get_translation_pairs", "SKSI-TSB-GET-TRANSLATION-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_tsb_get_lss_for_pss", "SKSI-TSB-GET-LSS-FOR-PSS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_sks_get_translations", "SKSI-SKS-GET-TRANSLATIONS", 3, 1, false );
    return NIL;
  }

  public static SubLObject init_sksi_smt_file()
  {
    $allow_smt_editing_links$ = SubLFiles.defparameter( "*ALLOW-SMT-EDITING-LINKS*", NIL );
    $sksi_smt_sd_parameters$ = SubLFiles.deflexical( "*SKSI-SMT-SD-PARAMETERS*", $list122 );
    $sksi_smt_compile_param_definitions_caching_state$ = SubLFiles.deflexical( "*SKSI-SMT-COMPILE-PARAM-DEFINITIONS-CACHING-STATE*", NIL );
    $sksi_smt_mode$ = SubLFiles.deflexical( "*SKSI-SMT-MODE*", $kw189$ENABLED );
    $sksi_smt_column_or_fort_name_caching_state$ = SubLFiles.deflexical( "*SKSI-SMT-COLUMN-OR-FORT-NAME-CACHING-STATE*", NIL );
    $sksi_smt_warn_about_invariantsP$ = SubLFiles.defparameter( "*SKSI-SMT-WARN-ABOUT-INVARIANTS?*", NIL );
    $sksi_isg$ = SubLFiles.deflexical( "*SKSI-ISG*", maybeDefault( $sym340$_SKSI_ISG_, $sksi_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_sksi_smt_file()
  {
    cb_utilities.setup_cb_link_method( $kw8$EDIT_IN_SMT, $sym9$CB_LINK_EDIT_IN_SMT, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw17$SMT, $sym18$CB_LINK_SMT, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw17$SMT, $str19$SMT, $str19$SMT, $str20$Schema_Modeling_Tool );
    html_macros.note_cgi_handler_function( $sym21$SKSI_SMT, $kw22$HTML_HANDLER );
    access_macros.register_external_symbol( $sym137$SKSI_SMT_UPDATE_SOURCE_DESCRIPTION );
    access_macros.register_external_symbol( $sym139$SKSI_SMT_COMPILE_SOURCE_DESCRIPTION );
    memoization_state.note_globally_cached_function( $sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS );
    access_macros.register_external_symbol( $sym147$SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE );
    access_macros.register_external_symbol( $sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_ );
    access_macros.register_external_symbol( $sym150$SKSI_PS_COMPILE_PFS_INFO );
    access_macros.register_external_symbol( $sym165$SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA );
    access_macros.register_external_symbol( $sym168$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA );
    access_macros.register_external_symbol( $sym169$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA );
    access_macros.register_external_symbol( $sym190$ENABLE_SKSI_SMT_MODE );
    access_macros.register_external_symbol( $sym191$DISABLE_SKSI_SMT_MODE );
    access_macros.register_external_symbol( $sym193$IS_SKSI_SMT_MODE_ENABLED_ );
    access_macros.register_external_symbol( $sym194$GET_SKSI_SMT_MODE );
    access_macros.register_external_symbol( $sym195$SKSI_SMT_GET_UNITS_OF_MEASUREMENT );
    access_macros.register_external_symbol( $sym199$SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA );
    memoization_state.note_globally_cached_function( $sym230$SKSI_SMT_COLUMN_OR_FORT_NAME );
    utilities_macros.register_html_state_variable( $sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__ );
    subl_macro_promotions.declare_defglobal( $sym340$_SKSI_ISG_ );
    access_macros.register_external_symbol( $sym350$DECODE_PHYSICAL_STRUCTURE_OF_SKS );
    access_macros.register_external_symbol( $sym351$NEW_STRUCTURED_KNOWLEDGE_SOURCE );
    access_macros.register_external_symbol( $sym356$NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA );
    access_macros.register_external_symbol( $sym359$SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES );
    access_macros.register_external_symbol( $sym372$SKSI_PSB_GET_LABELED_SCHEMATA );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_smt_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_smt_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_smt_file();
  }
  static
  {
    me = new sksi_smt();
    $allow_smt_editing_links$ = null;
    $sksi_smt_sd_parameters$ = null;
    $sksi_smt_compile_param_definitions_caching_state$ = null;
    $sksi_smt_mode$ = null;
    $sksi_smt_column_or_fort_name_caching_state$ = null;
    $sksi_smt_warn_about_invariantsP$ = null;
    $sksi_isg$ = null;
    $str0$_Edit_in_SMT_ = makeString( "[Edit in SMT]" );
    $str1$http___ = makeString( "http://" );
    $str2$_ = makeString( ":" );
    $str3$_SchemaModelingTool__sksName_ = makeString( "/SchemaModelingTool/?sksName=" );
    $str4$_cyc_server_ = makeString( "&cyc.server=" );
    $str5$_cyc_defaultCyclist_ = makeString( "&cyc.defaultCyclist=" );
    $str6$Will_open_in_new_browser_window = makeString( "Will open in new browser window" );
    $str7$_blank = makeString( "_blank" );
    $kw8$EDIT_IN_SMT = makeKeyword( "EDIT-IN-SMT" );
    $sym9$CB_LINK_EDIT_IN_SMT = makeSymbol( "CB-LINK-EDIT-IN-SMT" );
    $str10$Edit = makeString( "Edit" );
    $str11$window_open__ = makeString( "window.open('" );
    $str12$___ = makeString( "');" );
    $kw13$BUTTON = makeKeyword( "BUTTON" );
    $str14$CMT = makeString( "CMT" );
    $kw15$MAIN = makeKeyword( "MAIN" );
    $str16$sksi_smt = makeString( "sksi-smt" );
    $kw17$SMT = makeKeyword( "SMT" );
    $sym18$CB_LINK_SMT = makeSymbol( "CB-LINK-SMT" );
    $str19$SMT = makeString( "SMT" );
    $str20$Schema_Modeling_Tool = makeString( "Schema Modeling Tool" );
    $sym21$SKSI_SMT = makeSymbol( "SKSI-SMT" );
    $kw22$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym23$ARGHASH_P = makeSymbol( "ARGHASH-P" );
    $str24$COMMAND = makeString( "COMMAND" );
    $str25$TO = makeString( "TO" );
    $kw26$ON_EDIT_SKS = makeKeyword( "ON-EDIT-SKS" );
    $kw27$ON_EDIT_SD = makeKeyword( "ON-EDIT-SD" );
    $kw28$ON_EDIT_PS = makeKeyword( "ON-EDIT-PS" );
    $kw29$ON_EDIT_LS = makeKeyword( "ON-EDIT-LS" );
    $kw30$ON_EDIT_LF = makeKeyword( "ON-EDIT-LF" );
    $kw31$ON_EDIT_MS = makeKeyword( "ON-EDIT-MS" );
    $kw32$ON_DECODE_PSB = makeKeyword( "ON-DECODE-PSB" );
    $kw33$ON_EDIT_TS = makeKeyword( "ON-EDIT-TS" );
    $kw34$ON_EDIT_T = makeKeyword( "ON-EDIT-T" );
    $kw35$ON_MAIN = makeKeyword( "ON-MAIN" );
    $str36$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str37$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw38$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw39$CB_CYC = makeKeyword( "CB-CYC" );
    $str40$cg_sksi_smt = makeString( "cg?sksi-smt" );
    $str41$post = makeString( "post" );
    $kw42$JUST_FORT = makeKeyword( "JUST-FORT" );
    $const43$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource" ) );
    $kw44$SKS = makeKeyword( "SKS" );
    $kw45$TO_EDIT_SKS = makeKeyword( "TO-EDIT-SKS" );
    $const46$PhysicalSchema = constant_handles.reader_make_constant_shell( makeString( "PhysicalSchema" ) );
    $kw47$PS = makeKeyword( "PS" );
    $kw48$TO_EDIT_PS = makeKeyword( "TO-EDIT-PS" );
    $const49$LogicalSchema = constant_handles.reader_make_constant_shell( makeString( "LogicalSchema" ) );
    $kw50$LS = makeKeyword( "LS" );
    $kw51$TO_EDIT_LS = makeKeyword( "TO-EDIT-LS" );
    $const52$PhysicalField = constant_handles.reader_make_constant_shell( makeString( "PhysicalField" ) );
    $kw53$PF = makeKeyword( "PF" );
    $kw54$TO_EDIT_PF = makeKeyword( "TO-EDIT-PF" );
    $const55$LogicalField = constant_handles.reader_make_constant_shell( makeString( "LogicalField" ) );
    $kw56$LF = makeKeyword( "LF" );
    $kw57$TO_EDIT_LF = makeKeyword( "TO-EDIT-LF" );
    $str58$Error__Support_for_term_ = makeString( "Error: Support for term " );
    $str59$_not_implemented = makeString( " not implemented" );
    $kw60$ERROR = makeKeyword( "ERROR" );
    $str61$Error__ = makeString( "Error: " );
    $sym62$FORMAT = makeSymbol( "FORMAT" );
    $kw63$SUCCESS = makeKeyword( "SUCCESS" );
    $str64$Success__ = makeString( "Success: " );
    $kw65$TO_EDIT_SD = makeKeyword( "TO-EDIT-SD" );
    $kw66$TO_EDIT_MS = makeKeyword( "TO-EDIT-MS" );
    $kw67$TO_EDIT_TS = makeKeyword( "TO-EDIT-TS" );
    $kw68$TO_EDIT_T = makeKeyword( "TO-EDIT-T" );
    $kw69$TO_MAIN = makeKeyword( "TO-MAIN" );
    $kw70$TO_DECODE_PSB = makeKeyword( "TO-DECODE-PSB" );
    $str71$Error__button_ = makeString( "Error: button " );
    $str72$Error__fort_type_for_ = makeString( "Error: fort-type for " );
    $str73$_not_supported = makeString( " not supported" );
    $str74$Create_new_SKS_named__ = makeString( "Create new SKS named: " );
    $kw75$NEW_SKS_NAME = makeKeyword( "NEW-SKS-NAME" );
    $int76$40 = makeInteger( 40 );
    $str77$Create = makeString( "Create" );
    $kw78$COMMAND_EDIT_SKS = makeKeyword( "COMMAND-EDIT-SKS" );
    $str79$Knowledge_Source_ = makeString( "Knowledge Source:" );
    $kw80$NBSP = makeKeyword( "NBSP" );
    $kw81$TOP = makeKeyword( "TOP" );
    $str82$Source_Description__ = makeString( "Source Description: " );
    $str83$Physical_Schemabase__ = makeString( "Physical Schemabase: " );
    $str84$Logical_Schemabase__ = makeString( "Logical Schemabase: " );
    $str85$Translation_Schemabase__ = makeString( "Translation Schemabase: " );
    $str86$Other_Physical_Schemabases_ = makeString( "Other Physical Schemabases:" );
    $str87$Other_Logical_Schemabases_ = makeString( "Other Logical Schemabases:" );
    $str88$Other_Translations_Schemabases_ = makeString( "Other Translations Schemabases:" );
    $str89$Please_enter_an_SKS_name_ = makeString( "Please enter an SKS name." );
    $str90$Edit_SKS__ = makeString( "Edit SKS: " );
    $str91$Name__ = makeString( "Name: " );
    $kw92$SKS_NAMESTRING = makeKeyword( "SKS-NAMESTRING" );
    $const93$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $int94$80 = makeInteger( 80 );
    $kw95$RIGHT = makeKeyword( "RIGHT" );
    $str96$Add = makeString( "Add" );
    $kw97$COMMAND_EDIT_SD = makeKeyword( "COMMAND-EDIT-SD" );
    $str98$Decode = makeString( "Decode" );
    $kw99$DECODE_PSB = makeKeyword( "DECODE-PSB" );
    $str100$Remove = makeString( "Remove" );
    $kw101$REMOVE_PSB = makeKeyword( "REMOVE-PSB" );
    $kw102$COMMAND_REMOVE_LSB = makeKeyword( "COMMAND-REMOVE-LSB" );
    $kw103$LSB = makeKeyword( "LSB" );
    $kw104$COMMAND_EDIT_LSB = makeKeyword( "COMMAND-EDIT-LSB" );
    $kw105$COMMAND_REMOVE_TSB = makeKeyword( "COMMAND-REMOVE-TSB" );
    $kw106$TSB = makeKeyword( "TSB" );
    $str107$Refresh = makeString( "Refresh" );
    $kw108$REFRESH = makeKeyword( "REFRESH" );
    $str109$OK = makeString( "OK" );
    $kw110$OK = makeKeyword( "OK" );
    $str111$Cancel = makeString( "Cancel" );
    $kw112$LEFT = makeKeyword( "LEFT" );
    $str113$Physical_Schemata_ = makeString( "Physical Schemata:" );
    $str114$Logical_Schemata_ = makeString( "Logical Schemata:" );
    $str115$Translations_ = makeString( "Translations:" );
    $str116$View = makeString( "View" );
    $kw117$COMMAND_EDIT_PS = makeKeyword( "COMMAND-EDIT-PS" );
    $kw118$COMMAND_EDIT_LS = makeKeyword( "COMMAND-EDIT-LS" );
    $kw119$COMMAND_EDIT_TS = makeKeyword( "COMMAND-EDIT-TS" );
    $const120$sksPhysicalSchemaDescriptionMt = constant_handles.reader_make_constant_shell( makeString( "sksPhysicalSchemaDescriptionMt" ) );
    $const121$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $list122 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SKSISupportedStructuredKnowledgeSourceType" ) ), constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) ), constant_handles.reader_make_constant_shell( makeString(
            "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString( "sqlProgramForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSISupportedDatabaseServerProgram" ) ),
      constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) ), constant_handles.reader_make_constant_shell(
          makeString( "userNameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString( "passwordForSKS" ) ), constant_handles
              .reader_make_constant_shell( makeString( "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString( "portNumberForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "sksProxyHost" ) ), constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "sksProxyPort" ) ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) )
    } );
    $str123$This_SKS_is_currently_ = makeString( "This SKS is currently " );
    $str124$accessible = makeString( "accessible" );
    $str125$not_accessible = makeString( "not accessible" );
    $str126$_ = makeString( "." );
    $kw127$SD = makeKeyword( "SD" );
    $str128$Edit_Source_Description__ = makeString( "Edit Source Description: " );
    $str129$Parameter = makeString( "Parameter" );
    $str130$Value = makeString( "Value" );
    $const131$CharacterString = constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) );
    $const132$Integer = constant_handles.reader_make_constant_shell( makeString( "Integer" ) );
    $kw133$INTEGER = makeKeyword( "INTEGER" );
    $kw134$FORT = makeKeyword( "FORT" );
    $sym135$FORT_NAME = makeSymbol( "FORT-NAME" );
    $str136$Changed__A__A_from__A_to__A = makeString( "Changed ~A ~A from ~A to ~A" );
    $sym137$SKSI_SMT_UPDATE_SOURCE_DESCRIPTION = makeSymbol( "SKSI-SMT-UPDATE-SOURCE-DESCRIPTION" );
    $list138 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "NEW-VALUE" ) );
    $sym139$SKSI_SMT_COMPILE_SOURCE_DESCRIPTION = makeSymbol( "SKSI-SMT-COMPILE-SOURCE-DESCRIPTION" );
    $list140 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "CONSTRAINT" ) );
    $sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS = makeSymbol( "SKSI-SMT-COMPILE-PARAM-DEFINITIONS" );
    $const142$sksIsa = constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) );
    $const143$subProtocolForSKS = constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) );
    $const144$SKSISupportedDatabaseServerProgra = constant_handles.reader_make_constant_shell( makeString( "SKSISupportedDatabaseServerProgram" ) );
    $str145$Do_not_know_what_to_do_with_const = makeString( "Do not know what to do with constraint ~A." );
    $sym146$_SKSI_SMT_COMPILE_PARAM_DEFINITIONS_CACHING_STATE_ = makeSymbol( "*SKSI-SMT-COMPILE-PARAM-DEFINITIONS-CACHING-STATE*" );
    $sym147$SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE = makeSymbol( "SKSI-SMT-REGISTER-STRUCTURED-KNOWLEDGE-SOURCE" );
    $sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_ = makeSymbol( "SKSI-SMT-STRUCTURED-KNOWLEDGE-SOURCE-REGISTERED?" );
    $kw149$NOREG = makeKeyword( "NOREG" );
    $sym150$SKSI_PS_COMPILE_PFS_INFO = makeSymbol( "SKSI-PS-COMPILE-PFS-INFO" );
    $kw151$NAME = makeKeyword( "NAME" );
    $kw152$DATATYPE = makeKeyword( "DATATYPE" );
    $kw153$NULLABLE = makeKeyword( "NULLABLE" );
    $kw154$KEY_TYPE = makeKeyword( "KEY-TYPE" );
    $kw155$DEFAULT = makeKeyword( "DEFAULT" );
    $str156$Edit_Physical_Schema__ = makeString( "Edit Physical Schema: " );
    $str157$___ = makeString( " : " );
    $str158$Physical_fields_ = makeString( "Physical fields:" );
    $str159$Name = makeString( "Name" );
    $str160$Datatype = makeString( "Datatype" );
    $str161$Nullable = makeString( "Nullable" );
    $str162$Default_Value = makeString( "Default Value" );
    $str163$No_fields_in_this_physical_schema = makeString( "No fields in this physical schema." );
    $const164$TheLogicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "TheLogicalFieldValueFn" ) );
    $sym165$SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA = makeSymbol( "SKSI-SMT-FETCH-SIMPLE-LOGICAL-SCHEMATA" );
    $sym166$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $const167$logicalPhysicalSchemaMap = constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalSchemaMap" ) );
    $sym168$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA = makeSymbol( "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMATA" );
    $sym169$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA = makeSymbol( "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMA" );
    $str170$Could_not_retrieve_meaning_senten = makeString( "Could not retrieve meaning sentence for ~A" );
    $sym171$_BASE_PRED = makeSymbol( "?BASE-PRED" );
    $const172$correspondingSKSIPredicate = constant_handles.reader_make_constant_shell( makeString( "correspondingSKSIPredicate" ) );
    $str173$Dont_support_more_than_binary_pre = makeString( "Dont support more than binary predicates at this point." );
    $list174 = ConsesLow.list( makeSymbol( "ENCODING-ASS" ), makeSymbol( "DECODING-ASS" ) );
    $list175 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "LS" ), makeSymbol( "LFI" ), makeSymbol( "PS" ), makeSymbol( "PFI-EXPR" ) );
    $const176$fieldDecoding = constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) );
    $str177$Expected___fieldDecoding_sentence = makeString( "Expected #$fieldDecoding sentence, got ~A." );
    $kw178$PREDICATE = makeKeyword( "PREDICATE" );
    $kw179$PF1 = makeKeyword( "PF1" );
    $kw180$TERM = makeKeyword( "TERM" );
    $kw181$ARG_ISA = makeKeyword( "ARG-ISA" );
    $kw182$CONVERT = makeKeyword( "CONVERT" );
    $kw183$PF2 = makeKeyword( "PF2" );
    $const184$SchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) );
    $const185$SchemaObjectIDFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) );
    $const186$TheTerm = constant_handles.reader_make_constant_shell( makeString( "TheTerm" ) );
    $list187 = ConsesLow.list( makeSymbol( "LAMBDA-OPERATOR" ), makeSymbol( "VAR-LIST" ), makeSymbol( "EXPRESSION" ) );
    $str188$Do_not_know_how_to_unpack_decodin = makeString( "Do not know how to unpack decoding expression ~A." );
    $kw189$ENABLED = makeKeyword( "ENABLED" );
    $sym190$ENABLE_SKSI_SMT_MODE = makeSymbol( "ENABLE-SKSI-SMT-MODE" );
    $sym191$DISABLE_SKSI_SMT_MODE = makeSymbol( "DISABLE-SKSI-SMT-MODE" );
    $kw192$DISABLED = makeKeyword( "DISABLED" );
    $sym193$IS_SKSI_SMT_MODE_ENABLED_ = makeSymbol( "IS-SKSI-SMT-MODE-ENABLED?" );
    $sym194$GET_SKSI_SMT_MODE = makeSymbol( "GET-SKSI-SMT-MODE" );
    $sym195$SKSI_SMT_GET_UNITS_OF_MEASUREMENT = makeSymbol( "SKSI-SMT-GET-UNITS-OF-MEASUREMENT" );
    $sym196$SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN = makeSymbol( "SKSI-SMT-UNINTERESTING-UNITS-FILTER-FN" );
    $const197$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list198 = ConsesLow.list( makeSymbol( "STRING-SPEC" ), makeSymbol( "FORT" ) );
    $sym199$SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA = makeSymbol( "SKSI-SMT-DERIVE-SIMPLE-LOGICAL-SCHEMA" );
    $str200$_PS = makeString( "-PS" );
    $str201$_ = makeString( "-" );
    $str202$_LS = makeString( "-LS" );
    $const203$logicalSchemaFieldTypeList = constant_handles.reader_make_constant_shell( makeString( "logicalSchemaFieldTypeList" ) );
    $const204$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $const205$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) );
    $list206 = ConsesLow.list( makeSymbol( "PF" ), makeSymbol( "LFI" ), makeSymbol( "CONVERT" ) );
    $const207$fieldEncoding = constant_handles.reader_make_constant_shell( makeString( "fieldEncoding" ) );
    $const208$sksRepresentationComplete = constant_handles.reader_make_constant_shell( makeString( "sksRepresentationComplete" ) );
    $const209$SKSIMt = constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) );
    $str210$_Pred = makeString( "-Pred" );
    $const211$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list212 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ) );
    $const213$termDependsOn = constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) );
    $const214$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const215$arg1Isa = constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) );
    $const216$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $const217$backchainForbidden = constant_handles.reader_make_constant_shell( makeString( "backchainForbidden" ) );
    $list218 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SKSIOnlyPredicate" ) ) );
    $const219$backchainRequired = constant_handles.reader_make_constant_shell( makeString( "backchainRequired" ) );
    $const220$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $list221 = ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ) );
    $kw222$BACKWARD = makeKeyword( "BACKWARD" );
    $const223$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "ThePhysicalFieldValueFn" ) );
    $const224$PhysicalFieldFn = constant_handles.reader_make_constant_shell( makeString( "PhysicalFieldFn" ) );
    $list225 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Lambda" ) ), ConsesLow.list( makeSymbol( "?LFI" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "FormulaArgFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuantityConversionFn" ) ), makeKeyword( "OPERATOR" ), makeSymbol( "?LFI" ) ) ) );
    $kw226$OPERATOR = makeKeyword( "OPERATOR" );
    $str227$No_implementation_yet_for_LF_conv = makeString( "No implementation yet for LF conversion pattern ~A." );
    $list228 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Lambda" ) ), ConsesLow.list( makeSymbol( "?PFI" ) ), ConsesLow.list( makeKeyword( "OPERATOR" ), makeSymbol( "?PFI" ) ) );
    $str229$No_implementation_yet_for_PF_conv = makeString( "No implementation yet for PF conversion pattern ~A." );
    $sym230$SKSI_SMT_COLUMN_OR_FORT_NAME = makeSymbol( "SKSI-SMT-COLUMN-OR-FORT-NAME" );
    $sym231$_SKSI_SMT_COLUMN_OR_FORT_NAME_CACHING_STATE_ = makeSymbol( "*SKSI-SMT-COLUMN-OR-FORT-NAME-CACHING-STATE*" );
    $int232$200 = makeInteger( 200 );
    $str233$Edit_Logical_Schema__ = makeString( "Edit Logical Schema: " );
    $str234$Logical_fields_ = makeString( "Logical fields:" );
    $str235$CycL = makeString( "CycL" );
    $str236$Field_isa = makeString( "Field isa" );
    $str237$__user_MS_s = makeString( "# user MS's" );
    $kw238$ARG1 = makeKeyword( "ARG1" );
    $kw239$ARG2 = makeKeyword( "ARG2" );
    $kw240$COMMAND_EDIT_LF = makeKeyword( "COMMAND-EDIT-LF" );
    $str241$Delete = makeString( "Delete" );
    $kw242$DELETE_LF = makeKeyword( "DELETE-LF" );
    $str243$No_fields_in_this_logical_schema_ = makeString( "No fields in this logical schema." );
    $str244$Add_logical_field = makeString( "Add logical field" );
    $str245$Meaning_sentences_ = makeString( "Meaning sentences:" );
    $kw246$COMMAND_EDIT_MS = makeKeyword( "COMMAND-EDIT-MS" );
    $kw247$MS = makeKeyword( "MS" );
    $kw248$DELETE_MS = makeKeyword( "DELETE-MS" );
    $str249$No_meaning_sentences_in_this_logi = makeString( "No meaning sentences in this logical schema." );
    $str250$ = makeString( "" );
    $int251$60 = makeInteger( 60 );
    $str252$Add_meaning_sentence = makeString( "Add meaning sentence" );
    $str253$Edit_Logical_Field__ = makeString( "Edit Logical Field: " );
    $str254$Editing_this_field_will_automatic = makeString( "Editing this field will automatically convert it into a constant." );
    $str255$Logical_field_ = makeString( "Logical field:" );
    $kw256$ISA = makeKeyword( "ISA" );
    $kw257$NEW_ISA = makeKeyword( "NEW-ISA" );
    $int258$30 = makeInteger( 30 );
    $str259$Complete = makeString( "Complete" );
    $const260$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $str261$Change = makeString( "Change" );
    $kw262$REMOVE_ISA = makeKeyword( "REMOVE-ISA" );
    $kw263$REMOVED_ISA = makeKeyword( "REMOVED-ISA" );
    $kw264$ADDED_ISA = makeKeyword( "ADDED-ISA" );
    $str265$Add_isa = makeString( "Add isa" );
    $kw266$ADD_ISA = makeKeyword( "ADD-ISA" );
    $const267$fieldIsa = constant_handles.reader_make_constant_shell( makeString( "fieldIsa" ) );
    $str268$Edit_Translation_Schema__ = makeString( "Edit Translation Schema: " );
    $str269$_A__A = makeString( "~A?~A" );
    $str270$___ = makeString( " & " );
    $str271$_note__editing_is_not_yet_enabled = makeString( "@note: editing is not yet enabled" );
    $kw272$CENTER = makeKeyword( "CENTER" );
    $str273$___ = makeString( "<->" );
    $kw274$DECODING_FORMULA = makeKeyword( "DECODING-FORMULA" );
    $int275$50 = makeInteger( 50 );
    $kw276$ENCODING_FORMULA = makeKeyword( "ENCODING-FORMULA" );
    $str277$Edit_Meaning_Sentence_in__ = makeString( "Edit Meaning Sentence in: " );
    $kw278$MS_FORMULA = makeKeyword( "MS-FORMULA" );
    $kw279$EL_FORMULA = makeKeyword( "EL-FORMULA" );
    $kw280$NULL_FORMULA = makeKeyword( "NULL-FORMULA" );
    $str281$Formula_invalid_ = makeString( "Formula invalid." );
    $str282$Formula_wasn_t_changed_ = makeString( "Formula wasn't changed." );
    $kw283$CANCEL = makeKeyword( "CANCEL" );
    $kw284$TABLE_INFO = makeKeyword( "TABLE-INFO" );
    $str285$Select_Database_Tables_to_Decode_ = makeString( "Select Database Tables to Decode for " );
    $str286$__ = makeString( " :" );
    $list287 = ConsesLow.list( makeSymbol( "SCHEMA-NAME" ), makeSymbol( "TABLE-DETAILS" ) );
    $sym288$STRING_ = makeSymbol( "STRING=" );
    $sym289$FIRST = makeSymbol( "FIRST" );
    $str290$Schema_ = makeString( "Schema " );
    $str291$__ = makeString( ": " );
    $str292$Show = makeString( "Show" );
    $str293$Hide = makeString( "Hide" );
    $kw294$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw295$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $str296$Table_Name = makeString( "Table Name" );
    $str297$Physical_Schemata = makeString( "Physical Schemata" );
    $kw298$DECODE = makeKeyword( "DECODE" );
    $sym299$SKS_P = makeSymbol( "SKS-P" );
    $const300$sksSourceDescriptionMt = constant_handles.reader_make_constant_shell( makeString( "sksSourceDescriptionMt" ) );
    $const301$MappingMtFn = constant_handles.reader_make_constant_shell( makeString( "MappingMtFn" ) );
    $const302$SKSISourceDescriptionMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SKSISourceDescriptionMicrotheory" ) );
    $const303$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $str304$_KS = makeString( "-KS" );
    $str305$PhysicalSchemaMt = makeString( "PhysicalSchemaMt" );
    $const306$SKSIPhysicalSchemaDescriptionMicr = constant_handles.reader_make_constant_shell( makeString( "SKSIPhysicalSchemaDescriptionMicrotheory" ) );
    $const307$sksLogicalSchemaDescriptionMt = constant_handles.reader_make_constant_shell( makeString( "sksLogicalSchemaDescriptionMt" ) );
    $const308$sksSchemaTranslationMt = constant_handles.reader_make_constant_shell( makeString( "sksSchemaTranslationMt" ) );
    $const309$contentMt = constant_handles.reader_make_constant_shell( makeString( "contentMt" ) );
    $const310$bridgingMtForKS = constant_handles.reader_make_constant_shell( makeString( "bridgingMtForKS" ) );
    $sym311$HLMT_P = makeSymbol( "HLMT-P" );
    $sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__ = makeSymbol( "*SKSI-SMT-WARN-ABOUT-INVARIANTS?*" );
    $str313$SMT_invariant_broken___A_is_not_a = makeString( "SMT invariant broken: ~A is not an instance of ~A" );
    $sym314$SKSI_SOURCE_DESCRIPTION_P = makeSymbol( "SKSI-SOURCE-DESCRIPTION-P" );
    $sym315$SKSI_PHYSICAL_SCHEMABASE_P = makeSymbol( "SKSI-PHYSICAL-SCHEMABASE-P" );
    $sym316$SKSI_PHYSICAL_SCHEMA_P = makeSymbol( "SKSI-PHYSICAL-SCHEMA-P" );
    $const317$schemaFieldNameList = constant_handles.reader_make_constant_shell( makeString( "schemaFieldNameList" ) );
    $sym318$SKSI_PHYSICAL_FIELD_P = makeSymbol( "SKSI-PHYSICAL-FIELD-P" );
    $const319$fieldName_SKS = constant_handles.reader_make_constant_shell( makeString( "fieldName-SKS" ) );
    $const320$fieldDataType = constant_handles.reader_make_constant_shell( makeString( "fieldDataType" ) );
    $const321$nonNullFields = constant_handles.reader_make_constant_shell( makeString( "nonNullFields" ) );
    $const322$defaultFieldValue = constant_handles.reader_make_constant_shell( makeString( "defaultFieldValue" ) );
    $const323$primaryKey = constant_handles.reader_make_constant_shell( makeString( "primaryKey" ) );
    $list324 = ConsesLow.list( makeSymbol( "THE-LIST" ), makeSymbol( "&REST" ), makeSymbol( "KEYS" ) );
    $str325$Incapable_of_dealing_with_structu = makeString( "Incapable of dealing with structure of #$primaryKey assertion: ~A" );
    $sym326$SKSI_PF_GET_NAME = makeSymbol( "SKSI-PF-GET-NAME" );
    $kw327$PRIMARY = makeKeyword( "PRIMARY" );
    $kw328$NONE = makeKeyword( "NONE" );
    $const329$SKSILogicalSchemaDescriptionMicro = constant_handles.reader_make_constant_shell( makeString( "SKSILogicalSchemaDescriptionMicrotheory" ) );
    $str330$LogicalSchemaMt = makeString( "LogicalSchemaMt" );
    $sym331$SKSI_LOGICAL_SCHEMABASE_P = makeSymbol( "SKSI-LOGICAL-SCHEMABASE-P" );
    $str332$_LS_ = makeString( "-LS-" );
    $const333$ObjectDefiningSchema = constant_handles.reader_make_constant_shell( makeString( "ObjectDefiningSchema" ) );
    $const334$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
    $const335$schemaIsa = constant_handles.reader_make_constant_shell( makeString( "schemaIsa" ) );
    $sym336$SKSI_LOGICAL_SCHEMA_P = makeSymbol( "SKSI-LOGICAL-SCHEMA-P" );
    $const337$logicalFields = constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) );
    $sym338$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const339$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym340$_SKSI_ISG_ = makeSymbol( "*SKSI-ISG*" );
    $str341$_LF_ = makeString( "-LF-" );
    $const342$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const343$IndexicalConcept = constant_handles.reader_make_constant_shell( makeString( "IndexicalConcept" ) );
    $sym344$SKSI_LOGICAL_FIELD_P = makeSymbol( "SKSI-LOGICAL-FIELD-P" );
    $const345$fieldGenls = constant_handles.reader_make_constant_shell( makeString( "fieldGenls" ) );
    $sym346$SKSI_MEANING_SENTENCE_P = makeSymbol( "SKSI-MEANING-SENTENCE-P" );
    $const347$SKSISchemaTranslationMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SKSISchemaTranslationMicrotheory" ) );
    $str348$TranslationSchemaMt = makeString( "TranslationSchemaMt" );
    $sym349$SKSI_TRANSLATION_SCHEMABASE_P = makeSymbol( "SKSI-TRANSLATION-SCHEMABASE-P" );
    $sym350$DECODE_PHYSICAL_STRUCTURE_OF_SKS = makeSymbol( "DECODE-PHYSICAL-STRUCTURE-OF-SKS" );
    $sym351$NEW_STRUCTURED_KNOWLEDGE_SOURCE = makeSymbol( "NEW-STRUCTURED-KNOWLEDGE-SOURCE" );
    $const352$ContentMtFn = constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) );
    $const353$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $const354$BridgingMtForKSFn = constant_handles.reader_make_constant_shell( makeString( "BridgingMtForKSFn" ) );
    $const355$SKSIVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "SKSIVocabularyMt" ) );
    $sym356$NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA = makeSymbol( "NEW-CONCEPTUAL-MAPPING-LOGICAL-SCHEMA" );
    $str357$_CMLS = makeString( "-CMLS" );
    $list358 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ReifiedMapping" ) ) );
    $sym359$SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES = makeSymbol( "SKSI-SMT-GET-AVAILABLE-DATABASE-TYPES" );
    $sym360$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol( "HL-PROTOTYPICAL-INSTANCE?" );
    $const361$SKSISchemaDescriptionMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SKSISchemaDescriptionMicrotheory" ) );
    $sym362$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $const363$subKS_Direct = constant_handles.reader_make_constant_shell( makeString( "subKS-Direct" ) );
    $const364$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell( makeString( "physicalSchemaSourceMap" ) );
    $const365$physicalFields = constant_handles.reader_make_constant_shell( makeString( "physicalFields" ) );
    $sym366$APPEND = makeSymbol( "APPEND" );
    $const367$enumerableSchema = constant_handles.reader_make_constant_shell( makeString( "enumerableSchema" ) );
    $sym368$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw369$GAF = makeKeyword( "GAF" );
    $kw370$TRUE = makeKeyword( "TRUE" );
    $kw371$FALSE = makeKeyword( "FALSE" );
    $sym372$SKSI_PSB_GET_LABELED_SCHEMATA = makeSymbol( "SKSI-PSB-GET-LABELED-SCHEMATA" );
    $const373$schemaName_SKS = constant_handles.reader_make_constant_shell( makeString( "schemaName-SKS" ) );
    $const374$schemaNameSchema_SKS = constant_handles.reader_make_constant_shell( makeString( "schemaNameSchema-SKS" ) );
    $list375 = ConsesLow.list( makeSymbol( "PS" ), makeSymbol( "LSS" ) );
    $sym376$FORT_NAME_ = makeSymbol( "FORT-NAME<" );
  }
}
/*
 * 
 * Total time: 3904 ms synthetic
 */