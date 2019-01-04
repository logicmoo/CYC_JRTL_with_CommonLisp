package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_translation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.system_translation";
    public static final String myFingerPrint = "627e76bbdc3d1ebe41730f4201a1ca178d3502e8346b6dd0f14d75a0fd967bee";
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 872L)
    private static SubLSymbol $translator_output_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1125L)
    private static SubLSymbol $translator_backends$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1329L)
    private static SubLSymbol $current_system_translation$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLSymbol $dtp_system_translation$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 21494L)
    private static SubLSymbol $translation_trace_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 23687L)
    public static SubLSymbol $generate_module_fingerprintsP$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 23964L)
    public static SubLSymbol $external_checksum_algorithm$;
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 36229L)
    private static SubLSymbol $default_secure_id_database_filename$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$NONE;
    private static final SubLSymbol $sym2$SYSTEM_TRANSLATION;
    private static final SubLSymbol $sym3$SYSTEM_TRANSLATION_P;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$PRINT_SYSTEM_TRANSLATION;
    private static final SubLSymbol $sym9$SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$SYS_TR_SYSTEM;
    private static final SubLSymbol $sym12$_CSETF_SYS_TR_SYSTEM;
    private static final SubLSymbol $sym13$SYS_TR_BACKEND;
    private static final SubLSymbol $sym14$_CSETF_SYS_TR_BACKEND;
    private static final SubLSymbol $sym15$SYS_TR_FEATURES;
    private static final SubLSymbol $sym16$_CSETF_SYS_TR_FEATURES;
    private static final SubLSymbol $sym17$SYS_TR_INPUT_DIRECTORY;
    private static final SubLSymbol $sym18$_CSETF_SYS_TR_INPUT_DIRECTORY;
    private static final SubLSymbol $sym19$SYS_TR_OUTPUT_DIRECTORY;
    private static final SubLSymbol $sym20$_CSETF_SYS_TR_OUTPUT_DIRECTORY;
    private static final SubLSymbol $sym21$SYS_TR_MANIFEST_FILE;
    private static final SubLSymbol $sym22$_CSETF_SYS_TR_MANIFEST_FILE;
    private static final SubLSymbol $sym23$SYS_TR_MODULES;
    private static final SubLSymbol $sym24$_CSETF_SYS_TR_MODULES;
    private static final SubLSymbol $sym25$SYS_TR_MODULE_FILENAME_TABLE;
    private static final SubLSymbol $sym26$_CSETF_SYS_TR_MODULE_FILENAME_TABLE;
    private static final SubLSymbol $sym27$SYS_TR_MODULE_FEATURES_TABLE;
    private static final SubLSymbol $sym28$_CSETF_SYS_TR_MODULE_FEATURES_TABLE;
    private static final SubLSymbol $sym29$SYS_TR_MODULE_INITIALIZATION_TABLE;
    private static final SubLSymbol $sym30$_CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE;
    private static final SubLSymbol $sym31$SYS_TR_XREF_DATABASE;
    private static final SubLSymbol $sym32$_CSETF_SYS_TR_XREF_DATABASE;
    private static final SubLSymbol $sym33$SYS_TR_SECURE_ID_DATABASE;
    private static final SubLSymbol $sym34$_CSETF_SYS_TR_SECURE_ID_DATABASE;
    private static final SubLSymbol $sym35$SYS_TR_LAST_TRANSLATION_TIME;
    private static final SubLSymbol $sym36$_CSETF_SYS_TR_LAST_TRANSLATION_TIME;
    private static final SubLSymbol $kw37$SYSTEM;
    private static final SubLSymbol $kw38$BACKEND;
    private static final SubLSymbol $kw39$FEATURES;
    private static final SubLSymbol $kw40$INPUT_DIRECTORY;
    private static final SubLSymbol $kw41$OUTPUT_DIRECTORY;
    private static final SubLSymbol $kw42$MANIFEST_FILE;
    private static final SubLSymbol $kw43$MODULES;
    private static final SubLSymbol $kw44$MODULE_FILENAME_TABLE;
    private static final SubLSymbol $kw45$MODULE_FEATURES_TABLE;
    private static final SubLSymbol $kw46$MODULE_INITIALIZATION_TABLE;
    private static final SubLSymbol $kw47$XREF_DATABASE;
    private static final SubLSymbol $kw48$SECURE_ID_DATABASE;
    private static final SubLSymbol $kw49$LAST_TRANSLATION_TIME;
    private static final SubLString $str50$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw51$BEGIN;
    private static final SubLSymbol $sym52$MAKE_SYSTEM_TRANSLATION;
    private static final SubLSymbol $kw53$SLOT;
    private static final SubLSymbol $kw54$END;
    private static final SubLSymbol $sym55$VISIT_DEFSTRUCT_OBJECT_SYSTEM_TRANSLATION_METHOD;
    private static final SubLString $str56$_A_A__S__S_features___S_modules;
    private static final SubLString $str57$secure_;
    private static final SubLString $str58$;
    private static final SubLSymbol $sym59$STRINGP;
    private static final SubLSymbol $sym60$TRANSLATOR_BACKEND_P;
    private static final SubLSymbol $sym61$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym62$KEYWORDP;
    private static final SubLSymbol $sym63$TRANSLATOR_SECURITY_LEVEL_P;
    private static final SubLSymbol $sym64$DIRECTORY_P;
    private static final SubLString $str65$Security_level__A_does_not_match_;
    private static final SubLInteger $int66$1000;
    private static final SubLSymbol $kw67$FREE;
    private static final SubLSymbol $sym68$UNIVERSAL_TIME_P;
    private static final SubLSymbol $kw69$CYC_TRANSLATE;
    private static final SubLInteger $int70$1970;
    private static final SubLSymbol $sym71$SYMBOLP;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw75$SECURITY_LEVEL;
    private static final SubLSymbol $kw76$SYSTEM_MANIFEST;
    private static final SubLSymbol $kw77$INITIAL_SID_DB;
    private static final SubLList $list78;
    private static final SubLString $str79$lisp;
    private static final SubLSymbol $kw80$SL2C;
    private static final SubLList $list81;
    private static final SubLSymbol $kw82$SL2JAVA;
    private static final SubLString $str83$c;
    private static final SubLString $str84$java;
    private static final SubLString $str85$Time_to_specify_the_output_file_e;
    private static final SubLString $str86$Time_to_specify_the_output_module;
    private static final SubLString $str87$module_4__0D;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$DONE;
    private static final SubLSymbol $sym90$CLET;
    private static final SubLSymbol $sym91$WHILE;
    private static final SubLSymbol $sym92$CNOT;
    private static final SubLSymbol $sym93$WITH_SIMPLE_RESTART;
    private static final SubLSymbol $sym94$CSETQ;
    private static final SubLList $list95;
    private static final SubLString $str96$__Translating__A_to_backend__S_wi;
    private static final SubLString $str97$__Pass_1___Populating_XREF_databa;
    private static final SubLString $str98$Scanning_modules;
    private static final SubLString $str99$cdolist;
    private static final SubLString $str100$__Pass_2___Translating;
    private static final SubLString $str101$_usr_bin_sha256sum;
    private static final SubLString $str102$_;
    private static final SubLSymbol $sym103$ALPHANUMERICP;
    private static final SubLString $str104$_A_failed_to_produce_non_trivial_;
    private static final SubLSymbol $sym105$SKIP;
    private static final SubLString $str106$Skip__S;
    private static final SubLSymbol $sym107$RETRANSLATE;
    private static final SubLString $str108$Retranslate__S;
    private static final SubLString $str109$___Starting__A_;
    private static final SubLString $str110$_dev_null;
    private static final SubLString $str111$backend__S_is_not_yet_supported;
    private static final SubLString $str112$___Finished__A_;
    private static final SubLString $str113$The_manifest_file__S_is_not_avail;
    private static final SubLSymbol $kw114$INPUT;
    private static final SubLString $str115$Unable_to_open__S;
    private static final SubLSymbol $sym116$DOUBLE_FLOAT;
    private static final SubLSymbol $kw117$COMMON_LISP;
    private static final SubLSymbol $kw118$EOF;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$CDOLIST;
    private static final SubLSymbol $kw121$DIRECTORY;
    private static final SubLString $str122$system_manifest_lisp;
    private static final SubLSymbol $kw123$OUTPUT;
    private static final SubLSymbol $sym124$STREAMP;
    private static final SubLString $str125$________Mode__LISP__Package__SUBL;
    private static final SubLList $list126;
    private static final SubLString $str127$_;
    private static final SubLString $str128$_system__S;
    private static final SubLString $str129$____;
    private static final SubLString $str130$_____directory__S;
    private static final SubLString $str131$_____package____S;
    private static final SubLString $str132$_____required_systems_;
    private static final SubLString $str133$_;
    private static final SubLString $str134$_S;
    private static final SubLString $str135$_;
    private static final SubLString $str136$____;
    private static final SubLList $list137;
    private static final SubLList $list138;
    private static final SubLString $str139$_____S;
    private static final SubLString $str140$__directory__S;
    private static final SubLString $str141$__features__S;
    private static final SubLString $str142$___;
    private static final SubLString $str143$TRANSLATOR_SYSTEM_DIRECTORY_is_un;
    private static final SubLString $str144$TRANSLATOR_SYSTEM_PACKAGE_is_unim;
    private static final SubLString $str145$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM;
    private static final SubLString $str146$TRANSLATOR_SYSTEM_MODULES_is_unim;
    private static final SubLString $str147$TRANSLATOR_SYSTEM_MODULE_DIRECTOR;
    private static final SubLString $str148$TRANSLATOR_SYSTEM_MODULE_FEATURES;
    private static final SubLString $str149$SUBLISP;
    private static final SubLString $str150$translation_secure_id_database_fi;
    private static final SubLSymbol $sym151$CAR;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str154$Unsupported_backend____S;
    private static final SubLSymbol $sym155$TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING;
    private static final SubLSymbol $kw156$TEST;
    private static final SubLSymbol $kw157$OWNER;
    private static final SubLSymbol $kw158$CLASSES;
    private static final SubLSymbol $kw159$KB;
    private static final SubLSymbol $kw160$TINY;
    private static final SubLSymbol $kw161$WORKING_;
    private static final SubLList $list162;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1037L)
    public static SubLObject translator_output_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_translation.$translator_output_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1232L)
    public static SubLObject translator_backend_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, system_translation.$translator_backends$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1381L)
    public static SubLObject current_system_translation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_translation.$current_system_translation$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1468L)
    public static SubLObject current_system_translation_secureP() {
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran) {
            return sys_tran_secureP(sys_tran);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 1638L)
    public static SubLObject current_system_translation_security_level() {
        final SubLObject sys_tran = current_system_translation();
        return (SubLObject)((system_translation.NIL != sys_tran) ? sys_tran_security_level(sys_tran) : system_translation.$kw1$NONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject system_translation_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_system_translation(v_object, stream, (SubLObject)system_translation.ZERO_INTEGER);
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject system_translation_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $system_translation_native.class) ? system_translation.T : system_translation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_system(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_backend(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_features(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_input_directory(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_output_directory(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_manifest_file(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_modules(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_module_filename_table(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_module_features_table(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_module_initialization_table(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_xref_database(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_secure_id_database(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject sys_tr_last_translation_time(final SubLObject v_object) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_system(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_backend(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_features(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_input_directory(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_output_directory(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_manifest_file(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_modules(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_module_filename_table(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_module_features_table(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_module_initialization_table(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_xref_database(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_secure_id_database(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject _csetf_sys_tr_last_translation_time(final SubLObject v_object, final SubLObject value) {
        assert system_translation.NIL != system_translation_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject make_system_translation(SubLObject arglist) {
        if (arglist == system_translation.UNPROVIDED) {
            arglist = (SubLObject)system_translation.NIL;
        }
        final SubLObject v_new = (SubLObject)new $system_translation_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)system_translation.NIL, next = arglist; system_translation.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)system_translation.$kw37$SYSTEM)) {
                _csetf_sys_tr_system(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw38$BACKEND)) {
                _csetf_sys_tr_backend(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw39$FEATURES)) {
                _csetf_sys_tr_features(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw40$INPUT_DIRECTORY)) {
                _csetf_sys_tr_input_directory(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw41$OUTPUT_DIRECTORY)) {
                _csetf_sys_tr_output_directory(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw42$MANIFEST_FILE)) {
                _csetf_sys_tr_manifest_file(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw43$MODULES)) {
                _csetf_sys_tr_modules(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw44$MODULE_FILENAME_TABLE)) {
                _csetf_sys_tr_module_filename_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw45$MODULE_FEATURES_TABLE)) {
                _csetf_sys_tr_module_features_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw46$MODULE_INITIALIZATION_TABLE)) {
                _csetf_sys_tr_module_initialization_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw47$XREF_DATABASE)) {
                _csetf_sys_tr_xref_database(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw48$SECURE_ID_DATABASE)) {
                _csetf_sys_tr_secure_id_database(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw49$LAST_TRANSLATION_TIME)) {
                _csetf_sys_tr_last_translation_time(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)system_translation.$str50$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject visit_defstruct_system_translation(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw51$BEGIN, (SubLObject)system_translation.$sym52$MAKE_SYSTEM_TRANSLATION, (SubLObject)system_translation.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw37$SYSTEM, sys_tr_system(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw38$BACKEND, sys_tr_backend(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw39$FEATURES, sys_tr_features(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw40$INPUT_DIRECTORY, sys_tr_input_directory(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw41$OUTPUT_DIRECTORY, sys_tr_output_directory(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw42$MANIFEST_FILE, sys_tr_manifest_file(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw43$MODULES, sys_tr_modules(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw44$MODULE_FILENAME_TABLE, sys_tr_module_filename_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw45$MODULE_FEATURES_TABLE, sys_tr_module_features_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw46$MODULE_INITIALIZATION_TABLE, sys_tr_module_initialization_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw47$XREF_DATABASE, sys_tr_xref_database(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw48$SECURE_ID_DATABASE, sys_tr_secure_id_database(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw53$SLOT, (SubLObject)system_translation.$kw49$LAST_TRANSLATION_TIME, sys_tr_last_translation_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)system_translation.$kw54$END, (SubLObject)system_translation.$sym52$MAKE_SYSTEM_TRANSLATION, (SubLObject)system_translation.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 2326L)
    public static SubLObject visit_defstruct_object_system_translation_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_system_translation(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 3324L)
    public static SubLObject print_system_translation(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (system_translation.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)system_translation.T, (SubLObject)system_translation.T);
            PrintLow.format(stream, (SubLObject)system_translation.$str56$_A_A__S__S_features___S_modules, new SubLObject[] { (system_translation.NIL != sys_tran_secureP(v_object)) ? system_translation.$str57$secure_ : system_translation.$str58$, sys_tr_system(v_object), sys_tr_backend(v_object), Sequences.length(sys_tr_features(v_object)), Sequences.length(sys_tr_modules(v_object)) });
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)system_translation.T, (SubLObject)system_translation.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 3743L)
    public static SubLObject new_system_translation(final SubLObject system, final SubLObject backend, final SubLObject features, final SubLObject security_level, final SubLObject input_directory, final SubLObject output_directory, final SubLObject manifest_file, final SubLObject initial_sid_db) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_translation.NIL != Types.stringp(system) : system;
        assert system_translation.NIL != translator_backend_p(backend) : backend;
        assert system_translation.NIL != list_utilities.non_dotted_list_p(features) : features;
        SubLObject cdolist_list_var = features;
        SubLObject elem = (SubLObject)system_translation.NIL;
        elem = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            assert system_translation.NIL != Types.keywordp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert system_translation.NIL != secure_translation.translator_security_level_p(security_level) : security_level;
        assert system_translation.NIL != Filesys.directory_p(input_directory) : input_directory;
        assert system_translation.NIL != Filesys.directory_p(output_directory) : output_directory;
        if (system_translation.NIL != manifest_file && !system_translation.assertionsDisabledSynth && system_translation.NIL == Types.stringp(manifest_file)) {
            throw new AssertionError(manifest_file);
        }
        if (system_translation.NIL != secure_translation.secure_id_database_p(initial_sid_db) && system_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !security_level.eql(secure_translation.secure_id_database_security_level(initial_sid_db))) {
            Errors.error((SubLObject)system_translation.$str65$Security_level__A_does_not_match_, security_level, secure_translation.secure_id_database_security_level(initial_sid_db), initial_sid_db);
        }
        final SubLObject sys_tran = make_system_translation((SubLObject)system_translation.UNPROVIDED);
        _csetf_sys_tr_system(sys_tran, system);
        _csetf_sys_tr_backend(sys_tran, backend);
        _csetf_sys_tr_features(sys_tran, features);
        _csetf_sys_tr_input_directory(sys_tran, input_directory);
        _csetf_sys_tr_output_directory(sys_tran, output_directory);
        _csetf_sys_tr_manifest_file(sys_tran, manifest_file);
        _csetf_sys_tr_module_filename_table(sys_tran, Hashtables.make_hash_table((SubLObject)system_translation.$int66$1000, Symbols.symbol_function((SubLObject)system_translation.EQUAL), (SubLObject)system_translation.UNPROVIDED));
        _csetf_sys_tr_module_features_table(sys_tran, Hashtables.make_hash_table((SubLObject)system_translation.$int66$1000, Symbols.symbol_function((SubLObject)system_translation.EQUAL), (SubLObject)system_translation.UNPROVIDED));
        _csetf_sys_tr_module_initialization_table(sys_tran, Hashtables.make_hash_table((SubLObject)system_translation.$int66$1000, Symbols.symbol_function((SubLObject)system_translation.EQUAL), (SubLObject)system_translation.UNPROVIDED));
        final SubLObject sid_db = (system_translation.NIL != secure_translation.secure_id_database_p(initial_sid_db)) ? initial_sid_db : secure_translation.new_secure_id_database(security_level);
        _csetf_sys_tr_secure_id_database(sys_tran, sid_db);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 5391L)
    public static SubLObject destroy_system_translation(final SubLObject sys_tran) {
        _csetf_sys_tr_modules(sys_tran, (SubLObject)system_translation.NIL);
        Hashtables.clrhash(sys_tr_module_filename_table(sys_tran));
        _csetf_sys_tr_module_filename_table(sys_tran, (SubLObject)system_translation.$kw67$FREE);
        Hashtables.clrhash(sys_tr_module_features_table(sys_tran));
        _csetf_sys_tr_module_features_table(sys_tran, (SubLObject)system_translation.$kw67$FREE);
        Hashtables.clrhash(sys_tr_module_initialization_table(sys_tran));
        _csetf_sys_tr_module_initialization_table(sys_tran, (SubLObject)system_translation.$kw67$FREE);
        _csetf_sys_tr_xref_database(sys_tran, (SubLObject)system_translation.$kw67$FREE);
        secure_translation.destroy_secure_id_database(sys_tr_secure_id_database(sys_tran));
        _csetf_sys_tr_secure_id_database(sys_tran, (SubLObject)system_translation.$kw67$FREE);
        _csetf_sys_tr_last_translation_time(sys_tran, (SubLObject)system_translation.$kw67$FREE);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 6574L)
    public static SubLObject sys_tran_system(final SubLObject sys_tran) {
        return sys_tr_system(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 6666L)
    public static SubLObject sys_tran_backend(final SubLObject sys_tran) {
        return sys_tr_backend(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 6748L)
    public static SubLObject sys_tran_features(final SubLObject sys_tran) {
        return sys_tr_features(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 6832L)
    public static SubLObject sys_tran_input_directory(final SubLObject sys_tran) {
        return sys_tr_input_directory(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 6930L)
    public static SubLObject sys_tran_output_directory(final SubLObject sys_tran) {
        return sys_tr_output_directory(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7030L)
    public static SubLObject sys_tran_manifest_file(final SubLObject sys_tran) {
        return sys_tr_manifest_file(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7122L)
    public static SubLObject sys_tran_xref_database(final SubLObject sys_tran) {
        return sys_tr_xref_database(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7216L)
    public static SubLObject sys_tran_secure_id_database(final SubLObject sys_tran) {
        return sys_tr_secure_id_database(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7320L)
    public static SubLObject sys_tran_modules(final SubLObject sys_tran) {
        return sys_tr_modules(sys_tran);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7403L)
    public static SubLObject sys_tran_set_modules(final SubLObject sys_tran, final SubLObject v_modules) {
        assert system_translation.NIL != list_utilities.non_dotted_list_p(v_modules) : v_modules;
        SubLObject cdolist_list_var = v_modules;
        SubLObject elem = (SubLObject)system_translation.NIL;
        elem = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            assert system_translation.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_sys_tr_modules(sys_tran, v_modules);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7570L)
    public static SubLObject sys_tran_set_last_translation_time(final SubLObject sys_tran, SubLObject universal_time) {
        if (universal_time == system_translation.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        assert system_translation.NIL != numeric_date_utilities.universal_time_p(universal_time) : universal_time;
        _csetf_sys_tr_last_translation_time(sys_tran, universal_time);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7811L)
    public static SubLObject sys_tran_security_level(final SubLObject sys_tran) {
        return secure_translation.secure_id_database_security_level(sys_tr_secure_id_database(sys_tran));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 7961L)
    public static SubLObject sys_tran_secureP(final SubLObject sys_tran) {
        return (SubLObject)SubLObjectFactory.makeBoolean(system_translation.$kw1$NONE != sys_tran_security_level(sys_tran));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 8070L)
    public static SubLObject sys_tran_includes_moduleP(final SubLObject sys_tran, final SubLObject module) {
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(module, sys_tr_module_filename_table(sys_tran), (SubLObject)system_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 8229L)
    public static SubLObject sys_tran_module_input_filename(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = Hashtables.gethash_without_values(module, sys_tr_module_filename_table(sys_tran), (SubLObject)system_translation.NIL);
        return data.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 8415L)
    public static SubLObject sys_tran_module_output_filename(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = Hashtables.gethash_without_values(module, sys_tr_module_filename_table(sys_tran), (SubLObject)system_translation.NIL);
        return conses_high.second(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 8603L)
    public static SubLObject sys_tran_relative_input_filename(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject input_directory = sys_tran_input_directory(sys_tran);
        final SubLObject input_filename = sys_tran_module_input_filename(sys_tran, module);
        final SubLObject prefix = Sequences.search(input_directory, input_filename, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
        if (system_translation.ZERO_INTEGER.numE(prefix)) {
            final SubLObject start = Sequences.length(input_directory);
            final SubLObject end = Sequences.length(input_filename);
            final SubLObject relative_filename = string_utilities.substring(input_filename, start, end);
            return relative_filename;
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 9073L)
    public static SubLObject sys_tran_module_features(final SubLObject sys_tran, final SubLObject module) {
        return Hashtables.gethash_without_values(module, sys_tr_module_features_table(sys_tran), (SubLObject)system_translation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 9221L)
    public static SubLObject sys_tran_module_output_enabledP(final SubLObject sys_tran, final SubLObject module) {
        return translator_module_feature_expression_match(sys_tran_module_features(sys_tran, module), (SubLObject)ConsesLow.cons((SubLObject)system_translation.$kw69$CYC_TRANSLATE, sys_tran_features(sys_tran)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 9531L)
    public static SubLObject sys_tran_module_declare_function(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = Hashtables.gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), (SubLObject)system_translation.NIL);
        return data.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 9725L)
    public static SubLObject sys_tran_module_init_function(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = Hashtables.gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), (SubLObject)system_translation.NIL);
        return conses_high.second(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 9917L)
    public static SubLObject sys_tran_module_setup_function(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = Hashtables.gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), (SubLObject)system_translation.NIL);
        return conses_high.third(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 10109L)
    public static SubLObject sys_tran_all_init_functions(final SubLObject sys_tran) {
        SubLObject init_functions = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = sys_tran_modules(sys_tran);
        SubLObject module = (SubLObject)system_translation.NIL;
        module = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            init_functions = (SubLObject)ConsesLow.cons(sys_tran_module_declare_function(sys_tran, module), init_functions);
            init_functions = (SubLObject)ConsesLow.cons(sys_tran_module_init_function(sys_tran, module), init_functions);
            init_functions = (SubLObject)ConsesLow.cons(sys_tran_module_setup_function(sys_tran, module), init_functions);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return Sequences.nreverse(init_functions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 10525L)
    public static SubLObject sys_tran_system_default_path(final SubLObject sys_tran) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
        thread.resetMultipleValues();
        final SubLObject directory_module_map = translator_system_directory_module_map(system, backend, features, manifest_file);
        final SubLObject module_paths = thread.secondMultipleValue();
        final SubLObject system_default_path = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return system_default_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 11128L)
    public static SubLObject sys_tran_secure_module_id(final SubLObject sys_tran, final SubLObject module) {
        if (system_translation.NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_module_id(sid_db, module);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 11349L)
    public static SubLObject sys_tran_secure_method_id(final SubLObject sys_tran, final SubLObject method) {
        if (system_translation.NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_method_id(sid_db, method);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 11569L)
    public static SubLObject sys_tran_secure_global_id(final SubLObject sys_tran, final SubLObject global) {
        if (system_translation.NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_global_id(sid_db, global);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 11789L)
    public static SubLObject sys_tran_secure_symbol_name(final SubLObject sys_tran, final SubLObject symbol) {
        if (system_translation.NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_symbol_name(sid_db, symbol);
        }
        return Symbols.symbol_name(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 12042L)
    public static SubLObject current_system_translation_secure_symbol_name(final SubLObject symbol) {
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran) {
            return sys_tran_secure_symbol_name(sys_tran, symbol);
        }
        return Symbols.symbol_name(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 12276L)
    public static SubLObject sys_tran_note_module_filenames(final SubLObject sys_tran, final SubLObject module, final SubLObject input_filename, final SubLObject output_filename) {
        assert system_translation.NIL != Types.stringp(module) : module;
        assert system_translation.NIL != Types.stringp(input_filename) : input_filename;
        assert system_translation.NIL != Types.stringp(output_filename) : output_filename;
        Hashtables.sethash(module, sys_tr_module_filename_table(sys_tran), (SubLObject)ConsesLow.list(input_filename, output_filename));
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 12610L)
    public static SubLObject sys_tran_note_module_features(final SubLObject sys_tran, final SubLObject module, final SubLObject module_features) {
        assert system_translation.NIL != Types.stringp(module) : module;
        Hashtables.sethash(module, sys_tr_module_features_table(sys_tran), module_features);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 12878L)
    public static SubLObject sys_tran_initialize_last_translation_time(final SubLObject sys_tran) {
        return sys_tran_set_last_translation_time(sys_tran, Time.encode_universal_time((SubLObject)system_translation.ZERO_INTEGER, (SubLObject)system_translation.ZERO_INTEGER, (SubLObject)system_translation.ZERO_INTEGER, (SubLObject)system_translation.ONE_INTEGER, (SubLObject)system_translation.ONE_INTEGER, (SubLObject)system_translation.$int70$1970, (SubLObject)system_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 13043L)
    public static SubLObject translator_possibly_update_current_system_modules() {
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran) {
            final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
            translator_regenerate_manifest_file(manifest_file);
            return sys_tran_initialize_module_info(sys_tran);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 13540L)
    public static SubLObject translator_possibly_translate_one_module(final SubLObject module) {
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran && system_translation.NIL != sys_tran_includes_moduleP(sys_tran, module)) {
            translate_one_system_module(sys_tran, module);
            return (SubLObject)system_translation.T;
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 13796L)
    public static SubLObject translator_possibly_output_system_level_files() {
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran) {
            sys_tran_output_system_level_files(sys_tran);
            return (SubLObject)system_translation.T;
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 14003L)
    public static SubLObject translator_possibly_output_secure_id_database_file() {
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran) {
            sys_tran_possibly_output_secure_id_database_file(sys_tran);
            return (SubLObject)system_translation.T;
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 14230L)
    public static SubLObject sys_tran_possibly_note_module_initialization_methods(final SubLObject module, final SubLObject declare_function, final SubLObject init_function, final SubLObject setup_function) {
        assert system_translation.NIL != Types.stringp(module) : module;
        assert system_translation.NIL != Types.symbolp(declare_function) : declare_function;
        assert system_translation.NIL != Types.symbolp(init_function) : init_function;
        assert system_translation.NIL != Types.symbolp(setup_function) : setup_function;
        final SubLObject sys_tran = current_system_translation();
        if (system_translation.NIL != sys_tran) {
            Hashtables.sethash(module, sys_tr_module_initialization_table(sys_tran), (SubLObject)ConsesLow.list(declare_function, init_function, setup_function));
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 14741L)
    public static SubLObject translate_one_system(final SubLObject translation_properties) {
        SubLObject allow_other_keys_p = (SubLObject)system_translation.NIL;
        SubLObject rest = translation_properties;
        SubLObject bad = (SubLObject)system_translation.NIL;
        SubLObject current_$1 = (SubLObject)system_translation.NIL;
        while (system_translation.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, translation_properties, (SubLObject)system_translation.$list72);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, translation_properties, (SubLObject)system_translation.$list72);
            if (system_translation.NIL == conses_high.member(current_$1, (SubLObject)system_translation.$list73, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED)) {
                bad = (SubLObject)system_translation.T;
            }
            if (current_$1 == system_translation.$kw74$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (system_translation.NIL != bad && system_translation.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(translation_properties, (SubLObject)system_translation.$list72);
        }
        final SubLObject system_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw37$SYSTEM, translation_properties);
        final SubLObject system = (SubLObject)((system_translation.NIL != system_tail) ? conses_high.cadr(system_tail) : system_translation.NIL);
        final SubLObject backend_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw38$BACKEND, translation_properties);
        final SubLObject backend = (SubLObject)((system_translation.NIL != backend_tail) ? conses_high.cadr(backend_tail) : system_translation.NIL);
        final SubLObject features_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw39$FEATURES, translation_properties);
        final SubLObject features = (SubLObject)((system_translation.NIL != features_tail) ? conses_high.cadr(features_tail) : system_translation.NIL);
        final SubLObject security_level_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw75$SECURITY_LEVEL, translation_properties);
        final SubLObject security_level = (SubLObject)((system_translation.NIL != security_level_tail) ? conses_high.cadr(security_level_tail) : system_translation.$kw1$NONE);
        final SubLObject input_directory_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw40$INPUT_DIRECTORY, translation_properties);
        final SubLObject input_directory = (SubLObject)((system_translation.NIL != input_directory_tail) ? conses_high.cadr(input_directory_tail) : system_translation.NIL);
        final SubLObject output_directory_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw41$OUTPUT_DIRECTORY, translation_properties);
        final SubLObject output_directory = (SubLObject)((system_translation.NIL != output_directory_tail) ? conses_high.cadr(output_directory_tail) : system_translation.NIL);
        final SubLObject system_manifest_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw76$SYSTEM_MANIFEST, translation_properties);
        final SubLObject system_manifest = (SubLObject)((system_translation.NIL != system_manifest_tail) ? conses_high.cadr(system_manifest_tail) : system_translation.NIL);
        final SubLObject initial_sid_db_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw77$INITIAL_SID_DB, translation_properties);
        final SubLObject initial_sid_db = (SubLObject)((system_translation.NIL != initial_sid_db_tail) ? conses_high.cadr(initial_sid_db_tail) : system_translation.NIL);
        final SubLObject sys_tran = new_system_translation(system, backend, features, security_level, input_directory, output_directory, system_manifest, initial_sid_db);
        sys_tran_initialize_xref_database(sys_tran);
        sys_tran_initialize_module_info(sys_tran);
        sys_tran_initialize_last_translation_time(sys_tran);
        sys_tran_perform_initial_translation(sys_tran);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 15638L)
    public static SubLObject sys_tran_initialize_xref_database(final SubLObject sys_tran) {
        final SubLObject name = sys_tran_system(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject xrs = xref_database.new_xref_system(name, features);
        _csetf_sys_tr_xref_database(sys_tran, xrs);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 15918L)
    public static SubLObject sys_tran_initialize_module_info(final SubLObject sys_tran) {
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject input_directory = sys_tran_input_directory(sys_tran);
        final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
        final SubLObject relevant_module_specs = translator_compute_relevant_modules_from_manifest(system, backend, features, manifest_file);
        SubLObject v_modules = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = relevant_module_specs;
        SubLObject relevant_module_spec = (SubLObject)system_translation.NIL;
        relevant_module_spec = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = relevant_module_spec;
            SubLObject module_path = (SubLObject)system_translation.NIL;
            SubLObject module = (SubLObject)system_translation.NIL;
            SubLObject module_features = (SubLObject)system_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list78);
            module_path = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list78);
            module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list78);
            module_features = current.first();
            current = current.rest();
            if (system_translation.NIL == current) {
                final SubLObject input_file = translator_compute_module_input_file(input_directory, module_path, module);
                final SubLObject output_file = sys_tran_compute_module_output_file(sys_tran, module_path, module);
                sys_tran_note_module_filenames(sys_tran, module, input_file, output_file);
                sys_tran_note_module_features(sys_tran, module, module_features);
                v_modules = (SubLObject)ConsesLow.cons(module, v_modules);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list78);
            }
            cdolist_list_var = cdolist_list_var.rest();
            relevant_module_spec = cdolist_list_var.first();
        }
        sys_tran_possibly_update_xref_module_features(sys_tran);
        sys_tran_set_modules(sys_tran, Sequences.nreverse(v_modules));
        return Sequences.length(relevant_module_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 17025L)
    public static SubLObject translator_compute_relevant_modules_from_manifest(final SubLObject system, final SubLObject backend, final SubLObject features, final SubLObject manifest_file) {
        final SubLObject manifest = translator_parse_manifest_file(manifest_file);
        final SubLObject manifest_system = manifest_system_lookup(manifest, system);
        final SubLObject manifest_system_default_path = manifest_system_default_path(manifest_system);
        SubLObject relevant_module_specs = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = manifest_system_modules(manifest_system);
        SubLObject manifest_module = (SubLObject)system_translation.NIL;
        manifest_module = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            if (system_translation.NIL != manifest_module_features_allowedP(manifest_module, backend, features)) {
                final SubLObject module_path = manifest_module_path(manifest_system, manifest_module);
                final SubLObject module = manifest_module_name(manifest_module);
                final SubLObject module_features = manifest_module_features(manifest_module);
                relevant_module_specs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module_path, module, module_features), relevant_module_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            manifest_module = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(relevant_module_specs), manifest_system_default_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 17905L)
    public static SubLObject translator_compute_module_input_file(final SubLObject input_directory, final SubLObject module_path, final SubLObject module) {
        return translator_compute_full_filename(input_directory, module_path, module, (SubLObject)system_translation.$str79$lisp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 18082L)
    public static SubLObject sys_tran_compute_module_output_file(final SubLObject sys_tran, final SubLObject module_path, final SubLObject module) {
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject security_level = sys_tran_security_level(sys_tran);
        final SubLObject output_directory = sys_tran_output_directory(sys_tran);
        final SubLObject output_module_path = translate_backend_compute_output_module_path(backend, module_path, security_level);
        final SubLObject filename = sys_tran_backend_output_module_filename(sys_tran, backend, module);
        final SubLObject extension = translator_backend_output_file_extension(backend);
        return translator_compute_full_filename(output_directory, output_module_path, filename, extension);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 18713L)
    public static SubLObject translate_backend_compute_output_module_path(final SubLObject backend, SubLObject module_path, final SubLObject security_level) {
        if (backend.eql((SubLObject)system_translation.$kw80$SL2C)) {
            if (module_path.equal((SubLObject)system_translation.$list81)) {
                return (SubLObject)system_translation.NIL;
            }
            return module_path;
        }
        else {
            if (backend.eql((SubLObject)system_translation.$kw82$SL2JAVA)) {
                if (system_translation.$kw1$NONE != security_level) {
                    module_path = list_utilities.first_n((SubLObject)system_translation.ONE_INTEGER, module_path);
                }
                SubLObject output_module_path = (SubLObject)system_translation.NIL;
                SubLObject cdolist_list_var = module_path;
                SubLObject subdir = (SubLObject)system_translation.NIL;
                subdir = cdolist_list_var.first();
                while (system_translation.NIL != cdolist_list_var) {
                    output_module_path = (SubLObject)ConsesLow.cons(java_backend.java_backend_package_name_for_subdir(subdir), output_module_path);
                    cdolist_list_var = cdolist_list_var.rest();
                    subdir = cdolist_list_var.first();
                }
                return Sequences.nreverse(output_module_path);
            }
            return (SubLObject)system_translation.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 19350L)
    public static SubLObject translator_backend_output_file_extension(final SubLObject backend) {
        if (backend.eql((SubLObject)system_translation.$kw80$SL2C)) {
            return (SubLObject)system_translation.$str83$c;
        }
        if (backend.eql((SubLObject)system_translation.$kw82$SL2JAVA)) {
            return (SubLObject)system_translation.$str84$java;
        }
        return Errors.error((SubLObject)system_translation.$str85$Time_to_specify_the_output_file_e, backend);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 19592L)
    public static SubLObject sys_tran_backend_output_module_filename(final SubLObject sys_tran, final SubLObject backend, final SubLObject module) {
        final SubLObject secure_module_id = sys_tran_secure_module_id(sys_tran, module);
        if (backend.eql((SubLObject)system_translation.$kw80$SL2C)) {
            return c_backend.c_backend_output_module_filename(module, secure_module_id);
        }
        if (backend.eql((SubLObject)system_translation.$kw82$SL2JAVA)) {
            return java_backend_output_module_filename(module, secure_module_id);
        }
        return Errors.error((SubLObject)system_translation.$str86$Time_to_specify_the_output_module, backend);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 20049L)
    public static SubLObject java_backend_output_module_filename(final SubLObject module, SubLObject secure_module_id) {
        if (secure_module_id == system_translation.UNPROVIDED) {
            secure_module_id = (SubLObject)system_translation.NIL;
        }
        if (system_translation.NIL != secure_module_id) {
            return PrintLow.format((SubLObject)system_translation.NIL, (SubLObject)system_translation.$str87$module_4__0D, secure_module_id);
        }
        return Sequences.nsubstitute((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, Strings.string_downcase(module, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED), (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 20315L)
    public static SubLObject translator_compute_full_filename(final SubLObject start_directory, final SubLObject path_list, final SubLObject filename, final SubLObject extension) {
        final SubLObject file_basic_filename = file_utilities.basic_filename(filename, extension);
        final SubLObject file_relative_filename = Strings.string_downcase(file_utilities.reconstruct_path(path_list, file_basic_filename, (SubLObject)system_translation.UNPROVIDED), (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
        final SubLObject full_filename = file_utilities.relative_filename(start_directory, file_relative_filename, (SubLObject)system_translation.UNPROVIDED);
        return full_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 20762L)
    public static SubLObject translator_module_feature_expression_match(final SubLObject module_features, final SubLObject translation_features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (system_translation.NIL == module_features) {
            return (SubLObject)system_translation.T;
        }
        SubLObject matchP = (SubLObject)system_translation.NIL;
        final SubLObject _prev_bind_0 = reader.$features$.currentBinding(thread);
        try {
            reader.$features$.bind(translation_features, thread);
            matchP = subl_macros.feature_expression_match(module_features);
        }
        finally {
            reader.$features$.rebind(_prev_bind_0, thread);
        }
        return matchP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 21157L)
    public static SubLObject sys_tran_possibly_update_xref_module_features(final SubLObject sys_tran) {
        assert system_translation.NIL != system_translation_p(sys_tran) : sys_tran;
        final SubLObject xrs = sys_tran_xref_database(sys_tran);
        final SubLObject cdohash_table = sys_tr_module_features_table(sys_tran);
        SubLObject module = (SubLObject)system_translation.NIL;
        SubLObject module_features = (SubLObject)system_translation.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                module = Hashtables.getEntryKey(cdohash_entry);
                module_features = Hashtables.getEntryValue(cdohash_entry);
                xref_database.xrs_possibly_note_module_features(xrs, module, module_features);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 21748L)
    public static SubLObject sys_tran_trace_format(final SubLObject format_control, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == system_translation.UNPROVIDED) {
            arg1 = (SubLObject)system_translation.NIL;
        }
        if (arg2 == system_translation.UNPROVIDED) {
            arg2 = (SubLObject)system_translation.NIL;
        }
        if (arg3 == system_translation.UNPROVIDED) {
            arg3 = (SubLObject)system_translation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        format_nil.force_format(system_translation.$translation_trace_stream$.getDynamicValue(thread), format_control, arg1, arg2, arg3, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 21987L)
    public static SubLObject with_simple_restart_loop(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)system_translation.NIL;
        SubLObject format_control = (SubLObject)system_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list88);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list88);
        format_control = current.first();
        final SubLObject format_args;
        current = (format_args = current.rest());
        final SubLObject body;
        current = (body = temp);
        final SubLObject done = (SubLObject)system_translation.$sym89$DONE;
        return (SubLObject)ConsesLow.list((SubLObject)system_translation.$sym90$CLET, (SubLObject)ConsesLow.list(done), (SubLObject)ConsesLow.list((SubLObject)system_translation.$sym91$WHILE, (SubLObject)ConsesLow.list((SubLObject)system_translation.$sym92$CNOT, done), (SubLObject)ConsesLow.listS((SubLObject)system_translation.$sym93$WITH_SIMPLE_RESTART, (SubLObject)ConsesLow.listS(name, format_control, ConsesLow.append(format_args, (SubLObject)system_translation.NIL)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)system_translation.$sym94$CSETQ, done, (SubLObject)system_translation.$list95))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 22367L)
    public static SubLObject sys_tran_perform_initial_translation(final SubLObject sys_tran) {
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject v_modules = sys_tran_modules(sys_tran);
        sys_tran_trace_format((SubLObject)system_translation.$str96$__Translating__A_to_backend__S_wi, system, backend, features);
        sys_tran_translate_modules(sys_tran, v_modules);
        sys_tran_output_system_level_files(sys_tran);
        sys_tran_possibly_output_secure_id_database_file(sys_tran);
        sys_tran_set_last_translation_time(sys_tran, (SubLObject)system_translation.UNPROVIDED);
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 22961L)
    public static SubLObject sys_tran_translate_modules(final SubLObject sys_tran, final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sys_tran_trace_format((SubLObject)system_translation.$str97$__Pass_1___Populating_XREF_databa, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
        final SubLObject _prev_bind_0 = system_translation.$translator_output_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = system_translation.$translation_trace_stream$.currentBinding(thread);
        final SubLObject _prev_bind_3 = Errors.$ignore_warnsP$.currentBinding(thread);
        try {
            system_translation.$translator_output_enabledP$.bind((SubLObject)system_translation.NIL, thread);
            system_translation.$translation_trace_stream$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            Errors.$ignore_warnsP$.bind((SubLObject)system_translation.T, thread);
            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$4 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)system_translation.$str98$Scanning_modules, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(v_modules), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)system_translation.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_translation.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_translation.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_translation.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = v_modules;
                    SubLObject module = (SubLObject)system_translation.NIL;
                    module = csome_list_var.first();
                    while (system_translation.NIL != csome_list_var) {
                        translate_one_system_module(sys_tran, module);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_translation.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        module = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_translation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_2_$4, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$3, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            Errors.$ignore_warnsP$.rebind(_prev_bind_3, thread);
            system_translation.$translation_trace_stream$.rebind(_prev_bind_2, thread);
            system_translation.$translator_output_enabledP$.rebind(_prev_bind_0, thread);
        }
        sys_tran_trace_format((SubLObject)system_translation.$str100$__Pass_2___Translating, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
        SubLObject cdolist_list_var = v_modules;
        SubLObject module2 = (SubLObject)system_translation.NIL;
        module2 = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            if (system_translation.NIL != sys_tran_module_output_enabledP(sys_tran, module2)) {
                translate_one_system_module(sys_tran, module2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module2 = cdolist_list_var.first();
        }
        return sys_tran;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 24046L)
    public static SubLObject trivial_finger_print_for_module(final SubLObject module) {
        return Sequences.cconcatenate(module, new SubLObject[] { system_translation.$str102$_, string_utilities.to_string(Time.get_universal_time()) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 24173L)
    public static SubLObject suggest_finger_print_for_module(final SubLObject module, final SubLObject input_filename, SubLObject features) {
        if (features == system_translation.UNPROVIDED) {
            features = (SubLObject)system_translation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject finger_print = (SubLObject)system_translation.NIL;
        final SubLObject lines = os_process_utilities.os_process_evaluation_output_strings(system_translation.$external_checksum_algorithm$.getDynamicValue(thread), (SubLObject)ConsesLow.list(input_filename), (SubLObject)system_translation.ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread));
        final SubLObject line = lines.first();
        if (line.isString()) {
            final SubLObject split_point = list_utilities.position_if_not((SubLObject)system_translation.$sym103$ALPHANUMERICP, line, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
            finger_print = string_utilities.substring(line, (SubLObject)system_translation.ZERO_INTEGER, split_point);
        }
        if (!finger_print.isString()) {
            Errors.warn((SubLObject)system_translation.$str104$_A_failed_to_produce_non_trivial_, system_translation.$external_checksum_algorithm$.getDynamicValue(thread), module, lines);
            finger_print = trivial_finger_print_for_module(module);
        }
        return finger_print;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 25002L)
    public static SubLObject translate_one_module(final SubLObject module, final SubLObject input_filename, SubLObject output_filename, final SubLObject backend, final SubLObject features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_translation.NIL != Types.stringp(module) : module;
        assert system_translation.NIL != Types.stringp(input_filename) : input_filename;
        assert system_translation.NIL != Types.stringp(output_filename) : output_filename;
        assert system_translation.NIL != translator_backend_p(backend) : backend;
        assert system_translation.NIL != list_utilities.non_dotted_list_p(features) : features;
        SubLObject cdolist_list_var = features;
        SubLObject elem = (SubLObject)system_translation.NIL;
        elem = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            assert system_translation.NIL != Types.keywordp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject ts_file = (SubLObject)system_translation.NIL;
        SubLObject successP = (SubLObject)system_translation.NIL;
        final SubLObject restart_tag = (SubLObject)system_translation.$sym105$SKIP;
        SubLObject dummy = (SubLObject)system_translation.NIL;
        final SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding(thread);
        try {
            Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag, (SubLObject)system_translation.$str106$Skip__S, module), Errors.$restarts$.getDynamicValue(thread)), thread);
            try {
                thread.throwStack.push(restart_tag);
                SubLObject done = (SubLObject)system_translation.NIL;
                while (system_translation.NIL == done) {
                    final SubLObject restart_tag_$6 = (SubLObject)system_translation.$sym107$RETRANSLATE;
                    SubLObject dummy_$7 = (SubLObject)system_translation.NIL;
                    final SubLObject _prev_bind_0_$8 = Errors.$restarts$.currentBinding(thread);
                    try {
                        Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag_$6, (SubLObject)system_translation.$str108$Retranslate__S, module), Errors.$restarts$.getDynamicValue(thread)), thread);
                        try {
                            thread.throwStack.push(restart_tag_$6);
                            try {
                                final SubLObject _prev_bind_0_$9 = reader.$features$.currentBinding(thread);
                                try {
                                    reader.$features$.bind(conses_high.adjoin(backend, features, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED), thread);
                                    SubLObject finger_print = (SubLObject)system_translation.NIL;
                                    sys_tran_trace_format((SubLObject)system_translation.$str109$___Starting__A_, module, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
                                    ts_file = file_translation.translate_file(module, input_filename);
                                    if (system_translation.NIL != translator_output_enabled_p()) {
                                        if (system_translation.NIL != system_translation.$generate_module_fingerprintsP$.getDynamicValue(thread)) {
                                            finger_print = suggest_finger_print_for_module(module, input_filename, features);
                                        }
                                    }
                                    else {
                                        output_filename = (SubLObject)system_translation.$str110$_dev_null;
                                    }
                                    if (backend.eql((SubLObject)system_translation.$kw80$SL2C)) {
                                        c_backend.c_backend_output_file_and_header_file(ts_file, output_filename, finger_print);
                                    }
                                    else if (backend.eql((SubLObject)system_translation.$kw82$SL2JAVA)) {
                                        java_backend.java_backend_output_file(ts_file, output_filename, finger_print);
                                    }
                                    else {
                                        Errors.error((SubLObject)system_translation.$str111$backend__S_is_not_yet_supported, backend);
                                    }
                                    successP = (SubLObject)system_translation.T;
                                }
                                finally {
                                    reader.$features$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_translation.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (system_translation.NIL != file_translation.trans_subl_file_p(ts_file)) {
                                        file_translation.destroy_trans_subl_file(ts_file);
                                    }
                                    sys_tran_trace_format((SubLObject)system_translation.$str112$___Finished__A_, module, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            done = (SubLObject)system_translation.T;
                        }
                        catch (Throwable ccatch_env_var) {
                            dummy_$7 = Errors.handleThrowable(ccatch_env_var, restart_tag_$6);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                    finally {
                        Errors.$restarts$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var2) {
                dummy = Errors.handleThrowable(ccatch_env_var2, restart_tag);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            Errors.$restarts$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 26597L)
    public static SubLObject translate_one_system_module(final SubLObject sys_tran, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_translation.NIL != system_translation_p(sys_tran) : sys_tran;
        assert system_translation.NIL != Types.stringp(module) : module;
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject input_filename = sys_tran_module_input_filename(sys_tran, module);
        final SubLObject output_filename = sys_tran_module_output_filename(sys_tran, module);
        SubLObject result = (SubLObject)system_translation.NIL;
        final SubLObject _prev_bind_0 = system_translation.$current_system_translation$.currentBinding(thread);
        try {
            system_translation.$current_system_translation$.bind(sys_tran, thread);
            result = translate_one_module(module, input_filename, output_filename, backend, features);
        }
        finally {
            system_translation.$current_system_translation$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 27168L)
    public static SubLObject translator_parse_manifest_file(final SubLObject manifest_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_translation.NIL != Types.stringp(manifest_file) : manifest_file;
        if (system_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && system_translation.NIL == Filesys.probe_file(manifest_file)) {
            Errors.error((SubLObject)system_translation.$str113$The_manifest_file__S_is_not_avail, manifest_file);
        }
        SubLObject manifest_systems = (SubLObject)system_translation.NIL;
        SubLObject stream = (SubLObject)system_translation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)system_translation.NIL, thread);
                stream = compatibility.open_text(manifest_file, (SubLObject)system_translation.$kw114$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)system_translation.$str115$Unable_to_open__S, manifest_file);
            }
            final SubLObject stream_$11 = stream;
            final SubLObject _prev_bind_2 = Packages.$package$.currentBinding(thread);
            final SubLObject _prev_bind_3 = reader.$read_default_float_format$.currentBinding(thread);
            final SubLObject _prev_bind_4 = reader.$features$.currentBinding(thread);
            try {
                Packages.$package$.bind(control_vars.$sublisp_package$.getGlobalValue(), thread);
                reader.$read_default_float_format$.bind((SubLObject)system_translation.$sym116$DOUBLE_FLOAT, thread);
                reader.$features$.bind(Sequences.remove((SubLObject)system_translation.$kw117$COMMON_LISP, reader.$features$.getDynamicValue(thread), (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED), thread);
                SubLObject doneP = (SubLObject)system_translation.NIL;
                while (system_translation.NIL == doneP) {
                    final SubLObject system = reader.read_ignoring_errors(stream_$11, (SubLObject)system_translation.NIL, (SubLObject)system_translation.$kw118$EOF);
                    if (system == system_translation.$kw118$EOF) {
                        doneP = (SubLObject)system_translation.T;
                    }
                    else {
                        manifest_systems = (SubLObject)ConsesLow.cons(system, manifest_systems);
                    }
                }
            }
            finally {
                reader.$features$.rebind(_prev_bind_4, thread);
                reader.$read_default_float_format$.rebind(_prev_bind_3, thread);
                Packages.$package$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_translation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)system_translation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return Sequences.nreverse(manifest_systems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28128L)
    public static SubLObject do_manifest_systems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list119);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject manifest_system_var = (SubLObject)system_translation.NIL;
        SubLObject manifest = (SubLObject)system_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list119);
        manifest_system_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list119);
        manifest = current.first();
        current = current.rest();
        if (system_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)system_translation.$sym120$CDOLIST, (SubLObject)ConsesLow.list(manifest_system_var, manifest), ConsesLow.append(body, (SubLObject)system_translation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list119);
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28269L)
    public static SubLObject manifest_system_name(final SubLObject manifest_system) {
        return conses_high.second(manifest_system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28381L)
    public static SubLObject manifest_system_lookup(final SubLObject manifest, final SubLObject system) {
        SubLObject cdolist_list_var = manifest;
        SubLObject manifest_system = (SubLObject)system_translation.NIL;
        manifest_system = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            if (system.equal(manifest_system_name(manifest_system))) {
                return manifest_system;
            }
            cdolist_list_var = cdolist_list_var.rest();
            manifest_system = cdolist_list_var.first();
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28585L)
    public static SubLObject manifest_system_modules(final SubLObject manifest_system) {
        return conses_high.nthcdr((SubLObject)system_translation.THREE_INTEGER, manifest_system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28681L)
    public static SubLObject manifest_system_default_path(final SubLObject manifest_system) {
        return conses_high.getf(conses_high.third(manifest_system), (SubLObject)system_translation.$kw121$DIRECTORY, (SubLObject)system_translation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28800L)
    public static SubLObject manifest_module_name(final SubLObject manifest_module) {
        return manifest_module.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 28913L)
    public static SubLObject manifest_module_relative_path(final SubLObject manifest_module) {
        return conses_high.getf(manifest_module.rest(), (SubLObject)system_translation.$kw121$DIRECTORY, (SubLObject)system_translation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 29032L)
    public static SubLObject manifest_module_features(final SubLObject manifest_module) {
        return conses_high.getf(manifest_module.rest(), (SubLObject)system_translation.$kw39$FEATURES, (SubLObject)system_translation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 29145L)
    public static SubLObject manifest_module_path(final SubLObject manifest_system, final SubLObject manifest_module) {
        final SubLObject system_path = manifest_system_default_path(manifest_system);
        final SubLObject relative_module_path = manifest_module_relative_path(manifest_module);
        return ConsesLow.append(system_path, relative_module_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 29469L)
    public static SubLObject manifest_module_features_allowedP(final SubLObject manifest_module, final SubLObject backend, final SubLObject features) {
        final SubLObject module_features = manifest_module_features(manifest_module);
        final SubLObject translation_features = conses_high.adjoin(backend, features, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
        return translator_module_feature_expression_match(module_features, translation_features);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 29774L)
    public static SubLObject translator_regenerate_manifest_file(final SubLObject manifest_file) {
        if (system_translation.NIL != string_utilities.ends_with(manifest_file, (SubLObject)system_translation.$str122$system_manifest_lisp, (SubLObject)system_translation.UNPROVIDED)) {
            return translator_generate_manifest_file(manifest_file);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 30164L)
    public static SubLObject translator_generate_manifest_file(final SubLObject manifest_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)system_translation.NIL;
        SubLObject stream = (SubLObject)system_translation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)system_translation.NIL, thread);
                stream = compatibility.open_text(manifest_file, (SubLObject)system_translation.$kw123$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)system_translation.$str115$Unable_to_open__S, manifest_file);
            }
            final SubLObject stream_$12 = stream;
            translator_generate_manifest_to_stream(stream_$12);
            successP = (SubLObject)system_translation.T;
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_translation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)system_translation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 30412L)
    public static SubLObject translator_generate_manifest_to_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_translation.NIL != Types.streamp(stream) : stream;
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)system_translation.NIL, thread);
            streams_high.write_string((SubLObject)system_translation.$str125$________Mode__LISP__Package__SUBL, stream, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject systems_for_manifest = cdolist_list_var = (SubLObject)system_translation.$list126;
            SubLObject system = (SubLObject)system_translation.NIL;
            system = cdolist_list_var.first();
            while (system_translation.NIL != cdolist_list_var) {
                streams_high.terpri(stream);
                streams_high.terpri(stream);
                translator_generate_manifest_system_to_stream(system, stream);
                cdolist_list_var = cdolist_list_var.rest();
                system = cdolist_list_var.first();
            }
            streams_high.terpri(stream);
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 30839L)
    public static SubLObject translator_generate_manifest_system_to_stream(final SubLObject system, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)system_translation.$str127$_);
        PrintLow.format(stream, (SubLObject)system_translation.$str128$_system__S, system);
        PrintLow.format(stream, (SubLObject)system_translation.$str129$____);
        final SubLObject directory = translator_system_directory(system);
        PrintLow.format(stream, (SubLObject)system_translation.$str130$_____directory__S, directory);
        final SubLObject v_package = translator_system_package(system);
        PrintLow.format(stream, (SubLObject)system_translation.$str131$_____package____S, v_package);
        final SubLObject required_systems = translator_system_required_systems(system);
        PrintLow.format(stream, (SubLObject)system_translation.$str132$_____required_systems_);
        PrintLow.format(stream, (SubLObject)system_translation.$str127$_);
        SubLObject list_var = (SubLObject)system_translation.NIL;
        SubLObject required_system = (SubLObject)system_translation.NIL;
        SubLObject index = (SubLObject)system_translation.NIL;
        list_var = required_systems;
        required_system = list_var.first();
        for (index = (SubLObject)system_translation.ZERO_INTEGER; system_translation.NIL != list_var; list_var = list_var.rest(), required_system = list_var.first(), index = Numbers.add((SubLObject)system_translation.ONE_INTEGER, index)) {
            if (!index.isZero()) {
                PrintLow.format(stream, (SubLObject)system_translation.$str133$_);
            }
            PrintLow.format(stream, (SubLObject)system_translation.$str134$_S, required_system);
        }
        PrintLow.format(stream, (SubLObject)system_translation.$str135$_);
        PrintLow.format(stream, (SubLObject)system_translation.$str136$____);
        final SubLObject module_specs = translator_system_module_specs(system);
        SubLObject cdolist_list_var = translator_system_module_specs(system);
        SubLObject module_spec = (SubLObject)system_translation.NIL;
        module_spec = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_spec;
            SubLObject module = (SubLObject)system_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list137);
            module = current.first();
            current = current.rest();
            SubLObject allow_other_keys_p = (SubLObject)system_translation.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)system_translation.NIL;
            SubLObject current_$13 = (SubLObject)system_translation.NIL;
            while (system_translation.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)system_translation.$list137);
                current_$13 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)system_translation.$list137);
                if (system_translation.NIL == conses_high.member(current_$13, (SubLObject)system_translation.$list138, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED)) {
                    bad = (SubLObject)system_translation.T;
                }
                if (current_$13 == system_translation.$kw74$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (system_translation.NIL != bad && system_translation.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list137);
            }
            final SubLObject directory_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw121$DIRECTORY, current);
            final SubLObject directory2 = (SubLObject)((system_translation.NIL != directory_tail) ? conses_high.cadr(directory_tail) : system_translation.NIL);
            final SubLObject features_tail = cdestructuring_bind.property_list_member((SubLObject)system_translation.$kw39$FEATURES, current);
            final SubLObject features = (SubLObject)((system_translation.NIL != features_tail) ? conses_high.cadr(features_tail) : system_translation.NIL);
            PrintLow.format(stream, (SubLObject)system_translation.$str139$_____S, module);
            if (system_translation.NIL != directory2) {
                PrintLow.format(stream, (SubLObject)system_translation.$str140$__directory__S, directory2);
            }
            if (system_translation.NIL != features) {
                PrintLow.format(stream, (SubLObject)system_translation.$str141$__features__S, features);
            }
            PrintLow.format(stream, (SubLObject)system_translation.$str135$_);
            cdolist_list_var = cdolist_list_var.rest();
            module_spec = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)system_translation.$str142$___);
        return Sequences.length(module_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 32037L)
    public static SubLObject translator_system_module_specs(final SubLObject system) {
        SubLObject module_specs = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = translator_system_modules(system);
        SubLObject module = (SubLObject)system_translation.NIL;
        module = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            final SubLObject directory = translator_system_module_directory(system, module);
            final SubLObject features = translator_system_module_features(system, module);
            module_specs = (SubLObject)ConsesLow.cons(reader.bq_cons(module, ConsesLow.append((SubLObject)((system_translation.NIL != directory) ? ConsesLow.list((SubLObject)system_translation.$kw121$DIRECTORY, directory) : system_translation.NIL), (SubLObject)((system_translation.NIL != features) ? ConsesLow.list((SubLObject)system_translation.$kw39$FEATURES, features) : system_translation.NIL), (SubLObject)system_translation.NIL)), module_specs);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return Sequences.nreverse(module_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 32499L)
    public static SubLObject translator_system_directory(final SubLObject system) {
        return Errors.error((SubLObject)system_translation.$str143$TRANSLATOR_SYSTEM_DIRECTORY_is_un);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 32882L)
    public static SubLObject translator_system_package(final SubLObject system) {
        return Errors.error((SubLObject)system_translation.$str144$TRANSLATOR_SYSTEM_PACKAGE_is_unim);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 33236L)
    public static SubLObject translator_system_required_systems(final SubLObject system) {
        return Errors.error((SubLObject)system_translation.$str145$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 33618L)
    public static SubLObject translator_system_modules(final SubLObject system) {
        return Errors.error((SubLObject)system_translation.$str146$TRANSLATOR_SYSTEM_MODULES_is_unim);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 33968L)
    public static SubLObject translator_system_module_directory(final SubLObject system, final SubLObject module) {
        return Errors.error((SubLObject)system_translation.$str147$TRANSLATOR_SYSTEM_MODULE_DIRECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 34306L)
    public static SubLObject translator_system_module_features(final SubLObject system, final SubLObject module) {
        return Errors.error((SubLObject)system_translation.$str148$TRANSLATOR_SYSTEM_MODULE_FEATURES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 34772L)
    public static SubLObject untransformed_feature_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && system_translation.NIL != v_object && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 34920L)
    public static SubLObject transform_feature_symbol(final SubLObject symbol) {
        return Symbols.make_keyword(Symbols.symbol_name(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 35016L)
    public static SubLObject sys_tran_output_system_level_files(final SubLObject sys_tran) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
        final SubLObject output_directory = sys_tran_output_directory(sys_tran);
        final SubLObject init_functions = sys_tran_all_init_functions(sys_tran);
        SubLObject result = (SubLObject)system_translation.NIL;
        final SubLObject _prev_bind_0 = system_translation.$current_system_translation$.currentBinding(thread);
        try {
            system_translation.$current_system_translation$.bind(sys_tran, thread);
            final SubLObject pcase_var = backend;
            if (pcase_var.eql((SubLObject)system_translation.$kw80$SL2C)) {
                if (!system.equal((SubLObject)system_translation.$str149$SUBLISP)) {
                    thread.resetMultipleValues();
                    final SubLObject directory_module_map = translator_system_directory_module_map(system, backend, features, manifest_file);
                    final SubLObject module_paths = thread.secondMultipleValue();
                    final SubLObject system_default_path = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = c_backend.c_backend_output_system_level_files(system, output_directory, system_default_path, init_functions, module_paths, directory_module_map);
                }
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw82$SL2JAVA)) {
                java_backend.java_backend_output_system_level_files(sys_tran, (SubLObject)system_translation.UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)system_translation.$str111$backend__S_is_not_yet_supported, backend);
            }
        }
        finally {
            system_translation.$current_system_translation$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 36416L)
    public static SubLObject sys_tran_possibly_output_secure_id_database_file(final SubLObject sys_tran) {
        if (system_translation.NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject output_directory = sys_tran_output_directory(sys_tran);
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            final SubLObject sid_db_file = Sequences.cconcatenate(output_directory, system_translation.$default_secure_id_database_filename$.getGlobalValue());
            secure_translation.save_secure_id_database_to_file(sid_db, sid_db_file);
            return (SubLObject)system_translation.T;
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 36979L)
    public static SubLObject translator_system_directory_module_map(final SubLObject system, final SubLObject backend, final SubLObject features, final SubLObject manifest_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject module_specs = translator_compute_relevant_modules_from_manifest(system, backend, features, manifest_file);
        final SubLObject system_default_path = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject system_prefix_length = Sequences.length(system_default_path);
        SubLObject system_relative_module_specs = (SubLObject)system_translation.NIL;
        SubLObject directory_modules_map = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = module_specs;
        SubLObject module_spec = (SubLObject)system_translation.NIL;
        module_spec = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_spec;
            SubLObject module_path = (SubLObject)system_translation.NIL;
            SubLObject module = (SubLObject)system_translation.NIL;
            SubLObject module_features = (SubLObject)system_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list78);
            module_path = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list78);
            module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list78);
            module_features = current.first();
            current = current.rest();
            if (system_translation.NIL == current) {
                module_path = conses_high.nthcdr(system_prefix_length, module_path);
                system_relative_module_specs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module_path, module), system_relative_module_specs);
                SubLObject existing = Sequences.find(module_path, directory_modules_map, Symbols.symbol_function((SubLObject)system_translation.EQUAL), Symbols.symbol_function((SubLObject)system_translation.$sym151$CAR), (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
                if (system_translation.NIL == existing) {
                    existing = (SubLObject)ConsesLow.list(module_path, (SubLObject)system_translation.NIL);
                    directory_modules_map = (SubLObject)ConsesLow.cons(existing, directory_modules_map);
                }
                ConsesLow.set_nth((SubLObject)system_translation.ONE_INTEGER, existing, (SubLObject)ConsesLow.cons(module, ConsesLow.nth((SubLObject)system_translation.ONE_INTEGER, existing)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list78);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_spec = cdolist_list_var.first();
        }
        cdolist_list_var = directory_modules_map;
        SubLObject directory_module_info = (SubLObject)system_translation.NIL;
        directory_module_info = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = directory_module_info;
            SubLObject module_path = (SubLObject)system_translation.NIL;
            SubLObject v_modules = (SubLObject)system_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list152);
            module_path = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list152);
            v_modules = current.first();
            current = current.rest();
            if (system_translation.NIL == current) {
                ConsesLow.set_nth((SubLObject)system_translation.ONE_INTEGER, directory_module_info, Sequences.nreverse(v_modules));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list152);
            }
            cdolist_list_var = cdolist_list_var.rest();
            directory_module_info = cdolist_list_var.first();
        }
        directory_modules_map = Sequences.nreverse(directory_modules_map);
        system_relative_module_specs = Sequences.nreverse(system_relative_module_specs);
        return Values.values(directory_modules_map, system_relative_module_specs, system_default_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 38707L)
    public static SubLObject translator_libraries_from_directory_module_map(final SubLObject system, final SubLObject directory_module_map) {
        SubLObject libraries = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = directory_module_map;
        SubLObject module_map_info = (SubLObject)system_translation.NIL;
        module_map_info = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_map_info;
            SubLObject module_path = (SubLObject)system_translation.NIL;
            SubLObject v_modules = (SubLObject)system_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list152);
            module_path = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list152);
            v_modules = current.first();
            current = current.rest();
            if (system_translation.NIL == current) {
                final SubLObject library = (system_translation.NIL != module_path) ? list_utilities.last_one(module_path) : system;
                libraries = (SubLObject)ConsesLow.cons(library, libraries);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list152);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_map_info = cdolist_list_var.first();
        }
        return Sequences.nreverse(libraries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 39095L)
    public static SubLObject translator_paths_from_directory_module_map(final SubLObject directory_module_map) {
        SubLObject final_module_paths = (SubLObject)system_translation.NIL;
        SubLObject intermediate_paths = (SubLObject)system_translation.NIL;
        SubLObject cdolist_list_var = directory_module_map;
        SubLObject module_map_info = (SubLObject)system_translation.NIL;
        module_map_info = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_map_info;
            SubLObject module_path = (SubLObject)system_translation.NIL;
            SubLObject v_modules = (SubLObject)system_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list152);
            module_path = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)system_translation.$list152);
            v_modules = current.first();
            current = current.rest();
            if (system_translation.NIL == current) {
                if (system_translation.NIL != module_path) {
                    final SubLObject item_var = module_path;
                    if (system_translation.NIL == conses_high.member(item_var, final_module_paths, Symbols.symbol_function((SubLObject)system_translation.EQUAL), Symbols.symbol_function((SubLObject)system_translation.IDENTITY))) {
                        final_module_paths = (SubLObject)ConsesLow.cons(item_var, final_module_paths);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)system_translation.$list152);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_map_info = cdolist_list_var.first();
        }
        cdolist_list_var = final_module_paths;
        SubLObject final_module_path = (SubLObject)system_translation.NIL;
        final_module_path = cdolist_list_var.first();
        while (system_translation.NIL != cdolist_list_var) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject item_var2;
            SubLObject intermediate_path;
            for (cdotimes_end_var = Sequences.length(final_module_path), i = (SubLObject)system_translation.NIL, i = (SubLObject)system_translation.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)system_translation.ONE_INTEGER)) {
                intermediate_path = (item_var2 = Sequences.subseq(final_module_path, (SubLObject)system_translation.ZERO_INTEGER, number_utilities.f_1X(i)));
                if (system_translation.NIL == conses_high.member(item_var2, intermediate_paths, Symbols.symbol_function((SubLObject)system_translation.EQUAL), Symbols.symbol_function((SubLObject)system_translation.IDENTITY))) {
                    intermediate_paths = (SubLObject)ConsesLow.cons(item_var2, intermediate_paths);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            final_module_path = cdolist_list_var.first();
        }
        return kb_utilities.sort_terms(intermediate_paths, (SubLObject)system_translation.NIL, (SubLObject)system_translation.NIL, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 39729L)
    public static SubLObject retranslate_modules(final SubLObject v_modules) {
        final SubLObject sys_tran = current_system_translation();
        sys_tran_translate_modules(sys_tran, v_modules);
        sys_tran_possibly_output_secure_id_database_file(sys_tran);
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 41920L)
    public static SubLObject module_damaged_wrt_introspectionP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject damagedP = (SubLObject)system_translation.NIL;
        if (system_translation.NIL == damagedP) {
            SubLObject csome_list_var = xref_database.xref_methods_defined_by_module(module);
            SubLObject method = (SubLObject)system_translation.NIL;
            method = csome_list_var.first();
            while (system_translation.NIL == damagedP && system_translation.NIL != csome_list_var) {
                if (system_translation.NIL != Symbols.fboundp(method) && !method.isMacroOperator()) {
                    SubLObject error = (SubLObject)system_translation.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)system_translation.$sym153$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                subl_promotions.function_symbol_arglist(method);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)system_translation.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (system_translation.NIL != error) {
                        damagedP = method;
                    }
                }
                csome_list_var = csome_list_var.rest();
                method = csome_list_var.first();
            }
        }
        return damagedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 43041L)
    public static SubLObject test_translate_and_output_form(final SubLObject form, SubLObject backend, SubLObject stream, SubLObject translation_features) {
        if (backend == system_translation.UNPROVIDED) {
            backend = (SubLObject)system_translation.$kw80$SL2C;
        }
        if (stream == system_translation.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (translation_features == system_translation.UNPROVIDED) {
            translation_features = (SubLObject)system_translation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject translated_form = form_translation.test_translate_form(form, backend, translation_features);
        final SubLObject _prev_bind_0 = reader.$features$.currentBinding(thread);
        try {
            reader.$features$.bind(conses_high.adjoin(backend, translation_features, (SubLObject)system_translation.UNPROVIDED, (SubLObject)system_translation.UNPROVIDED), thread);
            final SubLObject pcase_var = backend;
            if (pcase_var.eql((SubLObject)system_translation.$kw80$SL2C)) {
                c_backend.c_backend_test_translate_write_form(translated_form, stream, (SubLObject)system_translation.ZERO_INTEGER);
            }
            else if (pcase_var.eql((SubLObject)system_translation.$kw82$SL2JAVA)) {
                java_backend.java_backend_test_translate_write_form(translated_form, stream, (SubLObject)system_translation.ZERO_INTEGER);
            }
            else {
                Errors.error((SubLObject)system_translation.$str154$Unsupported_backend____S, backend);
            }
        }
        finally {
            reader.$features$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)system_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-translation.lisp", position = 47389L)
    public static SubLObject test_translate_and_output_form_to_string(final SubLObject form, SubLObject backend, SubLObject translation_features) {
        if (backend == system_translation.UNPROVIDED) {
            backend = (SubLObject)system_translation.$kw80$SL2C;
        }
        if (translation_features == system_translation.UNPROVIDED) {
            translation_features = (SubLObject)system_translation.NIL;
        }
        SubLObject result = (SubLObject)system_translation.NIL;
        SubLObject stream = (SubLObject)system_translation.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            test_translate_and_output_form(form, backend, stream, translation_features);
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)system_translation.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)system_translation.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    public static SubLObject declare_system_translation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_output_enabled_p", "TRANSLATOR-OUTPUT-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_backend_p", "TRANSLATOR-BACKEND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "current_system_translation", "CURRENT-SYSTEM-TRANSLATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "current_system_translation_secureP", "CURRENT-SYSTEM-TRANSLATION-SECURE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "current_system_translation_security_level", "CURRENT-SYSTEM-TRANSLATION-SECURITY-LEVEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "system_translation_print_function_trampoline", "SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "system_translation_p", "SYSTEM-TRANSLATION-P", 1, 0, false);
        new $system_translation_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_system", "SYS-TR-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_backend", "SYS-TR-BACKEND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_features", "SYS-TR-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_input_directory", "SYS-TR-INPUT-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_output_directory", "SYS-TR-OUTPUT-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_manifest_file", "SYS-TR-MANIFEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_modules", "SYS-TR-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_module_filename_table", "SYS-TR-MODULE-FILENAME-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_module_features_table", "SYS-TR-MODULE-FEATURES-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_module_initialization_table", "SYS-TR-MODULE-INITIALIZATION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_xref_database", "SYS-TR-XREF-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_secure_id_database", "SYS-TR-SECURE-ID-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tr_last_translation_time", "SYS-TR-LAST-TRANSLATION-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_system", "_CSETF-SYS-TR-SYSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_backend", "_CSETF-SYS-TR-BACKEND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_features", "_CSETF-SYS-TR-FEATURES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_input_directory", "_CSETF-SYS-TR-INPUT-DIRECTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_output_directory", "_CSETF-SYS-TR-OUTPUT-DIRECTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_manifest_file", "_CSETF-SYS-TR-MANIFEST-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_modules", "_CSETF-SYS-TR-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_module_filename_table", "_CSETF-SYS-TR-MODULE-FILENAME-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_module_features_table", "_CSETF-SYS-TR-MODULE-FEATURES-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_module_initialization_table", "_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_xref_database", "_CSETF-SYS-TR-XREF-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_secure_id_database", "_CSETF-SYS-TR-SECURE-ID-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "_csetf_sys_tr_last_translation_time", "_CSETF-SYS-TR-LAST-TRANSLATION-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "make_system_translation", "MAKE-SYSTEM-TRANSLATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "visit_defstruct_system_translation", "VISIT-DEFSTRUCT-SYSTEM-TRANSLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "visit_defstruct_object_system_translation_method", "VISIT-DEFSTRUCT-OBJECT-SYSTEM-TRANSLATION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "print_system_translation", "PRINT-SYSTEM-TRANSLATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "new_system_translation", "NEW-SYSTEM-TRANSLATION", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "destroy_system_translation", "DESTROY-SYSTEM-TRANSLATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_system", "SYS-TRAN-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_backend", "SYS-TRAN-BACKEND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_features", "SYS-TRAN-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_input_directory", "SYS-TRAN-INPUT-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_output_directory", "SYS-TRAN-OUTPUT-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_manifest_file", "SYS-TRAN-MANIFEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_xref_database", "SYS-TRAN-XREF-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_secure_id_database", "SYS-TRAN-SECURE-ID-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_modules", "SYS-TRAN-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_set_modules", "SYS-TRAN-SET-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_set_last_translation_time", "SYS-TRAN-SET-LAST-TRANSLATION-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_security_level", "SYS-TRAN-SECURITY-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_secureP", "SYS-TRAN-SECURE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_includes_moduleP", "SYS-TRAN-INCLUDES-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_input_filename", "SYS-TRAN-MODULE-INPUT-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_output_filename", "SYS-TRAN-MODULE-OUTPUT-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_relative_input_filename", "SYS-TRAN-RELATIVE-INPUT-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_features", "SYS-TRAN-MODULE-FEATURES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_output_enabledP", "SYS-TRAN-MODULE-OUTPUT-ENABLED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_declare_function", "SYS-TRAN-MODULE-DECLARE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_init_function", "SYS-TRAN-MODULE-INIT-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_module_setup_function", "SYS-TRAN-MODULE-SETUP-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_all_init_functions", "SYS-TRAN-ALL-INIT-FUNCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_system_default_path", "SYS-TRAN-SYSTEM-DEFAULT-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_secure_module_id", "SYS-TRAN-SECURE-MODULE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_secure_method_id", "SYS-TRAN-SECURE-METHOD-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_secure_global_id", "SYS-TRAN-SECURE-GLOBAL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_secure_symbol_name", "SYS-TRAN-SECURE-SYMBOL-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "current_system_translation_secure_symbol_name", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_note_module_filenames", "SYS-TRAN-NOTE-MODULE-FILENAMES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_note_module_features", "SYS-TRAN-NOTE-MODULE-FEATURES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_initialize_last_translation_time", "SYS-TRAN-INITIALIZE-LAST-TRANSLATION-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_possibly_update_current_system_modules", "TRANSLATOR-POSSIBLY-UPDATE-CURRENT-SYSTEM-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_possibly_translate_one_module", "TRANSLATOR-POSSIBLY-TRANSLATE-ONE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_possibly_output_system_level_files", "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_possibly_output_secure_id_database_file", "TRANSLATOR-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_possibly_note_module_initialization_methods", "SYS-TRAN-POSSIBLY-NOTE-MODULE-INITIALIZATION-METHODS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translate_one_system", "TRANSLATE-ONE-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_initialize_xref_database", "SYS-TRAN-INITIALIZE-XREF-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_initialize_module_info", "SYS-TRAN-INITIALIZE-MODULE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_compute_relevant_modules_from_manifest", "TRANSLATOR-COMPUTE-RELEVANT-MODULES-FROM-MANIFEST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_compute_module_input_file", "TRANSLATOR-COMPUTE-MODULE-INPUT-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_compute_module_output_file", "SYS-TRAN-COMPUTE-MODULE-OUTPUT-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translate_backend_compute_output_module_path", "TRANSLATE-BACKEND-COMPUTE-OUTPUT-MODULE-PATH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_backend_output_file_extension", "TRANSLATOR-BACKEND-OUTPUT-FILE-EXTENSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_backend_output_module_filename", "SYS-TRAN-BACKEND-OUTPUT-MODULE-FILENAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "java_backend_output_module_filename", "JAVA-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_compute_full_filename", "TRANSLATOR-COMPUTE-FULL-FILENAME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_module_feature_expression_match", "TRANSLATOR-MODULE-FEATURE-EXPRESSION-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_possibly_update_xref_module_features", "SYS-TRAN-POSSIBLY-UPDATE-XREF-MODULE-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_trace_format", "SYS-TRAN-TRACE-FORMAT", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.system_translation", "with_simple_restart_loop", "WITH-SIMPLE-RESTART-LOOP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_perform_initial_translation", "SYS-TRAN-PERFORM-INITIAL-TRANSLATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_translate_modules", "SYS-TRAN-TRANSLATE-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "trivial_finger_print_for_module", "TRIVIAL-FINGER-PRINT-FOR-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "suggest_finger_print_for_module", "SUGGEST-FINGER-PRINT-FOR-MODULE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translate_one_module", "TRANSLATE-ONE-MODULE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translate_one_system_module", "TRANSLATE-ONE-SYSTEM-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_parse_manifest_file", "TRANSLATOR-PARSE-MANIFEST-FILE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.system_translation", "do_manifest_systems", "DO-MANIFEST-SYSTEMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_system_name", "MANIFEST-SYSTEM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_system_lookup", "MANIFEST-SYSTEM-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_system_modules", "MANIFEST-SYSTEM-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_system_default_path", "MANIFEST-SYSTEM-DEFAULT-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_module_name", "MANIFEST-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_module_relative_path", "MANIFEST-MODULE-RELATIVE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_module_features", "MANIFEST-MODULE-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_module_path", "MANIFEST-MODULE-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "manifest_module_features_allowedP", "MANIFEST-MODULE-FEATURES-ALLOWED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_regenerate_manifest_file", "TRANSLATOR-REGENERATE-MANIFEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_generate_manifest_file", "TRANSLATOR-GENERATE-MANIFEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_generate_manifest_to_stream", "TRANSLATOR-GENERATE-MANIFEST-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_generate_manifest_system_to_stream", "TRANSLATOR-GENERATE-MANIFEST-SYSTEM-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_module_specs", "TRANSLATOR-SYSTEM-MODULE-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_directory", "TRANSLATOR-SYSTEM-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_package", "TRANSLATOR-SYSTEM-PACKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_required_systems", "TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_modules", "TRANSLATOR-SYSTEM-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_module_directory", "TRANSLATOR-SYSTEM-MODULE-DIRECTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_module_features", "TRANSLATOR-SYSTEM-MODULE-FEATURES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "untransformed_feature_symbol_p", "UNTRANSFORMED-FEATURE-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "transform_feature_symbol", "TRANSFORM-FEATURE-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_output_system_level_files", "SYS-TRAN-OUTPUT-SYSTEM-LEVEL-FILES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "sys_tran_possibly_output_secure_id_database_file", "SYS-TRAN-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_system_directory_module_map", "TRANSLATOR-SYSTEM-DIRECTORY-MODULE-MAP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_libraries_from_directory_module_map", "TRANSLATOR-LIBRARIES-FROM-DIRECTORY-MODULE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "translator_paths_from_directory_module_map", "TRANSLATOR-PATHS-FROM-DIRECTORY-MODULE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "retranslate_modules", "RETRANSLATE-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "module_damaged_wrt_introspectionP", "MODULE-DAMAGED-WRT-INTROSPECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "test_translate_and_output_form", "TEST-TRANSLATE-AND-OUTPUT-FORM", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_translation", "test_translate_and_output_form_to_string", "TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING", 1, 2, false);
        return (SubLObject)system_translation.NIL;
    }
    
    public static SubLObject init_system_translation_file() {
        system_translation.$translator_output_enabledP$ = SubLFiles.defvar("*TRANSLATOR-OUTPUT-ENABLED?*", (SubLObject)system_translation.T);
        system_translation.$translator_backends$ = SubLFiles.deflexical("*TRANSLATOR-BACKENDS*", (SubLObject)system_translation.$list0);
        system_translation.$current_system_translation$ = SubLFiles.defvar("*CURRENT-SYSTEM-TRANSLATION*", (SubLObject)system_translation.NIL);
        system_translation.$dtp_system_translation$ = SubLFiles.defconstant("*DTP-SYSTEM-TRANSLATION*", (SubLObject)system_translation.$sym2$SYSTEM_TRANSLATION);
        system_translation.$translation_trace_stream$ = SubLFiles.defparameter("*TRANSLATION-TRACE-STREAM*", (SubLObject)system_translation.T);
        system_translation.$generate_module_fingerprintsP$ = SubLFiles.defparameter("*GENERATE-MODULE-FINGERPRINTS?*", (SubLObject)system_translation.NIL);
        system_translation.$external_checksum_algorithm$ = SubLFiles.defparameter("*EXTERNAL-CHECKSUM-ALGORITHM*", (SubLObject)system_translation.$str101$_usr_bin_sha256sum);
        system_translation.$default_secure_id_database_filename$ = SubLFiles.deflexical("*DEFAULT-SECURE-ID-DATABASE-FILENAME*", (SubLObject)system_translation.$str150$translation_secure_id_database_fi);
        return (SubLObject)system_translation.NIL;
    }
    
    public static SubLObject setup_system_translation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), system_translation.$dtp_system_translation$.getGlobalValue(), Symbols.symbol_function((SubLObject)system_translation.$sym9$SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)system_translation.$list10);
        Structures.def_csetf((SubLObject)system_translation.$sym11$SYS_TR_SYSTEM, (SubLObject)system_translation.$sym12$_CSETF_SYS_TR_SYSTEM);
        Structures.def_csetf((SubLObject)system_translation.$sym13$SYS_TR_BACKEND, (SubLObject)system_translation.$sym14$_CSETF_SYS_TR_BACKEND);
        Structures.def_csetf((SubLObject)system_translation.$sym15$SYS_TR_FEATURES, (SubLObject)system_translation.$sym16$_CSETF_SYS_TR_FEATURES);
        Structures.def_csetf((SubLObject)system_translation.$sym17$SYS_TR_INPUT_DIRECTORY, (SubLObject)system_translation.$sym18$_CSETF_SYS_TR_INPUT_DIRECTORY);
        Structures.def_csetf((SubLObject)system_translation.$sym19$SYS_TR_OUTPUT_DIRECTORY, (SubLObject)system_translation.$sym20$_CSETF_SYS_TR_OUTPUT_DIRECTORY);
        Structures.def_csetf((SubLObject)system_translation.$sym21$SYS_TR_MANIFEST_FILE, (SubLObject)system_translation.$sym22$_CSETF_SYS_TR_MANIFEST_FILE);
        Structures.def_csetf((SubLObject)system_translation.$sym23$SYS_TR_MODULES, (SubLObject)system_translation.$sym24$_CSETF_SYS_TR_MODULES);
        Structures.def_csetf((SubLObject)system_translation.$sym25$SYS_TR_MODULE_FILENAME_TABLE, (SubLObject)system_translation.$sym26$_CSETF_SYS_TR_MODULE_FILENAME_TABLE);
        Structures.def_csetf((SubLObject)system_translation.$sym27$SYS_TR_MODULE_FEATURES_TABLE, (SubLObject)system_translation.$sym28$_CSETF_SYS_TR_MODULE_FEATURES_TABLE);
        Structures.def_csetf((SubLObject)system_translation.$sym29$SYS_TR_MODULE_INITIALIZATION_TABLE, (SubLObject)system_translation.$sym30$_CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE);
        Structures.def_csetf((SubLObject)system_translation.$sym31$SYS_TR_XREF_DATABASE, (SubLObject)system_translation.$sym32$_CSETF_SYS_TR_XREF_DATABASE);
        Structures.def_csetf((SubLObject)system_translation.$sym33$SYS_TR_SECURE_ID_DATABASE, (SubLObject)system_translation.$sym34$_CSETF_SYS_TR_SECURE_ID_DATABASE);
        Structures.def_csetf((SubLObject)system_translation.$sym35$SYS_TR_LAST_TRANSLATION_TIME, (SubLObject)system_translation.$sym36$_CSETF_SYS_TR_LAST_TRANSLATION_TIME);
        Equality.identity((SubLObject)system_translation.$sym2$SYSTEM_TRANSLATION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), system_translation.$dtp_system_translation$.getGlobalValue(), Symbols.symbol_function((SubLObject)system_translation.$sym55$VISIT_DEFSTRUCT_OBJECT_SYSTEM_TRANSLATION_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)system_translation.$sym155$TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { system_translation.$kw156$TEST, Symbols.symbol_function((SubLObject)system_translation.EQUAL), system_translation.$kw157$OWNER, system_translation.NIL, system_translation.$kw158$CLASSES, system_translation.NIL, system_translation.$kw159$KB, system_translation.$kw160$TINY, system_translation.$kw161$WORKING_, system_translation.T }), (SubLObject)system_translation.$list162);
        return (SubLObject)system_translation.NIL;
    }
    
    public void declareFunctions() {
        declare_system_translation_file();
    }
    
    public void initializeVariables() {
        init_system_translation_file();
    }
    
    public void runTopLevelForms() {
        setup_system_translation_file();
    }
    
    static {
        me = (SubLFile)new system_translation();
        system_translation.$translator_output_enabledP$ = null;
        system_translation.$translator_backends$ = null;
        system_translation.$current_system_translation$ = null;
        system_translation.$dtp_system_translation$ = null;
        system_translation.$translation_trace_stream$ = null;
        system_translation.$generate_module_fingerprintsP$ = null;
        system_translation.$external_checksum_algorithm$ = null;
        system_translation.$default_secure_id_database_filename$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SL2C"), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA"));
        $kw1$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym2$SYSTEM_TRANSLATION = SubLObjectFactory.makeSymbol("SYSTEM-TRANSLATION");
        $sym3$SYSTEM_TRANSLATION_P = SubLObjectFactory.makeSymbol("SYSTEM-TRANSLATION-P");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SYSTEM"), SubLObjectFactory.makeSymbol("BACKEND"), SubLObjectFactory.makeSymbol("FEATURES"), SubLObjectFactory.makeSymbol("INPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("OUTPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("MANIFEST-FILE"), SubLObjectFactory.makeSymbol("MODULES"), SubLObjectFactory.makeSymbol("MODULE-FILENAME-TABLE"), SubLObjectFactory.makeSymbol("MODULE-FEATURES-TABLE"), SubLObjectFactory.makeSymbol("MODULE-INITIALIZATION-TABLE"), SubLObjectFactory.makeSymbol("XREF-DATABASE"), SubLObjectFactory.makeSymbol("SECURE-ID-DATABASE"), SubLObjectFactory.makeSymbol("LAST-TRANSLATION-TIME") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SYSTEM"), SubLObjectFactory.makeKeyword("BACKEND"), SubLObjectFactory.makeKeyword("FEATURES"), SubLObjectFactory.makeKeyword("INPUT-DIRECTORY"), SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY"), SubLObjectFactory.makeKeyword("MANIFEST-FILE"), SubLObjectFactory.makeKeyword("MODULES"), SubLObjectFactory.makeKeyword("MODULE-FILENAME-TABLE"), SubLObjectFactory.makeKeyword("MODULE-FEATURES-TABLE"), SubLObjectFactory.makeKeyword("MODULE-INITIALIZATION-TABLE"), SubLObjectFactory.makeKeyword("XREF-DATABASE"), SubLObjectFactory.makeKeyword("SECURE-ID-DATABASE"), SubLObjectFactory.makeKeyword("LAST-TRANSLATION-TIME") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SYS-TR-SYSTEM"), SubLObjectFactory.makeSymbol("SYS-TR-BACKEND"), SubLObjectFactory.makeSymbol("SYS-TR-FEATURES"), SubLObjectFactory.makeSymbol("SYS-TR-INPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("SYS-TR-OUTPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("SYS-TR-MANIFEST-FILE"), SubLObjectFactory.makeSymbol("SYS-TR-MODULES"), SubLObjectFactory.makeSymbol("SYS-TR-MODULE-FILENAME-TABLE"), SubLObjectFactory.makeSymbol("SYS-TR-MODULE-FEATURES-TABLE"), SubLObjectFactory.makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE"), SubLObjectFactory.makeSymbol("SYS-TR-XREF-DATABASE"), SubLObjectFactory.makeSymbol("SYS-TR-SECURE-ID-DATABASE"), SubLObjectFactory.makeSymbol("SYS-TR-LAST-TRANSLATION-TIME") });
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-SYSTEM"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-BACKEND"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-FEATURES"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULES"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-XREF-DATABASE"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE"), SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME") });
        $sym8$PRINT_SYSTEM_TRANSLATION = SubLObjectFactory.makeSymbol("PRINT-SYSTEM-TRANSLATION");
        $sym9$SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-TRANSLATION-P"));
        $sym11$SYS_TR_SYSTEM = SubLObjectFactory.makeSymbol("SYS-TR-SYSTEM");
        $sym12$_CSETF_SYS_TR_SYSTEM = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-SYSTEM");
        $sym13$SYS_TR_BACKEND = SubLObjectFactory.makeSymbol("SYS-TR-BACKEND");
        $sym14$_CSETF_SYS_TR_BACKEND = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-BACKEND");
        $sym15$SYS_TR_FEATURES = SubLObjectFactory.makeSymbol("SYS-TR-FEATURES");
        $sym16$_CSETF_SYS_TR_FEATURES = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-FEATURES");
        $sym17$SYS_TR_INPUT_DIRECTORY = SubLObjectFactory.makeSymbol("SYS-TR-INPUT-DIRECTORY");
        $sym18$_CSETF_SYS_TR_INPUT_DIRECTORY = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY");
        $sym19$SYS_TR_OUTPUT_DIRECTORY = SubLObjectFactory.makeSymbol("SYS-TR-OUTPUT-DIRECTORY");
        $sym20$_CSETF_SYS_TR_OUTPUT_DIRECTORY = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY");
        $sym21$SYS_TR_MANIFEST_FILE = SubLObjectFactory.makeSymbol("SYS-TR-MANIFEST-FILE");
        $sym22$_CSETF_SYS_TR_MANIFEST_FILE = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE");
        $sym23$SYS_TR_MODULES = SubLObjectFactory.makeSymbol("SYS-TR-MODULES");
        $sym24$_CSETF_SYS_TR_MODULES = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULES");
        $sym25$SYS_TR_MODULE_FILENAME_TABLE = SubLObjectFactory.makeSymbol("SYS-TR-MODULE-FILENAME-TABLE");
        $sym26$_CSETF_SYS_TR_MODULE_FILENAME_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE");
        $sym27$SYS_TR_MODULE_FEATURES_TABLE = SubLObjectFactory.makeSymbol("SYS-TR-MODULE-FEATURES-TABLE");
        $sym28$_CSETF_SYS_TR_MODULE_FEATURES_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE");
        $sym29$SYS_TR_MODULE_INITIALIZATION_TABLE = SubLObjectFactory.makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE");
        $sym30$_CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE");
        $sym31$SYS_TR_XREF_DATABASE = SubLObjectFactory.makeSymbol("SYS-TR-XREF-DATABASE");
        $sym32$_CSETF_SYS_TR_XREF_DATABASE = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-XREF-DATABASE");
        $sym33$SYS_TR_SECURE_ID_DATABASE = SubLObjectFactory.makeSymbol("SYS-TR-SECURE-ID-DATABASE");
        $sym34$_CSETF_SYS_TR_SECURE_ID_DATABASE = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE");
        $sym35$SYS_TR_LAST_TRANSLATION_TIME = SubLObjectFactory.makeSymbol("SYS-TR-LAST-TRANSLATION-TIME");
        $sym36$_CSETF_SYS_TR_LAST_TRANSLATION_TIME = SubLObjectFactory.makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME");
        $kw37$SYSTEM = SubLObjectFactory.makeKeyword("SYSTEM");
        $kw38$BACKEND = SubLObjectFactory.makeKeyword("BACKEND");
        $kw39$FEATURES = SubLObjectFactory.makeKeyword("FEATURES");
        $kw40$INPUT_DIRECTORY = SubLObjectFactory.makeKeyword("INPUT-DIRECTORY");
        $kw41$OUTPUT_DIRECTORY = SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY");
        $kw42$MANIFEST_FILE = SubLObjectFactory.makeKeyword("MANIFEST-FILE");
        $kw43$MODULES = SubLObjectFactory.makeKeyword("MODULES");
        $kw44$MODULE_FILENAME_TABLE = SubLObjectFactory.makeKeyword("MODULE-FILENAME-TABLE");
        $kw45$MODULE_FEATURES_TABLE = SubLObjectFactory.makeKeyword("MODULE-FEATURES-TABLE");
        $kw46$MODULE_INITIALIZATION_TABLE = SubLObjectFactory.makeKeyword("MODULE-INITIALIZATION-TABLE");
        $kw47$XREF_DATABASE = SubLObjectFactory.makeKeyword("XREF-DATABASE");
        $kw48$SECURE_ID_DATABASE = SubLObjectFactory.makeKeyword("SECURE-ID-DATABASE");
        $kw49$LAST_TRANSLATION_TIME = SubLObjectFactory.makeKeyword("LAST-TRANSLATION-TIME");
        $str50$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw51$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym52$MAKE_SYSTEM_TRANSLATION = SubLObjectFactory.makeSymbol("MAKE-SYSTEM-TRANSLATION");
        $kw53$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw54$END = SubLObjectFactory.makeKeyword("END");
        $sym55$VISIT_DEFSTRUCT_OBJECT_SYSTEM_TRANSLATION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYSTEM-TRANSLATION-METHOD");
        $str56$_A_A__S__S_features___S_modules = SubLObjectFactory.makeString("~A~A ~S ~S features, ~S modules");
        $str57$secure_ = SubLObjectFactory.makeString("secure ");
        $str58$ = SubLObjectFactory.makeString("");
        $sym59$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym60$TRANSLATOR_BACKEND_P = SubLObjectFactory.makeSymbol("TRANSLATOR-BACKEND-P");
        $sym61$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym62$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym63$TRANSLATOR_SECURITY_LEVEL_P = SubLObjectFactory.makeSymbol("TRANSLATOR-SECURITY-LEVEL-P");
        $sym64$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str65$Security_level__A_does_not_match_ = SubLObjectFactory.makeString("Security level ~A does not match security level ~A of provided secure ID database.~%");
        $int66$1000 = SubLObjectFactory.makeInteger(1000);
        $kw67$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym68$UNIVERSAL_TIME_P = SubLObjectFactory.makeSymbol("UNIVERSAL-TIME-P");
        $kw69$CYC_TRANSLATE = SubLObjectFactory.makeKeyword("CYC-TRANSLATE");
        $int70$1970 = SubLObjectFactory.makeInteger(1970);
        $sym71$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $list72 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("SYSTEM"), SubLObjectFactory.makeSymbol("BACKEND"), SubLObjectFactory.makeSymbol("FEATURES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECURITY-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), SubLObjectFactory.makeSymbol("INPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("OUTPUT-DIRECTORY"), SubLObjectFactory.makeSymbol("SYSTEM-MANIFEST"), SubLObjectFactory.makeSymbol("INITIAL-SID-DB") });
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("BACKEND"), (SubLObject)SubLObjectFactory.makeKeyword("FEATURES"), (SubLObject)SubLObjectFactory.makeKeyword("SECURITY-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-DIRECTORY"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM-MANIFEST"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-SID-DB"));
        $kw74$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw75$SECURITY_LEVEL = SubLObjectFactory.makeKeyword("SECURITY-LEVEL");
        $kw76$SYSTEM_MANIFEST = SubLObjectFactory.makeKeyword("SYSTEM-MANIFEST");
        $kw77$INITIAL_SID_DB = SubLObjectFactory.makeKeyword("INITIAL-SID-DB");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-FEATURES"));
        $str79$lisp = SubLObjectFactory.makeString("lisp");
        $kw80$SL2C = SubLObjectFactory.makeKeyword("SL2C");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SUBLISP"));
        $kw82$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");
        $str83$c = SubLObjectFactory.makeString("c");
        $str84$java = SubLObjectFactory.makeString("java");
        $str85$Time_to_specify_the_output_file_e = SubLObjectFactory.makeString("Time to specify the output file extension for backend ~S");
        $str86$Time_to_specify_the_output_module = SubLObjectFactory.makeString("Time to specify the output module filename for backend ~S");
        $str87$module_4__0D = SubLObjectFactory.makeString("module~4,'0D");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-CONTROL"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym89$DONE = SubLObjectFactory.makeUninternedSymbol("DONE");
        $sym90$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym91$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym92$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym93$WITH_SIMPLE_RESTART = SubLObjectFactory.makeSymbol("WITH-SIMPLE-RESTART");
        $sym94$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list95 = ConsesLow.list((SubLObject)system_translation.T);
        $str96$__Translating__A_to_backend__S_wi = SubLObjectFactory.makeString("~%Translating ~A to backend ~S with features :~%  ~S ");
        $str97$__Pass_1___Populating_XREF_databa = SubLObjectFactory.makeString("~%Pass 1 : Populating XREF database");
        $str98$Scanning_modules = SubLObjectFactory.makeString("Scanning modules");
        $str99$cdolist = SubLObjectFactory.makeString("cdolist");
        $str100$__Pass_2___Translating = SubLObjectFactory.makeString("~%Pass 2 : Translating");
        $str101$_usr_bin_sha256sum = SubLObjectFactory.makeString("/usr/bin/sha256sum");
        $str102$_ = SubLObjectFactory.makeString("-");
        $sym103$ALPHANUMERICP = SubLObjectFactory.makeSymbol("ALPHANUMERICP");
        $str104$_A_failed_to_produce_non_trivial_ = SubLObjectFactory.makeString("~A failed to produce non-trivial finger-print for ~A: got ~A.");
        $sym105$SKIP = SubLObjectFactory.makeSymbol("SKIP");
        $str106$Skip__S = SubLObjectFactory.makeString("Skip ~S");
        $sym107$RETRANSLATE = SubLObjectFactory.makeSymbol("RETRANSLATE");
        $str108$Retranslate__S = SubLObjectFactory.makeString("Retranslate ~S");
        $str109$___Starting__A_ = SubLObjectFactory.makeString("~%[Starting ~A]");
        $str110$_dev_null = SubLObjectFactory.makeString("/dev/null");
        $str111$backend__S_is_not_yet_supported = SubLObjectFactory.makeString("backend ~S is not yet supported");
        $str112$___Finished__A_ = SubLObjectFactory.makeString("~%[Finished ~A]");
        $str113$The_manifest_file__S_is_not_avail = SubLObjectFactory.makeString("The manifest file ~S is not available.");
        $kw114$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str115$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym116$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $kw117$COMMON_LISP = SubLObjectFactory.makeKeyword("COMMON-LISP");
        $kw118$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MANIFEST-SYSTEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MANIFEST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym120$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $kw121$DIRECTORY = SubLObjectFactory.makeKeyword("DIRECTORY");
        $str122$system_manifest_lisp = SubLObjectFactory.makeString("system-manifest.lisp");
        $kw123$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym124$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $str125$________Mode__LISP__Package__SUBL = SubLObjectFactory.makeString(";;; -*- Mode: LISP; Package: SUBLISP -*-");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SUBLISP"), (SubLObject)SubLObjectFactory.makeString("CYCL"));
        $str127$_ = SubLObjectFactory.makeString("(");
        $str128$_system__S = SubLObjectFactory.makeString(":system ~S");
        $str129$____ = SubLObjectFactory.makeString("~% (");
        $str130$_____directory__S = SubLObjectFactory.makeString("~%  :directory ~S");
        $str131$_____package____S = SubLObjectFactory.makeString("~%  :package   ~S");
        $str132$_____required_systems_ = SubLObjectFactory.makeString("~%  :required-systems ");
        $str133$_ = SubLObjectFactory.makeString(" ");
        $str134$_S = SubLObjectFactory.makeString("~S");
        $str135$_ = SubLObjectFactory.makeString(")");
        $str136$____ = SubLObjectFactory.makeString("~% )");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("FEATURES"));
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTORY"), (SubLObject)SubLObjectFactory.makeKeyword("FEATURES"));
        $str139$_____S = SubLObjectFactory.makeString("~% (~S");
        $str140$__directory__S = SubLObjectFactory.makeString(" :directory ~S");
        $str141$__features__S = SubLObjectFactory.makeString(" :features ~S");
        $str142$___ = SubLObjectFactory.makeString("~%)");
        $str143$TRANSLATOR_SYSTEM_DIRECTORY_is_un = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-DIRECTORY is unimplemented");
        $str144$TRANSLATOR_SYSTEM_PACKAGE_is_unim = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-PACKAGE is unimplemented");
        $str145$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS is unimplemented");
        $str146$TRANSLATOR_SYSTEM_MODULES_is_unim = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-MODULES is unimplemented");
        $str147$TRANSLATOR_SYSTEM_MODULE_DIRECTOR = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-MODULE-DIRECTORY is unimplemented");
        $str148$TRANSLATOR_SYSTEM_MODULE_FEATURES = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-MODULE-FEATURES is unimplemented");
        $str149$SUBLISP = SubLObjectFactory.makeString("SUBLISP");
        $str150$translation_secure_id_database_fi = SubLObjectFactory.makeString("translation-secure-id-database-file.cfasl");
        $sym151$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"));
        $sym153$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str154$Unsupported_backend____S = SubLObjectFactory.makeString("Unsupported backend : ~S");
        $sym155$TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING = SubLObjectFactory.makeSymbol("TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING");
        $kw156$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw157$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw158$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw159$KB = SubLObjectFactory.makeKeyword("KB");
        $kw160$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw161$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list162 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)system_translation.ONE_INTEGER, (SubLObject)system_translation.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("add2(one, two)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)system_translation.ONE_INTEGER, (SubLObject)system_translation.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("Numbers.add(ONE_INTEGER, TWO_INTEGER)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"))), (SubLObject)SubLObjectFactory.makeString("open_g(one, v_filename)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("v_x")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("x")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("X")), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("list(one, v_x)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("X")), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("list(x)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y")), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("list(two, v_x, v_y)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y")), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("list(x, y)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y"), (SubLObject)SubLObjectFactory.makeSymbol("Z")), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("listS(three, v_x, v_y, v_z)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y"), (SubLObject)SubLObjectFactory.makeSymbol("Z")), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("listS(x, y, z)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)system_translation.ONE_INTEGER, (SubLObject)system_translation.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("X")), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("list(three, one, two, v_x)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)system_translation.ONE_INTEGER, (SubLObject)system_translation.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("X")), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("list(ONE_INTEGER, TWO_INTEGER, x)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JAVA-NEW"), (SubLObject)SubLObjectFactory.makeString("org.apache.commons.math.stat.regression.SimpleRegression")), (SubLObject)SubLObjectFactory.makeKeyword("SL2C")), (SubLObject)SubLObjectFactory.makeString("java_new(one, CSTRING(\"org.apache.commons.math.stat.regression.SimpleRegression\"))")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JAVA-NEW"), (SubLObject)SubLObjectFactory.makeString("org.apache.commons.math.stat.regression.SimpleRegression")), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA")), (SubLObject)SubLObjectFactory.makeString("JavaLink.java_new(makeString(\"org.apache.commons.math.stat.regression.SimpleRegression\"), EMPTY_SUBL_OBJECT_ARRAY)")) });
    }
    
    public static final class $system_translation_native extends SubLStructNative
    {
        public SubLObject $system;
        public SubLObject $backend;
        public SubLObject $features;
        public SubLObject $input_directory;
        public SubLObject $output_directory;
        public SubLObject $manifest_file;
        public SubLObject $modules;
        public SubLObject $module_filename_table;
        public SubLObject $module_features_table;
        public SubLObject $module_initialization_table;
        public SubLObject $xref_database;
        public SubLObject $secure_id_database;
        public SubLObject $last_translation_time;
        private static final SubLStructDeclNative structDecl;
        
        public $system_translation_native() {
            this.$system = (SubLObject)CommonSymbols.NIL;
            this.$backend = (SubLObject)CommonSymbols.NIL;
            this.$features = (SubLObject)CommonSymbols.NIL;
            this.$input_directory = (SubLObject)CommonSymbols.NIL;
            this.$output_directory = (SubLObject)CommonSymbols.NIL;
            this.$manifest_file = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
            this.$module_filename_table = (SubLObject)CommonSymbols.NIL;
            this.$module_features_table = (SubLObject)CommonSymbols.NIL;
            this.$module_initialization_table = (SubLObject)CommonSymbols.NIL;
            this.$xref_database = (SubLObject)CommonSymbols.NIL;
            this.$secure_id_database = (SubLObject)CommonSymbols.NIL;
            this.$last_translation_time = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$system_translation_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$system;
        }
        
        public SubLObject getField3() {
            return this.$backend;
        }
        
        public SubLObject getField4() {
            return this.$features;
        }
        
        public SubLObject getField5() {
            return this.$input_directory;
        }
        
        public SubLObject getField6() {
            return this.$output_directory;
        }
        
        public SubLObject getField7() {
            return this.$manifest_file;
        }
        
        public SubLObject getField8() {
            return this.$modules;
        }
        
        public SubLObject getField9() {
            return this.$module_filename_table;
        }
        
        public SubLObject getField10() {
            return this.$module_features_table;
        }
        
        public SubLObject getField11() {
            return this.$module_initialization_table;
        }
        
        public SubLObject getField12() {
            return this.$xref_database;
        }
        
        public SubLObject getField13() {
            return this.$secure_id_database;
        }
        
        public SubLObject getField14() {
            return this.$last_translation_time;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$system = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$backend = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$features = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$input_directory = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$output_directory = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$manifest_file = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$modules = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$module_filename_table = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$module_features_table = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$module_initialization_table = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$xref_database = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$secure_id_database = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$last_translation_time = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$system_translation_native.class, system_translation.$sym2$SYSTEM_TRANSLATION, system_translation.$sym3$SYSTEM_TRANSLATION_P, system_translation.$list4, system_translation.$list5, new String[] { "$system", "$backend", "$features", "$input_directory", "$output_directory", "$manifest_file", "$modules", "$module_filename_table", "$module_features_table", "$module_initialization_table", "$xref_database", "$secure_id_database", "$last_translation_time" }, system_translation.$list6, system_translation.$list7, system_translation.$sym8$PRINT_SYSTEM_TRANSLATION);
        }
    }
    
    public static final class $system_translation_p$UnaryFunction extends UnaryFunction
    {
        public $system_translation_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SYSTEM-TRANSLATION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return system_translation.system_translation_p(arg1);
        }
    }
}

/*

	Total time: 663 ms
	 synthetic 
*/