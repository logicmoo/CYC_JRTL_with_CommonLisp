/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SYSTEM-TRANSLATION
 * source file: /cyc/top/cycl/system-translation.lisp
 * created:     2019/07/03 17:39:07
 */
public final class system_translation extends SubLTranslatedFile implements V12 {
    public static final SubLObject to_output_name(SubLObject inname, SubLObject backend) {
        {
            SubLObject pcase_var = backend;
            if (pcase_var.eql($SL2C)) {
                return inname;
            } else {
                if (pcase_var.eql($SL2JAVA)) {
                    return subst($$$java, $str_alt98$c_out, cconcatenate(inname, $str_alt99$_out), UNPROVIDED, UNPROVIDED);
                } else {
                    Errors.error($str_alt100$backend__S_is_not_yet_supported, backend);
                }
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt54$ = makeString("");

    public static final class $system_translation_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$system;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$backend;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$features;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$input_directory;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$output_directory;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$manifest_file;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$modules;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$module_filename_table;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$module_features_table;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$module_initialization_table;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$xref_database;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$secure_id_database;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$last_translation_time;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$system = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$backend = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$features = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$input_directory = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$output_directory = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$manifest_file = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$modules = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$module_filename_table = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$module_features_table = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$module_initialization_table = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$xref_database = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$secure_id_database = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.system_translation.$system_translation_native.this.$last_translation_time = value;
        }

        public SubLObject $system = Lisp.NIL;

        public SubLObject $backend = Lisp.NIL;

        public SubLObject $features = Lisp.NIL;

        public SubLObject $input_directory = Lisp.NIL;

        public SubLObject $output_directory = Lisp.NIL;

        public SubLObject $manifest_file = Lisp.NIL;

        public SubLObject $modules = Lisp.NIL;

        public SubLObject $module_filename_table = Lisp.NIL;

        public SubLObject $module_features_table = Lisp.NIL;

        public SubLObject $module_initialization_table = Lisp.NIL;

        public SubLObject $xref_database = Lisp.NIL;

        public SubLObject $secure_id_database = Lisp.NIL;

        public SubLObject $last_translation_time = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.system_translation.$system_translation_native.class, SYSTEM_TRANSLATION, SYSTEM_TRANSLATION_P, $list_alt4, $list_alt5, new String[]{ "$system", "$backend", "$features", "$input_directory", "$output_directory", "$manifest_file", "$modules", "$module_filename_table", "$module_features_table", "$module_initialization_table", "$xref_database", "$secure_id_database", "$last_translation_time" }, $list_alt6, $list_alt7, PRINT_SYSTEM_TRANSLATION);
    }

    public static final SubLFile me = new system_translation();

 public static final String myName = "com.cyc.cycjava.cycl.system_translation";


    // defvar
    @LispMethod(comment = "When non-nil, the backend actually writes to output files.\r\nWhen T, the backend just writes to /dev/null.\ndefvar\nWhen non-nil, the backend actually writes to output files.\nWhen T, the backend just writes to /dev/null.")
    private static final SubLSymbol $translator_output_enabledP$ = makeSymbol("*TRANSLATOR-OUTPUT-ENABLED?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $translator_backends$ = makeSymbol("*TRANSLATOR-BACKENDS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $current_system_translation$ = makeSymbol("*CURRENT-SYSTEM-TRANSLATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_system_translation$ = makeSymbol("*DTP-SYSTEM-TRANSLATION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $translation_trace_stream$ = makeSymbol("*TRANSLATION-TRACE-STREAM*");

    // defparameter
    /**
     * Determines whether the module translation infrastructure generates a
     * finger-print for the file or not.
     */
    @LispMethod(comment = "Determines whether the module translation infrastructure generates a\r\nfinger-print for the file or not.\ndefparameter\nDetermines whether the module translation infrastructure generates a\nfinger-print for the file or not.")
    public static final SubLSymbol $generate_module_fingerprintsP$ = makeSymbol("*GENERATE-MODULE-FINGERPRINTS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $external_checksum_algorithm$ = makeSymbol("*EXTERNAL-CHECKSUM-ALGORITHM*");

    // deflexical
    // The default target for saving the secure translation's ID database file.
    /**
     * The default target for saving the secure translation's ID database file.
     */
    @LispMethod(comment = "The default target for saving the secure translation\'s ID database file.\ndeflexical")
    private static final SubLSymbol $default_secure_id_database_filename$ = makeSymbol("*DEFAULT-SECURE-ID-DATABASE-FILENAME*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("SL2C"), makeKeyword("SL2JAVA"));

    private static final SubLSymbol SYSTEM_TRANSLATION = makeSymbol("SYSTEM-TRANSLATION");

    private static final SubLSymbol SYSTEM_TRANSLATION_P = makeSymbol("SYSTEM-TRANSLATION-P");

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("SYSTEM"), makeSymbol("BACKEND"), makeSymbol("FEATURES"), makeSymbol("INPUT-DIRECTORY"), makeSymbol("OUTPUT-DIRECTORY"), makeSymbol("MANIFEST-FILE"), makeSymbol("MODULES"), makeSymbol("MODULE-FILENAME-TABLE"), makeSymbol("MODULE-FEATURES-TABLE"), makeSymbol("MODULE-INITIALIZATION-TABLE"), makeSymbol("XREF-DATABASE"), makeSymbol("SECURE-ID-DATABASE"), makeSymbol("LAST-TRANSLATION-TIME") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SYSTEM"), makeKeyword("BACKEND"), makeKeyword("FEATURES"), makeKeyword("INPUT-DIRECTORY"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("MANIFEST-FILE"), makeKeyword("MODULES"), makeKeyword("MODULE-FILENAME-TABLE"), makeKeyword("MODULE-FEATURES-TABLE"), makeKeyword("MODULE-INITIALIZATION-TABLE"), makeKeyword("XREF-DATABASE"), makeKeyword("SECURE-ID-DATABASE"), makeKeyword("LAST-TRANSLATION-TIME") });

    static private final SubLList $list6 = list(new SubLObject[]{ makeSymbol("SYS-TR-SYSTEM"), makeSymbol("SYS-TR-BACKEND"), makeSymbol("SYS-TR-FEATURES"), makeSymbol("SYS-TR-INPUT-DIRECTORY"), makeSymbol("SYS-TR-OUTPUT-DIRECTORY"), makeSymbol("SYS-TR-MANIFEST-FILE"), makeSymbol("SYS-TR-MODULES"), makeSymbol("SYS-TR-MODULE-FILENAME-TABLE"), makeSymbol("SYS-TR-MODULE-FEATURES-TABLE"), makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE"), makeSymbol("SYS-TR-XREF-DATABASE"), makeSymbol("SYS-TR-SECURE-ID-DATABASE"), makeSymbol("SYS-TR-LAST-TRANSLATION-TIME") });

    static private final SubLList $list7 = list(new SubLObject[]{ makeSymbol("_CSETF-SYS-TR-SYSTEM"), makeSymbol("_CSETF-SYS-TR-BACKEND"), makeSymbol("_CSETF-SYS-TR-FEATURES"), makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY"), makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY"), makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE"), makeSymbol("_CSETF-SYS-TR-MODULES"), makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE"), makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE"), makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE"), makeSymbol("_CSETF-SYS-TR-XREF-DATABASE"), makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE"), makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME") });

    private static final SubLSymbol PRINT_SYSTEM_TRANSLATION = makeSymbol("PRINT-SYSTEM-TRANSLATION");

    private static final SubLSymbol SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SYSTEM-TRANSLATION-P"));

    private static final SubLSymbol SYS_TR_SYSTEM = makeSymbol("SYS-TR-SYSTEM");

    private static final SubLSymbol _CSETF_SYS_TR_SYSTEM = makeSymbol("_CSETF-SYS-TR-SYSTEM");

    private static final SubLSymbol SYS_TR_BACKEND = makeSymbol("SYS-TR-BACKEND");

    private static final SubLSymbol _CSETF_SYS_TR_BACKEND = makeSymbol("_CSETF-SYS-TR-BACKEND");

    private static final SubLSymbol SYS_TR_FEATURES = makeSymbol("SYS-TR-FEATURES");

    private static final SubLSymbol _CSETF_SYS_TR_FEATURES = makeSymbol("_CSETF-SYS-TR-FEATURES");

    private static final SubLSymbol SYS_TR_INPUT_DIRECTORY = makeSymbol("SYS-TR-INPUT-DIRECTORY");

    private static final SubLSymbol _CSETF_SYS_TR_INPUT_DIRECTORY = makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY");

    private static final SubLSymbol SYS_TR_OUTPUT_DIRECTORY = makeSymbol("SYS-TR-OUTPUT-DIRECTORY");

    private static final SubLSymbol _CSETF_SYS_TR_OUTPUT_DIRECTORY = makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY");

    private static final SubLSymbol SYS_TR_MANIFEST_FILE = makeSymbol("SYS-TR-MANIFEST-FILE");

    private static final SubLSymbol _CSETF_SYS_TR_MANIFEST_FILE = makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE");

    private static final SubLSymbol SYS_TR_MODULES = makeSymbol("SYS-TR-MODULES");

    private static final SubLSymbol _CSETF_SYS_TR_MODULES = makeSymbol("_CSETF-SYS-TR-MODULES");

    private static final SubLSymbol SYS_TR_MODULE_FILENAME_TABLE = makeSymbol("SYS-TR-MODULE-FILENAME-TABLE");

    private static final SubLSymbol _CSETF_SYS_TR_MODULE_FILENAME_TABLE = makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE");

    private static final SubLSymbol SYS_TR_MODULE_FEATURES_TABLE = makeSymbol("SYS-TR-MODULE-FEATURES-TABLE");

    private static final SubLSymbol _CSETF_SYS_TR_MODULE_FEATURES_TABLE = makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE");

    private static final SubLSymbol SYS_TR_MODULE_INITIALIZATION_TABLE = makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE");

    private static final SubLSymbol _CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE = makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE");

    private static final SubLSymbol SYS_TR_XREF_DATABASE = makeSymbol("SYS-TR-XREF-DATABASE");

    private static final SubLSymbol _CSETF_SYS_TR_XREF_DATABASE = makeSymbol("_CSETF-SYS-TR-XREF-DATABASE");

    private static final SubLSymbol SYS_TR_SECURE_ID_DATABASE = makeSymbol("SYS-TR-SECURE-ID-DATABASE");

    private static final SubLSymbol _CSETF_SYS_TR_SECURE_ID_DATABASE = makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE");

    private static final SubLSymbol SYS_TR_LAST_TRANSLATION_TIME = makeSymbol("SYS-TR-LAST-TRANSLATION-TIME");

    private static final SubLSymbol _CSETF_SYS_TR_LAST_TRANSLATION_TIME = makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME");

    private static final SubLSymbol $MODULE_FILENAME_TABLE = makeKeyword("MODULE-FILENAME-TABLE");

    private static final SubLSymbol $MODULE_FEATURES_TABLE = makeKeyword("MODULE-FEATURES-TABLE");

    private static final SubLSymbol $MODULE_INITIALIZATION_TABLE = makeKeyword("MODULE-INITIALIZATION-TABLE");

    private static final SubLSymbol $SECURE_ID_DATABASE = makeKeyword("SECURE-ID-DATABASE");

    private static final SubLSymbol $LAST_TRANSLATION_TIME = makeKeyword("LAST-TRANSLATION-TIME");

    private static final SubLString $str50$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SYSTEM_TRANSLATION = makeSymbol("MAKE-SYSTEM-TRANSLATION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SYSTEM_TRANSLATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYSTEM-TRANSLATION-METHOD");

    private static final SubLString $str56$_A_A__S__S_features___S_modules = makeString("~A~A ~S ~S features, ~S modules");

    private static final SubLString $$$secure_ = makeString("secure ");

    private static final SubLString $str58$ = makeString("");

    private static final SubLSymbol TRANSLATOR_BACKEND_P = makeSymbol("TRANSLATOR-BACKEND-P");

    private static final SubLSymbol TRANSLATOR_SECURITY_LEVEL_P = makeSymbol("TRANSLATOR-SECURITY-LEVEL-P");

    private static final SubLString $str65$Security_level__A_does_not_match_ = makeString("Security level ~A does not match security level ~A of provided secure ID database.~%");

    private static final SubLInteger $int$1970 = makeInteger(1970);

    static private final SubLList $list72 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("SYSTEM"), makeSymbol("BACKEND"), makeSymbol("FEATURES"), list(makeSymbol("SECURITY-LEVEL"), $NONE), makeSymbol("INPUT-DIRECTORY"), makeSymbol("OUTPUT-DIRECTORY"), makeSymbol("SYSTEM-MANIFEST"), makeSymbol("INITIAL-SID-DB") });

    private static final SubLList $list73 = list(makeKeyword("SYSTEM"), makeKeyword("BACKEND"), makeKeyword("FEATURES"), makeKeyword("SECURITY-LEVEL"), makeKeyword("INPUT-DIRECTORY"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("SYSTEM-MANIFEST"), makeKeyword("INITIAL-SID-DB"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $INITIAL_SID_DB = makeKeyword("INITIAL-SID-DB");

    private static final SubLList $list78 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULE"), makeSymbol("MODULE-FEATURES"));

    private static final SubLString $$$lisp = makeString("lisp");

    private static final SubLList $list81 = list(makeString("SUBLISP"));

    private static final SubLString $$$c = makeString("c");

    private static final SubLString $$$java = makeString("java");

    private static final SubLString $str85$Time_to_specify_the_output_file_e = makeString("Time to specify the output file extension for backend ~S");

    private static final SubLString $str86$Time_to_specify_the_output_module = makeString("Time to specify the output module filename for backend ~S");

    private static final SubLString $str87$module_4__0D = makeString("module~4,'0D");

    private static final SubLList $list88 = list(list(makeSymbol("NAME"), makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym89$DONE = makeUninternedSymbol("DONE");

    private static final SubLSymbol WITH_SIMPLE_RESTART = makeSymbol("WITH-SIMPLE-RESTART");

    private static final SubLList $list95 = list(T);

    private static final SubLString $str96$__Translating__A_to_backend__S_wi = makeString("~%Translating ~A to backend ~S with features :~%  ~S ");

    private static final SubLString $str97$__Pass_1___Populating_XREF_databa = makeString("~%Pass 1 : Populating XREF database");

    private static final SubLString $$$Scanning_modules = makeString("Scanning modules");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str100$__Pass_2___Translating = makeString("~%Pass 2 : Translating");

    private static final SubLString $str101$_usr_bin_sha256sum = makeString("/usr/bin/sha256sum");

    private static final SubLString $str102$_ = makeString("-");

    private static final SubLString $str104$_A_failed_to_produce_non_trivial_ = makeString("~A failed to produce non-trivial finger-print for ~A: got ~A.");

    private static final SubLString $str106$Skip__S = makeString("Skip ~S");

    private static final SubLSymbol RETRANSLATE = makeSymbol("RETRANSLATE");

    private static final SubLString $str108$Retranslate__S = makeString("Retranslate ~S");

    private static final SubLString $str109$___Starting__A_ = makeString("~%[Starting ~A]");

    private static final SubLString $str110$_dev_null = makeString("/dev/null");

    private static final SubLString $str111$backend__S_is_not_yet_supported = makeString("backend ~S is not yet supported");

    private static final SubLString $str112$___Finished__A_ = makeString("~%[Finished ~A]");

    private static final SubLString $str113$The_manifest_file__S_is_not_avail = makeString("The manifest file ~S is not available.");

    private static final SubLString $str115$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLList $list119 = list(list(makeSymbol("MANIFEST-SYSTEM-VAR"), makeSymbol("MANIFEST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str122$system_manifest_lisp = makeString("system-manifest.lisp");

    private static final SubLString $str125$________Mode__LISP__Package__SUBL = makeString(";;; -*- Mode: LISP; Package: SUBLISP -*-");

    private static final SubLList $list126 = list(makeString("SUBLISP"), makeString("CYCL"));

    static private final SubLString $str127$_ = makeString("(");

    private static final SubLString $str128$_system__S = makeString(":system ~S");

    private static final SubLString $str129$____ = makeString("~% (");

    private static final SubLString $str130$_____directory__S = makeString("~%  :directory ~S");

    private static final SubLString $str131$_____package____S = makeString("~%  :package   ~S");

    private static final SubLString $str132$_____required_systems_ = makeString("~%  :required-systems ");

    private static final SubLString $str133$_ = makeString(" ");

    private static final SubLString $str134$_S = makeString("~S");

    private static final SubLString $str135$_ = makeString(")");

    private static final SubLString $str136$____ = makeString("~% )");

    private static final SubLList $list137 = list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DIRECTORY"), makeSymbol("FEATURES"));

    private static final SubLList $list138 = list(makeKeyword("DIRECTORY"), makeKeyword("FEATURES"));

    private static final SubLString $str139$_____S = makeString("~% (~S");

    private static final SubLString $str140$__directory__S = makeString(" :directory ~S");

    private static final SubLString $str141$__features__S = makeString(" :features ~S");

    private static final SubLString $str142$___ = makeString("~%)");

    private static final SubLString $str143$TRANSLATOR_SYSTEM_DIRECTORY_is_un = makeString("TRANSLATOR-SYSTEM-DIRECTORY is unimplemented");

    private static final SubLString $str144$TRANSLATOR_SYSTEM_PACKAGE_is_unim = makeString("TRANSLATOR-SYSTEM-PACKAGE is unimplemented");

    private static final SubLString $str145$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM = makeString("TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS is unimplemented");

    private static final SubLString $str146$TRANSLATOR_SYSTEM_MODULES_is_unim = makeString("TRANSLATOR-SYSTEM-MODULES is unimplemented");

    private static final SubLString $str147$TRANSLATOR_SYSTEM_MODULE_DIRECTOR = makeString("TRANSLATOR-SYSTEM-MODULE-DIRECTORY is unimplemented");

    private static final SubLString $str148$TRANSLATOR_SYSTEM_MODULE_FEATURES = makeString("TRANSLATOR-SYSTEM-MODULE-FEATURES is unimplemented");

    private static final SubLString $$$SUBLISP = makeString("SUBLISP");

    private static final SubLString $str150$translation_secure_id_database_fi = makeString("translation-secure-id-database-file.cfasl");

    private static final SubLList $list152 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULES"));

    private static final SubLString $str154$Unsupported_backend____S = makeString("Unsupported backend : ~S");

    private static final SubLSymbol TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING = makeSymbol("TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING");

    private static final SubLList $list162 = list(new SubLObject[]{ list(list(list(makeSymbol("+"), ONE_INTEGER, TWO_INTEGER), makeKeyword("SL2C")), makeString("add2(one, two)")), list(list(list(makeSymbol("+"), ONE_INTEGER, TWO_INTEGER), makeKeyword("SL2JAVA")), makeString("Numbers.add(ONE_INTEGER, TWO_INTEGER)")), list(list(list(makeSymbol("OPEN"), makeSymbol("FILENAME"))), makeString("open_g(one, v_filename)")), list(list(makeSymbol("X"), makeKeyword("SL2C")), makeString("v_x")), list(list(makeSymbol("X"), makeKeyword("SL2JAVA")), makeString("x")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X")), makeKeyword("SL2C")), makeString("list(one, v_x)")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X")), makeKeyword("SL2JAVA")), makeString("list(x)")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X"), makeSymbol("Y")), makeKeyword("SL2C")), makeString("list(two, v_x, v_y)")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X"), makeSymbol("Y")), makeKeyword("SL2JAVA")), makeString("list(x, y)")), list(list(list(makeSymbol("BQ-LIST*"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z")), makeKeyword("SL2C")), makeString("listS(three, v_x, v_y, v_z)")), list(list(list(makeSymbol("BQ-LIST*"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z")), makeKeyword("SL2JAVA")), makeString("listS(x, y, z)")), list(list(list(makeSymbol("BQ-LIST"), ONE_INTEGER, TWO_INTEGER, makeSymbol("X")), makeKeyword("SL2C")), makeString("list(three, one, two, v_x)")), list(list(list(makeSymbol("BQ-LIST"), ONE_INTEGER, TWO_INTEGER, makeSymbol("X")), makeKeyword("SL2JAVA")), makeString("list(ONE_INTEGER, TWO_INTEGER, x)")), list(list(list(makeSymbol("JAVA-NEW"), makeString("org.apache.commons.math.stat.regression.SimpleRegression")), makeKeyword("SL2C")), makeString("java_new(one, CSTRING(\"org.apache.commons.math.stat.regression.SimpleRegression\"))")), list(list(list(makeSymbol("JAVA-NEW"), makeString("org.apache.commons.math.stat.regression.SimpleRegression")), makeKeyword("SL2JAVA")), makeString("JavaLink.java_new(makeString(\"org.apache.commons.math.stat.regression.SimpleRegression\"), EMPTY_SUBL_OBJECT_ARRAY)")) });

    static final boolean assertionsDisabledSynth = true;

    public static final SubLObject translator_output_enabled_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $translator_output_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject translator_output_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $translator_output_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject translator_backend_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $translator_backends$.getGlobalValue());
    }

    public static SubLObject translator_backend_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $translator_backends$.getGlobalValue());
    }

    public static final SubLObject current_system_translation_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_system_translation$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_system_translation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_system_translation$.getDynamicValue(thread);
    }

    public static final SubLObject current_system_translation_secureP_alt() {
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                return sys_tran_secureP(sys_tran);
            }
        }
        return NIL;
    }

    public static SubLObject current_system_translation_secureP() {
        final SubLObject sys_tran = current_system_translation();
        if (NIL != sys_tran) {
            return sys_tran_secureP(sys_tran);
        }
        return NIL;
    }

    public static final SubLObject current_system_translation_security_level_alt() {
        {
            SubLObject sys_tran = current_system_translation();
            return NIL != sys_tran ? ((SubLObject) (sys_tran_security_level(sys_tran))) : $NONE;
        }
    }

    public static SubLObject current_system_translation_security_level() {
        final SubLObject sys_tran = current_system_translation();
        return NIL != sys_tran ? sys_tran_security_level(sys_tran) : $NONE;
    }

    public static final SubLObject system_translation_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_system_translation(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject system_translation_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_system_translation(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject system_translation_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.system_translation.$system_translation_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject system_translation_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.system_translation.$system_translation_native.class ? T : NIL;
    }

    public static final SubLObject sys_tr_system_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField2();
    }

    public static SubLObject sys_tr_system(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sys_tr_backend_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField3();
    }

    public static SubLObject sys_tr_backend(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sys_tr_features_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField4();
    }

    public static SubLObject sys_tr_features(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sys_tr_input_directory_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField5();
    }

    public static SubLObject sys_tr_input_directory(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sys_tr_output_directory_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField6();
    }

    public static SubLObject sys_tr_output_directory(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sys_tr_manifest_file_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField7();
    }

    public static SubLObject sys_tr_manifest_file(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sys_tr_modules_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField8();
    }

    public static SubLObject sys_tr_modules(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject sys_tr_module_filename_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField9();
    }

    public static SubLObject sys_tr_module_filename_table(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject sys_tr_module_features_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField10();
    }

    public static SubLObject sys_tr_module_features_table(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject sys_tr_module_initialization_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField11();
    }

    public static SubLObject sys_tr_module_initialization_table(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject sys_tr_xref_database_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField12();
    }

    public static SubLObject sys_tr_xref_database(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject sys_tr_secure_id_database_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField13();
    }

    public static SubLObject sys_tr_secure_id_database(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject sys_tr_last_translation_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.getField14();
    }

    public static SubLObject sys_tr_last_translation_time(final SubLObject v_object) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_sys_tr_system_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sys_tr_system(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sys_tr_backend_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sys_tr_backend(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sys_tr_features_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sys_tr_features(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sys_tr_input_directory_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sys_tr_input_directory(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sys_tr_output_directory_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sys_tr_output_directory(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sys_tr_manifest_file_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sys_tr_manifest_file(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sys_tr_modules_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sys_tr_modules(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sys_tr_module_filename_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sys_tr_module_filename_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_sys_tr_module_features_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sys_tr_module_features_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_sys_tr_module_initialization_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_sys_tr_module_initialization_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_sys_tr_xref_database_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_sys_tr_xref_database(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_sys_tr_secure_id_database_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_sys_tr_secure_id_database(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_sys_tr_last_translation_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_TRANSLATION_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_sys_tr_last_translation_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_translation_p(v_object) : "! system_translation.system_translation_p(v_object) " + "system_translation.system_translation_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_system_translation_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.system_translation.$system_translation_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SYSTEM)) {
                        _csetf_sys_tr_system(v_new, current_value);
                    } else {
                        if (pcase_var.eql($BACKEND)) {
                            _csetf_sys_tr_backend(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FEATURES)) {
                                _csetf_sys_tr_features(v_new, current_value);
                            } else {
                                if (pcase_var.eql($INPUT_DIRECTORY)) {
                                    _csetf_sys_tr_input_directory(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($OUTPUT_DIRECTORY)) {
                                        _csetf_sys_tr_output_directory(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($MANIFEST_FILE)) {
                                            _csetf_sys_tr_manifest_file(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MODULES)) {
                                                _csetf_sys_tr_modules(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($MODULE_FILENAME_TABLE)) {
                                                    _csetf_sys_tr_module_filename_table(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($MODULE_FEATURES_TABLE)) {
                                                        _csetf_sys_tr_module_features_table(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($MODULE_INITIALIZATION_TABLE)) {
                                                            _csetf_sys_tr_module_initialization_table(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($XREF_DATABASE)) {
                                                                _csetf_sys_tr_xref_database(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($SECURE_ID_DATABASE)) {
                                                                    _csetf_sys_tr_secure_id_database(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($LAST_TRANSLATION_TIME)) {
                                                                        _csetf_sys_tr_last_translation_time(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt49$Invalid_slot__S_for_construction_, current_arg);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_system_translation(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.system_translation.$system_translation_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SYSTEM)) {
                _csetf_sys_tr_system(v_new, current_value);
            } else
                if (pcase_var.eql($BACKEND)) {
                    _csetf_sys_tr_backend(v_new, current_value);
                } else
                    if (pcase_var.eql($FEATURES)) {
                        _csetf_sys_tr_features(v_new, current_value);
                    } else
                        if (pcase_var.eql($INPUT_DIRECTORY)) {
                            _csetf_sys_tr_input_directory(v_new, current_value);
                        } else
                            if (pcase_var.eql($OUTPUT_DIRECTORY)) {
                                _csetf_sys_tr_output_directory(v_new, current_value);
                            } else
                                if (pcase_var.eql($MANIFEST_FILE)) {
                                    _csetf_sys_tr_manifest_file(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MODULES)) {
                                        _csetf_sys_tr_modules(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MODULE_FILENAME_TABLE)) {
                                            _csetf_sys_tr_module_filename_table(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($MODULE_FEATURES_TABLE)) {
                                                _csetf_sys_tr_module_features_table(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($MODULE_INITIALIZATION_TABLE)) {
                                                    _csetf_sys_tr_module_initialization_table(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($XREF_DATABASE)) {
                                                        _csetf_sys_tr_xref_database(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($SECURE_ID_DATABASE)) {
                                                            _csetf_sys_tr_secure_id_database(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($LAST_TRANSLATION_TIME)) {
                                                                _csetf_sys_tr_last_translation_time(v_new, current_value);
                                                            } else {
                                                                Errors.error($str50$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_system_translation(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SYSTEM_TRANSLATION, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SYSTEM, sys_tr_system(obj));
        funcall(visitor_fn, obj, $SLOT, $BACKEND, sys_tr_backend(obj));
        funcall(visitor_fn, obj, $SLOT, $FEATURES, sys_tr_features(obj));
        funcall(visitor_fn, obj, $SLOT, $INPUT_DIRECTORY, sys_tr_input_directory(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_DIRECTORY, sys_tr_output_directory(obj));
        funcall(visitor_fn, obj, $SLOT, $MANIFEST_FILE, sys_tr_manifest_file(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULES, sys_tr_modules(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_FILENAME_TABLE, sys_tr_module_filename_table(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_FEATURES_TABLE, sys_tr_module_features_table(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_INITIALIZATION_TABLE, sys_tr_module_initialization_table(obj));
        funcall(visitor_fn, obj, $SLOT, $XREF_DATABASE, sys_tr_xref_database(obj));
        funcall(visitor_fn, obj, $SLOT, $SECURE_ID_DATABASE, sys_tr_secure_id_database(obj));
        funcall(visitor_fn, obj, $SLOT, $LAST_TRANSLATION_TIME, sys_tr_last_translation_time(obj));
        funcall(visitor_fn, obj, $END, MAKE_SYSTEM_TRANSLATION, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_system_translation_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_system_translation(obj, visitor_fn);
    }

    public static final SubLObject print_system_translation_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt50$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    format(stream, $str_alt52$_A_A__S__S_features___S_modules, new SubLObject[]{ NIL != sys_tran_secureP(v_object) ? ((SubLObject) ($str_alt53$secure_)) : $str_alt54$, sys_tr_system(v_object), sys_tr_backend(v_object), length(sys_tr_features(v_object)), length(sys_tr_modules(v_object)) });
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_system_translation(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, $str56$_A_A__S__S_features___S_modules, new SubLObject[]{ NIL != sys_tran_secureP(v_object) ? $$$secure_ : $str58$, sys_tr_system(v_object), sys_tr_backend(v_object), length(sys_tr_features(v_object)), length(sys_tr_modules(v_object)) });
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject new_system_translation(SubLObject system, SubLObject backend, SubLObject features, SubLObject security_level, SubLObject input_directory, SubLObject output_directory, SubLObject manifest_file) {
        SubLTrampolineFile.checkType(system, STRINGP);
        SubLTrampolineFile.checkType(backend, TRANSLATOR_BACKEND_P);
        {
            SubLObject list_var = features;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, KEYWORDP);
                }
            }
        }
        SubLTrampolineFile.checkType(security_level, TRANSLATOR_SECURITY_LEVEL_P);
        SubLTrampolineFile.checkType(input_directory, DIRECTORY_P);
        SubLTrampolineFile.checkType(output_directory, DIRECTORY_P);
        if (NIL != manifest_file) {
            SubLTrampolineFile.checkType(manifest_file, STRINGP);
        }
        {
            SubLObject sys_tran = make_system_translation(UNPROVIDED);
            _csetf_sys_tr_system(sys_tran, system);
            _csetf_sys_tr_backend(sys_tran, backend);
            _csetf_sys_tr_features(sys_tran, features);
            _csetf_sys_tr_input_directory(sys_tran, input_directory);
            _csetf_sys_tr_output_directory(sys_tran, output_directory);
            _csetf_sys_tr_manifest_file(sys_tran, manifest_file);
            _csetf_sys_tr_module_filename_table(sys_tran, make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
            _csetf_sys_tr_module_features_table(sys_tran, make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
            _csetf_sys_tr_module_initialization_table(sys_tran, make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
            _csetf_sys_tr_secure_id_database(sys_tran, secure_translation.new_secure_id_database(security_level));
            return sys_tran;
        }
    }

    public static SubLObject new_system_translation(final SubLObject system, final SubLObject backend, final SubLObject features, final SubLObject security_level, final SubLObject input_directory, final SubLObject output_directory, final SubLObject manifest_file, final SubLObject initial_sid_db) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(system) : "! stringp(system) " + ("Types.stringp(system) " + "CommonSymbols.NIL != Types.stringp(system) ") + system;
        assert NIL != translator_backend_p(backend) : "! system_translation.translator_backend_p(backend) " + ("system_translation.translator_backend_p(backend) " + "CommonSymbols.NIL != system_translation.translator_backend_p(backend) ") + backend;
        assert NIL != list_utilities.non_dotted_list_p(features) : "! list_utilities.non_dotted_list_p(features) " + ("list_utilities.non_dotted_list_p(features) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(features) ") + features;
        SubLObject cdolist_list_var = features;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != keywordp(elem) : "! keywordp(elem) " + ("Types.keywordp(elem) " + "CommonSymbols.NIL != Types.keywordp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != secure_translation.translator_security_level_p(security_level) : "! secure_translation.translator_security_level_p(security_level) " + ("secure_translation.translator_security_level_p(security_level) " + "CommonSymbols.NIL != secure_translation.translator_security_level_p(security_level) ") + security_level;
        assert NIL != Filesys.directory_p(input_directory) : "! Filesys.directory_p(input_directory) " + ("Filesys.directory_p(input_directory) " + "CommonSymbols.NIL != Filesys.directory_p(input_directory) ") + input_directory;
        assert NIL != Filesys.directory_p(output_directory) : "! Filesys.directory_p(output_directory) " + ("Filesys.directory_p(output_directory) " + "CommonSymbols.NIL != Filesys.directory_p(output_directory) ") + output_directory;
        if (((NIL != manifest_file) && (!assertionsDisabledSynth)) && (NIL == stringp(manifest_file))) {
            throw new AssertionError(manifest_file);
        }
        if (((NIL != secure_translation.secure_id_database_p(initial_sid_db)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!security_level.eql(secure_translation.secure_id_database_security_level(initial_sid_db)))) {
            Errors.error($str65$Security_level__A_does_not_match_, security_level, secure_translation.secure_id_database_security_level(initial_sid_db), initial_sid_db);
        }
        final SubLObject sys_tran = make_system_translation(UNPROVIDED);
        _csetf_sys_tr_system(sys_tran, system);
        _csetf_sys_tr_backend(sys_tran, backend);
        _csetf_sys_tr_features(sys_tran, features);
        _csetf_sys_tr_input_directory(sys_tran, input_directory);
        _csetf_sys_tr_output_directory(sys_tran, output_directory);
        _csetf_sys_tr_manifest_file(sys_tran, manifest_file);
        _csetf_sys_tr_module_filename_table(sys_tran, make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
        _csetf_sys_tr_module_features_table(sys_tran, make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
        _csetf_sys_tr_module_initialization_table(sys_tran, make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
        final SubLObject sid_db = (NIL != secure_translation.secure_id_database_p(initial_sid_db)) ? initial_sid_db : secure_translation.new_secure_id_database(security_level);
        _csetf_sys_tr_secure_id_database(sys_tran, sid_db);
        return sys_tran;
    }

    public static final SubLObject destroy_system_translation_alt(SubLObject sys_tran) {
        _csetf_sys_tr_modules(sys_tran, NIL);
        clrhash(sys_tr_module_filename_table(sys_tran));
        _csetf_sys_tr_module_filename_table(sys_tran, $FREE);
        clrhash(sys_tr_module_features_table(sys_tran));
        _csetf_sys_tr_module_features_table(sys_tran, $FREE);
        clrhash(sys_tr_module_initialization_table(sys_tran));
        _csetf_sys_tr_module_initialization_table(sys_tran, $FREE);
        _csetf_sys_tr_xref_database(sys_tran, $FREE);
        secure_translation.destroy_secure_id_database(sys_tr_secure_id_database(sys_tran));
        _csetf_sys_tr_secure_id_database(sys_tran, $FREE);
        _csetf_sys_tr_last_translation_time(sys_tran, $FREE);
        return sys_tran;
    }

    public static SubLObject destroy_system_translation(final SubLObject sys_tran) {
        _csetf_sys_tr_modules(sys_tran, NIL);
        clrhash(sys_tr_module_filename_table(sys_tran));
        _csetf_sys_tr_module_filename_table(sys_tran, $FREE);
        clrhash(sys_tr_module_features_table(sys_tran));
        _csetf_sys_tr_module_features_table(sys_tran, $FREE);
        clrhash(sys_tr_module_initialization_table(sys_tran));
        _csetf_sys_tr_module_initialization_table(sys_tran, $FREE);
        _csetf_sys_tr_xref_database(sys_tran, $FREE);
        secure_translation.destroy_secure_id_database(sys_tr_secure_id_database(sys_tran));
        _csetf_sys_tr_secure_id_database(sys_tran, $FREE);
        _csetf_sys_tr_last_translation_time(sys_tran, $FREE);
        return sys_tran;
    }

    public static final SubLObject sys_tran_system_alt(SubLObject sys_tran) {
        return sys_tr_system(sys_tran);
    }

    public static SubLObject sys_tran_system(final SubLObject sys_tran) {
        return sys_tr_system(sys_tran);
    }

    public static final SubLObject sys_tran_backend_alt(SubLObject sys_tran) {
        return sys_tr_backend(sys_tran);
    }

    public static SubLObject sys_tran_backend(final SubLObject sys_tran) {
        return sys_tr_backend(sys_tran);
    }

    public static final SubLObject sys_tran_features_alt(SubLObject sys_tran) {
        return sys_tr_features(sys_tran);
    }

    public static SubLObject sys_tran_features(final SubLObject sys_tran) {
        return sys_tr_features(sys_tran);
    }

    public static final SubLObject sys_tran_input_directory_alt(SubLObject sys_tran) {
        return sys_tr_input_directory(sys_tran);
    }

    public static SubLObject sys_tran_input_directory(final SubLObject sys_tran) {
        return sys_tr_input_directory(sys_tran);
    }

    public static final SubLObject sys_tran_output_directory_alt(SubLObject sys_tran) {
        return sys_tr_output_directory(sys_tran);
    }

    public static SubLObject sys_tran_output_directory(final SubLObject sys_tran) {
        return sys_tr_output_directory(sys_tran);
    }

    public static final SubLObject sys_tran_manifest_file_alt(SubLObject sys_tran) {
        return sys_tr_manifest_file(sys_tran);
    }

    public static SubLObject sys_tran_manifest_file(final SubLObject sys_tran) {
        return sys_tr_manifest_file(sys_tran);
    }

    public static final SubLObject sys_tran_xref_database_alt(SubLObject sys_tran) {
        return sys_tr_xref_database(sys_tran);
    }

    public static SubLObject sys_tran_xref_database(final SubLObject sys_tran) {
        return sys_tr_xref_database(sys_tran);
    }

    public static final SubLObject sys_tran_secure_id_database_alt(SubLObject sys_tran) {
        return sys_tr_secure_id_database(sys_tran);
    }

    public static SubLObject sys_tran_secure_id_database(final SubLObject sys_tran) {
        return sys_tr_secure_id_database(sys_tran);
    }

    public static final SubLObject sys_tran_modules_alt(SubLObject sys_tran) {
        return sys_tr_modules(sys_tran);
    }

    public static SubLObject sys_tran_modules(final SubLObject sys_tran) {
        return sys_tr_modules(sys_tran);
    }

    public static final SubLObject sys_tran_set_modules_alt(SubLObject sys_tran, SubLObject v_modules) {
        {
            SubLObject list_var = v_modules;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        _csetf_sys_tr_modules(sys_tran, v_modules);
        return sys_tran;
    }

    public static SubLObject sys_tran_set_modules(final SubLObject sys_tran, final SubLObject v_modules) {
        assert NIL != list_utilities.non_dotted_list_p(v_modules) : "! list_utilities.non_dotted_list_p(v_modules) " + ("list_utilities.non_dotted_list_p(v_modules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_modules) ") + v_modules;
        SubLObject cdolist_list_var = v_modules;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_sys_tr_modules(sys_tran, v_modules);
        return sys_tran;
    }

    public static final SubLObject sys_tran_set_last_translation_time_alt(SubLObject sys_tran, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        SubLTrampolineFile.checkType(universal_time, UNIVERSAL_TIME_P);
        _csetf_sys_tr_last_translation_time(sys_tran, universal_time);
        return sys_tran;
    }

    public static SubLObject sys_tran_set_last_translation_time(final SubLObject sys_tran, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        assert NIL != numeric_date_utilities.universal_time_p(universal_time) : "! numeric_date_utilities.universal_time_p(universal_time) " + ("numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) ") + universal_time;
        _csetf_sys_tr_last_translation_time(sys_tran, universal_time);
        return sys_tran;
    }

    public static final SubLObject sys_tran_security_level_alt(SubLObject sys_tran) {
        return secure_translation.secure_id_database_security_level(sys_tr_secure_id_database(sys_tran));
    }

    public static SubLObject sys_tran_security_level(final SubLObject sys_tran) {
        return secure_translation.secure_id_database_security_level(sys_tr_secure_id_database(sys_tran));
    }

    public static final SubLObject sys_tran_secureP_alt(SubLObject sys_tran) {
        return makeBoolean($NONE != sys_tran_security_level(sys_tran));
    }

    public static SubLObject sys_tran_secureP(final SubLObject sys_tran) {
        return makeBoolean($NONE != sys_tran_security_level(sys_tran));
    }

    public static final SubLObject sys_tran_includes_moduleP_alt(SubLObject sys_tran, SubLObject module) {
        return list_utilities.sublisp_boolean(gethash_without_values(module, sys_tr_module_filename_table(sys_tran), NIL));
    }

    public static SubLObject sys_tran_includes_moduleP(final SubLObject sys_tran, final SubLObject module) {
        return list_utilities.sublisp_boolean(gethash_without_values(module, sys_tr_module_filename_table(sys_tran), NIL));
    }

    public static final SubLObject sys_tran_module_input_filename_alt(SubLObject sys_tran, SubLObject module) {
        {
            SubLObject data = gethash_without_values(module, sys_tr_module_filename_table(sys_tran), NIL);
            return data.first();
        }
    }

    public static SubLObject sys_tran_module_input_filename(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = gethash_without_values(module, sys_tr_module_filename_table(sys_tran), NIL);
        return data.first();
    }

    public static final SubLObject sys_tran_module_output_filename_alt(SubLObject sys_tran, SubLObject module) {
        {
            SubLObject data = gethash_without_values(module, sys_tr_module_filename_table(sys_tran), NIL);
            return second(data);
        }
    }

    public static SubLObject sys_tran_module_output_filename(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = gethash_without_values(module, sys_tr_module_filename_table(sys_tran), NIL);
        return second(data);
    }

    public static final SubLObject sys_tran_relative_input_filename_alt(SubLObject sys_tran, SubLObject module) {
        {
            SubLObject input_directory = sys_tran_input_directory(sys_tran);
            SubLObject input_filename = sys_tran_module_input_filename(sys_tran, module);
            SubLObject prefix = search(input_directory, input_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (ZERO_INTEGER.numE(prefix)) {
                {
                    SubLObject start = length(input_directory);
                    SubLObject end = length(input_filename);
                    SubLObject relative_filename = string_utilities.substring(input_filename, start, end);
                    return relative_filename;
                }
            }
        }
        return NIL;
    }

    public static SubLObject sys_tran_relative_input_filename(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject input_directory = sys_tran_input_directory(sys_tran);
        final SubLObject input_filename = sys_tran_module_input_filename(sys_tran, module);
        final SubLObject prefix = search(input_directory, input_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (ZERO_INTEGER.numE(prefix)) {
            final SubLObject start = length(input_directory);
            final SubLObject end = length(input_filename);
            final SubLObject relative_filename = string_utilities.substring(input_filename, start, end);
            return relative_filename;
        }
        return NIL;
    }

    public static final SubLObject sys_tran_module_features_alt(SubLObject sys_tran, SubLObject module) {
        return gethash_without_values(module, sys_tr_module_features_table(sys_tran), NIL);
    }

    public static SubLObject sys_tran_module_features(final SubLObject sys_tran, final SubLObject module) {
        return gethash_without_values(module, sys_tr_module_features_table(sys_tran), NIL);
    }

    public static SubLObject sys_tran_module_output_enabledP(final SubLObject sys_tran, final SubLObject module) {
        return translator_module_feature_expression_match(sys_tran_module_features(sys_tran, module), cons($CYC_TRANSLATE, sys_tran_features(sys_tran)));
    }

    public static final SubLObject sys_tran_module_declare_function_alt(SubLObject sys_tran, SubLObject module) {
        {
            SubLObject data = gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), NIL);
            return data.first();
        }
    }

    public static SubLObject sys_tran_module_declare_function(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), NIL);
        return data.first();
    }

    public static final SubLObject sys_tran_module_init_function_alt(SubLObject sys_tran, SubLObject module) {
        {
            SubLObject data = gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), NIL);
            return second(data);
        }
    }

    public static SubLObject sys_tran_module_init_function(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), NIL);
        return second(data);
    }

    public static final SubLObject sys_tran_module_setup_function_alt(SubLObject sys_tran, SubLObject module) {
        {
            SubLObject data = gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), NIL);
            return third(data);
        }
    }

    public static SubLObject sys_tran_module_setup_function(final SubLObject sys_tran, final SubLObject module) {
        final SubLObject data = gethash_without_values(module, sys_tr_module_initialization_table(sys_tran), NIL);
        return third(data);
    }

    public static final SubLObject sys_tran_all_init_functions_alt(SubLObject sys_tran) {
        {
            SubLObject init_functions = NIL;
            SubLObject cdolist_list_var = sys_tran_modules(sys_tran);
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                init_functions = cons(sys_tran_module_declare_function(sys_tran, module), init_functions);
                init_functions = cons(sys_tran_module_init_function(sys_tran, module), init_functions);
                init_functions = cons(sys_tran_module_setup_function(sys_tran, module), init_functions);
            }
            return nreverse(init_functions);
        }
    }

    public static SubLObject sys_tran_all_init_functions(final SubLObject sys_tran) {
        SubLObject init_functions = NIL;
        SubLObject cdolist_list_var = sys_tran_modules(sys_tran);
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            init_functions = cons(sys_tran_module_declare_function(sys_tran, module), init_functions);
            init_functions = cons(sys_tran_module_init_function(sys_tran, module), init_functions);
            init_functions = cons(sys_tran_module_setup_function(sys_tran, module), init_functions);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return nreverse(init_functions);
    }

    public static final SubLObject sys_tran_system_default_path_alt(SubLObject sys_tran) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject system = sys_tran_system(sys_tran);
                SubLObject backend = sys_tran_backend(sys_tran);
                SubLObject features = sys_tran_features(sys_tran);
                SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
                thread.resetMultipleValues();
                {
                    SubLObject directory_module_map = translator_system_directory_module_map(system, backend, features, manifest_file);
                    SubLObject module_paths = thread.secondMultipleValue();
                    SubLObject system_default_path = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return system_default_path;
                }
            }
        }
    }

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

    public static final SubLObject sys_tran_secure_module_id_alt(SubLObject sys_tran, SubLObject module) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            {
                SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
                return secure_translation.secure_id_database_module_id(sid_db, module);
            }
        }
        return NIL;
    }

    public static SubLObject sys_tran_secure_module_id(final SubLObject sys_tran, final SubLObject module) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_module_id(sid_db, module);
        }
        return NIL;
    }

    public static final SubLObject sys_tran_secure_method_id_alt(SubLObject sys_tran, SubLObject method) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            {
                SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
                return secure_translation.secure_id_database_method_id(sid_db, method);
            }
        }
        return NIL;
    }

    public static SubLObject sys_tran_secure_method_id(final SubLObject sys_tran, final SubLObject method) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_method_id(sid_db, method);
        }
        return NIL;
    }

    public static final SubLObject sys_tran_secure_global_id_alt(SubLObject sys_tran, SubLObject global) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            {
                SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
                return secure_translation.secure_id_database_global_id(sid_db, global);
            }
        }
        return NIL;
    }

    public static SubLObject sys_tran_secure_global_id(final SubLObject sys_tran, final SubLObject global) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_global_id(sid_db, global);
        }
        return NIL;
    }

    public static final SubLObject sys_tran_secure_symbol_name_alt(SubLObject sys_tran, SubLObject symbol) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            {
                SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
                return secure_translation.secure_id_database_symbol_name(sid_db, symbol);
            }
        }
        return symbol_name(symbol);
    }

    public static SubLObject sys_tran_secure_symbol_name(final SubLObject sys_tran, final SubLObject symbol) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            return secure_translation.secure_id_database_symbol_name(sid_db, symbol);
        }
        return symbol_name(symbol);
    }

    public static final SubLObject current_system_translation_secure_symbol_name_alt(SubLObject symbol) {
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                return sys_tran_secure_symbol_name(sys_tran, symbol);
            }
        }
        return symbol_name(symbol);
    }

    public static SubLObject current_system_translation_secure_symbol_name(final SubLObject symbol) {
        final SubLObject sys_tran = current_system_translation();
        if (NIL != sys_tran) {
            return sys_tran_secure_symbol_name(sys_tran, symbol);
        }
        return symbol_name(symbol);
    }

    public static final SubLObject sys_tran_note_module_filenames_alt(SubLObject sys_tran, SubLObject module, SubLObject input_filename, SubLObject output_filename) {
        SubLTrampolineFile.checkType(module, STRINGP);
        SubLTrampolineFile.checkType(input_filename, STRINGP);
        SubLTrampolineFile.checkType(output_filename, STRINGP);
        sethash(module, sys_tr_module_filename_table(sys_tran), list(input_filename, output_filename));
        return sys_tran;
    }

    public static SubLObject sys_tran_note_module_filenames(final SubLObject sys_tran, final SubLObject module, final SubLObject input_filename, final SubLObject output_filename) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != stringp(input_filename) : "! stringp(input_filename) " + ("Types.stringp(input_filename) " + "CommonSymbols.NIL != Types.stringp(input_filename) ") + input_filename;
        assert NIL != stringp(output_filename) : "! stringp(output_filename) " + ("Types.stringp(output_filename) " + "CommonSymbols.NIL != Types.stringp(output_filename) ") + output_filename;
        sethash(module, sys_tr_module_filename_table(sys_tran), list(input_filename, output_filename));
        return sys_tran;
    }

    public static final SubLObject sys_tran_note_module_features_alt(SubLObject sys_tran, SubLObject module, SubLObject module_features) {
        SubLTrampolineFile.checkType(module, STRINGP);
        sethash(module, sys_tr_module_features_table(sys_tran), module_features);
        return sys_tran;
    }

    public static SubLObject sys_tran_note_module_features(final SubLObject sys_tran, final SubLObject module, final SubLObject module_features) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        sethash(module, sys_tr_module_features_table(sys_tran), module_features);
        return sys_tran;
    }

    public static final SubLObject sys_tran_initialize_last_translation_time_alt(SubLObject sys_tran) {
        return sys_tran_set_last_translation_time(sys_tran, encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, $int$1970, UNPROVIDED));
    }

    public static SubLObject sys_tran_initialize_last_translation_time(final SubLObject sys_tran) {
        return sys_tran_set_last_translation_time(sys_tran, encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, $int$1970, UNPROVIDED));
    }

    public static final SubLObject translator_possibly_update_current_system_modules_alt() {
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
                    translator_regenerate_manifest_file(manifest_file);
                    return sys_tran_initialize_module_info(sys_tran);
                }
            }
        }
        return NIL;
    }

    public static SubLObject translator_possibly_update_current_system_modules() {
        final SubLObject sys_tran = current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
            translator_regenerate_manifest_file(manifest_file);
            return sys_tran_initialize_module_info(sys_tran);
        }
        return NIL;
    }

    public static final SubLObject translator_possibly_translate_one_module_alt(SubLObject module) {
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                if (NIL != sys_tran_includes_moduleP(sys_tran, module)) {
                    translate_one_system_module(sys_tran, module);
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject translator_possibly_translate_one_module(final SubLObject module) {
        final SubLObject sys_tran = current_system_translation();
        if ((NIL != sys_tran) && (NIL != sys_tran_includes_moduleP(sys_tran, module))) {
            translate_one_system_module(sys_tran, module);
            return T;
        }
        return NIL;
    }

    public static final SubLObject translator_possibly_output_system_level_files_alt() {
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                sys_tran_output_system_level_files(sys_tran);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject translator_possibly_output_system_level_files() {
        final SubLObject sys_tran = current_system_translation();
        if (NIL != sys_tran) {
            sys_tran_output_system_level_files(sys_tran);
            return T;
        }
        return NIL;
    }

    public static final SubLObject translator_possibly_output_secure_id_database_file_alt() {
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                sys_tran_possibly_output_secure_id_database_file(sys_tran);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject translator_possibly_output_secure_id_database_file() {
        final SubLObject sys_tran = current_system_translation();
        if (NIL != sys_tran) {
            sys_tran_possibly_output_secure_id_database_file(sys_tran);
            return T;
        }
        return NIL;
    }

    public static final SubLObject sys_tran_possibly_note_module_initialization_methods_alt(SubLObject module, SubLObject declare_function, SubLObject init_function, SubLObject setup_function) {
        SubLTrampolineFile.checkType(module, STRINGP);
        SubLTrampolineFile.checkType(declare_function, SYMBOLP);
        SubLTrampolineFile.checkType(init_function, SYMBOLP);
        SubLTrampolineFile.checkType(setup_function, SYMBOLP);
        {
            SubLObject sys_tran = current_system_translation();
            if (NIL != sys_tran) {
                sethash(module, sys_tr_module_initialization_table(sys_tran), list(declare_function, init_function, setup_function));
            }
        }
        return NIL;
    }

    public static SubLObject sys_tran_possibly_note_module_initialization_methods(final SubLObject module, final SubLObject declare_function, final SubLObject init_function, final SubLObject setup_function) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != symbolp(declare_function) : "! symbolp(declare_function) " + ("Types.symbolp(declare_function) " + "CommonSymbols.NIL != Types.symbolp(declare_function) ") + declare_function;
        assert NIL != symbolp(init_function) : "! symbolp(init_function) " + ("Types.symbolp(init_function) " + "CommonSymbols.NIL != Types.symbolp(init_function) ") + init_function;
        assert NIL != symbolp(setup_function) : "! symbolp(setup_function) " + ("Types.symbolp(setup_function) " + "CommonSymbols.NIL != Types.symbolp(setup_function) ") + setup_function;
        final SubLObject sys_tran = current_system_translation();
        if (NIL != sys_tran) {
            sethash(module, sys_tr_module_initialization_table(sys_tran), list(declare_function, init_function, setup_function));
        }
        return NIL;
    }

    public static final SubLObject translate_one_system_alt(SubLObject translation_properties) {
        {
            SubLObject datum = translation_properties;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_3 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt67);
                current_3 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt67);
                if (NIL == member(current_3, $list_alt68, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_3 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt67);
            }
            {
                SubLObject system_tail = property_list_member($SYSTEM, current);
                SubLObject system = (NIL != system_tail) ? ((SubLObject) (cadr(system_tail))) : NIL;
                SubLObject backend_tail = property_list_member($BACKEND, current);
                SubLObject backend = (NIL != backend_tail) ? ((SubLObject) (cadr(backend_tail))) : NIL;
                SubLObject features_tail = property_list_member($FEATURES, current);
                SubLObject features = (NIL != features_tail) ? ((SubLObject) (cadr(features_tail))) : NIL;
                SubLObject security_level_tail = property_list_member($SECURITY_LEVEL, current);
                SubLObject security_level = (NIL != security_level_tail) ? ((SubLObject) (cadr(security_level_tail))) : $NONE;
                SubLObject input_directory_tail = property_list_member($INPUT_DIRECTORY, current);
                SubLObject input_directory = (NIL != input_directory_tail) ? ((SubLObject) (cadr(input_directory_tail))) : NIL;
                SubLObject output_directory_tail = property_list_member($OUTPUT_DIRECTORY, current);
                SubLObject output_directory = (NIL != output_directory_tail) ? ((SubLObject) (cadr(output_directory_tail))) : NIL;
                SubLObject system_manifest_tail = property_list_member($SYSTEM_MANIFEST, current);
                SubLObject system_manifest = (NIL != system_manifest_tail) ? ((SubLObject) (cadr(system_manifest_tail))) : NIL;
                SubLObject sys_tran = new_system_translation(system, backend, features, security_level, input_directory, output_directory, system_manifest);
                sys_tran_initialize_xref_database(sys_tran);
                sys_tran_initialize_module_info(sys_tran);
                sys_tran_initialize_last_translation_time(sys_tran);
                sys_tran_perform_initial_translation(sys_tran);
                return sys_tran;
            }
        }
    }

    public static SubLObject translate_one_system(final SubLObject translation_properties) {
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = translation_properties;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, translation_properties, $list72);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, translation_properties, $list72);
            if (NIL == member(current_$1, $list73, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(translation_properties, $list72);
        }
        final SubLObject system_tail = property_list_member($SYSTEM, translation_properties);
        final SubLObject system = (NIL != system_tail) ? cadr(system_tail) : NIL;
        final SubLObject backend_tail = property_list_member($BACKEND, translation_properties);
        final SubLObject backend = (NIL != backend_tail) ? cadr(backend_tail) : NIL;
        final SubLObject features_tail = property_list_member($FEATURES, translation_properties);
        final SubLObject features = (NIL != features_tail) ? cadr(features_tail) : NIL;
        final SubLObject security_level_tail = property_list_member($SECURITY_LEVEL, translation_properties);
        final SubLObject security_level = (NIL != security_level_tail) ? cadr(security_level_tail) : $NONE;
        final SubLObject input_directory_tail = property_list_member($INPUT_DIRECTORY, translation_properties);
        final SubLObject input_directory = (NIL != input_directory_tail) ? cadr(input_directory_tail) : NIL;
        final SubLObject output_directory_tail = property_list_member($OUTPUT_DIRECTORY, translation_properties);
        final SubLObject output_directory = (NIL != output_directory_tail) ? cadr(output_directory_tail) : NIL;
        final SubLObject system_manifest_tail = property_list_member($SYSTEM_MANIFEST, translation_properties);
        final SubLObject system_manifest = (NIL != system_manifest_tail) ? cadr(system_manifest_tail) : NIL;
        final SubLObject initial_sid_db_tail = property_list_member($INITIAL_SID_DB, translation_properties);
        final SubLObject initial_sid_db = (NIL != initial_sid_db_tail) ? cadr(initial_sid_db_tail) : NIL;
        final SubLObject sys_tran = new_system_translation(system, backend, features, security_level, input_directory, output_directory, system_manifest, initial_sid_db);
        sys_tran_initialize_xref_database(sys_tran);
        sys_tran_initialize_module_info(sys_tran);
        sys_tran_initialize_last_translation_time(sys_tran);
        sys_tran_perform_initial_translation(sys_tran);
        return sys_tran;
    }

    public static final SubLObject sys_tran_initialize_xref_database_alt(SubLObject sys_tran) {
        {
            SubLObject name = sys_tran_system(sys_tran);
            SubLObject features = sys_tran_features(sys_tran);
            SubLObject xrs = xref_database.new_xref_system(name, features);
            _csetf_sys_tr_xref_database(sys_tran, xrs);
        }
        return sys_tran;
    }

    public static SubLObject sys_tran_initialize_xref_database(final SubLObject sys_tran) {
        final SubLObject name = sys_tran_system(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject xrs = xref_database.new_xref_system(name, features);
        _csetf_sys_tr_xref_database(sys_tran, xrs);
        return sys_tran;
    }

    public static final SubLObject sys_tran_initialize_module_info_alt(SubLObject sys_tran) {
        {
            SubLObject system = sys_tran_system(sys_tran);
            SubLObject backend = sys_tran_backend(sys_tran);
            SubLObject features = sys_tran_features(sys_tran);
            SubLObject input_directory = sys_tran_input_directory(sys_tran);
            SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
            SubLObject relevant_module_specs = translator_compute_relevant_modules_from_manifest(system, backend, features, manifest_file);
            SubLObject v_modules = NIL;
            SubLObject cdolist_list_var = relevant_module_specs;
            SubLObject relevant_module_spec = NIL;
            for (relevant_module_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relevant_module_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = relevant_module_spec;
                    SubLObject current = datum;
                    SubLObject module_path = NIL;
                    SubLObject module = NIL;
                    SubLObject module_features = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    module_path = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    module_features = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject input_file = translator_compute_module_input_file(input_directory, module_path, module);
                            SubLObject output_file = sys_tran_compute_module_output_file(sys_tran, module_path, module);
                            sys_tran_note_module_filenames(sys_tran, module, input_file, output_file);
                            sys_tran_note_module_features(sys_tran, module, module_features);
                            v_modules = cons(module, v_modules);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt72);
                    }
                }
            }
            sys_tran_possibly_update_xref_module_features(sys_tran);
            sys_tran_set_modules(sys_tran, nreverse(v_modules));
            return length(relevant_module_specs);
        }
    }

    public static SubLObject sys_tran_initialize_module_info(final SubLObject sys_tran) {
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject input_directory = sys_tran_input_directory(sys_tran);
        final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
        final SubLObject relevant_module_specs = translator_compute_relevant_modules_from_manifest(system, backend, features, manifest_file);
        SubLObject v_modules = NIL;
        SubLObject cdolist_list_var = relevant_module_specs;
        SubLObject relevant_module_spec = NIL;
        relevant_module_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = relevant_module_spec;
            SubLObject module_path = NIL;
            SubLObject module = NIL;
            SubLObject module_features = NIL;
            destructuring_bind_must_consp(current, datum, $list78);
            module_path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            module_features = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject input_file = translator_compute_module_input_file(input_directory, module_path, module);
                final SubLObject output_file = sys_tran_compute_module_output_file(sys_tran, module_path, module);
                sys_tran_note_module_filenames(sys_tran, module, input_file, output_file);
                sys_tran_note_module_features(sys_tran, module, module_features);
                v_modules = cons(module, v_modules);
            } else {
                cdestructuring_bind_error(datum, $list78);
            }
            cdolist_list_var = cdolist_list_var.rest();
            relevant_module_spec = cdolist_list_var.first();
        } 
        sys_tran_possibly_update_xref_module_features(sys_tran);
        sys_tran_set_modules(sys_tran, nreverse(v_modules));
        return length(relevant_module_specs);
    }

    public static final SubLObject translator_compute_relevant_modules_from_manifest_alt(SubLObject system, SubLObject backend, SubLObject features, SubLObject manifest_file) {
        {
            SubLObject manifest = translator_parse_manifest_file(manifest_file);
            SubLObject manifest_system = manifest_system_lookup(manifest, system);
            SubLObject manifest_system_default_path = manifest_system_default_path(manifest_system);
            SubLObject relevant_module_specs = NIL;
            SubLObject cdolist_list_var = manifest_system_modules(manifest_system);
            SubLObject manifest_module = NIL;
            for (manifest_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , manifest_module = cdolist_list_var.first()) {
                if (NIL != manifest_module_features_allowedP(manifest_module, backend, features)) {
                    {
                        SubLObject module_path = manifest_module_path(manifest_system, manifest_module);
                        SubLObject module = manifest_module_name(manifest_module);
                        SubLObject module_features = manifest_module_features(manifest_module);
                        relevant_module_specs = cons(list(module_path, module, module_features), relevant_module_specs);
                    }
                }
            }
            return values(nreverse(relevant_module_specs), manifest_system_default_path);
        }
    }

    public static SubLObject translator_compute_relevant_modules_from_manifest(final SubLObject system, final SubLObject backend, final SubLObject features, final SubLObject manifest_file) {
        final SubLObject manifest = translator_parse_manifest_file(manifest_file);
        final SubLObject manifest_system = manifest_system_lookup(manifest, system);
        final SubLObject manifest_system_default_path = manifest_system_default_path(manifest_system);
        SubLObject relevant_module_specs = NIL;
        SubLObject cdolist_list_var = manifest_system_modules(manifest_system);
        SubLObject manifest_module = NIL;
        manifest_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != manifest_module_features_allowedP(manifest_module, backend, features)) {
                final SubLObject module_path = manifest_module_path(manifest_system, manifest_module);
                final SubLObject module = manifest_module_name(manifest_module);
                final SubLObject module_features = manifest_module_features(manifest_module);
                relevant_module_specs = cons(list(module_path, module, module_features), relevant_module_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            manifest_module = cdolist_list_var.first();
        } 
        return values(nreverse(relevant_module_specs), manifest_system_default_path);
    }

    public static final SubLObject translator_compute_module_input_file_alt(SubLObject input_directory, SubLObject module_path, SubLObject module) {
        return translator_compute_full_filename(input_directory, module_path, module, $$$lisp);
    }

    public static SubLObject translator_compute_module_input_file(final SubLObject input_directory, final SubLObject module_path, final SubLObject module) {
        return translator_compute_full_filename(input_directory, module_path, module, $$$lisp);
    }

    public static final SubLObject sys_tran_compute_module_output_file_alt(SubLObject sys_tran, SubLObject module_path, SubLObject module) {
        {
            SubLObject backend = sys_tran_backend(sys_tran);
            SubLObject security_level = sys_tran_security_level(sys_tran);
            SubLObject output_directory = sys_tran_output_directory(sys_tran);
            SubLObject output_module_path = translate_backend_compute_output_module_path(backend, module_path, security_level);
            SubLObject filename = sys_tran_backend_output_module_filename(sys_tran, backend, module);
            SubLObject extension = translator_backend_output_file_extension(backend);
            return translator_compute_full_filename(output_directory, output_module_path, filename, extension);
        }
    }

    public static SubLObject sys_tran_compute_module_output_file(final SubLObject sys_tran, final SubLObject module_path, final SubLObject module) {
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject security_level = sys_tran_security_level(sys_tran);
        final SubLObject output_directory = sys_tran_output_directory(sys_tran);
        final SubLObject output_module_path = translate_backend_compute_output_module_path(backend, module_path, security_level);
        final SubLObject filename = sys_tran_backend_output_module_filename(sys_tran, backend, module);
        final SubLObject extension = translator_backend_output_file_extension(backend);
        return translator_compute_full_filename(output_directory, output_module_path, filename, extension);
    }

    public static final SubLObject translate_backend_compute_output_module_path_alt(SubLObject backend, SubLObject module_path, SubLObject security_level) {
        {
            SubLObject pcase_var = backend;
            if (pcase_var.eql($SL2C)) {
                if (module_path.equal($list_alt75)) {
                    return NIL;
                }
                return module_path;
            } else {
                if (pcase_var.eql($SL2JAVA)) {
                    if ($NONE != security_level) {
                        module_path = list_utilities.first_n(ONE_INTEGER, module_path);
                    }
                    {
                        SubLObject output_module_path = NIL;
                        SubLObject cdolist_list_var = module_path;
                        SubLObject subdir = NIL;
                        for (subdir = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subdir = cdolist_list_var.first()) {
                            output_module_path = cons(java_backend.java_backend_package_name_for_subdir(subdir), output_module_path);
                        }
                        return nreverse(output_module_path);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject translate_backend_compute_output_module_path(final SubLObject backend, SubLObject module_path, final SubLObject security_level) {
        if (backend.eql($SL2C)) {
            if (module_path.equal($list81)) {
                return NIL;
            }
            return module_path;
        } else {
            if (backend.eql($SL2JAVA)) {
                if ($NONE != security_level) {
                    module_path = list_utilities.first_n(ONE_INTEGER, module_path);
                }
                SubLObject output_module_path = NIL;
                SubLObject cdolist_list_var = module_path;
                SubLObject subdir = NIL;
                subdir = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    output_module_path = cons(java_backend.java_backend_package_name_for_subdir(subdir), output_module_path);
                    cdolist_list_var = cdolist_list_var.rest();
                    subdir = cdolist_list_var.first();
                } 
                return nreverse(output_module_path);
            }
            return NIL;
        }
    }

    public static final SubLObject translator_backend_output_file_extension_alt(SubLObject backend) {
        {
            SubLObject pcase_var = backend;
            if (pcase_var.eql($SL2C)) {
                return $$$c;
            } else {
                if (pcase_var.eql($SL2JAVA)) {
                    return $$$java;
                } else {
                    return Errors.error($str_alt79$Time_to_specify_the_output_file_e, backend);
                }
            }
        }
    }

    public static SubLObject translator_backend_output_file_extension(final SubLObject backend) {
        if (backend.eql($SL2C)) {
            return $$$c;
        }
        if (backend.eql($SL2JAVA)) {
            return $$$java;
        }
        return Errors.error($str85$Time_to_specify_the_output_file_e, backend);
    }

    public static final SubLObject sys_tran_backend_output_module_filename_alt(SubLObject sys_tran, SubLObject backend, SubLObject module) {
        {
            SubLObject secure_module_id = sys_tran_secure_module_id(sys_tran, module);
            SubLObject pcase_var = backend;
            if (pcase_var.eql($SL2C)) {
                return c_backend.c_backend_output_module_filename(module, secure_module_id);
            } else {
                if (pcase_var.eql($SL2JAVA)) {
                    return java_backend_output_module_filename(module, secure_module_id);
                } else {
                    return Errors.error($str_alt80$Time_to_specify_the_output_module, backend);
                }
            }
        }
    }

    public static SubLObject sys_tran_backend_output_module_filename(final SubLObject sys_tran, final SubLObject backend, final SubLObject module) {
        final SubLObject secure_module_id = sys_tran_secure_module_id(sys_tran, module);
        if (backend.eql($SL2C)) {
            return c_backend.c_backend_output_module_filename(module, secure_module_id);
        }
        if (backend.eql($SL2JAVA)) {
            return java_backend_output_module_filename(module, secure_module_id);
        }
        return Errors.error($str86$Time_to_specify_the_output_module, backend);
    }

    public static final SubLObject java_backend_output_module_filename_alt(SubLObject module, SubLObject secure_module_id) {
        if (secure_module_id == UNPROVIDED) {
            secure_module_id = NIL;
        }
        if (NIL != secure_module_id) {
            return format(NIL, $str_alt81$module_4__0D, secure_module_id);
        }
        return nsubstitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(module, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject java_backend_output_module_filename(final SubLObject module, SubLObject secure_module_id) {
        if (secure_module_id == UNPROVIDED) {
            secure_module_id = NIL;
        }
        if (NIL != secure_module_id) {
            return format(NIL, $str87$module_4__0D, secure_module_id);
        }
        return nsubstitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(module, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject translator_compute_full_filename_alt(SubLObject start_directory, SubLObject path_list, SubLObject filename, SubLObject extension) {
        {
            SubLObject file_basic_filename = file_utilities.basic_filename(filename, extension);
            SubLObject file_relative_filename = Strings.string_downcase(file_utilities.reconstruct_path(path_list, file_basic_filename, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject full_filename = file_utilities.relative_filename(start_directory, file_relative_filename, UNPROVIDED);
            return full_filename;
        }
    }

    public static SubLObject translator_compute_full_filename(final SubLObject start_directory, final SubLObject path_list, final SubLObject filename, final SubLObject extension) {
        final SubLObject file_basic_filename = file_utilities.basic_filename(filename, extension);
        final SubLObject file_relative_filename = Strings.string_downcase(file_utilities.reconstruct_path(path_list, file_basic_filename, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject full_filename = file_utilities.relative_filename(start_directory, file_relative_filename, UNPROVIDED);
        return full_filename;
    }

    public static final SubLObject translator_module_feature_expression_match_alt(SubLObject module_features, SubLObject translation_features) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject matchP = NIL;
                {
                    SubLObject _prev_bind_0 = $features$.currentBinding(thread);
                    try {
                        $features$.bind(translation_features, thread);
                        matchP = subl_macros.feature_expression_match(module_features);
                    } finally {
                        $features$.rebind(_prev_bind_0, thread);
                    }
                }
                return matchP;
            }
        }
    }

    public static SubLObject translator_module_feature_expression_match(final SubLObject module_features, final SubLObject translation_features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == module_features) {
            return T;
        }
        SubLObject matchP = NIL;
        final SubLObject _prev_bind_0 = $features$.currentBinding(thread);
        try {
            $features$.bind(translation_features, thread);
            matchP = subl_macros.feature_expression_match(module_features);
        } finally {
            $features$.rebind(_prev_bind_0, thread);
        }
        return matchP;
    }

    public static final SubLObject sys_tran_possibly_update_xref_module_features_alt(SubLObject sys_tran) {
        SubLTrampolineFile.checkType(sys_tran, SYSTEM_TRANSLATION_P);
        {
            SubLObject xrs = sys_tran_xref_database(sys_tran);
            SubLObject cdohash_table = sys_tr_module_features_table(sys_tran);
            SubLObject module = NIL;
            SubLObject module_features = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        module = getEntryKey(cdohash_entry);
                        module_features = getEntryValue(cdohash_entry);
                        xref_database.xrs_possibly_note_module_features(xrs, module, module_features);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sys_tran_possibly_update_xref_module_features(final SubLObject sys_tran) {
        assert NIL != system_translation_p(sys_tran) : "! system_translation.system_translation_p(sys_tran) " + ("system_translation.system_translation_p(sys_tran) " + "CommonSymbols.NIL != system_translation.system_translation_p(sys_tran) ") + sys_tran;
        final SubLObject xrs = sys_tran_xref_database(sys_tran);
        final SubLObject cdohash_table = sys_tr_module_features_table(sys_tran);
        SubLObject module = NIL;
        SubLObject module_features = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                module = getEntryKey(cdohash_entry);
                module_features = getEntryValue(cdohash_entry);
                xref_database.xrs_possibly_note_module_features(xrs, module, module_features);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static final SubLObject sys_tran_trace_format_alt(SubLObject format_control, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            format_nil.force_format($translation_trace_stream$.getDynamicValue(thread), format_control, arg1, arg2, arg3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject sys_tran_trace_format(final SubLObject format_control, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        format_nil.force_format($translation_trace_stream$.getDynamicValue(thread), format_control, arg1, arg2, arg3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Bind a named restart around BODY that allows it to be re-executed
     */
    @LispMethod(comment = "Bind a named restart around BODY that allows it to be re-executed")
    public static final SubLObject with_simple_restart_loop_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject name = NIL;
                    SubLObject format_control = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    format_control = current.first();
                    current = current.rest();
                    {
                        SubLObject format_args = current;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject done = $sym83$DONE;
                            return list(CLET, list(done), list(WHILE, list(CNOT, done), listS(WITH_SIMPLE_RESTART, listS(name, format_control, append(format_args, NIL)), append(body, list(listS(CSETQ, done, $list_alt89))))));
                        }
                    }
                }
            }
        }
    }

    /**
     * Bind a named restart around BODY that allows it to be re-executed
     */
    @LispMethod(comment = "Bind a named restart around BODY that allows it to be re-executed")
    public static SubLObject with_simple_restart_loop(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        SubLObject format_control = NIL;
        destructuring_bind_must_consp(current, datum, $list88);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list88);
        format_control = current.first();
        final SubLObject format_args;
        current = format_args = current.rest();
        final SubLObject body;
        current = body = temp;
        final SubLObject done = $sym89$DONE;
        return list(CLET, list(done), list(WHILE, list(CNOT, done), listS(WITH_SIMPLE_RESTART, listS(name, format_control, append(format_args, NIL)), append(body, list(listS(CSETQ, done, $list95))))));
    }

    public static final SubLObject sys_tran_perform_initial_translation_alt(SubLObject sys_tran) {
        {
            SubLObject system = sys_tran_system(sys_tran);
            SubLObject backend = sys_tran_backend(sys_tran);
            SubLObject features = sys_tran_features(sys_tran);
            SubLObject v_modules = sys_tran_modules(sys_tran);
            sys_tran_trace_format($str_alt90$__Translating__A_to_backend__S_wi, system, backend, features);
            sys_tran_translate_modules(sys_tran, v_modules);
            sys_tran_output_system_level_files(sys_tran);
            sys_tran_possibly_output_secure_id_database_file(sys_tran);
            sys_tran_set_last_translation_time(sys_tran, UNPROVIDED);
            return sys_tran;
        }
    }

    public static SubLObject sys_tran_perform_initial_translation(final SubLObject sys_tran) {
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject v_modules = sys_tran_modules(sys_tran);
        sys_tran_trace_format($str96$__Translating__A_to_backend__S_wi, system, backend, features);
        sys_tran_translate_modules(sys_tran, v_modules);
        sys_tran_output_system_level_files(sys_tran);
        sys_tran_possibly_output_secure_id_database_file(sys_tran);
        sys_tran_set_last_translation_time(sys_tran, UNPROVIDED);
        return sys_tran;
    }

    public static final SubLObject sys_tran_translate_modules_alt(SubLObject sys_tran, SubLObject v_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sys_tran_trace_format($str_alt91$__Pass_1___Populating_XREF_databa, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = $translator_output_enabledP$.currentBinding(thread);
                SubLObject _prev_bind_1 = $translation_trace_stream$.currentBinding(thread);
                SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
                try {
                    $translator_output_enabledP$.bind(NIL, thread);
                    $translation_trace_stream$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
                    Errors.$ignore_warnsP$.bind(T, thread);
                    {
                        SubLObject list_var = v_modules;
                        $progress_note$.setDynamicValue($$$Scanning_modules, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_4 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_5 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2_6 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject module = NIL;
                                    for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        translate_one_system_module(sys_tran, module);
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2_6, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_5, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                    }
                } finally {
                    Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
                    $translation_trace_stream$.rebind(_prev_bind_1, thread);
                    $translator_output_enabledP$.rebind(_prev_bind_0, thread);
                }
            }
            sys_tran_trace_format($str_alt93$__Pass_2___Translating, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = v_modules;
                SubLObject module = NIL;
                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                    translate_one_system_module(sys_tran, module);
                }
            }
            return sys_tran;
        }
    }

    public static SubLObject sys_tran_translate_modules(final SubLObject sys_tran, final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sys_tran_trace_format($str97$__Pass_1___Populating_XREF_databa, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $translator_output_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $translation_trace_stream$.currentBinding(thread);
        final SubLObject _prev_bind_3 = Errors.$ignore_warnsP$.currentBinding(thread);
        try {
            $translator_output_enabledP$.bind(NIL, thread);
            $translation_trace_stream$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            Errors.$ignore_warnsP$.bind(T, thread);
            final SubLObject _prev_bind_0_$2 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$4 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Scanning_modules, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(v_modules), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = v_modules;
                    SubLObject module = NIL;
                    module = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        translate_one_system_module(sys_tran, module);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        module = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_2_$4, thread);
                $progress_start_time$.rebind(_prev_bind_1_$3, thread);
                $progress_note$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            Errors.$ignore_warnsP$.rebind(_prev_bind_3, thread);
            $translation_trace_stream$.rebind(_prev_bind_2, thread);
            $translator_output_enabledP$.rebind(_prev_bind_0, thread);
        }
        sys_tran_trace_format($str100$__Pass_2___Translating, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = v_modules;
        SubLObject module2 = NIL;
        module2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sys_tran_module_output_enabledP(sys_tran, module2)) {
                translate_one_system_module(sys_tran, module2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module2 = cdolist_list_var.first();
        } 
        return sys_tran;
    }

    public static final SubLObject trivial_finger_print_for_module_alt(SubLObject module) {
        return cconcatenate(module, new SubLObject[]{ $str_alt95$_, string_utilities.to_string(get_universal_time()) });
    }

    public static SubLObject trivial_finger_print_for_module(final SubLObject module) {
        return cconcatenate(module, new SubLObject[]{ $str102$_, string_utilities.to_string(get_universal_time()) });
    }

    public static final SubLObject suggest_finger_print_for_module_alt(SubLObject module, SubLObject input_filename, SubLObject features) {
        if (features == UNPROVIDED) {
            features = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject finger_print = NIL;
                SubLObject lines = os_process_utilities.os_process_evaluation_output_strings($external_checksum_algorithm$.getDynamicValue(thread), list(input_filename), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread));
                SubLObject line = lines.first();
                if (line.isString()) {
                    {
                        SubLObject split_point = list_utilities.position_if_not(ALPHANUMERICP, line, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        finger_print = string_utilities.substring(line, ZERO_INTEGER, split_point);
                    }
                }
                if (!finger_print.isString()) {
                    Errors.warn($str_alt97$_A_failed_to_produce_non_trivial_, $external_checksum_algorithm$.getDynamicValue(thread), module, lines);
                    finger_print = trivial_finger_print_for_module(module);
                }
                return finger_print;
            }
        }
    }

    public static SubLObject suggest_finger_print_for_module(final SubLObject module, final SubLObject input_filename, SubLObject features) {
        if (features == UNPROVIDED) {
            features = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject finger_print = NIL;
        final SubLObject lines = os_process_utilities.os_process_evaluation_output_strings($external_checksum_algorithm$.getDynamicValue(thread), list(input_filename), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread));
        final SubLObject line = lines.first();
        if (line.isString()) {
            final SubLObject split_point = list_utilities.position_if_not(ALPHANUMERICP, line, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            finger_print = string_utilities.substring(line, ZERO_INTEGER, split_point);
        }
        if (!finger_print.isString()) {
            Errors.warn($str104$_A_failed_to_produce_non_trivial_, $external_checksum_algorithm$.getDynamicValue(thread), module, lines);
            finger_print = trivial_finger_print_for_module(module);
        }
        return finger_print;
    }

    public static final SubLObject translate_one_module_alt(SubLObject module, SubLObject input_filename, SubLObject output_filename, SubLObject backend, SubLObject features) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, STRINGP);
            SubLTrampolineFile.checkType(input_filename, STRINGP);
            SubLTrampolineFile.checkType(output_filename, STRINGP);
            SubLTrampolineFile.checkType(backend, TRANSLATOR_BACKEND_P);
            {
                SubLObject list_var = features;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, KEYWORDP);
                    }
                }
            }
            format(T, $str_alt101$__translate_one_module__A___A____, new SubLObject[]{ module, input_filename, output_filename });
            {
                SubLObject ts_file = NIL;
                SubLObject successP = NIL;
                SubLObject restart_tag = SKIP;
                SubLObject dummy = NIL;
                {
                    SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding(thread);
                    try {
                        Errors.$restarts$.bind(cons(list(restart_tag, $str_alt103$Skip__S, module), Errors.$restarts$.getDynamicValue(thread)), thread);
                        try {
                            {
                                SubLObject done = NIL;
                                while (NIL == done) {
                                    {
                                        SubLObject restart_tag_7 = RETRANSLATE;
                                        SubLObject dummy_8 = NIL;
                                        {
                                            SubLObject _prev_bind_0_9 = Errors.$restarts$.currentBinding(thread);
                                            try {
                                                Errors.$restarts$.bind(cons(list(restart_tag_7, $str_alt105$Retranslate__S, module), Errors.$restarts$.getDynamicValue(thread)), thread);
                                                try {
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_10 = $features$.currentBinding(thread);
                                                            try {
                                                                $features$.bind(adjoin(backend, features, UNPROVIDED, UNPROVIDED), thread);
                                                                {
                                                                    SubLObject finger_print = NIL;
                                                                    sys_tran_trace_format($str_alt106$___Starting__A_, module, UNPROVIDED, UNPROVIDED);
                                                                    ts_file = file_translation.translate_file(module, input_filename);
                                                                    if (NIL != translator_output_enabled_p()) {
                                                                        if (NIL != $generate_module_fingerprintsP$.getDynamicValue(thread)) {
                                                                            finger_print = suggest_finger_print_for_module(module, input_filename, features);
                                                                        }
                                                                    } else {
                                                                        output_filename = to_output_name(output_filename, backend);
                                                                    }
                                                                    {
                                                                        SubLObject pcase_var = backend;
                                                                        if (pcase_var.eql($SL2C)) {
                                                                            c_backend.c_backend_output_file_and_header_file(ts_file, output_filename, finger_print);
                                                                        } else {
                                                                            if (pcase_var.eql($SL2JAVA)) {
                                                                                java_backend.java_backend_output_file(ts_file, output_filename, finger_print);
                                                                            } else {
                                                                                Errors.error($str_alt100$backend__S_is_not_yet_supported, backend);
                                                                            }
                                                                        }
                                                                    }
                                                                    successP = T;
                                                                }
                                                            } finally {
                                                                $features$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != file_translation.trans_subl_file_p(ts_file)) {
                                                                    file_translation.destroy_trans_subl_file(ts_file);
                                                                }
                                                                sys_tran_trace_format($str_alt107$___Finished__A_, module, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                                            }
                                                        }
                                                    }
                                                    done = T;
                                                } catch (Throwable ccatch_env_var) {
                                                    dummy_8 = Errors.handleThrowable(ccatch_env_var, restart_tag_7);
                                                }
                                            } finally {
                                                Errors.$restarts$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    }
                                } 
                            }
                        } catch (Throwable ccatch_env_var) {
                            dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                        }
                    } finally {
                        Errors.$restarts$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject translate_one_module(final SubLObject module, final SubLObject input_filename, SubLObject output_filename, final SubLObject backend, final SubLObject features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != stringp(input_filename) : "! stringp(input_filename) " + ("Types.stringp(input_filename) " + "CommonSymbols.NIL != Types.stringp(input_filename) ") + input_filename;
        assert NIL != stringp(output_filename) : "! stringp(output_filename) " + ("Types.stringp(output_filename) " + "CommonSymbols.NIL != Types.stringp(output_filename) ") + output_filename;
        assert NIL != translator_backend_p(backend) : "! system_translation.translator_backend_p(backend) " + ("system_translation.translator_backend_p(backend) " + "CommonSymbols.NIL != system_translation.translator_backend_p(backend) ") + backend;
        assert NIL != list_utilities.non_dotted_list_p(features) : "! list_utilities.non_dotted_list_p(features) " + ("list_utilities.non_dotted_list_p(features) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(features) ") + features;
        SubLObject cdolist_list_var = features;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != keywordp(elem) : "! keywordp(elem) " + ("Types.keywordp(elem) " + "CommonSymbols.NIL != Types.keywordp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject ts_file = NIL;
        SubLObject successP = NIL;
        final SubLObject restart_tag = SKIP;
        SubLObject dummy = NIL;
        final SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding(thread);
        try {
            Errors.$restarts$.bind(cons(list(restart_tag, $str106$Skip__S, module), Errors.$restarts$.getDynamicValue(thread)), thread);
            try {
                thread.throwStack.push(restart_tag);
                SubLObject done = NIL;
                while (NIL == done) {
                    final SubLObject restart_tag_$6 = RETRANSLATE;
                    SubLObject dummy_$7 = NIL;
                    final SubLObject _prev_bind_0_$8 = Errors.$restarts$.currentBinding(thread);
                    try {
                        Errors.$restarts$.bind(cons(list(restart_tag_$6, $str108$Retranslate__S, module), Errors.$restarts$.getDynamicValue(thread)), thread);
                        try {
                            thread.throwStack.push(restart_tag_$6);
                            try {
                                final SubLObject _prev_bind_0_$9 = $features$.currentBinding(thread);
                                try {
                                    $features$.bind(adjoin(backend, features, UNPROVIDED, UNPROVIDED), thread);
                                    SubLObject finger_print = NIL;
                                    sys_tran_trace_format($str109$___Starting__A_, module, UNPROVIDED, UNPROVIDED);
                                    ts_file = file_translation.translate_file(module, input_filename);
                                    if (NIL != translator_output_enabled_p()) {
                                        if (NIL != $generate_module_fingerprintsP$.getDynamicValue(thread)) {
                                            finger_print = suggest_finger_print_for_module(module, input_filename, features);
                                        }
                                    } else {
                                        output_filename = $str110$_dev_null;
                                    }
                                    if (backend.eql($SL2C)) {
                                        c_backend.c_backend_output_file_and_header_file(ts_file, output_filename, finger_print);
                                    } else
                                        if (backend.eql($SL2JAVA)) {
                                            java_backend.java_backend_output_file(ts_file, output_filename, finger_print);
                                        } else {
                                            Errors.error($str111$backend__S_is_not_yet_supported, backend);
                                        }

                                    successP = T;
                                } finally {
                                    $features$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != file_translation.trans_subl_file_p(ts_file)) {
                                        file_translation.destroy_trans_subl_file(ts_file);
                                    }
                                    sys_tran_trace_format($str112$___Finished__A_, module, UNPROVIDED, UNPROVIDED);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            done = T;
                        } catch (final Throwable ccatch_env_var) {
                            dummy_$7 = Errors.handleThrowable(ccatch_env_var, restart_tag_$6);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } finally {
                        Errors.$restarts$.rebind(_prev_bind_0_$8, thread);
                    }
                } 
            } catch (final Throwable ccatch_env_var2) {
                dummy = Errors.handleThrowable(ccatch_env_var2, restart_tag);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            Errors.$restarts$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static final SubLObject translate_one_system_module_alt(SubLObject sys_tran, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sys_tran, SYSTEM_TRANSLATION_P);
            SubLTrampolineFile.checkType(module, STRINGP);
            {
                SubLObject backend = sys_tran_backend(sys_tran);
                SubLObject features = sys_tran_features(sys_tran);
                SubLObject input_filename = sys_tran_module_input_filename(sys_tran, module);
                SubLObject output_filename = sys_tran_module_output_filename(sys_tran, module);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $current_system_translation$.currentBinding(thread);
                    try {
                        $current_system_translation$.bind(sys_tran, thread);
                        result = translate_one_module(module, input_filename, output_filename, backend, features);
                    } finally {
                        $current_system_translation$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject translate_one_system_module(final SubLObject sys_tran, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != system_translation_p(sys_tran) : "! system_translation.system_translation_p(sys_tran) " + ("system_translation.system_translation_p(sys_tran) " + "CommonSymbols.NIL != system_translation.system_translation_p(sys_tran) ") + sys_tran;
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject input_filename = sys_tran_module_input_filename(sys_tran, module);
        final SubLObject output_filename = sys_tran_module_output_filename(sys_tran, module);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $current_system_translation$.currentBinding(thread);
        try {
            $current_system_translation$.bind(sys_tran, thread);
            result = translate_one_module(module, input_filename, output_filename, backend, features);
        } finally {
            $current_system_translation$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject translator_parse_manifest_file_alt(SubLObject manifest_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(manifest_file, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == Filesys.probe_file(manifest_file)) {
                    Errors.error($str_alt108$The_manifest_file__S_is_not_avail, manifest_file);
                }
            }
            {
                SubLObject manifest_systems = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(manifest_file, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt110$Unable_to_open__S, manifest_file);
                    }
                    {
                        SubLObject stream_12 = stream;
                        {
                            SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                            try {
                                $package$.bind($sublisp_package$.getGlobalValue(), thread);
                                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                {
                                    SubLObject doneP = NIL;
                                    while (NIL == doneP) {
                                        {
                                            SubLObject system = read_ignoring_errors(stream_12, NIL, $EOF);
                                            if (system == $EOF) {
                                                doneP = T;
                                            } else {
                                                manifest_systems = cons(system, manifest_systems);
                                            }
                                        }
                                    } 
                                }
                            } finally {
                                $read_default_float_format$.rebind(_prev_bind_1, thread);
                                $package$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(manifest_systems);
            }
        }
    }

    public static SubLObject translator_parse_manifest_file(final SubLObject manifest_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(manifest_file) : "! stringp(manifest_file) " + ("Types.stringp(manifest_file) " + "CommonSymbols.NIL != Types.stringp(manifest_file) ") + manifest_file;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Filesys.probe_file(manifest_file))) {
            Errors.error($str113$The_manifest_file__S_is_not_avail, manifest_file);
        }
        SubLObject manifest_systems = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(manifest_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str115$Unable_to_open__S, manifest_file);
            }
            final SubLObject stream_$11 = stream;
            final SubLObject _prev_bind_2 = $package$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $read_default_float_format$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $features$.currentBinding(thread);
            try {
                $package$.bind($sublisp_package$.getGlobalValue(), thread);
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                $features$.bind(remove($COMMON_LISP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                SubLObject doneP = NIL;
                while (NIL == doneP) {
                    final SubLObject system = read_ignoring_errors(stream_$11, NIL, $EOF);
                    if (system == $EOF) {
                        doneP = T;
                    } else {
                        manifest_systems = cons(system, manifest_systems);
                    }
                } 
            } finally {
                $features$.rebind(_prev_bind_4, thread);
                $read_default_float_format$.rebind(_prev_bind_3, thread);
                $package$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return nreverse(manifest_systems);
    }

    public static final SubLObject do_manifest_systems_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject manifest_system_var = NIL;
                    SubLObject manifest = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    manifest_system_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    manifest = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, list(manifest_system_var, manifest), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt113);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_manifest_systems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject manifest_system_var = NIL;
        SubLObject manifest = NIL;
        destructuring_bind_must_consp(current, datum, $list119);
        manifest_system_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        manifest = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(manifest_system_var, manifest), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list119);
        return NIL;
    }

    public static final SubLObject manifest_system_name_alt(SubLObject manifest_system) {
        return second(manifest_system);
    }

    public static SubLObject manifest_system_name(final SubLObject manifest_system) {
        return second(manifest_system);
    }

    public static final SubLObject manifest_system_lookup_alt(SubLObject manifest, SubLObject system) {
        {
            SubLObject cdolist_list_var = manifest;
            SubLObject manifest_system = NIL;
            for (manifest_system = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , manifest_system = cdolist_list_var.first()) {
                if (system.equal(manifest_system_name(manifest_system))) {
                    return manifest_system;
                }
            }
        }
        return NIL;
    }

    public static SubLObject manifest_system_lookup(final SubLObject manifest, final SubLObject system) {
        SubLObject cdolist_list_var = manifest;
        SubLObject manifest_system = NIL;
        manifest_system = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (system.equal(manifest_system_name(manifest_system))) {
                return manifest_system;
            }
            cdolist_list_var = cdolist_list_var.rest();
            manifest_system = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject manifest_system_modules_alt(SubLObject manifest_system) {
        return nthcdr(THREE_INTEGER, manifest_system);
    }

    public static SubLObject manifest_system_modules(final SubLObject manifest_system) {
        return nthcdr(THREE_INTEGER, manifest_system);
    }

    public static final SubLObject manifest_system_default_path_alt(SubLObject manifest_system) {
        return getf(third(manifest_system), $DIRECTORY, NIL);
    }

    public static SubLObject manifest_system_default_path(final SubLObject manifest_system) {
        return getf(third(manifest_system), $DIRECTORY, NIL);
    }

    public static final SubLObject manifest_module_name_alt(SubLObject manifest_module) {
        return manifest_module.first();
    }

    public static SubLObject manifest_module_name(final SubLObject manifest_module) {
        return manifest_module.first();
    }

    public static final SubLObject manifest_module_relative_path_alt(SubLObject manifest_module) {
        return getf(manifest_module.rest(), $DIRECTORY, NIL);
    }

    public static SubLObject manifest_module_relative_path(final SubLObject manifest_module) {
        return getf(manifest_module.rest(), $DIRECTORY, NIL);
    }

    public static final SubLObject manifest_module_features_alt(SubLObject manifest_module) {
        return getf(manifest_module.rest(), $FEATURES, NIL);
    }

    public static SubLObject manifest_module_features(final SubLObject manifest_module) {
        return getf(manifest_module.rest(), $FEATURES, NIL);
    }

    public static final SubLObject manifest_module_path_alt(SubLObject manifest_system, SubLObject manifest_module) {
        {
            SubLObject system_path = manifest_system_default_path(manifest_system);
            SubLObject relative_module_path = manifest_module_relative_path(manifest_module);
            return append(system_path, relative_module_path);
        }
    }

    public static SubLObject manifest_module_path(final SubLObject manifest_system, final SubLObject manifest_module) {
        final SubLObject system_path = manifest_system_default_path(manifest_system);
        final SubLObject relative_module_path = manifest_module_relative_path(manifest_module);
        return append(system_path, relative_module_path);
    }

    public static final SubLObject manifest_module_features_allowedP_alt(SubLObject manifest_module, SubLObject backend, SubLObject features) {
        {
            SubLObject module_features = manifest_module_features(manifest_module);
            if (NIL == module_features) {
                return T;
            } else {
                {
                    SubLObject translation_features = adjoin(backend, features, UNPROVIDED, UNPROVIDED);
                    return translator_module_feature_expression_match(module_features, translation_features);
                }
            }
        }
    }

    public static SubLObject manifest_module_features_allowedP(final SubLObject manifest_module, final SubLObject backend, final SubLObject features) {
        final SubLObject module_features = manifest_module_features(manifest_module);
        final SubLObject translation_features = adjoin(backend, features, UNPROVIDED, UNPROVIDED);
        return translator_module_feature_expression_match(module_features, translation_features);
    }

    public static final SubLObject translator_regenerate_manifest_file_alt(SubLObject manifest_file) {
        if (NIL != string_utilities.ends_with(manifest_file, $str_alt116$system_manifest_lisp, UNPROVIDED)) {
            return translator_generate_manifest_file(manifest_file);
        }
        return NIL;
    }

    public static SubLObject translator_regenerate_manifest_file(final SubLObject manifest_file) {
        if (NIL != string_utilities.ends_with(manifest_file, $str122$system_manifest_lisp, UNPROVIDED)) {
            return translator_generate_manifest_file(manifest_file);
        }
        return NIL;
    }

    public static final SubLObject translator_generate_manifest_file_alt(SubLObject manifest_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(manifest_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt110$Unable_to_open__S, manifest_file);
                    }
                    {
                        SubLObject stream_13 = stream;
                        translator_generate_manifest_to_stream(stream_13);
                        successP = T;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject translator_generate_manifest_file(final SubLObject manifest_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(manifest_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str115$Unable_to_open__S, manifest_file);
            }
            final SubLObject stream_$12 = stream;
            translator_generate_manifest_to_stream(stream_$12);
            successP = T;
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return successP;
    }

    public static final SubLObject translator_generate_manifest_to_stream_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(stream, STREAMP);
            {
                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    write_string($str_alt119$________Mode__LISP__Package__SUBL, stream, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject systems_for_manifest = $list_alt120;
                        SubLObject cdolist_list_var = systems_for_manifest;
                        SubLObject system = NIL;
                        for (system = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , system = cdolist_list_var.first()) {
                            terpri(stream);
                            terpri(stream);
                            translator_generate_manifest_system_to_stream(system, stream);
                        }
                    }
                    terpri(stream);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject translator_generate_manifest_to_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            write_string($str125$________Mode__LISP__Package__SUBL, stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject systems_for_manifest = cdolist_list_var = $list126;
            SubLObject system = NIL;
            system = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terpri(stream);
                terpri(stream);
                translator_generate_manifest_system_to_stream(system, stream);
                cdolist_list_var = cdolist_list_var.rest();
                system = cdolist_list_var.first();
            } 
            terpri(stream);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject translator_generate_manifest_system_to_stream_alt(SubLObject system, SubLObject stream) {
        format(stream, $str_alt121$_);
        format(stream, $str_alt122$_system__S, system);
        format(stream, $str_alt123$____);
        {
            SubLObject directory = translator_system_directory(system);
            format(stream, $str_alt124$_____directory__S, directory);
        }
        {
            SubLObject v_package = translator_system_package(system);
            format(stream, $str_alt125$_____package____S, v_package);
        }
        {
            SubLObject required_systems = translator_system_required_systems(system);
            format(stream, $str_alt126$_____required_systems_);
            format(stream, $str_alt121$_);
            {
                SubLObject list_var = NIL;
                SubLObject required_system = NIL;
                SubLObject index = NIL;
                for (list_var = required_systems, required_system = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , required_system = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        format(stream, $str_alt127$_);
                    }
                    format(stream, $str_alt128$_S, required_system);
                }
            }
            format(stream, $str_alt129$_);
        }
        format(stream, $str_alt130$____);
        {
            SubLObject module_specs = translator_system_module_specs(system);
            SubLObject cdolist_list_var = translator_system_module_specs(system);
            SubLObject module_spec = NIL;
            for (module_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = module_spec;
                    SubLObject current = datum;
                    SubLObject module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt131);
                    module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_14 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt131);
                            current_14 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt131);
                            if (NIL == member(current_14, $list_alt132, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_14 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt131);
                        }
                        {
                            SubLObject directory_tail = property_list_member($DIRECTORY, current);
                            SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : NIL;
                            SubLObject features_tail = property_list_member($FEATURES, current);
                            SubLObject features = (NIL != features_tail) ? ((SubLObject) (cadr(features_tail))) : NIL;
                            format(stream, $str_alt133$_____S, module);
                            if (NIL != directory) {
                                format(stream, $str_alt134$__directory__S, directory);
                            }
                            if (NIL != features) {
                                format(stream, $str_alt135$__features__S, features);
                            }
                            format(stream, $str_alt129$_);
                        }
                    }
                }
            }
            format(stream, $str_alt136$___);
            return length(module_specs);
        }
    }

    public static SubLObject translator_generate_manifest_system_to_stream(final SubLObject system, final SubLObject stream) {
        format(stream, $str127$_);
        format(stream, $str128$_system__S, system);
        format(stream, $str129$____);
        final SubLObject directory = translator_system_directory(system);
        format(stream, $str130$_____directory__S, directory);
        final SubLObject v_package = translator_system_package(system);
        format(stream, $str131$_____package____S, v_package);
        final SubLObject required_systems = translator_system_required_systems(system);
        format(stream, $str132$_____required_systems_);
        format(stream, $str127$_);
        SubLObject list_var = NIL;
        SubLObject required_system = NIL;
        SubLObject index = NIL;
        list_var = required_systems;
        required_system = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , required_system = list_var.first() , index = add(ONE_INTEGER, index)) {
            if (!index.isZero()) {
                format(stream, $str133$_);
            }
            format(stream, $str134$_S, required_system);
        }
        format(stream, $str135$_);
        format(stream, $str136$____);
        final SubLObject module_specs = translator_system_module_specs(system);
        SubLObject cdolist_list_var = translator_system_module_specs(system);
        SubLObject module_spec = NIL;
        module_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_spec;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list137);
            module = current.first();
            current = current.rest();
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$13 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list137);
                current_$13 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list137);
                if (NIL == member(current_$13, $list138, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$13 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list137);
            }
            final SubLObject directory_tail = property_list_member($DIRECTORY, current);
            final SubLObject directory2 = (NIL != directory_tail) ? cadr(directory_tail) : NIL;
            final SubLObject features_tail = property_list_member($FEATURES, current);
            final SubLObject features = (NIL != features_tail) ? cadr(features_tail) : NIL;
            format(stream, $str139$_____S, module);
            if (NIL != directory2) {
                format(stream, $str140$__directory__S, directory2);
            }
            if (NIL != features) {
                format(stream, $str141$__features__S, features);
            }
            format(stream, $str135$_);
            cdolist_list_var = cdolist_list_var.rest();
            module_spec = cdolist_list_var.first();
        } 
        format(stream, $str142$___);
        return length(module_specs);
    }

    public static final SubLObject translator_system_module_specs_alt(SubLObject system) {
        {
            SubLObject module_specs = NIL;
            SubLObject cdolist_list_var = translator_system_modules(system);
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                {
                    SubLObject directory = translator_system_module_directory(system, module);
                    SubLObject features = translator_system_module_features(system, module);
                    module_specs = cons(bq_cons(module, append(NIL != directory ? ((SubLObject) (list($DIRECTORY, directory))) : NIL, NIL != features ? ((SubLObject) (list($FEATURES, features))) : NIL, NIL)), module_specs);
                }
            }
            return nreverse(module_specs);
        }
    }

    public static SubLObject translator_system_module_specs(final SubLObject system) {
        SubLObject module_specs = NIL;
        SubLObject cdolist_list_var = translator_system_modules(system);
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject directory = translator_system_module_directory(system, module);
            final SubLObject features = translator_system_module_features(system, module);
            module_specs = cons(bq_cons(module, append(NIL != directory ? list($DIRECTORY, directory) : NIL, NIL != features ? list($FEATURES, features) : NIL, NIL)), module_specs);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return nreverse(module_specs);
    }

    public static final SubLObject translator_system_directory_alt(SubLObject system) {
        return Errors.error($str_alt137$TRANSLATOR_SYSTEM_DIRECTORY_is_un);
    }

    public static SubLObject translator_system_directory(final SubLObject system) {
        return Errors.error($str143$TRANSLATOR_SYSTEM_DIRECTORY_is_un);
    }

    public static final SubLObject translator_system_package_alt(SubLObject system) {
        return Errors.error($str_alt138$TRANSLATOR_SYSTEM_PACKAGE_is_unim);
    }

    public static SubLObject translator_system_package(final SubLObject system) {
        return Errors.error($str144$TRANSLATOR_SYSTEM_PACKAGE_is_unim);
    }

    public static final SubLObject translator_system_required_systems_alt(SubLObject system) {
        return Errors.error($str_alt139$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM);
    }

    public static SubLObject translator_system_required_systems(final SubLObject system) {
        return Errors.error($str145$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM);
    }

    public static final SubLObject translator_system_modules_alt(SubLObject system) {
        return Errors.error($str_alt140$TRANSLATOR_SYSTEM_MODULES_is_unim);
    }

    public static SubLObject translator_system_modules(final SubLObject system) {
        return Errors.error($str146$TRANSLATOR_SYSTEM_MODULES_is_unim);
    }

    public static final SubLObject translator_system_module_directory_alt(SubLObject system, SubLObject module) {
        return Errors.error($str_alt141$TRANSLATOR_SYSTEM_MODULE_DIRECTOR);
    }

    public static SubLObject translator_system_module_directory(final SubLObject system, final SubLObject module) {
        return Errors.error($str147$TRANSLATOR_SYSTEM_MODULE_DIRECTOR);
    }

    public static final SubLObject translator_system_module_features_alt(SubLObject system, SubLObject module) {
        return Errors.error($str_alt142$TRANSLATOR_SYSTEM_MODULE_FEATURES);
    }

    public static SubLObject translator_system_module_features(final SubLObject system, final SubLObject module) {
        return Errors.error($str148$TRANSLATOR_SYSTEM_MODULE_FEATURES);
    }

    public static final SubLObject untransformed_feature_symbol_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (NIL != v_object)) && (!v_object.isKeyword()));
    }

    public static SubLObject untransformed_feature_symbol_p(final SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (NIL != v_object)) && (!v_object.isKeyword()));
    }

    public static final SubLObject transform_feature_symbol_alt(SubLObject symbol) {
        return make_keyword(symbol_name(symbol));
    }

    public static SubLObject transform_feature_symbol(final SubLObject symbol) {
        return make_keyword(symbol_name(symbol));
    }

    public static final SubLObject sys_tran_output_system_level_files_alt(SubLObject sys_tran) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject system = sys_tran_system(sys_tran);
                SubLObject backend = sys_tran_backend(sys_tran);
                SubLObject features = sys_tran_features(sys_tran);
                SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
                SubLObject output_directory = sys_tran_output_directory(sys_tran);
                SubLObject init_functions = sys_tran_all_init_functions(sys_tran);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $current_system_translation$.currentBinding(thread);
                    try {
                        $current_system_translation$.bind(sys_tran, thread);
                        {
                            SubLObject pcase_var = backend;
                            if (pcase_var.eql($SL2C)) {
                                if (!system.equal($$$SUBLISP)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject directory_module_map = translator_system_directory_module_map(system, backend, features, manifest_file);
                                        SubLObject module_paths = thread.secondMultipleValue();
                                        SubLObject system_default_path = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        result = c_backend.c_backend_output_system_level_files(system, output_directory, system_default_path, init_functions, module_paths, directory_module_map);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($SL2JAVA)) {
                                    java_backend.java_backend_output_system_level_files(sys_tran, UNPROVIDED);
                                } else {
                                    Errors.error($str_alt100$backend__S_is_not_yet_supported, backend);
                                }
                            }
                        }
                    } finally {
                        $current_system_translation$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sys_tran_output_system_level_files(final SubLObject sys_tran) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system = sys_tran_system(sys_tran);
        final SubLObject backend = sys_tran_backend(sys_tran);
        final SubLObject features = sys_tran_features(sys_tran);
        final SubLObject manifest_file = sys_tran_manifest_file(sys_tran);
        final SubLObject output_directory = sys_tran_output_directory(sys_tran);
        final SubLObject init_functions = sys_tran_all_init_functions(sys_tran);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $current_system_translation$.currentBinding(thread);
        try {
            $current_system_translation$.bind(sys_tran, thread);
            final SubLObject pcase_var = backend;
            if (pcase_var.eql($SL2C)) {
                if (!system.equal($$$SUBLISP)) {
                    thread.resetMultipleValues();
                    final SubLObject directory_module_map = translator_system_directory_module_map(system, backend, features, manifest_file);
                    final SubLObject module_paths = thread.secondMultipleValue();
                    final SubLObject system_default_path = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = c_backend.c_backend_output_system_level_files(system, output_directory, system_default_path, init_functions, module_paths, directory_module_map);
                }
            } else
                if (pcase_var.eql($SL2JAVA)) {
                    java_backend.java_backend_output_system_level_files(sys_tran, UNPROVIDED);
                } else {
                    Errors.error($str111$backend__S_is_not_yet_supported, backend);
                }

        } finally {
            $current_system_translation$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Save out the active secure id database state, if the translation is
     * a secure one.
     *
     * @return BOOLEANP -- T if the save took place, NIL otherwise
     */
    @LispMethod(comment = "Save out the active secure id database state, if the translation is\r\na secure one.\r\n\r\n@return BOOLEANP -- T if the save took place, NIL otherwise\nSave out the active secure id database state, if the translation is\na secure one.")
    public static final SubLObject sys_tran_possibly_output_secure_id_database_file_alt(SubLObject sys_tran) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            {
                SubLObject output_directory = sys_tran_output_directory(sys_tran);
                SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
                SubLObject sid_db_file = cconcatenate(output_directory, $default_secure_id_database_filename$.getGlobalValue());
                secure_translation.save_secure_id_database_to_file(sid_db, sid_db_file);
            }
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Save out the active secure id database state, if the translation is\r\na secure one.\r\n\r\n@return BOOLEANP -- T if the save took place, NIL otherwise\nSave out the active secure id database state, if the translation is\na secure one.")
    public static SubLObject sys_tran_possibly_output_secure_id_database_file(final SubLObject sys_tran) {
        if (NIL != sys_tran_secureP(sys_tran)) {
            final SubLObject output_directory = sys_tran_output_directory(sys_tran);
            final SubLObject sid_db = sys_tran_secure_id_database(sys_tran);
            final SubLObject sid_db_file = cconcatenate(output_directory, $default_secure_id_database_filename$.getGlobalValue());
            secure_translation.save_secure_id_database_to_file(sid_db, sid_db_file);
            return T;
        }
        return NIL;
    }

    public static final SubLObject translator_system_directory_module_map_alt(SubLObject system, SubLObject backend, SubLObject features, SubLObject manifest_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject module_specs = translator_compute_relevant_modules_from_manifest(system, backend, features, manifest_file);
                SubLObject system_default_path = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject system_prefix_length = length(system_default_path);
                    SubLObject system_relative_module_specs = NIL;
                    SubLObject directory_modules_map = NIL;
                    {
                        SubLObject cdolist_list_var = module_specs;
                        SubLObject module_spec = NIL;
                        for (module_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_spec = cdolist_list_var.first()) {
                            {
                                SubLObject datum = module_spec;
                                SubLObject current = datum;
                                SubLObject module_path = NIL;
                                SubLObject module = NIL;
                                SubLObject module_features = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt72);
                                module_path = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt72);
                                module = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt72);
                                module_features = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    module_path = nthcdr(system_prefix_length, module_path);
                                    system_relative_module_specs = cons(list(module_path, module), system_relative_module_specs);
                                    {
                                        SubLObject existing = find(module_path, directory_modules_map, symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                                        if (NIL == existing) {
                                            existing = list(module_path, NIL);
                                            directory_modules_map = cons(existing, directory_modules_map);
                                        }
                                        set_nth(ONE_INTEGER, existing, cons(module, nth(ONE_INTEGER, existing)));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt72);
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = directory_modules_map;
                        SubLObject directory_module_info = NIL;
                        for (directory_module_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , directory_module_info = cdolist_list_var.first()) {
                            {
                                SubLObject datum = directory_module_info;
                                SubLObject current = datum;
                                SubLObject module_path = NIL;
                                SubLObject v_modules = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt146);
                                module_path = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt146);
                                v_modules = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    set_nth(ONE_INTEGER, directory_module_info, nreverse(v_modules));
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt146);
                                }
                            }
                        }
                    }
                    directory_modules_map = nreverse(directory_modules_map);
                    system_relative_module_specs = nreverse(system_relative_module_specs);
                    return values(directory_modules_map, system_relative_module_specs, system_default_path);
                }
            }
        }
    }

    public static SubLObject translator_system_directory_module_map(final SubLObject system, final SubLObject backend, final SubLObject features, final SubLObject manifest_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject module_specs = translator_compute_relevant_modules_from_manifest(system, backend, features, manifest_file);
        final SubLObject system_default_path = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject system_prefix_length = length(system_default_path);
        SubLObject system_relative_module_specs = NIL;
        SubLObject directory_modules_map = NIL;
        SubLObject cdolist_list_var = module_specs;
        SubLObject module_spec = NIL;
        module_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_spec;
            SubLObject module_path = NIL;
            SubLObject module = NIL;
            SubLObject module_features = NIL;
            destructuring_bind_must_consp(current, datum, $list78);
            module_path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            module_features = current.first();
            current = current.rest();
            if (NIL == current) {
                module_path = nthcdr(system_prefix_length, module_path);
                system_relative_module_specs = cons(list(module_path, module), system_relative_module_specs);
                SubLObject existing = find(module_path, directory_modules_map, symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                if (NIL == existing) {
                    existing = list(module_path, NIL);
                    directory_modules_map = cons(existing, directory_modules_map);
                }
                set_nth(ONE_INTEGER, existing, cons(module, nth(ONE_INTEGER, existing)));
            } else {
                cdestructuring_bind_error(datum, $list78);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_spec = cdolist_list_var.first();
        } 
        cdolist_list_var = directory_modules_map;
        SubLObject directory_module_info = NIL;
        directory_module_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = directory_module_info;
            SubLObject module_path = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list152);
            module_path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list152);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                set_nth(ONE_INTEGER, directory_module_info, nreverse(v_modules));
            } else {
                cdestructuring_bind_error(datum, $list152);
            }
            cdolist_list_var = cdolist_list_var.rest();
            directory_module_info = cdolist_list_var.first();
        } 
        directory_modules_map = nreverse(directory_modules_map);
        system_relative_module_specs = nreverse(system_relative_module_specs);
        return values(directory_modules_map, system_relative_module_specs, system_default_path);
    }

    public static final SubLObject translator_libraries_from_directory_module_map_alt(SubLObject system, SubLObject directory_module_map) {
        {
            SubLObject libraries = NIL;
            SubLObject cdolist_list_var = directory_module_map;
            SubLObject module_map_info = NIL;
            for (module_map_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_map_info = cdolist_list_var.first()) {
                {
                    SubLObject datum = module_map_info;
                    SubLObject current = datum;
                    SubLObject module_path = NIL;
                    SubLObject v_modules = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt146);
                    module_path = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt146);
                    v_modules = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject library = (NIL != module_path) ? ((SubLObject) (list_utilities.last_one(module_path))) : system;
                            libraries = cons(library, libraries);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt146);
                    }
                }
            }
            return nreverse(libraries);
        }
    }

    public static SubLObject translator_libraries_from_directory_module_map(final SubLObject system, final SubLObject directory_module_map) {
        SubLObject libraries = NIL;
        SubLObject cdolist_list_var = directory_module_map;
        SubLObject module_map_info = NIL;
        module_map_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_map_info;
            SubLObject module_path = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list152);
            module_path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list152);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject library = (NIL != module_path) ? list_utilities.last_one(module_path) : system;
                libraries = cons(library, libraries);
            } else {
                cdestructuring_bind_error(datum, $list152);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_map_info = cdolist_list_var.first();
        } 
        return nreverse(libraries);
    }

    public static final SubLObject translator_paths_from_directory_module_map_alt(SubLObject directory_module_map) {
        {
            SubLObject final_module_paths = NIL;
            SubLObject intermediate_paths = NIL;
            {
                SubLObject cdolist_list_var = directory_module_map;
                SubLObject module_map_info = NIL;
                for (module_map_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_map_info = cdolist_list_var.first()) {
                    {
                        SubLObject datum = module_map_info;
                        SubLObject current = datum;
                        SubLObject module_path = NIL;
                        SubLObject v_modules = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt146);
                        module_path = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt146);
                        v_modules = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != module_path) {
                                {
                                    SubLObject item_var = module_path;
                                    if (NIL == member(item_var, final_module_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        final_module_paths = cons(item_var, final_module_paths);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt146);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = final_module_paths;
                SubLObject final_module_path = NIL;
                for (final_module_path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , final_module_path = cdolist_list_var.first()) {
                    {
                        SubLObject cdotimes_end_var = length(final_module_path);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            {
                                SubLObject intermediate_path = subseq(final_module_path, ZERO_INTEGER, number_utilities.f_1X(i));
                                SubLObject item_var = intermediate_path;
                                if (NIL == member(item_var, intermediate_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    intermediate_paths = cons(item_var, intermediate_paths);
                                }
                            }
                        }
                    }
                }
            }
            return kb_utilities.sort_terms(intermediate_paths, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject translator_paths_from_directory_module_map(final SubLObject directory_module_map) {
        SubLObject final_module_paths = NIL;
        SubLObject intermediate_paths = NIL;
        SubLObject cdolist_list_var = directory_module_map;
        SubLObject module_map_info = NIL;
        module_map_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = module_map_info;
            SubLObject module_path = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list152);
            module_path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list152);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != module_path) {
                    final SubLObject item_var = module_path;
                    if (NIL == member(item_var, final_module_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        final_module_paths = cons(item_var, final_module_paths);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list152);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_map_info = cdolist_list_var.first();
        } 
        cdolist_list_var = final_module_paths;
        SubLObject final_module_path = NIL;
        final_module_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject item_var2;
            SubLObject intermediate_path;
            for (cdotimes_end_var = length(final_module_path), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                intermediate_path = item_var2 = subseq(final_module_path, ZERO_INTEGER, number_utilities.f_1X(i));
                if (NIL == member(item_var2, intermediate_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    intermediate_paths = cons(item_var2, intermediate_paths);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            final_module_path = cdolist_list_var.first();
        } 
        return kb_utilities.sort_terms(intermediate_paths, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject retranslate_modules_alt(SubLObject v_modules) {
        {
            SubLObject sys_tran = current_system_translation();
            sys_tran_translate_modules(sys_tran, v_modules);
            sys_tran_possibly_output_secure_id_database_file(sys_tran);
            return v_modules;
        }
    }

    public static SubLObject retranslate_modules(final SubLObject v_modules) {
        final SubLObject sys_tran = current_system_translation();
        sys_tran_translate_modules(sys_tran, v_modules);
        sys_tran_possibly_output_secure_id_database_file(sys_tran);
        return v_modules;
    }

    public static final SubLObject module_damaged_wrt_introspectionP_alt(SubLObject module) {
        {
            SubLObject damagedP = NIL;
            if (NIL == damagedP) {
                {
                    SubLObject csome_list_var = xref_database.xref_methods_defined_by_module(module);
                    SubLObject method = NIL;
                    for (method = csome_list_var.first(); !((NIL != damagedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , method = csome_list_var.first()) {
                        if (NIL != fboundp(method)) {
                            if (!method.isMacroOperator()) {
                                {
                                    SubLObject error = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                            try {
                                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                                try {
                                                    subl_promotions.function_symbol_arglist(method);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                rebind(Errors.$error_handler$, _prev_bind_0);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error) {
                                        damagedP = method;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return damagedP;
        }
    }

    public static SubLObject module_damaged_wrt_introspectionP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject damagedP = NIL;
        if (NIL == damagedP) {
            SubLObject csome_list_var = xref_database.xref_methods_defined_by_module(module);
            SubLObject method = NIL;
            method = csome_list_var.first();
            while ((NIL == damagedP) && (NIL != csome_list_var)) {
                if ((NIL != fboundp(method)) && (!method.isMacroOperator())) {
                    SubLObject error = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                subl_promotions.function_symbol_arglist(method);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error) {
                        damagedP = method;
                    }
                }
                csome_list_var = csome_list_var.rest();
                method = csome_list_var.first();
            } 
        }
        return damagedP;
    }

    public static final SubLObject test_translate_and_output_form_alt(SubLObject form, SubLObject backend, SubLObject stream, SubLObject translation_features) {
        if (backend == UNPROVIDED) {
            backend = $SL2C;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (translation_features == UNPROVIDED) {
            translation_features = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject translated_form = form_translation.test_translate_form(form, backend, translation_features);
                {
                    SubLObject _prev_bind_0 = $features$.currentBinding(thread);
                    try {
                        $features$.bind(adjoin(backend, translation_features, UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject pcase_var = backend;
                            if (pcase_var.eql($SL2C)) {
                                c_backend.c_backend_test_translate_write_form(translated_form, stream, ZERO_INTEGER);
                            } else {
                                if (pcase_var.eql($SL2JAVA)) {
                                    java_backend.java_backend_test_translate_write_form(translated_form, stream, ZERO_INTEGER);
                                } else {
                                    Errors.error($str_alt148$Unsupported_backend____S, backend);
                                }
                            }
                        }
                    } finally {
                        $features$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject test_translate_and_output_form(final SubLObject form, SubLObject backend, SubLObject stream, SubLObject translation_features) {
        if (backend == UNPROVIDED) {
            backend = $SL2C;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (translation_features == UNPROVIDED) {
            translation_features = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject translated_form = form_translation.test_translate_form(form, backend, translation_features);
        final SubLObject _prev_bind_0 = $features$.currentBinding(thread);
        try {
            $features$.bind(adjoin(backend, translation_features, UNPROVIDED, UNPROVIDED), thread);
            final SubLObject pcase_var = backend;
            if (pcase_var.eql($SL2C)) {
                c_backend.c_backend_test_translate_write_form(translated_form, stream, ZERO_INTEGER);
            } else
                if (pcase_var.eql($SL2JAVA)) {
                    java_backend.java_backend_test_translate_write_form(translated_form, stream, ZERO_INTEGER);
                } else {
                    Errors.error($str154$Unsupported_backend____S, backend);
                }

        } finally {
            $features$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject test_translate_and_output_form_to_string_alt(SubLObject form, SubLObject backend, SubLObject translation_features) {
        if (backend == UNPROVIDED) {
            backend = $SL2C;
        }
        if (translation_features == UNPROVIDED) {
            translation_features = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                test_translate_and_output_form(form, backend, stream, translation_features);
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject test_translate_and_output_form_to_string(final SubLObject form, SubLObject backend, SubLObject translation_features) {
        if (backend == UNPROVIDED) {
            backend = $SL2C;
        }
        if (translation_features == UNPROVIDED) {
            translation_features = NIL;
        }
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            test_translate_and_output_form(form, backend, stream, translation_features);
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject declare_system_translation_file_alt() {
        declareFunction("translator_output_enabled_p", "TRANSLATOR-OUTPUT-ENABLED-P", 0, 0, false);
        declareFunction("translator_backend_p", "TRANSLATOR-BACKEND-P", 1, 0, false);
        declareFunction("current_system_translation", "CURRENT-SYSTEM-TRANSLATION", 0, 0, false);
        declareFunction("current_system_translation_secureP", "CURRENT-SYSTEM-TRANSLATION-SECURE?", 0, 0, false);
        declareFunction("current_system_translation_security_level", "CURRENT-SYSTEM-TRANSLATION-SECURITY-LEVEL", 0, 0, false);
        declareFunction("system_translation_print_function_trampoline", "SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("system_translation_p", "SYSTEM-TRANSLATION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.system_translation.$system_translation_p$UnaryFunction();
        declareFunction("sys_tr_system", "SYS-TR-SYSTEM", 1, 0, false);
        declareFunction("sys_tr_backend", "SYS-TR-BACKEND", 1, 0, false);
        declareFunction("sys_tr_features", "SYS-TR-FEATURES", 1, 0, false);
        declareFunction("sys_tr_input_directory", "SYS-TR-INPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tr_output_directory", "SYS-TR-OUTPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tr_manifest_file", "SYS-TR-MANIFEST-FILE", 1, 0, false);
        declareFunction("sys_tr_modules", "SYS-TR-MODULES", 1, 0, false);
        declareFunction("sys_tr_module_filename_table", "SYS-TR-MODULE-FILENAME-TABLE", 1, 0, false);
        declareFunction("sys_tr_module_features_table", "SYS-TR-MODULE-FEATURES-TABLE", 1, 0, false);
        declareFunction("sys_tr_module_initialization_table", "SYS-TR-MODULE-INITIALIZATION-TABLE", 1, 0, false);
        declareFunction("sys_tr_xref_database", "SYS-TR-XREF-DATABASE", 1, 0, false);
        declareFunction("sys_tr_secure_id_database", "SYS-TR-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction("sys_tr_last_translation_time", "SYS-TR-LAST-TRANSLATION-TIME", 1, 0, false);
        declareFunction("_csetf_sys_tr_system", "_CSETF-SYS-TR-SYSTEM", 2, 0, false);
        declareFunction("_csetf_sys_tr_backend", "_CSETF-SYS-TR-BACKEND", 2, 0, false);
        declareFunction("_csetf_sys_tr_features", "_CSETF-SYS-TR-FEATURES", 2, 0, false);
        declareFunction("_csetf_sys_tr_input_directory", "_CSETF-SYS-TR-INPUT-DIRECTORY", 2, 0, false);
        declareFunction("_csetf_sys_tr_output_directory", "_CSETF-SYS-TR-OUTPUT-DIRECTORY", 2, 0, false);
        declareFunction("_csetf_sys_tr_manifest_file", "_CSETF-SYS-TR-MANIFEST-FILE", 2, 0, false);
        declareFunction("_csetf_sys_tr_modules", "_CSETF-SYS-TR-MODULES", 2, 0, false);
        declareFunction("_csetf_sys_tr_module_filename_table", "_CSETF-SYS-TR-MODULE-FILENAME-TABLE", 2, 0, false);
        declareFunction("_csetf_sys_tr_module_features_table", "_CSETF-SYS-TR-MODULE-FEATURES-TABLE", 2, 0, false);
        declareFunction("_csetf_sys_tr_module_initialization_table", "_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE", 2, 0, false);
        declareFunction("_csetf_sys_tr_xref_database", "_CSETF-SYS-TR-XREF-DATABASE", 2, 0, false);
        declareFunction("_csetf_sys_tr_secure_id_database", "_CSETF-SYS-TR-SECURE-ID-DATABASE", 2, 0, false);
        declareFunction("_csetf_sys_tr_last_translation_time", "_CSETF-SYS-TR-LAST-TRANSLATION-TIME", 2, 0, false);
        declareFunction("make_system_translation", "MAKE-SYSTEM-TRANSLATION", 0, 1, false);
        declareFunction("print_system_translation", "PRINT-SYSTEM-TRANSLATION", 3, 0, false);
        declareFunction("new_system_translation", "NEW-SYSTEM-TRANSLATION", 7, 0, false);
        declareFunction("destroy_system_translation", "DESTROY-SYSTEM-TRANSLATION", 1, 0, false);
        declareFunction("sys_tran_system", "SYS-TRAN-SYSTEM", 1, 0, false);
        declareFunction("sys_tran_backend", "SYS-TRAN-BACKEND", 1, 0, false);
        declareFunction("sys_tran_features", "SYS-TRAN-FEATURES", 1, 0, false);
        declareFunction("sys_tran_input_directory", "SYS-TRAN-INPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tran_output_directory", "SYS-TRAN-OUTPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tran_manifest_file", "SYS-TRAN-MANIFEST-FILE", 1, 0, false);
        declareFunction("sys_tran_xref_database", "SYS-TRAN-XREF-DATABASE", 1, 0, false);
        declareFunction("sys_tran_secure_id_database", "SYS-TRAN-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction("sys_tran_modules", "SYS-TRAN-MODULES", 1, 0, false);
        declareFunction("sys_tran_set_modules", "SYS-TRAN-SET-MODULES", 2, 0, false);
        declareFunction("sys_tran_set_last_translation_time", "SYS-TRAN-SET-LAST-TRANSLATION-TIME", 1, 1, false);
        declareFunction("sys_tran_security_level", "SYS-TRAN-SECURITY-LEVEL", 1, 0, false);
        declareFunction("sys_tran_secureP", "SYS-TRAN-SECURE?", 1, 0, false);
        declareFunction("sys_tran_includes_moduleP", "SYS-TRAN-INCLUDES-MODULE?", 2, 0, false);
        declareFunction("sys_tran_module_input_filename", "SYS-TRAN-MODULE-INPUT-FILENAME", 2, 0, false);
        declareFunction("sys_tran_module_output_filename", "SYS-TRAN-MODULE-OUTPUT-FILENAME", 2, 0, false);
        declareFunction("sys_tran_relative_input_filename", "SYS-TRAN-RELATIVE-INPUT-FILENAME", 2, 0, false);
        declareFunction("sys_tran_module_features", "SYS-TRAN-MODULE-FEATURES", 2, 0, false);
        declareFunction("sys_tran_module_declare_function", "SYS-TRAN-MODULE-DECLARE-FUNCTION", 2, 0, false);
        declareFunction("sys_tran_module_init_function", "SYS-TRAN-MODULE-INIT-FUNCTION", 2, 0, false);
        declareFunction("sys_tran_module_setup_function", "SYS-TRAN-MODULE-SETUP-FUNCTION", 2, 0, false);
        declareFunction("sys_tran_all_init_functions", "SYS-TRAN-ALL-INIT-FUNCTIONS", 1, 0, false);
        declareFunction("sys_tran_system_default_path", "SYS-TRAN-SYSTEM-DEFAULT-PATH", 1, 0, false);
        declareFunction("sys_tran_secure_module_id", "SYS-TRAN-SECURE-MODULE-ID", 2, 0, false);
        declareFunction("sys_tran_secure_method_id", "SYS-TRAN-SECURE-METHOD-ID", 2, 0, false);
        declareFunction("sys_tran_secure_global_id", "SYS-TRAN-SECURE-GLOBAL-ID", 2, 0, false);
        declareFunction("sys_tran_secure_symbol_name", "SYS-TRAN-SECURE-SYMBOL-NAME", 2, 0, false);
        declareFunction("current_system_translation_secure_symbol_name", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-NAME", 1, 0, false);
        declareFunction("sys_tran_note_module_filenames", "SYS-TRAN-NOTE-MODULE-FILENAMES", 4, 0, false);
        declareFunction("sys_tran_note_module_features", "SYS-TRAN-NOTE-MODULE-FEATURES", 3, 0, false);
        declareFunction("sys_tran_initialize_last_translation_time", "SYS-TRAN-INITIALIZE-LAST-TRANSLATION-TIME", 1, 0, false);
        declareFunction("translator_possibly_update_current_system_modules", "TRANSLATOR-POSSIBLY-UPDATE-CURRENT-SYSTEM-MODULES", 0, 0, false);
        declareFunction("translator_possibly_translate_one_module", "TRANSLATOR-POSSIBLY-TRANSLATE-ONE-MODULE", 1, 0, false);
        declareFunction("translator_possibly_output_system_level_files", "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES", 0, 0, false);
        declareFunction("translator_possibly_output_secure_id_database_file", "TRANSLATOR-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 0, 0, false);
        declareFunction("sys_tran_possibly_note_module_initialization_methods", "SYS-TRAN-POSSIBLY-NOTE-MODULE-INITIALIZATION-METHODS", 4, 0, false);
        declareFunction("translate_one_system", "TRANSLATE-ONE-SYSTEM", 1, 0, false);
        declareFunction("sys_tran_initialize_xref_database", "SYS-TRAN-INITIALIZE-XREF-DATABASE", 1, 0, false);
        declareFunction("sys_tran_initialize_module_info", "SYS-TRAN-INITIALIZE-MODULE-INFO", 1, 0, false);
        declareFunction("translator_compute_relevant_modules_from_manifest", "TRANSLATOR-COMPUTE-RELEVANT-MODULES-FROM-MANIFEST", 4, 0, false);
        declareFunction("translator_compute_module_input_file", "TRANSLATOR-COMPUTE-MODULE-INPUT-FILE", 3, 0, false);
        declareFunction("sys_tran_compute_module_output_file", "SYS-TRAN-COMPUTE-MODULE-OUTPUT-FILE", 3, 0, false);
        declareFunction("translate_backend_compute_output_module_path", "TRANSLATE-BACKEND-COMPUTE-OUTPUT-MODULE-PATH", 3, 0, false);
        declareFunction("translator_backend_output_file_extension", "TRANSLATOR-BACKEND-OUTPUT-FILE-EXTENSION", 1, 0, false);
        declareFunction("sys_tran_backend_output_module_filename", "SYS-TRAN-BACKEND-OUTPUT-MODULE-FILENAME", 3, 0, false);
        declareFunction("java_backend_output_module_filename", "JAVA-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false);
        declareFunction("translator_compute_full_filename", "TRANSLATOR-COMPUTE-FULL-FILENAME", 4, 0, false);
        declareFunction("translator_module_feature_expression_match", "TRANSLATOR-MODULE-FEATURE-EXPRESSION-MATCH", 2, 0, false);
        declareFunction("sys_tran_possibly_update_xref_module_features", "SYS-TRAN-POSSIBLY-UPDATE-XREF-MODULE-FEATURES", 1, 0, false);
        declareFunction("sys_tran_trace_format", "SYS-TRAN-TRACE-FORMAT", 1, 3, false);
        declareMacro("with_simple_restart_loop", "WITH-SIMPLE-RESTART-LOOP");
        declareFunction("sys_tran_perform_initial_translation", "SYS-TRAN-PERFORM-INITIAL-TRANSLATION", 1, 0, false);
        declareFunction("sys_tran_translate_modules", "SYS-TRAN-TRANSLATE-MODULES", 2, 0, false);
        declareFunction("trivial_finger_print_for_module", "TRIVIAL-FINGER-PRINT-FOR-MODULE", 1, 0, false);
        declareFunction("suggest_finger_print_for_module", "SUGGEST-FINGER-PRINT-FOR-MODULE", 2, 1, false);
        declareFunction("to_output_name", "TO-OUTPUT-NAME", 2, 0, false);
        declareFunction("translate_one_module", "TRANSLATE-ONE-MODULE", 5, 0, false);
        declareFunction("translate_one_system_module", "TRANSLATE-ONE-SYSTEM-MODULE", 2, 0, false);
        declareFunction("translator_parse_manifest_file", "TRANSLATOR-PARSE-MANIFEST-FILE", 1, 0, false);
        declareMacro("do_manifest_systems", "DO-MANIFEST-SYSTEMS");
        declareFunction("manifest_system_name", "MANIFEST-SYSTEM-NAME", 1, 0, false);
        declareFunction("manifest_system_lookup", "MANIFEST-SYSTEM-LOOKUP", 2, 0, false);
        declareFunction("manifest_system_modules", "MANIFEST-SYSTEM-MODULES", 1, 0, false);
        declareFunction("manifest_system_default_path", "MANIFEST-SYSTEM-DEFAULT-PATH", 1, 0, false);
        declareFunction("manifest_module_name", "MANIFEST-MODULE-NAME", 1, 0, false);
        declareFunction("manifest_module_relative_path", "MANIFEST-MODULE-RELATIVE-PATH", 1, 0, false);
        declareFunction("manifest_module_features", "MANIFEST-MODULE-FEATURES", 1, 0, false);
        declareFunction("manifest_module_path", "MANIFEST-MODULE-PATH", 2, 0, false);
        declareFunction("manifest_module_features_allowedP", "MANIFEST-MODULE-FEATURES-ALLOWED?", 3, 0, false);
        declareFunction("translator_regenerate_manifest_file", "TRANSLATOR-REGENERATE-MANIFEST-FILE", 1, 0, false);
        declareFunction("translator_generate_manifest_file", "TRANSLATOR-GENERATE-MANIFEST-FILE", 1, 0, false);
        declareFunction("translator_generate_manifest_to_stream", "TRANSLATOR-GENERATE-MANIFEST-TO-STREAM", 1, 0, false);
        declareFunction("translator_generate_manifest_system_to_stream", "TRANSLATOR-GENERATE-MANIFEST-SYSTEM-TO-STREAM", 2, 0, false);
        declareFunction("translator_system_module_specs", "TRANSLATOR-SYSTEM-MODULE-SPECS", 1, 0, false);
        declareFunction("translator_system_directory", "TRANSLATOR-SYSTEM-DIRECTORY", 1, 0, false);
        declareFunction("translator_system_package", "TRANSLATOR-SYSTEM-PACKAGE", 1, 0, false);
        declareFunction("translator_system_required_systems", "TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS", 1, 0, false);
        declareFunction("translator_system_modules", "TRANSLATOR-SYSTEM-MODULES", 1, 0, false);
        declareFunction("translator_system_module_directory", "TRANSLATOR-SYSTEM-MODULE-DIRECTORY", 2, 0, false);
        declareFunction("translator_system_module_features", "TRANSLATOR-SYSTEM-MODULE-FEATURES", 2, 0, false);
        declareFunction("untransformed_feature_symbol_p", "UNTRANSFORMED-FEATURE-SYMBOL-P", 1, 0, false);
        declareFunction("transform_feature_symbol", "TRANSFORM-FEATURE-SYMBOL", 1, 0, false);
        declareFunction("sys_tran_output_system_level_files", "SYS-TRAN-OUTPUT-SYSTEM-LEVEL-FILES", 1, 0, false);
        declareFunction("sys_tran_possibly_output_secure_id_database_file", "SYS-TRAN-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 1, 0, false);
        declareFunction("translator_system_directory_module_map", "TRANSLATOR-SYSTEM-DIRECTORY-MODULE-MAP", 4, 0, false);
        declareFunction("translator_libraries_from_directory_module_map", "TRANSLATOR-LIBRARIES-FROM-DIRECTORY-MODULE-MAP", 2, 0, false);
        declareFunction("translator_paths_from_directory_module_map", "TRANSLATOR-PATHS-FROM-DIRECTORY-MODULE-MAP", 1, 0, false);
        declareFunction("retranslate_modules", "RETRANSLATE-MODULES", 1, 0, false);
        declareFunction("module_damaged_wrt_introspectionP", "MODULE-DAMAGED-WRT-INTROSPECTION?", 1, 0, false);
        declareFunction("test_translate_and_output_form", "TEST-TRANSLATE-AND-OUTPUT-FORM", 1, 3, false);
        declareFunction("test_translate_and_output_form_to_string", "TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING", 1, 2, false);
        return NIL;
    }

    public static SubLObject declare_system_translation_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("translator_output_enabled_p", "TRANSLATOR-OUTPUT-ENABLED-P", 0, 0, false);
            declareFunction("translator_backend_p", "TRANSLATOR-BACKEND-P", 1, 0, false);
            declareFunction("current_system_translation", "CURRENT-SYSTEM-TRANSLATION", 0, 0, false);
            declareFunction("current_system_translation_secureP", "CURRENT-SYSTEM-TRANSLATION-SECURE?", 0, 0, false);
            declareFunction("current_system_translation_security_level", "CURRENT-SYSTEM-TRANSLATION-SECURITY-LEVEL", 0, 0, false);
            declareFunction("system_translation_print_function_trampoline", "SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("system_translation_p", "SYSTEM-TRANSLATION-P", 1, 0, false);
            new system_translation.$system_translation_p$UnaryFunction();
            declareFunction("sys_tr_system", "SYS-TR-SYSTEM", 1, 0, false);
            declareFunction("sys_tr_backend", "SYS-TR-BACKEND", 1, 0, false);
            declareFunction("sys_tr_features", "SYS-TR-FEATURES", 1, 0, false);
            declareFunction("sys_tr_input_directory", "SYS-TR-INPUT-DIRECTORY", 1, 0, false);
            declareFunction("sys_tr_output_directory", "SYS-TR-OUTPUT-DIRECTORY", 1, 0, false);
            declareFunction("sys_tr_manifest_file", "SYS-TR-MANIFEST-FILE", 1, 0, false);
            declareFunction("sys_tr_modules", "SYS-TR-MODULES", 1, 0, false);
            declareFunction("sys_tr_module_filename_table", "SYS-TR-MODULE-FILENAME-TABLE", 1, 0, false);
            declareFunction("sys_tr_module_features_table", "SYS-TR-MODULE-FEATURES-TABLE", 1, 0, false);
            declareFunction("sys_tr_module_initialization_table", "SYS-TR-MODULE-INITIALIZATION-TABLE", 1, 0, false);
            declareFunction("sys_tr_xref_database", "SYS-TR-XREF-DATABASE", 1, 0, false);
            declareFunction("sys_tr_secure_id_database", "SYS-TR-SECURE-ID-DATABASE", 1, 0, false);
            declareFunction("sys_tr_last_translation_time", "SYS-TR-LAST-TRANSLATION-TIME", 1, 0, false);
            declareFunction("_csetf_sys_tr_system", "_CSETF-SYS-TR-SYSTEM", 2, 0, false);
            declareFunction("_csetf_sys_tr_backend", "_CSETF-SYS-TR-BACKEND", 2, 0, false);
            declareFunction("_csetf_sys_tr_features", "_CSETF-SYS-TR-FEATURES", 2, 0, false);
            declareFunction("_csetf_sys_tr_input_directory", "_CSETF-SYS-TR-INPUT-DIRECTORY", 2, 0, false);
            declareFunction("_csetf_sys_tr_output_directory", "_CSETF-SYS-TR-OUTPUT-DIRECTORY", 2, 0, false);
            declareFunction("_csetf_sys_tr_manifest_file", "_CSETF-SYS-TR-MANIFEST-FILE", 2, 0, false);
            declareFunction("_csetf_sys_tr_modules", "_CSETF-SYS-TR-MODULES", 2, 0, false);
            declareFunction("_csetf_sys_tr_module_filename_table", "_CSETF-SYS-TR-MODULE-FILENAME-TABLE", 2, 0, false);
            declareFunction("_csetf_sys_tr_module_features_table", "_CSETF-SYS-TR-MODULE-FEATURES-TABLE", 2, 0, false);
            declareFunction("_csetf_sys_tr_module_initialization_table", "_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE", 2, 0, false);
            declareFunction("_csetf_sys_tr_xref_database", "_CSETF-SYS-TR-XREF-DATABASE", 2, 0, false);
            declareFunction("_csetf_sys_tr_secure_id_database", "_CSETF-SYS-TR-SECURE-ID-DATABASE", 2, 0, false);
            declareFunction("_csetf_sys_tr_last_translation_time", "_CSETF-SYS-TR-LAST-TRANSLATION-TIME", 2, 0, false);
            declareFunction("make_system_translation", "MAKE-SYSTEM-TRANSLATION", 0, 1, false);
            declareFunction("visit_defstruct_system_translation", "VISIT-DEFSTRUCT-SYSTEM-TRANSLATION", 2, 0, false);
            declareFunction("visit_defstruct_object_system_translation_method", "VISIT-DEFSTRUCT-OBJECT-SYSTEM-TRANSLATION-METHOD", 2, 0, false);
            declareFunction("print_system_translation", "PRINT-SYSTEM-TRANSLATION", 3, 0, false);
            declareFunction("new_system_translation", "NEW-SYSTEM-TRANSLATION", 8, 0, false);
            declareFunction("destroy_system_translation", "DESTROY-SYSTEM-TRANSLATION", 1, 0, false);
            declareFunction("sys_tran_system", "SYS-TRAN-SYSTEM", 1, 0, false);
            declareFunction("sys_tran_backend", "SYS-TRAN-BACKEND", 1, 0, false);
            declareFunction("sys_tran_features", "SYS-TRAN-FEATURES", 1, 0, false);
            declareFunction("sys_tran_input_directory", "SYS-TRAN-INPUT-DIRECTORY", 1, 0, false);
            declareFunction("sys_tran_output_directory", "SYS-TRAN-OUTPUT-DIRECTORY", 1, 0, false);
            declareFunction("sys_tran_manifest_file", "SYS-TRAN-MANIFEST-FILE", 1, 0, false);
            declareFunction("sys_tran_xref_database", "SYS-TRAN-XREF-DATABASE", 1, 0, false);
            declareFunction("sys_tran_secure_id_database", "SYS-TRAN-SECURE-ID-DATABASE", 1, 0, false);
            declareFunction("sys_tran_modules", "SYS-TRAN-MODULES", 1, 0, false);
            declareFunction("sys_tran_set_modules", "SYS-TRAN-SET-MODULES", 2, 0, false);
            declareFunction("sys_tran_set_last_translation_time", "SYS-TRAN-SET-LAST-TRANSLATION-TIME", 1, 1, false);
            declareFunction("sys_tran_security_level", "SYS-TRAN-SECURITY-LEVEL", 1, 0, false);
            declareFunction("sys_tran_secureP", "SYS-TRAN-SECURE?", 1, 0, false);
            declareFunction("sys_tran_includes_moduleP", "SYS-TRAN-INCLUDES-MODULE?", 2, 0, false);
            declareFunction("sys_tran_module_input_filename", "SYS-TRAN-MODULE-INPUT-FILENAME", 2, 0, false);
            declareFunction("sys_tran_module_output_filename", "SYS-TRAN-MODULE-OUTPUT-FILENAME", 2, 0, false);
            declareFunction("sys_tran_relative_input_filename", "SYS-TRAN-RELATIVE-INPUT-FILENAME", 2, 0, false);
            declareFunction("sys_tran_module_features", "SYS-TRAN-MODULE-FEATURES", 2, 0, false);
            declareFunction("sys_tran_module_output_enabledP", "SYS-TRAN-MODULE-OUTPUT-ENABLED?", 2, 0, false);
            declareFunction("sys_tran_module_declare_function", "SYS-TRAN-MODULE-DECLARE-FUNCTION", 2, 0, false);
            declareFunction("sys_tran_module_init_function", "SYS-TRAN-MODULE-INIT-FUNCTION", 2, 0, false);
            declareFunction("sys_tran_module_setup_function", "SYS-TRAN-MODULE-SETUP-FUNCTION", 2, 0, false);
            declareFunction("sys_tran_all_init_functions", "SYS-TRAN-ALL-INIT-FUNCTIONS", 1, 0, false);
            declareFunction("sys_tran_system_default_path", "SYS-TRAN-SYSTEM-DEFAULT-PATH", 1, 0, false);
            declareFunction("sys_tran_secure_module_id", "SYS-TRAN-SECURE-MODULE-ID", 2, 0, false);
            declareFunction("sys_tran_secure_method_id", "SYS-TRAN-SECURE-METHOD-ID", 2, 0, false);
            declareFunction("sys_tran_secure_global_id", "SYS-TRAN-SECURE-GLOBAL-ID", 2, 0, false);
            declareFunction("sys_tran_secure_symbol_name", "SYS-TRAN-SECURE-SYMBOL-NAME", 2, 0, false);
            declareFunction("current_system_translation_secure_symbol_name", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-NAME", 1, 0, false);
            declareFunction("sys_tran_note_module_filenames", "SYS-TRAN-NOTE-MODULE-FILENAMES", 4, 0, false);
            declareFunction("sys_tran_note_module_features", "SYS-TRAN-NOTE-MODULE-FEATURES", 3, 0, false);
            declareFunction("sys_tran_initialize_last_translation_time", "SYS-TRAN-INITIALIZE-LAST-TRANSLATION-TIME", 1, 0, false);
            declareFunction("translator_possibly_update_current_system_modules", "TRANSLATOR-POSSIBLY-UPDATE-CURRENT-SYSTEM-MODULES", 0, 0, false);
            declareFunction("translator_possibly_translate_one_module", "TRANSLATOR-POSSIBLY-TRANSLATE-ONE-MODULE", 1, 0, false);
            declareFunction("translator_possibly_output_system_level_files", "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES", 0, 0, false);
            declareFunction("translator_possibly_output_secure_id_database_file", "TRANSLATOR-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 0, 0, false);
            declareFunction("sys_tran_possibly_note_module_initialization_methods", "SYS-TRAN-POSSIBLY-NOTE-MODULE-INITIALIZATION-METHODS", 4, 0, false);
            declareFunction("translate_one_system", "TRANSLATE-ONE-SYSTEM", 1, 0, false);
            declareFunction("sys_tran_initialize_xref_database", "SYS-TRAN-INITIALIZE-XREF-DATABASE", 1, 0, false);
            declareFunction("sys_tran_initialize_module_info", "SYS-TRAN-INITIALIZE-MODULE-INFO", 1, 0, false);
            declareFunction("translator_compute_relevant_modules_from_manifest", "TRANSLATOR-COMPUTE-RELEVANT-MODULES-FROM-MANIFEST", 4, 0, false);
            declareFunction("translator_compute_module_input_file", "TRANSLATOR-COMPUTE-MODULE-INPUT-FILE", 3, 0, false);
            declareFunction("sys_tran_compute_module_output_file", "SYS-TRAN-COMPUTE-MODULE-OUTPUT-FILE", 3, 0, false);
            declareFunction("translate_backend_compute_output_module_path", "TRANSLATE-BACKEND-COMPUTE-OUTPUT-MODULE-PATH", 3, 0, false);
            declareFunction("translator_backend_output_file_extension", "TRANSLATOR-BACKEND-OUTPUT-FILE-EXTENSION", 1, 0, false);
            declareFunction("sys_tran_backend_output_module_filename", "SYS-TRAN-BACKEND-OUTPUT-MODULE-FILENAME", 3, 0, false);
            declareFunction("java_backend_output_module_filename", "JAVA-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false);
            declareFunction("translator_compute_full_filename", "TRANSLATOR-COMPUTE-FULL-FILENAME", 4, 0, false);
            declareFunction("translator_module_feature_expression_match", "TRANSLATOR-MODULE-FEATURE-EXPRESSION-MATCH", 2, 0, false);
            declareFunction("sys_tran_possibly_update_xref_module_features", "SYS-TRAN-POSSIBLY-UPDATE-XREF-MODULE-FEATURES", 1, 0, false);
            declareFunction("sys_tran_trace_format", "SYS-TRAN-TRACE-FORMAT", 1, 3, false);
            declareMacro("with_simple_restart_loop", "WITH-SIMPLE-RESTART-LOOP");
            declareFunction("sys_tran_perform_initial_translation", "SYS-TRAN-PERFORM-INITIAL-TRANSLATION", 1, 0, false);
            declareFunction("sys_tran_translate_modules", "SYS-TRAN-TRANSLATE-MODULES", 2, 0, false);
            declareFunction("trivial_finger_print_for_module", "TRIVIAL-FINGER-PRINT-FOR-MODULE", 1, 0, false);
            declareFunction("suggest_finger_print_for_module", "SUGGEST-FINGER-PRINT-FOR-MODULE", 2, 1, false);
            declareFunction("translate_one_module", "TRANSLATE-ONE-MODULE", 5, 0, false);
            declareFunction("translate_one_system_module", "TRANSLATE-ONE-SYSTEM-MODULE", 2, 0, false);
            declareFunction("translator_parse_manifest_file", "TRANSLATOR-PARSE-MANIFEST-FILE", 1, 0, false);
            declareMacro("do_manifest_systems", "DO-MANIFEST-SYSTEMS");
            declareFunction("manifest_system_name", "MANIFEST-SYSTEM-NAME", 1, 0, false);
            declareFunction("manifest_system_lookup", "MANIFEST-SYSTEM-LOOKUP", 2, 0, false);
            declareFunction("manifest_system_modules", "MANIFEST-SYSTEM-MODULES", 1, 0, false);
            declareFunction("manifest_system_default_path", "MANIFEST-SYSTEM-DEFAULT-PATH", 1, 0, false);
            declareFunction("manifest_module_name", "MANIFEST-MODULE-NAME", 1, 0, false);
            declareFunction("manifest_module_relative_path", "MANIFEST-MODULE-RELATIVE-PATH", 1, 0, false);
            declareFunction("manifest_module_features", "MANIFEST-MODULE-FEATURES", 1, 0, false);
            declareFunction("manifest_module_path", "MANIFEST-MODULE-PATH", 2, 0, false);
            declareFunction("manifest_module_features_allowedP", "MANIFEST-MODULE-FEATURES-ALLOWED?", 3, 0, false);
            declareFunction("translator_regenerate_manifest_file", "TRANSLATOR-REGENERATE-MANIFEST-FILE", 1, 0, false);
            declareFunction("translator_generate_manifest_file", "TRANSLATOR-GENERATE-MANIFEST-FILE", 1, 0, false);
            declareFunction("translator_generate_manifest_to_stream", "TRANSLATOR-GENERATE-MANIFEST-TO-STREAM", 1, 0, false);
            declareFunction("translator_generate_manifest_system_to_stream", "TRANSLATOR-GENERATE-MANIFEST-SYSTEM-TO-STREAM", 2, 0, false);
            declareFunction("translator_system_module_specs", "TRANSLATOR-SYSTEM-MODULE-SPECS", 1, 0, false);
            declareFunction("translator_system_directory", "TRANSLATOR-SYSTEM-DIRECTORY", 1, 0, false);
            declareFunction("translator_system_package", "TRANSLATOR-SYSTEM-PACKAGE", 1, 0, false);
            declareFunction("translator_system_required_systems", "TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS", 1, 0, false);
            declareFunction("translator_system_modules", "TRANSLATOR-SYSTEM-MODULES", 1, 0, false);
            declareFunction("translator_system_module_directory", "TRANSLATOR-SYSTEM-MODULE-DIRECTORY", 2, 0, false);
            declareFunction("translator_system_module_features", "TRANSLATOR-SYSTEM-MODULE-FEATURES", 2, 0, false);
            declareFunction("untransformed_feature_symbol_p", "UNTRANSFORMED-FEATURE-SYMBOL-P", 1, 0, false);
            declareFunction("transform_feature_symbol", "TRANSFORM-FEATURE-SYMBOL", 1, 0, false);
            declareFunction("sys_tran_output_system_level_files", "SYS-TRAN-OUTPUT-SYSTEM-LEVEL-FILES", 1, 0, false);
            declareFunction("sys_tran_possibly_output_secure_id_database_file", "SYS-TRAN-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 1, 0, false);
            declareFunction("translator_system_directory_module_map", "TRANSLATOR-SYSTEM-DIRECTORY-MODULE-MAP", 4, 0, false);
            declareFunction("translator_libraries_from_directory_module_map", "TRANSLATOR-LIBRARIES-FROM-DIRECTORY-MODULE-MAP", 2, 0, false);
            declareFunction("translator_paths_from_directory_module_map", "TRANSLATOR-PATHS-FROM-DIRECTORY-MODULE-MAP", 1, 0, false);
            declareFunction("retranslate_modules", "RETRANSLATE-MODULES", 1, 0, false);
            declareFunction("module_damaged_wrt_introspectionP", "MODULE-DAMAGED-WRT-INTROSPECTION?", 1, 0, false);
            declareFunction("test_translate_and_output_form", "TEST-TRANSLATE-AND-OUTPUT-FORM", 1, 3, false);
            declareFunction("test_translate_and_output_form_to_string", "TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING", 1, 2, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("new_system_translation", "NEW-SYSTEM-TRANSLATION", 7, 0, false);
            declareFunction("to_output_name", "TO-OUTPUT-NAME", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_system_translation_file_Previous() {
        declareFunction("translator_output_enabled_p", "TRANSLATOR-OUTPUT-ENABLED-P", 0, 0, false);
        declareFunction("translator_backend_p", "TRANSLATOR-BACKEND-P", 1, 0, false);
        declareFunction("current_system_translation", "CURRENT-SYSTEM-TRANSLATION", 0, 0, false);
        declareFunction("current_system_translation_secureP", "CURRENT-SYSTEM-TRANSLATION-SECURE?", 0, 0, false);
        declareFunction("current_system_translation_security_level", "CURRENT-SYSTEM-TRANSLATION-SECURITY-LEVEL", 0, 0, false);
        declareFunction("system_translation_print_function_trampoline", "SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("system_translation_p", "SYSTEM-TRANSLATION-P", 1, 0, false);
        new system_translation.$system_translation_p$UnaryFunction();
        declareFunction("sys_tr_system", "SYS-TR-SYSTEM", 1, 0, false);
        declareFunction("sys_tr_backend", "SYS-TR-BACKEND", 1, 0, false);
        declareFunction("sys_tr_features", "SYS-TR-FEATURES", 1, 0, false);
        declareFunction("sys_tr_input_directory", "SYS-TR-INPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tr_output_directory", "SYS-TR-OUTPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tr_manifest_file", "SYS-TR-MANIFEST-FILE", 1, 0, false);
        declareFunction("sys_tr_modules", "SYS-TR-MODULES", 1, 0, false);
        declareFunction("sys_tr_module_filename_table", "SYS-TR-MODULE-FILENAME-TABLE", 1, 0, false);
        declareFunction("sys_tr_module_features_table", "SYS-TR-MODULE-FEATURES-TABLE", 1, 0, false);
        declareFunction("sys_tr_module_initialization_table", "SYS-TR-MODULE-INITIALIZATION-TABLE", 1, 0, false);
        declareFunction("sys_tr_xref_database", "SYS-TR-XREF-DATABASE", 1, 0, false);
        declareFunction("sys_tr_secure_id_database", "SYS-TR-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction("sys_tr_last_translation_time", "SYS-TR-LAST-TRANSLATION-TIME", 1, 0, false);
        declareFunction("_csetf_sys_tr_system", "_CSETF-SYS-TR-SYSTEM", 2, 0, false);
        declareFunction("_csetf_sys_tr_backend", "_CSETF-SYS-TR-BACKEND", 2, 0, false);
        declareFunction("_csetf_sys_tr_features", "_CSETF-SYS-TR-FEATURES", 2, 0, false);
        declareFunction("_csetf_sys_tr_input_directory", "_CSETF-SYS-TR-INPUT-DIRECTORY", 2, 0, false);
        declareFunction("_csetf_sys_tr_output_directory", "_CSETF-SYS-TR-OUTPUT-DIRECTORY", 2, 0, false);
        declareFunction("_csetf_sys_tr_manifest_file", "_CSETF-SYS-TR-MANIFEST-FILE", 2, 0, false);
        declareFunction("_csetf_sys_tr_modules", "_CSETF-SYS-TR-MODULES", 2, 0, false);
        declareFunction("_csetf_sys_tr_module_filename_table", "_CSETF-SYS-TR-MODULE-FILENAME-TABLE", 2, 0, false);
        declareFunction("_csetf_sys_tr_module_features_table", "_CSETF-SYS-TR-MODULE-FEATURES-TABLE", 2, 0, false);
        declareFunction("_csetf_sys_tr_module_initialization_table", "_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE", 2, 0, false);
        declareFunction("_csetf_sys_tr_xref_database", "_CSETF-SYS-TR-XREF-DATABASE", 2, 0, false);
        declareFunction("_csetf_sys_tr_secure_id_database", "_CSETF-SYS-TR-SECURE-ID-DATABASE", 2, 0, false);
        declareFunction("_csetf_sys_tr_last_translation_time", "_CSETF-SYS-TR-LAST-TRANSLATION-TIME", 2, 0, false);
        declareFunction("make_system_translation", "MAKE-SYSTEM-TRANSLATION", 0, 1, false);
        declareFunction("visit_defstruct_system_translation", "VISIT-DEFSTRUCT-SYSTEM-TRANSLATION", 2, 0, false);
        declareFunction("visit_defstruct_object_system_translation_method", "VISIT-DEFSTRUCT-OBJECT-SYSTEM-TRANSLATION-METHOD", 2, 0, false);
        declareFunction("print_system_translation", "PRINT-SYSTEM-TRANSLATION", 3, 0, false);
        declareFunction("new_system_translation", "NEW-SYSTEM-TRANSLATION", 8, 0, false);
        declareFunction("destroy_system_translation", "DESTROY-SYSTEM-TRANSLATION", 1, 0, false);
        declareFunction("sys_tran_system", "SYS-TRAN-SYSTEM", 1, 0, false);
        declareFunction("sys_tran_backend", "SYS-TRAN-BACKEND", 1, 0, false);
        declareFunction("sys_tran_features", "SYS-TRAN-FEATURES", 1, 0, false);
        declareFunction("sys_tran_input_directory", "SYS-TRAN-INPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tran_output_directory", "SYS-TRAN-OUTPUT-DIRECTORY", 1, 0, false);
        declareFunction("sys_tran_manifest_file", "SYS-TRAN-MANIFEST-FILE", 1, 0, false);
        declareFunction("sys_tran_xref_database", "SYS-TRAN-XREF-DATABASE", 1, 0, false);
        declareFunction("sys_tran_secure_id_database", "SYS-TRAN-SECURE-ID-DATABASE", 1, 0, false);
        declareFunction("sys_tran_modules", "SYS-TRAN-MODULES", 1, 0, false);
        declareFunction("sys_tran_set_modules", "SYS-TRAN-SET-MODULES", 2, 0, false);
        declareFunction("sys_tran_set_last_translation_time", "SYS-TRAN-SET-LAST-TRANSLATION-TIME", 1, 1, false);
        declareFunction("sys_tran_security_level", "SYS-TRAN-SECURITY-LEVEL", 1, 0, false);
        declareFunction("sys_tran_secureP", "SYS-TRAN-SECURE?", 1, 0, false);
        declareFunction("sys_tran_includes_moduleP", "SYS-TRAN-INCLUDES-MODULE?", 2, 0, false);
        declareFunction("sys_tran_module_input_filename", "SYS-TRAN-MODULE-INPUT-FILENAME", 2, 0, false);
        declareFunction("sys_tran_module_output_filename", "SYS-TRAN-MODULE-OUTPUT-FILENAME", 2, 0, false);
        declareFunction("sys_tran_relative_input_filename", "SYS-TRAN-RELATIVE-INPUT-FILENAME", 2, 0, false);
        declareFunction("sys_tran_module_features", "SYS-TRAN-MODULE-FEATURES", 2, 0, false);
        declareFunction("sys_tran_module_output_enabledP", "SYS-TRAN-MODULE-OUTPUT-ENABLED?", 2, 0, false);
        declareFunction("sys_tran_module_declare_function", "SYS-TRAN-MODULE-DECLARE-FUNCTION", 2, 0, false);
        declareFunction("sys_tran_module_init_function", "SYS-TRAN-MODULE-INIT-FUNCTION", 2, 0, false);
        declareFunction("sys_tran_module_setup_function", "SYS-TRAN-MODULE-SETUP-FUNCTION", 2, 0, false);
        declareFunction("sys_tran_all_init_functions", "SYS-TRAN-ALL-INIT-FUNCTIONS", 1, 0, false);
        declareFunction("sys_tran_system_default_path", "SYS-TRAN-SYSTEM-DEFAULT-PATH", 1, 0, false);
        declareFunction("sys_tran_secure_module_id", "SYS-TRAN-SECURE-MODULE-ID", 2, 0, false);
        declareFunction("sys_tran_secure_method_id", "SYS-TRAN-SECURE-METHOD-ID", 2, 0, false);
        declareFunction("sys_tran_secure_global_id", "SYS-TRAN-SECURE-GLOBAL-ID", 2, 0, false);
        declareFunction("sys_tran_secure_symbol_name", "SYS-TRAN-SECURE-SYMBOL-NAME", 2, 0, false);
        declareFunction("current_system_translation_secure_symbol_name", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-NAME", 1, 0, false);
        declareFunction("sys_tran_note_module_filenames", "SYS-TRAN-NOTE-MODULE-FILENAMES", 4, 0, false);
        declareFunction("sys_tran_note_module_features", "SYS-TRAN-NOTE-MODULE-FEATURES", 3, 0, false);
        declareFunction("sys_tran_initialize_last_translation_time", "SYS-TRAN-INITIALIZE-LAST-TRANSLATION-TIME", 1, 0, false);
        declareFunction("translator_possibly_update_current_system_modules", "TRANSLATOR-POSSIBLY-UPDATE-CURRENT-SYSTEM-MODULES", 0, 0, false);
        declareFunction("translator_possibly_translate_one_module", "TRANSLATOR-POSSIBLY-TRANSLATE-ONE-MODULE", 1, 0, false);
        declareFunction("translator_possibly_output_system_level_files", "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES", 0, 0, false);
        declareFunction("translator_possibly_output_secure_id_database_file", "TRANSLATOR-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 0, 0, false);
        declareFunction("sys_tran_possibly_note_module_initialization_methods", "SYS-TRAN-POSSIBLY-NOTE-MODULE-INITIALIZATION-METHODS", 4, 0, false);
        declareFunction("translate_one_system", "TRANSLATE-ONE-SYSTEM", 1, 0, false);
        declareFunction("sys_tran_initialize_xref_database", "SYS-TRAN-INITIALIZE-XREF-DATABASE", 1, 0, false);
        declareFunction("sys_tran_initialize_module_info", "SYS-TRAN-INITIALIZE-MODULE-INFO", 1, 0, false);
        declareFunction("translator_compute_relevant_modules_from_manifest", "TRANSLATOR-COMPUTE-RELEVANT-MODULES-FROM-MANIFEST", 4, 0, false);
        declareFunction("translator_compute_module_input_file", "TRANSLATOR-COMPUTE-MODULE-INPUT-FILE", 3, 0, false);
        declareFunction("sys_tran_compute_module_output_file", "SYS-TRAN-COMPUTE-MODULE-OUTPUT-FILE", 3, 0, false);
        declareFunction("translate_backend_compute_output_module_path", "TRANSLATE-BACKEND-COMPUTE-OUTPUT-MODULE-PATH", 3, 0, false);
        declareFunction("translator_backend_output_file_extension", "TRANSLATOR-BACKEND-OUTPUT-FILE-EXTENSION", 1, 0, false);
        declareFunction("sys_tran_backend_output_module_filename", "SYS-TRAN-BACKEND-OUTPUT-MODULE-FILENAME", 3, 0, false);
        declareFunction("java_backend_output_module_filename", "JAVA-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false);
        declareFunction("translator_compute_full_filename", "TRANSLATOR-COMPUTE-FULL-FILENAME", 4, 0, false);
        declareFunction("translator_module_feature_expression_match", "TRANSLATOR-MODULE-FEATURE-EXPRESSION-MATCH", 2, 0, false);
        declareFunction("sys_tran_possibly_update_xref_module_features", "SYS-TRAN-POSSIBLY-UPDATE-XREF-MODULE-FEATURES", 1, 0, false);
        declareFunction("sys_tran_trace_format", "SYS-TRAN-TRACE-FORMAT", 1, 3, false);
        declareMacro("with_simple_restart_loop", "WITH-SIMPLE-RESTART-LOOP");
        declareFunction("sys_tran_perform_initial_translation", "SYS-TRAN-PERFORM-INITIAL-TRANSLATION", 1, 0, false);
        declareFunction("sys_tran_translate_modules", "SYS-TRAN-TRANSLATE-MODULES", 2, 0, false);
        declareFunction("trivial_finger_print_for_module", "TRIVIAL-FINGER-PRINT-FOR-MODULE", 1, 0, false);
        declareFunction("suggest_finger_print_for_module", "SUGGEST-FINGER-PRINT-FOR-MODULE", 2, 1, false);
        declareFunction("translate_one_module", "TRANSLATE-ONE-MODULE", 5, 0, false);
        declareFunction("translate_one_system_module", "TRANSLATE-ONE-SYSTEM-MODULE", 2, 0, false);
        declareFunction("translator_parse_manifest_file", "TRANSLATOR-PARSE-MANIFEST-FILE", 1, 0, false);
        declareMacro("do_manifest_systems", "DO-MANIFEST-SYSTEMS");
        declareFunction("manifest_system_name", "MANIFEST-SYSTEM-NAME", 1, 0, false);
        declareFunction("manifest_system_lookup", "MANIFEST-SYSTEM-LOOKUP", 2, 0, false);
        declareFunction("manifest_system_modules", "MANIFEST-SYSTEM-MODULES", 1, 0, false);
        declareFunction("manifest_system_default_path", "MANIFEST-SYSTEM-DEFAULT-PATH", 1, 0, false);
        declareFunction("manifest_module_name", "MANIFEST-MODULE-NAME", 1, 0, false);
        declareFunction("manifest_module_relative_path", "MANIFEST-MODULE-RELATIVE-PATH", 1, 0, false);
        declareFunction("manifest_module_features", "MANIFEST-MODULE-FEATURES", 1, 0, false);
        declareFunction("manifest_module_path", "MANIFEST-MODULE-PATH", 2, 0, false);
        declareFunction("manifest_module_features_allowedP", "MANIFEST-MODULE-FEATURES-ALLOWED?", 3, 0, false);
        declareFunction("translator_regenerate_manifest_file", "TRANSLATOR-REGENERATE-MANIFEST-FILE", 1, 0, false);
        declareFunction("translator_generate_manifest_file", "TRANSLATOR-GENERATE-MANIFEST-FILE", 1, 0, false);
        declareFunction("translator_generate_manifest_to_stream", "TRANSLATOR-GENERATE-MANIFEST-TO-STREAM", 1, 0, false);
        declareFunction("translator_generate_manifest_system_to_stream", "TRANSLATOR-GENERATE-MANIFEST-SYSTEM-TO-STREAM", 2, 0, false);
        declareFunction("translator_system_module_specs", "TRANSLATOR-SYSTEM-MODULE-SPECS", 1, 0, false);
        declareFunction("translator_system_directory", "TRANSLATOR-SYSTEM-DIRECTORY", 1, 0, false);
        declareFunction("translator_system_package", "TRANSLATOR-SYSTEM-PACKAGE", 1, 0, false);
        declareFunction("translator_system_required_systems", "TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS", 1, 0, false);
        declareFunction("translator_system_modules", "TRANSLATOR-SYSTEM-MODULES", 1, 0, false);
        declareFunction("translator_system_module_directory", "TRANSLATOR-SYSTEM-MODULE-DIRECTORY", 2, 0, false);
        declareFunction("translator_system_module_features", "TRANSLATOR-SYSTEM-MODULE-FEATURES", 2, 0, false);
        declareFunction("untransformed_feature_symbol_p", "UNTRANSFORMED-FEATURE-SYMBOL-P", 1, 0, false);
        declareFunction("transform_feature_symbol", "TRANSFORM-FEATURE-SYMBOL", 1, 0, false);
        declareFunction("sys_tran_output_system_level_files", "SYS-TRAN-OUTPUT-SYSTEM-LEVEL-FILES", 1, 0, false);
        declareFunction("sys_tran_possibly_output_secure_id_database_file", "SYS-TRAN-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 1, 0, false);
        declareFunction("translator_system_directory_module_map", "TRANSLATOR-SYSTEM-DIRECTORY-MODULE-MAP", 4, 0, false);
        declareFunction("translator_libraries_from_directory_module_map", "TRANSLATOR-LIBRARIES-FROM-DIRECTORY-MODULE-MAP", 2, 0, false);
        declareFunction("translator_paths_from_directory_module_map", "TRANSLATOR-PATHS-FROM-DIRECTORY-MODULE-MAP", 1, 0, false);
        declareFunction("retranslate_modules", "RETRANSLATE-MODULES", 1, 0, false);
        declareFunction("module_damaged_wrt_introspectionP", "MODULE-DAMAGED-WRT-INTROSPECTION?", 1, 0, false);
        declareFunction("test_translate_and_output_form", "TEST-TRANSLATE-AND-OUTPUT-FORM", 1, 3, false);
        declareFunction("test_translate_and_output_form_to_string", "TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING", 1, 2, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("SL2C"), makeKeyword("SL2JAVA"));

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("SYSTEM"), makeSymbol("BACKEND"), makeSymbol("FEATURES"), makeSymbol("INPUT-DIRECTORY"), makeSymbol("OUTPUT-DIRECTORY"), makeSymbol("MANIFEST-FILE"), makeSymbol("MODULES"), makeSymbol("MODULE-FILENAME-TABLE"), makeSymbol("MODULE-FEATURES-TABLE"), makeSymbol("MODULE-INITIALIZATION-TABLE"), makeSymbol("XREF-DATABASE"), makeSymbol("SECURE-ID-DATABASE"), makeSymbol("LAST-TRANSLATION-TIME") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SYSTEM"), makeKeyword("BACKEND"), makeKeyword("FEATURES"), makeKeyword("INPUT-DIRECTORY"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("MANIFEST-FILE"), makeKeyword("MODULES"), makeKeyword("MODULE-FILENAME-TABLE"), makeKeyword("MODULE-FEATURES-TABLE"), makeKeyword("MODULE-INITIALIZATION-TABLE"), makeKeyword("XREF-DATABASE"), makeKeyword("SECURE-ID-DATABASE"), makeKeyword("LAST-TRANSLATION-TIME") });

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeSymbol("SYS-TR-SYSTEM"), makeSymbol("SYS-TR-BACKEND"), makeSymbol("SYS-TR-FEATURES"), makeSymbol("SYS-TR-INPUT-DIRECTORY"), makeSymbol("SYS-TR-OUTPUT-DIRECTORY"), makeSymbol("SYS-TR-MANIFEST-FILE"), makeSymbol("SYS-TR-MODULES"), makeSymbol("SYS-TR-MODULE-FILENAME-TABLE"), makeSymbol("SYS-TR-MODULE-FEATURES-TABLE"), makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE"), makeSymbol("SYS-TR-XREF-DATABASE"), makeSymbol("SYS-TR-SECURE-ID-DATABASE"), makeSymbol("SYS-TR-LAST-TRANSLATION-TIME") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeSymbol("_CSETF-SYS-TR-SYSTEM"), makeSymbol("_CSETF-SYS-TR-BACKEND"), makeSymbol("_CSETF-SYS-TR-FEATURES"), makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY"), makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY"), makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE"), makeSymbol("_CSETF-SYS-TR-MODULES"), makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE"), makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE"), makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE"), makeSymbol("_CSETF-SYS-TR-XREF-DATABASE"), makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE"), makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME") });

    public static final SubLObject init_system_translation_file_alt() {
        defvar("*TRANSLATOR-OUTPUT-ENABLED?*", T);
        deflexical("*TRANSLATOR-BACKENDS*", $list_alt0);
        defvar("*CURRENT-SYSTEM-TRANSLATION*", NIL);
        defconstant("*DTP-SYSTEM-TRANSLATION*", SYSTEM_TRANSLATION);
        defparameter("*TRANSLATION-TRACE-STREAM*", T);
        defparameter("*GENERATE-MODULE-FINGERPRINTS?*", NIL);
        defparameter("*EXTERNAL-CHECKSUM-ALGORITHM*", $str_alt94$_usr_bin_sha256sum);
        deflexical("*DEFAULT-SECURE-ID-DATABASE-FILENAME*", $str_alt144$translation_secure_id_database_fi);
        return NIL;
    }

    public static SubLObject init_system_translation_file() {
        if (SubLFiles.USE_V1) {
            defvar("*TRANSLATOR-OUTPUT-ENABLED?*", T);
            deflexical("*TRANSLATOR-BACKENDS*", $list0);
            defvar("*CURRENT-SYSTEM-TRANSLATION*", NIL);
            defconstant("*DTP-SYSTEM-TRANSLATION*", SYSTEM_TRANSLATION);
            defparameter("*TRANSLATION-TRACE-STREAM*", T);
            defparameter("*GENERATE-MODULE-FINGERPRINTS?*", NIL);
            defparameter("*EXTERNAL-CHECKSUM-ALGORITHM*", $str101$_usr_bin_sha256sum);
            deflexical("*DEFAULT-SECURE-ID-DATABASE-FILENAME*", $str150$translation_secure_id_database_fi);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*EXTERNAL-CHECKSUM-ALGORITHM*", $str_alt94$_usr_bin_sha256sum);
            deflexical("*DEFAULT-SECURE-ID-DATABASE-FILENAME*", $str_alt144$translation_secure_id_database_fi);
        }
        return NIL;
    }

    public static SubLObject init_system_translation_file_Previous() {
        defvar("*TRANSLATOR-OUTPUT-ENABLED?*", T);
        deflexical("*TRANSLATOR-BACKENDS*", $list0);
        defvar("*CURRENT-SYSTEM-TRANSLATION*", NIL);
        defconstant("*DTP-SYSTEM-TRANSLATION*", SYSTEM_TRANSLATION);
        defparameter("*TRANSLATION-TRACE-STREAM*", T);
        defparameter("*GENERATE-MODULE-FINGERPRINTS?*", NIL);
        defparameter("*EXTERNAL-CHECKSUM-ALGORITHM*", $str101$_usr_bin_sha256sum);
        deflexical("*DEFAULT-SECURE-ID-DATABASE-FILENAME*", $str150$translation_secure_id_database_fi);
        return NIL;
    }

    public static final SubLObject setup_system_translation_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_system_translation$.getGlobalValue(), symbol_function(SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SYS_TR_SYSTEM, _CSETF_SYS_TR_SYSTEM);
        def_csetf(SYS_TR_BACKEND, _CSETF_SYS_TR_BACKEND);
        def_csetf(SYS_TR_FEATURES, _CSETF_SYS_TR_FEATURES);
        def_csetf(SYS_TR_INPUT_DIRECTORY, _CSETF_SYS_TR_INPUT_DIRECTORY);
        def_csetf(SYS_TR_OUTPUT_DIRECTORY, _CSETF_SYS_TR_OUTPUT_DIRECTORY);
        def_csetf(SYS_TR_MANIFEST_FILE, _CSETF_SYS_TR_MANIFEST_FILE);
        def_csetf(SYS_TR_MODULES, _CSETF_SYS_TR_MODULES);
        def_csetf(SYS_TR_MODULE_FILENAME_TABLE, _CSETF_SYS_TR_MODULE_FILENAME_TABLE);
        def_csetf(SYS_TR_MODULE_FEATURES_TABLE, _CSETF_SYS_TR_MODULE_FEATURES_TABLE);
        def_csetf(SYS_TR_MODULE_INITIALIZATION_TABLE, _CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE);
        def_csetf(SYS_TR_XREF_DATABASE, _CSETF_SYS_TR_XREF_DATABASE);
        def_csetf(SYS_TR_SECURE_ID_DATABASE, _CSETF_SYS_TR_SECURE_ID_DATABASE);
        def_csetf(SYS_TR_LAST_TRANSLATION_TIME, _CSETF_SYS_TR_LAST_TRANSLATION_TIME);
        identity(SYSTEM_TRANSLATION);
        define_test_case_table_int(TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt157);
        return NIL;
    }

    public static SubLObject setup_system_translation_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_system_translation$.getGlobalValue(), symbol_function(SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list10);
            def_csetf(SYS_TR_SYSTEM, _CSETF_SYS_TR_SYSTEM);
            def_csetf(SYS_TR_BACKEND, _CSETF_SYS_TR_BACKEND);
            def_csetf(SYS_TR_FEATURES, _CSETF_SYS_TR_FEATURES);
            def_csetf(SYS_TR_INPUT_DIRECTORY, _CSETF_SYS_TR_INPUT_DIRECTORY);
            def_csetf(SYS_TR_OUTPUT_DIRECTORY, _CSETF_SYS_TR_OUTPUT_DIRECTORY);
            def_csetf(SYS_TR_MANIFEST_FILE, _CSETF_SYS_TR_MANIFEST_FILE);
            def_csetf(SYS_TR_MODULES, _CSETF_SYS_TR_MODULES);
            def_csetf(SYS_TR_MODULE_FILENAME_TABLE, _CSETF_SYS_TR_MODULE_FILENAME_TABLE);
            def_csetf(SYS_TR_MODULE_FEATURES_TABLE, _CSETF_SYS_TR_MODULE_FEATURES_TABLE);
            def_csetf(SYS_TR_MODULE_INITIALIZATION_TABLE, _CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE);
            def_csetf(SYS_TR_XREF_DATABASE, _CSETF_SYS_TR_XREF_DATABASE);
            def_csetf(SYS_TR_SECURE_ID_DATABASE, _CSETF_SYS_TR_SECURE_ID_DATABASE);
            def_csetf(SYS_TR_LAST_TRANSLATION_TIME, _CSETF_SYS_TR_LAST_TRANSLATION_TIME);
            identity(SYSTEM_TRANSLATION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_system_translation$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SYSTEM_TRANSLATION_METHOD));
            define_test_case_table_int(TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list162);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt157);
        }
        return NIL;
    }

    public static SubLObject setup_system_translation_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_system_translation$.getGlobalValue(), symbol_function(SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list10);
        def_csetf(SYS_TR_SYSTEM, _CSETF_SYS_TR_SYSTEM);
        def_csetf(SYS_TR_BACKEND, _CSETF_SYS_TR_BACKEND);
        def_csetf(SYS_TR_FEATURES, _CSETF_SYS_TR_FEATURES);
        def_csetf(SYS_TR_INPUT_DIRECTORY, _CSETF_SYS_TR_INPUT_DIRECTORY);
        def_csetf(SYS_TR_OUTPUT_DIRECTORY, _CSETF_SYS_TR_OUTPUT_DIRECTORY);
        def_csetf(SYS_TR_MANIFEST_FILE, _CSETF_SYS_TR_MANIFEST_FILE);
        def_csetf(SYS_TR_MODULES, _CSETF_SYS_TR_MODULES);
        def_csetf(SYS_TR_MODULE_FILENAME_TABLE, _CSETF_SYS_TR_MODULE_FILENAME_TABLE);
        def_csetf(SYS_TR_MODULE_FEATURES_TABLE, _CSETF_SYS_TR_MODULE_FEATURES_TABLE);
        def_csetf(SYS_TR_MODULE_INITIALIZATION_TABLE, _CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE);
        def_csetf(SYS_TR_XREF_DATABASE, _CSETF_SYS_TR_XREF_DATABASE);
        def_csetf(SYS_TR_SECURE_ID_DATABASE, _CSETF_SYS_TR_SECURE_ID_DATABASE);
        def_csetf(SYS_TR_LAST_TRANSLATION_TIME, _CSETF_SYS_TR_LAST_TRANSLATION_TIME);
        identity(SYSTEM_TRANSLATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_system_translation$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SYSTEM_TRANSLATION_METHOD));
        define_test_case_table_int(TEST_TRANSLATE_AND_OUTPUT_FORM_TO_STRING, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list162);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_system_translation_file();
    }

    static private final SubLString $str_alt49$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void initializeVariables() {
        init_system_translation_file();
    }

    static private final SubLString $str_alt50$__ = makeString("#<");

    @Override
    public void runTopLevelForms() {
        setup_system_translation_file();
    }

    static private final SubLString $str_alt52$_A_A__S__S_features___S_modules = makeString("~A~A ~S ~S features, ~S modules");

    static {
    }

    static private final SubLString $str_alt53$secure_ = makeString("secure ");

    static private final SubLList $list_alt67 = list(makeSymbol("&KEY"), makeSymbol("SYSTEM"), makeSymbol("BACKEND"), makeSymbol("FEATURES"), list(makeSymbol("SECURITY-LEVEL"), $NONE), makeSymbol("INPUT-DIRECTORY"), makeSymbol("OUTPUT-DIRECTORY"), makeSymbol("SYSTEM-MANIFEST"));

    static private final SubLList $list_alt68 = list(makeKeyword("SYSTEM"), makeKeyword("BACKEND"), makeKeyword("FEATURES"), makeKeyword("SECURITY-LEVEL"), makeKeyword("INPUT-DIRECTORY"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("SYSTEM-MANIFEST"));

    static private final SubLList $list_alt72 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULE"), makeSymbol("MODULE-FEATURES"));

    static private final SubLList $list_alt75 = list(makeString("SUBLISP"));

    static private final SubLString $str_alt79$Time_to_specify_the_output_file_e = makeString("Time to specify the output file extension for backend ~S");

    static private final SubLString $str_alt80$Time_to_specify_the_output_module = makeString("Time to specify the output module filename for backend ~S");

    static private final SubLString $str_alt81$module_4__0D = makeString("module~4,'0D");

    static private final SubLList $list_alt82 = list(list(makeSymbol("NAME"), makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym83$DONE = makeUninternedSymbol("DONE");

    static private final SubLList $list_alt89 = list(T);

    static private final SubLString $str_alt90$__Translating__A_to_backend__S_wi = makeString("~%Translating ~A to backend ~S with features :~%  ~S ");

    static private final SubLString $str_alt91$__Pass_1___Populating_XREF_databa = makeString("~%Pass 1 : Populating XREF database");

    static private final SubLString $str_alt93$__Pass_2___Translating = makeString("~%Pass 2 : Translating");

    static private final SubLString $str_alt94$_usr_bin_sha256sum = makeString("/usr/bin/sha256sum");

    static private final SubLString $str_alt95$_ = makeString("-");

    static private final SubLString $str_alt97$_A_failed_to_produce_non_trivial_ = makeString("~A failed to produce non-trivial finger-print for ~A: got ~A.");

    static private final SubLString $str_alt98$c_out = makeString("c.out");

    static private final SubLString $str_alt99$_out = makeString(".out");

    static private final SubLString $str_alt100$backend__S_is_not_yet_supported = makeString("backend ~S is not yet supported");

    static private final SubLString $str_alt101$__translate_one_module__A___A____ = makeString("~%translate-one-module ~A: ~A -> ~A ~%");

    static private final SubLString $str_alt103$Skip__S = makeString("Skip ~S");

    static private final SubLString $str_alt105$Retranslate__S = makeString("Retranslate ~S");

    static private final SubLString $str_alt106$___Starting__A_ = makeString("~%[Starting ~A]");

    static private final SubLString $str_alt107$___Finished__A_ = makeString("~%[Finished ~A]");

    static private final SubLString $str_alt108$The_manifest_file__S_is_not_avail = makeString("The manifest file ~S is not available.");

    static private final SubLString $str_alt110$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt113 = list(list(makeSymbol("MANIFEST-SYSTEM-VAR"), makeSymbol("MANIFEST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt116$system_manifest_lisp = makeString("system-manifest.lisp");

    static private final SubLString $str_alt119$________Mode__LISP__Package__SUBL = makeString(";;; -*- Mode: LISP; Package: SUBLISP -*-");

    static private final SubLList $list_alt120 = list(makeString("SUBLISP"), makeString("CYCL"));

    static private final SubLString $str_alt121$_ = makeString("(");

    static private final SubLString $str_alt122$_system__S = makeString(":system ~S");

    static private final SubLString $str_alt123$____ = makeString("~% (");

    static private final SubLString $str_alt124$_____directory__S = makeString("~%  :directory ~S");

    static private final SubLString $str_alt125$_____package____S = makeString("~%  :package   ~S");

    static private final SubLString $str_alt126$_____required_systems_ = makeString("~%  :required-systems ");

    static private final SubLString $str_alt127$_ = makeString(" ");

    static private final SubLString $str_alt128$_S = makeString("~S");

    static private final SubLString $str_alt129$_ = makeString(")");

    static private final SubLString $str_alt130$____ = makeString("~% )");

    static private final SubLList $list_alt131 = list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DIRECTORY"), makeSymbol("FEATURES"));

    public static final class $system_translation_p$UnaryFunction extends UnaryFunction {
        public $system_translation_p$UnaryFunction() {
            super(extractFunctionNamed("SYSTEM-TRANSLATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return system_translation_p(arg1);
        }
    }

    static private final SubLList $list_alt132 = list(makeKeyword("DIRECTORY"), makeKeyword("FEATURES"));

    static private final SubLString $str_alt133$_____S = makeString("~% (~S");

    static private final SubLString $str_alt134$__directory__S = makeString(" :directory ~S");

    static private final SubLString $str_alt135$__features__S = makeString(" :features ~S");

    static private final SubLString $str_alt136$___ = makeString("~%)");

    static private final SubLString $str_alt137$TRANSLATOR_SYSTEM_DIRECTORY_is_un = makeString("TRANSLATOR-SYSTEM-DIRECTORY is unimplemented");

    static private final SubLString $str_alt138$TRANSLATOR_SYSTEM_PACKAGE_is_unim = makeString("TRANSLATOR-SYSTEM-PACKAGE is unimplemented");

    static private final SubLString $str_alt139$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM = makeString("TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS is unimplemented");

    static private final SubLString $str_alt140$TRANSLATOR_SYSTEM_MODULES_is_unim = makeString("TRANSLATOR-SYSTEM-MODULES is unimplemented");

    static private final SubLString $str_alt141$TRANSLATOR_SYSTEM_MODULE_DIRECTOR = makeString("TRANSLATOR-SYSTEM-MODULE-DIRECTORY is unimplemented");

    static private final SubLString $str_alt142$TRANSLATOR_SYSTEM_MODULE_FEATURES = makeString("TRANSLATOR-SYSTEM-MODULE-FEATURES is unimplemented");

    static private final SubLString $str_alt144$translation_secure_id_database_fi = makeString("translation-secure-id-database-file.cfasl");

    static private final SubLList $list_alt146 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULES"));

    static private final SubLString $str_alt148$Unsupported_backend____S = makeString("Unsupported backend : ~S");

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt157 = list(new SubLObject[]{ list(list(list(makeSymbol("+"), ONE_INTEGER, TWO_INTEGER), makeKeyword("SL2C")), makeString("add2(one, two)")), list(list(list(makeSymbol("+"), ONE_INTEGER, TWO_INTEGER), makeKeyword("SL2JAVA")), makeString("Numbers.add(ONE_INTEGER, TWO_INTEGER)")), list(list(list(makeSymbol("OPEN"), makeSymbol("FILENAME"))), makeString("open_g(one, v_filename)")), list(list(makeSymbol("X"), makeKeyword("SL2C")), makeString("v_x")), list(list(makeSymbol("X"), makeKeyword("SL2JAVA")), makeString("x")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X")), makeKeyword("SL2C")), makeString("list(one, v_x)")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X")), makeKeyword("SL2JAVA")), makeString("list(x)")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X"), makeSymbol("Y")), makeKeyword("SL2C")), makeString("list(two, v_x, v_y)")), list(list(list(makeSymbol("BQ-LIST"), makeSymbol("X"), makeSymbol("Y")), makeKeyword("SL2JAVA")), makeString("list(x, y)")), list(list(list(makeSymbol("BQ-LIST*"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z")), makeKeyword("SL2C")), makeString("listS(three, v_x, v_y, v_z)")), list(list(list(makeSymbol("BQ-LIST*"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z")), makeKeyword("SL2JAVA")), makeString("listS(x, y, z)")), list(list(list(makeSymbol("BQ-LIST"), ONE_INTEGER, TWO_INTEGER, makeSymbol("X")), makeKeyword("SL2C")), makeString("list(three, one, two, v_x)")), list(list(list(makeSymbol("BQ-LIST"), ONE_INTEGER, TWO_INTEGER, makeSymbol("X")), makeKeyword("SL2JAVA")), makeString("list(ONE_INTEGER, TWO_INTEGER, x)")) });
}

/**
 * Total time: 663 ms synthetic
 */
