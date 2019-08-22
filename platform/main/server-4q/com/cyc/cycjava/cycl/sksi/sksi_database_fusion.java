package com.cyc.cycjava.cycl.sksi;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.create_sks.sksi_create_sks;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_database_fusion extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_database_fusion();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_database_fusion";

    public static final String myFingerPrint = "3173e658d108a70f8f9bba595707195dd704b226d40a97091c9fae7104af4d80";

    // defparameter
    // Definitions
    private static final SubLSymbol $within_sksi_database_fusionP$ = makeSymbol("*WITHIN-SKSI-DATABASE-FUSION?*");

    // defvar
    private static final SubLSymbol $sksi_database_fusion_debugP$ = makeSymbol("*SKSI-DATABASE-FUSION-DEBUG?*");



    // defconstant
    public static final SubLSymbol $dtp_db_info$ = makeSymbol("*DTP-DB-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_table_info$ = makeSymbol("*DTP-TABLE-INFO*");



    // defparameter
    private static final SubLSymbol $current_table_info_variable_count$ = makeSymbol("*CURRENT-TABLE-INFO-VARIABLE-COUNT*");

    // defparameter
    private static final SubLSymbol $table_info_lfi_variable_dict$ = makeSymbol("*TABLE-INFO-LFI-VARIABLE-DICT*");

    // defparameter
    private static final SubLSymbol $table_infoify_expression_table_kb_index$ = makeSymbol("*TABLE-INFOIFY-EXPRESSION-TABLE-KB-INDEX*");

    // defparameter
    private static final SubLSymbol $kbify_expression_kb_table_index$ = makeSymbol("*KBIFY-EXPRESSION-KB-TABLE-INDEX*");

    // Internal Constants
    public static final SubLSymbol $sksi_database_fusion_table_info_isg$ = makeSymbol("*SKSI-DATABASE-FUSION-TABLE-INFO-ISG*");

    public static final SubLSymbol DB_INFO = makeSymbol("DB-INFO");

    public static final SubLSymbol DB_INFO_P = makeSymbol("DB-INFO-P");

    public static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("CONSTANT-BASE-NAME"), makeSymbol("DB-NAME"), makeSymbol("TABLE-INFOS"), makeSymbol("TABLE-INFO-INDEX"), makeSymbol("SERVER"), makeSymbol("PORT"), makeSymbol("PROXY-HOST"), makeSymbol("PROXY-PORT"), makeSymbol("USER"), makeSymbol("PASS"), makeSymbol("SUBPROTOCOL"), makeSymbol("SQL-FLAVOR"), makeSymbol("QUOTED-ISAS"), makeSymbol("INPUT-MT"), makeSymbol("CONTENT-GENL-MTS") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("CONSTANT-BASE-NAME"), makeKeyword("DB-NAME"), makeKeyword("TABLE-INFOS"), makeKeyword("TABLE-INFO-INDEX"), makeKeyword("SERVER"), makeKeyword("PORT"), makeKeyword("PROXY-HOST"), makeKeyword("PROXY-PORT"), makeKeyword("USER"), makeKeyword("PASS"), makeKeyword("SUBPROTOCOL"), makeKeyword("SQL-FLAVOR"), makeKeyword("QUOTED-ISAS"), makeKeyword("INPUT-MT"), makeKeyword("CONTENT-GENL-MTS") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("DBNFO-CONSTANT-BASE-NAME"), makeSymbol("DBNFO-DB-NAME"), makeSymbol("DBNFO-TABLE-INFOS"), makeSymbol("DBNFO-TABLE-INFO-INDEX"), makeSymbol("DBNFO-SERVER"), makeSymbol("DBNFO-PORT"), makeSymbol("DBNFO-PROXY-HOST"), makeSymbol("DBNFO-PROXY-PORT"), makeSymbol("DBNFO-USER"), makeSymbol("DBNFO-PASS"), makeSymbol("DBNFO-SUBPROTOCOL"), makeSymbol("DBNFO-SQL-FLAVOR"), makeSymbol("DBNFO-QUOTED-ISAS"), makeSymbol("DBNFO-INPUT-MT"), makeSymbol("DBNFO-CONTENT-GENL-MTS") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-DBNFO-CONSTANT-BASE-NAME"), makeSymbol("_CSETF-DBNFO-DB-NAME"), makeSymbol("_CSETF-DBNFO-TABLE-INFOS"), makeSymbol("_CSETF-DBNFO-TABLE-INFO-INDEX"), makeSymbol("_CSETF-DBNFO-SERVER"), makeSymbol("_CSETF-DBNFO-PORT"), makeSymbol("_CSETF-DBNFO-PROXY-HOST"), makeSymbol("_CSETF-DBNFO-PROXY-PORT"), makeSymbol("_CSETF-DBNFO-USER"), makeSymbol("_CSETF-DBNFO-PASS"), makeSymbol("_CSETF-DBNFO-SUBPROTOCOL"), makeSymbol("_CSETF-DBNFO-SQL-FLAVOR"), makeSymbol("_CSETF-DBNFO-QUOTED-ISAS"), makeSymbol("_CSETF-DBNFO-INPUT-MT"), makeSymbol("_CSETF-DBNFO-CONTENT-GENL-MTS") });

    public static final SubLSymbol PRINT_DB_INFO = makeSymbol("PRINT-DB-INFO");

    public static final SubLSymbol DB_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DB-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DB-INFO-P"));

    private static final SubLSymbol DBNFO_CONSTANT_BASE_NAME = makeSymbol("DBNFO-CONSTANT-BASE-NAME");

    private static final SubLSymbol _CSETF_DBNFO_CONSTANT_BASE_NAME = makeSymbol("_CSETF-DBNFO-CONSTANT-BASE-NAME");

    private static final SubLSymbol DBNFO_DB_NAME = makeSymbol("DBNFO-DB-NAME");

    private static final SubLSymbol _CSETF_DBNFO_DB_NAME = makeSymbol("_CSETF-DBNFO-DB-NAME");

    private static final SubLSymbol DBNFO_TABLE_INFOS = makeSymbol("DBNFO-TABLE-INFOS");

    private static final SubLSymbol _CSETF_DBNFO_TABLE_INFOS = makeSymbol("_CSETF-DBNFO-TABLE-INFOS");

    private static final SubLSymbol DBNFO_TABLE_INFO_INDEX = makeSymbol("DBNFO-TABLE-INFO-INDEX");

    private static final SubLSymbol _CSETF_DBNFO_TABLE_INFO_INDEX = makeSymbol("_CSETF-DBNFO-TABLE-INFO-INDEX");

    private static final SubLSymbol DBNFO_SERVER = makeSymbol("DBNFO-SERVER");

    private static final SubLSymbol _CSETF_DBNFO_SERVER = makeSymbol("_CSETF-DBNFO-SERVER");

    private static final SubLSymbol DBNFO_PORT = makeSymbol("DBNFO-PORT");

    private static final SubLSymbol _CSETF_DBNFO_PORT = makeSymbol("_CSETF-DBNFO-PORT");

    private static final SubLSymbol DBNFO_PROXY_HOST = makeSymbol("DBNFO-PROXY-HOST");

    private static final SubLSymbol _CSETF_DBNFO_PROXY_HOST = makeSymbol("_CSETF-DBNFO-PROXY-HOST");

    private static final SubLSymbol DBNFO_PROXY_PORT = makeSymbol("DBNFO-PROXY-PORT");

    private static final SubLSymbol _CSETF_DBNFO_PROXY_PORT = makeSymbol("_CSETF-DBNFO-PROXY-PORT");

    private static final SubLSymbol DBNFO_USER = makeSymbol("DBNFO-USER");

    private static final SubLSymbol _CSETF_DBNFO_USER = makeSymbol("_CSETF-DBNFO-USER");

    private static final SubLSymbol DBNFO_PASS = makeSymbol("DBNFO-PASS");

    private static final SubLSymbol _CSETF_DBNFO_PASS = makeSymbol("_CSETF-DBNFO-PASS");

    private static final SubLSymbol DBNFO_SUBPROTOCOL = makeSymbol("DBNFO-SUBPROTOCOL");

    private static final SubLSymbol _CSETF_DBNFO_SUBPROTOCOL = makeSymbol("_CSETF-DBNFO-SUBPROTOCOL");

    private static final SubLSymbol DBNFO_SQL_FLAVOR = makeSymbol("DBNFO-SQL-FLAVOR");

    private static final SubLSymbol _CSETF_DBNFO_SQL_FLAVOR = makeSymbol("_CSETF-DBNFO-SQL-FLAVOR");

    private static final SubLSymbol DBNFO_QUOTED_ISAS = makeSymbol("DBNFO-QUOTED-ISAS");

    private static final SubLSymbol _CSETF_DBNFO_QUOTED_ISAS = makeSymbol("_CSETF-DBNFO-QUOTED-ISAS");

    private static final SubLSymbol DBNFO_INPUT_MT = makeSymbol("DBNFO-INPUT-MT");

    private static final SubLSymbol _CSETF_DBNFO_INPUT_MT = makeSymbol("_CSETF-DBNFO-INPUT-MT");

    private static final SubLSymbol DBNFO_CONTENT_GENL_MTS = makeSymbol("DBNFO-CONTENT-GENL-MTS");

    private static final SubLSymbol _CSETF_DBNFO_CONTENT_GENL_MTS = makeSymbol("_CSETF-DBNFO-CONTENT-GENL-MTS");

    private static final SubLSymbol $CONSTANT_BASE_NAME = makeKeyword("CONSTANT-BASE-NAME");





    private static final SubLSymbol $TABLE_INFO_INDEX = makeKeyword("TABLE-INFO-INDEX");





















    private static final SubLSymbol $CONTENT_GENL_MTS = makeKeyword("CONTENT-GENL-MTS");

    private static final SubLString $str55$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_DB_INFO = makeSymbol("MAKE-DB-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DB_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DB-INFO-METHOD");

    private static final SubLString $str61$_DB_INFO__a_ = makeString("<DB-INFO ~a>");













    private static final SubLSymbol TABLE_INFO_P = makeSymbol("TABLE-INFO-P");

    private static final SubLString $str69$_KS = makeString("-KS");

    private static final SubLString $str70$_s__ = makeString("~s~%");

    private static final SubLString $str71$db_name___s__ = makeString("db-name: ~s~%");

    private static final SubLString $str72$server___s__ = makeString("server: ~s~%");

    private static final SubLString $str73$port___s__ = makeString("port: ~s~%");

    private static final SubLString $str74$proxy_host___s__ = makeString("proxy-host: ~s~%");

    private static final SubLString $str75$proxy_port___s__ = makeString("proxy-port: ~s~%");

    private static final SubLString $str76$user___s__ = makeString("user: ~s~%");

    private static final SubLString $str77$pass___s__ = makeString("pass: ~s~%");

    private static final SubLString $str78$subprotocol___s__ = makeString("subprotocol: ~s~%");

    private static final SubLString $str79$sql_flavor___s__ = makeString("sql-flavor: ~s~%");

    private static final SubLString $str80$quoted_isas___s__ = makeString("quoted-isas: ~s~%");

    private static final SubLString $str81$input_mt___s__ = makeString("input-mt: ~s~%");

    private static final SubLString $str82$content_genl_mts___s__ = makeString("content-genl-mts: ~s~%");

    private static final SubLSymbol TABLE_INFO = makeSymbol("TABLE-INFO");

    private static final SubLList $list84 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("CONSTANT-BASE-NAME"), makeSymbol("TABLE-NAME"), makeSymbol("ISAS"), makeSymbol("LF-TYPES"), makeSymbol("FIELD-MAPPINGS"), makeSymbol("MEANING-SENTENCES"), makeSymbol("ENUMERABLE?"), makeSymbol("FIELD-NAMES"), makeSymbol("FIELD-TYPES"), makeSymbol("PRIMARY-KEY"), makeSymbol("INDEXES"), makeSymbol("FIELD-ENCODINGS"), makeSymbol("FIELD-DECODINGS"), makeSymbol("FOREIGN-KEY-MAPS"), makeSymbol("NON-NULL-FIELD-LIST"), makeSymbol("UNIQUE-FIELD-TUPLES") });

    private static final SubLList $list85 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("CONSTANT-BASE-NAME"), makeKeyword("TABLE-NAME"), makeKeyword("ISAS"), makeKeyword("LF-TYPES"), makeKeyword("FIELD-MAPPINGS"), makeKeyword("MEANING-SENTENCES"), makeKeyword("ENUMERABLE?"), makeKeyword("FIELD-NAMES"), makeKeyword("FIELD-TYPES"), makeKeyword("PRIMARY-KEY"), makeKeyword("INDEXES"), makeKeyword("FIELD-ENCODINGS"), makeKeyword("FIELD-DECODINGS"), makeKeyword("FOREIGN-KEY-MAPS"), makeKeyword("NON-NULL-FIELD-LIST"), makeKeyword("UNIQUE-FIELD-TUPLES") });

    private static final SubLList $list86 = list(new SubLObject[]{ makeSymbol("TBLNFO-ID"), makeSymbol("TBLNFO-CONSTANT-BASE-NAME"), makeSymbol("TBLNFO-TABLE-NAME"), makeSymbol("TBLNFO-ISAS"), makeSymbol("TBLNFO-LF-TYPES"), makeSymbol("TBLNFO-FIELD-MAPPINGS"), makeSymbol("TBLNFO-MEANING-SENTENCES"), makeSymbol("TBLNFO-ENUMERABLE?"), makeSymbol("TBLNFO-FIELD-NAMES"), makeSymbol("TBLNFO-FIELD-TYPES"), makeSymbol("TBLNFO-PRIMARY-KEY"), makeSymbol("TBLNFO-INDEXES"), makeSymbol("TBLNFO-FIELD-ENCODINGS"), makeSymbol("TBLNFO-FIELD-DECODINGS"), makeSymbol("TBLNFO-FOREIGN-KEY-MAPS"), makeSymbol("TBLNFO-NON-NULL-FIELD-LIST"), makeSymbol("TBLNFO-UNIQUE-FIELD-TUPLES") });

    private static final SubLList $list87 = list(new SubLObject[]{ makeSymbol("_CSETF-TBLNFO-ID"), makeSymbol("_CSETF-TBLNFO-CONSTANT-BASE-NAME"), makeSymbol("_CSETF-TBLNFO-TABLE-NAME"), makeSymbol("_CSETF-TBLNFO-ISAS"), makeSymbol("_CSETF-TBLNFO-LF-TYPES"), makeSymbol("_CSETF-TBLNFO-FIELD-MAPPINGS"), makeSymbol("_CSETF-TBLNFO-MEANING-SENTENCES"), makeSymbol("_CSETF-TBLNFO-ENUMERABLE?"), makeSymbol("_CSETF-TBLNFO-FIELD-NAMES"), makeSymbol("_CSETF-TBLNFO-FIELD-TYPES"), makeSymbol("_CSETF-TBLNFO-PRIMARY-KEY"), makeSymbol("_CSETF-TBLNFO-INDEXES"), makeSymbol("_CSETF-TBLNFO-FIELD-ENCODINGS"), makeSymbol("_CSETF-TBLNFO-FIELD-DECODINGS"), makeSymbol("_CSETF-TBLNFO-FOREIGN-KEY-MAPS"), makeSymbol("_CSETF-TBLNFO-NON-NULL-FIELD-LIST"), makeSymbol("_CSETF-TBLNFO-UNIQUE-FIELD-TUPLES") });

    private static final SubLSymbol PRINT_TABLE_INFO = makeSymbol("PRINT-TABLE-INFO");

    private static final SubLSymbol TABLE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TABLE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list90 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TABLE-INFO-P"));

    private static final SubLSymbol TBLNFO_ID = makeSymbol("TBLNFO-ID");

    private static final SubLSymbol _CSETF_TBLNFO_ID = makeSymbol("_CSETF-TBLNFO-ID");

    private static final SubLSymbol TBLNFO_CONSTANT_BASE_NAME = makeSymbol("TBLNFO-CONSTANT-BASE-NAME");

    private static final SubLSymbol _CSETF_TBLNFO_CONSTANT_BASE_NAME = makeSymbol("_CSETF-TBLNFO-CONSTANT-BASE-NAME");

    private static final SubLSymbol TBLNFO_TABLE_NAME = makeSymbol("TBLNFO-TABLE-NAME");

    private static final SubLSymbol _CSETF_TBLNFO_TABLE_NAME = makeSymbol("_CSETF-TBLNFO-TABLE-NAME");

    private static final SubLSymbol TBLNFO_ISAS = makeSymbol("TBLNFO-ISAS");

    private static final SubLSymbol _CSETF_TBLNFO_ISAS = makeSymbol("_CSETF-TBLNFO-ISAS");

    private static final SubLSymbol TBLNFO_LF_TYPES = makeSymbol("TBLNFO-LF-TYPES");

    private static final SubLSymbol _CSETF_TBLNFO_LF_TYPES = makeSymbol("_CSETF-TBLNFO-LF-TYPES");

    private static final SubLSymbol TBLNFO_FIELD_MAPPINGS = makeSymbol("TBLNFO-FIELD-MAPPINGS");

    private static final SubLSymbol _CSETF_TBLNFO_FIELD_MAPPINGS = makeSymbol("_CSETF-TBLNFO-FIELD-MAPPINGS");

    private static final SubLSymbol TBLNFO_MEANING_SENTENCES = makeSymbol("TBLNFO-MEANING-SENTENCES");

    private static final SubLSymbol _CSETF_TBLNFO_MEANING_SENTENCES = makeSymbol("_CSETF-TBLNFO-MEANING-SENTENCES");

    private static final SubLSymbol $sym105$TBLNFO_ENUMERABLE_ = makeSymbol("TBLNFO-ENUMERABLE?");

    private static final SubLSymbol $sym106$_CSETF_TBLNFO_ENUMERABLE_ = makeSymbol("_CSETF-TBLNFO-ENUMERABLE?");

    private static final SubLSymbol TBLNFO_FIELD_NAMES = makeSymbol("TBLNFO-FIELD-NAMES");

    private static final SubLSymbol _CSETF_TBLNFO_FIELD_NAMES = makeSymbol("_CSETF-TBLNFO-FIELD-NAMES");

    private static final SubLSymbol TBLNFO_FIELD_TYPES = makeSymbol("TBLNFO-FIELD-TYPES");

    private static final SubLSymbol _CSETF_TBLNFO_FIELD_TYPES = makeSymbol("_CSETF-TBLNFO-FIELD-TYPES");

    private static final SubLSymbol TBLNFO_PRIMARY_KEY = makeSymbol("TBLNFO-PRIMARY-KEY");

    private static final SubLSymbol _CSETF_TBLNFO_PRIMARY_KEY = makeSymbol("_CSETF-TBLNFO-PRIMARY-KEY");

    private static final SubLSymbol TBLNFO_INDEXES = makeSymbol("TBLNFO-INDEXES");

    private static final SubLSymbol _CSETF_TBLNFO_INDEXES = makeSymbol("_CSETF-TBLNFO-INDEXES");

    private static final SubLSymbol TBLNFO_FIELD_ENCODINGS = makeSymbol("TBLNFO-FIELD-ENCODINGS");

    private static final SubLSymbol _CSETF_TBLNFO_FIELD_ENCODINGS = makeSymbol("_CSETF-TBLNFO-FIELD-ENCODINGS");

    private static final SubLSymbol TBLNFO_FIELD_DECODINGS = makeSymbol("TBLNFO-FIELD-DECODINGS");

    private static final SubLSymbol _CSETF_TBLNFO_FIELD_DECODINGS = makeSymbol("_CSETF-TBLNFO-FIELD-DECODINGS");

    private static final SubLSymbol TBLNFO_FOREIGN_KEY_MAPS = makeSymbol("TBLNFO-FOREIGN-KEY-MAPS");

    private static final SubLSymbol _CSETF_TBLNFO_FOREIGN_KEY_MAPS = makeSymbol("_CSETF-TBLNFO-FOREIGN-KEY-MAPS");

    private static final SubLSymbol TBLNFO_NON_NULL_FIELD_LIST = makeSymbol("TBLNFO-NON-NULL-FIELD-LIST");

    private static final SubLSymbol _CSETF_TBLNFO_NON_NULL_FIELD_LIST = makeSymbol("_CSETF-TBLNFO-NON-NULL-FIELD-LIST");

    private static final SubLSymbol TBLNFO_UNIQUE_FIELD_TUPLES = makeSymbol("TBLNFO-UNIQUE-FIELD-TUPLES");

    private static final SubLSymbol _CSETF_TBLNFO_UNIQUE_FIELD_TUPLES = makeSymbol("_CSETF-TBLNFO-UNIQUE-FIELD-TUPLES");



























    private static final SubLSymbol $FOREIGN_KEY_MAPS = makeKeyword("FOREIGN-KEY-MAPS");

    private static final SubLSymbol $NON_NULL_FIELD_LIST = makeKeyword("NON-NULL-FIELD-LIST");

    private static final SubLSymbol $UNIQUE_FIELD_TUPLES = makeKeyword("UNIQUE-FIELD-TUPLES");

    private static final SubLSymbol MAKE_TABLE_INFO = makeSymbol("MAKE-TABLE-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TABLE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-INFO-METHOD");

    private static final SubLString $str143$_TABLE_INFO__a___a_ = makeString("<TABLE-INFO ~a: ~a>");

    private static final SubLSymbol TABLE_INFO_ID_P = makeSymbol("TABLE-INFO-ID-P");

    private static final SubLSymbol TABLE_INFO_FIELD_MAPPING_P = makeSymbol("TABLE-INFO-FIELD-MAPPING-P");





    private static final SubLSymbol TABLE_INFO_FIELD_ENCODING_P = makeSymbol("TABLE-INFO-FIELD-ENCODING-P");

    private static final SubLSymbol TABLE_INFO_FIELD_DECODING_P = makeSymbol("TABLE-INFO-FIELD-DECODING-P");

    private static final SubLSymbol TABLE_INFO_FOREIGN_KEY_MAP_P = makeSymbol("TABLE-INFO-FOREIGN-KEY-MAP-P");

    private static final SubLString $str151$_LS = makeString("-LS");

    private static final SubLString $str152$_PS = makeString("-PS");

    private static final SubLString $str153$table_name__s__ = makeString("table-name ~s~%");

    private static final SubLString $str154$isas___s__ = makeString("isas: ~s~%");

    private static final SubLString $str155$LF_types___s__ = makeString("LF types: ~s~%");

    private static final SubLString $str156$field_mappings__s__ = makeString("field-mappings ~s~%");

    private static final SubLString $str157$meaning_sentences___s__ = makeString("meaning sentences: ~s~%");

    private static final SubLString $str158$enumerable___s__ = makeString("enumerable? ~s~%");

    private static final SubLString $str159$field_names__s__ = makeString("field-names ~s~%");

    private static final SubLString $str160$field_types__s__ = makeString("field-types ~s~%");

    private static final SubLString $str161$primary_key__s__ = makeString("primary-key ~s~%");

    private static final SubLString $str162$indexes__s__ = makeString("indexes ~s~%");

    private static final SubLString $str163$field_encodings__s__ = makeString("field-encodings ~s~%");

    private static final SubLString $str164$field_decodings__s__ = makeString("field-decodings ~s~%");

    private static final SubLString $str165$foreign_key_maps__s__ = makeString("foreign-key-maps ~s~%");

    private static final SubLString $str166$non_null_field_list__s__ = makeString("non-null-field-list ~s~%");

    private static final SubLString $str167$unique_field_tuples__s__ = makeString("unique-field-tuples ~s~%");















    private static final SubLSymbol $last_db_info$ = makeSymbol("*LAST-DB-INFO*");



    private static final SubLSymbol VALID_SKSI_ERROR_HANDLING_MODE_P = makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P");

    private static final SubLObject $$cloneOfSKS = reader_make_constant_shell(makeString("cloneOfSKS"));



    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));

    private static final SubLString $str181$_Cloned = makeString("-Cloned");

    private static final SubLString $str182$_cloned = makeString("_cloned");

    private static final SubLString $str183$ = makeString("");

    private static final SubLString $str184$_ = makeString("_");

    private static final SubLObject $$ContentMtFn = reader_make_constant_shell(makeString("ContentMtFn"));

    private static final SubLObject $$sksiSaturateRule = reader_make_constant_shell(makeString("sksiSaturateRule"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P = makeSymbol("TABLE-INFO-LOGICAL-FIELD-INDEXICAL-P");

    private static final SubLSymbol VARIABLIZE_TABLE_INFO_LFI = makeSymbol("VARIABLIZE-TABLE-INFO-LFI");

    private static final SubLString $str191$_Fused = makeString("-Fused");

    private static final SubLString $$$1 = makeString("1");

    private static final SubLString $$$2 = makeString("2");

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLString $str195$_s_misindexed_under__s_instead_of = makeString("~s misindexed under ~s instead of ~s");

    private static final SubLSymbol PHYSICAL_FIELD_NAME = makeSymbol("PHYSICAL-FIELD-NAME");

    private static final SubLSymbol PHYSICAL_FIELD_DATA_TYPE = makeSymbol("PHYSICAL-FIELD-DATA-TYPE");

    private static final SubLSymbol MAPCAR_PHYSICAL_FIELD_NAME = makeSymbol("MAPCAR-PHYSICAL-FIELD-NAME");

    private static final SubLList $list199 = list(makeSymbol("PF"), makeSymbol("LS"), makeSymbol("RECIPE"));

    private static final SubLString $str200$Can_t_handle_fieldEncoding_for__s = makeString("Can't handle fieldEncoding for ~s that cross-references ~s");

    private static final SubLSymbol TABLE_INFOIFIABLE_P = makeSymbol("TABLE-INFOIFIABLE-P");

    private static final SubLSymbol TABLE_INFOIFY_OBJECT = makeSymbol("TABLE-INFOIFY-OBJECT");

    private static final SubLString $str203$Can_t_table_infoify__s = makeString("Can't table-infoify ~s");

    private static final SubLList $list204 = list(makeSymbol("LFI"), makeSymbol("PS"), makeSymbol("RECIPE"));

    private static final SubLString $str205$Can_t_handle_fieldDecoding_for__s = makeString("Can't handle fieldDecoding for ~s that cross-references ~s");

    private static final SubLList $list206 = list(makeSymbol("PFS"), makeSymbol("FOREIGN-PS"), makeSymbol("FOREIGN-PFS"));

    private static final SubLString $str207$Got_physical_schema__s__expected_ = makeString("Got physical schema ~s, expected ~s");

    private static final SubLString $str208$Fused_ = makeString("Fused-");

    private static final SubLList $list209 = list(makeSymbol("KS"), makeSymbol("LS"), makeSymbol("PS"));

    private static final SubLObject $$sksRepresentationComplete = reader_make_constant_shell(makeString("sksRepresentationComplete"));

    private static final SubLObject $$termDependsOn = reader_make_constant_shell(makeString("termDependsOn"));

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list214 = list(reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel")));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$mappingMt = reader_make_constant_shell(makeString("mappingMt"));

    private static final SubLString $str217$Could_not_find_the_content_mt_hea = makeString("Could not find the content mt head for ~s");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$userNameForSKS = reader_make_constant_shell(makeString("userNameForSKS"));

    private static final SubLObject $$passwordForSKS = reader_make_constant_shell(makeString("passwordForSKS"));

    private static final SubLObject $$serverOfSKS = reader_make_constant_shell(makeString("serverOfSKS"));

    private static final SubLObject $$portNumberForSKS = reader_make_constant_shell(makeString("portNumberForSKS"));

    private static final SubLObject $$sksProxyHost = reader_make_constant_shell(makeString("sksProxyHost"));

    private static final SubLObject $$sksProxyPort = reader_make_constant_shell(makeString("sksProxyPort"));

    private static final SubLObject $$subProtocolForSKS = reader_make_constant_shell(makeString("subProtocolForSKS"));

    private static final SubLObject $$sqlProgramForSKS = reader_make_constant_shell(makeString("sqlProgramForSKS"));

    private static final SubLObject $$ObjectDefiningSchema = reader_make_constant_shell(makeString("ObjectDefiningSchema"));

    private static final SubLObject $$LogicalSchema = reader_make_constant_shell(makeString("LogicalSchema"));

    private static final SubLObject $$logicalSchemaSourceMap = reader_make_constant_shell(makeString("logicalSchemaSourceMap"));

    private static final SubLObject $$logicalSchemaFieldTypeList = reader_make_constant_shell(makeString("logicalSchemaFieldTypeList"));

    private static final SubLList $list231 = list(makeSymbol("TABLE-INFO-LF"), makeSymbol("MAP"));

    private static final SubLObject $$logicalFieldMapping = reader_make_constant_shell(makeString("logicalFieldMapping"));

    private static final SubLObject $$schemaIsa = reader_make_constant_shell(makeString("schemaIsa"));

    private static final SubLObject $$meaningSentenceOfSchema = reader_make_constant_shell(makeString("meaningSentenceOfSchema"));

    private static final SubLString $str235$Can_t_kbify__s = makeString("Can't kbify ~s");

    public static final SubLList $list236 = list(makeSymbol("KS-TOKEN"), makeSymbol("TABLE-INFO-ID"));

    private static final SubLList $list237 = list(makeSymbol("LS-TOKEN"), makeSymbol("TABLE-INFO-ID"));

    public static final SubLList $list238 = list(makeSymbol("PS-TOKEN"), makeSymbol("TABLE-INFO-ID"));

    private static final SubLSymbol KBIFIABLE_P = makeSymbol("KBIFIABLE-P");

    private static final SubLSymbol KBIFY_OBJECT = makeSymbol("KBIFY-OBJECT");

    private static final SubLList $list241 = list(makeSymbol("LFI"), makeSymbol("TABLE-INFO-ID"), makeSymbol("COL"), makeSymbol("I"));

    private static final SubLObject $$TheLogicalFieldValueFn = reader_make_constant_shell(makeString("TheLogicalFieldValueFn"));

    private static final SubLList $list243 = list(makeSymbol("LF"), makeSymbol("TABLE-INFO-ID"), makeSymbol("COL"), makeSymbol("I"));

    private static final SubLObject $$LogicalFieldFn = reader_make_constant_shell(makeString("LogicalFieldFn"));

    private static final SubLList $list245 = list(makeSymbol("PFI"), makeSymbol("TABLE-INFO-ID"), makeSymbol("FIELD-NAME"));

    private static final SubLObject $$ThePhysicalFieldValueFn = reader_make_constant_shell(makeString("ThePhysicalFieldValueFn"));

    private static final SubLList $list247 = list(reader_make_constant_shell(makeString("PhysicalSchema")));

    private static final SubLObject $$physicalSchemaSourceMap = reader_make_constant_shell(makeString("physicalSchemaSourceMap"));

    private static final SubLObject $$logicalPhysicalSchemaMap = reader_make_constant_shell(makeString("logicalPhysicalSchemaMap"));

    private static final SubLObject $$enumerableSchema = reader_make_constant_shell(makeString("enumerableSchema"));

    private static final SubLObject $$schemaFieldNameList = reader_make_constant_shell(makeString("schemaFieldNameList"));

    private static final SubLObject $$fieldDataType = reader_make_constant_shell(makeString("fieldDataType"));

    private static final SubLObject $$primaryKey = reader_make_constant_shell(makeString("primaryKey"));

    private static final SubLObject $$indexedFields = reader_make_constant_shell(makeString("indexedFields"));

    private static final SubLList $list255 = list(makeSymbol("FIELD-NAME"), makeSymbol("ENCODING"));

    private static final SubLObject $$fieldEncoding = reader_make_constant_shell(makeString("fieldEncoding"));

    private static final SubLList $list257 = list(makeSymbol("TABLE-INFO-LFI"), makeSymbol("DECODING"));

    private static final SubLObject $$fieldDecoding = reader_make_constant_shell(makeString("fieldDecoding"));

    private static final SubLObject $$nonNullFieldList = reader_make_constant_shell(makeString("nonNullFieldList"));

    private static final SubLObject $$uniqueFieldList = reader_make_constant_shell(makeString("uniqueFieldList"));

    private static final SubLString $str261$Error_getting_physical_field__s_i = makeString("Error getting physical field ~s in ~s");

    private static final SubLString $str262$Error_getting_indexical_for_physi = makeString("Error getting indexical for physical field ~s in ~s");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $$$Cloned = makeString("Cloned");

    private static final SubLString $$$BLN = makeString("BLN");



    private static final SubLObject $$sksFusionSources = reader_make_constant_shell(makeString("sksFusionSources"));

    private static final SubLSymbol SK_SOURCE_MAPPING_MT = makeSymbol("SK-SOURCE-MAPPING-MT");

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLString $str270$Name_conflict_in__s__two_tables_n = makeString("Name conflict in ~s: two tables named ~s");

    private static final SubLString $str271$_fused = makeString("_fused");

    private static final SubLSymbol ANONYMIZE_TABLE_INFO_OBJECT = makeSymbol("ANONYMIZE-TABLE-INFO-OBJECT");

    private static final SubLString $str273$Can_t_yet_handle_duplicate_LFI_ty = makeString("Can't yet handle duplicate LFI types, got ~s");

    private static final SubLList $list274 = list(makeSymbol("KEEP-LFI"), makeSymbol("KILL-LFI"));

    private static final SubLObject $$sksiSentence = reader_make_constant_shell(makeString("sksiSentence"));

    private static final SubLString $$$Fused = makeString("Fused");

    public static SubLObject within_sksi_database_fusionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_sksi_database_fusionP$.getDynamicValue(thread);
    }

    public static SubLObject sksi_database_fusion_debugP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sksi_database_fusion_debugP$.getDynamicValue(thread);
    }

    public static SubLObject db_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_db_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject db_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$db_info_native.class ? T : NIL;
    }

    public static SubLObject dbnfo_constant_base_name(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject dbnfo_db_name(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject dbnfo_table_infos(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject dbnfo_table_info_index(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject dbnfo_server(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject dbnfo_port(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject dbnfo_proxy_host(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject dbnfo_proxy_port(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject dbnfo_user(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject dbnfo_pass(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject dbnfo_subprotocol(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject dbnfo_sql_flavor(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject dbnfo_quoted_isas(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject dbnfo_input_mt(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject dbnfo_content_genl_mts(final SubLObject v_object) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.getField16();
    }

    public static SubLObject _csetf_dbnfo_constant_base_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_dbnfo_db_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_dbnfo_table_infos(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_dbnfo_table_info_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_dbnfo_server(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_dbnfo_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_dbnfo_proxy_host(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_dbnfo_proxy_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_dbnfo_user(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_dbnfo_pass(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_dbnfo_subprotocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_dbnfo_sql_flavor(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_dbnfo_quoted_isas(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_dbnfo_input_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_dbnfo_content_genl_mts(final SubLObject v_object, final SubLObject value) {
        assert NIL != db_info_p(v_object) : "sksi_database_fusion.db_info_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject make_db_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $db_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTANT_BASE_NAME)) {
                _csetf_dbnfo_constant_base_name(v_new, current_value);
            } else
                if (pcase_var.eql($DB_NAME)) {
                    _csetf_dbnfo_db_name(v_new, current_value);
                } else
                    if (pcase_var.eql($TABLE_INFOS)) {
                        _csetf_dbnfo_table_infos(v_new, current_value);
                    } else
                        if (pcase_var.eql($TABLE_INFO_INDEX)) {
                            _csetf_dbnfo_table_info_index(v_new, current_value);
                        } else
                            if (pcase_var.eql($SERVER)) {
                                _csetf_dbnfo_server(v_new, current_value);
                            } else
                                if (pcase_var.eql($PORT)) {
                                    _csetf_dbnfo_port(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PROXY_HOST)) {
                                        _csetf_dbnfo_proxy_host(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PROXY_PORT)) {
                                            _csetf_dbnfo_proxy_port(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($USER)) {
                                                _csetf_dbnfo_user(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PASS)) {
                                                    _csetf_dbnfo_pass(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($SUBPROTOCOL)) {
                                                        _csetf_dbnfo_subprotocol(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($SQL_FLAVOR)) {
                                                            _csetf_dbnfo_sql_flavor(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($QUOTED_ISAS)) {
                                                                _csetf_dbnfo_quoted_isas(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($INPUT_MT)) {
                                                                    _csetf_dbnfo_input_mt(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($CONTENT_GENL_MTS)) {
                                                                        _csetf_dbnfo_content_genl_mts(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str55$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_db_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DB_INFO, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTANT_BASE_NAME, dbnfo_constant_base_name(obj));
        funcall(visitor_fn, obj, $SLOT, $DB_NAME, dbnfo_db_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_INFOS, dbnfo_table_infos(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_INFO_INDEX, dbnfo_table_info_index(obj));
        funcall(visitor_fn, obj, $SLOT, $SERVER, dbnfo_server(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, dbnfo_port(obj));
        funcall(visitor_fn, obj, $SLOT, $PROXY_HOST, dbnfo_proxy_host(obj));
        funcall(visitor_fn, obj, $SLOT, $PROXY_PORT, dbnfo_proxy_port(obj));
        funcall(visitor_fn, obj, $SLOT, $USER, dbnfo_user(obj));
        funcall(visitor_fn, obj, $SLOT, $PASS, dbnfo_pass(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBPROTOCOL, dbnfo_subprotocol(obj));
        funcall(visitor_fn, obj, $SLOT, $SQL_FLAVOR, dbnfo_sql_flavor(obj));
        funcall(visitor_fn, obj, $SLOT, $QUOTED_ISAS, dbnfo_quoted_isas(obj));
        funcall(visitor_fn, obj, $SLOT, $INPUT_MT, dbnfo_input_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENT_GENL_MTS, dbnfo_content_genl_mts(obj));
        funcall(visitor_fn, obj, $END, MAKE_DB_INFO, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_db_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_db_info(obj, visitor_fn);
    }

    public static SubLObject print_db_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str61$_DB_INFO__a_, dbnfo_constant_base_name(v_object));
        return v_object;
    }

    public static SubLObject new_db_info(final SubLObject constant_base_name, final SubLObject db_name, final SubLObject server, final SubLObject port, final SubLObject proxy_host, final SubLObject proxy_port, final SubLObject user, final SubLObject pass, final SubLObject subprotocol, final SubLObject sql_flavor, final SubLObject quoted_isas, final SubLObject input_mt, final SubLObject content_genl_mts) {
        assert NIL != stringp(constant_base_name) : "Types.stringp(constant_base_name) " + "CommonSymbols.NIL != Types.stringp(constant_base_name) " + constant_base_name;
        assert NIL != stringp(db_name) : "Types.stringp(db_name) " + "CommonSymbols.NIL != Types.stringp(db_name) " + db_name;
        assert NIL != stringp(server) : "Types.stringp(server) " + "CommonSymbols.NIL != Types.stringp(server) " + server;
        if (((NIL != port) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.non_negative_integer_p(port))) {
            throw new AssertionError(port);
        }
        assert NIL != stringp(proxy_host) : "Types.stringp(proxy_host) " + "CommonSymbols.NIL != Types.stringp(proxy_host) " + proxy_host;
        assert NIL != subl_promotions.non_negative_integer_p(proxy_port) : "subl_promotions.non_negative_integer_p(proxy_port) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(proxy_port) " + proxy_port;
        assert NIL != stringp(user) : "Types.stringp(user) " + "CommonSymbols.NIL != Types.stringp(user) " + user;
        assert NIL != stringp(pass) : "Types.stringp(pass) " + "CommonSymbols.NIL != Types.stringp(pass) " + pass;
        assert NIL != stringp(subprotocol) : "Types.stringp(subprotocol) " + "CommonSymbols.NIL != Types.stringp(subprotocol) " + subprotocol;
        assert NIL != forts.fort_p(sql_flavor) : "forts.fort_p(sql_flavor) " + "CommonSymbols.NIL != forts.fort_p(sql_flavor) " + sql_flavor;
        assert NIL != list_utilities.non_dotted_list_p(quoted_isas) : "list_utilities.non_dotted_list_p(quoted_isas) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(quoted_isas) " + quoted_isas;
        SubLObject cdolist_list_var = quoted_isas;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.collection_p(elem) : "fort_types_interface.collection_p(elem) " + "CommonSymbols.NIL != fort_types_interface.collection_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != hlmt.hlmt_p(input_mt) : "hlmt.hlmt_p(input_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(input_mt) " + input_mt;
        assert NIL != list_utilities.non_dotted_list_p(content_genl_mts) : "list_utilities.non_dotted_list_p(content_genl_mts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(content_genl_mts) " + content_genl_mts;
        cdolist_list_var = content_genl_mts;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != hlmt.hlmt_p(elem) : "hlmt.hlmt_p(elem) " + "CommonSymbols.NIL != hlmt.hlmt_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject db_info = make_db_info(UNPROVIDED);
        _csetf_dbnfo_constant_base_name(db_info, constant_base_name);
        _csetf_dbnfo_db_name(db_info, db_name);
        _csetf_dbnfo_table_info_index(db_info, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_dbnfo_server(db_info, server);
        _csetf_dbnfo_port(db_info, port);
        _csetf_dbnfo_proxy_host(db_info, proxy_host);
        _csetf_dbnfo_proxy_port(db_info, proxy_port);
        _csetf_dbnfo_user(db_info, user);
        _csetf_dbnfo_pass(db_info, pass);
        _csetf_dbnfo_subprotocol(db_info, subprotocol);
        _csetf_dbnfo_sql_flavor(db_info, sql_flavor);
        _csetf_dbnfo_quoted_isas(db_info, quoted_isas);
        _csetf_dbnfo_input_mt(db_info, input_mt);
        _csetf_dbnfo_content_genl_mts(db_info, content_genl_mts);
        return db_info;
    }

    public static SubLObject db_info_constant_base_name(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_constant_base_name(db_info);
    }

    public static SubLObject db_info_db_name(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_db_name(db_info);
    }

    public static SubLObject db_info_table_infos(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_table_infos(db_info);
    }

    public static SubLObject db_info_table_info_index(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_table_info_index(db_info);
    }

    public static SubLObject db_info_server(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_server(db_info);
    }

    public static SubLObject db_info_port(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_port(db_info);
    }

    public static SubLObject db_info_proxy_host(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_proxy_host(db_info);
    }

    public static SubLObject db_info_proxy_port(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_proxy_port(db_info);
    }

    public static SubLObject db_info_user(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_user(db_info);
    }

    public static SubLObject db_info_pass(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_pass(db_info);
    }

    public static SubLObject db_info_subprotocol(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_subprotocol(db_info);
    }

    public static SubLObject db_info_sql_flavor(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_sql_flavor(db_info);
    }

    public static SubLObject db_info_quoted_isas(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_quoted_isas(db_info);
    }

    public static SubLObject db_info_input_mt(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_input_mt(db_info);
    }

    public static SubLObject db_info_content_genl_mts(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return dbnfo_content_genl_mts(db_info);
    }

    public static SubLObject set_db_info_constant_base_name(final SubLObject db_info, final SubLObject constant_base_name) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        assert NIL != stringp(constant_base_name) : "Types.stringp(constant_base_name) " + "CommonSymbols.NIL != Types.stringp(constant_base_name) " + constant_base_name;
        _csetf_dbnfo_constant_base_name(db_info, constant_base_name);
        return db_info;
    }

    public static SubLObject set_db_info_table_infos(final SubLObject db_info, final SubLObject table_infos) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        assert NIL != list_utilities.non_dotted_list_p(table_infos) : "list_utilities.non_dotted_list_p(table_infos) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(table_infos) " + table_infos;
        SubLObject cdolist_list_var = table_infos;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_info_p(elem) : "sksi_database_fusion.table_info_p(elem) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_dbnfo_table_infos(db_info, table_infos);
        reindex_db_info_table_infos(db_info);
        return db_info;
    }

    public static SubLObject set_db_info_db_name(final SubLObject db_info, final SubLObject db_name) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        assert NIL != stringp(db_name) : "Types.stringp(db_name) " + "CommonSymbols.NIL != Types.stringp(db_name) " + db_name;
        _csetf_dbnfo_db_name(db_info, db_name);
        return db_info;
    }

    public static SubLObject set_db_info_quoted_isas(final SubLObject db_info, final SubLObject quoted_isas) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        assert NIL != list_utilities.non_dotted_list_p(quoted_isas) : "list_utilities.non_dotted_list_p(quoted_isas) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(quoted_isas) " + quoted_isas;
        SubLObject cdolist_list_var = quoted_isas;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_dbnfo_quoted_isas(db_info, quoted_isas);
        return db_info;
    }

    public static SubLObject set_db_info_input_mt(final SubLObject db_info, final SubLObject input_mt) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        assert NIL != hlmt.hlmt_p(input_mt) : "hlmt.hlmt_p(input_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(input_mt) " + input_mt;
        _csetf_dbnfo_input_mt(db_info, input_mt);
        return db_info;
    }

    public static SubLObject set_db_info_content_genl_mts(final SubLObject db_info, final SubLObject content_genl_mts) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        assert NIL != list_utilities.non_dotted_list_p(content_genl_mts) : "list_utilities.non_dotted_list_p(content_genl_mts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(content_genl_mts) " + content_genl_mts;
        SubLObject cdolist_list_var = content_genl_mts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != hlmt.hlmt_p(elem) : "hlmt.hlmt_p(elem) " + "CommonSymbols.NIL != hlmt.hlmt_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_dbnfo_content_genl_mts(db_info, content_genl_mts);
        return db_info;
    }

    public static SubLObject db_info_ks_name(final SubLObject db_info) {
        assert NIL != db_info_p(db_info) : "sksi_database_fusion.db_info_p(db_info) " + "CommonSymbols.NIL != sksi_database_fusion.db_info_p(db_info) " + db_info;
        return cconcatenate(db_info_constant_base_name(db_info), $str69$_KS);
    }

    public static SubLObject db_info_table_info(final SubLObject db_info, final SubLObject id) {
        final SubLObject dict = db_info_table_info_index(db_info);
        return dictionary.dictionary_lookup(dict, id, UNPROVIDED);
    }

    public static SubLObject print_db_info_contents(final SubLObject db_info) {
        format(T, $str70$_s__, db_info);
        format(T, $str71$db_name___s__, db_info_db_name(db_info));
        format(T, $str72$server___s__, db_info_server(db_info));
        format(T, $str73$port___s__, db_info_port(db_info));
        format(T, $str74$proxy_host___s__, db_info_proxy_host(db_info));
        format(T, $str75$proxy_port___s__, db_info_proxy_port(db_info));
        format(T, $str76$user___s__, db_info_user(db_info));
        format(T, $str77$pass___s__, db_info_pass(db_info));
        format(T, $str78$subprotocol___s__, db_info_subprotocol(db_info));
        format(T, $str79$sql_flavor___s__, db_info_sql_flavor(db_info));
        format(T, $str80$quoted_isas___s__, db_info_quoted_isas(db_info));
        format(T, $str81$input_mt___s__, db_info_input_mt(db_info));
        format(T, $str82$content_genl_mts___s__, db_info_content_genl_mts(db_info));
        SubLObject cdolist_list_var = db_info_table_infos(db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            terpri(UNPROVIDED);
            print_table_info_contents(table_info);
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reindex_db_info_table_infos(final SubLObject db_info) {
        final SubLObject dict = db_info_table_info_index(db_info);
        dictionary.clear_dictionary(dict);
        SubLObject cdolist_list_var = db_info_table_infos(db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = table_info_id(table_info);
            dictionary.dictionary_enter(dict, id, table_info);
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return dict;
    }

    public static SubLObject table_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_table_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject table_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$table_info_native.class ? T : NIL;
    }

    public static SubLObject tblnfo_id(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject tblnfo_constant_base_name(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject tblnfo_table_name(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject tblnfo_isas(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject tblnfo_lf_types(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject tblnfo_field_mappings(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject tblnfo_meaning_sentences(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject tblnfo_enumerableP(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject tblnfo_field_names(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject tblnfo_field_types(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject tblnfo_primary_key(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject tblnfo_indexes(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject tblnfo_field_encodings(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject tblnfo_field_decodings(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject tblnfo_foreign_key_maps(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField16();
    }

    public static SubLObject tblnfo_non_null_field_list(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField17();
    }

    public static SubLObject tblnfo_unique_field_tuples(final SubLObject v_object) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.getField18();
    }

    public static SubLObject _csetf_tblnfo_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tblnfo_constant_base_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tblnfo_table_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tblnfo_isas(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tblnfo_lf_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tblnfo_field_mappings(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tblnfo_meaning_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tblnfo_enumerableP(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tblnfo_field_names(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tblnfo_field_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_tblnfo_primary_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_tblnfo_indexes(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_tblnfo_field_encodings(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_tblnfo_field_decodings(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_tblnfo_foreign_key_maps(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_tblnfo_non_null_field_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static SubLObject _csetf_tblnfo_unique_field_tuples(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_info_p(v_object) : "sksi_database_fusion.table_info_p error :" + v_object;
        return v_object.setField18(value);
    }

    public static SubLObject make_table_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $table_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_tblnfo_id(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTANT_BASE_NAME)) {
                    _csetf_tblnfo_constant_base_name(v_new, current_value);
                } else
                    if (pcase_var.eql($TABLE_NAME)) {
                        _csetf_tblnfo_table_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($ISAS)) {
                            _csetf_tblnfo_isas(v_new, current_value);
                        } else
                            if (pcase_var.eql($LF_TYPES)) {
                                _csetf_tblnfo_lf_types(v_new, current_value);
                            } else
                                if (pcase_var.eql($FIELD_MAPPINGS)) {
                                    _csetf_tblnfo_field_mappings(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MEANING_SENTENCES)) {
                                        _csetf_tblnfo_meaning_sentences(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ENUMERABLE_)) {
                                            _csetf_tblnfo_enumerableP(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FIELD_NAMES)) {
                                                _csetf_tblnfo_field_names(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($FIELD_TYPES)) {
                                                    _csetf_tblnfo_field_types(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($PRIMARY_KEY)) {
                                                        _csetf_tblnfo_primary_key(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($INDEXES)) {
                                                            _csetf_tblnfo_indexes(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($FIELD_ENCODINGS)) {
                                                                _csetf_tblnfo_field_encodings(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($FIELD_DECODINGS)) {
                                                                    _csetf_tblnfo_field_decodings(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($FOREIGN_KEY_MAPS)) {
                                                                        _csetf_tblnfo_foreign_key_maps(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($NON_NULL_FIELD_LIST)) {
                                                                            _csetf_tblnfo_non_null_field_list(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($UNIQUE_FIELD_TUPLES)) {
                                                                                _csetf_tblnfo_unique_field_tuples(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str55$Invalid_slot__S_for_construction_, current_arg);
                                                                            }
















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_table_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TABLE_INFO, SEVENTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, tblnfo_id(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTANT_BASE_NAME, tblnfo_constant_base_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_NAME, tblnfo_table_name(obj));
        funcall(visitor_fn, obj, $SLOT, $ISAS, tblnfo_isas(obj));
        funcall(visitor_fn, obj, $SLOT, $LF_TYPES, tblnfo_lf_types(obj));
        funcall(visitor_fn, obj, $SLOT, $FIELD_MAPPINGS, tblnfo_field_mappings(obj));
        funcall(visitor_fn, obj, $SLOT, $MEANING_SENTENCES, tblnfo_meaning_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $ENUMERABLE_, tblnfo_enumerableP(obj));
        funcall(visitor_fn, obj, $SLOT, $FIELD_NAMES, tblnfo_field_names(obj));
        funcall(visitor_fn, obj, $SLOT, $FIELD_TYPES, tblnfo_field_types(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIMARY_KEY, tblnfo_primary_key(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXES, tblnfo_indexes(obj));
        funcall(visitor_fn, obj, $SLOT, $FIELD_ENCODINGS, tblnfo_field_encodings(obj));
        funcall(visitor_fn, obj, $SLOT, $FIELD_DECODINGS, tblnfo_field_decodings(obj));
        funcall(visitor_fn, obj, $SLOT, $FOREIGN_KEY_MAPS, tblnfo_foreign_key_maps(obj));
        funcall(visitor_fn, obj, $SLOT, $NON_NULL_FIELD_LIST, tblnfo_non_null_field_list(obj));
        funcall(visitor_fn, obj, $SLOT, $UNIQUE_FIELD_TUPLES, tblnfo_unique_field_tuples(obj));
        funcall(visitor_fn, obj, $END, MAKE_TABLE_INFO, SEVENTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_table_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_table_info(obj, visitor_fn);
    }

    public static SubLObject print_table_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str143$_TABLE_INFO__a___a_, tblnfo_id(v_object), tblnfo_constant_base_name(v_object));
        return v_object;
    }

    public static SubLObject new_table_info(final SubLObject id, final SubLObject constant_base_name, final SubLObject isas, final SubLObject lf_types, final SubLObject field_mappings, final SubLObject meaning_sentences, final SubLObject enumerableP, final SubLObject table_name, final SubLObject field_names, final SubLObject field_types, final SubLObject primary_key, final SubLObject indexes, final SubLObject field_encodings, final SubLObject field_decodings, final SubLObject foreign_key_maps, final SubLObject non_null_field_list, final SubLObject unique_field_tuples) {
        assert NIL != table_info_id_p(id) : "sksi_database_fusion.table_info_id_p(id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(id) " + id;
        assert NIL != stringp(constant_base_name) : "Types.stringp(constant_base_name) " + "CommonSymbols.NIL != Types.stringp(constant_base_name) " + constant_base_name;
        assert NIL != list_utilities.non_dotted_list_p(isas) : "list_utilities.non_dotted_list_p(isas) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(isas) " + isas;
        SubLObject cdolist_list_var = isas;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.collection_p(elem) : "fort_types_interface.collection_p(elem) " + "CommonSymbols.NIL != fort_types_interface.collection_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(lf_types) : "list_utilities.non_dotted_list_p(lf_types) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(lf_types) " + lf_types;
        cdolist_list_var = lf_types;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.collection_p(elem) : "fort_types_interface.collection_p(elem) " + "CommonSymbols.NIL != fort_types_interface.collection_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(field_mappings) : "list_utilities.non_dotted_list_p(field_mappings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(field_mappings) " + field_mappings;
        cdolist_list_var = field_mappings;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_info_field_mapping_p(elem) : "sksi_database_fusion.table_info_field_mapping_p(elem) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_field_mapping_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(meaning_sentences) : "list_utilities.non_dotted_list_p(meaning_sentences) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(meaning_sentences) " + meaning_sentences;
        cdolist_list_var = meaning_sentences;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cycl_grammar.cycl_sentence_p(elem) : "cycl_grammar.cycl_sentence_p(elem) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(enumerableP) : "Types.booleanp(enumerableP) " + "CommonSymbols.NIL != Types.booleanp(enumerableP) " + enumerableP;
        assert NIL != stringp(table_name) : "Types.stringp(table_name) " + "CommonSymbols.NIL != Types.stringp(table_name) " + table_name;
        assert NIL != list_utilities.non_dotted_list_p(field_names) : "list_utilities.non_dotted_list_p(field_names) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(field_names) " + field_names;
        cdolist_list_var = field_names;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(field_types) : "list_utilities.non_dotted_list_p(field_types) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(field_types) " + field_types;
        cdolist_list_var = field_types;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(primary_key) : "list_utilities.non_dotted_list_p(primary_key) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(primary_key) " + primary_key;
        cdolist_list_var = primary_key;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = indexes;
        SubLObject index = NIL;
        index = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject list_var = index;
            assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
            SubLObject cdolist_list_var_$1 = list_var;
            SubLObject elem2 = NIL;
            elem2 = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                assert NIL != stringp(elem2) : "Types.stringp(elem2) " + "CommonSymbols.NIL != Types.stringp(elem2) " + elem2;
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                elem2 = cdolist_list_var_$1.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            index = cdolist_list_var2.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(field_encodings) : "list_utilities.non_dotted_list_p(field_encodings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(field_encodings) " + field_encodings;
        cdolist_list_var = field_encodings;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_info_field_encoding_p(elem) : "sksi_database_fusion.table_info_field_encoding_p(elem) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_field_encoding_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(field_decodings) : "list_utilities.non_dotted_list_p(field_decodings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(field_decodings) " + field_decodings;
        cdolist_list_var = field_decodings;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_info_field_decoding_p(elem) : "sksi_database_fusion.table_info_field_decoding_p(elem) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_field_decoding_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(foreign_key_maps) : "list_utilities.non_dotted_list_p(foreign_key_maps) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(foreign_key_maps) " + foreign_key_maps;
        cdolist_list_var = foreign_key_maps;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_info_foreign_key_map_p(elem) : "sksi_database_fusion.table_info_foreign_key_map_p(elem) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_foreign_key_map_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(non_null_field_list) : "list_utilities.non_dotted_list_p(non_null_field_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(non_null_field_list) " + non_null_field_list;
        cdolist_list_var = non_null_field_list;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        cdolist_list_var2 = unique_field_tuples;
        SubLObject unique_field_list = NIL;
        unique_field_list = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject list_var = unique_field_list;
            assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
            SubLObject cdolist_list_var_$2 = list_var;
            SubLObject elem2 = NIL;
            elem2 = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                assert NIL != stringp(elem2) : "Types.stringp(elem2) " + "CommonSymbols.NIL != Types.stringp(elem2) " + elem2;
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                elem2 = cdolist_list_var_$2.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            unique_field_list = cdolist_list_var2.first();
        } 
        final SubLObject table_info = make_table_info(UNPROVIDED);
        _csetf_tblnfo_id(table_info, id);
        _csetf_tblnfo_constant_base_name(table_info, constant_base_name);
        _csetf_tblnfo_isas(table_info, isas);
        _csetf_tblnfo_lf_types(table_info, lf_types);
        _csetf_tblnfo_field_mappings(table_info, field_mappings);
        _csetf_tblnfo_meaning_sentences(table_info, meaning_sentences);
        _csetf_tblnfo_enumerableP(table_info, enumerableP);
        _csetf_tblnfo_table_name(table_info, table_name);
        _csetf_tblnfo_field_names(table_info, field_names);
        _csetf_tblnfo_field_types(table_info, field_types);
        _csetf_tblnfo_primary_key(table_info, primary_key);
        _csetf_tblnfo_indexes(table_info, indexes);
        _csetf_tblnfo_field_encodings(table_info, field_encodings);
        _csetf_tblnfo_field_decodings(table_info, field_decodings);
        _csetf_tblnfo_foreign_key_maps(table_info, foreign_key_maps);
        _csetf_tblnfo_non_null_field_list(table_info, non_null_field_list);
        _csetf_tblnfo_unique_field_tuples(table_info, unique_field_tuples);
        return table_info;
    }

    public static SubLObject table_info_id(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_id(table_info);
    }

    public static SubLObject table_info_constant_base_name(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_constant_base_name(table_info);
    }

    public static SubLObject table_info_isas(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_isas(table_info);
    }

    public static SubLObject table_info_lf_types(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_lf_types(table_info);
    }

    public static SubLObject table_info_field_mappings(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_field_mappings(table_info);
    }

    public static SubLObject table_info_meaning_sentences(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_meaning_sentences(table_info);
    }

    public static SubLObject table_info_enumerableP(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_enumerableP(table_info);
    }

    public static SubLObject table_info_table_name(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_table_name(table_info);
    }

    public static SubLObject table_info_field_names(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_field_names(table_info);
    }

    public static SubLObject table_info_field_types(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_field_types(table_info);
    }

    public static SubLObject table_info_primary_key(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_primary_key(table_info);
    }

    public static SubLObject table_info_indexes(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_indexes(table_info);
    }

    public static SubLObject table_info_field_encodings(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_field_encodings(table_info);
    }

    public static SubLObject table_info_field_decodings(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_field_decodings(table_info);
    }

    public static SubLObject table_info_foreign_key_maps(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_foreign_key_maps(table_info);
    }

    public static SubLObject table_info_non_null_field_list(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_non_null_field_list(table_info);
    }

    public static SubLObject table_info_unique_field_tuples(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return tblnfo_unique_field_tuples(table_info);
    }

    public static SubLObject set_table_info_constant_base_name(final SubLObject table_info, final SubLObject constant_base_name) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        assert NIL != stringp(constant_base_name) : "Types.stringp(constant_base_name) " + "CommonSymbols.NIL != Types.stringp(constant_base_name) " + constant_base_name;
        _csetf_tblnfo_constant_base_name(table_info, constant_base_name);
        return table_info;
    }

    public static SubLObject set_table_info_lf_types(final SubLObject table_info, final SubLObject lf_types) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        assert NIL != list_utilities.non_dotted_list_p(lf_types) : "list_utilities.non_dotted_list_p(lf_types) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(lf_types) " + lf_types;
        SubLObject cdolist_list_var = lf_types;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.collection_p(elem) : "fort_types_interface.collection_p(elem) " + "CommonSymbols.NIL != fort_types_interface.collection_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_tblnfo_lf_types(table_info, lf_types);
        return table_info;
    }

    public static SubLObject set_table_info_meaning_sentences(final SubLObject table_info, final SubLObject meaning_sentences) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        assert NIL != list_utilities.non_dotted_list_p(meaning_sentences) : "list_utilities.non_dotted_list_p(meaning_sentences) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(meaning_sentences) " + meaning_sentences;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.collection_p(elem) : "fort_types_interface.collection_p(elem) " + "CommonSymbols.NIL != fort_types_interface.collection_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_tblnfo_meaning_sentences(table_info, meaning_sentences);
        return table_info;
    }

    public static SubLObject set_table_info_table_name(final SubLObject table_info, final SubLObject table_name) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        assert NIL != stringp(table_name) : "Types.stringp(table_name) " + "CommonSymbols.NIL != Types.stringp(table_name) " + table_name;
        _csetf_tblnfo_table_name(table_info, table_name);
        return table_info;
    }

    public static SubLObject table_info_ks_name(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return cconcatenate(table_info_constant_base_name(table_info), $str69$_KS);
    }

    public static SubLObject table_info_ls_name(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return cconcatenate(table_info_constant_base_name(table_info), $str151$_LS);
    }

    public static SubLObject table_info_ps_name(final SubLObject table_info) {
        assert NIL != table_info_p(table_info) : "sksi_database_fusion.table_info_p(table_info) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_p(table_info) " + table_info;
        return cconcatenate(table_info_constant_base_name(table_info), $str152$_PS);
    }

    public static SubLObject print_table_info_contents(final SubLObject table_info) {
        format(T, $str70$_s__, table_info);
        format(T, $str153$table_name__s__, table_info_table_name(table_info));
        format(T, $str154$isas___s__, table_info_isas(table_info));
        format(T, $str155$LF_types___s__, table_info_lf_types(table_info));
        format(T, $str156$field_mappings__s__, table_info_field_mappings(table_info));
        format(T, $str157$meaning_sentences___s__, table_info_meaning_sentences(table_info));
        format(T, $str158$enumerable___s__, table_info_enumerableP(table_info));
        format(T, $str159$field_names__s__, table_info_field_names(table_info));
        format(T, $str160$field_types__s__, table_info_field_types(table_info));
        format(T, $str161$primary_key__s__, table_info_primary_key(table_info));
        format(T, $str162$indexes__s__, table_info_indexes(table_info));
        format(T, $str163$field_encodings__s__, table_info_field_encodings(table_info));
        format(T, $str164$field_decodings__s__, table_info_field_decodings(table_info));
        format(T, $str165$foreign_key_maps__s__, table_info_foreign_key_maps(table_info));
        format(T, $str166$non_null_field_list__s__, table_info_non_null_field_list(table_info));
        format(T, $str167$unique_field_tuples__s__, table_info_unique_field_tuples(table_info));
        return table_info;
    }

    public static SubLObject table_info_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject table_info_field_encoding_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && v_object.first().isString());
    }

    public static SubLObject table_info_field_decoding_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != table_info_logical_field_indexical_p(v_object.first())));
    }

    public static SubLObject table_info_foreign_key_map_p(final SubLObject v_object) {
        return makeBoolean((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.list_of_type_p(STRINGP, v_object.first()))) && (NIL != table_info_id_p(second(v_object)))) && (NIL != list_utilities.list_of_type_p(STRINGP, third(v_object))));
    }

    public static SubLObject table_info_field_mapping_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != table_info_logical_field_p(v_object.first()))) && (NIL != forts.fort_p(second(v_object))));
    }

    public static SubLObject table_info_logical_field_indexical_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && ($LFI == v_object.first())) && (NIL != table_info_id_p(second(v_object)))) && (NIL != forts.fort_p(third(v_object)))) && fourth(v_object).isInteger());
    }

    public static SubLObject table_info_logical_field_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && ($LF == v_object.first())) && (NIL != table_info_id_p(second(v_object)))) && (NIL != forts.fort_p(third(v_object)))) && fourth(v_object).isInteger());
    }

    public static SubLObject table_info_physical_field_indexical_p(final SubLObject v_object) {
        return makeBoolean((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && ($PFI == v_object.first())) && (NIL != table_info_id_p(second(v_object)))) && third(v_object).isString());
    }

    public static SubLObject table_info_physical_field_p(final SubLObject v_object) {
        return makeBoolean((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && ($PF == v_object.first())) && (NIL != table_info_id_p(second(v_object)))) && third(v_object).isString());
    }

    public static SubLObject table_info_sk_source_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($KS == v_object.first())) && (NIL != table_info_id_p(second(v_object))));
    }

    public static SubLObject table_info_logical_schema_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($LS == v_object.first())) && (NIL != table_info_id_p(second(v_object))));
    }

    public static SubLObject table_info_physical_schema_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($PS == v_object.first())) && (NIL != table_info_id_p(second(v_object))));
    }

    public static SubLObject clone_database(final SubLObject input_sk_source, SubLObject kill_old_clonesP) {
        if (kill_old_clonesP == UNPROVIDED) {
            kill_old_clonesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cloned_ks = NIL;
        final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding(thread);
        try {
            $within_sksi_database_fusionP$.bind(T, thread);
            if (NIL != kill_old_clonesP) {
                kill_all_cloned_databases(input_sk_source);
            }
            final SubLObject db_info = compute_and_clone_db_info(input_sk_source);
            cloned_ks = reify_cloned_db_info(db_info, input_sk_source);
            sksi_create_sks.sksi_create_structured_knowledge_source(cloned_ks, UNPROVIDED);
            sksi_populate_cloned_ks(db_info, input_sk_source, cloned_ks);
        } finally {
            $within_sksi_database_fusionP$.rebind(_prev_bind_0, thread);
        }
        return cloned_ks;
    }

    public static SubLObject kill_all_cloned_databases(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = T;
        assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p($WARN) : "sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw176$WARN) " + "CommonSymbols.NIL != sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw176$WARN) " + $WARN;
        final SubLObject _prev_bind_0 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
        try {
            sksi_debugging.$sksi_error_handling_mode$.bind($WARN, thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(ks, $$cloneOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cloned_ks = NIL;
            cloned_ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sksi_create_sks.sksi_destroy_structured_knowledge_source(cloned_ks, UNPROVIDED)) {
                    successP = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                cloned_ks = cdolist_list_var.first();
            } 
        } finally {
            sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static SubLObject compute_and_clone_db_info(final SubLObject input_sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt = sksi_kb_accessors.sk_source_mapping_mt(input_sk_source);
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject db_info = compute_initial_db_info(input_sk_source);
            clone_db_info_constant_names(db_info);
            clone_db_info_db_name(db_info);
            if (NIL != sksi_database_fusion_debugP()) {
                print_db_info_contents(db_info);
            }
            result = db_info;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        $last_db_info$.setGlobalValue(result);
        return result;
    }

    public static SubLObject reify_cloned_db_info(final SubLObject db_info, final SubLObject input_sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cloned_ks = NIL;
        final SubLObject _prev_bind_0 = $inference_debugP$.currentBinding(thread);
        try {
            $inference_debugP$.bind(T, thread);
            assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p($BREAK) : "sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw179$BREAK) " + "CommonSymbols.NIL != sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw179$BREAK) " + $BREAK;
            final SubLObject _prev_bind_0_$3 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
            try {
                sksi_debugging.$sksi_error_handling_mode$.bind($BREAK, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(input_sk_source));
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    cloned_ks = start_reifying_new_top_level_ks(db_info);
                    sksi_kb_accessors.sksi_assert_if_new(list($$cloneOfSKS, input_sk_source, cloned_ks), $$SKSIMt);
                    finish_reifying_db_info(cloned_ks, db_info);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $inference_debugP$.rebind(_prev_bind_0, thread);
        }
        return cloned_ks;
    }

    public static SubLObject clone_db_info_constant_names(final SubLObject db_info) {
        final SubLObject new_constant_base_name = clone_constant_base_name(db_info_constant_base_name(db_info));
        set_db_info_constant_base_name(db_info, new_constant_base_name);
        SubLObject cdolist_list_var = db_info_table_infos(db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_constant_base_name2 = clone_constant_base_name(table_info_constant_base_name(table_info));
            set_table_info_constant_base_name(table_info, new_constant_base_name2);
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return db_info;
    }

    public static SubLObject clone_constant_base_name(final SubLObject original_constant_base_name) {
        return cconcatenate(original_constant_base_name, $str181$_Cloned);
    }

    public static SubLObject clone_db_info_db_name(final SubLObject db_info) {
        final SubLObject original_db_name = db_info_db_name(db_info);
        final SubLObject cloned_db_name = clone_db_name(original_db_name);
        return uniquify_db_info_db_name(cloned_db_name, db_info);
    }

    public static SubLObject clone_db_name(final SubLObject original_db_name) {
        return cconcatenate(original_db_name, $str182$_cloned);
    }

    public static SubLObject uniquify_db_info_db_name(final SubLObject db_name, final SubLObject db_info) {
        SubLObject uniqueP = NIL;
        SubLObject uniquifying_integer = ONE_INTEGER;
        SubLObject uniquifying_suffix = $str183$;
        while (NIL == uniqueP) {
            final SubLObject new_db_name = cconcatenate(db_name, uniquifying_suffix);
            set_db_info_db_name(db_info, new_db_name);
            uniqueP = makeBoolean(NIL == db_info_existsP(db_info));
            if (NIL == uniqueP) {
                uniquifying_integer = add(uniquifying_integer, ONE_INTEGER);
                uniquifying_suffix = cconcatenate($str184$_, string_utilities.str(uniquifying_integer));
            }
        } 
        return db_info;
    }

    public static SubLObject db_info_existsP(final SubLObject db_info) {
        SubLObject existsP = NIL;
        SubLObject connection = NIL;
        try {
            connection = sksi_sks_interaction.open_sql_source(db_info_access_path(db_info), ONE_INTEGER, UNPROVIDED);
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                existsP = T;
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return existsP;
    }

    public static SubLObject db_info_access_path(final SubLObject db_info) {
        final SubLObject db_name = db_info_db_name(db_info);
        final SubLObject user = db_info_user(db_info);
        final SubLObject pass = db_info_pass(db_info);
        final SubLObject server = db_info_server(db_info);
        final SubLObject port = db_info_port(db_info);
        final SubLObject proxy_host = db_info_proxy_host(db_info);
        final SubLObject proxy_port = db_info_proxy_port(db_info);
        final SubLObject subprotocol = db_info_subprotocol(db_info);
        final SubLObject sql_flavor = db_info_sql_flavor(db_info);
        return sksi_access_path.new_db_access_path(NIL, db_name, user, pass, server, port, proxy_host, proxy_port, subprotocol, sql_flavor, NIL);
    }

    public static SubLObject sksi_populate_cloned_ks(final SubLObject db_info, final SubLObject input_ks, final SubLObject cloned_ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding(thread);
        try {
            $within_sksi_database_fusionP$.bind(T, thread);
            try {
                sksi_sks_manager.register_sksi_removal_modules_for_skses(list(input_ks, cloned_ks));
                result = sksi_populate_cloned_ks_int(db_info, cloned_ks);
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sksi_sks_manager.deregister_sksi_removal_modules_for_skses(list(input_ks, cloned_ks));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $within_sksi_database_fusionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_populate_cloned_ks_int(final SubLObject db_info, final SubLObject output_ks) {
        SubLObject successP = T;
        final SubLObject input_mt = db_info_input_mt(db_info);
        final SubLObject output_mt = czer_main.cyc_find_or_create_nart(list($$ContentMtFn, output_ks), UNPROVIDED);
        SubLObject cdolist_list_var = db_info_table_infos(db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == sksi_populate_sub_ks(input_mt, output_mt, table_info)) {
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return successP;
    }

    public static SubLObject sksi_populate_sub_ks(final SubLObject input_mt, final SubLObject output_mt, final SubLObject table_info) {
        final SubLObject meaning_sentences = table_info_meaning_sentences(table_info);
        final SubLObject consequent;
        final SubLObject antecedent = consequent = sksi_saturate_rule_variablize_antecedent(simplifier.simplify_cycl_conjunction(simplifier.conjoin(meaning_sentences, T), UNPROVIDED));
        final SubLObject sksi_saturate_rule = list($$sksiSaturateRule, list($$implies, antecedent, consequent), input_mt, output_mt);
        return inference_kernel.new_cyc_query(sksi_saturate_rule, $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject sksi_saturate_rule_variablize_antecedent(final SubLObject antecedent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $current_table_info_variable_count$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $table_info_lfi_variable_dict$.currentBinding(thread);
        try {
            $current_table_info_variable_count$.bind(ZERO_INTEGER, thread);
            $table_info_lfi_variable_dict$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
            result = cycl_utilities.expression_transform(antecedent, TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, VARIABLIZE_TABLE_INFO_LFI, UNPROVIDED, UNPROVIDED);
        } finally {
            $table_info_lfi_variable_dict$.rebind(_prev_bind_2, thread);
            $current_table_info_variable_count$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject variablize_table_info_lfi(final SubLObject table_info_lfi) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_var = dictionary.dictionary_lookup($table_info_lfi_variable_dict$.getDynamicValue(thread), table_info_lfi, UNPROVIDED);
        if (NIL != existing_var) {
            return existing_var;
        }
        final SubLObject new_var = variables.find_variable_by_id($current_table_info_variable_count$.getDynamicValue(thread));
        dictionary.dictionary_enter($table_info_lfi_variable_dict$.getDynamicValue(thread), table_info_lfi, new_var);
        $current_table_info_variable_count$.setDynamicValue(add($current_table_info_variable_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        return new_var;
    }

    public static SubLObject sksi_database_fusion_clones_or_fusionsP(final SubLObject constant1, final SubLObject constant2) {
        return makeBoolean((NIL != sksi_database_fusion_clonesP(constant1, constant2)) || (NIL != sksi_database_fusion_fusionsP(constant1, constant2)));
    }

    public static SubLObject sksi_database_fusion_clonesP(final SubLObject constant1, final SubLObject constant2) {
        if ((NIL != constant_p(constant1)) && (NIL != constant_p(constant2))) {
            return makeBoolean((NIL != sksi_database_fusion_clones_intP(constant1, constant2)) || (NIL != sksi_database_fusion_clones_intP(constant2, constant1)));
        }
        return NIL;
    }

    public static SubLObject sksi_database_fusion_clones_intP(final SubLObject constant, final SubLObject cloned_constant) {
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject cloned_name = constants_high.constant_name(cloned_constant);
        final SubLObject cloned_pos = search($str181$_Cloned, cloned_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != cloned_pos) && (NIL != list_utilities.lengthGE(name, cloned_pos, UNPROVIDED))) {
            final SubLObject cloned_header = string_utilities.substring(cloned_name, ZERO_INTEGER, cloned_pos);
            final SubLObject header = string_utilities.substring(name, ZERO_INTEGER, cloned_pos);
            if (header.equalp(cloned_header)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject sksi_database_fusion_fusionsP(final SubLObject constant1, final SubLObject constant2) {
        if ((NIL != constant_p(constant1)) && (NIL != constant_p(constant2))) {
            return makeBoolean((NIL != sksi_database_fusion_fusions_intP(constant1, constant2)) || (NIL != sksi_database_fusion_fusions_intP(constant2, constant1)));
        }
        return NIL;
    }

    public static SubLObject sksi_database_fusion_fusions_intP(final SubLObject constant, final SubLObject fused_constant) {
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject fused_name = constants_high.constant_name(fused_constant);
        final SubLObject fused_pos = search($str191$_Fused, fused_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != fused_pos) && (NIL != list_utilities.lengthGE(name, fused_pos, UNPROVIDED))) {
            final SubLObject fused_header = string_utilities.string_subst($$$1, $$$2, string_utilities.substring(fused_name, ZERO_INTEGER, fused_pos), UNPROVIDED);
            final SubLObject header = string_utilities.string_subst($$$1, $$$2, string_utilities.substring(name, ZERO_INTEGER, fused_pos), UNPROVIDED);
            if (header.equalp(fused_header)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject compute_initial_db_info(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject db_info = NIL;
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject constant_base_name = compute_constant_base_name(sk_source);
            final SubLObject access_path = sksi_access_path.sksi_determine_access_path(sk_source, UNPROVIDED, UNPROVIDED);
            final SubLObject db_name = sksi_access_path.access_path_db(access_path);
            final SubLObject server = sksi_access_path.access_path_server(access_path);
            final SubLObject port = sksi_access_path.access_path_port(access_path);
            final SubLObject proxy_host = sksi_access_path.access_path_proxy_server(access_path);
            final SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
            final SubLObject user = sksi_access_path.access_path_user(access_path);
            final SubLObject pass = sksi_access_path.access_path_password(access_path);
            final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
            final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
            final SubLObject quoted_isas = isa.quoted_isa(sk_source, $$BookkeepingMt, UNPROVIDED);
            final SubLObject input_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
            final SubLObject head_mt = sksi_kb_accessors.sk_source_content_mt_head(sk_source);
            final SubLObject content_genl_mts = genl_mts.genl_mts_from_asserted_assertions(head_mt);
            db_info = new_db_info(constant_base_name, db_name, server, port, proxy_host, proxy_port, user, pass, subprotocol, sql_flavor, quoted_isas, input_mt, content_genl_mts);
            final SubLObject table_infos = compute_initial_table_infos_for_source(sk_source);
            set_db_info_table_infos(db_info, table_infos);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return db_info;
    }

    public static SubLObject compute_initial_table_infos_for_source(final SubLObject input_sk_source) {
        SubLObject table_infos = NIL;
        final SubLObject input_sub_sk_sources = sksi_kb_accessors.sk_source_sub_ks_closure(input_sk_source);
        final SubLObject table_kb_index = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = input_sub_sk_sources;
        SubLObject input_sub_sk_source = NIL;
        input_sub_sk_source = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_id = integer_sequence_generator.integer_sequence_generator_next($sksi_database_fusion_table_info_isg$.getGlobalValue());
            dictionary.dictionary_enter(table_kb_index, input_sub_sk_source, new_id);
            final SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata(input_sub_sk_source);
            if (NIL != logical_schemata) {
                final SubLObject ls = list_utilities.only_one(logical_schemata);
                final SubLObject ps = list_utilities.only_one(sksi_kb_accessors.logical_schema_physical_schemata(ls));
                dictionary.dictionary_enter(table_kb_index, ls, new_id);
                dictionary.dictionary_enter(table_kb_index, ps, new_id);
            }
            cdolist_list_var = cdolist_list_var.rest();
            input_sub_sk_source = cdolist_list_var.first();
        } 
        cdolist_list_var = input_sub_sk_sources;
        input_sub_sk_source = NIL;
        input_sub_sk_source = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = dictionary.dictionary_lookup(table_kb_index, input_sub_sk_source, UNPROVIDED);
            final SubLObject var;
            final SubLObject table_info = var = compute_initial_table_info(input_sub_sk_source, id, table_kb_index);
            if (NIL != var) {
                table_infos = cons(var, table_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            input_sub_sk_source = cdolist_list_var.first();
        } 
        return nreverse(table_infos);
    }

    public static SubLObject compute_initial_table_info(final SubLObject input_sub_sk_source, final SubLObject id, final SubLObject table_kb_index) {
        final SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata(input_sub_sk_source);
        if (NIL != logical_schemata) {
            return new_table_info_from_sk_source(input_sub_sk_source, logical_schemata, id, table_kb_index);
        }
        return NIL;
    }

    public static SubLObject new_table_info_from_sk_source(final SubLObject input_sub_sk_source, final SubLObject logical_schemata, final SubLObject id, final SubLObject table_kb_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_name = sksi_kb_accessors.sk_source_name(input_sub_sk_source);
        final SubLObject ls = list_utilities.only_one(logical_schemata);
        final SubLObject ps = list_utilities.only_one(sksi_kb_accessors.logical_schema_physical_schemata(ls));
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id.eql(dictionary.dictionary_lookup(table_kb_index, ls, UNPROVIDED)))) {
            Errors.error($str195$_s_misindexed_under__s_instead_of, ls, dictionary.dictionary_lookup(ls, table_kb_index, UNPROVIDED), id);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id.eql(dictionary.dictionary_lookup(table_kb_index, ps, UNPROVIDED)))) {
            Errors.error($str195$_s_misindexed_under__s_instead_of, ps, dictionary.dictionary_lookup(ps, table_kb_index, UNPROVIDED), id);
        }
        final SubLObject enumerableP = sksi_kb_accessors.physical_schema_enumerableP(ps);
        final SubLObject field_names = Mapping.mapcar(PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_ordered_field_list(ps));
        final SubLObject field_types = Mapping.mapcar(PHYSICAL_FIELD_DATA_TYPE, sksi_kb_accessors.physical_schema_ordered_field_list(ps));
        final SubLObject primary_key = Mapping.mapcar(PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_primary_key(ps));
        final SubLObject indexes = Mapping.mapcar(MAPCAR_PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_indexed_fields(ps));
        final SubLObject raw_field_encodings = sksi_kb_accessors.physical_schema_field_encodings(ps);
        final SubLObject field_encodings = process_field_encodings_for_table_info(raw_field_encodings, ls, table_kb_index);
        final SubLObject raw_field_decodings = sksi_kb_accessors.logical_schema_field_decodings(ls);
        final SubLObject field_decodings = process_field_decodings_for_table_info(raw_field_decodings, ps, table_kb_index);
        final SubLObject raw_foreign_key_maps = sksi_kb_accessors.physical_schema_foreign_keys(ps);
        final SubLObject foreign_key_maps = process_foreign_key_maps_for_table_info(raw_foreign_key_maps, ps, table_kb_index);
        final SubLObject non_null_field_list = Mapping.mapcar(PHYSICAL_FIELD_NAME, sksi_kb_accessors.not_null_physical_fields_for_ps(ps, UNPROVIDED));
        final SubLObject unique_field_tuples = Mapping.mapcar(MAPCAR_PHYSICAL_FIELD_NAME, sksi_kb_accessors.physical_schema_unique_fields_tuples(ps));
        final SubLObject constant_base_name = compute_constant_base_name(input_sub_sk_source);
        final SubLObject isas = sksi_kb_accessors.schema_isa(ls, UNPROVIDED);
        final SubLObject lf_types = sksi_kb_accessors.logical_field_type_list(ls);
        final SubLObject field_mappings = extract_field_mappings_for_table_info(ls, table_kb_index);
        final SubLObject meaning_sentences = process_meaning_sentences_for_table_info(sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(ls, UNPROVIDED, UNPROVIDED, UNPROVIDED), table_kb_index);
        final SubLObject table_info = new_table_info(id, constant_base_name, isas, lf_types, field_mappings, meaning_sentences, enumerableP, table_name, field_names, field_types, primary_key, indexes, field_encodings, field_decodings, foreign_key_maps, non_null_field_list, unique_field_tuples);
        return table_info;
    }

    public static SubLObject compute_constant_base_name(final SubLObject sk_source) {
        return string_utilities.post_remove(string_utilities.make_valid_constant_name(kb_paths.fort_name(sk_source), UNPROVIDED), $str69$_KS, UNPROVIDED);
    }

    public static SubLObject mapcar_physical_field_name(final SubLObject list) {
        return Mapping.mapcar(PHYSICAL_FIELD_NAME, list);
    }

    public static SubLObject process_field_encodings_for_table_info(final SubLObject raw_field_encodings, final SubLObject ls, final SubLObject table_kb_index) {
        SubLObject field_encodings = NIL;
        SubLObject cdolist_list_var = raw_field_encodings;
        SubLObject raw_field_encoding = NIL;
        raw_field_encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            field_encodings = cons(process_field_encoding_for_table_info(raw_field_encoding, ls, table_kb_index), field_encodings);
            cdolist_list_var = cdolist_list_var.rest();
            raw_field_encoding = cdolist_list_var.first();
        } 
        return nreverse(field_encodings);
    }

    public static SubLObject process_field_encoding_for_table_info(final SubLObject raw_field_encoding, final SubLObject expected_ls, final SubLObject table_kb_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject pf = NIL;
        SubLObject ls = NIL;
        SubLObject recipe = NIL;
        destructuring_bind_must_consp(raw_field_encoding, raw_field_encoding, $list199);
        pf = raw_field_encoding.first();
        SubLObject current = raw_field_encoding.rest();
        destructuring_bind_must_consp(current, raw_field_encoding, $list199);
        ls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, raw_field_encoding, $list199);
        recipe = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ls.eql(expected_ls))) {
                Errors.error($str200$Can_t_handle_fieldEncoding_for__s, expected_ls, ls);
            }
            final SubLObject _prev_bind_0 = $table_infoify_expression_table_kb_index$.currentBinding(thread);
            try {
                $table_infoify_expression_table_kb_index$.bind(table_kb_index, thread);
                final SubLObject table_info_recipe = cycl_utilities.expression_transform(recipe, TABLE_INFOIFIABLE_P, TABLE_INFOIFY_OBJECT, UNPROVIDED, UNPROVIDED);
                result = list(sksi_kb_accessors.physical_field_name(pf), table_info_recipe);
            } finally {
                $table_infoify_expression_table_kb_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(raw_field_encoding, $list199);
        }
        return result;
    }

    public static SubLObject table_infoifiable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != sksi_kb_accessors.logical_field_p(v_object)) || (NIL != sksi_kb_accessors.logical_field_indexical_p(v_object))) || (NIL != sksi_kb_accessors.physical_field_indexical_p(v_object))) {
            return T;
        }
        final SubLObject id = dictionary.dictionary_lookup($table_infoify_expression_table_kb_index$.getDynamicValue(thread), v_object, UNPROVIDED);
        if (NIL != id) {
            return T;
        }
        return NIL;
    }

    public static SubLObject table_infoify_object(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_kb_accessors.logical_field_p(v_object)) {
            return table_infoify_logical_field(v_object, $table_infoify_expression_table_kb_index$.getDynamicValue(thread));
        }
        if (NIL != sksi_kb_accessors.logical_field_indexical_p(v_object)) {
            return table_infoify_logical_field_indexical(v_object);
        }
        if (NIL != sksi_kb_accessors.physical_field_indexical_p(v_object)) {
            return table_infoify_physical_field_indexical(v_object);
        }
        if (NIL != sksi_kb_accessors.sk_source_p(v_object)) {
            return table_infoify_sk_source(v_object);
        }
        if (NIL != sksi_kb_accessors.isa_logical_schemaP(v_object)) {
            return table_infoify_logical_schema(v_object);
        }
        if (NIL != sksi_kb_accessors.isa_physical_schemaP(v_object)) {
            return table_infoify_physical_schema(v_object);
        }
        return Errors.error($str203$Can_t_table_infoify__s, v_object);
    }

    public static SubLObject table_infoify_sk_source(final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ks_id = dictionary.dictionary_lookup($table_infoify_expression_table_kb_index$.getDynamicValue(thread), ks, UNPROVIDED);
        assert NIL != table_info_id_p(ks_id) : "sksi_database_fusion.table_info_id_p(ks_id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(ks_id) " + ks_id;
        return list($KS, ks_id);
    }

    public static SubLObject table_infoify_logical_schema(final SubLObject ls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ls_id = dictionary.dictionary_lookup($table_infoify_expression_table_kb_index$.getDynamicValue(thread), ls, UNPROVIDED);
        assert NIL != table_info_id_p(ls_id) : "sksi_database_fusion.table_info_id_p(ls_id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(ls_id) " + ls_id;
        return list($LS, ls_id);
    }

    public static SubLObject table_infoify_physical_schema(final SubLObject ps) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ps_id = dictionary.dictionary_lookup($table_infoify_expression_table_kb_index$.getDynamicValue(thread), ps, UNPROVIDED);
        assert NIL != table_info_id_p(ps_id) : "sksi_database_fusion.table_info_id_p(ps_id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(ps_id) " + ps_id;
        return list($PS, ps_id);
    }

    public static SubLObject table_infoify_logical_field_indexical(final SubLObject lfi) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ls = cycl_utilities.nat_arg1(lfi, UNPROVIDED);
        final SubLObject ls_id = dictionary.dictionary_lookup($table_infoify_expression_table_kb_index$.getDynamicValue(thread), ls, UNPROVIDED);
        final SubLObject col = cycl_utilities.nat_arg2(lfi, UNPROVIDED);
        final SubLObject i = cycl_utilities.nat_arg3(lfi, UNPROVIDED);
        assert NIL != table_info_id_p(ls_id) : "sksi_database_fusion.table_info_id_p(ls_id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(ls_id) " + ls_id;
        return list($LFI, ls_id, col, i);
    }

    public static SubLObject process_field_decodings_for_table_info(final SubLObject raw_field_decodings, final SubLObject ps, final SubLObject table_kb_index) {
        SubLObject field_decodings = NIL;
        SubLObject cdolist_list_var = raw_field_decodings;
        SubLObject raw_field_decoding = NIL;
        raw_field_decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            field_decodings = cons(process_field_decoding_for_table_info(raw_field_decoding, ps, table_kb_index), field_decodings);
            cdolist_list_var = cdolist_list_var.rest();
            raw_field_decoding = cdolist_list_var.first();
        } 
        return nreverse(field_decodings);
    }

    public static SubLObject process_field_decoding_for_table_info(final SubLObject raw_field_decoding, final SubLObject expected_ps, final SubLObject table_kb_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject lfi = NIL;
        SubLObject ps = NIL;
        SubLObject recipe = NIL;
        destructuring_bind_must_consp(raw_field_decoding, raw_field_decoding, $list204);
        lfi = raw_field_decoding.first();
        SubLObject current = raw_field_decoding.rest();
        destructuring_bind_must_consp(current, raw_field_decoding, $list204);
        ps = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, raw_field_decoding, $list204);
        recipe = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ps.eql(expected_ps))) {
                Errors.error($str205$Can_t_handle_fieldDecoding_for__s, expected_ps, ps);
            }
            final SubLObject _prev_bind_0 = $table_infoify_expression_table_kb_index$.currentBinding(thread);
            try {
                $table_infoify_expression_table_kb_index$.bind(table_kb_index, thread);
                final SubLObject table_info_recipe = cycl_utilities.expression_transform(recipe, TABLE_INFOIFIABLE_P, TABLE_INFOIFY_OBJECT, UNPROVIDED, UNPROVIDED);
                result = list(table_infoify_logical_field_indexical(lfi), table_info_recipe);
            } finally {
                $table_infoify_expression_table_kb_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(raw_field_decoding, $list204);
        }
        return result;
    }

    public static SubLObject table_infoify_physical_field_indexical(final SubLObject pfi) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ps = cycl_utilities.nat_arg1(pfi, UNPROVIDED);
        final SubLObject ps_id = dictionary.dictionary_lookup($table_infoify_expression_table_kb_index$.getDynamicValue(thread), ps, UNPROVIDED);
        final SubLObject field_name = cycl_utilities.nat_arg2(pfi, UNPROVIDED);
        assert NIL != table_info_id_p(ps_id) : "sksi_database_fusion.table_info_id_p(ps_id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(ps_id) " + ps_id;
        return list($PFI, ps_id, field_name);
    }

    public static SubLObject process_foreign_key_maps_for_table_info(final SubLObject raw_foreign_key_maps, final SubLObject ps, final SubLObject table_kb_index) {
        SubLObject foreign_key_maps = NIL;
        SubLObject cdolist_list_var = raw_foreign_key_maps;
        SubLObject raw_foreign_key_map = NIL;
        raw_foreign_key_map = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            foreign_key_maps = cons(process_foreign_key_map_for_table_info(raw_foreign_key_map, ps, table_kb_index), foreign_key_maps);
            cdolist_list_var = cdolist_list_var.rest();
            raw_foreign_key_map = cdolist_list_var.first();
        } 
        return nreverse(foreign_key_maps);
    }

    public static SubLObject process_foreign_key_map_for_table_info(final SubLObject raw_map, final SubLObject expected_ps, final SubLObject table_kb_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pfs = NIL;
        SubLObject foreign_ps = NIL;
        SubLObject foreign_pfs = NIL;
        destructuring_bind_must_consp(raw_map, raw_map, $list206);
        pfs = raw_map.first();
        SubLObject current = raw_map.rest();
        destructuring_bind_must_consp(current, raw_map, $list206);
        foreign_ps = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, raw_map, $list206);
        foreign_pfs = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = pfs;
            SubLObject pf = NIL;
            pf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!sksi_kb_accessors.physical_field_schema(pf).eql(expected_ps))) {
                    Errors.error($str207$Got_physical_schema__s__expected_, sksi_kb_accessors.physical_field_schema(pf), expected_ps);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pf = cdolist_list_var.first();
            } 
            final SubLObject foreign_ps_id = dictionary.dictionary_lookup(table_kb_index, foreign_ps, UNPROVIDED);
            return list(Mapping.mapcar(PHYSICAL_FIELD_NAME, pfs), foreign_ps_id, Mapping.mapcar(PHYSICAL_FIELD_NAME, foreign_pfs));
        }
        cdestructuring_bind_error(raw_map, $list206);
        return NIL;
    }

    public static SubLObject fused_sk_source_name(final SubLObject sk_source) {
        return cconcatenate($str208$Fused_, string_utilities.make_valid_constant_name(kb_paths.fort_name(sk_source), UNPROVIDED));
    }

    public static SubLObject fused_ls_name(final SubLObject ls) {
        return cconcatenate($str208$Fused_, string_utilities.make_valid_constant_name(kb_paths.fort_name(ls), UNPROVIDED));
    }

    public static SubLObject extract_field_mappings_for_table_info(final SubLObject ls, final SubLObject table_kb_index) {
        SubLObject table_info_mappings = NIL;
        SubLObject cdolist_list_var = sksi_kb_accessors.logical_schema_fields(ls);
        SubLObject lf = NIL;
        lf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$6;
            final SubLObject maps = cdolist_list_var_$6 = sksi_kb_accessors.logical_field_mappings(lf);
            SubLObject map = NIL;
            map = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                final SubLObject table_info_mapping = list(table_infoify_logical_field(lf, table_kb_index), map);
                table_info_mappings = cons(table_info_mapping, table_info_mappings);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                map = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            lf = cdolist_list_var.first();
        } 
        return nreverse(table_info_mappings);
    }

    public static SubLObject table_infoify_logical_field(final SubLObject lf, final SubLObject table_kb_index) {
        final SubLObject ls = cycl_utilities.nat_arg1(lf, UNPROVIDED);
        final SubLObject ls_id = dictionary.dictionary_lookup(table_kb_index, ls, UNPROVIDED);
        final SubLObject col = cycl_utilities.nat_arg2(lf, UNPROVIDED);
        final SubLObject i = cycl_utilities.nat_arg3(lf, UNPROVIDED);
        assert NIL != table_info_id_p(ls_id) : "sksi_database_fusion.table_info_id_p(ls_id) " + "CommonSymbols.NIL != sksi_database_fusion.table_info_id_p(ls_id) " + ls_id;
        return list($LF, ls_id, col, i);
    }

    public static SubLObject process_meaning_sentences_for_table_info(final SubLObject raw_meaning_sentences, final SubLObject table_kb_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $table_infoify_expression_table_kb_index$.currentBinding(thread);
        try {
            $table_infoify_expression_table_kb_index$.bind(table_kb_index, thread);
            result = cycl_utilities.hl_to_el(cycl_utilities.expression_transform(raw_meaning_sentences, TABLE_INFOIFIABLE_P, TABLE_INFOIFY_OBJECT, UNPROVIDED, UNPROVIDED));
        } finally {
            $table_infoify_expression_table_kb_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject reify_db_info(final SubLObject db_info) {
        final SubLObject top_level_ks = start_reifying_new_top_level_ks(db_info);
        return finish_reifying_db_info(top_level_ks, db_info);
    }

    public static SubLObject finish_reifying_db_info(final SubLObject top_level_ks, final SubLObject db_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(top_level_ks);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            finish_reifying_new_top_level_ks(top_level_ks, db_info);
            final SubLObject kb_table_index = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = db_info_table_infos(db_info);
            SubLObject table_info = NIL;
            table_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject constants = start_reifying_table_info(table_info, top_level_ks, mapping_mt);
                dictionary.dictionary_enter(kb_table_index, table_info_id(table_info), constants);
                cdolist_list_var = cdolist_list_var.rest();
                table_info = cdolist_list_var.first();
            } 
            cdolist_list_var = db_info_table_infos(db_info);
            table_info = NIL;
            table_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject constants = dictionary.dictionary_lookup(kb_table_index, table_info_id(table_info), UNPROVIDED);
                SubLObject current;
                final SubLObject datum = current = constants;
                SubLObject ks = NIL;
                SubLObject ls = NIL;
                SubLObject ps = NIL;
                destructuring_bind_must_consp(current, datum, $list209);
                ks = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list209);
                ls = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list209);
                ps = current.first();
                current = current.rest();
                if (NIL == current) {
                    finish_reifying_table_info(table_info, ks, ls, ps, kb_table_index, mapping_mt);
                } else {
                    cdestructuring_bind_error(datum, $list209);
                }
                cdolist_list_var = cdolist_list_var.rest();
                table_info = cdolist_list_var.first();
            } 
            sksi_kb_accessors.sksi_assert_if_new(list($$sksRepresentationComplete, top_level_ks), mapping_mt);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return top_level_ks;
    }

    public static SubLObject start_reifying_table_info(final SubLObject table_info, final SubLObject top_level_ks, final SubLObject mapping_mt) {
        final SubLObject ks = reify_new_sk_source(table_info, top_level_ks, mapping_mt);
        final SubLObject ls = start_reifying_new_logical_schema(table_info_ls_name(table_info), mapping_mt);
        final SubLObject ps = start_reifying_new_physical_schema(table_info_ps_name(table_info), mapping_mt);
        sksi_kb_accessors.sksi_assert_if_new(list($$termDependsOn, ls, ks), mapping_mt);
        sksi_kb_accessors.sksi_assert_if_new(list($$termDependsOn, ps, ks), mapping_mt);
        sksi_kb_accessors.sksi_assert_if_new(list($$termDependsOn, ks, top_level_ks), mapping_mt);
        return list(ks, ls, ps);
    }

    public static SubLObject finish_reifying_table_info(final SubLObject table_info, final SubLObject ks, final SubLObject ls, final SubLObject ps, final SubLObject kb_table_index, final SubLObject mapping_mt) {
        finish_reifying_new_logical_schema(ls, ks, table_info_lf_types(table_info), table_info_field_mappings(table_info), table_info_meaning_sentences(table_info), table_info_isas(table_info), kb_table_index, mapping_mt);
        finish_reifying_new_physical_schema(ps, ks, ls, table_info_enumerableP(table_info), table_info_field_names(table_info), table_info_field_types(table_info), table_info_primary_key(table_info), table_info_indexes(table_info), table_info_field_encodings(table_info), table_info_field_decodings(table_info), table_info_foreign_key_maps(table_info), table_info_non_null_field_list(table_info), table_info_unique_field_tuples(table_info), kb_table_index, mapping_mt);
        return NIL;
    }

    public static SubLObject reify_new_top_level_ks(final SubLObject db_info) {
        final SubLObject ks = start_reifying_new_top_level_ks(db_info);
        finish_reifying_new_top_level_ks(ks, db_info);
        return ks;
    }

    public static SubLObject start_reifying_new_top_level_ks(final SubLObject db_info) {
        final SubLObject db_name = db_info_db_name(db_info);
        final SubLObject ks = sksi_sks_accessors.new_sks_complex(db_name, NIL, NIL, $$Database_Physical);
        final SubLObject ks_name = db_info_ks_name(db_info);
        ke.ke_rename_now(ks, ks_name);
        sksi_kb_accessors.sksi_assert_if_new(listS($$isa, ks, $list214), $$UniversalVocabularyMt);
        return ks;
    }

    public static SubLObject finish_reifying_new_top_level_ks(final SubLObject ks, final SubLObject db_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(ks);
        assert NIL != hlmt.hlmt_p(mapping_mt) : "hlmt.hlmt_p(mapping_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mapping_mt) " + mapping_mt;
        reify_access_path(db_info, ks, mapping_mt);
        SubLObject cdolist_list_var = db_info_quoted_isas(db_info);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_assert_if_new(list($$quotedIsa, ks, col), $$BookkeepingMt);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        sksi_kb_accessors.sksi_assert_if_new(list($$mappingMt, ks, mapping_mt), $$UniversalVocabularyMt);
        final SubLObject content_genl_mts = db_info_content_genl_mts(db_info);
        if (NIL != content_genl_mts) {
            final SubLObject content_mt_head = sksi_kb_accessors.sk_source_content_mt_head(ks);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == hlmt.hlmt_p(content_mt_head))) {
                Errors.error($str217$Could_not_find_the_content_mt_hea, ks);
            }
            SubLObject cdolist_list_var2 = content_genl_mts;
            SubLObject genl_mt = NIL;
            genl_mt = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                sksi_kb_accessors.sksi_assert_if_new(list($$genlMt, content_mt_head, genl_mt), $$UniversalVocabularyMt);
                cdolist_list_var2 = cdolist_list_var2.rest();
                genl_mt = cdolist_list_var2.first();
            } 
        }
        return ks;
    }

    public static SubLObject reify_access_path(final SubLObject db_info, final SubLObject ks, final SubLObject mapping_mt) {
        final SubLObject user = db_info_user(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$userNameForSKS, ks, user), mapping_mt);
        final SubLObject pass = db_info_pass(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$passwordForSKS, ks, pass), mapping_mt);
        final SubLObject server = db_info_server(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$serverOfSKS, ks, server), mapping_mt);
        final SubLObject port = db_info_port(db_info);
        if (NIL != port) {
            sksi_kb_accessors.sksi_assert_if_new(list($$portNumberForSKS, ks, port), mapping_mt);
        }
        final SubLObject proxy_host = db_info_proxy_host(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$sksProxyHost, ks, proxy_host), mapping_mt);
        final SubLObject proxy_port = db_info_proxy_port(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$sksProxyPort, ks, proxy_port), mapping_mt);
        final SubLObject subprotocol = db_info_subprotocol(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$subProtocolForSKS, ks, subprotocol), mapping_mt);
        final SubLObject sql_flavor = db_info_sql_flavor(db_info);
        sksi_kb_accessors.sksi_assert_if_new(list($$sqlProgramForSKS, ks, sql_flavor), mapping_mt);
        return ks;
    }

    public static SubLObject reify_new_sk_source(final SubLObject table_info, final SubLObject top_level_sks, final SubLObject mt) {
        final SubLObject table_name = table_info_table_name(table_info);
        final SubLObject ks_name = table_info_ks_name(table_info);
        final SubLObject ks = sksi_sks_accessors.new_sks_atomic(table_name, top_level_sks, mt);
        ke.ke_rename_now(ks, ks_name);
        assert NIL != forts.fort_p(ks) : "forts.fort_p(ks) " + "CommonSymbols.NIL != forts.fort_p(ks) " + ks;
        return ks;
    }

    public static SubLObject start_reifying_new_logical_schema(final SubLObject name, final SubLObject mapping_mt) {
        final SubLObject ls = (NIL != sksi_database_fusion_debugP()) ? sksi_kb_accessors.sksi_find_or_create(name) : sksi_kb_accessors.sksi_create(name);
        assert NIL != forts.fort_p(ls) : "forts.fort_p(ls) " + "CommonSymbols.NIL != forts.fort_p(ls) " + ls;
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, ls, $$ObjectDefiningSchema), $$UniversalVocabularyMt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, ls, $$LogicalSchema), $$UniversalVocabularyMt);
        return ls;
    }

    public static SubLObject finish_reifying_new_logical_schema(final SubLObject ls, final SubLObject sks, final SubLObject lf_types, final SubLObject field_mappings, final SubLObject meaning_sentences, final SubLObject isas, final SubLObject kb_table_index, final SubLObject mapping_mt) {
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalSchemaSourceMap, ls, sks), mapping_mt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalSchemaFieldTypeList, ls, make_el_list(lf_types, UNPROVIDED)), mapping_mt);
        SubLObject cdolist_list_var = field_mappings;
        SubLObject mapping = NIL;
        mapping = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mapping;
            SubLObject table_info_lf = NIL;
            SubLObject map = NIL;
            destructuring_bind_must_consp(current, datum, $list231);
            table_info_lf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list231);
            map = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject lf = kbify_logical_field(table_info_lf, kb_table_index);
                sksi_kb_accessors.sksi_assert_if_new(list($$logicalFieldMapping, lf, map), mapping_mt);
            } else {
                cdestructuring_bind_error(datum, $list231);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        } 
        cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_kb_accessors.sksi_assert_if_new(list($$schemaIsa, ls, v_isa), $$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = meaning_sentences;
        SubLObject meaning_sentence = NIL;
        meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject kb_meaning_sentence = kbify_meaning_sentence(meaning_sentence, kb_table_index);
            sksi_kb_accessors.sksi_assert_if_new(list($$meaningSentenceOfSchema, ls, kb_meaning_sentence), mapping_mt);
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        } 
        return ls;
    }

    public static SubLObject kbifiable_p(final SubLObject v_object) {
        return makeBoolean((((((NIL != table_info_logical_field_p(v_object)) || (NIL != table_info_logical_field_indexical_p(v_object))) || (NIL != table_info_physical_field_indexical_p(v_object))) || (NIL != table_info_sk_source_p(v_object))) || (NIL != table_info_logical_schema_p(v_object))) || (NIL != table_info_physical_schema_p(v_object)));
    }

    public static SubLObject kbify_object(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != table_info_logical_field_p(v_object)) {
            return kbify_logical_field(v_object, $kbify_expression_kb_table_index$.getDynamicValue(thread));
        }
        if (NIL != table_info_logical_field_indexical_p(v_object)) {
            return kbify_logical_field_indexical(v_object);
        }
        if (NIL != table_info_physical_field_indexical_p(v_object)) {
            return kbify_physical_field_indexical(v_object);
        }
        if (NIL != table_info_sk_source_p(v_object)) {
            return kbify_sk_source(v_object);
        }
        if (NIL != table_info_logical_schema_p(v_object)) {
            return kbify_logical_schema(v_object);
        }
        if (NIL != table_info_physical_schema_p(v_object)) {
            return kbify_physical_schema(v_object);
        }
        return Errors.error($str235$Can_t_kbify__s, v_object);
    }

    public static SubLObject kbify_sk_source(final SubLObject table_info_sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ks_token = NIL;
        SubLObject table_info_id = NIL;
        destructuring_bind_must_consp(table_info_sk_source, table_info_sk_source, $list236);
        ks_token = table_info_sk_source.first();
        SubLObject current = table_info_sk_source.rest();
        destructuring_bind_must_consp(current, table_info_sk_source, $list236);
        table_info_id = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$8;
            final SubLObject datum_$7 = current_$8 = dictionary.dictionary_lookup($kbify_expression_kb_table_index$.getDynamicValue(thread), table_info_id, UNPROVIDED);
            SubLObject ks = NIL;
            SubLObject ls = NIL;
            SubLObject ps = NIL;
            destructuring_bind_must_consp(current_$8, datum_$7, $list209);
            ks = current_$8.first();
            current_$8 = current_$8.rest();
            destructuring_bind_must_consp(current_$8, datum_$7, $list209);
            ls = current_$8.first();
            current_$8 = current_$8.rest();
            destructuring_bind_must_consp(current_$8, datum_$7, $list209);
            ps = current_$8.first();
            current_$8 = current_$8.rest();
            if (NIL == current_$8) {
                assert NIL != forts.fort_p(ks) : "forts.fort_p(ks) " + "CommonSymbols.NIL != forts.fort_p(ks) " + ks;
                return ks;
            } else {
                cdestructuring_bind_error(datum_$7, $list209);
            }
        } else {
            cdestructuring_bind_error(table_info_sk_source, $list236);
        }
        return NIL;
    }

    public static SubLObject kbify_logical_schema(final SubLObject table_info_logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ls_token = NIL;
        SubLObject table_info_id = NIL;
        destructuring_bind_must_consp(table_info_logical_schema, table_info_logical_schema, $list237);
        ls_token = table_info_logical_schema.first();
        SubLObject current = table_info_logical_schema.rest();
        destructuring_bind_must_consp(current, table_info_logical_schema, $list237);
        table_info_id = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$10;
            final SubLObject datum_$9 = current_$10 = dictionary.dictionary_lookup($kbify_expression_kb_table_index$.getDynamicValue(thread), table_info_id, UNPROVIDED);
            SubLObject ks = NIL;
            SubLObject ls = NIL;
            SubLObject ps = NIL;
            destructuring_bind_must_consp(current_$10, datum_$9, $list209);
            ks = current_$10.first();
            current_$10 = current_$10.rest();
            destructuring_bind_must_consp(current_$10, datum_$9, $list209);
            ls = current_$10.first();
            current_$10 = current_$10.rest();
            destructuring_bind_must_consp(current_$10, datum_$9, $list209);
            ps = current_$10.first();
            current_$10 = current_$10.rest();
            if (NIL == current_$10) {
                assert NIL != forts.fort_p(ls) : "forts.fort_p(ls) " + "CommonSymbols.NIL != forts.fort_p(ls) " + ls;
                return ls;
            } else {
                cdestructuring_bind_error(datum_$9, $list209);
            }
        } else {
            cdestructuring_bind_error(table_info_logical_schema, $list237);
        }
        return NIL;
    }

    public static SubLObject kbify_physical_schema(final SubLObject table_info_physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ps_token = NIL;
        SubLObject table_info_id = NIL;
        destructuring_bind_must_consp(table_info_physical_schema, table_info_physical_schema, $list238);
        ps_token = table_info_physical_schema.first();
        SubLObject current = table_info_physical_schema.rest();
        destructuring_bind_must_consp(current, table_info_physical_schema, $list238);
        table_info_id = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$12;
            final SubLObject datum_$11 = current_$12 = dictionary.dictionary_lookup($kbify_expression_kb_table_index$.getDynamicValue(thread), table_info_id, UNPROVIDED);
            SubLObject ks = NIL;
            SubLObject ls = NIL;
            SubLObject ps = NIL;
            destructuring_bind_must_consp(current_$12, datum_$11, $list209);
            ks = current_$12.first();
            current_$12 = current_$12.rest();
            destructuring_bind_must_consp(current_$12, datum_$11, $list209);
            ls = current_$12.first();
            current_$12 = current_$12.rest();
            destructuring_bind_must_consp(current_$12, datum_$11, $list209);
            ps = current_$12.first();
            current_$12 = current_$12.rest();
            if (NIL == current_$12) {
                assert NIL != forts.fort_p(ps) : "forts.fort_p(ps) " + "CommonSymbols.NIL != forts.fort_p(ps) " + ps;
                return ps;
            } else {
                cdestructuring_bind_error(datum_$11, $list209);
            }
        } else {
            cdestructuring_bind_error(table_info_physical_schema, $list238);
        }
        return NIL;
    }

    public static SubLObject kbify_meaning_sentence(final SubLObject meaning_sentence, final SubLObject kb_table_index) {
        return kbify_logical_field_indexicals(meaning_sentence, kb_table_index);
    }

    public static SubLObject kbify_logical_field_indexicals(final SubLObject expression, final SubLObject kb_table_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $kbify_expression_kb_table_index$.currentBinding(thread);
        try {
            $kbify_expression_kb_table_index$.bind(kb_table_index, thread);
            result = cycl_utilities.expression_transform(expression, KBIFIABLE_P, KBIFY_OBJECT, UNPROVIDED, UNPROVIDED);
        } finally {
            $kbify_expression_kb_table_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject kbify_logical_field_indexical(final SubLObject table_info_lfi) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lfi = NIL;
        SubLObject table_info_id = NIL;
        SubLObject col = NIL;
        SubLObject i = NIL;
        destructuring_bind_must_consp(table_info_lfi, table_info_lfi, $list241);
        lfi = table_info_lfi.first();
        SubLObject current = table_info_lfi.rest();
        destructuring_bind_must_consp(current, table_info_lfi, $list241);
        table_info_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lfi, $list241);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lfi, $list241);
        i = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject constants = dictionary.dictionary_lookup($kbify_expression_kb_table_index$.getDynamicValue(thread), table_info_id, UNPROVIDED);
            SubLObject current_$14;
            final SubLObject datum_$13 = current_$14 = constants;
            SubLObject ks = NIL;
            SubLObject ls = NIL;
            SubLObject ps = NIL;
            destructuring_bind_must_consp(current_$14, datum_$13, $list209);
            ks = current_$14.first();
            current_$14 = current_$14.rest();
            destructuring_bind_must_consp(current_$14, datum_$13, $list209);
            ls = current_$14.first();
            current_$14 = current_$14.rest();
            destructuring_bind_must_consp(current_$14, datum_$13, $list209);
            ps = current_$14.first();
            current_$14 = current_$14.rest();
            if (NIL == current_$14) {
                return list($$TheLogicalFieldValueFn, ls, col, i);
            }
            cdestructuring_bind_error(datum_$13, $list209);
        } else {
            cdestructuring_bind_error(table_info_lfi, $list241);
        }
        return NIL;
    }

    public static SubLObject kbify_logical_field(final SubLObject table_info_lf, final SubLObject kb_table_index) {
        SubLObject lf = NIL;
        SubLObject table_info_id = NIL;
        SubLObject col = NIL;
        SubLObject i = NIL;
        destructuring_bind_must_consp(table_info_lf, table_info_lf, $list243);
        lf = table_info_lf.first();
        SubLObject current = table_info_lf.rest();
        destructuring_bind_must_consp(current, table_info_lf, $list243);
        table_info_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lf, $list243);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lf, $list243);
        i = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject constants = dictionary.dictionary_lookup(kb_table_index, table_info_id, UNPROVIDED);
            SubLObject current_$16;
            final SubLObject datum_$15 = current_$16 = constants;
            SubLObject ks = NIL;
            SubLObject ls = NIL;
            SubLObject ps = NIL;
            destructuring_bind_must_consp(current_$16, datum_$15, $list209);
            ks = current_$16.first();
            current_$16 = current_$16.rest();
            destructuring_bind_must_consp(current_$16, datum_$15, $list209);
            ls = current_$16.first();
            current_$16 = current_$16.rest();
            destructuring_bind_must_consp(current_$16, datum_$15, $list209);
            ps = current_$16.first();
            current_$16 = current_$16.rest();
            if (NIL == current_$16) {
                return list($$LogicalFieldFn, ls, col, i);
            }
            cdestructuring_bind_error(datum_$15, $list209);
        } else {
            cdestructuring_bind_error(table_info_lf, $list243);
        }
        return NIL;
    }

    public static SubLObject kbify_physical_field_indexicals(final SubLObject expression, final SubLObject kb_table_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $kbify_expression_kb_table_index$.currentBinding(thread);
        try {
            $kbify_expression_kb_table_index$.bind(kb_table_index, thread);
            result = cycl_utilities.expression_transform(expression, KBIFIABLE_P, KBIFY_OBJECT, UNPROVIDED, UNPROVIDED);
        } finally {
            $kbify_expression_kb_table_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject kbify_physical_field_indexical(final SubLObject table_info_pfi) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pfi = NIL;
        SubLObject table_info_id = NIL;
        SubLObject field_name = NIL;
        destructuring_bind_must_consp(table_info_pfi, table_info_pfi, $list245);
        pfi = table_info_pfi.first();
        SubLObject current = table_info_pfi.rest();
        destructuring_bind_must_consp(current, table_info_pfi, $list245);
        table_info_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_pfi, $list245);
        field_name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject constants = dictionary.dictionary_lookup($kbify_expression_kb_table_index$.getDynamicValue(thread), table_info_id, UNPROVIDED);
            SubLObject current_$18;
            final SubLObject datum_$17 = current_$18 = constants;
            SubLObject ks = NIL;
            SubLObject ls = NIL;
            SubLObject ps = NIL;
            destructuring_bind_must_consp(current_$18, datum_$17, $list209);
            ks = current_$18.first();
            current_$18 = current_$18.rest();
            destructuring_bind_must_consp(current_$18, datum_$17, $list209);
            ls = current_$18.first();
            current_$18 = current_$18.rest();
            destructuring_bind_must_consp(current_$18, datum_$17, $list209);
            ps = current_$18.first();
            current_$18 = current_$18.rest();
            if (NIL == current_$18) {
                return list($$ThePhysicalFieldValueFn, ps, field_name);
            }
            cdestructuring_bind_error(datum_$17, $list209);
        } else {
            cdestructuring_bind_error(table_info_pfi, $list245);
        }
        return NIL;
    }

    public static SubLObject anonymize_table_info_object(final SubLObject v_object) {
        if (NIL != table_info_logical_field_p(v_object)) {
            return anonymize_table_info_logical_field(v_object);
        }
        if (NIL != table_info_logical_field_indexical_p(v_object)) {
            return anonymize_table_info_logical_field_indexical(v_object);
        }
        if (NIL != table_info_physical_field_indexical_p(v_object)) {
            return anonymize_table_info_physical_field_indexical(v_object);
        }
        if (NIL != table_info_sk_source_p(v_object)) {
            return anonymize_table_info_sk_source(v_object);
        }
        if (NIL != table_info_logical_schema_p(v_object)) {
            return anonymize_table_info_logical_schema(v_object);
        }
        if (NIL != table_info_physical_schema_p(v_object)) {
            return anonymize_table_info_physical_schema(v_object);
        }
        return v_object;
    }

    public static SubLObject anonymize_table_info_logical_field(final SubLObject table_info_lf) {
        SubLObject lf = NIL;
        SubLObject table_info_id = NIL;
        SubLObject col = NIL;
        SubLObject i = NIL;
        destructuring_bind_must_consp(table_info_lf, table_info_lf, $list243);
        lf = table_info_lf.first();
        SubLObject current = table_info_lf.rest();
        destructuring_bind_must_consp(current, table_info_lf, $list243);
        table_info_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lf, $list243);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lf, $list243);
        i = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(lf, MINUS_ONE_INTEGER, col, MINUS_ONE_INTEGER);
        }
        cdestructuring_bind_error(table_info_lf, $list243);
        return NIL;
    }

    public static SubLObject anonymize_table_info_logical_field_indexical(final SubLObject table_info_lfi) {
        SubLObject lfi = NIL;
        SubLObject table_info_id = NIL;
        SubLObject col = NIL;
        SubLObject i = NIL;
        destructuring_bind_must_consp(table_info_lfi, table_info_lfi, $list241);
        lfi = table_info_lfi.first();
        SubLObject current = table_info_lfi.rest();
        destructuring_bind_must_consp(current, table_info_lfi, $list241);
        table_info_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lfi, $list241);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_lfi, $list241);
        i = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(lfi, MINUS_ONE_INTEGER, col, MINUS_ONE_INTEGER);
        }
        cdestructuring_bind_error(table_info_lfi, $list241);
        return NIL;
    }

    public static SubLObject anonymize_table_info_physical_field_indexical(final SubLObject table_info_pfi) {
        SubLObject pfi = NIL;
        SubLObject table_info_id = NIL;
        SubLObject field_name = NIL;
        destructuring_bind_must_consp(table_info_pfi, table_info_pfi, $list245);
        pfi = table_info_pfi.first();
        SubLObject current = table_info_pfi.rest();
        destructuring_bind_must_consp(current, table_info_pfi, $list245);
        table_info_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, table_info_pfi, $list245);
        field_name = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(pfi, MINUS_ONE_INTEGER, field_name);
        }
        cdestructuring_bind_error(table_info_pfi, $list245);
        return NIL;
    }

    public static SubLObject anonymize_table_info_sk_source(final SubLObject table_info_ks) {
        SubLObject ks_token = NIL;
        SubLObject table_info_id = NIL;
        destructuring_bind_must_consp(table_info_ks, table_info_ks, $list236);
        ks_token = table_info_ks.first();
        SubLObject current = table_info_ks.rest();
        destructuring_bind_must_consp(current, table_info_ks, $list236);
        table_info_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(ks_token, MINUS_ONE_INTEGER);
        }
        cdestructuring_bind_error(table_info_ks, $list236);
        return NIL;
    }

    public static SubLObject anonymize_table_info_logical_schema(final SubLObject table_info_ls) {
        SubLObject ls_token = NIL;
        SubLObject table_info_id = NIL;
        destructuring_bind_must_consp(table_info_ls, table_info_ls, $list237);
        ls_token = table_info_ls.first();
        SubLObject current = table_info_ls.rest();
        destructuring_bind_must_consp(current, table_info_ls, $list237);
        table_info_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(ls_token, MINUS_ONE_INTEGER);
        }
        cdestructuring_bind_error(table_info_ls, $list237);
        return NIL;
    }

    public static SubLObject anonymize_table_info_physical_schema(final SubLObject table_info_ps) {
        SubLObject ps_token = NIL;
        SubLObject table_info_id = NIL;
        destructuring_bind_must_consp(table_info_ps, table_info_ps, $list238);
        ps_token = table_info_ps.first();
        SubLObject current = table_info_ps.rest();
        destructuring_bind_must_consp(current, table_info_ps, $list238);
        table_info_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(ps_token, MINUS_ONE_INTEGER);
        }
        cdestructuring_bind_error(table_info_ps, $list238);
        return NIL;
    }

    public static SubLObject start_reifying_new_physical_schema(final SubLObject ps_name, final SubLObject mapping_mt) {
        final SubLObject ps = (NIL != sksi_database_fusion_debugP()) ? sksi_kb_accessors.sksi_find_or_create(ps_name) : sksi_kb_accessors.sksi_create(ps_name);
        sksi_kb_accessors.sksi_assert_if_new(listS($$isa, ps, $list247), mapping_mt);
        return ps;
    }

    public static SubLObject finish_reifying_new_physical_schema(final SubLObject ps, final SubLObject ks, final SubLObject ls, final SubLObject enumerableP, final SubLObject field_names, final SubLObject field_types, final SubLObject primary_key, final SubLObject indexes, final SubLObject field_encodings, final SubLObject field_decodings, final SubLObject foreign_key_maps, final SubLObject non_null_field_list, final SubLObject unique_field_tuples, final SubLObject kb_table_index, final SubLObject mapping_mt) {
        sksi_kb_accessors.sksi_assert_if_new(list($$physicalSchemaSourceMap, ps, ks), mapping_mt);
        sksi_kb_accessors.sksi_assert_if_new(list($$logicalPhysicalSchemaMap, ls, ps), mapping_mt);
        if (NIL != enumerableP) {
            sksi_kb_accessors.sksi_assert_if_new(list($$enumerableSchema, ps), mapping_mt);
        }
        sksi_kb_accessors.sksi_assert_if_new(list($$schemaFieldNameList, ps, make_el_list(field_names, UNPROVIDED)), mapping_mt);
        SubLObject field_name = NIL;
        SubLObject field_name_$19 = NIL;
        SubLObject field_type = NIL;
        SubLObject field_type_$20 = NIL;
        field_name = field_names;
        field_name_$19 = field_name.first();
        field_type = field_types;
        field_type_$20 = field_type.first();
        while ((NIL != field_type) || (NIL != field_name)) {
            final SubLObject pf = table_info_field_name_to_physical_field(field_name_$19, ps);
            sksi_kb_accessors.sksi_assert_if_new(list($$fieldDataType, pf, field_type_$20), mapping_mt);
            field_name = field_name.rest();
            field_name_$19 = field_name.first();
            field_type = field_type.rest();
            field_type_$20 = field_type.first();
        } 
        if (NIL != primary_key) {
            final SubLObject pfs = table_info_field_names_to_physical_fields(primary_key, ps);
            sksi_kb_accessors.sksi_assert_if_new(list($$primaryKey, ps, make_el_list(pfs, UNPROVIDED)), mapping_mt);
        }
        SubLObject cdolist_list_var = indexes;
        SubLObject indexed_field_list = NIL;
        indexed_field_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pfs2 = table_info_field_names_to_physical_fields(indexed_field_list, ps);
            sksi_kb_accessors.sksi_assert_if_new(list($$indexedFields, ps, make_el_list(pfs2, UNPROVIDED)), mapping_mt);
            cdolist_list_var = cdolist_list_var.rest();
            indexed_field_list = cdolist_list_var.first();
        } 
        cdolist_list_var = field_encodings;
        SubLObject field_encoding = NIL;
        field_encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = field_encoding;
            SubLObject field_name2 = NIL;
            SubLObject encoding = NIL;
            destructuring_bind_must_consp(current, datum, $list255);
            field_name2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list255);
            encoding = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pfi = table_info_field_name_to_physical_field_indexical(field_name2, ps);
                final SubLObject kb_encoding = kbify_field_encoding(encoding, kb_table_index);
                sksi_kb_accessors.sksi_assert_if_new(list($$fieldEncoding, ps, pfi, ls, kb_encoding), mapping_mt);
            } else {
                cdestructuring_bind_error(datum, $list255);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding = cdolist_list_var.first();
        } 
        cdolist_list_var = field_decodings;
        SubLObject field_decoding = NIL;
        field_decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = field_decoding;
            SubLObject table_info_lfi = NIL;
            SubLObject decoding = NIL;
            destructuring_bind_must_consp(current, datum, $list257);
            table_info_lfi = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list257);
            decoding = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject lfi = kbify_logical_field_indexicals(table_info_lfi, kb_table_index);
                final SubLObject kb_decoding = kbify_field_decoding(decoding, kb_table_index);
                sksi_kb_accessors.sksi_assert_if_new(list($$fieldDecoding, ls, lfi, ps, kb_decoding), mapping_mt);
            } else {
                cdestructuring_bind_error(datum, $list257);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_decoding = cdolist_list_var.first();
        } 
        final SubLObject non_null_pfs = table_info_field_names_to_physical_fields(non_null_field_list, ps);
        sksi_kb_accessors.sksi_assert_if_new(list($$nonNullFieldList, ps, make_el_list(non_null_pfs, UNPROVIDED)), mapping_mt);
        cdolist_list_var = unique_field_tuples;
        SubLObject unique_field_list = NIL;
        unique_field_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject unique_pfs = table_info_field_names_to_physical_fields(unique_field_list, ps);
            sksi_kb_accessors.sksi_assert_if_new(list($$uniqueFieldList, ps, make_el_list(unique_pfs, UNPROVIDED)), mapping_mt);
            cdolist_list_var = cdolist_list_var.rest();
            unique_field_list = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(ps) : "forts.fort_p(ps) " + "CommonSymbols.NIL != forts.fort_p(ps) " + ps;
        return ps;
    }

    public static SubLObject table_info_field_names_to_physical_fields(final SubLObject field_names, final SubLObject ps) {
        SubLObject pfs = NIL;
        SubLObject cdolist_list_var = field_names;
        SubLObject field_name = NIL;
        field_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pfs = cons(table_info_field_name_to_physical_field(field_name, ps), pfs);
            cdolist_list_var = cdolist_list_var.rest();
            field_name = cdolist_list_var.first();
        } 
        return nreverse(pfs);
    }

    public static SubLObject table_info_field_name_to_physical_field(final SubLObject field_name, final SubLObject ps) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pf = sksi_kb_accessors.physical_field_for_schema_and_name(ps, field_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(pf))) {
            Errors.error($str261$Error_getting_physical_field__s_i, field_name, ps);
        }
        return pf;
    }

    public static SubLObject table_info_field_name_to_physical_field_indexical(final SubLObject field_name, final SubLObject ps) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field(sksi_kb_accessors.physical_field_for_schema_and_name(ps, field_name));
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(pfi))) {
            Errors.error($str262$Error_getting_indexical_for_physi, field_name, ps);
        }
        return pfi;
    }

    public static SubLObject kbify_field_encoding(final SubLObject encoding, final SubLObject kb_table_index) {
        return kbify_logical_field_indexicals(encoding, kb_table_index);
    }

    public static SubLObject kbify_field_decoding(final SubLObject decoding, final SubLObject kb_table_index) {
        return kbify_physical_field_indexicals(decoding, kb_table_index);
    }

    public static SubLObject compute_db_clone_forward_inference_allowed_rules(final SubLObject input_ks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kill_all_cloned_bln_terms();
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = input_ks_list;
        SubLObject input_ks = NIL;
        input_ks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clone_database(input_ks, T);
            cdolist_list_var = cdolist_list_var.rest();
            input_ks = cdolist_list_var.first();
        } 
        final SubLObject list_var = all_cloned_bln_terms();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
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
                SubLObject v_const = NIL;
                v_const = csome_list_var.first();
                while (NIL != csome_list_var) {
                    rules = append(rules, assertion_utilities.all_forward_rules_relevant_to_term(v_const));
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_const = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
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
        return list_utilities.fast_delete_duplicates(rules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_cloned_bln_terms() {
        SubLObject terms = NIL;
        SubLObject cdolist_list_var = constant_completion_high.constant_complete($$$BLN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_const = NIL;
        v_const = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.substringP($$$Cloned, constants_high.constant_name(v_const), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                terms = cons(v_const, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_const = cdolist_list_var.first();
        } 
        return nreverse(terms);
    }

    public static SubLObject kill_all_cloned_bln_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject list_var = all_cloned_bln_terms();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
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
                SubLObject v_const = NIL;
                v_const = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != cyc_kernel.cyc_kill(v_const)) {
                        count = add(count, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_const = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
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
        return count;
    }

    public static SubLObject fuse_databases(final SubLObject input_sk_sources, SubLObject kill_old_fused_databasesP) {
        if (kill_old_fused_databasesP == UNPROVIDED) {
            kill_old_fused_databasesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fused_ks = NIL;
        final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding(thread);
        try {
            $within_sksi_database_fusionP$.bind(T, thread);
            if (NIL != kill_old_fused_databasesP) {
                kill_all_fused_databases(input_sk_sources);
            }
            final SubLObject db_info = compute_and_fuse_db_info(input_sk_sources);
            fused_ks = reify_fused_db_info(db_info, input_sk_sources);
            sksi_create_sks.sksi_create_structured_knowledge_source(fused_ks, UNPROVIDED);
            sksi_populate_fused_ks(db_info, input_sk_sources, fused_ks);
        } finally {
            $within_sksi_database_fusionP$.rebind(_prev_bind_0, thread);
        }
        return fused_ks;
    }

    public static SubLObject kill_all_fused_databases(final SubLObject ks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = T;
        assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p($WARN) : "sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw176$WARN) " + "CommonSymbols.NIL != sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw176$WARN) " + $WARN;
        final SubLObject _prev_bind_0 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
        try {
            sksi_debugging.$sksi_error_handling_mode$.bind($WARN, thread);
            final SubLObject el_ks_list = czer_main.canonicalize_term(make_el_list(ks_list, UNPROVIDED), UNPROVIDED);
            SubLObject cdolist_list_var = ask_utilities.query_variable($X, list($$sksFusionSources, $X, el_ks_list), $$SKSIMt, UNPROVIDED);
            SubLObject fused_ks = NIL;
            fused_ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sksi_create_sks.sksi_destroy_structured_knowledge_source(fused_ks, UNPROVIDED)) {
                    successP = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                fused_ks = cdolist_list_var.first();
            } 
        } finally {
            sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static SubLObject reify_fused_db_info(final SubLObject db_info, final SubLObject input_sk_sources) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fused_ks = NIL;
        final SubLObject _prev_bind_0 = $inference_debugP$.currentBinding(thread);
        try {
            $inference_debugP$.bind(T, thread);
            assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p($BREAK) : "sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw179$BREAK) " + "CommonSymbols.NIL != sksi_debugging.valid_sksi_error_handling_mode_p(sksi_database_fusion.$kw179$BREAK) " + $BREAK;
            final SubLObject _prev_bind_0_$23 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
            try {
                sksi_debugging.$sksi_error_handling_mode$.bind($BREAK, thread);
                final SubLObject mt = compute_db_fusion_mt(input_sk_sources);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$24 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    fused_ks = start_reifying_new_top_level_ks(db_info);
                    sksi_kb_accessors.sksi_assert_if_new(list($$sksFusionSources, fused_ks, make_el_list(input_sk_sources, UNPROVIDED)), $$SKSIMt);
                    finish_reifying_db_info(fused_ks, db_info);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$24, thread);
                }
            } finally {
                sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0_$23, thread);
            }
        } finally {
            $inference_debugP$.rebind(_prev_bind_0, thread);
        }
        return fused_ks;
    }

    public static SubLObject sksi_populate_fused_ks(final SubLObject db_info, final SubLObject input_sk_sources, final SubLObject fused_ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding(thread);
        try {
            $within_sksi_database_fusionP$.bind(T, thread);
            try {
                sksi_sks_manager.register_sksi_removal_modules_for_skses(cons(fused_ks, input_sk_sources));
                result = sksi_populate_fused_ks_int(db_info, fused_ks);
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sksi_sks_manager.deregister_sksi_removal_modules_for_skses(cons(fused_ks, input_sk_sources));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            $within_sksi_database_fusionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_populate_fused_ks_int(final SubLObject db_info, final SubLObject output_ks) {
        SubLObject successP = T;
        final SubLObject input_mt = db_info_input_mt(db_info);
        final SubLObject output_mt = czer_main.cyc_find_or_create_nart(list($$ContentMtFn, output_ks), UNPROVIDED);
        SubLObject cdolist_list_var = db_info_table_infos(db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == sksi_populate_sub_ks(input_mt, output_mt, table_info)) {
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return successP;
    }

    public static SubLObject compute_and_fuse_db_info(final SubLObject input_sk_sources) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fused_db_info = NIL;
        final SubLObject _prev_bind_0 = $within_sksi_database_fusionP$.currentBinding(thread);
        try {
            $within_sksi_database_fusionP$.bind(T, thread);
            final SubLObject mt = compute_db_fusion_mt(input_sk_sources);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$26 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject db_infos = NIL;
                SubLObject cdolist_list_var = input_sk_sources;
                SubLObject input_ks = NIL;
                input_ks = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    db_infos = cons(compute_initial_db_info(input_ks), db_infos);
                    cdolist_list_var = cdolist_list_var.rest();
                    input_ks = cdolist_list_var.first();
                } 
                db_infos = nreverse(db_infos);
                final SubLObject trivially_fused_db_info = trivially_fuse_db_infos(db_infos);
                fused_db_info = fuse_db_info(trivially_fused_db_info);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$26, thread);
            }
        } finally {
            $within_sksi_database_fusionP$.rebind(_prev_bind_0, thread);
        }
        $last_db_info$.setGlobalValue(fused_db_info);
        return fused_db_info;
    }

    public static SubLObject compute_db_fusion_mt(final SubLObject sk_sources) {
        final SubLObject list_var;
        final SubLObject mts = list_var = Mapping.mapcar(SK_SOURCE_MAPPING_MT, sk_sources);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != hlmt.hlmt_p(elem) : "hlmt.hlmt_p(elem) " + "CommonSymbols.NIL != hlmt.hlmt_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject mt = hlmt.reduce_hlmt(bq_cons($$MtUnionFn, append(mts, NIL)), T);
        return mt;
    }

    public static SubLObject trivially_fuse_db_infos(final SubLObject db_infos) {
        if (NIL != sksi_database_fusion_debugP()) {
            SubLObject cdolist_list_var = db_infos;
            SubLObject db_info = NIL;
            db_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terpri(UNPROVIDED);
                terpri(UNPROVIDED);
                print_db_info_contents(db_info);
                cdolist_list_var = cdolist_list_var.rest();
                db_info = cdolist_list_var.first();
            } 
        }
        final SubLObject primary_db_info = db_infos.first();
        final SubLObject other_db_infos = db_infos.rest();
        fuse_db_info_table_infos(primary_db_info, other_db_infos);
        fuse_db_info_constant_names(primary_db_info);
        fuse_db_info_db_names(primary_db_info);
        fuse_db_info_quoted_isas(primary_db_info, other_db_infos);
        fuse_db_info_input_mt(primary_db_info, other_db_infos);
        fuse_db_info_content_genl_mts(primary_db_info, other_db_infos);
        return primary_db_info;
    }

    public static SubLObject fuse_db_info_table_infos(final SubLObject primary_db_info, final SubLObject other_db_infos) {
        final SubLObject table_name_set = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        SubLObject cdolist_list_var = db_info_table_infos(primary_db_info);
        SubLObject primary_table_info = NIL;
        primary_table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_name = table_info_table_name(primary_table_info);
            if (NIL != set.set_memberP(table_name, table_name_set)) {
                Errors.error($str270$Name_conflict_in__s__two_tables_n, primary_db_info, table_name);
            } else {
                set.set_add(table_name, table_name_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            primary_table_info = cdolist_list_var.first();
        } 
        cdolist_list_var = other_db_infos;
        SubLObject db_info = NIL;
        db_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$27;
            final SubLObject table_infos = cdolist_list_var_$27 = db_info_table_infos(db_info);
            SubLObject table_info = NIL;
            table_info = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                final SubLObject original_table_name = table_info_table_name(table_info);
                SubLObject uniqueP = NIL;
                SubLObject uniquifying_integer = ONE_INTEGER;
                SubLObject uniquifying_suffix = $str183$;
                while (NIL == uniqueP) {
                    final SubLObject new_table_name = cconcatenate(original_table_name, uniquifying_suffix);
                    uniqueP = makeBoolean(NIL == set.set_memberP(new_table_name, table_name_set));
                    if (NIL != uniqueP) {
                        set_table_info_table_name(table_info, new_table_name);
                    } else {
                        uniquifying_integer = add(uniquifying_integer, ONE_INTEGER);
                        uniquifying_suffix = cconcatenate($str184$_, string_utilities.str(uniquifying_integer));
                    }
                } 
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                table_info = cdolist_list_var_$27.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            db_info = cdolist_list_var.first();
        } 
        return merge_db_info_table_infos(primary_db_info, other_db_infos);
    }

    public static SubLObject merge_db_info_table_infos(final SubLObject primary_db_info, final SubLObject other_db_infos) {
        SubLObject merged_table_infos = db_info_table_infos(primary_db_info);
        SubLObject cdolist_list_var = other_db_infos;
        SubLObject db_info = NIL;
        db_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_infos = db_info_table_infos(db_info);
            merged_table_infos = append(merged_table_infos, table_infos);
            cdolist_list_var = cdolist_list_var.rest();
            db_info = cdolist_list_var.first();
        } 
        set_db_info_table_infos(primary_db_info, merged_table_infos);
        return primary_db_info;
    }

    public static SubLObject fuse_db_info_constant_names(final SubLObject primary_db_info) {
        final SubLObject primary_constant_base_name = db_info_constant_base_name(primary_db_info);
        final SubLObject fused_constant_base_name = fuse_constant_base_name(primary_constant_base_name);
        set_db_info_constant_base_name(primary_db_info, fused_constant_base_name);
        SubLObject cdolist_list_var = db_info_table_infos(primary_db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_constant_base_name = fuse_constant_base_name(table_info_constant_base_name(table_info));
            set_table_info_constant_base_name(table_info, new_constant_base_name);
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return primary_db_info;
    }

    public static SubLObject fuse_constant_base_name(final SubLObject original_constant_base_name) {
        return cconcatenate(original_constant_base_name, $str191$_Fused);
    }

    public static SubLObject fuse_db_info_db_names(final SubLObject primary_db_info) {
        final SubLObject primary_db_name = db_info_db_name(primary_db_info);
        final SubLObject fused_db_name = cconcatenate(primary_db_name, $str271$_fused);
        return uniquify_db_info_db_name(fused_db_name, primary_db_info);
    }

    public static SubLObject fuse_db_info_quoted_isas(final SubLObject primary_db_info, final SubLObject other_db_infos) {
        SubLObject merged_quoted_isas = db_info_quoted_isas(primary_db_info);
        SubLObject cdolist_list_var = other_db_infos;
        SubLObject db_info = NIL;
        db_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject quoted_isas = db_info_quoted_isas(db_info);
            merged_quoted_isas = append(quoted_isas, merged_quoted_isas);
            cdolist_list_var = cdolist_list_var.rest();
            db_info = cdolist_list_var.first();
        } 
        set_db_info_quoted_isas(primary_db_info, genls.min_cols(merged_quoted_isas, $$BookkeepingMt, UNPROVIDED));
        return primary_db_info;
    }

    public static SubLObject fuse_db_info_input_mt(final SubLObject primary_db_info, final SubLObject other_db_infos) {
        SubLObject input_mts = list(db_info_input_mt(primary_db_info));
        SubLObject cdolist_list_var = other_db_infos;
        SubLObject db_info = NIL;
        db_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject input_mt = db_info_input_mt(db_info);
            input_mts = cons(input_mt, input_mts);
            cdolist_list_var = cdolist_list_var.rest();
            db_info = cdolist_list_var.first();
        } 
        set_db_info_input_mt(primary_db_info, hlmt.reduce_hlmt(bq_cons($$MtUnionFn, append(input_mts, NIL)), T));
        return primary_db_info;
    }

    public static SubLObject fuse_db_info_content_genl_mts(final SubLObject primary_db_info, final SubLObject other_db_infos) {
        SubLObject merged_content_genl_mts = db_info_content_genl_mts(primary_db_info);
        SubLObject cdolist_list_var = other_db_infos;
        SubLObject db_info = NIL;
        db_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject content_genl_mts = db_info_content_genl_mts(db_info);
            merged_content_genl_mts = append(content_genl_mts, merged_content_genl_mts);
            cdolist_list_var = cdolist_list_var.rest();
            db_info = cdolist_list_var.first();
        } 
        set_db_info_content_genl_mts(primary_db_info, genl_mts.min_mts(merged_content_genl_mts, UNPROVIDED));
        return primary_db_info;
    }

    public static SubLObject fuse_db_info(final SubLObject db_info) {
        SubLObject current_db_info = db_info;
        SubLObject new_db_info = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            new_db_info = fuse_db_info_do_one_step(current_db_info);
            if (NIL != new_db_info) {
                current_db_info = new_db_info;
            } else {
                doneP = T;
            }
        } 
        return current_db_info;
    }

    public static SubLObject fuse_db_info_do_one_step(final SubLObject db_info) {
        return NIL;
    }

    public static SubLObject merge_two_db_info_tables(final SubLObject db_info) {
        final SubLObject merge_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = db_info_table_infos(db_info);
        SubLObject table_info = NIL;
        table_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isas = kb_utilities.sort_forts(genls.min_cols(table_info_isas(table_info), UNPROVIDED, UNPROVIDED));
            if (NIL != isas) {
                final SubLObject table_info_to_merge = dictionary.dictionary_lookup(merge_dict, isas, UNPROVIDED);
                if (NIL != table_info_to_merge) {
                    return merge_two_db_info_tables_int(db_info, table_info_to_merge, table_info);
                }
                dictionary.dictionary_enter(merge_dict, isas, table_info);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_info = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject merge_two_db_info_tables_int(final SubLObject db_info, final SubLObject keep_table_info, final SubLObject kill_table_info) {
        final SubLObject keep_sentences = list_utilities.fast_delete_duplicates(transform_list_utilities.quiescent_transform(table_info_meaning_sentences(keep_table_info), KBIFIABLE_P, ANONYMIZE_TABLE_INFO_OBJECT, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject kill_sentences = list_utilities.fast_delete_duplicates(transform_list_utilities.quiescent_transform(table_info_meaning_sentences(kill_table_info), KBIFIABLE_P, ANONYMIZE_TABLE_INFO_OBJECT, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject shared_sentences = keyhash_utilities.fast_intersection(kill_sentences, keep_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sentences_to_copy = set_difference(kill_sentences, shared_sentences, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = shared_sentences;
        SubLObject shared_sentence = NIL;
        shared_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            merge_two_db_info_meaning_sentences(db_info, shared_sentence, keep_table_info, kill_table_info);
            cdolist_list_var = cdolist_list_var.rest();
            shared_sentence = cdolist_list_var.first();
        } 
        return db_info;
    }

    public static SubLObject merge_two_db_info_meaning_sentences(final SubLObject db_info, final SubLObject shared_sentence, final SubLObject keep_table_info, final SubLObject kill_table_info) {
        final SubLObject lfi_merge_pairs = compute_lfi_merge_pairs(shared_sentence, keep_table_info, kill_table_info);
        final SubLObject id_merge_pairs = compute_id_merge_pairs(db_info, shared_sentence, lfi_merge_pairs, keep_table_info, kill_table_info);
        return db_info;
    }

    public static SubLObject compute_lfi_merge_pairs(final SubLObject shared_sentence, final SubLObject keep_table_info, final SubLObject kill_table_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keep_lfis = list_utilities.fast_delete_duplicates(cycl_utilities.expression_gather(table_info_meaning_sentences(keep_table_info), TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject kill_lfis = list_utilities.fast_delete_duplicates(cycl_utilities.expression_gather(table_info_meaning_sentences(kill_table_info), TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject shared_lfis = list_utilities.fast_delete_duplicates(cycl_utilities.expression_gather(shared_sentence, TABLE_INFO_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject keep_lfis_to_merge = NIL;
        SubLObject kill_lfis_to_merge = NIL;
        SubLObject cdolist_list_var = keep_lfis;
        SubLObject keep_lfi = NIL;
        keep_lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.member_equalP(anonymize_table_info_object(keep_lfi), shared_lfis)) {
                keep_lfis_to_merge = cons(keep_lfi, keep_lfis_to_merge);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keep_lfi = cdolist_list_var.first();
        } 
        cdolist_list_var = kill_lfis;
        SubLObject kill_lfi = NIL;
        kill_lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.member_equalP(anonymize_table_info_object(kill_lfi), shared_lfis)) {
                kill_lfis_to_merge = cons(kill_lfi, kill_lfis_to_merge);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kill_lfi = cdolist_list_var.first();
        } 
        SubLObject lfi_merge_pairs = NIL;
        SubLObject cdolist_list_var2 = keep_lfis_to_merge;
        SubLObject keep_lfi_to_merge = NIL;
        keep_lfi_to_merge = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var_$28 = kill_lfis_to_merge;
            SubLObject kill_lfi_to_merge = NIL;
            kill_lfi_to_merge = cdolist_list_var_$28.first();
            while (NIL != cdolist_list_var_$28) {
                if (anonymize_table_info_object(keep_lfi_to_merge).equal(anonymize_table_info_object(kill_lfi_to_merge))) {
                    count = add(count, ONE_INTEGER);
                    lfi_merge_pairs = cons(list(keep_lfi_to_merge, kill_lfi_to_merge), lfi_merge_pairs);
                }
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                kill_lfi_to_merge = cdolist_list_var_$28.first();
            } 
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!count.numLE(ONE_INTEGER))) {
                Errors.error($str273$Can_t_yet_handle_duplicate_LFI_ty, lfi_merge_pairs);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            keep_lfi_to_merge = cdolist_list_var2.first();
        } 
        return lfi_merge_pairs;
    }

    public static SubLObject compute_id_merge_pairs(final SubLObject db_info, final SubLObject shared_sentence, final SubLObject lfi_merge_pairs, final SubLObject keep_table_info, final SubLObject kill_table_info) {
        final SubLObject isas = list_utilities.fast_delete_duplicates(append(table_info_isas(keep_table_info), table_info_isas(kill_table_info)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject object_vars = NIL;
        SubLObject query_sentence = copy_expression(shared_sentence);
        SubLObject cdolist_list_var = lfi_merge_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject keep_lfi = NIL;
            SubLObject kill_lfi = NIL;
            destructuring_bind_must_consp(current, datum, $list274);
            keep_lfi = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list274);
            kill_lfi = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject anonymized_lfi = anonymize_table_info_object(keep_lfi);
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(query_sentence, UNPROVIDED);
                if (NIL != list_utilities.member_eqP(third(anonymized_lfi), isas)) {
                    object_vars = cons(new_var, object_vars);
                }
                query_sentence = cycl_utilities.expression_nsubst(new_var, anonymized_lfi, query_sentence, symbol_function(EQUAL), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list274);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        query_sentence = list($$sksiSentence, query_sentence);
        final SubLObject binding_lists = inference_kernel.new_cyc_query(query_sentence, db_info_input_mt(db_info), UNPROVIDED);
        format_nil.print_one_per_line(binding_lists, UNPROVIDED);
        return NIL;
    }

    public static SubLObject all_fused_bln_terms() {
        SubLObject terms = NIL;
        SubLObject cdolist_list_var = constant_completion_high.constant_complete($$$BLN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_const = NIL;
        v_const = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.substringP($$$Fused, constants_high.constant_name(v_const), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                terms = cons(v_const, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_const = cdolist_list_var.first();
        } 
        return nreverse(terms);
    }

    public static SubLObject kill_all_fused_bln_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject list_var = all_fused_bln_terms();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
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
                SubLObject v_const = NIL;
                v_const = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != cyc_kernel.cyc_kill(v_const)) {
                        count = add(count, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_const = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
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
        return count;
    }

    public static SubLObject declare_sksi_database_fusion_file() {
        declareFunction(me, "within_sksi_database_fusionP", "WITHIN-SKSI-DATABASE-FUSION?", 0, 0, false);
        declareFunction(me, "sksi_database_fusion_debugP", "SKSI-DATABASE-FUSION-DEBUG?", 0, 0, false);
        declareFunction(me, "db_info_print_function_trampoline", "DB-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "db_info_p", "DB-INFO-P", 1, 0, false);
        new sksi_database_fusion.$db_info_p$UnaryFunction();
        declareFunction(me, "dbnfo_constant_base_name", "DBNFO-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "dbnfo_db_name", "DBNFO-DB-NAME", 1, 0, false);
        declareFunction(me, "dbnfo_table_infos", "DBNFO-TABLE-INFOS", 1, 0, false);
        declareFunction(me, "dbnfo_table_info_index", "DBNFO-TABLE-INFO-INDEX", 1, 0, false);
        declareFunction(me, "dbnfo_server", "DBNFO-SERVER", 1, 0, false);
        declareFunction(me, "dbnfo_port", "DBNFO-PORT", 1, 0, false);
        declareFunction(me, "dbnfo_proxy_host", "DBNFO-PROXY-HOST", 1, 0, false);
        declareFunction(me, "dbnfo_proxy_port", "DBNFO-PROXY-PORT", 1, 0, false);
        declareFunction(me, "dbnfo_user", "DBNFO-USER", 1, 0, false);
        declareFunction(me, "dbnfo_pass", "DBNFO-PASS", 1, 0, false);
        declareFunction(me, "dbnfo_subprotocol", "DBNFO-SUBPROTOCOL", 1, 0, false);
        declareFunction(me, "dbnfo_sql_flavor", "DBNFO-SQL-FLAVOR", 1, 0, false);
        declareFunction(me, "dbnfo_quoted_isas", "DBNFO-QUOTED-ISAS", 1, 0, false);
        declareFunction(me, "dbnfo_input_mt", "DBNFO-INPUT-MT", 1, 0, false);
        declareFunction(me, "dbnfo_content_genl_mts", "DBNFO-CONTENT-GENL-MTS", 1, 0, false);
        declareFunction(me, "_csetf_dbnfo_constant_base_name", "_CSETF-DBNFO-CONSTANT-BASE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_db_name", "_CSETF-DBNFO-DB-NAME", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_table_infos", "_CSETF-DBNFO-TABLE-INFOS", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_table_info_index", "_CSETF-DBNFO-TABLE-INFO-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_server", "_CSETF-DBNFO-SERVER", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_port", "_CSETF-DBNFO-PORT", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_proxy_host", "_CSETF-DBNFO-PROXY-HOST", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_proxy_port", "_CSETF-DBNFO-PROXY-PORT", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_user", "_CSETF-DBNFO-USER", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_pass", "_CSETF-DBNFO-PASS", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_subprotocol", "_CSETF-DBNFO-SUBPROTOCOL", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_sql_flavor", "_CSETF-DBNFO-SQL-FLAVOR", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_quoted_isas", "_CSETF-DBNFO-QUOTED-ISAS", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_input_mt", "_CSETF-DBNFO-INPUT-MT", 2, 0, false);
        declareFunction(me, "_csetf_dbnfo_content_genl_mts", "_CSETF-DBNFO-CONTENT-GENL-MTS", 2, 0, false);
        declareFunction(me, "make_db_info", "MAKE-DB-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_db_info", "VISIT-DEFSTRUCT-DB-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_db_info_method", "VISIT-DEFSTRUCT-OBJECT-DB-INFO-METHOD", 2, 0, false);
        declareFunction(me, "print_db_info", "PRINT-DB-INFO", 3, 0, false);
        declareFunction(me, "new_db_info", "NEW-DB-INFO", 13, 0, false);
        declareFunction(me, "db_info_constant_base_name", "DB-INFO-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "db_info_db_name", "DB-INFO-DB-NAME", 1, 0, false);
        declareFunction(me, "db_info_table_infos", "DB-INFO-TABLE-INFOS", 1, 0, false);
        declareFunction(me, "db_info_table_info_index", "DB-INFO-TABLE-INFO-INDEX", 1, 0, false);
        declareFunction(me, "db_info_server", "DB-INFO-SERVER", 1, 0, false);
        declareFunction(me, "db_info_port", "DB-INFO-PORT", 1, 0, false);
        declareFunction(me, "db_info_proxy_host", "DB-INFO-PROXY-HOST", 1, 0, false);
        declareFunction(me, "db_info_proxy_port", "DB-INFO-PROXY-PORT", 1, 0, false);
        declareFunction(me, "db_info_user", "DB-INFO-USER", 1, 0, false);
        declareFunction(me, "db_info_pass", "DB-INFO-PASS", 1, 0, false);
        declareFunction(me, "db_info_subprotocol", "DB-INFO-SUBPROTOCOL", 1, 0, false);
        declareFunction(me, "db_info_sql_flavor", "DB-INFO-SQL-FLAVOR", 1, 0, false);
        declareFunction(me, "db_info_quoted_isas", "DB-INFO-QUOTED-ISAS", 1, 0, false);
        declareFunction(me, "db_info_input_mt", "DB-INFO-INPUT-MT", 1, 0, false);
        declareFunction(me, "db_info_content_genl_mts", "DB-INFO-CONTENT-GENL-MTS", 1, 0, false);
        declareFunction(me, "set_db_info_constant_base_name", "SET-DB-INFO-CONSTANT-BASE-NAME", 2, 0, false);
        declareFunction(me, "set_db_info_table_infos", "SET-DB-INFO-TABLE-INFOS", 2, 0, false);
        declareFunction(me, "set_db_info_db_name", "SET-DB-INFO-DB-NAME", 2, 0, false);
        declareFunction(me, "set_db_info_quoted_isas", "SET-DB-INFO-QUOTED-ISAS", 2, 0, false);
        declareFunction(me, "set_db_info_input_mt", "SET-DB-INFO-INPUT-MT", 2, 0, false);
        declareFunction(me, "set_db_info_content_genl_mts", "SET-DB-INFO-CONTENT-GENL-MTS", 2, 0, false);
        declareFunction(me, "db_info_ks_name", "DB-INFO-KS-NAME", 1, 0, false);
        declareFunction(me, "db_info_table_info", "DB-INFO-TABLE-INFO", 2, 0, false);
        declareFunction(me, "print_db_info_contents", "PRINT-DB-INFO-CONTENTS", 1, 0, false);
        declareFunction(me, "reindex_db_info_table_infos", "REINDEX-DB-INFO-TABLE-INFOS", 1, 0, false);
        declareFunction(me, "table_info_print_function_trampoline", "TABLE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "table_info_p", "TABLE-INFO-P", 1, 0, false);
        new sksi_database_fusion.$table_info_p$UnaryFunction();
        declareFunction(me, "tblnfo_id", "TBLNFO-ID", 1, 0, false);
        declareFunction(me, "tblnfo_constant_base_name", "TBLNFO-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "tblnfo_table_name", "TBLNFO-TABLE-NAME", 1, 0, false);
        declareFunction(me, "tblnfo_isas", "TBLNFO-ISAS", 1, 0, false);
        declareFunction(me, "tblnfo_lf_types", "TBLNFO-LF-TYPES", 1, 0, false);
        declareFunction(me, "tblnfo_field_mappings", "TBLNFO-FIELD-MAPPINGS", 1, 0, false);
        declareFunction(me, "tblnfo_meaning_sentences", "TBLNFO-MEANING-SENTENCES", 1, 0, false);
        declareFunction(me, "tblnfo_enumerableP", "TBLNFO-ENUMERABLE?", 1, 0, false);
        declareFunction(me, "tblnfo_field_names", "TBLNFO-FIELD-NAMES", 1, 0, false);
        declareFunction(me, "tblnfo_field_types", "TBLNFO-FIELD-TYPES", 1, 0, false);
        declareFunction(me, "tblnfo_primary_key", "TBLNFO-PRIMARY-KEY", 1, 0, false);
        declareFunction(me, "tblnfo_indexes", "TBLNFO-INDEXES", 1, 0, false);
        declareFunction(me, "tblnfo_field_encodings", "TBLNFO-FIELD-ENCODINGS", 1, 0, false);
        declareFunction(me, "tblnfo_field_decodings", "TBLNFO-FIELD-DECODINGS", 1, 0, false);
        declareFunction(me, "tblnfo_foreign_key_maps", "TBLNFO-FOREIGN-KEY-MAPS", 1, 0, false);
        declareFunction(me, "tblnfo_non_null_field_list", "TBLNFO-NON-NULL-FIELD-LIST", 1, 0, false);
        declareFunction(me, "tblnfo_unique_field_tuples", "TBLNFO-UNIQUE-FIELD-TUPLES", 1, 0, false);
        declareFunction(me, "_csetf_tblnfo_id", "_CSETF-TBLNFO-ID", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_constant_base_name", "_CSETF-TBLNFO-CONSTANT-BASE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_table_name", "_CSETF-TBLNFO-TABLE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_isas", "_CSETF-TBLNFO-ISAS", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_lf_types", "_CSETF-TBLNFO-LF-TYPES", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_field_mappings", "_CSETF-TBLNFO-FIELD-MAPPINGS", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_meaning_sentences", "_CSETF-TBLNFO-MEANING-SENTENCES", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_enumerableP", "_CSETF-TBLNFO-ENUMERABLE?", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_field_names", "_CSETF-TBLNFO-FIELD-NAMES", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_field_types", "_CSETF-TBLNFO-FIELD-TYPES", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_primary_key", "_CSETF-TBLNFO-PRIMARY-KEY", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_indexes", "_CSETF-TBLNFO-INDEXES", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_field_encodings", "_CSETF-TBLNFO-FIELD-ENCODINGS", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_field_decodings", "_CSETF-TBLNFO-FIELD-DECODINGS", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_foreign_key_maps", "_CSETF-TBLNFO-FOREIGN-KEY-MAPS", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_non_null_field_list", "_CSETF-TBLNFO-NON-NULL-FIELD-LIST", 2, 0, false);
        declareFunction(me, "_csetf_tblnfo_unique_field_tuples", "_CSETF-TBLNFO-UNIQUE-FIELD-TUPLES", 2, 0, false);
        declareFunction(me, "make_table_info", "MAKE-TABLE-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_table_info", "VISIT-DEFSTRUCT-TABLE-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_table_info_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-INFO-METHOD", 2, 0, false);
        declareFunction(me, "print_table_info", "PRINT-TABLE-INFO", 3, 0, false);
        declareFunction(me, "new_table_info", "NEW-TABLE-INFO", 17, 0, false);
        declareFunction(me, "table_info_id", "TABLE-INFO-ID", 1, 0, false);
        declareFunction(me, "table_info_constant_base_name", "TABLE-INFO-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "table_info_isas", "TABLE-INFO-ISAS", 1, 0, false);
        declareFunction(me, "table_info_lf_types", "TABLE-INFO-LF-TYPES", 1, 0, false);
        declareFunction(me, "table_info_field_mappings", "TABLE-INFO-FIELD-MAPPINGS", 1, 0, false);
        declareFunction(me, "table_info_meaning_sentences", "TABLE-INFO-MEANING-SENTENCES", 1, 0, false);
        declareFunction(me, "table_info_enumerableP", "TABLE-INFO-ENUMERABLE?", 1, 0, false);
        declareFunction(me, "table_info_table_name", "TABLE-INFO-TABLE-NAME", 1, 0, false);
        declareFunction(me, "table_info_field_names", "TABLE-INFO-FIELD-NAMES", 1, 0, false);
        declareFunction(me, "table_info_field_types", "TABLE-INFO-FIELD-TYPES", 1, 0, false);
        declareFunction(me, "table_info_primary_key", "TABLE-INFO-PRIMARY-KEY", 1, 0, false);
        declareFunction(me, "table_info_indexes", "TABLE-INFO-INDEXES", 1, 0, false);
        declareFunction(me, "table_info_field_encodings", "TABLE-INFO-FIELD-ENCODINGS", 1, 0, false);
        declareFunction(me, "table_info_field_decodings", "TABLE-INFO-FIELD-DECODINGS", 1, 0, false);
        declareFunction(me, "table_info_foreign_key_maps", "TABLE-INFO-FOREIGN-KEY-MAPS", 1, 0, false);
        declareFunction(me, "table_info_non_null_field_list", "TABLE-INFO-NON-NULL-FIELD-LIST", 1, 0, false);
        declareFunction(me, "table_info_unique_field_tuples", "TABLE-INFO-UNIQUE-FIELD-TUPLES", 1, 0, false);
        declareFunction(me, "set_table_info_constant_base_name", "SET-TABLE-INFO-CONSTANT-BASE-NAME", 2, 0, false);
        declareFunction(me, "set_table_info_lf_types", "SET-TABLE-INFO-LF-TYPES", 2, 0, false);
        declareFunction(me, "set_table_info_meaning_sentences", "SET-TABLE-INFO-MEANING-SENTENCES", 2, 0, false);
        declareFunction(me, "set_table_info_table_name", "SET-TABLE-INFO-TABLE-NAME", 2, 0, false);
        declareFunction(me, "table_info_ks_name", "TABLE-INFO-KS-NAME", 1, 0, false);
        declareFunction(me, "table_info_ls_name", "TABLE-INFO-LS-NAME", 1, 0, false);
        declareFunction(me, "table_info_ps_name", "TABLE-INFO-PS-NAME", 1, 0, false);
        declareFunction(me, "print_table_info_contents", "PRINT-TABLE-INFO-CONTENTS", 1, 0, false);
        declareFunction(me, "table_info_id_p", "TABLE-INFO-ID-P", 1, 0, false);
        declareFunction(me, "table_info_field_encoding_p", "TABLE-INFO-FIELD-ENCODING-P", 1, 0, false);
        declareFunction(me, "table_info_field_decoding_p", "TABLE-INFO-FIELD-DECODING-P", 1, 0, false);
        declareFunction(me, "table_info_foreign_key_map_p", "TABLE-INFO-FOREIGN-KEY-MAP-P", 1, 0, false);
        declareFunction(me, "table_info_field_mapping_p", "TABLE-INFO-FIELD-MAPPING-P", 1, 0, false);
        declareFunction(me, "table_info_logical_field_indexical_p", "TABLE-INFO-LOGICAL-FIELD-INDEXICAL-P", 1, 0, false);
        declareFunction(me, "table_info_logical_field_p", "TABLE-INFO-LOGICAL-FIELD-P", 1, 0, false);
        declareFunction(me, "table_info_physical_field_indexical_p", "TABLE-INFO-PHYSICAL-FIELD-INDEXICAL-P", 1, 0, false);
        declareFunction(me, "table_info_physical_field_p", "TABLE-INFO-PHYSICAL-FIELD-P", 1, 0, false);
        declareFunction(me, "table_info_sk_source_p", "TABLE-INFO-SK-SOURCE-P", 1, 0, false);
        declareFunction(me, "table_info_logical_schema_p", "TABLE-INFO-LOGICAL-SCHEMA-P", 1, 0, false);
        declareFunction(me, "table_info_physical_schema_p", "TABLE-INFO-PHYSICAL-SCHEMA-P", 1, 0, false);
        declareFunction(me, "clone_database", "CLONE-DATABASE", 1, 1, false);
        declareFunction(me, "kill_all_cloned_databases", "KILL-ALL-CLONED-DATABASES", 1, 0, false);
        declareFunction(me, "compute_and_clone_db_info", "COMPUTE-AND-CLONE-DB-INFO", 1, 0, false);
        declareFunction(me, "reify_cloned_db_info", "REIFY-CLONED-DB-INFO", 2, 0, false);
        declareFunction(me, "clone_db_info_constant_names", "CLONE-DB-INFO-CONSTANT-NAMES", 1, 0, false);
        declareFunction(me, "clone_constant_base_name", "CLONE-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "clone_db_info_db_name", "CLONE-DB-INFO-DB-NAME", 1, 0, false);
        declareFunction(me, "clone_db_name", "CLONE-DB-NAME", 1, 0, false);
        declareFunction(me, "uniquify_db_info_db_name", "UNIQUIFY-DB-INFO-DB-NAME", 2, 0, false);
        declareFunction(me, "db_info_existsP", "DB-INFO-EXISTS?", 1, 0, false);
        declareFunction(me, "db_info_access_path", "DB-INFO-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "sksi_populate_cloned_ks", "SKSI-POPULATE-CLONED-KS", 3, 0, false);
        declareFunction(me, "sksi_populate_cloned_ks_int", "SKSI-POPULATE-CLONED-KS-INT", 2, 0, false);
        declareFunction(me, "sksi_populate_sub_ks", "SKSI-POPULATE-SUB-KS", 3, 0, false);
        declareFunction(me, "sksi_saturate_rule_variablize_antecedent", "SKSI-SATURATE-RULE-VARIABLIZE-ANTECEDENT", 1, 0, false);
        declareFunction(me, "variablize_table_info_lfi", "VARIABLIZE-TABLE-INFO-LFI", 1, 0, false);
        declareFunction(me, "sksi_database_fusion_clones_or_fusionsP", "SKSI-DATABASE-FUSION-CLONES-OR-FUSIONS?", 2, 0, false);
        declareFunction(me, "sksi_database_fusion_clonesP", "SKSI-DATABASE-FUSION-CLONES?", 2, 0, false);
        declareFunction(me, "sksi_database_fusion_clones_intP", "SKSI-DATABASE-FUSION-CLONES-INT?", 2, 0, false);
        declareFunction(me, "sksi_database_fusion_fusionsP", "SKSI-DATABASE-FUSION-FUSIONS?", 2, 0, false);
        declareFunction(me, "sksi_database_fusion_fusions_intP", "SKSI-DATABASE-FUSION-FUSIONS-INT?", 2, 0, false);
        declareFunction(me, "compute_initial_db_info", "COMPUTE-INITIAL-DB-INFO", 1, 0, false);
        declareFunction(me, "compute_initial_table_infos_for_source", "COMPUTE-INITIAL-TABLE-INFOS-FOR-SOURCE", 1, 0, false);
        declareFunction(me, "compute_initial_table_info", "COMPUTE-INITIAL-TABLE-INFO", 3, 0, false);
        declareFunction(me, "new_table_info_from_sk_source", "NEW-TABLE-INFO-FROM-SK-SOURCE", 4, 0, false);
        declareFunction(me, "compute_constant_base_name", "COMPUTE-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "mapcar_physical_field_name", "MAPCAR-PHYSICAL-FIELD-NAME", 1, 0, false);
        declareFunction(me, "process_field_encodings_for_table_info", "PROCESS-FIELD-ENCODINGS-FOR-TABLE-INFO", 3, 0, false);
        declareFunction(me, "process_field_encoding_for_table_info", "PROCESS-FIELD-ENCODING-FOR-TABLE-INFO", 3, 0, false);
        declareFunction(me, "table_infoifiable_p", "TABLE-INFOIFIABLE-P", 1, 0, false);
        declareFunction(me, "table_infoify_object", "TABLE-INFOIFY-OBJECT", 1, 0, false);
        declareFunction(me, "table_infoify_sk_source", "TABLE-INFOIFY-SK-SOURCE", 1, 0, false);
        declareFunction(me, "table_infoify_logical_schema", "TABLE-INFOIFY-LOGICAL-SCHEMA", 1, 0, false);
        declareFunction(me, "table_infoify_physical_schema", "TABLE-INFOIFY-PHYSICAL-SCHEMA", 1, 0, false);
        declareFunction(me, "table_infoify_logical_field_indexical", "TABLE-INFOIFY-LOGICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction(me, "process_field_decodings_for_table_info", "PROCESS-FIELD-DECODINGS-FOR-TABLE-INFO", 3, 0, false);
        declareFunction(me, "process_field_decoding_for_table_info", "PROCESS-FIELD-DECODING-FOR-TABLE-INFO", 3, 0, false);
        declareFunction(me, "table_infoify_physical_field_indexical", "TABLE-INFOIFY-PHYSICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction(me, "process_foreign_key_maps_for_table_info", "PROCESS-FOREIGN-KEY-MAPS-FOR-TABLE-INFO", 3, 0, false);
        declareFunction(me, "process_foreign_key_map_for_table_info", "PROCESS-FOREIGN-KEY-MAP-FOR-TABLE-INFO", 3, 0, false);
        declareFunction(me, "fused_sk_source_name", "FUSED-SK-SOURCE-NAME", 1, 0, false);
        declareFunction(me, "fused_ls_name", "FUSED-LS-NAME", 1, 0, false);
        declareFunction(me, "extract_field_mappings_for_table_info", "EXTRACT-FIELD-MAPPINGS-FOR-TABLE-INFO", 2, 0, false);
        declareFunction(me, "table_infoify_logical_field", "TABLE-INFOIFY-LOGICAL-FIELD", 2, 0, false);
        declareFunction(me, "process_meaning_sentences_for_table_info", "PROCESS-MEANING-SENTENCES-FOR-TABLE-INFO", 2, 0, false);
        declareFunction(me, "reify_db_info", "REIFY-DB-INFO", 1, 0, false);
        declareFunction(me, "finish_reifying_db_info", "FINISH-REIFYING-DB-INFO", 2, 0, false);
        declareFunction(me, "start_reifying_table_info", "START-REIFYING-TABLE-INFO", 3, 0, false);
        declareFunction(me, "finish_reifying_table_info", "FINISH-REIFYING-TABLE-INFO", 6, 0, false);
        declareFunction(me, "reify_new_top_level_ks", "REIFY-NEW-TOP-LEVEL-KS", 1, 0, false);
        declareFunction(me, "start_reifying_new_top_level_ks", "START-REIFYING-NEW-TOP-LEVEL-KS", 1, 0, false);
        declareFunction(me, "finish_reifying_new_top_level_ks", "FINISH-REIFYING-NEW-TOP-LEVEL-KS", 2, 0, false);
        declareFunction(me, "reify_access_path", "REIFY-ACCESS-PATH", 3, 0, false);
        declareFunction(me, "reify_new_sk_source", "REIFY-NEW-SK-SOURCE", 3, 0, false);
        declareFunction(me, "start_reifying_new_logical_schema", "START-REIFYING-NEW-LOGICAL-SCHEMA", 2, 0, false);
        declareFunction(me, "finish_reifying_new_logical_schema", "FINISH-REIFYING-NEW-LOGICAL-SCHEMA", 8, 0, false);
        declareFunction(me, "kbifiable_p", "KBIFIABLE-P", 1, 0, false);
        declareFunction(me, "kbify_object", "KBIFY-OBJECT", 1, 0, false);
        declareFunction(me, "kbify_sk_source", "KBIFY-SK-SOURCE", 1, 0, false);
        declareFunction(me, "kbify_logical_schema", "KBIFY-LOGICAL-SCHEMA", 1, 0, false);
        declareFunction(me, "kbify_physical_schema", "KBIFY-PHYSICAL-SCHEMA", 1, 0, false);
        declareFunction(me, "kbify_meaning_sentence", "KBIFY-MEANING-SENTENCE", 2, 0, false);
        declareFunction(me, "kbify_logical_field_indexicals", "KBIFY-LOGICAL-FIELD-INDEXICALS", 2, 0, false);
        declareFunction(me, "kbify_logical_field_indexical", "KBIFY-LOGICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction(me, "kbify_logical_field", "KBIFY-LOGICAL-FIELD", 2, 0, false);
        declareFunction(me, "kbify_physical_field_indexicals", "KBIFY-PHYSICAL-FIELD-INDEXICALS", 2, 0, false);
        declareFunction(me, "kbify_physical_field_indexical", "KBIFY-PHYSICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction(me, "anonymize_table_info_object", "ANONYMIZE-TABLE-INFO-OBJECT", 1, 0, false);
        declareFunction(me, "anonymize_table_info_logical_field", "ANONYMIZE-TABLE-INFO-LOGICAL-FIELD", 1, 0, false);
        declareFunction(me, "anonymize_table_info_logical_field_indexical", "ANONYMIZE-TABLE-INFO-LOGICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction(me, "anonymize_table_info_physical_field_indexical", "ANONYMIZE-TABLE-INFO-PHYSICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction(me, "anonymize_table_info_sk_source", "ANONYMIZE-TABLE-INFO-SK-SOURCE", 1, 0, false);
        declareFunction(me, "anonymize_table_info_logical_schema", "ANONYMIZE-TABLE-INFO-LOGICAL-SCHEMA", 1, 0, false);
        declareFunction(me, "anonymize_table_info_physical_schema", "ANONYMIZE-TABLE-INFO-PHYSICAL-SCHEMA", 1, 0, false);
        declareFunction(me, "start_reifying_new_physical_schema", "START-REIFYING-NEW-PHYSICAL-SCHEMA", 2, 0, false);
        declareFunction(me, "finish_reifying_new_physical_schema", "FINISH-REIFYING-NEW-PHYSICAL-SCHEMA", 15, 0, false);
        declareFunction(me, "table_info_field_names_to_physical_fields", "TABLE-INFO-FIELD-NAMES-TO-PHYSICAL-FIELDS", 2, 0, false);
        declareFunction(me, "table_info_field_name_to_physical_field", "TABLE-INFO-FIELD-NAME-TO-PHYSICAL-FIELD", 2, 0, false);
        declareFunction(me, "table_info_field_name_to_physical_field_indexical", "TABLE-INFO-FIELD-NAME-TO-PHYSICAL-FIELD-INDEXICAL", 2, 0, false);
        declareFunction(me, "kbify_field_encoding", "KBIFY-FIELD-ENCODING", 2, 0, false);
        declareFunction(me, "kbify_field_decoding", "KBIFY-FIELD-DECODING", 2, 0, false);
        declareFunction(me, "compute_db_clone_forward_inference_allowed_rules", "COMPUTE-DB-CLONE-FORWARD-INFERENCE-ALLOWED-RULES", 1, 0, false);
        declareFunction(me, "all_cloned_bln_terms", "ALL-CLONED-BLN-TERMS", 0, 0, false);
        declareFunction(me, "kill_all_cloned_bln_terms", "KILL-ALL-CLONED-BLN-TERMS", 0, 0, false);
        declareFunction(me, "fuse_databases", "FUSE-DATABASES", 1, 1, false);
        declareFunction(me, "kill_all_fused_databases", "KILL-ALL-FUSED-DATABASES", 1, 0, false);
        declareFunction(me, "reify_fused_db_info", "REIFY-FUSED-DB-INFO", 2, 0, false);
        declareFunction(me, "sksi_populate_fused_ks", "SKSI-POPULATE-FUSED-KS", 3, 0, false);
        declareFunction(me, "sksi_populate_fused_ks_int", "SKSI-POPULATE-FUSED-KS-INT", 2, 0, false);
        declareFunction(me, "compute_and_fuse_db_info", "COMPUTE-AND-FUSE-DB-INFO", 1, 0, false);
        declareFunction(me, "compute_db_fusion_mt", "COMPUTE-DB-FUSION-MT", 1, 0, false);
        declareFunction(me, "trivially_fuse_db_infos", "TRIVIALLY-FUSE-DB-INFOS", 1, 0, false);
        declareFunction(me, "fuse_db_info_table_infos", "FUSE-DB-INFO-TABLE-INFOS", 2, 0, false);
        declareFunction(me, "merge_db_info_table_infos", "MERGE-DB-INFO-TABLE-INFOS", 2, 0, false);
        declareFunction(me, "fuse_db_info_constant_names", "FUSE-DB-INFO-CONSTANT-NAMES", 1, 0, false);
        declareFunction(me, "fuse_constant_base_name", "FUSE-CONSTANT-BASE-NAME", 1, 0, false);
        declareFunction(me, "fuse_db_info_db_names", "FUSE-DB-INFO-DB-NAMES", 1, 0, false);
        declareFunction(me, "fuse_db_info_quoted_isas", "FUSE-DB-INFO-QUOTED-ISAS", 2, 0, false);
        declareFunction(me, "fuse_db_info_input_mt", "FUSE-DB-INFO-INPUT-MT", 2, 0, false);
        declareFunction(me, "fuse_db_info_content_genl_mts", "FUSE-DB-INFO-CONTENT-GENL-MTS", 2, 0, false);
        declareFunction(me, "fuse_db_info", "FUSE-DB-INFO", 1, 0, false);
        declareFunction(me, "fuse_db_info_do_one_step", "FUSE-DB-INFO-DO-ONE-STEP", 1, 0, false);
        declareFunction(me, "merge_two_db_info_tables", "MERGE-TWO-DB-INFO-TABLES", 1, 0, false);
        declareFunction(me, "merge_two_db_info_tables_int", "MERGE-TWO-DB-INFO-TABLES-INT", 3, 0, false);
        declareFunction(me, "merge_two_db_info_meaning_sentences", "MERGE-TWO-DB-INFO-MEANING-SENTENCES", 4, 0, false);
        declareFunction(me, "compute_lfi_merge_pairs", "COMPUTE-LFI-MERGE-PAIRS", 3, 0, false);
        declareFunction(me, "compute_id_merge_pairs", "COMPUTE-ID-MERGE-PAIRS", 5, 0, false);
        declareFunction(me, "all_fused_bln_terms", "ALL-FUSED-BLN-TERMS", 0, 0, false);
        declareFunction(me, "kill_all_fused_bln_terms", "KILL-ALL-FUSED-BLN-TERMS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_database_fusion_file() {
        defparameter("*WITHIN-SKSI-DATABASE-FUSION?*", NIL);
        defvar("*SKSI-DATABASE-FUSION-DEBUG?*", NIL);
        deflexical("*SKSI-DATABASE-FUSION-TABLE-INFO-ISG*", SubLTrampolineFile.maybeDefault($sksi_database_fusion_table_info_isg$, $sksi_database_fusion_table_info_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-DB-INFO*", DB_INFO);
        defconstant("*DTP-TABLE-INFO*", TABLE_INFO);
        deflexical("*LAST-DB-INFO*", SubLTrampolineFile.maybeDefault($last_db_info$, $last_db_info$, NIL));
        defparameter("*CURRENT-TABLE-INFO-VARIABLE-COUNT*", NIL);
        defparameter("*TABLE-INFO-LFI-VARIABLE-DICT*", NIL);
        defparameter("*TABLE-INFOIFY-EXPRESSION-TABLE-KB-INDEX*", NIL);
        defparameter("*KBIFY-EXPRESSION-KB-TABLE-INDEX*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_database_fusion_file() {
        declare_defglobal($sksi_database_fusion_table_info_isg$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_db_info$.getGlobalValue(), symbol_function(DB_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(DBNFO_CONSTANT_BASE_NAME, _CSETF_DBNFO_CONSTANT_BASE_NAME);
        def_csetf(DBNFO_DB_NAME, _CSETF_DBNFO_DB_NAME);
        def_csetf(DBNFO_TABLE_INFOS, _CSETF_DBNFO_TABLE_INFOS);
        def_csetf(DBNFO_TABLE_INFO_INDEX, _CSETF_DBNFO_TABLE_INFO_INDEX);
        def_csetf(DBNFO_SERVER, _CSETF_DBNFO_SERVER);
        def_csetf(DBNFO_PORT, _CSETF_DBNFO_PORT);
        def_csetf(DBNFO_PROXY_HOST, _CSETF_DBNFO_PROXY_HOST);
        def_csetf(DBNFO_PROXY_PORT, _CSETF_DBNFO_PROXY_PORT);
        def_csetf(DBNFO_USER, _CSETF_DBNFO_USER);
        def_csetf(DBNFO_PASS, _CSETF_DBNFO_PASS);
        def_csetf(DBNFO_SUBPROTOCOL, _CSETF_DBNFO_SUBPROTOCOL);
        def_csetf(DBNFO_SQL_FLAVOR, _CSETF_DBNFO_SQL_FLAVOR);
        def_csetf(DBNFO_QUOTED_ISAS, _CSETF_DBNFO_QUOTED_ISAS);
        def_csetf(DBNFO_INPUT_MT, _CSETF_DBNFO_INPUT_MT);
        def_csetf(DBNFO_CONTENT_GENL_MTS, _CSETF_DBNFO_CONTENT_GENL_MTS);
        identity(DB_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_db_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DB_INFO_METHOD));
        note_funcall_helper_function(PRINT_DB_INFO);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_table_info$.getGlobalValue(), symbol_function(TABLE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list90);
        def_csetf(TBLNFO_ID, _CSETF_TBLNFO_ID);
        def_csetf(TBLNFO_CONSTANT_BASE_NAME, _CSETF_TBLNFO_CONSTANT_BASE_NAME);
        def_csetf(TBLNFO_TABLE_NAME, _CSETF_TBLNFO_TABLE_NAME);
        def_csetf(TBLNFO_ISAS, _CSETF_TBLNFO_ISAS);
        def_csetf(TBLNFO_LF_TYPES, _CSETF_TBLNFO_LF_TYPES);
        def_csetf(TBLNFO_FIELD_MAPPINGS, _CSETF_TBLNFO_FIELD_MAPPINGS);
        def_csetf(TBLNFO_MEANING_SENTENCES, _CSETF_TBLNFO_MEANING_SENTENCES);
        def_csetf($sym105$TBLNFO_ENUMERABLE_, $sym106$_CSETF_TBLNFO_ENUMERABLE_);
        def_csetf(TBLNFO_FIELD_NAMES, _CSETF_TBLNFO_FIELD_NAMES);
        def_csetf(TBLNFO_FIELD_TYPES, _CSETF_TBLNFO_FIELD_TYPES);
        def_csetf(TBLNFO_PRIMARY_KEY, _CSETF_TBLNFO_PRIMARY_KEY);
        def_csetf(TBLNFO_INDEXES, _CSETF_TBLNFO_INDEXES);
        def_csetf(TBLNFO_FIELD_ENCODINGS, _CSETF_TBLNFO_FIELD_ENCODINGS);
        def_csetf(TBLNFO_FIELD_DECODINGS, _CSETF_TBLNFO_FIELD_DECODINGS);
        def_csetf(TBLNFO_FOREIGN_KEY_MAPS, _CSETF_TBLNFO_FOREIGN_KEY_MAPS);
        def_csetf(TBLNFO_NON_NULL_FIELD_LIST, _CSETF_TBLNFO_NON_NULL_FIELD_LIST);
        def_csetf(TBLNFO_UNIQUE_FIELD_TUPLES, _CSETF_TBLNFO_UNIQUE_FIELD_TUPLES);
        identity(TABLE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_table_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TABLE_INFO_METHOD));
        note_funcall_helper_function(PRINT_TABLE_INFO);
        declare_defglobal($last_db_info$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_database_fusion_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_database_fusion_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_database_fusion_file();
    }

    

    public static final class $db_info_native extends SubLStructNative {
        public SubLObject $constant_base_name;

        public SubLObject $db_name;

        public SubLObject $table_infos;

        public SubLObject $table_info_index;

        public SubLObject $server;

        public SubLObject $port;

        public SubLObject $proxy_host;

        public SubLObject $proxy_port;

        public SubLObject $user;

        public SubLObject $pass;

        public SubLObject $subprotocol;

        public SubLObject $sql_flavor;

        public SubLObject $quoted_isas;

        public SubLObject $input_mt;

        public SubLObject $content_genl_mts;

        private static final SubLStructDeclNative structDecl;

        private $db_info_native() {
            this.$constant_base_name = Lisp.NIL;
            this.$db_name = Lisp.NIL;
            this.$table_infos = Lisp.NIL;
            this.$table_info_index = Lisp.NIL;
            this.$server = Lisp.NIL;
            this.$port = Lisp.NIL;
            this.$proxy_host = Lisp.NIL;
            this.$proxy_port = Lisp.NIL;
            this.$user = Lisp.NIL;
            this.$pass = Lisp.NIL;
            this.$subprotocol = Lisp.NIL;
            this.$sql_flavor = Lisp.NIL;
            this.$quoted_isas = Lisp.NIL;
            this.$input_mt = Lisp.NIL;
            this.$content_genl_mts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$constant_base_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$db_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$table_infos;
        }

        @Override
        public SubLObject getField5() {
            return this.$table_info_index;
        }

        @Override
        public SubLObject getField6() {
            return this.$server;
        }

        @Override
        public SubLObject getField7() {
            return this.$port;
        }

        @Override
        public SubLObject getField8() {
            return this.$proxy_host;
        }

        @Override
        public SubLObject getField9() {
            return this.$proxy_port;
        }

        @Override
        public SubLObject getField10() {
            return this.$user;
        }

        @Override
        public SubLObject getField11() {
            return this.$pass;
        }

        @Override
        public SubLObject getField12() {
            return this.$subprotocol;
        }

        @Override
        public SubLObject getField13() {
            return this.$sql_flavor;
        }

        @Override
        public SubLObject getField14() {
            return this.$quoted_isas;
        }

        @Override
        public SubLObject getField15() {
            return this.$input_mt;
        }

        @Override
        public SubLObject getField16() {
            return this.$content_genl_mts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$constant_base_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$db_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$table_infos = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$table_info_index = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$server = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$port = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$proxy_host = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$proxy_port = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$user = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$pass = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$subprotocol = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$sql_flavor = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$quoted_isas = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$input_mt = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$content_genl_mts = value;
        }

        static {
            structDecl = makeStructDeclNative($db_info_native.class, DB_INFO, DB_INFO_P, $list3, $list4, new String[]{ "$constant_base_name", "$db_name", "$table_infos", "$table_info_index", "$server", "$port", "$proxy_host", "$proxy_port", "$user", "$pass", "$subprotocol", "$sql_flavor", "$quoted_isas", "$input_mt", "$content_genl_mts" }, $list5, $list6, PRINT_DB_INFO);
        }
    }

    public static final class $db_info_p$UnaryFunction extends UnaryFunction {
        public $db_info_p$UnaryFunction() {
            super(extractFunctionNamed("DB-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return db_info_p(arg1);
        }
    }

    public static final class $table_info_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $constant_base_name;

        public SubLObject $table_name;

        public SubLObject $isas;

        public SubLObject $lf_types;

        public SubLObject $field_mappings;

        public SubLObject $meaning_sentences;

        public SubLObject $enumerableP;

        public SubLObject $field_names;

        public SubLObject $field_types;

        public SubLObject $primary_key;

        public SubLObject $indexes;

        public SubLObject $field_encodings;

        public SubLObject $field_decodings;

        public SubLObject $foreign_key_maps;

        public SubLObject $non_null_field_list;

        public SubLObject $unique_field_tuples;

        private static final SubLStructDeclNative structDecl;

        private $table_info_native() {
            this.$id = Lisp.NIL;
            this.$constant_base_name = Lisp.NIL;
            this.$table_name = Lisp.NIL;
            this.$isas = Lisp.NIL;
            this.$lf_types = Lisp.NIL;
            this.$field_mappings = Lisp.NIL;
            this.$meaning_sentences = Lisp.NIL;
            this.$enumerableP = Lisp.NIL;
            this.$field_names = Lisp.NIL;
            this.$field_types = Lisp.NIL;
            this.$primary_key = Lisp.NIL;
            this.$indexes = Lisp.NIL;
            this.$field_encodings = Lisp.NIL;
            this.$field_decodings = Lisp.NIL;
            this.$foreign_key_maps = Lisp.NIL;
            this.$non_null_field_list = Lisp.NIL;
            this.$unique_field_tuples = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$constant_base_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$table_name;
        }

        @Override
        public SubLObject getField5() {
            return this.$isas;
        }

        @Override
        public SubLObject getField6() {
            return this.$lf_types;
        }

        @Override
        public SubLObject getField7() {
            return this.$field_mappings;
        }

        @Override
        public SubLObject getField8() {
            return this.$meaning_sentences;
        }

        @Override
        public SubLObject getField9() {
            return this.$enumerableP;
        }

        @Override
        public SubLObject getField10() {
            return this.$field_names;
        }

        @Override
        public SubLObject getField11() {
            return this.$field_types;
        }

        @Override
        public SubLObject getField12() {
            return this.$primary_key;
        }

        @Override
        public SubLObject getField13() {
            return this.$indexes;
        }

        @Override
        public SubLObject getField14() {
            return this.$field_encodings;
        }

        @Override
        public SubLObject getField15() {
            return this.$field_decodings;
        }

        @Override
        public SubLObject getField16() {
            return this.$foreign_key_maps;
        }

        @Override
        public SubLObject getField17() {
            return this.$non_null_field_list;
        }

        @Override
        public SubLObject getField18() {
            return this.$unique_field_tuples;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$constant_base_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$table_name = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$isas = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$lf_types = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$field_mappings = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$meaning_sentences = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$enumerableP = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$field_names = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$field_types = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$primary_key = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$indexes = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$field_encodings = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$field_decodings = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$foreign_key_maps = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$non_null_field_list = value;
        }

        @Override
        public SubLObject setField18(final SubLObject value) {
            return this.$unique_field_tuples = value;
        }

        static {
            structDecl = makeStructDeclNative($table_info_native.class, TABLE_INFO, TABLE_INFO_P, $list84, $list85, new String[]{ "$id", "$constant_base_name", "$table_name", "$isas", "$lf_types", "$field_mappings", "$meaning_sentences", "$enumerableP", "$field_names", "$field_types", "$primary_key", "$indexes", "$field_encodings", "$field_decodings", "$foreign_key_maps", "$non_null_field_list", "$unique_field_tuples" }, $list86, $list87, PRINT_TABLE_INFO);
        }
    }

    public static final class $table_info_p$UnaryFunction extends UnaryFunction {
        public $table_info_p$UnaryFunction() {
            super(extractFunctionNamed("TABLE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return table_info_p(arg1);
        }
    }
}

/**
 * Total time: 1454 ms synthetic
 */
