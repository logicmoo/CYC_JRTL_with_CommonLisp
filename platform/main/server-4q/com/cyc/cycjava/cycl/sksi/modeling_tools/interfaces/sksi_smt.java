package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;


import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.rkf_relevance_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_default_fort_handler$;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_smt extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_smt();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt";

    public static final String myFingerPrint = "601700c03d9e67f93a0cfc6081e613eb7682ca00a68b9d009c19307540bcc4e0";

    // defparameter
    public static final SubLSymbol $allow_smt_editing_links$ = makeSymbol("*ALLOW-SMT-EDITING-LINKS*");

    // deflexical
    private static final SubLSymbol $sksi_smt_sd_parameters$ = makeSymbol("*SKSI-SMT-SD-PARAMETERS*");



    // deflexical
    private static final SubLSymbol $sksi_smt_mode$ = makeSymbol("*SKSI-SMT-MODE*");



    // defparameter
    public static final SubLSymbol $sksi_smt_warn_about_invariantsP$ = makeSymbol("*SKSI-SMT-WARN-ABOUT-INVARIANTS?*");



    private static final SubLString $str0$_Edit_in_SMT_ = makeString("[Edit in SMT]");

    private static final SubLString $str1$http___ = makeString("http://");

    private static final SubLString $str2$_ = makeString(":");

    private static final SubLString $str3$_SchemaModelingTool__sksName_ = makeString("/SchemaModelingTool/?sksName=");

    private static final SubLString $str4$_cyc_server_ = makeString("&cyc.server=");

    private static final SubLString $str5$_cyc_defaultCyclist_ = makeString("&cyc.defaultCyclist=");

    private static final SubLString $$$Will_open_in_new_browser_window = makeString("Will open in new browser window");

    private static final SubLString $str7$_blank = makeString("_blank");

    private static final SubLSymbol $EDIT_IN_SMT = makeKeyword("EDIT-IN-SMT");

    private static final SubLSymbol CB_LINK_EDIT_IN_SMT = makeSymbol("CB-LINK-EDIT-IN-SMT");

    private static final SubLString $$$Edit = makeString("Edit");

    private static final SubLString $str11$window_open__ = makeString("window.open('");

    private static final SubLString $str12$___ = makeString("');");



    private static final SubLString $$$CMT = makeString("CMT");



    private static final SubLString $str16$sksi_smt = makeString("sksi-smt");



    private static final SubLSymbol CB_LINK_SMT = makeSymbol("CB-LINK-SMT");

    private static final SubLString $$$SMT = makeString("SMT");

    private static final SubLString $$$Schema_Modeling_Tool = makeString("Schema Modeling Tool");

    private static final SubLSymbol SKSI_SMT = makeSymbol("SKSI-SMT");



    private static final SubLSymbol ARGHASH_P = makeSymbol("ARGHASH-P");

    private static final SubLString $$$COMMAND = makeString("COMMAND");

    private static final SubLString $$$TO = makeString("TO");

    private static final SubLSymbol $ON_EDIT_SKS = makeKeyword("ON-EDIT-SKS");

    private static final SubLSymbol $ON_EDIT_SD = makeKeyword("ON-EDIT-SD");

    private static final SubLSymbol $ON_EDIT_PS = makeKeyword("ON-EDIT-PS");

    private static final SubLSymbol $ON_EDIT_LS = makeKeyword("ON-EDIT-LS");

    private static final SubLSymbol $ON_EDIT_LF = makeKeyword("ON-EDIT-LF");

    private static final SubLSymbol $ON_EDIT_MS = makeKeyword("ON-EDIT-MS");

    private static final SubLSymbol $ON_DECODE_PSB = makeKeyword("ON-DECODE-PSB");

    private static final SubLSymbol $ON_EDIT_TS = makeKeyword("ON-EDIT-TS");

    private static final SubLSymbol $ON_EDIT_T = makeKeyword("ON-EDIT-T");



    private static final SubLString $str36$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str37$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str40$cg_sksi_smt = makeString("cg?sksi-smt");

    private static final SubLString $$$post = makeString("post");



    private static final SubLObject $$StructuredKnowledgeSource = reader_make_constant_shell(makeString("StructuredKnowledgeSource"));



    private static final SubLSymbol $TO_EDIT_SKS = makeKeyword("TO-EDIT-SKS");

    private static final SubLObject $$PhysicalSchema = reader_make_constant_shell(makeString("PhysicalSchema"));



    private static final SubLSymbol $TO_EDIT_PS = makeKeyword("TO-EDIT-PS");

    private static final SubLObject $$LogicalSchema = reader_make_constant_shell(makeString("LogicalSchema"));



    private static final SubLSymbol $TO_EDIT_LS = makeKeyword("TO-EDIT-LS");

    private static final SubLObject $$PhysicalField = reader_make_constant_shell(makeString("PhysicalField"));



    private static final SubLSymbol $TO_EDIT_PF = makeKeyword("TO-EDIT-PF");

    private static final SubLObject $$LogicalField = reader_make_constant_shell(makeString("LogicalField"));



    private static final SubLSymbol $TO_EDIT_LF = makeKeyword("TO-EDIT-LF");

    private static final SubLString $str58$Error__Support_for_term_ = makeString("Error: Support for term ");

    private static final SubLString $$$_not_implemented = makeString(" not implemented");



    private static final SubLString $str61$Error__ = makeString("Error: ");





    private static final SubLString $str64$Success__ = makeString("Success: ");

    private static final SubLSymbol $TO_EDIT_SD = makeKeyword("TO-EDIT-SD");

    private static final SubLSymbol $TO_EDIT_MS = makeKeyword("TO-EDIT-MS");

    private static final SubLSymbol $TO_EDIT_TS = makeKeyword("TO-EDIT-TS");

    private static final SubLSymbol $TO_EDIT_T = makeKeyword("TO-EDIT-T");



    private static final SubLSymbol $TO_DECODE_PSB = makeKeyword("TO-DECODE-PSB");

    private static final SubLString $str71$Error__button_ = makeString("Error: button ");

    private static final SubLString $str72$Error__fort_type_for_ = makeString("Error: fort-type for ");

    private static final SubLString $$$_not_supported = makeString(" not supported");

    private static final SubLString $str74$Create_new_SKS_named__ = makeString("Create new SKS named: ");

    private static final SubLSymbol $NEW_SKS_NAME = makeKeyword("NEW-SKS-NAME");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Create = makeString("Create");

    private static final SubLSymbol $COMMAND_EDIT_SKS = makeKeyword("COMMAND-EDIT-SKS");

    private static final SubLString $str79$Knowledge_Source_ = makeString("Knowledge Source:");





    private static final SubLString $str82$Source_Description__ = makeString("Source Description: ");

    private static final SubLString $str83$Physical_Schemabase__ = makeString("Physical Schemabase: ");

    private static final SubLString $str84$Logical_Schemabase__ = makeString("Logical Schemabase: ");

    private static final SubLString $str85$Translation_Schemabase__ = makeString("Translation Schemabase: ");

    private static final SubLString $str86$Other_Physical_Schemabases_ = makeString("Other Physical Schemabases:");

    private static final SubLString $str87$Other_Logical_Schemabases_ = makeString("Other Logical Schemabases:");

    private static final SubLString $str88$Other_Translations_Schemabases_ = makeString("Other Translations Schemabases:");

    private static final SubLString $str89$Please_enter_an_SKS_name_ = makeString("Please enter an SKS name.");

    private static final SubLString $str90$Edit_SKS__ = makeString("Edit SKS: ");

    private static final SubLString $str91$Name__ = makeString("Name: ");



    private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

    private static final SubLInteger $int$80 = makeInteger(80);



    private static final SubLString $$$Add = makeString("Add");

    private static final SubLSymbol $COMMAND_EDIT_SD = makeKeyword("COMMAND-EDIT-SD");

    private static final SubLString $$$Decode = makeString("Decode");



    private static final SubLString $$$Remove = makeString("Remove");



    private static final SubLSymbol $COMMAND_REMOVE_LSB = makeKeyword("COMMAND-REMOVE-LSB");



    private static final SubLSymbol $COMMAND_EDIT_LSB = makeKeyword("COMMAND-EDIT-LSB");

    private static final SubLSymbol $COMMAND_REMOVE_TSB = makeKeyword("COMMAND-REMOVE-TSB");



    private static final SubLString $$$Refresh = makeString("Refresh");



    private static final SubLString $$$OK = makeString("OK");



    private static final SubLString $$$Cancel = makeString("Cancel");



    private static final SubLString $str113$Physical_Schemata_ = makeString("Physical Schemata:");

    private static final SubLString $str114$Logical_Schemata_ = makeString("Logical Schemata:");

    private static final SubLString $str115$Translations_ = makeString("Translations:");

    private static final SubLString $$$View = makeString("View");

    private static final SubLSymbol $COMMAND_EDIT_PS = makeKeyword("COMMAND-EDIT-PS");

    private static final SubLSymbol $COMMAND_EDIT_LS = makeKeyword("COMMAND-EDIT-LS");

    private static final SubLSymbol $COMMAND_EDIT_TS = makeKeyword("COMMAND-EDIT-TS");

    private static final SubLObject $$sksPhysicalSchemaDescriptionMt = reader_make_constant_shell(makeString("sksPhysicalSchemaDescriptionMt"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLList $list122 = list(new SubLObject[]{ reader_make_constant_shell(makeString("sksIsa")), reader_make_constant_shell(makeString("SKSISupportedStructuredKnowledgeSourceType")), reader_make_constant_shell(makeString("structuredKnowledgeSourceName")), reader_make_constant_shell(makeString("CharacterString")), reader_make_constant_shell(makeString("sqlProgramForSKS")), reader_make_constant_shell(makeString("SKSISupportedDatabaseServerProgram")), reader_make_constant_shell(makeString("subProtocolForSKS")), reader_make_constant_shell(makeString("CharacterString")), reader_make_constant_shell(makeString("userNameForSKS")), reader_make_constant_shell(makeString("CharacterString")), reader_make_constant_shell(makeString("passwordForSKS")), reader_make_constant_shell(makeString("CharacterString")), reader_make_constant_shell(makeString("serverOfSKS")), reader_make_constant_shell(makeString("CharacterString")), reader_make_constant_shell(makeString("portNumberForSKS")), reader_make_constant_shell(makeString("Integer")), reader_make_constant_shell(makeString("sksProxyHost")), reader_make_constant_shell(makeString("CharacterString")), reader_make_constant_shell(makeString("sksProxyPort")), reader_make_constant_shell(makeString("Integer")) });

    private static final SubLString $$$This_SKS_is_currently_ = makeString("This SKS is currently ");

    private static final SubLString $$$accessible = makeString("accessible");

    private static final SubLString $$$not_accessible = makeString("not accessible");

    private static final SubLString $str126$_ = makeString(".");



    private static final SubLString $str128$Edit_Source_Description__ = makeString("Edit Source Description: ");

    private static final SubLString $$$Parameter = makeString("Parameter");

    private static final SubLString $$$Value = makeString("Value");

    private static final SubLObject $$CharacterString = reader_make_constant_shell(makeString("CharacterString"));

    private static final SubLObject $$Integer = reader_make_constant_shell(makeString("Integer"));







    private static final SubLString $str136$Changed__A__A_from__A_to__A = makeString("Changed ~A ~A from ~A to ~A");

    private static final SubLSymbol SKSI_SMT_UPDATE_SOURCE_DESCRIPTION = makeSymbol("SKSI-SMT-UPDATE-SOURCE-DESCRIPTION");

    private static final SubLList $list138 = list(makeSymbol("PREDICATE"), makeSymbol("NEW-VALUE"));

    private static final SubLSymbol SKSI_SMT_COMPILE_SOURCE_DESCRIPTION = makeSymbol("SKSI-SMT-COMPILE-SOURCE-DESCRIPTION");

    private static final SubLList $list140 = list(makeSymbol("PREDICATE"), makeSymbol("CONSTRAINT"));

    private static final SubLSymbol SKSI_SMT_COMPILE_PARAM_DEFINITIONS = makeSymbol("SKSI-SMT-COMPILE-PARAM-DEFINITIONS");

    private static final SubLObject $$sksIsa = reader_make_constant_shell(makeString("sksIsa"));

    private static final SubLObject $$subProtocolForSKS = reader_make_constant_shell(makeString("subProtocolForSKS"));

    private static final SubLObject $const144$SKSISupportedDatabaseServerProgra = reader_make_constant_shell(makeString("SKSISupportedDatabaseServerProgram"));

    private static final SubLString $str145$Do_not_know_what_to_do_with_const = makeString("Do not know what to do with constraint ~A.");

    private static final SubLSymbol $sksi_smt_compile_param_definitions_caching_state$ = makeSymbol("*SKSI-SMT-COMPILE-PARAM-DEFINITIONS-CACHING-STATE*");

    private static final SubLSymbol SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE = makeSymbol("SKSI-SMT-REGISTER-STRUCTURED-KNOWLEDGE-SOURCE");

    private static final SubLSymbol $sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_ = makeSymbol("SKSI-SMT-STRUCTURED-KNOWLEDGE-SOURCE-REGISTERED?");



    private static final SubLSymbol SKSI_PS_COMPILE_PFS_INFO = makeSymbol("SKSI-PS-COMPILE-PFS-INFO");











    private static final SubLString $str156$Edit_Physical_Schema__ = makeString("Edit Physical Schema: ");

    private static final SubLString $str157$___ = makeString(" : ");

    private static final SubLString $str158$Physical_fields_ = makeString("Physical fields:");

    private static final SubLString $$$Name = makeString("Name");

    private static final SubLString $$$Datatype = makeString("Datatype");

    private static final SubLString $$$Nullable = makeString("Nullable");

    private static final SubLString $$$Default_Value = makeString("Default Value");

    private static final SubLString $str163$No_fields_in_this_physical_schema = makeString("No fields in this physical schema.");

    private static final SubLObject $$TheLogicalFieldValueFn = reader_make_constant_shell(makeString("TheLogicalFieldValueFn"));

    private static final SubLSymbol SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA = makeSymbol("SKSI-SMT-FETCH-SIMPLE-LOGICAL-SCHEMATA");



    private static final SubLObject $$logicalPhysicalSchemaMap = reader_make_constant_shell(makeString("logicalPhysicalSchemaMap"));

    private static final SubLSymbol SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA = makeSymbol("SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMATA");

    private static final SubLSymbol SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA = makeSymbol("SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMA");

    private static final SubLString $str170$Could_not_retrieve_meaning_senten = makeString("Could not retrieve meaning sentence for ~A");

    private static final SubLSymbol $sym171$_BASE_PRED = makeSymbol("?BASE-PRED");

    private static final SubLObject $$correspondingSKSIPredicate = reader_make_constant_shell(makeString("correspondingSKSIPredicate"));

    private static final SubLString $str173$Dont_support_more_than_binary_pre = makeString("Dont support more than binary predicates at this point.");

    private static final SubLList $list174 = list(makeSymbol("ENCODING-ASS"), makeSymbol("DECODING-ASS"));

    private static final SubLList $list175 = list(makeSymbol("PRED"), makeSymbol("LS"), makeSymbol("LFI"), makeSymbol("PS"), makeSymbol("PFI-EXPR"));

    private static final SubLObject $$fieldDecoding = reader_make_constant_shell(makeString("fieldDecoding"));

    private static final SubLString $str177$Expected___fieldDecoding_sentence = makeString("Expected #$fieldDecoding sentence, got ~A.");













    private static final SubLObject $$SchemaObjectFn = reader_make_constant_shell(makeString("SchemaObjectFn"));

    private static final SubLObject $$SchemaObjectIDFn = reader_make_constant_shell(makeString("SchemaObjectIDFn"));

    private static final SubLObject $$TheTerm = reader_make_constant_shell(makeString("TheTerm"));

    private static final SubLList $list187 = list(makeSymbol("LAMBDA-OPERATOR"), makeSymbol("VAR-LIST"), makeSymbol("EXPRESSION"));

    private static final SubLString $str188$Do_not_know_how_to_unpack_decodin = makeString("Do not know how to unpack decoding expression ~A.");



    private static final SubLSymbol ENABLE_SKSI_SMT_MODE = makeSymbol("ENABLE-SKSI-SMT-MODE");

    private static final SubLSymbol DISABLE_SKSI_SMT_MODE = makeSymbol("DISABLE-SKSI-SMT-MODE");



    private static final SubLSymbol $sym193$IS_SKSI_SMT_MODE_ENABLED_ = makeSymbol("IS-SKSI-SMT-MODE-ENABLED?");

    private static final SubLSymbol GET_SKSI_SMT_MODE = makeSymbol("GET-SKSI-SMT-MODE");

    private static final SubLSymbol SKSI_SMT_GET_UNITS_OF_MEASUREMENT = makeSymbol("SKSI-SMT-GET-UNITS-OF-MEASUREMENT");

    private static final SubLSymbol SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN = makeSymbol("SKSI-SMT-UNINTERESTING-UNITS-FILTER-FN");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list198 = list(makeSymbol("STRING-SPEC"), makeSymbol("FORT"));

    private static final SubLSymbol SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA = makeSymbol("SKSI-SMT-DERIVE-SIMPLE-LOGICAL-SCHEMA");

    private static final SubLString $str200$_PS = makeString("-PS");

    private static final SubLString $str201$_ = makeString("-");

    private static final SubLString $str202$_LS = makeString("-LS");

    private static final SubLObject $$logicalSchemaFieldTypeList = reader_make_constant_shell(makeString("logicalSchemaFieldTypeList"));

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLObject $$meaningSentenceOfSchema = reader_make_constant_shell(makeString("meaningSentenceOfSchema"));

    private static final SubLList $list206 = list(makeSymbol("PF"), makeSymbol("LFI"), makeSymbol("CONVERT"));

    private static final SubLObject $$fieldEncoding = reader_make_constant_shell(makeString("fieldEncoding"));

    private static final SubLObject $$sksRepresentationComplete = reader_make_constant_shell(makeString("sksRepresentationComplete"));

    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));

    private static final SubLString $str210$_Pred = makeString("-Pred");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list212 = list(reader_make_constant_shell(makeString("BinaryPredicate")));

    private static final SubLObject $$termDependsOn = reader_make_constant_shell(makeString("termDependsOn"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLObject $$backchainForbidden = reader_make_constant_shell(makeString("backchainForbidden"));

    private static final SubLList $list218 = list(reader_make_constant_shell(makeString("SKSIOnlyPredicate")));

    private static final SubLObject $$backchainRequired = reader_make_constant_shell(makeString("backchainRequired"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLList $list221 = list(makeSymbol("?X"), makeSymbol("?Y"));



    private static final SubLObject $$ThePhysicalFieldValueFn = reader_make_constant_shell(makeString("ThePhysicalFieldValueFn"));

    private static final SubLObject $$PhysicalFieldFn = reader_make_constant_shell(makeString("PhysicalFieldFn"));

    private static final SubLList $list225 = list(reader_make_constant_shell(makeString("Lambda")), list(makeSymbol("?LFI")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("QuantityConversionFn")), makeKeyword("OPERATOR"), makeSymbol("?LFI"))));



    private static final SubLString $str227$No_implementation_yet_for_LF_conv = makeString("No implementation yet for LF conversion pattern ~A.");

    private static final SubLList $list228 = list(reader_make_constant_shell(makeString("Lambda")), list(makeSymbol("?PFI")), list(makeKeyword("OPERATOR"), makeSymbol("?PFI")));

    private static final SubLString $str229$No_implementation_yet_for_PF_conv = makeString("No implementation yet for PF conversion pattern ~A.");

    private static final SubLSymbol SKSI_SMT_COLUMN_OR_FORT_NAME = makeSymbol("SKSI-SMT-COLUMN-OR-FORT-NAME");

    private static final SubLSymbol $sksi_smt_column_or_fort_name_caching_state$ = makeSymbol("*SKSI-SMT-COLUMN-OR-FORT-NAME-CACHING-STATE*");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLString $str233$Edit_Logical_Schema__ = makeString("Edit Logical Schema: ");

    private static final SubLString $str234$Logical_fields_ = makeString("Logical fields:");

    private static final SubLString $$$CycL = makeString("CycL");

    private static final SubLString $$$Field_isa = makeString("Field isa");

    private static final SubLString $str237$__user_MS_s = makeString("# user MS's");





    private static final SubLSymbol $COMMAND_EDIT_LF = makeKeyword("COMMAND-EDIT-LF");

    private static final SubLString $$$Delete = makeString("Delete");



    private static final SubLString $str243$No_fields_in_this_logical_schema_ = makeString("No fields in this logical schema.");

    private static final SubLString $$$Add_logical_field = makeString("Add logical field");

    private static final SubLString $str245$Meaning_sentences_ = makeString("Meaning sentences:");

    private static final SubLSymbol $COMMAND_EDIT_MS = makeKeyword("COMMAND-EDIT-MS");





    private static final SubLString $str249$No_meaning_sentences_in_this_logi = makeString("No meaning sentences in this logical schema.");

    private static final SubLString $str250$ = makeString("");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$Add_meaning_sentence = makeString("Add meaning sentence");

    private static final SubLString $str253$Edit_Logical_Field__ = makeString("Edit Logical Field: ");

    private static final SubLString $str254$Editing_this_field_will_automatic = makeString("Editing this field will automatically convert it into a constant.");

    private static final SubLString $str255$Logical_field_ = makeString("Logical field:");





    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLString $$$Change = makeString("Change");







    private static final SubLString $$$Add_isa = makeString("Add isa");



    private static final SubLObject $$fieldIsa = reader_make_constant_shell(makeString("fieldIsa"));

    private static final SubLString $str268$Edit_Translation_Schema__ = makeString("Edit Translation Schema: ");

    private static final SubLString $str269$_A__A = makeString("~A?~A");

    private static final SubLString $str270$___ = makeString(" & ");

    private static final SubLString $str271$_note__editing_is_not_yet_enabled = makeString("@note: editing is not yet enabled");



    private static final SubLString $str273$___ = makeString("<->");



    private static final SubLInteger $int$50 = makeInteger(50);



    private static final SubLString $str277$Edit_Meaning_Sentence_in__ = makeString("Edit Meaning Sentence in: ");







    private static final SubLString $str281$Formula_invalid_ = makeString("Formula invalid.");

    private static final SubLString $str282$Formula_wasn_t_changed_ = makeString("Formula wasn't changed.");





    private static final SubLString $str285$Select_Database_Tables_to_Decode_ = makeString("Select Database Tables to Decode for ");

    private static final SubLString $str286$__ = makeString(" :");

    private static final SubLList $list287 = list(makeSymbol("SCHEMA-NAME"), makeSymbol("TABLE-DETAILS"));

    private static final SubLSymbol $sym288$STRING_ = makeSymbol("STRING=");



    private static final SubLString $$$Schema_ = makeString("Schema ");

    private static final SubLString $str291$__ = makeString(": ");

    private static final SubLString $$$Show = makeString("Show");

    private static final SubLString $$$Hide = makeString("Hide");





    private static final SubLString $$$Table_Name = makeString("Table Name");

    private static final SubLString $$$Physical_Schemata = makeString("Physical Schemata");



    private static final SubLSymbol SKS_P = makeSymbol("SKS-P");

    private static final SubLObject $$sksSourceDescriptionMt = reader_make_constant_shell(makeString("sksSourceDescriptionMt"));

    private static final SubLObject $$MappingMtFn = reader_make_constant_shell(makeString("MappingMtFn"));

    private static final SubLObject $$SKSISourceDescriptionMicrotheory = reader_make_constant_shell(makeString("SKSISourceDescriptionMicrotheory"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLString $str304$_KS = makeString("-KS");

    private static final SubLString $$$PhysicalSchemaMt = makeString("PhysicalSchemaMt");

    private static final SubLObject $const306$SKSIPhysicalSchemaDescriptionMicr = reader_make_constant_shell(makeString("SKSIPhysicalSchemaDescriptionMicrotheory"));

    private static final SubLObject $$sksLogicalSchemaDescriptionMt = reader_make_constant_shell(makeString("sksLogicalSchemaDescriptionMt"));

    private static final SubLObject $$sksSchemaTranslationMt = reader_make_constant_shell(makeString("sksSchemaTranslationMt"));

    private static final SubLObject $$contentMt = reader_make_constant_shell(makeString("contentMt"));

    private static final SubLObject $$bridgingMtForKS = reader_make_constant_shell(makeString("bridgingMtForKS"));



    private static final SubLSymbol $sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__ = makeSymbol("*SKSI-SMT-WARN-ABOUT-INVARIANTS?*");

    private static final SubLString $str313$SMT_invariant_broken___A_is_not_a = makeString("SMT invariant broken: ~A is not an instance of ~A");

    private static final SubLSymbol SKSI_SOURCE_DESCRIPTION_P = makeSymbol("SKSI-SOURCE-DESCRIPTION-P");

    private static final SubLSymbol SKSI_PHYSICAL_SCHEMABASE_P = makeSymbol("SKSI-PHYSICAL-SCHEMABASE-P");

    private static final SubLSymbol SKSI_PHYSICAL_SCHEMA_P = makeSymbol("SKSI-PHYSICAL-SCHEMA-P");

    private static final SubLObject $$schemaFieldNameList = reader_make_constant_shell(makeString("schemaFieldNameList"));

    private static final SubLSymbol SKSI_PHYSICAL_FIELD_P = makeSymbol("SKSI-PHYSICAL-FIELD-P");

    private static final SubLObject $$fieldName_SKS = reader_make_constant_shell(makeString("fieldName-SKS"));

    private static final SubLObject $$fieldDataType = reader_make_constant_shell(makeString("fieldDataType"));

    private static final SubLObject $$nonNullFields = reader_make_constant_shell(makeString("nonNullFields"));

    private static final SubLObject $$defaultFieldValue = reader_make_constant_shell(makeString("defaultFieldValue"));

    private static final SubLObject $$primaryKey = reader_make_constant_shell(makeString("primaryKey"));

    private static final SubLList $list324 = list(makeSymbol("THE-LIST"), makeSymbol("&REST"), makeSymbol("KEYS"));

    private static final SubLString $str325$Incapable_of_dealing_with_structu = makeString("Incapable of dealing with structure of #$primaryKey assertion: ~A");

    private static final SubLSymbol SKSI_PF_GET_NAME = makeSymbol("SKSI-PF-GET-NAME");





    private static final SubLObject $const329$SKSILogicalSchemaDescriptionMicro = reader_make_constant_shell(makeString("SKSILogicalSchemaDescriptionMicrotheory"));

    private static final SubLString $$$LogicalSchemaMt = makeString("LogicalSchemaMt");

    private static final SubLSymbol SKSI_LOGICAL_SCHEMABASE_P = makeSymbol("SKSI-LOGICAL-SCHEMABASE-P");

    private static final SubLString $str332$_LS_ = makeString("-LS-");

    private static final SubLObject $$ObjectDefiningSchema = reader_make_constant_shell(makeString("ObjectDefiningSchema"));

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLObject $$schemaIsa = reader_make_constant_shell(makeString("schemaIsa"));

    private static final SubLSymbol SKSI_LOGICAL_SCHEMA_P = makeSymbol("SKSI-LOGICAL-SCHEMA-P");

    private static final SubLObject $$logicalFields = reader_make_constant_shell(makeString("logicalFields"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sksi_isg$ = makeSymbol("*SKSI-ISG*");

    private static final SubLString $str341$_LF_ = makeString("-LF-");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$IndexicalConcept = reader_make_constant_shell(makeString("IndexicalConcept"));

    private static final SubLSymbol SKSI_LOGICAL_FIELD_P = makeSymbol("SKSI-LOGICAL-FIELD-P");

    private static final SubLObject $$fieldGenls = reader_make_constant_shell(makeString("fieldGenls"));

    private static final SubLSymbol SKSI_MEANING_SENTENCE_P = makeSymbol("SKSI-MEANING-SENTENCE-P");

    private static final SubLObject $$SKSISchemaTranslationMicrotheory = reader_make_constant_shell(makeString("SKSISchemaTranslationMicrotheory"));

    private static final SubLString $$$TranslationSchemaMt = makeString("TranslationSchemaMt");

    private static final SubLSymbol SKSI_TRANSLATION_SCHEMABASE_P = makeSymbol("SKSI-TRANSLATION-SCHEMABASE-P");

    private static final SubLSymbol DECODE_PHYSICAL_STRUCTURE_OF_SKS = makeSymbol("DECODE-PHYSICAL-STRUCTURE-OF-SKS");

    private static final SubLSymbol NEW_STRUCTURED_KNOWLEDGE_SOURCE = makeSymbol("NEW-STRUCTURED-KNOWLEDGE-SOURCE");

    private static final SubLObject $$ContentMtFn = reader_make_constant_shell(makeString("ContentMtFn"));

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLObject $$BridgingMtForKSFn = reader_make_constant_shell(makeString("BridgingMtForKSFn"));

    private static final SubLObject $$SKSIVocabularyMt = reader_make_constant_shell(makeString("SKSIVocabularyMt"));

    private static final SubLSymbol NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA = makeSymbol("NEW-CONCEPTUAL-MAPPING-LOGICAL-SCHEMA");

    private static final SubLString $str357$_CMLS = makeString("-CMLS");

    private static final SubLList $list358 = list(reader_make_constant_shell(makeString("ReifiedMapping")));

    private static final SubLSymbol SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES = makeSymbol("SKSI-SMT-GET-AVAILABLE-DATABASE-TYPES");

    private static final SubLSymbol $sym360$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    private static final SubLObject $$SKSISchemaDescriptionMicrotheory = reader_make_constant_shell(makeString("SKSISchemaDescriptionMicrotheory"));

    private static final SubLSymbol $sym362$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLObject $$subKS_Direct = reader_make_constant_shell(makeString("subKS-Direct"));

    private static final SubLObject $$physicalSchemaSourceMap = reader_make_constant_shell(makeString("physicalSchemaSourceMap"));

    private static final SubLObject $$physicalFields = reader_make_constant_shell(makeString("physicalFields"));



    private static final SubLObject $$enumerableSchema = reader_make_constant_shell(makeString("enumerableSchema"));









    private static final SubLSymbol SKSI_PSB_GET_LABELED_SCHEMATA = makeSymbol("SKSI-PSB-GET-LABELED-SCHEMATA");

    private static final SubLObject $$schemaName_SKS = reader_make_constant_shell(makeString("schemaName-SKS"));

    private static final SubLObject $$schemaNameSchema_SKS = reader_make_constant_shell(makeString("schemaNameSchema-SKS"));

    private static final SubLList $list375 = list(makeSymbol("PS"), makeSymbol("LSS"));

    private static final SubLSymbol $sym376$FORT_NAME_ = makeSymbol("FORT-NAME<");

    public static SubLObject cb_link_edit_in_smt(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $allow_smt_editing_links$.getDynamicValue(thread)) {
            if (NIL == linktext) {
                linktext = $str0$_Edit_in_SMT_;
            }
            final SubLObject href = cconcatenate($str1$http___, new SubLObject[]{ format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_host()), $str2$_, format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_port()), $str3$_SchemaModelingTool__sksName_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(index_hook)), $str4$_cyc_server_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), $str2$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)), $str5$_cyc_defaultCyclist_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(operation_communication.the_cyclist())) });
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$Will_open_in_new_browser_window);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str7$_blank);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return index_hook;
    }

    public static SubLObject smt_edit_button(final SubLObject sks, SubLObject button_text) {
        if (button_text == UNPROVIDED) {
            button_text = $$$Edit;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject href = cconcatenate($str1$http___, new SubLObject[]{ format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_host()), $str2$_, format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_port()), $str3$_SchemaModelingTool__sksName_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(sks)), $str4$_cyc_server_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), $str2$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)), $str5$_cyc_defaultCyclist_, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(operation_communication.the_cyclist())) });
        final SubLObject onclick = cconcatenate($str11$window_open__, new SubLObject[]{ format_nil.format_nil_a_no_copy(href), $str12$___ });
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($BUTTON);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != button_text) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(button_text);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != onclick) {
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onclick);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return sks;
    }

    public static SubLObject cb_link_smt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$CMT;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str16$sksi_smt);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject sksi_smt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        sksi_smt_int(arghash);
        return NIL;
    }

    public static SubLObject sksi_smt_int(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != html_arghash.arghash_p(arghash) : "html_arghash.arghash_p(arghash) " + "CommonSymbols.NIL != html_arghash.arghash_p(arghash) " + arghash;
        SubLObject button_clickedP = NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_keys(arghash);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (key.isCons()) {
                final SubLObject command_key = key.first();
                final SubLObject command_args = key.rest();
                final SubLObject command_to_key = make_keyword(string_utilities.replace_substring_once(string_utilities.string_from_keyword(command_key), $$$COMMAND, $$$TO, UNPROVIDED));
                button_clickedP = command_key;
                SubLObject remainder;
                SubLObject arghash_key;
                SubLObject arghash_value;
                for (remainder = NIL, remainder = command_args; NIL != remainder; remainder = cddr(remainder)) {
                    arghash_key = remainder.first();
                    arghash_value = cadr(remainder);
                    html_arghash.set_arghash_value(arghash_key, arghash, arghash_value);
                }
                html_arghash.set_arghash_value(command_to_key, arghash, T);
                html_arghash.rem_arghash_value(key, arghash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        if (NIL != html_arghash.get_arghash_value($ON_EDIT_SKS, arghash)) {
            arghash = sksi_smt_edit_sks_actions(arghash);
        } else
            if (NIL != html_arghash.get_arghash_value($ON_EDIT_SD, arghash)) {
                arghash = sksi_smt_edit_sd_actions(arghash);
            } else
                if (NIL != html_arghash.get_arghash_value($ON_EDIT_PS, arghash)) {
                    arghash = sksi_smt_edit_ps_actions(arghash);
                } else
                    if (NIL != html_arghash.get_arghash_value($ON_EDIT_LS, arghash)) {
                        arghash = sksi_smt_edit_ls_actions(arghash);
                    } else
                        if (NIL != html_arghash.get_arghash_value($ON_EDIT_LF, arghash)) {
                            arghash = sksi_smt_edit_lf_actions(arghash);
                        } else
                            if (NIL != html_arghash.get_arghash_value($ON_EDIT_MS, arghash)) {
                                arghash = sksi_smt_edit_ms_actions(arghash);
                            } else
                                if (NIL != html_arghash.get_arghash_value($ON_DECODE_PSB, arghash)) {
                                    arghash = sksi_smt_decode_psb_actions(arghash);
                                } else
                                    if (NIL != html_arghash.get_arghash_value($ON_EDIT_TS, arghash)) {
                                        arghash = sksi_smt_edit_ts_actions(arghash);
                                    } else
                                        if (NIL != html_arghash.get_arghash_value($ON_EDIT_T, arghash)) {
                                            arghash = sksi_smt_edit_t_actions(arghash);
                                        } else
                                            if (NIL != html_arghash.get_arghash_value($ON_MAIN, arghash)) {
                                                arghash = sksi_smt_main_actions(arghash);
                                            }









        html_markup($str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            sksi_smt_macros.sksi_smt_html_title($$$Schema_Modeling_Tool);
            html_complete.html_complete_script();
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            dhtml_macros.html_basic_cb_scripts();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str40$cg_sksi_smt);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Schema_Modeling_Tool);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str16$sksi_smt, T, UNPROVIDED);
                        SubLObject fort_selectedP = NIL;
                        final SubLObject fort = html_arghash.get_arghash_value($JUST_FORT, arghash);
                        if (NIL != forts.fort_p(fort)) {
                            fort_selectedP = fort;
                            if (NIL != isa.isa_in_any_mtP(fort, $$StructuredKnowledgeSource)) {
                                html_arghash.set_arghash_value($SKS, arghash, fort);
                                html_arghash.set_arghash_value($TO_EDIT_SKS, arghash, T);
                            } else
                                if (NIL != isa.isa_in_any_mtP(fort, $$PhysicalSchema)) {
                                    html_arghash.set_arghash_value($PS, arghash, fort);
                                    html_arghash.set_arghash_value($TO_EDIT_PS, arghash, T);
                                } else
                                    if (NIL != isa.isa_in_any_mtP(fort, $$LogicalSchema)) {
                                        html_arghash.set_arghash_value($LS, arghash, fort);
                                        html_arghash.set_arghash_value($TO_EDIT_LS, arghash, T);
                                    } else
                                        if (NIL != isa.isa_in_any_mtP(fort, $$PhysicalField)) {
                                            html_arghash.set_arghash_value($PF, arghash, fort);
                                            html_arghash.set_arghash_value($TO_EDIT_PF, arghash, T);
                                        } else
                                            if (NIL != isa.isa_in_any_mtP(fort, $$LogicalField)) {
                                                html_arghash.set_arghash_value($LF, arghash, fort);
                                                html_arghash.set_arghash_value($TO_EDIT_LF, arghash, T);
                                            } else {
                                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ($str58$Error__Support_for_term_);
                                                    sksi_form(fort);
                                                    html_princ($$$_not_implemented);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                                }
                                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                            }




                        }
                        html_arghash.rem_arghash_value($JUST_FORT, arghash);
                        SubLObject cdolist_list_var2 = html_arghash.get_arghash_value_list($ERROR, arghash);
                        SubLObject error = NIL;
                        error = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            html_arghash.rem_arghash_value($ERROR, arghash);
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str61$Error__);
                                apply(FORMAT, cons(html_macros.$html_stream$.getDynamicValue(thread), error));
                                html_newline(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            error = cdolist_list_var2.first();
                        } 
                        cdolist_list_var2 = html_arghash.get_arghash_value_list($SUCCESS, arghash);
                        SubLObject success = NIL;
                        success = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            html_arghash.rem_arghash_value($SUCCESS, arghash);
                            html_princ($str64$Success__);
                            apply(FORMAT, cons(html_macros.$html_stream$.getDynamicValue(thread), success));
                            html_newline(UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            success = cdolist_list_var2.first();
                        } 
                        if (NIL != html_arghash.get_arghash_value($TO_EDIT_SKS, arghash)) {
                            html_arghash.rem_arghash_value($TO_EDIT_SKS, arghash);
                            sksi_smt_edit_sks_page(arghash);
                        } else
                            if (NIL != html_arghash.get_arghash_value($TO_EDIT_SD, arghash)) {
                                html_arghash.rem_arghash_value($TO_EDIT_SD, arghash);
                                sksi_smt_edit_sd_page(arghash);
                            } else
                                if (NIL != html_arghash.get_arghash_value($TO_EDIT_PS, arghash)) {
                                    html_arghash.rem_arghash_value($TO_EDIT_PS, arghash);
                                    sksi_smt_edit_ps_page(arghash);
                                } else
                                    if (NIL != html_arghash.get_arghash_value($TO_EDIT_LS, arghash)) {
                                        html_arghash.rem_arghash_value($TO_EDIT_LS, arghash);
                                        sksi_smt_edit_ls_page(arghash);
                                    } else
                                        if (NIL != html_arghash.get_arghash_value($TO_EDIT_LF, arghash)) {
                                            html_arghash.rem_arghash_value($TO_EDIT_LF, arghash);
                                            sksi_smt_edit_lf_page(arghash);
                                        } else
                                            if (NIL != html_arghash.get_arghash_value($TO_EDIT_MS, arghash)) {
                                                html_arghash.rem_arghash_value($TO_EDIT_MS, arghash);
                                                sksi_smt_edit_ms_page(arghash);
                                            } else
                                                if (NIL != html_arghash.get_arghash_value($TO_EDIT_TS, arghash)) {
                                                    html_arghash.rem_arghash_value($TO_EDIT_TS, arghash);
                                                    sksi_smt_edit_ts_page(arghash);
                                                } else
                                                    if (NIL != html_arghash.get_arghash_value($TO_EDIT_T, arghash)) {
                                                        html_arghash.rem_arghash_value($TO_EDIT_T, arghash);
                                                        sksi_smt_edit_t_page(arghash);
                                                    } else
                                                        if (NIL != html_arghash.get_arghash_value($TO_MAIN, arghash)) {
                                                            html_arghash.rem_arghash_value($TO_MAIN, arghash);
                                                            sksi_smt_main_page(arghash);
                                                        } else
                                                            if (NIL != html_arghash.get_arghash_value($TO_DECODE_PSB, arghash)) {
                                                                html_arghash.rem_arghash_value($TO_DECODE_PSB, arghash);
                                                                sksi_smt_decode_psb_page(arghash);
                                                            } else {
                                                                if (NIL != button_clickedP) {
                                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_princ($str71$Error__button_);
                                                                        html_princ(button_clickedP);
                                                                        html_princ($$$_not_implemented);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                }
                                                                if (NIL != html_arghash.get_arghash_value($ON_EDIT_SKS, arghash)) {
                                                                    sksi_smt_edit_sks_page(arghash);
                                                                } else
                                                                    if (NIL != html_arghash.get_arghash_value($ON_EDIT_SD, arghash)) {
                                                                        sksi_smt_edit_sd_page(arghash);
                                                                    } else
                                                                        if (NIL != html_arghash.get_arghash_value($ON_EDIT_PS, arghash)) {
                                                                            sksi_smt_edit_ps_page(arghash);
                                                                        } else
                                                                            if (NIL != html_arghash.get_arghash_value($ON_EDIT_LS, arghash)) {
                                                                                sksi_smt_edit_ls_page(arghash);
                                                                            } else
                                                                                if (NIL != html_arghash.get_arghash_value($ON_EDIT_LF, arghash)) {
                                                                                    sksi_smt_edit_lf_page(arghash);
                                                                                } else
                                                                                    if (NIL != html_arghash.get_arghash_value($ON_EDIT_MS, arghash)) {
                                                                                        sksi_smt_edit_ms_page(arghash);
                                                                                    } else
                                                                                        if (NIL != html_arghash.get_arghash_value($ON_EDIT_TS, arghash)) {
                                                                                            sksi_smt_edit_ts_page(arghash);
                                                                                        } else
                                                                                            if (NIL != html_arghash.get_arghash_value($ON_EDIT_T, arghash)) {
                                                                                                sksi_smt_edit_t_page(arghash);
                                                                                            } else
                                                                                                if (NIL != html_arghash.get_arghash_value($ON_MAIN, arghash)) {
                                                                                                    sksi_smt_main_page(arghash);
                                                                                                } else
                                                                                                    if (NIL != html_arghash.get_arghash_value($ON_DECODE_PSB, arghash)) {
                                                                                                        sksi_smt_decode_psb_page(arghash);
                                                                                                    } else {
                                                                                                        if (NIL != fort_selectedP) {
                                                                                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                                            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                                                                                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            }
                                                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                                                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_princ($str72$Error__fort_type_for_);
                                                                                                                sksi_form(html_arghash.get_arghash_value($JUST_FORT, arghash));
                                                                                                                html_princ($$$_not_supported);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                                                                                            }
                                                                                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                                        }
                                                                                                        sksi_smt_main_page(arghash);
                                                                                                    }









                                                            }









                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_main_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_MAIN, T, UNPROVIDED);
        final SubLObject skss = sksi_sks_accessors.get_all_skss();
        final SubLObject sdss = get_all_sds();
        final SubLObject psbs = get_all_psbs();
        final SubLObject lsbs = get_all_lsbs();
        final SubLObject tsbs = get_all_tsbs();
        SubLObject used_sds = NIL;
        SubLObject used_psbs = NIL;
        SubLObject used_lsbs = NIL;
        SubLObject used_tsbs = NIL;
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(SIX_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str74$Create_new_SKS_named__);
                    html_arghash.html_arghash_text_input(arghash, $NEW_SKS_NAME, NIL, $int$40, UNPROVIDED);
                    html_arghash.html_arghash_submit_input(arghash, $$$Create, list($COMMAND_EDIT_SKS, T), UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str79$Knowledge_Source_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject cdolist_list_var = skss;
            SubLObject sks = NIL;
            sks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sd = sks_get_source_description_mt(sks);
                final SubLObject psb = sks_get_physical_schemabase_mt(sks);
                final SubLObject lsb = sks_get_logical_schemabase_mt(sks);
                final SubLObject tsb = sks_get_translation_schemabase_mt(sks);
                SubLObject item_var = sd;
                if (NIL == member(item_var, used_sds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    used_sds = cons(item_var, used_sds);
                }
                item_var = psb;
                if (NIL == member(item_var, used_psbs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    used_psbs = cons(item_var, used_psbs);
                }
                item_var = lsb;
                if (NIL == member(item_var, used_lsbs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    used_lsbs = cons(item_var, used_lsbs);
                }
                item_var = tsb;
                if (NIL == member(item_var, used_tsbs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    used_tsbs = cons(item_var, used_tsbs);
                }
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != sks) {
                            sksi_form(sks);
                        } else {
                            html_glyph($NBSP, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != sks) {
                            if (NIL != $allow_smt_editing_links$.getDynamicValue(thread)) {
                                smt_edit_button(sks, UNPROVIDED);
                            } else {
                                html_arghash.html_arghash_submit_input(arghash, $$$Edit, list($COMMAND_EDIT_SKS, $SKS, sks), UNPROVIDED);
                            }
                        } else {
                            html_glyph($NBSP, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != sd) {
                            html_princ($str82$Source_Description__);
                            sksi_arghash_form(arghash, sd);
                            html_newline(UNPROVIDED);
                        }
                        if (NIL != psb) {
                            html_princ($str83$Physical_Schemabase__);
                            sksi_arghash_form(arghash, psb);
                            html_newline(UNPROVIDED);
                        }
                        if (NIL != lsb) {
                            html_princ($str84$Logical_Schemabase__);
                            sksi_arghash_form(arghash, lsb);
                            html_newline(UNPROVIDED);
                        }
                        if (NIL != tsb) {
                            html_princ($str85$Translation_Schemabase__);
                            sksi_arghash_form(arghash, tsb);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                sks = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        final SubLObject other_psbs = set_difference(psbs, used_psbs, UNPROVIDED, UNPROVIDED);
        if (NIL != other_psbs) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str86$Other_Physical_Schemabases_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var2 = other_psbs;
                SubLObject psb2 = NIL;
                psb2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != psb2) {
                                sksi_arghash_form(arghash, psb2);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    psb2 = cdolist_list_var2.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        final SubLObject other_lsbs = set_difference(lsbs, used_lsbs, UNPROVIDED, UNPROVIDED);
        if (NIL != other_lsbs) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str87$Other_Logical_Schemabases_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var2 = other_lsbs;
                SubLObject lsb2 = NIL;
                lsb2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != lsb2) {
                                sksi_arghash_form(arghash, lsb2);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    lsb2 = cdolist_list_var2.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        final SubLObject other_tsbs = set_difference(tsbs, used_tsbs, UNPROVIDED, UNPROVIDED);
        if (NIL != other_tsbs) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str88$Other_Translations_Schemabases_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var2 = other_tsbs;
                SubLObject tsb2 = NIL;
                tsb2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != tsb2) {
                                sksi_arghash_form(arghash, tsb2);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    tsb2 = cdolist_list_var2.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject sksi_smt_main_actions(final SubLObject arghash) {
        if (NIL != html_arghash.get_arghash_value($TO_EDIT_SKS, arghash)) {
            SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
            if (NIL == sks) {
                final SubLObject new_sks_name = html_arghash.get_arghash_value($NEW_SKS_NAME, arghash);
                html_arghash.rem_arghash_value($NEW_SKS_NAME, arghash);
                if (NIL != string_utilities.empty_stringP(new_sks_name)) {
                    html_arghash.push_arghash_value($ERROR, list($ERROR, $str89$Please_enter_an_SKS_name_), arghash);
                    html_arghash.rem_arghash_value($TO_EDIT_SKS, arghash);
                    html_arghash.set_arghash_value($TO_MAIN, arghash, T);
                } else {
                    sks = sksi_sks_accessors.new_sks_complex(new_sks_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sks_new_sd(sks);
                    html_arghash.set_arghash_value($SKS, arghash, sks);
                }
            }
        }
        return arghash;
    }

    public static SubLObject sksi_smt_edit_sks_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_SKS, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        html_arghash.html_arghash_hidden_input(arghash, $SKS, UNPROVIDED, UNPROVIDED);
        final SubLObject sd = sks_get_source_description_mt(sks);
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        final SubLObject lsb = sks_get_logical_schemabase_mt(sks);
        final SubLObject tsb = sks_get_translation_schemabase_mt(sks);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($str90$Edit_SKS__);
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        sksi_form(sks);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        sksi_smt_html_sks_status_line(sks);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($str91$Name__);
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_arghash.html_arghash_text_input(arghash, $SKS_NAMESTRING, sksi_sks_accessors.sks_get_name(sks, $$nameString), $int$80, UNPROVIDED);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str82$Source_Description__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != sd) {
                        sksi_arghash_form(arghash, sd);
                    } else {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != sd) {
                        smt_edit_button(sks, UNPROVIDED);
                    } else {
                        html_arghash.html_arghash_submit_input(arghash, $$$Add, list($COMMAND_EDIT_SD, $SKS, sks), UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str83$Physical_Schemabase__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != psb) {
                        sksi_arghash_form(arghash, psb);
                    } else {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, sksi_sd_get_mt(sd))) {
                        html_arghash.html_arghash_submit_input(arghash, $$$Decode, list($COMMAND_EDIT_SKS, $SKS, sks, $DECODE_PSB, T), UNPROVIDED);
                    }
                    if (NIL != psb) {
                        html_arghash.html_arghash_submit_input(arghash, $$$Remove, list($COMMAND_EDIT_SKS, $SKS, sks, $REMOVE_PSB, T), UNPROVIDED);
                    }
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str84$Logical_Schemabase__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != lsb) {
                        sksi_arghash_form(arghash, lsb);
                    } else {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != lsb) {
                        html_arghash.html_arghash_submit_input(arghash, $$$Remove, list($COMMAND_REMOVE_LSB, $SKS, sks, $LSB, lsb), UNPROVIDED);
                    } else {
                        html_arghash.html_arghash_submit_input(arghash, $$$Create, list($COMMAND_EDIT_LSB, $SKS, sks), UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str85$Translation_Schemabase__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != tsb) {
                        sksi_arghash_form(arghash, tsb);
                    } else {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != tsb) {
                        html_arghash.html_arghash_submit_input(arghash, $$$Remove, list($COMMAND_REMOVE_TSB, $SKS, sks, $TSB, tsb), UNPROVIDED);
                    } else {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        sksi_smt_edit_sks_page_main_table(arghash, sks, sd, psb, lsb, tsb);
        html_newline(TWO_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, $$$Refresh, $REFRESH, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$OK, $OK, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Cancel, $TO_MAIN, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_sks_page_main_table(final SubLObject arghash, final SubLObject sks, SubLObject sd, SubLObject psb, SubLObject lsb, SubLObject tsb) {
        if (sd == UNPROVIDED) {
            sd = NIL;
        }
        if (psb == UNPROVIDED) {
            psb = NIL;
        }
        if (lsb == UNPROVIDED) {
            lsb = NIL;
        }
        if (tsb == UNPROVIDED) {
            tsb = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject physical_schemata = (NIL != psb) ? sksi_psb_get_schemata(psb) : NIL;
        SubLObject logical_schemata = (NIL != lsb) ? sksi_lsb_get_schemata(lsb) : NIL;
        final SubLObject translations = (NIL != tsb) ? sksi_tsb_get_translation_pairs(tsb) : NIL;
        if (((NIL != physical_schemata) || (NIL != logical_schemata)) || (NIL != translations)) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ONE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($LEFT);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str113$Physical_Schemata_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str114$Logical_Schemata_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str115$Translations_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var = physical_schemata;
                SubLObject ps = NIL;
                ps = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject ls = list_utilities.alist_lookup(translations, ps, UNPROVIDED, UNPROVIDED).first();
                    if (NIL != ls) {
                        logical_schemata = remove(ls, logical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($LEFT);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_arghash_form(arghash, ps);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_arghash.html_arghash_submit_input(arghash, $$$View, list($COMMAND_EDIT_PS, $SKS, sks, $PS, ps), UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != ls) {
                                sksi_arghash_form(arghash, ls);
                            } else {
                                html_glyph($NBSP, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != ls) {
                                html_arghash.html_arghash_submit_input(arghash, $$$Edit, list($COMMAND_EDIT_LS, $SKS, sks, $LS, ls), UNPROVIDED);
                            } else {
                                html_arghash.html_arghash_submit_input(arghash, $$$Create, list($COMMAND_EDIT_LS, $SKS, sks, $PS, ps), UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != ls) {
                                html_arghash.html_arghash_submit_input(arghash, $$$Edit, list($COMMAND_EDIT_TS, $SKS, sks, $PS, ps, $LS, ls), UNPROVIDED);
                            } else {
                                html_glyph($NBSP, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ps = cdolist_list_var.first();
                } 
                cdolist_list_var = logical_schemata;
                SubLObject logical_schema = NIL;
                logical_schema = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($LEFT);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_arghash_form(arghash, logical_schema);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    logical_schema = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject sksi_smt_edit_sks_actions(final SubLObject arghash) {
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject new_sks_namestring = html_arghash.get_arghash_value($SKS_NAMESTRING, arghash);
        if (!sksi_sks_accessors.sks_get_name(sks, $$nameString).equal(new_sks_namestring)) {
            sksi_sks_accessors.sks_fset(sks, $$nameString, new_sks_namestring, UNPROVIDED);
        }
        if (NIL != html_arghash.get_arghash_value($REMOVE_PSB, arghash)) {
            html_arghash.rem_arghash_value($REMOVE_PSB, arghash);
            sksi_sks_accessors.sks_fset(sks, $$sksPhysicalSchemaDescriptionMt, NIL, $$UniversalVocabularyMt);
        }
        if (NIL != html_arghash.get_arghash_value($DECODE_PSB, arghash)) {
            html_arghash.rem_arghash_value($DECODE_PSB, arghash);
            html_arghash.rem_arghash_value($ON_EDIT_SKS, arghash);
            html_arghash.rem_arghash_value($TO_EDIT_SKS, arghash);
            html_arghash.rem_arghash_value($TO_MAIN, arghash);
            html_arghash.set_arghash_value($TO_DECODE_PSB, arghash, T);
        } else
            if (NIL != html_arghash.get_arghash_value($REFRESH, arghash)) {
                html_arghash.rem_arghash_value($REFRESH, arghash);
                html_arghash.set_arghash_value($TO_EDIT_SKS, arghash, T);
            } else
                if (NIL != html_arghash.get_arghash_value($OK, arghash)) {
                    html_arghash.rem_arghash_value($OK, arghash);
                    html_arghash.rem_arghash_value($ON_EDIT_SKS, arghash);
                    html_arghash.set_arghash_value($TO_MAIN, arghash, T);
                }


        return arghash;
    }

    public static SubLObject sksi_smt_html_sks_status_line(final SubLObject sks) {
        final SubLObject sd = sks_get_sd(sks);
        final SubLObject sd_mt = sksi_sd_get_mt(sd);
        html_princ($$$This_SKS_is_currently_);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        if (NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, sd_mt)) {
            html_princ($$$accessible);
        } else {
            html_princ($$$not_accessible);
        }
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_princ($str126$_);
        html_newline(TWO_INTEGER);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_sd_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_SD, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject sd = html_arghash.get_arghash_value($SD, arghash);
        final SubLObject sd_mt = sksi_sd_get_mt(sd);
        html_arghash.html_arghash_hidden_input(arghash, $SKS, UNPROVIDED, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $SD, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str128$Edit_Source_Description__);
        sksi_form(sks);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        sksi_smt_html_sks_status_line(sks);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Parameter);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Value);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
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
            for (remainder = NIL, remainder = $sksi_smt_sd_parameters$.getGlobalValue(); NIL != remainder; remainder = cddr(remainder)) {
                predicate = remainder.first();
                type = cadr(remainder);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        sksi_form(predicate);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != genls.genl_in_any_mtP(type, $$CharacterString)) {
                            html_arghash.html_arghash_text_input(arghash, predicate, sksi_sks_accessors.sks_fget(sks, predicate, sd_mt), $int$40, UNPROVIDED);
                        } else
                            if (NIL != genls.genl_in_any_mtP(type, $$Integer)) {
                                html_arghash.html_arghash_text_input(arghash, predicate, sksi_sks_accessors.sks_fget(sks, predicate, sd_mt), $int$40, $INTEGER);
                            } else
                                if (NIL != forts.fort_p(type)) {
                                    html_arghash.set_arghash_value(predicate, arghash, sksi_sks_accessors.sks_fget(sks, predicate, sd_mt));
                                    key_string = html_arghash.arghash_make_key_string(predicate, $FORT);
                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(key_string);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        value = NIL;
                                        value_$72 = NIL;
                                        value_string = NIL;
                                        value_string_$73 = NIL;
                                        value = isa.all_fort_instances_in_all_mts(type);
                                        value_$72 = value.first();
                                        value_string = Mapping.mapcar(FORT_NAME, isa.all_fort_instances_in_all_mts(type));
                                        value_string_$73 = value_string.first();
                                        while ((NIL != value_string) || (NIL != value)) {
                                            selected = list_utilities.member_equalP(value_$72, html_arghash.get_arghash_value_list(predicate, arghash));
                                            value_string_$74 = html_arghash.arghash_get_string(value_$72, $FORT);
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (NIL != selected) {
                                                html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (NIL != value_string_$74) {
                                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(value_string_$74);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ(value_string_$73);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            value = value.rest();
                                            value_$72 = value.first();
                                            value_string = value_string.rest();
                                            value_string_$73 = value_string.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                    }
                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                } else {
                                    html_princ(type);
                                }


                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Refresh, $REFRESH, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$OK, $OK, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Cancel, $TO_EDIT_SKS, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_sd_actions(final SubLObject arghash) {
        if ((NIL != html_arghash.get_arghash_value($REFRESH, arghash)) || (NIL != html_arghash.get_arghash_value($OK, arghash))) {
            final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
            final SubLObject sd_mt = sks_get_source_description_mt(sks);
            SubLObject remainder;
            SubLObject predicate;
            SubLObject type;
            SubLObject current_value;
            SubLObject new_value;
            for (remainder = NIL, remainder = $sksi_smt_sd_parameters$.getGlobalValue(); NIL != remainder; remainder = cddr(remainder)) {
                predicate = remainder.first();
                type = cadr(remainder);
                current_value = sksi_sks_accessors.sks_fget(sks, predicate, sd_mt);
                new_value = html_arghash.get_arghash_value(predicate, arghash);
                html_arghash.rem_arghash_value(predicate, arghash);
                if (!current_value.equal(new_value)) {
                    sksi_sks_accessors.sks_fset(sks, predicate, new_value, sd_mt);
                    html_arghash.push_arghash_value($SUCCESS, list($str136$Changed__A__A_from__A_to__A, sks, predicate, current_value, new_value), arghash);
                }
            }
        }
        if (NIL != html_arghash.get_arghash_value($REFRESH, arghash)) {
            html_arghash.set_arghash_value($TO_EDIT_SD, arghash, T);
        } else
            if (NIL != html_arghash.get_arghash_value($OK, arghash)) {
                html_arghash.rem_arghash_value($ON_EDIT_SD, arghash);
                html_arghash.set_arghash_value($TO_EDIT_SKS, arghash, T);
            }

        return arghash;
    }

    public static SubLObject sksi_smt_update_source_description(final SubLObject sks, final SubLObject param_vals) {
        final SubLObject sd = sks_get_source_description_mt(sks);
        SubLObject cdolist_list_var = param_vals;
        SubLObject param_val = NIL;
        param_val = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = param_val;
            SubLObject predicate = NIL;
            SubLObject new_value = NIL;
            destructuring_bind_must_consp(current, datum, $list138);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list138);
            new_value = current.first();
            current = current.rest();
            if (NIL == current) {
                sksi_sks_accessors.sks_fset(sks, predicate, new_value, sd);
            } else {
                cdestructuring_bind_error(datum, $list138);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param_val = cdolist_list_var.first();
        } 
        return sksi_smt_compile_source_description(sks);
    }

    public static SubLObject sksi_smt_compile_source_description(final SubLObject sks) {
        final SubLObject sd = sks_get_source_description_mt(sks);
        final SubLObject param_defs = sksi_smt_compile_param_definitions($sksi_smt_sd_parameters$.getGlobalValue());
        SubLObject param_vals = NIL;
        SubLObject cdolist_list_var = param_defs;
        SubLObject param_def = NIL;
        param_def = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = param_def;
            SubLObject predicate = NIL;
            SubLObject constraint = NIL;
            destructuring_bind_must_consp(current, datum, $list140);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list140);
            constraint = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject value = sksi_sks_accessors.sks_fget(sks, predicate, sd);
                param_vals = cons(list(predicate, constraint, value), param_vals);
            } else {
                cdestructuring_bind_error(datum, $list140);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param_def = cdolist_list_var.first();
        } 
        return nreverse(param_vals);
    }

    public static SubLObject clear_sksi_smt_compile_param_definitions() {
        final SubLObject cs = $sksi_smt_compile_param_definitions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sksi_smt_compile_param_definitions(final SubLObject plist) {
        return memoization_state.caching_state_remove_function_results_with_args($sksi_smt_compile_param_definitions_caching_state$.getGlobalValue(), list(plist), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_smt_compile_param_definitions_internal(final SubLObject plist) {
        SubLObject result = NIL;
        SubLObject remainder;
        SubLObject predicate;
        SubLObject constraint;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            predicate = remainder.first();
            constraint = cadr(remainder);
            if (!predicate.eql($$sksIsa)) {
                if (predicate.eql($$subProtocolForSKS)) {
                    constraint = sdbc.get_all_sdbc_database_sub_protocols();
                } else
                    if (constraint.eql($const144$SKSISupportedDatabaseServerProgra)) {
                        constraint = sksi_smt_get_available_database_types();
                    } else
                        if (!$$Integer.eql(constraint)) {
                            if (!$$CharacterString.eql(constraint)) {
                                Errors.error($str145$Do_not_know_what_to_do_with_const, constraint);
                            }
                        }


            }
            if (!$$sksIsa.eql(predicate)) {
                result = cons(list(predicate, constraint), result);
            }
        }
        return nreverse(result);
    }

    public static SubLObject sksi_smt_compile_param_definitions(final SubLObject plist) {
        SubLObject caching_state = $sksi_smt_compile_param_definitions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKSI_SMT_COMPILE_PARAM_DEFINITIONS, $sksi_smt_compile_param_definitions_caching_state$, NIL, EQL, ONE_INTEGER, TWENTY_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, plist, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sksi_smt_compile_param_definitions_internal(plist)));
            memoization_state.caching_state_put(caching_state, plist, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_smt_register_structured_knowledge_source(final SubLObject sks) {
        enable_sksi_smt_mode();
        return arg2(resetMultipleValues(), multiple_value_list(sksi_sks_manager.register_sksi_removal_modules_for_skses(list(sks))));
    }

    public static SubLObject sksi_smt_structured_knowledge_source_registeredP(final SubLObject sks) {
        return makeBoolean($NOREG != sksi_sks_manager.sks_registration_state(sks));
    }

    public static SubLObject sksi_ps_compile_pfs_info(final SubLObject ps) {
        final SubLObject pfs = sksi_ps_get_pfs(ps);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = pfs;
        SubLObject pf = NIL;
        pf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pf_name = sksi_pf_get_name(pf);
            final SubLObject pf_datatype = sksi_pf_get_datatype(pf);
            final SubLObject pf_nullable = sksi_pf_get_nullable(pf);
            final SubLObject pf_default_value = sksi_pf_get_default_value(pf);
            final SubLObject pf_key_type = sksi_pf_get_key_type(pf);
            result = cons(list(new SubLObject[]{ $PF, pf, $NAME, pf_name, $DATATYPE, pf_datatype, $NULLABLE, pf_nullable, $KEY_TYPE, pf_key_type, $DEFAULT, pf_default_value }), result);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject sksi_smt_edit_ps_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_PS, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject ps = html_arghash.get_arghash_value($PS, arghash);
        html_arghash.html_arghash_hidden_input(arghash, $SKS, sks, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $PS, ps, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str156$Edit_Physical_Schema__);
        sksi_form(sks);
        html_princ($str157$___);
        sksi_arghash_form(arghash, ps);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject pfs = sksi_ps_get_pfs(ps);
        if (NIL != pfs) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str158$Physical_fields_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ONE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Name);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Datatype);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Nullable);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Default_Value);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var = pfs;
                SubLObject pf = NIL;
                pf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pf_name = sksi_pf_get_name(pf);
                    final SubLObject pf_datatype = sksi_pf_get_datatype(pf);
                    final SubLObject pf_nullable = sksi_pf_get_nullable(pf);
                    final SubLObject pf_default_value = sksi_pf_get_default_value(pf);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_form(pf);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_form(pf_name);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_form(pf_datatype);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_form(pf_nullable);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_form(pf_default_value);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    pf = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } else {
            html_princ($str163$No_fields_in_this_physical_schema);
        }
        html_newline(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$OK, $OK, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_ps_actions(final SubLObject arghash) {
        if (NIL != html_arghash.get_arghash_value($OK, arghash)) {
            html_arghash.set_arghash_value($TO_EDIT_SKS, arghash, T);
        }
        return arghash;
    }

    public static SubLObject sksi_smt_logical_field_values_for_logical_schema(final SubLObject ls, final SubLObject arg1_isa, final SubLObject arg2_isa) {
        final SubLObject lf1 = make_ternary_formula($$TheLogicalFieldValueFn, ls, arg1_isa, ONE_INTEGER);
        final SubLObject arg2_num = (arg1_isa.eql(arg2_isa)) ? TWO_INTEGER : ONE_INTEGER;
        return values(lf1, make_ternary_formula($$TheLogicalFieldValueFn, ls, arg2_isa, arg2_num));
    }

    public static SubLObject sksi_smt_fetch_simple_logical_schemata(final SubLObject sks, final SubLObject ps) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        SubLObject lss = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mapping_mt, thread);
            lss = kb_mapping_utilities.pred_values(ps, $$logicalPhysicalSchemaMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lss;
    }

    public static SubLObject sksi_smt_retrieve_simple_logical_schemata(final SubLObject sks, final SubLObject ps) {
        final SubLObject lss = sksi_smt_fetch_simple_logical_schemata(sks, ps);
        SubLObject schemata = NIL;
        SubLObject cdolist_list_var = lss;
        SubLObject ls = NIL;
        ls = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            schemata = cons(list(ls, sksi_smt_retrieve_simple_logical_schema(sks, ps, ls)), schemata);
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
        } 
        return nreverse(schemata);
    }

    public static SubLObject sksi_smt_retrieve_simple_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject ls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = NIL;
        SubLObject pf1 = NIL;
        SubLObject pf2 = NIL;
        SubLObject arg1_isa = NIL;
        SubLObject arg2_isa = NIL;
        SubLObject convert1 = NIL;
        SubLObject convert2 = NIL;
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        final SubLObject coding_pairs = sksi_sks_get_translations(sks, ps, ls, mapping_mt);
        final SubLObject bridging_mt = sks_get_bridging_or_content_mt(sks);
        final SubLObject lfi_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject mss = sksi_ls_get_mss(ls);
        final SubLObject meaning_sentence_assertion = mss.first();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == assertion_handles.assertion_p(meaning_sentence_assertion))) {
            Errors.error($str170$Could_not_retrieve_meaning_senten, ls);
        }
        final SubLObject sentence = assertions_high.gaf_arg2(meaning_sentence_assertion);
        predicate = cycl_utilities.formula_operator(sentence);
        if (NIL != fort_types_interface.mtP(bridging_mt)) {
            final SubLObject base_pred = ask_utilities.query_variable($sym171$_BASE_PRED, list($$correspondingSKSIPredicate, $sym171$_BASE_PRED, predicate, ls), bridging_mt, UNPROVIDED).first();
            if ((NIL != forts.fort_p(base_pred)) && (NIL != fort_types_interface.predicate_p(base_pred))) {
                predicate = base_pred;
            }
        }
        SubLObject list_var = NIL;
        SubLObject lfi = NIL;
        SubLObject index = NIL;
        list_var = cycl_utilities.formula_args(sentence, UNPROVIDED);
        lfi = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , lfi = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject el_lfi = cycl_utilities.hl_to_el(lfi);
            final SubLObject arg_isa = cycl_utilities.formula_arg(el_lfi, TWO_INTEGER, UNPROVIDED);
            map_utilities.map_put(lfi_map, lfi, index);
            final SubLObject pcase_var = index;
            if (pcase_var.eql(ZERO_INTEGER)) {
                arg1_isa = arg_isa;
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    arg2_isa = arg_isa;
                } else {
                    Errors.error($str173$Dont_support_more_than_binary_pre);
                }

        }
        SubLObject cdolist_list_var = coding_pairs;
        SubLObject coding_pair = NIL;
        coding_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = coding_pair;
            SubLObject encoding_ass = NIL;
            SubLObject decoding_ass = NIL;
            destructuring_bind_must_consp(current, datum, $list174);
            encoding_ass = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list174);
            decoding_ass = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sentence2 = fi.assertion_hl_formula(decoding_ass, UNPROVIDED);
                SubLObject current_$89;
                final SubLObject datum_$88 = current_$89 = sentence2;
                SubLObject pred = NIL;
                SubLObject ls_$90 = NIL;
                SubLObject lfi2 = NIL;
                SubLObject ps_$91 = NIL;
                SubLObject pfi_expr = NIL;
                destructuring_bind_must_consp(current_$89, datum_$88, $list175);
                pred = current_$89.first();
                current_$89 = current_$89.rest();
                destructuring_bind_must_consp(current_$89, datum_$88, $list175);
                ls_$90 = current_$89.first();
                current_$89 = current_$89.rest();
                destructuring_bind_must_consp(current_$89, datum_$88, $list175);
                lfi2 = current_$89.first();
                current_$89 = current_$89.rest();
                destructuring_bind_must_consp(current_$89, datum_$88, $list175);
                ps_$91 = current_$89.first();
                current_$89 = current_$89.rest();
                destructuring_bind_must_consp(current_$89, datum_$88, $list175);
                pfi_expr = current_$89.first();
                current_$89 = current_$89.rest();
                if (NIL == current_$89) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$$fieldDecoding.eql(pred))) {
                        Errors.error($str177$Expected___fieldDecoding_sentence, sentence2);
                    }
                    final SubLObject field_index = map_utilities.map_get(lfi_map, lfi2, UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject pf3 = sksi_smt_unpack_decoding_conversion_expression(ps_$91, pfi_expr);
                    final SubLObject conversion = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject pcase_var2 = field_index;
                    if (pcase_var2.eql(ZERO_INTEGER)) {
                        pf1 = pf3;
                        convert1 = conversion;
                    } else
                        if (pcase_var2.eql(ONE_INTEGER)) {
                            pf2 = pf3;
                            convert2 = conversion;
                        } else {
                            Errors.error($str173$Dont_support_more_than_binary_pre);
                        }

                } else {
                    cdestructuring_bind_error(datum_$88, $list175);
                }
            } else {
                cdestructuring_bind_error(datum, $list174);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coding_pair = cdolist_list_var.first();
        } 
        return list($PREDICATE, predicate, $PF1, list($TERM, pf1, $ARG_ISA, arg1_isa, $CONVERT, convert1), $PF2, list($TERM, pf2, $ARG_ISA, arg2_isa, $CONVERT, convert2));
    }

    public static SubLObject sksi_smt_unpack_decoding_conversion_expression(final SubLObject ps, final SubLObject pfi_expr) {
        final SubLObject operator = cycl_utilities.formula_operator(pfi_expr);
        if ($$SchemaObjectFn.eql(operator)) {
            final SubLObject cmls = cycl_utilities.formula_arg1(pfi_expr, UNPROVIDED);
            final SubLObject pfi = cycl_utilities.formula_arg2(pfi_expr, UNPROVIDED);
            return values(sksi_smt_physical_field_for_pfi(pfi), list($$SchemaObjectIDFn, cmls, $$TheTerm));
        }
        if (NIL != lambda_function_p(operator)) {
            final SubLObject pfi2 = cycl_utilities.formula_arg1(pfi_expr, UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = operator;
            SubLObject lambda_operator = NIL;
            SubLObject var_list = NIL;
            SubLObject expression = NIL;
            destructuring_bind_must_consp(current, datum, $list187);
            lambda_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list187);
            var_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list187);
            expression = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject var = var_list.first();
                final SubLObject conversion = list_utilities.tree_substitute(expression, var, $$TheTerm);
                return values(sksi_smt_physical_field_for_pfi(pfi2), conversion);
            }
            cdestructuring_bind_error(datum, $list187);
        } else {
            Errors.error($str188$Do_not_know_how_to_unpack_decodin, pfi_expr);
        }
        return NIL;
    }

    public static SubLObject enable_sksi_smt_mode() {
        $sksi_smt_mode$.setGlobalValue($ENABLED);
        return $sksi_smt_mode$.getGlobalValue();
    }

    public static SubLObject disable_sksi_smt_mode() {
        $sksi_smt_mode$.setGlobalValue($DISABLED);
        return $sksi_smt_mode$.getGlobalValue();
    }

    public static SubLObject is_sksi_smt_mode_enabledP() {
        return eq($ENABLED, $sksi_smt_mode$.getGlobalValue());
    }

    public static SubLObject get_sksi_smt_mode() {
        return NIL != is_sksi_smt_mode_enabledP() ? $ENABLED : $DISABLED;
    }

    public static SubLObject sksi_smt_get_units_of_measurement() {
        final SubLObject unit_map = quantities.get_interconvertible_units_of_measure(SKSI_SMT_UNINTERESTING_UNITS_FILTER_FN);
        final SubLObject unit_type_tuples = sksi_smt_get_rendering_tuples(map_utilities.map_keys(unit_map));
        SubLObject units_of_measurement = NIL;
        SubLObject cdolist_list_var = unit_type_tuples;
        SubLObject unit_type_tuple = NIL;
        unit_type_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject fort = unit_type_tuple.first();
            final SubLObject units = map_utilities.map_get(unit_map, fort, UNPROVIDED);
            final SubLObject units_tuples = sksi_smt_get_rendering_tuples(units);
            final SubLObject result = sksi_smt_assemble_units_result(unit_type_tuple, units_tuples);
            units_of_measurement = cons(result, units_of_measurement);
            cdolist_list_var = cdolist_list_var.rest();
            unit_type_tuple = cdolist_list_var.first();
        } 
        return nreverse(units_of_measurement);
    }

    public static SubLObject sksi_smt_assemble_units_result(final SubLObject header, final SubLObject tail) {
        return cons(header, tail);
    }

    public static SubLObject sksi_smt_uninteresting_units_filter_fn(final SubLObject fort) {
        return rkf_relevance_utilities.rkf_irrelevant_term(fort, $$InferencePSC);
    }

    public static SubLObject sksi_smt_get_rendering_tuples(final SubLObject v_forts) {
        final SubLObject renderings = api_widgets.convert_term_list_to_renderings_for_java(v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = renderings;
        SubLObject rendering = NIL;
        rendering = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rendering;
            SubLObject string_spec = NIL;
            SubLObject fort = NIL;
            destructuring_bind_must_consp(current, datum, $list198);
            string_spec = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list198);
            fort = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject string = string_spec.first();
                results = cons(list(fort, string), results);
            } else {
                cdestructuring_bind_error(datum, $list198);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rendering = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject sksi_smt_derive_simple_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject relation, final SubLObject pf1, final SubLObject arg1_isa, final SubLObject convert1, final SubLObject pf2, final SubLObject arg2_isa, final SubLObject convert2, SubLObject use_original_predicateP) {
        if (use_original_predicateP == UNPROVIDED) {
            use_original_predicateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        final SubLObject bridging_mt = sks_get_bridging_or_content_mt(sks);
        final SubLObject col_name = sksi_smt_determine_dependent_colname(relation, pf1, pf2);
        final SubLObject ls_name = cconcatenate(string_utilities.post_remove(sksi_ps_get_name(ps), $str200$_PS, UNPROVIDED), new SubLObject[]{ $str201$_, col_name, $str202$_LS });
        SubLObject predicate = relation;
        final SubLObject ls = new_or_recycled_logical_schema(sks, ps, ls_name, constants_high.find_constant(ls_name), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject lfi1 = sksi_smt_logical_field_values_for_logical_schema(ls, arg1_isa, arg2_isa);
        final SubLObject lfi2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalSchemaFieldTypeList, ls, make_binary_formula($$TheList, arg1_isa, arg2_isa)), mapping_mt);
        if (NIL == use_original_predicateP) {
            predicate = sksi_smt_derive_indirecting_relation(ls, relation, arg1_isa, arg2_isa, bridging_mt);
        }
        final SubLObject sentence = make_binary_formula(predicate, lfi1, lfi2);
        final SubLObject meaning_sentence = make_binary_formula($$meaningSentenceOfSchema, ls, sentence);
        sksi_kb_accessors.sksi_assert_if_new(meaning_sentence, mapping_mt);
        SubLObject cdolist_list_var;
        final SubLObject tasks = cdolist_list_var = list(list(pf1, lfi1, convert1), list(pf2, lfi2, convert2));
        SubLObject task = NIL;
        task = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = task;
            SubLObject pf3 = NIL;
            SubLObject lfi3 = NIL;
            SubLObject convert3 = NIL;
            destructuring_bind_must_consp(current, datum, $list206);
            pf3 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list206);
            lfi3 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list206);
            convert3 = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pfi = sksi_smt_physical_field_value_indexical_for_pf(pf3);
                final SubLObject lf_conversion = sksi_smt_determine_lf_conversion(lfi3, convert3);
                final SubLObject pf_conversion = sksi_smt_determine_pf_conversion(pfi, convert3);
                sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula($$fieldEncoding, ps, pfi, ls, lf_conversion), mapping_mt);
                sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula($$fieldDecoding, ls, lfi3, ps, pf_conversion), mapping_mt);
            } else {
                cdestructuring_bind_error(datum, $list206);
            }
            cdolist_list_var = cdolist_list_var.rest();
            task = cdolist_list_var.first();
        } 
        sksi_kb_accessors.sksi_assert_if_new(make_unary_formula($$sksRepresentationComplete, sks), $$SKSIMt);
        sksi_smt_register_structured_knowledge_source(sks);
        return ls;
    }

    public static SubLObject sksi_smt_derive_indirecting_relation(final SubLObject ls, final SubLObject relation, final SubLObject arg1_isa, final SubLObject arg2_isa, final SubLObject bridging_mt) {
        final SubLObject pred_name = cconcatenate(string_utilities.post_remove(string_utilities.uncapitalize_first(kb_paths.fort_name(ls)), $str202$_LS, UNPROVIDED), $str210$_Pred);
        final SubLObject predicate = ke.ke_create_now(pred_name, UNPROVIDED);
        sksi_kb_accessors.sksi_assert(listS($$isa, predicate, $list212), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
        sksi_kb_accessors.sksi_assert(list($$termDependsOn, predicate, ls), $$BaseKB, UNPROVIDED, UNPROVIDED);
        sksi_kb_accessors.sksi_assert(list($$arg1Isa, predicate, arg1_isa), $$BaseKB, UNPROVIDED, UNPROVIDED);
        sksi_kb_accessors.sksi_assert(list($$arg2Isa, predicate, arg2_isa), $$BaseKB, UNPROVIDED, UNPROVIDED);
        sksi_kb_accessors.sksi_assert(list($$backchainForbidden, predicate), bridging_mt, UNPROVIDED, UNPROVIDED);
        if (NIL != valid_constant($$correspondingSKSIPredicate, T)) {
            sksi_kb_accessors.sksi_assert(list($$correspondingSKSIPredicate, relation, predicate, ls), bridging_mt, UNPROVIDED, UNPROVIDED);
        } else {
            sksi_kb_accessors.sksi_assert(listS($$isa, predicate, $list218), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            sksi_kb_accessors.sksi_assert(list($$backchainRequired, relation), bridging_mt, UNPROVIDED, UNPROVIDED);
            sksi_kb_accessors.sksi_assert(list($$implies, bq_cons(predicate, $list221), bq_cons(relation, $list221)), bridging_mt, $DEFAULT, $BACKWARD);
        }
        return predicate;
    }

    public static SubLObject sksi_smt_physical_field_value_indexical_for_pf(final SubLObject pf) {
        final SubLObject el_formula = narts_high.nart_el_formula(czer_main.canonicalize_term(pf, UNPROVIDED));
        final SubLObject args = cycl_utilities.formula_args(el_formula, UNPROVIDED);
        return czer_main.canonicalize_term(make_formula($$ThePhysicalFieldValueFn, args, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject sksi_smt_physical_field_for_pfi(final SubLObject pfi) {
        final SubLObject el_formula = cycl_utilities.hl_to_el(czer_main.canonicalize_term(pfi, UNPROVIDED));
        final SubLObject args = cycl_utilities.formula_args(el_formula, UNPROVIDED);
        return czer_main.canonicalize_term(make_formula($$PhysicalFieldFn, args, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject sksi_smt_determine_dependent_colname(final SubLObject relation, final SubLObject pf1, final SubLObject pf2) {
        return sksi_smt_column_or_fort_name(pf2);
    }

    public static SubLObject sksi_smt_determine_lf_conversion(final SubLObject lfi, final SubLObject conversion) {
        final SubLObject operator = cycl_utilities.formula_operator(conversion);
        if ($$SchemaObjectIDFn.eql(operator)) {
            return list_utilities.tree_substitute(conversion, $$TheTerm, lfi);
        }
        if (((NIL != list_utilities.lengthE(conversion, TWO_INTEGER, UNPROVIDED)) && (NIL != forts.fort_p(operator))) && $$TheTerm.eql(cycl_utilities.formula_arg1(conversion, UNPROVIDED))) {
            return make_unary_formula(list_utilities.tree_substitute($list225, $OPERATOR, operator), lfi);
        }
        Errors.error($str227$No_implementation_yet_for_LF_conv, conversion);
        return NIL;
    }

    public static SubLObject sksi_smt_determine_pf_conversion(final SubLObject pfi, final SubLObject conversion) {
        final SubLObject operator = cycl_utilities.formula_operator(conversion);
        if ($$SchemaObjectIDFn.eql(operator)) {
            return list_utilities.tree_substitute(list_utilities.tree_substitute(conversion, $$TheTerm, pfi), $$SchemaObjectIDFn, $$SchemaObjectFn);
        }
        if (((NIL != list_utilities.lengthE(conversion, TWO_INTEGER, UNPROVIDED)) && (NIL != forts.fort_p(operator))) && $$TheTerm.eql(cycl_utilities.formula_arg1(conversion, UNPROVIDED))) {
            return make_unary_formula(list_utilities.tree_substitute($list228, $OPERATOR, operator), pfi);
        }
        Errors.error($str229$No_implementation_yet_for_PF_conv, conversion);
        return NIL;
    }

    public static SubLObject clear_sksi_smt_column_or_fort_name() {
        final SubLObject cs = $sksi_smt_column_or_fort_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sksi_smt_column_or_fort_name(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($sksi_smt_column_or_fort_name_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_smt_column_or_fort_name_internal(final SubLObject v_object) {
        if (NIL != nart_handles.nart_p(v_object)) {
            final SubLObject formula = narts_high.nart_el_formula(v_object);
            if ($$PhysicalFieldFn.eql(cycl_utilities.formula_operator(formula))) {
                return cycl_utilities.formula_arg2(v_object, UNPROVIDED);
            }
        }
        return kb_paths.fort_name(v_object);
    }

    public static SubLObject sksi_smt_column_or_fort_name(final SubLObject v_object) {
        SubLObject caching_state = $sksi_smt_column_or_fort_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKSI_SMT_COLUMN_OR_FORT_NAME, $sksi_smt_column_or_fort_name_caching_state$, NIL, EQL, ONE_INTEGER, $int$200);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sksi_smt_column_or_fort_name_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_smt_edit_ls_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_LS, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject ps = html_arghash.get_arghash_value($PS, arghash);
        final SubLObject ls = (NIL != html_arghash.get_arghash_value($LS, arghash)) ? html_arghash.get_arghash_value($LS, arghash) : new_logical_schema(sks, ps, UNPROVIDED, UNPROVIDED);
        final SubLObject lfs = sksi_ls_get_lfs(ls);
        final SubLObject mss = sksi_ls_get_mss(ls);
        html_arghash.html_arghash_hidden_input(arghash, $SKS, sks, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $LS, ls, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str233$Edit_Logical_Schema__);
        sksi_form(sks);
        html_princ($str157$___);
        sksi_arghash_form(arghash, ls);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        if (NIL != lfs) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str234$Logical_fields_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ONE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$CycL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Field_isa);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str237$__user_MS_s);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject list_var = NIL;
                SubLObject lf = NIL;
                SubLObject counter = NIL;
                list_var = lfs;
                lf = list_var.first();
                for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , lf = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                    final SubLObject lf_cycl = sksi_lf_get_cycl(lf);
                    final SubLObject lf_isas = sksi_lf_get_isas(lf);
                    SubLObject lf_ms_count = ZERO_INTEGER;
                    SubLObject cdolist_list_var = mss;
                    SubLObject ms = NIL;
                    ms = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != sksi_ms_get_asserted(ms)) {
                            final SubLObject ms_cycl = sksi_ms_get_cycl(ms);
                            if (NIL != subl_promotions.memberP(lf_cycl, ms_cycl, UNPROVIDED, UNPROVIDED)) {
                                lf_ms_count = add(lf_ms_count, ONE_INTEGER);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ms = cdolist_list_var.first();
                    } 
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (counter.isZero()) {
                                html_arghash.html_arghash_hidden_input(arghash, $ARG1, lf, UNPROVIDED);
                            } else {
                                html_arghash.html_arghash_checkbox_input(arghash, $ARG2, lf, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            sksi_arghash_form(arghash, lf_cycl);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != lf_isas) {
                                SubLObject cdolist_list_var2 = lf_isas;
                                SubLObject lf_isa = NIL;
                                lf_isa = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    sksi_form(lf_isa);
                                    html_newline(UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    lf_isa = cdolist_list_var2.first();
                                } 
                            } else {
                                html_glyph($NBSP, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(lf_ms_count);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_arghash.html_arghash_submit_input(arghash, $$$Edit, list($COMMAND_EDIT_LF, $SKS, sks, $LS, ls, $LF, lf), UNPROVIDED);
                            html_glyph($NBSP, UNPROVIDED);
                            html_arghash.html_arghash_submit_input(arghash, $$$Delete, list(new SubLObject[]{ $COMMAND_EDIT_LS, $DELETE_LF, lf, $SKS, sks, $LS, ls, $LF, lf }), UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } else {
            html_princ($str243$No_fields_in_this_logical_schema_);
        }
        html_newline(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Add_logical_field, list($COMMAND_EDIT_LF, $SKS, sks, $LS, ls), UNPROVIDED);
        html_newline(TWO_INTEGER);
        if (NIL != mss) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str245$Meaning_sentences_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ONE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$CycL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                    }
                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var3 = mss;
                SubLObject ms2 = NIL;
                ms2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    final SubLObject ms_cycl2 = sksi_ms_get_cycl(ms2);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_assertion_ball(ms2, UNPROVIDED);
                            sksi_form(ms_cycl2);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != sksi_ms_get_asserted(ms2)) {
                                html_arghash.html_arghash_submit_input(arghash, $$$Edit, list($COMMAND_EDIT_MS, $SKS, sks, $LS, ls, $MS, ms2), UNPROVIDED);
                                html_glyph($NBSP, UNPROVIDED);
                                html_arghash.html_arghash_submit_input(arghash, $$$Delete, list(new SubLObject[]{ $COMMAND_EDIT_LS, $DELETE_MS, ms2, $SKS, sks, $LS, ls, $MS, ms2 }), UNPROVIDED);
                            } else {
                                html_glyph($NBSP, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    ms2 = cdolist_list_var3.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } else {
            html_princ($str249$No_meaning_sentences_in_this_logi);
        }
        html_newline(UNPROVIDED);
        html_arghash.html_arghash_text_input(arghash, $PREDICATE, $str250$, $int$60, UNPROVIDED);
        html_indent(ONE_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, $$$Add_meaning_sentence, list($COMMAND_EDIT_MS, $SKS, sks, $LS, ls), UNPROVIDED);
        html_newline(TWO_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, $$$OK, $OK, UNPROVIDED);
        html_indent(UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_ls_actions(final SubLObject arghash) {
        final SubLObject lf = html_arghash.get_arghash_value($LF, arghash);
        final SubLObject ms = html_arghash.get_arghash_value($MS, arghash);
        if (NIL != html_arghash.get_arghash_value($DELETE_LF, arghash)) {
            html_arghash.rem_arghash_value($DELETE_LF, arghash);
            html_arghash.rem_arghash_value($LF, arghash);
            sksi_kb_accessors.sksi_kill(lf);
        }
        if (NIL != html_arghash.get_arghash_value($DELETE_MS, arghash)) {
            html_arghash.rem_arghash_value($DELETE_MS, arghash);
            html_arghash.rem_arghash_value($MS, arghash);
            sksi_kb_accessors.sksi_unassert(uncanonicalizer.assertion_el_formula(ms), hlmt.assertion_hlmt(ms));
        }
        if (NIL != html_arghash.get_arghash_value($OK, arghash)) {
            html_arghash.set_arghash_value($TO_EDIT_SKS, arghash, T);
        }
        return arghash;
    }

    public static SubLObject sksi_smt_edit_lf_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_LF, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value($LS, arghash);
        SubLObject lf = html_arghash.get_arghash_value($LF, arghash);
        html_arghash.html_arghash_hidden_input(arghash, $SKS, sks, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $LS, sks, UNPROVIDED);
        if (NIL == lf) {
            lf = new_logical_field(sks, ls);
        }
        html_arghash.html_arghash_hidden_input(arghash, $LF, lf, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str253$Edit_Logical_Field__);
        sksi_form(sks);
        html_princ($str157$___);
        sksi_arghash_form(arghash, ls);
        html_princ($str157$___);
        sksi_arghash_form(arghash, lf);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        if (NIL != nart_handles.nart_p(lf)) {
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str254$Editing_this_field_will_automatic);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_newline(TWO_INTEGER);
        }
        final SubLObject lf_cycl = sksi_lf_get_cycl(lf);
        final SubLObject lf_isas = sksi_lf_get_isas(lf);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($str255$Logical_field_);
        sksi_arghash_form(arghash, lf_cycl);
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($$$Field_isa);
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        SubLObject cdolist_list_var = lf_isas;
        SubLObject lf_isa = NIL;
        lf_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_arghash.html_arghash_hidden_input(arghash, $ISA, lf_isa, UNPROVIDED);
            html_arghash.html_arghash_fort_input(arghash, $NEW_ISA, lf_isa, $int$30, $$$Complete, $$Collection);
            html_glyph($NBSP, UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, $$$Change, $OK, UNPROVIDED);
            html_glyph($NBSP, UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, $$$Delete, list(new SubLObject[]{ $COMMAND_EDIT_LF, $REMOVE_ISA, T, $REMOVED_ISA, lf_isa, $SKS, sks, $LS, ls }), UNPROVIDED);
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            lf_isa = cdolist_list_var.first();
        } 
        html_arghash.html_arghash_fort_input(arghash, $ADDED_ISA, NIL, $int$30, $$$Complete, $$Collection);
        html_glyph($NBSP, UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Add_isa, list($COMMAND_EDIT_LF, $ADD_ISA, T, $SKS, sks, $LS, ls), UNPROVIDED);
        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Refresh, $REFRESH, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$OK, $OK, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Cancel, $TO_EDIT_LS, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_lf_actions(final SubLObject arghash) {
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value($LS, arghash);
        SubLObject lf = html_arghash.get_arghash_value($LF, arghash);
        final SubLObject lsb_mt = sks_get_logical_schemabase_mt(sks);
        final SubLObject isas = html_arghash.get_arghash_value_list($ISA, arghash);
        final SubLObject new_isas = html_arghash.get_arghash_value_list($NEW_ISA, arghash);
        html_arghash.rem_arghash_value($ISA, arghash);
        html_arghash.rem_arghash_value($NEW_ISA, arghash);
        final SubLObject unassert_isas = set_difference(isas, new_isas, UNPROVIDED, UNPROVIDED);
        final SubLObject assert_isas = set_difference(new_isas, isas, UNPROVIDED, UNPROVIDED);
        if (((NIL != unassert_isas) || (NIL != assert_isas)) && (NIL != nart_handles.nart_p(lf))) {
            lf = sksi_lf_convert_to_constant(sks, ls, lf);
            html_arghash.set_arghash_value($LF, arghash, lf);
        }
        SubLObject cdolist_list_var = unassert_isas;
        SubLObject unassert_isa = NIL;
        unassert_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_unassert(make_binary_formula($$fieldIsa, lf, unassert_isa), lsb_mt);
            cdolist_list_var = cdolist_list_var.rest();
            unassert_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = assert_isas;
        SubLObject assert_isa = NIL;
        assert_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$fieldIsa, lf, assert_isa), lsb_mt);
            cdolist_list_var = cdolist_list_var.rest();
            assert_isa = cdolist_list_var.first();
        } 
        if (NIL != html_arghash.get_arghash_value($REMOVE_ISA, arghash)) {
            html_arghash.rem_arghash_value($REMOVE_ISA, arghash);
            if (NIL != nart_handles.nart_p(lf)) {
                lf = sksi_lf_convert_to_constant(sks, ls, lf);
                html_arghash.set_arghash_value($LF, arghash, lf);
            }
            final SubLObject removed_isa = html_arghash.get_arghash_value($REMOVED_ISA, arghash);
            html_arghash.rem_arghash_value($REMOVED_ISA, arghash);
            sksi_kb_accessors.sksi_unassert(make_binary_formula($$fieldIsa, lf, removed_isa), lsb_mt);
        }
        if (NIL != html_arghash.get_arghash_value($ADD_ISA, arghash)) {
            html_arghash.rem_arghash_value($ADD_ISA, arghash);
            if (NIL != nart_handles.nart_p(lf)) {
                lf = sksi_lf_convert_to_constant(sks, ls, lf);
                html_arghash.set_arghash_value($LF, arghash, lf);
            }
            final SubLObject isa_col = html_arghash.get_arghash_value($ADDED_ISA, arghash);
            html_arghash.rem_arghash_value($ADDED_ISA, arghash);
            if (NIL != isa_col) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$fieldIsa, lf, isa_col), lsb_mt);
            }
        }
        if (NIL != html_arghash.get_arghash_value($REFRESH, arghash)) {
            html_arghash.set_arghash_value($TO_EDIT_LF, arghash, T);
        } else
            if (NIL != html_arghash.get_arghash_value($OK, arghash)) {
                html_arghash.set_arghash_value($TO_EDIT_LS, arghash, T);
            }

        return arghash;
    }

    public static SubLObject sksi_smt_edit_ts_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_TS, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject ps = html_arghash.get_arghash_value($PS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value($LS, arghash);
        html_arghash.html_arghash_hidden_input(arghash, $SKS, sks, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $PS, ps, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $LS, ls, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str268$Edit_Translation_Schema__);
        sksi_form(sks);
        html_princ($str157$___);
        sksi_arghash_form(arghash, ps);
        final SubLObject this_arghash = hash_table_utilities.copy_hashtable(arghash, UNPROVIDED);
        html_arghash.set_arghash_value(list($COMMAND_EDIT_TS, T), this_arghash, T);
        final SubLObject href = format(NIL, $str269$_A__A, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_arghash.html_arghash_href(this_arghash, $str16$sksi_smt));
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str270$___);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        sksi_arghash_form(arghash, ls);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str271$_note__editing_is_not_yet_enabled);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        thread.resetMultipleValues();
        final SubLObject translation_pairs = sksi_sks_get_translations(sks, ps, ls, UNPROVIDED);
        final SubLObject encodings_only = thread.secondMultipleValue();
        final SubLObject decodings_only = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = translation_pairs;
            SubLObject translation_pair = NIL;
            translation_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_sksi_show_translation(arghash, translation_pair);
                cdolist_list_var = cdolist_list_var.rest();
                translation_pair = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return arghash;
    }

    public static SubLObject html_sksi_show_translation(final SubLObject arghash, final SubLObject translation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject physical_field = NIL;
        SubLObject logical_field = NIL;
        SubLObject encoding = NIL;
        SubLObject decoding = NIL;
        SubLObject decoding_formula = NIL;
        SubLObject encoding_formula = NIL;
        if (translation.isList()) {
            encoding = translation.first();
            decoding = second(translation);
            physical_field = cycl_utilities.sentence_arg2(uncanonicalizer.assertion_el_formula(encoding), UNPROVIDED);
            logical_field = cycl_utilities.sentence_arg2(uncanonicalizer.assertion_el_formula(decoding), UNPROVIDED);
            decoding_formula = cycl_utilities.sentence_arg4(uncanonicalizer.assertion_el_formula(decoding), UNPROVIDED);
            encoding_formula = cycl_utilities.sentence_arg4(uncanonicalizer.assertion_el_formula(encoding), UNPROVIDED);
        } else
            if (cycl_utilities.sentence_arg0(translation).eql($$fieldEncoding)) {
                final SubLObject encoding_$110 = uncanonicalizer.assertion_el_formula(translation);
                physical_field = cycl_utilities.sentence_arg2(encoding_$110, UNPROVIDED);
                encoding_formula = cycl_utilities.sentence_arg4(encoding_$110, UNPROVIDED);
            } else
                if (cycl_utilities.sentence_arg0(translation).eql($$fieldDecoding)) {
                    final SubLObject decoding_$111 = uncanonicalizer.assertion_el_formula(translation);
                    logical_field = cycl_utilities.sentence_arg2(decoding_$111, UNPROVIDED);
                    decoding_formula = cycl_utilities.sentence_arg4(decoding_$111, UNPROVIDED);
                }


        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($RIGHT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                sksi_form(physical_field);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str273$___);
                html_newline(UNPROVIDED);
                cb_assertion_ball(decoding, UNPROVIDED);
                cb_assertion_ball(encoding, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($LEFT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                sksi_form(logical_field);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_arghash.html_arghash_sentence_input(arghash, $DECODING_FORMULA, decoding_formula, THREE_INTEGER, $int$50, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_arghash.html_arghash_sentence_input(arghash, $ENCODING_FORMULA, encoding_formula, THREE_INTEGER, $int$50, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(FIVE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_glyph($NBSP, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_ts_actions(final SubLObject arghash) {
        return NIL;
    }

    public static SubLObject sksi_smt_edit_t_page(final SubLObject arghash) {
        return NIL;
    }

    public static SubLObject sksi_smt_edit_t_actions(final SubLObject arghash) {
        return arghash;
    }

    public static SubLObject sksi_smt_edit_ms_page(final SubLObject arghash) {
        html_arghash.html_arghash_hidden_input(arghash, $ON_EDIT_MS, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        final SubLObject ls = html_arghash.get_arghash_value($LS, arghash);
        final SubLObject ms = html_arghash.get_arghash_value($MS, arghash);
        final SubLObject predicate = misc_kb_utilities.guess_fort(html_arghash.get_arghash_value($PREDICATE, arghash));
        final SubLObject lf_arg1 = html_arghash.get_arghash_value($ARG1, arghash);
        final SubLObject lf_arg2 = html_arghash.get_arghash_value($ARG2, arghash);
        final SubLObject ms_formula = (NIL != ms) ? uncanonicalizer.assertion_el_formula(ms) : NIL;
        html_arghash.html_arghash_hidden_input(arghash, $SKS, sks, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $LS, ls, UNPROVIDED);
        html_arghash.html_arghash_hidden_input(arghash, $MS, ms, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str277$Edit_Meaning_Sentence_in__);
        sksi_form(sks);
        html_princ($str157$___);
        sksi_arghash_form(arghash, ls);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        if (NIL != ms_formula) {
            html_arghash.html_arghash_sentence_input(arghash, $MS_FORMULA, ms_formula, TEN_INTEGER, $int$60, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            final SubLObject sentence = make_binary_formula(predicate, lf_arg1, lf_arg2);
            final SubLObject meaning_sentence = make_binary_formula($$meaningSentenceOfSchema, ls, sentence);
            html_arghash.html_arghash_textarea_input(arghash, $MS_FORMULA, meaning_sentence, $int$60, TEN_INTEGER, T, $EL_FORMULA);
        }
        html_newline(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$OK, $OK, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Cancel, list($COMMAND_EDIT_MS, $SKS, sks, $LS, ls), UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_edit_ms_actions(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_arghash.get_arghash_value($OK, arghash)) {
            html_arghash.rem_arghash_value($OK, arghash);
            html_arghash.set_arghash_value($TO_EDIT_LS, arghash, T);
            final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
            final SubLObject lsb = sks_get_logical_schemabase_mt(sks);
            final SubLObject ms = html_arghash.get_arghash_value($MS, arghash);
            final SubLObject old_ms_formula = (NIL != assertion_handles.assertion_p(ms)) ? uncanonicalizer.assertion_el_formula(ms) : NIL;
            final SubLObject ms_formula = html_arghash.get_arghash_value($MS_FORMULA, arghash);
            if (NIL == ms_formula) {
                html_arghash.push_arghash_value($ERROR, list($NULL_FORMULA, $str281$Formula_invalid_), arghash);
            } else
                if (old_ms_formula.equal(ms_formula)) {
                    html_arghash.push_arghash_value($ERROR, list($NULL_FORMULA, $str282$Formula_wasn_t_changed_), arghash);
                } else
                    if (NIL == old_ms_formula) {
                        sksi_kb_accessors.sksi_assert_if_new(ms_formula, lsb);
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject result = sksi_kb_accessors.sksi_edit_assertion(ms, ms_formula);
                        final SubLObject error = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != error) {
                            html_arghash.push_arghash_value($ERROR, error, arghash);
                        }
                    }


        } else
            if (NIL != html_arghash.get_arghash_value($CANCEL, arghash)) {
                html_arghash.rem_arghash_value($OK, arghash);
                html_arghash.set_arghash_value($TO_EDIT_LS, arghash, T);
            }

        return arghash;
    }

    public static SubLObject sksi_smt_decode_psb_page(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.html_arghash_hidden_input(arghash, $ON_DECODE_PSB, T, UNPROVIDED);
        final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
        SubLObject table_info = html_arghash.get_arghash_value($TABLE_INFO, arghash);
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        final SubLObject named_schemata = sksi_sks_structure_importer_utilities.cluster_physical_database_table_information_by_schemata(sksi_psb_get_labeled_schemata(psb));
        html_arghash.html_arghash_hidden_input(arghash, $SKS, sks, UNPROVIDED);
        if (NIL == table_info) {
            final SubLObject raw_table_info = sksi_sks_structure_importer_utilities.sks_gather_physical_database_table_names(sks, UNPROVIDED, UNPROVIDED);
            table_info = sksi_sks_structure_importer_utilities.cluster_physical_database_table_information_by_schemata(raw_table_info);
            html_arghash.set_arghash_value($TABLE_INFO, arghash, table_info);
        }
        html_arghash.html_arghash_hidden_input(arghash, $TABLE_INFO, table_info, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($str285$Select_Database_Tables_to_Decode_);
        sksi_form(sks);
        html_princ($str286$__);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(FOUR_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject cdolist_list_var = table_info;
        SubLObject schema_info = NIL;
        schema_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = schema_info;
            SubLObject schema_name = NIL;
            SubLObject table_details = NIL;
            destructuring_bind_must_consp(current, datum, $list287);
            schema_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list287);
            table_details = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject curr_named_schema_tables = second(find(schema_name, named_schemata, $sym288$STRING_, FIRST, UNPROVIDED, UNPROVIDED));
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(FIVE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($$$Schema_);
                html_princ(schema_name);
                html_princ($str291$__);
                dhtml_macros.dhtml_switch_visibility_links(schema_name, $$$Show, $$$Hide);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(FIVE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                dhtml_macros.dhtml_set_switched_visibility(schema_name, $INVISIBLE, $PARAGRAPH);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != schema_name) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(schema_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$Table_Name);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != list_utilities.sublisp_boolean(curr_named_schema_tables)) {
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($$$Physical_Schemata);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var_$123 = table_details;
                        SubLObject table_detail = NIL;
                        table_detail = cdolist_list_var_$123.first();
                        while (NIL != cdolist_list_var_$123) {
                            final SubLObject table_name = table_detail.first();
                            final SubLObject table_schema_details = find(table_name, curr_named_schema_tables, $sym288$STRING_, FIRST, UNPROVIDED, UNPROVIDED);
                            final SubLObject arg_ref = cconcatenate(schema_name, new SubLObject[]{ $str126$_, table_name });
                            final SubLObject reifiedP = list_utilities.sublisp_boolean(table_schema_details);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL == reifiedP) {
                                        html_arghash.html_arghash_checkbox_input(arghash, arg_ref, T, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(table_name);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != reifiedP) {
                                        sksi_arghash_form(arghash, second(table_schema_details));
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                            table_detail = cdolist_list_var_$123.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list287);
            }
            cdolist_list_var = cdolist_list_var.rest();
            schema_info = cdolist_list_var.first();
        } 
        html_newline(TWO_INTEGER);
        html_arghash.html_arghash_submit_input(arghash, $$$Refresh, $REFRESH, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Decode, $DECODE, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, $$$Cancel, list($COMMAND_EDIT_SKS, $SKS, sks), UNPROVIDED);
        return NIL;
    }

    public static SubLObject sksi_smt_decode_psb_actions(final SubLObject arghash) {
        if (NIL != html_arghash.get_arghash_value($REFRESH, arghash)) {
            html_arghash.rem_arghash_value($REFRESH, arghash);
        } else
            if (NIL != html_arghash.get_arghash_value($DECODE, arghash)) {
                html_arghash.rem_arghash_value($DECODE, arghash);
                final SubLObject sks = html_arghash.get_arghash_value($SKS, arghash);
                final SubLObject table_info = html_arghash.get_arghash_value($TABLE_INFO, arghash);
                if (NIL == sks_get_psb(sks)) {
                    sks_new_psb(sks);
                }
                SubLObject cdolist_list_var = table_info;
                SubLObject schema_info = NIL;
                schema_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = schema_info;
                    SubLObject schema_name = NIL;
                    SubLObject table_details = NIL;
                    destructuring_bind_must_consp(current, datum, $list287);
                    schema_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list287);
                    table_details = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject cdolist_list_var_$128 = table_details;
                        SubLObject table_detail = NIL;
                        table_detail = cdolist_list_var_$128.first();
                        while (NIL != cdolist_list_var_$128) {
                            final SubLObject table_name = table_detail.first();
                            final SubLObject arg_ref = cconcatenate(schema_name, new SubLObject[]{ $str126$_, table_name });
                            if (NIL != html_arghash.get_arghash_value(arg_ref, arghash)) {
                                sksi_sks_structure_importer_utilities.sks_physical_structure_decode_database_table(sks, table_name, schema_name, UNPROVIDED);
                                html_arghash.rem_arghash_value(arg_ref, arghash);
                            }
                            cdolist_list_var_$128 = cdolist_list_var_$128.rest();
                            table_detail = cdolist_list_var_$128.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, $list287);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    schema_info = cdolist_list_var.first();
                } 
            } else
                if (NIL != html_arghash.get_arghash_value($CANCEL, arghash)) {
                    html_arghash.rem_arghash_value($CANCEL, arghash);
                    html_arghash.set_arghash_value($TO_EDIT_SKS, arghash, T);
                }


        return arghash;
    }

    public static SubLObject sks_get_sd(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sksi_sks_accessors.sks_fget(sks, $$sksSourceDescriptionMt, $$UniversalVocabularyMt);
    }

    public static SubLObject sks_get_source_description_mt(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject sd = sks_get_sd(sks);
        if (NIL != sd) {
            return sksi_sd_get_mt(sd);
        }
        return NIL;
    }

    public static SubLObject sks_new_sd(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject new_sd = make_unary_formula($$MappingMtFn, sks);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, new_sd, $$SKSISourceDescriptionMicrotheory), $$UniversalVocabularyMt);
        sksi_sks_accessors.sks_fset(sks, $$sksSourceDescriptionMt, new_sd, $$UniversalVocabularyMt);
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        if (NIL != forts.fort_p(psb)) {
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, new_sd, psb), $$BaseKB);
        }
        return new_sd;
    }

    public static SubLObject sks_get_psb(final SubLObject sks) {
        return sksi_sks_accessors.sks_fget(sks, $$sksPhysicalSchemaDescriptionMt, $$UniversalVocabularyMt);
    }

    public static SubLObject sks_get_physical_schemabase_mt(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject psb = sks_get_psb(sks);
        if (NIL != psb) {
            return sksi_psb_get_mt(psb);
        }
        return NIL;
    }

    public static SubLObject sks_new_psb(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject sks_string = sksi_sks_accessors.sks_get_string(sks);
        final SubLObject new_psb = sksi_kb_accessors.sksi_find_or_create(cconcatenate(string_utilities.post_remove(sks_string, $str304$_KS, UNPROVIDED), $$$PhysicalSchemaMt));
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, new_psb, $const306$SKSIPhysicalSchemaDescriptionMicr), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, new_psb, $$SKSIMt), $$UniversalVocabularyMt);
        sksi_sks_accessors.sks_fset(sks, $$sksPhysicalSchemaDescriptionMt, new_psb, $$UniversalVocabularyMt);
        final SubLObject sdb = sks_get_source_description_mt(sks);
        if (NIL != forts.fort_p(sdb)) {
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, sdb, new_psb), $$BaseKB);
        }
        return new_psb;
    }

    public static SubLObject sks_get_lsb(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sksi_sks_accessors.sks_fget(sks, $$sksLogicalSchemaDescriptionMt, $$UniversalVocabularyMt);
    }

    public static SubLObject sks_get_logical_schemabase_mt(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject lsb = sks_get_lsb(sks);
        if (NIL != lsb) {
            return sksi_lsb_get_mt(lsb);
        }
        return NIL;
    }

    public static SubLObject sks_get_tsb(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sksi_sks_accessors.sks_fget(sks, $$sksSchemaTranslationMt, $$UniversalVocabularyMt);
    }

    public static SubLObject sks_get_translation_schemabase_mt(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject tsb = sks_get_tsb(sks);
        if (NIL != tsb) {
            return sksi_tsb_get_mt(tsb);
        }
        return NIL;
    }

    public static SubLObject sks_get_bridging_or_content_mt(final SubLObject sks) {
        SubLObject result = sks_get_bmt(sks);
        if (NIL == fort_types_interface.microtheory_p(result)) {
            result = sks_get_cmt(sks);
        }
        return result;
    }

    public static SubLObject sks_get_cmt(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sksi_sks_accessors.sks_fget(sks, $$contentMt, $$BaseKB);
    }

    public static SubLObject sks_get_bmt(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sksi_sks_accessors.sks_fget(sks, $$bridgingMtForKS, $$BaseKB);
    }

    public static SubLObject sks_set_source_description_mt(final SubLObject sks, final SubLObject sd) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != hlmt.hlmt_p(sd) : "hlmt.hlmt_p(sd) " + "CommonSymbols.NIL != hlmt.hlmt_p(sd) " + sd;
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksSourceDescriptionMt, sks, sd), $$UniversalVocabularyMt);
    }

    public static SubLObject sks_set_physical_schemabase_mt(final SubLObject sks, final SubLObject psb) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != hlmt.hlmt_p(psb) : "hlmt.hlmt_p(psb) " + "CommonSymbols.NIL != hlmt.hlmt_p(psb) " + psb;
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksPhysicalSchemaDescriptionMt, sks, psb), $$UniversalVocabularyMt);
    }

    public static SubLObject sks_set_logical_schemabase_mt(final SubLObject sks, final SubLObject lsb) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != hlmt.hlmt_p(lsb) : "hlmt.hlmt_p(lsb) " + "CommonSymbols.NIL != hlmt.hlmt_p(lsb) " + lsb;
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksLogicalSchemaDescriptionMt, sks, lsb), $$UniversalVocabularyMt);
    }

    public static SubLObject sks_set_translation_schemabase_mt(final SubLObject sks, final SubLObject tsb) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != hlmt.hlmt_p(tsb) : "hlmt.hlmt_p(tsb) " + "CommonSymbols.NIL != hlmt.hlmt_p(tsb) " + tsb;
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksSchemaTranslationMt, sks, tsb), $$UniversalVocabularyMt);
    }

    public static SubLObject sksi_smt_check_isa_invariant(final SubLObject v_object, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == isa.isa_in_any_mtP(v_object, col)) && (NIL != list_utilities.sublisp_boolean($sksi_smt_warn_about_invariantsP$.getDynamicValue(thread)))) {
            Errors.warn($str313$SMT_invariant_broken___A_is_not_a, v_object, col);
        }
        return v_object;
    }

    public static SubLObject sksi_source_description_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, $$SKSISourceDescriptionMicrotheory);
        return T;
    }

    public static SubLObject sksi_sd_get_mt(final SubLObject sd) {
        assert NIL != sksi_source_description_p(sd) : "sksi_smt.sksi_source_description_p(sd) " + "CommonSymbols.NIL != sksi_smt.sksi_source_description_p(sd) " + sd;
        return sd;
    }

    public static SubLObject sksi_physical_schemabase_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, $const306$SKSIPhysicalSchemaDescriptionMicr);
        return T;
    }

    public static SubLObject sksi_psb_get_name(final SubLObject psb) {
        assert NIL != sksi_physical_schemabase_p(psb) : "sksi_smt.sksi_physical_schemabase_p(psb) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_schemabase_p(psb) " + psb;
        return kb_paths.fort_name(psb);
    }

    public static SubLObject sksi_psb_get_mt(final SubLObject psb) {
        assert NIL != sksi_physical_schemabase_p(psb) : "sksi_smt.sksi_physical_schemabase_p(psb) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_schemabase_p(psb) " + psb;
        return psb;
    }

    public static SubLObject sksi_physical_schema_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$PhysicalSchema);
    }

    public static SubLObject sksi_ps_get_name(final SubLObject ps) {
        assert NIL != sksi_physical_schema_p(ps) : "sksi_smt.sksi_physical_schema_p(ps) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_schema_p(ps) " + ps;
        return kb_paths.fort_name(ps);
    }

    public static SubLObject sksi_ps_get_pfs(final SubLObject ps) {
        assert NIL != sksi_physical_schema_p(ps) : "sksi_smt.sksi_physical_schema_p(ps) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_schema_p(ps) " + ps;
        final SubLObject pf_strings = kb_mapping_utilities.fpred_value_in_any_mt(ps, $$schemaFieldNameList, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = pf_strings;
        SubLObject pf_string = NIL;
        pf_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pf = sksi_kb_accessors.sksi_find_nart(make_binary_formula($$PhysicalFieldFn, ps, pf_string));
            if (NIL != pf) {
                result = cons(pf, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pf_string = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject sksi_physical_field_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$PhysicalField);
    }

    public static SubLObject sksi_pf_get_ps(final SubLObject pf) {
        assert NIL != sksi_physical_field_p(pf) : "sksi_smt.sksi_physical_field_p(pf) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_field_p(pf) " + pf;
        return cycl_utilities.sentence_arg1(pf, UNPROVIDED);
    }

    public static SubLObject sksi_pf_get_name(final SubLObject pf) {
        assert NIL != sksi_physical_field_p(pf) : "sksi_smt.sksi_physical_field_p(pf) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_field_p(pf) " + pf;
        return kb_mapping_utilities.fpred_value_in_any_mt(pf, $$fieldName_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_pf_get_datatype(final SubLObject pf) {
        assert NIL != sksi_physical_field_p(pf) : "sksi_smt.sksi_physical_field_p(pf) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_field_p(pf) " + pf;
        return kb_mapping_utilities.fpred_value_in_any_mt(pf, $$fieldDataType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_pf_get_nullable(final SubLObject pf) {
        assert NIL != sksi_physical_field_p(pf) : "sksi_smt.sksi_physical_field_p(pf) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_field_p(pf) " + pf;
        final SubLObject ps = sksi_pf_get_ps(pf);
        final SubLObject not_nullable_pfs = kb_mapping_utilities.pred_values_in_any_mt(ps, $$nonNullFields, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == subl_promotions.memberP(pf, not_nullable_pfs, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject sksi_pf_get_default_value(final SubLObject pf) {
        assert NIL != sksi_physical_field_p(pf) : "sksi_smt.sksi_physical_field_p(pf) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_field_p(pf) " + pf;
        final SubLObject ps = sksi_pf_get_ps(pf);
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_any_mt($$defaultFieldValue, ps, pf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject default_value = NIL;
        if (NIL != gaf) {
            default_value = cycl_utilities.sentence_arg3(gaf, UNPROVIDED);
        }
        return default_value;
    }

    public static SubLObject sksi_pf_get_key_type(final SubLObject pf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_physical_field_p(pf) : "sksi_smt.sksi_physical_field_p(pf) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_field_p(pf) " + pf;
        final SubLObject ps = sksi_pf_get_ps(pf);
        final SubLObject pf_name = sksi_pf_get_name(pf);
        final SubLObject pks = kb_mapping_utilities.pred_values_in_any_mt(ps, $$primaryKey, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        SubLObject current;
        final SubLObject datum = current = pks;
        SubLObject the_list = NIL;
        destructuring_bind_must_consp(current, datum, $list324);
        the_list = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$$TheList.eql(the_list))) {
            Errors.error($str325$Incapable_of_dealing_with_structu, pks);
        }
        final SubLObject key_names = Mapping.mapcar(SKSI_PF_GET_NAME, keys);
        if (NIL != subl_promotions.memberP(pf_name, key_names, UNPROVIDED, UNPROVIDED)) {
            return $PRIMARY;
        }
        return $NONE;
    }

    public static SubLObject sksi_logical_schemabase_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, $const329$SKSILogicalSchemaDescriptionMicro);
        return T;
    }

    public static SubLObject new_logical_schemabase(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject psb = sks_get_physical_schemabase_mt(sks);
        final SubLObject lsb = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(cconcatenate(string_utilities.post_remove(sksi_psb_get_name(psb), $$$PhysicalSchemaMt, UNPROVIDED), $$$LogicalSchemaMt), UNPROVIDED));
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, lsb, $const329$SKSILogicalSchemaDescriptionMicro), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, lsb, $$SKSIMt), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksLogicalSchemaDescriptionMt, sks, lsb), $$UniversalVocabularyMt);
        return lsb;
    }

    public static SubLObject sksi_lsb_get_mt(final SubLObject lsb) {
        assert NIL != sksi_logical_schemabase_p(lsb) : "sksi_smt.sksi_logical_schemabase_p(lsb) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schemabase_p(lsb) " + lsb;
        return lsb;
    }

    public static SubLObject sksi_logical_schema_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$LogicalSchema);
    }

    public static SubLObject new_logical_schema(final SubLObject sks, final SubLObject ps, SubLObject ls_name, SubLObject isas) {
        if (ls_name == UNPROVIDED) {
            ls_name = NIL;
        }
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        return new_or_recycled_logical_schema(sks, ps, ls_name, NIL, isas);
    }

    public static SubLObject new_or_recycled_logical_schema(final SubLObject sks, final SubLObject ps, SubLObject ls_name, SubLObject ls, SubLObject isas) {
        if (ls_name == UNPROVIDED) {
            ls_name = NIL;
        }
        if (ls == UNPROVIDED) {
            ls = NIL;
        }
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        if (((NIL != ps) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sksi_physical_schema_p(ps))) {
            throw new AssertionError(ps);
        }
        if (NIL != constant_p(ls)) {
            final SubLObject name = constants_high.constant_name(ls);
            ke.ke_recreate_now(ls);
            ls = constants_high.find_constant(name);
        } else {
            if (!ls_name.isString()) {
                ls_name = (NIL != sksi_physical_schema_p(ps)) ? cconcatenate(string_utilities.post_remove(sksi_ps_get_name(ps), $str200$_PS, UNPROVIDED), $str202$_LS) : cconcatenate(kb_paths.fort_name(sksi_sks_accessors.sks_get_term(sks)), new SubLObject[]{ $str332$_LS_, string_utilities.to_string(sksi_next_id()) });
            }
            ls = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(ls_name, UNPROVIDED));
        }
        SubLObject lsb = sks_get_lsb(sks);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, ls, $$ObjectDefiningSchema), $$UniversalVocabularyMt);
        SubLObject lsb_mt = NIL;
        if (NIL == lsb) {
            lsb = new_logical_schemabase(sks);
        }
        lsb_mt = sksi_lsb_get_mt(lsb);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, ls, $$LogicalSchema), lsb_mt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$definingMt, ls, lsb_mt), $$BaseKB);
        if (NIL != isas) {
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaIsa, ls, v_isa), lsb);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
        }
        if (NIL != ps) {
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalPhysicalSchemaMap, ls, ps), sks_get_source_description_mt(sks));
        }
        return ls;
    }

    public static SubLObject sksi_ls_get_name(final SubLObject ls) {
        assert NIL != sksi_logical_schema_p(ls) : "sksi_smt.sksi_logical_schema_p(ls) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schema_p(ls) " + ls;
        return constants_high.constant_name(ls);
    }

    public static SubLObject sksi_ls_get_lfs(final SubLObject ls) {
        assert NIL != sksi_logical_schema_p(ls) : "sksi_smt.sksi_logical_schema_p(ls) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schema_p(ls) " + ls;
        return kb_mapping_utilities.pred_values_in_any_mt(ls, $$logicalFields, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_ls_get_mss(final SubLObject ls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_logical_schema_p(ls) : "sksi_smt.sksi_logical_schema_p(ls) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schema_p(ls) " + ls;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_value_gafs(ls, $$meaningSentenceOfSchema, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_ls_get_ps(final SubLObject ls) {
        assert NIL != sksi_logical_schema_p(ls) : "sksi_smt.sksi_logical_schema_p(ls) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schema_p(ls) " + ls;
        return kb_mapping_utilities.pred_values_in_any_mt(ls, $$logicalPhysicalSchemaMap, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_logical_field_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$LogicalField);
    }

    public static SubLObject sksi_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next($sksi_isg$.getGlobalValue());
    }

    public static SubLObject new_logical_field(final SubLObject sks, final SubLObject ls) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != sksi_logical_schema_p(ls) : "sksi_smt.sksi_logical_schema_p(ls) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schema_p(ls) " + ls;
        final SubLObject sks_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject lf = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(cconcatenate(kb_paths.fort_name(sksi_sks_accessors.sks_get_term(sks)), new SubLObject[]{ $str201$_, sksi_ls_get_name(ls), $str341$_LF_, string_utilities.to_string(sksi_next_id()) }), UNPROVIDED));
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$quotedIsa, lf, $$IndexicalConcept), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, lf, $$LogicalField), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalFields, ls, lf), sks_mt);
        return lf;
    }

    public static SubLObject sksi_lf_convert_to_constant(final SubLObject sks, final SubLObject ls, final SubLObject lf) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != sksi_logical_schema_p(ls) : "sksi_smt.sksi_logical_schema_p(ls) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schema_p(ls) " + ls;
        assert NIL != sksi_logical_field_p(lf) : "sksi_smt.sksi_logical_field_p(lf) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_field_p(lf) " + lf;
        if (NIL == nart_handles.nart_p(lf)) {
            return lf;
        }
        final SubLObject lf_el_formula = narts_high.nart_el_formula(lf);
        final SubLObject new_lf = new_logical_field(sks, ls);
        final SubLObject sks_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject lsb_mt = sks_get_logical_schemabase_mt(sks);
        final SubLObject tsb_mt = sks_get_translation_schemabase_mt(sks);
        if (NIL != kb_mapping_macros.do_mt_index_key_validator(lsb_mt, NIL)) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(lsb_mt);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                    if (NIL != valid) {
                        final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                        if (NIL != subl_promotions.memberP(lf_el_formula, assertion_el_formula, EQUAL, UNPROVIDED)) {
                            sksi_kb_accessors.sksi_unassert_assertion(assertion);
                            sksi_kb_accessors.sksi_assert(list_utilities.tree_substitute(assertion_el_formula, lf_el_formula, new_lf), assertion_mt, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
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
        if ((!lsb_mt.eql(tsb_mt)) && (NIL != kb_mapping_macros.do_mt_index_key_validator(tsb_mt, NIL))) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(tsb_mt);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                    if (NIL != valid) {
                        final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                        if (NIL != subl_promotions.memberP(lf_el_formula, assertion_el_formula, EQUAL, UNPROVIDED)) {
                            sksi_kb_accessors.sksi_unassert_assertion(assertion);
                            sksi_kb_accessors.sksi_assert(list_utilities.tree_substitute(assertion_el_formula, lf_el_formula, new_lf), assertion_mt, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
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
        sksi_kb_accessors.sksi_unassert(make_binary_formula($$logicalFields, ls, lf), sks_mt);
        return new_lf;
    }

    public static SubLObject sksi_lf_get_genls(final SubLObject lf) {
        assert NIL != sksi_logical_field_p(lf) : "sksi_smt.sksi_logical_field_p(lf) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_field_p(lf) " + lf;
        return kb_mapping_utilities.pred_values_in_any_mt(lf, $$fieldGenls, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_lf_get_isas(final SubLObject lf) {
        assert NIL != sksi_logical_field_p(lf) : "sksi_smt.sksi_logical_field_p(lf) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_field_p(lf) " + lf;
        return kb_mapping_utilities.pred_values_in_any_mt(lf, $$fieldIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_lf_get_cycl(final SubLObject lf) {
        assert NIL != sksi_logical_field_p(lf) : "sksi_smt.sksi_logical_field_p(lf) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_field_p(lf) " + lf;
        return lf;
    }

    public static SubLObject sksi_meaning_sentence_p(final SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) && cycl_utilities.sentence_arg0(v_object).eql($$meaningSentenceOfSchema)) && (NIL != sksi_logical_schema_p(cycl_utilities.sentence_arg1(v_object, UNPROVIDED))));
    }

    public static SubLObject sksi_ms_get_cycl(final SubLObject ms) {
        assert NIL != sksi_meaning_sentence_p(ms) : "sksi_smt.sksi_meaning_sentence_p(ms) " + "CommonSymbols.NIL != sksi_smt.sksi_meaning_sentence_p(ms) " + ms;
        return cycl_utilities.sentence_arg2(ms, UNPROVIDED);
    }

    public static SubLObject sksi_ms_get_asserted(final SubLObject ms) {
        return assertions_high.asserted_assertionP(ms);
    }

    public static SubLObject sksi_translation_schemabase_p(final SubLObject v_object) {
        sksi_smt_check_isa_invariant(v_object, $$SKSISchemaTranslationMicrotheory);
        return T;
    }

    public static SubLObject new_translation_schemabase(final SubLObject sks, final SubLObject psb, final SubLObject lsb) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != sksi_physical_schemabase_p(psb) : "sksi_smt.sksi_physical_schemabase_p(psb) " + "CommonSymbols.NIL != sksi_smt.sksi_physical_schemabase_p(psb) " + psb;
        assert NIL != sksi_logical_schemabase_p(lsb) : "sksi_smt.sksi_logical_schemabase_p(lsb) " + "CommonSymbols.NIL != sksi_smt.sksi_logical_schemabase_p(lsb) " + lsb;
        final SubLObject tsb = sksi_kb_accessors.sksi_create(string_utilities.make_valid_constant_name(cconcatenate(string_utilities.post_remove(sksi_psb_get_name(psb), $$$PhysicalSchemaMt, UNPROVIDED), $$$TranslationSchemaMt), UNPROVIDED));
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, tsb, $$SKSISchemaTranslationMicrotheory), $$UniversalVocabularyMt);
        final SubLObject psb_mt = sksi_psb_get_mt(psb);
        final SubLObject lsb_mt = sksi_lsb_get_mt(lsb);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, tsb, psb_mt), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, tsb, lsb_mt), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksSchemaTranslationMt, sks, tsb), $$UniversalVocabularyMt);
        return tsb;
    }

    public static SubLObject sksi_tsb_get_mt(final SubLObject tsb) {
        assert NIL != sksi_translation_schemabase_p(tsb) : "sksi_smt.sksi_translation_schemabase_p(tsb) " + "CommonSymbols.NIL != sksi_smt.sksi_translation_schemabase_p(tsb) " + tsb;
        return tsb;
    }

    public static SubLObject decode_physical_structure_of_sks(final SubLObject sks) {
        if (NIL == sks_get_psb(sks)) {
            final SubLObject psb = sks_new_psb(sks);
            sksi_sks_structure_importer_utilities.sks_physical_structure_decode(sks);
        }
        return sks;
    }

    public static SubLObject new_structured_knowledge_source(final SubLObject sks_name) {
        final SubLObject sks = sksi_sks_accessors.new_sks_complex(sks_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sd = hlmt_czer.canonicalize_hlmt(sks_new_sd(sks));
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$contentMt, sks, make_unary_formula($$ContentMtFn, sks)), $$BaseKB);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksIsa, sks, $$Database_Physical), sd);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$bridgingMtForKS, sks, make_unary_formula($$BridgingMtForKSFn, sks)), $$SKSIVocabularyMt);
        return sks;
    }

    public static SubLObject new_conceptual_mapping_logical_schema(final SubLObject sks, final SubLObject ps, final SubLObject pf, final SubLObject isas) {
        final SubLObject schema_name = string_utilities.post_remove(kb_paths.fort_name(ps), $str200$_PS, UNPROVIDED);
        final SubLObject colname = sksi_smt_column_or_fort_name(pf);
        final SubLObject fullname = cconcatenate(schema_name, new SubLObject[]{ $str201$_, colname, $str357$_CMLS });
        SubLObject cmls = constants_high.find_constant(fullname);
        if (NIL != forts.fort_p(cmls)) {
            ke.ke_recreate_now(cmls);
            cmls = constants_high.find_constant(fullname);
        } else {
            cmls = ke.ke_create_now(fullname, UNPROVIDED);
        }
        sksi_kb_accessors.sksi_assert_if_new(listS($$isa, cmls, $list358), $$UniversalVocabularyMt);
        final SubLObject mapping_mt = sks_get_source_description_mt(sks);
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_assert_if_new(list($$schemaIsa, cmls, v_isa), mapping_mt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return cmls;
    }

    public static SubLObject sksi_smt_get_available_database_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            results = remove_if($sym360$HL_PROTOTYPICAL_INSTANCE_, isa.all_instances($const144$SKSISupportedDatabaseServerProgra, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sks_initialize_all_sks_description_mts() {
        SubLObject cdolist_list_var = sksi_sks_accessors.get_all_skss();
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sks_initialize_description_mts(sks);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sks_initialize_description_mts(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        if (NIL == sks_get_source_description_mt(sks)) {
            final SubLObject sd = sks_guess_sd(sks);
            if (NIL != sd) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sd, $$SKSISourceDescriptionMicrotheory), $$UniversalVocabularyMt);
                sks_set_source_description_mt(sks, sd);
            }
        }
        if (NIL == sks_get_physical_schemabase_mt(sks)) {
            final SubLObject psb = sks_guess_psb(sks);
            if (NIL != psb) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, psb, $const306$SKSIPhysicalSchemaDescriptionMicr), $$UniversalVocabularyMt);
                sks_set_physical_schemabase_mt(sks, psb);
            }
        }
        if (NIL == sks_get_logical_schemabase_mt(sks)) {
            final SubLObject lsb = sks_guess_lsb(sks);
            if (NIL != lsb) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, lsb, $const329$SKSILogicalSchemaDescriptionMicro), $$UniversalVocabularyMt);
                sks_set_logical_schemabase_mt(sks, lsb);
            }
        }
        if (NIL == sks_get_translation_schemabase_mt(sks)) {
            final SubLObject tsb = sks_guess_tsb(sks);
            if (NIL != tsb) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, tsb, $$SKSISchemaTranslationMicrotheory), $$UniversalVocabularyMt);
                sks_set_translation_schemabase_mt(sks, tsb);
            }
        }
        return NIL;
    }

    public static SubLObject get_all_sds() {
        return isa.all_fort_instances($$SKSISchemaDescriptionMicrotheory, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject get_all_psbs() {
        return isa.all_fort_instances($const306$SKSIPhysicalSchemaDescriptionMicr, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject get_all_lsbs() {
        return isa.all_fort_instances($const329$SKSILogicalSchemaDescriptionMicro, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject get_all_tsbs() {
        return isa.all_fort_instances($$SKSISchemaTranslationMicrotheory, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject sksi_form(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_default_fort_handler$.currentBinding(thread);
        try {
            $cb_default_fort_handler$.bind($str16$sksi_smt, thread);
            cb_form(v_object, UNPROVIDED, UNPROVIDED);
        } finally {
            $cb_default_fort_handler$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_arghash_form(final SubLObject arghash, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_default_fort_handler$.currentBinding(thread);
        try {
            $cb_default_fort_handler$.bind(html_arghash.html_arghash_href(arghash, $str16$sksi_smt), thread);
            cb_form(v_object, UNPROVIDED, UNPROVIDED);
        } finally {
            $cb_default_fort_handler$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject amt_mts(final SubLObject term_list, SubLObject include_meta_assertionsP) {
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject assertions = virtual_indexing.assertions_mentioning_terms(term_list, include_meta_assertionsP);
            SubLObject mts = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    mts = cons(item_var, mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            result = Sort.sort(mts, $sym362$GENERALITY_ESTIMATE_, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sks_guess_sd(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return amt_mts(list(sks, $$sksIsa), UNPROVIDED).first();
    }

    public static SubLObject sks_guess_psb(final SubLObject sks) {
        final SubLObject sub_skss = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
        SubLObject mt_list = NIL;
        SubLObject cdolist_list_var = sub_skss;
        SubLObject sub_sks = NIL;
        sub_sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject poss_ps = sksi_sks_accessors.sks_fget(sub_sks, $$physicalSchemaSourceMap, UNPROVIDED);
            if (NIL != poss_ps) {
                mt_list = cons(amt_mts(list($$physicalFields, poss_ps), UNPROVIDED), mt_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        } 
        return list_utilities.hash_remove_duplicates(apply(APPEND, mt_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject sks_guess_lsb(final SubLObject sks) {
        final SubLObject sub_skss = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
        SubLObject mt_list = NIL;
        SubLObject cdolist_list_var = sub_skss;
        SubLObject sub_sks = NIL;
        sub_sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject poss_ps = sksi_sks_accessors.sks_fget(sub_sks, $$physicalSchemaSourceMap, UNPROVIDED);
            if (NIL != poss_ps) {
                final SubLObject poss_ls = kb_mapping_utilities.fpred_value_in_any_mt(poss_ps, $$logicalPhysicalSchemaMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                if (NIL != poss_ls) {
                    mt_list = cons(amt_mts(list($$logicalFields, poss_ls), UNPROVIDED), mt_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        } 
        return list_utilities.hash_remove_duplicates(apply(APPEND, mt_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject sks_guess_tsb(final SubLObject sks) {
        final SubLObject sub_skss = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
        SubLObject mt_list = NIL;
        SubLObject cdolist_list_var = sub_skss;
        SubLObject sub_sks = NIL;
        sub_sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject poss_ps = sksi_sks_accessors.sks_fget(sub_sks, $$physicalSchemaSourceMap, UNPROVIDED);
            if (NIL != poss_ps) {
                final SubLObject poss_ls = kb_mapping_utilities.fpred_value_in_any_mt(poss_ps, $$logicalPhysicalSchemaMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                if (NIL != poss_ls) {
                    mt_list = cons(amt_mts(list(poss_ps, poss_ls), UNPROVIDED), mt_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        } 
        return list_utilities.hash_remove_duplicates(apply(APPEND, mt_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject sksi_psb_get_schemata(final SubLObject psb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject physical_schemata = NIL;
        final SubLObject relation = $$enumerableSchema;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(psb, thread);
            final SubLObject pred_var = relation;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$129 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$130 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$131 = NIL;
                                final SubLObject token_var_$132 = NIL;
                                while (NIL == done_var_$131) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$132);
                                    final SubLObject valid_$133 = makeBoolean(!token_var_$132.eql(assertion));
                                    if (NIL != valid_$133) {
                                        final SubLObject pcase_var = assertions_high.assertion_truth(assertion);
                                        if (pcase_var.eql($TRUE)) {
                                            physical_schemata = cons(cycl_utilities.sentence_arg1(assertion, UNPROVIDED), physical_schemata);
                                        } else
                                            if (pcase_var.eql($FALSE)) {
                                                physical_schemata = cons(cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(assertion, UNPROVIDED), UNPROVIDED), physical_schemata);
                                            }

                                    }
                                    done_var_$131 = makeBoolean(NIL == valid_$133);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$130, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$129, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.hash_remove_duplicates(physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_psb_get_labeled_schemata(final SubLObject psb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        if (NIL != forts.fort_p(psb)) {
            SubLObject cdolist_list_var;
            final SubLObject physical_schemata = cdolist_list_var = sksi_psb_get_schemata(psb);
            SubLObject physical_schema = NIL;
            physical_schema = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(psb, thread);
                    final SubLObject table_name = kb_mapping_utilities.fpred_value(physical_schema, $$schemaName_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject schema_name = kb_mapping_utilities.fpred_value(physical_schema, $$schemaNameSchema_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    results = cons(list(schema_name, table_name, physical_schema), results);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                physical_schema = cdolist_list_var.first();
            } 
        }
        return nreverse(results);
    }

    public static SubLObject sksi_lsb_get_schemata(final SubLObject lsb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_schemata = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(lsb, thread);
            final SubLObject pred_var = $$logicalFields;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$135 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$136 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$137 = NIL;
                                final SubLObject token_var_$138 = NIL;
                                while (NIL == done_var_$137) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$138);
                                    final SubLObject valid_$139 = makeBoolean(!token_var_$138.eql(assertion));
                                    if (NIL != valid_$139) {
                                        logical_schemata = cons(cycl_utilities.sentence_arg1(assertion, UNPROVIDED), logical_schemata);
                                    }
                                    done_var_$137 = makeBoolean(NIL == valid_$139);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$136 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$136, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$136, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$135, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.hash_remove_duplicates(logical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_tsb_get_translation_pairs(final SubLObject tsb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translation_pairs = NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(sksi_tsb_get_lss_for_pss(tsb));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject ps = NIL;
                SubLObject lss = NIL;
                destructuring_bind_must_consp(current, datum, $list375);
                ps = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list375);
                lss = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var = lss;
                    SubLObject ls = NIL;
                    ls = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        translation_pairs = cons(list(ps, ls), translation_pairs);
                        cdolist_list_var = cdolist_list_var.rest();
                        ls = cdolist_list_var.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list375);
                }
            }
        }
        translation_pairs = Sort.sort(translation_pairs, $sym376$FORT_NAME_, FIRST);
        return translation_pairs;
    }

    public static SubLObject sksi_tsb_get_lss_for_pss(final SubLObject tsb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mappings = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(tsb, thread);
            final SubLObject pred_var = $$logicalPhysicalSchemaMap;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$141 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$142 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$143 = NIL;
                                final SubLObject token_var_$144 = NIL;
                                while (NIL == done_var_$143) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$144);
                                    final SubLObject valid_$145 = makeBoolean(!token_var_$144.eql(assertion));
                                    if (NIL != valid_$145) {
                                        final SubLObject ls = cycl_utilities.sentence_arg1(assertion, UNPROVIDED);
                                        final SubLObject ps = cycl_utilities.sentence_arg2(assertion, UNPROVIDED);
                                        map_utilities.map_pushnew(mappings, ps, ls, UNPROVIDED, UNPROVIDED);
                                    }
                                    done_var_$143 = makeBoolean(NIL == valid_$145);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$142, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$141, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject iterator = map_utilities.new_map_iterator(mappings);
        SubLObject valid2;
        for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid2) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject ps2 = NIL;
                SubLObject lss = NIL;
                destructuring_bind_must_consp(current, datum, $list375);
                ps2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list375);
                lss = current.first();
                current = current.rest();
                if (NIL == current) {
                    lss = Sort.sort(lss, $sym376$FORT_NAME_, UNPROVIDED);
                    map_utilities.map_put(mappings, ps2, lss);
                } else {
                    cdestructuring_bind_error(datum, $list375);
                }
            }
        }
        return mappings;
    }

    public static SubLObject sksi_sks_get_translations(final SubLObject sks, final SubLObject ps, final SubLObject ls, SubLObject tsb) {
        if (tsb == UNPROVIDED) {
            tsb = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translation_pairs = NIL;
        SubLObject encodings = NIL;
        SubLObject encodings_matched = NIL;
        SubLObject decodings = NIL;
        SubLObject decodings_matched = NIL;
        if (NIL == tsb) {
            tsb = sks_get_tsb(sks);
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(tsb, thread);
            SubLObject pred_var = $$fieldEncoding;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$147 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$148 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$149 = NIL;
                                final SubLObject token_var_$150 = NIL;
                                while (NIL == done_var_$149) {
                                    final SubLObject encoding = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$150);
                                    final SubLObject valid_$151 = makeBoolean(!token_var_$150.eql(encoding));
                                    if (((NIL != valid_$151) && cycl_utilities.sentence_arg3(encoding, UNPROVIDED).eql(ls)) && cycl_utilities.sentence_arg1(encoding, UNPROVIDED).eql(ps)) {
                                        final SubLObject item_var = encoding;
                                        if (NIL == member(item_var, encodings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            encodings = cons(item_var, encodings);
                                        }
                                    }
                                    done_var_$149 = makeBoolean(NIL == valid_$151);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$148 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$148, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$147, thread);
                }
            }
            pred_var = $$fieldDecoding;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$149 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$149 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$150 = NIL;
                                final SubLObject token_var_$151 = NIL;
                                while (NIL == done_var_$150) {
                                    final SubLObject decoding = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$151);
                                    final SubLObject valid_$152 = makeBoolean(!token_var_$151.eql(decoding));
                                    if (((NIL != valid_$152) && cycl_utilities.sentence_arg3(decoding, UNPROVIDED).eql(ps)) && cycl_utilities.sentence_arg1(decoding, UNPROVIDED).eql(ls)) {
                                        final SubLObject item_var = decoding;
                                        if (NIL == member(item_var, decodings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            decodings = cons(item_var, decodings);
                                        }
                                    }
                                    done_var_$150 = makeBoolean(NIL == valid_$152);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$149, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$149, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = encodings;
        SubLObject encoding2 = NIL;
        encoding2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$159 = decodings;
            SubLObject decoding2 = NIL;
            decoding2 = cdolist_list_var_$159.first();
            while (NIL != cdolist_list_var_$159) {
                final SubLObject physical_field = cycl_utilities.sentence_arg2(encoding2, UNPROVIDED);
                final SubLObject logical_field = cycl_utilities.sentence_arg2(decoding2, UNPROVIDED);
                if ((NIL != list_utilities.tree_find(physical_field, cycl_utilities.sentence_arg4(decoding2, UNPROVIDED), UNPROVIDED, UNPROVIDED)) || (NIL != list_utilities.tree_find(logical_field, cycl_utilities.sentence_arg4(encoding2, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                    SubLObject item_var2 = encoding2;
                    if (NIL == member(item_var2, encodings_matched, symbol_function(EQL), symbol_function(IDENTITY))) {
                        encodings_matched = cons(item_var2, encodings_matched);
                    }
                    item_var2 = decoding2;
                    if (NIL == member(item_var2, decodings_matched, symbol_function(EQL), symbol_function(IDENTITY))) {
                        decodings_matched = cons(item_var2, decodings_matched);
                    }
                    item_var2 = list(encoding2, decoding2);
                    if (NIL == member(item_var2, translation_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        translation_pairs = cons(item_var2, translation_pairs);
                    }
                }
                cdolist_list_var_$159 = cdolist_list_var_$159.rest();
                decoding2 = cdolist_list_var_$159.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            encoding2 = cdolist_list_var.first();
        } 
        return values(translation_pairs, set_difference(encodings, encodings_matched, UNPROVIDED, UNPROVIDED), set_difference(decodings, decodings_matched, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject declare_sksi_smt_file() {
        declareFunction(me, "cb_link_edit_in_smt", "CB-LINK-EDIT-IN-SMT", 1, 1, false);
        declareFunction(me, "smt_edit_button", "SMT-EDIT-BUTTON", 1, 1, false);
        declareFunction(me, "cb_link_smt", "CB-LINK-SMT", 0, 1, false);
        declareFunction(me, "sksi_smt", "SKSI-SMT", 0, 1, false);
        declareFunction(me, "sksi_smt_int", "SKSI-SMT-INT", 1, 0, false);
        declareFunction(me, "sksi_smt_main_page", "SKSI-SMT-MAIN-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_main_actions", "SKSI-SMT-MAIN-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_sks_page", "SKSI-SMT-EDIT-SKS-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_sks_page_main_table", "SKSI-SMT-EDIT-SKS-PAGE-MAIN-TABLE", 2, 4, false);
        declareFunction(me, "sksi_smt_edit_sks_actions", "SKSI-SMT-EDIT-SKS-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_html_sks_status_line", "SKSI-SMT-HTML-SKS-STATUS-LINE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_sd_page", "SKSI-SMT-EDIT-SD-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_sd_actions", "SKSI-SMT-EDIT-SD-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_update_source_description", "SKSI-SMT-UPDATE-SOURCE-DESCRIPTION", 2, 0, false);
        declareFunction(me, "sksi_smt_compile_source_description", "SKSI-SMT-COMPILE-SOURCE-DESCRIPTION", 1, 0, false);
        declareFunction(me, "clear_sksi_smt_compile_param_definitions", "CLEAR-SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 0, 0, false);
        declareFunction(me, "remove_sksi_smt_compile_param_definitions", "REMOVE-SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_compile_param_definitions_internal", "SKSI-SMT-COMPILE-PARAM-DEFINITIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_smt_compile_param_definitions", "SKSI-SMT-COMPILE-PARAM-DEFINITIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_register_structured_knowledge_source", "SKSI-SMT-REGISTER-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction(me, "sksi_smt_structured_knowledge_source_registeredP", "SKSI-SMT-STRUCTURED-KNOWLEDGE-SOURCE-REGISTERED?", 1, 0, false);
        declareFunction(me, "sksi_ps_compile_pfs_info", "SKSI-PS-COMPILE-PFS-INFO", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ps_page", "SKSI-SMT-EDIT-PS-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ps_actions", "SKSI-SMT-EDIT-PS-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_logical_field_values_for_logical_schema", "SKSI-SMT-LOGICAL-FIELD-VALUES-FOR-LOGICAL-SCHEMA", 3, 0, false);
        declareFunction(me, "sksi_smt_fetch_simple_logical_schemata", "SKSI-SMT-FETCH-SIMPLE-LOGICAL-SCHEMATA", 2, 0, false);
        declareFunction(me, "sksi_smt_retrieve_simple_logical_schemata", "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMATA", 2, 0, false);
        declareFunction(me, "sksi_smt_retrieve_simple_logical_schema", "SKSI-SMT-RETRIEVE-SIMPLE-LOGICAL-SCHEMA", 3, 0, false);
        declareFunction(me, "sksi_smt_unpack_decoding_conversion_expression", "SKSI-SMT-UNPACK-DECODING-CONVERSION-EXPRESSION", 2, 0, false);
        declareFunction(me, "enable_sksi_smt_mode", "ENABLE-SKSI-SMT-MODE", 0, 0, false);
        declareFunction(me, "disable_sksi_smt_mode", "DISABLE-SKSI-SMT-MODE", 0, 0, false);
        declareFunction(me, "is_sksi_smt_mode_enabledP", "IS-SKSI-SMT-MODE-ENABLED?", 0, 0, false);
        declareFunction(me, "get_sksi_smt_mode", "GET-SKSI-SMT-MODE", 0, 0, false);
        declareFunction(me, "sksi_smt_get_units_of_measurement", "SKSI-SMT-GET-UNITS-OF-MEASUREMENT", 0, 0, false);
        declareFunction(me, "sksi_smt_assemble_units_result", "SKSI-SMT-ASSEMBLE-UNITS-RESULT", 2, 0, false);
        declareFunction(me, "sksi_smt_uninteresting_units_filter_fn", "SKSI-SMT-UNINTERESTING-UNITS-FILTER-FN", 1, 0, false);
        declareFunction(me, "sksi_smt_get_rendering_tuples", "SKSI-SMT-GET-RENDERING-TUPLES", 1, 0, false);
        declareFunction(me, "sksi_smt_derive_simple_logical_schema", "SKSI-SMT-DERIVE-SIMPLE-LOGICAL-SCHEMA", 9, 1, false);
        declareFunction(me, "sksi_smt_derive_indirecting_relation", "SKSI-SMT-DERIVE-INDIRECTING-RELATION", 5, 0, false);
        declareFunction(me, "sksi_smt_physical_field_value_indexical_for_pf", "SKSI-SMT-PHYSICAL-FIELD-VALUE-INDEXICAL-FOR-PF", 1, 0, false);
        declareFunction(me, "sksi_smt_physical_field_for_pfi", "SKSI-SMT-PHYSICAL-FIELD-FOR-PFI", 1, 0, false);
        declareFunction(me, "sksi_smt_determine_dependent_colname", "SKSI-SMT-DETERMINE-DEPENDENT-COLNAME", 3, 0, false);
        declareFunction(me, "sksi_smt_determine_lf_conversion", "SKSI-SMT-DETERMINE-LF-CONVERSION", 2, 0, false);
        declareFunction(me, "sksi_smt_determine_pf_conversion", "SKSI-SMT-DETERMINE-PF-CONVERSION", 2, 0, false);
        declareFunction(me, "clear_sksi_smt_column_or_fort_name", "CLEAR-SKSI-SMT-COLUMN-OR-FORT-NAME", 0, 0, false);
        declareFunction(me, "remove_sksi_smt_column_or_fort_name", "REMOVE-SKSI-SMT-COLUMN-OR-FORT-NAME", 1, 0, false);
        declareFunction(me, "sksi_smt_column_or_fort_name_internal", "SKSI-SMT-COLUMN-OR-FORT-NAME-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_smt_column_or_fort_name", "SKSI-SMT-COLUMN-OR-FORT-NAME", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ls_page", "SKSI-SMT-EDIT-LS-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ls_actions", "SKSI-SMT-EDIT-LS-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_lf_page", "SKSI-SMT-EDIT-LF-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_lf_actions", "SKSI-SMT-EDIT-LF-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ts_page", "SKSI-SMT-EDIT-TS-PAGE", 1, 0, false);
        declareFunction(me, "html_sksi_show_translation", "HTML-SKSI-SHOW-TRANSLATION", 2, 0, false);
        declareFunction(me, "sksi_smt_edit_ts_actions", "SKSI-SMT-EDIT-TS-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_t_page", "SKSI-SMT-EDIT-T-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_t_actions", "SKSI-SMT-EDIT-T-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ms_page", "SKSI-SMT-EDIT-MS-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_edit_ms_actions", "SKSI-SMT-EDIT-MS-ACTIONS", 1, 0, false);
        declareFunction(me, "sksi_smt_decode_psb_page", "SKSI-SMT-DECODE-PSB-PAGE", 1, 0, false);
        declareFunction(me, "sksi_smt_decode_psb_actions", "SKSI-SMT-DECODE-PSB-ACTIONS", 1, 0, false);
        declareFunction(me, "sks_get_sd", "SKS-GET-SD", 1, 0, false);
        declareFunction(me, "sks_get_source_description_mt", "SKS-GET-SOURCE-DESCRIPTION-MT", 1, 0, false);
        declareFunction(me, "sks_new_sd", "SKS-NEW-SD", 1, 0, false);
        declareFunction(me, "sks_get_psb", "SKS-GET-PSB", 1, 0, false);
        declareFunction(me, "sks_get_physical_schemabase_mt", "SKS-GET-PHYSICAL-SCHEMABASE-MT", 1, 0, false);
        declareFunction(me, "sks_new_psb", "SKS-NEW-PSB", 1, 0, false);
        declareFunction(me, "sks_get_lsb", "SKS-GET-LSB", 1, 0, false);
        declareFunction(me, "sks_get_logical_schemabase_mt", "SKS-GET-LOGICAL-SCHEMABASE-MT", 1, 0, false);
        declareFunction(me, "sks_get_tsb", "SKS-GET-TSB", 1, 0, false);
        declareFunction(me, "sks_get_translation_schemabase_mt", "SKS-GET-TRANSLATION-SCHEMABASE-MT", 1, 0, false);
        declareFunction(me, "sks_get_bridging_or_content_mt", "SKS-GET-BRIDGING-OR-CONTENT-MT", 1, 0, false);
        declareFunction(me, "sks_get_cmt", "SKS-GET-CMT", 1, 0, false);
        declareFunction(me, "sks_get_bmt", "SKS-GET-BMT", 1, 0, false);
        declareFunction(me, "sks_set_source_description_mt", "SKS-SET-SOURCE-DESCRIPTION-MT", 2, 0, false);
        declareFunction(me, "sks_set_physical_schemabase_mt", "SKS-SET-PHYSICAL-SCHEMABASE-MT", 2, 0, false);
        declareFunction(me, "sks_set_logical_schemabase_mt", "SKS-SET-LOGICAL-SCHEMABASE-MT", 2, 0, false);
        declareFunction(me, "sks_set_translation_schemabase_mt", "SKS-SET-TRANSLATION-SCHEMABASE-MT", 2, 0, false);
        declareFunction(me, "sksi_smt_check_isa_invariant", "SKSI-SMT-CHECK-ISA-INVARIANT", 2, 0, false);
        declareFunction(me, "sksi_source_description_p", "SKSI-SOURCE-DESCRIPTION-P", 1, 0, false);
        declareFunction(me, "sksi_sd_get_mt", "SKSI-SD-GET-MT", 1, 0, false);
        declareFunction(me, "sksi_physical_schemabase_p", "SKSI-PHYSICAL-SCHEMABASE-P", 1, 0, false);
        declareFunction(me, "sksi_psb_get_name", "SKSI-PSB-GET-NAME", 1, 0, false);
        declareFunction(me, "sksi_psb_get_mt", "SKSI-PSB-GET-MT", 1, 0, false);
        declareFunction(me, "sksi_physical_schema_p", "SKSI-PHYSICAL-SCHEMA-P", 1, 0, false);
        declareFunction(me, "sksi_ps_get_name", "SKSI-PS-GET-NAME", 1, 0, false);
        declareFunction(me, "sksi_ps_get_pfs", "SKSI-PS-GET-PFS", 1, 0, false);
        declareFunction(me, "sksi_physical_field_p", "SKSI-PHYSICAL-FIELD-P", 1, 0, false);
        declareFunction(me, "sksi_pf_get_ps", "SKSI-PF-GET-PS", 1, 0, false);
        declareFunction(me, "sksi_pf_get_name", "SKSI-PF-GET-NAME", 1, 0, false);
        declareFunction(me, "sksi_pf_get_datatype", "SKSI-PF-GET-DATATYPE", 1, 0, false);
        declareFunction(me, "sksi_pf_get_nullable", "SKSI-PF-GET-NULLABLE", 1, 0, false);
        declareFunction(me, "sksi_pf_get_default_value", "SKSI-PF-GET-DEFAULT-VALUE", 1, 0, false);
        declareFunction(me, "sksi_pf_get_key_type", "SKSI-PF-GET-KEY-TYPE", 1, 0, false);
        declareFunction(me, "sksi_logical_schemabase_p", "SKSI-LOGICAL-SCHEMABASE-P", 1, 0, false);
        declareFunction(me, "new_logical_schemabase", "NEW-LOGICAL-SCHEMABASE", 1, 0, false);
        declareFunction(me, "sksi_lsb_get_mt", "SKSI-LSB-GET-MT", 1, 0, false);
        declareFunction(me, "sksi_logical_schema_p", "SKSI-LOGICAL-SCHEMA-P", 1, 0, false);
        declareFunction(me, "new_logical_schema", "NEW-LOGICAL-SCHEMA", 2, 2, false);
        declareFunction(me, "new_or_recycled_logical_schema", "NEW-OR-RECYCLED-LOGICAL-SCHEMA", 2, 3, false);
        declareFunction(me, "sksi_ls_get_name", "SKSI-LS-GET-NAME", 1, 0, false);
        declareFunction(me, "sksi_ls_get_lfs", "SKSI-LS-GET-LFS", 1, 0, false);
        declareFunction(me, "sksi_ls_get_mss", "SKSI-LS-GET-MSS", 1, 0, false);
        declareFunction(me, "sksi_ls_get_ps", "SKSI-LS-GET-PS", 1, 0, false);
        declareFunction(me, "sksi_logical_field_p", "SKSI-LOGICAL-FIELD-P", 1, 0, false);
        declareFunction(me, "sksi_next_id", "SKSI-NEXT-ID", 0, 0, false);
        declareFunction(me, "new_logical_field", "NEW-LOGICAL-FIELD", 2, 0, false);
        declareFunction(me, "sksi_lf_convert_to_constant", "SKSI-LF-CONVERT-TO-CONSTANT", 3, 0, false);
        declareFunction(me, "sksi_lf_get_genls", "SKSI-LF-GET-GENLS", 1, 0, false);
        declareFunction(me, "sksi_lf_get_isas", "SKSI-LF-GET-ISAS", 1, 0, false);
        declareFunction(me, "sksi_lf_get_cycl", "SKSI-LF-GET-CYCL", 1, 0, false);
        declareFunction(me, "sksi_meaning_sentence_p", "SKSI-MEANING-SENTENCE-P", 1, 0, false);
        declareFunction(me, "sksi_ms_get_cycl", "SKSI-MS-GET-CYCL", 1, 0, false);
        declareFunction(me, "sksi_ms_get_asserted", "SKSI-MS-GET-ASSERTED", 1, 0, false);
        declareFunction(me, "sksi_translation_schemabase_p", "SKSI-TRANSLATION-SCHEMABASE-P", 1, 0, false);
        declareFunction(me, "new_translation_schemabase", "NEW-TRANSLATION-SCHEMABASE", 3, 0, false);
        declareFunction(me, "sksi_tsb_get_mt", "SKSI-TSB-GET-MT", 1, 0, false);
        declareFunction(me, "decode_physical_structure_of_sks", "DECODE-PHYSICAL-STRUCTURE-OF-SKS", 1, 0, false);
        declareFunction(me, "new_structured_knowledge_source", "NEW-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction(me, "new_conceptual_mapping_logical_schema", "NEW-CONCEPTUAL-MAPPING-LOGICAL-SCHEMA", 4, 0, false);
        declareFunction(me, "sksi_smt_get_available_database_types", "SKSI-SMT-GET-AVAILABLE-DATABASE-TYPES", 0, 0, false);
        declareFunction(me, "sks_initialize_all_sks_description_mts", "SKS-INITIALIZE-ALL-SKS-DESCRIPTION-MTS", 0, 0, false);
        declareFunction(me, "sks_initialize_description_mts", "SKS-INITIALIZE-DESCRIPTION-MTS", 1, 0, false);
        declareFunction(me, "get_all_sds", "GET-ALL-SDS", 0, 0, false);
        declareFunction(me, "get_all_psbs", "GET-ALL-PSBS", 0, 0, false);
        declareFunction(me, "get_all_lsbs", "GET-ALL-LSBS", 0, 0, false);
        declareFunction(me, "get_all_tsbs", "GET-ALL-TSBS", 0, 0, false);
        declareFunction(me, "sksi_form", "SKSI-FORM", 1, 0, false);
        declareFunction(me, "sksi_arghash_form", "SKSI-ARGHASH-FORM", 2, 0, false);
        declareFunction(me, "amt_mts", "AMT-MTS", 1, 1, false);
        declareFunction(me, "sks_guess_sd", "SKS-GUESS-SD", 1, 0, false);
        declareFunction(me, "sks_guess_psb", "SKS-GUESS-PSB", 1, 0, false);
        declareFunction(me, "sks_guess_lsb", "SKS-GUESS-LSB", 1, 0, false);
        declareFunction(me, "sks_guess_tsb", "SKS-GUESS-TSB", 1, 0, false);
        declareFunction(me, "sksi_psb_get_schemata", "SKSI-PSB-GET-SCHEMATA", 1, 0, false);
        declareFunction(me, "sksi_psb_get_labeled_schemata", "SKSI-PSB-GET-LABELED-SCHEMATA", 1, 0, false);
        declareFunction(me, "sksi_lsb_get_schemata", "SKSI-LSB-GET-SCHEMATA", 1, 0, false);
        declareFunction(me, "sksi_tsb_get_translation_pairs", "SKSI-TSB-GET-TRANSLATION-PAIRS", 1, 0, false);
        declareFunction(me, "sksi_tsb_get_lss_for_pss", "SKSI-TSB-GET-LSS-FOR-PSS", 1, 0, false);
        declareFunction(me, "sksi_sks_get_translations", "SKSI-SKS-GET-TRANSLATIONS", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_sksi_smt_file() {
        defparameter("*ALLOW-SMT-EDITING-LINKS*", NIL);
        deflexical("*SKSI-SMT-SD-PARAMETERS*", $list122);
        deflexical("*SKSI-SMT-COMPILE-PARAM-DEFINITIONS-CACHING-STATE*", NIL);
        deflexical("*SKSI-SMT-MODE*", $ENABLED);
        deflexical("*SKSI-SMT-COLUMN-OR-FORT-NAME-CACHING-STATE*", NIL);
        defparameter("*SKSI-SMT-WARN-ABOUT-INVARIANTS?*", NIL);
        deflexical("*SKSI-ISG*", SubLTrampolineFile.maybeDefault($sksi_isg$, $sksi_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_sksi_smt_file() {
        setup_cb_link_method($EDIT_IN_SMT, CB_LINK_EDIT_IN_SMT, TWO_INTEGER);
        setup_cb_link_method($SMT, CB_LINK_SMT, ONE_INTEGER);
        declare_cb_tool($SMT, $$$SMT, $$$SMT, $$$Schema_Modeling_Tool);
        html_macros.note_cgi_handler_function(SKSI_SMT, $HTML_HANDLER);
        register_external_symbol(SKSI_SMT_UPDATE_SOURCE_DESCRIPTION);
        register_external_symbol(SKSI_SMT_COMPILE_SOURCE_DESCRIPTION);
        memoization_state.note_globally_cached_function(SKSI_SMT_COMPILE_PARAM_DEFINITIONS);
        register_external_symbol(SKSI_SMT_REGISTER_STRUCTURED_KNOWLEDGE_SOURCE);
        register_external_symbol($sym148$SKSI_SMT_STRUCTURED_KNOWLEDGE_SOURCE_REGISTERED_);
        register_external_symbol(SKSI_PS_COMPILE_PFS_INFO);
        register_external_symbol(SKSI_SMT_FETCH_SIMPLE_LOGICAL_SCHEMATA);
        register_external_symbol(SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMATA);
        register_external_symbol(SKSI_SMT_RETRIEVE_SIMPLE_LOGICAL_SCHEMA);
        register_external_symbol(ENABLE_SKSI_SMT_MODE);
        register_external_symbol(DISABLE_SKSI_SMT_MODE);
        register_external_symbol($sym193$IS_SKSI_SMT_MODE_ENABLED_);
        register_external_symbol(GET_SKSI_SMT_MODE);
        register_external_symbol(SKSI_SMT_GET_UNITS_OF_MEASUREMENT);
        register_external_symbol(SKSI_SMT_DERIVE_SIMPLE_LOGICAL_SCHEMA);
        memoization_state.note_globally_cached_function(SKSI_SMT_COLUMN_OR_FORT_NAME);
        register_html_state_variable($sym312$_SKSI_SMT_WARN_ABOUT_INVARIANTS__);
        declare_defglobal($sksi_isg$);
        register_external_symbol(DECODE_PHYSICAL_STRUCTURE_OF_SKS);
        register_external_symbol(NEW_STRUCTURED_KNOWLEDGE_SOURCE);
        register_external_symbol(NEW_CONCEPTUAL_MAPPING_LOGICAL_SCHEMA);
        register_external_symbol(SKSI_SMT_GET_AVAILABLE_DATABASE_TYPES);
        register_external_symbol(SKSI_PSB_GET_LABELED_SCHEMATA);
        return NIL;
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

































































































































































































































































































































































































    }
}

/**
 * Total time: 3904 ms synthetic
 */
