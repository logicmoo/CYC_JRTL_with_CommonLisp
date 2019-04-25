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

public final class sksi_smt extends SubLTranslatedFile
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
    public static SubLObject cb_link_edit_in_smt(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == sksi_smt.UNPROVIDED) {
            linktext = (SubLObject)sksi_smt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_smt.NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue(thread)) {
            if (sksi_smt.NIL == linktext) {
                linktext = (SubLObject)sksi_smt.$str0$_Edit_in_SMT_;
            }
            final SubLObject href = Sequences.cconcatenate((SubLObject)sksi_smt.$str1$http___, new SubLObject[] { format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_host()), sksi_smt.$str2$_, format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_port()), sksi_smt.$str3$_SchemaModelingTool__sksName_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(index_hook)), sksi_smt.$str4$_cyc_server_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), sksi_smt.$str2$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)), sksi_smt.$str5$_cyc_defaultCyclist_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(operation_communication.the_cyclist())) });
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.$str6$Will_open_in_new_browser_window);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.$str7$_blank);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 1524L)
    public static SubLObject smt_edit_button(final SubLObject sks, SubLObject button_text) {
        if (button_text == sksi_smt.UNPROVIDED) {
            button_text = (SubLObject)sksi_smt.$str10$Edit;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject href = Sequences.cconcatenate((SubLObject)sksi_smt.$str1$http___, new SubLObject[] { format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_host()), sksi_smt.$str2$_, format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_port()), sksi_smt.$str3$_SchemaModelingTool__sksName_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(sks)), sksi_smt.$str4$_cyc_server_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), sksi_smt.$str2$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)), sksi_smt.$str5$_cyc_defaultCyclist_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(operation_communication.the_cyclist())) });
        final SubLObject onclick = Sequences.cconcatenate((SubLObject)sksi_smt.$str11$window_open__, new SubLObject[] { format_nil.format_nil_a_no_copy(href), sksi_smt.$str12$___ });
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.$kw13$BUTTON);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != button_text) {
            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_princ(button_text);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        }
        if (sksi_smt.NIL != onclick) {
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(onclick);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        }
        if (sksi_smt.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        return sks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 2057L)
    public static SubLObject cb_link_smt(SubLObject linktext) {
        if (linktext == sksi_smt.UNPROVIDED) {
            linktext = (SubLObject)sksi_smt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_smt.NIL == linktext) {
            linktext = (SubLObject)sksi_smt.$str14$CMT;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_smt.$kw15$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)sksi_smt.$str16$sksi_smt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 2294L)
    public static SubLObject sksi_smt(SubLObject args) {
        if (args == sksi_smt.UNPROVIDED) {
            args = (SubLObject)sksi_smt.NIL;
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        sksi_smt_int(arghash);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 2429L)
    public static SubLObject sksi_smt_int(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_smt.NIL != html_arghash.arghash_p(arghash) : arghash;
        SubLObject button_clickedP = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_keys(arghash);
        SubLObject key = (SubLObject)sksi_smt.NIL;
        key = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            if (key.isCons()) {
                final SubLObject command_key = key.first();
                final SubLObject command_args = key.rest();
                final SubLObject command_to_key = Symbols.make_keyword(string_utilities.replace_substring_once(string_utilities.string_from_keyword(command_key), (SubLObject)sksi_smt.$str24$COMMAND, (SubLObject)sksi_smt.$str25$TO, (SubLObject)sksi_smt.UNPROVIDED));
                button_clickedP = command_key;
                SubLObject remainder;
                SubLObject arghash_key;
                SubLObject arghash_value;
                for (remainder = (SubLObject)sksi_smt.NIL, remainder = command_args; sksi_smt.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    arghash_key = remainder.first();
                    arghash_value = conses_high.cadr(remainder);
                    html_arghash.set_arghash_value(arghash_key, arghash, arghash_value);
                }
                html_arghash.set_arghash_value(command_to_key, arghash, (SubLObject)sksi_smt.T);
                html_arghash.rem_arghash_value(key, arghash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw26$ON_EDIT_SKS, arghash)) {
            arghash = sksi_smt_edit_sks_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw27$ON_EDIT_SD, arghash)) {
            arghash = sksi_smt_edit_sd_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw28$ON_EDIT_PS, arghash)) {
            arghash = sksi_smt_edit_ps_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw29$ON_EDIT_LS, arghash)) {
            arghash = sksi_smt_edit_ls_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw30$ON_EDIT_LF, arghash)) {
            arghash = sksi_smt_edit_lf_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw31$ON_EDIT_MS, arghash)) {
            arghash = sksi_smt_edit_ms_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw32$ON_DECODE_PSB, arghash)) {
            arghash = sksi_smt_decode_psb_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw33$ON_EDIT_TS, arghash)) {
            arghash = sksi_smt_edit_ts_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw34$ON_EDIT_T, arghash)) {
            arghash = sksi_smt_edit_t_actions(arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw35$ON_MAIN, arghash)) {
            arghash = sksi_smt_main_actions(arghash);
        }
        html_utilities.html_markup((SubLObject)sksi_smt.$str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (sksi_smt.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.$str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == sksi_smt.$kw38$UNINITIALIZED) ? ConsesLow.list(sksi_smt.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)sksi_smt.$kw39$CB_CYC);
            sksi_smt_macros.sksi_smt_html_title((SubLObject)sksi_smt.$str20$Schema_Modeling_Tool);
            html_complete.html_complete_script();
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            dhtml_macros.html_basic_cb_scripts();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_smt.$str40$cg_sksi_smt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str20$Schema_Modeling_Tool);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_smt.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_smt.$str41$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    if (sksi_smt.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)sksi_smt.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)sksi_smt.$str16$sksi_smt, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
                        SubLObject fort_selectedP = (SubLObject)sksi_smt.NIL;
                        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw42$JUST_FORT, arghash);
                        if (sksi_smt.NIL != forts.fort_p(fort)) {
                            fort_selectedP = fort;
                            if (sksi_smt.NIL != isa.isa_in_any_mtP(fort, sksi_smt.$const43$StructuredKnowledgeSource)) {
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash, fort);
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash, (SubLObject)sksi_smt.T);
                            }
                            else if (sksi_smt.NIL != isa.isa_in_any_mtP(fort, sksi_smt.$const46$PhysicalSchema)) {
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw47$PS, arghash, fort);
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw48$TO_EDIT_PS, arghash, (SubLObject)sksi_smt.T);
                            }
                            else if (sksi_smt.NIL != isa.isa_in_any_mtP(fort, sksi_smt.$const49$LogicalSchema)) {
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash, fort);
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw51$TO_EDIT_LS, arghash, (SubLObject)sksi_smt.T);
                            }
                            else if (sksi_smt.NIL != isa.isa_in_any_mtP(fort, sksi_smt.$const52$PhysicalField)) {
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw53$PF, arghash, fort);
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw54$TO_EDIT_PF, arghash, (SubLObject)sksi_smt.T);
                            }
                            else if (sksi_smt.NIL != isa.isa_in_any_mtP(fort, sksi_smt.$const55$LogicalField)) {
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash, fort);
                                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw57$TO_EDIT_LF, arghash, (SubLObject)sksi_smt.T);
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (sksi_smt.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                    html_utilities.html_princ((SubLObject)sksi_smt.$str58$Error__Support_for_term_);
                                    sksi_form(fort);
                                    html_utilities.html_princ((SubLObject)sksi_smt.$str59$_not_implemented);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        }
                        html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw42$JUST_FORT, arghash);
                        SubLObject cdolist_list_var2 = html_arghash.get_arghash_value_list((SubLObject)sksi_smt.$kw60$ERROR, arghash);
                        SubLObject error = (SubLObject)sksi_smt.NIL;
                        error = cdolist_list_var2.first();
                        while (sksi_smt.NIL != cdolist_list_var2) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw60$ERROR, arghash);
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (sksi_smt.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                html_utilities.html_princ((SubLObject)sksi_smt.$str61$Error__);
                                Functions.apply((SubLObject)sksi_smt.$sym62$FORMAT, (SubLObject)ConsesLow.cons(html_macros.$html_stream$.getDynamicValue(thread), error));
                                html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            error = cdolist_list_var2.first();
                        }
                        cdolist_list_var2 = html_arghash.get_arghash_value_list((SubLObject)sksi_smt.$kw63$SUCCESS, arghash);
                        SubLObject success = (SubLObject)sksi_smt.NIL;
                        success = cdolist_list_var2.first();
                        while (sksi_smt.NIL != cdolist_list_var2) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw63$SUCCESS, arghash);
                            html_utilities.html_princ((SubLObject)sksi_smt.$str64$Success__);
                            Functions.apply((SubLObject)sksi_smt.$sym62$FORMAT, (SubLObject)ConsesLow.cons(html_macros.$html_stream$.getDynamicValue(thread), success));
                            html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            success = cdolist_list_var2.first();
                        }
                        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash);
                            sksi_smt_edit_sks_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw65$TO_EDIT_SD, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw65$TO_EDIT_SD, arghash);
                            sksi_smt_edit_sd_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw48$TO_EDIT_PS, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw48$TO_EDIT_PS, arghash);
                            sksi_smt_edit_ps_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw51$TO_EDIT_LS, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw51$TO_EDIT_LS, arghash);
                            sksi_smt_edit_ls_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw57$TO_EDIT_LF, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw57$TO_EDIT_LF, arghash);
                            sksi_smt_edit_lf_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw66$TO_EDIT_MS, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw66$TO_EDIT_MS, arghash);
                            sksi_smt_edit_ms_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw67$TO_EDIT_TS, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw67$TO_EDIT_TS, arghash);
                            sksi_smt_edit_ts_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw68$TO_EDIT_T, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw68$TO_EDIT_T, arghash);
                            sksi_smt_edit_t_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw69$TO_MAIN, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw69$TO_MAIN, arghash);
                            sksi_smt_main_page(arghash);
                        }
                        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw70$TO_DECODE_PSB, arghash)) {
                            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw70$TO_DECODE_PSB, arghash);
                            sksi_smt_decode_psb_page(arghash);
                        }
                        else {
                            if (sksi_smt.NIL != button_clickedP) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (sksi_smt.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                    html_utilities.html_princ((SubLObject)sksi_smt.$str71$Error__button_);
                                    html_utilities.html_princ(button_clickedP);
                                    html_utilities.html_princ((SubLObject)sksi_smt.$str59$_not_implemented);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw26$ON_EDIT_SKS, arghash)) {
                                sksi_smt_edit_sks_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw27$ON_EDIT_SD, arghash)) {
                                sksi_smt_edit_sd_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw28$ON_EDIT_PS, arghash)) {
                                sksi_smt_edit_ps_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw29$ON_EDIT_LS, arghash)) {
                                sksi_smt_edit_ls_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw30$ON_EDIT_LF, arghash)) {
                                sksi_smt_edit_lf_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw31$ON_EDIT_MS, arghash)) {
                                sksi_smt_edit_ms_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw33$ON_EDIT_TS, arghash)) {
                                sksi_smt_edit_ts_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw34$ON_EDIT_T, arghash)) {
                                sksi_smt_edit_t_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw35$ON_MAIN, arghash)) {
                                sksi_smt_main_page(arghash);
                            }
                            else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw32$ON_DECODE_PSB, arghash)) {
                                sksi_smt_decode_psb_page(arghash);
                            }
                            else {
                                if (sksi_smt.NIL != fort_selectedP) {
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (sksi_smt.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                        html_utilities.html_princ((SubLObject)sksi_smt.$str72$Error__fort_type_for_);
                                        sksi_form(html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw42$JUST_FORT, arghash));
                                        html_utilities.html_princ((SubLObject)sksi_smt.$str73$_not_supported);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                sksi_smt_main_page(arghash);
                            }
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 8627L)
    public static SubLObject sksi_smt_main_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw35$ON_MAIN, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject skss = sksi_sks_accessors.get_all_skss();
        final SubLObject sdss = get_all_sds();
        final SubLObject psbs = get_all_psbs();
        final SubLObject lsbs = get_all_lsbs();
        final SubLObject tsbs = get_all_tsbs();
        SubLObject used_sds = (SubLObject)sksi_smt.NIL;
        SubLObject used_psbs = (SubLObject)sksi_smt.NIL;
        SubLObject used_lsbs = (SubLObject)sksi_smt.NIL;
        SubLObject used_tsbs = (SubLObject)sksi_smt.NIL;
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup((SubLObject)sksi_smt.SIX_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str74$Create_new_SKS_named__);
                    html_arghash.html_arghash_text_input(arghash, (SubLObject)sksi_smt.$kw75$NEW_SKS_NAME, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.$int76$40, (SubLObject)sksi_smt.UNPROVIDED);
                    html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str77$Create, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw78$COMMAND_EDIT_SKS, (SubLObject)sksi_smt.T), (SubLObject)sksi_smt.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str79$Knowledge_Source_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            SubLObject cdolist_list_var = skss;
            SubLObject sks = (SubLObject)sksi_smt.NIL;
            sks = cdolist_list_var.first();
            while (sksi_smt.NIL != cdolist_list_var) {
                final SubLObject sd = sks_get_source_description_mt(sks);
                final SubLObject psb = sks_get_physical_schemabase_mt(sks);
                final SubLObject lsb = sks_get_logical_schemabase_mt(sks);
                final SubLObject tsb = sks_get_translation_schemabase_mt(sks);
                SubLObject item_var = sd;
                if (sksi_smt.NIL == conses_high.member(item_var, used_sds, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                    used_sds = (SubLObject)ConsesLow.cons(item_var, used_sds);
                }
                item_var = psb;
                if (sksi_smt.NIL == conses_high.member(item_var, used_psbs, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                    used_psbs = (SubLObject)ConsesLow.cons(item_var, used_psbs);
                }
                item_var = lsb;
                if (sksi_smt.NIL == conses_high.member(item_var, used_lsbs, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                    used_lsbs = (SubLObject)ConsesLow.cons(item_var, used_lsbs);
                }
                item_var = tsb;
                if (sksi_smt.NIL == conses_high.member(item_var, used_tsbs, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                    used_tsbs = (SubLObject)ConsesLow.cons(item_var, used_tsbs);
                }
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw81$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        if (sksi_smt.NIL != sks) {
                            sksi_form(sks);
                        }
                        else {
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        if (sksi_smt.NIL != sks) {
                            if (sksi_smt.NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue(thread)) {
                                smt_edit_button(sks, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                            else {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str10$Edit, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw78$COMMAND_EDIT_SKS, (SubLObject)sksi_smt.$kw44$SKS, sks), (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        else {
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        if (sksi_smt.NIL != sd) {
                            html_utilities.html_princ((SubLObject)sksi_smt.$str82$Source_Description__);
                            sksi_arghash_form(arghash, sd);
                            html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                        }
                        if (sksi_smt.NIL != psb) {
                            html_utilities.html_princ((SubLObject)sksi_smt.$str83$Physical_Schemabase__);
                            sksi_arghash_form(arghash, psb);
                            html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                        }
                        if (sksi_smt.NIL != lsb) {
                            html_utilities.html_princ((SubLObject)sksi_smt.$str84$Logical_Schemabase__);
                            sksi_arghash_form(arghash, lsb);
                            html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                        }
                        if (sksi_smt.NIL != tsb) {
                            html_utilities.html_princ((SubLObject)sksi_smt.$str85$Translation_Schemabase__);
                            sksi_arghash_form(arghash, tsb);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                sks = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        final SubLObject other_psbs = conses_high.set_difference(psbs, used_psbs, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != other_psbs) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str86$Other_Physical_Schemabases_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject cdolist_list_var2 = other_psbs;
                SubLObject psb2 = (SubLObject)sksi_smt.NIL;
                psb2 = cdolist_list_var2.first();
                while (sksi_smt.NIL != cdolist_list_var2) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != psb2) {
                                sksi_arghash_form(arghash, psb2);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    psb2 = cdolist_list_var2.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        final SubLObject other_lsbs = conses_high.set_difference(lsbs, used_lsbs, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != other_lsbs) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str87$Other_Logical_Schemabases_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject cdolist_list_var2 = other_lsbs;
                SubLObject lsb2 = (SubLObject)sksi_smt.NIL;
                lsb2 = cdolist_list_var2.first();
                while (sksi_smt.NIL != cdolist_list_var2) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != lsb2) {
                                sksi_arghash_form(arghash, lsb2);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    lsb2 = cdolist_list_var2.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        final SubLObject other_tsbs = conses_high.set_difference(tsbs, used_tsbs, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != other_tsbs) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str88$Other_Translations_Schemabases_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject cdolist_list_var2 = other_tsbs;
                SubLObject tsb2 = (SubLObject)sksi_smt.NIL;
                tsb2 = cdolist_list_var2.first();
                while (sksi_smt.NIL != cdolist_list_var2) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != tsb2) {
                                sksi_arghash_form(arghash, tsb2);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    tsb2 = cdolist_list_var2.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 11758L)
    public static SubLObject sksi_smt_main_actions(final SubLObject arghash) {
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash)) {
            SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
            if (sksi_smt.NIL == sks) {
                final SubLObject new_sks_name = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw75$NEW_SKS_NAME, arghash);
                html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw75$NEW_SKS_NAME, arghash);
                if (sksi_smt.NIL != string_utilities.empty_stringP(new_sks_name)) {
                    html_arghash.push_arghash_value((SubLObject)sksi_smt.$kw60$ERROR, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw60$ERROR, (SubLObject)sksi_smt.$str89$Please_enter_an_SKS_name_), arghash);
                    html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash);
                    html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw69$TO_MAIN, arghash, (SubLObject)sksi_smt.T);
                }
                else {
                    sks = sksi_sks_accessors.new_sks_complex(new_sks_name, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                    sks_new_sd(sks);
                    html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash, sks);
                }
            }
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 12402L)
    public static SubLObject sksi_smt_edit_sks_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw26$ON_EDIT_SKS, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sd = sks_get_source_description_mt(sks);
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        final SubLObject lsb = sks_get_logical_schemabase_mt(sks);
        final SubLObject tsb = sks_get_translation_schemabase_mt(sks);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)sksi_smt.$str90$Edit_SKS__);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        sksi_form(sks);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_smt_html_sks_status_line(sks);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)sksi_smt.$str91$Name__);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_arghash.html_arghash_text_input(arghash, (SubLObject)sksi_smt.$kw92$SKS_NAMESTRING, sksi_sks_accessors.sks_get_name(sks, sksi_smt.$const93$nameString), (SubLObject)sksi_smt.$int94$80, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw95$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str82$Source_Description__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != sd) {
                        sksi_arghash_form(arghash, sd);
                    }
                    else {
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != sd) {
                        smt_edit_button(sks, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    else {
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str96$Add, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw97$COMMAND_EDIT_SD, (SubLObject)sksi_smt.$kw44$SKS, sks), (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw95$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str83$Physical_Schemabase__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != psb) {
                        sksi_arghash_form(arghash, psb);
                    }
                    else {
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, sksi_sd_get_mt(sd))) {
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str98$Decode, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw78$COMMAND_EDIT_SKS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw99$DECODE_PSB, (SubLObject)sksi_smt.T), (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    if (sksi_smt.NIL != psb) {
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str100$Remove, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw78$COMMAND_EDIT_SKS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw101$REMOVE_PSB, (SubLObject)sksi_smt.T), (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw95$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str84$Logical_Schemabase__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != lsb) {
                        sksi_arghash_form(arghash, lsb);
                    }
                    else {
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != lsb) {
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str100$Remove, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw102$COMMAND_REMOVE_LSB, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw103$LSB, lsb), (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    else {
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str77$Create, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw104$COMMAND_EDIT_LSB, (SubLObject)sksi_smt.$kw44$SKS, sks), (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw95$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str85$Translation_Schemabase__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != tsb) {
                        sksi_arghash_form(arghash, tsb);
                    }
                    else {
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    if (sksi_smt.NIL != tsb) {
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str100$Remove, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw105$COMMAND_REMOVE_TSB, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw106$TSB, tsb), (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        sksi_smt_edit_sks_page_main_table(arghash, sks, sd, psb, lsb, tsb);
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str107$Refresh, (SubLObject)sksi_smt.$kw108$REFRESH, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str109$OK, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str111$Cancel, (SubLObject)sksi_smt.$kw69$TO_MAIN, (SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 15805L)
    public static SubLObject sksi_smt_edit_sks_page_main_table(final SubLObject arghash, final SubLObject sks, SubLObject sd, SubLObject psb, SubLObject lsb, SubLObject tsb) {
        if (sd == sksi_smt.UNPROVIDED) {
            sd = (SubLObject)sksi_smt.NIL;
        }
        if (psb == sksi_smt.UNPROVIDED) {
            psb = (SubLObject)sksi_smt.NIL;
        }
        if (lsb == sksi_smt.UNPROVIDED) {
            lsb = (SubLObject)sksi_smt.NIL;
        }
        if (tsb == sksi_smt.UNPROVIDED) {
            tsb = (SubLObject)sksi_smt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject physical_schemata = (SubLObject)((sksi_smt.NIL != psb) ? sksi_psb_get_schemata(psb) : sksi_smt.NIL);
        SubLObject logical_schemata = (SubLObject)((sksi_smt.NIL != lsb) ? sksi_lsb_get_schemata(lsb) : sksi_smt.NIL);
        final SubLObject translations = (SubLObject)((sksi_smt.NIL != tsb) ? sksi_tsb_get_translation_pairs(tsb) : sksi_smt.NIL);
        if (sksi_smt.NIL != physical_schemata || sksi_smt.NIL != logical_schemata || sksi_smt.NIL != translations) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup((SubLObject)sksi_smt.$kw112$LEFT);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str113$Physical_Schemata_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str114$Logical_Schemata_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str115$Translations_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject cdolist_list_var = physical_schemata;
                SubLObject ps = (SubLObject)sksi_smt.NIL;
                ps = cdolist_list_var.first();
                while (sksi_smt.NIL != cdolist_list_var) {
                    final SubLObject ls = list_utilities.alist_lookup(translations, ps, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED).first();
                    if (sksi_smt.NIL != ls) {
                        logical_schemata = Sequences.remove(ls, logical_schemata, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_smt.$kw112$LEFT);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_arghash_form(arghash, ps);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str116$View, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw117$COMMAND_EDIT_PS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw47$PS, ps), (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != ls) {
                                sksi_arghash_form(arghash, ls);
                            }
                            else {
                                html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != ls) {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str10$Edit, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw118$COMMAND_EDIT_LS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls), (SubLObject)sksi_smt.UNPROVIDED);
                            }
                            else {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str77$Create, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw118$COMMAND_EDIT_LS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw47$PS, ps), (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw95$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != ls) {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str10$Edit, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw119$COMMAND_EDIT_TS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw47$PS, ps, (SubLObject)sksi_smt.$kw50$LS, ls), (SubLObject)sksi_smt.UNPROVIDED);
                            }
                            else {
                                html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ps = cdolist_list_var.first();
                }
                cdolist_list_var = logical_schemata;
                SubLObject logical_schema = (SubLObject)sksi_smt.NIL;
                logical_schema = cdolist_list_var.first();
                while (sksi_smt.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_smt.$kw112$LEFT);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_arghash_form(arghash, logical_schema);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    logical_schema = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 17927L)
    public static SubLObject sksi_smt_edit_sks_actions(final SubLObject arghash) {
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject new_sks_namestring = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw92$SKS_NAMESTRING, arghash);
        if (!sksi_sks_accessors.sks_get_name(sks, sksi_smt.$const93$nameString).equal(new_sks_namestring)) {
            sksi_sks_accessors.sks_fset(sks, sksi_smt.$const93$nameString, new_sks_namestring, (SubLObject)sksi_smt.UNPROVIDED);
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw101$REMOVE_PSB, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw101$REMOVE_PSB, arghash);
            sksi_sks_accessors.sks_fset(sks, sksi_smt.$const120$sksPhysicalSchemaDescriptionMt, (SubLObject)sksi_smt.NIL, sksi_smt.$const121$UniversalVocabularyMt);
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw99$DECODE_PSB, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw99$DECODE_PSB, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw26$ON_EDIT_SKS, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw69$TO_MAIN, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw70$TO_DECODE_PSB, arghash, (SubLObject)sksi_smt.T);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash, (SubLObject)sksi_smt.T);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw26$ON_EDIT_SKS, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw69$TO_MAIN, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 19782L)
    public static SubLObject sksi_smt_html_sks_status_line(final SubLObject sks) {
        final SubLObject sd = sks_get_sd(sks);
        final SubLObject sd_mt = sksi_sd_get_mt(sd);
        html_utilities.html_princ((SubLObject)sksi_smt.$str123$This_SKS_is_currently_);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        if (sksi_smt.NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, sd_mt)) {
            html_utilities.html_princ((SubLObject)sksi_smt.$str124$accessible);
        }
        else {
            html_utilities.html_princ((SubLObject)sksi_smt.$str125$not_accessible);
        }
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)sksi_smt.$str126$_);
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 20257L)
    public static SubLObject sksi_smt_edit_sd_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw27$ON_EDIT_SD, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject sd = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw127$SD, arghash);
        final SubLObject sd_mt = sksi_sd_get_mt(sd);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw127$SD, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str128$Edit_Source_Description__);
        sksi_form(sks);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_smt_html_sks_status_line(sks);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str129$Parameter);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_smt.$str130$Value);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
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
            for (remainder = (SubLObject)sksi_smt.NIL, remainder = sksi_smt.$sksi_smt_sd_parameters$.getGlobalValue(); sksi_smt.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                predicate = remainder.first();
                type = conses_high.cadr(remainder);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        sksi_form(predicate);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        if (sksi_smt.NIL != genls.genl_in_any_mtP(type, sksi_smt.$const131$CharacterString)) {
                            html_arghash.html_arghash_text_input(arghash, predicate, sksi_sks_accessors.sks_fget(sks, predicate, sd_mt), (SubLObject)sksi_smt.$int76$40, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        else if (sksi_smt.NIL != genls.genl_in_any_mtP(type, sksi_smt.$const132$Integer)) {
                            html_arghash.html_arghash_text_input(arghash, predicate, sksi_sks_accessors.sks_fget(sks, predicate, sd_mt), (SubLObject)sksi_smt.$int76$40, (SubLObject)sksi_smt.$kw133$INTEGER);
                        }
                        else if (sksi_smt.NIL != forts.fort_p(type)) {
                            html_arghash.set_arghash_value(predicate, arghash, sksi_sks_accessors.sks_fget(sks, predicate, sd_mt));
                            key_string = html_arghash.arghash_make_key_string(predicate, (SubLObject)sksi_smt.$kw134$FORT);
                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            html_utilities.html_markup(key_string);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            if (sksi_smt.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                            _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                value = (SubLObject)sksi_smt.NIL;
                                value_$72 = (SubLObject)sksi_smt.NIL;
                                value_string = (SubLObject)sksi_smt.NIL;
                                value_string_$73 = (SubLObject)sksi_smt.NIL;
                                value = isa.all_fort_instances_in_all_mts(type);
                                value_$72 = value.first();
                                value_string = Mapping.mapcar((SubLObject)sksi_smt.$sym135$FORT_NAME, isa.all_fort_instances_in_all_mts(type));
                                value_string_$73 = value_string.first();
                                while (sksi_smt.NIL != value_string || sksi_smt.NIL != value) {
                                    selected = list_utilities.member_equalP(value_$72, html_arghash.get_arghash_value_list(predicate, arghash));
                                    value_string_$74 = html_arghash.arghash_get_string(value_$72, (SubLObject)sksi_smt.$kw134$FORT);
                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (sksi_smt.NIL != selected) {
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (sksi_smt.NIL != value_string_$74) {
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                        html_utilities.html_markup(value_string_$74);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                    _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                        html_utilities.html_princ(value_string_$73);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    value = value.rest();
                                    value_$72 = value.first();
                                    value_string = value_string.rest();
                                    value_string_$73 = value_string.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                        }
                        else {
                            html_utilities.html_princ(type);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str107$Refresh, (SubLObject)sksi_smt.$kw108$REFRESH, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str109$OK, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str111$Cancel, (SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, (SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 22008L)
    public static SubLObject sksi_smt_edit_sd_actions(final SubLObject arghash) {
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash) || sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
            final SubLObject sd_mt = sks_get_source_description_mt(sks);
            SubLObject remainder;
            SubLObject predicate;
            SubLObject type;
            SubLObject current_value;
            SubLObject new_value;
            for (remainder = (SubLObject)sksi_smt.NIL, remainder = sksi_smt.$sksi_smt_sd_parameters$.getGlobalValue(); sksi_smt.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                predicate = remainder.first();
                type = conses_high.cadr(remainder);
                current_value = sksi_sks_accessors.sks_fget(sks, predicate, sd_mt);
                new_value = html_arghash.get_arghash_value(predicate, arghash);
                html_arghash.rem_arghash_value(predicate, arghash);
                if (!current_value.equal(new_value)) {
                    sksi_sks_accessors.sks_fset(sks, predicate, new_value, sd_mt);
                    html_arghash.push_arghash_value((SubLObject)sksi_smt.$kw63$SUCCESS, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$str136$Changed__A__A_from__A_to__A, sks, predicate, current_value, new_value), arghash);
                }
            }
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash)) {
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw65$TO_EDIT_SD, arghash, (SubLObject)sksi_smt.T);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw27$ON_EDIT_SD, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 22941L)
    public static SubLObject sksi_smt_update_source_description(final SubLObject sks, final SubLObject param_vals) {
        final SubLObject sd = sks_get_source_description_mt(sks);
        SubLObject cdolist_list_var = param_vals;
        SubLObject param_val = (SubLObject)sksi_smt.NIL;
        param_val = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = param_val;
            SubLObject predicate = (SubLObject)sksi_smt.NIL;
            SubLObject new_value = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list138);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list138);
            new_value = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                sksi_sks_accessors.sks_fset(sks, predicate, new_value, sd);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list138);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param_val = cdolist_list_var.first();
        }
        return sksi_smt_compile_source_description(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 23496L)
    public static SubLObject sksi_smt_compile_source_description(final SubLObject sks) {
        final SubLObject sd = sks_get_source_description_mt(sks);
        final SubLObject param_defs = sksi_smt_compile_param_definitions(sksi_smt.$sksi_smt_sd_parameters$.getGlobalValue());
        SubLObject param_vals = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = param_defs;
        SubLObject param_def = (SubLObject)sksi_smt.NIL;
        param_def = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = param_def;
            SubLObject predicate = (SubLObject)sksi_smt.NIL;
            SubLObject constraint = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list140);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list140);
            constraint = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                final SubLObject value = sksi_sks_accessors.sks_fget(sks, predicate, sd);
                param_vals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, constraint, value), param_vals);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list140);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param_def = cdolist_list_var.first();
        }
        return Sequences.nreverse(param_vals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
    public static SubLObject clear_sksi_smt_compile_param_definitions() {
        final SubLObject cs = sksi_smt.$sksi_smt_compile_param_definitions_caching_state$.getGlobalValue();
        if (sksi_smt.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
    public static SubLObject remove_sksi_smt_compile_param_definitions(final SubLObject plist) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_smt.$sksi_smt_compile_param_definitions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(plist), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
    public static SubLObject sksi_smt_compile_param_definitions_internal(final SubLObject plist) {
        SubLObject result = (SubLObject)sksi_smt.NIL;
        SubLObject remainder;
        SubLObject predicate;
        SubLObject constraint;
        for (remainder = (SubLObject)sksi_smt.NIL, remainder = plist; sksi_smt.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            predicate = remainder.first();
            constraint = conses_high.cadr(remainder);
            if (!predicate.eql(sksi_smt.$const142$sksIsa)) {
                if (predicate.eql(sksi_smt.$const143$subProtocolForSKS)) {
                    constraint = sdbc.get_all_sdbc_database_sub_protocols();
                }
                else if (constraint.eql(sksi_smt.$const144$SKSISupportedDatabaseServerProgra)) {
                    constraint = sksi_smt_get_available_database_types();
                }
                else if (!sksi_smt.$const132$Integer.eql(constraint)) {
                    if (!sksi_smt.$const131$CharacterString.eql(constraint)) {
                        Errors.error((SubLObject)sksi_smt.$str145$Do_not_know_what_to_do_with_const, constraint);
                    }
                }
            }
            if (!sksi_smt.$const142$sksIsa.eql(predicate)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, constraint), result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 24352L)
    public static SubLObject sksi_smt_compile_param_definitions(final SubLObject plist) {
        SubLObject caching_state = sksi_smt.$sksi_smt_compile_param_definitions_caching_state$.getGlobalValue();
        if (sksi_smt.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_smt.$sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS, (SubLObject)sksi_smt.$sym146$_SKSI_SMT_COMPILE_PARAM_DEFINITIONS_CACHING_STATE_, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.EQL, (SubLObject)sksi_smt.ONE_INTEGER, (SubLObject)sksi_smt.TWENTY_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, plist, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_smt_compile_param_definitions_internal(plist)));
            memoization_state.caching_state_put(caching_state, plist, results, (SubLObject)sksi_smt.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 25124L)
    public static SubLObject sksi_smt_register_structured_knowledge_source(final SubLObject sks) {
        enable_sksi_smt_mode();
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_sks_manager.register_sksi_removal_modules_for_skses((SubLObject)ConsesLow.list(sks))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 25372L)
    public static SubLObject sksi_smt_structured_knowledge_source_registeredP(final SubLObject sks) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.$kw149$NOREG != sksi_sks_manager.sks_registration_state(sks));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 25561L)
    public static SubLObject sksi_ps_compile_pfs_info(final SubLObject ps) {
        final SubLObject pfs = sksi_ps_get_pfs(ps);
        SubLObject result = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = pfs;
        SubLObject pf = (SubLObject)sksi_smt.NIL;
        pf = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            final SubLObject pf_name = sksi_pf_get_name(pf);
            final SubLObject pf_datatype = sksi_pf_get_datatype(pf);
            final SubLObject pf_nullable = sksi_pf_get_nullable(pf);
            final SubLObject pf_default_value = sksi_pf_get_default_value(pf);
            final SubLObject pf_key_type = sksi_pf_get_key_type(pf);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { sksi_smt.$kw53$PF, pf, sksi_smt.$kw151$NAME, pf_name, sksi_smt.$kw152$DATATYPE, pf_datatype, sksi_smt.$kw153$NULLABLE, pf_nullable, sksi_smt.$kw154$KEY_TYPE, pf_key_type, sksi_smt.$kw155$DEFAULT, pf_default_value }), result);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 26454L)
    public static SubLObject sksi_smt_edit_ps_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw28$ON_EDIT_PS, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject ps = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw47$PS, arghash);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw47$PS, ps, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str156$Edit_Physical_Schema__);
        sksi_form(sks);
        html_utilities.html_princ((SubLObject)sksi_smt.$str157$___);
        sksi_arghash_form(arghash, ps);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject pfs = sksi_ps_get_pfs(ps);
        if (sksi_smt.NIL != pfs) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)sksi_smt.$str158$Physical_fields_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str159$Name);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str160$Datatype);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str161$Nullable);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str162$Default_Value);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject cdolist_list_var = pfs;
                SubLObject pf = (SubLObject)sksi_smt.NIL;
                pf = cdolist_list_var.first();
                while (sksi_smt.NIL != cdolist_list_var) {
                    final SubLObject pf_name = sksi_pf_get_name(pf);
                    final SubLObject pf_datatype = sksi_pf_get_datatype(pf);
                    final SubLObject pf_nullable = sksi_pf_get_nullable(pf);
                    final SubLObject pf_default_value = sksi_pf_get_default_value(pf);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_form(pf);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_form(pf_name);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_form(pf_datatype);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_form(pf_nullable);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_form(pf_default_value);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    pf = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_princ((SubLObject)sksi_smt.$str163$No_fields_in_this_physical_schema);
        }
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str109$OK, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 28162L)
    public static SubLObject sksi_smt_edit_ps_actions(final SubLObject arghash) {
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 28320L)
    public static SubLObject sksi_smt_logical_field_values_for_logical_schema(final SubLObject ls, final SubLObject arg1_isa, final SubLObject arg2_isa) {
        final SubLObject lf1 = el_utilities.make_ternary_formula(sksi_smt.$const164$TheLogicalFieldValueFn, ls, arg1_isa, (SubLObject)sksi_smt.ONE_INTEGER);
        final SubLObject arg2_num = (SubLObject)(arg1_isa.eql(arg2_isa) ? sksi_smt.TWO_INTEGER : sksi_smt.ONE_INTEGER);
        return Values.values(lf1, el_utilities.make_ternary_formula(sksi_smt.$const164$TheLogicalFieldValueFn, ls, arg2_isa, arg2_num));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 28716L)
    public static SubLObject sksi_smt_fetch_simple_logical_schemata(final SubLObject sks, final SubLObject ps) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        SubLObject lss = (SubLObject)sksi_smt.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym166$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mapping_mt, thread);
            lss = kb_mapping_utilities.pred_values(ps, sksi_smt.$const167$logicalPhysicalSchemaMap, (SubLObject)sksi_smt.TWO_INTEGER, (SubLObject)sksi_smt.ONE_INTEGER, (SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lss;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 29089L)
    public static SubLObject sksi_smt_retrieve_simple_logical_schemata(final SubLObject sks, final SubLObject ps) {
        final SubLObject lss = sksi_smt_fetch_simple_logical_schemata(sks, ps);
        SubLObject schemata = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = lss;
        SubLObject ls = (SubLObject)sksi_smt.NIL;
        ls = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            schemata = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ls, sksi_smt_retrieve_simple_logical_schema(sks, ps, ls)), schemata);
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
        }
        return Sequences.nreverse(schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 29640L)
    public static SubLObject sksi_smt_retrieve_simple_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject ls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = (SubLObject)sksi_smt.NIL;
        SubLObject pf1 = (SubLObject)sksi_smt.NIL;
        SubLObject pf2 = (SubLObject)sksi_smt.NIL;
        SubLObject arg1_isa = (SubLObject)sksi_smt.NIL;
        SubLObject arg2_isa = (SubLObject)sksi_smt.NIL;
        SubLObject convert1 = (SubLObject)sksi_smt.NIL;
        SubLObject convert2 = (SubLObject)sksi_smt.NIL;
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        final SubLObject coding_pairs = sksi_sks_get_translations(sks, ps, ls, mapping_mt);
        final SubLObject bridging_mt = sks_get_bridging_or_content_mt(sks);
        final SubLObject lfi_map = dictionary.new_dictionary((SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject mss = sksi_ls_get_mss(ls);
        final SubLObject meaning_sentence_assertion = mss.first();
        if (sksi_smt.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_smt.NIL == assertion_handles.assertion_p(meaning_sentence_assertion)) {
            Errors.error((SubLObject)sksi_smt.$str170$Could_not_retrieve_meaning_senten, ls);
        }
        final SubLObject sentence = assertions_high.gaf_arg2(meaning_sentence_assertion);
        predicate = cycl_utilities.formula_operator(sentence);
        if (sksi_smt.NIL != fort_types_interface.mtP(bridging_mt)) {
            final SubLObject base_pred = ask_utilities.query_variable((SubLObject)sksi_smt.$sym171$_BASE_PRED, (SubLObject)ConsesLow.list(sksi_smt.$const172$correspondingSKSIPredicate, (SubLObject)sksi_smt.$sym171$_BASE_PRED, predicate, ls), bridging_mt, (SubLObject)sksi_smt.UNPROVIDED).first();
            if (sksi_smt.NIL != forts.fort_p(base_pred) && sksi_smt.NIL != fort_types_interface.predicate_p(base_pred)) {
                predicate = base_pred;
            }
        }
        SubLObject list_var = (SubLObject)sksi_smt.NIL;
        SubLObject lfi = (SubLObject)sksi_smt.NIL;
        SubLObject index = (SubLObject)sksi_smt.NIL;
        list_var = cycl_utilities.formula_args(sentence, (SubLObject)sksi_smt.UNPROVIDED);
        lfi = list_var.first();
        for (index = (SubLObject)sksi_smt.ZERO_INTEGER; sksi_smt.NIL != list_var; list_var = list_var.rest(), lfi = list_var.first(), index = Numbers.add((SubLObject)sksi_smt.ONE_INTEGER, index)) {
            final SubLObject el_lfi = cycl_utilities.hl_to_el(lfi);
            final SubLObject arg_isa = cycl_utilities.formula_arg(el_lfi, (SubLObject)sksi_smt.TWO_INTEGER, (SubLObject)sksi_smt.UNPROVIDED);
            map_utilities.map_put(lfi_map, lfi, index);
            final SubLObject pcase_var = index;
            if (pcase_var.eql((SubLObject)sksi_smt.ZERO_INTEGER)) {
                arg1_isa = arg_isa;
            }
            else if (pcase_var.eql((SubLObject)sksi_smt.ONE_INTEGER)) {
                arg2_isa = arg_isa;
            }
            else {
                Errors.error((SubLObject)sksi_smt.$str173$Dont_support_more_than_binary_pre);
            }
        }
        SubLObject cdolist_list_var = coding_pairs;
        SubLObject coding_pair = (SubLObject)sksi_smt.NIL;
        coding_pair = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = coding_pair;
            SubLObject encoding_ass = (SubLObject)sksi_smt.NIL;
            SubLObject decoding_ass = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list174);
            encoding_ass = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list174);
            decoding_ass = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                final SubLObject sentence2 = fi.assertion_hl_formula(decoding_ass, (SubLObject)sksi_smt.UNPROVIDED);
                SubLObject current_$89;
                final SubLObject datum_$88 = current_$89 = sentence2;
                SubLObject pred = (SubLObject)sksi_smt.NIL;
                SubLObject ls_$90 = (SubLObject)sksi_smt.NIL;
                SubLObject lfi2 = (SubLObject)sksi_smt.NIL;
                SubLObject ps_$91 = (SubLObject)sksi_smt.NIL;
                SubLObject pfi_expr = (SubLObject)sksi_smt.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)sksi_smt.$list175);
                pred = current_$89.first();
                current_$89 = current_$89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)sksi_smt.$list175);
                ls_$90 = current_$89.first();
                current_$89 = current_$89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)sksi_smt.$list175);
                lfi2 = current_$89.first();
                current_$89 = current_$89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)sksi_smt.$list175);
                ps_$91 = current_$89.first();
                current_$89 = current_$89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)sksi_smt.$list175);
                pfi_expr = current_$89.first();
                current_$89 = current_$89.rest();
                if (sksi_smt.NIL == current_$89) {
                    if (sksi_smt.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !sksi_smt.$const176$fieldDecoding.eql(pred)) {
                        Errors.error((SubLObject)sksi_smt.$str177$Expected___fieldDecoding_sentence, sentence2);
                    }
                    final SubLObject field_index = map_utilities.map_get(lfi_map, lfi2, (SubLObject)sksi_smt.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject pf3 = sksi_smt_unpack_decoding_conversion_expression(ps_$91, pfi_expr);
                    final SubLObject conversion = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject pcase_var2 = field_index;
                    if (pcase_var2.eql((SubLObject)sksi_smt.ZERO_INTEGER)) {
                        pf1 = pf3;
                        convert1 = conversion;
                    }
                    else if (pcase_var2.eql((SubLObject)sksi_smt.ONE_INTEGER)) {
                        pf2 = pf3;
                        convert2 = conversion;
                    }
                    else {
                        Errors.error((SubLObject)sksi_smt.$str173$Dont_support_more_than_binary_pre);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$88, (SubLObject)sksi_smt.$list175);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list174);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coding_pair = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw178$PREDICATE, predicate, (SubLObject)sksi_smt.$kw179$PF1, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw180$TERM, pf1, (SubLObject)sksi_smt.$kw181$ARG_ISA, arg1_isa, (SubLObject)sksi_smt.$kw182$CONVERT, convert1), (SubLObject)sksi_smt.$kw183$PF2, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw180$TERM, pf2, (SubLObject)sksi_smt.$kw181$ARG_ISA, arg2_isa, (SubLObject)sksi_smt.$kw182$CONVERT, convert2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 32990L)
    public static SubLObject sksi_smt_unpack_decoding_conversion_expression(final SubLObject ps, final SubLObject pfi_expr) {
        final SubLObject operator = cycl_utilities.formula_operator(pfi_expr);
        if (sksi_smt.$const184$SchemaObjectFn.eql(operator)) {
            final SubLObject cmls = cycl_utilities.formula_arg1(pfi_expr, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject pfi = cycl_utilities.formula_arg2(pfi_expr, (SubLObject)sksi_smt.UNPROVIDED);
            return Values.values(sksi_smt_physical_field_for_pfi(pfi), (SubLObject)ConsesLow.list(sksi_smt.$const185$SchemaObjectIDFn, cmls, sksi_smt.$const186$TheTerm));
        }
        if (sksi_smt.NIL != el_utilities.lambda_function_p(operator)) {
            final SubLObject pfi2 = cycl_utilities.formula_arg1(pfi_expr, (SubLObject)sksi_smt.UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = operator;
            SubLObject lambda_operator = (SubLObject)sksi_smt.NIL;
            SubLObject var_list = (SubLObject)sksi_smt.NIL;
            SubLObject expression = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list187);
            lambda_operator = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list187);
            var_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list187);
            expression = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                final SubLObject var = var_list.first();
                final SubLObject conversion = list_utilities.tree_substitute(expression, var, sksi_smt.$const186$TheTerm);
                return Values.values(sksi_smt_physical_field_for_pfi(pfi2), conversion);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list187);
        }
        else {
            Errors.error((SubLObject)sksi_smt.$str188$Do_not_know_how_to_unpack_decodin, pfi_expr);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34007L)
    public static SubLObject enable_sksi_smt_mode() {
        sksi_smt.$sksi_smt_mode$.setGlobalValue((SubLObject)sksi_smt.$kw189$ENABLED);
        return sksi_smt.$sksi_smt_mode$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34139L)
    public static SubLObject disable_sksi_smt_mode() {
        sksi_smt.$sksi_smt_mode$.setGlobalValue((SubLObject)sksi_smt.$kw192$DISABLED);
        return sksi_smt.$sksi_smt_mode$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34274L)
    public static SubLObject is_sksi_smt_mode_enabledP() {
        return Equality.eq((SubLObject)sksi_smt.$kw189$ENABLED, sksi_smt.$sksi_smt_mode$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34384L)
    public static SubLObject get_sksi_smt_mode() {
        return (SubLObject)((sksi_smt.NIL != is_sksi_smt_mode_enabledP()) ? sksi_smt.$kw189$ENABLED : sksi_smt.$kw192$DISABLED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 34526L)
    public static SubLObject sksi_smt_get_units_of_measurement() {
        final SubLObject unit_map = quantities.get_interconvertible_units_of_measure((SubLObject)sksi_smt.$sym196$SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN);
        final SubLObject unit_type_tuples = sksi_smt_get_rendering_tuples(map_utilities.map_keys(unit_map));
        SubLObject units_of_measurement = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = unit_type_tuples;
        SubLObject unit_type_tuple = (SubLObject)sksi_smt.NIL;
        unit_type_tuple = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            final SubLObject fort = unit_type_tuple.first();
            final SubLObject units = map_utilities.map_get(unit_map, fort, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject units_tuples = sksi_smt_get_rendering_tuples(units);
            final SubLObject result = sksi_smt_assemble_units_result(unit_type_tuple, units_tuples);
            units_of_measurement = (SubLObject)ConsesLow.cons(result, units_of_measurement);
            cdolist_list_var = cdolist_list_var.rest();
            unit_type_tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(units_of_measurement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 35464L)
    public static SubLObject sksi_smt_assemble_units_result(final SubLObject header, final SubLObject tail) {
        return (SubLObject)ConsesLow.cons(header, tail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 35555L)
    public static SubLObject sksi_smt_uninteresting_units_filter_fn(final SubLObject fort) {
        return rkf_relevance_utilities.rkf_irrelevant_term(fort, sksi_smt.$const197$InferencePSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 35717L)
    public static SubLObject sksi_smt_get_rendering_tuples(final SubLObject v_forts) {
        final SubLObject renderings = api_widgets.convert_term_list_to_renderings_for_java(v_forts, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject results = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = renderings;
        SubLObject rendering = (SubLObject)sksi_smt.NIL;
        rendering = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rendering;
            SubLObject string_spec = (SubLObject)sksi_smt.NIL;
            SubLObject fort = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list198);
            string_spec = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list198);
            fort = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                final SubLObject string = string_spec.first();
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fort, string), results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list198);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rendering = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 36087L)
    public static SubLObject sksi_smt_derive_simple_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject relation, final SubLObject pf1, final SubLObject arg1_isa, final SubLObject convert1, final SubLObject pf2, final SubLObject arg2_isa, final SubLObject convert2, SubLObject use_original_predicateP) {
        if (use_original_predicateP == sksi_smt.UNPROVIDED) {
            use_original_predicateP = (SubLObject)sksi_smt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        final SubLObject bridging_mt = sks_get_bridging_or_content_mt(sks);
        final SubLObject col_name = sksi_smt_determine_dependent_colname(relation, pf1, pf2);
        final SubLObject ls_name = Sequences.cconcatenate(string_utilities.post_remove(sksi_ps_get_name(ps), (SubLObject)sksi_smt.$str200$_PS, (SubLObject)sksi_smt.UNPROVIDED), new SubLObject[] { sksi_smt.$str201$_, col_name, sksi_smt.$str202$_LS });
        SubLObject predicate = relation;
        final SubLObject ls = new_or_recycled_logical_schema(sks, ps, ls_name, constants_high.find_constant(ls_name), (SubLObject)sksi_smt.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject lfi1 = sksi_smt_logical_field_values_for_logical_schema(ls, arg1_isa, arg2_isa);
        final SubLObject lfi2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const203$logicalSchemaFieldTypeList, ls, el_utilities.make_binary_formula(sksi_smt.$const204$TheList, arg1_isa, arg2_isa)), mapping_mt);
        if (sksi_smt.NIL == use_original_predicateP) {
            predicate = sksi_smt_derive_indirecting_relation(ls, relation, arg1_isa, arg2_isa, bridging_mt);
        }
        final SubLObject sentence = el_utilities.make_binary_formula(predicate, lfi1, lfi2);
        final SubLObject meaning_sentence = el_utilities.make_binary_formula(sksi_smt.$const205$meaningSentenceOfSchema, ls, sentence);
        sksi_kb_accessors.sksi_assert_if_new(meaning_sentence, mapping_mt);
        SubLObject cdolist_list_var;
        final SubLObject tasks = cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pf1, lfi1, convert1), (SubLObject)ConsesLow.list(pf2, lfi2, convert2));
        SubLObject task = (SubLObject)sksi_smt.NIL;
        task = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = task;
            SubLObject pf3 = (SubLObject)sksi_smt.NIL;
            SubLObject lfi3 = (SubLObject)sksi_smt.NIL;
            SubLObject convert3 = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list206);
            pf3 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list206);
            lfi3 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list206);
            convert3 = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                final SubLObject pfi = sksi_smt_physical_field_value_indexical_for_pf(pf3);
                final SubLObject lf_conversion = sksi_smt_determine_lf_conversion(lfi3, convert3);
                final SubLObject pf_conversion = sksi_smt_determine_pf_conversion(pfi, convert3);
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_quaternary_formula(sksi_smt.$const207$fieldEncoding, ps, pfi, ls, lf_conversion), mapping_mt);
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_quaternary_formula(sksi_smt.$const176$fieldDecoding, ls, lfi3, ps, pf_conversion), mapping_mt);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list206);
            }
            cdolist_list_var = cdolist_list_var.rest();
            task = cdolist_list_var.first();
        }
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_unary_formula(sksi_smt.$const208$sksRepresentationComplete, sks), sksi_smt.$const209$SKSIMt);
        sksi_smt_register_structured_knowledge_source(sks);
        return ls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 38905L)
    public static SubLObject sksi_smt_derive_indirecting_relation(final SubLObject ls, final SubLObject relation, final SubLObject arg1_isa, final SubLObject arg2_isa, final SubLObject bridging_mt) {
        final SubLObject pred_name = Sequences.cconcatenate(string_utilities.post_remove(string_utilities.uncapitalize_first(kb_paths.fort_name(ls)), (SubLObject)sksi_smt.$str202$_LS, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.$str210$_Pred);
        final SubLObject predicate = ke.ke_create_now(pred_name, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.listS(sksi_smt.$const211$isa, predicate, (SubLObject)sksi_smt.$list212), sksi_smt.$const121$UniversalVocabularyMt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const213$termDependsOn, predicate, ls), sksi_smt.$const214$BaseKB, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const215$arg1Isa, predicate, arg1_isa), sksi_smt.$const214$BaseKB, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const216$arg2Isa, predicate, arg2_isa), sksi_smt.$const214$BaseKB, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const217$backchainForbidden, predicate), bridging_mt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != constant_handles.valid_constant(sksi_smt.$const172$correspondingSKSIPredicate, (SubLObject)sksi_smt.T)) {
            sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const172$correspondingSKSIPredicate, relation, predicate, ls), bridging_mt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        }
        else {
            sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.listS(sksi_smt.$const211$isa, predicate, (SubLObject)sksi_smt.$list218), sksi_smt.$const121$UniversalVocabularyMt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
            sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const219$backchainRequired, relation), bridging_mt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
            sksi_kb_accessors.sksi_assert((SubLObject)ConsesLow.list(sksi_smt.$const220$implies, reader.bq_cons(predicate, (SubLObject)sksi_smt.$list221), reader.bq_cons(relation, (SubLObject)sksi_smt.$list221)), bridging_mt, (SubLObject)sksi_smt.$kw155$DEFAULT, (SubLObject)sksi_smt.$kw222$BACKWARD);
        }
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40072L)
    public static SubLObject sksi_smt_physical_field_value_indexical_for_pf(final SubLObject pf) {
        final SubLObject el_formula = narts_high.nart_el_formula(czer_main.canonicalize_term(pf, (SubLObject)sksi_smt.UNPROVIDED));
        final SubLObject args = cycl_utilities.formula_args(el_formula, (SubLObject)sksi_smt.UNPROVIDED);
        return czer_main.canonicalize_term(el_utilities.make_formula(sksi_smt.$const223$ThePhysicalFieldValueFn, args, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40326L)
    public static SubLObject sksi_smt_physical_field_for_pfi(final SubLObject pfi) {
        final SubLObject el_formula = cycl_utilities.hl_to_el(czer_main.canonicalize_term(pfi, (SubLObject)sksi_smt.UNPROVIDED));
        final SubLObject args = cycl_utilities.formula_args(el_formula, (SubLObject)sksi_smt.UNPROVIDED);
        return czer_main.canonicalize_term(el_utilities.make_formula(sksi_smt.$const224$PhysicalFieldFn, args, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40551L)
    public static SubLObject sksi_smt_determine_dependent_colname(final SubLObject relation, final SubLObject pf1, final SubLObject pf2) {
        return sksi_smt_column_or_fort_name(pf2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 40760L)
    public static SubLObject sksi_smt_determine_lf_conversion(final SubLObject lfi, final SubLObject conversion) {
        final SubLObject operator = cycl_utilities.formula_operator(conversion);
        if (sksi_smt.$const185$SchemaObjectIDFn.eql(operator)) {
            return list_utilities.tree_substitute(conversion, sksi_smt.$const186$TheTerm, lfi);
        }
        if (sksi_smt.NIL != list_utilities.lengthE(conversion, (SubLObject)sksi_smt.TWO_INTEGER, (SubLObject)sksi_smt.UNPROVIDED) && sksi_smt.NIL != forts.fort_p(operator) && sksi_smt.$const186$TheTerm.eql(cycl_utilities.formula_arg1(conversion, (SubLObject)sksi_smt.UNPROVIDED))) {
            return el_utilities.make_unary_formula(list_utilities.tree_substitute((SubLObject)sksi_smt.$list225, (SubLObject)sksi_smt.$kw226$OPERATOR, operator), lfi);
        }
        Errors.error((SubLObject)sksi_smt.$str227$No_implementation_yet_for_LF_conv, conversion);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 41468L)
    public static SubLObject sksi_smt_determine_pf_conversion(final SubLObject pfi, final SubLObject conversion) {
        final SubLObject operator = cycl_utilities.formula_operator(conversion);
        if (sksi_smt.$const185$SchemaObjectIDFn.eql(operator)) {
            return list_utilities.tree_substitute(list_utilities.tree_substitute(conversion, sksi_smt.$const186$TheTerm, pfi), sksi_smt.$const185$SchemaObjectIDFn, sksi_smt.$const184$SchemaObjectFn);
        }
        if (sksi_smt.NIL != list_utilities.lengthE(conversion, (SubLObject)sksi_smt.TWO_INTEGER, (SubLObject)sksi_smt.UNPROVIDED) && sksi_smt.NIL != forts.fort_p(operator) && sksi_smt.$const186$TheTerm.eql(cycl_utilities.formula_arg1(conversion, (SubLObject)sksi_smt.UNPROVIDED))) {
            return el_utilities.make_unary_formula(list_utilities.tree_substitute((SubLObject)sksi_smt.$list228, (SubLObject)sksi_smt.$kw226$OPERATOR, operator), pfi);
        }
        Errors.error((SubLObject)sksi_smt.$str229$No_implementation_yet_for_PF_conv, conversion);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
    public static SubLObject clear_sksi_smt_column_or_fort_name() {
        final SubLObject cs = sksi_smt.$sksi_smt_column_or_fort_name_caching_state$.getGlobalValue();
        if (sksi_smt.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
    public static SubLObject remove_sksi_smt_column_or_fort_name(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_smt.$sksi_smt_column_or_fort_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_object), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
    public static SubLObject sksi_smt_column_or_fort_name_internal(final SubLObject v_object) {
        if (sksi_smt.NIL != nart_handles.nart_p(v_object)) {
            final SubLObject formula = narts_high.nart_el_formula(v_object);
            if (sksi_smt.$const224$PhysicalFieldFn.eql(cycl_utilities.formula_operator(formula))) {
                return cycl_utilities.formula_arg2(v_object, (SubLObject)sksi_smt.UNPROVIDED);
            }
        }
        return kb_paths.fort_name(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42211L)
    public static SubLObject sksi_smt_column_or_fort_name(final SubLObject v_object) {
        SubLObject caching_state = sksi_smt.$sksi_smt_column_or_fort_name_caching_state$.getGlobalValue();
        if (sksi_smt.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_smt.$sym230$SKSI_SMT_COLUMN_OR_FORT_NAME, (SubLObject)sksi_smt.$sym231$_SKSI_SMT_COLUMN_OR_FORT_NAME_CACHING_STATE_, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.EQL, (SubLObject)sksi_smt.ONE_INTEGER, (SubLObject)sksi_smt.$int232$200);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_smt_column_or_fort_name_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_smt.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 42627L)
    public static SubLObject sksi_smt_edit_ls_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw29$ON_EDIT_LS, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject ps = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw47$PS, arghash);
        final SubLObject ls = (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash)) ? html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash) : new_logical_schema(sks, ps, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject lfs = sksi_ls_get_lfs(ls);
        final SubLObject mss = sksi_ls_get_mss(ls);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw50$LS, ls, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str233$Edit_Logical_Schema__);
        sksi_form(sks);
        html_utilities.html_princ((SubLObject)sksi_smt.$str157$___);
        sksi_arghash_form(arghash, ls);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != lfs) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)sksi_smt.$str234$Logical_fields_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str235$CycL);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str236$Field_isa);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str237$__user_MS_s);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject list_var = (SubLObject)sksi_smt.NIL;
                SubLObject lf = (SubLObject)sksi_smt.NIL;
                SubLObject counter = (SubLObject)sksi_smt.NIL;
                list_var = lfs;
                lf = list_var.first();
                for (counter = (SubLObject)sksi_smt.ZERO_INTEGER; sksi_smt.NIL != list_var; list_var = list_var.rest(), lf = list_var.first(), counter = Numbers.add((SubLObject)sksi_smt.ONE_INTEGER, counter)) {
                    final SubLObject lf_cycl = sksi_lf_get_cycl(lf);
                    final SubLObject lf_isas = sksi_lf_get_isas(lf);
                    SubLObject lf_ms_count = (SubLObject)sksi_smt.ZERO_INTEGER;
                    SubLObject cdolist_list_var = mss;
                    SubLObject ms = (SubLObject)sksi_smt.NIL;
                    ms = cdolist_list_var.first();
                    while (sksi_smt.NIL != cdolist_list_var) {
                        if (sksi_smt.NIL != sksi_ms_get_asserted(ms)) {
                            final SubLObject ms_cycl = sksi_ms_get_cycl(ms);
                            if (sksi_smt.NIL != subl_promotions.memberP(lf_cycl, ms_cycl, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED)) {
                                lf_ms_count = Numbers.add(lf_ms_count, (SubLObject)sksi_smt.ONE_INTEGER);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ms = cdolist_list_var.first();
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw81$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (counter.isZero()) {
                                html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw238$ARG1, lf, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                            else {
                                html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)sksi_smt.$kw239$ARG2, lf, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            sksi_arghash_form(arghash, lf_cycl);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != lf_isas) {
                                SubLObject cdolist_list_var2 = lf_isas;
                                SubLObject lf_isa = (SubLObject)sksi_smt.NIL;
                                lf_isa = cdolist_list_var2.first();
                                while (sksi_smt.NIL != cdolist_list_var2) {
                                    sksi_form(lf_isa);
                                    html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    lf_isa = cdolist_list_var2.first();
                                }
                            }
                            else {
                                html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_utilities.html_princ(lf_ms_count);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str10$Edit, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw240$COMMAND_EDIT_LF, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls, (SubLObject)sksi_smt.$kw56$LF, lf), (SubLObject)sksi_smt.UNPROVIDED);
                            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str241$Delete, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_smt.$kw118$COMMAND_EDIT_LS, sksi_smt.$kw242$DELETE_LF, lf, sksi_smt.$kw44$SKS, sks, sksi_smt.$kw50$LS, ls, sksi_smt.$kw56$LF, lf }), (SubLObject)sksi_smt.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_princ((SubLObject)sksi_smt.$str243$No_fields_in_this_logical_schema_);
        }
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str244$Add_logical_field, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw240$COMMAND_EDIT_LF, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls), (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        if (sksi_smt.NIL != mss) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)sksi_smt.$str245$Meaning_sentences_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_princ((SubLObject)sksi_smt.$str235$CycL);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                SubLObject cdolist_list_var3 = mss;
                SubLObject ms2 = (SubLObject)sksi_smt.NIL;
                ms2 = cdolist_list_var3.first();
                while (sksi_smt.NIL != cdolist_list_var3) {
                    final SubLObject ms_cycl2 = sksi_ms_get_cycl(ms2);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            cb_utilities.cb_assertion_ball(ms2, (SubLObject)sksi_smt.UNPROVIDED);
                            sksi_form(ms_cycl2);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            if (sksi_smt.NIL != sksi_ms_get_asserted(ms2)) {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str10$Edit, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw246$COMMAND_EDIT_MS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls, (SubLObject)sksi_smt.$kw247$MS, ms2), (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str241$Delete, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_smt.$kw118$COMMAND_EDIT_LS, sksi_smt.$kw248$DELETE_MS, ms2, sksi_smt.$kw44$SKS, sks, sksi_smt.$kw50$LS, ls, sksi_smt.$kw247$MS, ms2 }), (SubLObject)sksi_smt.UNPROVIDED);
                            }
                            else {
                                html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    ms2 = cdolist_list_var3.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_princ((SubLObject)sksi_smt.$str249$No_meaning_sentences_in_this_logi);
        }
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_text_input(arghash, (SubLObject)sksi_smt.$kw178$PREDICATE, (SubLObject)sksi_smt.$str250$, (SubLObject)sksi_smt.$int251$60, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.ONE_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str252$Add_meaning_sentence, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw246$COMMAND_EDIT_MS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls), (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str109$OK, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 46197L)
    public static SubLObject sksi_smt_edit_ls_actions(final SubLObject arghash) {
        final SubLObject lf = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash);
        final SubLObject ms = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw247$MS, arghash);
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw242$DELETE_LF, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw242$DELETE_LF, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash);
            sksi_kb_accessors.sksi_kill(lf);
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw248$DELETE_MS, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw248$DELETE_MS, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw247$MS, arghash);
            sksi_kb_accessors.sksi_unassert(uncanonicalizer.assertion_el_formula(ms), hlmt.assertion_hlmt(ms));
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 46885L)
    public static SubLObject sksi_smt_edit_lf_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw30$ON_EDIT_LF, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash);
        SubLObject lf = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw50$LS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL == lf) {
            lf = new_logical_field(sks, ls);
        }
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw56$LF, lf, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str253$Edit_Logical_Field__);
        sksi_form(sks);
        html_utilities.html_princ((SubLObject)sksi_smt.$str157$___);
        sksi_arghash_form(arghash, ls);
        html_utilities.html_princ((SubLObject)sksi_smt.$str157$___);
        sksi_arghash_form(arghash, lf);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != nart_handles.nart_p(lf)) {
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (sksi_smt.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_princ((SubLObject)sksi_smt.$str254$Editing_this_field_will_automatic);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        }
        final SubLObject lf_cycl = sksi_lf_get_cycl(lf);
        final SubLObject lf_isas = sksi_lf_get_isas(lf);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)sksi_smt.$str255$Logical_field_);
        sksi_arghash_form(arghash, lf_cycl);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)sksi_smt.$str236$Field_isa);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        SubLObject cdolist_list_var = lf_isas;
        SubLObject lf_isa = (SubLObject)sksi_smt.NIL;
        lf_isa = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw256$ISA, lf_isa, (SubLObject)sksi_smt.UNPROVIDED);
            html_arghash.html_arghash_fort_input(arghash, (SubLObject)sksi_smt.$kw257$NEW_ISA, lf_isa, (SubLObject)sksi_smt.$int258$30, (SubLObject)sksi_smt.$str259$Complete, sksi_smt.$const260$Collection);
            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str261$Change, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str241$Delete, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_smt.$kw240$COMMAND_EDIT_LF, sksi_smt.$kw262$REMOVE_ISA, sksi_smt.T, sksi_smt.$kw263$REMOVED_ISA, lf_isa, sksi_smt.$kw44$SKS, sks, sksi_smt.$kw50$LS, ls }), (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            lf_isa = cdolist_list_var.first();
        }
        html_arghash.html_arghash_fort_input(arghash, (SubLObject)sksi_smt.$kw264$ADDED_ISA, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.$int258$30, (SubLObject)sksi_smt.$str259$Complete, sksi_smt.$const260$Collection);
        html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str265$Add_isa, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw240$COMMAND_EDIT_LF, (SubLObject)sksi_smt.$kw266$ADD_ISA, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls), (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str107$Refresh, (SubLObject)sksi_smt.$kw108$REFRESH, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str109$OK, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str111$Cancel, (SubLObject)sksi_smt.$kw51$TO_EDIT_LS, (SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 48925L)
    public static SubLObject sksi_smt_edit_lf_actions(final SubLObject arghash) {
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash);
        SubLObject lf = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash);
        final SubLObject lsb_mt = sks_get_logical_schemabase_mt(sks);
        final SubLObject isas = html_arghash.get_arghash_value_list((SubLObject)sksi_smt.$kw256$ISA, arghash);
        final SubLObject new_isas = html_arghash.get_arghash_value_list((SubLObject)sksi_smt.$kw257$NEW_ISA, arghash);
        html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw256$ISA, arghash);
        html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw257$NEW_ISA, arghash);
        final SubLObject unassert_isas = conses_high.set_difference(isas, new_isas, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject assert_isas = conses_high.set_difference(new_isas, isas, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        if ((sksi_smt.NIL != unassert_isas || sksi_smt.NIL != assert_isas) && sksi_smt.NIL != nart_handles.nart_p(lf)) {
            lf = sksi_lf_convert_to_constant(sks, ls, lf);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash, lf);
        }
        SubLObject cdolist_list_var = unassert_isas;
        SubLObject unassert_isa = (SubLObject)sksi_smt.NIL;
        unassert_isa = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_unassert(el_utilities.make_binary_formula(sksi_smt.$const267$fieldIsa, lf, unassert_isa), lsb_mt);
            cdolist_list_var = cdolist_list_var.rest();
            unassert_isa = cdolist_list_var.first();
        }
        cdolist_list_var = assert_isas;
        SubLObject assert_isa = (SubLObject)sksi_smt.NIL;
        assert_isa = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const267$fieldIsa, lf, assert_isa), lsb_mt);
            cdolist_list_var = cdolist_list_var.rest();
            assert_isa = cdolist_list_var.first();
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw262$REMOVE_ISA, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw262$REMOVE_ISA, arghash);
            if (sksi_smt.NIL != nart_handles.nart_p(lf)) {
                lf = sksi_lf_convert_to_constant(sks, ls, lf);
                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash, lf);
            }
            final SubLObject removed_isa = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw263$REMOVED_ISA, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw263$REMOVED_ISA, arghash);
            sksi_kb_accessors.sksi_unassert(el_utilities.make_binary_formula(sksi_smt.$const267$fieldIsa, lf, removed_isa), lsb_mt);
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw266$ADD_ISA, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw266$ADD_ISA, arghash);
            if (sksi_smt.NIL != nart_handles.nart_p(lf)) {
                lf = sksi_lf_convert_to_constant(sks, ls, lf);
                html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw56$LF, arghash, lf);
            }
            final SubLObject isa_col = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw264$ADDED_ISA, arghash);
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw264$ADDED_ISA, arghash);
            if (sksi_smt.NIL != isa_col) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const267$fieldIsa, lf, isa_col), lsb_mt);
            }
        }
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash)) {
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw57$TO_EDIT_LF, arghash, (SubLObject)sksi_smt.T);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw51$TO_EDIT_LS, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 50939L)
    public static SubLObject sksi_smt_edit_ts_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw33$ON_EDIT_TS, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject ps = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw47$PS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw47$PS, ps, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw50$LS, ls, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str268$Edit_Translation_Schema__);
        sksi_form(sks);
        html_utilities.html_princ((SubLObject)sksi_smt.$str157$___);
        sksi_arghash_form(arghash, ps);
        final SubLObject this_arghash = hash_table_utilities.copy_hashtable(arghash, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.set_arghash_value((SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw119$COMMAND_EDIT_TS, (SubLObject)sksi_smt.T), this_arghash, (SubLObject)sksi_smt.T);
        final SubLObject href = PrintLow.format((SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.$str269$_A__A, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_arghash.html_arghash_href(this_arghash, (SubLObject)sksi_smt.$str16$sksi_smt));
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(href);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_princ((SubLObject)sksi_smt.$str270$___);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        sksi_arghash_form(arghash, ls);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (sksi_smt.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_princ((SubLObject)sksi_smt.$str271$_note__editing_is_not_yet_enabled);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        thread.resetMultipleValues();
        final SubLObject translation_pairs = sksi_sks_get_translations(sks, ps, ls, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject encodings_only = thread.secondMultipleValue();
        final SubLObject decodings_only = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            SubLObject cdolist_list_var = translation_pairs;
            SubLObject translation_pair = (SubLObject)sksi_smt.NIL;
            translation_pair = cdolist_list_var.first();
            while (sksi_smt.NIL != cdolist_list_var) {
                html_sksi_show_translation(arghash, translation_pair);
                cdolist_list_var = cdolist_list_var.rest();
                translation_pair = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 52429L)
    public static SubLObject html_sksi_show_translation(final SubLObject arghash, final SubLObject translation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject physical_field = (SubLObject)sksi_smt.NIL;
        SubLObject logical_field = (SubLObject)sksi_smt.NIL;
        SubLObject encoding = (SubLObject)sksi_smt.NIL;
        SubLObject decoding = (SubLObject)sksi_smt.NIL;
        SubLObject decoding_formula = (SubLObject)sksi_smt.NIL;
        SubLObject encoding_formula = (SubLObject)sksi_smt.NIL;
        if (translation.isList()) {
            encoding = translation.first();
            decoding = conses_high.second(translation);
            physical_field = cycl_utilities.sentence_arg2(uncanonicalizer.assertion_el_formula(encoding), (SubLObject)sksi_smt.UNPROVIDED);
            logical_field = cycl_utilities.sentence_arg2(uncanonicalizer.assertion_el_formula(decoding), (SubLObject)sksi_smt.UNPROVIDED);
            decoding_formula = cycl_utilities.sentence_arg4(uncanonicalizer.assertion_el_formula(decoding), (SubLObject)sksi_smt.UNPROVIDED);
            encoding_formula = cycl_utilities.sentence_arg4(uncanonicalizer.assertion_el_formula(encoding), (SubLObject)sksi_smt.UNPROVIDED);
        }
        else if (cycl_utilities.sentence_arg0(translation).eql(sksi_smt.$const207$fieldEncoding)) {
            final SubLObject encoding_$110 = uncanonicalizer.assertion_el_formula(translation);
            physical_field = cycl_utilities.sentence_arg2(encoding_$110, (SubLObject)sksi_smt.UNPROVIDED);
            encoding_formula = cycl_utilities.sentence_arg4(encoding_$110, (SubLObject)sksi_smt.UNPROVIDED);
        }
        else if (cycl_utilities.sentence_arg0(translation).eql(sksi_smt.$const176$fieldDecoding)) {
            final SubLObject decoding_$111 = uncanonicalizer.assertion_el_formula(translation);
            logical_field = cycl_utilities.sentence_arg2(decoding_$111, (SubLObject)sksi_smt.UNPROVIDED);
            decoding_formula = cycl_utilities.sentence_arg4(decoding_$111, (SubLObject)sksi_smt.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw95$RIGHT));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                sksi_form(physical_field);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw272$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw81$TOP));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_princ((SubLObject)sksi_smt.$str273$___);
                html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
                cb_utilities.cb_assertion_ball(decoding, (SubLObject)sksi_smt.UNPROVIDED);
                cb_utilities.cb_assertion_ball(encoding, (SubLObject)sksi_smt.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw112$LEFT));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                sksi_form(logical_field);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_arghash.html_arghash_sentence_input(arghash, (SubLObject)sksi_smt.$kw274$DECODING_FORMULA, decoding_formula, (SubLObject)sksi_smt.THREE_INTEGER, (SubLObject)sksi_smt.$int275$50, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_arghash.html_arghash_sentence_input(arghash, (SubLObject)sksi_smt.$kw276$ENCODING_FORMULA, encoding_formula, (SubLObject)sksi_smt.THREE_INTEGER, (SubLObject)sksi_smt.$int275$50, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_smt.FIVE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                html_utilities.html_glyph((SubLObject)sksi_smt.$kw80$NBSP, (SubLObject)sksi_smt.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54188L)
    public static SubLObject sksi_smt_edit_ts_actions(final SubLObject arghash) {
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54272L)
    public static SubLObject sksi_smt_edit_t_page(final SubLObject arghash) {
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54434L)
    public static SubLObject sksi_smt_edit_t_actions(final SubLObject arghash) {
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 54501L)
    public static SubLObject sksi_smt_edit_ms_page(final SubLObject arghash) {
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw31$ON_EDIT_MS, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw50$LS, arghash);
        final SubLObject ms = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw247$MS, arghash);
        final SubLObject predicate = misc_kb_utilities.guess_fort(html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw178$PREDICATE, arghash));
        final SubLObject lf_arg1 = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw238$ARG1, arghash);
        final SubLObject lf_arg2 = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw239$ARG2, arghash);
        final SubLObject ms_formula = (SubLObject)((sksi_smt.NIL != ms) ? uncanonicalizer.assertion_el_formula(ms) : sksi_smt.NIL);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw50$LS, ls, (SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw247$MS, ms, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str277$Edit_Meaning_Sentence_in__);
        sksi_form(sks);
        html_utilities.html_princ((SubLObject)sksi_smt.$str157$___);
        sksi_arghash_form(arghash, ls);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL != ms_formula) {
            html_arghash.html_arghash_sentence_input(arghash, (SubLObject)sksi_smt.$kw278$MS_FORMULA, ms_formula, (SubLObject)sksi_smt.TEN_INTEGER, (SubLObject)sksi_smt.$int251$60, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        }
        else {
            final SubLObject sentence = el_utilities.make_binary_formula(predicate, lf_arg1, lf_arg2);
            final SubLObject meaning_sentence = el_utilities.make_binary_formula(sksi_smt.$const205$meaningSentenceOfSchema, ls, sentence);
            html_arghash.html_arghash_textarea_input(arghash, (SubLObject)sksi_smt.$kw278$MS_FORMULA, meaning_sentence, (SubLObject)sksi_smt.$int251$60, (SubLObject)sksi_smt.TEN_INTEGER, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.$kw279$EL_FORMULA);
        }
        html_utilities.html_newline((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str109$OK, (SubLObject)sksi_smt.$kw110$OK, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str111$Cancel, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw246$COMMAND_EDIT_MS, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.$kw50$LS, ls), (SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 55886L)
    public static SubLObject sksi_smt_edit_ms_actions(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw51$TO_EDIT_LS, arghash, (SubLObject)sksi_smt.T);
            final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
            final SubLObject lsb = sks_get_logical_schemabase_mt(sks);
            final SubLObject ms = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw247$MS, arghash);
            final SubLObject old_ms_formula = (SubLObject)((sksi_smt.NIL != assertion_handles.assertion_p(ms)) ? uncanonicalizer.assertion_el_formula(ms) : sksi_smt.NIL);
            final SubLObject ms_formula = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw278$MS_FORMULA, arghash);
            if (sksi_smt.NIL == ms_formula) {
                html_arghash.push_arghash_value((SubLObject)sksi_smt.$kw60$ERROR, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw280$NULL_FORMULA, (SubLObject)sksi_smt.$str281$Formula_invalid_), arghash);
            }
            else if (old_ms_formula.equal(ms_formula)) {
                html_arghash.push_arghash_value((SubLObject)sksi_smt.$kw60$ERROR, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw280$NULL_FORMULA, (SubLObject)sksi_smt.$str282$Formula_wasn_t_changed_), arghash);
            }
            else if (sksi_smt.NIL == old_ms_formula) {
                sksi_kb_accessors.sksi_assert_if_new(ms_formula, lsb);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject result = sksi_kb_accessors.sksi_edit_assertion(ms, ms_formula);
                final SubLObject error = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_smt.NIL != error) {
                    html_arghash.push_arghash_value((SubLObject)sksi_smt.$kw60$ERROR, error, arghash);
                }
            }
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw283$CANCEL, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw110$OK, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw51$TO_EDIT_LS, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 56984L)
    public static SubLObject sksi_smt_decode_psb_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw32$ON_DECODE_PSB, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
        SubLObject table_info = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw284$TABLE_INFO, arghash);
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        final SubLObject named_schemata = sksi_sks_structure_importer_utilities.cluster_physical_database_table_information_by_schemata(sksi_psb_get_labeled_schemata(psb));
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw44$SKS, sks, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL == table_info) {
            final SubLObject raw_table_info = sksi_sks_structure_importer_utilities.sks_gather_physical_database_table_names(sks, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
            table_info = sksi_sks_structure_importer_utilities.cluster_physical_database_table_information_by_schemata(raw_table_info);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw284$TABLE_INFO, arghash, table_info);
        }
        html_arghash.html_arghash_hidden_input(arghash, (SubLObject)sksi_smt.$kw284$TABLE_INFO, table_info, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_princ((SubLObject)sksi_smt.$str285$Select_Database_Tables_to_Decode_);
        sksi_form(sks);
        html_utilities.html_princ((SubLObject)sksi_smt.$str286$__);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)sksi_smt.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject cdolist_list_var = table_info;
        SubLObject schema_info = (SubLObject)sksi_smt.NIL;
        schema_info = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = schema_info;
            SubLObject schema_name = (SubLObject)sksi_smt.NIL;
            SubLObject table_details = (SubLObject)sksi_smt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list287);
            schema_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list287);
            table_details = current.first();
            current = current.rest();
            if (sksi_smt.NIL == current) {
                final SubLObject curr_named_schema_tables = conses_high.second(Sequences.find(schema_name, named_schemata, (SubLObject)sksi_smt.$sym288$STRING_, (SubLObject)sksi_smt.$sym289$FIRST, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)sksi_smt.FIVE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                html_utilities.html_princ((SubLObject)sksi_smt.$str290$Schema_);
                html_utilities.html_princ(schema_name);
                html_utilities.html_princ((SubLObject)sksi_smt.$str291$__);
                dhtml_macros.dhtml_switch_visibility_links(schema_name, (SubLObject)sksi_smt.$str292$Show, (SubLObject)sksi_smt.$str293$Hide);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)sksi_smt.FIVE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                dhtml_macros.dhtml_set_switched_visibility(schema_name, (SubLObject)sksi_smt.$kw294$INVISIBLE, (SubLObject)sksi_smt.$kw295$PARAGRAPH);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (sksi_smt.NIL != schema_name) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup(schema_name);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_smt.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                        final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw112$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw81$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)sksi_smt.$str296$Table_Name);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                            final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                if (sksi_smt.NIL != list_utilities.sublisp_boolean(curr_named_schema_tables)) {
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)sksi_smt.$str297$Physical_Schemata);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                        SubLObject cdolist_list_var_$123 = table_details;
                        SubLObject table_detail = (SubLObject)sksi_smt.NIL;
                        table_detail = cdolist_list_var_$123.first();
                        while (sksi_smt.NIL != cdolist_list_var_$123) {
                            final SubLObject table_name = table_detail.first();
                            final SubLObject table_schema_details = Sequences.find(table_name, curr_named_schema_tables, (SubLObject)sksi_smt.$sym288$STRING_, (SubLObject)sksi_smt.$sym289$FIRST, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                            final SubLObject arg_ref = Sequences.cconcatenate(schema_name, new SubLObject[] { sksi_smt.$str126$_, table_name });
                            final SubLObject reifiedP = list_utilities.sublisp_boolean(table_schema_details);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw272$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw272$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                    if (sksi_smt.NIL == reifiedP) {
                                        html_arghash.html_arghash_checkbox_input(arghash, arg_ref, (SubLObject)sksi_smt.T, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw112$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw272$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                    html_utilities.html_princ(table_name);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw112$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_smt.$kw272$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_smt.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_smt.UNPROVIDED);
                                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)sksi_smt.T, thread);
                                    if (sksi_smt.NIL != reifiedP) {
                                        sksi_arghash_form(arghash, conses_high.second(table_schema_details));
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
                            cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                            table_detail = cdolist_list_var_$123.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_smt.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list287);
            }
            cdolist_list_var = cdolist_list_var.rest();
            schema_info = cdolist_list_var.first();
        }
        html_utilities.html_newline((SubLObject)sksi_smt.TWO_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str107$Refresh, (SubLObject)sksi_smt.$kw108$REFRESH, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str98$Decode, (SubLObject)sksi_smt.$kw298$DECODE, (SubLObject)sksi_smt.UNPROVIDED);
        html_utilities.html_indent((SubLObject)sksi_smt.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)sksi_smt.$str111$Cancel, (SubLObject)ConsesLow.list((SubLObject)sksi_smt.$kw78$COMMAND_EDIT_SKS, (SubLObject)sksi_smt.$kw44$SKS, sks), (SubLObject)sksi_smt.UNPROVIDED);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 60140L)
    public static SubLObject sksi_smt_decode_psb_actions(final SubLObject arghash) {
        if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw108$REFRESH, arghash);
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw298$DECODE, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw298$DECODE, arghash);
            final SubLObject sks = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw44$SKS, arghash);
            final SubLObject table_info = html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw284$TABLE_INFO, arghash);
            if (sksi_smt.NIL == sks_get_psb(sks)) {
                sks_new_psb(sks);
            }
            SubLObject cdolist_list_var = table_info;
            SubLObject schema_info = (SubLObject)sksi_smt.NIL;
            schema_info = cdolist_list_var.first();
            while (sksi_smt.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = schema_info;
                SubLObject schema_name = (SubLObject)sksi_smt.NIL;
                SubLObject table_details = (SubLObject)sksi_smt.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list287);
                schema_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list287);
                table_details = current.first();
                current = current.rest();
                if (sksi_smt.NIL == current) {
                    SubLObject cdolist_list_var_$128 = table_details;
                    SubLObject table_detail = (SubLObject)sksi_smt.NIL;
                    table_detail = cdolist_list_var_$128.first();
                    while (sksi_smt.NIL != cdolist_list_var_$128) {
                        final SubLObject table_name = table_detail.first();
                        final SubLObject arg_ref = Sequences.cconcatenate(schema_name, new SubLObject[] { sksi_smt.$str126$_, table_name });
                        if (sksi_smt.NIL != html_arghash.get_arghash_value(arg_ref, arghash)) {
                            sksi_sks_structure_importer_utilities.sks_physical_structure_decode_database_table(sks, table_name, schema_name, (SubLObject)sksi_smt.UNPROVIDED);
                            html_arghash.rem_arghash_value(arg_ref, arghash);
                        }
                        cdolist_list_var_$128 = cdolist_list_var_$128.rest();
                        table_detail = cdolist_list_var_$128.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list287);
                }
                cdolist_list_var = cdolist_list_var.rest();
                schema_info = cdolist_list_var.first();
            }
        }
        else if (sksi_smt.NIL != html_arghash.get_arghash_value((SubLObject)sksi_smt.$kw283$CANCEL, arghash)) {
            html_arghash.rem_arghash_value((SubLObject)sksi_smt.$kw283$CANCEL, arghash);
            html_arghash.set_arghash_value((SubLObject)sksi_smt.$kw45$TO_EDIT_SKS, arghash, (SubLObject)sksi_smt.T);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 61219L)
    public static SubLObject sks_get_sd(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return sksi_sks_accessors.sks_fget(sks, sksi_smt.$const300$sksSourceDescriptionMt, sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 61493L)
    public static SubLObject sks_get_source_description_mt(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject sd = sks_get_sd(sks);
        if (sksi_smt.NIL != sd) {
            return sksi_sd_get_mt(sd);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 61666L)
    public static SubLObject sks_new_sd(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject new_sd = el_utilities.make_unary_formula(sksi_smt.$const301$MappingMtFn, sks);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, new_sd, sksi_smt.$const302$SKSISourceDescriptionMicrotheory), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_sks_accessors.sks_fset(sks, sksi_smt.$const300$sksSourceDescriptionMt, new_sd, sksi_smt.$const121$UniversalVocabularyMt);
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        if (sksi_smt.NIL != forts.fort_p(psb)) {
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const303$genlMt, new_sd, psb), sksi_smt.$const214$BaseKB);
        }
        return new_sd;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 62161L)
    public static SubLObject sks_get_psb(final SubLObject sks) {
        return sksi_sks_accessors.sks_fget(sks, sksi_smt.$const120$sksPhysicalSchemaDescriptionMt, sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 62280L)
    public static SubLObject sks_get_physical_schemabase_mt(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject psb = sks_get_psb(sks);
        if (sksi_smt.NIL != psb) {
            return sksi_psb_get_mt(psb);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 62459L)
    public static SubLObject sks_new_psb(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject sks_string = sksi_sks_accessors.sks_get_string(sks);
        final SubLObject new_psb = sksi_kb_accessors.sksi_find_or_create(Sequences.cconcatenate(string_utilities.post_remove(sks_string, (SubLObject)sksi_smt.$str304$_KS, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.$str305$PhysicalSchemaMt));
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, new_psb, sksi_smt.$const306$SKSIPhysicalSchemaDescriptionMicr), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const303$genlMt, new_psb, sksi_smt.$const209$SKSIMt), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_sks_accessors.sks_fset(sks, sksi_smt.$const120$sksPhysicalSchemaDescriptionMt, new_psb, sksi_smt.$const121$UniversalVocabularyMt);
        final SubLObject sdb = sks_get_source_description_mt(sks);
        if (sksi_smt.NIL != forts.fort_p(sdb)) {
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const303$genlMt, sdb, new_psb), sksi_smt.$const214$BaseKB);
        }
        return new_psb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63156L)
    public static SubLObject sks_get_lsb(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return sksi_sks_accessors.sks_fget(sks, sksi_smt.$const307$sksLogicalSchemaDescriptionMt, sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63299L)
    public static SubLObject sks_get_logical_schemabase_mt(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject lsb = sks_get_lsb(sks);
        if (sksi_smt.NIL != lsb) {
            return sksi_lsb_get_mt(lsb);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63477L)
    public static SubLObject sks_get_tsb(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return sksi_sks_accessors.sks_fget(sks, sksi_smt.$const308$sksSchemaTranslationMt, sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63612L)
    public static SubLObject sks_get_translation_schemabase_mt(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject tsb = sks_get_tsb(sks);
        if (sksi_smt.NIL != tsb) {
            return sksi_tsb_get_mt(tsb);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63794L)
    public static SubLObject sks_get_bridging_or_content_mt(final SubLObject sks) {
        SubLObject result = sks_get_bmt(sks);
        if (sksi_smt.NIL == fort_types_interface.microtheory_p(result)) {
            result = sks_get_cmt(sks);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 63983L)
    public static SubLObject sks_get_cmt(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return sksi_sks_accessors.sks_fget(sks, sksi_smt.$const309$contentMt, sksi_smt.$const214$BaseKB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64090L)
    public static SubLObject sks_get_bmt(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return sksi_sks_accessors.sks_fget(sks, sksi_smt.$const310$bridgingMtForKS, sksi_smt.$const214$BaseKB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64203L)
    public static SubLObject sks_set_source_description_mt(final SubLObject sks, final SubLObject sd) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != hlmt.hlmt_p(sd) : sd;
        return sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const300$sksSourceDescriptionMt, sks, sd), sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64502L)
    public static SubLObject sks_set_physical_schemabase_mt(final SubLObject sks, final SubLObject psb) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != hlmt.hlmt_p(psb) : psb;
        return sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const120$sksPhysicalSchemaDescriptionMt, sks, psb), sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64730L)
    public static SubLObject sks_set_logical_schemabase_mt(final SubLObject sks, final SubLObject lsb) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != hlmt.hlmt_p(lsb) : lsb;
        return sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const307$sksLogicalSchemaDescriptionMt, sks, lsb), sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 64956L)
    public static SubLObject sks_set_translation_schemabase_mt(final SubLObject sks, final SubLObject tsb) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != hlmt.hlmt_p(tsb) : tsb;
        return sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const308$sksSchemaTranslationMt, sks, tsb), sksi_smt.$const121$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65395L)
    public static SubLObject sksi_smt_check_isa_invariant(final SubLObject v_object, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_smt.NIL == isa.isa_in_any_mtP(v_object, col) && sksi_smt.NIL != list_utilities.sublisp_boolean(sksi_smt.$sksi_smt_warn_about_invariantsP$.getDynamicValue(thread))) {
            Errors.warn((SubLObject)sksi_smt.$str313$SMT_invariant_broken___A_is_not_a, v_object, col);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65642L)
    public static SubLObject sksi_source_description_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, sksi_smt.$const302$SKSISourceDescriptionMicrotheory);
        return (SubLObject)sksi_smt.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65823L)
    public static SubLObject sksi_sd_get_mt(final SubLObject sd) {
        assert sksi_smt.NIL != sksi_source_description_p(sd) : sd;
        return sd;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 65918L)
    public static SubLObject sksi_physical_schemabase_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, sksi_smt.$const306$SKSIPhysicalSchemaDescriptionMicr);
        return (SubLObject)sksi_smt.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66190L)
    public static SubLObject sksi_psb_get_name(final SubLObject psb) {
        assert sksi_smt.NIL != sksi_physical_schemabase_p(psb) : psb;
        return kb_paths.fort_name(psb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66304L)
    public static SubLObject sksi_psb_get_mt(final SubLObject psb) {
        assert sksi_smt.NIL != sksi_physical_schemabase_p(psb) : psb;
        return psb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66404L)
    public static SubLObject sksi_physical_schema_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_smt.$const46$PhysicalSchema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66505L)
    public static SubLObject sksi_ps_get_name(final SubLObject ps) {
        assert sksi_smt.NIL != sksi_physical_schema_p(ps) : ps;
        return kb_paths.fort_name(ps);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66611L)
    public static SubLObject sksi_ps_get_pfs(final SubLObject ps) {
        assert sksi_smt.NIL != sksi_physical_schema_p(ps) : ps;
        final SubLObject pf_strings = kb_mapping_utilities.fpred_value_in_any_mt(ps, sksi_smt.$const317$schemaFieldNameList, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject result = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = pf_strings;
        SubLObject pf_string = (SubLObject)sksi_smt.NIL;
        pf_string = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            final SubLObject pf = sksi_kb_accessors.sksi_find_nart(el_utilities.make_binary_formula(sksi_smt.$const224$PhysicalFieldFn, ps, pf_string));
            if (sksi_smt.NIL != pf) {
                result = (SubLObject)ConsesLow.cons(pf, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pf_string = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 66964L)
    public static SubLObject sksi_physical_field_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_smt.$const52$PhysicalField);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67063L)
    public static SubLObject sksi_pf_get_ps(final SubLObject pf) {
        assert sksi_smt.NIL != sksi_physical_field_p(pf) : pf;
        return cycl_utilities.sentence_arg1(pf, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67170L)
    public static SubLObject sksi_pf_get_name(final SubLObject pf) {
        assert sksi_smt.NIL != sksi_physical_field_p(pf) : pf;
        return kb_mapping_utilities.fpred_value_in_any_mt(pf, sksi_smt.$const319$fieldName_SKS, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67303L)
    public static SubLObject sksi_pf_get_datatype(final SubLObject pf) {
        assert sksi_smt.NIL != sksi_physical_field_p(pf) : pf;
        return kb_mapping_utilities.fpred_value_in_any_mt(pf, sksi_smt.$const320$fieldDataType, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67440L)
    public static SubLObject sksi_pf_get_nullable(final SubLObject pf) {
        assert sksi_smt.NIL != sksi_physical_field_p(pf) : pf;
        final SubLObject ps = sksi_pf_get_ps(pf);
        final SubLObject not_nullable_pfs = kb_mapping_utilities.pred_values_in_any_mt(ps, sksi_smt.$const321$nonNullFields, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        if (sksi_smt.NIL == subl_promotions.memberP(pf, not_nullable_pfs, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED)) {
            return (SubLObject)sksi_smt.T;
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67696L)
    public static SubLObject sksi_pf_get_default_value(final SubLObject pf) {
        assert sksi_smt.NIL != sksi_physical_field_p(pf) : pf;
        final SubLObject ps = sksi_pf_get_ps(pf);
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_any_mt(sksi_smt.$const322$defaultFieldValue, ps, pf, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject default_value = (SubLObject)sksi_smt.NIL;
        if (sksi_smt.NIL != gaf) {
            default_value = cycl_utilities.sentence_arg3(gaf, (SubLObject)sksi_smt.UNPROVIDED);
        }
        return default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 67995L)
    public static SubLObject sksi_pf_get_key_type(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_smt.NIL != sksi_physical_field_p(pf) : pf;
        final SubLObject ps = sksi_pf_get_ps(pf);
        final SubLObject pf_name = sksi_pf_get_name(pf);
        final SubLObject pks = kb_mapping_utilities.pred_values_in_any_mt(ps, sksi_smt.$const323$primaryKey, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED).first();
        SubLObject current;
        final SubLObject datum = current = pks;
        SubLObject the_list = (SubLObject)sksi_smt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list324);
        the_list = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        if (sksi_smt.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !sksi_smt.$const204$TheList.eql(the_list)) {
            Errors.error((SubLObject)sksi_smt.$str325$Incapable_of_dealing_with_structu, pks);
        }
        final SubLObject key_names = Mapping.mapcar((SubLObject)sksi_smt.$sym326$SKSI_PF_GET_NAME, keys);
        if (sksi_smt.NIL != subl_promotions.memberP(pf_name, key_names, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED)) {
            return (SubLObject)sksi_smt.$kw327$PRIMARY;
        }
        return (SubLObject)sksi_smt.$kw328$NONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 68577L)
    public static SubLObject sksi_logical_schemabase_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, sksi_smt.$const329$SKSILogicalSchemaDescriptionMicro);
        return (SubLObject)sksi_smt.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 68854L)
    public static SubLObject new_logical_schemabase(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        final SubLObject lsb = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(Sequences.cconcatenate(string_utilities.post_remove(sksi_psb_get_name(psb), (SubLObject)sksi_smt.$str305$PhysicalSchemaMt, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.$str330$LogicalSchemaMt), (SubLObject)sksi_smt.UNPROVIDED));
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, lsb, sksi_smt.$const329$SKSILogicalSchemaDescriptionMicro), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const303$genlMt, lsb, sksi_smt.$const209$SKSIMt), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const307$sksLogicalSchemaDescriptionMt, sks, lsb), sksi_smt.$const121$UniversalVocabularyMt);
        return lsb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69470L)
    public static SubLObject sksi_lsb_get_mt(final SubLObject lsb) {
        assert sksi_smt.NIL != sksi_logical_schemabase_p(lsb) : lsb;
        return lsb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69569L)
    public static SubLObject sksi_logical_schema_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_smt.$const49$LogicalSchema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69668L)
    public static SubLObject new_logical_schema(final SubLObject sks, final SubLObject ps, SubLObject ls_name, SubLObject isas) {
        if (ls_name == sksi_smt.UNPROVIDED) {
            ls_name = (SubLObject)sksi_smt.NIL;
        }
        if (isas == sksi_smt.UNPROVIDED) {
            isas = (SubLObject)sksi_smt.NIL;
        }
        return new_or_recycled_logical_schema(sks, ps, ls_name, (SubLObject)sksi_smt.NIL, isas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 69804L)
    public static SubLObject new_or_recycled_logical_schema(final SubLObject sks, final SubLObject ps, SubLObject ls_name, SubLObject ls, SubLObject isas) {
        if (ls_name == sksi_smt.UNPROVIDED) {
            ls_name = (SubLObject)sksi_smt.NIL;
        }
        if (ls == sksi_smt.UNPROVIDED) {
            ls = (SubLObject)sksi_smt.NIL;
        }
        if (isas == sksi_smt.UNPROVIDED) {
            isas = (SubLObject)sksi_smt.NIL;
        }
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        if (sksi_smt.NIL != ps && !sksi_smt.assertionsDisabledInClass && sksi_smt.NIL == sksi_physical_schema_p(ps)) {
            throw new AssertionError(ps);
        }
        if (sksi_smt.NIL != constant_handles.constant_p(ls)) {
            final SubLObject name = constants_high.constant_name(ls);
            ke.ke_recreate_now(ls);
            ls = constants_high.find_constant(name);
        }
        else {
            if (!ls_name.isString()) {
                ls_name = ((sksi_smt.NIL != sksi_physical_schema_p(ps)) ? Sequences.cconcatenate(string_utilities.post_remove(sksi_ps_get_name(ps), (SubLObject)sksi_smt.$str200$_PS, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.$str202$_LS) : Sequences.cconcatenate(kb_paths.fort_name(sksi_sks_accessors.sks_get_term(sks)), new SubLObject[] { sksi_smt.$str332$_LS_, string_utilities.to_string(sksi_next_id()) }));
            }
            ls = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(ls_name, (SubLObject)sksi_smt.UNPROVIDED));
        }
        SubLObject lsb = sks_get_lsb(sks);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, ls, sksi_smt.$const333$ObjectDefiningSchema), sksi_smt.$const121$UniversalVocabularyMt);
        SubLObject lsb_mt = (SubLObject)sksi_smt.NIL;
        if (sksi_smt.NIL == lsb) {
            lsb = new_logical_schemabase(sks);
        }
        lsb_mt = sksi_lsb_get_mt(lsb);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, ls, sksi_smt.$const49$LogicalSchema), lsb_mt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const334$definingMt, ls, lsb_mt), sksi_smt.$const214$BaseKB);
        if (sksi_smt.NIL != isas) {
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = (SubLObject)sksi_smt.NIL;
            v_isa = cdolist_list_var.first();
            while (sksi_smt.NIL != cdolist_list_var) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const335$schemaIsa, ls, v_isa), lsb);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            }
        }
        if (sksi_smt.NIL != ps) {
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const167$logicalPhysicalSchemaMap, ls, ps), sks_get_source_description_mt(sks));
        }
        return ls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71219L)
    public static SubLObject sksi_ls_get_name(final SubLObject ls) {
        assert sksi_smt.NIL != sksi_logical_schema_p(ls) : ls;
        return constants_high.constant_name(ls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71328L)
    public static SubLObject sksi_ls_get_lfs(final SubLObject ls) {
        assert sksi_smt.NIL != sksi_logical_schema_p(ls) : ls;
        return kb_mapping_utilities.pred_values_in_any_mt(ls, sksi_smt.$const337$logicalFields, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71462L)
    public static SubLObject sksi_ls_get_mss(final SubLObject ls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_smt.NIL != sksi_logical_schema_p(ls) : ls;
        SubLObject result = (SubLObject)sksi_smt.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym338$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_smt.$const339$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_value_gafs(ls, sksi_smt.$const205$meaningSentenceOfSchema, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71665L)
    public static SubLObject sksi_ls_get_ps(final SubLObject ls) {
        assert sksi_smt.NIL != sksi_logical_schema_p(ls) : ls;
        return kb_mapping_utilities.pred_values_in_any_mt(ls, sksi_smt.$const167$logicalPhysicalSchemaMap, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71807L)
    public static SubLObject sksi_logical_field_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, sksi_smt.$const55$LogicalField);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 71969L)
    public static SubLObject sksi_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next(sksi_smt.$sksi_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 72058L)
    public static SubLObject new_logical_field(final SubLObject sks, final SubLObject ls) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != sksi_logical_schema_p(ls) : ls;
        final SubLObject sks_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject lf = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(Sequences.cconcatenate(kb_paths.fort_name(sksi_sks_accessors.sks_get_term(sks)), new SubLObject[] { sksi_smt.$str201$_, sksi_ls_get_name(ls), sksi_smt.$str341$_LF_, string_utilities.to_string(sksi_next_id()) }), (SubLObject)sksi_smt.UNPROVIDED));
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const342$quotedIsa, lf, sksi_smt.$const343$IndexicalConcept), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, lf, sksi_smt.$const55$LogicalField), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const337$logicalFields, ls, lf), sks_mt);
        return lf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 72769L)
    public static SubLObject sksi_lf_convert_to_constant(final SubLObject sks, final SubLObject ls, final SubLObject lf) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != sksi_logical_schema_p(ls) : ls;
        assert sksi_smt.NIL != sksi_logical_field_p(lf) : lf;
        if (sksi_smt.NIL == nart_handles.nart_p(lf)) {
            return lf;
        }
        final SubLObject lf_el_formula = narts_high.nart_el_formula(lf);
        final SubLObject new_lf = new_logical_field(sks, ls);
        final SubLObject sks_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject lsb_mt = sks_get_logical_schemabase_mt(sks);
        final SubLObject tsb_mt = sks_get_translation_schemabase_mt(sks);
        if (sksi_smt.NIL != kb_mapping_macros.do_mt_index_key_validator(lsb_mt, (SubLObject)sksi_smt.NIL)) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(lsb_mt);
            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                SubLObject done_var = (SubLObject)sksi_smt.NIL;
                final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                while (sksi_smt.NIL == done_var) {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                    if (sksi_smt.NIL != valid) {
                        final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                        if (sksi_smt.NIL != subl_promotions.memberP(lf_el_formula, assertion_el_formula, (SubLObject)sksi_smt.EQUAL, (SubLObject)sksi_smt.UNPROVIDED)) {
                            sksi_kb_accessors.sksi_unassert_assertion(assertion);
                            sksi_kb_accessors.sksi_assert(list_utilities.tree_substitute(assertion_el_formula, lf_el_formula, new_lf), assertion_mt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_smt.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_smt.NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        if (!lsb_mt.eql(tsb_mt) && sksi_smt.NIL != kb_mapping_macros.do_mt_index_key_validator(tsb_mt, (SubLObject)sksi_smt.NIL)) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(tsb_mt);
            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                SubLObject done_var = (SubLObject)sksi_smt.NIL;
                final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                while (sksi_smt.NIL == done_var) {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                    if (sksi_smt.NIL != valid) {
                        final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                        if (sksi_smt.NIL != subl_promotions.memberP(lf_el_formula, assertion_el_formula, (SubLObject)sksi_smt.EQUAL, (SubLObject)sksi_smt.UNPROVIDED)) {
                            sksi_kb_accessors.sksi_unassert_assertion(assertion);
                            sksi_kb_accessors.sksi_assert(list_utilities.tree_substitute(assertion_el_formula, lf_el_formula, new_lf), assertion_mt, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_smt.T);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (sksi_smt.NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
        }
        sksi_kb_accessors.sksi_unassert(el_utilities.make_binary_formula(sksi_smt.$const337$logicalFields, ls, lf), sks_mt);
        return new_lf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74056L)
    public static SubLObject sksi_lf_get_genls(final SubLObject lf) {
        assert sksi_smt.NIL != sksi_logical_field_p(lf) : lf;
        return kb_mapping_utilities.pred_values_in_any_mt(lf, sksi_smt.$const345$fieldGenls, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74186L)
    public static SubLObject sksi_lf_get_isas(final SubLObject lf) {
        assert sksi_smt.NIL != sksi_logical_field_p(lf) : lf;
        return kb_mapping_utilities.pred_values_in_any_mt(lf, sksi_smt.$const267$fieldIsa, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74313L)
    public static SubLObject sksi_lf_get_cycl(final SubLObject lf) {
        assert sksi_smt.NIL != sksi_logical_field_p(lf) : lf;
        return lf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74405L)
    public static SubLObject sksi_meaning_sentence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL != assertion_handles.assertion_p(v_object) && cycl_utilities.sentence_arg0(v_object).eql(sksi_smt.$const205$meaningSentenceOfSchema) && sksi_smt.NIL != sksi_logical_schema_p(cycl_utilities.sentence_arg1(v_object, (SubLObject)sksi_smt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74607L)
    public static SubLObject sksi_ms_get_cycl(final SubLObject ms) {
        assert sksi_smt.NIL != sksi_meaning_sentence_p(ms) : ms;
        return cycl_utilities.sentence_arg2(ms, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74770L)
    public static SubLObject sksi_ms_get_asserted(final SubLObject ms) {
        return assertions_high.asserted_assertionP(ms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 74849L)
    public static SubLObject sksi_translation_schemabase_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, sksi_smt.$const347$SKSISchemaTranslationMicrotheory);
        return (SubLObject)sksi_smt.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 75116L)
    public static SubLObject new_translation_schemabase(final SubLObject sks, final SubLObject psb, final SubLObject lsb) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_smt.NIL != sksi_physical_schemabase_p(psb) : psb;
        assert sksi_smt.NIL != sksi_logical_schemabase_p(lsb) : lsb;
        final SubLObject tsb = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(Sequences.cconcatenate(string_utilities.post_remove(sksi_psb_get_name(psb), (SubLObject)sksi_smt.$str305$PhysicalSchemaMt, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.$str348$TranslationSchemaMt), (SubLObject)sksi_smt.UNPROVIDED));
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, tsb, sksi_smt.$const347$SKSISchemaTranslationMicrotheory), sksi_smt.$const121$UniversalVocabularyMt);
        final SubLObject psb_mt = sksi_psb_get_mt(psb);
        final SubLObject lsb_mt = sksi_lsb_get_mt(lsb);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const303$genlMt, tsb, psb_mt), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const303$genlMt, tsb, lsb_mt), sksi_smt.$const121$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const308$sksSchemaTranslationMt, sks, tsb), sksi_smt.$const121$UniversalVocabularyMt);
        return tsb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 75954L)
    public static SubLObject sksi_tsb_get_mt(final SubLObject tsb) {
        assert sksi_smt.NIL != sksi_translation_schemabase_p(tsb) : tsb;
        return tsb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 76057L)
    public static SubLObject decode_physical_structure_of_sks(final SubLObject sks) {
        if (sksi_smt.NIL == sks_get_psb(sks)) {
            final SubLObject psb = sks_new_psb(sks);
            sksi_sks_structure_importer_utilities.sks_physical_structure_decode(sks);
        }
        return sks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 76417L)
    public static SubLObject new_structured_knowledge_source(final SubLObject sks_name) {
        final SubLObject sks = sksi_sks_accessors.new_sks_complex(sks_name, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject sd = hlmt_czer.canonicalize_hlmt(sks_new_sd(sks));
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const309$contentMt, sks, el_utilities.make_unary_formula(sksi_smt.$const352$ContentMtFn, sks)), sksi_smt.$const214$BaseKB);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const142$sksIsa, sks, sksi_smt.$const353$Database_Physical), sd);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const310$bridgingMtForKS, sks, el_utilities.make_unary_formula(sksi_smt.$const354$BridgingMtForKSFn, sks)), sksi_smt.$const355$SKSIVocabularyMt);
        return sks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 77201L)
    public static SubLObject new_conceptual_mapping_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject pf, final SubLObject isas) {
        final SubLObject schema_name = string_utilities.post_remove(kb_paths.fort_name(ps), (SubLObject)sksi_smt.$str200$_PS, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject colname = sksi_smt_column_or_fort_name(pf);
        final SubLObject fullname = Sequences.cconcatenate(schema_name, new SubLObject[] { sksi_smt.$str201$_, colname, sksi_smt.$str357$_CMLS });
        SubLObject cmls = constants_high.find_constant(fullname);
        if (sksi_smt.NIL != forts.fort_p(cmls)) {
            ke.ke_recreate_now(cmls);
            cmls = constants_high.find_constant(fullname);
        }
        else {
            cmls = ke.ke_create_now(fullname, (SubLObject)sksi_smt.UNPROVIDED);
        }
        sksi_kb_accessors.sksi_assert_if_new((SubLObject)ConsesLow.listS(sksi_smt.$const211$isa, cmls, (SubLObject)sksi_smt.$list358), sksi_smt.$const121$UniversalVocabularyMt);
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = (SubLObject)sksi_smt.NIL;
        v_isa = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_assert_if_new((SubLObject)ConsesLow.list(sksi_smt.$const335$schemaIsa, cmls, v_isa), mapping_mt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return cmls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 78128L)
    public static SubLObject sksi_smt_get_available_database_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)sksi_smt.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym338$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_smt.$const339$EverythingPSC, thread);
            results = Sequences.remove_if((SubLObject)sksi_smt.$sym360$HL_PROTOTYPICAL_INSTANCE_, isa.all_instances(sksi_smt.$const144$SKSISupportedDatabaseServerProgra, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 78478L)
    public static SubLObject sks_initialize_all_sks_description_mts() {
        SubLObject cdolist_list_var = sksi_sks_accessors.get_all_skss();
        SubLObject sks = (SubLObject)sksi_smt.NIL;
        sks = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            sks_initialize_description_mts(sks);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 78710L)
    public static SubLObject sks_initialize_description_mts(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        if (sksi_smt.NIL == sks_get_source_description_mt(sks)) {
            final SubLObject sd = sks_guess_sd(sks);
            if (sksi_smt.NIL != sd) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, sd, sksi_smt.$const302$SKSISourceDescriptionMicrotheory), sksi_smt.$const121$UniversalVocabularyMt);
                sks_set_source_description_mt(sks, sd);
            }
        }
        if (sksi_smt.NIL == sks_get_physical_schemabase_mt(sks)) {
            final SubLObject psb = sks_guess_psb(sks);
            if (sksi_smt.NIL != psb) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, psb, sksi_smt.$const306$SKSIPhysicalSchemaDescriptionMicr), sksi_smt.$const121$UniversalVocabularyMt);
                sks_set_physical_schemabase_mt(sks, psb);
            }
        }
        if (sksi_smt.NIL == sks_get_logical_schemabase_mt(sks)) {
            final SubLObject lsb = sks_guess_lsb(sks);
            if (sksi_smt.NIL != lsb) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, lsb, sksi_smt.$const329$SKSILogicalSchemaDescriptionMicro), sksi_smt.$const121$UniversalVocabularyMt);
                sks_set_logical_schemabase_mt(sks, lsb);
            }
        }
        if (sksi_smt.NIL == sks_get_translation_schemabase_mt(sks)) {
            final SubLObject tsb = sks_guess_tsb(sks);
            if (sksi_smt.NIL != tsb) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_smt.$const211$isa, tsb, sksi_smt.$const347$SKSISchemaTranslationMicrotheory), sksi_smt.$const121$UniversalVocabularyMt);
                sks_set_translation_schemabase_mt(sks, tsb);
            }
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 79860L)
    public static SubLObject get_all_sds() {
        return isa.all_fort_instances(sksi_smt.$const361$SKSISchemaDescriptionMicrotheory, sksi_smt.$const121$UniversalVocabularyMt, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 79983L)
    public static SubLObject get_all_psbs() {
        return isa.all_fort_instances(sksi_smt.$const306$SKSIPhysicalSchemaDescriptionMicr, sksi_smt.$const121$UniversalVocabularyMt, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80113L)
    public static SubLObject get_all_lsbs() {
        return isa.all_fort_instances(sksi_smt.$const329$SKSILogicalSchemaDescriptionMicro, sksi_smt.$const121$UniversalVocabularyMt, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80242L)
    public static SubLObject get_all_tsbs() {
        return isa.all_fort_instances(sksi_smt.$const347$SKSISchemaTranslationMicrotheory, sksi_smt.$const121$UniversalVocabularyMt, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80364L)
    public static SubLObject sksi_form(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_utilities.$cb_default_fort_handler$.currentBinding(thread);
        try {
            cb_utilities.$cb_default_fort_handler$.bind((SubLObject)sksi_smt.$str16$sksi_smt, thread);
            cb_utilities.cb_form(v_object, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            cb_utilities.$cb_default_fort_handler$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80559L)
    public static SubLObject sksi_arghash_form(final SubLObject arghash, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_utilities.$cb_default_fort_handler$.currentBinding(thread);
        try {
            cb_utilities.$cb_default_fort_handler$.bind(html_arghash.html_arghash_href(arghash, (SubLObject)sksi_smt.$str16$sksi_smt), thread);
            cb_utilities.cb_form(v_object, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            cb_utilities.$cb_default_fort_handler$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_smt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 80727L)
    public static SubLObject amt_mts(final SubLObject term_list, SubLObject include_meta_assertionsP) {
        if (include_meta_assertionsP == sksi_smt.UNPROVIDED) {
            include_meta_assertionsP = (SubLObject)sksi_smt.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_smt.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym338$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_smt.$const339$EverythingPSC, thread);
            final SubLObject assertions = virtual_indexing.assertions_mentioning_terms(term_list, include_meta_assertionsP);
            SubLObject mts = (SubLObject)sksi_smt.NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)sksi_smt.NIL;
            assertion = cdolist_list_var.first();
            while (sksi_smt.NIL != cdolist_list_var) {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (sksi_smt.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                    mts = (SubLObject)ConsesLow.cons(item_var, mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            result = Sort.sort(mts, (SubLObject)sksi_smt.$sym362$GENERALITY_ESTIMATE_, (SubLObject)sksi_smt.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 81089L)
    public static SubLObject sks_guess_sd(final SubLObject sks) {
        assert sksi_smt.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return amt_mts((SubLObject)ConsesLow.list(sks, sksi_smt.$const142$sksIsa), (SubLObject)sksi_smt.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 81197L)
    public static SubLObject sks_guess_psb(final SubLObject sks) {
        final SubLObject sub_skss = sksi_sks_accessors.sks_get(sks, sksi_smt.$const363$subKS_Direct, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject mt_list = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = sub_skss;
        SubLObject sub_sks = (SubLObject)sksi_smt.NIL;
        sub_sks = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            final SubLObject poss_ps = sksi_sks_accessors.sks_fget(sub_sks, sksi_smt.$const364$physicalSchemaSourceMap, (SubLObject)sksi_smt.UNPROVIDED);
            if (sksi_smt.NIL != poss_ps) {
                mt_list = (SubLObject)ConsesLow.cons(amt_mts((SubLObject)ConsesLow.list(sksi_smt.$const365$physicalFields, poss_ps), (SubLObject)sksi_smt.UNPROVIDED), mt_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        }
        return list_utilities.hash_remove_duplicates(Functions.apply((SubLObject)sksi_smt.$sym366$APPEND, mt_list), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 81544L)
    public static SubLObject sks_guess_lsb(final SubLObject sks) {
        final SubLObject sub_skss = sksi_sks_accessors.sks_get(sks, sksi_smt.$const363$subKS_Direct, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject mt_list = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = sub_skss;
        SubLObject sub_sks = (SubLObject)sksi_smt.NIL;
        sub_sks = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            final SubLObject poss_ps = sksi_sks_accessors.sks_fget(sub_sks, sksi_smt.$const364$physicalSchemaSourceMap, (SubLObject)sksi_smt.UNPROVIDED);
            if (sksi_smt.NIL != poss_ps) {
                final SubLObject poss_ls = kb_mapping_utilities.fpred_value_in_any_mt(poss_ps, sksi_smt.$const167$logicalPhysicalSchemaMap, (SubLObject)sksi_smt.TWO_INTEGER, (SubLObject)sksi_smt.ONE_INTEGER, (SubLObject)sksi_smt.UNPROVIDED);
                if (sksi_smt.NIL != poss_ls) {
                    mt_list = (SubLObject)ConsesLow.cons(amt_mts((SubLObject)ConsesLow.list(sksi_smt.$const337$logicalFields, poss_ls), (SubLObject)sksi_smt.UNPROVIDED), mt_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        }
        return list_utilities.hash_remove_duplicates(Functions.apply((SubLObject)sksi_smt.$sym366$APPEND, mt_list), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 82000L)
    public static SubLObject sks_guess_tsb(final SubLObject sks) {
        final SubLObject sub_skss = sksi_sks_accessors.sks_get(sks, sksi_smt.$const363$subKS_Direct, (SubLObject)sksi_smt.UNPROVIDED);
        SubLObject mt_list = (SubLObject)sksi_smt.NIL;
        SubLObject cdolist_list_var = sub_skss;
        SubLObject sub_sks = (SubLObject)sksi_smt.NIL;
        sub_sks = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            final SubLObject poss_ps = sksi_sks_accessors.sks_fget(sub_sks, sksi_smt.$const364$physicalSchemaSourceMap, (SubLObject)sksi_smt.UNPROVIDED);
            if (sksi_smt.NIL != poss_ps) {
                final SubLObject poss_ls = kb_mapping_utilities.fpred_value_in_any_mt(poss_ps, sksi_smt.$const167$logicalPhysicalSchemaMap, (SubLObject)sksi_smt.TWO_INTEGER, (SubLObject)sksi_smt.ONE_INTEGER, (SubLObject)sksi_smt.UNPROVIDED);
                if (sksi_smt.NIL != poss_ls) {
                    mt_list = (SubLObject)ConsesLow.cons(amt_mts((SubLObject)ConsesLow.list(poss_ps, poss_ls), (SubLObject)sksi_smt.UNPROVIDED), mt_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        }
        return list_utilities.hash_remove_duplicates(Functions.apply((SubLObject)sksi_smt.$sym366$APPEND, mt_list), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 82448L)
    public static SubLObject sksi_psb_get_schemata(final SubLObject psb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject physical_schemata = (SubLObject)sksi_smt.NIL;
        final SubLObject relation = sksi_smt.$const367$enumerableSchema;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym368$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(psb, thread);
            final SubLObject pred_var = relation;
            if (sksi_smt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_smt.NIL;
                final SubLObject _prev_bind_0_$129 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$130 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_smt.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_smt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_smt.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_smt.NIL;
                    final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                    while (sksi_smt.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_smt.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.$kw369$GAF, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                                SubLObject done_var_$131 = (SubLObject)sksi_smt.NIL;
                                final SubLObject token_var_$132 = (SubLObject)sksi_smt.NIL;
                                while (sksi_smt.NIL == done_var_$131) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$132);
                                    final SubLObject valid_$133 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$132.eql(assertion));
                                    if (sksi_smt.NIL != valid_$133) {
                                        final SubLObject pcase_var = assertions_high.assertion_truth(assertion);
                                        if (pcase_var.eql((SubLObject)sksi_smt.$kw370$TRUE)) {
                                            physical_schemata = (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg1(assertion, (SubLObject)sksi_smt.UNPROVIDED), physical_schemata);
                                        }
                                        else if (pcase_var.eql((SubLObject)sksi_smt.$kw371$FALSE)) {
                                            physical_schemata = (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(assertion, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.UNPROVIDED), physical_schemata);
                                        }
                                    }
                                    done_var_$131 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid_$133);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_smt.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_smt.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$130, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$129, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.hash_remove_duplicates(physical_schemata, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 82935L)
    public static SubLObject sksi_psb_get_labeled_schemata(final SubLObject psb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)sksi_smt.NIL;
        if (sksi_smt.NIL != forts.fort_p(psb)) {
            SubLObject cdolist_list_var;
            final SubLObject physical_schemata = cdolist_list_var = sksi_psb_get_schemata(psb);
            SubLObject physical_schema = (SubLObject)sksi_smt.NIL;
            physical_schema = cdolist_list_var.first();
            while (sksi_smt.NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym368$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(psb, thread);
                    final SubLObject table_name = kb_mapping_utilities.fpred_value(physical_schema, sksi_smt.$const373$schemaName_SKS, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                    final SubLObject schema_name = kb_mapping_utilities.fpred_value(physical_schema, sksi_smt.$const374$schemaNameSchema_SKS, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                    results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(schema_name, table_name, physical_schema), results);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                physical_schema = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 83453L)
    public static SubLObject sksi_lsb_get_schemata(final SubLObject lsb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_schemata = (SubLObject)sksi_smt.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym368$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(lsb, thread);
            final SubLObject pred_var = sksi_smt.$const337$logicalFields;
            if (sksi_smt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_smt.NIL;
                final SubLObject _prev_bind_0_$135 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$136 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_smt.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_smt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_smt.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_smt.NIL;
                    final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                    while (sksi_smt.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_smt.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.$kw369$GAF, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                                SubLObject done_var_$137 = (SubLObject)sksi_smt.NIL;
                                final SubLObject token_var_$138 = (SubLObject)sksi_smt.NIL;
                                while (sksi_smt.NIL == done_var_$137) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$138);
                                    final SubLObject valid_$139 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$138.eql(assertion));
                                    if (sksi_smt.NIL != valid_$139) {
                                        logical_schemata = (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg1(assertion, (SubLObject)sksi_smt.UNPROVIDED), logical_schemata);
                                    }
                                    done_var_$137 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid_$139);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$136 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_smt.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_smt.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$136, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$136, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$135, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.hash_remove_duplicates(logical_schemata, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 83717L)
    public static SubLObject sksi_tsb_get_translation_pairs(final SubLObject tsb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translation_pairs = (SubLObject)sksi_smt.NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(sksi_tsb_get_lss_for_pss(tsb));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)sksi_smt.NIL; sksi_smt.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_smt.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject ps = (SubLObject)sksi_smt.NIL;
                SubLObject lss = (SubLObject)sksi_smt.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list375);
                ps = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list375);
                lss = current.first();
                current = current.rest();
                if (sksi_smt.NIL == current) {
                    SubLObject cdolist_list_var = lss;
                    SubLObject ls = (SubLObject)sksi_smt.NIL;
                    ls = cdolist_list_var.first();
                    while (sksi_smt.NIL != cdolist_list_var) {
                        translation_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ps, ls), translation_pairs);
                        cdolist_list_var = cdolist_list_var.rest();
                        ls = cdolist_list_var.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list375);
                }
            }
        }
        translation_pairs = Sort.sort(translation_pairs, (SubLObject)sksi_smt.$sym376$FORT_NAME_, (SubLObject)sksi_smt.$sym289$FIRST);
        return translation_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 84029L)
    public static SubLObject sksi_tsb_get_lss_for_pss(final SubLObject tsb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mappings = dictionary.new_dictionary((SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym368$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(tsb, thread);
            final SubLObject pred_var = sksi_smt.$const167$logicalPhysicalSchemaMap;
            if (sksi_smt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_smt.NIL;
                final SubLObject _prev_bind_0_$141 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$142 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_smt.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_smt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_smt.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_smt.NIL;
                    final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                    while (sksi_smt.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_smt.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.$kw369$GAF, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                                SubLObject done_var_$143 = (SubLObject)sksi_smt.NIL;
                                final SubLObject token_var_$144 = (SubLObject)sksi_smt.NIL;
                                while (sksi_smt.NIL == done_var_$143) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$144);
                                    final SubLObject valid_$145 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$144.eql(assertion));
                                    if (sksi_smt.NIL != valid_$145) {
                                        final SubLObject ls = cycl_utilities.sentence_arg1(assertion, (SubLObject)sksi_smt.UNPROVIDED);
                                        final SubLObject ps = cycl_utilities.sentence_arg2(assertion, (SubLObject)sksi_smt.UNPROVIDED);
                                        map_utilities.map_pushnew(mappings, ps, ls, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED);
                                    }
                                    done_var_$143 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid_$145);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$142 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_smt.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_smt.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$142, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$141, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject iterator = map_utilities.new_map_iterator(mappings);
        SubLObject valid2;
        for (SubLObject done_var2 = (SubLObject)sksi_smt.NIL; sksi_smt.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid2)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_smt.NIL != valid2) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject ps2 = (SubLObject)sksi_smt.NIL;
                SubLObject lss = (SubLObject)sksi_smt.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list375);
                ps2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt.$list375);
                lss = current.first();
                current = current.rest();
                if (sksi_smt.NIL == current) {
                    lss = Sort.sort(lss, (SubLObject)sksi_smt.$sym376$FORT_NAME_, (SubLObject)sksi_smt.UNPROVIDED);
                    map_utilities.map_put(mappings, ps2, lss);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt.$list375);
                }
            }
        }
        return mappings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt.lisp", position = 84585L)
    public static SubLObject sksi_sks_get_translations(final SubLObject sks, final SubLObject ps, final SubLObject ls, SubLObject tsb) {
        if (tsb == sksi_smt.UNPROVIDED) {
            tsb = (SubLObject)sksi_smt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translation_pairs = (SubLObject)sksi_smt.NIL;
        SubLObject encodings = (SubLObject)sksi_smt.NIL;
        SubLObject encodings_matched = (SubLObject)sksi_smt.NIL;
        SubLObject decodings = (SubLObject)sksi_smt.NIL;
        SubLObject decodings_matched = (SubLObject)sksi_smt.NIL;
        if (sksi_smt.NIL == tsb) {
            tsb = sks_get_tsb(sks);
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_smt.$sym368$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(tsb, thread);
            SubLObject pred_var = sksi_smt.$const207$fieldEncoding;
            if (sksi_smt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_smt.NIL;
                final SubLObject _prev_bind_0_$147 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$148 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_smt.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_smt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_smt.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_smt.NIL;
                    final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                    while (sksi_smt.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_smt.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.$kw369$GAF, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                                SubLObject done_var_$149 = (SubLObject)sksi_smt.NIL;
                                final SubLObject token_var_$150 = (SubLObject)sksi_smt.NIL;
                                while (sksi_smt.NIL == done_var_$149) {
                                    final SubLObject encoding = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$150);
                                    final SubLObject valid_$151 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$150.eql(encoding));
                                    if (sksi_smt.NIL != valid_$151 && cycl_utilities.sentence_arg3(encoding, (SubLObject)sksi_smt.UNPROVIDED).eql(ls) && cycl_utilities.sentence_arg1(encoding, (SubLObject)sksi_smt.UNPROVIDED).eql(ps)) {
                                        final SubLObject item_var = encoding;
                                        if (sksi_smt.NIL == conses_high.member(item_var, encodings, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                                            encodings = (SubLObject)ConsesLow.cons(item_var, encodings);
                                        }
                                    }
                                    done_var_$149 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid_$151);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_smt.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_smt.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$148, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$147, thread);
                }
            }
            pred_var = sksi_smt.$const176$fieldDecoding;
            if (sksi_smt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_smt.NIL;
                final SubLObject _prev_bind_0_$149 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$149 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_smt.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_smt.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_smt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_smt.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_smt.NIL;
                    final SubLObject token_var = (SubLObject)sksi_smt.NIL;
                    while (sksi_smt.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_smt.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_smt.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_smt.$kw369$GAF, (SubLObject)sksi_smt.NIL, (SubLObject)sksi_smt.NIL);
                                SubLObject done_var_$150 = (SubLObject)sksi_smt.NIL;
                                final SubLObject token_var_$151 = (SubLObject)sksi_smt.NIL;
                                while (sksi_smt.NIL == done_var_$150) {
                                    final SubLObject decoding = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$151);
                                    final SubLObject valid_$152 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$151.eql(decoding));
                                    if (sksi_smt.NIL != valid_$152 && cycl_utilities.sentence_arg3(decoding, (SubLObject)sksi_smt.UNPROVIDED).eql(ps) && cycl_utilities.sentence_arg1(decoding, (SubLObject)sksi_smt.UNPROVIDED).eql(ls)) {
                                        final SubLObject item_var = decoding;
                                        if (sksi_smt.NIL == conses_high.member(item_var, decodings, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                                            decodings = (SubLObject)ConsesLow.cons(item_var, decodings);
                                        }
                                    }
                                    done_var_$150 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid_$152);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_smt.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_smt.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_smt.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$149, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$149, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = encodings;
        SubLObject encoding2 = (SubLObject)sksi_smt.NIL;
        encoding2 = cdolist_list_var.first();
        while (sksi_smt.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$159 = decodings;
            SubLObject decoding2 = (SubLObject)sksi_smt.NIL;
            decoding2 = cdolist_list_var_$159.first();
            while (sksi_smt.NIL != cdolist_list_var_$159) {
                final SubLObject physical_field = cycl_utilities.sentence_arg2(encoding2, (SubLObject)sksi_smt.UNPROVIDED);
                final SubLObject logical_field = cycl_utilities.sentence_arg2(decoding2, (SubLObject)sksi_smt.UNPROVIDED);
                if (sksi_smt.NIL != list_utilities.tree_find(physical_field, cycl_utilities.sentence_arg4(decoding2, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED) || sksi_smt.NIL != list_utilities.tree_find(logical_field, cycl_utilities.sentence_arg4(encoding2, (SubLObject)sksi_smt.UNPROVIDED), (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED)) {
                    SubLObject item_var2 = encoding2;
                    if (sksi_smt.NIL == conses_high.member(item_var2, encodings_matched, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                        encodings_matched = (SubLObject)ConsesLow.cons(item_var2, encodings_matched);
                    }
                    item_var2 = decoding2;
                    if (sksi_smt.NIL == conses_high.member(item_var2, decodings_matched, Symbols.symbol_function((SubLObject)sksi_smt.EQL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                        decodings_matched = (SubLObject)ConsesLow.cons(item_var2, decodings_matched);
                    }
                    item_var2 = (SubLObject)ConsesLow.list(encoding2, decoding2);
                    if (sksi_smt.NIL == conses_high.member(item_var2, translation_pairs, Symbols.symbol_function((SubLObject)sksi_smt.EQUAL), Symbols.symbol_function((SubLObject)sksi_smt.IDENTITY))) {
                        translation_pairs = (SubLObject)ConsesLow.cons(item_var2, translation_pairs);
                    }
                }
                cdolist_list_var_$159 = cdolist_list_var_$159.rest();
                decoding2 = cdolist_list_var_$159.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            encoding2 = cdolist_list_var.first();
        }
        return Values.values(translation_pairs, conses_high.set_difference(encodings, encodings_matched, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED), conses_high.set_difference(decodings, decodings_matched, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED));
    }
    
    public static SubLObject declare_sksi_smt_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "cb_link_edit_in_smt", "CB-LINK-EDIT-IN-SMT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "smt_edit_button", "SMT-EDIT-BUTTON", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "cb_link_smt", "CB-LINK-SMT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt", "SKSI-SMT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_int", "SKSI-SMT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_main_page", "SKSI-SMT-MAIN-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_main_actions", "SKSI-SMT-MAIN-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_sks_page", "SKSI-SMT-EDIT-SKS-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_sks_page_main_table", "SKSI-SMT-EDIT-SKS-PAGE-MAIN-TABLE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_sks_actions", "SKSI-SMT-EDIT-SKS-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_html_sks_status_line", "SKSI-SMT-HTML-SKS-STATUS-LINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_sd_page", "SKSI-SMT-EDIT-SD-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_sd_actions", "SKSI-SMT-EDIT-SD-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_update_source_description", "SKSI-SMT-UPDATE-SOURCE-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_compile_source_description", "SKSI-SMT-COMPILE-SOURCE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "clear_sksi_smt_compile_param_definitions", "CLEAR-SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "remove_sksi_smt_compile_param_definitions", "REMOVE-SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_compile_param_definitions_internal", "SKSI-SMT-COMPILE-PARAM-DEFINITIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_compile_param_definitions", "SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_register_structured_knowledge_source", "SKSI-SMT-REGISTER-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_structured_knowledge_source_registeredP", "SKSI-SMT-STRUCTURED-KNOWLEDGE-SOURCE-REGISTERED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ps_compile_pfs_info", "SKSI-PS-COMPILE-PFS-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ps_page", "SKSI-SMT-EDIT-PS-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ps_actions", "SKSI-SMT-EDIT-PS-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_logical_field_values_for_logical_schema", "SKSI-SMT-LOGICAL-FIELD-VALUES-FOR-LOGICAL-SCHEMA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_fetch_simple_logical_schemata", "SKSI-SMT-FETCH-SIMPLE-LOGICAL-SCHEMATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_retrieve_simple_logical_schemata", "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_retrieve_simple_logical_schema", "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_unpack_decoding_conversion_expression", "SKSI-SMT-UNPACK-DECODING-CONVERSION-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "enable_sksi_smt_mode", "ENABLE-SKSI-SMT-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "disable_sksi_smt_mode", "DISABLE-SKSI-SMT-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "is_sksi_smt_mode_enabledP", "IS-SKSI-SMT-MODE-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "get_sksi_smt_mode", "GET-SKSI-SMT-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_get_units_of_measurement", "SKSI-SMT-GET-UNITS-OF-MEASUREMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_assemble_units_result", "SKSI-SMT-ASSEMBLE-UNITS-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_uninteresting_units_filter_fn", "SKSI-SMT-UNINTERESTING-UNITS-FILTER-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_get_rendering_tuples", "SKSI-SMT-GET-RENDERING-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_derive_simple_logical_schema", "SKSI-SMT-DERIVE-SIMPLE-LOGICAL-SCHEMA", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_derive_indirecting_relation", "SKSI-SMT-DERIVE-INDIRECTING-RELATION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_physical_field_value_indexical_for_pf", "SKSI-SMT-PHYSICAL-FIELD-VALUE-INDEXICAL-FOR-PF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_physical_field_for_pfi", "SKSI-SMT-PHYSICAL-FIELD-FOR-PFI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_determine_dependent_colname", "SKSI-SMT-DETERMINE-DEPENDENT-COLNAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_determine_lf_conversion", "SKSI-SMT-DETERMINE-LF-CONVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_determine_pf_conversion", "SKSI-SMT-DETERMINE-PF-CONVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "clear_sksi_smt_column_or_fort_name", "CLEAR-SKSI-SMT-COLUMN-OR-FORT-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "remove_sksi_smt_column_or_fort_name", "REMOVE-SKSI-SMT-COLUMN-OR-FORT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_column_or_fort_name_internal", "SKSI-SMT-COLUMN-OR-FORT-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_column_or_fort_name", "SKSI-SMT-COLUMN-OR-FORT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ls_page", "SKSI-SMT-EDIT-LS-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ls_actions", "SKSI-SMT-EDIT-LS-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_lf_page", "SKSI-SMT-EDIT-LF-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_lf_actions", "SKSI-SMT-EDIT-LF-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ts_page", "SKSI-SMT-EDIT-TS-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "html_sksi_show_translation", "HTML-SKSI-SHOW-TRANSLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ts_actions", "SKSI-SMT-EDIT-TS-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_t_page", "SKSI-SMT-EDIT-T-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_t_actions", "SKSI-SMT-EDIT-T-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ms_page", "SKSI-SMT-EDIT-MS-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_edit_ms_actions", "SKSI-SMT-EDIT-MS-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_decode_psb_page", "SKSI-SMT-DECODE-PSB-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_decode_psb_actions", "SKSI-SMT-DECODE-PSB-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_sd", "SKS-GET-SD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_source_description_mt", "SKS-GET-SOURCE-DESCRIPTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_new_sd", "SKS-NEW-SD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_psb", "SKS-GET-PSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_physical_schemabase_mt", "SKS-GET-PHYSICAL-SCHEMABASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_new_psb", "SKS-NEW-PSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_lsb", "SKS-GET-LSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_logical_schemabase_mt", "SKS-GET-LOGICAL-SCHEMABASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_tsb", "SKS-GET-TSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_translation_schemabase_mt", "SKS-GET-TRANSLATION-SCHEMABASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_bridging_or_content_mt", "SKS-GET-BRIDGING-OR-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_cmt", "SKS-GET-CMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_get_bmt", "SKS-GET-BMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_set_source_description_mt", "SKS-SET-SOURCE-DESCRIPTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_set_physical_schemabase_mt", "SKS-SET-PHYSICAL-SCHEMABASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_set_logical_schemabase_mt", "SKS-SET-LOGICAL-SCHEMABASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_set_translation_schemabase_mt", "SKS-SET-TRANSLATION-SCHEMABASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_check_isa_invariant", "SKSI-SMT-CHECK-ISA-INVARIANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_source_description_p", "SKSI-SOURCE-DESCRIPTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_sd_get_mt", "SKSI-SD-GET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_physical_schemabase_p", "SKSI-PHYSICAL-SCHEMABASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_psb_get_name", "SKSI-PSB-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_psb_get_mt", "SKSI-PSB-GET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_physical_schema_p", "SKSI-PHYSICAL-SCHEMA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ps_get_name", "SKSI-PS-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ps_get_pfs", "SKSI-PS-GET-PFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_physical_field_p", "SKSI-PHYSICAL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_pf_get_ps", "SKSI-PF-GET-PS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_pf_get_name", "SKSI-PF-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_pf_get_datatype", "SKSI-PF-GET-DATATYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_pf_get_nullable", "SKSI-PF-GET-NULLABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_pf_get_default_value", "SKSI-PF-GET-DEFAULT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_pf_get_key_type", "SKSI-PF-GET-KEY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_logical_schemabase_p", "SKSI-LOGICAL-SCHEMABASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_logical_schemabase", "NEW-LOGICAL-SCHEMABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_lsb_get_mt", "SKSI-LSB-GET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_logical_schema_p", "SKSI-LOGICAL-SCHEMA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_logical_schema", "NEW-LOGICAL-SCHEMA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_or_recycled_logical_schema", "NEW-OR-RECYCLED-LOGICAL-SCHEMA", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ls_get_name", "SKSI-LS-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ls_get_lfs", "SKSI-LS-GET-LFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ls_get_mss", "SKSI-LS-GET-MSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ls_get_ps", "SKSI-LS-GET-PS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_logical_field_p", "SKSI-LOGICAL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_next_id", "SKSI-NEXT-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_logical_field", "NEW-LOGICAL-FIELD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_lf_convert_to_constant", "SKSI-LF-CONVERT-TO-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_lf_get_genls", "SKSI-LF-GET-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_lf_get_isas", "SKSI-LF-GET-ISAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_lf_get_cycl", "SKSI-LF-GET-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_meaning_sentence_p", "SKSI-MEANING-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ms_get_cycl", "SKSI-MS-GET-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_ms_get_asserted", "SKSI-MS-GET-ASSERTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_translation_schemabase_p", "SKSI-TRANSLATION-SCHEMABASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_translation_schemabase", "NEW-TRANSLATION-SCHEMABASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_tsb_get_mt", "SKSI-TSB-GET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "decode_physical_structure_of_sks", "DECODE-PHYSICAL-STRUCTURE-OF-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_structured_knowledge_source", "NEW-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "new_conceptual_mapping_logical_schema", "NEW-CONCEPTUAL-MAPPING-LOGICAL-SCHEMA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_smt_get_available_database_types", "SKSI-SMT-GET-AVAILABLE-DATABASE-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_initialize_all_sks_description_mts", "SKS-INITIALIZE-ALL-SKS-DESCRIPTION-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_initialize_description_mts", "SKS-INITIALIZE-DESCRIPTION-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "get_all_sds", "GET-ALL-SDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "get_all_psbs", "GET-ALL-PSBS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "get_all_lsbs", "GET-ALL-LSBS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "get_all_tsbs", "GET-ALL-TSBS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_form", "SKSI-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_arghash_form", "SKSI-ARGHASH-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "amt_mts", "AMT-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_guess_sd", "SKS-GUESS-SD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_guess_psb", "SKS-GUESS-PSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_guess_lsb", "SKS-GUESS-LSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sks_guess_tsb", "SKS-GUESS-TSB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_psb_get_schemata", "SKSI-PSB-GET-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_psb_get_labeled_schemata", "SKSI-PSB-GET-LABELED-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_lsb_get_schemata", "SKSI-LSB-GET-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_tsb_get_translation_pairs", "SKSI-TSB-GET-TRANSLATION-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_tsb_get_lss_for_pss", "SKSI-TSB-GET-LSS-FOR-PSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt", "sksi_sks_get_translations", "SKSI-SKS-GET-TRANSLATIONS", 3, 1, false);
        return (SubLObject)sksi_smt.NIL;
    }
    
    public static SubLObject init_sksi_smt_file() {
        sksi_smt.$allow_smt_editing_links$ = SubLFiles.defparameter("*ALLOW-SMT-EDITING-LINKS*", (SubLObject)sksi_smt.NIL);
        sksi_smt.$sksi_smt_sd_parameters$ = SubLFiles.deflexical("*SKSI-SMT-SD-PARAMETERS*", (SubLObject)sksi_smt.$list122);
        sksi_smt.$sksi_smt_compile_param_definitions_caching_state$ = SubLFiles.deflexical("*SKSI-SMT-COMPILE-PARAM-DEFINITIONS-CACHING-STATE*", (SubLObject)sksi_smt.NIL);
        sksi_smt.$sksi_smt_mode$ = SubLFiles.deflexical("*SKSI-SMT-MODE*", (SubLObject)sksi_smt.$kw189$ENABLED);
        sksi_smt.$sksi_smt_column_or_fort_name_caching_state$ = SubLFiles.deflexical("*SKSI-SMT-COLUMN-OR-FORT-NAME-CACHING-STATE*", (SubLObject)sksi_smt.NIL);
        sksi_smt.$sksi_smt_warn_about_invariantsP$ = SubLFiles.defparameter("*SKSI-SMT-WARN-ABOUT-INVARIANTS?*", (SubLObject)sksi_smt.NIL);
        sksi_smt.$sksi_isg$ = SubLFiles.deflexical("*SKSI-ISG*", maybeDefault((SubLObject)sksi_smt.$sym340$_SKSI_ISG_, sksi_smt.$sksi_isg$, ()->(integer_sequence_generator.new_integer_sequence_generator((SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED, (SubLObject)sksi_smt.UNPROVIDED))));
        return (SubLObject)sksi_smt.NIL;
    }
    
    public static SubLObject setup_sksi_smt_file() {
        cb_utilities.setup_cb_link_method((SubLObject)sksi_smt.$kw8$EDIT_IN_SMT, (SubLObject)sksi_smt.$sym9$CB_LINK_EDIT_IN_SMT, (SubLObject)sksi_smt.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)sksi_smt.$kw17$SMT, (SubLObject)sksi_smt.$sym18$CB_LINK_SMT, (SubLObject)sksi_smt.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)sksi_smt.$kw17$SMT, (SubLObject)sksi_smt.$str19$SMT, (SubLObject)sksi_smt.$str19$SMT, (SubLObject)sksi_smt.$str20$Schema_Modeling_Tool);
        html_macros.note_cgi_handler_function((SubLObject)sksi_smt.$sym21$SKSI_SMT, (SubLObject)sksi_smt.$kw22$HTML_HANDLER);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym137$SKSI_SMT_UPDATE_SOURCE_DESCRIPTION);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym139$SKSI_SMT_COMPILE_SOURCE_DESCRIPTION);
        memoization_state.note_globally_cached_function((SubLObject)sksi_smt.$sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym147$SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym150$SKSI_PS_COMPILE_PFS_INFO);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym165$SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym168$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym169$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym190$ENABLE_SKSI_SMT_MODE);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym191$DISABLE_SKSI_SMT_MODE);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym193$IS_SKSI_SMT_MODE_ENABLED_);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym194$GET_SKSI_SMT_MODE);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym195$SKSI_SMT_GET_UNITS_OF_MEASUREMENT);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym199$SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA);
        memoization_state.note_globally_cached_function((SubLObject)sksi_smt.$sym230$SKSI_SMT_COLUMN_OR_FORT_NAME);
        utilities_macros.register_html_state_variable((SubLObject)sksi_smt.$sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_smt.$sym340$_SKSI_ISG_);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym350$DECODE_PHYSICAL_STRUCTURE_OF_SKS);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym351$NEW_STRUCTURED_KNOWLEDGE_SOURCE);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym356$NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym359$SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES);
        access_macros.register_external_symbol((SubLObject)sksi_smt.$sym372$SKSI_PSB_GET_LABELED_SCHEMATA);
        return (SubLObject)sksi_smt.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_smt_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_smt_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_smt_file();
    }
    
    static {
        me = (SubLFile)new sksi_smt();
        sksi_smt.$allow_smt_editing_links$ = null;
        sksi_smt.$sksi_smt_sd_parameters$ = null;
        sksi_smt.$sksi_smt_compile_param_definitions_caching_state$ = null;
        sksi_smt.$sksi_smt_mode$ = null;
        sksi_smt.$sksi_smt_column_or_fort_name_caching_state$ = null;
        sksi_smt.$sksi_smt_warn_about_invariantsP$ = null;
        sksi_smt.$sksi_isg$ = null;
        $str0$_Edit_in_SMT_ = SubLObjectFactory.makeString("[Edit in SMT]");
        $str1$http___ = SubLObjectFactory.makeString("http://");
        $str2$_ = SubLObjectFactory.makeString(":");
        $str3$_SchemaModelingTool__sksName_ = SubLObjectFactory.makeString("/SchemaModelingTool/?sksName=");
        $str4$_cyc_server_ = SubLObjectFactory.makeString("&cyc.server=");
        $str5$_cyc_defaultCyclist_ = SubLObjectFactory.makeString("&cyc.defaultCyclist=");
        $str6$Will_open_in_new_browser_window = SubLObjectFactory.makeString("Will open in new browser window");
        $str7$_blank = SubLObjectFactory.makeString("_blank");
        $kw8$EDIT_IN_SMT = SubLObjectFactory.makeKeyword("EDIT-IN-SMT");
        $sym9$CB_LINK_EDIT_IN_SMT = SubLObjectFactory.makeSymbol("CB-LINK-EDIT-IN-SMT");
        $str10$Edit = SubLObjectFactory.makeString("Edit");
        $str11$window_open__ = SubLObjectFactory.makeString("window.open('");
        $str12$___ = SubLObjectFactory.makeString("');");
        $kw13$BUTTON = SubLObjectFactory.makeKeyword("BUTTON");
        $str14$CMT = SubLObjectFactory.makeString("CMT");
        $kw15$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str16$sksi_smt = SubLObjectFactory.makeString("sksi-smt");
        $kw17$SMT = SubLObjectFactory.makeKeyword("SMT");
        $sym18$CB_LINK_SMT = SubLObjectFactory.makeSymbol("CB-LINK-SMT");
        $str19$SMT = SubLObjectFactory.makeString("SMT");
        $str20$Schema_Modeling_Tool = SubLObjectFactory.makeString("Schema Modeling Tool");
        $sym21$SKSI_SMT = SubLObjectFactory.makeSymbol("SKSI-SMT");
        $kw22$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym23$ARGHASH_P = SubLObjectFactory.makeSymbol("ARGHASH-P");
        $str24$COMMAND = SubLObjectFactory.makeString("COMMAND");
        $str25$TO = SubLObjectFactory.makeString("TO");
        $kw26$ON_EDIT_SKS = SubLObjectFactory.makeKeyword("ON-EDIT-SKS");
        $kw27$ON_EDIT_SD = SubLObjectFactory.makeKeyword("ON-EDIT-SD");
        $kw28$ON_EDIT_PS = SubLObjectFactory.makeKeyword("ON-EDIT-PS");
        $kw29$ON_EDIT_LS = SubLObjectFactory.makeKeyword("ON-EDIT-LS");
        $kw30$ON_EDIT_LF = SubLObjectFactory.makeKeyword("ON-EDIT-LF");
        $kw31$ON_EDIT_MS = SubLObjectFactory.makeKeyword("ON-EDIT-MS");
        $kw32$ON_DECODE_PSB = SubLObjectFactory.makeKeyword("ON-DECODE-PSB");
        $kw33$ON_EDIT_TS = SubLObjectFactory.makeKeyword("ON-EDIT-TS");
        $kw34$ON_EDIT_T = SubLObjectFactory.makeKeyword("ON-EDIT-T");
        $kw35$ON_MAIN = SubLObjectFactory.makeKeyword("ON-MAIN");
        $str36$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str37$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw38$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw39$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str40$cg_sksi_smt = SubLObjectFactory.makeString("cg?sksi-smt");
        $str41$post = SubLObjectFactory.makeString("post");
        $kw42$JUST_FORT = SubLObjectFactory.makeKeyword("JUST-FORT");
        $const43$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StructuredKnowledgeSource"));
        $kw44$SKS = SubLObjectFactory.makeKeyword("SKS");
        $kw45$TO_EDIT_SKS = SubLObjectFactory.makeKeyword("TO-EDIT-SKS");
        $const46$PhysicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalSchema"));
        $kw47$PS = SubLObjectFactory.makeKeyword("PS");
        $kw48$TO_EDIT_PS = SubLObjectFactory.makeKeyword("TO-EDIT-PS");
        $const49$LogicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalSchema"));
        $kw50$LS = SubLObjectFactory.makeKeyword("LS");
        $kw51$TO_EDIT_LS = SubLObjectFactory.makeKeyword("TO-EDIT-LS");
        $const52$PhysicalField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalField"));
        $kw53$PF = SubLObjectFactory.makeKeyword("PF");
        $kw54$TO_EDIT_PF = SubLObjectFactory.makeKeyword("TO-EDIT-PF");
        $const55$LogicalField = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalField"));
        $kw56$LF = SubLObjectFactory.makeKeyword("LF");
        $kw57$TO_EDIT_LF = SubLObjectFactory.makeKeyword("TO-EDIT-LF");
        $str58$Error__Support_for_term_ = SubLObjectFactory.makeString("Error: Support for term ");
        $str59$_not_implemented = SubLObjectFactory.makeString(" not implemented");
        $kw60$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str61$Error__ = SubLObjectFactory.makeString("Error: ");
        $sym62$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $kw63$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str64$Success__ = SubLObjectFactory.makeString("Success: ");
        $kw65$TO_EDIT_SD = SubLObjectFactory.makeKeyword("TO-EDIT-SD");
        $kw66$TO_EDIT_MS = SubLObjectFactory.makeKeyword("TO-EDIT-MS");
        $kw67$TO_EDIT_TS = SubLObjectFactory.makeKeyword("TO-EDIT-TS");
        $kw68$TO_EDIT_T = SubLObjectFactory.makeKeyword("TO-EDIT-T");
        $kw69$TO_MAIN = SubLObjectFactory.makeKeyword("TO-MAIN");
        $kw70$TO_DECODE_PSB = SubLObjectFactory.makeKeyword("TO-DECODE-PSB");
        $str71$Error__button_ = SubLObjectFactory.makeString("Error: button ");
        $str72$Error__fort_type_for_ = SubLObjectFactory.makeString("Error: fort-type for ");
        $str73$_not_supported = SubLObjectFactory.makeString(" not supported");
        $str74$Create_new_SKS_named__ = SubLObjectFactory.makeString("Create new SKS named: ");
        $kw75$NEW_SKS_NAME = SubLObjectFactory.makeKeyword("NEW-SKS-NAME");
        $int76$40 = SubLObjectFactory.makeInteger(40);
        $str77$Create = SubLObjectFactory.makeString("Create");
        $kw78$COMMAND_EDIT_SKS = SubLObjectFactory.makeKeyword("COMMAND-EDIT-SKS");
        $str79$Knowledge_Source_ = SubLObjectFactory.makeString("Knowledge Source:");
        $kw80$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $kw81$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str82$Source_Description__ = SubLObjectFactory.makeString("Source Description: ");
        $str83$Physical_Schemabase__ = SubLObjectFactory.makeString("Physical Schemabase: ");
        $str84$Logical_Schemabase__ = SubLObjectFactory.makeString("Logical Schemabase: ");
        $str85$Translation_Schemabase__ = SubLObjectFactory.makeString("Translation Schemabase: ");
        $str86$Other_Physical_Schemabases_ = SubLObjectFactory.makeString("Other Physical Schemabases:");
        $str87$Other_Logical_Schemabases_ = SubLObjectFactory.makeString("Other Logical Schemabases:");
        $str88$Other_Translations_Schemabases_ = SubLObjectFactory.makeString("Other Translations Schemabases:");
        $str89$Please_enter_an_SKS_name_ = SubLObjectFactory.makeString("Please enter an SKS name.");
        $str90$Edit_SKS__ = SubLObjectFactory.makeString("Edit SKS: ");
        $str91$Name__ = SubLObjectFactory.makeString("Name: ");
        $kw92$SKS_NAMESTRING = SubLObjectFactory.makeKeyword("SKS-NAMESTRING");
        $const93$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $int94$80 = SubLObjectFactory.makeInteger(80);
        $kw95$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str96$Add = SubLObjectFactory.makeString("Add");
        $kw97$COMMAND_EDIT_SD = SubLObjectFactory.makeKeyword("COMMAND-EDIT-SD");
        $str98$Decode = SubLObjectFactory.makeString("Decode");
        $kw99$DECODE_PSB = SubLObjectFactory.makeKeyword("DECODE-PSB");
        $str100$Remove = SubLObjectFactory.makeString("Remove");
        $kw101$REMOVE_PSB = SubLObjectFactory.makeKeyword("REMOVE-PSB");
        $kw102$COMMAND_REMOVE_LSB = SubLObjectFactory.makeKeyword("COMMAND-REMOVE-LSB");
        $kw103$LSB = SubLObjectFactory.makeKeyword("LSB");
        $kw104$COMMAND_EDIT_LSB = SubLObjectFactory.makeKeyword("COMMAND-EDIT-LSB");
        $kw105$COMMAND_REMOVE_TSB = SubLObjectFactory.makeKeyword("COMMAND-REMOVE-TSB");
        $kw106$TSB = SubLObjectFactory.makeKeyword("TSB");
        $str107$Refresh = SubLObjectFactory.makeString("Refresh");
        $kw108$REFRESH = SubLObjectFactory.makeKeyword("REFRESH");
        $str109$OK = SubLObjectFactory.makeString("OK");
        $kw110$OK = SubLObjectFactory.makeKeyword("OK");
        $str111$Cancel = SubLObjectFactory.makeString("Cancel");
        $kw112$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $str113$Physical_Schemata_ = SubLObjectFactory.makeString("Physical Schemata:");
        $str114$Logical_Schemata_ = SubLObjectFactory.makeString("Logical Schemata:");
        $str115$Translations_ = SubLObjectFactory.makeString("Translations:");
        $str116$View = SubLObjectFactory.makeString("View");
        $kw117$COMMAND_EDIT_PS = SubLObjectFactory.makeKeyword("COMMAND-EDIT-PS");
        $kw118$COMMAND_EDIT_LS = SubLObjectFactory.makeKeyword("COMMAND-EDIT-LS");
        $kw119$COMMAND_EDIT_TS = SubLObjectFactory.makeKeyword("COMMAND-EDIT-TS");
        $const120$sksPhysicalSchemaDescriptionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksPhysicalSchemaDescriptionMt"));
        $const121$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $list122 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedStructuredKnowledgeSourceType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sqlProgramForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedDatabaseServerProgram")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subProtocolForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userNameForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("passwordForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("serverOfSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("portNumberForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyHost")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyPort")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")) });
        $str123$This_SKS_is_currently_ = SubLObjectFactory.makeString("This SKS is currently ");
        $str124$accessible = SubLObjectFactory.makeString("accessible");
        $str125$not_accessible = SubLObjectFactory.makeString("not accessible");
        $str126$_ = SubLObjectFactory.makeString(".");
        $kw127$SD = SubLObjectFactory.makeKeyword("SD");
        $str128$Edit_Source_Description__ = SubLObjectFactory.makeString("Edit Source Description: ");
        $str129$Parameter = SubLObjectFactory.makeString("Parameter");
        $str130$Value = SubLObjectFactory.makeString("Value");
        $const131$CharacterString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString"));
        $const132$Integer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"));
        $kw133$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $kw134$FORT = SubLObjectFactory.makeKeyword("FORT");
        $sym135$FORT_NAME = SubLObjectFactory.makeSymbol("FORT-NAME");
        $str136$Changed__A__A_from__A_to__A = SubLObjectFactory.makeString("Changed ~A ~A from ~A to ~A");
        $sym137$SKSI_SMT_UPDATE_SOURCE_DESCRIPTION = SubLObjectFactory.makeSymbol("SKSI-SMT-UPDATE-SOURCE-DESCRIPTION");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $sym139$SKSI_SMT_COMPILE_SOURCE_DESCRIPTION = SubLObjectFactory.makeSymbol("SKSI-SMT-COMPILE-SOURCE-DESCRIPTION");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"));
        $sym141$SKSI_SMT_COMPILE_PARAM_DEFINITIONS = SubLObjectFactory.makeSymbol("SKSI-SMT-COMPILE-PARAM-DEFINITIONS");
        $const142$sksIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksIsa"));
        $const143$subProtocolForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subProtocolForSKS"));
        $const144$SKSISupportedDatabaseServerProgra = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedDatabaseServerProgram"));
        $str145$Do_not_know_what_to_do_with_const = SubLObjectFactory.makeString("Do not know what to do with constraint ~A.");
        $sym146$_SKSI_SMT_COMPILE_PARAM_DEFINITIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-SMT-COMPILE-PARAM-DEFINITIONS-CACHING-STATE*");
        $sym147$SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE = SubLObjectFactory.makeSymbol("SKSI-SMT-REGISTER-STRUCTURED-KNOWLEDGE-SOURCE");
        $sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_ = SubLObjectFactory.makeSymbol("SKSI-SMT-STRUCTURED-KNOWLEDGE-SOURCE-REGISTERED?");
        $kw149$NOREG = SubLObjectFactory.makeKeyword("NOREG");
        $sym150$SKSI_PS_COMPILE_PFS_INFO = SubLObjectFactory.makeSymbol("SKSI-PS-COMPILE-PFS-INFO");
        $kw151$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw152$DATATYPE = SubLObjectFactory.makeKeyword("DATATYPE");
        $kw153$NULLABLE = SubLObjectFactory.makeKeyword("NULLABLE");
        $kw154$KEY_TYPE = SubLObjectFactory.makeKeyword("KEY-TYPE");
        $kw155$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str156$Edit_Physical_Schema__ = SubLObjectFactory.makeString("Edit Physical Schema: ");
        $str157$___ = SubLObjectFactory.makeString(" : ");
        $str158$Physical_fields_ = SubLObjectFactory.makeString("Physical fields:");
        $str159$Name = SubLObjectFactory.makeString("Name");
        $str160$Datatype = SubLObjectFactory.makeString("Datatype");
        $str161$Nullable = SubLObjectFactory.makeString("Nullable");
        $str162$Default_Value = SubLObjectFactory.makeString("Default Value");
        $str163$No_fields_in_this_physical_schema = SubLObjectFactory.makeString("No fields in this physical schema.");
        $const164$TheLogicalFieldValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheLogicalFieldValueFn"));
        $sym165$SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA = SubLObjectFactory.makeSymbol("SKSI-SMT-FETCH-SIMPLE-LOGICAL-SCHEMATA");
        $sym166$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const167$logicalPhysicalSchemaMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalSchemaMap"));
        $sym168$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA = SubLObjectFactory.makeSymbol("SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMATA");
        $sym169$SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA = SubLObjectFactory.makeSymbol("SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMA");
        $str170$Could_not_retrieve_meaning_senten = SubLObjectFactory.makeString("Could not retrieve meaning sentence for ~A");
        $sym171$_BASE_PRED = SubLObjectFactory.makeSymbol("?BASE-PRED");
        $const172$correspondingSKSIPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("correspondingSKSIPredicate"));
        $str173$Dont_support_more_than_binary_pre = SubLObjectFactory.makeString("Dont support more than binary predicates at this point.");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENCODING-ASS"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING-ASS"));
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("LS"), (SubLObject)SubLObjectFactory.makeSymbol("LFI"), (SubLObject)SubLObjectFactory.makeSymbol("PS"), (SubLObject)SubLObjectFactory.makeSymbol("PFI-EXPR"));
        $const176$fieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding"));
        $str177$Expected___fieldDecoding_sentence = SubLObjectFactory.makeString("Expected #$fieldDecoding sentence, got ~A.");
        $kw178$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw179$PF1 = SubLObjectFactory.makeKeyword("PF1");
        $kw180$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw181$ARG_ISA = SubLObjectFactory.makeKeyword("ARG-ISA");
        $kw182$CONVERT = SubLObjectFactory.makeKeyword("CONVERT");
        $kw183$PF2 = SubLObjectFactory.makeKeyword("PF2");
        $const184$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $const185$SchemaObjectIDFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectIDFn"));
        $const186$TheTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheTerm"));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $str188$Do_not_know_how_to_unpack_decodin = SubLObjectFactory.makeString("Do not know how to unpack decoding expression ~A.");
        $kw189$ENABLED = SubLObjectFactory.makeKeyword("ENABLED");
        $sym190$ENABLE_SKSI_SMT_MODE = SubLObjectFactory.makeSymbol("ENABLE-SKSI-SMT-MODE");
        $sym191$DISABLE_SKSI_SMT_MODE = SubLObjectFactory.makeSymbol("DISABLE-SKSI-SMT-MODE");
        $kw192$DISABLED = SubLObjectFactory.makeKeyword("DISABLED");
        $sym193$IS_SKSI_SMT_MODE_ENABLED_ = SubLObjectFactory.makeSymbol("IS-SKSI-SMT-MODE-ENABLED?");
        $sym194$GET_SKSI_SMT_MODE = SubLObjectFactory.makeSymbol("GET-SKSI-SMT-MODE");
        $sym195$SKSI_SMT_GET_UNITS_OF_MEASUREMENT = SubLObjectFactory.makeSymbol("SKSI-SMT-GET-UNITS-OF-MEASUREMENT");
        $sym196$SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN = SubLObjectFactory.makeSymbol("SKSI-SMT-UNINTERESTING-UNITS-FILTER-FN");
        $const197$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"));
        $sym199$SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA = SubLObjectFactory.makeSymbol("SKSI-SMT-DERIVE-SIMPLE-LOGICAL-SCHEMA");
        $str200$_PS = SubLObjectFactory.makeString("-PS");
        $str201$_ = SubLObjectFactory.makeString("-");
        $str202$_LS = SubLObjectFactory.makeString("-LS");
        $const203$logicalSchemaFieldTypeList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaFieldTypeList"));
        $const204$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $const205$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentenceOfSchema"));
        $list206 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PF"), (SubLObject)SubLObjectFactory.makeSymbol("LFI"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERT"));
        $const207$fieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncoding"));
        $const208$sksRepresentationComplete = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRepresentationComplete"));
        $const209$SKSIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt"));
        $str210$_Pred = SubLObjectFactory.makeString("-Pred");
        $const211$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list212 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")));
        $const213$termDependsOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn"));
        $const214$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const215$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const216$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $const217$backchainForbidden = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("backchainForbidden"));
        $list218 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIOnlyPredicate")));
        $const219$backchainRequired = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("backchainRequired"));
        $const220$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"));
        $kw222$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $const223$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThePhysicalFieldValueFn"));
        $const224$PhysicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalFieldFn"));
        $list225 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lambda")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LFI")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)sksi_smt.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantityConversionFn")), (SubLObject)SubLObjectFactory.makeKeyword("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("?LFI"))));
        $kw226$OPERATOR = SubLObjectFactory.makeKeyword("OPERATOR");
        $str227$No_implementation_yet_for_LF_conv = SubLObjectFactory.makeString("No implementation yet for LF conversion pattern ~A.");
        $list228 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lambda")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PFI")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("?PFI")));
        $str229$No_implementation_yet_for_PF_conv = SubLObjectFactory.makeString("No implementation yet for PF conversion pattern ~A.");
        $sym230$SKSI_SMT_COLUMN_OR_FORT_NAME = SubLObjectFactory.makeSymbol("SKSI-SMT-COLUMN-OR-FORT-NAME");
        $sym231$_SKSI_SMT_COLUMN_OR_FORT_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-SMT-COLUMN-OR-FORT-NAME-CACHING-STATE*");
        $int232$200 = SubLObjectFactory.makeInteger(200);
        $str233$Edit_Logical_Schema__ = SubLObjectFactory.makeString("Edit Logical Schema: ");
        $str234$Logical_fields_ = SubLObjectFactory.makeString("Logical fields:");
        $str235$CycL = SubLObjectFactory.makeString("CycL");
        $str236$Field_isa = SubLObjectFactory.makeString("Field isa");
        $str237$__user_MS_s = SubLObjectFactory.makeString("# user MS's");
        $kw238$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $kw239$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $kw240$COMMAND_EDIT_LF = SubLObjectFactory.makeKeyword("COMMAND-EDIT-LF");
        $str241$Delete = SubLObjectFactory.makeString("Delete");
        $kw242$DELETE_LF = SubLObjectFactory.makeKeyword("DELETE-LF");
        $str243$No_fields_in_this_logical_schema_ = SubLObjectFactory.makeString("No fields in this logical schema.");
        $str244$Add_logical_field = SubLObjectFactory.makeString("Add logical field");
        $str245$Meaning_sentences_ = SubLObjectFactory.makeString("Meaning sentences:");
        $kw246$COMMAND_EDIT_MS = SubLObjectFactory.makeKeyword("COMMAND-EDIT-MS");
        $kw247$MS = SubLObjectFactory.makeKeyword("MS");
        $kw248$DELETE_MS = SubLObjectFactory.makeKeyword("DELETE-MS");
        $str249$No_meaning_sentences_in_this_logi = SubLObjectFactory.makeString("No meaning sentences in this logical schema.");
        $str250$ = SubLObjectFactory.makeString("");
        $int251$60 = SubLObjectFactory.makeInteger(60);
        $str252$Add_meaning_sentence = SubLObjectFactory.makeString("Add meaning sentence");
        $str253$Edit_Logical_Field__ = SubLObjectFactory.makeString("Edit Logical Field: ");
        $str254$Editing_this_field_will_automatic = SubLObjectFactory.makeString("Editing this field will automatically convert it into a constant.");
        $str255$Logical_field_ = SubLObjectFactory.makeString("Logical field:");
        $kw256$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw257$NEW_ISA = SubLObjectFactory.makeKeyword("NEW-ISA");
        $int258$30 = SubLObjectFactory.makeInteger(30);
        $str259$Complete = SubLObjectFactory.makeString("Complete");
        $const260$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $str261$Change = SubLObjectFactory.makeString("Change");
        $kw262$REMOVE_ISA = SubLObjectFactory.makeKeyword("REMOVE-ISA");
        $kw263$REMOVED_ISA = SubLObjectFactory.makeKeyword("REMOVED-ISA");
        $kw264$ADDED_ISA = SubLObjectFactory.makeKeyword("ADDED-ISA");
        $str265$Add_isa = SubLObjectFactory.makeString("Add isa");
        $kw266$ADD_ISA = SubLObjectFactory.makeKeyword("ADD-ISA");
        $const267$fieldIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldIsa"));
        $str268$Edit_Translation_Schema__ = SubLObjectFactory.makeString("Edit Translation Schema: ");
        $str269$_A__A = SubLObjectFactory.makeString("~A?~A");
        $str270$___ = SubLObjectFactory.makeString(" & ");
        $str271$_note__editing_is_not_yet_enabled = SubLObjectFactory.makeString("@note: editing is not yet enabled");
        $kw272$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str273$___ = SubLObjectFactory.makeString("<->");
        $kw274$DECODING_FORMULA = SubLObjectFactory.makeKeyword("DECODING-FORMULA");
        $int275$50 = SubLObjectFactory.makeInteger(50);
        $kw276$ENCODING_FORMULA = SubLObjectFactory.makeKeyword("ENCODING-FORMULA");
        $str277$Edit_Meaning_Sentence_in__ = SubLObjectFactory.makeString("Edit Meaning Sentence in: ");
        $kw278$MS_FORMULA = SubLObjectFactory.makeKeyword("MS-FORMULA");
        $kw279$EL_FORMULA = SubLObjectFactory.makeKeyword("EL-FORMULA");
        $kw280$NULL_FORMULA = SubLObjectFactory.makeKeyword("NULL-FORMULA");
        $str281$Formula_invalid_ = SubLObjectFactory.makeString("Formula invalid.");
        $str282$Formula_wasn_t_changed_ = SubLObjectFactory.makeString("Formula wasn't changed.");
        $kw283$CANCEL = SubLObjectFactory.makeKeyword("CANCEL");
        $kw284$TABLE_INFO = SubLObjectFactory.makeKeyword("TABLE-INFO");
        $str285$Select_Database_Tables_to_Decode_ = SubLObjectFactory.makeString("Select Database Tables to Decode for ");
        $str286$__ = SubLObjectFactory.makeString(" :");
        $list287 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCHEMA-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-DETAILS"));
        $sym288$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $sym289$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str290$Schema_ = SubLObjectFactory.makeString("Schema ");
        $str291$__ = SubLObjectFactory.makeString(": ");
        $str292$Show = SubLObjectFactory.makeString("Show");
        $str293$Hide = SubLObjectFactory.makeString("Hide");
        $kw294$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw295$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $str296$Table_Name = SubLObjectFactory.makeString("Table Name");
        $str297$Physical_Schemata = SubLObjectFactory.makeString("Physical Schemata");
        $kw298$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $sym299$SKS_P = SubLObjectFactory.makeSymbol("SKS-P");
        $const300$sksSourceDescriptionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksSourceDescriptionMt"));
        $const301$MappingMtFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MappingMtFn"));
        $const302$SKSISourceDescriptionMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISourceDescriptionMicrotheory"));
        $const303$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str304$_KS = SubLObjectFactory.makeString("-KS");
        $str305$PhysicalSchemaMt = SubLObjectFactory.makeString("PhysicalSchemaMt");
        $const306$SKSIPhysicalSchemaDescriptionMicr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIPhysicalSchemaDescriptionMicrotheory"));
        $const307$sksLogicalSchemaDescriptionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksLogicalSchemaDescriptionMt"));
        $const308$sksSchemaTranslationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksSchemaTranslationMt"));
        $const309$contentMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMt"));
        $const310$bridgingMtForKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("bridgingMtForKS"));
        $sym311$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__ = SubLObjectFactory.makeSymbol("*SKSI-SMT-WARN-ABOUT-INVARIANTS?*");
        $str313$SMT_invariant_broken___A_is_not_a = SubLObjectFactory.makeString("SMT invariant broken: ~A is not an instance of ~A");
        $sym314$SKSI_SOURCE_DESCRIPTION_P = SubLObjectFactory.makeSymbol("SKSI-SOURCE-DESCRIPTION-P");
        $sym315$SKSI_PHYSICAL_SCHEMABASE_P = SubLObjectFactory.makeSymbol("SKSI-PHYSICAL-SCHEMABASE-P");
        $sym316$SKSI_PHYSICAL_SCHEMA_P = SubLObjectFactory.makeSymbol("SKSI-PHYSICAL-SCHEMA-P");
        $const317$schemaFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldNameList"));
        $sym318$SKSI_PHYSICAL_FIELD_P = SubLObjectFactory.makeSymbol("SKSI-PHYSICAL-FIELD-P");
        $const319$fieldName_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldName-SKS"));
        $const320$fieldDataType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDataType"));
        $const321$nonNullFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonNullFields"));
        $const322$defaultFieldValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultFieldValue"));
        $const323$primaryKey = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("primaryKey"));
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("KEYS"));
        $str325$Incapable_of_dealing_with_structu = SubLObjectFactory.makeString("Incapable of dealing with structure of #$primaryKey assertion: ~A");
        $sym326$SKSI_PF_GET_NAME = SubLObjectFactory.makeSymbol("SKSI-PF-GET-NAME");
        $kw327$PRIMARY = SubLObjectFactory.makeKeyword("PRIMARY");
        $kw328$NONE = SubLObjectFactory.makeKeyword("NONE");
        $const329$SKSILogicalSchemaDescriptionMicro = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSILogicalSchemaDescriptionMicrotheory"));
        $str330$LogicalSchemaMt = SubLObjectFactory.makeString("LogicalSchemaMt");
        $sym331$SKSI_LOGICAL_SCHEMABASE_P = SubLObjectFactory.makeSymbol("SKSI-LOGICAL-SCHEMABASE-P");
        $str332$_LS_ = SubLObjectFactory.makeString("-LS-");
        $const333$ObjectDefiningSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectDefiningSchema"));
        $const334$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $const335$schemaIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaIsa"));
        $sym336$SKSI_LOGICAL_SCHEMA_P = SubLObjectFactory.makeSymbol("SKSI-LOGICAL-SCHEMA-P");
        $const337$logicalFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFields"));
        $sym338$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const339$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym340$_SKSI_ISG_ = SubLObjectFactory.makeSymbol("*SKSI-ISG*");
        $str341$_LF_ = SubLObjectFactory.makeString("-LF-");
        $const342$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const343$IndexicalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndexicalConcept"));
        $sym344$SKSI_LOGICAL_FIELD_P = SubLObjectFactory.makeSymbol("SKSI-LOGICAL-FIELD-P");
        $const345$fieldGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldGenls"));
        $sym346$SKSI_MEANING_SENTENCE_P = SubLObjectFactory.makeSymbol("SKSI-MEANING-SENTENCE-P");
        $const347$SKSISchemaTranslationMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISchemaTranslationMicrotheory"));
        $str348$TranslationSchemaMt = SubLObjectFactory.makeString("TranslationSchemaMt");
        $sym349$SKSI_TRANSLATION_SCHEMABASE_P = SubLObjectFactory.makeSymbol("SKSI-TRANSLATION-SCHEMABASE-P");
        $sym350$DECODE_PHYSICAL_STRUCTURE_OF_SKS = SubLObjectFactory.makeSymbol("DECODE-PHYSICAL-STRUCTURE-OF-SKS");
        $sym351$NEW_STRUCTURED_KNOWLEDGE_SOURCE = SubLObjectFactory.makeSymbol("NEW-STRUCTURED-KNOWLEDGE-SOURCE");
        $const352$ContentMtFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtFn"));
        $const353$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $const354$BridgingMtForKSFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BridgingMtForKSFn"));
        $const355$SKSIVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIVocabularyMt"));
        $sym356$NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA = SubLObjectFactory.makeSymbol("NEW-CONCEPTUAL-MAPPING-LOGICAL-SCHEMA");
        $str357$_CMLS = SubLObjectFactory.makeString("-CMLS");
        $list358 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiedMapping")));
        $sym359$SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES = SubLObjectFactory.makeSymbol("SKSI-SMT-GET-AVAILABLE-DATABASE-TYPES");
        $sym360$HL_PROTOTYPICAL_INSTANCE_ = SubLObjectFactory.makeSymbol("HL-PROTOTYPICAL-INSTANCE?");
        $const361$SKSISchemaDescriptionMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISchemaDescriptionMicrotheory"));
        $sym362$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $const363$subKS_Direct = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subKS-Direct"));
        $const364$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaSourceMap"));
        $const365$physicalFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFields"));
        $sym366$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $const367$enumerableSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("enumerableSchema"));
        $sym368$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw369$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw370$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw371$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym372$SKSI_PSB_GET_LABELED_SCHEMATA = SubLObjectFactory.makeSymbol("SKSI-PSB-GET-LABELED-SCHEMATA");
        $const373$schemaName_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaName-SKS"));
        $const374$schemaNameSchema_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaNameSchema-SKS"));
        $list375 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PS"), (SubLObject)SubLObjectFactory.makeSymbol("LSS"));
        $sym376$FORT_NAME_ = SubLObjectFactory.makeSymbol("FORT-NAME<");
    }
}

/*

	Total time: 3904 ms
	 synthetic 
*/