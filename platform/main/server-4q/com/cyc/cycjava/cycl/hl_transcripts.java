package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.hl_transcripts;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.hl_transcripts.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class hl_transcripts extends SubLTranslatedFile {
    public static final SubLFile me = new hl_transcripts();

    public static final String myName = "com.cyc.cycjava.cycl.hl_transcripts";

    public static final String myFingerPrint = "554ab1dd03340b10385d2dfb8698f490e43c9340ef05a5ec4eb1f3f2b7453713";

    // defparameter
    public static final SubLSymbol $hl_transcript_compression_enabledP$ = makeSymbol("*HL-TRANSCRIPT-COMPRESSION-ENABLED?*");

    // deflexical
    private static final SubLSymbol $hl_transcript_common_symbols$ = makeSymbol("*HL-TRANSCRIPT-COMMON-SYMBOLS*");

    // deflexical
    private static final SubLSymbol $hl_transcript_el_constants$ = makeSymbol("*HL-TRANSCRIPT-EL-CONSTANTS*");

    // defparameter
    public static final SubLSymbol $hl_transcript_constant_external_id_equivalence_map$ = makeSymbol("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*");

    // deflexical
    private static final SubLSymbol $hlt_removal_methods$ = makeSymbol("*HLT-REMOVAL-METHODS*");

    private static final SubLList $list0 = list(list(makeSymbol("CONSTANT-VAR"), makeSymbol("&KEY"), makeSymbol("START"), makeSymbol("END"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLSymbol $sym7$PROGRESS_VAR = makeUninternedSymbol("PROGRESS-VAR");

    private static final SubLSymbol $sym8$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");



    private static final SubLSymbol $sym10$_ = makeSymbol("-");



    private static final SubLSymbol DO_CONSTANTS_BY_INTERNAL_ID = makeSymbol("DO-CONSTANTS-BY-INTERNAL-ID");

    private static final SubLSymbol NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS = makeSymbol("NOTE-CONSTANTS-BY-INTERNAL-ID-PROGRESS");

    private static final SubLSymbol $sym14$ID_VAR = makeUninternedSymbol("ID-VAR");

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");







    private static final SubLList $list19 = list(list(makeSymbol("NART-VAR"), makeSymbol("&KEY"), makeSymbol("START"), makeSymbol("END"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym20$PROGRESS_VAR = makeUninternedSymbol("PROGRESS-VAR");

    private static final SubLSymbol $sym21$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLSymbol DO_NARTS_BY_ID = makeSymbol("DO-NARTS-BY-ID");

    private static final SubLSymbol NOTE_NARTS_BY_ID_PROGRESS = makeSymbol("NOTE-NARTS-BY-ID-PROGRESS");

    private static final SubLSymbol $sym24$ID_VAR = makeUninternedSymbol("ID-VAR");

    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");



    private static final SubLList $list27 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("&KEY"), makeSymbol("START"), makeSymbol("END"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym28$PROGRESS_VAR = makeUninternedSymbol("PROGRESS-VAR");

    private static final SubLSymbol $sym29$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLSymbol DO_ASSERTIONS_BY_ID = makeSymbol("DO-ASSERTIONS-BY-ID");

    private static final SubLSymbol NOTE_ASSERTIONS_BY_ID_PROGRESS = makeSymbol("NOTE-ASSERTIONS-BY-ID-PROGRESS");

    private static final SubLSymbol $sym32$ID_VAR = makeUninternedSymbol("ID-VAR");





    private static final SubLList $list35 = list(list(makeSymbol("DEDUCTION-VAR"), makeSymbol("&KEY"), makeSymbol("START"), makeSymbol("END"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym36$PROGRESS_VAR = makeUninternedSymbol("PROGRESS-VAR");

    private static final SubLSymbol $sym37$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLSymbol DO_DEDUCTIONS_BY_ID = makeSymbol("DO-DEDUCTIONS-BY-ID");

    private static final SubLSymbol NOTE_DEDUCTIONS_BY_ID_PROGRESS = makeSymbol("NOTE-DEDUCTIONS-BY-ID-PROGRESS");

    private static final SubLSymbol $sym40$ID_VAR = makeUninternedSymbol("ID-VAR");

    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");



    private static final SubLList $list43 = list(list(makeSymbol("KB-HL-SUPPORT-VAR"), makeSymbol("&KEY"), makeSymbol("START"), makeSymbol("END"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym44$PROGRESS_VAR = makeUninternedSymbol("PROGRESS-VAR");

    private static final SubLSymbol $sym45$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLSymbol DO_KB_HL_SUPPORTS_BY_ID = makeSymbol("DO-KB-HL-SUPPORTS-BY-ID");

    private static final SubLSymbol NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS = makeSymbol("NOTE-KB-HL-SUPPORTS-BY-ID-PROGRESS");

    private static final SubLSymbol $sym48$ID_VAR = makeUninternedSymbol("ID-VAR");

    private static final SubLSymbol FIND_KB_HL_SUPPORT_BY_ID = makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");



    private static final SubLSymbol NEXT_CONSTANT_SUID = makeSymbol("NEXT-CONSTANT-SUID");

    private static final SubLSymbol $sym52$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol NEXT_NART_ID = makeSymbol("NEXT-NART-ID");

    private static final SubLSymbol $sym54$VALID_NART_ = makeSymbol("VALID-NART?");

    private static final SubLSymbol NEXT_ASSERTION_ID = makeSymbol("NEXT-ASSERTION-ID");

    private static final SubLSymbol $sym56$VALID_ASSERTION_ = makeSymbol("VALID-ASSERTION?");

    private static final SubLSymbol NEXT_DEDUCTION_ID = makeSymbol("NEXT-DEDUCTION-ID");

    private static final SubLSymbol $sym58$VALID_DEDUCTION_ = makeSymbol("VALID-DEDUCTION?");

    private static final SubLSymbol NEXT_KB_HL_SUPPORT_ID = makeSymbol("NEXT-KB-HL-SUPPORT-ID");

    private static final SubLSymbol $sym60$VALID_KB_HL_SUPPORT_ = makeSymbol("VALID-KB-HL-SUPPORT?");









    private static final SubLSymbol $KB_HL_SUPPORT = makeKeyword("KB-HL-SUPPORT");



    private static final SubLSymbol $START_CHECKPOINT = makeKeyword("START-CHECKPOINT");

    private static final SubLSymbol $END_CHECKPOINT = makeKeyword("END-CHECKPOINT");



    private static final SubLString $str70$Unable_to_open__S = makeString("Unable to open ~S");





    private static final SubLString $$$Loading_HL_Transcript_ = makeString("Loading HL Transcript ");



    private static final SubLList $list75 = list(list(makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("MODIFICATION-SPEC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list76 = list(makeKeyword("MODIFICATION-SPEC"));

    private static final SubLSymbol $MODIFICATION_SPEC = makeKeyword("MODIFICATION-SPEC");

    private static final SubLSymbol $sym78$MOD_SPEC_VAR = makeUninternedSymbol("MOD-SPEC-VAR");

    private static final SubLSymbol $sym79$OBJECTS_TO_COMPRESS = makeUninternedSymbol("OBJECTS-TO-COMPRESS");

    private static final SubLSymbol $sym80$COMPRESSION_SAMPLE = makeUninternedSymbol("COMPRESSION-SAMPLE");

    private static final SubLSymbol $sym81$COMPRESSION_OPTIONS = makeUninternedSymbol("COMPRESSION-OPTIONS");

    private static final SubLSymbol HL_TRANSCRIPT_OBJECTS_TO_COMPRESS = makeSymbol("HL-TRANSCRIPT-OBJECTS-TO-COMPRESS");









    private static final SubLSymbol WITH_CFASL_COMPRESSION = makeSymbol("WITH-CFASL-COMPRESSION");

    private static final SubLSymbol SAVE_ONE_HL_TRANSCRIPT_OPERATION = makeSymbol("SAVE-ONE-HL-TRANSCRIPT-OPERATION");

    private static final SubLList $list89 = list(makeSymbol("QUOTE"), list(makeSymbol("IGNORE")));

    private static final SubLList $list90 = list(makeSymbol("IGNORE"));







    private static final SubLSymbol $NEW_KB_HL_SUPPORTS = makeKeyword("NEW-KB-HL-SUPPORTS");



    private static final SubLString $$$saving_constants = makeString("saving constants");

    private static final SubLString $$$saving_NARTs = makeString("saving NARTs");

    private static final SubLString $$$saving_assertions = makeString("saving assertions");

    private static final SubLString $$$saving_KB_HL_supports = makeString("saving KB HL supports");

    private static final SubLString $$$saving_deductions = makeString("saving deductions");







    private static final SubLSymbol $KB_HL_SUPPORTS = makeKeyword("KB-HL-SUPPORTS");



    private static final SubLSymbol $TRANSCRIPT_FILE = makeKeyword("TRANSCRIPT-FILE");

    private static final SubLSymbol $REMOVE_CONSTANTS = makeKeyword("REMOVE-CONSTANTS");

    private static final SubLSymbol $REMOVE_NARTS = makeKeyword("REMOVE-NARTS");

    private static final SubLSymbol $REMOVE_ASSERTIONS = makeKeyword("REMOVE-ASSERTIONS");

    private static final SubLSymbol $REMOVE_DEDUCTIONS = makeKeyword("REMOVE-DEDUCTIONS");

    private static final SubLList $list111 = list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("START-OP"), ZERO_INTEGER), makeSymbol("END-OP"));

    private static final SubLList $list112 = list(makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol FI_KILL = makeSymbol("FI-KILL");

    private static final SubLList $list114 = list(makeSymbol("ENCAPSULATED-CONSTANT"));

    private static final SubLSymbol FI_MERGE = makeSymbol("FI-MERGE");

    private static final SubLList $list116 = list(makeSymbol("ENCAPSULATED-KILL"), makeSymbol("ENCAPSULATED-KEEP"));



    private static final SubLList $list118 = list(makeSymbol("ENCAPSULATED-SENTENCE"), makeSymbol("ENCAPSULATED-MT"));



    private static final SubLString $str120$time_to_implement__S = makeString("time to implement ~S");

    private static final SubLSymbol $REMOVED_CONSTANTS = makeKeyword("REMOVED-CONSTANTS");

    private static final SubLSymbol $REMOVED_NARTS = makeKeyword("REMOVED-NARTS");

    private static final SubLSymbol $REMOVED_ASSERTIONS = makeKeyword("REMOVED-ASSERTIONS");

    private static final SubLSymbol $REMOVED_KB_HL_SUPPORTS = makeKeyword("REMOVED-KB-HL-SUPPORTS");

    private static final SubLSymbol $REMOVED_DEDUCTIONS = makeKeyword("REMOVED-DEDUCTIONS");





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLString $str131$operation__S___S___A = makeString("operation ~S~%~S~%~A");



    private static final SubLString $str133$unexpected_error_mode__S = makeString("unexpected error mode ~S");

    private static final SubLList $list134 = cons(makeSymbol("FUNCTION-SPEC"), makeSymbol("ARGS"));

    private static final SubLSymbol CYC_FIND_OR_CREATE_CANONICAL_NART = makeSymbol("CYC-FIND-OR-CREATE-CANONICAL-NART");

    private static final SubLSymbol HLT_FIND_OR_CREATE_NART = makeSymbol("HLT-FIND-OR-CREATE-NART");

    private static final SubLSymbol CYC_FIND_OR_CREATE = makeSymbol("CYC-FIND-OR-CREATE");

    private static final SubLSymbol HLT_FIND_OR_CREATE = makeSymbol("HLT-FIND-OR-CREATE");

    private static final SubLSymbol FIND_OR_CREATE_ASSERTION = makeSymbol("FIND-OR-CREATE-ASSERTION");

    private static final SubLSymbol HLT_FIND_OR_CREATE_ASSERTION = makeSymbol("HLT-FIND-OR-CREATE-ASSERTION");

    private static final SubLSymbol FIND_OR_CREATE_KB_HL_SUPPORT = makeSymbol("FIND-OR-CREATE-KB-HL-SUPPORT");

    private static final SubLSymbol HLT_FIND_OR_CREATE_KB_HL_SUPPORT = makeSymbol("HLT-FIND-OR-CREATE-KB-HL-SUPPORT");

    private static final SubLSymbol TMS_ADD_DEDUCTION_FOR_ASSERTION = makeSymbol("TMS-ADD-DEDUCTION-FOR-ASSERTION");

    private static final SubLSymbol HLT_FIND_OR_CREATE_DEDUCTION = makeSymbol("HLT-FIND-OR-CREATE-DEDUCTION");

    private static final SubLList $list145 = list(new SubLObject[]{ makeKeyword("FORWARD"), makeKeyword("BACKWARD"), makeKeyword("TRUE"), makeKeyword("FALSE"), makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"), makeKeyword("ASSERTED-TRUE-DEF"), makeKeyword("ASSERTED-TRUE-MON"), makeKeyword("HP"), makeSymbol("HLT-FIND-OR-CREATE"), makeSymbol("HLT-FIND-OR-CREATE-NART"), makeSymbol("HLT-FIND-OR-CREATE-ASSERTION"), makeSymbol("HLT-ASSERT"), makeSymbol("HLT-FIND-OR-CREATE-KB-HL-SUPPORT"), makeSymbol("HLT-FIND-OR-CREATE-DEDUCTION"), makeSymbol("HLT-REMOVE-CONSTANT"), makeSymbol("HLT-REMOVE-NART"), makeSymbol("HLT-UNASSERT"), makeSymbol("HLT-REMOVE-ASSERTION"), makeSymbol("HLT-REMOVE-DEDUCTION") });

    private static final SubLList $list146 = list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("implies")), reader_make_constant_shell(makeString("thereExists")), reader_make_constant_shell(makeString("forAll")));

    private static final SubLList $list147 = list(list(makeSymbol("RESULT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym148$START = makeUninternedSymbol("START");

    private static final SubLList $list149 = list(list(makeSymbol("CURRENT-KB-STATE-CHECKPOINT")));



    private static final SubLSymbol NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS = makeSymbol("NEW-OBJECTS-BETWEEN-KB-CHECKPOINTS");

    private static final SubLList $list152 = list(list(makeSymbol("RULES-VAR"), makeSymbol("&KEY"), list(makeSymbol("DIRECTION"), makeKeyword("FORWARD"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list153 = list(makeKeyword("DIRECTION"));





    private static final SubLSymbol $sym156$NEW_OBJECTS = makeUninternedSymbol("NEW-OBJECTS");

    private static final SubLSymbol GATHERING_NEW_KB_OBJECTS = makeSymbol("GATHERING-NEW-KB-OBJECTS");

    private static final SubLSymbol GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS = makeSymbol("GATHERING-RULES-USED-IN-NEW-DEDUCTIONS-POSTPROCESS");

    private static final SubLSymbol GATHERING_RULES_USED_IN_NEW_DEDUCTIONS = makeSymbol("GATHERING-RULES-USED-IN-NEW-DEDUCTIONS");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT = makeSymbol("INCREMENT-COMPRESSIBLE-OBJECT-MENTION-COUNT");

    private static final SubLSymbol $sym162$_ = makeSymbol(">");



    private static final SubLString $str164$_S_was_not_a_support_p = makeString("~S was not a support-p");

    private static final SubLList $list165 = list(list(makeSymbol("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*"), list(makeSymbol("NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP"))), list(makeSymbol("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*"), makeSymbol("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*")));

    private static final SubLSymbol NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP = makeSymbol("NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP");

    private static final SubLSymbol WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME = makeSymbol("WITH-HL-TRANSCRIPT-CREATED-CONSTANT-EQUIVALENCE-BY-NAME");

    private static final SubLString $str168$missing_constant_added___S = makeString("missing constant added: ~S");

    private static final SubLString $str169$missing_NART_added___S = makeString("missing NART added: ~S");

    private static final SubLSymbol HLT_ASSERT = makeSymbol("HLT-ASSERT");





    private static final SubLString $str173$missing_gaf_added___S = makeString("missing gaf added: ~S");



    private static final SubLString $str175$missing_rule_added___S = makeString("missing rule added: ~S");



    private static final SubLSymbol $kw177$CHECK_WFF_ = makeKeyword("CHECK-WFF?");



    private static final SubLSymbol HLT_TIMESTAMP_ASSERTION = makeSymbol("HLT-TIMESTAMP-ASSERTION");

    private static final SubLString $str180$missing_KB_HL_support_added___S = makeString("missing KB HL support added: ~S");



    private static final SubLString $str182$missing_deduction_added___S = makeString("missing deduction added: ~S");

    private static final SubLSymbol HLT_REMOVE_CONSTANT = makeSymbol("HLT-REMOVE-CONSTANT");

    private static final SubLList $list184 = list(makeSymbol("ERROR-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLList $list188 = list(list(makeSymbol("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*"), T));

    private static final SubLSymbol HLT_UNASSERT = makeSymbol("HLT-UNASSERT");

    private static final SubLSymbol HLT_REMOVE_ASSERTION = makeSymbol("HLT-REMOVE-ASSERTION");

    private static final SubLSymbol $sym191$KB_REMOVAL_OPERATION_ = makeSymbol("KB-REMOVAL-OPERATION?");

    private static final SubLList $list192 = list(makeSymbol("FI-UNASSERT"), makeSymbol("FI-KILL"), makeSymbol("FI-BLAST"), makeSymbol("FI-MERGE"));



    private static final SubLSymbol MISSING_CONSTANT_ID_SET = makeSymbol("MISSING-CONSTANT-ID-SET");

    private static final SubLSymbol MISSING_NART_ID_SET = makeSymbol("MISSING-NART-ID-SET");

    private static final SubLSymbol MISSING_ASSERTION_ID_SET = makeSymbol("MISSING-ASSERTION-ID-SET");

    private static final SubLSymbol MISSING_DEDUCTION_ID_SET = makeSymbol("MISSING-DEDUCTION-ID-SET");

    private static final SubLSymbol MISSING_KB_HL_SUPPORT_ID_SET = makeSymbol("MISSING-KB-HL-SUPPORT-ID-SET");

    private static final SubLSymbol $sym199$_ = makeSymbol("<");



    private static final SubLString $str201$Directory__S_is_not_writeable = makeString("Directory ~S is not writeable");

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $str204$Minor_version__S_is_not_in_the_ra = makeString("Minor-version ~S is not in the range 0 - 25.");

    private static final SubLString $$$ABCDEFGHIJKLMNOPQRSTUVWXYZ = makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    private static final SubLString $str206$cyc_hlt_kb__A_op__A_to__A__C = makeString("cyc-hlt-kb-~A-op-~A-to-~A-~C");

    private static final SubLString $$$cfasl = makeString("cfasl");

    private static final SubLString $str208$_ = makeString(".");



    private static final SubLString $$$Extracting_Removals_HL_Transcript = makeString("Extracting Removals HL Transcript");

    private static final SubLSymbol $REMOVALS_START = makeKeyword("REMOVALS-START");

    private static final SubLSymbol $REMOVALS_LENGTH = makeKeyword("REMOVALS-LENGTH");

    private static final SubLList $list213 = list(makeSymbol("HLT-REMOVE-CONSTANT"), makeSymbol("HLT-REMOVE-NART"), makeSymbol("HLT-UNASSERT"), makeSymbol("HLT-REMOVE-ASSERTION"), makeSymbol("HLT-REMOVE-DEDUCTION"));

    public static SubLObject do_constants_by_internal_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant_var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        constant_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : NIL;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject progress_var = $sym7$PROGRESS_VAR;
            final SubLObject total_var = $sym8$TOTAL_VAR;
            return list(CLET, list(list(progress_var, progress_message), list(total_var, list($sym10$_, end, start))), list(NOTING_PERCENT_PROGRESS, progress_var, listS(DO_CONSTANTS_BY_INTERNAL_ID, list(constant_var, $START, start, $END, end, $DONE, done), list(NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS, constant_var, start, total_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym14$ID_VAR;
        return list(DO_NUMBERS, list(id_var, $START, start, $END, end, $DONE, done), list(CLET, list(list(constant_var, list(FIND_CONSTANT_BY_INTERNAL_ID, id_var))), listS(PWHEN, list(CONSTANT_P, constant_var), append(body, NIL))));
    }

    public static SubLObject note_constants_by_internal_id_progress(final SubLObject constant, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = subtract(constants_high.constant_internal_id(constant), start);
        return note_percent_progress(sofar, total);
    }

    public static SubLObject do_narts_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart_var = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        nart_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list19);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list19);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list19);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : NIL;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject progress_var = $sym20$PROGRESS_VAR;
            final SubLObject total_var = $sym21$TOTAL_VAR;
            return list(CLET, list(list(progress_var, progress_message), list(total_var, list($sym10$_, end, start))), list(NOTING_PERCENT_PROGRESS, progress_var, listS(DO_NARTS_BY_ID, list(nart_var, $START, start, $END, end, $DONE, done), list(NOTE_NARTS_BY_ID_PROGRESS, nart_var, start, total_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym24$ID_VAR;
        return list(DO_NUMBERS, list(id_var, $START, start, $END, end, $DONE, done), list(CLET, list(list(nart_var, list(FIND_NART_BY_ID, id_var))), listS(PWHEN, list(NART_P, nart_var), append(body, NIL))));
    }

    public static SubLObject note_narts_by_id_progress(final SubLObject nart, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = subtract(nart_handles.nart_id(nart), start);
        return note_percent_progress(sofar, total);
    }

    public static SubLObject do_assertions_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        assertion_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list27);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list27);
            if (NIL == member(current_$3, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list27);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : NIL;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject progress_var = $sym28$PROGRESS_VAR;
            final SubLObject total_var = $sym29$TOTAL_VAR;
            return list(CLET, list(list(progress_var, progress_message), list(total_var, list($sym10$_, end, start))), list(NOTING_PERCENT_PROGRESS, progress_var, listS(DO_ASSERTIONS_BY_ID, list(assertion_var, $START, start, $END, end, $DONE, done), list(NOTE_ASSERTIONS_BY_ID_PROGRESS, assertion_var, start, total_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym32$ID_VAR;
        return list(DO_NUMBERS, list(id_var, $START, start, $END, end, $DONE, done), list(CLET, list(list(assertion_var, list(FIND_ASSERTION_BY_ID, id_var))), listS(PWHEN, list(ASSERTION_P, assertion_var), append(body, NIL))));
    }

    public static SubLObject note_assertions_by_id_progress(final SubLObject assertion, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = subtract(assertion_handles.assertion_id(assertion), start);
        return note_percent_progress(sofar, total);
    }

    public static SubLObject do_deductions_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction_var = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        deduction_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list35);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list35);
            if (NIL == member(current_$4, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list35);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : NIL;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject progress_var = $sym36$PROGRESS_VAR;
            final SubLObject total_var = $sym37$TOTAL_VAR;
            return list(CLET, list(list(progress_var, progress_message), list(total_var, list($sym10$_, end, start))), list(NOTING_PERCENT_PROGRESS, progress_var, listS(DO_DEDUCTIONS_BY_ID, list(deduction_var, $START, start, $END, end, $DONE, done), list(NOTE_DEDUCTIONS_BY_ID_PROGRESS, deduction_var, start, total_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym40$ID_VAR;
        return list(DO_NUMBERS, list(id_var, $START, start, $END, end, $DONE, done), list(CLET, list(list(deduction_var, list(FIND_DEDUCTION_BY_ID, id_var))), listS(PWHEN, list(DEDUCTION_P, deduction_var), append(body, NIL))));
    }

    public static SubLObject note_deductions_by_id_progress(final SubLObject deduction, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = subtract(deduction_handles.deduction_id(deduction), start);
        return note_percent_progress(sofar, total);
    }

    public static SubLObject do_kb_hl_supports_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject kb_hl_support_var = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        kb_hl_support_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list43);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list43);
            if (NIL == member(current_$5, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list43);
        }
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : NIL;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject progress_var = $sym44$PROGRESS_VAR;
            final SubLObject total_var = $sym45$TOTAL_VAR;
            return list(CLET, list(list(progress_var, progress_message), list(total_var, list($sym10$_, end, start))), list(NOTING_PERCENT_PROGRESS, progress_var, listS(DO_KB_HL_SUPPORTS_BY_ID, list(kb_hl_support_var, $START, start, $END, end, $DONE, done), list(NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS, kb_hl_support_var, start, total_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym48$ID_VAR;
        return list(DO_NUMBERS, list(id_var, $START, start, $END, end, $DONE, done), list(CLET, list(list(kb_hl_support_var, list(FIND_KB_HL_SUPPORT_BY_ID, id_var))), listS(PWHEN, list(KB_HL_SUPPORT_P, kb_hl_support_var), append(body, NIL))));
    }

    public static SubLObject note_kb_hl_supports_by_id_progress(final SubLObject kb_hl_support, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = subtract(kb_hl_support_handles.kb_hl_support_id(kb_hl_support), start);
        return note_percent_progress(sofar, total);
    }

    public static SubLObject most_recent_constants(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        return most_recent_kb_objects(n, NEXT_CONSTANT_SUID, FIND_CONSTANT_BY_INTERNAL_ID, $sym52$VALID_CONSTANT_);
    }

    public static SubLObject most_recent_narts(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        return most_recent_kb_objects(n, NEXT_NART_ID, FIND_NART_BY_ID, $sym54$VALID_NART_);
    }

    public static SubLObject most_recent_assertions(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        return most_recent_kb_objects(n, NEXT_ASSERTION_ID, FIND_ASSERTION_BY_ID, $sym56$VALID_ASSERTION_);
    }

    public static SubLObject most_recent_deductions(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        return most_recent_kb_objects(n, NEXT_DEDUCTION_ID, FIND_DEDUCTION_BY_ID, $sym58$VALID_DEDUCTION_);
    }

    public static SubLObject most_recent_kb_hl_supports(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        return most_recent_kb_objects(n, NEXT_KB_HL_SUPPORT_ID, FIND_KB_HL_SUPPORT_BY_ID, $sym60$VALID_KB_HL_SUPPORT_);
    }

    public static SubLObject most_recent_kb_objects(final SubLObject n, final SubLObject next_id_fn, final SubLObject find_fn, final SubLObject valid_fn) {
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        SubLObject objects = NIL;
        SubLObject total = ZERO_INTEGER;
        final SubLObject start = funcall(next_id_fn);
        SubLObject doneP = numGE(total, n);
        if (NIL == doneP) {
            SubLObject id = NIL;
            id = start;
            while (NIL == doneP) {
                final SubLObject v_object = funcall(find_fn, id);
                if (NIL != funcall(valid_fn, v_object)) {
                    objects = cons(v_object, objects);
                    total = add(total, ONE_INTEGER);
                    doneP = numGE(total, n);
                }
                id = add(id, MINUS_ONE_INTEGER);
            } 
        }
        return nreverse(objects);
    }

    public static SubLObject previous_dump_kb_state_checkpoint() {
        final SubLObject constant_suid = constant_index_manager.get_file_backed_constant_internal_id_threshold();
        final SubLObject nart_id = nart_hl_formula_manager.get_file_backed_nart_id_threshold();
        final SubLObject assertion_id = assertion_manager.get_file_backed_assertion_id_threshold();
        final SubLObject kb_hl_support_id = kb_hl_support_manager.get_file_backed_kb_hl_support_id_threshold();
        final SubLObject deduction_id = deduction_manager.get_file_backed_deduction_id_threshold();
        return make_kb_state_checkpoint(constant_suid, nart_id, assertion_id, kb_hl_support_id, deduction_id);
    }

    public static SubLObject current_kb_state_checkpoint() {
        final SubLObject constant_suid = next_constant_suid();
        final SubLObject nart_id = nart_handles.next_nart_id();
        final SubLObject assertion_id = assertion_handles.next_assertion_id();
        final SubLObject kb_hl_support_id = kb_hl_support_handles.next_kb_hl_support_id();
        final SubLObject deduction_id = deduction_handles.next_deduction_id();
        return make_kb_state_checkpoint(constant_suid, nart_id, assertion_id, kb_hl_support_id, deduction_id);
    }

    public static SubLObject make_kb_state_checkpoint(final SubLObject constant_suid, final SubLObject nart_id, final SubLObject assertion_id, final SubLObject kb_hl_support_id, final SubLObject deduction_id) {
        return list(new SubLObject[]{ $CONSTANT, constant_suid, $NART, nart_id, $ASSERTION, assertion_id, $KB_HL_SUPPORT, kb_hl_support_id, $DEDUCTION, deduction_id });
    }

    public static SubLObject destructure_kb_state_checkpoint(final SubLObject kb_state_checkpoint) {
        final SubLObject constant_tail = property_list_member($CONSTANT, kb_state_checkpoint);
        final SubLObject constant = (NIL != constant_tail) ? cadr(constant_tail) : NIL;
        final SubLObject nart_tail = property_list_member($NART, kb_state_checkpoint);
        final SubLObject nart = (NIL != nart_tail) ? cadr(nart_tail) : NIL;
        final SubLObject assertion_tail = property_list_member($ASSERTION, kb_state_checkpoint);
        final SubLObject assertion = (NIL != assertion_tail) ? cadr(assertion_tail) : NIL;
        final SubLObject deduction_tail = property_list_member($DEDUCTION, kb_state_checkpoint);
        final SubLObject deduction = (NIL != deduction_tail) ? cadr(deduction_tail) : NIL;
        final SubLObject kb_hl_support_tail = property_list_member($KB_HL_SUPPORT, kb_state_checkpoint);
        final SubLObject kb_hl_support = (NIL != kb_hl_support_tail) ? cadr(kb_hl_support_tail) : NIL;
        return values(constant, nart, assertion, kb_hl_support, deduction);
    }

    public static SubLObject kb_checkpoint_difference(SubLObject earlier_kb_checkpoint, SubLObject later_kb_checkpoint) {
        if (earlier_kb_checkpoint == UNPROVIDED) {
            earlier_kb_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (later_kb_checkpoint == UNPROVIDED) {
            later_kb_checkpoint = current_kb_state_checkpoint();
        }
        return Mapping.mapcar(symbol_function($sym10$_), arg2(resetMultipleValues(), multiple_value_list(destructure_kb_state_checkpoint(later_kb_checkpoint))), new SubLObject[]{ arg2(resetMultipleValues(), multiple_value_list(destructure_kb_state_checkpoint(earlier_kb_checkpoint))) });
    }

    public static SubLObject save_hl_transcript(final SubLObject filename, SubLObject start_checkpoint, SubLObject end_checkpoint) {
        if (start_checkpoint == UNPROVIDED) {
            start_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (end_checkpoint == UNPROVIDED) {
            end_checkpoint = current_kb_state_checkpoint();
        }
        final SubLObject modification_spec = list($START_CHECKPOINT, start_checkpoint, $END_CHECKPOINT, end_checkpoint);
        return save_hl_transcript_from_modification_spec(filename, modification_spec);
    }

    public static SubLObject save_hl_transcript_from_modification_spec(final SubLObject filename, final SubLObject modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$6, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str70$Unable_to_open__S, filename);
                }
                final SubLObject stream_$7 = stream;
                result = save_hl_transcript_from_modification_spec_to_stream(stream_$7, modification_spec);
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject load_hl_transcript_new(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == UNPROVIDED) {
            error_mode = $WARN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_ops = ZERO_INTEGER;
        SubLObject success_ops = ZERO_INTEGER;
        SubLObject file_size = NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$9, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str70$Unable_to_open__S, filename);
                }
                SubLObject stream_$10 = stream;
                stream_$10 = file_utilities.enable_file_stream_memory_mapping(stream_$10);
                final SubLObject _prev_bind_0_$10 = $cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    $cfasl_input_guid_string_resource$.bind(get_new_cfasl_input_guid_string_resource(), thread);
                    file_size = file_length(stream_$10);
                    final SubLObject _prev_bind_0_$11 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$13 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(cconcatenate($$$Loading_HL_Transcript_, format_nil.format_nil_a_no_copy(filename)));
                            SubLObject hl_op = load_one_hl_transcript_operation(stream_$10);
                            SubLObject sofar = file_position(stream_$10, UNPROVIDED);
                            while ($EOF != hl_op) {
                                note_percent_progress(sofar, file_size);
                                if (NIL != process_hl_transcript_operation(hl_op, error_mode, total_ops)) {
                                    success_ops = add(success_ops, ONE_INTEGER);
                                }
                                total_ops = add(total_ops, ONE_INTEGER);
                                hl_op = load_one_hl_transcript_operation(stream_$10);
                                sofar = file_position(stream_$10, UNPROVIDED);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_1_$13, thread);
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$11, thread);
                    }
                } finally {
                    $cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return values(total_ops, subtract(total_ops, success_ops));
    }

    public static SubLObject show_hl_transcript(final SubLObject filename, SubLObject out_stream) {
        if (out_stream == UNPROVIDED) {
            out_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$16, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str70$Unable_to_open__S, filename);
                }
                SubLObject in_stream = stream;
                in_stream = file_utilities.enable_file_stream_memory_mapping(in_stream);
                final SubLObject _prev_bind_0_$17 = $cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    $cfasl_input_guid_string_resource$.bind(get_new_cfasl_input_guid_string_resource(), thread);
                    for (SubLObject hl_op = load_one_hl_transcript_operation(in_stream); $EOF != hl_op; hl_op = load_one_hl_transcript_operation(in_stream)) {
                        show_hl_transcript_operation(hl_op, out_stream);
                        total = add(total, ONE_INTEGER);
                    }
                } finally {
                    $cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject with_hl_transcript_compression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list75);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list75);
            if (NIL == member(current_$19, $list76, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list75);
        }
        final SubLObject modification_spec_tail = property_list_member($MODIFICATION_SPEC, current);
        final SubLObject modification_spec = (NIL != modification_spec_tail) ? cadr(modification_spec_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mod_spec_var = $sym78$MOD_SPEC_VAR;
        final SubLObject objects_to_compress = $sym79$OBJECTS_TO_COMPRESS;
        final SubLObject compression_sample = $sym80$COMPRESSION_SAMPLE;
        final SubLObject compression_options = $sym81$COMPRESSION_OPTIONS;
        return list(CLET, list(list(mod_spec_var, modification_spec), list(objects_to_compress, list(HL_TRANSCRIPT_OBJECTS_TO_COMPRESS, mod_spec_var)), list(compression_sample, list(APPEND, objects_to_compress, objects_to_compress)), list(compression_options, list(LIST, $EXTERNALIZED_, T, $ANALYZE, compression_sample))), listS(WITH_CFASL_COMPRESSION, list(stream, compression_options), append(body, NIL)), list(SAVE_ONE_HL_TRANSCRIPT_OPERATION, $list89, stream));
    }

    public static SubLObject save_hl_transcript_from_modification_spec_to_stream(final SubLObject stream, final SubLObject modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != $hl_transcript_compression_enabledP$.getDynamicValue(thread)) {
            final SubLObject objects_to_compress = hl_transcript_objects_to_compress(modification_spec);
            final SubLObject compression_sample = append(objects_to_compress, objects_to_compress);
            final SubLObject compression_options = list($EXTERNALIZED_, T, $ANALYZE, compression_sample);
            final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
            try {
                cfasl_compression.$cfasl_output_compression_options$.bind(compression_options, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream), thread);
                cfasl_compression.with_cfasl_compression_preamble(stream);
                result = save_hl_transcript_from_modification_spec_to_stream_int(stream, modification_spec);
                cfasl_compression.with_cfasl_compression_postamble(stream);
            } finally {
                cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_3, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_2, thread);
                cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0, thread);
            }
            save_one_hl_transcript_operation($list90, stream);
        } else {
            result = save_hl_transcript_from_modification_spec_to_stream_int(stream, modification_spec);
        }
        return result;
    }

    public static SubLObject save_hl_transcript_from_modification_spec_to_stream_int(final SubLObject stream, final SubLObject hl_modification_spec) {
        final SubLObject removals_result = save_hl_transcript_removals_from_modification_spec_to_stream(stream, hl_modification_spec);
        final SubLObject additions_result = save_hl_transcript_additions_from_modification_spec_to_stream(stream, hl_modification_spec);
        final SubLObject complete_result = list_utilities.merge_plist(additions_result, removals_result);
        return complete_result;
    }

    public static SubLObject save_hl_transcript_additions_from_modification_spec_to_stream(final SubLObject stream, final SubLObject hl_modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_checkpoint_tail = property_list_member($START_CHECKPOINT, hl_modification_spec);
        final SubLObject start_checkpoint = (NIL != start_checkpoint_tail) ? cadr(start_checkpoint_tail) : NIL;
        final SubLObject end_checkpoint_tail = property_list_member($END_CHECKPOINT, hl_modification_spec);
        final SubLObject end_checkpoint = (NIL != end_checkpoint_tail) ? cadr(end_checkpoint_tail) : NIL;
        final SubLObject new_constants_tail = property_list_member($NEW_CONSTANTS, hl_modification_spec);
        final SubLObject new_constants = (NIL != new_constants_tail) ? cadr(new_constants_tail) : NIL;
        final SubLObject new_narts_tail = property_list_member($NEW_NARTS, hl_modification_spec);
        final SubLObject new_narts = (NIL != new_narts_tail) ? cadr(new_narts_tail) : NIL;
        final SubLObject new_assertions_tail = property_list_member($NEW_ASSERTIONS, hl_modification_spec);
        final SubLObject new_assertions = (NIL != new_assertions_tail) ? cadr(new_assertions_tail) : NIL;
        final SubLObject new_kb_hl_supports_tail = property_list_member($NEW_KB_HL_SUPPORTS, hl_modification_spec);
        final SubLObject new_kb_hl_supports = (NIL != new_kb_hl_supports_tail) ? cadr(new_kb_hl_supports_tail) : NIL;
        final SubLObject new_deductions_tail = property_list_member($NEW_DEDUCTIONS, hl_modification_spec);
        final SubLObject new_deductions = (NIL != new_deductions_tail) ? cadr(new_deductions_tail) : NIL;
        final SubLObject kb_checkpointP = makeBoolean((NIL != start_checkpoint) && (NIL != end_checkpoint));
        SubLObject constant_suid_start = NIL;
        SubLObject nart_id_start = NIL;
        SubLObject assertion_id_start = NIL;
        SubLObject kb_hl_support_id_start = NIL;
        SubLObject deduction_id_start = NIL;
        SubLObject constant_suid_end = NIL;
        SubLObject nart_id_end = NIL;
        SubLObject assertion_id_end = NIL;
        SubLObject kb_hl_support_id_end = NIL;
        SubLObject deduction_id_end = NIL;
        SubLObject total_constants = ZERO_INTEGER;
        SubLObject total_narts = ZERO_INTEGER;
        SubLObject total_assertions = ZERO_INTEGER;
        SubLObject total_kb_hl_supports = ZERO_INTEGER;
        SubLObject total_deductions = ZERO_INTEGER;
        SubLObject result = NIL;
        if (NIL != kb_checkpointP) {
            thread.resetMultipleValues();
            final SubLObject constant_suid_start_$20 = destructure_kb_state_checkpoint(start_checkpoint);
            final SubLObject nart_id_start_$21 = thread.secondMultipleValue();
            final SubLObject assertion_id_start_$22 = thread.thirdMultipleValue();
            final SubLObject kb_hl_support_id_start_$23 = thread.fourthMultipleValue();
            final SubLObject deduction_id_start_$24 = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            constant_suid_start = constant_suid_start_$20;
            nart_id_start = nart_id_start_$21;
            assertion_id_start = assertion_id_start_$22;
            kb_hl_support_id_start = kb_hl_support_id_start_$23;
            deduction_id_start = deduction_id_start_$24;
            thread.resetMultipleValues();
            final SubLObject constant_suid_end_$25 = destructure_kb_state_checkpoint(end_checkpoint);
            final SubLObject nart_id_end_$26 = thread.secondMultipleValue();
            final SubLObject assertion_id_end_$27 = thread.thirdMultipleValue();
            final SubLObject kb_hl_support_id_end_$28 = thread.fourthMultipleValue();
            final SubLObject deduction_id_end_$29 = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            constant_suid_end = constant_suid_end_$25;
            nart_id_end = nart_id_end_$26;
            assertion_id_end = assertion_id_end_$27;
            kb_hl_support_id_end = kb_hl_support_id_end_$28;
            deduction_id_end = deduction_id_end_$29;
        }
        if (NIL != kb_checkpointP) {
            final SubLObject progress_var = $$$saving_constants;
            final SubLObject total_var = subtract(constant_suid_end, constant_suid_start);
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject constant;
                    for (end_var = constant_suid_end, id_var = NIL, id_var = constant_suid_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        constant = constants_high.find_constant_by_internal_id(id_var);
                        if (NIL != constant_p(constant)) {
                            note_constants_by_internal_id_progress(constant, constant_suid_start, total_var);
                            write_constant_to_hl_transcript_stream(constant, stream);
                            total_constants = add(total_constants, ONE_INTEGER);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != new_constants) {
            final SubLObject message_var = $$$saving_constants;
            final SubLObject list_var = new_constants;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = length(list_var);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject constant2 = NIL;
                    constant2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        write_constant_to_hl_transcript_stream(constant2, stream);
                        total_constants = add(total_constants, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        constant2 = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (NIL != kb_checkpointP) {
            final SubLObject progress_var = $$$saving_NARTs;
            final SubLObject total_var = subtract(nart_id_end, nart_id_start);
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject nart;
                    for (end_var = nart_id_end, id_var = NIL, id_var = nart_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        nart = nart_handles.find_nart_by_id(id_var);
                        if (NIL != nart_handles.nart_p(nart)) {
                            note_narts_by_id_progress(nart, nart_id_start, total_var);
                            write_nart_to_hl_transcript_stream(nart, stream);
                            total_narts = add(total_narts, ONE_INTEGER);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != new_narts) {
            final SubLObject message_var = $$$saving_NARTs;
            final SubLObject list_var = new_narts;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = length(list_var);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject nart2 = NIL;
                    nart2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        write_nart_to_hl_transcript_stream(nart2, stream);
                        total_narts = add(total_narts, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        nart2 = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (NIL != kb_checkpointP) {
            final SubLObject progress_var = $$$saving_assertions;
            final SubLObject total_var = subtract(assertion_id_end, assertion_id_start);
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject assertion;
                    for (end_var = assertion_id_end, id_var = NIL, id_var = assertion_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        assertion = assertion_handles.find_assertion_by_id(id_var);
                        if (NIL != assertion_handles.assertion_p(assertion)) {
                            note_assertions_by_id_progress(assertion, assertion_id_start, total_var);
                            write_assertion_to_hl_transcript_stream(assertion, stream);
                            total_assertions = add(total_assertions, ONE_INTEGER);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != new_assertions) {
            final SubLObject message_var = $$$saving_assertions;
            final SubLObject list_var = new_assertions;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = length(list_var);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        write_assertion_to_hl_transcript_stream(assertion2, stream);
                        total_assertions = add(total_assertions, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion2 = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values6 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values6);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (NIL != kb_checkpointP) {
            final SubLObject progress_var = $$$saving_KB_HL_supports;
            final SubLObject total_var = subtract(kb_hl_support_id_end, kb_hl_support_id_start);
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject kb_hl_support;
                    for (end_var = kb_hl_support_id_end, id_var = NIL, id_var = kb_hl_support_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(id_var);
                        if (NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                            note_kb_hl_supports_by_id_progress(kb_hl_support, kb_hl_support_id_start, total_var);
                            write_kb_hl_support_to_hl_transcript_stream(kb_hl_support, stream);
                            total_kb_hl_supports = add(total_kb_hl_supports, ONE_INTEGER);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values7 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values7);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != new_kb_hl_supports) {
            final SubLObject message_var = $$$saving_KB_HL_supports;
            final SubLObject list_var = new_kb_hl_supports;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = length(list_var);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject kb_hl_support2 = NIL;
                    kb_hl_support2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        write_kb_hl_support_to_hl_transcript_stream(kb_hl_support2, stream);
                        total_kb_hl_supports = add(total_kb_hl_supports, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        kb_hl_support2 = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values8 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values8);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (NIL != kb_checkpointP) {
            final SubLObject progress_var = $$$saving_deductions;
            final SubLObject total_var = subtract(deduction_id_end, deduction_id_start);
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject deduction;
                    for (end_var = deduction_id_end, id_var = NIL, id_var = deduction_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        deduction = deduction_handles.find_deduction_by_id(id_var);
                        if (NIL != deduction_handles.deduction_p(deduction)) {
                            note_deductions_by_id_progress(deduction, deduction_id_start, total_var);
                            write_deduction_to_hl_transcript_stream(deduction, stream);
                            total_deductions = add(total_deductions, ONE_INTEGER);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values9 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values9);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != new_deductions) {
            final SubLObject message_var = $$$saving_deductions;
            final SubLObject list_var = new_deductions;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = length(list_var);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject deduction2 = NIL;
                    deduction2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        write_deduction_to_hl_transcript_stream(deduction2, stream);
                        total_deductions = add(total_deductions, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        deduction2 = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values10 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values10);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        result = list(new SubLObject[]{ $CONSTANTS, total_constants, $NARTS, total_narts, $ASSERTIONS, total_assertions, $KB_HL_SUPPORTS, total_kb_hl_supports, $DEDUCTIONS, total_deductions });
        return result;
    }

    public static SubLObject save_hl_transcript_removals_from_modification_spec_to_stream(final SubLObject stream, final SubLObject hl_modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transcript_file_tail = property_list_member($TRANSCRIPT_FILE, hl_modification_spec);
        final SubLObject transcript_file = (NIL != transcript_file_tail) ? cadr(transcript_file_tail) : NIL;
        final SubLObject remove_constants_tail = property_list_member($REMOVE_CONSTANTS, hl_modification_spec);
        final SubLObject remove_constants = (NIL != remove_constants_tail) ? cadr(remove_constants_tail) : NIL;
        final SubLObject remove_narts_tail = property_list_member($REMOVE_NARTS, hl_modification_spec);
        final SubLObject remove_narts = (NIL != remove_narts_tail) ? cadr(remove_narts_tail) : NIL;
        final SubLObject remove_assertions_tail = property_list_member($REMOVE_ASSERTIONS, hl_modification_spec);
        final SubLObject remove_assertions = (NIL != remove_assertions_tail) ? cadr(remove_assertions_tail) : NIL;
        final SubLObject remove_deductions_tail = property_list_member($REMOVE_DEDUCTIONS, hl_modification_spec);
        final SubLObject remove_deductions = (NIL != remove_deductions_tail) ? cadr(remove_deductions_tail) : NIL;
        SubLObject total_constants = ZERO_INTEGER;
        final SubLObject total_narts = ZERO_INTEGER;
        SubLObject total_assertions = ZERO_INTEGER;
        final SubLObject total_kb_hl_supports = ZERO_INTEGER;
        final SubLObject total_deductions = ZERO_INTEGER;
        SubLObject result = NIL;
        if (NIL != remove_constants) {
            SubLObject cdolist_list_var = remove_constants;
            SubLObject constant = NIL;
            constant = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_existing_constant_removal_to_hl_transcript_stream(constant, stream);
                total_constants = add(total_constants, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                constant = cdolist_list_var.first();
            } 
        }
        if (NIL != transcript_file) {
            SubLObject current_$41;
            final SubLObject datum_$40 = current_$41 = (transcript_file.isString()) ? list(transcript_file) : transcript_file;
            SubLObject transcript_filename = NIL;
            destructuring_bind_must_consp(current_$41, datum_$40, $list111);
            transcript_filename = current_$41.first();
            current_$41 = current_$41.rest();
            final SubLObject start_op = (current_$41.isCons()) ? current_$41.first() : ZERO_INTEGER;
            destructuring_bind_must_listp(current_$41, datum_$40, $list111);
            current_$41 = current_$41.rest();
            final SubLObject end_op = (current_$41.isCons()) ? current_$41.first() : NIL;
            destructuring_bind_must_listp(current_$41, datum_$40, $list111);
            current_$41 = current_$41.rest();
            if (NIL == current_$41) {
                final SubLObject op_iterator = new_transcript_file_kb_removal_operations_iterator(transcript_filename, start_op, end_op);
                try {
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject op = iteration.iteration_next(op_iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            final SubLObject form = fourth(op);
                            SubLObject current_$42;
                            final SubLObject datum_$41 = current_$42 = form;
                            SubLObject method = NIL;
                            destructuring_bind_must_consp(current_$42, datum_$41, $list112);
                            method = current_$42.first();
                            final SubLObject args;
                            current_$42 = args = current_$42.rest();
                            final SubLObject pcase_var = method;
                            if (pcase_var.eql(FI_KILL)) {
                                SubLObject current_$43;
                                final SubLObject datum_$42 = current_$43 = args;
                                SubLObject encapsulated_constant = NIL;
                                destructuring_bind_must_consp(current_$43, datum_$42, $list114);
                                encapsulated_constant = current_$43.first();
                                current_$43 = current_$43.rest();
                                if (NIL == current_$43) {
                                    encapsulated_constant = list_utilities.unquotify(encapsulated_constant);
                                    write_constant_removal_to_hl_transcript_stream(encapsulated_constant, stream);
                                    total_constants = add(total_constants, ONE_INTEGER);
                                } else {
                                    cdestructuring_bind_error(datum_$42, $list114);
                                }
                            } else
                                if (pcase_var.eql(FI_MERGE)) {
                                    SubLObject current_$44;
                                    final SubLObject datum_$43 = current_$44 = args;
                                    SubLObject encapsulated_kill = NIL;
                                    SubLObject encapsulated_keep = NIL;
                                    destructuring_bind_must_consp(current_$44, datum_$43, $list116);
                                    encapsulated_kill = current_$44.first();
                                    current_$44 = current_$44.rest();
                                    destructuring_bind_must_consp(current_$44, datum_$43, $list116);
                                    encapsulated_keep = current_$44.first();
                                    current_$44 = current_$44.rest();
                                    if (NIL == current_$44) {
                                        encapsulated_kill = list_utilities.unquotify(encapsulated_kill);
                                        write_constant_removal_to_hl_transcript_stream(encapsulated_kill, stream);
                                        total_constants = add(total_constants, ONE_INTEGER);
                                    } else {
                                        cdestructuring_bind_error(datum_$43, $list116);
                                    }
                                } else
                                    if (pcase_var.eql(FI_UNASSERT)) {
                                        SubLObject current_$45;
                                        final SubLObject datum_$44 = current_$45 = args;
                                        SubLObject encapsulated_sentence = NIL;
                                        SubLObject encapsulated_mt = NIL;
                                        destructuring_bind_must_consp(current_$45, datum_$44, $list118);
                                        encapsulated_sentence = current_$45.first();
                                        current_$45 = current_$45.rest();
                                        destructuring_bind_must_consp(current_$45, datum_$44, $list118);
                                        encapsulated_mt = current_$45.first();
                                        current_$45 = current_$45.rest();
                                        if (NIL == current_$45) {
                                            encapsulated_sentence = list_utilities.unquotify(encapsulated_sentence);
                                            encapsulated_mt = list_utilities.unquotify(encapsulated_mt);
                                            write_assertion_unassert_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
                                            total_assertions = add(total_assertions, ONE_INTEGER);
                                        } else {
                                            cdestructuring_bind_error(datum_$44, $list118);
                                        }
                                    } else
                                        if (pcase_var.eql(FI_BLAST)) {
                                            SubLObject current_$46;
                                            final SubLObject datum_$45 = current_$46 = args;
                                            SubLObject encapsulated_sentence = NIL;
                                            SubLObject encapsulated_mt = NIL;
                                            destructuring_bind_must_consp(current_$46, datum_$45, $list118);
                                            encapsulated_sentence = current_$46.first();
                                            current_$46 = current_$46.rest();
                                            destructuring_bind_must_consp(current_$46, datum_$45, $list118);
                                            encapsulated_mt = current_$46.first();
                                            current_$46 = current_$46.rest();
                                            if (NIL == current_$46) {
                                                encapsulated_sentence = list_utilities.unquotify(encapsulated_sentence);
                                                encapsulated_mt = list_utilities.unquotify(encapsulated_mt);
                                                write_assertion_removal_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
                                                total_assertions = add(total_assertions, ONE_INTEGER);
                                            } else {
                                                cdestructuring_bind_error(datum_$45, $list118);
                                            }
                                        } else {
                                            Errors.warn($str120$time_to_implement__S, method);
                                        }



                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        iteration.iteration_finalize(op_iterator);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum_$40, $list111);
            }
        }
        result = list(new SubLObject[]{ $REMOVED_CONSTANTS, total_constants, $REMOVED_NARTS, total_narts, $REMOVED_ASSERTIONS, total_assertions, $REMOVED_KB_HL_SUPPORTS, total_kb_hl_supports, $REMOVED_DEDUCTIONS, total_deductions });
        result = plist_remove_value(result, ZERO_INTEGER, UNPROVIDED);
        return result;
    }

    public static SubLObject plist_remove_value(final SubLObject plist, final SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.alist_to_plist(delete(value, list_utilities.plist_to_alist(plist), test, symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject save_one_hl_transcript_operation(final SubLObject hl_op, final SubLObject stream) {
        return cfasl_output_externalized(hl_op, stream);
    }

    public static SubLObject load_one_hl_transcript_operation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $bootstrapping_kbP$.currentBinding(thread);
        try {
            $bootstrapping_kbP$.bind(T, thread);
            result = cfasl_input(stream, NIL, $EOF);
        } finally {
            $bootstrapping_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject process_hl_transcript_operation(final SubLObject hl_op, final SubLObject error_mode, final SubLObject total_ops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = NIL;
        if (error_mode.eql($IGNORE)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        process_hl_transcript_operation_int(hl_op);
                        success = T;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else
            if (error_mode.eql($WARN)) {
                SubLObject error_message = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            process_hl_transcript_operation_int(hl_op);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error_message) {
                    Errors.warn($str131$operation__S___S___A, total_ops, hl_op, error_message);
                } else {
                    success = T;
                }
            } else
                if (error_mode.eql($ERROR)) {
                    process_hl_transcript_operation_int(hl_op);
                    success = T;
                } else {
                    Errors.error($str133$unexpected_error_mode__S, error_mode);
                }


        return success;
    }

    public static SubLObject process_hl_transcript_operation_int(final SubLObject hl_op) {
        SubLObject current;
        final SubLObject datum = current = possibly_transform_hl_op_wrt_compatibility(hl_op);
        SubLObject function_spec = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list134);
        function_spec = current.first();
        current = args = current.rest();
        return apply(function_spec, args);
    }

    public static SubLObject show_hl_transcript_operation(SubLObject hl_op, final SubLObject stream) {
        hl_op = possibly_transform_hl_op_wrt_compatibility(hl_op);
        print(hl_op, stream);
        return hl_op;
    }

    public static SubLObject possibly_transform_hl_op_wrt_compatibility(final SubLObject hl_op) {
        SubLObject function_spec = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(hl_op, hl_op, $list134);
        function_spec = hl_op.first();
        final SubLObject current = args = hl_op.rest();
        final SubLObject pcase_var = function_spec;
        if (pcase_var.eql(CYC_FIND_OR_CREATE_CANONICAL_NART)) {
            function_spec = HLT_FIND_OR_CREATE_NART;
        } else
            if (pcase_var.eql(CYC_FIND_OR_CREATE)) {
                function_spec = HLT_FIND_OR_CREATE;
            } else
                if (pcase_var.eql(FIND_OR_CREATE_ASSERTION)) {
                    function_spec = HLT_FIND_OR_CREATE_ASSERTION;
                } else
                    if (pcase_var.eql(FIND_OR_CREATE_KB_HL_SUPPORT)) {
                        function_spec = HLT_FIND_OR_CREATE_KB_HL_SUPPORT;
                    } else {
                        if (!pcase_var.eql(TMS_ADD_DEDUCTION_FOR_ASSERTION)) {
                            return hl_op;
                        }
                        function_spec = HLT_FIND_OR_CREATE_DEDUCTION;
                    }



        return listS(function_spec, args);
    }

    public static SubLObject hl_transcript_objects_to_compress(final SubLObject modification_spec) {
        final SubLObject object_reference_alist = compressible_references_in_modification_spec(modification_spec, TWO_INTEGER);
        final SubLObject referenced_constants = list_utilities.alist_keys(object_reference_alist);
        final SubLObject objects_to_compress = append($hl_transcript_common_symbols$.getGlobalValue(), referenced_constants, $hl_transcript_el_constants$.getGlobalValue());
        return objects_to_compress;
    }

    public static SubLObject new_objects_between_kb_checkpoints(SubLObject start_checkpoint, SubLObject end_checkpoint) {
        if (start_checkpoint == UNPROVIDED) {
            start_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (end_checkpoint == UNPROVIDED) {
            end_checkpoint = current_kb_state_checkpoint();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject constant_suid_start = destructure_kb_state_checkpoint(start_checkpoint);
        final SubLObject nart_id_start = thread.secondMultipleValue();
        final SubLObject assertion_id_start = thread.thirdMultipleValue();
        final SubLObject kb_hl_support_id_start = thread.fourthMultipleValue();
        final SubLObject deduction_id_start = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject constant_suid_end = destructure_kb_state_checkpoint(end_checkpoint);
        final SubLObject nart_id_end = thread.secondMultipleValue();
        final SubLObject assertion_id_end = thread.thirdMultipleValue();
        final SubLObject kb_hl_support_id_end = thread.fourthMultipleValue();
        final SubLObject deduction_id_end = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        SubLObject new_constants = NIL;
        SubLObject new_narts = NIL;
        SubLObject new_assertions = NIL;
        SubLObject new_kb_hl_supports = NIL;
        SubLObject new_deductions = NIL;
        SubLObject end_var;
        SubLObject id_var;
        SubLObject constant;
        for (end_var = constant_suid_end, id_var = NIL, id_var = constant_suid_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            constant = constants_high.find_constant_by_internal_id(id_var);
            if (NIL != constant_p(constant)) {
                new_constants = cons(constant, new_constants);
            }
        }
        SubLObject nart;
        for (end_var = nart_id_end, id_var = NIL, id_var = nart_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            nart = nart_handles.find_nart_by_id(id_var);
            if (NIL != nart_handles.nart_p(nart)) {
                new_narts = cons(nart, new_narts);
            }
        }
        SubLObject assertion;
        for (end_var = assertion_id_end, id_var = NIL, id_var = assertion_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            assertion = assertion_handles.find_assertion_by_id(id_var);
            if (NIL != assertion_handles.assertion_p(assertion)) {
                new_assertions = cons(assertion, new_assertions);
            }
        }
        SubLObject kb_hl_support;
        for (end_var = kb_hl_support_id_end, id_var = NIL, id_var = kb_hl_support_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(id_var);
            if (NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                new_kb_hl_supports = cons(kb_hl_support, new_kb_hl_supports);
            }
        }
        SubLObject deduction;
        for (end_var = deduction_id_end, id_var = NIL, id_var = deduction_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            deduction = deduction_handles.find_deduction_by_id(id_var);
            if (NIL != deduction_handles.deduction_p(deduction)) {
                new_deductions = cons(deduction, new_deductions);
            }
        }
        return list(new SubLObject[]{ $NEW_CONSTANTS, new_constants, $NEW_NARTS, new_narts, $NEW_ASSERTIONS, new_assertions, $NEW_KB_HL_SUPPORTS, new_kb_hl_supports, $NEW_DEDUCTIONS, new_deductions });
    }

    public static SubLObject gathering_new_kb_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        result_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject start = $sym148$START;
            return listS(CLET, list(bq_cons(start, $list149)), append(body, list(list(CSETQ, result_var, list(NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS, start)))));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static SubLObject gathering_rules_used_in_new_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list152);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rules_var = NIL;
        destructuring_bind_must_consp(current, datum, $list152);
        rules_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$52 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list152);
            current_$52 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list152);
            if (NIL == member(current_$52, $list153, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$52 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list152);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : $FORWARD;
        final SubLObject body;
        current = body = temp;
        final SubLObject new_objects = $sym156$NEW_OBJECTS;
        return list(CLET, list(new_objects), listS(GATHERING_NEW_KB_OBJECTS, list(new_objects), append(body, NIL)), list(CSETQ, rules_var, list(GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS, new_objects, direction)));
    }

    public static SubLObject gathering_rules_used_in_new_deductions_postprocess(final SubLObject new_objects, final SubLObject direction) {
        final SubLObject new_deductions_tail = property_list_member($NEW_DEDUCTIONS, new_objects);
        final SubLObject new_deductions = (NIL != new_deductions_tail) ? cadr(new_deductions_tail) : NIL;
        final SubLObject rule_set = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = new_deductions;
        SubLObject deduction = NIL;
        deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$53;
            final SubLObject supports = cdolist_list_var_$53 = deductions_high.deduction_supports(deduction);
            SubLObject support = NIL;
            support = cdolist_list_var_$53.first();
            while (NIL != cdolist_list_var_$53) {
                if ((NIL != assertions_high.rule_assertionP(support)) && ((NIL == direction) || (NIL != assertions_high.assertion_has_direction(support, direction)))) {
                    set.set_add(support, rule_set);
                }
                cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                support = cdolist_list_var_$53.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        } 
        final SubLObject raw_rules = set.set_element_list(rule_set);
        final SubLObject useful_rules = assertion_utilities.sort_assertions(raw_rules);
        return useful_rules;
    }

    public static SubLObject compressible_references_in_modification_spec(final SubLObject hl_modification_spec, SubLObject minimum) {
        if (minimum == UNPROVIDED) {
            minimum = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_checkpoint_tail = property_list_member($START_CHECKPOINT, hl_modification_spec);
        final SubLObject start_checkpoint = (NIL != start_checkpoint_tail) ? cadr(start_checkpoint_tail) : NIL;
        final SubLObject end_checkpoint_tail = property_list_member($END_CHECKPOINT, hl_modification_spec);
        final SubLObject end_checkpoint = (NIL != end_checkpoint_tail) ? cadr(end_checkpoint_tail) : NIL;
        final SubLObject new_constants_tail = property_list_member($NEW_CONSTANTS, hl_modification_spec);
        final SubLObject new_constants = (NIL != new_constants_tail) ? cadr(new_constants_tail) : NIL;
        final SubLObject new_narts_tail = property_list_member($NEW_NARTS, hl_modification_spec);
        final SubLObject new_narts = (NIL != new_narts_tail) ? cadr(new_narts_tail) : NIL;
        final SubLObject new_assertions_tail = property_list_member($NEW_ASSERTIONS, hl_modification_spec);
        final SubLObject new_assertions = (NIL != new_assertions_tail) ? cadr(new_assertions_tail) : NIL;
        final SubLObject new_kb_hl_supports_tail = property_list_member($NEW_KB_HL_SUPPORTS, hl_modification_spec);
        final SubLObject new_kb_hl_supports = (NIL != new_kb_hl_supports_tail) ? cadr(new_kb_hl_supports_tail) : NIL;
        final SubLObject new_deductions_tail = property_list_member($NEW_DEDUCTIONS, hl_modification_spec);
        final SubLObject new_deductions = (NIL != new_deductions_tail) ? cadr(new_deductions_tail) : NIL;
        final SubLObject kb_checkpointP = makeBoolean((NIL != start_checkpoint) && (NIL != end_checkpoint));
        SubLObject constant_suid_start = NIL;
        SubLObject nart_id_start = NIL;
        SubLObject assertion_id_start = NIL;
        SubLObject kb_hl_support_id_start = NIL;
        SubLObject deduction_id_start = NIL;
        SubLObject constant_suid_end = NIL;
        SubLObject nart_id_end = NIL;
        SubLObject assertion_id_end = NIL;
        SubLObject kb_hl_support_id_end = NIL;
        SubLObject deduction_id_end = NIL;
        SubLObject result = NIL;
        if (NIL != kb_checkpointP) {
            thread.resetMultipleValues();
            final SubLObject constant_suid_start_$54 = destructure_kb_state_checkpoint(start_checkpoint);
            final SubLObject nart_id_start_$55 = thread.secondMultipleValue();
            final SubLObject assertion_id_start_$56 = thread.thirdMultipleValue();
            final SubLObject kb_hl_support_id_start_$57 = thread.fourthMultipleValue();
            final SubLObject deduction_id_start_$58 = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            constant_suid_start = constant_suid_start_$54;
            nart_id_start = nart_id_start_$55;
            assertion_id_start = assertion_id_start_$56;
            kb_hl_support_id_start = kb_hl_support_id_start_$57;
            deduction_id_start = deduction_id_start_$58;
            thread.resetMultipleValues();
            final SubLObject constant_suid_end_$59 = destructure_kb_state_checkpoint(end_checkpoint);
            final SubLObject nart_id_end_$60 = thread.secondMultipleValue();
            final SubLObject assertion_id_end_$61 = thread.thirdMultipleValue();
            final SubLObject kb_hl_support_id_end_$62 = thread.fourthMultipleValue();
            final SubLObject deduction_id_end_$63 = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            constant_suid_end = constant_suid_end_$59;
            nart_id_end = nart_id_end_$60;
            assertion_id_end = assertion_id_end_$61;
            kb_hl_support_id_end = kb_hl_support_id_end_$62;
            deduction_id_end = deduction_id_end_$63;
        }
        final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
        try {
            $mapping_target$.bind(make_hash_table($int$500, symbol_function(EQUAL), UNPROVIDED), thread);
            if (NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject constant;
                for (end_var = constant_suid_end, id_var = NIL, id_var = constant_suid_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    constant = constants_high.find_constant_by_internal_id(id_var);
                    if (NIL != constant_p(constant)) {
                        increment_compressible_object_mention_count(constant);
                    }
                }
            }
            SubLObject cdolist_list_var = new_constants;
            SubLObject constant2 = NIL;
            constant2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                increment_compressible_object_mention_count(constant2);
                cdolist_list_var = cdolist_list_var.rest();
                constant2 = cdolist_list_var.first();
            } 
            if (NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject nart;
                for (end_var = nart_id_end, id_var = NIL, id_var = nart_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    nart = nart_handles.find_nart_by_id(id_var);
                    if (NIL != nart_handles.nart_p(nart)) {
                        cycl_utilities.nart_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, nart, T, UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_narts;
            SubLObject nart2 = NIL;
            nart2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cycl_utilities.nart_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, nart2, T, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                nart2 = cdolist_list_var.first();
            } 
            if (NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject assertion;
                for (end_var = assertion_id_end, id_var = NIL, id_var = assertion_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    assertion = assertion_handles.find_assertion_by_id(id_var);
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        cycl_utilities.assertion_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, assertion, T, UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_assertions;
            SubLObject assertion2 = NIL;
            assertion2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cycl_utilities.assertion_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, assertion2, T, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion2 = cdolist_list_var.first();
            } 
            if (NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject kb_hl_support;
                for (end_var = kb_hl_support_id_end, id_var = NIL, id_var = kb_hl_support_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(id_var);
                    if (NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                        kb_hl_support_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, kb_hl_support, T, UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_kb_hl_supports;
            SubLObject kb_hl_support2 = NIL;
            kb_hl_support2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                kb_hl_support_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, kb_hl_support2, T, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support2 = cdolist_list_var.first();
            } 
            if (NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject deduction;
                for (end_var = deduction_id_end, id_var = NIL, id_var = deduction_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    deduction = deduction_handles.find_deduction_by_id(id_var);
                    if (NIL != deduction_handles.deduction_p(deduction)) {
                        deduction_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, deduction, T, UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_deductions;
            SubLObject deduction2 = NIL;
            deduction2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                deduction_map(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, deduction2, T, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                deduction2 = cdolist_list_var.first();
            } 
            result = hash_table_utilities.hash_table_to_alist($mapping_target$.getDynamicValue(thread));
        } finally {
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        if (minimum.numG(ONE_INTEGER)) {
            result = delete(minimum, result, symbol_function($sym162$_), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        result = Sort.sort(result, symbol_function($sym162$_), symbol_function(CDR));
        return result;
    }

    public static SubLObject increment_compressible_object_mention_count(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != constant_p(v_object)) || (v_object.isString() && (NIL != list_utilities.lengthGE(v_object, $int$32, UNPROVIDED)))) {
            sethash(v_object, $mapping_target$.getDynamicValue(thread), add(gethash_without_values(v_object, $mapping_target$.getDynamicValue(thread), ZERO_INTEGER), ONE_INTEGER));
            return T;
        }
        return NIL;
    }

    public static SubLObject deduction_map(final SubLObject function, final SubLObject deduction, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        final SubLObject justification = deductions_high.deduction_supports(deduction);
        expression_map_support(function, supported_object, penetrate_hl_structuresP, key);
        SubLObject cdolist_list_var = justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            expression_map_support(function, support, penetrate_hl_structuresP, key);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject kb_hl_support_map(final SubLObject function, final SubLObject kb_hl_support, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : "kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + "CommonSymbols.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + kb_hl_support;
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
        expression_map_support(function, hl_support, penetrate_hl_structuresP, key);
        SubLObject cdolist_list_var = justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            expression_map_support(function, support, penetrate_hl_structuresP, key);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject expression_map_support(final SubLObject function, final SubLObject v_object, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            cycl_utilities.assertion_map(function, v_object, penetrate_hl_structuresP, key);
        } else
            if (NIL != kb_hl_support_handles.kb_hl_support_p(v_object)) {
                kb_hl_support_map(function, v_object, penetrate_hl_structuresP, key);
            } else
                if (NIL != arguments.hl_support_p(v_object)) {
                    cycl_utilities.expression_map(function, arguments.support_sentence(v_object), penetrate_hl_structuresP, key);
                    cycl_utilities.expression_map(function, arguments.support_mt(v_object), penetrate_hl_structuresP, key);
                } else {
                    Errors.error($str164$_S_was_not_a_support_p, v_object);
                }


        return NIL;
    }

    public static SubLObject with_hl_transcript_created_constant_equivalence_by_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list165, append(body, NIL));
    }

    public static SubLObject new_hlt_external_id_equivalence_map() {
        return dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject hlt_possibly_find_via_external_id_equivalence(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != map_utilities.map_p($hl_transcript_constant_external_id_equivalence_map$.getDynamicValue(thread))) {
            final SubLObject existing_by_name = fi.fi_find_int(name);
            if (NIL != constant_p(existing_by_name)) {
                if (NIL == constants_high.constant_has_external_id(existing_by_name, external_id)) {
                    final SubLObject preferred_external_id = constants_high.constant_external_id(existing_by_name);
                    map_utilities.map_put($hl_transcript_constant_external_id_equivalence_map$.getDynamicValue(thread), external_id, preferred_external_id);
                }
                return existing_by_name;
            }
        }
        return NIL;
    }

    public static SubLObject write_constant_to_hl_transcript_stream(final SubLObject constant, final SubLObject stream) {
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject external_id = constants_high.constant_external_id(constant);
        final SubLObject hl_operation = list(HLT_FIND_OR_CREATE, name, external_id);
        save_one_hl_transcript_operation(hl_operation, stream);
        return constant;
    }

    public static SubLObject hlt_find_or_create(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        SubLObject constant = (NIL != external_id) ? hlt_possibly_find_via_external_id_equivalence(name, external_id) : NIL;
        if (NIL == constant) {
            constant = fi.fi_create_int(name, external_id);
        }
        return constant;
    }

    public static SubLObject hlt_find_or_create_missing_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLObject constant = hlt_find_or_create(name, external_id);
        if (NIL != constant) {
            Errors.warn($str168$missing_constant_added___S, constant);
            return constant;
        }
        return NIL;
    }

    public static SubLObject write_nart_to_hl_transcript_stream(final SubLObject nart, final SubLObject stream) {
        final SubLObject hl_formula = narts_high.nart_hl_formula(nart);
        final SubLObject hl_operation = list(HLT_FIND_OR_CREATE_NART, hl_formula);
        save_one_hl_transcript_operation(hl_operation, stream);
        return nart;
    }

    public static SubLObject hlt_find_or_create_nart(final SubLObject hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $bootstrapping_kbP$.currentBinding(thread);
        try {
            $bootstrapping_kbP$.bind(T, thread);
            result = czer_main.cyc_find_or_create_canonical_nart(hl_formula);
        } finally {
            $bootstrapping_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject hlt_find_or_create_missing_nart(final SubLObject canonical_naut) {
        final SubLObject nart = hlt_find_or_create_nart(canonical_naut);
        if (NIL != nart) {
            Errors.warn($str169$missing_NART_added___S, nart);
            return nart;
        }
        return NIL;
    }

    public static SubLObject write_assertion_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject variable_names = assertions_high.assertion_variable_names(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        final SubLObject truth = assertions_high.assertion_truth(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
        final SubLObject hl_operation = list(HLT_FIND_OR_CREATE_ASSERTION, cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        save_one_hl_transcript_operation(hl_operation, stream);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject bookkeeping_info = cyc_bookkeeping.assertion_bookkeeping_info(assertion);
            final SubLObject sentence = (NIL != assertions_high.gaf_assertionP(assertion)) ? assertions_high.gaf_el_formula(assertion) : uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject hl_operation_$64 = list(HLT_ASSERT, sentence, mt, strength, direction, bookkeeping_info);
            save_one_hl_transcript_operation(hl_operation_$64, stream);
        }
        return assertion;
    }

    public static SubLObject hlt_find_or_create_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertion = assertions_high.find_or_create_assertion(cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        final SubLObject new_assertionP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != new_assertionP) {
            tms.tms_handle_after_addings(assertion);
        }
        return values(assertion, new_assertionP);
    }

    public static SubLObject hlt_find_or_create_missing_gaf(final SubLObject gaf, final SubLObject mt) {
        final SubLObject gaf_assertion = hlt_find_or_create_assertion(clause_utilities.make_gaf_cnf(gaf), mt, NIL, $FORWARD, $UNKNOWN, $DEFAULT, NIL);
        if (NIL != gaf_assertion) {
            Errors.warn($str173$missing_gaf_added___S, gaf_assertion);
            return gaf_assertion;
        }
        return NIL;
    }

    public static SubLObject hlt_find_or_create_missing_rule(final SubLObject cnf, final SubLObject mt) {
        final SubLObject rule_assertion = hlt_find_or_create_assertion(cnf, mt, NIL, $BACKWARD, $UNKNOWN, $DEFAULT, NIL);
        if (NIL != rule_assertion) {
            Errors.warn($str175$missing_rule_added___S, rule_assertion);
            return rule_assertion;
        }
        return NIL;
    }

    public static SubLObject hlt_assert(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject bookkeeping_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = list($STRENGTH, strength, $DIRECTION, direction, $kw177$CHECK_WFF_, NIL, $FORWARD_RULES, NIL);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(bookkeeping_info, thread);
            result = cyc_kernel.cyc_assert(sentence, mt, v_properties);
        } finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject hlt_timestamp_assertion(final SubLObject assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second) {
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            assertions_interface.kb_timestamp_asserted_assertion(assertion, who, when, why, second);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject write_kb_hl_support_to_hl_transcript_stream(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        SubLObject cdolist_list_var;
        final SubLObject justification = cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
        SubLObject justification_support = NIL;
        justification_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != kb_hl_support_handles.kb_hl_support_p(justification_support)) && kb_hl_support_handles.kb_hl_support_id(justification_support).numG(kb_hl_support_handles.kb_hl_support_id(kb_hl_support))) {
                write_kb_hl_support_to_hl_transcript_stream(justification_support, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification_support = cdolist_list_var.first();
        } 
        final SubLObject hl_operation = list(HLT_FIND_OR_CREATE_KB_HL_SUPPORT, hl_support, justification);
        save_one_hl_transcript_operation(hl_operation, stream);
        return kb_hl_support;
    }

    public static SubLObject hlt_find_or_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        return kb_hl_supports_high.find_or_create_kb_hl_support(hl_support, justification);
    }

    public static SubLObject hlt_find_or_create_missing_kb_hl_support(final SubLObject hl_support) {
        final SubLObject kb_hl_support = kb_hl_supports_high.find_or_possibly_create_kb_hl_support(hl_support);
        if (NIL != kb_hl_support) {
            Errors.warn($str180$missing_KB_HL_support_added___S, kb_hl_support);
            return kb_hl_support;
        }
        return NIL;
    }

    public static SubLObject write_deduction_to_hl_transcript_stream(final SubLObject deduction, final SubLObject stream) {
        final SubLObject assertion = deductions_high.deduction_supported_object(deduction);
        if (NIL != assertion_handles.assertion_p(assertion)) {
            SubLObject cdolist_list_var;
            final SubLObject supports = cdolist_list_var = deductions_high.deduction_supports(deduction);
            SubLObject deduction_support = NIL;
            deduction_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != assertion_handles.assertion_p(deduction_support)) && assertion_handles.assertion_id(deduction_support).numG(assertion_handles.assertion_id(assertion))) {
                    write_assertion_to_hl_transcript_stream(deduction_support, stream);
                }
                cdolist_list_var = cdolist_list_var.rest();
                deduction_support = cdolist_list_var.first();
            } 
            final SubLObject truth = deductions_high.deduction_truth(deduction);
            final SubLObject hl_operation = list(HLT_FIND_OR_CREATE_DEDUCTION, assertion, supports, truth);
            save_one_hl_transcript_operation(hl_operation, stream);
        }
        return deduction;
    }

    public static SubLObject hlt_find_or_create_deduction(final SubLObject supported_object, final SubLObject supports, final SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        if (NIL != assertion_handles.assertion_p(supported_object)) {
            return tms.tms_add_deduction_for_assertion(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
        }
        return NIL;
    }

    public static SubLObject hlt_find_or_create_missing_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject deduction = hlt_find_or_create_deduction(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
        if (NIL != deduction) {
            Errors.warn($str182$missing_deduction_added___S, deduction);
            return deduction;
        }
        return NIL;
    }

    public static SubLObject write_existing_constant_removal_to_hl_transcript_stream(final SubLObject constant, final SubLObject stream) {
        final SubLObject encapsulated_constant = encapsulation.encapsulate(constant);
        return write_constant_removal_to_hl_transcript_stream(encapsulated_constant, stream);
    }

    public static SubLObject write_constant_removal_to_hl_transcript_stream(final SubLObject encapsulated_constant, final SubLObject stream) {
        final SubLObject hl_operation = list(HLT_REMOVE_CONSTANT, encapsulated_constant);
        save_one_hl_transcript_operation(hl_operation, stream);
        return encapsulated_constant;
    }

    public static SubLObject hlt_catch_unencapsulation_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject error_var = NIL;
        destructuring_bind_must_consp(current, datum, $list184);
        error_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CATCH_ERROR_MESSAGE, list(error_var), list(CCATCH, $UNENCAPSULATION_ERROR, error_var, listS(CLET, $list188, append(body, NIL))));
    }

    public static SubLObject hlt_remove_constant(final SubLObject encapsulated_constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = NIL;
        SubLObject errorP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        thread.throwStack.push($UNENCAPSULATION_ERROR);
                        final SubLObject _prev_bind_0_$65 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding(thread);
                        try {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind(T, thread);
                            constant = encapsulation.unencapsulate(encapsulated_constant);
                        } finally {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind(_prev_bind_0_$65, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        errorP = Errors.handleThrowable(ccatch_env_var, $UNENCAPSULATION_ERROR);
                    } finally {
                        thread.throwStack.pop();
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            errorP = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL == errorP) && (NIL != constant_p(constant))) {
            return fi.fi_kill_int(constant);
        }
        return NIL;
    }

    public static SubLObject write_existing_assertion_unassert_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream) {
        final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject encapsulated_sentence = canon_tl.tl_encapsulate(sentence);
        final SubLObject encapsulated_mt = canon_tl.tl_encapsulate(mt);
        return write_assertion_unassert_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
    }

    public static SubLObject write_assertion_unassert_to_hl_transcript_stream(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt, final SubLObject stream) {
        final SubLObject hl_operation = list(HLT_UNASSERT, encapsulated_sentence, encapsulated_mt);
        save_one_hl_transcript_operation(hl_operation, stream);
        return encapsulated_sentence;
    }

    public static SubLObject hlt_unassert(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject errorP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        thread.throwStack.push($UNENCAPSULATION_ERROR);
                        final SubLObject _prev_bind_0_$66 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding(thread);
                        try {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind(T, thread);
                            sentence = encapsulation.unencapsulate(encapsulated_sentence);
                            mt = encapsulation.unencapsulate(encapsulated_mt);
                        } finally {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind(_prev_bind_0_$66, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        errorP = Errors.handleThrowable(ccatch_env_var, $UNENCAPSULATION_ERROR);
                    } finally {
                        thread.throwStack.pop();
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            errorP = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == errorP) {
            return fi.fi_unassert_int(sentence, mt);
        }
        return NIL;
    }

    public static SubLObject write_existing_assertion_removal_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream) {
        final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject encapsulated_sentence = canon_tl.tl_encapsulate(sentence);
        final SubLObject encapsulated_mt = canon_tl.tl_encapsulate(mt);
        return write_assertion_removal_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
    }

    public static SubLObject write_assertion_removal_to_hl_transcript_stream(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt, final SubLObject stream) {
        final SubLObject hl_operation = list(HLT_REMOVE_ASSERTION, encapsulated_sentence, encapsulated_mt);
        save_one_hl_transcript_operation(hl_operation, stream);
        return encapsulated_sentence;
    }

    public static SubLObject hlt_remove_assertion(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject errorP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        thread.throwStack.push($UNENCAPSULATION_ERROR);
                        final SubLObject _prev_bind_0_$67 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding(thread);
                        try {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind(T, thread);
                            sentence = encapsulation.unencapsulate(encapsulated_sentence);
                            mt = encapsulation.unencapsulate(encapsulated_mt);
                        } finally {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind(_prev_bind_0_$67, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        errorP = Errors.handleThrowable(ccatch_env_var, $UNENCAPSULATION_ERROR);
                    } finally {
                        thread.throwStack.pop();
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            errorP = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == errorP) {
            return fi.fi_blast_int(sentence, mt);
        }
        return NIL;
    }

    public static SubLObject new_transcript_file_operations_iterator(final SubLObject transcript_file, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        return iteration.new_file_form_iterator(transcript_file, start, end);
    }

    public static SubLObject new_transcript_file_kb_removal_operations_iterator(final SubLObject transcript_file, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        return iteration.new_filter_iterator(new_transcript_file_operations_iterator(transcript_file, start, end), $sym191$KB_REMOVAL_OPERATION_, UNPROVIDED);
    }

    public static SubLObject transcript_file_kb_removal_operations(final SubLObject transcript_file, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_removal_operations = NIL;
        final SubLObject iterator_var = new_transcript_file_operations_iterator(transcript_file, start, end);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject op = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL != kb_removal_operationP(op))) {
                kb_removal_operations = cons(op, kb_removal_operations);
            }
        }
        return nreverse(kb_removal_operations);
    }

    public static SubLObject kb_removal_operationP(final SubLObject op) {
        if ((NIL != list_utilities.proper_list_p(op)) && (NIL != list_utilities.lengthE(op, FOUR_INTEGER, UNPROVIDED))) {
            final SubLObject form = fourth(op);
            if (form.isList()) {
                final SubLObject method = form.first();
                return list_utilities.member_eqP(method, $list192);
            }
        }
        return NIL;
    }

    public static SubLObject constants_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, MISSING_CONSTANT_ID_SET, FIND_CONSTANT_BY_INTERNAL_ID);
    }

    public static SubLObject narts_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, MISSING_NART_ID_SET, FIND_NART_BY_ID);
    }

    public static SubLObject assertions_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, MISSING_ASSERTION_ID_SET, FIND_ASSERTION_BY_ID);
    }

    public static SubLObject deductions_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, MISSING_DEDUCTION_ID_SET, FIND_DEDUCTION_BY_ID);
    }

    public static SubLObject kb_hl_supports_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, MISSING_KB_HL_SUPPORT_ID_SET, FIND_KB_HL_SUPPORT_BY_ID);
    }

    public static SubLObject kb_objects_to_remove_wrt_sibling_image_int(final SubLObject remote_machine, final SubLObject remote_port, final SubLObject protocol, final SubLObject missing_method, final SubLObject lookup_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_remote_image = remote_image.new_remote_image(remote_machine, remote_port, protocol);
        final SubLObject remote_form = list(missing_method);
        SubLObject missing_id_set = NIL;
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        try {
            remote_image.open_remote_image_connection(connection);
            final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
            try {
                remote_image.$current_remote_image_connection$.bind(connection, thread);
                missing_id_set = remote_image.current_remote_image_connection_eval(remote_form);
            } finally {
                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                remote_image.close_remote_image_connection(connection);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        final SubLObject missing_ids = Sort.sort(set.set_element_list(missing_id_set), symbol_function($sym199$_), UNPROVIDED);
        final SubLObject objects_to_remove = delete(NIL, Mapping.mapcar(lookup_method, missing_ids), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return objects_to_remove;
    }

    public static SubLObject save_catchup_hl_transcript(SubLObject start_op, SubLObject start_checkpoint, SubLObject directory_string) {
        if (start_op == UNPROVIDED) {
            start_op = ZERO_INTEGER;
        }
        if (start_checkpoint == UNPROVIDED) {
            start_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (directory_string == UNPROVIDED) {
            directory_string = transcript_utilities.transcript_directory();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory_string) : "Filesys.directory_p(directory_string) " + "CommonSymbols.NIL != Filesys.directory_p(directory_string) " + directory_string;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_utilities.directory_writeable_p(directory_string, UNPROVIDED))) {
            Errors.error($str201$Directory__S_is_not_writeable);
        }
        final SubLObject end_op = operation_communication.kb_op_number();
        final SubLObject el_transcript = transcript_utilities.construct_transcript_filename(transcript_utilities.make_master_transcript_filename(UNPROVIDED));
        final SubLObject hl_transcript = make_next_cyc_hlt_filename(start_op, end_op, directory_string);
        SubLObject stats = NIL;
        stats = save_hl_transcript_from_modification_spec(hl_transcript, list($TRANSCRIPT_FILE, list(el_transcript, start_op, end_op), $START_CHECKPOINT, start_checkpoint, $END_CHECKPOINT, current_kb_state_checkpoint()));
        return values(hl_transcript, stats);
    }

    public static SubLObject make_next_cyc_hlt_filename(SubLObject start_op, SubLObject end_op, SubLObject directory_string) {
        if (start_op == UNPROVIDED) {
            start_op = ZERO_INTEGER;
        }
        if (end_op == UNPROVIDED) {
            end_op = operation_communication.kb_op_number();
        }
        if (directory_string == UNPROVIDED) {
            directory_string = transcript_utilities.transcript_directory();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory_string) : "Filesys.directory_p(directory_string) " + "CommonSymbols.NIL != Filesys.directory_p(directory_string) " + directory_string;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_utilities.directory_writeable_p(directory_string, UNPROVIDED))) {
            Errors.error($str201$Directory__S_is_not_writeable);
        }
        SubLObject minor_version;
        SubLObject cyc_image_filename;
        SubLObject full_filename;
        for (minor_version = NIL, minor_version = ZERO_INTEGER; minor_version.numL($int$26); minor_version = add(minor_version, ONE_INTEGER)) {
            cyc_image_filename = make_cyc_hlt_filename(start_op, end_op, minor_version);
            full_filename = cconcatenate(directory_string, cyc_image_filename);
            if (NIL == Filesys.probe_file(full_filename)) {
                return full_filename;
            }
        }
        return NIL;
    }

    public static SubLObject make_cyc_hlt_filename(SubLObject start_op, SubLObject end_op, SubLObject minor_version) {
        if (start_op == UNPROVIDED) {
            start_op = ZERO_INTEGER;
        }
        if (end_op == UNPROVIDED) {
            end_op = operation_communication.kb_op_number();
        }
        if (minor_version == UNPROVIDED) {
            minor_version = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == subl_promotions.non_negative_integer_p(minor_version)) || (!minor_version.numLE($int$25)))) {
            Errors.error($str204$Minor_version__S_is_not_in_the_ra);
        }
        final SubLObject kb_loaded = kb_loaded();
        final SubLObject minor_version_char = Strings.sublisp_char($$$ABCDEFGHIJKLMNOPQRSTUVWXYZ, minor_version);
        final SubLObject filename = format(NIL, $str206$cyc_hlt_kb__A_op__A_to__A__C, new SubLObject[]{ kb_loaded, start_op, end_op, minor_version_char });
        final SubLObject extension = $$$cfasl;
        return cconcatenate(filename, new SubLObject[]{ $str208$_, extension });
    }

    public static SubLObject extract_removals_hl_transcript(final SubLObject input_filename, final SubLObject removals_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_removal_position = $UNINITIALIZED;
        final SubLObject _prev_bind_0 = $cfasl_input_guid_string_resource$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            $cfasl_input_guid_string_resource$.bind(get_new_cfasl_input_guid_string_resource(), thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$68 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(input_filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$68, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str70$Unable_to_open__S, input_filename);
                }
                SubLObject in_stream = stream;
                SubLObject stream_$69 = NIL;
                try {
                    final SubLObject _prev_bind_0_$69 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream_$69 = compatibility.open_binary(removals_filename, $OUTPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$69, thread);
                    }
                    if (!stream_$69.isStream()) {
                        Errors.error($str70$Unable_to_open__S, removals_filename);
                    }
                    SubLObject rem_stream = stream_$69;
                    in_stream = file_utilities.enable_file_stream_memory_mapping(in_stream);
                    rem_stream = file_utilities.enable_file_stream_memory_mapping(rem_stream);
                    final SubLObject in_length = file_length(in_stream);
                    SubLObject start_position = compatibility.get_file_position(in_stream);
                    SubLObject hl_op = load_one_hl_transcript_operation(in_stream);
                    SubLObject end_position = compatibility.get_file_position(in_stream);
                    final SubLObject _prev_bind_0_$70 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$72 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$73 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($$$Extracting_Removals_HL_Transcript);
                            while ($EOF != hl_op) {
                                note_percent_progress(start_position, in_length);
                                final SubLObject method = hl_op.first();
                                if (NIL != hlt_removal_methodP(method)) {
                                    if (first_removal_position == $UNINITIALIZED) {
                                        first_removal_position = start_position;
                                    }
                                    final SubLObject _prev_bind_0_$71 = $hl_transcript_compression_enabledP$.currentBinding(thread);
                                    try {
                                        $hl_transcript_compression_enabledP$.bind(NIL, thread);
                                        save_one_hl_transcript_operation(hl_op, rem_stream);
                                    } finally {
                                        $hl_transcript_compression_enabledP$.rebind(_prev_bind_0_$71, thread);
                                    }
                                }
                                start_position = end_position;
                                hl_op = load_one_hl_transcript_operation(in_stream);
                                end_position = compatibility.get_file_position(in_stream);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2_$73, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$72, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$70, thread);
                    }
                    save_one_hl_transcript_operation($list90, rem_stream);
                    if (first_removal_position == $UNINITIALIZED) {
                        first_removal_position = in_length;
                    }
                    force_output(rem_stream);
                } finally {
                    final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream_$69.isStream()) {
                            close(stream_$69, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            $cfasl_input_guid_string_resource$.rebind(_prev_bind_0, thread);
        }
        final SubLObject rem_length = file_utilities.get_file_length(removals_filename);
        final SubLObject result = list($REMOVALS_START, first_removal_position, $REMOVALS_LENGTH, rem_length);
        return result;
    }

    public static SubLObject hlt_removal_methodP(final SubLObject method) {
        return list_utilities.member_eqP(method, $hlt_removal_methods$.getGlobalValue());
    }

    public static SubLObject declare_hl_transcripts_file() {
        declareMacro(me, "do_constants_by_internal_id", "DO-CONSTANTS-BY-INTERNAL-ID");
        declareFunction(me, "note_constants_by_internal_id_progress", "NOTE-CONSTANTS-BY-INTERNAL-ID-PROGRESS", 3, 0, false);
        declareMacro(me, "do_narts_by_id", "DO-NARTS-BY-ID");
        declareFunction(me, "note_narts_by_id_progress", "NOTE-NARTS-BY-ID-PROGRESS", 3, 0, false);
        declareMacro(me, "do_assertions_by_id", "DO-ASSERTIONS-BY-ID");
        declareFunction(me, "note_assertions_by_id_progress", "NOTE-ASSERTIONS-BY-ID-PROGRESS", 3, 0, false);
        declareMacro(me, "do_deductions_by_id", "DO-DEDUCTIONS-BY-ID");
        declareFunction(me, "note_deductions_by_id_progress", "NOTE-DEDUCTIONS-BY-ID-PROGRESS", 3, 0, false);
        declareMacro(me, "do_kb_hl_supports_by_id", "DO-KB-HL-SUPPORTS-BY-ID");
        declareFunction(me, "note_kb_hl_supports_by_id_progress", "NOTE-KB-HL-SUPPORTS-BY-ID-PROGRESS", 3, 0, false);
        declareFunction(me, "most_recent_constants", "MOST-RECENT-CONSTANTS", 0, 1, false);
        declareFunction(me, "most_recent_narts", "MOST-RECENT-NARTS", 0, 1, false);
        declareFunction(me, "most_recent_assertions", "MOST-RECENT-ASSERTIONS", 0, 1, false);
        declareFunction(me, "most_recent_deductions", "MOST-RECENT-DEDUCTIONS", 0, 1, false);
        declareFunction(me, "most_recent_kb_hl_supports", "MOST-RECENT-KB-HL-SUPPORTS", 0, 1, false);
        declareFunction(me, "most_recent_kb_objects", "MOST-RECENT-KB-OBJECTS", 4, 0, false);
        declareFunction(me, "previous_dump_kb_state_checkpoint", "PREVIOUS-DUMP-KB-STATE-CHECKPOINT", 0, 0, false);
        declareFunction(me, "current_kb_state_checkpoint", "CURRENT-KB-STATE-CHECKPOINT", 0, 0, false);
        declareFunction(me, "make_kb_state_checkpoint", "MAKE-KB-STATE-CHECKPOINT", 5, 0, false);
        declareFunction(me, "destructure_kb_state_checkpoint", "DESTRUCTURE-KB-STATE-CHECKPOINT", 1, 0, false);
        declareFunction(me, "kb_checkpoint_difference", "KB-CHECKPOINT-DIFFERENCE", 0, 2, false);
        declareFunction(me, "save_hl_transcript", "SAVE-HL-TRANSCRIPT", 1, 2, false);
        declareFunction(me, "save_hl_transcript_from_modification_spec", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC", 2, 0, false);
        declareFunction(me, "load_hl_transcript_new", "LOAD-HL-TRANSCRIPT-NEW", 1, 1, false);
        declareFunction(me, "show_hl_transcript", "SHOW-HL-TRANSCRIPT", 1, 1, false);
        declareMacro(me, "with_hl_transcript_compression", "WITH-HL-TRANSCRIPT-COMPRESSION");
        declareFunction(me, "save_hl_transcript_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false);
        declareFunction(me, "save_hl_transcript_from_modification_spec_to_stream_int", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC-TO-STREAM-INT", 2, 0, false);
        declareFunction(me, "save_hl_transcript_additions_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-ADDITIONS-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false);
        declareFunction(me, "save_hl_transcript_removals_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-REMOVALS-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false);
        declareFunction(me, "plist_remove_value", "PLIST-REMOVE-VALUE", 2, 1, false);
        declareFunction(me, "save_one_hl_transcript_operation", "SAVE-ONE-HL-TRANSCRIPT-OPERATION", 2, 0, false);
        declareFunction(me, "load_one_hl_transcript_operation", "LOAD-ONE-HL-TRANSCRIPT-OPERATION", 1, 0, false);
        declareFunction(me, "process_hl_transcript_operation", "PROCESS-HL-TRANSCRIPT-OPERATION", 3, 0, false);
        declareFunction(me, "process_hl_transcript_operation_int", "PROCESS-HL-TRANSCRIPT-OPERATION-INT", 1, 0, false);
        declareFunction(me, "show_hl_transcript_operation", "SHOW-HL-TRANSCRIPT-OPERATION", 2, 0, false);
        declareFunction(me, "possibly_transform_hl_op_wrt_compatibility", "POSSIBLY-TRANSFORM-HL-OP-WRT-COMPATIBILITY", 1, 0, false);
        declareFunction(me, "hl_transcript_objects_to_compress", "HL-TRANSCRIPT-OBJECTS-TO-COMPRESS", 1, 0, false);
        declareFunction(me, "new_objects_between_kb_checkpoints", "NEW-OBJECTS-BETWEEN-KB-CHECKPOINTS", 0, 2, false);
        declareMacro(me, "gathering_new_kb_objects", "GATHERING-NEW-KB-OBJECTS");
        declareMacro(me, "gathering_rules_used_in_new_deductions", "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS");
        declareFunction(me, "gathering_rules_used_in_new_deductions_postprocess", "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS-POSTPROCESS", 2, 0, false);
        declareFunction(me, "compressible_references_in_modification_spec", "COMPRESSIBLE-REFERENCES-IN-MODIFICATION-SPEC", 1, 1, false);
        declareFunction(me, "increment_compressible_object_mention_count", "INCREMENT-COMPRESSIBLE-OBJECT-MENTION-COUNT", 1, 0, false);
        declareFunction(me, "deduction_map", "DEDUCTION-MAP", 2, 2, false);
        declareFunction(me, "kb_hl_support_map", "KB-HL-SUPPORT-MAP", 2, 2, false);
        declareFunction(me, "expression_map_support", "EXPRESSION-MAP-SUPPORT", 2, 2, false);
        declareMacro(me, "with_hl_transcript_created_constant_equivalence_by_name", "WITH-HL-TRANSCRIPT-CREATED-CONSTANT-EQUIVALENCE-BY-NAME");
        declareFunction(me, "new_hlt_external_id_equivalence_map", "NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP", 0, 0, false);
        declareFunction(me, "hlt_possibly_find_via_external_id_equivalence", "HLT-POSSIBLY-FIND-VIA-EXTERNAL-ID-EQUIVALENCE", 2, 0, false);
        declareFunction(me, "write_constant_to_hl_transcript_stream", "WRITE-CONSTANT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "hlt_find_or_create", "HLT-FIND-OR-CREATE", 1, 1, false);
        declareFunction(me, "hlt_find_or_create_missing_constant", "HLT-FIND-OR-CREATE-MISSING-CONSTANT", 1, 1, false);
        declareFunction(me, "write_nart_to_hl_transcript_stream", "WRITE-NART-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "hlt_find_or_create_nart", "HLT-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction(me, "hlt_find_or_create_missing_nart", "HLT-FIND-OR-CREATE-MISSING-NART", 1, 0, false);
        declareFunction(me, "write_assertion_to_hl_transcript_stream", "WRITE-ASSERTION-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "hlt_find_or_create_assertion", "HLT-FIND-OR-CREATE-ASSERTION", 7, 0, false);
        declareFunction(me, "hlt_find_or_create_missing_gaf", "HLT-FIND-OR-CREATE-MISSING-GAF", 2, 0, false);
        declareFunction(me, "hlt_find_or_create_missing_rule", "HLT-FIND-OR-CREATE-MISSING-RULE", 2, 0, false);
        declareFunction(me, "hlt_assert", "HLT-ASSERT", 5, 0, false);
        declareFunction(me, "hlt_timestamp_assertion", "HLT-TIMESTAMP-ASSERTION", 5, 0, false);
        declareFunction(me, "write_kb_hl_support_to_hl_transcript_stream", "WRITE-KB-HL-SUPPORT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "hlt_find_or_create_kb_hl_support", "HLT-FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction(me, "hlt_find_or_create_missing_kb_hl_support", "HLT-FIND-OR-CREATE-MISSING-KB-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "write_deduction_to_hl_transcript_stream", "WRITE-DEDUCTION-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "hlt_find_or_create_deduction", "HLT-FIND-OR-CREATE-DEDUCTION", 3, 2, false);
        declareFunction(me, "hlt_find_or_create_missing_deduction", "HLT-FIND-OR-CREATE-MISSING-DEDUCTION", 2, 3, false);
        declareFunction(me, "write_existing_constant_removal_to_hl_transcript_stream", "WRITE-EXISTING-CONSTANT-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "write_constant_removal_to_hl_transcript_stream", "WRITE-CONSTANT-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareMacro(me, "hlt_catch_unencapsulation_errors", "HLT-CATCH-UNENCAPSULATION-ERRORS");
        declareFunction(me, "hlt_remove_constant", "HLT-REMOVE-CONSTANT", 1, 0, false);
        declareFunction(me, "write_existing_assertion_unassert_to_hl_transcript_stream", "WRITE-EXISTING-ASSERTION-UNASSERT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "write_assertion_unassert_to_hl_transcript_stream", "WRITE-ASSERTION-UNASSERT-TO-HL-TRANSCRIPT-STREAM", 3, 0, false);
        declareFunction(me, "hlt_unassert", "HLT-UNASSERT", 2, 0, false);
        declareFunction(me, "write_existing_assertion_removal_to_hl_transcript_stream", "WRITE-EXISTING-ASSERTION-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "write_assertion_removal_to_hl_transcript_stream", "WRITE-ASSERTION-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 3, 0, false);
        declareFunction(me, "hlt_remove_assertion", "HLT-REMOVE-ASSERTION", 2, 0, false);
        declareFunction(me, "new_transcript_file_operations_iterator", "NEW-TRANSCRIPT-FILE-OPERATIONS-ITERATOR", 1, 2, false);
        declareFunction(me, "new_transcript_file_kb_removal_operations_iterator", "NEW-TRANSCRIPT-FILE-KB-REMOVAL-OPERATIONS-ITERATOR", 1, 2, false);
        declareFunction(me, "transcript_file_kb_removal_operations", "TRANSCRIPT-FILE-KB-REMOVAL-OPERATIONS", 1, 2, false);
        declareFunction(me, "kb_removal_operationP", "KB-REMOVAL-OPERATION?", 1, 0, false);
        declareFunction(me, "constants_to_remove_wrt_sibling_image", "CONSTANTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        declareFunction(me, "narts_to_remove_wrt_sibling_image", "NARTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        declareFunction(me, "assertions_to_remove_wrt_sibling_image", "ASSERTIONS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        declareFunction(me, "deductions_to_remove_wrt_sibling_image", "DEDUCTIONS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        declareFunction(me, "kb_hl_supports_to_remove_wrt_sibling_image", "KB-HL-SUPPORTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        declareFunction(me, "kb_objects_to_remove_wrt_sibling_image_int", "KB-OBJECTS-TO-REMOVE-WRT-SIBLING-IMAGE-INT", 5, 0, false);
        declareFunction(me, "save_catchup_hl_transcript", "SAVE-CATCHUP-HL-TRANSCRIPT", 0, 3, false);
        declareFunction(me, "make_next_cyc_hlt_filename", "MAKE-NEXT-CYC-HLT-FILENAME", 0, 3, false);
        declareFunction(me, "make_cyc_hlt_filename", "MAKE-CYC-HLT-FILENAME", 0, 3, false);
        declareFunction(me, "extract_removals_hl_transcript", "EXTRACT-REMOVALS-HL-TRANSCRIPT", 2, 0, false);
        declareFunction(me, "hlt_removal_methodP", "HLT-REMOVAL-METHOD?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_hl_transcripts_file() {
        defparameter("*HL-TRANSCRIPT-COMPRESSION-ENABLED?*", T);
        deflexical("*HL-TRANSCRIPT-COMMON-SYMBOLS*", $list145);
        deflexical("*HL-TRANSCRIPT-EL-CONSTANTS*", $list146);
        defparameter("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", NIL);
        deflexical("*HLT-REMOVAL-METHODS*", $list213);
        return NIL;
    }

    public static SubLObject setup_hl_transcripts_file() {
        register_macro_helper(NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS, DO_CONSTANTS_BY_INTERNAL_ID);
        register_macro_helper(NOTE_NARTS_BY_ID_PROGRESS, DO_NARTS_BY_ID);
        register_macro_helper(NOTE_ASSERTIONS_BY_ID_PROGRESS, DO_ASSERTIONS_BY_ID);
        register_macro_helper(NOTE_DEDUCTIONS_BY_ID_PROGRESS, DO_DEDUCTIONS_BY_ID);
        register_macro_helper(NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS, DO_KB_HL_SUPPORTS_BY_ID);
        register_macro_helper(GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS, GATHERING_RULES_USED_IN_NEW_DEDUCTIONS);
        note_funcall_helper_function(INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT);
        register_macro_helper(NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP, WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME);
        note_funcall_helper_function(HLT_FIND_OR_CREATE);
        note_funcall_helper_function(HLT_FIND_OR_CREATE_NART);
        note_funcall_helper_function(HLT_FIND_OR_CREATE_ASSERTION);
        note_funcall_helper_function(HLT_ASSERT);
        note_funcall_helper_function(HLT_TIMESTAMP_ASSERTION);
        note_funcall_helper_function(HLT_REMOVE_CONSTANT);
        note_funcall_helper_function(HLT_UNASSERT);
        note_funcall_helper_function(HLT_REMOVE_ASSERTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hl_transcripts_file();
    }

    @Override
    public void initializeVariables() {
        init_hl_transcripts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hl_transcripts_file();
    }

    static {




























































































































































































































    }
}

/**
 * Total time: 2524 ms
 */
