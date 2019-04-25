package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_transcripts extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_transcripts";
    public static final String myFingerPrint = "554ab1dd03340b10385d2dfb8698f490e43c9340ef05a5ec4eb1f3f2b7453713";
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 13246L)
    public static SubLSymbol $hl_transcript_compression_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 23570L)
    private static SubLSymbol $hl_transcript_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 24297L)
    private static SubLSymbol $hl_transcript_el_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 33452L)
    public static SubLSymbol $hl_transcript_constant_external_id_equivalence_map$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 59391L)
    private static SubLSymbol $hlt_removal_methods$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$START;
    private static final SubLSymbol $kw4$END;
    private static final SubLSymbol $kw5$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $sym7$PROGRESS_VAR;
    private static final SubLSymbol $sym8$TOTAL_VAR;
    private static final SubLSymbol $sym9$CLET;
    private static final SubLSymbol $sym10$_;
    private static final SubLSymbol $sym11$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym12$DO_CONSTANTS_BY_INTERNAL_ID;
    private static final SubLSymbol $sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS;
    private static final SubLSymbol $sym14$ID_VAR;
    private static final SubLSymbol $sym15$DO_NUMBERS;
    private static final SubLSymbol $sym16$FIND_CONSTANT_BY_INTERNAL_ID;
    private static final SubLSymbol $sym17$PWHEN;
    private static final SubLSymbol $sym18$CONSTANT_P;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$PROGRESS_VAR;
    private static final SubLSymbol $sym21$TOTAL_VAR;
    private static final SubLSymbol $sym22$DO_NARTS_BY_ID;
    private static final SubLSymbol $sym23$NOTE_NARTS_BY_ID_PROGRESS;
    private static final SubLSymbol $sym24$ID_VAR;
    private static final SubLSymbol $sym25$FIND_NART_BY_ID;
    private static final SubLSymbol $sym26$NART_P;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$PROGRESS_VAR;
    private static final SubLSymbol $sym29$TOTAL_VAR;
    private static final SubLSymbol $sym30$DO_ASSERTIONS_BY_ID;
    private static final SubLSymbol $sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS;
    private static final SubLSymbol $sym32$ID_VAR;
    private static final SubLSymbol $sym33$FIND_ASSERTION_BY_ID;
    private static final SubLSymbol $sym34$ASSERTION_P;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$PROGRESS_VAR;
    private static final SubLSymbol $sym37$TOTAL_VAR;
    private static final SubLSymbol $sym38$DO_DEDUCTIONS_BY_ID;
    private static final SubLSymbol $sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS;
    private static final SubLSymbol $sym40$ID_VAR;
    private static final SubLSymbol $sym41$FIND_DEDUCTION_BY_ID;
    private static final SubLSymbol $sym42$DEDUCTION_P;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$PROGRESS_VAR;
    private static final SubLSymbol $sym45$TOTAL_VAR;
    private static final SubLSymbol $sym46$DO_KB_HL_SUPPORTS_BY_ID;
    private static final SubLSymbol $sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS;
    private static final SubLSymbol $sym48$ID_VAR;
    private static final SubLSymbol $sym49$FIND_KB_HL_SUPPORT_BY_ID;
    private static final SubLSymbol $sym50$KB_HL_SUPPORT_P;
    private static final SubLSymbol $sym51$NEXT_CONSTANT_SUID;
    private static final SubLSymbol $sym52$VALID_CONSTANT_;
    private static final SubLSymbol $sym53$NEXT_NART_ID;
    private static final SubLSymbol $sym54$VALID_NART_;
    private static final SubLSymbol $sym55$NEXT_ASSERTION_ID;
    private static final SubLSymbol $sym56$VALID_ASSERTION_;
    private static final SubLSymbol $sym57$NEXT_DEDUCTION_ID;
    private static final SubLSymbol $sym58$VALID_DEDUCTION_;
    private static final SubLSymbol $sym59$NEXT_KB_HL_SUPPORT_ID;
    private static final SubLSymbol $sym60$VALID_KB_HL_SUPPORT_;
    private static final SubLSymbol $sym61$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw62$CONSTANT;
    private static final SubLSymbol $kw63$NART;
    private static final SubLSymbol $kw64$ASSERTION;
    private static final SubLSymbol $kw65$KB_HL_SUPPORT;
    private static final SubLSymbol $kw66$DEDUCTION;
    private static final SubLSymbol $kw67$START_CHECKPOINT;
    private static final SubLSymbol $kw68$END_CHECKPOINT;
    private static final SubLSymbol $kw69$OUTPUT;
    private static final SubLString $str70$Unable_to_open__S;
    private static final SubLSymbol $kw71$WARN;
    private static final SubLSymbol $kw72$INPUT;
    private static final SubLString $str73$Loading_HL_Transcript_;
    private static final SubLSymbol $kw74$EOF;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$MODIFICATION_SPEC;
    private static final SubLSymbol $sym78$MOD_SPEC_VAR;
    private static final SubLSymbol $sym79$OBJECTS_TO_COMPRESS;
    private static final SubLSymbol $sym80$COMPRESSION_SAMPLE;
    private static final SubLSymbol $sym81$COMPRESSION_OPTIONS;
    private static final SubLSymbol $sym82$HL_TRANSCRIPT_OBJECTS_TO_COMPRESS;
    private static final SubLSymbol $sym83$APPEND;
    private static final SubLSymbol $sym84$LIST;
    private static final SubLSymbol $kw85$EXTERNALIZED_;
    private static final SubLSymbol $kw86$ANALYZE;
    private static final SubLSymbol $sym87$WITH_CFASL_COMPRESSION;
    private static final SubLSymbol $sym88$SAVE_ONE_HL_TRANSCRIPT_OPERATION;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $kw91$NEW_CONSTANTS;
    private static final SubLSymbol $kw92$NEW_NARTS;
    private static final SubLSymbol $kw93$NEW_ASSERTIONS;
    private static final SubLSymbol $kw94$NEW_KB_HL_SUPPORTS;
    private static final SubLSymbol $kw95$NEW_DEDUCTIONS;
    private static final SubLString $str96$saving_constants;
    private static final SubLString $str97$saving_NARTs;
    private static final SubLString $str98$saving_assertions;
    private static final SubLString $str99$saving_KB_HL_supports;
    private static final SubLString $str100$saving_deductions;
    private static final SubLSymbol $kw101$CONSTANTS;
    private static final SubLSymbol $kw102$NARTS;
    private static final SubLSymbol $kw103$ASSERTIONS;
    private static final SubLSymbol $kw104$KB_HL_SUPPORTS;
    private static final SubLSymbol $kw105$DEDUCTIONS;
    private static final SubLSymbol $kw106$TRANSCRIPT_FILE;
    private static final SubLSymbol $kw107$REMOVE_CONSTANTS;
    private static final SubLSymbol $kw108$REMOVE_NARTS;
    private static final SubLSymbol $kw109$REMOVE_ASSERTIONS;
    private static final SubLSymbol $kw110$REMOVE_DEDUCTIONS;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$FI_KILL;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$FI_MERGE;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$FI_UNASSERT;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$FI_BLAST;
    private static final SubLString $str120$time_to_implement__S;
    private static final SubLSymbol $kw121$REMOVED_CONSTANTS;
    private static final SubLSymbol $kw122$REMOVED_NARTS;
    private static final SubLSymbol $kw123$REMOVED_ASSERTIONS;
    private static final SubLSymbol $kw124$REMOVED_KB_HL_SUPPORTS;
    private static final SubLSymbol $kw125$REMOVED_DEDUCTIONS;
    private static final SubLSymbol $sym126$CDR;
    private static final SubLSymbol $kw127$IGNORE;
    private static final SubLSymbol $kw128$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym129$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym130$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str131$operation__S___S___A;
    private static final SubLSymbol $kw132$ERROR;
    private static final SubLString $str133$unexpected_error_mode__S;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$CYC_FIND_OR_CREATE_CANONICAL_NART;
    private static final SubLSymbol $sym136$HLT_FIND_OR_CREATE_NART;
    private static final SubLSymbol $sym137$CYC_FIND_OR_CREATE;
    private static final SubLSymbol $sym138$HLT_FIND_OR_CREATE;
    private static final SubLSymbol $sym139$FIND_OR_CREATE_ASSERTION;
    private static final SubLSymbol $sym140$HLT_FIND_OR_CREATE_ASSERTION;
    private static final SubLSymbol $sym141$FIND_OR_CREATE_KB_HL_SUPPORT;
    private static final SubLSymbol $sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT;
    private static final SubLSymbol $sym143$TMS_ADD_DEDUCTION_FOR_ASSERTION;
    private static final SubLSymbol $sym144$HLT_FIND_OR_CREATE_DEDUCTION;
    private static final SubLList $list145;
    private static final SubLList $list146;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$START;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$CSETQ;
    private static final SubLSymbol $sym151$NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLSymbol $kw154$DIRECTION;
    private static final SubLSymbol $kw155$FORWARD;
    private static final SubLSymbol $sym156$NEW_OBJECTS;
    private static final SubLSymbol $sym157$GATHERING_NEW_KB_OBJECTS;
    private static final SubLSymbol $sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS;
    private static final SubLSymbol $sym159$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS;
    private static final SubLInteger $int160$500;
    private static final SubLSymbol $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT;
    private static final SubLSymbol $sym162$_;
    private static final SubLInteger $int163$32;
    private static final SubLString $str164$_S_was_not_a_support_p;
    private static final SubLList $list165;
    private static final SubLSymbol $sym166$NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP;
    private static final SubLSymbol $sym167$WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME;
    private static final SubLString $str168$missing_constant_added___S;
    private static final SubLString $str169$missing_NART_added___S;
    private static final SubLSymbol $sym170$HLT_ASSERT;
    private static final SubLSymbol $kw171$UNKNOWN;
    private static final SubLSymbol $kw172$DEFAULT;
    private static final SubLString $str173$missing_gaf_added___S;
    private static final SubLSymbol $kw174$BACKWARD;
    private static final SubLString $str175$missing_rule_added___S;
    private static final SubLSymbol $kw176$STRENGTH;
    private static final SubLSymbol $kw177$CHECK_WFF_;
    private static final SubLSymbol $kw178$FORWARD_RULES;
    private static final SubLSymbol $sym179$HLT_TIMESTAMP_ASSERTION;
    private static final SubLString $str180$missing_KB_HL_support_added___S;
    private static final SubLSymbol $kw181$TRUE;
    private static final SubLString $str182$missing_deduction_added___S;
    private static final SubLSymbol $sym183$HLT_REMOVE_CONSTANT;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$CATCH_ERROR_MESSAGE;
    private static final SubLSymbol $sym186$CCATCH;
    private static final SubLSymbol $kw187$UNENCAPSULATION_ERROR;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$HLT_UNASSERT;
    private static final SubLSymbol $sym190$HLT_REMOVE_ASSERTION;
    private static final SubLSymbol $sym191$KB_REMOVAL_OPERATION_;
    private static final SubLList $list192;
    private static final SubLSymbol $kw193$CFASL;
    private static final SubLSymbol $sym194$MISSING_CONSTANT_ID_SET;
    private static final SubLSymbol $sym195$MISSING_NART_ID_SET;
    private static final SubLSymbol $sym196$MISSING_ASSERTION_ID_SET;
    private static final SubLSymbol $sym197$MISSING_DEDUCTION_ID_SET;
    private static final SubLSymbol $sym198$MISSING_KB_HL_SUPPORT_ID_SET;
    private static final SubLSymbol $sym199$_;
    private static final SubLSymbol $sym200$DIRECTORY_P;
    private static final SubLString $str201$Directory__S_is_not_writeable;
    private static final SubLInteger $int202$26;
    private static final SubLInteger $int203$25;
    private static final SubLString $str204$Minor_version__S_is_not_in_the_ra;
    private static final SubLString $str205$ABCDEFGHIJKLMNOPQRSTUVWXYZ;
    private static final SubLString $str206$cyc_hlt_kb__A_op__A_to__A__C;
    private static final SubLString $str207$cfasl;
    private static final SubLString $str208$_;
    private static final SubLSymbol $kw209$UNINITIALIZED;
    private static final SubLString $str210$Extracting_Removals_HL_Transcript;
    private static final SubLSymbol $kw211$REMOVALS_START;
    private static final SubLSymbol $kw212$REMOVALS_LENGTH;
    private static final SubLList $list213;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 1310L)
    public static SubLObject do_constants_by_internal_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list0);
        constant_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$1 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list0);
            if (hl_transcripts.NIL == conses_high.member(current_$1, (SubLObject)hl_transcripts.$list1, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$1 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list0);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw3$START, current);
        final SubLObject start = (SubLObject)((hl_transcripts.NIL != start_tail) ? conses_high.cadr(start_tail) : hl_transcripts.NIL);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw4$END, current);
        final SubLObject end = (SubLObject)((hl_transcripts.NIL != end_tail) ? conses_high.cadr(end_tail) : hl_transcripts.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((hl_transcripts.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : hl_transcripts.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((hl_transcripts.NIL != done_tail) ? conses_high.cadr(done_tail) : hl_transcripts.NIL);
        final SubLObject body;
        current = (body = temp);
        if (hl_transcripts.NIL != progress_message) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$sym7$PROGRESS_VAR;
            final SubLObject total_var = (SubLObject)hl_transcripts.$sym8$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_var, progress_message), (SubLObject)ConsesLow.list(total_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym10$_, end, start))), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym11$NOTING_PERCENT_PROGRESS, progress_var, (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym12$DO_CONSTANTS_BY_INTERNAL_ID, (SubLObject)ConsesLow.list(constant_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS, constant_var, start, total_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
        }
        final SubLObject id_var = (SubLObject)hl_transcripts.$sym14$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym15$DO_NUMBERS, (SubLObject)ConsesLow.list(id_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym16$FIND_CONSTANT_BY_INTERNAL_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym18$CONSTANT_P, constant_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 2254L)
    public static SubLObject note_constants_by_internal_id_progress(final SubLObject constant, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = Numbers.subtract(constants_high.constant_internal_id(constant), start);
        return utilities_macros.note_percent_progress(sofar, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 2485L)
    public static SubLObject do_narts_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list19);
        nart_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$2 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list19);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list19);
            if (hl_transcripts.NIL == conses_high.member(current_$2, (SubLObject)hl_transcripts.$list1, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$2 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list19);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw3$START, current);
        final SubLObject start = (SubLObject)((hl_transcripts.NIL != start_tail) ? conses_high.cadr(start_tail) : hl_transcripts.NIL);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw4$END, current);
        final SubLObject end = (SubLObject)((hl_transcripts.NIL != end_tail) ? conses_high.cadr(end_tail) : hl_transcripts.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((hl_transcripts.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : hl_transcripts.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((hl_transcripts.NIL != done_tail) ? conses_high.cadr(done_tail) : hl_transcripts.NIL);
        final SubLObject body;
        current = (body = temp);
        if (hl_transcripts.NIL != progress_message) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$sym20$PROGRESS_VAR;
            final SubLObject total_var = (SubLObject)hl_transcripts.$sym21$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_var, progress_message), (SubLObject)ConsesLow.list(total_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym10$_, end, start))), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym11$NOTING_PERCENT_PROGRESS, progress_var, (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym22$DO_NARTS_BY_ID, (SubLObject)ConsesLow.list(nart_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym23$NOTE_NARTS_BY_ID_PROGRESS, nart_var, start, total_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
        }
        final SubLObject id_var = (SubLObject)hl_transcripts.$sym24$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym15$DO_NUMBERS, (SubLObject)ConsesLow.list(id_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(nart_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym25$FIND_NART_BY_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym26$NART_P, nart_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 3137L)
    public static SubLObject note_narts_by_id_progress(final SubLObject nart, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = Numbers.subtract(nart_handles.nart_id(nart), start);
        return utilities_macros.note_percent_progress(sofar, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 3321L)
    public static SubLObject do_assertions_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list27);
        assertion_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$3 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list27);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list27);
            if (hl_transcripts.NIL == conses_high.member(current_$3, (SubLObject)hl_transcripts.$list1, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$3 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list27);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw3$START, current);
        final SubLObject start = (SubLObject)((hl_transcripts.NIL != start_tail) ? conses_high.cadr(start_tail) : hl_transcripts.NIL);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw4$END, current);
        final SubLObject end = (SubLObject)((hl_transcripts.NIL != end_tail) ? conses_high.cadr(end_tail) : hl_transcripts.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((hl_transcripts.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : hl_transcripts.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((hl_transcripts.NIL != done_tail) ? conses_high.cadr(done_tail) : hl_transcripts.NIL);
        final SubLObject body;
        current = (body = temp);
        if (hl_transcripts.NIL != progress_message) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$sym28$PROGRESS_VAR;
            final SubLObject total_var = (SubLObject)hl_transcripts.$sym29$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_var, progress_message), (SubLObject)ConsesLow.list(total_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym10$_, end, start))), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym11$NOTING_PERCENT_PROGRESS, progress_var, (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym30$DO_ASSERTIONS_BY_ID, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS, assertion_var, start, total_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
        }
        final SubLObject id_var = (SubLObject)hl_transcripts.$sym32$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym15$DO_NUMBERS, (SubLObject)ConsesLow.list(id_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym33$FIND_ASSERTION_BY_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym34$ASSERTION_P, assertion_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 4028L)
    public static SubLObject note_assertions_by_id_progress(final SubLObject assertion, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = Numbers.subtract(assertion_handles.assertion_id(assertion), start);
        return utilities_macros.note_percent_progress(sofar, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 4237L)
    public static SubLObject do_deductions_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list35);
        deduction_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$4 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list35);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list35);
            if (hl_transcripts.NIL == conses_high.member(current_$4, (SubLObject)hl_transcripts.$list1, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$4 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list35);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw3$START, current);
        final SubLObject start = (SubLObject)((hl_transcripts.NIL != start_tail) ? conses_high.cadr(start_tail) : hl_transcripts.NIL);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw4$END, current);
        final SubLObject end = (SubLObject)((hl_transcripts.NIL != end_tail) ? conses_high.cadr(end_tail) : hl_transcripts.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((hl_transcripts.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : hl_transcripts.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((hl_transcripts.NIL != done_tail) ? conses_high.cadr(done_tail) : hl_transcripts.NIL);
        final SubLObject body;
        current = (body = temp);
        if (hl_transcripts.NIL != progress_message) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$sym36$PROGRESS_VAR;
            final SubLObject total_var = (SubLObject)hl_transcripts.$sym37$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_var, progress_message), (SubLObject)ConsesLow.list(total_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym10$_, end, start))), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym11$NOTING_PERCENT_PROGRESS, progress_var, (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym38$DO_DEDUCTIONS_BY_ID, (SubLObject)ConsesLow.list(deduction_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS, deduction_var, start, total_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
        }
        final SubLObject id_var = (SubLObject)hl_transcripts.$sym40$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym15$DO_NUMBERS, (SubLObject)ConsesLow.list(id_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(deduction_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym41$FIND_DEDUCTION_BY_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym42$DEDUCTION_P, deduction_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 4944L)
    public static SubLObject note_deductions_by_id_progress(final SubLObject deduction, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = Numbers.subtract(deduction_handles.deduction_id(deduction), start);
        return utilities_macros.note_percent_progress(sofar, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 5153L)
    public static SubLObject do_kb_hl_supports_by_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject kb_hl_support_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list43);
        kb_hl_support_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$5 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list43);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list43);
            if (hl_transcripts.NIL == conses_high.member(current_$5, (SubLObject)hl_transcripts.$list1, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$5 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list43);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw3$START, current);
        final SubLObject start = (SubLObject)((hl_transcripts.NIL != start_tail) ? conses_high.cadr(start_tail) : hl_transcripts.NIL);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw4$END, current);
        final SubLObject end = (SubLObject)((hl_transcripts.NIL != end_tail) ? conses_high.cadr(end_tail) : hl_transcripts.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((hl_transcripts.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : hl_transcripts.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((hl_transcripts.NIL != done_tail) ? conses_high.cadr(done_tail) : hl_transcripts.NIL);
        final SubLObject body;
        current = (body = temp);
        if (hl_transcripts.NIL != progress_message) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$sym44$PROGRESS_VAR;
            final SubLObject total_var = (SubLObject)hl_transcripts.$sym45$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_var, progress_message), (SubLObject)ConsesLow.list(total_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym10$_, end, start))), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym11$NOTING_PERCENT_PROGRESS, progress_var, (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym46$DO_KB_HL_SUPPORTS_BY_ID, (SubLObject)ConsesLow.list(kb_hl_support_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS, kb_hl_support_var, start, total_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
        }
        final SubLObject id_var = (SubLObject)hl_transcripts.$sym48$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym15$DO_NUMBERS, (SubLObject)ConsesLow.list(id_var, (SubLObject)hl_transcripts.$kw3$START, start, (SubLObject)hl_transcripts.$kw4$END, end, (SubLObject)hl_transcripts.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(kb_hl_support_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym49$FIND_KB_HL_SUPPORT_BY_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym50$KB_HL_SUPPORT_P, kb_hl_support_var), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 5904L)
    public static SubLObject note_kb_hl_supports_by_id_progress(final SubLObject kb_hl_support, final SubLObject start, final SubLObject total) {
        final SubLObject sofar = Numbers.subtract(kb_hl_support_handles.kb_hl_support_id(kb_hl_support), start);
        return utilities_macros.note_percent_progress(sofar, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6133L)
    public static SubLObject most_recent_constants(SubLObject n) {
        if (n == hl_transcripts.UNPROVIDED) {
            n = (SubLObject)hl_transcripts.TEN_INTEGER;
        }
        return most_recent_kb_objects(n, (SubLObject)hl_transcripts.$sym51$NEXT_CONSTANT_SUID, (SubLObject)hl_transcripts.$sym16$FIND_CONSTANT_BY_INTERNAL_ID, (SubLObject)hl_transcripts.$sym52$VALID_CONSTANT_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6449L)
    public static SubLObject most_recent_narts(SubLObject n) {
        if (n == hl_transcripts.UNPROVIDED) {
            n = (SubLObject)hl_transcripts.TEN_INTEGER;
        }
        return most_recent_kb_objects(n, (SubLObject)hl_transcripts.$sym53$NEXT_NART_ID, (SubLObject)hl_transcripts.$sym25$FIND_NART_BY_ID, (SubLObject)hl_transcripts.$sym54$VALID_NART_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6582L)
    public static SubLObject most_recent_assertions(SubLObject n) {
        if (n == hl_transcripts.UNPROVIDED) {
            n = (SubLObject)hl_transcripts.TEN_INTEGER;
        }
        return most_recent_kb_objects(n, (SubLObject)hl_transcripts.$sym55$NEXT_ASSERTION_ID, (SubLObject)hl_transcripts.$sym33$FIND_ASSERTION_BY_ID, (SubLObject)hl_transcripts.$sym56$VALID_ASSERTION_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6735L)
    public static SubLObject most_recent_deductions(SubLObject n) {
        if (n == hl_transcripts.UNPROVIDED) {
            n = (SubLObject)hl_transcripts.TEN_INTEGER;
        }
        return most_recent_kb_objects(n, (SubLObject)hl_transcripts.$sym57$NEXT_DEDUCTION_ID, (SubLObject)hl_transcripts.$sym41$FIND_DEDUCTION_BY_ID, (SubLObject)hl_transcripts.$sym58$VALID_DEDUCTION_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6888L)
    public static SubLObject most_recent_kb_hl_supports(SubLObject n) {
        if (n == hl_transcripts.UNPROVIDED) {
            n = (SubLObject)hl_transcripts.TEN_INTEGER;
        }
        return most_recent_kb_objects(n, (SubLObject)hl_transcripts.$sym59$NEXT_KB_HL_SUPPORT_ID, (SubLObject)hl_transcripts.$sym49$FIND_KB_HL_SUPPORT_BY_ID, (SubLObject)hl_transcripts.$sym60$VALID_KB_HL_SUPPORT_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 7057L)
    public static SubLObject most_recent_kb_objects(final SubLObject n, final SubLObject next_id_fn, final SubLObject find_fn, final SubLObject valid_fn) {
        assert hl_transcripts.NIL != subl_promotions.non_negative_integer_p(n) : n;
        SubLObject objects = (SubLObject)hl_transcripts.NIL;
        SubLObject total = (SubLObject)hl_transcripts.ZERO_INTEGER;
        final SubLObject start = Functions.funcall(next_id_fn);
        SubLObject doneP = Numbers.numGE(total, n);
        if (hl_transcripts.NIL == doneP) {
            SubLObject id = (SubLObject)hl_transcripts.NIL;
            id = start;
            while (hl_transcripts.NIL == doneP) {
                final SubLObject v_object = Functions.funcall(find_fn, id);
                if (hl_transcripts.NIL != Functions.funcall(valid_fn, v_object)) {
                    objects = (SubLObject)ConsesLow.cons(v_object, objects);
                    total = Numbers.add(total, (SubLObject)hl_transcripts.ONE_INTEGER);
                    doneP = Numbers.numGE(total, n);
                }
                id = Numbers.add(id, (SubLObject)hl_transcripts.MINUS_ONE_INTEGER);
            }
        }
        return Sequences.nreverse(objects);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 7498L)
    public static SubLObject previous_dump_kb_state_checkpoint() {
        final SubLObject constant_suid = constant_index_manager.get_file_backed_constant_internal_id_threshold();
        final SubLObject nart_id = nart_hl_formula_manager.get_file_backed_nart_id_threshold();
        final SubLObject assertion_id = assertion_manager.get_file_backed_assertion_id_threshold();
        final SubLObject kb_hl_support_id = kb_hl_support_manager.get_file_backed_kb_hl_support_id_threshold();
        final SubLObject deduction_id = deduction_manager.get_file_backed_deduction_id_threshold();
        return make_kb_state_checkpoint(constant_suid, nart_id, assertion_id, kb_hl_support_id, deduction_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 8160L)
    public static SubLObject current_kb_state_checkpoint() {
        final SubLObject constant_suid = constant_handles.next_constant_suid();
        final SubLObject nart_id = nart_handles.next_nart_id();
        final SubLObject assertion_id = assertion_handles.next_assertion_id();
        final SubLObject kb_hl_support_id = kb_hl_support_handles.next_kb_hl_support_id();
        final SubLObject deduction_id = deduction_handles.next_deduction_id();
        return make_kb_state_checkpoint(constant_suid, nart_id, assertion_id, kb_hl_support_id, deduction_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 8544L)
    public static SubLObject make_kb_state_checkpoint(final SubLObject constant_suid, final SubLObject nart_id, final SubLObject assertion_id, final SubLObject kb_hl_support_id, final SubLObject deduction_id) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { hl_transcripts.$kw62$CONSTANT, constant_suid, hl_transcripts.$kw63$NART, nart_id, hl_transcripts.$kw64$ASSERTION, assertion_id, hl_transcripts.$kw65$KB_HL_SUPPORT, kb_hl_support_id, hl_transcripts.$kw66$DEDUCTION, deduction_id });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 8854L)
    public static SubLObject destructure_kb_state_checkpoint(final SubLObject kb_state_checkpoint) {
        final SubLObject constant_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw62$CONSTANT, kb_state_checkpoint);
        final SubLObject constant = (SubLObject)((hl_transcripts.NIL != constant_tail) ? conses_high.cadr(constant_tail) : hl_transcripts.NIL);
        final SubLObject nart_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw63$NART, kb_state_checkpoint);
        final SubLObject nart = (SubLObject)((hl_transcripts.NIL != nart_tail) ? conses_high.cadr(nart_tail) : hl_transcripts.NIL);
        final SubLObject assertion_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw64$ASSERTION, kb_state_checkpoint);
        final SubLObject assertion = (SubLObject)((hl_transcripts.NIL != assertion_tail) ? conses_high.cadr(assertion_tail) : hl_transcripts.NIL);
        final SubLObject deduction_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw66$DEDUCTION, kb_state_checkpoint);
        final SubLObject deduction = (SubLObject)((hl_transcripts.NIL != deduction_tail) ? conses_high.cadr(deduction_tail) : hl_transcripts.NIL);
        final SubLObject kb_hl_support_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw65$KB_HL_SUPPORT, kb_state_checkpoint);
        final SubLObject kb_hl_support = (SubLObject)((hl_transcripts.NIL != kb_hl_support_tail) ? conses_high.cadr(kb_hl_support_tail) : hl_transcripts.NIL);
        return Values.values(constant, nart, assertion, kb_hl_support, deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 9110L)
    public static SubLObject kb_checkpoint_difference(SubLObject earlier_kb_checkpoint, SubLObject later_kb_checkpoint) {
        if (earlier_kb_checkpoint == hl_transcripts.UNPROVIDED) {
            earlier_kb_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (later_kb_checkpoint == hl_transcripts.UNPROVIDED) {
            later_kb_checkpoint = current_kb_state_checkpoint();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)hl_transcripts.$sym10$_), Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(destructure_kb_state_checkpoint(later_kb_checkpoint))), new SubLObject[] { Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(destructure_kb_state_checkpoint(earlier_kb_checkpoint))) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 9474L)
    public static SubLObject save_hl_transcript(final SubLObject filename, SubLObject start_checkpoint, SubLObject end_checkpoint) {
        if (start_checkpoint == hl_transcripts.UNPROVIDED) {
            start_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (end_checkpoint == hl_transcripts.UNPROVIDED) {
            end_checkpoint = current_kb_state_checkpoint();
        }
        final SubLObject modification_spec = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$kw67$START_CHECKPOINT, start_checkpoint, (SubLObject)hl_transcripts.$kw68$END_CHECKPOINT, end_checkpoint);
        return save_hl_transcript_from_modification_spec(filename, modification_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 10198L)
    public static SubLObject save_hl_transcript_from_modification_spec(final SubLObject filename, final SubLObject modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcripts.NIL;
            try {
                final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcripts.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)hl_transcripts.$kw69$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$6, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcripts.$str70$Unable_to_open__S, filename);
                }
                final SubLObject stream_$7 = stream;
                result = save_hl_transcript_from_modification_spec_to_stream(stream_$7, modification_spec);
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 10540L)
    public static SubLObject load_hl_transcript_new(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == hl_transcripts.UNPROVIDED) {
            error_mode = (SubLObject)hl_transcripts.$kw71$WARN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_ops = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject success_ops = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject file_size = (SubLObject)hl_transcripts.NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcripts.NIL;
            try {
                final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcripts.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)hl_transcripts.$kw72$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$9, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcripts.$str70$Unable_to_open__S, filename);
                }
                SubLObject stream_$10 = stream;
                stream_$10 = file_utilities.enable_file_stream_memory_mapping(stream_$10);
                final SubLObject _prev_bind_0_$10 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    file_size = streams_high.file_length(stream_$10);
                    final SubLObject _prev_bind_0_$11 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_transcripts.NIL, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)hl_transcripts.$str73$Loading_HL_Transcript_, format_nil.format_nil_a_no_copy(filename)));
                            SubLObject hl_op = load_one_hl_transcript_operation(stream_$10);
                            SubLObject sofar = streams_high.file_position(stream_$10, (SubLObject)hl_transcripts.UNPROVIDED);
                            while (hl_transcripts.$kw74$EOF != hl_op) {
                                utilities_macros.note_percent_progress(sofar, file_size);
                                if (hl_transcripts.NIL != process_hl_transcript_operation(hl_op, error_mode, total_ops)) {
                                    success_ops = Numbers.add(success_ops, (SubLObject)hl_transcripts.ONE_INTEGER);
                                }
                                total_ops = Numbers.add(total_ops, (SubLObject)hl_transcripts.ONE_INTEGER);
                                hl_op = load_one_hl_transcript_operation(stream_$10);
                                sofar = streams_high.file_position(stream_$10, (SubLObject)hl_transcripts.UNPROVIDED);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1_$13, thread);
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
                finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$10, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return Values.values(total_ops, Numbers.subtract(total_ops, success_ops));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 11579L)
    public static SubLObject show_hl_transcript(final SubLObject filename, SubLObject out_stream) {
        if (out_stream == hl_transcripts.UNPROVIDED) {
            out_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)hl_transcripts.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcripts.NIL;
            try {
                final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcripts.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)hl_transcripts.$kw72$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$16, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcripts.$str70$Unable_to_open__S, filename);
                }
                SubLObject in_stream = stream;
                in_stream = file_utilities.enable_file_stream_memory_mapping(in_stream);
                final SubLObject _prev_bind_0_$17 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    for (SubLObject hl_op = load_one_hl_transcript_operation(in_stream); hl_transcripts.$kw74$EOF != hl_op; hl_op = load_one_hl_transcript_operation(in_stream)) {
                        show_hl_transcript_operation(hl_op, out_stream);
                        total = Numbers.add(total, (SubLObject)hl_transcripts.ONE_INTEGER);
                    }
                }
                finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 12310L)
    public static SubLObject with_hl_transcript_compression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list75);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$19 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list75);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list75);
            if (hl_transcripts.NIL == conses_high.member(current_$19, (SubLObject)hl_transcripts.$list76, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$19 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list75);
        }
        final SubLObject modification_spec_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw77$MODIFICATION_SPEC, current);
        final SubLObject modification_spec = (SubLObject)((hl_transcripts.NIL != modification_spec_tail) ? conses_high.cadr(modification_spec_tail) : hl_transcripts.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mod_spec_var = (SubLObject)hl_transcripts.$sym78$MOD_SPEC_VAR;
        final SubLObject objects_to_compress = (SubLObject)hl_transcripts.$sym79$OBJECTS_TO_COMPRESS;
        final SubLObject compression_sample = (SubLObject)hl_transcripts.$sym80$COMPRESSION_SAMPLE;
        final SubLObject compression_options = (SubLObject)hl_transcripts.$sym81$COMPRESSION_OPTIONS;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mod_spec_var, modification_spec), (SubLObject)ConsesLow.list(objects_to_compress, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym82$HL_TRANSCRIPT_OBJECTS_TO_COMPRESS, mod_spec_var)), (SubLObject)ConsesLow.list(compression_sample, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym83$APPEND, objects_to_compress, objects_to_compress)), (SubLObject)ConsesLow.list(compression_options, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym84$LIST, (SubLObject)hl_transcripts.$kw85$EXTERNALIZED_, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.$kw86$ANALYZE, compression_sample))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym87$WITH_CFASL_COMPRESSION, (SubLObject)ConsesLow.list(stream, compression_options), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL)), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym88$SAVE_ONE_HL_TRANSCRIPT_OPERATION, (SubLObject)hl_transcripts.$list89, stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 13370L)
    public static SubLObject save_hl_transcript_from_modification_spec_to_stream(final SubLObject stream, final SubLObject modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        if (hl_transcripts.NIL != hl_transcripts.$hl_transcript_compression_enabledP$.getDynamicValue(thread)) {
            final SubLObject objects_to_compress = hl_transcript_objects_to_compress(modification_spec);
            final SubLObject compression_sample = ConsesLow.append(objects_to_compress, objects_to_compress);
            final SubLObject compression_options = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$kw85$EXTERNALIZED_, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.$kw86$ANALYZE, compression_sample);
            final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
            try {
                cfasl_compression.$cfasl_output_compression_options$.bind(compression_options, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator((SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED), thread);
                cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream), thread);
                cfasl_compression.with_cfasl_compression_preamble(stream);
                result = save_hl_transcript_from_modification_spec_to_stream_int(stream, modification_spec);
                cfasl_compression.with_cfasl_compression_postamble(stream);
            }
            finally {
                cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_3, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_2, thread);
                cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0, thread);
            }
            save_one_hl_transcript_operation((SubLObject)hl_transcripts.$list90, stream);
        }
        else {
            result = save_hl_transcript_from_modification_spec_to_stream_int(stream, modification_spec);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 13832L)
    public static SubLObject save_hl_transcript_from_modification_spec_to_stream_int(final SubLObject stream, final SubLObject hl_modification_spec) {
        final SubLObject removals_result = save_hl_transcript_removals_from_modification_spec_to_stream(stream, hl_modification_spec);
        final SubLObject additions_result = save_hl_transcript_additions_from_modification_spec_to_stream(stream, hl_modification_spec);
        final SubLObject complete_result = list_utilities.merge_plist(additions_result, removals_result);
        return complete_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 14265L)
    public static SubLObject save_hl_transcript_additions_from_modification_spec_to_stream(final SubLObject stream, final SubLObject hl_modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_checkpoint_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw67$START_CHECKPOINT, hl_modification_spec);
        final SubLObject start_checkpoint = (SubLObject)((hl_transcripts.NIL != start_checkpoint_tail) ? conses_high.cadr(start_checkpoint_tail) : hl_transcripts.NIL);
        final SubLObject end_checkpoint_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw68$END_CHECKPOINT, hl_modification_spec);
        final SubLObject end_checkpoint = (SubLObject)((hl_transcripts.NIL != end_checkpoint_tail) ? conses_high.cadr(end_checkpoint_tail) : hl_transcripts.NIL);
        final SubLObject new_constants_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw91$NEW_CONSTANTS, hl_modification_spec);
        final SubLObject new_constants = (SubLObject)((hl_transcripts.NIL != new_constants_tail) ? conses_high.cadr(new_constants_tail) : hl_transcripts.NIL);
        final SubLObject new_narts_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw92$NEW_NARTS, hl_modification_spec);
        final SubLObject new_narts = (SubLObject)((hl_transcripts.NIL != new_narts_tail) ? conses_high.cadr(new_narts_tail) : hl_transcripts.NIL);
        final SubLObject new_assertions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw93$NEW_ASSERTIONS, hl_modification_spec);
        final SubLObject new_assertions = (SubLObject)((hl_transcripts.NIL != new_assertions_tail) ? conses_high.cadr(new_assertions_tail) : hl_transcripts.NIL);
        final SubLObject new_kb_hl_supports_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw94$NEW_KB_HL_SUPPORTS, hl_modification_spec);
        final SubLObject new_kb_hl_supports = (SubLObject)((hl_transcripts.NIL != new_kb_hl_supports_tail) ? conses_high.cadr(new_kb_hl_supports_tail) : hl_transcripts.NIL);
        final SubLObject new_deductions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw95$NEW_DEDUCTIONS, hl_modification_spec);
        final SubLObject new_deductions = (SubLObject)((hl_transcripts.NIL != new_deductions_tail) ? conses_high.cadr(new_deductions_tail) : hl_transcripts.NIL);
        final SubLObject kb_checkpointP = (SubLObject)SubLObjectFactory.makeBoolean(hl_transcripts.NIL != start_checkpoint && hl_transcripts.NIL != end_checkpoint);
        SubLObject constant_suid_start = (SubLObject)hl_transcripts.NIL;
        SubLObject nart_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject assertion_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject kb_hl_support_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject deduction_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject constant_suid_end = (SubLObject)hl_transcripts.NIL;
        SubLObject nart_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject assertion_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject kb_hl_support_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject deduction_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject total_constants = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject total_narts = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject total_assertions = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject total_kb_hl_supports = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject total_deductions = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        if (hl_transcripts.NIL != kb_checkpointP) {
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
        if (hl_transcripts.NIL != kb_checkpointP) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$str96$saving_constants;
            final SubLObject total_var = Numbers.subtract(constant_suid_end, constant_suid_start);
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject constant;
                    for (end_var = constant_suid_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = constant_suid_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        constant = constants_high.find_constant_by_internal_id(id_var);
                        if (hl_transcripts.NIL != constant_handles.constant_p(constant)) {
                            note_constants_by_internal_id_progress(constant, constant_suid_start, total_var);
                            write_constant_to_hl_transcript_stream(constant, stream);
                            total_constants = Numbers.add(total_constants, (SubLObject)hl_transcripts.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (hl_transcripts.NIL != new_constants) {
            final SubLObject message_var = (SubLObject)hl_transcripts.$str96$saving_constants;
            final SubLObject list_var = new_constants;
            SubLObject sofar = (SubLObject)hl_transcripts.ZERO_INTEGER;
            final SubLObject total = Sequences.length(list_var);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject constant2 = (SubLObject)hl_transcripts.NIL;
                    constant2 = cdolist_list_var.first();
                    while (hl_transcripts.NIL != cdolist_list_var) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)hl_transcripts.ONE_INTEGER);
                        write_constant_to_hl_transcript_stream(constant2, stream);
                        total_constants = Numbers.add(total_constants, (SubLObject)hl_transcripts.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        constant2 = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (hl_transcripts.NIL != kb_checkpointP) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$str97$saving_NARTs;
            final SubLObject total_var = Numbers.subtract(nart_id_end, nart_id_start);
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject nart;
                    for (end_var = nart_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = nart_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        nart = nart_handles.find_nart_by_id(id_var);
                        if (hl_transcripts.NIL != nart_handles.nart_p(nart)) {
                            note_narts_by_id_progress(nart, nart_id_start, total_var);
                            write_nart_to_hl_transcript_stream(nart, stream);
                            total_narts = Numbers.add(total_narts, (SubLObject)hl_transcripts.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (hl_transcripts.NIL != new_narts) {
            final SubLObject message_var = (SubLObject)hl_transcripts.$str97$saving_NARTs;
            final SubLObject list_var = new_narts;
            SubLObject sofar = (SubLObject)hl_transcripts.ZERO_INTEGER;
            final SubLObject total = Sequences.length(list_var);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject nart2 = (SubLObject)hl_transcripts.NIL;
                    nart2 = cdolist_list_var.first();
                    while (hl_transcripts.NIL != cdolist_list_var) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)hl_transcripts.ONE_INTEGER);
                        write_nart_to_hl_transcript_stream(nart2, stream);
                        total_narts = Numbers.add(total_narts, (SubLObject)hl_transcripts.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        nart2 = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (hl_transcripts.NIL != kb_checkpointP) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$str98$saving_assertions;
            final SubLObject total_var = Numbers.subtract(assertion_id_end, assertion_id_start);
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject assertion;
                    for (end_var = assertion_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = assertion_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        assertion = assertion_handles.find_assertion_by_id(id_var);
                        if (hl_transcripts.NIL != assertion_handles.assertion_p(assertion)) {
                            note_assertions_by_id_progress(assertion, assertion_id_start, total_var);
                            write_assertion_to_hl_transcript_stream(assertion, stream);
                            total_assertions = Numbers.add(total_assertions, (SubLObject)hl_transcripts.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (hl_transcripts.NIL != new_assertions) {
            final SubLObject message_var = (SubLObject)hl_transcripts.$str98$saving_assertions;
            final SubLObject list_var = new_assertions;
            SubLObject sofar = (SubLObject)hl_transcripts.ZERO_INTEGER;
            final SubLObject total = Sequences.length(list_var);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject assertion2 = (SubLObject)hl_transcripts.NIL;
                    assertion2 = cdolist_list_var.first();
                    while (hl_transcripts.NIL != cdolist_list_var) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)hl_transcripts.ONE_INTEGER);
                        write_assertion_to_hl_transcript_stream(assertion2, stream);
                        total_assertions = Numbers.add(total_assertions, (SubLObject)hl_transcripts.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion2 = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values6 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values6);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (hl_transcripts.NIL != kb_checkpointP) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$str99$saving_KB_HL_supports;
            final SubLObject total_var = Numbers.subtract(kb_hl_support_id_end, kb_hl_support_id_start);
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject kb_hl_support;
                    for (end_var = kb_hl_support_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = kb_hl_support_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(id_var);
                        if (hl_transcripts.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                            note_kb_hl_supports_by_id_progress(kb_hl_support, kb_hl_support_id_start, total_var);
                            write_kb_hl_support_to_hl_transcript_stream(kb_hl_support, stream);
                            total_kb_hl_supports = Numbers.add(total_kb_hl_supports, (SubLObject)hl_transcripts.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values7 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values7);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (hl_transcripts.NIL != new_kb_hl_supports) {
            final SubLObject message_var = (SubLObject)hl_transcripts.$str99$saving_KB_HL_supports;
            final SubLObject list_var = new_kb_hl_supports;
            SubLObject sofar = (SubLObject)hl_transcripts.ZERO_INTEGER;
            final SubLObject total = Sequences.length(list_var);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject kb_hl_support2 = (SubLObject)hl_transcripts.NIL;
                    kb_hl_support2 = cdolist_list_var.first();
                    while (hl_transcripts.NIL != cdolist_list_var) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)hl_transcripts.ONE_INTEGER);
                        write_kb_hl_support_to_hl_transcript_stream(kb_hl_support2, stream);
                        total_kb_hl_supports = Numbers.add(total_kb_hl_supports, (SubLObject)hl_transcripts.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        kb_hl_support2 = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values8 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values8);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        if (hl_transcripts.NIL != kb_checkpointP) {
            final SubLObject progress_var = (SubLObject)hl_transcripts.$str100$saving_deductions;
            final SubLObject total_var = Numbers.subtract(deduction_id_end, deduction_id_start);
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(progress_var);
                    SubLObject end_var;
                    SubLObject id_var;
                    SubLObject deduction;
                    for (end_var = deduction_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = deduction_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                        deduction = deduction_handles.find_deduction_by_id(id_var);
                        if (hl_transcripts.NIL != deduction_handles.deduction_p(deduction)) {
                            note_deductions_by_id_progress(deduction, deduction_id_start, total_var);
                            write_deduction_to_hl_transcript_stream(deduction, stream);
                            total_deductions = Numbers.add(total_deductions, (SubLObject)hl_transcripts.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values9 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values9);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        if (hl_transcripts.NIL != new_deductions) {
            final SubLObject message_var = (SubLObject)hl_transcripts.$str100$saving_deductions;
            final SubLObject list_var = new_deductions;
            SubLObject sofar = (SubLObject)hl_transcripts.ZERO_INTEGER;
            final SubLObject total = Sequences.length(list_var);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    SubLObject cdolist_list_var = list_var;
                    SubLObject deduction2 = (SubLObject)hl_transcripts.NIL;
                    deduction2 = cdolist_list_var.first();
                    while (hl_transcripts.NIL != cdolist_list_var) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)hl_transcripts.ONE_INTEGER);
                        write_deduction_to_hl_transcript_stream(deduction2, stream);
                        total_deductions = Numbers.add(total_deductions, (SubLObject)hl_transcripts.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        deduction2 = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values10 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values10);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            }
        }
        result = (SubLObject)ConsesLow.list(new SubLObject[] { hl_transcripts.$kw101$CONSTANTS, total_constants, hl_transcripts.$kw102$NARTS, total_narts, hl_transcripts.$kw103$ASSERTIONS, total_assertions, hl_transcripts.$kw104$KB_HL_SUPPORTS, total_kb_hl_supports, hl_transcripts.$kw105$DEDUCTIONS, total_deductions });
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 18006L)
    public static SubLObject save_hl_transcript_removals_from_modification_spec_to_stream(final SubLObject stream, final SubLObject hl_modification_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transcript_file_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw106$TRANSCRIPT_FILE, hl_modification_spec);
        final SubLObject transcript_file = (SubLObject)((hl_transcripts.NIL != transcript_file_tail) ? conses_high.cadr(transcript_file_tail) : hl_transcripts.NIL);
        final SubLObject remove_constants_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw107$REMOVE_CONSTANTS, hl_modification_spec);
        final SubLObject remove_constants = (SubLObject)((hl_transcripts.NIL != remove_constants_tail) ? conses_high.cadr(remove_constants_tail) : hl_transcripts.NIL);
        final SubLObject remove_narts_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw108$REMOVE_NARTS, hl_modification_spec);
        final SubLObject remove_narts = (SubLObject)((hl_transcripts.NIL != remove_narts_tail) ? conses_high.cadr(remove_narts_tail) : hl_transcripts.NIL);
        final SubLObject remove_assertions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw109$REMOVE_ASSERTIONS, hl_modification_spec);
        final SubLObject remove_assertions = (SubLObject)((hl_transcripts.NIL != remove_assertions_tail) ? conses_high.cadr(remove_assertions_tail) : hl_transcripts.NIL);
        final SubLObject remove_deductions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw110$REMOVE_DEDUCTIONS, hl_modification_spec);
        final SubLObject remove_deductions = (SubLObject)((hl_transcripts.NIL != remove_deductions_tail) ? conses_high.cadr(remove_deductions_tail) : hl_transcripts.NIL);
        SubLObject total_constants = (SubLObject)hl_transcripts.ZERO_INTEGER;
        final SubLObject total_narts = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject total_assertions = (SubLObject)hl_transcripts.ZERO_INTEGER;
        final SubLObject total_kb_hl_supports = (SubLObject)hl_transcripts.ZERO_INTEGER;
        final SubLObject total_deductions = (SubLObject)hl_transcripts.ZERO_INTEGER;
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        if (hl_transcripts.NIL != remove_constants) {
            SubLObject cdolist_list_var = remove_constants;
            SubLObject constant = (SubLObject)hl_transcripts.NIL;
            constant = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                write_existing_constant_removal_to_hl_transcript_stream(constant, stream);
                total_constants = Numbers.add(total_constants, (SubLObject)hl_transcripts.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                constant = cdolist_list_var.first();
            }
        }
        if (hl_transcripts.NIL != transcript_file) {
            SubLObject current_$41;
            final SubLObject datum_$40 = current_$41 = (SubLObject)(transcript_file.isString() ? ConsesLow.list(transcript_file) : transcript_file);
            SubLObject transcript_filename = (SubLObject)hl_transcripts.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$41, datum_$40, (SubLObject)hl_transcripts.$list111);
            transcript_filename = current_$41.first();
            current_$41 = current_$41.rest();
            final SubLObject start_op = (SubLObject)(current_$41.isCons() ? current_$41.first() : hl_transcripts.ZERO_INTEGER);
            cdestructuring_bind.destructuring_bind_must_listp(current_$41, datum_$40, (SubLObject)hl_transcripts.$list111);
            current_$41 = current_$41.rest();
            final SubLObject end_op = (SubLObject)(current_$41.isCons() ? current_$41.first() : hl_transcripts.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current_$41, datum_$40, (SubLObject)hl_transcripts.$list111);
            current_$41 = current_$41.rest();
            if (hl_transcripts.NIL == current_$41) {
                final SubLObject op_iterator = new_transcript_file_kb_removal_operations_iterator(transcript_filename, start_op, end_op);
                try {
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)hl_transcripts.NIL; hl_transcripts.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(hl_transcripts.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject op = iteration.iteration_next(op_iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (hl_transcripts.NIL != valid) {
                            final SubLObject form = conses_high.fourth(op);
                            SubLObject current_$42;
                            final SubLObject datum_$41 = current_$42 = form;
                            SubLObject method = (SubLObject)hl_transcripts.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$42, datum_$41, (SubLObject)hl_transcripts.$list112);
                            method = current_$42.first();
                            final SubLObject args;
                            current_$42 = (args = current_$42.rest());
                            final SubLObject pcase_var = method;
                            if (pcase_var.eql((SubLObject)hl_transcripts.$sym113$FI_KILL)) {
                                SubLObject current_$43;
                                final SubLObject datum_$42 = current_$43 = args;
                                SubLObject encapsulated_constant = (SubLObject)hl_transcripts.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$43, datum_$42, (SubLObject)hl_transcripts.$list114);
                                encapsulated_constant = current_$43.first();
                                current_$43 = current_$43.rest();
                                if (hl_transcripts.NIL == current_$43) {
                                    encapsulated_constant = list_utilities.unquotify(encapsulated_constant);
                                    write_constant_removal_to_hl_transcript_stream(encapsulated_constant, stream);
                                    total_constants = Numbers.add(total_constants, (SubLObject)hl_transcripts.ONE_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$42, (SubLObject)hl_transcripts.$list114);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)hl_transcripts.$sym115$FI_MERGE)) {
                                SubLObject current_$44;
                                final SubLObject datum_$43 = current_$44 = args;
                                SubLObject encapsulated_kill = (SubLObject)hl_transcripts.NIL;
                                SubLObject encapsulated_keep = (SubLObject)hl_transcripts.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)hl_transcripts.$list116);
                                encapsulated_kill = current_$44.first();
                                current_$44 = current_$44.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)hl_transcripts.$list116);
                                encapsulated_keep = current_$44.first();
                                current_$44 = current_$44.rest();
                                if (hl_transcripts.NIL == current_$44) {
                                    encapsulated_kill = list_utilities.unquotify(encapsulated_kill);
                                    write_constant_removal_to_hl_transcript_stream(encapsulated_kill, stream);
                                    total_constants = Numbers.add(total_constants, (SubLObject)hl_transcripts.ONE_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$43, (SubLObject)hl_transcripts.$list116);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)hl_transcripts.$sym117$FI_UNASSERT)) {
                                SubLObject current_$45;
                                final SubLObject datum_$44 = current_$45 = args;
                                SubLObject encapsulated_sentence = (SubLObject)hl_transcripts.NIL;
                                SubLObject encapsulated_mt = (SubLObject)hl_transcripts.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, (SubLObject)hl_transcripts.$list118);
                                encapsulated_sentence = current_$45.first();
                                current_$45 = current_$45.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, (SubLObject)hl_transcripts.$list118);
                                encapsulated_mt = current_$45.first();
                                current_$45 = current_$45.rest();
                                if (hl_transcripts.NIL == current_$45) {
                                    encapsulated_sentence = list_utilities.unquotify(encapsulated_sentence);
                                    encapsulated_mt = list_utilities.unquotify(encapsulated_mt);
                                    write_assertion_unassert_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
                                    total_assertions = Numbers.add(total_assertions, (SubLObject)hl_transcripts.ONE_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$44, (SubLObject)hl_transcripts.$list118);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)hl_transcripts.$sym119$FI_BLAST)) {
                                SubLObject current_$46;
                                final SubLObject datum_$45 = current_$46 = args;
                                SubLObject encapsulated_sentence = (SubLObject)hl_transcripts.NIL;
                                SubLObject encapsulated_mt = (SubLObject)hl_transcripts.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)hl_transcripts.$list118);
                                encapsulated_sentence = current_$46.first();
                                current_$46 = current_$46.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)hl_transcripts.$list118);
                                encapsulated_mt = current_$46.first();
                                current_$46 = current_$46.rest();
                                if (hl_transcripts.NIL == current_$46) {
                                    encapsulated_sentence = list_utilities.unquotify(encapsulated_sentence);
                                    encapsulated_mt = list_utilities.unquotify(encapsulated_mt);
                                    write_assertion_removal_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
                                    total_assertions = Numbers.add(total_assertions, (SubLObject)hl_transcripts.ONE_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$45, (SubLObject)hl_transcripts.$list118);
                                }
                            }
                            else {
                                Errors.warn((SubLObject)hl_transcripts.$str120$time_to_implement__S, method);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        iteration.iteration_finalize(op_iterator);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$40, (SubLObject)hl_transcripts.$list111);
            }
        }
        result = (SubLObject)ConsesLow.list(new SubLObject[] { hl_transcripts.$kw121$REMOVED_CONSTANTS, total_constants, hl_transcripts.$kw122$REMOVED_NARTS, total_narts, hl_transcripts.$kw123$REMOVED_ASSERTIONS, total_assertions, hl_transcripts.$kw124$REMOVED_KB_HL_SUPPORTS, total_kb_hl_supports, hl_transcripts.$kw125$REMOVED_DEDUCTIONS, total_deductions });
        result = plist_remove_value(result, (SubLObject)hl_transcripts.ZERO_INTEGER, (SubLObject)hl_transcripts.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21132L)
    public static SubLObject plist_remove_value(final SubLObject plist, final SubLObject value, SubLObject test) {
        if (test == hl_transcripts.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hl_transcripts.EQL);
        }
        return list_utilities.alist_to_plist(Sequences.delete(value, list_utilities.plist_to_alist(plist), test, Symbols.symbol_function((SubLObject)hl_transcripts.$sym126$CDR), (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21316L)
    public static SubLObject save_one_hl_transcript_operation(final SubLObject hl_op, final SubLObject stream) {
        return cfasl.cfasl_output_externalized(hl_op, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21432L)
    public static SubLObject load_one_hl_transcript_operation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        final SubLObject _prev_bind_0 = control_vars.$bootstrapping_kbP$.currentBinding(thread);
        try {
            control_vars.$bootstrapping_kbP$.bind((SubLObject)hl_transcripts.T, thread);
            result = cfasl.cfasl_input(stream, (SubLObject)hl_transcripts.NIL, (SubLObject)hl_transcripts.$kw74$EOF);
        }
        finally {
            control_vars.$bootstrapping_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21679L)
    public static SubLObject process_hl_transcript_operation(final SubLObject hl_op, final SubLObject error_mode, final SubLObject total_ops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)hl_transcripts.NIL;
        if (error_mode.eql((SubLObject)hl_transcripts.$kw127$IGNORE)) {
            SubLObject ignore_errors_tag = (SubLObject)hl_transcripts.NIL;
            try {
                thread.throwStack.push(hl_transcripts.$kw128$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)hl_transcripts.$sym129$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        process_hl_transcript_operation_int(hl_op);
                        success = (SubLObject)hl_transcripts.T;
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)hl_transcripts.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcripts.$kw128$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else if (error_mode.eql((SubLObject)hl_transcripts.$kw71$WARN)) {
            SubLObject error_message = (SubLObject)hl_transcripts.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)hl_transcripts.$sym130$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        process_hl_transcript_operation_int(hl_op);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)hl_transcripts.NIL);
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
            if (hl_transcripts.NIL != error_message) {
                Errors.warn((SubLObject)hl_transcripts.$str131$operation__S___S___A, total_ops, hl_op, error_message);
            }
            else {
                success = (SubLObject)hl_transcripts.T;
            }
        }
        else if (error_mode.eql((SubLObject)hl_transcripts.$kw132$ERROR)) {
            process_hl_transcript_operation_int(hl_op);
            success = (SubLObject)hl_transcripts.T;
        }
        else {
            Errors.error((SubLObject)hl_transcripts.$str133$unexpected_error_mode__S, error_mode);
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 22331L)
    public static SubLObject process_hl_transcript_operation_int(final SubLObject hl_op) {
        SubLObject current;
        final SubLObject datum = current = possibly_transform_hl_op_wrt_compatibility(hl_op);
        SubLObject function_spec = (SubLObject)hl_transcripts.NIL;
        SubLObject args = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list134);
        function_spec = current.first();
        current = (args = current.rest());
        return Functions.apply(function_spec, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 22616L)
    public static SubLObject show_hl_transcript_operation(SubLObject hl_op, final SubLObject stream) {
        hl_op = possibly_transform_hl_op_wrt_compatibility(hl_op);
        print_high.print(hl_op, stream);
        return hl_op;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 22846L)
    public static SubLObject possibly_transform_hl_op_wrt_compatibility(final SubLObject hl_op) {
        SubLObject function_spec = (SubLObject)hl_transcripts.NIL;
        SubLObject args = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(hl_op, hl_op, (SubLObject)hl_transcripts.$list134);
        function_spec = hl_op.first();
        final SubLObject current = args = hl_op.rest();
        final SubLObject pcase_var = function_spec;
        if (pcase_var.eql((SubLObject)hl_transcripts.$sym135$CYC_FIND_OR_CREATE_CANONICAL_NART)) {
            function_spec = (SubLObject)hl_transcripts.$sym136$HLT_FIND_OR_CREATE_NART;
        }
        else if (pcase_var.eql((SubLObject)hl_transcripts.$sym137$CYC_FIND_OR_CREATE)) {
            function_spec = (SubLObject)hl_transcripts.$sym138$HLT_FIND_OR_CREATE;
        }
        else if (pcase_var.eql((SubLObject)hl_transcripts.$sym139$FIND_OR_CREATE_ASSERTION)) {
            function_spec = (SubLObject)hl_transcripts.$sym140$HLT_FIND_OR_CREATE_ASSERTION;
        }
        else if (pcase_var.eql((SubLObject)hl_transcripts.$sym141$FIND_OR_CREATE_KB_HL_SUPPORT)) {
            function_spec = (SubLObject)hl_transcripts.$sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT;
        }
        else {
            if (!pcase_var.eql((SubLObject)hl_transcripts.$sym143$TMS_ADD_DEDUCTION_FOR_ASSERTION)) {
                return hl_op;
            }
            function_spec = (SubLObject)hl_transcripts.$sym144$HLT_FIND_OR_CREATE_DEDUCTION;
        }
        return (SubLObject)ConsesLow.listS(function_spec, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 24440L)
    public static SubLObject hl_transcript_objects_to_compress(final SubLObject modification_spec) {
        final SubLObject object_reference_alist = compressible_references_in_modification_spec(modification_spec, (SubLObject)hl_transcripts.TWO_INTEGER);
        final SubLObject referenced_constants = list_utilities.alist_keys(object_reference_alist);
        final SubLObject objects_to_compress = ConsesLow.append(hl_transcripts.$hl_transcript_common_symbols$.getGlobalValue(), referenced_constants, hl_transcripts.$hl_transcript_el_constants$.getGlobalValue());
        return objects_to_compress;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 24825L)
    public static SubLObject new_objects_between_kb_checkpoints(SubLObject start_checkpoint, SubLObject end_checkpoint) {
        if (start_checkpoint == hl_transcripts.UNPROVIDED) {
            start_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (end_checkpoint == hl_transcripts.UNPROVIDED) {
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
        SubLObject new_constants = (SubLObject)hl_transcripts.NIL;
        SubLObject new_narts = (SubLObject)hl_transcripts.NIL;
        SubLObject new_assertions = (SubLObject)hl_transcripts.NIL;
        SubLObject new_kb_hl_supports = (SubLObject)hl_transcripts.NIL;
        SubLObject new_deductions = (SubLObject)hl_transcripts.NIL;
        SubLObject end_var;
        SubLObject id_var;
        SubLObject constant;
        for (end_var = constant_suid_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = constant_suid_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            constant = constants_high.find_constant_by_internal_id(id_var);
            if (hl_transcripts.NIL != constant_handles.constant_p(constant)) {
                new_constants = (SubLObject)ConsesLow.cons(constant, new_constants);
            }
        }
        SubLObject nart;
        for (end_var = nart_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = nart_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            nart = nart_handles.find_nart_by_id(id_var);
            if (hl_transcripts.NIL != nart_handles.nart_p(nart)) {
                new_narts = (SubLObject)ConsesLow.cons(nart, new_narts);
            }
        }
        SubLObject assertion;
        for (end_var = assertion_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = assertion_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            assertion = assertion_handles.find_assertion_by_id(id_var);
            if (hl_transcripts.NIL != assertion_handles.assertion_p(assertion)) {
                new_assertions = (SubLObject)ConsesLow.cons(assertion, new_assertions);
            }
        }
        SubLObject kb_hl_support;
        for (end_var = kb_hl_support_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = kb_hl_support_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(id_var);
            if (hl_transcripts.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                new_kb_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support, new_kb_hl_supports);
            }
        }
        SubLObject deduction;
        for (end_var = deduction_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = deduction_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
            deduction = deduction_handles.find_deduction_by_id(id_var);
            if (hl_transcripts.NIL != deduction_handles.deduction_p(deduction)) {
                new_deductions = (SubLObject)ConsesLow.cons(deduction, new_deductions);
            }
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { hl_transcripts.$kw91$NEW_CONSTANTS, new_constants, hl_transcripts.$kw92$NEW_NARTS, new_narts, hl_transcripts.$kw93$NEW_ASSERTIONS, new_assertions, hl_transcripts.$kw94$NEW_KB_HL_SUPPORTS, new_kb_hl_supports, hl_transcripts.$kw95$NEW_DEDUCTIONS, new_deductions });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 26634L)
    public static SubLObject gathering_new_kb_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list147);
        result_var = current.first();
        current = current.rest();
        if (hl_transcripts.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject start = (SubLObject)hl_transcripts.$sym148$START;
            return (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start, (SubLObject)hl_transcripts.$list149)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym150$CSETQ, result_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym151$NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS, start)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list147);
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 27047L)
    public static SubLObject gathering_rules_used_in_new_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list152);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rules_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list152);
        rules_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcripts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcripts.NIL;
        SubLObject current_$52 = (SubLObject)hl_transcripts.NIL;
        while (hl_transcripts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list152);
            current_$52 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcripts.$list152);
            if (hl_transcripts.NIL == conses_high.member(current_$52, (SubLObject)hl_transcripts.$list153, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED)) {
                bad = (SubLObject)hl_transcripts.T;
            }
            if (current_$52 == hl_transcripts.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcripts.NIL != bad && hl_transcripts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcripts.$list152);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw154$DIRECTION, current);
        final SubLObject direction = (SubLObject)((hl_transcripts.NIL != direction_tail) ? conses_high.cadr(direction_tail) : hl_transcripts.$kw155$FORWARD);
        final SubLObject body;
        current = (body = temp);
        final SubLObject new_objects = (SubLObject)hl_transcripts.$sym156$NEW_OBJECTS;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)ConsesLow.list(new_objects), (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym157$GATHERING_NEW_KB_OBJECTS, (SubLObject)ConsesLow.list(new_objects), ConsesLow.append(body, (SubLObject)hl_transcripts.NIL)), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym150$CSETQ, rules_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS, new_objects, direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 27585L)
    public static SubLObject gathering_rules_used_in_new_deductions_postprocess(final SubLObject new_objects, final SubLObject direction) {
        final SubLObject new_deductions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw95$NEW_DEDUCTIONS, new_objects);
        final SubLObject new_deductions = (SubLObject)((hl_transcripts.NIL != new_deductions_tail) ? conses_high.cadr(new_deductions_tail) : hl_transcripts.NIL);
        final SubLObject rule_set = set.new_set((SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED);
        SubLObject cdolist_list_var = new_deductions;
        SubLObject deduction = (SubLObject)hl_transcripts.NIL;
        deduction = cdolist_list_var.first();
        while (hl_transcripts.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$53;
            final SubLObject supports = cdolist_list_var_$53 = deductions_high.deduction_supports(deduction);
            SubLObject support = (SubLObject)hl_transcripts.NIL;
            support = cdolist_list_var_$53.first();
            while (hl_transcripts.NIL != cdolist_list_var_$53) {
                if (hl_transcripts.NIL != assertions_high.rule_assertionP(support) && (hl_transcripts.NIL == direction || hl_transcripts.NIL != assertions_high.assertion_has_direction(support, direction))) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 28254L)
    public static SubLObject compressible_references_in_modification_spec(final SubLObject hl_modification_spec, SubLObject minimum) {
        if (minimum == hl_transcripts.UNPROVIDED) {
            minimum = (SubLObject)hl_transcripts.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_checkpoint_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw67$START_CHECKPOINT, hl_modification_spec);
        final SubLObject start_checkpoint = (SubLObject)((hl_transcripts.NIL != start_checkpoint_tail) ? conses_high.cadr(start_checkpoint_tail) : hl_transcripts.NIL);
        final SubLObject end_checkpoint_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw68$END_CHECKPOINT, hl_modification_spec);
        final SubLObject end_checkpoint = (SubLObject)((hl_transcripts.NIL != end_checkpoint_tail) ? conses_high.cadr(end_checkpoint_tail) : hl_transcripts.NIL);
        final SubLObject new_constants_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw91$NEW_CONSTANTS, hl_modification_spec);
        final SubLObject new_constants = (SubLObject)((hl_transcripts.NIL != new_constants_tail) ? conses_high.cadr(new_constants_tail) : hl_transcripts.NIL);
        final SubLObject new_narts_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw92$NEW_NARTS, hl_modification_spec);
        final SubLObject new_narts = (SubLObject)((hl_transcripts.NIL != new_narts_tail) ? conses_high.cadr(new_narts_tail) : hl_transcripts.NIL);
        final SubLObject new_assertions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw93$NEW_ASSERTIONS, hl_modification_spec);
        final SubLObject new_assertions = (SubLObject)((hl_transcripts.NIL != new_assertions_tail) ? conses_high.cadr(new_assertions_tail) : hl_transcripts.NIL);
        final SubLObject new_kb_hl_supports_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw94$NEW_KB_HL_SUPPORTS, hl_modification_spec);
        final SubLObject new_kb_hl_supports = (SubLObject)((hl_transcripts.NIL != new_kb_hl_supports_tail) ? conses_high.cadr(new_kb_hl_supports_tail) : hl_transcripts.NIL);
        final SubLObject new_deductions_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcripts.$kw95$NEW_DEDUCTIONS, hl_modification_spec);
        final SubLObject new_deductions = (SubLObject)((hl_transcripts.NIL != new_deductions_tail) ? conses_high.cadr(new_deductions_tail) : hl_transcripts.NIL);
        final SubLObject kb_checkpointP = (SubLObject)SubLObjectFactory.makeBoolean(hl_transcripts.NIL != start_checkpoint && hl_transcripts.NIL != end_checkpoint);
        SubLObject constant_suid_start = (SubLObject)hl_transcripts.NIL;
        SubLObject nart_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject assertion_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject kb_hl_support_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject deduction_id_start = (SubLObject)hl_transcripts.NIL;
        SubLObject constant_suid_end = (SubLObject)hl_transcripts.NIL;
        SubLObject nart_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject assertion_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject kb_hl_support_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject deduction_id_end = (SubLObject)hl_transcripts.NIL;
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        if (hl_transcripts.NIL != kb_checkpointP) {
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
        final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
        try {
            control_vars.$mapping_target$.bind(Hashtables.make_hash_table((SubLObject)hl_transcripts.$int160$500, Symbols.symbol_function((SubLObject)hl_transcripts.EQUAL), (SubLObject)hl_transcripts.UNPROVIDED), thread);
            if (hl_transcripts.NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject constant;
                for (end_var = constant_suid_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = constant_suid_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    constant = constants_high.find_constant_by_internal_id(id_var);
                    if (hl_transcripts.NIL != constant_handles.constant_p(constant)) {
                        increment_compressible_object_mention_count(constant);
                    }
                }
            }
            SubLObject cdolist_list_var = new_constants;
            SubLObject constant2 = (SubLObject)hl_transcripts.NIL;
            constant2 = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                increment_compressible_object_mention_count(constant2);
                cdolist_list_var = cdolist_list_var.rest();
                constant2 = cdolist_list_var.first();
            }
            if (hl_transcripts.NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject nart;
                for (end_var = nart_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = nart_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    nart = nart_handles.find_nart_by_id(id_var);
                    if (hl_transcripts.NIL != nart_handles.nart_p(nart)) {
                        cycl_utilities.nart_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, nart, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_narts;
            SubLObject nart2 = (SubLObject)hl_transcripts.NIL;
            nart2 = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                cycl_utilities.nart_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, nart2, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                nart2 = cdolist_list_var.first();
            }
            if (hl_transcripts.NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject assertion;
                for (end_var = assertion_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = assertion_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    assertion = assertion_handles.find_assertion_by_id(id_var);
                    if (hl_transcripts.NIL != assertion_handles.assertion_p(assertion)) {
                        cycl_utilities.assertion_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, assertion, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_assertions;
            SubLObject assertion2 = (SubLObject)hl_transcripts.NIL;
            assertion2 = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                cycl_utilities.assertion_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, assertion2, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion2 = cdolist_list_var.first();
            }
            if (hl_transcripts.NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject kb_hl_support;
                for (end_var = kb_hl_support_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = kb_hl_support_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(id_var);
                    if (hl_transcripts.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                        kb_hl_support_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, kb_hl_support, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_kb_hl_supports;
            SubLObject kb_hl_support2 = (SubLObject)hl_transcripts.NIL;
            kb_hl_support2 = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                kb_hl_support_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, kb_hl_support2, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support2 = cdolist_list_var.first();
            }
            if (hl_transcripts.NIL != kb_checkpointP) {
                SubLObject end_var;
                SubLObject id_var;
                SubLObject deduction;
                for (end_var = deduction_id_end, id_var = (SubLObject)hl_transcripts.NIL, id_var = deduction_id_start; !id_var.numGE(end_var); id_var = number_utilities.f_1X(id_var)) {
                    deduction = deduction_handles.find_deduction_by_id(id_var);
                    if (hl_transcripts.NIL != deduction_handles.deduction_p(deduction)) {
                        deduction_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, deduction, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                }
            }
            cdolist_list_var = new_deductions;
            SubLObject deduction2 = (SubLObject)hl_transcripts.NIL;
            deduction2 = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                deduction_map((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, deduction2, (SubLObject)hl_transcripts.T, (SubLObject)hl_transcripts.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                deduction2 = cdolist_list_var.first();
            }
            result = hash_table_utilities.hash_table_to_alist(control_vars.$mapping_target$.getDynamicValue(thread));
        }
        finally {
            control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
        }
        if (minimum.numG((SubLObject)hl_transcripts.ONE_INTEGER)) {
            result = Sequences.delete(minimum, result, Symbols.symbol_function((SubLObject)hl_transcripts.$sym162$_), Symbols.symbol_function((SubLObject)hl_transcripts.$sym126$CDR), (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED);
        }
        result = Sort.sort(result, Symbols.symbol_function((SubLObject)hl_transcripts.$sym162$_), Symbols.symbol_function((SubLObject)hl_transcripts.$sym126$CDR));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 31304L)
    public static SubLObject increment_compressible_object_mention_count(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_transcripts.NIL != constant_handles.constant_p(v_object) || (v_object.isString() && hl_transcripts.NIL != list_utilities.lengthGE(v_object, (SubLObject)hl_transcripts.$int163$32, (SubLObject)hl_transcripts.UNPROVIDED))) {
            Hashtables.sethash(v_object, control_vars.$mapping_target$.getDynamicValue(thread), Numbers.add(Hashtables.gethash_without_values(v_object, control_vars.$mapping_target$.getDynamicValue(thread), (SubLObject)hl_transcripts.ZERO_INTEGER), (SubLObject)hl_transcripts.ONE_INTEGER));
            return (SubLObject)hl_transcripts.T;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 31833L)
    public static SubLObject deduction_map(final SubLObject function, final SubLObject deduction, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == hl_transcripts.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)hl_transcripts.NIL;
        }
        if (key == hl_transcripts.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)hl_transcripts.IDENTITY);
        }
        assert hl_transcripts.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        final SubLObject justification = deductions_high.deduction_supports(deduction);
        expression_map_support(function, supported_object, penetrate_hl_structuresP, key);
        SubLObject cdolist_list_var = justification;
        SubLObject support = (SubLObject)hl_transcripts.NIL;
        support = cdolist_list_var.first();
        while (hl_transcripts.NIL != cdolist_list_var) {
            expression_map_support(function, support, penetrate_hl_structuresP, key);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 32315L)
    public static SubLObject kb_hl_support_map(final SubLObject function, final SubLObject kb_hl_support, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == hl_transcripts.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)hl_transcripts.NIL;
        }
        if (key == hl_transcripts.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)hl_transcripts.IDENTITY);
        }
        assert hl_transcripts.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : kb_hl_support;
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
        expression_map_support(function, hl_support, penetrate_hl_structuresP, key);
        SubLObject cdolist_list_var = justification;
        SubLObject support = (SubLObject)hl_transcripts.NIL;
        support = cdolist_list_var.first();
        while (hl_transcripts.NIL != cdolist_list_var) {
            expression_map_support(function, support, penetrate_hl_structuresP, key);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 32811L)
    public static SubLObject expression_map_support(final SubLObject function, final SubLObject v_object, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == hl_transcripts.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)hl_transcripts.NIL;
        }
        if (key == hl_transcripts.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)hl_transcripts.IDENTITY);
        }
        if (hl_transcripts.NIL != assertion_handles.assertion_p(v_object)) {
            cycl_utilities.assertion_map(function, v_object, penetrate_hl_structuresP, key);
        }
        else if (hl_transcripts.NIL != kb_hl_support_handles.kb_hl_support_p(v_object)) {
            kb_hl_support_map(function, v_object, penetrate_hl_structuresP, key);
        }
        else if (hl_transcripts.NIL != arguments.hl_support_p(v_object)) {
            cycl_utilities.expression_map(function, arguments.support_sentence(v_object), penetrate_hl_structuresP, key);
            cycl_utilities.expression_map(function, arguments.support_mt(v_object), penetrate_hl_structuresP, key);
        }
        else {
            Errors.error((SubLObject)hl_transcripts.$str164$_S_was_not_a_support_p, v_object);
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 33825L)
    public static SubLObject with_hl_transcript_created_constant_equivalence_by_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)hl_transcripts.$list165, ConsesLow.append(body, (SubLObject)hl_transcripts.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 34276L)
    public static SubLObject new_hlt_external_id_equivalence_map() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_transcripts.EQUALP), (SubLObject)hl_transcripts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 34439L)
    public static SubLObject hlt_possibly_find_via_external_id_equivalence(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_transcripts.NIL != map_utilities.map_p(hl_transcripts.$hl_transcript_constant_external_id_equivalence_map$.getDynamicValue(thread))) {
            final SubLObject existing_by_name = fi.fi_find_int(name);
            if (hl_transcripts.NIL != constant_handles.constant_p(existing_by_name)) {
                if (hl_transcripts.NIL == constants_high.constant_has_external_id(existing_by_name, external_id)) {
                    final SubLObject preferred_external_id = constants_high.constant_external_id(existing_by_name);
                    map_utilities.map_put(hl_transcripts.$hl_transcript_constant_external_id_equivalence_map$.getDynamicValue(thread), external_id, preferred_external_id);
                }
                return existing_by_name;
            }
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 34984L)
    public static SubLObject write_constant_to_hl_transcript_stream(final SubLObject constant, final SubLObject stream) {
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject external_id = constants_high.constant_external_id(constant);
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym138$HLT_FIND_OR_CREATE, name, external_id);
        save_one_hl_transcript_operation(hl_operation, stream);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 35333L)
    public static SubLObject hlt_find_or_create(final SubLObject name, SubLObject external_id) {
        if (external_id == hl_transcripts.UNPROVIDED) {
            external_id = (SubLObject)hl_transcripts.NIL;
        }
        SubLObject constant = (SubLObject)((hl_transcripts.NIL != external_id) ? hlt_possibly_find_via_external_id_equivalence(name, external_id) : hl_transcripts.NIL);
        if (hl_transcripts.NIL == constant) {
            constant = fi.fi_create_int(name, external_id);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 35620L)
    public static SubLObject hlt_find_or_create_missing_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == hl_transcripts.UNPROVIDED) {
            external_id = (SubLObject)hl_transcripts.NIL;
        }
        final SubLObject constant = hlt_find_or_create(name, external_id);
        if (hl_transcripts.NIL != constant) {
            Errors.warn((SubLObject)hl_transcripts.$str168$missing_constant_added___S, constant);
            return constant;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 35895L)
    public static SubLObject write_nart_to_hl_transcript_stream(final SubLObject nart, final SubLObject stream) {
        final SubLObject hl_formula = narts_high.nart_hl_formula(nart);
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym136$HLT_FIND_OR_CREATE_NART, hl_formula);
        save_one_hl_transcript_operation(hl_operation, stream);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 36259L)
    public static SubLObject hlt_find_or_create_nart(final SubLObject hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        final SubLObject _prev_bind_0 = control_vars.$bootstrapping_kbP$.currentBinding(thread);
        try {
            control_vars.$bootstrapping_kbP$.bind((SubLObject)hl_transcripts.T, thread);
            result = czer_main.cyc_find_or_create_canonical_nart(hl_formula);
        }
        finally {
            control_vars.$bootstrapping_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 36572L)
    public static SubLObject hlt_find_or_create_missing_nart(final SubLObject canonical_naut) {
        final SubLObject nart = hlt_find_or_create_nart(canonical_naut);
        if (hl_transcripts.NIL != nart) {
            Errors.warn((SubLObject)hl_transcripts.$str169$missing_NART_added___S, nart);
            return nart;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 36810L)
    public static SubLObject write_assertion_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject variable_names = assertions_high.assertion_variable_names(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        final SubLObject truth = assertions_high.assertion_truth(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym140$HLT_FIND_OR_CREATE_ASSERTION, cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        save_one_hl_transcript_operation(hl_operation, stream);
        if (hl_transcripts.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject bookkeeping_info = cyc_bookkeeping.assertion_bookkeeping_info(assertion);
            final SubLObject sentence = (hl_transcripts.NIL != assertions_high.gaf_assertionP(assertion)) ? assertions_high.gaf_el_formula(assertion) : uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject hl_operation_$64 = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym170$HLT_ASSERT, sentence, mt, strength, direction, bookkeeping_info);
            save_one_hl_transcript_operation(hl_operation_$64, stream);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 38034L)
    public static SubLObject hlt_find_or_create_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertion = assertions_high.find_or_create_assertion(cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        final SubLObject new_assertionP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (hl_transcripts.NIL != new_assertionP) {
            tms.tms_handle_after_addings(assertion);
        }
        return Values.values(assertion, new_assertionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 38434L)
    public static SubLObject hlt_find_or_create_missing_gaf(final SubLObject gaf, final SubLObject mt) {
        final SubLObject gaf_assertion = hlt_find_or_create_assertion(clause_utilities.make_gaf_cnf(gaf), mt, (SubLObject)hl_transcripts.NIL, (SubLObject)hl_transcripts.$kw155$FORWARD, (SubLObject)hl_transcripts.$kw171$UNKNOWN, (SubLObject)hl_transcripts.$kw172$DEFAULT, (SubLObject)hl_transcripts.NIL);
        if (hl_transcripts.NIL != gaf_assertion) {
            Errors.warn((SubLObject)hl_transcripts.$str173$missing_gaf_added___S, gaf_assertion);
            return gaf_assertion;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 38771L)
    public static SubLObject hlt_find_or_create_missing_rule(final SubLObject cnf, final SubLObject mt) {
        final SubLObject rule_assertion = hlt_find_or_create_assertion(cnf, mt, (SubLObject)hl_transcripts.NIL, (SubLObject)hl_transcripts.$kw174$BACKWARD, (SubLObject)hl_transcripts.$kw171$UNKNOWN, (SubLObject)hl_transcripts.$kw172$DEFAULT, (SubLObject)hl_transcripts.NIL);
        if (hl_transcripts.NIL != rule_assertion) {
            Errors.warn((SubLObject)hl_transcripts.$str175$missing_rule_added___S, rule_assertion);
            return rule_assertion;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 39100L)
    public static SubLObject hlt_assert(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject bookkeeping_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$kw176$STRENGTH, strength, (SubLObject)hl_transcripts.$kw154$DIRECTION, direction, (SubLObject)hl_transcripts.$kw177$CHECK_WFF_, (SubLObject)hl_transcripts.NIL, (SubLObject)hl_transcripts.$kw178$FORWARD_RULES, (SubLObject)hl_transcripts.NIL);
        SubLObject result = (SubLObject)hl_transcripts.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_transcripts.NIL, thread);
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(bookkeeping_info, thread);
            result = cyc_kernel.cyc_assert(sentence, mt, v_properties);
        }
        finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 39473L)
    public static SubLObject hlt_timestamp_assertion(final SubLObject assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second) {
        if (hl_transcripts.NIL != assertions_high.asserted_assertionP(assertion)) {
            assertions_interface.kb_timestamp_asserted_assertion(assertion, who, when, why, second);
            return assertion;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 39685L)
    public static SubLObject write_kb_hl_support_to_hl_transcript_stream(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        SubLObject cdolist_list_var;
        final SubLObject justification = cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
        SubLObject justification_support = (SubLObject)hl_transcripts.NIL;
        justification_support = cdolist_list_var.first();
        while (hl_transcripts.NIL != cdolist_list_var) {
            if (hl_transcripts.NIL != kb_hl_support_handles.kb_hl_support_p(justification_support) && kb_hl_support_handles.kb_hl_support_id(justification_support).numG(kb_hl_support_handles.kb_hl_support_id(kb_hl_support))) {
                write_kb_hl_support_to_hl_transcript_stream(justification_support, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification_support = cdolist_list_var.first();
        }
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT, hl_support, justification);
        save_one_hl_transcript_operation(hl_operation, stream);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 40553L)
    public static SubLObject hlt_find_or_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        return kb_hl_supports_high.find_or_create_kb_hl_support(hl_support, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 40768L)
    public static SubLObject hlt_find_or_create_missing_kb_hl_support(final SubLObject hl_support) {
        final SubLObject kb_hl_support = kb_hl_supports_high.find_or_possibly_create_kb_hl_support(hl_support);
        if (hl_transcripts.NIL != kb_hl_support) {
            Errors.warn((SubLObject)hl_transcripts.$str180$missing_KB_HL_support_added___S, kb_hl_support);
            return kb_hl_support;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 41033L)
    public static SubLObject write_deduction_to_hl_transcript_stream(final SubLObject deduction, final SubLObject stream) {
        final SubLObject assertion = deductions_high.deduction_supported_object(deduction);
        if (hl_transcripts.NIL != assertion_handles.assertion_p(assertion)) {
            SubLObject cdolist_list_var;
            final SubLObject supports = cdolist_list_var = deductions_high.deduction_supports(deduction);
            SubLObject deduction_support = (SubLObject)hl_transcripts.NIL;
            deduction_support = cdolist_list_var.first();
            while (hl_transcripts.NIL != cdolist_list_var) {
                if (hl_transcripts.NIL != assertion_handles.assertion_p(deduction_support) && assertion_handles.assertion_id(deduction_support).numG(assertion_handles.assertion_id(assertion))) {
                    write_assertion_to_hl_transcript_stream(deduction_support, stream);
                }
                cdolist_list_var = cdolist_list_var.rest();
                deduction_support = cdolist_list_var.first();
            }
            final SubLObject truth = deductions_high.deduction_truth(deduction);
            final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym144$HLT_FIND_OR_CREATE_DEDUCTION, assertion, supports, truth);
            save_one_hl_transcript_operation(hl_operation, stream);
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 41931L)
    public static SubLObject hlt_find_or_create_deduction(final SubLObject supported_object, final SubLObject supports, final SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == hl_transcripts.UNPROVIDED) {
            v_bindings = (SubLObject)hl_transcripts.NIL;
        }
        if (pragmatic_support_mts == hl_transcripts.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)hl_transcripts.NIL;
        }
        if (hl_transcripts.NIL != assertion_handles.assertion_p(supported_object)) {
            return tms.tms_add_deduction_for_assertion(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 42277L)
    public static SubLObject hlt_find_or_create_missing_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (truth == hl_transcripts.UNPROVIDED) {
            truth = (SubLObject)hl_transcripts.$kw181$TRUE;
        }
        if (v_bindings == hl_transcripts.UNPROVIDED) {
            v_bindings = (SubLObject)hl_transcripts.NIL;
        }
        if (pragmatic_support_mts == hl_transcripts.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)hl_transcripts.NIL;
        }
        final SubLObject deduction = hlt_find_or_create_deduction(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
        if (hl_transcripts.NIL != deduction) {
            Errors.warn((SubLObject)hl_transcripts.$str182$missing_deduction_added___S, deduction);
            return deduction;
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 42631L)
    public static SubLObject write_existing_constant_removal_to_hl_transcript_stream(final SubLObject constant, final SubLObject stream) {
        final SubLObject encapsulated_constant = encapsulation.encapsulate(constant);
        return write_constant_removal_to_hl_transcript_stream(encapsulated_constant, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 42891L)
    public static SubLObject write_constant_removal_to_hl_transcript_stream(final SubLObject encapsulated_constant, final SubLObject stream) {
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym183$HLT_REMOVE_CONSTANT, encapsulated_constant);
        save_one_hl_transcript_operation(hl_operation, stream);
        return encapsulated_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 43176L)
    public static SubLObject hlt_catch_unencapsulation_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject error_var = (SubLObject)hl_transcripts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcripts.$list184);
        error_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym185$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error_var), (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym186$CCATCH, (SubLObject)hl_transcripts.$kw187$UNENCAPSULATION_ERROR, error_var, (SubLObject)ConsesLow.listS((SubLObject)hl_transcripts.$sym9$CLET, (SubLObject)hl_transcripts.$list188, ConsesLow.append(body, (SubLObject)hl_transcripts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 43422L)
    public static SubLObject hlt_remove_constant(final SubLObject encapsulated_constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = (SubLObject)hl_transcripts.NIL;
        SubLObject errorP = (SubLObject)hl_transcripts.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)hl_transcripts.$sym130$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        thread.throwStack.push(hl_transcripts.$kw187$UNENCAPSULATION_ERROR);
                        final SubLObject _prev_bind_0_$65 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding(thread);
                        try {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind((SubLObject)hl_transcripts.T, thread);
                            constant = encapsulation.unencapsulate(encapsulated_constant);
                        }
                        finally {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind(_prev_bind_0_$65, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        errorP = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcripts.$kw187$UNENCAPSULATION_ERROR);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)hl_transcripts.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            errorP = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_transcripts.NIL == errorP && hl_transcripts.NIL != constant_handles.constant_p(constant)) {
            return fi.fi_kill_int(constant);
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 43713L)
    public static SubLObject write_existing_assertion_unassert_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream) {
        final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject encapsulated_sentence = canon_tl.tl_encapsulate(sentence);
        final SubLObject encapsulated_mt = canon_tl.tl_encapsulate(mt);
        return write_assertion_unassert_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 44163L)
    public static SubLObject write_assertion_unassert_to_hl_transcript_stream(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt, final SubLObject stream) {
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym189$HLT_UNASSERT, encapsulated_sentence, encapsulated_mt);
        save_one_hl_transcript_operation(hl_operation, stream);
        return encapsulated_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 44476L)
    public static SubLObject hlt_unassert(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = (SubLObject)hl_transcripts.NIL;
        SubLObject mt = (SubLObject)hl_transcripts.NIL;
        SubLObject errorP = (SubLObject)hl_transcripts.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)hl_transcripts.$sym130$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        thread.throwStack.push(hl_transcripts.$kw187$UNENCAPSULATION_ERROR);
                        final SubLObject _prev_bind_0_$66 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding(thread);
                        try {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind((SubLObject)hl_transcripts.T, thread);
                            sentence = encapsulation.unencapsulate(encapsulated_sentence);
                            mt = encapsulation.unencapsulate(encapsulated_mt);
                        }
                        finally {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind(_prev_bind_0_$66, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        errorP = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcripts.$kw187$UNENCAPSULATION_ERROR);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)hl_transcripts.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            errorP = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_transcripts.NIL == errorP) {
            return fi.fi_unassert_int(sentence, mt);
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 44814L)
    public static SubLObject write_existing_assertion_removal_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream) {
        final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject encapsulated_sentence = canon_tl.tl_encapsulate(sentence);
        final SubLObject encapsulated_mt = canon_tl.tl_encapsulate(mt);
        return write_assertion_removal_to_hl_transcript_stream(encapsulated_sentence, encapsulated_mt, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 45247L)
    public static SubLObject write_assertion_removal_to_hl_transcript_stream(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt, final SubLObject stream) {
        final SubLObject hl_operation = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$sym190$HLT_REMOVE_ASSERTION, encapsulated_sentence, encapsulated_mt);
        save_one_hl_transcript_operation(hl_operation, stream);
        return encapsulated_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 45567L)
    public static SubLObject hlt_remove_assertion(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = (SubLObject)hl_transcripts.NIL;
        SubLObject mt = (SubLObject)hl_transcripts.NIL;
        SubLObject errorP = (SubLObject)hl_transcripts.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)hl_transcripts.$sym130$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        thread.throwStack.push(hl_transcripts.$kw187$UNENCAPSULATION_ERROR);
                        final SubLObject _prev_bind_0_$67 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding(thread);
                        try {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind((SubLObject)hl_transcripts.T, thread);
                            sentence = encapsulation.unencapsulate(encapsulated_sentence);
                            mt = encapsulation.unencapsulate(encapsulated_mt);
                        }
                        finally {
                            encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind(_prev_bind_0_$67, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        errorP = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcripts.$kw187$UNENCAPSULATION_ERROR);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)hl_transcripts.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            errorP = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_transcripts.NIL == errorP) {
            return fi.fi_blast_int(sentence, mt);
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 45906L)
    public static SubLObject new_transcript_file_operations_iterator(final SubLObject transcript_file, SubLObject start, SubLObject end) {
        if (start == hl_transcripts.UNPROVIDED) {
            start = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        if (end == hl_transcripts.UNPROVIDED) {
            end = (SubLObject)hl_transcripts.NIL;
        }
        return iteration.new_file_form_iterator(transcript_file, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 46631L)
    public static SubLObject new_transcript_file_kb_removal_operations_iterator(final SubLObject transcript_file, SubLObject start, SubLObject end) {
        if (start == hl_transcripts.UNPROVIDED) {
            start = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        if (end == hl_transcripts.UNPROVIDED) {
            end = (SubLObject)hl_transcripts.NIL;
        }
        return iteration.new_filter_iterator(new_transcript_file_operations_iterator(transcript_file, start, end), (SubLObject)hl_transcripts.$sym191$KB_REMOVAL_OPERATION_, (SubLObject)hl_transcripts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 46867L)
    public static SubLObject transcript_file_kb_removal_operations(final SubLObject transcript_file, SubLObject start, SubLObject end) {
        if (start == hl_transcripts.UNPROVIDED) {
            start = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        if (end == hl_transcripts.UNPROVIDED) {
            end = (SubLObject)hl_transcripts.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_removal_operations = (SubLObject)hl_transcripts.NIL;
        final SubLObject iterator_var = new_transcript_file_operations_iterator(transcript_file, start, end);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)hl_transcripts.NIL; hl_transcripts.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(hl_transcripts.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject op = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (hl_transcripts.NIL != valid && hl_transcripts.NIL != kb_removal_operationP(op)) {
                kb_removal_operations = (SubLObject)ConsesLow.cons(op, kb_removal_operations);
            }
        }
        return Sequences.nreverse(kb_removal_operations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 47211L)
    public static SubLObject kb_removal_operationP(final SubLObject op) {
        if (hl_transcripts.NIL != list_utilities.proper_list_p(op) && hl_transcripts.NIL != list_utilities.lengthE(op, (SubLObject)hl_transcripts.FOUR_INTEGER, (SubLObject)hl_transcripts.UNPROVIDED)) {
            final SubLObject form = conses_high.fourth(op);
            if (form.isList()) {
                final SubLObject method = form.first();
                return list_utilities.member_eqP(method, (SubLObject)hl_transcripts.$list192);
            }
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 47508L)
    public static SubLObject constants_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == hl_transcripts.UNPROVIDED) {
            protocol = (SubLObject)hl_transcripts.$kw193$CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, (SubLObject)hl_transcripts.$sym194$MISSING_CONSTANT_ID_SET, (SubLObject)hl_transcripts.$sym16$FIND_CONSTANT_BY_INTERNAL_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 47990L)
    public static SubLObject narts_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == hl_transcripts.UNPROVIDED) {
            protocol = (SubLObject)hl_transcripts.$kw193$CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, (SubLObject)hl_transcripts.$sym195$MISSING_NART_ID_SET, (SubLObject)hl_transcripts.$sym25$FIND_NART_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 48262L)
    public static SubLObject assertions_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == hl_transcripts.UNPROVIDED) {
            protocol = (SubLObject)hl_transcripts.$kw193$CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, (SubLObject)hl_transcripts.$sym196$MISSING_ASSERTION_ID_SET, (SubLObject)hl_transcripts.$sym33$FIND_ASSERTION_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 48554L)
    public static SubLObject deductions_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == hl_transcripts.UNPROVIDED) {
            protocol = (SubLObject)hl_transcripts.$kw193$CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, (SubLObject)hl_transcripts.$sym197$MISSING_DEDUCTION_ID_SET, (SubLObject)hl_transcripts.$sym41$FIND_DEDUCTION_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 48888L)
    public static SubLObject kb_hl_supports_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol) {
        if (protocol == hl_transcripts.UNPROVIDED) {
            protocol = (SubLObject)hl_transcripts.$kw193$CFASL;
        }
        return kb_objects_to_remove_wrt_sibling_image_int(remote_machine, remote_port, protocol, (SubLObject)hl_transcripts.$sym198$MISSING_KB_HL_SUPPORT_ID_SET, (SubLObject)hl_transcripts.$sym49$FIND_KB_HL_SUPPORT_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 49173L)
    public static SubLObject kb_objects_to_remove_wrt_sibling_image_int(final SubLObject remote_machine, final SubLObject remote_port, final SubLObject protocol, final SubLObject missing_method, final SubLObject lookup_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_remote_image = remote_image.new_remote_image(remote_machine, remote_port, protocol);
        final SubLObject remote_form = (SubLObject)ConsesLow.list(missing_method);
        SubLObject missing_id_set = (SubLObject)hl_transcripts.NIL;
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        try {
            remote_image.open_remote_image_connection(connection);
            final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
            try {
                remote_image.$current_remote_image_connection$.bind(connection, thread);
                missing_id_set = remote_image.current_remote_image_connection_eval(remote_form);
            }
            finally {
                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                remote_image.close_remote_image_connection(connection);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        final SubLObject missing_ids = Sort.sort(set.set_element_list(missing_id_set), Symbols.symbol_function((SubLObject)hl_transcripts.$sym199$_), (SubLObject)hl_transcripts.UNPROVIDED);
        final SubLObject objects_to_remove = Sequences.delete((SubLObject)hl_transcripts.NIL, Mapping.mapcar(lookup_method, missing_ids), (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED, (SubLObject)hl_transcripts.UNPROVIDED);
        return objects_to_remove;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 49754L)
    public static SubLObject save_catchup_hl_transcript(SubLObject start_op, SubLObject start_checkpoint, SubLObject directory_string) {
        if (start_op == hl_transcripts.UNPROVIDED) {
            start_op = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        if (start_checkpoint == hl_transcripts.UNPROVIDED) {
            start_checkpoint = previous_dump_kb_state_checkpoint();
        }
        if (directory_string == hl_transcripts.UNPROVIDED) {
            directory_string = transcript_utilities.transcript_directory();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_transcripts.NIL != Filesys.directory_p(directory_string) : directory_string;
        if (hl_transcripts.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && hl_transcripts.NIL == file_utilities.directory_writeable_p(directory_string, (SubLObject)hl_transcripts.UNPROVIDED)) {
            Errors.error((SubLObject)hl_transcripts.$str201$Directory__S_is_not_writeable);
        }
        final SubLObject end_op = operation_communication.kb_op_number();
        final SubLObject el_transcript = transcript_utilities.construct_transcript_filename(transcript_utilities.make_master_transcript_filename((SubLObject)hl_transcripts.UNPROVIDED));
        final SubLObject hl_transcript = make_next_cyc_hlt_filename(start_op, end_op, directory_string);
        SubLObject stats = (SubLObject)hl_transcripts.NIL;
        stats = save_hl_transcript_from_modification_spec(hl_transcript, (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$kw106$TRANSCRIPT_FILE, (SubLObject)ConsesLow.list(el_transcript, start_op, end_op), (SubLObject)hl_transcripts.$kw67$START_CHECKPOINT, start_checkpoint, (SubLObject)hl_transcripts.$kw68$END_CHECKPOINT, current_kb_state_checkpoint()));
        return Values.values(hl_transcript, stats);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 50565L)
    public static SubLObject make_next_cyc_hlt_filename(SubLObject start_op, SubLObject end_op, SubLObject directory_string) {
        if (start_op == hl_transcripts.UNPROVIDED) {
            start_op = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        if (end_op == hl_transcripts.UNPROVIDED) {
            end_op = operation_communication.kb_op_number();
        }
        if (directory_string == hl_transcripts.UNPROVIDED) {
            directory_string = transcript_utilities.transcript_directory();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_transcripts.NIL != Filesys.directory_p(directory_string) : directory_string;
        if (hl_transcripts.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && hl_transcripts.NIL == file_utilities.directory_writeable_p(directory_string, (SubLObject)hl_transcripts.UNPROVIDED)) {
            Errors.error((SubLObject)hl_transcripts.$str201$Directory__S_is_not_writeable);
        }
        SubLObject minor_version;
        SubLObject cyc_image_filename;
        SubLObject full_filename;
        for (minor_version = (SubLObject)hl_transcripts.NIL, minor_version = (SubLObject)hl_transcripts.ZERO_INTEGER; minor_version.numL((SubLObject)hl_transcripts.$int202$26); minor_version = Numbers.add(minor_version, (SubLObject)hl_transcripts.ONE_INTEGER)) {
            cyc_image_filename = make_cyc_hlt_filename(start_op, end_op, minor_version);
            full_filename = Sequences.cconcatenate(directory_string, cyc_image_filename);
            if (hl_transcripts.NIL == Filesys.probe_file(full_filename)) {
                return full_filename;
            }
        }
        return (SubLObject)hl_transcripts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 51441L)
    public static SubLObject make_cyc_hlt_filename(SubLObject start_op, SubLObject end_op, SubLObject minor_version) {
        if (start_op == hl_transcripts.UNPROVIDED) {
            start_op = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        if (end_op == hl_transcripts.UNPROVIDED) {
            end_op = operation_communication.kb_op_number();
        }
        if (minor_version == hl_transcripts.UNPROVIDED) {
            minor_version = (SubLObject)hl_transcripts.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_transcripts.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (hl_transcripts.NIL == subl_promotions.non_negative_integer_p(minor_version) || !minor_version.numLE((SubLObject)hl_transcripts.$int203$25))) {
            Errors.error((SubLObject)hl_transcripts.$str204$Minor_version__S_is_not_in_the_ra);
        }
        final SubLObject kb_loaded = control_vars.kb_loaded();
        final SubLObject minor_version_char = Strings.sublisp_char((SubLObject)hl_transcripts.$str205$ABCDEFGHIJKLMNOPQRSTUVWXYZ, minor_version);
        final SubLObject filename = PrintLow.format((SubLObject)hl_transcripts.NIL, (SubLObject)hl_transcripts.$str206$cyc_hlt_kb__A_op__A_to__A__C, new SubLObject[] { kb_loaded, start_op, end_op, minor_version_char });
        final SubLObject extension = (SubLObject)hl_transcripts.$str207$cfasl;
        return Sequences.cconcatenate(filename, new SubLObject[] { hl_transcripts.$str208$_, extension });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 52194L)
    public static SubLObject extract_removals_hl_transcript(final SubLObject input_filename, final SubLObject removals_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_removal_position = (SubLObject)hl_transcripts.$kw209$UNINITIALIZED;
        final SubLObject _prev_bind_0 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcripts.NIL;
            try {
                final SubLObject _prev_bind_0_$68 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcripts.NIL, thread);
                    stream = compatibility.open_binary(input_filename, (SubLObject)hl_transcripts.$kw72$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$68, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcripts.$str70$Unable_to_open__S, input_filename);
                }
                SubLObject in_stream = stream;
                SubLObject stream_$69 = (SubLObject)hl_transcripts.NIL;
                try {
                    final SubLObject _prev_bind_0_$69 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcripts.NIL, thread);
                        stream_$69 = compatibility.open_binary(removals_filename, (SubLObject)hl_transcripts.$kw69$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$69, thread);
                    }
                    if (!stream_$69.isStream()) {
                        Errors.error((SubLObject)hl_transcripts.$str70$Unable_to_open__S, removals_filename);
                    }
                    SubLObject rem_stream = stream_$69;
                    in_stream = file_utilities.enable_file_stream_memory_mapping(in_stream);
                    rem_stream = file_utilities.enable_file_stream_memory_mapping(rem_stream);
                    final SubLObject in_length = streams_high.file_length(in_stream);
                    SubLObject start_position = compatibility.get_file_position(in_stream);
                    SubLObject hl_op = load_one_hl_transcript_operation(in_stream);
                    SubLObject end_position = compatibility.get_file_position(in_stream);
                    final SubLObject _prev_bind_0_$70 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$72 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$73 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcripts.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcripts.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcripts.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble((SubLObject)hl_transcripts.$str210$Extracting_Removals_HL_Transcript);
                            while (hl_transcripts.$kw74$EOF != hl_op) {
                                utilities_macros.note_percent_progress(start_position, in_length);
                                final SubLObject method = hl_op.first();
                                if (hl_transcripts.NIL != hlt_removal_methodP(method)) {
                                    if (first_removal_position == hl_transcripts.$kw209$UNINITIALIZED) {
                                        first_removal_position = start_position;
                                    }
                                    final SubLObject _prev_bind_0_$71 = hl_transcripts.$hl_transcript_compression_enabledP$.currentBinding(thread);
                                    try {
                                        hl_transcripts.$hl_transcript_compression_enabledP$.bind((SubLObject)hl_transcripts.NIL, thread);
                                        save_one_hl_transcript_operation(hl_op, rem_stream);
                                    }
                                    finally {
                                        hl_transcripts.$hl_transcript_compression_enabledP$.rebind(_prev_bind_0_$71, thread);
                                    }
                                }
                                start_position = end_position;
                                hl_op = load_one_hl_transcript_operation(in_stream);
                                end_position = compatibility.get_file_position(in_stream);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$73, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$72, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$70, thread);
                    }
                    save_one_hl_transcript_operation((SubLObject)hl_transcripts.$list90, rem_stream);
                    if (first_removal_position == hl_transcripts.$kw209$UNINITIALIZED) {
                        first_removal_position = in_length;
                    }
                    streams_high.force_output(rem_stream);
                }
                finally {
                    final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream_$69.isStream()) {
                            streams_high.close(stream_$69, (SubLObject)hl_transcripts.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcripts.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcripts.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0, thread);
        }
        final SubLObject rem_length = file_utilities.get_file_length(removals_filename);
        final SubLObject result = (SubLObject)ConsesLow.list((SubLObject)hl_transcripts.$kw211$REMOVALS_START, first_removal_position, (SubLObject)hl_transcripts.$kw212$REMOVALS_LENGTH, rem_length);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 59537L)
    public static SubLObject hlt_removal_methodP(final SubLObject method) {
        return list_utilities.member_eqP(method, hl_transcripts.$hlt_removal_methods$.getGlobalValue());
    }
    
    public static SubLObject declare_hl_transcripts_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "do_constants_by_internal_id", "DO-CONSTANTS-BY-INTERNAL-ID");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "note_constants_by_internal_id_progress", "NOTE-CONSTANTS-BY-INTERNAL-ID-PROGRESS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "do_narts_by_id", "DO-NARTS-BY-ID");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "note_narts_by_id_progress", "NOTE-NARTS-BY-ID-PROGRESS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "do_assertions_by_id", "DO-ASSERTIONS-BY-ID");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "note_assertions_by_id_progress", "NOTE-ASSERTIONS-BY-ID-PROGRESS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "do_deductions_by_id", "DO-DEDUCTIONS-BY-ID");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "note_deductions_by_id_progress", "NOTE-DEDUCTIONS-BY-ID-PROGRESS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "do_kb_hl_supports_by_id", "DO-KB-HL-SUPPORTS-BY-ID");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "note_kb_hl_supports_by_id_progress", "NOTE-KB-HL-SUPPORTS-BY-ID-PROGRESS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "most_recent_constants", "MOST-RECENT-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "most_recent_narts", "MOST-RECENT-NARTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "most_recent_assertions", "MOST-RECENT-ASSERTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "most_recent_deductions", "MOST-RECENT-DEDUCTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "most_recent_kb_hl_supports", "MOST-RECENT-KB-HL-SUPPORTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "most_recent_kb_objects", "MOST-RECENT-KB-OBJECTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "previous_dump_kb_state_checkpoint", "PREVIOUS-DUMP-KB-STATE-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "current_kb_state_checkpoint", "CURRENT-KB-STATE-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "make_kb_state_checkpoint", "MAKE-KB-STATE-CHECKPOINT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "destructure_kb_state_checkpoint", "DESTRUCTURE-KB-STATE-CHECKPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "kb_checkpoint_difference", "KB-CHECKPOINT-DIFFERENCE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_hl_transcript", "SAVE-HL-TRANSCRIPT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_hl_transcript_from_modification_spec", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "load_hl_transcript_new", "LOAD-HL-TRANSCRIPT-NEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "show_hl_transcript", "SHOW-HL-TRANSCRIPT", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "with_hl_transcript_compression", "WITH-HL-TRANSCRIPT-COMPRESSION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_hl_transcript_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_hl_transcript_from_modification_spec_to_stream_int", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC-TO-STREAM-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_hl_transcript_additions_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-ADDITIONS-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_hl_transcript_removals_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-REMOVALS-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "plist_remove_value", "PLIST-REMOVE-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_one_hl_transcript_operation", "SAVE-ONE-HL-TRANSCRIPT-OPERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "load_one_hl_transcript_operation", "LOAD-ONE-HL-TRANSCRIPT-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "process_hl_transcript_operation", "PROCESS-HL-TRANSCRIPT-OPERATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "process_hl_transcript_operation_int", "PROCESS-HL-TRANSCRIPT-OPERATION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "show_hl_transcript_operation", "SHOW-HL-TRANSCRIPT-OPERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "possibly_transform_hl_op_wrt_compatibility", "POSSIBLY-TRANSFORM-HL-OP-WRT-COMPATIBILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hl_transcript_objects_to_compress", "HL-TRANSCRIPT-OBJECTS-TO-COMPRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "new_objects_between_kb_checkpoints", "NEW-OBJECTS-BETWEEN-KB-CHECKPOINTS", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "gathering_new_kb_objects", "GATHERING-NEW-KB-OBJECTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "gathering_rules_used_in_new_deductions", "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "gathering_rules_used_in_new_deductions_postprocess", "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS-POSTPROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "compressible_references_in_modification_spec", "COMPRESSIBLE-REFERENCES-IN-MODIFICATION-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "increment_compressible_object_mention_count", "INCREMENT-COMPRESSIBLE-OBJECT-MENTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "deduction_map", "DEDUCTION-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "kb_hl_support_map", "KB-HL-SUPPORT-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "expression_map_support", "EXPRESSION-MAP-SUPPORT", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "with_hl_transcript_created_constant_equivalence_by_name", "WITH-HL-TRANSCRIPT-CREATED-CONSTANT-EQUIVALENCE-BY-NAME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "new_hlt_external_id_equivalence_map", "NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_possibly_find_via_external_id_equivalence", "HLT-POSSIBLY-FIND-VIA-EXTERNAL-ID-EQUIVALENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_constant_to_hl_transcript_stream", "WRITE-CONSTANT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create", "HLT-FIND-OR-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_missing_constant", "HLT-FIND-OR-CREATE-MISSING-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_nart_to_hl_transcript_stream", "WRITE-NART-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_nart", "HLT-FIND-OR-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_missing_nart", "HLT-FIND-OR-CREATE-MISSING-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_assertion_to_hl_transcript_stream", "WRITE-ASSERTION-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_assertion", "HLT-FIND-OR-CREATE-ASSERTION", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_missing_gaf", "HLT-FIND-OR-CREATE-MISSING-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_missing_rule", "HLT-FIND-OR-CREATE-MISSING-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_assert", "HLT-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_timestamp_assertion", "HLT-TIMESTAMP-ASSERTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_kb_hl_support_to_hl_transcript_stream", "WRITE-KB-HL-SUPPORT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_kb_hl_support", "HLT-FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_missing_kb_hl_support", "HLT-FIND-OR-CREATE-MISSING-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_deduction_to_hl_transcript_stream", "WRITE-DEDUCTION-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_deduction", "HLT-FIND-OR-CREATE-DEDUCTION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_find_or_create_missing_deduction", "HLT-FIND-OR-CREATE-MISSING-DEDUCTION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_existing_constant_removal_to_hl_transcript_stream", "WRITE-EXISTING-CONSTANT-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_constant_removal_to_hl_transcript_stream", "WRITE-CONSTANT-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcripts", "hlt_catch_unencapsulation_errors", "HLT-CATCH-UNENCAPSULATION-ERRORS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_remove_constant", "HLT-REMOVE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_existing_assertion_unassert_to_hl_transcript_stream", "WRITE-EXISTING-ASSERTION-UNASSERT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_assertion_unassert_to_hl_transcript_stream", "WRITE-ASSERTION-UNASSERT-TO-HL-TRANSCRIPT-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_unassert", "HLT-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_existing_assertion_removal_to_hl_transcript_stream", "WRITE-EXISTING-ASSERTION-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "write_assertion_removal_to_hl_transcript_stream", "WRITE-ASSERTION-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_remove_assertion", "HLT-REMOVE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "new_transcript_file_operations_iterator", "NEW-TRANSCRIPT-FILE-OPERATIONS-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "new_transcript_file_kb_removal_operations_iterator", "NEW-TRANSCRIPT-FILE-KB-REMOVAL-OPERATIONS-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "transcript_file_kb_removal_operations", "TRANSCRIPT-FILE-KB-REMOVAL-OPERATIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "kb_removal_operationP", "KB-REMOVAL-OPERATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "constants_to_remove_wrt_sibling_image", "CONSTANTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "narts_to_remove_wrt_sibling_image", "NARTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "assertions_to_remove_wrt_sibling_image", "ASSERTIONS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "deductions_to_remove_wrt_sibling_image", "DEDUCTIONS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "kb_hl_supports_to_remove_wrt_sibling_image", "KB-HL-SUPPORTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "kb_objects_to_remove_wrt_sibling_image_int", "KB-OBJECTS-TO-REMOVE-WRT-SIBLING-IMAGE-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "save_catchup_hl_transcript", "SAVE-CATCHUP-HL-TRANSCRIPT", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "make_next_cyc_hlt_filename", "MAKE-NEXT-CYC-HLT-FILENAME", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "make_cyc_hlt_filename", "MAKE-CYC-HLT-FILENAME", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "extract_removals_hl_transcript", "EXTRACT-REMOVALS-HL-TRANSCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcripts", "hlt_removal_methodP", "HLT-REMOVAL-METHOD?", 1, 0, false);
        return (SubLObject)hl_transcripts.NIL;
    }
    
    public static SubLObject init_hl_transcripts_file() {
        hl_transcripts.$hl_transcript_compression_enabledP$ = SubLFiles.defparameter("*HL-TRANSCRIPT-COMPRESSION-ENABLED?*", (SubLObject)hl_transcripts.T);
        hl_transcripts.$hl_transcript_common_symbols$ = SubLFiles.deflexical("*HL-TRANSCRIPT-COMMON-SYMBOLS*", (SubLObject)hl_transcripts.$list145);
        hl_transcripts.$hl_transcript_el_constants$ = SubLFiles.deflexical("*HL-TRANSCRIPT-EL-CONSTANTS*", (SubLObject)hl_transcripts.$list146);
        hl_transcripts.$hl_transcript_constant_external_id_equivalence_map$ = SubLFiles.defparameter("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", (SubLObject)hl_transcripts.NIL);
        hl_transcripts.$hlt_removal_methods$ = SubLFiles.deflexical("*HLT-REMOVAL-METHODS*", (SubLObject)hl_transcripts.$list213);
        return (SubLObject)hl_transcripts.NIL;
    }
    
    public static SubLObject setup_hl_transcripts_file() {
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS, (SubLObject)hl_transcripts.$sym12$DO_CONSTANTS_BY_INTERNAL_ID);
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym23$NOTE_NARTS_BY_ID_PROGRESS, (SubLObject)hl_transcripts.$sym22$DO_NARTS_BY_ID);
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS, (SubLObject)hl_transcripts.$sym30$DO_ASSERTIONS_BY_ID);
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS, (SubLObject)hl_transcripts.$sym38$DO_DEDUCTIONS_BY_ID);
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS, (SubLObject)hl_transcripts.$sym46$DO_KB_HL_SUPPORTS_BY_ID);
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS, (SubLObject)hl_transcripts.$sym159$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT);
        access_macros.register_macro_helper((SubLObject)hl_transcripts.$sym166$NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP, (SubLObject)hl_transcripts.$sym167$WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym138$HLT_FIND_OR_CREATE);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym136$HLT_FIND_OR_CREATE_NART);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym140$HLT_FIND_OR_CREATE_ASSERTION);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym170$HLT_ASSERT);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym179$HLT_TIMESTAMP_ASSERTION);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym183$HLT_REMOVE_CONSTANT);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym189$HLT_UNASSERT);
        utilities_macros.note_funcall_helper_function((SubLObject)hl_transcripts.$sym190$HLT_REMOVE_ASSERTION);
        return (SubLObject)hl_transcripts.NIL;
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
        me = (SubLFile)new hl_transcripts();
        hl_transcripts.$hl_transcript_compression_enabledP$ = null;
        hl_transcripts.$hl_transcript_common_symbols$ = null;
        hl_transcripts.$hl_transcript_el_constants$ = null;
        hl_transcripts.$hl_transcript_constant_external_id_equivalence_map$ = null;
        hl_transcripts.$hlt_removal_methods$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$START = SubLObjectFactory.makeKeyword("START");
        $kw4$END = SubLObjectFactory.makeKeyword("END");
        $kw5$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym7$PROGRESS_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-VAR");
        $sym8$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $sym9$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym10$_ = SubLObjectFactory.makeSymbol("-");
        $sym11$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym12$DO_CONSTANTS_BY_INTERNAL_ID = SubLObjectFactory.makeSymbol("DO-CONSTANTS-BY-INTERNAL-ID");
        $sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-CONSTANTS-BY-INTERNAL-ID-PROGRESS");
        $sym14$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym15$DO_NUMBERS = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $sym16$FIND_CONSTANT_BY_INTERNAL_ID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $sym17$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym18$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym20$PROGRESS_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-VAR");
        $sym21$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $sym22$DO_NARTS_BY_ID = SubLObjectFactory.makeSymbol("DO-NARTS-BY-ID");
        $sym23$NOTE_NARTS_BY_ID_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-NARTS-BY-ID-PROGRESS");
        $sym24$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym25$FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $sym26$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym28$PROGRESS_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-VAR");
        $sym29$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $sym30$DO_ASSERTIONS_BY_ID = SubLObjectFactory.makeSymbol("DO-ASSERTIONS-BY-ID");
        $sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-ASSERTIONS-BY-ID-PROGRESS");
        $sym32$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym33$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $sym34$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$PROGRESS_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-VAR");
        $sym37$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $sym38$DO_DEDUCTIONS_BY_ID = SubLObjectFactory.makeSymbol("DO-DEDUCTIONS-BY-ID");
        $sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-DEDUCTIONS-BY-ID-PROGRESS");
        $sym40$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym41$FIND_DEDUCTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $sym42$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$PROGRESS_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-VAR");
        $sym45$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $sym46$DO_KB_HL_SUPPORTS_BY_ID = SubLObjectFactory.makeSymbol("DO-KB-HL-SUPPORTS-BY-ID");
        $sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-KB-HL-SUPPORTS-BY-ID-PROGRESS");
        $sym48$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym49$FIND_KB_HL_SUPPORT_BY_ID = SubLObjectFactory.makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");
        $sym50$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $sym51$NEXT_CONSTANT_SUID = SubLObjectFactory.makeSymbol("NEXT-CONSTANT-SUID");
        $sym52$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $sym53$NEXT_NART_ID = SubLObjectFactory.makeSymbol("NEXT-NART-ID");
        $sym54$VALID_NART_ = SubLObjectFactory.makeSymbol("VALID-NART?");
        $sym55$NEXT_ASSERTION_ID = SubLObjectFactory.makeSymbol("NEXT-ASSERTION-ID");
        $sym56$VALID_ASSERTION_ = SubLObjectFactory.makeSymbol("VALID-ASSERTION?");
        $sym57$NEXT_DEDUCTION_ID = SubLObjectFactory.makeSymbol("NEXT-DEDUCTION-ID");
        $sym58$VALID_DEDUCTION_ = SubLObjectFactory.makeSymbol("VALID-DEDUCTION?");
        $sym59$NEXT_KB_HL_SUPPORT_ID = SubLObjectFactory.makeSymbol("NEXT-KB-HL-SUPPORT-ID");
        $sym60$VALID_KB_HL_SUPPORT_ = SubLObjectFactory.makeSymbol("VALID-KB-HL-SUPPORT?");
        $sym61$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw62$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw63$NART = SubLObjectFactory.makeKeyword("NART");
        $kw64$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw65$KB_HL_SUPPORT = SubLObjectFactory.makeKeyword("KB-HL-SUPPORT");
        $kw66$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $kw67$START_CHECKPOINT = SubLObjectFactory.makeKeyword("START-CHECKPOINT");
        $kw68$END_CHECKPOINT = SubLObjectFactory.makeKeyword("END-CHECKPOINT");
        $kw69$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str70$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw71$WARN = SubLObjectFactory.makeKeyword("WARN");
        $kw72$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str73$Loading_HL_Transcript_ = SubLObjectFactory.makeString("Loading HL Transcript ");
        $kw74$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFICATION-SPEC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODIFICATION-SPEC"));
        $kw77$MODIFICATION_SPEC = SubLObjectFactory.makeKeyword("MODIFICATION-SPEC");
        $sym78$MOD_SPEC_VAR = SubLObjectFactory.makeUninternedSymbol("MOD-SPEC-VAR");
        $sym79$OBJECTS_TO_COMPRESS = SubLObjectFactory.makeUninternedSymbol("OBJECTS-TO-COMPRESS");
        $sym80$COMPRESSION_SAMPLE = SubLObjectFactory.makeUninternedSymbol("COMPRESSION-SAMPLE");
        $sym81$COMPRESSION_OPTIONS = SubLObjectFactory.makeUninternedSymbol("COMPRESSION-OPTIONS");
        $sym82$HL_TRANSCRIPT_OBJECTS_TO_COMPRESS = SubLObjectFactory.makeSymbol("HL-TRANSCRIPT-OBJECTS-TO-COMPRESS");
        $sym83$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym84$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw85$EXTERNALIZED_ = SubLObjectFactory.makeKeyword("EXTERNALIZED?");
        $kw86$ANALYZE = SubLObjectFactory.makeKeyword("ANALYZE");
        $sym87$WITH_CFASL_COMPRESSION = SubLObjectFactory.makeSymbol("WITH-CFASL-COMPRESSION");
        $sym88$SAVE_ONE_HL_TRANSCRIPT_OPERATION = SubLObjectFactory.makeSymbol("SAVE-ONE-HL-TRANSCRIPT-OPERATION");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE")));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"));
        $kw91$NEW_CONSTANTS = SubLObjectFactory.makeKeyword("NEW-CONSTANTS");
        $kw92$NEW_NARTS = SubLObjectFactory.makeKeyword("NEW-NARTS");
        $kw93$NEW_ASSERTIONS = SubLObjectFactory.makeKeyword("NEW-ASSERTIONS");
        $kw94$NEW_KB_HL_SUPPORTS = SubLObjectFactory.makeKeyword("NEW-KB-HL-SUPPORTS");
        $kw95$NEW_DEDUCTIONS = SubLObjectFactory.makeKeyword("NEW-DEDUCTIONS");
        $str96$saving_constants = SubLObjectFactory.makeString("saving constants");
        $str97$saving_NARTs = SubLObjectFactory.makeString("saving NARTs");
        $str98$saving_assertions = SubLObjectFactory.makeString("saving assertions");
        $str99$saving_KB_HL_supports = SubLObjectFactory.makeString("saving KB HL supports");
        $str100$saving_deductions = SubLObjectFactory.makeString("saving deductions");
        $kw101$CONSTANTS = SubLObjectFactory.makeKeyword("CONSTANTS");
        $kw102$NARTS = SubLObjectFactory.makeKeyword("NARTS");
        $kw103$ASSERTIONS = SubLObjectFactory.makeKeyword("ASSERTIONS");
        $kw104$KB_HL_SUPPORTS = SubLObjectFactory.makeKeyword("KB-HL-SUPPORTS");
        $kw105$DEDUCTIONS = SubLObjectFactory.makeKeyword("DEDUCTIONS");
        $kw106$TRANSCRIPT_FILE = SubLObjectFactory.makeKeyword("TRANSCRIPT-FILE");
        $kw107$REMOVE_CONSTANTS = SubLObjectFactory.makeKeyword("REMOVE-CONSTANTS");
        $kw108$REMOVE_NARTS = SubLObjectFactory.makeKeyword("REMOVE-NARTS");
        $kw109$REMOVE_ASSERTIONS = SubLObjectFactory.makeKeyword("REMOVE-ASSERTIONS");
        $kw110$REMOVE_DEDUCTIONS = SubLObjectFactory.makeKeyword("REMOVE-DEDUCTIONS");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSCRIPT-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-OP"), (SubLObject)hl_transcripts.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END-OP"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym113$FI_KILL = SubLObjectFactory.makeSymbol("FI-KILL");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENCAPSULATED-CONSTANT"));
        $sym115$FI_MERGE = SubLObjectFactory.makeSymbol("FI-MERGE");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENCAPSULATED-KILL"), (SubLObject)SubLObjectFactory.makeSymbol("ENCAPSULATED-KEEP"));
        $sym117$FI_UNASSERT = SubLObjectFactory.makeSymbol("FI-UNASSERT");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENCAPSULATED-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("ENCAPSULATED-MT"));
        $sym119$FI_BLAST = SubLObjectFactory.makeSymbol("FI-BLAST");
        $str120$time_to_implement__S = SubLObjectFactory.makeString("time to implement ~S");
        $kw121$REMOVED_CONSTANTS = SubLObjectFactory.makeKeyword("REMOVED-CONSTANTS");
        $kw122$REMOVED_NARTS = SubLObjectFactory.makeKeyword("REMOVED-NARTS");
        $kw123$REMOVED_ASSERTIONS = SubLObjectFactory.makeKeyword("REMOVED-ASSERTIONS");
        $kw124$REMOVED_KB_HL_SUPPORTS = SubLObjectFactory.makeKeyword("REMOVED-KB-HL-SUPPORTS");
        $kw125$REMOVED_DEDUCTIONS = SubLObjectFactory.makeKeyword("REMOVED-DEDUCTIONS");
        $sym126$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw127$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw128$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym129$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym130$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str131$operation__S___S___A = SubLObjectFactory.makeString("operation ~S~%~S~%~A");
        $kw132$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str133$unexpected_error_mode__S = SubLObjectFactory.makeString("unexpected error mode ~S");
        $list134 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym135$CYC_FIND_OR_CREATE_CANONICAL_NART = SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE-CANONICAL-NART");
        $sym136$HLT_FIND_OR_CREATE_NART = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-NART");
        $sym137$CYC_FIND_OR_CREATE = SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE");
        $sym138$HLT_FIND_OR_CREATE = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE");
        $sym139$FIND_OR_CREATE_ASSERTION = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-ASSERTION");
        $sym140$HLT_FIND_OR_CREATE_ASSERTION = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-ASSERTION");
        $sym141$FIND_OR_CREATE_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-KB-HL-SUPPORT");
        $sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-KB-HL-SUPPORT");
        $sym143$TMS_ADD_DEDUCTION_FOR_ASSERTION = SubLObjectFactory.makeSymbol("TMS-ADD-DEDUCTION-FOR-ASSERTION");
        $sym144$HLT_FIND_OR_CREATE_DEDUCTION = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-DEDUCTION");
        $list145 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FORWARD"), SubLObjectFactory.makeKeyword("BACKWARD"), SubLObjectFactory.makeKeyword("TRUE"), SubLObjectFactory.makeKeyword("FALSE"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("ASSERTED-TRUE-DEF"), SubLObjectFactory.makeKeyword("ASSERTED-TRUE-MON"), SubLObjectFactory.makeKeyword("HP"), SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE"), SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-NART"), SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-ASSERTION"), SubLObjectFactory.makeSymbol("HLT-ASSERT"), SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-KB-HL-SUPPORT"), SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-DEDUCTION"), SubLObjectFactory.makeSymbol("HLT-REMOVE-CONSTANT"), SubLObjectFactory.makeSymbol("HLT-REMOVE-NART"), SubLObjectFactory.makeSymbol("HLT-UNASSERT"), SubLObjectFactory.makeSymbol("HLT-REMOVE-ASSERTION"), SubLObjectFactory.makeSymbol("HLT-REMOVE-DEDUCTION") });
        $list146 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")));
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym148$START = SubLObjectFactory.makeUninternedSymbol("START");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KB-STATE-CHECKPOINT")));
        $sym150$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym151$NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS = SubLObjectFactory.makeSymbol("NEW-OBJECTS-BETWEEN-KB-CHECKPOINTS");
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"));
        $kw154$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw155$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym156$NEW_OBJECTS = SubLObjectFactory.makeUninternedSymbol("NEW-OBJECTS");
        $sym157$GATHERING_NEW_KB_OBJECTS = SubLObjectFactory.makeSymbol("GATHERING-NEW-KB-OBJECTS");
        $sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS = SubLObjectFactory.makeSymbol("GATHERING-RULES-USED-IN-NEW-DEDUCTIONS-POSTPROCESS");
        $sym159$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS = SubLObjectFactory.makeSymbol("GATHERING-RULES-USED-IN-NEW-DEDUCTIONS");
        $int160$500 = SubLObjectFactory.makeInteger(500);
        $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT = SubLObjectFactory.makeSymbol("INCREMENT-COMPRESSIBLE-OBJECT-MENTION-COUNT");
        $sym162$_ = SubLObjectFactory.makeSymbol(">");
        $int163$32 = SubLObjectFactory.makeInteger(32);
        $str164$_S_was_not_a_support_p = SubLObjectFactory.makeString("~S was not a support-p");
        $list165 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*"), (SubLObject)SubLObjectFactory.makeSymbol("*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*")));
        $sym166$NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP = SubLObjectFactory.makeSymbol("NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP");
        $sym167$WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME = SubLObjectFactory.makeSymbol("WITH-HL-TRANSCRIPT-CREATED-CONSTANT-EQUIVALENCE-BY-NAME");
        $str168$missing_constant_added___S = SubLObjectFactory.makeString("missing constant added: ~S");
        $str169$missing_NART_added___S = SubLObjectFactory.makeString("missing NART added: ~S");
        $sym170$HLT_ASSERT = SubLObjectFactory.makeSymbol("HLT-ASSERT");
        $kw171$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw172$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str173$missing_gaf_added___S = SubLObjectFactory.makeString("missing gaf added: ~S");
        $kw174$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $str175$missing_rule_added___S = SubLObjectFactory.makeString("missing rule added: ~S");
        $kw176$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw177$CHECK_WFF_ = SubLObjectFactory.makeKeyword("CHECK-WFF?");
        $kw178$FORWARD_RULES = SubLObjectFactory.makeKeyword("FORWARD-RULES");
        $sym179$HLT_TIMESTAMP_ASSERTION = SubLObjectFactory.makeSymbol("HLT-TIMESTAMP-ASSERTION");
        $str180$missing_KB_HL_support_added___S = SubLObjectFactory.makeString("missing KB HL support added: ~S");
        $kw181$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str182$missing_deduction_added___S = SubLObjectFactory.makeString("missing deduction added: ~S");
        $sym183$HLT_REMOVE_CONSTANT = SubLObjectFactory.makeSymbol("HLT-REMOVE-CONSTANT");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym185$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym186$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $kw187$UNENCAPSULATION_ERROR = SubLObjectFactory.makeKeyword("UNENCAPSULATION-ERROR");
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*"), (SubLObject)hl_transcripts.T));
        $sym189$HLT_UNASSERT = SubLObjectFactory.makeSymbol("HLT-UNASSERT");
        $sym190$HLT_REMOVE_ASSERTION = SubLObjectFactory.makeSymbol("HLT-REMOVE-ASSERTION");
        $sym191$KB_REMOVAL_OPERATION_ = SubLObjectFactory.makeSymbol("KB-REMOVAL-OPERATION?");
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-KILL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("FI-MERGE"));
        $kw193$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $sym194$MISSING_CONSTANT_ID_SET = SubLObjectFactory.makeSymbol("MISSING-CONSTANT-ID-SET");
        $sym195$MISSING_NART_ID_SET = SubLObjectFactory.makeSymbol("MISSING-NART-ID-SET");
        $sym196$MISSING_ASSERTION_ID_SET = SubLObjectFactory.makeSymbol("MISSING-ASSERTION-ID-SET");
        $sym197$MISSING_DEDUCTION_ID_SET = SubLObjectFactory.makeSymbol("MISSING-DEDUCTION-ID-SET");
        $sym198$MISSING_KB_HL_SUPPORT_ID_SET = SubLObjectFactory.makeSymbol("MISSING-KB-HL-SUPPORT-ID-SET");
        $sym199$_ = SubLObjectFactory.makeSymbol("<");
        $sym200$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str201$Directory__S_is_not_writeable = SubLObjectFactory.makeString("Directory ~S is not writeable");
        $int202$26 = SubLObjectFactory.makeInteger(26);
        $int203$25 = SubLObjectFactory.makeInteger(25);
        $str204$Minor_version__S_is_not_in_the_ra = SubLObjectFactory.makeString("Minor-version ~S is not in the range 0 - 25.");
        $str205$ABCDEFGHIJKLMNOPQRSTUVWXYZ = SubLObjectFactory.makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        $str206$cyc_hlt_kb__A_op__A_to__A__C = SubLObjectFactory.makeString("cyc-hlt-kb-~A-op-~A-to-~A-~C");
        $str207$cfasl = SubLObjectFactory.makeString("cfasl");
        $str208$_ = SubLObjectFactory.makeString(".");
        $kw209$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str210$Extracting_Removals_HL_Transcript = SubLObjectFactory.makeString("Extracting Removals HL Transcript");
        $kw211$REMOVALS_START = SubLObjectFactory.makeKeyword("REMOVALS-START");
        $kw212$REMOVALS_LENGTH = SubLObjectFactory.makeKeyword("REMOVALS-LENGTH");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLT-REMOVE-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("HLT-REMOVE-NART"), (SubLObject)SubLObjectFactory.makeSymbol("HLT-UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("HLT-REMOVE-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("HLT-REMOVE-DEDUCTION"));
    }
}

/*

	Total time: 2524 ms
	
*/